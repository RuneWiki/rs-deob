import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class127 extends class108 {

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
    public int field2070 = 0;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
    public int field2083 = -1;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "Lbv;")
    public static class567 field2086 = new class567("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!gm", name = "D", descriptor = "Laj;")
    public static class261 field2088 = new class261(5000);

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
    public int field2071;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
    public int field2072;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
    public int field2073;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
    public int field2074;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
    public int field2075;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    public int field2076;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
    public int field2078;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "I")
    public int field2081;

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "I")
    public int field2082;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "I")
    public int field2084;

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!gm", name = "E", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "Lnm;")
    public static class337 field2087;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gm", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field2090;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIII)V")
    public static final void method998(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if ((arg3 - arg4) >= class183.field2638 && class268.field3911 >= arg3 + arg4 && arg1 - arg4 >= class222.field3350 && class409.field6071 >= (arg1 + arg4)) {
            class302.method1883(arg2, arg1, arg4, (byte) -91, arg3);
        } else {
            class141.method1052(arg1, (byte) 65, arg3, arg4, arg2);
        }
        if (arg0 > 84) {
            field2085++;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method999(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2079++;
        if (arg3 >= 0 && arg6 >= 0 && (class146.field2247 - 1) > arg3 && (class66.field990 - 1) > arg6) {
            if (class277.field4051 == null) {
                return;
            }
            if (arg5 == 0) {
                class231 var12 = (class231) class507.method2859(arg2, arg3, arg6);
                class231 var13 = (class231) class343.method2093(arg2, arg3, arg6);
                if (var12 != null && arg0 != 2) {
                    if (var12 instanceof class631) {
                        ((class631) var12).field8855.method1917((byte) 81, arg1);
                    } else {
                        class421.method2534(arg0, arg4, arg2, arg3, (byte) 13, arg6, arg5, var12.method264(-25792), arg1);
                    }
                }
                if (var13 != null) {
                    if ((var13 instanceof class631)) {
                        ((class631) var13).field8855.method1917((byte) 83, arg1);
                    } else {
                        class421.method2534(arg0, arg4, arg2, arg3, (byte) 13, arg6, arg5, var13.method264(-25792), arg1);
                    }
                }
            } else if (arg5 == 1) {
                class231 var10 = (class231) class485.method2786(arg2, arg3, arg6);
                if (var10 != null) {
                    if ((var10 instanceof class28)) {
                        ((class28) var10).field383.method1917((byte) 123, arg1);
                    } else {
                        int var11 = var10.method264(-25792);
                        if (arg0 == 4 || arg0 == 5) {
                            class421.method2534(4, arg4, arg2, arg3, (byte) 13, arg6, arg5, var11, arg1);
                        } else if (arg0 == 6) {
                            class421.method2534(4, arg4 + 4, arg2, arg3, (byte) 13, arg6, arg5, var11, arg1);
                        } else if (arg0 == 7) {
                            class421.method2534(4, (arg4 + 2 & 0x3) + 4, arg2, arg3, (byte) 13, arg6, arg5, var11, arg1);
                        } else if (arg0 == 8) {
                            class421.method2534(4, arg4 + 4, arg2, arg3, (byte) 13, arg6, arg5, var11, arg1);
                            class421.method2534(4, (arg4 + 2 & 0x3) + 4, arg2, arg3, (byte) 13, arg6, arg5, var11, arg1);
                        }
                    }
                }
            } else if (arg5 == 2) {
                class231 var8 = (class231) class460.method2691(arg2, arg3, arg6, field2090 == null ? (field2090 = method1003("p")) : field2090);
                if (var8 != null) {
                    if (arg0 == 11) {
                        arg0 = 10;
                    }
                    if ((var8 instanceof class390)) {
                        ((class390) var8).field5829.method1917((byte) 106, arg1);
                    } else {
                        class421.method2534(arg0, arg4, arg2, arg3, (byte) 13, arg6, arg5, var8.method264(-25792), arg1);
                    }
                }
            } else if (arg5 == 3) {
                class231 var9 = (class231) class621.method3504(arg2, arg3, arg6);
                if (var9 != null) {
                    if ((var9 instanceof class332)) {
                        ((class332) var9).field4759.method1917((byte) 121, arg1);
                    } else {
                        class421.method2534(arg0, arg4, arg2, arg3, (byte) 13, arg6, arg5, var9.method264(-25792), arg1);
                    }
                }
            }
        }
        int var14 = 55 / ((60 - arg7) / 46);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZIIIIIII)V")
    public static final void method1000(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2080++;
        int var8 = arg2 + arg3;
        int var9 = arg4 - arg2;
        for (int var10 = arg3; var10 < var8; var10++) {
            class614.method3490(arg5, arg6, -119, class495.field6944[var10], arg7);
        }
        for (int var11 = arg4; var11 > var9; var11--) {
            class614.method3490(arg5, arg6, -88, class495.field6944[var11], arg7);
        }
        if (arg0) {
            method1002((byte) 82);
        }
        int var12 = arg2 + arg6;
        int var13 = arg7 - arg2;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class495.field6944[var14];
            class614.method3490(arg5, arg6, -93, var15, var12);
            class614.method3490(arg1, var12, -96, var15, var13);
            class614.method3490(arg5, var13, -105, var15, arg7);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILui;II)V")
    public static final void method1001(int arg0, class587 arg1, int arg2, int arg3) {
        field2077++;
        if (arg1 == null || class432.field6356.field659 == arg1) {
            return;
        }
        int var4 = arg1.field8369;
        int var5 = arg1.field8367;
        int var6 = arg1.field8359;
        int var7 = (int) arg1.field8365;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg1.field8365;
        if (var6 == 2) {
            class295.field4257 = 2;
            class55.field791 = arg2;
            class277.field4050 = arg3;
            class268.field3901++;
            class313.field4571 = 0;
            class624.method3537(-94, class270.field3969);
            field2088.method1710(class404.field6022.method2183(82, false) ? 1 : 0, 17);
            field2088.method1699(true, class68.field1296);
            field2088.method1702(class293.field4224, false);
            field2088.method1718(-3, class644.field9367.field1555);
            field2088.method1742(class388.field5795, false);
        }
        if (var6 == 60) {
            class181 var10 = (class181) class432.field6368.method740(0, (long) var7);
            if (var10 != null) {
                class313.field4571 = 0;
                class295.field4257 = 2;
                class277.field4050 = arg3;
                class55.field791 = arg2;
                class170 var11 = var10.field2623;
                class24.field335++;
                class624.method3537(-115, class524.field7281);
                field2088.method1742(var7, false);
                field2088.method1722(class404.field6022.method2183(82, false) ? 1 : 0, false);
                class233.method1521(var11.field1572[0], (byte) -89, 0, -2, 0, var11.field1571[0], var11.method781((byte) -102), true, var11.method781((byte) 72));
            }
        }
        if (var6 == 51) {
            class400 var12 = class39.field536[var7];
            if (var12 != null) {
                class295.field4257 = 2;
                class313.field4571 = 0;
                class55.field791 = arg2;
                class361.field5120++;
                class277.field4050 = arg3;
                class624.method3537(-124, class387.field5756);
                field2088.method1737((byte) -54, class404.field6022.method2183(82, false) ? 1 : 0);
                field2088.method1747(var7, arg0 ^ 0xFFFF8D06);
                class233.method1521(var12.field1572[0], (byte) -116, 0, -2, 0, var12.field1571[0], var12.method781((byte) 58), true, var12.method781((byte) 83));
            }
        }
        if (var6 == 16) {
            class400 var13 = class39.field536[var7];
            if (var13 != null) {
                class313.field4571 = 0;
                class295.field4257 = 2;
                class55.field791 = arg2;
                class419.field6162++;
                class277.field4050 = arg3;
                class624.method3537(-87, class511.field7080);
                field2088.method1722(class404.field6022.method2183(82, false) ? 1 : 0, false);
                field2088.method1747(var7, -29356);
                class233.method1521(var13.field1572[0], (byte) -109, 0, -2, 0, var13.field1571[0], var13.method781((byte) -91), true, var13.method781((byte) -92));
            }
        }
        if (var6 == 49) {
            class181 var14 = (class181) class432.field6368.method740(arg0 ^ 0x52, (long) var7);
            if (var14 != null) {
                class512.field7087++;
                class277.field4050 = arg3;
                class170 var15 = var14.field2623;
                class313.field4571 = 0;
                class295.field4257 = 2;
                class55.field791 = arg2;
                class624.method3537(arg0 - 171, class90.field1617);
                field2088.method1698((byte) -106, class404.field6022.method2183(82, false) ? 1 : 0);
                field2088.method1747(var7, arg0 ^ 0xFFFF8D06);
                class233.method1521(var15.field1572[0], (byte) -101, 0, -2, 0, var15.field1571[0], var15.method781((byte) -128), true, var15.method781((byte) 121));
            }
        }
        if (var6 == 1004) {
            class234.field3443++;
            class55.field791 = arg2;
            class295.field4257 = 2;
            class313.field4571 = 0;
            class277.field4050 = arg3;
            class624.method3537(-120, class611.field8685);
            field2088.method1699(true, var7);
        }
        if (var6 == 11) {
            class400 var16 = class39.field536[var7];
            if (var16 != null) {
                class295.field4257 = 2;
                class277.field4050 = arg3;
                class65.field902++;
                class313.field4571 = 0;
                class55.field791 = arg2;
                class624.method3537(-114, class146.field2245);
                field2088.method1718(-3, var7);
                field2088.method1737((byte) -79, class404.field6022.method2183(82, false) ? 1 : 0);
                class233.method1521(var16.field1572[0], (byte) -78, 0, -2, 0, var16.field1571[0], var16.method781((byte) -105), true, var16.method781((byte) 96));
            }
        }
        if (var6 == 1003) {
            class408.field6059++;
            class277.field4050 = arg3;
            class55.field791 = arg2;
            class295.field4257 = 2;
            class313.field4571 = 0;
            class624.method3537(-106, class597.field8499);
            field2088.method1699(true, var7);
        }
        if (var6 == 5) {
            class549 var17 = class547.method3061(4096, var4, var5);
            if (var17 != null) {
                class578.method3305(var17, -100);
            }
        }
        if (var6 == 58 && class559.field7930 == null) {
            class122.method983((byte) 117, var4, var5);
            class559.field7930 = class547.method3061(arg0 + 4014, var4, var5);
            class412.method2497(class559.field7930, 124);
        }
        if (var6 == 46) {
            if (class602.field8571 > 0 && class404.field6022.method2183(82, false) && class404.field6022.method2183(81, false)) {
                class32.method295(class382.field5687 + var4, class644.field9367.field5116, false, class597.field8500 + var5);
            } else {
                class608.method3458(var4, var7, var5, 32);
                if (var7 == 1) {
                    field2088.method1710(-1, 58);
                    field2088.method1710(-1, 73);
                    field2088.method1699(true, (int) class523.field7256);
                    field2088.method1710(57, arg0 + 2);
                    field2088.method1710(class495.field6941, 112);
                    field2088.method1710(class353.field5042, arg0 ^ 0xB);
                    field2088.method1710(89, 76);
                    field2088.method1699(true, class644.field9367.field5108);
                    field2088.method1699(true, class644.field9367.field5109);
                    field2088.method1710(63, arg0 ^ 0x23);
                } else {
                    class277.field4050 = arg3;
                    class55.field791 = arg2;
                    class295.field4257 = 1;
                    class313.field4571 = 0;
                }
                class233.method1521(var5, (byte) -128, 0, -4, 0, var4, 1, true, 1);
            }
        }
        if (var6 == 25) {
            class400 var18 = class39.field536[var7];
            if (var18 != null) {
                class277.field4050 = arg3;
                class295.field4257 = 2;
                class461.field6682++;
                class55.field791 = arg2;
                class313.field4571 = 0;
                class624.method3537(arg0 - 177, class264.field3840);
                field2088.method1747(var7, -29356);
                field2088.method1698((byte) -121, class404.field6022.method2183(82, false) ? 1 : 0);
                class233.method1521(var18.field1572[0], (byte) -106, 0, -2, 0, var18.field1571[0], var18.method781((byte) 31), true, var18.method781((byte) -116));
            }
        }
        if (var6 == 20) {
            class313.field4571 = 0;
            class295.field4257 = 1;
            class55.field791 = arg2;
            class277.field4050 = arg3;
            class586.field8349++;
            class624.method3537(arg0 ^ 0xFFFFFFCC, class609.field8655);
            field2088.method1742(class382.field5687 + var4, false);
            field2088.method1747(class68.field1296, arg0 ^ 0xFFFF8D06);
            field2088.method1699(true, class597.field8500 + var5);
            field2088.method1702(class293.field4224, false);
            field2088.method1699(true, class388.field5795);
            class233.method1521(var5, (byte) -121, 0, -4, 0, var4, 1, true, 1);
        }
        if (var6 == 17) {
            class181 var19 = (class181) class432.field6368.method740(0, (long) var7);
            if (var19 != null) {
                class295.field4257 = 2;
                class170 var20 = var19.field2623;
                class285.field4156++;
                class55.field791 = arg2;
                class277.field4050 = arg3;
                class313.field4571 = 0;
                class624.method3537(-90, class632.field8876);
                field2088.method1737((byte) -83, class404.field6022.method2183(82, false) ? 1 : 0);
                field2088.method1718(-3, var7);
                class233.method1521(var20.field1572[0], (byte) -128, 0, -2, 0, var20.field1571[0], var20.method781((byte) 90), true, var20.method781((byte) -103));
            }
        }
        if (var6 == 12) {
            class549 var21 = class547.method3061(4096, var4, var5);
            if (var21 != null) {
                class294.method1853(49);
                class546 var22 = client.method3530(var21);
                class380.method2304(var21, false, var22.method3051((byte) -70), var22.field7587);
                class511.field7082 = class242.method1544(var21, (byte) -126);
                if (class511.field7082 == null) {
                    class511.field7082 = "Null";
                }
                class413.field6111 = var21.field7652 + "<col=ffffff>";
            }
            return;
        }
        if (arg0 != 82) {
            field2089 = 10;
        }
        if (var6 == 4) {
            class181 var23 = (class181) class432.field6368.method740(0, (long) var7);
            if (var23 != null) {
                class354.field5062++;
                class170 var24 = var23.field2623;
                class55.field791 = arg2;
                class295.field4257 = 2;
                class277.field4050 = arg3;
                class313.field4571 = 0;
                class624.method3537(-117, class155.field2333);
                field2088.method1698((byte) -122, class404.field6022.method2183(82, false) ? 1 : 0);
                field2088.method1699(true, var7);
                class233.method1521(var24.field1572[0], (byte) -101, 0, -2, 0, var24.field1571[0], var24.method781((byte) -94), true, var24.method781((byte) 89));
            }
        }
        if (var6 == 10) {
            class400 var25 = class39.field536[var7];
            if (var25 != null) {
                class55.field791 = arg2;
                class313.field4571 = 0;
                class268.field3901++;
                class295.field4257 = 2;
                class277.field4050 = arg3;
                class624.method3537(-122, class270.field3969);
                field2088.method1710(class404.field6022.method2183(82, false) ? 1 : 0, 57);
                field2088.method1699(true, class68.field1296);
                field2088.method1702(class293.field4224, false);
                field2088.method1718(-3, var7);
                field2088.method1742(class388.field5795, false);
                class233.method1521(var25.field1572[0], (byte) -111, 0, -2, 0, var25.field1571[0], var25.method781((byte) 49), true, var25.method781((byte) 112));
            }
        }
        if (var6 == 1010) {
            class313.field4571 = 0;
            class229.field3397++;
            class55.field791 = arg2;
            class295.field4257 = 2;
            class277.field4050 = arg3;
            class624.method3537(-97, class46.field643);
            field2088.method1718(-3, var5 + class597.field8500);
            field2088.method1737((byte) -107, class404.field6022.method2183(82, false) ? 1 : 0);
            field2088.method1699(true, class382.field5687 + var4);
            field2088.method1742((int) (var8 >>> 32) & Integer.MAX_VALUE, false);
            class264.method1677(var8, var4, (byte) 83, var5);
        }
        if (var6 == 59) {
            if (class602.field8571 > 0 && class404.field6022.method2183(82, false) && class404.field6022.method2183(81, false)) {
                class32.method295(class382.field5687 + var4, class644.field9367.field5116, false, class597.field8500 + var5);
            } else {
                class571.field8142++;
                class295.field4257 = 1;
                class313.field4571 = 0;
                class55.field791 = arg2;
                class277.field4050 = arg3;
                class624.method3537(-105, class133.field2143);
                field2088.method1747(class382.field5687 + var4, -29356);
                field2088.method1742(class597.field8500 + var5, false);
            }
        }
        if (var6 == 6) {
            class400 var26 = class39.field536[var7];
            if (var26 != null) {
                class313.field4571 = 0;
                class295.field4257 = 2;
                class277.field4050 = arg3;
                class336.field4817++;
                class55.field791 = arg2;
                class624.method3537(-95, class337.field4827);
                field2088.method1710(class404.field6022.method2183(82, false) ? 1 : 0, 109);
                field2088.method1699(true, var7);
                class233.method1521(var26.field1572[0], (byte) -124, 0, -2, 0, var26.field1571[0], var26.method781((byte) 42), true, var26.method781((byte) -92));
            }
        }
        if (var6 == 47) {
            class181 var27 = (class181) class432.field6368.method740(0, (long) var7);
            if (var27 != null) {
                class567.field8097++;
                class295.field4257 = 2;
                class55.field791 = arg2;
                class313.field4571 = 0;
                class277.field4050 = arg3;
                class170 var28 = var27.field2623;
                class624.method3537(arg0 - 206, class217.field3282);
                field2088.method1699(true, var7);
                field2088.method1722(class404.field6022.method2183(82, false) ? 1 : 0, false);
                class233.method1521(var28.field1572[0], (byte) -105, 0, -2, 0, var28.field1571[0], var28.method781((byte) -81), true, var28.method781((byte) 89));
            }
        }
        if (var6 == 22 || var6 == 1007) {
            class639.method3688(var5, -1791, var4, arg1.field8370, var7);
        }
        if (var6 == 15) {
            class277.field4050 = arg3;
            class39.field535++;
            class295.field4257 = 2;
            class55.field791 = arg2;
            class313.field4571 = 0;
            class624.method3537(-83, class345.field4944);
            field2088.method1718(-3, class382.field5687 + var4);
            field2088.method1747(Integer.MAX_VALUE & (int) (var8 >>> 32), -29356);
            field2088.method1737((byte) -75, class404.field6022.method2183(82, false) ? 1 : 0);
            field2088.method1718(-3, var5 + class597.field8500);
            class264.method1677(var8, var4, (byte) 69, var5);
        }
        if (var6 == 48) {
            class307.field4423++;
            class313.field4571 = 0;
            class295.field4257 = 2;
            class277.field4050 = arg3;
            class55.field791 = arg2;
            class624.method3537(-80, class526.field7321);
            field2088.method1699(true, var5 + class597.field8500);
            field2088.method1710(class404.field6022.method2183(82, false) ? 1 : 0, 30);
            field2088.method1747(Integer.MAX_VALUE & (int) (var8 >>> 32), arg0 ^ 0xFFFF8D06);
            field2088.method1699(true, class382.field5687 + var4);
            class264.method1677(var8, var4, (byte) 124, var5);
        }
        if (var6 == 18) {
            class565.field8081++;
            class55.field791 = arg2;
            class295.field4257 = 2;
            class277.field4050 = arg3;
            class313.field4571 = 0;
            class624.method3537(-96, class524.field7282);
            field2088.method1699(true, var4 + class382.field5687);
            field2088.method1699(true, var7);
            field2088.method1718(arg0 - 85, class597.field8500 + var5);
            field2088.method1710(class404.field6022.method2183(82, false) ? 1 : 0, 75);
            class209.method1340(34843, var4, var5);
        }
        if (var6 == 45) {
            class277.field4050 = arg3;
            class313.field4571 = 0;
            class106.field1774++;
            class55.field791 = arg2;
            class295.field4257 = 2;
            class624.method3537(arg0 - 185, class425.field6216);
            field2088.method1718(arg0 ^ 0xFFFFFFAF, var7);
            field2088.method1698((byte) -114, class404.field6022.method2183(82, false) ? 1 : 0);
            field2088.method1742(class382.field5687 + var4, false);
            field2088.method1747(class597.field8500 + var5, -29356);
            class209.method1340(34843, var4, var5);
        }
        if (var6 == 23) {
            class400 var29 = class39.field536[var7];
            if (var29 != null) {
                class277.field4050 = arg3;
                class295.field4257 = 2;
                class313.field4571 = 0;
                class55.field791 = arg2;
                class182.field2630++;
                class624.method3537(arg0 - 165, class215.field3262);
                field2088.method1722(class404.field6022.method2183(82, false) ? 1 : 0, false);
                field2088.method1718(-3, var7);
                class233.method1521(var29.field1572[0], (byte) -86, 0, -2, 0, var29.field1571[0], var29.method781((byte) -96), true, var29.method781((byte) 65));
            }
        }
        if (var6 == 57) {
            class313.field4571 = 0;
            class55.field791 = arg2;
            class295.field4257 = 2;
            class277.field4050 = arg3;
            class424.field6203++;
            class624.method3537(-96, class418.field6149);
            field2088.method1699(true, class382.field5687 + var4);
            field2088.method1742(class597.field8500 + var5, false);
            field2088.method1698((byte) -112, class404.field6022.method2183(82, false) ? 1 : 0);
            field2088.method1718(-3, var7);
            class209.method1340(34843, var4, var5);
        }
        if (var6 == 50) {
            class400 var30 = class39.field536[var7];
            if (var30 != null) {
                class295.field4257 = 2;
                class313.field4571 = 0;
                class277.field4050 = arg3;
                class55.field791 = arg2;
                class362.field5146++;
                class624.method3537(-81, class340.field4890);
                field2088.method1718(-3, var7);
                field2088.method1710(class404.field6022.method2183(82, false) ? 1 : 0, 70);
                class233.method1521(var30.field1572[0], (byte) -122, 0, -2, 0, var30.field1571[0], var30.method781((byte) 39), true, var30.method781((byte) 65));
            }
        }
        if (var6 == 8) {
            class181 var31 = (class181) class432.field6368.method740(0, (long) var7);
            if (var31 != null) {
                class295.field4257 = 2;
                class313.field4571 = 0;
                class184.field2659++;
                class55.field791 = arg2;
                class277.field4050 = arg3;
                class170 var32 = var31.field2623;
                class624.method3537(arg0 ^ 0xFFFFFFDE, class225.field3363);
                field2088.method1739(false, class293.field4224);
                field2088.method1722(class404.field6022.method2183(82, false) ? 1 : 0, false);
                field2088.method1718(arg0 - 85, var7);
                field2088.method1699(true, class68.field1296);
                field2088.method1718(-3, class388.field5795);
                class233.method1521(var32.field1572[0], (byte) -74, 0, -2, 0, var32.field1571[0], var32.method781((byte) 96), true, var32.method781((byte) 127));
            }
        }
        if (var6 == 21) {
            class458.field6605++;
            class277.field4050 = arg3;
            class295.field4257 = 2;
            class313.field4571 = 0;
            class55.field791 = arg2;
            class624.method3537(-98, class1.field9);
            field2088.method1747(class382.field5687 + var4, -29356);
            field2088.method1742(class597.field8500 + var5, false);
            field2088.method1737((byte) -63, class404.field6022.method2183(82, false) ? 1 : 0);
            field2088.method1718(arg0 ^ 0xFFFFFFAF, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class264.method1677(var8, var4, (byte) 96, var5);
        }
        if (var6 == 13) {
            class400 var33 = class39.field536[var7];
            if (var33 != null) {
                class295.field4257 = 2;
                client.field8765++;
                class55.field791 = arg2;
                class277.field4050 = arg3;
                class313.field4571 = 0;
                class624.method3537(-91, class516.field7146);
                field2088.method1737((byte) -117, class404.field6022.method2183(82, false) ? 1 : 0);
                field2088.method1699(true, var7);
                class233.method1521(var33.field1572[0], (byte) -83, 0, -2, 0, var33.field1571[0], var33.method781((byte) -110), true, var33.method781((byte) 56));
            }
        }
        if (var6 == 30) {
            class55.field791 = arg2;
            class313.field4571 = 0;
            class295.field4257 = 2;
            class277.field4050 = arg3;
            class429.field6252++;
            class624.method3537(-98, class274.field4010);
            field2088.method1742(var7, false);
            field2088.method1710(class404.field6022.method2183(82, false) ? 1 : 0, 17);
            field2088.method1699(true, class382.field5687 + var4);
            field2088.method1699(true, class597.field8500 + var5);
            class209.method1340(34843, var4, var5);
        }
        if (var6 == 1001 || var6 == 1011 || var6 == 1009 || var6 == 1008 || var6 == 1002) {
            class260.method1649(var6, var4, 0, var7);
        }
        if (var6 == 1012) {
            class295.field4257 = 2;
            class277.field4050 = arg3;
            class313.field4571 = 0;
            class55.field791 = arg2;
            class181 var34 = (class181) class432.field6368.method740(0, (long) var7);
            if (var34 != null) {
                class170 var35 = var34.field2623;
                class432 var36 = var35.field2492;
                if (var36.field6304 != null) {
                    var36 = var36.method2582(0, class401.field6001);
                }
                if (var36 != null) {
                    class624.method3537(-127, class298.field4273);
                    class28.field374++;
                    field2088.method1699(true, var36.field6323);
                }
            }
        }
        if (var6 == 19) {
            class277.field4050 = arg3;
            class619.field8743++;
            class313.field4571 = 0;
            class295.field4257 = 2;
            class55.field791 = arg2;
            class624.method3537(-121, class273.field3992);
            field2088.method1742(class382.field5687 + var4, false);
            field2088.method1747(class597.field8500 + var5, arg0 ^ 0xFFFF8D06);
            field2088.method1718(arg0 ^ 0xFFFFFFAF, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            field2088.method1698((byte) -108, class404.field6022.method2183(82, false) ? 1 : 0);
            class264.method1677(var8, var4, (byte) 57, var5);
        }
        if (var6 == 3) {
            class313.field4571 = 0;
            class19.field295++;
            class295.field4257 = 2;
            class55.field791 = arg2;
            class277.field4050 = arg3;
            class624.method3537(-110, class335.field4796);
            field2088.method1698((byte) -119, class404.field6022.method2183(82, false) ? 1 : 0);
            field2088.method1747(class597.field8500 + var5, arg0 + -29438);
            field2088.method1718(-3, class382.field5687 + var4);
            field2088.method1742(var7, false);
            class209.method1340(34843, var4, var5);
        }
        if (var6 == 9) {
            class577.field8235++;
            class295.field4257 = 2;
            class55.field791 = arg2;
            class277.field4050 = arg3;
            class313.field4571 = 0;
            class624.method3537(arg0 - 181, class26.field355);
            field2088.method1718(arg0 ^ 0xFFFFFFAF, var4 + class382.field5687);
            field2088.method1747(class68.field1296, -29356);
            field2088.method1705(class293.field4224, arg0 ^ 0x1609);
            field2088.method1747(var7, arg0 - 29438);
            field2088.method1747(class597.field8500 + var5, -29356);
            field2088.method1699(true, class388.field5795);
            field2088.method1710(class404.field6022.method2183(82, false) ? 1 : 0, arg0 ^ 0x17);
            class209.method1340(34843, var4, var5);
        }
        if (var6 == 44) {
            class295.field4257 = 2;
            class277.field4050 = arg3;
            class313.field4571 = 0;
            class55.field791 = arg2;
            class251.field3674++;
            class624.method3537(-124, class136.field2168);
            field2088.method1699(true, class388.field5795);
            field2088.method1747(class382.field5687 + var4, arg0 ^ 0xFFFF8D06);
            field2088.method1718(arg0 ^ 0xFFFFFFAF, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            field2088.method1718(-3, class597.field8500 + var5);
            field2088.method1739(false, class293.field4224);
            field2088.method1747(class68.field1296, arg0 ^ 0xFFFF8D06);
            field2088.method1710(class404.field6022.method2183(82, false) ? 1 : 0, 104);
            class264.method1677(var8, var4, (byte) 81, var5);
        }
        if (class90.field1620) {
            class294.method1853(49);
        }
        if (class261.field3805 != null && class557.field7875 == 0) {
            class412.method2497(class261.field3805, 90);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
    public static void method1002(byte arg0) {
        if (arg0 >= 77) {
            field2087 = null;
            field2088 = null;
            field2086 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1003(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
