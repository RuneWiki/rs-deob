import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class class566 {

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Luc;")
    public static class27 field8280 = class422.method2552(18176);

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "[C")
    public static char[] field8281 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Lwo;")
    public static class690 field8282 = new class690(100, 4);

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "[I")
    public static int[] field8283 = new int[50];

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field8278;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field8279;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 6)
    public static void method3318(int arg0) {
        field8282 = null;
        field8281 = null;
        field8280 = null;
        field8283 = null;
        if (arg0 != 0) {
            method3318(-24);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILn;I)V", line = 21)
    public static final void method3319(int arg0, int arg1, class17 arg2, int arg3) {
        field8279++;
        if (arg2 == null) {
            return;
        }
        if (arg2.field410 != null) {
            class143 var4 = new class143();
            var4.field1789 = arg2;
            var4.field1786 = arg2.field410;
            class545.method3204(var4);
        }
        class251.field3440 = arg0;
        class564.field8154 = arg2.field376;
        class99.field1336 = true;
        if (arg1 <= 53) {
            field8282 = null;
        }
        class10.field99 = arg2.field463;
        class391.field5243 = arg2.field465;
        class19.field524 = arg3;
        class386.field5147 = arg2.field485;
        class282.field3819 = arg2.field412;
        class314.method1836(arg2, false);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V", line = 54)
    public static final void method3320(byte arg0) {
        field8278++;
        if (class690.field9842 == 0 || class690.field9842 == 6) {
            return;
        }
        try {
            if (++class441.field6295 > 2000) {
                if (class489.field6835 != null) {
                    class489.field6835.method1853((byte) 11);
                    class489.field6835 = null;
                }
                if (class31.field640 >= 2) {
                    class690.field9842 = 0;
                    class676.method3841(-5, -23);
                    return;
                }
                if (class611.field8763 == 2 || class611.field8763 == 3) {
                    class281.field3813.method1944(0);
                } else {
                    class125.field1603.method1944(0);
                }
                class31.field640++;
                class690.field9842 = 1;
                class441.field6295 = 0;
            }
            if (class690.field9842 == 1) {
                if (class611.field8763 == 2 || class611.field8763 == 3) {
                    class90.field1263 = class281.field3813.method1940(-16093, class517.field7570);
                } else {
                    class90.field1263 = class125.field1603.method1940(-16093, class517.field7570);
                }
                class690.field9842 = 2;
            }
            if (class690.field9842 == 2) {
                if (class90.field1263.field6693 == 2) {
                    throw new IOException();
                }
                if (class90.field1263.field6693 != 1) {
                    return;
                }
                class489.field6835 = class220.method1335(7500, (Socket) class90.field1263.field6695, -82);
                class90.field1263 = null;
                long var1 = class374.field5031 = class78.method653(class468.field6540, -3328);
                class295.method1745((byte) -62);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class543 var4 = class215.method1314((byte) -111);
                var4.field7872.method2281((byte) 58, class238.field3274.field7714);
                var4.field7872.method2281((byte) 58, var3);
                class511.method3028(7482, var4);
                class238.method1462(26);
                class690.field9842 = 3;
            }
            if (class690.field9842 == 3) {
                if (!class489.field6835.method1856(-1, 1)) {
                    return;
                }
                class489.field6835.method1851(class29.field617.field5205, 1, (byte) -3, 0);
                int var5 = class29.field617.field5205[0] & 0xFF;
                if (var5 != 0) {
                    class690.field9842 = 0;
                    class676.method3841(var5, -87);
                    class489.field6835.method1853((byte) 11);
                    class489.field6835 = null;
                    class561.method3280(0);
                    return;
                }
                class690.field9842 = 4;
            }
            if (class690.field9842 == 4) {
                if (!class489.field6835.method1856(-1, 8)) {
                    return;
                }
                class489.field6835.method1851(class29.field617.field5205, 8, (byte) -3, 0);
                class29.field617.field5195 = 0;
                class113.field1463 = class29.field617.method2227(-26276);
                class389 var6 = new class389(518);
                int[] var7 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class113.field1463 >> 32), (int) class113.field1463 };
                var6.method2281((byte) 58, 10);
                var6.method2233((byte) -122, var7[0]);
                var6.method2233((byte) -121, var7[1]);
                var6.method2233((byte) -64, var7[2]);
                var6.method2233((byte) 109, var7[3]);
                var6.method2230((byte) 23, class78.method653(class468.field6540, -3328));
                var6.method2269(class422.field6010, -98);
                var6.method2230((byte) 23, class236.field3182);
                var6.method2230((byte) 23, class94.field1301);
                var6.method2263(class27.field605, (byte) -89, class475.field6653);
                class295.method1745((byte) -63);
                class543 var8 = class215.method1314((byte) -111);
                class5 var9 = var8.field7872;
                if (class611.field8763 == 2 || class611.field8763 == 3) {
                    if (class114.field1485 == 13) {
                        var9.method2281((byte) 58, class238.field3279.field7714);
                    } else {
                        var9.method2281((byte) 58, class238.field3277.field7714);
                    }
                    var9.method2261((byte) 36, 0);
                    int var11 = var9.field5195;
                    var9.method2233((byte) 98, 623);
                    var9.method2281((byte) 58, class168.field2054);
                    var9.method2281((byte) 58, class158.method996(3));
                    var9.method2261((byte) 87, class467.field6533);
                    var9.method2261((byte) 90, class300.field4038);
                    var9.method2281((byte) 58, class221.field2851.field4152);
                    class638.method3638(var9, -16638);
                    var9.method2269(class190.field2323, -92);
                    var9.method2233((byte) -94, class171.field2092);
                    class389 var12 = new class389(class673.method3832((byte) -80));
                    class221.field2851.method1846((byte) -109, var12);
                    var9.method2281((byte) 58, var12.field5195);
                    var9.method2253(var12.field5205, (byte) -23, var12.field5195, 0);
                    class553.field8029 = true;
                    class389 var13 = new class389(class652.method3672((byte) 123));
                    (new class430(true, class517.field7570)).method2583(false, var13);
                    var9.method2253(var13.field5205, (byte) -23, var13.field5205.length, 0);
                    var9.method2261((byte) 50, class697.field9869);
                    var9.method2230((byte) 23, class163.field1995);
                    var9.method2281((byte) 58, class12.field203 == null ? 0 : 1);
                    if (class12.field203 != null) {
                        var9.method2269(class12.field203, -69);
                    }
                    class337.method1941(var9, 0);
                    var9.method2253(var6.field5205, (byte) -23, var6.field5195, 0);
                    var9.method2283(2, var9.field5195 - var11);
                } else {
                    var9.method2281((byte) 58, class238.field3280.field7714);
                    var9.method2261((byte) 89, 0);
                    int var10 = var9.field5195;
                    var9.method2233((byte) -60, 623);
                    var9.method2281((byte) 58, class588.field8518.field1256);
                    var9.method2281((byte) 58, class370.field4980);
                    class638.method3638(var9, -16638);
                    var9.method2269(class190.field2323, -86);
                    var9.method2233((byte) 101, class171.field2092);
                    class337.method1941(var9, 0);
                    var9.method2253(var6.field5205, (byte) -23, var6.field5195, 0);
                    var9.method2283(2, var9.field5195 - var10);
                }
                class511.method3028(7482, var8);
                class238.method1462(94);
                class84.field1196 = new class656(var7);
                for (int var14 = 0; var14 < 4; var14++) {
                    var7[var14] += 50;
                }
                class29.field617.method24(var7, (byte) -66);
                class690.field9842 = 5;
            }
            if (class690.field9842 == 5) {
                if (!class489.field6835.method1856(-1, 1)) {
                    return;
                }
                class489.field6835.method1851(class29.field617.field5205, 1, (byte) -3, 0);
                int var15 = class29.field617.field5205[0] & 0xFF;
                if (var15 == 21) {
                    class690.field9842 = 8;
                } else if (var15 == 29) {
                    class690.field9842 = 14;
                } else if (var15 == 1) {
                    class690.field9842 = 6;
                    class676.method3841(var15, -86);
                    return;
                } else if (var15 == 2) {
                    class690.field9842 = 9;
                } else if (var15 == 15) {
                    class283.field3848 = -2;
                    class690.field9842 = 15;
                } else if (var15 == 23 && class31.field640 < 2) {
                    class441.field6295 = 0;
                    class31.field640++;
                    class690.field9842 = 1;
                    class489.field6835.method1853((byte) 11);
                    class489.field6835 = null;
                    return;
                } else {
                    class690.field9842 = 0;
                    class676.method3841(var15, -103);
                    class489.field6835.method1853((byte) 11);
                    class489.field6835 = null;
                    class561.method3280(0);
                    return;
                }
            }
            if (class690.field9842 == 7) {
                class295.method1745((byte) -97);
                class543 var16 = class215.method1314((byte) -111);
                class5 var17 = var16.field7872;
                var17.method29(false, class84.field1196);
                var17.method35(class238.field3287.field7714, 2);
                class511.method3028(7482, var16);
                class238.method1462(100);
                class690.field9842 = 5;
                return;
            }
            if (class690.field9842 == 8) {
                if (!class489.field6835.method1856(-1, 1)) {
                    return;
                }
                class489.field6835.method1851(class29.field617.field5205, 1, (byte) -3, 0);
                int var18 = class29.field617.field5205[0] & 0xFF;
                class690.field9842 = 0;
                class285.field3864 = (var18 + 3) * 60;
                class676.method3841(21, -34);
                class489.field6835.method1853((byte) 11);
                class489.field6835 = null;
                class561.method3280(0);
                return;
            }
            if (class690.field9842 == 14) {
                if (!class489.field6835.method1856(-1, 1)) {
                    return;
                }
                class489.field6835.method1851(class29.field617.field5205, 1, (byte) -3, 0);
                class690.field9842 = 0;
                class367.field4942 = class29.field617.field5205[0] & 0xFF;
                class676.method3841(29, -91);
                class489.field6835.method1853((byte) 11);
                class489.field6835 = null;
                class561.method3280(0);
                return;
            }
            if (class690.field9842 == 9) {
                if (!class489.field6835.method1856(-1, 1)) {
                    return;
                }
                class489.field6835.method1851(class29.field617.field5205, 1, (byte) -3, 0);
                class690.field9842 = 10;
                class521.field7647 = class29.field617.field5205[0] & 0xFF;
                return;
            }
            if (class690.field9842 == 10) {
                class5 var19 = class29.field617;
                if (class611.field8763 == 3) {
                    class84.field1193 = true;
                } else {
                    class84.field1193 = false;
                }
                if (class611.field8763 == 2 || class611.field8763 == 3) {
                    if (!class489.field6835.method1856(-1, class521.field7647)) {
                        return;
                    }
                    class489.field6835.method1851(var19.field5205, class521.field7647, (byte) -3, 0);
                    var19.field5195 = 0;
                    class37.field698 = var19.method2229(255);
                    class460.field6459 = var19.method2229(255);
                    class256.field3481 = var19.method2229(255) == 1;
                    class341.field4503 = var19.method2229(255) == 1;
                    class255.field3460 = var19.method2229(255) == 1;
                    class689.field9822 = var19.method2229(255) == 1;
                    class63.field1016 = var19.method2260(-104);
                    class626.field8987 = var19.method2229(255) == 1;
                    class395.field5585 = var19.method2219((byte) 109);
                    class646.field9195 = var19.method2229(255) == 1;
                    if (class611.field8763 == 3) {
                        boolean var20 = var19.method2229(255) == 1;
                        if (var20) {
                            long var21 = var19.method2227(-26276);
                            String var23 = class437.method2613((byte) -109, var21);
                            int var24 = var19.method2229(255);
                            byte[] var25 = new byte[var24];
                            var19.method34(1024, 0, var25, var24);
                            String var26 = class470.method2758(var25, 33);
                            class38 var27 = null;
                            try {
                                class477 var28 = class517.field7570.method1505("3", -1, false);
                                while (var28.field6693 == 0) {
                                    class151.method974((byte) -102, 1L);
                                }
                                if (var28.field6693 == 1) {
                                    var27 = (class38) var28.field6695;
                                    int var29 = (var23.length() - (-var26.length() - 7)) + 13;
                                    if (class12.field203 != null) {
                                        var29 += class12.field203.length() + 2;
                                    }
                                    if (var29 > 120) {
                                        throw new RuntimeException(">120");
                                    }
                                    class389 var30 = new class389(var29 + 1);
                                    var30.method2281((byte) 58, var29);
                                    var30.method2281((byte) 58, 3);
                                    var30.method2221(true, var23);
                                    var30.method2221(true, var26);
                                    var30.method2261((byte) 82, class171.field2092);
                                    var30.method2230((byte) 23, class163.field1995);
                                    var30.method2281((byte) 58, class12.field203 == null ? 0 : 1);
                                    if (class12.field203 != null) {
                                        var30.method2221(true, class12.field203);
                                    }
                                    var30.method2232((byte) -36);
                                    var27.method441(0, var30.field5205, var30.field5195, 3763);
                                }
                            } catch (Exception var41) {
                            }
                            try {
                                if (var27 != null) {
                                    var27.method442((byte) -72);
                                }
                            } catch (Exception var39) {
                            }
                            try {
                                class140.method923(class627.field8991, (byte) 110, "demoaccountcreated");
                            } catch (Throwable var38) {
                            }
                        }
                    }
                    class37.field703.method814((byte) 90, class646.field9195);
                    class65.field1021.method180(0, class646.field9195);
                    class206.field2477.method1956(8, class646.field9195);
                } else if (class489.field6835.method1856(-1, class521.field7647)) {
                    class489.field6835.method1851(var19.field5205, class521.field7647, (byte) -3, 0);
                    var19.field5195 = 0;
                    class37.field698 = var19.method2229(255);
                    class460.field6459 = var19.method2229(255);
                    class256.field3481 = var19.method2229(255) == 1;
                    class341.field4503 = var19.method2229(255) == 1;
                    class255.field3460 = var19.method2229(255) == 1;
                    class548.field7960 = var19.method2270((byte) 71);
                    class626.field8987 = class548.field7960 > 0;
                    class633.field9094 = var19.method2260(-119);
                    class528.field7722 = var19.method2260(-59);
                    class202.field2440 = var19.method2260(-48);
                    class389.field5220 = var19.method2255(255);
                    class430.field6163 = class517.field7570.method1513((byte) -57, class389.field5220);
                    class4.field20 = var19.method2229(255);
                    class322.field4248 = var19.method2260(-29);
                    class578.field8442 = var19.method2260(-41);
                    class255.field3464 = var19.method2229(255) == 1;
                    class206.field2472.field8801 = class206.field2472.field8786 = var19.method2257(11587);
                    class332.field4416 = var19.method2229(255);
                    class673.field9669 = var19.method2255(255);
                    class562.field8111 = new class337();
                    class562.field8111.field4476 = var19.method2260(-46);
                    if (class562.field8111.field4476 == 65535) {
                        class562.field8111.field4476 = -1;
                    }
                    class562.field8111.field4480 = var19.method2257(11587);
                    if (class39.field729 != class215.field2737) {
                        class562.field8111.field4470 = class562.field8111.field4476 + 50000;
                        class562.field8111.field4468 = class562.field8111.field4476 + 40000;
                    }
                    if (class37.field708 != class215.field2737 && (class281.field3813.method1942(class409.field5796, -123) || class281.field3813.method1942(class577.field8433, -119))) {
                        class614.method3524(0);
                    }
                } else {
                    return;
                }
                if ((!class256.field3481 || class255.field3460) && !class626.field8987) {
                    try {
                        class140.method923(class627.field8991, (byte) 125, "unzap");
                    } catch (Throwable var36) {
                    }
                } else {
                    try {
                        class140.method923(class627.field8991, (byte) -70, "zap");
                    } catch (Throwable var40) {
                        if (class173.field2134) {
                            try {
                                class627.field8991.getAppletContext().showDocument(new URL(class627.field8991.getCodeBase(), "blank.ws"), "tbi");
                            } catch (Exception var37) {
                            }
                        }
                    }
                }
                if (class39.field729 == class215.field2737) {
                    try {
                        class140.method923(class627.field8991, (byte) 72, "loggedin");
                    } catch (Throwable var35) {
                    }
                }
                if (class611.field8763 != 2 && class611.field8763 != 3) {
                    class690.field9842 = 0;
                    class676.method3841(2, -66);
                    class78.method652(27);
                    class245.method1487(7, -21316);
                    class523.field7670 = null;
                    return;
                }
                class690.field9842 = 12;
            }
            if (class690.field9842 == 12) {
                if (!class489.field6835.method1856(-1, 3)) {
                    return;
                }
                class489.field6835.method1851(class29.field617.field5205, 3, (byte) -3, 0);
                class690.field9842 = 13;
            }
            if (class690.field9842 == 13) {
                class5 var31 = class29.field617;
                var31.field5195 = 0;
                if (var31.method23(-129)) {
                    if (!class489.field6835.method1856(-1, 1)) {
                        return;
                    }
                    class489.field6835.method1851(var31.field5205, 1, (byte) -3, 3);
                }
                class523.field7670 = class6.method36(0)[var31.method27(255)];
                class283.field3848 = var31.method2260(-27);
                class690.field9842 = 11;
            }
            if (class690.field9842 == 11) {
                if (!class489.field6835.method1856(-1, class283.field3848)) {
                    return;
                }
                class489.field6835.method1851(class29.field617.field5205, class283.field3848, (byte) -3, 0);
                class29.field617.field5195 = 0;
                class690.field9842 = 0;
                int var32 = class283.field3848;
                class676.method3841(2, -111);
                class152.method977(0);
                class7.method43(-994059972, class29.field617);
                class532.field7778 = -1;
                if (class523.field7670 == class447.field6332) {
                    class133.method892((byte) -112);
                } else {
                    class152.method979((byte) -50);
                }
                if (class29.field617.field5195 != var32) {
                    throw new RuntimeException("lswp pos:" + class29.field617.field5195 + " psize:" + var32);
                }
                class523.field7670 = null;
                return;
            }
            if (class690.field9842 == 15) {
                if (class283.field3848 == -2) {
                    if (!class489.field6835.method1856(-1, 2)) {
                        return;
                    }
                    class489.field6835.method1851(class29.field617.field5205, 2, (byte) -3, 0);
                    class29.field617.field5195 = 0;
                    class283.field3848 = class29.field617.method2260(-55);
                }
                if (!class489.field6835.method1856(-1, class283.field3848)) {
                    return;
                }
                class489.field6835.method1851(class29.field617.field5205, class283.field3848, (byte) -3, 0);
                class29.field617.field5195 = 0;
                class690.field9842 = 0;
                int var33 = class283.field3848;
                class676.method3841(15, -43);
                class78.method654((byte) -21);
                class7.method43(-994059972, class29.field617);
                if (class29.field617.field5195 != var33) {
                    throw new RuntimeException("lswpr pos:" + class29.field617.field5195 + " psize:" + var33);
                }
                class523.field7670 = null;
                return;
            }
        } catch (IOException var42) {
            if (class489.field6835 != null) {
                class489.field6835.method1853((byte) 11);
                class489.field6835 = null;
            }
            if (class31.field640 < 2) {
                if (class611.field8763 == 2 || class611.field8763 == 3) {
                    class281.field3813.method1944(0);
                } else {
                    class125.field1603.method1944(0);
                }
                class31.field640++;
                class690.field9842 = 1;
                class441.field6295 = 0;
            } else {
                class690.field9842 = 0;
                class676.method3841(-4, -101);
                class561.method3280(0);
            }
        }
        int var34 = 100 % ((arg0 - 86) / 38);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZLas;)Las;")
    public abstract class136 method2572(boolean arg0, class136 arg1);
}
