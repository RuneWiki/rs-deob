import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("j")
public class TileOverlay {

    @OriginalMember(owner = "j", name = "k", descriptor = "Z")
    public boolean field193 = true;

    @OriginalMember(owner = "j", name = "l", descriptor = "I")
    public int field194;

    @OriginalMember(owner = "j", name = "m", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "j", name = "n", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "j", name = "o", descriptor = "I")
    public int field197;

    @OriginalMember(owner = "j", name = "a", descriptor = "[I")
    public int[] field183;

    @OriginalMember(owner = "j", name = "b", descriptor = "[I")
    public int[] field184;

    @OriginalMember(owner = "j", name = "c", descriptor = "[I")
    public int[] field185;

    @OriginalMember(owner = "j", name = "g", descriptor = "[I")
    public int[] field189;

    @OriginalMember(owner = "j", name = "h", descriptor = "[I")
    public int[] field190;

    @OriginalMember(owner = "j", name = "i", descriptor = "[I")
    public int[] field191;

    @OriginalMember(owner = "j", name = "d", descriptor = "[I")
    public int[] field186;

    @OriginalMember(owner = "j", name = "e", descriptor = "[I")
    public int[] field187;

    @OriginalMember(owner = "j", name = "f", descriptor = "[I")
    public int[] field188;

    @OriginalMember(owner = "j", name = "j", descriptor = "[I")
    public int[] field192;

    @OriginalMember(owner = "j", name = "p", descriptor = "[I")
    public static int[] field198 = new int[6];

    @OriginalMember(owner = "j", name = "q", descriptor = "[I")
    public static int[] field199 = new int[6];

    @OriginalMember(owner = "j", name = "r", descriptor = "[I")
    public static int[] field200 = new int[6];

    @OriginalMember(owner = "j", name = "s", descriptor = "[I")
    public static int[] field201 = new int[6];

    @OriginalMember(owner = "j", name = "t", descriptor = "[I")
    public static int[] field202 = new int[6];

    @OriginalMember(owner = "j", name = "u", descriptor = "[I")
    public static int[] field203 = new int[] { 1, 0 };

    @OriginalMember(owner = "j", name = "v", descriptor = "[I")
    public static int[] field204 = new int[] { 2, 1 };

    @OriginalMember(owner = "j", name = "w", descriptor = "[I")
    public static int[] field205 = new int[] { 3, 3 };

