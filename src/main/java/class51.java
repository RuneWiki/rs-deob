import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class51 {

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Lbh;")
    public static class234 field578 = new class234();

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "[I")
    public static int[] field588 = new int[14];

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "[I")
    public static int[] field589 = new int[128];

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Lrc;")
    public static class9 field590 = new class9(64);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public int field587;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "[I")
    public static int[] field585;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public static final void method305(int arg0, String arg1, byte arg2) {
        field582++;
        String var3 = class107.method674(class249.method1603((byte) 46, arg1), (byte) 90);
        if (arg2 != 38) {
            field588 = null;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < class238.field3432; var5++) {
            class240 var6 = class253.field3656[class46.field540[var5]];
            if (var6 != null && var6.field3466 != null && var6.field3466.equalsIgnoreCase(var3)) {
                var4 = true;
                if (arg0 == 1) {
                    class246.field3575++;
                    class94.field1259.method592(255, false);
                    class94.field1259.method1373(0, -13985);
                    class94.field1259.method1383((byte) -124, class46.field540[var5]);
                } else if (arg0 == 4) {
                    class283.field4320++;
                    class94.field1259.method592(61, false);
                    class94.field1259.method1359(0, 0);
                    class94.field1259.method1364(class46.field540[var5], 1024);
                } else if (arg0 == 5) {
                    class94.field1259.method592(139, false);
                    class209.field2947++;
                    class94.field1259.method1403(-105, 0);
                    class94.field1259.method1364(class46.field540[var5], 1024);
                } else if (arg0 == 6) {
                    class94.field1259.method592(249, false);
                    class94.field1259.method1387(class46.field540[var5], 4);
                    class94.field1259.method1359(0, 0);
                    class68.field799++;
                } else if (arg0 == 7) {
                    class255.field3680++;
                    class94.field1259.method592(230, false);
                    class94.field1259.method1364(class46.field540[var5], arg2 + 986);
                    class94.field1259.method1403(-123, 0);
                }
                break;
            }
        }
        if (!var4) {
            class225.method1455(class286.field4432 + var3, 6, "", 0);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)V")
    public static final void method306(byte arg0, int arg1) {
        field583++;
        if (!class172.field2461) {
            arg1 = -1;
        }
        if (class219.field3107 == arg1) {
            return;
        }
        if (arg0 != 101) {
            field585 = null;
        }
        if (arg1 != -1) {
            class213 var2 = class280.method1837(arg1, (byte) 111);
            class187 var3 = var2.method1343(118);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class115.field1592.method353(var3.field1870, var3.method1226(), var3.field1881, class181.field2574, new Point(var2.field2980, var2.field2976), (byte) 94);
                class219.field3107 = arg1;
            }
        }
        if (arg1 == -1 && class219.field3107 != -1) {
            class115.field1592.method353(-1, (int[]) null, -1, class181.field2574, new Point(), (byte) 101);
            class219.field3107 = -1;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIBII)V")
    public static final void method307(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field584++;
        class155.method1022(arg3, arg0, arg1 + arg3, arg0 + arg4);
        class155.method1018(arg3, arg0, arg1, arg4, 0);
        if (class116.field1613 < 100) {
            return;
        }
        if (class293.field4640 == null || class293.field4640.field1882 != arg1 || class293.field4640.field1879 != arg4) {
            class187 var5 = new class187(arg1, arg4);
            class155.method1025(var5.field2691, arg1, arg4);
            class95.method570(0, client.field4446, arg4, 0, 0, 0, class133.field1940, true, arg1);
            class293.field4640 = var5;
            class74.field890.method147(arg2 - 6);
        }
        if (arg2 != -78) {
            method306((byte) -104, -97);
        }
        class293.field4640.method851(arg3, arg0);
        int var6 = class150.field2187 * arg4 / class133.field1940 + arg0;
        int var7 = class185.field2661 * arg1 / client.field4446;
        int var8 = class2.field31 * arg4 / class133.field1940;
        int var9 = class74.field885 * arg1 / client.field4446 + arg3;
        int var10 = 16711680;
        if (class5.field67 == 1) {
            var10 = 16777215;
        }
        class155.method1030(var9, var6, var7, var8, var10, 128);
        class155.method1020(var9, var6, var7, var8, var10);
        if (class259.field3767 <= 0) {
            return;
        }
        int var11;
        if (class87.field1184 <= 10) {
            var11 = class87.field1184 * 25;
        } else {
            var11 = 500 - (class87.field1184 * 25);
        }
        for (class261 var12 = (class261) class119.field1704.method1532(-70); var12 != null; var12 = (class261) class119.field1704.method1523(-55)) {
            if (class196.field2800 == var12.field3799) {
                int var13 = var12.field3796 * arg1 / client.field4446 + arg3;
                int var14 = var12.field3793 * arg4 / class133.field1940 + arg0;
                class155.method1030(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
    public static final void method308(boolean arg0) {
        field580++;
        int var1 = 0;
        if (arg0) {
            method306((byte) -44, 77);
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class296.method1973(class6.field94, var3, var2, true, -109, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method309(int arg0) {
        if (arg0 != 255) {
            field578 = null;
        }
        field585 = null;
        field588 = null;
        field590 = null;
        field589 = null;
        field578 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;Lwe;I)Ljava/lang/String;")
    public static final String method310(String arg0, class82 arg1, int arg2) {
        field581++;
        if (arg2 != 23500) {
            method307(-66, -100, (byte) -88, -74, -110);
        }
        if (arg0.indexOf("%") == -1) {
            return arg0;
        }
        while (true) {
            int var3 = arg0.indexOf("%1");
            if (var3 == -1) {
                while (true) {
                    int var4 = arg0.indexOf("%2");
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg0.indexOf("%3");
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg0.indexOf("%4");
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg0.indexOf("%5");
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg0.indexOf("%dns");
                                                    if (var8 == -1) {
                                                        return arg0;
                                                    }
                                                    String var9 = "";
                                                    if (class84.field1159 != null) {
                                                        if (class84.field1159.field958 == null) {
                                                            var9 = class129.method842(class84.field1159.field957, (byte) -88);
                                                        } else {
                                                            var9 = (String) class84.field1159.field958;
                                                        }
                                                    }
                                                    arg0 = arg0.substring(0, var8) + var9 + arg0.substring(var8 + 4);
                                                }
                                            }
                                            arg0 = arg0.substring(0, var7) + class267.method1704(class228.method1479(4, arg1, (byte) 64), (byte) -76) + arg0.substring(var7 + 2);
                                        }
                                    }
                                    arg0 = arg0.substring(0, var6) + class267.method1704(class228.method1479(3, arg1, (byte) 105), (byte) -29) + arg0.substring(var6 + 2);
                                }
                            }
                            arg0 = arg0.substring(0, var5) + class267.method1704(class228.method1479(2, arg1, (byte) 85), (byte) -125) + arg0.substring(var5 + 2);
                        }
                    }
                    arg0 = arg0.substring(0, var4) + class267.method1704(class228.method1479(1, arg1, (byte) 118), (byte) -25) + arg0.substring(var4 + 2);
                }
            }
            arg0 = arg0.substring(0, var3) + class267.method1704(class228.method1479(0, arg1, (byte) 50), (byte) -39) + arg0.substring(var3 + 2);
        }
    }
}
