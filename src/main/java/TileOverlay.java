import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("i")
public class TileOverlay {

    @OriginalMember(owner = "i", name = "k", descriptor = "Z")
    public boolean field115 = true;

    @OriginalMember(owner = "i", name = "l", descriptor = "I")
    public int field116;

    @OriginalMember(owner = "i", name = "m", descriptor = "I")
    public int field117;

    @OriginalMember(owner = "i", name = "n", descriptor = "I")
    public int field118;

    @OriginalMember(owner = "i", name = "o", descriptor = "I")
    public int field119;

    @OriginalMember(owner = "i", name = "a", descriptor = "[I")
    public int[] field105;

    @OriginalMember(owner = "i", name = "b", descriptor = "[I")
    public int[] field106;

    @OriginalMember(owner = "i", name = "c", descriptor = "[I")
    public int[] field107;

    @OriginalMember(owner = "i", name = "g", descriptor = "[I")
    public int[] field111;

    @OriginalMember(owner = "i", name = "h", descriptor = "[I")
    public int[] field112;

    @OriginalMember(owner = "i", name = "i", descriptor = "[I")
    public int[] field113;

    @OriginalMember(owner = "i", name = "d", descriptor = "[I")
    public int[] field108;

    @OriginalMember(owner = "i", name = "e", descriptor = "[I")
    public int[] field109;

    @OriginalMember(owner = "i", name = "f", descriptor = "[I")
    public int[] field110;

    @OriginalMember(owner = "i", name = "j", descriptor = "[I")
    public int[] field114;

    @OriginalMember(owner = "i", name = "p", descriptor = "[I")
    public static int[] field120 = new int[6];

    @OriginalMember(owner = "i", name = "q", descriptor = "[I")
    public static int[] field121 = new int[6];

    @OriginalMember(owner = "i", name = "r", descriptor = "[I")
    public static int[] field122 = new int[6];

    @OriginalMember(owner = "i", name = "s", descriptor = "[I")
    public static int[] field123 = new int[6];

    @OriginalMember(owner = "i", name = "t", descriptor = "[I")
    public static int[] field124 = new int[6];

    @OriginalMember(owner = "i", name = "u", descriptor = "[I")
    public static int[] field125 = new int[] { 1, 0 };

    @OriginalMember(owner = "i", name = "v", descriptor = "[I")
    public static int[] field126 = new int[] { 2, 1 };

    @OriginalMember(owner = "i", name = "w", descriptor = "[I")
    public static int[] field127 = new int[] { 3, 3 };