    @OriginalMember(owner = "j", name = "x", descriptor = "[[I")
    public static final int[][] field206 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "j", name = "y", descriptor = "[[I")
    public static final int[][] field207 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "j", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public TileOverlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg7 != arg17 || arg7 != arg19 || arg7 != arg16) {
            this.field193 = false;
        }
        this.field194 = arg3;
        this.field195 = arg15;
        this.field196 = arg10;
        this.field197 = arg11;
        short var21 = 128;
        int var22 = var21 / 2;
        int var23 = var21 / 4;
        int var24 = var21 * 3 / 4;
        int[] var25 = field206[arg3];
        int var26 = var25.length;
        this.field183 = new int[var26];
        this.field184 = new int[var26];
        this.field185 = new int[var26];
        int[] var27 = new int[var26];
        int[] var28 = new int[var26];
        int var29 = arg0 * var21;
        int var30 = arg12 * var21;
        for (int var31 = 0; var31 < var26; var31++) {
            int var45 = var25[var31];
            if ((var45 & 0x1) == 0 && var45 <= 8) {
                var45 = (var45 - arg15 - arg15 - 1 & 0x7) + 1;
            }
            if (var45 > 8 && var45 <= 12) {
                var45 = (var45 - arg15 - 9 & 0x3) + 9;
            }
            if (var45 > 12 && var45 <= 16) {
                var45 = (var45 - arg15 - 13 & 0x3) + 13;
            }
            int var46;
            int var47;
            int var48;
            int var49;
            int var50;
            if (var45 == 1) {
                var46 = var29;
                var47 = var30;
                var48 = arg7;
                var49 = arg13;
                var50 = arg14;
            } else if (var45 == 2) {
                var46 = var22 + var29;
                var47 = var30;
                var48 = arg7 + arg17 >> 1;
                var49 = arg4 + arg13 >> 1;
                var50 = arg1 + arg14 >> 1;
            } else if (var45 == 3) {
                var46 = var21 + var29;
                var47 = var30;
                var48 = arg17;
                var49 = arg4;
                var50 = arg1;
            } else if (var45 == 4) {
                var46 = var21 + var29;
                var47 = var22 + var30;
                var48 = arg17 + arg19 >> 1;
                var49 = arg4 + arg18 >> 1;
                var50 = arg1 + arg9 >> 1;
            } else if (var45 == 5) {
                var46 = var21 + var29;
                var47 = var21 + var30;
                var48 = arg19;
                var49 = arg18;
                var50 = arg9;
            } else if (var45 == 6) {
                var46 = var22 + var29;
                var47 = var21 + var30;
                var48 = arg16 + arg19 >> 1;
                var49 = arg6 + arg18 >> 1;
                var50 = arg2 + arg9 >> 1;
            } else if (var45 == 7) {
                var46 = var29;
                var47 = var21 + var30;
                var48 = arg16;
                var49 = arg6;
                var50 = arg2;
            } else if (var45 == 8) {
                var46 = var29;
                var47 = var22 + var30;
                var48 = arg7 + arg16 >> 1;
                var49 = arg6 + arg13 >> 1;
                var50 = arg2 + arg14 >> 1;
            } else if (var45 == 9) {
                var46 = var22 + var29;
                var47 = var23 + var30;
                var48 = arg7 + arg17 >> 1;
                var49 = arg4 + arg13 >> 1;
                var50 = arg1 + arg14 >> 1;
            } else if (var45 == 10) {
                var46 = var24 + var29;
                var47 = var22 + var30;
                var48 = arg17 + arg19 >> 1;
                var49 = arg4 + arg18 >> 1;
                var50 = arg1 + arg9 >> 1;
            } else if (var45 == 11) {
                var46 = var22 + var29;
                var47 = var24 + var30;
                var48 = arg16 + arg19 >> 1;
                var49 = arg6 + arg18 >> 1;
                var50 = arg2 + arg9 >> 1;
            } else if (var45 == 12) {
                var46 = var23 + var29;
                var47 = var22 + var30;
                var48 = arg7 + arg16 >> 1;
                var49 = arg6 + arg13 >> 1;
                var50 = arg2 + arg14 >> 1;
            } else if (var45 == 13) {
                var46 = var23 + var29;
                var47 = var23 + var30;
                var48 = arg7;
                var49 = arg13;
                var50 = arg14;
            } else if (var45 == 14) {
                var46 = var24 + var29;
                var47 = var23 + var30;
                var48 = arg17;
                var49 = arg4;
                var50 = arg1;
            } else if (var45 == 15) {
                var46 = var24 + var29;
                var47 = var24 + var30;
                var48 = arg19;
                var49 = arg18;
                var50 = arg9;
            } else {
                var46 = var23 + var29;
                var47 = var24 + var30;
                var48 = arg16;
                var49 = arg6;
                var50 = arg2;
            }
            this.field183[var31] = var46;
            this.field184[var31] = var48;
            this.field185[var31] = var47;
            var27[var31] = var49;
            var28[var31] = var50;
        }
        int[] var32 = field207[arg3];
        if (arg5 >= 0) {
            for (int var33 = 1; var33 > 0; var33++) {
            }
        }
        int var34 = var32.length / 4;
        this.field189 = new int[var34];
        this.field190 = new int[var34];
        this.field191 = new int[var34];
        this.field186 = new int[var34];
        this.field187 = new int[var34];
        this.field188 = new int[var34];
        if (arg8 != -1) {
            this.field192 = new int[var34];
        }
        int var35 = 0;
        for (int var36 = 0; var36 < var34; var36++) {
            int var41 = var32[var35];
            int var42 = var32[var35 + 1];
            int var43 = var32[var35 + 2];
            int var44 = var32[var35 + 3];
            var35 += 4;
            if (var42 < 4) {
                var42 = var42 - arg15 & 0x3;
            }
            if (var43 < 4) {
                var43 = var43 - arg15 & 0x3;
            }
            if (var44 < 4) {
                var44 = var44 - arg15 & 0x3;
            }
            this.field189[var36] = var42;
            this.field190[var36] = var43;
            this.field191[var36] = var44;
            if (var41 == 0) {
                this.field186[var36] = var27[var42];
                this.field187[var36] = var27[var43];
                this.field188[var36] = var27[var44];
                if (this.field192 != null) {
                    this.field192[var36] = -1;
                }
            } else {
                this.field186[var36] = var28[var42];
                this.field187[var36] = var28[var43];
                this.field188[var36] = var28[var44];
                if (this.field192 != null) {
                    this.field192[var36] = arg8;
                }
            }
        }
        int var37 = arg7;
        int var38 = arg17;
        if (arg17 < arg7) {
            var37 = arg17;
        }
        if (arg17 > arg17) {
            var38 = arg17;
        }
        if (arg19 < var37) {
            var37 = arg19;
        }
        if (arg19 > var38) {
            var38 = arg19;
        }
        if (arg16 < var37) {
            var37 = arg16;
        }
        if (arg16 > var38) {
            var38 = arg16;
        }
        int var39 = var37 / 14;
        int var40 = var38 / 14;
        if (Linkable.field377) {
        }
    }
}
