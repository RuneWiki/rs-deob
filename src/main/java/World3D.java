import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("r")
public class World3D {

    @OriginalMember(owner = "r", name = "a", descriptor = "I")
    private int field210 = 33724;

    @OriginalMember(owner = "r", name = "b", descriptor = "I")
    private int field211 = -753;

    @OriginalMember(owner = "r", name = "c", descriptor = "B")
    private byte field212 = -58;

    @OriginalMember(owner = "r", name = "e", descriptor = "I")
    private int field214 = -31405;

    @OriginalMember(owner = "r", name = "f", descriptor = "I")
    private int field215 = 672;

    @OriginalMember(owner = "r", name = "g", descriptor = "Z")
    private boolean field216 = false;

    @OriginalMember(owner = "r", name = "h", descriptor = "I")
    private int field217 = 8;

    @OriginalMember(owner = "r", name = "q", descriptor = "[Lp;")
    public Location[] field226 = new Location[5000];

    @OriginalMember(owner = "r", name = "gb", descriptor = "[I")
    public int[] field268 = new int[10000];

    @OriginalMember(owner = "r", name = "hb", descriptor = "[I")
    public int[] field269 = new int[10000];

    @OriginalMember(owner = "r", name = "jb", descriptor = "[[I")
    public int[][] field271 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "r", name = "kb", descriptor = "[[I")
    public int[][] field272 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "r", name = "j", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "r", name = "k", descriptor = "I")
    public int field220;

    @OriginalMember(owner = "r", name = "l", descriptor = "I")
    public int field221;

    @OriginalMember(owner = "r", name = "n", descriptor = "[[[Lcb;")
    public Tile[][][] field223;

    @OriginalMember(owner = "r", name = "r", descriptor = "[[[I")
    public int[][][] field227;

    @OriginalMember(owner = "r", name = "m", descriptor = "[[[I")
    public int[][][] field222;

    @OriginalMember(owner = "r", name = "d", descriptor = "B")
    private static byte field213 = 73;

    @OriginalMember(owner = "r", name = "i", descriptor = "Z")
    public static boolean field218 = true;

    @OriginalMember(owner = "r", name = "I", descriptor = "[Lp;")
    public static Location[] field244 = new Location[100];

    @OriginalMember(owner = "r", name = "J", descriptor = "[I")
    public static final int[] field245 = new int[] { 53, -53, -53, 53 };

    @OriginalMember(owner = "r", name = "K", descriptor = "[I")
    public static final int[] field246 = new int[] { -53, -53, 53, 53 };

    @OriginalMember(owner = "r", name = "L", descriptor = "[I")
    public static final int[] field247 = new int[] { -45, 45, 45, -45 };

    @OriginalMember(owner = "r", name = "M", descriptor = "[I")
    public static final int[] field248 = new int[] { 45, 45, -45, -45 };

    @OriginalMember(owner = "r", name = "Q", descriptor = "I")
    public static int field252 = -1;

    @OriginalMember(owner = "r", name = "R", descriptor = "I")
    public static int field253 = -1;

    @OriginalMember(owner = "r", name = "S", descriptor = "I")
    public static int field254 = 4;

    @OriginalMember(owner = "r", name = "T", descriptor = "[I")
    public static int[] field255 = new int[field254];

    @OriginalMember(owner = "r", name = "U", descriptor = "[[Lm;")
    public static Occlude[][] field256 = new Occlude[field254][500];

    @OriginalMember(owner = "r", name = "W", descriptor = "[Lm;")
    public static Occlude[] field258 = new Occlude[500];

    @OriginalMember(owner = "r", name = "X", descriptor = "Lob;")
    public static LinkList field259 = new LinkList((byte) 5);

    @OriginalMember(owner = "r", name = "Y", descriptor = "[I")
    public static final int[] field260 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "r", name = "Z", descriptor = "[I")
    public static final int[] field261 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "r", name = "ab", descriptor = "[I")
    public static final int[] field262 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "r", name = "bb", descriptor = "[I")
    public static final int[] field263 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "r", name = "cb", descriptor = "[I")
    public static final int[] field264 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "r", name = "db", descriptor = "[I")
    public static final int[] field265 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "r", name = "eb", descriptor = "[I")
    public static final int[] field266 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "r", name = "fb", descriptor = "[I")
    public static final int[] field267 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

    @OriginalMember(owner = "r", name = "lb", descriptor = "[[[[Z")
    public static boolean[][][][] field273 = new boolean[8][32][51][51];

    @OriginalMember(owner = "r", name = "o", descriptor = "I")
    public int field224;

    @OriginalMember(owner = "r", name = "p", descriptor = "I")
    public int field225;

    @OriginalMember(owner = "r", name = "s", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "r", name = "t", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "r", name = "u", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "r", name = "v", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "r", name = "w", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "r", name = "x", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "r", name = "y", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "r", name = "z", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "r", name = "A", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "r", name = "B", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "r", name = "C", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "r", name = "D", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "r", name = "E", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "r", name = "F", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "r", name = "G", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "r", name = "H", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "r", name = "O", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "r", name = "P", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "r", name = "V", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "r", name = "ib", descriptor = "I")
    public int field270;

    @OriginalMember(owner = "r", name = "nb", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "r", name = "ob", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "r", name = "pb", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "r", name = "qb", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "r", name = "rb", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "r", name = "sb", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "r", name = "N", descriptor = "Z")
    public static boolean field249;

    @OriginalMember(owner = "r", name = "mb", descriptor = "[[Z")
    public static boolean[][] field274;

    @OriginalMember(owner = "r", name = "<init>", descriptor = "([[[IIIII)V")
    public World3D(int[][][] arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field219 = arg1;
        this.field220 = arg2;
        this.field221 = arg4;
        this.field223 = new Tile[arg1][arg2][arg4];
        this.field227 = new int[arg1][arg2 + 1][arg4 + 1];
        this.field222 = arg0;
        if (arg3 != -10463) {
            this.field216 = !this.field216;
        }
        this.method50(true);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Z)V")
    public static void method49(boolean arg0) {
        field244 = null;
        field255 = null;
        field256 = null;
        field259 = null;
        field273 = null;
        if (!arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field274 = null;
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(Z)V")
    public void method50(boolean arg0) {
        for (int var2 = 0; var2 < this.field219; var2++) {
            for (int var7 = 0; var7 < this.field220; var7++) {
                for (int var8 = 0; var8 < this.field221; var8++) {
                    this.field223[var2][var7][var8] = null;
                }
            }
        }
        for (int var3 = 0; var3 < field254; var3++) {
            for (int var6 = 0; var6 < field255[var3]; var6++) {
                field256[var3][var6] = null;
            }
            field255[var3] = 0;
        }
        for (int var4 = 0; var4 < this.field225; var4++) {
            this.field226[var4] = null;
        }
        this.field225 = 0;
        if (arg0) {
            for (int var5 = 0; var5 < field244.length; var5++) {
                field244[var5] = null;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(BI)V")
    public void method51(byte arg0, int arg1) {
        this.field224 = arg1;
        if (arg0 != -126) {
            this.field216 = !this.field216;
        }
        for (int var3 = 0; var3 < this.field220; var3++) {
            for (int var4 = 0; var4 < this.field221; var4++) {
                this.field223[arg1][var3][var4] = new Tile(arg1, var3, var4);
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IBI)V")
    public void method52(int arg0, byte arg1, int arg2) {
        Tile var4 = this.field223[0][arg2][arg0];
        for (int var5 = 0; var5 < 3; var5++) {
            this.field223[var5][arg2][arg0] = this.field223[var5 + 1][arg2][arg0];
            if (this.field223[var5][arg2][arg0] != null) {
                this.field223[var5][arg2][arg0].field414--;
            }
        }
        if (this.field223[0][arg2][arg0] == null) {
            this.field223[0][arg2][arg0] = new Tile(0, arg2, arg0);
        }
        this.field223[0][arg2][arg0].field436 = var4;
        if (arg1 != 68) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field223[3][arg2][arg0] = null;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIII)V")
    public static void method53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Occlude var9 = new Occlude();
        var9.field157 = arg8 / 128;
        var9.field158 = arg0 / 128;
        var9.field159 = arg3 / 128;
        var9.field160 = arg2 / 128;
        var9.field161 = arg1;
        var9.field162 = arg8;
        var9.field163 = arg0;
        if (arg4 >= 0) {
            return;
        }
        var9.field164 = arg3;
        var9.field165 = arg2;
        var9.field166 = arg7;
        var9.field167 = arg5;
        field256[arg6][field255[arg6]++] = var9;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIII)V")
    public void method54(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field223[arg0][arg1][arg2];
        if (var5 != null) {
            this.field223[arg0][arg1][arg2].field428 = arg3;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public void method55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            TileUnderlay var21 = new TileUnderlay(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var22 = arg0; var22 >= 0; var22--) {
                if (this.field223[var22][arg1][arg2] == null) {
                    this.field223[var22][arg1][arg2] = new Tile(var22, arg1, arg2);
                }
            }
            this.field223[arg0][arg1][arg2].field418 = var21;
        } else if (arg3 == 1) {
            TileUnderlay var23 = new TileUnderlay(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var24 = arg0; var24 >= 0; var24--) {
                if (this.field223[var24][arg1][arg2] == null) {
                    this.field223[var24][arg1][arg2] = new Tile(var24, arg1, arg2);
                }
            }
            this.field223[arg0][arg1][arg2].field418 = var23;
        } else {
            TileOverlay var25 = new TileOverlay(arg11, arg1, arg5, arg14, arg3, arg8, arg10, arg15, arg7, arg18, 0, arg16, arg19, arg6, arg4, arg17, arg13, arg2, arg12, arg9);
            for (int var26 = arg0; var26 >= 0; var26--) {
                if (this.field223[var26][arg1][arg2] == null) {
                    this.field223[var26][arg1][arg2] = new Tile(var26, arg1, arg2);
                }
            }
            this.field223[arg0][arg1][arg2].field419 = var25;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILeb;IIIIIB)V")
    public void method56(int arg0, Model arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        GroundDecor var9 = new GroundDecor();
        int var10 = 81 / arg3;
        var9.field130 = arg1;
        var9.field128 = arg0 * 128 + 64;
        var9.field129 = arg5 * 128 + 64;
        var9.field127 = arg6;
        var9.field131 = arg4;
        var9.field132 = arg7;
        if (this.field223[arg2][arg0][arg5] == null) {
            this.field223[arg2][arg0][arg5] = new Tile(arg2, arg0, arg5);
        }
        this.field223[arg2][arg0][arg5].field422 = var9;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIILeb;ILeb;Leb;I)V")
    public void method57(int arg0, int arg1, int arg2, int arg3, Model arg4, int arg5, Model arg6, Model arg7, int arg8) {
        GroundObject var10 = new GroundObject();
        var10.field136 = arg4;
        var10.field134 = arg2 * 128 + 64;
        var10.field135 = arg1 * 128 + 64;
        var10.field133 = arg5;
        var10.field139 = arg0;
        if (arg8 != 0) {
            return;
        }
        var10.field137 = arg7;
        var10.field138 = arg6;
        int var11 = 0;
        Tile var12 = this.field223[arg3][arg2][arg1];
        if (var12 != null) {
            for (int var13 = 0; var13 < var12.field424; var13++) {
                int var14 = var12.field425[var13].field190.field476;
                if (var14 > var11) {
                    var11 = var14;
                }
            }
        }
        var10.field140 = var11;
        if (this.field223[arg3][arg2][arg1] == null) {
            this.field223[arg3][arg2][arg1] = new Tile(arg3, arg2, arg1);
        }
        this.field223[arg3][arg2][arg1].field423 = var10;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIILeb;IIIILeb;B)V")
    public void method58(int arg0, int arg1, int arg2, int arg3, Model arg4, int arg5, int arg6, int arg7, int arg8, Model arg9, byte arg10) {
        if (arg9 == null && arg4 == null) {
            return;
        }
        Wall var12 = new Wall();
        if (arg6 >= 0) {
            this.field217 = 163;
        }
        var12.field208 = arg1;
        var12.field209 = arg10;
        var12.field202 = arg5 * 128 + 64;
        var12.field203 = arg7 * 128 + 64;
        var12.field201 = arg3;
        var12.field206 = arg9;
        var12.field207 = arg4;
        var12.field204 = arg8;
        var12.field205 = arg2;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (this.field223[var13][arg5][arg7] == null) {
                this.field223[var13][arg5][arg7] = new Tile(var13, arg5, arg7);
            }
        }
        this.field223[arg0][arg5][arg7].field420 = var12;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIBIIIBLeb;III)V")
    public void method59(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, byte arg7, Model arg8, int arg9, int arg10, int arg11) {
        if (arg8 == null) {
            return;
        }
        Decor var13 = new Decor();
        var13.field99 = arg6;
        var13.field100 = arg7;
        var13.field94 = arg0 * 128 + arg1 + 64;
        var13.field95 = arg10 * 128 + arg9 + 64;
        var13.field93 = arg2;
        var13.field98 = arg8;
        var13.field96 = arg4;
        if (arg3 != -44) {
            return;
        }
        var13.field97 = arg11;
        for (int var14 = arg5; var14 >= 0; var14--) {
            if (this.field223[var14][arg0][arg10] == null) {
                this.field223[var14][arg0][arg10] = new Tile(var14, arg0, arg10);
            }
        }
        this.field223[arg5][arg0][arg10].field421 = var13;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILw;IIIIIIILeb;BI)Z")
    public boolean method60(int arg0, Entity arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Model arg9, byte arg10, int arg11) {
        if (arg7 >= 0) {
            throw new NullPointerException();
        } else if (arg9 == null && arg1 == null) {
            return true;
        } else {
            int var13 = arg5 * 64 + arg11 * 128;
            int var14 = arg2 * 64 + arg4 * 128;
            return this.method63(arg3, arg11, arg4, arg5, arg2, var13, var14, arg8, arg9, arg1, arg6, false, arg0, arg10);
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIILeb;IZIIILw;I)Z")
    public boolean method61(int arg0, int arg1, int arg2, Model arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, Entity arg9, int arg10) {
        if (arg7 < 4 || arg7 > 4) {
            this.field217 = 58;
        }
        if (arg3 == null && arg9 == null) {
            return true;
        }
        int var12 = arg8 - arg1;
        int var13 = arg0 - arg1;
        int var14 = arg1 + arg8;
        int var15 = arg0 + arg1;
        if (arg5) {
            if (arg4 > 640 && arg4 < 1408) {
                var15 += 128;
            }
            if (arg4 > 1152 && arg4 < 1920) {
                var14 += 128;
            }
            if (arg4 > 1664 || arg4 < 384) {
                var13 -= 128;
            }
            if (arg4 > 128 && arg4 < 896) {
                var12 -= 128;
            }
        }
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        int var18 = var14 / 128;
        int var19 = var15 / 128;
        return this.method63(arg10, var16, var17, var18 + 1 - var16, var19 - var17 + 1, arg8, arg0, arg2, arg3, arg9, arg4, true, arg6, (byte) 0);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIILw;IIILeb;IIIIII)Z")
    public boolean method62(int arg0, int arg1, int arg2, Entity arg3, int arg4, int arg5, int arg6, Model arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        if (arg13 >= 0) {
            throw new NullPointerException();
        } else if (arg7 == null && arg3 == null) {
            return true;
        } else {
            return this.method63(arg2, arg11, arg1, arg0 + 1 - arg11, arg5 - arg1 + 1, arg9, arg6, arg4, arg7, arg3, arg12, true, arg10, (byte) 0);
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIIIILeb;Lw;IZIB)Z")
    public boolean method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Model arg8, Entity arg9, int arg10, boolean arg11, int arg12, byte arg13) {
        if (arg8 == null && arg9 == null) {
            return false;
        }
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var22 = arg2; var22 < arg2 + arg4; var22++) {
                if (var15 < 0 || var22 < 0 || var15 >= this.field220 || var22 >= this.field221) {
                    return false;
                }
                Tile var23 = this.field223[arg0][var15][var22];
                if (var23 != null && var23.field424 >= 5) {
                    return false;
                }
            }
        }
        Location var16 = new Location();
        var16.field199 = arg12;
        var16.field200 = arg13;
        var16.field186 = arg0;
        var16.field188 = arg5;
        var16.field189 = arg6;
        var16.field187 = arg7;
        var16.field190 = arg8;
        var16.field191 = arg9;
        var16.field192 = arg10;
        var16.field193 = arg1;
        var16.field195 = arg2;
        var16.field194 = arg1 + arg3 - 1;
        var16.field196 = arg2 + arg4 - 1;
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
                    if (this.field223[var20][var17][var18] == null) {
                        this.field223[var20][var17][var18] = new Tile(var20, var17, var18);
                    }
                }
                Tile var21 = this.field223[arg0][var17][var18];
                var21.field425[var21.field424] = var16;
                var21.field426[var21.field424] = var19;
                var21.field427 |= var19;
                var21.field424++;
            }
        }
        if (arg11) {
            this.field226[this.field225++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(I)V")
    public void method64(int arg0) {
        if (arg0 != 0) {
            return;
        }
        for (int var2 = 0; var2 < this.field225; var2++) {
            Location var3 = this.field226[var2];
            this.method65(true, var3);
            this.field226[var2] = null;
        }
        this.field225 = 0;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ZLp;)V")
    private void method65(boolean arg0, Location arg1) {
        for (int var3 = arg1.field193; var3 <= arg1.field194; var3++) {
            for (int var4 = arg1.field195; var4 <= arg1.field196; var4++) {
                Tile var5 = this.field223[arg1.field186][var3][var4];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field424; var6++) {
                        if (var5.field425[var6] == arg1) {
                            var5.field424--;
                            for (int var7 = var6; var7 < var5.field424; var7++) {
                                var5.field425[var7] = var5.field425[var7 + 1];
                                var5.field426[var7] = var5.field426[var7 + 1];
                            }
                            var5.field425[var5.field424] = null;
                            break;
                        }
                    }
                    var5.field427 = 0;
                    for (int var8 = 0; var8 < var5.field424; var8++) {
                        var5.field427 |= var5.field426[var8];
                    }
                }
            }
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IBILeb;I)V")
    public void method66(int arg0, byte arg1, int arg2, Model arg3, int arg4) {
        if (arg3 == null) {
            return;
        }
        Tile var6 = this.field223[arg2][arg0][arg4];
        if (arg1 != -46) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (var6 == null) {
            return;
        }
        for (int var8 = 0; var8 < var6.field424; var8++) {
            Location var9 = var6.field425[var8];
            if ((var9.field199 >> 29 & 0x3) == 2) {
                var9.field190 = arg3;
                return;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIBII)V")
    public void method67(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        Tile var6 = this.field223[arg1][arg4][arg3];
        if (var6 == null) {
            return;
        }
        Decor var7 = var6.field421;
        if (var7 == null) {
            return;
        }
        int var8 = arg4 * 128 + 64;
        int var9 = arg3 * 128 + 64;
        var7.field94 = (var7.field94 - var8) * arg0 / 16 + var8;
        var7.field95 = (var7.field95 - var9) * arg0 / 16 + var9;
        if (arg2 == 4) {
            ;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Leb;IZII)V")
    public void method68(Model arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        Tile var6 = this.field223[arg3][arg4][arg1];
        if (var6 != null) {
            Decor var7 = var6.field421;
            if (!arg2 && var7 != null) {
                var7.field98 = arg0;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIILeb;B)V")
    public void method69(int arg0, int arg1, int arg2, Model arg3, byte arg4) {
        if (arg3 == null) {
            return;
        }
        Tile var6 = this.field223[arg2][arg0][arg1];
        if (var6 == null) {
            return;
        }
        GroundDecor var7 = var6.field422;
        if (var7 != null) {
            var7.field130 = arg3;
            if (this.field212 == arg4) {
                ;
            }
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIILeb;B)V")
    public void method70(int arg0, int arg1, int arg2, Model arg3, byte arg4) {
        if (arg3 == null) {
            return;
        }
        Tile var6 = this.field223[arg2][arg1][arg0];
        if (arg4 != 8) {
            this.field217 = -238;
        }
        if (var6 != null) {
            Wall var7 = var6.field420;
            if (var7 != null) {
                var7.field206 = arg3;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ILeb;IIBLeb;)V")
    public void method71(int arg0, Model arg1, int arg2, int arg3, byte arg4, Model arg5) {
        if (arg1 == null) {
            return;
        }
        Tile var7 = this.field223[arg0][arg3][arg2];
        if (var7 == null) {
            return;
        }
        Wall var8 = var7.field420;
        if (arg4 != 4) {
            return;
        }
        boolean var9 = false;
        if (var8 != null) {
            var8.field206 = arg1;
            var8.field207 = arg5;
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIII)V")
    public void method72(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field223[arg2][arg3][arg1];
        if (arg0 == 0 && var5 != null) {
            var5.field420 = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIZI)V")
    public void method73(int arg0, int arg1, boolean arg2, int arg3) {
        Tile var5 = this.field223[arg0][arg3][arg1];
        if (!arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (var5 != null) {
            var5.field421 = null;
        }
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(IIII)V")
    public void method74(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field223[arg2][arg1][arg0];
        if (arg3 != -11465 || var5 == null) {
            return;
        }
        for (int var6 = 0; var6 < var5.field424; var6++) {
            Location var7 = var5.field425[var6];
            if ((var7.field199 >> 29 & 0x3) == 2 && var7.field193 == arg1 && var7.field195 == arg0) {
                this.method65(true, var7);
                return;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(ZIII)V")
    public void method75(boolean arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field223[arg3][arg2][arg1];
        if (arg0) {
            this.field216 = !this.field216;
        }
        if (var5 != null) {
            var5.field422 = null;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(III)V")
    public void method76(int arg0, int arg1, int arg2) {
        Tile var4 = this.field223[arg0][arg1][arg2];
        if (var4 != null) {
            var4.field423 = null;
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(III)I")
    public int method77(int arg0, int arg1, int arg2) {
        Tile var4 = this.field223[arg0][arg1][arg2];
        return var4 == null || var4.field420 == null ? 0 : var4.field420.field208;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IBII)I")
    public int method78(int arg0, byte arg1, int arg2, int arg3) {
        Tile var5 = this.field223[arg3][arg0][arg2];
        if (arg1 == 116) {
            return var5 == null || var5.field421 == null ? 0 : var5.field421.field99;
        } else {
            return this.field210;
        }
    }

    @OriginalMember(owner = "r", name = "c", descriptor = "(III)I")
    public int method79(int arg0, int arg1, int arg2) {
        Tile var4 = this.field223[arg0][arg1][arg2];
        if (var4 == null) {
            return 0;
        }
        for (int var5 = 0; var5 < var4.field424; var5++) {
            Location var6 = var4.field425[var5];
            if ((var6.field199 >> 29 & 0x3) == 2 && var6.field193 == arg1 && var6.field195 == arg2) {
                return var6.field199;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "r", name = "d", descriptor = "(III)I")
    public int method80(int arg0, int arg1, int arg2) {
        Tile var4 = this.field223[arg0][arg1][arg2];
        return var4 == null || var4.field422 == null ? 0 : var4.field422.field131;
    }

    @OriginalMember(owner = "r", name = "d", descriptor = "(IIII)I")
    public int method81(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field223[arg0][arg1][arg2];
        if (var5 == null) {
            return -1;
        } else if (var5.field420 != null && var5.field420.field208 == arg3) {
            return var5.field420.field209 & 0xFF;
        } else if (var5.field421 != null && var5.field421.field99 == arg3) {
            return var5.field421.field100 & 0xFF;
        } else if (var5.field422 != null && var5.field422.field131 == arg3) {
            return var5.field422.field132 & 0xFF;
        } else {
            for (int var6 = 0; var6 < var5.field424; var6++) {
                if (var5.field425[var6].field199 == arg3) {
                    return var5.field425[var6].field200 & 0xFF;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIB)V")
    public void method82(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var7 = (int) Math.sqrt((double) (arg0 * arg0 + arg1 * arg1 + arg3 * arg3));
        if (arg5 != 50) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = arg2 * var7 >> 8;
        for (int var10 = 0; var10 < this.field219; var10++) {
            for (int var11 = 0; var11 < this.field220; var11++) {
                for (int var12 = 0; var12 < this.field221; var12++) {
                    Tile var13 = this.field223[var10][var11][var12];
                    if (var13 != null) {
                        Wall var14 = var13.field420;
                        if (var14 != null && var14.field206 != null && var14.field206.field482 != null) {
                            this.method84(var12, 1, var14.field206, var11, 1, var10, -877);
                            if (var14.field207 != null && var14.field207.field482 != null) {
                                this.method84(var12, 1, var14.field207, var11, 1, var10, -877);
                                this.method85(var14.field206, var14.field207, 0, 0, 0, false);
                                var14.field207.method137(arg4, var9, arg3, arg1, arg0);
                            }
                            var14.field206.method137(arg4, var9, arg3, arg1, arg0);
                        }
                        for (int var15 = 0; var15 < var13.field424; var15++) {
                            Location var17 = var13.field425[var15];
                            if (var17 != null && var17.field190 != null && var17.field190.field482 != null) {
                                this.method84(var12, var17.field194 + 1 - var17.field193, var17.field190, var11, var17.field196 + 1 - var17.field195, var10, -877);
                                var17.field190.method137(arg4, var9, arg3, arg1, arg0);
                            }
                        }
                        GroundDecor var16 = var13.field422;
                        if (var16 != null && var16.field130.field482 != null) {
                            this.method83(var11, 5, var12, var16.field130, var10);
                            var16.field130.method137(arg4, var9, arg3, arg1, arg0);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIILeb;I)V")
    private void method83(int arg0, int arg1, int arg2, Model arg3, int arg4) {
        if (arg1 != 5) {
            return;
        }
        if (arg0 < this.field220) {
            Tile var6 = this.field223[arg4][arg0 + 1][arg2];
            if (var6 != null && var6.field422 != null && var6.field422.field130.field482 != null) {
                this.method85(arg3, var6.field422.field130, 128, 0, 0, true);
            }
        }
        if (arg2 < this.field220) {
            Tile var7 = this.field223[arg4][arg0][arg2 + 1];
            if (var7 != null && var7.field422 != null && var7.field422.field130.field482 != null) {
                this.method85(arg3, var7.field422.field130, 0, 0, 128, true);
            }
        }
        if (arg0 < this.field220 && arg2 < this.field221) {
            Tile var8 = this.field223[arg4][arg0 + 1][arg2 + 1];
            if (var8 != null && var8.field422 != null && var8.field422.field130.field482 != null) {
                this.method85(arg3, var8.field422.field130, 128, 0, 128, true);
            }
        }
        if (arg0 >= this.field220 || arg2 <= 0) {
            return;
        }
        Tile var9 = this.field223[arg4][arg0 + 1][arg2 - 1];
        if (var9 != null && var9.field422 != null && var9.field422.field130.field482 != null) {
            this.method85(arg3, var9.field422.field130, 128, 0, -128, true);
            return;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IILeb;IIII)V")
    private void method84(int arg0, int arg1, Model arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var8 = true;
        int var9 = arg3;
        int var10 = arg1 + arg3;
        int var11 = arg0 - 1;
        int var12 = arg0 + arg4;
        for (int var13 = arg5; var13 <= arg5 + 1; var13++) {
            if (this.field219 != var13) {
                for (int var14 = var9; var14 <= var10; var14++) {
                    if (var14 >= 0 && var14 < this.field220) {
                        for (int var15 = var11; var15 <= var12; var15++) {
                            if (var15 >= 0 && var15 < this.field221 && (!var8 || var14 >= var10 || var15 >= var12 || var15 < arg0 && arg3 != var14)) {
                                Tile var16 = this.field223[var13][var14][var15];
                                if (var16 != null) {
                                    int var17 = (this.field222[var13][var14 + 1][var15] + this.field222[var13][var14][var15] + this.field222[var13][var14][var15 + 1] + this.field222[var13][var14 + 1][var15 + 1]) / 4 - (this.field222[arg5][arg3 + 1][arg0] + this.field222[arg5][arg3][arg0] + this.field222[arg5][arg3][arg0 + 1] + this.field222[arg5][arg3 + 1][arg0 + 1]) / 4;
                                    Wall var18 = var16.field420;
                                    if (var18 != null && var18.field206 != null && var18.field206.field482 != null) {
                                        this.method85(arg2, var18.field206, (1 - arg1) * 64 + (var14 - arg3) * 128, var17, (var15 - arg0) * 128 + (1 - arg4) * 64, var8);
                                    }
                                    if (var18 != null && var18.field207 != null && var18.field207.field482 != null) {
                                        this.method85(arg2, var18.field207, (1 - arg1) * 64 + (var14 - arg3) * 128, var17, (var15 - arg0) * 128 + (1 - arg4) * 64, var8);
                                    }
                                    for (int var19 = 0; var19 < var16.field424; var19++) {
                                        Location var20 = var16.field425[var19];
                                        if (var20 != null && var20.field190 != null && var20.field190.field482 != null) {
                                            int var21 = var20.field194 + 1 - var20.field193;
                                            int var22 = var20.field196 + 1 - var20.field195;
                                            this.method85(arg2, var20.field190, (var20.field193 - arg3) * 128 + (var21 - arg1) * 64, var17, (var20.field195 - arg0) * 128 + (var22 - arg4) * 64, var8);
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
        if (arg6 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Leb;Leb;IIIZ)V")
    private void method85(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field270++;
        int var7 = 0;
        int[] var8 = arg1.field448;
        int var9 = arg1.field447;
        for (int var10 = 0; var10 < arg0.field447; var10++) {
            VertexNormal var13 = arg0.field482[var10];
            VertexNormal var14 = arg0.field483[var10];
            if (var14.field178 != 0) {
                int var15 = arg0.field449[var10] - arg3;
                if (var15 <= arg1.field473) {
                    int var16 = arg0.field448[var10] - arg2;
                    if (var16 >= arg1.field467 && var16 <= arg1.field468) {
                        int var17 = arg0.field450[var10] - arg4;
                        if (var17 >= arg1.field470 && var17 <= arg1.field469) {
                            for (int var18 = 0; var18 < var9; var18++) {
                                VertexNormal var19 = arg1.field482[var18];
                                VertexNormal var20 = arg1.field483[var18];
                                if (var8[var18] == var16 && arg1.field450[var18] == var17 && arg1.field449[var18] == var15 && var20.field178 != 0) {
                                    var13.field175 += var20.field175;
                                    var13.field176 += var20.field176;
                                    var13.field177 += var20.field177;
                                    var13.field178 += var20.field178;
                                    var19.field175 += var14.field175;
                                    var19.field176 += var14.field176;
                                    var19.field177 += var14.field177;
                                    var19.field178 += var14.field178;
                                    var7++;
                                    this.field268[var10] = this.field270;
                                    this.field269[var18] = this.field270;
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
        for (int var11 = 0; var11 < arg0.field451; var11++) {
            if (this.field268[arg0.field452[var11]] == this.field270 && this.field268[arg0.field453[var11]] == this.field270 && this.field268[arg0.field454[var11]] == this.field270) {
                arg0.field458[var11] = -1;
            }
        }
        for (int var12 = 0; var12 < arg1.field451; var12++) {
            if (this.field269[arg1.field452[var12]] == this.field270 && this.field269[arg1.field453[var12]] == this.field270 && this.field269[arg1.field454[var12]] == this.field270) {
                arg1.field458[var12] = -1;
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "([IIIIII)V")
    public void method86(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Tile var7 = this.field223[arg3][arg4][arg5];
        if (var7 == null) {
            return;
        }
        TileUnderlay var8 = var7.field418;
        if (var8 != null) {
            int var9 = var8.field185;
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
        TileOverlay var11 = var7.field419;
        if (var11 == null) {
            return;
        }
        int var12 = var11.field113;
        int var13 = var11.field114;
        int var14 = var11.field115;
        int var15 = var11.field116;
        int[] var16 = this.field271[var12];
        int[] var17 = this.field272[var13];
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

    @OriginalMember(owner = "r", name = "a", descriptor = "(I[IIBII)V")
    public static void method87(int arg0, int[] arg1, int arg2, byte arg3, int arg4, int arg5) {
        field277 = 0;
        field278 = 0;
        field279 = arg0;
        field280 = arg4;
        if (field213 != arg3) {
            return;
        }
        field275 = arg0 / 2;
        field276 = arg4 / 2;
        boolean[][][][] var6 = new boolean[9][32][53][53];
        for (int var7 = 128; var7 <= 384; var7 += 32) {
            for (int var15 = 0; var15 < 2048; var15 += 64) {
                field240 = Model.field525[var7];
                field241 = Model.field526[var7];
                field242 = Model.field525[var15];
                field243 = Model.field526[var15];
                int var16 = (var7 - 128) / 32;
                int var17 = var15 / 64;
                for (int var18 = -26; var18 <= 26; var18++) {
                    for (int var19 = -26; var19 <= 26; var19++) {
                        int var20 = var18 * 128;
                        int var21 = var19 * 128;
                        boolean var22 = false;
                        for (int var23 = -arg5; var23 <= arg2; var23 += 128) {
                            if (method88(var21, var20, true, arg1[var16] + var23)) {
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
                        field273[var8][var9][var10 + 25][var11 + 25] = var12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "b", descriptor = "(IIZI)Z")
    public static boolean method88(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            throw new NullPointerException();
        }
        int var4 = field243 * arg1 + field242 * arg0 >> 16;
        int var5 = field243 * arg0 - field242 * arg1 >> 16;
        int var6 = field241 * var5 + field240 * arg3 >> 16;
        int var7 = field241 * arg3 - field240 * var5 >> 16;
        if (var6 >= 50 && var6 <= 3500) {
            int var8 = (var4 << 9) / var6 + field275;
            int var9 = (var7 << 9) / var6 + field276;
            return var8 >= field277 && var8 <= field279 && var9 >= field278 && var9 <= field280;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IZI)V")
    public void method89(int arg0, boolean arg1, int arg2) {
        field249 = true;
        field250 = arg2;
        field251 = arg0;
        field252 = -1;
        if (arg1) {
            field253 = -1;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIIII)V")
    public void method90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 < 0) {
            arg1 = 0;
        } else if (arg1 >= this.field220 * 128) {
            arg1 = this.field220 * 128 - 1;
        }
        if (arg5 < 0) {
            arg5 = 0;
        } else if (arg5 >= this.field221 * 128) {
            arg5 = this.field221 * 128 - 1;
        }
        field230++;
        field240 = Model.field525[arg0];
        field241 = Model.field526[arg0];
        field242 = Model.field525[arg6];
        field243 = Model.field526[arg6];
        field274 = field273[(arg0 - 128) / 32][arg6 / 64];
        field237 = arg1;
        field238 = arg3;
        field239 = arg5;
        field235 = arg1 / 128;
        if (arg2 != 0) {
            this.field216 = !this.field216;
        }
        field236 = arg5 / 128;
        field229 = arg4;
        field231 = field235 - 25;
        if (field231 < 0) {
            field231 = 0;
        }
        field233 = field236 - 25;
        if (field233 < 0) {
            field233 = 0;
        }
        field232 = field235 + 25;
        if (field232 > this.field220) {
            field232 = this.field220;
        }
        field234 = field236 + 25;
        if (field234 > this.field221) {
            field234 = this.field221;
        }
        this.method96((byte) 69);
        field228 = 0;
        for (int var8 = this.field224; var8 < this.field219; var8++) {
            Tile[][] var33 = this.field223[var8];
            for (int var34 = field231; var34 < field232; var34++) {
                for (int var35 = field233; var35 < field234; var35++) {
                    Tile var36 = var33[var34][var35];
                    if (var36 != null) {
                        if (var36.field428 <= arg4 && (field274[var34 + 25 - field235][var35 + 25 - field236] || this.field222[var8][var34][var35] - arg3 >= 2000)) {
                            var36.field429 = true;
                            var36.field430 = true;
                            if (var36.field424 > 0) {
                                var36.field431 = true;
                            } else {
                                var36.field431 = false;
                            }
                            field228++;
                        } else {
                            var36.field429 = false;
                            var36.field430 = false;
                            var36.field432 = 0;
                        }
                    }
                }
            }
        }
        for (int var9 = this.field224; var9 < this.field219; var9++) {
            Tile[][] var22 = this.field223[var9];
            for (int var23 = -25; var23 <= 0; var23++) {
                int var24 = field235 + var23;
                int var25 = field235 - var23;
                if (var24 >= field231 || var25 < field232) {
                    for (int var26 = -25; var26 <= 0; var26++) {
                        int var27 = field236 + var26;
                        int var28 = field236 - var26;
                        if (var24 >= field231) {
                            if (var27 >= field233) {
                                Tile var29 = var22[var24][var27];
                                if (var29 != null && var29.field429) {
                                    this.method91(var29, true);
                                }
                            }
                            if (var28 < field234) {
                                Tile var30 = var22[var24][var28];
                                if (var30 != null && var30.field429) {
                                    this.method91(var30, true);
                                }
                            }
                        }
                        if (var25 < field232) {
                            if (var27 >= field233) {
                                Tile var31 = var22[var25][var27];
                                if (var31 != null && var31.field429) {
                                    this.method91(var31, true);
                                }
                            }
                            if (var28 < field234) {
                                Tile var32 = var22[var25][var28];
                                if (var32 != null && var32.field429) {
                                    this.method91(var32, true);
                                }
                            }
                        }
                        if (field228 == 0) {
                            field249 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var10 = this.field224; var10 < this.field219; var10++) {
            Tile[][] var11 = this.field223[var10];
            for (int var12 = -25; var12 <= 0; var12++) {
                int var13 = field235 + var12;
                int var14 = field235 - var12;
                if (var13 >= field231 || var14 < field232) {
                    for (int var15 = -25; var15 <= 0; var15++) {
                        int var16 = field236 + var15;
                        int var17 = field236 - var15;
                        if (var13 >= field231) {
                            if (var16 >= field233) {
                                Tile var18 = var11[var13][var16];
                                if (var18 != null && var18.field429) {
                                    this.method91(var18, false);
                                }
                            }
                            if (var17 < field234) {
                                Tile var19 = var11[var13][var17];
                                if (var19 != null && var19.field429) {
                                    this.method91(var19, false);
                                }
                            }
                        }
                        if (var14 < field232) {
                            if (var16 >= field233) {
                                Tile var20 = var11[var14][var16];
                                if (var20 != null && var20.field429) {
                                    this.method91(var20, false);
                                }
                            }
                            if (var17 < field234) {
                                Tile var21 = var11[var14][var17];
                                if (var21 != null && var21.field429) {
                                    this.method91(var21, false);
                                }
                            }
                        }
                        if (field228 == 0) {
                            field249 = false;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lcb;Z)V")
    public void method91(Tile arg0, boolean arg1) {
        field259.method225(arg0);
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
                                                var3 = (Tile) field259.method227();
                                                if (var3 == null) {
                                                    return;
                                                }
                                            } while (!var3.field430);
                                            var4 = var3.field415;
                                            var5 = var3.field416;
                                            var6 = var3.field414;
                                            var7 = var3.field417;
                                            var8 = this.field223[var6];
                                            if (!var3.field429) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var6 > 0) {
                                                    Tile var9 = this.field223[var6 - 1][var4][var5];
                                                    if (var9 != null && var9.field430) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= field235 && var4 > field231) {
                                                    Tile var10 = var8[var4 - 1][var5];
                                                    if (var10 != null && var10.field430 && (var10.field429 || (var3.field427 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= field235 && var4 < field232 - 1) {
                                                    Tile var11 = var8[var4 + 1][var5];
                                                    if (var11 != null && var11.field430 && (var11.field429 || (var3.field427 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 <= field236 && var5 > field233) {
                                                    Tile var12 = var8[var4][var5 - 1];
                                                    if (var12 != null && var12.field430 && (var12.field429 || (var3.field427 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 >= field236 && var5 < field234 - 1) {
                                                    Tile var13 = var8[var4][var5 + 1];
                                                    if (var13 != null && var13.field430 && (var13.field429 || (var3.field427 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var3.field429 = false;
                                            if (var3.field436 != null) {
                                                Tile var14 = var3.field436;
                                                if (var14.field418 == null) {
                                                    if (var14.field419 != null && !this.method97(0, var4, var5)) {
                                                        this.method93(var14.field419, field243, -2565, field240, var4, field241, var5, field242);
                                                    }
                                                } else if (!this.method97(0, var4, var5)) {
                                                    this.method92(var14.field418, 0, field240, field241, field242, field243, var4, var5);
                                                }
                                                Wall var15 = var14.field420;
                                                if (var15 != null) {
                                                    var15.field206.method140(0, field240, field241, field242, field243, var15.field202 - field237, var15.field201 - field238, var15.field203 - field239, var15.field208);
                                                }
                                                for (int var16 = 0; var16 < var14.field424; var16++) {
                                                    Location var17 = var14.field425[var16];
                                                    if (var17 != null) {
                                                        Model var18 = var17.field190;
                                                        if (var18 == null) {
                                                            var18 = var17.field191.method108(false);
                                                        }
                                                        var18.method140(var17.field192, field240, field241, field242, field243, var17.field188 - field237, var17.field187 - field238, var17.field189 - field239, var17.field199);
                                                    }
                                                }
                                            }
                                            boolean var19 = false;
                                            if (var3.field418 == null) {
                                                if (var3.field419 != null && !this.method97(var7, var4, var5)) {
                                                    var19 = true;
                                                    this.method93(var3.field419, field243, -2565, field240, var4, field241, var5, field242);
                                                }
                                            } else if (!this.method97(var7, var4, var5)) {
                                                var19 = true;
                                                this.method92(var3.field418, var7, field240, field241, field242, field243, var4, var5);
                                            }
                                            int var20 = 0;
                                            int var21 = 0;
                                            Wall var22 = var3.field420;
                                            Decor var23 = var3.field421;
                                            if (var22 != null || var23 != null) {
                                                if (field235 == var4) {
                                                    var20++;
                                                } else if (field235 < var4) {
                                                    var20 += 2;
                                                }
                                                if (field236 == var5) {
                                                    var20 += 3;
                                                } else if (field236 > var5) {
                                                    var20 += 6;
                                                }
                                                var21 = field260[var20];
                                                var3.field435 = field262[var20];
                                            }
                                            if (var22 != null) {
                                                if ((var22.field204 & field261[var20]) == 0) {
                                                    var3.field432 = 0;
                                                } else if (var22.field204 == 16) {
                                                    var3.field432 = 3;
                                                    var3.field433 = field263[var20];
                                                    var3.field434 = 3 - var3.field433;
                                                } else if (var22.field204 == 32) {
                                                    var3.field432 = 6;
                                                    var3.field433 = field264[var20];
                                                    var3.field434 = 6 - var3.field433;
                                                } else if (var22.field204 == 64) {
                                                    var3.field432 = 12;
                                                    var3.field433 = field265[var20];
                                                    var3.field434 = 12 - var3.field433;
                                                } else {
                                                    var3.field432 = 9;
                                                    var3.field433 = field266[var20];
                                                    var3.field434 = 9 - var3.field433;
                                                }
                                                if ((var22.field204 & var21) != 0 && !this.method98(var7, var4, var5, var22.field204)) {
                                                    var22.field206.method140(0, field240, field241, field242, field243, var22.field202 - field237, var22.field201 - field238, var22.field203 - field239, var22.field208);
                                                }
                                                if ((var22.field205 & var21) != 0 && !this.method98(var7, var4, var5, var22.field205)) {
                                                    var22.field207.method140(0, field240, field241, field242, field243, var22.field202 - field237, var22.field201 - field238, var22.field203 - field239, var22.field208);
                                                }
                                            }
                                            if (var23 != null && !this.method99(var7, var4, var5, var23.field98.field472)) {
                                                if ((var23.field96 & var21) != 0) {
                                                    var23.field98.method140(var23.field97, field240, field241, field242, field243, var23.field94 - field237, var23.field93 - field238, var23.field95 - field239, var23.field99);
                                                } else if ((var23.field96 & 0x300) != 0) {
                                                    int var24 = var23.field94 - field237;
                                                    int var25 = var23.field93 - field238;
                                                    int var26 = var23.field95 - field239;
                                                    int var27 = var23.field97;
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
                                                    if ((var23.field96 & 0x100) != 0 && var29 < var28) {
                                                        int var30 = field245[var27] + var24;
                                                        int var31 = field246[var27] + var26;
                                                        var23.field98.method140(var27 * 512 + 256, field240, field241, field242, field243, var30, var25, var31, var23.field99);
                                                    }
                                                    if ((var23.field96 & 0x200) != 0 && var29 > var28) {
                                                        int var32 = field247[var27] + var24;
                                                        int var33 = field248[var27] + var26;
                                                        var23.field98.method140(var27 * 512 + 1280 & 0x7FF, field240, field241, field242, field243, var32, var25, var33, var23.field99);
                                                    }
                                                }
                                            }
                                            if (var19) {
                                                GroundDecor var34 = var3.field422;
                                                if (var34 != null) {
                                                    var34.field130.method140(0, field240, field241, field242, field243, var34.field128 - field237, var34.field127 - field238, var34.field129 - field239, var34.field131);
                                                }
                                                GroundObject var35 = var3.field423;
                                                if (var35 != null && var35.field140 == 0) {
                                                    if (var35.field137 != null) {
                                                        var35.field137.method140(0, field240, field241, field242, field243, var35.field134 - field237, var35.field133 - field238, var35.field135 - field239, var35.field139);
                                                    }
                                                    if (var35.field138 != null) {
                                                        var35.field138.method140(0, field240, field241, field242, field243, var35.field134 - field237, var35.field133 - field238, var35.field135 - field239, var35.field139);
                                                    }
                                                    if (var35.field136 != null) {
                                                        var35.field136.method140(0, field240, field241, field242, field243, var35.field134 - field237, var35.field133 - field238, var35.field135 - field239, var35.field139);
                                                    }
                                                }
                                            }
                                            int var36 = var3.field427;
                                            if (var36 != 0) {
                                                if (var4 < field235 && (var36 & 0x4) != 0) {
                                                    Tile var37 = var8[var4 + 1][var5];
                                                    if (var37 != null && var37.field430) {
                                                        field259.method225(var37);
                                                    }
                                                }
                                                if (var5 < field236 && (var36 & 0x2) != 0) {
                                                    Tile var38 = var8[var4][var5 + 1];
                                                    if (var38 != null && var38.field430) {
                                                        field259.method225(var38);
                                                    }
                                                }
                                                if (var4 > field235 && (var36 & 0x1) != 0) {
                                                    Tile var39 = var8[var4 - 1][var5];
                                                    if (var39 != null && var39.field430) {
                                                        field259.method225(var39);
                                                    }
                                                }
                                                if (var5 > field236 && (var36 & 0x8) != 0) {
                                                    Tile var40 = var8[var4][var5 - 1];
                                                    if (var40 != null && var40.field430) {
                                                        field259.method225(var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var3.field432 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var3.field424; var42++) {
                                                if (field230 != var3.field425[var42].field198 && (var3.field426[var42] & var3.field432) == var3.field433) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                Wall var43 = var3.field420;
                                                if (!this.method98(var7, var4, var5, var43.field204)) {
                                                    var43.field206.method140(0, field240, field241, field242, field243, var43.field202 - field237, var43.field201 - field238, var43.field203 - field239, var43.field208);
                                                }
                                                var3.field432 = 0;
                                            }
                                        }
                                        if (!var3.field431) {
                                            break;
                                        }
                                        int var44 = var3.field424;
                                        var3.field431 = false;
                                        int var45 = 0;
                                        label566: for (int var46 = 0; var46 < var44; var46++) {
                                            Location var56 = var3.field425[var46];
                                            if (field230 != var56.field198) {
                                                for (int var57 = var56.field193; var57 <= var56.field194; var57++) {
                                                    for (int var62 = var56.field195; var62 <= var56.field196; var62++) {
                                                        Tile var63 = var8[var57][var62];
                                                        if (var63.field429) {
                                                            var3.field431 = true;
                                                            continue label566;
                                                        }
                                                        if (var63.field432 != 0) {
                                                            int var64 = 0;
                                                            if (var57 > var56.field193) {
                                                                var64++;
                                                            }
                                                            if (var57 < var56.field194) {
                                                                var64 += 4;
                                                            }
                                                            if (var62 > var56.field195) {
                                                                var64 += 8;
                                                            }
                                                            if (var62 < var56.field196) {
                                                                var64 += 2;
                                                            }
                                                            if ((var64 & var63.field432) == var3.field434) {
                                                                var3.field431 = true;
                                                                continue label566;
                                                            }
                                                        }
                                                    }
                                                }
                                                field244[var45++] = var56;
                                                int var58 = field235 - var56.field193;
                                                int var59 = var56.field194 - field235;
                                                if (var59 > var58) {
                                                    var58 = var59;
                                                }
                                                int var60 = field236 - var56.field195;
                                                int var61 = var56.field196 - field236;
                                                if (var61 > var60) {
                                                    var56.field197 = var58 + var61;
                                                } else {
                                                    var56.field197 = var58 + var60;
                                                }
                                            }
                                        }
                                        while (var45 > 0) {
                                            int var47 = -50;
                                            int var48 = -1;
                                            for (int var49 = 0; var49 < var45; var49++) {
                                                Location var55 = field244[var49];
                                                if (var55.field197 > var47 && field230 != var55.field198) {
                                                    var47 = var55.field197;
                                                    var48 = var49;
                                                }
                                            }
                                            if (var48 == -1) {
                                                break;
                                            }
                                            Location var50 = field244[var48];
                                            var50.field198 = field230;
                                            Model var51 = var50.field190;
                                            if (var51 == null) {
                                                var51 = var50.field191.method108(false);
                                            }
                                            if (!this.method100(var7, var50.field193, var50.field194, var50.field195, var50.field196, var51.field472)) {
                                                var51.method140(var50.field192, field240, field241, field242, field243, var50.field188 - field237, var50.field187 - field238, var50.field189 - field239, var50.field199);
                                            }
                                            for (int var52 = var50.field193; var52 <= var50.field194; var52++) {
                                                for (int var53 = var50.field195; var53 <= var50.field196; var53++) {
                                                    Tile var54 = var8[var52][var53];
                                                    if (var54.field432 != 0) {
                                                        field259.method225(var54);
                                                    } else if ((var4 != var52 || var5 != var53) && var54.field430) {
                                                        field259.method225(var54);
                                                    }
                                                }
                                            }
                                        }
                                        if (!var3.field431) {
                                            break;
                                        }
                                    }
                                } while (!var3.field430);
                            } while (var3.field432 != 0);
                            if (var4 > field235 || var4 <= field231) {
                                break;
                            }
                            var65 = var8[var4 - 1][var5];
                        } while (var65 != null && var65.field430);
                        if (var4 < field235 || var4 >= field232 - 1) {
                            break;
                        }
                        var66 = var8[var4 + 1][var5];
                    } while (var66 != null && var66.field430);
                    if (var5 > field236 || var5 <= field233) {
                        break;
                    }
                    var67 = var8[var4][var5 - 1];
                } while (var67 != null && var67.field430);
                if (var5 < field236 || var5 >= field234 - 1) {
                    break;
                }
                var68 = var8[var4][var5 + 1];
            } while (var68 != null && var68.field430);
            var3.field430 = false;
            field228--;
            GroundObject var69 = var3.field423;
            if (var69 != null && var69.field140 != 0) {
                if (var69.field137 != null) {
                    var69.field137.method140(0, field240, field241, field242, field243, var69.field134 - field237, var69.field133 - field238 - var69.field140, var69.field135 - field239, var69.field139);
                }
                if (var69.field138 != null) {
                    var69.field138.method140(0, field240, field241, field242, field243, var69.field134 - field237, var69.field133 - field238 - var69.field140, var69.field135 - field239, var69.field139);
                }
                if (var69.field136 != null) {
                    var69.field136.method140(0, field240, field241, field242, field243, var69.field134 - field237, var69.field133 - field238 - var69.field140, var69.field135 - field239, var69.field139);
                }
            }
            if (var3.field435 != 0) {
                Decor var70 = var3.field421;
                if (var70 != null && !this.method99(var7, var4, var5, var70.field98.field472)) {
                    if ((var70.field96 & var3.field435) != 0) {
                        var70.field98.method140(var70.field97, field240, field241, field242, field243, var70.field94 - field237, var70.field93 - field238, var70.field95 - field239, var70.field99);
                    } else if ((var70.field96 & 0x300) != 0) {
                        int var71 = var70.field94 - field237;
                        int var72 = var70.field93 - field238;
                        int var73 = var70.field95 - field239;
                        int var74 = var70.field97;
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
                        if ((var70.field96 & 0x100) != 0 && var76 >= var75) {
                            int var77 = field245[var74] + var71;
                            int var78 = field246[var74] + var73;
                            var70.field98.method140(var74 * 512 + 256, field240, field241, field242, field243, var77, var72, var78, var70.field99);
                        }
                        if ((var70.field96 & 0x200) != 0 && var76 <= var75) {
                            int var79 = field247[var74] + var71;
                            int var80 = field248[var74] + var73;
                            var70.field98.method140(var74 * 512 + 1280 & 0x7FF, field240, field241, field242, field243, var79, var72, var80, var70.field99);
                        }
                    }
                }
                Wall var81 = var3.field420;
                if (var81 != null) {
                    if ((var81.field205 & var3.field435) != 0 && !this.method98(var7, var4, var5, var81.field205)) {
                        var81.field207.method140(0, field240, field241, field242, field243, var81.field202 - field237, var81.field201 - field238, var81.field203 - field239, var81.field208);
                    }
                    if ((var81.field204 & var3.field435) != 0 && !this.method98(var7, var4, var5, var81.field204)) {
                        var81.field206.method140(0, field240, field241, field242, field243, var81.field202 - field237, var81.field201 - field238, var81.field203 - field239, var81.field208);
                    }
                }
            }
            if (var6 < this.field219 - 1) {
                Tile var82 = this.field223[var6 + 1][var4][var5];
                if (var82 != null && var82.field430) {
                    field259.method225(var82);
                }
            }
            if (var4 < field235) {
                Tile var83 = var8[var4 + 1][var5];
                if (var83 != null && var83.field430) {
                    field259.method225(var83);
                }
            }
            if (var5 < field236) {
                Tile var84 = var8[var4][var5 + 1];
                if (var84 != null && var84.field430) {
                    field259.method225(var84);
                }
            }
            if (var4 > field235) {
                Tile var85 = var8[var4 - 1][var5];
                if (var85 != null && var85.field430) {
                    field259.method225(var85);
                }
            }
            if (var5 > field236) {
                Tile var86 = var8[var4][var5 - 1];
                if (var86 != null && var86.field430) {
                    field259.method225(var86);
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lo;IIIIIII)V")
    public void method92(TileUnderlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9;
        int var10 = var9 = (arg6 << 7) - field237;
        int var11;
        int var12 = var11 = (arg7 << 7) - field239;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = this.field222[arg1][arg6][arg7] - field238;
        int var18 = this.field222[arg1][arg6 + 1][arg7] - field238;
        int var19 = this.field222[arg1][arg6 + 1][arg7 + 1] - field238;
        int var20 = this.field222[arg1][arg6][arg7 + 1] - field238;
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
        int var45 = (var21 << 9) / var25 + Pix3D.field551;
        int var46 = (var24 << 9) / var25 + Pix3D.field552;
        int var47 = (var27 << 9) / var31 + Pix3D.field551;
        int var48 = (var30 << 9) / var31 + Pix3D.field552;
        int var49 = (var33 << 9) / var37 + Pix3D.field551;
        int var50 = (var36 << 9) / var37 + Pix3D.field552;
        int var51 = (var39 << 9) / var43 + Pix3D.field551;
        int var52 = (var42 << 9) / var43 + Pix3D.field552;
        Pix3D.field550 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            Pix3D.field547 = false;
            if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > Pix2D.field539 || var51 > Pix2D.field539 || var47 > Pix2D.field539) {
                Pix3D.field547 = true;
            }
            if (field249 && this.method95(field250, field251, var50, var52, var48, var49, var51, var47)) {
                field252 = arg6;
                field253 = arg7;
            }
            if (arg0.field183 == -1) {
                if (arg0.field181 != 12345678) {
                    Pix3D.method164(var50, var52, var48, var49, var51, var47, arg0.field181, arg0.field182, arg0.field180);
                }
            } else if (field218) {
                int var53 = field267[arg0.field183];
                Pix3D.method164(var50, var52, var48, var49, var51, var47, this.method94(var53, arg0.field181, this.field215), this.method94(var53, arg0.field182, this.field215), this.method94(var53, arg0.field180, this.field215));
            } else if (arg0.field184) {
                Pix3D.method168(var50, var52, var48, var49, var51, var47, arg0.field181, arg0.field182, arg0.field180, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field183);
            } else {
                Pix3D.method168(var50, var52, var48, var49, var51, var47, arg0.field181, arg0.field182, arg0.field180, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field183);
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        Pix3D.field547 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Pix2D.field539 || var47 > Pix2D.field539 || var51 > Pix2D.field539) {
            Pix3D.field547 = true;
        }
        if (field249 && this.method95(field250, field251, var46, var48, var52, var45, var47, var51)) {
            field252 = arg6;
            field253 = arg7;
        }
        if (arg0.field183 != -1) {
            if (!field218) {
                Pix3D.method168(var46, var48, var52, var45, var47, var51, arg0.field179, arg0.field180, arg0.field182, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field183);
                return;
            }
            int var54 = field267[arg0.field183];
            Pix3D.method164(var46, var48, var52, var45, var47, var51, this.method94(var54, arg0.field179, this.field215), this.method94(var54, arg0.field180, this.field215), this.method94(var54, arg0.field182, this.field215));
        } else if (arg0.field179 != 12345678) {
            Pix3D.method164(var46, var48, var52, var45, var47, var51, arg0.field179, arg0.field180, arg0.field182);
            return;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Li;IIIIIII)V")
    public void method93(TileOverlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg0.field102.length;
        for (int var10 = 0; var10 < var9; var10++) {
            int var24 = arg0.field102[var10] - field237;
            int var25 = arg0.field103[var10] - field238;
            int var26 = arg0.field104[var10] - field239;
            int var27 = arg1 * var24 + arg7 * var26 >> 16;
            int var28 = arg1 * var26 - arg7 * var24 >> 16;
            int var30 = arg5 * var25 - arg3 * var28 >> 16;
            int var31 = arg3 * var25 + arg5 * var28 >> 16;
            if (var31 < 50) {
                return;
            }
            if (arg0.field111 != null) {
                TileOverlay.field119[var10] = var27;
                TileOverlay.field120[var10] = var30;
                TileOverlay.field121[var10] = var31;
            }
            TileOverlay.field117[var10] = (var27 << 9) / var31 + Pix3D.field551;
            TileOverlay.field118[var10] = (var30 << 9) / var31 + Pix3D.field552;
        }
        Pix3D.field550 = 0;
        if (arg2 != -2565) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = arg0.field108.length;
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg0.field108[var13];
            int var15 = arg0.field109[var13];
            int var16 = arg0.field110[var13];
            int var17 = TileOverlay.field117[var14];
            int var18 = TileOverlay.field117[var15];
            int var19 = TileOverlay.field117[var16];
            int var20 = TileOverlay.field118[var14];
            int var21 = TileOverlay.field118[var15];
            int var22 = TileOverlay.field118[var16];
            if ((var17 - var18) * (var22 - var21) - (var19 - var18) * (var20 - var21) > 0) {
                Pix3D.field547 = false;
                if (var17 < 0 || var18 < 0 || var19 < 0 || var17 > Pix2D.field539 || var18 > Pix2D.field539 || var19 > Pix2D.field539) {
                    Pix3D.field547 = true;
                }
                if (field249 && this.method95(field250, field251, var20, var21, var22, var17, var18, var19)) {
                    field252 = arg4;
                    field253 = arg6;
                }
                if (arg0.field111 == null || arg0.field111[var13] == -1) {
                    if (arg0.field105[var13] != 12345678) {
                        Pix3D.method164(var20, var21, var22, var17, var18, var19, arg0.field105[var13], arg0.field106[var13], arg0.field107[var13]);
                    }
                } else if (field218) {
                    int var23 = field267[arg0.field111[var13]];
                    Pix3D.method164(var20, var21, var22, var17, var18, var19, this.method94(var23, arg0.field105[var13], this.field215), this.method94(var23, arg0.field106[var13], this.field215), this.method94(var23, arg0.field107[var13], this.field215));
                } else if (arg0.field112) {
                    Pix3D.method168(var20, var21, var22, var17, var18, var19, arg0.field105[var13], arg0.field106[var13], arg0.field107[var13], TileOverlay.field119[0], TileOverlay.field119[1], TileOverlay.field119[3], TileOverlay.field120[0], TileOverlay.field120[1], TileOverlay.field120[3], TileOverlay.field121[0], TileOverlay.field121[1], TileOverlay.field121[3], arg0.field111[var13]);
                } else {
                    Pix3D.method168(var20, var21, var22, var17, var18, var19, arg0.field105[var13], arg0.field106[var13], arg0.field107[var13], TileOverlay.field119[var14], TileOverlay.field119[var15], TileOverlay.field119[var16], TileOverlay.field120[var14], TileOverlay.field120[var15], TileOverlay.field120[var16], TileOverlay.field121[var14], TileOverlay.field121[var15], TileOverlay.field121[var16], arg0.field111[var13]);
                }
            }
        }
    }

    @OriginalMember(owner = "r", name = "e", descriptor = "(III)I")
    public int method94(int arg0, int arg1, int arg2) {
        int var4 = 127 - arg1;
        if (arg2 <= 0) {
            return this.field210;
        }
        int var5 = (arg0 & 0x7F) * var4 / 160;
        if (var5 < 2) {
            var5 = 2;
        } else if (var5 > 126) {
            var5 = 126;
        }
        return (arg0 & 0xFF80) + var5;
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

    @OriginalMember(owner = "r", name = "a", descriptor = "(B)V")
    private void method96(byte arg0) {
        int var2 = field255[field229];
        Occlude[] var3 = field256[field229];
        field257 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            Occlude var5 = var3[var4];
            if (var5.field161 == 1) {
                int var6 = var5.field157 + 25 - field235;
                if (var6 >= 0 && var6 <= 50) {
                    int var7 = var5.field159 + 25 - field236;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = var5.field160 + 25 - field236;
                    if (var8 > 50) {
                        var8 = 50;
                    }
                    boolean var9 = false;
                    while (var7 <= var8) {
                        if (field274[var6][var7++]) {
                            var9 = true;
                            break;
                        }
                    }
                    if (var9) {
                        int var10 = field237 - var5.field162;
                        if (var10 > 32) {
                            var5.field168 = 1;
                        } else {
                            if (var10 >= -32) {
                                continue;
                            }
                            var5.field168 = 2;
                            var10 = -var10;
                        }
                        var5.field171 = (var5.field164 - field239 << 8) / var10;
                        var5.field172 = (var5.field165 - field239 << 8) / var10;
                        var5.field173 = (var5.field166 - field238 << 8) / var10;
                        var5.field174 = (var5.field167 - field238 << 8) / var10;
                        field258[field257++] = var5;
                    }
                }
            } else if (var5.field161 == 2) {
                int var11 = var5.field159 + 25 - field236;
                if (var11 >= 0 && var11 <= 50) {
                    int var12 = var5.field157 + 25 - field235;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = var5.field158 + 25 - field235;
                    if (var13 > 50) {
                        var13 = 50;
                    }
                    boolean var14 = false;
                    while (var12 <= var13) {
                        if (field274[var12++][var11]) {
                            var14 = true;
                            break;
                        }
                    }
                    if (var14) {
                        int var15 = field239 - var5.field164;
                        if (var15 > 32) {
                            var5.field168 = 3;
                        } else {
                            if (var15 >= -32) {
                                continue;
                            }
                            var5.field168 = 4;
                            var15 = -var15;
                        }
                        var5.field169 = (var5.field162 - field237 << 8) / var15;
                        var5.field170 = (var5.field163 - field237 << 8) / var15;
                        var5.field173 = (var5.field166 - field238 << 8) / var15;
                        var5.field174 = (var5.field167 - field238 << 8) / var15;
                        field258[field257++] = var5;
                    }
                }
            } else if (var5.field161 == 4) {
                int var16 = var5.field166 - field238;
                if (var16 > 128) {
                    int var17 = var5.field159 + 25 - field236;
                    if (var17 < 0) {
                        var17 = 0;
                    }
                    int var18 = var5.field160 + 25 - field236;
                    if (var18 > 50) {
                        var18 = 50;
                    }
                    if (var17 <= var18) {
                        int var19 = var5.field157 + 25 - field235;
                        if (var19 < 0) {
                            var19 = 0;
                        }
                        int var20 = var5.field158 + 25 - field235;
                        if (var20 > 50) {
                            var20 = 50;
                        }
                        boolean var21 = false;
                        label154: for (int var22 = var19; var22 <= var20; var22++) {
                            for (int var23 = var17; var23 <= var18; var23++) {
                                if (field274[var22][var23]) {
                                    var21 = true;
                                    break label154;
                                }
                            }
                        }
                        if (var21) {
                            var5.field168 = 5;
                            var5.field169 = (var5.field162 - field237 << 8) / var16;
                            var5.field170 = (var5.field163 - field237 << 8) / var16;
                            var5.field171 = (var5.field164 - field239 << 8) / var16;
                            var5.field172 = (var5.field165 - field239 << 8) / var16;
                            field258[field257++] = var5;
                        }
                    }
                }
            }
        }
        if (arg0 != 69) {
            this.field216 = !this.field216;
        }
    }

    @OriginalMember(owner = "r", name = "f", descriptor = "(III)Z")
    private boolean method97(int arg0, int arg1, int arg2) {
        int var4 = this.field227[arg0][arg1][arg2];
        if (-field230 == var4) {
            return false;
        } else if (field230 == var4) {
            return true;
        } else {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            if (this.method101(var5 + 1, this.field222[arg0][arg1][arg2], var6 + 1) && this.method101(var5 + 128 - 1, this.field222[arg0][arg1 + 1][arg2], var6 + 1) && this.method101(var5 + 128 - 1, this.field222[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.method101(var5 + 1, this.field222[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
                this.field227[arg0][arg1][arg2] = field230;
                return true;
            } else {
                this.field227[arg0][arg1][arg2] = -field230;
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
        int var7 = this.field222[arg0][arg1][arg2] - 1;
        int var8 = var7 - 120;
        int var9 = var7 - 230;
        int var10 = var7 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var5 > field237) {
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
                if (var6 < field239) {
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
                if (var5 < field237) {
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
                if (var6 > field239) {
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
            return this.method101(var5 + 1, this.field222[arg0][arg1][arg2] - arg3, var6 + 1) && this.method101(var5 + 128 - 1, this.field222[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method101(var5 + 128 - 1, this.field222[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method101(var5 + 1, this.field222[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(IIIIII)Z")
    private boolean method100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var9 = arg1; var9 <= arg2; var9++) {
                for (int var15 = arg3; var15 <= arg4; var15++) {
                    if (this.field227[arg0][var9][var15] == -field230) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = this.field222[arg0][arg1][arg3] - arg5;
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
            return this.method101(var7 + 1, this.field222[arg0][arg1][arg3] - arg5, var8 + 1) && this.method101(var7 + 128 - 1, this.field222[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.method101(var7 + 128 - 1, this.field222[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.method101(var7 + 1, this.field222[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "r", name = "g", descriptor = "(III)Z")
    private boolean method101(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < field257; var4++) {
            Occlude var5 = field258[var4];
            if (var5.field168 == 1) {
                int var6 = var5.field162 - arg0;
                if (var6 > 0) {
                    int var7 = (var5.field171 * var6 >> 8) + var5.field164;
                    int var8 = (var5.field172 * var6 >> 8) + var5.field165;
                    int var9 = (var5.field173 * var6 >> 8) + var5.field166;
                    int var10 = (var5.field174 * var6 >> 8) + var5.field167;
                    if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field168 == 2) {
                int var11 = arg0 - var5.field162;
                if (var11 > 0) {
                    int var12 = (var5.field171 * var11 >> 8) + var5.field164;
                    int var13 = (var5.field172 * var11 >> 8) + var5.field165;
                    int var14 = (var5.field173 * var11 >> 8) + var5.field166;
                    int var15 = (var5.field174 * var11 >> 8) + var5.field167;
                    if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
                        return true;
                    }
                }
            } else if (var5.field168 == 3) {
                int var16 = var5.field164 - arg2;
                if (var16 > 0) {
                    int var17 = (var5.field169 * var16 >> 8) + var5.field162;
                    int var18 = (var5.field170 * var16 >> 8) + var5.field163;
                    int var19 = (var5.field173 * var16 >> 8) + var5.field166;
                    int var20 = (var5.field174 * var16 >> 8) + var5.field167;
                    if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
                        return true;
                    }
                }
            } else if (var5.field168 == 4) {
                int var21 = arg2 - var5.field164;
                if (var21 > 0) {
                    int var22 = (var5.field169 * var21 >> 8) + var5.field162;
                    int var23 = (var5.field170 * var21 >> 8) + var5.field163;
                    int var24 = (var5.field173 * var21 >> 8) + var5.field166;
                    int var25 = (var5.field174 * var21 >> 8) + var5.field167;
                    if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
                        return true;
                    }
                }
            } else if (var5.field168 == 5) {
                int var26 = arg1 - var5.field166;
                if (var26 > 0) {
                    int var27 = (var5.field169 * var26 >> 8) + var5.field162;
                    int var28 = (var5.field170 * var26 >> 8) + var5.field163;
                    int var29 = (var5.field171 * var26 >> 8) + var5.field164;
                    int var30 = (var5.field172 * var26 >> 8) + var5.field165;
                    if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
