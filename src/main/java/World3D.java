import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("r")
public class World3D {

    @OriginalMember(owner = "r", name = "a", descriptor = "Z")
    private boolean field278 = true;

    @OriginalMember(owner = "r", name = "b", descriptor = "I")
    private int field279 = 8;

    @OriginalMember(owner = "r", name = "c", descriptor = "B")
    private byte field280 = 2;

    @OriginalMember(owner = "r", name = "d", descriptor = "Z")
    private boolean field281 = false;

    @OriginalMember(owner = "r", name = "e", descriptor = "I")
    private int field282 = 344;

    @OriginalMember(owner = "r", name = "f", descriptor = "I")
    private int field283 = 25762;

    @OriginalMember(owner = "r", name = "g", descriptor = "Z")
    private boolean field284 = true;

    @OriginalMember(owner = "r", name = "p", descriptor = "[Lp;")
    public Location[] field293 = new Location[5000];

    @OriginalMember(owner = "r", name = "fb", descriptor = "[I")
    public int[] field335 = new int[10000];

    @OriginalMember(owner = "r", name = "gb", descriptor = "[I")
    public int[] field336 = new int[10000];

    @OriginalMember(owner = "r", name = "ib", descriptor = "[[I")
    public int[][] field338 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "r", name = "jb", descriptor = "[[I")
    public int[][] field339 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "r", name = "i", descriptor = "I")
    public int field286;

    @OriginalMember(owner = "r", name = "j", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "r", name = "k", descriptor = "I")
    public int field288;

    @OriginalMember(owner = "r", name = "m", descriptor = "[[[Lv;")
    public Tile[][][] field290;

    @OriginalMember(owner = "r", name = "q", descriptor = "[[[I")
    public int[][][] field294;

    @OriginalMember(owner = "r", name = "l", descriptor = "[[[I")
    public int[][][] field289;

    @OriginalMember(owner = "r", name = "h", descriptor = "Z")
    public static boolean field285 = true;

    @OriginalMember(owner = "r", name = "H", descriptor = "[Lp;")
    public static Location[] field311 = new Location[100];

    @OriginalMember(owner = "r", name = "I", descriptor = "[I")
    public static final int[] field312 = new int[] { 53, -53, -53, 53 };

    @OriginalMember(owner = "r", name = "J", descriptor = "[I")
    public static final int[] field313 = new int[] { -53, -53, 53, 53 };

    @OriginalMember(owner = "r", name = "K", descriptor = "[I")
    public static final int[] field314 = new int[] { -45, 45, 45, -45 };

    @OriginalMember(owner = "r", name = "L", descriptor = "[I")
    public static final int[] field315 = new int[] { 45, 45, -45, -45 };

    @OriginalMember(owner = "r", name = "P", descriptor = "I")
    public static int field319 = -1;

    @OriginalMember(owner = "r", name = "Q", descriptor = "I")
    public static int field320 = -1;

    @OriginalMember(owner = "r", name = "R", descriptor = "I")
    public static int field321 = 4;

    @OriginalMember(owner = "r", name = "S", descriptor = "[I")
    public static int[] field322 = new int[field321];

    @OriginalMember(owner = "r", name = "T", descriptor = "[[Lm;")
    public static Occlude[][] field323 = new Occlude[field321][500];

    @OriginalMember(owner = "r", name = "V", descriptor = "[Lm;")
    public static Occlude[] field325 = new Occlude[500];

    @OriginalMember(owner = "r", name = "W", descriptor = "Lob;")
    public static LinkList field326 = new LinkList(0);

    @OriginalMember(owner = "r", name = "X", descriptor = "[I")
    public static final int[] field327 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "r", name = "Y", descriptor = "[I")
    public static final int[] field328 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "r", name = "Z", descriptor = "[I")
    public static final int[] field329 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "r", name = "ab", descriptor = "[I")
    public static final int[] field330 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "r", name = "bb", descriptor = "[I")
    public static final int[] field331 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "r", name = "cb", descriptor = "[I")
    public static final int[] field332 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "r", name = "db", descriptor = "[I")
    public static final int[] field333 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "r", name = "eb", descriptor = "[I")
    public static final int[] field334 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

    @OriginalMember(owner = "r", name = "kb", descriptor = "[[[[Z")
    public static boolean[][][][] field340 = new boolean[8][32][51][51];

    @OriginalMember(owner = "r", name = "n", descriptor = "I")
    public int field291;

    @OriginalMember(owner = "r", name = "o", descriptor = "I")
    public int field292;

    @OriginalMember(owner = "r", name = "r", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "r", name = "s", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "r", name = "t", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "r", name = "u", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "r", name = "v", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "r", name = "w", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "r", name = "x", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "r", name = "y", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "r", name = "z", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "r", name = "A", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "r", name = "B", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "r", name = "C", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "r", name = "D", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "r", name = "E", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "r", name = "F", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "r", name = "G", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "r", name = "N", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "r", name = "O", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "r", name = "U", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "r", name = "hb", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "r", name = "mb", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "r", name = "nb", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "r", name = "ob", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "r", name = "pb", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "r", name = "qb", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "r", name = "rb", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "r", name = "M", descriptor = "Z")
    public static boolean field316;

    @OriginalMember(owner = "r", name = "lb", descriptor = "[[Z")
    public static boolean[][] field341;

    @OriginalMember(owner = "r", name = "<init>", descriptor = "([[[IBIII)V")
    public World3D(int[][][] arg0, byte arg1, int arg2, int arg3, int arg4) {
        this.field286 = arg4;
        this.field287 = arg2;
        this.field288 = arg3;
        this.field290 = new Tile[arg4][arg2][arg3];
        this.field294 = new int[arg4][arg2 + 1][arg3 + 1];
        this.field289 = arg0;
        if (arg1 != 92) {
            this.field284 = !this.field284;
        }
        this.method50(880);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(I)V")
    public static void method49(int arg0) {
        field311 = null;
        if (arg0 != 0) {
            return;
        }
        field322 = null;
        field323 = null;
        field326 = null;
        field340 = null;
        field341 = null;
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(I)V")
    public void method50(int arg0) {
        for (int var2 = 0; var2 < this.field286; var2++) {
            for (int var8 = 0; var8 < this.field287; var8++) {
                for (int var9 = 0; var9 < this.field288; var9++) {
                    this.field290[var2][var8][var9] = null;
                }
            }
        }
        for (int var3 = 0; var3 < field321; var3++) {
            for (int var7 = 0; var7 < field322[var3]; var7++) {
                field323[var3][var7] = null;
            }
            field322[var3] = 0;
        }
        int var4 = 15 / arg0;
        for (int var5 = 0; var5 < this.field292; var5++) {
            this.field293[var5] = null;
        }
        this.field292 = 0;
        for (int var6 = 0; var6 < field311.length; var6++) {
            field311[var6] = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(II)V")
    public void method51(int arg0, int arg1) {
        this.field291 = arg0;
        for (int var3 = 0; var3 < this.field287; var3++) {
            for (int var5 = 0; var5 < this.field288; var5++) {
                this.field290[arg0][var3][var5] = new Tile(arg0, var3, var5);
            }
        }
        int var4 = 53 / arg1;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ZII)V")
    public void method52(boolean arg0, int arg1, int arg2) {
        Tile var4 = this.field290[0][arg2][arg1];
        if (arg0) {
            this.field283 = -70;
        }
        for (int var5 = 0; var5 < 3; var5++) {
            Tile var6 = this.field290[var5][arg2][arg1] = this.field290[var5 + 1][arg2][arg1];
            if (var6 != null) {
                var6.field366--;
                for (int var7 = 0; var7 < var6.field376; var7++) {
                    Location var8 = var6.field377[var7];
                    if ((var8.field267 >> 29 & 0x3) == 2 && var8.field261 == arg2 && var8.field263 == arg1) {
                        var8.field255--;
                    }
                }
            }
        }
        if (this.field290[0][arg2][arg1] == null) {
            this.field290[0][arg2][arg1] = new Tile(0, arg2, arg1);
        }
        this.field290[0][arg2][arg1].field388 = var4;
        this.field290[3][arg2][arg1] = null;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIII)V")
    public static void method53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Occlude var9 = new Occlude();
        var9.field226 = arg1 / 128;
        var9.field227 = arg4 / 128;
        var9.field228 = arg2 / 128;
        var9.field229 = arg0 / 128;
        var9.field230 = arg8;
        var9.field231 = arg1;
        var9.field232 = arg4;
        var9.field233 = arg2;
        var9.field234 = arg0;
        var9.field235 = arg7;
        var9.field236 = arg6;
        if (arg3 != -45222) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        field323[arg5][field322[arg5]++] = var9;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIII)V")
    public void method54(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field290[arg0][arg1][arg2];
        if (var5 != null) {
            this.field290[arg0][arg1][arg2].field380 = arg3;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public void method55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            TileUnderlay var21 = new TileUnderlay(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var22 = arg0; var22 >= 0; var22--) {
                if (this.field290[var22][arg1][arg2] == null) {
                    this.field290[var22][arg1][arg2] = new Tile(var22, arg1, arg2);
                }
            }
            this.field290[arg0][arg1][arg2].field370 = var21;
        } else if (arg3 == 1) {
            TileUnderlay var23 = new TileUnderlay(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var24 = arg0; var24 >= 0; var24--) {
                if (this.field290[var24][arg1][arg2] == null) {
                    this.field290[var24][arg1][arg2] = new Tile(var24, arg1, arg2);
                }
            }
            this.field290[arg0][arg1][arg2].field370 = var23;
        } else {
            TileOverlay var25 = new TileOverlay(arg13, arg16, arg7, arg4, arg9, arg15, arg3, arg10, 0, arg18, arg11, arg2, arg17, arg19, arg12, arg14, arg6, arg5, arg8, arg1);
            for (int var26 = arg0; var26 >= 0; var26--) {
                if (this.field290[var26][arg1][arg2] == null) {
                    this.field290[var26][arg1][arg2] = new Tile(var26, arg1, arg2);
                }
            }
            this.field290[arg0][arg1][arg2].field371 = var25;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIZILx;BII)V")
    public void method56(int arg0, int arg1, boolean arg2, int arg3, Entity arg4, byte arg5, int arg6, int arg7) {
        if (!arg2 || arg4 == null) {
            return;
        }
        GroundDecor var9 = new GroundDecor();
        var9.field198 = arg4;
        var9.field196 = arg1 * 128 + 64;
        var9.field197 = arg3 * 128 + 64;
        var9.field195 = arg7;
        var9.field199 = arg6;
        var9.field200 = arg5;
        if (this.field290[arg0][arg1][arg3] == null) {
            this.field290[arg0][arg1][arg3] = new Tile(arg0, arg1, arg3);
        }
        this.field290[arg0][arg1][arg3].field374 = var9;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lx;IILx;IIIILx;)V")
    public void method57(Entity arg0, int arg1, int arg2, Entity arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8) {
        GroundObject var10 = new GroundObject();
        var10.field204 = arg0;
        var10.field202 = arg4 * 128 + 64;
        var10.field203 = arg5 * 128 + 64;
        var10.field201 = arg2;
        var10.field207 = arg1;
        var10.field205 = arg3;
        var10.field206 = arg8;
        int var11 = 0;
        Tile var12 = this.field290[arg7][arg4][arg5];
        if (var12 != null) {
            for (int var13 = 0; var13 < var12.field376; var13++) {
                if (var12.field377[var13].field259 instanceof Model) {
                    int var14 = ((Model) var12.field377[var13].field259).field569;
                    if (var14 > var11) {
                        var11 = var14;
                    }
                }
            }
        }
        var10.field208 = var11;
        if (arg6 != 280) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
        if (this.field290[arg7][arg4][arg5] == null) {
            this.field290[arg7][arg4][arg5] = new Tile(arg7, arg4, arg5);
        }
        this.field290[arg7][arg4][arg5].field375 = var10;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILx;IILx;IIZIIB)V")
    public void method58(int arg0, Entity arg1, int arg2, int arg3, Entity arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, byte arg10) {
        if (arg1 == null && arg4 == null) {
            return;
        }
        Wall var12 = new Wall();
        var12.field276 = arg9;
        var12.field277 = arg10;
        var12.field270 = arg0 * 128 + 64;
        var12.field271 = arg6 * 128 + 64;
        var12.field269 = arg3;
        if (arg7) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        var12.field274 = arg1;
        var12.field275 = arg4;
        var12.field272 = arg2;
        var12.field273 = arg8;
        for (int var14 = arg5; var14 >= 0; var14--) {
            if (this.field290[var14][arg0][arg6] == null) {
                this.field290[var14][arg0][arg6] = new Tile(var14, arg0, arg6);
            }
        }
        this.field290[arg5][arg0][arg6].field372 = var12;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIILx;IIIB)V")
    public void method59(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Entity arg7, int arg8, int arg9, int arg10, byte arg11) {
        if (arg7 == null) {
            return;
        }
        Decor var13 = new Decor();
        var13.field167 = arg5;
        var13.field168 = arg11;
        var13.field162 = arg2 * 128 + arg0 + 64;
        var13.field163 = arg1 * 128 + arg8 + 64;
        var13.field161 = arg4;
        var13.field166 = arg7;
        while (arg10 >= 0) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
        var13.field164 = arg6;
        var13.field165 = arg3;
        for (int var14 = arg9; var14 >= 0; var14--) {
            if (this.field290[var14][arg2][arg1] == null) {
                this.field290[var14][arg2][arg1] = new Tile(var14, arg2, arg1);
            }
        }
        this.field290[arg9][arg2][arg1].field373 = var13;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IZBIIIIIILx;I)Z")
    public boolean method60(int arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Entity arg9, int arg10) {
        if (arg1) {
            throw new NullPointerException();
        } else if (arg9 == null) {
            return true;
        } else {
            int var12 = arg4 * 64 + arg8 * 128;
            int var13 = arg3 * 128 + arg7 * 64;
            return this.method63(arg6, arg8, arg3, arg4, arg7, var12, var13, arg5, arg9, arg10, false, arg0, arg2);
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIILx;IZIZI)Z")
    public boolean method61(int arg0, int arg1, int arg2, int arg3, Entity arg4, int arg5, boolean arg6, int arg7, boolean arg8, int arg9) {
        if (arg4 == null) {
            return true;
        }
        int var11 = arg2 - arg0;
        int var12 = arg1 - arg0;
        int var13 = arg0 + arg2;
        int var14 = arg0 + arg1;
        if (arg6) {
            if (arg5 > 640 && arg5 < 1408) {
                var14 += 128;
            }
            if (arg5 > 1152 && arg5 < 1920) {
                var13 += 128;
            }
            if (arg5 > 1664 || arg5 < 384) {
                var12 -= 128;
            }
            if (arg5 > 128 && arg5 < 896) {
                var11 -= 128;
            }
        }
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        if (arg8) {
            for (int var17 = 1; var17 > 0; var17++) {
            }
        }
        int var18 = var13 / 128;
        int var19 = var14 / 128;
        return this.method63(arg7, var15, var16, var18 + 1 - var15, var19 - var16 + 1, arg2, arg1, arg3, arg4, arg5, true, arg9, (byte) 0);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIILx;IIII)Z")
    public boolean method62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, int arg10, int arg11, int arg12) {
        if (arg10 != 4882) {
            throw new NullPointerException();
        }
        return arg8 == null ? true : this.method63(arg9, arg2, arg3, arg0 + 1 - arg2, arg4 - arg3 + 1, arg11, arg7, arg1, arg8, arg12, true, arg6, (byte) 0);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIILx;IZIB)Z")
    private boolean method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, boolean arg10, int arg11, byte arg12) {
        for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
            for (int var21 = arg2; var21 < arg2 + arg4; var21++) {
                if (var14 < 0 || var21 < 0 || var14 >= this.field287 || var21 >= this.field288) {
                    return false;
                }
                Tile var22 = this.field290[arg0][var14][var21];
                if (var22 != null && var22.field376 >= 5) {
                    return false;
                }
            }
        }
        Location var15 = new Location();
        var15.field267 = arg11;
        var15.field268 = arg12;
        var15.field255 = arg0;
        var15.field257 = arg5;
        var15.field258 = arg6;
        var15.field256 = arg7;
        var15.field259 = arg8;
        var15.field260 = arg9;
        var15.field261 = arg1;
        var15.field263 = arg2;
        var15.field262 = arg1 + arg3 - 1;
        var15.field264 = arg2 + arg4 - 1;
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
                    if (this.field290[var19][var16][var17] == null) {
                        this.field290[var19][var16][var17] = new Tile(var19, var16, var17);
                    }
                }
                Tile var20 = this.field290[arg0][var16][var17];
                var20.field377[var20.field376] = var15;
                var20.field378[var20.field376] = var18;
                var20.field379 |= var18;
                var20.field376++;
            }
        }
        if (arg10) {
            this.field293[this.field292++] = var15;
        }
        return true;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Z)V")
    public void method64(boolean arg0) {
        for (int var2 = 0; var2 < this.field292; var2++) {
            Location var4 = this.field293[var2];
            this.method65((byte) 5, var4);
            this.field293[var2] = null;
        }
        this.field292 = 0;
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(BLp;)V")
    private void method65(byte arg0, Location arg1) {
        for (int var3 = arg1.field261; var3 <= arg1.field262; var3++) {
            for (int var4 = arg1.field263; var4 <= arg1.field264; var4++) {
                Tile var5 = this.field290[arg1.field255][var3][var4];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field376; var6++) {
                        if (var5.field377[var6] == arg1) {
                            var5.field376--;
                            for (int var7 = var6; var7 < var5.field376; var7++) {
                                var5.field377[var7] = var5.field377[var7 + 1];
                                var5.field378[var7] = var5.field378[var7 + 1];
                            }
                            var5.field377[var5.field376] = null;
                            break;
                        }
                    }
                    var5.field379 = 0;
                    for (int var8 = 0; var8 < var5.field376; var8++) {
                        var5.field379 |= var5.field378[var8];
                    }
                }
            }
        }
        if (arg0 == 5) {
            ;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIII)V")
    public void method66(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Tile var6 = this.field290[arg1][arg3][arg2];
        if (var6 == null) {
            return;
        }
        Decor var7 = var6.field373;
        if (var7 == null) {
            return;
        }
        int var8 = arg3 * 128 + 64;
        if (arg4 != 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = arg2 * 128 + 64;
        var7.field162 = (var7.field162 - var8) * arg0 / 16 + var8;
        var7.field163 = (var7.field163 - var10) * arg0 / 16 + var10;
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIII)V")
    public void method67(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field290[arg2][arg1][arg0];
        if (var5 != null) {
            var5.field372 = null;
            int var6 = 11 / arg3;
        }
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(IIII)V")
    public void method68(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field290[arg0][arg2][arg1];
        if (var5 == null) {
            return;
        }
        var5.field373 = null;
        if (arg3 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ZIII)V")
    public void method69(boolean arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field290[arg3][arg2][arg1];
        if (arg0) {
            this.field283 = -80;
        }
        if (var5 == null) {
            return;
        }
        for (int var6 = 0; var6 < var5.field376; var6++) {
            Location var7 = var5.field377[var6];
            if ((var7.field267 >> 29 & 0x3) == 2 && var7.field261 == arg2 && var7.field263 == arg1) {
                this.method65((byte) 5, var7);
                return;
            }
        }
    }

    @OriginalMember(owner = "r", name = "d", descriptor = "(IIII)V")
    public void method70(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field290[arg3][arg0][arg2];
        if (var5 != null) {
            var5.field374 = null;
            int var6 = 91 / arg1;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(III)V")
    public void method71(int arg0, int arg1, int arg2) {
        Tile var4 = this.field290[arg0][arg1][arg2];
        if (var4 != null) {
            var4.field375 = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(BIII)Lq;")
    public Wall method72(byte arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field290[arg2][arg3][arg1];
        if (arg0 != -18) {
            throw new NullPointerException();
        }
        return var5 == null ? null : var5.field372;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIB)Lh;")
    public Decor method73(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 0) {
            throw new NullPointerException();
        }
        boolean var5 = false;
        Tile var6 = this.field290[arg2][arg0][arg1];
        return var6 == null ? null : var6.field373;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIZ)Lp;")
    public Location method74(int arg0, int arg1, int arg2, boolean arg3) {
        Tile var5 = this.field290[arg1][arg0][arg2];
        if (!arg3) {
            throw new NullPointerException();
        } else if (var5 == null) {
            return null;
        } else {
            for (int var6 = 0; var6 < var5.field376; var6++) {
                Location var7 = var5.field377[var6];
                if ((var7.field267 >> 29 & 0x3) == 2 && var7.field261 == arg0 && var7.field263 == arg2) {
                    return var7;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IZII)Lj;")
    public GroundDecor method75(int arg0, boolean arg1, int arg2, int arg3) {
        Tile var5 = this.field290[arg0][arg3][arg2];
        if (arg1) {
            this.field282 = 112;
        }
        return var5 == null || var5.field374 == null ? null : var5.field374;
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(III)I")
    public int method76(int arg0, int arg1, int arg2) {
        Tile var4 = this.field290[arg0][arg1][arg2];
        return var4 == null || var4.field372 == null ? 0 : var4.field372.field276;
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIIB)I")
    public int method77(int arg0, int arg1, int arg2, byte arg3) {
        Tile var5 = this.field290[arg0][arg1][arg2];
        if (arg3 != -97) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        return var5 == null || var5.field373 == null ? 0 : var5.field373.field167;
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(III)I")
    public int method78(int arg0, int arg1, int arg2) {
        Tile var4 = this.field290[arg0][arg1][arg2];
        if (var4 == null) {
            return 0;
        }
        for (int var5 = 0; var5 < var4.field376; var5++) {
            Location var6 = var4.field377[var5];
            if ((var6.field267 >> 29 & 0x3) == 2 && var6.field261 == arg1 && var6.field263 == arg2) {
                return var6.field267;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "r", name = "d", descriptor = "(III)I")
    public int method79(int arg0, int arg1, int arg2) {
        Tile var4 = this.field290[arg0][arg1][arg2];
        return var4 == null || var4.field374 == null ? 0 : var4.field374.field199;
    }

    @OriginalMember(owner = "r", name = "e", descriptor = "(IIII)I")
    public int method80(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field290[arg0][arg1][arg2];
        if (var5 == null) {
            return -1;
        } else if (var5.field372 != null && var5.field372.field276 == arg3) {
            return var5.field372.field277 & 0xFF;
        } else if (var5.field373 != null && var5.field373.field167 == arg3) {
            return var5.field373.field168 & 0xFF;
        } else if (var5.field374 != null && var5.field374.field199 == arg3) {
            return var5.field374.field200 & 0xFF;
        } else {
            for (int var6 = 0; var6 < var5.field376; var6++) {
                if (var5.field377[var6].field267 == arg3) {
                    return var5.field377[var6].field268 & 0xFF;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIII)V")
    public void method81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 <= 0) {
            return;
        }
        int var7 = (int) Math.sqrt((double) (arg4 * arg4 + arg0 * arg0 + arg5 * arg5));
        int var8 = arg1 * var7 >> 8;
        for (int var9 = 0; var9 < this.field286; var9++) {
            for (int var10 = 0; var10 < this.field287; var10++) {
                for (int var11 = 0; var11 < this.field288; var11++) {
                    Tile var12 = this.field290[var9][var10][var11];
                    if (var12 != null) {
                        Wall var13 = var12.field372;
                        if (var13 != null && var13.field274 != null && var13.field274.field393 != null) {
                            this.method83(var11, false, 1, var10, var9, (Model) var13.field274, 1);
                            if (var13.field275 != null && var13.field275.field393 != null) {
                                this.method83(var11, false, 1, var10, var9, (Model) var13.field275, 1);
                                this.method84((Model) var13.field274, (Model) var13.field275, 0, 0, 0, false);
                                ((Model) var13.field275).method144(arg2, var8, arg0, arg5, arg4);
                            }
                            ((Model) var13.field274).method144(arg2, var8, arg0, arg5, arg4);
                        }
                        for (int var14 = 0; var14 < var12.field376; var14++) {
                            Location var16 = var12.field377[var14];
                            if (var16 != null && var16.field259 != null && var16.field259.field393 != null) {
                                this.method83(var11, false, var16.field262 + 1 - var16.field261, var10, var9, (Model) var16.field259, var16.field264 + 1 - var16.field263);
                                ((Model) var16.field259).method144(arg2, var8, arg0, arg5, arg4);
                            }
                        }
                        GroundDecor var15 = var12.field374;
                        if (var15 != null && var15.field198.field393 != null) {
                            this.method82((Model) var15.field198, var10, 8, var9, var11);
                            ((Model) var15.field198).method144(arg2, var8, arg0, arg5, arg4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Leb;IIII)V")
    private void method82(Model arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < this.field279 || arg2 > this.field279) {
            return;
        }
        if (arg1 < this.field287) {
            Tile var6 = this.field290[arg3][arg1 + 1][arg4];
            if (var6 != null && var6.field374 != null && var6.field374.field198.field393 != null) {
                this.method84(arg0, (Model) var6.field374.field198, 128, 0, 0, true);
            }
        }
        if (arg4 < this.field287) {
            Tile var7 = this.field290[arg3][arg1][arg4 + 1];
            if (var7 != null && var7.field374 != null && var7.field374.field198.field393 != null) {
                this.method84(arg0, (Model) var7.field374.field198, 0, 0, 128, true);
            }
        }
        if (arg1 < this.field287 && arg4 < this.field288) {
            Tile var8 = this.field290[arg3][arg1 + 1][arg4 + 1];
            if (var8 != null && var8.field374 != null && var8.field374.field198.field393 != null) {
                this.method84(arg0, (Model) var8.field374.field198, 128, 0, 128, true);
            }
        }
        if (arg1 >= this.field287 || arg4 <= 0) {
            return;
        }
        Tile var9 = this.field290[arg3][arg1 + 1][arg4 - 1];
        if (var9 != null && var9.field374 != null && var9.field374.field198.field393 != null) {
            this.method84(arg0, (Model) var9.field374.field198, 128, 0, -128, true);
            return;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IZIIILeb;I)V")
    private void method83(int arg0, boolean arg1, int arg2, int arg3, int arg4, Model arg5, int arg6) {
        if (arg1) {
            return;
        }
        boolean var8 = true;
        int var9 = arg3;
        int var10 = arg2 + arg3;
        int var11 = arg0 - 1;
        int var12 = arg0 + arg6;
        for (int var13 = arg4; var13 <= arg4 + 1; var13++) {
            if (this.field286 != var13) {
                for (int var14 = var9; var14 <= var10; var14++) {
                    if (var14 >= 0 && var14 < this.field287) {
                        for (int var15 = var11; var15 <= var12; var15++) {
                            if (var15 >= 0 && var15 < this.field288 && (!var8 || var14 >= var10 || var15 >= var12 || var15 < arg0 && arg3 != var14)) {
                                Tile var16 = this.field290[var13][var14][var15];
                                if (var16 != null) {
                                    int var17 = (this.field289[var13][var14 + 1][var15] + this.field289[var13][var14][var15] + this.field289[var13][var14][var15 + 1] + this.field289[var13][var14 + 1][var15 + 1]) / 4 - (this.field289[arg4][arg3 + 1][arg0] + this.field289[arg4][arg3][arg0] + this.field289[arg4][arg3][arg0 + 1] + this.field289[arg4][arg3 + 1][arg0 + 1]) / 4;
                                    Wall var18 = var16.field372;
                                    if (var18 != null && var18.field274 != null && var18.field274.field393 != null) {
                                        this.method84(arg5, (Model) var18.field274, (1 - arg2) * 64 + (var14 - arg3) * 128, var17, (var15 - arg0) * 128 + (1 - arg6) * 64, var8);
                                    }
                                    if (var18 != null && var18.field275 != null && var18.field275.field393 != null) {
                                        this.method84(arg5, (Model) var18.field275, (1 - arg2) * 64 + (var14 - arg3) * 128, var17, (var15 - arg0) * 128 + (1 - arg6) * 64, var8);
                                    }
                                    for (int var19 = 0; var19 < var16.field376; var19++) {
                                        Location var20 = var16.field377[var19];
                                        if (var20 != null && var20.field259 != null && var20.field259.field393 != null) {
                                            int var21 = var20.field262 + 1 - var20.field261;
                                            int var22 = var20.field264 + 1 - var20.field263;
                                            this.method84(arg5, (Model) var20.field259, (var20.field261 - arg3) * 128 + (var21 - arg2) * 64, var17, (var20.field263 - arg0) * 128 + (var22 - arg6) * 64, var8);
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
        this.field337++;
        int var7 = 0;
        int[] var8 = arg1.field542;
        int var9 = arg1.field541;
        for (int var10 = 0; var10 < arg0.field541; var10++) {
            VertexNormal var13 = arg0.field393[var10];
            VertexNormal var14 = arg0.field575[var10];
            if (var14.field247 != 0) {
                int var15 = arg0.field543[var10] - arg3;
                if (var15 <= arg1.field566) {
                    int var16 = arg0.field542[var10] - arg2;
                    if (var16 >= arg1.field561 && var16 <= arg1.field562) {
                        int var17 = arg0.field544[var10] - arg4;
                        if (var17 >= arg1.field564 && var17 <= arg1.field563) {
                            for (int var18 = 0; var18 < var9; var18++) {
                                VertexNormal var19 = arg1.field393[var18];
                                VertexNormal var20 = arg1.field575[var18];
                                if (var8[var18] == var16 && arg1.field544[var18] == var17 && arg1.field543[var18] == var15 && var20.field247 != 0) {
                                    var13.field244 += var20.field244;
                                    var13.field245 += var20.field245;
                                    var13.field246 += var20.field246;
                                    var13.field247 += var20.field247;
                                    var19.field244 += var14.field244;
                                    var19.field245 += var14.field245;
                                    var19.field246 += var14.field246;
                                    var19.field247 += var14.field247;
                                    var7++;
                                    this.field335[var10] = this.field337;
                                    this.field336[var18] = this.field337;
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
        for (int var11 = 0; var11 < arg0.field545; var11++) {
            if (this.field335[arg0.field546[var11]] == this.field337 && this.field335[arg0.field547[var11]] == this.field337 && this.field335[arg0.field548[var11]] == this.field337) {
                arg0.field552[var11] = -1;
            }
        }
        for (int var12 = 0; var12 < arg1.field545; var12++) {
            if (this.field336[arg1.field546[var12]] == this.field337 && this.field336[arg1.field547[var12]] == this.field337 && this.field336[arg1.field548[var12]] == this.field337) {
                arg1.field552[var12] = -1;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "([IIIIII)V")
    public void method85(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Tile var7 = this.field290[arg3][arg4][arg5];
        if (var7 == null) {
            return;
        }
        TileUnderlay var8 = var7.field370;
        if (var8 != null) {
            int var9 = var8.field254;
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
        TileOverlay var11 = var7.field371;
        if (var11 == null) {
            return;
        }
        int var12 = var11.field181;
        int var13 = var11.field182;
        int var14 = var11.field183;
        int var15 = var11.field184;
        int[] var16 = this.field338[var12];
        int[] var17 = this.field339[var13];
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
        field344 = 0;
        field345 = 0;
        field346 = arg4;
        field347 = arg2;
        field342 = arg4 / 2;
        if (arg5 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        field343 = arg2 / 2;
        boolean[][][][] var7 = new boolean[9][32][53][53];
        for (int var8 = 128; var8 <= 384; var8 += 32) {
            for (int var16 = 0; var16 < 2048; var16 += 64) {
                field307 = Model.field604[var8];
                field308 = Model.field605[var8];
                field309 = Model.field604[var16];
                field310 = Model.field605[var16];
                int var17 = (var8 - 128) / 32;
                int var18 = var16 / 64;
                for (int var19 = -26; var19 <= 26; var19++) {
                    for (int var20 = -26; var20 <= 26; var20++) {
                        int var21 = var19 * 128;
                        int var22 = var20 * 128;
                        boolean var23 = false;
                        for (int var24 = -arg1; var24 <= arg3; var24 += 128) {
                            if (method87(arg0[var17] + var24, var22, false, var21)) {
                                var23 = true;
                                break;
                            }
                        }
                        var7[var17][var18][var19 + 25 + 1][var20 + 25 + 1] = var23;
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
                                if (var7[var9][var10][var11 + var14 + 25 + 1][var12 + var15 + 25 + 1]) {
                                    var13 = true;
                                    break label83;
                                }
                                if (var7[var9][(var10 + 1) % 31][var11 + var14 + 25 + 1][var12 + var15 + 25 + 1]) {
                                    var13 = true;
                                    break label83;
                                }
                                if (var7[var9 + 1][var10][var11 + var14 + 25 + 1][var12 + var15 + 25 + 1]) {
                                    var13 = true;
                                    break label83;
                                }
                                if (var7[var9 + 1][(var10 + 1) % 31][var11 + var14 + 25 + 1][var12 + var15 + 25 + 1]) {
                                    var13 = true;
                                    break label83;
                                }
                            }
                        }
                        field340[var9][var10][var11 + 25][var12 + 25] = var13;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIZI)Z")
    public static boolean method87(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = field310 * arg3 + field309 * arg1 >> 16;
        int var5 = field310 * arg1 - field309 * arg3 >> 16;
        int var6 = field308 * var5 + field307 * arg0 >> 16;
        int var7 = field308 * arg0 - field307 * var5 >> 16;
        if (arg2) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        if (var6 >= 50 && var6 <= 3500) {
            int var9 = (var4 << 9) / var6 + field342;
            int var10 = (var7 << 9) / var6 + field343;
            return var9 >= field344 && var9 <= field346 && var10 >= field345 && var10 <= field347;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IBI)V")
    public void method88(int arg0, byte arg1, int arg2) {
        field316 = true;
        field317 = arg2;
        field318 = arg0;
        field319 = -1;
        field320 = -1;
        if (arg1 == 3) {
            ;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIII)V")
    public void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 < 0) {
            arg3 = 0;
        } else if (arg3 >= this.field287 * 128) {
            arg3 = this.field287 * 128 - 1;
        }
        if (arg1 < 0) {
            arg1 = 0;
        } else if (arg1 >= this.field288 * 128) {
            arg1 = this.field288 * 128 - 1;
        }
        field297++;
        field307 = Model.field604[arg4];
        field308 = Model.field605[arg4];
        field309 = Model.field604[arg5];
        field310 = Model.field605[arg5];
        field341 = field340[(arg4 - 128) / 32][arg5 / 64];
        field304 = arg3;
        field305 = arg6;
        field306 = arg1;
        field302 = arg3 / 128;
        field303 = arg1 / 128;
        if (arg0 <= 0) {
            this.field281 = !this.field281;
        }
        field296 = arg2;
        field298 = field302 - 25;
        if (field298 < 0) {
            field298 = 0;
        }
        field300 = field303 - 25;
        if (field300 < 0) {
            field300 = 0;
        }
        field299 = field302 + 25;
        if (field299 > this.field287) {
            field299 = this.field287;
        }
        field301 = field303 + 25;
        if (field301 > this.field288) {
            field301 = this.field288;
        }
        this.method95(0);
        field295 = 0;
        for (int var8 = this.field291; var8 < this.field286; var8++) {
            Tile[][] var33 = this.field290[var8];
            for (int var34 = field298; var34 < field299; var34++) {
                for (int var35 = field300; var35 < field301; var35++) {
                    Tile var36 = var33[var34][var35];
                    if (var36 != null) {
                        if (var36.field380 <= arg2 && (field341[var34 + 25 - field302][var35 + 25 - field303] || this.field289[var8][var34][var35] - arg6 >= 2000)) {
                            var36.field381 = true;
                            var36.field382 = true;
                            if (var36.field376 > 0) {
                                var36.field383 = true;
                            } else {
                                var36.field383 = false;
                            }
                            field295++;
                        } else {
                            var36.field381 = false;
                            var36.field382 = false;
                            var36.field384 = 0;
                        }
                    }
                }
            }
        }
        for (int var9 = this.field291; var9 < this.field286; var9++) {
            Tile[][] var22 = this.field290[var9];
            for (int var23 = -25; var23 <= 0; var23++) {
                int var24 = field302 + var23;
                int var25 = field302 - var23;
                if (var24 >= field298 || var25 < field299) {
                    for (int var26 = -25; var26 <= 0; var26++) {
                        int var27 = field303 + var26;
                        int var28 = field303 - var26;
                        if (var24 >= field298) {
                            if (var27 >= field300) {
                                Tile var29 = var22[var24][var27];
                                if (var29 != null && var29.field381) {
                                    this.method90(var29, true);
                                }
                            }
                            if (var28 < field301) {
                                Tile var30 = var22[var24][var28];
                                if (var30 != null && var30.field381) {
                                    this.method90(var30, true);
                                }
                            }
                        }
                        if (var25 < field299) {
                            if (var27 >= field300) {
                                Tile var31 = var22[var25][var27];
                                if (var31 != null && var31.field381) {
                                    this.method90(var31, true);
                                }
                            }
                            if (var28 < field301) {
                                Tile var32 = var22[var25][var28];
                                if (var32 != null && var32.field381) {
                                    this.method90(var32, true);
                                }
                            }
                        }
                        if (field295 == 0) {
                            field316 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var10 = this.field291; var10 < this.field286; var10++) {
            Tile[][] var11 = this.field290[var10];
            for (int var12 = -25; var12 <= 0; var12++) {
                int var13 = field302 + var12;
                int var14 = field302 - var12;
                if (var13 >= field298 || var14 < field299) {
                    for (int var15 = -25; var15 <= 0; var15++) {
                        int var16 = field303 + var15;
                        int var17 = field303 - var15;
                        if (var13 >= field298) {
                            if (var16 >= field300) {
                                Tile var18 = var11[var13][var16];
                                if (var18 != null && var18.field381) {
                                    this.method90(var18, false);
                                }
                            }
                            if (var17 < field301) {
                                Tile var19 = var11[var13][var17];
                                if (var19 != null && var19.field381) {
                                    this.method90(var19, false);
                                }
                            }
                        }
                        if (var14 < field299) {
                            if (var16 >= field300) {
                                Tile var20 = var11[var14][var16];
                                if (var20 != null && var20.field381) {
                                    this.method90(var20, false);
                                }
                            }
                            if (var17 < field301) {
                                Tile var21 = var11[var14][var17];
                                if (var21 != null && var21.field381) {
                                    this.method90(var21, false);
                                }
                            }
                        }
                        if (field295 == 0) {
                            field316 = false;
                            return;
                        }
                    }
                }
            }
        }
        field316 = false;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lv;Z)V")
    public void method90(Tile arg0, boolean arg1) {
        field326.method245(arg0);
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
                                                var3 = (Tile) field326.method247();
                                                if (var3 == null) {
                                                    return;
                                                }
                                            } while (!var3.field382);
                                            var4 = var3.field367;
                                            var5 = var3.field368;
                                            var6 = var3.field366;
                                            var7 = var3.field369;
                                            var8 = this.field290[var6];
                                            if (!var3.field381) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var6 > 0) {
                                                    Tile var9 = this.field290[var6 - 1][var4][var5];
                                                    if (var9 != null && var9.field382) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= field302 && var4 > field298) {
                                                    Tile var10 = var8[var4 - 1][var5];
                                                    if (var10 != null && var10.field382 && (var10.field381 || (var3.field379 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= field302 && var4 < field299 - 1) {
                                                    Tile var11 = var8[var4 + 1][var5];
                                                    if (var11 != null && var11.field382 && (var11.field381 || (var3.field379 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 <= field303 && var5 > field300) {
                                                    Tile var12 = var8[var4][var5 - 1];
                                                    if (var12 != null && var12.field382 && (var12.field381 || (var3.field379 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 >= field303 && var5 < field301 - 1) {
                                                    Tile var13 = var8[var4][var5 + 1];
                                                    if (var13 != null && var13.field382 && (var13.field381 || (var3.field379 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var3.field381 = false;
                                            if (var3.field388 != null) {
                                                Tile var14 = var3.field388;
                                                if (var14.field370 == null) {
                                                    if (var14.field371 != null && !this.method96(0, var4, var5)) {
                                                        this.method92(var14.field371, field307, field309, var5, var4, 0, field308, field310);
                                                    }
                                                } else if (!this.method96(0, var4, var5)) {
                                                    this.method91(var14.field370, 0, field307, field308, field309, field310, var4, var5);
                                                }
                                                Wall var15 = var14.field372;
                                                if (var15 != null) {
                                                    var15.field274.method108(0, field307, field308, field309, field310, var15.field270 - field304, var15.field269 - field305, var15.field271 - field306, var15.field276);
                                                }
                                                for (int var16 = 0; var16 < var14.field376; var16++) {
                                                    Location var17 = var14.field377[var16];
                                                    if (var17 != null) {
                                                        var17.field259.method108(var17.field260, field307, field308, field309, field310, var17.field257 - field304, var17.field256 - field305, var17.field258 - field306, var17.field267);
                                                    }
                                                }
                                            }
                                            boolean var18 = false;
                                            if (var3.field370 == null) {
                                                if (var3.field371 != null && !this.method96(var7, var4, var5)) {
                                                    var18 = true;
                                                    this.method92(var3.field371, field307, field309, var5, var4, 0, field308, field310);
                                                }
                                            } else if (!this.method96(var7, var4, var5)) {
                                                var18 = true;
                                                this.method91(var3.field370, var7, field307, field308, field309, field310, var4, var5);
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            Wall var21 = var3.field372;
                                            Decor var22 = var3.field373;
                                            if (var21 != null || var22 != null) {
                                                if (field302 == var4) {
                                                    var19++;
                                                } else if (field302 < var4) {
                                                    var19 += 2;
                                                }
                                                if (field303 == var5) {
                                                    var19 += 3;
                                                } else if (field303 > var5) {
                                                    var19 += 6;
                                                }
                                                var20 = field327[var19];
                                                var3.field387 = field329[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field272 & field328[var19]) == 0) {
                                                    var3.field384 = 0;
                                                } else if (var21.field272 == 16) {
                                                    var3.field384 = 3;
                                                    var3.field385 = field330[var19];
                                                    var3.field386 = 3 - var3.field385;
                                                } else if (var21.field272 == 32) {
                                                    var3.field384 = 6;
                                                    var3.field385 = field331[var19];
                                                    var3.field386 = 6 - var3.field385;
                                                } else if (var21.field272 == 64) {
                                                    var3.field384 = 12;
                                                    var3.field385 = field332[var19];
                                                    var3.field386 = 12 - var3.field385;
                                                } else {
                                                    var3.field384 = 9;
                                                    var3.field385 = field333[var19];
                                                    var3.field386 = 9 - var3.field385;
                                                }
                                                if ((var21.field272 & var20) != 0 && !this.method97(var7, var4, var5, var21.field272)) {
                                                    var21.field274.method108(0, field307, field308, field309, field310, var21.field270 - field304, var21.field269 - field305, var21.field271 - field306, var21.field276);
                                                }
                                                if ((var21.field273 & var20) != 0 && !this.method97(var7, var4, var5, var21.field273)) {
                                                    var21.field275.method108(0, field307, field308, field309, field310, var21.field270 - field304, var21.field269 - field305, var21.field271 - field306, var21.field276);
                                                }
                                            }
                                            if (var22 != null && !this.method98(var7, var4, var5, var22.field166.field394)) {
                                                if ((var22.field164 & var20) != 0) {
                                                    var22.field166.method108(var22.field165, field307, field308, field309, field310, var22.field162 - field304, var22.field161 - field305, var22.field163 - field306, var22.field167);
                                                } else if ((var22.field164 & 0x300) != 0) {
                                                    int var23 = var22.field162 - field304;
                                                    int var24 = var22.field161 - field305;
                                                    int var25 = var22.field163 - field306;
                                                    int var26 = var22.field165;
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
                                                    if ((var22.field164 & 0x100) != 0 && var28 < var27) {
                                                        int var29 = field312[var26] + var23;
                                                        int var30 = field313[var26] + var25;
                                                        var22.field166.method108(var26 * 512 + 256, field307, field308, field309, field310, var29, var24, var30, var22.field167);
                                                    }
                                                    if ((var22.field164 & 0x200) != 0 && var28 > var27) {
                                                        int var31 = field314[var26] + var23;
                                                        int var32 = field315[var26] + var25;
                                                        var22.field166.method108(var26 * 512 + 1280 & 0x7FF, field307, field308, field309, field310, var31, var24, var32, var22.field167);
                                                    }
                                                }
                                            }
                                            if (var18) {
                                                GroundDecor var33 = var3.field374;
                                                if (var33 != null) {
                                                    var33.field198.method108(0, field307, field308, field309, field310, var33.field196 - field304, var33.field195 - field305, var33.field197 - field306, var33.field199);
                                                }
                                                GroundObject var34 = var3.field375;
                                                if (var34 != null && var34.field208 == 0) {
                                                    if (var34.field205 != null) {
                                                        var34.field205.method108(0, field307, field308, field309, field310, var34.field202 - field304, var34.field201 - field305, var34.field203 - field306, var34.field207);
                                                    }
                                                    if (var34.field206 != null) {
                                                        var34.field206.method108(0, field307, field308, field309, field310, var34.field202 - field304, var34.field201 - field305, var34.field203 - field306, var34.field207);
                                                    }
                                                    if (var34.field204 != null) {
                                                        var34.field204.method108(0, field307, field308, field309, field310, var34.field202 - field304, var34.field201 - field305, var34.field203 - field306, var34.field207);
                                                    }
                                                }
                                            }
                                            int var35 = var3.field379;
                                            if (var35 != 0) {
                                                if (var4 < field302 && (var35 & 0x4) != 0) {
                                                    Tile var36 = var8[var4 + 1][var5];
                                                    if (var36 != null && var36.field382) {
                                                        field326.method245(var36);
                                                    }
                                                }
                                                if (var5 < field303 && (var35 & 0x2) != 0) {
                                                    Tile var37 = var8[var4][var5 + 1];
                                                    if (var37 != null && var37.field382) {
                                                        field326.method245(var37);
                                                    }
                                                }
                                                if (var4 > field302 && (var35 & 0x1) != 0) {
                                                    Tile var38 = var8[var4 - 1][var5];
                                                    if (var38 != null && var38.field382) {
                                                        field326.method245(var38);
                                                    }
                                                }
                                                if (var5 > field303 && (var35 & 0x8) != 0) {
                                                    Tile var39 = var8[var4][var5 - 1];
                                                    if (var39 != null && var39.field382) {
                                                        field326.method245(var39);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var3.field384 != 0) {
                                            boolean var40 = true;
                                            for (int var41 = 0; var41 < var3.field376; var41++) {
                                                if (field297 != var3.field377[var41].field266 && (var3.field378[var41] & var3.field384) == var3.field385) {
                                                    var40 = false;
                                                    break;
                                                }
                                            }
                                            if (var40) {
                                                Wall var42 = var3.field372;
                                                if (!this.method97(var7, var4, var5, var42.field272)) {
                                                    var42.field274.method108(0, field307, field308, field309, field310, var42.field270 - field304, var42.field269 - field305, var42.field271 - field306, var42.field276);
                                                }
                                                var3.field384 = 0;
                                            }
                                        }
                                        if (!var3.field383) {
                                            break;
                                        }
                                        try {
                                            int var43 = var3.field376;
                                            var3.field383 = false;
                                            int var44 = 0;
                                            label559: for (int var45 = 0; var45 < var43; var45++) {
                                                Location var46 = var3.field377[var45];
                                                if (field297 != var46.field266) {
                                                    for (int var47 = var46.field261; var47 <= var46.field262; var47++) {
                                                        for (int var48 = var46.field263; var48 <= var46.field264; var48++) {
                                                            Tile var49 = var8[var47][var48];
                                                            if (var49.field381) {
                                                                var3.field383 = true;
                                                                continue label559;
                                                            }
                                                            if (var49.field384 != 0) {
                                                                int var50 = 0;
                                                                if (var47 > var46.field261) {
                                                                    var50++;
                                                                }
                                                                if (var47 < var46.field262) {
                                                                    var50 += 4;
                                                                }
                                                                if (var48 > var46.field263) {
                                                                    var50 += 8;
                                                                }
                                                                if (var48 < var46.field264) {
                                                                    var50 += 2;
                                                                }
                                                                if ((var50 & var49.field384) == var3.field386) {
                                                                    var3.field383 = true;
                                                                    continue label559;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    field311[var44++] = var46;
                                                    int var51 = field302 - var46.field261;
                                                    int var52 = var46.field262 - field302;
                                                    if (var52 > var51) {
                                                        var51 = var52;
                                                    }
                                                    int var53 = field303 - var46.field263;
                                                    int var54 = var46.field264 - field303;
                                                    if (var54 > var53) {
                                                        var46.field265 = var51 + var54;
                                                    } else {
                                                        var46.field265 = var51 + var53;
                                                    }
                                                }
                                            }
                                            while (var44 > 0) {
                                                int var55 = -50;
                                                int var56 = -1;
                                                for (int var57 = 0; var57 < var44; var57++) {
                                                    Location var58 = field311[var57];
                                                    if (field297 != var58.field266) {
                                                        if (var58.field265 > var55) {
                                                            var55 = var58.field265;
                                                            var56 = var57;
                                                        } else if (var58.field265 == var55) {
                                                            int var59 = var58.field257 - field304;
                                                            int var60 = var58.field258 - field306;
                                                            int var61 = field311[var56].field257 - field304;
                                                            int var62 = field311[var56].field258 - field306;
                                                            if (var59 * var59 + var60 * var60 > var61 * var61 + var62 * var62) {
                                                                var56 = var57;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var56 == -1) {
                                                    break;
                                                }
                                                Location var63 = field311[var56];
                                                var63.field266 = field297;
                                                if (!this.method99(var7, var63.field261, var63.field262, var63.field263, var63.field264, var63.field259.field394)) {
                                                    var63.field259.method108(var63.field260, field307, field308, field309, field310, var63.field257 - field304, var63.field256 - field305, var63.field258 - field306, var63.field267);
                                                }
                                                for (int var64 = var63.field261; var64 <= var63.field262; var64++) {
                                                    for (int var65 = var63.field263; var65 <= var63.field264; var65++) {
                                                        Tile var66 = var8[var64][var65];
                                                        if (var66.field384 != 0) {
                                                            field326.method245(var66);
                                                        } else if ((var4 != var64 || var5 != var65) && var66.field382) {
                                                            field326.method245(var66);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var3.field383) {
                                                break;
                                            }
                                        } catch (Exception var89) {
                                            var3.field383 = false;
                                            break;
                                        }
                                    }
                                } while (!var3.field382);
                            } while (var3.field384 != 0);
                            if (var4 > field302 || var4 <= field298) {
                                break;
                            }
                            var67 = var8[var4 - 1][var5];
                        } while (var67 != null && var67.field382);
                        if (var4 < field302 || var4 >= field299 - 1) {
                            break;
                        }
                        var68 = var8[var4 + 1][var5];
                    } while (var68 != null && var68.field382);
                    if (var5 > field303 || var5 <= field300) {
                        break;
                    }
                    var69 = var8[var4][var5 - 1];
                } while (var69 != null && var69.field382);
                if (var5 < field303 || var5 >= field301 - 1) {
                    break;
                }
                var70 = var8[var4][var5 + 1];
            } while (var70 != null && var70.field382);
            var3.field382 = false;
            field295--;
            GroundObject var71 = var3.field375;
            if (var71 != null && var71.field208 != 0) {
                if (var71.field205 != null) {
                    var71.field205.method108(0, field307, field308, field309, field310, var71.field202 - field304, var71.field201 - field305 - var71.field208, var71.field203 - field306, var71.field207);
                }
                if (var71.field206 != null) {
                    var71.field206.method108(0, field307, field308, field309, field310, var71.field202 - field304, var71.field201 - field305 - var71.field208, var71.field203 - field306, var71.field207);
                }
                if (var71.field204 != null) {
                    var71.field204.method108(0, field307, field308, field309, field310, var71.field202 - field304, var71.field201 - field305 - var71.field208, var71.field203 - field306, var71.field207);
                }
            }
            if (var3.field387 != 0) {
                Decor var72 = var3.field373;
                if (var72 != null && !this.method98(var7, var4, var5, var72.field166.field394)) {
                    if ((var72.field164 & var3.field387) != 0) {
                        var72.field166.method108(var72.field165, field307, field308, field309, field310, var72.field162 - field304, var72.field161 - field305, var72.field163 - field306, var72.field167);
                    } else if ((var72.field164 & 0x300) != 0) {
                        int var73 = var72.field162 - field304;
                        int var74 = var72.field161 - field305;
                        int var75 = var72.field163 - field306;
                        int var76 = var72.field165;
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
                        if ((var72.field164 & 0x100) != 0 && var78 >= var77) {
                            int var79 = field312[var76] + var73;
                            int var80 = field313[var76] + var75;
                            var72.field166.method108(var76 * 512 + 256, field307, field308, field309, field310, var79, var74, var80, var72.field167);
                        }
                        if ((var72.field164 & 0x200) != 0 && var78 <= var77) {
                            int var81 = field314[var76] + var73;
                            int var82 = field315[var76] + var75;
                            var72.field166.method108(var76 * 512 + 1280 & 0x7FF, field307, field308, field309, field310, var81, var74, var82, var72.field167);
                        }
                    }
                }
                Wall var83 = var3.field372;
                if (var83 != null) {
                    if ((var83.field273 & var3.field387) != 0 && !this.method97(var7, var4, var5, var83.field273)) {
                        var83.field275.method108(0, field307, field308, field309, field310, var83.field270 - field304, var83.field269 - field305, var83.field271 - field306, var83.field276);
                    }
                    if ((var83.field272 & var3.field387) != 0 && !this.method97(var7, var4, var5, var83.field272)) {
                        var83.field274.method108(0, field307, field308, field309, field310, var83.field270 - field304, var83.field269 - field305, var83.field271 - field306, var83.field276);
                    }
                }
            }
            if (var6 < this.field286 - 1) {
                Tile var84 = this.field290[var6 + 1][var4][var5];
                if (var84 != null && var84.field382) {
                    field326.method245(var84);
                }
            }
            if (var4 < field302) {
                Tile var85 = var8[var4 + 1][var5];
                if (var85 != null && var85.field382) {
                    field326.method245(var85);
                }
            }
            if (var5 < field303) {
                Tile var86 = var8[var4][var5 + 1];
                if (var86 != null && var86.field382) {
                    field326.method245(var86);
                }
            }
            if (var4 > field302) {
                Tile var87 = var8[var4 - 1][var5];
                if (var87 != null && var87.field382) {
                    field326.method245(var87);
                }
            }
            if (var5 > field303) {
                Tile var88 = var8[var4][var5 - 1];
                if (var88 != null && var88.field382) {
                    field326.method245(var88);
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lo;IIIIIII)V")
    public void method91(TileUnderlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9;
        int var10 = var9 = (arg6 << 7) - field304;
        int var11;
        int var12 = var11 = (arg7 << 7) - field306;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = this.field289[arg1][arg6][arg7] - field305;
        int var18 = this.field289[arg1][arg6 + 1][arg7] - field305;
        int var19 = this.field289[arg1][arg6 + 1][arg7 + 1] - field305;
        int var20 = this.field289[arg1][arg6][arg7 + 1] - field305;
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
        int var45 = (var21 << 9) / var25 + Pix3D.field639;
        int var46 = (var24 << 9) / var25 + Pix3D.field640;
        int var47 = (var27 << 9) / var31 + Pix3D.field639;
        int var48 = (var30 << 9) / var31 + Pix3D.field640;
        int var49 = (var33 << 9) / var37 + Pix3D.field639;
        int var50 = (var36 << 9) / var37 + Pix3D.field640;
        int var51 = (var39 << 9) / var43 + Pix3D.field639;
        int var52 = (var42 << 9) / var43 + Pix3D.field640;
        Pix3D.field638 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            Pix3D.field635 = false;
            if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > Pix2D.field626 || var51 > Pix2D.field626 || var47 > Pix2D.field626) {
                Pix3D.field635 = true;
            }
            if (field316 && this.method94(field317, field318, var50, var52, var48, var49, var51, var47)) {
                field319 = arg6;
                field320 = arg7;
            }
            if (arg0.field252 == -1) {
                if (arg0.field250 != 12345678) {
                    Pix3D.method175(var50, var52, var48, var49, var51, var47, arg0.field250, arg0.field251, arg0.field249);
                }
            } else if (field285) {
                int var53 = field334[arg0.field252];
                Pix3D.method175(var50, var52, var48, var49, var51, var47, this.method93(arg0.field250, 0, var53), this.method93(arg0.field251, 0, var53), this.method93(arg0.field249, 0, var53));
            } else if (arg0.field253) {
                Pix3D.method179(var50, var52, var48, var49, var51, var47, arg0.field250, arg0.field251, arg0.field249, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field252);
            } else {
                Pix3D.method179(var50, var52, var48, var49, var51, var47, arg0.field250, arg0.field251, arg0.field249, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field252);
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        Pix3D.field635 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Pix2D.field626 || var47 > Pix2D.field626 || var51 > Pix2D.field626) {
            Pix3D.field635 = true;
        }
        if (field316 && this.method94(field317, field318, var46, var48, var52, var45, var47, var51)) {
            field319 = arg6;
            field320 = arg7;
        }
        if (arg0.field252 != -1) {
            if (!field285) {
                Pix3D.method179(var46, var48, var52, var45, var47, var51, arg0.field248, arg0.field249, arg0.field251, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field252);
                return;
            }
            int var54 = field334[arg0.field252];
            Pix3D.method175(var46, var48, var52, var45, var47, var51, this.method93(arg0.field248, 0, var54), this.method93(arg0.field249, 0, var54), this.method93(arg0.field251, 0, var54));
        } else if (arg0.field248 != 12345678) {
            Pix3D.method175(var46, var48, var52, var45, var47, var51, arg0.field248, arg0.field249, arg0.field251);
            return;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Li;IIIIIII)V")
    public void method92(TileOverlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg0.field170.length;
        for (int var10 = 0; var10 < var9; var10++) {
            int var23 = arg0.field170[var10] - field304;
            int var24 = arg0.field171[var10] - field305;
            int var25 = arg0.field172[var10] - field306;
            int var26 = arg2 * var25 + arg7 * var23 >> 16;
            int var27 = arg7 * var25 - arg2 * var23 >> 16;
            int var29 = arg6 * var24 - arg1 * var27 >> 16;
            int var30 = arg1 * var24 + arg6 * var27 >> 16;
            if (var30 < 50) {
                return;
            }
            if (arg0.field179 != null) {
                TileOverlay.field187[var10] = var26;
                TileOverlay.field188[var10] = var29;
                TileOverlay.field189[var10] = var30;
            }
            TileOverlay.field185[var10] = (var26 << 9) / var30 + Pix3D.field639;
            TileOverlay.field186[var10] = (var29 << 9) / var30 + Pix3D.field640;
        }
        Pix3D.field638 = 0;
        int var11 = arg0.field176.length;
        if (arg5 != 0) {
            this.field281 = !this.field281;
        }
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = arg0.field176[var12];
            int var14 = arg0.field177[var12];
            int var15 = arg0.field178[var12];
            int var16 = TileOverlay.field185[var13];
            int var17 = TileOverlay.field185[var14];
            int var18 = TileOverlay.field185[var15];
            int var19 = TileOverlay.field186[var13];
            int var20 = TileOverlay.field186[var14];
            int var21 = TileOverlay.field186[var15];
            if ((var16 - var17) * (var21 - var20) - (var18 - var17) * (var19 - var20) > 0) {
                Pix3D.field635 = false;
                if (var16 < 0 || var17 < 0 || var18 < 0 || var16 > Pix2D.field626 || var17 > Pix2D.field626 || var18 > Pix2D.field626) {
                    Pix3D.field635 = true;
                }
                if (field316 && this.method94(field317, field318, var19, var20, var21, var16, var17, var18)) {
                    field319 = arg4;
                    field320 = arg3;
                }
                if (arg0.field179 == null || arg0.field179[var12] == -1) {
                    if (arg0.field173[var12] != 12345678) {
                        Pix3D.method175(var19, var20, var21, var16, var17, var18, arg0.field173[var12], arg0.field174[var12], arg0.field175[var12]);
                    }
                } else if (field285) {
                    int var22 = field334[arg0.field179[var12]];
                    Pix3D.method175(var19, var20, var21, var16, var17, var18, this.method93(arg0.field173[var12], 0, var22), this.method93(arg0.field174[var12], 0, var22), this.method93(arg0.field175[var12], 0, var22));
                } else if (arg0.field180) {
                    Pix3D.method179(var19, var20, var21, var16, var17, var18, arg0.field173[var12], arg0.field174[var12], arg0.field175[var12], TileOverlay.field187[0], TileOverlay.field187[1], TileOverlay.field187[3], TileOverlay.field188[0], TileOverlay.field188[1], TileOverlay.field188[3], TileOverlay.field189[0], TileOverlay.field189[1], TileOverlay.field189[3], arg0.field179[var12]);
                } else {
                    Pix3D.method179(var19, var20, var21, var16, var17, var18, arg0.field173[var12], arg0.field174[var12], arg0.field175[var12], TileOverlay.field187[var13], TileOverlay.field187[var14], TileOverlay.field187[var15], TileOverlay.field188[var13], TileOverlay.field188[var14], TileOverlay.field188[var15], TileOverlay.field189[var13], TileOverlay.field189[var14], TileOverlay.field189[var15], arg0.field179[var12]);
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "e", descriptor = "(III)I")
    public int method93(int arg0, int arg1, int arg2) {
        int var4 = 127 - arg0;
        if (arg1 != 0) {
            return 1;
        }
        int var5 = (arg2 & 0x7F) * var4 / 160;
        if (var5 < 2) {
            var5 = 2;
        } else if (var5 > 126) {
            var5 = 126;
        }
        return (arg2 & 0xFF80) + var5;
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
        int var2 = field322[field296];
        if (arg0 != 0) {
            this.field283 = 421;
        }
        Occlude[] var3 = field323[field296];
        field324 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            Occlude var5 = var3[var4];
            if (var5.field230 == 1) {
                int var6 = var5.field226 + 25 - field302;
                if (var6 >= 0 && var6 <= 50) {
                    int var7 = var5.field228 + 25 - field303;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = var5.field229 + 25 - field303;
                    if (var8 > 50) {
                        var8 = 50;
                    }
                    boolean var9 = false;
                    while (var7 <= var8) {
                        if (field341[var6][var7++]) {
                            var9 = true;
                            break;
                        }
                    }
                    if (var9) {
                        int var10 = field304 - var5.field231;
                        if (var10 > 32) {
                            var5.field237 = 1;
                        } else {
                            if (var10 >= -32) {
                                continue;
                            }
                            var5.field237 = 2;
                            var10 = -var10;
                        }
                        var5.field240 = (var5.field233 - field306 << 8) / var10;
                        var5.field241 = (var5.field234 - field306 << 8) / var10;
                        var5.field242 = (var5.field235 - field305 << 8) / var10;
                        var5.field243 = (var5.field236 - field305 << 8) / var10;
                        field325[field324++] = var5;
                    }
                }
            } else if (var5.field230 == 2) {
                int var11 = var5.field228 + 25 - field303;
                if (var11 >= 0 && var11 <= 50) {
                    int var12 = var5.field226 + 25 - field302;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = var5.field227 + 25 - field302;
                    if (var13 > 50) {
                        var13 = 50;
                    }
                    boolean var14 = false;
                    while (var12 <= var13) {
                        if (field341[var12++][var11]) {
                            var14 = true;
                            break;
                        }
                    }
                    if (var14) {
                        int var15 = field306 - var5.field233;
                        if (var15 > 32) {
                            var5.field237 = 3;
                        } else {
                            if (var15 >= -32) {
                                continue;
                            }
                            var5.field237 = 4;
                            var15 = -var15;
                        }
                        var5.field238 = (var5.field231 - field304 << 8) / var15;
                        var5.field239 = (var5.field232 - field304 << 8) / var15;
                        var5.field242 = (var5.field235 - field305 << 8) / var15;
                        var5.field243 = (var5.field236 - field305 << 8) / var15;
                        field325[field324++] = var5;
                    }
                }
            } else if (var5.field230 == 4) {
                int var16 = var5.field235 - field305;
                if (var16 > 128) {
                    int var17 = var5.field228 + 25 - field303;
                    if (var17 < 0) {
                        var17 = 0;
                    }
                    int var18 = var5.field229 + 25 - field303;
                    if (var18 > 50) {
                        var18 = 50;
                    }
                    if (var17 <= var18) {
                        int var19 = var5.field226 + 25 - field302;
                        if (var19 < 0) {
                            var19 = 0;
                        }
                        int var20 = var5.field227 + 25 - field302;
                        if (var20 > 50) {
                            var20 = 50;
                        }
                        boolean var21 = false;
                        label149: for (int var22 = var19; var22 <= var20; var22++) {
                            for (int var23 = var17; var23 <= var18; var23++) {
                                if (field341[var22][var23]) {
                                    var21 = true;
                                    break label149;
                                }
                            }
                        }
                        if (var21) {
                            var5.field237 = 5;
                            var5.field238 = (var5.field231 - field304 << 8) / var16;
                            var5.field239 = (var5.field232 - field304 << 8) / var16;
                            var5.field240 = (var5.field233 - field306 << 8) / var16;
                            var5.field241 = (var5.field234 - field306 << 8) / var16;
                            field325[field324++] = var5;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "f", descriptor = "(III)Z")
    private boolean method96(int arg0, int arg1, int arg2) {
        int var4 = this.field294[arg0][arg1][arg2];
        if (-field297 == var4) {
            return false;
        } else if (field297 == var4) {
            return true;
        } else {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            if (this.method100(var5 + 1, this.field289[arg0][arg1][arg2], var6 + 1) && this.method100(var5 + 128 - 1, this.field289[arg0][arg1 + 1][arg2], var6 + 1) && this.method100(var5 + 128 - 1, this.field289[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.method100(var5 + 1, this.field289[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
                this.field294[arg0][arg1][arg2] = field297;
                return true;
            } else {
                this.field294[arg0][arg1][arg2] = -field297;
                return false;
            }
        }
    }

    @OriginalMember(owner = "r", name = "f", descriptor = "(IIII)Z")
    private boolean method97(int arg0, int arg1, int arg2, int arg3) {
        if (!this.method96(arg0, arg1, arg2)) {
            return false;
        }
        int var5 = arg1 << 7;
        int var6 = arg2 << 7;
        int var7 = this.field289[arg0][arg1][arg2] - 1;
        int var8 = var7 - 120;
        int var9 = var7 - 230;
        int var10 = var7 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var5 > field304) {
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
                if (var6 < field306) {
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
                if (var5 < field304) {
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
                if (var6 > field306) {
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

    @OriginalMember(owner = "r", name = "g", descriptor = "(IIII)Z")
    private boolean method98(int arg0, int arg1, int arg2, int arg3) {
        if (this.method96(arg0, arg1, arg2)) {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            return this.method100(var5 + 1, this.field289[arg0][arg1][arg2] - arg3, var6 + 1) && this.method100(var5 + 128 - 1, this.field289[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method100(var5 + 128 - 1, this.field289[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method100(var5 + 1, this.field289[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIIIII)Z")
    private boolean method99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var9 = arg1; var9 <= arg2; var9++) {
                for (int var15 = arg3; var15 <= arg4; var15++) {
                    if (this.field294[arg0][var9][var15] == -field297) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = this.field289[arg0][arg1][arg3] - arg5;
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
            return this.method100(var7 + 1, this.field289[arg0][arg1][arg3] - arg5, var8 + 1) && this.method100(var7 + 128 - 1, this.field289[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.method100(var7 + 128 - 1, this.field289[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.method100(var7 + 1, this.field289[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "g", descriptor = "(III)Z")
    private boolean method100(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < field324; var4++) {
            Occlude var5 = field325[var4];
            if (var5.field237 == 1) {
                int var6 = var5.field231 - arg0;
                if (var6 > 0) {
                    int var7 = (var5.field240 * var6 >> 8) + var5.field233;
                    int var8 = (var5.field241 * var6 >> 8) + var5.field234;
                    int var9 = (var5.field242 * var6 >> 8) + var5.field235;
                    int var10 = (var5.field243 * var6 >> 8) + var5.field236;
                    if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field237 == 2) {
                int var11 = arg0 - var5.field231;
                if (var11 > 0) {
                    int var12 = (var5.field240 * var11 >> 8) + var5.field233;
                    int var13 = (var5.field241 * var11 >> 8) + var5.field234;
                    int var14 = (var5.field242 * var11 >> 8) + var5.field235;
                    int var15 = (var5.field243 * var11 >> 8) + var5.field236;
                    if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
                        return true;
                    }
                }
            } else if (var5.field237 == 3) {
                int var16 = var5.field233 - arg2;
                if (var16 > 0) {
                    int var17 = (var5.field238 * var16 >> 8) + var5.field231;
                    int var18 = (var5.field239 * var16 >> 8) + var5.field232;
                    int var19 = (var5.field242 * var16 >> 8) + var5.field235;
                    int var20 = (var5.field243 * var16 >> 8) + var5.field236;
                    if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
                        return true;
                    }
                }
            } else if (var5.field237 == 4) {
                int var21 = arg2 - var5.field233;
                if (var21 > 0) {
                    int var22 = (var5.field238 * var21 >> 8) + var5.field231;
                    int var23 = (var5.field239 * var21 >> 8) + var5.field232;
                    int var24 = (var5.field242 * var21 >> 8) + var5.field235;
                    int var25 = (var5.field243 * var21 >> 8) + var5.field236;
                    if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
                        return true;
                    }
                }
            } else if (var5.field237 == 5) {
                int var26 = arg1 - var5.field235;
                if (var26 > 0) {
                    int var27 = (var5.field238 * var26 >> 8) + var5.field231;
                    int var28 = (var5.field239 * var26 >> 8) + var5.field232;
                    int var29 = (var5.field240 * var26 >> 8) + var5.field233;
                    int var30 = (var5.field241 * var26 >> 8) + var5.field234;
                    if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
