import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class239 {

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    private int field3894;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "[[I")
    private int[][] field3891;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    private int field3892;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "[Z")
    public static boolean[] field3897;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "([BI)[B")
    public final byte[] method1671(byte[] arg0, int arg1) {
        if (arg1 != -19152) {
            method1676(-32, 17);
        }
        field3893++;
        if (this.field3891 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field3892 / (long) this.field3894) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field3891[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3892 + var6;
                int var14 = var13 / this.field3894;
                var6 = var13 - this.field3894 * var14;
                var5 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
    public static void method1672(byte arg0) {
        if (arg0 == 59) {
            field3897 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BI)I")
    public final int method1673(byte arg0, int arg1) {
        if (arg0 != 79) {
            this.field3894 = -110;
        }
        if (this.field3891 != null) {
            arg1 = (int) ((long) this.field3892 * (long) arg1 / (long) this.field3894);
        }
        field3898++;
        return arg1;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)I")
    public final int method1674(int arg0, int arg1) {
        if (arg1 != 0) {
            field3897 = null;
        }
        if (this.field3891 != null) {
            arg0 = (int) ((long) this.field3892 * (long) arg0 / (long) this.field3894) + 6;
        }
        field3895++;
        return arg0;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3896++;
        if (arg3 != 16776960) {
            field3897 = null;
        }
        int var7 = class234.field3861;
        class399.field6024 = 0;
        int[] var8 = class21.field245;
        for (int var9 = 0; var9 < class378.field5815 + var7; var9++) {
            class191 var32 = null;
            class55 var33;
            if (var9 < var7) {
                var33 = class264.field4276[var8[var9]];
            } else {
                var33 = ((class38) class365.field5659.method1122((byte) 59, (long) class81.field1198[var9 - var7])).field378;
                var32 = ((class378) var33).field5809;
                if (var32.field2798 != null) {
                    var32 = var32.method1190(-1, class96.field1394);
                    if (var32 == null) {
                        continue;
                    }
                }
            }
            if (var33.field881 >= 0 && (class479.field7323 == var33.field877 || class358.field5565.field6419 == var33.field6419)) {
                class202.method1379(arg6, var33, arg5, arg1 >> 1, var33.method425(0), (byte) -109, arg0 >> 1);
                if (class229.field3812[0] >= 0) {
                    if (var33.field873 != null && (var7 <= var9 || class435.field6566 == 0 || class435.field6566 == 3 || class435.field6566 == 1 && class233.method1656(((class350) var33).field5443, (byte) 93)) && class399.field6024 < class476.field7294) {
                        class476.field7290[class399.field6024] = class306.field4807.method2252(var33.field873, 0) / 2;
                        class476.field7297[class399.field6024] = class229.field3812[0];
                        class476.field7291[class399.field6024] = class229.field3812[1];
                        class476.field7298[class399.field6024] = var33.field879;
                        class476.field7296[class399.field6024] = var33.field848;
                        class476.field7292[class399.field6024] = var33.field833;
                        class476.field7293[class399.field6024] = var33.field873;
                        class399.field6024++;
                    }
                    int var34 = class229.field3812[1] + arg4;
                    int var45;
                    if (var33.field816 || var33.field871 <= class88.field1278) {
                        var45 = var34 - Math.max(class306.field4807.field5304, class263.field4258[0].method622());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (var7 > var9) {
                            class350 var37 = class264.field4276[var8[var9]];
                            var38 = var33.method418((byte) -41).field4564;
                            if (var37.field5425) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field2801;
                            if (var38 == -1) {
                                var38 = var33.method418((byte) -41).field4564;
                            }
                        }
                        class139[] var39 = class263.field4258;
                        if (var38 != -1) {
                            class139[] var40 = (class139[]) class121.field1653.method2191((byte) -73, (long) var38);
                            if (var40 == null) {
                                class175[] var41 = class175.method1110(class120.field1646, var38, 0);
                                if (var41 != null) {
                                    var40 = new class139[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class19.field198.method1278(var41[var42], true);
                                    }
                                    class121.field1653.method2188(-122, (long) var38, var40);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var39.length <= var36) {
                            var36 = 1;
                        }
                        class139 var43 = var39[0];
                        class139 var44 = var39[var36];
                        var45 = var34 - Math.max(class306.field4807.field5304, var43.method622());
                        int var46 = class229.field3812[0] + arg2 - (var43.method626() >> 1);
                        int var47 = var43.method626() * var33.field865 / 255;
                        if (var33.field865 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method852(var46, var45);
                        class19.field198.method1290(var46, var45, var46 + var47, var43.method622() + var45);
                        var44.method852(var46, var45);
                        class19.field198.method1307(arg2, arg4, arg2 + arg1, arg0 + arg4);
                    }
                    var45 -= 2;
                    if (!var33.field816) {
                        if (class88.field1278 < var33.field856) {
                            class139 var48 = class171.field2493[var33.field830 ? 2 : 0];
                            class139 var49 = class171.field2493[var33.field830 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class378) {
                                var51 = var32.field2785;
                                if (var51 == -1) {
                                    var51 = var33.method418((byte) -41).field4541;
                                }
                            } else {
                                var51 = var33.method418((byte) -41).field4541;
                            }
                            if (var51 != -1) {
                                class139[] var52 = (class139[]) class122.field1660.method2191((byte) -73, (long) var51);
                                if (var52 == null) {
                                    class175[] var53 = class175.method1110(class120.field1646, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class139[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class19.field198.method1278(var53[var54], true);
                                        }
                                        class122.field1660.method2188(arg3 - 16777084, (long) var51, var52);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var48 = var52[var33.field830 ? 2 : 0];
                                    var49 = var52[var33.field830 ? 3 : 1];
                                }
                            }
                            int var55 = var33.field856 - class88.field1278;
                            int var58;
                            if (var33.field820 < var55) {
                                int var56 = var55 - var33.field820;
                                int var57 = var33.field878 == 0 ? 0 : (var33.field797 - var56) / var33.field878 * var33.field878;
                                var58 = var57 * var48.method626() / var33.field797;
                            } else {
                                var58 = var48.method626();
                            }
                            int var59 = var48.method622();
                            var45 -= var59;
                            int var60 = arg2 - ((var48.method626() >> 1) - class229.field3812[0]);
                            var48.method852(var60, var45);
                            class19.field198.method1290(var60, var45, var58 + var60, var45 + var59);
                            var49.method852(var60, var45);
                            class19.field198.method1307(arg2, arg4, arg2 + arg1, arg0 + arg4);
                            var45 -= 2;
                        }
                        if (var9 < var7) {
                            class350 var61 = (class350) var33;
                            if (var61.field5431 != -1) {
                                var45 -= 25;
                                class500.field7506[var61.field5431].method852(arg2 + class229.field3812[0] - 12, var45);
                                var45 -= 2;
                            }
                            if (var61.field5426 != -1) {
                                var45 -= 25;
                                class491.field7436[var61.field5426].method852(arg2 + class229.field3812[0] - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field2786 >= 0 && class491.field7436.length > var32.field2786) {
                            var45 -= 25;
                            class139 var62 = class491.field7436[var32.field2786];
                            var62.method852(arg2 - ((var62.method626() >> 1) - class229.field3812[0]), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!var33 instanceof class350) {
                        int var69 = 0;
                        class402[] var70 = class323.field5076;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class402 var76 = var70[var71];
                            if (var76 != null && var76.field6058 == 1 && class81.field1198[var9 - var7] == var76.field6053) {
                                class139 var77 = class247.field4025[var76.field6049];
                                if (var77.method622() > var69) {
                                    var69 = var77.method622();
                                }
                                if (class88.field1278 % 20 < 10) {
                                    var77.method852(arg2 + class229.field3812[0] - 12, -var77.method622() + var45);
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var63 = 0;
                        class402[] var64 = class323.field5076;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class402 var67 = var64[var65];
                            if (var67 != null && var67.field6058 == 10 && var8[var9] == var67.field6053) {
                                class139 var68 = class247.field4025[var67.field6049];
                                if (var68.method622() > var63) {
                                    var63 = var68.method622();
                                }
                                var68.method852(class229.field3812[0] + arg2 - 12, -var68.method622() + var45);
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; var73++) {
                        if (class88.field1278 < var33.field855[var73]) {
                            int var74 = var33.method425(0) / 2;
                            class202.method1379(arg6, var33, arg5, arg1 >> 1, var74, (byte) -111, arg0 >> 1);
                            if (class229.field3812[0] > -1) {
                                int var75 = class279.field4413[var33.field806[var73]].method626();
                                if (var73 == 1) {
                                    class229.field3812[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class229.field3812[1] -= 10;
                                    class229.field3812[0] -= var75 - 9;
                                }
                                if (var73 == 3) {
                                    class229.field3812[0] += var75 - 9;
                                    class229.field3812[1] -= 10;
                                }
                                class279.field4413[var33.field806[var73]].method852(class229.field3812[0] + arg2 - (var75 >> 1), class229.field3812[1] + arg4 + -12);
                                class315.field4923.method2006(Integer.toString(var33.field854[var73]), class229.field3812[0] + arg2 - 1, class229.field3812[1] + 3 + arg4, -1, true, 0);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class153.field2047; var10++) {
            int var28 = class329.field5179[var10];
            class55 var29;
            if (var28 >= 2048) {
                var29 = ((class38) class365.field5659.method1122((byte) 59, (long) (var28 - 2048))).field378;
            } else {
                var29 = class264.field4276[var28];
            }
            int var30 = class84.field1229[var10];
            class55 var31;
            if (var30 < 2048) {
                var31 = class264.field4276[var30];
            } else {
                var31 = ((class38) class365.field5659.method1122((byte) 59, (long) (var30 - 2048))).field378;
            }
            class332.method2211(arg5, arg0, arg6, var31, arg4, var29, arg3 - 16776833, arg2, --var29.field810, arg1);
        }
        int var11 = class306.field4807.field5304 + class306.field4807.field5295 + 2;
        for (int var12 = 0; var12 < class399.field6024; var12++) {
            int var13 = class476.field7297[var12];
            int var14 = class476.field7291[var12];
            int var15 = class476.field7290[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if ((class476.field7291[var27] - var11) < (var14 + 2) && (class476.field7291[var27] + 2) > (var14 - var11) && class476.field7297[var27] + class476.field7290[var27] > -var15 + var13 && class476.field7297[var27] - class476.field7290[var27] < var13 + var15 && class476.field7291[var27] - var11 < var14) {
                        var14 = class476.field7291[var27] - var11;
                        var16 = true;
                    }
                }
            }
            class476.field7291[var12] = var14;
            String var17 = class476.field7293[var12];
            if (class77.field1142 == 0) {
                int var18 = 16776960;
                if (class476.field7298[var12] < 6) {
                    var18 = class168.field2453[class476.field7298[var12]];
                }
                if (class476.field7298[var12] == 6) {
                    var18 = (class479.field7323 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class476.field7298[var12] == 7) {
                    var18 = (class479.field7323 % 20) >= 10 ? 65535 : 255;
                }
                if (class476.field7298[var12] == 8) {
                    var18 = class479.field7323 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class476.field7298[var12] == 9) {
                    int var19 = 150 - class476.field7292[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16384000 + 16776960 - var19 * 327680;
                    } else if (var19 < 150) {
                        var18 = var19 * 5 + 65280 - 500;
                    }
                }
                if (class476.field7298[var12] == 10) {
                    int var20 = 150 - class476.field7292[var12];
                    if (var20 < 50) {
                        var18 = (var20 * 5) + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - ((var20 - 50) * 327680);
                    } else if (var20 < 150) {
                        var18 = var20 * 327680 + 255 + 500 - (var20 * 5) - 32768000;
                    }
                }
                if (class476.field7298[var12] == 11) {
                    int var21 = 150 - class476.field7292[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 * 327685) - 16318970;
                    } else if (var21 < 150) {
                        var18 = 16777215 - ((var21 - 100) * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class476.field7296[var12] == 0) {
                    class289.field4571.method2006(var17, arg2 + var13, arg4 - -var14, var22, true, -16777216);
                }
                if (class476.field7296[var12] == 1) {
                    class289.field4571.method2007(arg4 + var14, var22, true, class479.field7323, arg2 + var13, -16777216, var17);
                }
                if (class476.field7296[var12] == 2) {
                    class289.field4571.method2000(arg4 + var14, var17, class479.field7323, -16777216, var22, true, arg2 + var13);
                }
                if (class476.field7296[var12] == 3) {
                    class289.field4571.method2020(-16777216, var17, -57, 150 - class476.field7292[var12], var22, arg4 + var14, arg2 + var13, class479.field7323);
                }
                if (class476.field7296[var12] == 4) {
                    int var23 = (150 - class476.field7292[var12]) * (class306.field4807.method2252(var17, 0) + 100) / 150;
                    class19.field198.method1290(arg2 + var13 - 50, arg4, arg2 + var13 + 50, arg4 - -arg0);
                    class289.field4571.method2009(var22, -16777216, var17, arg2 + var13 + 50 - var23, false, arg4 + var14);
                    class19.field198.method1307(arg2, arg4, arg1 + arg2, arg4 - -arg0);
                }
                if (class476.field7296[var12] == 5) {
                    int var24 = 150 - class476.field7292[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class306.field4807.field5304 + class306.field4807.field5295;
                    class19.field198.method1290(arg2, arg4 + var14 - var26 - 1, arg1 + arg2, arg4 + var14 + 5);
                    class289.field4571.method2006(var17, arg2 + var13, arg4 + var25 - -var14, var22, true, -16777216);
                    class19.field198.method1307(arg2, arg4, arg1 + arg2, arg0 + arg4);
                }
            } else {
                class289.field4571.method2006(var17, arg2 + var13, arg4 + var14, -256, true, -16777216);
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(II)V")
    public class239(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class33.method209(arg0, arg1, 9759);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field3894 = var4;
            this.field3891 = new int[var4][14];
            this.field3892 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field3891[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(II)I")
    public static final int method1676(int arg0, int arg1) {
        field3890++;
        if (arg0 < 56) {
            field3897 = null;
        }
        return arg1 >>> 8;
    }
}
