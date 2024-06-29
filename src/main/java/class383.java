import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class383 {

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "[I")
    public static int[] field5371 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "Lvfa;")
    public static class616 field5370;

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field5369;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public static final void method2207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5366++;
        if (arg5 != 23604) {
            field5370 = null;
        }
        int var7 = class64.field851;
        int[] var8 = class53.field759;
        class168.field2540 = 0;
        for (int var9 = 0; var9 < (class602.field8365 + var7); var9++) {
            class161 var32 = null;
            class457 var33;
            if (var7 <= var9) {
                var33 = ((class178) class323.field4762.method2061(-17305, (long) class594.field8262[var9 - var7])).field2634;
                var32 = ((class225) var33).field3245;
                if (var32.field2409 != null) {
                    var32 = var32.method1114(class195.field2888, 0);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class495.field6821[var8[var9]];
            }
            if (var33.field6415 >= 0 && (class460.field6516 == var33.field6430 || class253.field3576.field520 == var33.field520)) {
                class631.method3507(var33, arg4, arg0 >> 1, arg6 >> 1, 0, arg1, var33.method1433(false));
                if (class399.field5548[0] >= 0) {
                    if (var33.field6405 != null && (var7 <= var9 || class577.field7760 == 0 || class577.field7760 == 3 || class577.field7760 == 1 && class396.method2255(((class286) var33).field3975, (byte) -111)) && class525.field7188 > class168.field2540) {
                        class525.field7187[class168.field2540] = class432.field6119.method3314(var33.field6405, class602.method3336(arg5, 23623)) / 2;
                        class525.field7185[class168.field2540] = class399.field5548[0];
                        class525.field7198[class168.field2540] = class399.field5548[1];
                        class525.field7192[class168.field2540] = var33.field6433;
                        class525.field7191[class168.field2540] = var33.field6425;
                        class525.field7195[class168.field2540] = var33.field6473;
                        class525.field7194[class168.field2540] = var33.field6405;
                        class168.field2540++;
                    }
                    int var34 = arg3 + class399.field5548[1];
                    int var45;
                    if (var33.field6461 || var33.field6466 <= class239.field3440) {
                        var45 = var34 - Math.max(class432.field6119.field8307, class244.field3482[0].method26());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var37;
                        if (var9 >= var7) {
                            var37 = var32.field2413;
                            if (var37 == -1) {
                                var37 = var33.method2636((byte) 120).field4587;
                            }
                        } else {
                            class286 var38 = class495.field6821[var8[var9]];
                            var37 = var33.method2636((byte) 102).field4587;
                            if (var38.field3983) {
                                var36 = 2;
                            }
                        }
                        class461[] var39 = class244.field3482;
                        if (var37 != -1) {
                            class461[] var40 = (class461[]) class99.field1355.method1986((byte) -108, (long) var37);
                            if (var40 == null) {
                                class543[] var41 = class543.method2982(class460.field6517, var37, 0);
                                if (var41 != null) {
                                    var40 = new class461[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class630.field8790.method412(var41[var42], true);
                                    }
                                    class99.field1355.method1985(var40, (long) var37, (byte) -102);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var39.length <= var36) {
                            var36 = 1;
                        }
                        class461 var43 = var39[0];
                        class461 var44 = var39[var36];
                        var45 = var34 - Math.max(class432.field6119.field8307, var43.method26());
                        int var46 = class399.field5548[0] + arg2 - (var43.method31() >> 1);
                        int var47 = var43.method31() * var33.field6407 / 255;
                        if (var33.field6407 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method2660(var46, var45);
                        class630.field8790.method433(var46, var45, var46 + var47, var45 + var43.method26());
                        var44.method2660(var46, var45);
                        class630.field8790.method442(arg2, arg3, arg2 + arg0, arg3 + arg6);
                    }
                    var45 -= 2;
                    if (!var33.field6461) {
                        if (var33.field6436 > class239.field3440) {
                            class461 var48 = class381.field5358[var33.field6414 ? 2 : 0];
                            class461 var49 = class381.field5358[var33.field6414 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class225) {
                                var51 = var32.field2446;
                                if (var51 == -1) {
                                    var51 = var33.method2636((byte) 69).field4600;
                                }
                            } else {
                                var51 = var33.method2636((byte) 93).field4600;
                            }
                            if (var51 != -1) {
                                class461[] var52 = (class461[]) class99.field1351.method1986((byte) -96, (long) var51);
                                if (var52 == null) {
                                    class543[] var53 = class543.method2982(class460.field6517, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class461[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class630.field8790.method412(var53[var54], true);
                                        }
                                        class99.field1351.method1985(var52, (long) var51, (byte) -102);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var48 = var52[var33.field6414 ? 2 : 0];
                                    var49 = var52[var33.field6414 ? 3 : 1];
                                }
                            }
                            int var55 = var33.field6436 - class239.field3440;
                            int var58;
                            if (var55 > var33.field6384) {
                                int var56 = var55 - var33.field6384;
                                int var57 = var33.field6406 == 0 ? 0 : (var33.field6420 - var56) / var33.field6406 * var33.field6406;
                                var58 = var57 * var48.method31() / var33.field6420;
                            } else {
                                var58 = var48.method31();
                            }
                            int var59 = var48.method26();
                            var45 -= var59;
                            int var60 = class399.field5548[0] + arg2 - (var48.method31() >> 1);
                            var48.method2660(var60, var45);
                            class630.field8790.method433(var60, var45, var58 + var60, var45 - -var59);
                            var49.method2660(var60, var45);
                            class630.field8790.method442(arg2, arg3, arg0 + arg2, arg3 + arg6);
                            var45 -= 2;
                        }
                        if (var7 > var9) {
                            class286 var62 = (class286) var33;
                            if (var62.field3977 != -1) {
                                var45 -= 25;
                                class650.field9206[var62.field3977].method2660(arg2 + class399.field5548[0] - 12, var45);
                                var45 -= 2;
                            }
                            if (var62.field3964 != -1) {
                                var45 -= 25;
                                class72.field985[var62.field3964].method2660(arg2 + class399.field5548[0] - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field2479 >= 0 && var32.field2479 < class72.field985.length) {
                            class461 var61 = class72.field985[var32.field2479];
                            var45 -= 25;
                            var61.method2660(class399.field5548[0] + arg2 - (var61.method31() >> 1), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!var33 instanceof class286) {
                        int var69 = 0;
                        class375[] var70 = class652.field9219;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class375 var76 = var70[var71];
                            if (var76 != null && var76.field5317 == 1 && class594.field8262[var9 - var7] == var76.field5314) {
                                class461 var77 = class36.field452[var76.field5316];
                                if (var69 < var77.method26()) {
                                    var69 = var77.method26();
                                }
                                if (class239.field3440 % 20 < 10) {
                                    var77.method2660(arg2 + class399.field5548[0] - 12, -var77.method26() + var45);
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var63 = 0;
                        class375[] var64 = class652.field9219;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class375 var67 = var64[var65];
                            if (var67 != null && var67.field5317 == 10 && var8[var9] == var67.field5314) {
                                class461 var68 = class36.field452[var67.field5316];
                                if (var68.method26() > var63) {
                                    var63 = var68.method26();
                                }
                                var68.method2660(class399.field5548[0] + arg2 - 12, var45 - var68.method26());
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; var73++) {
                        if (var33.field6397[var73] > class239.field3440) {
                            int var74 = var33.method1433(false) / 2;
                            class631.method3507(var33, arg4, arg0 >> 1, arg6 >> 1, 0, arg1, var74);
                            if (class399.field5548[0] > -1) {
                                int var75 = class694.field9755[var33.field6379[var73]].method31();
                                if (var73 == 1) {
                                    class399.field5548[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class399.field5548[1] -= 10;
                                    class399.field5548[0] -= var75 - 9;
                                }
                                if (var73 == 3) {
                                    class399.field5548[0] += var75 - 9;
                                    class399.field5548[1] -= 10;
                                }
                                class694.field9755[var33.field6379[var73]].method2660(class399.field5548[0] + arg2 - (var75 >> 1), class399.field5548[1] + arg3 + -12);
                                class229.field3276.method1305(-1, arg3 + class399.field5548[1] + 3, Integer.toString(var33.field6421[var73]), true, class399.field5548[0] + arg2 - 1, 0);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class26.field336; var10++) {
            int var28 = class52.field749[var10];
            class457 var29;
            if (var28 < 2048) {
                var29 = class495.field6821[var28];
            } else {
                var29 = ((class178) class323.field4762.method2061(-17305, (long) (var28 - 2048))).field2634;
            }
            int var30 = class551.field7456[var10];
            class457 var31;
            if (var30 < 2048) {
                var31 = class495.field6821[var30];
            } else {
                var31 = ((class178) class323.field4762.method2061(arg5 ^ 0xFFFFE053, (long) (var30 - 2048))).field2634;
            }
            class657.method3644(arg4, arg1, arg6, var31, --var29.field6401, arg2, var29, arg3, -109, arg0);
        }
        int var11 = class432.field6119.field8307 + class432.field6119.field8301 + 2;
        for (int var12 = 0; var12 < class168.field2540; var12++) {
            int var13 = class525.field7185[var12];
            int var14 = class525.field7198[var12];
            int var15 = class525.field7187[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if ((class525.field7198[var27] - var11) < (var14 + 2) && class525.field7198[var27] + 2 > -var11 + var14 && class525.field7187[var27] + class525.field7185[var27] > var13 - var15 && class525.field7185[var27] - class525.field7187[var27] < var13 - -var15 && var14 > (class525.field7198[var27] - var11)) {
                        var14 = class525.field7198[var27] - var11;
                        var16 = true;
                    }
                }
            }
            class525.field7198[var12] = var14;
            String var17 = class525.field7194[var12];
            if (class475.field6642 == 0) {
                int var18 = 16776960;
                if (class525.field7192[var12] < 6) {
                    var18 = class437.field6164[class525.field7192[var12]];
                }
                if (class525.field7192[var12] == 6) {
                    var18 = (class460.field6516 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class525.field7192[var12] == 7) {
                    var18 = (class460.field6516 % 20) < 10 ? 255 : 65535;
                }
                if (class525.field7192[var12] == 8) {
                    var18 = class460.field6516 % 20 < 10 ? 45056 : 8454016;
                }
                if (class525.field7192[var12] == 9) {
                    int var19 = 150 - class525.field7195[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 33160960 - (var19 * 327680);
                    } else if (var19 < 150) {
                        var18 = var19 * 5 + 65280 - 500;
                    }
                }
                if (class525.field7192[var12] == 10) {
                    int var20 = 150 - class525.field7195[var12];
                    if (var20 < 50) {
                        var18 = (var20 * 5) + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 * 327680) + 255 - (var20 - 100) * 5 - 32768000;
                    }
                }
                if (class525.field7192[var12] == 11) {
                    int var21 = 150 - class525.field7195[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - (var21 * 327685);
                    } else if (var21 < 100) {
                        var18 = var21 * 327685 + 65280 - 16384250;
                    } else if (var21 < 150) {
                        var18 = 32768000 + 16777215 - (var21 * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class525.field7191[var12] == 0) {
                    class548.field7419.method1305(var22, arg3 + var14, var17, true, arg2 + var13, -16777216);
                }
                if (class525.field7191[var12] == 1) {
                    class548.field7419.method1304(arg2 + var13, arg5 + -23605, var17, var22, arg3 + var14, class460.field6516, -16777216);
                }
                if (class525.field7191[var12] == 2) {
                    class548.field7419.method1309(var22, -16777216, class460.field6516, arg3 + var14, (byte) 124, var17, arg2 + var13);
                }
                if (class525.field7191[var12] == 3) {
                    class548.field7419.method1316(150 - class525.field7195[var12], arg2 + var13, class460.field6516, arg3 + var14, var22, -16777216, var17, 0);
                }
                if (class525.field7191[var12] == 4) {
                    int var23 = (150 - class525.field7195[var12]) * (class432.field6119.method3314(var17, 105) + 100) / 150;
                    class630.field8790.method433(arg2 + var13 - 50, arg3, arg2 - (-var13 - 50), arg3 + arg6);
                    class548.field7419.method1307(arg3 + var14, (byte) 126, -16777216, var22, var17, var13 + arg2 + 50 - var23);
                    class630.field8790.method442(arg2, arg3, arg0 + arg2, arg3 + arg6);
                }
                if (class525.field7191[var12] == 5) {
                    int var24 = 150 - class525.field7195[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class432.field6119.field8307 + class432.field6119.field8301;
                    class630.field8790.method433(arg2, arg3 + var14 - var26 - 1, arg0 + arg2, arg3 + var14 + 5);
                    class548.field7419.method1305(var22, arg3 + var14 + var25, var17, true, arg2 + var13, -16777216);
                    class630.field8790.method442(arg2, arg3, arg0 + arg2, arg3 - -arg6);
                }
            } else {
                class548.field7419.method1305(-256, arg3 + var14, var17, true, arg2 + var13, -16777216);
            }
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)V", line = 589)
    public static final void method2208(int arg0, int arg1) {
        class271 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class136 var4 = class31.field369[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class22.field308; var5++) {
                    for (int var6 = 0; var6 < class137.field1931; var6++) {
                        var2 = var4.method281(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class627.field8753;
                            int var8 = var5 << class627.field8753;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class136 var10 = class31.field369[var9];
                                if (var10 != null) {
                                    int var11 = var4.method273(var6, var5) - var10.method273(var6, var5);
                                    int var12 = var4.method273(var6 + 1, var5) - var10.method273(var6 + 1, var5);
                                    int var13 = var4.method273(var6 + 1, var5 + 1) - var10.method273(var6 + 1, var5 + 1);
                                    int var14 = var4.method273(var6, var5 + 1) - var10.method273(var6, var5 + 1);
                                    var10.method277(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V", line = 653)
    public static void method2209(byte arg0) {
        field5371 = null;
        field5370 = null;
        if (arg0 <= 56) {
            field5370 = null;
        }
        field5369 = null;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZILpj;I)Lhn;", line = 671)
    public static final class661 method2210(boolean arg0, int arg1, class132 arg2, int arg3) {
        field5367++;
        byte[] var4 = arg2.method940(arg3, arg1, 0);
        if (var4 == null) {
            return null;
        } else {
            if (arg0) {
                method2208(-42, 13);
            }
            return new class661(var4);
        }
    }
}
