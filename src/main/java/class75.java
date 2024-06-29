import jagex3.jagmisc.jagmisc;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class75 {

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    private int field884;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "Lin;")
    public static class223 field887 = new class223(16);

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field890 = 0;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "[[F")
    public static float[][] field891 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)V", line = 13)
    public static final void method409(boolean arg0, int arg1) {
        field888++;
        class149.field2000 = 1000000000L / (long) arg1;
        if (arg0) {
            field890 = -31;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)V", line = 25)
    public static final void method410(int arg0, int arg1) {
        field885++;
        class256 var2 = class592.method3279((byte) -74, 4, arg0);
        var2.method1546((byte) -30);
        if (arg1 != 1) {
            field891 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 39)
    public static void method411(int arg0) {
        field891 = null;
        field887 = null;
        if (arg0 <= 94) {
            field887 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(CI)V", line = 53)
    public final void method412(char arg0, int arg1) {
        if (arg1 > -76) {
            field891 = null;
        }
        field881++;
        OpenGL.glCallList(this.field884 + arg0);
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)I", line = 64)
    public static final int method413(int arg0) {
        if (!class602.field8408.field4309) {
            for (int var1 = 0; var1 < class270.field3531; var1++) {
                if (class96.field1162[var1].method2750(false) == 's' || class96.field1162[var1].method2750(false) == 'S') {
                    class602.field8408.field4309 = true;
                    break;
                }
            }
        }
        if (arg0 != 8) {
            method413(-87);
        }
        field883++;
        if (class696.field9822 == class226.field2934) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class529.method2982((byte) -69);
            if (class629.field8708 == 0L) {
                class629.field8708 = var4;
            }
            if (var3 > 16384 && var4 - class629.field8708 < 5000L) {
                if (var4 - class473.field6593 > 1000L) {
                    System.gc();
                    class473.field6593 = var4;
                }
                return 0;
            }
        }
        if (class696.field9830 == class226.field2934) {
            if (class157.field2202 == null) {
                class157.field2202 = new class306(class567.field7725, class475.field6619, class424.field5717, class428.field5771);
            }
            if (!class157.field2202.method1796((byte) 74)) {
                return 0;
            }
            class651.method3680((byte) -53, 0, null);
            class637.field8806 = !class117.method686(arg0 ^ 0x66);
            class158.field2277 = class675.method3844(true, class637.field8806 ? 34 : 32, 1, false);
            class32.field449 = class675.method3844(true, 33, 1, false);
            class208.field2785 = class675.method3844(true, 13, 1, false);
        }
        if (class696.field9831 == class226.field2934) {
            class32.field449.method1953(arg0 ^ 0x72);
            int var6 = class244.field3196[33].method3575((byte) 106);
            int var7 = var6 + class244.field3196[class637.field8806 ? 34 : 32].method3575((byte) 97);
            int var8 = var7 + class244.field3196[13].method3575((byte) 97);
            int var9 = var8 + class32.field449.method1935(100);
            if (var9 != 400) {
                return var9 / 4;
            }
            class340.field4576 = class158.field2277.method1956(-128);
            class399.field5292 = class32.field449.method1956(-127);
            class488.method2800(class158.field2277, false);
            int var10 = class602.field8408.field4342;
            class101.field1214 = new class494(class508.field7015, class422.field5539, class32.field449);
            int[] var11 = class101.field1214.method2817(var10, 114);
            class252 var12 = new class252(class158.field2277, class208.field2785);
            if (var11.length > 0) {
                class284.field3760 = new class526[var11.length];
                for (int var13 = 0; var13 < class284.field3760.length; var13++) {
                    class284.field3760[var13] = new class547(class101.field1214.method2819(arg0 - 9, var11[var13]), var12);
                }
            }
        }
        if (class696.field9832 == class226.field2934) {
            class429.method2424(-4465, class208.field2785, class82.method435(false), class158.field2277);
        }
        if (class696.field9833 == class226.field2934) {
            int var14 = class119.method698(arg0 ^ 0xD);
            int var15 = class552.method3084(-13498);
            if (var14 < var15) {
                return var14 * 100 / var15;
            }
        }
        if (class696.field9834 == class226.field2934) {
            if (class284.field3760 != null && class284.field3760.length > 0) {
                if (class284.field3760[0].method154(19115) < 100) {
                    return 0;
                }
                if (class284.field3760.length > 1 && class101.field1214.method2820(-1) && class284.field3760[1].method154(19115) < 100) {
                    return 0;
                }
            }
            class327.method1907(0, class146.field1963);
            class590.method3263((byte) 126, class146.field1963);
            class28.method182(1, 29697);
        }
        if (class696.field9835 == class226.field2934) {
            for (int var16 = 0; var16 < 4; var16++) {
                class322.field4302[var16] = class211.method1335(class703.field9886, true, class431.field5789);
            }
        }
        if (class696.field9836 == class226.field2934) {
            class390.field5228 = class675.method3844(true, 8, 1, false);
            class567.field7726 = class675.method3844(true, 0, 1, false);
            class219.field2868 = class675.method3844(true, 1, 1, false);
            class82.field947 = class675.method3844(true, 2, 1, false);
            class542.field7425 = class675.method3844(true, 3, 1, false);
            class3.field8 = class675.method3844(true, 4, 1, false);
            class543.field7433 = class675.method3844(true, 5, 1, true);
            class654.field9309 = class675.method3844(true, 6, 1, true);
            class94.field1139 = class675.method3844(true, 7, 1, false);
            class329.field4420 = class675.method3844(true, 9, 1, false);
            class13.field164 = class675.method3844(true, 10, 1, false);
            class165.field2366 = class675.method3844(true, 11, 1, false);
            class614.field8506 = class675.method3844(true, 12, 1, false);
            class56.field728 = class675.method3844(true, 14, 1, false);
            class537.field7372 = class675.method3844(true, 15, 1, false);
            class361.field4786 = class675.method3844(true, 16, 1, false);
            class89.field1084 = class675.method3844(true, 17, 1, false);
            class651.field9100 = class675.method3844(true, 18, 1, false);
            class411.field5404 = class675.method3844(true, 19, 1, false);
            class219.field2867 = class675.method3844(true, 20, 1, false);
            class630.field8722 = class675.method3844(true, 21, 1, false);
            class426.field5748 = class675.method3844(true, 22, 1, false);
            class688.field9713 = class675.method3844(true, 23, 1, true);
            class33.field461 = class675.method3844(true, 24, 1, false);
            class85.field1045 = class675.method3844(true, 25, 1, false);
            class200.field2708 = class675.method3844(true, 26, 1, true);
            class102.field1219 = class675.method3844(true, 27, 1, false);
            class417.field5481 = class675.method3844(true, 28, 1, true);
            class311.field4196 = class675.method3844(true, 29, 1, false);
            class529.field7313 = class675.method3844(true, 30, 1, true);
            class329.field4418 = class675.method3844(true, 31, 1, true);
        }
        if (class696.field9837 == class226.field2934) {
            int var17 = 0;
            for (int var18 = 0; var18 < 35; var18++) {
                if (class244.field3196[var18] != null) {
                    var17 += class244.field3196[var18].method3575((byte) 50) * class504.field6942[var18] / 100;
                }
            }
            if (var17 != 100) {
                if (class686.field9700 < 0) {
                    class686.field9700 = var17;
                }
                return (var17 - class686.field9700) * 100 / (100 - class686.field9700);
            }
            class399.method2280(class390.field5228, (byte) 121);
            class429.method2424(-4465, class208.field2785, class82.method435(false), class390.field5228);
        }
        if (class696.field9838 == class226.field2934) {
            class146.method836(43);
            class28.method182(2, 29697);
        }
        if (class696.field9839 == class226.field2934) {
            class592.method3275((byte) -69, class312.field4206, class529.field7313);
        }
        if (class696.field9840 == class226.field2934) {
            int var19 = class164.method1010(arg0 - 92);
            if (var19 < 100) {
                return var19;
            }
            class279.method1664((byte) 40, class417.field5481.method1946(0, 1));
            class244.method1493(class417.field5481.method1946(0, 3), 28);
        }
        if (class696.field9841 == class226.field2934) {
            if (class240.field3172 != -1 && !class94.field1139.method1962(0, 115, class240.field3172)) {
                return 99;
            }
            class315.field4225 = new class635(class200.field2708, class329.field4420, class390.field5228);
            class15.field198 = new class622(class508.field7015, class422.field5539, class82.field947);
            class159.field2282 = new class647(class508.field7015, class422.field5539, class82.field947);
            class130.field1802 = new class431(class508.field7015, class422.field5539, class82.field947, class390.field5228);
            class340.field4573 = new class368(class508.field7015, class422.field5539, class89.field1084);
            class37.field501 = new class202(class508.field7015, class422.field5539, class82.field947);
            class35.field492 = new class107(class508.field7015, class422.field5539, class82.field947);
            class516.field7170 = new class692(class508.field7015, class422.field5539, class82.field947, class94.field1139);
            class504.field6946 = new class391(class508.field7015, class422.field5539, class82.field947);
            class400.field5311 = new class3(class508.field7015, class422.field5539, class82.field947);
            class118.field1510 = new class695(class508.field7015, class422.field5539, true, class361.field4786, class94.field1139);
            class506.field6989 = new class377(class508.field7015, class422.field5539, class82.field947, class390.field5228);
            class291.field3852 = new class166(class508.field7015, class422.field5539, class82.field947, class390.field5228);
            class440.field5847 = new class91(class508.field7015, class422.field5539, true, class651.field9100, class94.field1139);
            class87.field1058 = new class224(class508.field7015, class422.field5539, true, class15.field198, class411.field5404, class94.field1139);
            class258.field3383 = new class481(class508.field7015, class422.field5539, class82.field947);
            class423.field5620 = new class288(class508.field7015, class422.field5539, class219.field2867, class567.field7726, class219.field2868);
            class579.field7919 = new class422(class508.field7015, class422.field5539, class82.field947);
            class400.field5313 = new class234(class508.field7015, class422.field5539, class82.field947);
            class24.field291 = new class519(class508.field7015, class422.field5539, class630.field8722, class94.field1139);
            class554.field7565 = new class104(class508.field7015, class422.field5539, class82.field947);
            class1.field4 = new class410(class508.field7015, class422.field5539, class82.field947);
            class228.field2963 = new class657(class508.field7015, class422.field5539, class82.field947);
            class632.field8745 = new class479(class508.field7015, class422.field5539, class426.field5748);
            class624.field8643 = new class448(class508.field7015, class422.field5539, class82.field947);
            class308.method1819(true, class390.field5228, class94.field1139, class208.field2785, class542.field7425);
            class478.method2752(class311.field4196, (byte) -128);
            class273.field3635 = new class216(class422.field5539, class33.field461, class85.field1045);
            class32.field447 = new class378(class422.field5539, class33.field461, class85.field1045, new class582());
            class191.method1257(false);
            class118.field1510.method3925(arg0 - 9532, !class602.field8408.method3554(class618.field8566, (byte) -128));
            class564.field7696 = new class14();
            class595.method3305((byte) 91);
            class634.method3511(class102.field1219, (byte) -59);
            class505.method2878(-25467, class315.field4225, class94.field1139);
            class595 var20 = new class595(class13.field164.method1947(5, "", "huffman"));
            class643.method3585(-98, var20);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class618.field8581 = class53.method314(2047);
        }
        if (class696.field9843 == class226.field2934) {
            int var21 = class293.method1741(0, class390.field5228) + class207.method1318(true, false);
            int var22 = class111.method633(-11241) + class552.method3084(-13498);
            if (var21 < var22) {
                return var21 * 100 / var22;
            }
        }
        if (class696.field9844 == class226.field2934) {
            class672.method3833(class688.field9713, class37.field501, class35.field492, class118.field1510, class506.field6989, class291.field3852, class564.field7696);
        }
        if (class696.field9845 == class226.field2934) {
            class550.field7516 = new String[class1.field4.field5396];
            class516.field7179 = new boolean[class228.field2963.field9363];
            class235.field3125 = new int[class228.field2963.field9363];
            for (int var23 = 0; var23 < class228.field2963.field9363; var23++) {
                if (class228.field2963.method3752(19, var23).field7500 == 0) {
                    class516.field7179[var23] = true;
                    class32.field456++;
                }
                class235.field3125[var23] = -1;
            }
            class281.method1674((byte) -122);
            class230.field2983 = class542.field7425.method1959(5743, "loginscreen");
            class431.field5793 = class542.field7425.method1959(5743, "lobbyscreen");
            class543.field7433.method1944(false, (byte) 46, true);
            class654.field9309.method1944(true, (byte) 69, true);
            class390.field5228.method1944(true, (byte) 73, true);
            class208.field2785.method1944(true, (byte) 91, true);
            class13.field164.method1944(true, (byte) 85, true);
            class542.field7425.method1944(true, (byte) 79, true);
            class82.field947.field4445 = 2;
            class491.field6789 = true;
            class89.field1084.field4445 = 2;
            class361.field4786.field4445 = 2;
            class651.field9100.field4445 = 2;
            class411.field5404.field4445 = 2;
            class219.field2867.field4445 = 2;
            class630.field8722.field4445 = 2;
        }
        if (class696.field9846 == class226.field2934) {
            if (!class60.method341(class230.field2983, 0)) {
                return 0;
            }
            for (int var24 = 0; var24 < class124.field1729[class230.field2983].length; var24++) {
                class423 var25 = class124.field1729[class230.field2983][var24];
                if (var25.field5598 == 5 && var25.field5609 != -1) {
                    var25.method2387(-124, class146.field1963);
                }
            }
        }
        if (class696.field9847 == class226.field2934) {
            for (int var26 = 0; var26 < class124.field1729[class230.field2983].length; var26++) {
                class423 var27 = class124.field1729[class230.field2983][var26];
                if (var27.field5598 == 5 && var27.field5609 != -1 && var27.method2387(-113, class146.field1963) == null && class181.field2534) {
                    return 0;
                }
            }
        }
        if (class696.field9848 == class226.field2934) {
            class641.method3545(true, true);
        }
        if (class696.field9849 == class226.field2934) {
            class540.field7407.method2859(16777215);
            try {
                class604.field8439.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class158.field2277 = null;
            class540.field7407 = null;
            class32.field449 = null;
            class604.field8439 = null;
            class101.field1214 = null;
            class284.field3760 = null;
            class215.method1370((byte) 83);
            class9.field76 = class602.field8408.field4309;
            class602.field8408.field4309 = true;
            class602.field8408.method3557(class312.field4206, arg0 - 10);
            if (class9.field76) {
                class174.method1190(arg0 - 8, 0);
            } else {
                class174.method1190(0, class602.field8408.field4344);
            }
            class152.method892(class602.field8408.field4313, false, -1, -1, 3);
            class327.method1907(arg0 ^ 0x8, class146.field1963);
            class590.method3263((byte) 106, class146.field1963);
            class590.method3266(class146.field1963, class390.field5228, -65534);
            class413.method2339(class369.field4849, 0);
        }
        return class188.method1242(arg0 ^ 0xFFFFFFF7);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)V", line = 513)
    public final void method414(byte arg0, int arg1) {
        OpenGL.glNewList(this.field884 + arg1, 4864);
        if (arg0 != 126) {
            field887 = null;
        }
        field882++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V", line = 525)
    public final void method415(boolean arg0) {
        field889++;
        OpenGL.glEndList();
        if (arg0) {
            field887 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)[Leba;", line = 537)
    public static final class550[] method416(byte arg0) {
        field886++;
        if (arg0 != -99) {
            field891 = null;
        }
        return new class550[] { class513.field7143, class524.field7270, class565.field7706, class595.field8204, class5.field55, class394.field5259, class83.field1007, class249.field3241, class54.field698, class325.field4380, class560.field7648, class110.field1294, class43.field526, class129.field1781, class63.field800, class550.field7511, class404.field5343, class338.field4552, class138.field1876, class498.field6845, class686.field9699, class460.field6024, class66.field815, class689.field9742, class676.field9607, class90.field1098, class319.field4270, class104.field1237, class665.field9463, class677.field9633, class581.field7932, class450.field5942, class460.field6021, class642.field8855, class338.field4553, class462.field6064, class189.field2622, class116.field1486, class701.field9868, class94.field1141, class41.field519, class140.field1909, class653.field9301, class463.field6070, class89.field1080, class594.field8194, class314.field4213, class110.field1303, class619.field8596, class3.field14, class391.field5232, class360.field4777, class540.field7402, class95.field1149, class429.field5773, class279.field3687, class572.field7772, class239.field3164, class119.field1520, class377.field4988, class172.field2444, class340.field4571, class165.field2357, class649.field8966, class595.field8208, class43.field532, class347.field4628, class660.field9411, class150.field2050, class448.field5929, class291.field3846, class6.field57, class701.field9867, class588.field8115, class115.field1478, class615.field8521, class446.field5913, class407.field5358, class51.field644, class43.field531, class27.field394, class56.field727, class569.field7748, class389.field5209, class235.field3118, class445.field5898, class95.field1146, class335.field4522, class196.field2681, class156.field2189, class466.field6121, class468.field6144, class59.field748, class230.field2979, class457.field6004, class320.field4271, class361.field4788, class401.field5318, class316.field4233, class358.field4768, class184.field2560, class210.field2801, class616.field8525, class141.field1912, class698.field9855, class276.field3669, class134.field1851, class342.field4580, class535.field7351, class666.field9475, class78.field916, class649.field8970, class27.field395, class323.field4358, class172.field2442, class329.field4415, class323.field4361 };
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lag;I)V", line = 554)
    public class75(class469 arg0, int arg1) {
        this.field884 = OpenGL.glGenLists(arg1);
    }
}
