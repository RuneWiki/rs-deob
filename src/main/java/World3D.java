import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("r")
public class World3D {

    @OriginalMember(owner = "r", name = "a", descriptor = "Z")
    private boolean field214 = false;

    @OriginalMember(owner = "r", name = "b", descriptor = "I")
    private int field215 = 1;

    @OriginalMember(owner = "r", name = "c", descriptor = "Z")
    private boolean field216 = false;

    @OriginalMember(owner = "r", name = "d", descriptor = "I")
    private int field217 = 1;

    @OriginalMember(owner = "r", name = "e", descriptor = "B")
    private byte field218 = 8;

    @OriginalMember(owner = "r", name = "f", descriptor = "Z")
    private boolean field219 = true;

    @OriginalMember(owner = "r", name = "g", descriptor = "B")
    private byte field220 = -46;

    @OriginalMember(owner = "r", name = "h", descriptor = "I")
    private int field221 = -43626;

    @OriginalMember(owner = "r", name = "i", descriptor = "Z")
    private boolean field222 = true;

    @OriginalMember(owner = "r", name = "r", descriptor = "[Lp;")
    public Location[] field231 = new Location[5000];

    @OriginalMember(owner = "r", name = "hb", descriptor = "[I")
    public int[] field273 = new int[10000];

    @OriginalMember(owner = "r", name = "ib", descriptor = "[I")
    public int[] field274 = new int[10000];

