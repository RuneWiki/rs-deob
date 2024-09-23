import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("j")
public class TileOverlay {

    @OriginalMember(owner = "j", name = "k", descriptor = "Z")
    public boolean field184 = true;

    @OriginalMember(owner = "j", name = "l", descriptor = "I")
    public int field185;

    @OriginalMember(owner = "j", name = "m", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "j", name = "n", descriptor = "I")
    public int field187;

    @OriginalMember(owner = "j", name = "o", descriptor = "I")
    public int field188;

    @OriginalMember(owner = "j", name = "a", descriptor = "[I")
    public int[] field174;

    @OriginalMember(owner = "j", name = "b", descriptor = "[I")
    public int[] field175;

    @OriginalMember(owner = "j", name = "c", descriptor = "[I")
    public int[] field176;

    @OriginalMember(owner = "j", name = "g", descriptor = "[I")
    public int[] field180;

    @OriginalMember(owner = "j", name = "h", descriptor = "[I")
    public int[] field181;

    @OriginalMember(owner = "j", name = "i", descriptor = "[I")
    public int[] field182;

    @OriginalMember(owner = "j", name = "d", descriptor = "[I")
    public int[] field177;

    @OriginalMember(owner = "j", name = "e", descriptor = "[I")
    public int[] field178;

    @OriginalMember(owner = "j", name = "f", descriptor = "[I")
    public int[] field179;

    @OriginalMember(owner = "j", name = "j", descriptor = "[I")
    public int[] field183;

    @OriginalMember(owner = "j", name = "p", descriptor = "[I")
    public static int[] field189 = new int[6];

    @OriginalMember(owner = "j", name = "q", descriptor = "[I")
    public static int[] field190 = new int[6];

    @OriginalMember(owner = "j", name = "r", descriptor = "[I")
    public static int[] field191 = new int[6];

    @OriginalMember(owner = "j", name = "s", descriptor = "[I")
    public static int[] field192 = new int[6];

    @OriginalMember(owner = "j", name = "t", descriptor = "[I")
    public static int[] field193 = new int[6];

    @OriginalMember(owner = "j", name = "u", descriptor = "[I")
    public static int[] field194 = new int[] { 1, 0 };

    @OriginalMember(owner = "j", name = "v", descriptor = "[I")
    public static int[] field195 = new int[] { 2, 1 };

    @OriginalMember(owner = "j", name = "w", descriptor = "[I")
    public static int[] field196 = new int[] { 3, 3 };