    @OriginalMember(owner = "i", name = "x", descriptor = "[[I")
    public static final int[][] field128 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "i", name = "y", descriptor = "[[I")
    public static final int[][] field129 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "i", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public TileOverlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg10 != arg17 || arg6 != arg10 || arg10 != arg14) {
            this.field115 = false;
        }
        this.field116 = arg12;
        this.field117 = arg0;
        this.field118 = arg8;
        this.field119 = arg19;
        short var21 = 128;
        int var22 = var21 / 2;
        int var23 = var21 / 4;
        int var24 = var21 * 3 / 4;
        int[] var25 = field128[arg12];
        int var26 = var25.length;
        this.field105 = new int[var26];
        this.field106 = new int[var26];
        this.field107 = new int[var26];
        int[] var27 = new int[var26];
        int[] var28 = new int[var26];
        int var29 = arg2 * var21;
        int var30 = arg5 * var21;
        for (int var31 = 0; var31 < var26; var31++) {
            int var45 = var25[var31];
            if ((var45 & 0x1) == 0 && var45 <= 8) {
                var45 = (var45 - arg0 - arg0 - 1 & 0x7) + 1;
            }
            if (var45 > 8 && var45 <= 12) {
                var45 = (var45 - arg0 - 9 & 0x3) + 9;
            }
            if (var45 > 12 && var45 <= 16) {
                var45 = (var45 - arg0 - 13 & 0x3) + 13;
            }
            int var46;
            int var47;
            int var48;
            int var49;
            int var50;
            if (var45 == 1) {
                var46 = var29;
                var47 = var30;
                var48 = arg10;
                var49 = arg18;
                var50 = arg15;
            } else if (var45 == 2) {
                var46 = var22 + var29;
                var47 = var30;
                var48 = arg10 + arg17 >> 1;
                var49 = arg3 + arg18 >> 1;
                var50 = arg1 + arg15 >> 1;
            } else if (var45 == 3) {
                var46 = var21 + var29;
                var47 = var30;
                var48 = arg17;
                var49 = arg3;
                var50 = arg1;
            } else if (var45 == 4) {
                var46 = var21 + var29;
                var47 = var22 + var30;
                var48 = arg6 + arg17 >> 1;
                var49 = arg3 + arg7 >> 1;
                var50 = arg1 + arg9 >> 1;
            } else if (var45 == 5) {
                var46 = var21 + var29;
                var47 = var21 + var30;
                var48 = arg6;
                var49 = arg7;
                var50 = arg9;
            } else if (var45 == 6) {
                var46 = var22 + var29;
                var47 = var21 + var30;
                var48 = arg6 + arg14 >> 1;
                var49 = arg7 + arg16 >> 1;
                var50 = arg9 + arg11 >> 1;
            } else if (var45 == 7) {
                var46 = var29;
                var47 = var21 + var30;
                var48 = arg14;
                var49 = arg16;
                var50 = arg11;
            } else if (var45 == 8) {
                var46 = var29;
                var47 = var22 + var30;
                var48 = arg10 + arg14 >> 1;
                var49 = arg16 + arg18 >> 1;
                var50 = arg11 + arg15 >> 1;
            } else if (var45 == 9) {
                var46 = var22 + var29;
                var47 = var23 + var30;
                var48 = arg10 + arg17 >> 1;
                var49 = arg3 + arg18 >> 1;
                var50 = arg1 + arg15 >> 1;
            } else if (var45 == 10) {
                var46 = var24 + var29;
                var47 = var22 + var30;
                var48 = arg6 + arg17 >> 1;
                var49 = arg3 + arg7 >> 1;
                var50 = arg1 + arg9 >> 1;
            } else if (var45 == 11) {
                var46 = var22 + var29;
                var47 = var24 + var30;
                var48 = arg6 + arg14 >> 1;
                var49 = arg7 + arg16 >> 1;
                var50 = arg9 + arg11 >> 1;
            } else if (var45 == 12) {
                var46 = var23 + var29;
                var47 = var22 + var30;
                var48 = arg10 + arg14 >> 1;
                var49 = arg16 + arg18 >> 1;
                var50 = arg11 + arg15 >> 1;
            } else if (var45 == 13) {
                var46 = var23 + var29;
                var47 = var23 + var30;
                var48 = arg10;
                var49 = arg18;
                var50 = arg15;
            } else if (var45 == 14) {
                var46 = var24 + var29;
                var47 = var23 + var30;
                var48 = arg17;
                var49 = arg3;
                var50 = arg1;
            } else if (var45 == 15) {
                var46 = var24 + var29;
                var47 = var24 + var30;
                var48 = arg6;
                var49 = arg7;
                var50 = arg9;
            } else {
                var46 = var23 + var29;
                var47 = var24 + var30;
                var48 = arg14;
                var49 = arg16;
                var50 = arg11;
            }
            this.field105[var31] = var46;
            this.field106[var31] = var48;
            this.field107[var31] = var47;
            var27[var31] = var49;
            var28[var31] = var50;
        }
        int[] var32 = field129[arg12];
        int var33 = var32.length / 4;
        this.field111 = new int[var33];
        this.field112 = new int[var33];
        this.field113 = new int[var33];
        this.field108 = new int[var33];
        this.field109 = new int[var33];
        this.field110 = new int[var33];
        if (arg13 != -1) {
            this.field114 = new int[var33];
        }
        int var34 = 0;
        int var35 = 88 / arg4;
        for (int var36 = 0; var36 < var33; var36++) {
            int var41 = var32[var34];
            int var42 = var32[var34 + 1];
            int var43 = var32[var34 + 2];
            int var44 = var32[var34 + 3];
            var34 += 4;
            if (var42 < 4) {
                var42 = var42 - arg0 & 0x3;
            }
            if (var43 < 4) {
                var43 = var43 - arg0 & 0x3;
            }
            if (var44 < 4) {
                var44 = var44 - arg0 & 0x3;
            }
            this.field111[var36] = var42;
            this.field112[var36] = var43;
            this.field113[var36] = var44;
            if (var41 == 0) {
                this.field108[var36] = var27[var42];
                this.field109[var36] = var27[var43];
                this.field110[var36] = var27[var44];
                if (this.field114 != null) {
                    this.field114[var36] = -1;
                }
            } else {
                this.field108[var36] = var28[var42];
                this.field109[var36] = var28[var43];
                this.field110[var36] = var28[var44];
                if (this.field114 != null) {
                    this.field114[var36] = arg13;
                }
            }
        }
        int var37 = arg10;
        int var38 = arg17;
        if (arg17 < arg10) {
            var37 = arg17;
        }
        if (arg17 > arg17) {
            var38 = arg17;
        }
        if (arg6 < var37) {
            var37 = arg6;
        }
        if (arg6 > var38) {
            var38 = arg6;
        }
        if (arg14 < var37) {
            var37 = arg14;
        }
        if (arg14 > var38) {
            var38 = arg14;
        }
        int var39 = var37 / 14;
        int var40 = var38 / 14;
    }
}
