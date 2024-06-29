import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class281 {

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "Z")
    public static boolean field4464 = true;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field4457 = 0;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field4467 = 0;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "B")
    public byte field4470;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public int field4458;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "Ljava/lang/String;")
    public String field4462;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "Ljava/lang/String;")
    public String field4466;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "Ljava/lang/String;")
    public String field4468;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BI)Lrc;")
    public static final class10 method1822(byte arg0, int arg1) {
        class10 var2 = (class10) class70.field1005.method950((long) arg1, (byte) -45);
        field4456++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class265.field4270.method2050(115, class197.method1246((byte) 119, arg1), class21.method139(255, arg1));
        class10 var4 = new class10();
        if (arg0 > -92) {
            return null;
        }
        var4.field164 = arg1;
        if (var3 != null) {
            var4.method54(126, new class215(var3));
        }
        var4.method51((byte) 54);
        if (var4.field112 != -1) {
            var4.method58(method1822((byte) -127, var4.field120), 1, method1822((byte) -128, var4.field112));
        }
        if (var4.field148 != -1) {
            var4.method55(method1822((byte) -107, var4.field159), method1822((byte) -114, var4.field148), (byte) -49);
        }
        if (!class212.field3197 && var4.field113) {
            var4.field134 = class263.field4229;
            var4.field147 = class159.field2213;
            var4.field166 = 0;
            var4.field179 = class171.field2436;
            var4.field122 = false;
        }
        class70.field1005.method942((long) arg1, (byte) 7, var4);
        return var4;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lnh;B)V")
    public static final void method1823(class305 arg0, byte arg1) {
        field4463++;
        if (arg1 != -6) {
            method1823((class305) null, (byte) -120);
        }
        class139.field1931 = arg0;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILim;IB)V")
    public static final void method1824(int arg0, class178 arg1, int arg2, byte arg3) {
        if (arg1.field2590 == 1) {
            class230.field3601++;
            class82.method518(-1, (short) 50, arg1.field2543, "", arg1.field2545, 0, 0L, (byte) 116);
        }
        if (arg1.field2590 == 2 && !class193.field2950) {
            String var4 = class115.method736((byte) 34, arg1);
            if (var4 != null) {
                class78.field1082++;
                class82.method518(-1, (short) 6, var4, "<col=00ff00>" + arg1.field2547, arg1.field2545, -1, 0L, (byte) 103);
            }
        }
        field4459++;
        if (arg1.field2590 == 3) {
            class310.field4988++;
            class82.method518(-1, (short) 60, class75.field1060, "", arg1.field2545, 0, 0L, (byte) 74);
        }
        if (arg1.field2590 == 4) {
            class82.method518(-1, (short) 23, arg1.field2543, "", arg1.field2545, 0, 0L, (byte) 112);
            class81.field1118++;
        }
        if (arg1.field2590 == 5) {
            class21.field345++;
            class82.method518(-1, (short) 9, arg1.field2543, "", arg1.field2545, 0, 0L, (byte) 77);
        }
        if (arg1.field2590 == 6 && class76.field1074 == null) {
            class88.field1261++;
            class82.method518(-1, (short) 42, arg1.field2543, "", arg1.field2545, -1, 0L, (byte) 76);
        }
        if (arg1.field2608 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg1.field2660; var6++) {
                for (int var7 = 0; var7 < arg1.field2530; var7++) {
                    int var8 = (arg1.field2624 + 32) * var7;
                    int var9 = (arg1.field2587 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg1.field2680[var5];
                        var8 += arg1.field2679[var5];
                    }
                    if (var8 <= arg2 && var9 <= arg0 && arg2 < (var8 + 32) && arg0 < var9 + 32) {
                        client.field4853 = var5;
                        class10.field106 = arg1;
                        if (arg1.field2618[var5] > 0) {
                            class297 var10 = client.method2028(arg1);
                            class10 var11 = method1822((byte) -104, arg1.field2618[var5] - 1);
                            if (class265.field4266 == 1 && var10.method1989(41)) {
                                if (class288.field4593 != arg1.field2545 || class83.field1142 != var5) {
                                    class82.method518(-1, (short) 57, class95.field1367, class34.field521 + " -> <col=ff9040>" + var11.field147, arg1.field2545, var5, (long) var11.field164, (byte) 68);
                                    class282.field4488++;
                                }
                            } else if (class193.field2950 && var10.method1989(108)) {
                                class267 var12 = class8.field94 == -1 ? null : class218.method1422((byte) 104, class8.field94);
                                if ((class202.field3052 & 0x10) != 0 && (var12 == null || var11.method53(var12.field4294, class8.field94, (byte) -128) != var12.field4294)) {
                                    class82.method518(class121.field1729, (short) 28, class225.field3526, class166.field2353 + " -> <col=ff9040>" + var11.field147, arg1.field2545, var5, (long) var11.field164, (byte) 120);
                                    class232.field3635++;
                                }
                            } else {
                                class90.field1314++;
                                String[] var13 = var11.field134;
                                if (class26.field420) {
                                    var13 = class56.method352(-121, var13);
                                }
                                if (var10.method1989(69)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class301.field4786++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 13;
                                            } else {
                                                var15 = 40;
                                            }
                                            class82.method518(-1, var15, var13[var14], "<col=ff9040>" + var11.field147, arg1.field2545, var5, (long) var11.field164, (byte) 120);
                                        }
                                    }
                                }
                                if (var10.method2002((byte) -113)) {
                                    class251.field3929++;
                                    class82.method518(class256.field4085, (short) 34, class95.field1367, "<col=ff9040>" + var11.field147, arg1.field2545, var5, (long) var11.field164, (byte) 110);
                                }
                                if (var10.method1989(46) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class96.field1371++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 11;
                                            }
                                            if (var16 == 1) {
                                                var17 = 44;
                                            }
                                            if (var16 == 2) {
                                                var17 = 37;
                                            }
                                            class82.method518(-1, var17, var13[var16], "<col=ff9040>" + var11.field147, arg1.field2545, var5, (long) var11.field164, (byte) 74);
                                        }
                                    }
                                }
                                String[] var18 = arg1.field2535;
                                if (class26.field420) {
                                    var18 = class56.method352(-105, var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class238.field3696++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 24;
                                            }
                                            if (var19 == 1) {
                                                var20 = 59;
                                            }
                                            if (var19 == 2) {
                                                var20 = 15;
                                            }
                                            if (var19 == 3) {
                                                var20 = 10;
                                            }
                                            if (var19 == 4) {
                                                var20 = 30;
                                            }
                                            class82.method518(-1, var20, var18[var19], "<col=ff9040>" + var11.field147, arg1.field2545, var5, (long) var11.field164, (byte) 106);
                                        }
                                    }
                                }
                                class82.method518(class228.field3569, (short) 1002, class45.field668, "<col=ff9040>" + var11.field147, arg1.field2545, var5, (long) var11.field164, (byte) 62);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg3 > -95) {
            field4467 = 101;
        }
        if (!arg1.field2611) {
            return;
        }
        if (!class193.field2950) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var25 = class213.method1330(arg1, (byte) -50, var21);
                if (var25 != null) {
                    class68.field960++;
                    class82.method518(class165.method1052(true, arg1, var21), (short) 1009, var25, arg1.field2533, arg1.field2545, arg1.field2576, (long) (var21 + 1), (byte) 68);
                }
            }
            String var22 = class115.method736((byte) 34, arg1);
            if (var22 != null) {
                class78.field1082++;
                class82.method518(-1, (short) 6, var22, arg1.field2533, arg1.field2545, arg1.field2576, 0L, (byte) 61);
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                String var24 = class213.method1330(arg1, (byte) -50, var23);
                if (var24 != null) {
                    class68.field960++;
                    class82.method518(class165.method1052(true, arg1, var23), (short) 45, var24, arg1.field2533, arg1.field2545, arg1.field2576, (long) (var23 + 1), (byte) 124);
                }
            }
            if (client.method2028(arg1).method1997(false)) {
                if (arg1.field2705 == null) {
                    class82.method518(-1, (short) 42, class101.field1453, "", arg1.field2545, arg1.field2576, 0L, (byte) 106);
                } else {
                    class82.method518(-1, (short) 42, arg1.field2705, "", arg1.field2545, arg1.field2576, 0L, (byte) 68);
                }
                class88.field1261++;
                return;
            }
            return;
        }
        if (client.method2028(arg1).method1999(1) && (class202.field3052 & 0x20) != 0) {
            class82.method518(class121.field1729, (short) 3, class225.field3526, class166.field2353 + " -> " + arg1.field2533, arg1.field2545, arg1.field2576, 0L, (byte) 119);
            class50.field714++;
            return;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I")
    public static final int method1825(int arg0, int arg1) {
        if (arg0 < 6) {
            method1823((class305) null, (byte) -121);
        }
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        field4469++;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public static final void method1826(int arg0) {
        if (arg0 != -1) {
            method1822((byte) 20, -19);
        }
        field4465++;
        class143.field1964.method944(115);
        class119.field1706.method944(87);
    }
}
