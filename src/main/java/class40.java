import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class40 extends class249 {

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "Lwq;")
    public class283 field527;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "Ldp;")
    public static class347 field524 = new class347("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "[I")
    public static int[] field532 = new int[250];

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "Lqh;")
    public static class231 field530;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field531;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static void method321(byte arg0) {
        field524 = null;
        field532 = null;
        if (arg0 < 112) {
            field526 = -31;
        }
        field531 = null;
        field530 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static final void method322(int arg0) {
        class99.method762(false, 841940584);
        field525++;
        class245.field3393 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class229.field3226.length; var2++) {
            if (class27.field393[var2] != -1 && class229.field3226[var2] == null) {
                class229.field3226[var2] = class302.field4502.method541(0, class27.field393[var2], (byte) -122);
                if (class229.field3226[var2] == null) {
                    var1 = false;
                    class245.field3393++;
                }
            }
            if (class163.field2433[var2] != -1 && class450.field6624[var2] == null) {
                class450.field6624[var2] = class302.field4502.method521(class163.field2433[var2], 0, arg0 - 63, class23.field335[var2]);
                if (class450.field6624[var2] == null) {
                    class245.field3393++;
                    var1 = false;
                }
            }
            if (class146.field2201[var2] != -1 && class50.field639[var2] == null) {
                class50.field639[var2] = class302.field4502.method541(0, class146.field2201[var2], (byte) -122);
                if (class50.field639[var2] == null) {
                    class245.field3393++;
                    var1 = false;
                }
            }
            if (class180.field2659[var2] != -1 && class194.field2866[var2] == null) {
                class194.field2866[var2] = class302.field4502.method541(0, class180.field2659[var2], (byte) -122);
                if (class194.field2866[var2] == null) {
                    var1 = false;
                    class245.field3393++;
                }
            }
            if (class451.field6630 != null && class230.field3231[var2] == null && class451.field6630[var2] != -1) {
                class230.field3231[var2] = class302.field4502.method521(class451.field6630[var2], 0, class286.method1773(arg0, 65), class23.field335[var2]);
                if (class230.field3231[var2] == null) {
                    var1 = false;
                    class245.field3393++;
                }
            }
        }
        if (client.field7541 == null) {
            if (class342.field5258 == null || !class307.field4602.method531(class342.field5258.field2271 + "_staticelements", -77)) {
                client.field7541 = new class290(0);
            } else if (class307.field4602.method525(class342.field5258.field2271 + "_staticelements", 0)) {
                client.field7541 = class71.method505(class342.field5258.field2271 + "_staticelements", arg0 ^ 0x28D8, class125.field1884, class307.field4602);
            } else {
                var1 = false;
                class245.field3393++;
            }
        }
        if (!var1) {
            class314.field4856 = 1;
            return;
        }
        class389.field5863 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class229.field3226.length; var4++) {
            byte[] var19 = class450.field6624[var4];
            if (var19 != null) {
                int var20 = (class495.field7349[var4] >> 8) * 64 - class267.field3979;
                int var21 = (class495.field7349[var4] & 0xFF) * 64 - class241.field3358;
                if (class311.field4830 != 0) {
                    var21 = 10;
                    var20 = 10;
                }
                var3 &= class375.method2221(var19, var20, -75, var21, class448.field6611, class50.field640);
            }
            byte[] var22 = class194.field2866[var4];
            if (var22 != null) {
                int var23 = (class495.field7349[var4] >> 8) * 64 - class267.field3979;
                int var24 = (class495.field7349[var4] & 0xFF) * 64 - class241.field3358;
                if (class311.field4830 != 0) {
                    var23 = 10;
                    var24 = 10;
                }
                var3 &= class375.method2221(var22, var23, -94, var24, class448.field6611, class50.field640);
            }
        }
        if (!var3) {
            class314.field4856 = 2;
            return;
        }
        if (class314.field4856 != 0) {
            class351.method2123((byte) -100, class164.field2445, class221.field3157.method2103(class30.field430, (byte) 34) + "<br>(100%)", true);
        }
        class436.method2565(-41);
        class147.method1068((byte) -43);
        boolean var5 = false;
        if (class407.field6147.method152() && class454.field6661.field983) {
            for (int var6 = 0; var6 < class229.field3226.length; var6++) {
                if (class194.field2866[var6] != null || class50.field639[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class454.field6661.field985) {
            var7 = class439.field6456[class426.field6351];
        } else {
            var7 = class531.field7824[class426.field6351];
        }
        if (class407.field6147.method87()) {
            var7++;
        }
        class379.method2235(7, 4, class50.field640, class448.field6611, var7, var5, class407.field6147.method72() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class151.field2300[var8].method1959(13734);
        }
        class411.method2465(true);
        class77.method564(false, 0);
        class108.method809((byte) 51);
        class89.field1394 = null;
        class436.method2565(-47);
        System.gc();
        class99.method762(true, 841940584);
        class258.method1560(-35);
        class351.field5405 = class454.field6661.method509(class113.field1723, -2);
        class50.field637 = class521.field7648 >= 96;
        class83.field1330 = class454.field6661.field983;
        class181.field2693 = class454.field6661.method510(15479, class113.field1723);
        class495.field7347 = !class454.field6661.field995;
        class224.field3173 = class454.field6661.method1533(-1, class113.field1723) ? -1 : class151.field2295;
        class203.field2966 = class454.field6661.field975;
        class368.field5604 = class113.field1723 == 1 || class454.field6661.field992;
        class238.field3331 = new class367(4, class50.field640, class448.field6611, false);
        if (class311.field4830 == 0) {
            class500.method2971(class229.field3226, class238.field3331, (byte) -113);
        } else {
            class285.method1768(class238.field3331, class229.field3226, 3);
        }
        class181.method1232(class448.field6611 >> 4, (byte) -126, class50.field640 >> 4);
        class258.method1592(-6402);
        if (var5) {
            class502.method2975(true);
            class236.field3306 = new class367(1, class50.field640, class448.field6611, true);
            if (class311.field4830 == 0) {
                class500.method2971(class50.field639, class236.field3306, (byte) 22);
                class99.method762(true, 841940584);
            } else {
                class285.method1768(class236.field3306, class50.field639, 3);
                class99.method762(true, 841940584);
            }
            class236.field3306.method2694((byte) -7, 0, class238.field3331.field6742[0]);
            class236.field3306.method2686(null, null, class407.field6147, arg0 ^ 0x1877);
            class502.method2975(false);
        }
        class238.field3331.method2686(var5 ? class236.field3306.field6742 : null, class151.field2300, class407.field6147, 6199);
        if (class311.field4830 == 0) {
            class99.method762(true, 841940584);
            class99.method763(arg0, class450.field6624, class238.field3331);
            if (class230.field3231 != null) {
                class230.method1426(-3154);
            }
        } else {
            class99.method762(true, 841940584);
            class391.method2342(class238.field3331, (byte) -14, class450.field6624);
        }
        class147.method1068((byte) -84);
        class99.method762(true, 841940584);
        class238.field3331.method2693(null, 20949, class407.field6147, var5 ? class420.field6281[0] : null);
        class238.field3331.method2192(class407.field6147, arg0 - 61);
        class99.method762(true, 841940584);
        if (var5) {
            class502.method2975(true);
            class99.method762(true, arg0 ^ 0x322EFE28);
            if (class311.field4830 == 0) {
                class99.method763(64, class194.field2866, class236.field3306);
            } else {
                class391.method2342(class236.field3306, (byte) -14, class194.field2866);
            }
            class147.method1068((byte) -106);
            class99.method762(true, 841940584);
            class236.field3306.method2693(class213.field3048[0], arg0 ^ 0x5195, class407.field6147, null);
            class236.field3306.method2192(class407.field6147, 3);
            class99.method762(true, arg0 + 841940520);
            class502.method2975(false);
        }
        class184.method1247(-116);
        int var9 = class238.field3331.field5593;
        if (class521.field7651 < var9) {
            var9 = class521.field7651;
        }
        if (var9 < class521.field7651 - 1) {
            var9 = class521.field7651 - 1;
        }
        if (class454.field6661.method1533(-1, class113.field1723)) {
            class29.method264(0);
        } else {
            class29.method264(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class50.field640; var17++) {
                for (int var18 = 0; var18 < class448.field6611; var18++) {
                    class235.method1451(var17, var18, var10, 0);
                }
            }
        }
        class440.method2586(-2);
        class436.method2565(arg0 - 131);
        class357.method2145(21);
        class147.method1068((byte) -60);
        class15.field200 = false;
        class110.method844((byte) -124);
        if (class176.field2596 != null && class232.field3269 != null && class411.field6213 == 10) {
            class97.method758(class477.field7031, false);
            class393.field5893++;
            class43.field559.method2717(1057001181, 496598568);
        }
        if (class311.field4830 == 0) {
            int var11 = (class116.field1743 - (class50.field640 >> 4)) / 8;
            int var12 = ((class50.field640 >> 4) + class116.field1743) / 8;
            int var13 = (class161.field2414 - (class448.field6611 >> 4)) / 8;
            int var14 = ((class448.field6611 >> 4) + class161.field2414) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var11 > var15 || var15 > var12 || var16 < var13 || var14 < var16) {
                        class302.field4502.method519(arg0 - 64, "m" + var15 + "_" + var16);
                        class302.field4502.method519(0, "l" + var15 + "_" + var16);
                    }
                }
            }
        }
        if (class411.field6213 == 3) {
            class526.method3137(2, 2270);
        } else if (class411.field6213 == 7) {
            class526.method3137(6, 2270);
        } else {
            class526.method3137(9, 2270);
            if (class232.field3269 != null) {
                class97.method758(class81.field1191, false);
            }
        }
        class200.method1324((byte) 72);
        class436.method2565(-102);
        if (arg0 != 64) {
            method321((byte) -42);
        }
        class103.method779(12592);
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lvd;II[B)V")
    public class40(class258 arg0, int arg1, int arg2, byte[] arg3) {
        this.field527 = class292.method1814(arg1, 6406, 6406, arg2, arg0, 3557, false, arg3);
        this.field527.method741(false, false, (byte) -100);
    }
}
