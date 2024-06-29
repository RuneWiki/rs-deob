import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class142 {

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "[[S")
    public static short[][] field2036 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method918(int arg0, Throwable arg1, String arg2) {
        field2039++;
        try {
            if (arg0 != -1) {
                method922((byte) -104);
            }
            String var3 = "";
            if (arg1 != null) {
                var3 = class286.method1912((byte) 98, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class179.method1168((byte) 102, var3);
            String var4 = class282.method1867(var3, ":", "%3a", -61);
            String var5 = class282.method1867(var4, "@", "%40", arg0 - 89);
            String var6 = class282.method1867(var5, "&", "%26", 120);
            String var7 = class282.method1867(var6, "#", "%23", arg0 - 23);
            if (class136.field1981.field664 != null) {
                class81 var8 = class136.field1981.method345(new URL(class136.field1981.field664.getCodeBase(), "clienterror.ws?c=" + class15.field190 + "&u=" + class296.field4680 + "&v1=" + class56.field653 + "&v2=" + class56.field668 + "&e=" + var7), (byte) 80);
                while (var8.field960 == 0) {
                    class247.method1595(1L, (byte) -83);
                }
                if (var8.field960 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field958;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILwe;I)V")
    public static final void method919(int arg0, int arg1, class82 arg2, int arg3) {
        if (arg2.field1130 == 1) {
            class176.method1143(4, 0, (short) 6, arg2.field1025, -1, "", arg2.field1027, 0L);
            class287.field4457++;
        }
        field2041++;
        if (arg2.field1130 == 2 && !class267.field3857) {
            String var4 = class119.method766(0, arg2);
            if (var4 != null) {
                class266.field3840++;
                class176.method1143(4, -1, (short) 35, arg2.field1025, -1, "<col=00ff00>" + arg2.field975, var4, 0L);
            }
        }
        if (arg2.field1130 == 3) {
            class176.method1143(4, 0, (short) 8, arg2.field1025, -1, "", client.field4452, 0L);
            class272.field3982++;
        }
        if (arg1 != 5681) {
            field2036 = null;
        }
        if (arg2.field1130 == 4) {
            class176.method1143(4, 0, (short) 41, arg2.field1025, -1, "", arg2.field1027, 0L);
            class199.field2829++;
        }
        if (arg2.field1130 == 5) {
            class176.method1143(4, 0, (short) 29, arg2.field1025, -1, "", arg2.field1027, 0L);
            class131.field1889++;
        }
        if (arg2.field1130 == 6 && class165.field2365 == null) {
            class158.field2289++;
            class176.method1143(arg1 ^ 0x1635, -1, (short) 17, arg2.field1025, -1, "", arg2.field1027, 0L);
        }
        if (arg2.field1026 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field1060; var6++) {
                for (int var7 = 0; var7 < arg2.field997; var7++) {
                    int var8 = (arg2.field1035 + 32) * var7;
                    int var9 = (arg2.field1011 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg2.field993[var5];
                        var9 += arg2.field991[var5];
                    }
                    if (arg3 >= var8 && var9 <= arg0 && (var8 + 32) > arg3 && var9 + 32 > arg0) {
                        class270.field3948 = var5;
                        class149.field2172 = arg2;
                        if (arg2.field1080[var5] > 0) {
                            class178 var10 = client.method1920(arg2);
                            class229 var11 = class36.method224(arg2.field1080[var5] - 1, 100);
                            if (class196.field2790 == 1 && var10.method1152(28406)) {
                                if (class130.field1885 != arg2.field1025 || class270.field3947 != var5) {
                                    class243.field3529++;
                                    class176.method1143(4, var5, (short) 25, arg2.field1025, -1, class107.field1444 + " -> <col=ff9040>" + var11.field3235, class26.field314, (long) var11.field3244);
                                }
                            } else if (class267.field3857 && var10.method1152(28406)) {
                                class139 var12 = class227.field3201 == -1 ? null : class16.method99(class227.field3201, -31836);
                                if ((class282.field4263 & 0x10) != 0 && (var12 == null || var11.method1495(var12.field2019, class227.field3201, (byte) 103) != var12.field2019)) {
                                    class176.method1143(4, var5, (short) 16, arg2.field1025, class268.field3916, class48.field560 + " -> <col=ff9040>" + var11.field3235, class133.field1945, (long) var11.field3244);
                                    class173.field2465++;
                                }
                            } else {
                                class227.field3198++;
                                String[] var13 = var11.field3287;
                                if (class149.field2171) {
                                    var13 = class103.method624(var13, (byte) 102);
                                }
                                if (var10.method1152(arg1 + 22725)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class134.field1950++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 58;
                                            } else {
                                                var15 = 39;
                                            }
                                            class176.method1143(4, var5, var15, arg2.field1025, -1, "<col=ff9040>" + var11.field3235, var13[var14], (long) var11.field3244);
                                        }
                                    }
                                }
                                if (var10.method1154(arg1 ^ 0x1630)) {
                                    class176.method1143(arg1 ^ 0x1635, var5, (short) 33, arg2.field1025, class167.field2403, "<col=ff9040>" + var11.field3235, class26.field314, (long) var11.field3244);
                                    class53.field605++;
                                }
                                if (var10.method1152(28406) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class165.field2362++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 12;
                                            }
                                            if (var16 == 1) {
                                                var17 = 50;
                                            }
                                            if (var16 == 2) {
                                                var17 = 2;
                                            }
                                            class176.method1143(arg1 ^ 0x1635, var5, var17, arg2.field1025, -1, "<col=ff9040>" + var11.field3235, var13[var16], (long) var11.field3244);
                                        }
                                    }
                                }
                                String[] var18 = arg2.field1041;
                                if (class149.field2171) {
                                    var18 = class103.method624(var18, (byte) 102);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            byte var20 = 0;
                                            class45.field533++;
                                            if (var19 == 0) {
                                                var20 = 34;
                                            }
                                            if (var19 == 1) {
                                                var20 = 43;
                                            }
                                            if (var19 == 2) {
                                                var20 = 30;
                                            }
                                            if (var19 == 3) {
                                                var20 = 15;
                                            }
                                            if (var19 == 4) {
                                                var20 = 45;
                                            }
                                            class176.method1143(4, var5, var20, arg2.field1025, -1, "<col=ff9040>" + var11.field3235, var18[var19], (long) var11.field3244);
                                        }
                                    }
                                }
                                class176.method1143(arg1 ^ 0x1635, var5, (short) 1004, arg2.field1025, class263.field3816, "<col=ff9040>" + var11.field3235, class21.field251, (long) var11.field3244);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field1126) {
            return;
        }
        if (!class267.field3857) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var25 = class27.method164(var21, -29702, arg2);
                if (var25 != null) {
                    class176.method1143(4, arg2.field963, (short) 1001, arg2.field1025, class253.method1627(1, arg2, var21), arg2.field1021, var25, (long) (var21 + 1));
                    class217.field3078++;
                }
            }
            String var22 = class119.method766(0, arg2);
            if (var22 != null) {
                class266.field3840++;
                class176.method1143(4, arg2.field963, (short) 35, arg2.field1025, -1, arg2.field1021, var22, 0L);
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                String var24 = class27.method164(var23, arg1 - 35383, arg2);
                if (var24 != null) {
                    class217.field3078++;
                    class176.method1143(arg1 ^ 0x1635, arg2.field963, (short) 31, arg2.field1025, class253.method1627(1, arg2, var23), arg2.field1021, var24, (long) (var23 + 1));
                }
            }
            if (client.method1920(arg2).method1158((byte) -112)) {
                class158.field2289++;
                if (arg2.field1059 == null) {
                    class176.method1143(4, arg2.field963, (short) 17, arg2.field1025, -1, "", class159.field2308, 0L);
                    return;
                }
                class176.method1143(4, arg2.field963, (short) 17, arg2.field1025, -1, "", arg2.field1059, 0L);
                return;
            }
            return;
        }
        if (client.method1920(arg2).method1150(0) && (class282.field4263 & 0x20) != 0) {
            class176.method1143(4, arg2.field963, (short) 60, arg2.field1025, class268.field3916, class48.field560 + " -> " + arg2.field1021, class133.field1945, 0L);
            class243.field3536++;
            return;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method920(int arg0) {
        field2036 = null;
        if (arg0 > -33) {
            method919(91, 10, (class82) null, -124);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V")
    public static final void method921(int arg0, int arg1, int arg2) {
        field2038++;
        if (arg0 != 18528) {
            method920(-15);
        }
        class66 var3 = class6.method34(1, true, arg2);
        var3.method408(0);
        var3.field784 = arg1;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public static final void method922(byte arg0) {
        field2040++;
        class94.field1259.method592(98, false);
        for (class166 var1 = (class166) class189.field2705.method1890((byte) 122); var1 != null; var1 = (class166) class189.field2705.method1889(false)) {
            if (var1.field2381 == 0) {
                class252.method1619(true, 115, var1);
            }
        }
        if (arg0 != 114) {
            return;
        }
        class137.field1997++;
        if (class165.field2365 != null) {
            class255.method1632(16711680, class165.field2365);
            class165.field2365 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(JI)V")
    public static final void method923(long arg0, int arg1) {
        field2037++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class144.field2064 < 100 || class204.field2899) || class144.field2064 >= 200) {
            class225.method1455(class227.field3202, arg1 ^ 0xFFFFFF61, "", 0);
            return;
        }
        String var3 = class110.method686(arg0, true);
        for (int var4 = 0; var4 < class144.field2064; var4++) {
            if (class267.field3844[var4] == arg0) {
                class225.method1455(var3 + class105.field1430, -117, "", 0);
                return;
            }
        }
        if (arg1 != -201) {
            field2036 = null;
        }
        for (int var5 = 0; var5 < class185.field2675; var5++) {
            if (class209.field2945[var5] == arg0) {
                class225.method1455(class131.field1890 + var3 + class119.field1697, arg1 + 75, "", 0);
                return;
            }
        }
        if (var3.equals(class177.field2507.field3466)) {
            class225.method1455(class74.field892, 40, "", 0);
            return;
        }
        class82.field990[class144.field2064] = var3;
        class267.field3844[class144.field2064] = arg0;
        class221.field3126++;
        class143.field2046[class144.field2064] = 0;
        class59.field691[class144.field2064] = "";
        class274.field4102[class144.field2064] = 0;
        class287.field4455[class144.field2064] = false;
        class144.field2064++;
        class79.field934 = class176.field2500;
        class94.field1259.method592(158, false);
        class94.field1259.method1379(arg1 ^ 0xD1, arg0);
    }
}
