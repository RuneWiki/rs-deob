import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("r")
public class World3D {

    @OriginalMember(owner = "r", name = "c", descriptor = "I")
    private int field277 = -207;

    @OriginalMember(owner = "r", name = "d", descriptor = "Z")
    private boolean field278 = true;

    @OriginalMember(owner = "r", name = "f", descriptor = "I")
    private int field280 = 8;

    @OriginalMember(owner = "r", name = "o", descriptor = "[Lp;")
    public Location[] field289 = new Location[5000];

    @OriginalMember(owner = "r", name = "eb", descriptor = "[I")
    public int[] field331 = new int[10000];

    @OriginalMember(owner = "r", name = "fb", descriptor = "[I")
    public int[] field332 = new int[10000];

    @OriginalMember(owner = "r", name = "hb", descriptor = "[[I")
    public int[][] field334 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "r", name = "ib", descriptor = "[[I")
    public int[][] field335 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "r", name = "h", descriptor = "I")
    public int field282;

    @OriginalMember(owner = "r", name = "i", descriptor = "I")
    public int field283;

    @OriginalMember(owner = "r", name = "j", descriptor = "I")
    public int field284;

    @OriginalMember(owner = "r", name = "l", descriptor = "[[[Lv;")
    public Tile[][][] field286;

    @OriginalMember(owner = "r", name = "p", descriptor = "[[[I")
    public int[][][] field290;

    @OriginalMember(owner = "r", name = "k", descriptor = "[[[I")
    public int[][][] field285;

    @OriginalMember(owner = "r", name = "b", descriptor = "Z")
    private static boolean field276 = true;

    @OriginalMember(owner = "r", name = "g", descriptor = "Z")
    public static boolean field281 = true;

    @OriginalMember(owner = "r", name = "G", descriptor = "[Lp;")
    public static Location[] field307 = new Location[100];

    @OriginalMember(owner = "r", name = "H", descriptor = "[I")
    public static final int[] field308 = new int[] { 53, -53, -53, 53 };

    @OriginalMember(owner = "r", name = "I", descriptor = "[I")
    public static final int[] field309 = new int[] { -53, -53, 53, 53 };

    @OriginalMember(owner = "r", name = "J", descriptor = "[I")
    public static final int[] field310 = new int[] { -45, 45, 45, -45 };

    @OriginalMember(owner = "r", name = "K", descriptor = "[I")
    public static final int[] field311 = new int[] { 45, 45, -45, -45 };

    @OriginalMember(owner = "r", name = "O", descriptor = "I")
    public static int field315 = -1;

    @OriginalMember(owner = "r", name = "P", descriptor = "I")
    public static int field316 = -1;

    @OriginalMember(owner = "r", name = "Q", descriptor = "I")
    public static int field317 = 4;

    @OriginalMember(owner = "r", name = "R", descriptor = "[I")
    public static int[] field318 = new int[field317];

    @OriginalMember(owner = "r", name = "S", descriptor = "[[Lm;")
    public static Occlude[][] field319 = new Occlude[field317][500];

    @OriginalMember(owner = "r", name = "U", descriptor = "[Lm;")
    public static Occlude[] field321 = new Occlude[500];

    @OriginalMember(owner = "r", name = "V", descriptor = "Lob;")
    public static LinkList field322 = new LinkList((byte) 5);

    @OriginalMember(owner = "r", name = "W", descriptor = "[I")
    public static final int[] field323 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "r", name = "X", descriptor = "[I")
    public static final int[] field324 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "r", name = "Y", descriptor = "[I")
    public static final int[] field325 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "r", name = "Z", descriptor = "[I")
    public static final int[] field326 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "r", name = "ab", descriptor = "[I")
    public static final int[] field327 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "r", name = "bb", descriptor = "[I")
    public static final int[] field328 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "r", name = "cb", descriptor = "[I")
    public static final int[] field329 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "r", name = "db", descriptor = "[I")
    public static final int[] field330 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

    @OriginalMember(owner = "r", name = "jb", descriptor = "[[[[Z")
    public static boolean[][][][] field336 = new boolean[8][32][51][51];

    @OriginalMember(owner = "r", name = "a", descriptor = "I")
    private static int field275;

    @OriginalMember(owner = "r", name = "e", descriptor = "I")
    private static int field279;

    @OriginalMember(owner = "r", name = "m", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "r", name = "n", descriptor = "I")
    public int field288;

    @OriginalMember(owner = "r", name = "q", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "r", name = "r", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "r", name = "s", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "r", name = "t", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "r", name = "u", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "r", name = "v", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "r", name = "w", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "r", name = "x", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "r", name = "y", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "r", name = "z", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "r", name = "A", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "r", name = "B", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "r", name = "C", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "r", name = "D", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "r", name = "E", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "r", name = "F", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "r", name = "M", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "r", name = "N", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "r", name = "T", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "r", name = "gb", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "r", name = "lb", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "r", name = "mb", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "r", name = "nb", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "r", name = "ob", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "r", name = "pb", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "r", name = "qb", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "r", name = "L", descriptor = "Z")
    public static boolean field312;

    @OriginalMember(owner = "r", name = "kb", descriptor = "[[Z")
    public static boolean[][] field337;

    @OriginalMember(owner = "r", name = "<init>", descriptor = "(I[[[IZII)V")
    public World3D(int arg0, int[][][] arg1, boolean arg2, int arg3, int arg4) {
        this.field282 = arg0;
        if (arg2) {
            field276 = !field276;
        }
        this.field283 = arg3;
        this.field284 = arg4;
        this.field286 = new Tile[arg0][arg3][arg4];
        this.field290 = new int[arg0][arg3 + 1][arg4 + 1];
        this.field285 = arg1;
        this.method50(0);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(B)V")
    public static void method49(byte arg0) {
        field307 = null;
        field318 = null;
        field319 = null;
        field322 = null;
        if (arg0 == 5) {
            field336 = null;
            field337 = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(I)V")
    public void method50(int arg0) {
        for (int var2 = 0; var2 < this.field282; var2++) {
            for (int var7 = 0; var7 < this.field283; var7++) {
                for (int var8 = 0; var8 < this.field284; var8++) {
                    this.field286[var2][var7][var8] = null;
                }
            }
        }
        if (arg0 != 0) {
            return;
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
        for (int var5 = 0; var5 < field307.length; var5++) {
            field307[var5] = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(II)V")
    public void method51(int arg0, int arg1) {
        this.field287 = arg0;
        while (arg1 >= 0) {
            this.field280 = -402;
        }
        for (int var3 = 0; var3 < this.field283; var3++) {
            for (int var4 = 0; var4 < this.field284; var4++) {
                this.field286[arg0][var3][var4] = new Tile(arg0, var3, var4);
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(III)V")
    public void method52(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            this.field280 = 353;
        }
        Tile var4 = this.field286[0][arg0][arg1];
        for (int var5 = 0; var5 < 3; var5++) {
            Tile var6 = this.field286[var5][arg0][arg1] = this.field286[var5 + 1][arg0][arg1];
            if (var6 != null) {
                var6.field361--;
                for (int var7 = 0; var7 < var6.field371; var7++) {
                    Location var8 = var6.field372[var7];
                    if ((var8.field264 >> 29 & 0x3) == 2 && var8.field258 == arg0 && var8.field260 == arg1) {
                        var8.field252--;
                    }
                }
            }
        }
        if (this.field286[0][arg0][arg1] == null) {
            this.field286[0][arg0][arg1] = new Tile(0, arg0, arg1);
        }
        this.field286[0][arg0][arg1].field383 = var4;
        this.field286[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIII)V")
    public static void method53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Occlude var9 = new Occlude();
        var9.field223 = arg2 / 128;
        var9.field224 = arg0 / 128;
        var9.field225 = arg4 / 128;
        var9.field226 = arg3 / 128;
        var9.field227 = arg8;
        var9.field228 = arg2;
        var9.field229 = arg0;
        if (arg5 != 28488) {
            field276 = !field276;
        }
        var9.field230 = arg4;
        var9.field231 = arg3;
        var9.field232 = arg1;
        var9.field233 = arg6;
        field319[arg7][field318[arg7]++] = var9;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIII)V")
    public void method54(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field286[arg0][arg1][arg2];
        if (var5 != null) {
            this.field286[arg0][arg1][arg2].field375 = arg3;
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
            this.field286[arg0][arg1][arg2].field365 = var21;
        } else if (arg3 == 1) {
            TileUnderlay var23 = new TileUnderlay(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var24 = arg0; var24 >= 0; var24--) {
                if (this.field286[var24][arg1][arg2] == null) {
                    this.field286[var24][arg1][arg2] = new Tile(var24, arg1, arg2);
                }
            }
            this.field286[arg0][arg1][arg2].field365 = var23;
        } else {
            TileOverlay var25 = new TileOverlay(arg9, arg16, arg13, arg11, arg1, arg6, arg2, arg17, arg15, arg4, arg7, arg3, arg14, 219, arg10, arg8, arg12, arg19, arg5, arg18);
            for (int var26 = arg0; var26 >= 0; var26--) {
                if (this.field286[var26][arg1][arg2] == null) {
                    this.field286[var26][arg1][arg2] = new Tile(var26, arg1, arg2);
                }
            }
            this.field286[arg0][arg1][arg2].field366 = var25;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIILx;IIB)V")
    public void method56(int arg0, int arg1, int arg2, int arg3, Entity arg4, int arg5, int arg6, byte arg7) {
        if (arg4 == null) {
            return;
        }
        GroundDecor var9 = new GroundDecor();
        var9.field195 = arg4;
        var9.field193 = arg1 * 128 + 64;
        var9.field194 = arg2 * 128 + 64;
        var9.field192 = arg6;
        var9.field196 = arg0;
        var9.field197 = arg7;
        if (this.field286[arg3][arg1][arg2] == null) {
            this.field286[arg3][arg1][arg2] = new Tile(arg3, arg1, arg2);
        }
        this.field286[arg3][arg1][arg2].field369 = var9;
        if (arg5 < 3 || arg5 > 3) {
            ;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lx;IIILx;Lx;IZI)V")
    public void method57(Entity arg0, int arg1, int arg2, int arg3, Entity arg4, Entity arg5, int arg6, boolean arg7, int arg8) {
        if (arg7) {
            return;
        }
        GroundObject var10 = new GroundObject();
        var10.field201 = arg5;
        var10.field199 = arg3 * 128 + 64;
        var10.field200 = arg8 * 128 + 64;
        var10.field198 = arg6;
        var10.field204 = arg1;
        var10.field202 = arg4;
        var10.field203 = arg0;
        int var11 = 0;
        Tile var12 = this.field286[arg2][arg3][arg8];
        if (var12 != null) {
            for (int var13 = 0; var13 < var12.field371; var13++) {
                if (var12.field372[var13].field256 instanceof Model) {
                    int var14 = ((Model) var12.field372[var13].field256).field560;
                    if (var14 > var11) {
                        var11 = var14;
                    }
                }
            }
        }
        var10.field205 = var11;
        if (this.field286[arg2][arg3][arg8] == null) {
            this.field286[arg2][arg3][arg8] = new Tile(arg2, arg3, arg8);
        }
        this.field286[arg2][arg3][arg8].field370 = var10;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIBLx;IIIBLx;I)V")
    public void method58(int arg0, int arg1, int arg2, byte arg3, Entity arg4, int arg5, int arg6, int arg7, byte arg8, Entity arg9, int arg10) {
        if (arg9 == null && arg4 == null) {
            return;
        }
        Wall var12 = new Wall();
        var12.field273 = arg0;
        var12.field274 = arg8;
        var12.field267 = arg7 * 128 + 64;
        var12.field268 = arg5 * 128 + 64;
        var12.field266 = arg1;
        var12.field271 = arg9;
        if (arg3 == 4) {
            boolean var13 = false;
        } else {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        var12.field272 = arg4;
        var12.field269 = arg6;
        var12.field270 = arg10;
        for (int var15 = arg2; var15 >= 0; var15--) {
            if (this.field286[var15][arg7][arg5] == null) {
                this.field286[var15][arg7][arg5] = new Tile(var15, arg7, arg5);
            }
        }
        this.field286[arg2][arg7][arg5].field367 = var12;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIILx;BIIIIII)V")
    public void method59(int arg0, int arg1, int arg2, int arg3, Entity arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg4 == null) {
            return;
        }
        Decor var13 = new Decor();
        var13.field165 = arg2;
        var13.field166 = arg5;
        var13.field160 = arg0 * 128 + arg9 + 64;
        var13.field161 = arg7 * 128 + arg6 + 64;
        var13.field159 = arg3;
        var13.field164 = arg4;
        var13.field162 = arg11;
        var13.field163 = arg1;
        while (arg8 >= 0) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
        for (int var14 = arg10; var14 >= 0; var14--) {
            if (this.field286[var14][arg0][arg7] == null) {
                this.field286[var14][arg0][arg7] = new Tile(var14, arg0, arg7);
            }
        }
        this.field286[arg10][arg0][arg7].field368 = var13;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIILx;BIII)Z")
    public boolean method60(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Entity arg6, byte arg7, int arg8, int arg9, int arg10) {
        if (arg6 == null) {
            return true;
        }
        int var12 = arg0 * 64 + arg4 * 128;
        int var13 = arg2 * 64 + arg9 * 128;
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        return this.method63(arg8, arg4, arg9, arg0, arg2, var12, var13, arg3, arg6, arg10, false, arg5, arg7);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIZIZILx;III)Z")
    public boolean method61(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, Entity arg6, int arg7, int arg8, int arg9) {
        if (arg6 == null) {
            return true;
        }
        int var11 = arg3 - arg8;
        int var12 = arg1 - arg8;
        int var13 = arg3 + arg8;
        int var14 = arg1 + arg8;
        if (arg2) {
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
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        if (!arg4) {
            throw new NullPointerException();
        }
        int var18 = var14 / 128;
        return this.method63(arg7, var15, var16, var17 + 1 - var15, var18 - var16 + 1, arg3, arg1, arg5, arg6, arg0, true, arg9, (byte) 0);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IILx;IIIIIIIIII)Z")
    public boolean method62(int arg0, int arg1, Entity arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        if (arg4 >= 0) {
            throw new NullPointerException();
        } else if (arg2 == null) {
            return true;
        } else {
            return this.method63(arg11, arg10, arg12, arg7 + 1 - arg10, arg1 - arg12 + 1, arg0, arg5, arg9, arg2, arg6, true, arg3, (byte) 0);
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIILx;IZIB)Z")
    private boolean method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, boolean arg10, int arg11, byte arg12) {
        for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
            for (int var21 = arg2; var21 < arg2 + arg4; var21++) {
                if (var14 < 0 || var21 < 0 || var14 >= this.field283 || var21 >= this.field284) {
                    return false;
                }
                Tile var22 = this.field286[arg0][var14][var21];
                if (var22 != null && var22.field371 >= 5) {
                    return false;
                }
            }
        }
        Location var15 = new Location();
        var15.field264 = arg11;
        var15.field265 = arg12;
        var15.field252 = arg0;
        var15.field254 = arg5;
        var15.field255 = arg6;
        var15.field253 = arg7;
        var15.field256 = arg8;
        var15.field257 = arg9;
        var15.field258 = arg1;
        var15.field260 = arg2;
        var15.field259 = arg1 + arg3 - 1;
        var15.field261 = arg2 + arg4 - 1;
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
                var20.field372[var20.field371] = var15;
                var20.field373[var20.field371] = var18;
                var20.field374 |= var18;
                var20.field371++;
            }
        }
        if (arg10) {
            this.field289[this.field288++] = var15;
        }
        return true;
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(I)V")
    public void method64(int arg0) {
        for (int var2 = 0; var2 < this.field288; var2++) {
            Location var3 = this.field289[var2];
            this.method65((byte) 115, var3);
            this.field289[var2] = null;
        }
        this.field288 = 0;
        if (arg0 == -29945) {
            ;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(BLp;)V")
    private void method65(byte arg0, Location arg1) {
        if (arg0 != 115) {
            field276 = !field276;
        }
        for (int var3 = arg1.field258; var3 <= arg1.field259; var3++) {
            for (int var4 = arg1.field260; var4 <= arg1.field261; var4++) {
                Tile var5 = this.field286[arg1.field252][var3][var4];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field371; var6++) {
                        if (var5.field372[var6] == arg1) {
                            var5.field371--;
                            for (int var7 = var6; var7 < var5.field371; var7++) {
                                var5.field372[var7] = var5.field372[var7 + 1];
                                var5.field373[var7] = var5.field373[var7 + 1];
                            }
                            var5.field372[var5.field371] = null;
                            break;
                        }
                    }
                    var5.field374 = 0;
                    for (int var8 = 0; var8 < var5.field371; var8++) {
                        var5.field374 |= var5.field373[var8];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIII)V")
    public void method66(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Tile var6 = this.field286[arg0][arg2][arg1];
        if (arg4 <= 0) {
            this.field278 = !this.field278;
        }
        if (var6 == null) {
            return;
        }
        Decor var7 = var6.field368;
        if (var7 != null) {
            int var8 = arg2 * 128 + 64;
            int var9 = arg1 * 128 + 64;
            var7.field160 = (var7.field160 - var8) * arg3 / 16 + var8;
            var7.field161 = (var7.field161 - var9) * arg3 / 16 + var9;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(BIII)V")
    public void method67(byte arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field286[arg2][arg1][arg3];
        if (var5 == null) {
            return;
        }
        var5.field367 = null;
        if (arg0 == 4) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIII)V")
    public void method68(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field286[arg0][arg1][arg3];
        if (arg2 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (var5 != null) {
            var5.field368 = null;
        }
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(IIII)V")
    public void method69(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= 0) {
            return;
        }
        Tile var5 = this.field286[arg0][arg1][arg3];
        if (var5 == null) {
            return;
        }
        for (int var6 = 0; var6 < var5.field371; var6++) {
            Location var7 = var5.field372[var6];
            if ((var7.field264 >> 29 & 0x3) == 2 && var7.field258 == arg1 && var7.field260 == arg3) {
                this.method65((byte) 115, var7);
                return;
            }
        }
    }

    @OriginalMember(owner = "r", name = "d", descriptor = "(IIII)V")
    public void method70(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field286[arg0][arg1][arg3];
        while (arg2 >= 0) {
            this.field280 = 104;
        }
        if (var5 != null) {
            var5.field369 = null;
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(III)V")
    public void method71(int arg0, int arg1, int arg2) {
        Tile var4 = this.field286[arg0][arg1][arg2];
        if (var4 != null) {
            var4.field370 = null;
        }
    }

    @OriginalMember(owner = "r", name = "e", descriptor = "(IIII)Lq;")
    public Wall method72(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 75 / arg3;
        Tile var6 = this.field286[arg2][arg1][arg0];
        return var6 == null ? null : var6.field367;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIB)Lh;")
    public Decor method73(int arg0, int arg1, int arg2, byte arg3) {
        Tile var5 = this.field286[arg0][arg1][arg2];
        if (arg3 != 40) {
            throw new NullPointerException();
        }
        return var5 == null ? null : var5.field368;
    }

    @OriginalMember(owner = "r", name = "f", descriptor = "(IIII)Lp;")
    public Location method74(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= 0) {
            throw new NullPointerException();
        }
        Tile var5 = this.field286[arg3][arg0][arg1];
        if (var5 == null) {
            return null;
        }
        for (int var6 = 0; var6 < var5.field371; var6++) {
            Location var7 = var5.field372[var6];
            if ((var7.field264 >> 29 & 0x3) == 2 && var7.field258 == arg0 && var7.field260 == arg1) {
                return var7;
            }
        }
        return null;
    }

    @OriginalMember(owner = "r", name = "g", descriptor = "(IIII)Lj;")
    public GroundDecor method75(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            this.field280 = 84;
        }
        Tile var5 = this.field286[arg0][arg2][arg1];
        return var5 == null || var5.field369 == null ? null : var5.field369;
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(III)I")
    public int method76(int arg0, int arg1, int arg2) {
        Tile var4 = this.field286[arg0][arg1][arg2];
        return var4 == null || var4.field367 == null ? 0 : var4.field367.field273;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIBI)I")
    public int method77(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 79) {
            this.field280 = -15;
        }
        Tile var5 = this.field286[arg0][arg1][arg3];
        return var5 == null || var5.field368 == null ? 0 : var5.field368.field165;
    }

    @OriginalMember(owner = "r", name = "d", descriptor = "(III)I")
    public int method78(int arg0, int arg1, int arg2) {
        Tile var4 = this.field286[arg0][arg1][arg2];
        if (var4 == null) {
            return 0;
        }
        for (int var5 = 0; var5 < var4.field371; var5++) {
            Location var6 = var4.field372[var5];
            if ((var6.field264 >> 29 & 0x3) == 2 && var6.field258 == arg1 && var6.field260 == arg2) {
                return var6.field264;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "r", name = "e", descriptor = "(III)I")
    public int method79(int arg0, int arg1, int arg2) {
        Tile var4 = this.field286[arg0][arg1][arg2];
        return var4 == null || var4.field369 == null ? 0 : var4.field369.field196;
    }

    @OriginalMember(owner = "r", name = "h", descriptor = "(IIII)I")
    public int method80(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field286[arg0][arg1][arg2];
        if (var5 == null) {
            return -1;
        } else if (var5.field367 != null && var5.field367.field273 == arg3) {
            return var5.field367.field274 & 0xFF;
        } else if (var5.field368 != null && var5.field368.field165 == arg3) {
            return var5.field368.field166 & 0xFF;
        } else if (var5.field369 != null && var5.field369.field196 == arg3) {
            return var5.field369.field197 & 0xFF;
        } else {
            for (int var6 = 0; var6 < var5.field371; var6++) {
                if (var5.field372[var6].field264 == arg3) {
                    return var5.field372[var6].field265 & 0xFF;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IZIIII)V")
    public void method81(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (int) Math.sqrt((double) (arg3 * arg3 + arg0 * arg0 + arg2 * arg2));
        if (!arg1) {
            return;
        }
        int var8 = arg4 * var7 >> 8;
        for (int var9 = 0; var9 < this.field282; var9++) {
            for (int var10 = 0; var10 < this.field283; var10++) {
                for (int var11 = 0; var11 < this.field284; var11++) {
                    Tile var12 = this.field286[var9][var10][var11];
                    if (var12 != null) {
                        Wall var13 = var12.field367;
                        if (var13 != null && var13.field271 != null && var13.field271.field388 != null) {
                            this.method83(1, 1, 0, var11, (Model) var13.field271, var10, var9);
                            if (var13.field272 != null && var13.field272.field388 != null) {
                                this.method83(1, 1, 0, var11, (Model) var13.field272, var10, var9);
                                this.method84((Model) var13.field271, (Model) var13.field272, 0, 0, 0, false);
                                ((Model) var13.field272).method143(arg5, var8, arg0, arg2, arg3);
                            }
                            ((Model) var13.field271).method143(arg5, var8, arg0, arg2, arg3);
                        }
                        for (int var14 = 0; var14 < var12.field371; var14++) {
                            Location var16 = var12.field372[var14];
                            if (var16 != null && var16.field256 != null && var16.field256.field388 != null) {
                                this.method83(var16.field261 + 1 - var16.field260, var16.field259 - var16.field258 + 1, 0, var11, (Model) var16.field256, var10, var9);
                                ((Model) var16.field256).method143(arg5, var8, arg0, arg2, arg3);
                            }
                        }
                        GroundDecor var15 = var12.field369;
                        if (var15 != null && var15.field195.field388 != null) {
                            this.method82(var9, var10, (Model) var15.field195, false, var11);
                            ((Model) var15.field195).method143(arg5, var8, arg0, arg2, arg3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IILeb;ZI)V")
    private void method82(int arg0, int arg1, Model arg2, boolean arg3, int arg4) {
        if (arg3) {
            this.field280 = 419;
        }
        if (arg1 < this.field283) {
            Tile var6 = this.field286[arg0][arg1 + 1][arg4];
            if (var6 != null && var6.field369 != null && var6.field369.field195.field388 != null) {
                this.method84(arg2, (Model) var6.field369.field195, 128, 0, 0, true);
            }
        }
        if (arg4 < this.field283) {
            Tile var7 = this.field286[arg0][arg1][arg4 + 1];
            if (var7 != null && var7.field369 != null && var7.field369.field195.field388 != null) {
                this.method84(arg2, (Model) var7.field369.field195, 0, 0, 128, true);
            }
        }
        if (arg1 < this.field283 && arg4 < this.field284) {
            Tile var8 = this.field286[arg0][arg1 + 1][arg4 + 1];
            if (var8 != null && var8.field369 != null && var8.field369.field195.field388 != null) {
                this.method84(arg2, (Model) var8.field369.field195, 128, 0, 128, true);
            }
        }
        if (arg1 >= this.field283 || arg4 <= 0) {
            return;
        }
        Tile var9 = this.field286[arg0][arg1 + 1][arg4 - 1];
        if (var9 != null && var9.field369 != null && var9.field369.field195.field388 != null) {
            this.method84(arg2, (Model) var9.field369.field195, 128, 0, -128, true);
            return;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIILeb;II)V")
    private void method83(int arg0, int arg1, int arg2, int arg3, Model arg4, int arg5, int arg6) {
        boolean var8 = true;
        int var9 = arg5;
        int var10 = arg1 + arg5;
        int var11 = arg3 - 1;
        int var12 = arg0 + arg3;
        for (int var13 = arg6; var13 <= arg6 + 1; var13++) {
            if (this.field282 != var13) {
                for (int var14 = var9; var14 <= var10; var14++) {
                    if (var14 >= 0 && var14 < this.field283) {
                        for (int var15 = var11; var15 <= var12; var15++) {
                            if (var15 >= 0 && var15 < this.field284 && (!var8 || var14 >= var10 || var15 >= var12 || var15 < arg3 && arg5 != var14)) {
                                Tile var16 = this.field286[var13][var14][var15];
                                if (var16 != null) {
                                    int var17 = (this.field285[var13][var14 + 1][var15] + this.field285[var13][var14][var15] + this.field285[var13][var14][var15 + 1] + this.field285[var13][var14 + 1][var15 + 1]) / 4 - (this.field285[arg6][arg5 + 1][arg3] + this.field285[arg6][arg5][arg3] + this.field285[arg6][arg5][arg3 + 1] + this.field285[arg6][arg5 + 1][arg3 + 1]) / 4;
                                    Wall var18 = var16.field367;
                                    if (var18 != null && var18.field271 != null && var18.field271.field388 != null) {
                                        this.method84(arg4, (Model) var18.field271, (1 - arg1) * 64 + (var14 - arg5) * 128, var17, (1 - arg0) * 64 + (var15 - arg3) * 128, var8);
                                    }
                                    if (var18 != null && var18.field272 != null && var18.field272.field388 != null) {
                                        this.method84(arg4, (Model) var18.field272, (1 - arg1) * 64 + (var14 - arg5) * 128, var17, (1 - arg0) * 64 + (var15 - arg3) * 128, var8);
                                    }
                                    for (int var19 = 0; var19 < var16.field371; var19++) {
                                        Location var20 = var16.field372[var19];
                                        if (var20 != null && var20.field256 != null && var20.field256.field388 != null) {
                                            int var21 = var20.field259 + 1 - var20.field258;
                                            int var22 = var20.field261 + 1 - var20.field260;
                                            this.method84(arg4, (Model) var20.field256, (var20.field258 - arg5) * 128 + (var21 - arg1) * 64, var17, (var20.field260 - arg3) * 128 + (var22 - arg0) * 64, var8);
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
        if (arg2 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Leb;Leb;IIIZ)V")
    private void method84(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field333++;
        int var7 = 0;
        int[] var8 = arg1.field533;
        int var9 = arg1.field532;
        for (int var10 = 0; var10 < arg0.field532; var10++) {
            VertexNormal var13 = arg0.field388[var10];
            VertexNormal var14 = arg0.field566[var10];
            if (var14.field244 != 0) {
                int var15 = arg0.field534[var10] - arg3;
                if (var15 <= arg1.field557) {
                    int var16 = arg0.field533[var10] - arg2;
                    if (var16 >= arg1.field552 && var16 <= arg1.field553) {
                        int var17 = arg0.field535[var10] - arg4;
                        if (var17 >= arg1.field555 && var17 <= arg1.field554) {
                            for (int var18 = 0; var18 < var9; var18++) {
                                VertexNormal var19 = arg1.field388[var18];
                                VertexNormal var20 = arg1.field566[var18];
                                if (var8[var18] == var16 && arg1.field535[var18] == var17 && arg1.field534[var18] == var15 && var20.field244 != 0) {
                                    var13.field241 += var20.field241;
                                    var13.field242 += var20.field242;
                                    var13.field243 += var20.field243;
                                    var13.field244 += var20.field244;
                                    var19.field241 += var14.field241;
                                    var19.field242 += var14.field242;
                                    var19.field243 += var14.field243;
                                    var19.field244 += var14.field244;
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
        for (int var11 = 0; var11 < arg0.field536; var11++) {
            if (this.field331[arg0.field537[var11]] == this.field333 && this.field331[arg0.field538[var11]] == this.field333 && this.field331[arg0.field539[var11]] == this.field333) {
                arg0.field543[var11] = -1;
            }
        }
        for (int var12 = 0; var12 < arg1.field536; var12++) {
            if (this.field332[arg1.field537[var12]] == this.field333 && this.field332[arg1.field538[var12]] == this.field333 && this.field332[arg1.field539[var12]] == this.field333) {
                arg1.field543[var12] = -1;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "([IIIIII)V")
    public void method85(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Tile var7 = this.field286[arg3][arg4][arg5];
        if (var7 == null) {
            return;
        }
        TileUnderlay var8 = var7.field365;
        if (var8 != null) {
            int var9 = var8.field251;
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
        TileOverlay var11 = var7.field366;
        if (var11 == null) {
            return;
        }
        int var12 = var11.field178;
        int var13 = var11.field179;
        int var14 = var11.field180;
        int var15 = var11.field181;
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

    @OriginalMember(owner = "r", name = "a", descriptor = "([IIIIZI)V")
    public static void method86(int[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field340 = 0;
        field341 = 0;
        field342 = arg3;
        if (!arg4) {
            field275 = -358;
        }
        field343 = arg5;
        field338 = arg3 / 2;
        field339 = arg5 / 2;
        boolean[][][][] var6 = new boolean[9][32][53][53];
        for (int var7 = 128; var7 <= 384; var7 += 32) {
            for (int var15 = 0; var15 < 2048; var15 += 64) {
                field303 = Model.field595[var7];
                field304 = Model.field596[var7];
                field305 = Model.field595[var15];
                field306 = Model.field596[var15];
                int var16 = (var7 - 128) / 32;
                int var17 = var15 / 64;
                for (int var18 = -26; var18 <= 26; var18++) {
                    for (int var19 = -26; var19 <= 26; var19++) {
                        int var20 = var18 * 128;
                        int var21 = var19 * 128;
                        boolean var22 = false;
                        for (int var23 = -arg1; var23 <= arg2; var23 += 128) {
                            if (method87(var21, var20, arg0[var16] + var23, 9)) {
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

    @OriginalMember(owner = "r", name = "i", descriptor = "(IIII)Z")
    public static boolean method87(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field306 * arg1 + field305 * arg0 >> 16;
        int var5 = field306 * arg0 - field305 * arg1 >> 16;
        if (arg3 <= 0) {
            field279 = -322;
        }
        int var6 = field304 * var5 + field303 * arg2 >> 16;
        int var7 = field304 * arg2 - field303 * var5 >> 16;
        if (var6 >= 50 && var6 <= 3500) {
            int var8 = (var4 << 9) / var6 + field338;
            int var9 = (var7 << 9) / var6 + field339;
            return var8 >= field340 && var8 <= field342 && var9 >= field341 && var9 <= field343;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IBI)V")
    public void method88(int arg0, byte arg1, int arg2) {
        field312 = true;
        if (arg1 == 9) {
            field313 = arg2;
            field314 = arg0;
            field315 = -1;
            field316 = -1;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIII)V")
    public void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= this.field283 * 128) {
            arg2 = this.field283 * 128 - 1;
        }
        if (arg6 < 0) {
            arg6 = 0;
        } else if (arg6 >= this.field284 * 128) {
            arg6 = this.field284 * 128 - 1;
        }
        field293++;
        field303 = Model.field595[arg3];
        field304 = Model.field596[arg3];
        field305 = Model.field595[arg4];
        field306 = Model.field596[arg4];
        field337 = field336[(arg3 - 128) / 32][arg4 / 64];
        field300 = arg2;
        field301 = arg5;
        field302 = arg6;
        field298 = arg2 / 128;
        field299 = arg6 / 128;
        field292 = arg0;
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
        this.method95(true);
        while (arg1 >= 0) {
            for (int var37 = 1; var37 > 0; var37++) {
            }
        }
        field291 = 0;
        for (int var8 = this.field287; var8 < this.field282; var8++) {
            Tile[][] var33 = this.field286[var8];
            for (int var34 = field294; var34 < field295; var34++) {
                for (int var35 = field296; var35 < field297; var35++) {
                    Tile var36 = var33[var34][var35];
                    if (var36 != null) {
                        if (var36.field375 <= arg0 && (field337[var34 + 25 - field298][var35 + 25 - field299] || this.field285[var8][var34][var35] - arg5 >= 2000)) {
                            var36.field376 = true;
                            var36.field377 = true;
                            if (var36.field371 > 0) {
                                var36.field378 = true;
                            } else {
                                var36.field378 = false;
                            }
                            field291++;
                        } else {
                            var36.field376 = false;
                            var36.field377 = false;
                            var36.field379 = 0;
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
                                if (var29 != null && var29.field376) {
                                    this.method90(var29, true);
                                }
                            }
                            if (var28 < field297) {
                                Tile var30 = var22[var24][var28];
                                if (var30 != null && var30.field376) {
                                    this.method90(var30, true);
                                }
                            }
                        }
                        if (var25 < field295) {
                            if (var27 >= field296) {
                                Tile var31 = var22[var25][var27];
                                if (var31 != null && var31.field376) {
                                    this.method90(var31, true);
                                }
                            }
                            if (var28 < field297) {
                                Tile var32 = var22[var25][var28];
                                if (var32 != null && var32.field376) {
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
                                if (var18 != null && var18.field376) {
                                    this.method90(var18, false);
                                }
                            }
                            if (var17 < field297) {
                                Tile var19 = var11[var13][var17];
                                if (var19 != null && var19.field376) {
                                    this.method90(var19, false);
                                }
                            }
                        }
                        if (var14 < field295) {
                            if (var16 >= field296) {
                                Tile var20 = var11[var14][var16];
                                if (var20 != null && var20.field376) {
                                    this.method90(var20, false);
                                }
                            }
                            if (var17 < field297) {
                                Tile var21 = var11[var14][var17];
                                if (var21 != null && var21.field376) {
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
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lv;Z)V")
    public void method90(Tile arg0, boolean arg1) {
        field322.method240(arg0);
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
                                                var3 = (Tile) field322.method242();
                                                if (var3 == null) {
                                                    return;
                                                }
                                            } while (!var3.field377);
                                            var4 = var3.field362;
                                            var5 = var3.field363;
                                            var6 = var3.field361;
                                            var7 = var3.field364;
                                            var8 = this.field286[var6];
                                            if (!var3.field376) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var6 > 0) {
                                                    Tile var9 = this.field286[var6 - 1][var4][var5];
                                                    if (var9 != null && var9.field377) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= field298 && var4 > field294) {
                                                    Tile var10 = var8[var4 - 1][var5];
                                                    if (var10 != null && var10.field377 && (var10.field376 || (var3.field374 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= field298 && var4 < field295 - 1) {
                                                    Tile var11 = var8[var4 + 1][var5];
                                                    if (var11 != null && var11.field377 && (var11.field376 || (var3.field374 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 <= field299 && var5 > field296) {
                                                    Tile var12 = var8[var4][var5 - 1];
                                                    if (var12 != null && var12.field377 && (var12.field376 || (var3.field374 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 >= field299 && var5 < field297 - 1) {
                                                    Tile var13 = var8[var4][var5 + 1];
                                                    if (var13 != null && var13.field377 && (var13.field376 || (var3.field374 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var3.field376 = false;
                                            if (var3.field383 != null) {
                                                Tile var14 = var3.field383;
                                                if (var14.field365 == null) {
                                                    if (var14.field366 != null && !this.method96(0, var4, var5)) {
                                                        this.method92(var4, field305, var14.field366, field303, 930, field304, field306, var5);
                                                    }
                                                } else if (!this.method96(0, var4, var5)) {
                                                    this.method91(var14.field365, 0, field303, field304, field305, field306, var4, var5);
                                                }
                                                Wall var15 = var14.field367;
                                                if (var15 != null) {
                                                    var15.field271.method108(0, field303, field304, field305, field306, var15.field267 - field300, var15.field266 - field301, var15.field268 - field302, var15.field273);
                                                }
                                                for (int var16 = 0; var16 < var14.field371; var16++) {
                                                    Location var17 = var14.field372[var16];
                                                    if (var17 != null) {
                                                        var17.field256.method108(var17.field257, field303, field304, field305, field306, var17.field254 - field300, var17.field253 - field301, var17.field255 - field302, var17.field264);
                                                    }
                                                }
                                            }
                                            boolean var18 = false;
                                            if (var3.field365 == null) {
                                                if (var3.field366 != null && !this.method96(var7, var4, var5)) {
                                                    var18 = true;
                                                    this.method92(var4, field305, var3.field366, field303, 930, field304, field306, var5);
                                                }
                                            } else if (!this.method96(var7, var4, var5)) {
                                                var18 = true;
                                                this.method91(var3.field365, var7, field303, field304, field305, field306, var4, var5);
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            Wall var21 = var3.field367;
                                            Decor var22 = var3.field368;
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
                                                var3.field382 = field325[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field269 & field324[var19]) == 0) {
                                                    var3.field379 = 0;
                                                } else if (var21.field269 == 16) {
                                                    var3.field379 = 3;
                                                    var3.field380 = field326[var19];
                                                    var3.field381 = 3 - var3.field380;
                                                } else if (var21.field269 == 32) {
                                                    var3.field379 = 6;
                                                    var3.field380 = field327[var19];
                                                    var3.field381 = 6 - var3.field380;
                                                } else if (var21.field269 == 64) {
                                                    var3.field379 = 12;
                                                    var3.field380 = field328[var19];
                                                    var3.field381 = 12 - var3.field380;
                                                } else {
                                                    var3.field379 = 9;
                                                    var3.field380 = field329[var19];
                                                    var3.field381 = 9 - var3.field380;
                                                }
                                                if ((var21.field269 & var20) != 0 && !this.method97(var7, var4, var5, var21.field269)) {
                                                    var21.field271.method108(0, field303, field304, field305, field306, var21.field267 - field300, var21.field266 - field301, var21.field268 - field302, var21.field273);
                                                }
                                                if ((var21.field270 & var20) != 0 && !this.method97(var7, var4, var5, var21.field270)) {
                                                    var21.field272.method108(0, field303, field304, field305, field306, var21.field267 - field300, var21.field266 - field301, var21.field268 - field302, var21.field273);
                                                }
                                            }
                                            if (var22 != null && !this.method98(var7, var4, var5, var22.field164.field389)) {
                                                if ((var22.field162 & var20) != 0) {
                                                    var22.field164.method108(var22.field163, field303, field304, field305, field306, var22.field160 - field300, var22.field159 - field301, var22.field161 - field302, var22.field165);
                                                } else if ((var22.field162 & 0x300) != 0) {
                                                    int var23 = var22.field160 - field300;
                                                    int var24 = var22.field159 - field301;
                                                    int var25 = var22.field161 - field302;
                                                    int var26 = var22.field163;
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
                                                    if ((var22.field162 & 0x100) != 0 && var28 < var27) {
                                                        int var29 = field308[var26] + var23;
                                                        int var30 = field309[var26] + var25;
                                                        var22.field164.method108(var26 * 512 + 256, field303, field304, field305, field306, var29, var24, var30, var22.field165);
                                                    }
                                                    if ((var22.field162 & 0x200) != 0 && var28 > var27) {
                                                        int var31 = field310[var26] + var23;
                                                        int var32 = field311[var26] + var25;
                                                        var22.field164.method108(var26 * 512 + 1280 & 0x7FF, field303, field304, field305, field306, var31, var24, var32, var22.field165);
                                                    }
                                                }
                                            }
                                            if (var18) {
                                                GroundDecor var33 = var3.field369;
                                                if (var33 != null) {
                                                    var33.field195.method108(0, field303, field304, field305, field306, var33.field193 - field300, var33.field192 - field301, var33.field194 - field302, var33.field196);
                                                }
                                                GroundObject var34 = var3.field370;
                                                if (var34 != null && var34.field205 == 0) {
                                                    if (var34.field202 != null) {
                                                        var34.field202.method108(0, field303, field304, field305, field306, var34.field199 - field300, var34.field198 - field301, var34.field200 - field302, var34.field204);
                                                    }
                                                    if (var34.field203 != null) {
                                                        var34.field203.method108(0, field303, field304, field305, field306, var34.field199 - field300, var34.field198 - field301, var34.field200 - field302, var34.field204);
                                                    }
                                                    if (var34.field201 != null) {
                                                        var34.field201.method108(0, field303, field304, field305, field306, var34.field199 - field300, var34.field198 - field301, var34.field200 - field302, var34.field204);
                                                    }
                                                }
                                            }
                                            int var35 = var3.field374;
                                            if (var35 != 0) {
                                                if (var4 < field298 && (var35 & 0x4) != 0) {
                                                    Tile var36 = var8[var4 + 1][var5];
                                                    if (var36 != null && var36.field377) {
                                                        field322.method240(var36);
                                                    }
                                                }
                                                if (var5 < field299 && (var35 & 0x2) != 0) {
                                                    Tile var37 = var8[var4][var5 + 1];
                                                    if (var37 != null && var37.field377) {
                                                        field322.method240(var37);
                                                    }
                                                }
                                                if (var4 > field298 && (var35 & 0x1) != 0) {
                                                    Tile var38 = var8[var4 - 1][var5];
                                                    if (var38 != null && var38.field377) {
                                                        field322.method240(var38);
                                                    }
                                                }
                                                if (var5 > field299 && (var35 & 0x8) != 0) {
                                                    Tile var39 = var8[var4][var5 - 1];
                                                    if (var39 != null && var39.field377) {
                                                        field322.method240(var39);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var3.field379 != 0) {
                                            boolean var40 = true;
                                            for (int var41 = 0; var41 < var3.field371; var41++) {
                                                if (field293 != var3.field372[var41].field263 && (var3.field373[var41] & var3.field379) == var3.field380) {
                                                    var40 = false;
                                                    break;
                                                }
                                            }
                                            if (var40) {
                                                Wall var42 = var3.field367;
                                                if (!this.method97(var7, var4, var5, var42.field269)) {
                                                    var42.field271.method108(0, field303, field304, field305, field306, var42.field267 - field300, var42.field266 - field301, var42.field268 - field302, var42.field273);
                                                }
                                                var3.field379 = 0;
                                            }
                                        }
                                        if (!var3.field378) {
                                            break;
                                        }
                                        int var43 = var3.field371;
                                        var3.field378 = false;
                                        int var44 = 0;
                                        label563: for (int var45 = 0; var45 < var43; var45++) {
                                            Location var58 = var3.field372[var45];
                                            if (field293 != var58.field263) {
                                                for (int var59 = var58.field258; var59 <= var58.field259; var59++) {
                                                    for (int var64 = var58.field260; var64 <= var58.field261; var64++) {
                                                        Tile var65 = var8[var59][var64];
                                                        if (var65.field376) {
                                                            var3.field378 = true;
                                                            continue label563;
                                                        }
                                                        if (var65.field379 != 0) {
                                                            int var66 = 0;
                                                            if (var59 > var58.field258) {
                                                                var66++;
                                                            }
                                                            if (var59 < var58.field259) {
                                                                var66 += 4;
                                                            }
                                                            if (var64 > var58.field260) {
                                                                var66 += 8;
                                                            }
                                                            if (var64 < var58.field261) {
                                                                var66 += 2;
                                                            }
                                                            if ((var66 & var65.field379) == var3.field381) {
                                                                var3.field378 = true;
                                                                continue label563;
                                                            }
                                                        }
                                                    }
                                                }
                                                field307[var44++] = var58;
                                                int var60 = field298 - var58.field258;
                                                int var61 = var58.field259 - field298;
                                                if (var61 > var60) {
                                                    var60 = var61;
                                                }
                                                int var62 = field299 - var58.field260;
                                                int var63 = var58.field261 - field299;
                                                if (var63 > var62) {
                                                    var58.field262 = var60 + var63;
                                                } else {
                                                    var58.field262 = var60 + var62;
                                                }
                                            }
                                        }
                                        while (var44 > 0) {
                                            int var46 = -50;
                                            int var47 = -1;
                                            for (int var48 = 0; var48 < var44; var48++) {
                                                Location var53 = field307[var48];
                                                if (field293 != var53.field263) {
                                                    if (var53.field262 > var46) {
                                                        var46 = var53.field262;
                                                        var47 = var48;
                                                    } else if (var53.field262 == var46) {
                                                        int var54 = var53.field254 - field300;
                                                        int var55 = var53.field255 - field302;
                                                        int var56 = field307[var47].field254 - field300;
                                                        int var57 = field307[var47].field255 - field302;
                                                        if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                            var47 = var48;
                                                        }
                                                    }
                                                }
                                            }
                                            if (var47 == -1) {
                                                break;
                                            }
                                            Location var49 = field307[var47];
                                            var49.field263 = field293;
                                            if (!this.method99(var7, var49.field258, var49.field259, var49.field260, var49.field261, var49.field256.field389)) {
                                                var49.field256.method108(var49.field257, field303, field304, field305, field306, var49.field254 - field300, var49.field253 - field301, var49.field255 - field302, var49.field264);
                                            }
                                            for (int var50 = var49.field258; var50 <= var49.field259; var50++) {
                                                for (int var51 = var49.field260; var51 <= var49.field261; var51++) {
                                                    Tile var52 = var8[var50][var51];
                                                    if (var52.field379 != 0) {
                                                        field322.method240(var52);
                                                    } else if ((var4 != var50 || var5 != var51) && var52.field377) {
                                                        field322.method240(var52);
                                                    }
                                                }
                                            }
                                        }
                                        if (!var3.field378) {
                                            break;
                                        }
                                    }
                                } while (!var3.field377);
                            } while (var3.field379 != 0);
                            if (var4 > field298 || var4 <= field294) {
                                break;
                            }
                            var67 = var8[var4 - 1][var5];
                        } while (var67 != null && var67.field377);
                        if (var4 < field298 || var4 >= field295 - 1) {
                            break;
                        }
                        var68 = var8[var4 + 1][var5];
                    } while (var68 != null && var68.field377);
                    if (var5 > field299 || var5 <= field296) {
                        break;
                    }
                    var69 = var8[var4][var5 - 1];
                } while (var69 != null && var69.field377);
                if (var5 < field299 || var5 >= field297 - 1) {
                    break;
                }
                var70 = var8[var4][var5 + 1];
            } while (var70 != null && var70.field377);
            var3.field377 = false;
            field291--;
            GroundObject var71 = var3.field370;
            if (var71 != null && var71.field205 != 0) {
                if (var71.field202 != null) {
                    var71.field202.method108(0, field303, field304, field305, field306, var71.field199 - field300, var71.field198 - field301 - var71.field205, var71.field200 - field302, var71.field204);
                }
                if (var71.field203 != null) {
                    var71.field203.method108(0, field303, field304, field305, field306, var71.field199 - field300, var71.field198 - field301 - var71.field205, var71.field200 - field302, var71.field204);
                }
                if (var71.field201 != null) {
                    var71.field201.method108(0, field303, field304, field305, field306, var71.field199 - field300, var71.field198 - field301 - var71.field205, var71.field200 - field302, var71.field204);
                }
            }
            if (var3.field382 != 0) {
                Decor var72 = var3.field368;
                if (var72 != null && !this.method98(var7, var4, var5, var72.field164.field389)) {
                    if ((var72.field162 & var3.field382) != 0) {
                        var72.field164.method108(var72.field163, field303, field304, field305, field306, var72.field160 - field300, var72.field159 - field301, var72.field161 - field302, var72.field165);
                    } else if ((var72.field162 & 0x300) != 0) {
                        int var73 = var72.field160 - field300;
                        int var74 = var72.field159 - field301;
                        int var75 = var72.field161 - field302;
                        int var76 = var72.field163;
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
                        if ((var72.field162 & 0x100) != 0 && var78 >= var77) {
                            int var79 = field308[var76] + var73;
                            int var80 = field309[var76] + var75;
                            var72.field164.method108(var76 * 512 + 256, field303, field304, field305, field306, var79, var74, var80, var72.field165);
                        }
                        if ((var72.field162 & 0x200) != 0 && var78 <= var77) {
                            int var81 = field310[var76] + var73;
                            int var82 = field311[var76] + var75;
                            var72.field164.method108(var76 * 512 + 1280 & 0x7FF, field303, field304, field305, field306, var81, var74, var82, var72.field165);
                        }
                    }
                }
                Wall var83 = var3.field367;
                if (var83 != null) {
                    if ((var83.field270 & var3.field382) != 0 && !this.method97(var7, var4, var5, var83.field270)) {
                        var83.field272.method108(0, field303, field304, field305, field306, var83.field267 - field300, var83.field266 - field301, var83.field268 - field302, var83.field273);
                    }
                    if ((var83.field269 & var3.field382) != 0 && !this.method97(var7, var4, var5, var83.field269)) {
                        var83.field271.method108(0, field303, field304, field305, field306, var83.field267 - field300, var83.field266 - field301, var83.field268 - field302, var83.field273);
                    }
                }
            }
            if (var6 < this.field282 - 1) {
                Tile var84 = this.field286[var6 + 1][var4][var5];
                if (var84 != null && var84.field377) {
                    field322.method240(var84);
                }
            }
            if (var4 < field298) {
                Tile var85 = var8[var4 + 1][var5];
                if (var85 != null && var85.field377) {
                    field322.method240(var85);
                }
            }
            if (var5 < field299) {
                Tile var86 = var8[var4][var5 + 1];
                if (var86 != null && var86.field377) {
                    field322.method240(var86);
                }
            }
            if (var4 > field298) {
                Tile var87 = var8[var4 - 1][var5];
                if (var87 != null && var87.field377) {
                    field322.method240(var87);
                }
            }
            if (var5 > field299) {
                Tile var88 = var8[var4][var5 - 1];
                if (var88 != null && var88.field377) {
                    field322.method240(var88);
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
        int var45 = (var21 << 9) / var25 + Pix3D.field634;
        int var46 = (var24 << 9) / var25 + Pix3D.field635;
        int var47 = (var27 << 9) / var31 + Pix3D.field634;
        int var48 = (var30 << 9) / var31 + Pix3D.field635;
        int var49 = (var33 << 9) / var37 + Pix3D.field634;
        int var50 = (var36 << 9) / var37 + Pix3D.field635;
        int var51 = (var39 << 9) / var43 + Pix3D.field634;
        int var52 = (var42 << 9) / var43 + Pix3D.field635;
        Pix3D.field633 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            Pix3D.field630 = false;
            if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > Pix2D.field621 || var51 > Pix2D.field621 || var47 > Pix2D.field621) {
                Pix3D.field630 = true;
            }
            if (field312 && this.method94(field313, field314, var50, var52, var48, var49, var51, var47)) {
                field315 = arg6;
                field316 = arg7;
            }
            if (arg0.field249 == -1) {
                if (arg0.field247 != 12345678) {
                    Pix3D.method174(var50, var52, var48, var49, var51, var47, arg0.field247, arg0.field248, arg0.field246);
                }
            } else if (field281) {
                int var53 = field330[arg0.field249];
                Pix3D.method174(var50, var52, var48, var49, var51, var47, this.method93(arg0.field247, var53, 595), this.method93(arg0.field248, var53, 595), this.method93(arg0.field246, var53, 595));
            } else if (arg0.field250) {
                Pix3D.method178(var50, var52, var48, var49, var51, var47, arg0.field247, arg0.field248, arg0.field246, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field249);
            } else {
                Pix3D.method178(var50, var52, var48, var49, var51, var47, arg0.field247, arg0.field248, arg0.field246, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field249);
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        Pix3D.field630 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Pix2D.field621 || var47 > Pix2D.field621 || var51 > Pix2D.field621) {
            Pix3D.field630 = true;
        }
        if (field312 && this.method94(field313, field314, var46, var48, var52, var45, var47, var51)) {
            field315 = arg6;
            field316 = arg7;
        }
        if (arg0.field249 != -1) {
            if (!field281) {
                Pix3D.method178(var46, var48, var52, var45, var47, var51, arg0.field245, arg0.field246, arg0.field248, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field249);
                return;
            }
            int var54 = field330[arg0.field249];
            Pix3D.method174(var46, var48, var52, var45, var47, var51, this.method93(arg0.field245, var54, 595), this.method93(arg0.field246, var54, 595), this.method93(arg0.field248, var54, 595));
        } else if (arg0.field245 != 12345678) {
            Pix3D.method174(var46, var48, var52, var45, var47, var51, arg0.field245, arg0.field246, arg0.field248);
            return;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IILi;IIIII)V")
    public void method92(int arg0, int arg1, TileOverlay arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg2.field167.length;
        for (int var10 = 0; var10 < var9; var10++) {
            int var23 = arg2.field167[var10] - field300;
            int var24 = arg2.field168[var10] - field301;
            int var25 = arg2.field169[var10] - field302;
            int var26 = arg1 * var25 + arg6 * var23 >> 16;
            int var27 = arg6 * var25 - arg1 * var23 >> 16;
            int var29 = arg5 * var24 - arg3 * var27 >> 16;
            int var30 = arg3 * var24 + arg5 * var27 >> 16;
            if (var30 < 50) {
                return;
            }
            if (arg2.field176 != null) {
                TileOverlay.field184[var10] = var26;
                TileOverlay.field185[var10] = var29;
                TileOverlay.field186[var10] = var30;
            }
            TileOverlay.field182[var10] = (var26 << 9) / var30 + Pix3D.field634;
            TileOverlay.field183[var10] = (var29 << 9) / var30 + Pix3D.field635;
        }
        if (arg4 <= 0) {
            field279 = -57;
        }
        Pix3D.field633 = 0;
        int var11 = arg2.field173.length;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = arg2.field173[var12];
            int var14 = arg2.field174[var12];
            int var15 = arg2.field175[var12];
            int var16 = TileOverlay.field182[var13];
            int var17 = TileOverlay.field182[var14];
            int var18 = TileOverlay.field182[var15];
            int var19 = TileOverlay.field183[var13];
            int var20 = TileOverlay.field183[var14];
            int var21 = TileOverlay.field183[var15];
            if ((var16 - var17) * (var21 - var20) - (var18 - var17) * (var19 - var20) > 0) {
                Pix3D.field630 = false;
                if (var16 < 0 || var17 < 0 || var18 < 0 || var16 > Pix2D.field621 || var17 > Pix2D.field621 || var18 > Pix2D.field621) {
                    Pix3D.field630 = true;
                }
                if (field312 && this.method94(field313, field314, var19, var20, var21, var16, var17, var18)) {
                    field315 = arg0;
                    field316 = arg7;
                }
                if (arg2.field176 == null || arg2.field176[var12] == -1) {
                    if (arg2.field170[var12] != 12345678) {
                        Pix3D.method174(var19, var20, var21, var16, var17, var18, arg2.field170[var12], arg2.field171[var12], arg2.field172[var12]);
                    }
                } else if (field281) {
                    int var22 = field330[arg2.field176[var12]];
                    Pix3D.method174(var19, var20, var21, var16, var17, var18, this.method93(arg2.field170[var12], var22, 595), this.method93(arg2.field171[var12], var22, 595), this.method93(arg2.field172[var12], var22, 595));
                } else if (arg2.field177) {
                    Pix3D.method178(var19, var20, var21, var16, var17, var18, arg2.field170[var12], arg2.field171[var12], arg2.field172[var12], TileOverlay.field184[0], TileOverlay.field184[1], TileOverlay.field184[3], TileOverlay.field185[0], TileOverlay.field185[1], TileOverlay.field185[3], TileOverlay.field186[0], TileOverlay.field186[1], TileOverlay.field186[3], arg2.field176[var12]);
                } else {
                    Pix3D.method178(var19, var20, var21, var16, var17, var18, arg2.field170[var12], arg2.field171[var12], arg2.field172[var12], TileOverlay.field184[var13], TileOverlay.field184[var14], TileOverlay.field184[var15], TileOverlay.field185[var13], TileOverlay.field185[var14], TileOverlay.field185[var15], TileOverlay.field186[var13], TileOverlay.field186[var14], TileOverlay.field186[var15], arg2.field176[var12]);
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "f", descriptor = "(III)I")
    public int method93(int arg0, int arg1, int arg2) {
        int var4 = 94 / arg2;
        int var5 = 127 - arg0;
        int var6 = (arg1 & 0x7F) * var5 / 160;
        if (var6 < 2) {
            var6 = 2;
        } else if (var6 > 126) {
            var6 = 126;
        }
        return (arg1 & 0xFF80) + var6;
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

    @OriginalMember(owner = "r", name = "a", descriptor = "(Z)V")
    private void method95(boolean arg0) {
        int var2 = field318[field292];
        if (!arg0) {
            this.field277 = 81;
        }
        Occlude[] var3 = field319[field292];
        field320 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            Occlude var5 = var3[var4];
            if (var5.field227 == 1) {
                int var6 = var5.field223 + 25 - field298;
                if (var6 >= 0 && var6 <= 50) {
                    int var7 = var5.field225 + 25 - field299;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = var5.field226 + 25 - field299;
                    if (var8 > 50) {
                        var8 = 50;
                    }
                    boolean var9 = false;
                    while (var7 <= var8) {
                        if (field337[var6][var7++]) {
                            var9 = true;
                            break;
                        }
                    }
                    if (var9) {
                        int var10 = field300 - var5.field228;
                        if (var10 > 32) {
                            var5.field234 = 1;
                        } else {
                            if (var10 >= -32) {
                                continue;
                            }
                            var5.field234 = 2;
                            var10 = -var10;
                        }
                        var5.field237 = (var5.field230 - field302 << 8) / var10;
                        var5.field238 = (var5.field231 - field302 << 8) / var10;
                        var5.field239 = (var5.field232 - field301 << 8) / var10;
                        var5.field240 = (var5.field233 - field301 << 8) / var10;
                        field321[field320++] = var5;
                    }
                }
            } else if (var5.field227 == 2) {
                int var11 = var5.field225 + 25 - field299;
                if (var11 >= 0 && var11 <= 50) {
                    int var12 = var5.field223 + 25 - field298;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = var5.field224 + 25 - field298;
                    if (var13 > 50) {
                        var13 = 50;
                    }
                    boolean var14 = false;
                    while (var12 <= var13) {
                        if (field337[var12++][var11]) {
                            var14 = true;
                            break;
                        }
                    }
                    if (var14) {
                        int var15 = field302 - var5.field230;
                        if (var15 > 32) {
                            var5.field234 = 3;
                        } else {
                            if (var15 >= -32) {
                                continue;
                            }
                            var5.field234 = 4;
                            var15 = -var15;
                        }
                        var5.field235 = (var5.field228 - field300 << 8) / var15;
                        var5.field236 = (var5.field229 - field300 << 8) / var15;
                        var5.field239 = (var5.field232 - field301 << 8) / var15;
                        var5.field240 = (var5.field233 - field301 << 8) / var15;
                        field321[field320++] = var5;
                    }
                }
            } else if (var5.field227 == 4) {
                int var16 = var5.field232 - field301;
                if (var16 > 128) {
                    int var17 = var5.field225 + 25 - field299;
                    if (var17 < 0) {
                        var17 = 0;
                    }
                    int var18 = var5.field226 + 25 - field299;
                    if (var18 > 50) {
                        var18 = 50;
                    }
                    if (var17 <= var18) {
                        int var19 = var5.field223 + 25 - field298;
                        if (var19 < 0) {
                            var19 = 0;
                        }
                        int var20 = var5.field224 + 25 - field298;
                        if (var20 > 50) {
                            var20 = 50;
                        }
                        boolean var21 = false;
                        label149: for (int var22 = var19; var22 <= var20; var22++) {
                            for (int var23 = var17; var23 <= var18; var23++) {
                                if (field337[var22][var23]) {
                                    var21 = true;
                                    break label149;
                                }
                            }
                        }
                        if (var21) {
                            var5.field234 = 5;
                            var5.field235 = (var5.field228 - field300 << 8) / var16;
                            var5.field236 = (var5.field229 - field300 << 8) / var16;
                            var5.field237 = (var5.field230 - field302 << 8) / var16;
                            var5.field238 = (var5.field231 - field302 << 8) / var16;
                            field321[field320++] = var5;
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

    @OriginalMember(owner = "r", name = "j", descriptor = "(IIII)Z")
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

    @OriginalMember(owner = "r", name = "k", descriptor = "(IIII)Z")
    private boolean method98(int arg0, int arg1, int arg2, int arg3) {
        if (this.method96(arg0, arg1, arg2)) {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            return this.method100(var5 + 1, this.field285[arg0][arg1][arg2] - arg3, var6 + 1) && this.method100(var5 + 128 - 1, this.field285[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method100(var5 + 128 - 1, this.field285[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method100(var5 + 1, this.field285[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIII)Z")
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
            if (var5.field234 == 1) {
                int var6 = var5.field228 - arg0;
                if (var6 > 0) {
                    int var7 = (var5.field237 * var6 >> 8) + var5.field230;
                    int var8 = (var5.field238 * var6 >> 8) + var5.field231;
                    int var9 = (var5.field239 * var6 >> 8) + var5.field232;
                    int var10 = (var5.field240 * var6 >> 8) + var5.field233;
                    if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field234 == 2) {
                int var11 = arg0 - var5.field228;
                if (var11 > 0) {
                    int var12 = (var5.field237 * var11 >> 8) + var5.field230;
                    int var13 = (var5.field238 * var11 >> 8) + var5.field231;
                    int var14 = (var5.field239 * var11 >> 8) + var5.field232;
                    int var15 = (var5.field240 * var11 >> 8) + var5.field233;
                    if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
                        return true;
                    }
                }
            } else if (var5.field234 == 3) {
                int var16 = var5.field230 - arg2;
                if (var16 > 0) {
                    int var17 = (var5.field235 * var16 >> 8) + var5.field228;
                    int var18 = (var5.field236 * var16 >> 8) + var5.field229;
                    int var19 = (var5.field239 * var16 >> 8) + var5.field232;
                    int var20 = (var5.field240 * var16 >> 8) + var5.field233;
                    if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
                        return true;
                    }
                }
            } else if (var5.field234 == 4) {
                int var21 = arg2 - var5.field230;
                if (var21 > 0) {
                    int var22 = (var5.field235 * var21 >> 8) + var5.field228;
                    int var23 = (var5.field236 * var21 >> 8) + var5.field229;
                    int var24 = (var5.field239 * var21 >> 8) + var5.field232;
                    int var25 = (var5.field240 * var21 >> 8) + var5.field233;
                    if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
                        return true;
                    }
                }
            } else if (var5.field234 == 5) {
                int var26 = arg1 - var5.field232;
                if (var26 > 0) {
                    int var27 = (var5.field235 * var26 >> 8) + var5.field228;
                    int var28 = (var5.field236 * var26 >> 8) + var5.field229;
                    int var29 = (var5.field237 * var26 >> 8) + var5.field230;
                    int var30 = (var5.field238 * var26 >> 8) + var5.field231;
                    if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
