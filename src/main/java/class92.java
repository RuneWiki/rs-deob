import java.awt.Frame;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class92 extends class96 {

    @OriginalMember(owner = "client!km", name = "k", descriptor = "Z")
    public static boolean field1463 = false;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "[I")
    public static int[] field1466 = new int[5];

    @OriginalMember(owner = "client!km", name = "h", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1460 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "Ljava/awt/Frame;")
    public static Frame field1464;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "[[[B")
    public static byte[][][] field1468;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III)V", line = 6)
    public static final void method656(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class273.field4226; var3++) {
            for (int var4 = 0; var4 < class50.field817; var4++) {
                for (int var5 = 0; var5 < class267.field4171; var5++) {
                    class142 var6 = class256.field4013[var3][var4][var5];
                    if (var6 != null) {
                        class103 var7 = var6.field2213;
                        if (var7 != null && var7.field1598.method162()) {
                            class108.method794(var7.field1598, var3, var4, var5, 1, 1);
                            if (var7.field1600 != null && var7.field1600.method162()) {
                                class108.method794(var7.field1600, var3, var4, var5, 1, 1);
                                var7.field1598.method184(var7.field1600, 0, 0, 0, false);
                                var7.field1600 = var7.field1600.method200(arg0, arg1, arg2);
                            }
                            var7.field1598 = var7.field1598.method200(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2204; var8++) {
                            class26 var9 = var6.field2197[var8];
                            if (var9 != null && var9.field406.method162()) {
                                class108.method794(var9.field406, var3, var4, var5, var9.field405 + 1 - var9.field411, var9.field396 - var9.field410 + 1);
                                var9.field406 = var9.field406.method200(arg0, arg1, arg2);
                            }
                        }
                        class279 var10 = var6.field2196;
                        if (var10 != null && var10.field4297.method162()) {
                            class313.method2124(var10.field4297, var3, var4, var5);
                            var10.field4297 = var10.field4297.method200(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLjava/lang/String;)V", line = 77)
    public static final void method657(byte arg0, String arg1) {
        if (arg0 != -4) {
            method659((byte) 111, 18, 69);
        }
        field1461++;
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(IIIIIII)V", line = 94)
    public static final void method658(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1465++;
        class73.field1206 = 0;
        if (arg0 != -125) {
            return;
        }
        for (int var7 = -1; var7 < (class312.field4839 + class310.field4816); var7++) {
            class123 var8;
            if (var7 == -1) {
                var8 = class98.field1566;
            } else if (var7 >= class310.field4816) {
                var8 = class254.field3989[class325.field5049[var7 - class310.field4816]];
            } else {
                var8 = class254.field3992[class103.field1606[var7]];
            }
            if (var8 != null && var8.method278(-5324)) {
                if (var8 instanceof class313) {
                    class206 var9 = ((class313) var8).field4859;
                    if (var9.field3120 != null) {
                        var9 = var9.method1465(126);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (var7 >= class310.field4816) {
                    class206 var10 = ((class313) var8).field4859;
                    if (var10.field3120 != null) {
                        var10 = var10.method1465(124);
                    }
                    if (var10.field3141 >= 0 && var10.field3141 < class337.field5276.length) {
                        int var11;
                        if (var10.field3110 == -1) {
                            var11 = var8.method895(127) + 15;
                        } else {
                            var11 = var10.field3110 + 15;
                        }
                        class227.method1601(arg1, arg5, arg2 >> 1, arg3 >> 1, (byte) 21, var8, var11);
                        if (class240.field3829 > -1) {
                            class337.field5276[var10.field3141].method617(class240.field3829 + arg4 - 12, arg6 - 30 + class336.field5267);
                        }
                    }
                    class235[] var12 = class75.field1216;
                    for (int var13 = 0; var13 < var12.length; var13++) {
                        class235 var14 = var12[var13];
                        if (var14 != null && var14.field3761 == 1 && class325.field5049[var7 - class310.field4816] == var14.field3757 && (class227.field3618 % 20) < 10) {
                            int var15;
                            if (var10.field3110 == -1) {
                                var15 = var8.method895(arg0 ^ 0xFFFFFFFD) + 15;
                            } else {
                                var15 = var10.field3110 + 15;
                            }
                            class227.method1601(arg1, arg5, arg2 >> 1, arg3 >> 1, (byte) 21, var8, var15);
                            if (class240.field3829 > -1) {
                                class314.field4876[var14.field3752].method617(arg4 + class240.field3829 - 12, class336.field5267 + arg6 + -28);
                            }
                        }
                    }
                } else {
                    class33 var16 = (class33) var8;
                    int var17 = 30;
                    if (var16.field478 != -1 || var16.field479 != -1) {
                        class227.method1601(arg1, arg5, arg2 >> 1, arg3 >> 1, (byte) 21, var8, var8.method895(-109) + 15);
                        if (class240.field3829 > -1) {
                            if (var16.field478 != -1) {
                                class7.field93[var16.field478].method617(arg4 + class240.field3829 - 12, class336.field5267 + arg6 + -var17);
                                var17 += 25;
                            }
                            if (var16.field479 != -1) {
                                class337.field5276[var16.field479].method617(class240.field3829 + arg4 - 12, arg6 - var17 + class336.field5267);
                                var17 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class235[] var18 = class75.field1216;
                        for (int var19 = 0; var19 < var18.length; var19++) {
                            class235 var20 = var18[var19];
                            if (var20 != null && var20.field3761 == 10 && class103.field1606[var7] == var20.field3757) {
                                class227.method1601(arg1, arg5, arg2 >> 1, arg3 >> 1, (byte) 21, var8, var8.method895(arg0 + 34) + 15);
                                if (class240.field3829 > -1) {
                                    class314.field4876[var20.field3752].method617(class240.field3829 + arg4 - 12, -var17 + class336.field5267 + arg6);
                                }
                            }
                        }
                    }
                }
                if (var8.field1945 != null && (class310.field4816 <= var7 || class96.field1533 == 0 || class96.field1533 == 3 || class96.field1533 == 1 && class163.method1111(((class33) var8).field477, false))) {
                    class227.method1601(arg1, arg5, arg2 >> 1, arg3 >> 1, (byte) 21, var8, var8.method895(arg0 + 251));
                    if (class240.field3829 > -1 && class73.field1206 < class175.field2661) {
                        class175.field2655[class73.field1206] = class344.field5343.method2228(var8.field1945) / 2;
                        class175.field2643[class73.field1206] = class344.field5343.field5102;
                        class175.field2660[class73.field1206] = class240.field3829;
                        class175.field2651[class73.field1206] = class336.field5267;
                        class175.field2645[class73.field1206] = var8.field1920;
                        class175.field2652[class73.field1206] = var8.field1861;
                        class175.field2657[class73.field1206] = var8.field1916;
                        class175.field2648[class73.field1206] = var8.field1945;
                        class73.field1206++;
                    }
                }
                if (class227.field3618 < var8.field1902) {
                    class270 var21 = class200.field3002[0];
                    class270 var22 = class200.field3002[1];
                    int var26;
                    if (var8 instanceof class313) {
                        class313 var23 = (class313) var8;
                        class270[] var24 = (class270[]) ((class270[]) class278.field4288.method2179(false, (long) var23.field4859.field3153));
                        if (var24 == null) {
                            var24 = class337.method2339(-32, class186.field2788, var23.field4859.field3153, 0);
                            if (var24 != null) {
                                class278.field4288.method2173(var24, true, (long) var23.field4859.field3153);
                            }
                        }
                        if (var24 != null && var24.length == 2) {
                            var21 = var24[0];
                            var22 = var24[1];
                        }
                        class206 var25 = var23.field4859;
                        if (var25.field3110 == -1) {
                            var26 = var8.method895(127);
                        } else {
                            var26 = var25.field3110;
                        }
                    } else {
                        var26 = var8.method895(127);
                    }
                    class227.method1601(arg1, arg5, arg2 >> 1, arg3 >> 1, (byte) 21, var8, var26 + var21.field4207 + 10);
                    if (class240.field3829 > -1) {
                        int var27 = class240.field3829 + arg4 - (var21.field4202 >> 1);
                        int var28 = class336.field5267 + arg6 - 3;
                        var21.method617(var27, var28);
                        int var29 = var8.field1859 * var21.field4202 / 255;
                        int var30 = var21.field4207;
                        if (class94.field1516) {
                            class167.method1194(var27, var28, var27 + var29, var28 + var30);
                        } else {
                            class109.method815(var27, var28, var27 + var29, var28 - -var30);
                        }
                        var22.method617(var27, var28);
                        if (class94.field1516) {
                            class167.method1187(arg4, arg6, arg2 + arg4, arg3 + arg6);
                        } else {
                            class109.method806(arg4, arg6, arg4 + arg2, arg6 - -arg3);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (class227.field3618 < var8.field1933[var31]) {
                        int var32;
                        if ((var8 instanceof class313)) {
                            class313 var33 = (class313) var8;
                            class206 var34 = var33.field4859;
                            if (var34.field3110 == -1) {
                                var32 = var8.method895(0) / 2;
                            } else {
                                var32 = var34.field3110 / 2;
                            }
                        } else {
                            var32 = var8.method895(6) / 2;
                        }
                        class227.method1601(arg1, arg5, arg2 >> 1, arg3 >> 1, (byte) 21, var8, var32);
                        if (class240.field3829 > -1) {
                            if (var31 == 1) {
                                class336.field5267 -= 20;
                            }
                            if (var31 == 2) {
                                class336.field5267 -= 10;
                                class240.field3829 -= 15;
                            }
                            if (var31 == 3) {
                                class336.field5267 -= 10;
                                class240.field3829 += 15;
                            }
                            class244.field3907[var8.field1890[var31]].method617(class240.field3829 + arg4 - 12, class336.field5267 + -12 + arg6);
                            class112.field1736.method2237(Integer.toString(var8.field1888[var31]), class240.field3829 + arg4 - 1, class336.field5267 + 3 + arg6, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var35 = 0; var35 < class73.field1206; var35++) {
            int var36 = class175.field2660[var35];
            int var37 = class175.field2655[var35];
            int var38 = class175.field2651[var35];
            int var39 = class175.field2643[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if ((var38 + 2) > (class175.field2651[var41] - class175.field2643[var41]) && (var38 - var39) < (class175.field2651[var41] + 2) && class175.field2660[var41] + class175.field2655[var41] > -var37 + var36 && (class175.field2660[var41] - class175.field2655[var41]) < (var36 + var37) && (class175.field2651[var41] - class175.field2643[var41]) < var38) {
                        var40 = true;
                        var38 = class175.field2651[var41] - class175.field2643[var41];
                    }
                }
            }
            class240.field3829 = class175.field2660[var35];
            class336.field5267 = class175.field2651[var35] = var38;
            String var42 = class175.field2648[var35];
            if (class175.field2658 == 0) {
                int var43 = 16776960;
                if (class175.field2645[var35] < 6) {
                    var43 = class233.field3692[class175.field2645[var35]];
                }
                if (class175.field2645[var35] == 6) {
                    var43 = (class294.field4556 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class175.field2645[var35] == 7) {
                    var43 = (class294.field4556 % 20) < 10 ? 255 : 65535;
                }
                if (class175.field2645[var35] == 8) {
                    var43 = class294.field4556 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class175.field2645[var35] == 9) {
                    int var44 = 150 - class175.field2657[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16384000 + 16776960 - (var44 * 327680);
                    } else if (var44 < 150) {
                        var43 = var44 * 5 + 65280 - 500;
                    }
                }
                if (class175.field2645[var35] == 10) {
                    int var45 = 150 - class175.field2657[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 33095935 - (var45 * 327680);
                    } else if (var45 < 150) {
                        var43 = (var45 - 100) * 327680 + 255 - ((var45 + -100) * 5);
                    }
                }
                if (class175.field2645[var35] == 11) {
                    int var46 = 150 - class175.field2657[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = (var46 - 50) * 327685 + 65280;
                    } else if (var46 < 150) {
                        var43 = 16777215 - ((var46 - 100) * 327680);
                    }
                }
                if (class175.field2652[var35] == 0) {
                    class344.field5343.method2237(var42, arg4 + class240.field3829, arg6 - -class336.field5267, var43, 0);
                }
                if (class175.field2652[var35] == 1) {
                    class344.field5343.method2236(var42, class240.field3829 + arg4, arg6 - -class336.field5267, var43, 0, class294.field4556);
                }
                if (class175.field2652[var35] == 2) {
                    class344.field5343.method2243(var42, arg4 + class240.field3829, class336.field5267 + arg6, var43, 0, class294.field4556);
                }
                if (class175.field2652[var35] == 3) {
                    class344.field5343.method2249(var42, class240.field3829 + arg4, arg6 - -class336.field5267, var43, 0, class294.field4556, 150 - class175.field2657[var35]);
                }
                if (class175.field2652[var35] == 4) {
                    int var47 = (150 - class175.field2657[var35]) * (class344.field5343.method2228(var42) + 100) / 150;
                    if (class94.field1516) {
                        class167.method1194(arg4 + class240.field3829 - 50, arg6, class240.field3829 + arg4 + 50, arg6 - -arg3);
                    } else {
                        class109.method815(arg4 + class240.field3829 - 50, arg6, class240.field3829 + arg4 + 50, arg3 + arg6);
                    }
                    class344.field5343.method2245(var42, arg4 + class240.field3829 + 50 - var47, class336.field5267 + arg6, var43, 0);
                    if (class94.field1516) {
                        class167.method1187(arg4, arg6, arg2 + arg4, arg3 + arg6);
                    } else {
                        class109.method806(arg4, arg6, arg2 + arg4, arg3 + arg6);
                    }
                }
                if (class175.field2652[var35] == 5) {
                    int var48 = 0;
                    int var49 = 150 - class175.field2657[var35];
                    if (class94.field1516) {
                        class167.method1194(arg4, class336.field5267 + arg6 - class344.field5343.field5102 - 1, arg2 + arg4, class336.field5267 + arg6 + 5);
                    } else {
                        class109.method815(arg4, arg6 - (-class336.field5267 - -class344.field5343.field5102) - 1, arg2 + arg4, arg6 + class336.field5267 + 5);
                    }
                    if (var49 < 25) {
                        var48 = var49 - 25;
                    } else if (var49 > 125) {
                        var48 = var49 - 125;
                    }
                    class344.field5343.method2237(var42, class240.field3829 + arg4, class336.field5267 + arg6 - -var48, var43, 0);
                    if (class94.field1516) {
                        class167.method1187(arg4, arg6, arg2 + arg4, arg3 + arg6);
                    } else {
                        class109.method806(arg4, arg6, arg2 + arg4, arg6 - -arg3);
                    }
                }
            } else {
                class344.field5343.method2237(var42, class240.field3829 + arg4, class336.field5267 + arg6, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BII)V", line = 577)
    public static final void method659(byte arg0, int arg1, int arg2) {
        if (arg0 >= -1) {
            field1464 = (Frame) null;
        }
        if (class106.field1639 > 0) {
            class219.method1546(-11798, class106.field1639);
            class106.field1639 = 0;
        }
        field1470++;
        short var3 = 256;
        int var4 = 0;
        int var5 = class109.field1709 * arg2;
        int var6 = 0;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class88.field1417[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class273.field4232[var4++];
                int var11 = class109.field1704[var5++ + arg1];
                if (var10 == 0) {
                    class338.field5287.field3942[var6++] = var11;
                } else {
                    int var12 = var10 + 18;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = -(var10 - 256) - 18;
                    int var14 = class205.field3085[var10];
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    class338.field5287.field3942[var6++] = class270.method1860(var13 * class270.method1860(var11, 65280) + var12 * class270.method1860(var14, 65280), 16711680) + class270.method1860(var12 * class270.method1860(var14, 16711935) + var13 * class270.method1860(16711935, var11), -16711936) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class338.field5287.field3942[var6++] = class109.field1704[arg1 + (var5++)];
            }
            var5 += class109.field1709 - 128;
        }
        if (class94.field1516) {
            class167.method1192(class338.field5287.field3942, arg1, arg2, class338.field5287.field4202, class338.field5287.field4207);
        } else {
            class338.field5287.method625(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V", line = 661)
    public static final void method660(int arg0) {
        field1469++;
        class77.method568();
        int var1 = -82 % ((arg0 + 41) / 40);
        for (int var2 = 0; var2 < 4; var2++) {
            class224.field3570[var2].method2068((byte) -50);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ll;Ll;BLl;Loj;)Z", line = 680)
    public static final boolean method661(class133 arg0, class133 arg1, byte arg2, class133 arg3, class284 arg4) {
        int var5 = 1 % ((arg2 + 30) / 62);
        class288.field4494 = arg1;
        class139.field2168 = arg3;
        class160.field2416 = arg4;
        field1467++;
        class175.field2647 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V", line = 703)
    public static void method662(byte arg0) {
        field1468 = (byte[][][]) null;
        field1464 = null;
        if (arg0 != -21) {
            field1460 = (Calendar) null;
        }
        field1460 = null;
        field1466 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I[B)V", line = 719)
    public static final void method663(int arg0, byte[] arg1) {
        class166 var2 = new class166(arg1);
        var2.field2532 = arg1.length - 2;
        field1462++;
        class290.field4519 = var2.method1151(-83);
        class320.field5001 = new int[class290.field4519];
        class75.field1215 = new int[class290.field4519];
        class97.field1546 = new int[class290.field4519];
        class270.field4200 = new boolean[class290.field4519];
        class306.field4757 = new byte[class290.field4519][];
        class292.field4537 = new byte[class290.field4519][];
        class73.field1201 = new int[class290.field4519];
        var2.field2532 = arg1.length - class290.field4519 * 8 - 7;
        class65.field1019 = var2.method1151(-122);
        class228.field3627 = var2.method1151(-110);
        int var3 = (var2.method1178(0) & 0xFF) + 1;
        for (int var4 = 0; var4 < class290.field4519; var4++) {
            class97.field1546[var4] = var2.method1151(-58);
        }
        int var5 = 0;
        if (arg0 != 2346) {
            field1466 = (int[]) null;
        }
        while (var5 < class290.field4519) {
            class320.field5001[var5] = var2.method1151(class81.method583(arg0, -2387));
            var5++;
        }
        for (int var6 = 0; var6 < class290.field4519; var6++) {
            class75.field1215[var6] = var2.method1151(-119);
        }
        for (int var7 = 0; var7 < class290.field4519; var7++) {
            class73.field1201[var7] = var2.method1151(-56);
        }
        var2.field2532 = arg1.length - (var3 - 1) * 3 - (class290.field4519 * 8) - 7;
        class63.field1002 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class63.field1002[var8] = var2.method1156((byte) 97);
            if (class63.field1002[var8] == 0) {
                class63.field1002[var8] = 1;
            }
        }
        var2.field2532 = 0;
        for (int var9 = 0; var9 < class290.field4519; var9++) {
            int var10 = class73.field1201[var9];
            int var11 = class75.field1215[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class306.field4757[var9] = var13;
            class292.field4537[var9] = var14;
            boolean var15 = false;
            int var16 = var2.method1178(arg0 ^ 0x92A);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var13[var22] = var2.method1143(-110);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var14[var23] = var2.method1143(126);
                        var15 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label91: while (true) {
                    if (var17 >= var11) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var19 >= var11) {
                                break label91;
                            }
                            for (int var20 = 0; var20 < var10; var20++) {
                                byte var21 = var14[var11 * var20 + var19] = var2.method1143(class81.method583(arg0, 2425));
                                var15 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var10; var18++) {
                        var13[var11 * var18 + var17] = var2.method1143(arg0 - 2274);
                    }
                    var17++;
                }
            }
            class270.field4200[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lin;B)V", line = 892)
    public static final void method664(class168 arg0, byte arg1) {
        if (arg1 != -15) {
            method662((byte) -11);
        }
        short var2 = 256;
        field1471++;
        for (int var3 = 0; var3 < class52.field885.length; var3++) {
            class52.field885[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) (Math.random() * 128.0D * (double) var2);
            class52.field885[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < var2 - 1; var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class163.field2449[var9] = (class52.field885[var9 - 1] + class52.field885[var9 - -1] - (-class52.field885[var9 - 128] - class52.field885[var9 + 128])) / 4;
                }
            }
            int[] var10 = class52.field885;
            class52.field885 = class163.field2449;
            class163.field2449 = var10;
        }
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0.field3980; var12++) {
            for (int var13 = 0; var13 < arg0.field3972; var13++) {
                if (arg0.field2555[var11++] != 0) {
                    int var14 = var13 + arg0.field3981 + 16;
                    int var15 = var12 + arg0.field3973 + 16;
                    int var16 = var14 + (var15 << 7);
                    class52.field885[var16] = 0;
                }
            }
        }
    }
}
