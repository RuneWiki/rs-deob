import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public abstract class class165 extends class304 {

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    public static int field2751 = 0;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "Lsb;")
    public static class266 field2753 = new class266(12, 8);

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "Lph;")
    public static class598 field2754 = new class598(9, 2);

    @OriginalMember(owner = "client!cw", name = "l", descriptor = "Lsb;")
    public static class266 field2756 = new class266(8, 3);

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "Lqr;")
    public static class59 field2755;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Log;ZZ)V")
    public static final void method1254(class602 arg0, boolean arg1, boolean arg2) {
        field2752++;
        if (arg2) {
            method1254(null, false, true);
        }
        if (class481.field6904 >= 400) {
            return;
        }
        if (class532.field7456 != arg0) {
            String var3;
            if (arg0.field8622 == 0) {
                boolean var4 = true;
                if (class532.field7456.field8667 != -1 && arg0.field8667 != -1) {
                    int var5 = class532.field7456.field8661 > arg0.field8661 ? class532.field7456.field8661 : arg0.field8661;
                    int var6 = class532.field7456.field8667 >= arg0.field8667 ? arg0.field8667 : class532.field7456.field8667;
                    int var7 = var5 * 10 / 100 + var6 + 5;
                    int var8 = class532.field7456.field8661 - arg0.field8661;
                    if (var8 < 0) {
                        var8 = -var8;
                    }
                    if (var8 > var7) {
                        var4 = false;
                    }
                }
                String var9 = class78.field1573 == class49.field1167 ? class265.field3905.method1733(255, class140.field2466) : class265.field3903.method1733(255, class140.field2466);
                if (arg0.field8661 < arg0.field8650) {
                    var3 = arg0.method3437(true, !arg2) + (var4 ? class498.method2975(class532.field7456.field8661, (byte) 44, arg0.field8661) : "<col=ffffff>") + " (" + var9 + arg0.field8661 + "+" + (arg0.field8650 - arg0.field8661) + ")";
                } else {
                    var3 = arg0.method3437(true, true) + (var4 ? class498.method2975(class532.field7456.field8661, (byte) 74, arg0.field8661) : "<col=ffffff>") + " (" + var9 + arg0.field8661 + ")";
                }
            } else if (arg0.field8622 == -1) {
                var3 = arg0.method3437(true, !arg2);
            } else {
                var3 = arg0.method3437(true, !arg2) + " (" + class265.field3904.method1733(255, class140.field2466) + arg0.field8622 + ")";
            }
            if (class65.field1435 && !arg1 && (class489.field7001 & 0x8) != 0) {
                class205.field3142++;
                class631.method3604(12, 0, -1, (long) arg0.field8728, class578.field8409, 0, (byte) -26, true, class177.field2892 + " -> <col=ffffff>" + var3, class97.field1726, false);
            }
            if (arg1) {
                class631.method3604(-1, 0, 0, 0L, "<col=cccccc>" + var3, 0, (byte) -96, false, "", -1, true);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class61.field1388[var10] != null) {
                        short var12 = 0;
                        if (class78.field1573 == class568.field8275 && class61.field1388[var10].equalsIgnoreCase(class265.field3898.method1733(255, class140.field2466))) {
                            if (arg0.field8661 > class532.field7456.field8661) {
                                var12 = 2000;
                            }
                            if (class532.field7456.field8656 != 0 && arg0.field8656 != 0) {
                                if (class532.field7456.field8656 == arg0.field8656) {
                                    var12 = 2000;
                                } else {
                                    var12 = 0;
                                }
                            }
                        } else if (class230.field3461[var10]) {
                            var12 = 2000;
                        }
                        short var13 = (short) (class359.field5352[var10] + var12);
                        int var14 = class159.field2710[var10] == -1 ? class419.field6041 : class159.field2710[var10];
                        class397.field5788++;
                        class631.method3604(var13, 0, -1, (long) arg0.field8728, class61.field1388[var10], 0, (byte) -72, true, "<col=ffffff>" + var3, var14, false);
                    }
                }
            }
            if (!arg1) {
                for (class300 var11 = (class300) class126.field2292.method1224(-2); var11 != null; var11 = (class300) class126.field2292.method1232(-2)) {
                    if (var11.field4465 == 11) {
                        var11.field4469 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class65.field1435 && (class489.field7001 & 0x10) != 0) {
            class631.method3604(5, 0, -1, 0L, class578.field8409, 0, (byte) -107, true, class177.field2892 + " -> <col=ffffff>" + class265.field3912.method1733(255, class140.field2466), class97.field1726, false);
            class413.field5974++;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)Lpu;")
    public abstract class524 method1016(byte arg0);

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Z)V")
    public static void method1255(boolean arg0) {
        field2753 = null;
        field2754 = null;
        if (!arg0) {
            method1255(true);
        }
        field2755 = null;
        field2756 = null;
    }
}
