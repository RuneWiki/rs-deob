import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class381 {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "[[S")
    private static short[][] field5459 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "[[S")
    private static short[][] field5460 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "[[S")
    private static short[][] field5466 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "[[[S")
    public static short[][][] field5462 = new short[][][] { field5460, field5466, field5459 };

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field5461 = 0;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "[J")
    public static long[] field5463;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "[Lfd;")
    public static class298[] field5467;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BII)Z", line = 4)
    public static final boolean method2386(byte arg0, int arg1, int arg2) {
        field5465++;
        return arg0 > -48 ? false : ((arg1 & 0x2000) != 0 | class670.method3782(arg2, 544, arg1) | class157.method984(arg1, arg2, -991)) & class694.method3924(arg2, arg1, 2048);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 31)
    public static void method2387(int arg0) {
        field5462 = null;
        if (arg0 != -12373) {
            return;
        }
        field5467 = null;
        field5466 = null;
        field5463 = null;
        field5460 = null;
        field5459 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Luv;ILaa;IIBILfd;)V", line = 54)
    public static final void method2388(class755 arg0, int arg1, class573 arg2, int arg3, int arg4, byte arg5, int arg6, class298 arg7) {
        field5464++;
        if (arg5 < 84 || arg7 == null) {
            return;
        }
        int var8;
        if (class720.field10023 == 4) {
            var8 = (int) class596.field8093 & 0x3FFF;
        } else {
            var8 = (int) class596.field8093 + class439.field6126 & 0x3FFF;
        }
        int var9 = Math.max(arg0.field10393 / 2, arg0.field10501 / 2) + 10;
        int var10 = arg4 * arg4 + (arg3 * arg3);
        if (var10 > var9 * var9) {
            return;
        }
        int var11 = class24.field312[var8];
        int var12 = class24.field308[var8];
        if (class720.field10023 != 4) {
            var11 = var11 * 256 / (class31.field372 + 256);
            var12 = var12 * 256 / (class31.field372 + 256);
        }
        int var13 = arg3 * var11 + (arg4 * var12) >> 14;
        int var14 = arg3 * var12 - (arg4 * var11) >> 14;
        arg7.method1010(arg0.field10393 / 2 + arg1 + var13 - arg7.method1963() / 2, arg0.field10501 / 2 + arg6 - (var14 + arg7.method1961() / 2), arg2, arg1, arg6);
    }
}
