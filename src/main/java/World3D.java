import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("r")
public class World3D {

    @OriginalMember(owner = "r", name = "a", descriptor = "Z")
    private boolean field206 = true;

    @OriginalMember(owner = "r", name = "d", descriptor = "I")
    private int field209 = -4278;

    @OriginalMember(owner = "r", name = "e", descriptor = "Z")
    private boolean field210 = true;

    @OriginalMember(owner = "r", name = "f", descriptor = "I")
    private int field211 = 431;

    @OriginalMember(owner = "r", name = "h", descriptor = "I")
    private int field213 = -13731;

    @OriginalMember(owner = "r", name = "q", descriptor = "[Lp;")
    public Location[] field222 = new Location[5000];

    @OriginalMember(owner = "r", name = "gb", descriptor = "[I")
    public int[] field264 = new int[10000];

    @OriginalMember(owner = "r", name = "hb", descriptor = "[I")
    public int[] field265 = new int[10000];

    @OriginalMember(owner = "r", name = "jb", descriptor = "[[I")
    public int[][] field267 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "r", name = "kb", descriptor = "[[I")
    public int[][] field268 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "r", name = "j", descriptor = "I")
    public int field215;

    @OriginalMember(owner = "r", name = "k", descriptor = "I")
    public int field216;

    @OriginalMember(owner = "r", name = "l", descriptor = "I")
    public int field217;

    @OriginalMember(owner = "r", name = "n", descriptor = "[[[Lcb;")
    public Tile[][][] field219;

    @OriginalMember(owner = "r", name = "r", descriptor = "[[[I")
    public int[][][] field223;

    @OriginalMember(owner = "r", name = "m", descriptor = "[[[I")
    public int[][][] field218;

    @OriginalMember(owner = "r", name = "b", descriptor = "Z")
    private static boolean field207 = true;

    @OriginalMember(owner = "r", name = "i", descriptor = "Z")
    public static boolean field214 = true;

    @OriginalMember(owner = "r", name = "I", descriptor = "[Lp;")
    public static Location[] field240 = new Location[100];

    @OriginalMember(owner = "r", name = "J", descriptor = "[I")
    public static final int[] field241 = new int[] { 53, -53, -53, 53 };

    @OriginalMember(owner = "r", name = "K", descriptor = "[I")
    public static final int[] field242 = new int[] { -53, -53, 53, 53 };

    @OriginalMember(owner = "r", name = "L", descriptor = "[I")
    public static final int[] field243 = new int[] { -45, 45, 45, -45 };

    @OriginalMember(owner = "r", name = "M", descriptor = "[I")
    public static final int[] field244 = new int[] { 45, 45, -45, -45 };

    @OriginalMember(owner = "r", name = "Q", descriptor = "I")
    public static int field248 = -1;

    @OriginalMember(owner = "r", name = "R", descriptor = "I")
    public static int field249 = -1;

    @OriginalMember(owner = "r", name = "S", descriptor = "I")
    public static int field250 = 4;

    @OriginalMember(owner = "r", name = "T", descriptor = "[I")
    public static int[] field251 = new int[field250];

    @OriginalMember(owner = "r", name = "U", descriptor = "[[Lm;")
    public static Occlude[][] field252 = new Occlude[field250][500];

    @OriginalMember(owner = "r", name = "W", descriptor = "[Lm;")
    public static Occlude[] field254 = new Occlude[500];

    @OriginalMember(owner = "r", name = "X", descriptor = "Lob;")
    public static LinkList field255 = new LinkList(5);

    @OriginalMember(owner = "r", name = "Y", descriptor = "[I")
    public static final int[] field256 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "r", name = "Z", descriptor = "[I")
    public static final int[] field257 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "r", name = "ab", descriptor = "[I")
    public static final int[] field258 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "r", name = "bb", descriptor = "[I")
    public static final int[] field259 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "r", name = "cb", descriptor = "[I")
    public static final int[] field260 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "r", name = "db", descriptor = "[I")
    public static final int[] field261 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "r", name = "eb", descriptor = "[I")
    public static final int[] field262 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "r", name = "fb", descriptor = "[I")
    public static final int[] field263 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

    @OriginalMember(owner = "r", name = "lb", descriptor = "[[[[Z")
    public static boolean[][][][] field269 = new boolean[8][32][51][51];

    @OriginalMember(owner = "r", name = "c", descriptor = "I")
    private static int field208;

    @OriginalMember(owner = "r", name = "g", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "r", name = "o", descriptor = "I")
    public int field220;

    @OriginalMember(owner = "r", name = "p", descriptor = "I")
    public int field221;

    @OriginalMember(owner = "r", name = "s", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "r", name = "t", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "r", name = "u", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "r", name = "v", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "r", name = "w", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "r", name = "x", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "r", name = "y", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "r", name = "z", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "r", name = "A", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "r", name = "B", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "r", name = "C", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "r", name = "D", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "r", name = "E", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "r", name = "F", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "r", name = "G", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "r", name = "H", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "r", name = "O", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "r", name = "P", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "r", name = "V", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "r", name = "ib", descriptor = "I")
    public int field266;

    @OriginalMember(owner = "r", name = "nb", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "r", name = "ob", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "r", name = "pb", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "r", name = "qb", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "r", name = "rb", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "r", name = "sb", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "r", name = "N", descriptor = "Z")
    public static boolean field245;

    @OriginalMember(owner = "r", name = "mb", descriptor = "[[Z")
    public static boolean[][] field270;

    @OriginalMember(owner = "r", name = "<init>", descriptor = "([[[IIIII)V")
    public World3D(int[][][] arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field215 = arg2;
        this.field216 = arg4;
        if (this.field209 != arg1) {
            this.field206 = !this.field206;
        }
        this.field217 = arg3;
        this.field219 = new Tile[arg2][arg4][arg3];
        this.field223 = new int[arg2][arg4 + 1][arg3 + 1];
        this.field218 = arg0;
        this.method50(true);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(I)V")
    public static void method49(int arg0) {
        field240 = null;
        field251 = null;
        field252 = null;
        field255 = null;
        field269 = null;
        if (arg0 <= 0) {
            field207 = true;
        }
        field270 = null;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Z)V")
    public void method50(boolean arg0) {
        if (!arg0) {
            return;
        }
        for (int var2 = 0; var2 < this.field215; var2++) {
            for (int var7 = 0; var7 < this.field216; var7++) {
                for (int var8 = 0; var8 < this.field217; var8++) {
                    this.field219[var2][var7][var8] = null;
                }
            }
        }
        for (int var3 = 0; var3 < field250; var3++) {
            for (int var6 = 0; var6 < field251[var3]; var6++) {
                field252[var3][var6] = null;
            }
            field251[var3] = 0;
        }
        for (int var4 = 0; var4 < this.field221; var4++) {
            this.field222[var4] = null;
        }
        this.field221 = 0;
        for (int var5 = 0; var5 < field240.length; var5++) {
            field240[var5] = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(II)V")
    public void method51(int arg0, int arg1) {
        this.field220 = arg0;
        for (int var3 = 0; var3 < this.field216; var3++) {
            for (int var5 = 0; var5 < this.field217; var5++) {
                this.field219[arg0][var3][var5] = new Tile(arg0, var3, var5);
            }
        }
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(III)V")
    public void method52(int arg0, int arg1, int arg2) {
        Tile var4 = this.field219[0][arg1][arg0];
        for (int var5 = 0; var5 < 3; var5++) {
            this.field219[var5][arg1][arg0] = this.field219[var5 + 1][arg1][arg0];
            if (this.field219[var5][arg1][arg0] != null) {
                this.field219[var5][arg1][arg0].field407--;
            }
        }
        if (this.field219[0][arg1][arg0] == null) {
            this.field219[0][arg1][arg0] = new Tile(0, arg1, arg0);
        }
        this.field219[0][arg1][arg0].field429 = var4;
        if (arg2 != 9) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field219[3][arg1][arg0] = null;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIBIIIII)V")
    public static void method53(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 != 80) {
            field207 = true;
        }
        Occlude var9 = new Occlude();
        var9.field153 = arg0 / 128;
        var9.field154 = arg2 / 128;
        var9.field155 = arg5 / 128;
        var9.field156 = arg4 / 128;
        var9.field157 = arg6;
        var9.field158 = arg0;
        var9.field159 = arg2;
        var9.field160 = arg5;
        var9.field161 = arg4;
        var9.field162 = arg1;
        var9.field163 = arg7;
        field252[arg8][field251[arg8]++] = var9;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIII)V")
    public void method54(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field219[arg0][arg1][arg2];
        if (var5 != null) {
            this.field219[arg0][arg1][arg2].field421 = arg3;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public void method55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            TileUnderlay var21 = new TileUnderlay(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var22 = arg0; var22 >= 0; var22--) {
                if (this.field219[var22][arg1][arg2] == null) {
                    this.field219[var22][arg1][arg2] = new Tile(var22, arg1, arg2);
                }
            }
            this.field219[arg0][arg1][arg2].field411 = var21;
        } else if (arg3 == 1) {
            TileUnderlay var23 = new TileUnderlay(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var24 = arg0; var24 >= 0; var24--) {
                if (this.field219[var24][arg1][arg2] == null) {
                    this.field219[var24][arg1][arg2] = new Tile(var24, arg1, arg2);
                }
            }
            this.field219[arg0][arg1][arg2].field411 = var23;
        } else {
            TileOverlay var25 = new TileOverlay(arg10, arg16, arg3, field208, arg2, arg19, arg4, arg11, arg6, arg1, arg15, arg7, arg13, arg18, arg9, arg14, arg12, arg17, arg5, arg8);
            for (int var26 = arg0; var26 >= 0; var26--) {
                if (this.field219[var26][arg1][arg2] == null) {
                    this.field219[var26][arg1][arg2] = new Tile(var26, arg1, arg2);
                }
            }
            this.field219[arg0][arg1][arg2].field412 = var25;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIBLeb;IIZI)V")
    public void method56(int arg0, int arg1, byte arg2, Model arg3, int arg4, int arg5, boolean arg6, int arg7) {
        GroundDecor var9 = new GroundDecor();
        if (!arg6) {
            return;
        }
        var9.field126 = arg3;
        var9.field124 = arg4 * 128 + 64;
        var9.field125 = arg1 * 128 + 64;
        var9.field123 = arg5;
        var9.field127 = arg0;
        var9.field128 = arg2;
        if (this.field219[arg7][arg4][arg1] == null) {
            this.field219[arg7][arg4][arg1] = new Tile(arg7, arg4, arg1);
        }
        this.field219[arg7][arg4][arg1].field415 = var9;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IILeb;Leb;ILeb;IZI)V")
    public void method57(int arg0, int arg1, Model arg2, Model arg3, int arg4, Model arg5, int arg6, boolean arg7, int arg8) {
        GroundObject var10 = new GroundObject();
        var10.field132 = arg2;
        if (arg7) {
            return;
        }
        var10.field130 = arg0 * 128 + 64;
        var10.field131 = arg6 * 128 + 64;
        var10.field129 = arg1;
        var10.field135 = arg4;
        var10.field133 = arg3;
        var10.field134 = arg5;
        int var11 = 0;
        Tile var12 = this.field219[arg8][arg0][arg6];
        if (var12 != null) {
            for (int var13 = 0; var13 < var12.field417; var13++) {
                int var14 = var12.field418[var13].field186.field465;
                if (var14 > var11) {
                    var11 = var14;
                }
            }
        }
        var10.field136 = var11;
        if (this.field219[arg8][arg0][arg6] == null) {
            this.field219[arg8][arg0][arg6] = new Tile(arg8, arg0, arg6);
        }
        this.field219[arg8][arg0][arg6].field416 = var10;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIILeb;IILeb;BII)V")
    public void method58(int arg0, int arg1, int arg2, int arg3, Model arg4, int arg5, int arg6, Model arg7, byte arg8, int arg9, int arg10) {
        if (arg4 == null && arg7 == null) {
            return;
        }
        Wall var12 = new Wall();
        var12.field204 = arg1;
        var12.field205 = arg8;
        var12.field198 = arg6 * 128 + 64;
        var12.field199 = arg5 * 128 + 64;
        if (arg0 <= 0) {
            this.field211 = 86;
        }
        var12.field197 = arg3;
        var12.field202 = arg4;
        var12.field203 = arg7;
        var12.field200 = arg9;
        var12.field201 = arg2;
        for (int var13 = arg10; var13 >= 0; var13--) {
            if (this.field219[var13][arg6][arg5] == null) {
                this.field219[var13][arg6][arg5] = new Tile(var13, arg6, arg5);
            }
        }
        this.field219[arg10][arg6][arg5].field413 = var12;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IBIIIIIIILeb;II)V")
    public void method59(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Model arg9, int arg10, int arg11) {
        if (arg9 == null) {
            return;
        }
        Decor var13 = new Decor();
        var13.field96 = arg4;
        var13.field97 = arg1;
        var13.field91 = arg0 * 128 + arg8 + 64;
        var13.field92 = arg10 * 128 + arg3 + 64;
        var13.field90 = arg2;
        if (arg6 <= 0) {
            this.field211 = -32;
        }
        var13.field95 = arg9;
        var13.field93 = arg5;
        var13.field94 = arg7;
        for (int var14 = arg11; var14 >= 0; var14--) {
            if (this.field219[var14][arg0][arg10] == null) {
                this.field219[var14][arg0][arg10] = new Tile(var14, arg0, arg10);
            }
        }
        this.field219[arg11][arg0][arg10].field414 = var13;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Leb;BLw;IIIIIIIII)Z")
    public boolean method60(Model arg0, byte arg1, Entity arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg0 == null && arg2 == null) {
            return true;
        }
        int var13 = arg4 * 128 + arg6 * 64;
        int var14 = arg5 * 64 + arg9 * 128;
        if (arg10 != 0) {
            field208 = -432;
        }
        return this.method63(arg7, arg4, arg9, arg6, arg5, var13, var14, arg3, arg0, arg2, arg11, false, arg8, arg1);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Leb;IIIIIIILw;II)Z")
    public boolean method61(Model arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, int arg10) {
        if (arg0 == null && arg8 == null) {
            return true;
        }
        int var12 = arg5 - arg9;
        int var13 = arg3 - arg9;
        int var14 = arg5 + arg9;
        int var15 = arg3 + arg9;
        if (arg7 > 0) {
            if (arg4 > 768 && arg4 < 1280) {
                var15 += arg7;
            }
            if (arg4 > 1280 && arg4 < 1792) {
                var14 += arg7;
            }
            if (arg4 > 1792 || arg4 < 256) {
                var13 -= arg7;
            }
            if (arg4 > 256 && arg4 < 768) {
                var14 -= arg7;
            }
        }
        int var16 = var12 / 128;
        if (arg2 != 5) {
            this.field211 = -84;
        }
        int var17 = var13 / 128;
        int var18 = var14 / 128;
        int var19 = var15 / 128;
        return this.method63(arg6, var16, var17, var18 + 1 - var16, var19 - var17 + 1, arg5, arg3, arg1, arg0, arg8, arg4, true, arg10, (byte) 0);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IILeb;IIIIBIILw;III)Z")
    public boolean method62(int arg0, int arg1, Model arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, Entity arg10, int arg11, int arg12, int arg13) {
        if (arg7 == 8) {
            boolean var15 = false;
        }
        return arg2 == null && arg10 == null ? true : this.method63(arg13, arg3, arg1, arg11 + 1 - arg3, arg12 - arg1 + 1, arg5, arg6, arg9, arg2, arg10, arg4, true, arg8, (byte) 0);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIILeb;Lw;IZIB)Z")
    public boolean method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Model arg8, Entity arg9, int arg10, boolean arg11, int arg12, byte arg13) {
        if (arg8 == null && arg9 == null) {
            return false;
        }
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var22 = arg2; var22 < arg2 + arg4; var22++) {
                if (var15 < 0 || var22 < 0 || var15 >= this.field216 || var22 >= this.field217) {
                    return false;
                }
                Tile var23 = this.field219[arg0][var15][var22];
                if (var23 != null && var23.field417 >= 5) {
                    return false;
                }
            }
        }
        Location var16 = new Location();
        var16.field195 = arg12;
        var16.field196 = arg13;
        var16.field182 = arg0;
        var16.field184 = arg5;
        var16.field185 = arg6;
        var16.field183 = arg7;
        var16.field186 = arg8;
        var16.field187 = arg9;
        var16.field188 = arg10;
        var16.field189 = arg1;
        var16.field191 = arg2;
        var16.field190 = arg1 + arg3 - 1;
        var16.field192 = arg2 + arg4 - 1;
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
                    if (this.field219[var20][var17][var18] == null) {
                        this.field219[var20][var17][var18] = new Tile(var20, var17, var18);
                    }
                }
                Tile var21 = this.field219[arg0][var17][var18];
                var21.field418[var21.field417] = var16;
                var21.field419[var21.field417] = var19;
                var21.field420 |= var19;
                var21.field417++;
            }
        }
        if (arg11) {
            this.field222[this.field221++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(I)V")
    public void method64(int arg0) {
        for (int var2 = 0; var2 < this.field221; var2++) {
            Location var3 = this.field222[var2];
            this.method65(-212, var3);
            this.field222[var2] = null;
        }
        if (arg0 < 7 || arg0 > 7) {
            this.field209 = 177;
        }
        this.field221 = 0;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILp;)V")
    private void method65(int arg0, Location arg1) {
        if (arg0 >= 0) {
            return;
        }
        for (int var3 = arg1.field189; var3 <= arg1.field190; var3++) {
            for (int var4 = arg1.field191; var4 <= arg1.field192; var4++) {
                Tile var5 = this.field219[arg1.field182][var3][var4];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field417; var6++) {
                        if (var5.field418[var6] == arg1) {
                            var5.field417--;
                            for (int var7 = var6; var7 < var5.field417; var7++) {
                                var5.field418[var7] = var5.field418[var7 + 1];
                                var5.field419[var7] = var5.field419[var7 + 1];
                            }
                            var5.field418[var5.field417] = null;
                            break;
                        }
                    }
                    var5.field420 = 0;
                    for (int var8 = 0; var8 < var5.field417; var8++) {
                        var5.field420 |= var5.field419[var8];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Leb;IIII)V")
    public void method66(Model arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 93 / arg1;
        if (arg0 == null) {
            return;
        }
        Tile var7 = this.field219[arg4][arg3][arg2];
        if (var7 == null) {
            return;
        }
        for (int var8 = 0; var8 < var7.field417; var8++) {
            Location var9 = var7.field418[var8];
            if ((var9.field195 >> 29 & 0x3) == 2) {
                var9.field186 = arg0;
                return;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIILeb;I)V")
    public void method67(int arg0, int arg1, int arg2, Model arg3, int arg4) {
        if (arg0 != 38499 || arg3 == null) {
            return;
        }
        Tile var6 = this.field219[arg4][arg1][arg2];
        if (var6 != null) {
            Decor var7 = var6.field414;
            if (var7 != null) {
                var7.field95 = arg3;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Leb;BIII)V")
    public void method68(Model arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 2) {
            this.field209 = 272;
        }
        if (arg0 == null) {
            return;
        }
        Tile var6 = this.field219[arg2][arg4][arg3];
        if (var6 != null) {
            Wall var7 = var6.field413;
            if (var7 != null) {
                var7.field202 = arg0;
            }
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIII)V")
    public void method69(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field219[arg1][arg2][arg3];
        if (arg0 == 0 && var5 != null) {
            var5.field413 = null;
        }
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(IIII)V")
    public void method70(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field219[arg1][arg0][arg3];
        if (var5 != null) {
            var5.field414 = null;
            if (arg2 != 0) {
                this.field210 = !this.field210;
            }
        }
    }

    @OriginalMember(owner = "r", name = "d", descriptor = "(IIII)V")
    public void method71(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field219[arg2][arg3][arg1];
        if (var5 == null) {
            return;
        }
        for (int var6 = 0; var6 < var5.field417; var6++) {
            Location var7 = var5.field418[var6];
            if ((var7.field195 >> 29 & 0x3) == 2 && var7.field189 == arg3 && var7.field191 == arg1) {
                this.method65(-212, var7);
                return;
            }
        }
        if (arg0 <= 0) {
            this.field213 = 5;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(BIII)V")
    public void method72(byte arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field219[arg3][arg2][arg1];
        if (var5 == null) {
            return;
        }
        var5.field415 = null;
        if (arg0 != 52) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(III)V")
    public void method73(int arg0, int arg1, int arg2) {
        Tile var4 = this.field219[arg0][arg1][arg2];
        if (var4 != null) {
            var4.field416 = null;
        }
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(III)I")
    public int method74(int arg0, int arg1, int arg2) {
        Tile var4 = this.field219[arg0][arg1][arg2];
        return var4 == null || var4.field413 == null ? 0 : var4.field413.field204;
    }

    @OriginalMember(owner = "r", name = "e", descriptor = "(IIII)I")
    public int method75(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == -14722) {
            Tile var5 = this.field219[arg3][arg0][arg1];
            return var5 == null || var5.field414 == null ? 0 : var5.field414.field96;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "r", name = "d", descriptor = "(III)I")
    public int method76(int arg0, int arg1, int arg2) {
        Tile var4 = this.field219[arg0][arg1][arg2];
        if (var4 == null) {
            return 0;
        }
        for (int var5 = 0; var5 < var4.field417; var5++) {
            Location var6 = var4.field418[var5];
            if ((var6.field195 >> 29 & 0x3) == 2 && var6.field189 == arg1 && var6.field191 == arg2) {
                return var6.field195;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "r", name = "e", descriptor = "(III)I")
    public int method77(int arg0, int arg1, int arg2) {
        Tile var4 = this.field219[arg0][arg1][arg2];
        return var4 == null || var4.field415 == null ? 0 : var4.field415.field127;
    }

    @OriginalMember(owner = "r", name = "f", descriptor = "(IIII)I")
    public int method78(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field219[arg0][arg1][arg2];
        if (var5 == null) {
            return -1;
        } else if (var5.field413 != null && var5.field413.field204 == arg3) {
            return var5.field413.field205 & 0xFF;
        } else if (var5.field414 != null && var5.field414.field96 == arg3) {
            return var5.field414.field97 & 0xFF;
        } else if (var5.field415 != null && var5.field415.field127 == arg3) {
            return var5.field415.field128 & 0xFF;
        } else {
            for (int var6 = 0; var6 < var5.field417; var6++) {
                if (var5.field418[var6].field195 == arg3) {
                    return var5.field418[var6].field196 & 0xFF;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIII)V")
    public void method79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        if (arg5 != 0) {
            this.field206 = !this.field206;
        }
        int var8 = arg1 * var7 >> 8;
        for (int var9 = 0; var9 < this.field215; var9++) {
            for (int var10 = 0; var10 < this.field216; var10++) {
                for (int var11 = 0; var11 < this.field217; var11++) {
                    Tile var12 = this.field219[var9][var10][var11];
                    if (var12 != null) {
                        Wall var13 = var12.field413;
                        if (var13 != null && var13.field202 != null && var13.field202.field471 != null) {
                            this.method81(var13.field202, var9, var10, 1, 1, 543, var11);
                            if (var13.field203 != null && var13.field203.field471 != null) {
                                this.method81(var13.field203, var9, var10, 1, 1, 543, var11);
                                this.method82(var13.field202, var13.field203, 0, 0, 0, false);
                                var13.field203.method133(arg0, var8, arg3, arg2, arg4);
                            }
                            var13.field202.method133(arg0, var8, arg3, arg2, arg4);
                        }
                        for (int var14 = 0; var14 < var12.field417; var14++) {
                            Location var16 = var12.field418[var14];
                            if (var16 != null && var16.field186 != null && var16.field186.field471 != null) {
                                this.method81(var16.field186, var9, var10, var16.field190 + 1 - var16.field189, var16.field192 - var16.field191 + 1, 543, var11);
                                var16.field186.method133(arg0, var8, arg3, arg2, arg4);
                            }
                        }
                        GroundDecor var15 = var12.field415;
                        if (var15 != null && var15.field126.field471 != null) {
                            this.method80(9, var11, var9, var10, var15.field126);
                            var15.field126.method133(arg0, var8, arg3, arg2, arg4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIILeb;)V")
    private void method80(int arg0, int arg1, int arg2, int arg3, Model arg4) {
        if (arg0 < 9 || arg0 > 9) {
            return;
        }
        if (arg3 < this.field216) {
            Tile var6 = this.field219[arg2][arg3 + 1][arg1];
            if (var6 != null && var6.field415 != null && var6.field415.field126.field471 != null) {
                this.method82(arg4, var6.field415.field126, 128, 0, 0, true);
            }
        }
        if (arg1 < this.field216) {
            Tile var7 = this.field219[arg2][arg3][arg1 + 1];
            if (var7 != null && var7.field415 != null && var7.field415.field126.field471 != null) {
                this.method82(arg4, var7.field415.field126, 0, 0, 128, true);
            }
        }
        if (arg3 < this.field216 && arg1 < this.field217) {
            Tile var8 = this.field219[arg2][arg3 + 1][arg1 + 1];
            if (var8 != null && var8.field415 != null && var8.field415.field126.field471 != null) {
                this.method82(arg4, var8.field415.field126, 128, 0, 128, true);
            }
        }
        if (arg3 >= this.field216 || arg1 <= 0) {
            return;
        }
        Tile var9 = this.field219[arg2][arg3 + 1][arg1 - 1];
        if (var9 != null && var9.field415 != null && var9.field415.field126.field471 != null) {
            this.method82(arg4, var9.field415.field126, 128, 0, -128, true);
            return;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Leb;IIIIII)V")
    private void method81(Model arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var8 = true;
        int var9 = arg2;
        int var10 = arg2 + arg3;
        int var11 = arg6 - 1;
        int var12 = arg4 + arg6;
        int var13 = 43 / arg5;
        for (int var14 = arg1; var14 <= arg1 + 1; var14++) {
            if (this.field215 != var14) {
                for (int var15 = var9; var15 <= var10; var15++) {
                    if (var15 >= 0 && var15 < this.field216) {
                        for (int var16 = var11; var16 <= var12; var16++) {
                            if (var16 >= 0 && var16 < this.field217 && (!var8 || var15 >= var10 || var16 >= var12 || var16 < arg6 && arg2 != var15)) {
                                Tile var17 = this.field219[var14][var15][var16];
                                if (var17 != null) {
                                    int var18 = (this.field218[var14][var15 + 1][var16] + this.field218[var14][var15][var16] + this.field218[var14][var15][var16 + 1] + this.field218[var14][var15 + 1][var16 + 1]) / 4 - (this.field218[arg1][arg2 + 1][arg6] + this.field218[arg1][arg2][arg6] + this.field218[arg1][arg2][arg6 + 1] + this.field218[arg1][arg2 + 1][arg6 + 1]) / 4;
                                    Wall var19 = var17.field413;
                                    if (var19 != null && var19.field202 != null && var19.field202.field471 != null) {
                                        this.method82(arg0, var19.field202, (var15 - arg2) * 128 + (1 - arg3) * 64, var18, (1 - arg4) * 64 + (var16 - arg6) * 128, var8);
                                    }
                                    if (var19 != null && var19.field203 != null && var19.field203.field471 != null) {
                                        this.method82(arg0, var19.field203, (var15 - arg2) * 128 + (1 - arg3) * 64, var18, (1 - arg4) * 64 + (var16 - arg6) * 128, var8);
                                    }
                                    for (int var20 = 0; var20 < var17.field417; var20++) {
                                        Location var21 = var17.field418[var20];
                                        if (var21 != null && var21.field186 != null && var21.field186.field471 != null) {
                                            int var22 = var21.field190 + 1 - var21.field189;
                                            int var23 = var21.field192 + 1 - var21.field191;
                                            this.method82(arg0, var21.field186, (var21.field189 - arg2) * 128 + (var22 - arg3) * 64, var18, (var21.field191 - arg6) * 128 + (var23 - arg4) * 64, var8);
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
    private void method82(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field266++;
        int var7 = 0;
        int[] var8 = arg1.field437;
        int var9 = arg1.field436;
        for (int var10 = 0; var10 < arg0.field436; var10++) {
            VertexNormal var13 = arg0.field471[var10];
            VertexNormal var14 = arg0.field472[var10];
            if (var14.field174 != 0) {
                int var15 = arg0.field438[var10] - arg3;
                if (var15 <= arg1.field462) {
                    int var16 = arg0.field437[var10] - arg2;
                    if (var16 >= arg1.field456 && var16 <= arg1.field457) {
                        int var17 = arg0.field439[var10] - arg4;
                        if (var17 >= arg1.field459 && var17 <= arg1.field458) {
                            for (int var18 = 0; var18 < var9; var18++) {
                                VertexNormal var19 = arg1.field471[var18];
                                VertexNormal var20 = arg1.field472[var18];
                                if (var8[var18] == var16 && arg1.field439[var18] == var17 && arg1.field438[var18] == var15 && var20.field174 != 0) {
                                    var13.field171 += var20.field171;
                                    var13.field172 += var20.field172;
                                    var13.field173 += var20.field173;
                                    var13.field174 += var20.field174;
                                    var19.field171 += var14.field171;
                                    var19.field172 += var14.field172;
                                    var19.field173 += var14.field173;
                                    var19.field174 += var14.field174;
                                    var7++;
                                    this.field264[var10] = this.field266;
                                    this.field265[var18] = this.field266;
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
        for (int var11 = 0; var11 < arg0.field440; var11++) {
            if (this.field264[arg0.field441[var11]] == this.field266 && this.field264[arg0.field442[var11]] == this.field266 && this.field264[arg0.field443[var11]] == this.field266) {
                arg0.field447[var11] = -1;
            }
        }
        for (int var12 = 0; var12 < arg1.field440; var12++) {
            if (this.field265[arg1.field441[var12]] == this.field266 && this.field265[arg1.field442[var12]] == this.field266 && this.field265[arg1.field443[var12]] == this.field266) {
                arg1.field447[var12] = -1;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "([IIIIII)V")
    public void method83(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Tile var7 = this.field219[arg3][arg4][arg5];
        if (var7 == null) {
            return;
        }
        TileUnderlay var8 = var7.field411;
        if (var8 != null) {
            int var9 = var8.field181;
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
        TileOverlay var11 = var7.field412;
        if (var11 == null) {
            return;
        }
        int var12 = var11.field109;
        int var13 = var11.field110;
        int var14 = var11.field111;
        int var15 = var11.field112;
        int[] var16 = this.field267[var12];
        int[] var17 = this.field268[var13];
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

    @OriginalMember(owner = "r", name = "a", descriptor = "(III[III)V")
    public static void method84(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        if (arg1 != 6) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        field273 = 0;
        field274 = 0;
        field275 = arg0;
        field276 = arg2;
        field271 = arg0 / 2;
        field272 = arg2 / 2;
        boolean[][][][] var7 = new boolean[9][32][53][53];
        for (int var8 = 128; var8 <= 384; var8 += 32) {
            for (int var16 = 0; var16 < 2048; var16 += 64) {
                field236 = Model.field514[var8];
                field237 = Model.field515[var8];
                field238 = Model.field514[var16];
                field239 = Model.field515[var16];
                int var17 = (var8 - 128) / 32;
                int var18 = var16 / 64;
                for (int var19 = -26; var19 <= 26; var19++) {
                    for (int var20 = -26; var20 <= 26; var20++) {
                        int var21 = var19 * 128;
                        int var22 = var20 * 128;
                        boolean var23 = false;
                        for (int var24 = -arg5; var24 <= arg4; var24 += 128) {
                            if (method85(var22, var21, (byte) 54, arg3[var17] + var24)) {
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
                        field269[var9][var10][var11 + 25][var12 + 25] = var13;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIBI)Z")
    public static boolean method85(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = field239 * arg1 + field238 * arg0 >> 16;
        int var5 = field239 * arg0 - field238 * arg1 >> 16;
        int var6 = field237 * var5 + field236 * arg3 >> 16;
        int var7 = field237 * arg3 - field236 * var5 >> 16;
        if (arg2 != 54) {
            throw new NullPointerException();
        } else if (var6 >= 50 && var6 <= 3500) {
            int var8 = (var4 << 9) / var6 + field271;
            int var9 = (var7 << 9) / var6 + field272;
            return var8 >= field273 && var8 <= field275 && var9 >= field274 && var9 <= field276;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "f", descriptor = "(III)V")
    public void method86(int arg0, int arg1, int arg2) {
        field245 = true;
        field246 = arg1;
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field247 = arg2;
        field248 = -1;
        field249 = -1;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIII)V")
    public void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= this.field216 * 128) {
            arg0 = this.field216 * 128 - 1;
        }
        if (arg4 < 0) {
            arg4 = 0;
        } else if (arg4 >= this.field217 * 128) {
            arg4 = this.field217 * 128 - 1;
        }
        field226++;
        field236 = Model.field514[arg5];
        field237 = Model.field515[arg5];
        field238 = Model.field514[arg6];
        field239 = Model.field515[arg6];
        field270 = field269[(arg5 - 128) / 32][arg6 / 64];
        field233 = arg0;
        field234 = arg3;
        field235 = arg4;
        field231 = arg0 / 128;
        field232 = arg4 / 128;
        field225 = arg1;
        field227 = field231 - 25;
        if (field227 < 0) {
            field227 = 0;
        }
        field229 = field232 - 25;
        if (field229 < 0) {
            field229 = 0;
        }
        field228 = field231 + 25;
        if (field228 > this.field216) {
            field228 = this.field216;
        }
        field230 = field232 + 25;
        if (field230 > this.field217) {
            field230 = this.field217;
        }
        this.method93(true);
        field224 = 0;
        for (int var8 = this.field220; var8 < this.field215; var8++) {
            Tile[][] var33 = this.field219[var8];
            for (int var34 = field227; var34 < field228; var34++) {
                for (int var35 = field229; var35 < field230; var35++) {
                    Tile var36 = var33[var34][var35];
                    if (var36 != null) {
                        if (var36.field421 <= arg1 && (field270[var34 + 25 - field231][var35 + 25 - field232] || this.field218[var8][var34][var35] - arg3 >= 2000)) {
                            var36.field422 = true;
                            var36.field423 = true;
                            if (var36.field417 > 0) {
                                var36.field424 = true;
                            } else {
                                var36.field424 = false;
                            }
                            field224++;
                        } else {
                            var36.field422 = false;
                            var36.field423 = false;
                            var36.field425 = 0;
                        }
                    }
                }
            }
        }
        if (arg2 != 2) {
            this.field212 = -429;
        }
        for (int var9 = this.field220; var9 < this.field215; var9++) {
            Tile[][] var22 = this.field219[var9];
            for (int var23 = -25; var23 <= 0; var23++) {
                int var24 = field231 + var23;
                int var25 = field231 - var23;
                if (var24 >= field227 || var25 < field228) {
                    for (int var26 = -25; var26 <= 0; var26++) {
                        int var27 = field232 + var26;
                        int var28 = field232 - var26;
                        if (var24 >= field227) {
                            if (var27 >= field229) {
                                Tile var29 = var22[var24][var27];
                                if (var29 != null && var29.field422) {
                                    this.method88(var29, true);
                                }
                            }
                            if (var28 < field230) {
                                Tile var30 = var22[var24][var28];
                                if (var30 != null && var30.field422) {
                                    this.method88(var30, true);
                                }
                            }
                        }
                        if (var25 < field228) {
                            if (var27 >= field229) {
                                Tile var31 = var22[var25][var27];
                                if (var31 != null && var31.field422) {
                                    this.method88(var31, true);
                                }
                            }
                            if (var28 < field230) {
                                Tile var32 = var22[var25][var28];
                                if (var32 != null && var32.field422) {
                                    this.method88(var32, true);
                                }
                            }
                        }
                        if (field224 == 0) {
                            field245 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var10 = this.field220; var10 < this.field215; var10++) {
            Tile[][] var11 = this.field219[var10];
            for (int var12 = -25; var12 <= 0; var12++) {
                int var13 = field231 + var12;
                int var14 = field231 - var12;
                if (var13 >= field227 || var14 < field228) {
                    for (int var15 = -25; var15 <= 0; var15++) {
                        int var16 = field232 + var15;
                        int var17 = field232 - var15;
                        if (var13 >= field227) {
                            if (var16 >= field229) {
                                Tile var18 = var11[var13][var16];
                                if (var18 != null && var18.field422) {
                                    this.method88(var18, false);
                                }
                            }
                            if (var17 < field230) {
                                Tile var19 = var11[var13][var17];
                                if (var19 != null && var19.field422) {
                                    this.method88(var19, false);
                                }
                            }
                        }
                        if (var14 < field228) {
                            if (var16 >= field229) {
                                Tile var20 = var11[var14][var16];
                                if (var20 != null && var20.field422) {
                                    this.method88(var20, false);
                                }
                            }
                            if (var17 < field230) {
                                Tile var21 = var11[var14][var17];
                                if (var21 != null && var21.field422) {
                                    this.method88(var21, false);
                                }
                            }
                        }
                        if (field224 == 0) {
                            field245 = false;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lcb;Z)V")
    public void method88(Tile arg0, boolean arg1) {
        field255.method217(arg0);
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
                                                var3 = (Tile) field255.method219();
                                                if (var3 == null) {
                                                    return;
                                                }
                                            } while (!var3.field423);
                                            var4 = var3.field408;
                                            var5 = var3.field409;
                                            var6 = var3.field407;
                                            var7 = var3.field410;
                                            var8 = this.field219[var6];
                                            if (!var3.field422) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var6 > 0) {
                                                    Tile var9 = this.field219[var6 - 1][var4][var5];
                                                    if (var9 != null && var9.field423) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= field231 && var4 > field227) {
                                                    Tile var10 = var8[var4 - 1][var5];
                                                    if (var10 != null && var10.field423 && (var10.field422 || (var3.field420 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= field231 && var4 < field228 - 1) {
                                                    Tile var11 = var8[var4 + 1][var5];
                                                    if (var11 != null && var11.field423 && (var11.field422 || (var3.field420 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 <= field232 && var5 > field229) {
                                                    Tile var12 = var8[var4][var5 - 1];
                                                    if (var12 != null && var12.field423 && (var12.field422 || (var3.field420 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 >= field232 && var5 < field230 - 1) {
                                                    Tile var13 = var8[var4][var5 + 1];
                                                    if (var13 != null && var13.field423 && (var13.field422 || (var3.field420 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var3.field422 = false;
                                            if (var3.field429 != null) {
                                                Tile var14 = var3.field429;
                                                if (var14.field411 == null) {
                                                    if (var14.field412 != null && !this.method94(0, var4, var5)) {
                                                        this.method90(var14.field412, field236, field238, field237, var4, false, var5, field239);
                                                    }
                                                } else if (!this.method94(0, var4, var5)) {
                                                    this.method89(var14.field411, 0, field236, field237, field238, field239, var4, var5);
                                                }
                                                Wall var15 = var14.field413;
                                                if (var15 != null) {
                                                    var15.field202.method136(0, field236, field237, field238, field239, var15.field198 - field233, var15.field197 - field234, var15.field199 - field235, var15.field204);
                                                }
                                                for (int var16 = 0; var16 < var14.field417; var16++) {
                                                    Location var17 = var14.field418[var16];
                                                    if (var17 != null) {
                                                        Model var18 = var17.field186;
                                                        if (var18 == null) {
                                                            var18 = var17.field187.method105(0);
                                                        }
                                                        var18.method136(var17.field188, field236, field237, field238, field239, var17.field184 - field233, var17.field183 - field234, var17.field185 - field235, var17.field195);
                                                    }
                                                }
                                            }
                                            boolean var19 = false;
                                            if (var3.field411 == null) {
                                                if (var3.field412 != null && !this.method94(var7, var4, var5)) {
                                                    var19 = true;
                                                    this.method90(var3.field412, field236, field238, field237, var4, false, var5, field239);
                                                }
                                            } else if (!this.method94(var7, var4, var5)) {
                                                var19 = true;
                                                this.method89(var3.field411, var7, field236, field237, field238, field239, var4, var5);
                                            }
                                            int var20 = 0;
                                            int var21 = 0;
                                            Wall var22 = var3.field413;
                                            Decor var23 = var3.field414;
                                            if (var22 != null || var23 != null) {
                                                if (field231 == var4) {
                                                    var20++;
                                                } else if (field231 < var4) {
                                                    var20 += 2;
                                                }
                                                if (field232 == var5) {
                                                    var20 += 3;
                                                } else if (field232 > var5) {
                                                    var20 += 6;
                                                }
                                                var21 = field256[var20];
                                                var3.field428 = field258[var20];
                                            }
                                            if (var22 != null) {
                                                if ((var22.field200 & field257[var20]) == 0) {
                                                    var3.field425 = 0;
                                                } else if (var22.field200 == 16) {
                                                    var3.field425 = 3;
                                                    var3.field426 = field259[var20];
                                                    var3.field427 = 3 - var3.field426;
                                                } else if (var22.field200 == 32) {
                                                    var3.field425 = 6;
                                                    var3.field426 = field260[var20];
                                                    var3.field427 = 6 - var3.field426;
                                                } else if (var22.field200 == 64) {
                                                    var3.field425 = 12;
                                                    var3.field426 = field261[var20];
                                                    var3.field427 = 12 - var3.field426;
                                                } else {
                                                    var3.field425 = 9;
                                                    var3.field426 = field262[var20];
                                                    var3.field427 = 9 - var3.field426;
                                                }
                                                if ((var22.field200 & var21) != 0 && !this.method95(var7, var4, var5, var22.field200)) {
                                                    var22.field202.method136(0, field236, field237, field238, field239, var22.field198 - field233, var22.field197 - field234, var22.field199 - field235, var22.field204);
                                                }
                                                if ((var22.field201 & var21) != 0 && !this.method95(var7, var4, var5, var22.field201)) {
                                                    var22.field203.method136(0, field236, field237, field238, field239, var22.field198 - field233, var22.field197 - field234, var22.field199 - field235, var22.field204);
                                                }
                                            }
                                            if (var23 != null && !this.method96(var7, var4, var5, var23.field95.field461)) {
                                                if ((var23.field93 & var21) != 0) {
                                                    var23.field95.method136(var23.field94, field236, field237, field238, field239, var23.field91 - field233, var23.field90 - field234, var23.field92 - field235, var23.field96);
                                                } else if ((var23.field93 & 0x300) != 0) {
                                                    int var24 = var23.field91 - field233;
                                                    int var25 = var23.field90 - field234;
                                                    int var26 = var23.field92 - field235;
                                                    int var27 = var23.field94;
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
                                                    if ((var23.field93 & 0x100) != 0 && var29 < var28) {
                                                        int var30 = field241[var27] + var24;
                                                        int var31 = field242[var27] + var26;
                                                        var23.field95.method136(var27 * 512 + 256, field236, field237, field238, field239, var30, var25, var31, var23.field96);
                                                    }
                                                    if ((var23.field93 & 0x200) != 0 && var29 > var28) {
                                                        int var32 = field243[var27] + var24;
                                                        int var33 = field244[var27] + var26;
                                                        var23.field95.method136(var27 * 512 + 1280 & 0x7FF, field236, field237, field238, field239, var32, var25, var33, var23.field96);
                                                    }
                                                }
                                            }
                                            if (var19) {
                                                GroundDecor var34 = var3.field415;
                                                if (var34 != null) {
                                                    var34.field126.method136(0, field236, field237, field238, field239, var34.field124 - field233, var34.field123 - field234, var34.field125 - field235, var34.field127);
                                                }
                                                GroundObject var35 = var3.field416;
                                                if (var35 != null && var35.field136 == 0) {
                                                    if (var35.field133 != null) {
                                                        var35.field133.method136(0, field236, field237, field238, field239, var35.field130 - field233, var35.field129 - field234, var35.field131 - field235, var35.field135);
                                                    }
                                                    if (var35.field134 != null) {
                                                        var35.field134.method136(0, field236, field237, field238, field239, var35.field130 - field233, var35.field129 - field234, var35.field131 - field235, var35.field135);
                                                    }
                                                    if (var35.field132 != null) {
                                                        var35.field132.method136(0, field236, field237, field238, field239, var35.field130 - field233, var35.field129 - field234, var35.field131 - field235, var35.field135);
                                                    }
                                                }
                                            }
                                            int var36 = var3.field420;
                                            if (var36 != 0) {
                                                if (var4 < field231 && (var36 & 0x4) != 0) {
                                                    Tile var37 = var8[var4 + 1][var5];
                                                    if (var37 != null && var37.field423) {
                                                        field255.method217(var37);
                                                    }
                                                }
                                                if (var5 < field232 && (var36 & 0x2) != 0) {
                                                    Tile var38 = var8[var4][var5 + 1];
                                                    if (var38 != null && var38.field423) {
                                                        field255.method217(var38);
                                                    }
                                                }
                                                if (var4 > field231 && (var36 & 0x1) != 0) {
                                                    Tile var39 = var8[var4 - 1][var5];
                                                    if (var39 != null && var39.field423) {
                                                        field255.method217(var39);
                                                    }
                                                }
                                                if (var5 > field232 && (var36 & 0x8) != 0) {
                                                    Tile var40 = var8[var4][var5 - 1];
                                                    if (var40 != null && var40.field423) {
                                                        field255.method217(var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var3.field425 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var3.field417; var42++) {
                                                if (field226 != var3.field418[var42].field194 && (var3.field419[var42] & var3.field425) == var3.field426) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                Wall var43 = var3.field413;
                                                if (!this.method95(var7, var4, var5, var43.field200)) {
                                                    var43.field202.method136(0, field236, field237, field238, field239, var43.field198 - field233, var43.field197 - field234, var43.field199 - field235, var43.field204);
                                                }
                                                var3.field425 = 0;
                                            }
                                        }
                                        if (!var3.field424) {
                                            break;
                                        }
                                        int var44 = var3.field417;
                                        var3.field424 = false;
                                        int var45 = 0;
                                        label566: for (int var46 = 0; var46 < var44; var46++) {
                                            Location var56 = var3.field418[var46];
                                            if (field226 != var56.field194) {
                                                for (int var57 = var56.field189; var57 <= var56.field190; var57++) {
                                                    for (int var62 = var56.field191; var62 <= var56.field192; var62++) {
                                                        Tile var63 = var8[var57][var62];
                                                        if (var63.field422) {
                                                            var3.field424 = true;
                                                            continue label566;
                                                        }
                                                        if (var63.field425 != 0) {
                                                            int var64 = 0;
                                                            if (var57 > var56.field189) {
                                                                var64++;
                                                            }
                                                            if (var57 < var56.field190) {
                                                                var64 += 4;
                                                            }
                                                            if (var62 > var56.field191) {
                                                                var64 += 8;
                                                            }
                                                            if (var62 < var56.field192) {
                                                                var64 += 2;
                                                            }
                                                            if ((var64 & var63.field425) == var3.field427) {
                                                                var3.field424 = true;
                                                                continue label566;
                                                            }
                                                        }
                                                    }
                                                }
                                                field240[var45++] = var56;
                                                int var58 = field231 - var56.field189;
                                                int var59 = var56.field190 - field231;
                                                if (var59 > var58) {
                                                    var58 = var59;
                                                }
                                                int var60 = field232 - var56.field191;
                                                int var61 = var56.field192 - field232;
                                                if (var61 > var60) {
                                                    var56.field193 = var58 + var61;
                                                } else {
                                                    var56.field193 = var58 + var60;
                                                }
                                            }
                                        }
                                        while (var45 > 0) {
                                            int var47 = -50;
                                            int var48 = -1;
                                            for (int var49 = 0; var49 < var45; var49++) {
                                                Location var55 = field240[var49];
                                                if (var55.field193 > var47 && field226 != var55.field194) {
                                                    var47 = var55.field193;
                                                    var48 = var49;
                                                }
                                            }
                                            if (var48 == -1) {
                                                break;
                                            }
                                            Location var50 = field240[var48];
                                            var50.field194 = field226;
                                            Model var51 = var50.field186;
                                            if (var51 == null) {
                                                var51 = var50.field187.method105(0);
                                            }
                                            if (!this.method97(var7, var50.field189, var50.field190, var50.field191, var50.field192, var51.field461)) {
                                                var51.method136(var50.field188, field236, field237, field238, field239, var50.field184 - field233, var50.field183 - field234, var50.field185 - field235, var50.field195);
                                            }
                                            for (int var52 = var50.field189; var52 <= var50.field190; var52++) {
                                                for (int var53 = var50.field191; var53 <= var50.field192; var53++) {
                                                    Tile var54 = var8[var52][var53];
                                                    if (var54.field425 != 0) {
                                                        field255.method217(var54);
                                                    } else if ((var4 != var52 || var5 != var53) && var54.field423) {
                                                        field255.method217(var54);
                                                    }
                                                }
                                            }
                                        }
                                        if (!var3.field424) {
                                            break;
                                        }
                                    }
                                } while (!var3.field423);
                            } while (var3.field425 != 0);
                            if (var4 > field231 || var4 <= field227) {
                                break;
                            }
                            var65 = var8[var4 - 1][var5];
                        } while (var65 != null && var65.field423);
                        if (var4 < field231 || var4 >= field228 - 1) {
                            break;
                        }
                        var66 = var8[var4 + 1][var5];
                    } while (var66 != null && var66.field423);
                    if (var5 > field232 || var5 <= field229) {
                        break;
                    }
                    var67 = var8[var4][var5 - 1];
                } while (var67 != null && var67.field423);
                if (var5 < field232 || var5 >= field230 - 1) {
                    break;
                }
                var68 = var8[var4][var5 + 1];
            } while (var68 != null && var68.field423);
            var3.field423 = false;
            field224--;
            GroundObject var69 = var3.field416;
            if (var69 != null && var69.field136 != 0) {
                if (var69.field133 != null) {
                    var69.field133.method136(0, field236, field237, field238, field239, var69.field130 - field233, var69.field129 - field234 - var69.field136, var69.field131 - field235, var69.field135);
                }
                if (var69.field134 != null) {
                    var69.field134.method136(0, field236, field237, field238, field239, var69.field130 - field233, var69.field129 - field234 - var69.field136, var69.field131 - field235, var69.field135);
                }
                if (var69.field132 != null) {
                    var69.field132.method136(0, field236, field237, field238, field239, var69.field130 - field233, var69.field129 - field234 - var69.field136, var69.field131 - field235, var69.field135);
                }
            }
            if (var3.field428 != 0) {
                Decor var70 = var3.field414;
                if (var70 != null && !this.method96(var7, var4, var5, var70.field95.field461)) {
                    if ((var70.field93 & var3.field428) != 0) {
                        var70.field95.method136(var70.field94, field236, field237, field238, field239, var70.field91 - field233, var70.field90 - field234, var70.field92 - field235, var70.field96);
                    } else if ((var70.field93 & 0x300) != 0) {
                        int var71 = var70.field91 - field233;
                        int var72 = var70.field90 - field234;
                        int var73 = var70.field92 - field235;
                        int var74 = var70.field94;
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
                        if ((var70.field93 & 0x100) != 0 && var76 >= var75) {
                            int var77 = field241[var74] + var71;
                            int var78 = field242[var74] + var73;
                            var70.field95.method136(var74 * 512 + 256, field236, field237, field238, field239, var77, var72, var78, var70.field96);
                        }
                        if ((var70.field93 & 0x200) != 0 && var76 <= var75) {
                            int var79 = field243[var74] + var71;
                            int var80 = field244[var74] + var73;
                            var70.field95.method136(var74 * 512 + 1280 & 0x7FF, field236, field237, field238, field239, var79, var72, var80, var70.field96);
                        }
                    }
                }
                Wall var81 = var3.field413;
                if (var81 != null) {
                    if ((var81.field201 & var3.field428) != 0 && !this.method95(var7, var4, var5, var81.field201)) {
                        var81.field203.method136(0, field236, field237, field238, field239, var81.field198 - field233, var81.field197 - field234, var81.field199 - field235, var81.field204);
                    }
                    if ((var81.field200 & var3.field428) != 0 && !this.method95(var7, var4, var5, var81.field200)) {
                        var81.field202.method136(0, field236, field237, field238, field239, var81.field198 - field233, var81.field197 - field234, var81.field199 - field235, var81.field204);
                    }
                }
            }
            if (var6 < this.field215 - 1) {
                Tile var82 = this.field219[var6 + 1][var4][var5];
                if (var82 != null && var82.field423) {
                    field255.method217(var82);
                }
            }
            if (var4 < field231) {
                Tile var83 = var8[var4 + 1][var5];
                if (var83 != null && var83.field423) {
                    field255.method217(var83);
                }
            }
            if (var5 < field232) {
                Tile var84 = var8[var4][var5 + 1];
                if (var84 != null && var84.field423) {
                    field255.method217(var84);
                }
            }
            if (var4 > field231) {
                Tile var85 = var8[var4 - 1][var5];
                if (var85 != null && var85.field423) {
                    field255.method217(var85);
                }
            }
            if (var5 > field232) {
                Tile var86 = var8[var4][var5 - 1];
                if (var86 != null && var86.field423) {
                    field255.method217(var86);
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lo;IIIIIII)V")
    public void method89(TileUnderlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9;
        int var10 = var9 = (arg6 << 7) - field233;
        int var11;
        int var12 = var11 = (arg7 << 7) - field235;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = this.field218[arg1][arg6][arg7] - field234;
        int var18 = this.field218[arg1][arg6 + 1][arg7] - field234;
        int var19 = this.field218[arg1][arg6 + 1][arg7 + 1] - field234;
        int var20 = this.field218[arg1][arg6][arg7 + 1] - field234;
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
        int var45 = (var21 << 9) / var25 + Pix3D.field540;
        int var46 = (var24 << 9) / var25 + Pix3D.field541;
        int var47 = (var27 << 9) / var31 + Pix3D.field540;
        int var48 = (var30 << 9) / var31 + Pix3D.field541;
        int var49 = (var33 << 9) / var37 + Pix3D.field540;
        int var50 = (var36 << 9) / var37 + Pix3D.field541;
        int var51 = (var39 << 9) / var43 + Pix3D.field540;
        int var52 = (var42 << 9) / var43 + Pix3D.field541;
        Pix3D.field539 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            Pix3D.field536 = false;
            if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > Pix2D.field529 || var51 > Pix2D.field529 || var47 > Pix2D.field529) {
                Pix3D.field536 = true;
            }
            if (field245 && this.method92(field246, field247, var50, var52, var48, var49, var51, var47)) {
                field248 = arg6;
                field249 = arg7;
            }
            if (arg0.field179 == -1) {
                if (arg0.field177 != 12345678) {
                    Pix3D.method160(var50, var52, var48, var49, var51, var47, arg0.field177, arg0.field178, arg0.field176);
                }
            } else if (field214) {
                int var53 = field263[arg0.field179];
                Pix3D.method160(var50, var52, var48, var49, var51, var47, this.method91(var53, arg0.field177, 9), this.method91(var53, arg0.field178, 9), this.method91(var53, arg0.field176, 9));
            } else if (arg0.field180) {
                Pix3D.method164(var50, var52, var48, var49, var51, var47, arg0.field177, arg0.field178, arg0.field176, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field179);
            } else {
                Pix3D.method164(var50, var52, var48, var49, var51, var47, arg0.field177, arg0.field178, arg0.field176, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field179);
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        Pix3D.field536 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Pix2D.field529 || var47 > Pix2D.field529 || var51 > Pix2D.field529) {
            Pix3D.field536 = true;
        }
        if (field245 && this.method92(field246, field247, var46, var48, var52, var45, var47, var51)) {
            field248 = arg6;
            field249 = arg7;
        }
        if (arg0.field179 != -1) {
            if (!field214) {
                Pix3D.method164(var46, var48, var52, var45, var47, var51, arg0.field175, arg0.field176, arg0.field178, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field179);
                return;
            }
            int var54 = field263[arg0.field179];
            Pix3D.method160(var46, var48, var52, var45, var47, var51, this.method91(var54, arg0.field175, 9), this.method91(var54, arg0.field176, 9), this.method91(var54, arg0.field178, 9));
        } else if (arg0.field175 != 12345678) {
            Pix3D.method160(var46, var48, var52, var45, var47, var51, arg0.field175, arg0.field176, arg0.field178);
            return;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Li;IIIIZII)V")
    public void method90(TileOverlay arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        int var9 = arg0.field98.length;
        for (int var10 = 0; var10 < var9; var10++) {
            int var23 = arg0.field98[var10] - field233;
            int var24 = arg0.field99[var10] - field234;
            int var25 = arg0.field100[var10] - field235;
            int var26 = arg2 * var25 + arg7 * var23 >> 16;
            int var27 = arg7 * var25 - arg2 * var23 >> 16;
            int var29 = arg3 * var24 - arg1 * var27 >> 16;
            int var30 = arg1 * var24 + arg3 * var27 >> 16;
            if (var30 < 50) {
                return;
            }
            if (arg0.field107 != null) {
                TileOverlay.field115[var10] = var26;
                TileOverlay.field116[var10] = var29;
                TileOverlay.field117[var10] = var30;
            }
            TileOverlay.field113[var10] = (var26 << 9) / var30 + Pix3D.field540;
            TileOverlay.field114[var10] = (var29 << 9) / var30 + Pix3D.field541;
        }
        Pix3D.field539 = 0;
        if (arg5) {
            this.field213 = 174;
        }
        int var11 = arg0.field104.length;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = arg0.field104[var12];
            int var14 = arg0.field105[var12];
            int var15 = arg0.field106[var12];
            int var16 = TileOverlay.field113[var13];
            int var17 = TileOverlay.field113[var14];
            int var18 = TileOverlay.field113[var15];
            int var19 = TileOverlay.field114[var13];
            int var20 = TileOverlay.field114[var14];
            int var21 = TileOverlay.field114[var15];
            if ((var16 - var17) * (var21 - var20) - (var18 - var17) * (var19 - var20) > 0) {
                Pix3D.field536 = false;
                if (var16 < 0 || var17 < 0 || var18 < 0 || var16 > Pix2D.field529 || var17 > Pix2D.field529 || var18 > Pix2D.field529) {
                    Pix3D.field536 = true;
                }
                if (field245 && this.method92(field246, field247, var19, var20, var21, var16, var17, var18)) {
                    field248 = arg4;
                    field249 = arg6;
                }
                if (arg0.field107 == null || arg0.field107[var12] == -1) {
                    if (arg0.field101[var12] != 12345678) {
                        Pix3D.method160(var19, var20, var21, var16, var17, var18, arg0.field101[var12], arg0.field102[var12], arg0.field103[var12]);
                    }
                } else if (field214) {
                    int var22 = field263[arg0.field107[var12]];
                    Pix3D.method160(var19, var20, var21, var16, var17, var18, this.method91(var22, arg0.field101[var12], 9), this.method91(var22, arg0.field102[var12], 9), this.method91(var22, arg0.field103[var12], 9));
                } else if (arg0.field108) {
                    Pix3D.method164(var19, var20, var21, var16, var17, var18, arg0.field101[var12], arg0.field102[var12], arg0.field103[var12], TileOverlay.field115[0], TileOverlay.field115[1], TileOverlay.field115[3], TileOverlay.field116[0], TileOverlay.field116[1], TileOverlay.field116[3], TileOverlay.field117[0], TileOverlay.field117[1], TileOverlay.field117[3], arg0.field107[var12]);
                } else {
                    Pix3D.method164(var19, var20, var21, var16, var17, var18, arg0.field101[var12], arg0.field102[var12], arg0.field103[var12], TileOverlay.field115[var13], TileOverlay.field115[var14], TileOverlay.field115[var15], TileOverlay.field116[var13], TileOverlay.field116[var14], TileOverlay.field116[var15], TileOverlay.field117[var13], TileOverlay.field117[var14], TileOverlay.field117[var15], arg0.field107[var12]);
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "g", descriptor = "(III)I")
    public int method91(int arg0, int arg1, int arg2) {
        int var4 = 127 - arg1;
        int var5 = (arg0 & 0x7F) * var4 / 160;
        if (arg2 < 9 || arg2 > 9) {
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

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "r", name = "b", descriptor = "(Z)V")
    private void method93(boolean arg0) {
        int var2 = field251[field225];
        Occlude[] var3 = field252[field225];
        if (!arg0) {
            return;
        }
        field253 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            Occlude var5 = var3[var4];
            if (var5.field157 == 1) {
                int var6 = var5.field153 + 25 - field231;
                if (var6 >= 0 && var6 <= 50) {
                    int var7 = var5.field155 + 25 - field232;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = var5.field156 + 25 - field232;
                    if (var8 > 50) {
                        var8 = 50;
                    }
                    boolean var9 = false;
                    while (var7 <= var8) {
                        if (field270[var6][var7++]) {
                            var9 = true;
                            break;
                        }
                    }
                    if (var9) {
                        int var10 = field233 - var5.field158;
                        if (var10 > 32) {
                            var5.field164 = 1;
                        } else {
                            if (var10 >= -32) {
                                continue;
                            }
                            var5.field164 = 2;
                            var10 = -var10;
                        }
                        var5.field167 = (var5.field160 - field235 << 8) / var10;
                        var5.field168 = (var5.field161 - field235 << 8) / var10;
                        var5.field169 = (var5.field162 - field234 << 8) / var10;
                        var5.field170 = (var5.field163 - field234 << 8) / var10;
                        field254[field253++] = var5;
                    }
                }
            } else if (var5.field157 == 2) {
                int var11 = var5.field155 + 25 - field232;
                if (var11 >= 0 && var11 <= 50) {
                    int var12 = var5.field153 + 25 - field231;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = var5.field154 + 25 - field231;
                    if (var13 > 50) {
                        var13 = 50;
                    }
                    boolean var14 = false;
                    while (var12 <= var13) {
                        if (field270[var12++][var11]) {
                            var14 = true;
                            break;
                        }
                    }
                    if (var14) {
                        int var15 = field235 - var5.field160;
                        if (var15 > 32) {
                            var5.field164 = 3;
                        } else {
                            if (var15 >= -32) {
                                continue;
                            }
                            var5.field164 = 4;
                            var15 = -var15;
                        }
                        var5.field165 = (var5.field158 - field233 << 8) / var15;
                        var5.field166 = (var5.field159 - field233 << 8) / var15;
                        var5.field169 = (var5.field162 - field234 << 8) / var15;
                        var5.field170 = (var5.field163 - field234 << 8) / var15;
                        field254[field253++] = var5;
                    }
                }
            } else if (var5.field157 == 4) {
                int var16 = var5.field162 - field234;
                if (var16 > 128) {
                    int var17 = var5.field155 + 25 - field232;
                    if (var17 < 0) {
                        var17 = 0;
                    }
                    int var18 = var5.field156 + 25 - field232;
                    if (var18 > 50) {
                        var18 = 50;
                    }
                    if (var17 <= var18) {
                        int var19 = var5.field153 + 25 - field231;
                        if (var19 < 0) {
                            var19 = 0;
                        }
                        int var20 = var5.field154 + 25 - field231;
                        if (var20 > 50) {
                            var20 = 50;
                        }
                        boolean var21 = false;
                        label149: for (int var22 = var19; var22 <= var20; var22++) {
                            for (int var23 = var17; var23 <= var18; var23++) {
                                if (field270[var22][var23]) {
                                    var21 = true;
                                    break label149;
                                }
                            }
                        }
                        if (var21) {
                            var5.field164 = 5;
                            var5.field165 = (var5.field158 - field233 << 8) / var16;
                            var5.field166 = (var5.field159 - field233 << 8) / var16;
                            var5.field167 = (var5.field160 - field235 << 8) / var16;
                            var5.field168 = (var5.field161 - field235 << 8) / var16;
                            field254[field253++] = var5;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "h", descriptor = "(III)Z")
    private boolean method94(int arg0, int arg1, int arg2) {
        int var4 = this.field223[arg0][arg1][arg2];
        if (-field226 == var4) {
            return false;
        } else if (field226 == var4) {
            return true;
        } else {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            if (this.method98(var5 + 1, this.field218[arg0][arg1][arg2], var6 + 1) && this.method98(var5 + 128 - 1, this.field218[arg0][arg1 + 1][arg2], var6 + 1) && this.method98(var5 + 128 - 1, this.field218[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.method98(var5 + 1, this.field218[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
                this.field223[arg0][arg1][arg2] = field226;
                return true;
            } else {
                this.field223[arg0][arg1][arg2] = -field226;
                return false;
            }
        }
    }

    @OriginalMember(owner = "r", name = "g", descriptor = "(IIII)Z")
    private boolean method95(int arg0, int arg1, int arg2, int arg3) {
        if (!this.method94(arg0, arg1, arg2)) {
            return false;
        }
        int var5 = arg1 << 7;
        int var6 = arg2 << 7;
        int var7 = this.field218[arg0][arg1][arg2] - 1;
        int var8 = var7 - 120;
        int var9 = var7 - 230;
        int var10 = var7 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var5 > field233) {
                    if (!this.method98(var5, var7, var6)) {
                        return false;
                    }
                    if (!this.method98(var5, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method98(var5, var8, var6)) {
                        return false;
                    }
                    if (!this.method98(var5, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method98(var5, var9, var6)) {
                    return false;
                }
                if (!this.method98(var5, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var6 < field235) {
                    if (!this.method98(var5, var7, var6 + 128)) {
                        return false;
                    }
                    if (!this.method98(var5 + 128, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method98(var5, var8, var6 + 128)) {
                        return false;
                    }
                    if (!this.method98(var5 + 128, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method98(var5, var9, var6 + 128)) {
                    return false;
                }
                if (!this.method98(var5 + 128, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var5 < field233) {
                    if (!this.method98(var5 + 128, var7, var6)) {
                        return false;
                    }
                    if (!this.method98(var5 + 128, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method98(var5 + 128, var8, var6)) {
                        return false;
                    }
                    if (!this.method98(var5 + 128, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method98(var5 + 128, var9, var6)) {
                    return false;
                }
                if (!this.method98(var5 + 128, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var6 > field235) {
                    if (!this.method98(var5, var7, var6)) {
                        return false;
                    }
                    if (!this.method98(var5 + 128, var7, var6)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method98(var5, var8, var6)) {
                        return false;
                    }
                    if (!this.method98(var5 + 128, var8, var6)) {
                        return false;
                    }
                }
                if (!this.method98(var5, var9, var6)) {
                    return false;
                }
                if (!this.method98(var5 + 128, var9, var6)) {
                    return false;
                }
                return true;
            }
        }
        if (!this.method98(var5 + 64, var10, var6 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return this.method98(var5, var9, var6 + 128);
        } else if (arg3 == 32) {
            return this.method98(var5 + 128, var9, var6 + 128);
        } else if (arg3 == 64) {
            return this.method98(var5 + 128, var9, var6);
        } else if (arg3 == 128) {
            return this.method98(var5, var9, var6);
        } else {
            System.out.println("Warning unsupported wall type");
            return true;
        }
    }

    @OriginalMember(owner = "r", name = "h", descriptor = "(IIII)Z")
    private boolean method96(int arg0, int arg1, int arg2, int arg3) {
        if (this.method94(arg0, arg1, arg2)) {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            return this.method98(var5 + 1, this.field218[arg0][arg1][arg2] - arg3, var6 + 1) && this.method98(var5 + 128 - 1, this.field218[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method98(var5 + 128 - 1, this.field218[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method98(var5 + 1, this.field218[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIIIII)Z")
    private boolean method97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var9 = arg1; var9 <= arg2; var9++) {
                for (int var15 = arg3; var15 <= arg4; var15++) {
                    if (this.field223[arg0][var9][var15] == -field226) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = this.field218[arg0][arg1][arg3] - arg5;
            if (!this.method98(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!this.method98(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!this.method98(var10, var12, var14)) {
                return false;
            } else if (this.method98(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (this.method94(arg0, arg1, arg3)) {
            int var7 = arg1 << 7;
            int var8 = arg3 << 7;
            return this.method98(var7 + 1, this.field218[arg0][arg1][arg3] - arg5, var8 + 1) && this.method98(var7 + 128 - 1, this.field218[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.method98(var7 + 128 - 1, this.field218[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.method98(var7 + 1, this.field218[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "i", descriptor = "(III)Z")
    private boolean method98(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < field253; var4++) {
            Occlude var5 = field254[var4];
            if (var5.field164 == 1) {
                int var6 = var5.field158 - arg0;
                if (var6 > 0) {
                    int var7 = (var5.field167 * var6 >> 8) + var5.field160;
                    int var8 = (var5.field168 * var6 >> 8) + var5.field161;
                    int var9 = (var5.field169 * var6 >> 8) + var5.field162;
                    int var10 = (var5.field170 * var6 >> 8) + var5.field163;
                    if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field164 == 2) {
                int var11 = arg0 - var5.field158;
                if (var11 > 0) {
                    int var12 = (var5.field167 * var11 >> 8) + var5.field160;
                    int var13 = (var5.field168 * var11 >> 8) + var5.field161;
                    int var14 = (var5.field169 * var11 >> 8) + var5.field162;
                    int var15 = (var5.field170 * var11 >> 8) + var5.field163;
                    if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
                        return true;
                    }
                }
            } else if (var5.field164 == 3) {
                int var16 = var5.field160 - arg2;
                if (var16 > 0) {
                    int var17 = (var5.field165 * var16 >> 8) + var5.field158;
                    int var18 = (var5.field166 * var16 >> 8) + var5.field159;
                    int var19 = (var5.field169 * var16 >> 8) + var5.field162;
                    int var20 = (var5.field170 * var16 >> 8) + var5.field163;
                    if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
                        return true;
                    }
                }
            } else if (var5.field164 == 4) {
                int var21 = arg2 - var5.field160;
                if (var21 > 0) {
                    int var22 = (var5.field165 * var21 >> 8) + var5.field158;
                    int var23 = (var5.field166 * var21 >> 8) + var5.field159;
                    int var24 = (var5.field169 * var21 >> 8) + var5.field162;
                    int var25 = (var5.field170 * var21 >> 8) + var5.field163;
                    if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
                        return true;
                    }
                }
            } else if (var5.field164 == 5) {
                int var26 = arg1 - var5.field162;
                if (var26 > 0) {
                    int var27 = (var5.field165 * var26 >> 8) + var5.field158;
                    int var28 = (var5.field166 * var26 >> 8) + var5.field159;
                    int var29 = (var5.field167 * var26 >> 8) + var5.field160;
                    int var30 = (var5.field168 * var26 >> 8) + var5.field161;
                    if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
