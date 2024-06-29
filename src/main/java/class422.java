import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class422 extends class219 {

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Lem;")
    public class212 field5357;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field5354 = -1;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lcga;")
    public static class449 field5353 = new class449(74, 6);

    @OriginalMember(owner = "client!td", name = "i", descriptor = "Lcga;")
    public static class449 field5358 = new class449(40, -1);

    @OriginalMember(owner = "client!td", name = "j", descriptor = "[B")
    public static byte[] field5359;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5355++;
        int var7 = class149.field1788;
        int[] var8 = class95.field1239;
        class284.field3609 = 0;
        for (int var9 = 0; var9 < class99.field1276 + var7; var9++) {
            class689 var32 = null;
            class32 var33;
            if (var7 <= var9) {
                var33 = ((class704) class168.field1973.method3828((long) class352.field4562[var9 - var7], (byte) -91)).field9854;
                var32 = ((class506) var33).field6326;
                if (var32.field9546 != null) {
                    var32 = var32.method3812(class327.field4084, -128);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class132.field1601[var8[var9]];
            }
            if (var33.field476 >= 0 && (class197.field2318 == var33.field425 || class67.field815.field8010 == var33.field8010)) {
                class566.method3005(arg2, var33.method212(0), arg6, arg0 >> 1, var33, arg4 >> 1, 27313);
                if (class347.field4465[0] >= 0) {
                    if (var33.field494 != null && (var9 >= var7 || class646.field8749 == 0 || class646.field8749 == 3 || class646.field8749 == 1 && class347.method2003(((class365) var33).field4673, (byte) 22)) && class477.field5946 > class284.field3609) {
                        class477.field5947[class284.field3609] = class36.field540.method127(var33.field494, (byte) -52) / 2;
                        class477.field5954[class284.field3609] = class347.field4465[0];
                        class477.field5952[class284.field3609] = class347.field4465[1];
                        class477.field5955[class284.field3609] = var33.field461;
                        class477.field5951[class284.field3609] = var33.field453;
                        class477.field5953[class284.field3609] = var33.field485;
                        class477.field5948[class284.field3609] = var33.field494;
                        class284.field3609++;
                    }
                    int var34 = class347.field4465[1] + arg1;
                    int var45;
                    if (var33.field446 || class665.field9027 >= var33.field434) {
                        var45 = var34 - Math.max(class36.field540.field207, class240.field3111[0].method1544());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var37;
                        if (var9 >= var7) {
                            var37 = var32.field9517;
                            if (var37 == -1) {
                                var37 = var33.method209(2).field5203;
                            }
                        } else {
                            class365 var38 = class132.field1601[var8[var9]];
                            var37 = var33.method209(2).field5203;
                            if (var38.field4697) {
                                var36 = 2;
                            }
                        }
                        class468[] var39 = class240.field3111;
                        if (var37 != -1) {
                            class468[] var40 = (class468[]) class38.field565.method1221((long) var37, true);
                            if (var40 == null) {
                                class495[] var41 = class495.method2699(class136.field1656, var37, 0);
                                if (var41 != null) {
                                    var40 = new class468[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class309.field3898.method402(var41[var42], true);
                                    }
                                    class38.field565.method1230((byte) -109, (long) var37, var40);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var39.length <= var36) {
                            var36 = 1;
                        }
                        class468 var43 = var39[0];
                        class468 var44 = var39[var36];
                        var45 = var34 - Math.max(class36.field540.field207, var43.method1544());
                        int var46 = class347.field4465[0] + arg3 - (var43.method1556() >> 1);
                        int var47 = var43.method1556() * var33.field427 / 255;
                        if (var33.field427 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method2556(var46, var45);
                        class309.field3898.method451(var46, var45, var46 + var47, var43.method1544() + var45);
                        var44.method2556(var46, var45);
                        class309.field3898.method403(arg3, arg1, arg0 + arg3, arg1 + arg4);
                    }
                    var45 -= 2;
                    if (!var33.field446) {
                        if (class665.field9027 < var33.field479) {
                            class468 var48 = class216.field2533[var33.field486 ? 2 : 0];
                            class468 var49 = class216.field2533[var33.field486 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if ((var33 instanceof class506)) {
                                var51 = var32.field9551;
                                if (var51 == -1) {
                                    var51 = var33.method209(arg5 ^ 0x2).field5188;
                                }
                            } else {
                                var51 = var33.method209(2).field5188;
                            }
                            if (var51 != -1) {
                                class468[] var52 = (class468[]) class550.field6905.method1221((long) var51, true);
                                if (var52 == null) {
                                    class495[] var53 = class495.method2699(class136.field1656, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class468[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class309.field3898.method402(var53[var54], true);
                                        }
                                        class550.field6905.method1230((byte) -113, (long) var51, var52);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var49 = var52[var33.field486 ? 3 : 1];
                                    var48 = var52[var33.field486 ? 2 : 0];
                                }
                            }
                            int var55 = var33.field479 - class665.field9027;
                            int var56;
                            if (var33.field500 >= var55) {
                                var56 = var48.method1556();
                            } else {
                                int var57 = var55 - var33.field500;
                                int var58 = var33.field421 == 0 ? 0 : (var33.field459 - var57) / var33.field421 * var33.field421;
                                var56 = var48.method1556() * var58 / var33.field459;
                            }
                            int var59 = var48.method1544();
                            var45 -= var59;
                            int var60 = class347.field4465[0] + arg3 - (var48.method1556() >> 1);
                            var48.method2556(var60, var45);
                            class309.field3898.method451(var60, var45, var56 + var60, var45 + var59);
                            var49.method2556(var60, var45);
                            var45 -= 2;
                            class309.field3898.method403(arg3, arg1, arg3 + arg0, arg1 - -arg4);
                        }
                        if (var9 < var7) {
                            class365 var62 = (class365) var33;
                            if (var62.field4703 != -1) {
                                var45 -= 25;
                                class597.field8019[var62.field4703].method2556(arg3 + class347.field4465[0] - 12, var45);
                                var45 -= 2;
                            }
                            if (var62.field4672 != -1) {
                                var45 -= 25;
                                class678.field9231[var62.field4672].method2556(class347.field4465[0] + arg3 - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field9507 >= 0 && var32.field9507 < class678.field9231.length) {
                            class468 var61 = class678.field9231[var32.field9507];
                            var45 -= 25;
                            var61.method2556(arg3 - ((var61.method1556() >> 1) - class347.field4465[0]), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var33 instanceof class365)) {
                        int var63 = 0;
                        class26[] var64 = class565.field7071;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class26 var67 = var64[var65];
                            if (var67 != null && var67.field301 == 1 && class352.field4562[var9 - var7] == var67.field300) {
                                class468 var68 = class194.field2291[var67.field299];
                                if (var68.method1544() > var63) {
                                    var63 = var68.method1544();
                                }
                                if ((class665.field9027 % 20) < 10) {
                                    var68.method2556(class347.field4465[0] + arg3 - 12, -var68.method1544() + var45);
                                }
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var69 = 0;
                        class26[] var70 = class565.field7071;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class26 var73 = var70[var71];
                            if (var73 != null && var73.field301 == 10 && var8[var9] == var73.field300) {
                                class468 var74 = class194.field2291[var73.field299];
                                if (var69 < var74.method1544()) {
                                    var69 = var74.method1544();
                                }
                                var74.method2556(class347.field4465[0] + arg3 - 12, -var74.method1544() + var45);
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    }
                    for (int var75 = 0; var75 < 4; var75++) {
                        if (var33.field433[var75] > class665.field9027) {
                            int var76 = var33.method212(0) / 2;
                            class566.method3005(arg2, var76, arg6, arg0 >> 1, var33, arg4 >> 1, 27313);
                            if (class347.field4465[0] > -1) {
                                int var77 = class87.field1136[var33.field455[var75]].method1556();
                                if (var75 == 1) {
                                    class347.field4465[1] -= 20;
                                }
                                if (var75 == 2) {
                                    class347.field4465[1] -= 10;
                                    class347.field4465[0] -= var77 - 9;
                                }
                                if (var75 == 3) {
                                    class347.field4465[0] += var77 - 9;
                                    class347.field4465[1] -= 10;
                                }
                                class87.field1136[var33.field455[var75]].method2556(class347.field4465[0] + arg3 - (var77 >> 1), class347.field4465[1] + -12 + arg1);
                                class711.field9937.method1162(true, class347.field4465[0] + arg3 - 1, Integer.toString(var33.field428[var75]), -1, 0, arg1 + class347.field4465[1] + 3);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class22.field250; var10++) {
            int var28 = class396.field5035[var10];
            class32 var29;
            if (var28 < 2048) {
                var29 = class132.field1601[var28];
            } else {
                var29 = ((class704) class168.field1973.method3828((long) (var28 - 2048), (byte) -91)).field9854;
            }
            int var30 = class461.field5747[var10];
            class32 var31;
            if (var30 >= 2048) {
                var31 = ((class704) class168.field1973.method3828((long) (var30 - 2048), (byte) -91)).field9854;
            } else {
                var31 = class132.field1601[var30];
            }
            class240.method1443(var31, var29, arg2, arg6, 0, arg1, --var29.field475, arg3, arg4, arg0);
        }
        int var11 = class36.field540.field225 + class36.field540.field207 + 2;
        for (int var12 = arg5; var12 < class284.field3609; var12++) {
            int var13 = class477.field5954[var12];
            int var14 = class477.field5952[var12];
            int var15 = class477.field5947[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if (class477.field5952[var27] - var11 < var14 + 2 && (var14 - var11) < (class477.field5952[var27] + 2) && class477.field5954[var27] + class477.field5947[var27] > var13 - var15 && var13 + var15 > class477.field5954[var27] - class477.field5947[var27] && (class477.field5952[var27] - var11) < var14) {
                        var16 = true;
                        var14 = class477.field5952[var27] - var11;
                    }
                }
            }
            class477.field5952[var12] = var14;
            String var17 = class477.field5948[var12];
            if (class168.field1977 == 0) {
                int var18 = 16776960;
                if (class477.field5955[var12] < 6) {
                    var18 = class640.field8667[class477.field5955[var12]];
                }
                if (class477.field5955[var12] == 6) {
                    var18 = class197.field2318 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class477.field5955[var12] == 7) {
                    var18 = class197.field2318 % 20 < 10 ? 255 : 65535;
                }
                if (class477.field5955[var12] == 8) {
                    var18 = class197.field2318 % 20 < 10 ? 45056 : 8454016;
                }
                if (class477.field5955[var12] == 9) {
                    int var19 = 150 - class477.field5953[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16384000 - (var19 * 327680 - 16776960);
                    } else if (var19 < 150) {
                        var18 = ((var19 - 100) * 5) + 65280;
                    }
                }
                if (class477.field5955[var12] == 10) {
                    int var20 = 150 - class477.field5953[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 33095935 - (var20 * 327680);
                    } else if (var20 < 150) {
                        var18 = 255 - (-((var20 - 100) * 327680) - (500 - (var20 * 5)));
                    }
                }
                if (class477.field5955[var12] == 11) {
                    int var21 = 150 - class477.field5953[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - (var21 * 327685);
                    } else if (var21 < 100) {
                        var18 = var21 * 327685 + 65280 - 16384250;
                    } else if (var21 < 150) {
                        var18 = 32768000 + 16777215 - var21 * 327680;
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class477.field5951[var12] == 0) {
                    class336.field4143.method1162(true, arg3 + var13, var17, var22, -16777216, arg1 + var14);
                }
                if (class477.field5951[var12] == 1) {
                    class336.field4143.method1171(arg1 + var14, class197.field2318, 5, -16777216, var22, var17, arg3 + var13);
                }
                if (class477.field5951[var12] == 2) {
                    class336.field4143.method1168(class197.field2318, arg1 + var14, arg3 + var13, var17, var22, -16777216, (byte) 78);
                }
                if (class477.field5951[var12] == 3) {
                    class336.field4143.method1167(-16777216, var22, arg3 + var13, class197.field2318, 2, 150 - class477.field5953[var12], var17, arg1 + var14);
                }
                if (class477.field5951[var12] == 4) {
                    int var23 = (150 - class477.field5953[var12]) * (class36.field540.method127(var17, (byte) -123) + 100) / 150;
                    class309.field3898.method451(arg3 + var13 - 50, arg1, arg3 + var13 + 50, arg1 + arg4);
                    class336.field4143.method1165((byte) -32, arg1 + var14, var22, arg3 + var13 + 50 - var23, -16777216, var17);
                    class309.field3898.method403(arg3, arg1, arg0 + arg3, arg1 + arg4);
                }
                if (class477.field5951[var12] == 5) {
                    int var24 = 150 - class477.field5953[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class36.field540.field225 + class36.field540.field207;
                    class309.field3898.method451(arg3, arg1 + var14 - var26 - 1, arg0 + arg3, arg1 + var14 + 5);
                    class336.field4143.method1162(true, arg3 + var13, var17, var22, -16777216, arg1 - (-var14 - var25));
                    class309.field3898.method403(arg3, arg1, arg0 + arg3, arg1 + arg4);
                }
            } else {
                class336.field4143.method1162(true, arg3 + var13, var17, -256, -16777216, arg1 + var14);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public static void method2336(int arg0) {
        field5359 = null;
        if (arg0 >= -9) {
            method2336(42);
        }
        field5353 = null;
        field5358 = null;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
    public static final void method2337(int arg0) {
        class71.field914.method799((byte) -117);
        field5356++;
        if (arg0 != -28508) {
            return;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class571.field7239[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class11.field102[var2] = 0L;
        }
        class386.field4952 = 0;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lkea;II[B)V")
    public class422(class223 arg0, int arg1, int arg2, byte[] arg3) {
        this.field5357 = arg0.method1286(arg2, arg3, (byte) 125, false, class190.field2256, arg1);
        this.field5357.method40(false, false, 7220);
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lkea;II[I)V")
    public class422(class223 arg0, int arg1, int arg2, int[] arg3) {
        this.field5357 = arg0.method1295((byte) -124, arg1, arg3, arg2, false);
        this.field5357.method40(false, false, 7220);
    }

    static {
        int var0 = 0;
        field5359 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field5359[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
