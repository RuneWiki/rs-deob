import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class107 extends class601 {

    @OriginalMember(owner = "client!ct", name = "N", descriptor = "[I")
    private int[] field1458 = new int[257];

    @OriginalMember(owner = "client!ct", name = "G", descriptor = "[S")
    public static short[] field1451 = new short[] { 50, 2, 17, 57, 22, 3, 10, 47 };

    @OriginalMember(owner = "client!ct", name = "K", descriptor = "Ljaa;")
    public static class779 field1455 = new class779();

    @OriginalMember(owner = "client!ct", name = "F", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!ct", name = "H", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!ct", name = "I", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ct", name = "L", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!ct", name = "M", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!ct", name = "O", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!ct", name = "P", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!ct", name = "J", descriptor = "[[I")
    private int[][] field1454;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(III)V", line = 4)
    public static final void method634(int arg0, int arg1, int arg2) {
        ++field1459;
        class614 var3 = class497.method2759(15, 5977, 0L);
        var3.method3277(639);
        var3.field7742 = arg0;
        var3.field7746 = arg1;
        if (arg2 < 114) {
            method635((byte) -117);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lmc;II)V", line = 22)
    public final void method259(class234 arg0, int arg1, int arg2) {
        int var4 = 85 / ((arg2 - 40) / 52);
        ++field1452;
        if (~arg1 == -1) {
            int var5 = arg0.method1509(true);
            if (~var5 != -1) {
                this.method639(3, var5);
            } else {
                this.field1454 = new int[arg0.method1509(true)][4];
                for (int var6 = 0; this.field1454.length > var6; ++var6) {
                    this.field1454[var6][0] = arg0.method1553((byte) -6);
                    this.field1454[var6][1] = arg0.method1509(true) << 4;
                    this.field1454[var6][2] = arg0.method1509(true) << 4;
                    this.field1454[var6][3] = arg0.method1509(true) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(B)[Lrw;", line = 59)
    public static final class264[] method635(byte arg0) {
        if (arg0 != -76) {
            field1455 = null;
        }
        if (class119.field1603 == null) {
            class264[] var1 = class76.method472(arg0 + -19301, class740.field10014);
            class264[] var2 = new class264[var1.length];
            int var3 = 0;
            int var4 = class485.field6252.field6955.method1462(false);
            label72: for (int var5 = 0; ~var5 > ~var1.length; ++var5) {
                class264 var9 = var1[var5];
                if ((var9.field3512 <= 0 || ~var9.field3512 <= -25) && var9.field3514 >= 800 && ~var9.field3513 <= -601 && (~var4 != -3 || var9.field3514 <= 800 && ~var9.field3513 >= -601) && (~var4 != -2 || var9.field3514 <= 1024 && var9.field3513 <= 768)) {
                    for (int var10 = 0; ~var10 > ~var3; ++var10) {
                        class264 var11 = var2[var10];
                        if (~var9.field3514 == ~var11.field3514 && ~var9.field3513 == ~var11.field3513) {
                            if (var11.field3512 < var9.field3512) {
                                var2[var10] = var9;
                            }
                            continue label72;
                        }
                    }
                    var2[var3] = var9;
                    ++var3;
                }
            }
            class119.field1603 = new class264[var3];
            class642.method3474(var2, 0, class119.field1603, 0, var3);
            int[] var6 = new int[class119.field1603.length];
            for (int var7 = 0; ~var7 > ~class119.field1603.length; ++var7) {
                class264 var8 = class119.field1603[var7];
                var6[var7] = var8.field3514 * var8.field3513;
            }
            class667.method3617(arg0 + 75, class119.field1603, var6);
        }
        ++field1457;
        return class119.field1603;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)V", line = 147)
    public final void method292(byte arg0) {
        if (this.field1454 == null) {
            this.method639(3, 1);
        }
        ++field1456;
        if (arg0 > 44) {
            this.method637((byte) 89);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)V", line = 161)
    public static void method636(boolean arg0) {
        field1451 = null;
        if (!arg0) {
            field1451 = null;
        }
        field1455 = null;
    }

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "(B)V", line = 176)
    private final void method637(byte arg0) {
        ++field1460;
        int var2 = this.field1454.length;
        if (arg0 == 89) {
            if (~var2 < -1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; ~var6 > ~var2 && this.field1454[var6][0] <= var5; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (var2 <= var4) {
                        int[] var7 = this.field1454[var2 + -1];
                        var8 = var7[2];
                        var9 = var7[1];
                        var10 = var7[3];
                    } else {
                        int[] var11 = this.field1454[var4];
                        if (~var4 >= -1) {
                            var9 = var11[1];
                            var8 = var11[2];
                            var10 = var11[3];
                        } else {
                            int[] var12 = this.field1454[var4 + -1];
                            int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                            int var14 = 4096 - var13;
                            var10 = var11[3] * var13 - -(var12[3] * var14) >> 12;
                            var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                            var9 = var11[1] * var13 + var12[1] * var14 >> 12;
                        }
                    }
                    int var15 = var9 >> 4;
                    int var16 = var8 >> 4;
                    int var17 = var10 >> 4;
                    if (~var15 > -1) {
                        var15 = 0;
                    } else if (~var15 < -256) {
                        var15 = 255;
                    }
                    if (~var17 <= -1) {
                        if (~var17 < -256) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (~var16 < -256) {
                        var16 = 255;
                    }
                    this.field1458[var3] = class77.method473(var17, class77.method473(var15 << 16, var16 << 8));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)[[I", line = 290)
    public final int[][] method638(int arg0, int arg1) {
        ++field1450;
        int[][] var3 = super.field7647.method3510((byte) -51, arg1);
        if (super.field7647.field8306) {
            int[] var4 = this.method3243(arg1, arg0 ^ 28178, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class418.field5518 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field1458[var9];
                var5[var8] = class249.method1625(4080, var10 >> 12);
                var6[var8] = class249.method1625(65280, var10) >> 4;
                var7[var8] = class249.method1625(4080, var10 << 4);
            }
        }
        if (arg0 != 2017) {
            this.field1454 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "()V", line = 341)
    public class107() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(II)V", line = 347)
    private final void method639(int arg0, int arg1) {
        ++field1453;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1454 = new int[4][4];
                                this.field1454[0][2] = 4096;
                                this.field1454[0][0] = 2048;
                                this.field1454[0][1] = 0;
                                this.field1454[0][3] = 0;
                                this.field1454[1][0] = 2867;
                                this.field1454[1][2] = 4096;
                                this.field1454[1][3] = 0;
                                this.field1454[1][1] = 4096;
                                this.field1454[2][3] = 0;
                                this.field1454[2][0] = 3276;
                                this.field1454[2][1] = 4096;
                                this.field1454[2][2] = 4096;
                                this.field1454[3][2] = 0;
                                this.field1454[3][3] = 0;
                                this.field1454[3][0] = 4096;
                                this.field1454[3][1] = 4096;
                            } else {
                                this.field1454 = new int[16][4];
                                this.field1454[0][1] = 80;
                                this.field1454[0][0] = 0;
                                this.field1454[0][2] = 192;
                                this.field1454[0][3] = 321;
                                this.field1454[1][0] = 155;
                                this.field1454[1][3] = 562;
                                this.field1454[1][1] = 321;
                                this.field1454[1][2] = 449;
                                this.field1454[2][3] = 803;
                                this.field1454[2][1] = 578;
                                this.field1454[2][0] = 389;
                                this.field1454[2][2] = 690;
                                this.field1454[3][3] = 1140;
                                this.field1454[3][1] = 947;
                                this.field1454[3][0] = 671;
                                this.field1454[3][2] = 995;
                                this.field1454[4][3] = 1509;
                                this.field1454[4][0] = 897;
                                this.field1454[4][1] = 1285;
                                this.field1454[4][2] = 1397;
                                this.field1454[5][2] = 1429;
                                this.field1454[5][3] = 1413;
                                this.field1454[5][1] = 1525;
                                this.field1454[5][0] = 1175;
                                this.field1454[6][3] = 1333;
                                this.field1454[6][2] = 1461;
                                this.field1454[6][1] = 1734;
                                this.field1454[6][0] = 1368;
                                this.field1454[7][1] = 1413;
                                this.field1454[7][0] = 1507;
                                this.field1454[7][3] = 1702;
                                this.field1454[7][2] = 1525;
                                this.field1454[8][3] = 2056;
                                this.field1454[8][0] = 1736;
                                this.field1454[8][1] = 1108;
                                this.field1454[8][2] = 1590;
                                this.field1454[9][3] = 2666;
                                this.field1454[9][0] = 2088;
                                this.field1454[9][1] = 1766;
                                this.field1454[9][2] = 2056;
                                this.field1454[10][1] = 2409;
                                this.field1454[10][3] = 3276;
                                this.field1454[10][2] = 2586;
                                this.field1454[10][0] = 2355;
                                this.field1454[11][0] = 2691;
                                this.field1454[11][3] = 3228;
                                this.field1454[11][2] = 3148;
                                this.field1454[11][1] = 3116;
                                this.field1454[12][0] = 3031;
                                this.field1454[12][2] = 3710;
                                this.field1454[12][1] = 3806;
                                this.field1454[12][3] = 3196;
                                this.field1454[13][1] = 3437;
                                this.field1454[13][2] = 3421;
                                this.field1454[13][3] = 3019;
                                this.field1454[13][0] = 3522;
                                this.field1454[14][2] = 3148;
                                this.field1454[14][3] = 3228;
                                this.field1454[14][0] = 3727;
                                this.field1454[14][1] = 3116;
                                this.field1454[15][3] = 2746;
                                this.field1454[15][2] = 2505;
                                this.field1454[15][0] = 4096;
                                this.field1454[15][1] = 2377;
                            }
                        } else {
                            this.field1454 = new int[6][4];
                            this.field1454[0][2] = 0;
                            this.field1454[0][0] = 0;
                            this.field1454[0][1] = 0;
                            this.field1454[0][3] = 0;
                            this.field1454[1][3] = 1493;
                            this.field1454[1][1] = 0;
                            this.field1454[1][2] = 0;
                            this.field1454[1][0] = 1843;
                            this.field1454[2][3] = 2939;
                            this.field1454[2][2] = 0;
                            this.field1454[2][1] = 0;
                            this.field1454[2][0] = 2457;
                            this.field1454[3][0] = 2781;
                            this.field1454[3][1] = 0;
                            this.field1454[3][3] = 3565;
                            this.field1454[3][2] = 1124;
                            this.field1454[4][2] = 3084;
                            this.field1454[4][1] = 546;
                            this.field1454[4][0] = 3481;
                            this.field1454[4][3] = 4031;
                            this.field1454[5][3] = 4096;
                            this.field1454[5][2] = 4096;
                            this.field1454[5][0] = 4096;
                            this.field1454[5][1] = 4096;
                        }
                    } else {
                        this.field1454 = new int[7][4];
                        this.field1454[0][1] = 0;
                        this.field1454[0][0] = 0;
                        this.field1454[0][2] = 0;
                        this.field1454[0][3] = 4096;
                        this.field1454[1][1] = 0;
                        this.field1454[1][2] = 4096;
                        this.field1454[1][0] = 663;
                        this.field1454[1][3] = 4096;
                        this.field1454[2][1] = 0;
                        this.field1454[2][2] = 4096;
                        this.field1454[2][3] = 0;
                        this.field1454[2][0] = 1363;
                        this.field1454[3][2] = 4096;
                        this.field1454[3][0] = 2048;
                        this.field1454[3][3] = 0;
                        this.field1454[3][1] = 4096;
                        this.field1454[4][2] = 0;
                        this.field1454[4][0] = 2727;
                        this.field1454[4][3] = 0;
                        this.field1454[4][1] = 4096;
                        this.field1454[5][1] = 4096;
                        this.field1454[5][0] = 3411;
                        this.field1454[5][3] = 4096;
                        this.field1454[5][2] = 0;
                        this.field1454[6][1] = 0;
                        this.field1454[6][2] = 0;
                        this.field1454[6][3] = 4096;
                        this.field1454[6][0] = 4096;
                    }
                } else {
                    this.field1454 = new int[8][4];
                    this.field1454[0][2] = 2602;
                    this.field1454[0][0] = 0;
                    this.field1454[0][3] = 2361;
                    this.field1454[0][1] = 2650;
                    this.field1454[1][0] = 2867;
                    this.field1454[1][3] = 1558;
                    this.field1454[1][1] = 2313;
                    this.field1454[1][2] = 1799;
                    this.field1454[2][0] = 3072;
                    this.field1454[2][1] = 2618;
                    this.field1454[2][3] = 1413;
                    this.field1454[2][2] = 1734;
                    this.field1454[3][3] = 947;
                    this.field1454[3][1] = 2296;
                    this.field1454[3][0] = 3276;
                    this.field1454[3][2] = 1220;
                    this.field1454[4][2] = 963;
                    this.field1454[4][3] = 722;
                    this.field1454[4][1] = 2072;
                    this.field1454[4][0] = 3481;
                    this.field1454[5][0] = 3686;
                    this.field1454[5][1] = 2730;
                    this.field1454[5][2] = 2152;
                    this.field1454[5][3] = 1766;
                    this.field1454[6][3] = 915;
                    this.field1454[6][0] = 3891;
                    this.field1454[6][2] = 1060;
                    this.field1454[6][1] = 2232;
                    this.field1454[7][2] = 1413;
                    this.field1454[7][0] = 4096;
                    this.field1454[7][3] = 1140;
                    this.field1454[7][1] = 1686;
                }
            } else {
                this.field1454 = new int[2][4];
                this.field1454[0][3] = 0;
                this.field1454[0][1] = 0;
                this.field1454[0][2] = 0;
                this.field1454[0][0] = 0;
                this.field1454[1][1] = 4096;
                this.field1454[1][2] = 4096;
                this.field1454[1][3] = 4096;
                this.field1454[1][0] = 4096;
            }
        }
        if (arg0 != 3) {
            this.method638(23, 4);
        }
    }
}
