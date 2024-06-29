import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class166 extends class3 {

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "[I")
    private int[] field2610 = new int[257];

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "[I")
    public static int[] field2611 = new int[2048];

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "I")
    public static int field2616 = 0;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "Ljo;")
    public static class150 field2615 = new class150();

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "Ljava/lang/String;")
    public static String field2621 = "Close";

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field2624 = new String[100];

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "[I")
    public static int[] field2625 = new int[100];

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "Lnm;")
    public static class221 field2608;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "[I")
    public static int[] field2622;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "[Ldi;")
    public static class54[] field2623;

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "[[I")
    private int[][] field2617;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V", line = 4)
    public static void method1156(int arg0) {
        field2625 = null;
        field2621 = null;
        field2611 = null;
        field2608 = null;
        field2624 = null;
        field2623 = null;
        if (arg0 == -5675) {
            field2615 = null;
            field2622 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(B)V", line = 25)
    public final void method20(byte arg0) {
        int var2 = 14 % ((arg0 + 20) / 58);
        field2609++;
        if (this.field2617 == null) {
            this.method1157(1, (byte) -45);
        }
        this.method1158(3);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lfh;IZ)V", line = 38)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            int var4 = arg0.method2224(-120);
            if (var4 == 0) {
                this.field2617 = new int[arg0.method2224(-126)][4];
                for (int var5 = 0; var5 < this.field2617.length; var5++) {
                    this.field2617[var5][0] = arg0.method2250(-1613178296);
                    this.field2617[var5][1] = arg0.method2224(-128) << 4;
                    this.field2617[var5][2] = arg0.method2224(-125) << 4;
                    this.field2617[var5][3] = arg0.method2224(-119) << 4;
                }
            } else {
                this.method1157(var4, (byte) 110);
            }
        }
        field2613++;
        if (arg2) {
            this.method20((byte) -36);
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V", line = 141)
    public class166() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)[[I", line = 93)
    public final int[][] method22(int arg0, int arg1) {
        int[][] var3 = this.field20.method2435(arg1, false);
        field2620++;
        if (this.field20.field5556) {
            int[] var4 = this.method24(arg1, 1, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class326.field5342; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field2610[var9];
                var5[var8] = class235.method1623(var10 >> 12, 4080);
                var6[var8] = class235.method1623(4080, var10 >> 4);
                var7[var8] = class235.method1623(var10 << 4, 4080);
            }
        }
        if (arg0 != -21194) {
            method1156(120);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)V", line = 146)
    private final void method1157(int arg0, byte arg1) {
        int var3 = -23 / ((10 - arg1) / 50);
        field2619++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            this.field2617 = new int[2][4];
            this.field2617[0][3] = 0;
            this.field2617[1][3] = 4096;
            this.field2617[0][0] = 0;
            this.field2617[0][1] = 0;
            this.field2617[0][2] = 0;
            this.field2617[1][1] = 4096;
            this.field2617[1][2] = 4096;
            this.field2617[1][0] = 4096;
        } else if (arg0 == 2) {
            this.field2617 = new int[8][4];
            this.field2617[0][1] = 2650;
            this.field2617[0][3] = 2361;
            this.field2617[1][1] = 2313;
            this.field2617[0][2] = 2602;
            this.field2617[1][2] = 1799;
            this.field2617[0][0] = 0;
            this.field2617[2][1] = 2618;
            this.field2617[2][2] = 1734;
            this.field2617[1][3] = 1558;
            this.field2617[3][1] = 2296;
            this.field2617[4][1] = 2072;
            this.field2617[5][1] = 2730;
            this.field2617[6][1] = 2232;
            this.field2617[3][2] = 1220;
            this.field2617[2][3] = 1413;
            this.field2617[4][2] = 963;
            this.field2617[1][0] = 2867;
            this.field2617[7][1] = 1686;
            this.field2617[3][3] = 947;
            this.field2617[4][3] = 722;
            this.field2617[5][2] = 2152;
            this.field2617[2][0] = 3072;
            this.field2617[3][0] = 3276;
            this.field2617[5][3] = 1766;
            this.field2617[6][2] = 1060;
            this.field2617[6][3] = 915;
            this.field2617[7][2] = 1413;
            this.field2617[4][0] = 3481;
            this.field2617[7][3] = 1140;
            this.field2617[5][0] = 3686;
            this.field2617[6][0] = 3891;
            this.field2617[7][0] = 4096;
        } else if (arg0 == 3) {
            this.field2617 = new int[7][4];
            this.field2617[0][3] = 4096;
            this.field2617[1][3] = 4096;
            this.field2617[2][3] = 0;
            this.field2617[0][0] = 0;
            this.field2617[0][1] = 0;
            this.field2617[1][1] = 0;
            this.field2617[0][2] = 0;
            this.field2617[1][2] = 4096;
            this.field2617[2][1] = 0;
            this.field2617[3][1] = 4096;
            this.field2617[3][3] = 0;
            this.field2617[1][0] = 663;
            this.field2617[2][0] = 1363;
            this.field2617[4][3] = 0;
            this.field2617[4][1] = 4096;
            this.field2617[3][0] = 2048;
            this.field2617[5][1] = 4096;
            this.field2617[2][2] = 4096;
            this.field2617[4][0] = 2727;
            this.field2617[5][3] = 4096;
            this.field2617[6][1] = 0;
            this.field2617[6][3] = 4096;
            this.field2617[3][2] = 4096;
            this.field2617[4][2] = 0;
            this.field2617[5][2] = 0;
            this.field2617[6][2] = 0;
            this.field2617[5][0] = 3411;
            this.field2617[6][0] = 4096;
        } else if (arg0 == 4) {
            this.field2617 = new int[6][4];
            this.field2617[0][2] = 0;
            this.field2617[0][3] = 0;
            this.field2617[1][2] = 0;
            this.field2617[1][3] = 1493;
            this.field2617[2][2] = 0;
            this.field2617[3][2] = 1124;
            this.field2617[2][3] = 2939;
            this.field2617[0][0] = 0;
            this.field2617[4][2] = 3084;
            this.field2617[0][1] = 0;
            this.field2617[1][1] = 0;
            this.field2617[3][3] = 3565;
            this.field2617[4][3] = 4031;
            this.field2617[1][0] = 1843;
            this.field2617[5][2] = 4096;
            this.field2617[5][3] = 4096;
            this.field2617[2][0] = 2457;
            this.field2617[2][1] = 0;
            this.field2617[3][0] = 2781;
            this.field2617[3][1] = 0;
            this.field2617[4][1] = 546;
            this.field2617[5][1] = 4096;
            this.field2617[4][0] = 3481;
            this.field2617[5][0] = 4096;
        } else if (arg0 == 5) {
            this.field2617 = new int[16][4];
            this.field2617[0][0] = 0;
            this.field2617[0][2] = 192;
            this.field2617[0][1] = 80;
            this.field2617[1][0] = 155;
            this.field2617[0][3] = 321;
            this.field2617[2][0] = 389;
            this.field2617[1][3] = 562;
            this.field2617[1][2] = 449;
            this.field2617[3][0] = 671;
            this.field2617[4][0] = 897;
            this.field2617[1][1] = 321;
            this.field2617[2][1] = 578;
            this.field2617[2][2] = 690;
            this.field2617[3][2] = 995;
            this.field2617[4][2] = 1397;
            this.field2617[3][1] = 947;
            this.field2617[2][3] = 803;
            this.field2617[4][1] = 1285;
            this.field2617[5][2] = 1429;
            this.field2617[5][1] = 1525;
            this.field2617[6][2] = 1461;
            this.field2617[5][0] = 1175;
            this.field2617[3][3] = 1140;
            this.field2617[4][3] = 1509;
            this.field2617[5][3] = 1413;
            this.field2617[6][0] = 1368;
            this.field2617[7][0] = 1507;
            this.field2617[7][2] = 1525;
            this.field2617[8][2] = 1590;
            this.field2617[9][2] = 2056;
            this.field2617[6][1] = 1734;
            this.field2617[7][1] = 1413;
            this.field2617[8][1] = 1108;
            this.field2617[10][2] = 2586;
            this.field2617[8][0] = 1736;
            this.field2617[6][3] = 1333;
            this.field2617[11][2] = 3148;
            this.field2617[12][2] = 3710;
            this.field2617[9][1] = 1766;
            this.field2617[10][1] = 2409;
            this.field2617[7][3] = 1702;
            this.field2617[11][1] = 3116;
            this.field2617[13][2] = 3421;
            this.field2617[8][3] = 2056;
            this.field2617[12][1] = 3806;
            this.field2617[9][0] = 2088;
            this.field2617[14][2] = 3148;
            this.field2617[13][1] = 3437;
            this.field2617[10][0] = 2355;
            this.field2617[15][2] = 2505;
            this.field2617[9][3] = 2666;
            this.field2617[11][0] = 2691;
            this.field2617[10][3] = 3276;
            this.field2617[14][1] = 3116;
            this.field2617[12][0] = 3031;
            this.field2617[15][1] = 2377;
            this.field2617[11][3] = 3228;
            this.field2617[12][3] = 3196;
            this.field2617[13][3] = 3019;
            this.field2617[13][0] = 3522;
            this.field2617[14][0] = 3727;
            this.field2617[14][3] = 3228;
            this.field2617[15][3] = 2746;
            this.field2617[15][0] = 4096;
        } else if (arg0 == 6) {
            this.field2617 = new int[4][4];
            this.field2617[0][0] = 2048;
            this.field2617[0][3] = 0;
            this.field2617[1][0] = 2867;
            this.field2617[0][2] = 4096;
            this.field2617[2][0] = 3276;
            this.field2617[3][0] = 4096;
            this.field2617[0][1] = 0;
            this.field2617[1][3] = 0;
            this.field2617[2][3] = 0;
            this.field2617[1][1] = 4096;
            this.field2617[1][2] = 4096;
            this.field2617[2][2] = 4096;
            this.field2617[3][3] = 0;
            this.field2617[2][1] = 4096;
            this.field2617[3][1] = 4096;
            this.field2617[3][2] = 0;
        } else {
            throw new RuntimeException("Invalid gradient preset");
        }
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V", line = 397)
    private final void method1158(int arg0) {
        if (arg0 != 3) {
            field2612 = -112;
        }
        field2618++;
        int var2 = this.field2617.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var6 < var2 && this.field2617[var6][0] <= var5; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var2 <= var4) {
                int[] var7 = this.field2617[var2 - 1];
                var8 = var7[2];
                var9 = var7[3];
                var10 = var7[1];
            } else {
                int[] var11 = this.field2617[var4];
                if (var4 <= 0) {
                    var8 = var11[2];
                    var9 = var11[3];
                    var10 = var11[1];
                } else {
                    int[] var12 = this.field2617[var4 - 1];
                    int var13 = (var5 - var12[0] << 12) / (var11[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                    var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                    var8 = var11[2] * var13 + (var12[2] * var14) >> 12;
                }
            }
            int var15 = var9 >> 4;
            int var16 = var8 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            int var17 = var10 >> 4;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field2610[var3] = class167.method1160(class167.method1160(var17 << 16, var16 << 8), var15);
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(BI)V", line = 508)
    public static final void method1159(byte arg0, int arg1) {
        field2614++;
        class154.field2492.method645(arg1, (byte) -115);
        int var2 = -23 / ((arg0 + 73) / 51);
    }
}
