import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class124 {

    @OriginalMember(owner = "client!c", name = "e", descriptor = "[I")
    private static int[] field1609 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "[Lkp;")
    public static class340[] field1608;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method738(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1613++;
        int var7 = class461.field6877;
        class148.field1945 = 0;
        int[] var8 = class342.field4589;
        if (arg4 != 65535) {
            method740(62);
        }
        for (int var9 = 0; var9 < (class401.field5813 + var7); var9++) {
            class212 var32 = null;
            class96 var33;
            if (var7 > var9) {
                var33 = class29.field272[var8[var9]];
            } else {
                var33 = class339.field4484[class337.field4465[var9 - var7]];
                var32 = ((class22) var33).field220;
                if (var32.field2903 != null) {
                    var32 = var32.method1350(class52.field606, -1);
                    if (var32 == null) {
                        continue;
                    }
                }
            }
            if (var33.field1236 >= 0 && (class431.field6268 == var33.field1242 || class96.field1170.field3695 == var33.field3695)) {
                class378.method2311(var33, arg2, (byte) 78, arg1 >> 1, arg5 >> 1, var33.method123((byte) -102), arg6);
                if (class382.field5525[0] >= 0) {
                    if (var33.field1151 != null && (var9 >= var7 || class481.field7111 == 0 || class481.field7111 == 3 || class481.field7111 == 1 && class299.method1789(((class531) var33).field7783, arg4 ^ 0xFF88)) && class148.field1945 < class366.field5000) {
                        class366.field5003[class148.field1945] = class121.field1570.method1066(89, var33.field1151) / 2;
                        class366.field5001[class148.field1945] = class382.field5525[0];
                        class366.field5005[class148.field1945] = class382.field5525[1];
                        class366.field5006[class148.field1945] = var33.field1224;
                        class366.field5008[class148.field1945] = var33.field1166;
                        class366.field5004[class148.field1945] = var33.field1221;
                        class366.field5007[class148.field1945] = var33.field1151;
                        class148.field1945++;
                    }
                    int var34 = class382.field5525[1] + arg0;
                    int var45;
                    if (var33.field1235 || var33.field1246 <= class532.field7836) {
                        var45 = var34 - Math.max(class121.field1570.field2366, class434.field6332[0].method146());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (var9 < var7) {
                            class531 var37 = class29.field272[var8[var9]];
                            var38 = var33.method547((byte) 117).field4090;
                            if (var37.field7803) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field2885;
                            if (var38 == -1) {
                                var38 = var33.method547((byte) 117).field4090;
                            }
                        }
                        class24[] var39 = class434.field6332;
                        if (var38 != -1) {
                            class24[] var40 = (class24[]) class68.field784.method3032(3589, (long) var38);
                            if (var40 == null) {
                                class491[] var41 = class491.method2976(class282.field3733, var38, 0);
                                if (var41 != null) {
                                    var40 = new class24[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class343.field4596.method1236(var41[var42], true);
                                    }
                                    class68.field784.method3046((long) var38, var40, 1);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var39.length <= var36) {
                            var36 = 1;
                        }
                        class24 var43 = var39[0];
                        class24 var44 = var39[var36];
                        var45 = var34 - Math.max(class121.field1570.field2366, var43.method146());
                        int var46 = arg3 + (class382.field5525[0] - (var43.method150() >> 1));
                        int var47 = var43.method150() * var33.field1189 / 255;
                        if (var33.field1189 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method144(var46, var45);
                        class343.field4596.method1134(var46, var45, var46 + var47, var43.method146() + var45);
                        var44.method144(var46, var45);
                        class343.field4596.method1182(arg3, arg0, arg3 + arg5, arg0 + arg1);
                    }
                    var45 -= 2;
                    if (!var33.field1235) {
                        if (var33.field1241 > class532.field7836) {
                            class24 var48 = class12.field130[var33.field1157 ? 2 : 0];
                            class24 var49 = class12.field130[var33.field1157 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class22) {
                                var51 = var32.field2854;
                                if (var51 == -1) {
                                    var51 = var33.method547((byte) 117).field4075;
                                }
                            } else {
                                var51 = var33.method547((byte) 117).field4075;
                            }
                            if (var51 != -1) {
                                class24[] var52 = (class24[]) class347.field4619.method3032(3589, (long) var51);
                                if (var52 == null) {
                                    class491[] var53 = class491.method2976(class282.field3733, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class24[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class343.field4596.method1236(var53[var54], true);
                                        }
                                        class347.field4619.method3046((long) var51, var52, 1);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var49 = var52[var33.field1157 ? 3 : 1];
                                    var48 = var52[var33.field1157 ? 2 : 0];
                                }
                            }
                            int var55 = var33.field1241 - class532.field7836;
                            int var56;
                            if (var33.field1154 >= var55) {
                                var56 = var48.method150();
                            } else {
                                int var57 = var55 - var33.field1154;
                                int var58 = var33.field1177 == 0 ? 0 : (var33.field1165 - var57) / var33.field1177 * var33.field1177;
                                var56 = var48.method150() * var58 / var33.field1165;
                            }
                            int var59 = var48.method146();
                            var45 -= var59;
                            int var60 = class382.field5525[0] + arg3 - (var48.method150() >> 1);
                            var48.method144(var60, var45);
                            class343.field4596.method1134(var60, var45, var60 + var56, var45 - -var59);
                            var49.method144(var60, var45);
                            var45 -= 2;
                            class343.field4596.method1182(arg3, arg0, arg3 + arg5, arg0 + arg1);
                        }
                        if (var9 < var7) {
                            class531 var62 = (class531) var33;
                            if (var62.field7818 != -1) {
                                var45 -= 25;
                                class192.field2472[var62.field7818].method144(class382.field5525[0] + arg3 - 12, var45);
                                var45 -= 2;
                            }
                            if (var62.field7830 != -1) {
                                var45 -= 25;
                                class464.field6907[var62.field7830].method144(class382.field5525[0] + arg3 - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field2915 >= 0 && class464.field6907.length > var32.field2915) {
                            class24 var61 = class464.field6907[var32.field2915];
                            var45 -= 25;
                            var61.method144(arg3 - ((var61.method150() >> 1) - class382.field5525[0]), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var33 instanceof class531)) {
                        int var63 = 0;
                        class523[] var64 = class497.field7241;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class523 var67 = var64[var65];
                            if (var67 != null && var67.field7698 == 1 && class337.field4465[var9 - var7] == var67.field7691) {
                                class24 var68 = class152.field1984[var67.field7689];
                                if (var68.method146() > var63) {
                                    var63 = var68.method146();
                                }
                                if ((class532.field7836 % 20) < 10) {
                                    var68.method144(arg3 + class382.field5525[0] - 12, var45 + -var68.method146());
                                }
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var69 = 0;
                        class523[] var70 = class497.field7241;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class523 var73 = var70[var71];
                            if (var73 != null && var73.field7698 == 10 && var8[var9] == var73.field7691) {
                                class24 var74 = class152.field1984[var73.field7689];
                                if (var69 < var74.method146()) {
                                    var69 = var74.method146();
                                }
                                var74.method144(class382.field5525[0] + arg3 - 12, var45 - var74.method146());
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    }
                    for (int var75 = 0; var75 < 4; var75++) {
                        if (class532.field7836 < var33.field1212[var75]) {
                            int var76 = var33.method123((byte) 0) / 2;
                            class378.method2311(var33, arg2, (byte) 78, arg1 >> 1, arg5 >> 1, var76, arg6);
                            if (class382.field5525[0] > -1) {
                                int var77 = class331.field4394[var33.field1204[var75]].method150();
                                if (var75 == 1) {
                                    class382.field5525[1] -= 20;
                                }
                                if (var75 == 2) {
                                    class382.field5525[0] -= var77 - 9;
                                    class382.field5525[1] -= 10;
                                }
                                if (var75 == 3) {
                                    class382.field5525[1] -= 10;
                                    class382.field5525[0] += var77 - 9;
                                }
                                class331.field4394[var33.field1204[var75]].method144(class382.field5525[0] + arg3 - (var77 >> 1), arg0 - 12 + class382.field5525[1]);
                                class161.field2096.method1885(0, 4, -1, arg3 + class382.field5525[0] - 1, Integer.toString(var33.field1153[var75]), class382.field5525[1] + arg0 + 3);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class230.field3096; var10++) {
            int var28 = class10.field118[var10];
            class96 var29;
            if (var28 < 2048) {
                var29 = class29.field272[var28];
            } else {
                var29 = class339.field4484[var28 - 2048];
            }
            int var30 = class456.field6813[var10];
            class96 var31;
            if (var30 >= 2048) {
                var31 = class339.field4484[var30 - 2048];
            } else {
                var31 = class29.field272[var30];
            }
            class99.method603((byte) -91, arg1, var29, arg5, var31, arg6, arg2, --var29.field1188, arg0, arg3);
        }
        int var11 = class121.field1570.field2369 + class121.field1570.field2366 + 2;
        for (int var12 = 0; var12 < class148.field1945; var12++) {
            int var13 = class366.field5001[var12];
            int var14 = class366.field5005[var12];
            int var15 = class366.field5003[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if (class366.field5005[var27] - var11 < var14 + 2 && class366.field5005[var27] + 2 > -var11 + var14 && var13 - var15 < class366.field5001[var27] - -class366.field5003[var27] && (var13 + var15) > (class366.field5001[var27] - class366.field5003[var27]) && class366.field5005[var27] - var11 < var14) {
                        var14 = class366.field5005[var27] - var11;
                        var16 = true;
                    }
                }
            }
            class366.field5005[var12] = var14;
            String var17 = class366.field5007[var12];
            if (class235.field3145 == 0) {
                int var18 = 16776960;
                if (class366.field5006[var12] < 6) {
                    var18 = field1609[class366.field5006[var12]];
                }
                if (class366.field5006[var12] == 6) {
                    var18 = (class431.field6268 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class366.field5006[var12] == 7) {
                    var18 = class431.field6268 % 20 >= 10 ? 65535 : 255;
                }
                if (class366.field5006[var12] == 8) {
                    var18 = class431.field6268 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class366.field5006[var12] == 9) {
                    int var19 = 150 - class366.field5004[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = var19 * 5 + 64780;
                    }
                }
                if (class366.field5006[var12] == 10) {
                    int var20 = 150 - class366.field5004[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 500 + 255 - var20 * 5;
                    }
                }
                if (class366.field5006[var12] == 11) {
                    int var21 = 150 - class366.field5004[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - (var21 * 327685);
                    } else if (var21 < 100) {
                        var18 = var21 * 327685 + 65280 - 16384250;
                    } else if (var21 < 150) {
                        var18 = 16777215 + 32768000 - (var21 * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class366.field5008[var12] == 0) {
                    class79.field976.method1885(-16777216, 4, var22, arg3 + var13, var17, arg0 + var14);
                }
                if (class366.field5008[var12] == 1) {
                    class79.field976.method1880(var22, arg0 + var14, arg3 + var13, (byte) 114, -16777216, var17, class431.field6268);
                }
                if (class366.field5008[var12] == 2) {
                    class79.field976.method1884(var17, arg0 + var14, -16777216, arg3 + var13, var22, class431.field6268, (byte) -40);
                }
                if (class366.field5008[var12] == 3) {
                    class79.field976.method1867(-16777216, 2, 150 - class366.field5004[var12], var22, class431.field6268, var17, arg3 + var13, arg0 + var14);
                }
                if (class366.field5008[var12] == 4) {
                    int var23 = (150 - class366.field5004[var12]) * (class121.field1570.method1066(74, var17) + 100) / 150;
                    class343.field4596.method1134(arg3 + var13 - 50, arg0, arg3 + var13 + 50, arg0 - -arg1);
                    class79.field976.method1878(-16777216, arg0 + var14, var17, var22, arg3 + var13 - (var23 + -50), (byte) -5);
                    class343.field4596.method1182(arg3, arg0, arg3 + arg5, arg0 - -arg1);
                }
                if (class366.field5008[var12] == 5) {
                    int var24 = 150 - class366.field5004[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class121.field1570.field2366 + class121.field1570.field2369;
                    class343.field4596.method1134(arg3, arg0 - (-var14 - -var26) - 1, arg3 + arg5, var14 + arg0 + 5);
                    class79.field976.method1885(-16777216, 4, var22, arg3 + var13, var17, arg0 + var14 + var25);
                    class343.field4596.method1182(arg3, arg0, arg3 + arg5, arg0 + arg1);
                }
            } else {
                class79.field976.method1885(-16777216, arg4 ^ 0xFFFB, -256, arg3 + var13, var17, arg0 + var14);
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZI)Z", line = 584)
    public static final boolean method739(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method748(null, (byte) 77);
        }
        field1611++;
        return class445.method2749(arg0, (byte) 9, arg2) | (arg2 & 0x60000) != 0 || class371.method2198(arg2, arg0, 45056) || class23.method135(1, arg0, arg2);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 597)
    public static void method740(int arg0) {
        field1609 = null;
        field1608 = null;
        if (arg0 != 0) {
            method744(15, true, 71);
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IZI)Z", line = 613)
    public static final boolean method744(int arg0, boolean arg1, int arg2) {
        field1606++;
        if (arg1) {
            return true;
        } else {
            return class216.method1375(arg0, 2, arg2) || class371.method2198(arg0, arg2, 45056);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Lgb;", line = 627)
    public static final class145 method746(int arg0, int arg1) {
        if (arg1 != 2) {
            field1608 = null;
        }
        field1607++;
        if (arg0 == 0) {
            if ((double) class416.field5998 == 3.0D) {
                return class472.field7007;
            }
            if ((double) class416.field5998 == 4.0D) {
                return class68.field777;
            }
            if ((double) class416.field5998 == 6.0D) {
                return class357.field4870;
            }
            if ((double) class416.field5998 >= 8.0D) {
                return class285.field3758;
            }
        } else if (arg0 == 1) {
            if ((double) class416.field5998 == 3.0D) {
                return class357.field4870;
            }
            if ((double) class416.field5998 == 4.0D) {
                return class285.field3758;
            }
            if ((double) class416.field5998 == 6.0D) {
                return class219.field2968;
            }
            if ((double) class416.field5998 >= 8.0D) {
                return class510.field7417;
            }
        } else if (arg0 == 2) {
            if ((double) class416.field5998 == 3.0D) {
                return class219.field2968;
            }
            if ((double) class416.field5998 == 4.0D) {
                return class510.field7417;
            }
            if ((double) class416.field5998 == 6.0D) {
                return class169.field2192;
            }
            if ((double) class416.field5998 >= 8.0D) {
                return class476.field7047;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lza;B)V", line = 696)
    public static final void method748(class287 arg0, byte arg1) {
        field1612++;
        if (arg1 != 108) {
            field1608 = null;
        }
        if (class469.field6953.method978(arg1 ^ 0x15) == 0) {
            return;
        }
        if (class20.field183 == 0) {
            for (class393 var4 = (class393) class469.field6953.method970(12); var4 != null; var4 = (class393) class469.field6953.method976((byte) -40)) {
                class237.field3158.method227(arg0, var4.field5676 ? class96.field1170.field7833 : null, var4.field5680, false, var4.field5679, var4.field5673, var4.field5675, var4.field5674, -10465, arg0, false, class161.field2096);
                var4.method2674(true);
            }
            class104.method628(-128);
            return;
        }
        if (class169.field2193 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class169.field2193 = class287.method1723(class381.field5518, var2, class463.field6904, 0, (byte) 53, 0);
            class53.field621 = class169.field2193.method1201(class123.method733(0, class299.field3929, -108, class98.field1309), class491.method2976(class282.field3733, class299.field3929, 0), true);
        }
        for (class393 var3 = (class393) class469.field6953.method970(12); var3 != null; var3 = (class393) class469.field6953.method976((byte) -121)) {
            class237.field3158.method227(arg0, var3.field5676 ? class96.field1170.field7833 : null, var3.field5680, false, var3.field5679, var3.field5673, var3.field5675, var3.field5674, arg1 ^ 0xFFFFD773, class169.field2193, false, class53.field621);
            var3.method2674(true);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;ILjava/lang/String;I)V", line = 758)
    public static final void method755(String arg0, String arg1, int arg2, boolean arg3, String arg4, int arg5, String arg6, int arg7) {
        field1605++;
        for (int var8 = 99; var8 > 0; var8--) {
            class394.field5689[var8] = class394.field5689[var8 - 1];
            class164.field2146[var8] = class164.field2146[var8 - 1];
            class127.field1654[var8] = class127.field1654[var8 - 1];
            class440.field6391[var8] = class440.field6391[var8 - 1];
            class7.field100[var8] = class7.field100[var8 - 1];
            class115.field1510[var8] = class115.field1510[var8 - 1];
            class317.field4243[var8] = class317.field4243[var8 - 1];
        }
        if (!arg3) {
            method748(null, (byte) -36);
        }
        class394.field5689[0] = arg5;
        class127.field1654[0] = arg4;
        class164.field2146[0] = arg7;
        class440.field6391[0] = arg6;
        class7.field100[0] = arg1;
        class140.field1862++;
        class524.field7717 = class106.field1448;
        class115.field1510[0] = arg0;
        class317.field4243[0] = arg2;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III[I)V")
    public abstract void method737(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "v", descriptor = "()V")
    public abstract void method741();

    @OriginalMember(owner = "client!c", name = "EA", descriptor = "(I)V")
    public abstract void method742(int arg0);

    @OriginalMember(owner = "client!c", name = "U", descriptor = "(III)V")
    public abstract void method743(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "K", descriptor = "(III[I)V")
    public abstract void method745(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
    public abstract void method747(int arg0);

    @OriginalMember(owner = "client!c", name = "ca", descriptor = "(I)V")
    public abstract void method749(int arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()Lc;")
    public abstract class124 method750();

    @OriginalMember(owner = "client!c", name = "ea", descriptor = "(I)V")
    public abstract void method751(int arg0);

    @OriginalMember(owner = "client!c", name = "YA", descriptor = "(IIIIII)V")
    public abstract void method752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!c", name = "ha", descriptor = "(Lc;)V")
    public abstract void method753(class124 arg0);

    @OriginalMember(owner = "client!c", name = "wa", descriptor = "([I)V")
    public abstract void method754(int[] arg0);

    @OriginalMember(owner = "client!c", name = "A", descriptor = "(I)V")
    public abstract void method756(int arg0);

    @OriginalMember(owner = "client!c", name = "W", descriptor = "(III)V")
    public abstract void method757(int arg0, int arg1, int arg2);
}
