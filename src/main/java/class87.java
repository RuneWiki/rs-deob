import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class87 extends class335 {

    @OriginalMember(owner = "client!bp", name = "O", descriptor = "[I")
    private int[] field1069 = new int[257];

    @OriginalMember(owner = "client!bp", name = "I", descriptor = "J")
    public static long field1064 = 0L;

    @OriginalMember(owner = "client!bp", name = "C", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!bp", name = "D", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!bp", name = "G", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!bp", name = "H", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!bp", name = "K", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!bp", name = "L", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!bp", name = "M", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!bp", name = "N", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!bp", name = "P", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!bp", name = "B", descriptor = "Loa;")
    public static class224 field1058;

    @OriginalMember(owner = "client!bp", name = "E", descriptor = "[[I")
    private int[][] field1061;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZ)[[I", line = 6)
    public final int[][] method1(int arg0, boolean arg1) {
        ++field1066;
        int[][] var3 = super.field4527.method669(arg0, (byte) 2);
        if (super.field4527.field1468) {
            int[] var4 = this.method1969(0, arg0, -127);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; class649.field8968 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1069[var9];
                var5[var8] = class15.method97(16711680, var10) >> 12;
                var6[var8] = class15.method97(4080, var10 >> 4);
                var7[var8] = class15.method97(255, var10) << 4;
            }
        }
        if (arg1) {
            this.field1061 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V", line = 59)
    public class87() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(CLjava/lang/String;Z)[Ljava/lang/String;", line = 62)
    public static final String[] method475(char arg0, String arg1, boolean arg2) {
        ++field1065;
        int var3 = class151.method889(arg0, (byte) 93, arg1);
        String[] var4 = new String[var3 + 1];
        if (arg2) {
            field1059 = -61;
        }
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; ~var7 > ~var3; ++var7) {
            int var8;
            for (var8 = var6; ~arg0 != ~arg1.charAt(var8); ++var8) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "(I)V", line = 99)
    private final void method476(int arg0) {
        ++field1067;
        int var2 = this.field1061.length;
        if (var2 > 0) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && this.field1061[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var2 >= ~var4) {
                    int[] var7 = this.field1061[var2 + -1];
                    var8 = var7[3];
                    var9 = var7[2];
                    var10 = var7[1];
                } else {
                    int[] var11 = this.field1061[var4];
                    if (var4 > 0) {
                        int[] var12 = this.field1061[var4 + -1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var8 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                    } else {
                        var8 = var11[3];
                        var10 = var11[1];
                        var9 = var11[2];
                    }
                }
                int var15 = var9 >> 4;
                int var16 = var10 >> 4;
                int var17 = var8 >> 4;
                if (~var16 > -1) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                if (~var15 <= -1) {
                    if (~var15 < -256) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                if (~var17 <= -1) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field1069[var3] = class665.method3789(var17, class665.method3789(var15 << 8, var16 << 16));
            }
        }
        if (arg0 != 192) {
            this.method2(29, (class157) null, -40);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V", line = 203)
    public final void method317(byte arg0) {
        if (this.field1061 == null) {
            this.method477(1, 2);
        }
        ++field1060;
        this.method476(192);
        int var2 = -100 / ((arg0 - 58) / 60);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILio;I)V", line = 223)
    public final void method2(int arg0, class157 arg1, int arg2) {
        if (arg2 != -66) {
            field1064 = 11L;
        }
        ++field1068;
        if (~arg0 == -1) {
            int var4 = arg1.method930(255);
            if (~var4 != -1) {
                this.method477(var4, 2);
            } else {
                this.field1061 = new int[arg1.method930(255)][4];
                for (int var5 = 0; this.field1061.length > var5; ++var5) {
                    this.field1061[var5][0] = arg1.method963(-126);
                    this.field1061[var5][1] = arg1.method930(class50.method268(arg2, -191)) << 4;
                    this.field1061[var5][2] = arg1.method930(arg2 + 321) << 4;
                    this.field1061[var5][3] = arg1.method930(255) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V", line = 266)
    private final void method477(int arg0, int arg1) {
        ++field1062;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1061 = new int[4][4];
                                this.field1061[0][0] = 2048;
                                this.field1061[0][1] = 0;
                                this.field1061[0][2] = 4096;
                                this.field1061[0][3] = 0;
                                this.field1061[1][0] = 2867;
                                this.field1061[1][2] = 4096;
                                this.field1061[1][3] = 0;
                                this.field1061[1][1] = 4096;
                                this.field1061[2][2] = 4096;
                                this.field1061[2][0] = 3276;
                                this.field1061[2][1] = 4096;
                                this.field1061[2][3] = 0;
                                this.field1061[3][1] = 4096;
                                this.field1061[3][3] = 0;
                                this.field1061[3][2] = 0;
                                this.field1061[3][0] = 4096;
                            } else {
                                this.field1061 = new int[16][4];
                                this.field1061[0][1] = 80;
                                this.field1061[0][2] = 192;
                                this.field1061[0][3] = 321;
                                this.field1061[0][0] = 0;
                                this.field1061[1][1] = 321;
                                this.field1061[1][3] = 562;
                                this.field1061[1][2] = 449;
                                this.field1061[1][0] = 155;
                                this.field1061[2][2] = 690;
                                this.field1061[2][1] = 578;
                                this.field1061[2][3] = 803;
                                this.field1061[2][0] = 389;
                                this.field1061[3][2] = 995;
                                this.field1061[3][3] = 1140;
                                this.field1061[3][1] = 947;
                                this.field1061[3][0] = 671;
                                this.field1061[4][2] = 1397;
                                this.field1061[4][3] = 1509;
                                this.field1061[4][0] = 897;
                                this.field1061[4][1] = 1285;
                                this.field1061[5][1] = 1525;
                                this.field1061[5][2] = 1429;
                                this.field1061[5][3] = 1413;
                                this.field1061[5][0] = 1175;
                                this.field1061[6][2] = 1461;
                                this.field1061[6][0] = 1368;
                                this.field1061[6][3] = 1333;
                                this.field1061[6][1] = 1734;
                                this.field1061[7][2] = 1525;
                                this.field1061[7][0] = 1507;
                                this.field1061[7][3] = 1702;
                                this.field1061[7][1] = 1413;
                                this.field1061[8][0] = 1736;
                                this.field1061[8][3] = 2056;
                                this.field1061[8][1] = 1108;
                                this.field1061[8][2] = 1590;
                                this.field1061[9][2] = 2056;
                                this.field1061[9][1] = 1766;
                                this.field1061[9][0] = 2088;
                                this.field1061[9][3] = 2666;
                                this.field1061[10][1] = 2409;
                                this.field1061[10][0] = 2355;
                                this.field1061[10][2] = 2586;
                                this.field1061[10][3] = 3276;
                                this.field1061[11][3] = 3228;
                                this.field1061[11][0] = 2691;
                                this.field1061[11][1] = 3116;
                                this.field1061[11][2] = 3148;
                                this.field1061[12][0] = 3031;
                                this.field1061[12][3] = 3196;
                                this.field1061[12][2] = 3710;
                                this.field1061[12][1] = 3806;
                                this.field1061[13][2] = 3421;
                                this.field1061[13][3] = 3019;
                                this.field1061[13][0] = 3522;
                                this.field1061[13][1] = 3437;
                                this.field1061[14][0] = 3727;
                                this.field1061[14][3] = 3228;
                                this.field1061[14][2] = 3148;
                                this.field1061[14][1] = 3116;
                                this.field1061[15][0] = 4096;
                                this.field1061[15][1] = 2377;
                                this.field1061[15][3] = 2746;
                                this.field1061[15][2] = 2505;
                            }
                        } else {
                            this.field1061 = new int[6][4];
                            this.field1061[0][1] = 0;
                            this.field1061[0][2] = 0;
                            this.field1061[0][3] = 0;
                            this.field1061[0][0] = 0;
                            this.field1061[1][3] = 1493;
                            this.field1061[1][2] = 0;
                            this.field1061[1][0] = 1843;
                            this.field1061[1][1] = 0;
                            this.field1061[2][2] = 0;
                            this.field1061[2][3] = 2939;
                            this.field1061[2][1] = 0;
                            this.field1061[2][0] = 2457;
                            this.field1061[3][0] = 2781;
                            this.field1061[3][1] = 0;
                            this.field1061[3][3] = 3565;
                            this.field1061[3][2] = 1124;
                            this.field1061[4][3] = 4031;
                            this.field1061[4][0] = 3481;
                            this.field1061[4][2] = 3084;
                            this.field1061[4][1] = 546;
                            this.field1061[5][2] = 4096;
                            this.field1061[5][1] = 4096;
                            this.field1061[5][0] = 4096;
                            this.field1061[5][3] = 4096;
                        }
                    } else {
                        this.field1061 = new int[7][4];
                        this.field1061[0][2] = 0;
                        this.field1061[0][0] = 0;
                        this.field1061[0][1] = 0;
                        this.field1061[0][3] = 4096;
                        this.field1061[1][3] = 4096;
                        this.field1061[1][0] = 663;
                        this.field1061[1][1] = 0;
                        this.field1061[1][2] = 4096;
                        this.field1061[2][1] = 0;
                        this.field1061[2][2] = 4096;
                        this.field1061[2][3] = 0;
                        this.field1061[2][0] = 1363;
                        this.field1061[3][3] = 0;
                        this.field1061[3][1] = 4096;
                        this.field1061[3][0] = 2048;
                        this.field1061[3][2] = 4096;
                        this.field1061[4][3] = 0;
                        this.field1061[4][1] = 4096;
                        this.field1061[4][2] = 0;
                        this.field1061[4][0] = 2727;
                        this.field1061[5][2] = 0;
                        this.field1061[5][1] = 4096;
                        this.field1061[5][0] = 3411;
                        this.field1061[5][3] = 4096;
                        this.field1061[6][2] = 0;
                        this.field1061[6][3] = 4096;
                        this.field1061[6][1] = 0;
                        this.field1061[6][0] = 4096;
                    }
                } else {
                    this.field1061 = new int[8][4];
                    this.field1061[0][3] = 2361;
                    this.field1061[0][1] = 2650;
                    this.field1061[0][0] = 0;
                    this.field1061[0][2] = 2602;
                    this.field1061[1][1] = 2313;
                    this.field1061[1][3] = 1558;
                    this.field1061[1][2] = 1799;
                    this.field1061[1][0] = 2867;
                    this.field1061[2][2] = 1734;
                    this.field1061[2][0] = 3072;
                    this.field1061[2][3] = 1413;
                    this.field1061[2][1] = 2618;
                    this.field1061[3][3] = 947;
                    this.field1061[3][2] = 1220;
                    this.field1061[3][0] = 3276;
                    this.field1061[3][1] = 2296;
                    this.field1061[4][2] = 963;
                    this.field1061[4][1] = 2072;
                    this.field1061[4][0] = 3481;
                    this.field1061[4][3] = 722;
                    this.field1061[5][1] = 2730;
                    this.field1061[5][3] = 1766;
                    this.field1061[5][0] = 3686;
                    this.field1061[5][2] = 2152;
                    this.field1061[6][2] = 1060;
                    this.field1061[6][3] = 915;
                    this.field1061[6][1] = 2232;
                    this.field1061[6][0] = 3891;
                    this.field1061[7][0] = 4096;
                    this.field1061[7][2] = 1413;
                    this.field1061[7][1] = 1686;
                    this.field1061[7][3] = 1140;
                }
            } else {
                this.field1061 = new int[2][4];
                this.field1061[0][1] = 0;
                this.field1061[0][2] = 0;
                this.field1061[0][0] = 0;
                this.field1061[0][3] = 0;
                this.field1061[1][1] = 4096;
                this.field1061[1][2] = 4096;
                this.field1061[1][3] = 4096;
                this.field1061[1][0] = 4096;
            }
        }
        if (arg1 != 2) {
            this.method476(-87);
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(Z)V", line = 523)
    public static void method478(boolean arg0) {
        if (!arg0) {
            field1058 = null;
        }
        field1058 = null;
    }

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "(III)I", line = 534)
    public static final int method479(int arg0, int arg1, int arg2) {
        ++field1063;
        if (class240.field3172 == -1) {
            return 1;
        } else {
            if (class618.field8566 != arg0) {
                class470.method2708(arg0, (byte) 5, class371.field4892.method2141(class422.field5539, true));
                if (class618.field8566 != arg0) {
                    return -1;
                }
            }
            try {
                Dimension var3 = class583.field7996.getSize();
                class591.method3268(class325.field4382, class146.field1963, true, class371.field4892.method2141(class422.field5539, true), class401.field5319, false);
                class250 var4 = class258.method1563(arg1, class94.field1139, class240.field3172, 65535);
                long var5 = class529.method2982((byte) -69);
                class146.field1963.method1044();
                class546.field7466.method359(0, class332.field4443, 0);
                class146.field1963.method1123(class546.field7466);
                class146.field1963.method1088(var3.width / 2, var3.height / 2, 512, 512);
                class146.field1963.method1041(1.0F);
                class146.field1963.method1060(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
                class470 var7 = class146.field1963.method1089(var4, 2048, 64, 64, 768);
                int var8 = 0;
                label41: for (int var9 = 0; ~var9 > -501; ++var9) {
                    class146.field1963.method1146(0);
                    class146.field1963.method1147();
                    for (int var10 = 15; var10 >= 0; --var10) {
                        for (int var11 = 0; ~var10 <= ~var11; ++var11) {
                            class38.field510.method359((int) (((float) var11 - (float) var10 / 2.0F) * (float) class458.field6012), 0, (var10 + 1) * class458.field6012);
                            ++var8;
                            var7.method625(class38.field510, (class667) null, 0);
                            if ((long) arg2 <= -var5 + class529.method2982((byte) -69)) {
                                break label41;
                            }
                        }
                    }
                }
                class146.field1963.method1092();
                long var12 = (long) (var8 * 1000) / (class529.method2982((byte) -69) + -var5);
                class146.field1963.method1146(0);
                class146.field1963.method1147();
                return (int) var12;
            } catch (Throwable var15) {
                var15.printStackTrace();
                return -1;
            }
        }
    }
}
