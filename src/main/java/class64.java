import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YVLAOVKQ")
public class class64 implements Runnable {

    @OriginalMember(owner = "YVLAOVKQ", name = "a", descriptor = "Z")
    private boolean field1660 = true;

    @OriginalMember(owner = "YVLAOVKQ", name = "b", descriptor = "I")
    private int field1661 = 6;

    @OriginalMember(owner = "YVLAOVKQ", name = "f", descriptor = "Z")
    private boolean field1665 = false;

    @OriginalMember(owner = "YVLAOVKQ", name = "k", descriptor = "Z")
    private boolean field1670 = false;

    @OriginalMember(owner = "YVLAOVKQ", name = "l", descriptor = "Z")
    private boolean field1671 = false;

    @OriginalMember(owner = "YVLAOVKQ", name = "g", descriptor = "LCMOCHGYM;")
    public class3 field1666;

    @OriginalMember(owner = "YVLAOVKQ", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field1664;

    @OriginalMember(owner = "YVLAOVKQ", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field1662;

    @OriginalMember(owner = "YVLAOVKQ", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1663;

    @OriginalMember(owner = "YVLAOVKQ", name = "i", descriptor = "I")
    private int field1668;

    @OriginalMember(owner = "YVLAOVKQ", name = "j", descriptor = "I")
    private int field1669;

    @OriginalMember(owner = "YVLAOVKQ", name = "h", descriptor = "[B")
    private byte[] field1667;

    @OriginalMember(owner = "YVLAOVKQ", name = "<init>", descriptor = "(LCMOCHGYM;ILjava/net/Socket;)V")
    public class64(class3 arg0, int arg1, Socket arg2) throws IOException {
        this.field1666 = arg0;
        this.field1664 = arg2;
        this.field1664.setSoTimeout(30000);
        this.field1664.setTcpNoDelay(true);
        if (arg1 != 0) {
            this.field1660 = !this.field1660;
        }
        this.field1662 = this.field1664.getInputStream();
        this.field1663 = this.field1664.getOutputStream();
    }

    @OriginalMember(owner = "YVLAOVKQ", name = "a", descriptor = "()V")
    public void method578() {
        this.field1665 = true;
        try {
            if (this.field1662 != null) {
                this.field1662.close();
            }
            if (this.field1663 != null) {
                this.field1663.close();
            }
            if (this.field1664 != null) {
                this.field1664.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1670 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1667 = null;
    }

    @OriginalMember(owner = "YVLAOVKQ", name = "b", descriptor = "()I")
    public int method579() throws IOException {
        return this.field1665 ? 0 : this.field1662.read();
    }

    @OriginalMember(owner = "YVLAOVKQ", name = "c", descriptor = "()I")
    public int method580() throws IOException {
        return this.field1665 ? 0 : this.field1662.available();
    }

    @OriginalMember(owner = "YVLAOVKQ", name = "a", descriptor = "([BII)V")
    public void method581(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1665) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1662.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "YVLAOVKQ", name = "a", descriptor = "([BIII)V")
    public void method582(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (this.field1665) {
            return;
        }
        if (this.field1671) {
            this.field1671 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1667 == null) {
            this.field1667 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field1667[this.field1669] = arg0[arg3 + var6];
                this.field1669 = (this.field1669 + 1) % 5000;
                if ((this.field1668 + 4900) % 5000 == this.field1669) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1670) {
                this.field1670 = true;
                this.field1666.method74(this, 3);
            }
            this.notify();
        }
        if (arg2 == 29470) {
            ;
        }
    }

    @OriginalMember(owner = "YVLAOVKQ", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1670) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1669 == this.field1668) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1670) {
                    return;
                }
                var2 = this.field1668;
                if (this.field1669 >= this.field1668) {
                    var3 = this.field1669 - this.field1668;
                } else {
                    var3 = 5000 - this.field1668;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1663.write(this.field1667, var2, var3);
                } catch (IOException var7) {
                    this.field1671 = true;
                }
                this.field1668 = (this.field1668 + var3) % 5000;
                try {
                    if (this.field1669 == this.field1668) {
                        this.field1663.flush();
                    }
                } catch (IOException var6) {
                    this.field1671 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "YVLAOVKQ", name = "a", descriptor = "(Z)V")
    public void method583(boolean arg0) {
        System.out.println("dummy:" + this.field1665);
        System.out.println("tcycl:" + this.field1668);
        if (!arg0) {
            return;
        }
        System.out.println("tnum:" + this.field1669);
        System.out.println("writer:" + this.field1670);
        System.out.println("ioerror:" + this.field1671);
        try {
            System.out.println("available:" + this.method580());
        } catch (IOException var2) {
        }
    }
}
