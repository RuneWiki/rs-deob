import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class247 {

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field3176 = -1;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "[S")
    public static short[] field3178 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIILah;)V")
    public static final void method1500(int arg0, int arg1, int arg2, int arg3, class262 arg4) {
        class490 var5 = class119.method862(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field3316 = (arg1 << class94.field1144) + class59.field772;
        arg4.field3311 = arg3;
        arg4.field3308 = (arg2 << class94.field1144) + class59.field772;
        for (class376 var7 = var5.field7127; var7 != null; var7 = var7.field4952) {
            if (var7.field4953.field2667) {
                int var8 = var7.field4953.method733(-29382);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field3311 += var6;
            arg4.field3310 = true;
        }
        var5.field7129 = arg4;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIB)V")
    public static final void method1501(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = class407.field5817.field3629 * arg2 >> 8;
        if (arg3 != -107) {
            field3176 = 61;
        }
        field3179++;
        if (var4 != 0 && arg1 != -1) {
            class1.method3(class288.field3675, arg3 + 150, 0, false, var4, arg1);
            class45.field538 = true;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static final void method1502(int arg0) {
        class105.field1331 = null;
        class264.field3333 = null;
        class460.field6579 = null;
        class285.field3653 = null;
        class465.field6715 = null;
        class143.field1843 = null;
        class231.field2953 = null;
        class424.field5990 = null;
        class200.field2612 = null;
        class420.field5954 = null;
        class293.field3739 = null;
        class532.field7820 = null;
        class320.field4065 = null;
        class6.field61 = null;
        class510.field7366 = null;
        class223.field2828 = null;
        if (arg0 <= -47) {
            field3177++;
            class91.field1116 = null;
            class48.field613 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public static void method1503(int arg0) {
        if (arg0 == 957) {
            field3178 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1504(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3175++;
        if (arg4 != 108) {
            field3178 = null;
        }
        int var6 = class33.method242(arg2, class533.field7845, class289.field3694, (byte) -128);
        int var7 = class33.method242(arg5, class533.field7845, class289.field3694, (byte) -128);
        int var8 = class33.method242(arg0, class147.field1870, class237.field3019, (byte) -128);
        int var9 = class33.method242(arg1, class147.field1870, class237.field3019, (byte) -128);
        for (int var10 = var6; var10 <= var7; var10++) {
            class184.method1160(class387.field5088[var10], -7, arg3, var9, var8);
        }
    }
}
