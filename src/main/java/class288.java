import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tja")
public class class288 {

    @OriginalMember(owner = "client!tja", name = "e", descriptor = "Ljw;")
    public static class581 field4238 = new class581(18, -1);

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!tja", name = "b", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!tja", name = "c", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!tja", name = "d", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!tja", name = "f", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(I)V")
    public static void method1830(int arg0) {
        if (arg0 != -29162) {
            field4234 = -34;
        }
        field4238 = null;
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(B)I")
    public static final int method1831(byte arg0) {
        field4239++;
        if (arg0 != -108) {
            return -38;
        }
        if (class712.field9959.field1306.method1477(~arg0) == 0) {
            for (int var1 = 0; var1 < class301.field4350; var1++) {
                if (class503.field6968[var1].method1976((byte) -128) == 's' || class503.field6968[var1].method1976((byte) 36) == 'S') {
                    class712.field9959.method735(1, class712.field9959.field1306, 110);
                    class430.field6119 = true;
                    break;
                }
            }
        }
        if (class292.field4270 == class21.field308) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class302.method1910(arg0 + 108);
            if (class525.field7191 == 0L) {
                class525.field7191 = var4;
            }
            if (var3 > 16384 && (var4 - class525.field7191) < 5000L) {
                if ((var4 - class136.field2004) > 1000L) {
                    System.gc();
                    class136.field2004 = var4;
                }
                return 0;
            }
        }
        if (class292.field4270 == class21.field311) {
            if (class62.field891 == null) {
                class62.field891 = new class380(class647.field8984, class53.field758, class256.field3820, class515.field7045);
            }
            if (!class62.field891.method2426(19906)) {
                return 0;
            }
            class489.method2844(null, 123, 0, true);
            class653.field9061 = !class47.method363(true);
            class355.field5205 = class469.method2767(false, class653.field9061 ? 34 : 32, 8379, 1);
            class691.field9687 = class469.method2767(false, 33, 8379, 1);
            class781.field10716 = class469.method2767(false, 13, 8379, 1);
        }
        if (class292.field4270 == class21.field313) {
            boolean var6 = class691.field9687.method2113(false);
            int var7 = class391.field5761[33].method1971(118);
            int var8 = var7 + class391.field5761[class653.field9061 ? 34 : 32].method1971(118);
            int var9 = var8 + class391.field5761[13].method1971(-92);
            int var10 = var9 + (var6 ? 100 : class691.field9687.method2103(arg0 - 17));
            if (var10 != 400) {
                return var10 / 4;
            }
            class563.field7551 = class355.field5205.method2112(255);
            class500.field6909 = class691.field9687.method2112(arg0 + 363);
            class416.method2567(class355.field5205, -95);
            int var11 = class712.field9959.field1290.method2537(98);
            class457.field6338 = new class416(class21.field332, class38.field589, class691.field9687);
            int[] var12 = class457.field6338.method2570(var11, true);
            if (var12.length == 0) {
                var12 = class457.field6338.method2570(0, true);
            }
            class642 var13 = new class642(class355.field5205, class781.field10716);
            if (var12.length > 0) {
                class273.field4059 = new class534[var12.length];
                for (int var14 = 0; var14 < class273.field4059.length; var14++) {
                    class273.field4059[var14] = new class183(class457.field6338.method2569(-1, var12[var14]), var13);
                }
            }
        }
        if (class292.field4270 == class21.field314) {
            class462.method2738(class781.field10716, class302.method1908(false), class355.field5205, (byte) 77);
        }
        if (class292.field4270 == class21.field315) {
            int var15 = class771.method4267(arg0 + 109);
            int var16 = class603.method3353(true);
            if (var15 < var16) {
                return var15 * 100 / var16;
            }
        }
        if (class292.field4270 == class21.field316) {
            if (class273.field4059 != null && class273.field4059.length > 0) {
                if (class273.field4059[0].method69(-31784) < 100) {
                    return 0;
                }
                if (class273.field4059.length > 1 && class457.field6338.method2568(23382) && class273.field4059[1].method69(-31784) < 100) {
                    return 0;
                }
            }
            class183.method1272((byte) 96, class379.field5542);
            class652.method3634(-1719661332, class379.field5542);
            class300.method1901(1, 2);
        }
        if (class292.field4270 == class21.field317) {
            for (int var17 = 0; var17 < 4; var17++) {
                class514.field7038[var17] = class673.method3745(class597.field8132, (byte) -98, class628.field8800);
            }
        }
        if (class292.field4270 == class21.field318) {
            class643.field8927 = class469.method2767(false, 8, 8379, 1);
            class74.field1100 = class469.method2767(false, 0, 8379, 1);
            class651.field9035 = class469.method2767(false, 1, arg0 ^ 0xFFFFDF2F, 1);
            class637.field8871 = class469.method2767(false, 2, arg0 ^ 0xFFFFDF2F, 1);
            class415.field5964 = class469.method2767(false, 3, 8379, 1);
            class11.field175 = class469.method2767(false, 4, 8379, 1);
            class587.field7828 = class469.method2767(true, 5, 8379, 1);
            class177.field2367 = class469.method2767(true, 6, 8379, 1);
            class237.field3203 = class469.method2767(false, 7, 8379, 1);
            class176.field2352 = class469.method2767(false, 9, 8379, 1);
            class586.field7805 = class469.method2767(false, 10, arg0 + 8487, 1);
            class183.field2444 = class469.method2767(false, 11, arg0 + 8487, 1);
            class383.field5606 = class469.method2767(false, 12, arg0 ^ 0xFFFFDF2F, 1);
            class396.field5819 = class469.method2767(false, 14, arg0 + 8487, 1);
            class344.field5072 = class469.method2767(false, 15, arg0 ^ 0xFFFFDF2F, 1);
            class281.field4150 = class469.method2767(false, 16, 8379, 1);
            class473.field6529 = class469.method2767(false, 17, 8379, 1);
            class108.field1492 = class469.method2767(false, 18, 8379, 1);
            class262.field3891 = class469.method2767(false, 19, 8379, 1);
            class33.field530 = class469.method2767(false, 20, 8379, 1);
            class598.field8141 = class469.method2767(false, 21, arg0 + 8487, 1);
            class554.field7478 = class469.method2767(false, 22, 8379, 1);
            class466.field6466 = class469.method2767(true, 23, 8379, 1);
            class461.field6394 = class469.method2767(false, 24, 8379, 1);
            class583.field7790 = class469.method2767(false, 25, 8379, 1);
            class16.field241 = class469.method2767(true, 26, 8379, 1);
            class219.field2911 = class469.method2767(false, 27, 8379, 1);
            class162.field2210 = class469.method2767(true, 28, 8379, 1);
            class138.field2009 = class469.method2767(false, 29, 8379, 1);
            class437.field6160 = class469.method2767(true, 30, 8379, 1);
            class482.field6667 = class469.method2767(true, 31, 8379, 1);
            class134.field1966 = class469.method2767(true, 36, arg0 ^ 0xFFFFDF2F, 2);
        }
        if (class292.field4270 == class21.field319) {
            int var18 = 0;
            for (int var19 = 0; var19 < 37; var19++) {
                if (class391.field5761[var19] != null) {
                    var18 += class391.field5761[var19].method1971(arg0 ^ 0x14) * class485.field6701[var19] / 100;
                }
            }
            if (var18 != 100) {
                if (class103.field1424 < 0) {
                    class103.field1424 = var18;
                }
                return (var18 - class103.field1424) * 100 / (100 - class103.field1424);
            }
            class46.method352(class643.field8927, 0);
            class462.method2738(class781.field10716, class302.method1908(false), class643.field8927, (byte) 77);
        }
        if (class292.field4270 == class21.field320) {
            if (class544.field7379 == -1) {
                class544.field7379 = class177.field2367.method2092("scape main", false);
            }
            class108.method821(arg0 ^ 0xFFFFC0BB);
            class300.method1901(2, 2);
        }
        if (class292.field4270 == class21.field321) {
            class89.method721(class730.field10124, 109, class437.field6160);
        }
        if (class292.field4270 == class21.field322) {
            int var20 = class121.method995(arg0 + 189);
            if (var20 < 100) {
                return var20;
            }
            class193.method1332(arg0 + 108, class162.field2210.method2114(1, false));
            class526.method3036(1412, class162.field2210.method2114(3, false));
            class700.field9832 = new class734(class162.field2210);
        }
        if (class292.field4270 == class21.field323) {
            if (class207.field2711 != -1 && !class237.field3203.method2120(-5241, 0, class207.field2711)) {
                return 99;
            }
            class691.field9695 = new class629(class16.field241, class176.field2352, class643.field8927);
            class206.field2703 = new class701(class21.field332, class38.field589, class637.field8871);
            class719.field10024 = new class334(class21.field332, class38.field589, class637.field8871, class700.field9832);
            class93.field1329 = new class772(class21.field332, class38.field589, class637.field8871, class643.field8927);
            class446.field6253 = new class519(class21.field332, class38.field589, class473.field6529);
            class298.field4317 = new class186(class21.field332, class38.field589, class637.field8871);
            class473.field6534 = new class372(class21.field332, class38.field589, class637.field8871);
            class493.field6825 = new class773(class21.field332, class38.field589, class637.field8871, class643.field8927);
            class381.field5566 = new class158(class21.field332, class38.field589, class637.field8871, class237.field3203);
            class744.field10278 = new class366(class21.field332, class38.field589, class637.field8871);
            class723.field10061 = new class740(class21.field332, class38.field589, class637.field8871);
            class350.field5132 = new class671(class21.field332, class38.field589, true, class281.field4150, class237.field3203);
            class495.field6846 = new class354(class21.field332, class38.field589, class637.field8871, class643.field8927);
            class159.field2194 = new class54(class21.field332, class38.field589, class637.field8871, class643.field8927);
            class364.field5309 = new class601(class21.field332, class38.field589, true, class108.field1492, class237.field3203);
            class770.field10602 = new class389(class21.field332, class38.field589, true, class206.field2703, class262.field3891, class237.field3203);
            class564.field7557 = new class586(class21.field332, class38.field589, class637.field8871);
            class6.field65 = new class127(class21.field332, class38.field589, class33.field530, class74.field1100, class651.field9035);
            class457.field6339 = new class100(class21.field332, class38.field589, class637.field8871);
            class563.field7548 = new class363(class21.field332, class38.field589, class637.field8871);
            class784.field10798 = new class709(class21.field332, class38.field589, class598.field8141, class237.field3203);
            class273.field4057 = new class415(class21.field332, class38.field589, class637.field8871);
            class499.field6888 = new class541(class21.field332, class38.field589, class637.field8871);
            class362.field5282 = new class40(class21.field332, class38.field589, class637.field8871);
            class642.field8904 = new class582(class21.field332, class38.field589, class554.field7478);
            class488.field6763 = new class343(class21.field332, class38.field589, class637.field8871);
            class89.field1234 = new class672(class21.field332, class38.field589, class637.field8871);
            class467.method2757(class781.field10716, class643.field8927, class415.field5964, -101, class237.field3203);
            class292.method1845(class138.field2009, -83);
            class191.field2543 = new class300(class38.field589, class461.field6394, class583.field7790);
            class445.field6245 = new class69(class38.field589, class461.field6394, class583.field7790, new class402());
            class677.method3750((byte) 65);
            class350.field5132.method3733(11, class712.field9959.field1320.method4251(120) == 0);
            class382.field5602 = new class361();
            class686.method3808(false);
            class329.method2077((byte) -71, class219.field2911);
            class203.method1372(arg0 + 108, class237.field3203, class691.field9695);
            class619 var21 = new class619(class586.field7805.method2111("huffman", "", 3));
            class296.method1884(-18, var21);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class89.field1236 = class320.method2034((byte) 76);
            class693.field9717 = new class34(true, class730.field10124);
        }
        if (class292.field4270 == class21.field325) {
            int var22 = class584.method3250(class643.field8927, arg0 ^ 0x6B) + class74.method660(true, (byte) -14);
            int var23 = class485.method2815(16) + class603.method3353(true);
            if (var23 > var22) {
                return var22 * 100 / var23;
            }
        }
        if (class292.field4270 == class21.field326) {
            class375.method2329(class466.field6466, class298.field4317, class473.field6534, class350.field5132, class495.field6846, class159.field2194, class382.field5602);
        }
        if (class292.field4270 == class21.field327) {
            class700.field9825 = new int[class362.field5282.field632];
            class41.field642 = new String[class499.field6888.field7350];
            class197.field2639 = new boolean[class362.field5282.field632];
            for (int var24 = 0; var24 < class362.field5282.field632; var24++) {
                if (class362.field5282.method276(109, var24).field7172 == 0) {
                    class197.field2639[var24] = true;
                    class637.field8869++;
                }
                class700.field9825[var24] = -1;
            }
            class132.method1052(4);
            class739.field10206 = class415.field5964.method2092("loginscreen", false);
            class604.field8207 = class415.field5964.method2092("lobbyscreen", false);
            class587.field7828.method2096(true, 82, false);
            class177.field2367.method2096(true, 123, true);
            class643.field8927.method2096(true, 36, true);
            class781.field10716.method2096(true, 83, true);
            class586.field7805.method2096(true, 104, true);
            class415.field5964.method2096(true, 36, true);
            class637.field8871.field4844 = 2;
            class540.field7347 = true;
            class473.field6529.field4844 = 2;
            class281.field4150.field4844 = 2;
            class108.field1492.field4844 = 2;
            class262.field3891.field4844 = 2;
            class33.field530.field4844 = 2;
            class598.field8141.field4844 = 2;
        }
        if (class292.field4270 == class21.field328) {
            if (!class768.method4253(arg0 + 105, class739.field10206)) {
                return 0;
            }
            boolean var25 = true;
            for (int var26 = 0; var26 < class111.field1528[class739.field10206].length; var26++) {
                class668 var27 = class111.field1528[class739.field10206][var26];
                if (var27.field9353 == 5 && var27.field9277 != -1 && !class643.field8927.method2120(-5241, 0, var27.field9277)) {
                    var25 = false;
                }
            }
            if (!var25) {
                return 0;
            }
        }
        if (class292.field4270 == class21.field329) {
            class713.method3987(true, (byte) -94);
        }
        if (class292.field4270 == class21.field330) {
            class209.field2778.method4269(-1);
            try {
                class644.field8950.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class691.field9687 = null;
            class273.field4059 = null;
            class644.field8950 = null;
            class355.field5205 = null;
            class209.field2778 = null;
            class457.field6338 = null;
            class782.method4320((byte) -111);
            class341.field4919 = class712.field9959.field1306.method1477(37) == 1;
            class712.field9959.method735(1, class712.field9959.field1306, 81);
            if (class341.field4919) {
                class712.field9959.method735(0, class712.field9959.field1299, arg0 ^ 0xFFFFFFF8);
            } else if (class712.field9959.field1299.field10658 && class693.field9717.field550 < 512 && class693.field9717.field550 != 0) {
                class712.field9959.method735(0, class712.field9959.field1299, 101);
            }
            class617.method3389(false);
            if (class341.field4919) {
                class793.method4365((byte) -41, false, 0);
            } else {
                class793.method4365((byte) -41, false, class712.field9959.field1299.method4293(94));
            }
            class142.method1090(-1, -352753888, class712.field9959.field1277.method1299(26), -1, false);
            class183.method1272((byte) 127, class379.field5542);
            class652.method3634(-1719661332, class379.field5542);
            class312.method1959(class379.field5542, class643.field8927, -127);
            class267.method1745(class416.field5975, arg0 + 109);
        }
        return class6.method44((byte) -122);
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(III)I")
    public static final int method1832(int arg0, int arg1, int arg2) {
        field4236++;
        return ~arg2 == arg0 || arg2 == 3 ? class475.field6608[arg1 & 0x3] : class555.field7489[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "([IZ[Ljava/lang/String;)V")
    public static final void method1833(int[] arg0, boolean arg1, String[] arg2) {
        if (arg1) {
            field4235++;
            class7.method48(0, arg2, arg0, arg2.length - 1, 1);
        }
    }

    @OriginalMember(owner = "client!tja", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4237++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tja", name = "<init>", descriptor = "(II)V")
    public class288(int arg0, int arg1) {
    }
}
