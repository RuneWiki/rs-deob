import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class383 {

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "Lbg;")
    private class464 field5469;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "Lm;")
    private class189 field5466;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Lqfa;")
    public static class98 field5465;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBZLjava/lang/String;)V")
    public static final void method2429(int arg0, byte arg1, boolean arg2, String arg3) {
        class70.method574(true);
        field5468++;
        if (arg0 == 0) {
            class268.field3831 = class353.method2283(class452.field6395, class665.field9066, class557.field7812.field6553.method3560(false) * 2, class366.field5196, 0, (byte) -115);
            if (arg3 != null) {
                class268.field3831.method429(0);
                class143 var4 = class439.method2651((byte) -79, 0, class405.field5725, class279.field3941);
                class59 var5 = class268.field3831.method459(var4, class204.method1235(class374.field5245, class279.field3941, 0), true);
                class619.method3481((byte) 112);
                class660.method3621(var4, arg3, true, 117, var5, class268.field3831);
            }
        } else {
            class58 var6 = null;
            if (arg3 != null) {
                var6 = class353.method2283(class452.field6395, class665.field9066, 0, class366.field5196, 0, (byte) -61);
                var6.method429(0);
                class143 var7 = class439.method2651((byte) -120, 0, class405.field5725, class279.field3941);
                class59 var8 = var6.method459(var7, class204.method1235(class374.field5245, class279.field3941, 0), true);
                class619.method3481((byte) 105);
                class660.method3621(var7, arg3, true, 115, var8, var6);
            }
            boolean var25 = false;
            label216: {
                try {
                    var25 = true;
                    class268.field3831 = class353.method2283(class452.field6395, class665.field9066, class557.field7812.field6553.method3560(false) * 2, class366.field5196, arg0, (byte) -27);
                    if (arg3 != null) {
                        var6.method429(0);
                        class143 var9 = class439.method2651((byte) -87, 0, class405.field5725, class279.field3941);
                        class59 var10 = var6.method459(var9, class204.method1235(class374.field5245, class279.field3941, 0), true);
                        class619.method3481((byte) 87);
                        class660.method3621(var9, arg3, true, 106, var10, var6);
                    }
                    if (class268.field3831.method463()) {
                        boolean var11 = true;
                        try {
                            var11 = class470.field6666.field5558 > 256;
                        } catch (Throwable var29) {
                        }
                        class413 var12;
                        if (var11) {
                            var12 = class268.field3831.method371(146800640);
                        } else {
                            var12 = class268.field3831.method371(104857600);
                        }
                        class268.field3831.method460(var12);
                        var25 = false;
                    } else {
                        var25 = false;
                    }
                    break label216;
                } catch (Throwable var30) {
                    int var13 = class557.field7812.field6521.method2556(false);
                    if (var13 == 2) {
                        class167.field2289 = true;
                    }
                    class557.field7812.method2755(249682952, 0, class557.field7812.field6521);
                    method2429(var13, (byte) 116, arg2, arg3);
                    Object var10000 = null;
                    var25 = false;
                } finally {
                    if (var25) {
                        Object var18 = null;
                        if (var6 != null) {
                            try {
                                var6.method474(1);
                            } catch (Throwable var27) {
                            }
                        }
                    }
                }
                if (var6 != null) {
                    try {
                        var6.method474(1);
                    } catch (Throwable var26) {
                    }
                }
                return;
            }
            Object var17 = null;
            if (var6 != null) {
                try {
                    var6.method474(1);
                } catch (Throwable var28) {
                }
            }
        }
        class557.field7812.field6521.method2559(false, !arg2);
        class557.field7812.method2755(249682952, arg0, class557.field7812.field6521);
        class415.method2551(0);
        class268.field3831.method470(10000);
        class268.field3831.method457(32);
        class631.field8724 = class268.field3831.method427();
        class542.field7576 = class268.field3831.method427();
        class147.method1018(105);
        class268.field3831.method373(class557.field7812.field6544.method2249(false) == 1);
        if (class268.field3831.method374()) {
            class479.method2861(-115, class557.field7812.field6524.method2217(false) == 1);
        }
        class243.method1553(class700.field9768 >> 3, -88, class268.field3831, class336.field4683 >> 3);
        class661.method3626(16711680);
        class486.field6817 = null;
        class64.field792 = true;
        class673.field9128 = false;
        class729.method4096(-1);
        int var15 = -7 / ((43 - arg1) / 44);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Lm;")
    public final class189 method2430(int arg0) {
        if (arg0 != 11034) {
            return null;
        }
        field5473++;
        class189 var2 = this.field5469.field6565.field2543;
        if (this.field5469.field6565 == var2) {
            this.field5466 = null;
            return null;
        } else {
            this.field5466 = var2.field2543;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lbg;I)V")
    public final void method2431(class464 arg0, int arg1) {
        this.field5469 = arg0;
        if (arg1 != -1819659005) {
            this.field5469 = null;
        }
        field5471++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public static void method2432(byte arg0) {
        field5465 = null;
        if (arg0 != 62) {
            method2429(21, (byte) 122, false, null);
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V")
    public static final void method2433(int arg0) {
        if (arg0 > -98) {
            method2429(-29, (byte) -119, false, null);
        }
        class567.field8055++;
        field5467++;
        class519 var1 = class357.method2293(class427.field5994, class56.field680, (byte) 94);
        var1.field7384.method3694(class605.method3408((byte) 54), -1528071456);
        var1.field7384.method3745(-122, class446.field6323);
        var1.field7384.method3745(-128, class172.field2348);
        var1.field7384.method3694(class557.field7812.field6553.method3560(false), -1528071456);
        class151.method1027(var1, -75);
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
    public class383() {
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lbg;)V")
    public class383(class464 arg0) {
        this.field5469 = arg0;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)Lm;")
    public final class189 method2434(int arg0) {
        field5470++;
        class189 var2 = this.field5466;
        if (this.field5469.field6565 == var2) {
            this.field5466 = null;
            return null;
        }
        this.field5466 = var2.field2543;
        if (arg0 != 146800640) {
            field5465 = null;
        }
        return var2;
    }
}
