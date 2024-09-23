import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("i")
public class TileOverlay {

    @OriginalMember(owner = "i", name = "k", descriptor = "Z")
    public boolean field179 = true;

    @OriginalMember(owner = "i", name = "l", descriptor = "I")
    public int field180;

    @OriginalMember(owner = "i", name = "m", descriptor = "I")
    public int field181;

    @OriginalMember(owner = "i", name = "n", descriptor = "I")
    public int field182;

    @OriginalMember(owner = "i", name = "o", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "i", name = "a", descriptor = "[I")
    public int[] field169;

    @OriginalMember(owner = "i", name = "b", descriptor = "[I")
    public int[] field170;

    @OriginalMember(owner = "i", name = "c", descriptor = "[I")
    public int[] field171;

    @OriginalMember(owner = "i", name = "g", descriptor = "[I")
    public int[] field175;

    @OriginalMember(owner = "i", name = "h", descriptor = "[I")
    public int[] field176;

    @OriginalMember(owner = "i", name = "i", descriptor = "[I")
    public int[] field177;

    @OriginalMember(owner = "i", name = "d", descriptor = "[I")
    public int[] field172;

    @OriginalMember(owner = "i", name = "e", descriptor = "[I")
    public int[] field173;

    @OriginalMember(owner = "i", name = "f", descriptor = "[I")
    public int[] field174;

    @OriginalMember(owner = "i", name = "j", descriptor = "[I")
    public int[] field178;

    @OriginalMember(owner = "i", name = "p", descriptor = "[I")
    public static int[] field184 = new int[6];

    @OriginalMember(owner = "i", name = "q", descriptor = "[I")
    public static int[] field185 = new int[6];

    @OriginalMember(owner = "i", name = "r", descriptor = "[I")
    public static int[] field186 = new int[6];

    @OriginalMember(owner = "i", name = "s", descriptor = "[I")
    public static int[] field187 = new int[6];

    @OriginalMember(owner = "i", name = "t", descriptor = "[I")
    public static int[] field188 = new int[6];

    @OriginalMember(owner = "i", name = "u", descriptor = "[I")
    public static int[] field189 = new int[] { 1, 0 };

    @OriginalMember(owner = "i", name = "v", descriptor = "[I")
    public static int[] field190 = new int[] { 2, 1 };

    @OriginalMember(owner = "i", name = "w", descriptor = "[I")
    public static int[] field191 = new int[] { 3, 3 };

