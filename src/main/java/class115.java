import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class115 extends class26 {

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "Ljava/lang/String;")
    public String field1483;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1482 = "glow1:";

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "Lai;")
    public static class76 field1486 = null;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "[Lte;")
    public static class261[] field1485 = new class261[14];

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "Ljava/lang/String;")
    public static String field1488 = " has logged in.";

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
    public static int field1489 = 0;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIB)V", line = 4)
    public static final void method842(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1480++;
        if (arg4 != 66) {
            method844((String) null, (byte) 51);
        }
        class42 var5 = class166.method1242(4, arg2, arg4 ^ 0xB58CAEA2);
        var5.method307((byte) -92);
        var5.field523 = arg0;
        var5.field536 = arg3;
        var5.field525 = arg1;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V", line = 23)
    public static void method843(int arg0) {
        field1486 = null;
        field1482 = null;
        field1488 = null;
        if (arg0 != 26213) {
            field1489 = 107;
        }
        field1485 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 36)
    public static final boolean method844(String arg0, byte arg1) {
        if (arg1 != -36) {
            method843(66);
        }
        field1487++;
        return class209.method1537(10, 55, true, arg0);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLfh;Lfh;)V", line = 55)
    public static final void method845(byte arg0, class140 arg1, class140 arg2) {
        class16.field190 = arg1;
        field1490++;
        class276.field3962 = arg2;
        class16.field190.method1088(36, 1);
        if (arg0 != -11) {
            field1482 = (String) null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IJ)V", line = 70)
    public static final void method846(int arg0, long arg1) {
        field1484++;
        if (arg1 == 0L) {
            return;
        }
        class251.field3681.method1309(23, 218);
        class251.field3681.method2049(-19780, arg1);
        if (arg0 != 18014) {
            field1485 = (class261[]) null;
        }
        class209.field2966++;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V", line = 94)
    public static final void method847(int arg0) {
        if (class275.field3943 > 1) {
            class323.field4739 = class64.field801;
            class275.field3943--;
        }
        field1479++;
        if (class16.field195 > 0) {
            class16.field195--;
        }
        if (class192.field2657) {
            class192.field2657 = false;
            class359.method2494((byte) -111);
            return;
        }
        for (int var1 = 0; var1 < 100 && class231.method1650(0); var1++) {
        }
        if (class316.field4661 != 30) {
            return;
        }
        class74.method542(class251.field3681, true, 78);
        Object var2 = class195.field2699.field2999;
        synchronized (class195.field2699.field2999) {
            if (!class144.field2004) {
                class195.field2699.field3002 = 0;
            } else if (class215.field3039 != 0 || class195.field2699.field3002 >= 40) {
                class251.field3681.method1309(23, 199);
                class82.field1046++;
                class251.field3681.method2048(0, 85);
                int var3 = 0;
                int var4 = class251.field3681.field4351;
                for (int var5 = 0; var5 < class195.field2699.field3002 && class251.field3681.field4351 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class195.field2699.field3004[var5];
                    int var7 = class195.field2699.field3003[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    if (class195.field2699.field3003[var5] == -1 && class195.field2699.field3004[var5] == -1) {
                        var8 = true;
                        var6 = -1;
                        var7 = -1;
                    }
                    if (class106.field1373 != var6 || class270.field3876 != var7) {
                        int var9 = var7 - class270.field3876;
                        class270.field3876 = var7;
                        int var10 = var6 - class106.field1373;
                        class106.field1373 = var6;
                        if (class251.field3690 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class251.field3681.method2098(-106, (class251.field3690 << 12) - (-(var10 << 6) - var9));
                            class251.field3690 = 0;
                        } else if (class251.field3690 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            class251.field3681.method2048(class251.field3690 + 128, 101);
                            var9 += 128;
                            var10 += 128;
                            class251.field3681.method2098(-44, (var10 << 8) + var9);
                            class251.field3690 = 0;
                        } else if (class251.field3690 < 32) {
                            class251.field3681.method2048(class251.field3690 + 192, 68);
                            if (var8) {
                                class251.field3681.method2084(true, Integer.MIN_VALUE);
                            } else {
                                class251.field3681.method2084(true, var6 | var7 << 16);
                            }
                            class251.field3690 = 0;
                        } else {
                            class251.field3681.method2098(-121, class251.field3690 + 57344);
                            if (var8) {
                                class251.field3681.method2084(true, Integer.MIN_VALUE);
                            } else {
                                class251.field3681.method2084(true, var6 | var7 << 16);
                            }
                            class251.field3690 = 0;
                        }
                    } else if (class251.field3690 < 2047) {
                        class251.field3690++;
                    }
                }
                class251.field3681.method2105((byte) -118, class251.field3681.field4351 - var4);
                if (var3 < class195.field2699.field3002) {
                    class195.field2699.field3002 -= var3;
                    for (int var11 = 0; var11 < class195.field2699.field3002; var11++) {
                        class195.field2699.field3004[var11] = class195.field2699.field3004[var3 + var11];
                        class195.field2699.field3003[var11] = class195.field2699.field3003[var3 + var11];
                    }
                } else {
                    class195.field2699.field3002 = 0;
                }
            }
        }
        if (class215.field3039 != 0) {
            class59.field758++;
            int var13 = class305.field4465;
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            long var14 = (class224.field3234 - class249.field3638) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            class249.field3638 = class224.field3234;
            int var16 = class140.field1950;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            byte var17 = 0;
            if (class215.field3039 == 2) {
                var17 = 1;
            }
            class251.field3681.method1309(23, 200);
            class251.field3681.method2058(-127, var13 << 16 | var16);
            int var18 = (int) var14;
            class251.field3681.method2081(-2076007248, var17 << 15 | var18);
        }
        if (class157.field2235 > 0) {
            class157.field2235--;
        }
        if (class311.field4573 && class157.field2235 <= 0) {
            class311.field4573 = false;
            class302.field4427++;
            class157.field2235 = 20;
            class251.field3681.method1309(23, 140);
            class251.field3681.method2080(255, (int) class302.field4426);
            class251.field3681.method2103((int) class247.field3601, (byte) -127);
        }
        if (class344.field5344 && !class277.field3974) {
            class277.field3974 = true;
            class251.field3681.method1309(23, 248);
            class251.field3681.method2048(1, 106);
            class130.field1778++;
        }
        if (!class344.field5344 && class277.field3974) {
            class277.field3974 = false;
            class251.field3681.method1309(23, 248);
            class130.field1778++;
            class251.field3681.method2048(0, 126);
        }
        if (!class352.field5491) {
            class344.field5350++;
            class251.field3681.method1309(23, 120);
            class251.field3681.method2084(true, class330.method2283((byte) -101));
            class352.field5491 = true;
        }
        if (class232.field3333) {
            class232.field3333 = false;
        } else {
            class206.field2874 /= 2.0F;
        }
        if (class318.field4685) {
            class318.field4685 = false;
        } else {
            class33.field408 /= 2.0F;
        }
        class210.method1547((byte) -108);
        if (class316.field4661 != 30) {
            return;
        }
        class199.method1463(3);
        class190.method1380(-1122255295);
        class302.method2115((byte) -124);
        class276.field3953++;
        if (class276.field3953 > 750) {
            class359.method2494((byte) -17);
            return;
        }
        class176.method1296(2047);
        class289.method1983((byte) 97);
        class121.method875((byte) 127);
        for (int var19 = class16.method116(2061, true); var19 != -1; var19 = class16.method116(2061, false)) {
            class137.method1032((byte) -98, var19);
            class276.field3961[class335.method2339(class78.field1004++, 31)] = var19;
        }
        for (class42 var20 = class119.method870((byte) -110); var20 != null; var20 = class119.method870((byte) -115)) {
            int var21 = var20.method302(255);
            int var22 = var20.method303(-30960);
            if (var21 == 1) {
                class194.field2689[var22] = var20.field523;
                class284.field4045[class335.method2339(class296.field4303++, 31)] = var22;
            } else if (var21 == 2) {
                class323.field4740[var22] = var20.field539;
                class284.field4056[class335.method2339(31, class288.field4174++)] = var22;
            } else if (var21 == 3) {
                class333 var43 = class89.method644(-119, var22);
                if (!var20.field539.equals(var43.field5058)) {
                    var43.field5058 = var20.field539;
                    class142.method1097(53, var43);
                }
            } else if (var21 == 4) {
                class333 var23 = class89.method644(89, var22);
                int var24 = var20.field523;
                int var25 = var20.field536;
                int var26 = var20.field525;
                if (var23.field5144 != var24 || var23.field5070 != var25 || var23.field5107 != var26) {
                    var23.field5070 = var25;
                    var23.field5107 = var26;
                    var23.field5144 = var24;
                    class142.method1097(46, var23);
                }
            } else if (var21 == 5) {
                class333 var42 = class89.method644(-92, var22);
                if (var20.field523 != var42.field5053 || var20.field523 == -1) {
                    var42.field5054 = 0;
                    var42.field5053 = var20.field523;
                    var42.field5218 = 1;
                    var42.field5074 = 0;
                    class142.method1097(81, var42);
                }
            } else if (var21 == 6) {
                int var36 = var20.field523;
                int var37 = var36 >> 5 & 0x1F;
                class333 var38 = class89.method644(74, var22);
                int var39 = (var36 & 0x7E28) >> 10;
                int var40 = var36 & 0x1F;
                int var41 = (var40 << 3) + ((var39 << 19) + (var37 << 11));
                if (var38.field5138 != var41) {
                    var38.field5138 = var41;
                    class142.method1097(9, var38);
                }
            } else if (var21 == 7) {
                class333 var27 = class89.method644(-100, var22);
                boolean var28 = var20.field523 == 1;
                if (var27.field5158 != var28) {
                    var27.field5158 = var28;
                    class142.method1097(40, var27);
                }
            } else if (var21 == 8) {
                class333 var29 = class89.method644(-124, var22);
                if (var20.field523 != var29.field5160 || var20.field536 != var29.field5210 || var20.field525 != var29.field5116) {
                    var29.field5210 = var20.field536;
                    var29.field5116 = var20.field525;
                    if (var29.field5143 != -1) {
                        if (var29.field5183 > 0) {
                            var29.field5116 = var29.field5116 * 32 / var29.field5183;
                        } else if (var29.field5127 > 0) {
                            var29.field5116 = var29.field5116 * 32 / var29.field5127;
                        }
                    }
                    var29.field5160 = var20.field523;
                    class142.method1097(121, var29);
                }
            } else if (var21 == 9) {
                class333 var30 = class89.method644(75, var22);
                if (var20.field523 != var30.field5143 || var20.field536 != var30.field5191) {
                    var30.field5191 = var20.field536;
                    var30.field5143 = var20.field523;
                    class142.method1097(46, var30);
                }
            } else if (var21 == 10) {
                class333 var35 = class89.method644(-119, var22);
                if (var20.field523 != var35.field5192 || var20.field536 != var35.field5087 || var20.field525 != var35.field5042) {
                    var35.field5087 = var20.field536;
                    var35.field5192 = var20.field523;
                    var35.field5042 = var20.field525;
                    class142.method1097(-128, var35);
                }
            } else if (var21 == 11) {
                class333 var31 = class89.method644(-127, var22);
                var31.field5188 = var31.field5128 = var20.field523;
                var31.field5045 = var31.field5174 = var20.field536;
                var31.field5130 = 0;
                var31.field5164 = 0;
                class142.method1097(-121, var31);
            } else if (var21 == 12) {
                class333 var33 = class89.method644(71, var22);
                int var34 = var20.field523;
                if (var33 != null && var33.field5105 == 0) {
                    if (var33.field5044 - var33.field5172 < var34) {
                        var34 = var33.field5044 - var33.field5172;
                    }
                    if (var34 < 0) {
                        var34 = 0;
                    }
                    if (var33.field5134 != var34) {
                        var33.field5134 = var34;
                        class142.method1097(40, var33);
                    }
                }
            } else if (var21 == 13) {
                class333 var32 = class89.method644(-124, var22);
                var32.field5078 = var20.field523;
            }
        }
        if (class310.field4568 != 0) {
            class95.field1238 += 20;
            if (class95.field1238 >= 400) {
                class310.field4568 = 0;
            }
        }
        class186.field2551++;
        if (class245.field3568 != null) {
            class211.field2985++;
            if (class211.field2985 >= 15) {
                class142.method1097(78, class245.field3568);
                class245.field3568 = null;
            }
        }
        if (class348.field5455 != null) {
            class142.method1097(-128, class348.field5455);
            if (class154.field2141 + 5 < class105.field1361 || class105.field1361 < (class154.field2141 - 5) || class80.field1028 > class78.field1005 + 5 || class80.field1028 < (class78.field1005 - 5)) {
                class209.field2963 = true;
            }
            class227.field3260++;
            if (class42.field521 == 0) {
                if (class209.field2963 && class227.field3260 >= 5) {
                    if (class348.field5455 == class304.field4450 && class283.field4029 != class273.field3910) {
                        class333 var44 = class348.field5455;
                        class319.field4695++;
                        byte var45 = 0;
                        if (class333.field5140 == 1 && var44.field5084 == 206) {
                            var45 = 1;
                        }
                        if (var44.field5088[class283.field4029] <= 0) {
                            var45 = 0;
                        }
                        if (client.method891(var44).method1106(-45)) {
                            int var46 = class283.field4029;
                            int var47 = class273.field3910;
                            var44.field5088[var46] = var44.field5088[var47];
                            var44.field5093[var46] = var44.field5093[var47];
                            var44.field5088[var47] = -1;
                            var44.field5093[var47] = 0;
                        } else if (var45 == 1) {
                            int var48 = class273.field3910;
                            int var49 = class283.field4029;
                            while (var48 != var49) {
                                if (var49 < var48) {
                                    var44.method2329(var48, (byte) 89, var48 - 1);
                                    var48--;
                                } else if (var48 < var49) {
                                    var44.method2329(var48, (byte) 89, var48 + 1);
                                    var48++;
                                }
                            }
                        } else {
                            var44.method2329(class273.field3910, (byte) 88, class283.field4029);
                        }
                        class251.field3681.method1309(23, 6);
                        class251.field3681.method2103(class283.field4029, (byte) -125);
                        class251.field3681.method2053(83, var45);
                        class251.field3681.method2051((byte) 21, class348.field5455.field5109);
                        class251.field3681.method2080(255, class273.field3910);
                    }
                } else if ((class233.field3342 == 1 || class226.method1633(0, class66.field853 - 1)) && class66.field853 > 2) {
                    class191.method1389((byte) 77);
                } else if (class66.field853 > 0) {
                    class80.method564((byte) -125);
                }
                class211.field2985 = 10;
                class348.field5455 = null;
                class215.field3039 = 0;
            }
        }
        class75.field988 = false;
        class219.field3083 = null;
        class362.field5699 = 0;
        class333 var50 = class204.field2845;
        class204.field2845 = null;
        class333 var51 = class353.field5508;
        class353.field5508 = null;
        class126.field1683 = false;
        while (class272.method1852((byte) -66) && class362.field5699 < 128) {
            class48.field647[class362.field5699] = class143.field1995;
            class97.field1283[class362.field5699] = class362.field5679;
            class362.field5699++;
        }
        class23.field260 = null;
        if (class233.field3340 != -1) {
            class122.method884(class233.field3340, class163.field2314, 0, 0, 0, 0, -115, class192.field2660);
        }
        class64.field801++;
        if (class23.field260 != null) {
            class253.method1767((byte) -107);
        }
        while (true) {
            class135 var52;
            class333 var53;
            class333 var54;
            do {
                var52 = (class135) class263.field3817.method411(false);
                if (var52 == null) {
                    while (true) {
                        class135 var55;
                        class333 var56;
                        class333 var57;
                        do {
                            var55 = (class135) class179.field2447.method411(false);
                            if (var55 == null) {
                                while (true) {
                                    class135 var58;
                                    class333 var59;
                                    class333 var60;
                                    do {
                                        var58 = (class135) class276.field3956.method411(false);
                                        if (var58 == null) {
                                            if (class23.field260 == null) {
                                                class249.field3614 = 0;
                                            }
                                            if (class33.field410 != null) {
                                                class227.method1636(-2);
                                            }
                                            if (class217.field3070 > 0 && class143.field1991[82] && class143.field1991[81] && class152.field2136 != 0) {
                                                int var61 = class56.field724 - class152.field2136;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class86.method624((byte) -120, class359.field5616.field4842[0] + class331.field4867, class359.field5616.field4936[0] + class355.field5556, var61);
                                            }
                                            if (class217.field3070 > 0 && class143.field1991[82] && class143.field1991[81]) {
                                                if (class327.field4773 != -1) {
                                                    class86.method624((byte) -120, class331.field4867 + class327.field4773, class355.field5556 + class336.field5258, class56.field724);
                                                }
                                                class185.field2532 = 0;
                                                class352.field5502 = 0;
                                            } else if (class352.field5502 == 2) {
                                                if (class327.field4773 != -1) {
                                                    class134.field1824++;
                                                    class251.field3681.method1309(23, 204);
                                                    class251.field3681.method2081(-2076007248, class355.field5556 + class336.field5258);
                                                    class251.field3681.method2081(-2076007248, class71.field936);
                                                    class251.field3681.method2051((byte) 21, class315.field4649);
                                                    class251.field3681.method2080(255, class331.field4867 + class327.field4773);
                                                    class210.field2975 = class140.field1950;
                                                    class310.field4568 = 1;
                                                    class95.field1238 = 0;
                                                    class52.field682 = class305.field4465;
                                                }
                                                class352.field5502 = 0;
                                            } else if (class185.field2532 == 2) {
                                                if (class327.field4773 != -1) {
                                                    class251.field3681.method1309(23, 85);
                                                    class313.field4596++;
                                                    class251.field3681.method2103(class331.field4867 + class327.field4773, (byte) -126);
                                                    class251.field3681.method2080(255, class355.field5556 + class336.field5258);
                                                    class310.field4568 = 1;
                                                    class95.field1238 = 0;
                                                    class52.field682 = class305.field4465;
                                                    class210.field2975 = class140.field1950;
                                                }
                                                class185.field2532 = 0;
                                            } else if (class327.field4773 != -1 && class352.field5502 == 0 && class185.field2532 == 0) {
                                                int var62 = (class327.field4773 << 1) + 1 - class359.field5616.method1699(-1) >> 1;
                                                int var63 = (class336.field5258 << 1) + 1 - class359.field5616.method1699(-1) >> 1;
                                                class236.method1676(var62, 0, -1, var63);
                                                class210.field2975 = class140.field1950;
                                                class52.field682 = class305.field4465;
                                                class310.field4568 = 1;
                                                class95.field1238 = 0;
                                                class352.method2450(class359.field5616.field4842[0], 0, 0, true, 0, var63, class359.field5616.field4936[0], 0, (byte) -99, 0, var62);
                                            }
                                            class327.field4773 = -1;
                                            class204.method1486(13);
                                            if (class204.field2845 != var50) {
                                                if (var50 != null) {
                                                    class142.method1097(92, var50);
                                                }
                                                if (class204.field2845 != null) {
                                                    class142.method1097(-128, class204.field2845);
                                                }
                                            }
                                            if (class353.field5508 != var51 && class86.field1096 == class302.field4422) {
                                                if (var51 != null) {
                                                    class142.method1097(106, var51);
                                                }
                                                if (class353.field5508 != null) {
                                                    class142.method1097(-116, class353.field5508);
                                                }
                                            }
                                            if (class353.field5508 == null) {
                                                if (class86.field1096 > 0) {
                                                    class86.field1096--;
                                                }
                                            } else if (class86.field1096 < class302.field4422) {
                                                class86.field1096++;
                                                if (class86.field1096 == class302.field4422) {
                                                    class142.method1097(94, class353.field5508);
                                                }
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class345.field5368[var64]++;
                                            }
                                            if (arg0 > -70) {
                                                method842(88, -89, -117, 117, (byte) -65);
                                            }
                                            int var65 = class231.method1649(0);
                                            int var66 = class173.method1274(1);
                                            if (var65 > 15000 && var66 > 15000) {
                                                class29.field335++;
                                                class16.field195 = 250;
                                                class184.method1342(3, 14500);
                                                class251.field3681.method1309(23, 91);
                                            }
                                            if (class289.field4188 != null && class289.field4188.field2608 == 1) {
                                                if (class289.field4188.field2606 != null) {
                                                    class232.method1654(124, class126.field1686, class55.field711);
                                                }
                                                class126.field1686 = null;
                                                class289.field4188 = null;
                                                class55.field711 = false;
                                            }
                                            class95.field1245++;
                                            class5.field55++;
                                            class121.field1594++;
                                            if (class95.field1245 > 500) {
                                                class95.field1245 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x2) == 2) {
                                                    class91.field1155 += class40.field498;
                                                }
                                                if ((var67 & 0x1) == 1) {
                                                    class154.field2143 += class310.field4552;
                                                }
                                                if ((var67 & 0x4) == 4) {
                                                    class59.field753 += class360.field5627;
                                                }
                                            }
                                            if (class91.field1155 < -55) {
                                                class40.field498 = 2;
                                            }
                                            if (class91.field1155 > 55) {
                                                class40.field498 = -2;
                                            }
                                            if (class154.field2143 < -50) {
                                                class310.field4552 = 2;
                                            }
                                            if (class121.field1594 > 500) {
                                                class121.field1594 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x1) == 1) {
                                                    class354.field5534 += class222.field3205;
                                                }
                                                if ((var68 & 0x2) == 2) {
                                                    class318.field4690 += class292.field4256;
                                                }
                                            }
                                            if (class318.field4690 < -20) {
                                                class292.field4256 = 1;
                                            }
                                            if (class154.field2143 > 50) {
                                                class310.field4552 = -2;
                                            }
                                            if (class354.field5534 < -60) {
                                                class222.field3205 = 2;
                                            }
                                            if (class354.field5534 > 60) {
                                                class222.field3205 = -2;
                                            }
                                            if (class59.field753 < -40) {
                                                class360.field5627 = 1;
                                            }
                                            if (class59.field753 > 40) {
                                                class360.field5627 = -1;
                                            }
                                            if (class318.field4690 > 10) {
                                                class292.field4256 = -1;
                                            }
                                            if (class5.field55 > 50) {
                                                class251.field3681.method1309(23, 137);
                                                class238.field3439++;
                                            }
                                            if (class360.field5625) {
                                                class248.method1737(33554431);
                                                class360.field5625 = false;
                                            }
                                            try {
                                                if (class265.field3848 != null && class251.field3681.field4351 > 0) {
                                                    class265.field3848.method530(0, class251.field3681.field4350, class251.field3681.field4351, 30000);
                                                    class251.field3681.field4351 = 0;
                                                    class5.field55 = 0;
                                                }
                                            } catch (IOException var70) {
                                                class359.method2494((byte) -94);
                                            }
                                            return;
                                        }
                                        var59 = var58.field1831;
                                        if (var59.field5199 < 0) {
                                            break;
                                        }
                                        var60 = class89.method644(-99, var59.field5142);
                                    } while (var60 == null || var60.field5187 == null || var59.field5199 >= var60.field5187.length || var60.field5187[var59.field5199] != var59);
                                    class276.method1869(true, var58);
                                }
                            }
                            var56 = var55.field1831;
                            if (var56.field5199 < 0) {
                                break;
                            }
                            var57 = class89.method644(33, var56.field5142);
                        } while (var57 == null || var57.field5187 == null || var57.field5187.length <= var56.field5199 || var57.field5187[var56.field5199] != var56);
                        class276.method1869(true, var55);
                    }
                }
                var53 = var52.field1831;
                if (var53.field5199 < 0) {
                    break;
                }
                var54 = class89.method644(-103, var53.field5142);
            } while (var54 == null || var54.field5187 == null || var54.field5187.length <= var53.field5199 || var54.field5187[var53.field5199] != var53);
            class276.method1869(true, var52);
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V", line = 1098)
    public class115() {
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 1111)
    public class115(String arg0, int arg1) {
        this.field1483 = arg0;
    }
}
