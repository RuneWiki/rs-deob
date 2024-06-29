import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class64 extends OutputStream {

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "Leb;")
    public static class584 field979 = new class584();

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "Ldb;")
    public static class298 field982 = new class298(114, 10);

    @OriginalMember(owner = "client!sga", name = "g", descriptor = "[I")
    public static int[] field985 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!sga", name = "f", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)I")
    public static final int method511(int arg0) {
        field980++;
        if (!class344.field4718.field5452) {
            for (int var1 = 0; var1 < class404.field5409; var1++) {
                if (class107.field1576[var1].method1805(18449) == 's' || class107.field1576[var1].method1805(18449) == 'S') {
                    class344.field4718.field5452 = true;
                    break;
                }
            }
        }
        if (class555.field7359 == class171.field2633) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class681.method3802(-23600);
            if (class706.field9917 == 0L) {
                class706.field9917 = var4;
            }
            if (var3 > 16384 && var4 - class706.field9917 < 5000L) {
                if (var4 - class268.field3742 > 1000L) {
                    System.gc();
                    class268.field3742 = var4;
                }
                return 0;
            }
        }
        if (class555.field7361 == class171.field2633) {
            if (class318.field4365 == null) {
                class318.field4365 = new class246(class315.field4343, class277.field3872, class232.field3250, class234.field3304);
            }
            if (!class318.field4365.method1513(false)) {
                return 0;
            }
            class442.method2499(0, -123, null);
            class442.field6057 = !class169.method1152(0);
            class394.field5203 = class266.method1624(false, class442.field6057 ? 34 : 32, (byte) -15, 1);
            class3.field32 = class266.method1624(false, 33, (byte) -15, 1);
            class68.field1035 = class266.method1624(false, 13, (byte) -15, 1);
        }
        if (class555.field7366 == class171.field2633) {
            class3.field32.method2533((byte) -123);
            int var6 = class47.field677[33].method184(100);
            int var7 = var6 + class47.field677[class442.field6057 ? 34 : 32].method184(100);
            int var8 = var7 + class47.field677[13].method184(100);
            int var9 = var8 + class3.field32.method2526(arg0 ^ 0xFFFFFFFE);
            if (var9 != 400) {
                return var9 / 4;
            }
            class529.field7056 = class394.field5203.method2555(1);
            class166.field2584 = class3.field32.method2555(1);
            class37.method292(16, class394.field5203);
            int var10 = class344.field4718.field5438;
            class187.field2785 = new class541(class392.field5166, class516.field6892, class3.field32);
            int[] var11 = class187.field2785.method2988((byte) -67, var10);
            class273 var12 = new class273(class394.field5203, class68.field1035);
            if (var11.length > 0) {
                class23.field388 = new class299[var11.length];
                for (int var13 = 0; var13 < class23.field388.length; var13++) {
                    class23.field388[var13] = new class410(class187.field2785.method2989(var11[var13], -127), var12);
                }
            }
        }
        if (class555.field7368 == class171.field2633) {
            class375.method2210(class394.field5203, class68.field1035, -117, class548.method3048((byte) -97));
        }
        if (arg0 != 1) {
            field982 = null;
        }
        if (class555.field7369 == class171.field2633) {
            int var14 = class665.method3732((byte) 1);
            int var15 = class157.method1096((byte) 95);
            if (var15 > var14) {
                return var14 * 100 / var15;
            }
        }
        if (class555.field7370 == class171.field2633) {
            if (class23.field388 != null && class23.field388.length > 0) {
                if (class23.field388[0].method1826(2265) < 100) {
                    return 0;
                }
                if (class23.field388.length > 1 && class187.field2785.method2990((byte) 109) && class23.field388[1].method1826(2265) < 100) {
                    return 0;
                }
            }
            class395.method2263(-22082, class10.field197);
            class26.method227(false, class10.field197);
            class472.method2658(arg0 + 19092, 1);
        }
        if (class555.field7371 == class171.field2633) {
            for (int var16 = 0; var16 < 4; var16++) {
                class591.field7820[var16] = class209.method1342(-94, class34.field530, class34.field531);
            }
        }
        if (class555.field7372 == class171.field2633) {
            class658.field9155 = class266.method1624(false, 8, (byte) -15, 1);
            class406.field5469 = class266.method1624(false, 0, (byte) -15, 1);
            class613.field8103 = class266.method1624(false, 1, (byte) -15, 1);
            class525.field6997 = class266.method1624(false, 2, (byte) -15, 1);
            class225.field3176 = class266.method1624(false, 3, (byte) -15, 1);
            class590.field7808 = class266.method1624(false, 4, (byte) -15, 1);
            class243.field3403 = class266.method1624(true, 5, (byte) -15, 1);
            class603.field8016 = class266.method1624(true, 6, (byte) -15, 1);
            class16.field254 = class266.method1624(false, 7, (byte) -15, 1);
            class364.field4943 = class266.method1624(false, 9, (byte) -15, 1);
            class700.field9849 = class266.method1624(false, 10, (byte) -15, 1);
            class232.field3242 = class266.method1624(false, 11, (byte) -15, 1);
            class666.field9455 = class266.method1624(false, 12, (byte) -15, 1);
            class407.field5491 = class266.method1624(false, 14, (byte) -15, 1);
            class576.field7609 = class266.method1624(false, 15, (byte) -15, 1);
            class696.field9774 = class266.method1624(false, 16, (byte) -15, 1);
            class46.field663 = class266.method1624(false, 17, (byte) -15, 1);
            class46.field665 = class266.method1624(false, 18, (byte) -15, 1);
            class84.field1299 = class266.method1624(false, 19, (byte) -15, 1);
            class602.field7989 = class266.method1624(false, 20, (byte) -15, 1);
            class428.field5868 = class266.method1624(false, 21, (byte) -15, 1);
            class657.field8956 = class266.method1624(false, 22, (byte) -15, 1);
            class559.field7425 = class266.method1624(true, 23, (byte) -15, 1);
            class158.field2499 = class266.method1624(false, 24, (byte) -15, 1);
            class513.field6852 = class266.method1624(false, 25, (byte) -15, 1);
            class29.field481 = class266.method1624(true, 26, (byte) -15, 1);
            class482.field6509 = class266.method1624(false, 27, (byte) -15, 1);
            class449.field6136 = class266.method1624(true, 28, (byte) -15, 1);
            class426.field5852 = class266.method1624(false, 29, (byte) -15, 1);
            class358.field4844 = class266.method1624(true, 30, (byte) -15, 1);
            class230.field3220 = class266.method1624(true, 31, (byte) -15, 1);
        }
        if (class555.field7373 == class171.field2633) {
            int var17 = 0;
            for (int var18 = 0; var18 < 35; var18++) {
                if (class47.field677[var18] != null) {
                    var17 += class47.field677[var18].method184(arg0 ^ 0x65) * class59.field917[var18] / 100;
                }
            }
            if (var17 != 100) {
                if (class688.field9662 < 0) {
                    class688.field9662 = var17;
                }
                return (var17 - class688.field9662) * 100 / (100 - class688.field9662);
            }
            class623.method3404(class658.field9155, 26592);
            class375.method2210(class658.field9155, class68.field1035, arg0 + 124, class548.method3048((byte) -79));
        }
        if (class555.field7374 == class171.field2633) {
            class220.method1391(true);
            class472.method2658(19093, 2);
        }
        if (class555.field7375 == class171.field2633) {
            class697.method3860(class358.field4844, (byte) 28, class688.field9669);
        }
        if (class555.field7376 == class171.field2633) {
            int var19 = class588.method3235(1);
            if (var19 < 100) {
                return var19;
            }
            class266.method1628(arg0 + 3, class449.field6136.method2531(1, 0));
            class351.method2095(class449.field6136.method2531(3, arg0 - 1), 3493);
        }
        if (class555.field7377 == class171.field2633) {
            if (class346.field4755 != -1 && !class16.field254.method2538(false, 0, class346.field4755)) {
                return 99;
            }
            class94.field1447 = new class499(class29.field481, class364.field4943, class658.field9155);
            class282.field4001 = new class551(class392.field5166, class516.field6892, class525.field6997);
            class674.field9537 = new class404(class392.field5166, class516.field6892, class525.field6997);
            class397.field5279 = new class591(class392.field5166, class516.field6892, class525.field6997, class658.field9155);
            class672.field9519 = new class603(class392.field5166, class516.field6892, class46.field663);
            class98.field1479 = new class601(class392.field5166, class516.field6892, class525.field6997);
            class139.field2246 = new class197(class392.field5166, class516.field6892, class525.field6997);
            class133.field2174 = new class66(class392.field5166, class516.field6892, class525.field6997, class16.field254);
            class640.field8606 = new class534(class392.field5166, class516.field6892, class525.field6997);
            class428.field5877 = new class456(class392.field5166, class516.field6892, class525.field6997);
            class470.field6288 = new class195(class392.field5166, class516.field6892, true, class696.field9774, class16.field254);
            class521.field6960 = new class242(class392.field5166, class516.field6892, class525.field6997, class658.field9155);
            class457.field6215 = new class261(class392.field5166, class516.field6892, class525.field6997, class658.field9155);
            class239.field3369 = new class36(class392.field5166, class516.field6892, true, class46.field665, class16.field254);
            class193.field2826 = new class143(class392.field5166, class516.field6892, true, class282.field4001, class84.field1299, class16.field254);
            class156.field2470 = new class118(class392.field5166, class516.field6892, class525.field6997);
            class636.field8570 = new class27(class392.field5166, class516.field6892, class602.field7989, class406.field5469, class613.field8103);
            class152.field2405 = new class134(class392.field5166, class516.field6892, class525.field6997);
            class328.field4518 = new class362(class392.field5166, class516.field6892, class525.field6997);
            class120.field2028 = new class662(class392.field5166, class516.field6892, class428.field5868, class16.field254);
            class410.field5535 = new class91(class392.field5166, class516.field6892, class525.field6997);
            class93.field1426 = new class227(class392.field5166, class516.field6892, class525.field6997);
            class679.field9581 = new class556(class392.field5166, class516.field6892, class525.field6997);
            class392.field5167 = new class78(class392.field5166, class516.field6892, class657.field8956);
            class597.field7937 = new class524(class392.field5166, class516.field6892, class525.field6997);
            class635.method3512(class68.field1035, class16.field254, class658.field9155, 401887757, class225.field3176);
            class322.method1953(class426.field5852, (byte) 108);
            class505.field6747 = new class285(class516.field6892, class158.field2499, class513.field6852);
            class29.field478 = new class686(class516.field6892, class158.field2499, class513.field6852, new class157());
            class284.method1762((byte) 123);
            class470.field6288.method1260(-22754, !class344.field4718.method1553(class571.field7587, -2058));
            class80.field1261 = new class213();
            class511.method2842(true);
            class426.method2438((byte) 5, class482.field6509);
            class291.method1792(class16.field254, class94.field1447, -110);
            class56 var20 = new class56(class700.field9849.method2532("huffman", "", -24518));
            class556.method3076(8107, var20);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class433.field5920 = class225.method1416(arg0 + 98);
        }
        if (class555.field7379 == class171.field2633) {
            int var21 = class246.method1508(class658.field9155, (byte) 0) + class429.method2449(true, false);
            int var22 = class661.method3715((byte) 58) + class157.method1096((byte) 95);
            if (var22 > var21) {
                return var21 * 100 / var22;
            }
        }
        if (class555.field7380 == class171.field2633) {
            class567.method3116(class559.field7425, class98.field1479, class139.field2246, class470.field6288, class521.field6960, class457.field6215, class80.field1261);
        }
        if (class555.field7381 == class171.field2633) {
            class138.field2228 = new String[class93.field1426.field3198];
            class690.field9711 = new boolean[class679.field9581.field7390];
            class476.field6352 = new int[class679.field9581.field7390];
            for (int var23 = 0; var23 < class679.field9581.field7390; var23++) {
                if (class679.field9581.method3074(var23, 81).field2775 == 0) {
                    class690.field9711[var23] = true;
                    class100.field1501++;
                }
                class476.field6352[var23] = -1;
            }
            class372.method2193(-54);
            class568.field7548 = class225.field3176.method2523("loginscreen", (byte) 98);
            class10.field202 = class225.field3176.method2523("lobbyscreen", (byte) 85);
            class243.field3403.method2525(false, true, false);
            class603.field8016.method2525(false, true, true);
            class658.field9155.method2525(false, true, true);
            class68.field1035.method2525(false, true, true);
            class700.field9849.method2525(false, true, true);
            class225.field3176.method2525(false, true, true);
            class335.field4606 = true;
            class525.field6997.field6162 = 2;
            class46.field663.field6162 = 2;
            class696.field9774.field6162 = 2;
            class46.field665.field6162 = 2;
            class84.field1299.field6162 = 2;
            class602.field7989.field6162 = 2;
            class428.field5868.field6162 = 2;
        }
        if (class555.field7382 == class171.field2633) {
            if (!class269.method1639(class568.field7548, arg0 - 1)) {
                return 0;
            }
            for (int var24 = 0; var24 < class601.field7977[class568.field7548].length; var24++) {
                class625 var25 = class601.field7977[class568.field7548][var24];
                if (var25.field8421 == 5 && var25.field8289 != -1) {
                    var25.method3422(class10.field197, (byte) -82);
                }
            }
        }
        if (class555.field7383 == class171.field2633) {
            for (int var26 = 0; var26 < class601.field7977[class568.field7548].length; var26++) {
                class625 var27 = class601.field7977[class568.field7548][var26];
                if (var27.field8421 == 5 && var27.field8289 != -1 && var27.method3422(class10.field197, (byte) 109) == null && class392.field5168) {
                    return 0;
                }
            }
        }
        if (class555.field7384 == class171.field2633) {
            class312.method1864(true, true);
        }
        if (class555.field7385 == class171.field2633) {
            class2.field11.method1439(2);
            try {
                class696.field9776.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class528.field7043 = class344.field4718.field5452;
            class344.field4718.field5452 = true;
            class344.field4718.method1562(119, class688.field9669);
            if (class528.field7043) {
                class405.method2326(0, -81);
            } else {
                class405.method2326(class344.field4718.field5433, -85);
            }
            class212.method1359(class344.field4718.field5439, true, -1, -1, false);
            class395.method2263(-22082, class10.field197);
            class26.method227(false, class10.field197);
            class566.method3100(class10.field197, (byte) 67, class658.field9155);
            class58.method480(class391.field5159, (byte) -7);
            class394.field5203 = null;
            class3.field32 = null;
            class23.field388 = null;
            class187.field2785 = null;
        }
        return class375.method2211(arg0 - 2);
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)V")
    public static void method512(int arg0) {
        field979 = null;
        field982 = null;
        field985 = null;
        if (arg0 != -2) {
            field982 = null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field981++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(IBI)I")
    public static final int method513(int arg0, byte arg1, int arg2) {
        field984++;
        if (arg1 >= -55) {
            method513(111, (byte) -99, -97);
        }
        int var3 = arg0 >>> 24;
        int var4 = 255 - var3;
        int var5 = ((arg0 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg0 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        return (((arg2 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg2 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }
}
