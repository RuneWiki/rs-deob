import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class347 extends class29 {

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field5024 = 0;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "Ljava/lang/String;")
    public static String field5028 = null;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field5026 = 64;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "Lb;")
    public static class201 field5025;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vi", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field5030;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
    public static final void method2168(byte arg0) {
        try {
            if (arg0 < 94) {
                return;
            }
            Method var1 = (field5030 == null ? (field5030 = method2173("java.lang.Runtime")) : field5030).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class291.field4242 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field5027++;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
    public static void method2169(int arg0) {
        field5025 = null;
        field5028 = null;
        if (arg0 != 0) {
            field5026 = 57;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
    public static final void method2170(boolean arg0) {
        field5023++;
        class225.field3415.field4021 = 0;
        class71.field889 = null;
        class467.field6588 = 0;
        class226.field3424 = null;
        class58.field757 = null;
        class7.field65 = 0;
        class382.field5447 = 0;
        class393.field5568 = null;
        class345.field5016.field4021 = 0;
        class298.method1840(true);
        class335.method2116(-27436);
        for (int var1 = 0; var1 < 2048; var1++) {
            class124.field1559[var1] = null;
        }
        class492.field6935 = null;
        for (int var2 = 0; var2 < class139.field1851.length; var2++) {
            class216 var4 = class139.field1851[var2];
            if (var4 != null) {
                var4.field2125 = -1;
            }
        }
        class304.method1886(8218);
        class136.field1807 = 1;
        class211.method1368((byte) -51, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class359.field5166[var3] = true;
        }
        class361.method2232(arg0);
        class281.field4137 = 0L;
        class40.field533 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I")
    public static final int method2171(int arg0, int arg1) {
        return class135.field1788 == null ? 0 : (class135.field1788[arg0][arg1] & 0xFF) << 3;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIII[Ldt;III)V")
    public static final void method2172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class145[] arg6, int arg7, int arg8, int arg9) {
        field5029++;
        class141.field1878.method617(arg7, arg2, arg5, arg9);
        for (int var10 = arg3; var10 < arg6.length; var10++) {
            class145 var11 = arg6[var10];
            if (var11 != null && (var11.field1947 == arg0 || arg0 == -1412584499 && class250.field3695 == var11)) {
                int var12;
                if (arg1 == -1) {
                    class40.field526[class420.field5872].setBounds(var11.field1971 + arg4, var11.field2041 + arg8, var11.field2010, var11.field2021);
                    var12 = class420.field5872++;
                } else {
                    var12 = arg1;
                }
                var11.field1977 = var12;
                var11.field1969 = class353.field5090;
                if (!client.method1125(var11)) {
                    if (var11.field2062 != 0) {
                        class95.method539(16383, var11);
                    }
                    int var13 = var11.field1971 + arg4;
                    int var14 = var11.field2041 + arg8;
                    int var15 = var11.field1919;
                    if (class342.field4986 && (client.method1122(var11).field5472 != 0 || var11.field2073 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class250.field3695 == var11) {
                        if (arg0 != -1412584499 && (class404.field5692 == var11.field1988 || class320.field4644 == var11.field1988)) {
                            class337.field4900 = arg6;
                            class94.field1217 = arg8;
                            class269.field3925 = arg4;
                            continue;
                        }
                        if (class48.field670 && class490.field6899) {
                            int var16 = class262.field3832.method175(-37);
                            int var17 = class262.field3832.method177(arg3 ^ 0x4D);
                            int var18 = var16 - class302.field4304;
                            int var19 = var17 - client.field2620;
                            if (class346.field5021 > var18) {
                                var18 = class346.field5021;
                            }
                            if (class346.field5021 + class29.field396.field2010 < var11.field2010 + var18) {
                                var18 = class346.field5021 + class29.field396.field2010 - var11.field2010;
                            }
                            if (var19 < class487.field6862) {
                                var19 = class487.field6862;
                            }
                            if ((var11.field2021 + var19) > (class487.field6862 + class29.field396.field2021)) {
                                var19 = class487.field6862 + class29.field396.field2021 - var11.field2021;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (class320.field4644 == var11.field1988) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field2073 == 2) {
                        var25 = arg9;
                        var23 = arg2;
                        var24 = arg5;
                        var22 = arg7;
                    } else {
                        int var20 = var11.field2010 + var13;
                        int var21 = var14 + var11.field2021;
                        var22 = var13 <= arg7 ? arg7 : var13;
                        var23 = arg2 < var14 ? var14 : arg2;
                        if (var11.field2073 == 9) {
                            var20++;
                            var21++;
                        }
                        var24 = var20 >= arg5 ? arg5 : var20;
                        var25 = var21 < arg9 ? var21 : arg9;
                    }
                    if (var22 < var24 && var23 < var25) {
                        if (var11.field2062 != 0) {
                            if (class359.field5169 == var11.field2062 || class37.field487 == var11.field2062) {
                                class144.method899(var14, var13, class37.field487 == var11.field2062, var11.field2021, (byte) -19, var11.field2010);
                                class359.field5166[var12] = true;
                                class141.field1878.method617(arg7, arg2, arg5, arg9);
                                continue;
                            }
                            if (class437.field6082 == var11.field2062) {
                                if (var11.method911(class141.field1878, (byte) -108) != null) {
                                    class164.method1027(false);
                                    class363.method2243(var14, var13, class141.field1878, 4096, var11);
                                    class422.field5917[var12] = true;
                                    class141.field1878.method617(arg7, arg2, arg5, arg9);
                                }
                                continue;
                            }
                            if (class469.field6605 == var11.field2062) {
                                if (var11.method911(class141.field1878, (byte) -114) != null) {
                                    class235.method1501(var13, var14, var11, (byte) 65);
                                    class422.field5917[var12] = true;
                                    class141.field1878.method617(arg7, arg2, arg5, arg9);
                                }
                                continue;
                            }
                            if (class435.field6058 == var11.field2062) {
                                class454.method2670(class58.field766, class141.field1878, -113, var11.field2021, var14, var13, var11.field2010);
                                class359.field5166[var12] = true;
                                class141.field1878.method617(arg7, arg2, arg5, arg9);
                                continue;
                            }
                            if (class99.field1274 == var11.field2062) {
                                class94.method534(var14, var11.field2010, -95, var13, var11.field2021, class141.field1878);
                                class359.field5166[var12] = true;
                                class141.field1878.method617(arg7, arg2, arg5, arg9);
                                continue;
                            }
                            if (class154.field2296 == var11.field2062) {
                                if (!class79.field971 && !class100.field1278) {
                                    continue;
                                }
                                int var26 = var11.field2010 + var13;
                                int var27 = var14 + 15;
                                if (class79.field971) {
                                    class92.field1166.method1593(-1, arg3 ^ -88, var26, var27, -256, "Fps:" + class393.field5584);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (var29 > 65536) {
                                        var30 = -65536;
                                    }
                                    class92.field1166.method1593(-1, arg3 ^ -82, var26, var27, var30, "Mem:" + var29 + "k");
                                    var27 += 15;
                                    class92.field1166.method1593(-1, 91, var26, var27, -256, "In:" + class412.field5804 + "B/s Out:" + class86.field1044 + "B/s");
                                    var27 += 15;
                                    int var31 = class141.field1878.method654() / 1024;
                                    class92.field1166.method1593(-1, 113, var26, var27, var31 > 65536 ? -65536 : -256, "Offheap:" + var31 + "k");
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < 29; var35++) {
                                        var32 += class491.field6927[var35].method2818((byte) 87);
                                        var33 += class491.field6927[var35].method2817(-64);
                                        var34 += class491.field6927[var35].method2809((byte) 9);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class96.method546((long) var37, 2, (byte) -107, 0, true) + "% (" + var36 + "%)";
                                    class453.field6355.method1593(-1, arg3 + 93, var26, var27, -256, var38);
                                    var27 += 12;
                                }
                                if (class382.field5451 > 0) {
                                    class453.field6355.method1593(-1, -106, var26, var27, -256, "Particles: " + class81.field991 + " / " + class382.field5451);
                                }
                                var27 += 12;
                                if (class100.field1278) {
                                    class453.field6355.method1593(-1, 98, var26, var27, -256, "Polys: " + class141.field1878.method615() + " Models: " + class141.field1878.method614());
                                    var27 += 12;
                                    class453.field6355.method1593(-1, 57, var26, var27, -256, "Ls: " + class115.field1470 + " La: " + class94.field1218 + " NPC: " + class239.field3588 + " Pl: " + class79.field972);
                                    class139.method881((byte) 91);
                                    var27 += 12;
                                }
                                class359.field5166[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field2073 == 0) {
                            if (class375.field5415 == var11.field2062 && class141.field1878.method666()) {
                                class141.field1878.method607(var13, var14, var11.field2010, var11.field2021);
                            }
                            method2172(var11.field1933, var12, var23, 0, var13 - var11.field2072, var24, arg6, var22, var14 - var11.field1938, var25);
                            if (var11.field1943 != null) {
                                method2172(var11.field1933, var12, var23, 0, var13 - var11.field2072, var24, var11.field1943, var22, var14 - var11.field1938, var25);
                            }
                            class465 var39 = (class465) class146.field2146.method2761((long) var11.field1933, (byte) -112);
                            if (var39 != null) {
                                class342.method2153((byte) -48, var13, var14, var22, var12, var24, var23, var39.field6502, var25);
                            }
                            if (class375.field5415 == var11.field2062 && class141.field1878.method666()) {
                                class141.field1878.method667();
                                class259.field3799 = true;
                            }
                            class141.field1878.method617(arg7, arg2, arg5, arg9);
                        }
                        if (class452.field6302[var12] || class404.field5696 > 1) {
                            if (var11.field2073 == 3) {
                                if (var15 == 0) {
                                    if (var11.field1941) {
                                        class141.field1878.method650(var13, var14, var11.field2010, var11.field2021, var11.field2001, 0);
                                    } else {
                                        class141.field1878.method641(var13, var14, var11.field2010, var11.field2021, var11.field2001, 0);
                                    }
                                } else if (var11.field1941) {
                                    class141.field1878.method650(var13, var14, var11.field2010, var11.field2021, var11.field2001 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                } else {
                                    class141.field1878.method641(var13, var14, var11.field2010, var11.field2021, var11.field2001 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                }
                            } else if (var11.field2073 == 4) {
                                class256 var40 = var11.method910(true, class141.field1878);
                                if (var40 != null) {
                                    int var41 = var11.field2001;
                                    String var42 = var11.field2035;
                                    if (var11.field2016 != -1) {
                                        class41 var43 = class64.field834.method2129(var11.field2016, false);
                                        var42 = var43.field538;
                                        if (var42 == null) {
                                            var42 = "null";
                                        }
                                        if ((var43.field592 == 1 || var11.field1948 != 1) && var11.field1948 != -1) {
                                            var42 = "<col=ff9040>" + var42 + "</col> x" + class365.method2252(20289, var11.field1948);
                                        }
                                    }
                                    if (class207.field3166 == var11) {
                                        var42 = class483.field6805.method2065(56, class326.field4711);
                                        var41 = var11.field2001;
                                    }
                                    if (class29.field395) {
                                        class141.field1878.method669(var13, var14, var11.field2010 + var13, var11.field2021 + var14);
                                    }
                                    var40.method1598(var14, (class171) null, var11.field1992, var11.field1950, var11.field1987, false, var11.field1957 ? 255 - (var15 & 0xFF) << 24 : -1, 0, 255 - (var15 & 0xFF) << 24 | var41, (int[]) null, var11.field2021, var13, var11.field2010, var42, 0, class243.field3627);
                                    if (class29.field395) {
                                        class141.field1878.method617(arg7, arg2, arg5, arg9);
                                    }
                                } else if (class460.field6452) {
                                    class22.method148((byte) -78, var11);
                                }
                            } else if (var11.field2073 == 5) {
                                if (var11.field1940 < 0) {
                                    class176 var44;
                                    if (var11.field2016 == -1) {
                                        var44 = var11.method908(class141.field1878, (byte) -115);
                                    } else {
                                        class132 var45 = var11.field1986 ? class492.field6935.field6296 : null;
                                        var44 = class64.field834.method2134(class141.field1878, var11.field1948, var11.field1952, (byte) -36, var45, var11.field1949, var11.field2075 | 0xFF000000, var11.field2016);
                                    }
                                    if (var44 != null) {
                                        int var46 = var44.method516();
                                        int var47 = var44.method524();
                                        if (var11.field2036) {
                                            class141.field1878.method669(var13, var14, var11.field2010 + var13, var11.field2021 + var14);
                                            if (var11.field1983 != 0) {
                                                int var49 = (var11.field2010 + var46 - 1) / var46;
                                                int var50 = (var47 + var11.field2021 - 1) / var47;
                                                for (int var51 = 0; var51 < var49; var51++) {
                                                    for (int var52 = 0; var52 < var50; var52++) {
                                                        var44.method1078((float) var46 / 2.0F + (float) (var13 + (var46 * var51)), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field1983);
                                                    }
                                                }
                                            } else if (var15 == 0) {
                                                var44.method519(var13, var14, var11.field2010, var11.field2021, 0, 0, 1);
                                            } else {
                                                var44.method519(var13, var14, var11.field2010, var11.field2021, 1, 255 - (var15 & 0xFF) << 24 | 0xFFFFFF, 1);
                                            }
                                            class141.field1878.method617(arg7, arg2, arg5, arg9);
                                        } else if (var15 != 0) {
                                            int var48 = 255 - (var15 & 0xFF) << 24 | 0xFFFFFF;
                                            if (var11.field1983 != 0) {
                                                var44.method1082((float) var11.field2010 / 2.0F + (float) var13, (float) var11.field2021 / 2.0F + (float) var14, var11.field2010 * 4096 / var46, var11.field1983, 1, var48, 1);
                                            } else if (var11.field2010 == var46 && var11.field2021 == var47) {
                                                var44.method144(var13, var14, 1, var48, 1);
                                            } else {
                                                var44.method140(var13, var14, var11.field2010, var11.field2021, 1, var48, 1);
                                            }
                                        } else if (var11.field1983 != 0) {
                                            var44.method1078((float) var11.field2010 / 2.0F + (float) var13, (float) var11.field2021 / 2.0F + (float) var14, var11.field2010 * 4096 / var46, var11.field1983);
                                        } else if (var11.field2010 == var46 && var11.field2021 == var47) {
                                            var44.method1079(var13, var14);
                                        } else {
                                            var44.method1083(var13, var14, var11.field2010, var11.field2021);
                                        }
                                    } else if (class460.field6452) {
                                        class22.method148((byte) -78, var11);
                                    }
                                } else {
                                    var11.method909(class230.field3481, class326.field4700, (byte) 102).method1464(var11.field1960 << 3, var11.field2021, class141.field1878, var13, arg3 ^ 0x7F, var14, 0, var11.field2010, var11.field2049 << 3, 0);
                                }
                            } else if (var11.field2073 == 6) {
                                class459.method2684(false);
                                class491 var53 = null;
                                int var54 = 0;
                                if (var11.field2016 != -1) {
                                    class41 var55 = class64.field834.method2129(var11.field2016, false);
                                    if (var55 != null) {
                                        class41 var56 = var55.method281(var11.field1948, true);
                                        class153 var57 = var11.field1967 == -1 ? null : class64.field836.method2081(var11.field1967, arg3);
                                        class132 var58 = var11.field1986 ? class492.field6935.field6296 : null;
                                        var53 = var56.method268(var58, var11.field2011, 1, var11.field2052, false, class141.field1878, 1024, var57, var11.field1990);
                                        if (var53 == null) {
                                            class22.method148((byte) -78, var11);
                                        } else {
                                            var54 = -var53.method1289() / 2;
                                        }
                                    }
                                } else if (var11.field2061 == 5) {
                                    int var59 = var11.field1959;
                                    if (var59 >= 0 && var59 < 2048) {
                                        class452 var60 = class124.field1559[var59];
                                        class153 var61 = var11.field1967 == -1 ? null : class64.field836.method2081(var11.field1967, 0);
                                        if (var60 != null && (class295.field4273 == var59 || class284.method1788(var60.field6277, 2591) == var11.field2013)) {
                                            var53 = var60.field6296.method828(var11.field1990, true, -1, class459.field6436, var11.field2052, (class153) null, class140.field1859, 0, (byte) -5, class427.field5982, (class360[]) null, class64.field834, class265.field3859, var61, 1024, 0, class141.field1878, var11.field2011, class64.field836);
                                        }
                                    }
                                } else if (var11.field2061 == 8 || var11.field2061 == 9) {
                                    class456 var63 = class264.method1626(0, var11.field1959, false);
                                    class153 var64 = var11.field1967 == -1 ? null : class64.field836.method2081(var11.field1967, 0);
                                    if (var63 != null) {
                                        class132 var65 = var11.field1986 ? class492.field6935.field6296 : null;
                                        var53 = var63.method2677((byte) 124, 1024, class141.field1878, var11.field2013, var11.field2011, var65, var11.field1990, var64, var11.field2052, var11.field2061 == 9);
                                    }
                                } else if (var11.field1967 == -1) {
                                    var53 = var11.method901(class459.field6436, 0, 1024, class427.field5982, 127, (class153) null, class265.field3859, class64.field836, class492.field6935.field6296, -1, class141.field1878, class64.field834, class140.field1859, -1);
                                    if (var53 == null && class460.field6452) {
                                        class22.method148((byte) -78, var11);
                                    }
                                } else {
                                    class153 var62 = class64.field836.method2081(var11.field1967, 0);
                                    var53 = var11.method901(class459.field6436, var11.field1990, 1024, class427.field5982, 127, var62, class265.field3859, class64.field836, class492.field6935.field6296, var11.field2052, class141.field1878, class64.field834, class140.field1859, var11.field2011);
                                    if (var53 == null && class460.field6452) {
                                        class22.method148((byte) -78, var11);
                                    }
                                }
                                if (var53 != null) {
                                    int var66;
                                    if (var11.field1984 > 0) {
                                        var66 = (var11.field2010 << 9) / var11.field1984;
                                    } else {
                                        var66 = 512;
                                    }
                                    int var67;
                                    if (var11.field2055 <= 0) {
                                        var67 = 512;
                                    } else {
                                        var67 = (var11.field2021 << 9) / var11.field2055;
                                    }
                                    int var68 = (var11.field2033 * var66 >> 9) + var13 + (var11.field2010 / 2);
                                    int var69 = (var11.field2047 * var67 >> 9) + var11.field2021 / 2 + var14;
                                    class478.field6711.method1017();
                                    class141.field1878.method609(class478.field6711);
                                    int var70 = class53.field727[var11.field2053 << 3] * var11.field2020 >> 15;
                                    int var71 = class53.field726[var11.field2053 << 3] * var11.field2020 >> 15;
                                    class141.field1878.method604(var68, var69, var66, var67);
                                    class141.field1878.method686((float) var11.field2009, var11.field2031 ? (float) var11.field1991 : (float) var11.field1991 * 1.5F);
                                    if (arg0 == -1412584499 || class259.field3799) {
                                        class141.field1878.method691();
                                        class141.field1878.method679();
                                        class141.field1878.method617(arg7, arg2, arg5, arg9);
                                        class259.field3799 = false;
                                    }
                                    if (var11.field1946) {
                                        class141.field1878.method618(false);
                                    }
                                    class282.field4150.method1010(-var11.field1954 << 3);
                                    class282.field4150.method1020(var11.field1994 << 3);
                                    class282.field4150.method1012(var11.field2028, var54 + var70 + var11.field1975, var11.field1975 + var71);
                                    class282.field4150.method1018(var11.field2053 << 3);
                                    if (class29.field395) {
                                        class141.field1878.method669(var13, var14, var11.field2010 + var13, var14 - -var11.field2021);
                                    }
                                    if (var11.field2031) {
                                        var53.method1314(class282.field4150, (class98) null, var11.field2020, 1);
                                    } else {
                                        var53.method1323(class282.field4150, (class98) null, 1);
                                    }
                                    if (class29.field395) {
                                        class141.field1878.method617(arg7, arg2, arg5, arg9);
                                    }
                                    if (var11.field1946) {
                                        class141.field1878.method618(true);
                                    }
                                }
                            } else if (var11.field2073 == 9) {
                                int var72;
                                int var73;
                                int var74;
                                int var75;
                                if (var11.field2056) {
                                    var72 = var14;
                                    var73 = var11.field2010 + var13;
                                    var74 = var14 + var11.field2021;
                                    var75 = var13;
                                } else {
                                    var72 = var14 + var11.field2021;
                                    var73 = var11.field2010 + var13;
                                    var74 = var14;
                                    var75 = var13;
                                }
                                if (var11.field1927 == 1) {
                                    class141.field1878.method699(var75, var74, var73, var72, var11.field2001, 0);
                                } else {
                                    class141.field1878.method611(var75, var74, var73, var72, var11.field2001, var11.field1927, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2173(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
