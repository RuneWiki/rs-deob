import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WMEYNQIL")
public class class62 implements Runnable {

    @OriginalMember(owner = "WMEYNQIL", name = "a", descriptor = "Z")
    private boolean field1425 = false;

    @OriginalMember(owner = "WMEYNQIL", name = "b", descriptor = "I")
    private int field1426 = 696;

    @OriginalMember(owner = "WMEYNQIL", name = "f", descriptor = "Z")
    private boolean field1430 = false;

    @OriginalMember(owner = "WMEYNQIL", name = "k", descriptor = "Z")
    private boolean field1435 = false;

    @OriginalMember(owner = "WMEYNQIL", name = "l", descriptor = "Z")
    private boolean field1436 = false;

    @OriginalMember(owner = "WMEYNQIL", name = "g", descriptor = "LZAMJOSBM;")
    public class71 field1431;

    @OriginalMember(owner = "WMEYNQIL", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field1429;

    @OriginalMember(owner = "WMEYNQIL", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field1427;

    @OriginalMember(owner = "WMEYNQIL", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1428;

    @OriginalMember(owner = "WMEYNQIL", name = "i", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "WMEYNQIL", name = "j", descriptor = "I")
    private int field1434;

    @OriginalMember(owner = "WMEYNQIL", name = "h", descriptor = "[B")
    private byte[] field1432;

    @OriginalMember(owner = "WMEYNQIL", name = "<init>", descriptor = "(Ljava/net/Socket;ILZAMJOSBM;)V")
    public class62(Socket arg0, int arg1, class71 arg2) throws IOException {
        this.field1431 = arg2;
        this.field1429 = arg0;
        this.field1429.setSoTimeout(30000);
        if (arg1 <= 0) {
            this.field1425 = !this.field1425;
        }
        this.field1429.setTcpNoDelay(true);
        this.field1427 = this.field1429.getInputStream();
        this.field1428 = this.field1429.getOutputStream();
    }

    @OriginalMember(owner = "WMEYNQIL", name = "a", descriptor = "()V")
    public void method514() {
        this.field1430 = true;
        try {
            if (this.field1427 != null) {
                this.field1427.close();
            }
            if (this.field1428 != null) {
                this.field1428.close();
            }
            if (this.field1429 != null) {
                this.field1429.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1435 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1432 = null;
    }

    @OriginalMember(owner = "WMEYNQIL", name = "b", descriptor = "()I")
    public int method515() throws IOException {
        return this.field1430 ? 0 : this.field1427.read();
    }

    @OriginalMember(owner = "WMEYNQIL", name = "c", descriptor = "()I")
    public int method516() throws IOException {
        return this.field1430 ? 0 : this.field1427.available();
    }

    @OriginalMember(owner = "WMEYNQIL", name = "a", descriptor = "([BII)V")
    public void method517(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1430) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1427.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "WMEYNQIL", name = "a", descriptor = "([BIII)V")
    public void method518(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        while (arg2 >= 0) {
            this.field1426 = -335;
        }
        if (this.field1430) {
            return;
        }
        if (this.field1436) {
            this.field1436 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1432 == null) {
            this.field1432 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field1432[this.field1434] = arg0[arg1 + var6];
                this.field1434 = (this.field1434 + 1) % 5000;
                if ((this.field1433 + 4900) % 5000 == this.field1434) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1435) {
                this.field1435 = true;
                this.field1431.method97(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "WMEYNQIL", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1435) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1434 == this.field1433) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1435) {
                    return;
                }
                var2 = this.field1433;
                if (this.field1434 >= this.field1433) {
                    var3 = this.field1434 - this.field1433;
                } else {
                    var3 = 5000 - this.field1433;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1428.write(this.field1432, var2, var3);
                } catch (IOException var7) {
                    this.field1436 = true;
                }
                this.field1433 = (this.field1433 + var3) % 5000;
                try {
                    if (this.field1434 == this.field1433) {
                        this.field1428.flush();
                    }
                } catch (IOException var6) {
                    this.field1436 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "WMEYNQIL", name = "a", descriptor = "(I)V")
    public void method519(int arg0) {
        System.out.println("dummy:" + this.field1430);
        System.out.println("tcycl:" + this.field1433);
        System.out.println("tnum:" + this.field1434);
        if (arg0 != 2) {
            return;
        }
        System.out.println("writer:" + this.field1435);
        System.out.println("ioerror:" + this.field1436);
        try {
            System.out.println("available:" + this.method516());
        } catch (IOException var2) {
        }
    }
}
