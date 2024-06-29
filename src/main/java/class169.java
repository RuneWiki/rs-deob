import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class169 extends class125 {

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "Loa;")
    public class99 field3016;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public static int field3010 = 0;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "Loa;")
    public static class99 field3009 = class221.method1463(2844, "Memory before cleanup=");

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "[I")
    public static int[] field3013 = new int[128];

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "Loa;")
    public static class99 field3018 = null;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "Loa;")
    public static class99 field3014 = class221.method1463(2844, "Fps:");

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "[I")
    public static int[] field3008 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "Ltg;")
    public static class182 field3019;

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "[Lpi;")
    public static class139[] field3017;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ltf;IZII)V")
    public static final void method1143(class107 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        int var5 = arg0.field1793;
        int var6 = arg0.field1933;
        field3015++;
        if (arg0.field1918 == 0) {
            arg0.field1933 = arg0.field1825;
        } else if (arg0.field1918 == 1) {
            arg0.field1933 = arg3 - arg0.field1825;
        } else if (arg0.field1918 == 2) {
            arg0.field1933 = arg0.field1825 * arg3 >> 14;
        } else if (arg0.field1918 == 3) {
            if (arg0.field1814 == 2) {
                arg0.field1933 = (arg0.field1825 - 1) * arg0.field1899 + arg0.field1825 * 32;
            } else if (arg0.field1814 == 7) {
                arg0.field1933 = (arg0.field1825 - 1) * arg0.field1899 + arg0.field1825 * 115;
            }
        }
        if (arg0.field1809 == 0) {
            arg0.field1793 = arg0.field1936;
        } else if (arg0.field1809 == 1) {
            arg0.field1793 = arg1 - arg0.field1936;
        } else if (arg0.field1809 == 2) {
            arg0.field1793 = arg0.field1936 * arg1 >> 14;
        } else if (arg0.field1809 == 3) {
            if (arg0.field1814 == 2) {
                arg0.field1793 = (arg0.field1936 - 1) * arg0.field1836 + arg0.field1936 * 32;
            } else if (arg0.field1814 == 7) {
                arg0.field1793 = (arg0.field1936 - 1) * arg0.field1836 + arg0.field1936 * 12;
            }
        }
        if (arg0.field1918 == 4) {
            arg0.field1933 = arg0.field1886 * arg0.field1793 / arg0.field1904;
        }
        if (arg0.field1809 == 4) {
            arg0.field1793 = arg0.field1933 * arg0.field1904 / arg0.field1886;
        }
        if (class278.field4881 && (client.method1066(arg0) != 0 || arg0.field1814 == 0)) {
            if (arg0.field1793 < 5 && arg0.field1933 < 5) {
                arg0.field1933 = 5;
                arg0.field1793 = 5;
            } else {
                if (arg0.field1933 <= 0) {
                    arg0.field1933 = 5;
                }
                if (arg0.field1793 <= 0) {
                    arg0.field1793 = 5;
                }
            }
        }
        if (arg4 != 19) {
            return;
        }
        if (arg0.field1937 == 1337) {
            class28.field532 = arg0;
        }
        if (arg2 && arg0.field1924 != null && arg0.field1933 != var6 || arg0.field1793 != var5) {
            class260 var7 = new class260();
            var7.field4543 = arg0.field1924;
            var7.field4553 = arg0;
            class34.field612.method536(var7, (byte) -30);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILtf;IZ)V")
    public static final void method1144(int arg0, class107 arg1, int arg2, boolean arg3) {
        if (arg1.field1889 == 1) {
            class173.method1163(arg1.field1912, class20.field234, arg1.field1873, (short) 28, 113, 0, 0L);
            class138.field2434++;
        }
        field3020++;
        if (arg1.field1889 == 2 && !class54.field896) {
            class99 var4 = class288.method1934((byte) 93, arg1);
            if (var4 != null) {
                class287.field5023++;
                class173.method1163(var4, class198.method1332(111, new class99[] { class12.field106, arg1.field1885 }), arg1.field1873, (short) 21, 107, -1, 0L);
            }
        }
        if (arg1.field1889 == 3) {
            class54.field888++;
            class173.method1163(class151.field2655, class20.field234, arg1.field1873, (short) 17, 88, 0, 0L);
        }
        if (arg1.field1889 == 4) {
            class42.field711++;
            class173.method1163(arg1.field1912, class20.field234, arg1.field1873, (short) 46, 96, 0, 0L);
        }
        if (arg1.field1889 == 5) {
            class173.method1163(arg1.field1912, class20.field234, arg1.field1873, (short) 23, 125, 0, 0L);
            class239.field4130++;
        }
        if (arg1.field1889 == 6 && class137.field2411 == null) {
            class202.field3515++;
            class173.method1163(arg1.field1912, class20.field234, arg1.field1873, (short) 4, 85, -1, 0L);
        }
        if (arg1.field1814 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg1.field1936; var6++) {
                for (int var7 = 0; var7 < arg1.field1825; var7++) {
                    int var8 = (arg1.field1899 + 32) * var7;
                    int var9 = (arg1.field1836 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg1.field1828[var5];
                        var9 += arg1.field1891[var5];
                    }
                    if (var8 <= arg2 && arg0 >= var9 && (var8 + 32) > arg2 && arg0 < (var9 + 32)) {
                        class79.field1392 = arg1;
                        class167.field2975 = var5;
                        if (arg1.field1805[var5] > 0) {
                            class166 var10 = class222.method1468(1, arg1.field1805[var5] - 1);
                            if (class150.field2647 == 1 && class98.method652(client.method1066(arg1), (byte) -123)) {
                                if (class67.field1127 != arg1.field1873 || class19.field214 != var5) {
                                    class151.field2652++;
                                    class173.method1163(class258.field4503, class198.method1332(117, new class99[] { class63.field1074, class86.field1489, var10.field2963 }), arg1.field1873, (short) 3, 73, var5, (long) var10.field2957);
                                }
                            } else if (!class54.field896 || !class98.method652(client.method1066(arg1), (byte) -87)) {
                                class99[] var11 = var10.field2931;
                                if (class65.field1101) {
                                    var11 = class29.method251((byte) 66, var11);
                                }
                                if (class98.method652(client.method1066(arg1), (byte) -106)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 32;
                                            } else {
                                                var13 = 14;
                                            }
                                            class111.field2009++;
                                            class173.method1163(var11[var12], class198.method1332(113, new class99[] { class257.field4454, var10.field2963 }), arg1.field1873, var13, 116, var5, (long) var10.field2957);
                                        } else if (var12 == 4) {
                                            class166.field2969++;
                                            class173.method1163(class131.field2281, class198.method1332(104, new class99[] { class257.field4454, var10.field2963 }), arg1.field1873, (short) 14, 120, var5, (long) var10.field2957);
                                        }
                                    }
                                }
                                class94.field1590++;
                                if (class24.method183(client.method1066(arg1), 4860)) {
                                    class173.method1163(class258.field4503, class198.method1332(104, new class99[] { class257.field4454, var10.field2963 }), arg1.field1873, (short) 29, 79, var5, (long) var10.field2957);
                                    class38.field661++;
                                }
                                if (class98.method652(client.method1066(arg1), (byte) -128) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class290.field5067++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 13;
                                            }
                                            if (var14 == 1) {
                                                var15 = 36;
                                            }
                                            if (var14 == 2) {
                                                var15 = 43;
                                            }
                                            class173.method1163(var11[var14], class198.method1332(103, new class99[] { class257.field4454, var10.field2963 }), arg1.field1873, var15, 93, var5, (long) var10.field2957);
                                        }
                                    }
                                }
                                class99[] var16 = arg1.field1812;
                                if (class65.field1101) {
                                    var16 = class29.method251((byte) 66, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class196.field3418++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 38;
                                            }
                                            if (var17 == 1) {
                                                var18 = 24;
                                            }
                                            if (var17 == 2) {
                                                var18 = 26;
                                            }
                                            if (var17 == 3) {
                                                var18 = 48;
                                            }
                                            if (var17 == 4) {
                                                var18 = 9;
                                            }
                                            class173.method1163(var16[var17], class198.method1332(114, new class99[] { class257.field4454, var10.field2963 }), arg1.field1873, var18, 79, var5, (long) var10.field2957);
                                        }
                                    }
                                }
                                class173.method1163(class133.field2323, class198.method1332(69, new class99[] { class257.field4454, var10.field2963 }), arg1.field1873, (short) 1007, 70, var5, (long) var10.field2957);
                            } else if ((class33.field592 & 0x10) == 16) {
                                class173.method1163(field3018, class198.method1332(52, new class99[] { class93.field1562, class86.field1489, var10.field2963 }), arg1.field1873, (short) 7, 109, var5, (long) var10.field2957);
                                class267.field4706++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg1.field1915) {
            if (!class54.field896) {
                for (int var19 = 9; var19 >= 5; var19--) {
                    class99 var23 = class103.method718(arg1, var19, 0);
                    if (var23 != null) {
                        class173.method1163(var23, arg1.field1943, arg1.field1873, (short) 1002, 94, arg1.field1922, (long) (var19 + 1));
                        class284.field4951++;
                    }
                }
                class99 var20 = class288.method1934((byte) 42, arg1);
                if (var20 != null) {
                    class173.method1163(var20, arg1.field1943, arg1.field1873, (short) 21, 112, arg1.field1922, 0L);
                    class287.field5023++;
                }
                for (int var21 = 4; var21 >= 0; var21--) {
                    class99 var22 = class103.method718(arg1, var21, 0);
                    if (var22 != null) {
                        class173.method1163(var22, arg1.field1943, arg1.field1873, (short) 20, 108, arg1.field1922, (long) (var21 + 1));
                        class284.field4951++;
                    }
                }
                if (class43.method322(client.method1066(arg1), -18355)) {
                    class202.field3515++;
                    class173.method1163(class99.field1660, class20.field234, arg1.field1873, (short) 4, 84, arg1.field1922, 0L);
                }
            } else if (class222.method1471(true, client.method1066(arg1)) && (class33.field592 & 0x20) == 32) {
                class121.field2127++;
                class173.method1163(field3018, class198.method1332(58, new class99[] { class93.field1562, class103.field1749, arg1.field1943 }), arg1.field1873, (short) 19, 125, arg1.field1922, 0L);
            }
        }
        if (arg3) {
            field3017 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)V")
    public static final void method1145(int arg0, int arg1, int arg2, int arg3) {
        field3012++;
        if (arg1 != 25112) {
            method1143((class107) null, 32, true, -65, 9);
        }
        if (class262.field4636 == 0 || arg2 == 0 || class179.field3110 >= 50 || arg3 == -1) {
            return;
        }
        class267.field4711[class179.field3110] = arg3;
        class166.field2960[class179.field3110] = arg2;
        class171.field3044[class179.field3110] = arg0;
        class118.field2083[class179.field3110] = null;
        class227.field3926[class179.field3110] = 0;
        class179.field3110++;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static void method1146(int arg0) {
        field3017 = null;
        field3014 = null;
        field3009 = null;
        field3008 = null;
        field3013 = null;
        field3018 = null;
        if (arg0 == -4) {
            field3019 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "()V")
    public static final void method1147() {
        if (class288.field5054 != null) {
            for (int var0 = 0; var0 < class288.field5054.length; var0++) {
                for (int var1 = 0; var1 < class253.field4372; var1++) {
                    for (int var2 = 0; var2 < class172.field3051; var2++) {
                        class288.field5054[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class107.field1925 != null) {
            for (int var3 = 0; var3 < class107.field1925.length; var3++) {
                for (int var4 = 0; var4 < class253.field4372; var4++) {
                    for (int var5 = 0; var5 < class172.field3051; var5++) {
                        class107.field1925[var3][var4][var5] = null;
                    }
                }
            }
        }
        class60.field1003 = 0;
        if (class94.field1592 != null) {
            for (int var6 = 0; var6 < class60.field1003; var6++) {
                class94.field1592[var6] = null;
            }
        }
        if (class242.field4198 != null) {
            for (int var7 = 0; var7 < class288.field5032; var7++) {
                class242.field4198[var7] = null;
            }
            class288.field5032 = 0;
        }
        if (class198.field3451 != null) {
            for (int var8 = 0; var8 < class198.field3451.length; var8++) {
                class198.field3451[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class169() {
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Loa;)V")
    public class169(class99 arg0) {
        this.field3016 = arg0;
    }
}
