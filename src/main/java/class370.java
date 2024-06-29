import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class370 {

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "Lcl;")
    public static class746 field5623;

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "[[[Z")
    public static boolean[][][] field5622;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)V")
    public static void method2363(boolean arg0) {
        field5622 = null;
        if (!arg0) {
            field5622 = null;
        }
        field5623 = null;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZIILoj;)V")
    public static final void method2364(boolean arg0, int arg1, int arg2, class208 arg3) {
        field5621++;
        if (arg3 == null || class344.field5093.field8547 == arg3) {
            return;
        }
        int var4 = arg3.field3478;
        int var5 = arg3.field3474;
        int var6 = arg3.field3488;
        int var7 = (int) arg3.field3473;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg3.field3473;
        if (var6 == 4) {
            class573 var10 = class279.field4271[var7];
            if (var10 != null) {
                class542.field7735 = arg1;
                class230.field3710 = arg2;
                class230.field3707 = 2;
                class405.field6000 = 0;
                class204.field3442++;
                class540 var11 = class257.method1732(true, class659.field9377, class655.field9332);
                var11.field7707.method1925(var7, (byte) 126);
                var11.field7707.method1926(class543.field7749.method455(-14469, 82) ? 1 : 0, 65280);
                class756.method4211(var11, 114);
                class490.method2973(var10.field1702[0], var10.method878(-5740), -30526, true, var10.method878(-5740), 0, -2, var10.field1704[0], 0);
            }
        }
        if (var6 == 16) {
            if (class81.field1173 > 0 && class543.field7749.method455(-14469, 82) && class543.field7749.method455(-14469, 81)) {
                class496.method3010(class265.field4123 + var4, class723.field10155 + var5, !arg0, class145.field2251.field9470);
            } else {
                class540 var12 = class630.method3573(var5, !arg0, var4, var7);
                if (var7 == 1) {
                    var12.field7707.method1926(-1, 65280);
                    var12.field7707.method1926(-1, 65280);
                    var12.field7707.method1939((int) class261.field4064, 1134947720);
                    var12.field7707.method1926(57, 65280);
                    var12.field7707.method1926(class25.field252, 65280);
                    var12.field7707.method1926(class754.field10516, 65280);
                    var12.field7707.method1926(89, 65280);
                    var12.field7707.method1939(class145.field2251.field9477, 1134947720);
                    var12.field7707.method1939(class145.field2251.field9475, 1134947720);
                    var12.field7707.method1926(63, 65280);
                } else {
                    class230.field3710 = arg2;
                    class230.field3707 = 1;
                    class405.field6000 = 0;
                    class542.field7735 = arg1;
                }
                class756.method4211(var12, 114);
                class490.method2973(var4, 1, -30526, true, 1, 0, -4, var5, 0);
            }
        }
        if (var6 == 17) {
            class573 var13 = class279.field4271[var7];
            if (var13 != null) {
                class230.field3707 = 2;
                class542.field7735 = arg1;
                class230.field3710 = arg2;
                class656.field9339++;
                class405.field6000 = 0;
                class540 var14 = class257.method1732(true, class338.field4947, class655.field9332);
                var14.field7707.method1982((byte) 86, var7);
                var14.field7707.method1955((byte) -91, class543.field7749.method455(-14469, 82) ? 1 : 0);
                class756.method4211(var14, 119);
                class490.method2973(var13.field1702[0], var13.method878(-5740), -30526, true, var13.method878(-5740), 0, -2, var13.field1704[0], 0);
            }
        }
        if (var6 == 1011) {
            class230.field3707 = 2;
            class230.field3710 = arg2;
            class405.field6000 = 0;
            class542.field7735 = arg1;
            class621.field8724++;
            class540 var15 = class257.method1732(arg0, class592.field8330, class655.field9332);
            var15.field7707.method1939(var7, 1134947720);
            class756.method4211(var15, 112);
        }
        if (var6 == 11) {
            class405.field6000 = 0;
            class542.field7735 = arg1;
            class500.field7267++;
            class230.field3710 = arg2;
            class230.field3707 = 2;
            class540 var16 = class257.method1732(true, class516.field7485, class655.field9332);
            var16.field7707.method1939(var7, 1134947720);
            var16.field7707.method1955((byte) -90, class543.field7749.method455(-14469, 82) ? 1 : 0);
            var16.field7707.method1939(var4 + class265.field4123, 1134947720);
            var16.field7707.method1982((byte) 105, class723.field10155 + var5);
            class756.method4211(var16, 120);
            class203.method1500(var4, (byte) -110, var5);
        }
        if (var6 == 20) {
            class230.field3707 = 2;
            class405.field6000 = 0;
            class602.field8512++;
            class230.field3710 = arg2;
            class542.field7735 = arg1;
            class540 var17 = class257.method1732(arg0, class328.field4834, class655.field9332);
            var17.field7707.method1925(class436.field6364, (byte) -36);
            var17.field7707.method1939(class145.field2251.field1628, 1134947720);
            var17.field7707.method1970((byte) 29, class711.field10004);
            var17.field7707.method1925(class289.field4444, (byte) 73);
            var17.field7707.method1959(-28, class543.field7749.method455(-14469, 82) ? 1 : 0);
            class756.method4211(var17, 119);
        }
        if (var6 == 2) {
            class53 var18 = (class53) class332.field4881.method3512(true, (long) var7);
            if (var18 != null) {
                class542.field7735 = arg1;
                class230.field3710 = arg2;
                class405.field6000 = 0;
                class230.field3707 = 2;
                class673.field9522++;
                class461 var19 = var18.field847;
                class540 var20 = class257.method1732(true, class472.field6853, class655.field9332);
                var20.field7707.method1962(class543.field7749.method455(-14469, 82) ? 1 : 0, -47);
                var20.field7707.method1982((byte) 42, var7);
                class756.method4211(var20, 110);
                class490.method2973(var19.field1702[0], var19.method878(-5740), -30526, true, var19.method878(-5740), 0, -2, var19.field1704[0], 0);
            }
        }
        if (var6 == 23) {
            class53 var21 = (class53) class332.field4881.method3512(true, (long) var7);
            if (var21 != null) {
                class230.field3710 = arg2;
                class405.field6000 = 0;
                class19.field198++;
                class542.field7735 = arg1;
                class230.field3707 = 2;
                class461 var22 = var21.field847;
                class540 var23 = class257.method1732(true, class209.field3493, class655.field9332);
                var23.field7707.method1982((byte) -80, var7);
                var23.field7707.method1926(class543.field7749.method455(-14469, 82) ? 1 : 0, 65280);
                class756.method4211(var23, 113);
                class490.method2973(var22.field1702[0], var22.method878(-5740), -30526, true, var22.method878(-5740), 0, -2, var22.field1704[0], 0);
            }
        }
        if (var6 == 13) {
            class542.field7735 = arg1;
            class478.field6936++;
            class230.field3707 = 2;
            class230.field3710 = arg2;
            class405.field6000 = 0;
            class540 var24 = class257.method1732(true, class213.field3525, class655.field9332);
            var24.field7707.method1982((byte) -83, var4 + class265.field4123);
            var24.field7707.method1926(class543.field7749.method455(-14469, 82) ? 1 : 0, 65280);
            var24.field7707.method1948(class723.field10155 + var5, -3);
            var24.field7707.method1925(var7, (byte) 94);
            class756.method4211(var24, 118);
            class203.method1500(var4, (byte) -116, var5);
        }
        if (var6 == 46 || var6 == 1001) {
            class93.method777(var7, false, var5, arg3.field3483, var4);
        }
        if (var6 == 6) {
            class599.field8485++;
            class542.field7735 = arg1;
            class230.field3710 = arg2;
            class230.field3707 = 2;
            class405.field6000 = 0;
            class540 var25 = class257.method1732(true, class553.field7891, class655.field9332);
            var25.field7707.method1955((byte) -91, class543.field7749.method455(-14469, 82) ? 1 : 0);
            var25.field7707.method1925(var5 + class723.field10155, (byte) 124);
            var25.field7707.method1982((byte) -102, class265.field4123 + var4);
            var25.field7707.method1948((int) (var8 >>> 32) & Integer.MAX_VALUE, -3);
            class756.method4211(var25, 126);
            class373.method2372(-102, var4, var5, var8);
        }
        if (var6 == 1006) {
            class230.field3710 = arg2;
            class338.field4944++;
            class405.field6000 = 0;
            class230.field3707 = 2;
            class542.field7735 = arg1;
            class540 var26 = class257.method1732(true, class183.field3091, class655.field9332);
            var26.field7707.method1939(var7, 1134947720);
            class756.method4211(var26, 113);
        }
        if (var6 == 30) {
            class53 var27 = (class53) class332.field4881.method3512(true, (long) var7);
            if (var27 != null) {
                class230.field3710 = arg2;
                class405.field6000 = 0;
                class542.field7735 = arg1;
                class638.field8964++;
                class461 var28 = var27.field847;
                class230.field3707 = 2;
                class540 var29 = class257.method1732(arg0, class748.field10448, class655.field9332);
                var29.field7707.method1962(class543.field7749.method455(-14469, 82) ? 1 : 0, -22);
                var29.field7707.method1925(var7, (byte) 118);
                class756.method4211(var29, 108);
                class490.method2973(var28.field1702[0], var28.method878(-5740), -30526, true, var28.method878(-5740), 0, -2, var28.field1704[0], 0);
            }
        }
        if (var6 == 1009) {
            class405.field6000 = 0;
            class230.field3710 = arg2;
            class494.field7154++;
            class542.field7735 = arg1;
            class230.field3707 = 2;
            class540 var30 = class257.method1732(true, class485.field7003, class655.field9332);
            var30.field7707.method1926(class543.field7749.method455(-14469, 82) ? 1 : 0, 65280);
            var30.field7707.method1948((int) (var8 >>> 32) & Integer.MAX_VALUE, -3);
            var30.field7707.method1982((byte) 105, class723.field10155 + var5);
            var30.field7707.method1939(var4 + class265.field4123, 1134947720);
            class756.method4211(var30, 115);
            class373.method2372(-118, var4, var5, var8);
        }
        if (var6 == 59) {
            if (class81.field1173 > 0 && class543.field7749.method455(-14469, 82) && class543.field7749.method455(-14469, 81)) {
                class496.method3010(class265.field4123 + var4, class723.field10155 - -var5, false, class145.field2251.field9470);
            } else {
                class230.field3710 = arg2;
                class542.field7735 = arg1;
                class445.field6454++;
                class405.field6000 = 0;
                class230.field3707 = 1;
                class540 var31 = class257.method1732(true, class106.field1549, class655.field9332);
                var31.field7707.method1982((byte) -85, class723.field10155 + var5);
                var31.field7707.method1925(class265.field4123 + var4, (byte) 101);
                class756.method4211(var31, 109);
            }
        }
        if (var6 == 60) {
            class573 var32 = class279.field4271[var7];
            if (var32 != null) {
                class230.field3707 = 2;
                class522.field7543++;
                class230.field3710 = arg2;
                class542.field7735 = arg1;
                class405.field6000 = 0;
                class540 var33 = class257.method1732(true, class45.field765, class655.field9332);
                var33.field7707.method1959(-6, class543.field7749.method455(-14469, 82) ? 1 : 0);
                var33.field7707.method1948(var7, -3);
                class756.method4211(var33, 127);
                class490.method2973(var32.field1702[0], var32.method878(-5740), -30526, true, var32.method878(-5740), 0, -2, var32.field1704[0], 0);
            }
        }
        if (var6 == 58) {
            class53 var34 = (class53) class332.field4881.method3512(arg0, (long) var7);
            if (var34 != null) {
                class461 var35 = var34.field847;
                class542.field7735 = arg1;
                class405.field6000 = 0;
                class230.field3710 = arg2;
                class230.field3707 = 2;
                class490.field7078++;
                class540 var36 = class257.method1732(true, class260.field4057, class655.field9332);
                var36.field7707.method1959(-34, class543.field7749.method455(-14469, 82) ? 1 : 0);
                var36.field7707.method1982((byte) -112, var7);
                class756.method4211(var36, 114);
                class490.method2973(var35.field1702[0], var35.method878(-5740), -30526, true, var35.method878(-5740), 0, -2, var35.field1704[0], 0);
            }
        }
        if (var6 == 50) {
            class405.field6000 = 0;
            class230.field3710 = arg2;
            class542.field7735 = arg1;
            class230.field3707 = 2;
            class29.field283++;
            class540 var37 = class257.method1732(true, class292.field4495, class655.field9332);
            var37.field7707.method1939(class723.field10155 + var5, 1134947720);
            var37.field7707.method1939(var4 + class265.field4123, 1134947720);
            var37.field7707.method1939((int) (var8 >>> 32) & Integer.MAX_VALUE, 1134947720);
            var37.field7707.method1955((byte) -96, class543.field7749.method455(-14469, 82) ? 1 : 0);
            class756.method4211(var37, 109);
            class373.method2372(-98, var4, var5, var8);
        }
        if (var6 == 5) {
            class258.field4044++;
            class230.field3707 = 2;
            class542.field7735 = arg1;
            class230.field3710 = arg2;
            class405.field6000 = 0;
            class540 var38 = class257.method1732(arg0, class412.field6075, class655.field9332);
            var38.field7707.method1925(var5 + class723.field10155, (byte) -116);
            var38.field7707.method1926(class543.field7749.method455(-14469, 82) ? 1 : 0, 65280);
            var38.field7707.method1982((byte) 127, class289.field4444);
            var38.field7707.method1982((byte) 40, class265.field4123 + var4);
            var38.field7707.method1982((byte) 95, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var38.field7707.method1970((byte) 29, class711.field10004);
            var38.field7707.method1982((byte) 127, class436.field6364);
            class756.method4211(var38, 120);
            class373.method2372(73, var4, var5, var8);
        }
        if (var6 == 25) {
            class405.field6000 = 0;
            class328.field4838++;
            class230.field3707 = 2;
            class230.field3710 = arg2;
            class542.field7735 = arg1;
            class540 var39 = class257.method1732(arg0, class553.field7893, class655.field9332);
            var39.field7707.method1939((int) (var8 >>> 32) & Integer.MAX_VALUE, 1134947720);
            var39.field7707.method1955((byte) -88, class543.field7749.method455(-14469, 82) ? 1 : 0);
            var39.field7707.method1939(class265.field4123 + var4, 1134947720);
            var39.field7707.method1939(class723.field10155 + var5, 1134947720);
            class756.method4211(var39, 126);
            class373.method2372(-112, var4, var5, var8);
        }
        if (var6 == 22) {
            class573 var40 = class279.field4271[var7];
            if (var40 != null) {
                class230.field3710 = arg2;
                class230.field3707 = 2;
                class570.field8086++;
                class542.field7735 = arg1;
                class405.field6000 = 0;
                class540 var41 = class257.method1732(true, class691.field9804, class655.field9332);
                var41.field7707.method1939(var7, 1134947720);
                var41.field7707.method1926(class543.field7749.method455(-14469, 82) ? 1 : 0, 65280);
                class756.method4211(var41, 110);
                class490.method2973(var40.field1702[0], var40.method878(-5740), -30526, true, var40.method878(-5740), 0, -2, var40.field1704[0], 0);
            }
        }
        if (var6 == 12) {
            class573 var42 = class279.field4271[var7];
            if (var42 != null) {
                class405.field6000 = 0;
                class514.field7455++;
                class542.field7735 = arg1;
                class230.field3707 = 2;
                class230.field3710 = arg2;
                class540 var43 = class257.method1732(true, class680.field9609, class655.field9332);
                var43.field7707.method1982((byte) 18, var7);
                var43.field7707.method1955((byte) -122, class543.field7749.method455(-14469, 82) ? 1 : 0);
                class756.method4211(var43, 125);
                class490.method2973(var42.field1702[0], var42.method878(-5740), -30526, true, var42.method878(-5740), 0, -2, var42.field1704[0], 0);
            }
        }
        if (var6 == 45) {
            class53 var44 = (class53) class332.field4881.method3512(arg0, (long) var7);
            if (var44 != null) {
                class230.field3707 = 2;
                class461 var45 = var44.field847;
                class230.field3710 = arg2;
                class405.field6000 = 0;
                class614.field8653++;
                class542.field7735 = arg1;
                class540 var46 = class257.method1732(true, class546.field7806, class655.field9332);
                var46.field7707.method1982((byte) 80, class289.field4444);
                var46.field7707.method1982((byte) 120, var7);
                var46.field7707.method1926(class543.field7749.method455(-14469, 82) ? 1 : 0, 65280);
                var46.field7707.method1982((byte) 74, class436.field6364);
                var46.field7707.method1980(class711.field10004, (byte) 118);
                class756.method4211(var46, 108);
                class490.method2973(var45.field1702[0], var45.method878(-5740), -30526, true, var45.method878(-5740), 0, -2, var45.field1704[0], 0);
            }
        }
        if (var6 == 21) {
            class37.field374++;
            class405.field6000 = 0;
            class542.field7735 = arg1;
            class230.field3707 = 1;
            class230.field3710 = arg2;
            class540 var47 = class257.method1732(true, class48.field796, class655.field9332);
            var47.field7707.method1939(class289.field4444, 1134947720);
            var47.field7707.method1948(class723.field10155 + var5, -3);
            var47.field7707.method1948(class265.field4123 + var4, -3);
            var47.field7707.method1925(class436.field6364, (byte) 89);
            var47.field7707.method1980(class711.field10004, (byte) 100);
            class756.method4211(var47, 121);
            class490.method2973(var4, 1, -30526, true, 1, 0, -4, var5, 0);
        }
        if (!arg0) {
            return;
        }
        if (var6 == 15) {
            class53 var48 = (class53) class332.field4881.method3512(arg0, (long) var7);
            if (var48 != null) {
                class461 var49 = var48.field847;
                class542.field7735 = arg1;
                class405.field6000 = 0;
                class723.field10149++;
                class230.field3707 = 2;
                class230.field3710 = arg2;
                class540 var50 = class257.method1732(arg0, class321.field4756, class655.field9332);
                var50.field7707.method1948(var7, -3);
                var50.field7707.method1926(class543.field7749.method455(-14469, 82) ? 1 : 0, 65280);
                class756.method4211(var50, 127);
                class490.method2973(var49.field1702[0], var49.method878(-5740), -30526, true, var49.method878(-5740), 0, -2, var49.field1704[0], 0);
            }
        }
        if (var6 == 18) {
            class405.field6000 = 0;
            class708.field9977++;
            class230.field3707 = 2;
            class542.field7735 = arg1;
            class230.field3710 = arg2;
            class540 var51 = class257.method1732(arg0, class127.field1983, class655.field9332);
            var51.field7707.method1982((byte) 82, var7);
            var51.field7707.method1939(class265.field4123 + var4, 1134947720);
            var51.field7707.method1962(class543.field7749.method455(-14469, 82) ? 1 : 0, -47);
            var51.field7707.method1939(class723.field10155 + var5, 1134947720);
            class756.method4211(var51, 125);
            class203.method1500(var4, (byte) -117, var5);
        }
        if (var6 == 3 && class139.field2176 == null) {
            class328.method2119(var4, var5, 0);
            class139.field2176 = class745.method4165(65, var5, var4);
            class717.method3960(class139.field2176, (byte) 121);
        }
        if (var6 == 47) {
            class542.field7735 = arg1;
            class594.field8342++;
            class230.field3710 = arg2;
            class230.field3707 = 2;
            class405.field6000 = 0;
            class540 var52 = class257.method1732(true, class428.field6275, class655.field9332);
            var52.field7707.method1982((byte) -68, var7);
            var52.field7707.method1925(class265.field4123 + var4, (byte) -53);
            var52.field7707.method1939(var5 + class723.field10155, 1134947720);
            var52.field7707.method1962(class543.field7749.method455(-14469, 82) ? 1 : 0, -64);
            class756.method4211(var52, 113);
            class203.method1500(var4, (byte) -87, var5);
        }
        if (var6 == 1007 || var6 == 1003 || var6 == 1008 || var6 == 1012 || var6 == 1002) {
            class754.method4202(var7, 23673, var6, var4);
        }
        if (var6 == 57) {
            class230.field3710 = arg2;
            class82.field1182++;
            class230.field3707 = 2;
            class405.field6000 = 0;
            class542.field7735 = arg1;
            class540 var53 = class257.method1732(true, class598.field8465, class655.field9332);
            var53.field7707.method1948(class265.field4123 + var4, -3);
            var53.field7707.method1962(class543.field7749.method455(-14469, 82) ? 1 : 0, 105);
            var53.field7707.method1982((byte) 56, var7);
            var53.field7707.method1925(class723.field10155 + var5, (byte) -85);
            class756.method4211(var53, 122);
            class203.method1500(var4, (byte) -81, var5);
        }
        if (var6 == 9) {
            class573 var54 = class279.field4271[var7];
            if (var54 != null) {
                class230.field3710 = arg2;
                class542.field7735 = arg1;
                class405.field6000 = 0;
                class466.field6799++;
                class230.field3707 = 2;
                class540 var55 = class257.method1732(true, class562.field7957, class655.field9332);
                var55.field7707.method1982((byte) 120, var7);
                var55.field7707.method1955((byte) -72, class543.field7749.method455(-14469, 82) ? 1 : 0);
                class756.method4211(var55, 126);
                class490.method2973(var54.field1702[0], var54.method878(-5740), -30526, true, var54.method878(-5740), 0, -2, var54.field1704[0], 0);
            }
        }
        if (var6 == 49) {
            class573 var56 = class279.field4271[var7];
            if (var56 != null) {
                class230.field3710 = arg2;
                class521.field7530++;
                class230.field3707 = 2;
                class405.field6000 = 0;
                class542.field7735 = arg1;
                class540 var57 = class257.method1732(arg0, class241.field3905, class655.field9332);
                var57.field7707.method1939(var7, 1134947720);
                var57.field7707.method1955((byte) -103, class543.field7749.method455(-14469, 82) ? 1 : 0);
                class756.method4211(var57, 109);
                class490.method2973(var56.field1702[0], var56.method878(-5740), -30526, true, var56.method878(-5740), 0, -2, var56.field1704[0], 0);
            }
        }
        if (var6 == 1004) {
            class542.field7735 = arg1;
            class405.field6000 = 0;
            class230.field3707 = 2;
            class230.field3710 = arg2;
            class53 var58 = (class53) class332.field4881.method3512(arg0, (long) var7);
            if (var58 != null) {
                class461 var59 = var58.field847;
                class504 var60 = var59.field6688;
                if (var60.field7308 != null) {
                    var60 = var60.method3046(84, class422.field6216);
                }
                if (var60 != null) {
                    class711.field10001++;
                    class540 var61 = class257.method1732(true, class54.field869, class655.field9332);
                    var61.field7707.method1939(var60.field7297, 1134947720);
                    class756.method4211(var61, 121);
                }
            }
        }
        if (var6 == 8) {
            class353 var62 = class745.method4165(-101, var5, var4);
            if (var62 != null) {
                class531.method3143((byte) -65);
                class285 var63 = client.method2735(var62);
                class215.method1550((byte) -75, var63.field4385, var62, var63.method1866(1092));
                class131.field2134 = class279.method1819(var62, (byte) 68);
                if (class131.field2134 == null) {
                    class131.field2134 = "Null";
                }
                class355.field5375 = var62.field5336 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 44) {
            class542.field7735 = arg1;
            class275.field4198++;
            class230.field3710 = arg2;
            class230.field3707 = 2;
            class405.field6000 = 0;
            class540 var64 = class257.method1732(true, class433.field6339, class655.field9332);
            var64.field7707.method1962(class543.field7749.method455(-14469, 82) ? 1 : 0, 102);
            var64.field7707.method1939(var5 + class723.field10155, 1134947720);
            var64.field7707.method1948(class265.field4123 + var4, -3);
            var64.field7707.method1925(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) -19);
            class756.method4211(var64, 111);
            class373.method2372(-119, var4, var5, var8);
        }
        if (var6 == 10) {
            class353 var65 = class745.method4165(-107, var5, var4);
            if (var65 != null) {
                class527.method3134(var65, 21);
            }
        }
        if (var6 == 51) {
            class573 var66 = class279.field4271[var7];
            if (var66 != null) {
                class602.field8512++;
                class230.field3707 = 2;
                class230.field3710 = arg2;
                class405.field6000 = 0;
                class542.field7735 = arg1;
                class540 var67 = class257.method1732(arg0, class328.field4834, class655.field9332);
                var67.field7707.method1925(class436.field6364, (byte) -38);
                var67.field7707.method1939(var7, 1134947720);
                var67.field7707.method1970((byte) 29, class711.field10004);
                var67.field7707.method1925(class289.field4444, (byte) 108);
                var67.field7707.method1959(-120, class543.field7749.method455(-14469, 82) ? 1 : 0);
                class756.method4211(var67, 117);
                class490.method2973(var66.field1702[0], var66.method878(-5740), -30526, true, var66.method878(-5740), 0, -2, var66.field1704[0], 0);
            }
        }
        if (var6 == 19) {
            class573 var68 = class279.field4271[var7];
            if (var68 != null) {
                class230.field3707 = 2;
                class405.field6000 = 0;
                class178.field3051++;
                class542.field7735 = arg1;
                class230.field3710 = arg2;
                class540 var69 = class257.method1732(true, class275.field4203, class655.field9332);
                var69.field7707.method1925(var7, (byte) -31);
                var69.field7707.method1959(-48, class543.field7749.method455(-14469, 82) ? 1 : 0);
                class756.method4211(var69, 118);
                class490.method2973(var68.field1702[0], var68.method878(-5740), -30526, true, var68.method878(-5740), 0, -2, var68.field1704[0], 0);
            }
        }
        if (var6 == 48) {
            class230.field3710 = arg2;
            class405.field6000 = 0;
            class542.field7735 = arg1;
            class310.field4685++;
            class230.field3707 = 2;
            class540 var70 = class257.method1732(true, class516.field7483, class655.field9332);
            var70.field7707.method1982((byte) -126, class289.field4444);
            var70.field7707.method1970((byte) 29, class711.field10004);
            var70.field7707.method1982((byte) -110, class265.field4123 + var4);
            var70.field7707.method1948(var7, -3);
            var70.field7707.method1939(class436.field6364, 1134947720);
            var70.field7707.method1925(var5 + class723.field10155, (byte) 100);
            var70.field7707.method1926(class543.field7749.method455(-14469, 82) ? 1 : 0, 65280);
            class756.method4211(var70, 116);
            class203.method1500(var4, (byte) -81, var5);
        }
        if (class552.field7867) {
            class531.method3143((byte) -65);
        }
        if (class220.field3588 != null && class124.field1900 == 0) {
            class717.method3960(class220.field3588, (byte) 103);
        }
    }
}
