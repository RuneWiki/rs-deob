import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("r")
public class World3D {

    @OriginalMember(owner = "r", name = "a", descriptor = "I")
    private int field273 = 195;

    @OriginalMember(owner = "r", name = "d", descriptor = "I")
    private int field276 = 6;

    @OriginalMember(owner = "r", name = "e", descriptor = "B")
    private byte field277 = -90;

    @OriginalMember(owner = "r", name = "f", descriptor = "I")
    private int field278 = 7;

    @OriginalMember(owner = "r", name = "g", descriptor = "I")
    private int field279 = 5;

    @OriginalMember(owner = "r", name = "h", descriptor = "I")
    private int field280 = 8;

    @OriginalMember(owner = "r", name = "q", descriptor = "[Lp;")
    public Location[] field289 = new Location[5000];

    @OriginalMember(owner = "r", name = "gb", descriptor = "[I")
    public int[] field331 = new int[10000];

    @OriginalMember(owner = "r", name = "hb", descriptor = "[I")
    public int[] field332 = new int[10000];

    @OriginalMember(owner = "r", name = "jb", descriptor = "[[I")
    public int[][] field334 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "r", name = "kb", descriptor = "[[I")
    public int[][] field335 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "r", name = "j", descriptor = "I")
    public int field282;

    @OriginalMember(owner = "r", name = "k", descriptor = "I")
    public int field283;

    @OriginalMember(owner = "r", name = "l", descriptor = "I")
    public int field284;

    @OriginalMember(owner = "r", name = "n", descriptor = "[[[Lv;")
    public Tile[][][] field286;

    @OriginalMember(owner = "r", name = "r", descriptor = "[[[I")
    public int[][][] field290;

    @OriginalMember(owner = "r", name = "m", descriptor = "[[[I")
    public int[][][] field285;

    @OriginalMember(owner = "r", name = "i", descriptor = "Z")
    public static boolean field281 = true;

    @OriginalMember(owner = "r", name = "I", descriptor = "[Lp;")
    public static Location[] field307 = new Location[100];

    @OriginalMember(owner = "r", name = "J", descriptor = "[I")
    public static final int[] field308 = new int[] { 53, -53, -53, 53 };

    @OriginalMember(owner = "r", name = "K", descriptor = "[I")
    public static final int[] field309 = new int[] { -53, -53, 53, 53 };

    @OriginalMember(owner = "r", name = "L", descriptor = "[I")
    public static final int[] field310 = new int[] { -45, 45, 45, -45 };

    @OriginalMember(owner = "r", name = "M", descriptor = "[I")
    public static final int[] field311 = new int[] { 45, 45, -45, -45 };

    @OriginalMember(owner = "r", name = "Q", descriptor = "I")
    public static int field315 = -1;

    @OriginalMember(owner = "r", name = "R", descriptor = "I")
    public static int field316 = -1;

    @OriginalMember(owner = "r", name = "S", descriptor = "I")
    public static int field317 = 4;

    @OriginalMember(owner = "r", name = "T", descriptor = "[I")
    public static int[] field318 = new int[field317];

    @OriginalMember(owner = "r", name = "U", descriptor = "[[Lm;")
    public static Occlude[][] field319 = new Occlude[field317][500];

    @OriginalMember(owner = "r", name = "W", descriptor = "[Lm;")
    public static Occlude[] field321 = new Occlude[500];

    @OriginalMember(owner = "r", name = "X", descriptor = "Lob;")
    public static LinkList field322 = new LinkList(-199);

    @OriginalMember(owner = "r", name = "Y", descriptor = "[I")
    public static final int[] field323 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "r", name = "Z", descriptor = "[I")
    public static final int[] field324 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "r", name = "ab", descriptor = "[I")
    public static final int[] field325 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "r", name = "bb", descriptor = "[I")
    public static final int[] field326 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "r", name = "cb", descriptor = "[I")
    public static final int[] field327 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "r", name = "db", descriptor = "[I")
    public static final int[] field328 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "r", name = "eb", descriptor = "[I")
    public static final int[] field329 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "r", name = "fb", descriptor = "[I")
    public static final int[] field330 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

    @OriginalMember(owner = "r", name = "lb", descriptor = "[[[[Z")
    public static boolean[][][][] field336 = new boolean[8][32][51][51];

    @OriginalMember(owner = "r", name = "c", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "r", name = "o", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "r", name = "p", descriptor = "I")
    public int field288;

    @OriginalMember(owner = "r", name = "s", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "r", name = "t", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "r", name = "u", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "r", name = "v", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "r", name = "w", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "r", name = "x", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "r", name = "y", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "r", name = "z", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "r", name = "A", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "r", name = "B", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "r", name = "C", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "r", name = "D", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "r", name = "E", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "r", name = "F", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "r", name = "G", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "r", name = "H", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "r", name = "O", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "r", name = "P", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "r", name = "V", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "r", name = "ib", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "r", name = "nb", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "r", name = "ob", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "r", name = "pb", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "r", name = "qb", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "r", name = "rb", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "r", name = "sb", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "r", name = "b", descriptor = "Z")
    private static boolean field274;

    @OriginalMember(owner = "r", name = "N", descriptor = "Z")
    public static boolean field312;

    @OriginalMember(owner = "r", name = "mb", descriptor = "[[Z")
    public static boolean[][] field337;

    @OriginalMember(owner = "r", name = "<init>", descriptor = "(II[[[III)V")
    public World3D(int arg0, int arg1, int[][][] arg2, int arg3, int arg4) {
        this.field282 = arg1;
        this.field283 = arg0;
        this.field284 = arg3;
        this.field286 = new Tile[arg1][arg0][arg3];
        this.field290 = new int[arg1][arg0 + 1][arg3 + 1];
        this.field285 = arg2;
        if (arg4 <= 0) {
            this.field273 = 181;
        }
        this.method50(true);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(B)V")
    public static void method49(byte arg0) {
        if (arg0 != 42) {
            return;
        }
        field307 = null;
        field318 = null;
        field319 = null;
        field322 = null;
        field336 = null;
        field337 = null;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Z)V")
    public void method50(boolean arg0) {
        for (int var2 = 0; var2 < this.field282; var2++) {
            for (int var7 = 0; var7 < this.field283; var7++) {
                for (int var8 = 0; var8 < this.field284; var8++) {
                    this.field286[var2][var7][var8] = null;
                }
            }
        }
        for (int var3 = 0; var3 < field317; var3++) {
            for (int var6 = 0; var6 < field318[var3]; var6++) {
                field319[var3][var6] = null;
            }
            field318[var3] = 0;
        }
        for (int var4 = 0; var4 < this.field288; var4++) {
            this.field289[var4] = null;
        }
        this.field288 = 0;
        if (!arg0) {
            this.field273 = 178;
        }
        for (int var5 = 0; var5 < field307.length; var5++) {
            field307[var5] = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(BI)V")
    public void method51(byte arg0, int arg1) {
        this.field287 = arg1;
        for (int var3 = 0; var3 < this.field283; var3++) {
            for (int var4 = 0; var4 < this.field284; var4++) {
                this.field286[arg1][var3][var4] = new Tile(arg1, var3, var4);
            }
        }
        if (arg0 != 7) {
            field274 = true;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ZII)V")
    public void method52(boolean arg0, int arg1, int arg2) {
        Tile var4 = this.field286[0][arg2][arg1];
        for (int var5 = 0; var5 < 3; var5++) {
            Tile var7 = this.field286[var5][arg2][arg1] = this.field286[var5 + 1][arg2][arg1];
            if (var7 != null) {
                var7.field363--;
                for (int var8 = 0; var8 < var7.field373; var8++) {
                    Location var9 = var7.field374[var8];
                    if ((var9.field262 >> 29 & 0x3) == 2 && var9.field256 == arg2 && var9.field258 == arg1) {
                        var9.field250--;
                    }
                }
            }
        }
        if (this.field286[0][arg2][arg1] == null) {
            this.field286[0][arg2][arg1] = new Tile(0, arg2, arg1);
        }
        this.field286[0][arg2][arg1].field385 = var4;
        if (!arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field286[3][arg2][arg1] = null;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIII)V")
    public static void method53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Occlude var9 = new Occlude();
        var9.field221 = arg4 / 128;
        var9.field222 = arg3 / 128;
        var9.field223 = arg0 / 128;
        var9.field224 = arg7 / 128;
        var9.field225 = arg8;
        var9.field226 = arg4;
        var9.field227 = arg3;
        var9.field228 = arg0;
        var9.field229 = arg7;
        var9.field230 = arg2;
        if (arg5 != 1) {
            field274 = true;
        }
        var9.field231 = arg6;
        field319[arg1][field318[arg1]++] = var9;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIII)V")
    public void method54(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field286[arg0][arg1][arg2];
        if (var5 != null) {
            this.field286[arg0][arg1][arg2].field377 = arg3;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public void method55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            TileUnderlay var21 = new TileUnderlay(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var22 = arg0; var22 >= 0; var22--) {
                if (this.field286[var22][arg1][arg2] == null) {
                    this.field286[var22][arg1][arg2] = new Tile(var22, arg1, arg2);
                }
            }
            this.field286[arg0][arg1][arg2].field367 = var21;
        } else if (arg3 == 1) {
            TileUnderlay var23 = new TileUnderlay(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var24 = arg0; var24 >= 0; var24--) {
                if (this.field286[var24][arg1][arg2] == null) {
                    this.field286[var24][arg1][arg2] = new Tile(var24, arg1, arg2);
                }
            }
            this.field286[arg0][arg1][arg2].field367 = var23;
        } else {
            TileOverlay var25 = new TileOverlay(arg14, arg7, arg1, arg10, arg13, arg19, arg12, arg18, arg6, arg5, arg9, arg15, arg17, 356, arg4, arg16, arg2, arg3, arg11, arg8);
            for (int var26 = arg0; var26 >= 0; var26--) {
                if (this.field286[var26][arg1][arg2] == null) {
                    this.field286[var26][arg1][arg2] = new Tile(var26, arg1, arg2);
                }
            }
            this.field286[arg0][arg1][arg2].field368 = var25;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(BIIIZILx;I)V")
    public void method56(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, Entity arg6, int arg7) {
        if (arg6 == null) {
            return;
        }
        GroundDecor var9 = new GroundDecor();
        var9.field193 = arg6;
        var9.field191 = arg7 * 128 + 64;
        var9.field192 = arg3 * 128 + 64;
        var9.field190 = arg5;
        if (!arg4) {
            return;
        }
        var9.field194 = arg1;
        var9.field195 = arg0;
        if (this.field286[arg2][arg7][arg3] == null) {
            this.field286[arg2][arg7][arg3] = new Tile(arg2, arg7, arg3);
        }
        this.field286[arg2][arg7][arg3].field371 = var9;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IILx;IBLx;IILx;)V")
    public void method57(int arg0, int arg1, Entity arg2, int arg3, byte arg4, Entity arg5, int arg6, int arg7, Entity arg8) {
        GroundObject var10 = new GroundObject();
        var10.field199 = arg8;
        var10.field197 = arg3 * 128 + 64;
        var10.field198 = arg0 * 128 + 64;
        if (arg4 != 2) {
            return;
        }
        var10.field196 = arg7;
        var10.field202 = arg1;
        var10.field200 = arg2;
        var10.field201 = arg5;
        int var11 = 0;
        Tile var12 = this.field286[arg6][arg3][arg0];
        if (var12 != null) {
            for (int var13 = 0; var13 < var12.field373; var13++) {
                if (var12.field374[var13].field254 instanceof Model) {
                    int var14 = ((Model) var12.field374[var13].field254).field564;
                    if (var14 > var11) {
                        var11 = var14;
                    }
                }
            }
        }
        var10.field203 = var11;
        if (this.field286[arg6][arg3][arg0] == null) {
            this.field286[arg6][arg3][arg0] = new Tile(arg6, arg3, arg0);
        }
        this.field286[arg6][arg3][arg0].field372 = var10;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(BIIIILx;IILx;II)V")
    public void method58(byte arg0, int arg1, int arg2, int arg3, int arg4, Entity arg5, int arg6, int arg7, Entity arg8, int arg9, int arg10) {
        while (arg6 >= 0) {
            this.field280 = 306;
        }
        if (arg5 == null && arg8 == null) {
            return;
        }
        Wall var12 = new Wall();
        var12.field271 = arg3;
        var12.field272 = arg0;
        var12.field265 = arg4 * 128 + 64;
        var12.field266 = arg10 * 128 + 64;
        var12.field264 = arg2;
        var12.field269 = arg5;
        var12.field270 = arg8;
        var12.field267 = arg1;
        var12.field268 = arg7;
        for (int var13 = arg9; var13 >= 0; var13--) {
            if (this.field286[var13][arg4][arg10] == null) {
                this.field286[var13][arg4][arg10] = new Tile(var13, arg4, arg10);
            }
        }
        this.field286[arg9][arg4][arg10].field369 = var12;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIILx;BIIIIIII)V")
    public void method59(int arg0, int arg1, int arg2, Entity arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg3 == null) {
            return;
        }
        Decor var13 = new Decor();
        var13.field162 = arg7;
        var13.field163 = arg4;
        var13.field157 = arg10 * 128 + arg8 + 64;
        var13.field158 = arg0 * 128 + arg11 + 64;
        var13.field156 = arg2;
        if (arg9 != 30967) {
            return;
        }
        var13.field161 = arg3;
        var13.field159 = arg5;
        var13.field160 = arg6;
        for (int var14 = arg1; var14 >= 0; var14--) {
            if (this.field286[var14][arg10][arg0] == null) {
                this.field286[var14][arg10][arg0] = new Tile(var14, arg10, arg0);
            }
        }
        this.field286[arg1][arg10][arg0].field370 = var13;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIBIIIILx;I)Z")
    public boolean method60(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, Entity arg9, int arg10) {
        if (arg0 != 0) {
            this.field275 = 216;
        }
        if (arg9 == null) {
            return true;
        } else {
            int var12 = arg2 * 128 + arg7 * 64;
            int var13 = arg1 * 128 + arg10 * 64;
            return this.method63(arg8, arg2, arg1, arg7, arg10, var12, var13, arg3, arg9, arg6, false, arg5, arg4);
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIILx;IZII)Z")
    public boolean method61(int arg0, int arg1, int arg2, int arg3, int arg4, Entity arg5, int arg6, boolean arg7, int arg8, int arg9) {
        if (arg5 == null) {
            return true;
        }
        int var11 = arg3 - arg0;
        int var12 = arg8 - arg0;
        int var13 = arg0 + arg3;
        int var14 = arg0 + arg8;
        if (arg7) {
            if (arg6 > 640 && arg6 < 1408) {
                var14 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var13 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var12 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var11 -= 128;
            }
        }
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        int var18 = 50 / arg4;
        int var19 = var14 / 128;
        return this.method63(arg9, var15, var16, var17 + 1 - var15, var19 - var16 + 1, arg3, arg8, arg2, arg5, arg6, true, arg1, (byte) 0);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIZIIIILx;IIIII)Z")
    public boolean method62(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, Entity arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        if (!arg2) {
            this.field273 = 52;
        }
        return arg7 == null ? true : this.method63(arg9, arg11, arg3, arg4 + 1 - arg11, arg6 - arg3 + 1, arg5, arg8, arg10, arg7, arg12, true, arg1, (byte) 0);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIILx;IZIB)Z")
    private boolean method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, boolean arg10, int arg11, byte arg12) {
        for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
            for (int var21 = arg2; var21 < arg2 + arg4; var21++) {
                if (var14 < 0 || var21 < 0 || var14 >= this.field283 || var21 >= this.field284) {
                    return false;
                }
                Tile var22 = this.field286[arg0][var14][var21];
                if (var22 != null && var22.field373 >= 5) {
                    return false;
                }
            }
        }
        Location var15 = new Location();
        var15.field262 = arg11;
        var15.field263 = arg12;
        var15.field250 = arg0;
        var15.field252 = arg5;
        var15.field253 = arg6;
        var15.field251 = arg7;
        var15.field254 = arg8;
        var15.field255 = arg9;
        var15.field256 = arg1;
        var15.field258 = arg2;
        var15.field257 = arg1 + arg3 - 1;
        var15.field259 = arg2 + arg4 - 1;
        for (int var16 = arg1; var16 < arg1 + arg3; var16++) {
            for (int var17 = arg2; var17 < arg2 + arg4; var17++) {
                int var18 = 0;
                if (var16 > arg1) {
                    var18++;
                }
                if (var16 < arg1 + arg3 - 1) {
                    var18 += 4;
                }
                if (var17 > arg2) {
                    var18 += 8;
                }
                if (var17 < arg2 + arg4 - 1) {
                    var18 += 2;
                }
                for (int var19 = arg0; var19 >= 0; var19--) {
                    if (this.field286[var19][var16][var17] == null) {
                        this.field286[var19][var16][var17] = new Tile(var19, var16, var17);
                    }
                }
                Tile var20 = this.field286[arg0][var16][var17];
                var20.field374[var20.field373] = var15;
                var20.field375[var20.field373] = var18;
                var20.field376 |= var18;
                var20.field373++;
            }
        }
        if (arg10) {
            this.field289[this.field288++] = var15;
        }
        return true;
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(Z)V")
    public void method64(boolean arg0) {
        for (int var2 = 0; var2 < this.field288; var2++) {
            Location var3 = this.field289[var2];
            this.method65(6, var3);
            this.field289[var2] = null;
        }
        this.field288 = 0;
        if (!arg0) {
            this.field280 = -18;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILp;)V")
    private void method65(int arg0, Location arg1) {
        for (int var3 = arg1.field256; var3 <= arg1.field257; var3++) {
            for (int var4 = arg1.field258; var4 <= arg1.field259; var4++) {
                Tile var5 = this.field286[arg1.field250][var3][var4];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field373; var6++) {
                        if (var5.field374[var6] == arg1) {
                            var5.field373--;
                            for (int var7 = var6; var7 < var5.field373; var7++) {
                                var5.field374[var7] = var5.field374[var7 + 1];
                                var5.field375[var7] = var5.field375[var7 + 1];
                            }
                            var5.field374[var5.field373] = null;
                            break;
                        }
                    }
                    var5.field376 = 0;
                    for (int var8 = 0; var8 < var5.field373; var8++) {
                        var5.field376 |= var5.field375[var8];
                    }
                }
            }
        }
        if (this.field276 == arg0) {
            ;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIBII)V")
    public void method66(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        Tile var6 = this.field286[arg4][arg3][arg0];
        if (var6 == null) {
            return;
        }
        Decor var7 = var6.field370;
        if (var7 == null) {
            return;
        }
        int var8 = arg3 * 128 + 64;
        int var9 = arg0 * 128 + 64;
        var7.field157 = (var7.field157 - var8) * arg1 / 16 + var8;
        var7.field158 = (var7.field158 - var9) * arg1 / 16 + var9;
        if (this.field277 == arg2) {
            ;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIBI)V")
    public void method67(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == 7) {
            boolean var5 = false;
        }
        Tile var6 = this.field286[arg3][arg1][arg0];
        if (var6 != null) {
            var6.field369 = null;
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIII)V")
    public void method68(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field286[arg1][arg3][arg2];
        if (arg0 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (var5 != null) {
            var5.field370 = null;
        }
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(IIII)V")
    public void method69(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field286[arg1][arg3][arg2];
        if (arg0 < 2 || arg0 > 2) {
            this.field280 = -437;
        }
        if (var5 == null) {
            return;
        }
        for (int var6 = 0; var6 < var5.field373; var6++) {
            Location var7 = var5.field374[var6];
            if ((var7.field262 >> 29 & 0x3) == 2 && var7.field256 == arg3 && var7.field258 == arg2) {
                this.method65(6, var7);
                return;
            }
        }
    }

    @OriginalMember(owner = "r", name = "d", descriptor = "(IIII)V")
    public void method70(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field286[arg3][arg0][arg1];
        if (arg2 >= 3 && arg2 <= 3 && var5 != null) {
            var5.field371 = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(III)V")
    public void method71(int arg0, int arg1, int arg2) {
        Tile var4 = this.field286[arg0][arg1][arg2];
        if (var4 != null) {
            var4.field372 = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IZII)Lq;")
    public Wall method72(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        Tile var6 = this.field286[arg0][arg2][arg3];
        return var6 == null ? null : var6.field369;
    }

    @OriginalMember(owner = "r", name = "e", descriptor = "(IIII)Lh;")
    public Decor method73(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        Tile var5 = this.field286[arg2][arg3][arg0];
        return var5 == null ? null : var5.field370;
    }

    @OriginalMember(owner = "r", name = "f", descriptor = "(IIII)Lp;")
    public Location method74(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field286[arg3][arg0][arg2];
        if (var5 == null) {
            return null;
        }
        for (int var6 = 0; var6 < var5.field373; var6++) {
            Location var7 = var5.field374[var6];
            if ((var7.field262 >> 29 & 0x3) == 2 && var7.field256 == arg0 && var7.field258 == arg2) {
                return var7;
            }
        }
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return null;
    }

    @OriginalMember(owner = "r", name = "g", descriptor = "(IIII)Lj;")
    public GroundDecor method75(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field286[arg0][arg3][arg2];
        if (arg1 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        return var5 == null || var5.field371 == null ? null : var5.field371;
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(III)I")
    public int method76(int arg0, int arg1, int arg2) {
        Tile var4 = this.field286[arg0][arg1][arg2];
        return var4 == null || var4.field369 == null ? 0 : var4.field369.field271;
    }

    @OriginalMember(owner = "r", name = "h", descriptor = "(IIII)I")
    public int method77(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 7) {
            Tile var5 = this.field286[arg2][arg3][arg0];
            return var5 == null || var5.field370 == null ? 0 : var5.field370.field162;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(III)I")
    public int method78(int arg0, int arg1, int arg2) {
        Tile var4 = this.field286[arg0][arg1][arg2];
        if (var4 == null) {
            return 0;
        }
        for (int var5 = 0; var5 < var4.field373; var5++) {
            Location var6 = var4.field374[var5];
            if ((var6.field262 >> 29 & 0x3) == 2 && var6.field256 == arg1 && var6.field258 == arg2) {
                return var6.field262;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "r", name = "d", descriptor = "(III)I")
    public int method79(int arg0, int arg1, int arg2) {
        Tile var4 = this.field286[arg0][arg1][arg2];
        return var4 == null || var4.field371 == null ? 0 : var4.field371.field194;
    }

    @OriginalMember(owner = "r", name = "i", descriptor = "(IIII)I")
    public int method80(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field286[arg0][arg1][arg2];
        if (var5 == null) {
            return -1;
        } else if (var5.field369 != null && var5.field369.field271 == arg3) {
            return var5.field369.field272 & 0xFF;
        } else if (var5.field370 != null && var5.field370.field162 == arg3) {
            return var5.field370.field163 & 0xFF;
        } else if (var5.field371 != null && var5.field371.field194 == arg3) {
            return var5.field371.field195 & 0xFF;
        } else {
            for (int var6 = 0; var6 < var5.field373; var6++) {
                if (var5.field374[var6].field262 == arg3) {
                    return var5.field374[var6].field263 & 0xFF;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIII)V")
    public void method81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (int) Math.sqrt((double) (arg2 * arg2 + arg4 * arg4 + arg5 * arg5));
        int var8 = arg3 * var7 >> 8;
        for (int var9 = 0; var9 < this.field282; var9++) {
            for (int var10 = 0; var10 < this.field283; var10++) {
                for (int var11 = 0; var11 < this.field284; var11++) {
                    Tile var12 = this.field286[var9][var10][var11];
                    if (var12 != null) {
                        Wall var13 = var12.field369;
                        if (var13 != null && var13.field269 != null && var13.field269.field391 != null) {
                            this.method83(var10, 1, 1, var11, var9, 5, (Model) var13.field269);
                            if (var13.field270 != null && var13.field270.field391 != null) {
                                this.method83(var10, 1, 1, var11, var9, 5, (Model) var13.field270);
                                this.method84((Model) var13.field269, (Model) var13.field270, 0, 0, 0, false);
                                ((Model) var13.field270).method143(arg0, var8, arg4, arg5, arg2);
                            }
                            ((Model) var13.field269).method143(arg0, var8, arg4, arg5, arg2);
                        }
                        for (int var14 = 0; var14 < var12.field373; var14++) {
                            Location var16 = var12.field374[var14];
                            if (var16 != null && var16.field254 != null && var16.field254.field391 != null) {
                                this.method83(var10, var16.field257 + 1 - var16.field256, var16.field259 - var16.field258 + 1, var11, var9, 5, (Model) var16.field254);
                                ((Model) var16.field254).method143(arg0, var8, arg4, arg5, arg2);
                            }
                        }
                        GroundDecor var15 = var12.field371;
                        if (var15 != null && var15.field193.field391 != null) {
                            this.method82(var9, true, var11, var10, (Model) var15.field193);
                            ((Model) var15.field193).method143(arg0, var8, arg4, arg5, arg2);
                        }
                    }
                }
            }
        }
        if (arg1 < 7 || arg1 > 7) {
            ;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IZIILeb;)V")
    private void method82(int arg0, boolean arg1, int arg2, int arg3, Model arg4) {
        if (!arg1) {
            this.field275 = 80;
        }
        if (arg3 < this.field283) {
            Tile var6 = this.field286[arg0][arg3 + 1][arg2];
            if (var6 != null && var6.field371 != null && var6.field371.field193.field391 != null) {
                this.method84(arg4, (Model) var6.field371.field193, 128, 0, 0, true);
            }
        }
        if (arg2 < this.field283) {
            Tile var7 = this.field286[arg0][arg3][arg2 + 1];
            if (var7 != null && var7.field371 != null && var7.field371.field193.field391 != null) {
                this.method84(arg4, (Model) var7.field371.field193, 0, 0, 128, true);
            }
        }
        if (arg3 < this.field283 && arg2 < this.field284) {
            Tile var8 = this.field286[arg0][arg3 + 1][arg2 + 1];
            if (var8 != null && var8.field371 != null && var8.field371.field193.field391 != null) {
                this.method84(arg4, (Model) var8.field371.field193, 128, 0, 128, true);
            }
        }
        if (arg3 >= this.field283 || arg2 <= 0) {
            return;
        }
        Tile var9 = this.field286[arg0][arg3 + 1][arg2 - 1];
        if (var9 != null && var9.field371 != null && var9.field371.field193.field391 != null) {
            this.method84(arg4, (Model) var9.field371.field193, 128, 0, -128, true);
            return;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIILeb;)V")
    private void method83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Model arg6) {
        boolean var8 = true;
        int var9 = arg0;
        int var10 = arg0 + arg1;
        int var11 = arg3 - 1;
        int var12 = arg2 + arg3;
        if (arg5 < 5 || arg5 > 5) {
            return;
        }
        for (int var13 = arg4; var13 <= arg4 + 1; var13++) {
            if (this.field282 != var13) {
                for (int var14 = var9; var14 <= var10; var14++) {
                    if (var14 >= 0 && var14 < this.field283) {
                        for (int var15 = var11; var15 <= var12; var15++) {
                            if (var15 >= 0 && var15 < this.field284 && (!var8 || var14 >= var10 || var15 >= var12 || var15 < arg3 && arg0 != var14)) {
                                Tile var16 = this.field286[var13][var14][var15];
                                if (var16 != null) {
                                    int var17 = (this.field285[var13][var14 + 1][var15] + this.field285[var13][var14][var15] + this.field285[var13][var14][var15 + 1] + this.field285[var13][var14 + 1][var15 + 1]) / 4 - (this.field285[arg4][arg0 + 1][arg3] + this.field285[arg4][arg0][arg3] + this.field285[arg4][arg0][arg3 + 1] + this.field285[arg4][arg0 + 1][arg3 + 1]) / 4;
                                    Wall var18 = var16.field369;
                                    if (var18 != null && var18.field269 != null && var18.field269.field391 != null) {
                                        this.method84(arg6, (Model) var18.field269, (var14 - arg0) * 128 + (1 - arg1) * 64, var17, (1 - arg2) * 64 + (var15 - arg3) * 128, var8);
                                    }
                                    if (var18 != null && var18.field270 != null && var18.field270.field391 != null) {
                                        this.method84(arg6, (Model) var18.field270, (var14 - arg0) * 128 + (1 - arg1) * 64, var17, (1 - arg2) * 64 + (var15 - arg3) * 128, var8);
                                    }
                                    for (int var19 = 0; var19 < var16.field373; var19++) {
                                        Location var20 = var16.field374[var19];
                                        if (var20 != null && var20.field254 != null && var20.field254.field391 != null) {
                                            int var21 = var20.field257 + 1 - var20.field256;
                                            int var22 = var20.field259 + 1 - var20.field258;
                                            this.method84(arg6, (Model) var20.field254, (var20.field256 - arg0) * 128 + (var21 - arg1) * 64, var17, (var20.field258 - arg3) * 128 + (var22 - arg2) * 64, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var9--;
                var8 = false;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Leb;Leb;IIIZ)V")
    private void method84(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field333++;
        int var7 = 0;
        int[] var8 = arg1.field537;
        int var9 = arg1.field536;
        for (int var10 = 0; var10 < arg0.field536; var10++) {
            VertexNormal var13 = arg0.field391[var10];
            VertexNormal var14 = arg0.field570[var10];
            if (var14.field242 != 0) {
                int var15 = arg0.field538[var10] - arg3;
                if (var15 <= arg1.field561) {
                    int var16 = arg0.field537[var10] - arg2;
                    if (var16 >= arg1.field556 && var16 <= arg1.field557) {
                        int var17 = arg0.field539[var10] - arg4;
                        if (var17 >= arg1.field559 && var17 <= arg1.field558) {
                            for (int var18 = 0; var18 < var9; var18++) {
                                VertexNormal var19 = arg1.field391[var18];
                                VertexNormal var20 = arg1.field570[var18];
                                if (var8[var18] == var16 && arg1.field539[var18] == var17 && arg1.field538[var18] == var15 && var20.field242 != 0) {
                                    var13.field239 += var20.field239;
                                    var13.field240 += var20.field240;
                                    var13.field241 += var20.field241;
                                    var13.field242 += var20.field242;
                                    var19.field239 += var14.field239;
                                    var19.field240 += var14.field240;
                                    var19.field241 += var14.field241;
                                    var19.field242 += var14.field242;
                                    var7++;
                                    this.field331[var10] = this.field333;
                                    this.field332[var18] = this.field333;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg5) {
            return;
        }
        for (int var11 = 0; var11 < arg0.field540; var11++) {
            if (this.field331[arg0.field541[var11]] == this.field333 && this.field331[arg0.field542[var11]] == this.field333 && this.field331[arg0.field543[var11]] == this.field333) {
                arg0.field547[var11] = -1;
            }
        }
        for (int var12 = 0; var12 < arg1.field540; var12++) {
            if (this.field332[arg1.field541[var12]] == this.field333 && this.field332[arg1.field542[var12]] == this.field333 && this.field332[arg1.field543[var12]] == this.field333) {
                arg1.field547[var12] = -1;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "([IIIIII)V")
    public void method85(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Tile var7 = this.field286[arg3][arg4][arg5];
        if (var7 == null) {
            return;
        }
        TileUnderlay var8 = var7.field367;
        if (var8 != null) {
            int var9 = var8.field249;
            if (var9 != 0) {
                for (int var10 = 0; var10 < 4; var10++) {
                    arg0[arg1] = var9;
                    arg0[arg1 + 1] = var9;
                    arg0[arg1 + 2] = var9;
                    arg0[arg1 + 3] = var9;
                    arg1 += arg2;
                }
            }
            return;
        }
        TileOverlay var11 = var7.field368;
        if (var11 == null) {
            return;
        }
        int var12 = var11.field176;
        int var13 = var11.field177;
        int var14 = var11.field178;
        int var15 = var11.field179;
        int[] var16 = this.field334[var12];
        int[] var17 = this.field335[var13];
        int var18 = 0;
        if (var14 != 0) {
            for (int var19 = 0; var19 < 4; var19++) {
                arg0[arg1] = var16[var17[var18++]] == 0 ? var14 : var15;
                arg0[arg1 + 1] = var16[var17[var18++]] == 0 ? var14 : var15;
                arg0[arg1 + 2] = var16[var17[var18++]] == 0 ? var14 : var15;
                arg0[arg1 + 3] = var16[var17[var18++]] == 0 ? var14 : var15;
                arg1 += arg2;
            }
            return;
        }
        for (int var20 = 0; var20 < 4; var20++) {
            if (var16[var17[var18++]] != 0) {
                arg0[arg1] = var15;
            }
            if (var16[var17[var18++]] != 0) {
                arg0[arg1 + 1] = var15;
            }
            if (var16[var17[var18++]] != 0) {
                arg0[arg1 + 2] = var15;
            }
            if (var16[var17[var18++]] != 0) {
                arg0[arg1 + 3] = var15;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "([IIIIII)V")
    public static void method86(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 3) {
            return;
        }
        field340 = 0;
        field341 = 0;
        field342 = arg5;
        field343 = arg2;
        field338 = arg5 / 2;
        field339 = arg2 / 2;
        boolean[][][][] var6 = new boolean[9][32][53][53];
        for (int var7 = 128; var7 <= 384; var7 += 32) {
            for (int var15 = 0; var15 < 2048; var15 += 64) {
                field303 = Model.field599[var7];
                field304 = Model.field600[var7];
                field305 = Model.field599[var15];
                field306 = Model.field600[var15];
                int var16 = (var7 - 128) / 32;
                int var17 = var15 / 64;
                for (int var18 = -26; var18 <= 26; var18++) {
                    for (int var19 = -26; var19 <= 26; var19++) {
                        int var20 = var18 * 128;
                        int var21 = var19 * 128;
                        boolean var22 = false;
                        for (int var23 = -arg1; var23 <= arg4; var23 += 128) {
                            if (method87(arg0[var16] + var23, 437, var21, var20)) {
                                var22 = true;
                                break;
                            }
                        }
                        var6[var16][var17][var18 + 25 + 1][var19 + 25 + 1] = var22;
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 8; var8++) {
            for (int var9 = 0; var9 < 32; var9++) {
                for (int var10 = -25; var10 < 25; var10++) {
                    for (int var11 = -25; var11 < 25; var11++) {
                        boolean var12 = false;
                        label82: for (int var13 = -1; var13 <= 1; var13++) {
                            for (int var14 = -1; var14 <= 1; var14++) {
                                if (var6[var8][var9][var10 + var13 + 25 + 1][var11 + var14 + 25 + 1]) {
                                    var12 = true;
                                    break label82;
                                }
                                if (var6[var8][(var9 + 1) % 31][var10 + var13 + 25 + 1][var11 + var14 + 25 + 1]) {
                                    var12 = true;
                                    break label82;
                                }
                                if (var6[var8 + 1][var9][var10 + var13 + 25 + 1][var11 + var14 + 25 + 1]) {
                                    var12 = true;
                                    break label82;
                                }
                                if (var6[var8 + 1][(var9 + 1) % 31][var10 + var13 + 25 + 1][var11 + var14 + 25 + 1]) {
                                    var12 = true;
                                    break label82;
                                }
                            }
                        }
                        field336[var8][var9][var10 + 25][var11 + 25] = var12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "j", descriptor = "(IIII)Z")
    public static boolean method87(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = field306 * arg3 + field305 * arg2 >> 16;
        int var6 = field306 * arg2 - field305 * arg3 >> 16;
        int var7 = field304 * var6 + field303 * arg0 >> 16;
        int var8 = field304 * arg0 - field303 * var6 >> 16;
        if (var7 >= 50 && var7 <= 3500) {
            int var9 = (var5 << 9) / var7 + field338;
            int var10 = (var8 << 9) / var7 + field339;
            return var9 >= field340 && var9 <= field342 && var10 >= field341 && var10 <= field343;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "e", descriptor = "(III)V")
    public void method88(int arg0, int arg1, int arg2) {
        field312 = true;
        field313 = arg2;
        if (arg1 != 0) {
            field274 = true;
        }
        field314 = arg0;
        field315 = -1;
        field316 = -1;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIII)V")
    public void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= this.field283 * 128) {
            arg0 = this.field283 * 128 - 1;
        }
        if (arg3 < 0) {
            arg3 = 0;
        } else if (arg3 >= this.field284 * 128) {
            arg3 = this.field284 * 128 - 1;
        }
        field293++;
        field303 = Model.field599[arg2];
        field304 = Model.field600[arg2];
        field305 = Model.field599[arg6];
        field306 = Model.field600[arg6];
        field337 = field336[(arg2 - 128) / 32][arg6 / 64];
        field300 = arg0;
        if (arg1 < this.field278 || arg1 > this.field278) {
            this.field278 = -370;
        }
        field301 = arg5;
        field302 = arg3;
        field298 = arg0 / 128;
        field299 = arg3 / 128;
        field292 = arg4;
        field294 = field298 - 25;
        if (field294 < 0) {
            field294 = 0;
        }
        field296 = field299 - 25;
        if (field296 < 0) {
            field296 = 0;
        }
        field295 = field298 + 25;
        if (field295 > this.field283) {
            field295 = this.field283;
        }
        field297 = field299 + 25;
        if (field297 > this.field284) {
            field297 = this.field284;
        }
        this.method95(309);
        field291 = 0;
        for (int var8 = this.field287; var8 < this.field282; var8++) {
            Tile[][] var33 = this.field286[var8];
            for (int var34 = field294; var34 < field295; var34++) {
                for (int var35 = field296; var35 < field297; var35++) {
                    Tile var36 = var33[var34][var35];
                    if (var36 != null) {
                        if (var36.field377 <= arg4 && (field337[var34 + 25 - field298][var35 + 25 - field299] || this.field285[var8][var34][var35] - arg5 >= 2000)) {
                            var36.field378 = true;
                            var36.field379 = true;
                            if (var36.field373 > 0) {
                                var36.field380 = true;
                            } else {
                                var36.field380 = false;
                            }
                            field291++;
                        } else {
                            var36.field378 = false;
                            var36.field379 = false;
                            var36.field381 = 0;
                        }
                    }
                }
            }
        }
        for (int var9 = this.field287; var9 < this.field282; var9++) {
            Tile[][] var22 = this.field286[var9];
            for (int var23 = -25; var23 <= 0; var23++) {
                int var24 = field298 + var23;
                int var25 = field298 - var23;
                if (var24 >= field294 || var25 < field295) {
                    for (int var26 = -25; var26 <= 0; var26++) {
                        int var27 = field299 + var26;
                        int var28 = field299 - var26;
                        if (var24 >= field294) {
                            if (var27 >= field296) {
                                Tile var29 = var22[var24][var27];
                                if (var29 != null && var29.field378) {
                                    this.method90(var29, true);
                                }
                            }
                            if (var28 < field297) {
                                Tile var30 = var22[var24][var28];
                                if (var30 != null && var30.field378) {
                                    this.method90(var30, true);
                                }
                            }
                        }
                        if (var25 < field295) {
                            if (var27 >= field296) {
                                Tile var31 = var22[var25][var27];
                                if (var31 != null && var31.field378) {
                                    this.method90(var31, true);
                                }
                            }
                            if (var28 < field297) {
                                Tile var32 = var22[var25][var28];
                                if (var32 != null && var32.field378) {
                                    this.method90(var32, true);
                                }
                            }
                        }
                        if (field291 == 0) {
                            field312 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var10 = this.field287; var10 < this.field282; var10++) {
            Tile[][] var11 = this.field286[var10];
            for (int var12 = -25; var12 <= 0; var12++) {
                int var13 = field298 + var12;
                int var14 = field298 - var12;
                if (var13 >= field294 || var14 < field295) {
                    for (int var15 = -25; var15 <= 0; var15++) {
                        int var16 = field299 + var15;
                        int var17 = field299 - var15;
                        if (var13 >= field294) {
                            if (var16 >= field296) {
                                Tile var18 = var11[var13][var16];
                                if (var18 != null && var18.field378) {
                                    this.method90(var18, false);
                                }
                            }
                            if (var17 < field297) {
                                Tile var19 = var11[var13][var17];
                                if (var19 != null && var19.field378) {
                                    this.method90(var19, false);
                                }
                            }
                        }
                        if (var14 < field295) {
                            if (var16 >= field296) {
                                Tile var20 = var11[var14][var16];
                                if (var20 != null && var20.field378) {
                                    this.method90(var20, false);
                                }
                            }
                            if (var17 < field297) {
                                Tile var21 = var11[var14][var17];
                                if (var21 != null && var21.field378) {
                                    this.method90(var21, false);
                                }
                            }
                        }
                        if (field291 == 0) {
                            field312 = false;
                            return;
                        }
                    }
                }
            }
        }
        field312 = false;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lv;Z)V")
    public void method90(Tile arg0, boolean arg1) {
        field322.method243(arg0);
        while (true) {
            Tile var3;
            int var4;
            int var5;
            int var6;
            int var7;
            Tile[][] var8;
            Tile var70;
            do {
                Tile var69;
                do {
                    Tile var68;
                    do {
                        Tile var67;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var3 = (Tile) field322.method245();
                                                if (var3 == null) {
                                                    return;
                                                }
                                            } while (!var3.field379);
                                            var4 = var3.field364;
                                            var5 = var3.field365;
                                            var6 = var3.field363;
                                            var7 = var3.field366;
                                            var8 = this.field286[var6];
                                            if (!var3.field378) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var6 > 0) {
                                                    Tile var9 = this.field286[var6 - 1][var4][var5];
                                                    if (var9 != null && var9.field379) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= field298 && var4 > field294) {
                                                    Tile var10 = var8[var4 - 1][var5];
                                                    if (var10 != null && var10.field379 && (var10.field378 || (var3.field376 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= field298 && var4 < field295 - 1) {
                                                    Tile var11 = var8[var4 + 1][var5];
                                                    if (var11 != null && var11.field379 && (var11.field378 || (var3.field376 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 <= field299 && var5 > field296) {
                                                    Tile var12 = var8[var4][var5 - 1];
                                                    if (var12 != null && var12.field379 && (var12.field378 || (var3.field376 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 >= field299 && var5 < field297 - 1) {
                                                    Tile var13 = var8[var4][var5 + 1];
                                                    if (var13 != null && var13.field379 && (var13.field378 || (var3.field376 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var3.field378 = false;
                                            if (var3.field385 != null) {
                                                Tile var14 = var3.field385;
                                                if (var14.field367 == null) {
                                                    if (var14.field368 != null && !this.method96(0, var4, var5)) {
                                                        this.method92(var4, field305, (byte) -89, var5, field303, var14.field368, field306, field304);
                                                    }
                                                } else if (!this.method96(0, var4, var5)) {
                                                    this.method91(var14.field367, 0, field303, field304, field305, field306, var4, var5);
                                                }
                                                Wall var15 = var14.field369;
                                                if (var15 != null) {
                                                    var15.field269.method108(0, field303, field304, field305, field306, var15.field265 - field300, var15.field264 - field301, var15.field266 - field302, var15.field271);
                                                }
                                                for (int var16 = 0; var16 < var14.field373; var16++) {
                                                    Location var17 = var14.field374[var16];
                                                    if (var17 != null) {
                                                        var17.field254.method108(var17.field255, field303, field304, field305, field306, var17.field252 - field300, var17.field251 - field301, var17.field253 - field302, var17.field262);
                                                    }
                                                }
                                            }
                                            boolean var18 = false;
                                            if (var3.field367 == null) {
                                                if (var3.field368 != null && !this.method96(var7, var4, var5)) {
                                                    var18 = true;
                                                    this.method92(var4, field305, (byte) -89, var5, field303, var3.field368, field306, field304);
                                                }
                                            } else if (!this.method96(var7, var4, var5)) {
                                                var18 = true;
                                                this.method91(var3.field367, var7, field303, field304, field305, field306, var4, var5);
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            Wall var21 = var3.field369;
                                            Decor var22 = var3.field370;
                                            if (var21 != null || var22 != null) {
                                                if (field298 == var4) {
                                                    var19++;
                                                } else if (field298 < var4) {
                                                    var19 += 2;
                                                }
                                                if (field299 == var5) {
                                                    var19 += 3;
                                                } else if (field299 > var5) {
                                                    var19 += 6;
                                                }
                                                var20 = field323[var19];
                                                var3.field384 = field325[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field267 & field324[var19]) == 0) {
                                                    var3.field381 = 0;
                                                } else if (var21.field267 == 16) {
                                                    var3.field381 = 3;
                                                    var3.field382 = field326[var19];
                                                    var3.field383 = 3 - var3.field382;
                                                } else if (var21.field267 == 32) {
                                                    var3.field381 = 6;
                                                    var3.field382 = field327[var19];
                                                    var3.field383 = 6 - var3.field382;
                                                } else if (var21.field267 == 64) {
                                                    var3.field381 = 12;
                                                    var3.field382 = field328[var19];
                                                    var3.field383 = 12 - var3.field382;
                                                } else {
                                                    var3.field381 = 9;
                                                    var3.field382 = field329[var19];
                                                    var3.field383 = 9 - var3.field382;
                                                }
                                                if ((var21.field267 & var20) != 0 && !this.method97(var7, var4, var5, var21.field267)) {
                                                    var21.field269.method108(0, field303, field304, field305, field306, var21.field265 - field300, var21.field264 - field301, var21.field266 - field302, var21.field271);
                                                }
                                                if ((var21.field268 & var20) != 0 && !this.method97(var7, var4, var5, var21.field268)) {
                                                    var21.field270.method108(0, field303, field304, field305, field306, var21.field265 - field300, var21.field264 - field301, var21.field266 - field302, var21.field271);
                                                }
                                            }
                                            if (var22 != null && !this.method98(var7, var4, var5, var22.field161.field392)) {
                                                if ((var22.field159 & var20) != 0) {
                                                    var22.field161.method108(var22.field160, field303, field304, field305, field306, var22.field157 - field300, var22.field156 - field301, var22.field158 - field302, var22.field162);
                                                } else if ((var22.field159 & 0x300) != 0) {
                                                    int var23 = var22.field157 - field300;
                                                    int var24 = var22.field156 - field301;
                                                    int var25 = var22.field158 - field302;
                                                    int var26 = var22.field160;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if ((var22.field159 & 0x100) != 0 && var28 < var27) {
                                                        int var29 = field308[var26] + var23;
                                                        int var30 = field309[var26] + var25;
                                                        var22.field161.method108(var26 * 512 + 256, field303, field304, field305, field306, var29, var24, var30, var22.field162);
                                                    }
                                                    if ((var22.field159 & 0x200) != 0 && var28 > var27) {
                                                        int var31 = field310[var26] + var23;
                                                        int var32 = field311[var26] + var25;
                                                        var22.field161.method108(var26 * 512 + 1280 & 0x7FF, field303, field304, field305, field306, var31, var24, var32, var22.field162);
                                                    }
                                                }
                                            }
                                            if (var18) {
                                                GroundDecor var33 = var3.field371;
                                                if (var33 != null) {
                                                    var33.field193.method108(0, field303, field304, field305, field306, var33.field191 - field300, var33.field190 - field301, var33.field192 - field302, var33.field194);
                                                }
                                                GroundObject var34 = var3.field372;
                                                if (var34 != null && var34.field203 == 0) {
                                                    if (var34.field200 != null) {
                                                        var34.field200.method108(0, field303, field304, field305, field306, var34.field197 - field300, var34.field196 - field301, var34.field198 - field302, var34.field202);
                                                    }
                                                    if (var34.field201 != null) {
                                                        var34.field201.method108(0, field303, field304, field305, field306, var34.field197 - field300, var34.field196 - field301, var34.field198 - field302, var34.field202);
                                                    }
                                                    if (var34.field199 != null) {
                                                        var34.field199.method108(0, field303, field304, field305, field306, var34.field197 - field300, var34.field196 - field301, var34.field198 - field302, var34.field202);
                                                    }
                                                }
                                            }
                                            int var35 = var3.field376;
                                            if (var35 != 0) {
                                                if (var4 < field298 && (var35 & 0x4) != 0) {
                                                    Tile var36 = var8[var4 + 1][var5];
                                                    if (var36 != null && var36.field379) {
                                                        field322.method243(var36);
                                                    }
                                                }
                                                if (var5 < field299 && (var35 & 0x2) != 0) {
                                                    Tile var37 = var8[var4][var5 + 1];
                                                    if (var37 != null && var37.field379) {
                                                        field322.method243(var37);
                                                    }
                                                }
                                                if (var4 > field298 && (var35 & 0x1) != 0) {
                                                    Tile var38 = var8[var4 - 1][var5];
                                                    if (var38 != null && var38.field379) {
                                                        field322.method243(var38);
                                                    }
                                                }
                                                if (var5 > field299 && (var35 & 0x8) != 0) {
                                                    Tile var39 = var8[var4][var5 - 1];
                                                    if (var39 != null && var39.field379) {
                                                        field322.method243(var39);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var3.field381 != 0) {
                                            boolean var40 = true;
                                            for (int var41 = 0; var41 < var3.field373; var41++) {
                                                if (field293 != var3.field374[var41].field261 && (var3.field375[var41] & var3.field381) == var3.field382) {
                                                    var40 = false;
                                                    break;
                                                }
                                            }
                                            if (var40) {
                                                Wall var42 = var3.field369;
                                                if (!this.method97(var7, var4, var5, var42.field267)) {
                                                    var42.field269.method108(0, field303, field304, field305, field306, var42.field265 - field300, var42.field264 - field301, var42.field266 - field302, var42.field271);
                                                }
                                                var3.field381 = 0;
                                            }
                                        }
                                        if (!var3.field380) {
                                            break;
                                        }
                                        try {
                                            int var43 = var3.field373;
                                            var3.field380 = false;
                                            int var44 = 0;
                                            label559: for (int var45 = 0; var45 < var43; var45++) {
                                                Location var46 = var3.field374[var45];
                                                if (field293 != var46.field261) {
                                                    for (int var47 = var46.field256; var47 <= var46.field257; var47++) {
                                                        for (int var48 = var46.field258; var48 <= var46.field259; var48++) {
                                                            Tile var49 = var8[var47][var48];
                                                            if (var49.field378) {
                                                                var3.field380 = true;
                                                                continue label559;
                                                            }
                                                            if (var49.field381 != 0) {
                                                                int var50 = 0;
                                                                if (var47 > var46.field256) {
                                                                    var50++;
                                                                }
                                                                if (var47 < var46.field257) {
                                                                    var50 += 4;
                                                                }
                                                                if (var48 > var46.field258) {
                                                                    var50 += 8;
                                                                }
                                                                if (var48 < var46.field259) {
                                                                    var50 += 2;
                                                                }
                                                                if ((var50 & var49.field381) == var3.field383) {
                                                                    var3.field380 = true;
                                                                    continue label559;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    field307[var44++] = var46;
                                                    int var51 = field298 - var46.field256;
                                                    int var52 = var46.field257 - field298;
                                                    if (var52 > var51) {
                                                        var51 = var52;
                                                    }
                                                    int var53 = field299 - var46.field258;
                                                    int var54 = var46.field259 - field299;
                                                    if (var54 > var53) {
                                                        var46.field260 = var51 + var54;
                                                    } else {
                                                        var46.field260 = var51 + var53;
                                                    }
                                                }
                                            }
                                            while (var44 > 0) {
                                                int var55 = -50;
                                                int var56 = -1;
                                                for (int var57 = 0; var57 < var44; var57++) {
                                                    Location var58 = field307[var57];
                                                    if (field293 != var58.field261) {
                                                        if (var58.field260 > var55) {
                                                            var55 = var58.field260;
                                                            var56 = var57;
                                                        } else if (var58.field260 == var55) {
                                                            int var59 = var58.field252 - field300;
                                                            int var60 = var58.field253 - field302;
                                                            int var61 = field307[var56].field252 - field300;
                                                            int var62 = field307[var56].field253 - field302;
                                                            if (var59 * var59 + var60 * var60 > var61 * var61 + var62 * var62) {
                                                                var56 = var57;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var56 == -1) {
                                                    break;
                                                }
                                                Location var63 = field307[var56];
                                                var63.field261 = field293;
                                                if (!this.method99(var7, var63.field256, var63.field257, var63.field258, var63.field259, var63.field254.field392)) {
                                                    var63.field254.method108(var63.field255, field303, field304, field305, field306, var63.field252 - field300, var63.field251 - field301, var63.field253 - field302, var63.field262);
                                                }
                                                for (int var64 = var63.field256; var64 <= var63.field257; var64++) {
                                                    for (int var65 = var63.field258; var65 <= var63.field259; var65++) {
                                                        Tile var66 = var8[var64][var65];
                                                        if (var66.field381 != 0) {
                                                            field322.method243(var66);
                                                        } else if ((var4 != var64 || var5 != var65) && var66.field379) {
                                                            field322.method243(var66);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var3.field380) {
                                                break;
                                            }
                                        } catch (Exception var89) {
                                            var3.field380 = false;
                                            break;
                                        }
                                    }
                                } while (!var3.field379);
                            } while (var3.field381 != 0);
                            if (var4 > field298 || var4 <= field294) {
                                break;
                            }
                            var67 = var8[var4 - 1][var5];
                        } while (var67 != null && var67.field379);
                        if (var4 < field298 || var4 >= field295 - 1) {
                            break;
                        }
                        var68 = var8[var4 + 1][var5];
                    } while (var68 != null && var68.field379);
                    if (var5 > field299 || var5 <= field296) {
                        break;
                    }
                    var69 = var8[var4][var5 - 1];
                } while (var69 != null && var69.field379);
                if (var5 < field299 || var5 >= field297 - 1) {
                    break;
                }
                var70 = var8[var4][var5 + 1];
            } while (var70 != null && var70.field379);
            var3.field379 = false;
            field291--;
            GroundObject var71 = var3.field372;
            if (var71 != null && var71.field203 != 0) {
                if (var71.field200 != null) {
                    var71.field200.method108(0, field303, field304, field305, field306, var71.field197 - field300, var71.field196 - field301 - var71.field203, var71.field198 - field302, var71.field202);
                }
                if (var71.field201 != null) {
                    var71.field201.method108(0, field303, field304, field305, field306, var71.field197 - field300, var71.field196 - field301 - var71.field203, var71.field198 - field302, var71.field202);
                }
                if (var71.field199 != null) {
                    var71.field199.method108(0, field303, field304, field305, field306, var71.field197 - field300, var71.field196 - field301 - var71.field203, var71.field198 - field302, var71.field202);
                }
            }
            if (var3.field384 != 0) {
                Decor var72 = var3.field370;
                if (var72 != null && !this.method98(var7, var4, var5, var72.field161.field392)) {
                    if ((var72.field159 & var3.field384) != 0) {
                        var72.field161.method108(var72.field160, field303, field304, field305, field306, var72.field157 - field300, var72.field156 - field301, var72.field158 - field302, var72.field162);
                    } else if ((var72.field159 & 0x300) != 0) {
                        int var73 = var72.field157 - field300;
                        int var74 = var72.field156 - field301;
                        int var75 = var72.field158 - field302;
                        int var76 = var72.field160;
                        int var77;
                        if (var76 == 1 || var76 == 2) {
                            var77 = -var73;
                        } else {
                            var77 = var73;
                        }
                        int var78;
                        if (var76 == 2 || var76 == 3) {
                            var78 = -var75;
                        } else {
                            var78 = var75;
                        }
                        if ((var72.field159 & 0x100) != 0 && var78 >= var77) {
                            int var79 = field308[var76] + var73;
                            int var80 = field309[var76] + var75;
                            var72.field161.method108(var76 * 512 + 256, field303, field304, field305, field306, var79, var74, var80, var72.field162);
                        }
                        if ((var72.field159 & 0x200) != 0 && var78 <= var77) {
                            int var81 = field310[var76] + var73;
                            int var82 = field311[var76] + var75;
                            var72.field161.method108(var76 * 512 + 1280 & 0x7FF, field303, field304, field305, field306, var81, var74, var82, var72.field162);
                        }
                    }
                }
                Wall var83 = var3.field369;
                if (var83 != null) {
                    if ((var83.field268 & var3.field384) != 0 && !this.method97(var7, var4, var5, var83.field268)) {
                        var83.field270.method108(0, field303, field304, field305, field306, var83.field265 - field300, var83.field264 - field301, var83.field266 - field302, var83.field271);
                    }
                    if ((var83.field267 & var3.field384) != 0 && !this.method97(var7, var4, var5, var83.field267)) {
                        var83.field269.method108(0, field303, field304, field305, field306, var83.field265 - field300, var83.field264 - field301, var83.field266 - field302, var83.field271);
                    }
                }
            }
            if (var6 < this.field282 - 1) {
                Tile var84 = this.field286[var6 + 1][var4][var5];
                if (var84 != null && var84.field379) {
                    field322.method243(var84);
                }
            }
            if (var4 < field298) {
                Tile var85 = var8[var4 + 1][var5];
                if (var85 != null && var85.field379) {
                    field322.method243(var85);
                }
            }
            if (var5 < field299) {
                Tile var86 = var8[var4][var5 + 1];
                if (var86 != null && var86.field379) {
                    field322.method243(var86);
                }
            }
            if (var4 > field298) {
                Tile var87 = var8[var4 - 1][var5];
                if (var87 != null && var87.field379) {
                    field322.method243(var87);
                }
            }
            if (var5 > field299) {
                Tile var88 = var8[var4][var5 - 1];
                if (var88 != null && var88.field379) {
                    field322.method243(var88);
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lo;IIIIIII)V")
    public void method91(TileUnderlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9;
        int var10 = var9 = (arg6 << 7) - field300;
        int var11;
        int var12 = var11 = (arg7 << 7) - field302;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = this.field285[arg1][arg6][arg7] - field301;
        int var18 = this.field285[arg1][arg6 + 1][arg7] - field301;
        int var19 = this.field285[arg1][arg6 + 1][arg7 + 1] - field301;
        int var20 = this.field285[arg1][arg6][arg7 + 1] - field301;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + Pix3D.field640;
        int var46 = (var24 << 9) / var25 + Pix3D.field641;
        int var47 = (var27 << 9) / var31 + Pix3D.field640;
        int var48 = (var30 << 9) / var31 + Pix3D.field641;
        int var49 = (var33 << 9) / var37 + Pix3D.field640;
        int var50 = (var36 << 9) / var37 + Pix3D.field641;
        int var51 = (var39 << 9) / var43 + Pix3D.field640;
        int var52 = (var42 << 9) / var43 + Pix3D.field641;
        Pix3D.field639 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            Pix3D.field636 = false;
            if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > Pix2D.field627 || var51 > Pix2D.field627 || var47 > Pix2D.field627) {
                Pix3D.field636 = true;
            }
            if (field312 && this.method94(field313, field314, var50, var52, var48, var49, var51, var47)) {
                field315 = arg6;
                field316 = arg7;
            }
            if (arg0.field247 == -1) {
                if (arg0.field245 != 12345678) {
                    Pix3D.method174(var50, var52, var48, var49, var51, var47, arg0.field245, arg0.field246, arg0.field244);
                }
            } else if (field281) {
                int var53 = field330[arg0.field247];
                Pix3D.method174(var50, var52, var48, var49, var51, var47, this.method93(arg0.field245, var53, this.field279), this.method93(arg0.field246, var53, this.field279), this.method93(arg0.field244, var53, this.field279));
            } else if (arg0.field248) {
                Pix3D.method178(var50, var52, var48, var49, var51, var47, arg0.field245, arg0.field246, arg0.field244, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field247);
            } else {
                Pix3D.method178(var50, var52, var48, var49, var51, var47, arg0.field245, arg0.field246, arg0.field244, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field247);
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        Pix3D.field636 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Pix2D.field627 || var47 > Pix2D.field627 || var51 > Pix2D.field627) {
            Pix3D.field636 = true;
        }
        if (field312 && this.method94(field313, field314, var46, var48, var52, var45, var47, var51)) {
            field315 = arg6;
            field316 = arg7;
        }
        if (arg0.field247 != -1) {
            if (!field281) {
                Pix3D.method178(var46, var48, var52, var45, var47, var51, arg0.field243, arg0.field244, arg0.field246, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field247);
                return;
            }
            int var54 = field330[arg0.field247];
            Pix3D.method174(var46, var48, var52, var45, var47, var51, this.method93(arg0.field243, var54, this.field279), this.method93(arg0.field244, var54, this.field279), this.method93(arg0.field246, var54, this.field279));
        } else if (arg0.field243 != 12345678) {
            Pix3D.method174(var46, var48, var52, var45, var47, var51, arg0.field243, arg0.field244, arg0.field246);
            return;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIBIILi;II)V")
    public void method92(int arg0, int arg1, byte arg2, int arg3, int arg4, TileOverlay arg5, int arg6, int arg7) {
        int var9 = arg5.field165.length;
        if (arg2 != -89) {
            return;
        }
        for (int var10 = 0; var10 < var9; var10++) {
            int var23 = arg5.field165[var10] - field300;
            int var24 = arg5.field166[var10] - field301;
            int var25 = arg5.field167[var10] - field302;
            int var26 = arg1 * var25 + arg6 * var23 >> 16;
            int var27 = arg6 * var25 - arg1 * var23 >> 16;
            int var29 = arg7 * var24 - arg4 * var27 >> 16;
            int var30 = arg4 * var24 + arg7 * var27 >> 16;
            if (var30 < 50) {
                return;
            }
            if (arg5.field174 != null) {
                TileOverlay.field182[var10] = var26;
                TileOverlay.field183[var10] = var29;
                TileOverlay.field184[var10] = var30;
            }
            TileOverlay.field180[var10] = (var26 << 9) / var30 + Pix3D.field640;
            TileOverlay.field181[var10] = (var29 << 9) / var30 + Pix3D.field641;
        }
        Pix3D.field639 = 0;
        int var11 = arg5.field171.length;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = arg5.field171[var12];
            int var14 = arg5.field172[var12];
            int var15 = arg5.field173[var12];
            int var16 = TileOverlay.field180[var13];
            int var17 = TileOverlay.field180[var14];
            int var18 = TileOverlay.field180[var15];
            int var19 = TileOverlay.field181[var13];
            int var20 = TileOverlay.field181[var14];
            int var21 = TileOverlay.field181[var15];
            if ((var16 - var17) * (var21 - var20) - (var18 - var17) * (var19 - var20) > 0) {
                Pix3D.field636 = false;
                if (var16 < 0 || var17 < 0 || var18 < 0 || var16 > Pix2D.field627 || var17 > Pix2D.field627 || var18 > Pix2D.field627) {
                    Pix3D.field636 = true;
                }
                if (field312 && this.method94(field313, field314, var19, var20, var21, var16, var17, var18)) {
                    field315 = arg0;
                    field316 = arg3;
                }
                if (arg5.field174 == null || arg5.field174[var12] == -1) {
                    if (arg5.field168[var12] != 12345678) {
                        Pix3D.method174(var19, var20, var21, var16, var17, var18, arg5.field168[var12], arg5.field169[var12], arg5.field170[var12]);
                    }
                } else if (field281) {
                    int var22 = field330[arg5.field174[var12]];
                    Pix3D.method174(var19, var20, var21, var16, var17, var18, this.method93(arg5.field168[var12], var22, this.field279), this.method93(arg5.field169[var12], var22, this.field279), this.method93(arg5.field170[var12], var22, this.field279));
                } else if (arg5.field175) {
                    Pix3D.method178(var19, var20, var21, var16, var17, var18, arg5.field168[var12], arg5.field169[var12], arg5.field170[var12], TileOverlay.field182[0], TileOverlay.field182[1], TileOverlay.field182[3], TileOverlay.field183[0], TileOverlay.field183[1], TileOverlay.field183[3], TileOverlay.field184[0], TileOverlay.field184[1], TileOverlay.field184[3], arg5.field174[var12]);
                } else {
                    Pix3D.method178(var19, var20, var21, var16, var17, var18, arg5.field168[var12], arg5.field169[var12], arg5.field170[var12], TileOverlay.field182[var13], TileOverlay.field182[var14], TileOverlay.field182[var15], TileOverlay.field183[var13], TileOverlay.field183[var14], TileOverlay.field183[var15], TileOverlay.field184[var13], TileOverlay.field184[var14], TileOverlay.field184[var15], arg5.field174[var12]);
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "f", descriptor = "(III)I")
    public int method93(int arg0, int arg1, int arg2) {
        int var4 = 127 - arg0;
        int var5 = (arg1 & 0x7F) * var4 / 160;
        if (arg2 != 5) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (var5 < 2) {
            var5 = 2;
        } else if (var5 > 126) {
            var5 = 126;
        }
        return (arg1 & 0xFF80) + var5;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var9 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var10 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var11 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var9 * var11 > 0 && var10 * var11 > 0;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(I)V")
    private void method95(int arg0) {
        int var2 = 89 / arg0;
        int var3 = field318[field292];
        Occlude[] var4 = field319[field292];
        field320 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            Occlude var6 = var4[var5];
            if (var6.field225 == 1) {
                int var7 = var6.field221 + 25 - field298;
                if (var7 >= 0 && var7 <= 50) {
                    int var8 = var6.field223 + 25 - field299;
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    int var9 = var6.field224 + 25 - field299;
                    if (var9 > 50) {
                        var9 = 50;
                    }
                    boolean var10 = false;
                    while (var8 <= var9) {
                        if (field337[var7][var8++]) {
                            var10 = true;
                            break;
                        }
                    }
                    if (var10) {
                        int var11 = field300 - var6.field226;
                        if (var11 > 32) {
                            var6.field232 = 1;
                        } else {
                            if (var11 >= -32) {
                                continue;
                            }
                            var6.field232 = 2;
                            var11 = -var11;
                        }
                        var6.field235 = (var6.field228 - field302 << 8) / var11;
                        var6.field236 = (var6.field229 - field302 << 8) / var11;
                        var6.field237 = (var6.field230 - field301 << 8) / var11;
                        var6.field238 = (var6.field231 - field301 << 8) / var11;
                        field321[field320++] = var6;
                    }
                }
            } else if (var6.field225 == 2) {
                int var12 = var6.field223 + 25 - field299;
                if (var12 >= 0 && var12 <= 50) {
                    int var13 = var6.field221 + 25 - field298;
                    if (var13 < 0) {
                        var13 = 0;
                    }
                    int var14 = var6.field222 + 25 - field298;
                    if (var14 > 50) {
                        var14 = 50;
                    }
                    boolean var15 = false;
                    while (var13 <= var14) {
                        if (field337[var13++][var12]) {
                            var15 = true;
                            break;
                        }
                    }
                    if (var15) {
                        int var16 = field302 - var6.field228;
                        if (var16 > 32) {
                            var6.field232 = 3;
                        } else {
                            if (var16 >= -32) {
                                continue;
                            }
                            var6.field232 = 4;
                            var16 = -var16;
                        }
                        var6.field233 = (var6.field226 - field300 << 8) / var16;
                        var6.field234 = (var6.field227 - field300 << 8) / var16;
                        var6.field237 = (var6.field230 - field301 << 8) / var16;
                        var6.field238 = (var6.field231 - field301 << 8) / var16;
                        field321[field320++] = var6;
                    }
                }
            } else if (var6.field225 == 4) {
                int var17 = var6.field230 - field301;
                if (var17 > 128) {
                    int var18 = var6.field223 + 25 - field299;
                    if (var18 < 0) {
                        var18 = 0;
                    }
                    int var19 = var6.field224 + 25 - field299;
                    if (var19 > 50) {
                        var19 = 50;
                    }
                    if (var18 <= var19) {
                        int var20 = var6.field221 + 25 - field298;
                        if (var20 < 0) {
                            var20 = 0;
                        }
                        int var21 = var6.field222 + 25 - field298;
                        if (var21 > 50) {
                            var21 = 50;
                        }
                        boolean var22 = false;
                        label145: for (int var23 = var20; var23 <= var21; var23++) {
                            for (int var24 = var18; var24 <= var19; var24++) {
                                if (field337[var23][var24]) {
                                    var22 = true;
                                    break label145;
                                }
                            }
                        }
                        if (var22) {
                            var6.field232 = 5;
                            var6.field233 = (var6.field226 - field300 << 8) / var17;
                            var6.field234 = (var6.field227 - field300 << 8) / var17;
                            var6.field235 = (var6.field228 - field302 << 8) / var17;
                            var6.field236 = (var6.field229 - field302 << 8) / var17;
                            field321[field320++] = var6;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "g", descriptor = "(III)Z")
    private boolean method96(int arg0, int arg1, int arg2) {
        int var4 = this.field290[arg0][arg1][arg2];
        if (-field293 == var4) {
            return false;
        } else if (field293 == var4) {
            return true;
        } else {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            if (this.method100(var5 + 1, this.field285[arg0][arg1][arg2], var6 + 1) && this.method100(var5 + 128 - 1, this.field285[arg0][arg1 + 1][arg2], var6 + 1) && this.method100(var5 + 128 - 1, this.field285[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.method100(var5 + 1, this.field285[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
                this.field290[arg0][arg1][arg2] = field293;
                return true;
            } else {
                this.field290[arg0][arg1][arg2] = -field293;
                return false;
            }
        }
    }

    @OriginalMember(owner = "r", name = "k", descriptor = "(IIII)Z")
    private boolean method97(int arg0, int arg1, int arg2, int arg3) {
        if (!this.method96(arg0, arg1, arg2)) {
            return false;
        }
        int var5 = arg1 << 7;
        int var6 = arg2 << 7;
        int var7 = this.field285[arg0][arg1][arg2] - 1;
        int var8 = var7 - 120;
        int var9 = var7 - 230;
        int var10 = var7 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var5 > field300) {
                    if (!this.method100(var5, var7, var6)) {
                        return false;
                    }
                    if (!this.method100(var5, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method100(var5, var8, var6)) {
                        return false;
                    }
                    if (!this.method100(var5, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method100(var5, var9, var6)) {
                    return false;
                }
                if (!this.method100(var5, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var6 < field302) {
                    if (!this.method100(var5, var7, var6 + 128)) {
                        return false;
                    }
                    if (!this.method100(var5 + 128, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method100(var5, var8, var6 + 128)) {
                        return false;
                    }
                    if (!this.method100(var5 + 128, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method100(var5, var9, var6 + 128)) {
                    return false;
                }
                if (!this.method100(var5 + 128, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var5 < field300) {
                    if (!this.method100(var5 + 128, var7, var6)) {
                        return false;
                    }
                    if (!this.method100(var5 + 128, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method100(var5 + 128, var8, var6)) {
                        return false;
                    }
                    if (!this.method100(var5 + 128, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method100(var5 + 128, var9, var6)) {
                    return false;
                }
                if (!this.method100(var5 + 128, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var6 > field302) {
                    if (!this.method100(var5, var7, var6)) {
                        return false;
                    }
                    if (!this.method100(var5 + 128, var7, var6)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method100(var5, var8, var6)) {
                        return false;
                    }
                    if (!this.method100(var5 + 128, var8, var6)) {
                        return false;
                    }
                }
                if (!this.method100(var5, var9, var6)) {
                    return false;
                }
                if (!this.method100(var5 + 128, var9, var6)) {
                    return false;
                }
                return true;
            }
        }
        if (!this.method100(var5 + 64, var10, var6 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return this.method100(var5, var9, var6 + 128);
        } else if (arg3 == 32) {
            return this.method100(var5 + 128, var9, var6 + 128);
        } else if (arg3 == 64) {
            return this.method100(var5 + 128, var9, var6);
        } else if (arg3 == 128) {
            return this.method100(var5, var9, var6);
        } else {
            System.out.println("Warning unsupported wall type");
            return true;
        }
    }

    @OriginalMember(owner = "r", name = "l", descriptor = "(IIII)Z")
    private boolean method98(int arg0, int arg1, int arg2, int arg3) {
        if (this.method96(arg0, arg1, arg2)) {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            return this.method100(var5 + 1, this.field285[arg0][arg1][arg2] - arg3, var6 + 1) && this.method100(var5 + 128 - 1, this.field285[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method100(var5 + 128 - 1, this.field285[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method100(var5 + 1, this.field285[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIIIII)Z")
    private boolean method99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var9 = arg1; var9 <= arg2; var9++) {
                for (int var15 = arg3; var15 <= arg4; var15++) {
                    if (this.field290[arg0][var9][var15] == -field293) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = this.field285[arg0][arg1][arg3] - arg5;
            if (!this.method100(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!this.method100(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!this.method100(var10, var12, var14)) {
                return false;
            } else if (this.method100(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (this.method96(arg0, arg1, arg3)) {
            int var7 = arg1 << 7;
            int var8 = arg3 << 7;
            return this.method100(var7 + 1, this.field285[arg0][arg1][arg3] - arg5, var8 + 1) && this.method100(var7 + 128 - 1, this.field285[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.method100(var7 + 128 - 1, this.field285[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.method100(var7 + 1, this.field285[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "h", descriptor = "(III)Z")
    private boolean method100(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < field320; var4++) {
            Occlude var5 = field321[var4];
            if (var5.field232 == 1) {
                int var6 = var5.field226 - arg0;
                if (var6 > 0) {
                    int var7 = (var5.field235 * var6 >> 8) + var5.field228;
                    int var8 = (var5.field236 * var6 >> 8) + var5.field229;
                    int var9 = (var5.field237 * var6 >> 8) + var5.field230;
                    int var10 = (var5.field238 * var6 >> 8) + var5.field231;
                    if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field232 == 2) {
                int var11 = arg0 - var5.field226;
                if (var11 > 0) {
                    int var12 = (var5.field235 * var11 >> 8) + var5.field228;
                    int var13 = (var5.field236 * var11 >> 8) + var5.field229;
                    int var14 = (var5.field237 * var11 >> 8) + var5.field230;
                    int var15 = (var5.field238 * var11 >> 8) + var5.field231;
                    if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
                        return true;
                    }
                }
            } else if (var5.field232 == 3) {
                int var16 = var5.field228 - arg2;
                if (var16 > 0) {
                    int var17 = (var5.field233 * var16 >> 8) + var5.field226;
                    int var18 = (var5.field234 * var16 >> 8) + var5.field227;
                    int var19 = (var5.field237 * var16 >> 8) + var5.field230;
                    int var20 = (var5.field238 * var16 >> 8) + var5.field231;
                    if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
                        return true;
                    }
                }
            } else if (var5.field232 == 4) {
                int var21 = arg2 - var5.field228;
                if (var21 > 0) {
                    int var22 = (var5.field233 * var21 >> 8) + var5.field226;
                    int var23 = (var5.field234 * var21 >> 8) + var5.field227;
                    int var24 = (var5.field237 * var21 >> 8) + var5.field230;
                    int var25 = (var5.field238 * var21 >> 8) + var5.field231;
                    if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
                        return true;
                    }
                }
            } else if (var5.field232 == 5) {
                int var26 = arg1 - var5.field230;
                if (var26 > 0) {
                    int var27 = (var5.field233 * var26 >> 8) + var5.field226;
                    int var28 = (var5.field234 * var26 >> 8) + var5.field227;
                    int var29 = (var5.field235 * var26 >> 8) + var5.field228;
                    int var30 = (var5.field236 * var26 >> 8) + var5.field229;
                    if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
