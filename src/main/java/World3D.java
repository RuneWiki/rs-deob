import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class World3D {

    @OriginalMember(owner = "s", name = "a", descriptor = "Z")
    private boolean field276 = false;

    @OriginalMember(owner = "s", name = "b", descriptor = "I")
    private int field277 = -31142;

    @OriginalMember(owner = "s", name = "d", descriptor = "I")
    private int field279 = 13841;

    @OriginalMember(owner = "s", name = "e", descriptor = "I")
    private int field280 = 21315;

    @OriginalMember(owner = "s", name = "f", descriptor = "I")
    private int field281 = -25580;

    @OriginalMember(owner = "s", name = "h", descriptor = "Z")
    private boolean field283 = false;

    @OriginalMember(owner = "s", name = "i", descriptor = "I")
    private int field284 = 4;

    @OriginalMember(owner = "s", name = "r", descriptor = "[Lq;")
    public Location[] field293 = new Location[5000];

    @OriginalMember(owner = "s", name = "hb", descriptor = "[I")
    public int[] field335 = new int[10000];

    @OriginalMember(owner = "s", name = "ib", descriptor = "[I")
    public int[] field336 = new int[10000];

    @OriginalMember(owner = "s", name = "kb", descriptor = "[[I")
    public int[][] field338 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "s", name = "lb", descriptor = "[[I")
    public int[][] field339 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "s", name = "k", descriptor = "I")
    public int field286;

    @OriginalMember(owner = "s", name = "l", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "s", name = "m", descriptor = "I")
    public int field288;

    @OriginalMember(owner = "s", name = "o", descriptor = "[[[Lw;")
    public Tile[][][] field290;

    @OriginalMember(owner = "s", name = "s", descriptor = "[[[I")
    public int[][][] field294;

    @OriginalMember(owner = "s", name = "n", descriptor = "[[[I")
    public int[][][] field289;

    @OriginalMember(owner = "s", name = "g", descriptor = "I")
    private static int field282 = 5;

    @OriginalMember(owner = "s", name = "j", descriptor = "Z")
    public static boolean field285 = true;

    @OriginalMember(owner = "s", name = "J", descriptor = "[Lq;")
    public static Location[] field311 = new Location[100];

    @OriginalMember(owner = "s", name = "K", descriptor = "[I")
    public static final int[] field312 = new int[] { 53, -53, -53, 53 };

    @OriginalMember(owner = "s", name = "L", descriptor = "[I")
    public static final int[] field313 = new int[] { -53, -53, 53, 53 };

    @OriginalMember(owner = "s", name = "M", descriptor = "[I")
    public static final int[] field314 = new int[] { -45, 45, 45, -45 };

    @OriginalMember(owner = "s", name = "N", descriptor = "[I")
    public static final int[] field315 = new int[] { 45, 45, -45, -45 };

    @OriginalMember(owner = "s", name = "R", descriptor = "I")
    public static int field319 = -1;

    @OriginalMember(owner = "s", name = "S", descriptor = "I")
    public static int field320 = -1;

    @OriginalMember(owner = "s", name = "T", descriptor = "I")
    public static int field321 = 4;

    @OriginalMember(owner = "s", name = "U", descriptor = "[I")
    public static int[] field322 = new int[field321];

    @OriginalMember(owner = "s", name = "V", descriptor = "[[Ln;")
    public static Occlude[][] field323 = new Occlude[field321][500];

    @OriginalMember(owner = "s", name = "X", descriptor = "[Ln;")
    public static Occlude[] field325 = new Occlude[500];

    @OriginalMember(owner = "s", name = "Y", descriptor = "Lpb;")
    public static LinkList field326 = new LinkList(-740);

    @OriginalMember(owner = "s", name = "Z", descriptor = "[I")
    public static final int[] field327 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "s", name = "ab", descriptor = "[I")
    public static final int[] field328 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "s", name = "bb", descriptor = "[I")
    public static final int[] field329 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "s", name = "cb", descriptor = "[I")
    public static final int[] field330 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "s", name = "db", descriptor = "[I")
    public static final int[] field331 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "s", name = "eb", descriptor = "[I")
    public static final int[] field332 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "s", name = "fb", descriptor = "[I")
    public static final int[] field333 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "s", name = "gb", descriptor = "[I")
    public static final int[] field334 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

    @OriginalMember(owner = "s", name = "mb", descriptor = "[[[[Z")
    public static boolean[][][][] field340 = new boolean[8][32][51][51];

    @OriginalMember(owner = "s", name = "c", descriptor = "I")
    private static int field278;

    @OriginalMember(owner = "s", name = "p", descriptor = "I")
    public int field291;

    @OriginalMember(owner = "s", name = "q", descriptor = "I")
    public int field292;

    @OriginalMember(owner = "s", name = "t", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "s", name = "u", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "s", name = "v", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "s", name = "w", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "s", name = "x", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "s", name = "y", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "s", name = "z", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "s", name = "A", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "s", name = "B", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "s", name = "C", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "s", name = "D", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "s", name = "E", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "s", name = "F", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "s", name = "G", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "s", name = "H", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "s", name = "I", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "s", name = "P", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "s", name = "Q", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "s", name = "W", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "s", name = "jb", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "s", name = "ob", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "s", name = "pb", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "s", name = "qb", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "s", name = "rb", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "s", name = "sb", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "s", name = "tb", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "s", name = "O", descriptor = "Z")
    public static boolean field316;

    @OriginalMember(owner = "s", name = "nb", descriptor = "[[Z")
    public static boolean[][] field341;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(III[[[II)V")
    public World3D(int arg0, int arg1, int arg2, int[][][] arg3, int arg4) {
        this.field286 = arg1;
        this.field287 = arg4;
        this.field288 = arg2;
        this.field290 = new Tile[arg1][arg4][arg2];
        this.field294 = new int[arg1][arg4 + 1][arg2 + 1];
        this.field289 = arg3;
        this.method62(this.field279);
        int var6 = 41 / arg0;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Z)V")
    public static void method61(boolean arg0) {
        field311 = null;
        if (!arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field322 = null;
        field323 = null;
        field326 = null;
        field340 = null;
        field341 = null;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(I)V")
    public void method62(int arg0) {
        for (int var2 = 0; var2 < this.field286; var2++) {
            for (int var7 = 0; var7 < this.field287; var7++) {
                for (int var8 = 0; var8 < this.field288; var8++) {
                    this.field290[var2][var7][var8] = null;
                }
            }
        }
        for (int var3 = 0; var3 < field321; var3++) {
            for (int var6 = 0; var6 < field322[var3]; var6++) {
                field323[var3][var6] = null;
            }
            field322[var3] = 0;
        }
        for (int var4 = 0; var4 < this.field292; var4++) {
            this.field293[var4] = null;
        }
        if (arg0 == 13841) {
            this.field292 = 0;
            for (int var5 = 0; var5 < field311.length; var5++) {
                field311[var5] = null;
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IZ)V")
    public void method63(int arg0, boolean arg1) {
        this.field291 = arg0;
        for (int var3 = 0; var3 < this.field287; var3++) {
            for (int var4 = 0; var4 < this.field288; var4++) {
                this.field290[arg0][var3][var4] = new Tile(arg0, var3, var4);
            }
        }
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIB)V")
    public void method64(int arg0, int arg1, byte arg2) {
        Tile var4 = this.field290[0][arg0][arg1];
        for (int var5 = 0; var5 < 3; var5++) {
            this.field290[var5][arg0][arg1] = this.field290[var5 + 1][arg0][arg1];
            if (this.field290[var5][arg0][arg1] != null) {
                this.field290[var5][arg0][arg1].field366--;
            }
        }
        if (this.field290[0][arg0][arg1] == null) {
            this.field290[0][arg0][arg1] = new Tile(0, arg0, arg1);
        }
        this.field290[0][arg0][arg1].field388 = var4;
        this.field290[3][arg0][arg1] = null;
        if (arg2 == 4) {
            boolean var6 = false;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(ZIIIIIIII)V")
    public static void method65(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Occlude var9 = new Occlude();
        var9.field224 = arg3 / 128;
        var9.field225 = arg8 / 128;
        var9.field226 = arg7 / 128;
        var9.field227 = arg2 / 128;
        var9.field228 = arg1;
        if (!arg0) {
            return;
        }
        var9.field229 = arg3;
        var9.field230 = arg8;
        var9.field231 = arg7;
        var9.field232 = arg2;
        var9.field233 = arg4;
        var9.field234 = arg5;
        field323[arg6][field322[arg6]++] = var9;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIII)V")
    public void method66(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field290[arg0][arg1][arg2];
        if (var5 != null) {
            this.field290[arg0][arg1][arg2].field380 = arg3;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public void method67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
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
            TileOverlay var25 = new TileOverlay(arg4, arg1, arg14, arg13, arg2, arg9, arg6, arg15, arg7, arg11, arg12, arg5, arg18, arg3, arg17, arg10, arg8, arg16, arg19, field278);
            for (int var26 = arg0; var26 >= 0; var26--) {
                if (this.field290[var26][arg1][arg2] == null) {
                    this.field290[var26][arg1][arg2] = new Tile(var26, arg1, arg2);
                }
            }
            this.field290[arg0][arg1][arg2].field371 = var25;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIBLy;BII)V")
    public void method68(int arg0, int arg1, int arg2, byte arg3, Entity arg4, byte arg5, int arg6, int arg7) {
        if (arg4 == null) {
            return;
        }
        GroundDecor var9 = new GroundDecor();
        var9.field196 = arg4;
        var9.field194 = arg6 * 128 + 64;
        var9.field195 = arg2 * 128 + 64;
        var9.field193 = arg0;
        var9.field197 = arg7;
        var9.field198 = arg5;
        if (arg3 == 5) {
            boolean var10 = false;
        } else {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        if (this.field290[arg1][arg6][arg2] == null) {
            this.field290[arg1][arg6][arg2] = new Tile(arg1, arg6, arg2);
        }
        this.field290[arg1][arg6][arg2].field374 = var9;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(ILy;IIILy;IBLy;)V")
    public void method69(int arg0, Entity arg1, int arg2, int arg3, int arg4, Entity arg5, int arg6, byte arg7, Entity arg8) {
        GroundObject var10 = new GroundObject();
        var10.field202 = arg8;
        var10.field200 = arg2 * 128 + 64;
        var10.field201 = arg3 * 128 + 64;
        var10.field199 = arg6;
        var10.field205 = arg0;
        if (arg7 != 2) {
            return;
        }
        var10.field203 = arg1;
        var10.field204 = arg5;
        int var11 = 0;
        Tile var12 = this.field290[arg4][arg2][arg3];
        if (var12 != null) {
            for (int var13 = 0; var13 < var12.field376; var13++) {
                if (var12.field377[var13].field257 instanceof Model) {
                    int var14 = ((Model) var12.field377[var13].field257).field553;
                    if (var14 > var11) {
                        var11 = var14;
                    }
                }
            }
        }
        var10.field206 = var11;
        if (this.field290[arg4][arg2][arg3] == null) {
            this.field290[arg4][arg2][arg3] = new Tile(arg4, arg2, arg3);
        }
        this.field290[arg4][arg2][arg3].field375 = var10;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIBIIILy;IILy;)V")
    public void method70(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, Entity arg7, int arg8, int arg9, Entity arg10) {
        if (arg10 == null && arg7 == null) {
            return;
        }
        Wall var12 = new Wall();
        var12.field274 = arg0;
        var12.field275 = arg3;
        var12.field268 = arg2 * 128 + 64;
        var12.field269 = arg6 * 128 + 64;
        var12.field267 = arg9;
        var12.field272 = arg10;
        var12.field273 = arg7;
        if (arg1 <= 0) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        var12.field270 = arg4;
        var12.field271 = arg5;
        for (int var14 = arg8; var14 >= 0; var14--) {
            if (this.field290[var14][arg2][arg6] == null) {
                this.field290[var14][arg2][arg6] = new Tile(var14, arg2, arg6);
            }
        }
        this.field290[arg8][arg2][arg6].field372 = var12;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIZBIIILy;III)V")
    public void method71(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, int arg10, int arg11) {
        if (arg8 == null) {
            return;
        }
        Decor var13 = new Decor();
        var13.field166 = arg11;
        var13.field167 = arg4;
        var13.field161 = arg2 * 128 + arg9 + 64;
        if (arg3) {
            return;
        }
        var13.field162 = arg5 * 128 + arg1 + 64;
        var13.field160 = arg10;
        var13.field165 = arg8;
        var13.field163 = arg6;
        var13.field164 = arg7;
        for (int var14 = arg0; var14 >= 0; var14--) {
            if (this.field290[var14][arg2][arg5] == null) {
                this.field290[var14][arg2][arg5] = new Tile(var14, arg2, arg5);
            }
        }
        this.field290[arg0][arg2][arg5].field373 = var13;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIIIIILy;IB)Z")
    public boolean method72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, byte arg10) {
        if (arg1 < 4 || arg1 > 4) {
            field278 = -133;
        }
        if (arg8 == null) {
            return true;
        } else {
            int var12 = arg2 * 64 + arg3 * 128;
            int var13 = arg4 * 128 + arg9 * 64;
            return this.method75(arg5, arg3, arg4, arg2, arg9, var12, var13, arg7, arg8, arg6, false, arg0, arg10);
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIBIIIZLy;II)Z")
    public boolean method73(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, boolean arg6, Entity arg7, int arg8, int arg9) {
        if (arg7 == null) {
            return true;
        }
        int var11 = arg0 - arg8;
        int var12 = arg5 - arg8;
        int var13 = arg0 + arg8;
        int var14 = arg5 + arg8;
        if (arg2 != 6) {
            this.field284 = -135;
        }
        if (arg6) {
            if (arg1 > 640 && arg1 < 1408) {
                var14 += 128;
            }
            if (arg1 > 1152 && arg1 < 1920) {
                var13 += 128;
            }
            if (arg1 > 1664 || arg1 < 384) {
                var12 -= 128;
            }
            if (arg1 > 128 && arg1 < 896) {
                var11 -= 128;
            }
        }
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        int var18 = var14 / 128;
        return this.method75(arg4, var15, var16, var17 + 1 - var15, var18 - var16 + 1, arg0, arg5, arg9, arg7, arg1, true, arg3, (byte) 0);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Ly;IIIIIIIIIIII)Z")
    public boolean method74(Entity arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        if (arg12 != 7) {
            this.field279 = -264;
        }
        return arg0 == null ? true : this.method75(arg5, arg3, arg11, arg2 + 1 - arg3, arg4 - arg11 + 1, arg6, arg1, arg7, arg0, arg9, true, arg8, (byte) 0);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIIIIILy;IZIB)Z")
    private boolean method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, boolean arg10, int arg11, byte arg12) {
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

    @OriginalMember(owner = "s", name = "a", descriptor = "(B)V")
    public void method76(byte arg0) {
        if (arg0 != -106) {
            this.field280 = 123;
        }
        for (int var2 = 0; var2 < this.field292; var2++) {
            Location var3 = this.field293[var2];
            this.method77(var3, false);
            this.field293[var2] = null;
        }
        this.field292 = 0;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Lq;Z)V")
    private void method77(Location arg0, boolean arg1) {
        if (arg1) {
            this.field276 = !this.field276;
        }
        for (int var3 = arg0.field259; var3 <= arg0.field260; var3++) {
            for (int var4 = arg0.field261; var4 <= arg0.field262; var4++) {
                Tile var5 = this.field290[arg0.field253][var3][var4];
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

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIII)V")
    public void method78(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Tile var6 = this.field290[arg1][arg2][arg0];
        if (arg4 != 0 || var6 == null) {
            return;
        }
        Decor var7 = var6.field373;
        if (var7 != null) {
            int var8 = arg2 * 128 + 64;
            int var9 = arg0 * 128 + 64;
            var7.field161 = (var7.field161 - var8) * arg3 / 16 + var8;
            var7.field162 = (var7.field162 - var9) * arg3 / 16 + var9;
        }
    }

    @OriginalMember(owner = "s", name = "b", descriptor = "(IIII)V")
    public void method79(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field290[arg1][arg3][arg0];
        if (arg2 != 9) {
            this.field279 = -87;
        }
        if (var5 != null) {
            var5.field372 = null;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIB)V")
    public void method80(int arg0, int arg1, int arg2, byte arg3) {
        Tile var5 = this.field290[arg0][arg1][arg2];
        if (arg3 == -11 && var5 != null) {
            var5.field373 = null;
        }
    }

    @OriginalMember(owner = "s", name = "c", descriptor = "(IIII)V")
    public void method81(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field290[arg3][arg0][arg2];
        if (var5 == null) {
            return;
        }
        for (int var6 = 0; var6 < var5.field376; var6++) {
            Location var7 = var5.field377[var6];
            if ((var7.field265 >> 29 & 0x3) == 2 && var7.field259 == arg0 && var7.field261 == arg2) {
                this.method77(var7, false);
                return;
            }
        }
        if (arg1 != 3042) {
            this.field284 = 153;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(ZIII)V")
    public void method82(boolean arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field290[arg3][arg2][arg1];
        if (var5 != null) {
            var5.field374 = null;
            if (!arg0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(III)V")
    public void method83(int arg0, int arg1, int arg2) {
        Tile var4 = this.field290[arg0][arg1][arg2];
        if (var4 != null) {
            var4.field375 = null;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(BIII)Lr;")
    public Wall method84(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 119) {
            this.field284 = 39;
        }
        Tile var5 = this.field290[arg3][arg1][arg2];
        return var5 == null ? null : var5.field372;
    }

    @OriginalMember(owner = "s", name = "d", descriptor = "(IIII)Li;")
    public Decor method85(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        Tile var6 = this.field290[arg2][arg0][arg1];
        return var6 == null ? null : var6.field373;
    }

    @OriginalMember(owner = "s", name = "e", descriptor = "(IIII)Lq;")
    public Location method86(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field290[arg2][arg0][arg3];
        if (arg1 <= 0) {
            this.field280 = 346;
        }
        if (var5 == null) {
            return null;
        }
        for (int var6 = 0; var6 < var5.field376; var6++) {
            Location var7 = var5.field377[var6];
            if ((var7.field265 >> 29 & 0x3) == 2 && var7.field259 == arg0 && var7.field261 == arg3) {
                return var7;
            }
        }
        return null;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIZ)Lk;")
    public GroundDecor method87(int arg0, int arg1, int arg2, boolean arg3) {
        Tile var5 = this.field290[arg1][arg0][arg2];
        if (!arg3) {
            field278 = -192;
        }
        return var5 == null || var5.field374 == null ? null : var5.field374;
    }

    @OriginalMember(owner = "s", name = "b", descriptor = "(III)I")
    public int method88(int arg0, int arg1, int arg2) {
        Tile var4 = this.field290[arg0][arg1][arg2];
        return var4 == null || var4.field372 == null ? 0 : var4.field372.field274;
    }

    @OriginalMember(owner = "s", name = "f", descriptor = "(IIII)I")
    public int method89(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 5 && arg3 <= 5) {
            Tile var5 = this.field290[arg0][arg2][arg1];
            return var5 == null || var5.field373 == null ? 0 : var5.field373.field166;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "s", name = "c", descriptor = "(III)I")
    public int method90(int arg0, int arg1, int arg2) {
        Tile var4 = this.field290[arg0][arg1][arg2];
        if (var4 == null) {
            return 0;
        }
        for (int var5 = 0; var5 < var4.field376; var5++) {
            Location var6 = var4.field377[var5];
            if ((var6.field265 >> 29 & 0x3) == 2 && var6.field259 == arg1 && var6.field261 == arg2) {
                return var6.field265;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "s", name = "d", descriptor = "(III)I")
    public int method91(int arg0, int arg1, int arg2) {
        Tile var4 = this.field290[arg0][arg1][arg2];
        return var4 == null || var4.field374 == null ? 0 : var4.field374.field197;
    }

    @OriginalMember(owner = "s", name = "g", descriptor = "(IIII)I")
    public int method92(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field290[arg0][arg1][arg2];
        if (var5 == null) {
            return -1;
        } else if (var5.field372 != null && var5.field372.field274 == arg3) {
            return var5.field372.field275 & 0xFF;
        } else if (var5.field373 != null && var5.field373.field166 == arg3) {
            return var5.field373.field167 & 0xFF;
        } else if (var5.field374 != null && var5.field374.field197 == arg3) {
            return var5.field374.field198 & 0xFF;
        } else {
            for (int var6 = 0; var6 < var5.field376; var6++) {
                if (var5.field377[var6].field265 == arg3) {
                    return var5.field377[var6].field266 & 0xFF;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIII)V")
    public void method93(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field281 != arg3) {
            return;
        }
        int var7 = (int) Math.sqrt((double) (arg4 * arg4 + arg0 * arg0 + arg1 * arg1));
        int var8 = arg5 * var7 >> 8;
        for (int var9 = 0; var9 < this.field286; var9++) {
            for (int var10 = 0; var10 < this.field287; var10++) {
                for (int var11 = 0; var11 < this.field288; var11++) {
                    Tile var12 = this.field290[var9][var10][var11];
                    if (var12 != null) {
                        Wall var13 = var12.field372;
                        if (var13 != null && var13.field272 != null && var13.field272.field393 != null) {
                            this.method95(1, (Model) var13.field272, var9, true, 1, var10, var11);
                            if (var13.field273 != null && var13.field273.field393 != null) {
                                this.method95(1, (Model) var13.field273, var9, true, 1, var10, var11);
                                this.method96((Model) var13.field272, (Model) var13.field273, 0, 0, 0, false);
                                ((Model) var13.field273).method153(arg2, var8, arg0, arg1, arg4);
                            }
                            ((Model) var13.field272).method153(arg2, var8, arg0, arg1, arg4);
                        }
                        for (int var14 = 0; var14 < var12.field376; var14++) {
                            Location var16 = var12.field377[var14];
                            if (var16 != null && var16.field257 != null && var16.field257.field393 != null) {
                                this.method95(var16.field262 + 1 - var16.field261, (Model) var16.field257, var9, true, var16.field260 + 1 - var16.field259, var10, var11);
                                ((Model) var16.field257).method153(arg2, var8, arg0, arg1, arg4);
                            }
                        }
                        GroundDecor var15 = var12.field374;
                        if (var15 != null && var15.field196.field393 != null) {
                            this.method94(var10, (Model) var15.field196, false, var9, var11);
                            ((Model) var15.field196).method153(arg2, var8, arg0, arg1, arg4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(ILfb;ZII)V")
    private void method94(int arg0, Model arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            return;
        }
        if (arg0 < this.field287) {
            Tile var6 = this.field290[arg3][arg0 + 1][arg4];
            if (var6 != null && var6.field374 != null && var6.field374.field196.field393 != null) {
                this.method96(arg1, (Model) var6.field374.field196, 128, 0, 0, true);
            }
        }
        if (arg4 < this.field287) {
            Tile var7 = this.field290[arg3][arg0][arg4 + 1];
            if (var7 != null && var7.field374 != null && var7.field374.field196.field393 != null) {
                this.method96(arg1, (Model) var7.field374.field196, 0, 0, 128, true);
            }
        }
        if (arg0 < this.field287 && arg4 < this.field288) {
            Tile var8 = this.field290[arg3][arg0 + 1][arg4 + 1];
            if (var8 != null && var8.field374 != null && var8.field374.field196.field393 != null) {
                this.method96(arg1, (Model) var8.field374.field196, 128, 0, 128, true);
            }
        }
        if (arg0 >= this.field287 || arg4 <= 0) {
            return;
        }
        Tile var9 = this.field290[arg3][arg0 + 1][arg4 - 1];
        if (var9 != null && var9.field374 != null && var9.field374.field196.field393 != null) {
            this.method96(arg1, (Model) var9.field374.field196, 128, 0, -128, true);
            return;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(ILfb;IZIII)V")
    private void method95(int arg0, Model arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        boolean var8 = true;
        int var9 = arg5;
        int var10 = arg4 + arg5;
        int var11 = arg6 - 1;
        int var12 = arg0 + arg6;
        for (int var13 = arg2; var13 <= arg2 + 1; var13++) {
            if (this.field286 != var13) {
                for (int var14 = var9; var14 <= var10; var14++) {
                    if (var14 >= 0 && var14 < this.field287) {
                        for (int var15 = var11; var15 <= var12; var15++) {
                            if (var15 >= 0 && var15 < this.field288 && (!var8 || var14 >= var10 || var15 >= var12 || var15 < arg6 && arg5 != var14)) {
                                Tile var16 = this.field290[var13][var14][var15];
                                if (var16 != null) {
                                    int var17 = (this.field289[var13][var14 + 1][var15] + this.field289[var13][var14][var15] + this.field289[var13][var14][var15 + 1] + this.field289[var13][var14 + 1][var15 + 1]) / 4 - (this.field289[arg2][arg5 + 1][arg6] + this.field289[arg2][arg5][arg6] + this.field289[arg2][arg5][arg6 + 1] + this.field289[arg2][arg5 + 1][arg6 + 1]) / 4;
                                    Wall var18 = var16.field372;
                                    if (var18 != null && var18.field272 != null && var18.field272.field393 != null) {
                                        this.method96(arg1, (Model) var18.field272, (1 - arg4) * 64 + (var14 - arg5) * 128, var17, (1 - arg0) * 64 + (var15 - arg6) * 128, var8);
                                    }
                                    if (var18 != null && var18.field273 != null && var18.field273.field393 != null) {
                                        this.method96(arg1, (Model) var18.field273, (1 - arg4) * 64 + (var14 - arg5) * 128, var17, (1 - arg0) * 64 + (var15 - arg6) * 128, var8);
                                    }
                                    for (int var19 = 0; var19 < var16.field376; var19++) {
                                        Location var20 = var16.field377[var19];
                                        if (var20 != null && var20.field257 != null && var20.field257.field393 != null) {
                                            int var21 = var20.field260 + 1 - var20.field259;
                                            int var22 = var20.field262 + 1 - var20.field261;
                                            this.method96(arg1, (Model) var20.field257, (var20.field259 - arg5) * 128 + (var21 - arg4) * 64, var17, (var20.field261 - arg6) * 128 + (var22 - arg0) * 64, var8);
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
        if (!arg3) {
            this.field280 = -96;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Lfb;Lfb;IIIZ)V")
    private void method96(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field337++;
        int var7 = 0;
        int[] var8 = arg1.field526;
        int var9 = arg1.field525;
        for (int var10 = 0; var10 < arg0.field525; var10++) {
            VertexNormal var13 = arg0.field393[var10];
            VertexNormal var14 = arg0.field559[var10];
            if (var14.field245 != 0) {
                int var15 = arg0.field527[var10] - arg3;
                if (var15 <= arg1.field550) {
                    int var16 = arg0.field526[var10] - arg2;
                    if (var16 >= arg1.field545 && var16 <= arg1.field546) {
                        int var17 = arg0.field528[var10] - arg4;
                        if (var17 >= arg1.field548 && var17 <= arg1.field547) {
                            for (int var18 = 0; var18 < var9; var18++) {
                                VertexNormal var19 = arg1.field393[var18];
                                VertexNormal var20 = arg1.field559[var18];
                                if (var8[var18] == var16 && arg1.field528[var18] == var17 && arg1.field527[var18] == var15 && var20.field245 != 0) {
                                    var13.field242 += var20.field242;
                                    var13.field243 += var20.field243;
                                    var13.field244 += var20.field244;
                                    var13.field245 += var20.field245;
                                    var19.field242 += var14.field242;
                                    var19.field243 += var14.field243;
                                    var19.field244 += var14.field244;
                                    var19.field245 += var14.field245;
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
        for (int var11 = 0; var11 < arg0.field529; var11++) {
            if (this.field335[arg0.field530[var11]] == this.field337 && this.field335[arg0.field531[var11]] == this.field337 && this.field335[arg0.field532[var11]] == this.field337) {
                arg0.field536[var11] = -1;
            }
        }
        for (int var12 = 0; var12 < arg1.field529; var12++) {
            if (this.field336[arg1.field530[var12]] == this.field337 && this.field336[arg1.field531[var12]] == this.field337 && this.field336[arg1.field532[var12]] == this.field337) {
                arg1.field536[var12] = -1;
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "([IIIIII)V")
    public void method97(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Tile var7 = this.field290[arg3][arg4][arg5];
        if (var7 == null) {
            return;
        }
        TileUnderlay var8 = var7.field370;
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
        TileOverlay var11 = var7.field371;
        if (var11 == null) {
            return;
        }
        int var12 = var11.field179;
        int var13 = var11.field180;
        int var14 = var11.field181;
        int var15 = var11.field182;
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

    @OriginalMember(owner = "s", name = "b", descriptor = "([IIIIII)V")
    public static void method98(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field344 = 0;
        field345 = 0;
        field346 = arg1;
        field347 = arg5;
        field342 = arg1 / 2;
        field343 = arg5 / 2;
        boolean[][][][] var6 = new boolean[9][32][53][53];
        if (field282 != arg4) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        for (int var8 = 128; var8 <= 384; var8 += 32) {
            for (int var16 = 0; var16 < 2048; var16 += 64) {
                field307 = Model.field588[var8];
                field308 = Model.field589[var8];
                field309 = Model.field588[var16];
                field310 = Model.field589[var16];
                int var17 = (var8 - 128) / 32;
                int var18 = var16 / 64;
                for (int var19 = -26; var19 <= 26; var19++) {
                    for (int var20 = -26; var20 <= 26; var20++) {
                        int var21 = var19 * 128;
                        int var22 = var20 * 128;
                        boolean var23 = false;
                        for (int var24 = -arg2; var24 <= arg3; var24 += 128) {
                            if (method99(var22, arg0[var17] + var24, (byte) 6, var21)) {
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
                        field340[var9][var10][var11 + 25][var12 + 25] = var13;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIBI)Z")
    public static boolean method99(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = field310 * arg3 + field309 * arg0 >> 16;
        int var5 = field310 * arg0 - field309 * arg3 >> 16;
        int var6 = field308 * var5 + field307 * arg1 >> 16;
        int var7 = field308 * arg1 - field307 * var5 >> 16;
        if (arg2 != 6) {
            throw new NullPointerException();
        } else if (var6 >= 50 && var6 <= 3500) {
            int var8 = (var4 << 9) / var6 + field342;
            int var9 = (var7 << 9) / var6 + field343;
            return var8 >= field344 && var8 <= field346 && var9 >= field345 && var9 <= field347;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IZI)V")
    public void method100(int arg0, boolean arg1, int arg2) {
        field316 = true;
        field317 = arg2;
        field318 = arg0;
        field319 = -1;
        field320 = -1;
        if (arg1) {
            field278 = -202;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIIII)V")
    public void method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 < 0) {
            arg3 = 0;
        } else if (arg3 >= this.field287 * 128) {
            arg3 = this.field287 * 128 - 1;
        }
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= this.field288 * 128) {
            arg0 = this.field288 * 128 - 1;
        }
        field297++;
        field307 = Model.field588[arg1];
        field308 = Model.field589[arg1];
        field309 = Model.field588[arg6];
        field310 = Model.field589[arg6];
        field341 = field340[(arg1 - 128) / 32][arg6 / 64];
        field304 = arg3;
        field305 = arg2;
        field306 = arg0;
        field302 = arg3 / 128;
        field303 = arg0 / 128;
        field296 = arg5;
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
        if (arg4 != 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        if (field301 > this.field288) {
            field301 = this.field288;
        }
        this.method107(-43309);
        field295 = 0;
        for (int var9 = this.field291; var9 < this.field286; var9++) {
            Tile[][] var34 = this.field290[var9];
            for (int var35 = field298; var35 < field299; var35++) {
                for (int var36 = field300; var36 < field301; var36++) {
                    Tile var37 = var34[var35][var36];
                    if (var37 != null) {
                        if (var37.field380 <= arg5 && (field341[var35 + 25 - field302][var36 + 25 - field303] || this.field289[var9][var35][var36] - arg2 >= 2000)) {
                            var37.field381 = true;
                            var37.field382 = true;
                            if (var37.field376 > 0) {
                                var37.field383 = true;
                            } else {
                                var37.field383 = false;
                            }
                            field295++;
                        } else {
                            var37.field381 = false;
                            var37.field382 = false;
                            var37.field384 = 0;
                        }
                    }
                }
            }
        }
        for (int var10 = this.field291; var10 < this.field286; var10++) {
            Tile[][] var23 = this.field290[var10];
            for (int var24 = -25; var24 <= 0; var24++) {
                int var25 = field302 + var24;
                int var26 = field302 - var24;
                if (var25 >= field298 || var26 < field299) {
                    for (int var27 = -25; var27 <= 0; var27++) {
                        int var28 = field303 + var27;
                        int var29 = field303 - var27;
                        if (var25 >= field298) {
                            if (var28 >= field300) {
                                Tile var30 = var23[var25][var28];
                                if (var30 != null && var30.field381) {
                                    this.method102(var30, true);
                                }
                            }
                            if (var29 < field301) {
                                Tile var31 = var23[var25][var29];
                                if (var31 != null && var31.field381) {
                                    this.method102(var31, true);
                                }
                            }
                        }
                        if (var26 < field299) {
                            if (var28 >= field300) {
                                Tile var32 = var23[var26][var28];
                                if (var32 != null && var32.field381) {
                                    this.method102(var32, true);
                                }
                            }
                            if (var29 < field301) {
                                Tile var33 = var23[var26][var29];
                                if (var33 != null && var33.field381) {
                                    this.method102(var33, true);
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
        for (int var11 = this.field291; var11 < this.field286; var11++) {
            Tile[][] var12 = this.field290[var11];
            for (int var13 = -25; var13 <= 0; var13++) {
                int var14 = field302 + var13;
                int var15 = field302 - var13;
                if (var14 >= field298 || var15 < field299) {
                    for (int var16 = -25; var16 <= 0; var16++) {
                        int var17 = field303 + var16;
                        int var18 = field303 - var16;
                        if (var14 >= field298) {
                            if (var17 >= field300) {
                                Tile var19 = var12[var14][var17];
                                if (var19 != null && var19.field381) {
                                    this.method102(var19, false);
                                }
                            }
                            if (var18 < field301) {
                                Tile var20 = var12[var14][var18];
                                if (var20 != null && var20.field381) {
                                    this.method102(var20, false);
                                }
                            }
                        }
                        if (var15 < field299) {
                            if (var17 >= field300) {
                                Tile var21 = var12[var15][var17];
                                if (var21 != null && var21.field381) {
                                    this.method102(var21, false);
                                }
                            }
                            if (var18 < field301) {
                                Tile var22 = var12[var15][var18];
                                if (var22 != null && var22.field381) {
                                    this.method102(var22, false);
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
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Lw;Z)V")
    public void method102(Tile arg0, boolean arg1) {
        field326.method247(arg0);
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
                                                var3 = (Tile) field326.method249();
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
                                                    if (var14.field371 != null && !this.method108(0, var4, var5)) {
                                                        this.method104(var5, field309, var4, -187, var14.field371, field310, field307, field308);
                                                    }
                                                } else if (!this.method108(0, var4, var5)) {
                                                    this.method103(var14.field370, 0, field307, field308, field309, field310, var4, var5);
                                                }
                                                Wall var15 = var14.field372;
                                                if (var15 != null) {
                                                    var15.field272.method120(0, field307, field308, field309, field310, var15.field268 - field304, var15.field267 - field305, var15.field269 - field306, var15.field274);
                                                }
                                                for (int var16 = 0; var16 < var14.field376; var16++) {
                                                    Location var17 = var14.field377[var16];
                                                    if (var17 != null) {
                                                        var17.field257.method120(var17.field258, field307, field308, field309, field310, var17.field255 - field304, var17.field254 - field305, var17.field256 - field306, var17.field265);
                                                    }
                                                }
                                            }
                                            boolean var18 = false;
                                            if (var3.field370 == null) {
                                                if (var3.field371 != null && !this.method108(var7, var4, var5)) {
                                                    var18 = true;
                                                    this.method104(var5, field309, var4, -187, var3.field371, field310, field307, field308);
                                                }
                                            } else if (!this.method108(var7, var4, var5)) {
                                                var18 = true;
                                                this.method103(var3.field370, var7, field307, field308, field309, field310, var4, var5);
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
                                                if ((var21.field270 & field328[var19]) == 0) {
                                                    var3.field384 = 0;
                                                } else if (var21.field270 == 16) {
                                                    var3.field384 = 3;
                                                    var3.field385 = field330[var19];
                                                    var3.field386 = 3 - var3.field385;
                                                } else if (var21.field270 == 32) {
                                                    var3.field384 = 6;
                                                    var3.field385 = field331[var19];
                                                    var3.field386 = 6 - var3.field385;
                                                } else if (var21.field270 == 64) {
                                                    var3.field384 = 12;
                                                    var3.field385 = field332[var19];
                                                    var3.field386 = 12 - var3.field385;
                                                } else {
                                                    var3.field384 = 9;
                                                    var3.field385 = field333[var19];
                                                    var3.field386 = 9 - var3.field385;
                                                }
                                                if ((var21.field270 & var20) != 0 && !this.method109(var7, var4, var5, var21.field270)) {
                                                    var21.field272.method120(0, field307, field308, field309, field310, var21.field268 - field304, var21.field267 - field305, var21.field269 - field306, var21.field274);
                                                }
                                                if ((var21.field271 & var20) != 0 && !this.method109(var7, var4, var5, var21.field271)) {
                                                    var21.field273.method120(0, field307, field308, field309, field310, var21.field268 - field304, var21.field267 - field305, var21.field269 - field306, var21.field274);
                                                }
                                            }
                                            if (var22 != null && !this.method110(var7, var4, var5, var22.field165.field394)) {
                                                if ((var22.field163 & var20) != 0) {
                                                    var22.field165.method120(var22.field164, field307, field308, field309, field310, var22.field161 - field304, var22.field160 - field305, var22.field162 - field306, var22.field166);
                                                } else if ((var22.field163 & 0x300) != 0) {
                                                    int var23 = var22.field161 - field304;
                                                    int var24 = var22.field160 - field305;
                                                    int var25 = var22.field162 - field306;
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
                                                        int var29 = field312[var26] + var23;
                                                        int var30 = field313[var26] + var25;
                                                        var22.field165.method120(var26 * 512 + 256, field307, field308, field309, field310, var29, var24, var30, var22.field166);
                                                    }
                                                    if ((var22.field163 & 0x200) != 0 && var28 > var27) {
                                                        int var31 = field314[var26] + var23;
                                                        int var32 = field315[var26] + var25;
                                                        var22.field165.method120(var26 * 512 + 1280 & 0x7FF, field307, field308, field309, field310, var31, var24, var32, var22.field166);
                                                    }
                                                }
                                            }
                                            if (var18) {
                                                GroundDecor var33 = var3.field374;
                                                if (var33 != null) {
                                                    var33.field196.method120(0, field307, field308, field309, field310, var33.field194 - field304, var33.field193 - field305, var33.field195 - field306, var33.field197);
                                                }
                                                GroundObject var34 = var3.field375;
                                                if (var34 != null && var34.field206 == 0) {
                                                    if (var34.field203 != null) {
                                                        var34.field203.method120(0, field307, field308, field309, field310, var34.field200 - field304, var34.field199 - field305, var34.field201 - field306, var34.field205);
                                                    }
                                                    if (var34.field204 != null) {
                                                        var34.field204.method120(0, field307, field308, field309, field310, var34.field200 - field304, var34.field199 - field305, var34.field201 - field306, var34.field205);
                                                    }
                                                    if (var34.field202 != null) {
                                                        var34.field202.method120(0, field307, field308, field309, field310, var34.field200 - field304, var34.field199 - field305, var34.field201 - field306, var34.field205);
                                                    }
                                                }
                                            }
                                            int var35 = var3.field379;
                                            if (var35 != 0) {
                                                if (var4 < field302 && (var35 & 0x4) != 0) {
                                                    Tile var36 = var8[var4 + 1][var5];
                                                    if (var36 != null && var36.field382) {
                                                        field326.method247(var36);
                                                    }
                                                }
                                                if (var5 < field303 && (var35 & 0x2) != 0) {
                                                    Tile var37 = var8[var4][var5 + 1];
                                                    if (var37 != null && var37.field382) {
                                                        field326.method247(var37);
                                                    }
                                                }
                                                if (var4 > field302 && (var35 & 0x1) != 0) {
                                                    Tile var38 = var8[var4 - 1][var5];
                                                    if (var38 != null && var38.field382) {
                                                        field326.method247(var38);
                                                    }
                                                }
                                                if (var5 > field303 && (var35 & 0x8) != 0) {
                                                    Tile var39 = var8[var4][var5 - 1];
                                                    if (var39 != null && var39.field382) {
                                                        field326.method247(var39);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var3.field384 != 0) {
                                            boolean var40 = true;
                                            for (int var41 = 0; var41 < var3.field376; var41++) {
                                                if (field297 != var3.field377[var41].field264 && (var3.field378[var41] & var3.field384) == var3.field385) {
                                                    var40 = false;
                                                    break;
                                                }
                                            }
                                            if (var40) {
                                                Wall var42 = var3.field372;
                                                if (!this.method109(var7, var4, var5, var42.field270)) {
                                                    var42.field272.method120(0, field307, field308, field309, field310, var42.field268 - field304, var42.field267 - field305, var42.field269 - field306, var42.field274);
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
                                        label558: for (int var45 = 0; var45 < var43; var45++) {
                                            Location var54 = var3.field377[var45];
                                            if (field297 != var54.field264) {
                                                for (int var55 = var54.field259; var55 <= var54.field260; var55++) {
                                                    for (int var60 = var54.field261; var60 <= var54.field262; var60++) {
                                                        Tile var61 = var8[var55][var60];
                                                        if (var61.field381) {
                                                            var3.field383 = true;
                                                            continue label558;
                                                        }
                                                        if (var61.field384 != 0) {
                                                            int var62 = 0;
                                                            if (var55 > var54.field259) {
                                                                var62++;
                                                            }
                                                            if (var55 < var54.field260) {
                                                                var62 += 4;
                                                            }
                                                            if (var60 > var54.field261) {
                                                                var62 += 8;
                                                            }
                                                            if (var60 < var54.field262) {
                                                                var62 += 2;
                                                            }
                                                            if ((var62 & var61.field384) == var3.field386) {
                                                                var3.field383 = true;
                                                                continue label558;
                                                            }
                                                        }
                                                    }
                                                }
                                                field311[var44++] = var54;
                                                int var56 = field302 - var54.field259;
                                                int var57 = var54.field260 - field302;
                                                if (var57 > var56) {
                                                    var56 = var57;
                                                }
                                                int var58 = field303 - var54.field261;
                                                int var59 = var54.field262 - field303;
                                                if (var59 > var58) {
                                                    var54.field263 = var56 + var59;
                                                } else {
                                                    var54.field263 = var56 + var58;
                                                }
                                            }
                                        }
                                        while (var44 > 0) {
                                            int var46 = -50;
                                            int var47 = -1;
                                            for (int var48 = 0; var48 < var44; var48++) {
                                                Location var53 = field311[var48];
                                                if (var53.field263 > var46 && field297 != var53.field264) {
                                                    var46 = var53.field263;
                                                    var47 = var48;
                                                }
                                            }
                                            if (var47 == -1) {
                                                break;
                                            }
                                            Location var49 = field311[var47];
                                            var49.field264 = field297;
                                            if (!this.method111(var7, var49.field259, var49.field260, var49.field261, var49.field262, var49.field257.field394)) {
                                                var49.field257.method120(var49.field258, field307, field308, field309, field310, var49.field255 - field304, var49.field254 - field305, var49.field256 - field306, var49.field265);
                                            }
                                            for (int var50 = var49.field259; var50 <= var49.field260; var50++) {
                                                for (int var51 = var49.field261; var51 <= var49.field262; var51++) {
                                                    Tile var52 = var8[var50][var51];
                                                    if (var52.field384 != 0) {
                                                        field326.method247(var52);
                                                    } else if ((var4 != var50 || var5 != var51) && var52.field382) {
                                                        field326.method247(var52);
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
                            if (var4 > field302 || var4 <= field298) {
                                break;
                            }
                            var63 = var8[var4 - 1][var5];
                        } while (var63 != null && var63.field382);
                        if (var4 < field302 || var4 >= field299 - 1) {
                            break;
                        }
                        var64 = var8[var4 + 1][var5];
                    } while (var64 != null && var64.field382);
                    if (var5 > field303 || var5 <= field300) {
                        break;
                    }
                    var65 = var8[var4][var5 - 1];
                } while (var65 != null && var65.field382);
                if (var5 < field303 || var5 >= field301 - 1) {
                    break;
                }
                var66 = var8[var4][var5 + 1];
            } while (var66 != null && var66.field382);
            var3.field382 = false;
            field295--;
            GroundObject var67 = var3.field375;
            if (var67 != null && var67.field206 != 0) {
                if (var67.field203 != null) {
                    var67.field203.method120(0, field307, field308, field309, field310, var67.field200 - field304, var67.field199 - field305 - var67.field206, var67.field201 - field306, var67.field205);
                }
                if (var67.field204 != null) {
                    var67.field204.method120(0, field307, field308, field309, field310, var67.field200 - field304, var67.field199 - field305 - var67.field206, var67.field201 - field306, var67.field205);
                }
                if (var67.field202 != null) {
                    var67.field202.method120(0, field307, field308, field309, field310, var67.field200 - field304, var67.field199 - field305 - var67.field206, var67.field201 - field306, var67.field205);
                }
            }
            if (var3.field387 != 0) {
                Decor var68 = var3.field373;
                if (var68 != null && !this.method110(var7, var4, var5, var68.field165.field394)) {
                    if ((var68.field163 & var3.field387) != 0) {
                        var68.field165.method120(var68.field164, field307, field308, field309, field310, var68.field161 - field304, var68.field160 - field305, var68.field162 - field306, var68.field166);
                    } else if ((var68.field163 & 0x300) != 0) {
                        int var69 = var68.field161 - field304;
                        int var70 = var68.field160 - field305;
                        int var71 = var68.field162 - field306;
                        int var72 = var68.field164;
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
                        if ((var68.field163 & 0x100) != 0 && var74 >= var73) {
                            int var75 = field312[var72] + var69;
                            int var76 = field313[var72] + var71;
                            var68.field165.method120(var72 * 512 + 256, field307, field308, field309, field310, var75, var70, var76, var68.field166);
                        }
                        if ((var68.field163 & 0x200) != 0 && var74 <= var73) {
                            int var77 = field314[var72] + var69;
                            int var78 = field315[var72] + var71;
                            var68.field165.method120(var72 * 512 + 1280 & 0x7FF, field307, field308, field309, field310, var77, var70, var78, var68.field166);
                        }
                    }
                }
                Wall var79 = var3.field372;
                if (var79 != null) {
                    if ((var79.field271 & var3.field387) != 0 && !this.method109(var7, var4, var5, var79.field271)) {
                        var79.field273.method120(0, field307, field308, field309, field310, var79.field268 - field304, var79.field267 - field305, var79.field269 - field306, var79.field274);
                    }
                    if ((var79.field270 & var3.field387) != 0 && !this.method109(var7, var4, var5, var79.field270)) {
                        var79.field272.method120(0, field307, field308, field309, field310, var79.field268 - field304, var79.field267 - field305, var79.field269 - field306, var79.field274);
                    }
                }
            }
            if (var6 < this.field286 - 1) {
                Tile var80 = this.field290[var6 + 1][var4][var5];
                if (var80 != null && var80.field382) {
                    field326.method247(var80);
                }
            }
            if (var4 < field302) {
                Tile var81 = var8[var4 + 1][var5];
                if (var81 != null && var81.field382) {
                    field326.method247(var81);
                }
            }
            if (var5 < field303) {
                Tile var82 = var8[var4][var5 + 1];
                if (var82 != null && var82.field382) {
                    field326.method247(var82);
                }
            }
            if (var4 > field302) {
                Tile var83 = var8[var4 - 1][var5];
                if (var83 != null && var83.field382) {
                    field326.method247(var83);
                }
            }
            if (var5 > field303) {
                Tile var84 = var8[var4][var5 - 1];
                if (var84 != null && var84.field382) {
                    field326.method247(var84);
                }
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Lp;IIIIIII)V")
    public void method103(TileUnderlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
        int var45 = (var21 << 9) / var25 + Pix3D.field628;
        int var46 = (var24 << 9) / var25 + Pix3D.field629;
        int var47 = (var27 << 9) / var31 + Pix3D.field628;
        int var48 = (var30 << 9) / var31 + Pix3D.field629;
        int var49 = (var33 << 9) / var37 + Pix3D.field628;
        int var50 = (var36 << 9) / var37 + Pix3D.field629;
        int var51 = (var39 << 9) / var43 + Pix3D.field628;
        int var52 = (var42 << 9) / var43 + Pix3D.field629;
        Pix3D.field627 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            Pix3D.field624 = false;
            if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > Pix2D.field615 || var51 > Pix2D.field615 || var47 > Pix2D.field615) {
                Pix3D.field624 = true;
            }
            if (field316 && this.method106(field317, field318, var50, var52, var48, var49, var51, var47)) {
                field319 = arg6;
                field320 = arg7;
            }
            if (arg0.field250 == -1) {
                if (arg0.field248 != 12345678) {
                    Pix3D.method180(var50, var52, var48, var49, var51, var47, arg0.field248, arg0.field249, arg0.field247);
                }
            } else if (field285) {
                int var53 = field334[arg0.field250];
                Pix3D.method180(var50, var52, var48, var49, var51, var47, this.method105(var53, 9, arg0.field248), this.method105(var53, 9, arg0.field249), this.method105(var53, 9, arg0.field247));
            } else if (arg0.field251) {
                Pix3D.method184(var50, var52, var48, var49, var51, var47, arg0.field248, arg0.field249, arg0.field247, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field250);
            } else {
                Pix3D.method184(var50, var52, var48, var49, var51, var47, arg0.field248, arg0.field249, arg0.field247, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field250);
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        Pix3D.field624 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Pix2D.field615 || var47 > Pix2D.field615 || var51 > Pix2D.field615) {
            Pix3D.field624 = true;
        }
        if (field316 && this.method106(field317, field318, var46, var48, var52, var45, var47, var51)) {
            field319 = arg6;
            field320 = arg7;
        }
        if (arg0.field250 != -1) {
            if (!field285) {
                Pix3D.method184(var46, var48, var52, var45, var47, var51, arg0.field246, arg0.field247, arg0.field249, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field250);
                return;
            }
            int var54 = field334[arg0.field250];
            Pix3D.method180(var46, var48, var52, var45, var47, var51, this.method105(var54, 9, arg0.field246), this.method105(var54, 9, arg0.field247), this.method105(var54, 9, arg0.field249));
        } else if (arg0.field246 != 12345678) {
            Pix3D.method180(var46, var48, var52, var45, var47, var51, arg0.field246, arg0.field247, arg0.field249);
            return;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIILj;III)V")
    public void method104(int arg0, int arg1, int arg2, int arg3, TileOverlay arg4, int arg5, int arg6, int arg7) {
        if (arg3 >= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = arg4.field168.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var24 = arg4.field168[var11] - field304;
            int var25 = arg4.field169[var11] - field305;
            int var26 = arg4.field170[var11] - field306;
            int var27 = arg1 * var26 + arg5 * var24 >> 16;
            int var28 = arg5 * var26 - arg1 * var24 >> 16;
            int var30 = arg7 * var25 - arg6 * var28 >> 16;
            int var31 = arg6 * var25 + arg7 * var28 >> 16;
            if (var31 < 50) {
                return;
            }
            if (arg4.field177 != null) {
                TileOverlay.field185[var11] = var27;
                TileOverlay.field186[var11] = var30;
                TileOverlay.field187[var11] = var31;
            }
            TileOverlay.field183[var11] = (var27 << 9) / var31 + Pix3D.field628;
            TileOverlay.field184[var11] = (var30 << 9) / var31 + Pix3D.field629;
        }
        Pix3D.field627 = 0;
        int var12 = arg4.field174.length;
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg4.field174[var13];
            int var15 = arg4.field175[var13];
            int var16 = arg4.field176[var13];
            int var17 = TileOverlay.field183[var14];
            int var18 = TileOverlay.field183[var15];
            int var19 = TileOverlay.field183[var16];
            int var20 = TileOverlay.field184[var14];
            int var21 = TileOverlay.field184[var15];
            int var22 = TileOverlay.field184[var16];
            if ((var17 - var18) * (var22 - var21) - (var19 - var18) * (var20 - var21) > 0) {
                Pix3D.field624 = false;
                if (var17 < 0 || var18 < 0 || var19 < 0 || var17 > Pix2D.field615 || var18 > Pix2D.field615 || var19 > Pix2D.field615) {
                    Pix3D.field624 = true;
                }
                if (field316 && this.method106(field317, field318, var20, var21, var22, var17, var18, var19)) {
                    field319 = arg2;
                    field320 = arg0;
                }
                if (arg4.field177 == null || arg4.field177[var13] == -1) {
                    if (arg4.field171[var13] != 12345678) {
                        Pix3D.method180(var20, var21, var22, var17, var18, var19, arg4.field171[var13], arg4.field172[var13], arg4.field173[var13]);
                    }
                } else if (field285) {
                    int var23 = field334[arg4.field177[var13]];
                    Pix3D.method180(var20, var21, var22, var17, var18, var19, this.method105(var23, 9, arg4.field171[var13]), this.method105(var23, 9, arg4.field172[var13]), this.method105(var23, 9, arg4.field173[var13]));
                } else if (arg4.field178) {
                    Pix3D.method184(var20, var21, var22, var17, var18, var19, arg4.field171[var13], arg4.field172[var13], arg4.field173[var13], TileOverlay.field185[0], TileOverlay.field185[1], TileOverlay.field185[3], TileOverlay.field186[0], TileOverlay.field186[1], TileOverlay.field186[3], TileOverlay.field187[0], TileOverlay.field187[1], TileOverlay.field187[3], arg4.field177[var13]);
                } else {
                    Pix3D.method184(var20, var21, var22, var17, var18, var19, arg4.field171[var13], arg4.field172[var13], arg4.field173[var13], TileOverlay.field185[var14], TileOverlay.field185[var15], TileOverlay.field185[var16], TileOverlay.field186[var14], TileOverlay.field186[var15], TileOverlay.field186[var16], TileOverlay.field187[var14], TileOverlay.field187[var15], TileOverlay.field187[var16], arg4.field177[var13]);
                }
            }
        }
    }

    @OriginalMember(owner = "s", name = "e", descriptor = "(III)I")
    public int method105(int arg0, int arg1, int arg2) {
        int var4 = 127 - arg2;
        int var5 = (arg0 & 0x7F) * var4 / 160;
        if (arg1 < 9 || arg1 > 9) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (var5 < 2) {
            var5 = 2;
        } else if (var5 > 126) {
            var5 = 126;
        }
        return (arg0 & 0xFF80) + var5;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
    private void method107(int arg0) {
        int var2 = field322[field296];
        Occlude[] var3 = field323[field296];
        field324 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            Occlude var5 = var3[var4];
            if (var5.field228 == 1) {
                int var6 = var5.field224 + 25 - field302;
                if (var6 >= 0 && var6 <= 50) {
                    int var7 = var5.field226 + 25 - field303;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = var5.field227 + 25 - field303;
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
                        int var10 = field304 - var5.field229;
                        if (var10 > 32) {
                            var5.field235 = 1;
                        } else {
                            if (var10 >= -32) {
                                continue;
                            }
                            var5.field235 = 2;
                            var10 = -var10;
                        }
                        var5.field238 = (var5.field231 - field306 << 8) / var10;
                        var5.field239 = (var5.field232 - field306 << 8) / var10;
                        var5.field240 = (var5.field233 - field305 << 8) / var10;
                        var5.field241 = (var5.field234 - field305 << 8) / var10;
                        field325[field324++] = var5;
                    }
                }
            } else if (var5.field228 == 2) {
                int var11 = var5.field226 + 25 - field303;
                if (var11 >= 0 && var11 <= 50) {
                    int var12 = var5.field224 + 25 - field302;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = var5.field225 + 25 - field302;
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
                        int var15 = field306 - var5.field231;
                        if (var15 > 32) {
                            var5.field235 = 3;
                        } else {
                            if (var15 >= -32) {
                                continue;
                            }
                            var5.field235 = 4;
                            var15 = -var15;
                        }
                        var5.field236 = (var5.field229 - field304 << 8) / var15;
                        var5.field237 = (var5.field230 - field304 << 8) / var15;
                        var5.field240 = (var5.field233 - field305 << 8) / var15;
                        var5.field241 = (var5.field234 - field305 << 8) / var15;
                        field325[field324++] = var5;
                    }
                }
            } else if (var5.field228 == 4) {
                int var16 = var5.field233 - field305;
                if (var16 > 128) {
                    int var17 = var5.field226 + 25 - field303;
                    if (var17 < 0) {
                        var17 = 0;
                    }
                    int var18 = var5.field227 + 25 - field303;
                    if (var18 > 50) {
                        var18 = 50;
                    }
                    if (var17 <= var18) {
                        int var19 = var5.field224 + 25 - field302;
                        if (var19 < 0) {
                            var19 = 0;
                        }
                        int var20 = var5.field225 + 25 - field302;
                        if (var20 > 50) {
                            var20 = 50;
                        }
                        boolean var21 = false;
                        label154: for (int var22 = var19; var22 <= var20; var22++) {
                            for (int var23 = var17; var23 <= var18; var23++) {
                                if (field341[var22][var23]) {
                                    var21 = true;
                                    break label154;
                                }
                            }
                        }
                        if (var21) {
                            var5.field235 = 5;
                            var5.field236 = (var5.field229 - field304 << 8) / var16;
                            var5.field237 = (var5.field230 - field304 << 8) / var16;
                            var5.field238 = (var5.field231 - field306 << 8) / var16;
                            var5.field239 = (var5.field232 - field306 << 8) / var16;
                            field325[field324++] = var5;
                        }
                    }
                }
            }
        }
        if (arg0 != -43309) {
            this.field276 = !this.field276;
        }
    }

    @OriginalMember(owner = "s", name = "f", descriptor = "(III)Z")
    private boolean method108(int arg0, int arg1, int arg2) {
        int var4 = this.field294[arg0][arg1][arg2];
        if (-field297 == var4) {
            return false;
        } else if (field297 == var4) {
            return true;
        } else {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            if (this.method112(var5 + 1, this.field289[arg0][arg1][arg2], var6 + 1) && this.method112(var5 + 128 - 1, this.field289[arg0][arg1 + 1][arg2], var6 + 1) && this.method112(var5 + 128 - 1, this.field289[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.method112(var5 + 1, this.field289[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
                this.field294[arg0][arg1][arg2] = field297;
                return true;
            } else {
                this.field294[arg0][arg1][arg2] = -field297;
                return false;
            }
        }
    }

    @OriginalMember(owner = "s", name = "h", descriptor = "(IIII)Z")
    private boolean method109(int arg0, int arg1, int arg2, int arg3) {
        if (!this.method108(arg0, arg1, arg2)) {
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
                    if (!this.method112(var5, var7, var6)) {
                        return false;
                    }
                    if (!this.method112(var5, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method112(var5, var8, var6)) {
                        return false;
                    }
                    if (!this.method112(var5, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method112(var5, var9, var6)) {
                    return false;
                }
                if (!this.method112(var5, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var6 < field306) {
                    if (!this.method112(var5, var7, var6 + 128)) {
                        return false;
                    }
                    if (!this.method112(var5 + 128, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method112(var5, var8, var6 + 128)) {
                        return false;
                    }
                    if (!this.method112(var5 + 128, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method112(var5, var9, var6 + 128)) {
                    return false;
                }
                if (!this.method112(var5 + 128, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var5 < field304) {
                    if (!this.method112(var5 + 128, var7, var6)) {
                        return false;
                    }
                    if (!this.method112(var5 + 128, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method112(var5 + 128, var8, var6)) {
                        return false;
                    }
                    if (!this.method112(var5 + 128, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method112(var5 + 128, var9, var6)) {
                    return false;
                }
                if (!this.method112(var5 + 128, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var6 > field306) {
                    if (!this.method112(var5, var7, var6)) {
                        return false;
                    }
                    if (!this.method112(var5 + 128, var7, var6)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method112(var5, var8, var6)) {
                        return false;
                    }
                    if (!this.method112(var5 + 128, var8, var6)) {
                        return false;
                    }
                }
                if (!this.method112(var5, var9, var6)) {
                    return false;
                }
                if (!this.method112(var5 + 128, var9, var6)) {
                    return false;
                }
                return true;
            }
        }
        if (!this.method112(var5 + 64, var10, var6 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return this.method112(var5, var9, var6 + 128);
        } else if (arg3 == 32) {
            return this.method112(var5 + 128, var9, var6 + 128);
        } else if (arg3 == 64) {
            return this.method112(var5 + 128, var9, var6);
        } else if (arg3 == 128) {
            return this.method112(var5, var9, var6);
        } else {
            System.out.println("Warning unsupported wall type");
            return true;
        }
    }

    @OriginalMember(owner = "s", name = "i", descriptor = "(IIII)Z")
    private boolean method110(int arg0, int arg1, int arg2, int arg3) {
        if (this.method108(arg0, arg1, arg2)) {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            return this.method112(var5 + 1, this.field289[arg0][arg1][arg2] - arg3, var6 + 1) && this.method112(var5 + 128 - 1, this.field289[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method112(var5 + 128 - 1, this.field289[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method112(var5 + 1, this.field289[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "s", name = "b", descriptor = "(IIIIII)Z")
    private boolean method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
            if (!this.method112(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!this.method112(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!this.method112(var10, var12, var14)) {
                return false;
            } else if (this.method112(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (this.method108(arg0, arg1, arg3)) {
            int var7 = arg1 << 7;
            int var8 = arg3 << 7;
            return this.method112(var7 + 1, this.field289[arg0][arg1][arg3] - arg5, var8 + 1) && this.method112(var7 + 128 - 1, this.field289[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.method112(var7 + 128 - 1, this.field289[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.method112(var7 + 1, this.field289[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "s", name = "g", descriptor = "(III)Z")
    private boolean method112(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < field324; var4++) {
            Occlude var5 = field325[var4];
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
