import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("i")
public class TileOverlay {

    @OriginalMember(owner = "i", name = "k", descriptor = "Z")
    public boolean field182 = true;

    @OriginalMember(owner = "i", name = "l", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "i", name = "m", descriptor = "I")
    public int field184;

    @OriginalMember(owner = "i", name = "n", descriptor = "I")
    public int field185;

    @OriginalMember(owner = "i", name = "o", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "i", name = "a", descriptor = "[I")
    public int[] field172;

    @OriginalMember(owner = "i", name = "b", descriptor = "[I")
    public int[] field173;

    @OriginalMember(owner = "i", name = "c", descriptor = "[I")
    public int[] field174;

    @OriginalMember(owner = "i", name = "g", descriptor = "[I")
    public int[] field178;

    @OriginalMember(owner = "i", name = "h", descriptor = "[I")
    public int[] field179;

    @OriginalMember(owner = "i", name = "i", descriptor = "[I")
    public int[] field180;

    @OriginalMember(owner = "i", name = "d", descriptor = "[I")
    public int[] field175;

    @OriginalMember(owner = "i", name = "e", descriptor = "[I")
    public int[] field176;

    @OriginalMember(owner = "i", name = "f", descriptor = "[I")
    public int[] field177;

    @OriginalMember(owner = "i", name = "j", descriptor = "[I")
    public int[] field181;

    @OriginalMember(owner = "i", name = "p", descriptor = "[I")
    public static int[] field187 = new int[6];

    @OriginalMember(owner = "i", name = "q", descriptor = "[I")
    public static int[] field188 = new int[6];

    @OriginalMember(owner = "i", name = "r", descriptor = "[I")
    public static int[] field189 = new int[6];

    @OriginalMember(owner = "i", name = "s", descriptor = "[I")
    public static int[] field190 = new int[6];

    @OriginalMember(owner = "i", name = "t", descriptor = "[I")
    public static int[] field191 = new int[6];

    @OriginalMember(owner = "i", name = "u", descriptor = "[I")
    public static int[] field192 = new int[] { 1, 0 };

    @OriginalMember(owner = "i", name = "v", descriptor = "[I")
    public static int[] field193 = new int[] { 2, 1 };

    @OriginalMember(owner = "i", name = "w", descriptor = "[I")
    public static int[] field194 = new int[] { 3, 3 };

