import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("e")
public class ClientStream implements Runnable {

    @OriginalMember(owner = "e", name = "e", descriptor = "Z")
    private boolean field141 = false;

    @OriginalMember(owner = "e", name = "j", descriptor = "Z")
    private boolean field146 = false;

    @OriginalMember(owner = "e", name = "k", descriptor = "Z")
    private boolean field147 = false;

    @OriginalMember(owner = "e", name = "f", descriptor = "La;")
    public GameShell field142;

    @OriginalMember(owner = "e", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field140;

    @OriginalMember(owner = "e", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field138;

    @OriginalMember(owner = "e", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field139;

    @OriginalMember(owner = "e", name = "a", descriptor = "I")
    private int field137;

    @OriginalMember(owner = "e", name = "h", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "e", name = "i", descriptor = "I")
    private int field145;

    @OriginalMember(owner = "e", name = "g", descriptor = "[B")
    private byte[] field143;

    @OriginalMember(owner = "e", name = "<init>", descriptor = "(BLa;Ljava/net/Socket;)V")
    public ClientStream(byte arg0, GameShell arg1, Socket arg2) throws IOException {
        this.field142 = arg1;
        if (arg0 != -9) {
            throw new NullPointerException();
        }
        this.field140 = arg2;
        this.field140.setSoTimeout(30000);
        this.field140.setTcpNoDelay(true);
        this.field138 = this.field140.getInputStream();
        this.field139 = this.field140.getOutputStream();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "()V")
    public void method38() {
        this.field141 = true;
        try {
            if (this.field138 != null) {
                this.field138.close();
            }
            if (this.field139 != null) {
                this.field139.close();
            }
            if (this.field140 != null) {
                this.field140.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field146 = false;
        synchronized (this) {
            this.notify();
        }
        this.field143 = null;
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "()I")
    public int method39() throws IOException {
        return this.field141 ? 0 : this.field138.read();
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "()I")
    public int method40() throws IOException {
        return this.field141 ? 0 : this.field138.available();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "([BII)V")
    public void method41(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field141) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field138.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(II[BI)V")
    public void method42(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field141) {
            return;
        }
        if (this.field147) {
            this.field147 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field143 == null) {
            this.field143 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            while (true) {
                if (var6 >= arg0) {
                    if (!this.field146) {
                        this.field146 = true;
                        this.field142.method12(this, 3);
                    }
                    this.notify();
                    break;
                }
                this.field143[this.field145] = arg2[arg1 + var6];
                this.field145 = (this.field145 + 1) % 5000;
                if ((this.field144 + 4900) % 5000 == this.field145) {
                    throw new IOException("buffer overflow");
                }
                var6++;
            }
        }
        int var7 = 10 / arg3;
    }

    @OriginalMember(owner = "e", name = "run", descriptor = "()V")
    public void run() {
        while (this.field146) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field145 == this.field144) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field146) {
                    return;
                }
                var2 = this.field144;
                if (this.field145 >= this.field144) {
                    var3 = this.field145 - this.field144;
                } else {
                    var3 = 5000 - this.field144;
                }
            }
            if (var3 > 0) {
                try {
                    this.field139.write(this.field143, var2, var3);
                } catch (IOException var7) {
                    this.field147 = true;
                }
                this.field144 = (this.field144 + var3) % 5000;
                try {
                    if (this.field145 == this.field144) {
                        this.field139.flush();
                    }
                } catch (IOException var6) {
                    this.field147 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(I)V")
    public void method43(int arg0) {
        System.out.println("dummy:" + this.field141);
        System.out.println("tcycl:" + this.field144);
        System.out.println("tnum:" + this.field145);
        System.out.println("writer:" + this.field146);
        if (arg0 >= 0) {
            this.field137 = 252;
        }
        System.out.println("ioerror:" + this.field147);
        try {
            System.out.println("available:" + this.method40());
        } catch (IOException var2) {
        }
    }
}