    @OriginalMember(owner = "j", name = "x", descriptor = "[[I")
    public static final int[][] field197 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "j", name = "y", descriptor = "[[I")
    public static final int[][] field198 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "j", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public TileOverlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg4 != arg6 || arg2 != arg4 || arg3 != arg4) {
            this.field184 = false;
        }
        this.field185 = arg15;
        this.field186 = arg10;
        this.field187 = arg8;
        this.field188 = arg19;
        short var21 = 128;
        int var22 = var21 / 2;
        int var23 = var21 / 4;
        int var24 = var21 * 3 / 4;
        int[] var25 = field197[arg15];
        int var26 = var25.length;
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        this.field174 = new int[var26];
        this.field175 = new int[var26];
        this.field176 = new int[var26];
        int[] var27 = new int[var26];
        int[] var28 = new int[var26];
        int var29 = arg16 * var21;
        int var30 = arg11 * var21;
        for (int var31 = 0; var31 < var26; var31++) {
            int var44 = var25[var31];
            if ((var44 & 0x1) == 0 && var44 <= 8) {
                var44 = (var44 - arg10 - arg10 - 1 & 0x7) + 1;
            }
            if (var44 > 8 && var44 <= 12) {
                var44 = (var44 - arg10 - 9 & 0x3) + 9;
            }
            if (var44 > 12 && var44 <= 16) {
                var44 = (var44 - arg10 - 13 & 0x3) + 13;
            }
            int var45;
            int var46;
            int var47;
            int var48;
            int var49;
            if (var44 == 1) {
                var45 = var29;
                var46 = var30;
                var47 = arg4;
                var48 = arg13;
                var49 = arg0;
            } else if (var44 == 2) {
                var45 = var22 + var29;
                var46 = var30;
                var47 = arg4 + arg6 >> 1;
                var48 = arg9 + arg13 >> 1;
                var49 = arg0 + arg17 >> 1;
            } else if (var44 == 3) {
                var45 = var21 + var29;
                var46 = var30;
                var47 = arg6;
                var48 = arg9;
                var49 = arg17;
            } else if (var44 == 4) {
                var45 = var21 + var29;
                var46 = var22 + var30;
                var47 = arg2 + arg6 >> 1;
                var48 = arg9 + arg12 >> 1;
                var49 = arg17 + arg18 >> 1;
            } else if (var44 == 5) {
                var45 = var21 + var29;
                var46 = var21 + var30;
                var47 = arg2;
                var48 = arg12;
                var49 = arg18;
            } else if (var44 == 6) {
                var45 = var22 + var29;
                var46 = var21 + var30;
                var47 = arg2 + arg3 >> 1;
                var48 = arg7 + arg12 >> 1;
                var49 = arg5 + arg18 >> 1;
            } else if (var44 == 7) {
                var45 = var29;
                var46 = var21 + var30;
                var47 = arg3;
                var48 = arg7;
                var49 = arg5;
            } else if (var44 == 8) {
                var45 = var29;
                var46 = var22 + var30;
                var47 = arg3 + arg4 >> 1;
                var48 = arg7 + arg13 >> 1;
                var49 = arg0 + arg5 >> 1;
            } else if (var44 == 9) {
                var45 = var22 + var29;
                var46 = var23 + var30;
                var47 = arg4 + arg6 >> 1;
                var48 = arg9 + arg13 >> 1;
                var49 = arg0 + arg17 >> 1;
            } else if (var44 == 10) {
                var45 = var24 + var29;
                var46 = var22 + var30;
                var47 = arg2 + arg6 >> 1;
                var48 = arg9 + arg12 >> 1;
                var49 = arg17 + arg18 >> 1;
            } else if (var44 == 11) {
                var45 = var22 + var29;
                var46 = var24 + var30;
                var47 = arg2 + arg3 >> 1;
                var48 = arg7 + arg12 >> 1;
                var49 = arg5 + arg18 >> 1;
            } else if (var44 == 12) {
                var45 = var23 + var29;
                var46 = var22 + var30;
                var47 = arg3 + arg4 >> 1;
                var48 = arg7 + arg13 >> 1;
                var49 = arg0 + arg5 >> 1;
            } else if (var44 == 13) {
                var45 = var23 + var29;
                var46 = var23 + var30;
                var47 = arg4;
                var48 = arg13;
                var49 = arg0;
            } else if (var44 == 14) {
                var45 = var24 + var29;
                var46 = var23 + var30;
                var47 = arg6;
                var48 = arg9;
                var49 = arg17;
            } else if (var44 == 15) {
                var45 = var24 + var29;
                var46 = var24 + var30;
                var47 = arg2;
                var48 = arg12;
                var49 = arg18;
            } else {
                var45 = var23 + var29;
                var46 = var24 + var30;
                var47 = arg3;
                var48 = arg7;
                var49 = arg5;
            }
            this.field174[var31] = var45;
            this.field175[var31] = var47;
            this.field176[var31] = var46;
            var27[var31] = var48;
            var28[var31] = var49;
        }
        int[] var32 = field198[arg15];
        int var33 = var32.length / 4;
        this.field180 = new int[var33];
        this.field181 = new int[var33];
        this.field182 = new int[var33];
        this.field177 = new int[var33];
        this.field178 = new int[var33];
        this.field179 = new int[var33];
        if (arg14 != -1) {
            this.field183 = new int[var33];
        }
        int var34 = 0;
        for (int var35 = 0; var35 < var33; var35++) {
            int var40 = var32[var34];
            int var41 = var32[var34 + 1];
            int var42 = var32[var34 + 2];
            int var43 = var32[var34 + 3];
            var34 += 4;
            if (var41 < 4) {
                var41 = var41 - arg10 & 0x3;
            }
            if (var42 < 4) {
                var42 = var42 - arg10 & 0x3;
            }
            if (var43 < 4) {
                var43 = var43 - arg10 & 0x3;
            }
            this.field180[var35] = var41;
            this.field181[var35] = var42;
            this.field182[var35] = var43;
            if (var40 == 0) {
                this.field177[var35] = var27[var41];
                this.field178[var35] = var27[var42];
                this.field179[var35] = var27[var43];
                if (this.field183 != null) {
                    this.field183[var35] = -1;
                }
            } else {
                this.field177[var35] = var28[var41];
                this.field178[var35] = var28[var42];
                this.field179[var35] = var28[var43];
                if (this.field183 != null) {
                    this.field183[var35] = arg14;
                }
            }
        }
        int var36 = arg4;
        int var37 = arg6;
        if (arg6 < arg4) {
            var36 = arg6;
        }
        if (arg6 > arg6) {
            var37 = arg6;
        }
        if (arg2 < var36) {
            var36 = arg2;
        }
        if (arg2 > var37) {
            var37 = arg2;
        }
        if (arg3 < var36) {
            var36 = arg3;
        }
        if (arg3 > var37) {
            var37 = arg3;
        }
        int var38 = var36 / 14;
        int var39 = var37 / 14;
        if (Linkable.field375) {
        }
    }
}
