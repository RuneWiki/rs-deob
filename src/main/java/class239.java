import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class239 {

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "[Z")
    public boolean[] field3617 = new boolean[256];

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "[B")
    public byte[] field3616 = new byte[18002];

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "[B")
    public byte[] field3621 = new byte[256];

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "[Z")
    public boolean[] field3624 = new boolean[16];

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "[B")
    public byte[] field3629 = new byte[18002];

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "[I")
    public int[] field3632 = new int[257];

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "[I")
    public int[] field3623 = new int[16];

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public int field3637 = 0;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "[I")
    public int[] field3640 = new int[6];

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "[[I")
    public int[][] field3627 = new int[6][258];

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "[I")
    public int[] field3643 = new int[256];

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "[B")
    public byte[] field3630 = new byte[4096];

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "[[B")
    public byte[][] field3647 = new byte[6][258];

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "[[I")
    public int[][] field3639 = new int[6][258];

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "[[I")
    public int[][] field3641 = new int[6][258];

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
    public int field3650 = 0;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "Llc;")
    public static class86 field3636 = new class86(4);

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "Ljava/lang/String;")
    public static String field3644 = "Allocating memory";

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "B")
    public byte field3631;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public int field3615;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public int field3618;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public int field3620;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public int field3622;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public int field3625;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public int field3626;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public int field3628;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public int field3633;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    public int field3634;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    public int field3638;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
    public int field3646;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    public int field3649;

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
    public int field3651;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "[B")
    public byte[] field3635;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "[B")
    public byte[] field3642;

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "[[[I")
    public static int[][][] field3652;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public static void method1598(byte arg0) {
        field3636 = null;
        field3644 = null;
        field3652 = null;
        int var1 = -128 / ((arg0 + 5) / 43);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1599(int arg0, int arg1) {
        field3648++;
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class81.field1106 + "</col>";
        } else {
            if (arg1 != 4096) {
                field3645 = -110;
            }
            return "<col=00ff80>" + arg0 / 1000000 + class159.field2224 + "</col>";
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)Z")
    public static final boolean method1600(int arg0, int arg1, int arg2) {
        int var3 = class104.field1454[arg0][arg1][arg2];
        if (-class44.field662 == var3) {
            return false;
        } else if (class44.field662 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class36.method242(var4 + 1, class200.field2788[arg0][arg1][arg2], var5 + 1) && class36.method242(var4 + 128 - 1, class200.field2788[arg0][arg1 + 1][arg2], var5 + 1) && class36.method242(var4 + 128 - 1, class200.field2788[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class36.method242(var4 + 1, class200.field2788[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class104.field1454[arg0][arg1][arg2] = class44.field662;
                return true;
            } else {
                class104.field1454[arg0][arg1][arg2] = -class44.field662;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIII)V")
    public static final void method1601(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3619++;
        for (int var6 = arg3; var6 <= (arg3 + arg1); var6++) {
            for (int var11 = arg4; var11 <= (arg4 + arg5); var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    client.field2180[arg2][var11][var6] = 127;
                }
            }
        }
        for (int var7 = arg3; var7 < arg1 + arg3; var7++) {
            for (int var10 = arg4; var10 < arg4 + arg5; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class200.field2788[arg2][var10][var7] = arg2 > 0 ? class200.field2788[arg2 - 1][var10][var7] : 0;
                }
            }
        }
        if (arg0 != 28663) {
            field3644 = null;
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var8 = arg3 + 1; var8 < arg1 + arg3; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class200.field2788[arg2][arg4][var8] = class200.field2788[arg2][arg4 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var9 = arg4 + 1; var9 < (arg4 + arg5); var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class200.field2788[arg2][var9][arg3] = class200.field2788[arg2][var9][arg3 - 1];
                }
            }
        }
        if (arg4 < 0 || arg3 < 0 || arg4 >= 104 || arg3 >= 104) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 > 0 && class200.field2788[arg2][arg4 - 1][arg3] != 0) {
                class200.field2788[arg2][arg4][arg3] = class200.field2788[arg2][arg4 - 1][arg3];
                return;
            }
            if (arg3 > 0 && class200.field2788[arg2][arg4][arg3 - 1] != 0) {
                class200.field2788[arg2][arg4][arg3] = class200.field2788[arg2][arg4][arg3 - 1];
                return;
            }
            if (arg4 > 0 && arg3 > 0 && class200.field2788[arg2][arg4 - 1][arg3 - 1] != 0) {
                class200.field2788[arg2][arg4][arg3] = class200.field2788[arg2][arg4 - 1][arg3 - 1];
                return;
            }
            return;
        }
        if (arg4 > 0 && class200.field2788[arg2 - 1][arg4 - 1][arg3] != class200.field2788[arg2][arg4 - 1][arg3]) {
            class200.field2788[arg2][arg4][arg3] = class200.field2788[arg2][arg4 - 1][arg3];
            return;
        }
        if (arg3 > 0 && class200.field2788[arg2 - 1][arg4][arg3 - 1] != class200.field2788[arg2][arg4][arg3 - 1]) {
            class200.field2788[arg2][arg4][arg3] = class200.field2788[arg2][arg4][arg3 - 1];
            return;
        }
        if (arg4 > 0 && arg3 > 0 && class200.field2788[arg2 - 1][arg4 - 1][arg3 - 1] != class200.field2788[arg2][arg4 - 1][arg3 - 1]) {
            class200.field2788[arg2][arg4][arg3] = class200.field2788[arg2][arg4 - 1][arg3 - 1];
            return;
        }
    }
}
