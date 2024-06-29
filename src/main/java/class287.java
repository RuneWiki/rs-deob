import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class287 extends class59 {

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "[I")
    private int[] field4711 = new int[257];

    @OriginalMember(owner = "client!pl", name = "S", descriptor = "I")
    public static int field4719 = 0;

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "Lph;")
    public static class229 field4716 = class266.method1858("Weiter", 0);

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!pl", name = "Q", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!pl", name = "R", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!pl", name = "T", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!pl", name = "V", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!pl", name = "W", descriptor = "[I")
    public static int[] field4723;

    @OriginalMember(owner = "client!pl", name = "U", descriptor = "[[I")
    private int[][] field4721;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BI)V", line = 8)
    private final void method1968(byte arg0, int arg1) {
        field4715++;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field4721 = new int[2][4];
                this.field4721[0][1] = 0;
                this.field4721[0][2] = 0;
                this.field4721[1][2] = 4096;
                this.field4721[0][3] = 0;
                this.field4721[0][0] = 0;
                this.field4721[1][0] = 4096;
                this.field4721[1][1] = 4096;
                this.field4721[1][3] = 4096;
            } else if (arg1 == 2) {
                this.field4721 = new int[8][4];
                this.field4721[0][1] = 2650;
                this.field4721[0][3] = 2361;
                this.field4721[1][1] = 2313;
                this.field4721[0][0] = 0;
                this.field4721[0][2] = 2602;
                this.field4721[1][3] = 1558;
                this.field4721[1][0] = 2867;
                this.field4721[2][3] = 1413;
                this.field4721[1][2] = 1799;
                this.field4721[3][3] = 947;
                this.field4721[2][1] = 2618;
                this.field4721[2][0] = 3072;
                this.field4721[3][0] = 3276;
                this.field4721[2][2] = 1734;
                this.field4721[4][0] = 3481;
                this.field4721[4][3] = 722;
                this.field4721[3][2] = 1220;
                this.field4721[3][1] = 2296;
                this.field4721[5][3] = 1766;
                this.field4721[4][2] = 963;
                this.field4721[5][0] = 3686;
                this.field4721[5][2] = 2152;
                this.field4721[4][1] = 2072;
                this.field4721[5][1] = 2730;
                this.field4721[6][3] = 915;
                this.field4721[7][3] = 1140;
                this.field4721[6][0] = 3891;
                this.field4721[6][2] = 1060;
                this.field4721[7][2] = 1413;
                this.field4721[7][0] = 4096;
                this.field4721[6][1] = 2232;
                this.field4721[7][1] = 1686;
            } else if (arg1 == 3) {
                this.field4721 = new int[7][4];
                this.field4721[0][2] = 0;
                this.field4721[0][3] = 4096;
                this.field4721[0][0] = 0;
                this.field4721[1][3] = 4096;
                this.field4721[2][3] = 0;
                this.field4721[1][0] = 663;
                this.field4721[3][3] = 0;
                this.field4721[0][1] = 0;
                this.field4721[1][1] = 0;
                this.field4721[2][0] = 1363;
                this.field4721[2][1] = 0;
                this.field4721[4][3] = 0;
                this.field4721[3][0] = 2048;
                this.field4721[1][2] = 4096;
                this.field4721[3][1] = 4096;
                this.field4721[5][3] = 4096;
                this.field4721[4][1] = 4096;
                this.field4721[5][1] = 4096;
                this.field4721[4][0] = 2727;
                this.field4721[5][0] = 3411;
                this.field4721[6][0] = 4096;
                this.field4721[2][2] = 4096;
                this.field4721[3][2] = 4096;
                this.field4721[6][3] = 4096;
                this.field4721[4][2] = 0;
                this.field4721[6][1] = 0;
                this.field4721[5][2] = 0;
                this.field4721[6][2] = 0;
            } else if (arg1 == 4) {
                this.field4721 = new int[6][4];
                this.field4721[0][1] = 0;
                this.field4721[0][3] = 0;
                this.field4721[0][2] = 0;
                this.field4721[1][2] = 0;
                this.field4721[0][0] = 0;
                this.field4721[1][1] = 0;
                this.field4721[1][0] = 1843;
                this.field4721[2][1] = 0;
                this.field4721[2][0] = 2457;
                this.field4721[3][1] = 0;
                this.field4721[1][3] = 1493;
                this.field4721[2][2] = 0;
                this.field4721[2][3] = 2939;
                this.field4721[3][3] = 3565;
                this.field4721[3][2] = 1124;
                this.field4721[3][0] = 2781;
                this.field4721[4][3] = 4031;
                this.field4721[4][0] = 3481;
                this.field4721[4][2] = 3084;
                this.field4721[5][3] = 4096;
                this.field4721[5][0] = 4096;
                this.field4721[5][2] = 4096;
                this.field4721[4][1] = 546;
                this.field4721[5][1] = 4096;
            } else if (arg1 == 5) {
                this.field4721 = new int[16][4];
                this.field4721[0][3] = 321;
                this.field4721[0][2] = 192;
                this.field4721[0][0] = 0;
                this.field4721[0][1] = 80;
                this.field4721[1][0] = 155;
                this.field4721[1][2] = 449;
                this.field4721[1][3] = 562;
                this.field4721[2][3] = 803;
                this.field4721[3][3] = 1140;
                this.field4721[1][1] = 321;
                this.field4721[2][0] = 389;
                this.field4721[2][1] = 578;
                this.field4721[3][0] = 671;
                this.field4721[3][1] = 947;
                this.field4721[2][2] = 690;
                this.field4721[4][1] = 1285;
                this.field4721[5][1] = 1525;
                this.field4721[4][3] = 1509;
                this.field4721[3][2] = 995;
                this.field4721[6][1] = 1734;
                this.field4721[4][2] = 1397;
                this.field4721[5][2] = 1429;
                this.field4721[7][1] = 1413;
                this.field4721[6][2] = 1461;
                this.field4721[7][2] = 1525;
                this.field4721[8][1] = 1108;
                this.field4721[5][3] = 1413;
                this.field4721[4][0] = 897;
                this.field4721[5][0] = 1175;
                this.field4721[6][3] = 1333;
                this.field4721[9][1] = 1766;
                this.field4721[7][3] = 1702;
                this.field4721[6][0] = 1368;
                this.field4721[8][3] = 2056;
                this.field4721[10][1] = 2409;
                this.field4721[9][3] = 2666;
                this.field4721[10][3] = 3276;
                this.field4721[8][2] = 1590;
                this.field4721[11][1] = 3116;
                this.field4721[11][3] = 3228;
                this.field4721[7][0] = 1507;
                this.field4721[8][0] = 1736;
                this.field4721[9][2] = 2056;
                this.field4721[12][1] = 3806;
                this.field4721[9][0] = 2088;
                this.field4721[10][0] = 2355;
                this.field4721[13][1] = 3437;
                this.field4721[11][0] = 2691;
                this.field4721[12][0] = 3031;
                this.field4721[12][3] = 3196;
                this.field4721[10][2] = 2586;
                this.field4721[13][3] = 3019;
                this.field4721[11][2] = 3148;
                this.field4721[12][2] = 3710;
                this.field4721[14][1] = 3116;
                this.field4721[15][1] = 2377;
                this.field4721[13][0] = 3522;
                this.field4721[14][0] = 3727;
                this.field4721[13][2] = 3421;
                this.field4721[15][0] = 4096;
                this.field4721[14][3] = 3228;
                this.field4721[14][2] = 3148;
                this.field4721[15][3] = 2746;
                this.field4721[15][2] = 2505;
            } else if (arg1 == 6) {
                this.field4721 = new int[4][4];
                this.field4721[0][3] = 0;
                this.field4721[0][1] = 0;
                this.field4721[1][1] = 4096;
                this.field4721[1][3] = 0;
                this.field4721[2][3] = 0;
                this.field4721[0][0] = 2048;
                this.field4721[1][0] = 2867;
                this.field4721[2][1] = 4096;
                this.field4721[3][3] = 0;
                this.field4721[0][2] = 4096;
                this.field4721[1][2] = 4096;
                this.field4721[2][2] = 4096;
                this.field4721[3][2] = 0;
                this.field4721[2][0] = 3276;
                this.field4721[3][1] = 4096;
                this.field4721[3][0] = 4096;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg0 < 114) {
            this.method67((byte) 111, 70, (class164) null);
        }
    }

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "(I)V", line = 263)
    private final void method1969(int arg0) {
        field4713++;
        int var2 = this.field4721.length;
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var6 < var2 && this.field4721[var6][0] <= var5; var6++) {
                    var4++;
                }
                int var8;
                int var9;
                int var10;
                if (var2 <= var4) {
                    int[] var7 = this.field4721[var2 - 1];
                    var8 = var7[1];
                    var9 = var7[3];
                    var10 = var7[2];
                } else {
                    int[] var11 = this.field4721[var4];
                    if (var4 <= 0) {
                        var8 = var11[1];
                        var10 = var11[2];
                        var9 = var11[3];
                    } else {
                        int[] var12 = this.field4721[var4 - 1];
                        int var13 = (var5 - var12[0] << 12) / (var11[0] - var12[0]);
                        int var14 = 4096 - var13;
                        var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var10 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                    }
                }
                int var15 = var9 >> 4;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                int var16 = var8 >> 4;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                int var17 = var10 >> 4;
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                this.field4711[var3] = class201.method1410(class201.method1410(var16 << 16, var17 << 8), var15);
            }
        }
        if (arg0 != 2) {
            this.method1968((byte) -120, -57);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)[[I", line = 366)
    public final int[][] method116(int arg0, int arg1) {
        field4722++;
        if (arg1 != 4588) {
            this.method1968((byte) 47, 102);
        }
        int[][] var3 = this.field838.method1796(true, arg0);
        if (this.field838.field4334) {
            int[] var4 = this.method394(arg0, 0, (byte) 104);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class293.field4789; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field4711[var9];
                var5[var8] = class243.method1696(var10, 16711680) >> 12;
                var6[var8] = class243.method1696(var10 >> 4, 4080);
                var7[var8] = class243.method1696(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(BI)Lph;", line = 419)
    public static final class229 method1970(byte arg0, int arg1) {
        if (arg0 > -46) {
            field4718 = -38;
        }
        field4709++;
        return arg1 >= 999999999 ? class162.field2619 : class50.method354(0, arg1);
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(III)J", line = 437)
    public static final long method1971(int arg0, int arg1, int arg2) {
        class72 var3 = class225.field3705[arg0][arg1][arg2];
        return var3 == null || var3.field1214 == null ? 0L : var3.field1214.field1502;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BILhb;)V", line = 454)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        if (arg1 == 0) {
            int var4 = arg2.method1178(8);
            if (var4 == 0) {
                this.field4721 = new int[arg2.method1178(8)][4];
                for (int var5 = 0; var5 < this.field4721.length; var5++) {
                    this.field4721[var5][0] = arg2.method1161(true);
                    this.field4721[var5][1] = arg2.method1178(8) << 4;
                    this.field4721[var5][2] = arg2.method1178(8) << 4;
                    this.field4721[var5][3] = arg2.method1178(8) << 4;
                }
            } else {
                this.method1968((byte) 119, var4);
            }
        }
        if (arg0 != 115) {
            field4718 = -38;
        }
        field4720++;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V", line = 492)
    public class287() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)I", line = 496)
    public static final int method1972(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 > 243) {
            arg3 >>= 0x4;
        } else if (arg1 > 217) {
            arg3 >>= 0x3;
        } else if (arg1 > 192) {
            arg3 >>= 0x2;
        } else if (arg1 > 179) {
            arg3 >>= 0x1;
        }
        field4714++;
        return arg0 == 15540 ? (arg2 >> 2 << 10) - (-(arg3 >> 5 << 7) - (arg1 >> 1)) : 3;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V", line = 538)
    public static void method1973(byte arg0) {
        if (arg0 != 18) {
            method1970((byte) -67, 72);
        }
        field4716 = null;
        field4723 = null;
    }

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "(I)V", line = 561)
    public final void method65(int arg0) {
        field4717++;
        if (arg0 > 110) {
            if (this.field4721 == null) {
                this.method1968((byte) 124, 1);
            }
            this.method1969(2);
        }
    }
}
