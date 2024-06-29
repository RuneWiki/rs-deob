import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class679 extends class333 {

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public int field9562 = -1;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "Z")
    public boolean field9570 = false;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "Ljava/lang/String;")
    public static String field9566 = null;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public int field9560;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field9561;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public int field9563;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public int field9564;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field9565;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public static int field9567;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public int field9568;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public static int field9569;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
    public static int field9571;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    public int field9572;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)I")
    public static final int method3764(int arg0) {
        if (!class639.field9075.field6807) {
            for (int var1 = 0; var1 < class557.field7953; var1++) {
                if (class537.field7551[var1].method868(10943) == 's' || class537.field7551[var1].method868(10943) == 'S') {
                    class639.field9075.field6807 = true;
                    break;
                }
            }
        }
        field9565++;
        if (class512.field7343 == class27.field260) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class557.method3157(-108);
            if (class255.field3201 == 0L) {
                class255.field3201 = var4;
            }
            if (var3 > 16384 && (var4 - class255.field3201) < 5000L) {
                if (var4 - class638.field9065 > 1000L) {
                    System.gc();
                    class638.field9065 = var4;
                }
                return 0;
            }
        }
        if (class512.field7343 == class27.field262) {
            if (class228.field2831 == null) {
                class228.field2831 = new class494(class510.field7323, class705.field9906, class639.field9073, class355.field4774);
            }
            if (!class228.field2831.method2860(true)) {
                return 0;
            }
            class309.method1771(17734, null, 0);
            class194.field2250 = !class123.method708(40);
            class597.field8400 = class145.method801(1, 1000000, false, class194.field2250 ? 34 : 32);
            class697.field9787 = class145.method801(1, arg0 ^ 0xF4241, false, 33);
            class573.field8139 = class145.method801(1, arg0 ^ 0xF4241, false, 13);
        }
        if (class512.field7343 == class27.field263) {
            class697.field9787.method3861((byte) 14);
            int var6 = class578.field8187[33].method1156((byte) 93);
            int var7 = var6 + class578.field8187[class194.field2250 ? 34 : 32].method1156((byte) -115);
            int var8 = var7 + class578.field8187[13].method1156((byte) -112);
            int var9 = var8 + class697.field9787.method3878((byte) -1);
            if (var9 != 400) {
                return var9 / 4;
            }
            class189.field2171 = class597.field8400.method3851(false);
            class286.field3576 = class697.field9787.method3851(false);
            class119.method694(arg0 ^ 0x1, class597.field8400);
            int var10 = class639.field9075.field6761;
            class378.field5124 = new class560(class246.field3031, class504.field7267, class697.field9787);
            int[] var11 = class378.field5124.method3178(var10, arg0 - 40);
            class428 var12 = new class428(class597.field8400, class573.field8139);
            if (var11.length > 0) {
                class56.field560 = new class525[var11.length];
                for (int var13 = 0; var13 < class56.field560.length; var13++) {
                    class56.field560[var13] = new class474(class378.field5124.method3179(var11[var13], 5234), var12);
                }
            }
        }
        if (class512.field7343 == class27.field264) {
            class406.method2276(class573.field8139, 4, class483.method2794((byte) -5), class597.field8400);
        }
        if (arg0 != 1) {
            return -1;
        }
        if (class512.field7343 == class27.field265) {
            int var14 = class311.method1784(-18416);
            int var15 = class573.method3240(1);
            if (var14 < var15) {
                return var14 * 100 / var15;
            }
        }
        if (class512.field7343 == class27.field266) {
            if (class56.field560 != null && class56.field560.length > 0) {
                if (class56.field560[0].method2455(true) < 100) {
                    return 0;
                }
                if (class56.field560.length > 1 && class378.field5124.method3177(11690) && class56.field560[1].method2455(true) < 100) {
                    return 0;
                }
            }
            class573.method3239(class701.field9813, false);
            class103.method558(class701.field9813, (byte) 55);
            class585.method3308(1, 22731);
        }
        if (class512.field7343 == class27.field267) {
            for (int var16 = 0; var16 < 4; var16++) {
                class282.field3534[var16] = class467.method2691(class142.field1574, (byte) 91, class140.field1550);
            }
        }
        if (class512.field7343 == class27.field268) {
            class408.field5441 = class145.method801(1, arg0 + 999999, false, 8);
            class249.field3088 = class145.method801(1, 1000000, false, 0);
            class611.field8610 = class145.method801(1, 1000000, false, 1);
            class388.field5257 = class145.method801(1, 1000000, false, 2);
            class611.field8606 = class145.method801(1, 1000000, false, 3);
            class392.field5317 = class145.method801(1, 1000000, false, 4);
            class280.field3475 = class145.method801(1, 1000000, true, 5);
            class536.field7504 = class145.method801(1, 1000000, true, 6);
            class436.field6155 = class145.method801(1, 1000000, false, 7);
            class490.field7122 = class145.method801(1, 1000000, false, 9);
            class6.field76 = class145.method801(1, 1000000, false, 10);
            class246.field3047 = class145.method801(1, 1000000, false, 11);
            class637.field8971 = class145.method801(1, arg0 ^ 0xF4241, false, 12);
            class461.field6558 = class145.method801(1, 1000000, false, 14);
            class164.field1828 = class145.method801(1, 1000000, false, 15);
            class240.field2973 = class145.method801(1, 1000000, false, 16);
            class662.field9281 = class145.method801(1, 1000000, false, 17);
            class364.field4874 = class145.method801(1, 1000000, false, 18);
            class483.field6974 = class145.method801(1, 1000000, false, 19);
            class196.field2269 = class145.method801(1, 1000000, false, 20);
            class671.field9346 = class145.method801(1, 1000000, false, 21);
            class361.field4839 = class145.method801(1, 1000000, false, 22);
            class178.field1989 = class145.method801(1, 1000000, true, 23);
            class624.field8827 = class145.method801(1, 1000000, false, 24);
            class617.field8703 = class145.method801(1, 1000000, false, 25);
            class220.field2624 = class145.method801(1, 1000000, true, 26);
            class604.field8491 = class145.method801(1, 1000000, false, 27);
            class247.field3053 = class145.method801(1, 1000000, true, 28);
            class677.field9499 = class145.method801(1, 1000000, false, 29);
            class266.field3321 = class145.method801(1, arg0 + 999999, true, 30);
            class560.field7998 = class145.method801(1, 1000000, true, 31);
        }
        if (class512.field7343 == class27.field269) {
            int var17 = 0;
            for (int var18 = 0; var18 < 35; var18++) {
                if (class578.field8187[var18] != null) {
                    var17 += class578.field8187[var18].method1156((byte) 60) * class638.field9056[var18] / 100;
                }
            }
            if (var17 != 100) {
                if (class80.field833 < 0) {
                    class80.field833 = var17;
                }
                return (var17 - class80.field833) * 100 / (100 - class80.field833);
            }
            class635.method3573(0, class408.field5441);
            class406.method2276(class573.field8139, 4, class483.method2794((byte) -5), class408.field5441);
        }
        if (class512.field7343 == class27.field270) {
            class32.method165(1);
            class585.method3308(2, 22731);
        }
        if (class512.field7343 == class27.field271) {
            class102.method554(class353.field4757, class266.field3321, 52);
        }
        if (class512.field7343 == class27.field272) {
            int var19 = class424.method2443(-31481);
            if (var19 < 100) {
                return var19;
            }
            class479.method2759(27, class247.field3053.method3859((byte) 126, 1));
            class151.method821(class247.field3053.method3859((byte) 114, 3), arg0 + 29);
        }
        if (class512.field7343 == class27.field273) {
            if (class415.field5567 != -1 && !class436.field6155.method3860(0, (byte) -99, class415.field5567)) {
                return 99;
            }
            class79.field801 = new class26(class220.field2624, class490.field7122, class408.field5441);
            class53.field531 = new class264(class246.field3031, class504.field7267, class388.field5257);
            class400.field5381 = new class373(class246.field3031, class504.field7267, class388.field5257);
            class693.field9725 = new class427(class246.field3031, class504.field7267, class388.field5257, class408.field5441);
            class442.field6236 = new class526(class246.field3031, class504.field7267, class662.field9281);
            class156.field1748 = new class268(class246.field3031, class504.field7267, class388.field5257);
            class573.field8132 = new class153(class246.field3031, class504.field7267, class388.field5257);
            class508.field7303 = new class519(class246.field3031, class504.field7267, class388.field5257, class436.field6155);
            class552.field7888 = new class501(class246.field3031, class504.field7267, class388.field5257);
            class211.field2553 = new class486(class246.field3031, class504.field7267, class388.field5257);
            class364.field4891 = new class365(class246.field3031, class504.field7267, true, class240.field2973, class436.field6155);
            class247.field3060 = new class122(class246.field3031, class504.field7267, class388.field5257, class408.field5441);
            class689.field9695 = new class184(class246.field3031, class504.field7267, class388.field5257, class408.field5441);
            class369.field5055 = new class63(class246.field3031, class504.field7267, true, class364.field4874, class436.field6155);
            class19.field153 = new class53(class246.field3031, class504.field7267, true, class53.field531, class483.field6974, class436.field6155);
            class600.field8445 = new class173(class246.field3031, class504.field7267, class388.field5257);
            class265.field3301 = new class541(class246.field3031, class504.field7267, class196.field2269, class249.field3088, class611.field8610);
            class66.field669 = new class435(class246.field3031, class504.field7267, class388.field5257);
            class328.field4021 = new class228(class246.field3031, class504.field7267, class388.field5257);
            class63.field654 = new class380(class246.field3031, class504.field7267, class671.field9346, class436.field6155);
            class304.field3768 = new class183(class246.field3031, class504.field7267, class388.field5257);
            class186.field2113 = new class591(class246.field3031, class504.field7267, class388.field5257);
            class462.field6572 = new class146(class246.field3031, class504.field7267, class388.field5257);
            class259.field3254 = new class697(class246.field3031, class504.field7267, class361.field4839);
            class624.field8826 = new class665(class246.field3031, class504.field7267, class388.field5257);
            class639.method3601(class611.field8606, class408.field5441, class436.field6155, class573.field8139, false);
            class153.method833((byte) 124, class677.field9499);
            class598.field8428 = new class444(class504.field7267, class624.field8827, class617.field8703);
            class83.field859 = new class386(class504.field7267, class624.field8827, class617.field8703, new class250());
            class401.method2258(arg0 - 1);
            class364.field4891.method2137(4, !class639.field9075.method2641(class430.field6109, (byte) 34));
            class628.field8859 = new class296();
            class114.method609(106);
            class487.method2812(0, class604.field8491);
            class196.method1188(class436.field6155, class79.field801, 0);
            class584 var20 = new class584(class6.field76.method3862("", "huffman", (byte) -122));
            class329.method1851((byte) 106, var20);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class386.field5208 = class465.method2687(arg0 + 72);
        }
        if (class512.field7343 == class27.field275) {
            int var21 = class480.method2762(class408.field5441, -4569) + class26.method148((byte) 115, true);
            int var22 = class442.method2562(arg0 ^ 0x11) + class573.method3240(1);
            if (var21 < var22) {
                return var21 * 100 / var22;
            }
        }
        if (class512.field7343 == class27.field276) {
            class482.method2780(class178.field1989, class156.field1748, class573.field8132, class364.field4891, class247.field3060, class689.field9695, class628.field8859);
        }
        if (class512.field7343 == class27.field277) {
            class588.field8319 = new boolean[class462.field6572.field1614];
            class53.field535 = new String[class186.field2113.field8346];
            class371.field5066 = new int[class462.field6572.field1614];
            for (int var23 = 0; var23 < class462.field6572.field1614; var23++) {
                if (class462.field6572.method802(var23, arg0 ^ 0xFFFFFF83).field4803 == 0) {
                    class588.field8319[var23] = true;
                    class638.field9019++;
                }
                class371.field5066[var23] = -1;
            }
            class662.method3681((byte) -64);
            class213.field2598 = class611.field8606.method3875("loginscreen", (byte) -70);
            class246.field3035 = class611.field8606.method3875("lobbyscreen", (byte) -75);
            class280.field3475.method3850(true, false, (byte) 85);
            class536.field7504.method3850(true, true, (byte) 107);
            class408.field5441.method3850(true, true, (byte) 64);
            class573.field8139.method3850(true, true, (byte) 41);
            class6.field76.method3850(true, true, (byte) 104);
            class611.field8606.method3850(true, true, (byte) 83);
            class671.field9344 = true;
            class388.field5257.field9837 = 2;
            class662.field9281.field9837 = 2;
            class240.field2973.field9837 = 2;
            class364.field4874.field9837 = 2;
            class483.field6974.field9837 = 2;
            class196.field2269.field9837 = 2;
            class671.field9346.field9837 = 2;
        }
        if (class512.field7343 == class27.field278) {
            if (!class255.method1506(class213.field2598, (byte) 113)) {
                return 0;
            }
            for (int var24 = 0; var24 < class102.field1106[class213.field2598].length; var24++) {
                class452 var25 = class102.field1106[class213.field2598][var24];
                if (var25.field6471 == 5 && var25.field6418 != -1) {
                    var25.method2604((byte) 103, class701.field9813);
                }
            }
        }
        if (class512.field7343 == class27.field279) {
            for (int var26 = 0; var26 < class102.field1106[class213.field2598].length; var26++) {
                class452 var27 = class102.field1106[class213.field2598][var26];
                if (var27.field6471 == 5 && var27.field6418 != -1 && var27.method2604((byte) 103, class701.field9813) == null && class552.field7890) {
                    return 0;
                }
            }
        }
        if (class512.field7343 == class27.field280) {
            class389.method2215(8, true);
        }
        if (class512.field7343 == class27.field281) {
            class203.field2404.method3099((byte) 85);
            try {
                class648.field9137.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class56.field560 = null;
            class203.field2404 = null;
            class648.field9137 = null;
            class597.field8400 = null;
            class697.field9787 = null;
            class378.field5124 = null;
            class372.method2167((byte) -114);
            class499.field7219 = class639.field9075.field6807;
            class639.field9075.field6807 = true;
            class639.field9075.method2642(arg0 - 3, class353.field4757);
            if (class499.field7219) {
                class434.method2489(0, (byte) -14);
            } else {
                class434.method2489(class639.field9075.field6777, (byte) 51);
            }
            class103.method561(false, (byte) 15, -1, -1, class639.field9075.field6791);
            class573.method3239(class701.field9813, false);
            class103.method558(class701.field9813, (byte) 55);
            class305.method1759(class408.field5441, class701.field9813, -15499);
            class639.method3600(-126, class485.field6988);
        }
        return class654.method3638(2);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3765(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9571++;
        if (arg1 != 2) {
            method3764(20);
        }
        for (class397 var7 = (class397) class473.field6810.method1672((byte) 104); var7 != null; var7 = (class397) class473.field6810.method1669(-2747)) {
            if (class678.field9539 >= var7.field5368) {
                var7.method1821(78);
            } else {
                class130.method740(arg6, arg0, (var7.field5360 << 9) + 256, arg3 >> 1, var7.field5363 * 2, arg5 >> 1, var7.field5364, (var7.field5362 << 9) + 256, (byte) 4);
                class282.field3535.method2325(var7.field5358, var7.field5369 | 0xFF000000, arg1 ^ 0x4D029A4A, 0, class703.field9873[1] + arg4, class703.field9873[0] + arg2);
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZIIB)V")
    public static final void method3766(boolean arg0, int arg1, int arg2, byte arg3) {
        field9561++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        if (arg3 != 104) {
            field9567 = -126;
        }
        class224.field2776 = arg1;
        class60.field614 = arg0;
        class142.field1570 = arg2;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
    public static void method3767(int arg0) {
        if (arg0 != 1) {
            field9569 = -74;
        }
        field9566 = null;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(I)V")
    public class679(int arg0) {
        this.field9562 = arg0;
    }
}
