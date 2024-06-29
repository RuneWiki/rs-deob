import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class626 extends class529 {

    @OriginalMember(owner = "client!jca", name = "K", descriptor = "I")
    private int field8734 = 4;

    @OriginalMember(owner = "client!jca", name = "J", descriptor = "I")
    private int field8733 = 4;

    @OriginalMember(owner = "client!jca", name = "E", descriptor = "Lgg;")
    public static class114 field8729 = new class114(5);

    @OriginalMember(owner = "client!jca", name = "F", descriptor = "I")
    public static int field8730;

    @OriginalMember(owner = "client!jca", name = "G", descriptor = "I")
    public static int field8731;

    @OriginalMember(owner = "client!jca", name = "H", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!jca", name = "L", descriptor = "I")
    public static int field8735;

    @OriginalMember(owner = "client!jca", name = "M", descriptor = "I")
    public static int field8736;

    @OriginalMember(owner = "client!jca", name = "N", descriptor = "I")
    public static int field8737;

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "(I)V", line = 4)
    public static void method3421(int arg0) {
        field8729 = null;
        if (arg0 != -21418) {
            method3421(88);
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IBLtn;)V", line = 14)
    public final void method190(int arg0, byte arg1, class179 arg2) {
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field8733 = arg2.method1094(255);
            }
        } else {
            this.field8734 = arg2.method1094(255);
        }
        if (arg1 <= 45) {
            field8729 = null;
        }
        ++field8736;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IILd;BLha;II)V", line = 51)
    public static final void method3422(int arg0, int arg1, class96 arg2, byte arg3, class454 arg4, int arg5, int arg6) {
        if (class551.field7754 < 100) {
            class728.method4035((byte) 23, arg4, arg2);
        }
        ++field8732;
        arg4.method131(arg5, arg1, arg0 + arg5, arg1 - -arg6);
        if (class551.field7754 < 100) {
            byte var7 = 20;
            int var8 = arg0 / 2 + arg5;
            int var9 = arg6 / 2 + arg1 + -18 + -var7;
            arg4.method167(arg5, arg1, arg0, arg6, -16777216, 0);
            arg4.method136(var8 - 152, var9, 304, 34, class621.field8687[class414.field5845].getRGB(), 0);
            arg4.method167(var8 + -150, var9 + 2, class551.field7754 * 3, 30, class583.field8091[class414.field5845].getRGB(), 0);
            class100.field1234.method2510(var7 + var9, -1, class514.field7247[class414.field5845].getRGB(), 16777215, class586.field8143.method3261(class416.field5920, (byte) 82), var8);
        } else {
            int var10 = class513.field7232 - (int) ((float) arg0 / class341.field4413);
            int var11 = class758.field10552 - -((int) ((float) arg6 / class341.field4413));
            if (arg3 >= -117) {
                method3422(-31, 125, (class96) null, (byte) -85, (class454) null, 18, -70);
            }
            int var12 = (int) ((float) arg0 / class341.field4413) + class513.field7232;
            class33.field508 = (int) ((float) (arg6 * 2) / class341.field4413);
            int var13 = class758.field10552 - (int) ((float) arg6 / class341.field4413);
            class132.field1573 = -((int) ((float) arg0 / class341.field4413)) + class513.field7232;
            class430.field6096 = (int) ((float) (arg0 * 2) / class341.field4413);
            class536.field7508 = -((int) ((float) arg6 / class341.field4413)) + class758.field10552;
            class341.method2001(class341.field4441 + var10, class341.field4442 + var11, class341.field4441 + var12, class341.field4442 + var13, arg5, arg1, arg0 + arg5, arg1 - -arg6 + 1);
            class341.method2014(arg4);
            class547 var14 = class341.method2012(arg4);
            class134.method844(0, (byte) -124, 0, arg4, var14);
            if (~class383.field5336 < -1) {
                --class488.field6949;
                if (class488.field6949 == 0) {
                    --class383.field5336;
                    class488.field6949 = 20;
                }
            }
            if (class679.field9225) {
                int var15 = arg5 - -arg0 + -5;
                int var16 = arg1 - 8 + arg6;
                class543.field7644.method2522(-127, var15, "Fps:" + class423.field6018, -1, var16, 16776960);
                int var20 = var16 - 15;
                Runtime var17 = Runtime.getRuntime();
                int var18 = (int) ((var17.totalMemory() + -var17.freeMemory()) / 1024L);
                int var19 = 16776960;
                if (~var18 < -65537) {
                    var19 = 16711680;
                }
                class543.field7644.method2522(-127, var15, "Mem:" + var18 + "k", -1, var20, var19);
                var16 = var20 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "()V", line = 134)
    public class626() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 138)
    public static final int method3423(String arg0, int arg1) {
        ++field8737;
        int var2 = arg0.length();
        int var3 = 0;
        int var4 = 0;
        if (arg1 > -127) {
            return -87;
        } else {
            while (var2 > var4) {
                var3 = (var3 << 5) - var3 - -arg0.charAt(var4);
                ++var4;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)[[I", line = 160)
    public final int[][] method592(int arg0, int arg1) {
        ++field8731;
        if (arg1 != 2) {
            field8729 = null;
        }
        int[][] var3 = super.field7450.method2241(-1, arg0);
        if (super.field7450.field5165) {
            int var4 = class304.field3909 / this.field8734;
            int var5 = class424.field6042 / this.field8733;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method3026(0, 0, 18464);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method3026(0, class424.field6042 * var7 / var5, 18464);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class304.field3909; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class304.field3909 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IB)[I", line = 230)
    public final int[] method191(int arg0, byte arg1) {
        ++field8735;
        int[] var3 = super.field7456.method1635(arg0, -105);
        int var4 = 3 % ((27 - arg1) / 49);
        if (super.field7456.field3449) {
            int var5 = class304.field3909 / this.field8734;
            int var6 = class424.field6042 / this.field8733;
            int[] var7;
            if (~var6 >= -1) {
                var7 = this.method3028((byte) 115, 0, 0);
            } else {
                int var8 = arg0 % var6;
                var7 = this.method3028((byte) 104, class424.field6042 * var8 / var6, 0);
            }
            for (int var9 = 0; ~class304.field3909 < ~var9; ++var9) {
                if (~var5 < -1) {
                    int var10 = var9 % var5;
                    var3[var9] = var7[class304.field3909 * var10 / var5];
                } else {
                    var3[var9] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(BLtn;)Lmfa;", line = 291)
    public static final class204 method3424(byte arg0, class179 arg1) {
        ++field8730;
        int var2 = arg1.method1095((byte) 114);
        if (arg0 > -11) {
            method3424((byte) 19, (class179) null);
        }
        return new class204(var2);
    }
}
