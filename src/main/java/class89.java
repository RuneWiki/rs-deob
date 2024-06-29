import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class89 {

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field1935 = -1;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static volatile int field1937 = 0;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Llc;")
    public static class69 field1939 = class69.method470((byte) -118, "Examine @lre@");

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lfe;")
    public static class36 field1936 = new class36(260);

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field1941 = 0;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Llc;")
    public static class69 field1943 = class69.method470((byte) -128, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "Llc;")
    public static class69 field1946 = class69.method470((byte) -97, "Create a free account");

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "Llc;")
    public static class69 field1944 = class69.method470((byte) -103, " @gre@");

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "Llc;")
    public static class69 field1945 = class69.method470((byte) -110, "Malformed login packet)3");

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Z")
    public static boolean field1940 = false;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field1947 = 78;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)V")
    public static final void method626(int arg0, byte arg1) {
        field1938++;
        if (class125.field2705 == arg0) {
            return;
        }
        if (class125.field2705 == 0) {
            class50.method329(-67);
        }
        if (arg0 == 20 || arg0 == 40) {
            class19.field424 = 0;
            class110.field2423 = 0;
            class67.field1404 = 0;
        }
        if (arg1 != 112) {
            field1943 = null;
        }
        if (arg0 != 20 && arg0 != 40 && class102.field2211 != null) {
            class102.field2211.method564(1);
        }
        if (class125.field2705 == 25 || class125.field2705 == 40) {
            class76.method535(false);
            class95.method729();
        }
        if (class125.field2705 == 25) {
            class110.field2414 = 1;
            class78.field1774 = 0;
            class64.field1350 = 0;
            class114.field2470 = 0;
            class56.field1173 = 1;
        }
        if (arg0 == 0 || arg0 == 35) {
            class70.method500(arg1 ^ 0x7777);
            class35.method216(-64);
            if (class16.field318 == null) {
                class16.field318 = class55.method345((byte) 108, class83.method597((byte) -51), 503, 765);
            }
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class16.field318 = null;
            class70.method500(30471);
            class127.method931(class83.method597((byte) -51), 0, class46.field958, class16.field315);
        }
        if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
            class16.field318 = null;
            class35.method216(95);
            class90.method638(class83.method597((byte) -51), -11508, class16.field315);
        }
        class62.field1285 = true;
        class125.field2705 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)Lia;")
    public static final class49 method627(byte arg0, int arg1) {
        field1932++;
        class49 var2 = (class49) class70.field1559.method224((long) arg1, (byte) 116);
        if (var2 != null) {
            return var2;
        }
        class49 var3 = class70.method498(false, (byte) 126, class71.field1589, arg1, class106.field2304);
        if (var3 != null) {
            class70.field1559.method221(var3, true, (long) arg1);
        }
        return arg0 == 21 ? var3 : null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static final void method628(int arg0) {
        if (arg0 < 120) {
            field1945 = null;
        }
        field1930++;
        int var1 = class3.field22.method181(8, 8);
        if (class27.field585 > var1) {
            for (int var2 = var1; var2 < class27.field585; var2++) {
                class91.field1982[class120.field2569++] = class92.field2013[var2];
            }
        }
        if (var1 > class27.field585) {
            throw new RuntimeException("gppov1");
        }
        class27.field585 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class92.field2013[var3];
            class60 var5 = class123.field2682[var4];
            int var6 = class3.field22.method181(1, 8);
            if (var6 == 0) {
                class92.field2013[class27.field585++] = var4;
                var5.field1088 = class62.field1282;
            } else {
                int var7 = class3.field22.method181(2, 8);
                if (var7 == 0) {
                    class92.field2013[class27.field585++] = var4;
                    var5.field1088 = class62.field1282;
                    class108.field2410[class77.field1746++] = var4;
                } else if (var7 == 1) {
                    class92.field2013[class27.field585++] = var4;
                    var5.field1088 = class62.field1282;
                    int var8 = class3.field22.method181(3, 8);
                    var5.method324(false, var8, (byte) 22);
                    int var9 = class3.field22.method181(1, 8);
                    if (var9 == 1) {
                        class108.field2410[class77.field1746++] = var4;
                    }
                } else if (var7 == 2) {
                    class92.field2013[class27.field585++] = var4;
                    var5.field1088 = class62.field1282;
                    int var10 = class3.field22.method181(3, 8);
                    var5.method324(true, var10, (byte) -96);
                    int var11 = class3.field22.method181(3, 8);
                    var5.method324(true, var11, (byte) -107);
                    int var12 = class3.field22.method181(1, 8);
                    if (var12 == 1) {
                        class108.field2410[class77.field1746++] = var4;
                    }
                } else if (var7 == 3) {
                    class91.field1982[class120.field2569++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIII)I")
    public static final int method629(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1931++;
        int var7 = arg5 & 0x3;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg2;
            arg2 = arg3;
            arg3 = var8;
        }
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return 7 + 1 - arg0 - arg2;
        } else {
            if (arg1 != -26976) {
                field1945 = null;
            }
            return var7 == 2 ? 1 + 7 - arg3 - arg6 : arg0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public static void method630(int arg0) {
        field1943 = null;
        field1944 = null;
        field1946 = null;
        field1936 = null;
        field1939 = null;
        field1945 = null;
        if (arg0 >= -50) {
            field1942 = -24;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Ltd;")
    public static final class114 method631(int arg0, int arg1) {
        field1934++;
        if (arg0 <= 17) {
            return null;
        }
        class114 var2 = (class114) class115.field2498.method224((long) arg1, (byte) 126);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class4.field84.method394(13, arg1, (byte) -101);
        class114 var4 = new class114();
        var4.field2491 = arg1;
        if (var3 != null) {
            var4.method836(-1, new class94(var3));
        }
        class115.field2498.method221(var4, true, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILk;I)V")
    public static final void method632(int arg0, int arg1, class60 arg2, int arg3) {
        if ((arg0 & 0x80) != 0) {
            arg2.field1076 = class3.field22.method670(-123);
            if (arg2.field1076 == 65535) {
                arg2.field1076 = -1;
            }
        }
        if ((arg0 & 0x40) != 0) {
            int var4 = class3.field22.method709(arg3 + 14772);
            byte[] var5 = new byte[var4];
            class94 var6 = new class94(var5);
            class3.field22.method682(0, var5, var4, arg3 + 14816);
            class4.field95[arg1] = var6;
            arg2.method362(65535, var6);
        }
        if (arg3 != -14832) {
            return;
        }
        field1933++;
        if ((arg0 & 0x10) != 0) {
            arg2.field1054 = class3.field22.method708(-23522);
            if (arg2.field1054.method480(0, false) == 126) {
                arg2.field1054 = arg2.field1054.method486(1, (byte) -102);
                class87.method619(arg2.field1054, true, 2, arg2.field1222);
            } else if (class46.field974 == arg2) {
                class87.method619(arg2.field1054, true, 2, arg2.field1222);
            }
            arg2.field1066 = 0;
            arg2.field1056 = 0;
            arg2.field1026 = 150;
        }
        if ((arg0 & 0x8) != 0) {
            int var7 = class3.field22.method670(-117);
            int var8 = class3.field22.method709(-71);
            if (var7 == 65535) {
                var7 = -1;
            }
            if (arg2.field1070 == var7 && var7 != -1) {
                int var9 = class67.method435(99, var7).field1648;
                if (var9 == 1) {
                    arg2.field1033 = 0;
                    arg2.field1032 = var8;
                    arg2.field1022 = 0;
                    arg2.field1025 = 0;
                }
                if (var9 == 2) {
                    arg2.field1025 = 0;
                }
            } else if (var7 == -1 || arg2.field1070 == -1 || class67.method435(120, var7).field1665 >= class67.method435(arg3 + 14902, arg2.field1070).field1665) {
                arg2.field1032 = var8;
                arg2.field1025 = 0;
                arg2.field1044 = arg2.field1048;
                arg2.field1033 = 0;
                arg2.field1070 = var7;
                arg2.field1022 = 0;
            }
        }
        if ((arg0 & 0x100) != 0) {
            arg2.field1046 = class3.field22.method709(arg3 + 14763);
            arg2.field1096 = class3.field22.method666(3053);
            arg2.field1089 = class3.field22.method709(-68);
            arg2.field1047 = class3.field22.method709(-35);
            arg2.field1075 = class3.field22.method670(-114) + class62.field1282;
            arg2.field1085 = class3.field22.method705(-107) + class62.field1282;
            arg2.field1039 = class3.field22.method666(3053);
            arg2.method328((byte) -108);
        }
        if ((arg0 & 0x400) != 0) {
            arg2.field1043 = class3.field22.method705(-31);
            int var10 = class3.field22.method667(arg3 + 20643);
            arg2.field1091 = var10 >> 16;
            if (arg2.field1043 == 65535) {
                arg2.field1043 = -1;
            }
            arg2.field1023 = 0;
            arg2.field1036 = (var10 & 0xFFFF) + class62.field1282;
            arg2.field1028 = 0;
            if (arg2.field1036 > class62.field1282) {
                arg2.field1028 = -1;
            }
        }
        if ((arg0 & 0x1) != 0) {
            int var11 = class3.field22.method670(arg3 + 14704);
            int var12 = class3.field22.method709(arg3 + 14778);
            int var13 = class3.field22.method709(-89);
            int var14 = class3.field22.field2061;
            if (arg2.field1222 != null && arg2.field1224 != null) {
                long var15 = arg2.field1222.method465(1);
                boolean var17 = false;
                if (var12 <= 1) {
                    for (int var18 = 0; var18 < class104.field2271; var18++) {
                        if (class22.field470[var18] == var15) {
                            var17 = true;
                            break;
                        }
                    }
                }
                if (!var17 && class81.field1836 == 0) {
                    class85.field1897.field2061 = 0;
                    class3.field22.method682(0, class85.field1897.field2077, var13, -69);
                    class85.field1897.field2061 = 0;
                    class69 var19 = class33.method210(126, class85.field1897).method485((byte) -90);
                    arg2.field1056 = var11 >> 8;
                    arg2.field1054 = var19;
                    arg2.field1026 = 150;
                    arg2.field1066 = var11 & 0xFF;
                    if (var12 == 2 || var12 == 3) {
                        class87.method619(var19, true, 1, class46.method305(arg3 + 34857, new class69[] { class9.field191, arg2.field1222 }));
                    } else if (var12 == 1) {
                        class87.method619(var19, true, 1, class46.method305(20025, new class69[] { class47.field989, arg2.field1222 }));
                    } else {
                        class87.method619(var19, true, 2, arg2.field1222);
                    }
                }
            }
            class3.field22.field2061 = var13 + var14;
        }
        if ((arg0 & 0x200) != 0) {
            int var20 = class3.field22.method703((byte) -116);
            int var21 = class3.field22.method703((byte) -128);
            arg2.method326(class62.field1282, 100, var21, var20);
            arg2.field1078 = class62.field1282 + 300;
            arg2.field1040 = class3.field22.method666(3053);
            arg2.field1052 = class3.field22.method709(arg3 + 14766);
        }
        if ((arg0 & 0x20) != 0) {
            int var22 = class3.field22.method694(-19);
            int var23 = class3.field22.method703((byte) -120);
            arg2.method326(class62.field1282, 122, var23, var22);
            arg2.field1078 = class62.field1282 + 300;
            arg2.field1040 = class3.field22.method666(3053);
            arg2.field1052 = class3.field22.method666(3053);
        }
        if ((arg0 & 0x2) != 0) {
            arg2.field1098 = class3.field22.method670(-116);
            arg2.field1030 = class3.field22.method705(-37);
        }
    }
}
