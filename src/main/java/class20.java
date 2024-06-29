import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GBBCHPEB")
public class class20 implements Runnable {

    @OriginalMember(owner = "client!GBBCHPEB", name = "a", descriptor = "Z")
    private boolean field915 = false;

    @OriginalMember(owner = "client!GBBCHPEB", name = "e", descriptor = "Z")
    private boolean field919 = false;

    @OriginalMember(owner = "client!GBBCHPEB", name = "j", descriptor = "Z")
    private boolean field924 = false;

    @OriginalMember(owner = "client!GBBCHPEB", name = "k", descriptor = "Z")
    private boolean field925 = false;

    @OriginalMember(owner = "client!GBBCHPEB", name = "f", descriptor = "LEBSHSFRY;")
    public class13 field920;

    @OriginalMember(owner = "client!GBBCHPEB", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field918;

    @OriginalMember(owner = "client!GBBCHPEB", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field916;

    @OriginalMember(owner = "client!GBBCHPEB", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field917;

    @OriginalMember(owner = "client!GBBCHPEB", name = "h", descriptor = "I")
    private int field922;

    @OriginalMember(owner = "client!GBBCHPEB", name = "i", descriptor = "I")
    private int field923;

    @OriginalMember(owner = "client!GBBCHPEB", name = "g", descriptor = "[B")
    private byte[] field921;

    @OriginalMember(owner = "client!GBBCHPEB", name = "<init>", descriptor = "(BLEBSHSFRY;Ljava/net/Socket;)V")
    public class20(byte arg0, class13 arg1, Socket arg2) throws IOException {
        this.field920 = arg1;
        this.field918 = arg2;
        this.field918.setSoTimeout(30000);
        this.field918.setTcpNoDelay(true);
        this.field916 = this.field918.getInputStream();
        this.field917 = this.field918.getOutputStream();
        if (arg0 != -87) {
            this.field915 = !this.field915;
        }
    }

    @OriginalMember(owner = "client!GBBCHPEB", name = "a", descriptor = "()V")
    public void method278() {
        this.field919 = true;
        try {
            if (this.field916 != null) {
                this.field916.close();
            }
            if (this.field917 != null) {
                this.field917.close();
            }
            if (this.field918 != null) {
                this.field918.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field924 = false;
        synchronized (this) {
            this.notify();
        }
        this.field921 = null;
    }

    @OriginalMember(owner = "client!GBBCHPEB", name = "b", descriptor = "()I")
    public int method279() throws IOException {
        return this.field919 ? 0 : this.field916.read();
    }

    @OriginalMember(owner = "client!GBBCHPEB", name = "c", descriptor = "()I")
    public int method280() throws IOException {
        return this.field919 ? 0 : this.field916.available();
    }

    @OriginalMember(owner = "client!GBBCHPEB", name = "a", descriptor = "([BII)V")
    public void method281(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field919) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field916.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "client!GBBCHPEB", name = "a", descriptor = "(IZ[BI)V")
    public void method282(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field919) {
            return;
        }
        if (this.field925) {
            this.field925 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field921 == null) {
            this.field921 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field921[this.field923] = arg2[arg0 + var6];
                this.field923 = (this.field923 + 1) % 5000;
                if ((this.field922 + 4900) % 5000 == this.field923) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field924) {
                this.field924 = true;
                this.field920.method58(this, 3);
            }
            this.notify();
        }
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!GBBCHPEB", name = "run", descriptor = "()V")
    public void run() {
        while (this.field924) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field923 == this.field922) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field924) {
                    return;
                }
                var2 = this.field922;
                if (this.field923 >= this.field922) {
                    var3 = this.field923 - this.field922;
                } else {
                    var3 = 5000 - this.field922;
                }
            }
            if (var3 > 0) {
                try {
                    this.field917.write(this.field921, var2, var3);
                } catch (IOException var7) {
                    this.field925 = true;
                }
                this.field922 = (this.field922 + var3) % 5000;
                try {
                    if (this.field923 == this.field922) {
                        this.field917.flush();
                    }
                } catch (IOException var6) {
                    this.field925 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!GBBCHPEB", name = "a", descriptor = "(Z)V")
    public void method283(boolean arg0) {
        System.out.println("dummy:" + this.field919);
        System.out.println("tcycl:" + this.field922);
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        System.out.println("tnum:" + this.field923);
        System.out.println("writer:" + this.field924);
        System.out.println("ioerror:" + this.field925);
        try {
            System.out.println("available:" + this.method280());
        } catch (IOException var3) {
        }
    }
}
