import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class405 {

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field6087 = -1;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "Z")
    public static boolean field6086 = true;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "[I")
    public static int[] field6091 = new int[14];

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Llg;")
    public static class20 field6092;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Lqj;")
    public static class238 field6088;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "[I")
    public static int[] field6089;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    public static final void method2639(byte arg0) {
        field6085++;
        class24 var1 = class227.field3192;
        synchronized (class227.field3192) {
            class227.field3192.method212(-101);
        }
        class24 var2 = class277.field4065;
        synchronized (class277.field4065) {
            class277.field4065.method212(-67);
            if (arg0 <= 73) {
                method2640((byte) -31);
            }
        }
        class24 var3 = class169.field2235;
        synchronized (class169.field2235) {
            class169.field2235.method212(-80);
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V")
    public static void method2640(byte arg0) {
        field6088 = null;
        field6091 = null;
        field6092 = null;
        field6089 = null;
        int var1 = 24 / ((-arg0 - 50) / 62);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2641(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class360.field5282 = 0;
        field6084++;
        for (int var7 = -1; var7 < (class191.field2662 + class153.field2004); var7++) {
            class373 var30 = null;
            class18 var31;
            if (var7 < 0) {
                var31 = class100.field1350;
            } else if (class153.field2004 <= var7) {
                var31 = class23.field408[class416.field6202[var7 - class153.field2004]];
                var30 = ((class129) var31).field1714;
                if (var30.field5576 != null) {
                    var30 = var30.method2469(true);
                    if (var30 == null) {
                        continue;
                    }
                }
            } else {
                var31 = class125.field1664[class66.field943[var7]];
            }
            if (var31.field248 >= 0) {
                class123.method848(arg1 >> 1, false, arg5 >> 1, arg2, var31, var31.method141((byte) 105), arg6);
                if (class82.field1161[0] >= 0) {
                    if (var31.field255 != null && (var7 >= class153.field2004 || class132.field1766 == 0 || class132.field1766 == 3 || class132.field1766 == 1 && class129.method876((byte) 97, ((class194) var31).field2756)) && class360.field5282 < class169.field2225) {
                        class169.field2229[class360.field5282] = class272.field3986.method1029((byte) -121, var31.field255) / 2;
                        class169.field2220[class360.field5282] = class82.field1161[0];
                        class169.field2226[class360.field5282] = class82.field1161[1];
                        class169.field2233[class360.field5282] = var31.field276;
                        class169.field2230[class360.field5282] = var31.field258;
                        class169.field2221[class360.field5282] = var31.field251;
                        class169.field2228[class360.field5282] = var31.field255;
                        class360.field5282++;
                    }
                    class243 var32 = class50.field697[0];
                    int var33 = class82.field1161[1] + arg3 - Math.max(class272.field3986.field2152, var32.method1090());
                    if (!var31.field268 && var31.field247 > class50.field698) {
                        class243 var34 = class50.field697[1];
                        if (var31 instanceof class129) {
                            class129 var35 = (class129) var31;
                            class243[] var36 = (class243[]) class169.field2232.method209(126, (long) var35.field1714.field5567);
                            if (var36 == null) {
                                class25[] var37 = class25.method222(class247.field3446, var35.field1714.field5567, 0);
                                if (var37 != null) {
                                    var36 = new class243[var37.length];
                                    for (int var38 = 0; var38 < var37.length; var38++) {
                                        var36[var38] = class35.field574.method2166(var37[var38], true);
                                    }
                                    class169.field2232.method202(true, var36, (long) var35.field1714.field5567);
                                }
                            }
                            if (var36 != null && var36.length == 2) {
                                var32 = var36[0];
                                var34 = var36[1];
                            }
                        }
                        int var39 = class82.field1161[0] + arg0 - (var32.method1095() >> 1);
                        var32.method1499(var39, var33);
                        int var40 = var32.method1095() * var31.field252 / 255;
                        class35.field574.method2163(var39, var33, var39 + var40, var32.method1090() + var33);
                        var34.method1499(var39, var33);
                        class35.field574.method2155(arg0, arg3, arg0 + arg5, arg1 + arg3);
                    }
                    var33 -= 2;
                    if (!var31.field268) {
                        if (class50.field698 < var31.field244) {
                            class243 var41 = class407.field6100[var31.field287 ? 2 : 0];
                            class243 var42 = class407.field6100[var31.field287 ? 3 : 1];
                            boolean var43 = true;
                            int var44;
                            if ((var31 instanceof class129)) {
                                var44 = var30.field5610;
                                if (var44 == -1) {
                                    var44 = var31.method140(112).field2439;
                                }
                            } else {
                                var44 = var31.method140(121).field2439;
                            }
                            if (var44 != -1) {
                                class243[] var45 = (class243[]) class26.field475.method209(123, (long) var44);
                                if (var45 == null) {
                                    class25[] var46 = class25.method222(class247.field3446, var44, 0);
                                    if (var46 != null) {
                                        var45 = new class243[var46.length];
                                        for (int var47 = 0; var47 < var46.length; var47++) {
                                            var45[var47] = class35.field574.method2166(var46[var47], true);
                                        }
                                        class26.field475.method202(true, var45, (long) var44);
                                    }
                                }
                                if (var45 != null && var45.length == 4) {
                                    var41 = var45[var31.field287 ? 2 : 0];
                                    var42 = var45[var31.field287 ? 3 : 1];
                                }
                            }
                            int var48 = var31.field244 - class50.field698;
                            int var51;
                            if (var48 > var31.field270) {
                                int var49 = var48 - var31.field270;
                                int var50 = var31.field234 == 0 ? 0 : (var31.field277 - var49) / var31.field234 * var31.field234;
                                var51 = var41.method1095() * var50 / var31.field277;
                            } else {
                                var51 = var41.method1095();
                            }
                            int var52 = var41.method1090();
                            var33 -= var52;
                            int var53 = class82.field1161[0] + arg0 - (var41.method1095() >> 1);
                            var41.method1499(var53, var33);
                            class35.field574.method2163(var53, var33, var51 + var53, var33 + var52);
                            var42.method1499(var53, var33);
                            class35.field574.method2155(arg0, arg3, arg0 + arg5, arg3 - -arg1);
                            var33 -= 2;
                        }
                        if (var7 < class153.field2004) {
                            class194 var55 = (class194) var31;
                            if (var55.field2794 != -1) {
                                var33 -= 25;
                                class420.field6263[var55.field2794].method1499(class82.field1161[0] + arg0 - 12, var33);
                                var33 -= 2;
                            }
                            if (var55.field2774 != -1) {
                                var33 -= 25;
                                class384.field5747[var55.field2774].method1499(class82.field1161[0] + arg0 - 12, var33);
                                var33 -= 2;
                            }
                        } else if (var30.field5608 >= 0 && var30.field5608 < class384.field5747.length) {
                            class243 var54 = class384.field5747[var30.field5608];
                            var33 -= 25;
                            var54.method1499(arg0 + class82.field1161[0] - (var54.method1095() >> 1), var33);
                            var33 -= 2;
                        }
                    }
                    int var10000;
                    if (!var31 instanceof class194) {
                        int var62 = 0;
                        class130[] var63 = class314.field4503;
                        for (int var64 = 0; var64 < var63.length; var64++) {
                            class130 var68 = var63[var64];
                            if (var68 != null && var68.field1740 == 1 && class416.field6202[var7 - class153.field2004] == var68.field1731) {
                                class243 var69 = class188.field2553[var68.field1748];
                                if (var62 < var69.method1090()) {
                                    var62 = var69.method1090();
                                }
                                if (class50.field698 % 20 < 10) {
                                    var69.method1499(class82.field1161[0] + arg0 - 12, -var69.method1090() + var33);
                                }
                            }
                        }
                        if (var62 > 0) {
                            var10000 = var33 - (var62 + 2);
                        }
                    } else if (var7 >= 0) {
                        int var56 = 0;
                        class130[] var57 = class314.field4503;
                        for (int var58 = 0; var58 < var57.length; var58++) {
                            class130 var60 = var57[var58];
                            if (var60 != null && var60.field1740 == 10 && class66.field943[var7] == var60.field1731) {
                                class243 var61 = class188.field2553[var60.field1748];
                                if (var56 < var61.method1090()) {
                                    var56 = var61.method1090();
                                }
                                var61.method1499(arg0 + class82.field1161[0] - 12, var33 - var61.method1090());
                            }
                        }
                        if (var56 > 0) {
                            var10000 = var33 - (var56 + 2);
                        }
                    }
                    for (int var66 = 0; var66 < 4; var66++) {
                        if (class50.field698 < var31.field254[var66]) {
                            int var67 = var31.method141((byte) 97) / 2;
                            class123.method848(arg1 >> 1, false, arg5 >> 1, arg2, var31, var67, arg6);
                            if (class82.field1161[0] > -1) {
                                if (var66 == 1) {
                                    class82.field1161[1] -= 20;
                                }
                                if (var66 == 2) {
                                    class82.field1161[0] -= 15;
                                    class82.field1161[1] -= 10;
                                }
                                if (var66 == 3) {
                                    class82.field1161[1] -= 10;
                                    class82.field1161[0] += 15;
                                }
                                class280.field4124[var31.field245[var66]].method1499(arg0 + class82.field1161[0] - 12, arg3 + -12 + class82.field1161[1]);
                                class318.field4547.method1318((byte) 89, 0, Integer.toString(var31.field283[var66]), -1, arg0 + class82.field1161[0] - 1, class82.field1161[1] + arg3 - -3);
                            }
                        }
                    }
                }
            }
        }
        for (int var8 = arg4; var8 < class423.field6295; var8++) {
            int var26 = class328.field4708[var8];
            class18 var27;
            if (var26 >= 2048) {
                var27 = class23.field408[var26 - 2048];
            } else {
                var27 = class125.field1664[var26];
            }
            int var28 = class314.field4499[var8];
            class18 var29;
            if (var28 >= 2048) {
                var29 = class23.field408[var28 - 2048];
            } else {
                var29 = class125.field1664[var28];
            }
            class444.method2799(var27, var29, arg0, arg1, --var27.field238, arg6, arg2, arg4 + 18, arg3, arg5);
        }
        int var9 = class272.field3986.field2152 + class272.field3986.field2146 + 2;
        for (int var10 = 0; var10 < class360.field5282; var10++) {
            int var11 = class169.field2220[var10];
            int var12 = class169.field2226[var10];
            int var13 = class169.field2229[var10];
            boolean var14 = true;
            while (var14) {
                var14 = false;
                for (int var25 = 0; var25 < var10; var25++) {
                    if (class169.field2226[var25] - var9 < var12 + 2 && (class169.field2226[var25] + 2) > (var12 - var9) && class169.field2229[var25] + class169.field2220[var25] > -var13 + var11 && (var11 + var13) > (class169.field2220[var25] - class169.field2229[var25]) && var12 > (class169.field2226[var25] - var9)) {
                        var14 = true;
                        var12 = class169.field2226[var25] - var9;
                    }
                }
            }
            class169.field2226[var10] = var12;
            String var15 = class169.field2228[var10];
            if (class311.field4445 == 0) {
                int var16 = 16776960;
                if (class169.field2233[var10] < 6) {
                    var16 = class11.field137[class169.field2233[var10]];
                }
                if (class169.field2233[var10] == 6) {
                    var16 = class269.field3930 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class169.field2233[var10] == 7) {
                    var16 = (class269.field3930 % 20) < 10 ? 255 : 65535;
                }
                if (class169.field2233[var10] == 8) {
                    var16 = (class269.field3930 % 20) < 10 ? 45056 : 8454016;
                }
                if (class169.field2233[var10] == 9) {
                    int var17 = 150 - class169.field2221[var10];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - ((var17 - 50) * 327680);
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (class169.field2233[var10] == 10) {
                    int var18 = 150 - class169.field2221[var10];
                    if (var18 < 50) {
                        var16 = (var18 * 5) + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - ((var18 - 50) * 327680);
                    } else if (var18 < 150) {
                        var16 = ((var18 + -100) * 327680) + 255 - ((var18 - 100) * 5);
                    }
                }
                if (class169.field2233[var10] == 11) {
                    int var19 = 150 - class169.field2221[var10];
                    if (var19 < 50) {
                        var16 = 16777215 - (var19 * 327685);
                    } else if (var19 < 100) {
                        var16 = ((var19 - 50) * 327685) + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - (var19 * 327680 - 32768000);
                    }
                }
                int var20 = var16 | 0xFF000000;
                if (class169.field2230[var10] == 0) {
                    class232.field3275.method1318((byte) 93, -16777216, var15, var20, arg0 + var11, arg3 + var12);
                }
                if (class169.field2230[var10] == 1) {
                    class232.field3275.method1330(arg3 + var12, var20, class269.field3930, arg0 + var11, -16777216, 237, var15);
                }
                if (class169.field2230[var10] == 2) {
                    class232.field3275.method1315(arg3 + var12, var15, arg0 + var11, var20, 2, class269.field3930, -16777216);
                }
                if (class169.field2230[var10] == 3) {
                    class232.field3275.method1317(arg0 + var11, false, -16777216, 150 - class169.field2221[var10], var20, var15, arg3 + var12, class269.field3930);
                }
                if (class169.field2230[var10] == 4) {
                    int var21 = (150 - class169.field2221[var10]) * (class272.field3986.method1029((byte) -77, var15) + 100) / 150;
                    class35.field574.method2163(arg0 + var11 - 50, arg3, arg0 + var11 + 50, arg1 + arg3);
                    class232.field3275.method1319(-8219, var15, var20, arg3 + var12, var11 - var21 + arg0 + 50, -16777216);
                    class35.field574.method2155(arg0, arg3, arg0 + arg5, arg3 - -arg1);
                }
                if (class169.field2230[var10] == 5) {
                    int var22 = 150 - class169.field2221[var10];
                    int var23 = 0;
                    if (var22 < 25) {
                        var23 = var22 - 25;
                    } else if (var22 > 125) {
                        var23 = var22 - 125;
                    }
                    int var24 = class272.field3986.field2152 + class272.field3986.field2146;
                    class35.field574.method2163(arg0, arg3 + var12 - (var24 - -1), arg0 - -arg5, arg3 + var12 + 5);
                    class232.field3275.method1318((byte) 106, -16777216, var15, var20, arg0 + var11, arg3 - -var23 + var12);
                    class35.field574.method2155(arg0, arg3, arg0 + arg5, arg1 + arg3);
                }
            } else {
                class232.field3275.method1318((byte) 77, -16777216, var15, -256, arg0 + var11, arg3 + var12);
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Ljr;")
    public static final class232 method2642(int arg0, int arg1) {
        field6090++;
        class232 var2 = (class232) class37.field590.method209(arg1 + 122, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class137.field1814.method1472(arg0, 31, 0);
        if (arg1 != 2) {
            method2639((byte) -91);
        }
        class232 var4 = new class232();
        if (var3 != null) {
            var4.method1431(arg1 + 12, arg0, new class265(var3));
        }
        class37.field590.method202(true, var4, (long) arg0);
        return var4;
    }
}
