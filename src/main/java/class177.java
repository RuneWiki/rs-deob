import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class177 {

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "Liq;")
    public static class362 field2407;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field2406;

    static {
        new class362("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field2405 = 0;
        field2407 = new class362("K", "T", "K", "K");
        new class362("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIIII)V", line = 10)
    public static final void method1199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2406++;
        class182.field2484 = 0;
        for (int var7 = -1; var7 < class305.field4287 + class102.field1250; var7++) {
            class135 var31 = null;
            class396 var32;
            if (var7 < 0) {
                var32 = class384.field5422;
            } else if (class305.field4287 > var7) {
                var32 = class26.field314[class94.field1135[var7]];
            } else {
                var32 = class167.field2335[class86.field981[var7 - class305.field4287]];
                var31 = ((class77) var32).field912;
                if (var31.field1655 != null) {
                    var31 = var31.method836((byte) -21);
                    if (var31 == null) {
                        continue;
                    }
                }
            }
            if (var32.field5622 >= 0) {
                class291.method1931(var32.method426((byte) -83), (byte) 20, arg5 >> 1, var32, arg4, arg1 >> 1, arg3);
                if (class207.field2955[0] >= 0) {
                    if (var32.field5599 != null && (class305.field4287 <= var7 || class134.field1619 == 0 || class134.field1619 == 3 || class134.field1619 == 1 && class163.method1091(0, ((class40) var32).field487)) && class207.field2954 > class182.field2484) {
                        class207.field2943[class182.field2484] = class371.field5232.method2264(var32.field5599, 6) / 2;
                        class207.field2950[class182.field2484] = class207.field2955[0];
                        class207.field2938[class182.field2484] = class207.field2955[1];
                        class207.field2948[class182.field2484] = var32.field5635;
                        class207.field2946[class182.field2484] = var32.field5647;
                        class207.field2941[class182.field2484] = var32.field5633;
                        class207.field2945[class182.field2484] = var32.field5599;
                        class182.field2484++;
                    }
                    class381 var33 = class100.field1215[0];
                    int var34 = class207.field2955[1] + arg2 - Math.max(class371.field5232.field4990, var33.method759());
                    if (!var32.field5581 && class189.field2726 < var32.field5586) {
                        class381 var35 = class100.field1215[1];
                        if (var32 instanceof class77) {
                            class77 var36 = (class77) var32;
                            class381[] var37 = (class381[]) class28.field349.method1625((long) var36.field912.field1668, 0);
                            if (var37 == null) {
                                class375[] var38 = class375.method2401(class298.field4178, var36.field912.field1668, 0);
                                if (var38 != null) {
                                    var37 = new class381[var38.length];
                                    for (int var39 = 0; var39 < var38.length; var39++) {
                                        var37[var39] = class151.field1873.method596(var38[var39], true);
                                    }
                                    class28.field349.method1622((byte) 13, var37, (long) var36.field912.field1668);
                                }
                            }
                            if (var37 != null && var37.length == 2) {
                                var35 = var37[1];
                                var33 = var37[0];
                            }
                        }
                        int var40 = arg0 + class207.field2955[0] - (var33.method765() >> 1);
                        var33.method2446(var40, var34);
                        int var41 = var33.method765() * var32.field5626 / 255;
                        if (var32.field5626 > 0 && var41 < 2) {
                            var41 = 2;
                        }
                        class151.field1873.method679(var40, var34, var40 + var41, var33.method759() + var34);
                        var35.method2446(var40, var34);
                        class151.field1873.method660(arg0, arg2, arg0 + arg1, arg2 + arg5);
                    }
                    var34 -= 2;
                    if (!var32.field5581) {
                        if (var32.field5603 > class189.field2726) {
                            class381 var42 = class18.field215[var32.field5575 ? 2 : 0];
                            class381 var43 = class18.field215[var32.field5575 ? 3 : 1];
                            boolean var44 = true;
                            int var45;
                            if ((var32 instanceof class77)) {
                                var45 = var31.field1699;
                                if (var45 == -1) {
                                    var45 = var32.method2526(4).field4332;
                                }
                            } else {
                                var45 = var32.method2526(4).field4332;
                            }
                            if (var45 != -1) {
                                class381[] var46 = (class381[]) class36.field413.method1625((long) var45, 0);
                                if (var46 == null) {
                                    class375[] var47 = class375.method2401(class298.field4178, var45, 0);
                                    if (var47 != null) {
                                        var46 = new class381[var47.length];
                                        for (int var48 = 0; var48 < var47.length; var48++) {
                                            var46[var48] = class151.field1873.method596(var47[var48], true);
                                        }
                                        class36.field413.method1622((byte) 13, var46, (long) var45);
                                    }
                                }
                                if (var46 != null && var46.length == 4) {
                                    var43 = var46[var32.field5575 ? 3 : 1];
                                    var42 = var46[var32.field5575 ? 2 : 0];
                                }
                            }
                            int var49 = var32.field5603 - class189.field2726;
                            int var50;
                            if (var49 <= var32.field5627) {
                                var50 = var42.method765();
                            } else {
                                int var51 = var49 - var32.field5627;
                                int var52 = var32.field5652 == 0 ? 0 : (var32.field5600 - var51) / var32.field5652 * var32.field5652;
                                var50 = var42.method765() * var52 / var32.field5600;
                            }
                            int var53 = var42.method759();
                            var34 -= var53;
                            int var54 = arg0 + class207.field2955[0] - (var42.method765() >> 1);
                            var42.method2446(var54, var34);
                            class151.field1873.method679(var54, var34, var50 + var54, var34 + var53);
                            var43.method2446(var54, var34);
                            class151.field1873.method660(arg0, arg2, arg0 + arg1, arg2 + arg5);
                            var34 -= 2;
                        }
                        if (class305.field4287 > var7) {
                            class40 var56 = (class40) var32;
                            if (var56.field451 != -1) {
                                var34 -= 25;
                                class405.field5851[var56.field451].method2446(class207.field2955[0] + arg0 - 12, var34);
                                var34 -= 2;
                            }
                            if (var56.field450 != -1) {
                                var34 -= 25;
                                class362.field5167[var56.field450].method2446(class207.field2955[0] + arg0 - 12, var34);
                                var34 -= 2;
                            }
                        } else if (var31.field1631 >= 0 && class362.field5167.length > var31.field1631) {
                            var34 -= 25;
                            class381 var55 = class362.field5167[var31.field1631];
                            var55.method2446(arg0 - ((var55.method765() >> 1) - class207.field2955[0]), var34);
                            var34 -= 2;
                        }
                    }
                    int var10000;
                    if (!var32 instanceof class40) {
                        int var63 = 0;
                        class219[] var64 = class360.field5138;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class219 var69 = var64[var65];
                            if (var69 != null && var69.field3092 == 1 && class86.field981[var7 - class305.field4287] == var69.field3085) {
                                class381 var70 = class46.field550[var69.field3081];
                                if (var63 < var70.method759()) {
                                    var63 = var70.method759();
                                }
                                if (class189.field2726 % 20 < 10) {
                                    var70.method2446(class207.field2955[0] + arg0 - 12, var34 + -var70.method759());
                                }
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var34 - (var63 + 2);
                        }
                    } else if (var7 >= 0) {
                        int var57 = 0;
                        class219[] var58 = class360.field5138;
                        for (int var59 = 0; var59 < var58.length; var59++) {
                            class219 var61 = var58[var59];
                            if (var61 != null && var61.field3092 == 10 && class94.field1135[var7] == var61.field3085) {
                                class381 var62 = class46.field550[var61.field3081];
                                if (var57 < var62.method759()) {
                                    var57 = var62.method759();
                                }
                                var62.method2446(arg0 + class207.field2955[0] - 12, -var62.method759() + var34);
                            }
                        }
                        if (var57 > 0) {
                            var10000 = var34 - (var57 + 2);
                        }
                    }
                    for (int var67 = 0; var67 < 4; var67++) {
                        if (var32.field5590[var67] > class189.field2726) {
                            int var68 = var32.method426((byte) 79) / 2;
                            class291.method1931(var68, (byte) 20, arg5 >> 1, var32, arg4, arg1 >> 1, arg3);
                            if (class207.field2955[0] > -1) {
                                if (var67 == 1) {
                                    class207.field2955[1] -= 20;
                                }
                                if (var67 == 2) {
                                    class207.field2955[1] -= 10;
                                    class207.field2955[0] -= 15;
                                }
                                if (var67 == 3) {
                                    class207.field2955[0] += 15;
                                    class207.field2955[1] -= 10;
                                }
                                class313.field4421[var32.field5629[var67]].method2446(class207.field2955[0] + arg0 - 12, class207.field2955[1] + -12 + arg2);
                                class263.field3750.method1776(arg2 + class207.field2955[1] + 3, -1, Integer.toString(var32.field5618[var67]), arg0 + class207.field2955[0] - 1, -106, 0);
                            }
                        }
                    }
                }
            }
        }
        int var8 = 22 / ((arg6 - 43) / 42);
        for (int var9 = 0; var9 < class222.field3121; var9++) {
            int var27 = class180.field2464[var9];
            class396 var28;
            if (var27 < 2048) {
                var28 = class26.field314[var27];
            } else {
                var28 = class167.field2335[var27 - 2048];
            }
            int var29 = class11.field145[var9];
            class396 var30;
            if (var29 >= 2048) {
                var30 = class167.field2335[var29 - 2048];
            } else {
                var30 = class26.field314[var29];
            }
            class432.method2711(arg3, arg4, arg2, var28, arg0, --var28.field5587, var30, arg1, arg5, (byte) 43);
        }
        int var10 = class371.field5232.field4997 + class371.field5232.field4990 + 2;
        for (int var11 = 0; var11 < class182.field2484; var11++) {
            int var12 = class207.field2950[var11];
            int var13 = class207.field2938[var11];
            int var14 = class207.field2943[var11];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var26 = 0; var26 < var11; var26++) {
                    if (var13 + 2 > class207.field2938[var26] - var10 && (class207.field2938[var26] + 2) > (var13 - var10) && (var12 - var14) < (class207.field2950[var26] + class207.field2943[var26]) && (class207.field2950[var26] - class207.field2943[var26]) < (var12 + var14) && var13 > class207.field2938[var26] - var10) {
                        var15 = true;
                        var13 = class207.field2938[var26] - var10;
                    }
                }
            }
            class207.field2938[var11] = var13;
            String var16 = class207.field2945[var11];
            if (class125.field1531 == 0) {
                int var17 = 16776960;
                if (class207.field2948[var11] < 6) {
                    var17 = class450.field6449[class207.field2948[var11]];
                }
                if (class207.field2948[var11] == 6) {
                    var17 = (class348.field4931 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class207.field2948[var11] == 7) {
                    var17 = (class348.field4931 % 20) >= 10 ? 65535 : 255;
                }
                if (class207.field2948[var11] == 8) {
                    var17 = class348.field4931 % 20 < 10 ? 45056 : 8454016;
                }
                if (class207.field2948[var11] == 9) {
                    int var18 = 150 - class207.field2941[var11];
                    if (var18 < 50) {
                        var17 = var18 * 1280 + 16711680;
                    } else if (var18 < 100) {
                        var17 = 33160960 - var18 * 327680;
                    } else if (var18 < 150) {
                        var17 = var18 * 5 + 64780;
                    }
                }
                if (class207.field2948[var11] == 10) {
                    int var19 = 150 - class207.field2941[var11];
                    if (var19 < 50) {
                        var17 = var19 * 5 + 16711680;
                    } else if (var19 < 100) {
                        var17 = 16384000 + 16711935 - (var19 * 327680);
                    } else if (var19 < 150) {
                        var17 = -(((var19 - 100) * 5) - (var19 * 327680)) - 32767745;
                    }
                }
                if (class207.field2948[var11] == 11) {
                    int var20 = 150 - class207.field2941[var11];
                    if (var20 < 50) {
                        var17 = 16777215 - (var20 * 327685);
                    } else if (var20 < 100) {
                        var17 = var20 * 327685 - 16318970;
                    } else if (var20 < 150) {
                        var17 = 16777215 - ((var20 - 100) * 327680);
                    }
                }
                int var21 = var17 | 0xFF000000;
                if (class207.field2946[var11] == 0) {
                    class174.field2391.method1776(arg2 + var13, var21, var16, arg0 + var12, -103, -16777216);
                }
                if (class207.field2946[var11] == 1) {
                    class174.field2391.method1777(arg2 + var13, 105, class348.field4931, var21, -16777216, var16, arg0 + var12);
                }
                if (class207.field2946[var11] == 2) {
                    class174.field2391.method1761(var16, var21, arg0 + var12, 5, class348.field4931, -16777216, arg2 + var13);
                }
                if (class207.field2946[var11] == 3) {
                    class174.field2391.method1763(76, var16, 150 - class207.field2941[var11], var21, arg2 + var13, -16777216, arg0 + var12, class348.field4931);
                }
                if (class207.field2946[var11] == 4) {
                    int var22 = (150 - class207.field2941[var11]) * (class371.field5232.method2264(var16, -98) + 100) / 150;
                    class151.field1873.method679(arg0 + var12 - 50, arg2, arg0 + var12 + 50, arg2 + arg5);
                    class174.field2391.method1767(-16777216, arg0 + var12 + 50 - var22, var21, var16, arg2 + var13, 4);
                    class151.field1873.method660(arg0, arg2, arg0 + arg1, arg2 + arg5);
                }
                if (class207.field2946[var11] == 5) {
                    int var23 = 150 - class207.field2941[var11];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    int var25 = class371.field5232.field4990 + class371.field5232.field4997;
                    class151.field1873.method679(arg0, arg2 + var13 - var25 - 1, arg0 - -arg1, arg2 + var13 + 5);
                    class174.field2391.method1776(arg2 + var13 + var24, var21, var16, arg0 + var12, -127, -16777216);
                    class151.field1873.method660(arg0, arg2, arg0 + arg1, arg2 + arg5);
                }
            } else {
                class174.field2391.method1776(arg2 + var13, -256, var16, arg0 + var12, -110, -16777216);
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V", line = 560)
    public static void method1200(int arg0) {
        field2407 = null;
        int var1 = 47 / ((arg0 - 76) / 36);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V", line = 572)
    public static final void method1201(byte arg0) {
        if (arg0 > -77) {
            field2405 = 37;
        }
        field2404++;
        if (class59.field707 != -1) {
            class46.method272(class59.field707, true, -1, -1, false);
            class59.field707 = -1;
        }
    }
}
