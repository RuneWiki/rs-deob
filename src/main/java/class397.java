import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class397 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Lhca;")
    public class244 field5701 = new class244();

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Z")
    public boolean field5702 = false;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "J")
    public static long field5704 = 0L;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "[I")
    public static int[] field5708 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Liv;")
    public static class25 field5707 = new class25(1);

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Z")
    public static boolean field5710 = true;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static void method2472(byte arg0) {
        field5707 = null;
        field5708 = null;
        if (arg0 < 62) {
            method2472((byte) 92);
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
    public final void method2473(byte arg0) {
        if (arg0 <= 19) {
            return;
        }
        field5705++;
        while (true) {
            class3 var2 = (class3) this.field5701.method1644(-23698);
            if (var2 == null) {
                return;
            }
            var2.method3012(122);
            class300.method1978(0, var2);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLua;)V")
    public final void method2474(boolean arg0, class3 arg1) {
        field5706++;
        class318 var3 = arg1.field21;
        boolean var4 = arg0;
        class574[] var5 = arg1.field18;
        for (int var6 = 0; var6 < var5.length; var6++) {
            if (var5[var6].field7910) {
                var4 = false;
                break;
            }
        }
        if (var4) {
            return;
        }
        if (this.field5702) {
            for (class3 var7 = (class3) this.field5701.method1638(false); var7 != null; var7 = (class3) this.field5701.method1645(0)) {
                if (var7.field21 == var3) {
                    var7.method3012(100);
                    class300.method1978(0, var7);
                }
            }
        }
        for (class3 var8 = (class3) this.field5701.method1638(false); var8 != null; var8 = (class3) this.field5701.method1645(0)) {
            if (var8.field21.field4409 <= var3.field4409) {
                class350.method2234(8270, var8, arg1);
                return;
            }
        }
        this.field5701.method1643(arg1, 110);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static final void method2475(int arg0) {
        field5703++;
        class700.method3958((byte) -90, false);
        class552.field7683 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class436.field6089.length; var2++) {
            if (class290.field4147[var2] != -1 && class436.field6089[var2] == null) {
                class436.field6089[var2] = class413.field5861.method1572(class290.field4147[var2], arg0 - 22678, 0);
                if (class436.field6089[var2] == null) {
                    var1 = false;
                    class552.field7683++;
                }
            }
            if (class306.field4308[var2] != -1 && class101.field1394[var2] == null) {
                class101.field1394[var2] = class413.field5861.method1577(1, class306.field4308[var2], class258.field3738[var2], 0);
                if (class101.field1394[var2] == null) {
                    var1 = false;
                    class552.field7683++;
                }
            }
            if (class100.field1385[var2] != -1 && class438.field6117[var2] == null) {
                class438.field6117[var2] = class413.field5861.method1572(class100.field1385[var2], arg0 - 22678, 0);
                if (class438.field6117[var2] == null) {
                    class552.field7683++;
                    var1 = false;
                }
            }
            if (class510.field7069[var2] != -1 && class45.field563[var2] == null) {
                class45.field563[var2] = class413.field5861.method1572(class510.field7069[var2], class134.method848(arg0, 22678), 0);
                if (class45.field563[var2] == null) {
                    var1 = false;
                    class552.field7683++;
                }
            }
            if (class113.field1518 != null && class239.field3580[var2] == null && class113.field1518[var2] != -1) {
                class239.field3580[var2] = class413.field5861.method1577(1, class113.field1518[var2], class258.field3738[var2], 0);
                if (class239.field3580[var2] == null) {
                    class552.field7683++;
                    var1 = false;
                }
            }
        }
        if (class643.field8616 == null) {
            if (class708.field9869 == null || !class701.field9774.method1587(arg0 - 22772, class708.field9869.field8163 + "_staticelements")) {
                class643.field8616 = new class375(0);
            } else if (class701.field9774.method1580(class708.field9869.field8163 + "_staticelements", -1)) {
                class643.field8616 = class718.method4024(arg0 ^ 0x58EE, class701.field9774, class708.field9869.field8163 + "_staticelements", class560.field7795);
            } else {
                var1 = false;
                class552.field7683++;
            }
        }
        if (!var1) {
            class584.field7969 = 1;
            return;
        }
        boolean var3 = true;
        class693.field9626 = 0;
        for (int var4 = 0; var4 < class436.field6089.length; var4++) {
            byte[] var21 = class101.field1394[var4];
            if (var21 != null) {
                int var22 = (class316.field4364[var4] >> 8) * 64 - class113.field1509;
                int var23 = (class316.field4364[var4] & 0xFF) * 64 - class587.field7995;
                if (class119.field1570 != 0) {
                    var22 = 10;
                    var23 = 10;
                }
                var3 &= class334.method2132(50, class667.field9202, var23, var22, var21, class277.field4036);
            }
            byte[] var24 = class45.field563[var4];
            if (var24 != null) {
                int var25 = (class316.field4364[var4] >> 8) * 64 - class113.field1509;
                int var26 = (class316.field4364[var4] & 0xFF) * 64 - class587.field7995;
                if (class119.field1570 != 0) {
                    var26 = 10;
                    var25 = 10;
                }
                var3 &= class334.method2132(65, class667.field9202, var26, var25, var24, class277.field4036);
            }
        }
        if (!var3) {
            class584.field7969 = 2;
            return;
        }
        if (class584.field7969 != 0) {
            class743.method4138(true, class272.field3950, class155.field2131.method978(class120.field1576, (byte) -118) + "<br>(100%)", class524.field7280, class129.field1802, (byte) -93);
        }
        class11.method51(104);
        class4.method20(0);
        class49.method352(47);
        boolean var5 = false;
        if (class129.field1802.method1419() && class332.field4707.field4791.method40(0) == 2) {
            for (int var6 = 0; var6 < class436.field6089.length; var6++) {
                if (class45.field563[var6] != null || class438.field6117[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class332.field4707.field4765.method3375(arg0 - 22678) == 1) {
            var7 = class580.field7949[class81.field1172];
        } else {
            var7 = class681.field9465[class81.field1172];
        }
        if (class129.field1802.method1447()) {
            var7++;
        }
        class749.method4161(class129.field1802, class81.field1160, 9, 4, class277.field4036, class667.field9202, var7, var5, class129.field1802.method1481() > 0);
        class414.method2581(class24.field309);
        if (class24.field309 == 0) {
            class751.method4170(null);
        } else {
            class751.method4170(class1.field14);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class209.field2735[var8].method1354((byte) 102);
        }
        class157.method989(0);
        class680.method3836(false, false);
        class306.method2007(0);
        class359.field5138 = null;
        class22.field269 = false;
        class11.method51(119);
        System.gc();
        class700.method3958((byte) -90, true);
        class30.method164(-22);
        class204.field2692 = class332.field4707.field4787.method942(0);
        class293.field4213 = class152.field2091 >= 96;
        class159.field2225 = class332.field4707.field4791.method40(0) == 2;
        class677.field9397 = class332.field4707.field4764.method3961(0) == 1;
        class327.field4520 = class332.field4707.field4774.method1242(0) == 1 ? -1 : class622.field8328;
        class297.field4234 = class332.field4707.field4752.method62(arg0 - 22678) == 1;
        class312.field4336 = class332.field4707.field4792.method3641(0) == 1;
        class647.field8683 = new class258(4, class277.field4036, class667.field9202, false);
        if (class119.field1570 == 0) {
            class83.method593((byte) 96, class436.field6089, class647.field8683);
        } else {
            class330.method2119(class647.field8683, arg0 - 22567, class436.field6089);
        }
        class486.method2956(class667.field9202 >> 4, 100, class277.field4036 >> 4);
        class152.method964(-105);
        if (var5) {
            class732.method4078(true);
            class217.field2829 = new class258(1, class277.field4036, class667.field9202, true);
            if (class119.field1570 == 0) {
                class83.method593((byte) 96, class438.field6117, class217.field2829);
                class700.method3958((byte) -90, true);
            } else {
                class330.method2119(class217.field2829, 100, class438.field6117);
                class700.method3958((byte) -90, true);
            }
            class217.field2829.method2396(0, 1, class647.field8683.field5489[0]);
            class217.field2829.method2398(null, null, arg0 - 22166, class129.field1802);
            class732.method4078(false);
        }
        class647.field8683.method2398(var5 ? class217.field2829.field5489 : null, class209.field2735, 512, class129.field1802);
        if (class119.field1570 == 0) {
            class700.method3958((byte) -90, true);
            class444.method2716(arg0 ^ 0x58D6, class647.field8683, class101.field1394);
            if (class239.field3580 != null) {
                class634.method3560(true);
            }
        } else {
            class700.method3958((byte) -90, true);
            class118.method740(class647.field8683, (byte) 117, class101.field1394);
        }
        class4.method20(arg0 ^ arg0);
        if (class152.field2091 < 96) {
            class699.method3954(true);
        }
        class700.method3958((byte) -90, true);
        class647.field8683.method2395(var5 ? class371.field5240[0] : null, (byte) -96, null, class129.field1802);
        class647.field8683.method1749(false, class129.field1802, arg0 - 22677);
        class700.method3958((byte) -90, true);
        if (var5) {
            class732.method4078(true);
            class700.method3958((byte) -90, true);
            if (class119.field1570 == 0) {
                class444.method2716(arg0 - 22614, class217.field2829, class45.field563);
            } else {
                class118.method740(class217.field2829, (byte) 117, class45.field563);
            }
            class4.method20(0);
            class700.method3958((byte) -90, true);
            class217.field2829.method2395(null, (byte) -96, class550.field7649[0], class129.field1802);
            class217.field2829.method1749(true, class129.field1802, 1);
            class700.method3958((byte) -90, true);
            class732.method4078(false);
        }
        class256.method1737(121);
        int var9 = class647.field8683.field3733;
        if (class96.field1331 < var9) {
            var9 = class96.field1331;
        }
        if ((class96.field1331 - 1) > var9) {
            var9 = class96.field1331 - 1;
        }
        if (class332.field4707.field4774.method1242(0) == 0) {
            class494.method2988(var9);
        } else {
            class494.method2988(0);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class277.field4036; var19++) {
                for (int var20 = 0; var20 < class667.field9202; var20++) {
                    class464.method2844(var10, arg0 - 22723, var20, var19);
                }
            }
        }
        class572.method3353(-68);
        class11.method51(122);
        class526.method3128(arg0 - 22677);
        class4.method20(0);
        class20.method105(121);
        if (class553.field7717 != null && class713.field9960 != null && class102.field1401 == 11) {
            class63.field932++;
            class583 var11 = class54.method400(class213.field2800, (byte) 96, class404.field5792);
            var11.field7963.method473(-125, 1057001181);
            class463.method2838(var11, (byte) 119);
        }
        if (class119.field1570 == 0) {
            int var12 = (class338.field4749 - (class277.field4036 >> 4)) / 8;
            int var13 = ((class277.field4036 >> 4) + class338.field4749) / 8;
            int var14 = (class48.field727 - (class667.field9202 >> 4)) / 8;
            int var15 = ((class667.field9202 >> 4) + class48.field727) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var16 < var12 || var13 < var16 || var17 < var14 || var15 < var17) {
                        class413.field5861.method1595("m" + var16 + "_" + var17, (byte) 91);
                        class413.field5861.method1595("l" + var16 + "_" + var17, (byte) 84);
                    }
                }
            }
        }
        if (class102.field1401 == 4) {
            class647.method3624(3, true);
        } else if (class102.field1401 == 8) {
            class647.method3624(7, true);
        } else {
            class647.method3624(10, true);
            if (class713.field9960 != null) {
                class583 var18 = class54.method400(class213.field2800, (byte) -42, class15.field145);
                class463.method2838(var18, (byte) 121);
            }
        }
        class530.method3148((byte) -124);
        class11.method51(116);
        class570.method3346((byte) -56);
        class569.field7870 = true;
        if (class96.field1343) {
            class261.method1772((byte) -115, "Took: " + (class97.method664((byte) -50) - class10.field87) + "ms");
            class96.field1343 = false;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method2476(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5709++;
        int var8 = arg0 + arg4;
        int var9 = arg6 - arg4;
        for (int var10 = arg0; var10 < var8; var10++) {
            class102.method675(arg7, 61, arg5, arg3, class538.field7454[var10]);
        }
        int var11 = arg4 + arg5;
        for (int var12 = arg6; var12 > var9; var12--) {
            class102.method675(arg7, -46, arg5, arg3, class538.field7454[var12]);
        }
        if (!arg1) {
            method2472((byte) -125);
        }
        int var13 = arg3 - arg4;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class538.field7454[var14];
            class102.method675(arg7, 98, arg5, var11, var15);
            class102.method675(arg2, 101, var11, var13, var15);
            class102.method675(arg7, -71, var13, arg3, var15);
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Z)V")
    public class397(boolean arg0) {
        this.field5702 = arg0;
    }
}
