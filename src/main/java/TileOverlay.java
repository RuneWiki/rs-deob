import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("h")
public class TileOverlay {

    @OriginalMember(owner = "h", name = "a", descriptor = "I")
    private int field89 = 8;

    @OriginalMember(owner = "h", name = "l", descriptor = "Z")
    public boolean field100 = true;

    @OriginalMember(owner = "h", name = "m", descriptor = "I")
    public int field101;

    @OriginalMember(owner = "h", name = "n", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "h", name = "o", descriptor = "I")
    public int field103;

    @OriginalMember(owner = "h", name = "p", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "h", name = "b", descriptor = "[I")
    public int[] field90;

    @OriginalMember(owner = "h", name = "c", descriptor = "[I")
    public int[] field91;

    @OriginalMember(owner = "h", name = "d", descriptor = "[I")
    public int[] field92;

    @OriginalMember(owner = "h", name = "h", descriptor = "[I")
    public int[] field96;

    @OriginalMember(owner = "h", name = "i", descriptor = "[I")
    public int[] field97;

    @OriginalMember(owner = "h", name = "j", descriptor = "[I")
    public int[] field98;

    @OriginalMember(owner = "h", name = "e", descriptor = "[I")
    public int[] field93;

    @OriginalMember(owner = "h", name = "f", descriptor = "[I")
    public int[] field94;

    @OriginalMember(owner = "h", name = "g", descriptor = "[I")
    public int[] field95;

    @OriginalMember(owner = "h", name = "k", descriptor = "[I")
    public int[] field99;

    @OriginalMember(owner = "h", name = "q", descriptor = "[I")
    public static int[] field105 = new int[6];

    @OriginalMember(owner = "h", name = "r", descriptor = "[I")
    public static int[] field106 = new int[6];

    @OriginalMember(owner = "h", name = "s", descriptor = "[I")
    public static int[] field107 = new int[6];

    @OriginalMember(owner = "h", name = "t", descriptor = "[I")
    public static int[] field108 = new int[6];

    @OriginalMember(owner = "h", name = "u", descriptor = "[I")
    public static int[] field109 = new int[6];

    @OriginalMember(owner = "h", name = "v", descriptor = "[I")
    public static int[] field110 = new int[] { 1, 0 };

    @OriginalMember(owner = "h", name = "w", descriptor = "[I")
    public static int[] field111 = new int[] { 2, 1 };

    @OriginalMember(owner = "h", name = "x", descriptor = "[I")
    public static int[] field112 = new int[] { 3, 3 };

