import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class158 extends class93 {

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    public static int field3137 = 0;

    @OriginalMember(owner = "client!qf", name = "bb", descriptor = "Ljd;")
    public static class92 field3144 = class202.method1325((byte) 90, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "Loe;")
    public static class139 field3136 = new class139(5);

    @OriginalMember(owner = "client!qf", name = "gb", descriptor = "[B")
    public static byte[] field3149 = new byte[520];

    @OriginalMember(owner = "client!qf", name = "hb", descriptor = "I")
    public static int field3150 = 0;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!qf", name = "Z", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!qf", name = "cb", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!qf", name = "eb", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!qf", name = "fb", descriptor = "La;")
    public static class1 field3148;

    @OriginalMember(owner = "client!qf", name = "ab", descriptor = "[[I")
    private int[][] field3143;

    @OriginalMember(owner = "client!qf", name = "db", descriptor = "[[[I")
    public static int[][][] field3146;

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class158() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)V")
    public final void method87(byte arg0) {
        if (arg0 == -85) {
            if (this.field3143 == null) {
                this.method1024(1, arg0 ^ 40);
            }
            ++field3140;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lnb;")
    public static final class127 method1019(Throwable arg0, String arg1) {
        ++field3139;
        class127 var2;
        if (arg0 instanceof class127) {
            var2 = (class127) arg0;
            var2.field2567 = var2.field2567 + ' ' + arg1;
        } else {
            var2 = new class127(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIB)I")
    public static final int method1020(int arg0, int arg1, int arg2, byte arg3) {
        ++field3141;
        int var4 = arg1 & 3;
        if (var4 == 0) {
            return arg2;
        } else {
            int var5 = 127 / ((69 - arg3) / 44);
            if (var4 == 1) {
                return arg0;
            } else {
                return ~var4 == -3 ? 7 - arg2 : 7 - arg0;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "(B)V")
    public static final void method1021(byte arg0) {
        ++field3138;
        if (arg0 != -60) {
            field3144 = null;
        }
        for (class42 var1 = (class42) class115.field2323.method103(57); var1 != null; var1 = (class42) class115.field2323.method100(-49)) {
            if (~class81.field1639 == ~var1.field928 && !var1.field924) {
                if (field3150 >= var1.field940) {
                    var1.method263(class76.field1588, 1);
                    if (var1.field924) {
                        var1.method1370(127);
                    } else {
                        class113.method762(var1.field928, var1.field933, var1.field941, var1.field919, 60, var1, 0, -1L, false);
                    }
                }
            } else {
                var1.method1370(-65);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        if (arg1 != 4096) {
            return null;
        } else {
            ++field3145;
            int[][] var3 = super.field1873.method553(arg0, 0);
            if (super.field1873.field1656) {
                int var4 = this.field3143.length;
                int[] var5 = this.method648((byte) 102, arg0, 0);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                if (~var4 >= -1) {
                    for (int var9 = 0; ~var9 > ~class150.field2985; ++var9) {
                        var6[var9] = 0;
                        var7[var9] = 0;
                        var8[var9] = 0;
                    }
                } else {
                    for (int var10 = 0; var10 < class150.field2985; ++var10) {
                        int var11 = var5[var10];
                        int var12 = 0;
                        for (int var13 = 0; ~var4 < ~var13 && ~this.field3143[var13][0] >= ~var11; ++var13) {
                            ++var12;
                        }
                        if (~var12 <= ~var4) {
                            int[] var14 = this.field3143[var4 - 1];
                            var6[var10] = var14[1];
                            var7[var10] = var14[2];
                            var8[var10] = var14[3];
                        } else {
                            int[] var15 = this.field3143[var12];
                            if (~var12 < -1) {
                                int[] var16 = this.field3143[var12 + -1];
                                int var17 = (-var16[0] + var11 << 12) / (var15[0] + -var16[0]);
                                int var18 = -var17 + 4096;
                                var6[var10] = var15[1] * var17 + var16[1] * var18 >> 12;
                                var7[var10] = var15[2] * var17 - -(var16[2] * var18) >> 12;
                                var8[var10] = var15[3] * var17 + var16[3] * var18 >> 12;
                            } else {
                                var6[var10] = var15[1];
                                var7[var10] = var15[2];
                                var8[var10] = var15[3];
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (arg0 == arg2) {
            int var4 = arg1.method443(255);
            if (~var4 != -1) {
                this.method1024(var4, -118);
            } else {
                this.field3143 = new int[arg1.method443(255)][4];
                for (int var5 = 0; ~this.field3143.length < ~var5; ++var5) {
                    this.field3143[var5][0] = arg1.method442(-21351);
                    this.field3143[var5][1] = arg1.method443(255) << 4;
                    this.field3143[var5][2] = arg1.method443(255) << 4;
                    this.field3143[var5][3] = arg1.method443(arg2 + 255) << 4;
                }
            }
        }
        ++field3142;
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
    public static void method1022(int arg0) {
        field3144 = null;
        field3136 = null;
        field3146 = null;
        if (arg0 <= -115) {
            field3148 = null;
            field3149 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)I")
    public static final int method1023(int arg0, int arg1) {
        if (arg0 != 2) {
            field3148 = null;
        }
        ++field3135;
        return arg1 & 127;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(II)V")
    private final void method1024(int arg0, int arg1) {
        ++field3147;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field3143 = new int[4][4];
                                this.field3143[0][1] = 0;
                                this.field3143[0][2] = 4096;
                                this.field3143[1][1] = 4096;
                                this.field3143[0][3] = 0;
                                this.field3143[2][1] = 4096;
                                this.field3143[1][3] = 0;
                                this.field3143[1][2] = 4096;
                                this.field3143[2][2] = 4096;
                                this.field3143[3][2] = 0;
                                this.field3143[0][0] = 2048;
                                this.field3143[2][3] = 0;
                                this.field3143[3][3] = 0;
                                this.field3143[3][1] = 4096;
                                this.field3143[1][0] = 2867;
                                this.field3143[2][0] = 3276;
                                this.field3143[3][0] = 4096;
                            } else {
                                this.field3143 = new int[16][4];
                                this.field3143[0][0] = 0;
                                this.field3143[0][3] = 321;
                                this.field3143[0][2] = 192;
                                this.field3143[1][2] = 449;
                                this.field3143[1][3] = 562;
                                this.field3143[2][3] = 803;
                                this.field3143[0][1] = 80;
                                this.field3143[3][3] = 1140;
                                this.field3143[4][3] = 1509;
                                this.field3143[2][2] = 690;
                                this.field3143[1][1] = 321;
                                this.field3143[3][2] = 995;
                                this.field3143[4][2] = 1397;
                                this.field3143[5][3] = 1413;
                                this.field3143[5][2] = 1429;
                                this.field3143[1][0] = 155;
                                this.field3143[2][0] = 389;
                                this.field3143[3][0] = 671;
                                this.field3143[2][1] = 578;
                                this.field3143[4][0] = 897;
                                this.field3143[5][0] = 1175;
                                this.field3143[3][1] = 947;
                                this.field3143[6][3] = 1333;
                                this.field3143[6][0] = 1368;
                                this.field3143[4][1] = 1285;
                                this.field3143[7][0] = 1507;
                                this.field3143[8][0] = 1736;
                                this.field3143[5][1] = 1525;
                                this.field3143[6][1] = 1734;
                                this.field3143[7][3] = 1702;
                                this.field3143[6][2] = 1461;
                                this.field3143[8][3] = 2056;
                                this.field3143[9][0] = 2088;
                                this.field3143[9][3] = 2666;
                                this.field3143[10][3] = 3276;
                                this.field3143[7][2] = 1525;
                                this.field3143[11][3] = 3228;
                                this.field3143[8][2] = 1590;
                                this.field3143[7][1] = 1413;
                                this.field3143[9][2] = 2056;
                                this.field3143[8][1] = 1108;
                                this.field3143[12][3] = 3196;
                                this.field3143[10][2] = 2586;
                                this.field3143[13][3] = 3019;
                                this.field3143[14][3] = 3228;
                                this.field3143[10][0] = 2355;
                                this.field3143[11][0] = 2691;
                                this.field3143[12][0] = 3031;
                                this.field3143[11][2] = 3148;
                                this.field3143[12][2] = 3710;
                                this.field3143[15][3] = 2746;
                                this.field3143[13][0] = 3522;
                                this.field3143[14][0] = 3727;
                                this.field3143[9][1] = 1766;
                                this.field3143[15][0] = 4096;
                                this.field3143[10][1] = 2409;
                                this.field3143[11][1] = 3116;
                                this.field3143[12][1] = 3806;
                                this.field3143[13][1] = 3437;
                                this.field3143[13][2] = 3421;
                                this.field3143[14][2] = 3148;
                                this.field3143[14][1] = 3116;
                                this.field3143[15][1] = 2377;
                                this.field3143[15][2] = 2505;
                            }
                        } else {
                            this.field3143 = new int[6][4];
                            this.field3143[0][2] = 0;
                            this.field3143[0][1] = 0;
                            this.field3143[1][1] = 0;
                            this.field3143[2][1] = 0;
                            this.field3143[3][1] = 0;
                            this.field3143[0][3] = 0;
                            this.field3143[1][3] = 1493;
                            this.field3143[1][2] = 0;
                            this.field3143[2][2] = 0;
                            this.field3143[2][3] = 2939;
                            this.field3143[3][2] = 1124;
                            this.field3143[3][3] = 3565;
                            this.field3143[0][0] = 0;
                            this.field3143[4][2] = 3084;
                            this.field3143[4][1] = 546;
                            this.field3143[1][0] = 1843;
                            this.field3143[4][3] = 4031;
                            this.field3143[5][2] = 4096;
                            this.field3143[5][3] = 4096;
                            this.field3143[2][0] = 2457;
                            this.field3143[5][1] = 4096;
                            this.field3143[3][0] = 2781;
                            this.field3143[4][0] = 3481;
                            this.field3143[5][0] = 4096;
                        }
                    } else {
                        this.field3143 = new int[7][4];
                        this.field3143[0][3] = 4096;
                        this.field3143[0][0] = 0;
                        this.field3143[1][0] = 663;
                        this.field3143[1][3] = 4096;
                        this.field3143[0][2] = 0;
                        this.field3143[1][2] = 4096;
                        this.field3143[2][2] = 4096;
                        this.field3143[2][3] = 0;
                        this.field3143[2][0] = 1363;
                        this.field3143[0][1] = 0;
                        this.field3143[1][1] = 0;
                        this.field3143[3][3] = 0;
                        this.field3143[2][1] = 0;
                        this.field3143[3][0] = 2048;
                        this.field3143[4][0] = 2727;
                        this.field3143[3][1] = 4096;
                        this.field3143[4][3] = 0;
                        this.field3143[5][3] = 4096;
                        this.field3143[3][2] = 4096;
                        this.field3143[4][1] = 4096;
                        this.field3143[5][0] = 3411;
                        this.field3143[6][3] = 4096;
                        this.field3143[4][2] = 0;
                        this.field3143[5][2] = 0;
                        this.field3143[5][1] = 4096;
                        this.field3143[6][0] = 4096;
                        this.field3143[6][1] = 0;
                        this.field3143[6][2] = 0;
                    }
                } else {
                    this.field3143 = new int[8][4];
                    this.field3143[0][2] = 2602;
                    this.field3143[1][2] = 1799;
                    this.field3143[0][1] = 2650;
                    this.field3143[0][3] = 2361;
                    this.field3143[0][0] = 0;
                    this.field3143[1][0] = 2867;
                    this.field3143[2][0] = 3072;
                    this.field3143[1][1] = 2313;
                    this.field3143[2][1] = 2618;
                    this.field3143[3][1] = 2296;
                    this.field3143[4][1] = 2072;
                    this.field3143[2][2] = 1734;
                    this.field3143[3][2] = 1220;
                    this.field3143[3][0] = 3276;
                    this.field3143[1][3] = 1558;
                    this.field3143[5][1] = 2730;
                    this.field3143[4][2] = 963;
                    this.field3143[5][2] = 2152;
                    this.field3143[6][1] = 2232;
                    this.field3143[2][3] = 1413;
                    this.field3143[3][3] = 947;
                    this.field3143[4][3] = 722;
                    this.field3143[5][3] = 1766;
                    this.field3143[7][1] = 1686;
                    this.field3143[6][2] = 1060;
                    this.field3143[4][0] = 3481;
                    this.field3143[5][0] = 3686;
                    this.field3143[6][3] = 915;
                    this.field3143[6][0] = 3891;
                    this.field3143[7][3] = 1140;
                    this.field3143[7][2] = 1413;
                    this.field3143[7][0] = 4096;
                }
            } else {
                this.field3143 = new int[2][4];
                this.field3143[0][0] = 0;
                this.field3143[0][3] = 0;
                this.field3143[1][0] = 4096;
                this.field3143[1][3] = 4096;
                this.field3143[0][2] = 0;
                this.field3143[0][1] = 0;
                this.field3143[1][1] = 4096;
                this.field3143[1][2] = 4096;
            }
        }
        if (arg1 >= -114) {
            this.field3143 = null;
        }
    }
}
