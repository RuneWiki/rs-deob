import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class55 extends class219 {

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "[I")
    private int[] field865 = new int[257];

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "Lbd;")
    private static class162 field862 = class17.method142(0, "green:");

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "Lbd;")
    public static class162 field860 = field862;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "Lbd;")
    public static class162 field867 = field862;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "Lem;")
    public static class240 field863;

    @OriginalMember(owner = "client!qf", name = "Z", descriptor = "[[I")
    private int[][] field875;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILob;)V", line = 7)
    public static final void method386(int arg0, class78 arg1) {
        if (class178.field3045 == arg1.field1275) {
            class73.field1159[arg1.field1269] = true;
        }
        field861++;
        if (arg0 != 0) {
            field862 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(B)V", line = 26)
    public static void method387(byte arg0) {
        if (arg0 > 63) {
            field863 = null;
            field860 = null;
            field867 = null;
            field862 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II[Lob;)V", line = 42)
    public static final void method388(int arg0, int arg1, class78[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class78 var4 = arg2[var3];
            if (var4 != null && var4.field1371 == arg1 && (!var4.field1229 || !client.method864(var4))) {
                if (var4.field1231 == 0) {
                    if (!var4.field1229 && client.method864(var4) && class289.field4863 != var4) {
                        continue;
                    }
                    method388(21095, var4.field1235, arg2);
                    if (var4.field1363 != null) {
                        method388(arg0 ^ 0x0, var4.field1235, var4.field1363);
                    }
                    class172 var5 = (class172) class137.field2440.method1672((long) var4.field1235, 19760);
                    if (var5 != null) {
                        class116.method922(var5.field2985, (byte) -72);
                    }
                }
                if (var4.field1231 == 6) {
                    if (var4.field1317 != -1 || var4.field1274 != -1) {
                        boolean var6 = class122.method991(var4, 0);
                        int var7;
                        if (var6) {
                            var7 = var4.field1274;
                        } else {
                            var7 = var4.field1317;
                        }
                        if (var7 != -1) {
                            class142 var8 = class139.method1084(-58, var7);
                            if (var8 != null) {
                                var4.field1270 += class149.field2680;
                                while (var8.field2527[var4.field1288] < var4.field1270) {
                                    var4.field1270 -= var8.field2527[var4.field1288];
                                    var4.field1288++;
                                    if (var4.field1288 >= var8.field2522.length) {
                                        var4.field1288 -= var8.field2530;
                                        if (var4.field1288 < 0 || var8.field2522.length <= var4.field1288) {
                                            var4.field1288 = 0;
                                        }
                                    }
                                    method386(arg0 ^ 0x5267, var4);
                                }
                            }
                        }
                    }
                    if (var4.field1233 != 0 && !var4.field1229) {
                        int var9 = var4.field1233 >> 16;
                        int var10 = var4.field1233 << 16 >> 16;
                        int var11 = class149.field2680 * var9;
                        var4.field1237 = var4.field1237 + var11 & 0x7FF;
                        int var12 = class149.field2680 * var10;
                        var4.field1323 = var4.field1323 + var12 & 0x7FF;
                        method386(arg0 ^ 0x5267, var4);
                    }
                }
            }
        }
        if (arg0 != 21095) {
            method393((byte) 18, 58, 5);
        }
        field872++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V", line = 152)
    public static final void method389(int arg0, int arg1) {
        field868++;
        class7.method44((byte) -73);
        class43.method319((byte) -114);
        int var2 = class261.method1801((byte) 91, arg1).field3268;
        if (arg0 == var2) {
            return;
        }
        int var3 = class129.field2329[arg1];
        if (var2 == 6) {
            class138.field2473 = var3;
        }
        if (var2 == 5) {
            class207.field3495 = var3;
        }
        if (var2 == 9) {
            class182.field3130 = var3;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)V", line = 179)
    private final void method390(byte arg0, int arg1) {
        field873++;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field875 = new int[2][4];
                this.field875[0][3] = 0;
                this.field875[1][3] = 4096;
                this.field875[0][2] = 0;
                this.field875[0][1] = 0;
                this.field875[1][1] = 4096;
                this.field875[0][0] = 0;
                this.field875[1][0] = 4096;
                this.field875[1][2] = 4096;
            } else if (arg1 == 2) {
                this.field875 = new int[8][4];
                this.field875[0][1] = 2650;
                this.field875[1][1] = 2313;
                this.field875[0][0] = 0;
                this.field875[1][0] = 2867;
                this.field875[2][0] = 3072;
                this.field875[0][2] = 2602;
                this.field875[2][1] = 2618;
                this.field875[3][0] = 3276;
                this.field875[0][3] = 2361;
                this.field875[3][1] = 2296;
                this.field875[1][3] = 1558;
                this.field875[4][0] = 3481;
                this.field875[4][1] = 2072;
                this.field875[1][2] = 1799;
                this.field875[2][2] = 1734;
                this.field875[3][2] = 1220;
                this.field875[4][2] = 963;
                this.field875[5][2] = 2152;
                this.field875[5][0] = 3686;
                this.field875[6][0] = 3891;
                this.field875[2][3] = 1413;
                this.field875[5][1] = 2730;
                this.field875[3][3] = 947;
                this.field875[6][1] = 2232;
                this.field875[7][1] = 1686;
                this.field875[4][3] = 722;
                this.field875[7][0] = 4096;
                this.field875[5][3] = 1766;
                this.field875[6][2] = 1060;
                this.field875[7][2] = 1413;
                this.field875[6][3] = 915;
                this.field875[7][3] = 1140;
            } else if (arg1 == 3) {
                this.field875 = new int[7][4];
                this.field875[0][3] = 4096;
                this.field875[0][2] = 0;
                this.field875[0][1] = 0;
                this.field875[1][3] = 4096;
                this.field875[0][0] = 0;
                this.field875[2][3] = 0;
                this.field875[3][3] = 0;
                this.field875[1][0] = 663;
                this.field875[4][3] = 0;
                this.field875[1][2] = 4096;
                this.field875[1][1] = 0;
                this.field875[2][0] = 1363;
                this.field875[3][0] = 2048;
                this.field875[5][3] = 4096;
                this.field875[6][3] = 4096;
                this.field875[4][0] = 2727;
                this.field875[2][2] = 4096;
                this.field875[5][0] = 3411;
                this.field875[3][2] = 4096;
                this.field875[2][1] = 0;
                this.field875[4][2] = 0;
                this.field875[5][2] = 0;
                this.field875[6][2] = 0;
                this.field875[3][1] = 4096;
                this.field875[4][1] = 4096;
                this.field875[5][1] = 4096;
                this.field875[6][0] = 4096;
                this.field875[6][1] = 0;
            } else if (arg1 == 4) {
                this.field875 = new int[6][4];
                this.field875[0][0] = 0;
                this.field875[1][0] = 1843;
                this.field875[0][3] = 0;
                this.field875[0][1] = 0;
                this.field875[1][1] = 0;
                this.field875[2][0] = 2457;
                this.field875[0][2] = 0;
                this.field875[1][2] = 0;
                this.field875[1][3] = 1493;
                this.field875[3][0] = 2781;
                this.field875[4][0] = 3481;
                this.field875[5][0] = 4096;
                this.field875[2][3] = 2939;
                this.field875[2][2] = 0;
                this.field875[3][2] = 1124;
                this.field875[2][1] = 0;
                this.field875[3][3] = 3565;
                this.field875[4][2] = 3084;
                this.field875[5][2] = 4096;
                this.field875[4][3] = 4031;
                this.field875[5][3] = 4096;
                this.field875[3][1] = 0;
                this.field875[4][1] = 546;
                this.field875[5][1] = 4096;
            } else if (arg1 == 5) {
                this.field875 = new int[16][4];
                this.field875[0][2] = 192;
                this.field875[0][3] = 321;
                this.field875[0][0] = 0;
                this.field875[1][3] = 562;
                this.field875[2][3] = 803;
                this.field875[1][2] = 449;
                this.field875[2][2] = 690;
                this.field875[0][1] = 80;
                this.field875[1][1] = 321;
                this.field875[2][1] = 578;
                this.field875[3][1] = 947;
                this.field875[1][0] = 155;
                this.field875[3][2] = 995;
                this.field875[2][0] = 389;
                this.field875[3][3] = 1140;
                this.field875[4][2] = 1397;
                this.field875[4][1] = 1285;
                this.field875[5][2] = 1429;
                this.field875[6][2] = 1461;
                this.field875[7][2] = 1525;
                this.field875[8][2] = 1590;
                this.field875[9][2] = 2056;
                this.field875[5][1] = 1525;
                this.field875[4][3] = 1509;
                this.field875[10][2] = 2586;
                this.field875[3][0] = 671;
                this.field875[11][2] = 3148;
                this.field875[5][3] = 1413;
                this.field875[6][1] = 1734;
                this.field875[7][1] = 1413;
                this.field875[6][3] = 1333;
                this.field875[4][0] = 897;
                this.field875[7][3] = 1702;
                this.field875[8][3] = 2056;
                this.field875[9][3] = 2666;
                this.field875[8][1] = 1108;
                this.field875[9][1] = 1766;
                this.field875[10][1] = 2409;
                this.field875[10][3] = 3276;
                this.field875[11][1] = 3116;
                this.field875[12][1] = 3806;
                this.field875[13][1] = 3437;
                this.field875[14][1] = 3116;
                this.field875[15][1] = 2377;
                this.field875[12][2] = 3710;
                this.field875[5][0] = 1175;
                this.field875[11][3] = 3228;
                this.field875[13][2] = 3421;
                this.field875[12][3] = 3196;
                this.field875[6][0] = 1368;
                this.field875[14][2] = 3148;
                this.field875[13][3] = 3019;
                this.field875[15][2] = 2505;
                this.field875[14][3] = 3228;
                this.field875[15][3] = 2746;
                this.field875[7][0] = 1507;
                this.field875[8][0] = 1736;
                this.field875[9][0] = 2088;
                this.field875[10][0] = 2355;
                this.field875[11][0] = 2691;
                this.field875[12][0] = 3031;
                this.field875[13][0] = 3522;
                this.field875[14][0] = 3727;
                this.field875[15][0] = 4096;
            } else if (arg1 == 6) {
                this.field875 = new int[4][4];
                this.field875[0][0] = 2048;
                this.field875[0][1] = 0;
                this.field875[0][2] = 4096;
                this.field875[1][2] = 4096;
                this.field875[1][1] = 4096;
                this.field875[2][1] = 4096;
                this.field875[0][3] = 0;
                this.field875[1][0] = 2867;
                this.field875[2][0] = 3276;
                this.field875[3][0] = 4096;
                this.field875[1][3] = 0;
                this.field875[2][3] = 0;
                this.field875[2][2] = 4096;
                this.field875[3][3] = 0;
                this.field875[3][2] = 0;
                this.field875[3][1] = 4096;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg0 > 20) {
            ;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILb;)V", line = 431)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg1 != 0) {
            return;
        }
        if (arg0 == 0) {
            int var4 = arg2.method756(915905888);
            if (var4 == 0) {
                this.field875 = new int[arg2.method756(arg1 ^ 0x36979D60)][4];
                for (int var5 = 0; var5 < this.field875.length; var5++) {
                    this.field875[var5][0] = arg2.method761((byte) 108);
                    this.field875[var5][1] = arg2.method756(915905888) << 4;
                    this.field875[var5][2] = arg2.method756(915905888) << 4;
                    this.field875[var5][3] = arg2.method756(915905888) << 4;
                }
            } else {
                this.method390((byte) 67, var4);
            }
        }
        field870++;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)V", line = 474)
    public final void method39(byte arg0) {
        field864++;
        if (this.field875 == null) {
            this.method390((byte) 126, 1);
        }
        this.method394((byte) -127);
        if (arg0 != 22) {
            method391((class143) null, 109);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)[[I", line = 492)
    public final int[][] method219(int arg0, byte arg1) {
        field874++;
        int[][] var3 = this.field3651.method406(false, arg0);
        if (this.field3651.field917) {
            int[] var4 = this.method1585(0, arg0, -6606);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class128.field2326; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field865[var9];
                var5[var8] = class92.method695(var10 >> 12, 4080);
                var7[var8] = class92.method695(var10, 65280) >> 4;
                var6[var8] = class92.method695(var10, 255) << 4;
            }
        }
        if (arg1 != 83) {
            this.method219(126, (byte) -15);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lda;I)V", line = 542)
    public static final void method391(class143 arg0, int arg1) {
        field869++;
        if (arg1 != 3) {
            field867 = (class162) null;
        }
        class13.field216 = arg0;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V", line = 580)
    public class55() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(B)V", line = 567)
    public static final void method392(byte arg0) {
        class112.field2022.method1529(false);
        class27.field459.method1529(false);
        class93.field1647.method1529(false);
        if (arg0 != -17) {
            method387((byte) -109);
        }
        field871++;
        class284.field4806.method1529(false);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BII)V", line = 594)
    public static final void method393(byte arg0, int arg1, int arg2) {
        field866++;
        if (arg0 < 4) {
            field860 = (class162) null;
        }
        class70 var3 = class111.method897((byte) -60, arg2);
        int var4 = var3.field1122;
        int var5 = var3.field1118;
        int var6 = var3.field1116;
        int var7 = class129.field2332[var6 - var5];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class278.method1911(0, var4, ~var8 & class129.field2329[var4] | var8 & arg1 << var5);
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "(B)V", line = 625)
    private final void method394(byte arg0) {
        field859++;
        if (arg0 >= -123) {
            method393((byte) -33, 66, 32);
        }
        int var2 = this.field875.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var6 < var2 && var5 >= this.field875[var6][0]; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var4 >= var2) {
                int[] var7 = this.field875[var2 - 1];
                var8 = var7[2];
                var9 = var7[3];
                var10 = var7[1];
            } else {
                int[] var11 = this.field875[var4];
                if (var4 > 0) {
                    int[] var12 = this.field875[var4 - 1];
                    int var13 = (var5 - var12[0] << 12) / (var11[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var8 = var11[2] * var13 + (var12[2] * var14) >> 12;
                    var10 = var11[1] * var13 + (var12[1] * var14) >> 12;
                    var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                } else {
                    var9 = var11[3];
                    var10 = var11[1];
                    var8 = var11[2];
                }
            }
            int var15 = var10 >> 4;
            int var16 = var9 >> 4;
            int var17 = var8 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            this.field865[var3] = class289.method2005(class289.method2005(var15 << 16, var17 << 8), var16);
        }
    }
}
