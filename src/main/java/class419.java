import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class419 {

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "[I")
    public int[] field5756 = new int[16];

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "[Z")
    public boolean[] field5765 = new boolean[16];

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "[[I")
    public int[][] field5758 = new int[6][258];

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "[B")
    public byte[] field5769 = new byte[256];

    @OriginalMember(owner = "client!nr", name = "w", descriptor = "[B")
    public byte[] field5773 = new byte[18002];

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "[[I")
    public int[][] field5759 = new int[6][258];

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "[I")
    public int[] field5754 = new int[256];

    @OriginalMember(owner = "client!nr", name = "y", descriptor = "[[I")
    public int[][] field5775 = new int[6][258];

    @OriginalMember(owner = "client!nr", name = "v", descriptor = "[I")
    public int[] field5772 = new int[257];

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "[[B")
    public byte[][] field5752 = new byte[6][258];

    @OriginalMember(owner = "client!nr", name = "E", descriptor = "[Z")
    public boolean[] field5781 = new boolean[256];

    @OriginalMember(owner = "client!nr", name = "C", descriptor = "[B")
    public byte[] field5779 = new byte[4096];

    @OriginalMember(owner = "client!nr", name = "B", descriptor = "I")
    public int field5778 = 0;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "[I")
    public int[] field5755 = new int[6];

    @OriginalMember(owner = "client!nr", name = "u", descriptor = "I")
    public int field5771 = 0;

    @OriginalMember(owner = "client!nr", name = "K", descriptor = "[B")
    public byte[] field5787 = new byte[18002];

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field5753 = 1339;

    @OriginalMember(owner = "client!nr", name = "H", descriptor = "Lcs;")
    public static class351 field5784 = new class351(27, 16);

    @OriginalMember(owner = "client!nr", name = "I", descriptor = "[I")
    public static int[] field5785 = new int[32];

    @OriginalMember(owner = "client!nr", name = "F", descriptor = "B")
    public byte field5782;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public int field5751;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
    public int field5757;

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
    public int field5760;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public int field5761;

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "I")
    public int field5762;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    public int field5763;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "I")
    public int field5764;

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "I")
    public int field5766;

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!nr", name = "x", descriptor = "I")
    public int field5774;

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "I")
    public int field5776;

    @OriginalMember(owner = "client!nr", name = "A", descriptor = "I")
    public int field5777;

    @OriginalMember(owner = "client!nr", name = "D", descriptor = "I")
    public int field5780;

    @OriginalMember(owner = "client!nr", name = "G", descriptor = "I")
    public int field5783;

    @OriginalMember(owner = "client!nr", name = "J", descriptor = "Laq;")
    public static class385 field5786;

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "[B")
    public byte[] field5768;

    @OriginalMember(owner = "client!nr", name = "t", descriptor = "[B")
    public byte[] field5770;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V", line = 7)
    public static void method2442(int arg0) {
        field5784 = null;
        int var1 = 64 / ((-arg0 - 23) / 59);
        field5785 = null;
        field5786 = null;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)I", line = 20)
    public static final int method2443(int arg0) {
        field5767++;
        if ((double) class379.field5365 == 3.0D) {
            return 37;
        } else if ((double) class379.field5365 == 4.0D) {
            return 50;
        } else if ((double) class379.field5365 == 6.0D) {
            return 75;
        } else if ((double) class379.field5365 == 8.0D) {
            return 100;
        } else {
            if (arg0 >= -60) {
                field5785 = null;
            }
            return 200;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lkm;Lkj;III)V", line = 150)
    public static final void method2444(class487 arg0, class280 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class456.field6299) {
            class406 var5 = class455.field6293[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field5621 != null && var5.field5621.method195(95)) {
                arg1.method198(class372.field5263, arg0, 0, true, 0, var5.field5621, (byte) 59);
            }
        }
        if (arg4 < class456.field6299) {
            class406 var6 = class455.field6293[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field5621 != null && var6.field5621.method195(115)) {
                arg1.method198(0, arg0, 0, true, class372.field5263, var6.field5621, (byte) 59);
            }
        }
        if (arg3 < class456.field6299 && arg4 < class205.field2946) {
            class406 var7 = class455.field6293[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field5621 != null && var7.field5621.method195(116)) {
                arg1.method198(class372.field5263, arg0, 0, true, class372.field5263, var7.field5621, (byte) 59);
            }
        }
        if (arg3 < class456.field6299 && arg4 > 0) {
            class406 var8 = class455.field6293[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field5621 != null && var8.field5621.method195(92)) {
                arg1.method198(class372.field5263, arg0, 0, true, -class372.field5263, var8.field5621, (byte) 59);
            }
        }
    }
}
