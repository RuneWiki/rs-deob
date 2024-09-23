import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class World3D {

    @OriginalMember(owner = "s", name = "a", descriptor = "I")
    private int field289 = -902;

    @OriginalMember(owner = "s", name = "b", descriptor = "Z")
    private boolean field290 = true;

    @OriginalMember(owner = "s", name = "c", descriptor = "I")
    private int field291 = -1189;

    @OriginalMember(owner = "s", name = "d", descriptor = "B")
    private byte field292 = 17;

    @OriginalMember(owner = "s", name = "f", descriptor = "I")
    private int field294 = 9;

    @OriginalMember(owner = "s", name = "g", descriptor = "Z")
    private boolean field295 = false;

    @OriginalMember(owner = "s", name = "p", descriptor = "[Lq;")
    public Location[] field304 = new Location[5000];

    @OriginalMember(owner = "s", name = "fb", descriptor = "[I")
    public int[] field346 = new int[10000];

    @OriginalMember(owner = "s", name = "gb", descriptor = "[I")
    public int[] field347 = new int[10000];

    @OriginalMember(owner = "s", name = "ib", descriptor = "[[I")
    public int[][] field349 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "s", name = "jb", descriptor = "[[I")
    public int[][] field350 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "s", name = "i", descriptor = "I")
    public int field297;

    @OriginalMember(owner = "s", name = "j", descriptor = "I")
    public int field298;

    @OriginalMember(owner = "s", name = "k", descriptor = "I")
    public int field299;

    @OriginalMember(owner = "s", name = "m", descriptor = "[[[Lw;")
    public Tile[][][] field301;

    @OriginalMember(owner = "s", name = "q", descriptor = "[[[I")
    public int[][][] field305;

    @OriginalMember(owner = "s", name = "l", descriptor = "[[[I")
    public int[][][] field300;

    @OriginalMember(owner = "s", name = "e", descriptor = "Z")
    private static boolean field293 = true;

    @OriginalMember(owner = "s", name = "h", descriptor = "Z")
    public static boolean field296 = true;

    @OriginalMember(owner = "s", name = "H", descriptor = "[Lq;")
    public static Location[] field322 = new Location[100];

    @OriginalMember(owner = "s", name = "I", descriptor = "[I")
    public static final int[] field323 = new int[] { 53, -53, -53, 53 };

    @OriginalMember(owner = "s", name = "J", descriptor = "[I")
    public static final int[] field324 = new int[] { -53, -53, 53, 53 };

    @OriginalMember(owner = "s", name = "K", descriptor = "[I")
    public static final int[] field325 = new int[] { -45, 45, 45, -45 };

    @OriginalMember(owner = "s", name = "L", descriptor = "[I")
    public static final int[] field326 = new int[] { 45, 45, -45, -45 };

    @OriginalMember(owner = "s", name = "P", descriptor = "I")
    public static int field330 = -1;

    @OriginalMember(owner = "s", name = "Q", descriptor = "I")
    public static int field331 = -1;

    @OriginalMember(owner = "s", name = "R", descriptor = "I")
    public static int field332 = 4;

    @OriginalMember(owner = "s", name = "S", descriptor = "[I")
    public static int[] field333 = new int[field332];

    @OriginalMember(owner = "s", name = "T", descriptor = "[[Ln;")
    public static Occlude[][] field334 = new Occlude[field332][500];

    @OriginalMember(owner = "s", name = "V", descriptor = "[Ln;")
    public static Occlude[] field336 = new Occlude[500];

    @OriginalMember(owner = "s", name = "W", descriptor = "Lpb;")
    public static LinkList field337 = new LinkList(false);

    @OriginalMember(owner = "s", name = "X", descriptor = "[I")
    public static final int[] field338 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "s", name = "Y", descriptor = "[I")
    public static final int[] field339 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "s", name = "Z", descriptor = "[I")
    public static final int[] field340 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "s", name = "ab", descriptor = "[I")
    public static final int[] field341 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "s", name = "bb", descriptor = "[I")
    public static final int[] field342 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "s", name = "cb", descriptor = "[I")
    public static final int[] field343 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "s", name = "db", descriptor = "[I")
    public static final int[] field344 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "s", name = "eb", descriptor = "[I")
    public static final int[] field345 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

    @OriginalMember(owner = "s", name = "kb", descriptor = "[[[[Z")
    public static boolean[][][][] field351 = new boolean[8][32][51][51];

    @OriginalMember(owner = "s", name = "n", descriptor = "I")
    public int field302;

    @OriginalMember(owner = "s", name = "o", descriptor = "I")
    public int field303;

    @OriginalMember(owner = "s", name = "r", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "s", name = "s", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "s", name = "t", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "s", name = "u", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "s", name = "v", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "s", name = "w", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "s", name = "x", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "s", name = "y", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "s", name = "z", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "s", name = "A", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "s", name = "B", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "s", name = "C", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "s", name = "D", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "s", name = "E", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "s", name = "F", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "s", name = "G", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "s", name = "N", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "s", name = "O", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "s", name = "U", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "s", name = "hb", descriptor = "I")
    public int field348;

    @OriginalMember(owner = "s", name = "mb", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "s", name = "nb", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "s", name = "ob", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "s", name = "pb", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "s", name = "qb", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "s", name = "rb", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "s", name = "M", descriptor = "Z")
    public static boolean field327;

    @OriginalMember(owner = "s", name = "lb", descriptor = "[[Z")
    public static boolean[][] field352;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(II[[[IBI)V")
    public World3D(int arg0, int arg1, int[][][] arg2, byte arg3, int arg4) {
        this.field297 = arg4;
        this.field298 = arg0;
        this.field299 = arg1;
        if (arg3 != 56) {
            throw new NullPointerException();
        }
        this.field301 = new Tile[arg4][arg0][arg1];
        this.field305 = new int[arg4][arg0 + 1][arg1 + 1];
        this.field300 = arg2;
        this.method64(29142);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(I)V")
    public static void method63(int arg0) {
        int var1 = 12 / arg0;
        field322 = null;
        field333 = null;
        field334 = null;
        field337 = null;
        field351 = null;
        field352 = null;
    }

    @OriginalMember(owner = "s", name = "b", descriptor = "(I)V")
    public void method64(int arg0) {
        for (int var2 = 0; var2 < this.field297; var2++) {
            for (int var8 = 0; var8 < this.field298; var8++) {
                for (int var9 = 0; var9 < this.field299; var9++) {
                    this.field301[var2][var8][var9] = null;
                }
            }
        }
        for (int var3 = 0; var3 < field332; var3++) {
            for (int var7 = 0; var7 < field333[var3]; var7++) {
                field334[var3][var7] = null;
            }
            field333[var3] = 0;
        }
        for (int var4 = 0; var4 < this.field303; var4++) {
            this.field304[var4] = null;
        }
        this.field303 = 0;
        if (arg0 != 29142) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < field322.length; var6++) {
            field322[var6] = null;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(BI)V")
    public void method65(byte arg0, int arg1) {
        if (arg0 != -9) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field302 = arg1;
        for (int var4 = 0; var4 < this.field298; var4++) {
            for (int var5 = 0; var5 < this.field299; var5++) {
                this.field301[arg1][var4][var5] = new Tile(arg1, var4, var5);
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(III)V")
    public void method66(int arg0, int arg1, int arg2) {
        Tile var4 = this.field301[0][arg2][arg1];
        if (arg0 != 6) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < 3; var6++) {
            Tile var7 = this.field301[var6][arg2][arg1] = this.field301[var6 + 1][arg2][arg1];
            if (var7 != null) {
                var7.field378--;
                for (int var8 = 0; var8 < var7.field388; var8++) {
                    Location var9 = var7.field389[var8];
                    if ((var9.field278 >> 29 & 0x3) == 2 && var9.field272 == arg2 && var9.field274 == arg1) {
                        var9.field266--;
                    }
                }
            }
        }
        if (this.field301[0][arg2][arg1] == null) {
            this.field301[0][arg2][arg1] = new Tile(0, arg2, arg1);
        }
        this.field301[0][arg2][arg1].field400 = var4;
        this.field301[3][arg2][arg1] = null;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIIIIII)V")
    public static void method67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Occlude var9 = new Occlude();
        var9.field237 = arg0 / 128;
        var9.field238 = arg4 / 128;
        var9.field239 = arg7 / 128;
        var9.field240 = arg8 / 128;
        var9.field241 = arg2;
        var9.field242 = arg0;
        if (arg1 >= 0) {
            return;
        }
        var9.field243 = arg4;
        var9.field244 = arg7;
        var9.field245 = arg8;
        var9.field246 = arg3;
        var9.field247 = arg6;
        field334[arg5][field333[arg5]++] = var9;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIII)V")
    public void method68(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field301[arg0][arg1][arg2];
        if (var5 != null) {
            this.field301[arg0][arg1][arg2].field392 = arg3;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public void method69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            TileUnderlay var21 = new TileUnderlay(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var22 = arg0; var22 >= 0; var22--) {
                if (this.field301[var22][arg1][arg2] == null) {
                    this.field301[var22][arg1][arg2] = new Tile(var22, arg1, arg2);
                }
            }
            this.field301[arg0][arg1][arg2].field382 = var21;
        } else if (arg3 == 1) {
            TileUnderlay var23 = new TileUnderlay(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var24 = arg0; var24 >= 0; var24--) {
                if (this.field301[var24][arg1][arg2] == null) {
                    this.field301[var24][arg1][arg2] = new Tile(var24, arg1, arg2);
                }
            }
            this.field301[arg0][arg1][arg2].field382 = var23;
        } else {
            TileOverlay var25 = new TileOverlay(arg13, arg17, arg9, arg6, arg1, arg3, arg2, arg15, arg5, arg10, arg11, arg18, arg4, arg14, arg12, arg16, arg7, arg8, arg19, 407);
            for (int var26 = arg0; var26 >= 0; var26--) {
                if (this.field301[var26][arg1][arg2] == null) {
                    this.field301[var26][arg1][arg2] = new Tile(var26, arg1, arg2);
                }
            }
            this.field301[arg0][arg1][arg2].field383 = var25;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Ly;IIIIIIB)V")
    public void method70(Entity arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg0 == null) {
            return;
        }
        GroundDecor var9 = new GroundDecor();
        var9.field209 = arg0;
        var9.field207 = arg1 * 128 + 64;
        var9.field208 = arg5 * 128 + 64;
        var9.field206 = arg6;
        var9.field210 = arg2;
        var9.field211 = arg7;
        if (this.field301[arg4][arg1][arg5] == null) {
            this.field301[arg4][arg1][arg5] = new Tile(arg4, arg1, arg5);
        }
        this.field301[arg4][arg1][arg5].field386 = var9;
        if (arg3 >= 0) {
            this.field295 = !this.field295;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Ly;IILy;IZIILy;)V")
    public void method71(Entity arg0, int arg1, int arg2, Entity arg3, int arg4, boolean arg5, int arg6, int arg7, Entity arg8) {
        GroundObject var10 = new GroundObject();
        var10.field215 = arg0;
        var10.field213 = arg6 * 128 + 64;
        if (!arg5) {
            this.field294 = 62;
        }
        var10.field214 = arg7 * 128 + 64;
        var10.field212 = arg2;
        var10.field218 = arg1;
        var10.field216 = arg8;
        var10.field217 = arg3;
        int var11 = 0;
        Tile var12 = this.field301[arg4][arg6][arg7];
        if (var12 != null) {
            for (int var13 = 0; var13 < var12.field388; var13++) {
                if (var12.field389[var13].field270 instanceof Model) {
                    int var14 = ((Model) var12.field389[var13].field270).field567;
                    if (var14 > var11) {
                        var11 = var14;
                    }
                }
            }
        }
        var10.field219 = var11;
        if (this.field301[arg4][arg6][arg7] == null) {
            this.field301[arg4][arg6][arg7] = new Tile(arg4, arg6, arg7);
        }
        this.field301[arg4][arg6][arg7].field387 = var10;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Ly;Ly;IIIBBIIII)V")
    public void method72(Entity arg0, Entity arg1, int arg2, int arg3, int arg4, byte arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null && arg1 == null) {
            return;
        }
        Wall var12 = new Wall();
        var12.field287 = arg2;
        var12.field288 = arg6;
        var12.field281 = arg7 * 128 + 64;
        var12.field282 = arg4 * 128 + 64;
        var12.field280 = arg8;
        var12.field285 = arg0;
        var12.field286 = arg1;
        var12.field283 = arg9;
        var12.field284 = arg3;
        if (arg5 != 54) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        for (int var14 = arg10; var14 >= 0; var14--) {
            if (this.field301[var14][arg7][arg4] == null) {
                this.field301[var14][arg7][arg4] = new Tile(var14, arg7, arg4);
            }
        }
        this.field301[arg10][arg7][arg4].field384 = var12;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIBIIIIIILy;IZ)V")
    public void method73(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Entity arg9, int arg10, boolean arg11) {
        if (arg9 == null) {
            return;
        }
        Decor var13 = new Decor();
        var13.field178 = arg5;
        var13.field179 = arg2;
        if (arg11) {
            return;
        }
        var13.field173 = arg4 * 128 + arg1 + 64;
        var13.field174 = arg7 * 128 + arg8 + 64;
        var13.field172 = arg3;
        var13.field177 = arg9;
        var13.field175 = arg0;
        var13.field176 = arg6;
        for (int var14 = arg10; var14 >= 0; var14--) {
            if (this.field301[var14][arg4][arg7] == null) {
                this.field301[var14][arg4][arg7] = new Tile(var14, arg4, arg7);
            }
        }
        this.field301[arg10][arg4][arg7].field385 = var13;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(BIILy;IIIIIII)Z")
    public boolean method74(byte arg0, int arg1, int arg2, Entity arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg3 == null) {
            return true;
        }
        int var12 = arg1 * 64 + arg8 * 128;
        int var13 = arg5 * 64 + arg7 * 128;
        if (arg4 != -38295) {
            this.field289 = -432;
        }
        return this.method77(arg10, arg8, arg7, arg1, arg5, var12, var13, arg2, arg3, arg9, false, arg6, arg0);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIILy;ZIIZI)Z")
    public boolean method75(int arg0, int arg1, int arg2, int arg3, Entity arg4, boolean arg5, int arg6, int arg7, boolean arg8, int arg9) {
        if (arg4 == null) {
            return true;
        }
        int var11 = arg3 - arg2;
        int var12 = arg9 - arg2;
        int var13 = arg2 + arg3;
        int var14 = arg2 + arg9;
        if (arg8) {
            if (arg0 > 640 && arg0 < 1408) {
                var14 += 128;
            }
            if (arg0 > 1152 && arg0 < 1920) {
                var13 += 128;
            }
            if (arg0 > 1664 || arg0 < 384) {
                var12 -= 128;
            }
            if (arg0 > 128 && arg0 < 896) {
                var11 -= 128;
            }
        }
        int var15 = var11 / 128;
        if (!arg5) {
            throw new NullPointerException();
        }
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        int var18 = var14 / 128;
        return this.method77(arg7, var15, var16, var17 + 1 - var15, var18 - var16 + 1, arg3, arg9, arg6, arg4, arg0, true, arg1, (byte) 0);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIIILy;IIZIII)Z")
    public boolean method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Entity arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12) {
        if (!arg9) {
            this.field290 = !this.field290;
        }
        return arg6 == null ? true : this.method77(arg11, arg7, arg2, arg12 + 1 - arg7, arg4 - arg2 + 1, arg8, arg5, arg0, arg6, arg1, true, arg10, (byte) 0);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIIIIILy;IZIB)Z")
    private boolean method77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, boolean arg10, int arg11, byte arg12) {
        for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
            for (int var21 = arg2; var21 < arg2 + arg4; var21++) {
                if (var14 < 0 || var21 < 0 || var14 >= this.field298 || var21 >= this.field299) {
                    return false;
                }
                Tile var22 = this.field301[arg0][var14][var21];
                if (var22 != null && var22.field388 >= 5) {
                    return false;
                }
            }
        }
        Location var15 = new Location();
        var15.field278 = arg11;
        var15.field279 = arg12;
        var15.field266 = arg0;
        var15.field268 = arg5;
        var15.field269 = arg6;
        var15.field267 = arg7;
        var15.field270 = arg8;
        var15.field271 = arg9;
        var15.field272 = arg1;
        var15.field274 = arg2;
        var15.field273 = arg1 + arg3 - 1;
        var15.field275 = arg2 + arg4 - 1;
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
                    if (this.field301[var19][var16][var17] == null) {
                        this.field301[var19][var16][var17] = new Tile(var19, var16, var17);
                    }
                }
                Tile var20 = this.field301[arg0][var16][var17];
                var20.field389[var20.field388] = var15;
                var20.field390[var20.field388] = var18;
                var20.field391 |= var18;
                var20.field388++;
            }
        }
        if (arg10) {
            this.field304[this.field303++] = var15;
        }
        return true;
    }

    @OriginalMember(owner = "s", name = "c", descriptor = "(I)V")
    public void method78(int arg0) {
        while (arg0 >= 0) {
            this.field294 = -396;
        }
        for (int var2 = 0; var2 < this.field303; var2++) {
            Location var3 = this.field304[var2];
            this.method79(var3, this.field291);
            this.field304[var2] = null;
        }
        this.field303 = 0;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Lq;I)V")
    private void method79(Location arg0, int arg1) {
        if (arg1 != -1189) {
            this.field295 = !this.field295;
        }
        for (int var3 = arg0.field272; var3 <= arg0.field273; var3++) {
            for (int var4 = arg0.field274; var4 <= arg0.field275; var4++) {
                Tile var5 = this.field301[arg0.field266][var3][var4];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field388; var6++) {
                        if (var5.field389[var6] == arg0) {
                            var5.field388--;
                            for (int var7 = var6; var7 < var5.field388; var7++) {
                                var5.field389[var7] = var5.field389[var7 + 1];
                                var5.field390[var7] = var5.field390[var7 + 1];
                            }
                            var5.field389[var5.field388] = null;
                            break;
                        }
                    }
                    var5.field391 = 0;
                    for (int var8 = 0; var8 < var5.field388; var8++) {
                        var5.field391 |= var5.field390[var8];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIBII)V")
    public void method80(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -85) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        Tile var7 = this.field301[arg0][arg3][arg1];
        if (var7 == null) {
            return;
        }
        Decor var8 = var7.field385;
        if (var8 != null) {
            int var9 = arg3 * 128 + 64;
            int var10 = arg1 * 128 + 64;
            var8.field173 = (var8.field173 - var9) * arg4 / 16 + var9;
            var8.field174 = (var8.field174 - var10) * arg4 / 16 + var10;
        }
    }

    @OriginalMember(owner = "s", name = "b", descriptor = "(IIII)V")
    public void method81(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field301[arg1][arg0][arg3];
        if (var5 != null) {
            var5.field384 = null;
            if (arg2 != 0) {
                this.field290 = !this.field290;
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIZI)V")
    public void method82(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            Tile var5 = this.field301[arg3][arg0][arg1];
            if (var5 != null) {
                var5.field385 = null;
            }
        }
    }

    @OriginalMember(owner = "s", name = "c", descriptor = "(IIII)V")
    public void method83(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field301[arg3][arg2][arg1];
        if (var5 == null) {
            return;
        }
        for (int var6 = 0; var6 < var5.field388; var6++) {
            Location var8 = var5.field389[var6];
            if ((var8.field278 >> 29 & 0x3) == 2 && var8.field272 == arg2 && var8.field274 == arg1) {
                this.method79(var8, this.field291);
                return;
            }
        }
        while (arg0 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "s", name = "b", descriptor = "(IIZI)V")
    public void method84(int arg0, int arg1, boolean arg2, int arg3) {
        Tile var5 = this.field301[arg0][arg3][arg1];
        if (!arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (var5 != null) {
            var5.field386 = null;
        }
    }

    @OriginalMember(owner = "s", name = "b", descriptor = "(III)V")
    public void method85(int arg0, int arg1, int arg2) {
        Tile var4 = this.field301[arg0][arg1][arg2];
        if (var4 != null) {
            var4.field387 = null;
        }
    }

    @OriginalMember(owner = "s", name = "d", descriptor = "(IIII)Lr;")
    public Wall method86(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field301[arg0][arg1][arg2];
        if (arg3 >= 0) {
            throw new NullPointerException();
        }
        return var5 == null ? null : var5.field384;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(BIII)Li;")
    public Decor method87(byte arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field301[arg3][arg1][arg2];
        if (this.field292 != arg0) {
            this.field294 = -150;
        }
        return var5 == null ? null : var5.field385;
    }

    @OriginalMember(owner = "s", name = "b", descriptor = "(BIII)Lq;")
    public Location method88(byte arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field301[arg3][arg1][arg2];
        if (var5 == null) {
            return null;
        }
        for (int var6 = 0; var6 < var5.field388; var6++) {
            Location var7 = var5.field389[var6];
            if ((var7.field278 >> 29 & 0x3) == 2 && var7.field272 == arg1 && var7.field274 == arg2) {
                return var7;
            }
        }
        if (arg0 != 2) {
            throw new NullPointerException();
        }
        return null;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IZII)Lk;")
    public GroundDecor method89(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            this.field289 = 491;
        }
        Tile var5 = this.field301[arg0][arg2][arg3];
        return var5 == null || var5.field386 == null ? null : var5.field386;
    }

    @OriginalMember(owner = "s", name = "c", descriptor = "(III)I")
    public int method90(int arg0, int arg1, int arg2) {
        Tile var4 = this.field301[arg0][arg1][arg2];
        return var4 == null || var4.field384 == null ? 0 : var4.field384.field287;
    }

    @OriginalMember(owner = "s", name = "e", descriptor = "(IIII)I")
    public int method91(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field301[arg1][arg0][arg3];
        if (arg2 < 4 || arg2 > 4) {
            this.field289 = 129;
        }
        return var5 == null || var5.field385 == null ? 0 : var5.field385.field178;
    }

    @OriginalMember(owner = "s", name = "d", descriptor = "(III)I")
    public int method92(int arg0, int arg1, int arg2) {
        Tile var4 = this.field301[arg0][arg1][arg2];
        if (var4 == null) {
            return 0;
        }
        for (int var5 = 0; var5 < var4.field388; var5++) {
            Location var6 = var4.field389[var5];
            if ((var6.field278 >> 29 & 0x3) == 2 && var6.field272 == arg1 && var6.field274 == arg2) {
                return var6.field278;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "s", name = "e", descriptor = "(III)I")
    public int method93(int arg0, int arg1, int arg2) {
        Tile var4 = this.field301[arg0][arg1][arg2];
        return var4 == null || var4.field386 == null ? 0 : var4.field386.field210;
    }

    @OriginalMember(owner = "s", name = "f", descriptor = "(IIII)I")
    public int method94(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field301[arg0][arg1][arg2];
        if (var5 == null) {
            return -1;
        } else if (var5.field384 != null && var5.field384.field287 == arg3) {
            return var5.field384.field288 & 0xFF;
        } else if (var5.field385 != null && var5.field385.field178 == arg3) {
            return var5.field385.field179 & 0xFF;
        } else if (var5.field386 != null && var5.field386.field210 == arg3) {
            return var5.field386.field211 & 0xFF;
        } else {
            for (int var6 = 0; var6 < var5.field388; var6++) {
                if (var5.field389[var6].field278 == arg3) {
                    return var5.field389[var6].field279 & 0xFF;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIII)V")
    public void method95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (int) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        int var8 = arg0 * var7 >> 8;
        if (arg1 != -2568) {
            return;
        }
        for (int var9 = 0; var9 < this.field297; var9++) {
            for (int var10 = 0; var10 < this.field298; var10++) {
                for (int var11 = 0; var11 < this.field299; var11++) {
                    Tile var12 = this.field301[var9][var10][var11];
                    if (var12 != null) {
                        Wall var13 = var12.field384;
                        if (var13 != null && var13.field285 != null && var13.field285.field405 != null) {
                            this.method97(var11, var10, var9, (Model) var13.field285, 202, 1, 1);
                            if (var13.field286 != null && var13.field286.field405 != null) {
                                this.method97(var11, var10, var9, (Model) var13.field286, 202, 1, 1);
                                this.method98((Model) var13.field285, (Model) var13.field286, 0, 0, 0, false);
                                ((Model) var13.field286).method157(arg2, var8, arg4, arg3, arg5);
                            }
                            ((Model) var13.field285).method157(arg2, var8, arg4, arg3, arg5);
                        }
                        for (int var14 = 0; var14 < var12.field388; var14++) {
                            Location var16 = var12.field389[var14];
                            if (var16 != null && var16.field270 != null && var16.field270.field405 != null) {
                                this.method97(var11, var10, var9, (Model) var16.field270, 202, var16.field275 + 1 - var16.field274, var16.field273 - var16.field272 + 1);
                                ((Model) var16.field270).method157(arg2, var8, arg4, arg3, arg5);
                            }
                        }
                        GroundDecor var15 = var12.field386;
                        if (var15 != null && var15.field209.field405 != null) {
                            this.method96((Model) var15.field209, var11, var9, 864, var10);
                            ((Model) var15.field209).method157(arg2, var8, arg4, arg3, arg5);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Lfb;IIII)V")
    private void method96(Model arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 19 / arg3;
        if (arg4 < this.field298) {
            Tile var7 = this.field301[arg2][arg4 + 1][arg1];
            if (var7 != null && var7.field386 != null && var7.field386.field209.field405 != null) {
                this.method98(arg0, (Model) var7.field386.field209, 128, 0, 0, true);
            }
        }
        if (arg1 < this.field298) {
            Tile var8 = this.field301[arg2][arg4][arg1 + 1];
            if (var8 != null && var8.field386 != null && var8.field386.field209.field405 != null) {
                this.method98(arg0, (Model) var8.field386.field209, 0, 0, 128, true);
            }
        }
        if (arg4 < this.field298 && arg1 < this.field299) {
            Tile var9 = this.field301[arg2][arg4 + 1][arg1 + 1];
            if (var9 != null && var9.field386 != null && var9.field386.field209.field405 != null) {
                this.method98(arg0, (Model) var9.field386.field209, 128, 0, 128, true);
            }
        }
        if (arg4 >= this.field298 || arg1 <= 0) {
            return;
        }
        Tile var10 = this.field301[arg2][arg4 + 1][arg1 - 1];
        if (var10 != null && var10.field386 != null && var10.field386.field209.field405 != null) {
            this.method98(arg0, (Model) var10.field386.field209, 128, 0, -128, true);
            return;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIILfb;III)V")
    private void method97(int arg0, int arg1, int arg2, Model arg3, int arg4, int arg5, int arg6) {
        boolean var8 = true;
        int var9 = arg1;
        int var10 = arg1 + arg6;
        int var11 = arg0 - 1;
        int var12 = arg0 + arg5;
        int var13 = 65 / arg4;
        for (int var14 = arg2; var14 <= arg2 + 1; var14++) {
            if (this.field297 != var14) {
                for (int var15 = var9; var15 <= var10; var15++) {
                    if (var15 >= 0 && var15 < this.field298) {
                        for (int var16 = var11; var16 <= var12; var16++) {
                            if (var16 >= 0 && var16 < this.field299 && (!var8 || var15 >= var10 || var16 >= var12 || var16 < arg0 && arg1 != var15)) {
                                Tile var17 = this.field301[var14][var15][var16];
                                if (var17 != null) {
                                    int var18 = (this.field300[var14][var15 + 1][var16] + this.field300[var14][var15][var16] + this.field300[var14][var15][var16 + 1] + this.field300[var14][var15 + 1][var16 + 1]) / 4 - (this.field300[arg2][arg1 + 1][arg0] + this.field300[arg2][arg1][arg0] + this.field300[arg2][arg1][arg0 + 1] + this.field300[arg2][arg1 + 1][arg0 + 1]) / 4;
                                    Wall var19 = var17.field384;
                                    if (var19 != null && var19.field285 != null && var19.field285.field405 != null) {
                                        this.method98(arg3, (Model) var19.field285, (var15 - arg1) * 128 + (1 - arg6) * 64, var18, (var16 - arg0) * 128 + (1 - arg5) * 64, var8);
                                    }
                                    if (var19 != null && var19.field286 != null && var19.field286.field405 != null) {
                                        this.method98(arg3, (Model) var19.field286, (var15 - arg1) * 128 + (1 - arg6) * 64, var18, (var16 - arg0) * 128 + (1 - arg5) * 64, var8);
                                    }
                                    for (int var20 = 0; var20 < var17.field388; var20++) {
                                        Location var21 = var17.field389[var20];
                                        if (var21 != null && var21.field270 != null && var21.field270.field405 != null) {
                                            int var22 = var21.field273 + 1 - var21.field272;
                                            int var23 = var21.field275 + 1 - var21.field274;
                                            this.method98(arg3, (Model) var21.field270, (var21.field272 - arg1) * 128 + (var22 - arg6) * 64, var18, (var21.field274 - arg0) * 128 + (var23 - arg5) * 64, var8);
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
    private void method98(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field348++;
        int var7 = 0;
        int[] var8 = arg1.field540;
        int var9 = arg1.field539;
        for (int var10 = 0; var10 < arg0.field539; var10++) {
            VertexNormal var13 = arg0.field405[var10];
            VertexNormal var14 = arg0.field573[var10];
            if (var14.field258 != 0) {
                int var15 = arg0.field541[var10] - arg3;
                if (var15 <= arg1.field564) {
                    int var16 = arg0.field540[var10] - arg2;
                    if (var16 >= arg1.field559 && var16 <= arg1.field560) {
                        int var17 = arg0.field542[var10] - arg4;
                        if (var17 >= arg1.field562 && var17 <= arg1.field561) {
                            for (int var18 = 0; var18 < var9; var18++) {
                                VertexNormal var19 = arg1.field405[var18];
                                VertexNormal var20 = arg1.field573[var18];
                                if (var8[var18] == var16 && arg1.field542[var18] == var17 && arg1.field541[var18] == var15 && var20.field258 != 0) {
                                    var13.field255 += var20.field255;
                                    var13.field256 += var20.field256;
                                    var13.field257 += var20.field257;
                                    var13.field258 += var20.field258;
                                    var19.field255 += var14.field255;
                                    var19.field256 += var14.field256;
                                    var19.field257 += var14.field257;
                                    var19.field258 += var14.field258;
                                    var7++;
                                    this.field346[var10] = this.field348;
                                    this.field347[var18] = this.field348;
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
        for (int var11 = 0; var11 < arg0.field543; var11++) {
            if (this.field346[arg0.field544[var11]] == this.field348 && this.field346[arg0.field545[var11]] == this.field348 && this.field346[arg0.field546[var11]] == this.field348) {
                arg0.field550[var11] = -1;
            }
        }
        for (int var12 = 0; var12 < arg1.field543; var12++) {
            if (this.field347[arg1.field544[var12]] == this.field348 && this.field347[arg1.field545[var12]] == this.field348 && this.field347[arg1.field546[var12]] == this.field348) {
                arg1.field550[var12] = -1;
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "([IIIIII)V")
    public void method99(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Tile var7 = this.field301[arg3][arg4][arg5];
        if (var7 == null) {
            return;
        }
        TileUnderlay var8 = var7.field382;
        if (var8 != null) {
            int var9 = var8.field265;
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
        TileOverlay var11 = var7.field383;
        if (var11 == null) {
            return;
        }
        int var12 = var11.field192;
        int var13 = var11.field193;
        int var14 = var11.field194;
        int var15 = var11.field195;
        int[] var16 = this.field349[var12];
        int[] var17 = this.field350[var13];
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

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIII[IZ)V")
    public static void method100(int arg0, int arg1, int arg2, int arg3, int[] arg4, boolean arg5) {
        field355 = 0;
        field356 = 0;
        field357 = arg1;
        field358 = arg2;
        field353 = arg1 / 2;
        field354 = arg2 / 2;
        boolean[][][][] var6 = new boolean[9][32][53][53];
        if (!arg5) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        for (int var8 = 128; var8 <= 384; var8 += 32) {
            for (int var16 = 0; var16 < 2048; var16 += 64) {
                field318 = Model.field602[var8];
                field319 = Model.field603[var8];
                field320 = Model.field602[var16];
                field321 = Model.field603[var16];
                int var17 = (var8 - 128) / 32;
                int var18 = var16 / 64;
                for (int var19 = -26; var19 <= 26; var19++) {
                    for (int var20 = -26; var20 <= 26; var20++) {
                        int var21 = var19 * 128;
                        int var22 = var20 * 128;
                        boolean var23 = false;
                        for (int var24 = -arg0; var24 <= arg3; var24 += 128) {
                            if (method101(0, var22, var21, arg4[var17] + var24)) {
                                var23 = true;
                                break;
                            }
                        }
                        var6[var17][var18][var19 + 25 + 1][var20 + 25 + 1] = var23;
                    }
                }
            }
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 32; var10++) {
                for (int var11 = -25; var11 < 25; var11++) {
                    for (int var12 = -25; var12 < 25; var12++) {
                        boolean var13 = false;
                        label83: for (int var14 = -1; var14 <= 1; var14++) {
                            for (int var15 = -1; var15 <= 1; var15++) {
                                if (var6[var9][var10][var11 + var14 + 25 + 1][var12 + var15 + 25 + 1]) {
                                    var13 = true;
                                    break label83;
                                }
                                if (var6[var9][(var10 + 1) % 31][var11 + var14 + 25 + 1][var12 + var15 + 25 + 1]) {
                                    var13 = true;
                                    break label83;
                                }
                                if (var6[var9 + 1][var10][var11 + var14 + 25 + 1][var12 + var15 + 25 + 1]) {
                                    var13 = true;
                                    break label83;
                                }
                                if (var6[var9 + 1][(var10 + 1) % 31][var11 + var14 + 25 + 1][var12 + var15 + 25 + 1]) {
                                    var13 = true;
                                    break label83;
                                }
                            }
                        }
                        field351[var9][var10][var11 + 25][var12 + 25] = var13;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "s", name = "g", descriptor = "(IIII)Z")
    public static boolean method101(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            field293 = !field293;
        }
        int var4 = field321 * arg2 + field320 * arg1 >> 16;
        int var5 = field321 * arg1 - field320 * arg2 >> 16;
        int var6 = field319 * var5 + field318 * arg3 >> 16;
        int var7 = field319 * arg3 - field318 * var5 >> 16;
        if (var6 >= 50 && var6 <= 3500) {
            int var8 = (var4 << 9) / var6 + field353;
            int var9 = (var7 << 9) / var6 + field354;
            return var8 >= field355 && var8 <= field357 && var9 >= field356 && var9 <= field358;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "s", name = "f", descriptor = "(III)V")
    public void method102(int arg0, int arg1, int arg2) {
        field327 = true;
        field328 = arg2;
        field329 = arg1;
        if (arg0 < 0) {
            field330 = -1;
            field331 = -1;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIIII)V")
    public void method103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= this.field298 * 128) {
            arg0 = this.field298 * 128 - 1;
        }
        if (arg1 < 0) {
            arg1 = 0;
        } else if (arg1 >= this.field299 * 128) {
            arg1 = this.field299 * 128 - 1;
        }
        field308++;
        field318 = Model.field602[arg2];
        field319 = Model.field603[arg2];
        field320 = Model.field602[arg5];
        field321 = Model.field603[arg5];
        field352 = field351[(arg2 - 128) / 32][arg5 / 64];
        field315 = arg0;
        field316 = arg3;
        field317 = arg1;
        field313 = arg0 / 128;
        field314 = arg1 / 128;
        field307 = arg4;
        field309 = field313 - 25;
        if (field309 < 0) {
            field309 = 0;
        }
        field311 = field314 - 25;
        if (field311 < 0) {
            field311 = 0;
        }
        field310 = field313 + 25;
        if (arg6 != 5) {
            this.field291 = 477;
        }
        if (field310 > this.field298) {
            field310 = this.field298;
        }
        field312 = field314 + 25;
        if (field312 > this.field299) {
            field312 = this.field299;
        }
        this.method109(9);
        field306 = 0;
        for (int var8 = this.field302; var8 < this.field297; var8++) {
            Tile[][] var33 = this.field301[var8];
            for (int var34 = field309; var34 < field310; var34++) {
                for (int var35 = field311; var35 < field312; var35++) {
                    Tile var36 = var33[var34][var35];
                    if (var36 != null) {
                        if (var36.field392 <= arg4 && (field352[var34 + 25 - field313][var35 + 25 - field314] || this.field300[var8][var34][var35] - arg3 >= 2000)) {
                            var36.field393 = true;
                            var36.field394 = true;
                            if (var36.field388 > 0) {
                                var36.field395 = true;
                            } else {
                                var36.field395 = false;
                            }
                            field306++;
                        } else {
                            var36.field393 = false;
                            var36.field394 = false;
                            var36.field396 = 0;
                        }
                    }
                }
            }
        }
        for (int var9 = this.field302; var9 < this.field297; var9++) {
            Tile[][] var22 = this.field301[var9];
            for (int var23 = -25; var23 <= 0; var23++) {
                int var24 = field313 + var23;
                int var25 = field313 - var23;
                if (var24 >= field309 || var25 < field310) {
                    for (int var26 = -25; var26 <= 0; var26++) {
                        int var27 = field314 + var26;
                        int var28 = field314 - var26;
                        if (var24 >= field309) {
                            if (var27 >= field311) {
                                Tile var29 = var22[var24][var27];
                                if (var29 != null && var29.field393) {
                                    this.method104(var29, true);
                                }
                            }
                            if (var28 < field312) {
                                Tile var30 = var22[var24][var28];
                                if (var30 != null && var30.field393) {
                                    this.method104(var30, true);
                                }
                            }
                        }
                        if (var25 < field310) {
                            if (var27 >= field311) {
                                Tile var31 = var22[var25][var27];
                                if (var31 != null && var31.field393) {
                                    this.method104(var31, true);
                                }
                            }
                            if (var28 < field312) {
                                Tile var32 = var22[var25][var28];
                                if (var32 != null && var32.field393) {
                                    this.method104(var32, true);
                                }
                            }
                        }
                        if (field306 == 0) {
                            field327 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var10 = this.field302; var10 < this.field297; var10++) {
            Tile[][] var11 = this.field301[var10];
            for (int var12 = -25; var12 <= 0; var12++) {
                int var13 = field313 + var12;
                int var14 = field313 - var12;
                if (var13 >= field309 || var14 < field310) {
                    for (int var15 = -25; var15 <= 0; var15++) {
                        int var16 = field314 + var15;
                        int var17 = field314 - var15;
                        if (var13 >= field309) {
                            if (var16 >= field311) {
                                Tile var18 = var11[var13][var16];
                                if (var18 != null && var18.field393) {
                                    this.method104(var18, false);
                                }
                            }
                            if (var17 < field312) {
                                Tile var19 = var11[var13][var17];
                                if (var19 != null && var19.field393) {
                                    this.method104(var19, false);
                                }
                            }
                        }
                        if (var14 < field310) {
                            if (var16 >= field311) {
                                Tile var20 = var11[var14][var16];
                                if (var20 != null && var20.field393) {
                                    this.method104(var20, false);
                                }
                            }
                            if (var17 < field312) {
                                Tile var21 = var11[var14][var17];
                                if (var21 != null && var21.field393) {
                                    this.method104(var21, false);
                                }
                            }
                        }
                        if (field306 == 0) {
                            field327 = false;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Lw;Z)V")
    public void method104(Tile arg0, boolean arg1) {
        field337.method255(arg0);
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
                                                var3 = (Tile) field337.method257();
                                                if (var3 == null) {
                                                    return;
                                                }
                                            } while (!var3.field394);
                                            var4 = var3.field379;
                                            var5 = var3.field380;
                                            var6 = var3.field378;
                                            var7 = var3.field381;
                                            var8 = this.field301[var6];
                                            if (!var3.field393) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var6 > 0) {
                                                    Tile var9 = this.field301[var6 - 1][var4][var5];
                                                    if (var9 != null && var9.field394) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= field313 && var4 > field309) {
                                                    Tile var10 = var8[var4 - 1][var5];
                                                    if (var10 != null && var10.field394 && (var10.field393 || (var3.field391 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= field313 && var4 < field310 - 1) {
                                                    Tile var11 = var8[var4 + 1][var5];
                                                    if (var11 != null && var11.field394 && (var11.field393 || (var3.field391 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 <= field314 && var5 > field311) {
                                                    Tile var12 = var8[var4][var5 - 1];
                                                    if (var12 != null && var12.field394 && (var12.field393 || (var3.field391 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 >= field314 && var5 < field312 - 1) {
                                                    Tile var13 = var8[var4][var5 + 1];
                                                    if (var13 != null && var13.field394 && (var13.field393 || (var3.field391 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var3.field393 = false;
                                            if (var3.field400 != null) {
                                                Tile var14 = var3.field400;
                                                if (var14.field382 == null) {
                                                    if (var14.field383 != null && !this.method110(0, var4, var5)) {
                                                        this.method106(field321, field320, true, field318, field319, var14.field383, var4, var5);
                                                    }
                                                } else if (!this.method110(0, var4, var5)) {
                                                    this.method105(var14.field382, 0, field318, field319, field320, field321, var4, var5);
                                                }
                                                Wall var15 = var14.field384;
                                                if (var15 != null) {
                                                    var15.field285.method122(0, field318, field319, field320, field321, var15.field281 - field315, var15.field280 - field316, var15.field282 - field317, var15.field287);
                                                }
                                                for (int var16 = 0; var16 < var14.field388; var16++) {
                                                    Location var17 = var14.field389[var16];
                                                    if (var17 != null) {
                                                        var17.field270.method122(var17.field271, field318, field319, field320, field321, var17.field268 - field315, var17.field267 - field316, var17.field269 - field317, var17.field278);
                                                    }
                                                }
                                            }
                                            boolean var18 = false;
                                            if (var3.field382 == null) {
                                                if (var3.field383 != null && !this.method110(var7, var4, var5)) {
                                                    var18 = true;
                                                    this.method106(field321, field320, true, field318, field319, var3.field383, var4, var5);
                                                }
                                            } else if (!this.method110(var7, var4, var5)) {
                                                var18 = true;
                                                this.method105(var3.field382, var7, field318, field319, field320, field321, var4, var5);
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            Wall var21 = var3.field384;
                                            Decor var22 = var3.field385;
                                            if (var21 != null || var22 != null) {
                                                if (field313 == var4) {
                                                    var19++;
                                                } else if (field313 < var4) {
                                                    var19 += 2;
                                                }
                                                if (field314 == var5) {
                                                    var19 += 3;
                                                } else if (field314 > var5) {
                                                    var19 += 6;
                                                }
                                                var20 = field338[var19];
                                                var3.field399 = field340[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field283 & field339[var19]) == 0) {
                                                    var3.field396 = 0;
                                                } else if (var21.field283 == 16) {
                                                    var3.field396 = 3;
                                                    var3.field397 = field341[var19];
                                                    var3.field398 = 3 - var3.field397;
                                                } else if (var21.field283 == 32) {
                                                    var3.field396 = 6;
                                                    var3.field397 = field342[var19];
                                                    var3.field398 = 6 - var3.field397;
                                                } else if (var21.field283 == 64) {
                                                    var3.field396 = 12;
                                                    var3.field397 = field343[var19];
                                                    var3.field398 = 12 - var3.field397;
                                                } else {
                                                    var3.field396 = 9;
                                                    var3.field397 = field344[var19];
                                                    var3.field398 = 9 - var3.field397;
                                                }
                                                if ((var21.field283 & var20) != 0 && !this.method111(var7, var4, var5, var21.field283)) {
                                                    var21.field285.method122(0, field318, field319, field320, field321, var21.field281 - field315, var21.field280 - field316, var21.field282 - field317, var21.field287);
                                                }
                                                if ((var21.field284 & var20) != 0 && !this.method111(var7, var4, var5, var21.field284)) {
                                                    var21.field286.method122(0, field318, field319, field320, field321, var21.field281 - field315, var21.field280 - field316, var21.field282 - field317, var21.field287);
                                                }
                                            }
                                            if (var22 != null && !this.method112(var7, var4, var5, var22.field177.field406)) {
                                                if ((var22.field175 & var20) != 0) {
                                                    var22.field177.method122(var22.field176, field318, field319, field320, field321, var22.field173 - field315, var22.field172 - field316, var22.field174 - field317, var22.field178);
                                                } else if ((var22.field175 & 0x300) != 0) {
                                                    int var23 = var22.field173 - field315;
                                                    int var24 = var22.field172 - field316;
                                                    int var25 = var22.field174 - field317;
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
                                                        int var29 = field323[var26] + var23;
                                                        int var30 = field324[var26] + var25;
                                                        var22.field177.method122(var26 * 512 + 256, field318, field319, field320, field321, var29, var24, var30, var22.field178);
                                                    }
                                                    if ((var22.field175 & 0x200) != 0 && var28 > var27) {
                                                        int var31 = field325[var26] + var23;
                                                        int var32 = field326[var26] + var25;
                                                        var22.field177.method122(var26 * 512 + 1280 & 0x7FF, field318, field319, field320, field321, var31, var24, var32, var22.field178);
                                                    }
                                                }
                                            }
                                            if (var18) {
                                                GroundDecor var33 = var3.field386;
                                                if (var33 != null) {
                                                    var33.field209.method122(0, field318, field319, field320, field321, var33.field207 - field315, var33.field206 - field316, var33.field208 - field317, var33.field210);
                                                }
                                                GroundObject var34 = var3.field387;
                                                if (var34 != null && var34.field219 == 0) {
                                                    if (var34.field216 != null) {
                                                        var34.field216.method122(0, field318, field319, field320, field321, var34.field213 - field315, var34.field212 - field316, var34.field214 - field317, var34.field218);
                                                    }
                                                    if (var34.field217 != null) {
                                                        var34.field217.method122(0, field318, field319, field320, field321, var34.field213 - field315, var34.field212 - field316, var34.field214 - field317, var34.field218);
                                                    }
                                                    if (var34.field215 != null) {
                                                        var34.field215.method122(0, field318, field319, field320, field321, var34.field213 - field315, var34.field212 - field316, var34.field214 - field317, var34.field218);
                                                    }
                                                }
                                            }
                                            int var35 = var3.field391;
                                            if (var35 != 0) {
                                                if (var4 < field313 && (var35 & 0x4) != 0) {
                                                    Tile var36 = var8[var4 + 1][var5];
                                                    if (var36 != null && var36.field394) {
                                                        field337.method255(var36);
                                                    }
                                                }
                                                if (var5 < field314 && (var35 & 0x2) != 0) {
                                                    Tile var37 = var8[var4][var5 + 1];
                                                    if (var37 != null && var37.field394) {
                                                        field337.method255(var37);
                                                    }
                                                }
                                                if (var4 > field313 && (var35 & 0x1) != 0) {
                                                    Tile var38 = var8[var4 - 1][var5];
                                                    if (var38 != null && var38.field394) {
                                                        field337.method255(var38);
                                                    }
                                                }
                                                if (var5 > field314 && (var35 & 0x8) != 0) {
                                                    Tile var39 = var8[var4][var5 - 1];
                                                    if (var39 != null && var39.field394) {
                                                        field337.method255(var39);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var3.field396 != 0) {
                                            boolean var40 = true;
                                            for (int var41 = 0; var41 < var3.field388; var41++) {
                                                if (field308 != var3.field389[var41].field277 && (var3.field390[var41] & var3.field396) == var3.field397) {
                                                    var40 = false;
                                                    break;
                                                }
                                            }
                                            if (var40) {
                                                Wall var42 = var3.field384;
                                                if (!this.method111(var7, var4, var5, var42.field283)) {
                                                    var42.field285.method122(0, field318, field319, field320, field321, var42.field281 - field315, var42.field280 - field316, var42.field282 - field317, var42.field287);
                                                }
                                                var3.field396 = 0;
                                            }
                                        }
                                        if (!var3.field395) {
                                            break;
                                        }
                                        int var43 = var3.field388;
                                        var3.field395 = false;
                                        int var44 = 0;
                                        label563: for (int var45 = 0; var45 < var43; var45++) {
                                            Location var58 = var3.field389[var45];
                                            if (field308 != var58.field277) {
                                                for (int var59 = var58.field272; var59 <= var58.field273; var59++) {
                                                    for (int var64 = var58.field274; var64 <= var58.field275; var64++) {
                                                        Tile var65 = var8[var59][var64];
                                                        if (var65.field393) {
                                                            var3.field395 = true;
                                                            continue label563;
                                                        }
                                                        if (var65.field396 != 0) {
                                                            int var66 = 0;
                                                            if (var59 > var58.field272) {
                                                                var66++;
                                                            }
                                                            if (var59 < var58.field273) {
                                                                var66 += 4;
                                                            }
                                                            if (var64 > var58.field274) {
                                                                var66 += 8;
                                                            }
                                                            if (var64 < var58.field275) {
                                                                var66 += 2;
                                                            }
                                                            if ((var66 & var65.field396) == var3.field398) {
                                                                var3.field395 = true;
                                                                continue label563;
                                                            }
                                                        }
                                                    }
                                                }
                                                field322[var44++] = var58;
                                                int var60 = field313 - var58.field272;
                                                int var61 = var58.field273 - field313;
                                                if (var61 > var60) {
                                                    var60 = var61;
                                                }
                                                int var62 = field314 - var58.field274;
                                                int var63 = var58.field275 - field314;
                                                if (var63 > var62) {
                                                    var58.field276 = var60 + var63;
                                                } else {
                                                    var58.field276 = var60 + var62;
                                                }
                                            }
                                        }
                                        while (var44 > 0) {
                                            int var46 = -50;
                                            int var47 = -1;
                                            for (int var48 = 0; var48 < var44; var48++) {
                                                Location var53 = field322[var48];
                                                if (field308 != var53.field277) {
                                                    if (var53.field276 > var46) {
                                                        var46 = var53.field276;
                                                        var47 = var48;
                                                    } else if (var53.field276 == var46) {
                                                        int var54 = var53.field268 - field315;
                                                        int var55 = var53.field269 - field317;
                                                        int var56 = field322[var47].field268 - field315;
                                                        int var57 = field322[var47].field269 - field317;
                                                        if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                            var47 = var48;
                                                        }
                                                    }
                                                }
                                            }
                                            if (var47 == -1) {
                                                break;
                                            }
                                            Location var49 = field322[var47];
                                            var49.field277 = field308;
                                            if (!this.method113(var7, var49.field272, var49.field273, var49.field274, var49.field275, var49.field270.field406)) {
                                                var49.field270.method122(var49.field271, field318, field319, field320, field321, var49.field268 - field315, var49.field267 - field316, var49.field269 - field317, var49.field278);
                                            }
                                            for (int var50 = var49.field272; var50 <= var49.field273; var50++) {
                                                for (int var51 = var49.field274; var51 <= var49.field275; var51++) {
                                                    Tile var52 = var8[var50][var51];
                                                    if (var52.field396 != 0) {
                                                        field337.method255(var52);
                                                    } else if ((var4 != var50 || var5 != var51) && var52.field394) {
                                                        field337.method255(var52);
                                                    }
                                                }
                                            }
                                        }
                                        if (!var3.field395) {
                                            break;
                                        }
                                    }
                                } while (!var3.field394);
                            } while (var3.field396 != 0);
                            if (var4 > field313 || var4 <= field309) {
                                break;
                            }
                            var67 = var8[var4 - 1][var5];
                        } while (var67 != null && var67.field394);
                        if (var4 < field313 || var4 >= field310 - 1) {
                            break;
                        }
                        var68 = var8[var4 + 1][var5];
                    } while (var68 != null && var68.field394);
                    if (var5 > field314 || var5 <= field311) {
                        break;
                    }
                    var69 = var8[var4][var5 - 1];
                } while (var69 != null && var69.field394);
                if (var5 < field314 || var5 >= field312 - 1) {
                    break;
                }
                var70 = var8[var4][var5 + 1];
            } while (var70 != null && var70.field394);
            var3.field394 = false;
            field306--;
            GroundObject var71 = var3.field387;
            if (var71 != null && var71.field219 != 0) {
                if (var71.field216 != null) {
                    var71.field216.method122(0, field318, field319, field320, field321, var71.field213 - field315, var71.field212 - field316 - var71.field219, var71.field214 - field317, var71.field218);
                }
                if (var71.field217 != null) {
                    var71.field217.method122(0, field318, field319, field320, field321, var71.field213 - field315, var71.field212 - field316 - var71.field219, var71.field214 - field317, var71.field218);
                }
                if (var71.field215 != null) {
                    var71.field215.method122(0, field318, field319, field320, field321, var71.field213 - field315, var71.field212 - field316 - var71.field219, var71.field214 - field317, var71.field218);
                }
            }
            if (var3.field399 != 0) {
                Decor var72 = var3.field385;
                if (var72 != null && !this.method112(var7, var4, var5, var72.field177.field406)) {
                    if ((var72.field175 & var3.field399) != 0) {
                        var72.field177.method122(var72.field176, field318, field319, field320, field321, var72.field173 - field315, var72.field172 - field316, var72.field174 - field317, var72.field178);
                    } else if ((var72.field175 & 0x300) != 0) {
                        int var73 = var72.field173 - field315;
                        int var74 = var72.field172 - field316;
                        int var75 = var72.field174 - field317;
                        int var76 = var72.field176;
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
                        if ((var72.field175 & 0x100) != 0 && var78 >= var77) {
                            int var79 = field323[var76] + var73;
                            int var80 = field324[var76] + var75;
                            var72.field177.method122(var76 * 512 + 256, field318, field319, field320, field321, var79, var74, var80, var72.field178);
                        }
                        if ((var72.field175 & 0x200) != 0 && var78 <= var77) {
                            int var81 = field325[var76] + var73;
                            int var82 = field326[var76] + var75;
                            var72.field177.method122(var76 * 512 + 1280 & 0x7FF, field318, field319, field320, field321, var81, var74, var82, var72.field178);
                        }
                    }
                }
                Wall var83 = var3.field384;
                if (var83 != null) {
                    if ((var83.field284 & var3.field399) != 0 && !this.method111(var7, var4, var5, var83.field284)) {
                        var83.field286.method122(0, field318, field319, field320, field321, var83.field281 - field315, var83.field280 - field316, var83.field282 - field317, var83.field287);
                    }
                    if ((var83.field283 & var3.field399) != 0 && !this.method111(var7, var4, var5, var83.field283)) {
                        var83.field285.method122(0, field318, field319, field320, field321, var83.field281 - field315, var83.field280 - field316, var83.field282 - field317, var83.field287);
                    }
                }
            }
            if (var6 < this.field297 - 1) {
                Tile var84 = this.field301[var6 + 1][var4][var5];
                if (var84 != null && var84.field394) {
                    field337.method255(var84);
                }
            }
            if (var4 < field313) {
                Tile var85 = var8[var4 + 1][var5];
                if (var85 != null && var85.field394) {
                    field337.method255(var85);
                }
            }
            if (var5 < field314) {
                Tile var86 = var8[var4][var5 + 1];
                if (var86 != null && var86.field394) {
                    field337.method255(var86);
                }
            }
            if (var4 > field313) {
                Tile var87 = var8[var4 - 1][var5];
                if (var87 != null && var87.field394) {
                    field337.method255(var87);
                }
            }
            if (var5 > field314) {
                Tile var88 = var8[var4][var5 - 1];
                if (var88 != null && var88.field394) {
                    field337.method255(var88);
                }
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Lp;IIIIIII)V")
    public void method105(TileUnderlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9;
        int var10 = var9 = (arg6 << 7) - field315;
        int var11;
        int var12 = var11 = (arg7 << 7) - field317;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = this.field300[arg1][arg6][arg7] - field316;
        int var18 = this.field300[arg1][arg6 + 1][arg7] - field316;
        int var19 = this.field300[arg1][arg6 + 1][arg7 + 1] - field316;
        int var20 = this.field300[arg1][arg6][arg7 + 1] - field316;
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
        int var45 = (var21 << 9) / var25 + Pix3D.field641;
        int var46 = (var24 << 9) / var25 + Pix3D.field642;
        int var47 = (var27 << 9) / var31 + Pix3D.field641;
        int var48 = (var30 << 9) / var31 + Pix3D.field642;
        int var49 = (var33 << 9) / var37 + Pix3D.field641;
        int var50 = (var36 << 9) / var37 + Pix3D.field642;
        int var51 = (var39 << 9) / var43 + Pix3D.field641;
        int var52 = (var42 << 9) / var43 + Pix3D.field642;
        Pix3D.field640 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            Pix3D.field637 = false;
            if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > Pix2D.field630 || var51 > Pix2D.field630 || var47 > Pix2D.field630) {
                Pix3D.field637 = true;
            }
            if (field327 && this.method108(field328, field329, var50, var52, var48, var49, var51, var47)) {
                field330 = arg6;
                field331 = arg7;
            }
            if (arg0.field263 == -1) {
                if (arg0.field261 != 12345678) {
                    Pix3D.method188(var50, var52, var48, var49, var51, var47, arg0.field261, arg0.field262, arg0.field260);
                }
            } else if (field296) {
                int var53 = field345[arg0.field263];
                Pix3D.method188(var50, var52, var48, var49, var51, var47, this.method107(arg0.field261, true, var53), this.method107(arg0.field262, true, var53), this.method107(arg0.field260, true, var53));
            } else if (arg0.field264) {
                Pix3D.method192(var50, var52, var48, var49, var51, var47, arg0.field261, arg0.field262, arg0.field260, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field263);
            } else {
                Pix3D.method192(var50, var52, var48, var49, var51, var47, arg0.field261, arg0.field262, arg0.field260, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field263);
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        Pix3D.field637 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Pix2D.field630 || var47 > Pix2D.field630 || var51 > Pix2D.field630) {
            Pix3D.field637 = true;
        }
        if (field327 && this.method108(field328, field329, var46, var48, var52, var45, var47, var51)) {
            field330 = arg6;
            field331 = arg7;
        }
        if (arg0.field263 != -1) {
            if (!field296) {
                Pix3D.method192(var46, var48, var52, var45, var47, var51, arg0.field259, arg0.field260, arg0.field262, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field263);
                return;
            }
            int var54 = field345[arg0.field263];
            Pix3D.method188(var46, var48, var52, var45, var47, var51, this.method107(arg0.field259, true, var54), this.method107(arg0.field260, true, var54), this.method107(arg0.field262, true, var54));
        } else if (arg0.field259 != 12345678) {
            Pix3D.method188(var46, var48, var52, var45, var47, var51, arg0.field259, arg0.field260, arg0.field262);
            return;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIZIILj;II)V")
    public void method106(int arg0, int arg1, boolean arg2, int arg3, int arg4, TileOverlay arg5, int arg6, int arg7) {
        int var9 = arg5.field181.length;
        for (int var10 = 0; var10 < var9; var10++) {
            int var24 = arg5.field181[var10] - field315;
            int var25 = arg5.field182[var10] - field316;
            int var26 = arg5.field183[var10] - field317;
            int var27 = arg0 * var24 + arg1 * var26 >> 16;
            int var28 = arg0 * var26 - arg1 * var24 >> 16;
            int var30 = arg4 * var25 - arg3 * var28 >> 16;
            int var31 = arg3 * var25 + arg4 * var28 >> 16;
            if (var31 < 50) {
                return;
            }
            if (arg5.field190 != null) {
                TileOverlay.field198[var10] = var27;
                TileOverlay.field199[var10] = var30;
                TileOverlay.field200[var10] = var31;
            }
            TileOverlay.field196[var10] = (var27 << 9) / var31 + Pix3D.field641;
            TileOverlay.field197[var10] = (var30 << 9) / var31 + Pix3D.field642;
        }
        Pix3D.field640 = 0;
        if (!arg2) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = arg5.field187.length;
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg5.field187[var13];
            int var15 = arg5.field188[var13];
            int var16 = arg5.field189[var13];
            int var17 = TileOverlay.field196[var14];
            int var18 = TileOverlay.field196[var15];
            int var19 = TileOverlay.field196[var16];
            int var20 = TileOverlay.field197[var14];
            int var21 = TileOverlay.field197[var15];
            int var22 = TileOverlay.field197[var16];
            if ((var17 - var18) * (var22 - var21) - (var19 - var18) * (var20 - var21) > 0) {
                Pix3D.field637 = false;
                if (var17 < 0 || var18 < 0 || var19 < 0 || var17 > Pix2D.field630 || var18 > Pix2D.field630 || var19 > Pix2D.field630) {
                    Pix3D.field637 = true;
                }
                if (field327 && this.method108(field328, field329, var20, var21, var22, var17, var18, var19)) {
                    field330 = arg6;
                    field331 = arg7;
                }
                if (arg5.field190 == null || arg5.field190[var13] == -1) {
                    if (arg5.field184[var13] != 12345678) {
                        Pix3D.method188(var20, var21, var22, var17, var18, var19, arg5.field184[var13], arg5.field185[var13], arg5.field186[var13]);
                    }
                } else if (field296) {
                    int var23 = field345[arg5.field190[var13]];
                    Pix3D.method188(var20, var21, var22, var17, var18, var19, this.method107(arg5.field184[var13], true, var23), this.method107(arg5.field185[var13], true, var23), this.method107(arg5.field186[var13], true, var23));
                } else if (arg5.field191) {
                    Pix3D.method192(var20, var21, var22, var17, var18, var19, arg5.field184[var13], arg5.field185[var13], arg5.field186[var13], TileOverlay.field198[0], TileOverlay.field198[1], TileOverlay.field198[3], TileOverlay.field199[0], TileOverlay.field199[1], TileOverlay.field199[3], TileOverlay.field200[0], TileOverlay.field200[1], TileOverlay.field200[3], arg5.field190[var13]);
                } else {
                    Pix3D.method192(var20, var21, var22, var17, var18, var19, arg5.field184[var13], arg5.field185[var13], arg5.field186[var13], TileOverlay.field198[var14], TileOverlay.field198[var15], TileOverlay.field198[var16], TileOverlay.field199[var14], TileOverlay.field199[var15], TileOverlay.field199[var16], TileOverlay.field200[var14], TileOverlay.field200[var15], TileOverlay.field200[var16], arg5.field190[var13]);
                }
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IZI)I")
    public int method107(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return this.field291;
        }
        int var4 = 127 - arg0;
        int var5 = (arg2 & 0x7F) * var4 / 160;
        if (var5 < 2) {
            var5 = 2;
        } else if (var5 > 126) {
            var5 = 126;
        }
        return (arg2 & 0xFF80) + var5;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "s", name = "d", descriptor = "(I)V")
    private void method109(int arg0) {
        int var2 = field333[field307];
        Occlude[] var3 = field334[field307];
        field335 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            Occlude var5 = var3[var4];
            if (var5.field241 == 1) {
                int var6 = var5.field237 + 25 - field313;
                if (var6 >= 0 && var6 <= 50) {
                    int var7 = var5.field239 + 25 - field314;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = var5.field240 + 25 - field314;
                    if (var8 > 50) {
                        var8 = 50;
                    }
                    boolean var9 = false;
                    while (var7 <= var8) {
                        if (field352[var6][var7++]) {
                            var9 = true;
                            break;
                        }
                    }
                    if (var9) {
                        int var10 = field315 - var5.field242;
                        if (var10 > 32) {
                            var5.field248 = 1;
                        } else {
                            if (var10 >= -32) {
                                continue;
                            }
                            var5.field248 = 2;
                            var10 = -var10;
                        }
                        var5.field251 = (var5.field244 - field317 << 8) / var10;
                        var5.field252 = (var5.field245 - field317 << 8) / var10;
                        var5.field253 = (var5.field246 - field316 << 8) / var10;
                        var5.field254 = (var5.field247 - field316 << 8) / var10;
                        field336[field335++] = var5;
                    }
                }
            } else if (var5.field241 == 2) {
                int var11 = var5.field239 + 25 - field314;
                if (var11 >= 0 && var11 <= 50) {
                    int var12 = var5.field237 + 25 - field313;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = var5.field238 + 25 - field313;
                    if (var13 > 50) {
                        var13 = 50;
                    }
                    boolean var14 = false;
                    while (var12 <= var13) {
                        if (field352[var12++][var11]) {
                            var14 = true;
                            break;
                        }
                    }
                    if (var14) {
                        int var15 = field317 - var5.field244;
                        if (var15 > 32) {
                            var5.field248 = 3;
                        } else {
                            if (var15 >= -32) {
                                continue;
                            }
                            var5.field248 = 4;
                            var15 = -var15;
                        }
                        var5.field249 = (var5.field242 - field315 << 8) / var15;
                        var5.field250 = (var5.field243 - field315 << 8) / var15;
                        var5.field253 = (var5.field246 - field316 << 8) / var15;
                        var5.field254 = (var5.field247 - field316 << 8) / var15;
                        field336[field335++] = var5;
                    }
                }
            } else if (var5.field241 == 4) {
                int var16 = var5.field246 - field316;
                if (var16 > 128) {
                    int var17 = var5.field239 + 25 - field314;
                    if (var17 < 0) {
                        var17 = 0;
                    }
                    int var18 = var5.field240 + 25 - field314;
                    if (var18 > 50) {
                        var18 = 50;
                    }
                    if (var17 <= var18) {
                        int var19 = var5.field237 + 25 - field313;
                        if (var19 < 0) {
                            var19 = 0;
                        }
                        int var20 = var5.field238 + 25 - field313;
                        if (var20 > 50) {
                            var20 = 50;
                        }
                        boolean var21 = false;
                        label154: for (int var22 = var19; var22 <= var20; var22++) {
                            for (int var23 = var17; var23 <= var18; var23++) {
                                if (field352[var22][var23]) {
                                    var21 = true;
                                    break label154;
                                }
                            }
                        }
                        if (var21) {
                            var5.field248 = 5;
                            var5.field249 = (var5.field242 - field315 << 8) / var16;
                            var5.field250 = (var5.field243 - field315 << 8) / var16;
                            var5.field251 = (var5.field244 - field317 << 8) / var16;
                            var5.field252 = (var5.field245 - field317 << 8) / var16;
                            field336[field335++] = var5;
                        }
                    }
                }
            }
        }
        if (arg0 != 9) {
            this.field295 = !this.field295;
        }
    }

    @OriginalMember(owner = "s", name = "g", descriptor = "(III)Z")
    private boolean method110(int arg0, int arg1, int arg2) {
        int var4 = this.field305[arg0][arg1][arg2];
        if (-field308 == var4) {
            return false;
        } else if (field308 == var4) {
            return true;
        } else {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            if (this.method114(var5 + 1, this.field300[arg0][arg1][arg2], var6 + 1) && this.method114(var5 + 128 - 1, this.field300[arg0][arg1 + 1][arg2], var6 + 1) && this.method114(var5 + 128 - 1, this.field300[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.method114(var5 + 1, this.field300[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
                this.field305[arg0][arg1][arg2] = field308;
                return true;
            } else {
                this.field305[arg0][arg1][arg2] = -field308;
                return false;
            }
        }
    }

    @OriginalMember(owner = "s", name = "h", descriptor = "(IIII)Z")
    private boolean method111(int arg0, int arg1, int arg2, int arg3) {
        if (!this.method110(arg0, arg1, arg2)) {
            return false;
        }
        int var5 = arg1 << 7;
        int var6 = arg2 << 7;
        int var7 = this.field300[arg0][arg1][arg2] - 1;
        int var8 = var7 - 120;
        int var9 = var7 - 230;
        int var10 = var7 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var5 > field315) {
                    if (!this.method114(var5, var7, var6)) {
                        return false;
                    }
                    if (!this.method114(var5, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method114(var5, var8, var6)) {
                        return false;
                    }
                    if (!this.method114(var5, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method114(var5, var9, var6)) {
                    return false;
                }
                if (!this.method114(var5, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var6 < field317) {
                    if (!this.method114(var5, var7, var6 + 128)) {
                        return false;
                    }
                    if (!this.method114(var5 + 128, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method114(var5, var8, var6 + 128)) {
                        return false;
                    }
                    if (!this.method114(var5 + 128, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method114(var5, var9, var6 + 128)) {
                    return false;
                }
                if (!this.method114(var5 + 128, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var5 < field315) {
                    if (!this.method114(var5 + 128, var7, var6)) {
                        return false;
                    }
                    if (!this.method114(var5 + 128, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method114(var5 + 128, var8, var6)) {
                        return false;
                    }
                    if (!this.method114(var5 + 128, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method114(var5 + 128, var9, var6)) {
                    return false;
                }
                if (!this.method114(var5 + 128, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var6 > field317) {
                    if (!this.method114(var5, var7, var6)) {
                        return false;
                    }
                    if (!this.method114(var5 + 128, var7, var6)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method114(var5, var8, var6)) {
                        return false;
                    }
                    if (!this.method114(var5 + 128, var8, var6)) {
                        return false;
                    }
                }
                if (!this.method114(var5, var9, var6)) {
                    return false;
                }
                if (!this.method114(var5 + 128, var9, var6)) {
                    return false;
                }
                return true;
            }
        }
        if (!this.method114(var5 + 64, var10, var6 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return this.method114(var5, var9, var6 + 128);
        } else if (arg3 == 32) {
            return this.method114(var5 + 128, var9, var6 + 128);
        } else if (arg3 == 64) {
            return this.method114(var5 + 128, var9, var6);
        } else if (arg3 == 128) {
            return this.method114(var5, var9, var6);
        } else {
            System.out.println("Warning unsupported wall type");
            return true;
        }
    }

    @OriginalMember(owner = "s", name = "i", descriptor = "(IIII)Z")
    private boolean method112(int arg0, int arg1, int arg2, int arg3) {
        if (this.method110(arg0, arg1, arg2)) {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            return this.method114(var5 + 1, this.field300[arg0][arg1][arg2] - arg3, var6 + 1) && this.method114(var5 + 128 - 1, this.field300[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method114(var5 + 128 - 1, this.field300[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method114(var5 + 1, this.field300[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "s", name = "b", descriptor = "(IIIIII)Z")
    private boolean method113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var9 = arg1; var9 <= arg2; var9++) {
                for (int var15 = arg3; var15 <= arg4; var15++) {
                    if (this.field305[arg0][var9][var15] == -field308) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = this.field300[arg0][arg1][arg3] - arg5;
            if (!this.method114(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!this.method114(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!this.method114(var10, var12, var14)) {
                return false;
            } else if (this.method114(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (this.method110(arg0, arg1, arg3)) {
            int var7 = arg1 << 7;
            int var8 = arg3 << 7;
            return this.method114(var7 + 1, this.field300[arg0][arg1][arg3] - arg5, var8 + 1) && this.method114(var7 + 128 - 1, this.field300[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.method114(var7 + 128 - 1, this.field300[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.method114(var7 + 1, this.field300[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "s", name = "h", descriptor = "(III)Z")
    private boolean method114(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < field335; var4++) {
            Occlude var5 = field336[var4];
            if (var5.field248 == 1) {
                int var6 = var5.field242 - arg0;
                if (var6 > 0) {
                    int var7 = (var5.field251 * var6 >> 8) + var5.field244;
                    int var8 = (var5.field252 * var6 >> 8) + var5.field245;
                    int var9 = (var5.field253 * var6 >> 8) + var5.field246;
                    int var10 = (var5.field254 * var6 >> 8) + var5.field247;
                    if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field248 == 2) {
                int var11 = arg0 - var5.field242;
                if (var11 > 0) {
                    int var12 = (var5.field251 * var11 >> 8) + var5.field244;
                    int var13 = (var5.field252 * var11 >> 8) + var5.field245;
                    int var14 = (var5.field253 * var11 >> 8) + var5.field246;
                    int var15 = (var5.field254 * var11 >> 8) + var5.field247;
                    if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
                        return true;
                    }
                }
            } else if (var5.field248 == 3) {
                int var16 = var5.field244 - arg2;
                if (var16 > 0) {
                    int var17 = (var5.field249 * var16 >> 8) + var5.field242;
                    int var18 = (var5.field250 * var16 >> 8) + var5.field243;
                    int var19 = (var5.field253 * var16 >> 8) + var5.field246;
                    int var20 = (var5.field254 * var16 >> 8) + var5.field247;
                    if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
                        return true;
                    }
                }
            } else if (var5.field248 == 4) {
                int var21 = arg2 - var5.field244;
                if (var21 > 0) {
                    int var22 = (var5.field249 * var21 >> 8) + var5.field242;
                    int var23 = (var5.field250 * var21 >> 8) + var5.field243;
                    int var24 = (var5.field253 * var21 >> 8) + var5.field246;
                    int var25 = (var5.field254 * var21 >> 8) + var5.field247;
                    if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
                        return true;
                    }
                }
            } else if (var5.field248 == 5) {
                int var26 = arg1 - var5.field246;
                if (var26 > 0) {
                    int var27 = (var5.field249 * var26 >> 8) + var5.field242;
                    int var28 = (var5.field250 * var26 >> 8) + var5.field243;
                    int var29 = (var5.field251 * var26 >> 8) + var5.field244;
                    int var30 = (var5.field252 * var26 >> 8) + var5.field245;
                    if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