    @OriginalMember(owner = "h", name = "y", descriptor = "[[I")
    public static final int[][] field113 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "h", name = "z", descriptor = "[[I")
    public static final int[][] field114 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "h", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIBII)V")
    public TileOverlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, byte arg17, int arg18, int arg19) {
        if (arg3 != arg13 || arg2 != arg3 || arg0 != arg3) {
            this.field100 = false;
        }
        this.field101 = arg15;
        this.field102 = arg8;
        this.field103 = arg18;
        this.field104 = arg19;
        short var21 = 128;
        int var22 = var21 / 2;
        int var23 = var21 / 4;
        int var24 = var21 * 3 / 4;
        int[] var25 = field113[arg15];
        int var26 = var25.length;
        this.field90 = new int[var26];
        this.field91 = new int[var26];
        this.field92 = new int[var26];
        int[] var27 = new int[var26];
        int[] var28 = new int[var26];
        int var29 = arg4 * var21;
        int var30 = arg1 * var21;
        for (int var31 = 0; var31 < var26; var31++) {
            int var44 = var25[var31];
            if ((var44 & 0x1) == 0 && var44 <= 8) {
                var44 = (var44 - arg8 - arg8 - 1 & 0x7) + 1;
            }
            if (var44 > 8 && var44 <= 12) {
                var44 = (var44 - arg8 - 9 & 0x3) + 9;
            }
            if (var44 > 12 && var44 <= 16) {
                var44 = (var44 - arg8 - 13 & 0x3) + 13;
            }
            int var45;
            int var46;
            int var47;
            int var48;
            int var49;
            if (var44 == 1) {
                var45 = var29;
                var46 = var30;
                var47 = arg3;
                var48 = arg6;
                var49 = arg11;
            } else if (var44 == 2) {
                var45 = var22 + var29;
                var46 = var30;
                var47 = arg3 + arg13 >> 1;
                var48 = arg6 + arg14 >> 1;
                var49 = arg7 + arg11 >> 1;
            } else if (var44 == 3) {
                var45 = var21 + var29;
                var46 = var30;
                var47 = arg13;
                var48 = arg14;
                var49 = arg7;
            } else if (var44 == 4) {
                var45 = var21 + var29;
                var46 = var22 + var30;
                var47 = arg2 + arg13 >> 1;
                var48 = arg9 + arg14 >> 1;
                var49 = arg7 + arg10 >> 1;
            } else if (var44 == 5) {
                var45 = var21 + var29;
                var46 = var21 + var30;
                var47 = arg2;
                var48 = arg9;
                var49 = arg10;
            } else if (var44 == 6) {
                var45 = var22 + var29;
                var46 = var21 + var30;
                var47 = arg0 + arg2 >> 1;
                var48 = arg9 + arg12 >> 1;
                var49 = arg10 + arg16 >> 1;
            } else if (var44 == 7) {
                var45 = var29;
                var46 = var21 + var30;
                var47 = arg0;
                var48 = arg12;
                var49 = arg16;
            } else if (var44 == 8) {
                var45 = var29;
                var46 = var22 + var30;
                var47 = arg0 + arg3 >> 1;
                var48 = arg6 + arg12 >> 1;
                var49 = arg11 + arg16 >> 1;
            } else if (var44 == 9) {
                var45 = var22 + var29;
                var46 = var23 + var30;
                var47 = arg3 + arg13 >> 1;
                var48 = arg6 + arg14 >> 1;
                var49 = arg7 + arg11 >> 1;
            } else if (var44 == 10) {
                var45 = var24 + var29;
                var46 = var22 + var30;
                var47 = arg2 + arg13 >> 1;
                var48 = arg9 + arg14 >> 1;
                var49 = arg7 + arg10 >> 1;
            } else if (var44 == 11) {
                var45 = var22 + var29;
                var46 = var24 + var30;
                var47 = arg0 + arg2 >> 1;
                var48 = arg9 + arg12 >> 1;
                var49 = arg10 + arg16 >> 1;
            } else if (var44 == 12) {
                var45 = var23 + var29;
                var46 = var22 + var30;
                var47 = arg0 + arg3 >> 1;
                var48 = arg6 + arg12 >> 1;
                var49 = arg11 + arg16 >> 1;
            } else if (var44 == 13) {
                var45 = var23 + var29;
                var46 = var23 + var30;
                var47 = arg3;
                var48 = arg6;
                var49 = arg11;
            } else if (var44 == 14) {
                var45 = var24 + var29;
                var46 = var23 + var30;
                var47 = arg13;
                var48 = arg14;
                var49 = arg7;
            } else if (var44 == 15) {
                var45 = var24 + var29;
                var46 = var24 + var30;
                var47 = arg2;
                var48 = arg9;
                var49 = arg10;
            } else {
                var45 = var23 + var29;
                var46 = var24 + var30;
                var47 = arg0;
                var48 = arg12;
                var49 = arg16;
            }
            this.field90[var31] = var45;
            this.field91[var31] = var47;
            this.field92[var31] = var46;
            var27[var31] = var48;
            var28[var31] = var49;
        }
        int[] var32 = field114[arg15];
        int var33 = var32.length / 4;
        if (arg17 != -119) {
            this.field89 = 136;
        }
        this.field96 = new int[var33];
        this.field97 = new int[var33];
        this.field98 = new int[var33];
        this.field93 = new int[var33];
        this.field94 = new int[var33];
        this.field95 = new int[var33];
        if (arg5 != -1) {
            this.field99 = new int[var33];
        }
        int var34 = 0;
        for (int var35 = 0; var35 < var33; var35++) {
            int var40 = var32[var34];
            int var41 = var32[var34 + 1];
            int var42 = var32[var34 + 2];
            int var43 = var32[var34 + 3];
            var34 += 4;
            if (var41 < 4) {
                var41 = var41 - arg8 & 0x3;
            }
            if (var42 < 4) {
                var42 = var42 - arg8 & 0x3;
            }
            if (var43 < 4) {
                var43 = var43 - arg8 & 0x3;
            }
            this.field96[var35] = var41;
            this.field97[var35] = var42;
            this.field98[var35] = var43;
            if (var40 == 0) {
                this.field93[var35] = var27[var41];
                this.field94[var35] = var27[var42];
                this.field95[var35] = var27[var43];
                if (this.field99 != null) {
                    this.field99[var35] = -1;
                }
            } else {
                this.field93[var35] = var28[var41];
                this.field94[var35] = var28[var42];
                this.field95[var35] = var28[var43];
                if (this.field99 != null) {
                    this.field99[var35] = arg5;
                }
            }
        }
        int var36 = arg3;
        int var37 = arg13;
        if (arg13 < arg3) {
            var36 = arg13;
        }
        if (arg13 > arg13) {
            var37 = arg13;
        }
        if (arg2 < var36) {
            var36 = arg2;
        }
        if (arg2 > var37) {
            var37 = arg2;
        }
        if (arg0 < var36) {
            var36 = arg0;
        }
        if (arg0 > var37) {
            var37 = arg0;
        }
        int var38 = var36 / 14;
        int var39 = var37 / 14;
    }
}
