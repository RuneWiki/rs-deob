import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class365 {

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Lpi;")
    public static class342 field5517 = new class342("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Liv;")
    public static class64 field5519 = new class64(104, 8);

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field5522 = 0;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Lr;")
    public static class120 field5520;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Ljs;")
    public static class216 field5521;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V", line = 8)
    public static void method2284(boolean arg0) {
        field5521 = null;
        if (!arg0) {
            field5519 = null;
        }
        field5519 = null;
        field5517 = null;
        field5520 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 31)
    public static final void method2285(int arg0) {
        class480.method2860(22662, false);
        field5518++;
        class358.field5442 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class322.field4920.length; var2++) {
            if (class148.field2364[var2] != -1 && class322.field4920[var2] == null) {
                class322.field4920[var2] = class5.field122.method114(0, class148.field2364[var2], 124);
                if (class322.field4920[var2] == null) {
                    class358.field5442++;
                    var1 = false;
                }
            }
            if (class438.field6549[var2] != -1 && class343.field5170[var2] == null) {
                class343.field5170[var2] = class5.field122.method130(class451.field6746[var2], class125.method953(arg0, 19428), class438.field6549[var2], 0);
                if (class343.field5170[var2] == null) {
                    class358.field5442++;
                    var1 = false;
                }
            }
            if (class373.field5657[var2] != -1 && class295.field4195[var2] == null) {
                class295.field4195[var2] = class5.field122.method114(0, class373.field5657[var2], arg0 - 19537);
                if (class295.field4195[var2] == null) {
                    class358.field5442++;
                    var1 = false;
                }
            }
            if (class339.field5128[var2] != -1 && class87.field1520[var2] == null) {
                class87.field1520[var2] = class5.field122.method114(0, class339.field5128[var2], 122);
                if (class87.field1520[var2] == null) {
                    var1 = false;
                    class358.field5442++;
                }
            }
            if (class325.field4945 != null && class464.field6941[var2] == null && class325.field4945[var2] != -1) {
                class464.field6941[var2] = class5.field122.method130(class451.field6746[var2], class125.method953(arg0, 19428), class325.field4945[var2], 0);
                if (class464.field6941[var2] == null) {
                    class358.field5442++;
                    var1 = false;
                }
            }
        }
        if (class306.field4687 == null) {
            if (class241.field3476 == null || !class407.field6109.method122(class241.field3476.field6260 + "_staticelements", 0)) {
                class306.field4687 = new class7(0);
            } else if (class407.field6109.method133(class241.field3476.field6260 + "_staticelements", (byte) -95)) {
                class306.field4687 = class488.method2895(arg0 ^ 0x4B8A, class407.field6109, class223.field3193, class241.field3476.field6260 + "_staticelements");
            } else {
                class358.field5442++;
                var1 = false;
            }
        }
        if (!var1) {
            class161.field2493 = 1;
            return;
        }
        boolean var3 = true;
        class455.field6794 = 0;
        if (arg0 != 19429) {
            field5521 = null;
        }
        for (int var4 = 0; var4 < class322.field4920.length; var4++) {
            byte[] var19 = class343.field5170[var4];
            if (var19 != null) {
                int var20 = (class381.field5776[var4] >> 8) * 64 - class200.field2931;
                int var21 = (class381.field5776[var4] & 0xFF) * 64 - class403.field6059;
                if (class412.field6157 != 0) {
                    var21 = 10;
                    var20 = 10;
                }
                var3 &= class380.method2359(var19, class121.field1966, var20, class33.field662, var21, -186551674);
            }
            byte[] var22 = class87.field1520[var4];
            if (var22 != null) {
                int var23 = (class381.field5776[var4] >> 8) * 64 - class200.field2931;
                int var24 = (class381.field5776[var4] & 0xFF) * 64 - class403.field6059;
                if (class412.field6157 != 0) {
                    var23 = 10;
                    var24 = 10;
                }
                var3 &= class380.method2359(var22, class121.field1966, var23, class33.field662, var24, -186551674);
            }
        }
        if (!var3) {
            class161.field2493 = 2;
            return;
        }
        if (class161.field2493 != 0) {
            client.method1351((byte) 109, true, class516.field7590.method2180(client.field2870, 29491) + "<br>(100%)", class464.field6944);
        }
        class386.method2389(15804);
        class385.method2384((byte) -77);
        boolean var5 = false;
        if (class4.field109.method283() && class443.field6623.field629) {
            for (int var6 = 0; var6 < class322.field4920.length; var6++) {
                if (class87.field1520[var6] != null || class295.field4195[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class443.field6623.field609) {
            var7 = class103.field1709[class487.field7218];
        } else {
            var7 = class137.field2181[class487.field7218];
        }
        if (class4.field109.method305()) {
            var7++;
        }
        class85.method661(7, 4, class33.field662, class121.field1966, var7, var5, class4.field109.method293() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class141.field2244[var8].method1726(arg0 ^ 0xFFFFB47D);
        }
        class33.method353((byte) 22);
        class442.method2652(false, (byte) 109);
        class474.method2834((byte) 78);
        class381.field5778 = null;
        class386.method2389(arg0 - 3625);
        System.gc();
        class480.method2860(22662, true);
        class345.method2194(0);
        class37.field708 = class443.field6623.method338(-4, class169.field2624);
        class436.field6501 = class457.field6854 >= 96;
        class89.field1549 = class443.field6623.field629;
        class165.field2541 = class443.field6623.method337(class169.field2624, (byte) 125);
        class429.field6387 = !class443.field6623.field632;
        class407.field6103 = class443.field6623.method2840(255, class169.field2624) ? -1 : class430.field6392;
        class228.field3250 = class169.field2624 == 1 || class443.field6623.field596;
        class141.field2241 = class443.field6623.field616;
        class471.field7072 = new class85(4, class33.field662, class121.field1966, false);
        if (class412.field6157 == 0) {
            class104.method787(-401286296, class471.field7072, class322.field4920);
        } else {
            class168.method1230(class322.field4920, class471.field7072, arg0 ^ 0x4BE5);
        }
        class432.method2585(false, class121.field1966 >> 4, class33.field662 >> 4);
        class459.method2734((byte) -122);
        if (var5) {
            class102.method763(true);
            class206.field2986 = new class85(1, class33.field662, class121.field1966, true);
            if (class412.field6157 == 0) {
                class104.method787(-401286296, class206.field2986, class295.field4195);
                class480.method2860(22662, true);
            } else {
                class168.method1230(class295.field4195, class206.field2986, 0);
                class480.method2860(22662, true);
            }
            class206.field2986.method80(0, 0, class471.field7072.field183[0]);
            class206.field2986.method82(class4.field109, null, null, arg0 - 19348);
            class102.method763(false);
        }
        class471.field7072.method82(class4.field109, class141.field2244, var5 ? class206.field2986.field183 : null, 34);
        if (class412.field6157 == 0) {
            class480.method2860(22662, true);
            class14.method90(class343.field5170, 64, class471.field7072);
            if (class464.field6941 != null) {
                class368.method2301(-93);
            }
        } else {
            class480.method2860(22662, true);
            class169.method1243(class471.field7072, class343.field5170, 0);
        }
        class385.method2384((byte) -114);
        class480.method2860(22662, true);
        class471.field7072.method72(null, (byte) 40, class4.field109, var5 ? class335.field5061[0] : null);
        class471.field7072.method654(class4.field109, arg0 - 19428);
        class480.method2860(arg0 ^ 0x1363, true);
        if (var5) {
            class102.method763(true);
            class480.method2860(22662, true);
            if (class412.field6157 == 0) {
                class14.method90(class87.field1520, 64, class206.field2986);
            } else {
                class169.method1243(class206.field2986, class87.field1520, 0);
            }
            class385.method2384((byte) -103);
            class480.method2860(22662, true);
            class206.field2986.method72(class43.field829[0], (byte) 89, class4.field109, null);
            class206.field2986.method654(class4.field109, arg0 - 19428);
            class480.method2860(22662, true);
            class102.method763(false);
        }
        class488.method2891(101);
        int var9 = class471.field7072.field1465;
        if (var9 > class163.field2525) {
            var9 = class163.field2525;
        }
        if (var9 < (class163.field2525 - 1)) {
            var9 = class163.field2525 - 1;
        }
        if (class443.field6623.method2840(255, class169.field2624)) {
            class428.method2566(0);
        } else {
            class428.method2566(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class33.field662; var17++) {
                for (int var18 = 0; var18 < class121.field1966; var18++) {
                    class369.method2312(var18, var10, var17, arg0 ^ 0x49205F22);
                }
            }
        }
        class80.method642(-26522);
        class386.method2389(arg0 ^ 0x7659);
        class530.method3141(false);
        class385.method2384((byte) 38);
        class514.field7563 = false;
        class163.method1207(arg0 - 36315);
        if (class423.field6321 != null && class116.field1927 != null && class281.field4023 == 25) {
            class330.field4976++;
            class28.method321(class212.field3033, arg0 ^ 0xFFFFA792);
            class410.field6141.method1117(1057001181, (byte) 12);
        }
        if (class412.field6157 == 0) {
            int var11 = (class185.field2771 - (class33.field662 >> 4)) / 8;
            int var12 = (class185.field2771 + (class33.field662 >> 4)) / 8;
            int var13 = (class187.field2781 - (class121.field1966 >> 4)) / 8;
            int var14 = ((class121.field1966 >> 4) + class187.field2781) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= var14 + 1; var16++) {
                    if (var11 > var15 || var15 > var12 || var16 < var13 || var16 > var14) {
                        class5.field122.method111(14, "m" + var15 + "_" + var16);
                        class5.field122.method111(47, "l" + var15 + "_" + var16);
                    }
                }
            }
        }
        if (class281.field4023 == 28) {
            class244.method1590(10, (byte) 106);
        } else {
            class244.method1590(30, (byte) 121);
            if (class116.field1927 != null) {
                class28.method321(class519.field7715, -5001);
            }
        }
        class435.method2590(true);
        class386.method2389(15804);
        class466.method2762((byte) 40);
    }
}