    @OriginalMember(owner = "i", name = "x", descriptor = "[[I")
    public static final int[][] field192 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "i", name = "y", descriptor = "[[I")
    public static final int[][] field193 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "i", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public TileOverlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg0 != arg18 || arg0 != arg5 || arg0 != arg3) {
            this.field179 = false;
        }
        this.field180 = arg16;
        this.field181 = arg8;
        this.field182 = arg4;
        this.field183 = arg14;
        if (arg17 != -29662) {
            throw new NullPointerException();
        }
        short var21 = 128;
        int var22 = var21 / 2;
        int var23 = var21 / 4;
        int var24 = var21 * 3 / 4;
        int[] var25 = field192[arg16];
        int var26 = var25.length;
        this.field169 = new int[var26];
        this.field170 = new int[var26];
        this.field171 = new int[var26];
        int[] var27 = new int[var26];
        int[] var28 = new int[var26];
        int var29 = arg12 * var21;
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
                var47 = arg0;
                var48 = arg19;
                var49 = arg9;
            } else if (var44 == 2) {
                var45 = var22 + var29;
                var46 = var30;
                var47 = arg0 + arg18 >> 1;
                var48 = arg11 + arg19 >> 1;
                var49 = arg6 + arg9 >> 1;
            } else if (var44 == 3) {
                var45 = var21 + var29;
                var46 = var30;
                var47 = arg18;
                var48 = arg11;
                var49 = arg6;
            } else if (var44 == 4) {
                var45 = var21 + var29;
                var46 = var22 + var30;
                var47 = arg5 + arg18 >> 1;
                var48 = arg10 + arg11 >> 1;
                var49 = arg6 + arg15 >> 1;
            } else if (var44 == 5) {
                var45 = var21 + var29;
                var46 = var21 + var30;
                var47 = arg5;
                var48 = arg10;
                var49 = arg15;
            } else if (var44 == 6) {
                var45 = var22 + var29;
                var46 = var21 + var30;
                var47 = arg3 + arg5 >> 1;
                var48 = arg2 + arg10 >> 1;
                var49 = arg13 + arg15 >> 1;
            } else if (var44 == 7) {
                var45 = var29;
                var46 = var21 + var30;
                var47 = arg3;
                var48 = arg2;
                var49 = arg13;
            } else if (var44 == 8) {
                var45 = var29;
                var46 = var22 + var30;
                var47 = arg0 + arg3 >> 1;
                var48 = arg2 + arg19 >> 1;
                var49 = arg9 + arg13 >> 1;
            } else if (var44 == 9) {
                var45 = var22 + var29;
                var46 = var23 + var30;
                var47 = arg0 + arg18 >> 1;
                var48 = arg11 + arg19 >> 1;
                var49 = arg6 + arg9 >> 1;
            } else if (var44 == 10) {
                var45 = var24 + var29;
                var46 = var22 + var30;
                var47 = arg5 + arg18 >> 1;
                var48 = arg10 + arg11 >> 1;
                var49 = arg6 + arg15 >> 1;
            } else if (var44 == 11) {
                var45 = var22 + var29;
                var46 = var24 + var30;
                var47 = arg3 + arg5 >> 1;
                var48 = arg2 + arg10 >> 1;
                var49 = arg13 + arg15 >> 1;
            } else if (var44 == 12) {
                var45 = var23 + var29;
                var46 = var22 + var30;
                var47 = arg0 + arg3 >> 1;
                var48 = arg2 + arg19 >> 1;
                var49 = arg9 + arg13 >> 1;
            } else if (var44 == 13) {
                var45 = var23 + var29;
                var46 = var23 + var30;
                var47 = arg0;
                var48 = arg19;
                var49 = arg9;
            } else if (var44 == 14) {
                var45 = var24 + var29;
                var46 = var23 + var30;
                var47 = arg18;
                var48 = arg11;
                var49 = arg6;
            } else if (var44 == 15) {
                var45 = var24 + var29;
                var46 = var24 + var30;
                var47 = arg5;
                var48 = arg10;
                var49 = arg15;
            } else {
                var45 = var23 + var29;
                var46 = var24 + var30;
                var47 = arg3;
                var48 = arg2;
                var49 = arg13;
            }
            this.field169[var31] = var45;
            this.field170[var31] = var47;
            this.field171[var31] = var46;
            var27[var31] = var48;
            var28[var31] = var49;
        }
        int[] var32 = field193[arg16];
        int var33 = var32.length / 4;
        this.field175 = new int[var33];
        this.field176 = new int[var33];
        this.field177 = new int[var33];
        this.field172 = new int[var33];
        this.field173 = new int[var33];
        this.field174 = new int[var33];
        if (arg7 != -1) {
            this.field178 = new int[var33];
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
            this.field175[var35] = var41;
            this.field176[var35] = var42;
            this.field177[var35] = var43;
            if (var40 == 0) {
                this.field172[var35] = var27[var41];
                this.field173[var35] = var27[var42];
                this.field174[var35] = var27[var43];
                if (this.field178 != null) {
                    this.field178[var35] = -1;
                }
            } else {
                this.field172[var35] = var28[var41];
                this.field173[var35] = var28[var42];
                this.field174[var35] = var28[var43];
                if (this.field178 != null) {
                    this.field178[var35] = arg7;
                }
            }
        }
        int var36 = arg0;
        int var37 = arg18;
        if (arg18 < arg0) {
            var36 = arg18;
        }
        if (arg18 > arg18) {
            var37 = arg18;
        }
        if (arg5 < var36) {
            var36 = arg5;
        }
        if (arg5 > var37) {
            var37 = arg5;
        }
        if (arg3 < var36) {
            var36 = arg3;
        }
        if (arg3 > var37) {
            var37 = arg3;
        }
        int var38 = var36 / 14;
        int var39 = var37 / 14;
        if (Linkable.field368) {
        }
    }
}
