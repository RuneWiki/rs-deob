import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class277 extends class182 {

    @OriginalMember(owner = "client!b", name = "W", descriptor = "[I")
    private int[] field4617 = new int[257];

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field4619 = " is already on your friend list.";

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!b", name = "T", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!b", name = "U", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!b", name = "V", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!b", name = "X", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "Lkj;")
    public static class215 field4611;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "[[I")
    private int[][] field4612;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
    private final void method1937(boolean arg0) {
        ++field4614;
        if (!arg0) {
            field4619 = null;
        }
        int var2 = this.field4612.length;
        if (var2 > 0) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = var3 << 4;
                int var5 = 0;
                for (int var6 = 0; ~var2 < ~var6 && this.field4612[var6][0] <= var4; ++var6) {
                    ++var5;
                }
                int var8;
                int var9;
                int var10;
                if (~var2 < ~var5) {
                    int[] var7 = this.field4612[var5];
                    if (var5 <= 0) {
                        var8 = var7[1];
                        var9 = var7[3];
                        var10 = var7[2];
                    } else {
                        int[] var11 = this.field4612[var5 - 1];
                        int var12 = (var4 - var11[0] << 12) / (var7[0] + -var11[0]);
                        int var13 = -var12 + 4096;
                        var9 = var7[3] * var12 + var11[3] * var13 >> 12;
                        var8 = var7[1] * var12 + var11[1] * var13 >> 12;
                        var10 = var7[2] * var12 - -(var11[2] * var13) >> 12;
                    }
                } else {
                    int[] var14 = this.field4612[var2 - 1];
                    var8 = var14[1];
                    var9 = var14[3];
                    var10 = var14[2];
                }
                int var15 = var8 >> 4;
                if (var15 >= 0) {
                    if (var15 > 255) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                int var16 = var9 >> 4;
                if (var16 < 0) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                int var17 = var10 >> 4;
                if (~var17 > -1) {
                    var17 = 0;
                } else if (~var17 < -256) {
                    var17 = 255;
                }
                this.field4617[var3] = class312.method2107(class312.method2107(var17 << 8, var15 << 16), var16);
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)[[I")
    public final int[][] method157(byte arg0, int arg1) {
        int[][] var3 = super.field2905.method50(arg1, (byte) 127);
        int var4 = -117 % ((arg0 - -64) / 49);
        ++field4616;
        if (super.field2905.field158) {
            int[] var5 = this.method1323(0, -17707, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class4.field116; ++var9) {
                int var10 = var5[var9] >> 4;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (~var10 < -257) {
                    var10 = 256;
                }
                int var11 = this.field4617[var10];
                var6[var9] = class15.method84(4080, var11 >> 12);
                var7[var9] = class15.method84(var11 >> 4, 4080);
                var8[var9] = class15.method84(4080, var11 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class277() {
        super(1, false);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)V")
    private final void method1938(int arg0, boolean arg1) {
        ++field4615;
        if (arg1) {
            this.method155(true, (class249) null, 116);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field4612 = new int[4][4];
                                    this.field4612[0][3] = 0;
                                    this.field4612[0][0] = 2048;
                                    this.field4612[0][2] = 4096;
                                    this.field4612[1][3] = 0;
                                    this.field4612[1][0] = 2867;
                                    this.field4612[0][1] = 0;
                                    this.field4612[2][0] = 3276;
                                    this.field4612[2][3] = 0;
                                    this.field4612[3][3] = 0;
                                    this.field4612[1][1] = 4096;
                                    this.field4612[3][0] = 4096;
                                    this.field4612[2][1] = 4096;
                                    this.field4612[1][2] = 4096;
                                    this.field4612[3][1] = 4096;
                                    this.field4612[2][2] = 4096;
                                    this.field4612[3][2] = 0;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field4612 = new int[16][4];
                                this.field4612[0][1] = 80;
                                this.field4612[0][0] = 0;
                                this.field4612[1][1] = 321;
                                this.field4612[1][0] = 155;
                                this.field4612[0][2] = 192;
                                this.field4612[2][1] = 578;
                                this.field4612[0][3] = 321;
                                this.field4612[2][0] = 389;
                                this.field4612[3][0] = 671;
                                this.field4612[4][0] = 897;
                                this.field4612[1][2] = 449;
                                this.field4612[2][2] = 690;
                                this.field4612[3][1] = 947;
                                this.field4612[3][2] = 995;
                                this.field4612[4][1] = 1285;
                                this.field4612[1][3] = 562;
                                this.field4612[5][1] = 1525;
                                this.field4612[4][2] = 1397;
                                this.field4612[5][2] = 1429;
                                this.field4612[2][3] = 803;
                                this.field4612[5][0] = 1175;
                                this.field4612[6][0] = 1368;
                                this.field4612[6][1] = 1734;
                                this.field4612[7][1] = 1413;
                                this.field4612[3][3] = 1140;
                                this.field4612[4][3] = 1509;
                                this.field4612[7][0] = 1507;
                                this.field4612[8][0] = 1736;
                                this.field4612[6][2] = 1461;
                                this.field4612[8][1] = 1108;
                                this.field4612[9][1] = 1766;
                                this.field4612[7][2] = 1525;
                                this.field4612[5][3] = 1413;
                                this.field4612[10][1] = 2409;
                                this.field4612[6][3] = 1333;
                                this.field4612[8][2] = 1590;
                                this.field4612[9][2] = 2056;
                                this.field4612[9][0] = 2088;
                                this.field4612[11][1] = 3116;
                                this.field4612[7][3] = 1702;
                                this.field4612[10][0] = 2355;
                                this.field4612[11][0] = 2691;
                                this.field4612[8][3] = 2056;
                                this.field4612[9][3] = 2666;
                                this.field4612[10][2] = 2586;
                                this.field4612[11][2] = 3148;
                                this.field4612[12][1] = 3806;
                                this.field4612[10][3] = 3276;
                                this.field4612[13][1] = 3437;
                                this.field4612[11][3] = 3228;
                                this.field4612[12][2] = 3710;
                                this.field4612[14][1] = 3116;
                                this.field4612[12][0] = 3031;
                                this.field4612[15][1] = 2377;
                                this.field4612[13][0] = 3522;
                                this.field4612[14][0] = 3727;
                                this.field4612[15][0] = 4096;
                                this.field4612[13][2] = 3421;
                                this.field4612[14][2] = 3148;
                                this.field4612[12][3] = 3196;
                                this.field4612[15][2] = 2505;
                                this.field4612[13][3] = 3019;
                                this.field4612[14][3] = 3228;
                                this.field4612[15][3] = 2746;
                            }
                        } else {
                            this.field4612 = new int[6][4];
                            this.field4612[0][0] = 0;
                            this.field4612[0][1] = 0;
                            this.field4612[0][3] = 0;
                            this.field4612[1][3] = 1493;
                            this.field4612[1][1] = 0;
                            this.field4612[2][3] = 2939;
                            this.field4612[2][1] = 0;
                            this.field4612[1][0] = 1843;
                            this.field4612[2][0] = 2457;
                            this.field4612[3][0] = 2781;
                            this.field4612[4][0] = 3481;
                            this.field4612[3][3] = 3565;
                            this.field4612[5][0] = 4096;
                            this.field4612[3][1] = 0;
                            this.field4612[0][2] = 0;
                            this.field4612[4][1] = 546;
                            this.field4612[5][1] = 4096;
                            this.field4612[4][3] = 4031;
                            this.field4612[5][3] = 4096;
                            this.field4612[1][2] = 0;
                            this.field4612[2][2] = 0;
                            this.field4612[3][2] = 1124;
                            this.field4612[4][2] = 3084;
                            this.field4612[5][2] = 4096;
                        }
                    } else {
                        this.field4612 = new int[7][4];
                        this.field4612[0][2] = 0;
                        this.field4612[0][3] = 4096;
                        this.field4612[0][1] = 0;
                        this.field4612[0][0] = 0;
                        this.field4612[1][2] = 4096;
                        this.field4612[1][1] = 0;
                        this.field4612[2][2] = 4096;
                        this.field4612[2][1] = 0;
                        this.field4612[1][0] = 663;
                        this.field4612[3][2] = 4096;
                        this.field4612[2][0] = 1363;
                        this.field4612[3][1] = 4096;
                        this.field4612[3][0] = 2048;
                        this.field4612[4][2] = 0;
                        this.field4612[4][1] = 4096;
                        this.field4612[5][1] = 4096;
                        this.field4612[1][3] = 4096;
                        this.field4612[4][0] = 2727;
                        this.field4612[6][1] = 0;
                        this.field4612[5][0] = 3411;
                        this.field4612[6][0] = 4096;
                        this.field4612[5][2] = 0;
                        this.field4612[2][3] = 0;
                        this.field4612[6][2] = 0;
                        this.field4612[3][3] = 0;
                        this.field4612[4][3] = 0;
                        this.field4612[5][3] = 4096;
                        this.field4612[6][3] = 4096;
                    }
                } else {
                    this.field4612 = new int[8][4];
                    this.field4612[0][1] = 2650;
                    this.field4612[1][1] = 2313;
                    this.field4612[0][2] = 2602;
                    this.field4612[1][2] = 1799;
                    this.field4612[0][3] = 2361;
                    this.field4612[0][0] = 0;
                    this.field4612[2][2] = 1734;
                    this.field4612[2][1] = 2618;
                    this.field4612[3][2] = 1220;
                    this.field4612[3][1] = 2296;
                    this.field4612[1][3] = 1558;
                    this.field4612[4][1] = 2072;
                    this.field4612[4][2] = 963;
                    this.field4612[5][2] = 2152;
                    this.field4612[2][3] = 1413;
                    this.field4612[3][3] = 947;
                    this.field4612[1][0] = 2867;
                    this.field4612[6][2] = 1060;
                    this.field4612[2][0] = 3072;
                    this.field4612[3][0] = 3276;
                    this.field4612[4][0] = 3481;
                    this.field4612[5][1] = 2730;
                    this.field4612[6][1] = 2232;
                    this.field4612[4][3] = 722;
                    this.field4612[7][2] = 1413;
                    this.field4612[7][1] = 1686;
                    this.field4612[5][0] = 3686;
                    this.field4612[6][0] = 3891;
                    this.field4612[7][0] = 4096;
                    this.field4612[5][3] = 1766;
                    this.field4612[6][3] = 915;
                    this.field4612[7][3] = 1140;
                }
            } else {
                this.field4612 = new int[2][4];
                this.field4612[0][2] = 0;
                this.field4612[1][2] = 4096;
                this.field4612[0][3] = 0;
                this.field4612[0][0] = 0;
                this.field4612[1][0] = 4096;
                this.field4612[0][1] = 0;
                this.field4612[1][3] = 4096;
                this.field4612[1][1] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIB)I")
    public static final int method1939(int arg0, int arg1, int arg2, byte arg3) {
        ++field4620;
        if (class245.field4123 == null) {
            return 0;
        } else {
            int var4 = arg1 >> 7;
            int var5 = arg2 >> 7;
            if (~var4 <= -1 && ~var5 <= -1 && ~var4 >= -104 && var5 <= 103) {
                if (arg3 != -34) {
                    method1941(-90, -90, -73);
                }
                int var6 = 127 & arg1;
                int var7 = arg0;
                int var8 = 127 & arg2;
                if (~arg0 > -4 && (class67.field1132[1][var4][var5] & 2) == 2) {
                    var7 = arg0 + 1;
                }
                int var9 = (-var6 + 128) * class245.field4123[var7][var4][var5] + class245.field4123[var7][var4 - -1][var5] * var6 >> 7;
                int var10 = (128 - var6) * class245.field4123[var7][var4][var5 + 1] + class245.field4123[var7][var4 + 1][var5 + 1] * var6 >> 7;
                return (128 - var8) * var9 - -(var8 * var10) >> 7;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(Z)V")
    public static void method1940(boolean arg0) {
        if (!arg0) {
            field4611 = null;
            field4619 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(III)I")
    public static final int method1941(int arg0, int arg1, int arg2) {
        ++field4609;
        int var3 = 105 % ((63 - arg0) / 33);
        int var4 = arg1 * 57 + arg2;
        int var5 = var4 ^ var4 << 13;
        int var6 = (var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE;
        return var6 >> 19 & 255;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IJ)V")
    public static final void method1942(int arg0, long arg1) {
        ++field4618;
        if (!class46.field814) {
            class265.field4432 += (float) arg1 * class250.field4237 / 40.0F;
            class187.field2993 += (float) arg1 * class43.field658 / 40.0F;
        }
        int var3 = class234.field3950 + class16.field314.field715;
        if (arg0 != 0) {
            field4611 = null;
        }
        int var4 = class127.field2124 + class16.field314.field771;
        if (-var3 + class127.field2115 < -500 || -var3 + class127.field2115 > 500 || ~(-var4 + class100.field1592) > 499 || ~(-var4 + class100.field1592) < -501) {
            class100.field1592 = var4;
            class127.field2115 = var3;
        }
        if (~class127.field2115 != ~var3) {
            int var5 = -class127.field2115 + var3;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (~var5 >= -1) {
                if (~var6 == -1) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 != 0) {
                if (~var6 < ~var5) {
                    var6 = var5;
                }
            } else {
                var6 = 1;
            }
            class127.field2115 += var6;
        }
        if (~class100.field1592 != ~var4) {
            int var7 = -class100.field1592 + var4;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 != 0) {
                    if (var8 < var7) {
                        var8 = var7;
                    }
                } else {
                    var8 = -1;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class100.field1592 += var8;
        }
        class249.method1776(122);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        ++field4613;
        if (~arg2 == -1) {
            int var4 = arg1.method1802((byte) 88);
            if (~var4 == -1) {
                this.field4612 = new int[arg1.method1802((byte) 48)][4];
                for (int var5 = 0; this.field4612.length > var5; ++var5) {
                    this.field4612[var5][0] = arg1.method1821((byte) 51);
                    this.field4612[var5][1] = arg1.method1802((byte) -97) << 4;
                    this.field4612[var5][2] = arg1.method1802((byte) 30) << 4;
                    this.field4612[var5][3] = arg1.method1802((byte) 56) << 4;
                }
            } else {
                this.method1938(var4, false);
            }
        }
        if (arg0) {
            method1942(-22, 92L);
        }
    }

    @OriginalMember(owner = "client!b", name = "g", descriptor = "(I)V")
    public final void method469(int arg0) {
        ++field4610;
        if (this.field4612 == null) {
            this.method1938(1, false);
        }
        if (arg0 != -1) {
            field4621 = 1;
        }
        this.method1937(true);
    }
}