    @OriginalMember(owner = "i", name = "x", descriptor = "[[I")
    public static final int[][] field195 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "i", name = "y", descriptor = "[[I")
    public static final int[][] field196 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "i", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public TileOverlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 != arg4 || arg4 != arg8 || arg4 != arg11) {
            this.field182 = false;
        }
        this.field183 = arg16;
        this.field184 = arg2;
        this.field185 = arg10;
        this.field186 = arg6;
        short var21 = 128;
        int var22 = var21 / 2;
        int var23 = var21 / 4;
        int var24 = var21 * 3 / 4;
        int[] var25 = field195[arg16];
        int var26 = var25.length;
        this.field172 = new int[var26];
        this.field173 = new int[var26];
        this.field174 = new int[var26];
        int[] var27 = new int[var26];
        int[] var28 = new int[var26];
        int var29 = arg17 * var21;
        int var30 = arg7 * var21;
        for (int var31 = 0; var31 < var26; var31++) {
            int var45 = var25[var31];
            if ((var45 & 0x1) == 0 && var45 <= 8) {
                var45 = (var45 - arg2 - arg2 - 1 & 0x7) + 1;
            }
            if (var45 > 8 && var45 <= 12) {
                var45 = (var45 - arg2 - 9 & 0x3) + 9;
            }
            if (var45 > 12 && var45 <= 16) {
                var45 = (var45 - arg2 - 13 & 0x3) + 13;
            }
            int var46;
            int var47;
            int var48;
            int var49;
            int var50;
            if (var45 == 1) {
                var46 = var29;
                var47 = var30;
                var48 = arg4;
                var49 = arg9;
                var50 = arg5;
            } else if (var45 == 2) {
                var46 = var22 + var29;
                var47 = var30;
                var48 = arg3 + arg4 >> 1;
                var49 = arg9 + arg13 >> 1;
                var50 = arg1 + arg5 >> 1;
            } else if (var45 == 3) {
                var46 = var21 + var29;
                var47 = var30;
                var48 = arg3;
                var49 = arg13;
                var50 = arg1;
            } else if (var45 == 4) {
                var46 = var21 + var29;
                var47 = var22 + var30;
                var48 = arg3 + arg8 >> 1;
                var49 = arg13 + arg15 >> 1;
                var50 = arg1 + arg19 >> 1;
            } else if (var45 == 5) {
                var46 = var21 + var29;
                var47 = var21 + var30;
                var48 = arg8;
                var49 = arg15;
                var50 = arg19;
            } else if (var45 == 6) {
                var46 = var22 + var29;
                var47 = var21 + var30;
                var48 = arg8 + arg11 >> 1;
                var49 = arg15 + arg18 >> 1;
                var50 = arg12 + arg19 >> 1;
            } else if (var45 == 7) {
                var46 = var29;
                var47 = var21 + var30;
                var48 = arg11;
                var49 = arg18;
                var50 = arg12;
            } else if (var45 == 8) {
                var46 = var29;
                var47 = var22 + var30;
                var48 = arg4 + arg11 >> 1;
                var49 = arg9 + arg18 >> 1;
                var50 = arg5 + arg12 >> 1;
            } else if (var45 == 9) {
                var46 = var22 + var29;
                var47 = var23 + var30;
                var48 = arg3 + arg4 >> 1;
                var49 = arg9 + arg13 >> 1;
                var50 = arg1 + arg5 >> 1;
            } else if (var45 == 10) {
                var46 = var24 + var29;
                var47 = var22 + var30;
                var48 = arg3 + arg8 >> 1;
                var49 = arg13 + arg15 >> 1;
                var50 = arg1 + arg19 >> 1;
            } else if (var45 == 11) {
                var46 = var22 + var29;
                var47 = var24 + var30;
                var48 = arg8 + arg11 >> 1;
                var49 = arg15 + arg18 >> 1;
                var50 = arg12 + arg19 >> 1;
            } else if (var45 == 12) {
                var46 = var23 + var29;
                var47 = var22 + var30;
                var48 = arg4 + arg11 >> 1;
                var49 = arg9 + arg18 >> 1;
                var50 = arg5 + arg12 >> 1;
            } else if (var45 == 13) {
                var46 = var23 + var29;
                var47 = var23 + var30;
                var48 = arg4;
                var49 = arg9;
                var50 = arg5;
            } else if (var45 == 14) {
                var46 = var24 + var29;
                var47 = var23 + var30;
                var48 = arg3;
                var49 = arg13;
                var50 = arg1;
            } else if (var45 == 15) {
                var46 = var24 + var29;
                var47 = var24 + var30;
                var48 = arg8;
                var49 = arg15;
                var50 = arg19;
            } else {
                var46 = var23 + var29;
                var47 = var24 + var30;
                var48 = arg11;
                var49 = arg18;
                var50 = arg12;
            }
            this.field172[var31] = var46;
            this.field173[var31] = var48;
            this.field174[var31] = var47;
            var27[var31] = var49;
            var28[var31] = var50;
        }
        int[] var32 = field196[arg16];
        int var33 = var32.length / 4;
        this.field178 = new int[var33];
        if (arg14 != 0) {
            for (int var34 = 1; var34 > 0; var34++) {
            }
        }
        this.field179 = new int[var33];
        this.field180 = new int[var33];
        this.field175 = new int[var33];
        this.field176 = new int[var33];
        this.field177 = new int[var33];
        if (arg0 != -1) {
            this.field181 = new int[var33];
        }
        int var35 = 0;
        for (int var36 = 0; var36 < var33; var36++) {
            int var41 = var32[var35];
            int var42 = var32[var35 + 1];
            int var43 = var32[var35 + 2];
            int var44 = var32[var35 + 3];
            var35 += 4;
            if (var42 < 4) {
                var42 = var42 - arg2 & 0x3;
            }
            if (var43 < 4) {
                var43 = var43 - arg2 & 0x3;
            }
            if (var44 < 4) {
                var44 = var44 - arg2 & 0x3;
            }
            this.field178[var36] = var42;
            this.field179[var36] = var43;
            this.field180[var36] = var44;
            if (var41 == 0) {
                this.field175[var36] = var27[var42];
                this.field176[var36] = var27[var43];
                this.field177[var36] = var27[var44];
                if (this.field181 != null) {
                    this.field181[var36] = -1;
                }
            } else {
                this.field175[var36] = var28[var42];
                this.field176[var36] = var28[var43];
                this.field177[var36] = var28[var44];
                if (this.field181 != null) {
                    this.field181[var36] = arg0;
                }
            }
        }
        int var37 = arg4;
        int var38 = arg3;
        if (arg3 < arg4) {
            var37 = arg3;
        }
        if (arg3 > arg3) {
            var38 = arg3;
        }
        if (arg8 < var37) {
            var37 = arg8;
        }
        if (arg8 > var38) {
            var38 = arg8;
        }
        if (arg11 < var37) {
            var37 = arg11;
        }
        if (arg11 > var38) {
            var38 = arg11;
        }
        int var39 = var37 / 14;
        int var40 = var38 / 14;
        if (Linkable.field369) {
        }
    }
}
