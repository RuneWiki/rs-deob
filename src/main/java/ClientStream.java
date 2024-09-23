import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("e")
public class ClientStream implements Runnable {

    @OriginalMember(owner = "e", name = "a", descriptor = "B")
    private byte field132 = -14;

    @OriginalMember(owner = "e", name = "b", descriptor = "I")
    private int field133 = 8;

    @OriginalMember(owner = "e", name = "f", descriptor = "Z")
    private boolean field137 = false;

    @OriginalMember(owner = "e", name = "k", descriptor = "Z")
    private boolean field142 = false;

    @OriginalMember(owner = "e", name = "l", descriptor = "Z")
    private boolean field143 = false;

    @OriginalMember(owner = "e", name = "g", descriptor = "La;")
    public GameShell field138;

    @OriginalMember(owner = "e", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field136;

    @OriginalMember(owner = "e", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field134;

    @OriginalMember(owner = "e", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field135;

    @OriginalMember(owner = "e", name = "i", descriptor = "I")
    private int field140;

    @OriginalMember(owner = "e", name = "j", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "e", name = "h", descriptor = "[B")
    private byte[] field139;

    @OriginalMember(owner = "e", name = "<init>", descriptor = "(La;Ljava/net/Socket;B)V")
    public ClientStream(GameShell arg0, Socket arg1, byte arg2) throws IOException {
        if (this.field132 != arg2) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field138 = arg0;
        this.field136 = arg1;
        this.field136.setSoTimeout(30000);
        this.field136.setTcpNoDelay(true);
        this.field134 = this.field136.getInputStream();
        this.field135 = this.field136.getOutputStream();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "()V")
    public void method38() {
        this.field137 = true;
        try {
            if (this.field134 != null) {
                this.field134.close();
            }
            if (this.field135 != null) {
                this.field135.close();
            }
            if (this.field136 != null) {
                this.field136.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field142 = false;
        synchronized (this) {
            this.notify();
        }
        this.field139 = null;
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "()I")
    public int method39() throws IOException {
        return this.field137 ? 0 : this.field134.read();
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "()I")
    public int method40() throws IOException {
        return this.field137 ? 0 : this.field134.available();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "([BII)V")
    public void method41(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field137) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field134.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(I[BII)V")
    public void method42(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (this.field137) {
            return;
        }
        if (this.field143) {
            this.field143 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field139 == null) {
            this.field139 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            while (true) {
                if (var6 >= arg3) {
                    if (!this.field142) {
                        this.field142 = true;
                        this.field138.method12(this, 3);
                    }
                    this.notify();
                    break;
                }
                this.field139[this.field141] = arg1[arg0 + var6];
                this.field141 = (this.field141 + 1) % 5000;
                if ((this.field140 + 4900) % 5000 == this.field141) {
                    throw new IOException("buffer overflow");
                }
                var6++;
            }
        }
        int var7 = 2 / arg2;
    }

    @OriginalMember(owner = "e", name = "run", descriptor = "()V")
    public void run() {
        while (this.field142) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field141 == this.field140) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field142) {
                    return;
                }
                var2 = this.field140;
                if (this.field141 >= this.field140) {
                    var3 = this.field141 - this.field140;
                } else {
                    var3 = 5000 - this.field140;
                }
            }
            if (var3 > 0) {
                try {
                    this.field135.write(this.field139, var2, var3);
                } catch (IOException var7) {
                    this.field143 = true;
                }
                this.field140 = (this.field140 + var3) % 5000;
                try {
                    if (this.field141 == this.field140) {
                        this.field135.flush();
                    }
                } catch (IOException var6) {
                    this.field143 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(B)V")
    public void method43(byte arg0) {
        System.out.println("dummy:" + this.field137);
        if (arg0 != 2) {
            this.field133 = 384;
        }
        System.out.println("tcycl:" + this.field140);
        System.out.println("tnum:" + this.field141);
        System.out.println("writer:" + this.field142);
        System.out.println("ioerror:" + this.field143);
        try {
            System.out.println("available:" + this.method40());
        } catch (IOException var2) {
        }
    }
}
