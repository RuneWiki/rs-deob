import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZPYOGBCY")
public class class69 implements Runnable {

    @OriginalMember(owner = "client!ZPYOGBCY", name = "a", descriptor = "Z")
    private boolean field1739 = true;

    @OriginalMember(owner = "client!ZPYOGBCY", name = "e", descriptor = "Z")
    private boolean field1743 = false;

    @OriginalMember(owner = "client!ZPYOGBCY", name = "j", descriptor = "Z")
    private boolean field1748 = false;

    @OriginalMember(owner = "client!ZPYOGBCY", name = "k", descriptor = "Z")
    private boolean field1749 = false;

    @OriginalMember(owner = "client!ZPYOGBCY", name = "f", descriptor = "LSXKUAOFD;")
    public class52 field1744;

    @OriginalMember(owner = "client!ZPYOGBCY", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field1742;

    @OriginalMember(owner = "client!ZPYOGBCY", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field1740;

    @OriginalMember(owner = "client!ZPYOGBCY", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1741;

    @OriginalMember(owner = "client!ZPYOGBCY", name = "h", descriptor = "I")
    private int field1746;

    @OriginalMember(owner = "client!ZPYOGBCY", name = "i", descriptor = "I")
    private int field1747;

    @OriginalMember(owner = "client!ZPYOGBCY", name = "g", descriptor = "[B")
    private byte[] field1745;

    @OriginalMember(owner = "client!ZPYOGBCY", name = "<init>", descriptor = "(Ljava/net/Socket;LSXKUAOFD;Z)V")
    public class69(Socket arg0, class52 arg1, boolean arg2) throws IOException {
        this.field1744 = arg1;
        this.field1742 = arg0;
        this.field1742.setSoTimeout(30000);
        this.field1742.setTcpNoDelay(true);
        if (arg2) {
            this.field1739 = !this.field1739;
        }
        this.field1740 = this.field1742.getInputStream();
        this.field1741 = this.field1742.getOutputStream();
    }

    @OriginalMember(owner = "client!ZPYOGBCY", name = "a", descriptor = "()V")
    public void method586() {
        this.field1743 = true;
        try {
            if (this.field1740 != null) {
                this.field1740.close();
            }
            if (this.field1741 != null) {
                this.field1741.close();
            }
            if (this.field1742 != null) {
                this.field1742.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1748 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1745 = null;
    }

    @OriginalMember(owner = "client!ZPYOGBCY", name = "b", descriptor = "()I")
    public int method587() throws IOException {
        return this.field1743 ? 0 : this.field1740.read();
    }

    @OriginalMember(owner = "client!ZPYOGBCY", name = "c", descriptor = "()I")
    public int method588() throws IOException {
        return this.field1743 ? 0 : this.field1740.available();
    }

    @OriginalMember(owner = "client!ZPYOGBCY", name = "a", descriptor = "([BII)V")
    public void method589(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1743) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1740.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "client!ZPYOGBCY", name = "a", descriptor = "(I[BII)V")
    public void method590(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg2 != 0 || this.field1743) {
            return;
        }
        if (this.field1749) {
            this.field1749 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1745 == null) {
            this.field1745 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field1745[this.field1747] = arg1[arg3 + var6];
                this.field1747 = (this.field1747 + 1) % 5000;
                if ((this.field1746 + 4900) % 5000 == this.field1747) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1748) {
                this.field1748 = true;
                this.field1744.method180(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "client!ZPYOGBCY", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1748) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1747 == this.field1746) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1748) {
                    return;
                }
                var2 = this.field1746;
                if (this.field1747 >= this.field1746) {
                    var3 = this.field1747 - this.field1746;
                } else {
                    var3 = 5000 - this.field1746;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1741.write(this.field1745, var2, var3);
                } catch (IOException var7) {
                    this.field1749 = true;
                }
                this.field1746 = (this.field1746 + var3) % 5000;
                try {
                    if (this.field1747 == this.field1746) {
                        this.field1741.flush();
                    }
                } catch (IOException var6) {
                    this.field1749 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZPYOGBCY", name = "a", descriptor = "(I)V")
    public void method591(int arg0) {
        System.out.println("dummy:" + this.field1743);
        if (arg0 <= 0) {
            return;
        }
        System.out.println("tcycl:" + this.field1746);
        System.out.println("tnum:" + this.field1747);
        System.out.println("writer:" + this.field1748);
        System.out.println("ioerror:" + this.field1749);
        try {
            System.out.println("available:" + this.method588());
        } catch (IOException var2) {
        }
    }
}
