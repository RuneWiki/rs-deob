import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UFCPVKNJ")
public class class60 implements Runnable {

    @OriginalMember(owner = "UFCPVKNJ", name = "a", descriptor = "Z")
    private boolean field1539 = true;

    @OriginalMember(owner = "UFCPVKNJ", name = "b", descriptor = "Z")
    private boolean field1540 = false;

    @OriginalMember(owner = "UFCPVKNJ", name = "c", descriptor = "I")
    private int field1541 = 64;

    @OriginalMember(owner = "UFCPVKNJ", name = "g", descriptor = "Z")
    private boolean field1545 = false;

    @OriginalMember(owner = "UFCPVKNJ", name = "l", descriptor = "Z")
    private boolean field1550 = false;

    @OriginalMember(owner = "UFCPVKNJ", name = "m", descriptor = "Z")
    private boolean field1551 = false;

    @OriginalMember(owner = "UFCPVKNJ", name = "h", descriptor = "LKWRIFYWM;")
    public class38 field1546;

    @OriginalMember(owner = "UFCPVKNJ", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field1544;

    @OriginalMember(owner = "UFCPVKNJ", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream field1542;

    @OriginalMember(owner = "UFCPVKNJ", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1543;

    @OriginalMember(owner = "UFCPVKNJ", name = "j", descriptor = "I")
    private int field1548;

    @OriginalMember(owner = "UFCPVKNJ", name = "k", descriptor = "I")
    private int field1549;

    @OriginalMember(owner = "UFCPVKNJ", name = "i", descriptor = "[B")
    private byte[] field1547;

    @OriginalMember(owner = "UFCPVKNJ", name = "<init>", descriptor = "(ILjava/net/Socket;LKWRIFYWM;)V")
    public class60(int arg0, Socket arg1, class38 arg2) throws IOException {
        this.field1546 = arg2;
        this.field1544 = arg1;
        this.field1544.setSoTimeout(30000);
        this.field1544.setTcpNoDelay(true);
        this.field1542 = this.field1544.getInputStream();
        if (arg0 < 5 || arg0 > 5) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1543 = this.field1544.getOutputStream();
    }

    @OriginalMember(owner = "UFCPVKNJ", name = "a", descriptor = "()V")
    public void method543() {
        this.field1545 = true;
        try {
            if (this.field1542 != null) {
                this.field1542.close();
            }
            if (this.field1543 != null) {
                this.field1543.close();
            }
            if (this.field1544 != null) {
                this.field1544.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1550 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1547 = null;
    }

    @OriginalMember(owner = "UFCPVKNJ", name = "b", descriptor = "()I")
    public int method544() throws IOException {
        return this.field1545 ? 0 : this.field1542.read();
    }

    @OriginalMember(owner = "UFCPVKNJ", name = "c", descriptor = "()I")
    public int method545() throws IOException {
        return this.field1545 ? 0 : this.field1542.available();
    }

    @OriginalMember(owner = "UFCPVKNJ", name = "a", descriptor = "([BII)V")
    public void method546(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1545) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1542.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "UFCPVKNJ", name = "a", descriptor = "(B[BII)V")
    public void method547(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 != 120) {
            this.field1539 = !this.field1539;
        }
        if (this.field1545) {
            return;
        }
        if (this.field1551) {
            this.field1551 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1547 == null) {
            this.field1547 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field1547[this.field1549] = arg1[arg3 + var6];
                this.field1549 = (this.field1549 + 1) % 5000;
                if ((this.field1548 + 4900) % 5000 == this.field1549) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1550) {
                this.field1550 = true;
                this.field1546.method51(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "UFCPVKNJ", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1550) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1549 == this.field1548) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1550) {
                    return;
                }
                var2 = this.field1548;
                if (this.field1549 >= this.field1548) {
                    var3 = this.field1549 - this.field1548;
                } else {
                    var3 = 5000 - this.field1548;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1543.write(this.field1547, var2, var3);
                } catch (IOException var7) {
                    this.field1551 = true;
                }
                this.field1548 = (this.field1548 + var3) % 5000;
                try {
                    if (this.field1549 == this.field1548) {
                        this.field1543.flush();
                    }
                } catch (IOException var6) {
                    this.field1551 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "UFCPVKNJ", name = "a", descriptor = "(I)V")
    public void method548(int arg0) {
        if (arg0 <= 0) {
            this.field1540 = !this.field1540;
        }
        System.out.println("dummy:" + this.field1545);
        System.out.println("tcycl:" + this.field1548);
        System.out.println("tnum:" + this.field1549);
        System.out.println("writer:" + this.field1550);
        System.out.println("ioerror:" + this.field1551);
        try {
            System.out.println("available:" + this.method545());
        } catch (IOException var2) {
        }
    }
}
