import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("i")
public class TileOverlay {

    @OriginalMember(owner = "i", name = "k", descriptor = "Z")
    public boolean field108 = true;

    @OriginalMember(owner = "i", name = "l", descriptor = "I")
    public int field109;

    @OriginalMember(owner = "i", name = "m", descriptor = "I")
    public int field110;

    @OriginalMember(owner = "i", name = "n", descriptor = "I")
    public int field111;

    @OriginalMember(owner = "i", name = "o", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "i", name = "a", descriptor = "[I")
    public int[] field98;

    @OriginalMember(owner = "i", name = "b", descriptor = "[I")
    public int[] field99;

    @OriginalMember(owner = "i", name = "c", descriptor = "[I")
    public int[] field100;

    @OriginalMember(owner = "i", name = "g", descriptor = "[I")
    public int[] field104;

    @OriginalMember(owner = "i", name = "h", descriptor = "[I")
    public int[] field105;

    @OriginalMember(owner = "i", name = "i", descriptor = "[I")
    public int[] field106;

    @OriginalMember(owner = "i", name = "d", descriptor = "[I")
    public int[] field101;

    @OriginalMember(owner = "i", name = "e", descriptor = "[I")
    public int[] field102;

    @OriginalMember(owner = "i", name = "f", descriptor = "[I")
    public int[] field103;

    @OriginalMember(owner = "i", name = "j", descriptor = "[I")
    public int[] field107;

    @OriginalMember(owner = "i", name = "p", descriptor = "[I")
    public static int[] field113 = new int[6];

    @OriginalMember(owner = "i", name = "q", descriptor = "[I")
    public static int[] field114 = new int[6];

    @OriginalMember(owner = "i", name = "r", descriptor = "[I")
    public static int[] field115 = new int[6];

    @OriginalMember(owner = "i", name = "s", descriptor = "[I")
    public static int[] field116 = new int[6];

    @OriginalMember(owner = "i", name = "t", descriptor = "[I")
    public static int[] field117 = new int[6];

    @OriginalMember(owner = "i", name = "u", descriptor = "[I")
    public static int[] field118 = new int[] { 1, 0 };

    @OriginalMember(owner = "i", name = "v", descriptor = "[I")
    public static int[] field119 = new int[] { 2, 1 };

    @OriginalMember(owner = "i", name = "w", descriptor = "[I")
    public static int[] field120 = new int[] { 3, 3 };

