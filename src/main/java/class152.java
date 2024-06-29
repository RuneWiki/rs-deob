import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class152 {

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "Z")
    public boolean field2119 = true;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public int field2123;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    public int field2122;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public int field2104;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public int field2112;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "[I")
    public int[] field2115;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "[I")
    public int[] field2107;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "[I")
    public int[] field2113;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "[I")
    public int[] field2124;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "[I")
    public int[] field2114;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "[I")
    public int[] field2109;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "[I")
    public int[] field2108;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "[I")
    public int[] field2117;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "[I")
    public int[] field2103;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "[I")
    public int[] field2110;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "[[I")
    private static int[][] field2105 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "[I")
    public static int[] field2111 = new int[6];

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "[[I")
    private static int[][] field2118 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "[I")
    public static int[] field2120 = new int[6];

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "[I")
    public static int[] field2106 = new int[6];

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "[I")
    public static int[] field2116 = new int[6];

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "[I")
    public static int[] field2121 = new int[6];

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "()V")
    public static void method957() {
        field2106 = null;
        field2116 = null;
        field2121 = null;
        field2111 = null;
        field2120 = null;
        field2105 = null;
        field2118 = null;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
    public class152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
            this.field2119 = false;
        }
        this.field2123 = arg0;
        this.field2122 = arg1;
        this.field2104 = arg17;
        this.field2112 = arg18;
        short var20 = 128;
        int var21 = var20 / 2;
        int var22 = var20 / 4;
        int var23 = var20 * 3 / 4;
        int[] var24 = field2105[arg0];
        int var25 = var24.length;
        this.field2115 = new int[var25];
        this.field2107 = new int[var25];
        this.field2113 = new int[var25];
        int[] var26 = new int[var25];
        int[] var27 = new int[var25];
        int var28 = arg3 * var20;
        int var29 = arg4 * var20;
        for (int var30 = 0; var30 < var25; var30++) {
            int var43 = var24[var30];
            if ((var43 & 0x1) == 0 && var43 <= 8) {
                var43 = (var43 - arg1 - arg1 - 1 & 0x7) + 1;
            }
            if (var43 > 8 && var43 <= 12) {
                var43 = (var43 - arg1 - 9 & 0x3) + 9;
            }
            if (var43 > 12 && var43 <= 16) {
                var43 = (var43 - arg1 - 13 & 0x3) + 13;
            }
            int var44;
            int var45;
            int var46;
            int var47;
            int var48;
            if (var43 == 1) {
                var44 = var28;
                var45 = var29;
                var46 = arg5;
                var47 = arg9;
                var48 = arg13;
            } else if (var43 == 2) {
                var44 = var21 + var28;
                var45 = var29;
                var46 = arg5 + arg6 >> 1;
                var47 = arg9 + arg10 >> 1;
                var48 = arg13 + arg14 >> 1;
            } else if (var43 == 3) {
                var44 = var20 + var28;
                var45 = var29;
                var46 = arg6;
                var47 = arg10;
                var48 = arg14;
            } else if (var43 == 4) {
                var44 = var20 + var28;
                var45 = var21 + var29;
                var46 = arg6 + arg7 >> 1;
                var47 = arg10 + arg11 >> 1;
                var48 = arg14 + arg15 >> 1;
            } else if (var43 == 5) {
                var44 = var20 + var28;
                var45 = var20 + var29;
                var46 = arg7;
                var47 = arg11;
                var48 = arg15;
            } else if (var43 == 6) {
                var44 = var21 + var28;
                var45 = var20 + var29;
                var46 = arg7 + arg8 >> 1;
                var47 = arg11 + arg12 >> 1;
                var48 = arg15 + arg16 >> 1;
            } else if (var43 == 7) {
                var44 = var28;
                var45 = var20 + var29;
                var46 = arg8;
                var47 = arg12;
                var48 = arg16;
            } else if (var43 == 8) {
                var44 = var28;
                var45 = var21 + var29;
                var46 = arg5 + arg8 >> 1;
                var47 = arg9 + arg12 >> 1;
                var48 = arg13 + arg16 >> 1;
            } else if (var43 == 9) {
                var44 = var21 + var28;
                var45 = var22 + var29;
                var46 = arg5 + arg6 >> 1;
                var47 = arg9 + arg10 >> 1;
                var48 = arg13 + arg14 >> 1;
            } else if (var43 == 10) {
                var44 = var23 + var28;
                var45 = var21 + var29;
                var46 = arg6 + arg7 >> 1;
                var47 = arg10 + arg11 >> 1;
                var48 = arg14 + arg15 >> 1;
            } else if (var43 == 11) {
                var44 = var21 + var28;
                var45 = var23 + var29;
                var46 = arg7 + arg8 >> 1;
                var47 = arg11 + arg12 >> 1;
                var48 = arg15 + arg16 >> 1;
            } else if (var43 == 12) {
                var44 = var22 + var28;
                var45 = var21 + var29;
                var46 = arg5 + arg8 >> 1;
                var47 = arg9 + arg12 >> 1;
                var48 = arg13 + arg16 >> 1;
            } else if (var43 == 13) {
                var44 = var22 + var28;
                var45 = var22 + var29;
                var46 = arg5;
                var47 = arg9;
                var48 = arg13;
            } else if (var43 == 14) {
                var44 = var23 + var28;
                var45 = var22 + var29;
                var46 = arg6;
                var47 = arg10;
                var48 = arg14;
            } else if (var43 == 15) {
                var44 = var23 + var28;
                var45 = var23 + var29;
                var46 = arg7;
                var47 = arg11;
                var48 = arg15;
            } else {
                var44 = var22 + var28;
                var45 = var23 + var29;
                var46 = arg8;
                var47 = arg12;
                var48 = arg16;
            }
            this.field2115[var30] = var44;
            this.field2107[var30] = var46;
            this.field2113[var30] = var45;
            var26[var30] = var47;
            var27[var30] = var48;
        }
        int[] var31 = field2118[arg0];
        int var32 = var31.length / 4;
        this.field2124 = new int[var32];
        this.field2114 = new int[var32];
        this.field2109 = new int[var32];
        this.field2108 = new int[var32];
        this.field2117 = new int[var32];
        this.field2103 = new int[var32];
        if (arg2 != -1) {
            this.field2110 = new int[var32];
        }
        int var33 = 0;
        for (int var34 = 0; var34 < var32; var34++) {
            int var39 = var31[var33];
            int var40 = var31[var33 + 1];
            int var41 = var31[var33 + 2];
            int var42 = var31[var33 + 3];
            var33 += 4;
            if (var40 < 4) {
                var40 = var40 - arg1 & 0x3;
            }
            if (var41 < 4) {
                var41 = var41 - arg1 & 0x3;
            }
            if (var42 < 4) {
                var42 = var42 - arg1 & 0x3;
            }
            this.field2124[var34] = var40;
            this.field2114[var34] = var41;
            this.field2109[var34] = var42;
            if (var39 == 0) {
                this.field2108[var34] = var26[var40];
                this.field2117[var34] = var26[var41];
                this.field2103[var34] = var26[var42];
                if (this.field2110 != null) {
                    this.field2110[var34] = -1;
                }
            } else {
                this.field2108[var34] = var27[var40];
                this.field2117[var34] = var27[var41];
                this.field2103[var34] = var27[var42];
                if (this.field2110 != null) {
                    this.field2110[var34] = arg2;
                }
            }
        }
        int var35 = arg5;
        int var36 = arg6;
        if (arg6 < arg5) {
            var35 = arg6;
        }
        if (arg6 > arg6) {
            var36 = arg6;
        }
        if (arg7 < var35) {
            var35 = arg7;
        }
        if (arg7 > var36) {
            var36 = arg7;
        }
        if (arg8 < var35) {
            var35 = arg8;
        }
        if (arg8 > var36) {
            var36 = arg8;
        }
        int var37 = var35 / 14;
        int var38 = var36 / 14;
    }
}
