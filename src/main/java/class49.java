import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class49 extends class69 {

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public static int field588 = 100;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "Lqk;")
    private static class1 field584 = new class1(47, 3);

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "[I")
    public static int[] field593 = new int[1000];

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "J")
    public long field581;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "Loo;")
    public static class12 field592;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "Llm;")
    public class49 field586;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "Llm;")
    public class49 field591;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lqd;IZ)V", line = 9)
    public static final void method412(class574 arg0, int arg1, boolean arg2) {
        if (arg0.field8071) {
            if (arg0.field8070 < 0 || class83.method633(arg0.field8070, 0, arg0.field8069)) {
                if (arg2) {
                    class277.method1802(-127, null, arg0.field8080, arg0.field8081, arg0.field8084, arg0.field8072);
                } else {
                    class542.method3217(arg0.field8081, arg0.field8084, arg0.field8078, arg0.field8070, arg0.field8080, -1, 1, arg0.field8072, arg0.field8069);
                }
                arg0.method527(arg1 ^ 0xFFFFD422);
            }
        } else if (arg0.field8076 && arg0.field8080 >= 1 && arg0.field8081 >= 1 && (class741.field10208 - 2) >= arg0.field8080 && (class525.field7224 - 2) >= arg0.field8081 && (arg0.field8075 < 0 || class83.method633(arg0.field8075, 0, arg0.field8074))) {
            if (arg2) {
                class277.method1802(arg1 - 122, arg0.field8068, arg0.field8080, arg0.field8081, arg0.field8084, arg0.field8072);
            } else {
                class542.method3217(arg0.field8081, arg0.field8084, arg0.field8083, arg0.field8075, arg0.field8080, -1, arg1, arg0.field8072, arg0.field8074);
            }
            arg0.field8076 = false;
            if (!arg2 && arg0.field8075 == arg0.field8070 && arg0.field8070 == -1) {
                arg0.method527(-11229);
            } else if (!arg2 && arg0.field8075 == arg0.field8070 && arg0.field8083 == arg0.field8078 && arg0.field8074 == arg0.field8069) {
                arg0.method527(-11229);
            }
        }
        if (arg1 != 1) {
            field588 = 51;
        }
        field582++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IBLpja;I)V", line = 62)
    public static final void method413(int arg0, byte arg1, class171 arg2, int arg3) {
        field583++;
        if (arg2 == null || class646.field9038.field2103 == arg2) {
            return;
        }
        int var4 = arg2.field2181;
        int var5 = arg2.field2184;
        int var6 = arg2.field2174;
        int var7 = (int) arg2.field2179;
        long var8 = arg2.field2179;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 5) {
            class68.field753 = arg3;
            class381.field5457 = 2;
            class450.field6290 = 0;
            class461.field6442++;
            class100.field1167 = arg0;
            class116 var10 = class248.method1672(class84.field1023, class601.field8406, -20647);
            var10.field1575.method2981((int) (var8 >>> 32) & Integer.MAX_VALUE, 128);
            var10.field1575.method2977(false, var5 + class236.field3535);
            var10.field1575.method2988((byte) -128, class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0);
            var10.field1575.method2986(class444.field6151 + var4, 118);
            class443.method2655(0, var10);
            class302.method1978(var4, (byte) 18, var5, var8);
        }
        if (var6 == 20 || var6 == 1008) {
            class212.method1331(var4, var5, arg2.field2169, -99, var7);
        }
        if (var6 == 58) {
            class685 var11 = (class685) class450.field6288.method3669(false, (long) var7);
            if (var11 != null) {
                class68.field753 = arg3;
                class359 var12 = var11.field9573;
                class381.field5457 = 2;
                class16.field92++;
                class450.field6290 = 0;
                class100.field1167 = arg0;
                class116 var13 = class248.method1672(class84.field1023, class140.field1785, -20647);
                var13.field1575.method3001(class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0, 1719860128);
                var13.field1575.method2977(false, var7);
                class443.method2655(0, var13);
                class461.method2775(-2, true, 0, var12.method3744(1), -2, var12.field9214[0], 0, var12.method3744(1), var12.field9219[0]);
            }
        }
        if (var6 == 1012 || var6 == 1002 || var6 == 1007 || var6 == 1009 || var6 == 1006) {
            class32.method265(1002, var7, var4, var6);
        }
        if (var6 == 11 && class330.field4635 == null) {
            class610.method3535((byte) 69, var5, var4);
            class330.field4635 = class446.method2705(var5, -128, var4);
            class43.method336(-1, class330.field4635);
        }
        if (var6 == 23) {
            class685 var14 = (class685) class450.field6288.method3669(false, (long) var7);
            if (var14 != null) {
                class450.field6290 = 0;
                class100.field1167 = arg0;
                class587.field8278++;
                class359 var15 = var14.field9573;
                class68.field753 = arg3;
                class381.field5457 = 2;
                class116 var16 = class248.method1672(class84.field1023, class637.field8956, -20647);
                var16.field1575.method2977(false, var7);
                var16.field1575.method3001(class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0, 1719860128);
                class443.method2655(0, var16);
                class461.method2775(-2, true, 0, var15.method3744(1), -2, var15.field9214[0], 0, var15.method3744(1), var15.field9219[0]);
            }
        }
        if (var6 == 2) {
            class723 var17 = class413.field5787[var7];
            if (var17 != null) {
                class518.field7154++;
                class68.field753 = arg3;
                class450.field6290 = 0;
                class100.field1167 = arg0;
                class381.field5457 = 2;
                class116 var18 = class248.method1672(class84.field1023, field584, -20647);
                var18.field1575.method3005(255, class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0);
                var18.field1575.method2981(var7, 128);
                class443.method2655(0, var18);
                class461.method2775(-2, true, 0, var17.method3744(1), -2, var17.field9214[0], 0, var17.method3744(1), var17.field9219[0]);
            }
        }
        if (var6 == 52) {
            class723 var19 = class413.field5787[var7];
            if (var19 != null) {
                class381.field5457 = 2;
                class450.field6290 = 0;
                class100.field1167 = arg0;
                class473.field6574++;
                class68.field753 = arg3;
                class116 var20 = class248.method1672(class84.field1023, class76.field852, -20647);
                var20.field1575.method2977(false, var7);
                var20.field1575.method3001(class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0, 1719860128);
                class443.method2655(0, var20);
                class461.method2775(-2, true, 0, var19.method3744(1), -2, var19.field9214[0], 0, var19.method3744(1), var19.field9219[0]);
            }
        }
        if (var6 == 1003) {
            class68.field753 = arg3;
            class100.field1167 = arg0;
            class381.field5457 = 2;
            class654.field9191++;
            class450.field6290 = 0;
            class116 var21 = class248.method1672(class84.field1023, class392.field5580, -20647);
            var21.field1575.method2986(var7, 107);
            class443.method2655(0, var21);
        }
        if (var6 == 44) {
            class100.field1167 = arg0;
            class381.field5457 = 2;
            class22.field192++;
            class450.field6290 = 0;
            class68.field753 = arg3;
            class116 var22 = class248.method1672(class84.field1023, class658.field9278, -20647);
            var22.field1575.method2986(Integer.MAX_VALUE & (int) (var8 >>> 32), 124);
            var22.field1575.method2977(false, class444.field6151 + var4);
            var22.field1575.method2981(var5 + class236.field3535, 128);
            var22.field1575.method3035(class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0, (byte) 23);
            class443.method2655(0, var22);
            class302.method1978(var4, (byte) 79, var5, var8);
        }
        if (var6 == 1001) {
            class381.field5457 = 2;
            class100.field1167 = arg0;
            class148.field1904++;
            class450.field6290 = 0;
            class68.field753 = arg3;
            class116 var23 = class248.method1672(class84.field1023, class206.field2888, -20647);
            var23.field1575.method2977(false, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var23.field1575.method2988((byte) -81, class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0);
            var23.field1575.method2986(var4 + class444.field6151, -99);
            var23.field1575.method2986(class236.field3535 + var5, -43);
            class443.method2655(0, var23);
            class302.method1978(var4, (byte) 82, var5, var8);
        }
        if (var6 == 8) {
            class723 var24 = class413.field5787[var7];
            if (var24 != null) {
                class650.field9087++;
                class381.field5457 = 2;
                class68.field753 = arg3;
                class450.field6290 = 0;
                class100.field1167 = arg0;
                class116 var25 = class248.method1672(class84.field1023, class353.field5114, -20647);
                var25.field1575.method2988((byte) -102, class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0);
                var25.field1575.method2977(false, var7);
                var25.field1575.method3003(class539.field7462, -23061);
                var25.field1575.method2986(class81.field913, -58);
                var25.field1575.method2977(false, class326.field4586);
                class443.method2655(0, var25);
                class461.method2775(-2, true, 0, var24.method3744(1), -2, var24.field9214[0], 0, var24.method3744(1), var24.field9219[0]);
            }
        }
        if (var6 == 3) {
            class723 var26 = class413.field5787[var7];
            if (var26 != null) {
                class68.field753 = arg3;
                class518.field7154++;
                class450.field6290 = 0;
                class381.field5457 = 2;
                class100.field1167 = arg0;
                class116 var27 = class248.method1672(class84.field1023, class539.field7460, -20647);
                var27.field1575.method3005(255, class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0);
                var27.field1575.method2977(false, var7);
                class443.method2655(0, var27);
                class461.method2775(-2, true, 0, var26.method3744(1), -2, var26.field9214[0], 0, var26.method3744(1), var26.field9219[0]);
            }
        }
        if (var6 == 13) {
            class685 var28 = (class685) class450.field6288.method3669(false, (long) var7);
            if (var28 != null) {
                class381.field5457 = 2;
                class359 var29 = var28.field9573;
                class68.field753 = arg3;
                class100.field1167 = arg0;
                class450.field6290 = 0;
                class540.field7467++;
                class116 var30 = class248.method1672(class84.field1023, class564.field7977, -20647);
                var30.field1575.method3005(255, class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0);
                var30.field1575.method2986(var7, -70);
                class443.method2655(0, var30);
                class461.method2775(-2, true, 0, var29.method3744(1), -2, var29.field9214[0], 0, var29.method3744(1), var29.field9219[0]);
            }
        }
        if (var6 == 60) {
            class100.field1167 = arg0;
            class68.field753 = arg3;
            class738.field10170++;
            class381.field5457 = 2;
            class450.field6290 = 0;
            class116 var31 = class248.method1672(class84.field1023, class72.field782, -20647);
            var31.field1575.method2981(class236.field3535 + var5, 128);
            var31.field1575.method2986((int) (var8 >>> 32) & Integer.MAX_VALUE, 122);
            var31.field1575.method2977(false, class444.field6151 + var4);
            var31.field1575.method3001(class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0, 1719860128);
            class443.method2655(0, var31);
            class302.method1978(var4, (byte) 24, var5, var8);
        }
        if (var6 == 46) {
            class450.field6290 = 0;
            class381.field5457 = 2;
            class100.field1167 = arg0;
            class68.field753 = arg3;
            class216.field2980++;
            class116 var32 = class248.method1672(class84.field1023, class707.field9823, -20647);
            var32.field1575.method2977(false, var7);
            var32.field1575.method2977(false, class326.field4586);
            var32.field1575.method2991(-2141775344, class539.field7462);
            var32.field1575.method2986(class81.field913, -73);
            var32.field1575.method3001(class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0, 1719860128);
            var32.field1575.method2981(var4 + class444.field6151, 128);
            var32.field1575.method3044(class236.field3535 + var5, -128);
            class443.method2655(0, var32);
            class579.method3396(var4, var5, (byte) -114);
        }
        if (var6 == 1011) {
            class68.field753 = arg3;
            class381.field5457 = 2;
            class461.field6449++;
            class100.field1167 = arg0;
            class450.field6290 = 0;
            class116 var33 = class248.method1672(class84.field1023, class663.field9325, -20647);
            var33.field1575.method2986(var7, -49);
            class443.method2655(0, var33);
        }
        if (arg1 <= 75) {
            method415(-18);
        }
        if (var6 == 47) {
            class685 var34 = (class685) class450.field6288.method3669(false, (long) var7);
            if (var34 != null) {
                class450.field6290 = 0;
                class453.field6311++;
                class359 var35 = var34.field9573;
                class100.field1167 = arg0;
                class68.field753 = arg3;
                class381.field5457 = 2;
                class116 var36 = class248.method1672(class84.field1023, class24.field227, -20647);
                var36.field1575.method2981(class326.field4586, 128);
                var36.field1575.method2996(class539.field7462, true);
                var36.field1575.method3044(var7, 59);
                var36.field1575.method2986(class81.field913, -99);
                var36.field1575.method2988((byte) -116, class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0);
                class443.method2655(0, var36);
                class461.method2775(-2, true, 0, var35.method3744(1), -2, var35.field9214[0], 0, var35.method3744(1), var35.field9219[0]);
            }
        }
        if (var6 == 22) {
            class115 var37 = class446.method2705(var5, -115, var4);
            if (var37 != null) {
                class705.method3982((byte) -124, var37);
            }
        }
        if (var6 == 53) {
            class723 var38 = class413.field5787[var7];
            if (var38 != null) {
                class68.field753 = arg3;
                class381.field5457 = 2;
                class100.field1167 = arg0;
                class450.field6290 = 0;
                class461.field6450++;
                class116 var39 = class248.method1672(class84.field1023, class603.field8456, -20647);
                var39.field1575.method3005(255, class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0);
                var39.field1575.method3044(var7, -17);
                class443.method2655(0, var39);
                class461.method2775(-2, true, 0, var38.method3744(1), -2, var38.field9214[0], 0, var38.method3744(1), var38.field9219[0]);
            }
        }
        if (var6 == 48) {
            class723 var40 = class413.field5787[var7];
            if (var40 != null) {
                class450.field6290 = 0;
                class100.field1167 = arg0;
                class95.field1110++;
                class381.field5457 = 2;
                class68.field753 = arg3;
                class116 var41 = class248.method1672(class84.field1023, class59.field683, -20647);
                var41.field1575.method3005(255, class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0);
                var41.field1575.method3044(var7, 109);
                class443.method2655(0, var41);
                class461.method2775(-2, true, 0, var40.method3744(1), -2, var40.field9214[0], 0, var40.method3744(1), var40.field9219[0]);
            }
        }
        if (var6 == 51) {
            class685 var42 = (class685) class450.field6288.method3669(false, (long) var7);
            if (var42 != null) {
                class130.field1681++;
                class100.field1167 = arg0;
                class450.field6290 = 0;
                class381.field5457 = 2;
                class68.field753 = arg3;
                class359 var43 = var42.field9573;
                class116 var44 = class248.method1672(class84.field1023, class288.field4219, -20647);
                var44.field1575.method3001(class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0, 1719860128);
                var44.field1575.method2977(false, var7);
                class443.method2655(0, var44);
                class461.method2775(-2, true, 0, var43.method3744(1), -2, var43.field9214[0], 0, var43.method3744(1), var43.field9219[0]);
            }
        }
        if (var6 == 16) {
            class381.field5457 = 2;
            class68.field753 = arg3;
            class450.field6290 = 0;
            class100.field1167 = arg0;
            class140.field1788++;
            class116 var45 = class248.method1672(class84.field1023, class752.field10371, -20647);
            var45.field1575.method2977(false, var4 + class444.field6151);
            var45.field1575.method2977(false, class236.field3535 + var5);
            var45.field1575.method3035(class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0, (byte) 125);
            var45.field1575.method2977(false, var7);
            class443.method2655(0, var45);
            class579.method3396(var4, var5, (byte) -114);
        }
        if (var6 == 50) {
            class450.field6290 = 0;
            class381.field5457 = 2;
            class100.field1167 = arg0;
            class68.field753 = arg3;
            class164.field2094++;
            class116 var46 = class248.method1672(class84.field1023, class717.field9938, -20647);
            var46.field1575.method2977(false, var5 + class236.field3535);
            var46.field1575.method3001(class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0, 1719860128);
            var46.field1575.method2977(false, class444.field6151 + var4);
            var46.field1575.method2977(false, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class443.method2655(0, var46);
            class302.method1978(var4, (byte) 103, var5, var8);
        }
        if (var6 == 57) {
            class115 var47 = class446.method2705(var5, -114, var4);
            if (var47 != null) {
                class76.method561(-1);
                class174 var48 = client.method779(var47);
                class646.method3700(5, var47, var48.field2203, var48.method1112((byte) 71));
                class56.field656 = class548.method3244(var47, 11969);
                if (class56.field656 == null) {
                    class56.field656 = "Null";
                }
                class523.field7205 = var47.field1504 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 12) {
            class100.field1167 = arg0;
            class68.field753 = arg3;
            class381.field5457 = 2;
            class332.field4654++;
            class450.field6290 = 0;
            class116 var49 = class248.method1672(class84.field1023, class378.field5430, -20647);
            var49.field1575.method3044(class236.field3535 + var5, -128);
            var49.field1575.method3005(255, class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0);
            var49.field1575.method3025(-1925984712, class539.field7462);
            var49.field1575.method2977(false, class326.field4586);
            var49.field1575.method3044(class444.field6151 + var4, 46);
            var49.field1575.method2986(class81.field913, 105);
            var49.field1575.method2981((int) (var8 >>> 32) & Integer.MAX_VALUE, 128);
            class443.method2655(0, var49);
            class302.method1978(var4, (byte) 65, var5, var8);
        }
        if (var6 == 10) {
            class100.field1167 = arg0;
            class418.field5819++;
            class450.field6290 = 0;
            class68.field753 = arg3;
            class381.field5457 = 2;
            class116 var50 = class248.method1672(class84.field1023, class100.field1173, -20647);
            var50.field1575.method3044(var7, -121);
            var50.field1575.method2981(class236.field3535 + var5, 128);
            var50.field1575.method3035(class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0, (byte) 112);
            var50.field1575.method2986(class444.field6151 + var4, 119);
            class443.method2655(0, var50);
            class579.method3396(var4, var5, (byte) -114);
        }
        if (var6 == 25) {
            class723 var51 = class413.field5787[var7];
            if (var51 != null) {
                class100.field1167 = arg0;
                class381.field5457 = 2;
                class68.field753 = arg3;
                class450.field6290 = 0;
                class620.field8695++;
                class116 var52 = class248.method1672(class84.field1023, class422.field5871, -20647);
                var52.field1575.method3035(class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0, (byte) 72);
                var52.field1575.method2977(false, var7);
                class443.method2655(0, var52);
                class461.method2775(-2, true, 0, var51.method3744(1), -2, var51.field9214[0], 0, var51.method3744(1), var51.field9219[0]);
            }
        }
        if (var6 == 18) {
            class381.field5457 = 2;
            class100.field1167 = arg0;
            class450.field6290 = 0;
            class311.field4473++;
            class68.field753 = arg3;
            class116 var53 = class248.method1672(class84.field1023, class188.field2345, -20647);
            var53.field1575.method2977(false, var5 + class236.field3535);
            var53.field1575.method2986(var7, 109);
            var53.field1575.method2977(false, var4 + class444.field6151);
            var53.field1575.method2988((byte) -79, class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0);
            class443.method2655(0, var53);
            class579.method3396(var4, var5, (byte) -114);
        }
        if (var6 == 19) {
            class723 var54 = class413.field5787[var7];
            if (var54 != null) {
                class237.field3564++;
                class450.field6290 = 0;
                class100.field1167 = arg0;
                class68.field753 = arg3;
                class381.field5457 = 2;
                class116 var55 = class248.method1672(class84.field1023, class59.field684, -20647);
                var55.field1575.method3035(class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0, (byte) 67);
                var55.field1575.method3044(var7, 119);
                class443.method2655(0, var55);
                class461.method2775(-2, true, 0, var54.method3744(1), -2, var54.field9214[0], 0, var54.method3744(1), var54.field9219[0]);
            }
        }
        if (var6 == 6) {
            class100.field1167 = arg0;
            class68.field753 = arg3;
            class450.field6290 = 0;
            class381.field5457 = 2;
            class650.field9087++;
            class116 var56 = class248.method1672(class84.field1023, class353.field5114, -20647);
            var56.field1575.method2988((byte) -116, class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0);
            var56.field1575.method2977(false, class724.field10031.field9186);
            var56.field1575.method3003(class539.field7462, -23061);
            var56.field1575.method2986(class81.field913, 120);
            var56.field1575.method2977(false, class326.field4586);
            class443.method2655(0, var56);
        }
        if (var6 == 21) {
            class450.field6290 = 0;
            class100.field1167 = arg0;
            class68.field753 = arg3;
            class589.field8308++;
            class381.field5457 = 2;
            class116 var57 = class248.method1672(class84.field1023, class642.field9020, -20647);
            var57.field1575.method3044(var4 + class444.field6151, 80);
            var57.field1575.method3044(var5 + class236.field3535, -127);
            var57.field1575.method2977(false, var7);
            var57.field1575.method3001(class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0, 1719860128);
            class443.method2655(0, var57);
            class579.method3396(var4, var5, (byte) -114);
        }
        if (var6 == 4) {
            class685 var58 = (class685) class450.field6288.method3669(false, (long) var7);
            if (var58 != null) {
                class68.field753 = arg3;
                class381.field5457 = 2;
                class59.field681++;
                class100.field1167 = arg0;
                class359 var59 = var58.field9573;
                class450.field6290 = 0;
                class116 var60 = class248.method1672(class84.field1023, class240.field3575, -20647);
                var60.field1575.method3005(255, class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0);
                var60.field1575.method3044(var7, -121);
                class443.method2655(0, var60);
                class461.method2775(-2, true, 0, var59.method3744(1), -2, var59.field9214[0], 0, var59.method3744(1), var59.field9219[0]);
            }
        }
        if (var6 == 49) {
            class723 var61 = class413.field5787[var7];
            if (var61 != null) {
                class1.field9++;
                class100.field1167 = arg0;
                class68.field753 = arg3;
                class450.field6290 = 0;
                class381.field5457 = 2;
                class116 var62 = class248.method1672(class84.field1023, class769.field10587, -20647);
                var62.field1575.method2981(var7, 128);
                var62.field1575.method3035(class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0, (byte) 123);
                class443.method2655(0, var62);
                class461.method2775(-2, true, 0, var61.method3744(1), -2, var61.field9214[0], 0, var61.method3744(1), var61.field9219[0]);
            }
        }
        if (var6 == 17) {
            class723 var63 = class413.field5787[var7];
            if (var63 != null) {
                class381.field5457 = 2;
                class213.field2930++;
                class68.field753 = arg3;
                class450.field6290 = 0;
                class100.field1167 = arg0;
                class116 var64 = class248.method1672(class84.field1023, class357.field5142, -20647);
                var64.field1575.method2986(var7, -32);
                var64.field1575.method3035(class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0, (byte) 61);
                class443.method2655(0, var64);
                class461.method2775(-2, true, 0, var63.method3744(1), -2, var63.field9214[0], 0, var63.method3744(1), var63.field9219[0]);
            }
        }
        if (var6 == 30) {
            class723 var65 = class413.field5787[var7];
            if (var65 != null) {
                class450.field6290 = 0;
                class100.field1167 = arg0;
                class518.field7154++;
                class381.field5457 = 2;
                class68.field753 = arg3;
                class116 var66 = class248.method1672(class84.field1023, class245.field3631, -20647);
                var66.field1575.method2977(false, var7);
                var66.field1575.method2988((byte) -83, class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0);
                class443.method2655(0, var66);
                class461.method2775(-2, true, 0, var65.method3744(1), -2, var65.field9214[0], 0, var65.method3744(1), var65.field9219[0]);
            }
        }
        if (var6 == 15) {
            class68.field753 = arg3;
            class381.field5457 = 1;
            class134.field1713++;
            class100.field1167 = arg0;
            class450.field6290 = 0;
            class116 var67 = class248.method1672(class84.field1023, class62.field702, -20647);
            var67.field1575.method2981(class236.field3535 + var5, 128);
            var67.field1575.method2977(false, class81.field913);
            var67.field1575.method2991(-2141775344, class539.field7462);
            var67.field1575.method3044(class444.field6151 + var4, 26);
            var67.field1575.method3044(class326.field4586, -122);
            class443.method2655(0, var67);
            class461.method2775(-2, true, 0, 1, -4, var5, 0, 1, var4);
        }
        if (var6 == 1004) {
            class100.field1167 = arg0;
            class381.field5457 = 2;
            class68.field753 = arg3;
            class450.field6290 = 0;
            class685 var68 = (class685) class450.field6288.method3669(false, (long) var7);
            if (var68 != null) {
                class359 var69 = var68.field9573;
                class636 var70 = var69.field5172;
                if (var70.field8872 != null) {
                    var70 = var70.method3650(class173.field2192, (byte) 55);
                }
                if (var70 != null) {
                    class350.field5093++;
                    class116 var71 = class248.method1672(class84.field1023, class675.field9466, -20647);
                    var71.field1575.method2986(var70.field8931, -96);
                    class443.method2655(0, var71);
                }
            }
        }
        if (var6 == 45) {
            if (class597.field8370 > 0 && class479.field6647.method273(82, Integer.MAX_VALUE) && class479.field6647.method273(81, Integer.MAX_VALUE)) {
                class250.method1680(class444.field6151 + var4, class236.field3535 - -var5, class724.field10031.field3467, (byte) -83);
            } else {
                class116 var72 = class236.method1612(var7, var5, (byte) 83, var4);
                if (var7 == 1) {
                    var72.field1575.method3005(255, -1);
                    var72.field1575.method3005(255, -1);
                    var72.field1575.method2986((int) class702.field9790, -57);
                    var72.field1575.method3005(255, 57);
                    var72.field1575.method3005(255, class703.field9795);
                    var72.field1575.method3005(255, class686.field9577);
                    var72.field1575.method3005(255, 89);
                    var72.field1575.method2986(class724.field10031.field3470, -33);
                    var72.field1575.method2986(class724.field10031.field3460, -5);
                    var72.field1575.method3005(255, 63);
                } else {
                    class68.field753 = arg3;
                    class100.field1167 = arg0;
                    class381.field5457 = 1;
                    class450.field6290 = 0;
                }
                class443.method2655(0, var72);
                class461.method2775(-2, true, 0, 1, -4, var5, 0, 1, var4);
            }
        }
        if (var6 == 59) {
            if (class597.field8370 > 0 && class479.field6647.method273(82, Integer.MAX_VALUE) && class479.field6647.method273(81, Integer.MAX_VALUE)) {
                class250.method1680(class444.field6151 + var4, class236.field3535 - -var5, class724.field10031.field3467, (byte) -73);
            } else {
                class325.field4579++;
                class450.field6290 = 0;
                class381.field5457 = 1;
                class100.field1167 = arg0;
                class68.field753 = arg3;
                class116 var73 = class248.method1672(class84.field1023, class269.field3900, -20647);
                var73.field1575.method3044(class444.field6151 + var4, 30);
                var73.field1575.method2977(false, class236.field3535 + var5);
                class443.method2655(0, var73);
            }
        }
        if (var6 == 9) {
            class381.field5457 = 2;
            class100.field1167 = arg0;
            class68.field753 = arg3;
            class473.field6553++;
            class450.field6290 = 0;
            class116 var74 = class248.method1672(class84.field1023, class425.field5914, -20647);
            var74.field1575.method2981(var5 + class236.field3535, 128);
            var74.field1575.method2981(class444.field6151 + var4, 128);
            var74.field1575.method2977(false, var7);
            var74.field1575.method3001(class479.field6647.method273(82, Integer.MAX_VALUE) ? 1 : 0, 1719860128);
            class443.method2655(0, var74);
            class579.method3396(var4, var5, (byte) -114);
        }
        if (class773.field10644) {
            class76.method561(-1);
        }
        if (class775.field10679 != null && class752.field10373 == 0) {
            class43.method336(-1, class775.field10679);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZIII)V", line = 911)
    public static final void method414(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field590++;
        if (class718.method4015(arg4, 109)) {
            class109.method802(arg1, arg3 ^ 0xFFFFA318, arg2, arg3, arg0, class609.field8594[arg4]);
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V", line = 925)
    public static void method415(int arg0) {
        field592 = null;
        if (arg0 == -4480) {
            field593 = null;
            field584 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)V", line = 938)
    public final void method416(int arg0) {
        field585++;
        if (this.field586 == null) {
            return;
        }
        this.field586.field591 = this.field591;
        this.field591.field586 = this.field586;
        this.field586 = null;
        if (arg0 == 9867) {
            this.field591 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)Z", line = 967)
    public final boolean method417(byte arg0) {
        field589++;
        if (arg0 > -71) {
            this.method417((byte) 39);
        }
        return this.field586 != null;
    }
}
