import java.awt.Canvas;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class260 implements Runnable {

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    private int field3569 = 0;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    private int field3578 = 0;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3567;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    private int field3570;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "[B")
    private byte[] field3573;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field3580;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    public static int field3577 = 0;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "Ljava/io/IOException;")
    private IOException field3576;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "Z")
    public static boolean field3579;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "[I")
    public static int[] field3574;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/awt/Canvas;IILfa;)Lr;")
    public static final class165 method1583(Canvas arg0, int arg1, int arg2, class212 arg3) {
        field3571++;
        if (arg1 >= -96) {
            method1586(78);
        }
        return new class506(arg0, arg3, arg2);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
    public final void method1584(byte arg0) {
        if (arg0 == -73) {
            field3568++;
            this.field3567 = new class84();
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)V")
    public final void method1585(byte arg0) {
        if (arg0 <= 14) {
            this.field3580 = null;
        }
        synchronized (this) {
            if (this.field3576 == null) {
                this.field3576 = new IOException("");
            }
            this.notifyAll();
        }
        field3575++;
        try {
            this.field3580.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!ao", name = "run", descriptor = "()V")
    public final void run() {
        field3581++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3576 != null) {
                        return;
                    }
                    if (this.field3569 < this.field3578) {
                        var2 = this.field3569 + this.field3570 - this.field3578;
                    } else {
                        var2 = this.field3569 - this.field3578;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                if (this.field3570 >= this.field3578 + var2) {
                    this.field3567.write(this.field3573, this.field3578, var2);
                } else {
                    int var3 = this.field3570 - this.field3578;
                    this.field3567.write(this.field3573, this.field3578, var3);
                    this.field3567.write(this.field3573, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field3576 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field3578 = (this.field3578 + var2) % this.field3570;
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public static void method1586(int arg0) {
        if (arg0 != 0) {
            field3574 = null;
        }
        field3574 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([BBII)V")
    public final void method1587(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field3572++;
        if (arg2 < 0 || arg3 < 0 || arg0.length < (arg2 + arg3)) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3576 != null) {
                throw new IOException(this.field3576.toString());
            }
            int var6;
            if (this.field3569 < this.field3578) {
                var6 = this.field3578 - this.field3569 - 1;
            } else {
                var6 = this.field3578 + this.field3570 - this.field3569 - 1;
            }
            if (var6 < arg2) {
                throw new IOException("");
            }
            if (this.field3569 + arg2 > this.field3570) {
                int var7 = this.field3570 - this.field3569;
                class252.method1545(arg0, arg3, this.field3573, this.field3569, var7);
                class252.method1545(arg0, arg3 + var7, this.field3573, 0, arg2 - var7);
            } else {
                class252.method1545(arg0, arg3, this.field3573, this.field3569, arg2);
            }
            this.field3569 = (this.field3569 + arg2) % this.field3570;
            this.notifyAll();
        }
        if (arg1 != 35) {
            this.method1585((byte) -92);
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class260(OutputStream arg0, int arg1) {
        this.field3567 = arg0;
        this.field3570 = arg1 + 1;
        this.field3573 = new byte[this.field3570];
        this.field3580 = new Thread(this);
        this.field3580.setDaemon(true);
        this.field3580.start();
    }
}
