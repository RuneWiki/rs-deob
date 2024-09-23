import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("j")
public class TileOverlay {

    @OriginalMember(owner = "j", name = "k", descriptor = "Z")
    public boolean field204 = true;

    @OriginalMember(owner = "j", name = "l", descriptor = "I")
    public int field205;

    @OriginalMember(owner = "j", name = "m", descriptor = "I")
    public int field206;

    @OriginalMember(owner = "j", name = "n", descriptor = "I")
    public int field207;

    @OriginalMember(owner = "j", name = "o", descriptor = "I")
    public int field208;

    @OriginalMember(owner = "j", name = "a", descriptor = "[I")
    public int[] field194;

    @OriginalMember(owner = "j", name = "b", descriptor = "[I")
    public int[] field195;

    @OriginalMember(owner = "j", name = "c", descriptor = "[I")
    public int[] field196;

    @OriginalMember(owner = "j", name = "g", descriptor = "[I")
    public int[] field200;

    @OriginalMember(owner = "j", name = "h", descriptor = "[I")
    public int[] field201;

    @OriginalMember(owner = "j", name = "i", descriptor = "[I")
    public int[] field202;

    @OriginalMember(owner = "j", name = "d", descriptor = "[I")
    public int[] field197;

    @OriginalMember(owner = "j", name = "e", descriptor = "[I")
    public int[] field198;

    @OriginalMember(owner = "j", name = "f", descriptor = "[I")
    public int[] field199;

    @OriginalMember(owner = "j", name = "j", descriptor = "[I")
    public int[] field203;

    @OriginalMember(owner = "j", name = "p", descriptor = "[I")
    public static int[] field209 = new int[6];

    @OriginalMember(owner = "j", name = "q", descriptor = "[I")
    public static int[] field210 = new int[6];

    @OriginalMember(owner = "j", name = "r", descriptor = "[I")
    public static int[] field211 = new int[6];

    @OriginalMember(owner = "j", name = "s", descriptor = "[I")
    public static int[] field212 = new int[6];

    @OriginalMember(owner = "j", name = "t", descriptor = "[I")
    public static int[] field213 = new int[6];

    @OriginalMember(owner = "j", name = "u", descriptor = "[I")
    public static int[] field214 = new int[] { 1, 0 };

    @OriginalMember(owner = "j", name = "v", descriptor = "[I")
    public static int[] field215 = new int[] { 2, 1 };

    @OriginalMember(owner = "j", name = "w", descriptor = "[I")
    public static int[] field216 = new int[] { 3, 3 };

