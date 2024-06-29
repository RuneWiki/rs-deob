import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class697 {

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "[I")
    public static int[] field9797 = new int[5];

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Lin;")
    public static class380 field9794 = new class380(62, 0);

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field9795;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field9796;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field9798;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field9799;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILcea;Ljava/lang/Object;)V")
    public static final void method3912(int arg0, class111 arg1, Object arg2) {
        field9795++;
        if (arg1.field1600 == null) {
            return;
        }
        if (arg0 != 4) {
            method3913(false);
        }
        for (int var3 = 0; var3 < 50 && arg1.field1600.peekEvent() != null; var3++) {
            class579.method3405(1L, 10);
        }
        try {
            if (arg2 != null) {
                arg1.field1600.postEvent(new ActionEvent(arg2, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
    public static final void method3913(boolean arg0) {
        field9796++;
        class178.method1295((byte) 122, false);
        class165.field2524 = 0;
        boolean var1 = arg0;
        for (int var2 = 0; var2 < class555.field7705.length; var2++) {
            if (class687.field9715[var2] != -1 && class555.field7705[var2] == null) {
                class555.field7705[var2] = class562.field7790.method3019(class687.field9715[var2], 0, 71);
                if (class555.field7705[var2] == null) {
                    var1 = false;
                    class165.field2524++;
                }
            }
            if (class651.field9224[var2] != -1 && class590.field8476[var2] == null) {
                class590.field8476[var2] = class562.field7790.method2994(class651.field9224[var2], (byte) -97, class149.field2397[var2], 0);
                if (class590.field8476[var2] == null) {
                    var1 = false;
                    class165.field2524++;
                }
            }
            if (class60.field912[var2] != -1 && class11.field142[var2] == null) {
                class11.field142[var2] = class562.field7790.method3019(class60.field912[var2], 0, 101);
                if (class11.field142[var2] == null) {
                    var1 = false;
                    class165.field2524++;
                }
            }
            if (class401.field5521[var2] != -1 && class613.field8704[var2] == null) {
                class613.field8704[var2] = class562.field7790.method3019(class401.field5521[var2], 0, 76);
                if (class613.field8704[var2] == null) {
                    class165.field2524++;
                    var1 = false;
                }
            }
            if (class114.field1832 != null && class789.field10791[var2] == null && class114.field1832[var2] != -1) {
                class789.field10791[var2] = class562.field7790.method2994(class114.field1832[var2], (byte) -97, class149.field2397[var2], 0);
                if (class789.field10791[var2] == null) {
                    class165.field2524++;
                    var1 = false;
                }
            }
        }
        if (class447.field6170 == null) {
            if (class370.field5222 == null || !class576.field8310.method3015(3870, class370.field5222.field3589 + "_staticelements")) {
                class447.field6170 = new class78(0);
            } else if (class576.field8310.method2990((byte) 2, class370.field5222.field3589 + "_staticelements")) {
                class447.field6170 = class792.method4328(class362.field5127, -21337, class576.field8310, class370.field5222.field3589 + "_staticelements");
            } else {
                class165.field2524++;
                var1 = false;
            }
        }
        if (!var1) {
            class106.field1524 = 1;
            return;
        }
        boolean var3 = true;
        class472.field6427 = 0;
        for (int var4 = 0; var4 < class555.field7705.length; var4++) {
            byte[] var21 = class590.field8476[var4];
            if (var21 != null) {
                int var22 = (class12.field156[var4] >> 8) * 64 - class222.field3266;
                int var23 = (class12.field156[var4] & 0xFF) * 64 - field9798;
                if (class636.field8987 != 0) {
                    var22 = 10;
                    var23 = 10;
                }
                var3 &= class161.method1228(-106, class192.field2891, var23, var22, var21, class456.field6225);
            }
            byte[] var24 = class613.field8704[var4];
            if (var24 != null) {
                int var25 = (class12.field156[var4] >> 8) * 64 - class222.field3266;
                int var26 = (class12.field156[var4] & 0xFF) * 64 - field9798;
                if (class636.field8987 != 0) {
                    var25 = 10;
                    var26 = 10;
                }
                var3 &= class161.method1228(-105, class192.field2891, var26, var25, var24, class456.field6225);
            }
        }
        if (!var3) {
            class106.field1524 = 2;
            return;
        }
        if (class106.field1524 != 0) {
            class609.method3526(class563.field7810.method3281(class423.field5892, -1) + "<br>(100%)", class686.field9702, (byte) -14, class30.field322, class420.field5827, true);
        }
        class193.method1378(118);
        class727.method4035(-24);
        class55.method600(0);
        boolean var5 = false;
        if (class686.field9702.method435() && class420.field5820.field9489.method2326(17539) == 2) {
            for (int var6 = 0; var6 < class555.field7705.length; var6++) {
                if (class613.field8704[var6] != null || class11.field142[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class420.field5820.field9459.method3485(17539) == 1) {
            var7 = class341.field4844[class611.field8684];
        } else {
            var7 = class389.field5430[class611.field8684];
        }
        if (class686.field9702.method477()) {
            var7++;
        }
        class653.method3674(class686.field9702, class261.field3701, 9, 4, class192.field2891, class456.field6225, var7, var5, class686.field9702.method472() > 0);
        class505.method2953(class423.field5888);
        if (class423.field5888 == 0) {
            class626.method3580(null);
        } else {
            class626.method3580(class71.field1124);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class605.field8591[var8].method2093(125);
        }
        class184.method1331(-127);
        class460.method2690(true, false);
        class693.method3891(114);
        class283.field4157 = null;
        class425.field5910 = false;
        class193.method1378(3);
        System.gc();
        class178.method1295((byte) 119, true);
        class337.method2064((byte) 107);
        class665.field9362 = class420.field5820.field9457.method3741(17539);
        class477.field6551 = class139.field2293 >= 96;
        class413.field5675 = class420.field5820.field9489.method2326(17539) == 2;
        class693.field9764 = class420.field5820.field9481.method3155(17539) == 1;
        class374.field5255 = class420.field5820.field9495.method1677(17539) == 1 ? -1 : class112.field1620;
        class145.field2345 = class420.field5820.field9454.method4010(17539) == 1;
        class503.field6899 = class420.field5820.field9487.method3081(17539) == 1;
        class465.field6343 = new class79(4, class192.field2891, class456.field6225, false);
        if (class636.field8987 == 0) {
            class729.method4051(class555.field7705, class465.field6343, false);
        } else {
            class416.method2453((byte) -70, class555.field7705, class465.field6343);
        }
        class184.method1334(class456.field6225 >> 4, true, class192.field2891 >> 4);
        class338.method2067(!arg0);
        if (var5) {
            class368.method2202(true);
            class242.field3473 = new class79(1, class192.field2891, class456.field6225, true);
            if (class636.field8987 == 0) {
                class729.method4051(class11.field142, class242.field3473, !arg0);
                class178.method1295((byte) 119, true);
            } else {
                class416.method2453((byte) -113, class11.field142, class242.field3473);
                class178.method1295((byte) 123, true);
            }
            class242.field3473.method4211(-118, 0, class465.field6343.field10529[0]);
            class242.field3473.method4208(null, (byte) 115, class686.field9702, null);
            class368.method2202(false);
        }
        class465.field6343.method4208(var5 ? class242.field3473.field10529 : null, (byte) -47, class686.field9702, class605.field8591);
        if (class636.field8987 == 0) {
            class178.method1295((byte) 122, true);
            class545.method3156(class590.field8476, class465.field6343, 640205096);
            if (class789.field10791 != null) {
                class711.method3963(-9198);
            }
        } else {
            class178.method1295((byte) 125, true);
            class673.method3770(class590.field8476, (byte) 80, class465.field6343);
        }
        class727.method4035(-120);
        if (class139.field2293 < 96) {
            class12.method160((byte) 94);
        }
        class178.method1295((byte) 124, true);
        class465.field6343.method4203(null, 0, class686.field9702, var5 ? class454.field6207[0] : null);
        class465.field6343.method705(class686.field9702, false, 8);
        class178.method1295((byte) 123, true);
        if (var5) {
            class368.method2202(true);
            class178.method1295((byte) 124, true);
            if (class636.field8987 == 0) {
                class545.method3156(class613.field8704, class242.field3473, 640205096);
            } else {
                class673.method3770(class613.field8704, (byte) 98, class242.field3473);
            }
            class727.method4035(-30);
            class178.method1295((byte) 126, true);
            class242.field3473.method4203(class495.field6799[0], 0, class686.field9702, null);
            class242.field3473.method705(class686.field9702, true, 8);
            class178.method1295((byte) 124, true);
            class368.method2202(false);
        }
        class560.method3260(-1);
        int var9 = class465.field6343.field1182;
        if (class403.field5560 < var9) {
            var9 = class403.field5560;
        }
        if (var9 < (class403.field5560 - 1)) {
            var9 = class403.field5560 - 1;
        }
        if (class420.field5820.field9495.method1677(17539) == 0) {
            class648.method3664(var9);
        } else {
            class648.method3664(0);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class192.field2891; var19++) {
                for (int var20 = 0; var20 < class456.field6225; var20++) {
                    class352.method2135(var20, var10, var19, 315555113);
                }
            }
        }
        class244.method1624(true);
        class193.method1378(117);
        class344.method2107(255);
        class727.method4035(-115);
        class324.method1959((byte) -117);
        if (class410.field5617 != null && class600.field8551 != null && class141.field2306 == 11) {
            class545.field7561++;
            class302 var11 = class582.method3419(class679.field9598, (byte) 127, class626.field8901);
            var11.field4341.method2548(1057001181, (byte) -116);
            class501.method2928(0, var11);
        }
        if (class636.field8987 == 0) {
            int var12 = (class732.field10181 - (class192.field2891 >> 4)) / 8;
            int var13 = ((class192.field2891 >> 4) + class732.field10181) / 8;
            int var14 = (class263.field3718 - (class456.field6225 >> 4)) / 8;
            int var15 = (class263.field3718 + (class456.field6225 >> 4)) / 8;
            for (int var16 = var12 - 1; var16 <= var13 + 1; var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var12 > var16 || var16 > var13 || var17 < var14 || var15 < var17) {
                        class562.field7790.method3006("m" + var16 + "_" + var17, (byte) -57);
                        class562.field7790.method3006("l" + var16 + "_" + var17, (byte) -57);
                    }
                }
            }
        }
        if (class141.field2306 == 4) {
            class75.method690(true, 3);
        } else if (class141.field2306 == 8) {
            class75.method690(true, 7);
        } else {
            class75.method690(arg0, 10);
            if (class600.field8551 != null) {
                class302 var18 = class582.method3419(class170.field2577, (byte) 126, class626.field8901);
                class501.method2928(0, var18);
            }
        }
        class10.method151(81);
        class193.method1378(-51);
        class691.method3885(-107);
        class87.field1297 = true;
        if (class184.field2794) {
            class30.method251(!arg0, "Took: " + (class337.method2062(false) - class778.field10680) + "ms");
            class184.field2794 = false;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method3914(int arg0) {
        field9797 = null;
        field9794 = null;
        if (arg0 <= 110) {
            field9798 = 110;
        }
    }
}
