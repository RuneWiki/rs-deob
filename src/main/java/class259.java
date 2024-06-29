import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class259 extends class404 {

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "Lgca;")
    public class227 field3523 = new class227();

    @OriginalMember(owner = "client!ao", name = "y", descriptor = "Lse;")
    public class232 field3530 = new class232();

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "Ljba;")
    private class364 field3520;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
    public static int field3519 = 1;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
    public static int field3522 = 2;

    @OriginalMember(owner = "client!ao", name = "u", descriptor = "[F")
    public static float[] field3526 = new float[16];

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!ao", name = "w", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!ao", name = "x", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lag;II[III)V", line = 3)
    private final void method1586(class636 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        if ((this.field3520.field4834[arg0.field8810] & 0x4) != 0 && arg0.field8806 < 0) {
            int var7 = this.field3520.field4832[arg0.field8810] / class357.field4736;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field8807) / var7;
                if (var8 > arg1) {
                    arg0.field8807 += arg1 * var7;
                    break;
                }
                arg0.field8811.method1469(arg3, arg5, var8);
                arg1 -= var8;
                arg5 += var8;
                arg0.field8807 += var7 * var8 - 1048576;
                int var9 = class357.field4736 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class484 var11 = arg0.field8811;
                if (this.field3520.field4836[arg0.field8810] == 0) {
                    arg0.field8811 = class484.method2751(arg0.field8813, var11.method2748(), var11.method2719(), var11.method2724());
                } else {
                    arg0.field8811 = class484.method2751(arg0.field8813, var11.method2748(), 0, var11.method2724());
                    this.field3520.method2078((byte) 124, arg0.field8800.field4517[arg0.field8789] < 0, arg0);
                    arg0.field8811.method2732(var9, var11.method2719());
                }
                if (arg0.field8800.field4517[arg0.field8789] < 0) {
                    arg0.field8811.method2754(-1);
                }
                var11.method2745(var9);
                var11.method1469(arg3, arg5, arg4 - arg5);
                if (var11.method2718()) {
                    this.field3530.method1462(var11);
                }
            }
        }
        field3528++;
        arg0.field8811.method1469(arg3, arg5, arg1);
        int var12 = -45 / ((arg2 + 67) / 51);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lag;II)V", line = 62)
    private final void method1587(class636 arg0, int arg1, int arg2) {
        if ((this.field3520.field4834[arg0.field8810] & 0x4) != 0 && arg0.field8806 < 0) {
            int var4 = this.field3520.field4832[arg0.field8810] / class357.field4736;
            int var5 = (var4 + 1048575 - arg0.field8807) / var4;
            arg0.field8807 = arg2 * var4 + arg0.field8807 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field3520.field4836[arg0.field8810] == 0) {
                    arg0.field8811 = class484.method2751(arg0.field8813, arg0.field8811.method2748(), arg0.field8811.method2719(), arg0.field8811.method2724());
                } else {
                    arg0.field8811 = class484.method2751(arg0.field8813, arg0.field8811.method2748(), 0, arg0.field8811.method2724());
                    this.field3520.method2078((byte) 124, arg0.field8800.field4517[arg0.field8789] < 0, arg0);
                }
                if (arg0.field8800.field4517[arg0.field8789] < 0) {
                    arg0.field8811.method2754(-1);
                }
                arg2 = arg0.field8807 / var4;
            }
        }
        if (arg1 == -1) {
            field3529++;
            arg0.field8811.method1460(arg2);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([III)V", line = 103)
    public final void method1469(int[] arg0, int arg1, int arg2) {
        field3524++;
        this.field3530.method1469(arg0, arg1, arg2);
        for (class636 var4 = (class636) this.field3523.method1436(28964); var4 != null; var4 = (class636) this.field3523.method1443((byte) 6)) {
            if (!this.field3520.method2072(-1, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field8788) {
                        this.method1586(var4, var6, 117, arg0, var5 + var6, var5);
                        var4.field8788 -= var6;
                        break;
                    }
                    this.method1586(var4, var4.field8788, -125, arg0, var5 + var6, var5);
                    var5 += var4.field8788;
                    var6 -= var4.field8788;
                } while (!this.field3520.method2102(var4, arg0, var6, -17, var5));
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "()Ljc;", line = 141)
    public final class404 method1466() {
        field3525++;
        class636 var1;
        do {
            var1 = (class636) this.field3523.method1443((byte) 6);
            if (var1 == null) {
                return null;
            }
        } while (var1.field8811 == null);
        return var1.field8811;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 162)
    public final void method1460(int arg0) {
        field3527++;
        this.field3530.method1460(arg0);
        for (class636 var2 = (class636) this.field3523.method1436(28964); var2 != null; var2 = (class636) this.field3523.method1443((byte) 6)) {
            if (!this.field3520.method2072(-1, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field8788) {
                        this.method1587(var2, -1, var3);
                        var2.field8788 -= var3;
                        break;
                    }
                    this.method1587(var2, -1, var2.field8788);
                    var3 -= var2.field8788;
                } while (!this.field3520.method2102(var2, null, var3, -123, 0));
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "()I", line = 205)
    public final int method1465() {
        field3531++;
        return 0;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "()Ljc;", line = 217)
    public final class404 method1457() {
        field3521++;
        class636 var1 = (class636) this.field3523.method1436(28964);
        if (var1 == null) {
            return null;
        } else if (var1.field8811 == null) {
            return this.method1466();
        } else {
            return var1.field8811;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V", line = 237)
    public static void method1588(int arg0) {
        if (arg0 != 262144) {
            method1588(54);
        }
        field3526 = null;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Ljba;)V", line = 258)
    public class259(class364 arg0) {
        this.field3520 = arg0;
    }
}
