import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 implements Runnable {

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Z")
    public boolean field12 = true;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "Ljava/lang/Object;")
    private Object field19 = new Object();

    @OriginalMember(owner = "client!a", name = "A", descriptor = "[I")
    private int[] field27 = new int[500];

    @OriginalMember(owner = "client!a", name = "z", descriptor = "[I")
    private int[] field26 = new int[500];

    @OriginalMember(owner = "client!a", name = "B", descriptor = "I")
    public int field28 = 0;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "[I")
    public static int[] field6 = new int[50];

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Lmb;")
    public static class84 field7 = class79.method672(true, "invback");

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Lmb;")
    private static class84 field11 = class79.method672(true, "Your account has been disabled)3");

    @OriginalMember(owner = "client!a", name = "n", descriptor = "Lmb;")
    private static class84 field14 = class79.method672(true, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field15 = 0;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Lmb;")
    public static class84 field9 = field11;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "Lmb;")
    public static class84 field21 = class79.method672(true, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Lmb;")
    public static class84 field8 = field14;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "Lmb;")
    public static class84 field24 = class79.method672(true, " )2> @lre@");

    @OriginalMember(owner = "client!a", name = "w", descriptor = "I")
    public static int field23 = 0;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Lge;")
    public static class47 field16;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Lb;")
    public static class8 field3;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "[I")
    public static int[] field10;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static final void method1(int arg0) {
        if (arg0 == 23723) {
            class15.field324 = null;
            class6.field109 = null;
            class54.field1250 = null;
            field22++;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static final void method2(byte arg0) {
        field20++;
        if (!class19.field409) {
            return;
        }
        class57 var1 = class50.method361(class44.field982, class71.field1748, 82);
        int var2 = 80 / ((arg0 + 71) / 46);
        if (var1 != null && var1.field1345 != null) {
            class43.method320(0, null, 0, var1.field1345, true, 0, var1);
        }
        class19.field409 = false;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
    public static void method3(int arg0) {
        field6 = null;
        field10 = null;
        field3 = null;
        field21 = null;
        field16 = null;
        field24 = null;
        field14 = null;
        field11 = null;
        if (arg0 != 207) {
            field23 = -89;
        }
        field7 = null;
        field8 = null;
        field9 = null;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
    public static final void method4(int arg0) {
        field1++;
        if (arg0 >= -86) {
            return;
        }
        while (class87.field2148.method762(class86.field2128, (byte) 99) >= 27) {
            int var1 = class87.field2148.method759(26024, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class69.field1673[var1] == null) {
                class69.field1673[var1] = new class103();
                var2 = true;
            }
            class103 var3 = class69.field1673[var1];
            class87.field2146[class77.field1940++] = var1;
            var3.field3519 = class5.field100;
            int var4 = class87.field2148.method759(26024, 5);
            int var5 = class87.field2148.method759(26024, 1);
            if (var4 > 15) {
                var4 -= 32;
            }
            if (var5 == 1) {
                class125.field3033[class96.field2385++] = var1;
            }
            var3.field2510 = class79.method675(class87.field2148.method759(26024, 13), -70);
            int var6 = class87.field2148.method759(26024, 1);
            int var7 = class5.field71[class87.field2148.method759(26024, 3)];
            if (var2) {
                var3.field3521 = var7;
            }
            int var8 = class87.field2148.method759(26024, 5);
            var3.field3485 = var3.field2510.field3379;
            var3.field3531 = var3.field2510.field3376;
            var3.field3539 = var3.field2510.field3387;
            var3.field3530 = var3.field2510.field3395;
            var3.field3546 = var3.field2510.field3375;
            var3.field3559 = var3.field2510.field3399;
            var3.field3533 = var3.field2510.field3412;
            var3.field3557 = var3.field2510.field3404;
            var3.field3562 = var3.field2510.field3367;
            if (var3.field3533 == 0) {
                var3.field3521 = 0;
            }
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1184(class40.field925.field3489[0] + var8, class40.field925.field3490[0] - -var4, var6 == 1, -25859);
        }
        class87.field2148.method767(7);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IILsd;)Z")
    public static final boolean method5(int arg0, int arg1, class122 arg2) {
        if (arg0 != 96) {
            method4(58);
        }
        field17++;
        byte[] var3 = arg2.method996(arg1, (byte) -87);
        if (var3 == null) {
            return false;
        } else {
            class102.method852(var3, (byte) 101);
            return true;
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
    public static final void method6(int arg0) {
        field25++;
        if (class95.field2363 > 0) {
            class95.field2363--;
        }
        if (class68.field1644 > 1) {
            class68.field1644--;
        }
        if (class60.field1485) {
            class60.field1485 = false;
            class10.method53(true);
            return;
        }
        for (int var1 = 0; var1 < 100 && class120.method974(-1); var1++) {
        }
        if (class145.field3495 != 30 && class145.field3495 != 35) {
            return;
        }
        if (class27.field660 && class145.field3495 == 30) {
            class129.field3109 = 0;
            class37.field831 = 0;
            while (class141.method1148(arg0 - 31)) {
            }
            for (int var2 = 0; var2 < class11.field198.length; var2++) {
                class11.field198[var2] = false;
            }
        }
        class126.method1036(20, class80.field1978, 246);
        Object var3 = class84.field2099.field19;
        synchronized (class84.field2099.field19) {
            if (!class20.field412) {
                class84.field2099.field28 = 0;
            } else if (class37.field831 != 0 || class84.field2099.field28 >= 40) {
                class80.field1978.method769((byte) 119, 239);
                class131.field3128++;
                class80.field1978.method393(0, -17343);
                int var4 = 0;
                int var5 = class80.field1978.field1128;
                for (int var6 = 0; class84.field2099.field28 > var6 && class80.field1978.field1128 - var5 < 240; var6++) {
                    var4++;
                    int var7 = class84.field2099.field26[var6];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var8 = class84.field2099.field27[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    int var9 = var7 * 765 + var8;
                    if (class84.field2099.field26[var6] == -1 && class84.field2099.field27[var6] == -1) {
                        var8 = -1;
                        var9 = 524287;
                        var7 = -1;
                    }
                    if (class14.field277 != var8 || class84.field2109 != var7) {
                        int var10 = var7 - class84.field2109;
                        int var11 = var8 - class14.field277;
                        class14.field277 = var8;
                        class84.field2109 = var7;
                        if (class44.field968 < 8 && var11 >= -32 && var11 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            class80.field1978.method420((class44.field968 << 12) + (var11 << 6) + var10, -868202776);
                            class44.field968 = 0;
                        } else if (class44.field968 < 8) {
                            class80.field1978.method386(-29267, (class44.field968 << 19) + var9 + 8388608);
                            class44.field968 = 0;
                        } else {
                            class80.field1978.method378(2, (class44.field968 << 19) + var9 - 1073741824);
                            class44.field968 = 0;
                        }
                    } else if (class44.field968 < 2047) {
                        class44.field968++;
                    }
                }
                class80.field1978.method405(class80.field1978.field1128 - var5, (byte) 59);
                if (var4 < class84.field2099.field28) {
                    class84.field2099.field28 -= var4;
                    for (int var12 = 0; var12 < class84.field2099.field28; var12++) {
                        class84.field2099.field27[var12] = class84.field2099.field27[var4 + var12];
                        class84.field2099.field26[var12] = class84.field2099.field26[var4 + var12];
                    }
                } else {
                    class84.field2099.field28 = 0;
                }
            }
        }
        if (class37.field831 != 0) {
            class75.field1864++;
            long var13 = (class44.field972 - class15.field319) / 50L;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            class15.field319 = class44.field972;
            int var15 = class47.field1035;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 502) {
                var15 = 502;
            }
            int var16 = (int) var13;
            int var17 = class83.field2034;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 764) {
                var17 = 764;
            }
            int var18 = var15 * 765 + var17;
            byte var19 = 0;
            if (class37.field831 == 2) {
                var19 = 1;
            }
            class80.field1978.method769((byte) 47, 227);
            class80.field1978.method389((var16 << 20) + (var19 << 19) + var18, (byte) 71);
        }
        if (class146.field3566 > 0) {
            class146.field3566--;
        }
        if (class11.field198[96] || class11.field198[97] || class11.field198[98] || class11.field198[99]) {
            class80.field1992 = true;
        }
        if (class80.field1992 && class146.field3566 <= 0) {
            class146.field3566 = 20;
            class80.field1992 = false;
            class123.field2974++;
            class80.field1978.method769((byte) -99, 174);
            class80.field1978.method395((byte) -57, class136.field3300);
            class80.field1978.method364(class123.field2987, (byte) -65);
        }
        if (class106.field2573 && !class68.field1665) {
            class95.field2370++;
            class68.field1665 = true;
            class80.field1978.method769((byte) -100, 207);
            class80.field1978.method393(1, arg0 - 17343);
        }
        if (!class106.field2573 && class68.field1665) {
            class95.field2370++;
            class68.field1665 = false;
            class80.field1978.method769((byte) -128, 207);
            class80.field1978.method393(0, -17343);
        }
        class27.method197(0);
        if (class145.field3495 != 30 && class145.field3495 != 35) {
            return;
        }
        class126.method1034((byte) -126);
        class123.method1017(80);
        class74.field1829++;
        if (class74.field1829 > 750) {
            class10.method53(true);
            return;
        }
        class13.method83(-1);
        class16.method110(true);
        class17.method119((byte) 102);
        if (class84.field2100 != 0) {
            class36.field781 += 20;
            if (class36.field781 >= 400) {
                class84.field2100 = 0;
            }
        }
        if (class37.field829 != 0) {
            class95.field2347++;
            if (class95.field2347 >= 15) {
                if (class37.field829 == 2) {
                    class89.field2220 = true;
                }
                if (class37.field829 == 3) {
                    class65.field1615 = true;
                }
                class37.field829 = 0;
            }
        }
        class108.field2613++;
        if (class115.field2745 != arg0) {
            if (class20.field427 > class120.field2869 + 5 || class120.field2869 - 5 > class20.field427 || class60.field1498 > class143.field3431 + 5 || class143.field3431 - 5 > class60.field1498) {
                class49.field1049 = true;
            }
            class120.field2896++;
            if (class129.field3109 == 0) {
                if (class115.field2745 == 2) {
                    class89.field2220 = true;
                }
                if (class115.field2745 == 3) {
                    class65.field1615 = true;
                }
                class115.field2745 = 0;
                if (class49.field1049 && class120.field2896 >= 5) {
                    class124.field3003 = -1;
                    class49.method351(arg0 ^ 0x69);
                    if (class64.field1576 == class124.field3003 && class87.field2174 != class102.field2480) {
                        class136.field3301++;
                        class57 var20 = class97.method805(arg0 - 894550512, class64.field1576);
                        byte var21 = 0;
                        if (class69.field1684 == 1 && var20.field1382 == 206) {
                            var21 = 1;
                        }
                        if (var20.field1349[class102.field2480] <= 0) {
                            var21 = 0;
                        }
                        if (class91.method779(class91.method780(-150310624, var20), 28522)) {
                            int var24 = class87.field2174;
                            int var25 = class102.field2480;
                            var20.field1349[var25] = var20.field1349[var24];
                            var20.field1394[var25] = var20.field1394[var24];
                            var20.field1349[var24] = -1;
                            var20.field1394[var24] = 0;
                        } else if (var21 == 1) {
                            int var22 = class102.field2480;
                            int var23 = class87.field2174;
                            while (var22 != var23) {
                                if (var23 > var22) {
                                    var20.method506(var23, -2, var23 - 1);
                                    var23--;
                                } else if (var23 < var22) {
                                    var20.method506(var23, arg0 - 2, var23 + 1);
                                    var23++;
                                }
                            }
                        } else {
                            var20.method506(class87.field2174, arg0 ^ 0xFFFFFFFE, class102.field2480);
                        }
                        class80.field1978.method769((byte) 21, 187);
                        class80.field1978.method363(class64.field1576, 98);
                        class80.field1978.method364(class87.field2174, (byte) -46);
                        class80.field1978.method385(var21, -14855);
                        class80.field1978.method397(true, class102.field2480);
                    }
                } else if ((class92.field2293 == 1 || class8.method42(-19047, class20.field429 - 1)) && class20.field429 > 2) {
                    class117.method954(96);
                } else if (class20.field429 > 0) {
                    class44.method322(class20.field429 - 1, true);
                }
                class37.field831 = 0;
                class95.field2347 = 10;
            }
        }
        byte var26 = 34;
        if (class122.field2948 == -1) {
            if (class79.field1958 != -1) {
                class11.method67(4, 338, true, class79.field1958, 516, var26, 4);
            } else if (client.field493 != -1) {
                class11.method67(4, 338, true, client.field493, 516, var26, 4);
            }
            if (class89.field2233 != -1) {
                class11.method67(205, 466, true, class89.field2233, 743, var26, 553);
            } else if (class72.field1777[class68.field1654] != -1) {
                class11.method67(205, 466, true, class72.field1777[class68.field1654], 743, var26, 553);
            }
            if (class83.field2038 != -1) {
                class11.method67(357, 453, true, class83.field2038, 496, var26, 17);
            } else if (class120.field2880 != -1) {
                class11.method67(357, 453, true, class120.field2880, 496, var26, 17);
            }
        } else {
            class11.method67(0, 503, true, class122.field2948, 765, var26, 0);
            if (class50.field1070 != -1) {
                class11.method67(0, 503, true, class50.field1070, 765, var26, 0);
            }
        }
        if (class122.field2948 == -1) {
            if (class79.field1958 != -1) {
                class11.method67(4, 338, true, class79.field1958, 516, ~var26, 4);
            } else if (client.field493 != -1) {
                class11.method67(4, 338, true, client.field493, 516, ~var26, 4);
            }
            if (class89.field2233 != -1) {
                class11.method67(205, 466, true, class89.field2233, 743, ~var26, 553);
            } else if (class72.field1777[class68.field1654] != -1) {
                class11.method67(205, 466, true, class72.field1777[class68.field1654], 743, ~var26, 553);
            }
            if (class83.field2038 != -1) {
                class11.method67(357, 453, true, class83.field2038, 496, ~var26, 17);
            } else if (class120.field2880 != -1) {
                class11.method67(357, 453, true, class120.field2880, 496, ~var26, 17);
            }
        } else {
            class11.method67(0, 503, true, class122.field2948, 765, ~var26, 0);
            if (class50.field1070 != -1) {
                class11.method67(0, 503, true, class50.field1070, 765, ~var26, 0);
            }
        }
        class79.method677((byte) -114);
        if (class56.field1288 != -1) {
            int var27 = class56.field1291;
            int var28 = class56.field1288;
            boolean var29 = class16.method112(class40.field925.field3490[0], 0, class40.field925.field3489[0], 0, 0, var28, arg0 + 32689, 0, 0, 0, var27, true);
            if (var29) {
                class106.field2567 = class47.field1035;
                class6.field113 = class83.field2034;
                class84.field2100 = 1;
                class36.field781 = 0;
            }
            class56.field1288 = -1;
        }
        if (class37.field831 == 1 && class68.field1658 != null) {
            class65.field1615 = true;
            class68.field1658 = null;
            class37.field831 = 0;
        }
        class117.method951(1);
        if (class122.field2948 == -1) {
            class75.method650(true);
            class105.method878(arg0 ^ 0x7);
            class22.method151(0);
        }
        if (class129.field3109 == 1 || class37.field831 == 1) {
            class129.field3123++;
        }
        if (class134.field3206 == -1 && class41.field940 == -1 && class36.field798 == -1) {
            if (class72.field1773 > 0) {
                class72.field1773--;
            }
        } else if (class68.field1660 > class72.field1773) {
            class72.field1773++;
            if (class72.field1773 == class68.field1660) {
                if (class134.field3206 != -1) {
                    class65.field1615 = true;
                }
                if (class41.field940 != -1) {
                    class89.field2220 = true;
                }
            }
        }
        class131.method1061(true);
        if (class138.field3330) {
            class127.method1040(1000);
        }
        for (int var30 = 0; var30 < 5; var30++) {
            int var10002 = class119.field2846[var30]++;
        }
        class10.method54(-28584);
        int var31 = class122.method1005(0);
        int var32 = class59.method516(true);
        if (var31 > 4500 && var32 > 4500) {
            class120.field2874++;
            class95.field2363 = 250;
            class30.method225(-98, 4000);
            class80.field1978.method769((byte) -94, 144);
        }
        class62.field1549++;
        class95.field2369++;
        class128.field3075++;
        if (class128.field3075 > 500) {
            class128.field3075 = 0;
            int var33 = (int) (Math.random() * 8.0D);
            if ((var33 & 0x1) == 1) {
                class109.field2630 += class16.field364;
            }
            if ((var33 & 0x2) == 2) {
                class131.field3147 += class123.field2980;
            }
            if ((var33 & 0x4) == 4) {
                class93.field2316 += class70.field1730;
            }
        }
        if (class93.field2316 < -40) {
            class70.field1730 = 1;
        }
        if (class93.field2316 > 40) {
            class70.field1730 = -1;
        }
        if (class131.field3147 < -55) {
            class123.field2980 = 2;
        }
        if (class109.field2630 < -50) {
            class16.field364 = 2;
        }
        if (class109.field2630 > 50) {
            class16.field364 = -2;
        }
        if (class62.field1549 > 500) {
            class62.field1549 = 0;
            int var34 = (int) (Math.random() * 8.0D);
            if ((var34 & 0x1) == 1) {
                class120.field2892 += class87.field2181;
            }
            if ((var34 & 0x2) == 2) {
                class6.field106 += class80.field1993;
            }
        }
        if (class120.field2892 < -60) {
            class87.field2181 = 2;
        }
        if (class6.field106 < -20) {
            class80.field1993 = 1;
        }
        if (class131.field3147 > 55) {
            class123.field2980 = -2;
        }
        if (class120.field2892 > 60) {
            class87.field2181 = -2;
        }
        if (class6.field106 > 10) {
            class80.field1993 = -1;
        }
        if (class95.field2369 > 50) {
            class84.field2084++;
            class80.field1978.method769((byte) -105, 229);
        }
        try {
            if (class125.field3030 != null && class80.field1978.field1128 > 0) {
                class125.field3030.method45(0, class80.field1978.field1128, (byte) 87, class80.field1978.field1084);
                class95.field2369 = 0;
                class80.field1978.field1128 = 0;
            }
        } catch (IOException var35) {
            class10.method53(true);
        }
    }

    @OriginalMember(owner = "client!a", name = "run", descriptor = "()V")
    public final void run() {
        field5++;
        while (this.field12) {
            Object var1 = this.field19;
            synchronized (this.field19) {
                if (this.field28 < 500) {
                    this.field27[this.field28] = class20.field427;
                    this.field26[this.field28] = class60.field1498;
                    this.field28++;
                }
            }
            class22.method149(-127, 50L);
        }
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
    public static final void method7(int arg0) {
        field13++;
        try {
            Graphics var1 = class92.field2296.getGraphics();
            class120.field2889.method122(var1, 0, 4, arg0 - 4095);
            class108.field2618.method122(var1, 0, 357, 0);
            if (arg0 != 4095) {
                method8(true, -112);
            }
            class20.field415.method122(var1, 722, 4, 0);
            class84.field2080.method122(var1, 743, 205, arg0 - 4095);
            class136.field3298.method122(var1, 0, 0, 0);
            class65.field1614.method122(var1, 516, 4, 0);
            class108.field2615.method122(var1, 516, 205, arg0 - 4095);
            class133.field3160.method122(var1, 496, 357, arg0 - 4095);
            class51.field1137.method122(var1, 0, 338, 0);
        } catch (Exception var2) {
            class92.field2296.repaint();
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)Z")
    public static final boolean method8(boolean arg0, int arg1) {
        field18++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            if (!arg0) {
                method4(121);
            }
            return arg1 >= 48 && arg1 <= 57;
        }
    }
}
