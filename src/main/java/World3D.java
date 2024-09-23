import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("r")
public class World3D {

    @OriginalMember(owner = "r", name = "a", descriptor = "Z")
    private boolean field280 = false;

    @OriginalMember(owner = "r", name = "c", descriptor = "B")
    private byte field282 = 8;

    @OriginalMember(owner = "r", name = "d", descriptor = "B")
    private byte field283 = 8;

    @OriginalMember(owner = "r", name = "e", descriptor = "Z")
    private boolean field284 = false;

    @OriginalMember(owner = "r", name = "f", descriptor = "I")
    private int field285 = 696;

    @OriginalMember(owner = "r", name = "g", descriptor = "Z")
    private boolean field286 = true;

    @OriginalMember(owner = "r", name = "h", descriptor = "I")
    private int field287 = 6771;

    @OriginalMember(owner = "r", name = "r", descriptor = "[Lp;")
    public Location[] field297 = new Location[5000];

    @OriginalMember(owner = "r", name = "hb", descriptor = "[I")
    public int[] field339 = new int[10000];

    @OriginalMember(owner = "r", name = "ib", descriptor = "[I")
    public int[] field340 = new int[10000];

    @OriginalMember(owner = "r", name = "kb", descriptor = "[[I")
    public int[][] field342 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "r", name = "lb", descriptor = "[[I")
    public int[][] field343 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "r", name = "k", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "r", name = "l", descriptor = "I")
    public int field291;

    @OriginalMember(owner = "r", name = "m", descriptor = "I")
    public int field292;

    @OriginalMember(owner = "r", name = "o", descriptor = "[[[Lv;")
    public Tile[][][] field294;

    @OriginalMember(owner = "r", name = "s", descriptor = "[[[I")
    public int[][][] field298;

    @OriginalMember(owner = "r", name = "n", descriptor = "[[[I")
    public int[][][] field293;

    @OriginalMember(owner = "r", name = "b", descriptor = "I")
    private static int field281 = -3052;

    @OriginalMember(owner = "r", name = "i", descriptor = "I")
    private static int field288 = -31779;

    @OriginalMember(owner = "r", name = "j", descriptor = "Z")
    public static boolean field289 = true;

    @OriginalMember(owner = "r", name = "J", descriptor = "[Lp;")
    public static Location[] field315 = new Location[100];

    @OriginalMember(owner = "r", name = "K", descriptor = "[I")
    public static final int[] field316 = new int[] { 53, -53, -53, 53 };

    @OriginalMember(owner = "r", name = "L", descriptor = "[I")
    public static final int[] field317 = new int[] { -53, -53, 53, 53 };

    @OriginalMember(owner = "r", name = "M", descriptor = "[I")
    public static final int[] field318 = new int[] { -45, 45, 45, -45 };

    @OriginalMember(owner = "r", name = "N", descriptor = "[I")
    public static final int[] field319 = new int[] { 45, 45, -45, -45 };

    @OriginalMember(owner = "r", name = "R", descriptor = "I")
    public static int field323 = -1;

    @OriginalMember(owner = "r", name = "S", descriptor = "I")
    public static int field324 = -1;

    @OriginalMember(owner = "r", name = "T", descriptor = "I")
    public static int field325 = 4;

    @OriginalMember(owner = "r", name = "U", descriptor = "[I")
    public static int[] field326 = new int[field325];

    @OriginalMember(owner = "r", name = "V", descriptor = "[[Lm;")
    public static Occlude[][] field327 = new Occlude[field325][500];

    @OriginalMember(owner = "r", name = "X", descriptor = "[Lm;")
    public static Occlude[] field329 = new Occlude[500];

    @OriginalMember(owner = "r", name = "Y", descriptor = "Lpb;")
    public static LinkList field330 = new LinkList((byte) 9);

    @OriginalMember(owner = "r", name = "Z", descriptor = "[I")
    public static final int[] field331 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "r", name = "ab", descriptor = "[I")
    public static final int[] field332 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "r", name = "bb", descriptor = "[I")
    public static final int[] field333 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "r", name = "cb", descriptor = "[I")
    public static final int[] field334 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "r", name = "db", descriptor = "[I")
    public static final int[] field335 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "r", name = "eb", descriptor = "[I")
    public static final int[] field336 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "r", name = "fb", descriptor = "[I")
    public static final int[] field337 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "r", name = "gb", descriptor = "[I")
    public static final int[] field338 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

    @OriginalMember(owner = "r", name = "mb", descriptor = "[[[[Z")
    public static boolean[][][][] field344 = new boolean[8][32][51][51];

    @OriginalMember(owner = "r", name = "p", descriptor = "I")
    public int field295;

    @OriginalMember(owner = "r", name = "q", descriptor = "I")
    public int field296;

    @OriginalMember(owner = "r", name = "t", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "r", name = "u", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "r", name = "v", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "r", name = "w", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "r", name = "x", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "r", name = "y", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "r", name = "z", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "r", name = "A", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "r", name = "B", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "r", name = "C", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "r", name = "D", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "r", name = "E", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "r", name = "F", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "r", name = "G", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "r", name = "H", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "r", name = "I", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "r", name = "P", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "r", name = "Q", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "r", name = "W", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "r", name = "jb", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "r", name = "ob", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "r", name = "pb", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "r", name = "qb", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "r", name = "rb", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "r", name = "sb", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "r", name = "tb", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "r", name = "O", descriptor = "Z")
    public static boolean field320;

    @OriginalMember(owner = "r", name = "nb", descriptor = "[[Z")
    public static boolean[][] field345;

    @OriginalMember(owner = "r", name = "<init>", descriptor = "(III[[[II)V")
    public World3D(int arg0, int arg1, int arg2, int[][][] arg3, int arg4) {
        this.field290 = arg4;
        this.field291 = arg1;
        this.field292 = arg2;
        this.field294 = new Tile[arg4][arg1][arg2];
        if (arg0 != -15570) {
            throw new NullPointerException();
        }
        this.field298 = new int[arg4][arg1 + 1][arg2 + 1];
        this.field293 = arg3;
        this.method50(this.field280);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(I)V")
    public static void method49(int arg0) {
        field315 = null;
        field326 = null;
        field327 = null;
        field330 = null;
        if (arg0 == 0) {
            field344 = null;
            field345 = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Z)V")
    public void method50(boolean arg0) {
        for (int var2 = 0; var2 < this.field290; var2++) {
            for (int var7 = 0; var7 < this.field291; var7++) {
                for (int var8 = 0; var8 < this.field292; var8++) {
                    this.field294[var2][var7][var8] = null;
                }
            }
        }
        for (int var3 = 0; var3 < field325; var3++) {
            for (int var6 = 0; var6 < field326[var3]; var6++) {
                field327[var3][var6] = null;
            }
            field326[var3] = 0;
        }
        for (int var4 = 0; var4 < this.field296; var4++) {
            this.field297[var4] = null;
        }
        if (arg0) {
            this.field287 = 465;
        }
        this.field296 = 0;
        for (int var5 = 0; var5 < field315.length; var5++) {
            field315[var5] = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(II)V")
    public void method51(int arg0, int arg1) {
        this.field295 = arg0;
        if (arg1 >= 0) {
            this.field284 = !this.field284;
        }
        for (int var3 = 0; var3 < this.field291; var3++) {
            for (int var4 = 0; var4 < this.field292; var4++) {
                this.field294[arg0][var3][var4] = new Tile(arg0, var3, var4);
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(III)V")
    public void method52(int arg0, int arg1, int arg2) {
        Tile var4 = this.field294[0][arg0][arg2];
        for (int var5 = 0; var5 < 3; var5++) {
            Tile var6 = this.field294[var5][arg0][arg2] = this.field294[var5 + 1][arg0][arg2];
            if (var6 != null) {
                var6.field370--;
                for (int var7 = 0; var7 < var6.field380; var7++) {
                    Location var8 = var6.field381[var7];
                    if ((var8.field269 >> 29 & 0x3) == 2 && var8.field263 == arg0 && var8.field265 == arg2) {
                        var8.field257--;
                    }
                }
            }
        }
        if (arg1 != 0) {
            this.field287 = 237;
        }
        if (this.field294[0][arg0][arg2] == null) {
            this.field294[0][arg0][arg2] = new Tile(0, arg0, arg2);
        }
        this.field294[0][arg0][arg2].field392 = var4;
        this.field294[3][arg0][arg2] = null;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIZIIIIII)V")
    public static void method53(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!arg2) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        Occlude var10 = new Occlude();
        var10.field228 = arg7 / 128;
        var10.field229 = arg4 / 128;
        var10.field230 = arg3 / 128;
        var10.field231 = arg0 / 128;
        var10.field232 = arg5;
        var10.field233 = arg7;
        var10.field234 = arg4;
        var10.field235 = arg3;
        var10.field236 = arg0;
        var10.field237 = arg1;
        var10.field238 = arg8;
        field327[arg6][field326[arg6]++] = var10;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIII)V")
    public void method54(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field294[arg0][arg1][arg2];
        if (var5 != null) {
            this.field294[arg0][arg1][arg2].field384 = arg3;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public void method55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            TileUnderlay var21 = new TileUnderlay(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var22 = arg0; var22 >= 0; var22--) {
                if (this.field294[var22][arg1][arg2] == null) {
                    this.field294[var22][arg1][arg2] = new Tile(var22, arg1, arg2);
                }
            }
            this.field294[arg0][arg1][arg2].field374 = var21;
        } else if (arg3 == 1) {
            TileUnderlay var23 = new TileUnderlay(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var24 = arg0; var24 >= 0; var24--) {
                if (this.field294[var24][arg1][arg2] == null) {
                    this.field294[var24][arg1][arg2] = new Tile(var24, arg1, arg2);
                }
            }
            this.field294[arg0][arg1][arg2].field374 = var23;
        } else {
            TileOverlay var25 = new TileOverlay(arg5, arg15, arg4, arg7, arg6, arg14, arg19, arg2, arg8, arg10, arg18, arg9, arg17, arg11, 0, arg12, arg3, arg1, arg13, arg16);
            for (int var26 = arg0; var26 >= 0; var26--) {
                if (this.field294[var26][arg1][arg2] == null) {
                    this.field294[var26][arg1][arg2] = new Tile(var26, arg1, arg2);
                }
            }
            this.field294[arg0][arg1][arg2].field375 = var25;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIILx;IB)V")
    public void method56(int arg0, int arg1, int arg2, int arg3, int arg4, Entity arg5, int arg6, byte arg7) {
        if (arg5 == null) {
            return;
        }
        GroundDecor var9 = new GroundDecor();
        var9.field200 = arg5;
        var9.field198 = arg0 * 128 + 64;
        var9.field199 = arg1 * 128 + 64;
        var9.field197 = arg3;
        var9.field201 = arg4;
        var9.field202 = arg7;
        if (this.field294[arg6][arg0][arg1] == null) {
            this.field294[arg6][arg0][arg1] = new Tile(arg6, arg0, arg1);
        }
        this.field294[arg6][arg0][arg1].field378 = var9;
        if (arg2 <= 0) {
            this.field287 = -164;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILx;Lx;IIIBILx;)V")
    public void method57(int arg0, Entity arg1, Entity arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, Entity arg8) {
        GroundObject var10 = new GroundObject();
        if (arg6 != 110) {
            return;
        }
        var10.field206 = arg1;
        var10.field204 = arg5 * 128 + 64;
        var10.field205 = arg4 * 128 + 64;
        var10.field203 = arg3;
        var10.field209 = arg7;
        var10.field207 = arg2;
        var10.field208 = arg8;
        int var11 = 0;
        Tile var12 = this.field294[arg0][arg5][arg4];
        if (var12 != null) {
            for (int var13 = 0; var13 < var12.field380; var13++) {
                if (var12.field381[var13].field261 instanceof Model) {
                    int var14 = ((Model) var12.field381[var13].field261).field568;
                    if (var14 > var11) {
                        var11 = var14;
                    }
                }
            }
        }
        var10.field210 = var11;
        if (this.field294[arg0][arg5][arg4] == null) {
            this.field294[arg0][arg5][arg4] = new Tile(arg0, arg5, arg4);
        }
        this.field294[arg0][arg5][arg4].field379 = var10;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IBILx;ILx;IIIII)V")
    public void method58(int arg0, byte arg1, int arg2, Entity arg3, int arg4, Entity arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg5 == null && arg3 == null) {
            return;
        }
        Wall var12 = new Wall();
        var12.field278 = arg2;
        var12.field279 = arg1;
        if (arg6 <= 0) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        var12.field272 = arg8 * 128 + 64;
        var12.field273 = arg0 * 128 + 64;
        var12.field271 = arg7;
        var12.field276 = arg5;
        var12.field277 = arg3;
        var12.field274 = arg4;
        var12.field275 = arg9;
        for (int var14 = arg10; var14 >= 0; var14--) {
            if (this.field294[var14][arg8][arg0] == null) {
                this.field294[var14][arg8][arg0] = new Tile(var14, arg8, arg0);
            }
        }
        this.field294[arg10][arg8][arg0].field376 = var12;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILx;IIBIIBIIII)V")
    public void method59(int arg0, Entity arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg1 == null) {
            return;
        }
        Decor var13 = new Decor();
        var13.field170 = arg5;
        if (arg7 != -93) {
            return;
        }
        var13.field171 = arg4;
        var13.field165 = arg3 * 128 + arg10 + 64;
        var13.field166 = arg11 * 128 + arg0 + 64;
        var13.field164 = arg9;
        var13.field169 = arg1;
        var13.field167 = arg6;
        var13.field168 = arg8;
        for (int var14 = arg2; var14 >= 0; var14--) {
            if (this.field294[var14][arg3][arg11] == null) {
                this.field294[var14][arg3][arg11] = new Tile(var14, arg3, arg11);
            }
        }
        this.field294[arg2][arg3][arg11].field377 = var13;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIBILx;IIIII)Z")
    public boolean method60(int arg0, int arg1, int arg2, byte arg3, int arg4, Entity arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg9 <= 0) {
            throw new NullPointerException();
        } else if (arg5 == null) {
            return true;
        } else {
            int var12 = arg1 * 64 + arg2 * 128;
            int var13 = arg0 * 64 + arg4 * 128;
            return this.method63(arg7, arg2, arg4, arg1, arg0, var12, var13, arg10, arg5, arg6, false, arg8, arg3);
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IILx;ZIZIIII)Z")
    public boolean method61(int arg0, int arg1, Entity arg2, boolean arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 == null) {
            return true;
        }
        int var11 = arg1 - arg8;
        int var12 = arg6 - arg8;
        int var13 = arg1 + arg8;
        int var14 = arg6 + arg8;
        if (arg5) {
            if (arg7 > 640 && arg7 < 1408) {
                var14 += 128;
            }
            if (arg7 > 1152 && arg7 < 1920) {
                var13 += 128;
            }
            if (arg7 > 1664 || arg7 < 384) {
                var12 -= 128;
            }
            if (arg7 > 128 && arg7 < 896) {
                var11 -= 128;
            }
        }
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        if (arg3) {
            throw new NullPointerException();
        }
        int var18 = var14 / 128;
        return this.method63(arg0, var15, var16, var17 + 1 - var15, var18 - var16 + 1, arg1, arg6, arg4, arg2, arg7, true, arg9, (byte) 0);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIILx;IIIIIIIII)Z")
    public boolean method62(int arg0, int arg1, int arg2, Entity arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        if (arg2 != 6) {
            this.field284 = !this.field284;
        }
        return arg3 == null ? true : this.method63(arg5, arg12, arg11, arg8 + 1 - arg12, arg10 - arg11 + 1, arg0, arg6, arg4, arg3, arg1, true, arg7, (byte) 0);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIILx;IZIB)Z")
    private boolean method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, boolean arg10, int arg11, byte arg12) {
        for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
            for (int var21 = arg2; var21 < arg2 + arg4; var21++) {
                if (var14 < 0 || var21 < 0 || var14 >= this.field291 || var21 >= this.field292) {
                    return false;
                }
                Tile var22 = this.field294[arg0][var14][var21];
                if (var22 != null && var22.field380 >= 5) {
                    return false;
                }
            }
        }
        Location var15 = new Location();
        var15.field269 = arg11;
        var15.field270 = arg12;
        var15.field257 = arg0;
        var15.field259 = arg5;
        var15.field260 = arg6;
        var15.field258 = arg7;
        var15.field261 = arg8;
        var15.field262 = arg9;
        var15.field263 = arg1;
        var15.field265 = arg2;
        var15.field264 = arg1 + arg3 - 1;
        var15.field266 = arg2 + arg4 - 1;
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
                    if (this.field294[var19][var16][var17] == null) {
                        this.field294[var19][var16][var17] = new Tile(var19, var16, var17);
                    }
                }
                Tile var20 = this.field294[arg0][var16][var17];
                var20.field381[var20.field380] = var15;
                var20.field382[var20.field380] = var18;
                var20.field383 |= var18;
                var20.field380++;
            }
        }
        if (arg10) {
            this.field297[this.field296++] = var15;
        }
        return true;
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(Z)V")
    public void method64(boolean arg0) {
        for (int var2 = 0; var2 < this.field296; var2++) {
            Location var3 = this.field297[var2];
            this.method65(var3, this.field282);
            this.field297[var2] = null;
        }
        this.field296 = 0;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lp;B)V")
    private void method65(Location arg0, byte arg1) {
        for (int var3 = arg0.field263; var3 <= arg0.field264; var3++) {
            for (int var5 = arg0.field265; var5 <= arg0.field266; var5++) {
                Tile var6 = this.field294[arg0.field257][var3][var5];
                if (var6 != null) {
                    for (int var7 = 0; var7 < var6.field380; var7++) {
                        if (var6.field381[var7] == arg0) {
                            var6.field380--;
                            for (int var8 = var7; var8 < var6.field380; var8++) {
                                var6.field381[var8] = var6.field381[var8 + 1];
                                var6.field382[var8] = var6.field382[var8 + 1];
                            }
                            var6.field381[var6.field380] = null;
                            break;
                        }
                    }
                    var6.field383 = 0;
                    for (int var9 = 0; var9 < var6.field380; var9++) {
                        var6.field383 |= var6.field382[var9];
                    }
                }
            }
        }
        if (this.field283 == arg1) {
            boolean var4 = false;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIII)V")
    public void method66(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        Tile var7 = this.field294[arg2][arg0][arg1];
        if (var7 == null) {
            return;
        }
        Decor var8 = var7.field377;
        if (var8 != null) {
            int var9 = arg0 * 128 + 64;
            int var10 = arg1 * 128 + 64;
            var8.field165 = (var8.field165 - var9) * arg4 / 16 + var9;
            var8.field166 = (var8.field166 - var10) * arg4 / 16 + var10;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ZIII)V")
    public void method67(boolean arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field294[arg1][arg3][arg2];
        if (arg0) {
            this.field284 = !this.field284;
        }
        if (var5 != null) {
            var5.field376 = null;
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIII)V")
    public void method68(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field294[arg1][arg3][arg2];
        if (var5 != null) {
            var5.field377 = null;
            if (arg0 > 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IBII)V")
    public void method69(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 3) {
            return;
        }
        Tile var5 = this.field294[arg2][arg3][arg0];
        if (var5 == null) {
            return;
        }
        for (int var6 = 0; var6 < var5.field380; var6++) {
            Location var7 = var5.field381[var6];
            if ((var7.field269 >> 29 & 0x3) == 2 && var7.field263 == arg3 && var7.field265 == arg0) {
                this.method65(var7, this.field282);
                return;
            }
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(ZIII)V")
    public void method70(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            Tile var5 = this.field294[arg2][arg3][arg1];
            if (var5 != null) {
                var5.field378 = null;
            }
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(III)V")
    public void method71(int arg0, int arg1, int arg2) {
        Tile var4 = this.field294[arg0][arg1][arg2];
        if (var4 != null) {
            var4.field379 = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IZII)Lq;")
    public Wall method72(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            this.field287 = -459;
        }
        Tile var5 = this.field294[arg0][arg2][arg3];
        return var5 == null ? null : var5.field376;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIB)Lh;")
    public Decor method73(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 6) {
            throw new NullPointerException();
        }
        boolean var5 = false;
        Tile var6 = this.field294[arg1][arg0][arg2];
        return var6 == null ? null : var6.field377;
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(ZIII)Lp;")
    public Location method74(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            throw new NullPointerException();
        }
        Tile var5 = this.field294[arg2][arg1][arg3];
        if (var5 == null) {
            return null;
        }
        for (int var6 = 0; var6 < var5.field380; var6++) {
            Location var7 = var5.field381[var6];
            if ((var7.field269 >> 29 & 0x3) == 2 && var7.field263 == arg1 && var7.field265 == arg3) {
                return var7;
            }
        }
        return null;
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(IIII)Lj;")
    public GroundDecor method75(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0) {
            throw new NullPointerException();
        }
        Tile var5 = this.field294[arg0][arg3][arg1];
        return var5 == null || var5.field378 == null ? null : var5.field378;
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(III)I")
    public int method76(int arg0, int arg1, int arg2) {
        Tile var4 = this.field294[arg0][arg1][arg2];
        return var4 == null || var4.field376 == null ? 0 : var4.field376.field278;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIZI)I")
    public int method77(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        Tile var6 = this.field294[arg1][arg0][arg3];
        return var6 == null || var6.field377 == null ? 0 : var6.field377.field170;
    }

    @OriginalMember(owner = "r", name = "d", descriptor = "(III)I")
    public int method78(int arg0, int arg1, int arg2) {
        Tile var4 = this.field294[arg0][arg1][arg2];
        if (var4 == null) {
            return 0;
        }
        for (int var5 = 0; var5 < var4.field380; var5++) {
            Location var6 = var4.field381[var5];
            if ((var6.field269 >> 29 & 0x3) == 2 && var6.field263 == arg1 && var6.field265 == arg2) {
                return var6.field269;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "r", name = "e", descriptor = "(III)I")
    public int method79(int arg0, int arg1, int arg2) {
        Tile var4 = this.field294[arg0][arg1][arg2];
        return var4 == null || var4.field378 == null ? 0 : var4.field378.field201;
    }

    @OriginalMember(owner = "r", name = "d", descriptor = "(IIII)I")
    public int method80(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field294[arg0][arg1][arg2];
        if (var5 == null) {
            return -1;
        } else if (var5.field376 != null && var5.field376.field278 == arg3) {
            return var5.field376.field279 & 0xFF;
        } else if (var5.field377 != null && var5.field377.field170 == arg3) {
            return var5.field377.field171 & 0xFF;
        } else if (var5.field378 != null && var5.field378.field201 == arg3) {
            return var5.field378.field202 & 0xFF;
        } else {
            for (int var6 = 0; var6 < var5.field380; var6++) {
                if (var5.field381[var6].field269 == arg3) {
                    return var5.field381[var6].field270 & 0xFF;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIII)V")
    public void method81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (int) Math.sqrt((double) (arg1 * arg1 + arg0 * arg0 + arg3 * arg3));
        int var8 = arg2 * var7 >> 8;
        if (arg5 != 0) {
            this.field286 = !this.field286;
        }
        for (int var9 = 0; var9 < this.field290; var9++) {
            for (int var10 = 0; var10 < this.field291; var10++) {
                for (int var11 = 0; var11 < this.field292; var11++) {
                    Tile var12 = this.field294[var9][var10][var11];
                    if (var12 != null) {
                        Wall var13 = var12.field376;
                        if (var13 != null && var13.field276 != null && var13.field276.field396 != null) {
                            this.method83(1, var9, 205, (Model) var13.field276, var10, 1, var11);
                            if (var13.field277 != null && var13.field277.field396 != null) {
                                this.method83(1, var9, 205, (Model) var13.field277, var10, 1, var11);
                                this.method84((Model) var13.field276, (Model) var13.field277, 0, 0, 0, false);
                                ((Model) var13.field277).method143(arg4, var8, arg3, arg0, arg1);
                            }
                            ((Model) var13.field276).method143(arg4, var8, arg3, arg0, arg1);
                        }
                        for (int var14 = 0; var14 < var12.field380; var14++) {
                            Location var16 = var12.field381[var14];
                            if (var16 != null && var16.field261 != null && var16.field261.field396 != null) {
                                this.method83(var16.field264 + 1 - var16.field263, var9, 205, (Model) var16.field261, var10, var16.field266 + 1 - var16.field265, var11);
                                ((Model) var16.field261).method143(arg4, var8, arg3, arg0, arg1);
                            }
                        }
                        GroundDecor var15 = var12.field378;
                        if (var15 != null && var15.field200.field396 != null) {
                            this.method82(false, var11, var9, (Model) var15.field200, var10);
                            ((Model) var15.field200).method143(arg4, var8, arg3, arg0, arg1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ZIILeb;I)V")
    private void method82(boolean arg0, int arg1, int arg2, Model arg3, int arg4) {
        if (arg0) {
            return;
        }
        if (arg4 < this.field291) {
            Tile var6 = this.field294[arg2][arg4 + 1][arg1];
            if (var6 != null && var6.field378 != null && var6.field378.field200.field396 != null) {
                this.method84(arg3, (Model) var6.field378.field200, 128, 0, 0, true);
            }
        }
        if (arg1 < this.field291) {
            Tile var7 = this.field294[arg2][arg4][arg1 + 1];
            if (var7 != null && var7.field378 != null && var7.field378.field200.field396 != null) {
                this.method84(arg3, (Model) var7.field378.field200, 0, 0, 128, true);
            }
        }
        if (arg4 < this.field291 && arg1 < this.field292) {
            Tile var8 = this.field294[arg2][arg4 + 1][arg1 + 1];
            if (var8 != null && var8.field378 != null && var8.field378.field200.field396 != null) {
                this.method84(arg3, (Model) var8.field378.field200, 128, 0, 128, true);
            }
        }
        if (arg4 >= this.field291 || arg1 <= 0) {
            return;
        }
        Tile var9 = this.field294[arg2][arg4 + 1][arg1 - 1];
        if (var9 != null && var9.field378 != null && var9.field378.field200.field396 != null) {
            this.method84(arg3, (Model) var9.field378.field200, 128, 0, -128, true);
            return;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIILeb;III)V")
    private void method83(int arg0, int arg1, int arg2, Model arg3, int arg4, int arg5, int arg6) {
        boolean var8 = true;
        if (arg2 <= 0) {
            this.field284 = !this.field284;
        }
        int var9 = arg4;
        int var10 = arg0 + arg4;
        int var11 = arg6 - 1;
        int var12 = arg5 + arg6;
        for (int var13 = arg1; var13 <= arg1 + 1; var13++) {
            if (this.field290 != var13) {
                for (int var14 = var9; var14 <= var10; var14++) {
                    if (var14 >= 0 && var14 < this.field291) {
                        for (int var15 = var11; var15 <= var12; var15++) {
                            if (var15 >= 0 && var15 < this.field292 && (!var8 || var14 >= var10 || var15 >= var12 || var15 < arg6 && arg4 != var14)) {
                                Tile var16 = this.field294[var13][var14][var15];
                                if (var16 != null) {
                                    int var17 = (this.field293[var13][var14 + 1][var15] + this.field293[var13][var14][var15] + this.field293[var13][var14][var15 + 1] + this.field293[var13][var14 + 1][var15 + 1]) / 4 - (this.field293[arg1][arg4 + 1][arg6] + this.field293[arg1][arg4][arg6] + this.field293[arg1][arg4][arg6 + 1] + this.field293[arg1][arg4 + 1][arg6 + 1]) / 4;
                                    Wall var18 = var16.field376;
                                    if (var18 != null && var18.field276 != null && var18.field276.field396 != null) {
                                        this.method84(arg3, (Model) var18.field276, (1 - arg0) * 64 + (var14 - arg4) * 128, var17, (1 - arg5) * 64 + (var15 - arg6) * 128, var8);
                                    }
                                    if (var18 != null && var18.field277 != null && var18.field277.field396 != null) {
                                        this.method84(arg3, (Model) var18.field277, (1 - arg0) * 64 + (var14 - arg4) * 128, var17, (1 - arg5) * 64 + (var15 - arg6) * 128, var8);
                                    }
                                    for (int var19 = 0; var19 < var16.field380; var19++) {
                                        Location var20 = var16.field381[var19];
                                        if (var20 != null && var20.field261 != null && var20.field261.field396 != null) {
                                            int var21 = var20.field264 + 1 - var20.field263;
                                            int var22 = var20.field266 + 1 - var20.field265;
                                            this.method84(arg3, (Model) var20.field261, (var20.field263 - arg4) * 128 + (var21 - arg0) * 64, var17, (var20.field265 - arg6) * 128 + (var22 - arg5) * 64, var8);
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
        this.field341++;
        int var7 = 0;
        int[] var8 = arg1.field541;
        int var9 = arg1.field540;
        for (int var10 = 0; var10 < arg0.field540; var10++) {
            VertexNormal var13 = arg0.field396[var10];
            VertexNormal var14 = arg0.field574[var10];
            if (var14.field249 != 0) {
                int var15 = arg0.field542[var10] - arg3;
                if (var15 <= arg1.field565) {
                    int var16 = arg0.field541[var10] - arg2;
                    if (var16 >= arg1.field560 && var16 <= arg1.field561) {
                        int var17 = arg0.field543[var10] - arg4;
                        if (var17 >= arg1.field563 && var17 <= arg1.field562) {
                            for (int var18 = 0; var18 < var9; var18++) {
                                VertexNormal var19 = arg1.field396[var18];
                                VertexNormal var20 = arg1.field574[var18];
                                if (var8[var18] == var16 && arg1.field543[var18] == var17 && arg1.field542[var18] == var15 && var20.field249 != 0) {
                                    var13.field246 += var20.field246;
                                    var13.field247 += var20.field247;
                                    var13.field248 += var20.field248;
                                    var13.field249 += var20.field249;
                                    var19.field246 += var14.field246;
                                    var19.field247 += var14.field247;
                                    var19.field248 += var14.field248;
                                    var19.field249 += var14.field249;
                                    var7++;
                                    this.field339[var10] = this.field341;
                                    this.field340[var18] = this.field341;
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
        for (int var11 = 0; var11 < arg0.field544; var11++) {
            if (this.field339[arg0.field545[var11]] == this.field341 && this.field339[arg0.field546[var11]] == this.field341 && this.field339[arg0.field547[var11]] == this.field341) {
                arg0.field551[var11] = -1;
            }
        }
        for (int var12 = 0; var12 < arg1.field544; var12++) {
            if (this.field340[arg1.field545[var12]] == this.field341 && this.field340[arg1.field546[var12]] == this.field341 && this.field340[arg1.field547[var12]] == this.field341) {
                arg1.field551[var12] = -1;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "([IIIIII)V")
    public void method85(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Tile var7 = this.field294[arg3][arg4][arg5];
        if (var7 == null) {
            return;
        }
        TileUnderlay var8 = var7.field374;
        if (var8 != null) {
            int var9 = var8.field256;
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
        TileOverlay var11 = var7.field375;
        if (var11 == null) {
            return;
        }
        int var12 = var11.field183;
        int var13 = var11.field184;
        int var14 = var11.field185;
        int var15 = var11.field186;
        int[] var16 = this.field342[var12];
        int[] var17 = this.field343[var13];
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

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIII[II)V")
    public static void method86(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
        field348 = 0;
        field349 = 0;
        field350 = arg3;
        field351 = arg1;
        field346 = arg3 / 2;
        field347 = arg1 / 2;
        boolean[][][][] var6 = new boolean[9][32][53][53];
        for (int var7 = 128; var7 <= 384; var7 += 32) {
            for (int var15 = 0; var15 < 2048; var15 += 64) {
                field311 = Model.field603[var7];
                field312 = Model.field604[var7];
                field313 = Model.field603[var15];
                field314 = Model.field604[var15];
                int var16 = (var7 - 128) / 32;
                int var17 = var15 / 64;
                for (int var18 = -26; var18 <= 26; var18++) {
                    for (int var19 = -26; var19 <= 26; var19++) {
                        int var20 = var18 * 128;
                        int var21 = var19 * 128;
                        boolean var22 = false;
                        for (int var23 = -arg5; var23 <= arg0; var23 += 128) {
                            if (method87(var21, arg4[var16] + var23, var20, (byte) 6)) {
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
                        field344[var8][var9][var10 + 25][var11 + 25] = var12;
                    }
                }
            }
        }
        if (arg2 != 7) {
            field281 = -473;
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIIB)Z")
    public static boolean method87(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = field314 * arg2 + field313 * arg0 >> 16;
        int var5 = field314 * arg0 - field313 * arg2 >> 16;
        int var6 = field312 * var5 + field311 * arg1 >> 16;
        int var7 = field312 * arg1 - field311 * var5 >> 16;
        if (arg3 != 6) {
            field288 = -137;
        }
        if (var6 >= 50 && var6 <= 3500) {
            int var8 = (var4 << 9) / var6 + field346;
            int var9 = (var7 << 9) / var6 + field347;
            return var8 >= field348 && var8 <= field350 && var9 >= field349 && var9 <= field351;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "f", descriptor = "(III)V")
    public void method88(int arg0, int arg1, int arg2) {
        if (arg2 < 0 || arg2 > 0) {
            this.field280 = !this.field280;
        }
        field320 = true;
        field321 = arg1;
        field322 = arg0;
        field323 = -1;
        field324 = -1;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ZIIIIII)V")
    public void method89(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= this.field291 * 128) {
            arg2 = this.field291 * 128 - 1;
        }
        if (arg1 < 0) {
            arg1 = 0;
        } else if (arg1 >= this.field292 * 128) {
            arg1 = this.field292 * 128 - 1;
        }
        field301++;
        if (!arg0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        field311 = Model.field603[arg4];
        field312 = Model.field604[arg4];
        field313 = Model.field603[arg6];
        field314 = Model.field604[arg6];
        field345 = field344[(arg4 - 128) / 32][arg6 / 64];
        field308 = arg2;
        field309 = arg3;
        field310 = arg1;
        field306 = arg2 / 128;
        field307 = arg1 / 128;
        field300 = arg5;
        field302 = field306 - 25;
        if (field302 < 0) {
            field302 = 0;
        }
        field304 = field307 - 25;
        if (field304 < 0) {
            field304 = 0;
        }
        field303 = field306 + 25;
        if (field303 > this.field291) {
            field303 = this.field291;
        }
        field305 = field307 + 25;
        if (field305 > this.field292) {
            field305 = this.field292;
        }
        this.method95(0);
        field299 = 0;
        for (int var9 = this.field295; var9 < this.field290; var9++) {
            Tile[][] var34 = this.field294[var9];
            for (int var35 = field302; var35 < field303; var35++) {
                for (int var36 = field304; var36 < field305; var36++) {
                    Tile var37 = var34[var35][var36];
                    if (var37 != null) {
                        if (var37.field384 <= arg5 && (field345[var35 + 25 - field306][var36 + 25 - field307] || this.field293[var9][var35][var36] - arg3 >= 2000)) {
                            var37.field385 = true;
                            var37.field386 = true;
                            if (var37.field380 > 0) {
                                var37.field387 = true;
                            } else {
                                var37.field387 = false;
                            }
                            field299++;
                        } else {
                            var37.field385 = false;
                            var37.field386 = false;
                            var37.field388 = 0;
                        }
                    }
                }
            }
        }
        for (int var10 = this.field295; var10 < this.field290; var10++) {
            Tile[][] var23 = this.field294[var10];
            for (int var24 = -25; var24 <= 0; var24++) {
                int var25 = field306 + var24;
                int var26 = field306 - var24;
                if (var25 >= field302 || var26 < field303) {
                    for (int var27 = -25; var27 <= 0; var27++) {
                        int var28 = field307 + var27;
                        int var29 = field307 - var27;
                        if (var25 >= field302) {
                            if (var28 >= field304) {
                                Tile var30 = var23[var25][var28];
                                if (var30 != null && var30.field385) {
                                    this.method90(var30, true);
                                }
                            }
                            if (var29 < field305) {
                                Tile var31 = var23[var25][var29];
                                if (var31 != null && var31.field385) {
                                    this.method90(var31, true);
                                }
                            }
                        }
                        if (var26 < field303) {
                            if (var28 >= field304) {
                                Tile var32 = var23[var26][var28];
                                if (var32 != null && var32.field385) {
                                    this.method90(var32, true);
                                }
                            }
                            if (var29 < field305) {
                                Tile var33 = var23[var26][var29];
                                if (var33 != null && var33.field385) {
                                    this.method90(var33, true);
                                }
                            }
                        }
                        if (field299 == 0) {
                            field320 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var11 = this.field295; var11 < this.field290; var11++) {
            Tile[][] var12 = this.field294[var11];
            for (int var13 = -25; var13 <= 0; var13++) {
                int var14 = field306 + var13;
                int var15 = field306 - var13;
                if (var14 >= field302 || var15 < field303) {
                    for (int var16 = -25; var16 <= 0; var16++) {
                        int var17 = field307 + var16;
                        int var18 = field307 - var16;
                        if (var14 >= field302) {
                            if (var17 >= field304) {
                                Tile var19 = var12[var14][var17];
                                if (var19 != null && var19.field385) {
                                    this.method90(var19, false);
                                }
                            }
                            if (var18 < field305) {
                                Tile var20 = var12[var14][var18];
                                if (var20 != null && var20.field385) {
                                    this.method90(var20, false);
                                }
                            }
                        }
                        if (var15 < field303) {
                            if (var17 >= field304) {
                                Tile var21 = var12[var15][var17];
                                if (var21 != null && var21.field385) {
                                    this.method90(var21, false);
                                }
                            }
                            if (var18 < field305) {
                                Tile var22 = var12[var15][var18];
                                if (var22 != null && var22.field385) {
                                    this.method90(var22, false);
                                }
                            }
                        }
                        if (field299 == 0) {
                            field320 = false;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lv;Z)V")
    public void method90(Tile arg0, boolean arg1) {
        field330.method244(arg0);
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
                                                var3 = (Tile) field330.method246();
                                                if (var3 == null) {
                                                    return;
                                                }
                                            } while (!var3.field386);
                                            var4 = var3.field371;
                                            var5 = var3.field372;
                                            var6 = var3.field370;
                                            var7 = var3.field373;
                                            var8 = this.field294[var6];
                                            if (!var3.field385) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var6 > 0) {
                                                    Tile var9 = this.field294[var6 - 1][var4][var5];
                                                    if (var9 != null && var9.field386) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= field306 && var4 > field302) {
                                                    Tile var10 = var8[var4 - 1][var5];
                                                    if (var10 != null && var10.field386 && (var10.field385 || (var3.field383 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= field306 && var4 < field303 - 1) {
                                                    Tile var11 = var8[var4 + 1][var5];
                                                    if (var11 != null && var11.field386 && (var11.field385 || (var3.field383 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 <= field307 && var5 > field304) {
                                                    Tile var12 = var8[var4][var5 - 1];
                                                    if (var12 != null && var12.field386 && (var12.field385 || (var3.field383 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 >= field307 && var5 < field305 - 1) {
                                                    Tile var13 = var8[var4][var5 + 1];
                                                    if (var13 != null && var13.field386 && (var13.field385 || (var3.field383 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var3.field385 = false;
                                            if (var3.field392 != null) {
                                                Tile var14 = var3.field392;
                                                if (var14.field374 == null) {
                                                    if (var14.field375 != null && !this.method96(0, var4, var5)) {
                                                        this.method92(field314, var14.field375, field313, -42268, var4, field311, var5, field312);
                                                    }
                                                } else if (!this.method96(0, var4, var5)) {
                                                    this.method91(var14.field374, 0, field311, field312, field313, field314, var4, var5);
                                                }
                                                Wall var15 = var14.field376;
                                                if (var15 != null) {
                                                    var15.field276.method108(0, field311, field312, field313, field314, var15.field272 - field308, var15.field271 - field309, var15.field273 - field310, var15.field278);
                                                }
                                                for (int var16 = 0; var16 < var14.field380; var16++) {
                                                    Location var17 = var14.field381[var16];
                                                    if (var17 != null) {
                                                        var17.field261.method108(var17.field262, field311, field312, field313, field314, var17.field259 - field308, var17.field258 - field309, var17.field260 - field310, var17.field269);
                                                    }
                                                }
                                            }
                                            boolean var18 = false;
                                            if (var3.field374 == null) {
                                                if (var3.field375 != null && !this.method96(var7, var4, var5)) {
                                                    var18 = true;
                                                    this.method92(field314, var3.field375, field313, -42268, var4, field311, var5, field312);
                                                }
                                            } else if (!this.method96(var7, var4, var5)) {
                                                var18 = true;
                                                this.method91(var3.field374, var7, field311, field312, field313, field314, var4, var5);
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            Wall var21 = var3.field376;
                                            Decor var22 = var3.field377;
                                            if (var21 != null || var22 != null) {
                                                if (field306 == var4) {
                                                    var19++;
                                                } else if (field306 < var4) {
                                                    var19 += 2;
                                                }
                                                if (field307 == var5) {
                                                    var19 += 3;
                                                } else if (field307 > var5) {
                                                    var19 += 6;
                                                }
                                                var20 = field331[var19];
                                                var3.field391 = field333[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field274 & field332[var19]) == 0) {
                                                    var3.field388 = 0;
                                                } else if (var21.field274 == 16) {
                                                    var3.field388 = 3;
                                                    var3.field389 = field334[var19];
                                                    var3.field390 = 3 - var3.field389;
                                                } else if (var21.field274 == 32) {
                                                    var3.field388 = 6;
                                                    var3.field389 = field335[var19];
                                                    var3.field390 = 6 - var3.field389;
                                                } else if (var21.field274 == 64) {
                                                    var3.field388 = 12;
                                                    var3.field389 = field336[var19];
                                                    var3.field390 = 12 - var3.field389;
                                                } else {
                                                    var3.field388 = 9;
                                                    var3.field389 = field337[var19];
                                                    var3.field390 = 9 - var3.field389;
                                                }
                                                if ((var21.field274 & var20) != 0 && !this.method97(var7, var4, var5, var21.field274)) {
                                                    var21.field276.method108(0, field311, field312, field313, field314, var21.field272 - field308, var21.field271 - field309, var21.field273 - field310, var21.field278);
                                                }
                                                if ((var21.field275 & var20) != 0 && !this.method97(var7, var4, var5, var21.field275)) {
                                                    var21.field277.method108(0, field311, field312, field313, field314, var21.field272 - field308, var21.field271 - field309, var21.field273 - field310, var21.field278);
                                                }
                                            }
                                            if (var22 != null && !this.method98(var7, var4, var5, var22.field169.field397)) {
                                                if ((var22.field167 & var20) != 0) {
                                                    var22.field169.method108(var22.field168, field311, field312, field313, field314, var22.field165 - field308, var22.field164 - field309, var22.field166 - field310, var22.field170);
                                                } else if ((var22.field167 & 0x300) != 0) {
                                                    int var23 = var22.field165 - field308;
                                                    int var24 = var22.field164 - field309;
                                                    int var25 = var22.field166 - field310;
                                                    int var26 = var22.field168;
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
                                                    if ((var22.field167 & 0x100) != 0 && var28 < var27) {
                                                        int var29 = field316[var26] + var23;
                                                        int var30 = field317[var26] + var25;
                                                        var22.field169.method108(var26 * 512 + 256, field311, field312, field313, field314, var29, var24, var30, var22.field170);
                                                    }
                                                    if ((var22.field167 & 0x200) != 0 && var28 > var27) {
                                                        int var31 = field318[var26] + var23;
                                                        int var32 = field319[var26] + var25;
                                                        var22.field169.method108(var26 * 512 + 1280 & 0x7FF, field311, field312, field313, field314, var31, var24, var32, var22.field170);
                                                    }
                                                }
                                            }
                                            if (var18) {
                                                GroundDecor var33 = var3.field378;
                                                if (var33 != null) {
                                                    var33.field200.method108(0, field311, field312, field313, field314, var33.field198 - field308, var33.field197 - field309, var33.field199 - field310, var33.field201);
                                                }
                                                GroundObject var34 = var3.field379;
                                                if (var34 != null && var34.field210 == 0) {
                                                    if (var34.field207 != null) {
                                                        var34.field207.method108(0, field311, field312, field313, field314, var34.field204 - field308, var34.field203 - field309, var34.field205 - field310, var34.field209);
                                                    }
                                                    if (var34.field208 != null) {
                                                        var34.field208.method108(0, field311, field312, field313, field314, var34.field204 - field308, var34.field203 - field309, var34.field205 - field310, var34.field209);
                                                    }
                                                    if (var34.field206 != null) {
                                                        var34.field206.method108(0, field311, field312, field313, field314, var34.field204 - field308, var34.field203 - field309, var34.field205 - field310, var34.field209);
                                                    }
                                                }
                                            }
                                            int var35 = var3.field383;
                                            if (var35 != 0) {
                                                if (var4 < field306 && (var35 & 0x4) != 0) {
                                                    Tile var36 = var8[var4 + 1][var5];
                                                    if (var36 != null && var36.field386) {
                                                        field330.method244(var36);
                                                    }
                                                }
                                                if (var5 < field307 && (var35 & 0x2) != 0) {
                                                    Tile var37 = var8[var4][var5 + 1];
                                                    if (var37 != null && var37.field386) {
                                                        field330.method244(var37);
                                                    }
                                                }
                                                if (var4 > field306 && (var35 & 0x1) != 0) {
                                                    Tile var38 = var8[var4 - 1][var5];
                                                    if (var38 != null && var38.field386) {
                                                        field330.method244(var38);
                                                    }
                                                }
                                                if (var5 > field307 && (var35 & 0x8) != 0) {
                                                    Tile var39 = var8[var4][var5 - 1];
                                                    if (var39 != null && var39.field386) {
                                                        field330.method244(var39);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var3.field388 != 0) {
                                            boolean var40 = true;
                                            for (int var41 = 0; var41 < var3.field380; var41++) {
                                                if (field301 != var3.field381[var41].field268 && (var3.field382[var41] & var3.field388) == var3.field389) {
                                                    var40 = false;
                                                    break;
                                                }
                                            }
                                            if (var40) {
                                                Wall var42 = var3.field376;
                                                if (!this.method97(var7, var4, var5, var42.field274)) {
                                                    var42.field276.method108(0, field311, field312, field313, field314, var42.field272 - field308, var42.field271 - field309, var42.field273 - field310, var42.field278);
                                                }
                                                var3.field388 = 0;
                                            }
                                        }
                                        if (!var3.field387) {
                                            break;
                                        }
                                        int var43 = var3.field380;
                                        var3.field387 = false;
                                        int var44 = 0;
                                        label563: for (int var45 = 0; var45 < var43; var45++) {
                                            Location var58 = var3.field381[var45];
                                            if (field301 != var58.field268) {
                                                for (int var59 = var58.field263; var59 <= var58.field264; var59++) {
                                                    for (int var64 = var58.field265; var64 <= var58.field266; var64++) {
                                                        Tile var65 = var8[var59][var64];
                                                        if (var65.field385) {
                                                            var3.field387 = true;
                                                            continue label563;
                                                        }
                                                        if (var65.field388 != 0) {
                                                            int var66 = 0;
                                                            if (var59 > var58.field263) {
                                                                var66++;
                                                            }
                                                            if (var59 < var58.field264) {
                                                                var66 += 4;
                                                            }
                                                            if (var64 > var58.field265) {
                                                                var66 += 8;
                                                            }
                                                            if (var64 < var58.field266) {
                                                                var66 += 2;
                                                            }
                                                            if ((var66 & var65.field388) == var3.field390) {
                                                                var3.field387 = true;
                                                                continue label563;
                                                            }
                                                        }
                                                    }
                                                }
                                                field315[var44++] = var58;
                                                int var60 = field306 - var58.field263;
                                                int var61 = var58.field264 - field306;
                                                if (var61 > var60) {
                                                    var60 = var61;
                                                }
                                                int var62 = field307 - var58.field265;
                                                int var63 = var58.field266 - field307;
                                                if (var63 > var62) {
                                                    var58.field267 = var60 + var63;
                                                } else {
                                                    var58.field267 = var60 + var62;
                                                }
                                            }
                                        }
                                        while (var44 > 0) {
                                            int var46 = -50;
                                            int var47 = -1;
                                            for (int var48 = 0; var48 < var44; var48++) {
                                                Location var53 = field315[var48];
                                                if (field301 != var53.field268) {
                                                    if (var53.field267 > var46) {
                                                        var46 = var53.field267;
                                                        var47 = var48;
                                                    } else if (var53.field267 == var46) {
                                                        int var54 = var53.field259 - field308;
                                                        int var55 = var53.field260 - field310;
                                                        int var56 = field315[var47].field259 - field308;
                                                        int var57 = field315[var47].field260 - field310;
                                                        if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                            var47 = var48;
                                                        }
                                                    }
                                                }
                                            }
                                            if (var47 == -1) {
                                                break;
                                            }
                                            Location var49 = field315[var47];
                                            var49.field268 = field301;
                                            if (!this.method99(var7, var49.field263, var49.field264, var49.field265, var49.field266, var49.field261.field397)) {
                                                var49.field261.method108(var49.field262, field311, field312, field313, field314, var49.field259 - field308, var49.field258 - field309, var49.field260 - field310, var49.field269);
                                            }
                                            for (int var50 = var49.field263; var50 <= var49.field264; var50++) {
                                                for (int var51 = var49.field265; var51 <= var49.field266; var51++) {
                                                    Tile var52 = var8[var50][var51];
                                                    if (var52.field388 != 0) {
                                                        field330.method244(var52);
                                                    } else if ((var4 != var50 || var5 != var51) && var52.field386) {
                                                        field330.method244(var52);
                                                    }
                                                }
                                            }
                                        }
                                        if (!var3.field387) {
                                            break;
                                        }
                                    }
                                } while (!var3.field386);
                            } while (var3.field388 != 0);
                            if (var4 > field306 || var4 <= field302) {
                                break;
                            }
                            var67 = var8[var4 - 1][var5];
                        } while (var67 != null && var67.field386);
                        if (var4 < field306 || var4 >= field303 - 1) {
                            break;
                        }
                        var68 = var8[var4 + 1][var5];
                    } while (var68 != null && var68.field386);
                    if (var5 > field307 || var5 <= field304) {
                        break;
                    }
                    var69 = var8[var4][var5 - 1];
                } while (var69 != null && var69.field386);
                if (var5 < field307 || var5 >= field305 - 1) {
                    break;
                }
                var70 = var8[var4][var5 + 1];
            } while (var70 != null && var70.field386);
            var3.field386 = false;
            field299--;
            GroundObject var71 = var3.field379;
            if (var71 != null && var71.field210 != 0) {
                if (var71.field207 != null) {
                    var71.field207.method108(0, field311, field312, field313, field314, var71.field204 - field308, var71.field203 - field309 - var71.field210, var71.field205 - field310, var71.field209);
                }
                if (var71.field208 != null) {
                    var71.field208.method108(0, field311, field312, field313, field314, var71.field204 - field308, var71.field203 - field309 - var71.field210, var71.field205 - field310, var71.field209);
                }
                if (var71.field206 != null) {
                    var71.field206.method108(0, field311, field312, field313, field314, var71.field204 - field308, var71.field203 - field309 - var71.field210, var71.field205 - field310, var71.field209);
                }
            }
            if (var3.field391 != 0) {
                Decor var72 = var3.field377;
                if (var72 != null && !this.method98(var7, var4, var5, var72.field169.field397)) {
                    if ((var72.field167 & var3.field391) != 0) {
                        var72.field169.method108(var72.field168, field311, field312, field313, field314, var72.field165 - field308, var72.field164 - field309, var72.field166 - field310, var72.field170);
                    } else if ((var72.field167 & 0x300) != 0) {
                        int var73 = var72.field165 - field308;
                        int var74 = var72.field164 - field309;
                        int var75 = var72.field166 - field310;
                        int var76 = var72.field168;
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
                        if ((var72.field167 & 0x100) != 0 && var78 >= var77) {
                            int var79 = field316[var76] + var73;
                            int var80 = field317[var76] + var75;
                            var72.field169.method108(var76 * 512 + 256, field311, field312, field313, field314, var79, var74, var80, var72.field170);
                        }
                        if ((var72.field167 & 0x200) != 0 && var78 <= var77) {
                            int var81 = field318[var76] + var73;
                            int var82 = field319[var76] + var75;
                            var72.field169.method108(var76 * 512 + 1280 & 0x7FF, field311, field312, field313, field314, var81, var74, var82, var72.field170);
                        }
                    }
                }
                Wall var83 = var3.field376;
                if (var83 != null) {
                    if ((var83.field275 & var3.field391) != 0 && !this.method97(var7, var4, var5, var83.field275)) {
                        var83.field277.method108(0, field311, field312, field313, field314, var83.field272 - field308, var83.field271 - field309, var83.field273 - field310, var83.field278);
                    }
                    if ((var83.field274 & var3.field391) != 0 && !this.method97(var7, var4, var5, var83.field274)) {
                        var83.field276.method108(0, field311, field312, field313, field314, var83.field272 - field308, var83.field271 - field309, var83.field273 - field310, var83.field278);
                    }
                }
            }
            if (var6 < this.field290 - 1) {
                Tile var84 = this.field294[var6 + 1][var4][var5];
                if (var84 != null && var84.field386) {
                    field330.method244(var84);
                }
            }
            if (var4 < field306) {
                Tile var85 = var8[var4 + 1][var5];
                if (var85 != null && var85.field386) {
                    field330.method244(var85);
                }
            }
            if (var5 < field307) {
                Tile var86 = var8[var4][var5 + 1];
                if (var86 != null && var86.field386) {
                    field330.method244(var86);
                }
            }
            if (var4 > field306) {
                Tile var87 = var8[var4 - 1][var5];
                if (var87 != null && var87.field386) {
                    field330.method244(var87);
                }
            }
            if (var5 > field307) {
                Tile var88 = var8[var4][var5 - 1];
                if (var88 != null && var88.field386) {
                    field330.method244(var88);
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lo;IIIIIII)V")
    public void method91(TileUnderlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9;
        int var10 = var9 = (arg6 << 7) - field308;
        int var11;
        int var12 = var11 = (arg7 << 7) - field310;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = this.field293[arg1][arg6][arg7] - field309;
        int var18 = this.field293[arg1][arg6 + 1][arg7] - field309;
        int var19 = this.field293[arg1][arg6 + 1][arg7 + 1] - field309;
        int var20 = this.field293[arg1][arg6][arg7 + 1] - field309;
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
        int var45 = (var21 << 9) / var25 + Pix3D.field642;
        int var46 = (var24 << 9) / var25 + Pix3D.field643;
        int var47 = (var27 << 9) / var31 + Pix3D.field642;
        int var48 = (var30 << 9) / var31 + Pix3D.field643;
        int var49 = (var33 << 9) / var37 + Pix3D.field642;
        int var50 = (var36 << 9) / var37 + Pix3D.field643;
        int var51 = (var39 << 9) / var43 + Pix3D.field642;
        int var52 = (var42 << 9) / var43 + Pix3D.field643;
        Pix3D.field641 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            Pix3D.field638 = false;
            if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > Pix2D.field628 || var51 > Pix2D.field628 || var47 > Pix2D.field628) {
                Pix3D.field638 = true;
            }
            if (field320 && this.method94(field321, field322, var50, var52, var48, var49, var51, var47)) {
                field323 = arg6;
                field324 = arg7;
            }
            if (arg0.field254 == -1) {
                if (arg0.field252 != 12345678) {
                    Pix3D.method174(var50, var52, var48, var49, var51, var47, arg0.field252, arg0.field253, arg0.field251);
                }
            } else if (field289) {
                int var53 = field338[arg0.field254];
                Pix3D.method174(var50, var52, var48, var49, var51, var47, this.method93(arg0.field252, var53, this.field285), this.method93(arg0.field253, var53, this.field285), this.method93(arg0.field251, var53, this.field285));
            } else if (arg0.field255) {
                Pix3D.method178(var50, var52, var48, var49, var51, var47, arg0.field252, arg0.field253, arg0.field251, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field254);
            } else {
                Pix3D.method178(var50, var52, var48, var49, var51, var47, arg0.field252, arg0.field253, arg0.field251, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field254);
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        Pix3D.field638 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Pix2D.field628 || var47 > Pix2D.field628 || var51 > Pix2D.field628) {
            Pix3D.field638 = true;
        }
        if (field320 && this.method94(field321, field322, var46, var48, var52, var45, var47, var51)) {
            field323 = arg6;
            field324 = arg7;
        }
        if (arg0.field254 != -1) {
            if (!field289) {
                Pix3D.method178(var46, var48, var52, var45, var47, var51, arg0.field250, arg0.field251, arg0.field253, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field254);
                return;
            }
            int var54 = field338[arg0.field254];
            Pix3D.method174(var46, var48, var52, var45, var47, var51, this.method93(arg0.field250, var54, this.field285), this.method93(arg0.field251, var54, this.field285), this.method93(arg0.field253, var54, this.field285));
        } else if (arg0.field250 != 12345678) {
            Pix3D.method174(var46, var48, var52, var45, var47, var51, arg0.field250, arg0.field251, arg0.field253);
            return;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILi;IIIIII)V")
    public void method92(int arg0, TileOverlay arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg1.field172.length;
        for (int var10 = 0; var10 < var9; var10++) {
            int var23 = arg1.field172[var10] - field308;
            int var24 = arg1.field173[var10] - field309;
            int var25 = arg1.field174[var10] - field310;
            int var26 = arg0 * var23 + arg2 * var25 >> 16;
            int var27 = arg0 * var25 - arg2 * var23 >> 16;
            int var29 = arg7 * var24 - arg5 * var27 >> 16;
            int var30 = arg5 * var24 + arg7 * var27 >> 16;
            if (var30 < 50) {
                return;
            }
            if (arg1.field181 != null) {
                TileOverlay.field189[var10] = var26;
                TileOverlay.field190[var10] = var29;
                TileOverlay.field191[var10] = var30;
            }
            TileOverlay.field187[var10] = (var26 << 9) / var30 + Pix3D.field642;
            TileOverlay.field188[var10] = (var29 << 9) / var30 + Pix3D.field643;
        }
        Pix3D.field641 = 0;
        if (arg3 != -42268) {
            this.field284 = !this.field284;
        }
        int var11 = arg1.field178.length;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = arg1.field178[var12];
            int var14 = arg1.field179[var12];
            int var15 = arg1.field180[var12];
            int var16 = TileOverlay.field187[var13];
            int var17 = TileOverlay.field187[var14];
            int var18 = TileOverlay.field187[var15];
            int var19 = TileOverlay.field188[var13];
            int var20 = TileOverlay.field188[var14];
            int var21 = TileOverlay.field188[var15];
            if ((var16 - var17) * (var21 - var20) - (var18 - var17) * (var19 - var20) > 0) {
                Pix3D.field638 = false;
                if (var16 < 0 || var17 < 0 || var18 < 0 || var16 > Pix2D.field628 || var17 > Pix2D.field628 || var18 > Pix2D.field628) {
                    Pix3D.field638 = true;
                }
                if (field320 && this.method94(field321, field322, var19, var20, var21, var16, var17, var18)) {
                    field323 = arg4;
                    field324 = arg6;
                }
                if (arg1.field181 == null || arg1.field181[var12] == -1) {
                    if (arg1.field175[var12] != 12345678) {
                        Pix3D.method174(var19, var20, var21, var16, var17, var18, arg1.field175[var12], arg1.field176[var12], arg1.field177[var12]);
                    }
                } else if (field289) {
                    int var22 = field338[arg1.field181[var12]];
                    Pix3D.method174(var19, var20, var21, var16, var17, var18, this.method93(arg1.field175[var12], var22, this.field285), this.method93(arg1.field176[var12], var22, this.field285), this.method93(arg1.field177[var12], var22, this.field285));
                } else if (arg1.field182) {
                    Pix3D.method178(var19, var20, var21, var16, var17, var18, arg1.field175[var12], arg1.field176[var12], arg1.field177[var12], TileOverlay.field189[0], TileOverlay.field189[1], TileOverlay.field189[3], TileOverlay.field190[0], TileOverlay.field190[1], TileOverlay.field190[3], TileOverlay.field191[0], TileOverlay.field191[1], TileOverlay.field191[3], arg1.field181[var12]);
                } else {
                    Pix3D.method178(var19, var20, var21, var16, var17, var18, arg1.field175[var12], arg1.field176[var12], arg1.field177[var12], TileOverlay.field189[var13], TileOverlay.field189[var14], TileOverlay.field189[var15], TileOverlay.field190[var13], TileOverlay.field190[var14], TileOverlay.field190[var15], TileOverlay.field191[var13], TileOverlay.field191[var14], TileOverlay.field191[var15], arg1.field181[var12]);
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "g", descriptor = "(III)I")
    public int method93(int arg0, int arg1, int arg2) {
        int var4 = 127 - arg0;
        if (arg2 <= 0) {
            return 0;
        }
        int var5 = (arg1 & 0x7F) * var4 / 160;
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

    @OriginalMember(owner = "r", name = "b", descriptor = "(I)V")
    private void method95(int arg0) {
        if (arg0 != 0) {
            return;
        }
        int var2 = field326[field300];
        Occlude[] var3 = field327[field300];
        field328 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            Occlude var5 = var3[var4];
            if (var5.field232 == 1) {
                int var6 = var5.field228 + 25 - field306;
                if (var6 >= 0 && var6 <= 50) {
                    int var7 = var5.field230 + 25 - field307;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = var5.field231 + 25 - field307;
                    if (var8 > 50) {
                        var8 = 50;
                    }
                    boolean var9 = false;
                    while (var7 <= var8) {
                        if (field345[var6][var7++]) {
                            var9 = true;
                            break;
                        }
                    }
                    if (var9) {
                        int var10 = field308 - var5.field233;
                        if (var10 > 32) {
                            var5.field239 = 1;
                        } else {
                            if (var10 >= -32) {
                                continue;
                            }
                            var5.field239 = 2;
                            var10 = -var10;
                        }
                        var5.field242 = (var5.field235 - field310 << 8) / var10;
                        var5.field243 = (var5.field236 - field310 << 8) / var10;
                        var5.field244 = (var5.field237 - field309 << 8) / var10;
                        var5.field245 = (var5.field238 - field309 << 8) / var10;
                        field329[field328++] = var5;
                    }
                }
            } else if (var5.field232 == 2) {
                int var11 = var5.field230 + 25 - field307;
                if (var11 >= 0 && var11 <= 50) {
                    int var12 = var5.field228 + 25 - field306;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = var5.field229 + 25 - field306;
                    if (var13 > 50) {
                        var13 = 50;
                    }
                    boolean var14 = false;
                    while (var12 <= var13) {
                        if (field345[var12++][var11]) {
                            var14 = true;
                            break;
                        }
                    }
                    if (var14) {
                        int var15 = field310 - var5.field235;
                        if (var15 > 32) {
                            var5.field239 = 3;
                        } else {
                            if (var15 >= -32) {
                                continue;
                            }
                            var5.field239 = 4;
                            var15 = -var15;
                        }
                        var5.field240 = (var5.field233 - field308 << 8) / var15;
                        var5.field241 = (var5.field234 - field308 << 8) / var15;
                        var5.field244 = (var5.field237 - field309 << 8) / var15;
                        var5.field245 = (var5.field238 - field309 << 8) / var15;
                        field329[field328++] = var5;
                    }
                }
            } else if (var5.field232 == 4) {
                int var16 = var5.field237 - field309;
                if (var16 > 128) {
                    int var17 = var5.field230 + 25 - field307;
                    if (var17 < 0) {
                        var17 = 0;
                    }
                    int var18 = var5.field231 + 25 - field307;
                    if (var18 > 50) {
                        var18 = 50;
                    }
                    if (var17 <= var18) {
                        int var19 = var5.field228 + 25 - field306;
                        if (var19 < 0) {
                            var19 = 0;
                        }
                        int var20 = var5.field229 + 25 - field306;
                        if (var20 > 50) {
                            var20 = 50;
                        }
                        boolean var21 = false;
                        label149: for (int var22 = var19; var22 <= var20; var22++) {
                            for (int var23 = var17; var23 <= var18; var23++) {
                                if (field345[var22][var23]) {
                                    var21 = true;
                                    break label149;
                                }
                            }
                        }
                        if (var21) {
                            var5.field239 = 5;
                            var5.field240 = (var5.field233 - field308 << 8) / var16;
                            var5.field241 = (var5.field234 - field308 << 8) / var16;
                            var5.field242 = (var5.field235 - field310 << 8) / var16;
                            var5.field243 = (var5.field236 - field310 << 8) / var16;
                            field329[field328++] = var5;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "h", descriptor = "(III)Z")
    private boolean method96(int arg0, int arg1, int arg2) {
        int var4 = this.field298[arg0][arg1][arg2];
        if (-field301 == var4) {
            return false;
        } else if (field301 == var4) {
            return true;
        } else {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            if (this.method100(var5 + 1, this.field293[arg0][arg1][arg2], var6 + 1) && this.method100(var5 + 128 - 1, this.field293[arg0][arg1 + 1][arg2], var6 + 1) && this.method100(var5 + 128 - 1, this.field293[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.method100(var5 + 1, this.field293[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
                this.field298[arg0][arg1][arg2] = field301;
                return true;
            } else {
                this.field298[arg0][arg1][arg2] = -field301;
                return false;
            }
        }
    }

    @OriginalMember(owner = "r", name = "e", descriptor = "(IIII)Z")
    private boolean method97(int arg0, int arg1, int arg2, int arg3) {
        if (!this.method96(arg0, arg1, arg2)) {
            return false;
        }
        int var5 = arg1 << 7;
        int var6 = arg2 << 7;
        int var7 = this.field293[arg0][arg1][arg2] - 1;
        int var8 = var7 - 120;
        int var9 = var7 - 230;
        int var10 = var7 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var5 > field308) {
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
                if (var6 < field310) {
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
                if (var5 < field308) {
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
                if (var6 > field310) {
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

    @OriginalMember(owner = "r", name = "f", descriptor = "(IIII)Z")
    private boolean method98(int arg0, int arg1, int arg2, int arg3) {
        if (this.method96(arg0, arg1, arg2)) {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            return this.method100(var5 + 1, this.field293[arg0][arg1][arg2] - arg3, var6 + 1) && this.method100(var5 + 128 - 1, this.field293[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method100(var5 + 128 - 1, this.field293[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method100(var5 + 1, this.field293[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIIIII)Z")
    private boolean method99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var9 = arg1; var9 <= arg2; var9++) {
                for (int var15 = arg3; var15 <= arg4; var15++) {
                    if (this.field298[arg0][var9][var15] == -field301) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = this.field293[arg0][arg1][arg3] - arg5;
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
            return this.method100(var7 + 1, this.field293[arg0][arg1][arg3] - arg5, var8 + 1) && this.method100(var7 + 128 - 1, this.field293[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.method100(var7 + 128 - 1, this.field293[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.method100(var7 + 1, this.field293[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "i", descriptor = "(III)Z")
    private boolean method100(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < field328; var4++) {
            Occlude var5 = field329[var4];
            if (var5.field239 == 1) {
                int var6 = var5.field233 - arg0;
                if (var6 > 0) {
                    int var7 = (var5.field242 * var6 >> 8) + var5.field235;
                    int var8 = (var5.field243 * var6 >> 8) + var5.field236;
                    int var9 = (var5.field244 * var6 >> 8) + var5.field237;
                    int var10 = (var5.field245 * var6 >> 8) + var5.field238;
                    if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field239 == 2) {
                int var11 = arg0 - var5.field233;
                if (var11 > 0) {
                    int var12 = (var5.field242 * var11 >> 8) + var5.field235;
                    int var13 = (var5.field243 * var11 >> 8) + var5.field236;
                    int var14 = (var5.field244 * var11 >> 8) + var5.field237;
                    int var15 = (var5.field245 * var11 >> 8) + var5.field238;
                    if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
                        return true;
                    }
                }
            } else if (var5.field239 == 3) {
                int var16 = var5.field235 - arg2;
                if (var16 > 0) {
                    int var17 = (var5.field240 * var16 >> 8) + var5.field233;
                    int var18 = (var5.field241 * var16 >> 8) + var5.field234;
                    int var19 = (var5.field244 * var16 >> 8) + var5.field237;
                    int var20 = (var5.field245 * var16 >> 8) + var5.field238;
                    if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
                        return true;
                    }
                }
            } else if (var5.field239 == 4) {
                int var21 = arg2 - var5.field235;
                if (var21 > 0) {
                    int var22 = (var5.field240 * var21 >> 8) + var5.field233;
                    int var23 = (var5.field241 * var21 >> 8) + var5.field234;
                    int var24 = (var5.field244 * var21 >> 8) + var5.field237;
                    int var25 = (var5.field245 * var21 >> 8) + var5.field238;
                    if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
                        return true;
                    }
                }
            } else if (var5.field239 == 5) {
                int var26 = arg1 - var5.field237;
                if (var26 > 0) {
                    int var27 = (var5.field240 * var26 >> 8) + var5.field233;
                    int var28 = (var5.field241 * var26 >> 8) + var5.field234;
                    int var29 = (var5.field242 * var26 >> 8) + var5.field235;
                    int var30 = (var5.field243 * var26 >> 8) + var5.field236;
                    if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
