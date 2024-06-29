import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class728 extends class60 {

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Lhj;")
    public static class596 field10190 = new class596(86, 2);

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "[[S")
    private static short[][] field10194 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "[[S")
    private static short[][] field10195 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field10201 = 0;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "[I")
    public static int[] field10197 = new int[1000];

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "[[S")
    private static short[][] field10204 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "[[[S")
    public static short[][][] field10200 = new short[][][] { field10195, field10204, field10194 };

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "Ldj;")
    public static class362 field10205 = new class362(8);

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field10188;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field10189;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field10191;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field10193;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field10196;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field10198;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field10199;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field10202;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field10203;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "Ljava/lang/Object;")
    public static Object field10192;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)I")
    public final int method4113(int arg0) {
        ++field10188;
        if (arg0 != 0) {
            field10204 = null;
        }
        return super.field799;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(II)V")
    public static final void method4114(int arg0, int arg1) {
        ++field10189;
        if (class647.method3652(arg1, 0)) {
            if (arg0 >= -39) {
                field10201 = 67;
            }
            class620[] var2 = class316.field3880[arg1];
            for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                class620 var4 = var2[var3];
                if (var4 != null) {
                    var4.field8404 = 0;
                    var4.field8362 = 0;
                    var4.field8460 = 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)Z")
    public static final boolean method4115(byte arg0) {
        ++field10202;
        if (arg0 <= 95) {
            field10201 = 12;
        }
        return ~class558.field7751 != -1 ? true : class665.field9130.method2978(false);
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)V")
    public static void method4116(byte arg0) {
        field10200 = null;
        field10194 = null;
        field10204 = null;
        field10197 = null;
        field10195 = null;
        if (arg0 >= 29) {
            field10205 = null;
            field10192 = null;
            field10190 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)I")
    public final int method405(boolean arg0) {
        ++field10203;
        if (arg0) {
            method4117(20, 0.8100459F, 38, 25, (float[]) null, -0.5252178F, -120, -71, 9, (float[]) null, 22, 19);
        }
        return 2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IFII[FFIII[FII)V")
    public static final void method4117(int arg0, float arg1, int arg2, int arg3, float[] arg4, float arg5, int arg6, int arg7, int arg8, float[] arg9, int arg10, int arg11) {
        int var12 = arg11 - arg7;
        ++field10191;
        int var13 = arg8 - arg6;
        int var14 = arg0 - arg3;
        float var15 = arg4[2] * (float) var13 + arg4[arg2] * (float) var12 + arg4[1] * (float) var14;
        float var16 = arg4[5] * (float) var13 + arg4[4] * (float) var14 + arg4[3] * (float) var12;
        float var17 = arg4[8] * (float) var13 + arg4[6] * (float) var12 + arg4[7] * (float) var14;
        float var18 = 0.5F + (float) Math.atan2((double) var15, (double) var17) / 6.2831855F;
        if (arg1 != 1.0F) {
            var18 = arg1 * var18;
        }
        float var19 = var16 + 0.5F + arg5;
        if (~arg10 == -2) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg10 == 2) {
            var19 = -var19;
            var18 = -var18;
        } else if (arg10 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        arg9[1] = var19;
        arg9[0] = var18;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)I")
    public final int method406(int arg0, int arg1) {
        ++field10199;
        if (super.field798.method4287((byte) 55)) {
            return 3;
        } else {
            return ~super.field798.field10641.method1572(arg0 + arg0) == -1 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lhd;)V")
    public class728(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(ILhd;)V")
    public class728(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
    public final void method409(byte arg0) {
        if (arg0 > -27) {
            field10195 = null;
        }
        ++field10196;
        if (super.field798.method4287((byte) 69)) {
            super.field799 = 0;
        }
        if (super.field798.field10641.method1572(0) == 0) {
            super.field799 = 0;
        }
        if (~super.field799 > -1 || super.field799 > 2) {
            super.field799 = this.method405(false);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)V")
    public final void method407(byte arg0, int arg1) {
        ++field10198;
        int var3 = 1 / ((arg0 - 28) / 50);
        super.field799 = arg1;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(B)Z")
    public final boolean method4118(byte arg0) {
        ++field10193;
        if (super.field798.method4287((byte) 113)) {
            return false;
        } else {
            if (arg0 >= -61) {
                field10192 = null;
            }
            return ~super.field798.field10641.method1572(0) != -1;
        }
    }
}
