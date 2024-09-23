import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VBAXKVMG")
public class TileOverlay {

    @OriginalMember(owner = "VBAXKVMG", name = "k", descriptor = "Z")
    public boolean flat = true;

    @OriginalMember(owner = "VBAXKVMG", name = "l", descriptor = "I")
    public int shape;

    @OriginalMember(owner = "VBAXKVMG", name = "m", descriptor = "I")
    public int rotation;

    @OriginalMember(owner = "VBAXKVMG", name = "n", descriptor = "I")
    public int backgroundRgb;

    @OriginalMember(owner = "VBAXKVMG", name = "o", descriptor = "I")
    public int foregroundRgb;

    @OriginalMember(owner = "VBAXKVMG", name = "a", descriptor = "[I")
    public int[] vertexX;

    @OriginalMember(owner = "VBAXKVMG", name = "b", descriptor = "[I")
    public int[] vertexY;

    @OriginalMember(owner = "VBAXKVMG", name = "c", descriptor = "[I")
    public int[] vertexZ;

    @OriginalMember(owner = "VBAXKVMG", name = "g", descriptor = "[I")
    public int[] triangleVertexA;

    @OriginalMember(owner = "VBAXKVMG", name = "h", descriptor = "[I")
    public int[] triangleVertexB;

    @OriginalMember(owner = "VBAXKVMG", name = "i", descriptor = "[I")
    public int[] triangleVertexC;

    @OriginalMember(owner = "VBAXKVMG", name = "d", descriptor = "[I")
    public int[] triangleColorA;

    @OriginalMember(owner = "VBAXKVMG", name = "e", descriptor = "[I")
    public int[] triangleColorB;

    @OriginalMember(owner = "VBAXKVMG", name = "f", descriptor = "[I")
    public int[] triangleColorC;

    @OriginalMember(owner = "VBAXKVMG", name = "j", descriptor = "[I")
    public int[] triangleTextureIds;

    @OriginalMember(owner = "VBAXKVMG", name = "p", descriptor = "[I")
    public static int[] tmpScreenX = new int[6];

    @OriginalMember(owner = "VBAXKVMG", name = "q", descriptor = "[I")
    public static int[] tmpScreenY = new int[6];

    @OriginalMember(owner = "VBAXKVMG", name = "r", descriptor = "[I")
    public static int[] tmpViewspaceX = new int[6];

    @OriginalMember(owner = "VBAXKVMG", name = "s", descriptor = "[I")
    public static int[] tmpViewspaceY = new int[6];

    @OriginalMember(owner = "VBAXKVMG", name = "t", descriptor = "[I")
    public static int[] tmpViewspaceZ = new int[6];

    @OriginalMember(owner = "VBAXKVMG", name = "u", descriptor = "[I")
    public static int[] field1480 = new int[] { 1, 0 };

    @OriginalMember(owner = "VBAXKVMG", name = "v", descriptor = "[I")
    public static int[] field1481 = new int[] { 2, 1 };

    @OriginalMember(owner = "VBAXKVMG", name = "w", descriptor = "[I")
    public static int[] field1482 = new int[] { 3, 3 };

