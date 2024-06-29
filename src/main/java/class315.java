import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class315 extends class82 {

    @OriginalMember(owner = "client!ku", name = "P", descriptor = "I")
    private int field4017 = 1;

    @OriginalMember(owner = "client!ku", name = "Q", descriptor = "I")
    private int field4018 = 1;

    @OriginalMember(owner = "client!ku", name = "S", descriptor = "I")
    private int field4020 = 204;

    @OriginalMember(owner = "client!ku", name = "N", descriptor = "[I")
    public static int[] field4015 = new int[1];

    @OriginalMember(owner = "client!ku", name = "V", descriptor = "I")
    public static int field4023 = 0;

    @OriginalMember(owner = "client!ku", name = "X", descriptor = "Ljava/lang/String;")
    public static String field4025 = "";

    @OriginalMember(owner = "client!ku", name = "L", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!ku", name = "M", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!ku", name = "T", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!ku", name = "U", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!ku", name = "W", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!ku", name = "R", descriptor = "Loh;")
    public static class342 field4019;

    @OriginalMember(owner = "client!ku", name = "O", descriptor = "Ldn;")
    public static class438 field4016;

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V")
    public class315() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "(I)V")
    public static void method1744(int arg0) {
        field4015 = null;
        field4019 = null;
        int var1 = 105 / ((54 - arg0) / 32);
        field4016 = null;
        field4025 = null;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1745(String arg0, int arg1) {
        ++field4014;
        if (class449.field6225) {
            boolean var2 = false;
            int var3 = class370.field4878;
            int[] var4 = class519.field7302;
            for (int var5 = arg1; var3 > var5; ++var5) {
                class545 var6 = class459.field6329[var4[var5]];
                if (var6 != null && class103.field1265 != var6 && var6.field8023 != null && var6.field8023.equalsIgnoreCase(arg0)) {
                    class418.method2378(17984, class516.field7278);
                    ++client.field3208;
                    class136.field1663.method2111((byte) -128, class588.field8538);
                    class136.field1663.method2101(false, var4[var5]);
                    class136.field1663.method2116(8, 0);
                    class136.field1663.method2101(false, class592.field8606);
                    class136.field1663.method2148(class110.field1361, 29780);
                    var2 = true;
                    class546.method3204(0, true, 0, var6.method2694(28146), var6.field6483[0], var6.field6491[0], var6.method2694(arg1 + 28146), -2, true);
                    break;
                }
            }
            if (!var2) {
                class435.method2514(class467.field6536.method987(class31.field247, arg1 ^ 22) + arg0, true);
            }
            if (class449.field6225) {
                class281.method1595(arg1 + 25098);
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILos;)V")
    public final void method198(int arg0, int arg1, class374 arg2) {
        ++field4021;
        int var4 = -91 % ((-69 - arg1) / 42);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field4020 = arg2.method2136(false);
                }
            } else {
                this.field4017 = arg2.method2129(-105);
            }
        } else {
            this.field4018 = arg2.method2129(-99);
        }
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(II)[I")
    public final int[] method201(int arg0, int arg1) {
        ++field4022;
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (super.field990.field3641) {
            for (int var4 = 0; class629.field9033 > var4; ++var4) {
                int var5 = class366.field4817[var4];
                int var6 = class85.field1036[arg0];
                int var7 = this.field4018 * var5 >> 12;
                int var8 = this.field4017 * var6 >> 12;
                int var9 = var5 % (4096 / this.field4018) * this.field4018;
                int var10 = var6 % (4096 / this.field4017) * this.field4017;
                if (~this.field4020 < ~var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field4020 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field4020) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return arg1 != 12218 ? null : var3;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B[J[I)V")
    public static final void method1746(byte arg0, long[] arg1, int[] arg2) {
        ++field4024;
        if (arg0 != -75) {
            field4019 = null;
        }
        class113.method654(arg2, 111, arg1.length - 1, 0, arg1);
    }
}
