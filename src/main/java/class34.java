import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class34 extends class148 {

    @OriginalMember(owner = "client!gs", name = "J", descriptor = "[I")
    private int[] field349 = new int[257];

    @OriginalMember(owner = "client!gs", name = "R", descriptor = "Z")
    public static boolean field356 = false;

    @OriginalMember(owner = "client!gs", name = "S", descriptor = "I")
    public static int field357 = 0;

    @OriginalMember(owner = "client!gs", name = "W", descriptor = "[Ljava/lang/String;")
    public static String[] field361 = new String[5];

    @OriginalMember(owner = "client!gs", name = "Y", descriptor = "I")
    public static int field363 = 64;

    @OriginalMember(owner = "client!gs", name = "K", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!gs", name = "L", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!gs", name = "N", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!gs", name = "Q", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!gs", name = "T", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!gs", name = "U", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!gs", name = "V", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!gs", name = "X", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!gs", name = "P", descriptor = "Lia;")
    public static class414 field354;

    @OriginalMember(owner = "client!gs", name = "M", descriptor = "[[I")
    private int[][] field352;

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
    public class34() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)V")
    private final void method189(int arg0, int arg1) {
        int var3 = 0 % ((arg1 - 33) / 34);
        ++field358;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field352 = new int[4][4];
                                    this.field352[0][0] = 2048;
                                    this.field352[0][1] = 0;
                                    this.field352[0][3] = 0;
                                    this.field352[0][2] = 4096;
                                    this.field352[1][3] = 0;
                                    this.field352[1][0] = 2867;
                                    this.field352[1][2] = 4096;
                                    this.field352[1][1] = 4096;
                                    this.field352[2][0] = 3276;
                                    this.field352[2][1] = 4096;
                                    this.field352[2][2] = 4096;
                                    this.field352[2][3] = 0;
                                    this.field352[3][2] = 0;
                                    this.field352[3][0] = 4096;
                                    this.field352[3][3] = 0;
                                    this.field352[3][1] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field352 = new int[16][4];
                                this.field352[0][2] = 192;
                                this.field352[0][3] = 321;
                                this.field352[0][0] = 0;
                                this.field352[0][1] = 80;
                                this.field352[1][1] = 321;
                                this.field352[1][2] = 449;
                                this.field352[1][3] = 562;
                                this.field352[1][0] = 155;
                                this.field352[2][1] = 578;
                                this.field352[2][3] = 803;
                                this.field352[2][2] = 690;
                                this.field352[2][0] = 389;
                                this.field352[3][1] = 947;
                                this.field352[3][0] = 671;
                                this.field352[3][2] = 995;
                                this.field352[3][3] = 1140;
                                this.field352[4][3] = 1509;
                                this.field352[4][2] = 1397;
                                this.field352[4][1] = 1285;
                                this.field352[4][0] = 897;
                                this.field352[5][2] = 1429;
                                this.field352[5][1] = 1525;
                                this.field352[5][3] = 1413;
                                this.field352[5][0] = 1175;
                                this.field352[6][0] = 1368;
                                this.field352[6][1] = 1734;
                                this.field352[6][3] = 1333;
                                this.field352[6][2] = 1461;
                                this.field352[7][1] = 1413;
                                this.field352[7][0] = 1507;
                                this.field352[7][3] = 1702;
                                this.field352[7][2] = 1525;
                                this.field352[8][3] = 2056;
                                this.field352[8][2] = 1590;
                                this.field352[8][1] = 1108;
                                this.field352[8][0] = 1736;
                                this.field352[9][0] = 2088;
                                this.field352[9][1] = 1766;
                                this.field352[9][2] = 2056;
                                this.field352[9][3] = 2666;
                                this.field352[10][0] = 2355;
                                this.field352[10][2] = 2586;
                                this.field352[10][1] = 2409;
                                this.field352[10][3] = 3276;
                                this.field352[11][2] = 3148;
                                this.field352[11][0] = 2691;
                                this.field352[11][3] = 3228;
                                this.field352[11][1] = 3116;
                                this.field352[12][1] = 3806;
                                this.field352[12][3] = 3196;
                                this.field352[12][2] = 3710;
                                this.field352[12][0] = 3031;
                                this.field352[13][1] = 3437;
                                this.field352[13][0] = 3522;
                                this.field352[13][2] = 3421;
                                this.field352[13][3] = 3019;
                                this.field352[14][2] = 3148;
                                this.field352[14][0] = 3727;
                                this.field352[14][3] = 3228;
                                this.field352[14][1] = 3116;
                                this.field352[15][2] = 2505;
                                this.field352[15][3] = 2746;
                                this.field352[15][1] = 2377;
                                this.field352[15][0] = 4096;
                            }
                        } else {
                            this.field352 = new int[6][4];
                            this.field352[0][2] = 0;
                            this.field352[0][0] = 0;
                            this.field352[0][3] = 0;
                            this.field352[0][1] = 0;
                            this.field352[1][0] = 1843;
                            this.field352[1][2] = 0;
                            this.field352[1][1] = 0;
                            this.field352[1][3] = 1493;
                            this.field352[2][1] = 0;
                            this.field352[2][3] = 2939;
                            this.field352[2][2] = 0;
                            this.field352[2][0] = 2457;
                            this.field352[3][1] = 0;
                            this.field352[3][2] = 1124;
                            this.field352[3][0] = 2781;
                            this.field352[3][3] = 3565;
                            this.field352[4][3] = 4031;
                            this.field352[4][2] = 3084;
                            this.field352[4][0] = 3481;
                            this.field352[4][1] = 546;
                            this.field352[5][3] = 4096;
                            this.field352[5][0] = 4096;
                            this.field352[5][1] = 4096;
                            this.field352[5][2] = 4096;
                        }
                    } else {
                        this.field352 = new int[7][4];
                        this.field352[0][2] = 0;
                        this.field352[0][0] = 0;
                        this.field352[0][1] = 0;
                        this.field352[0][3] = 4096;
                        this.field352[1][3] = 4096;
                        this.field352[1][0] = 663;
                        this.field352[1][2] = 4096;
                        this.field352[1][1] = 0;
                        this.field352[2][3] = 0;
                        this.field352[2][0] = 1363;
                        this.field352[2][2] = 4096;
                        this.field352[2][1] = 0;
                        this.field352[3][2] = 4096;
                        this.field352[3][3] = 0;
                        this.field352[3][1] = 4096;
                        this.field352[3][0] = 2048;
                        this.field352[4][0] = 2727;
                        this.field352[4][1] = 4096;
                        this.field352[4][3] = 0;
                        this.field352[4][2] = 0;
                        this.field352[5][1] = 4096;
                        this.field352[5][0] = 3411;
                        this.field352[5][2] = 0;
                        this.field352[5][3] = 4096;
                        this.field352[6][1] = 0;
                        this.field352[6][0] = 4096;
                        this.field352[6][3] = 4096;
                        this.field352[6][2] = 0;
                    }
                } else {
                    this.field352 = new int[8][4];
                    this.field352[0][0] = 0;
                    this.field352[0][1] = 2650;
                    this.field352[0][3] = 2361;
                    this.field352[0][2] = 2602;
                    this.field352[1][3] = 1558;
                    this.field352[1][2] = 1799;
                    this.field352[1][1] = 2313;
                    this.field352[1][0] = 2867;
                    this.field352[2][0] = 3072;
                    this.field352[2][1] = 2618;
                    this.field352[2][2] = 1734;
                    this.field352[2][3] = 1413;
                    this.field352[3][3] = 947;
                    this.field352[3][1] = 2296;
                    this.field352[3][0] = 3276;
                    this.field352[3][2] = 1220;
                    this.field352[4][2] = 963;
                    this.field352[4][3] = 722;
                    this.field352[4][1] = 2072;
                    this.field352[4][0] = 3481;
                    this.field352[5][3] = 1766;
                    this.field352[5][2] = 2152;
                    this.field352[5][0] = 3686;
                    this.field352[5][1] = 2730;
                    this.field352[6][1] = 2232;
                    this.field352[6][2] = 1060;
                    this.field352[6][0] = 3891;
                    this.field352[6][3] = 915;
                    this.field352[7][1] = 1686;
                    this.field352[7][3] = 1140;
                    this.field352[7][0] = 4096;
                    this.field352[7][2] = 1413;
                }
            } else {
                this.field352 = new int[2][4];
                this.field352[0][2] = 0;
                this.field352[0][3] = 0;
                this.field352[0][0] = 0;
                this.field352[0][1] = 0;
                this.field352[1][0] = 4096;
                this.field352[1][1] = 4096;
                this.field352[1][2] = 4096;
                this.field352[1][3] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        if (~arg0 == -1) {
            int var4 = arg1.method1428(32122);
            if (var4 == 0) {
                this.field352 = new int[arg1.method1428(32122)][4];
                for (int var5 = 0; var5 < this.field352.length; ++var5) {
                    this.field352[var5][0] = arg1.method1450((byte) 116);
                    this.field352[var5][1] = arg1.method1428(32122) << 4;
                    this.field352[var5][2] = arg1.method1428(32122) << 4;
                    this.field352[var5][3] = arg1.method1428(32122) << 4;
                }
            } else {
                this.method189(var4, 121);
            }
        }
        ++field351;
        int var6 = 109 % ((-88 - arg2) / 33);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method27(boolean arg0, int arg1) {
        ++field353;
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field2189.method2422(-2, arg1);
            if (super.field2189.field6033) {
                int[] var4 = this.method971(!arg0, arg1, 0);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; ~var8 > ~class320.field4579; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (~var9 > -1) {
                        var9 = 0;
                    }
                    if (var9 > 256) {
                        var9 = 256;
                    }
                    int var10 = this.field349[var9];
                    var5[var8] = class286.method1847(var10 >> 12, 4080);
                    var6[var8] = class286.method1847(var10 >> 4, 4080);
                    var7[var8] = class286.method1847(var10 << 4, 4080);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "(B)V")
    public static void method190(byte arg0) {
        field361 = null;
        if (arg0 != 89) {
            field361 = null;
        }
        field354 = null;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(ZI)I")
    public static final int method191(boolean arg0, int arg1) {
        ++field360;
        int var2 = 63 & arg1;
        int var3 = (211 & arg1) >> 6;
        if (~var2 != -19) {
            if (var2 == 19 || ~var2 == -22) {
                if (~var3 == -1) {
                    return 16;
                }
                if (var3 == 1) {
                    return 32;
                }
                if (~var3 == -3) {
                    return 64;
                }
                if (~var3 == -4) {
                    return 128;
                }
            }
        } else {
            if (var3 == 0) {
                return 1;
            }
            if (~var3 == -2) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (~var3 == -4) {
                return 8;
            }
        }
        if (!arg0) {
            method193(107, 125, -37, (class239) null);
        }
        return 0;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V")
    private final void method192(boolean arg0) {
        ++field355;
        if (arg0) {
            this.method23(-86, (class209) null, 14);
        }
        int var2 = this.field352.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && ~this.field352[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var11;
                int var12;
                int var13;
                if (var4 < var2) {
                    int[] var7 = this.field352[var4];
                    if (var4 > 0) {
                        int[] var8 = this.field352[var4 - 1];
                        int var9 = (-var8[0] + var5 << 12) / (var7[0] + -var8[0]);
                        int var10 = -var9 + 4096;
                        var11 = var7[1] * var9 + var8[1] * var10 >> 12;
                        var12 = var7[2] * var9 + var8[2] * var10 >> 12;
                        var13 = var7[3] * var9 - -(var8[3] * var10) >> 12;
                    } else {
                        var11 = var7[1];
                        var13 = var7[3];
                        var12 = var7[2];
                    }
                } else {
                    int[] var14 = this.field352[var2 + -1];
                    var12 = var14[2];
                    var11 = var14[1];
                    var13 = var14[3];
                }
                int var15 = var11 >> 4;
                int var16 = var12 >> 4;
                int var17 = var13 >> 4;
                if (~var16 > -1) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                if (~var17 > -1) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                this.field349[var3] = class18.method119(var17, class18.method119(var16 << 8, var15 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIILoq;)V")
    public static final void method193(int arg0, int arg1, int arg2, class239 arg3) {
        if (arg2 != 8) {
            method190((byte) 44);
        }
        ++field362;
        if (arg3.field1950 == arg0 && arg0 != -1) {
            class329 var4 = class84.field1295.method1182(arg0, 8);
            int var5 = var4.field4668;
            if (var5 == 1) {
                arg3.field1935 = 0;
                arg3.field1915 = 1;
                arg3.field1952 = 0;
                arg3.field1936 = arg1;
                arg3.field1940 = 0;
                class480.method2856(arg3.field1769, arg3.field1763, (byte) 30, arg3.field1768, class500.field7365 == arg3, var4, arg3.field1940);
            }
            if (var5 == 2) {
                arg3.field1952 = 0;
                return;
            }
        } else if (~arg0 == 0 || arg3.field1950 == -1 || class84.field1295.method1182(arg0, 8).field4680 >= class84.field1295.method1182(arg3.field1950, 8).field4680) {
            arg3.field1935 = 0;
            arg3.field1999 = arg3.field2000;
            arg3.field1915 = 1;
            arg3.field1940 = 0;
            arg3.field1936 = arg1;
            arg3.field1952 = 0;
            arg3.field1950 = arg0;
            if (arg3.field1950 == -1) {
                return;
            }
            class480.method2856(arg3.field1769, arg3.field1763, (byte) 79, arg3.field1768, class500.field7365 == arg3, class84.field1295.method1182(arg3.field1950, 8), arg3.field1940);
        }
    }

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "(B)V")
    public static final void method194(byte arg0) {
        if (class271.field3940 < 0) {
            class521.field7721 = -1;
            class271.field3940 = 0;
            class83.field1289 = -1;
        }
        ++field359;
        if (arg0 != -70) {
            method193(-37, 115, -31, (class239) null);
        }
        if (class460.field6815 < class271.field3940) {
            class271.field3940 = class460.field6815;
            class83.field1289 = -1;
            class521.field7721 = -1;
        }
        if (class335.field4715 < 0) {
            class83.field1289 = -1;
            class521.field7721 = -1;
            class335.field4715 = 0;
        }
        if (~class335.field4715 < ~class460.field6830) {
            class83.field1289 = -1;
            class521.field7721 = -1;
            class335.field4715 = class460.field6830;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
    public final void method175(int arg0) {
        if (this.field352 == null) {
            this.method189(1, arg0 ^ 1285532511);
        }
        ++field350;
        if (arg0 == -1285532468) {
            this.method192(false);
        }
    }
}
