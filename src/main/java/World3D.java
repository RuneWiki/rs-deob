import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("r")
public class World3D {

    @OriginalMember(owner = "r", name = "a", descriptor = "I")
    private int field280 = 749;

    @OriginalMember(owner = "r", name = "b", descriptor = "I")
    private int field281 = 712;

    @OriginalMember(owner = "r", name = "d", descriptor = "B")
    private byte field283 = 1;

    @OriginalMember(owner = "r", name = "e", descriptor = "I")
    private int field284 = 5;

    @OriginalMember(owner = "r", name = "f", descriptor = "Z")
    private boolean field285 = true;

    @OriginalMember(owner = "r", name = "g", descriptor = "Z")
    private boolean field286 = false;

    @OriginalMember(owner = "r", name = "h", descriptor = "I")
    private int field287 = 6;

    @OriginalMember(owner = "r", name = "q", descriptor = "[Lp;")
    public Location[] field296 = new Location[5000];

    @OriginalMember(owner = "r", name = "gb", descriptor = "[I")
    public int[] field338 = new int[10000];

    @OriginalMember(owner = "r", name = "hb", descriptor = "[I")
    public int[] field339 = new int[10000];

    @OriginalMember(owner = "r", name = "jb", descriptor = "[[I")
    public int[][] field341 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "r", name = "kb", descriptor = "[[I")
    public int[][] field342 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "r", name = "j", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "r", name = "k", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "r", name = "l", descriptor = "I")
    public int field291;

    @OriginalMember(owner = "r", name = "n", descriptor = "[[[Lv;")
    public Tile[][][] field293;

    @OriginalMember(owner = "r", name = "r", descriptor = "[[[I")
    public int[][][] field297;

    @OriginalMember(owner = "r", name = "m", descriptor = "[[[I")
    public int[][][] field292;

    @OriginalMember(owner = "r", name = "i", descriptor = "Z")
    public static boolean field288 = true;

    @OriginalMember(owner = "r", name = "I", descriptor = "[Lp;")
    public static Location[] field314 = new Location[100];

    @OriginalMember(owner = "r", name = "J", descriptor = "[I")
    public static final int[] field315 = new int[] { 53, -53, -53, 53 };

    @OriginalMember(owner = "r", name = "K", descriptor = "[I")
    public static final int[] field316 = new int[] { -53, -53, 53, 53 };

    @OriginalMember(owner = "r", name = "L", descriptor = "[I")
    public static final int[] field317 = new int[] { -45, 45, 45, -45 };

    @OriginalMember(owner = "r", name = "M", descriptor = "[I")
    public static final int[] field318 = new int[] { 45, 45, -45, -45 };

    @OriginalMember(owner = "r", name = "Q", descriptor = "I")
    public static int field322 = -1;

    @OriginalMember(owner = "r", name = "R", descriptor = "I")
    public static int field323 = -1;

    @OriginalMember(owner = "r", name = "S", descriptor = "I")
    public static int field324 = 4;

    @OriginalMember(owner = "r", name = "T", descriptor = "[I")
    public static int[] field325 = new int[field324];

    @OriginalMember(owner = "r", name = "U", descriptor = "[[Lm;")
    public static Occlude[][] field326 = new Occlude[field324][500];

    @OriginalMember(owner = "r", name = "W", descriptor = "[Lm;")
    public static Occlude[] field328 = new Occlude[500];

    @OriginalMember(owner = "r", name = "X", descriptor = "Lob;")
    public static LinkList field329 = new LinkList(-794);

    @OriginalMember(owner = "r", name = "Y", descriptor = "[I")
    public static final int[] field330 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "r", name = "Z", descriptor = "[I")
    public static final int[] field331 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "r", name = "ab", descriptor = "[I")
    public static final int[] field332 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "r", name = "bb", descriptor = "[I")
    public static final int[] field333 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "r", name = "cb", descriptor = "[I")
    public static final int[] field334 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "r", name = "db", descriptor = "[I")
    public static final int[] field335 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "r", name = "eb", descriptor = "[I")
    public static final int[] field336 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "r", name = "fb", descriptor = "[I")
    public static final int[] field337 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

    @OriginalMember(owner = "r", name = "lb", descriptor = "[[[[Z")
    public static boolean[][][][] field343 = new boolean[8][32][51][51];

    @OriginalMember(owner = "r", name = "c", descriptor = "I")
    private int field282;

    @OriginalMember(owner = "r", name = "o", descriptor = "I")
    public int field294;

    @OriginalMember(owner = "r", name = "p", descriptor = "I")
    public int field295;

    @OriginalMember(owner = "r", name = "s", descriptor = "I")
    public static int field298;

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

    @OriginalMember(owner = "r", name = "O", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "r", name = "P", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "r", name = "V", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "r", name = "ib", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "r", name = "nb", descriptor = "I")
    public static int field345;

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

    @OriginalMember(owner = "r", name = "N", descriptor = "Z")
    public static boolean field319;

    @OriginalMember(owner = "r", name = "mb", descriptor = "[[Z")
    public static boolean[][] field344;

    @OriginalMember(owner = "r", name = "<init>", descriptor = "([[[IIZII)V")
    public World3D(int[][][] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        this.field289 = arg4;
        this.field290 = arg1;
        this.field291 = arg3;
        this.field293 = new Tile[arg4][arg1][arg3];
        this.field297 = new int[arg4][arg1 + 1][arg3 + 1];
        this.field292 = arg0;
        if (arg2) {
            throw new NullPointerException();
        }
        this.method50(712);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(B)V")
    public static void method49(byte arg0) {
        field314 = null;
        if (arg0 != 4) {
            return;
        }
        field325 = null;
        field326 = null;
        field329 = null;
        field343 = null;
        field344 = null;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(I)V")
    public void method50(int arg0) {
        int var2 = 37 / arg0;
        for (int var3 = 0; var3 < this.field289; var3++) {
            for (int var8 = 0; var8 < this.field290; var8++) {
                for (int var9 = 0; var9 < this.field291; var9++) {
                    this.field293[var3][var8][var9] = null;
                }
            }
        }
        for (int var4 = 0; var4 < field324; var4++) {
            for (int var7 = 0; var7 < field325[var4]; var7++) {
                field326[var4][var7] = null;
            }
            field325[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field295; var5++) {
            this.field296[var5] = null;
        }
        this.field295 = 0;
        for (int var6 = 0; var6 < field314.length; var6++) {
            field314[var6] = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(II)V")
    public void method51(int arg0, int arg1) {
        if (arg1 != 4) {
            this.field281 = -136;
        }
        this.field294 = arg0;
        for (int var3 = 0; var3 < this.field290; var3++) {
            for (int var4 = 0; var4 < this.field291; var4++) {
                this.field293[arg0][var3][var4] = new Tile(arg0, var3, var4);
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(III)V")
    public void method52(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.field286 = !this.field286;
        }
        Tile var4 = this.field293[0][arg1][arg2];
        for (int var5 = 0; var5 < 3; var5++) {
            Tile var6 = this.field293[var5][arg1][arg2] = this.field293[var5 + 1][arg1][arg2];
            if (var6 != null) {
                var6.field371--;
                for (int var7 = 0; var7 < var6.field381; var7++) {
                    Location var8 = var6.field382[var7];
                    if ((var8.field269 >> 29 & 0x3) == 2 && var8.field263 == arg1 && var8.field265 == arg2) {
                        var8.field257--;
                    }
                }
            }
        }
        if (this.field293[0][arg1][arg2] == null) {
            this.field293[0][arg1][arg2] = new Tile(0, arg1, arg2);
        }
        this.field293[0][arg1][arg2].field393 = var4;
        this.field293[3][arg1][arg2] = null;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IZIIIIIII)V")
    public static void method53(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Occlude var9 = new Occlude();
        var9.field228 = arg6 / 128;
        var9.field229 = arg5 / 128;
        var9.field230 = arg4 / 128;
        var9.field231 = arg3 / 128;
        var9.field232 = arg8;
        var9.field233 = arg6;
        if (arg1) {
            return;
        }
        var9.field234 = arg5;
        var9.field235 = arg4;
        var9.field236 = arg3;
        var9.field237 = arg0;
        var9.field238 = arg7;
        field326[arg2][field325[arg2]++] = var9;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIII)V")
    public void method54(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field293[arg0][arg1][arg2];
        if (var5 != null) {
            this.field293[arg0][arg1][arg2].field385 = arg3;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public void method55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            TileUnderlay var21 = new TileUnderlay(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var22 = arg0; var22 >= 0; var22--) {
                if (this.field293[var22][arg1][arg2] == null) {
                    this.field293[var22][arg1][arg2] = new Tile(var22, arg1, arg2);
                }
            }
            this.field293[arg0][arg1][arg2].field375 = var21;
        } else if (arg3 == 1) {
            TileUnderlay var23 = new TileUnderlay(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var24 = arg0; var24 >= 0; var24--) {
                if (this.field293[var24][arg1][arg2] == null) {
                    this.field293[var24][arg1][arg2] = new Tile(var24, arg1, arg2);
                }
            }
            this.field293[arg0][arg1][arg2].field375 = var23;
        } else {
            TileOverlay var25 = new TileOverlay(arg15, arg16, arg6, arg10, arg13, arg11, arg19, arg4, arg12, arg17, arg8, arg2, arg3, arg1, arg5, arg14, arg7, arg9, false, arg18);
            for (int var26 = arg0; var26 >= 0; var26--) {
                if (this.field293[var26][arg1][arg2] == null) {
                    this.field293[var26][arg1][arg2] = new Tile(var26, arg1, arg2);
                }
            }
            this.field293[arg0][arg1][arg2].field376 = var25;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILx;IIIIBB)V")
    public void method56(int arg0, Entity arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, byte arg7) {
        if (arg1 == null) {
            return;
        }
        GroundDecor var9 = new GroundDecor();
        var9.field200 = arg1;
        var9.field198 = arg5 * 128 + 64;
        var9.field199 = arg0 * 128 + 64;
        var9.field197 = arg4;
        var9.field201 = arg3;
        if (arg6 != -120) {
            return;
        }
        var9.field202 = arg7;
        if (this.field293[arg2][arg5][arg0] == null) {
            this.field293[arg2][arg5][arg0] = new Tile(arg2, arg5, arg0);
        }
        this.field293[arg2][arg5][arg0].field379 = var9;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lx;IILx;Lx;IIII)V")
    public void method57(Entity arg0, int arg1, int arg2, Entity arg3, Entity arg4, int arg5, int arg6, int arg7, int arg8) {
        GroundObject var10 = new GroundObject();
        if (arg5 != 0) {
            return;
        }
        var10.field206 = arg0;
        var10.field204 = arg8 * 128 + 64;
        var10.field205 = arg1 * 128 + 64;
        var10.field203 = arg2;
        var10.field209 = arg7;
        var10.field207 = arg4;
        var10.field208 = arg3;
        int var11 = 0;
        Tile var12 = this.field293[arg6][arg8][arg1];
        if (var12 != null) {
            for (int var13 = 0; var13 < var12.field381; var13++) {
                if (var12.field382[var13].field261 instanceof Model) {
                    int var14 = ((Model) var12.field382[var13].field261).field574;
                    if (var14 > var11) {
                        var11 = var14;
                    }
                }
            }
        }
        var10.field210 = var11;
        if (this.field293[arg6][arg8][arg1] == null) {
            this.field293[arg6][arg8][arg1] = new Tile(arg6, arg8, arg1);
        }
        this.field293[arg6][arg8][arg1].field380 = var10;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIILx;BILx;I)V")
    public void method58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Entity arg6, byte arg7, int arg8, Entity arg9, int arg10) {
        if (arg9 == null && arg6 == null) {
            return;
        }
        Wall var12 = new Wall();
        var12.field278 = arg10;
        var12.field279 = arg7;
        var12.field272 = arg2 * 128 + 64;
        var12.field273 = arg8 * 128 + 64;
        var12.field271 = arg0;
        var12.field276 = arg9;
        var12.field277 = arg6;
        var12.field274 = arg5;
        var12.field275 = arg4;
        if (arg1 != 0) {
            return;
        }
        for (int var13 = arg3; var13 >= 0; var13--) {
            if (this.field293[var13][arg2][arg8] == null) {
                this.field293[var13][arg2][arg8] = new Tile(var13, arg2, arg8);
            }
        }
        this.field293[arg3][arg2][arg8].field377 = var12;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIIIILx;B)V")
    public void method59(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, Entity arg10, byte arg11) {
        if (arg10 == null) {
            return;
        }
        Decor var13 = new Decor();
        var13.field169 = arg0;
        var13.field170 = arg11;
        var13.field164 = arg4 * 128 + arg1 + 64;
        var13.field165 = arg8 * 128 + arg7 + 64;
        if (arg9 != 8) {
            return;
        }
        var13.field163 = arg5;
        var13.field168 = arg10;
        var13.field166 = arg2;
        var13.field167 = arg3;
        for (int var14 = arg6; var14 >= 0; var14--) {
            if (this.field293[var14][arg4][arg8] == null) {
                this.field293[var14][arg4][arg8] = new Tile(var14, arg4, arg8);
            }
        }
        this.field293[arg6][arg4][arg8].field378 = var13;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IILx;IIIIIIIB)Z")
    public boolean method60(int arg0, int arg1, Entity arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        if (arg8 != 2) {
            throw new NullPointerException();
        } else if (arg2 == null) {
            return true;
        } else {
            int var12 = arg1 * 64 + arg3 * 128;
            int var13 = arg4 * 64 + arg9 * 128;
            return this.method63(arg6, arg3, arg9, arg1, arg4, var12, var13, arg0, arg2, arg5, false, arg7, arg10);
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ZIIIILx;IIII)Z")
    public boolean method61(boolean arg0, int arg1, int arg2, int arg3, int arg4, Entity arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 != 1) {
            throw new NullPointerException();
        } else if (arg5 == null) {
            return true;
        } else {
            int var11 = arg9 - arg3;
            int var12 = arg2 - arg3;
            int var13 = arg3 + arg9;
            int var14 = arg2 + arg3;
            if (arg0) {
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
            return this.method63(arg1, var15, var16, var17 + 1 - var15, var18 - var16 + 1, arg9, arg2, arg6, arg5, arg8, true, arg4, (byte) 0);
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IILx;IIIIIIIIII)Z")
    public boolean method62(int arg0, int arg1, Entity arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        if (arg0 != -3283) {
            throw new NullPointerException();
        }
        return arg2 == null ? true : this.method63(arg4, arg12, arg7, arg3 + 1 - arg12, arg9 - arg7 + 1, arg10, arg8, arg5, arg2, arg11, true, arg1, (byte) 0);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIILx;IZIB)Z")
    private boolean method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, boolean arg10, int arg11, byte arg12) {
        for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
            for (int var21 = arg2; var21 < arg2 + arg4; var21++) {
                if (var14 < 0 || var21 < 0 || var14 >= this.field290 || var21 >= this.field291) {
                    return false;
                }
                Tile var22 = this.field293[arg0][var14][var21];
                if (var22 != null && var22.field381 >= 5) {
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
                    if (this.field293[var19][var16][var17] == null) {
                        this.field293[var19][var16][var17] = new Tile(var19, var16, var17);
                    }
                }
                Tile var20 = this.field293[arg0][var16][var17];
                var20.field382[var20.field381] = var15;
                var20.field383[var20.field381] = var18;
                var20.field384 |= var18;
                var20.field381++;
            }
        }
        if (arg10) {
            this.field296[this.field295++] = var15;
        }
        return true;
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(I)V")
    public void method64(int arg0) {
        for (int var2 = 0; var2 < this.field295; var2++) {
            Location var3 = this.field296[var2];
            this.method65(-282, var3);
            this.field296[var2] = null;
        }
        if (arg0 < 0) {
            this.field295 = 0;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILp;)V")
    private void method65(int arg0, Location arg1) {
        if (arg0 >= 0) {
            return;
        }
        for (int var3 = arg1.field263; var3 <= arg1.field264; var3++) {
            for (int var4 = arg1.field265; var4 <= arg1.field266; var4++) {
                Tile var5 = this.field293[arg1.field257][var3][var4];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field381; var6++) {
                        if (var5.field382[var6] == arg1) {
                            var5.field381--;
                            for (int var7 = var6; var7 < var5.field381; var7++) {
                                var5.field382[var7] = var5.field382[var7 + 1];
                                var5.field383[var7] = var5.field383[var7 + 1];
                            }
                            var5.field382[var5.field381] = null;
                            break;
                        }
                    }
                    var5.field384 = 0;
                    for (int var8 = 0; var8 < var5.field381; var8++) {
                        var5.field384 |= var5.field383[var8];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIII)V")
    public void method66(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Tile var6 = this.field293[arg1][arg2][arg4];
        if (var6 == null) {
            return;
        }
        Decor var7 = var6.field378;
        if (arg3 == 5 && var7 != null) {
            int var8 = arg2 * 128 + 64;
            int var9 = arg4 * 128 + 64;
            var7.field164 = (var7.field164 - var8) * arg0 / 16 + var8;
            var7.field165 = (var7.field165 - var9) * arg0 / 16 + var9;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IBII)V")
    public void method67(int arg0, byte arg1, int arg2, int arg3) {
        Tile var5 = this.field293[arg3][arg0][arg2];
        if (arg1 != -46) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (var5 != null) {
            var5.field377 = null;
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIII)V")
    public void method68(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field293[arg2][arg1][arg0];
        if (var5 == null) {
            return;
        }
        var5.field378 = null;
        if (arg3 < 0 || arg3 > 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(IIII)V")
    public void method69(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0) {
            return;
        }
        Tile var5 = this.field293[arg1][arg3][arg0];
        if (var5 == null) {
            return;
        }
        for (int var6 = 0; var6 < var5.field381; var6++) {
            Location var7 = var5.field382[var6];
            if ((var7.field269 >> 29 & 0x3) == 2 && var7.field263 == arg3 && var7.field265 == arg0) {
                this.method65(-282, var7);
                return;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IZII)V")
    public void method70(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            Tile var5 = this.field293[arg3][arg2][arg0];
            if (var5 != null) {
                var5.field379 = null;
            }
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(III)V")
    public void method71(int arg0, int arg1, int arg2) {
        Tile var4 = this.field293[arg0][arg1][arg2];
        if (var4 != null) {
            var4.field380 = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(BIII)Lq;")
    public Wall method72(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -53) {
            this.field286 = !this.field286;
        }
        Tile var5 = this.field293[arg2][arg3][arg1];
        return var5 == null ? null : var5.field377;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIB)Lh;")
    public Decor method73(int arg0, int arg1, int arg2, byte arg3) {
        Tile var5 = this.field293[arg1][arg2][arg0];
        if (arg3 != 3) {
            throw new NullPointerException();
        }
        return var5 == null ? null : var5.field378;
    }

    @OriginalMember(owner = "r", name = "d", descriptor = "(IIII)Lp;")
    public Location method74(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        Tile var6 = this.field293[arg2][arg3][arg0];
        if (var6 == null) {
            return null;
        }
        for (int var7 = 0; var7 < var6.field381; var7++) {
            Location var8 = var6.field382[var7];
            if ((var8.field269 >> 29 & 0x3) == 2 && var8.field263 == arg3 && var8.field265 == arg0) {
                return var8;
            }
        }
        return null;
    }

    @OriginalMember(owner = "r", name = "e", descriptor = "(IIII)Lj;")
    public GroundDecor method75(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 84 / arg2;
        Tile var6 = this.field293[arg0][arg1][arg3];
        return var6 == null || var6.field379 == null ? null : var6.field379;
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(III)I")
    public int method76(int arg0, int arg1, int arg2) {
        Tile var4 = this.field293[arg0][arg1][arg2];
        return var4 == null || var4.field377 == null ? 0 : var4.field377.field278;
    }

    @OriginalMember(owner = "r", name = "f", descriptor = "(IIII)I")
    public int method77(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 0) {
            return 1;
        } else {
            Tile var5 = this.field293[arg3][arg1][arg2];
            return var5 == null || var5.field378 == null ? 0 : var5.field378.field169;
        }
    }

    @OriginalMember(owner = "r", name = "d", descriptor = "(III)I")
    public int method78(int arg0, int arg1, int arg2) {
        Tile var4 = this.field293[arg0][arg1][arg2];
        if (var4 == null) {
            return 0;
        }
        for (int var5 = 0; var5 < var4.field381; var5++) {
            Location var6 = var4.field382[var5];
            if ((var6.field269 >> 29 & 0x3) == 2 && var6.field263 == arg1 && var6.field265 == arg2) {
                return var6.field269;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "r", name = "e", descriptor = "(III)I")
    public int method79(int arg0, int arg1, int arg2) {
        Tile var4 = this.field293[arg0][arg1][arg2];
        return var4 == null || var4.field379 == null ? 0 : var4.field379.field201;
    }

    @OriginalMember(owner = "r", name = "g", descriptor = "(IIII)I")
    public int method80(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field293[arg0][arg1][arg2];
        if (var5 == null) {
            return -1;
        } else if (var5.field377 != null && var5.field377.field278 == arg3) {
            return var5.field377.field279 & 0xFF;
        } else if (var5.field378 != null && var5.field378.field169 == arg3) {
            return var5.field378.field170 & 0xFF;
        } else if (var5.field379 != null && var5.field379.field201 == arg3) {
            return var5.field379.field202 & 0xFF;
        } else {
            for (int var6 = 0; var6 < var5.field381; var6++) {
                if (var5.field382[var6].field269 == arg3) {
                    return var5.field382[var6].field270 & 0xFF;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ZIIIII)V")
    public void method81(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (int) Math.sqrt((double) (arg5 * arg5 + arg1 * arg1 + arg4 * arg4));
        int var8 = arg2 * var7 >> 8;
        for (int var9 = 0; var9 < this.field289; var9++) {
            for (int var10 = 0; var10 < this.field290; var10++) {
                for (int var11 = 0; var11 < this.field291; var11++) {
                    Tile var12 = this.field293[var9][var10][var11];
                    if (var12 != null) {
                        Wall var13 = var12.field377;
                        if (var13 != null && var13.field276 != null && var13.field276.field397 != null) {
                            this.method83(1, (Model) var13.field276, var10, 0, var9, 1, var11);
                            if (var13.field277 != null && var13.field277.field397 != null) {
                                this.method83(1, (Model) var13.field277, var10, 0, var9, 1, var11);
                                this.method84((Model) var13.field276, (Model) var13.field277, 0, 0, 0, false);
                                ((Model) var13.field277).method144(arg3, var8, arg4, arg1, arg5);
                            }
                            ((Model) var13.field276).method144(arg3, var8, arg4, arg1, arg5);
                        }
                        for (int var14 = 0; var14 < var12.field381; var14++) {
                            Location var16 = var12.field382[var14];
                            if (var16 != null && var16.field261 != null && var16.field261.field397 != null) {
                                this.method83(var16.field266 + 1 - var16.field265, (Model) var16.field261, var10, 0, var9, var16.field264 + 1 - var16.field263, var11);
                                ((Model) var16.field261).method144(arg3, var8, arg4, arg1, arg5);
                            }
                        }
                        GroundDecor var15 = var12.field379;
                        if (var15 != null && var15.field200.field397 != null) {
                            this.method82(var10, (Model) var15.field200, var9, true, var11);
                            ((Model) var15.field200).method144(arg3, var8, arg4, arg1, arg5);
                        }
                    }
                }
            }
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILeb;IZI)V")
    private void method82(int arg0, Model arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            return;
        }
        if (arg0 < this.field290) {
            Tile var6 = this.field293[arg2][arg0 + 1][arg4];
            if (var6 != null && var6.field379 != null && var6.field379.field200.field397 != null) {
                this.method84(arg1, (Model) var6.field379.field200, 128, 0, 0, true);
            }
        }
        if (arg4 < this.field290) {
            Tile var7 = this.field293[arg2][arg0][arg4 + 1];
            if (var7 != null && var7.field379 != null && var7.field379.field200.field397 != null) {
                this.method84(arg1, (Model) var7.field379.field200, 0, 0, 128, true);
            }
        }
        if (arg0 < this.field290 && arg4 < this.field291) {
            Tile var8 = this.field293[arg2][arg0 + 1][arg4 + 1];
            if (var8 != null && var8.field379 != null && var8.field379.field200.field397 != null) {
                this.method84(arg1, (Model) var8.field379.field200, 128, 0, 128, true);
            }
        }
        if (arg0 >= this.field290 || arg4 <= 0) {
            return;
        }
        Tile var9 = this.field293[arg2][arg0 + 1][arg4 - 1];
        if (var9 != null && var9.field379 != null && var9.field379.field200.field397 != null) {
            this.method84(arg1, (Model) var9.field379.field200, 128, 0, -128, true);
            return;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILeb;IIIII)V")
    private void method83(int arg0, Model arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var8 = true;
        int var9 = arg2;
        int var10 = arg2 + arg5;
        int var11 = arg6 - 1;
        int var12 = arg0 + arg6;
        if (arg3 != 0) {
            this.field280 = -346;
        }
        for (int var13 = arg4; var13 <= arg4 + 1; var13++) {
            if (this.field289 != var13) {
                for (int var14 = var9; var14 <= var10; var14++) {
                    if (var14 >= 0 && var14 < this.field290) {
                        for (int var15 = var11; var15 <= var12; var15++) {
                            if (var15 >= 0 && var15 < this.field291 && (!var8 || var14 >= var10 || var15 >= var12 || var15 < arg6 && arg2 != var14)) {
                                Tile var16 = this.field293[var13][var14][var15];
                                if (var16 != null) {
                                    int var17 = (this.field292[var13][var14 + 1][var15] + this.field292[var13][var14][var15] + this.field292[var13][var14][var15 + 1] + this.field292[var13][var14 + 1][var15 + 1]) / 4 - (this.field292[arg4][arg2 + 1][arg6] + this.field292[arg4][arg2][arg6] + this.field292[arg4][arg2][arg6 + 1] + this.field292[arg4][arg2 + 1][arg6 + 1]) / 4;
                                    Wall var18 = var16.field377;
                                    if (var18 != null && var18.field276 != null && var18.field276.field397 != null) {
                                        this.method84(arg1, (Model) var18.field276, (var14 - arg2) * 128 + (1 - arg5) * 64, var17, (1 - arg0) * 64 + (var15 - arg6) * 128, var8);
                                    }
                                    if (var18 != null && var18.field277 != null && var18.field277.field397 != null) {
                                        this.method84(arg1, (Model) var18.field277, (var14 - arg2) * 128 + (1 - arg5) * 64, var17, (1 - arg0) * 64 + (var15 - arg6) * 128, var8);
                                    }
                                    for (int var19 = 0; var19 < var16.field381; var19++) {
                                        Location var20 = var16.field382[var19];
                                        if (var20 != null && var20.field261 != null && var20.field261.field397 != null) {
                                            int var21 = var20.field264 + 1 - var20.field263;
                                            int var22 = var20.field266 + 1 - var20.field265;
                                            this.method84(arg1, (Model) var20.field261, (var20.field263 - arg2) * 128 + (var21 - arg5) * 64, var17, (var20.field265 - arg6) * 128 + (var22 - arg0) * 64, var8);
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
        this.field340++;
        int var7 = 0;
        int[] var8 = arg1.field547;
        int var9 = arg1.field546;
        for (int var10 = 0; var10 < arg0.field546; var10++) {
            VertexNormal var13 = arg0.field397[var10];
            VertexNormal var14 = arg0.field580[var10];
            if (var14.field249 != 0) {
                int var15 = arg0.field548[var10] - arg3;
                if (var15 <= arg1.field571) {
                    int var16 = arg0.field547[var10] - arg2;
                    if (var16 >= arg1.field566 && var16 <= arg1.field567) {
                        int var17 = arg0.field549[var10] - arg4;
                        if (var17 >= arg1.field569 && var17 <= arg1.field568) {
                            for (int var18 = 0; var18 < var9; var18++) {
                                VertexNormal var19 = arg1.field397[var18];
                                VertexNormal var20 = arg1.field580[var18];
                                if (var8[var18] == var16 && arg1.field549[var18] == var17 && arg1.field548[var18] == var15 && var20.field249 != 0) {
                                    var13.field246 += var20.field246;
                                    var13.field247 += var20.field247;
                                    var13.field248 += var20.field248;
                                    var13.field249 += var20.field249;
                                    var19.field246 += var14.field246;
                                    var19.field247 += var14.field247;
                                    var19.field248 += var14.field248;
                                    var19.field249 += var14.field249;
                                    var7++;
                                    this.field338[var10] = this.field340;
                                    this.field339[var18] = this.field340;
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
        for (int var11 = 0; var11 < arg0.field550; var11++) {
            if (this.field338[arg0.field551[var11]] == this.field340 && this.field338[arg0.field552[var11]] == this.field340 && this.field338[arg0.field553[var11]] == this.field340) {
                arg0.field557[var11] = -1;
            }
        }
        for (int var12 = 0; var12 < arg1.field550; var12++) {
            if (this.field339[arg1.field551[var12]] == this.field340 && this.field339[arg1.field552[var12]] == this.field340 && this.field339[arg1.field553[var12]] == this.field340) {
                arg1.field557[var12] = -1;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "([IIIIII)V")
    public void method85(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Tile var7 = this.field293[arg3][arg4][arg5];
        if (var7 == null) {
            return;
        }
        TileUnderlay var8 = var7.field375;
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
        TileOverlay var11 = var7.field376;
        if (var11 == null) {
            return;
        }
        int var12 = var11.field183;
        int var13 = var11.field184;
        int var14 = var11.field185;
        int var15 = var11.field186;
        int[] var16 = this.field341[var12];
        int[] var17 = this.field342[var13];
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

    @OriginalMember(owner = "r", name = "a", descriptor = "(I[IIIII)V")
    public static void method86(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field347 = 0;
        field348 = 0;
        field349 = arg4;
        field350 = arg0;
        field345 = arg4 / 2;
        field346 = arg0 / 2;
        if (arg5 >= 0) {
            return;
        }
        boolean[][][][] var6 = new boolean[9][32][53][53];
        for (int var7 = 128; var7 <= 384; var7 += 32) {
            for (int var15 = 0; var15 < 2048; var15 += 64) {
                field310 = Model.field609[var7];
                field311 = Model.field610[var7];
                field312 = Model.field609[var15];
                field313 = Model.field610[var15];
                int var16 = (var7 - 128) / 32;
                int var17 = var15 / 64;
                for (int var18 = -26; var18 <= 26; var18++) {
                    for (int var19 = -26; var19 <= 26; var19++) {
                        int var20 = var18 * 128;
                        int var21 = var19 * 128;
                        boolean var22 = false;
                        for (int var23 = -arg2; var23 <= arg3; var23 += 128) {
                            if (method87(var20, arg1[var16] + var23, var21, -576)) {
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
                        field343[var8][var9][var10 + 25][var11 + 25] = var12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "h", descriptor = "(IIII)Z")
    public static boolean method87(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field313 * arg0 + field312 * arg2 >> 16;
        int var5 = field313 * arg2 - field312 * arg0 >> 16;
        int var6 = field311 * var5 + field310 * arg1 >> 16;
        int var7 = field311 * arg1 - field310 * var5 >> 16;
        if (var6 < 50 || var6 > 3500) {
            return false;
        }
        int var8 = (var4 << 9) / var6 + field345;
        int var9 = (var7 << 9) / var6 + field346;
        if (arg3 >= 0) {
            throw new NullPointerException();
        }
        return var8 >= field347 && var8 <= field349 && var9 >= field348 && var9 <= field350;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(BII)V")
    public void method88(byte arg0, int arg1, int arg2) {
        field319 = true;
        field320 = arg1;
        if (this.field283 == arg0) {
            boolean var4 = false;
        } else {
            this.field287 = -127;
        }
        field321 = arg2;
        field322 = -1;
        field323 = -1;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIII)V")
    public void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= this.field290 * 128) {
            arg0 = this.field290 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= this.field291 * 128) {
            arg2 = this.field291 * 128 - 1;
        }
        field300++;
        field310 = Model.field609[arg1];
        field311 = Model.field610[arg1];
        field312 = Model.field609[arg4];
        field313 = Model.field610[arg4];
        field344 = field343[(arg1 - 128) / 32][arg4 / 64];
        field307 = arg0;
        field308 = arg6;
        field309 = arg2;
        field305 = arg0 / 128;
        field306 = arg2 / 128;
        field299 = arg3;
        if (arg5 < 5 || arg5 > 5) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        field301 = field305 - 25;
        if (field301 < 0) {
            field301 = 0;
        }
        field303 = field306 - 25;
        if (field303 < 0) {
            field303 = 0;
        }
        field302 = field305 + 25;
        if (field302 > this.field290) {
            field302 = this.field290;
        }
        field304 = field306 + 25;
        if (field304 > this.field291) {
            field304 = this.field291;
        }
        this.method95((byte) -120);
        field298 = 0;
        for (int var9 = this.field294; var9 < this.field289; var9++) {
            Tile[][] var34 = this.field293[var9];
            for (int var35 = field301; var35 < field302; var35++) {
                for (int var36 = field303; var36 < field304; var36++) {
                    Tile var37 = var34[var35][var36];
                    if (var37 != null) {
                        if (var37.field385 <= arg3 && (field344[var35 + 25 - field305][var36 + 25 - field306] || this.field292[var9][var35][var36] - arg6 >= 2000)) {
                            var37.field386 = true;
                            var37.field387 = true;
                            if (var37.field381 > 0) {
                                var37.field388 = true;
                            } else {
                                var37.field388 = false;
                            }
                            field298++;
                        } else {
                            var37.field386 = false;
                            var37.field387 = false;
                            var37.field389 = 0;
                        }
                    }
                }
            }
        }
        for (int var10 = this.field294; var10 < this.field289; var10++) {
            Tile[][] var23 = this.field293[var10];
            for (int var24 = -25; var24 <= 0; var24++) {
                int var25 = field305 + var24;
                int var26 = field305 - var24;
                if (var25 >= field301 || var26 < field302) {
                    for (int var27 = -25; var27 <= 0; var27++) {
                        int var28 = field306 + var27;
                        int var29 = field306 - var27;
                        if (var25 >= field301) {
                            if (var28 >= field303) {
                                Tile var30 = var23[var25][var28];
                                if (var30 != null && var30.field386) {
                                    this.method90(var30, true);
                                }
                            }
                            if (var29 < field304) {
                                Tile var31 = var23[var25][var29];
                                if (var31 != null && var31.field386) {
                                    this.method90(var31, true);
                                }
                            }
                        }
                        if (var26 < field302) {
                            if (var28 >= field303) {
                                Tile var32 = var23[var26][var28];
                                if (var32 != null && var32.field386) {
                                    this.method90(var32, true);
                                }
                            }
                            if (var29 < field304) {
                                Tile var33 = var23[var26][var29];
                                if (var33 != null && var33.field386) {
                                    this.method90(var33, true);
                                }
                            }
                        }
                        if (field298 == 0) {
                            field319 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var11 = this.field294; var11 < this.field289; var11++) {
            Tile[][] var12 = this.field293[var11];
            for (int var13 = -25; var13 <= 0; var13++) {
                int var14 = field305 + var13;
                int var15 = field305 - var13;
                if (var14 >= field301 || var15 < field302) {
                    for (int var16 = -25; var16 <= 0; var16++) {
                        int var17 = field306 + var16;
                        int var18 = field306 - var16;
                        if (var14 >= field301) {
                            if (var17 >= field303) {
                                Tile var19 = var12[var14][var17];
                                if (var19 != null && var19.field386) {
                                    this.method90(var19, false);
                                }
                            }
                            if (var18 < field304) {
                                Tile var20 = var12[var14][var18];
                                if (var20 != null && var20.field386) {
                                    this.method90(var20, false);
                                }
                            }
                        }
                        if (var15 < field302) {
                            if (var17 >= field303) {
                                Tile var21 = var12[var15][var17];
                                if (var21 != null && var21.field386) {
                                    this.method90(var21, false);
                                }
                            }
                            if (var18 < field304) {
                                Tile var22 = var12[var15][var18];
                                if (var22 != null && var22.field386) {
                                    this.method90(var22, false);
                                }
                            }
                        }
                        if (field298 == 0) {
                            field319 = false;
                            return;
                        }
                    }
                }
            }
        }
        field319 = false;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lv;Z)V")
    public void method90(Tile arg0, boolean arg1) {
        field329.method245(arg0);
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
                                                var3 = (Tile) field329.method247();
                                                if (var3 == null) {
                                                    return;
                                                }
                                            } while (!var3.field387);
                                            var4 = var3.field372;
                                            var5 = var3.field373;
                                            var6 = var3.field371;
                                            var7 = var3.field374;
                                            var8 = this.field293[var6];
                                            if (!var3.field386) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var6 > 0) {
                                                    Tile var9 = this.field293[var6 - 1][var4][var5];
                                                    if (var9 != null && var9.field387) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= field305 && var4 > field301) {
                                                    Tile var10 = var8[var4 - 1][var5];
                                                    if (var10 != null && var10.field387 && (var10.field386 || (var3.field384 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= field305 && var4 < field302 - 1) {
                                                    Tile var11 = var8[var4 + 1][var5];
                                                    if (var11 != null && var11.field387 && (var11.field386 || (var3.field384 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 <= field306 && var5 > field303) {
                                                    Tile var12 = var8[var4][var5 - 1];
                                                    if (var12 != null && var12.field387 && (var12.field386 || (var3.field384 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 >= field306 && var5 < field304 - 1) {
                                                    Tile var13 = var8[var4][var5 + 1];
                                                    if (var13 != null && var13.field387 && (var13.field386 || (var3.field384 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var3.field386 = false;
                                            if (var3.field393 != null) {
                                                Tile var14 = var3.field393;
                                                if (var14.field375 == null) {
                                                    if (var14.field376 != null && !this.method96(0, var4, var5)) {
                                                        this.method92(field313, var5, field310, field312, var14.field376, field311, var4, true);
                                                    }
                                                } else if (!this.method96(0, var4, var5)) {
                                                    this.method91(var14.field375, 0, field310, field311, field312, field313, var4, var5);
                                                }
                                                Wall var15 = var14.field377;
                                                if (var15 != null) {
                                                    var15.field276.method108(0, field310, field311, field312, field313, var15.field272 - field307, var15.field271 - field308, var15.field273 - field309, var15.field278);
                                                }
                                                for (int var16 = 0; var16 < var14.field381; var16++) {
                                                    Location var17 = var14.field382[var16];
                                                    if (var17 != null) {
                                                        var17.field261.method108(var17.field262, field310, field311, field312, field313, var17.field259 - field307, var17.field258 - field308, var17.field260 - field309, var17.field269);
                                                    }
                                                }
                                            }
                                            boolean var18 = false;
                                            if (var3.field375 == null) {
                                                if (var3.field376 != null && !this.method96(var7, var4, var5)) {
                                                    var18 = true;
                                                    this.method92(field313, var5, field310, field312, var3.field376, field311, var4, true);
                                                }
                                            } else if (!this.method96(var7, var4, var5)) {
                                                var18 = true;
                                                this.method91(var3.field375, var7, field310, field311, field312, field313, var4, var5);
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            Wall var21 = var3.field377;
                                            Decor var22 = var3.field378;
                                            if (var21 != null || var22 != null) {
                                                if (field305 == var4) {
                                                    var19++;
                                                } else if (field305 < var4) {
                                                    var19 += 2;
                                                }
                                                if (field306 == var5) {
                                                    var19 += 3;
                                                } else if (field306 > var5) {
                                                    var19 += 6;
                                                }
                                                var20 = field330[var19];
                                                var3.field392 = field332[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field274 & field331[var19]) == 0) {
                                                    var3.field389 = 0;
                                                } else if (var21.field274 == 16) {
                                                    var3.field389 = 3;
                                                    var3.field390 = field333[var19];
                                                    var3.field391 = 3 - var3.field390;
                                                } else if (var21.field274 == 32) {
                                                    var3.field389 = 6;
                                                    var3.field390 = field334[var19];
                                                    var3.field391 = 6 - var3.field390;
                                                } else if (var21.field274 == 64) {
                                                    var3.field389 = 12;
                                                    var3.field390 = field335[var19];
                                                    var3.field391 = 12 - var3.field390;
                                                } else {
                                                    var3.field389 = 9;
                                                    var3.field390 = field336[var19];
                                                    var3.field391 = 9 - var3.field390;
                                                }
                                                if ((var21.field274 & var20) != 0 && !this.method97(var7, var4, var5, var21.field274)) {
                                                    var21.field276.method108(0, field310, field311, field312, field313, var21.field272 - field307, var21.field271 - field308, var21.field273 - field309, var21.field278);
                                                }
                                                if ((var21.field275 & var20) != 0 && !this.method97(var7, var4, var5, var21.field275)) {
                                                    var21.field277.method108(0, field310, field311, field312, field313, var21.field272 - field307, var21.field271 - field308, var21.field273 - field309, var21.field278);
                                                }
                                            }
                                            if (var22 != null && !this.method98(var7, var4, var5, var22.field168.field398)) {
                                                if ((var22.field166 & var20) != 0) {
                                                    var22.field168.method108(var22.field167, field310, field311, field312, field313, var22.field164 - field307, var22.field163 - field308, var22.field165 - field309, var22.field169);
                                                } else if ((var22.field166 & 0x300) != 0) {
                                                    int var23 = var22.field164 - field307;
                                                    int var24 = var22.field163 - field308;
                                                    int var25 = var22.field165 - field309;
                                                    int var26 = var22.field167;
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
                                                    if ((var22.field166 & 0x100) != 0 && var28 < var27) {
                                                        int var29 = field315[var26] + var23;
                                                        int var30 = field316[var26] + var25;
                                                        var22.field168.method108(var26 * 512 + 256, field310, field311, field312, field313, var29, var24, var30, var22.field169);
                                                    }
                                                    if ((var22.field166 & 0x200) != 0 && var28 > var27) {
                                                        int var31 = field317[var26] + var23;
                                                        int var32 = field318[var26] + var25;
                                                        var22.field168.method108(var26 * 512 + 1280 & 0x7FF, field310, field311, field312, field313, var31, var24, var32, var22.field169);
                                                    }
                                                }
                                            }
                                            if (var18) {
                                                GroundDecor var33 = var3.field379;
                                                if (var33 != null) {
                                                    var33.field200.method108(0, field310, field311, field312, field313, var33.field198 - field307, var33.field197 - field308, var33.field199 - field309, var33.field201);
                                                }
                                                GroundObject var34 = var3.field380;
                                                if (var34 != null && var34.field210 == 0) {
                                                    if (var34.field207 != null) {
                                                        var34.field207.method108(0, field310, field311, field312, field313, var34.field204 - field307, var34.field203 - field308, var34.field205 - field309, var34.field209);
                                                    }
                                                    if (var34.field208 != null) {
                                                        var34.field208.method108(0, field310, field311, field312, field313, var34.field204 - field307, var34.field203 - field308, var34.field205 - field309, var34.field209);
                                                    }
                                                    if (var34.field206 != null) {
                                                        var34.field206.method108(0, field310, field311, field312, field313, var34.field204 - field307, var34.field203 - field308, var34.field205 - field309, var34.field209);
                                                    }
                                                }
                                            }
                                            int var35 = var3.field384;
                                            if (var35 != 0) {
                                                if (var4 < field305 && (var35 & 0x4) != 0) {
                                                    Tile var36 = var8[var4 + 1][var5];
                                                    if (var36 != null && var36.field387) {
                                                        field329.method245(var36);
                                                    }
                                                }
                                                if (var5 < field306 && (var35 & 0x2) != 0) {
                                                    Tile var37 = var8[var4][var5 + 1];
                                                    if (var37 != null && var37.field387) {
                                                        field329.method245(var37);
                                                    }
                                                }
                                                if (var4 > field305 && (var35 & 0x1) != 0) {
                                                    Tile var38 = var8[var4 - 1][var5];
                                                    if (var38 != null && var38.field387) {
                                                        field329.method245(var38);
                                                    }
                                                }
                                                if (var5 > field306 && (var35 & 0x8) != 0) {
                                                    Tile var39 = var8[var4][var5 - 1];
                                                    if (var39 != null && var39.field387) {
                                                        field329.method245(var39);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var3.field389 != 0) {
                                            boolean var40 = true;
                                            for (int var41 = 0; var41 < var3.field381; var41++) {
                                                if (field300 != var3.field382[var41].field268 && (var3.field383[var41] & var3.field389) == var3.field390) {
                                                    var40 = false;
                                                    break;
                                                }
                                            }
                                            if (var40) {
                                                Wall var42 = var3.field377;
                                                if (!this.method97(var7, var4, var5, var42.field274)) {
                                                    var42.field276.method108(0, field310, field311, field312, field313, var42.field272 - field307, var42.field271 - field308, var42.field273 - field309, var42.field278);
                                                }
                                                var3.field389 = 0;
                                            }
                                        }
                                        if (!var3.field388) {
                                            break;
                                        }
                                        try {
                                            int var43 = var3.field381;
                                            var3.field388 = false;
                                            int var44 = 0;
                                            label559: for (int var45 = 0; var45 < var43; var45++) {
                                                Location var46 = var3.field382[var45];
                                                if (field300 != var46.field268) {
                                                    for (int var47 = var46.field263; var47 <= var46.field264; var47++) {
                                                        for (int var48 = var46.field265; var48 <= var46.field266; var48++) {
                                                            Tile var49 = var8[var47][var48];
                                                            if (var49.field386) {
                                                                var3.field388 = true;
                                                                continue label559;
                                                            }
                                                            if (var49.field389 != 0) {
                                                                int var50 = 0;
                                                                if (var47 > var46.field263) {
                                                                    var50++;
                                                                }
                                                                if (var47 < var46.field264) {
                                                                    var50 += 4;
                                                                }
                                                                if (var48 > var46.field265) {
                                                                    var50 += 8;
                                                                }
                                                                if (var48 < var46.field266) {
                                                                    var50 += 2;
                                                                }
                                                                if ((var50 & var49.field389) == var3.field391) {
                                                                    var3.field388 = true;
                                                                    continue label559;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    field314[var44++] = var46;
                                                    int var51 = field305 - var46.field263;
                                                    int var52 = var46.field264 - field305;
                                                    if (var52 > var51) {
                                                        var51 = var52;
                                                    }
                                                    int var53 = field306 - var46.field265;
                                                    int var54 = var46.field266 - field306;
                                                    if (var54 > var53) {
                                                        var46.field267 = var51 + var54;
                                                    } else {
                                                        var46.field267 = var51 + var53;
                                                    }
                                                }
                                            }
                                            while (var44 > 0) {
                                                int var55 = -50;
                                                int var56 = -1;
                                                for (int var57 = 0; var57 < var44; var57++) {
                                                    Location var58 = field314[var57];
                                                    if (field300 != var58.field268) {
                                                        if (var58.field267 > var55) {
                                                            var55 = var58.field267;
                                                            var56 = var57;
                                                        } else if (var58.field267 == var55) {
                                                            int var59 = var58.field259 - field307;
                                                            int var60 = var58.field260 - field309;
                                                            int var61 = field314[var56].field259 - field307;
                                                            int var62 = field314[var56].field260 - field309;
                                                            if (var59 * var59 + var60 * var60 > var61 * var61 + var62 * var62) {
                                                                var56 = var57;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var56 == -1) {
                                                    break;
                                                }
                                                Location var63 = field314[var56];
                                                var63.field268 = field300;
                                                if (!this.method99(var7, var63.field263, var63.field264, var63.field265, var63.field266, var63.field261.field398)) {
                                                    var63.field261.method108(var63.field262, field310, field311, field312, field313, var63.field259 - field307, var63.field258 - field308, var63.field260 - field309, var63.field269);
                                                }
                                                for (int var64 = var63.field263; var64 <= var63.field264; var64++) {
                                                    for (int var65 = var63.field265; var65 <= var63.field266; var65++) {
                                                        Tile var66 = var8[var64][var65];
                                                        if (var66.field389 != 0) {
                                                            field329.method245(var66);
                                                        } else if ((var4 != var64 || var5 != var65) && var66.field387) {
                                                            field329.method245(var66);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var3.field388) {
                                                break;
                                            }
                                        } catch (Exception var89) {
                                            var3.field388 = false;
                                            break;
                                        }
                                    }
                                } while (!var3.field387);
                            } while (var3.field389 != 0);
                            if (var4 > field305 || var4 <= field301) {
                                break;
                            }
                            var67 = var8[var4 - 1][var5];
                        } while (var67 != null && var67.field387);
                        if (var4 < field305 || var4 >= field302 - 1) {
                            break;
                        }
                        var68 = var8[var4 + 1][var5];
                    } while (var68 != null && var68.field387);
                    if (var5 > field306 || var5 <= field303) {
                        break;
                    }
                    var69 = var8[var4][var5 - 1];
                } while (var69 != null && var69.field387);
                if (var5 < field306 || var5 >= field304 - 1) {
                    break;
                }
                var70 = var8[var4][var5 + 1];
            } while (var70 != null && var70.field387);
            var3.field387 = false;
            field298--;
            GroundObject var71 = var3.field380;
            if (var71 != null && var71.field210 != 0) {
                if (var71.field207 != null) {
                    var71.field207.method108(0, field310, field311, field312, field313, var71.field204 - field307, var71.field203 - field308 - var71.field210, var71.field205 - field309, var71.field209);
                }
                if (var71.field208 != null) {
                    var71.field208.method108(0, field310, field311, field312, field313, var71.field204 - field307, var71.field203 - field308 - var71.field210, var71.field205 - field309, var71.field209);
                }
                if (var71.field206 != null) {
                    var71.field206.method108(0, field310, field311, field312, field313, var71.field204 - field307, var71.field203 - field308 - var71.field210, var71.field205 - field309, var71.field209);
                }
            }
            if (var3.field392 != 0) {
                Decor var72 = var3.field378;
                if (var72 != null && !this.method98(var7, var4, var5, var72.field168.field398)) {
                    if ((var72.field166 & var3.field392) != 0) {
                        var72.field168.method108(var72.field167, field310, field311, field312, field313, var72.field164 - field307, var72.field163 - field308, var72.field165 - field309, var72.field169);
                    } else if ((var72.field166 & 0x300) != 0) {
                        int var73 = var72.field164 - field307;
                        int var74 = var72.field163 - field308;
                        int var75 = var72.field165 - field309;
                        int var76 = var72.field167;
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
                        if ((var72.field166 & 0x100) != 0 && var78 >= var77) {
                            int var79 = field315[var76] + var73;
                            int var80 = field316[var76] + var75;
                            var72.field168.method108(var76 * 512 + 256, field310, field311, field312, field313, var79, var74, var80, var72.field169);
                        }
                        if ((var72.field166 & 0x200) != 0 && var78 <= var77) {
                            int var81 = field317[var76] + var73;
                            int var82 = field318[var76] + var75;
                            var72.field168.method108(var76 * 512 + 1280 & 0x7FF, field310, field311, field312, field313, var81, var74, var82, var72.field169);
                        }
                    }
                }
                Wall var83 = var3.field377;
                if (var83 != null) {
                    if ((var83.field275 & var3.field392) != 0 && !this.method97(var7, var4, var5, var83.field275)) {
                        var83.field277.method108(0, field310, field311, field312, field313, var83.field272 - field307, var83.field271 - field308, var83.field273 - field309, var83.field278);
                    }
                    if ((var83.field274 & var3.field392) != 0 && !this.method97(var7, var4, var5, var83.field274)) {
                        var83.field276.method108(0, field310, field311, field312, field313, var83.field272 - field307, var83.field271 - field308, var83.field273 - field309, var83.field278);
                    }
                }
            }
            if (var6 < this.field289 - 1) {
                Tile var84 = this.field293[var6 + 1][var4][var5];
                if (var84 != null && var84.field387) {
                    field329.method245(var84);
                }
            }
            if (var4 < field305) {
                Tile var85 = var8[var4 + 1][var5];
                if (var85 != null && var85.field387) {
                    field329.method245(var85);
                }
            }
            if (var5 < field306) {
                Tile var86 = var8[var4][var5 + 1];
                if (var86 != null && var86.field387) {
                    field329.method245(var86);
                }
            }
            if (var4 > field305) {
                Tile var87 = var8[var4 - 1][var5];
                if (var87 != null && var87.field387) {
                    field329.method245(var87);
                }
            }
            if (var5 > field306) {
                Tile var88 = var8[var4][var5 - 1];
                if (var88 != null && var88.field387) {
                    field329.method245(var88);
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lo;IIIIIII)V")
    public void method91(TileUnderlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9;
        int var10 = var9 = (arg6 << 7) - field307;
        int var11;
        int var12 = var11 = (arg7 << 7) - field309;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = this.field292[arg1][arg6][arg7] - field308;
        int var18 = this.field292[arg1][arg6 + 1][arg7] - field308;
        int var19 = this.field292[arg1][arg6 + 1][arg7 + 1] - field308;
        int var20 = this.field292[arg1][arg6][arg7 + 1] - field308;
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
        int var45 = (var21 << 9) / var25 + Pix3D.field644;
        int var46 = (var24 << 9) / var25 + Pix3D.field645;
        int var47 = (var27 << 9) / var31 + Pix3D.field644;
        int var48 = (var30 << 9) / var31 + Pix3D.field645;
        int var49 = (var33 << 9) / var37 + Pix3D.field644;
        int var50 = (var36 << 9) / var37 + Pix3D.field645;
        int var51 = (var39 << 9) / var43 + Pix3D.field644;
        int var52 = (var42 << 9) / var43 + Pix3D.field645;
        Pix3D.field643 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            Pix3D.field640 = false;
            if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > Pix2D.field634 || var51 > Pix2D.field634 || var47 > Pix2D.field634) {
                Pix3D.field640 = true;
            }
            if (field319 && this.method94(field320, field321, var50, var52, var48, var49, var51, var47)) {
                field322 = arg6;
                field323 = arg7;
            }
            if (arg0.field254 == -1) {
                if (arg0.field252 != 12345678) {
                    Pix3D.method175(var50, var52, var48, var49, var51, var47, arg0.field252, arg0.field253, arg0.field251);
                }
            } else if (field288) {
                int var53 = field337[arg0.field254];
                Pix3D.method175(var50, var52, var48, var49, var51, var47, this.method93(true, var53, arg0.field252), this.method93(true, var53, arg0.field253), this.method93(true, var53, arg0.field251));
            } else if (arg0.field255) {
                Pix3D.method179(var50, var52, var48, var49, var51, var47, arg0.field252, arg0.field253, arg0.field251, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field254);
            } else {
                Pix3D.method179(var50, var52, var48, var49, var51, var47, arg0.field252, arg0.field253, arg0.field251, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field254);
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        Pix3D.field640 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Pix2D.field634 || var47 > Pix2D.field634 || var51 > Pix2D.field634) {
            Pix3D.field640 = true;
        }
        if (field319 && this.method94(field320, field321, var46, var48, var52, var45, var47, var51)) {
            field322 = arg6;
            field323 = arg7;
        }
        if (arg0.field254 != -1) {
            if (!field288) {
                Pix3D.method179(var46, var48, var52, var45, var47, var51, arg0.field250, arg0.field251, arg0.field253, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field254);
                return;
            }
            int var54 = field337[arg0.field254];
            Pix3D.method175(var46, var48, var52, var45, var47, var51, this.method93(true, var54, arg0.field250), this.method93(true, var54, arg0.field251), this.method93(true, var54, arg0.field253));
        } else if (arg0.field250 != 12345678) {
            Pix3D.method175(var46, var48, var52, var45, var47, var51, arg0.field250, arg0.field251, arg0.field253);
            return;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIILi;IIZ)V")
    public void method92(int arg0, int arg1, int arg2, int arg3, TileOverlay arg4, int arg5, int arg6, boolean arg7) {
        int var9 = arg4.field172.length;
        for (int var10 = 0; var10 < var9; var10++) {
            int var23 = arg4.field172[var10] - field307;
            int var24 = arg4.field173[var10] - field308;
            int var25 = arg4.field174[var10] - field309;
            int var26 = arg0 * var23 + arg3 * var25 >> 16;
            int var27 = arg0 * var25 - arg3 * var23 >> 16;
            int var29 = arg5 * var24 - arg2 * var27 >> 16;
            int var30 = arg2 * var24 + arg5 * var27 >> 16;
            if (var30 < 50) {
                return;
            }
            if (arg4.field181 != null) {
                TileOverlay.field189[var10] = var26;
                TileOverlay.field190[var10] = var29;
                TileOverlay.field191[var10] = var30;
            }
            TileOverlay.field187[var10] = (var26 << 9) / var30 + Pix3D.field644;
            TileOverlay.field188[var10] = (var29 << 9) / var30 + Pix3D.field645;
        }
        if (!arg7) {
            this.field287 = 142;
        }
        Pix3D.field643 = 0;
        int var11 = arg4.field178.length;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = arg4.field178[var12];
            int var14 = arg4.field179[var12];
            int var15 = arg4.field180[var12];
            int var16 = TileOverlay.field187[var13];
            int var17 = TileOverlay.field187[var14];
            int var18 = TileOverlay.field187[var15];
            int var19 = TileOverlay.field188[var13];
            int var20 = TileOverlay.field188[var14];
            int var21 = TileOverlay.field188[var15];
            if ((var16 - var17) * (var21 - var20) - (var18 - var17) * (var19 - var20) > 0) {
                Pix3D.field640 = false;
                if (var16 < 0 || var17 < 0 || var18 < 0 || var16 > Pix2D.field634 || var17 > Pix2D.field634 || var18 > Pix2D.field634) {
                    Pix3D.field640 = true;
                }
                if (field319 && this.method94(field320, field321, var19, var20, var21, var16, var17, var18)) {
                    field322 = arg6;
                    field323 = arg1;
                }
                if (arg4.field181 == null || arg4.field181[var12] == -1) {
                    if (arg4.field175[var12] != 12345678) {
                        Pix3D.method175(var19, var20, var21, var16, var17, var18, arg4.field175[var12], arg4.field176[var12], arg4.field177[var12]);
                    }
                } else if (field288) {
                    int var22 = field337[arg4.field181[var12]];
                    Pix3D.method175(var19, var20, var21, var16, var17, var18, this.method93(true, var22, arg4.field175[var12]), this.method93(true, var22, arg4.field176[var12]), this.method93(true, var22, arg4.field177[var12]));
                } else if (arg4.field182) {
                    Pix3D.method179(var19, var20, var21, var16, var17, var18, arg4.field175[var12], arg4.field176[var12], arg4.field177[var12], TileOverlay.field189[0], TileOverlay.field189[1], TileOverlay.field189[3], TileOverlay.field190[0], TileOverlay.field190[1], TileOverlay.field190[3], TileOverlay.field191[0], TileOverlay.field191[1], TileOverlay.field191[3], arg4.field181[var12]);
                } else {
                    Pix3D.method179(var19, var20, var21, var16, var17, var18, arg4.field175[var12], arg4.field176[var12], arg4.field177[var12], TileOverlay.field189[var13], TileOverlay.field189[var14], TileOverlay.field189[var15], TileOverlay.field190[var13], TileOverlay.field190[var14], TileOverlay.field190[var15], TileOverlay.field191[var13], TileOverlay.field191[var14], TileOverlay.field191[var15], arg4.field181[var12]);
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ZII)I")
    public int method93(boolean arg0, int arg1, int arg2) {
        int var4 = 127 - arg2;
        if (!arg0) {
            return this.field282;
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

    @OriginalMember(owner = "r", name = "b", descriptor = "(B)V")
    private void method95(byte arg0) {
        int var2 = field325[field299];
        Occlude[] var3 = field326[field299];
        field327 = 0;
        if (arg0 != -120) {
            this.field281 = -404;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            Occlude var5 = var3[var4];
            if (var5.field232 == 1) {
                int var6 = var5.field228 + 25 - field305;
                if (var6 >= 0 && var6 <= 50) {
                    int var7 = var5.field230 + 25 - field306;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = var5.field231 + 25 - field306;
                    if (var8 > 50) {
                        var8 = 50;
                    }
                    boolean var9 = false;
                    while (var7 <= var8) {
                        if (field344[var6][var7++]) {
                            var9 = true;
                            break;
                        }
                    }
                    if (var9) {
                        int var10 = field307 - var5.field233;
                        if (var10 > 32) {
                            var5.field239 = 1;
                        } else {
                            if (var10 >= -32) {
                                continue;
                            }
                            var5.field239 = 2;
                            var10 = -var10;
                        }
                        var5.field242 = (var5.field235 - field309 << 8) / var10;
                        var5.field243 = (var5.field236 - field309 << 8) / var10;
                        var5.field244 = (var5.field237 - field308 << 8) / var10;
                        var5.field245 = (var5.field238 - field308 << 8) / var10;
                        field328[field327++] = var5;
                    }
                }
            } else if (var5.field232 == 2) {
                int var11 = var5.field230 + 25 - field306;
                if (var11 >= 0 && var11 <= 50) {
                    int var12 = var5.field228 + 25 - field305;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = var5.field229 + 25 - field305;
                    if (var13 > 50) {
                        var13 = 50;
                    }
                    boolean var14 = false;
                    while (var12 <= var13) {
                        if (field344[var12++][var11]) {
                            var14 = true;
                            break;
                        }
                    }
                    if (var14) {
                        int var15 = field309 - var5.field235;
                        if (var15 > 32) {
                            var5.field239 = 3;
                        } else {
                            if (var15 >= -32) {
                                continue;
                            }
                            var5.field239 = 4;
                            var15 = -var15;
                        }
                        var5.field240 = (var5.field233 - field307 << 8) / var15;
                        var5.field241 = (var5.field234 - field307 << 8) / var15;
                        var5.field244 = (var5.field237 - field308 << 8) / var15;
                        var5.field245 = (var5.field238 - field308 << 8) / var15;
                        field328[field327++] = var5;
                    }
                }
            } else if (var5.field232 == 4) {
                int var16 = var5.field237 - field308;
                if (var16 > 128) {
                    int var17 = var5.field230 + 25 - field306;
                    if (var17 < 0) {
                        var17 = 0;
                    }
                    int var18 = var5.field231 + 25 - field306;
                    if (var18 > 50) {
                        var18 = 50;
                    }
                    if (var17 <= var18) {
                        int var19 = var5.field228 + 25 - field305;
                        if (var19 < 0) {
                            var19 = 0;
                        }
                        int var20 = var5.field229 + 25 - field305;
                        if (var20 > 50) {
                            var20 = 50;
                        }
                        boolean var21 = false;
                        label149: for (int var22 = var19; var22 <= var20; var22++) {
                            for (int var23 = var17; var23 <= var18; var23++) {
                                if (field344[var22][var23]) {
                                    var21 = true;
                                    break label149;
                                }
                            }
                        }
                        if (var21) {
                            var5.field239 = 5;
                            var5.field240 = (var5.field233 - field307 << 8) / var16;
                            var5.field241 = (var5.field234 - field307 << 8) / var16;
                            var5.field242 = (var5.field235 - field309 << 8) / var16;
                            var5.field243 = (var5.field236 - field309 << 8) / var16;
                            field328[field327++] = var5;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "f", descriptor = "(III)Z")
    private boolean method96(int arg0, int arg1, int arg2) {
        int var4 = this.field297[arg0][arg1][arg2];
        if (-field300 == var4) {
            return false;
        } else if (field300 == var4) {
            return true;
        } else {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            if (this.method100(var5 + 1, this.field292[arg0][arg1][arg2], var6 + 1) && this.method100(var5 + 128 - 1, this.field292[arg0][arg1 + 1][arg2], var6 + 1) && this.method100(var5 + 128 - 1, this.field292[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.method100(var5 + 1, this.field292[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
                this.field297[arg0][arg1][arg2] = field300;
                return true;
            } else {
                this.field297[arg0][arg1][arg2] = -field300;
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
        int var7 = this.field292[arg0][arg1][arg2] - 1;
        int var8 = var7 - 120;
        int var9 = var7 - 230;
        int var10 = var7 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var5 > field307) {
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
                if (var6 < field309) {
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
                if (var5 < field307) {
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
                if (var6 > field309) {
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
            return this.method100(var5 + 1, this.field292[arg0][arg1][arg2] - arg3, var6 + 1) && this.method100(var5 + 128 - 1, this.field292[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method100(var5 + 128 - 1, this.field292[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method100(var5 + 1, this.field292[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIII)Z")
    private boolean method99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var9 = arg1; var9 <= arg2; var9++) {
                for (int var15 = arg3; var15 <= arg4; var15++) {
                    if (this.field297[arg0][var9][var15] == -field300) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = this.field292[arg0][arg1][arg3] - arg5;
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
            return this.method100(var7 + 1, this.field292[arg0][arg1][arg3] - arg5, var8 + 1) && this.method100(var7 + 128 - 1, this.field292[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.method100(var7 + 128 - 1, this.field292[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.method100(var7 + 1, this.field292[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "g", descriptor = "(III)Z")
    private boolean method100(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < field327; var4++) {
            Occlude var5 = field328[var4];
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
