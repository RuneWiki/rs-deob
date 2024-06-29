import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class250 extends class331 {

    @OriginalMember(owner = "client!bfa", name = "s", descriptor = "Lan;")
    public static class182 field3174 = new class182(6, 2);

    @OriginalMember(owner = "client!bfa", name = "w", descriptor = "Lus;")
    public static class328 field3178 = new class328(22, 7);

    @OriginalMember(owner = "client!bfa", name = "m", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!bfa", name = "n", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!bfa", name = "o", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!bfa", name = "p", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!bfa", name = "q", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!bfa", name = "r", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!bfa", name = "t", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!bfa", name = "u", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!bfa", name = "v", descriptor = "Luo;")
    public static class668 field3177;

    @OriginalMember(owner = "client!bfa", name = "x", descriptor = "Lkha;")
    public static class687 field3179;

    @OriginalMember(owner = "client!bfa", name = "y", descriptor = "Lkha;")
    public static class687 field3180;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "([Ljava/lang/Object;[JI)V", line = 3)
    public static final void method1523(Object[] arg0, long[] arg1, int arg2) {
        ++field3175;
        class584.method3256(-15475, arg1.length - arg2, arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V", line = 12)
    public final void method224(int arg0) {
        ++field3173;
        if (arg0 != -1959) {
            this.method227(-105, 27);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILjava/lang/String;)V", line = 24)
    public static final void method1524(int arg0, String arg1) {
        ++field3169;
        if (class138.field1656 && ~(class337.field4352 & 24) != -1) {
            boolean var2 = false;
            int var3 = class627.field8745;
            int[] var4 = class274.field3465;
            if (arg0 == 24) {
                for (int var5 = 0; var5 < var3; ++var5) {
                    class546 var6 = class447.field6287[var4[var5]];
                    if (var6.field7690 != null && var6.field7690.equalsIgnoreCase(arg1) && (class339.field4374 == var6 && (class337.field4352 & 16) != 0 || var6 != null && ~(8 & class337.field4352) != -1)) {
                        ++class145.field1721;
                        class650 var7 = class314.method1837(class744.field10386, true, class625.field8727);
                        var7.field8928.method1101(class563.field7893, 255);
                        var7.field8928.method1134(111955568, 0);
                        var7.field8928.method1101(var4[var5], 255);
                        var7.field8928.method1112(class545.field7651, -117);
                        var7.field8928.method1116(class210.field2693, 9571);
                        class108.method745(var7, -98);
                        var2 = true;
                        class140.method867(0, 0, true, (byte) 50, var6.method253((byte) -27), -2, var6.field426[0], var6.method253((byte) -27), var6.field435[0]);
                        break;
                    }
                }
                if (!var2) {
                    class395.method2352(class586.field8146.method3261(class416.field5920, (byte) 82) + arg1, 4, arg0 + -152);
                }
                if (class138.field1656) {
                    class463.method2742((byte) 88);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(ILts;)V", line = 78)
    public class250(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "(B)I", line = 81)
    public final int method1525(byte arg0) {
        ++field3170;
        return arg0 > -119 ? 48 : super.field4202;
    }

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "(II)V", line = 92)
    public final void method227(int arg0, int arg1) {
        if (arg0 <= 113) {
            method1526((byte) -115);
        }
        ++field3176;
        super.field4202 = arg1;
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(II)I", line = 105)
    public final int method222(int arg0, int arg1) {
        ++field3168;
        if (arg1 != 1) {
            field3179 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "(B)V", line = 117)
    public static void method1526(byte arg0) {
        field3178 = null;
        field3174 = null;
        if (arg0 != -80) {
            field3174 = null;
        }
        field3180 = null;
        field3179 = null;
        field3177 = null;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "([FII[FBFIIIII)V", line = 131)
    public static final void method1527(float[] arg0, int arg1, int arg2, float[] arg3, byte arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg9 - arg8;
        ++field3171;
        int var12 = arg7 - arg10;
        int var13 = arg1 - arg6;
        float var14 = arg3[2] * (float) var12 + arg3[0] * (float) var11 + arg3[1] * (float) var13;
        float var15 = arg3[5] * (float) var12 + arg3[4] * (float) var13 + arg3[3] * (float) var11;
        float var16 = arg3[8] * (float) var12 + arg3[7] * (float) var13 + arg3[6] * (float) var11;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = 0.5F + (float) Math.atan2((double) var14, (double) var16) / 6.2831855F;
        int var19 = -84 % ((arg4 - -71) / 53);
        float var20 = (float) Math.asin((double) (var15 / var17)) / 3.1415927F + 0.5F + arg5;
        if (~arg2 == -2) {
            float var21 = var18;
            var18 = -var20;
            var20 = var21;
        } else if (arg2 != 2) {
            if (~arg2 == -4) {
                float var22 = var18;
                var18 = var20;
                var20 = -var22;
            }
        } else {
            var20 = -var20;
            var18 = -var18;
        }
        arg0[1] = var20;
        arg0[0] = var18;
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(B)I", line = 183)
    public final int method226(byte arg0) {
        ++field3172;
        if (arg0 != 13) {
            field3179 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Lts;)V", line = 194)
    public class250(class41 arg0) {
        super(arg0);
    }
}
