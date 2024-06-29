import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class99 extends class273 {

    @OriginalMember(owner = "client!un", name = "P", descriptor = "[I")
    private int[] field1538 = new int[257];

    @OriginalMember(owner = "client!un", name = "R", descriptor = "I")
    public static int field1540 = 0;

    @OriginalMember(owner = "client!un", name = "S", descriptor = "[S")
    public static short[] field1541 = new short[] { 43, 23, 22, 35, 32, 50, 3, 13 };

    @OriginalMember(owner = "client!un", name = "W", descriptor = "[I")
    public static int[] field1545 = new int[1000];

    @OriginalMember(owner = "client!un", name = "N", descriptor = "[I")
    public static int[] field1536 = new int[5];

    @OriginalMember(owner = "client!un", name = "Q", descriptor = "I")
    public static int field1539 = 0;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!un", name = "M", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!un", name = "O", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!un", name = "T", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!un", name = "V", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!un", name = "U", descriptor = "[[I")
    private int[][] field1543;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IB)[[I", line = 14)
    public final int[][] method170(int arg0, byte arg1) {
        if (arg1 != 68) {
            this.field1543 = (int[][]) ((int[][]) null);
        }
        field1534++;
        int[][] var3 = this.field4200.method539(arg1 + 84, arg0);
        if (this.field4200.field1147) {
            int[] var4 = this.method1790(0, arg0, 0);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class27.field346; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1538[var9];
                var6[var8] = class311.method2135(var10, 16711680) >> 12;
                var5[var8] = class311.method2135(4080, var10 >> 4);
                var7[var8] = class311.method2135(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!un", name = "e", descriptor = "(I)V", line = 63)
    private final void method678(int arg0) {
        field1535++;
        if (arg0 != 2) {
            return;
        }
        int var2 = this.field1543.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var6 < var2 && var5 >= this.field1543[var6][0]; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var2 <= var4) {
                int[] var7 = this.field1543[var2 - 1];
                var8 = var7[1];
                var9 = var7[2];
                var10 = var7[3];
            } else {
                int[] var11 = this.field1543[var4];
                if (var4 > 0) {
                    int[] var12 = this.field1543[var4 - 1];
                    int var13 = (var5 - var12[0] << 12) / (var11[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var10 = var11[3] * var13 + var12[3] * var14 >> 12;
                    var9 = var11[2] * var13 + (var12[2] * var14) >> 12;
                    var8 = var11[1] * var13 + (var12[1] * var14) >> 12;
                } else {
                    var8 = var11[1];
                    var10 = var11[3];
                    var9 = var11[2];
                }
            }
            int var15 = var8 >> 4;
            int var16 = var10 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            int var17 = var9 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field1538[var3] = class276.method1810(var16, class276.method1810(var17 << 8, var15 << 16));
        }
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(II)V", line = 184)
    private final void method679(int arg0, int arg1) {
        field1532++;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field1543 = new int[2][4];
                this.field1543[0][3] = 0;
                this.field1543[0][0] = 0;
                this.field1543[0][1] = 0;
                this.field1543[1][1] = 4096;
                this.field1543[0][2] = 0;
                this.field1543[1][0] = 4096;
                this.field1543[1][2] = 4096;
                this.field1543[1][3] = 4096;
            } else if (arg0 == 2) {
                this.field1543 = new int[8][4];
                this.field1543[0][1] = 2650;
                this.field1543[0][3] = 2361;
                this.field1543[1][1] = 2313;
                this.field1543[0][0] = 0;
                this.field1543[1][3] = 1558;
                this.field1543[2][1] = 2618;
                this.field1543[2][3] = 1413;
                this.field1543[3][3] = 947;
                this.field1543[1][0] = 2867;
                this.field1543[0][2] = 2602;
                this.field1543[1][2] = 1799;
                this.field1543[3][1] = 2296;
                this.field1543[4][1] = 2072;
                this.field1543[2][2] = 1734;
                this.field1543[4][3] = 722;
                this.field1543[5][3] = 1766;
                this.field1543[5][1] = 2730;
                this.field1543[3][2] = 1220;
                this.field1543[6][3] = 915;
                this.field1543[7][3] = 1140;
                this.field1543[4][2] = 963;
                this.field1543[6][1] = 2232;
                this.field1543[7][1] = 1686;
                this.field1543[2][0] = 3072;
                this.field1543[3][0] = 3276;
                this.field1543[5][2] = 2152;
                this.field1543[4][0] = 3481;
                this.field1543[6][2] = 1060;
                this.field1543[7][2] = 1413;
                this.field1543[5][0] = 3686;
                this.field1543[6][0] = 3891;
                this.field1543[7][0] = 4096;
            } else if (arg0 == 3) {
                this.field1543 = new int[7][4];
                this.field1543[0][2] = 0;
                this.field1543[0][1] = 0;
                this.field1543[1][1] = 0;
                this.field1543[1][2] = 4096;
                this.field1543[0][0] = 0;
                this.field1543[0][3] = 4096;
                this.field1543[1][0] = 663;
                this.field1543[2][1] = 0;
                this.field1543[2][0] = 1363;
                this.field1543[3][1] = 4096;
                this.field1543[4][1] = 4096;
                this.field1543[1][3] = 4096;
                this.field1543[3][0] = 2048;
                this.field1543[5][1] = 4096;
                this.field1543[6][1] = 0;
                this.field1543[4][0] = 2727;
                this.field1543[2][3] = 0;
                this.field1543[3][3] = 0;
                this.field1543[2][2] = 4096;
                this.field1543[4][3] = 0;
                this.field1543[5][3] = 4096;
                this.field1543[5][0] = 3411;
                this.field1543[3][2] = 4096;
                this.field1543[4][2] = 0;
                this.field1543[5][2] = 0;
                this.field1543[6][2] = 0;
                this.field1543[6][3] = 4096;
                this.field1543[6][0] = 4096;
            } else if (arg0 == 4) {
                this.field1543 = new int[6][4];
                this.field1543[0][3] = 0;
                this.field1543[0][2] = 0;
                this.field1543[0][0] = 0;
                this.field1543[1][0] = 1843;
                this.field1543[2][0] = 2457;
                this.field1543[1][3] = 1493;
                this.field1543[0][1] = 0;
                this.field1543[1][1] = 0;
                this.field1543[1][2] = 0;
                this.field1543[2][1] = 0;
                this.field1543[3][0] = 2781;
                this.field1543[2][3] = 2939;
                this.field1543[4][0] = 3481;
                this.field1543[5][0] = 4096;
                this.field1543[2][2] = 0;
                this.field1543[3][1] = 0;
                this.field1543[3][3] = 3565;
                this.field1543[4][1] = 546;
                this.field1543[5][1] = 4096;
                this.field1543[3][2] = 1124;
                this.field1543[4][3] = 4031;
                this.field1543[4][2] = 3084;
                this.field1543[5][3] = 4096;
                this.field1543[5][2] = 4096;
            } else if (arg0 == 5) {
                this.field1543 = new int[16][4];
                this.field1543[0][0] = 0;
                this.field1543[1][0] = 155;
                this.field1543[0][3] = 321;
                this.field1543[1][3] = 562;
                this.field1543[0][2] = 192;
                this.field1543[1][2] = 449;
                this.field1543[0][1] = 80;
                this.field1543[2][2] = 690;
                this.field1543[2][0] = 389;
                this.field1543[3][0] = 671;
                this.field1543[3][2] = 995;
                this.field1543[1][1] = 321;
                this.field1543[4][0] = 897;
                this.field1543[5][0] = 1175;
                this.field1543[4][2] = 1397;
                this.field1543[6][0] = 1368;
                this.field1543[2][3] = 803;
                this.field1543[5][2] = 1429;
                this.field1543[3][3] = 1140;
                this.field1543[4][3] = 1509;
                this.field1543[5][3] = 1413;
                this.field1543[6][3] = 1333;
                this.field1543[6][2] = 1461;
                this.field1543[7][3] = 1702;
                this.field1543[2][1] = 578;
                this.field1543[7][0] = 1507;
                this.field1543[8][3] = 2056;
                this.field1543[7][2] = 1525;
                this.field1543[8][2] = 1590;
                this.field1543[3][1] = 947;
                this.field1543[8][0] = 1736;
                this.field1543[4][1] = 1285;
                this.field1543[5][1] = 1525;
                this.field1543[6][1] = 1734;
                this.field1543[9][3] = 2666;
                this.field1543[9][0] = 2088;
                this.field1543[7][1] = 1413;
                this.field1543[9][2] = 2056;
                this.field1543[10][0] = 2355;
                this.field1543[11][0] = 2691;
                this.field1543[10][2] = 2586;
                this.field1543[12][0] = 3031;
                this.field1543[8][1] = 1108;
                this.field1543[9][1] = 1766;
                this.field1543[13][0] = 3522;
                this.field1543[14][0] = 3727;
                this.field1543[11][2] = 3148;
                this.field1543[15][0] = 4096;
                this.field1543[12][2] = 3710;
                this.field1543[10][1] = 2409;
                this.field1543[11][1] = 3116;
                this.field1543[13][2] = 3421;
                this.field1543[12][1] = 3806;
                this.field1543[14][2] = 3148;
                this.field1543[13][1] = 3437;
                this.field1543[14][1] = 3116;
                this.field1543[10][3] = 3276;
                this.field1543[15][2] = 2505;
                this.field1543[11][3] = 3228;
                this.field1543[12][3] = 3196;
                this.field1543[15][1] = 2377;
                this.field1543[13][3] = 3019;
                this.field1543[14][3] = 3228;
                this.field1543[15][3] = 2746;
            } else if (arg0 == 6) {
                this.field1543 = new int[4][4];
                this.field1543[0][0] = 2048;
                this.field1543[0][1] = 0;
                this.field1543[0][3] = 0;
                this.field1543[1][0] = 2867;
                this.field1543[0][2] = 4096;
                this.field1543[1][2] = 4096;
                this.field1543[2][0] = 3276;
                this.field1543[1][1] = 4096;
                this.field1543[2][2] = 4096;
                this.field1543[3][2] = 0;
                this.field1543[3][0] = 4096;
                this.field1543[1][3] = 0;
                this.field1543[2][3] = 0;
                this.field1543[3][3] = 0;
                this.field1543[2][1] = 4096;
                this.field1543[3][1] = 4096;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg1 != 6) {
            field1539 = -29;
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V", line = 436)
    public class99() {
        super(1, false);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V", line = 442)
    public final void method349(int arg0) {
        field1537++;
        if (this.field1543 == null) {
            this.method679(1, arg0 ^ 0x7);
        }
        this.method678(arg0 + arg0);
    }

    @OriginalMember(owner = "client!un", name = "f", descriptor = "(I)V", line = 453)
    public static void method680(int arg0) {
        field1541 = null;
        field1536 = null;
        field1545 = null;
        int var1 = -39 / ((-arg0 - 59) / 41);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BILgn;)V", line = 473)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        field1544++;
        if (arg1 == 0) {
            int var4 = arg2.method2043((byte) -111);
            if (var4 == 0) {
                this.field1543 = new int[arg2.method2043((byte) -122)][4];
                for (int var5 = 0; var5 < this.field1543.length; var5++) {
                    this.field1543[var5][0] = arg2.method1994(false);
                    this.field1543[var5][1] = arg2.method2043((byte) -110) << 4;
                    this.field1543[var5][2] = arg2.method2043((byte) -119) << 4;
                    this.field1543[var5][3] = arg2.method2043((byte) -125) << 4;
                }
            } else {
                this.method679(var4, 6);
            }
        }
        if (arg0 <= 27) {
            method680(12);
        }
    }
}
