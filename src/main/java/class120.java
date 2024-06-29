import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class120 extends class61 {

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public int field2122 = 0;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "[I")
    public int[] field2128 = new int[5];

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "[Lqg;")
    public class211[] field2144 = new class211[5];

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public int field2142;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    public int field2135;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public int field2130;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public int field2117;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "Llc;")
    private static class143 field2123 = class66.method374("You can(Wt add yourself to your own friend list)3", -1);

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field2121 = 2;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field2126 = 0;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "Llc;")
    public static class143 field2114 = field2123;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "Llc;")
    public static class143 field2139 = class66.method374("tremblement:", -1);

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "Z")
    public static boolean field2141 = false;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "B")
    public byte field2136;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public int field2120;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public int field2132;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public int field2134;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    public int field2140;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
    public int field2143;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "Llg;")
    public class105 field2146;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "Lmh;")
    public class117 field2138;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "Lch;")
    public class120 field2119;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "Lki;")
    public class140 field2129;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "Lwi;")
    public class229 field2145;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "Lri;")
    public class57 field2131;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "Lkd;")
    public class63 field2124;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "Lsb;")
    public class93 field2127;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "Z")
    public boolean field2115;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "Z")
    public boolean field2133;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "Z")
    public boolean field2137;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "[Lhj;")
    public static class25[] field2113;

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(III)V")
    public class120(int arg0, int arg1, int arg2) {
        this.field2142 = arg1;
        this.field2130 = this.field2135 = arg0;
        this.field2117 = arg2;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
    public static void method735(int arg0) {
        field2113 = null;
        if (arg0 == 22658) {
            field2139 = null;
            field2123 = null;
            field2114 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIII)V")
    public static final void method736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2116++;
        for (int var6 = arg0; var6 <= (arg0 + arg4); var6++) {
            for (int var11 = arg2; var11 <= (arg2 + arg5); var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class137.field2405[arg3][var11][var6] = 127;
                }
            }
        }
        for (int var7 = arg0; var7 < (arg0 + arg4); var7++) {
            for (int var10 = arg2; var10 < arg2 + arg5; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class192.field3535[arg3][var10][var7] = arg3 > 0 ? class192.field3535[arg3 - 1][var10][var7] : 0;
                }
            }
        }
        if (arg1 < arg2 && arg2 < 104) {
            for (int var8 = arg0 + 1; var8 < arg0 + arg4; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class192.field3535[arg3][arg2][var8] = class192.field3535[arg3][arg2 - 1][var8];
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var9 = arg2 + 1; var9 < arg2 + arg5; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class192.field3535[arg3][var9][arg0] = class192.field3535[arg3][var9][arg0 - 1];
                }
            }
        }
        if (arg2 < 0 || arg0 < 0 || arg2 >= 104 || arg0 >= 104) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 > 0 && class192.field3535[arg3][arg2 - 1][arg0] != 0) {
                class192.field3535[arg3][arg2][arg0] = class192.field3535[arg3][arg2 - 1][arg0];
                return;
            }
            if (arg0 > 0 && class192.field3535[arg3][arg2][arg0 - 1] != 0) {
                class192.field3535[arg3][arg2][arg0] = class192.field3535[arg3][arg2][arg0 - 1];
                return;
            }
            if (arg2 > 0 && arg0 > 0 && class192.field3535[arg3][arg2 - 1][arg0 - 1] != 0) {
                class192.field3535[arg3][arg2][arg0] = class192.field3535[arg3][arg2 - 1][arg0 - 1];
                return;
            }
        } else if (arg2 <= 0 || class192.field3535[arg3][arg2 - 1][arg0] == class192.field3535[arg3 - 1][arg2 - 1][arg0]) {
            if (arg0 <= 0 || class192.field3535[arg3 - 1][arg2][arg0 - 1] == class192.field3535[arg3][arg2][arg0 - 1]) {
                if (arg2 > 0 && arg0 > 0 && class192.field3535[arg3 - 1][arg2 - 1][arg0 - 1] != class192.field3535[arg3][arg2 - 1][arg0 - 1]) {
                    class192.field3535[arg3][arg2][arg0] = class192.field3535[arg3][arg2 - 1][arg0 - 1];
                    return;
                }
                return;
            }
            class192.field3535[arg3][arg2][arg0] = class192.field3535[arg3][arg2][arg0 - 1];
        } else {
            class192.field3535[arg3][arg2][arg0] = class192.field3535[arg3][arg2 - 1][arg0];
            return;
        }
    }
}
