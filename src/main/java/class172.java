import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class172 extends class25 {

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Lcd;")
    public static class64 field2964 = class44.method335((byte) 71, "gleiten:");

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Lcd;")
    public static class64 field2966 = class44.method335((byte) 71, "<col=ffffff>");

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field2971 = 0;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field2970 = 0;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public int field2967;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public int field2972;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Lqi;", line = 50)
    public static final class290 method1207(int arg0, int arg1) {
        field2969++;
        class290 var2 = (class290) class146.field2574.method1194((long) arg0, (byte) -57);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class114.field2093.method1580(0, class213.method1504(-116, arg0), class124.method902((byte) -114, arg0));
        class290 var4 = new class290();
        var4.field4962 = arg0;
        if (var3 != null) {
            var4.method2005(new class13(var3), false);
        }
        var4.method2011((byte) -59);
        if (!class138.field2454 && var4.field4995) {
            var4.field4956 = null;
        }
        if (var4.field4977) {
            var4.field5021 = false;
            var4.field4966 = 0;
        }
        class146.field2574.method1190(12669, var4, (long) arg0);
        if (arg1 >= -110) {
            method1208(-15);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V", line = 85)
    public static void method1208(int arg0) {
        field2964 = null;
        field2966 = null;
        if (arg0 != 0) {
            field2965 = 116;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lja;IIZ)V", line = 104)
    public static final void method1209(class60 arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            return;
        }
        field2973++;
        if (arg0.field1179 == 1) {
            class248.method1792(class188.field3240, 0, arg0.field1080, (byte) 124, 0L, (short) 20, arg0.field1162);
            class180.field3082++;
        }
        if (arg0.field1179 == 2 && !class42.field690) {
            class64 var4 = class92.method705(0, arg0);
            if (var4 != null) {
                class248.method1792(class104.method768(new class64[] { class117.field2142, arg0.field1086 }, false), -1, arg0.field1080, (byte) 123, 0L, (short) 2, var4);
                class201.field3445++;
            }
        }
        if (arg0.field1179 == 3) {
            class248.method1792(class188.field3240, 0, arg0.field1080, (byte) 121, 0L, (short) 33, class240.field4112);
            class238.field4030++;
        }
        if (arg0.field1179 == 4) {
            class248.method1792(class188.field3240, 0, arg0.field1080, (byte) -49, 0L, (short) 58, arg0.field1162);
            class143.field2510++;
        }
        if (arg0.field1179 == 5) {
            class248.method1792(class188.field3240, 0, arg0.field1080, (byte) -90, 0L, (short) 5, arg0.field1162);
            class6.field110++;
        }
        if (arg0.field1179 == 6 && class106.field1952 == null) {
            class313.field5315++;
            class248.method1792(class188.field3240, -1, arg0.field1080, (byte) -127, 0L, (short) 29, arg0.field1162);
        }
        if (arg0.field1091 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field1134; var6++) {
                for (int var7 = 0; var7 < arg0.field1161; var7++) {
                    int var8 = (arg0.field1074 + 32) * var7;
                    int var9 = (arg0.field1098 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field1103[var5];
                        var9 += arg0.field1115[var5];
                    }
                    if (var8 <= arg2 && var9 <= arg1 && arg2 < (var8 + 32) && var9 + 32 > arg1) {
                        class69.field1328 = arg0;
                        class70.field1347 = var5;
                        if (arg0.field1117[var5] > 0) {
                            class92 var10 = class132.method949(arg0.field1117[var5] - 1, false);
                            if (class77.field1453 == 1 && class190.method1346(client.method1762(arg0), (byte) 124)) {
                                if (class108.field2001 != arg0.field1080 || class107.field1976 != var5) {
                                    class248.method1792(class104.method768(new class64[] { class32.field534, class53.field855, var10.field1669 }, false), var5, arg0.field1080, (byte) 122, (long) var10.field1654, (short) 4, class213.field3588);
                                    class60.field1014++;
                                }
                            } else if (!class42.field690 || !class190.method1346(client.method1762(arg0), (byte) 115)) {
                                class62.field1208++;
                                class64[] var11 = var10.field1682;
                                if (class220.field3719) {
                                    var11 = class269.method1885((byte) 26, var11);
                                }
                                if (class190.method1346(client.method1762(arg0), (byte) 114)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class284.field4883++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 46;
                                            } else {
                                                var13 = 39;
                                            }
                                            class248.method1792(class104.method768(new class64[] { class190.field3261, var10.field1669 }, false), var5, arg0.field1080, (byte) 121, (long) var10.field1654, var13, var11[var12]);
                                        } else if (var12 == 4) {
                                            class248.method1792(class104.method768(new class64[] { class190.field3261, var10.field1669 }, false), var5, arg0.field1080, (byte) 127, (long) var10.field1654, (short) 39, class92.field1717);
                                            client.field4176++;
                                        }
                                    }
                                }
                                if (class137.method977((byte) -50, client.method1762(arg0))) {
                                    class17.field342++;
                                    class248.method1792(class104.method768(new class64[] { class190.field3261, var10.field1669 }, false), var5, arg0.field1080, (byte) -98, (long) var10.field1654, (short) 40, class213.field3588);
                                }
                                if (class190.method1346(client.method1762(arg0), (byte) 117) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 6;
                                            }
                                            class135.field2409++;
                                            if (var14 == 1) {
                                                var15 = 30;
                                            }
                                            if (var14 == 2) {
                                                var15 = 15;
                                            }
                                            class248.method1792(class104.method768(new class64[] { class190.field3261, var10.field1669 }, false), var5, arg0.field1080, (byte) 123, (long) var10.field1654, var15, var11[var14]);
                                        }
                                    }
                                }
                                class64[] var16 = arg0.field1090;
                                if (class220.field3719) {
                                    var16 = class269.method1885((byte) 26, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class166.field2905++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 32;
                                            }
                                            if (var17 == 1) {
                                                var18 = 50;
                                            }
                                            if (var17 == 2) {
                                                var18 = 21;
                                            }
                                            if (var17 == 3) {
                                                var18 = 17;
                                            }
                                            if (var17 == 4) {
                                                var18 = 1;
                                            }
                                            class248.method1792(class104.method768(new class64[] { class190.field3261, var10.field1669 }, false), var5, arg0.field1080, (byte) -65, (long) var10.field1654, var18, var16[var17]);
                                        }
                                    }
                                }
                                class248.method1792(class104.method768(new class64[] { class190.field3261, var10.field1669 }, !arg3), var5, arg0.field1080, (byte) 121, (long) var10.field1654, (short) 1003, class107.field1983);
                            } else if ((class164.field2883 & 0x10) == 16) {
                                class248.method1792(class104.method768(new class64[] { class103.field1891, class53.field855, var10.field1669 }, false), var5, arg0.field1080, (byte) 127, (long) var10.field1654, (short) 22, class43.field708);
                                class26.field421++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field1017) {
            return;
        }
        if (!class42.field690) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class64 var20 = class11.method92((byte) -49, arg0, var19);
                if (var20 != null) {
                    class224.field3825++;
                    class248.method1792(arg0.field1142, arg0.field1167, arg0.field1080, (byte) -98, (long) (var19 + 1), (short) 1002, var20);
                }
            }
            class64 var21 = class92.method705(0, arg0);
            if (var21 != null) {
                class201.field3445++;
                class248.method1792(arg0.field1142, arg0.field1167, arg0.field1080, (byte) 124, 0L, (short) 2, var21);
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class64 var23 = class11.method92((byte) -49, arg0, var22);
                if (var23 != null) {
                    class248.method1792(arg0.field1142, arg0.field1167, arg0.field1080, (byte) 122, (long) (var22 + 1), (short) 57, var23);
                    class224.field3825++;
                }
            }
            if (class80.method624(!arg3, client.method1762(arg0))) {
                class248.method1792(class188.field3240, arg0.field1167, arg0.field1080, (byte) 121, 0L, (short) 29, class220.field3723);
                class313.field5315++;
            }
        } else if (class29.method252((byte) -13, client.method1762(arg0)) && (class164.field2883 & 0x20) == 32) {
            class248.method1792(class104.method768(new class64[] { class103.field1891, class252.field4386, arg0.field1142 }, false), arg0.field1167, arg0.field1080, (byte) 124, 0L, (short) 8, class43.field708);
            class270.field4660++;
        }
    }
}
