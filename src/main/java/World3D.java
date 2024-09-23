import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("q")
public class World3D {

    @OriginalMember(owner = "q", name = "a", descriptor = "I")
    private int field196 = 8;

    @OriginalMember(owner = "q", name = "b", descriptor = "Z")
    private boolean field197 = false;

    @OriginalMember(owner = "q", name = "c", descriptor = "Z")
    private boolean field198 = false;

    @OriginalMember(owner = "q", name = "d", descriptor = "B")
    private byte field199 = 2;

    @OriginalMember(owner = "q", name = "f", descriptor = "B")
    private byte field201 = 6;

    @OriginalMember(owner = "q", name = "o", descriptor = "[Lo;")
    public Location[] field210 = new Location[5000];

    @OriginalMember(owner = "q", name = "eb", descriptor = "[I")
    public int[] field252 = new int[10000];

    @OriginalMember(owner = "q", name = "fb", descriptor = "[I")
    public int[] field253 = new int[10000];

    @OriginalMember(owner = "q", name = "hb", descriptor = "[[I")
    public int[][] field255 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "q", name = "ib", descriptor = "[[I")
    public int[][] field256 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "q", name = "h", descriptor = "I")
    public int field203;

    @OriginalMember(owner = "q", name = "i", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "q", name = "j", descriptor = "I")
    public int field205;

    @OriginalMember(owner = "q", name = "l", descriptor = "[[[Lbb;")
    public Tile[][][] field207;

    @OriginalMember(owner = "q", name = "p", descriptor = "[[[I")
    public int[][][] field211;

    @OriginalMember(owner = "q", name = "k", descriptor = "[[[I")
    public int[][][] field206;

    @OriginalMember(owner = "q", name = "g", descriptor = "Z")
    public static boolean field202 = true;

    @OriginalMember(owner = "q", name = "G", descriptor = "[Lo;")
    public static Location[] field228 = new Location[100];

    @OriginalMember(owner = "q", name = "H", descriptor = "[I")
    public static final int[] field229 = new int[] { 53, -53, -53, 53 };

    @OriginalMember(owner = "q", name = "I", descriptor = "[I")
    public static final int[] field230 = new int[] { -53, -53, 53, 53 };

    @OriginalMember(owner = "q", name = "J", descriptor = "[I")
    public static final int[] field231 = new int[] { -45, 45, 45, -45 };

    @OriginalMember(owner = "q", name = "K", descriptor = "[I")
    public static final int[] field232 = new int[] { 45, 45, -45, -45 };

    @OriginalMember(owner = "q", name = "O", descriptor = "I")
    public static int field236 = -1;

    @OriginalMember(owner = "q", name = "P", descriptor = "I")
    public static int field237 = -1;

    @OriginalMember(owner = "q", name = "Q", descriptor = "I")
    public static int field238 = 4;

    @OriginalMember(owner = "q", name = "R", descriptor = "[I")
    public static int[] field239 = new int[field238];

    @OriginalMember(owner = "q", name = "S", descriptor = "[[Ll;")
    public static Occlude[][] field240 = new Occlude[field238][500];

    @OriginalMember(owner = "q", name = "U", descriptor = "[Ll;")
    public static Occlude[] field242 = new Occlude[500];

    @OriginalMember(owner = "q", name = "V", descriptor = "Lnb;")
    public static LinkList field243 = new LinkList(845);

    @OriginalMember(owner = "q", name = "W", descriptor = "[I")
    public static final int[] field244 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "q", name = "X", descriptor = "[I")
    public static final int[] field245 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "q", name = "Y", descriptor = "[I")
    public static final int[] field246 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "q", name = "Z", descriptor = "[I")
    public static final int[] field247 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "q", name = "ab", descriptor = "[I")
    public static final int[] field248 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "q", name = "bb", descriptor = "[I")
    public static final int[] field249 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "q", name = "cb", descriptor = "[I")
    public static final int[] field250 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "q", name = "db", descriptor = "[I")
    public static final int[] field251 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

    @OriginalMember(owner = "q", name = "jb", descriptor = "[[[[Z")
    public static boolean[][][][] field257 = new boolean[8][32][51][51];

    @OriginalMember(owner = "q", name = "e", descriptor = "I")
    private static int field200;

    @OriginalMember(owner = "q", name = "m", descriptor = "I")
    public int field208;

    @OriginalMember(owner = "q", name = "n", descriptor = "I")
    public int field209;

    @OriginalMember(owner = "q", name = "q", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "q", name = "r", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "q", name = "s", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "q", name = "t", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "q", name = "u", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "q", name = "v", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "q", name = "w", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "q", name = "x", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "q", name = "y", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "q", name = "z", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "q", name = "A", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "q", name = "B", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "q", name = "C", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "q", name = "D", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "q", name = "E", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "q", name = "F", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "q", name = "M", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "q", name = "N", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "q", name = "T", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "q", name = "gb", descriptor = "I")
    public int field254;

    @OriginalMember(owner = "q", name = "lb", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "q", name = "mb", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "q", name = "nb", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "q", name = "ob", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "q", name = "pb", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "q", name = "qb", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "q", name = "L", descriptor = "Z")
    public static boolean field233;

    @OriginalMember(owner = "q", name = "kb", descriptor = "[[Z")
    public static boolean[][] field258;

    @OriginalMember(owner = "q", name = "<init>", descriptor = "(I[[[IIBI)V")
    public World3D(int arg0, int[][][] arg1, int arg2, byte arg3, int arg4) {
        this.field203 = arg0;
        this.field204 = arg4;
        if (arg3 != 4) {
            throw new NullPointerException();
        }
        boolean var6 = false;
        this.field205 = arg2;
        this.field207 = new Tile[arg0][arg4][arg2];
        this.field211 = new int[arg0][arg4 + 1][arg2 + 1];
        this.field206 = arg1;
        this.method36(false);
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(I)V")
    public static void method35(int arg0) {
        field228 = null;
        int var1 = 42 / arg0;
        field239 = null;
        field240 = null;
        field243 = null;
        field257 = null;
        field258 = null;
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(Z)V")
    public void method36(boolean arg0) {
        if (arg0) {
            return;
        }
        for (int var2 = 0; var2 < this.field203; var2++) {
            for (int var7 = 0; var7 < this.field204; var7++) {
                for (int var8 = 0; var8 < this.field205; var8++) {
                    this.field207[var2][var7][var8] = null;
                }
            }
        }
        for (int var3 = 0; var3 < field238; var3++) {
            for (int var6 = 0; var6 < field239[var3]; var6++) {
                field240[var3][var6] = null;
            }
            field239[var3] = 0;
        }
        for (int var4 = 0; var4 < this.field209; var4++) {
            this.field210[var4] = null;
        }
        this.field209 = 0;
        for (int var5 = 0; var5 < field228.length; var5++) {
            field228[var5] = null;
        }
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(II)V")
    public void method37(int arg0, int arg1) {
        this.field208 = arg0;
        if (arg1 >= 0) {
            return;
        }
        for (int var3 = 0; var3 < this.field204; var3++) {
            for (int var4 = 0; var4 < this.field205; var4++) {
                this.field207[arg0][var3][var4] = new Tile(arg0, var3, var4);
            }
        }
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(III)V")
    public void method38(int arg0, int arg1, int arg2) {
        Tile var4 = this.field207[0][arg0][arg2];
        int var5 = 45 / arg1;
        for (int var6 = 0; var6 < 3; var6++) {
            this.field207[var6][arg0][arg2] = this.field207[var6 + 1][arg0][arg2];
            if (this.field207[var6][arg0][arg2] != null) {
                this.field207[var6][arg0][arg2].field392--;
            }
        }
        if (this.field207[0][arg0][arg2] == null) {
            this.field207[0][arg0][arg2] = new Tile(0, arg0, arg2);
        }
        this.field207[0][arg0][arg2].field414 = var4;
        this.field207[3][arg0][arg2] = null;
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(IIIIIIIII)V")
    public static void method39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Occlude var9 = new Occlude();
        var9.field143 = arg0 / 128;
        var9.field144 = arg6 / 128;
        var9.field145 = arg3 / 128;
        var9.field146 = arg1 / 128;
        var9.field147 = arg5;
        var9.field148 = arg0;
        var9.field149 = arg6;
        var9.field150 = arg3;
        var9.field151 = arg1;
        int var10 = 0 / arg4;
        var9.field152 = arg2;
        var9.field153 = arg7;
        field240[arg8][field239[arg8]++] = var9;
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(IIII)V")
    public void method40(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field207[arg0][arg1][arg2];
        if (var5 != null) {
            this.field207[arg0][arg1][arg2].field406 = arg3;
        }
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            TileUnderlay var21 = new TileUnderlay(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var22 = arg0; var22 >= 0; var22--) {
                if (this.field207[var22][arg1][arg2] == null) {
                    this.field207[var22][arg1][arg2] = new Tile(var22, arg1, arg2);
                }
            }
            this.field207[arg0][arg1][arg2].field396 = var21;
        } else if (arg3 == 1) {
            TileUnderlay var23 = new TileUnderlay(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var24 = arg0; var24 >= 0; var24--) {
                if (this.field207[var24][arg1][arg2] == null) {
                    this.field207[var24][arg1][arg2] = new Tile(var24, arg1, arg2);
                }
            }
            this.field207[arg0][arg1][arg2].field396 = var23;
        } else {
            TileOverlay var25 = new TileOverlay(arg9, arg2, arg8, arg6, arg1, arg5, arg10, arg15, arg4, arg12, arg16, arg14, arg13, arg7, arg11, arg3, arg17, (byte) -119, arg18, arg19);
            for (int var26 = arg0; var26 >= 0; var26--) {
                if (this.field207[var26][arg1][arg2] == null) {
                    this.field207[var26][arg1][arg2] = new Tile(var26, arg1, arg2);
                }
            }
            this.field207[arg0][arg1][arg2].field397 = var25;
        }
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(Ldb;IBIIIII)V")
    public void method42(Model arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        GroundDecor var9 = new GroundDecor();
        var9.field118 = arg0;
        var9.field116 = arg1 * 128 + 64;
        var9.field117 = arg6 * 128 + 64;
        var9.field115 = arg4;
        var9.field119 = arg7;
        var9.field120 = arg2;
        if (arg3 != 0) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        if (this.field207[arg5][arg1][arg6] == null) {
            this.field207[arg5][arg1][arg6] = new Tile(arg5, arg1, arg6);
        }
        this.field207[arg5][arg1][arg6].field400 = var9;
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(IIILdb;IBI)V")
    public void method43(int arg0, int arg1, int arg2, Model arg3, int arg4, byte arg5, int arg6) {
        GroundObject var8 = new GroundObject();
        var8.field124 = arg3;
        var8.field122 = arg4 * 128 + 64;
        var8.field123 = arg6 * 128 + 64;
        var8.field121 = arg0;
        var8.field125 = arg2;
        int var9 = 0;
        if (arg5 == 0) {
            boolean var10 = false;
        } else {
            this.field197 = !this.field197;
        }
        Tile var11 = this.field207[arg1][arg4][arg6];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field402; var12++) {
                int var13 = var11.field403[var12].field176.field451;
                if (var13 > var9) {
                    var9 = var13;
                }
            }
        }
        var8.field126 = var9;
        if (this.field207[arg1][arg4][arg6] == null) {
            this.field207[arg1][arg4][arg6] = new Tile(arg1, arg4, arg6);
        }
        this.field207[arg1][arg4][arg6].field401 = var8;
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(IIBIIBIILdb;ILdb;)V")
    public void method44(int arg0, int arg1, byte arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, Model arg8, int arg9, Model arg10) {
        if (arg10 == null && arg8 == null) {
            return;
        }
        Wall var12 = new Wall();
        var12.field194 = arg4;
        if (arg5 != -120) {
            return;
        }
        var12.field195 = arg2;
        var12.field188 = arg7 * 128 + 64;
        var12.field189 = arg6 * 128 + 64;
        var12.field187 = arg0;
        var12.field192 = arg10;
        var12.field193 = arg8;
        var12.field190 = arg1;
        var12.field191 = arg3;
        for (int var13 = arg9; var13 >= 0; var13--) {
            if (this.field207[var13][arg7][arg6] == null) {
                this.field207[var13][arg7][arg6] = new Tile(var13, arg7, arg6);
            }
        }
        this.field207[arg9][arg7][arg6].field398 = var12;
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(BILdb;IIZIIIIII)V")
    public void method45(byte arg0, int arg1, Model arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg2 == null) {
            return;
        }
        Decor var13 = new Decor();
        var13.field87 = arg1;
        var13.field88 = arg0;
        var13.field82 = arg4 * 128 + arg11 + 64;
        var13.field83 = arg9 * 128 + arg3 + 64;
        var13.field81 = arg8;
        if (arg5) {
            this.field196 = 186;
        }
        var13.field86 = arg2;
        var13.field84 = arg6;
        var13.field85 = arg10;
        for (int var14 = arg7; var14 >= 0; var14--) {
            if (this.field207[var14][arg4][arg9] == null) {
                this.field207[var14][arg4][arg9] = new Tile(var14, arg4, arg9);
            }
        }
        this.field207[arg7][arg4][arg9].field399 = var13;
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(IILdb;IBIIIIBLv;I)Z")
    public boolean method46(int arg0, int arg1, Model arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, Entity arg10, int arg11) {
        if (arg2 == null && arg10 == null) {
            return true;
        }
        int var13 = arg7 * 128 + arg11 * 64;
        int var14 = arg1 * 128 + arg3 * 64;
        if (arg4 != -14) {
            throw new NullPointerException();
        }
        return this.method49(arg6, arg7, arg1, arg11, arg3, var13, var14, arg8, arg2, arg10, arg5, false, arg0, arg9);
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(ILv;IIIIIIIZLdb;)Z")
    public boolean method47(int arg0, Entity arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, Model arg10) {
        if (arg10 == null && arg1 == null) {
            return true;
        }
        int var12 = arg4 - arg7;
        int var13 = arg8 - arg7;
        int var14 = arg4 + arg7;
        int var15 = arg7 + arg8;
        if (arg6 > 0) {
            if (arg0 > 768 && arg0 < 1280) {
                var15 += arg6;
            }
            if (arg0 > 1280 && arg0 < 1792) {
                var14 += arg6;
            }
            if (arg0 > 1792 || arg0 < 256) {
                var13 -= arg6;
            }
            if (arg0 > 256 && arg0 < 768) {
                var14 -= arg6;
            }
        }
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        if (!arg9) {
            for (int var18 = 1; var18 > 0; var18++) {
            }
        }
        int var19 = var14 / 128;
        int var20 = var15 / 128;
        return this.method49(arg5, var16, var17, var19 + 1 - var16, var20 - var17 + 1, arg4, arg8, arg3, arg10, arg1, arg0, true, arg2, (byte) 0);
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(IIIIIIILdb;IIIIILv;)Z")
    public boolean method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Model arg7, int arg8, int arg9, int arg10, int arg11, int arg12, Entity arg13) {
        if (arg1 <= 0) {
            throw new NullPointerException();
        } else if (arg7 == null && arg13 == null) {
            return true;
        } else {
            return this.method49(arg5, arg0, arg2, arg10 + 1 - arg0, arg4 - arg2 + 1, arg6, arg8, arg3, arg7, arg13, arg9, true, arg11, (byte) 0);
        }
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(IIIIIIIILdb;Lv;IZIB)Z")
    public boolean method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Model arg8, Entity arg9, int arg10, boolean arg11, int arg12, byte arg13) {
        if (arg8 == null && arg9 == null) {
            return false;
        }
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var22 = arg2; var22 < arg2 + arg4; var22++) {
                if (var15 < 0 || var22 < 0 || var15 >= this.field204 || var22 >= this.field205) {
                    return false;
                }
                Tile var23 = this.field207[arg0][var15][var22];
                if (var23 != null && var23.field402 >= 5) {
                    return false;
                }
            }
        }
        Location var16 = new Location();
        var16.field185 = arg12;
        var16.field186 = arg13;
        var16.field172 = arg0;
        var16.field174 = arg5;
        var16.field175 = arg6;
        var16.field173 = arg7;
        var16.field176 = arg8;
        var16.field177 = arg9;
        var16.field178 = arg10;
        var16.field179 = arg1;
        var16.field181 = arg2;
        var16.field180 = arg1 + arg3 - 1;
        var16.field182 = arg2 + arg4 - 1;
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
                    if (this.field207[var20][var17][var18] == null) {
                        this.field207[var20][var17][var18] = new Tile(var20, var17, var18);
                    }
                }
                Tile var21 = this.field207[arg0][var17][var18];
                var21.field403[var21.field402] = var16;
                var21.field404[var21.field402] = var19;
                var21.field405 |= var19;
                var21.field402++;
            }
        }
        if (arg11) {
            this.field210[this.field209++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "q", name = "b", descriptor = "(Z)V")
    public void method50(boolean arg0) {
        if (arg0) {
            this.field197 = !this.field197;
        }
        for (int var2 = 0; var2 < this.field209; var2++) {
            Location var3 = this.field210[var2];
            this.method51(false, var3);
            this.field210[var2] = null;
        }
        this.field209 = 0;
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(ZLo;)V")
    private void method51(boolean arg0, Location arg1) {
        if (arg0) {
            this.field197 = !this.field197;
        }
        for (int var3 = arg1.field179; var3 <= arg1.field180; var3++) {
            for (int var4 = arg1.field181; var4 <= arg1.field182; var4++) {
                Tile var5 = this.field207[arg1.field172][var3][var4];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field402; var6++) {
                        if (var5.field403[var6] == arg1) {
                            var5.field402--;
                            for (int var7 = var6; var7 < var5.field402; var7++) {
                                var5.field403[var7] = var5.field403[var7 + 1];
                                var5.field404[var7] = var5.field404[var7 + 1];
                            }
                            var5.field403[var5.field402] = null;
                            break;
                        }
                    }
                    var5.field405 = 0;
                    for (int var8 = 0; var8 < var5.field402; var8++) {
                        var5.field405 |= var5.field404[var8];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(IIILdb;Z)V")
    public void method52(int arg0, int arg1, int arg2, Model arg3, boolean arg4) {
        if (arg3 == null) {
            return;
        }
        Tile var6 = this.field207[arg0][arg1][arg2];
        if (var6 == null) {
            return;
        }
        for (int var7 = 0; var7 < var6.field402; var7++) {
            Location var9 = var6.field403[var7];
            if ((var9.field185 >> 29 & 0x3) == 2) {
                var9.field176 = arg3;
                return;
            }
        }
        if (!arg4) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(Ldb;IIZI)V")
    public void method53(Model arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3 || arg0 == null) {
            return;
        }
        Tile var6 = this.field207[arg2][arg1][arg4];
        if (var6 != null) {
            Decor var7 = var6.field399;
            if (var7 != null) {
                var7.field86 = arg0;
            }
        }
    }

    @OriginalMember(owner = "q", name = "b", descriptor = "(IIII)V")
    public void method54(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field207[arg0][arg1][arg2];
        if (var5 != null) {
            var5.field398 = null;
            while (arg3 >= 0) {
                this.field197 = !this.field197;
            }
        }
    }

    @OriginalMember(owner = "q", name = "c", descriptor = "(IIII)V")
    public void method55(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field207[arg0][arg2][arg3];
        if (var5 != null) {
            var5.field399 = null;
            if (arg1 >= 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "q", name = "d", descriptor = "(IIII)V")
    public void method56(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field207[arg0][arg3][arg2];
        if (var5 == null) {
            return;
        }
        for (int var6 = 0; var6 < var5.field402; var6++) {
            Location var7 = var5.field403[var6];
            if (var7.field185 >> 29 == 2 && var7.field179 == arg3 && var7.field181 == arg2) {
                this.method51(false, var7);
                return;
            }
        }
        if (arg1 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(IIIB)V")
    public void method57(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == 7) {
            Tile var5 = this.field207[arg0][arg2][arg1];
            if (var5 != null) {
                var5.field400 = null;
            }
        }
    }

    @OriginalMember(owner = "q", name = "b", descriptor = "(III)V")
    public void method58(int arg0, int arg1, int arg2) {
        Tile var4 = this.field207[arg0][arg1][arg2];
        if (var4 != null) {
            var4.field401 = null;
        }
    }

    @OriginalMember(owner = "q", name = "c", descriptor = "(III)I")
    public int method59(int arg0, int arg1, int arg2) {
        Tile var4 = this.field207[arg0][arg1][arg2];
        return var4 == null || var4.field398 == null ? 0 : var4.field398.field194;
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(IIBI)I")
    public int method60(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == -73) {
            Tile var5 = this.field207[arg0][arg3][arg1];
            return var5 == null || var5.field399 == null ? 0 : var5.field399.field87;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "q", name = "d", descriptor = "(III)I")
    public int method61(int arg0, int arg1, int arg2) {
        Tile var4 = this.field207[arg0][arg1][arg2];
        if (var4 == null) {
            return 0;
        }
        for (int var5 = 0; var5 < var4.field402; var5++) {
            Location var6 = var4.field403[var5];
            if ((var6.field185 >> 29 & 0x3) == 2 && var6.field179 == arg1 && var6.field181 == arg2) {
                return var6.field185;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "q", name = "e", descriptor = "(III)I")
    public int method62(int arg0, int arg1, int arg2) {
        Tile var4 = this.field207[arg0][arg1][arg2];
        return var4 == null || var4.field400 == null ? 0 : var4.field400.field119;
    }

    @OriginalMember(owner = "q", name = "e", descriptor = "(IIII)I")
    public int method63(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field207[arg0][arg1][arg2];
        if (var5 == null) {
            return -1;
        } else if (var5.field398 != null && var5.field398.field194 == arg3) {
            return var5.field398.field195 & 0xFF;
        } else if (var5.field399 != null && var5.field399.field87 == arg3) {
            return var5.field399.field88 & 0xFF;
        } else if (var5.field400 != null && var5.field400.field119 == arg3) {
            return var5.field400.field120 & 0xFF;
        } else {
            for (int var6 = 0; var6 < var5.field402; var6++) {
                if (var5.field403[var6].field185 == arg3) {
                    return var5.field403[var6].field186 & 0xFF;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(IIBIII)V")
    public void method64(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var7 = (int) Math.sqrt((double) (arg0 * arg0 + arg4 * arg4 + arg5 * arg5));
        int var8 = arg3 * var7 >> 8;
        for (int var9 = 0; var9 < this.field203; var9++) {
            for (int var10 = 0; var10 < this.field204; var10++) {
                for (int var11 = 0; var11 < this.field205; var11++) {
                    Tile var12 = this.field207[var9][var10][var11];
                    if (var12 != null) {
                        Wall var13 = var12.field398;
                        if (var13 != null && var13.field192 != null && var13.field192.field456 != null) {
                            this.method66(var9, 1, var10, 1, true, var13.field192, var11);
                            if (var13.field193 != null && var13.field193.field456 != null) {
                                this.method66(var9, 1, var10, 1, true, var13.field193, var11);
                                this.method67(var13.field192, var13.field193, 0, 0, 0, false);
                                var13.field193.method119(arg1, var8, arg5, arg4, arg0);
                            }
                            var13.field192.method119(arg1, var8, arg5, arg4, arg0);
                        }
                        for (int var14 = 0; var14 < var12.field402; var14++) {
                            Location var16 = var12.field403[var14];
                            if (var16 != null && var16.field176 != null && var16.field176.field456 != null) {
                                this.method66(var9, var16.field182 + 1 - var16.field181, var10, var16.field180 + 1 - var16.field179, true, var16.field176, var11);
                                var16.field176.method119(arg1, var8, arg5, arg4, arg0);
                            }
                        }
                        GroundDecor var15 = var12.field400;
                        if (var15 != null && var15.field118.field456 != null) {
                            this.method65(var11, 305, var15.field118, var10, var9);
                            var15.field118.method119(arg1, var8, arg5, arg4, arg0);
                        }
                    }
                }
            }
        }
        if (this.field199 != arg2) {
            this.field196 = 230;
        }
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(IILdb;II)V")
    private void method65(int arg0, int arg1, Model arg2, int arg3, int arg4) {
        if (arg1 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg3 < this.field204) {
            Tile var7 = this.field207[arg4][arg3 + 1][arg0];
            if (var7 != null && var7.field400 != null && var7.field400.field118.field456 != null) {
                this.method67(arg2, var7.field400.field118, 128, 0, 0, true);
            }
        }
        if (arg0 < this.field204) {
            Tile var8 = this.field207[arg4][arg3][arg0 + 1];
            if (var8 != null && var8.field400 != null && var8.field400.field118.field456 != null) {
                this.method67(arg2, var8.field400.field118, 0, 0, 128, true);
            }
        }
        if (arg3 < this.field204 && arg0 < this.field205) {
            Tile var9 = this.field207[arg4][arg3 + 1][arg0 + 1];
            if (var9 != null && var9.field400 != null && var9.field400.field118.field456 != null) {
                this.method67(arg2, var9.field400.field118, 128, 0, 128, true);
            }
        }
        if (arg3 < this.field204 && arg0 > 0) {
            Tile var10 = this.field207[arg4][arg3 + 1][arg0 - 1];
            if (var10 != null && var10.field400 != null && var10.field400.field118.field456 != null) {
                this.method67(arg2, var10.field400.field118, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(IIIIZLdb;I)V")
    private void method66(int arg0, int arg1, int arg2, int arg3, boolean arg4, Model arg5, int arg6) {
        boolean var8 = true;
        if (!arg4) {
            this.field197 = !this.field197;
        }
        int var9 = arg2;
        int var10 = arg2 + arg3;
        int var11 = arg6 - 1;
        int var12 = arg1 + arg6;
        for (int var13 = arg0; var13 <= arg0 + 1; var13++) {
            if (this.field203 != var13) {
                for (int var14 = var9; var14 <= var10; var14++) {
                    if (var14 >= 0 && var14 < this.field204) {
                        for (int var15 = var11; var15 <= var12; var15++) {
                            if (var15 >= 0 && var15 < this.field205 && (!var8 || var14 >= var10 || var15 >= var12 || var15 < arg6 && arg2 != var14)) {
                                Tile var16 = this.field207[var13][var14][var15];
                                if (var16 != null) {
                                    int var17 = (this.field206[var13][var14 + 1][var15] + this.field206[var13][var14][var15] + this.field206[var13][var14][var15 + 1] + this.field206[var13][var14 + 1][var15 + 1]) / 4 - (this.field206[arg0][arg2 + 1][arg6] + this.field206[arg0][arg2][arg6] + this.field206[arg0][arg2][arg6 + 1] + this.field206[arg0][arg2 + 1][arg6 + 1]) / 4;
                                    Wall var18 = var16.field398;
                                    if (var18 != null && var18.field192 != null && var18.field192.field456 != null) {
                                        this.method67(arg5, var18.field192, (var14 - arg2) * 128 + (1 - arg3) * 64, var17, (1 - arg1) * 64 + (var15 - arg6) * 128, var8);
                                    }
                                    if (var18 != null && var18.field193 != null && var18.field193.field456 != null) {
                                        this.method67(arg5, var18.field193, (var14 - arg2) * 128 + (1 - arg3) * 64, var17, (1 - arg1) * 64 + (var15 - arg6) * 128, var8);
                                    }
                                    for (int var19 = 0; var19 < var16.field402; var19++) {
                                        Location var20 = var16.field403[var19];
                                        if (var20 != null && var20.field176 != null && var20.field176.field456 != null) {
                                            int var21 = var20.field180 + 1 - var20.field179;
                                            int var22 = var20.field182 + 1 - var20.field181;
                                            this.method67(arg5, var20.field176, (var20.field179 - arg2) * 128 + (var21 - arg3) * 64, var17, (var20.field181 - arg6) * 128 + (var22 - arg1) * 64, var8);
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

    @OriginalMember(owner = "q", name = "a", descriptor = "(Ldb;Ldb;IIIZ)V")
    private void method67(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field254++;
        int var7 = 0;
        int[] var8 = arg1.field423;
        int var9 = arg1.field422;
        for (int var10 = 0; var10 < arg0.field422; var10++) {
            VertexNormal var13 = arg0.field456[var10];
            VertexNormal var14 = arg0.field457[var10];
            if (var14.field164 != 0) {
                int var15 = arg0.field424[var10] - arg3;
                if (var15 <= arg1.field448) {
                    int var16 = arg0.field423[var10] - arg2;
                    if (var16 >= arg1.field442 && var16 <= arg1.field443) {
                        int var17 = arg0.field425[var10] - arg4;
                        if (var17 >= arg1.field445 && var17 <= arg1.field444) {
                            for (int var18 = 0; var18 < var9; var18++) {
                                VertexNormal var19 = arg1.field456[var18];
                                VertexNormal var20 = arg1.field457[var18];
                                if (var8[var18] == var16 && arg1.field425[var18] == var17 && arg1.field424[var18] == var15 && var20.field164 != 0) {
                                    var13.field161 += var20.field161;
                                    var13.field162 += var20.field162;
                                    var13.field163 += var20.field163;
                                    var13.field164 += var20.field164;
                                    var19.field161 += var14.field161;
                                    var19.field162 += var14.field162;
                                    var19.field163 += var14.field163;
                                    var19.field164 += var14.field164;
                                    var7++;
                                    this.field252[var10] = this.field254;
                                    this.field253[var18] = this.field254;
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
        for (int var11 = 0; var11 < arg0.field426; var11++) {
            if (this.field252[arg0.field427[var11]] == this.field254 && this.field252[arg0.field428[var11]] == this.field254 && this.field252[arg0.field429[var11]] == this.field254) {
                arg0.field433[var11] = -1;
            }
        }
        for (int var12 = 0; var12 < arg1.field426; var12++) {
            if (this.field253[arg1.field427[var12]] == this.field254 && this.field253[arg1.field428[var12]] == this.field254 && this.field253[arg1.field429[var12]] == this.field254) {
                arg1.field433[var12] = -1;
            }
        }
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "([IIIIII)V")
    public void method68(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Tile var7 = this.field207[arg3][arg4][arg5];
        if (var7 == null) {
            return;
        }
        TileUnderlay var8 = var7.field396;
        if (var8 != null) {
            int var9 = var8.field171;
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
        TileOverlay var11 = var7.field397;
        if (var11 == null) {
            return;
        }
        int var12 = var11.field101;
        int var13 = var11.field102;
        int var14 = var11.field103;
        int var15 = var11.field104;
        int[] var16 = this.field255[var12];
        int[] var17 = this.field256[var13];
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

    @OriginalMember(owner = "q", name = "a", descriptor = "(IIII[II)V")
    public static void method69(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
        field261 = 0;
        field262 = 0;
        field263 = arg2;
        field264 = arg1;
        field259 = arg2 / 2;
        field260 = arg1 / 2;
        boolean[][][][] var6 = new boolean[9][32][53][53];
        if (arg0 != 0) {
            field200 = -204;
        }
        for (int var7 = 128; var7 <= 384; var7 += 32) {
            for (int var15 = 0; var15 < 2048; var15 += 64) {
                field224 = Model.field499[var7];
                field225 = Model.field500[var7];
                field226 = Model.field499[var15];
                field227 = Model.field500[var15];
                int var16 = (var7 - 128) / 32;
                int var17 = var15 / 64;
                for (int var18 = -26; var18 <= 26; var18++) {
                    for (int var19 = -26; var19 <= 26; var19++) {
                        int var20 = var18 * 128;
                        int var21 = var19 * 128;
                        boolean var22 = false;
                        for (int var23 = -arg5; var23 <= arg3; var23 += 128) {
                            if (method70(31017, var21, var20, arg4[var16] + var23)) {
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
                        field257[var8][var9][var10 + 25][var11 + 25] = var12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "q", name = "f", descriptor = "(IIII)Z")
    public static boolean method70(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field227 * arg2 + field226 * arg1 >> 16;
        int var5 = field227 * arg1 - field226 * arg2 >> 16;
        int var6 = field225 * var5 + field224 * arg3 >> 16;
        int var7 = field225 * arg3 - field224 * var5 >> 16;
        if (arg0 != 31017) {
            throw new NullPointerException();
        } else if (var6 >= 50 && var6 <= 3500) {
            int var8 = (var4 << 9) / var6 + field259;
            int var9 = (var7 << 9) / var6 + field260;
            return var8 >= field261 && var8 <= field263 && var9 >= field262 && var9 <= field264;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(IIB)V")
    public void method71(int arg0, int arg1, byte arg2) {
        field233 = true;
        field234 = arg1;
        field235 = arg0;
        field236 = -1;
        field237 = -1;
        if (this.field201 == arg2) {
            ;
        }
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(IIIIII)V")
    public void method72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= this.field204 * 128) {
            arg0 = this.field204 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= this.field205 * 128) {
            arg2 = this.field205 * 128 - 1;
        }
        field214++;
        field224 = Model.field499[arg3];
        field225 = Model.field500[arg3];
        field226 = Model.field499[arg4];
        field227 = Model.field500[arg4];
        field258 = field257[(arg3 - 128) / 32][arg4 / 64];
        field221 = arg0;
        field222 = arg1;
        field223 = arg2;
        field219 = arg0 / 128;
        field220 = arg2 / 128;
        field213 = arg5;
        field215 = field219 - 25;
        if (field215 < 0) {
            field215 = 0;
        }
        field217 = field220 - 25;
        if (field217 < 0) {
            field217 = 0;
        }
        field216 = field219 + 25;
        if (field216 > this.field204) {
            field216 = this.field204;
        }
        field218 = field220 + 25;
        if (field218 > this.field205) {
            field218 = this.field205;
        }
        this.method78(0);
        field212 = 0;
        for (int var7 = this.field208; var7 < this.field203; var7++) {
            Tile[][] var32 = this.field207[var7];
            for (int var33 = field215; var33 < field216; var33++) {
                for (int var34 = field217; var34 < field218; var34++) {
                    Tile var35 = var32[var33][var34];
                    if (var35 != null) {
                        if (var35.field406 <= arg5 && (field258[var33 + 25 - field219][var34 + 25 - field220] || this.field206[var7][var33][var34] - arg1 >= 2000)) {
                            var35.field407 = true;
                            var35.field408 = true;
                            if (var35.field402 > 0) {
                                var35.field409 = true;
                            } else {
                                var35.field409 = false;
                            }
                            field212++;
                        } else {
                            var35.field407 = false;
                            var35.field408 = false;
                            var35.field410 = 0;
                        }
                    }
                }
            }
        }
        for (int var8 = this.field208; var8 < this.field203; var8++) {
            Tile[][] var21 = this.field207[var8];
            for (int var22 = -25; var22 <= 0; var22++) {
                int var23 = field219 + var22;
                int var24 = field219 - var22;
                if (var23 >= field215 || var24 < field216) {
                    for (int var25 = -25; var25 <= 0; var25++) {
                        int var26 = field220 + var25;
                        int var27 = field220 - var25;
                        if (var23 >= field215) {
                            if (var26 >= field217) {
                                Tile var28 = var21[var23][var26];
                                if (var28 != null && var28.field407) {
                                    this.method73(var28, true);
                                }
                            }
                            if (var27 < field218) {
                                Tile var29 = var21[var23][var27];
                                if (var29 != null && var29.field407) {
                                    this.method73(var29, true);
                                }
                            }
                        }
                        if (var24 < field216) {
                            if (var26 >= field217) {
                                Tile var30 = var21[var24][var26];
                                if (var30 != null && var30.field407) {
                                    this.method73(var30, true);
                                }
                            }
                            if (var27 < field218) {
                                Tile var31 = var21[var24][var27];
                                if (var31 != null && var31.field407) {
                                    this.method73(var31, true);
                                }
                            }
                        }
                        if (field212 == 0) {
                            field233 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var9 = this.field208; var9 < this.field203; var9++) {
            Tile[][] var10 = this.field207[var9];
            for (int var11 = -25; var11 <= 0; var11++) {
                int var12 = field219 + var11;
                int var13 = field219 - var11;
                if (var12 >= field215 || var13 < field216) {
                    for (int var14 = -25; var14 <= 0; var14++) {
                        int var15 = field220 + var14;
                        int var16 = field220 - var14;
                        if (var12 >= field215) {
                            if (var15 >= field217) {
                                Tile var17 = var10[var12][var15];
                                if (var17 != null && var17.field407) {
                                    this.method73(var17, false);
                                }
                            }
                            if (var16 < field218) {
                                Tile var18 = var10[var12][var16];
                                if (var18 != null && var18.field407) {
                                    this.method73(var18, false);
                                }
                            }
                        }
                        if (var13 < field216) {
                            if (var15 >= field217) {
                                Tile var19 = var10[var13][var15];
                                if (var19 != null && var19.field407) {
                                    this.method73(var19, false);
                                }
                            }
                            if (var16 < field218) {
                                Tile var20 = var10[var13][var16];
                                if (var20 != null && var20.field407) {
                                    this.method73(var20, false);
                                }
                            }
                        }
                        if (field212 == 0) {
                            field233 = false;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(Lbb;Z)V")
    public void method73(Tile arg0, boolean arg1) {
        field243.method201(arg0);
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
                                                var3 = (Tile) field243.method202();
                                                if (var3 == null) {
                                                    return;
                                                }
                                            } while (!var3.field408);
                                            var4 = var3.field393;
                                            var5 = var3.field394;
                                            var6 = var3.field392;
                                            var7 = var3.field395;
                                            var8 = this.field207[var6];
                                            if (!var3.field407) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var6 > 0) {
                                                    Tile var9 = this.field207[var6 - 1][var4][var5];
                                                    if (var9 != null && var9.field408) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= field219 && var4 > field215) {
                                                    Tile var10 = var8[var4 - 1][var5];
                                                    if (var10 != null && var10.field408 && (var10.field407 || (var3.field405 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= field219 && var4 < field216 - 1) {
                                                    Tile var11 = var8[var4 + 1][var5];
                                                    if (var11 != null && var11.field408 && (var11.field407 || (var3.field405 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 <= field220 && var5 > field217) {
                                                    Tile var12 = var8[var4][var5 - 1];
                                                    if (var12 != null && var12.field408 && (var12.field407 || (var3.field405 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 >= field220 && var5 < field218 - 1) {
                                                    Tile var13 = var8[var4][var5 + 1];
                                                    if (var13 != null && var13.field408 && (var13.field407 || (var3.field405 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var3.field407 = false;
                                            if (var3.field414 != null) {
                                                Tile var14 = var3.field414;
                                                if (var14.field396 != null) {
                                                    this.method74(var14.field396, 0, field224, field225, field226, field227, var4, var5);
                                                } else if (var14.field397 != null) {
                                                    this.method75(var4, var5, field225, 0, field226, var14.field397, field224, field227);
                                                }
                                                Wall var15 = var14.field398;
                                                if (var15 != null) {
                                                    var15.field192.method122(0, field224, field225, field226, field227, var15.field188 - field221, var15.field187 - field222, var15.field189 - field223, var15.field194);
                                                }
                                                for (int var16 = 0; var16 < var14.field402; var16++) {
                                                    Location var17 = var14.field403[var16];
                                                    if (var17 != null) {
                                                        Model var18 = var17.field176;
                                                        if (var18 == null) {
                                                            var18 = var17.field177.method90(0);
                                                        }
                                                        var18.method122(var17.field178, field224, field225, field226, field227, var17.field174 - field221, var17.field173 - field222, var17.field175 - field223, var17.field185);
                                                    }
                                                }
                                            }
                                            boolean var19 = false;
                                            if (var3.field396 == null) {
                                                if (var3.field397 != null && !this.method79(var7, var4, var5)) {
                                                    var19 = true;
                                                    this.method75(var4, var5, field225, 0, field226, var3.field397, field224, field227);
                                                }
                                            } else if (!this.method79(var7, var4, var5)) {
                                                var19 = true;
                                                this.method74(var3.field396, var7, field224, field225, field226, field227, var4, var5);
                                            }
                                            int var20 = 0;
                                            int var21 = 0;
                                            Wall var22 = var3.field398;
                                            Decor var23 = var3.field399;
                                            if (var22 != null || var23 != null) {
                                                if (field219 == var4) {
                                                    var20++;
                                                } else if (field219 < var4) {
                                                    var20 += 2;
                                                }
                                                if (field220 == var5) {
                                                    var20 += 3;
                                                } else if (field220 > var5) {
                                                    var20 += 6;
                                                }
                                                var21 = field244[var20];
                                                var3.field413 = field246[var20];
                                            }
                                            if (var22 != null) {
                                                if ((var22.field190 & field245[var20]) == 0) {
                                                    var3.field410 = 0;
                                                } else if (var22.field190 == 16) {
                                                    var3.field410 = 3;
                                                    var3.field411 = field247[var20];
                                                    var3.field412 = 3 - var3.field411;
                                                } else if (var22.field190 == 32) {
                                                    var3.field410 = 6;
                                                    var3.field411 = field248[var20];
                                                    var3.field412 = 6 - var3.field411;
                                                } else if (var22.field190 == 64) {
                                                    var3.field410 = 12;
                                                    var3.field411 = field249[var20];
                                                    var3.field412 = 12 - var3.field411;
                                                } else {
                                                    var3.field410 = 9;
                                                    var3.field411 = field250[var20];
                                                    var3.field412 = 9 - var3.field411;
                                                }
                                                if ((var22.field190 & var21) != 0 && !this.method80(var7, var4, var5, var22.field190)) {
                                                    var22.field192.method122(0, field224, field225, field226, field227, var22.field188 - field221, var22.field187 - field222, var22.field189 - field223, var22.field194);
                                                }
                                                if ((var22.field191 & var21) != 0 && !this.method80(var7, var4, var5, var22.field191)) {
                                                    var22.field193.method122(0, field224, field225, field226, field227, var22.field188 - field221, var22.field187 - field222, var22.field189 - field223, var22.field194);
                                                }
                                            }
                                            if (var23 != null && !this.method81(var7, var4, var5, var23.field86.field447)) {
                                                if ((var23.field84 & var21) != 0) {
                                                    var23.field86.method122(var23.field85, field224, field225, field226, field227, var23.field82 - field221, var23.field81 - field222, var23.field83 - field223, var23.field87);
                                                } else if ((var23.field84 & 0x300) != 0) {
                                                    int var24 = var23.field82 - field221;
                                                    int var25 = var23.field81 - field222;
                                                    int var26 = var23.field83 - field223;
                                                    int var27 = var23.field85;
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
                                                    if ((var23.field84 & 0x100) != 0 && var29 < var28) {
                                                        int var30 = field229[var27] + var24;
                                                        int var31 = field230[var27] + var26;
                                                        var23.field86.method122(var27 * 512 + 256, field224, field225, field226, field227, var30, var25, var31, var23.field87);
                                                    }
                                                    if ((var23.field84 & 0x200) != 0 && var29 > var28) {
                                                        int var32 = field231[var27] + var24;
                                                        int var33 = field232[var27] + var26;
                                                        var23.field86.method122(var27 * 512 + 1280 & 0x7FF, field224, field225, field226, field227, var32, var25, var33, var23.field87);
                                                    }
                                                }
                                            }
                                            if (var19) {
                                                GroundDecor var34 = var3.field400;
                                                if (var34 != null) {
                                                    var34.field118.method122(0, field224, field225, field226, field227, var34.field116 - field221, var34.field115 - field222, var34.field117 - field223, var34.field119);
                                                }
                                                GroundObject var35 = var3.field401;
                                                if (var35 != null && var35.field126 == 0) {
                                                    var35.field124.method122(0, field224, field225, field226, field227, var35.field122 - field221, var35.field121 - field222, var35.field123 - field223, var35.field125);
                                                }
                                            }
                                            int var36 = var3.field405;
                                            if (var36 != 0) {
                                                if (var4 < field219 && (var36 & 0x4) != 0) {
                                                    Tile var37 = var8[var4 + 1][var5];
                                                    if (var37 != null && var37.field408) {
                                                        field243.method201(var37);
                                                    }
                                                }
                                                if (var5 < field220 && (var36 & 0x2) != 0) {
                                                    Tile var38 = var8[var4][var5 + 1];
                                                    if (var38 != null && var38.field408) {
                                                        field243.method201(var38);
                                                    }
                                                }
                                                if (var4 > field219 && (var36 & 0x1) != 0) {
                                                    Tile var39 = var8[var4 - 1][var5];
                                                    if (var39 != null && var39.field408) {
                                                        field243.method201(var39);
                                                    }
                                                }
                                                if (var5 > field220 && (var36 & 0x8) != 0) {
                                                    Tile var40 = var8[var4][var5 - 1];
                                                    if (var40 != null && var40.field408) {
                                                        field243.method201(var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var3.field410 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var3.field402; var42++) {
                                                if (field214 != var3.field403[var42].field184 && (var3.field404[var42] & var3.field410) == var3.field411) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                Wall var43 = var3.field398;
                                                if (!this.method80(var7, var4, var5, var43.field190)) {
                                                    var43.field192.method122(0, field224, field225, field226, field227, var43.field188 - field221, var43.field187 - field222, var43.field189 - field223, var43.field194);
                                                }
                                                var3.field410 = 0;
                                            }
                                        }
                                        if (!var3.field409) {
                                            break;
                                        }
                                        int var44 = var3.field402;
                                        var3.field409 = false;
                                        int var45 = 0;
                                        label542: for (int var46 = 0; var46 < var44; var46++) {
                                            Location var56 = var3.field403[var46];
                                            if (field214 != var56.field184) {
                                                for (int var57 = var56.field179; var57 <= var56.field180; var57++) {
                                                    for (int var62 = var56.field181; var62 <= var56.field182; var62++) {
                                                        Tile var63 = var8[var57][var62];
                                                        if (var63.field407) {
                                                            var3.field409 = true;
                                                            continue label542;
                                                        }
                                                        if (var63.field410 != 0) {
                                                            int var64 = 0;
                                                            if (var57 > var56.field179) {
                                                                var64++;
                                                            }
                                                            if (var57 < var56.field180) {
                                                                var64 += 4;
                                                            }
                                                            if (var62 > var56.field181) {
                                                                var64 += 8;
                                                            }
                                                            if (var62 < var56.field182) {
                                                                var64 += 2;
                                                            }
                                                            if ((var64 & var63.field410) == var3.field412) {
                                                                var3.field409 = true;
                                                                continue label542;
                                                            }
                                                        }
                                                    }
                                                }
                                                field228[var45++] = var56;
                                                int var58 = field219 - var56.field179;
                                                int var59 = var56.field180 - field219;
                                                if (var59 > var58) {
                                                    var58 = var59;
                                                }
                                                int var60 = field220 - var56.field181;
                                                int var61 = var56.field182 - field220;
                                                if (var61 > var60) {
                                                    var56.field183 = var58 + var61;
                                                } else {
                                                    var56.field183 = var58 + var60;
                                                }
                                            }
                                        }
                                        while (var45 > 0) {
                                            int var47 = -50;
                                            int var48 = -1;
                                            for (int var49 = 0; var49 < var45; var49++) {
                                                Location var55 = field228[var49];
                                                if (var55.field183 > var47 && field214 != var55.field184) {
                                                    var47 = var55.field183;
                                                    var48 = var49;
                                                }
                                            }
                                            if (var48 == -1) {
                                                break;
                                            }
                                            Location var50 = field228[var48];
                                            var50.field184 = field214;
                                            Model var51 = var50.field176;
                                            if (var51 == null) {
                                                var51 = var50.field177.method90(0);
                                            }
                                            if (!this.method82(var7, var50.field179, var50.field180, var50.field181, var50.field182, var51.field447)) {
                                                var51.method122(var50.field178, field224, field225, field226, field227, var50.field174 - field221, var50.field173 - field222, var50.field175 - field223, var50.field185);
                                            }
                                            for (int var52 = var50.field179; var52 <= var50.field180; var52++) {
                                                for (int var53 = var50.field181; var53 <= var50.field182; var53++) {
                                                    Tile var54 = var8[var52][var53];
                                                    if (var54.field410 != 0) {
                                                        field243.method201(var54);
                                                    } else if ((var4 != var52 || var5 != var53) && var54.field408) {
                                                        field243.method201(var54);
                                                    }
                                                }
                                            }
                                        }
                                        if (!var3.field409) {
                                            break;
                                        }
                                    }
                                } while (!var3.field408);
                            } while (var3.field410 != 0);
                            if (var4 > field219 || var4 <= field215) {
                                break;
                            }
                            var65 = var8[var4 - 1][var5];
                        } while (var65 != null && var65.field408);
                        if (var4 < field219 || var4 >= field216 - 1) {
                            break;
                        }
                        var66 = var8[var4 + 1][var5];
                    } while (var66 != null && var66.field408);
                    if (var5 > field220 || var5 <= field217) {
                        break;
                    }
                    var67 = var8[var4][var5 - 1];
                } while (var67 != null && var67.field408);
                if (var5 < field220 || var5 >= field218 - 1) {
                    break;
                }
                var68 = var8[var4][var5 + 1];
            } while (var68 != null && var68.field408);
            var3.field408 = false;
            field212--;
            GroundObject var69 = var3.field401;
            if (var69 != null && var69.field126 != 0) {
                var69.field124.method122(0, field224, field225, field226, field227, var69.field122 - field221, var69.field121 - field222 - var69.field126, var69.field123 - field223, var69.field125);
            }
            if (var3.field413 != 0) {
                Decor var70 = var3.field399;
                if (var70 != null && !this.method81(var7, var4, var5, var70.field86.field447)) {
                    if ((var70.field84 & var3.field413) != 0) {
                        var70.field86.method122(var70.field85, field224, field225, field226, field227, var70.field82 - field221, var70.field81 - field222, var70.field83 - field223, var70.field87);
                    } else if ((var70.field84 & 0x300) != 0) {
                        int var71 = var70.field82 - field221;
                        int var72 = var70.field81 - field222;
                        int var73 = var70.field83 - field223;
                        int var74 = var70.field85;
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
                        if ((var70.field84 & 0x100) != 0 && var76 >= var75) {
                            int var77 = field229[var74] + var71;
                            int var78 = field230[var74] + var73;
                            var70.field86.method122(var74 * 512 + 256, field224, field225, field226, field227, var77, var72, var78, var70.field87);
                        }
                        if ((var70.field84 & 0x200) != 0 && var76 <= var75) {
                            int var79 = field231[var74] + var71;
                            int var80 = field232[var74] + var73;
                            var70.field86.method122(var74 * 512 + 1280 & 0x7FF, field224, field225, field226, field227, var79, var72, var80, var70.field87);
                        }
                    }
                }
                Wall var81 = var3.field398;
                if (var81 != null) {
                    if ((var81.field191 & var3.field413) != 0 && !this.method80(var7, var4, var5, var81.field191)) {
                        var81.field193.method122(0, field224, field225, field226, field227, var81.field188 - field221, var81.field187 - field222, var81.field189 - field223, var81.field194);
                    }
                    if ((var81.field190 & var3.field413) != 0 && !this.method80(var7, var4, var5, var81.field190)) {
                        var81.field192.method122(0, field224, field225, field226, field227, var81.field188 - field221, var81.field187 - field222, var81.field189 - field223, var81.field194);
                    }
                }
            }
            if (var6 < this.field203 - 1) {
                Tile var82 = this.field207[var6 + 1][var4][var5];
                if (var82 != null && var82.field408) {
                    field243.method201(var82);
                }
            }
            if (var4 < field219) {
                Tile var83 = var8[var4 + 1][var5];
                if (var83 != null && var83.field408) {
                    field243.method201(var83);
                }
            }
            if (var5 < field220) {
                Tile var84 = var8[var4][var5 + 1];
                if (var84 != null && var84.field408) {
                    field243.method201(var84);
                }
            }
            if (var4 > field219) {
                Tile var85 = var8[var4 - 1][var5];
                if (var85 != null && var85.field408) {
                    field243.method201(var85);
                }
            }
            if (var5 > field220) {
                Tile var86 = var8[var4][var5 - 1];
                if (var86 != null && var86.field408) {
                    field243.method201(var86);
                }
            }
        }
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(Ln;IIIIIII)V")
    public void method74(TileUnderlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9;
        int var10 = var9 = (arg6 << 7) - field221;
        int var11;
        int var12 = var11 = (arg7 << 7) - field223;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = this.field206[arg1][arg6][arg7] - field222;
        int var18 = this.field206[arg1][arg6 + 1][arg7] - field222;
        int var19 = this.field206[arg1][arg6 + 1][arg7 + 1] - field222;
        int var20 = this.field206[arg1][arg6][arg7 + 1] - field222;
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
        int var45 = (var21 << 9) / var25 + Pix3D.field525;
        int var46 = (var24 << 9) / var25 + Pix3D.field526;
        int var47 = (var27 << 9) / var31 + Pix3D.field525;
        int var48 = (var30 << 9) / var31 + Pix3D.field526;
        int var49 = (var33 << 9) / var37 + Pix3D.field525;
        int var50 = (var36 << 9) / var37 + Pix3D.field526;
        int var51 = (var39 << 9) / var43 + Pix3D.field525;
        int var52 = (var42 << 9) / var43 + Pix3D.field526;
        Pix3D.field524 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            Pix3D.field521 = false;
            if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > Pix2D.field513 || var51 > Pix2D.field513 || var47 > Pix2D.field513) {
                Pix3D.field521 = true;
            }
            if (field233 && this.method77(field234, field235, var50, var52, var48, var49, var51, var47)) {
                field236 = arg6;
                field237 = arg7;
            }
            if (arg0.field169 == -1) {
                if (arg0.field167 != 12345678) {
                    Pix3D.method146(var50, var52, var48, var49, var51, var47, arg0.field167, arg0.field168, arg0.field166);
                }
            } else if (field202) {
                int var53 = field251[arg0.field169];
                Pix3D.method146(var50, var52, var48, var49, var51, var47, this.method76(6, arg0.field167, var53), this.method76(6, arg0.field168, var53), this.method76(6, arg0.field166, var53));
            } else if (arg0.field170) {
                Pix3D.method150(var50, var52, var48, var49, var51, var47, arg0.field167, arg0.field168, arg0.field166, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field169);
            } else {
                Pix3D.method150(var50, var52, var48, var49, var51, var47, arg0.field167, arg0.field168, arg0.field166, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field169);
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        Pix3D.field521 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Pix2D.field513 || var47 > Pix2D.field513 || var51 > Pix2D.field513) {
            Pix3D.field521 = true;
        }
        if (field233 && this.method77(field234, field235, var46, var48, var52, var45, var47, var51)) {
            field236 = arg6;
            field237 = arg7;
        }
        if (arg0.field169 != -1) {
            if (!field202) {
                Pix3D.method150(var46, var48, var52, var45, var47, var51, arg0.field165, arg0.field166, arg0.field168, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field169);
                return;
            }
            int var54 = field251[arg0.field169];
            Pix3D.method146(var46, var48, var52, var45, var47, var51, this.method76(6, arg0.field165, var54), this.method76(6, arg0.field166, var54), this.method76(6, arg0.field168, var54));
        } else if (arg0.field165 != 12345678) {
            Pix3D.method146(var46, var48, var52, var45, var47, var51, arg0.field165, arg0.field166, arg0.field168);
            return;
        }
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(IIIIILh;II)V")
    public void method75(int arg0, int arg1, int arg2, int arg3, int arg4, TileOverlay arg5, int arg6, int arg7) {
        int var9 = arg5.field90.length;
        if (arg3 != 0) {
            this.field198 = !this.field198;
        }
        for (int var10 = 0; var10 < var9; var10++) {
            int var23 = arg5.field90[var10] - field221;
            int var24 = arg5.field91[var10] - field222;
            int var25 = arg5.field92[var10] - field223;
            int var26 = arg4 * var25 + arg7 * var23 >> 16;
            int var27 = arg7 * var25 - arg4 * var23 >> 16;
            int var29 = arg2 * var24 - arg6 * var27 >> 16;
            int var30 = arg2 * var27 + arg6 * var24 >> 16;
            if (var30 < 50) {
                return;
            }
            if (arg5.field99 != null) {
                TileOverlay.field107[var10] = var26;
                TileOverlay.field108[var10] = var29;
                TileOverlay.field109[var10] = var30;
            }
            TileOverlay.field105[var10] = (var26 << 9) / var30 + Pix3D.field525;
            TileOverlay.field106[var10] = (var29 << 9) / var30 + Pix3D.field526;
        }
        Pix3D.field524 = 0;
        int var11 = arg5.field96.length;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = arg5.field96[var12];
            int var14 = arg5.field97[var12];
            int var15 = arg5.field98[var12];
            int var16 = TileOverlay.field105[var13];
            int var17 = TileOverlay.field105[var14];
            int var18 = TileOverlay.field105[var15];
            int var19 = TileOverlay.field106[var13];
            int var20 = TileOverlay.field106[var14];
            int var21 = TileOverlay.field106[var15];
            if ((var16 - var17) * (var21 - var20) - (var18 - var17) * (var19 - var20) > 0) {
                Pix3D.field521 = false;
                if (var16 < 0 || var17 < 0 || var18 < 0 || var16 > Pix2D.field513 || var17 > Pix2D.field513 || var18 > Pix2D.field513) {
                    Pix3D.field521 = true;
                }
                if (field233 && this.method77(field234, field235, var19, var20, var21, var16, var17, var18)) {
                    field236 = arg0;
                    field237 = arg1;
                }
                if (arg5.field99 == null || arg5.field99[var12] == -1) {
                    if (arg5.field93[var12] != 12345678) {
                        Pix3D.method146(var19, var20, var21, var16, var17, var18, arg5.field93[var12], arg5.field94[var12], arg5.field95[var12]);
                    }
                } else if (field202) {
                    int var22 = field251[arg5.field99[var12]];
                    Pix3D.method146(var19, var20, var21, var16, var17, var18, this.method76(6, arg5.field93[var12], var22), this.method76(6, arg5.field94[var12], var22), this.method76(6, arg5.field95[var12], var22));
                } else if (arg5.field100) {
                    Pix3D.method150(var19, var20, var21, var16, var17, var18, arg5.field93[var12], arg5.field94[var12], arg5.field95[var12], TileOverlay.field107[0], TileOverlay.field107[1], TileOverlay.field107[3], TileOverlay.field108[0], TileOverlay.field108[1], TileOverlay.field108[3], TileOverlay.field109[0], TileOverlay.field109[1], TileOverlay.field109[3], arg5.field99[var12]);
                } else {
                    Pix3D.method150(var19, var20, var21, var16, var17, var18, arg5.field93[var12], arg5.field94[var12], arg5.field95[var12], TileOverlay.field107[var13], TileOverlay.field107[var14], TileOverlay.field107[var15], TileOverlay.field108[var13], TileOverlay.field108[var14], TileOverlay.field108[var15], TileOverlay.field109[var13], TileOverlay.field109[var14], TileOverlay.field109[var15], arg5.field99[var12]);
                }
            }
        }
    }

    @OriginalMember(owner = "q", name = "f", descriptor = "(III)I")
    public int method76(int arg0, int arg1, int arg2) {
        int var4 = 127 - arg1;
        if (arg0 < 6 || arg0 > 6) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = (arg2 & 0x7F) * var4 / 160;
        if (var6 < 2) {
            var6 = 2;
        } else if (var6 > 126) {
            var6 = 126;
        }
        return (arg2 & 0xFF80) + var6;
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "q", name = "b", descriptor = "(I)V")
    private void method78(int arg0) {
        int var2 = field239[field213];
        Occlude[] var3 = field240[field213];
        if (arg0 != 0) {
            field200 = 164;
        }
        field241 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            Occlude var5 = var3[var4];
            if (var5.field147 == 1) {
                int var6 = var5.field143 + 25 - field219;
                if (var6 >= 0 && var6 <= 50) {
                    int var7 = var5.field145 + 25 - field220;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = var5.field146 + 25 - field220;
                    if (var8 > 50) {
                        var8 = 50;
                    }
                    boolean var9 = false;
                    while (var7 <= var8) {
                        if (field258[var6][var7++]) {
                            var9 = true;
                            break;
                        }
                    }
                    if (var9) {
                        int var10 = field221 - var5.field148;
                        if (var10 > 32) {
                            var5.field154 = 1;
                        } else {
                            if (var10 >= -32) {
                                continue;
                            }
                            var5.field154 = 2;
                            var10 = -var10;
                        }
                        var5.field157 = (var5.field150 - field223 << 8) / var10;
                        var5.field158 = (var5.field151 - field223 << 8) / var10;
                        var5.field159 = (var5.field152 - field222 << 8) / var10;
                        var5.field160 = (var5.field153 - field222 << 8) / var10;
                        field242[field241++] = var5;
                    }
                }
            } else if (var5.field147 == 2) {
                int var11 = var5.field145 + 25 - field220;
                if (var11 >= 0 && var11 <= 50) {
                    int var12 = var5.field143 + 25 - field219;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = var5.field144 + 25 - field219;
                    if (var13 > 50) {
                        var13 = 50;
                    }
                    boolean var14 = false;
                    while (var12 <= var13) {
                        if (field258[var12++][var11]) {
                            var14 = true;
                            break;
                        }
                    }
                    if (var14) {
                        int var15 = field223 - var5.field150;
                        if (var15 > 32) {
                            var5.field154 = 3;
                        } else {
                            if (var15 >= -32) {
                                continue;
                            }
                            var5.field154 = 4;
                            var15 = -var15;
                        }
                        var5.field155 = (var5.field148 - field221 << 8) / var15;
                        var5.field156 = (var5.field149 - field221 << 8) / var15;
                        var5.field159 = (var5.field152 - field222 << 8) / var15;
                        var5.field160 = (var5.field153 - field222 << 8) / var15;
                        field242[field241++] = var5;
                    }
                }
            } else if (var5.field147 == 4) {
                int var16 = var5.field152 - field222;
                if (var16 > 128) {
                    int var17 = var5.field145 + 25 - field220;
                    if (var17 < 0) {
                        var17 = 0;
                    }
                    int var18 = var5.field146 + 25 - field220;
                    if (var18 > 50) {
                        var18 = 50;
                    }
                    if (var17 <= var18) {
                        int var19 = var5.field143 + 25 - field219;
                        if (var19 < 0) {
                            var19 = 0;
                        }
                        int var20 = var5.field144 + 25 - field219;
                        if (var20 > 50) {
                            var20 = 50;
                        }
                        boolean var21 = false;
                        label149: for (int var22 = var19; var22 <= var20; var22++) {
                            for (int var23 = var17; var23 <= var18; var23++) {
                                if (field258[var22][var23]) {
                                    var21 = true;
                                    break label149;
                                }
                            }
                        }
                        if (var21) {
                            var5.field154 = 5;
                            var5.field155 = (var5.field148 - field221 << 8) / var16;
                            var5.field156 = (var5.field149 - field221 << 8) / var16;
                            var5.field157 = (var5.field150 - field223 << 8) / var16;
                            var5.field158 = (var5.field151 - field223 << 8) / var16;
                            field242[field241++] = var5;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "q", name = "g", descriptor = "(III)Z")
    private boolean method79(int arg0, int arg1, int arg2) {
        int var4 = this.field211[arg0][arg1][arg2];
        if (-field214 == var4) {
            return false;
        } else if (field214 == var4) {
            return true;
        } else {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            if (this.method83(var5 + 1, this.field206[arg0][arg1][arg2], var6 + 1) && this.method83(var5 + 128 - 1, this.field206[arg0][arg1 + 1][arg2], var6 + 1) && this.method83(var5 + 128 - 1, this.field206[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.method83(var5 + 1, this.field206[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
                this.field211[arg0][arg1][arg2] = field214;
                return true;
            } else {
                this.field211[arg0][arg1][arg2] = -field214;
                return false;
            }
        }
    }

    @OriginalMember(owner = "q", name = "g", descriptor = "(IIII)Z")
    private boolean method80(int arg0, int arg1, int arg2, int arg3) {
        if (!this.method79(arg0, arg1, arg2)) {
            return false;
        }
        int var5 = arg1 << 7;
        int var6 = arg2 << 7;
        int var7 = this.field206[arg0][arg1][arg2] - 1;
        int var8 = var7 - 120;
        int var9 = var7 - 230;
        int var10 = var7 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var5 > field221) {
                    if (!this.method83(var5, var7, var6)) {
                        return false;
                    }
                    if (!this.method83(var5, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method83(var5, var8, var6)) {
                        return false;
                    }
                    if (!this.method83(var5, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method83(var5, var9, var6)) {
                    return false;
                }
                if (!this.method83(var5, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var6 < field223) {
                    if (!this.method83(var5, var7, var6 + 128)) {
                        return false;
                    }
                    if (!this.method83(var5 + 128, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method83(var5, var8, var6 + 128)) {
                        return false;
                    }
                    if (!this.method83(var5 + 128, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method83(var5, var9, var6 + 128)) {
                    return false;
                }
                if (!this.method83(var5 + 128, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var5 < field223) {
                    if (!this.method83(var5 + 128, var7, var6)) {
                        return false;
                    }
                    if (!this.method83(var5 + 128, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method83(var5 + 128, var8, var6)) {
                        return false;
                    }
                    if (!this.method83(var5 + 128, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method83(var5 + 128, var9, var6)) {
                    return false;
                }
                if (!this.method83(var5 + 128, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var6 > field223) {
                    if (!this.method83(var5, var7, var6)) {
                        return false;
                    }
                    if (!this.method83(var5 + 128, var7, var6)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method83(var5, var8, var6)) {
                        return false;
                    }
                    if (!this.method83(var5 + 128, var8, var6)) {
                        return false;
                    }
                }
                if (!this.method83(var5, var9, var6)) {
                    return false;
                }
                if (!this.method83(var5 + 128, var9, var6)) {
                    return false;
                }
                return true;
            }
        }
        if (!this.method83(var5 + 64, var10, var6 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return this.method83(var5, var9, var6 + 128);
        } else if (arg3 == 32) {
            return this.method83(var5 + 128, var9, var6 + 128);
        } else if (arg3 == 64) {
            return this.method83(var5 + 128, var9, var6);
        } else if (arg3 == 128) {
            return this.method83(var5, var9, var6);
        } else {
            System.out.println("Warning unsupported wall type");
            return true;
        }
    }

    @OriginalMember(owner = "q", name = "h", descriptor = "(IIII)Z")
    private boolean method81(int arg0, int arg1, int arg2, int arg3) {
        if (this.method79(arg0, arg1, arg2)) {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            return this.method83(var5 + 1, this.field206[arg0][arg1][arg2] - arg3, var6 + 1) && this.method83(var5 + 128 - 1, this.field206[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method83(var5 + 128 - 1, this.field206[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method83(var5 + 1, this.field206[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "q", name = "b", descriptor = "(IIIIII)Z")
    private boolean method82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var9 = arg1; var9 <= arg2; var9++) {
                for (int var15 = arg3; var15 <= arg4; var15++) {
                    if (this.field211[arg0][var9][var15] == -field214) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = this.field206[arg0][arg1][arg3] - arg5;
            if (!this.method83(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!this.method83(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!this.method83(var10, var12, var14)) {
                return false;
            } else if (this.method83(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (this.method79(arg0, arg1, arg3)) {
            int var7 = arg1 << 7;
            int var8 = arg3 << 7;
            return this.method83(var7 + 1, this.field206[arg0][arg1][arg3] - arg5, var8 + 1) && this.method83(var7 + 128 - 1, this.field206[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.method83(var7 + 128 - 1, this.field206[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.method83(var7 + 1, this.field206[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "q", name = "h", descriptor = "(III)Z")
    private boolean method83(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < field241; var4++) {
            Occlude var5 = field242[var4];
            if (var5.field154 == 1) {
                int var6 = var5.field148 - arg0;
                if (var6 > 0) {
                    int var7 = (var5.field157 * var6 >> 8) + var5.field150;
                    int var8 = (var5.field158 * var6 >> 8) + var5.field151;
                    int var9 = (var5.field159 * var6 >> 8) + var5.field152;
                    int var10 = (var5.field160 * var6 >> 8) + var5.field153;
                    if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field154 == 2) {
                int var11 = arg0 - var5.field148;
                if (var11 > 0) {
                    int var12 = (var5.field157 * var11 >> 8) + var5.field150;
                    int var13 = (var5.field158 * var11 >> 8) + var5.field151;
                    int var14 = (var5.field159 * var11 >> 8) + var5.field152;
                    int var15 = (var5.field160 * var11 >> 8) + var5.field153;
                    if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
                        return true;
                    }
                }
            } else if (var5.field154 == 3) {
                int var16 = var5.field150 - arg2;
                if (var16 > 0) {
                    int var17 = (var5.field155 * var16 >> 8) + var5.field148;
                    int var18 = (var5.field156 * var16 >> 8) + var5.field149;
                    int var19 = (var5.field159 * var16 >> 8) + var5.field152;
                    int var20 = (var5.field160 * var16 >> 8) + var5.field153;
                    if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
                        return true;
                    }
                }
            } else if (var5.field154 == 4) {
                int var21 = arg2 - var5.field150;
                if (var21 > 0) {
                    int var22 = (var5.field155 * var21 >> 8) + var5.field148;
                    int var23 = (var5.field156 * var21 >> 8) + var5.field149;
                    int var24 = (var5.field159 * var21 >> 8) + var5.field152;
                    int var25 = (var5.field160 * var21 >> 8) + var5.field153;
                    if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
                        return true;
                    }
                }
            } else if (var5.field154 == 5) {
                int var26 = arg1 - var5.field152;
                if (var26 > 0) {
                    int var27 = (var5.field155 * var26 >> 8) + var5.field148;
                    int var28 = (var5.field156 * var26 >> 8) + var5.field149;
                    int var29 = (var5.field157 * var26 >> 8) + var5.field150;
                    int var30 = (var5.field158 * var26 >> 8) + var5.field151;
                    if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
