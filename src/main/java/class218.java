import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class218 extends class215 {

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "[I")
    private int[] field3486 = new int[257];

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "Ljava/lang/String;")
    public static String field3490 = " is already on your friend list.";

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
    public static int field3493 = 255;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "Leh;")
    public static class137 field3487;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "[[I")
    private int[][] field3491;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(III)V")
    public static final void method1541(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class34.field444; ++var3) {
            for (int var4 = 0; var4 < class88.field1076; ++var4) {
                for (int var5 = 0; var5 < class59.field752; ++var5) {
                    class246 var6 = class46.field585[var3][var4][var5];
                    if (var6 != null) {
                        class187 var7 = var6.field4046;
                        if (var7 != null && var7.field2983.method1440()) {
                            class30.method169(var7.field2983, var3, var4, var5, 1, 1);
                            if (var7.field2990 != null && var7.field2990.method1440()) {
                                class30.method169(var7.field2990, var3, var4, var5, 1, 1);
                                var7.field2983.method1423(var7.field2990, 0, 0, 0, false);
                                var7.field2990 = var7.field2990.method1436(arg0, arg1, arg2);
                            }
                            var7.field2983 = var7.field2983.method1436(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field4044; ++var8) {
                            class19 var10 = var6.field4038[var8];
                            if (var10 != null && var10.field234.method1440()) {
                                class30.method169(var10.field234, var3, var4, var5, var10.field239 - var10.field240 + 1, var10.field233 - var10.field235 + 1);
                                var10.field234 = var10.field234.method1436(arg0, arg1, arg2);
                            }
                        }
                        class11 var9 = var6.field4056;
                        if (var9 != null && var9.field127.method1440()) {
                            class30.method171(var9.field127, var3, var4, var5);
                            var9.field127 = var9.field127.method1436(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)V")
    public static final void method1542(boolean arg0, int arg1) {
        ++field3498;
        if (arg1 != -1) {
            if (class210.method1477((byte) 70, arg1)) {
                if (arg0) {
                    method1546(-4, 122);
                }
                class123[] var2 = class75.field937[arg1];
                for (int var3 = 0; var2.length > var3; ++var3) {
                    class123 var4 = var2[var3];
                    if (var4.field1913 != null) {
                        class156 var5 = new class156();
                        var5.field2512 = var4.field1913;
                        var5.field2516 = var4;
                        class70.method393(var5, 2000000, 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V")
    public final void method331(byte arg0) {
        if (arg0 != -49) {
            this.field3486 = null;
        }
        if (this.field3491 == null) {
            this.method1545(1, 72);
        }
        ++field3494;
        this.method1547(-114);
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)Z")
    public static final boolean method1543(int arg0) {
        ++field3492;
        try {
            if (~class190.field3070 == -3) {
                if (class285.field4545 == null) {
                    class285.field4545 = class267.method1797(class160.field2558, class278.field4410, class4.field55);
                    if (class285.field4545 == null) {
                        return false;
                    }
                }
                if (class187.field2978 == null) {
                    class187.field2978 = new class93(class153.field2376, class23.field309);
                }
                if (class67.field848.method1090(class191.field3079, 22050, class187.field2978, class285.field4545, (byte) 121)) {
                    class67.field848.method1067(arg0 + 99);
                    class67.field848.method1068((byte) -76, class215.field3446);
                    class67.field848.method1075(class285.field4545, arg0 + 6127, class216.field3473);
                    class187.field2978 = null;
                    class190.field3070 = 0;
                    class285.field4545 = null;
                    class160.field2558 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class67.field848.method1062(16);
            class160.field2558 = null;
            class187.field2978 = null;
            class285.field4545 = null;
            class190.field3070 = 0;
        }
        return arg0 != 1;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)[[I")
    public final int[][] method46(int arg0, int arg1) {
        if (arg0 != -1) {
            field3490 = null;
        }
        ++field3496;
        int[][] var3 = super.field3461.method1126(arg0 ^ -2, arg1);
        if (super.field3461.field2591) {
            int[] var4 = this.method1503(-1, 0, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; ~var8 > ~class244.field4015; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field3486[var9];
                var5[var8] = class173.method1186(var10 >> 12, 4080);
                var7[var8] = class173.method1186(65280, var10) >> 4;
                var6[var8] = class173.method1186(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)V")
    public static final void method1544(byte arg0) {
        ++field3489;
        class274.field4382.method1699(0);
        if (arg0 > 93) {
            class137.field2174.method1699(0);
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(II)V")
    private final void method1545(int arg0, int arg1) {
        ++field3499;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field3491 = new int[4][4];
                                this.field3491[0][0] = 2048;
                                this.field3491[0][1] = 0;
                                this.field3491[1][0] = 2867;
                                this.field3491[1][1] = 4096;
                                this.field3491[0][3] = 0;
                                this.field3491[2][1] = 4096;
                                this.field3491[1][3] = 0;
                                this.field3491[3][1] = 4096;
                                this.field3491[0][2] = 4096;
                                this.field3491[2][3] = 0;
                                this.field3491[1][2] = 4096;
                                this.field3491[2][2] = 4096;
                                this.field3491[3][3] = 0;
                                this.field3491[2][0] = 3276;
                                this.field3491[3][2] = 0;
                                this.field3491[3][0] = 4096;
                            } else {
                                this.field3491 = new int[16][4];
                                this.field3491[0][1] = 80;
                                this.field3491[1][1] = 321;
                                this.field3491[0][2] = 192;
                                this.field3491[1][2] = 449;
                                this.field3491[0][3] = 321;
                                this.field3491[1][3] = 562;
                                this.field3491[0][0] = 0;
                                this.field3491[1][0] = 155;
                                this.field3491[2][1] = 578;
                                this.field3491[3][1] = 947;
                                this.field3491[2][2] = 690;
                                this.field3491[2][3] = 803;
                                this.field3491[4][1] = 1285;
                                this.field3491[3][2] = 995;
                                this.field3491[4][2] = 1397;
                                this.field3491[3][3] = 1140;
                                this.field3491[5][1] = 1525;
                                this.field3491[4][3] = 1509;
                                this.field3491[2][0] = 389;
                                this.field3491[5][3] = 1413;
                                this.field3491[5][2] = 1429;
                                this.field3491[3][0] = 671;
                                this.field3491[6][2] = 1461;
                                this.field3491[6][3] = 1333;
                                this.field3491[7][2] = 1525;
                                this.field3491[8][2] = 1590;
                                this.field3491[6][1] = 1734;
                                this.field3491[4][0] = 897;
                                this.field3491[7][1] = 1413;
                                this.field3491[5][0] = 1175;
                                this.field3491[9][2] = 2056;
                                this.field3491[7][3] = 1702;
                                this.field3491[8][3] = 2056;
                                this.field3491[10][2] = 2586;
                                this.field3491[6][0] = 1368;
                                this.field3491[11][2] = 3148;
                                this.field3491[9][3] = 2666;
                                this.field3491[7][0] = 1507;
                                this.field3491[8][0] = 1736;
                                this.field3491[8][1] = 1108;
                                this.field3491[10][3] = 3276;
                                this.field3491[12][2] = 3710;
                                this.field3491[13][2] = 3421;
                                this.field3491[9][0] = 2088;
                                this.field3491[14][2] = 3148;
                                this.field3491[10][0] = 2355;
                                this.field3491[11][0] = 2691;
                                this.field3491[12][0] = 3031;
                                this.field3491[13][0] = 3522;
                                this.field3491[11][3] = 3228;
                                this.field3491[9][1] = 1766;
                                this.field3491[12][3] = 3196;
                                this.field3491[15][2] = 2505;
                                this.field3491[10][1] = 2409;
                                this.field3491[11][1] = 3116;
                                this.field3491[12][1] = 3806;
                                this.field3491[14][0] = 3727;
                                this.field3491[13][1] = 3437;
                                this.field3491[15][0] = 4096;
                                this.field3491[13][3] = 3019;
                                this.field3491[14][3] = 3228;
                                this.field3491[14][1] = 3116;
                                this.field3491[15][1] = 2377;
                                this.field3491[15][3] = 2746;
                            }
                        } else {
                            this.field3491 = new int[6][4];
                            this.field3491[0][1] = 0;
                            this.field3491[0][0] = 0;
                            this.field3491[0][2] = 0;
                            this.field3491[0][3] = 0;
                            this.field3491[1][0] = 1843;
                            this.field3491[1][3] = 1493;
                            this.field3491[2][3] = 2939;
                            this.field3491[1][1] = 0;
                            this.field3491[2][1] = 0;
                            this.field3491[3][1] = 0;
                            this.field3491[4][1] = 546;
                            this.field3491[5][1] = 4096;
                            this.field3491[2][0] = 2457;
                            this.field3491[1][2] = 0;
                            this.field3491[3][3] = 3565;
                            this.field3491[3][0] = 2781;
                            this.field3491[4][0] = 3481;
                            this.field3491[5][0] = 4096;
                            this.field3491[2][2] = 0;
                            this.field3491[4][3] = 4031;
                            this.field3491[3][2] = 1124;
                            this.field3491[5][3] = 4096;
                            this.field3491[4][2] = 3084;
                            this.field3491[5][2] = 4096;
                        }
                    } else {
                        this.field3491 = new int[7][4];
                        this.field3491[0][0] = 0;
                        this.field3491[0][1] = 0;
                        this.field3491[0][2] = 0;
                        this.field3491[1][1] = 0;
                        this.field3491[1][0] = 663;
                        this.field3491[2][1] = 0;
                        this.field3491[2][0] = 1363;
                        this.field3491[0][3] = 4096;
                        this.field3491[3][0] = 2048;
                        this.field3491[1][2] = 4096;
                        this.field3491[1][3] = 4096;
                        this.field3491[3][1] = 4096;
                        this.field3491[2][2] = 4096;
                        this.field3491[4][0] = 2727;
                        this.field3491[5][0] = 3411;
                        this.field3491[2][3] = 0;
                        this.field3491[6][0] = 4096;
                        this.field3491[3][2] = 4096;
                        this.field3491[3][3] = 0;
                        this.field3491[4][2] = 0;
                        this.field3491[4][1] = 4096;
                        this.field3491[5][1] = 4096;
                        this.field3491[6][1] = 0;
                        this.field3491[5][2] = 0;
                        this.field3491[6][2] = 0;
                        this.field3491[4][3] = 0;
                        this.field3491[5][3] = 4096;
                        this.field3491[6][3] = 4096;
                    }
                } else {
                    this.field3491 = new int[8][4];
                    this.field3491[0][1] = 2650;
                    this.field3491[0][3] = 2361;
                    this.field3491[0][0] = 0;
                    this.field3491[0][2] = 2602;
                    this.field3491[1][0] = 2867;
                    this.field3491[1][3] = 1558;
                    this.field3491[2][3] = 1413;
                    this.field3491[3][3] = 947;
                    this.field3491[2][0] = 3072;
                    this.field3491[3][0] = 3276;
                    this.field3491[1][1] = 2313;
                    this.field3491[2][1] = 2618;
                    this.field3491[3][1] = 2296;
                    this.field3491[4][3] = 722;
                    this.field3491[4][1] = 2072;
                    this.field3491[4][0] = 3481;
                    this.field3491[5][3] = 1766;
                    this.field3491[5][0] = 3686;
                    this.field3491[6][3] = 915;
                    this.field3491[6][0] = 3891;
                    this.field3491[7][0] = 4096;
                    this.field3491[5][1] = 2730;
                    this.field3491[1][2] = 1799;
                    this.field3491[6][1] = 2232;
                    this.field3491[2][2] = 1734;
                    this.field3491[7][1] = 1686;
                    this.field3491[7][3] = 1140;
                    this.field3491[3][2] = 1220;
                    this.field3491[4][2] = 963;
                    this.field3491[5][2] = 2152;
                    this.field3491[6][2] = 1060;
                    this.field3491[7][2] = 1413;
                }
            } else {
                this.field3491 = new int[2][4];
                this.field3491[0][1] = 0;
                this.field3491[0][0] = 0;
                this.field3491[0][3] = 0;
                this.field3491[1][1] = 4096;
                this.field3491[1][0] = 4096;
                this.field3491[1][3] = 4096;
                this.field3491[0][2] = 0;
                this.field3491[1][2] = 4096;
            }
        }
        int var4 = 49 / ((arg1 - -23) / 48);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        if (arg0 != 1521146348) {
            method1543(-29);
        }
        ++field3497;
        if (~arg1 == -1) {
            int var4 = arg2.method584(arg0 ^ 1521146131);
            if (var4 != 0) {
                this.method1545(var4, 81);
            } else {
                this.field3491 = new int[arg2.method584(arg0 + -1521146093)][4];
                for (int var5 = 0; ~this.field3491.length < ~var5; ++var5) {
                    this.field3491[var5][0] = arg2.method549(255);
                    this.field3491[var5][1] = arg2.method584(255) << 4;
                    this.field3491[var5][2] = arg2.method584(255) << 4;
                    this.field3491[var5][3] = arg2.method584(255) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(II)V")
    public static final void method1546(int arg0, int arg1) {
        ++field3488;
        class81.field1004.method1695(arg1, 0);
        if (arg0 == 7) {
            class21.field266.method1695(arg1, 0);
            class235.field3886.method1695(arg1, 0);
            class221.field3560.method1695(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class218() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "(I)V")
    private final void method1547(int arg0) {
        ++field3495;
        int var2 = this.field3491.length;
        if (arg0 > -12) {
            field3493 = 37;
        }
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && ~this.field3491[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var4 >= var2) {
                    int[] var7 = this.field3491[var2 + -1];
                    var8 = var7[3];
                    var9 = var7[1];
                    var10 = var7[2];
                } else {
                    int[] var11 = this.field3491[var4];
                    if (~var4 < -1) {
                        int[] var12 = this.field3491[var4 + -1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = 4096 - var13;
                        var9 = var11[1] * var13 - -(var12[1] * var14) >> 12;
                        var8 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var10 = var11[2] * var13 - -(var12[2] * var14) >> 12;
                    } else {
                        var9 = var11[1];
                        var8 = var11[3];
                        var10 = var11[2];
                    }
                }
                int var15 = var10 >> 4;
                int var16 = var9 >> 4;
                int var17 = var8 >> 4;
                if (~var15 > -1) {
                    var15 = 0;
                } else if (~var15 < -256) {
                    var15 = 255;
                }
                if (var16 < 0) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                if (~var17 > -1) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                this.field3486[var3] = class154.method1048(var17, class154.method1048(var15 << 8, var16 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public static void method1548(boolean arg0) {
        if (!arg0) {
            field3487 = null;
        }
        field3487 = null;
        field3490 = null;
    }
}
