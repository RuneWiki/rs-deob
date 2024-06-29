import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class224 implements class90 {

    @OriginalMember(owner = "client!gca", name = "n", descriptor = "Lpu;")
    private class522 field3164;

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "Lul;")
    private class531 field3159;

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3152 = "";

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "I")
    public static int field3153 = 1338;

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "Lrw;")
    public static class703 field3156 = new class703(7, 2);

    @OriginalMember(owner = "client!gca", name = "p", descriptor = "I")
    public static int field3166 = 0;

    @OriginalMember(owner = "client!gca", name = "q", descriptor = "Lrw;")
    public static class703 field3167 = new class703(2, 2);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!gca", name = "o", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!gca", name = "r", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "Lf;")
    private class702 field3162;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V", line = 5)
    public final void method420(byte arg0) {
        this.field3162 = class195.method1321((byte) -70, this.field3159.field7445, this.field3164);
        if (arg0 == 67) {
            field3155++;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(FFBF)I", line = 17)
    public static final int method1478(float arg0, float arg1, byte arg2, float arg3) {
        field3165++;
        float var4 = arg3 < 0.0F ? -arg3 : arg3;
        float var5 = (arg1 < 0.0F) ? -arg1 : arg1;
        if (arg2 != 62) {
            field3156 = null;
        }
        float var6 = arg0 < 0.0F ? -arg0 : arg0;
        if (var4 < var5 && var5 > var6) {
            return (arg1 > 0.0F) ? 0 : 1;
        } else if (var6 > var4 && var6 > var5) {
            return (arg0 > 0.0F) ? 2 : 3;
        } else if (arg3 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZI)Z", line = 61)
    public static final boolean method1479(boolean arg0, int arg1) {
        if (arg1 != 17016) {
            method1478(0.9297099F, 0.023229966F, (byte) 27, -0.71816117F);
        }
        field3168++;
        boolean var2 = class282.field4228.method127();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class282.field4228.method150();
        } else if (!class282.field4228.method186()) {
            arg0 = false;
        }
        if (var2 == arg0) {
            return false;
        } else {
            class287.field4270.field3700 = arg0;
            class287.field4270.method2753(false, class368.field5267);
            return true;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V", line = 99)
    public static void method1480(int arg0) {
        field3167 = null;
        field3156 = null;
        if (arg0 != 2) {
            method1482((byte) -110, null);
        }
        field3152 = null;
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(B)Z", line = 112)
    public final boolean method419(byte arg0) {
        if (arg0 <= 56) {
            field3167 = null;
        }
        field3163++;
        return this.field3164.method2997((byte) -95, this.field3159.field7445);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lwt;IIZ)V", line = 123)
    public static final void method1481(class279 arg0, int arg1, int arg2, boolean arg3) {
        field3158++;
        if (arg0 == null || class663.field9367.field716 == arg0) {
            return;
        }
        int var4 = arg0.field4219;
        int var5 = arg0.field4218;
        int var6 = arg0.field4213;
        int var7 = (int) arg0.field4208;
        long var8 = arg0.field4208;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 51) {
            class491 var10 = class141.field2087[var7];
            if (var10 != null) {
                class635.field8980 = arg1;
                class574.field8079 = 2;
                class569.field8013 = arg2;
                class408.field5958++;
                class141.field2080 = 0;
                class135 var11 = class688.method3794(class689.field9704, class583.field8198, (byte) 38);
                var11.field1978.method3853((byte) 51, class603.field8514.method1364(!arg3, 82) ? 1 : 0);
                var11.field1978.method3865(-1449382360, var7);
                class19.method223(var11, 0);
                class229.method1580(var10.field6262[0], var10.method2553((byte) 115), -2, var10.field6271[0], true, var10.method2553((byte) 96), 0, (byte) 51, 0);
            }
        }
        if (arg3) {
            field3166 = 29;
        }
        if (var6 == 1006) {
            class531.field7446++;
            class569.field8013 = arg2;
            class574.field8079 = 2;
            class141.field2080 = 0;
            class635.field8980 = arg1;
            class135 var12 = class688.method3794(class132.field1958, class583.field8198, (byte) 38);
            var12.field1978.method3852(false, var7);
            class19.method223(var12, 0);
        }
        if (var6 == 48) {
            if (class558.field7877 > 0 && class603.field8514.method1364(true, 82) && class603.field8514.method1364(!arg3, 81)) {
                class85.method748((byte) 124, class109.field1672 + var4, class648.field9106.field3019, class203.field2874 + var5);
            } else {
                class135 var13 = class629.method3507((byte) -103, var5, var4, var7);
                if (var7 == 1) {
                    var13.field1978.method3853((byte) 51, -1);
                    var13.field1978.method3853((byte) 51, -1);
                    var13.field1978.method3852(false, (int) class630.field8811);
                    var13.field1978.method3853((byte) 51, 57);
                    var13.field1978.method3853((byte) 51, class252.field3880);
                    var13.field1978.method3853((byte) 51, class287.field4280);
                    var13.field1978.method3853((byte) 51, 89);
                    var13.field1978.method3852(arg3, class648.field9106.field3024);
                    var13.field1978.method3852(false, class648.field9106.field3029);
                    var13.field1978.method3853((byte) 51, 63);
                } else {
                    class569.field8013 = arg2;
                    class574.field8079 = 1;
                    class141.field2080 = 0;
                    class635.field8980 = arg1;
                }
                class19.method223(var13, 0);
                class229.method1580(var5, 1, -4, var4, true, 1, 0, (byte) 51, 0);
            }
        }
        if (var6 == 44) {
            class491 var14 = class141.field2087[var7];
            if (var14 != null) {
                class635.field8980 = arg1;
                class636.field8999++;
                class569.field8013 = arg2;
                class574.field8079 = 2;
                class141.field2080 = 0;
                class135 var15 = class688.method3794(class448.field6477, class583.field8198, (byte) 38);
                var15.field1978.method3816(var7, -40);
                var15.field1978.method3853((byte) 51, class603.field8514.method1364(true, 82) ? 1 : 0);
                class19.method223(var15, 0);
                class229.method1580(var14.field6262[0], var14.method2553((byte) 76), -2, var14.field6271[0], true, var14.method2553((byte) 74), 0, (byte) 51, 0);
            }
        }
        if (var6 == 23) {
            class49 var16 = class639.method3557(var5, var4, 1);
            if (var16 != null) {
                class272.method1794(115);
                class132 var17 = client.method1767(var16);
                class431.method2573(0, var17.field1952, var17.method974(-2090995594), var16);
                class331.field4896 = class372.method2247(-107, var16);
                if (class331.field4896 == null) {
                    class331.field4896 = "Null";
                }
                class338.field4988 = var16.field928 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 3) {
            class569.field8013 = arg2;
            class367.field5252++;
            class141.field2080 = 0;
            class635.field8980 = arg1;
            class574.field8079 = 2;
            class135 var18 = class688.method3794(class666.field9403, class583.field8198, (byte) 38);
            var18.field1978.method3832(-32768, class603.field8514.method1364(!arg3, 82) ? 1 : 0);
            var18.field1978.method3860((byte) -114, class19.field223);
            var18.field1978.method3840(false, class654.field9181);
            var18.field1978.method3816(class189.field2716, -40);
            var18.field1978.method3816(class109.field1672 + var4, -111);
            var18.field1978.method3816(class203.field2874 + var5, -117);
            var18.field1978.method3865(-1449382360, var7);
            class19.method223(var18, 0);
            class322.method2011(var4, var5, 97);
        }
        if (var6 == 5) {
            class491 var19 = class141.field2087[var7];
            if (var19 != null) {
                class141.field2080 = 0;
                class569.field8013 = arg2;
                class635.field8980 = arg1;
                class310.field4592++;
                class574.field8079 = 2;
                class135 var20 = class688.method3794(class27.field392, class583.field8198, (byte) 38);
                var20.field1978.method3870(class603.field8514.method1364(!arg3, 82) ? 1 : 0, 2820);
                var20.field1978.method3865(-1449382360, var7);
                class19.method223(var20, 0);
                class229.method1580(var19.field6262[0], var19.method2553((byte) 117), -2, var19.field6271[0], true, var19.method2553((byte) 115), 0, (byte) 51, 0);
            }
        }
        if (var6 == 18) {
            class635.field8980 = arg1;
            class368.field5265++;
            class141.field2080 = 0;
            class574.field8079 = 2;
            class569.field8013 = arg2;
            class135 var21 = class688.method3794(class297.field4446, class583.field8198, (byte) 38);
            var21.field1978.method3816(class203.field2874 + var5, -112);
            var21.field1978.method3816(class109.field1672 + var4, -38);
            var21.field1978.method3852(false, var7);
            var21.field1978.method3871(!arg3, class603.field8514.method1364(true, 82) ? 1 : 0);
            class19.method223(var21, 0);
            class322.method2011(var4, var5, -68);
        }
        if (var6 == 13) {
            class16 var22 = (class16) class189.field2723.method1405((long) var7, (byte) -63);
            if (var22 != null) {
                class577 var23 = var22.field174;
                class68.field1240++;
                class574.field8079 = 2;
                class141.field2080 = 0;
                class635.field8980 = arg1;
                class569.field8013 = arg2;
                class135 var24 = class688.method3794(class341.field5004, class583.field8198, (byte) 38);
                var24.field1978.method3816(var7, -119);
                var24.field1978.method3870(class603.field8514.method1364(true, 82) ? 1 : 0, 2820);
                class19.method223(var24, 0);
                class229.method1580(var23.field6262[0], var23.method2553((byte) 96), -2, var23.field6271[0], true, var23.method2553((byte) 119), 0, (byte) 51, 0);
            }
        }
        if (var6 == 1001) {
            class277.field4191++;
            class574.field8079 = 2;
            class141.field2080 = 0;
            class569.field8013 = arg2;
            class635.field8980 = arg1;
            class135 var25 = class688.method3794(class534.field7494, class583.field8198, (byte) 38);
            var25.field1978.method3852(false, var7);
            class19.method223(var25, 0);
        }
        if (var6 == 6) {
            class635.field8980 = arg1;
            class574.field8079 = 2;
            class141.field2080 = 0;
            class264.field4010++;
            class569.field8013 = arg2;
            class135 var26 = class688.method3794(class369.field5274, class583.field8198, (byte) 38);
            var26.field1978.method3865(-1449382360, class203.field2874 + var5);
            var26.field1978.method3816(class189.field2716, -50);
            var26.field1978.method3868(class19.field223, -318419336);
            var26.field1978.method3870(class603.field8514.method1364(!arg3, 82) ? 1 : 0, 2820);
            var26.field1978.method3865(-1449382360, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var26.field1978.method3865(-1449382360, class654.field9181);
            var26.field1978.method3852(false, class109.field1672 + var4);
            class19.method223(var26, 0);
            class639.method3554(var5, var4, -713589548, var8);
        }
        if (var6 == 47) {
            class491 var27 = class141.field2087[var7];
            if (var27 != null) {
                class569.field8013 = arg2;
                class635.field8980 = arg1;
                class574.field8079 = 2;
                class141.field2080 = 0;
                class562.field7910++;
                class135 var28 = class688.method3794(class483.field6873, class583.field8198, (byte) 38);
                var28.field1978.method3853((byte) 51, class603.field8514.method1364(true, 82) ? 1 : 0);
                var28.field1978.method3865(-1449382360, var7);
                class19.method223(var28, 0);
                class229.method1580(var27.field6262[0], var27.method2553((byte) 82), -2, var27.field6271[0], true, var27.method2553((byte) 102), 0, (byte) 51, 0);
            }
        }
        if (var6 == 46) {
            class569.field8013 = arg2;
            class574.field8079 = 2;
            class635.field8980 = arg1;
            class141.field2080 = 0;
            class78.field1349++;
            class135 var29 = class688.method3794(class559.field7888, class583.field8198, (byte) 38);
            var29.field1978.method3852(false, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var29.field1978.method3852(false, var4 + class109.field1672);
            var29.field1978.method3852(false, class203.field2874 + var5);
            var29.field1978.method3832(-32768, class603.field8514.method1364(true, 82) ? 1 : 0);
            class19.method223(var29, 0);
            class639.method3554(var5, var4, -713589548, var8);
        }
        if (var6 == 57) {
            class491 var30 = class141.field2087[var7];
            if (var30 != null) {
                class141.field2080 = 0;
                class645.field9062++;
                class574.field8079 = 2;
                class635.field8980 = arg1;
                class569.field8013 = arg2;
                class135 var31 = class688.method3794(class603.field8523, class583.field8198, (byte) 38);
                var31.field1978.method3840(false, var7);
                var31.field1978.method3871(!arg3, class603.field8514.method1364(true, 82) ? 1 : 0);
                class19.method223(var31, 0);
                class229.method1580(var30.field6262[0], var30.method2553((byte) 103), -2, var30.field6271[0], true, var30.method2553((byte) 103), 0, (byte) 51, 0);
            }
        }
        if (var6 == 21) {
            class49 var32 = class639.method3557(var5, var4, 1);
            if (var32 != null) {
                class282.method1830(var32, (byte) -95);
            }
        }
        if (var6 == 4) {
            class635.field8980 = arg1;
            class569.field8013 = arg2;
            class141.field2080 = 0;
            class574.field8079 = 2;
            class595.field8416++;
            class135 var33 = class688.method3794(class271.field4081, class583.field8198, (byte) 38);
            var33.field1978.method3865(-1449382360, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var33.field1978.method3840(false, var4 + class109.field1672);
            var33.field1978.method3853((byte) 51, class603.field8514.method1364(true, 82) ? 1 : 0);
            var33.field1978.method3840(false, class203.field2874 + var5);
            class19.method223(var33, 0);
            class639.method3554(var5, var4, -713589548, var8);
        }
        if (var6 == 2) {
            if (class558.field7877 > 0 && class603.field8514.method1364(true, 82) && class603.field8514.method1364(true, 81)) {
                class85.method748((byte) 85, class109.field1672 + var4, class648.field9106.field3019, class203.field2874 + var5);
            } else {
                class141.field2080 = 0;
                class569.field8013 = arg2;
                class233.field3624++;
                class574.field8079 = 1;
                class635.field8980 = arg1;
                class135 var34 = class688.method3794(class668.field9442, class583.field8198, (byte) 38);
                var34.field1978.method3816(class109.field1672 + var4, -96);
                var34.field1978.method3852(false, class203.field2874 + var5);
                class19.method223(var34, 0);
            }
        }
        if (var6 == 20) {
            class635.field8980 = arg1;
            class574.field8079 = 2;
            class392.field5802++;
            class141.field2080 = 0;
            class569.field8013 = arg2;
            class135 var35 = class688.method3794(class240.field3754, class583.field8198, (byte) 38);
            var35.field1978.method3865(-1449382360, var7);
            var35.field1978.method3853((byte) 51, class603.field8514.method1364(true, 82) ? 1 : 0);
            var35.field1978.method3852(false, class109.field1672 + var4);
            var35.field1978.method3840(false, var5 + class203.field2874);
            class19.method223(var35, 0);
            class322.method2011(var4, var5, -7);
        }
        if (var6 == 15) {
            class16 var36 = (class16) class189.field2723.method1405((long) var7, (byte) -107);
            if (var36 != null) {
                class574.field8079 = 2;
                class141.field2080 = 0;
                class577 var37 = var36.field174;
                class569.field8013 = arg2;
                class635.field8980 = arg1;
                class638.field9014++;
                class135 var38 = class688.method3794(class368.field5268, class583.field8198, (byte) 38);
                var38.field1978.method3853((byte) 51, class603.field8514.method1364(!arg3, 82) ? 1 : 0);
                var38.field1978.method3865(-1449382360, var7);
                class19.method223(var38, 0);
                class229.method1580(var37.field6262[0], var37.method2553((byte) 91), -2, var37.field6271[0], true, var37.method2553((byte) 114), 0, (byte) 51, 0);
            }
        }
        if (var6 == 58) {
            class491 var39 = class141.field2087[var7];
            if (var39 != null) {
                class635.field8980 = arg1;
                class574.field8079 = 2;
                class407.field5951++;
                class569.field8013 = arg2;
                class141.field2080 = 0;
                class135 var40 = class688.method3794(class21.field240, class583.field8198, (byte) 38);
                var40.field1978.method3832(-32768, class603.field8514.method1364(true, 82) ? 1 : 0);
                var40.field1978.method3865(-1449382360, var7);
                class19.method223(var40, 0);
                class229.method1580(var39.field6262[0], var39.method2553((byte) 102), -2, var39.field6271[0], true, var39.method2553((byte) 92), 0, (byte) 51, 0);
            }
        }
        if (var6 == 9 || var6 == 1010) {
            class53.method585(var7, var5, var4, -2, arg0.field4207);
        }
        if (var6 == 45) {
            class16 var41 = (class16) class189.field2723.method1405((long) var7, (byte) -91);
            if (var41 != null) {
                class635.field8980 = arg1;
                class577 var42 = var41.field174;
                class141.field2080 = 0;
                class569.field8013 = arg2;
                class77.field1337++;
                class574.field8079 = 2;
                class135 var43 = class688.method3794(class640.field9030, class583.field8198, (byte) 38);
                var43.field1978.method3816(var7, -88);
                var43.field1978.method3853((byte) 51, class603.field8514.method1364(true, 82) ? 1 : 0);
                class19.method223(var43, 0);
                class229.method1580(var42.field6262[0], var42.method2553((byte) 98), -2, var42.field6271[0], true, var42.method2553((byte) 105), 0, (byte) 51, 0);
            }
        }
        if (var6 == 1009) {
            class651.field9120++;
            class141.field2080 = 0;
            class574.field8079 = 2;
            class635.field8980 = arg1;
            class569.field8013 = arg2;
            class135 var44 = class688.method3794(class191.field2758, class583.field8198, (byte) 38);
            var44.field1978.method3832(-32768, class603.field8514.method1364(true, 82) ? 1 : 0);
            var44.field1978.method3865(-1449382360, class203.field2874 + var5);
            var44.field1978.method3852(false, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var44.field1978.method3840(false, class109.field1672 + var4);
            class19.method223(var44, 0);
            class639.method3554(var5, var4, -713589548, var8);
        }
        if (var6 == 1007) {
            class635.field8980 = arg1;
            class141.field2080 = 0;
            class569.field8013 = arg2;
            class574.field8079 = 2;
            class16 var45 = (class16) class189.field2723.method1405((long) var7, (byte) -127);
            if (var45 != null) {
                class577 var46 = var45.field174;
                class592 var47 = var46.field8121;
                if (var47.field8315 != null) {
                    var47 = var47.method3356(103, class61.field1163);
                }
                if (var47 != null) {
                    class56.field1080++;
                    class135 var48 = class688.method3794(class360.field5172, class583.field8198, (byte) 38);
                    var48.field1978.method3852(false, var47.field8316);
                    class19.method223(var48, 0);
                }
            }
        }
        if (var6 == 60) {
            class491 var49 = class141.field2087[var7];
            if (var49 != null) {
                class569.field8013 = arg2;
                class574.field8079 = 2;
                class141.field2080 = 0;
                class635.field8980 = arg1;
                class358.field5131++;
                class135 var50 = class688.method3794(class660.field9336, class583.field8198, (byte) 38);
                var50.field1978.method3832(-32768, class603.field8514.method1364(!arg3, 82) ? 1 : 0);
                var50.field1978.method3816(var7, -76);
                class19.method223(var50, 0);
                class229.method1580(var49.field6262[0], var49.method2553((byte) 108), -2, var49.field6271[0], true, var49.method2553((byte) 122), 0, (byte) 51, 0);
            }
        }
        if (var6 == 8) {
            class569.field8013 = arg2;
            class574.field8079 = 2;
            class635.field8980 = arg1;
            class500.field7081++;
            class141.field2080 = 0;
            class135 var51 = class688.method3794(class226.field3174, class583.field8198, (byte) 38);
            var51.field1978.method3852(false, var7);
            var51.field1978.method3816(var4 + class109.field1672, -103);
            var51.field1978.method3840(false, class203.field2874 + var5);
            var51.field1978.method3871(true, class603.field8514.method1364(true, 82) ? 1 : 0);
            class19.method223(var51, 0);
            class322.method2011(var4, var5, -86);
        }
        if (var6 == 49) {
            class16 var52 = (class16) class189.field2723.method1405((long) var7, (byte) -72);
            if (var52 != null) {
                class574.field8079 = 2;
                class569.field8013 = arg2;
                class635.field8980 = arg1;
                class577 var53 = var52.field174;
                class368.field5263++;
                class141.field2080 = 0;
                class135 var54 = class688.method3794(class681.field9609, class583.field8198, (byte) 38);
                var54.field1978.method3870(class603.field8514.method1364(true, 82) ? 1 : 0, 2820);
                var54.field1978.method3852(arg3, var7);
                class19.method223(var54, 0);
                class229.method1580(var53.field6262[0], var53.method2553((byte) 112), -2, var53.field6271[0], true, var53.method2553((byte) 109), 0, (byte) 51, 0);
            }
        }
        if (var6 == 12) {
            class574.field8079 = 2;
            class569.field8013 = arg2;
            class635.field8980 = arg1;
            class141.field2080 = 0;
            class328.field4852++;
            class135 var55 = class688.method3794(class132.field1953, class583.field8198, (byte) 38);
            var55.field1978.method3853((byte) 51, class603.field8514.method1364(!arg3, 82) ? 1 : 0);
            var55.field1978.method3852(false, var5 + class203.field2874);
            var55.field1978.method3840(false, var7);
            var55.field1978.method3852(false, class109.field1672 + var4);
            class19.method223(var55, 0);
            class322.method2011(var4, var5, 81);
        }
        if (var6 == 50 && class37.field634 == null) {
            class479.method2802(var5, var4, (byte) 113);
            class37.field634 = class639.method3557(var5, var4, 1);
            class563.method3215(true, class37.field634);
        }
        if (var6 == 1003 || var6 == 1004 || var6 == 1012 || var6 == 1011 || var6 == 1008) {
            class228.method1575(var6, var4, var7, 12229);
        }
        if (var6 == 30) {
            class16 var56 = (class16) class189.field2723.method1405((long) var7, (byte) -100);
            if (var56 != null) {
                class577 var57 = var56.field174;
                class574.field8079 = 2;
                class141.field2080 = 0;
                class312.field4617++;
                class569.field8013 = arg2;
                class635.field8980 = arg1;
                class135 var58 = class688.method3794(class244.field3793, class583.field8198, (byte) 38);
                var58.field1978.method3865(-1449382360, var7);
                var58.field1978.method3832(-32768, class603.field8514.method1364(true, 82) ? 1 : 0);
                class19.method223(var58, 0);
                class229.method1580(var57.field6262[0], var57.method2553((byte) 107), -2, var57.field6271[0], true, var57.method2553((byte) 123), 0, (byte) 51, 0);
            }
        }
        if (var6 == 25) {
            class16 var59 = (class16) class189.field2723.method1405((long) var7, (byte) -104);
            if (var59 != null) {
                class574.field8079 = 2;
                class569.field8013 = arg2;
                class635.field8980 = arg1;
                class141.field2080 = 0;
                class577 var60 = var59.field174;
                class377.field5362++;
                class135 var61 = class688.method3794(class139.field2040, class583.field8198, (byte) 38);
                var61.field1978.method3865(-1449382360, class654.field9181);
                var61.field1978.method3852(false, var7);
                var61.field1978.method3879(class19.field223, 128);
                var61.field1978.method3870(class603.field8514.method1364(!arg3, 82) ? 1 : 0, 2820);
                var61.field1978.method3816(class189.field2716, -102);
                class19.method223(var61, 0);
                class229.method1580(var60.field6262[0], var60.method2553((byte) 101), -2, var60.field6271[0], true, var60.method2553((byte) 87), 0, (byte) 51, 0);
            }
        }
        if (var6 == 19) {
            class491 var62 = class141.field2087[var7];
            if (var62 != null) {
                class255.field3912++;
                class635.field8980 = arg1;
                class569.field8013 = arg2;
                class574.field8079 = 2;
                class141.field2080 = 0;
                class135 var63 = class688.method3794(class493.field7008, class583.field8198, (byte) 38);
                var63.field1978.method3852(arg3, var7);
                var63.field1978.method3832(-32768, class603.field8514.method1364(!arg3, 82) ? 1 : 0);
                class19.method223(var63, 0);
                class229.method1580(var62.field6262[0], var62.method2553((byte) 122), -2, var62.field6271[0], true, var62.method2553((byte) 103), 0, (byte) 51, 0);
            }
        }
        if (var6 == 22) {
            class569.field8013 = arg2;
            class574.field8079 = 2;
            class190.field2732++;
            class635.field8980 = arg1;
            class141.field2080 = 0;
            class135 var64 = class688.method3794(class368.field5266, class583.field8198, (byte) 38);
            var64.field1978.method3816(class654.field9181, -85);
            var64.field1978.method3865(-1449382360, class189.field2716);
            var64.field1978.method3860((byte) -83, class19.field223);
            var64.field1978.method3852(false, class648.field9106.field6216);
            var64.field1978.method3871(!arg3, class603.field8514.method1364(true, 82) ? 1 : 0);
            class19.method223(var64, 0);
        }
        if (var6 == 11) {
            class141.field2080 = 0;
            class635.field8980 = arg1;
            class380.field5379++;
            class574.field8079 = 2;
            class569.field8013 = arg2;
            class135 var65 = class688.method3794(class17.field176, class583.field8198, (byte) 38);
            var65.field1978.method3853((byte) 51, class603.field8514.method1364(true, 82) ? 1 : 0);
            var65.field1978.method3852(arg3, class109.field1672 + var4);
            var65.field1978.method3852(false, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var65.field1978.method3865(-1449382360, var5 + class203.field2874);
            class19.method223(var65, 0);
            class639.method3554(var5, var4, -713589548, var8);
        }
        if (var6 == 16) {
            class635.field8980 = arg1;
            class574.field8079 = 2;
            class1.field7++;
            class569.field8013 = arg2;
            class141.field2080 = 0;
            class135 var66 = class688.method3794(class266.field4028, class583.field8198, (byte) 38);
            var66.field1978.method3853((byte) 51, class603.field8514.method1364(true, 82) ? 1 : 0);
            var66.field1978.method3840(false, var5 + class203.field2874);
            var66.field1978.method3840(false, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var66.field1978.method3840(false, class109.field1672 + var4);
            class19.method223(var66, 0);
            class639.method3554(var5, var4, -713589548, var8);
        }
        if (var6 == 59) {
            class491 var67 = class141.field2087[var7];
            if (var67 != null) {
                class569.field8013 = arg2;
                class635.field8980 = arg1;
                class141.field2080 = 0;
                class574.field8079 = 2;
                class190.field2732++;
                class135 var68 = class688.method3794(class368.field5266, class583.field8198, (byte) 38);
                var68.field1978.method3816(class654.field9181, -64);
                var68.field1978.method3865(-1449382360, class189.field2716);
                var68.field1978.method3860((byte) 120, class19.field223);
                var68.field1978.method3852(false, var7);
                var68.field1978.method3871(true, class603.field8514.method1364(true, 82) ? 1 : 0);
                class19.method223(var68, 0);
                class229.method1580(var67.field6262[0], var67.method2553((byte) 77), -2, var67.field6271[0], true, var67.method2553((byte) 104), 0, (byte) 51, 0);
            }
        }
        if (var6 == 10) {
            class569.field8013 = arg2;
            class635.field8980 = arg1;
            class141.field2080 = 0;
            class574.field8079 = 1;
            class398.field5889++;
            class135 var69 = class688.method3794(class414.field6015, class583.field8198, (byte) 38);
            var69.field1978.method3852(false, class189.field2716);
            var69.field1978.method3868(class19.field223, -318419336);
            var69.field1978.method3865(-1449382360, class203.field2874 + var5);
            var69.field1978.method3852(false, class109.field1672 + var4);
            var69.field1978.method3865(-1449382360, class654.field9181);
            class19.method223(var69, 0);
            class229.method1580(var5, 1, -4, var4, true, 1, 0, (byte) 51, 0);
        }
        if (var6 == 17) {
            class635.field8980 = arg1;
            class574.field8079 = 2;
            class141.field2080 = 0;
            class569.field8013 = arg2;
            class499.field7076++;
            class135 var70 = class688.method3794(class366.field5233, class583.field8198, (byte) 38);
            var70.field1978.method3871(true, class603.field8514.method1364(true, 82) ? 1 : 0);
            var70.field1978.method3840(false, var7);
            var70.field1978.method3816(class203.field2874 + var5, -48);
            var70.field1978.method3852(false, class109.field1672 + var4);
            class19.method223(var70, 0);
            class322.method2011(var4, var5, 118);
        }
        if (class245.field3797) {
            class272.method1794(108);
        }
        if (class80.field1358 != null && class108.field1667 == 0) {
            class563.method3215(!arg3, class80.field1358);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BZ)V", line = 929)
    public final void method421(byte arg0, boolean arg1) {
        field3161++;
        int var3 = -26 % ((arg0 - 7) / 56);
        if (!arg1) {
            return;
        }
        int var4 = class487.field6930 > class245.field3815 ? class487.field6930 : class245.field3815;
        int var5 = class544.field7651 < class31.field494 ? class31.field494 : class544.field7651;
        int var6 = this.field3162.method931();
        int var7 = this.field3162.method936();
        int var8 = 0;
        int var9 = var4;
        int var10 = var4 * var7 / var6;
        int var11 = (var5 - var10) / 2;
        if (var10 > var5) {
            var10 = var5;
            var11 = 0;
            var9 = var5 * var6 / var7;
            var8 = (var4 - var9) / 2;
        }
        this.field3162.method3908(var8, var11, var9, var10);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B[S)[S", line = 969)
    public static final short[] method1482(byte arg0, short[] arg1) {
        if (arg0 != 47) {
            field3166 = -40;
        }
        field3154++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class476.method2791(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lvg;I)Lvg;", line = 990)
    public static final class49 method1483(class49 arg0, int arg1) {
        field3160++;
        if (arg0.field885 != -1) {
            return class534.method3038(-107, arg0.field885);
        }
        if (arg1 != 21964) {
            field3152 = null;
        }
        int var2 = arg0.field977 >>> 16;
        class666 var3 = new class666(class654.field9178);
        for (class320 var4 = (class320) var3.method3681(0); var4 != null; var4 = (class320) var3.method3686(16431)) {
            if (var4.field4703 == var2) {
                return class534.method3038(-110, (int) var4.field9386);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lpu;Lul;)V", line = 1027)
    public class224(class522 arg0, class531 arg1) {
        this.field3164 = arg0;
        this.field3159 = arg1;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZZZLrb;)V", line = 1041)
    public static final void method1484(boolean arg0, boolean arg1, boolean arg2, class320 arg3) {
        field3151++;
        int var4 = arg3.field4703;
        int var5 = (int) arg3.field9386;
        arg3.method3678(-1);
        if (arg1) {
            class178.method1212(2, var4);
        }
        class338.method2130(var4, false);
        class49 var6 = class534.method3038(-87, var5);
        if (var6 != null) {
            class563.method3215(true, var6);
        }
        class485.method2818((byte) -68);
        if (!arg0 && class100.field1556 != -1) {
            class483.method2815(1, class100.field1556, -2064);
        }
        class666 var7 = new class666(class654.field9178);
        if (!arg2) {
            field3157 = 70;
        }
        for (class320 var8 = (class320) var7.method3681(0); var8 != null; var8 = (class320) var7.method3686(16431)) {
            if (!var8.method3675(arg2)) {
                var8 = (class320) var7.method3681(0);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field4704 == 3) {
                int var9 = (int) var8.field9386;
                if ((var9 >>> 16) == var4) {
                    method1484(arg0, true, arg2, var8);
                }
            }
        }
    }
}
