import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class170 {

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public int field2045 = 0;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field2043 = -1;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)I", line = 3)
    public static final int method1161(int arg0) {
        if (class118.field1503.field10634.method2096(0) == arg0) {
            for (int var1 = 0; var1 < class437.field5757; var1++) {
                if (class542.field7608[var1].method1453(1714) == 's' || class542.field7608[var1].method1453(1714) == 'S') {
                    class118.field1503.method4295(class118.field1503.field10634, 1, false);
                    class148.field1842 = true;
                    break;
                }
            }
        }
        field2044++;
        if (class757.field10482 == class26.field391) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class349.method2069(true);
            if (class362.field4510 == 0L) {
                class362.field4510 = var4;
            }
            if (var3 > 16384 && (var4 - class362.field4510) < 5000L) {
                if ((var4 - class28.field428) > 1000L) {
                    System.gc();
                    class28.field428 = var4;
                }
                return 0;
            }
        }
        if (class757.field10482 == class26.field392) {
            if (class458.field6463 == null) {
                class458.field6463 = new class286(class182.field2224, class531.field7485, class245.field2886, class513.field7242);
            }
            if (!class458.field6463.method1659(7631)) {
                return 0;
            }
            class711.method4027(true, null, 0, 0);
            class625.field8573 = !class5.method106((byte) 87);
            class603.field8148 = class569.method3291(false, 121, 1, class625.field8573 ? 34 : 32);
            class772.field10611 = class569.method3291(false, -117, 1, 33);
            class625.field8577 = class569.method3291(false, 123, 1, 13);
        }
        if (class757.field10482 == class26.field394) {
            boolean var6 = class772.field10611.method455(-3);
            int var7 = class267.field3150[33].method2235(28317);
            int var8 = var7 + class267.field3150[class625.field8573 ? 34 : 32].method2235(28317);
            int var9 = var8 + class267.field3150[13].method2235(28317);
            int var10 = var9 + (var6 ? 100 : class772.field10611.method439(-28929));
            if (var10 != 400) {
                return var10 / 4;
            }
            class581.field7924 = class603.field8148.method427(-107);
            class446.field6009 = class772.field10611.method427(-5);
            class473.method2822((byte) -86, class603.field8148);
            int var11 = class118.field1503.field10627.method3656(0);
            class12.field207 = new class423(class672.field9229, class770.field10592, class772.field10611);
            int[] var12 = class12.field207.method2532(var11, arg0);
            if (var12.length == 0) {
                var12 = class12.field207.method2532(0, arg0);
            }
            class704 var13 = new class704(class603.field8148, class625.field8577);
            if (var12.length > 0) {
                class616.field8286 = new class658[var12.length];
                for (int var14 = 0; var14 < class616.field8286.length; var14++) {
                    class616.field8286[var14] = new class212(class12.field207.method2531(var12[var14], class241.method1459(arg0, 74)), var13);
                }
            }
        }
        if (class757.field10482 == class26.field396) {
            class659.method3711(class625.field8577, class603.field8148, 10, class53.method477((byte) -125));
        }
        if (class757.field10482 == class26.field397) {
            int var15 = class179.method1210(arg0 ^ 0x7B);
            int var16 = class442.method2603((byte) -21);
            if (var15 < var16) {
                return var15 * 100 / var16;
            }
        }
        if (class757.field10482 == class26.field398) {
            if (class616.field8286 != null && class616.field8286.length > 0) {
                if (class616.field8286[0].method281(false) < 100) {
                    return 0;
                }
                if (class616.field8286.length > 1 && class12.field207.method2533(true) && class616.field8286[1].method281(false) < 100) {
                    return 0;
                }
            }
            class402.method2351(0, class363.field4526);
            class213.method1342(class363.field4526, (byte) 48);
            class48.method454(1, -1);
        }
        if (class757.field10482 == class26.field399) {
            for (int var17 = 0; var17 < 4; var17++) {
                class633.field8649[var17] = class226.method1385(class596.field8090, class107.field1350, -26);
            }
        }
        if (class757.field10482 == class26.field400) {
            class208.field2470 = class569.method3291(false, 125, 1, 8);
            class210.field2495 = class569.method3291(false, 121, 1, 0);
            class227.field2659 = class569.method3291(false, arg0 + 121, 1, 1);
            class483.field6745 = class569.method3291(false, 123, 1, 2);
            class503.field7120 = class569.method3291(false, arg0 ^ 0x7A, 1, 3);
            class257.field3050 = class569.method3291(false, 123, 1, 4);
            class340.field4208 = class569.method3291(true, arg0 ^ 0xFFFFFFD7, 1, 5);
            class599.field8106 = class569.method3291(true, 121, 1, 6);
            class733.field10257 = class569.method3291(false, -102, 1, 7);
            class36.field541 = class569.method3291(false, 122, 1, 9);
            class514.field7247 = class569.method3291(false, 126, 1, 10);
            class385.field4939 = class569.method3291(false, -28, 1, 11);
            class251.field2945 = class569.method3291(false, 54, 1, 12);
            class709.field9956 = class569.method3291(false, 123, 1, 14);
            class4.field48 = class569.method3291(false, 49, 1, 15);
            class392.field5080 = class569.method3291(false, 121, 1, 16);
            class691.field9407 = class569.method3291(false, -16, 1, 17);
            class410.field5375 = class569.method3291(false, -74, 1, 18);
            class481.field6728 = class569.method3291(false, 123, 1, 19);
            class53.field720 = class569.method3291(false, 5, 1, 20);
            class277.field3243 = class569.method3291(false, 123, 1, 21);
            class512.field7239 = class569.method3291(false, arg0 + 122, 1, 22);
            class132.field1645 = class569.method3291(true, -49, 1, 23);
            class410.field5372 = class569.method3291(false, 123, 1, 24);
            class85.field1137 = class569.method3291(false, -126, 1, 25);
            class195.field2336 = class569.method3291(true, 127, 1, 26);
            class497.field6954 = class569.method3291(false, arg0 - 35, 1, 27);
            class318.field3910 = class569.method3291(true, -83, 1, 28);
            class747.field10371 = class569.method3291(false, -67, 1, 29);
            class459.field6470 = class569.method3291(true, 124, 1, 30);
            class519.field7331 = class569.method3291(true, -88, 1, 31);
            class466.field6519 = class569.method3291(true, -63, 2, 36);
        }
        if (class757.field10482 == class26.field401) {
            int var18 = 0;
            for (int var19 = 0; var19 < 37; var19++) {
                if (class267.field3150[var19] != null) {
                    var18 += class267.field3150[var19].method2235(arg0 + 28317) * class400.field5225[var19] / 100;
                }
            }
            if (var18 != 100) {
                if (class695.field9480 < 0) {
                    class695.field9480 = var18;
                }
                return (var18 - class695.field9480) * 100 / (100 - class695.field9480);
            }
            class35.method318(arg0 ^ 0x76, class208.field2470);
            class659.method3711(class625.field8577, class208.field2470, 10, class53.method477((byte) -128));
        }
        if (class757.field10482 == class26.field402) {
            if (class500.field6981 == -1) {
                class500.field6981 = class599.field8106.method450((byte) 110, "scape main");
            }
            class484.method2871(107);
            class48.method454(2, -1);
        }
        if (class757.field10482 == class26.field403) {
            class488.method2896(class521.field7389, false, class459.field6470);
        }
        if (class757.field10482 == class26.field404) {
            int var20 = class567.method3268((byte) 69);
            if (var20 < 100) {
                return var20;
            }
            class436.method2575(class318.field3910.method453(1, 11040), -96);
            class578.method3333((byte) -30, class318.field3910.method453(3, arg0 ^ 0x2B20));
            class741.field10313 = new class151(class318.field3910);
        }
        if (class757.field10482 == class26.field405) {
            if (class792.field10888 != -1 && !class733.field10257.method443(0, class792.field10888, true)) {
                return 99;
            }
            class323.field4014 = new class187(class195.field2336, class36.field541, class208.field2470);
            class113.field1426 = new class790(class672.field9229, class770.field10592, class483.field6745);
            class249.field2932 = new class229(class672.field9229, class770.field10592, class483.field6745, class741.field10313);
            class5.field63 = new class414(class672.field9229, class770.field10592, class483.field6745, class208.field2470);
            class39.field569 = new class92(class672.field9229, class770.field10592, class691.field9407);
            class65.field887 = new class614(class672.field9229, class770.field10592, class483.field6745);
            class100.field1304 = new class165(class672.field9229, class770.field10592, class483.field6745);
            class607.field8173 = new class476(class672.field9229, class770.field10592, class483.field6745, class208.field2470);
            class692.field9423 = new class517(class672.field9229, class770.field10592, class483.field6745, class733.field10257);
            class425.field5639 = new class544(class672.field9229, class770.field10592, class483.field6745);
            class520.field7343 = new class473(class672.field9229, class770.field10592, class483.field6745);
            class379.field4811 = new class750(class672.field9229, class770.field10592, true, class392.field5080, class733.field10257);
            class2.field33 = new class733(class672.field9229, class770.field10592, class483.field6745, class208.field2470);
            class495.field6886 = new class293(class672.field9229, class770.field10592, class483.field6745, class208.field2470);
            class444.field5956 = new class148(class672.field9229, class770.field10592, true, class410.field5375, class733.field10257);
            class121.field1555 = new class486(class672.field9229, class770.field10592, true, class113.field1426, class481.field6728, class733.field10257);
            class500.field7002 = new class320(class672.field9229, class770.field10592, class483.field6745);
            class362.field4504 = new class644(class672.field9229, class770.field10592, class53.field720, class210.field2495, class227.field2659);
            class153.field1907 = new class185(class672.field9229, class770.field10592, class483.field6745);
            class305.field3675 = new class651(class672.field9229, class770.field10592, class483.field6745);
            class740.field10303 = new class245(class672.field9229, class770.field10592, class277.field3243, class733.field10257);
            class347.field4336 = new class141(class672.field9229, class770.field10592, class483.field6745);
            class439.field5859 = new class179(class672.field9229, class770.field10592, class483.field6745);
            class708.field9940 = new class466(class672.field9229, class770.field10592, class483.field6745);
            class687.field9368 = new class749(class672.field9229, class770.field10592, class512.field7239);
            class116.field1481 = new class445(class672.field9229, class770.field10592, class483.field6745);
            class204.field2444 = new class627(class672.field9229, class770.field10592, class483.field6745);
            class340.method2014(class733.field10257, class625.field8577, class208.field2470, class503.field7120, arg0 ^ 0xFFFFF16E);
            class633.method3572(class747.field10371, 4);
            class776.field10716 = new class455(class770.field10592, class410.field5372, class85.field1137);
            class578.field7881 = new class127(class770.field10592, class410.field5372, class85.field1137, new class751());
            class608.method3453(0);
            class379.field4811.method4196((byte) -47, class118.field1503.field10632.method3881(0) == 0);
            class2.field30 = new class589();
            class725.method4110((byte) 114);
            class468.method2798(class497.field6954, (byte) 32);
            class462.method2786(class733.field10257, -21044, class323.field4014);
            class32 var21 = new class32(class514.field7247.method436("huffman", arg0 ^ 0xFFFFF1CB, ""));
            class447.method2636(arg0 ^ 0xFFFFFFF9, var21);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class253.field2957 = class371.method2171((byte) 84);
            class174.field2151 = new class78(true, class521.field7389);
        }
        if (class757.field10482 == class26.field407) {
            int var22 = class208.method1316(class208.field2470, 200) + class57.method498(0, true);
            int var23 = class241.method1456(-127) + class442.method2603((byte) -21);
            if (var23 > var22) {
                return var22 * 100 / var23;
            }
        }
        if (class757.field10482 == class26.field408) {
            class9.method164(class132.field1645, class65.field887, class100.field1304, class379.field4811, class2.field33, class495.field6886, class2.field30);
        }
        if (class757.field10482 == class26.field409) {
            class733.field10244 = new String[class439.field5859.field2200];
            class480.field6716 = new int[class708.field9940.field6524];
            class307.field3801 = new boolean[class708.field9940.field6524];
            for (int var24 = 0; var24 < class708.field9940.field6524; var24++) {
                if (class708.field9940.method2795(arg0 + 123, var24).field7215 == 0) {
                    class307.field3801[var24] = true;
                    class248.field2915++;
                }
                class480.field6716[var24] = -1;
            }
            class507.method3041(39);
            class72.field994 = class503.field7120.method450((byte) 97, "loginscreen");
            class209.field2480 = class503.field7120.method450((byte) 86, "lobbyscreen");
            class340.field4208.method457(false, true, 122);
            class599.field8106.method457(true, true, 97);
            class208.field2470.method457(true, true, arg0 ^ 0x46);
            class625.field8577.method457(true, true, 102);
            class514.field7247.method457(true, true, 49);
            class503.field7120.method457(true, true, 72);
            class483.field6745.field670 = 2;
            class532.field7498 = true;
            class691.field9407.field670 = 2;
            class392.field5080.field670 = 2;
            class410.field5375.field670 = 2;
            class481.field6728.field670 = 2;
            class53.field720.field670 = 2;
            class277.field3243.field670 = 2;
        }
        if (class757.field10482 == class26.field410) {
            if (!class647.method3652(class72.field994, 0)) {
                return 0;
            }
            boolean var25 = true;
            for (int var26 = 0; var26 < class316.field3880[class72.field994].length; var26++) {
                class620 var27 = class316.field3880[class72.field994][var26];
                if (var27.field8371 == 5 && var27.field8358 != -1 && !class208.field2470.method443(0, var27.field8358, true)) {
                    var25 = false;
                }
            }
            if (!var25) {
                return 0;
            }
        }
        if (class757.field10482 == class26.field411) {
            class656.method3705((byte) -50, true);
        }
        if (class757.field10482 == class26.field412) {
            class691.field9417.method3647((byte) -55);
            try {
                class462.field6488.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class772.field10611 = null;
            class12.field207 = null;
            class691.field9417 = null;
            class603.field8148 = null;
            class616.field8286 = null;
            class462.field6488 = null;
            class262.method1570((byte) -67);
            class251.field2946 = class118.field1503.field10634.method2096(0) == 1;
            class118.field1503.method4295(class118.field1503.field10634, 1, false);
            if (class251.field2946) {
                class118.field1503.method4295(class118.field1503.field10653, 0, false);
            } else if (class118.field1503.field10653.field3948 && class174.field2151.field1067 < 512 && class174.field2151.field1067 != 0) {
                class118.field1503.method4295(class118.field1503.field10653, 0, false);
            }
            class14.method194(true);
            if (class251.field2946) {
                class677.method3810(true, 0, false);
            } else {
                class677.method3810(true, class118.field1503.field10653.method1903(0), false);
            }
            class121.method947(class118.field1503.field10674.method3823(0), -1, -1, 1, false);
            class402.method2351(0, class363.field4526);
            class213.method1342(class363.field4526, (byte) 48);
            class229.method1416(class208.field2470, class363.field4526, false);
            class531.method3163(class388.field5008, -25468);
        }
        return class39.method334(false);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZLes;)V", line = 455)
    private final void method1162(int arg0, boolean arg1, class403 arg2) {
        field2041++;
        if (arg0 == 5) {
            this.field2045 = arg2.method2390((byte) 77);
        }
        if (!arg1) {
            field2043 = 1;
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V", line = 476)
    public static final void method1163(int arg0) {
        for (class96 var1 = (class96) class477.field6625.method2725(37); var1 != null; var1 = (class96) class477.field6625.method2726(-116)) {
            if (var1.field1250) {
                var1.method836(66);
            }
        }
        field2042++;
        class96 var2 = (class96) class599.field8109.method2725(37);
        if (arg0 != -20072) {
            method1161(105);
        }
        while (var2 != null) {
            if (var2.field1250) {
                var2.method836(arg0 ^ 0xFFFFB1A6);
            }
            var2 = (class96) class599.field8109.method2726(-114);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Les;Z)V", line = 510)
    public final void method1164(class403 arg0, boolean arg1) {
        field2040++;
        if (arg1) {
            return;
        }
        while (true) {
            int var3 = arg0.method2396((byte) 127);
            if (var3 == 0) {
                return;
            }
            this.method1162(var3, !arg1, arg0);
        }
    }
}
