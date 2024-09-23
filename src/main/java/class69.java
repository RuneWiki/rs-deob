import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YQNDWKQR")
public class class69 implements Runnable {

    @OriginalMember(owner = "YQNDWKQR", name = "a", descriptor = "Z")
    private boolean field1690 = true;

    @OriginalMember(owner = "YQNDWKQR", name = "b", descriptor = "Z")
    private boolean field1691 = false;

    @OriginalMember(owner = "YQNDWKQR", name = "f", descriptor = "Z")
    private boolean field1695 = false;

    @OriginalMember(owner = "YQNDWKQR", name = "k", descriptor = "Z")
    private boolean field1700 = false;

    @OriginalMember(owner = "YQNDWKQR", name = "l", descriptor = "Z")
    private boolean field1701 = false;

    @OriginalMember(owner = "YQNDWKQR", name = "g", descriptor = "LAMZQHNGA;")
    public class1 field1696;

    @OriginalMember(owner = "YQNDWKQR", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field1694;

    @OriginalMember(owner = "YQNDWKQR", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field1692;

    @OriginalMember(owner = "YQNDWKQR", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1693;

    @OriginalMember(owner = "YQNDWKQR", name = "i", descriptor = "I")
    private int field1698;

    @OriginalMember(owner = "YQNDWKQR", name = "j", descriptor = "I")
    private int field1699;

    @OriginalMember(owner = "YQNDWKQR", name = "h", descriptor = "[B")
    private byte[] field1697;

    @OriginalMember(owner = "YQNDWKQR", name = "<init>", descriptor = "(ILAMZQHNGA;Ljava/net/Socket;)V")
    public class69(int arg0, class1 arg1, Socket arg2) throws IOException {
        this.field1696 = arg1;
        this.field1694 = arg2;
        if (arg0 != 0) {
            this.field1690 = !this.field1690;
        }
        this.field1694.setSoTimeout(30000);
        this.field1694.setTcpNoDelay(true);
        this.field1692 = this.field1694.getInputStream();
        this.field1693 = this.field1694.getOutputStream();
    }

    @OriginalMember(owner = "YQNDWKQR", name = "a", descriptor = "()V")
    public void method583() {
        this.field1695 = true;
        try {
            if (this.field1692 != null) {
                this.field1692.close();
            }
            if (this.field1693 != null) {
                this.field1693.close();
            }
            if (this.field1694 != null) {
                this.field1694.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1700 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1697 = null;
    }

    @OriginalMember(owner = "YQNDWKQR", name = "b", descriptor = "()I")
    public int method584() throws IOException {
        return this.field1695 ? 0 : this.field1692.read();
    }

    @OriginalMember(owner = "YQNDWKQR", name = "c", descriptor = "()I")
    public int method585() throws IOException {
        return this.field1695 ? 0 : this.field1692.available();
    }

    @OriginalMember(owner = "YQNDWKQR", name = "a", descriptor = "([BII)V")
    public void method586(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1695) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1692.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "YQNDWKQR", name = "a", descriptor = "(I[BII)V")
    public void method587(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 != -39006) {
            this.field1691 = !this.field1691;
        }
        if (this.field1695) {
            return;
        }
        if (this.field1701) {
            this.field1701 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1697 == null) {
            this.field1697 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field1697[this.field1699] = arg1[arg2 + var6];
                this.field1699 = (this.field1699 + 1) % 5000;
                if ((this.field1698 + 4900) % 5000 == this.field1699) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1700) {
                this.field1700 = true;
                this.field1696.method12(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "YQNDWKQR", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1700) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1699 == this.field1698) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1700) {
                    return;
                }
                var2 = this.field1698;
                if (this.field1699 >= this.field1698) {
                    var3 = this.field1699 - this.field1698;
                } else {
                    var3 = 5000 - this.field1698;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1693.write(this.field1697, var2, var3);
                } catch (IOException var7) {
                    this.field1701 = true;
                }
                this.field1698 = (this.field1698 + var3) % 5000;
                try {
                    if (this.field1699 == this.field1698) {
                        this.field1693.flush();
                    }
                } catch (IOException var6) {
                    this.field1701 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "YQNDWKQR", name = "a", descriptor = "(B)V")
    public void method588(byte arg0) {
        System.out.println("dummy:" + this.field1695);
        System.out.println("tcycl:" + this.field1698);
        System.out.println("tnum:" + this.field1699);
        System.out.println("writer:" + this.field1700);
        System.out.println("ioerror:" + this.field1701);
        if (arg0 == -38) {
            try {
                System.out.println("available:" + this.method585());
            } catch (IOException var2) {
            }
        }
    }
}
