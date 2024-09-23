import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("e")
public class ClientStream implements Runnable {

    @OriginalMember(owner = "e", name = "a", descriptor = "Z")
    private boolean field134 = false;

    @OriginalMember(owner = "e", name = "b", descriptor = "B")
    private byte field135 = -88;

    @OriginalMember(owner = "e", name = "f", descriptor = "Z")
    private boolean field139 = false;

    @OriginalMember(owner = "e", name = "k", descriptor = "Z")
    private boolean field144 = false;

    @OriginalMember(owner = "e", name = "l", descriptor = "Z")
    private boolean field145 = false;

    @OriginalMember(owner = "e", name = "g", descriptor = "La;")
    public GameShell field140;

    @OriginalMember(owner = "e", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field138;

    @OriginalMember(owner = "e", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field136;

    @OriginalMember(owner = "e", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field137;

    @OriginalMember(owner = "e", name = "i", descriptor = "I")
    private int field142;

    @OriginalMember(owner = "e", name = "j", descriptor = "I")
    private int field143;

    @OriginalMember(owner = "e", name = "h", descriptor = "[B")
    private byte[] field141;

    @OriginalMember(owner = "e", name = "<init>", descriptor = "(La;ILjava/net/Socket;)V")
    public ClientStream(GameShell arg0, int arg1, Socket arg2) throws IOException {
        this.field140 = arg0;
        this.field138 = arg2;
        this.field138.setSoTimeout(30000);
        if (arg1 != 8) {
            this.field134 = !this.field134;
        }
        this.field138.setTcpNoDelay(true);
        this.field136 = this.field138.getInputStream();
        this.field137 = this.field138.getOutputStream();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "()V")
    public void method38() {
        this.field139 = true;
        try {
            if (this.field136 != null) {
                this.field136.close();
            }
            if (this.field137 != null) {
                this.field137.close();
            }
            if (this.field138 != null) {
                this.field138.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field144 = false;
        synchronized (this) {
            this.notify();
        }
        this.field141 = null;
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "()I")
    public int method39() throws IOException {
        return this.field139 ? 0 : this.field136.read();
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "()I")
    public int method40() throws IOException {
        return this.field139 ? 0 : this.field136.available();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "([BII)V")
    public void method41(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field139) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field136.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(II[BI)V")
    public void method42(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg3 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (this.field139) {
            return;
        }
        if (this.field145) {
            this.field145 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field141 == null) {
            this.field141 = new byte[5000];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg1; var7++) {
                this.field141[this.field143] = arg2[arg0 + var7];
                this.field143 = (this.field143 + 1) % 5000;
                if ((this.field142 + 4900) % 5000 == this.field143) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field144) {
                this.field144 = true;
                this.field140.method12(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "e", name = "run", descriptor = "()V")
    public void run() {
        while (this.field144) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field143 == this.field142) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field144) {
                    return;
                }
                var2 = this.field142;
                if (this.field143 >= this.field142) {
                    var3 = this.field143 - this.field142;
                } else {
                    var3 = 5000 - this.field142;
                }
            }
            if (var3 > 0) {
                try {
                    this.field137.write(this.field141, var2, var3);
                } catch (IOException var7) {
                    this.field145 = true;
                }
                this.field142 = (this.field142 + var3) % 5000;
                try {
                    if (this.field143 == this.field142) {
                        this.field137.flush();
                    }
                } catch (IOException var6) {
                    this.field145 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(B)V")
    public void method43(byte arg0) {
        System.out.println("dummy:" + this.field139);
        System.out.println("tcycl:" + this.field142);
        if (this.field135 != arg0) {
            return;
        }
        System.out.println("tnum:" + this.field143);
        System.out.println("writer:" + this.field144);
        System.out.println("ioerror:" + this.field145);
        try {
            System.out.println("available:" + this.method40());
        } catch (IOException var2) {
        }
    }
}
