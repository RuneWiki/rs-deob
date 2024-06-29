import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class97 extends class16 {

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "[I")
    private int[] field1488 = new int[257];

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "[I")
    public static int[] field1485 = new int[4];

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "[I")
    public static int[] field1487 = new int[5];

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "[[I")
    private int[][] field1484;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)[[I", line = 9)
    public final int[][] method54(int arg0, byte arg1) {
        int var3 = 52 % ((40 - arg1) / 41);
        int[][] var4 = this.field197.method715(true, arg0);
        field1482++;
        if (this.field197.field1548) {
            int[] var5 = this.method103(0, 4389, arg0);
            int[] var6 = var4[1];
            int[] var7 = var4[0];
            int[] var8 = var4[2];
            for (int var9 = 0; var9 < class276.field4376; var9++) {
                int var10 = var5[var9] >> 4;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var10 > 256) {
                    var10 = 256;
                }
                int var11 = this.field1488[var10];
                var7[var9] = class200.method1465(16711680, var11) >> 12;
                var6[var9] = class200.method1465(var11 >> 4, 4080);
                var8[var9] = class200.method1465(var11, 255) << 4;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLim;I)V", line = 54)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        field1478++;
        if (arg2 == 0) {
            int var4 = arg1.method1399(arg0 - 1172389777);
            if (var4 == 0) {
                this.field1484 = new int[arg1.method1399(-1172389784)][4];
                for (int var5 = 0; var5 < this.field1484.length; var5++) {
                    this.field1484[var5][0] = arg1.method1396(arg0 - 13);
                    this.field1484[var5][1] = arg1.method1399(-1172389784) << 4;
                    this.field1484[var5][2] = arg1.method1399(-1172389784) << 4;
                    this.field1484[var5][3] = arg1.method1399(-1172389784) << 4;
                }
            } else {
                this.method693(var4, 1525);
            }
        }
        if (arg0 != -7) {
            method692((int[]) null, (byte) 10);
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 100)
    public class97() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V", line = 105)
    private final void method690(int arg0) {
        field1483++;
        int var2 = 109 / ((arg0 + 66) / 52);
        int var3 = this.field1484.length;
        if (var3 <= 0) {
            return;
        }
        for (int var4 = 0; var4 < 257; var4++) {
            int var5 = var4 << 4;
            int var6 = 0;
            for (int var7 = 0; var3 > var7 && var5 >= this.field1484[var7][0]; var7++) {
                var6++;
            }
            int var12;
            int var13;
            int var14;
            if (var3 > var6) {
                int[] var8 = this.field1484[var6];
                if (var6 > 0) {
                    int[] var9 = this.field1484[var6 - 1];
                    int var10 = (var5 - var9[0] << 12) / (var8[0] - var9[0]);
                    int var11 = 4096 - var10;
                    var12 = var8[2] * var10 + var9[2] * var11 >> 12;
                    var13 = var8[1] * var10 + var9[1] * var11 >> 12;
                    var14 = var8[3] * var10 + var9[3] * var11 >> 12;
                } else {
                    var14 = var8[3];
                    var13 = var8[1];
                    var12 = var8[2];
                }
            } else {
                int[] var15 = this.field1484[var3 - 1];
                var14 = var15[3];
                var12 = var15[2];
                var13 = var15[1];
            }
            int var16 = var13 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            int var17 = var14 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var18 = var12 >> 4;
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            this.field1488[var4] = class24.method149(class24.method149(var16 << 16, var18 << 8), var17);
        }
    }

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "(I)V", line = 214)
    public static void method691(int arg0) {
        if (arg0 != 10) {
            method691(-68);
        }
        field1485 = null;
        field1487 = null;
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)V", line = 225)
    public final void method55(byte arg0) {
        if (arg0 != 0) {
            field1480 = -78;
        }
        field1481++;
        if (this.field1484 == null) {
            this.method693(1, arg0 + 1525);
        }
        this.method690(-118);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([IB)[I", line = 242)
    public static final int[] method692(int[] arg0, byte arg1) {
        field1479++;
        if (arg0 == null) {
            return null;
        } else if (arg1 == -94) {
            int[] var2 = new int[arg0.length];
            class213.method1554(arg0, 0, var2, 0, arg0.length);
            return var2;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V", line = 266)
    private final void method693(int arg0, int arg1) {
        field1489++;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field1484 = new int[2][4];
                this.field1484[0][1] = 0;
                this.field1484[1][1] = 4096;
                this.field1484[0][2] = 0;
                this.field1484[0][0] = 0;
                this.field1484[1][2] = 4096;
                this.field1484[0][3] = 0;
                this.field1484[1][3] = 4096;
                this.field1484[1][0] = 4096;
            } else if (arg0 == 2) {
                this.field1484 = new int[8][4];
                this.field1484[0][3] = 2361;
                this.field1484[1][3] = 1558;
                this.field1484[0][0] = 0;
                this.field1484[0][1] = 2650;
                this.field1484[2][3] = 1413;
                this.field1484[1][1] = 2313;
                this.field1484[1][0] = 2867;
                this.field1484[3][3] = 947;
                this.field1484[4][3] = 722;
                this.field1484[2][1] = 2618;
                this.field1484[5][3] = 1766;
                this.field1484[3][1] = 2296;
                this.field1484[4][1] = 2072;
                this.field1484[5][1] = 2730;
                this.field1484[6][1] = 2232;
                this.field1484[7][1] = 1686;
                this.field1484[2][0] = 3072;
                this.field1484[3][0] = 3276;
                this.field1484[0][2] = 2602;
                this.field1484[6][3] = 915;
                this.field1484[4][0] = 3481;
                this.field1484[1][2] = 1799;
                this.field1484[7][3] = 1140;
                this.field1484[5][0] = 3686;
                this.field1484[6][0] = 3891;
                this.field1484[7][0] = 4096;
                this.field1484[2][2] = 1734;
                this.field1484[3][2] = 1220;
                this.field1484[4][2] = 963;
                this.field1484[5][2] = 2152;
                this.field1484[6][2] = 1060;
                this.field1484[7][2] = 1413;
            } else if (arg0 == 3) {
                this.field1484 = new int[7][4];
                this.field1484[0][3] = 4096;
                this.field1484[1][3] = 4096;
                this.field1484[0][0] = 0;
                this.field1484[0][2] = 0;
                this.field1484[0][1] = 0;
                this.field1484[1][2] = 4096;
                this.field1484[2][3] = 0;
                this.field1484[3][3] = 0;
                this.field1484[1][0] = 663;
                this.field1484[4][3] = 0;
                this.field1484[1][1] = 0;
                this.field1484[5][3] = 4096;
                this.field1484[2][1] = 0;
                this.field1484[2][2] = 4096;
                this.field1484[2][0] = 1363;
                this.field1484[3][0] = 2048;
                this.field1484[3][2] = 4096;
                this.field1484[3][1] = 4096;
                this.field1484[4][1] = 4096;
                this.field1484[4][0] = 2727;
                this.field1484[4][2] = 0;
                this.field1484[5][1] = 4096;
                this.field1484[5][2] = 0;
                this.field1484[5][0] = 3411;
                this.field1484[6][0] = 4096;
                this.field1484[6][1] = 0;
                this.field1484[6][3] = 4096;
                this.field1484[6][2] = 0;
            } else if (arg0 == 4) {
                this.field1484 = new int[6][4];
                this.field1484[0][3] = 0;
                this.field1484[0][0] = 0;
                this.field1484[0][2] = 0;
                this.field1484[1][3] = 1493;
                this.field1484[1][2] = 0;
                this.field1484[1][0] = 1843;
                this.field1484[2][2] = 0;
                this.field1484[2][3] = 2939;
                this.field1484[3][3] = 3565;
                this.field1484[4][3] = 4031;
                this.field1484[2][0] = 2457;
                this.field1484[3][0] = 2781;
                this.field1484[3][2] = 1124;
                this.field1484[0][1] = 0;
                this.field1484[1][1] = 0;
                this.field1484[4][2] = 3084;
                this.field1484[5][3] = 4096;
                this.field1484[4][0] = 3481;
                this.field1484[5][2] = 4096;
                this.field1484[2][1] = 0;
                this.field1484[3][1] = 0;
                this.field1484[5][0] = 4096;
                this.field1484[4][1] = 546;
                this.field1484[5][1] = 4096;
            } else if (arg0 == 5) {
                this.field1484 = new int[16][4];
                this.field1484[0][3] = 321;
                this.field1484[1][3] = 562;
                this.field1484[2][3] = 803;
                this.field1484[0][0] = 0;
                this.field1484[0][1] = 80;
                this.field1484[0][2] = 192;
                this.field1484[3][3] = 1140;
                this.field1484[1][2] = 449;
                this.field1484[4][3] = 1509;
                this.field1484[5][3] = 1413;
                this.field1484[1][1] = 321;
                this.field1484[1][0] = 155;
                this.field1484[6][3] = 1333;
                this.field1484[2][0] = 389;
                this.field1484[7][3] = 1702;
                this.field1484[8][3] = 2056;
                this.field1484[2][1] = 578;
                this.field1484[9][3] = 2666;
                this.field1484[3][1] = 947;
                this.field1484[10][3] = 3276;
                this.field1484[11][3] = 3228;
                this.field1484[12][3] = 3196;
                this.field1484[4][1] = 1285;
                this.field1484[2][2] = 690;
                this.field1484[5][1] = 1525;
                this.field1484[13][3] = 3019;
                this.field1484[14][3] = 3228;
                this.field1484[3][2] = 995;
                this.field1484[15][3] = 2746;
                this.field1484[6][1] = 1734;
                this.field1484[4][2] = 1397;
                this.field1484[5][2] = 1429;
                this.field1484[6][2] = 1461;
                this.field1484[7][2] = 1525;
                this.field1484[7][1] = 1413;
                this.field1484[8][1] = 1108;
                this.field1484[3][0] = 671;
                this.field1484[4][0] = 897;
                this.field1484[8][2] = 1590;
                this.field1484[5][0] = 1175;
                this.field1484[6][0] = 1368;
                this.field1484[9][1] = 1766;
                this.field1484[10][1] = 2409;
                this.field1484[7][0] = 1507;
                this.field1484[9][2] = 2056;
                this.field1484[10][2] = 2586;
                this.field1484[8][0] = 1736;
                this.field1484[11][2] = 3148;
                this.field1484[12][2] = 3710;
                this.field1484[9][0] = 2088;
                this.field1484[10][0] = 2355;
                this.field1484[11][0] = 2691;
                this.field1484[11][1] = 3116;
                this.field1484[12][0] = 3031;
                this.field1484[13][2] = 3421;
                this.field1484[12][1] = 3806;
                this.field1484[13][0] = 3522;
                this.field1484[14][0] = 3727;
                this.field1484[15][0] = 4096;
                this.field1484[13][1] = 3437;
                this.field1484[14][2] = 3148;
                this.field1484[14][1] = 3116;
                this.field1484[15][2] = 2505;
                this.field1484[15][1] = 2377;
            } else if (arg0 == 6) {
                this.field1484 = new int[4][4];
                this.field1484[0][1] = 0;
                this.field1484[1][1] = 4096;
                this.field1484[0][0] = 2048;
                this.field1484[0][3] = 0;
                this.field1484[0][2] = 4096;
                this.field1484[1][3] = 0;
                this.field1484[1][0] = 2867;
                this.field1484[2][1] = 4096;
                this.field1484[2][3] = 0;
                this.field1484[1][2] = 4096;
                this.field1484[2][2] = 4096;
                this.field1484[3][2] = 0;
                this.field1484[3][3] = 0;
                this.field1484[2][0] = 3276;
                this.field1484[3][1] = 4096;
                this.field1484[3][0] = 4096;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg1 != 1525) {
            field1487 = (int[]) null;
        }
    }
}
