import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class World3D {

    @OriginalMember(owner = "s", name = "a", descriptor = "Z")
    private boolean field288 = true;

    @OriginalMember(owner = "s", name = "d", descriptor = "I")
    private int field291 = 465;

    @OriginalMember(owner = "s", name = "e", descriptor = "I")
    private int field292 = 165;

    @OriginalMember(owner = "s", name = "f", descriptor = "Z")
    private boolean field293 = true;

    @OriginalMember(owner = "s", name = "i", descriptor = "Z")
    private boolean field296 = false;

    @OriginalMember(owner = "s", name = "j", descriptor = "Z")
    private boolean field297 = true;

    @OriginalMember(owner = "s", name = "k", descriptor = "Z")
    private boolean field298 = false;

    @OriginalMember(owner = "s", name = "t", descriptor = "[Lq;")
    public Location[] field307 = new Location[5000];

    @OriginalMember(owner = "s", name = "jb", descriptor = "[I")
    public int[] field349 = new int[10000];

    @OriginalMember(owner = "s", name = "kb", descriptor = "[I")
    public int[] field350 = new int[10000];

    @OriginalMember(owner = "s", name = "mb", descriptor = "[[I")
    public int[][] field352 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "s", name = "nb", descriptor = "[[I")
    public int[][] field353 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "s", name = "m", descriptor = "I")
    public int field300;

    @OriginalMember(owner = "s", name = "n", descriptor = "I")
    public int field301;

    @OriginalMember(owner = "s", name = "o", descriptor = "I")
    public int field302;

    @OriginalMember(owner = "s", name = "q", descriptor = "[[[Lw;")
    public Tile[][][] field304;

    @OriginalMember(owner = "s", name = "u", descriptor = "[[[I")
    public int[][][] field308;

    @OriginalMember(owner = "s", name = "p", descriptor = "[[[I")
    public int[][][] field303;

    @OriginalMember(owner = "s", name = "b", descriptor = "I")
    private static int field289 = 3;

    @OriginalMember(owner = "s", name = "h", descriptor = "I")
    private static int field295 = 43763;

    @OriginalMember(owner = "s", name = "l", descriptor = "Z")
    public static boolean field299 = true;

    @OriginalMember(owner = "s", name = "L", descriptor = "[Lq;")
    public static Location[] field325 = new Location[100];

    @OriginalMember(owner = "s", name = "M", descriptor = "[I")
    public static final int[] field326 = new int[] { 53, -53, -53, 53 };

    @OriginalMember(owner = "s", name = "N", descriptor = "[I")
    public static final int[] field327 = new int[] { -53, -53, 53, 53 };

    @OriginalMember(owner = "s", name = "O", descriptor = "[I")
    public static final int[] field328 = new int[] { -45, 45, 45, -45 };

    @OriginalMember(owner = "s", name = "P", descriptor = "[I")
    public static final int[] field329 = new int[] { 45, 45, -45, -45 };

    @OriginalMember(owner = "s", name = "T", descriptor = "I")
    public static int field333 = -1;

    @OriginalMember(owner = "s", name = "U", descriptor = "I")
    public static int field334 = -1;

    @OriginalMember(owner = "s", name = "V", descriptor = "I")
    public static int field335 = 4;

    @OriginalMember(owner = "s", name = "W", descriptor = "[I")
    public static int[] field336 = new int[field335];

    @OriginalMember(owner = "s", name = "X", descriptor = "[[Ln;")
    public static Occlude[][] field337 = new Occlude[field335][500];

    @OriginalMember(owner = "s", name = "Z", descriptor = "[Ln;")
    public static Occlude[] field339 = new Occlude[500];

    @OriginalMember(owner = "s", name = "ab", descriptor = "Lpb;")
    public static LinkList field340 = new LinkList(false);

    @OriginalMember(owner = "s", name = "bb", descriptor = "[I")
    public static final int[] field341 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "s", name = "cb", descriptor = "[I")
    public static final int[] field342 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "s", name = "db", descriptor = "[I")
    public static final int[] field343 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "s", name = "eb", descriptor = "[I")
    public static final int[] field344 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "s", name = "fb", descriptor = "[I")
    public static final int[] field345 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "s", name = "gb", descriptor = "[I")
    public static final int[] field346 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "s", name = "hb", descriptor = "[I")
    public static final int[] field347 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "s", name = "ib", descriptor = "[I")
    public static final int[] field348 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

    @OriginalMember(owner = "s", name = "ob", descriptor = "[[[[Z")
    public static boolean[][][][] field354 = new boolean[8][32][51][51];

    @OriginalMember(owner = "s", name = "c", descriptor = "I")
    private static int field290;

    @OriginalMember(owner = "s", name = "g", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "s", name = "r", descriptor = "I")
    public int field305;

    @OriginalMember(owner = "s", name = "s", descriptor = "I")
    public int field306;

    @OriginalMember(owner = "s", name = "v", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "s", name = "w", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "s", name = "x", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "s", name = "y", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "s", name = "z", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "s", name = "A", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "s", name = "B", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "s", name = "C", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "s", name = "D", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "s", name = "E", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "s", name = "F", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "s", name = "G", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "s", name = "H", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "s", name = "I", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "s", name = "J", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "s", name = "K", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "s", name = "R", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "s", name = "S", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "s", name = "Y", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "s", name = "lb", descriptor = "I")
    public int field351;

    @OriginalMember(owner = "s", name = "qb", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "s", name = "rb", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "s", name = "sb", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "s", name = "tb", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "s", name = "ub", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "s", name = "vb", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "s", name = "Q", descriptor = "Z")
    public static boolean field330;

    @OriginalMember(owner = "s", name = "pb", descriptor = "[[Z")
    public static boolean[][] field355;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "([[[IIIII)V")
    public World3D(int[][][] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 9) {
            this.field297 = !this.field297;
        }
        this.field300 = arg4;
        this.field301 = arg2;
        this.field302 = arg1;
        this.field304 = new Tile[arg4][arg2][arg1];
        this.field308 = new int[arg4][arg2 + 1][arg1 + 1];
        this.field303 = arg0;
        this.method63(false);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(B)V")
    public static void method62(byte arg0) {
        field325 = null;
        field336 = null;
        field337 = null;
        if (arg0 != 6) {
            field295 = 327;
        }
        field340 = null;
        field354 = null;
        field355 = null;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Z)V")
    public void method63(boolean arg0) {
        for (int var2 = 0; var2 < this.field300; var2++) {
            for (int var7 = 0; var7 < this.field301; var7++) {
                for (int var8 = 0; var8 < this.field302; var8++) {
                    this.field304[var2][var7][var8] = null;
                }
            }
        }
        if (arg0) {
            return;
        }
        for (int var3 = 0; var3 < field335; var3++) {
            for (int var6 = 0; var6 < field336[var3]; var6++) {
                field337[var3][var6] = null;
            }
            field336[var3] = 0;
        }
        for (int var4 = 0; var4 < this.field306; var4++) {
            this.field307[var4] = null;
        }
        this.field306 = 0;
        for (int var5 = 0; var5 < field325.length; var5++) {
            field325[var5] = null;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(BI)V")
    public void method64(byte arg0, int arg1) {
        this.field305 = arg1;
        for (int var3 = 0; var3 < this.field301; var3++) {
            for (int var6 = 0; var6 < this.field302; var6++) {
                this.field304[arg1][var3][var6] = new Tile(arg1, var3, var6);
            }
        }
        if (arg0 == 1) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(III)V")
    public void method65(int arg0, int arg1, int arg2) {
        Tile var4 = this.field304[0][arg0][arg2];
        for (int var5 = 0; var5 < 3; var5++) {
            this.field304[var5][arg0][arg2] = this.field304[var5 + 1][arg0][arg2];
            if (this.field304[var5][arg0][arg2] != null) {
                this.field304[var5][arg0][arg2].field382--;
            }
        }
        if (this.field304[0][arg0][arg2] == null) {
            this.field304[0][arg0][arg2] = new Tile(0, arg0, arg2);
        }
        this.field304[0][arg0][arg2].field404 = var4;
        this.field304[3][arg0][arg2] = null;
        if (arg1 != 1733) {
            field295 = -221;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIIIIII)V")
    public static void method66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Occlude var9 = new Occlude();
        var9.field236 = arg0 / 128;
        var9.field237 = arg1 / 128;
        var9.field238 = arg4 / 128;
        var9.field239 = arg8 / 128;
        var9.field240 = arg3;
        var9.field241 = arg0;
        var9.field242 = arg1;
        var9.field243 = arg4;
        var9.field244 = arg8;
        if (arg7 < 1 || arg7 > 1) {
            field295 = 30;
        }
        var9.field245 = arg2;
        var9.field246 = arg6;
        field337[arg5][field336[arg5]++] = var9;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIII)V")
    public void method67(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field304[arg0][arg1][arg2];
        if (var5 != null) {
            this.field304[arg0][arg1][arg2].field396 = arg3;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public void method68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            TileUnderlay var21 = new TileUnderlay(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var22 = arg0; var22 >= 0; var22--) {
                if (this.field304[var22][arg1][arg2] == null) {
                    this.field304[var22][arg1][arg2] = new Tile(var22, arg1, arg2);
                }
            }
            this.field304[arg0][arg1][arg2].field386 = var21;
        } else if (arg3 == 1) {
            TileUnderlay var23 = new TileUnderlay(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var24 = arg0; var24 >= 0; var24--) {
                if (this.field304[var24][arg1][arg2] == null) {
                    this.field304[var24][arg1][arg2] = new Tile(var24, arg1, arg2);
                }
            }
            this.field304[arg0][arg1][arg2].field386 = var23;
        } else {
            TileOverlay var25 = new TileOverlay(arg1, field289, arg11, arg2, arg6, arg9, arg10, arg16, arg18, arg3, arg13, arg7, arg17, arg15, arg5, arg12, arg8, arg14, arg19, arg4);
            for (int var26 = arg0; var26 >= 0; var26--) {
                if (this.field304[var26][arg1][arg2] == null) {
                    this.field304[var26][arg1][arg2] = new Tile(var26, arg1, arg2);
                }
            }
            this.field304[arg0][arg1][arg2].field387 = var25;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIIBLy;I)V")
    public void method69(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, Entity arg6, int arg7) {
        if (arg6 == null) {
            return;
        }
        GroundDecor var9 = new GroundDecor();
        var9.field208 = arg6;
        if (arg0 < 7 || arg0 > 7) {
            field295 = -477;
        }
        var9.field206 = arg2 * 128 + 64;
        var9.field207 = arg1 * 128 + 64;
        var9.field205 = arg7;
        var9.field209 = arg4;
        var9.field210 = arg5;
        if (this.field304[arg3][arg2][arg1] == null) {
            this.field304[arg3][arg2][arg1] = new Tile(arg3, arg2, arg1);
        }
        this.field304[arg3][arg2][arg1].field390 = var9;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(BIIIIILy;Ly;Ly;)V")
    public void method70(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Entity arg6, Entity arg7, Entity arg8) {
        if (arg0 != 6) {
            return;
        }
        boolean var10 = false;
        GroundObject var11 = new GroundObject();
        var11.field214 = arg8;
        var11.field212 = arg2 * 128 + 64;
        var11.field213 = arg5 * 128 + 64;
        var11.field211 = arg3;
        var11.field217 = arg1;
        var11.field215 = arg6;
        var11.field216 = arg7;
        int var12 = 0;
        Tile var13 = this.field304[arg4][arg2][arg5];
        if (var13 != null) {
            for (int var14 = 0; var14 < var13.field392; var14++) {
                if (var13.field393[var14].field269 instanceof Model) {
                    int var15 = ((Model) var13.field393[var14].field269).field578;
                    if (var15 > var12) {
                        var12 = var15;
                    }
                }
            }
        }
        var11.field218 = var12;
        if (this.field304[arg4][arg2][arg5] == null) {
            this.field304[arg4][arg2][arg5] = new Tile(arg4, arg2, arg5);
        }
        this.field304[arg4][arg2][arg5].field391 = var11;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IBILy;IBIIIILy;)V")
    public void method71(int arg0, byte arg1, int arg2, Entity arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, Entity arg10) {
        if (arg3 == null && arg10 == null) {
            return;
        }
        Wall var12 = new Wall();
        var12.field286 = arg7;
        var12.field287 = arg1;
        var12.field280 = arg4 * 128 + 64;
        var12.field281 = arg2 * 128 + 64;
        if (arg5 != 99) {
            field289 = -12;
        }
        var12.field279 = arg0;
        var12.field284 = arg3;
        var12.field285 = arg10;
        var12.field282 = arg9;
        var12.field283 = arg6;
        for (int var13 = arg8; var13 >= 0; var13--) {
            if (this.field304[var13][arg4][arg2] == null) {
                this.field304[var13][arg4][arg2] = new Tile(var13, arg4, arg2);
            }
        }
        this.field304[arg8][arg4][arg2].field388 = var12;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIIIBIIILy;I)V")
    public void method72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, Entity arg10, int arg11) {
        if (arg10 == null) {
            return;
        }
        Decor var13 = new Decor();
        var13.field178 = arg7;
        var13.field179 = arg6;
        var13.field173 = arg5 * 128 + arg9 + 64;
        int var14 = 30 / arg0;
        var13.field174 = arg1 * 128 + arg2 + 64;
        var13.field172 = arg11;
        var13.field177 = arg10;
        var13.field175 = arg3;
        var13.field176 = arg8;
        for (int var15 = arg4; var15 >= 0; var15--) {
            if (this.field304[var15][arg5][arg1] == null) {
                this.field304[var15][arg5][arg1] = new Tile(var15, arg5, arg1);
            }
        }
        this.field304[arg4][arg5][arg1].field389 = var13;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IILy;IIIIIBII)Z")
    public boolean method73(int arg0, int arg1, Entity arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10) {
        int var12 = 41 / arg3;
        if (arg2 == null) {
            return true;
        } else {
            int var13 = arg1 * 128 + arg5 * 64;
            int var14 = arg6 * 128 + arg9 * 64;
            return this.method76(arg10, arg1, arg6, arg5, arg9, var13, var14, arg4, arg2, arg7, false, arg0, arg8);
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIIIZIILy;)Z")
    public boolean method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, Entity arg9) {
        if (arg9 == null) {
            return true;
        }
        int var11 = arg3 - arg0;
        int var12 = arg1 - arg0;
        int var13 = arg0 + arg3;
        int var14 = arg0 + arg1;
        if (arg6) {
            if (arg2 > 640 && arg2 < 1408) {
                var14 += 128;
            }
            if (arg2 > 1152 && arg2 < 1920) {
                var13 += 128;
            }
            if (arg2 > 1664 || arg2 < 384) {
                var12 -= 128;
            }
            if (arg2 > 128 && arg2 < 896) {
                var11 -= 128;
            }
        }
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        int var18 = var14 / 128;
        if (arg8 != 9) {
            this.field298 = !this.field298;
        }
        return this.method76(arg5, var15, var16, var17 + 1 - var15, var18 - var16 + 1, arg3, arg1, arg7, arg9, arg2, true, arg4, (byte) 0);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIIIBLy;IIIII)Z")
    public boolean method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, Entity arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        if (arg6 != 5) {
            throw new NullPointerException();
        }
        return arg7 == null ? true : this.method76(arg8, arg1, arg3, arg5 + 1 - arg1, arg2 - arg3 + 1, arg0, arg11, arg9, arg7, arg4, true, arg10, (byte) 0);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIIIIILy;IZIB)Z")
    private boolean method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, boolean arg10, int arg11, byte arg12) {
        for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
            for (int var21 = arg2; var21 < arg2 + arg4; var21++) {
                if (var14 < 0 || var21 < 0 || var14 >= this.field301 || var21 >= this.field302) {
                    return false;
                }
                Tile var22 = this.field304[arg0][var14][var21];
                if (var22 != null && var22.field392 >= 5) {
                    return false;
                }
            }
        }
        Location var15 = new Location();
        var15.field277 = arg11;
        var15.field278 = arg12;
        var15.field265 = arg0;
        var15.field267 = arg5;
        var15.field268 = arg6;
        var15.field266 = arg7;
        var15.field269 = arg8;
        var15.field270 = arg9;
        var15.field271 = arg1;
        var15.field273 = arg2;
        var15.field272 = arg1 + arg3 - 1;
        var15.field274 = arg2 + arg4 - 1;
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
                    if (this.field304[var19][var16][var17] == null) {
                        this.field304[var19][var16][var17] = new Tile(var19, var16, var17);
                    }
                }
                Tile var20 = this.field304[arg0][var16][var17];
                var20.field393[var20.field392] = var15;
                var20.field394[var20.field392] = var18;
                var20.field395 |= var18;
                var20.field392++;
            }
        }
        if (arg10) {
            this.field307[this.field306++] = var15;
        }
        return true;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(I)V")
    public void method77(int arg0) {
        for (int var2 = 0; var2 < this.field306; var2++) {
            Location var3 = this.field307[var2];
            this.method78(var3, (byte) 2);
            this.field307[var2] = null;
        }
        this.field306 = 0;
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Lq;B)V")
    private void method78(Location arg0, byte arg1) {
        if (arg1 != 2) {
            return;
        }
        boolean var3 = false;
        for (int var4 = arg0.field271; var4 <= arg0.field272; var4++) {
            for (int var5 = arg0.field273; var5 <= arg0.field274; var5++) {
                Tile var6 = this.field304[arg0.field265][var4][var5];
                if (var6 != null) {
                    for (int var7 = 0; var7 < var6.field392; var7++) {
                        if (var6.field393[var7] == arg0) {
                            var6.field392--;
                            for (int var8 = var7; var8 < var6.field392; var8++) {
                                var6.field393[var8] = var6.field393[var8 + 1];
                                var6.field394[var8] = var6.field394[var8 + 1];
                            }
                            var6.field393[var6.field392] = null;
                            break;
                        }
                    }
                    var6.field395 = 0;
                    for (int var9 = 0; var9 < var6.field392; var9++) {
                        var6.field395 |= var6.field394[var9];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIII)V")
    public void method79(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Tile var6 = this.field304[arg1][arg4][arg0];
        if (var6 == null) {
            return;
        }
        Decor var7 = var6.field389;
        if (var7 == null) {
            return;
        }
        int var8 = arg4 * 128 + 64;
        int var9 = arg0 * 128 + 64;
        var7.field173 = (var7.field173 - var8) * arg2 / 16 + var8;
        if (arg3 == -23232) {
            var7.field174 = (var7.field174 - var9) * arg2 / 16 + var9;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(ZIII)V")
    public void method80(boolean arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field304[arg2][arg3][arg1];
        if (var5 != null) {
            var5.field388 = null;
            if (!arg0) {
                this.field288 = !this.field288;
            }
        }
    }

    @OriginalMember(owner = "s", name = "b", descriptor = "(ZIII)V")
    public void method81(boolean arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field304[arg2][arg1][arg3];
        if (arg0) {
            this.field297 = !this.field297;
        }
        if (var5 != null) {
            var5.field389 = null;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IZII)V")
    public void method82(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            return;
        }
        Tile var5 = this.field304[arg2][arg3][arg0];
        if (var5 == null) {
            return;
        }
        for (int var6 = 0; var6 < var5.field392; var6++) {
            Location var7 = var5.field393[var6];
            if ((var7.field277 >> 29 & 0x3) == 2 && var7.field271 == arg3 && var7.field273 == arg0) {
                this.method78(var7, (byte) 2);
                return;
            }
        }
    }

    @OriginalMember(owner = "s", name = "b", descriptor = "(IIII)V")
    public void method83(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field304[arg2][arg0][arg3];
        if (var5 != null) {
            var5.field390 = null;
            int var6 = 88 / arg1;
        }
    }

    @OriginalMember(owner = "s", name = "b", descriptor = "(III)V")
    public void method84(int arg0, int arg1, int arg2) {
        Tile var4 = this.field304[arg0][arg1][arg2];
        if (var4 != null) {
            var4.field391 = null;
        }
    }

    @OriginalMember(owner = "s", name = "c", descriptor = "(IIII)Lr;")
    public Wall method85(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 5 || arg0 > 5) {
            this.field298 = !this.field298;
        }
        Tile var5 = this.field304[arg2][arg3][arg1];
        return var5 == null ? null : var5.field388;
    }

    @OriginalMember(owner = "s", name = "d", descriptor = "(IIII)Li;")
    public Decor method86(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 0) {
            field290 = 186;
        }
        Tile var5 = this.field304[arg1][arg2][arg0];
        return var5 == null ? null : var5.field389;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIBI)Lq;")
    public Location method87(int arg0, int arg1, byte arg2, int arg3) {
        Tile var5 = this.field304[arg3][arg1][arg0];
        if (arg2 != 1) {
            throw new NullPointerException();
        }
        boolean var6 = false;
        if (var5 == null) {
            return null;
        }
        for (int var7 = 0; var7 < var5.field392; var7++) {
            Location var8 = var5.field393[var7];
            if ((var8.field277 >> 29 & 0x3) == 2 && var8.field271 == arg1 && var8.field273 == arg0) {
                return var8;
            }
        }
        return null;
    }

    @OriginalMember(owner = "s", name = "e", descriptor = "(IIII)Lk;")
    public GroundDecor method88(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            throw new NullPointerException();
        }
        Tile var5 = this.field304[arg1][arg2][arg0];
        return var5 == null || var5.field390 == null ? null : var5.field390;
    }

    @OriginalMember(owner = "s", name = "c", descriptor = "(III)I")
    public int method89(int arg0, int arg1, int arg2) {
        Tile var4 = this.field304[arg0][arg1][arg2];
        return var4 == null || var4.field388 == null ? 0 : var4.field388.field286;
    }

    @OriginalMember(owner = "s", name = "f", descriptor = "(IIII)I")
    public int method90(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field304[arg0][arg1][arg2];
        if (arg3 < 3 || arg3 > 3) {
            this.field296 = !this.field296;
        }
        return var5 == null || var5.field389 == null ? 0 : var5.field389.field178;
    }

    @OriginalMember(owner = "s", name = "d", descriptor = "(III)I")
    public int method91(int arg0, int arg1, int arg2) {
        Tile var4 = this.field304[arg0][arg1][arg2];
        if (var4 == null) {
            return 0;
        }
        for (int var5 = 0; var5 < var4.field392; var5++) {
            Location var6 = var4.field393[var5];
            if ((var6.field277 >> 29 & 0x3) == 2 && var6.field271 == arg1 && var6.field273 == arg2) {
                return var6.field277;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "s", name = "e", descriptor = "(III)I")
    public int method92(int arg0, int arg1, int arg2) {
        Tile var4 = this.field304[arg0][arg1][arg2];
        return var4 == null || var4.field390 == null ? 0 : var4.field390.field209;
    }

    @OriginalMember(owner = "s", name = "g", descriptor = "(IIII)I")
    public int method93(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field304[arg0][arg1][arg2];
        if (var5 == null) {
            return -1;
        } else if (var5.field388 != null && var5.field388.field286 == arg3) {
            return var5.field388.field287 & 0xFF;
        } else if (var5.field389 != null && var5.field389.field178 == arg3) {
            return var5.field389.field179 & 0xFF;
        } else if (var5.field390 != null && var5.field390.field209 == arg3) {
            return var5.field390.field210 & 0xFF;
        } else {
            for (int var6 = 0; var6 < var5.field392; var6++) {
                if (var5.field393[var6].field277 == arg3) {
                    return var5.field393[var6].field278 & 0xFF;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(ZIIIII)V")
    public void method94(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg5 * arg5));
        int var8 = arg1 * var7 >> 8;
        if (!arg0) {
            return;
        }
        for (int var9 = 0; var9 < this.field300; var9++) {
            for (int var10 = 0; var10 < this.field301; var10++) {
                for (int var11 = 0; var11 < this.field302; var11++) {
                    Tile var12 = this.field304[var9][var10][var11];
                    if (var12 != null) {
                        Wall var13 = var12.field388;
                        if (var13 != null && var13.field284 != null && var13.field284.field409 != null) {
                            this.method96(1, (Model) var13.field284, 1, this.field293, var11, var9, var10);
                            if (var13.field285 != null && var13.field285.field409 != null) {
                                this.method96(1, (Model) var13.field285, 1, this.field293, var11, var9, var10);
                                this.method97((Model) var13.field284, (Model) var13.field285, 0, 0, 0, false);
                                ((Model) var13.field285).method156(arg3, var8, arg5, arg2, arg4);
                            }
                            ((Model) var13.field284).method156(arg3, var8, arg5, arg2, arg4);
                        }
                        for (int var14 = 0; var14 < var12.field392; var14++) {
                            Location var16 = var12.field393[var14];
                            if (var16 != null && var16.field269 != null && var16.field269.field409 != null) {
                                this.method96(var16.field272 + 1 - var16.field271, (Model) var16.field269, var16.field274 + 1 - var16.field273, this.field293, var11, var9, var10);
                                ((Model) var16.field269).method156(arg3, var8, arg5, arg2, arg4);
                            }
                        }
                        GroundDecor var15 = var12.field390;
                        if (var15 != null && var15.field208.field409 != null) {
                            this.method95(258, (Model) var15.field208, var9, var11, var10);
                            ((Model) var15.field208).method156(arg3, var8, arg5, arg2, arg4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(ILfb;III)V")
    private void method95(int arg0, Model arg1, int arg2, int arg3, int arg4) {
        int var6 = 89 / arg0;
        if (arg4 < this.field301) {
            Tile var7 = this.field304[arg2][arg4 + 1][arg3];
            if (var7 != null && var7.field390 != null && var7.field390.field208.field409 != null) {
                this.method97(arg1, (Model) var7.field390.field208, 128, 0, 0, true);
            }
        }
        if (arg3 < this.field301) {
            Tile var8 = this.field304[arg2][arg4][arg3 + 1];
            if (var8 != null && var8.field390 != null && var8.field390.field208.field409 != null) {
                this.method97(arg1, (Model) var8.field390.field208, 0, 0, 128, true);
            }
        }
        if (arg4 < this.field301 && arg3 < this.field302) {
            Tile var9 = this.field304[arg2][arg4 + 1][arg3 + 1];
            if (var9 != null && var9.field390 != null && var9.field390.field208.field409 != null) {
                this.method97(arg1, (Model) var9.field390.field208, 128, 0, 128, true);
            }
        }
        if (arg4 >= this.field301 || arg3 <= 0) {
            return;
        }
        Tile var10 = this.field304[arg2][arg4 + 1][arg3 - 1];
        if (var10 != null && var10.field390 != null && var10.field390.field208.field409 != null) {
            this.method97(arg1, (Model) var10.field390.field208, 128, 0, -128, true);
            return;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(ILfb;IZIII)V")
    private void method96(int arg0, Model arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        boolean var8 = true;
        if (!arg3) {
            return;
        }
        int var9 = arg6;
        int var10 = arg0 + arg6;
        int var11 = arg4 - 1;
        int var12 = arg2 + arg4;
        for (int var13 = arg5; var13 <= arg5 + 1; var13++) {
            if (this.field300 != var13) {
                for (int var14 = var9; var14 <= var10; var14++) {
                    if (var14 >= 0 && var14 < this.field301) {
                        for (int var15 = var11; var15 <= var12; var15++) {
                            if (var15 >= 0 && var15 < this.field302 && (!var8 || var14 >= var10 || var15 >= var12 || var15 < arg4 && arg6 != var14)) {
                                Tile var16 = this.field304[var13][var14][var15];
                                if (var16 != null) {
                                    int var17 = (this.field303[var13][var14 + 1][var15] + this.field303[var13][var14][var15] + this.field303[var13][var14][var15 + 1] + this.field303[var13][var14 + 1][var15 + 1]) / 4 - (this.field303[arg5][arg6 + 1][arg4] + this.field303[arg5][arg6][arg4] + this.field303[arg5][arg6][arg4 + 1] + this.field303[arg5][arg6 + 1][arg4 + 1]) / 4;
                                    Wall var18 = var16.field388;
                                    if (var18 != null && var18.field284 != null && var18.field284.field409 != null) {
                                        this.method97(arg1, (Model) var18.field284, (1 - arg0) * 64 + (var14 - arg6) * 128, var17, (1 - arg2) * 64 + (var15 - arg4) * 128, var8);
                                    }
                                    if (var18 != null && var18.field285 != null && var18.field285.field409 != null) {
                                        this.method97(arg1, (Model) var18.field285, (1 - arg0) * 64 + (var14 - arg6) * 128, var17, (1 - arg2) * 64 + (var15 - arg4) * 128, var8);
                                    }
                                    for (int var19 = 0; var19 < var16.field392; var19++) {
                                        Location var20 = var16.field393[var19];
                                        if (var20 != null && var20.field269 != null && var20.field269.field409 != null) {
                                            int var21 = var20.field272 + 1 - var20.field271;
                                            int var22 = var20.field274 + 1 - var20.field273;
                                            this.method97(arg1, (Model) var20.field269, (var20.field271 - arg6) * 128 + (var21 - arg0) * 64, var17, (var20.field273 - arg4) * 128 + (var22 - arg2) * 64, var8);
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

    @OriginalMember(owner = "s", name = "a", descriptor = "(Lfb;Lfb;IIIZ)V")
    private void method97(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field351++;
        int var7 = 0;
        int[] var8 = arg1.field551;
        int var9 = arg1.field550;
        for (int var10 = 0; var10 < arg0.field550; var10++) {
            VertexNormal var13 = arg0.field409[var10];
            VertexNormal var14 = arg0.field584[var10];
            if (var14.field257 != 0) {
                int var15 = arg0.field552[var10] - arg3;
                if (var15 <= arg1.field575) {
                    int var16 = arg0.field551[var10] - arg2;
                    if (var16 >= arg1.field570 && var16 <= arg1.field571) {
                        int var17 = arg0.field553[var10] - arg4;
                        if (var17 >= arg1.field573 && var17 <= arg1.field572) {
                            for (int var18 = 0; var18 < var9; var18++) {
                                VertexNormal var19 = arg1.field409[var18];
                                VertexNormal var20 = arg1.field584[var18];
                                if (var8[var18] == var16 && arg1.field553[var18] == var17 && arg1.field552[var18] == var15 && var20.field257 != 0) {
                                    var13.field254 += var20.field254;
                                    var13.field255 += var20.field255;
                                    var13.field256 += var20.field256;
                                    var13.field257 += var20.field257;
                                    var19.field254 += var14.field254;
                                    var19.field255 += var14.field255;
                                    var19.field256 += var14.field256;
                                    var19.field257 += var14.field257;
                                    var7++;
                                    this.field349[var10] = this.field351;
                                    this.field350[var18] = this.field351;
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
        for (int var11 = 0; var11 < arg0.field554; var11++) {
            if (this.field349[arg0.field555[var11]] == this.field351 && this.field349[arg0.field556[var11]] == this.field351 && this.field349[arg0.field557[var11]] == this.field351) {
                arg0.field561[var11] = -1;
            }
        }
        for (int var12 = 0; var12 < arg1.field554; var12++) {
            if (this.field350[arg1.field555[var12]] == this.field351 && this.field350[arg1.field556[var12]] == this.field351 && this.field350[arg1.field557[var12]] == this.field351) {
                arg1.field561[var12] = -1;
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "([IIIIII)V")
    public void method98(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Tile var7 = this.field304[arg3][arg4][arg5];
        if (var7 == null) {
            return;
        }
        TileUnderlay var8 = var7.field386;
        if (var8 != null) {
            int var9 = var8.field264;
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
        TileOverlay var11 = var7.field387;
        if (var11 == null) {
            return;
        }
        int var12 = var11.field191;
        int var13 = var11.field192;
        int var14 = var11.field193;
        int var15 = var11.field194;
        int[] var16 = this.field352[var12];
        int[] var17 = this.field353[var13];
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

    @OriginalMember(owner = "s", name = "a", descriptor = "(II[IBII)V")
    public static void method99(int arg0, int arg1, int[] arg2, byte arg3, int arg4, int arg5) {
        field358 = 0;
        field359 = 0;
        if (arg3 != 6) {
            field290 = 79;
        }
        field360 = arg1;
        field361 = arg4;
        field356 = arg1 / 2;
        field357 = arg4 / 2;
        boolean[][][][] var6 = new boolean[9][32][53][53];
        for (int var7 = 128; var7 <= 384; var7 += 32) {
            for (int var15 = 0; var15 < 2048; var15 += 64) {
                field321 = Model.field613[var7];
                field322 = Model.field614[var7];
                field323 = Model.field613[var15];
                field324 = Model.field614[var15];
                int var16 = (var7 - 128) / 32;
                int var17 = var15 / 64;
                for (int var18 = -26; var18 <= 26; var18++) {
                    for (int var19 = -26; var19 <= 26; var19++) {
                        int var20 = var18 * 128;
                        int var21 = var19 * 128;
                        boolean var22 = false;
                        for (int var23 = -arg5; var23 <= arg0; var23 += 128) {
                            if (method100(var21, 46720, var20, arg2[var16] + var23)) {
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
                        field354[var8][var9][var10 + 25][var11 + 25] = var12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "s", name = "h", descriptor = "(IIII)Z")
    public static boolean method100(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field324 * arg2 + field323 * arg0 >> 16;
        int var5 = field324 * arg0 - field323 * arg2 >> 16;
        int var6 = field322 * var5 + field321 * arg3 >> 16;
        int var7 = field322 * arg3 - field321 * var5 >> 16;
        if (arg1 != 46720) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        if (var6 >= 50 && var6 <= 3500) {
            int var9 = (var4 << 9) / var6 + field356;
            int var10 = (var7 << 9) / var6 + field357;
            return var9 >= field358 && var9 <= field360 && var10 >= field359 && var10 <= field361;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "s", name = "f", descriptor = "(III)V")
    public void method101(int arg0, int arg1, int arg2) {
        field330 = true;
        if (arg2 != 3) {
            this.field296 = !this.field296;
        }
        field331 = arg0;
        field332 = arg1;
        field333 = -1;
        field334 = -1;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIIII)V")
    public void method102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= this.field301 * 128) {
            arg2 = this.field301 * 128 - 1;
        }
        if (arg5 < 0) {
            arg5 = 0;
        } else if (arg5 >= this.field302 * 128) {
            arg5 = this.field302 * 128 - 1;
        }
        field311++;
        field321 = Model.field613[arg1];
        field322 = Model.field614[arg1];
        field323 = Model.field613[arg4];
        field324 = Model.field614[arg4];
        field355 = field354[(arg1 - 128) / 32][arg4 / 64];
        field318 = arg2;
        field319 = arg3;
        field320 = arg5;
        if (this.field294 != arg0) {
            field289 = -321;
        }
        field316 = arg2 / 128;
        field317 = arg5 / 128;
        field310 = arg6;
        field312 = field316 - 25;
        if (field312 < 0) {
            field312 = 0;
        }
        field314 = field317 - 25;
        if (field314 < 0) {
            field314 = 0;
        }
        field313 = field316 + 25;
        if (field313 > this.field301) {
            field313 = this.field301;
        }
        field315 = field317 + 25;
        if (field315 > this.field302) {
            field315 = this.field302;
        }
        this.method108(-35812);
        field309 = 0;
        for (int var8 = this.field305; var8 < this.field300; var8++) {
            Tile[][] var33 = this.field304[var8];
            for (int var34 = field312; var34 < field313; var34++) {
                for (int var35 = field314; var35 < field315; var35++) {
                    Tile var36 = var33[var34][var35];
                    if (var36 != null) {
                        if (var36.field396 <= arg6 && (field355[var34 + 25 - field316][var35 + 25 - field317] || this.field303[var8][var34][var35] - arg3 >= 2000)) {
                            var36.field397 = true;
                            var36.field398 = true;
                            if (var36.field392 > 0) {
                                var36.field399 = true;
                            } else {
                                var36.field399 = false;
                            }
                            field309++;
                        } else {
                            var36.field397 = false;
                            var36.field398 = false;
                            var36.field400 = 0;
                        }
                    }
                }
            }
        }
        for (int var9 = this.field305; var9 < this.field300; var9++) {
            Tile[][] var22 = this.field304[var9];
            for (int var23 = -25; var23 <= 0; var23++) {
                int var24 = field316 + var23;
                int var25 = field316 - var23;
                if (var24 >= field312 || var25 < field313) {
                    for (int var26 = -25; var26 <= 0; var26++) {
                        int var27 = field317 + var26;
                        int var28 = field317 - var26;
                        if (var24 >= field312) {
                            if (var27 >= field314) {
                                Tile var29 = var22[var24][var27];
                                if (var29 != null && var29.field397) {
                                    this.method103(var29, true);
                                }
                            }
                            if (var28 < field315) {
                                Tile var30 = var22[var24][var28];
                                if (var30 != null && var30.field397) {
                                    this.method103(var30, true);
                                }
                            }
                        }
                        if (var25 < field313) {
                            if (var27 >= field314) {
                                Tile var31 = var22[var25][var27];
                                if (var31 != null && var31.field397) {
                                    this.method103(var31, true);
                                }
                            }
                            if (var28 < field315) {
                                Tile var32 = var22[var25][var28];
                                if (var32 != null && var32.field397) {
                                    this.method103(var32, true);
                                }
                            }
                        }
                        if (field309 == 0) {
                            field330 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var10 = this.field305; var10 < this.field300; var10++) {
            Tile[][] var11 = this.field304[var10];
            for (int var12 = -25; var12 <= 0; var12++) {
                int var13 = field316 + var12;
                int var14 = field316 - var12;
                if (var13 >= field312 || var14 < field313) {
                    for (int var15 = -25; var15 <= 0; var15++) {
                        int var16 = field317 + var15;
                        int var17 = field317 - var15;
                        if (var13 >= field312) {
                            if (var16 >= field314) {
                                Tile var18 = var11[var13][var16];
                                if (var18 != null && var18.field397) {
                                    this.method103(var18, false);
                                }
                            }
                            if (var17 < field315) {
                                Tile var19 = var11[var13][var17];
                                if (var19 != null && var19.field397) {
                                    this.method103(var19, false);
                                }
                            }
                        }
                        if (var14 < field313) {
                            if (var16 >= field314) {
                                Tile var20 = var11[var14][var16];
                                if (var20 != null && var20.field397) {
                                    this.method103(var20, false);
                                }
                            }
                            if (var17 < field315) {
                                Tile var21 = var11[var14][var17];
                                if (var21 != null && var21.field397) {
                                    this.method103(var21, false);
                                }
                            }
                        }
                        if (field309 == 0) {
                            field330 = false;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Lw;Z)V")
    public void method103(Tile arg0, boolean arg1) {
        field340.method254(arg0);
        while (true) {
            Tile var3;
            int var4;
            int var5;
            int var6;
            int var7;
            Tile[][] var8;
            Tile var66;
            do {
                Tile var65;
                do {
                    Tile var64;
                    do {
                        Tile var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var3 = (Tile) field340.method256();
                                                if (var3 == null) {
                                                    return;
                                                }
                                            } while (!var3.field398);
                                            var4 = var3.field383;
                                            var5 = var3.field384;
                                            var6 = var3.field382;
                                            var7 = var3.field385;
                                            var8 = this.field304[var6];
                                            if (!var3.field397) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var6 > 0) {
                                                    Tile var9 = this.field304[var6 - 1][var4][var5];
                                                    if (var9 != null && var9.field398) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= field316 && var4 > field312) {
                                                    Tile var10 = var8[var4 - 1][var5];
                                                    if (var10 != null && var10.field398 && (var10.field397 || (var3.field395 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= field316 && var4 < field313 - 1) {
                                                    Tile var11 = var8[var4 + 1][var5];
                                                    if (var11 != null && var11.field398 && (var11.field397 || (var3.field395 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 <= field317 && var5 > field314) {
                                                    Tile var12 = var8[var4][var5 - 1];
                                                    if (var12 != null && var12.field398 && (var12.field397 || (var3.field395 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 >= field317 && var5 < field315 - 1) {
                                                    Tile var13 = var8[var4][var5 + 1];
                                                    if (var13 != null && var13.field398 && (var13.field397 || (var3.field395 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var3.field397 = false;
                                            if (var3.field404 != null) {
                                                Tile var14 = var3.field404;
                                                if (var14.field386 == null) {
                                                    if (var14.field387 != null && !this.method109(0, var4, var5)) {
                                                        this.method105(var14.field387, field324, (byte) 6, var4, field322, field321, field323, var5);
                                                    }
                                                } else if (!this.method109(0, var4, var5)) {
                                                    this.method104(var14.field386, 0, field321, field322, field323, field324, var4, var5);
                                                }
                                                Wall var15 = var14.field388;
                                                if (var15 != null) {
                                                    var15.field284.method121(0, field321, field322, field323, field324, var15.field280 - field318, var15.field279 - field319, var15.field281 - field320, var15.field286);
                                                }
                                                for (int var16 = 0; var16 < var14.field392; var16++) {
                                                    Location var17 = var14.field393[var16];
                                                    if (var17 != null) {
                                                        var17.field269.method121(var17.field270, field321, field322, field323, field324, var17.field267 - field318, var17.field266 - field319, var17.field268 - field320, var17.field277);
                                                    }
                                                }
                                            }
                                            boolean var18 = false;
                                            if (var3.field386 == null) {
                                                if (var3.field387 != null && !this.method109(var7, var4, var5)) {
                                                    var18 = true;
                                                    this.method105(var3.field387, field324, (byte) 6, var4, field322, field321, field323, var5);
                                                }
                                            } else if (!this.method109(var7, var4, var5)) {
                                                var18 = true;
                                                this.method104(var3.field386, var7, field321, field322, field323, field324, var4, var5);
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            Wall var21 = var3.field388;
                                            Decor var22 = var3.field389;
                                            if (var21 != null || var22 != null) {
                                                if (field316 == var4) {
                                                    var19++;
                                                } else if (field316 < var4) {
                                                    var19 += 2;
                                                }
                                                if (field317 == var5) {
                                                    var19 += 3;
                                                } else if (field317 > var5) {
                                                    var19 += 6;
                                                }
                                                var20 = field341[var19];
                                                var3.field403 = field343[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field282 & field342[var19]) == 0) {
                                                    var3.field400 = 0;
                                                } else if (var21.field282 == 16) {
                                                    var3.field400 = 3;
                                                    var3.field401 = field344[var19];
                                                    var3.field402 = 3 - var3.field401;
                                                } else if (var21.field282 == 32) {
                                                    var3.field400 = 6;
                                                    var3.field401 = field345[var19];
                                                    var3.field402 = 6 - var3.field401;
                                                } else if (var21.field282 == 64) {
                                                    var3.field400 = 12;
                                                    var3.field401 = field346[var19];
                                                    var3.field402 = 12 - var3.field401;
                                                } else {
                                                    var3.field400 = 9;
                                                    var3.field401 = field347[var19];
                                                    var3.field402 = 9 - var3.field401;
                                                }
                                                if ((var21.field282 & var20) != 0 && !this.method110(var7, var4, var5, var21.field282)) {
                                                    var21.field284.method121(0, field321, field322, field323, field324, var21.field280 - field318, var21.field279 - field319, var21.field281 - field320, var21.field286);
                                                }
                                                if ((var21.field283 & var20) != 0 && !this.method110(var7, var4, var5, var21.field283)) {
                                                    var21.field285.method121(0, field321, field322, field323, field324, var21.field280 - field318, var21.field279 - field319, var21.field281 - field320, var21.field286);
                                                }
                                            }
                                            if (var22 != null && !this.method111(var7, var4, var5, var22.field177.field410)) {
                                                if ((var22.field175 & var20) != 0) {
                                                    var22.field177.method121(var22.field176, field321, field322, field323, field324, var22.field173 - field318, var22.field172 - field319, var22.field174 - field320, var22.field178);
                                                } else if ((var22.field175 & 0x300) != 0) {
                                                    int var23 = var22.field173 - field318;
                                                    int var24 = var22.field172 - field319;
                                                    int var25 = var22.field174 - field320;
                                                    int var26 = var22.field176;
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
                                                    if ((var22.field175 & 0x100) != 0 && var28 < var27) {
                                                        int var29 = field326[var26] + var23;
                                                        int var30 = field327[var26] + var25;
                                                        var22.field177.method121(var26 * 512 + 256, field321, field322, field323, field324, var29, var24, var30, var22.field178);
                                                    }
                                                    if ((var22.field175 & 0x200) != 0 && var28 > var27) {
                                                        int var31 = field328[var26] + var23;
                                                        int var32 = field329[var26] + var25;
                                                        var22.field177.method121(var26 * 512 + 1280 & 0x7FF, field321, field322, field323, field324, var31, var24, var32, var22.field178);
                                                    }
                                                }
                                            }
                                            if (var18) {
                                                GroundDecor var33 = var3.field390;
                                                if (var33 != null) {
                                                    var33.field208.method121(0, field321, field322, field323, field324, var33.field206 - field318, var33.field205 - field319, var33.field207 - field320, var33.field209);
                                                }
                                                GroundObject var34 = var3.field391;
                                                if (var34 != null && var34.field218 == 0) {
                                                    if (var34.field215 != null) {
                                                        var34.field215.method121(0, field321, field322, field323, field324, var34.field212 - field318, var34.field211 - field319, var34.field213 - field320, var34.field217);
                                                    }
                                                    if (var34.field216 != null) {
                                                        var34.field216.method121(0, field321, field322, field323, field324, var34.field212 - field318, var34.field211 - field319, var34.field213 - field320, var34.field217);
                                                    }
                                                    if (var34.field214 != null) {
                                                        var34.field214.method121(0, field321, field322, field323, field324, var34.field212 - field318, var34.field211 - field319, var34.field213 - field320, var34.field217);
                                                    }
                                                }
                                            }
                                            int var35 = var3.field395;
                                            if (var35 != 0) {
                                                if (var4 < field316 && (var35 & 0x4) != 0) {
                                                    Tile var36 = var8[var4 + 1][var5];
                                                    if (var36 != null && var36.field398) {
                                                        field340.method254(var36);
                                                    }
                                                }
                                                if (var5 < field317 && (var35 & 0x2) != 0) {
                                                    Tile var37 = var8[var4][var5 + 1];
                                                    if (var37 != null && var37.field398) {
                                                        field340.method254(var37);
                                                    }
                                                }
                                                if (var4 > field316 && (var35 & 0x1) != 0) {
                                                    Tile var38 = var8[var4 - 1][var5];
                                                    if (var38 != null && var38.field398) {
                                                        field340.method254(var38);
                                                    }
                                                }
                                                if (var5 > field317 && (var35 & 0x8) != 0) {
                                                    Tile var39 = var8[var4][var5 - 1];
                                                    if (var39 != null && var39.field398) {
                                                        field340.method254(var39);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var3.field400 != 0) {
                                            boolean var40 = true;
                                            for (int var41 = 0; var41 < var3.field392; var41++) {
                                                if (field311 != var3.field393[var41].field276 && (var3.field394[var41] & var3.field400) == var3.field401) {
                                                    var40 = false;
                                                    break;
                                                }
                                            }
                                            if (var40) {
                                                Wall var42 = var3.field388;
                                                if (!this.method110(var7, var4, var5, var42.field282)) {
                                                    var42.field284.method121(0, field321, field322, field323, field324, var42.field280 - field318, var42.field279 - field319, var42.field281 - field320, var42.field286);
                                                }
                                                var3.field400 = 0;
                                            }
                                        }
                                        if (!var3.field399) {
                                            break;
                                        }
                                        int var43 = var3.field392;
                                        var3.field399 = false;
                                        int var44 = 0;
                                        label558: for (int var45 = 0; var45 < var43; var45++) {
                                            Location var54 = var3.field393[var45];
                                            if (field311 != var54.field276) {
                                                for (int var55 = var54.field271; var55 <= var54.field272; var55++) {
                                                    for (int var60 = var54.field273; var60 <= var54.field274; var60++) {
                                                        Tile var61 = var8[var55][var60];
                                                        if (var61.field397) {
                                                            var3.field399 = true;
                                                            continue label558;
                                                        }
                                                        if (var61.field400 != 0) {
                                                            int var62 = 0;
                                                            if (var55 > var54.field271) {
                                                                var62++;
                                                            }
                                                            if (var55 < var54.field272) {
                                                                var62 += 4;
                                                            }
                                                            if (var60 > var54.field273) {
                                                                var62 += 8;
                                                            }
                                                            if (var60 < var54.field274) {
                                                                var62 += 2;
                                                            }
                                                            if ((var62 & var61.field400) == var3.field402) {
                                                                var3.field399 = true;
                                                                continue label558;
                                                            }
                                                        }
                                                    }
                                                }
                                                field325[var44++] = var54;
                                                int var56 = field316 - var54.field271;
                                                int var57 = var54.field272 - field316;
                                                if (var57 > var56) {
                                                    var56 = var57;
                                                }
                                                int var58 = field317 - var54.field273;
                                                int var59 = var54.field274 - field317;
                                                if (var59 > var58) {
                                                    var54.field275 = var56 + var59;
                                                } else {
                                                    var54.field275 = var56 + var58;
                                                }
                                            }
                                        }
                                        while (var44 > 0) {
                                            int var46 = -50;
                                            int var47 = -1;
                                            for (int var48 = 0; var48 < var44; var48++) {
                                                Location var53 = field325[var48];
                                                if (var53.field275 > var46 && field311 != var53.field276) {
                                                    var46 = var53.field275;
                                                    var47 = var48;
                                                }
                                            }
                                            if (var47 == -1) {
                                                break;
                                            }
                                            Location var49 = field325[var47];
                                            var49.field276 = field311;
                                            if (!this.method112(var7, var49.field271, var49.field272, var49.field273, var49.field274, var49.field269.field410)) {
                                                var49.field269.method121(var49.field270, field321, field322, field323, field324, var49.field267 - field318, var49.field266 - field319, var49.field268 - field320, var49.field277);
                                            }
                                            for (int var50 = var49.field271; var50 <= var49.field272; var50++) {
                                                for (int var51 = var49.field273; var51 <= var49.field274; var51++) {
                                                    Tile var52 = var8[var50][var51];
                                                    if (var52.field400 != 0) {
                                                        field340.method254(var52);
                                                    } else if ((var4 != var50 || var5 != var51) && var52.field398) {
                                                        field340.method254(var52);
                                                    }
                                                }
                                            }
                                        }
                                        if (!var3.field399) {
                                            break;
                                        }
                                    }
                                } while (!var3.field398);
                            } while (var3.field400 != 0);
                            if (var4 > field316 || var4 <= field312) {
                                break;
                            }
                            var63 = var8[var4 - 1][var5];
                        } while (var63 != null && var63.field398);
                        if (var4 < field316 || var4 >= field313 - 1) {
                            break;
                        }
                        var64 = var8[var4 + 1][var5];
                    } while (var64 != null && var64.field398);
                    if (var5 > field317 || var5 <= field314) {
                        break;
                    }
                    var65 = var8[var4][var5 - 1];
                } while (var65 != null && var65.field398);
                if (var5 < field317 || var5 >= field315 - 1) {
                    break;
                }
                var66 = var8[var4][var5 + 1];
            } while (var66 != null && var66.field398);
            var3.field398 = false;
            field309--;
            GroundObject var67 = var3.field391;
            if (var67 != null && var67.field218 != 0) {
                if (var67.field215 != null) {
                    var67.field215.method121(0, field321, field322, field323, field324, var67.field212 - field318, var67.field211 - field319 - var67.field218, var67.field213 - field320, var67.field217);
                }
                if (var67.field216 != null) {
                    var67.field216.method121(0, field321, field322, field323, field324, var67.field212 - field318, var67.field211 - field319 - var67.field218, var67.field213 - field320, var67.field217);
                }
                if (var67.field214 != null) {
                    var67.field214.method121(0, field321, field322, field323, field324, var67.field212 - field318, var67.field211 - field319 - var67.field218, var67.field213 - field320, var67.field217);
                }
            }
            if (var3.field403 != 0) {
                Decor var68 = var3.field389;
                if (var68 != null && !this.method111(var7, var4, var5, var68.field177.field410)) {
                    if ((var68.field175 & var3.field403) != 0) {
                        var68.field177.method121(var68.field176, field321, field322, field323, field324, var68.field173 - field318, var68.field172 - field319, var68.field174 - field320, var68.field178);
                    } else if ((var68.field175 & 0x300) != 0) {
                        int var69 = var68.field173 - field318;
                        int var70 = var68.field172 - field319;
                        int var71 = var68.field174 - field320;
                        int var72 = var68.field176;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if ((var68.field175 & 0x100) != 0 && var74 >= var73) {
                            int var75 = field326[var72] + var69;
                            int var76 = field327[var72] + var71;
                            var68.field177.method121(var72 * 512 + 256, field321, field322, field323, field324, var75, var70, var76, var68.field178);
                        }
                        if ((var68.field175 & 0x200) != 0 && var74 <= var73) {
                            int var77 = field328[var72] + var69;
                            int var78 = field329[var72] + var71;
                            var68.field177.method121(var72 * 512 + 1280 & 0x7FF, field321, field322, field323, field324, var77, var70, var78, var68.field178);
                        }
                    }
                }
                Wall var79 = var3.field388;
                if (var79 != null) {
                    if ((var79.field283 & var3.field403) != 0 && !this.method110(var7, var4, var5, var79.field283)) {
                        var79.field285.method121(0, field321, field322, field323, field324, var79.field280 - field318, var79.field279 - field319, var79.field281 - field320, var79.field286);
                    }
                    if ((var79.field282 & var3.field403) != 0 && !this.method110(var7, var4, var5, var79.field282)) {
                        var79.field284.method121(0, field321, field322, field323, field324, var79.field280 - field318, var79.field279 - field319, var79.field281 - field320, var79.field286);
                    }
                }
            }
            if (var6 < this.field300 - 1) {
                Tile var80 = this.field304[var6 + 1][var4][var5];
                if (var80 != null && var80.field398) {
                    field340.method254(var80);
                }
            }
            if (var4 < field316) {
                Tile var81 = var8[var4 + 1][var5];
                if (var81 != null && var81.field398) {
                    field340.method254(var81);
                }
            }
            if (var5 < field317) {
                Tile var82 = var8[var4][var5 + 1];
                if (var82 != null && var82.field398) {
                    field340.method254(var82);
                }
            }
            if (var4 > field316) {
                Tile var83 = var8[var4 - 1][var5];
                if (var83 != null && var83.field398) {
                    field340.method254(var83);
                }
            }
            if (var5 > field317) {
                Tile var84 = var8[var4][var5 - 1];
                if (var84 != null && var84.field398) {
                    field340.method254(var84);
                }
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Lp;IIIIIII)V")
    public void method104(TileUnderlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9;
        int var10 = var9 = (arg6 << 7) - field318;
        int var11;
        int var12 = var11 = (arg7 << 7) - field320;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = this.field303[arg1][arg6][arg7] - field319;
        int var18 = this.field303[arg1][arg6 + 1][arg7] - field319;
        int var19 = this.field303[arg1][arg6 + 1][arg7 + 1] - field319;
        int var20 = this.field303[arg1][arg6][arg7 + 1] - field319;
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
        int var45 = (var21 << 9) / var25 + Pix3D.field649;
        int var46 = (var24 << 9) / var25 + Pix3D.field650;
        int var47 = (var27 << 9) / var31 + Pix3D.field649;
        int var48 = (var30 << 9) / var31 + Pix3D.field650;
        int var49 = (var33 << 9) / var37 + Pix3D.field649;
        int var50 = (var36 << 9) / var37 + Pix3D.field650;
        int var51 = (var39 << 9) / var43 + Pix3D.field649;
        int var52 = (var42 << 9) / var43 + Pix3D.field650;
        Pix3D.field648 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            Pix3D.field645 = false;
            if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > Pix2D.field637 || var51 > Pix2D.field637 || var47 > Pix2D.field637) {
                Pix3D.field645 = true;
            }
            if (field330 && this.method107(field331, field332, var50, var52, var48, var49, var51, var47)) {
                field333 = arg6;
                field334 = arg7;
            }
            if (arg0.field262 == -1) {
                if (arg0.field260 != 12345678) {
                    Pix3D.method187(var50, var52, var48, var49, var51, var47, arg0.field260, arg0.field261, arg0.field259);
                }
            } else if (field299) {
                int var53 = field348[arg0.field262];
                Pix3D.method187(var50, var52, var48, var49, var51, var47, this.method106(true, var53, arg0.field260), this.method106(true, var53, arg0.field261), this.method106(true, var53, arg0.field259));
            } else if (arg0.field263) {
                Pix3D.method191(var50, var52, var48, var49, var51, var47, arg0.field260, arg0.field261, arg0.field259, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field262);
            } else {
                Pix3D.method191(var50, var52, var48, var49, var51, var47, arg0.field260, arg0.field261, arg0.field259, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field262);
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        Pix3D.field645 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Pix2D.field637 || var47 > Pix2D.field637 || var51 > Pix2D.field637) {
            Pix3D.field645 = true;
        }
        if (field330 && this.method107(field331, field332, var46, var48, var52, var45, var47, var51)) {
            field333 = arg6;
            field334 = arg7;
        }
        if (arg0.field262 != -1) {
            if (!field299) {
                Pix3D.method191(var46, var48, var52, var45, var47, var51, arg0.field258, arg0.field259, arg0.field261, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field262);
                return;
            }
            int var54 = field348[arg0.field262];
            Pix3D.method187(var46, var48, var52, var45, var47, var51, this.method106(true, var54, arg0.field258), this.method106(true, var54, arg0.field259), this.method106(true, var54, arg0.field261));
        } else if (arg0.field258 != 12345678) {
            Pix3D.method187(var46, var48, var52, var45, var47, var51, arg0.field258, arg0.field259, arg0.field261);
            return;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Lj;IBIIIII)V")
    public void method105(TileOverlay arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 == 6) {
            boolean var9 = false;
        } else {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        int var11 = arg0.field180.length;
        for (int var12 = 0; var12 < var11; var12++) {
            int var25 = arg0.field180[var12] - field318;
            int var26 = arg0.field181[var12] - field319;
            int var27 = arg0.field182[var12] - field320;
            int var28 = arg1 * var25 + arg6 * var27 >> 16;
            int var29 = arg1 * var27 - arg6 * var25 >> 16;
            int var31 = arg4 * var26 - arg5 * var29 >> 16;
            int var32 = arg4 * var29 + arg5 * var26 >> 16;
            if (var32 < 50) {
                return;
            }
            if (arg0.field189 != null) {
                TileOverlay.field197[var12] = var28;
                TileOverlay.field198[var12] = var31;
                TileOverlay.field199[var12] = var32;
            }
            TileOverlay.field195[var12] = (var28 << 9) / var32 + Pix3D.field649;
            TileOverlay.field196[var12] = (var31 << 9) / var32 + Pix3D.field650;
        }
        Pix3D.field648 = 0;
        int var13 = arg0.field186.length;
        for (int var14 = 0; var14 < var13; var14++) {
            int var15 = arg0.field186[var14];
            int var16 = arg0.field187[var14];
            int var17 = arg0.field188[var14];
            int var18 = TileOverlay.field195[var15];
            int var19 = TileOverlay.field195[var16];
            int var20 = TileOverlay.field195[var17];
            int var21 = TileOverlay.field196[var15];
            int var22 = TileOverlay.field196[var16];
            int var23 = TileOverlay.field196[var17];
            if ((var18 - var19) * (var23 - var22) - (var20 - var19) * (var21 - var22) > 0) {
                Pix3D.field645 = false;
                if (var18 < 0 || var19 < 0 || var20 < 0 || var18 > Pix2D.field637 || var19 > Pix2D.field637 || var20 > Pix2D.field637) {
                    Pix3D.field645 = true;
                }
                if (field330 && this.method107(field331, field332, var21, var22, var23, var18, var19, var20)) {
                    field333 = arg3;
                    field334 = arg7;
                }
                if (arg0.field189 == null || arg0.field189[var14] == -1) {
                    if (arg0.field183[var14] != 12345678) {
                        Pix3D.method187(var21, var22, var23, var18, var19, var20, arg0.field183[var14], arg0.field184[var14], arg0.field185[var14]);
                    }
                } else if (field299) {
                    int var24 = field348[arg0.field189[var14]];
                    Pix3D.method187(var21, var22, var23, var18, var19, var20, this.method106(true, var24, arg0.field183[var14]), this.method106(true, var24, arg0.field184[var14]), this.method106(true, var24, arg0.field185[var14]));
                } else if (arg0.field190) {
                    Pix3D.method191(var21, var22, var23, var18, var19, var20, arg0.field183[var14], arg0.field184[var14], arg0.field185[var14], TileOverlay.field197[0], TileOverlay.field197[1], TileOverlay.field197[3], TileOverlay.field198[0], TileOverlay.field198[1], TileOverlay.field198[3], TileOverlay.field199[0], TileOverlay.field199[1], TileOverlay.field199[3], arg0.field189[var14]);
                } else {
                    Pix3D.method191(var21, var22, var23, var18, var19, var20, arg0.field183[var14], arg0.field184[var14], arg0.field185[var14], TileOverlay.field197[var15], TileOverlay.field197[var16], TileOverlay.field197[var17], TileOverlay.field198[var15], TileOverlay.field198[var16], TileOverlay.field198[var17], TileOverlay.field199[var15], TileOverlay.field199[var16], TileOverlay.field199[var17], arg0.field189[var14]);
                }
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(ZII)I")
    public int method106(boolean arg0, int arg1, int arg2) {
        int var4 = 127 - arg2;
        int var5 = (arg1 & 0x7F) * var4 / 160;
        if (!arg0) {
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

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "s", name = "b", descriptor = "(I)V")
    private void method108(int arg0) {
        int var2 = field336[field310];
        Occlude[] var3 = field337[field310];
        field338 = 0;
        if (arg0 != -35812) {
            this.field293 = !this.field293;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            Occlude var5 = var3[var4];
            if (var5.field240 == 1) {
                int var6 = var5.field236 + 25 - field316;
                if (var6 >= 0 && var6 <= 50) {
                    int var7 = var5.field238 + 25 - field317;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = var5.field239 + 25 - field317;
                    if (var8 > 50) {
                        var8 = 50;
                    }
                    boolean var9 = false;
                    while (var7 <= var8) {
                        if (field355[var6][var7++]) {
                            var9 = true;
                            break;
                        }
                    }
                    if (var9) {
                        int var10 = field318 - var5.field241;
                        if (var10 > 32) {
                            var5.field247 = 1;
                        } else {
                            if (var10 >= -32) {
                                continue;
                            }
                            var5.field247 = 2;
                            var10 = -var10;
                        }
                        var5.field250 = (var5.field243 - field320 << 8) / var10;
                        var5.field251 = (var5.field244 - field320 << 8) / var10;
                        var5.field252 = (var5.field245 - field319 << 8) / var10;
                        var5.field253 = (var5.field246 - field319 << 8) / var10;
                        field339[field338++] = var5;
                    }
                }
            } else if (var5.field240 == 2) {
                int var11 = var5.field238 + 25 - field317;
                if (var11 >= 0 && var11 <= 50) {
                    int var12 = var5.field236 + 25 - field316;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = var5.field237 + 25 - field316;
                    if (var13 > 50) {
                        var13 = 50;
                    }
                    boolean var14 = false;
                    while (var12 <= var13) {
                        if (field355[var12++][var11]) {
                            var14 = true;
                            break;
                        }
                    }
                    if (var14) {
                        int var15 = field320 - var5.field243;
                        if (var15 > 32) {
                            var5.field247 = 3;
                        } else {
                            if (var15 >= -32) {
                                continue;
                            }
                            var5.field247 = 4;
                            var15 = -var15;
                        }
                        var5.field248 = (var5.field241 - field318 << 8) / var15;
                        var5.field249 = (var5.field242 - field318 << 8) / var15;
                        var5.field252 = (var5.field245 - field319 << 8) / var15;
                        var5.field253 = (var5.field246 - field319 << 8) / var15;
                        field339[field338++] = var5;
                    }
                }
            } else if (var5.field240 == 4) {
                int var16 = var5.field245 - field319;
                if (var16 > 128) {
                    int var17 = var5.field238 + 25 - field317;
                    if (var17 < 0) {
                        var17 = 0;
                    }
                    int var18 = var5.field239 + 25 - field317;
                    if (var18 > 50) {
                        var18 = 50;
                    }
                    if (var17 <= var18) {
                        int var19 = var5.field236 + 25 - field316;
                        if (var19 < 0) {
                            var19 = 0;
                        }
                        int var20 = var5.field237 + 25 - field316;
                        if (var20 > 50) {
                            var20 = 50;
                        }
                        boolean var21 = false;
                        label154: for (int var22 = var19; var22 <= var20; var22++) {
                            for (int var23 = var17; var23 <= var18; var23++) {
                                if (field355[var22][var23]) {
                                    var21 = true;
                                    break label154;
                                }
                            }
                        }
                        if (var21) {
                            var5.field247 = 5;
                            var5.field248 = (var5.field241 - field318 << 8) / var16;
                            var5.field249 = (var5.field242 - field318 << 8) / var16;
                            var5.field250 = (var5.field243 - field320 << 8) / var16;
                            var5.field251 = (var5.field244 - field320 << 8) / var16;
                            field339[field338++] = var5;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "s", name = "g", descriptor = "(III)Z")
    private boolean method109(int arg0, int arg1, int arg2) {
        int var4 = this.field308[arg0][arg1][arg2];
        if (-field311 == var4) {
            return false;
        } else if (field311 == var4) {
            return true;
        } else {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            if (this.method113(var5 + 1, this.field303[arg0][arg1][arg2], var6 + 1) && this.method113(var5 + 128 - 1, this.field303[arg0][arg1 + 1][arg2], var6 + 1) && this.method113(var5 + 128 - 1, this.field303[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.method113(var5 + 1, this.field303[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
                this.field308[arg0][arg1][arg2] = field311;
                return true;
            } else {
                this.field308[arg0][arg1][arg2] = -field311;
                return false;
            }
        }
    }

    @OriginalMember(owner = "s", name = "i", descriptor = "(IIII)Z")
    private boolean method110(int arg0, int arg1, int arg2, int arg3) {
        if (!this.method109(arg0, arg1, arg2)) {
            return false;
        }
        int var5 = arg1 << 7;
        int var6 = arg2 << 7;
        int var7 = this.field303[arg0][arg1][arg2] - 1;
        int var8 = var7 - 120;
        int var9 = var7 - 230;
        int var10 = var7 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var5 > field318) {
                    if (!this.method113(var5, var7, var6)) {
                        return false;
                    }
                    if (!this.method113(var5, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method113(var5, var8, var6)) {
                        return false;
                    }
                    if (!this.method113(var5, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method113(var5, var9, var6)) {
                    return false;
                }
                if (!this.method113(var5, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var6 < field320) {
                    if (!this.method113(var5, var7, var6 + 128)) {
                        return false;
                    }
                    if (!this.method113(var5 + 128, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method113(var5, var8, var6 + 128)) {
                        return false;
                    }
                    if (!this.method113(var5 + 128, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method113(var5, var9, var6 + 128)) {
                    return false;
                }
                if (!this.method113(var5 + 128, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var5 < field318) {
                    if (!this.method113(var5 + 128, var7, var6)) {
                        return false;
                    }
                    if (!this.method113(var5 + 128, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method113(var5 + 128, var8, var6)) {
                        return false;
                    }
                    if (!this.method113(var5 + 128, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method113(var5 + 128, var9, var6)) {
                    return false;
                }
                if (!this.method113(var5 + 128, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var6 > field320) {
                    if (!this.method113(var5, var7, var6)) {
                        return false;
                    }
                    if (!this.method113(var5 + 128, var7, var6)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method113(var5, var8, var6)) {
                        return false;
                    }
                    if (!this.method113(var5 + 128, var8, var6)) {
                        return false;
                    }
                }
                if (!this.method113(var5, var9, var6)) {
                    return false;
                }
                if (!this.method113(var5 + 128, var9, var6)) {
                    return false;
                }
                return true;
            }
        }
        if (!this.method113(var5 + 64, var10, var6 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return this.method113(var5, var9, var6 + 128);
        } else if (arg3 == 32) {
            return this.method113(var5 + 128, var9, var6 + 128);
        } else if (arg3 == 64) {
            return this.method113(var5 + 128, var9, var6);
        } else if (arg3 == 128) {
            return this.method113(var5, var9, var6);
        } else {
            System.out.println("Warning unsupported wall type");
            return true;
        }
    }

    @OriginalMember(owner = "s", name = "j", descriptor = "(IIII)Z")
    private boolean method111(int arg0, int arg1, int arg2, int arg3) {
        if (this.method109(arg0, arg1, arg2)) {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            return this.method113(var5 + 1, this.field303[arg0][arg1][arg2] - arg3, var6 + 1) && this.method113(var5 + 128 - 1, this.field303[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method113(var5 + 128 - 1, this.field303[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method113(var5 + 1, this.field303[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIII)Z")
    private boolean method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var9 = arg1; var9 <= arg2; var9++) {
                for (int var15 = arg3; var15 <= arg4; var15++) {
                    if (this.field308[arg0][var9][var15] == -field311) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = this.field303[arg0][arg1][arg3] - arg5;
            if (!this.method113(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!this.method113(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!this.method113(var10, var12, var14)) {
                return false;
            } else if (this.method113(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (this.method109(arg0, arg1, arg3)) {
            int var7 = arg1 << 7;
            int var8 = arg3 << 7;
            return this.method113(var7 + 1, this.field303[arg0][arg1][arg3] - arg5, var8 + 1) && this.method113(var7 + 128 - 1, this.field303[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.method113(var7 + 128 - 1, this.field303[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.method113(var7 + 1, this.field303[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "s", name = "h", descriptor = "(III)Z")
    private boolean method113(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < field338; var4++) {
            Occlude var5 = field339[var4];
            if (var5.field247 == 1) {
                int var6 = var5.field241 - arg0;
                if (var6 > 0) {
                    int var7 = (var5.field250 * var6 >> 8) + var5.field243;
                    int var8 = (var5.field251 * var6 >> 8) + var5.field244;
                    int var9 = (var5.field252 * var6 >> 8) + var5.field245;
                    int var10 = (var5.field253 * var6 >> 8) + var5.field246;
                    if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field247 == 2) {
                int var11 = arg0 - var5.field241;
                if (var11 > 0) {
                    int var12 = (var5.field250 * var11 >> 8) + var5.field243;
                    int var13 = (var5.field251 * var11 >> 8) + var5.field244;
                    int var14 = (var5.field252 * var11 >> 8) + var5.field245;
                    int var15 = (var5.field253 * var11 >> 8) + var5.field246;
                    if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
                        return true;
                    }
                }
            } else if (var5.field247 == 3) {
                int var16 = var5.field243 - arg2;
                if (var16 > 0) {
                    int var17 = (var5.field248 * var16 >> 8) + var5.field241;
                    int var18 = (var5.field249 * var16 >> 8) + var5.field242;
                    int var19 = (var5.field252 * var16 >> 8) + var5.field245;
                    int var20 = (var5.field253 * var16 >> 8) + var5.field246;
                    if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
                        return true;
                    }
                }
            } else if (var5.field247 == 4) {
                int var21 = arg2 - var5.field243;
                if (var21 > 0) {
                    int var22 = (var5.field248 * var21 >> 8) + var5.field241;
                    int var23 = (var5.field249 * var21 >> 8) + var5.field242;
                    int var24 = (var5.field252 * var21 >> 8) + var5.field245;
                    int var25 = (var5.field253 * var21 >> 8) + var5.field246;
                    if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
                        return true;
                    }
                }
            } else if (var5.field247 == 5) {
                int var26 = arg1 - var5.field245;
                if (var26 > 0) {
                    int var27 = (var5.field248 * var26 >> 8) + var5.field241;
                    int var28 = (var5.field249 * var26 >> 8) + var5.field242;
                    int var29 = (var5.field250 * var26 >> 8) + var5.field243;
                    int var30 = (var5.field251 * var26 >> 8) + var5.field244;
                    if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
