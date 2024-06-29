import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class79 extends class30 {

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    private int field990 = 2048;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
    private int field994 = 1024;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
    private int field987 = 3072;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!wh", name = "W", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!wh", name = "V", descriptor = "Lmo;")
    public static class447 field998;

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "[I")
    public static int[] field995;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "[[[I")
    public static int[][][] field989;

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V", line = 5)
    public class79() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V", line = 9)
    public final void method111(byte arg0) {
        ++field988;
        if (arg0 >= 90) {
            this.field990 = this.field987 - this.field994;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)[I", line = 20)
    public final int[] method116(int arg0, byte arg1) {
        ++field991;
        int[] var3 = super.field371.method2367((byte) -91, arg0);
        if (super.field371.field5586) {
            int[] var4 = this.method210((byte) 85, 0, arg0);
            for (int var5 = 0; class369.field5610 > var5; ++var5) {
                var3[var5] = (var4[var5] * this.field990 >> 12) + this.field994;
            }
        }
        if (arg1 < 49) {
            field998 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIZIII)V", line = 54)
    public static final void method498(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (~class406.field6033 >= ~arg0 && class185.field3005 >= arg5 && ~class99.field1378 >= ~arg1 && arg3 <= class396.field5925) {
            class232.method1649(true, arg1, arg4, arg0, arg3, arg5);
        } else {
            class444.method2751(arg3, arg4, arg5, arg1, 5, arg0);
        }
        ++field997;
        if (!arg2) {
            field989 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)V", line = 74)
    public static final void method499(int arg0) {
        ++field992;
        class142.field2254.method336(125);
        class102.field1417.method336(-123);
        int var1 = 42 / ((-24 - arg0) / 39);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIZILjd;IILjd;I)V", line = 86)
    public static final void method500(int arg0, int arg1, int arg2, boolean arg3, int arg4, class124 arg5, int arg6, int arg7, class124 arg8, int arg9) {
        ++field993;
        int var10 = arg5.method322(-26228);
        if (var10 != -1) {
            Object var11 = null;
            class356 var12 = (class356) class272.field4367.method331((byte) 69, (long) var10);
            if (var12 == null) {
                class100[] var13 = class100.method750(class223.field3727, var10, 0);
                if (var13 == null) {
                    return;
                }
                var12 = class284.field4547.method641(var13[0], true);
                class272.field4367.method341(104, (long) var10, var12);
            }
            if (arg3) {
                class196.method1373(arg8.method903(-101) * 64, (byte) -116, arg6, arg8.field722, arg4, arg0 >> 1, 0, arg8.field724, arg9 >> 1);
                int var14 = arg7 - -class126.field1938[0] + -18;
                int var15 = arg2 / 4 * 18 + var14;
                int var16 = class126.field1938[1] + arg1 - 16 + -54;
                int var17 = arg2 % 4 * 18 + var16;
                var12.method2327(var15, var17);
                if (arg5 == arg8) {
                    class284.field4547.method2083(83, var17 + -1, 18, var15 + -1, -256, 18);
                }
                class13 var18 = class74.method475((byte) -96);
                var18.field188 = var17 - -16;
                var18.field182 = var15;
                var18.field187 = var15 + 16;
                var18.field186 = arg5;
                var18.field193 = var17;
                class423.field6251.method2442(var18, (byte) 110);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljg;II)V", line = 136)
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field376 = ~arg0.method1322(false) == -2;
                }
            } else {
                this.field987 = arg0.method1272((byte) -80);
            }
        } else {
            this.field994 = arg0.method1272((byte) -55);
        }
        if (arg1 != 6456) {
            field995 = null;
        }
        ++field986;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(Z)V", line = 184)
    public static void method501(boolean arg0) {
        field998 = null;
        if (arg0) {
            field995 = null;
            field989 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/lang/String;)V", line = 203)
    public static final void method502(int arg0, String arg1) {
        ++field996;
        if (!arg1.equals("")) {
            int var2 = -104 / ((-10 - arg0) / 44);
            ++class406.field6032;
            class11.field139.method2224(36, (byte) 0);
            class11.field139.method1312(class317.method2110(true, arg1), -113);
            class11.field139.method1301(arg1, 126);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)[[I", line = 225)
    public final int[][] method203(byte arg0, int arg1) {
        ++field999;
        int[][] var3 = super.field360.method2803(arg1, true);
        if (arg0 != -93) {
            method501(false);
        }
        if (super.field360.field6566) {
            int[][] var4 = this.method206(arg1, 2, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class369.field5610; ++var11) {
                var8[var11] = (var5[var11] * this.field990 >> 12) + this.field994;
                var9[var11] = (var6[var11] * this.field990 >> 12) + this.field994;
                var10[var11] = this.field994 - -(var7[var11] * this.field990 >> 12);
            }
        }
        return var3;
    }
}
