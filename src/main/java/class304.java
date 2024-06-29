import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class304 extends class119 {

    @OriginalMember(owner = "client!sr", name = "E", descriptor = "I")
    private int field4097;

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "I")
    private int field4084;

    @OriginalMember(owner = "client!sr", name = "A", descriptor = "I")
    private int field4093;

    @OriginalMember(owner = "client!sr", name = "y", descriptor = "I")
    private int field4091;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
    private int field4082;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
    private int field4075;

    @OriginalMember(owner = "client!sr", name = "w", descriptor = "I")
    private int field4089;

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "I")
    private int field4086;

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "[I")
    public static int[] field4083 = new int[250];

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!sr", name = "x", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!sr", name = "B", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!sr", name = "C", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!sr", name = "D", descriptor = "[Lip;")
    public static class279[] field4096;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B[B)[B", line = 4)
    public static final byte[] method1928(byte arg0, byte[] arg1) {
        ++field4094;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class114.method667(arg1, 0, var3, 0, var2);
        if (arg0 != -9) {
            method1932(-100);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BII)V", line = 22)
    public final void method795(byte arg0, int arg1, int arg2) {
        ++field4076;
        if (arg0 != -33) {
            field4096 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIBIII)V", line = 32)
    public static final void method1929(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field4077;
        int var6 = class65.method376(class53.field624, class118.field1356, arg5, (byte) -39);
        int var7 = class65.method376(class53.field624, class118.field1356, arg0, (byte) -78);
        int var8 = class65.method376(class295.field3937, class427.field5844, arg1, (byte) -116);
        int var9 = class65.method376(class295.field3937, class427.field5844, arg4, (byte) 100);
        int var10 = var6;
        if (arg2 <= -70) {
            while (~var10 >= ~var7) {
                class384.method2394(arg3, 112, class228.field2877[var10], var9, var8);
                ++var10;
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IB)V", line = 64)
    public static final void method1930(int arg0, byte arg1) {
        int var2 = 62 / ((41 - arg1) / 38);
        class390.field5325 = 100;
        class76.field943 = 3;
        class42.field501 = arg0;
        ++field4087;
        class373.field5052 = -1;
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)I", line = 77)
    public static final int method1931(int arg0) {
        ++field4080;
        try {
            if (class72.field893 == 0) {
                if (~(class164.method1038(8635) - 5000L) > ~class1.field3) {
                    return 0;
                }
                class72.field884 = class401.field5525.method2714(class354.field4816, false, class296.field3944);
                class191.field2250 = class164.method1038(8635);
                class72.field893 = 1;
            }
            if (~(class191.field2250 + 30000L) > ~class164.method1038(8635)) {
                return class298.method1890(1000, (byte) -4);
            } else {
                if (class72.field893 == 1) {
                    if (class72.field884.field4244 == 2) {
                        return class298.method1890(1001, (byte) -4);
                    }
                    if (~class72.field884.field4244 != -2) {
                        return -1;
                    }
                    class181.field2107 = new class399((Socket) class72.field884.field4243, class401.field5525);
                    class72.field884 = null;
                    int var1 = 0;
                    class427.field5837.field3211 = 0;
                    if (class236.field3103) {
                        var1 = class127.field1414;
                    }
                    class427.field5837.method1593(23, arg0 + -1117);
                    class427.field5837.method1560(-26356, var1);
                    class181.field2107.method2464((byte) 49, 0, class427.field5837.field3211, class427.field5837.field3188);
                    if (class252.field3301 != null) {
                        class252.field3301.method1113((byte) 10);
                    }
                    if (class424.field5811 != null) {
                        class424.field5811.method1113((byte) -124);
                    }
                    int var2 = class181.field2107.method2469(arg0 ^ -19948);
                    if (class252.field3301 != null) {
                        class252.field3301.method1113((byte) -116);
                    }
                    if (class424.field5811 != null) {
                        class424.field5811.method1113((byte) -126);
                    }
                    if (var2 != 0) {
                        return class298.method1890(var2, (byte) -4);
                    }
                    class72.field893 = 2;
                }
                if (class72.field893 == 2) {
                    if (~class181.field2107.method2467((byte) -104) > -3) {
                        return -1;
                    }
                    class157.field1833 = class181.field2107.method2469(-19969);
                    class157.field1833 <<= 8;
                    class157.field1833 += class181.field2107.method2469(-19969);
                    class303.field4061 = new byte[class157.field1833];
                    class72.field893 = 3;
                    class137.field1553 = 0;
                }
                if (class72.field893 == 3) {
                    int var3 = class181.field2107.method2467((byte) -90);
                    if (var3 < 1) {
                        return -1;
                    } else {
                        if (~(-class137.field1553 + class157.field1833) > ~var3) {
                            var3 = class157.field1833 - class137.field1553;
                        }
                        class181.field2107.method2466(class137.field1553, var3, 16752, class303.field4061);
                        class137.field1553 += var3;
                        if (class137.field1553 < class157.field1833) {
                            return -1;
                        } else if (!class189.method1175(2, class303.field4061)) {
                            return class298.method1890(1002, (byte) -4);
                        } else {
                            class213.field2614 = new class27[class258.field3340];
                            int var4 = 0;
                            for (int var5 = class137.field1552; ~var5 >= ~class282.field3686; ++var5) {
                                class27 var6 = class235.method1515(var5, (byte) -126);
                                if (var6 != null) {
                                    class213.field2614[var4++] = var6;
                                }
                            }
                            class213.field2603 = 0;
                            class12.field148 = null;
                            class181.field2107.method2465((byte) -85);
                            class272.field3516 = 0;
                            class181.field2107 = null;
                            class303.field4061 = null;
                            class72.field893 = 0;
                            class1.field3 = class164.method1038(8635);
                            return 0;
                        }
                    }
                } else {
                    if (arg0 != 1003) {
                        field4081 = 29;
                    }
                    return -1;
                }
            }
        } catch (IOException var7) {
            return class298.method1890(1003, (byte) -4);
        }
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V", line = 214)
    public static void method1932(int arg0) {
        field4096 = null;
        if (arg0 != -1) {
            method1933(-23, 41, 115, -105, 32);
        }
        field4083 = null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIII)V", line = 225)
    public static final void method1933(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4090;
        class12 var5 = class390.method2422(341555040, arg1, arg2);
        var5.method66(-68);
        var5.field152 = arg3;
        var5.field149 = arg0;
        var5.field144 = arg4;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 238)
    public class304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4097 = arg0;
        this.field4084 = arg4;
        this.field4093 = arg7;
        this.field4091 = arg1;
        this.field4082 = arg6;
        this.field4075 = arg3;
        this.field4089 = arg2;
        this.field4086 = arg5;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)V", line = 255)
    public final void method793(int arg0, int arg1, int arg2) {
        ++field4078;
        int var4 = this.field4097 * arg2 >> 12;
        if (arg0 == -1) {
            int var5 = this.field4091 * arg1 >> 12;
            int var6 = this.field4089 * arg2 >> 12;
            int var7 = this.field4075 * arg1 >> 12;
            int var8 = this.field4084 * arg2 >> 12;
            int var9 = this.field4086 * arg1 >> 12;
            int var10 = this.field4082 * arg2 >> 12;
            int var11 = this.field4093 * arg1 >> 12;
            class283.method1784(var11, var10, super.field1376, var8, var4, var6, 16873, var9, var5, var7);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)V", line = 282)
    public static final void method1934(int arg0, int arg1) {
        ++field4088;
        int var2 = -class354.field4818 + class106.field1273;
        if (~var2 <= -101) {
            class320.field4294 = 1;
        } else {
            int var3 = (int) class301.field4020;
            if (class91.field1069 >> 8 > var3) {
                var3 = class91.field1069 >> 8;
            }
            if (class310.field4187[4] && ~var3 > ~(class449.field6282[4] + 128)) {
                var3 = class449.field6282[4] + 128;
            }
            int var4 = (int) class434.field5929 + class301.field4019 & 16383;
            class397.method2454(class374.field5069, -26713, (var3 >> 3) * arg1 + 600, class189.method1170(class143.field1684.field1514, class143.field1684.field1516, true, class43.field513) - 50, class277.field3583, var4, arg0, var3);
            float var5 = -((float) ((-var2 + 100) * (-var2 + 100) * (100 - var2)) / 1000000.0F) + 1.0F;
            class80.field979 = (int) ((float) (class80.field979 - class241.field3166) * var5 + (float) class241.field3166);
            class178.field2081 = (int) ((float) (-class368.field5022 + class178.field2081) * var5 + (float) class368.field5022);
            class287.field3784 = (int) ((float) (-class59.field749 + class287.field3784) * var5 + (float) class59.field749);
            class51.field587 = (int) ((float) (-class349.field4763 + class51.field587) * var5 + (float) class349.field4763);
            int var6 = -class291.field3849 + class433.field5912;
            if (~var6 < -8193) {
                var6 -= 16384;
            } else if (var6 < -8192) {
                var6 += 16384;
            }
            class433.field5912 = (int) ((float) var6 * var5 + (float) class291.field3849);
            class433.field5912 &= 16383;
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(BII)V", line = 331)
    public static final void method1935(byte arg0, int arg1, int arg2) {
        if (arg0 != -73) {
            field4083 = null;
        }
        ++field4092;
        class12 var3 = class390.method2422(arg0 ^ -341554985, arg1, 13);
        var3.method66(-55);
        var3.field144 = arg2;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIILaq;IIILem;I)V", line = 345)
    public static final void method1936(int arg0, int arg1, int arg2, class453 arg3, int arg4, int arg5, int arg6, class423 arg7, int arg8) {
        ++field4085;
        if (arg5 > -7) {
            field4083 = null;
        }
        int var9 = arg6 * arg6 + arg8 * arg8;
        if (arg0 >= var9) {
            int var10 = Math.min(arg3.field6377 / 2, arg3.field6432 / 2);
            if (var9 <= var10 * var10) {
                class173.method1090(arg1, true, arg3, arg4, arg6, class383.field5249[arg2], arg7, arg8);
            } else {
                var10 -= 10;
                int var11;
                if (class320.field4294 == 4) {
                    var11 = (int) class434.field5929 & 16383;
                } else {
                    var11 = 16383 & (int) class434.field5929 - -class231.field3043;
                }
                int var12 = class363.field4927[var11];
                int var13 = class363.field4917[var11];
                if (~class320.field4294 != -5) {
                    var12 = var12 * 256 / (class280.field3627 + 256);
                    var13 = var13 * 256 / (class280.field3627 + 256);
                }
                int var14 = arg6 * var13 + arg8 * var12 >> 15;
                int var15 = arg8 * var13 + -(arg6 * var12) >> 15;
                double var16 = Math.atan2((double) var14, (double) var15);
                int var18 = (int) (Math.sin(var16) * (double) var10);
                int var19 = (int) ((double) var10 * Math.cos(var16));
                class195.field2319[arg2].method2661((float) arg3.field6377 / 2.0F + (float) arg4 + (float) var18, (float) arg3.field6432 / 2.0F + (float) arg1 - (float) var19, 4096, (int) (-var16 / 6.283185307179586D * 65535.0D));
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lip;[[B[[B[[I[[BZILuo;II[[BBLip;)V", line = 400)
    public static final void method1937(class279 arg0, byte[][] arg1, byte[][] arg2, int[][] arg3, byte[][] arg4, boolean arg5, int arg6, class118 arg7, int arg8, int arg9, byte[][] arg10, byte arg11, class279 arg12) {
        ++field4079;
        if (arg11 != 12) {
            method1931(107);
        }
        for (int var13 = 0; var13 < arg9; ++var13) {
            int var14 = arg9 + -1 > var13 ? var13 - -1 : var13;
            for (int var15 = 0; var15 < arg6; ++var15) {
                int var16 = ~var15 > ~(arg6 + -1) ? var15 + 1 : var15;
                if (class98.method602(65280) || class221.method1341(117, var15, var13, class41.field488, arg8)) {
                    boolean var17 = false;
                    boolean var18 = false;
                    boolean[] var19 = new boolean[4];
                    int var20 = arg10[var13][var15];
                    int var21 = arg4[var13][var15];
                    int var22 = 255 & arg1[var13][var15];
                    int var23 = 255 & arg2[var13][var15];
                    int var24 = arg2[var13][var16] & 255;
                    int var25 = 255 & arg2[var14][var16];
                    int var26 = arg2[var14][var15] & 255;
                    if (~var22 != -1 || var23 != 0) {
                        class352 var27 = ~var22 == -1 ? null : class67.method391(var22 + -1, true);
                        class214 var28 = var23 == 0 ? null : class75.method447(var23 + -1, (byte) 81);
                        if (~var20 == -1 && var27 == null) {
                            var20 = 12;
                        }
                        class352 var29 = var27;
                        if (var27 != null) {
                            if (var27.field4787 == -1 && var27.field4791 == -1) {
                                var29 = var27;
                                var27 = null;
                            } else if (var28 != null && ~var20 != -1) {
                                var18 = var27.field4782;
                            }
                        }
                        if ((var20 == 0 || ~var20 == -13) && ~var13 < -1 && ~var15 < -1 && ~arg9 < ~var13 && ~arg6 < ~var15) {
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var30 + (~arg2[var13 + -1][var15 + -1] == ~var23 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var31 + (arg2[var14][var15 + -1] == var23 ? 1 : -1);
                            int var36 = var32 + (arg2[var14][var16] != var23 ? -1 : 1);
                            int var37 = var34 + (~arg2[var13 + -1][var16] == ~var23 ? 1 : -1);
                            if (~arg2[var13][var15 - 1] != ~var23) {
                                --var35;
                                --var33;
                            } else {
                                ++var33;
                                ++var35;
                            }
                            if (~arg2[var14][var15] != ~var23) {
                                --var35;
                                --var36;
                            } else {
                                ++var35;
                                ++var36;
                            }
                            if (~arg2[var13][var16] == ~var23) {
                                ++var36;
                                ++var37;
                            } else {
                                --var37;
                                --var36;
                            }
                            if (arg2[var13 - 1][var15] == var23) {
                                ++var37;
                                ++var33;
                            } else {
                                --var37;
                                --var33;
                            }
                            int var38 = var33 - var36;
                            if (~var38 > -1) {
                                var38 = -var38;
                            }
                            int var39 = -var37 + var35;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            if (var38 == var39) {
                                var38 = arg0.method1050(var13, var15) - arg0.method1050(var14, var16);
                                if (~var38 > -1) {
                                    var38 = -var38;
                                }
                                var39 = arg0.method1050(var14, var15) - arg0.method1050(var13, var16);
                                if (~var39 > -1) {
                                    var39 = -var39;
                                }
                            }
                            var21 = ~var38 > ~var39 ? 1 : 0;
                        }
                        for (int var40 = 0; ~var40 > -14; ++var40) {
                            class180.field2097[var40] = -1;
                            class252.field3302[var40] = 1;
                        }
                        boolean[] var41 = var27 != null && var27.field4782 ? class358.field4855[var20] : class247.field3266[var20];
                        class405.method2525(var13, (byte) 74, var20, arg4, arg10, var21, var19, arg7, arg1, arg9, var15, var27, arg6, var28);
                        boolean var42 = var27 != null && var27.field4791 != var27.field4787;
                        if (!var42) {
                            for (int var43 = 0; ~var43 > -9; ++var43) {
                                if (class180.field2097[var43] >= 0 && class393.field5360[var43] != class27.field309[var43]) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                        if (!var41[3 & 1 - -var21]) {
                            var19[1] = class318.method1993(var19[1], ~class191.method1183(class252.field3302[4], class252.field3302[2]) == -1);
                        }
                        if (!var41[var21 + 3 & 3]) {
                            var19[3] = class318.method1993(var19[3], ~class191.method1183(class252.field3302[6], class252.field3302[0]) == -1);
                        }
                        if (!var41[3 & var21]) {
                            var19[0] = class318.method1993(var19[0], ~class191.method1183(class252.field3302[0], class252.field3302[2]) == -1);
                        }
                        if (!var41[3 & var21 + 2]) {
                            var19[2] = class318.method1993(var19[2], class191.method1183(class252.field3302[6], class252.field3302[4]) == 0);
                        }
                        if (!var18 && (~var20 == -1 || var20 == 12)) {
                            if (var19[0] && !var19[1] && !var19[2] && var19[3]) {
                                var20 = var20 != 0 ? 14 : 13;
                                var19[0] = var19[3] = false;
                                var21 = 0;
                            } else if (var19[0] && var19[1] && !var19[2] && !var19[3]) {
                                var19[0] = var19[1] = false;
                                var21 = 3;
                                var20 = ~var20 == -1 ? 13 : 14;
                            } else if (!var19[0] && var19[1] && var19[2] && !var19[3]) {
                                var19[1] = var19[2] = false;
                                var20 = ~var20 != -1 ? 14 : 13;
                                var21 = 2;
                            } else if (!var19[0] && !var19[1] && var19[2] && var19[3]) {
                                var21 = 1;
                                var19[2] = var19[3] = false;
                                var20 = var20 != 0 ? 14 : 13;
                            }
                        }
                        boolean var44 = !var18 && !var19[0] && !var19[2] && !var19[1] && !var19[3];
                        int[] var45 = null;
                        int[] var46;
                        int[] var47;
                        int[] var48;
                        int var49;
                        int var50;
                        if (!var44) {
                            if (!var18) {
                                var46 = class340.field4640[var20];
                                var47 = class296.field3945[var20];
                                var45 = class429.field5864[var20];
                                var48 = class204.field2447[var20];
                                var49 = var28 == null ? 0 : class121.field1380[var20];
                                var50 = var27 != null ? class116.field1334[var20] : 0;
                            } else {
                                var48 = class90.field1056[var20];
                                var50 = var27 != null ? class158.field1842[var20] : 0;
                                var46 = class437.field5958[var20];
                                var45 = class191.field2251[var20];
                                var49 = var28 != null ? class226.field2864[var20] : 0;
                                var47 = class158.field1848[var20];
                            }
                        } else {
                            var46 = class42.field502[var20];
                            var47 = class163.field1896[var20];
                            var48 = class345.field4694[var20];
                            var50 = var27 != null ? class101.field1182[var20] : 0;
                            var49 = var28 != null ? class72.field886[var20] : 0;
                        }
                        int var51 = var49 + var50;
                        if (~var51 >= -1) {
                            class75.method443(arg8, var13, var15);
                        } else {
                            if (var19[0]) {
                                ++var51;
                            }
                            if (var19[2]) {
                                ++var51;
                            }
                            if (var19[1]) {
                                ++var51;
                            }
                            if (var19[3]) {
                                ++var51;
                            }
                            int var52 = 0;
                            int var53 = 0;
                            int var54 = var51 * 3;
                            int[] var55 = !arg5 ? null : new int[var54];
                            int[] var56 = var42 ? new int[var54] : null;
                            int[] var57 = new int[var54];
                            int[] var58 = new int[var54];
                            int[] var59 = new int[var54];
                            int[] var60 = new int[var54];
                            int[] var61 = new int[var54];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var27 != null) {
                                var62 = var27.field4787;
                                var63 = arg7.method726() ? var27.field4780 : var27.field4794;
                                var64 = var27.field4792;
                                int var65 = class119.method794(arg7, var27, arg11 ^ 120);
                                for (int var66 = 0; ~var50 < ~var66; ++var66) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var19[-var21 & 3] && var45[0] == var52) {
                                        class89.field1028[0] = var47[var52];
                                        class89.field1028[1] = 1;
                                        class89.field1028[2] = var46[var52];
                                        class89.field1028[3] = 1;
                                        class89.field1028[4] = var48[var52];
                                        var68 = 6;
                                        class89.field1028[5] = var46[var52];
                                    } else if (var19[3 & -var21 + 2] && var45[2] == var52) {
                                        class89.field1028[0] = var47[var52];
                                        class89.field1028[1] = 5;
                                        class89.field1028[2] = var46[var52];
                                        class89.field1028[3] = 5;
                                        class89.field1028[4] = var48[var52];
                                        class89.field1028[5] = var46[var52];
                                        var68 = 6;
                                    } else if (var19[3 & -var21 + 1] && ~var45[1] == ~var52) {
                                        class89.field1028[0] = var47[var52];
                                        class89.field1028[1] = 3;
                                        class89.field1028[2] = var46[var52];
                                        class89.field1028[3] = 3;
                                        class89.field1028[4] = var48[var52];
                                        var68 = 6;
                                        class89.field1028[5] = var46[var52];
                                    } else if (var19[-var21 + 3 & 3] && ~var45[3] == ~var52) {
                                        class89.field1028[0] = var47[var52];
                                        class89.field1028[1] = 7;
                                        class89.field1028[2] = var46[var52];
                                        class89.field1028[3] = 7;
                                        class89.field1028[4] = var48[var52];
                                        var68 = 6;
                                        class89.field1028[5] = var46[var52];
                                    } else {
                                        class89.field1028[0] = var47[var52];
                                        class89.field1028[1] = var48[var52];
                                        class89.field1028[2] = var46[var52];
                                        var68 = 3;
                                    }
                                    for (int var69 = 0; var68 > var69; ++var69) {
                                        int var70 = class89.field1028[var69];
                                        int var71 = 7 & -(var21 * 2) + var70;
                                        int var72 = class349.field4753[var70];
                                        int var73 = class127.field1425[var70];
                                        if (var21 == 1) {
                                            var57[var53] = var73;
                                            var58[var53] = -var72 + 128;
                                        } else if (var21 != 2) {
                                            if (~var21 == -4) {
                                                var57[var53] = -var73 + 128;
                                                var58[var53] = var72;
                                            } else {
                                                var57[var53] = var72;
                                                var58[var53] = var73;
                                            }
                                        } else {
                                            var57[var53] = 128 - var72;
                                            var58[var53] = -var73 + 128;
                                        }
                                        if (arg5 && class393.field5350[var20][var70]) {
                                            int var74 = (var13 << 7) - -var57[var53];
                                            int var75 = (var15 << 7) + var58[var53];
                                            var55[var53] = arg12.method1054(var74, var75) - arg0.method1054(var74, var75);
                                        }
                                        if (~var70 > -9 && var27.field4778 < class180.field2097[var71]) {
                                            if (var56 != null) {
                                                var56[var53] = class393.field5360[var71];
                                            }
                                            var61[var53] = class92.field1077[var71];
                                            var60[var53] = class169.field1983[var71];
                                            var59[var53] = class27.field309[var71];
                                        } else {
                                            if (var56 != null) {
                                                var56[var53] = var65;
                                            }
                                            var60[var53] = !arg7.method726() ? var27.field4794 : var27.field4780;
                                            var61[var53] = var27.field4792;
                                            var59[var53] = var62;
                                        }
                                        ++var53;
                                    }
                                    ++var52;
                                }
                                if (!arg5 && ~arg8 == -1) {
                                    class178.method1119(var13, var15, var27.field4793, var27.field4779 * 8);
                                }
                                if (~var20 != -13 && var27.field4787 != -1 && var27.field4790) {
                                    var17 = true;
                                }
                            } else if (var44) {
                                var52 += class101.field1182[var20];
                            } else if (!var18) {
                                var52 += class116.field1334[var20];
                            } else {
                                var52 += class158.field1842[var20];
                            }
                            if (var28 != null) {
                                if (~var24 == -1) {
                                    var24 = var23;
                                }
                                if (~var26 == -1) {
                                    var26 = var23;
                                }
                                if (var25 == 0) {
                                    var25 = var23;
                                }
                                class214 var76 = class75.method447(var23 + -1, (byte) 81);
                                class214 var77 = class75.method447(var24 - 1, (byte) 81);
                                class214 var78 = class75.method447(var25 + -1, (byte) 81);
                                class214 var79 = class75.method447(var26 + -1, (byte) 81);
                                for (int var80 = 0; var49 > var80; ++var80) {
                                    boolean var81 = false;
                                    byte var82;
                                    if (var19[-var21 & 3] && ~var45[0] == ~var52) {
                                        class89.field1028[0] = var47[var52];
                                        class89.field1028[1] = 1;
                                        class89.field1028[2] = var46[var52];
                                        class89.field1028[3] = 1;
                                        class89.field1028[4] = var48[var52];
                                        class89.field1028[5] = var46[var52];
                                        var82 = 6;
                                    } else if (var19[-var21 + 2 & 3] && var45[2] == var52) {
                                        class89.field1028[0] = var47[var52];
                                        class89.field1028[1] = 5;
                                        class89.field1028[2] = var46[var52];
                                        class89.field1028[3] = 5;
                                        class89.field1028[4] = var48[var52];
                                        var82 = 6;
                                        class89.field1028[5] = var46[var52];
                                    } else if (var19[-var21 + 1 & 3] && var45[1] == var52) {
                                        class89.field1028[0] = var47[var52];
                                        class89.field1028[1] = 3;
                                        class89.field1028[2] = var46[var52];
                                        class89.field1028[3] = 3;
                                        class89.field1028[4] = var48[var52];
                                        var82 = 6;
                                        class89.field1028[5] = var46[var52];
                                    } else if (var19[3 & -var21 + 3] && ~var45[3] == ~var52) {
                                        class89.field1028[0] = var47[var52];
                                        class89.field1028[1] = 7;
                                        class89.field1028[2] = var46[var52];
                                        class89.field1028[3] = 7;
                                        class89.field1028[4] = var48[var52];
                                        class89.field1028[5] = var46[var52];
                                        var82 = 6;
                                    } else {
                                        class89.field1028[0] = var47[var52];
                                        class89.field1028[1] = var48[var52];
                                        class89.field1028[2] = var46[var52];
                                        var82 = 3;
                                    }
                                    for (int var83 = 0; ~var82 < ~var83; ++var83) {
                                        int var84 = class89.field1028[var83];
                                        int var85 = 7 & -(var21 * 2) + var84;
                                        int var86 = class349.field4753[var84];
                                        int var87 = class127.field1425[var84];
                                        int var88;
                                        int var89;
                                        if (var21 == 1) {
                                            var88 = var87;
                                            var89 = -var86 + 128;
                                        } else if (~var21 == -3) {
                                            var88 = -var86 + 128;
                                            var89 = 128 - var87;
                                        } else if (var21 != 3) {
                                            var88 = var86;
                                            var89 = var87;
                                        } else {
                                            var88 = -var87 + 128;
                                            var89 = var86;
                                        }
                                        var57[var53] = var88;
                                        var58[var53] = var89;
                                        if (arg5 && class393.field5350[var20][var84]) {
                                            int var90 = (var13 << 7) + var88;
                                            int var91 = (var15 << 7) + var89;
                                            var55[var53] = arg12.method1054(var90, var91) - arg0.method1054(var90, var91);
                                        }
                                        if (~var84 > -9 && ~class180.field2097[var85] <= -1) {
                                            if (var56 != null) {
                                                var56[var53] = class393.field5360[var85];
                                            }
                                            var61[var53] = class92.field1077[var85];
                                            var60[var53] = class169.field1983[var85];
                                            var59[var53] = class27.field309[var85];
                                        } else {
                                            if (var18 && class393.field5350[var20][var84]) {
                                                var60[var53] = var63;
                                                var61[var53] = var64;
                                                var59[var53] = var62;
                                            } else if (~var88 == -1 && var89 == 0) {
                                                var59[var53] = arg3[var13][var15];
                                                var60[var53] = var76.field2648;
                                                var61[var53] = var76.field2643;
                                            } else if (~var88 == -1 && var89 == 128) {
                                                var59[var53] = arg3[var13][var16];
                                                var60[var53] = var77.field2648;
                                                var61[var53] = var77.field2643;
                                            } else if (var88 == 128 && var89 == 128) {
                                                var59[var53] = arg3[var14][var16];
                                                var60[var53] = var78.field2648;
                                                var61[var53] = var78.field2643;
                                            } else if (var88 == 128 && ~var89 == -1) {
                                                var59[var53] = arg3[var14][var15];
                                                var60[var53] = var79.field2648;
                                                var61[var53] = var79.field2643;
                                            } else {
                                                if (~var88 > -65) {
                                                    if (var89 >= 64) {
                                                        var60[var53] = var77.field2648;
                                                        var61[var53] = var77.field2643;
                                                    } else {
                                                        var60[var53] = var76.field2648;
                                                        var61[var53] = var76.field2643;
                                                    }
                                                } else if (var89 >= 64) {
                                                    var60[var53] = var78.field2648;
                                                    var61[var53] = var78.field2643;
                                                } else {
                                                    var60[var53] = var79.field2648;
                                                    var61[var53] = var79.field2643;
                                                }
                                                int var92 = class130.method829(var88 << 7 >> 7, 128, arg3[var14][var15], arg3[var13][var15]);
                                                int var93 = class130.method829(var88 << 7 >> 7, arg11 + 116, arg3[var14][var16], arg3[var13][var16]);
                                                var59[var53] = class130.method829(var89 << 7 >> 7, 128, var93, var92);
                                            }
                                            if (var56 != null) {
                                                var56[var53] = var59[var53];
                                            }
                                        }
                                        ++var53;
                                    }
                                    ++var52;
                                }
                                if (~var20 != -1 && var28.field2644) {
                                    var17 = true;
                                }
                            }
                            int var94 = arg0.method1050(var13, var15);
                            int var95 = arg0.method1050(var14, var15);
                            int var96 = arg0.method1050(var14, var16);
                            int var97 = arg0.method1050(var13, var16);
                            if (~arg8 < -1) {
                                boolean var98 = true;
                                if (var23 == 0 && ~var20 != -1) {
                                    var98 = false;
                                }
                                if (~var22 < -1 && var29 != null && !var29.field4783) {
                                    var98 = false;
                                }
                                if (var98 && ~var94 == ~var95 && var94 == var96 && var94 == var97) {
                                    class80.field972[arg8][var13][var15] = (byte) class213.method1307(class80.field972[arg8][var13][var15], 4);
                                }
                            }
                            int var99 = 0;
                            int var100 = 0;
                            if (arg5) {
                                var99 = class438.method2677(var13, var15);
                                var100 = class261.method1652(var13, var15);
                            }
                            arg0.method1058(var13, var15, var57, var55, var58, var59, var56, var60, var61, var99, var100, var17);
                            class75.method443(arg8, var13, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Luo;Lpc;IIIII)V", line = 1199)
    public static final void method1938(class118 arg0, class22 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; ++var12) {
            if (class238.field3149 != var12) {
                for (int var13 = var8; var13 <= var9; ++var13) {
                    if (var13 >= 0 && var13 < class43.field512) {
                        for (int var14 = var10; var14 <= var11; ++var14) {
                            if (var14 >= 0 && var14 < class262.field3367 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class316 var15 = class347.field4722[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (field4096[var12].method1050(var13, var14) + field4096[var12].method1050(var13 + 1, var14) + field4096[var12].method1050(var13, var14 + 1) + field4096[var12].method1050(var13 + 1, var14 + 1)) / 4 - (field4096[arg2].method1050(arg3, arg4) + field4096[arg2].method1050(arg3 + 1, arg4) + field4096[arg2].method1050(arg3, arg4 + 1) + field4096[arg2].method1050(arg3 + 1, arg4 + 1)) / 4;
                                    class226 var17 = var15.field4268;
                                    class226 var18 = var15.field4269;
                                    if (var17 != null && var17.method129(3652)) {
                                        arg1.method137(arg0, (var14 - arg4) * 128 + (1 - arg6) * 64, (var13 - arg3) * 128 + (1 - arg5) * 64, var16, var7, (byte) -125, var17);
                                    }
                                    if (var18 != null && var18.method129(3652)) {
                                        arg1.method137(arg0, (var14 - arg4) * 128 + (1 - arg6) * 64, (var13 - arg3) * 128 + (1 - arg5) * 64, var16, var7, (byte) -124, var18);
                                    }
                                    for (class272 var19 = var15.field4256; var19 != null; var19 = var19.field3514) {
                                        class133 var20 = var19.field3512;
                                        if (var20 != null && var20.method129(3652) && (var20.field1512 == var13 || var8 == var13) && (var20.field1518 == var14 || var10 == var14)) {
                                            int var21 = var20.field1510 - var20.field1512 + 1;
                                            int var22 = var20.field1517 - var20.field1518 + 1;
                                            arg1.method137(arg0, (var20.field1518 - arg4) * 128 + (var22 - arg6) * 64, (var20.field1512 - arg3) * 128 + (var21 - arg5) * 64, var16, var7, (byte) -126, var20);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var8;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IBI)V", line = 1291)
    public final void method796(int arg0, byte arg1, int arg2) {
        if (arg1 != -74) {
            this.field4097 = -51;
        }
        ++field4095;
    }
}