    @OriginalMember(owner = "VBAXKVMG", name = "x", descriptor = "[[I")
    public static final int[][] SHAPE_POINTS = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "VBAXKVMG", name = "y", descriptor = "[[I")
    public static final int[][] SHAPE_PATHS = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "VBAXKVMG", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public TileOverlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg11 != arg12 || arg3 != arg12 || arg10 != arg12) {
            this.flat = false;
        }
        this.shape = arg13;
        this.rotation = arg6;
        this.backgroundRgb = arg8;
        this.foregroundRgb = arg19;
        short var21 = 128;
        int var22 = var21 / 2;
        int var23 = var21 / 4;
        int var24 = var21 * 3 / 4;
        int[] var25 = SHAPE_POINTS[arg13];
        int var26 = var25.length;
        this.vertexX = new int[var26];
        this.vertexY = new int[var26];
        this.vertexZ = new int[var26];
        int[] var27 = new int[var26];
        int[] var28 = new int[var26];
        int var29 = arg18 * var21;
        int var30 = arg0 * var21;
        for (int var31 = 0; var31 < var26; var31++) {
            int var45 = var25[var31];
            if ((var45 & 0x1) == 0 && var45 <= 8) {
                var45 = (var45 - arg6 - arg6 - 1 & 0x7) + 1;
            }
            if (var45 > 8 && var45 <= 12) {
                var45 = (var45 - arg6 - 9 & 0x3) + 9;
            }
            if (var45 > 12 && var45 <= 16) {
                var45 = (var45 - arg6 - 13 & 0x3) + 13;
            }
            int var46;
            int var47;
            int var48;
            int var49;
            int var50;
            if (var45 == 1) {
                var46 = var29;
                var47 = var30;
                var48 = arg12;
                var49 = arg7;
                var50 = arg1;
            } else if (var45 == 2) {
                var46 = var22 + var29;
                var47 = var30;
                var48 = arg11 + arg12 >> 1;
                var49 = arg7 + arg16 >> 1;
                var50 = arg1 + arg15 >> 1;
            } else if (var45 == 3) {
                var46 = var21 + var29;
                var47 = var30;
                var48 = arg11;
                var49 = arg16;
                var50 = arg15;
            } else if (var45 == 4) {
                var46 = var21 + var29;
                var47 = var22 + var30;
                var48 = arg3 + arg11 >> 1;
                var49 = arg9 + arg16 >> 1;
                var50 = arg5 + arg15 >> 1;
            } else if (var45 == 5) {
                var46 = var21 + var29;
                var47 = var21 + var30;
                var48 = arg3;
                var49 = arg9;
                var50 = arg5;
            } else if (var45 == 6) {
                var46 = var22 + var29;
                var47 = var21 + var30;
                var48 = arg3 + arg10 >> 1;
                var49 = arg2 + arg9 >> 1;
                var50 = arg5 + arg14 >> 1;
            } else if (var45 == 7) {
                var46 = var29;
                var47 = var21 + var30;
                var48 = arg10;
                var49 = arg2;
                var50 = arg14;
            } else if (var45 == 8) {
                var46 = var29;
                var47 = var22 + var30;
                var48 = arg10 + arg12 >> 1;
                var49 = arg2 + arg7 >> 1;
                var50 = arg1 + arg14 >> 1;
            } else if (var45 == 9) {
                var46 = var22 + var29;
                var47 = var23 + var30;
                var48 = arg11 + arg12 >> 1;
                var49 = arg7 + arg16 >> 1;
                var50 = arg1 + arg15 >> 1;
            } else if (var45 == 10) {
                var46 = var24 + var29;
                var47 = var22 + var30;
                var48 = arg3 + arg11 >> 1;
                var49 = arg9 + arg16 >> 1;
                var50 = arg5 + arg15 >> 1;
            } else if (var45 == 11) {
                var46 = var22 + var29;
                var47 = var24 + var30;
                var48 = arg3 + arg10 >> 1;
                var49 = arg2 + arg9 >> 1;
                var50 = arg5 + arg14 >> 1;
            } else if (var45 == 12) {
                var46 = var23 + var29;
                var47 = var22 + var30;
                var48 = arg10 + arg12 >> 1;
                var49 = arg2 + arg7 >> 1;
                var50 = arg1 + arg14 >> 1;
            } else if (var45 == 13) {
                var46 = var23 + var29;
                var47 = var23 + var30;
                var48 = arg12;
                var49 = arg7;
                var50 = arg1;
            } else if (var45 == 14) {
                var46 = var24 + var29;
                var47 = var23 + var30;
                var48 = arg11;
                var49 = arg16;
                var50 = arg15;
            } else if (var45 == 15) {
                var46 = var24 + var29;
                var47 = var24 + var30;
                var48 = arg3;
                var49 = arg9;
                var50 = arg5;
            } else {
                var46 = var23 + var29;
                var47 = var24 + var30;
                var48 = arg10;
                var49 = arg2;
                var50 = arg14;
            }
            this.vertexX[var31] = var46;
            this.vertexY[var31] = var48;
            this.vertexZ[var31] = var47;
            var27[var31] = var49;
            var28[var31] = var50;
        }
        int[] var32 = SHAPE_PATHS[arg13];
        int var33 = var32.length / 4;
        this.triangleVertexA = new int[var33];
        this.triangleVertexB = new int[var33];
        this.triangleVertexC = new int[var33];
        this.triangleColorA = new int[var33];
        this.triangleColorB = new int[var33];
        this.triangleColorC = new int[var33];
        if (arg4 != -1) {
            this.triangleTextureIds = new int[var33];
        }
        int var34 = 0;
        for (int var35 = 0; var35 < var33; var35++) {
            int var41 = var32[var34];
            int var42 = var32[var34 + 1];
            int var43 = var32[var34 + 2];
            int var44 = var32[var34 + 3];
            var34 += 4;
            if (var42 < 4) {
                var42 = var42 - arg6 & 0x3;
            }
            if (var43 < 4) {
                var43 = var43 - arg6 & 0x3;
            }
            if (var44 < 4) {
                var44 = var44 - arg6 & 0x3;
            }
            this.triangleVertexA[var35] = var42;
            this.triangleVertexB[var35] = var43;
            this.triangleVertexC[var35] = var44;
            if (var41 == 0) {
                this.triangleColorA[var35] = var27[var42];
                this.triangleColorB[var35] = var27[var43];
                this.triangleColorC[var35] = var27[var44];
                if (this.triangleTextureIds != null) {
                    this.triangleTextureIds[var35] = -1;
                }
            } else {
                this.triangleColorA[var35] = var28[var42];
                this.triangleColorB[var35] = var28[var43];
                this.triangleColorC[var35] = var28[var44];
                if (this.triangleTextureIds != null) {
                    this.triangleTextureIds[var35] = arg4;
                }
            }
        }
        int var36 = arg12;
        int var37 = arg11;
        if (arg11 < arg12) {
            var36 = arg11;
        }
        if (arg11 > arg11) {
            var37 = arg11;
        }
        if (arg3 < var36) {
            var36 = arg3;
        }
        if (arg3 > var37) {
            var37 = arg3;
        }
        if (arg10 < var36) {
            var36 = arg10;
        }
        if (arg10 > var37) {
            var37 = arg10;
        }
        int var38 = var36 / 14;
        int var39 = var37 / 14;
        if (arg17 < 3 || arg17 > 3) {
            for (int var40 = 1; var40 > 0; var40++) {
            }
        }
        if (Linkable._flowObfuscator2) {
        }
    }
}
