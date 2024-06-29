import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class593 {

    @OriginalMember(owner = "client!co", name = "c", descriptor = "[[[I")
    public static int[][][] field8022;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field8020;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field8021;

    static {
        new class101("", 76);
        field8022 = new int[2][][];
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V", line = 3)
    public static void method3222(byte arg0) {
        if (arg0 != -18) {
            method3224((byte) -63);
        }
        field8022 = null;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)[Lft;", line = 13)
    public static final class285[] method3223(int arg0) {
        if (arg0 <= 97) {
            return null;
        } else {
            field8021++;
            return new class285[] { class337.field4361, class530.field6875, class158.field1979, class91.field1194, class298.field3898, class596.field8050, class581.field7908, class25.field295, class83.field1129, class275.field3609, class389.field4983, class559.field7308, class493.field6523, class240.field3243, class679.field9360, class605.field8191 };
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(B)V", line = 30)
    public static final void method3224(byte arg0) {
        field8020++;
        if (class60.field816 == 0 || class60.field816 == 6) {
            return;
        }
        try {
            if ((++class401.field5118) > 2000) {
                if (class2.field15 != null) {
                    class2.field15.method281(0);
                    class2.field15 = null;
                }
                if (class194.field2540 >= 2) {
                    class60.field816 = 0;
                    class252.method1602(-112, -5);
                    return;
                }
                if (class57.field769 == 2 || class57.field769 == 3) {
                    class423.field5473.method1638(arg0 + 33);
                } else {
                    class657.field9166.method1638(128);
                }
                class194.field2540++;
                class60.field816 = 1;
                class401.field5118 = 0;
            }
            if (class60.field816 == 1) {
                if (class57.field769 == 2 || class57.field769 == 3) {
                    class398.field5074 = class423.field5473.method1639(false, class688.field9413);
                } else {
                    class398.field5074 = class657.field9166.method1639(false, class688.field9413);
                }
                class60.field816 = 2;
            }
            if (class60.field816 == 2) {
                if (class398.field5074.field7108 == 2) {
                    throw new IOException();
                }
                if (class398.field5074.field7108 != 1) {
                    return;
                }
                class2.field15 = class9.method45((Socket) class398.field5074.field7113, arg0 ^ 0x5E, 7500);
                class398.field5074 = null;
                long var1 = class285.field3698 = class510.method2746(class135.field1784, (byte) 72);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class114.method864(arg0 ^ 0x5F);
                class11 var4 = class421.method2423(-92);
                var4.field114.method2352(true, class206.field2649.field6068);
                var4.field114.method2352(true, var3);
                class100.method760(var4, -101);
                class96.method730(0);
                class60.field816 = 3;
            }
            if (class60.field816 == 3) {
                if (!class2.field15.method278(1, arg0 ^ 0x5A)) {
                    return;
                }
                class2.field15.method279(19311, class230.field3069.field5393, 0, 1);
                int var5 = class230.field3069.field5393[0] & 0xFF;
                if (var5 != 0) {
                    class60.field816 = 0;
                    class252.method1602(-108, var5);
                    class2.field15.method281(0);
                    class2.field15 = null;
                    class361.method2069(-111);
                    return;
                }
                class60.field816 = 4;
            }
            if (class60.field816 == 4) {
                if (!class2.field15.method278(8, 5)) {
                    return;
                }
                class2.field15.method279(19311, class230.field3069.field5393, 0, 8);
                class230.field3069.field5367 = 0;
                class401.field5122 = class230.field3069.method2377(-605269408);
                class418 var6 = new class418(518);
                int[] var7 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class401.field5122 >> 32), (int) class401.field5122 };
                var6.method2352(true, 10);
                var6.method2353(var7[0], (byte) -112);
                var6.method2353(var7[1], (byte) -103);
                var6.method2353(var7[2], (byte) -46);
                var6.method2353(var7[3], (byte) -86);
                var6.method2391((byte) 110, class510.method2746(class135.field1784, (byte) 72));
                var6.method2374(class83.field1128, -103);
                var6.method2391((byte) 110, class510.field6690);
                var6.method2391((byte) 110, class154.field1953);
                var6.method2403((byte) -125, class550.field7153, class574.field7481);
                class114.method864(0);
                class11 var8 = class421.method2423(64);
                class534 var9 = var8.field114;
                if (class57.field769 == 2 || class57.field769 == 3) {
                    if (class566.field7391 == 13) {
                        var9.method2352(true, class206.field2656.field6068);
                    } else {
                        var9.method2352(true, class206.field2654.field6068);
                    }
                    var9.method2386(0, 1103587288);
                    int var11 = var9.field5367;
                    var9.method2353(615, (byte) -85);
                    var9.method2352(true, class222.field2906);
                    var9.method2352(true, class62.method528(2));
                    var9.method2386(class519.field6796, 1103587288);
                    var9.method2386(class461.field6047, arg0 ^ 0x41C76787);
                    var9.method2352(true, class260.field3509.field1287);
                    class275.method1670(var9, arg0 + 13);
                    var9.method2374(class384.field4915, -82);
                    var9.method2353(class31.field467, (byte) -67);
                    class418 var12 = new class418(class268.method1650(arg0 - 49));
                    class260.field3509.method736((byte) 68, var12);
                    var9.method2352(true, var12.field5367);
                    var9.method2358(arg0 ^ 0x20, var12.field5367, 0, var12.field5393);
                    class249.field3389 = true;
                    class418 var13 = new class418(class428.method2458(121));
                    (new class459(true, class688.field9413)).method2581(var13, 18538);
                    var9.method2358(102, var13.field5393.length, 0, var13.field5393);
                    var9.method2386(class30.field453, 1103587288);
                    var9.method2391((byte) 110, class569.field7432);
                    class118.method884(var9, 100);
                    var9.method2358(100, var6.field5367, 0, var6.field5393);
                    var9.method2407((byte) 98, var9.field5367 - var11);
                } else {
                    var9.method2352(true, class206.field2657.field6068);
                    var9.method2386(0, arg0 ^ 0x41C76787);
                    int var10 = var9.field5367;
                    var9.method2353(615, (byte) -80);
                    var9.method2352(true, class153.field1947.field8837);
                    var9.method2352(true, class144.field1890);
                    class275.method1670(var9, arg0 ^ 0xFFFFFFB3);
                    var9.method2374(class384.field4915, -91);
                    var9.method2353(class31.field467, (byte) -86);
                    class118.method884(var9, 66);
                    var9.method2358(123, var6.field5367, 0, var6.field5393);
                    var9.method2407((byte) 98, var9.field5367 - var10);
                }
                class100.method760(var8, -113);
                class96.method730(0);
                class649.field9035 = new class541(var7);
                for (int var14 = 0; var14 < 4; var14++) {
                    var7[var14] += 50;
                }
                class230.field3069.method2842(-13709, var7);
                class60.field816 = 5;
            }
            if (class60.field816 == 5) {
                if (!class2.field15.method278(1, arg0 ^ 0x5A)) {
                    return;
                }
                class2.field15.method279(arg0 ^ 0x4B30, class230.field3069.field5393, 0, 1);
                int var15 = class230.field3069.field5393[0] & 0xFF;
                if (var15 == 21) {
                    class60.field816 = 8;
                } else if (var15 == 29) {
                    class60.field816 = 14;
                } else if (var15 == 1) {
                    class60.field816 = 6;
                    class252.method1602(-100, var15);
                    return;
                } else if (var15 == 2) {
                    class60.field816 = 9;
                } else if (var15 == 15) {
                    class88.field1169 = -2;
                    class60.field816 = 15;
                } else if (var15 == 23 && class194.field2540 < 2) {
                    class60.field816 = 1;
                    class194.field2540++;
                    class401.field5118 = 0;
                    class2.field15.method281(0);
                    class2.field15 = null;
                    return;
                } else {
                    class60.field816 = 0;
                    class252.method1602(-109, var15);
                    class2.field15.method281(arg0 ^ 0x5F);
                    class2.field15 = null;
                    class361.method2069(118);
                    return;
                }
            }
            if (class60.field816 == 7) {
                class114.method864(arg0 ^ 0x5F);
                class11 var16 = class421.method2423(-106);
                class534 var17 = var16.field114;
                var17.method2843((byte) -8, class649.field9035);
                var17.method2835(class206.field2664.field6068, (byte) -80);
                class100.method760(var16, arg0 ^ 0xFFFFFFC8);
                class96.method730(0);
                class60.field816 = 5;
            } else if (class60.field816 == 8) {
                if (class2.field15.method278(1, arg0 - 90)) {
                    class2.field15.method279(19311, class230.field3069.field5393, 0, 1);
                    int var18 = class230.field3069.field5393[0] & 0xFF;
                    class60.field816 = 0;
                    class561.field7329 = var18 * 60 + 180;
                    class252.method1602(arg0 - 201, 21);
                    class2.field15.method281(arg0 ^ 0x5F);
                    class2.field15 = null;
                    class361.method2069(-101);
                }
            } else if (class60.field816 == 14) {
                if (class2.field15.method278(1, 5)) {
                    class2.field15.method279(19311, class230.field3069.field5393, 0, 1);
                    class60.field816 = 0;
                    class219.field2881 = class230.field3069.field5393[0] & 0xFF;
                    class252.method1602(-114, 29);
                    class2.field15.method281(0);
                    class2.field15 = null;
                    class361.method2069(-108);
                }
            } else if (class60.field816 != 9) {
                if (class60.field816 == 10) {
                    class534 var19 = class230.field3069;
                    if (class57.field769 == 3) {
                        class107.field1389 = true;
                    } else {
                        class107.field1389 = false;
                    }
                    if (class57.field769 == 2 || class57.field769 == 3) {
                        if (!class2.field15.method278(class469.field6132, 5)) {
                            return;
                        }
                        class2.field15.method279(19311, var19.field5393, 0, class469.field6132);
                        var19.field5367 = 0;
                        class54.field741 = var19.method2396(arg0 - 40);
                        class110.field1435 = var19.method2396(arg0 ^ 0xFFFFFFDA);
                        class578.field7883 = var19.method2396(arg0 ^ 0xFFFFFFCA) == 1;
                        class282.field3678 = var19.method2396(-115) == 1;
                        class592.field8013 = var19.method2396(arg0 ^ 0xFFFFFFC8) == 1;
                        class597.field8076 = var19.method2396(-19) == 1;
                        class353.field4536 = var19.method2393(-30727);
                        class603.field8118 = var19.method2396(-109) == 1;
                        class153.field1948 = var19.method2365(-46);
                        class454.field5922 = var19.method2396(arg0 ^ 0xFFFFFFA6) == 1;
                        if (class57.field769 == 3) {
                            boolean var20 = var19.method2396(119) == 1;
                            if (var20) {
                                long var21 = var19.method2377(-605269408);
                                String var23 = class84.method641(37, var21);
                                int var24 = var19.method2396(arg0 - 201);
                                byte[] var25 = new byte[var24];
                                var19.method2836(0, 0, var25, var24);
                                String var26 = class195.method1284(128, var25);
                                class218 var27 = null;
                                try {
                                    class548 var28 = class688.field9413.method1045("3", (byte) -48, false);
                                    while (var28.field7108 == 0) {
                                        class122.method905(1L, -6145);
                                    }
                                    if (var28.field7108 == 1) {
                                        var27 = (class218) var28.field7113;
                                        int var29 = var23.length() + var26.length() + 14 + 3 + 2;
                                        if (var29 > 60) {
                                            throw new RuntimeException(">60");
                                        }
                                        class418 var30 = new class418(var29 + 1);
                                        var30.method2352(true, var29);
                                        var30.method2352(true, 2);
                                        var30.method2354((byte) 90, var23);
                                        var30.method2354((byte) 108, var26);
                                        var30.method2386(class31.field467, 1103587288);
                                        var30.method2391((byte) 110, class569.field7432);
                                        var30.method2409(-2);
                                        var27.method1393(var30.field5367, var30.field5393, (byte) -46, 0);
                                    }
                                } catch (Exception var40) {
                                }
                                try {
                                    if (var27 != null) {
                                        var27.method1397(true);
                                    }
                                } catch (Exception var38) {
                                }
                                try {
                                    class92.method688(-13381, "demoaccountcreated", class348.field4462);
                                } catch (Throwable var37) {
                                }
                            }
                        }
                        class348.field4436.method1896(class454.field5922, arg0 + 19);
                        class232.field3109.method1299(class454.field5922, 871);
                        class646.field8998.method521(class454.field5922, (byte) -75);
                    } else if (class2.field15.method278(class469.field6132, 5)) {
                        class2.field15.method279(19311, var19.field5393, 0, class469.field6132);
                        var19.field5367 = 0;
                        class54.field741 = var19.method2396(-123);
                        class110.field1435 = var19.method2396(-18);
                        class578.field7883 = var19.method2396(arg0 ^ 0xFFFFFFD5) == 1;
                        class282.field3678 = var19.method2396(117) == 1;
                        class592.field8013 = var19.method2396(-109) == 1;
                        class289.field3727 = var19.method2393(-30727);
                        class603.field8118 = class289.field3727 > 0;
                        class698.field9614 = var19.method2393(arg0 - 30822);
                        class50.field698 = var19.method2393(-30727);
                        class561.field7327 = var19.method2393(-30727);
                        class279.field3651 = var19.method2355(arg0 ^ 0x2D);
                        class100.field1323 = class688.field9413.method1049(class279.field3651, arg0 ^ 0xFFFFBEEE);
                        class577.field7848 = var19.method2396(-110);
                        class435.field5644 = var19.method2393(arg0 ^ 0xFFFF87A6);
                        class218.field2870 = var19.method2393(-30727);
                        class299.field3903 = var19.method2396(arg0 - 114) == 1;
                        class233.field3130.field2492 = class233.field3130.field2473 = var19.method2372(-90);
                        class284.field3690 = var19.method2396(-120);
                        class561.field7328 = var19.method2355(53);
                        class256.field3470 = new class265();
                        class256.field3470.field3554 = var19.method2393(-30727);
                        if (class256.field3470.field3554 == 65535) {
                            class256.field3470.field3554 = -1;
                        }
                        class256.field3470.field3543 = var19.method2372(arg0 - 159);
                        if (class555.field7261 != class119.field1536) {
                            class256.field3470.field3541 = class256.field3470.field3554 + 50000;
                            class256.field3470.field3538 = class256.field3470.field3554 + 40000;
                        }
                        if (class280.field3665 != class119.field1536 && (class423.field5473.method1636(class434.field5592, arg0 + 26) || class423.field5473.method1636(class611.field8255, 15))) {
                            class597.method3246(123);
                        }
                    } else {
                        return;
                    }
                    if ((!class578.field7883 || class592.field8013) && !class603.field8118) {
                        try {
                            class92.method688(-13381, "unzap", class348.field4462);
                        } catch (Throwable var35) {
                        }
                    } else {
                        try {
                            class92.method688(-13381, "zap", class348.field4462);
                        } catch (Throwable var39) {
                            if (class97.field1308) {
                                try {
                                    class348.field4462.getAppletContext().showDocument(new URL(class348.field4462.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var36) {
                                }
                            }
                        }
                    }
                    if (class555.field7261 == class119.field1536) {
                        try {
                            class92.method688(-13381, "loggedin", class348.field4462);
                        } catch (Throwable var34) {
                        }
                    }
                    if (class57.field769 != 2 && class57.field769 != 3) {
                        class60.field816 = 0;
                        class252.method1602(-107, 2);
                        class647.method3560((byte) -116);
                        class442.method2508(7, arg0 ^ 0x5E);
                        class159.field1991 = null;
                        return;
                    }
                    class60.field816 = 12;
                }
                if (arg0 != 95) {
                    method3224((byte) -51);
                }
                if (class60.field816 == 12) {
                    if (!class2.field15.method278(3, 5)) {
                        return;
                    }
                    class2.field15.method279(19311, class230.field3069.field5393, 0, 3);
                    class60.field816 = 13;
                }
                if (class60.field816 == 13) {
                    class534 var31 = class230.field3069;
                    var31.field5367 = 0;
                    if (var31.method2839((byte) 25)) {
                        if (!class2.field15.method278(1, arg0 ^ 0x5A)) {
                            return;
                        }
                        class2.field15.method279(19311, var31.field5393, 3, 1);
                    }
                    class159.field1991 = class468.method2598(false)[var31.method2840(24571)];
                    class88.field1169 = var31.method2393(arg0 ^ 0xFFFF87A6);
                    class60.field816 = 11;
                }
                if (class60.field816 == 11) {
                    if (class2.field15.method278(class88.field1169, 5)) {
                        class2.field15.method279(19311, class230.field3069.field5393, 0, class88.field1169);
                        class230.field3069.field5367 = 0;
                        int var32 = class88.field1169;
                        class60.field816 = 0;
                        class252.method1602(arg0 - 195, 2);
                        class36.method288((byte) 5);
                        class378.method2164(class230.field3069, -91);
                        class677.field9340 = -1;
                        if (class513.field6720 == class159.field1991) {
                            class578.method3166(arg0 ^ 0xFFFFFFC4);
                        } else {
                            class144.method1077(-28630);
                        }
                        if (class230.field3069.field5367 != var32) {
                            throw new RuntimeException("lswp pos:" + class230.field3069.field5367 + " psize:" + var32);
                        }
                        class159.field1991 = null;
                    }
                } else if (class60.field816 == 15) {
                    if (class88.field1169 == -2) {
                        if (!class2.field15.method278(2, arg0 ^ 0x5A)) {
                            return;
                        }
                        class2.field15.method279(19311, class230.field3069.field5393, 0, 2);
                        class230.field3069.field5367 = 0;
                        class88.field1169 = class230.field3069.method2393(-30727);
                    }
                    if (class2.field15.method278(class88.field1169, 5)) {
                        class2.field15.method279(19311, class230.field3069.field5393, 0, class88.field1169);
                        class230.field3069.field5367 = 0;
                        class60.field816 = 0;
                        int var33 = class88.field1169;
                        class252.method1602(-115, 15);
                        class224.method1414(true);
                        class378.method2164(class230.field3069, -98);
                        if (class230.field3069.field5367 != var33) {
                            throw new RuntimeException("lswpr pos:" + class230.field3069.field5367 + " psize:" + var33);
                        }
                        class159.field1991 = null;
                    }
                }
            } else if (class2.field15.method278(1, 5)) {
                class2.field15.method279(19311, class230.field3069.field5393, 0, 1);
                class60.field816 = 10;
                class469.field6132 = class230.field3069.field5393[0] & 0xFF;
            }
        } catch (IOException var41) {
            if (class2.field15 != null) {
                class2.field15.method281(0);
                class2.field15 = null;
            }
            if (class194.field2540 >= 2) {
                class60.field816 = 0;
                class252.method1602(-127, -4);
                class361.method2069(109);
            } else {
                if (class57.field769 == 2 || class57.field769 == 3) {
                    class423.field5473.method1638(128);
                } else {
                    class657.field9166.method1638(arg0 ^ 0xDF);
                }
                class60.field816 = 1;
                class401.field5118 = 0;
                class194.field2540++;
            }
        }
    }
}
