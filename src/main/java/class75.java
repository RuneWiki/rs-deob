import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class75 {

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "Laj;")
    private class287 field1530 = new class287(64);

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "Laj;")
    public class287 field1539 = new class287(50);

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "Laj;")
    public class287 field1540 = new class287(5);

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lom;")
    private class344 field1525;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "Lom;")
    public class344 field1534;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Lmea;")
    public class398 field1528;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Z")
    public boolean field1523;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Z")
    public static boolean field1520 = false;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field1532 = 0;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public int field1541;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BII)V")
    public static final void method802(byte arg0, int arg1, int arg2) {
        if (arg0 != 61) {
            field1520 = false;
        }
        if (class455.field6492 == 1) {
            class602.method3443(arg2, (byte) 111, arg1, class509.field7215);
        } else if (class455.field6492 == 2) {
            class623.method3551(arg1, 109, arg2);
        }
        field1537++;
        class509.field7215 = null;
        class455.field6492 = 0;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)V")
    public static final void method803(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1524++;
        if (arg2 >= class309.field4556 && client.field4115 >= arg2) {
            int var5 = class107.method968(class379.field5612, 111, class704.field9911, arg0);
            int var6 = class107.method968(class379.field5612, 120, class704.field9911, arg3);
            class634.method3616(arg2, 61, arg1, var6, var5);
        }
        if (arg4 > -11) {
            method805(false);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V")
    public final void method804(int arg0, int arg1) {
        this.field1541 = arg0;
        field1533++;
        class287 var3 = this.field1539;
        synchronized (this.field1539) {
            this.field1539.method1913(true);
        }
        if (arg1 != -21973) {
            this.field1528 = null;
        }
        class287 var4 = this.field1540;
        synchronized (this.field1540) {
            this.field1540.method1913(true);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)I")
    public static final int method805(boolean arg0) {
        field1531++;
        if (!class527.field7429.field2650) {
            for (int var1 = 0; var1 < class126.field2309; var1++) {
                if (class675.field9606[var1].method634((byte) -114) == 's' || class675.field9606[var1].method634((byte) 68) == 'S') {
                    class527.field7429.field2650 = true;
                    break;
                }
            }
        }
        if (class310.field4597 == class30.field938) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class525.method3074((byte) -101);
            if (class29.field936 == 0L) {
                class29.field936 = var4;
            }
            if (var3 > 16384 && var4 - class29.field936 < 5000L) {
                if ((var4 - class454.field6487) > 1000L) {
                    System.gc();
                    class454.field6487 = var4;
                }
                return 0;
            }
        }
        if (arg0) {
            field1520 = true;
        }
        if (class310.field4603 == class30.field938) {
            if (class304.field4511 == null) {
                class304.field4511 = new class703(class186.field2999, class110.field1956, class416.field6020, class159.field2706);
            }
            if (!class304.field4511.method3931((byte) 108)) {
                return 0;
            }
            class369.method2333(0, (byte) -14, null);
            class379.field5611 = !class270.method1757(-2699);
            class321.field4705 = class213.method1487(false, class379.field5611 ? 34 : 32, 1, (byte) -75);
            class425.field6138 = class213.method1487(false, 33, 1, (byte) -75);
            class95.field1708 = class213.method1487(false, 13, 1, (byte) -75);
        }
        if (class310.field4604 == class30.field938) {
            class425.field6138.method2212((byte) 110);
            int var6 = class486.field6948[33].method957(-108);
            int var7 = var6 + class486.field6948[class379.field5611 ? 34 : 32].method957(112);
            int var8 = var7 + class486.field6948[13].method957(-90);
            int var9 = var8 + class425.field6138.method2219(100);
            if (var9 != 400) {
                return var9 / 4;
            }
            class242.field3666 = class321.field4705.method2229((byte) 96);
            class13.field697 = class425.field6138.method2229((byte) 88);
            class228.method1555(-15157, class321.field4705);
            int var10 = class527.field7429.field2627;
            class444.field6401 = new class506(class78.field1573, class140.field2466, class425.field6138);
            int[] var11 = class444.field6401.method3007(var10, -27084);
            class585 var12 = new class585(class321.field4705, class95.field1708);
            if (var11.length > 0) {
                class495.field7061 = new class516[var11.length];
                for (int var13 = 0; var13 < class495.field7061.length; var13++) {
                    class495.field7061[var13] = new class514(class444.field6401.method3004(1274, var11[var13]), var12);
                }
            }
        }
        if (class310.field4605 == class30.field938) {
            class445.method2674(class604.method3461(0), class95.field1708, class321.field4705, (byte) 116);
        }
        if (class310.field4606 == class30.field938) {
            int var14 = class181.method1333((byte) 93);
            int var15 = class121.method1052((byte) -68);
            if (var15 > var14) {
                return var14 * 100 / var15;
            }
        }
        if (class310.field4607 == class30.field938) {
            if (class495.field7061 != null && class495.field7061.length > 0) {
                if (class495.field7061[0].method1767(-4979) < 100) {
                    return 0;
                }
                if (class495.field7061.length > 1 && class444.field6401.method3003(!arg0) && class495.field7061[1].method1767(-4979) < 100) {
                    return 0;
                }
            }
            class417.method2537(-19695, class623.field9017);
            class433.method2632(class623.field9017, -1);
            class118.method1038(1, 1);
        }
        if (class310.field4608 == class30.field938) {
            for (int var16 = 0; var16 < 4; var16++) {
                class223.field3352[var16] = class633.method3611(class675.field9604, -52, class218.field3316);
            }
        }
        if (class310.field4609 == class30.field938) {
            class632.field9092 = class213.method1487(false, 8, 1, (byte) -75);
            class669.field9559 = class213.method1487(false, 0, 1, (byte) -75);
            class247.field3726 = class213.method1487(false, 1, 1, (byte) -75);
            class213.field3263 = class213.method1487(false, 2, 1, (byte) -75);
            class82.field1600 = class213.method1487(false, 3, 1, (byte) -75);
            class35.field1027 = class213.method1487(false, 4, 1, (byte) -75);
            class13.field722 = class213.method1487(true, 5, 1, (byte) -75);
            class46.field1128 = class213.method1487(true, 6, 1, (byte) -75);
            class344.field5127 = class213.method1487(false, 7, 1, (byte) -75);
            class135.field2394 = class213.method1487(false, 9, 1, (byte) -75);
            class662.field9534 = class213.method1487(false, 10, 1, (byte) -75);
            class325.field4766 = class213.method1487(false, 11, 1, (byte) -75);
            class481.field6912 = class213.method1487(false, 12, 1, (byte) -75);
            class444.field6395 = class213.method1487(false, 14, 1, (byte) -75);
            class324.field4757 = class213.method1487(false, 15, 1, (byte) -75);
            class455.field6494 = class213.method1487(false, 16, 1, (byte) -75);
            class323.field4720 = class213.method1487(false, 17, 1, (byte) -75);
            class136.field2418 = class213.method1487(false, 18, 1, (byte) -75);
            class51.field1188 = class213.method1487(false, 19, 1, (byte) -75);
            class405.field5852 = class213.method1487(false, 20, 1, (byte) -75);
            class420.field6053 = class213.method1487(false, 21, 1, (byte) -75);
            class706.field9942 = class213.method1487(false, 22, 1, (byte) -75);
            class613.field8924 = class213.method1487(true, 23, 1, (byte) -75);
            class302.field4506 = class213.method1487(false, 24, 1, (byte) -75);
            class143.field2508 = class213.method1487(false, 25, 1, (byte) -75);
            class150.field2566 = class213.method1487(true, 26, 1, (byte) -75);
            class117.field2085 = class213.method1487(false, 27, 1, (byte) -75);
            class385.field5656 = class213.method1487(true, 28, 1, (byte) -75);
            class150.field2578 = class213.method1487(false, 29, 1, (byte) -75);
            class51.field1187 = class213.method1487(true, 30, 1, (byte) -75);
            class252.field3751 = class213.method1487(true, 31, 1, (byte) -75);
        }
        if (class310.field4610 == class30.field938) {
            int var17 = 0;
            for (int var18 = 0; var18 < 35; var18++) {
                if (class486.field6948[var18] != null) {
                    var17 += class486.field6948[var18].method957(-64) * class682.field9656[var18] / 100;
                }
            }
            if (var17 != 100) {
                if (class617.field8959 < 0) {
                    class617.field8959 = var17;
                }
                return (var17 - class617.field8959) * 100 / (100 - class617.field8959);
            }
            class583.method3342(-116, class632.field9092);
            class445.method2674(class604.method3461(0), class95.field1708, class632.field9092, (byte) 118);
        }
        if (class310.field4611 == class30.field938) {
            class576.method3303(9);
            class118.method1038(2, 1);
        }
        if (class310.field4612 == class30.field938) {
            class79.method828(class604.field8775, (byte) 67, class51.field1187);
        }
        if (class310.field4613 == class30.field938) {
            int var19 = client.method1816((byte) -124);
            if (var19 < 100) {
                return var19;
            }
            class271.method1761(class385.field5656.method2242(0, 1), true);
            class170.method1288(class385.field5656.method2242(0, 3), (byte) -86);
        }
        if (class310.field4614 == class30.field938) {
            if (class438.field6314 != -1 && !class344.field5127.method2217(class438.field6314, 105, 0)) {
                return 99;
            }
            class513.field7240 = new class486(class150.field2566, class135.field2394, class632.field9092);
            client.field4124 = new class109(class78.field1573, class140.field2466, class213.field3263);
            class373.field5557 = new class144(class78.field1573, class140.field2466, class213.field3263);
            class589.field8478 = new class345(class78.field1573, class140.field2466, class213.field3263, class632.field9092);
            class404.field5837 = new class537(class78.field1573, class140.field2466, class323.field4720);
            class99.field1767 = new class648(class78.field1573, class140.field2466, class213.field3263);
            class1.field54 = new class217(class78.field1573, class140.field2466, class213.field3263);
            class467.field6618 = new class286(class78.field1573, class140.field2466, class213.field3263, class344.field5127);
            class96.field1715 = new class81(class78.field1573, class140.field2466, class213.field3263);
            class428.field6168 = new class454(class78.field1573, class140.field2466, class213.field3263);
            class237.field3521 = new class612(class78.field1573, class140.field2466, true, class455.field6494, class344.field5127);
            class342.field5099 = new class588(class78.field1573, class140.field2466, class213.field3263, class632.field9092);
            class597.field8568 = new class469(class78.field1573, class140.field2466, class213.field3263, class632.field9092);
            class317.field4681 = new class75(class78.field1573, class140.field2466, true, class136.field2418, class344.field5127);
            class268.field3985 = new class6(class78.field1573, class140.field2466, true, client.field4124, class51.field1188, class344.field5127);
            class119.field2137 = new class471(class78.field1573, class140.field2466, class213.field3263);
            class357.field5338 = new class325(class78.field1573, class140.field2466, class405.field5852, class669.field9559, class247.field3726);
            class475.field6813 = new class218(class78.field1573, class140.field2466, class213.field3263);
            class92.field1672 = new class625(class78.field1573, class140.field2466, class213.field3263);
            class261.field3825 = new class174(class78.field1573, class140.field2466, class420.field6053, class344.field5127);
            class598.field8575 = new class580(class78.field1573, class140.field2466, class213.field3263);
            class560.field7909 = new class530(class78.field1573, class140.field2466, class213.field3263);
            class458.field6534 = new class27(class78.field1573, class140.field2466, class213.field3263);
            class661.field9519 = new class51(class78.field1573, class140.field2466, class706.field9942);
            class107.field1851 = new class247(class78.field1573, class140.field2466, class213.field3263);
            class150.method1181(class82.field1600, 3078, class632.field9092, class95.field1708, class344.field5127);
            class625.method3558(class150.field2578, (byte) 112);
            class381.field5641 = new class337(class140.field2466, class302.field4506, class143.field2508);
            class379.field5606 = new class379(class140.field2466, class302.field4506, class143.field2508, new class90());
            class501.method2990(0);
            class237.field3521.method3512(0, !class527.field7429.method2824(-1, class90.field1654));
            class113.field2038 = new class136();
            class309.method2016(4);
            class375.method2360((byte) 113, class117.field2085);
            class611.method3508((byte) 95, class344.field5127, class513.field7240);
            class646 var20 = new class646(class662.field9534.method2211("huffman", 19558, ""));
            class118.method1032(var20, true);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class358.field5340 = class623.method3555(512);
        }
        if (class310.field4616 == class30.field938) {
            int var21 = class675.method3799((byte) -125, class632.field9092) + class107.method970(true, (byte) -13);
            int var22 = class499.method2978((byte) 49) + class121.method1052((byte) -126);
            if (var22 > var21) {
                return var21 * 100 / var22;
            }
        }
        if (class310.field4617 == class30.field938) {
            class407.method2485(class613.field8924, class99.field1767, class1.field54, class237.field3521, class342.field5099, class597.field8568, class113.field2038);
        }
        if (class310.field4618 == class30.field938) {
            class302.field4501 = new boolean[class458.field6534.field923];
            class25.field914 = new String[class560.field7909.field7445];
            class650.field9383 = new int[class458.field6534.field923];
            for (int var23 = 0; var23 < class458.field6534.field923; var23++) {
                if (class458.field6534.method492(19, var23).field2526 == 0) {
                    class302.field4501[var23] = true;
                    class253.field3755++;
                }
                class650.field9383[var23] = -1;
            }
            class573.method3296(-2);
            class46.field1129 = class82.field1600.method2228("loginscreen", 5781);
            class444.field6382 = class82.field1600.method2228("lobbyscreen", 5781);
            class13.field722.method2235(true, false, 0);
            class46.field1128.method2235(true, true, 0);
            class632.field9092.method2235(true, true, 0);
            class95.field1708.method2235(true, true, 0);
            class662.field9534.method2235(true, true, 0);
            class82.field1600.method2235(true, true, 0);
            class213.field3263.field5152 = 2;
            class312.field4636 = true;
            class323.field4720.field5152 = 2;
            class455.field6494.field5152 = 2;
            class136.field2418.field5152 = 2;
            class51.field1188.field5152 = 2;
            class405.field5852.field5152 = 2;
            class420.field6053.field5152 = 2;
        }
        if (class310.field4619 == class30.field938) {
            if (!class225.method1539(class46.field1129, 4)) {
                return 0;
            }
            for (int var24 = 0; var24 < class156.field2667[class46.field1129].length; var24++) {
                class545 var25 = class156.field2667[class46.field1129][var24];
                if (var25.field7649 == 5 && var25.field7685 != -1) {
                    var25.method3136(-128, class623.field9017);
                }
            }
        }
        if (class310.field4620 == class30.field938) {
            for (int var26 = 0; var26 < class156.field2667[class46.field1129].length; var26++) {
                class545 var27 = class156.field2667[class46.field1129][var26];
                if (var27.field7649 == 5 && var27.field7685 != -1 && var27.method3136(-127, class623.field9017) == null && class55.field1207) {
                    return 0;
                }
            }
        }
        if (class310.field4621 == class30.field938) {
            class115.method1018(!arg0, true);
        }
        if (class310.field4622 == class30.field938) {
            class119.field2122.method1878((byte) -120);
            try {
                class583.field8431.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class444.field6401 = null;
            class321.field4705 = null;
            class495.field7061 = null;
            class583.field8431 = null;
            class425.field6138 = null;
            class119.field2122 = null;
            class396.method2441(true);
            class462.field6584 = class527.field7429.field2650;
            class527.field7429.field2650 = true;
            class527.field7429.method2809(class604.field8775, (byte) -61);
            if (class462.field6584) {
                class294.method1959((byte) 115, 0);
            } else {
                class294.method1959((byte) 116, class527.field7429.field2621);
            }
            class485.method2931(-1, class527.field7429.field2653, -1, false, (byte) -65);
            class417.method2537(-19695, class623.field9017);
            class433.method2632(class623.field9017, -1);
            class49.method616(class632.field9092, (byte) -94, class623.field9017);
            class481.method2917(class381.field5638, -128);
        }
        return class478.method2904(-1);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)Lrr;")
    public final class334 method806(int arg0, int arg1) {
        field1536++;
        class287 var3 = this.field1530;
        class334 var4;
        synchronized (this.field1530) {
            var4 = (class334) this.field1530.method1900((long) arg0, -21);
        }
        if (var4 != null) {
            return var4;
        } else if (arg1 == 1) {
            class344 var5 = this.field1525;
            byte[] var6;
            synchronized (this.field1525) {
                var6 = this.field1525.method2216(class108.method977(arg0, false), class506.method3008(arg0, arg1 - 86), true);
            }
            class334 var7 = new class334();
            var7.field5003 = arg0;
            var7.field5006 = this;
            if (var6 != null) {
                var7.method2160(new class61(var6), 0);
            }
            var7.method2152(arg1 ^ 0xFFFFD8E5);
            class287 var8 = this.field1530;
            synchronized (this.field1530) {
                this.field1530.method1904(var7, (long) arg0, arg1 ^ 0xFFFFFFFE);
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)V")
    public final void method807(int arg0, int arg1) {
        field1527++;
        class287 var3 = this.field1530;
        synchronized (this.field1530) {
            this.field1530.method1908(arg1, (byte) -11);
        }
        class287 var4 = this.field1539;
        synchronized (this.field1539) {
            this.field1539.method1908(arg1, (byte) -11);
        }
        int var5 = -30 % ((61 - arg0) / 60);
        class287 var6 = this.field1540;
        synchronized (this.field1540) {
            this.field1540.method1908(arg1, (byte) -11);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V")
    public static final void method808(int arg0, int arg1, int arg2) {
        if (arg0 != 17393) {
            field1520 = true;
        }
        field1521++;
        class472 var3 = class240.field3541[arg1][arg2];
        if (var3 != null) {
            class136.field2417 = var3.field6692;
            class229.field3423 = var3.field6695;
            class568.field8278 = var3.field6694;
        }
        class590.method3366(1);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public final void method809(byte arg0) {
        if (arg0 != 39) {
            return;
        }
        class287 var2 = this.field1530;
        synchronized (this.field1530) {
            this.field1530.method1912(-2552);
        }
        field1529++;
        class287 var3 = this.field1539;
        synchronized (this.field1539) {
            this.field1539.method1912(-2552);
        }
        class287 var4 = this.field1540;
        synchronized (this.field1540) {
            this.field1540.method1912(-2552);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public final void method810(int arg0) {
        class287 var2 = this.field1539;
        synchronized (this.field1539) {
            this.field1539.method1913(true);
        }
        if (arg0 != -11874) {
            return;
        }
        field1522++;
        class287 var3 = this.field1540;
        synchronized (this.field1540) {
            this.field1540.method1913(true);
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
    public final void method811(int arg0) {
        if (arg0 != 1) {
            this.field1523 = true;
        }
        class287 var2 = this.field1530;
        synchronized (this.field1530) {
            this.field1530.method1913(true);
        }
        field1538++;
        class287 var3 = this.field1539;
        synchronized (this.field1539) {
            this.field1539.method1913(true);
        }
        class287 var4 = this.field1540;
        synchronized (this.field1540) {
            this.field1540.method1913(true);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BZ)V")
    public final void method812(byte arg0, boolean arg1) {
        field1535++;
        if (this.field1523 == arg1) {
            return;
        }
        this.field1523 = arg1;
        this.method811(arg0 ^ 0x67);
        if (arg0 != 102) {
            method808(-33, -91, -16);
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lmea;IZLom;Lom;)V")
    private class75(class398 arg0, int arg1, boolean arg2, class344 arg3, class344 arg4) {
        this.field1525 = arg3;
        this.field1534 = arg4;
        this.field1528 = arg0;
        this.field1523 = arg2;
        if (this.field1525 != null) {
            int var6 = this.field1525.method2245(0) - 1;
            this.field1525.method2236(var6, 0);
        }
    }
}
