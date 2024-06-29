import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class241 {

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Lok;")
    public static class146 field4001 = class235.method1724(-12908, ":tradereq:");

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Lok;")
    public static class146 field4003 = class235.method1724(-12908, "(U4");

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public int field3999;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public int field4000;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public int field4005;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public int field4006;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "J")
    public long field4012;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Lbf;")
    public class322 field4002;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "Lbf;")
    public class322 field4007;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Lbf;")
    public class322 field4011;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)I", line = 7)
    public static final int method1747(boolean arg0) {
        field4009++;
        if (arg0) {
            method1751((byte) -46, 97);
        }
        return class280.field4809.method798((byte) -55);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lok;BIII)V", line = 25)
    public static final void method1748(class146 arg0, byte arg1, int arg2, int arg3, int arg4) {
        class264 var5 = class165.method1289(arg3, true, arg2);
        field3998++;
        if (var5 == null) {
            return;
        }
        if (var5.field4471 != null) {
            class124 var6 = new class124();
            var6.field2023 = arg4;
            var6.field2039 = var5;
            var6.field2035 = arg0;
            var6.field2031 = var5.field4471;
            class43.method297(3335, var6);
        }
        boolean var7 = true;
        if (var5.field4470 > 0) {
            var7 = class184.method1448(var5, 16237);
        }
        if (!var7 || !class98.method676(arg4 - 1, 65535, client.method1789(var5))) {
            return;
        }
        if (arg4 == 1) {
            class237.field3959++;
            class47.field820.method1656(27, 16);
            class47.field820.method387(arg3, 117);
            class47.field820.method361(arg2, 1635554120);
        }
        if (arg4 == 2) {
            class96.field1571++;
            class47.field820.method1656(164, 16);
            class47.field820.method387(arg3, 123);
            class47.field820.method361(arg2, 1635554120);
        }
        int var8 = 52 % ((53 - arg1) / 60);
        if (arg4 == 3) {
            class20.field383++;
            class47.field820.method1656(57, 16);
            class47.field820.method387(arg3, 86);
            class47.field820.method361(arg2, 1635554120);
        }
        if (arg4 == 4) {
            class47.field820.method1656(155, 16);
            class22.field411++;
            class47.field820.method387(arg3, 126);
            class47.field820.method361(arg2, 1635554120);
        }
        if (arg4 == 5) {
            class168.field2831++;
            class47.field820.method1656(2, 16);
            class47.field820.method387(arg3, 115);
            class47.field820.method361(arg2, 1635554120);
        }
        if (arg4 == 6) {
            class47.field820.method1656(184, 16);
            class4.field39++;
            class47.field820.method387(arg3, 84);
            class47.field820.method361(arg2, 1635554120);
        }
        if (arg4 == 7) {
            class47.field820.method1656(144, 16);
            class47.field820.method387(arg3, 77);
            class47.field820.method361(arg2, 1635554120);
            class170.field2875++;
        }
        if (arg4 == 8) {
            class179.field3017++;
            class47.field820.method1656(154, 16);
            class47.field820.method387(arg3, 96);
            class47.field820.method361(arg2, 1635554120);
        }
        if (arg4 == 9) {
            class7.field145++;
            class47.field820.method1656(134, 16);
            class47.field820.method387(arg3, 118);
            class47.field820.method361(arg2, 1635554120);
        }
        if (arg4 == 10) {
            class47.field820.method1656(129, 16);
            class47.field820.method387(arg3, 121);
            class199.field3323++;
            class47.field820.method361(arg2, 1635554120);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 157)
    public static void method1749(int arg0) {
        if (arg0 == 8902) {
            field4003 = null;
            field4001 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILok;ILok;)V", line = 183)
    public static final void method1750(int arg0, class146 arg1, int arg2, class146 arg3) {
        class161.field2734 = arg3;
        class161.field2715 = arg1;
        field3996++;
        class39.field694 = arg0;
        if (class161.field2734.method1100((byte) -124, class161.field2740) || class161.field2715.method1100((byte) 105, class161.field2740)) {
            class101.field1633 = 3;
        } else if (class72.field1178 == -1) {
            class22.field412 = 1;
            class101.field1633 = -3;
            class15.field284 = 0;
            class91.field1454 = 0;
            class47 var4 = new class47(128);
            var4.method332(10, 114);
            var4.method361((int) (Math.random() * 99999.0D), 1635554120);
            if (arg2 == -14308) {
                var4.method361(528, 1635554120);
                var4.method359(class161.field2734.method1123(-13726), 128);
                var4.method387((int) (Math.random() * 9.9999999E7D), 106);
                var4.method339(-109, class161.field2715);
                var4.method387((int) (Math.random() * 9.9999999E7D), 77);
                var4.method358(class318.field5373, (byte) 115, class118.field1895);
                class47.field820.field857 = 0;
                class47.field820.method332(111, 69);
                class47.field820.method332(var4.field857, 103);
                class47.field820.method372(var4.field857, var4.field860, (byte) 70, 0);
            }
        } else {
            class159.method1248(false);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)V", line = 232)
    public static final void method1751(byte arg0, int arg1) {
        field3997++;
        if (arg0 != -110) {
            method1748((class146) null, (byte) -70, -65, -85, 123);
        }
        class158 var2 = class206.method1564(arg1, 7, -113);
        var2.method1238(-125);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)V", line = 249)
    public static final void method1752(boolean arg0) {
        if (class40.field700 > 0) {
            class40.field700--;
        }
        if (class57.field1012 > 1) {
            class57.field1012--;
            class192.field3204 = class13.field253;
        }
        field4008++;
        if (class43.field745) {
            class43.field745 = false;
            class264.method1904(4803);
            return;
        }
        for (int var1 = 0; var1 < 100 && class260.method1883(14083); var1++) {
        }
        if (class238.field3973 != 30) {
            return;
        }
        class120.method840(217, class47.field820, 127);
        Object var2 = class273.field4679.field1023;
        synchronized (class273.field4679.field1023) {
            if (!class320.field5479) {
                class273.field4679.field1034 = 0;
            } else if (class251.field4203 != 0 || class273.field4679.field1034 >= 40) {
                class47.field820.method1656(4, 16);
                class47.field820.method332(0, 87);
                int var3 = class47.field820.field857;
                class206.field3448++;
                int var4 = 0;
                for (int var5 = 0; var5 < class273.field4679.field1034 && (class47.field820.field857 - var3) < 240; var5++) {
                    var4++;
                    int var6 = class273.field4679.field1036[var5];
                    boolean var7 = false;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var8 = class273.field4679.field1035[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class273.field4679.field1036[var5] == -1 && class273.field4679.field1035[var5] == -1) {
                        var6 = -1;
                        var7 = true;
                        var8 = -1;
                    }
                    if (class120.field1977 != var8 || class210.field3472 != var6) {
                        int var9 = var8 - class120.field1977;
                        int var10 = var6 - class210.field3472;
                        class120.field1977 = var8;
                        class210.field3472 = var6;
                        if (class15.field292 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class47.field820.method361((class15.field292 << 12) + (var9 << 6) + var10, 1635554120);
                            class15.field292 = 0;
                        } else if (class15.field292 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var9 += 128;
                            var10 += 128;
                            class47.field820.method332(class15.field292 + 128, 112);
                            class47.field820.method361((var9 << 8) + var10, 1635554120);
                            class15.field292 = 0;
                        } else if (class15.field292 >= 32) {
                            class47.field820.method361(class15.field292 + 57344, 1635554120);
                            if (var7) {
                                class47.field820.method387(Integer.MIN_VALUE, 114);
                            } else {
                                class47.field820.method387(var6 << 16 | var8, 110);
                            }
                            class15.field292 = 0;
                        } else {
                            class47.field820.method332(class15.field292 + 192, 124);
                            if (var7) {
                                class47.field820.method387(Integer.MIN_VALUE, 126);
                            } else {
                                class47.field820.method387(var6 << 16 | var8, 125);
                            }
                            class15.field292 = 0;
                        }
                    } else if (class15.field292 < 2047) {
                        class15.field292++;
                    }
                }
                class47.field820.method331(92, class47.field820.field857 - var3);
                if (class273.field4679.field1034 <= var4) {
                    class273.field4679.field1034 = 0;
                } else {
                    class273.field4679.field1034 -= var4;
                    for (int var11 = 0; var11 < class273.field4679.field1034; var11++) {
                        class273.field4679.field1035[var11] = class273.field4679.field1035[var4 + var11];
                        class273.field4679.field1036[var11] = class273.field4679.field1036[var11 + var4];
                    }
                }
            }
        }
        if (class251.field4203 != 0) {
            class33.field631++;
            long var13 = (class31.field583 - class223.field3722) / 50L;
            class223.field3722 = class31.field583;
            int var15 = class120.field1974;
            int var16 = class215.field3542;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var17 = 0;
            if (class251.field4203 == 2) {
                var17 = 1;
            }
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            class47.field820.method1656(228, 16);
            int var18 = (int) var13;
            class47.field820.method330(var17 << 15 | var18, 128);
            class47.field820.method353(var15 | var16 << 16, (byte) -32);
        }
        if (class119.field1938 > 0) {
            class119.field1938--;
        }
        if (class215.field3549) {
            for (int var19 = 0; var19 < class222.field3695; var19++) {
                int var20 = class47.field878[var19];
                if (var20 == 98 || var20 == 99 || var20 == 96 || var20 == 97) {
                    class165.field2799 = true;
                    break;
                }
            }
        } else if (class113.field1813[96] || class113.field1813[97] || class113.field1813[98] || class113.field1813[99]) {
            class165.field2799 = true;
        }
        if (class165.field2799 && class119.field1938 <= 0) {
            class165.field2799 = false;
            class127.field2061++;
            class119.field1938 = 20;
            class47.field820.method1656(125, 16);
            class47.field820.method361(class211.field3490, 1635554120);
            class47.field820.method330(class158.field2668, 128);
        }
        if (class83.field1328 && !class283.field4852) {
            class283.field4852 = true;
            class87.field1384++;
            class47.field820.method1656(39, 16);
            class47.field820.method332(1, 94);
        }
        if (!class83.field1328 && class283.field4852) {
            class87.field1384++;
            class283.field4852 = false;
            class47.field820.method1656(39, 16);
            class47.field820.method332(0, 104);
        }
        if (!class157.field2654) {
            class25.field449++;
            class47.field820.method1656(151, 16);
            class47.field820.method353(class102.method696(-31), (byte) -32);
            class157.field2654 = true;
        }
        class282.method2045((byte) -85);
        if (class238.field3973 != 30) {
            return;
        }
        class223.method1647((byte) 121);
        class292.method2091(-60);
        class99.field1603++;
        if (class99.field1603 > 750) {
            class264.method1904(4803);
            return;
        }
        class60.method465(-1);
        class303.method2141((byte) -52);
        class207.method1568(2);
        if (class185.field3081 != null) {
            class137.method1012(false);
        }
        for (int var21 = class292.method2087((byte) 115, true); var21 != -1; var21 = class292.method2087((byte) 115, false)) {
            class58.method457(var21, -11917);
            class63.field1092[class82.method582(class117.field1885++, 31)] = var21;
        }
        for (class158 var22 = class46.method328(-1); var22 != null; var22 = class46.method328(-1)) {
            int var23 = var22.method1243(-1);
            int var24 = var22.method1237(0);
            if (var23 == 1) {
                class9.field181[var24] = var22.field2663;
                class110.field1778[class82.method582(31, class169.field2860++)] = var24;
            } else if (var23 == 2) {
                class191.field3151[var24] = var22.field2659;
                class222.field3698[class82.method582(class83.field1323++, 31)] = var24;
            } else if (var23 == 3) {
                class264 var44 = class98.method680(var24, false);
                if (!var22.field2659.method1100((byte) 109, var44.field4453)) {
                    var44.field4453 = var22.field2659;
                    class164.method1280(false, var44);
                }
            } else if (var23 == 4) {
                class264 var25 = class98.method680(var24, false);
                int var26 = var22.field2672;
                int var27 = var22.field2663;
                if (var25.field4384 != var27 || var25.field4544 != var26) {
                    var25.field4544 = var26;
                    var25.field4384 = var27;
                    class164.method1280(false, var25);
                }
            } else if (var23 == 5) {
                class264 var28 = class98.method680(var24, false);
                if (var22.field2663 != var28.field4378 || var22.field2663 == -1) {
                    var28.field4378 = var22.field2663;
                    var28.field4474 = 0;
                    var28.field4448 = 0;
                    class164.method1280(false, var28);
                }
            } else if (var23 == 6) {
                int var38 = var22.field2663;
                int var39 = var38 >> 10 & 0x1F;
                int var40 = var38 & 0x1F;
                int var41 = var38 >> 5 & 0x1F;
                int var42 = (var40 << 3) + ((var39 << 19) + (var41 << 11));
                class264 var43 = class98.method680(var24, arg0);
                if (var43.field4442 != var42) {
                    var43.field4442 = var42;
                    class164.method1280(arg0, var43);
                }
            } else if (var23 == 7) {
                class264 var29 = class98.method680(var24, arg0);
                boolean var30 = var22.field2663 == 1;
                if (var30 != var29.field4539) {
                    var29.field4539 = var30;
                    class164.method1280(false, var29);
                }
            } else if (var23 == 8) {
                class264 var37 = class98.method680(var24, arg0);
                if (var22.field2663 != var37.field4410 || var22.field2672 != var37.field4514 || var22.field2662 != var37.field4403) {
                    var37.field4403 = var22.field2662;
                    if (var37.field4394 != -1) {
                        if (var37.field4541 > 0) {
                            var37.field4403 = var37.field4403 * 32 / var37.field4541;
                        } else if (var37.field4445 > 0) {
                            var37.field4403 = var37.field4403 * 32 / var37.field4445;
                        }
                    }
                    var37.field4410 = var22.field2663;
                    var37.field4514 = var22.field2672;
                    class164.method1280(false, var37);
                }
            } else if (var23 == 9) {
                class264 var31 = class98.method680(var24, arg0);
                if (var22.field2663 != var31.field4394 || var22.field2672 != var31.field4447) {
                    var31.field4447 = var22.field2672;
                    var31.field4394 = var22.field2663;
                    class164.method1280(false, var31);
                }
            } else if (var23 == 10) {
                class264 var36 = class98.method680(var24, false);
                if (var22.field2663 != var36.field4487 || var22.field2672 != var36.field4540 || var22.field2662 != var36.field4420) {
                    var36.field4487 = var22.field2663;
                    var36.field4420 = var22.field2662;
                    var36.field4540 = var22.field2672;
                    class164.method1280(arg0, var36);
                }
            } else if (var23 == 11) {
                class264 var35 = class98.method680(var24, false);
                var35.field4425 = 0;
                var35.field4434 = var35.field4408 = var22.field2663;
                var35.field4424 = var35.field4534 = var22.field2672;
                var35.field4455 = 0;
                class164.method1280(false, var35);
            } else if (var23 == 12) {
                class264 var32 = class98.method680(var24, false);
                int var33 = var22.field2663;
                if (var32 != null && var32.field4536 == 0) {
                    if (var33 > (var32.field4513 - var32.field4381)) {
                        var33 = var32.field4513 - var32.field4381;
                    }
                    if (var33 < 0) {
                        var33 = 0;
                    }
                    if (var32.field4377 != var33) {
                        var32.field4377 = var33;
                        class164.method1280(false, var32);
                    }
                }
            } else if (var23 == 13) {
                class264 var34 = class98.method680(var24, arg0);
                var34.field4528 = var22.field2663;
            }
        }
        class214.field3534++;
        if (class63.field1093 != 0) {
            class74.field1207 += 20;
            if (class74.field1207 >= 400) {
                class63.field1093 = 0;
            }
        }
        if (class280.field4804 != null) {
            class152.field2578++;
            if (class152.field2578 >= 15) {
                class164.method1280(false, class280.field4804);
                class280.field4804 = null;
            }
        }
        if (class43.field738 != null) {
            class164.method1280(false, class43.field738);
            class217.field3576++;
            if (class232.field3875 > class237.field3953 + 5 || class237.field3953 - 5 > class232.field3875 || class316.field5368 > (class57.field1008 + 5) || class316.field5368 < class57.field1008 - 5) {
                class114.field1840 = true;
            }
            if (class14.field272 == 0) {
                if (class114.field1840 && class217.field3576 >= 5) {
                    if (class51.field927 == class43.field738 && class296.field5037 != class101.field1631) {
                        class165.field2796++;
                        byte var45 = 0;
                        class264 var46 = class43.field738;
                        if (class123.field2007 == 1 && var46.field4470 == 206) {
                            var45 = 1;
                        }
                        if (var46.field4437[class101.field1631] <= 0) {
                            var45 = 0;
                        }
                        if (class58.method458(false, client.method1789(var46))) {
                            int var49 = class296.field5037;
                            int var50 = class101.field1631;
                            var46.field4437[var50] = var46.field4437[var49];
                            var46.field4492[var50] = var46.field4492[var49];
                            var46.field4437[var49] = -1;
                            var46.field4492[var49] = 0;
                        } else if (var45 == 1) {
                            int var47 = class296.field5037;
                            int var48 = class101.field1631;
                            while (var47 != var48) {
                                if (var47 > var48) {
                                    var46.method1905(var47, var47 - 1, (byte) 8);
                                    var47--;
                                } else if (var47 < var48) {
                                    var46.method1905(var47, var47 + 1, (byte) 8);
                                    var47++;
                                }
                            }
                        } else {
                            var46.method1905(class296.field5037, class101.field1631, (byte) 8);
                        }
                        class47.field820.method1656(149, 16);
                        class47.field820.method338(class43.field738.field4461, -70);
                        class47.field820.method370(var45, 100);
                        class47.field820.method365(class101.field1631, (byte) 78);
                        class47.field820.method342((byte) -128, class296.field5037);
                    }
                } else if ((class98.field1581 == 1 || class279.method2028(class45.field763 - 1, 2000)) && class45.field763 > 2) {
                    class50.method413((byte) -29);
                } else if (class45.field763 > 0) {
                    class119.method813(-128);
                }
                class251.field4203 = 0;
                class152.field2578 = 10;
                class43.field738 = null;
            }
        }
        class88.field1398 = arg0;
        class264 var51 = class124.field2037;
        class13.field254 = null;
        class185.field3094 = false;
        class124.field2037 = null;
        class264 var52 = class102.field1661;
        class102.field1661 = null;
        for (class222.field3695 = 0; class52.method424((byte) -112) && class222.field3695 < 128; class222.field3695++) {
            class47.field878[class222.field3695] = class57.field1011;
            class202.field3374[class222.field3695] = class272.field4669;
        }
        class185.field3081 = null;
        if (class236.field3943 != -1) {
            class192.method1480(false, 0, class148.field2518, 0, class56.field997, class236.field3943, 0, 0);
        }
        class13.field253++;
        while (true) {
            class124 var53;
            class264 var54;
            class264 var55;
            do {
                var53 = (class124) class262.field4345.method1254(0);
                if (var53 == null) {
                    while (true) {
                        class124 var56;
                        class264 var57;
                        class264 var58;
                        do {
                            var56 = (class124) class21.field401.method1254(0);
                            if (var56 == null) {
                                while (true) {
                                    class124 var59;
                                    class264 var60;
                                    class264 var61;
                                    do {
                                        var59 = (class124) class158.field2667.method1254(0);
                                        if (var59 == null) {
                                            if (class5.field83 && class185.field3081 == null) {
                                                class5.field83 = false;
                                            }
                                            if (class213.field3521 != null) {
                                                class273.method1995((byte) 72);
                                            }
                                            if (class191.field3164 > 0 && class113.field1813[82] && class113.field1813[81] && class236.field3947 != 0) {
                                                int var62 = class203.field3387 - class236.field3947;
                                                if (var62 < 0) {
                                                    var62 = 0;
                                                } else if (var62 > 3) {
                                                    var62 = 3;
                                                }
                                                class87.method602(var62, class15.field300 + class102.field1639.field5419[0], 66, class102.field1639.field5432[0] + class201.field3357);
                                            }
                                            if (class191.field3164 > 0 && class113.field1813[82] && class113.field1813[81]) {
                                                if (class157.field2652 != -1) {
                                                    class87.method602(class203.field3387, class157.field2652 + class15.field300, -92, class313.field5337 + class201.field3357);
                                                }
                                                class192.field3193 = 0;
                                                class85.field1351 = 0;
                                            } else if (class85.field1351 == 2) {
                                                if (class157.field2652 != -1) {
                                                    class196.field3275++;
                                                    class47.field820.method1656(7, 16);
                                                    class47.field820.method342((byte) -127, class157.field2652 + class15.field300);
                                                    class47.field820.method388(client.field4081, (byte) 127);
                                                    class47.field820.method330(class214.field3535, 128);
                                                    class47.field820.method361(class201.field3357 + class313.field5337, 1635554120);
                                                    class161.field2737 = class120.field1974;
                                                    class260.field4328 = class215.field3542;
                                                    class63.field1093 = 1;
                                                    class74.field1207 = 0;
                                                }
                                                class85.field1351 = 0;
                                            } else if (class192.field3193 == 2) {
                                                if (class157.field2652 != -1) {
                                                    class47.field820.method1656(36, 16);
                                                    class47.field820.method342((byte) -124, class157.field2652 + class15.field300);
                                                    class264.field4545++;
                                                    class47.field820.method330(class313.field5337 + class201.field3357, 128);
                                                    class74.field1207 = 0;
                                                    class260.field4328 = class215.field3542;
                                                    class63.field1093 = 1;
                                                    class161.field2737 = class120.field1974;
                                                }
                                                class192.field3193 = 0;
                                            } else if (class157.field2652 != -1 && class85.field1351 == 0 && class192.field3193 == 0) {
                                                boolean var63 = class305.method2148(true, 0, 0, class102.field1639.field5432[0], class157.field2652, 0, class313.field5337, 0, 0, class102.field1639.field5419[0], true, 0);
                                                if (var63) {
                                                    class63.field1093 = 1;
                                                    class74.field1207 = 0;
                                                    class260.field4328 = class215.field3542;
                                                    class161.field2737 = class120.field1974;
                                                }
                                            }
                                            class157.field2652 = -1;
                                            class297.method2109(-111);
                                            if (class124.field2037 != var51) {
                                                if (var51 != null) {
                                                    class164.method1280(false, var51);
                                                }
                                                if (class124.field2037 != null) {
                                                    class164.method1280(false, class124.field2037);
                                                }
                                            }
                                            if (class102.field1661 != var52 && class254.field4234 == class102.field1643) {
                                                if (var52 != null) {
                                                    class164.method1280(false, var52);
                                                }
                                                if (class102.field1661 != null) {
                                                    class164.method1280(false, class102.field1661);
                                                }
                                            }
                                            if (class102.field1661 == null) {
                                                if (class254.field4234 > 0) {
                                                    class254.field4234--;
                                                }
                                            } else if (class254.field4234 < class102.field1643) {
                                                class254.field4234++;
                                                if (class254.field4234 == class102.field1643) {
                                                    class164.method1280(false, class102.field1661);
                                                }
                                            }
                                            if (class302.field5172 == 1) {
                                                class118.method808(111);
                                            } else if (class302.field5172 == 2) {
                                                class60.method462((byte) 126);
                                            } else {
                                                class122.method846((byte) 85);
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class110.field1775[var64]++;
                                            }
                                            int var65 = class126.method867((byte) -56);
                                            int var66 = class266.method1928(2048);
                                            if (var65 > 15000 && var66 > 15000) {
                                                class39.field692++;
                                                class40.field700 = 250;
                                                class76.method556(14500, -1);
                                                class47.field820.method1656(153, 16);
                                            }
                                            if (class159.field2692 != null && class159.field2692.field4265 == 1) {
                                                if (class159.field2692.field4269 != null) {
                                                    class165.method1287(class148.field2511, -1, class55.field982);
                                                }
                                                class55.field982 = false;
                                                class159.field2692 = null;
                                                class148.field2511 = null;
                                            }
                                            class115.field1850++;
                                            class313.field5350++;
                                            class206.field3449++;
                                            if (class206.field3449 > 500) {
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x4) == 4) {
                                                    class51.field918 += class32.field623;
                                                }
                                                class206.field3449 = 0;
                                                if ((var67 & 0x1) == 1) {
                                                    class180.field3024 += class295.field5003;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class217.field3587 += class134.field2241;
                                                }
                                            }
                                            if (class180.field3024 < -50) {
                                                class295.field5003 = 2;
                                            }
                                            if (class51.field918 < -40) {
                                                class32.field623 = 1;
                                            }
                                            if (class51.field918 > 40) {
                                                class32.field623 = -1;
                                            }
                                            if (class313.field5350 > 500) {
                                                class313.field5350 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x1) == 1) {
                                                    class87.field1378 += class33.field629;
                                                }
                                                if ((var68 & 0x2) == 2) {
                                                    class238.field3976 += class216.field3566;
                                                }
                                            }
                                            if (class180.field3024 > 50) {
                                                class295.field5003 = -2;
                                            }
                                            if (class217.field3587 < -55) {
                                                class134.field2241 = 2;
                                            }
                                            if (class217.field3587 > 55) {
                                                class134.field2241 = -2;
                                            }
                                            if (class238.field3976 < -20) {
                                                class216.field3566 = 1;
                                            }
                                            if (class87.field1378 < -60) {
                                                class33.field629 = 2;
                                            }
                                            if (class87.field1378 > 60) {
                                                class33.field629 = -2;
                                            }
                                            if (class238.field3976 > 10) {
                                                class216.field3566 = -1;
                                            }
                                            if (class115.field1850 > 50) {
                                                class47.field820.method1656(41, 16);
                                                class237.field3952++;
                                            }
                                            if (class171.field2892) {
                                                class138.method1016((byte) -120);
                                                class171.field2892 = false;
                                            }
                                            try {
                                                if (class98.field1582 != null && class47.field820.field857 > 0) {
                                                    class98.field1582.method279(125, 0, class47.field820.field857, class47.field820.field860);
                                                    class47.field820.field857 = 0;
                                                    class115.field1850 = 0;
                                                }
                                            } catch (IOException var70) {
                                                class264.method1904(4803);
                                            }
                                            return;
                                        }
                                        var60 = var59.field2039;
                                        if (var60.field4417 < 0) {
                                            break;
                                        }
                                        var61 = class98.method680(var60.field4497, false);
                                    } while (var61 == null || var61.field4402 == null || var61.field4402.length <= var60.field4417 || var61.field4402[var60.field4417] != var60);
                                    class43.method297(3335, var59);
                                }
                            }
                            var57 = var56.field2039;
                            if (var57.field4417 < 0) {
                                break;
                            }
                            var58 = class98.method680(var57.field4497, false);
                        } while (var58 == null || var58.field4402 == null || var58.field4402.length <= var57.field4417 || var58.field4402[var57.field4417] != var57);
                        class43.method297(3335, var56);
                    }
                }
                var54 = var53.field2039;
                if (var54.field4417 < 0) {
                    break;
                }
                var55 = class98.method680(var54.field4497, arg0);
            } while (var55 == null || var55.field4402 == null || var55.field4402.length <= var54.field4417 || var55.field4402[var54.field4417] != var54);
            class43.method297(3335, var53);
        }
    }
}
