import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NTPVSATL")
public class class38 implements Runnable {

    @OriginalMember(owner = "client!NTPVSATL", name = "a", descriptor = "B")
    private byte field1004 = -68;

    @OriginalMember(owner = "client!NTPVSATL", name = "b", descriptor = "Z")
    private boolean field1005 = false;

    @OriginalMember(owner = "client!NTPVSATL", name = "c", descriptor = "I")
    private int field1006 = 866;

    @OriginalMember(owner = "client!NTPVSATL", name = "g", descriptor = "Z")
    private boolean field1010 = false;

    @OriginalMember(owner = "client!NTPVSATL", name = "l", descriptor = "Z")
    private boolean field1015 = false;

    @OriginalMember(owner = "client!NTPVSATL", name = "m", descriptor = "Z")
    private boolean field1016 = false;

    @OriginalMember(owner = "client!NTPVSATL", name = "h", descriptor = "LPKBEYUWN;")
    public class41 field1011;

    @OriginalMember(owner = "client!NTPVSATL", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field1009;

    @OriginalMember(owner = "client!NTPVSATL", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream field1007;

    @OriginalMember(owner = "client!NTPVSATL", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1008;

    @OriginalMember(owner = "client!NTPVSATL", name = "j", descriptor = "I")
    private int field1013;

    @OriginalMember(owner = "client!NTPVSATL", name = "k", descriptor = "I")
    private int field1014;

    @OriginalMember(owner = "client!NTPVSATL", name = "i", descriptor = "[B")
    private byte[] field1012;

    @OriginalMember(owner = "client!NTPVSATL", name = "<init>", descriptor = "(LPKBEYUWN;Ljava/net/Socket;B)V")
    public class38(class41 arg0, Socket arg1, byte arg2) throws IOException {
        this.field1011 = arg0;
        this.field1009 = arg1;
        this.field1009.setSoTimeout(30000);
        this.field1009.setTcpNoDelay(true);
        if (this.field1004 != arg2) {
            this.field1006 = -97;
        }
        this.field1007 = this.field1009.getInputStream();
        this.field1008 = this.field1009.getOutputStream();
    }

    @OriginalMember(owner = "client!NTPVSATL", name = "a", descriptor = "()V")
    public void method368() {
        this.field1010 = true;
        try {
            if (this.field1007 != null) {
                this.field1007.close();
            }
            if (this.field1008 != null) {
                this.field1008.close();
            }
            if (this.field1009 != null) {
                this.field1009.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1015 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1012 = null;
    }

    @OriginalMember(owner = "client!NTPVSATL", name = "b", descriptor = "()I")
    public int method369() throws IOException {
        return this.field1010 ? 0 : this.field1007.read();
    }

    @OriginalMember(owner = "client!NTPVSATL", name = "c", descriptor = "()I")
    public int method370() throws IOException {
        return this.field1010 ? 0 : this.field1007.available();
    }

    @OriginalMember(owner = "client!NTPVSATL", name = "a", descriptor = "([BII)V")
    public void method371(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1010) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1007.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "client!NTPVSATL", name = "a", descriptor = "(I[BII)V")
    public void method372(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg3 >= 0 || this.field1010) {
            return;
        }
        if (this.field1016) {
            this.field1016 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1012 == null) {
            this.field1012 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field1012[this.field1014] = arg1[arg0 + var6];
                this.field1014 = (this.field1014 + 1) % 5000;
                if ((this.field1013 + 4900) % 5000 == this.field1014) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1015) {
                this.field1015 = true;
                this.field1011.method164(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "client!NTPVSATL", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1015) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1014 == this.field1013) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1015) {
                    return;
                }
                var2 = this.field1013;
                if (this.field1014 >= this.field1013) {
                    var3 = this.field1014 - this.field1013;
                } else {
                    var3 = 5000 - this.field1013;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1008.write(this.field1012, var2, var3);
                } catch (IOException var7) {
                    this.field1016 = true;
                }
                this.field1013 = (this.field1013 + var3) % 5000;
                try {
                    if (this.field1014 == this.field1013) {
                        this.field1008.flush();
                    }
                } catch (IOException var6) {
                    this.field1016 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!NTPVSATL", name = "a", descriptor = "(I)V")
    public void method373(int arg0) {
        System.out.println("dummy:" + this.field1010);
        System.out.println("tcycl:" + this.field1013);
        if (arg0 >= 0) {
            return;
        }
        System.out.println("tnum:" + this.field1014);
        System.out.println("writer:" + this.field1015);
        System.out.println("ioerror:" + this.field1016);
        try {
            System.out.println("available:" + this.method370());
        } catch (IOException var2) {
        }
    }
}
