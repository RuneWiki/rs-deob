import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class37 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field565 = 0;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Ljava/lang/String;")
    public static String field570 = "";

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lr;I)V")
    public static final void method370(class63 arg0, int arg1) {
        field569++;
        if (arg0 == null || class268.field3613.field2454 == arg0) {
            return;
        }
        int var2 = arg0.field961;
        int var3 = arg0.field958;
        int var4 = arg0.field966;
        int var5 = (int) arg0.field957;
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var6 = arg0.field957;
        if (var4 == 25) {
            class355.field4828.method1801(167, (byte) -117);
            class392.field5498++;
            class355.field4828.method1854(var3, true);
            class139 var8 = class10.method57(65535, var3);
            if (var8.field2058 != null && var8.field2058[0][0] == 5) {
                int var9 = var8.field2058[0][1];
                if (class414.field5782[var9] != var8.field1957[0]) {
                    class414.field5782[var9] = var8.field1957[0];
                    class329.method2091(-29713, var9);
                }
            }
        }
        if (var4 == 35) {
            class127 var10 = class298.field4012[var5];
            if (var10 != null) {
                class416.field5821 = 0;
                class233.field3203 = class94.field1365;
                class264.field3554 = class177.field2609;
                class392.field5501 = 2;
                class113.field1603++;
                class355.field4828.method1801(166, (byte) -88);
                class355.field4828.method1877(true, var5);
                class355.field4828.method1824(arg1 + 109, class234.field3242[82] ? 1 : 0);
                class256.method1669(true, 0, var10.field4998[0], 0, class95.field1379.field5005[0], class95.field1379.field4998[0], var10.method2146(27), -2, var10.method2146(arg1 + 31), false, var10.field5005[0]);
            }
        }
        if (var4 == 30) {
            class173.method1289(false, 11337);
        }
        if (var4 == 18) {
            class355.field4828.method1801(233, (byte) -54);
            class407.field5696++;
            class355.field4828.method1854(var3, true);
            class355.field4828.method1834(var5, (byte) -103);
            class355.field4828.method1834(var2, (byte) 115);
            class443.field6391 = 0;
            class388.field5461 = class10.method57(65535, var3);
            class76.field1132 = var2;
        }
        if (var4 == 60 && class331.field4502 == null) {
            class43.method408((byte) -58, var2, var3);
            class331.field4502 = class44.method411(var2, true, var3);
            class10.method52(class331.field4502, (byte) -89);
        }
        if (var4 == 16) {
            class355.field4828.method1801(63, (byte) -52);
            class414.field5798++;
            class355.field4828.method1854(var3, true);
            class355.field4828.method1874(var2, 116);
            class355.field4828.method1834(var5, (byte) -114);
            class443.field6391 = 0;
            class388.field5461 = class10.method57(65535, var3);
            class76.field1132 = var2;
        }
        if (var4 == 29) {
            if (class447.field6482 > 0 && class234.field3242[82] && class234.field3242[81]) {
                class198.method1403((byte) -103, class69.field1046, class283.field3794 + var2, class296.field3988 + var3);
            } else {
                class416.field5821 = 0;
                class233.field3203 = class94.field1365;
                class434.field6183++;
                class392.field5501 = 1;
                class264.field3554 = class177.field2609;
                class355.field4828.method1801(139, (byte) -101);
                class355.field4828.method1869((byte) 2, class296.field3988 + var3);
                class355.field4828.method1834(class283.field3794 + var2, (byte) 53);
            }
        }
        if (var4 == 23) {
            class127 var11 = class298.field4012[var5];
            if (var11 != null) {
                class303.field4088++;
                class233.field3203 = class94.field1365;
                class392.field5501 = 2;
                class264.field3554 = class177.field2609;
                class416.field5821 = 0;
                class355.field4828.method1801(130, (byte) -81);
                class355.field4828.method1872((byte) 54, class234.field3242[82] ? 1 : 0);
                class355.field4828.method1834(var5, (byte) -120);
                class256.method1669(true, 0, var11.field4998[0], 0, class95.field1379.field5005[0], class95.field1379.field4998[0], var11.method2146(-123), -2, var11.method2146(56), false, var11.field5005[0]);
            }
        }
        if (var4 == 45) {
            class392.field5501 = 2;
            class264.field3554 = class177.field2609;
            class243.field3348++;
            class233.field3203 = class94.field1365;
            class416.field5821 = 0;
            class355.field4828.method1801(158, (byte) -91);
            class355.field4828.method1874(var5, 111);
            class355.field4828.method1877(true, class296.field3988 + var3);
            class355.field4828.method1864(arg1 + 128, class234.field3242[82] ? 1 : 0);
            class355.field4828.method1834(class283.field3794 + var2, (byte) -109);
            class84.method761(var2, var3, true);
        }
        if (var4 == 36) {
            class139 var12 = class10.method57(65535, var3);
            boolean var13 = true;
            if (var12.field2108 > 0) {
                var13 = class426.method2621(false, var12);
            }
            if (var13) {
                class392.field5498++;
                class355.field4828.method1801(167, (byte) -49);
                class355.field4828.method1854(var3, true);
            }
        }
        if (var4 == 15 || var4 == 1011) {
            class153.method1176(arg0.field959, var3, true, var2, var5);
        }
        if (var4 == 57) {
            class338 var14 = class220.field3044[var5];
            if (var14 != null) {
                class416.field5821 = 0;
                class392.field5501 = 2;
                class233.field3203 = class94.field1365;
                class264.field3554 = class177.field2609;
                class390.field5470++;
                class355.field4828.method1801(26, (byte) -119);
                class355.field4828.method1824(71, class234.field3242[82] ? 1 : 0);
                class355.field4828.method1877(true, var5);
                class256.method1669(true, 0, var14.field4998[0], 0, class95.field1379.field5005[0], class95.field1379.field4998[0], var14.method2146(-124), -2, var14.method2146(81), false, var14.field5005[0]);
            }
        }
        if (var4 == 47) {
            class233.field3203 = class94.field1365;
            class416.field5821 = 0;
            class392.field5501 = 2;
            class288.field3869++;
            class264.field3554 = class177.field2609;
            class355.field4828.method1801(187, (byte) -104);
            class355.field4828.method1872((byte) 54, class234.field3242[82] ? 1 : 0);
            class355.field4828.method1834(class296.field3988 + var3, (byte) 119);
            class355.field4828.method1869((byte) -22, class328.field4456);
            class355.field4828.method1869((byte) -28, var5);
            class355.field4828.method1830(255, class418.field5864);
            class355.field4828.method1869((byte) -106, var2 + class283.field3794);
            class84.method761(var2, var3, true);
        }
        if (var4 == 41) {
            class127 var15 = class298.field4012[var5];
            if (var15 != null) {
                class392.field5501 = 2;
                class416.field5821 = 0;
                class30.field503++;
                class264.field3554 = class177.field2609;
                class233.field3203 = class94.field1365;
                class355.field4828.method1801(42, (byte) -93);
                class355.field4828.method1834(var5, (byte) -101);
                class355.field4828.method1836(class234.field3242[82] ? 1 : 0, arg1 - 1);
                class256.method1669(true, 0, var15.field4998[0], 0, class95.field1379.field5005[0], class95.field1379.field4998[0], var15.method2146(76), -2, var15.method2146(arg1 - 126), false, var15.field5005[0]);
            }
        }
        if (var4 == 6) {
            class264.field3554 = class177.field2609;
            class416.field5821 = 0;
            class233.field3203 = class94.field1365;
            class392.field5501 = 1;
            class22.field409++;
            class355.field4828.method1801(82, (byte) -125);
            class355.field4828.method1854(class418.field5864, true);
            class355.field4828.method1869((byte) 107, class296.field3988 + var3);
            class355.field4828.method1877(true, class328.field4456);
            class355.field4828.method1834(class283.field3794 + var2, (byte) -113);
            class256.method1669(true, 0, var3, 0, class95.field1379.field5005[0], class95.field1379.field4998[0], 1, -4, 1, false, var2);
        }
        if (var4 == 28) {
            class29.field495++;
            class264.field3554 = class177.field2609;
            class233.field3203 = class94.field1365;
            class392.field5501 = 2;
            class416.field5821 = 0;
            class355.field4828.method1801(242, (byte) -92);
            class355.field4828.method1834(class269.field3621, (byte) 76);
            class355.field4828.method1836(class234.field3242[82] ? 1 : 0, -1);
            class355.field4828.method1830(arg1 ^ 0xFF, class272.field3661);
            class355.field4828.method1877(true, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class355.field4828.method1874(class22.field413, 13);
            class355.field4828.method1874(class283.field3794 + var2, 71);
            class355.field4828.method1869((byte) 113, class296.field3988 + var3);
            class448.method2795(var3, var6, (byte) -124, var2);
        }
        if (var4 == 4) {
            class338 var16 = class220.field3044[var5];
            if (var16 != null) {
                class187.field2699++;
                class392.field5501 = 2;
                class233.field3203 = class94.field1365;
                class416.field5821 = 0;
                class264.field3554 = class177.field2609;
                class355.field4828.method1801(177, (byte) -123);
                class355.field4828.method1872((byte) 54, class234.field3242[82] ? 1 : 0);
                class355.field4828.method1874(var5, 77);
                class256.method1669(true, 0, var16.field4998[0], 0, class95.field1379.field5005[0], class95.field1379.field4998[0], var16.method2146(arg1 - 125), -2, var16.method2146(107), false, var16.field5005[0]);
            }
        }
        if (var4 == 2) {
            class416.field5821 = 0;
            class272.field3651++;
            class264.field3554 = class177.field2609;
            class233.field3203 = class94.field1365;
            class392.field5501 = 2;
            class355.field4828.method1801(111, (byte) -94);
            class355.field4828.method1834(class283.field3794 + var2, (byte) -102);
            class355.field4828.method1877(true, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class355.field4828.method1872((byte) 54, class234.field3242[82] ? 1 : 0);
            class355.field4828.method1834(class296.field3988 + var3, (byte) -102);
            class448.method2795(var3, var6, (byte) -124, var2);
        }
        if (var4 == 42) {
            class139 var17 = class44.method411(var2, true, var3);
            if (var17 != null) {
                class301.method1932((byte) 66);
                class126 var18 = client.method1648(var17);
                class194.method1390(var17.field2000, var18.method987(arg1 ^ 0xFFFFCC95), var2, var18.field1766, (byte) -103, var17.field1959, var3);
                class363.field5021 = 0;
                class166.field2465 = class173.method1288(var17, (byte) -66);
                if (class166.field2465 == null) {
                    class166.field2465 = "Null";
                }
                if (!var17.field2048) {
                    class326.field4421 = "<col=00ff00>" + var17.field1985 + "<col=ffffff>";
                    return;
                }
                class326.field4421 = var17.field2096 + "<col=ffffff>";
            }
            return;
        }
        if (var4 == 1006) {
            class139 var19 = class10.method57(65535, var3);
            if (var19 == null || var19.field2071[var2] < 100000) {
                class241.field3326++;
                class355.field4828.method1801(60, (byte) -112);
                class355.field4828.method1874(var5, 23);
            } else {
                class289.method1838(-754415328, var19.field2071[var2] + " x " + class234.method1569(2142, var5).field6595);
            }
            class443.field6391 = 0;
            class388.field5461 = class10.method57(65535, var3);
            class76.field1132 = var2;
        }
        if (var4 == 1001 || var4 == 1012 || var4 == 1003 || var4 == 1007 || var4 == 1005) {
            class83.method752(var2, -1004, var4, var5);
        }
        if (var4 == 11) {
            class127 var20 = class298.field4012[var5];
            if (var20 != null) {
                class233.field3203 = class94.field1365;
                class416.field5821 = 0;
                class233.field3205++;
                class264.field3554 = class177.field2609;
                class392.field5501 = 2;
                class355.field4828.method1801(189, (byte) -113);
                class355.field4828.method1834(class22.field413, (byte) -123);
                class355.field4828.method1834(var5, (byte) 118);
                class355.field4828.method1824(99, class234.field3242[82] ? 1 : 0);
                class355.field4828.method1854(class272.field3661, true);
                class355.field4828.method1834(class269.field3621, (byte) 124);
                class256.method1669(true, 0, var20.field4998[0], 0, class95.field1379.field5005[0], class95.field1379.field4998[0], var20.method2146(arg1 + 114), -2, var20.method2146(-116), false, var20.field5005[0]);
            }
        }
        if (var4 == 1008) {
            class416.field5821 = 0;
            class233.field3203 = class94.field1365;
            class264.field3554 = class177.field2609;
            class392.field5501 = 2;
            class127 var21 = class298.field4012[var5];
            if (var21 != null) {
                class15 var22 = var21.field1784;
                if (var22.field177 != null) {
                    var22 = var22.method78(0);
                }
                if (var22 != null) {
                    class101.field1493++;
                    class355.field4828.method1801(91, (byte) -98);
                    class355.field4828.method1834(var22.field128, (byte) 30);
                }
            }
        }
        if (var4 == 1004) {
            class264.field3554 = class177.field2609;
            class392.field5501 = 2;
            class241.field3326++;
            class416.field5821 = 0;
            class233.field3203 = class94.field1365;
            class355.field4828.method1801(60, (byte) -86);
            class355.field4828.method1874(var5, 29);
        }
        if (var4 == 44) {
            class233.field3203 = class94.field1365;
            class365.field5039++;
            class416.field5821 = 0;
            class264.field3554 = class177.field2609;
            class392.field5501 = 2;
            class355.field4828.method1801(159, (byte) -80);
            class355.field4828.method1869((byte) 1, class283.field3794 + var2);
            class355.field4828.method1874(class296.field3988 + var3, 28);
            class355.field4828.method1834(var5, (byte) -121);
            class355.field4828.method1864(128, class234.field3242[82] ? 1 : 0);
            class84.method761(var2, var3, true);
        }
        if (var4 == 1009) {
            class264.field3554 = class177.field2609;
            class392.field5501 = 2;
            class228.field3179++;
            class416.field5821 = 0;
            class233.field3203 = class94.field1365;
            class355.field4828.method1801(43, (byte) -63);
            class355.field4828.method1874(var5, arg1 ^ 0x58);
        }
        if (var4 == 39) {
            class392.field5498++;
            class355.field4828.method1801(167, (byte) -60);
            class355.field4828.method1854(var3, true);
            class139 var23 = class10.method57(65535, var3);
            if (var23.field2058 != null && var23.field2058[0][0] == 5) {
                int var24 = var23.field2058[0][1];
                class414.field5782[var24] = 1 - class414.field5782[var24];
                class329.method2091(-29713, var24);
            }
        }
        if (var4 == 26) {
            class392.field5501 = 2;
            class416.field5821 = 0;
            class264.field3554 = class177.field2609;
            class233.field3203 = class94.field1365;
            class340.field4639++;
            class355.field4828.method1801(206, (byte) -60);
            class355.field4828.method1836(class234.field3242[82] ? 1 : 0, -1);
            class355.field4828.method1874(var3 + class296.field3988, 59);
            class355.field4828.method1874(class269.field3621, arg1 ^ 0x45);
            class355.field4828.method1869((byte) 112, class283.field3794 + var2);
            class355.field4828.method1869((byte) -80, var5);
            class355.field4828.method1822(false, class272.field3661);
            class355.field4828.method1874(class22.field413, arg1 ^ 0x72);
            class84.method761(var2, var3, true);
        }
        if (var4 == 21) {
            class355.field4828.method1801(227, (byte) -102);
            class30.field510++;
            class355.field4828.method1854(var3, true);
            class355.field4828.method1877(true, var5);
            class355.field4828.method1877(true, var2);
            class443.field6391 = 0;
            class388.field5461 = class10.method57(arg1 + 65535, var3);
            class76.field1132 = var2;
        }
        if (var4 == 7) {
            class127 var25 = class298.field4012[var5];
            if (var25 != null) {
                class233.field3203 = class94.field1365;
                class392.field5501 = 2;
                class264.field3554 = class177.field2609;
                class416.field5821 = 0;
                class443.field6375++;
                class355.field4828.method1801(229, (byte) -63);
                class355.field4828.method1834(var5, (byte) -110);
                class355.field4828.method1836(class234.field3242[82] ? 1 : 0, -1);
                class256.method1669(true, 0, var25.field4998[0], 0, class95.field1379.field5005[0], class95.field1379.field4998[0], var25.method2146(-117), -2, var25.method2146(arg1 ^ 0x42), false, var25.field5005[0]);
            }
        }
        if (var4 == 1) {
            class97.field1396++;
            class355.field4828.method1801(132, (byte) -66);
            class355.field4828.method1854(var3, true);
            class355.field4828.method1877(true, var2);
            class355.field4828.method1874(var5, 22);
            class443.field6391 = 0;
            class388.field5461 = class10.method57(65535, var3);
            class76.field1132 = var2;
        }
        if (var4 == 22) {
            class127 var26 = class298.field4012[var5];
            if (var26 != null) {
                class392.field5501 = 2;
                class416.field5821 = 0;
                class341.field4654++;
                class233.field3203 = class94.field1365;
                class264.field3554 = class177.field2609;
                class355.field4828.method1801(98, (byte) -96);
                class355.field4828.method1834(var5, (byte) -127);
                class355.field4828.method1872((byte) 54, class234.field3242[82] ? 1 : 0);
                class256.method1669(true, 0, var26.field4998[0], 0, class95.field1379.field5005[0], class95.field1379.field4998[0], var26.method2146(80), -2, var26.method2146(-123), false, var26.field5005[0]);
            }
        }
        if (var4 == 20) {
            class170.field2509++;
            class355.field4828.method1801(54, (byte) -65);
            class355.field4828.method1854(var3, true);
            class355.field4828.method1869((byte) 127, var2);
            class355.field4828.method1869((byte) 114, class269.field3621);
            class355.field4828.method1869((byte) 107, var5);
            class355.field4828.method1822(false, class272.field3661);
            class355.field4828.method1874(class22.field413, 127);
            class443.field6391 = 0;
            class388.field5461 = class10.method57(65535, var3);
            class76.field1132 = var2;
        }
        if (var4 == 46) {
            class233.field3203 = class94.field1365;
            field572++;
            class392.field5501 = 2;
            class416.field5821 = 0;
            class264.field3554 = class177.field2609;
            class355.field4828.method1801(4, (byte) -93);
            class355.field4828.method1869((byte) 19, var5);
            class355.field4828.method1864(128, class234.field3242[82] ? 1 : 0);
            class355.field4828.method1874(var2 + class283.field3794, arg1 ^ 0x46);
            class355.field4828.method1877(true, class296.field3988 + var3);
            class84.method761(var2, var3, true);
        }
        if (var4 == 24) {
            class392.field5501 = 2;
            class233.field3203 = class94.field1365;
            class416.field5821 = 0;
            class322.field4372++;
            class264.field3554 = class177.field2609;
            class355.field4828.method1801(136, (byte) -60);
            class355.field4828.method1834(var5, (byte) 82);
            class355.field4828.method1836(class234.field3242[82] ? 1 : 0, -1);
            class355.field4828.method1869((byte) 10, class283.field3794 + var2);
            class355.field4828.method1869((byte) -5, class296.field3988 + var3);
            class84.method761(var2, var3, true);
        }
        if (var4 == 5) {
            class355.field4828.method1801(116, (byte) -122);
            class447.field6447++;
            class355.field4828.method1854(var3, true);
            class355.field4828.method1874(var2, arg1 ^ 0x24);
            class355.field4828.method1877(true, var5);
            class443.field6391 = 0;
            class388.field5461 = class10.method57(65535, var3);
            class76.field1132 = var2;
        }
        if (var4 == 37) {
            class338 var27 = class220.field3044[var5];
            if (var27 != null) {
                class401.field5605++;
                class416.field5821 = 0;
                class233.field3203 = class94.field1365;
                class392.field5501 = 2;
                class264.field3554 = class177.field2609;
                class355.field4828.method1801(237, (byte) -65);
                class355.field4828.method1864(arg1 + 128, class234.field3242[82] ? 1 : 0);
                class355.field4828.method1834(var5, (byte) 91);
                class256.method1669(true, 0, var27.field4998[0], 0, class95.field1379.field5005[0], class95.field1379.field4998[0], var27.method2146(48), -2, var27.method2146(arg1 ^ 0x35), false, var27.field5005[0]);
            }
        }
        if (var4 == 17) {
            class338 var28 = class220.field3044[var5];
            if (var28 != null) {
                class416.field5821 = 0;
                class264.field3554 = class177.field2609;
                class14.field108++;
                class233.field3203 = class94.field1365;
                class392.field5501 = 2;
                class355.field4828.method1801(249, (byte) -122);
                class355.field4828.method1864(128, class234.field3242[82] ? 1 : 0);
                class355.field4828.method1834(var5, (byte) -102);
                class256.method1669(true, 0, var28.field4998[0], 0, class95.field1379.field5005[0], class95.field1379.field4998[0], var28.method2146(59), -2, var28.method2146(-123), false, var28.field5005[0]);
            }
        }
        if (var4 == 1010) {
            class210.field2927++;
            class416.field5821 = 0;
            class233.field3203 = class94.field1365;
            class264.field3554 = class177.field2609;
            class392.field5501 = 2;
            class355.field4828.method1801(36, (byte) -80);
            class355.field4828.method1834((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 19);
            class355.field4828.method1874(class283.field3794 + var2, 44);
            class355.field4828.method1869((byte) -109, class296.field3988 + var3);
            class355.field4828.method1836(class234.field3242[82] ? 1 : 0, -1);
            class448.method2795(var3, var6, (byte) -124, var2);
        }
        if (var4 == 34) {
            class284.field3803++;
            class355.field4828.method1801(51, (byte) -83);
            class355.field4828.method1854(var3, true);
            class355.field4828.method1834(var5, (byte) -119);
            class355.field4828.method1874(var2, arg1 + 105);
            class443.field6391 = 0;
            class388.field5461 = class10.method57(65535, var3);
            class76.field1132 = var2;
        }
        if (var4 == 59) {
            class416.field5821 = 0;
            class314.field4257++;
            class264.field3554 = class177.field2609;
            class233.field3203 = class94.field1365;
            class392.field5501 = 2;
            class355.field4828.method1801(209, (byte) -99);
            class355.field4828.method1877(true, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class355.field4828.method1872((byte) 54, class234.field3242[82] ? 1 : 0);
            class355.field4828.method1874(var2 + class283.field3794, 106);
            class355.field4828.method1869((byte) -66, class328.field4456);
            class355.field4828.method1830(255, class418.field5864);
            class355.field4828.method1869((byte) 24, class296.field3988 + var3);
            class448.method2795(var3, var6, (byte) -124, var2);
        }
        if (var4 == 51) {
            if (class447.field6482 > 0 && class234.field3242[82] && class234.field3242[81]) {
                class198.method1403((byte) -114, class69.field1046, class283.field3794 + var2, class296.field3988 + var3);
            } else {
                class426.method2625(var5, var2, var3, arg1 ^ 0x75C9);
                if (var5 == 1) {
                    class355.field4828.method1824(111, -1);
                    class355.field4828.method1824(arg1 + 80, -1);
                    class355.field4828.method1877(true, (int) class313.field4229);
                    class355.field4828.method1824(124, 57);
                    class355.field4828.method1824(54, class161.field2395);
                    class355.field4828.method1824(arg1 + 38, class398.field5576);
                    class355.field4828.method1824(arg1 + 58, 89);
                    class355.field4828.method1877(true, class95.field1379.field3176);
                    class355.field4828.method1877(true, class95.field1379.field3167);
                    class355.field4828.method1824(arg1 ^ 0x3F, 63);
                } else {
                    class416.field5821 = 0;
                    class264.field3554 = class177.field2609;
                    class233.field3203 = class94.field1365;
                    class392.field5501 = 1;
                }
                class256.method1669(true, 0, var3, 0, class95.field1379.field5005[0], class95.field1379.field4998[0], 1, -4, 1, false, var2);
            }
        }
        if (var4 == 48) {
            class338 var29 = class220.field3044[var5];
            if (var29 != null) {
                class264.field3554 = class177.field2609;
                class417.field5856++;
                class416.field5821 = 0;
                class233.field3203 = class94.field1365;
                class392.field5501 = 2;
                class355.field4828.method1801(8, (byte) -81);
                class355.field4828.method1834(class328.field4456, (byte) -104);
                class355.field4828.method1835(class418.field5864, false);
                class355.field4828.method1834(var5, (byte) -127);
                class355.field4828.method1836(class234.field3242[82] ? 1 : 0, -1);
                class256.method1669(true, 0, var29.field4998[0], 0, class95.field1379.field5005[0], class95.field1379.field4998[0], var29.method2146(-126), -2, var29.method2146(-123), false, var29.field5005[0]);
            }
        }
        if (var4 == 50) {
            class124.field1740++;
            class355.field4828.method1801(113, (byte) -126);
            class355.field4828.method1854(var3, true);
            class355.field4828.method1834(class328.field4456, (byte) 3);
            class355.field4828.method1874(var2, arg1 ^ 0x57);
            class355.field4828.method1854(class418.field5864, true);
        }
        if (var4 == 43) {
            class338 var30 = class220.field3044[var5];
            if (var30 != null) {
                class392.field5501 = 2;
                class416.field5821 = 0;
                class233.field3203 = class94.field1365;
                class264.field3554 = class177.field2609;
                class36.field551++;
                class355.field4828.method1801(198, (byte) -101);
                class355.field4828.method1864(arg1 ^ 0x80, class234.field3242[82] ? 1 : 0);
                class355.field4828.method1834(var5, (byte) -114);
                class256.method1669(true, 0, var30.field4998[0], 0, class95.field1379.field5005[0], class95.field1379.field4998[0], var30.method2146(89), -2, var30.method2146(41), false, var30.field5005[0]);
            }
        }
        if (var4 == 49) {
            class163.field2406++;
            class355.field4828.method1801(244, (byte) -116);
            class355.field4828.method1854(var3, true);
            class355.field4828.method1874(var2, arg1 ^ 0x2E);
            class355.field4828.method1877(true, var5);
            class443.field6391 = 0;
            class388.field5461 = class10.method57(65535, var3);
            class76.field1132 = var2;
        }
        if (var4 == 12) {
            class338 var31 = class220.field3044[var5];
            if (var31 != null) {
                class264.field3554 = class177.field2609;
                class392.field5501 = 2;
                class416.field5821 = 0;
                class77.field1160++;
                class233.field3203 = class94.field1365;
                class355.field4828.method1801(184, (byte) -70);
                class355.field4828.method1874(var5, 124);
                class355.field4828.method1872((byte) 54, class234.field3242[82] ? 1 : 0);
                class256.method1669(true, 0, var31.field4998[0], 0, class95.field1379.field5005[0], class95.field1379.field4998[0], var31.method2146(-118), -2, var31.method2146(-126), false, var31.field5005[0]);
            }
        }
        if (var4 == 40) {
            class355.field4828.method1801(192, (byte) -90);
            class368.field5048++;
            class355.field4828.method1854(var3, true);
            class355.field4828.method1874(var5, arg1 + 57);
            class355.field4828.method1877(true, var2);
            class443.field6391 = 0;
            class388.field5461 = class10.method57(65535, var3);
            class76.field1132 = var2;
        }
        if (var4 == 13) {
            class355.field4828.method1801(0, (byte) -106);
            field566++;
            class355.field4828.method1854(var3, true);
            class355.field4828.method1869((byte) -87, var5);
            class355.field4828.method1834(var2, (byte) 51);
            class443.field6391 = 0;
            class388.field5461 = class10.method57(65535, var3);
            class76.field1132 = var2;
        }
        if (var4 == 32) {
            class127 var32 = class298.field4012[var5];
            if (var32 != null) {
                class411.field5752++;
                class392.field5501 = 2;
                class233.field3203 = class94.field1365;
                class416.field5821 = 0;
                class264.field3554 = class177.field2609;
                class355.field4828.method1801(122, (byte) -106);
                class355.field4828.method1836(class234.field3242[82] ? 1 : 0, -1);
                class355.field4828.method1869((byte) 115, var5);
                class355.field4828.method1874(class328.field4456, 107);
                class355.field4828.method1835(class418.field5864, false);
                class256.method1669(true, 0, var32.field4998[0], 0, class95.field1379.field5005[0], class95.field1379.field4998[0], var32.method2146(-120), -2, var32.method2146(-124), false, var32.field5005[0]);
            }
        }
        if (var4 == 58) {
            class57.field907++;
            class355.field4828.method1801(255, (byte) -62);
            class355.field4828.method1854(var3, true);
            class355.field4828.method1834(var2, (byte) 61);
            class355.field4828.method1877(true, class328.field4456);
            class355.field4828.method1834(var5, (byte) -103);
            class355.field4828.method1854(class418.field5864, true);
            class443.field6391 = 0;
            class388.field5461 = class10.method57(arg1 ^ 0xFFFF, var3);
            class76.field1132 = var2;
        }
        if (var4 == 3) {
            class338 var33 = class220.field3044[var5];
            if (var33 != null) {
                class360.field4877++;
                class416.field5821 = 0;
                class233.field3203 = class94.field1365;
                class264.field3554 = class177.field2609;
                class392.field5501 = 2;
                class355.field4828.method1801(190, (byte) -103);
                class355.field4828.method1834(class269.field3621, (byte) -123);
                class355.field4828.method1864(128, class234.field3242[82] ? 1 : 0);
                class355.field4828.method1874(class22.field413, 34);
                class355.field4828.method1835(class272.field3661, false);
                class355.field4828.method1869((byte) 104, var5);
                class256.method1669(true, 0, var33.field4998[0], 0, class95.field1379.field5005[0], class95.field1379.field4998[0], var33.method2146(-121), -2, var33.method2146(arg1 ^ 0x18), false, var33.field5005[0]);
            }
        }
        if (var4 == 19) {
            class392.field5501 = 2;
            class416.field5821 = 0;
            class233.field3203 = class94.field1365;
            class124.field1739++;
            class264.field3554 = class177.field2609;
            class355.field4828.method1801(203, (byte) -118);
            class355.field4828.method1869((byte) 104, class283.field3794 + var2);
            class355.field4828.method1869((byte) 104, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class355.field4828.method1836(class234.field3242[82] ? 1 : 0, -1);
            class355.field4828.method1869((byte) -4, class296.field3988 + var3);
            class448.method2795(var3, var6, (byte) -124, var2);
        }
        if (var4 == 33) {
            class416.field5821 = 0;
            class233.field3203 = class94.field1365;
            class264.field3554 = class177.field2609;
            class255.field3461++;
            class392.field5501 = 2;
            class355.field4828.method1801(109, (byte) -125);
            class355.field4828.method1877(true, class296.field3988 + var3);
            class355.field4828.method1877(true, class283.field3794 + var2);
            class355.field4828.method1874(Integer.MAX_VALUE & (int) (var6 >>> 32), 113);
            class355.field4828.method1836(class234.field3242[82] ? 1 : 0, -1);
            class448.method2795(var3, var6, (byte) -124, var2);
        }
        if (var4 == 14) {
            class338 var34 = class220.field3044[var5];
            if (var34 != null) {
                class392.field5501 = 2;
                class233.field3203 = class94.field1365;
                class241.field3336++;
                class416.field5821 = 0;
                class264.field3554 = class177.field2609;
                class355.field4828.method1801(161, (byte) -80);
                class355.field4828.method1877(true, var5);
                class355.field4828.method1836(class234.field3242[82] ? 1 : 0, arg1 - 1);
                class256.method1669(true, 0, var34.field4998[0], 0, class95.field1379.field5005[0], class95.field1379.field4998[0], var34.method2146(arg1 ^ 0xFFFFFF80), -2, var34.method2146(arg1 + 110), false, var34.field5005[0]);
            }
        }
        if (var4 == 31) {
            class301.method1932((byte) -127);
            class139 var35 = class10.method57(65535, var3);
            class363.field5021 = 1;
            class269.field3621 = var5;
            class22.field413 = var2;
            class272.field3661 = var3;
            class10.method52(var35, (byte) -89);
            class21.field390 = "<col=ff9040>" + class234.method1569(2142, var5).field6595 + "<col=ffffff>";
            if (class21.field390 == null) {
                class21.field390 = "null";
            }
            return;
        }
        if (var4 == 10) {
            class355.field4828.method1801(46, (byte) -51);
            class411.field5750++;
            class355.field4828.method1854(var3, true);
            class355.field4828.method1869((byte) -27, var2);
            class355.field4828.method1869((byte) 97, var5);
            class443.field6391 = 0;
            class388.field5461 = class10.method57(65535, var3);
            class76.field1132 = var2;
        }
        if (var4 == 9) {
            class338 var36 = class220.field3044[var5];
            if (var36 != null) {
                class200.field2848++;
                class392.field5501 = 2;
                class264.field3554 = class177.field2609;
                class233.field3203 = class94.field1365;
                class416.field5821 = 0;
                class355.field4828.method1801(149, (byte) -77);
                class355.field4828.method1869((byte) 118, var5);
                class355.field4828.method1872((byte) 54, class234.field3242[82] ? 1 : 0);
                class256.method1669(true, 0, var36.field4998[0], 0, class95.field1379.field5005[0], class95.field1379.field4998[0], var36.method2146(arg1 ^ 0x10), -2, var36.method2146(99), false, var36.field5005[0]);
            }
        }
        if (var4 == 8) {
            class348.field4720++;
            class264.field3554 = class177.field2609;
            class392.field5501 = 2;
            class416.field5821 = 0;
            class233.field3203 = class94.field1365;
            class355.field4828.method1801(153, (byte) -78);
            class355.field4828.method1877(true, class296.field3988 + var3);
            class355.field4828.method1869((byte) -83, class283.field3794 + var2);
            class355.field4828.method1872((byte) 54, class234.field3242[82] ? 1 : 0);
            class355.field4828.method1869((byte) -81, var5);
            class84.method761(var2, var3, true);
        }
        if (var4 == 38) {
            class416.field5821 = 0;
            class264.field3554 = class177.field2609;
            class233.field3203 = class94.field1365;
            class314.field4265++;
            class392.field5501 = 2;
            class355.field4828.method1801(230, (byte) -61);
            class355.field4828.method1874(var2 + class283.field3794, 121);
            class355.field4828.method1874((int) (var6 >>> 32) & Integer.MAX_VALUE, 90);
            class355.field4828.method1869((byte) 112, class296.field3988 + var3);
            class355.field4828.method1872((byte) 54, class234.field3242[82] ? 1 : 0);
            class448.method2795(var3, var6, (byte) -124, var2);
        }
        if (class363.field5021 != arg1) {
            class363.field5021 = 0;
            class10.method52(class10.method57(65535, class272.field3661), (byte) -89);
        }
        if (class3.field16) {
            class301.method1932((byte) 121);
        }
        if (class388.field5461 != null && class443.field6391 == 0) {
            class10.method52(class388.field5461, (byte) -89);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method371(int arg0) {
        if (arg0 != 54) {
            method371(-126);
        }
        field570 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class144.field2184[arg0][var8][var14] == -class19.field378) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class91.field1351[arg0].method1509(arg1, arg3) + arg5;
            if (!class10.method51(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class10.method51(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class10.method51(var9, var11, var13)) {
                return false;
            } else if (class10.method51(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class176.method1318(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class10.method51(var6 + 1, class91.field1351[arg0].method1509(arg1, arg3) + arg5, var7 + 1) && class10.method51(var6 + 128 - 1, class91.field1351[arg0].method1509(arg1 + 1, arg3) + arg5, var7 + 1) && class10.method51(var6 + 128 - 1, class91.field1351[arg0].method1509(arg1 + 1, arg3 + 1) + arg5, var7 + 128 - 1) && class10.method51(var6 + 1, class91.field1351[arg0].method1509(arg1, arg3 + 1) + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Ljava/lang/String;")
    public static final String method373(byte arg0) {
        field571++;
        String var1 = "www";
        if (arg0 != -86) {
            field567 = 106;
        }
        if (class445.field6400 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class301.field4042 != null) {
            var2 = "/p=" + class301.field4042;
        }
        return class42.field640 == 1 ? "http://" + var1 + ".stellardawn.com/l=" + class89.field1320 + "/a=" + class346.field4689 + var2 + "/" : "http://" + var1 + ".runescape.com/l=" + class89.field1320 + "/a=" + class346.field4689 + var2 + "/";
    }
}
