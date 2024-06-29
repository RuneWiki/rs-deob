import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class234 extends class154 {

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "Ljia;")
    public class645 field3367 = new class645();

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "Lfja;")
    public static class783 field3368 = new class783(22, -2);

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "Lvl;")
    public static class15 field3370 = new class15(69, 2);

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "Z")
    public static boolean field3371;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 7)
    public static void method1576(int arg0) {
        if (arg0 != -8118) {
            field3370 = null;
        }
        field3370 = null;
        field3368 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 19)
    public static final void method1577(byte arg0) {
        class81.method670(62, false);
        field3365++;
        class563.field7983 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class1.field15.length; var2++) {
            if (class79.field1114[var2] != -1 && class1.field15[var2] == null) {
                class1.field15[var2] = class193.field2947.method3732(0, 8906, class79.field1114[var2]);
                if (class1.field15[var2] == null) {
                    var1 = false;
                    class563.field7983++;
                }
            }
            if (class320.field4373[var2] != -1 && class286.field3935[var2] == null) {
                class286.field3935[var2] = class193.field2947.method3733(class320.field4373[var2], 0, (byte) 119, class82.field1135[var2]);
                if (class286.field3935[var2] == null) {
                    var1 = false;
                    class563.field7983++;
                }
            }
            if (class450.field6173[var2] != -1 && class444.field6024[var2] == null) {
                class444.field6024[var2] = class193.field2947.method3732(0, 8906, class450.field6173[var2]);
                if (class444.field6024[var2] == null) {
                    class563.field7983++;
                    var1 = false;
                }
            }
            if (class537.field7299[var2] != -1 && class783.field10755[var2] == null) {
                class783.field10755[var2] = class193.field2947.method3732(0, 8906, class537.field7299[var2]);
                if (class783.field10755[var2] == null) {
                    var1 = false;
                    class563.field7983++;
                }
            }
            if (class120.field2189 != null && class532.field7197[var2] == null && class120.field2189[var2] != -1) {
                class532.field7197[var2] = class193.field2947.method3733(class120.field2189[var2], 0, (byte) 67, class82.field1135[var2]);
                if (class532.field7197[var2] == null) {
                    class563.field7983++;
                    var1 = false;
                }
            }
        }
        if (class333.field4502 == null) {
            if (class668.field9304 == null || !class744.field10270.method3745(arg0 ^ 0xFFFFFF8A, class668.field9304.field3344 + "_staticelements")) {
                class333.field4502 = new class678(0);
            } else if (class744.field10270.method3725(arg0 ^ 0x326B, class668.field9304.field3344 + "_staticelements")) {
                class333.field4502 = class47.method349(class744.field10270, 0, class668.field9304.field3344 + "_staticelements", class295.field4033);
            } else {
                var1 = false;
                class563.field7983++;
            }
        }
        if (!var1) {
            class156.field2545 = 1;
            return;
        }
        class56.field799 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class1.field15.length; var4++) {
            byte[] var21 = class286.field3935[var4];
            if (var21 != null) {
                int var22 = (class201.field3055[var4] >> 8) * 64 - class217.field3198;
                int var23 = (class201.field3055[var4] & 0xFF) * 64 - class400.field5510;
                if (class215.field3195 != 0) {
                    var22 = 10;
                    var23 = 10;
                }
                var3 &= class280.method1796(class483.field6515, var22, var21, var23, 121, class65.field926);
            }
            byte[] var24 = class783.field10755[var4];
            if (var24 != null) {
                int var25 = (class201.field3055[var4] >> 8) * 64 - class217.field3198;
                int var26 = (class201.field3055[var4] & 0xFF) * 64 - class400.field5510;
                if (class215.field3195 != 0) {
                    var25 = 10;
                    var26 = 10;
                }
                var3 &= class280.method1796(class483.field6515, var25, var24, var26, 112, class65.field926);
            }
        }
        if (!var3) {
            class156.field2545 = 2;
            return;
        }
        if (class156.field2545 != 0) {
            class289.method1844(class95.field1472, class16.field239, class359.field4908, class641.field8830.method3566((byte) -90, class464.field6309) + "<br>(100%)", true, (byte) 11);
        }
        class204.method1458(-17818);
        class338.method2113(arg0 + 55);
        class333.method2093(49);
        boolean var5 = false;
        if (class95.field1472.method588() && class111.field1911.field6735.method1135((byte) 120) == 2) {
            for (int var6 = 0; var6 < class1.field15.length; var6++) {
                if (class783.field10755[var6] != null || class444.field6024[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class111.field1911.field6765.method330((byte) 76) == 1) {
            var7 = class526.field7140[class586.field8285];
        } else {
            var7 = class539.field7324[class586.field8285];
        }
        if (class95.field1472.method585()) {
            var7++;
        }
        class183.method1363(class95.field1472, class265.field3740, 9, 4, class483.field6515, class65.field926, var7, var5, class95.field1472.method493() > 0);
        class208.method1467(class692.field9597);
        if (class692.field9597 == 0) {
            class72.method634(null);
        } else {
            class72.method634(class555.field7842);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class711.field9798[var8].method2189((byte) -128);
        }
        class514.method2943((byte) -120);
        class673.method3797(false, 6408);
        class15.method84(0);
        class288.field3973 = null;
        class61.field850 = false;
        class204.method1458(-17818);
        System.gc();
        class81.method670(82, true);
        class592.method3387(false);
        class618.field8595 = class111.field1911.field6717.method3695((byte) 126);
        class735.field10153 = class455.field6207 >= 96;
        class448.field6146 = class111.field1911.field6735.method1135((byte) 89) == 2;
        class661.field9161 = class111.field1911.field6749.method2258((byte) 112) == 1;
        class347.field4686 = class111.field1911.field6734.method3639((byte) 114) == 1 ? -1 : class426.field5820;
        class650.field8980 = class111.field1911.field6754.method3467((byte) 54) == 1;
        class771.field10628 = class111.field1911.field6743.method3385((byte) 66) == 1;
        class707.field9716 = new class157(4, class483.field6515, class65.field926, false);
        if (class215.field3195 == 0) {
            class240.method1602((byte) 54, class1.field15, class707.field9716);
        } else {
            class706.method3945(class707.field9716, class1.field15, (byte) -127);
        }
        class325.method2064(1, class65.field926 >> 4, class483.field6515 >> 4);
        class412.method2441(31460);
        if (var5) {
            class5.method29(true);
            class304.field4169 = new class157(1, class483.field6515, class65.field926, true);
            if (class215.field3195 == 0) {
                class240.method1602((byte) -55, class444.field6024, class304.field4169);
                class81.method670(82, true);
            } else {
                class706.method3945(class304.field4169, class444.field6024, (byte) -126);
                class81.method670(87, true);
            }
            class304.field4169.method2978(0, (byte) -18, class707.field9716.field7103[0]);
            class304.field4169.method2982(null, class95.field1472, arg0 ^ 0x19, null);
            class5.method29(false);
        }
        class707.field9716.method2982(var5 ? class304.field4169.field7103 : null, class95.field1472, arg0 ^ 0x40, class711.field9798);
        if (class215.field3195 == 0) {
            class81.method670(120, true);
            class507.method2895(class286.field3935, class707.field9716, 66);
            if (class532.field7197 != null) {
                class630.method3538(72);
            }
        } else {
            class81.method670(arg0 + 226, true);
            class642.method3570(class707.field9716, class286.field3935, 18);
        }
        class338.method2113(-107);
        if (class455.field6207 < 96) {
            class558.method3206(-64);
        }
        class81.method670(79, true);
        if (arg0 != -118) {
            return;
        }
        class707.field9716.method2969(null, class95.field1472, arg0 ^ 0xFFFFF2C2, var5 ? class178.field2805[0] : null);
        class707.field9716.method1223(class95.field1472, arg0 ^ 0x6C0E, false);
        class81.method670(67, true);
        if (var5) {
            class5.method29(true);
            class81.method670(88, true);
            if (class215.field3195 == 0) {
                class507.method2895(class783.field10755, class304.field4169, arg0 + 198);
            } else {
                class642.method3570(class304.field4169, class783.field10755, 4);
            }
            class338.method2113(arg0 - 1);
            class81.method670(126, true);
            class304.field4169.method2969(class142.field2418[0], class95.field1472, 3400, null);
            class304.field4169.method1223(class95.field1472, -27772, true);
            class81.method670(75, true);
            class5.method29(false);
        }
        class179.method1350(1);
        int var9 = class707.field9716.field2555;
        if (var9 > class282.field3917) {
            var9 = class282.field3917;
        }
        if (var9 < class282.field3917 - 1) {
            var9 = class282.field3917 - 1;
        }
        if (class111.field1911.field6734.method3639((byte) 70) == 0) {
            class696.method3879(var9);
        } else {
            class696.method3879(0);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class483.field6515; var19++) {
                for (int var20 = 0; var20 < class65.field926; var20++) {
                    class28.method185(var19, var20, var10, (byte) -105);
                }
            }
        }
        class725.method4023(111);
        class204.method1458(-17818);
        class626.method3522(arg0 ^ 0xFFFFFFB2);
        class338.method2113(89);
        class789.method4308(true);
        if (class194.field2956 != null && class193.field2948 != null && class753.field10398 == 11) {
            class485.field6555++;
            class537 var11 = class476.method2729(class193.field2950, (byte) -46, class551.field7498);
            var11.field7295.method759(1057001181, 127);
            class173.method1314(false, var11);
        }
        if (class215.field3195 == 0) {
            int var12 = (class666.field9269 - (class483.field6515 >> 4)) / 8;
            int var13 = ((class483.field6515 >> 4) + class666.field9269) / 8;
            int var14 = (class171.field2735 - (class65.field926 >> 4)) / 8;
            int var15 = ((class65.field926 >> 4) + class171.field2735) / 8;
            for (int var16 = var12 - 1; var16 <= var13 + 1; var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var12 > var16 || var16 > var13 || var14 > var17 || var15 < var17) {
                        class193.field2947.method3735("m" + var16 + "_" + var17, (byte) -103);
                        class193.field2947.method3735("l" + var16 + "_" + var17, (byte) -103);
                    }
                }
            }
        }
        if (class753.field10398 == 4) {
            class139.method1142(2, 3);
        } else if (class753.field10398 == 8) {
            class139.method1142(2, 7);
        } else {
            class139.method1142(2, 10);
            if (class193.field2948 != null) {
                class537 var18 = class476.method2729(class747.field10316, (byte) -46, class551.field7498);
                class173.method1314(false, var18);
            }
        }
        class671.method3789((byte) -106);
        class204.method1458(-17818);
        class659.method3707(98);
        class180.field2828 = true;
        if (class109.field1711) {
            class652.method3663(-118, "Took: " + (class197.method1423(1) - class254.field3577) + "ms");
            class109.field1711 = false;
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)[Lrha;", line = 507)
    public static final class235[] method1578(int arg0) {
        if (arg0 > -115) {
            field3370 = null;
        }
        field3366++;
        return new class235[] { class517.field7028, class727.field9987, class209.field3127, class333.field4510, class204.field3075, class177.field2788 };
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V", line = 523)
    public static final void method1579(int arg0) {
        field3369++;
        if (arg0 != -97) {
            field3370 = null;
        }
        if (class753.field10398 == 3) {
            class139.method1142(2, 4);
        } else if (class753.field10398 == 7) {
            class139.method1142(2, 8);
        } else if (class753.field10398 == 10) {
            class139.method1142(2, 11);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "()V", line = 547)
    public static final void method1580() {
        for (int var0 = 0; var0 < class171.field2726; var0++) {
            class597 var1 = class22.field466[var0];
            class682.method3846(var1, true);
            class22.field466[var0] = null;
        }
        class171.field2726 = 0;
    }
}
