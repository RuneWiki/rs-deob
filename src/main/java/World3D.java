import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("r")
public class World3D {

    @OriginalMember(owner = "r", name = "a", descriptor = "I")
    private int field276 = -664;

    @OriginalMember(owner = "r", name = "b", descriptor = "Z")
    private boolean field277 = false;

    @OriginalMember(owner = "r", name = "d", descriptor = "I")
    private int field279 = 7;

    @OriginalMember(owner = "r", name = "e", descriptor = "I")
    private int field280 = 18931;

    @OriginalMember(owner = "r", name = "f", descriptor = "B")
    private byte field281 = 25;

    @OriginalMember(owner = "r", name = "g", descriptor = "I")
    private int field282 = 612;

    @OriginalMember(owner = "r", name = "p", descriptor = "[Lp;")
    public Location[] field291 = new Location[5000];

    @OriginalMember(owner = "r", name = "fb", descriptor = "[I")
    public int[] field333 = new int[10000];

    @OriginalMember(owner = "r", name = "gb", descriptor = "[I")
    public int[] field334 = new int[10000];

    @OriginalMember(owner = "r", name = "ib", descriptor = "[[I")
    public int[][] field336 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "r", name = "jb", descriptor = "[[I")
    public int[][] field337 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "r", name = "i", descriptor = "I")
    public int field284;

    @OriginalMember(owner = "r", name = "j", descriptor = "I")
    public int field285;

    @OriginalMember(owner = "r", name = "k", descriptor = "I")
    public int field286;

    @OriginalMember(owner = "r", name = "m", descriptor = "[[[Lv;")
    public Tile[][][] field288;

    @OriginalMember(owner = "r", name = "q", descriptor = "[[[I")
    public int[][][] field292;

    @OriginalMember(owner = "r", name = "l", descriptor = "[[[I")
    public int[][][] field287;

    @OriginalMember(owner = "r", name = "h", descriptor = "Z")
    public static boolean field283 = true;

    @OriginalMember(owner = "r", name = "H", descriptor = "[Lp;")
    public static Location[] field309 = new Location[100];

    @OriginalMember(owner = "r", name = "I", descriptor = "[I")
    public static final int[] field310 = new int[] { 53, -53, -53, 53 };

    @OriginalMember(owner = "r", name = "J", descriptor = "[I")
    public static final int[] field311 = new int[] { -53, -53, 53, 53 };

    @OriginalMember(owner = "r", name = "K", descriptor = "[I")
    public static final int[] field312 = new int[] { -45, 45, 45, -45 };

    @OriginalMember(owner = "r", name = "L", descriptor = "[I")
    public static final int[] field313 = new int[] { 45, 45, -45, -45 };

    @OriginalMember(owner = "r", name = "P", descriptor = "I")
    public static int field317 = -1;

    @OriginalMember(owner = "r", name = "Q", descriptor = "I")
    public static int field318 = -1;

    @OriginalMember(owner = "r", name = "R", descriptor = "I")
    public static int field319 = 4;

    @OriginalMember(owner = "r", name = "S", descriptor = "[I")
    public static int[] field320 = new int[field319];

    @OriginalMember(owner = "r", name = "T", descriptor = "[[Lm;")
    public static Occlude[][] field321 = new Occlude[field319][500];

    @OriginalMember(owner = "r", name = "V", descriptor = "[Lm;")
    public static Occlude[] field323 = new Occlude[500];

    @OriginalMember(owner = "r", name = "W", descriptor = "Lob;")
    public static LinkList field324 = new LinkList(18783);

    @OriginalMember(owner = "r", name = "X", descriptor = "[I")
    public static final int[] field325 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "r", name = "Y", descriptor = "[I")
    public static final int[] field326 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "r", name = "Z", descriptor = "[I")
    public static final int[] field327 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "r", name = "ab", descriptor = "[I")
    public static final int[] field328 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "r", name = "bb", descriptor = "[I")
    public static final int[] field329 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "r", name = "cb", descriptor = "[I")
    public static final int[] field330 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "r", name = "db", descriptor = "[I")
    public static final int[] field331 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "r", name = "eb", descriptor = "[I")
    public static final int[] field332 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

    @OriginalMember(owner = "r", name = "kb", descriptor = "[[[[Z")
    public static boolean[][][][] field338 = new boolean[8][32][51][51];

    @OriginalMember(owner = "r", name = "c", descriptor = "I")
    private static int field278;

    @OriginalMember(owner = "r", name = "n", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "r", name = "o", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "r", name = "r", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "r", name = "s", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "r", name = "t", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "r", name = "u", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "r", name = "v", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "r", name = "w", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "r", name = "x", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "r", name = "y", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "r", name = "z", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "r", name = "A", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "r", name = "B", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "r", name = "C", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "r", name = "D", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "r", name = "E", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "r", name = "F", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "r", name = "G", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "r", name = "N", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "r", name = "O", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "r", name = "U", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "r", name = "hb", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "r", name = "mb", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "r", name = "nb", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "r", name = "ob", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "r", name = "pb", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "r", name = "qb", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "r", name = "rb", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "r", name = "M", descriptor = "Z")
    public static boolean field314;

    @OriginalMember(owner = "r", name = "lb", descriptor = "[[Z")
    public static boolean[][] field339;

    @OriginalMember(owner = "r", name = "<init>", descriptor = "(I[[[IIZI)V")
    public World3D(int arg0, int[][][] arg1, int arg2, boolean arg3, int arg4) {
        this.field284 = arg0;
        this.field285 = arg4;
        this.field286 = arg2;
        if (!arg3) {
            throw new NullPointerException();
        }
        this.field288 = new Tile[arg0][arg4][arg2];
        this.field292 = new int[arg0][arg4 + 1][arg2 + 1];
        this.field287 = arg1;
        this.method50((byte) 58);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(I)V")
    public static void method49(int arg0) {
        field309 = null;
        field320 = null;
        field321 = null;
        field324 = null;
        if (arg0 == 3) {
            field338 = null;
            field339 = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(B)V")
    public void method50(byte arg0) {
        for (int var2 = 0; var2 < this.field284; var2++) {
            for (int var7 = 0; var7 < this.field285; var7++) {
                for (int var8 = 0; var8 < this.field286; var8++) {
                    this.field288[var2][var7][var8] = null;
                }
            }
        }
        for (int var3 = 0; var3 < field319; var3++) {
            for (int var6 = 0; var6 < field320[var3]; var6++) {
                field321[var3][var6] = null;
            }
            field320[var3] = 0;
        }
        if (arg0 != 58) {
            this.field277 = !this.field277;
        }
        for (int var4 = 0; var4 < this.field290; var4++) {
            this.field291[var4] = null;
        }
        this.field290 = 0;
        for (int var5 = 0; var5 < field309.length; var5++) {
            field309[var5] = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IB)V")
    public void method51(int arg0, byte arg1) {
        this.field289 = arg0;
        for (int var3 = 0; var3 < this.field285; var3++) {
            for (int var4 = 0; var4 < this.field286; var4++) {
                this.field288[arg0][var3][var4] = new Tile(arg0, var3, var4);
            }
        }
        if (arg1 == -1) {
            ;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IZI)V")
    public void method52(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return;
        }
        Tile var4 = this.field288[0][arg2][arg0];
        for (int var5 = 0; var5 < 3; var5++) {
            Tile var6 = this.field288[var5][arg2][arg0] = this.field288[var5 + 1][arg2][arg0];
            if (var6 != null) {
                var6.field364--;
                for (int var7 = 0; var7 < var6.field374; var7++) {
                    Location var8 = var6.field375[var7];
                    if ((var8.field265 >> 29 & 0x3) == 2 && var8.field259 == arg2 && var8.field261 == arg0) {
                        var8.field253--;
                    }
                }
            }
        }
        if (this.field288[0][arg2][arg0] == null) {
            this.field288[0][arg2][arg0] = new Tile(0, arg2, arg0);
        }
        this.field288[0][arg2][arg0].field386 = var4;
        this.field288[3][arg2][arg0] = null;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIII)V")
    public static void method53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg7 != 0) {
            return;
        }
        Occlude var9 = new Occlude();
        var9.field224 = arg4 / 128;
        var9.field225 = arg3 / 128;
        var9.field226 = arg6 / 128;
        var9.field227 = arg8 / 128;
        var9.field228 = arg0;
        var9.field229 = arg4;
        var9.field230 = arg3;
        var9.field231 = arg6;
        var9.field232 = arg8;
        var9.field233 = arg1;
        var9.field234 = arg5;
        field321[arg2][field320[arg2]++] = var9;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIII)V")
    public void method54(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field288[arg0][arg1][arg2];
        if (var5 != null) {
            this.field288[arg0][arg1][arg2].field378 = arg3;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public void method55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            TileUnderlay var21 = new TileUnderlay(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var22 = arg0; var22 >= 0; var22--) {
                if (this.field288[var22][arg1][arg2] == null) {
                    this.field288[var22][arg1][arg2] = new Tile(var22, arg1, arg2);
                }
            }
            this.field288[arg0][arg1][arg2].field368 = var21;
        } else if (arg3 == 1) {
            TileUnderlay var23 = new TileUnderlay(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var24 = arg0; var24 >= 0; var24--) {
                if (this.field288[var24][arg1][arg2] == null) {
                    this.field288[var24][arg1][arg2] = new Tile(var24, arg1, arg2);
                }
            }
            this.field288[arg0][arg1][arg2].field368 = var23;
        } else {
            TileOverlay var25 = new TileOverlay(arg18, arg11, arg15, arg19, arg2, arg16, arg4, arg10, arg6, -788, arg3, arg1, arg13, arg14, arg5, arg7, arg9, arg12, arg17, arg8);
            for (int var26 = arg0; var26 >= 0; var26--) {
                if (this.field288[var26][arg1][arg2] == null) {
                    this.field288[var26][arg1][arg2] = new Tile(var26, arg1, arg2);
                }
            }
            this.field288[arg0][arg1][arg2].field369 = var25;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIZBILx;)V")
    public void method56(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6, Entity arg7) {
        if (arg7 == null) {
            return;
        }
        GroundDecor var9 = new GroundDecor();
        var9.field196 = arg7;
        var9.field194 = arg0 * 128 + 64;
        var9.field195 = arg3 * 128 + 64;
        var9.field193 = arg6;
        if (!arg4) {
            return;
        }
        var9.field197 = arg2;
        var9.field198 = arg5;
        if (this.field288[arg1][arg0][arg3] == null) {
            this.field288[arg1][arg0][arg3] = new Tile(arg1, arg0, arg3);
        }
        this.field288[arg1][arg0][arg3].field372 = var9;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILx;ILx;ILx;III)V")
    public void method57(int arg0, Entity arg1, int arg2, Entity arg3, int arg4, Entity arg5, int arg6, int arg7, int arg8) {
        GroundObject var10 = new GroundObject();
        var10.field202 = arg3;
        var10.field200 = arg8 * 128 + 64;
        var10.field201 = arg0 * 128 + 64;
        var10.field199 = arg7;
        if (arg6 != -35695) {
            this.field276 = -446;
        }
        var10.field205 = arg2;
        var10.field203 = arg1;
        var10.field204 = arg5;
        int var11 = 0;
        Tile var12 = this.field288[arg4][arg8][arg0];
        if (var12 != null) {
            for (int var13 = 0; var13 < var12.field374; var13++) {
                if (var12.field375[var13].field257 instanceof Model) {
                    int var14 = ((Model) var12.field375[var13].field257).field566;
                    if (var14 > var11) {
                        var11 = var14;
                    }
                }
            }
        }
        var10.field206 = var11;
        if (this.field288[arg4][arg8][arg0] == null) {
            this.field288[arg4][arg8][arg0] = new Tile(arg4, arg8, arg0);
        }
        this.field288[arg4][arg8][arg0].field373 = var10;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IBIIIIILx;Lx;II)V")
    public void method58(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Entity arg7, Entity arg8, int arg9, int arg10) {
        if (arg0 < this.field279 || arg0 > this.field279 || arg7 == null && arg8 == null) {
            return;
        }
        Wall var12 = new Wall();
        var12.field274 = arg10;
        var12.field275 = arg1;
        var12.field268 = arg6 * 128 + 64;
        var12.field269 = arg3 * 128 + 64;
        var12.field267 = arg9;
        var12.field272 = arg7;
        var12.field273 = arg8;
        var12.field270 = arg4;
        var12.field271 = arg2;
        for (int var13 = arg5; var13 >= 0; var13--) {
            if (this.field288[var13][arg6][arg3] == null) {
                this.field288[var13][arg6][arg3] = new Tile(var13, arg6, arg3);
            }
        }
        this.field288[arg5][arg6][arg3].field370 = var12;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(BIIIIIIIIIILx;)V")
    public void method59(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, Entity arg11) {
        if (arg11 == null) {
            return;
        }
        Decor var13 = new Decor();
        var13.field166 = arg9;
        var13.field167 = arg0;
        var13.field161 = arg2 * 128 + arg1 + 64;
        var13.field162 = arg10 * 128 + arg7 + 64;
        var13.field160 = arg8;
        var13.field165 = arg11;
        if (this.field280 != arg3) {
            return;
        }
        var13.field163 = arg5;
        var13.field164 = arg4;
        for (int var14 = arg6; var14 >= 0; var14--) {
            if (this.field288[var14][arg2][arg10] == null) {
                this.field288[var14][arg2][arg10] = new Tile(var14, arg2, arg10);
            }
        }
        this.field288[arg6][arg2][arg10].field371 = var13;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILx;IIBIIIIII)Z")
    public boolean method60(int arg0, Entity arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg9 <= 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        if (arg1 == null) {
            return true;
        } else {
            int var13 = arg2 * 64 + arg10 * 128;
            int var14 = arg5 * 64 + arg6 * 128;
            return this.method63(arg0, arg10, arg6, arg2, arg5, var13, var14, arg7, arg1, arg8, false, arg3, arg4);
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIILx;IIIZ)Z")
    public boolean method61(int arg0, int arg1, int arg2, int arg3, int arg4, Entity arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (arg5 == null) {
            return true;
        }
        int var11 = arg7 - arg0;
        int var12 = arg3 - arg0;
        int var13 = arg0 + arg7;
        int var14 = arg0 + arg3;
        while (arg2 >= 0) {
            for (int var19 = 1; var19 > 0; var19++) {
            }
        }
        if (arg9) {
            if (arg8 > 640 && arg8 < 1408) {
                var14 += 128;
            }
            if (arg8 > 1152 && arg8 < 1920) {
                var13 += 128;
            }
            if (arg8 > 1664 || arg8 < 384) {
                var12 -= 128;
            }
            if (arg8 > 128 && arg8 < 896) {
                var11 -= 128;
            }
        }
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        int var18 = var14 / 128;
        return this.method63(arg1, var15, var16, var17 + 1 - var15, var18 - var16 + 1, arg7, arg3, arg6, arg5, arg8, true, arg4, (byte) 0);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIILx;IIIII)Z")
    public boolean method62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Entity arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        if (arg12 >= 0) {
            throw new NullPointerException();
        } else if (arg7 == null) {
            return true;
        } else {
            return this.method63(arg5, arg3, arg9, arg10 + 1 - arg3, arg2 - arg9 + 1, arg1, arg6, arg0, arg7, arg8, true, arg4, (byte) 0);
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIILx;IZIB)Z")
    private boolean method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, boolean arg10, int arg11, byte arg12) {
        for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
            for (int var21 = arg2; var21 < arg2 + arg4; var21++) {
                if (var14 < 0 || var21 < 0 || var14 >= this.field285 || var21 >= this.field286) {
                    return false;
                }
                Tile var22 = this.field288[arg0][var14][var21];
                if (var22 != null && var22.field374 >= 5) {
                    return false;
                }
            }
        }
        Location var15 = new Location();
        var15.field265 = arg11;
        var15.field266 = arg12;
        var15.field253 = arg0;
        var15.field255 = arg5;
        var15.field256 = arg6;
        var15.field254 = arg7;
        var15.field257 = arg8;
        var15.field258 = arg9;
        var15.field259 = arg1;
        var15.field261 = arg2;
        var15.field260 = arg1 + arg3 - 1;
        var15.field262 = arg2 + arg4 - 1;
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
                    if (this.field288[var19][var16][var17] == null) {
                        this.field288[var19][var16][var17] = new Tile(var19, var16, var17);
                    }
                }
                Tile var20 = this.field288[arg0][var16][var17];
                var20.field375[var20.field374] = var15;
                var20.field376[var20.field374] = var18;
                var20.field377 |= var18;
                var20.field374++;
            }
        }
        if (arg10) {
            this.field291[this.field290++] = var15;
        }
        return true;
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(I)V")
    public void method64(int arg0) {
        for (int var2 = 0; var2 < this.field290; var2++) {
            Location var4 = this.field291[var2];
            this.method65(var4, 0);
            this.field291[var2] = null;
        }
        if (arg0 != 4) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field290 = 0;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lp;I)V")
    private void method65(Location arg0, int arg1) {
        if (arg1 != 0) {
            field278 = -231;
        }
        for (int var3 = arg0.field259; var3 <= arg0.field260; var3++) {
            for (int var4 = arg0.field261; var4 <= arg0.field262; var4++) {
                Tile var5 = this.field288[arg0.field253][var3][var4];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field374; var6++) {
                        if (var5.field375[var6] == arg0) {
                            var5.field374--;
                            for (int var7 = var6; var7 < var5.field374; var7++) {
                                var5.field375[var7] = var5.field375[var7 + 1];
                                var5.field376[var7] = var5.field376[var7 + 1];
                            }
                            var5.field375[var5.field374] = null;
                            break;
                        }
                    }
                    var5.field377 = 0;
                    for (int var8 = 0; var8 < var5.field374; var8++) {
                        var5.field377 |= var5.field376[var8];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIII)V")
    public void method66(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Tile var6 = this.field288[arg3][arg1][arg4];
        if (var6 == null) {
            return;
        }
        Decor var7 = var6.field371;
        while (arg2 >= 0) {
            field278 = 365;
        }
        if (var7 != null) {
            int var8 = arg1 * 128 + 64;
            int var9 = arg4 * 128 + 64;
            var7.field161 = (var7.field161 - var8) * arg0 / 16 + var8;
            var7.field162 = (var7.field162 - var9) * arg0 / 16 + var9;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIBI)V")
    public void method67(int arg0, int arg1, byte arg2, int arg3) {
        Tile var5 = this.field288[arg3][arg0][arg1];
        if (arg2 == 3) {
            boolean var6 = false;
        } else {
            this.field277 = !this.field277;
        }
        if (var5 != null) {
            var5.field370 = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIZI)V")
    public void method68(int arg0, int arg1, boolean arg2, int arg3) {
        Tile var5 = this.field288[arg0][arg1][arg3];
        if (!arg2 && var5 != null) {
            var5.field371 = null;
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIII)V")
    public void method69(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field288[arg2][arg0][arg3];
        if (var5 == null) {
            return;
        }
        for (int var6 = 0; var6 < var5.field374; var6++) {
            Location var8 = var5.field375[var6];
            if ((var8.field265 >> 29 & 0x3) == 2 && var8.field259 == arg0 && var8.field261 == arg3) {
                this.method65(var8, 0);
                return;
            }
        }
        int var7 = 36 / arg1;
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIZI)V")
    public void method70(int arg0, int arg1, boolean arg2, int arg3) {
        Tile var5 = this.field288[arg0][arg3][arg1];
        if (arg2 && var5 != null) {
            var5.field372 = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(III)V")
    public void method71(int arg0, int arg1, int arg2) {
        Tile var4 = this.field288[arg0][arg1][arg2];
        if (var4 != null) {
            var4.field373 = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(BIII)Lq;")
    public Wall method72(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 4) {
            throw new NullPointerException();
        }
        boolean var5 = false;
        Tile var6 = this.field288[arg3][arg2][arg1];
        return var6 == null ? null : var6.field370;
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(IIII)Lh;")
    public Decor method73(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field288[arg1][arg3][arg2];
        if (arg0 != 17461) {
            this.field277 = !this.field277;
        }
        return var5 == null ? null : var5.field371;
    }

    @OriginalMember(owner = "r", name = "d", descriptor = "(IIII)Lp;")
    public Location method74(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field288[arg1][arg0][arg2];
        if (var5 == null) {
            return null;
        }
        for (int var6 = 0; var6 < var5.field374; var6++) {
            Location var7 = var5.field375[var6];
            if ((var7.field265 >> 29 & 0x3) == 2 && var7.field259 == arg0 && var7.field261 == arg2) {
                return var7;
            }
        }
        if (arg3 != 0) {
            this.field277 = !this.field277;
        }
        return null;
    }

    @OriginalMember(owner = "r", name = "e", descriptor = "(IIII)Lj;")
    public GroundDecor method75(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field288[arg3][arg0][arg2];
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        return var5 == null || var5.field372 == null ? null : var5.field372;
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(III)I")
    public int method76(int arg0, int arg1, int arg2) {
        Tile var4 = this.field288[arg0][arg1][arg2];
        return var4 == null || var4.field370 == null ? 0 : var4.field370.field274;
    }

    @OriginalMember(owner = "r", name = "f", descriptor = "(IIII)I")
    public int method77(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 29542) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        Tile var6 = this.field288[arg3][arg0][arg1];
        return var6 == null || var6.field371 == null ? 0 : var6.field371.field166;
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(III)I")
    public int method78(int arg0, int arg1, int arg2) {
        Tile var4 = this.field288[arg0][arg1][arg2];
        if (var4 == null) {
            return 0;
        }
        for (int var5 = 0; var5 < var4.field374; var5++) {
            Location var6 = var4.field375[var5];
            if ((var6.field265 >> 29 & 0x3) == 2 && var6.field259 == arg1 && var6.field261 == arg2) {
                return var6.field265;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "r", name = "d", descriptor = "(III)I")
    public int method79(int arg0, int arg1, int arg2) {
        Tile var4 = this.field288[arg0][arg1][arg2];
        return var4 == null || var4.field372 == null ? 0 : var4.field372.field197;
    }

    @OriginalMember(owner = "r", name = "g", descriptor = "(IIII)I")
    public int method80(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field288[arg0][arg1][arg2];
        if (var5 == null) {
            return -1;
        } else if (var5.field370 != null && var5.field370.field274 == arg3) {
            return var5.field370.field275 & 0xFF;
        } else if (var5.field371 != null && var5.field371.field166 == arg3) {
            return var5.field371.field167 & 0xFF;
        } else if (var5.field372 != null && var5.field372.field197 == arg3) {
            return var5.field372.field198 & 0xFF;
        } else {
            for (int var6 = 0; var6 < var5.field374; var6++) {
                if (var5.field375[var6].field265 == arg3) {
                    return var5.field375[var6].field266 & 0xFF;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIBII)V")
    public void method81(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var7 = (int) Math.sqrt((double) (arg2 * arg2 + arg0 * arg0 + arg5 * arg5));
        int var8 = arg1 * var7 >> 8;
        for (int var9 = 0; var9 < this.field284; var9++) {
            for (int var11 = 0; var11 < this.field285; var11++) {
                for (int var12 = 0; var12 < this.field286; var12++) {
                    Tile var13 = this.field288[var9][var11][var12];
                    if (var13 != null) {
                        Wall var14 = var13.field370;
                        if (var14 != null && var14.field272 != null && var14.field272.field392 != null) {
                            this.method83((Model) var14.field272, var9, var11, false, 1, 1, var12);
                            if (var14.field273 != null && var14.field273.field392 != null) {
                                this.method83((Model) var14.field273, var9, var11, false, 1, 1, var12);
                                this.method84((Model) var14.field272, (Model) var14.field273, 0, 0, 0, false);
                                ((Model) var14.field273).method144(arg4, var8, arg0, arg5, arg2);
                            }
                            ((Model) var14.field272).method144(arg4, var8, arg0, arg5, arg2);
                        }
                        for (int var15 = 0; var15 < var13.field374; var15++) {
                            Location var17 = var13.field375[var15];
                            if (var17 != null && var17.field257 != null && var17.field257.field392 != null) {
                                this.method83((Model) var17.field257, var9, var11, false, var17.field262 + 1 - var17.field261, var17.field260 - var17.field259 + 1, var12);
                                ((Model) var17.field257).method144(arg4, var8, arg0, arg5, arg2);
                            }
                        }
                        GroundDecor var16 = var13.field372;
                        if (var16 != null && var16.field196.field392 != null) {
                            this.method82(-7701, (Model) var16.field196, var12, var11, var9);
                            ((Model) var16.field196).method144(arg4, var8, arg0, arg5, arg2);
                        }
                    }
                }
            }
        }
        if (arg3 != 3) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILeb;III)V")
    private void method82(int arg0, Model arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -7701) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg3 < this.field285) {
            Tile var7 = this.field288[arg4][arg3 + 1][arg2];
            if (var7 != null && var7.field372 != null && var7.field372.field196.field392 != null) {
                this.method84(arg1, (Model) var7.field372.field196, 128, 0, 0, true);
            }
        }
        if (arg2 < this.field285) {
            Tile var8 = this.field288[arg4][arg3][arg2 + 1];
            if (var8 != null && var8.field372 != null && var8.field372.field196.field392 != null) {
                this.method84(arg1, (Model) var8.field372.field196, 0, 0, 128, true);
            }
        }
        if (arg3 < this.field285 && arg2 < this.field286) {
            Tile var9 = this.field288[arg4][arg3 + 1][arg2 + 1];
            if (var9 != null && var9.field372 != null && var9.field372.field196.field392 != null) {
                this.method84(arg1, (Model) var9.field372.field196, 128, 0, 128, true);
            }
        }
        if (arg3 >= this.field285 || arg2 <= 0) {
            return;
        }
        Tile var10 = this.field288[arg4][arg3 + 1][arg2 - 1];
        if (var10 != null && var10.field372 != null && var10.field372.field196.field392 != null) {
            this.method84(arg1, (Model) var10.field372.field196, 128, 0, -128, true);
            return;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Leb;IIZIII)V")
    private void method83(Model arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg3) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        boolean var9 = true;
        int var10 = arg2;
        int var11 = arg2 + arg5;
        int var12 = arg6 - 1;
        int var13 = arg4 + arg6;
        for (int var14 = arg1; var14 <= arg1 + 1; var14++) {
            if (this.field284 != var14) {
                for (int var15 = var10; var15 <= var11; var15++) {
                    if (var15 >= 0 && var15 < this.field285) {
                        for (int var16 = var12; var16 <= var13; var16++) {
                            if (var16 >= 0 && var16 < this.field286 && (!var9 || var15 >= var11 || var16 >= var13 || var16 < arg6 && arg2 != var15)) {
                                Tile var17 = this.field288[var14][var15][var16];
                                if (var17 != null) {
                                    int var18 = (this.field287[var14][var15 + 1][var16] + this.field287[var14][var15][var16] + this.field287[var14][var15][var16 + 1] + this.field287[var14][var15 + 1][var16 + 1]) / 4 - (this.field287[arg1][arg2 + 1][arg6] + this.field287[arg1][arg2][arg6] + this.field287[arg1][arg2][arg6 + 1] + this.field287[arg1][arg2 + 1][arg6 + 1]) / 4;
                                    Wall var19 = var17.field370;
                                    if (var19 != null && var19.field272 != null && var19.field272.field392 != null) {
                                        this.method84(arg0, (Model) var19.field272, (var15 - arg2) * 128 + (1 - arg5) * 64, var18, (1 - arg4) * 64 + (var16 - arg6) * 128, var9);
                                    }
                                    if (var19 != null && var19.field273 != null && var19.field273.field392 != null) {
                                        this.method84(arg0, (Model) var19.field273, (var15 - arg2) * 128 + (1 - arg5) * 64, var18, (1 - arg4) * 64 + (var16 - arg6) * 128, var9);
                                    }
                                    for (int var20 = 0; var20 < var17.field374; var20++) {
                                        Location var21 = var17.field375[var20];
                                        if (var21 != null && var21.field257 != null && var21.field257.field392 != null) {
                                            int var22 = var21.field260 + 1 - var21.field259;
                                            int var23 = var21.field262 + 1 - var21.field261;
                                            this.method84(arg0, (Model) var21.field257, (var21.field259 - arg2) * 128 + (var22 - arg5) * 64, var18, (var21.field261 - arg6) * 128 + (var23 - arg4) * 64, var9);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var10--;
                var9 = false;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Leb;Leb;IIIZ)V")
    private void method84(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field335++;
        int var7 = 0;
        int[] var8 = arg1.field539;
        int var9 = arg1.field538;
        for (int var10 = 0; var10 < arg0.field538; var10++) {
            VertexNormal var13 = arg0.field392[var10];
            VertexNormal var14 = arg0.field572[var10];
            if (var14.field245 != 0) {
                int var15 = arg0.field540[var10] - arg3;
                if (var15 <= arg1.field563) {
                    int var16 = arg0.field539[var10] - arg2;
                    if (var16 >= arg1.field558 && var16 <= arg1.field559) {
                        int var17 = arg0.field541[var10] - arg4;
                        if (var17 >= arg1.field561 && var17 <= arg1.field560) {
                            for (int var18 = 0; var18 < var9; var18++) {
                                VertexNormal var19 = arg1.field392[var18];
                                VertexNormal var20 = arg1.field572[var18];
                                if (var8[var18] == var16 && arg1.field541[var18] == var17 && arg1.field540[var18] == var15 && var20.field245 != 0) {
                                    var13.field242 += var20.field242;
                                    var13.field243 += var20.field243;
                                    var13.field244 += var20.field244;
                                    var13.field245 += var20.field245;
                                    var19.field242 += var14.field242;
                                    var19.field243 += var14.field243;
                                    var19.field244 += var14.field244;
                                    var19.field245 += var14.field245;
                                    var7++;
                                    this.field333[var10] = this.field335;
                                    this.field334[var18] = this.field335;
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
        for (int var11 = 0; var11 < arg0.field542; var11++) {
            if (this.field333[arg0.field543[var11]] == this.field335 && this.field333[arg0.field544[var11]] == this.field335 && this.field333[arg0.field545[var11]] == this.field335) {
                arg0.field549[var11] = -1;
            }
        }
        for (int var12 = 0; var12 < arg1.field542; var12++) {
            if (this.field334[arg1.field543[var12]] == this.field335 && this.field334[arg1.field544[var12]] == this.field335 && this.field334[arg1.field545[var12]] == this.field335) {
                arg1.field549[var12] = -1;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "([IIIIII)V")
    public void method85(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Tile var7 = this.field288[arg3][arg4][arg5];
        if (var7 == null) {
            return;
        }
        TileUnderlay var8 = var7.field368;
        if (var8 != null) {
            int var9 = var8.field252;
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
        TileOverlay var11 = var7.field369;
        if (var11 == null) {
            return;
        }
        int var12 = var11.field179;
        int var13 = var11.field180;
        int var14 = var11.field181;
        int var15 = var11.field182;
        int[] var16 = this.field336[var12];
        int[] var17 = this.field337[var13];
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

    @OriginalMember(owner = "r", name = "a", descriptor = "([IIIIZI)V")
    public static void method86(int[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field342 = 0;
        field343 = 0;
        if (arg4) {
            return;
        }
        field344 = arg3;
        field345 = arg2;
        field340 = arg3 / 2;
        field341 = arg2 / 2;
        boolean[][][][] var6 = new boolean[9][32][53][53];
        for (int var7 = 128; var7 <= 384; var7 += 32) {
            for (int var15 = 0; var15 < 2048; var15 += 64) {
                field305 = Model.field601[var7];
                field306 = Model.field602[var7];
                field307 = Model.field601[var15];
                field308 = Model.field602[var15];
                int var16 = (var7 - 128) / 32;
                int var17 = var15 / 64;
                for (int var18 = -26; var18 <= 26; var18++) {
                    for (int var19 = -26; var19 <= 26; var19++) {
                        int var20 = var18 * 128;
                        int var21 = var19 * 128;
                        boolean var22 = false;
                        for (int var23 = -arg5; var23 <= arg1; var23 += 128) {
                            if (method87(0, arg0[var16] + var23, var20, var21)) {
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
                        field338[var8][var9][var10 + 25][var11 + 25] = var12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "h", descriptor = "(IIII)Z")
    public static boolean method87(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field308 * arg2 + field307 * arg3 >> 16;
        int var5 = field308 * arg3 - field307 * arg2 >> 16;
        int var6 = field306 * var5 + field305 * arg1 >> 16;
        int var7 = field306 * arg1 - field305 * var5 >> 16;
        if (arg0 != 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        if (var6 >= 50 && var6 <= 3500) {
            int var9 = (var4 << 9) / var6 + field340;
            int var10 = (var7 << 9) / var6 + field341;
            return var9 >= field342 && var9 <= field344 && var10 >= field343 && var10 <= field345;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "e", descriptor = "(III)V")
    public void method88(int arg0, int arg1, int arg2) {
        field314 = true;
        field315 = arg0;
        field316 = arg1;
        field317 = -1;
        while (arg2 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field318 = -1;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIII)V")
    public void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= this.field285 * 128) {
            arg0 = this.field285 * 128 - 1;
        }
        if (arg1 < 0) {
            arg1 = 0;
        } else if (arg1 >= this.field286 * 128) {
            arg1 = this.field286 * 128 - 1;
        }
        field295++;
        field305 = Model.field601[arg4];
        field306 = Model.field602[arg4];
        field307 = Model.field601[arg6];
        field308 = Model.field602[arg6];
        if (arg2 >= 0) {
            this.field279 = -167;
        }
        field339 = field338[(arg4 - 128) / 32][arg6 / 64];
        field302 = arg0;
        field303 = arg5;
        field304 = arg1;
        field300 = arg0 / 128;
        field301 = arg1 / 128;
        field294 = arg3;
        field296 = field300 - 25;
        if (field296 < 0) {
            field296 = 0;
        }
        field298 = field301 - 25;
        if (field298 < 0) {
            field298 = 0;
        }
        field297 = field300 + 25;
        if (field297 > this.field285) {
            field297 = this.field285;
        }
        field299 = field301 + 25;
        if (field299 > this.field286) {
            field299 = this.field286;
        }
        this.method95(612);
        field293 = 0;
        for (int var8 = this.field289; var8 < this.field284; var8++) {
            Tile[][] var33 = this.field288[var8];
            for (int var34 = field296; var34 < field297; var34++) {
                for (int var35 = field298; var35 < field299; var35++) {
                    Tile var36 = var33[var34][var35];
                    if (var36 != null) {
                        if (var36.field378 <= arg3 && (field339[var34 + 25 - field300][var35 + 25 - field301] || this.field287[var8][var34][var35] - arg5 >= 2000)) {
                            var36.field379 = true;
                            var36.field380 = true;
                            if (var36.field374 > 0) {
                                var36.field381 = true;
                            } else {
                                var36.field381 = false;
                            }
                            field293++;
                        } else {
                            var36.field379 = false;
                            var36.field380 = false;
                            var36.field382 = 0;
                        }
                    }
                }
            }
        }
        for (int var9 = this.field289; var9 < this.field284; var9++) {
            Tile[][] var22 = this.field288[var9];
            for (int var23 = -25; var23 <= 0; var23++) {
                int var24 = field300 + var23;
                int var25 = field300 - var23;
                if (var24 >= field296 || var25 < field297) {
                    for (int var26 = -25; var26 <= 0; var26++) {
                        int var27 = field301 + var26;
                        int var28 = field301 - var26;
                        if (var24 >= field296) {
                            if (var27 >= field298) {
                                Tile var29 = var22[var24][var27];
                                if (var29 != null && var29.field379) {
                                    this.method90(var29, true);
                                }
                            }
                            if (var28 < field299) {
                                Tile var30 = var22[var24][var28];
                                if (var30 != null && var30.field379) {
                                    this.method90(var30, true);
                                }
                            }
                        }
                        if (var25 < field297) {
                            if (var27 >= field298) {
                                Tile var31 = var22[var25][var27];
                                if (var31 != null && var31.field379) {
                                    this.method90(var31, true);
                                }
                            }
                            if (var28 < field299) {
                                Tile var32 = var22[var25][var28];
                                if (var32 != null && var32.field379) {
                                    this.method90(var32, true);
                                }
                            }
                        }
                        if (field293 == 0) {
                            field314 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var10 = this.field289; var10 < this.field284; var10++) {
            Tile[][] var11 = this.field288[var10];
            for (int var12 = -25; var12 <= 0; var12++) {
                int var13 = field300 + var12;
                int var14 = field300 - var12;
                if (var13 >= field296 || var14 < field297) {
                    for (int var15 = -25; var15 <= 0; var15++) {
                        int var16 = field301 + var15;
                        int var17 = field301 - var15;
                        if (var13 >= field296) {
                            if (var16 >= field298) {
                                Tile var18 = var11[var13][var16];
                                if (var18 != null && var18.field379) {
                                    this.method90(var18, false);
                                }
                            }
                            if (var17 < field299) {
                                Tile var19 = var11[var13][var17];
                                if (var19 != null && var19.field379) {
                                    this.method90(var19, false);
                                }
                            }
                        }
                        if (var14 < field297) {
                            if (var16 >= field298) {
                                Tile var20 = var11[var14][var16];
                                if (var20 != null && var20.field379) {
                                    this.method90(var20, false);
                                }
                            }
                            if (var17 < field299) {
                                Tile var21 = var11[var14][var17];
                                if (var21 != null && var21.field379) {
                                    this.method90(var21, false);
                                }
                            }
                        }
                        if (field293 == 0) {
                            field314 = false;
                            return;
                        }
                    }
                }
            }
        }
        field314 = false;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lv;Z)V")
    public void method90(Tile arg0, boolean arg1) {
        field324.method245(arg0);
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
                                                var3 = (Tile) field324.method247();
                                                if (var3 == null) {
                                                    return;
                                                }
                                            } while (!var3.field380);
                                            var4 = var3.field365;
                                            var5 = var3.field366;
                                            var6 = var3.field364;
                                            var7 = var3.field367;
                                            var8 = this.field288[var6];
                                            if (!var3.field379) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var6 > 0) {
                                                    Tile var9 = this.field288[var6 - 1][var4][var5];
                                                    if (var9 != null && var9.field380) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= field300 && var4 > field296) {
                                                    Tile var10 = var8[var4 - 1][var5];
                                                    if (var10 != null && var10.field380 && (var10.field379 || (var3.field377 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= field300 && var4 < field297 - 1) {
                                                    Tile var11 = var8[var4 + 1][var5];
                                                    if (var11 != null && var11.field380 && (var11.field379 || (var3.field377 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 <= field301 && var5 > field298) {
                                                    Tile var12 = var8[var4][var5 - 1];
                                                    if (var12 != null && var12.field380 && (var12.field379 || (var3.field377 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 >= field301 && var5 < field299 - 1) {
                                                    Tile var13 = var8[var4][var5 + 1];
                                                    if (var13 != null && var13.field380 && (var13.field379 || (var3.field377 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var3.field379 = false;
                                            if (var3.field386 != null) {
                                                Tile var14 = var3.field386;
                                                if (var14.field368 == null) {
                                                    if (var14.field369 != null && !this.method96(0, var4, var5)) {
                                                        this.method92(field305, var5, var14.field369, field306, (byte) 25, field308, field307, var4);
                                                    }
                                                } else if (!this.method96(0, var4, var5)) {
                                                    this.method91(var14.field368, 0, field305, field306, field307, field308, var4, var5);
                                                }
                                                Wall var15 = var14.field370;
                                                if (var15 != null) {
                                                    var15.field272.method108(0, field305, field306, field307, field308, var15.field268 - field302, var15.field267 - field303, var15.field269 - field304, var15.field274);
                                                }
                                                for (int var16 = 0; var16 < var14.field374; var16++) {
                                                    Location var17 = var14.field375[var16];
                                                    if (var17 != null) {
                                                        var17.field257.method108(var17.field258, field305, field306, field307, field308, var17.field255 - field302, var17.field254 - field303, var17.field256 - field304, var17.field265);
                                                    }
                                                }
                                            }
                                            boolean var18 = false;
                                            if (var3.field368 == null) {
                                                if (var3.field369 != null && !this.method96(var7, var4, var5)) {
                                                    var18 = true;
                                                    this.method92(field305, var5, var3.field369, field306, (byte) 25, field308, field307, var4);
                                                }
                                            } else if (!this.method96(var7, var4, var5)) {
                                                var18 = true;
                                                this.method91(var3.field368, var7, field305, field306, field307, field308, var4, var5);
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            Wall var21 = var3.field370;
                                            Decor var22 = var3.field371;
                                            if (var21 != null || var22 != null) {
                                                if (field300 == var4) {
                                                    var19++;
                                                } else if (field300 < var4) {
                                                    var19 += 2;
                                                }
                                                if (field301 == var5) {
                                                    var19 += 3;
                                                } else if (field301 > var5) {
                                                    var19 += 6;
                                                }
                                                var20 = field325[var19];
                                                var3.field385 = field327[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field270 & field326[var19]) == 0) {
                                                    var3.field382 = 0;
                                                } else if (var21.field270 == 16) {
                                                    var3.field382 = 3;
                                                    var3.field383 = field328[var19];
                                                    var3.field384 = 3 - var3.field383;
                                                } else if (var21.field270 == 32) {
                                                    var3.field382 = 6;
                                                    var3.field383 = field329[var19];
                                                    var3.field384 = 6 - var3.field383;
                                                } else if (var21.field270 == 64) {
                                                    var3.field382 = 12;
                                                    var3.field383 = field330[var19];
                                                    var3.field384 = 12 - var3.field383;
                                                } else {
                                                    var3.field382 = 9;
                                                    var3.field383 = field331[var19];
                                                    var3.field384 = 9 - var3.field383;
                                                }
                                                if ((var21.field270 & var20) != 0 && !this.method97(var7, var4, var5, var21.field270)) {
                                                    var21.field272.method108(0, field305, field306, field307, field308, var21.field268 - field302, var21.field267 - field303, var21.field269 - field304, var21.field274);
                                                }
                                                if ((var21.field271 & var20) != 0 && !this.method97(var7, var4, var5, var21.field271)) {
                                                    var21.field273.method108(0, field305, field306, field307, field308, var21.field268 - field302, var21.field267 - field303, var21.field269 - field304, var21.field274);
                                                }
                                            }
                                            if (var22 != null && !this.method98(var7, var4, var5, var22.field165.field393)) {
                                                if ((var22.field163 & var20) != 0) {
                                                    var22.field165.method108(var22.field164, field305, field306, field307, field308, var22.field161 - field302, var22.field160 - field303, var22.field162 - field304, var22.field166);
                                                } else if ((var22.field163 & 0x300) != 0) {
                                                    int var23 = var22.field161 - field302;
                                                    int var24 = var22.field160 - field303;
                                                    int var25 = var22.field162 - field304;
                                                    int var26 = var22.field164;
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
                                                    if ((var22.field163 & 0x100) != 0 && var28 < var27) {
                                                        int var29 = field310[var26] + var23;
                                                        int var30 = field311[var26] + var25;
                                                        var22.field165.method108(var26 * 512 + 256, field305, field306, field307, field308, var29, var24, var30, var22.field166);
                                                    }
                                                    if ((var22.field163 & 0x200) != 0 && var28 > var27) {
                                                        int var31 = field312[var26] + var23;
                                                        int var32 = field313[var26] + var25;
                                                        var22.field165.method108(var26 * 512 + 1280 & 0x7FF, field305, field306, field307, field308, var31, var24, var32, var22.field166);
                                                    }
                                                }
                                            }
                                            if (var18) {
                                                GroundDecor var33 = var3.field372;
                                                if (var33 != null) {
                                                    var33.field196.method108(0, field305, field306, field307, field308, var33.field194 - field302, var33.field193 - field303, var33.field195 - field304, var33.field197);
                                                }
                                                GroundObject var34 = var3.field373;
                                                if (var34 != null && var34.field206 == 0) {
                                                    if (var34.field203 != null) {
                                                        var34.field203.method108(0, field305, field306, field307, field308, var34.field200 - field302, var34.field199 - field303, var34.field201 - field304, var34.field205);
                                                    }
                                                    if (var34.field204 != null) {
                                                        var34.field204.method108(0, field305, field306, field307, field308, var34.field200 - field302, var34.field199 - field303, var34.field201 - field304, var34.field205);
                                                    }
                                                    if (var34.field202 != null) {
                                                        var34.field202.method108(0, field305, field306, field307, field308, var34.field200 - field302, var34.field199 - field303, var34.field201 - field304, var34.field205);
                                                    }
                                                }
                                            }
                                            int var35 = var3.field377;
                                            if (var35 != 0) {
                                                if (var4 < field300 && (var35 & 0x4) != 0) {
                                                    Tile var36 = var8[var4 + 1][var5];
                                                    if (var36 != null && var36.field380) {
                                                        field324.method245(var36);
                                                    }
                                                }
                                                if (var5 < field301 && (var35 & 0x2) != 0) {
                                                    Tile var37 = var8[var4][var5 + 1];
                                                    if (var37 != null && var37.field380) {
                                                        field324.method245(var37);
                                                    }
                                                }
                                                if (var4 > field300 && (var35 & 0x1) != 0) {
                                                    Tile var38 = var8[var4 - 1][var5];
                                                    if (var38 != null && var38.field380) {
                                                        field324.method245(var38);
                                                    }
                                                }
                                                if (var5 > field301 && (var35 & 0x8) != 0) {
                                                    Tile var39 = var8[var4][var5 - 1];
                                                    if (var39 != null && var39.field380) {
                                                        field324.method245(var39);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var3.field382 != 0) {
                                            boolean var40 = true;
                                            for (int var41 = 0; var41 < var3.field374; var41++) {
                                                if (field295 != var3.field375[var41].field264 && (var3.field376[var41] & var3.field382) == var3.field383) {
                                                    var40 = false;
                                                    break;
                                                }
                                            }
                                            if (var40) {
                                                Wall var42 = var3.field370;
                                                if (!this.method97(var7, var4, var5, var42.field270)) {
                                                    var42.field272.method108(0, field305, field306, field307, field308, var42.field268 - field302, var42.field267 - field303, var42.field269 - field304, var42.field274);
                                                }
                                                var3.field382 = 0;
                                            }
                                        }
                                        if (!var3.field381) {
                                            break;
                                        }
                                        try {
                                            int var43 = var3.field374;
                                            var3.field381 = false;
                                            int var44 = 0;
                                            label559: for (int var45 = 0; var45 < var43; var45++) {
                                                Location var46 = var3.field375[var45];
                                                if (field295 != var46.field264) {
                                                    for (int var47 = var46.field259; var47 <= var46.field260; var47++) {
                                                        for (int var48 = var46.field261; var48 <= var46.field262; var48++) {
                                                            Tile var49 = var8[var47][var48];
                                                            if (var49.field379) {
                                                                var3.field381 = true;
                                                                continue label559;
                                                            }
                                                            if (var49.field382 != 0) {
                                                                int var50 = 0;
                                                                if (var47 > var46.field259) {
                                                                    var50++;
                                                                }
                                                                if (var47 < var46.field260) {
                                                                    var50 += 4;
                                                                }
                                                                if (var48 > var46.field261) {
                                                                    var50 += 8;
                                                                }
                                                                if (var48 < var46.field262) {
                                                                    var50 += 2;
                                                                }
                                                                if ((var50 & var49.field382) == var3.field384) {
                                                                    var3.field381 = true;
                                                                    continue label559;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    field309[var44++] = var46;
                                                    int var51 = field300 - var46.field259;
                                                    int var52 = var46.field260 - field300;
                                                    if (var52 > var51) {
                                                        var51 = var52;
                                                    }
                                                    int var53 = field301 - var46.field261;
                                                    int var54 = var46.field262 - field301;
                                                    if (var54 > var53) {
                                                        var46.field263 = var51 + var54;
                                                    } else {
                                                        var46.field263 = var51 + var53;
                                                    }
                                                }
                                            }
                                            while (var44 > 0) {
                                                int var55 = -50;
                                                int var56 = -1;
                                                for (int var57 = 0; var57 < var44; var57++) {
                                                    Location var58 = field309[var57];
                                                    if (field295 != var58.field264) {
                                                        if (var58.field263 > var55) {
                                                            var55 = var58.field263;
                                                            var56 = var57;
                                                        } else if (var58.field263 == var55) {
                                                            int var59 = var58.field255 - field302;
                                                            int var60 = var58.field256 - field304;
                                                            int var61 = field309[var56].field255 - field302;
                                                            int var62 = field309[var56].field256 - field304;
                                                            if (var59 * var59 + var60 * var60 > var61 * var61 + var62 * var62) {
                                                                var56 = var57;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var56 == -1) {
                                                    break;
                                                }
                                                Location var63 = field309[var56];
                                                var63.field264 = field295;
                                                if (!this.method99(var7, var63.field259, var63.field260, var63.field261, var63.field262, var63.field257.field393)) {
                                                    var63.field257.method108(var63.field258, field305, field306, field307, field308, var63.field255 - field302, var63.field254 - field303, var63.field256 - field304, var63.field265);
                                                }
                                                for (int var64 = var63.field259; var64 <= var63.field260; var64++) {
                                                    for (int var65 = var63.field261; var65 <= var63.field262; var65++) {
                                                        Tile var66 = var8[var64][var65];
                                                        if (var66.field382 != 0) {
                                                            field324.method245(var66);
                                                        } else if ((var4 != var64 || var5 != var65) && var66.field380) {
                                                            field324.method245(var66);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var3.field381) {
                                                break;
                                            }
                                        } catch (Exception var89) {
                                            var3.field381 = false;
                                            break;
                                        }
                                    }
                                } while (!var3.field380);
                            } while (var3.field382 != 0);
                            if (var4 > field300 || var4 <= field296) {
                                break;
                            }
                            var67 = var8[var4 - 1][var5];
                        } while (var67 != null && var67.field380);
                        if (var4 < field300 || var4 >= field297 - 1) {
                            break;
                        }
                        var68 = var8[var4 + 1][var5];
                    } while (var68 != null && var68.field380);
                    if (var5 > field301 || var5 <= field298) {
                        break;
                    }
                    var69 = var8[var4][var5 - 1];
                } while (var69 != null && var69.field380);
                if (var5 < field301 || var5 >= field299 - 1) {
                    break;
                }
                var70 = var8[var4][var5 + 1];
            } while (var70 != null && var70.field380);
            var3.field380 = false;
            field293--;
            GroundObject var71 = var3.field373;
            if (var71 != null && var71.field206 != 0) {
                if (var71.field203 != null) {
                    var71.field203.method108(0, field305, field306, field307, field308, var71.field200 - field302, var71.field199 - field303 - var71.field206, var71.field201 - field304, var71.field205);
                }
                if (var71.field204 != null) {
                    var71.field204.method108(0, field305, field306, field307, field308, var71.field200 - field302, var71.field199 - field303 - var71.field206, var71.field201 - field304, var71.field205);
                }
                if (var71.field202 != null) {
                    var71.field202.method108(0, field305, field306, field307, field308, var71.field200 - field302, var71.field199 - field303 - var71.field206, var71.field201 - field304, var71.field205);
                }
            }
            if (var3.field385 != 0) {
                Decor var72 = var3.field371;
                if (var72 != null && !this.method98(var7, var4, var5, var72.field165.field393)) {
                    if ((var72.field163 & var3.field385) != 0) {
                        var72.field165.method108(var72.field164, field305, field306, field307, field308, var72.field161 - field302, var72.field160 - field303, var72.field162 - field304, var72.field166);
                    } else if ((var72.field163 & 0x300) != 0) {
                        int var73 = var72.field161 - field302;
                        int var74 = var72.field160 - field303;
                        int var75 = var72.field162 - field304;
                        int var76 = var72.field164;
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
                        if ((var72.field163 & 0x100) != 0 && var78 >= var77) {
                            int var79 = field310[var76] + var73;
                            int var80 = field311[var76] + var75;
                            var72.field165.method108(var76 * 512 + 256, field305, field306, field307, field308, var79, var74, var80, var72.field166);
                        }
                        if ((var72.field163 & 0x200) != 0 && var78 <= var77) {
                            int var81 = field312[var76] + var73;
                            int var82 = field313[var76] + var75;
                            var72.field165.method108(var76 * 512 + 1280 & 0x7FF, field305, field306, field307, field308, var81, var74, var82, var72.field166);
                        }
                    }
                }
                Wall var83 = var3.field370;
                if (var83 != null) {
                    if ((var83.field271 & var3.field385) != 0 && !this.method97(var7, var4, var5, var83.field271)) {
                        var83.field273.method108(0, field305, field306, field307, field308, var83.field268 - field302, var83.field267 - field303, var83.field269 - field304, var83.field274);
                    }
                    if ((var83.field270 & var3.field385) != 0 && !this.method97(var7, var4, var5, var83.field270)) {
                        var83.field272.method108(0, field305, field306, field307, field308, var83.field268 - field302, var83.field267 - field303, var83.field269 - field304, var83.field274);
                    }
                }
            }
            if (var6 < this.field284 - 1) {
                Tile var84 = this.field288[var6 + 1][var4][var5];
                if (var84 != null && var84.field380) {
                    field324.method245(var84);
                }
            }
            if (var4 < field300) {
                Tile var85 = var8[var4 + 1][var5];
                if (var85 != null && var85.field380) {
                    field324.method245(var85);
                }
            }
            if (var5 < field301) {
                Tile var86 = var8[var4][var5 + 1];
                if (var86 != null && var86.field380) {
                    field324.method245(var86);
                }
            }
            if (var4 > field300) {
                Tile var87 = var8[var4 - 1][var5];
                if (var87 != null && var87.field380) {
                    field324.method245(var87);
                }
            }
            if (var5 > field301) {
                Tile var88 = var8[var4][var5 - 1];
                if (var88 != null && var88.field380) {
                    field324.method245(var88);
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lo;IIIIIII)V")
    public void method91(TileUnderlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9;
        int var10 = var9 = (arg6 << 7) - field302;
        int var11;
        int var12 = var11 = (arg7 << 7) - field304;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = this.field287[arg1][arg6][arg7] - field303;
        int var18 = this.field287[arg1][arg6 + 1][arg7] - field303;
        int var19 = this.field287[arg1][arg6 + 1][arg7 + 1] - field303;
        int var20 = this.field287[arg1][arg6][arg7 + 1] - field303;
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
        int var45 = (var21 << 9) / var25 + Pix3D.field638;
        int var46 = (var24 << 9) / var25 + Pix3D.field639;
        int var47 = (var27 << 9) / var31 + Pix3D.field638;
        int var48 = (var30 << 9) / var31 + Pix3D.field639;
        int var49 = (var33 << 9) / var37 + Pix3D.field638;
        int var50 = (var36 << 9) / var37 + Pix3D.field639;
        int var51 = (var39 << 9) / var43 + Pix3D.field638;
        int var52 = (var42 << 9) / var43 + Pix3D.field639;
        Pix3D.field637 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            Pix3D.field634 = false;
            if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > Pix2D.field627 || var51 > Pix2D.field627 || var47 > Pix2D.field627) {
                Pix3D.field634 = true;
            }
            if (field314 && this.method94(field315, field316, var50, var52, var48, var49, var51, var47)) {
                field317 = arg6;
                field318 = arg7;
            }
            if (arg0.field250 == -1) {
                if (arg0.field248 != 12345678) {
                    Pix3D.method175(var50, var52, var48, var49, var51, var47, arg0.field248, arg0.field249, arg0.field247);
                }
            } else if (field283) {
                int var53 = field332[arg0.field250];
                Pix3D.method175(var50, var52, var48, var49, var51, var47, this.method93(var53, arg0.field248, 0), this.method93(var53, arg0.field249, 0), this.method93(var53, arg0.field247, 0));
            } else if (arg0.field251) {
                Pix3D.method179(var50, var52, var48, var49, var51, var47, arg0.field248, arg0.field249, arg0.field247, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field250);
            } else {
                Pix3D.method179(var50, var52, var48, var49, var51, var47, arg0.field248, arg0.field249, arg0.field247, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field250);
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        Pix3D.field634 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Pix2D.field627 || var47 > Pix2D.field627 || var51 > Pix2D.field627) {
            Pix3D.field634 = true;
        }
        if (field314 && this.method94(field315, field316, var46, var48, var52, var45, var47, var51)) {
            field317 = arg6;
            field318 = arg7;
        }
        if (arg0.field250 != -1) {
            if (!field283) {
                Pix3D.method179(var46, var48, var52, var45, var47, var51, arg0.field246, arg0.field247, arg0.field249, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field250);
                return;
            }
            int var54 = field332[arg0.field250];
            Pix3D.method175(var46, var48, var52, var45, var47, var51, this.method93(var54, arg0.field246, 0), this.method93(var54, arg0.field247, 0), this.method93(var54, arg0.field249, 0));
        } else if (arg0.field246 != 12345678) {
            Pix3D.method175(var46, var48, var52, var45, var47, var51, arg0.field246, arg0.field247, arg0.field249);
            return;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IILi;IBIII)V")
    public void method92(int arg0, int arg1, TileOverlay arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        int var9 = arg2.field168.length;
        if (this.field281 != arg4) {
            this.field277 = !this.field277;
        }
        for (int var10 = 0; var10 < var9; var10++) {
            int var23 = arg2.field168[var10] - field302;
            int var24 = arg2.field169[var10] - field303;
            int var25 = arg2.field170[var10] - field304;
            int var26 = arg5 * var23 + arg6 * var25 >> 16;
            int var27 = arg5 * var25 - arg6 * var23 >> 16;
            int var29 = arg3 * var24 - arg0 * var27 >> 16;
            int var30 = arg0 * var24 + arg3 * var27 >> 16;
            if (var30 < 50) {
                return;
            }
            if (arg2.field177 != null) {
                TileOverlay.field185[var10] = var26;
                TileOverlay.field186[var10] = var29;
                TileOverlay.field187[var10] = var30;
            }
            TileOverlay.field183[var10] = (var26 << 9) / var30 + Pix3D.field638;
            TileOverlay.field184[var10] = (var29 << 9) / var30 + Pix3D.field639;
        }
        Pix3D.field637 = 0;
        int var11 = arg2.field174.length;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = arg2.field174[var12];
            int var14 = arg2.field175[var12];
            int var15 = arg2.field176[var12];
            int var16 = TileOverlay.field183[var13];
            int var17 = TileOverlay.field183[var14];
            int var18 = TileOverlay.field183[var15];
            int var19 = TileOverlay.field184[var13];
            int var20 = TileOverlay.field184[var14];
            int var21 = TileOverlay.field184[var15];
            if ((var16 - var17) * (var21 - var20) - (var18 - var17) * (var19 - var20) > 0) {
                Pix3D.field634 = false;
                if (var16 < 0 || var17 < 0 || var18 < 0 || var16 > Pix2D.field627 || var17 > Pix2D.field627 || var18 > Pix2D.field627) {
                    Pix3D.field634 = true;
                }
                if (field314 && this.method94(field315, field316, var19, var20, var21, var16, var17, var18)) {
                    field317 = arg7;
                    field318 = arg1;
                }
                if (arg2.field177 == null || arg2.field177[var12] == -1) {
                    if (arg2.field171[var12] != 12345678) {
                        Pix3D.method175(var19, var20, var21, var16, var17, var18, arg2.field171[var12], arg2.field172[var12], arg2.field173[var12]);
                    }
                } else if (field283) {
                    int var22 = field332[arg2.field177[var12]];
                    Pix3D.method175(var19, var20, var21, var16, var17, var18, this.method93(var22, arg2.field171[var12], 0), this.method93(var22, arg2.field172[var12], 0), this.method93(var22, arg2.field173[var12], 0));
                } else if (arg2.field178) {
                    Pix3D.method179(var19, var20, var21, var16, var17, var18, arg2.field171[var12], arg2.field172[var12], arg2.field173[var12], TileOverlay.field185[0], TileOverlay.field185[1], TileOverlay.field185[3], TileOverlay.field186[0], TileOverlay.field186[1], TileOverlay.field186[3], TileOverlay.field187[0], TileOverlay.field187[1], TileOverlay.field187[3], arg2.field177[var12]);
                } else {
                    Pix3D.method179(var19, var20, var21, var16, var17, var18, arg2.field171[var12], arg2.field172[var12], arg2.field173[var12], TileOverlay.field185[var13], TileOverlay.field185[var14], TileOverlay.field185[var15], TileOverlay.field186[var13], TileOverlay.field186[var14], TileOverlay.field186[var15], TileOverlay.field187[var13], TileOverlay.field187[var14], TileOverlay.field187[var15], arg2.field177[var12]);
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "f", descriptor = "(III)I")
    public int method93(int arg0, int arg1, int arg2) {
        int var4 = 127 - arg1;
        int var5 = (arg0 & 0x7F) * var4 / 160;
        if (arg2 != 0) {
            this.field279 = -391;
        }
        if (var5 < 2) {
            var5 = 2;
        } else if (var5 > 126) {
            var5 = 126;
        }
        return (arg0 & 0xFF80) + var5;
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

    @OriginalMember(owner = "r", name = "c", descriptor = "(I)V")
    private void method95(int arg0) {
        int var2 = field320[field294];
        Occlude[] var3 = field321[field294];
        field322 = 0;
        int var4 = 89 / arg0;
        for (int var5 = 0; var5 < var2; var5++) {
            Occlude var6 = var3[var5];
            if (var6.field228 == 1) {
                int var7 = var6.field224 + 25 - field300;
                if (var7 >= 0 && var7 <= 50) {
                    int var8 = var6.field226 + 25 - field301;
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    int var9 = var6.field227 + 25 - field301;
                    if (var9 > 50) {
                        var9 = 50;
                    }
                    boolean var10 = false;
                    while (var8 <= var9) {
                        if (field339[var7][var8++]) {
                            var10 = true;
                            break;
                        }
                    }
                    if (var10) {
                        int var11 = field302 - var6.field229;
                        if (var11 > 32) {
                            var6.field235 = 1;
                        } else {
                            if (var11 >= -32) {
                                continue;
                            }
                            var6.field235 = 2;
                            var11 = -var11;
                        }
                        var6.field238 = (var6.field231 - field304 << 8) / var11;
                        var6.field239 = (var6.field232 - field304 << 8) / var11;
                        var6.field240 = (var6.field233 - field303 << 8) / var11;
                        var6.field241 = (var6.field234 - field303 << 8) / var11;
                        field323[field322++] = var6;
                    }
                }
            } else if (var6.field228 == 2) {
                int var12 = var6.field226 + 25 - field301;
                if (var12 >= 0 && var12 <= 50) {
                    int var13 = var6.field224 + 25 - field300;
                    if (var13 < 0) {
                        var13 = 0;
                    }
                    int var14 = var6.field225 + 25 - field300;
                    if (var14 > 50) {
                        var14 = 50;
                    }
                    boolean var15 = false;
                    while (var13 <= var14) {
                        if (field339[var13++][var12]) {
                            var15 = true;
                            break;
                        }
                    }
                    if (var15) {
                        int var16 = field304 - var6.field231;
                        if (var16 > 32) {
                            var6.field235 = 3;
                        } else {
                            if (var16 >= -32) {
                                continue;
                            }
                            var6.field235 = 4;
                            var16 = -var16;
                        }
                        var6.field236 = (var6.field229 - field302 << 8) / var16;
                        var6.field237 = (var6.field230 - field302 << 8) / var16;
                        var6.field240 = (var6.field233 - field303 << 8) / var16;
                        var6.field241 = (var6.field234 - field303 << 8) / var16;
                        field323[field322++] = var6;
                    }
                }
            } else if (var6.field228 == 4) {
                int var17 = var6.field233 - field303;
                if (var17 > 128) {
                    int var18 = var6.field226 + 25 - field301;
                    if (var18 < 0) {
                        var18 = 0;
                    }
                    int var19 = var6.field227 + 25 - field301;
                    if (var19 > 50) {
                        var19 = 50;
                    }
                    if (var18 <= var19) {
                        int var20 = var6.field224 + 25 - field300;
                        if (var20 < 0) {
                            var20 = 0;
                        }
                        int var21 = var6.field225 + 25 - field300;
                        if (var21 > 50) {
                            var21 = 50;
                        }
                        boolean var22 = false;
                        label145: for (int var23 = var20; var23 <= var21; var23++) {
                            for (int var24 = var18; var24 <= var19; var24++) {
                                if (field339[var23][var24]) {
                                    var22 = true;
                                    break label145;
                                }
                            }
                        }
                        if (var22) {
                            var6.field235 = 5;
                            var6.field236 = (var6.field229 - field302 << 8) / var17;
                            var6.field237 = (var6.field230 - field302 << 8) / var17;
                            var6.field238 = (var6.field231 - field304 << 8) / var17;
                            var6.field239 = (var6.field232 - field304 << 8) / var17;
                            field323[field322++] = var6;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "g", descriptor = "(III)Z")
    private boolean method96(int arg0, int arg1, int arg2) {
        int var4 = this.field292[arg0][arg1][arg2];
        if (-field295 == var4) {
            return false;
        } else if (field295 == var4) {
            return true;
        } else {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            if (this.method100(var5 + 1, this.field287[arg0][arg1][arg2], var6 + 1) && this.method100(var5 + 128 - 1, this.field287[arg0][arg1 + 1][arg2], var6 + 1) && this.method100(var5 + 128 - 1, this.field287[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.method100(var5 + 1, this.field287[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
                this.field292[arg0][arg1][arg2] = field295;
                return true;
            } else {
                this.field292[arg0][arg1][arg2] = -field295;
                return false;
            }
        }
    }

    @OriginalMember(owner = "r", name = "i", descriptor = "(IIII)Z")
    private boolean method97(int arg0, int arg1, int arg2, int arg3) {
        if (!this.method96(arg0, arg1, arg2)) {
            return false;
        }
        int var5 = arg1 << 7;
        int var6 = arg2 << 7;
        int var7 = this.field287[arg0][arg1][arg2] - 1;
        int var8 = var7 - 120;
        int var9 = var7 - 230;
        int var10 = var7 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var5 > field302) {
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
                if (var6 < field304) {
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
                if (var5 < field302) {
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
                if (var6 > field304) {
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

    @OriginalMember(owner = "r", name = "j", descriptor = "(IIII)Z")
    private boolean method98(int arg0, int arg1, int arg2, int arg3) {
        if (this.method96(arg0, arg1, arg2)) {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            return this.method100(var5 + 1, this.field287[arg0][arg1][arg2] - arg3, var6 + 1) && this.method100(var5 + 128 - 1, this.field287[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method100(var5 + 128 - 1, this.field287[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method100(var5 + 1, this.field287[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIII)Z")
    private boolean method99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var9 = arg1; var9 <= arg2; var9++) {
                for (int var15 = arg3; var15 <= arg4; var15++) {
                    if (this.field292[arg0][var9][var15] == -field295) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = this.field287[arg0][arg1][arg3] - arg5;
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
            return this.method100(var7 + 1, this.field287[arg0][arg1][arg3] - arg5, var8 + 1) && this.method100(var7 + 128 - 1, this.field287[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.method100(var7 + 128 - 1, this.field287[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.method100(var7 + 1, this.field287[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "h", descriptor = "(III)Z")
    private boolean method100(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < field322; var4++) {
            Occlude var5 = field323[var4];
            if (var5.field235 == 1) {
                int var6 = var5.field229 - arg0;
                if (var6 > 0) {
                    int var7 = (var5.field238 * var6 >> 8) + var5.field231;
                    int var8 = (var5.field239 * var6 >> 8) + var5.field232;
                    int var9 = (var5.field240 * var6 >> 8) + var5.field233;
                    int var10 = (var5.field241 * var6 >> 8) + var5.field234;
                    if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field235 == 2) {
                int var11 = arg0 - var5.field229;
                if (var11 > 0) {
                    int var12 = (var5.field238 * var11 >> 8) + var5.field231;
                    int var13 = (var5.field239 * var11 >> 8) + var5.field232;
                    int var14 = (var5.field240 * var11 >> 8) + var5.field233;
                    int var15 = (var5.field241 * var11 >> 8) + var5.field234;
                    if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
                        return true;
                    }
                }
            } else if (var5.field235 == 3) {
                int var16 = var5.field231 - arg2;
                if (var16 > 0) {
                    int var17 = (var5.field236 * var16 >> 8) + var5.field229;
                    int var18 = (var5.field237 * var16 >> 8) + var5.field230;
                    int var19 = (var5.field240 * var16 >> 8) + var5.field233;
                    int var20 = (var5.field241 * var16 >> 8) + var5.field234;
                    if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
                        return true;
                    }
                }
            } else if (var5.field235 == 4) {
                int var21 = arg2 - var5.field231;
                if (var21 > 0) {
                    int var22 = (var5.field236 * var21 >> 8) + var5.field229;
                    int var23 = (var5.field237 * var21 >> 8) + var5.field230;
                    int var24 = (var5.field240 * var21 >> 8) + var5.field233;
                    int var25 = (var5.field241 * var21 >> 8) + var5.field234;
                    if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
                        return true;
                    }
                }
            } else if (var5.field235 == 5) {
                int var26 = arg1 - var5.field233;
                if (var26 > 0) {
                    int var27 = (var5.field236 * var26 >> 8) + var5.field229;
                    int var28 = (var5.field237 * var26 >> 8) + var5.field230;
                    int var29 = (var5.field238 * var26 >> 8) + var5.field231;
                    int var30 = (var5.field239 * var26 >> 8) + var5.field232;
                    if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
