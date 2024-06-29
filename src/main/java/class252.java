import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class252 extends class392 {

    @OriginalMember(owner = "client!kw", name = "v", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!kw", name = "y", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!kw", name = "A", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!kw", name = "C", descriptor = "I")
    public int field3247;

    @OriginalMember(owner = "client!kw", name = "E", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!kw", name = "F", descriptor = "I")
    public int field3250;

    @OriginalMember(owner = "client!kw", name = "G", descriptor = "I")
    public int field3251;

    @OriginalMember(owner = "client!kw", name = "B", descriptor = "Lvia;")
    public static class564 field3246;

    @OriginalMember(owner = "client!kw", name = "D", descriptor = "Ljava/lang/String;")
    public String field3248;

    @OriginalMember(owner = "client!kw", name = "w", descriptor = "[[I")
    public static int[][] field3241;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)J", line = 5)
    public final long method1496(byte arg0) {
        ++field3244;
        if (arg0 > -10) {
            this.method1502((byte) -40);
        }
        return Long.MAX_VALUE & super.field5550;
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V", line = 17)
    public final void method1497(int arg0) {
        super.field5550 = 500L + class538.method2963(-47) | Long.MIN_VALUE & super.field5550;
        ++field3245;
        if (arg0 != 0) {
            this.field3250 = -123;
        }
        class214.field2572.method2341(this, arg0 + -43);
    }

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "(B)V", line = 33)
    public static void method1498(byte arg0) {
        if (arg0 != 20) {
            field3246 = null;
        }
        field3241 = null;
        field3246 = null;
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(I)I", line = 45)
    public final int method1499(int arg0) {
        ++field3240;
        if (arg0 >= -89) {
            this.field3251 = 2;
        }
        return (int) super.field556;
    }

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "(I)I", line = 58)
    public static final int method1500(int arg0) {
        ++field3242;
        if (~class11.field68.field5528.method3595((byte) 123) == -1) {
            for (int var1 = 0; ~class28.field210 < ~var1; ++var1) {
                if (class537.field7303[var1].method258(13313) == 's' || class537.field7303[var1].method258(13313) == 'S') {
                    class11.field68.method2276((byte) -13, 1, class11.field68.field5528);
                    class130.field1678 = true;
                    break;
                }
            }
        }
        if (class704.field9876 == class386.field5428) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class538.method2963(-47);
            if (~class368.field5169 == -1L) {
                class368.field5169 = var4;
            }
            if (var3 > 16384 && ~(-class368.field5169 + var4) > -5001L) {
                if (var4 - class64.field696 > 1000L) {
                    System.gc();
                    class64.field696 = var4;
                }
                return 0;
            }
        }
        if (class704.field9876 == class386.field5429) {
            if (class489.field6696 == null) {
                class489.field6696 = new class581(class759.field10590, class310.field4199, class71.field771, class179.field2187);
            }
            if (!class489.field6696.method3249(5)) {
                return 0;
            }
            class88.method637((byte) 69, (String) null, 0, true);
            class572.field8046 = !class520.method2867(false);
            class669.field9310 = class725.method4070(-79, false, 1, !class572.field8046 ? 32 : 34);
            class182.field2230 = class725.method4070(-50, false, 1, 33);
            class641.field8923 = class725.method4070(-67, false, 1, 13);
        }
        if (class704.field9876 == class386.field5431) {
            boolean var6 = class182.field2230.method2870((byte) 108);
            int var7 = class76.field932[33].method3734(-90);
            int var8 = var7 + class76.field932[class572.field8046 ? 34 : 32].method3734(-38);
            int var9 = var8 + class76.field932[13].method3734(-26);
            int var10 = var9 + (var6 ? 100 : class182.field2230.method2902((byte) -49));
            if (~var10 != -401) {
                return var10 / 4;
            }
            class271.field3576 = class669.field9310.method2875((byte) -50);
            class104.field1395 = class182.field2230.method2875((byte) -48);
            class651.method3676(class669.field9310, 78);
            int var11 = class11.field68.field5518.method2633((byte) 121);
            class165.field2069 = new class596(class51.field541, class723.field10095, class182.field2230);
            int[] var12 = class165.field2069.method3299(var11, (byte) 94);
            if (var12.length == 0) {
                var12 = class165.field2069.method3299(0, (byte) 90);
            }
            class341 var13 = new class341(class669.field9310, class641.field8923);
            if (var12.length > 0) {
                class546.field7709 = new class187[var12.length];
                for (int var14 = 0; ~var14 > ~class546.field7709.length; ++var14) {
                    class546.field7709[var14] = new class717(class165.field2069.method3300(-123, var12[var14]), var13);
                }
            }
        }
        if (class704.field9876 == class386.field5433) {
            class236.method1422(3, class641.field8923, class519.method2857(-125), class669.field9310);
        }
        if (class704.field9876 == class386.field5434) {
            int var15 = class306.method1848(-13);
            int var16 = class614.method3455(2);
            if (var16 > var15) {
                return var15 * 100 / var16;
            }
        }
        if (class704.field9876 == class386.field5435) {
            if (class546.field7709 != null && ~class546.field7709.length < -1) {
                if (~class546.field7709[0].method1052(-794) > -101) {
                    return 0;
                }
                if (~class546.field7709.length < -2 && class165.field2069.method3301(1) && ~class546.field7709[1].method1052(-794) > -101) {
                    return 0;
                }
            }
            class394.method2294((byte) -128, class21.field142);
            class352.method2044(class21.field142, (byte) -116);
            class237.method1429(1, false);
        }
        if (class704.field9876 == class386.field5436) {
            for (int var17 = 0; var17 < 4; ++var17) {
                class171.field2130[var17] = class70.method523(2742, class3.field26, class272.field3589);
            }
        }
        if (class704.field9876 == class386.field5437) {
            class97.field1282 = class725.method4070(-119, false, 1, 8);
            class413.field5843 = class725.method4070(-114, false, 1, 0);
            class94.field1236 = class725.method4070(-115, false, 1, 1);
            client.field4109 = class725.method4070(-116, false, 1, 2);
            class608.field8500 = class725.method4070(-126, false, 1, 3);
            class556.field7844 = class725.method4070(-92, false, 1, 4);
            class591.field8248 = class725.method4070(-54, true, 1, 5);
            class727.field10149 = class725.method4070(-115, true, 1, 6);
            class430.field6050 = class725.method4070(-92, false, 1, 7);
            class611.field8590 = class725.method4070(-121, false, 1, 9);
            class450.field6298 = class725.method4070(-93, false, 1, 10);
            class237.field3108 = class725.method4070(-100, false, 1, 11);
            class511.field6901 = class725.method4070(-120, false, 1, 12);
            class303.field4094 = class725.method4070(-91, false, 1, 14);
            class647.field9003 = class725.method4070(-92, false, 1, 15);
            class181.field2219 = class725.method4070(-87, false, 1, 16);
            class507.field6868 = class725.method4070(-49, false, 1, 17);
            class591.field8251 = class725.method4070(-90, false, 1, 18);
            class645.field8984 = class725.method4070(-62, false, 1, 19);
            class176.field2174 = class725.method4070(-111, false, 1, 20);
            class244.field3168 = class725.method4070(-123, false, 1, 21);
            class761.field10627 = class725.method4070(-124, false, 1, 22);
            class226.field2933 = class725.method4070(-113, true, 1, 23);
            class143.field1854 = class725.method4070(-81, false, 1, 24);
            class296.field3981 = class725.method4070(-82, false, 1, 25);
            class608.field8498 = class725.method4070(-111, true, 1, 26);
            class643.field8974 = class725.method4070(-96, false, 1, 27);
            class531.field7217 = class725.method4070(-80, true, 1, 28);
            class648.field9059 = class725.method4070(-119, false, 1, 29);
            class643.field8969 = class725.method4070(-102, true, 1, 30);
            class491.field6707 = class725.method4070(-108, true, 1, 31);
            class704.field9882 = class725.method4070(-121, true, 2, 36);
        }
        if (class704.field9876 == class386.field5438) {
            int var18 = 0;
            for (int var19 = 0; var19 < 37; ++var19) {
                if (class76.field932[var19] != null) {
                    var18 += class76.field932[var19].method3734(-51) * class692.field9674[var19] / 100;
                }
            }
            if (~var18 != -101) {
                if (class695.field9714 < 0) {
                    class695.field9714 = var18;
                }
                return (-class695.field9714 + var18) * 100 / (100 - class695.field9714);
            }
            class669.method3770((byte) -107, class97.field1282);
            class236.method1422(3, class641.field8923, class519.method2857(-125), class97.field1282);
        }
        if (class704.field9876 == class386.field5439) {
            if (~class413.field5841 == 0) {
                class413.field5841 = class727.field10149.method2890((byte) -109, "scape main");
            }
            class751.method4182(-120);
            class237.method1429(2, false);
        }
        if (class704.field9876 == class386.field5440) {
            class50.method297(class643.field8969, class287.field3823, -1);
        }
        if (class704.field9876 == class386.field5441) {
            int var20 = class424.method2426((byte) -128);
            if (~var20 > -101) {
                return var20;
            }
            class662.method3744(class531.field7217.method2873(1, 14), -65536);
            class620.method3514(class531.field7217.method2873(3, 82), (byte) -25);
        }
        if (class704.field9876 == class386.field5442) {
            if (~class571.field8038 != 0 && !class430.field6050.method2891(0, class571.field8038, -6329)) {
                return 99;
            }
            class15.field116 = new class681(class608.field8498, class611.field8590, class97.field1282);
            class482.field6654 = new class50(class51.field541, class723.field10095, client.field4109);
            class137.field1743 = new class226(class51.field541, class723.field10095, client.field4109);
            class360.field4768 = new class162(class51.field541, class723.field10095, client.field4109, class97.field1282);
            class26.field193 = new class731(class51.field541, class723.field10095, class507.field6868);
            class301.field4067 = new class170(class51.field541, class723.field10095, client.field4109);
            class130.field1685 = new class256(class51.field541, class723.field10095, client.field4109);
            class142.field1830 = new class519(class51.field541, class723.field10095, client.field4109, class97.field1282);
            class135.field1723 = new class258(class51.field541, class723.field10095, client.field4109, class430.field6050);
            class503.field6834 = new class600(class51.field541, class723.field10095, client.field4109);
            class537.field7293 = new class476(class51.field541, class723.field10095, client.field4109);
            class707.field9894 = new class735(class51.field541, class723.field10095, true, class181.field2219, class430.field6050);
            class224.field2894 = new class277(class51.field541, class723.field10095, client.field4109, class97.field1282);
            class593.field8266 = new class231(class51.field541, class723.field10095, client.field4109, class97.field1282);
            class51.field540 = new class728(class51.field541, class723.field10095, true, class591.field8251, class430.field6050);
            class761.field10628 = new class747(class51.field541, class723.field10095, true, class482.field6654, class645.field8984, class430.field6050);
            class461.field6378 = new class380(class51.field541, class723.field10095, client.field4109);
            class460.field6365 = new class196(class51.field541, class723.field10095, class176.field2174, class413.field5843, class94.field1236);
            class147.field1893 = new class501(class51.field541, class723.field10095, client.field4109);
            class278.field3718 = new class131(class51.field541, class723.field10095, client.field4109);
            class303.field4090 = new class622(class51.field541, class723.field10095, class244.field3168, class430.field6050);
            class758.field10568 = new class568(class51.field541, class723.field10095, client.field4109);
            class253.field3282 = new class670(class51.field541, class723.field10095, client.field4109);
            class580.field8129 = new class579(class51.field541, class723.field10095, client.field4109);
            class465.field6445 = new class304(class51.field541, class723.field10095, class761.field10627);
            class684.field9522 = new class121(class51.field541, class723.field10095, client.field4109);
            class413.method2385(-99, class608.field8500, class641.field8923, class97.field1282, class430.field6050);
            class531.method2940(class648.field9059, -1);
            class29.field237 = new class491(class723.field10095, class143.field1854, class296.field3981);
            class511.field6912 = new class268(class723.field10095, class143.field1854, class296.field3981, new class72());
            class34.method164(-1439);
            class707.field9894.method4115(~class11.field68.field5548.method186((byte) 123) == -1, 60);
            class386.field5455 = new class633();
            class216.method1201((byte) 54);
            class129.method816(class643.field8974, (byte) -98);
            class650.method3673(class430.field6050, true, class15.field116);
            class462 var21 = new class462(class450.field6298.method2879("huffman", "", -32734));
            class112.method752(-256, var21);
            try {
                jagmisc.init();
            } catch (Throwable var30) {
            }
            class414.field5854 = class581.method3251(72);
            class353.field4715 = new class733(true, class287.field3823);
        }
        if (class704.field9876 == class386.field5444) {
            int var22 = class400.method2317(-11286, class97.field1282) - -class401.method2321(true, (byte) 90);
            int var23 = class671.method3774(84) - -class614.method3455(2);
            if (~var22 > ~var23) {
                return var22 * 100 / var23;
            }
        }
        if (class704.field9876 == class386.field5445) {
            class642.method3612(class226.field2933, class301.field4067, class130.field1685, class707.field9894, class224.field2894, class593.field8266, class386.field5455);
        }
        if (class704.field9876 == class386.field5446) {
            class633.field8794 = new boolean[class580.field8129.field8121];
            class102.field1367 = new String[class253.field3282.field9311];
            class161.field2024 = new int[class580.field8129.field8121];
            for (int var24 = 0; class580.field8129.field8121 > var24; ++var24) {
                if (class580.field8129.method3242(var24, 58).field1799 == 0) {
                    class633.field8794[var24] = true;
                    ++class223.field2875;
                }
                class161.field2024[var24] = -1;
            }
            class25.method99((byte) 102);
            class697.field9808 = class608.field8500.method2890((byte) -106, "loginscreen");
            class37.field387 = class608.field8500.method2890((byte) -121, "lobbyscreen");
            class591.field8248.method2887(false, true, (byte) 95);
            class727.field10149.method2887(true, true, (byte) -120);
            class97.field1282.method2887(true, true, (byte) 66);
            class641.field8923.method2887(true, true, (byte) -78);
            class450.field6298.method2887(true, true, (byte) -70);
            class608.field8500.method2887(true, true, (byte) 125);
            class231.field2977 = true;
            client.field4109.field7039 = 2;
            class507.field6868.field7039 = 2;
            class181.field2219.field7039 = 2;
            class591.field8251.field7039 = 2;
            class645.field8984.field7039 = 2;
            class176.field2174.field7039 = 2;
            class244.field3168.field7039 = 2;
        }
        if (class704.field9876 == class386.field5447) {
            if (!class382.method2244(class697.field9808, 102)) {
                return 0;
            }
            boolean var25 = true;
            for (int var26 = 0; ~class357.field4742[class697.field9808].length < ~var26; ++var26) {
                class218 var27 = class357.field4742[class697.field9808][var26];
                if (~var27.field2832 == -6 && ~var27.field2696 != 0 && !class97.field1282.method2891(0, var27.field2696, -6329)) {
                    var25 = false;
                }
            }
            if (!var25) {
                return 0;
            }
        }
        if (class704.field9876 == class386.field5448) {
            class476.method2676(true, 0);
        }
        int var28 = -84 % ((arg0 - 75) / 41);
        if (class704.field9876 == class386.field5449) {
            class633.field8786.method1167(false);
            try {
                class430.field6043.join();
            } catch (InterruptedException var29) {
                return 0;
            }
            class546.field7709 = null;
            class430.field6043 = null;
            class669.field9310 = null;
            class633.field8786 = null;
            class182.field2230 = null;
            class165.field2069 = null;
            class573.method3218((byte) 55);
            class500.field6811 = class11.field68.field5528.method3595((byte) 127) == 1;
            class11.field68.method2276((byte) -13, 1, class11.field68.field5528);
            if (class500.field6811) {
                class11.field68.method2276((byte) -13, 0, class11.field68.field5530);
            } else if (class11.field68.field5530.field1457 && ~class353.field4715.field10203 > -513 && class353.field4715.field10203 != 0) {
                class11.field68.method2276((byte) -13, 0, class11.field68.field5530);
            }
            class355.method2054(-5964);
            if (class500.field6811) {
                class479.method2689(0, false, 1);
            } else {
                class479.method2689(class11.field68.field5530.method741((byte) 123), false, 101);
            }
            class426.method2445(class11.field68.field5517.method2812((byte) 122), -1, 3, -1, false);
            class394.method2294((byte) -112, class21.field142);
            class352.method2044(class21.field142, (byte) -88);
            class274.method1640(class21.field142, (byte) -75, class97.field1282);
            class461.method2565(class205.field2434, 0);
        }
        return class306.method1845(-5133);
    }

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "(B)I", line = 509)
    public final int method1501(byte arg0) {
        ++field3243;
        if (arg0 != -108) {
            this.field3250 = 116;
        }
        return (int) (super.field556 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(II)V", line = 522)
    public class252(int arg0, int arg1) {
        super.field556 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "(B)V", line = 530)
    public final void method1502(byte arg0) {
        ++field3249;
        super.field5550 |= Long.MIN_VALUE;
        if (arg0 == -103) {
            if (this.method1496((byte) -104) == 0L) {
                class275.field3677.method2341(this, -71);
            }
        }
    }
}
