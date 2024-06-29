import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class205 implements Runnable {

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Z")
    private boolean field3569 = false;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    private int field3580 = 0;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Z")
    private boolean field3571 = false;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    private int field3582 = 0;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "Ljava/net/Socket;")
    private Socket field3573;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Lkn;")
    private class198 field3567;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "Ljava/io/InputStream;")
    private InputStream field3584;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3591;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Z")
    public static boolean field3563 = false;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Z")
    public static volatile boolean field3568 = false;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "Z")
    public static boolean field3589 = false;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "Ljf;")
    public static class229 field3586 = class212.method1457((byte) 111, "Konfig geladen)3");

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "Ldn;")
    private class231 field3587;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "[B")
    private byte[] field3578;

    @OriginalMember(owner = "client!ea", name = "run", descriptor = "()V", line = 16)
    public final void run() {
        field3583++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field3582 == this.field3580) {
                        if (this.field3571) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    var3 = this.field3580;
                    if (this.field3582 < this.field3580) {
                        var4 = 5000 - this.field3580;
                    } else {
                        var4 = this.field3582 - this.field3580;
                    }
                }
                if (var4 > 0) {
                    try {
                        this.field3591.write(this.field3578, var3, var4);
                    } catch (IOException var12) {
                        this.field3569 = true;
                    }
                    this.field3580 = (this.field3580 + var4) % 5000;
                    try {
                        if (this.field3582 == this.field3580) {
                            this.field3591.flush();
                        }
                    } catch (IOException var11) {
                        this.field3569 = true;
                    }
                }
            }
            try {
                if (this.field3584 != null) {
                    this.field3584.close();
                }
                if (this.field3591 != null) {
                    this.field3591.close();
                }
                if (this.field3573 != null) {
                    this.field3573.close();
                }
            } catch (IOException var10) {
            }
            this.field3578 = null;
        } catch (Exception var15) {
            class201.method1407(1, (String) null, var15);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIII)I", line = 84)
    public static final int method1426(boolean arg0, int arg1, int arg2, int arg3) {
        field3564++;
        class187 var4 = (class187) class278.field4772.method1890((long) arg3, arg1 + 31953);
        if (arg1 != -32072) {
            field3572 = -51;
        }
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field3279.length; var6++) {
            if (var4.field3279[var6] >= 0 && client.field4467 > var4.field3279[var6]) {
                class313 var7 = class113.method799(var4.field3279[var6], (byte) 50);
                if (var7.field5264 != null) {
                    class93 var8 = (class93) var7.field5264.method1890((long) arg2, -120);
                    if (var8 != null) {
                        if (arg0) {
                            var5 += var4.field3281[var6] * var8.field1678;
                        } else {
                            var5 += var8.field1678;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Lwh;", line = 135)
    public static final class10 method1427(int arg0, int arg1) {
        if (arg0 != 5000) {
            method1434(9, 56L);
        }
        field3577++;
        class10 var2 = (class10) class26.field469.method229((long) arg1, -14);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class303.field5149.method1275(class42.method358((byte) 127, arg1), class200.method1403((byte) 95, arg1), -5211);
        class10 var4 = new class10();
        if (var3 != null) {
            var4.method53(false, new class14(var3));
        }
        class26.field469.method227(-25077, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[BI)V", line = 159)
    public final void method1428(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3576++;
        if (this.field3571) {
            return;
        }
        if (this.field3569) {
            this.field3569 = false;
            throw new IOException();
        }
        if (this.field3578 == null) {
            this.field3578 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field3578[this.field3582] = arg2[arg3 + var6];
                this.field3582 = (this.field3582 + 1) % 5000;
                if (((this.field3580 + 4900) % 5000) == this.field3582) {
                    throw new IOException();
                }
            }
            if (arg0 != 22974) {
                method1426(true, 117, 45, -119);
            }
            if (this.field3587 == null) {
                this.field3587 = this.field3567.method1373(this, arg0 - 22970, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 216)
    public final void method1429(byte arg0) throws IOException {
        field3575++;
        if (!this.field3571 && arg0 == -36 && this.field3569) {
            this.field3569 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V", line = 239)
    public static void method1430(byte arg0) {
        field3586 = null;
        int var1 = 12 / ((68 - arg0) / 41);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[BIB)V", line = 248)
    public final void method1431(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field3590++;
        if (this.field3571) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field3584.read(arg1, arg2, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg2 += var5;
        }
        if (arg3 != -92) {
            this.field3571 = true;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Ljava/net/Socket;Lkn;)V", line = 417)
    public class205(Socket arg0, class198 arg1) throws IOException {
        this.field3573 = arg0;
        this.field3567 = arg1;
        this.field3573.setSoTimeout(30000);
        this.field3573.setTcpNoDelay(true);
        this.field3584 = this.field3573.getInputStream();
        this.field3591 = this.field3573.getOutputStream();
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 290)
    public final void method1432(int arg0) {
        field3566++;
        if (this.field3571) {
            return;
        }
        if (arg0 != 20752) {
            this.finalize();
        }
        this.field3584 = new class293();
        this.field3591 = new class271();
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)V", line = 305)
    public final void method1433(byte arg0) {
        field3588++;
        if (this.field3571) {
            return;
        }
        synchronized (this) {
            this.field3571 = true;
            this.notifyAll();
            if (arg0 != -115) {
                this.field3571 = true;
            }
        }
        if (this.field3587 != null) {
            while (this.field3587.field4011 == 0) {
                class235.method1675((byte) -22, 1L);
            }
            if (this.field3587.field4011 == 1) {
                try {
                    ((Thread) this.field3587.field4009).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field3587 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IJ)Ljf;", line = 352)
    public static final class229 method1434(int arg0, long arg1) {
        field3581++;
        return arg0 == 1 ? class81.method576(arg1, false, 48, 10) : (class229) null;
    }

    @OriginalMember(owner = "client!ea", name = "finalize", descriptor = "()V", line = 364)
    protected final void finalize() {
        this.method1433((byte) -115);
        field3585++;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)I", line = 372)
    public final int method1435(int arg0) throws IOException {
        field3570++;
        if (this.field3571) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.field3573 = (Socket) null;
            }
            return this.field3584.read();
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)I", line = 387)
    public final int method1436(int arg0) throws IOException {
        field3592++;
        if (this.field3571) {
            return 0;
        } else {
            if (arg0 != -3616) {
                this.run();
            }
            return this.field3584.available();
        }
    }
}