    @OriginalMember(owner = "i", name = "x", descriptor = "[[I")
    public static final int[][] field121 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "i", name = "y", descriptor = "[[I")
    public static final int[][] field122 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "i", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public TileOverlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg8 != arg11 || arg8 != arg19 || arg8 != arg14) {
            this.field108 = false;
        }
        this.field109 = arg2;
        this.field110 = arg6;
        this.field111 = arg13;
        this.field112 = arg5;
        short var21 = 128;
        int var22 = var21 / 2;
        int var23 = var21 / 4;
        int var24 = var21 * 3 / 4;
        int[] var25 = field121[arg2];
        int var26 = var25.length;
        this.field98 = new int[var26];
        this.field99 = new int[var26];
        this.field100 = new int[var26];
        int[] var27 = new int[var26];
        int[] var28 = new int[var26];
        int var29 = arg9 * var21;
        int var30 = arg4 * var21;
        for (int var31 = 0; var31 < var26; var31++) {
            int var44 = var25[var31];
            if ((var44 & 0x1) == 0 && var44 <= 8) {
                var44 = (var44 - arg6 - arg6 - 1 & 0x7) + 1;
            }
            if (var44 > 8 && var44 <= 12) {
                var44 = (var44 - arg6 - 9 & 0x3) + 9;
            }
            if (var44 > 12 && var44 <= 16) {
                var44 = (var44 - arg6 - 13 & 0x3) + 13;
            }
            int var45;
            int var46;
            int var47;
            int var48;
            int var49;
            if (var44 == 1) {
                var45 = var29;
                var46 = var30;
                var47 = arg8;
                var48 = arg0;
                var49 = arg15;
            } else if (var44 == 2) {
                var45 = var22 + var29;
                var46 = var30;
                var47 = arg8 + arg11 >> 1;
                var48 = arg0 + arg7 >> 1;
                var49 = arg10 + arg15 >> 1;
            } else if (var44 == 3) {
                var45 = var21 + var29;
                var46 = var30;
                var47 = arg11;
                var48 = arg7;
                var49 = arg10;
            } else if (var44 == 4) {
                var45 = var21 + var29;
                var46 = var22 + var30;
                var47 = arg11 + arg19 >> 1;
                var48 = arg7 + arg16 >> 1;
                var49 = arg1 + arg10 >> 1;
            } else if (var44 == 5) {
                var45 = var21 + var29;
                var46 = var21 + var30;
                var47 = arg19;
                var48 = arg16;
                var49 = arg1;
            } else if (var44 == 6) {
                var45 = var22 + var29;
                var46 = var21 + var30;
                var47 = arg14 + arg19 >> 1;
                var48 = arg12 + arg16 >> 1;
                var49 = arg1 + arg17 >> 1;
            } else if (var44 == 7) {
                var45 = var29;
                var46 = var21 + var30;
                var47 = arg14;
                var48 = arg12;
                var49 = arg17;
            } else if (var44 == 8) {
                var45 = var29;
                var46 = var22 + var30;
                var47 = arg8 + arg14 >> 1;
                var48 = arg0 + arg12 >> 1;
                var49 = arg15 + arg17 >> 1;
            } else if (var44 == 9) {
                var45 = var22 + var29;
                var46 = var23 + var30;
                var47 = arg8 + arg11 >> 1;
                var48 = arg0 + arg7 >> 1;
                var49 = arg10 + arg15 >> 1;
            } else if (var44 == 10) {
                var45 = var24 + var29;
                var46 = var22 + var30;
                var47 = arg11 + arg19 >> 1;
                var48 = arg7 + arg16 >> 1;
                var49 = arg1 + arg10 >> 1;
            } else if (var44 == 11) {
                var45 = var22 + var29;
                var46 = var24 + var30;
                var47 = arg14 + arg19 >> 1;
                var48 = arg12 + arg16 >> 1;
                var49 = arg1 + arg17 >> 1;
            } else if (var44 == 12) {
                var45 = var23 + var29;
                var46 = var22 + var30;
                var47 = arg8 + arg14 >> 1;
                var48 = arg0 + arg12 >> 1;
                var49 = arg15 + arg17 >> 1;
            } else if (var44 == 13) {
                var45 = var23 + var29;
                var46 = var23 + var30;
                var47 = arg8;
                var48 = arg0;
                var49 = arg15;
            } else if (var44 == 14) {
                var45 = var24 + var29;
                var46 = var23 + var30;
                var47 = arg11;
                var48 = arg7;
                var49 = arg10;
            } else if (var44 == 15) {
                var45 = var24 + var29;
                var46 = var24 + var30;
                var47 = arg19;
                var48 = arg16;
                var49 = arg1;
            } else {
                var45 = var23 + var29;
                var46 = var24 + var30;
                var47 = arg14;
                var48 = arg12;
                var49 = arg17;
            }
            this.field98[var31] = var45;
            this.field99[var31] = var47;
            this.field100[var31] = var46;
            var27[var31] = var48;
            var28[var31] = var49;
        }
        int[] var32 = field122[arg2];
        int var33 = var32.length / 4;
        this.field104 = new int[var33];
        this.field105 = new int[var33];
        this.field106 = new int[var33];
        this.field101 = new int[var33];
        this.field102 = new int[var33];
        if (arg3 != 0) {
            throw new NullPointerException();
        }
        this.field103 = new int[var33];
        if (arg18 != -1) {
            this.field107 = new int[var33];
        }
        int var34 = 0;
        for (int var35 = 0; var35 < var33; var35++) {
            int var40 = var32[var34];
            int var41 = var32[var34 + 1];
            int var42 = var32[var34 + 2];
            int var43 = var32[var34 + 3];
            var34 += 4;
            if (var41 < 4) {
                var41 = var41 - arg6 & 0x3;
            }
            if (var42 < 4) {
                var42 = var42 - arg6 & 0x3;
            }
            if (var43 < 4) {
                var43 = var43 - arg6 & 0x3;
            }
            this.field104[var35] = var41;
            this.field105[var35] = var42;
            this.field106[var35] = var43;
            if (var40 == 0) {
                this.field101[var35] = var27[var41];
                this.field102[var35] = var27[var42];
                this.field103[var35] = var27[var43];
                if (this.field107 != null) {
                    this.field107[var35] = -1;
                }
            } else {
                this.field101[var35] = var28[var41];
                this.field102[var35] = var28[var42];
                this.field103[var35] = var28[var43];
                if (this.field107 != null) {
                    this.field107[var35] = arg18;
                }
            }
        }
        int var36 = arg8;
        int var37 = arg11;
        if (arg11 < arg8) {
            var36 = arg11;
        }
        if (arg11 > arg11) {
            var37 = arg11;
        }
        if (arg19 < var36) {
            var36 = arg19;
        }
        if (arg19 > var37) {
            var37 = arg19;
        }
        if (arg14 < var36) {
            var36 = arg14;
        }
        if (arg14 > var37) {
            var37 = arg14;
        }
        int var38 = var36 / 14;
        int var39 = var37 / 14;
        if (Linkable.field289) {
        }
    }
}
