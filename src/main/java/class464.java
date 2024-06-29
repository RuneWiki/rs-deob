import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class464 extends class752 {

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "[[S")
    private static short[][] field6582 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!ti", name = "W", descriptor = "[[S")
    private static short[][] field6587 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ti", name = "X", descriptor = "[[S")
    private static short[][] field6588 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "[[[S")
    public static short[][][] field6581 = new short[][][] { field6582, field6587, field6588 };

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "Lmi;")
    public static class521 field6586;

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "[Lhh;")
    public static class140[] field6584;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII[I)V", line = 4)
    public static final void method2733(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field6585++;
        if (arg3 != -22816) {
            method2733(-39, 114, 29, 82, null);
        }
        arg1--;
        int var8 = arg2 - 1;
        int var5 = var8 - 7;
        while (var5 > arg1) {
            int var6 = arg1 + 1;
            arg4[var6] = arg0;
            int var7 = var6 + 1;
            arg4[var7] = arg0;
            int var9 = var7 + 1;
            arg4[var9] = arg0;
            int var10 = var9 + 1;
            arg4[var10] = arg0;
            int var11 = var10 + 1;
            arg4[var11] = arg0;
            int var12 = var11 + 1;
            arg4[var12] = arg0;
            int var13 = var12 + 1;
            arg4[var13] = arg0;
            arg1 = var13 + 1;
            arg4[arg1] = arg0;
        }
        while (arg1 < var8) {
            arg1++;
            arg4[arg1] = arg0;
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V", line = 40)
    public static void method2734(int arg0) {
        field6587 = null;
        field6581 = null;
        field6584 = null;
        field6582 = null;
        if (arg0 == 9108) {
            field6588 = null;
            field6586 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZI)V", line = 56)
    public static final void method2735(int arg0, boolean arg1, int arg2) {
        field6583++;
        class358 var3 = class559.method3192(arg2, arg1, arg0 ^ 0x80001DCB);
        if (var3 != null) {
            if (arg0 != 7627) {
                method2735(126, true, -75);
            }
            var3.method1102((byte) 73);
        }
    }
}
