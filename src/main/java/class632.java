import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class632 extends class120 {

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "Laq;")
    public static class494 field8944 = new class494(8);

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field8941;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public static int field8945;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)[Lvb;")
    public static final class396[] method3606(int arg0) {
        if (arg0 != 4) {
            field8944 = null;
        }
        field8945++;
        return new class396[] { class495.field6794, class405.field5571, class253.field3619, class387.field5410, class349.field4959, class302.field4339, class222.field3260, class120.field2046, class38.field446, class733.field10186, class191.field2873, class297.field4320, class510.field7007, class72.field1136, class770.field10630 };
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3607(int arg0, int arg1, byte arg2) {
        field8942++;
        if (arg2 != -47) {
            method3608((byte) -41);
        }
        return (arg1 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public static void method3608(byte arg0) {
        int var1 = 9 / ((arg0 + 57) / 55);
        field8944 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIILha;IILd;)V")
    public static final void method3609(int arg0, int arg1, int arg2, class475 arg3, int arg4, int arg5, class103 arg6) {
        if (class466.field6347 < 100) {
            class786.method4310(arg3, arg6, 3700);
        }
        field8943++;
        arg3.method488(arg0, arg1, arg0 + arg5, arg1 - -arg4);
        if (class466.field6347 < 100) {
            byte var7 = 20;
            int var8 = arg5 / 2 + arg0;
            int var9 = arg1 + (arg4 / 2) - (18 - -var7);
            arg3.method436(arg0, arg1, arg5, arg4, -16777216, 0);
            arg3.method447(var8 - 152, var9, 304, 34, class330.field4711[class263.field3712].getRGB(), 0);
            arg3.method436(var8 - 150, var9 + 2, class466.field6347 * 3, 30, class521.field7308[class263.field3712].getRGB(), 0);
            class670.field9398.method2635(var8, class563.field7816.method3281(class423.field5892, -1), class384.field5392[class263.field3712].getRGB(), 0, -1, var9 + var7);
            return;
        }
        int var10 = class761.field10553 - (int) ((float) arg5 / class751.field10425);
        int var11 = class488.field6705 + ((int) ((float) arg4 / class751.field10425));
        int var12 = (int) ((float) arg5 / class751.field10425) + class761.field10553;
        class312.field4419 = class761.field10553 - ((int) ((float) arg5 / class751.field10425));
        class380.field5329 = class488.field6705 - ((int) ((float) arg4 / class751.field10425));
        int var13 = class488.field6705 - (int) ((float) arg4 / class751.field10425);
        if (arg2 != 25700) {
            return;
        }
        class433.field6048 = (int) ((float) (arg5 * 2) / class751.field10425);
        class326.field4634 = (int) ((float) (arg4 * 2) / class751.field10425);
        class751.method4137(var10 + class751.field10445, class751.field10446 + var11, var12 + class751.field10445, class751.field10446 + var13, arg0, arg1, arg0 + arg5, arg1 + arg4 - -1);
        class751.method4139(arg3);
        class665 var14 = class751.method4148(arg3);
        class335.method2059(0, 0, var14, 0, arg3);
        if (class33.field410 > 0) {
            class482.field6622--;
            if (class482.field6622 == 0) {
                class482.field6622 = 20;
                class33.field410--;
            }
        }
        if (!class530.field7378) {
            return;
        }
        int var15 = arg0 + arg5 - 5;
        int var16 = arg1 + arg4 - 8;
        class420.field5827.method2621(16776960, "Fps:" + class458.field6265, -94, -1, var15, var16);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class420.field5827.method2621(var19, "Mem:" + var18 + "k", arg2 - 25725, -1, var15, var20);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lr;III[Z)Z")
    public static final boolean method3610(class115 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class678.field9594 != class454.field6207) {
            int var6 = class495.field6799[arg1].method2478(true, arg3, arg2);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class419 var8 = class495.field6799[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method2478(true, arg3, arg2);
                    if (arg4 != null) {
                        arg4[var7] = var8.method824(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method825(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method3611(int arg0, boolean arg1, String arg2) {
        field8941++;
        if (arg2 == null) {
            return;
        }
        if (class458.field6267 >= 100) {
            class446.method2645(class563.field7837.method3281(class423.field5892, -1), 0, 4);
            return;
        }
        String var3 = class147.method1160(-118, arg2);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class458.field6267; var4++) {
            String var9 = class147.method1160(25, class263.field3721[var4]);
            if (var9 != null && var9.equals(var3)) {
                class446.method2645(arg2 + class563.field7838.method3281(class423.field5892, -1), 0, 4);
                return;
            }
            if (class581.field8364[var4] != null) {
                String var10 = class147.method1160(37, class581.field8364[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class446.method2645(arg2 + class563.field7838.method3281(class423.field5892, -1), 0, 4);
                    return;
                }
            }
        }
        if (arg0 < 57) {
            field8944 = null;
        }
        for (int var5 = 0; var5 < class381.field5340; var5++) {
            String var7 = class147.method1160(48, class586.field8428[var5]);
            if (var7 != null && var7.equals(var3)) {
                class446.method2645(class563.field7843.method3281(class423.field5892, -1) + arg2 + class563.field7844.method3281(class423.field5892, -1), 0, 4);
                return;
            }
            if (class713.field9952[var5] != null) {
                String var8 = class147.method1160(-120, class713.field9952[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class446.method2645(class563.field7843.method3281(class423.field5892, -1) + arg2 + class563.field7844.method3281(class423.field5892, -1), 0, 4);
                    return;
                }
            }
        }
        if (class147.method1160(-117, class719.field10041.field212).equals(var3)) {
            class446.method2645(class563.field7840.method3281(class423.field5892, -1), 0, 4);
            return;
        }
        class766.field10590++;
        class302 var6 = class582.method3419(class231.field3379, (byte) 127, class626.field8901);
        var6.field4341.method2524(false, class389.method2339(arg2, true) + 1);
        var6.field4341.method2566(-2, arg2);
        var6.field4341.method2524(false, arg1 ? 1 : 0);
        class501.method2928(0, var6);
    }
}