    @OriginalMember(owner = "j", name = "x", descriptor = "[[I")
    public static final int[][] field217 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "j", name = "y", descriptor = "[[I")
    public static final int[][] field218 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "j", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public TileOverlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg1 != arg3 || arg0 != arg1 || arg1 != arg13) {
            this.field204 = false;
        }
        this.field205 = arg12;
        this.field206 = arg11;
        this.field207 = arg18;
        this.field208 = arg2;
        short var21 = 128;
        int var22 = var21 / 2;
        int var23 = var21 / 4;
        int var24 = var21 * 3 / 4;
        int[] var25 = field217[arg12];
        int var26 = var25.length;
        this.field194 = new int[var26];
        this.field195 = new int[var26];
        if (arg16 != -14240) {
            throw new NullPointerException();
        }
        this.field196 = new int[var26];
        int[] var27 = new int[var26];
        int[] var28 = new int[var26];
        int var29 = arg17 * var21;
        int var30 = arg6 * var21;
        for (int var31 = 0; var31 < var26; var31++) {
            int var44 = var25[var31];
            if ((var44 & 0x1) == 0 && var44 <= 8) {
                var44 = (var44 - arg11 - arg11 - 1 & 0x7) + 1;
            }
            if (var44 > 8 && var44 <= 12) {
                var44 = (var44 - arg11 - 9 & 0x3) + 9;
            }
            if (var44 > 12 && var44 <= 16) {
                var44 = (var44 - arg11 - 13 & 0x3) + 13;
            }
            int var45;
            int var46;
            int var47;
            int var48;
            int var49;
            if (var44 == 1) {
                var45 = var29;
                var46 = var30;
                var47 = arg1;
                var48 = arg5;
                var49 = arg9;
            } else if (var44 == 2) {
                var45 = var22 + var29;
                var46 = var30;
                var47 = arg1 + arg3 >> 1;
                var48 = arg5 + arg10 >> 1;
                var49 = arg8 + arg9 >> 1;
            } else if (var44 == 3) {
                var45 = var21 + var29;
                var46 = var30;
                var47 = arg3;
                var48 = arg10;
                var49 = arg8;
            } else if (var44 == 4) {
                var45 = var21 + var29;
                var46 = var22 + var30;
                var47 = arg0 + arg3 >> 1;
                var48 = arg10 + arg15 >> 1;
                var49 = arg8 + arg14 >> 1;
            } else if (var44 == 5) {
                var45 = var21 + var29;
                var46 = var21 + var30;
                var47 = arg0;
                var48 = arg15;
                var49 = arg14;
            } else if (var44 == 6) {
                var45 = var22 + var29;
                var46 = var21 + var30;
                var47 = arg0 + arg13 >> 1;
                var48 = arg7 + arg15 >> 1;
                var49 = arg4 + arg14 >> 1;
            } else if (var44 == 7) {
                var45 = var29;
                var46 = var21 + var30;
                var47 = arg13;
                var48 = arg7;
                var49 = arg4;
            } else if (var44 == 8) {
                var45 = var29;
                var46 = var22 + var30;
                var47 = arg1 + arg13 >> 1;
                var48 = arg5 + arg7 >> 1;
                var49 = arg4 + arg9 >> 1;
            } else if (var44 == 9) {
                var45 = var22 + var29;
                var46 = var23 + var30;
                var47 = arg1 + arg3 >> 1;
                var48 = arg5 + arg10 >> 1;
                var49 = arg8 + arg9 >> 1;
            } else if (var44 == 10) {
                var45 = var24 + var29;
                var46 = var22 + var30;
                var47 = arg0 + arg3 >> 1;
                var48 = arg10 + arg15 >> 1;
                var49 = arg8 + arg14 >> 1;
            } else if (var44 == 11) {
                var45 = var22 + var29;
                var46 = var24 + var30;
                var47 = arg0 + arg13 >> 1;
                var48 = arg7 + arg15 >> 1;
                var49 = arg4 + arg14 >> 1;
            } else if (var44 == 12) {
                var45 = var23 + var29;
                var46 = var22 + var30;
                var47 = arg1 + arg13 >> 1;
                var48 = arg5 + arg7 >> 1;
                var49 = arg4 + arg9 >> 1;
            } else if (var44 == 13) {
                var45 = var23 + var29;
                var46 = var23 + var30;
                var47 = arg1;
                var48 = arg5;
                var49 = arg9;
            } else if (var44 == 14) {
                var45 = var24 + var29;
                var46 = var23 + var30;
                var47 = arg3;
                var48 = arg10;
                var49 = arg8;
            } else if (var44 == 15) {
                var45 = var24 + var29;
                var46 = var24 + var30;
                var47 = arg0;
                var48 = arg15;
                var49 = arg14;
            } else {
                var45 = var23 + var29;
                var46 = var24 + var30;
                var47 = arg13;
                var48 = arg7;
                var49 = arg4;
            }
            this.field194[var31] = var45;
            this.field195[var31] = var47;
            this.field196[var31] = var46;
            var27[var31] = var48;
            var28[var31] = var49;
        }
        int[] var32 = field218[arg12];
        int var33 = var32.length / 4;
        this.field200 = new int[var33];
        this.field201 = new int[var33];
        this.field202 = new int[var33];
        this.field197 = new int[var33];
        this.field198 = new int[var33];
        this.field199 = new int[var33];
        if (arg19 != -1) {
            this.field203 = new int[var33];
        }
        int var34 = 0;
        for (int var35 = 0; var35 < var33; var35++) {
            int var40 = var32[var34];
            int var41 = var32[var34 + 1];
            int var42 = var32[var34 + 2];
            int var43 = var32[var34 + 3];
            var34 += 4;
            if (var41 < 4) {
                var41 = var41 - arg11 & 0x3;
            }
            if (var42 < 4) {
                var42 = var42 - arg11 & 0x3;
            }
            if (var43 < 4) {
                var43 = var43 - arg11 & 0x3;
            }
            this.field200[var35] = var41;
            this.field201[var35] = var42;
            this.field202[var35] = var43;
            if (var40 == 0) {
                this.field197[var35] = var27[var41];
                this.field198[var35] = var27[var42];
                this.field199[var35] = var27[var43];
                if (this.field203 != null) {
                    this.field203[var35] = -1;
                }
            } else {
                this.field197[var35] = var28[var41];
                this.field198[var35] = var28[var42];
                this.field199[var35] = var28[var43];
                if (this.field203 != null) {
                    this.field203[var35] = arg19;
                }
            }
        }
        int var36 = arg1;
        int var37 = arg3;
        if (arg3 < arg1) {
            var36 = arg3;
        }
        if (arg3 > arg3) {
            var37 = arg3;
        }
        if (arg0 < var36) {
            var36 = arg0;
        }
        if (arg0 > var37) {
            var37 = arg0;
        }
        if (arg13 < var36) {
            var36 = arg13;
        }
        if (arg13 > var37) {
            var37 = arg13;
        }
        int var38 = var36 / 14;
        int var39 = var37 / 14;
        if (Linkable.field393) {
        }
    }
}
