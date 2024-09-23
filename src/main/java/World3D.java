import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("r")
public class World3D {

    @OriginalMember(owner = "r", name = "b", descriptor = "Z")
    private boolean field275 = true;

    @OriginalMember(owner = "r", name = "d", descriptor = "B")
    private byte field277 = 8;

    @OriginalMember(owner = "r", name = "e", descriptor = "Z")
    private boolean field278 = true;

    @OriginalMember(owner = "r", name = "f", descriptor = "I")
    private int field279 = -12792;

    @OriginalMember(owner = "r", name = "g", descriptor = "I")
    private int field280 = 4;

    @OriginalMember(owner = "r", name = "q", descriptor = "[Lp;")
    public Location[] field290 = new Location[5000];

    @OriginalMember(owner = "r", name = "gb", descriptor = "[I")
    public int[] field332 = new int[10000];

    @OriginalMember(owner = "r", name = "hb", descriptor = "[I")
    public int[] field333 = new int[10000];

    @OriginalMember(owner = "r", name = "jb", descriptor = "[[I")
    public int[][] field335 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "r", name = "kb", descriptor = "[[I")
    public int[][] field336 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "r", name = "j", descriptor = "I")
    public int field283;

    @OriginalMember(owner = "r", name = "k", descriptor = "I")
    public int field284;

    @OriginalMember(owner = "r", name = "l", descriptor = "I")
    public int field285;

    @OriginalMember(owner = "r", name = "n", descriptor = "[[[Lv;")
    public Tile[][][] field287;

    @OriginalMember(owner = "r", name = "r", descriptor = "[[[I")
    public int[][][] field291;

    @OriginalMember(owner = "r", name = "m", descriptor = "[[[I")
    public int[][][] field286;

    @OriginalMember(owner = "r", name = "i", descriptor = "Z")
    public static boolean field282 = true;

    @OriginalMember(owner = "r", name = "I", descriptor = "[Lp;")
    public static Location[] field308 = new Location[100];

    @OriginalMember(owner = "r", name = "J", descriptor = "[I")
    public static final int[] field309 = new int[] { 53, -53, -53, 53 };

    @OriginalMember(owner = "r", name = "K", descriptor = "[I")
    public static final int[] field310 = new int[] { -53, -53, 53, 53 };

    @OriginalMember(owner = "r", name = "L", descriptor = "[I")
    public static final int[] field311 = new int[] { -45, 45, 45, -45 };

    @OriginalMember(owner = "r", name = "M", descriptor = "[I")
    public static final int[] field312 = new int[] { 45, 45, -45, -45 };

    @OriginalMember(owner = "r", name = "Q", descriptor = "I")
    public static int field316 = -1;

    @OriginalMember(owner = "r", name = "R", descriptor = "I")
    public static int field317 = -1;

    @OriginalMember(owner = "r", name = "S", descriptor = "I")
    public static int field318 = 4;

    @OriginalMember(owner = "r", name = "T", descriptor = "[I")
    public static int[] field319 = new int[field318];

    @OriginalMember(owner = "r", name = "U", descriptor = "[[Lm;")
    public static Occlude[][] field320 = new Occlude[field318][500];

    @OriginalMember(owner = "r", name = "W", descriptor = "[Lm;")
    public static Occlude[] field322 = new Occlude[500];

    @OriginalMember(owner = "r", name = "X", descriptor = "Lob;")
    public static LinkList field323 = new LinkList(-822);

    @OriginalMember(owner = "r", name = "Y", descriptor = "[I")
    public static final int[] field324 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "r", name = "Z", descriptor = "[I")
    public static final int[] field325 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "r", name = "ab", descriptor = "[I")
    public static final int[] field326 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "r", name = "bb", descriptor = "[I")
    public static final int[] field327 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "r", name = "cb", descriptor = "[I")
    public static final int[] field328 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "r", name = "db", descriptor = "[I")
    public static final int[] field329 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "r", name = "eb", descriptor = "[I")
    public static final int[] field330 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "r", name = "fb", descriptor = "[I")
    public static final int[] field331 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

    @OriginalMember(owner = "r", name = "lb", descriptor = "[[[[Z")
    public static boolean[][][][] field337 = new boolean[8][32][51][51];

    @OriginalMember(owner = "r", name = "c", descriptor = "B")
    private static byte field276;

    @OriginalMember(owner = "r", name = "a", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "r", name = "o", descriptor = "I")
    public int field288;

    @OriginalMember(owner = "r", name = "p", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "r", name = "s", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "r", name = "t", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "r", name = "u", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "r", name = "v", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "r", name = "w", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "r", name = "x", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "r", name = "y", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "r", name = "z", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "r", name = "A", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "r", name = "B", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "r", name = "C", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "r", name = "D", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "r", name = "E", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "r", name = "F", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "r", name = "G", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "r", name = "H", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "r", name = "O", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "r", name = "P", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "r", name = "V", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "r", name = "ib", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "r", name = "nb", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "r", name = "ob", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "r", name = "pb", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "r", name = "qb", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "r", name = "rb", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "r", name = "sb", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "r", name = "h", descriptor = "Z")
    private static boolean field281;

    @OriginalMember(owner = "r", name = "N", descriptor = "Z")
    public static boolean field313;

    @OriginalMember(owner = "r", name = "mb", descriptor = "[[Z")
    public static boolean[][] field338;

    @OriginalMember(owner = "r", name = "<init>", descriptor = "(III[[[IB)V")
    public World3D(int arg0, int arg1, int arg2, int[][][] arg3, byte arg4) {
        if (arg4 != 6) {
            this.field280 = -497;
        }
        this.field283 = arg0;
        this.field284 = arg2;
        this.field285 = arg1;
        this.field287 = new Tile[arg0][arg2][arg1];
        this.field291 = new int[arg0][arg2 + 1][arg1 + 1];
        this.field286 = arg3;
        this.method50((byte) 52);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(B)V")
    public static void method49(byte arg0) {
        field308 = null;
        field319 = null;
        field320 = null;
        field323 = null;
        field337 = null;
        if (arg0 == 1) {
            boolean var1 = false;
        } else {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        field338 = null;
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(B)V")
    public void method50(byte arg0) {
        if (arg0 != 52) {
            return;
        }
        for (int var2 = 0; var2 < this.field283; var2++) {
            for (int var7 = 0; var7 < this.field284; var7++) {
                for (int var8 = 0; var8 < this.field285; var8++) {
                    this.field287[var2][var7][var8] = null;
                }
            }
        }
        for (int var3 = 0; var3 < field318; var3++) {
            for (int var6 = 0; var6 < field319[var3]; var6++) {
                field320[var3][var6] = null;
            }
            field319[var3] = 0;
        }
        for (int var4 = 0; var4 < this.field289; var4++) {
            this.field290[var4] = null;
        }
        this.field289 = 0;
        for (int var5 = 0; var5 < field308.length; var5++) {
            field308[var5] = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(BI)V")
    public void method51(byte arg0, int arg1) {
        this.field288 = arg1;
        if (arg0 != 4) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < this.field284; var4++) {
            for (int var5 = 0; var5 < this.field285; var5++) {
                this.field287[arg1][var4][var5] = new Tile(arg1, var4, var5);
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(BII)V")
    public void method52(byte arg0, int arg1, int arg2) {
        Tile var4 = this.field287[0][arg1][arg2];
        for (int var5 = 0; var5 < 3; var5++) {
            Tile var7 = this.field287[var5][arg1][arg2] = this.field287[var5 + 1][arg1][arg2];
            if (var7 != null) {
                var7.field366--;
                for (int var8 = 0; var8 < var7.field376; var8++) {
                    Location var9 = var7.field377[var8];
                    if ((var9.field263 >> 29 & 0x3) == 2 && var9.field257 == arg1 && var9.field259 == arg2) {
                        var9.field251--;
                    }
                }
            }
        }
        if (this.field287[0][arg1][arg2] == null) {
            this.field287[0][arg1][arg2] = new Tile(0, arg1, arg2);
        }
        this.field287[0][arg1][arg2].field388 = var4;
        if (arg0 != -28) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field287[3][arg1][arg2] = null;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIBIIIII)V")
    public static void method53(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Occlude var9 = new Occlude();
        var9.field222 = arg4 / 128;
        if (field276 != arg3) {
            return;
        }
        boolean var10 = false;
        var9.field223 = arg5 / 128;
        var9.field224 = arg6 / 128;
        var9.field225 = arg2 / 128;
        var9.field226 = arg8;
        var9.field227 = arg4;
        var9.field228 = arg5;
        var9.field229 = arg6;
        var9.field230 = arg2;
        var9.field231 = arg1;
        var9.field232 = arg7;
        field320[arg0][field319[arg0]++] = var9;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIII)V")
    public void method54(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field287[arg0][arg1][arg2];
        if (var5 != null) {
            this.field287[arg0][arg1][arg2].field380 = arg3;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public void method55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            TileUnderlay var21 = new TileUnderlay(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var22 = arg0; var22 >= 0; var22--) {
                if (this.field287[var22][arg1][arg2] == null) {
                    this.field287[var22][arg1][arg2] = new Tile(var22, arg1, arg2);
                }
            }
            this.field287[arg0][arg1][arg2].field370 = var21;
        } else if (arg3 == 1) {
            TileUnderlay var23 = new TileUnderlay(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var24 = arg0; var24 >= 0; var24--) {
                if (this.field287[var24][arg1][arg2] == null) {
                    this.field287[var24][arg1][arg2] = new Tile(var24, arg1, arg2);
                }
            }
            this.field287[arg0][arg1][arg2].field370 = var23;
        } else {
            TileOverlay var25 = new TileOverlay(arg14, arg6, arg8, arg17, arg18, arg5, arg3, arg19, arg10, arg11, arg12, arg2, arg13, arg9, arg7, arg1, arg4, -196, arg15, arg16);
            for (int var26 = arg0; var26 >= 0; var26--) {
                if (this.field287[var26][arg1][arg2] == null) {
                    this.field287[var26][arg1][arg2] = new Tile(var26, arg1, arg2);
                }
            }
            this.field287[arg0][arg1][arg2].field371 = var25;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILx;IIIZBI)V")
    public void method56(int arg0, Entity arg1, int arg2, int arg3, int arg4, boolean arg5, byte arg6, int arg7) {
        if (arg1 == null) {
            return;
        }
        GroundDecor var9 = new GroundDecor();
        var9.field194 = arg1;
        var9.field192 = arg2 * 128 + 64;
        var9.field193 = arg7 * 128 + 64;
        var9.field191 = arg0;
        var9.field195 = arg4;
        if (!arg5) {
            this.field280 = -11;
        }
        var9.field196 = arg6;
        if (this.field287[arg3][arg2][arg7] == null) {
            this.field287[arg3][arg2][arg7] = new Tile(arg3, arg2, arg7);
        }
        this.field287[arg3][arg2][arg7].field374 = var9;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIILx;Lx;BIILx;)V")
    public void method57(int arg0, int arg1, int arg2, Entity arg3, Entity arg4, byte arg5, int arg6, int arg7, Entity arg8) {
        GroundObject var10 = new GroundObject();
        var10.field200 = arg4;
        var10.field198 = arg6 * 128 + 64;
        var10.field199 = arg0 * 128 + 64;
        var10.field197 = arg7;
        var10.field203 = arg1;
        if (arg5 == 5) {
            boolean var11 = false;
        } else {
            this.field275 = !this.field275;
        }
        var10.field201 = arg3;
        var10.field202 = arg8;
        int var12 = 0;
        Tile var13 = this.field287[arg2][arg6][arg0];
        if (var13 != null) {
            for (int var14 = 0; var14 < var13.field376; var14++) {
                if (var13.field377[var14].field255 instanceof Model) {
                    int var15 = ((Model) var13.field377[var14].field255).field564;
                    if (var15 > var12) {
                        var12 = var15;
                    }
                }
            }
        }
        var10.field204 = var12;
        if (this.field287[arg2][arg6][arg0] == null) {
            this.field287[arg2][arg6][arg0] = new Tile(arg2, arg6, arg0);
        }
        this.field287[arg2][arg6][arg0].field375 = var10;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILx;IIIBIIILx;I)V")
    public void method58(int arg0, Entity arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, Entity arg9, int arg10) {
        if (arg9 == null && arg1 == null) {
            return;
        }
        Wall var12 = new Wall();
        var12.field272 = arg8;
        var12.field273 = arg5;
        var12.field266 = arg3 * 128 + 64;
        var12.field267 = arg10 * 128 + 64;
        var12.field265 = arg2;
        if (arg6 != -30992) {
            this.field275 = !this.field275;
        }
        var12.field270 = arg9;
        var12.field271 = arg1;
        var12.field268 = arg0;
        var12.field269 = arg7;
        for (int var13 = arg4; var13 >= 0; var13--) {
            if (this.field287[var13][arg3][arg10] == null) {
                this.field287[var13][arg3][arg10] = new Tile(var13, arg3, arg10);
            }
        }
        this.field287[arg4][arg3][arg10].field372 = var12;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILx;BIIIBIIIII)V")
    public void method59(int arg0, Entity arg1, byte arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg1 == null) {
            return;
        }
        Decor var13 = new Decor();
        if (arg6 != -18) {
            return;
        }
        var13.field163 = arg11;
        var13.field164 = arg2;
        var13.field158 = arg9 * 128 + arg5 + 64;
        var13.field159 = arg3 * 128 + arg10 + 64;
        var13.field157 = arg4;
        var13.field162 = arg1;
        var13.field160 = arg0;
        var13.field161 = arg7;
        for (int var14 = arg8; var14 >= 0; var14--) {
            if (this.field287[var14][arg9][arg3] == null) {
                this.field287[var14][arg9][arg3] = new Tile(var14, arg9, arg3);
            }
        }
        this.field287[arg8][arg9][arg3].field373 = var13;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIILx;BIII)Z")
    public boolean method60(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Entity arg6, byte arg7, int arg8, int arg9, int arg10) {
        while (arg0 >= 0) {
            this.field275 = !this.field275;
        }
        if (arg6 == null) {
            return true;
        } else {
            int var12 = arg1 * 128 + arg8 * 64;
            int var13 = arg2 * 128 + arg3 * 64;
            return this.method63(arg4, arg1, arg2, arg8, arg3, var12, var13, arg5, arg6, arg9, false, arg10, arg7);
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILx;IIIBIIIZ)Z")
    public boolean method61(int arg0, Entity arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (arg1 == null) {
            return true;
        }
        int var11 = arg2 - arg6;
        int var12 = arg4 - arg6;
        int var13 = arg2 + arg6;
        int var14 = arg4 + arg6;
        if (arg5 == 1) {
            boolean var15 = false;
        } else {
            this.field280 = 45;
        }
        if (arg9) {
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
        int var16 = var11 / 128;
        int var17 = var12 / 128;
        int var18 = var13 / 128;
        int var19 = var14 / 128;
        return this.method63(arg8, var16, var17, var18 + 1 - var16, var19 - var17 + 1, arg2, arg4, arg0, arg1, arg7, true, arg3, (byte) 0);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIIILx;III)Z")
    public boolean method62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Entity arg9, int arg10, int arg11, int arg12) {
        if (arg0 != -23687) {
            throw new NullPointerException();
        }
        return arg9 == null ? true : this.method63(arg8, arg5, arg11, arg3 + 1 - arg5, arg1 - arg11 + 1, arg7, arg10, arg4, arg9, arg2, true, arg12, (byte) 0);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIILx;IZIB)Z")
    private boolean method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, boolean arg10, int arg11, byte arg12) {
        for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
            for (int var21 = arg2; var21 < arg2 + arg4; var21++) {
                if (var14 < 0 || var21 < 0 || var14 >= this.field284 || var21 >= this.field285) {
                    return false;
                }
                Tile var22 = this.field287[arg0][var14][var21];
                if (var22 != null && var22.field376 >= 5) {
                    return false;
                }
            }
        }
        Location var15 = new Location();
        var15.field263 = arg11;
        var15.field264 = arg12;
        var15.field251 = arg0;
        var15.field253 = arg5;
        var15.field254 = arg6;
        var15.field252 = arg7;
        var15.field255 = arg8;
        var15.field256 = arg9;
        var15.field257 = arg1;
        var15.field259 = arg2;
        var15.field258 = arg1 + arg3 - 1;
        var15.field260 = arg2 + arg4 - 1;
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
                    if (this.field287[var19][var16][var17] == null) {
                        this.field287[var19][var16][var17] = new Tile(var19, var16, var17);
                    }
                }
                Tile var20 = this.field287[arg0][var16][var17];
                var20.field377[var20.field376] = var15;
                var20.field378[var20.field376] = var18;
                var20.field379 |= var18;
                var20.field376++;
            }
        }
        if (arg10) {
            this.field290[this.field289++] = var15;
        }
        return true;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(I)V")
    public void method64(int arg0) {
        for (int var2 = 0; var2 < this.field289; var2++) {
            Location var3 = this.field290[var2];
            this.method65(var3, 0);
            this.field290[var2] = null;
        }
        if (arg0 < 0) {
            this.field289 = 0;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lp;I)V")
    private void method65(Location arg0, int arg1) {
        if (arg1 != 0) {
            field281 = !field281;
        }
        for (int var3 = arg0.field257; var3 <= arg0.field258; var3++) {
            for (int var4 = arg0.field259; var4 <= arg0.field260; var4++) {
                Tile var5 = this.field287[arg0.field251][var3][var4];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field376; var6++) {
                        if (var5.field377[var6] == arg0) {
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
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ZIIII)V")
    public void method66(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        Tile var6 = this.field287[arg3][arg1][arg2];
        if (var6 == null) {
            return;
        }
        Decor var7 = var6.field373;
        if (arg0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        if (var7 != null) {
            int var9 = arg1 * 128 + 64;
            int var10 = arg2 * 128 + 64;
            var7.field158 = (var7.field158 - var9) * arg4 / 16 + var9;
            var7.field159 = (var7.field159 - var10) * arg4 / 16 + var10;
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIII)V")
    public void method67(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field287[arg0][arg2][arg1];
        if (arg3 == 45735 && var5 != null) {
            var5.field372 = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIB)V")
    public void method68(int arg0, int arg1, int arg2, byte arg3) {
        Tile var5 = this.field287[arg1][arg2][arg0];
        if (arg3 == -120 && var5 != null) {
            var5.field373 = null;
        }
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(IIII)V")
    public void method69(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field287[arg1][arg2][arg0];
        if (arg3 >= 0) {
            this.field274 = -489;
        }
        if (var5 == null) {
            return;
        }
        for (int var6 = 0; var6 < var5.field376; var6++) {
            Location var7 = var5.field377[var6];
            if ((var7.field263 >> 29 & 0x3) == 2 && var7.field257 == arg2 && var7.field259 == arg0) {
                this.method65(var7, 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IBII)V")
    public void method70(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == 4) {
            Tile var5 = this.field287[arg2][arg0][arg3];
            if (var5 != null) {
                var5.field374 = null;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(III)V")
    public void method71(int arg0, int arg1, int arg2) {
        Tile var4 = this.field287[arg0][arg1][arg2];
        if (var4 != null) {
            var4.field375 = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(BIII)Lq;")
    public Wall method72(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -31) {
            throw new NullPointerException();
        }
        Tile var5 = this.field287[arg2][arg3][arg1];
        return var5 == null ? null : var5.field372;
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IBII)Lh;")
    public Decor method73(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 1) {
            this.field275 = !this.field275;
        }
        Tile var5 = this.field287[arg2][arg0][arg3];
        return var5 == null ? null : var5.field373;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIZI)Lp;")
    public Location method74(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        Tile var6 = this.field287[arg1][arg0][arg3];
        if (var6 == null) {
            return null;
        }
        for (int var7 = 0; var7 < var6.field376; var7++) {
            Location var8 = var6.field377[var7];
            if ((var8.field263 >> 29 & 0x3) == 2 && var8.field257 == arg0 && var8.field259 == arg3) {
                return var8;
            }
        }
        return null;
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIIB)Lj;")
    public GroundDecor method75(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 7) {
            this.field278 = !this.field278;
        }
        Tile var5 = this.field287[arg1][arg0][arg2];
        return var5 == null || var5.field374 == null ? null : var5.field374;
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(III)I")
    public int method76(int arg0, int arg1, int arg2) {
        Tile var4 = this.field287[arg0][arg1][arg2];
        return var4 == null || var4.field372 == null ? 0 : var4.field372.field272;
    }

    @OriginalMember(owner = "r", name = "d", descriptor = "(IIII)I")
    public int method77(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field287[arg2][arg1][arg0];
        int var6 = 59 / arg3;
        return var5 == null || var5.field373 == null ? 0 : var5.field373.field163;
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(III)I")
    public int method78(int arg0, int arg1, int arg2) {
        Tile var4 = this.field287[arg0][arg1][arg2];
        if (var4 == null) {
            return 0;
        }
        for (int var5 = 0; var5 < var4.field376; var5++) {
            Location var6 = var4.field377[var5];
            if ((var6.field263 >> 29 & 0x3) == 2 && var6.field257 == arg1 && var6.field259 == arg2) {
                return var6.field263;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "r", name = "d", descriptor = "(III)I")
    public int method79(int arg0, int arg1, int arg2) {
        Tile var4 = this.field287[arg0][arg1][arg2];
        return var4 == null || var4.field374 == null ? 0 : var4.field374.field195;
    }

    @OriginalMember(owner = "r", name = "e", descriptor = "(IIII)I")
    public int method80(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field287[arg0][arg1][arg2];
        if (var5 == null) {
            return -1;
        } else if (var5.field372 != null && var5.field372.field272 == arg3) {
            return var5.field372.field273 & 0xFF;
        } else if (var5.field373 != null && var5.field373.field163 == arg3) {
            return var5.field373.field164 & 0xFF;
        } else if (var5.field374 != null && var5.field374.field195 == arg3) {
            return var5.field374.field196 & 0xFF;
        } else {
            for (int var6 = 0; var6 < var5.field376; var6++) {
                if (var5.field377[var6].field263 == arg3) {
                    return var5.field377[var6].field264 & 0xFF;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIII)V")
    public void method81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = (int) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2 + arg4 * arg4));
        int var9 = arg5 * var8 >> 8;
        for (int var10 = 0; var10 < this.field283; var10++) {
            for (int var11 = 0; var11 < this.field284; var11++) {
                for (int var12 = 0; var12 < this.field285; var12++) {
                    Tile var13 = this.field287[var10][var11][var12];
                    if (var13 != null) {
                        Wall var14 = var13.field372;
                        if (var14 != null && var14.field270 != null && var14.field270.field393 != null) {
                            this.method83(1, var12, 4, var11, 1, var10, (Model) var14.field270);
                            if (var14.field271 != null && var14.field271.field393 != null) {
                                this.method83(1, var12, 4, var11, 1, var10, (Model) var14.field271);
                                this.method84((Model) var14.field270, (Model) var14.field271, 0, 0, 0, false);
                                ((Model) var14.field271).method143(arg1, var9, arg4, arg2, arg0);
                            }
                            ((Model) var14.field270).method143(arg1, var9, arg4, arg2, arg0);
                        }
                        for (int var15 = 0; var15 < var13.field376; var15++) {
                            Location var17 = var13.field377[var15];
                            if (var17 != null && var17.field255 != null && var17.field255.field393 != null) {
                                this.method83(var17.field260 + 1 - var17.field259, var12, 4, var11, var17.field258 + 1 - var17.field257, var10, (Model) var17.field255);
                                ((Model) var17.field255).method143(arg1, var9, arg4, arg2, arg0);
                            }
                        }
                        GroundDecor var16 = var13.field374;
                        if (var16 != null && var16.field194.field393 != null) {
                            this.method82((Model) var16.field194, var11, var10, true, var12);
                            ((Model) var16.field194).method143(arg1, var9, arg4, arg2, arg0);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Leb;IIZI)V")
    private void method82(Model arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            return;
        }
        if (arg1 < this.field284) {
            Tile var6 = this.field287[arg2][arg1 + 1][arg4];
            if (var6 != null && var6.field374 != null && var6.field374.field194.field393 != null) {
                this.method84(arg0, (Model) var6.field374.field194, 128, 0, 0, true);
            }
        }
        if (arg4 < this.field284) {
            Tile var7 = this.field287[arg2][arg1][arg4 + 1];
            if (var7 != null && var7.field374 != null && var7.field374.field194.field393 != null) {
                this.method84(arg0, (Model) var7.field374.field194, 0, 0, 128, true);
            }
        }
        if (arg1 < this.field284 && arg4 < this.field285) {
            Tile var8 = this.field287[arg2][arg1 + 1][arg4 + 1];
            if (var8 != null && var8.field374 != null && var8.field374.field194.field393 != null) {
                this.method84(arg0, (Model) var8.field374.field194, 128, 0, 128, true);
            }
        }
        if (arg1 >= this.field284 || arg4 <= 0) {
            return;
        }
        Tile var9 = this.field287[arg2][arg1 + 1][arg4 - 1];
        if (var9 != null && var9.field374 != null && var9.field374.field194.field393 != null) {
            this.method84(arg0, (Model) var9.field374.field194, 128, 0, -128, true);
            return;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIILeb;)V")
    private void method83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Model arg6) {
        boolean var8 = true;
        if (arg2 != 4) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = arg3;
        int var11 = arg3 + arg4;
        int var12 = arg1 - 1;
        int var13 = arg0 + arg1;
        for (int var14 = arg5; var14 <= arg5 + 1; var14++) {
            if (this.field283 != var14) {
                for (int var15 = var10; var15 <= var11; var15++) {
                    if (var15 >= 0 && var15 < this.field284) {
                        for (int var16 = var12; var16 <= var13; var16++) {
                            if (var16 >= 0 && var16 < this.field285 && (!var8 || var15 >= var11 || var16 >= var13 || var16 < arg1 && arg3 != var15)) {
                                Tile var17 = this.field287[var14][var15][var16];
                                if (var17 != null) {
                                    int var18 = (this.field286[var14][var15 + 1][var16] + this.field286[var14][var15][var16] + this.field286[var14][var15][var16 + 1] + this.field286[var14][var15 + 1][var16 + 1]) / 4 - (this.field286[arg5][arg3 + 1][arg1] + this.field286[arg5][arg3][arg1] + this.field286[arg5][arg3][arg1 + 1] + this.field286[arg5][arg3 + 1][arg1 + 1]) / 4;
                                    Wall var19 = var17.field372;
                                    if (var19 != null && var19.field270 != null && var19.field270.field393 != null) {
                                        this.method84(arg6, (Model) var19.field270, (var15 - arg3) * 128 + (1 - arg4) * 64, var18, (1 - arg0) * 64 + (var16 - arg1) * 128, var8);
                                    }
                                    if (var19 != null && var19.field271 != null && var19.field271.field393 != null) {
                                        this.method84(arg6, (Model) var19.field271, (var15 - arg3) * 128 + (1 - arg4) * 64, var18, (1 - arg0) * 64 + (var16 - arg1) * 128, var8);
                                    }
                                    for (int var20 = 0; var20 < var17.field376; var20++) {
                                        Location var21 = var17.field377[var20];
                                        if (var21 != null && var21.field255 != null && var21.field255.field393 != null) {
                                            int var22 = var21.field258 + 1 - var21.field257;
                                            int var23 = var21.field260 + 1 - var21.field259;
                                            this.method84(arg6, (Model) var21.field255, (var21.field257 - arg3) * 128 + (var22 - arg4) * 64, var18, (var21.field259 - arg1) * 128 + (var23 - arg0) * 64, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var10--;
                var8 = false;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Leb;Leb;IIIZ)V")
    private void method84(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field334++;
        int var7 = 0;
        int[] var8 = arg1.field537;
        int var9 = arg1.field536;
        for (int var10 = 0; var10 < arg0.field536; var10++) {
            VertexNormal var13 = arg0.field393[var10];
            VertexNormal var14 = arg0.field570[var10];
            if (var14.field243 != 0) {
                int var15 = arg0.field538[var10] - arg3;
                if (var15 <= arg1.field561) {
                    int var16 = arg0.field537[var10] - arg2;
                    if (var16 >= arg1.field556 && var16 <= arg1.field557) {
                        int var17 = arg0.field539[var10] - arg4;
                        if (var17 >= arg1.field559 && var17 <= arg1.field558) {
                            for (int var18 = 0; var18 < var9; var18++) {
                                VertexNormal var19 = arg1.field393[var18];
                                VertexNormal var20 = arg1.field570[var18];
                                if (var8[var18] == var16 && arg1.field539[var18] == var17 && arg1.field538[var18] == var15 && var20.field243 != 0) {
                                    var13.field240 += var20.field240;
                                    var13.field241 += var20.field241;
                                    var13.field242 += var20.field242;
                                    var13.field243 += var20.field243;
                                    var19.field240 += var14.field240;
                                    var19.field241 += var14.field241;
                                    var19.field242 += var14.field242;
                                    var19.field243 += var14.field243;
                                    var7++;
                                    this.field332[var10] = this.field334;
                                    this.field333[var18] = this.field334;
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
            if (this.field332[arg0.field541[var11]] == this.field334 && this.field332[arg0.field542[var11]] == this.field334 && this.field332[arg0.field543[var11]] == this.field334) {
                arg0.field547[var11] = -1;
            }
        }
        for (int var12 = 0; var12 < arg1.field540; var12++) {
            if (this.field333[arg1.field541[var12]] == this.field334 && this.field333[arg1.field542[var12]] == this.field334 && this.field333[arg1.field543[var12]] == this.field334) {
                arg1.field547[var12] = -1;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "([IIIIII)V")
    public void method85(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Tile var7 = this.field287[arg3][arg4][arg5];
        if (var7 == null) {
            return;
        }
        TileUnderlay var8 = var7.field370;
        if (var8 != null) {
            int var9 = var8.field250;
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
        int var12 = var11.field177;
        int var13 = var11.field178;
        int var14 = var11.field179;
        int var15 = var11.field180;
        int[] var16 = this.field335[var12];
        int[] var17 = this.field336[var13];
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

    @OriginalMember(owner = "r", name = "a", descriptor = "(IZIII[I)V")
    public static void method86(int arg0, boolean arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg1) {
            return;
        }
        field341 = 0;
        field342 = 0;
        field343 = arg3;
        field344 = arg0;
        field339 = arg3 / 2;
        field340 = arg0 / 2;
        boolean[][][][] var6 = new boolean[9][32][53][53];
        for (int var7 = 128; var7 <= 384; var7 += 32) {
            for (int var15 = 0; var15 < 2048; var15 += 64) {
                field304 = Model.field599[var7];
                field305 = Model.field600[var7];
                field306 = Model.field599[var15];
                field307 = Model.field600[var15];
                int var16 = (var7 - 128) / 32;
                int var17 = var15 / 64;
                for (int var18 = -26; var18 <= 26; var18++) {
                    for (int var19 = -26; var19 <= 26; var19++) {
                        int var20 = var18 * 128;
                        int var21 = var19 * 128;
                        boolean var22 = false;
                        for (int var23 = -arg4; var23 <= arg2; var23 += 128) {
                            if (method87(var21, true, var20, arg5[var16] + var23)) {
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
                        field337[var8][var9][var10 + 25][var11 + 25] = var12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IZII)Z")
    public static boolean method87(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            field281 = !field281;
        }
        int var4 = field307 * arg2 + field306 * arg0 >> 16;
        int var5 = field307 * arg0 - field306 * arg2 >> 16;
        int var6 = field305 * var5 + field304 * arg3 >> 16;
        int var7 = field305 * arg3 - field304 * var5 >> 16;
        if (var6 >= 50 && var6 <= 3500) {
            int var8 = (var4 << 9) / var6 + field339;
            int var9 = (var7 << 9) / var6 + field340;
            return var8 >= field341 && var8 <= field343 && var9 >= field342 && var9 <= field344;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIB)V")
    public void method88(int arg0, int arg1, byte arg2) {
        if (arg2 != 111) {
            return;
        }
        field313 = true;
        field314 = arg0;
        field315 = arg1;
        field316 = -1;
        field317 = -1;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIII)V")
    public void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= this.field284 * 128) {
            arg0 = this.field284 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= this.field285 * 128) {
            arg2 = this.field285 * 128 - 1;
        }
        field294++;
        field304 = Model.field599[arg6];
        field305 = Model.field600[arg6];
        field306 = Model.field599[arg3];
        field307 = Model.field600[arg3];
        field338 = field337[(arg6 - 128) / 32][arg3 / 64];
        field301 = arg0;
        field302 = arg4;
        field303 = arg2;
        field299 = arg0 / 128;
        field300 = arg2 / 128;
        field293 = arg5;
        field295 = field299 - 25;
        if (field295 < 0) {
            field295 = 0;
        }
        field297 = field300 - 25;
        if (field297 < 0) {
            field297 = 0;
        }
        field296 = field299 + 25;
        if (arg1 != -41301) {
            this.field280 = 460;
        }
        if (field296 > this.field284) {
            field296 = this.field284;
        }
        field298 = field300 + 25;
        if (field298 > this.field285) {
            field298 = this.field285;
        }
        this.method95(this.field280);
        field292 = 0;
        for (int var8 = this.field288; var8 < this.field283; var8++) {
            Tile[][] var33 = this.field287[var8];
            for (int var34 = field295; var34 < field296; var34++) {
                for (int var35 = field297; var35 < field298; var35++) {
                    Tile var36 = var33[var34][var35];
                    if (var36 != null) {
                        if (var36.field380 <= arg5 && (field338[var34 + 25 - field299][var35 + 25 - field300] || this.field286[var8][var34][var35] - arg4 >= 2000)) {
                            var36.field381 = true;
                            var36.field382 = true;
                            if (var36.field376 > 0) {
                                var36.field383 = true;
                            } else {
                                var36.field383 = false;
                            }
                            field292++;
                        } else {
                            var36.field381 = false;
                            var36.field382 = false;
                            var36.field384 = 0;
                        }
                    }
                }
            }
        }
        for (int var9 = this.field288; var9 < this.field283; var9++) {
            Tile[][] var22 = this.field287[var9];
            for (int var23 = -25; var23 <= 0; var23++) {
                int var24 = field299 + var23;
                int var25 = field299 - var23;
                if (var24 >= field295 || var25 < field296) {
                    for (int var26 = -25; var26 <= 0; var26++) {
                        int var27 = field300 + var26;
                        int var28 = field300 - var26;
                        if (var24 >= field295) {
                            if (var27 >= field297) {
                                Tile var29 = var22[var24][var27];
                                if (var29 != null && var29.field381) {
                                    this.method90(var29, true);
                                }
                            }
                            if (var28 < field298) {
                                Tile var30 = var22[var24][var28];
                                if (var30 != null && var30.field381) {
                                    this.method90(var30, true);
                                }
                            }
                        }
                        if (var25 < field296) {
                            if (var27 >= field297) {
                                Tile var31 = var22[var25][var27];
                                if (var31 != null && var31.field381) {
                                    this.method90(var31, true);
                                }
                            }
                            if (var28 < field298) {
                                Tile var32 = var22[var25][var28];
                                if (var32 != null && var32.field381) {
                                    this.method90(var32, true);
                                }
                            }
                        }
                        if (field292 == 0) {
                            field313 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var10 = this.field288; var10 < this.field283; var10++) {
            Tile[][] var11 = this.field287[var10];
            for (int var12 = -25; var12 <= 0; var12++) {
                int var13 = field299 + var12;
                int var14 = field299 - var12;
                if (var13 >= field295 || var14 < field296) {
                    for (int var15 = -25; var15 <= 0; var15++) {
                        int var16 = field300 + var15;
                        int var17 = field300 - var15;
                        if (var13 >= field295) {
                            if (var16 >= field297) {
                                Tile var18 = var11[var13][var16];
                                if (var18 != null && var18.field381) {
                                    this.method90(var18, false);
                                }
                            }
                            if (var17 < field298) {
                                Tile var19 = var11[var13][var17];
                                if (var19 != null && var19.field381) {
                                    this.method90(var19, false);
                                }
                            }
                        }
                        if (var14 < field296) {
                            if (var16 >= field297) {
                                Tile var20 = var11[var14][var16];
                                if (var20 != null && var20.field381) {
                                    this.method90(var20, false);
                                }
                            }
                            if (var17 < field298) {
                                Tile var21 = var11[var14][var17];
                                if (var21 != null && var21.field381) {
                                    this.method90(var21, false);
                                }
                            }
                        }
                        if (field292 == 0) {
                            field313 = false;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lv;Z)V")
    public void method90(Tile arg0, boolean arg1) {
        field323.method240(arg0);
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
                                                var3 = (Tile) field323.method242();
                                                if (var3 == null) {
                                                    return;
                                                }
                                            } while (!var3.field382);
                                            var4 = var3.field367;
                                            var5 = var3.field368;
                                            var6 = var3.field366;
                                            var7 = var3.field369;
                                            var8 = this.field287[var6];
                                            if (!var3.field381) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var6 > 0) {
                                                    Tile var9 = this.field287[var6 - 1][var4][var5];
                                                    if (var9 != null && var9.field382) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= field299 && var4 > field295) {
                                                    Tile var10 = var8[var4 - 1][var5];
                                                    if (var10 != null && var10.field382 && (var10.field381 || (var3.field379 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= field299 && var4 < field296 - 1) {
                                                    Tile var11 = var8[var4 + 1][var5];
                                                    if (var11 != null && var11.field382 && (var11.field381 || (var3.field379 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 <= field300 && var5 > field297) {
                                                    Tile var12 = var8[var4][var5 - 1];
                                                    if (var12 != null && var12.field382 && (var12.field381 || (var3.field379 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 >= field300 && var5 < field298 - 1) {
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
                                                        this.method92(field306, field305, var4, var14.field371, 7, field307, var5, field304);
                                                    }
                                                } else if (!this.method96(0, var4, var5)) {
                                                    this.method91(var14.field370, 0, field304, field305, field306, field307, var4, var5);
                                                }
                                                Wall var15 = var14.field372;
                                                if (var15 != null) {
                                                    var15.field270.method108(0, field304, field305, field306, field307, var15.field266 - field301, var15.field265 - field302, var15.field267 - field303, var15.field272);
                                                }
                                                for (int var16 = 0; var16 < var14.field376; var16++) {
                                                    Location var17 = var14.field377[var16];
                                                    if (var17 != null) {
                                                        var17.field255.method108(var17.field256, field304, field305, field306, field307, var17.field253 - field301, var17.field252 - field302, var17.field254 - field303, var17.field263);
                                                    }
                                                }
                                            }
                                            boolean var18 = false;
                                            if (var3.field370 == null) {
                                                if (var3.field371 != null && !this.method96(var7, var4, var5)) {
                                                    var18 = true;
                                                    this.method92(field306, field305, var4, var3.field371, 7, field307, var5, field304);
                                                }
                                            } else if (!this.method96(var7, var4, var5)) {
                                                var18 = true;
                                                this.method91(var3.field370, var7, field304, field305, field306, field307, var4, var5);
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            Wall var21 = var3.field372;
                                            Decor var22 = var3.field373;
                                            if (var21 != null || var22 != null) {
                                                if (field299 == var4) {
                                                    var19++;
                                                } else if (field299 < var4) {
                                                    var19 += 2;
                                                }
                                                if (field300 == var5) {
                                                    var19 += 3;
                                                } else if (field300 > var5) {
                                                    var19 += 6;
                                                }
                                                var20 = field324[var19];
                                                var3.field387 = field326[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field268 & field325[var19]) == 0) {
                                                    var3.field384 = 0;
                                                } else if (var21.field268 == 16) {
                                                    var3.field384 = 3;
                                                    var3.field385 = field327[var19];
                                                    var3.field386 = 3 - var3.field385;
                                                } else if (var21.field268 == 32) {
                                                    var3.field384 = 6;
                                                    var3.field385 = field328[var19];
                                                    var3.field386 = 6 - var3.field385;
                                                } else if (var21.field268 == 64) {
                                                    var3.field384 = 12;
                                                    var3.field385 = field329[var19];
                                                    var3.field386 = 12 - var3.field385;
                                                } else {
                                                    var3.field384 = 9;
                                                    var3.field385 = field330[var19];
                                                    var3.field386 = 9 - var3.field385;
                                                }
                                                if ((var21.field268 & var20) != 0 && !this.method97(var7, var4, var5, var21.field268)) {
                                                    var21.field270.method108(0, field304, field305, field306, field307, var21.field266 - field301, var21.field265 - field302, var21.field267 - field303, var21.field272);
                                                }
                                                if ((var21.field269 & var20) != 0 && !this.method97(var7, var4, var5, var21.field269)) {
                                                    var21.field271.method108(0, field304, field305, field306, field307, var21.field266 - field301, var21.field265 - field302, var21.field267 - field303, var21.field272);
                                                }
                                            }
                                            if (var22 != null && !this.method98(var7, var4, var5, var22.field162.field394)) {
                                                if ((var22.field160 & var20) != 0) {
                                                    var22.field162.method108(var22.field161, field304, field305, field306, field307, var22.field158 - field301, var22.field157 - field302, var22.field159 - field303, var22.field163);
                                                } else if ((var22.field160 & 0x300) != 0) {
                                                    int var23 = var22.field158 - field301;
                                                    int var24 = var22.field157 - field302;
                                                    int var25 = var22.field159 - field303;
                                                    int var26 = var22.field161;
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
                                                    if ((var22.field160 & 0x100) != 0 && var28 < var27) {
                                                        int var29 = field309[var26] + var23;
                                                        int var30 = field310[var26] + var25;
                                                        var22.field162.method108(var26 * 512 + 256, field304, field305, field306, field307, var29, var24, var30, var22.field163);
                                                    }
                                                    if ((var22.field160 & 0x200) != 0 && var28 > var27) {
                                                        int var31 = field311[var26] + var23;
                                                        int var32 = field312[var26] + var25;
                                                        var22.field162.method108(var26 * 512 + 1280 & 0x7FF, field304, field305, field306, field307, var31, var24, var32, var22.field163);
                                                    }
                                                }
                                            }
                                            if (var18) {
                                                GroundDecor var33 = var3.field374;
                                                if (var33 != null) {
                                                    var33.field194.method108(0, field304, field305, field306, field307, var33.field192 - field301, var33.field191 - field302, var33.field193 - field303, var33.field195);
                                                }
                                                GroundObject var34 = var3.field375;
                                                if (var34 != null && var34.field204 == 0) {
                                                    if (var34.field201 != null) {
                                                        var34.field201.method108(0, field304, field305, field306, field307, var34.field198 - field301, var34.field197 - field302, var34.field199 - field303, var34.field203);
                                                    }
                                                    if (var34.field202 != null) {
                                                        var34.field202.method108(0, field304, field305, field306, field307, var34.field198 - field301, var34.field197 - field302, var34.field199 - field303, var34.field203);
                                                    }
                                                    if (var34.field200 != null) {
                                                        var34.field200.method108(0, field304, field305, field306, field307, var34.field198 - field301, var34.field197 - field302, var34.field199 - field303, var34.field203);
                                                    }
                                                }
                                            }
                                            int var35 = var3.field379;
                                            if (var35 != 0) {
                                                if (var4 < field299 && (var35 & 0x4) != 0) {
                                                    Tile var36 = var8[var4 + 1][var5];
                                                    if (var36 != null && var36.field382) {
                                                        field323.method240(var36);
                                                    }
                                                }
                                                if (var5 < field300 && (var35 & 0x2) != 0) {
                                                    Tile var37 = var8[var4][var5 + 1];
                                                    if (var37 != null && var37.field382) {
                                                        field323.method240(var37);
                                                    }
                                                }
                                                if (var4 > field299 && (var35 & 0x1) != 0) {
                                                    Tile var38 = var8[var4 - 1][var5];
                                                    if (var38 != null && var38.field382) {
                                                        field323.method240(var38);
                                                    }
                                                }
                                                if (var5 > field300 && (var35 & 0x8) != 0) {
                                                    Tile var39 = var8[var4][var5 - 1];
                                                    if (var39 != null && var39.field382) {
                                                        field323.method240(var39);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var3.field384 != 0) {
                                            boolean var40 = true;
                                            for (int var41 = 0; var41 < var3.field376; var41++) {
                                                if (field294 != var3.field377[var41].field262 && (var3.field378[var41] & var3.field384) == var3.field385) {
                                                    var40 = false;
                                                    break;
                                                }
                                            }
                                            if (var40) {
                                                Wall var42 = var3.field372;
                                                if (!this.method97(var7, var4, var5, var42.field268)) {
                                                    var42.field270.method108(0, field304, field305, field306, field307, var42.field266 - field301, var42.field265 - field302, var42.field267 - field303, var42.field272);
                                                }
                                                var3.field384 = 0;
                                            }
                                        }
                                        if (!var3.field383) {
                                            break;
                                        }
                                        int var43 = var3.field376;
                                        var3.field383 = false;
                                        int var44 = 0;
                                        label563: for (int var45 = 0; var45 < var43; var45++) {
                                            Location var58 = var3.field377[var45];
                                            if (field294 != var58.field262) {
                                                for (int var59 = var58.field257; var59 <= var58.field258; var59++) {
                                                    for (int var64 = var58.field259; var64 <= var58.field260; var64++) {
                                                        Tile var65 = var8[var59][var64];
                                                        if (var65.field381) {
                                                            var3.field383 = true;
                                                            continue label563;
                                                        }
                                                        if (var65.field384 != 0) {
                                                            int var66 = 0;
                                                            if (var59 > var58.field257) {
                                                                var66++;
                                                            }
                                                            if (var59 < var58.field258) {
                                                                var66 += 4;
                                                            }
                                                            if (var64 > var58.field259) {
                                                                var66 += 8;
                                                            }
                                                            if (var64 < var58.field260) {
                                                                var66 += 2;
                                                            }
                                                            if ((var66 & var65.field384) == var3.field386) {
                                                                var3.field383 = true;
                                                                continue label563;
                                                            }
                                                        }
                                                    }
                                                }
                                                field308[var44++] = var58;
                                                int var60 = field299 - var58.field257;
                                                int var61 = var58.field258 - field299;
                                                if (var61 > var60) {
                                                    var60 = var61;
                                                }
                                                int var62 = field300 - var58.field259;
                                                int var63 = var58.field260 - field300;
                                                if (var63 > var62) {
                                                    var58.field261 = var60 + var63;
                                                } else {
                                                    var58.field261 = var60 + var62;
                                                }
                                            }
                                        }
                                        while (var44 > 0) {
                                            int var46 = -50;
                                            int var47 = -1;
                                            for (int var48 = 0; var48 < var44; var48++) {
                                                Location var53 = field308[var48];
                                                if (field294 != var53.field262) {
                                                    if (var53.field261 > var46) {
                                                        var46 = var53.field261;
                                                        var47 = var48;
                                                    } else if (var53.field261 == var46) {
                                                        int var54 = var53.field253 - field301;
                                                        int var55 = var53.field254 - field303;
                                                        int var56 = field308[var47].field253 - field301;
                                                        int var57 = field308[var47].field254 - field303;
                                                        if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                            var47 = var48;
                                                        }
                                                    }
                                                }
                                            }
                                            if (var47 == -1) {
                                                break;
                                            }
                                            Location var49 = field308[var47];
                                            var49.field262 = field294;
                                            if (!this.method99(var7, var49.field257, var49.field258, var49.field259, var49.field260, var49.field255.field394)) {
                                                var49.field255.method108(var49.field256, field304, field305, field306, field307, var49.field253 - field301, var49.field252 - field302, var49.field254 - field303, var49.field263);
                                            }
                                            for (int var50 = var49.field257; var50 <= var49.field258; var50++) {
                                                for (int var51 = var49.field259; var51 <= var49.field260; var51++) {
                                                    Tile var52 = var8[var50][var51];
                                                    if (var52.field384 != 0) {
                                                        field323.method240(var52);
                                                    } else if ((var4 != var50 || var5 != var51) && var52.field382) {
                                                        field323.method240(var52);
                                                    }
                                                }
                                            }
                                        }
                                        if (!var3.field383) {
                                            break;
                                        }
                                    }
                                } while (!var3.field382);
                            } while (var3.field384 != 0);
                            if (var4 > field299 || var4 <= field295) {
                                break;
                            }
                            var67 = var8[var4 - 1][var5];
                        } while (var67 != null && var67.field382);
                        if (var4 < field299 || var4 >= field296 - 1) {
                            break;
                        }
                        var68 = var8[var4 + 1][var5];
                    } while (var68 != null && var68.field382);
                    if (var5 > field300 || var5 <= field297) {
                        break;
                    }
                    var69 = var8[var4][var5 - 1];
                } while (var69 != null && var69.field382);
                if (var5 < field300 || var5 >= field298 - 1) {
                    break;
                }
                var70 = var8[var4][var5 + 1];
            } while (var70 != null && var70.field382);
            var3.field382 = false;
            field292--;
            GroundObject var71 = var3.field375;
            if (var71 != null && var71.field204 != 0) {
                if (var71.field201 != null) {
                    var71.field201.method108(0, field304, field305, field306, field307, var71.field198 - field301, var71.field197 - field302 - var71.field204, var71.field199 - field303, var71.field203);
                }
                if (var71.field202 != null) {
                    var71.field202.method108(0, field304, field305, field306, field307, var71.field198 - field301, var71.field197 - field302 - var71.field204, var71.field199 - field303, var71.field203);
                }
                if (var71.field200 != null) {
                    var71.field200.method108(0, field304, field305, field306, field307, var71.field198 - field301, var71.field197 - field302 - var71.field204, var71.field199 - field303, var71.field203);
                }
            }
            if (var3.field387 != 0) {
                Decor var72 = var3.field373;
                if (var72 != null && !this.method98(var7, var4, var5, var72.field162.field394)) {
                    if ((var72.field160 & var3.field387) != 0) {
                        var72.field162.method108(var72.field161, field304, field305, field306, field307, var72.field158 - field301, var72.field157 - field302, var72.field159 - field303, var72.field163);
                    } else if ((var72.field160 & 0x300) != 0) {
                        int var73 = var72.field158 - field301;
                        int var74 = var72.field157 - field302;
                        int var75 = var72.field159 - field303;
                        int var76 = var72.field161;
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
                        if ((var72.field160 & 0x100) != 0 && var78 >= var77) {
                            int var79 = field309[var76] + var73;
                            int var80 = field310[var76] + var75;
                            var72.field162.method108(var76 * 512 + 256, field304, field305, field306, field307, var79, var74, var80, var72.field163);
                        }
                        if ((var72.field160 & 0x200) != 0 && var78 <= var77) {
                            int var81 = field311[var76] + var73;
                            int var82 = field312[var76] + var75;
                            var72.field162.method108(var76 * 512 + 1280 & 0x7FF, field304, field305, field306, field307, var81, var74, var82, var72.field163);
                        }
                    }
                }
                Wall var83 = var3.field372;
                if (var83 != null) {
                    if ((var83.field269 & var3.field387) != 0 && !this.method97(var7, var4, var5, var83.field269)) {
                        var83.field271.method108(0, field304, field305, field306, field307, var83.field266 - field301, var83.field265 - field302, var83.field267 - field303, var83.field272);
                    }
                    if ((var83.field268 & var3.field387) != 0 && !this.method97(var7, var4, var5, var83.field268)) {
                        var83.field270.method108(0, field304, field305, field306, field307, var83.field266 - field301, var83.field265 - field302, var83.field267 - field303, var83.field272);
                    }
                }
            }
            if (var6 < this.field283 - 1) {
                Tile var84 = this.field287[var6 + 1][var4][var5];
                if (var84 != null && var84.field382) {
                    field323.method240(var84);
                }
            }
            if (var4 < field299) {
                Tile var85 = var8[var4 + 1][var5];
                if (var85 != null && var85.field382) {
                    field323.method240(var85);
                }
            }
            if (var5 < field300) {
                Tile var86 = var8[var4][var5 + 1];
                if (var86 != null && var86.field382) {
                    field323.method240(var86);
                }
            }
            if (var4 > field299) {
                Tile var87 = var8[var4 - 1][var5];
                if (var87 != null && var87.field382) {
                    field323.method240(var87);
                }
            }
            if (var5 > field300) {
                Tile var88 = var8[var4][var5 - 1];
                if (var88 != null && var88.field382) {
                    field323.method240(var88);
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lo;IIIIIII)V")
    public void method91(TileUnderlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9;
        int var10 = var9 = (arg6 << 7) - field301;
        int var11;
        int var12 = var11 = (arg7 << 7) - field303;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = this.field286[arg1][arg6][arg7] - field302;
        int var18 = this.field286[arg1][arg6 + 1][arg7] - field302;
        int var19 = this.field286[arg1][arg6 + 1][arg7 + 1] - field302;
        int var20 = this.field286[arg1][arg6][arg7 + 1] - field302;
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
        int var45 = (var21 << 9) / var25 + Pix3D.field633;
        int var46 = (var24 << 9) / var25 + Pix3D.field634;
        int var47 = (var27 << 9) / var31 + Pix3D.field633;
        int var48 = (var30 << 9) / var31 + Pix3D.field634;
        int var49 = (var33 << 9) / var37 + Pix3D.field633;
        int var50 = (var36 << 9) / var37 + Pix3D.field634;
        int var51 = (var39 << 9) / var43 + Pix3D.field633;
        int var52 = (var42 << 9) / var43 + Pix3D.field634;
        Pix3D.field632 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            Pix3D.field629 = false;
            if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > Pix2D.field622 || var51 > Pix2D.field622 || var47 > Pix2D.field622) {
                Pix3D.field629 = true;
            }
            if (field313 && this.method94(field314, field315, var50, var52, var48, var49, var51, var47)) {
                field316 = arg6;
                field317 = arg7;
            }
            if (arg0.field248 == -1) {
                if (arg0.field246 != 12345678) {
                    Pix3D.method174(var50, var52, var48, var49, var51, var47, arg0.field246, arg0.field247, arg0.field245);
                }
            } else if (field282) {
                int var53 = field331[arg0.field248];
                Pix3D.method174(var50, var52, var48, var49, var51, var47, this.method93(var53, -12792, arg0.field246), this.method93(var53, -12792, arg0.field247), this.method93(var53, -12792, arg0.field245));
            } else if (arg0.field249) {
                Pix3D.method178(var50, var52, var48, var49, var51, var47, arg0.field246, arg0.field247, arg0.field245, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field248);
            } else {
                Pix3D.method178(var50, var52, var48, var49, var51, var47, arg0.field246, arg0.field247, arg0.field245, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field248);
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        Pix3D.field629 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Pix2D.field622 || var47 > Pix2D.field622 || var51 > Pix2D.field622) {
            Pix3D.field629 = true;
        }
        if (field313 && this.method94(field314, field315, var46, var48, var52, var45, var47, var51)) {
            field316 = arg6;
            field317 = arg7;
        }
        if (arg0.field248 != -1) {
            if (!field282) {
                Pix3D.method178(var46, var48, var52, var45, var47, var51, arg0.field244, arg0.field245, arg0.field247, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field248);
                return;
            }
            int var54 = field331[arg0.field248];
            Pix3D.method174(var46, var48, var52, var45, var47, var51, this.method93(var54, -12792, arg0.field244), this.method93(var54, -12792, arg0.field245), this.method93(var54, -12792, arg0.field247));
        } else if (arg0.field244 != 12345678) {
            Pix3D.method174(var46, var48, var52, var45, var47, var51, arg0.field244, arg0.field245, arg0.field247);
            return;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIILi;IIII)V")
    public void method92(int arg0, int arg1, int arg2, TileOverlay arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg3.field166.length;
        for (int var10 = 0; var10 < var9; var10++) {
            int var23 = arg3.field166[var10] - field301;
            int var24 = arg3.field167[var10] - field302;
            int var25 = arg3.field168[var10] - field303;
            int var26 = arg0 * var25 + arg5 * var23 >> 16;
            int var27 = arg5 * var25 - arg0 * var23 >> 16;
            int var29 = arg1 * var24 - arg7 * var27 >> 16;
            int var30 = arg1 * var27 + arg7 * var24 >> 16;
            if (var30 < 50) {
                return;
            }
            if (arg3.field175 != null) {
                TileOverlay.field183[var10] = var26;
                TileOverlay.field184[var10] = var29;
                TileOverlay.field185[var10] = var30;
            }
            TileOverlay.field181[var10] = (var26 << 9) / var30 + Pix3D.field633;
            TileOverlay.field182[var10] = (var29 << 9) / var30 + Pix3D.field634;
        }
        if (arg4 != 7) {
            return;
        }
        Pix3D.field632 = 0;
        int var11 = arg3.field172.length;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = arg3.field172[var12];
            int var14 = arg3.field173[var12];
            int var15 = arg3.field174[var12];
            int var16 = TileOverlay.field181[var13];
            int var17 = TileOverlay.field181[var14];
            int var18 = TileOverlay.field181[var15];
            int var19 = TileOverlay.field182[var13];
            int var20 = TileOverlay.field182[var14];
            int var21 = TileOverlay.field182[var15];
            if ((var16 - var17) * (var21 - var20) - (var18 - var17) * (var19 - var20) > 0) {
                Pix3D.field629 = false;
                if (var16 < 0 || var17 < 0 || var18 < 0 || var16 > Pix2D.field622 || var17 > Pix2D.field622 || var18 > Pix2D.field622) {
                    Pix3D.field629 = true;
                }
                if (field313 && this.method94(field314, field315, var19, var20, var21, var16, var17, var18)) {
                    field316 = arg2;
                    field317 = arg6;
                }
                if (arg3.field175 == null || arg3.field175[var12] == -1) {
                    if (arg3.field169[var12] != 12345678) {
                        Pix3D.method174(var19, var20, var21, var16, var17, var18, arg3.field169[var12], arg3.field170[var12], arg3.field171[var12]);
                    }
                } else if (field282) {
                    int var22 = field331[arg3.field175[var12]];
                    Pix3D.method174(var19, var20, var21, var16, var17, var18, this.method93(var22, -12792, arg3.field169[var12]), this.method93(var22, -12792, arg3.field170[var12]), this.method93(var22, -12792, arg3.field171[var12]));
                } else if (arg3.field176) {
                    Pix3D.method178(var19, var20, var21, var16, var17, var18, arg3.field169[var12], arg3.field170[var12], arg3.field171[var12], TileOverlay.field183[0], TileOverlay.field183[1], TileOverlay.field183[3], TileOverlay.field184[0], TileOverlay.field184[1], TileOverlay.field184[3], TileOverlay.field185[0], TileOverlay.field185[1], TileOverlay.field185[3], arg3.field175[var12]);
                } else {
                    Pix3D.method178(var19, var20, var21, var16, var17, var18, arg3.field169[var12], arg3.field170[var12], arg3.field171[var12], TileOverlay.field183[var13], TileOverlay.field183[var14], TileOverlay.field183[var15], TileOverlay.field184[var13], TileOverlay.field184[var14], TileOverlay.field184[var15], TileOverlay.field185[var13], TileOverlay.field185[var14], TileOverlay.field185[var15], arg3.field175[var12]);
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "e", descriptor = "(III)I")
    public int method93(int arg0, int arg1, int arg2) {
        if (this.field279 != arg1) {
            return 4;
        }
        int var4 = 127 - arg2;
        int var5 = (arg0 & 0x7F) * var4 / 160;
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

    @OriginalMember(owner = "r", name = "b", descriptor = "(I)V")
    private void method95(int arg0) {
        int var2 = field319[field293];
        Occlude[] var3 = field320[field293];
        field321 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            Occlude var6 = var3[var4];
            if (var6.field226 == 1) {
                int var7 = var6.field222 + 25 - field299;
                if (var7 >= 0 && var7 <= 50) {
                    int var8 = var6.field224 + 25 - field300;
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    int var9 = var6.field225 + 25 - field300;
                    if (var9 > 50) {
                        var9 = 50;
                    }
                    boolean var10 = false;
                    while (var8 <= var9) {
                        if (field338[var7][var8++]) {
                            var10 = true;
                            break;
                        }
                    }
                    if (var10) {
                        int var11 = field301 - var6.field227;
                        if (var11 > 32) {
                            var6.field233 = 1;
                        } else {
                            if (var11 >= -32) {
                                continue;
                            }
                            var6.field233 = 2;
                            var11 = -var11;
                        }
                        var6.field236 = (var6.field229 - field303 << 8) / var11;
                        var6.field237 = (var6.field230 - field303 << 8) / var11;
                        var6.field238 = (var6.field231 - field302 << 8) / var11;
                        var6.field239 = (var6.field232 - field302 << 8) / var11;
                        field322[field321++] = var6;
                    }
                }
            } else if (var6.field226 == 2) {
                int var12 = var6.field224 + 25 - field300;
                if (var12 >= 0 && var12 <= 50) {
                    int var13 = var6.field222 + 25 - field299;
                    if (var13 < 0) {
                        var13 = 0;
                    }
                    int var14 = var6.field223 + 25 - field299;
                    if (var14 > 50) {
                        var14 = 50;
                    }
                    boolean var15 = false;
                    while (var13 <= var14) {
                        if (field338[var13++][var12]) {
                            var15 = true;
                            break;
                        }
                    }
                    if (var15) {
                        int var16 = field303 - var6.field229;
                        if (var16 > 32) {
                            var6.field233 = 3;
                        } else {
                            if (var16 >= -32) {
                                continue;
                            }
                            var6.field233 = 4;
                            var16 = -var16;
                        }
                        var6.field234 = (var6.field227 - field301 << 8) / var16;
                        var6.field235 = (var6.field228 - field301 << 8) / var16;
                        var6.field238 = (var6.field231 - field302 << 8) / var16;
                        var6.field239 = (var6.field232 - field302 << 8) / var16;
                        field322[field321++] = var6;
                    }
                }
            } else if (var6.field226 == 4) {
                int var17 = var6.field231 - field302;
                if (var17 > 128) {
                    int var18 = var6.field224 + 25 - field300;
                    if (var18 < 0) {
                        var18 = 0;
                    }
                    int var19 = var6.field225 + 25 - field300;
                    if (var19 > 50) {
                        var19 = 50;
                    }
                    if (var18 <= var19) {
                        int var20 = var6.field222 + 25 - field299;
                        if (var20 < 0) {
                            var20 = 0;
                        }
                        int var21 = var6.field223 + 25 - field299;
                        if (var21 > 50) {
                            var21 = 50;
                        }
                        boolean var22 = false;
                        label160: for (int var23 = var20; var23 <= var21; var23++) {
                            for (int var24 = var18; var24 <= var19; var24++) {
                                if (field338[var23][var24]) {
                                    var22 = true;
                                    break label160;
                                }
                            }
                        }
                        if (var22) {
                            var6.field233 = 5;
                            var6.field234 = (var6.field227 - field301 << 8) / var17;
                            var6.field235 = (var6.field228 - field301 << 8) / var17;
                            var6.field236 = (var6.field229 - field303 << 8) / var17;
                            var6.field237 = (var6.field230 - field303 << 8) / var17;
                            field322[field321++] = var6;
                        }
                    }
                }
            }
        }
        if (arg0 < 4 || arg0 > 4) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "r", name = "f", descriptor = "(III)Z")
    private boolean method96(int arg0, int arg1, int arg2) {
        int var4 = this.field291[arg0][arg1][arg2];
        if (-field294 == var4) {
            return false;
        } else if (field294 == var4) {
            return true;
        } else {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            if (this.method100(var5 + 1, this.field286[arg0][arg1][arg2], var6 + 1) && this.method100(var5 + 128 - 1, this.field286[arg0][arg1 + 1][arg2], var6 + 1) && this.method100(var5 + 128 - 1, this.field286[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.method100(var5 + 1, this.field286[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
                this.field291[arg0][arg1][arg2] = field294;
                return true;
            } else {
                this.field291[arg0][arg1][arg2] = -field294;
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
        int var7 = this.field286[arg0][arg1][arg2] - 1;
        int var8 = var7 - 120;
        int var9 = var7 - 230;
        int var10 = var7 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var5 > field301) {
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
                if (var6 < field303) {
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
                if (var5 < field301) {
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
                if (var6 > field303) {
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
            return this.method100(var5 + 1, this.field286[arg0][arg1][arg2] - arg3, var6 + 1) && this.method100(var5 + 128 - 1, this.field286[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method100(var5 + 128 - 1, this.field286[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method100(var5 + 1, this.field286[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIIIII)Z")
    private boolean method99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var9 = arg1; var9 <= arg2; var9++) {
                for (int var15 = arg3; var15 <= arg4; var15++) {
                    if (this.field291[arg0][var9][var15] == -field294) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = this.field286[arg0][arg1][arg3] - arg5;
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
            return this.method100(var7 + 1, this.field286[arg0][arg1][arg3] - arg5, var8 + 1) && this.method100(var7 + 128 - 1, this.field286[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.method100(var7 + 128 - 1, this.field286[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.method100(var7 + 1, this.field286[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "g", descriptor = "(III)Z")
    private boolean method100(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < field321; var4++) {
            Occlude var5 = field322[var4];
            if (var5.field233 == 1) {
                int var6 = var5.field227 - arg0;
                if (var6 > 0) {
                    int var7 = (var5.field236 * var6 >> 8) + var5.field229;
                    int var8 = (var5.field237 * var6 >> 8) + var5.field230;
                    int var9 = (var5.field238 * var6 >> 8) + var5.field231;
                    int var10 = (var5.field239 * var6 >> 8) + var5.field232;
                    if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field233 == 2) {
                int var11 = arg0 - var5.field227;
                if (var11 > 0) {
                    int var12 = (var5.field236 * var11 >> 8) + var5.field229;
                    int var13 = (var5.field237 * var11 >> 8) + var5.field230;
                    int var14 = (var5.field238 * var11 >> 8) + var5.field231;
                    int var15 = (var5.field239 * var11 >> 8) + var5.field232;
                    if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
                        return true;
                    }
                }
            } else if (var5.field233 == 3) {
                int var16 = var5.field229 - arg2;
                if (var16 > 0) {
                    int var17 = (var5.field234 * var16 >> 8) + var5.field227;
                    int var18 = (var5.field235 * var16 >> 8) + var5.field228;
                    int var19 = (var5.field238 * var16 >> 8) + var5.field231;
                    int var20 = (var5.field239 * var16 >> 8) + var5.field232;
                    if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
                        return true;
                    }
                }
            } else if (var5.field233 == 4) {
                int var21 = arg2 - var5.field229;
                if (var21 > 0) {
                    int var22 = (var5.field234 * var21 >> 8) + var5.field227;
                    int var23 = (var5.field235 * var21 >> 8) + var5.field228;
                    int var24 = (var5.field238 * var21 >> 8) + var5.field231;
                    int var25 = (var5.field239 * var21 >> 8) + var5.field232;
                    if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
                        return true;
                    }
                }
            } else if (var5.field233 == 5) {
                int var26 = arg1 - var5.field231;
                if (var26 > 0) {
                    int var27 = (var5.field234 * var26 >> 8) + var5.field227;
                    int var28 = (var5.field235 * var26 >> 8) + var5.field228;
                    int var29 = (var5.field236 * var26 >> 8) + var5.field229;
                    int var30 = (var5.field237 * var26 >> 8) + var5.field230;
                    if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