    @OriginalMember(owner = "r", name = "kb", descriptor = "[[I")
    public int[][] field276 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "r", name = "lb", descriptor = "[[I")
    public int[][] field277 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "r", name = "k", descriptor = "I")
    public int field224;

    @OriginalMember(owner = "r", name = "l", descriptor = "I")
    public int field225;

    @OriginalMember(owner = "r", name = "m", descriptor = "I")
    public int field226;

    @OriginalMember(owner = "r", name = "o", descriptor = "[[[Lcb;")
    public Tile[][][] field228;

    @OriginalMember(owner = "r", name = "s", descriptor = "[[[I")
    public int[][][] field232;

    @OriginalMember(owner = "r", name = "n", descriptor = "[[[I")
    public int[][][] field227;

    @OriginalMember(owner = "r", name = "j", descriptor = "Z")
    public static boolean field223 = true;

    @OriginalMember(owner = "r", name = "J", descriptor = "[Lp;")
    public static Location[] field249 = new Location[100];

    @OriginalMember(owner = "r", name = "K", descriptor = "[I")
    public static final int[] field250 = new int[] { 53, -53, -53, 53 };

    @OriginalMember(owner = "r", name = "L", descriptor = "[I")
    public static final int[] field251 = new int[] { -53, -53, 53, 53 };

    @OriginalMember(owner = "r", name = "M", descriptor = "[I")
    public static final int[] field252 = new int[] { -45, 45, 45, -45 };

    @OriginalMember(owner = "r", name = "N", descriptor = "[I")
    public static final int[] field253 = new int[] { 45, 45, -45, -45 };

    @OriginalMember(owner = "r", name = "R", descriptor = "I")
    public static int field257 = -1;

    @OriginalMember(owner = "r", name = "S", descriptor = "I")
    public static int field258 = -1;

    @OriginalMember(owner = "r", name = "T", descriptor = "I")
    public static int field259 = 4;

    @OriginalMember(owner = "r", name = "U", descriptor = "[I")
    public static int[] field260 = new int[field259];

    @OriginalMember(owner = "r", name = "V", descriptor = "[[Lm;")
    public static Occlude[][] field261 = new Occlude[field259][500];

    @OriginalMember(owner = "r", name = "X", descriptor = "[Lm;")
    public static Occlude[] field263 = new Occlude[500];

    @OriginalMember(owner = "r", name = "Y", descriptor = "Lob;")
    public static LinkList field264 = new LinkList(2);

    @OriginalMember(owner = "r", name = "Z", descriptor = "[I")
    public static final int[] field265 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "r", name = "ab", descriptor = "[I")
    public static final int[] field266 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "r", name = "bb", descriptor = "[I")
    public static final int[] field267 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "r", name = "cb", descriptor = "[I")
    public static final int[] field268 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "r", name = "db", descriptor = "[I")
    public static final int[] field269 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "r", name = "eb", descriptor = "[I")
    public static final int[] field270 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "r", name = "fb", descriptor = "[I")
    public static final int[] field271 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "r", name = "gb", descriptor = "[I")
    public static final int[] field272 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

    @OriginalMember(owner = "r", name = "mb", descriptor = "[[[[Z")
    public static boolean[][][][] field278 = new boolean[8][32][51][51];

    @OriginalMember(owner = "r", name = "p", descriptor = "I")
    public int field229;

    @OriginalMember(owner = "r", name = "q", descriptor = "I")
    public int field230;

    @OriginalMember(owner = "r", name = "t", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "r", name = "u", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "r", name = "v", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "r", name = "w", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "r", name = "x", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "r", name = "y", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "r", name = "z", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "r", name = "A", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "r", name = "B", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "r", name = "C", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "r", name = "D", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "r", name = "E", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "r", name = "F", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "r", name = "G", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "r", name = "H", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "r", name = "I", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "r", name = "P", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "r", name = "Q", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "r", name = "W", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "r", name = "jb", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "r", name = "ob", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "r", name = "pb", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "r", name = "qb", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "r", name = "rb", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "r", name = "sb", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "r", name = "tb", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "r", name = "O", descriptor = "Z")
    public static boolean field254;

    @OriginalMember(owner = "r", name = "nb", descriptor = "[[Z")
    public static boolean[][] field279;

    @OriginalMember(owner = "r", name = "<init>", descriptor = "([[[IZIII)V")
    public World3D(int[][][] arg0, boolean arg1, int arg2, int arg3, int arg4) {
        this.field224 = arg2;
        this.field225 = arg3;
        this.field226 = arg4;
        this.field228 = new Tile[arg2][arg3][arg4];
        if (arg1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field232 = new int[arg2][arg3 + 1][arg4 + 1];
        this.field227 = arg0;
        this.method50(-169);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(B)V")
    public static void method49(byte arg0) {
        field249 = null;
        field260 = null;
        field261 = null;
        field264 = null;
        field278 = null;
        field279 = null;
        if (arg0 == -123) {
            ;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(I)V")
    public void method50(int arg0) {
        for (int var2 = 0; var2 < this.field224; var2++) {
            for (int var7 = 0; var7 < this.field225; var7++) {
                for (int var8 = 0; var8 < this.field226; var8++) {
                    this.field228[var2][var7][var8] = null;
                }
            }
        }
        for (int var3 = 0; var3 < field259; var3++) {
            for (int var6 = 0; var6 < field260[var3]; var6++) {
                field261[var3][var6] = null;
            }
            field260[var3] = 0;
        }
        if (arg0 != -169) {
            this.field222 = !this.field222;
        }
        for (int var4 = 0; var4 < this.field230; var4++) {
            this.field231[var4] = null;
        }
        this.field230 = 0;
        for (int var5 = 0; var5 < field249.length; var5++) {
            field249[var5] = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(II)V")
    public void method51(int arg0, int arg1) {
        this.field229 = arg0;
        for (int var3 = 0; var3 < this.field225; var3++) {
            for (int var4 = 0; var4 < this.field226; var4++) {
                this.field228[arg0][var3][var4] = new Tile(arg0, var3, var4);
            }
        }
        if (arg1 != 5) {
            this.field214 = !this.field214;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIB)V")
    public void method52(int arg0, int arg1, byte arg2) {
        Tile var4 = this.field228[0][arg0][arg1];
        for (int var5 = 0; var5 < 3; var5++) {
            this.field228[var5][arg0][arg1] = this.field228[var5 + 1][arg0][arg1];
            if (this.field228[var5][arg0][arg1] != null) {
                this.field228[var5][arg0][arg1].field417--;
            }
        }
        if (this.field228[0][arg0][arg1] == null) {
            this.field228[0][arg0][arg1] = new Tile(0, arg0, arg1);
        }
        this.field228[0][arg0][arg1].field439 = var4;
        this.field228[3][arg0][arg1] = null;
        if (arg2 == 26) {
            ;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ZIIIIIIII)V")
    public static void method53(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Occlude var9 = new Occlude();
        var9.field161 = arg7 / 128;
        var9.field162 = arg3 / 128;
        var9.field163 = arg2 / 128;
        if (!arg0) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        var9.field164 = arg1 / 128;
        var9.field165 = arg8;
        var9.field166 = arg7;
        var9.field167 = arg3;
        var9.field168 = arg2;
        var9.field169 = arg1;
        var9.field170 = arg5;
        var9.field171 = arg6;
        field261[arg4][field260[arg4]++] = var9;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIII)V")
    public void method54(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field228[arg0][arg1][arg2];
        if (var5 != null) {
            this.field228[arg0][arg1][arg2].field431 = arg3;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public void method55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            TileUnderlay var21 = new TileUnderlay(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var22 = arg0; var22 >= 0; var22--) {
                if (this.field228[var22][arg1][arg2] == null) {
                    this.field228[var22][arg1][arg2] = new Tile(var22, arg1, arg2);
                }
            }
            this.field228[arg0][arg1][arg2].field421 = var21;
        } else if (arg3 == 1) {
            TileUnderlay var23 = new TileUnderlay(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var24 = arg0; var24 >= 0; var24--) {
                if (this.field228[var24][arg1][arg2] == null) {
                    this.field228[var24][arg1][arg2] = new Tile(var24, arg1, arg2);
                }
            }
            this.field228[arg0][arg1][arg2].field421 = var23;
        } else {
            TileOverlay var25 = new TileOverlay(arg7, arg2, arg9, arg10, arg15, arg1, arg17, arg5, arg16, arg13, arg11, arg4, -35, arg12, arg19, arg6, arg18, arg3, arg8, arg14);
            for (int var26 = arg0; var26 >= 0; var26--) {
                if (this.field228[var26][arg1][arg2] == null) {
                    this.field228[var26][arg1][arg2] = new Tile(var26, arg1, arg2);
                }
            }
            this.field228[arg0][arg1][arg2].field422 = var25;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IILeb;IBIII)V")
    public void method56(int arg0, int arg1, Model arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        GroundDecor var9 = new GroundDecor();
        var9.field134 = arg2;
        var9.field132 = arg1 * 128 + 64;
        var9.field133 = arg7 * 128 + 64;
        var9.field131 = arg5;
        if (arg6 < this.field217 || arg6 > this.field217) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        var9.field135 = arg0;
        var9.field136 = arg4;
        if (this.field228[arg3][arg1][arg7] == null) {
            this.field228[arg3][arg1][arg7] = new Tile(arg3, arg1, arg7);
        }
        this.field228[arg3][arg1][arg7].field425 = var9;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IILeb;Leb;Leb;IIII)V")
    public void method57(int arg0, int arg1, Model arg2, Model arg3, Model arg4, int arg5, int arg6, int arg7, int arg8) {
        GroundObject var10 = new GroundObject();
        var10.field140 = arg4;
        var10.field138 = arg1 * 128 + 64;
        var10.field139 = arg7 * 128 + 64;
        var10.field137 = arg8;
        var10.field143 = arg0;
        if (arg6 != 4) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        var10.field141 = arg3;
        var10.field142 = arg2;
        int var12 = 0;
        Tile var13 = this.field228[arg5][arg1][arg7];
        if (var13 != null) {
            for (int var14 = 0; var14 < var13.field427; var14++) {
                int var15 = var13.field428[var14].field194.field475;
                if (var15 > var12) {
                    var12 = var15;
                }
            }
        }
        var10.field144 = var12;
        if (this.field228[arg5][arg1][arg7] == null) {
            this.field228[arg5][arg1][arg7] = new Tile(arg5, arg1, arg7);
        }
        this.field228[arg5][arg1][arg7].field426 = var10;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Leb;IIIIIIIBILeb;)V")
    public void method58(Model arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, Model arg10) {
        if (arg10 == null && arg0 == null) {
            return;
        }
        Wall var12 = new Wall();
        var12.field212 = arg6;
        var12.field213 = arg8;
        var12.field206 = arg4 * 128 + 64;
        var12.field207 = arg2 * 128 + 64;
        var12.field205 = arg9;
        var12.field210 = arg10;
        var12.field211 = arg0;
        if (arg5 != 0) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        var12.field208 = arg3;
        var12.field209 = arg1;
        for (int var14 = arg7; var14 >= 0; var14--) {
            if (this.field228[var14][arg4][arg2] == null) {
                this.field228[var14][arg4][arg2] = new Tile(var14, arg4, arg2);
            }
        }
        this.field228[arg7][arg4][arg2].field423 = var12;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(BLeb;BIIIIIIIII)V")
    public void method59(byte arg0, Model arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg1 == null) {
            return;
        }
        Decor var13 = new Decor();
        var13.field104 = arg10;
        if (arg2 != 45) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        var13.field105 = arg0;
        var13.field99 = arg5 * 128 + arg6 + 64;
        var13.field100 = arg9 * 128 + arg8 + 64;
        var13.field98 = arg7;
        var13.field103 = arg1;
        var13.field101 = arg3;
        var13.field102 = arg4;
        for (int var15 = arg11; var15 >= 0; var15--) {
            if (this.field228[var15][arg5][arg9] == null) {
                this.field228[var15][arg5][arg9] = new Tile(var15, arg5, arg9);
            }
        }
        this.field228[arg11][arg5][arg9].field424 = var13;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIBLeb;Lw;IIIIIII)Z")
    public boolean method60(int arg0, int arg1, byte arg2, Model arg3, Entity arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg3 == null && arg4 == null) {
            return true;
        }
        int var13 = arg0 * 128 + arg5 * 64;
        int var14 = arg7 * 64 + arg10 * 128;
        if (arg8 != -16736) {
            throw new NullPointerException();
        }
        return this.method63(arg9, arg0, arg10, arg5, arg7, var13, var14, arg11, arg3, arg4, arg6, false, arg1, arg2);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIILw;Leb;IZ)Z")
    public boolean method61(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Entity arg7, Model arg8, int arg9, boolean arg10) {
        if (arg8 == null && arg7 == null) {
            return true;
        }
        int var12 = arg2 - arg0;
        int var13 = arg9 - arg0;
        int var14 = arg0 + arg2;
        int var15 = arg0 + arg9;
        if (arg10) {
            if (arg1 > 640 && arg1 < 1408) {
                var15 += 128;
            }
            if (arg1 > 1152 && arg1 < 1920) {
                var14 += 128;
            }
            if (arg1 > 1664 || arg1 < 384) {
                var13 -= 128;
            }
            if (arg1 > 128 && arg1 < 896) {
                var12 -= 128;
            }
        }
        int var16 = var12 / 128;
        if (arg4 != -2146) {
            this.field217 = 47;
        }
        int var17 = var13 / 128;
        int var18 = var14 / 128;
        int var19 = var15 / 128;
        return this.method63(arg6, var16, var17, var18 + 1 - var16, var19 - var17 + 1, arg2, arg9, arg3, arg8, arg7, arg1, true, arg5, (byte) 0);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIILeb;IILw;IIII)Z")
    public boolean method62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Model arg6, int arg7, int arg8, Entity arg9, int arg10, int arg11, int arg12, int arg13) {
        if (arg2 != 5) {
            throw new NullPointerException();
        }
        return arg6 == null && arg9 == null ? true : this.method63(arg10, arg7, arg0, arg8 + 1 - arg7, arg1 - arg0 + 1, arg12, arg4, arg3, arg6, arg9, arg13, true, arg5, (byte) 0);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIILeb;Lw;IZIB)Z")
    public boolean method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Model arg8, Entity arg9, int arg10, boolean arg11, int arg12, byte arg13) {
        if (arg8 == null && arg9 == null) {
            return false;
        }
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var22 = arg2; var22 < arg2 + arg4; var22++) {
                if (var15 < 0 || var22 < 0 || var15 >= this.field225 || var22 >= this.field226) {
                    return false;
                }
                Tile var23 = this.field228[arg0][var15][var22];
                if (var23 != null && var23.field427 >= 5) {
                    return false;
                }
            }
        }
        Location var16 = new Location();
        var16.field203 = arg12;
        var16.field204 = arg13;
        var16.field190 = arg0;
        var16.field192 = arg5;
        var16.field193 = arg6;
        var16.field191 = arg7;
        var16.field194 = arg8;
        var16.field195 = arg9;
        var16.field196 = arg10;
        var16.field197 = arg1;
        var16.field199 = arg2;
        var16.field198 = arg1 + arg3 - 1;
        var16.field200 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var18 = arg2; var18 < arg2 + arg4; var18++) {
                int var19 = 0;
                if (var17 > arg1) {
                    var19++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var19 += 4;
                }
                if (var18 > arg2) {
                    var19 += 8;
                }
                if (var18 < arg2 + arg4 - 1) {
                    var19 += 2;
                }
                for (int var20 = arg0; var20 >= 0; var20--) {
                    if (this.field228[var20][var17][var18] == null) {
                        this.field228[var20][var17][var18] = new Tile(var20, var17, var18);
                    }
                }
                Tile var21 = this.field228[arg0][var17][var18];
                var21.field428[var21.field427] = var16;
                var21.field429[var21.field427] = var19;
                var21.field430 |= var19;
                var21.field427++;
            }
        }
        if (arg11) {
            this.field231[this.field230++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(I)V")
    public void method64(int arg0) {
        if (arg0 != 8) {
            return;
        }
        for (int var2 = 0; var2 < this.field230; var2++) {
            Location var3 = this.field231[var2];
            this.method65(this.field218, var3);
            this.field231[var2] = null;
        }
        this.field230 = 0;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(BLp;)V")
    private void method65(byte arg0, Location arg1) {
        for (int var3 = arg1.field197; var3 <= arg1.field198; var3++) {
            for (int var4 = arg1.field199; var4 <= arg1.field200; var4++) {
                Tile var5 = this.field228[arg1.field190][var3][var4];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field427; var6++) {
                        if (var5.field428[var6] == arg1) {
                            var5.field427--;
                            for (int var7 = var6; var7 < var5.field427; var7++) {
                                var5.field428[var7] = var5.field428[var7 + 1];
                                var5.field429[var7] = var5.field429[var7 + 1];
                            }
                            var5.field428[var5.field427] = null;
                            break;
                        }
                    }
                    var5.field430 = 0;
                    for (int var8 = 0; var8 < var5.field427; var8++) {
                        var5.field430 |= var5.field429[var8];
                    }
                }
            }
        }
        if (arg0 == 8) {
            ;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILeb;III)V")
    public void method66(int arg0, Model arg1, int arg2, int arg3, int arg4) {
        if (arg1 == null) {
            return;
        }
        Tile var6 = this.field228[arg0][arg2][arg3];
        if (var6 == null) {
            return;
        }
        for (int var7 = 0; var7 < var6.field427; var7++) {
            Location var8 = var6.field428[var7];
            if ((var8.field203 >> 29 & 0x3) == 2) {
                var8.field194 = arg1;
                return;
            }
        }
        if (arg4 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIB)V")
    public void method67(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        Tile var6 = this.field228[arg2][arg3][arg1];
        if (var6 == null) {
            return;
        }
        Decor var7 = var6.field424;
        if (var7 == null) {
            return;
        }
        int var8 = arg3 * 128 + 64;
        int var9 = arg1 * 128 + 64;
        var7.field99 = (var7.field99 - var8) * arg0 / 16 + var8;
        if (arg4 == 4) {
            boolean var10 = false;
        } else {
            this.field217 = 496;
        }
        var7.field100 = (var7.field100 - var9) * arg0 / 16 + var9;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IILeb;II)V")
    public void method68(int arg0, int arg1, Model arg2, int arg3, int arg4) {
        if (arg2 == null) {
            return;
        }
        Tile var6 = this.field228[arg4][arg0][arg3];
        if (var6 == null) {
            return;
        }
        Decor var7 = var6.field424;
        if (arg1 != -18674) {
            this.field221 = 86;
        }
        if (var7 != null) {
            var7.field103 = arg2;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIILeb;Z)V")
    public void method69(int arg0, int arg1, int arg2, Model arg3, boolean arg4) {
        if (arg3 == null) {
            return;
        }
        Tile var6 = this.field228[arg2][arg1][arg0];
        if (var6 == null) {
            return;
        }
        GroundDecor var7 = var6.field425;
        if (!arg4) {
            this.field217 = -84;
        }
        if (var7 != null) {
            var7.field134 = arg3;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIILeb;I)V")
    public void method70(int arg0, int arg1, int arg2, Model arg3, int arg4) {
        if (arg3 == null) {
            return;
        }
        Tile var6 = this.field228[arg4][arg2][arg1];
        if (var6 == null) {
            return;
        }
        Wall var7 = var6.field423;
        if (arg0 < 7 || arg0 > 7) {
            this.field214 = !this.field214;
        }
        if (var7 != null) {
            var7.field210 = arg3;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IILeb;IILeb;)V")
    public void method71(int arg0, int arg1, Model arg2, int arg3, int arg4, Model arg5) {
        if (arg2 == null) {
            return;
        }
        Tile var7 = this.field228[arg4][arg0][arg1];
        if (var7 == null) {
            return;
        }
        Wall var8 = var7.field423;
        if (var8 != null) {
            var8.field210 = arg2;
            if (arg3 == -25867) {
                var8.field211 = arg5;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ZIII)V")
    public void method72(boolean arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field228[arg1][arg3][arg2];
        if (var5 != null) {
            var5.field423 = null;
            if (!arg0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIZ)V")
    public void method73(int arg0, int arg1, int arg2, boolean arg3) {
        Tile var5 = this.field228[arg1][arg2][arg0];
        if (var5 != null) {
            var5.field424 = null;
            if (!arg3) {
                this.field214 = !this.field214;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(BIII)V")
    public void method74(byte arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field228[arg1][arg2][arg3];
        if (var5 == null) {
            return;
        }
        for (int var6 = 0; var6 < var5.field427; var6++) {
            Location var8 = var5.field428[var6];
            if ((var8.field203 >> 29 & 0x3) == 2 && var8.field197 == arg2 && var8.field199 == arg3) {
                this.method65(this.field218, var8);
                return;
            }
        }
        if (arg0 != 83) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IBII)V")
    public void method75(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -63) {
            this.field216 = !this.field216;
        }
        Tile var5 = this.field228[arg0][arg2][arg3];
        if (var5 != null) {
            var5.field425 = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(III)V")
    public void method76(int arg0, int arg1, int arg2) {
        Tile var4 = this.field228[arg0][arg1][arg2];
        if (var4 != null) {
            var4.field426 = null;
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(III)I")
    public int method77(int arg0, int arg1, int arg2) {
        Tile var4 = this.field228[arg0][arg1][arg2];
        return var4 == null || var4.field423 == null ? 0 : var4.field423.field212;
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIII)I")
    public int method78(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field228[arg0][arg3][arg2];
        if (arg1 == 0) {
            return var5 == null || var5.field424 == null ? 0 : var5.field424.field104;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(III)I")
    public int method79(int arg0, int arg1, int arg2) {
        Tile var4 = this.field228[arg0][arg1][arg2];
        if (var4 == null) {
            return 0;
        }
        for (int var5 = 0; var5 < var4.field427; var5++) {
            Location var6 = var4.field428[var5];
            if ((var6.field203 >> 29 & 0x3) == 2 && var6.field197 == arg1 && var6.field199 == arg2) {
                return var6.field203;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "r", name = "d", descriptor = "(III)I")
    public int method80(int arg0, int arg1, int arg2) {
        Tile var4 = this.field228[arg0][arg1][arg2];
        return var4 == null || var4.field425 == null ? 0 : var4.field425.field135;
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(IIII)I")
    public int method81(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field228[arg0][arg1][arg2];
        if (var5 == null) {
            return -1;
        } else if (var5.field423 != null && var5.field423.field212 == arg3) {
            return var5.field423.field213 & 0xFF;
        } else if (var5.field424 != null && var5.field424.field104 == arg3) {
            return var5.field424.field105 & 0xFF;
        } else if (var5.field425 != null && var5.field425.field135 == arg3) {
            return var5.field425.field136 & 0xFF;
        } else {
            for (int var6 = 0; var6 < var5.field427; var6++) {
                if (var5.field428[var6].field203 == arg3) {
                    return var5.field428[var6].field204 & 0xFF;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIZI)V")
    public void method82(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = (int) Math.sqrt((double) (arg3 * arg3 + arg1 * arg1 + arg5 * arg5));
        int var8 = arg0 * var7 >> 8;
        if (!arg4) {
            this.field217 = 127;
        }
        for (int var9 = 0; var9 < this.field224; var9++) {
            for (int var10 = 0; var10 < this.field225; var10++) {
                for (int var11 = 0; var11 < this.field226; var11++) {
                    Tile var12 = this.field228[var9][var10][var11];
                    if (var12 != null) {
                        Wall var13 = var12.field423;
                        if (var13 != null && var13.field210 != null && var13.field210.field481 != null) {
                            this.method84(1, var9, var11, var13.field210, var10, 1, -207);
                            if (var13.field211 != null && var13.field211.field481 != null) {
                                this.method84(1, var9, var11, var13.field211, var10, 1, -207);
                                this.method85(var13.field210, var13.field211, 0, 0, 0, false);
                                var13.field211.method137(arg2, var8, arg5, arg1, arg3);
                            }
                            var13.field210.method137(arg2, var8, arg5, arg1, arg3);
                        }
                        for (int var14 = 0; var14 < var12.field427; var14++) {
                            Location var16 = var12.field428[var14];
                            if (var16 != null && var16.field194 != null && var16.field194.field481 != null) {
                                this.method84(var16.field198 + 1 - var16.field197, var9, var11, var16.field194, var10, var16.field200 + 1 - var16.field199, -207);
                                var16.field194.method137(arg2, var8, arg5, arg1, arg3);
                            }
                        }
                        GroundDecor var15 = var12.field425;
                        if (var15 != null && var15.field134.field481 != null) {
                            this.method83(var10, var9, var15.field134, var11, (byte) -46);
                            var15.field134.method137(arg2, var8, arg5, arg1, arg3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IILeb;IB)V")
    private void method83(int arg0, int arg1, Model arg2, int arg3, byte arg4) {
        if (this.field220 != arg4) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg0 < this.field225) {
            Tile var7 = this.field228[arg1][arg0 + 1][arg3];
            if (var7 != null && var7.field425 != null && var7.field425.field134.field481 != null) {
                this.method85(arg2, var7.field425.field134, 128, 0, 0, true);
            }
        }
        if (arg3 < this.field225) {
            Tile var8 = this.field228[arg1][arg0][arg3 + 1];
            if (var8 != null && var8.field425 != null && var8.field425.field134.field481 != null) {
                this.method85(arg2, var8.field425.field134, 0, 0, 128, true);
            }
        }
        if (arg0 < this.field225 && arg3 < this.field226) {
            Tile var9 = this.field228[arg1][arg0 + 1][arg3 + 1];
            if (var9 != null && var9.field425 != null && var9.field425.field134.field481 != null) {
                this.method85(arg2, var9.field425.field134, 128, 0, 128, true);
            }
        }
        if (arg0 >= this.field225 || arg3 <= 0) {
            return;
        }
        Tile var10 = this.field228[arg1][arg0 + 1][arg3 - 1];
        if (var10 != null && var10.field425 != null && var10.field425.field134.field481 != null) {
            this.method85(arg2, var10.field425.field134, 128, 0, -128, true);
            return;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIILeb;III)V")
    private void method84(int arg0, int arg1, int arg2, Model arg3, int arg4, int arg5, int arg6) {
        boolean var8 = true;
        int var9 = arg4;
        int var10 = arg0 + arg4;
        int var11 = arg2 - 1;
        int var12 = arg2 + arg5;
        while (arg6 >= 0) {
            for (int var23 = 1; var23 > 0; var23++) {
            }
        }
        for (int var13 = arg1; var13 <= arg1 + 1; var13++) {
            if (this.field224 != var13) {
                for (int var14 = var9; var14 <= var10; var14++) {
                    if (var14 >= 0 && var14 < this.field225) {
                        for (int var15 = var11; var15 <= var12; var15++) {
                            if (var15 >= 0 && var15 < this.field226 && (!var8 || var14 >= var10 || var15 >= var12 || var15 < arg2 && arg4 != var14)) {
                                Tile var16 = this.field228[var13][var14][var15];
                                if (var16 != null) {
                                    int var17 = (this.field227[var13][var14 + 1][var15] + this.field227[var13][var14][var15] + this.field227[var13][var14][var15 + 1] + this.field227[var13][var14 + 1][var15 + 1]) / 4 - (this.field227[arg1][arg4 + 1][arg2] + this.field227[arg1][arg4][arg2] + this.field227[arg1][arg4][arg2 + 1] + this.field227[arg1][arg4 + 1][arg2 + 1]) / 4;
                                    Wall var18 = var16.field423;
                                    if (var18 != null && var18.field210 != null && var18.field210.field481 != null) {
                                        this.method85(arg3, var18.field210, (1 - arg0) * 64 + (var14 - arg4) * 128, var17, (var15 - arg2) * 128 + (1 - arg5) * 64, var8);
                                    }
                                    if (var18 != null && var18.field211 != null && var18.field211.field481 != null) {
                                        this.method85(arg3, var18.field211, (1 - arg0) * 64 + (var14 - arg4) * 128, var17, (var15 - arg2) * 128 + (1 - arg5) * 64, var8);
                                    }
                                    for (int var19 = 0; var19 < var16.field427; var19++) {
                                        Location var20 = var16.field428[var19];
                                        if (var20 != null && var20.field194 != null && var20.field194.field481 != null) {
                                            int var21 = var20.field198 + 1 - var20.field197;
                                            int var22 = var20.field200 + 1 - var20.field199;
                                            this.method85(arg3, var20.field194, (var20.field197 - arg4) * 128 + (var21 - arg0) * 64, var17, (var20.field199 - arg2) * 128 + (var22 - arg5) * 64, var8);
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
    private void method85(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field275++;
        int var7 = 0;
        int[] var8 = arg1.field447;
        int var9 = arg1.field446;
        for (int var10 = 0; var10 < arg0.field446; var10++) {
            VertexNormal var13 = arg0.field481[var10];
            VertexNormal var14 = arg0.field482[var10];
            if (var14.field182 != 0) {
                int var15 = arg0.field448[var10] - arg3;
                if (var15 <= arg1.field472) {
                    int var16 = arg0.field447[var10] - arg2;
                    if (var16 >= arg1.field466 && var16 <= arg1.field467) {
                        int var17 = arg0.field449[var10] - arg4;
                        if (var17 >= arg1.field469 && var17 <= arg1.field468) {
                            for (int var18 = 0; var18 < var9; var18++) {
                                VertexNormal var19 = arg1.field481[var18];
                                VertexNormal var20 = arg1.field482[var18];
                                if (var8[var18] == var16 && arg1.field449[var18] == var17 && arg1.field448[var18] == var15 && var20.field182 != 0) {
                                    var13.field179 += var20.field179;
                                    var13.field180 += var20.field180;
                                    var13.field181 += var20.field181;
                                    var13.field182 += var20.field182;
                                    var19.field179 += var14.field179;
                                    var19.field180 += var14.field180;
                                    var19.field181 += var14.field181;
                                    var19.field182 += var14.field182;
                                    var7++;
                                    this.field273[var10] = this.field275;
                                    this.field274[var18] = this.field275;
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
        for (int var11 = 0; var11 < arg0.field450; var11++) {
            if (this.field273[arg0.field451[var11]] == this.field275 && this.field273[arg0.field452[var11]] == this.field275 && this.field273[arg0.field453[var11]] == this.field275) {
                arg0.field457[var11] = -1;
            }
        }
        for (int var12 = 0; var12 < arg1.field450; var12++) {
            if (this.field274[arg1.field451[var12]] == this.field275 && this.field274[arg1.field452[var12]] == this.field275 && this.field274[arg1.field453[var12]] == this.field275) {
                arg1.field457[var12] = -1;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "([IIIIII)V")
    public void method86(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Tile var7 = this.field228[arg3][arg4][arg5];
        if (var7 == null) {
            return;
        }
        TileUnderlay var8 = var7.field421;
        if (var8 != null) {
            int var9 = var8.field189;
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
        TileOverlay var11 = var7.field422;
        if (var11 == null) {
            return;
        }
        int var12 = var11.field117;
        int var13 = var11.field118;
        int var14 = var11.field119;
        int var15 = var11.field120;
        int[] var16 = this.field276[var12];
        int[] var17 = this.field277[var13];
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

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIII[I)V")
    public static void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        field282 = 0;
        field283 = 0;
        field284 = arg2;
        if (arg3 != -39672) {
            return;
        }
        field285 = arg0;
        field280 = arg2 / 2;
        field281 = arg0 / 2;
        boolean[][][][] var6 = new boolean[9][32][53][53];
        for (int var7 = 128; var7 <= 384; var7 += 32) {
            for (int var15 = 0; var15 < 2048; var15 += 64) {
                field245 = Model.field524[var7];
                field246 = Model.field525[var7];
                field247 = Model.field524[var15];
                field248 = Model.field525[var15];
                int var16 = (var7 - 128) / 32;
                int var17 = var15 / 64;
                for (int var18 = -26; var18 <= 26; var18++) {
                    for (int var19 = -26; var19 <= 26; var19++) {
                        int var20 = var18 * 128;
                        int var21 = var19 * 128;
                        boolean var22 = false;
                        for (int var23 = -arg4; var23 <= arg1; var23 += 128) {
                            if (method88(arg5[var16] + var23, 0, var21, var20)) {
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
                        field278[var8][var9][var10 + 25][var11 + 25] = var12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "d", descriptor = "(IIII)Z")
    public static boolean method88(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field248 * arg3 + field247 * arg2 >> 16;
        int var5 = field248 * arg2 - field247 * arg3 >> 16;
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        int var6 = field246 * var5 + field245 * arg0 >> 16;
        int var7 = field246 * arg0 - field245 * var5 >> 16;
        if (var6 >= 50 && var6 <= 3500) {
            int var8 = (var4 << 9) / var6 + field280;
            int var9 = (var7 << 9) / var6 + field281;
            return var8 >= field282 && var8 <= field284 && var9 >= field283 && var9 <= field285;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIB)V")
    public void method89(int arg0, int arg1, byte arg2) {
        field254 = true;
        if (arg2 != 7) {
            this.field222 = !this.field222;
        }
        field255 = arg1;
        field256 = arg0;
        field257 = -1;
        field258 = -1;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIII)V")
    public void method90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 < 0) {
            arg4 = 0;
        } else if (arg4 >= this.field225 * 128) {
            arg4 = this.field225 * 128 - 1;
        }
        if (arg5 < 0) {
            arg5 = 0;
        } else if (arg5 >= this.field226 * 128) {
            arg5 = this.field226 * 128 - 1;
        }
        field235++;
        field245 = Model.field524[arg2];
        field246 = Model.field525[arg2];
        field247 = Model.field524[arg6];
        field248 = Model.field525[arg6];
        field279 = field278[(arg2 - 128) / 32][arg6 / 64];
        field242 = arg4;
        field243 = arg1;
        field244 = arg5;
        field240 = arg4 / 128;
        field241 = arg5 / 128;
        field234 = arg3;
        field236 = field240 - 25;
        if (field236 < 0) {
            field236 = 0;
        }
        field238 = field241 - 25;
        if (field238 < 0) {
            field238 = 0;
        }
        field237 = field240 + 25;
        if (arg0 != 0) {
            this.field221 = 175;
        }
        if (field237 > this.field225) {
            field237 = this.field225;
        }
        field239 = field241 + 25;
        if (field239 > this.field226) {
            field239 = this.field226;
        }
        this.method96(0);
        field233 = 0;
        for (int var8 = this.field229; var8 < this.field224; var8++) {
            Tile[][] var33 = this.field228[var8];
            for (int var34 = field236; var34 < field237; var34++) {
                for (int var35 = field238; var35 < field239; var35++) {
                    Tile var36 = var33[var34][var35];
                    if (var36 != null) {
                        if (var36.field431 <= arg3 && (field279[var34 + 25 - field240][var35 + 25 - field241] || this.field227[var8][var34][var35] - arg1 >= 2000)) {
                            var36.field432 = true;
                            var36.field433 = true;
                            if (var36.field427 > 0) {
                                var36.field434 = true;
                            } else {
                                var36.field434 = false;
                            }
                            field233++;
                        } else {
                            var36.field432 = false;
                            var36.field433 = false;
                            var36.field435 = 0;
                        }
                    }
                }
            }
        }
        for (int var9 = this.field229; var9 < this.field224; var9++) {
            Tile[][] var22 = this.field228[var9];
            for (int var23 = -25; var23 <= 0; var23++) {
                int var24 = field240 + var23;
                int var25 = field240 - var23;
                if (var24 >= field236 || var25 < field237) {
                    for (int var26 = -25; var26 <= 0; var26++) {
                        int var27 = field241 + var26;
                        int var28 = field241 - var26;
                        if (var24 >= field236) {
                            if (var27 >= field238) {
                                Tile var29 = var22[var24][var27];
                                if (var29 != null && var29.field432) {
                                    this.method91(var29, true);
                                }
                            }
                            if (var28 < field239) {
                                Tile var30 = var22[var24][var28];
                                if (var30 != null && var30.field432) {
                                    this.method91(var30, true);
                                }
                            }
                        }
                        if (var25 < field237) {
                            if (var27 >= field238) {
                                Tile var31 = var22[var25][var27];
                                if (var31 != null && var31.field432) {
                                    this.method91(var31, true);
                                }
                            }
                            if (var28 < field239) {
                                Tile var32 = var22[var25][var28];
                                if (var32 != null && var32.field432) {
                                    this.method91(var32, true);
                                }
                            }
                        }
                        if (field233 == 0) {
                            field254 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var10 = this.field229; var10 < this.field224; var10++) {
            Tile[][] var11 = this.field228[var10];
            for (int var12 = -25; var12 <= 0; var12++) {
                int var13 = field240 + var12;
                int var14 = field240 - var12;
                if (var13 >= field236 || var14 < field237) {
                    for (int var15 = -25; var15 <= 0; var15++) {
                        int var16 = field241 + var15;
                        int var17 = field241 - var15;
                        if (var13 >= field236) {
                            if (var16 >= field238) {
                                Tile var18 = var11[var13][var16];
                                if (var18 != null && var18.field432) {
                                    this.method91(var18, false);
                                }
                            }
                            if (var17 < field239) {
                                Tile var19 = var11[var13][var17];
                                if (var19 != null && var19.field432) {
                                    this.method91(var19, false);
                                }
                            }
                        }
                        if (var14 < field237) {
                            if (var16 >= field238) {
                                Tile var20 = var11[var14][var16];
                                if (var20 != null && var20.field432) {
                                    this.method91(var20, false);
                                }
                            }
                            if (var17 < field239) {
                                Tile var21 = var11[var14][var17];
                                if (var21 != null && var21.field432) {
                                    this.method91(var21, false);
                                }
                            }
                        }
                        if (field233 == 0) {
                            field254 = false;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lcb;Z)V")
    public void method91(Tile arg0, boolean arg1) {
        field264.method225(arg0);
        while (true) {
            Tile var3;
            int var4;
            int var5;
            int var6;
            int var7;
            Tile[][] var8;
            Tile var68;
            do {
                Tile var67;
                do {
                    Tile var66;
                    do {
                        Tile var65;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var3 = (Tile) field264.method227();
                                                if (var3 == null) {
                                                    return;
                                                }
                                            } while (!var3.field433);
                                            var4 = var3.field418;
                                            var5 = var3.field419;
                                            var6 = var3.field417;
                                            var7 = var3.field420;
                                            var8 = this.field228[var6];
                                            if (!var3.field432) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var6 > 0) {
                                                    Tile var9 = this.field228[var6 - 1][var4][var5];
                                                    if (var9 != null && var9.field433) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= field240 && var4 > field236) {
                                                    Tile var10 = var8[var4 - 1][var5];
                                                    if (var10 != null && var10.field433 && (var10.field432 || (var3.field430 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= field240 && var4 < field237 - 1) {
                                                    Tile var11 = var8[var4 + 1][var5];
                                                    if (var11 != null && var11.field433 && (var11.field432 || (var3.field430 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 <= field241 && var5 > field238) {
                                                    Tile var12 = var8[var4][var5 - 1];
                                                    if (var12 != null && var12.field433 && (var12.field432 || (var3.field430 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 >= field241 && var5 < field239 - 1) {
                                                    Tile var13 = var8[var4][var5 + 1];
                                                    if (var13 != null && var13.field433 && (var13.field432 || (var3.field430 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var3.field432 = false;
                                            if (var3.field439 != null) {
                                                Tile var14 = var3.field439;
                                                if (var14.field421 == null) {
                                                    if (var14.field422 != null && !this.method97(0, var4, var5)) {
                                                        this.method93(var4, var14.field422, field246, (byte) -66, field245, var5, field247, field248);
                                                    }
                                                } else if (!this.method97(0, var4, var5)) {
                                                    this.method92(var14.field421, 0, field245, field246, field247, field248, var4, var5);
                                                }
                                                Wall var15 = var14.field423;
                                                if (var15 != null) {
                                                    var15.field210.method140(0, field245, field246, field247, field248, var15.field206 - field242, var15.field205 - field243, var15.field207 - field244, var15.field212);
                                                }
                                                for (int var16 = 0; var16 < var14.field427; var16++) {
                                                    Location var17 = var14.field428[var16];
                                                    if (var17 != null) {
                                                        Model var18 = var17.field194;
                                                        if (var18 == null) {
                                                            var18 = var17.field195.method108(this.field215);
                                                        }
                                                        var18.method140(var17.field196, field245, field246, field247, field248, var17.field192 - field242, var17.field191 - field243, var17.field193 - field244, var17.field203);
                                                    }
                                                }
                                            }
                                            boolean var19 = false;
                                            if (var3.field421 == null) {
                                                if (var3.field422 != null && !this.method97(var7, var4, var5)) {
                                                    var19 = true;
                                                    this.method93(var4, var3.field422, field246, (byte) -66, field245, var5, field247, field248);
                                                }
                                            } else if (!this.method97(var7, var4, var5)) {
                                                var19 = true;
                                                this.method92(var3.field421, var7, field245, field246, field247, field248, var4, var5);
                                            }
                                            int var20 = 0;
                                            int var21 = 0;
                                            Wall var22 = var3.field423;
                                            Decor var23 = var3.field424;
                                            if (var22 != null || var23 != null) {
                                                if (field240 == var4) {
                                                    var20++;
                                                } else if (field240 < var4) {
                                                    var20 += 2;
                                                }
                                                if (field241 == var5) {
                                                    var20 += 3;
                                                } else if (field241 > var5) {
                                                    var20 += 6;
                                                }
                                                var21 = field265[var20];
                                                var3.field438 = field267[var20];
                                            }
                                            if (var22 != null) {
                                                if ((var22.field208 & field266[var20]) == 0) {
                                                    var3.field435 = 0;
                                                } else if (var22.field208 == 16) {
                                                    var3.field435 = 3;
                                                    var3.field436 = field268[var20];
                                                    var3.field437 = 3 - var3.field436;
                                                } else if (var22.field208 == 32) {
                                                    var3.field435 = 6;
                                                    var3.field436 = field269[var20];
                                                    var3.field437 = 6 - var3.field436;
                                                } else if (var22.field208 == 64) {
                                                    var3.field435 = 12;
                                                    var3.field436 = field270[var20];
                                                    var3.field437 = 12 - var3.field436;
                                                } else {
                                                    var3.field435 = 9;
                                                    var3.field436 = field271[var20];
                                                    var3.field437 = 9 - var3.field436;
                                                }
                                                if ((var22.field208 & var21) != 0 && !this.method98(var7, var4, var5, var22.field208)) {
                                                    var22.field210.method140(0, field245, field246, field247, field248, var22.field206 - field242, var22.field205 - field243, var22.field207 - field244, var22.field212);
                                                }
                                                if ((var22.field209 & var21) != 0 && !this.method98(var7, var4, var5, var22.field209)) {
                                                    var22.field211.method140(0, field245, field246, field247, field248, var22.field206 - field242, var22.field205 - field243, var22.field207 - field244, var22.field212);
                                                }
                                            }
                                            if (var23 != null && !this.method99(var7, var4, var5, var23.field103.field471)) {
                                                if ((var23.field101 & var21) != 0) {
                                                    var23.field103.method140(var23.field102, field245, field246, field247, field248, var23.field99 - field242, var23.field98 - field243, var23.field100 - field244, var23.field104);
                                                } else if ((var23.field101 & 0x300) != 0) {
                                                    int var24 = var23.field99 - field242;
                                                    int var25 = var23.field98 - field243;
                                                    int var26 = var23.field100 - field244;
                                                    int var27 = var23.field102;
                                                    int var28;
                                                    if (var27 == 1 || var27 == 2) {
                                                        var28 = -var24;
                                                    } else {
                                                        var28 = var24;
                                                    }
                                                    int var29;
                                                    if (var27 == 2 || var27 == 3) {
                                                        var29 = -var26;
                                                    } else {
                                                        var29 = var26;
                                                    }
                                                    if ((var23.field101 & 0x100) != 0 && var29 < var28) {
                                                        int var30 = field250[var27] + var24;
                                                        int var31 = field251[var27] + var26;
                                                        var23.field103.method140(var27 * 512 + 256, field245, field246, field247, field248, var30, var25, var31, var23.field104);
                                                    }
                                                    if ((var23.field101 & 0x200) != 0 && var29 > var28) {
                                                        int var32 = field252[var27] + var24;
                                                        int var33 = field253[var27] + var26;
                                                        var23.field103.method140(var27 * 512 + 1280 & 0x7FF, field245, field246, field247, field248, var32, var25, var33, var23.field104);
                                                    }
                                                }
                                            }
                                            if (var19) {
                                                GroundDecor var34 = var3.field425;
                                                if (var34 != null) {
                                                    var34.field134.method140(0, field245, field246, field247, field248, var34.field132 - field242, var34.field131 - field243, var34.field133 - field244, var34.field135);
                                                }
                                                GroundObject var35 = var3.field426;
                                                if (var35 != null && var35.field144 == 0) {
                                                    if (var35.field141 != null) {
                                                        var35.field141.method140(0, field245, field246, field247, field248, var35.field138 - field242, var35.field137 - field243, var35.field139 - field244, var35.field143);
                                                    }
                                                    if (var35.field142 != null) {
                                                        var35.field142.method140(0, field245, field246, field247, field248, var35.field138 - field242, var35.field137 - field243, var35.field139 - field244, var35.field143);
                                                    }
                                                    if (var35.field140 != null) {
                                                        var35.field140.method140(0, field245, field246, field247, field248, var35.field138 - field242, var35.field137 - field243, var35.field139 - field244, var35.field143);
                                                    }
                                                }
                                            }
                                            int var36 = var3.field430;
                                            if (var36 != 0) {
                                                if (var4 < field240 && (var36 & 0x4) != 0) {
                                                    Tile var37 = var8[var4 + 1][var5];
                                                    if (var37 != null && var37.field433) {
                                                        field264.method225(var37);
                                                    }
                                                }
                                                if (var5 < field241 && (var36 & 0x2) != 0) {
                                                    Tile var38 = var8[var4][var5 + 1];
                                                    if (var38 != null && var38.field433) {
                                                        field264.method225(var38);
                                                    }
                                                }
                                                if (var4 > field240 && (var36 & 0x1) != 0) {
                                                    Tile var39 = var8[var4 - 1][var5];
                                                    if (var39 != null && var39.field433) {
                                                        field264.method225(var39);
                                                    }
                                                }
                                                if (var5 > field241 && (var36 & 0x8) != 0) {
                                                    Tile var40 = var8[var4][var5 - 1];
                                                    if (var40 != null && var40.field433) {
                                                        field264.method225(var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var3.field435 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var3.field427; var42++) {
                                                if (field235 != var3.field428[var42].field202 && (var3.field429[var42] & var3.field435) == var3.field436) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                Wall var43 = var3.field423;
                                                if (!this.method98(var7, var4, var5, var43.field208)) {
                                                    var43.field210.method140(0, field245, field246, field247, field248, var43.field206 - field242, var43.field205 - field243, var43.field207 - field244, var43.field212);
                                                }
                                                var3.field435 = 0;
                                            }
                                        }
                                        if (!var3.field434) {
                                            break;
                                        }
                                        int var44 = var3.field427;
                                        var3.field434 = false;
                                        int var45 = 0;
                                        label566: for (int var46 = 0; var46 < var44; var46++) {
                                            Location var56 = var3.field428[var46];
                                            if (field235 != var56.field202) {
                                                for (int var57 = var56.field197; var57 <= var56.field198; var57++) {
                                                    for (int var62 = var56.field199; var62 <= var56.field200; var62++) {
                                                        Tile var63 = var8[var57][var62];
                                                        if (var63.field432) {
                                                            var3.field434 = true;
                                                            continue label566;
                                                        }
                                                        if (var63.field435 != 0) {
                                                            int var64 = 0;
                                                            if (var57 > var56.field197) {
                                                                var64++;
                                                            }
                                                            if (var57 < var56.field198) {
                                                                var64 += 4;
                                                            }
                                                            if (var62 > var56.field199) {
                                                                var64 += 8;
                                                            }
                                                            if (var62 < var56.field200) {
                                                                var64 += 2;
                                                            }
                                                            if ((var64 & var63.field435) == var3.field437) {
                                                                var3.field434 = true;
                                                                continue label566;
                                                            }
                                                        }
                                                    }
                                                }
                                                field249[var45++] = var56;
                                                int var58 = field240 - var56.field197;
                                                int var59 = var56.field198 - field240;
                                                if (var59 > var58) {
                                                    var58 = var59;
                                                }
                                                int var60 = field241 - var56.field199;
                                                int var61 = var56.field200 - field241;
                                                if (var61 > var60) {
                                                    var56.field201 = var58 + var61;
                                                } else {
                                                    var56.field201 = var58 + var60;
                                                }
                                            }
                                        }
                                        while (var45 > 0) {
                                            int var47 = -50;
                                            int var48 = -1;
                                            for (int var49 = 0; var49 < var45; var49++) {
                                                Location var55 = field249[var49];
                                                if (var55.field201 > var47 && field235 != var55.field202) {
                                                    var47 = var55.field201;
                                                    var48 = var49;
                                                }
                                            }
                                            if (var48 == -1) {
                                                break;
                                            }
                                            Location var50 = field249[var48];
                                            var50.field202 = field235;
                                            Model var51 = var50.field194;
                                            if (var51 == null) {
                                                var51 = var50.field195.method108(this.field215);
                                            }
                                            if (!this.method100(var7, var50.field197, var50.field198, var50.field199, var50.field200, var51.field471)) {
                                                var51.method140(var50.field196, field245, field246, field247, field248, var50.field192 - field242, var50.field191 - field243, var50.field193 - field244, var50.field203);
                                            }
                                            for (int var52 = var50.field197; var52 <= var50.field198; var52++) {
                                                for (int var53 = var50.field199; var53 <= var50.field200; var53++) {
                                                    Tile var54 = var8[var52][var53];
                                                    if (var54.field435 != 0) {
                                                        field264.method225(var54);
                                                    } else if ((var4 != var52 || var5 != var53) && var54.field433) {
                                                        field264.method225(var54);
                                                    }
                                                }
                                            }
                                        }
                                        if (!var3.field434) {
                                            break;
                                        }
                                    }
                                } while (!var3.field433);
                            } while (var3.field435 != 0);
                            if (var4 > field240 || var4 <= field236) {
                                break;
                            }
                            var65 = var8[var4 - 1][var5];
                        } while (var65 != null && var65.field433);
                        if (var4 < field240 || var4 >= field237 - 1) {
                            break;
                        }
                        var66 = var8[var4 + 1][var5];
                    } while (var66 != null && var66.field433);
                    if (var5 > field241 || var5 <= field238) {
                        break;
                    }
                    var67 = var8[var4][var5 - 1];
                } while (var67 != null && var67.field433);
                if (var5 < field241 || var5 >= field239 - 1) {
                    break;
                }
                var68 = var8[var4][var5 + 1];
            } while (var68 != null && var68.field433);
            var3.field433 = false;
            field233--;
            GroundObject var69 = var3.field426;
            if (var69 != null && var69.field144 != 0) {
                if (var69.field141 != null) {
                    var69.field141.method140(0, field245, field246, field247, field248, var69.field138 - field242, var69.field137 - field243 - var69.field144, var69.field139 - field244, var69.field143);
                }
                if (var69.field142 != null) {
                    var69.field142.method140(0, field245, field246, field247, field248, var69.field138 - field242, var69.field137 - field243 - var69.field144, var69.field139 - field244, var69.field143);
                }
                if (var69.field140 != null) {
                    var69.field140.method140(0, field245, field246, field247, field248, var69.field138 - field242, var69.field137 - field243 - var69.field144, var69.field139 - field244, var69.field143);
                }
            }
            if (var3.field438 != 0) {
                Decor var70 = var3.field424;
                if (var70 != null && !this.method99(var7, var4, var5, var70.field103.field471)) {
                    if ((var70.field101 & var3.field438) != 0) {
                        var70.field103.method140(var70.field102, field245, field246, field247, field248, var70.field99 - field242, var70.field98 - field243, var70.field100 - field244, var70.field104);
                    } else if ((var70.field101 & 0x300) != 0) {
                        int var71 = var70.field99 - field242;
                        int var72 = var70.field98 - field243;
                        int var73 = var70.field100 - field244;
                        int var74 = var70.field102;
                        int var75;
                        if (var74 == 1 || var74 == 2) {
                            var75 = -var71;
                        } else {
                            var75 = var71;
                        }
                        int var76;
                        if (var74 == 2 || var74 == 3) {
                            var76 = -var73;
                        } else {
                            var76 = var73;
                        }
                        if ((var70.field101 & 0x100) != 0 && var76 >= var75) {
                            int var77 = field250[var74] + var71;
                            int var78 = field251[var74] + var73;
                            var70.field103.method140(var74 * 512 + 256, field245, field246, field247, field248, var77, var72, var78, var70.field104);
                        }
                        if ((var70.field101 & 0x200) != 0 && var76 <= var75) {
                            int var79 = field252[var74] + var71;
                            int var80 = field253[var74] + var73;
                            var70.field103.method140(var74 * 512 + 1280 & 0x7FF, field245, field246, field247, field248, var79, var72, var80, var70.field104);
                        }
                    }
                }
                Wall var81 = var3.field423;
                if (var81 != null) {
                    if ((var81.field209 & var3.field438) != 0 && !this.method98(var7, var4, var5, var81.field209)) {
                        var81.field211.method140(0, field245, field246, field247, field248, var81.field206 - field242, var81.field205 - field243, var81.field207 - field244, var81.field212);
                    }
                    if ((var81.field208 & var3.field438) != 0 && !this.method98(var7, var4, var5, var81.field208)) {
                        var81.field210.method140(0, field245, field246, field247, field248, var81.field206 - field242, var81.field205 - field243, var81.field207 - field244, var81.field212);
                    }
                }
            }
            if (var6 < this.field224 - 1) {
                Tile var82 = this.field228[var6 + 1][var4][var5];
                if (var82 != null && var82.field433) {
                    field264.method225(var82);
                }
            }
            if (var4 < field240) {
                Tile var83 = var8[var4 + 1][var5];
                if (var83 != null && var83.field433) {
                    field264.method225(var83);
                }
            }
            if (var5 < field241) {
                Tile var84 = var8[var4][var5 + 1];
                if (var84 != null && var84.field433) {
                    field264.method225(var84);
                }
            }
            if (var4 > field240) {
                Tile var85 = var8[var4 - 1][var5];
                if (var85 != null && var85.field433) {
                    field264.method225(var85);
                }
            }
            if (var5 > field241) {
                Tile var86 = var8[var4][var5 - 1];
                if (var86 != null && var86.field433) {
                    field264.method225(var86);
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lo;IIIIIII)V")
    public void method92(TileUnderlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9;
        int var10 = var9 = (arg6 << 7) - field242;
        int var11;
        int var12 = var11 = (arg7 << 7) - field244;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = this.field227[arg1][arg6][arg7] - field243;
        int var18 = this.field227[arg1][arg6 + 1][arg7] - field243;
        int var19 = this.field227[arg1][arg6 + 1][arg7 + 1] - field243;
        int var20 = this.field227[arg1][arg6][arg7 + 1] - field243;
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
        int var45 = (var21 << 9) / var25 + Pix3D.field555;
        int var46 = (var24 << 9) / var25 + Pix3D.field556;
        int var47 = (var27 << 9) / var31 + Pix3D.field555;
        int var48 = (var30 << 9) / var31 + Pix3D.field556;
        int var49 = (var33 << 9) / var37 + Pix3D.field555;
        int var50 = (var36 << 9) / var37 + Pix3D.field556;
        int var51 = (var39 << 9) / var43 + Pix3D.field555;
        int var52 = (var42 << 9) / var43 + Pix3D.field556;
        Pix3D.field554 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            Pix3D.field551 = false;
            if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > Pix2D.field541 || var51 > Pix2D.field541 || var47 > Pix2D.field541) {
                Pix3D.field551 = true;
            }
            if (field254 && this.method95(field255, field256, var50, var52, var48, var49, var51, var47)) {
                field257 = arg6;
                field258 = arg7;
            }
            if (arg0.field187 == -1) {
                if (arg0.field185 != 12345678) {
                    Pix3D.method164(var50, var52, var48, var49, var51, var47, arg0.field185, arg0.field186, arg0.field184);
                }
            } else if (field223) {
                int var53 = field272[arg0.field187];
                Pix3D.method164(var50, var52, var48, var49, var51, var47, this.method94(arg0.field185, var53, 1), this.method94(arg0.field186, var53, 1), this.method94(arg0.field184, var53, 1));
            } else if (arg0.field188) {
                Pix3D.method168(var50, var52, var48, var49, var51, var47, arg0.field185, arg0.field186, arg0.field184, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field187);
            } else {
                Pix3D.method168(var50, var52, var48, var49, var51, var47, arg0.field185, arg0.field186, arg0.field184, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field187);
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        Pix3D.field551 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Pix2D.field541 || var47 > Pix2D.field541 || var51 > Pix2D.field541) {
            Pix3D.field551 = true;
        }
        if (field254 && this.method95(field255, field256, var46, var48, var52, var45, var47, var51)) {
            field257 = arg6;
            field258 = arg7;
        }
        if (arg0.field187 != -1) {
            if (!field223) {
                Pix3D.method168(var46, var48, var52, var45, var47, var51, arg0.field183, arg0.field184, arg0.field186, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field187);
                return;
            }
            int var54 = field272[arg0.field187];
            Pix3D.method164(var46, var48, var52, var45, var47, var51, this.method94(arg0.field183, var54, 1), this.method94(arg0.field184, var54, 1), this.method94(arg0.field186, var54, 1));
        } else if (arg0.field183 != 12345678) {
            Pix3D.method164(var46, var48, var52, var45, var47, var51, arg0.field183, arg0.field184, arg0.field186);
            return;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILi;IBIIII)V")
    public void method93(int arg0, TileOverlay arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg1.field106.length;
        if (arg3 != -66) {
            this.field217 = 222;
        }
        for (int var10 = 0; var10 < var9; var10++) {
            int var23 = arg1.field106[var10] - field242;
            int var24 = arg1.field107[var10] - field243;
            int var25 = arg1.field108[var10] - field244;
            int var26 = arg6 * var25 + arg7 * var23 >> 16;
            int var27 = arg7 * var25 - arg6 * var23 >> 16;
            int var29 = arg2 * var24 - arg4 * var27 >> 16;
            int var30 = arg2 * var27 + arg4 * var24 >> 16;
            if (var30 < 50) {
                return;
            }
            if (arg1.field115 != null) {
                TileOverlay.field123[var10] = var26;
                TileOverlay.field124[var10] = var29;
                TileOverlay.field125[var10] = var30;
            }
            TileOverlay.field121[var10] = (var26 << 9) / var30 + Pix3D.field555;
            TileOverlay.field122[var10] = (var29 << 9) / var30 + Pix3D.field556;
        }
        Pix3D.field554 = 0;
        int var11 = arg1.field112.length;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = arg1.field112[var12];
            int var14 = arg1.field113[var12];
            int var15 = arg1.field114[var12];
            int var16 = TileOverlay.field121[var13];
            int var17 = TileOverlay.field121[var14];
            int var18 = TileOverlay.field121[var15];
            int var19 = TileOverlay.field122[var13];
            int var20 = TileOverlay.field122[var14];
            int var21 = TileOverlay.field122[var15];
            if ((var16 - var17) * (var21 - var20) - (var18 - var17) * (var19 - var20) > 0) {
                Pix3D.field551 = false;
                if (var16 < 0 || var17 < 0 || var18 < 0 || var16 > Pix2D.field541 || var17 > Pix2D.field541 || var18 > Pix2D.field541) {
                    Pix3D.field551 = true;
                }
                if (field254 && this.method95(field255, field256, var19, var20, var21, var16, var17, var18)) {
                    field257 = arg0;
                    field258 = arg5;
                }
                if (arg1.field115 == null || arg1.field115[var12] == -1) {
                    if (arg1.field109[var12] != 12345678) {
                        Pix3D.method164(var19, var20, var21, var16, var17, var18, arg1.field109[var12], arg1.field110[var12], arg1.field111[var12]);
                    }
                } else if (field223) {
                    int var22 = field272[arg1.field115[var12]];
                    Pix3D.method164(var19, var20, var21, var16, var17, var18, this.method94(arg1.field109[var12], var22, 1), this.method94(arg1.field110[var12], var22, 1), this.method94(arg1.field111[var12], var22, 1));
                } else if (arg1.field116) {
                    Pix3D.method168(var19, var20, var21, var16, var17, var18, arg1.field109[var12], arg1.field110[var12], arg1.field111[var12], TileOverlay.field123[0], TileOverlay.field123[1], TileOverlay.field123[3], TileOverlay.field124[0], TileOverlay.field124[1], TileOverlay.field124[3], TileOverlay.field125[0], TileOverlay.field125[1], TileOverlay.field125[3], arg1.field115[var12]);
                } else {
                    Pix3D.method168(var19, var20, var21, var16, var17, var18, arg1.field109[var12], arg1.field110[var12], arg1.field111[var12], TileOverlay.field123[var13], TileOverlay.field123[var14], TileOverlay.field123[var15], TileOverlay.field124[var13], TileOverlay.field124[var14], TileOverlay.field124[var15], TileOverlay.field125[var13], TileOverlay.field125[var14], TileOverlay.field125[var15], arg1.field115[var12]);
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "e", descriptor = "(III)I")
    public int method94(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
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
    public boolean method95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
    private void method96(int arg0) {
        int var2 = field260[field234];
        Occlude[] var3 = field261[field234];
        field262 = 0;
        if (arg0 != 0) {
            return;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            Occlude var5 = var3[var4];
            if (var5.field165 == 1) {
                int var6 = var5.field161 + 25 - field240;
                if (var6 >= 0 && var6 <= 50) {
                    int var7 = var5.field163 + 25 - field241;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = var5.field164 + 25 - field241;
                    if (var8 > 50) {
                        var8 = 50;
                    }
                    boolean var9 = false;
                    while (var7 <= var8) {
                        if (field279[var6][var7++]) {
                            var9 = true;
                            break;
                        }
                    }
                    if (var9) {
                        int var10 = field242 - var5.field166;
                        if (var10 > 32) {
                            var5.field172 = 1;
                        } else {
                            if (var10 >= -32) {
                                continue;
                            }
                            var5.field172 = 2;
                            var10 = -var10;
                        }
                        var5.field175 = (var5.field168 - field244 << 8) / var10;
                        var5.field176 = (var5.field169 - field244 << 8) / var10;
                        var5.field177 = (var5.field170 - field243 << 8) / var10;
                        var5.field178 = (var5.field171 - field243 << 8) / var10;
                        field263[field262++] = var5;
                    }
                }
            } else if (var5.field165 == 2) {
                int var11 = var5.field163 + 25 - field241;
                if (var11 >= 0 && var11 <= 50) {
                    int var12 = var5.field161 + 25 - field240;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = var5.field162 + 25 - field240;
                    if (var13 > 50) {
                        var13 = 50;
                    }
                    boolean var14 = false;
                    while (var12 <= var13) {
                        if (field279[var12++][var11]) {
                            var14 = true;
                            break;
                        }
                    }
                    if (var14) {
                        int var15 = field244 - var5.field168;
                        if (var15 > 32) {
                            var5.field172 = 3;
                        } else {
                            if (var15 >= -32) {
                                continue;
                            }
                            var5.field172 = 4;
                            var15 = -var15;
                        }
                        var5.field173 = (var5.field166 - field242 << 8) / var15;
                        var5.field174 = (var5.field167 - field242 << 8) / var15;
                        var5.field177 = (var5.field170 - field243 << 8) / var15;
                        var5.field178 = (var5.field171 - field243 << 8) / var15;
                        field263[field262++] = var5;
                    }
                }
            } else if (var5.field165 == 4) {
                int var16 = var5.field170 - field243;
                if (var16 > 128) {
                    int var17 = var5.field163 + 25 - field241;
                    if (var17 < 0) {
                        var17 = 0;
                    }
                    int var18 = var5.field164 + 25 - field241;
                    if (var18 > 50) {
                        var18 = 50;
                    }
                    if (var17 <= var18) {
                        int var19 = var5.field161 + 25 - field240;
                        if (var19 < 0) {
                            var19 = 0;
                        }
                        int var20 = var5.field162 + 25 - field240;
                        if (var20 > 50) {
                            var20 = 50;
                        }
                        boolean var21 = false;
                        label149: for (int var22 = var19; var22 <= var20; var22++) {
                            for (int var23 = var17; var23 <= var18; var23++) {
                                if (field279[var22][var23]) {
                                    var21 = true;
                                    break label149;
                                }
                            }
                        }
                        if (var21) {
                            var5.field172 = 5;
                            var5.field173 = (var5.field166 - field242 << 8) / var16;
                            var5.field174 = (var5.field167 - field242 << 8) / var16;
                            var5.field175 = (var5.field168 - field244 << 8) / var16;
                            var5.field176 = (var5.field169 - field244 << 8) / var16;
                            field263[field262++] = var5;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "f", descriptor = "(III)Z")
    private boolean method97(int arg0, int arg1, int arg2) {
        int var4 = this.field232[arg0][arg1][arg2];
        if (-field235 == var4) {
            return false;
        } else if (field235 == var4) {
            return true;
        } else {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            if (this.method101(var5 + 1, this.field227[arg0][arg1][arg2], var6 + 1) && this.method101(var5 + 128 - 1, this.field227[arg0][arg1 + 1][arg2], var6 + 1) && this.method101(var5 + 128 - 1, this.field227[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.method101(var5 + 1, this.field227[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
                this.field232[arg0][arg1][arg2] = field235;
                return true;
            } else {
                this.field232[arg0][arg1][arg2] = -field235;
                return false;
            }
        }
    }

    @OriginalMember(owner = "r", name = "e", descriptor = "(IIII)Z")
    private boolean method98(int arg0, int arg1, int arg2, int arg3) {
        if (!this.method97(arg0, arg1, arg2)) {
            return false;
        }
        int var5 = arg1 << 7;
        int var6 = arg2 << 7;
        int var7 = this.field227[arg0][arg1][arg2] - 1;
        int var8 = var7 - 120;
        int var9 = var7 - 230;
        int var10 = var7 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var5 > field242) {
                    if (!this.method101(var5, var7, var6)) {
                        return false;
                    }
                    if (!this.method101(var5, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method101(var5, var8, var6)) {
                        return false;
                    }
                    if (!this.method101(var5, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method101(var5, var9, var6)) {
                    return false;
                }
                if (!this.method101(var5, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var6 < field244) {
                    if (!this.method101(var5, var7, var6 + 128)) {
                        return false;
                    }
                    if (!this.method101(var5 + 128, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method101(var5, var8, var6 + 128)) {
                        return false;
                    }
                    if (!this.method101(var5 + 128, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method101(var5, var9, var6 + 128)) {
                    return false;
                }
                if (!this.method101(var5 + 128, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var5 < field242) {
                    if (!this.method101(var5 + 128, var7, var6)) {
                        return false;
                    }
                    if (!this.method101(var5 + 128, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method101(var5 + 128, var8, var6)) {
                        return false;
                    }
                    if (!this.method101(var5 + 128, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method101(var5 + 128, var9, var6)) {
                    return false;
                }
                if (!this.method101(var5 + 128, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var6 > field244) {
                    if (!this.method101(var5, var7, var6)) {
                        return false;
                    }
                    if (!this.method101(var5 + 128, var7, var6)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method101(var5, var8, var6)) {
                        return false;
                    }
                    if (!this.method101(var5 + 128, var8, var6)) {
                        return false;
                    }
                }
                if (!this.method101(var5, var9, var6)) {
                    return false;
                }
                if (!this.method101(var5 + 128, var9, var6)) {
                    return false;
                }
                return true;
            }
        }
        if (!this.method101(var5 + 64, var10, var6 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return this.method101(var5, var9, var6 + 128);
        } else if (arg3 == 32) {
            return this.method101(var5 + 128, var9, var6 + 128);
        } else if (arg3 == 64) {
            return this.method101(var5 + 128, var9, var6);
        } else if (arg3 == 128) {
            return this.method101(var5, var9, var6);
        } else {
            System.out.println("Warning unsupported wall type");
            return true;
        }
    }

    @OriginalMember(owner = "r", name = "f", descriptor = "(IIII)Z")
    private boolean method99(int arg0, int arg1, int arg2, int arg3) {
        if (this.method97(arg0, arg1, arg2)) {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            return this.method101(var5 + 1, this.field227[arg0][arg1][arg2] - arg3, var6 + 1) && this.method101(var5 + 128 - 1, this.field227[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method101(var5 + 128 - 1, this.field227[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method101(var5 + 1, this.field227[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIII)Z")
    private boolean method100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var9 = arg1; var9 <= arg2; var9++) {
                for (int var15 = arg3; var15 <= arg4; var15++) {
                    if (this.field232[arg0][var9][var15] == -field235) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = this.field227[arg0][arg1][arg3] - arg5;
            if (!this.method101(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!this.method101(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!this.method101(var10, var12, var14)) {
                return false;
            } else if (this.method101(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (this.method97(arg0, arg1, arg3)) {
            int var7 = arg1 << 7;
            int var8 = arg3 << 7;
            return this.method101(var7 + 1, this.field227[arg0][arg1][arg3] - arg5, var8 + 1) && this.method101(var7 + 128 - 1, this.field227[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.method101(var7 + 128 - 1, this.field227[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.method101(var7 + 1, this.field227[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "g", descriptor = "(III)Z")
    private boolean method101(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < field262; var4++) {
            Occlude var5 = field263[var4];
            if (var5.field172 == 1) {
                int var6 = var5.field166 - arg0;
                if (var6 > 0) {
                    int var7 = (var5.field175 * var6 >> 8) + var5.field168;
                    int var8 = (var5.field176 * var6 >> 8) + var5.field169;
                    int var9 = (var5.field177 * var6 >> 8) + var5.field170;
                    int var10 = (var5.field178 * var6 >> 8) + var5.field171;
                    if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field172 == 2) {
                int var11 = arg0 - var5.field166;
                if (var11 > 0) {
                    int var12 = (var5.field175 * var11 >> 8) + var5.field168;
                    int var13 = (var5.field176 * var11 >> 8) + var5.field169;
                    int var14 = (var5.field177 * var11 >> 8) + var5.field170;
                    int var15 = (var5.field178 * var11 >> 8) + var5.field171;
                    if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
                        return true;
                    }
                }
            } else if (var5.field172 == 3) {
                int var16 = var5.field168 - arg2;
                if (var16 > 0) {
                    int var17 = (var5.field173 * var16 >> 8) + var5.field166;
                    int var18 = (var5.field174 * var16 >> 8) + var5.field167;
                    int var19 = (var5.field177 * var16 >> 8) + var5.field170;
                    int var20 = (var5.field178 * var16 >> 8) + var5.field171;
                    if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
                        return true;
                    }
                }
            } else if (var5.field172 == 4) {
                int var21 = arg2 - var5.field168;
                if (var21 > 0) {
                    int var22 = (var5.field173 * var21 >> 8) + var5.field166;
                    int var23 = (var5.field174 * var21 >> 8) + var5.field167;
                    int var24 = (var5.field177 * var21 >> 8) + var5.field170;
                    int var25 = (var5.field178 * var21 >> 8) + var5.field171;
                    if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
                        return true;
                    }
                }
            } else if (var5.field172 == 5) {
                int var26 = arg1 - var5.field170;
                if (var26 > 0) {
                    int var27 = (var5.field173 * var26 >> 8) + var5.field166;
                    int var28 = (var5.field174 * var26 >> 8) + var5.field167;
                    int var29 = (var5.field175 * var26 >> 8) + var5.field168;
                    int var30 = (var5.field176 * var26 >> 8) + var5.field169;
                    if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
