import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class558 implements Runnable {

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Lqk;")
    private class16 field7757 = new class16();

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public int field7758 = 0;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "Z")
    private boolean field7759 = false;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field7762;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field7756 = 0;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "[I")
    public static int[] field7766 = new int[5];

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field7755;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field7760;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILme;)V", line = 9)
    private final void method3215(int arg0, class197 arg1) {
        class16 var3 = this.field7757;
        synchronized (this.field7757) {
            this.field7757.method116(arg1, 1);
            this.field7758++;
            this.field7757.notifyAll();
        }
        field7763++;
        int var4 = -36 / ((arg0 + 17) / 36);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V", line = 23)
    public final void method3216(byte arg0) {
        field7761++;
        this.field7759 = true;
        class16 var2 = this.field7757;
        synchronized (this.field7757) {
            this.field7757.notifyAll();
            if (arg0 < 6) {
                this.method3216((byte) -76);
            }
        }
        try {
            this.field7762.join();
        } catch (InterruptedException var3) {
        }
        this.field7762 = null;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lqg;)V", line = 57)
    public class558(class465 arg0) {
        class181 var2 = arg0.method2643(5, this, (byte) 82);
        while (var2.field2538 == 0) {
            class149.method1052(10L, true);
        }
        if (var2.field2538 == 2) {
            throw new RuntimeException();
        }
        this.field7762 = (Thread) var2.field2540;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILuj;)Lme;", line = 80)
    public final class197 method3217(int arg0, int arg1, class387 arg2) {
        field7764++;
        class197 var4 = new class197();
        var4.field2691 = 1;
        class16 var5 = this.field7757;
        synchronized (this.field7757) {
            class197 var6 = (class197) this.field7757.method118(-30553);
            while (true) {
                if (var6 == null) {
                    if (arg0 < 98) {
                        this.method3219(null, -101, -128);
                    }
                    break;
                }
                if (((long) arg1) == var6.field8924 && var6.field2683 == arg2 && var6.field2691 == 2) {
                    var4.field2690 = var6.field2690;
                    var4.field1745 = false;
                    return var4;
                }
                var6 = (class197) this.field7757.method111(22548);
            }
        }
        var4.field2690 = arg2.method2204((byte) 46, arg1);
        var4.field1745 = false;
        var4.field1739 = true;
        return var4;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 114)
    public static void method3218(int arg0) {
        field7766 = null;
        if (arg0 != 0) {
            field7766 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "run", descriptor = "()V", line = 124)
    public final void run() {
        while (!this.field7759) {
            class16 var1 = this.field7757;
            class197 var2;
            synchronized (this.field7757) {
                var2 = (class197) this.field7757.method114(-49);
                if (var2 == null) {
                    try {
                        this.field7757.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field7758--;
            }
            try {
                if (var2.field2691 == 2) {
                    var2.field2683.method2202(428, var2.field2690, var2.field2690.length, (int) var2.field8924);
                } else if (var2.field2691 == 3) {
                    var2.field2690 = var2.field2683.method2204((byte) 46, (int) var2.field8924);
                }
            } catch (Exception var6) {
                class684.method3842(1, var6, null);
            }
            var2.field1745 = false;
        }
        field7755++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Luj;II)Lme;", line = 172)
    public final class197 method3219(class387 arg0, int arg1, int arg2) {
        field7760++;
        if (arg1 < 43) {
            this.method3215(11, null);
        }
        class197 var4 = new class197();
        var4.field2683 = arg0;
        var4.field2691 = 3;
        var4.field8924 = arg2;
        var4.field1739 = false;
        this.method3215(-115, var4);
        return var4;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI[BLuj;)Lme;", line = 193)
    public final class197 method3220(byte arg0, int arg1, byte[] arg2, class387 arg3) {
        if (arg0 != -60) {
            this.field7757 = null;
        }
        field7767++;
        class197 var5 = new class197();
        var5.field2691 = 2;
        var5.field1739 = false;
        var5.field8924 = arg1;
        var5.field2690 = arg2;
        var5.field2683 = arg3;
        this.method3215(124, var5);
        return var5;
    }
}
