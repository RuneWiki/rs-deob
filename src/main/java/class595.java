import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class595 {

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public int field8620 = 1;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "[Lfo;")
    public static class606[] field8613 = new class606[14];

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field8622 = -1;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Lvh;")
    public static class125 field8616 = new class125(32, 7);

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "C")
    public char field8615;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "F")
    public static float field8618;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field8614;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field8617;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field8619;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method3403(int arg0, int arg1, int arg2, Class arg3) {
        class293 var4 = class541.field7946[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class198 var5 = var4.field4097; var5 != null; var5 = var5.field3078) {
            class144 var6 = var5.field3085;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field2481 == arg1 && var6.field2484 == arg2) {
                class450.method2626(var6, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZIIB)V")
    public static final void method3404(int arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        if (class76.field1182 == 0) {
            class385.method2353((byte) 120, false);
        } else {
            class685.field9736 = class76.field1182;
            class251.method1604(69, 0);
        }
        field8614++;
        if (arg4 != -6) {
            field8618 = -0.83671653F;
        }
        class102.field1670 = arg1;
        class31.field455 = arg3;
        class433.field6237 = arg0;
        class161.method1214(arg2);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILek;)V")
    private final void method3405(int arg0, int arg1, class465 arg2) {
        if (arg0 == 1) {
            this.field8615 = class409.method2446(arg2.method2712(-64), -18082);
        } else if (arg0 == 2) {
            this.field8620 = 0;
        }
        if (arg1 != -1) {
            this.method3407(-106, null);
        }
        field8619++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static void method3406(byte arg0) {
        field8616 = null;
        field8613 = null;
        if (arg0 >= -55) {
            method3404(22, false, -53, 15, (byte) 113);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILek;)V")
    public final void method3407(int arg0, class465 arg1) {
        field8621++;
        if (arg0 >= -77) {
            return;
        }
        while (true) {
            int var3 = arg1.method2705(-76);
            if (var3 == 0) {
                return;
            }
            this.method3405(var3, -1, arg1);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)V")
    public static final void method3408(byte arg0, int arg1) {
        field8617++;
        if (class515.field7636 == arg1) {
            return;
        }
        if (arg0 < 14) {
            field8622 = 44;
        }
        if (arg1 == 13) {
            if (class640.field9072 == null) {
                class365.method2191(class330.field4563, false, class616.field8808, class70.field1107);
            } else {
                class354.method2142((byte) 126, class70.field1107);
            }
        }
        if (arg1 != 13 && class561.field8180 != null) {
            class561.field8180.method913(-10406);
            class561.field8180 = null;
        }
        if (arg1 == 3) {
            class473.method2779(class557.field8146 != class486.field6938, 119);
        }
        if (arg1 == 7) {
            class516.method3060((byte) 30, class557.field8146 != class408.field5845);
        }
        if (arg1 == 5) {
            if (class640.field9072 == null) {
                class165.method1255(class616.field8808, class330.field4563, 1);
            } else {
                class406.method2440(83);
            }
        } else if (arg1 == 6) {
            if (class640.field9072 == null) {
                class365.method2191(class330.field4563, false, class616.field8808, class70.field1107);
            } else {
                class354.method2142((byte) 122, class70.field1107);
            }
        } else if (arg1 == 9) {
            if (class640.field9072 == null) {
                class365.method2191(class330.field4563, false, class616.field8808, class70.field1107);
            } else {
                class354.method2142((byte) 68, class70.field1107);
            }
        } else if (arg1 == 12) {
            if (class640.field9072 == null) {
                class165.method1255(class616.field8808, class330.field4563, 1);
            } else {
                class406.method2440(82);
            }
        }
        if (class183.method1312(-5, class515.field7636)) {
            class379.field5241.field4849 = 2;
            class183.field2905.field4849 = 2;
            class240.field3534.field4849 = 2;
            class337.field4697.field4849 = 2;
            class400.field5781.field4849 = 2;
            class57.field852.field4849 = 2;
            class23.field305.field4849 = 2;
        }
        if (class183.method1312(-5, arg1)) {
            class256.field3691 = 1;
            class105.field1736 = 0;
            class113.field1806 = 0;
            class304.field4256 = 1;
            class73.field1169 = 0;
            class385.method2353((byte) 127, true);
            class379.field5241.field4849 = 1;
            class183.field2905.field4849 = 1;
            class240.field3534.field4849 = 1;
            class337.field4697.field4849 = 1;
            class400.field5781.field4849 = 1;
            class57.field852.field4849 = 1;
            class23.field305.field4849 = 1;
        }
        if (arg1 == 11 || arg1 == 3) {
            class107.method887(-403);
        }
        boolean var2 = arg1 == 2 || class490.method2871(true, arg1) || class352.method2135(arg1, (byte) -122);
        boolean var3 = class515.field7636 == 2 || class490.method2871(true, class515.field7636) || class352.method2135(class515.field7636, (byte) -122);
        if (var3 != var2) {
            if (var2) {
                class283.field3963 = class333.field4635;
                if (class525.field7713.field5993 == 0) {
                    class16.method193(1, 2);
                } else {
                    class216.method1458(0, false, class97.field1451, false, class525.field7713.field5993, class333.field4635, 2);
                    class468.method2768((byte) -110);
                }
                class511.field7607.method1519(false, (byte) 115);
            } else {
                class16.method193(1, 2);
                class511.field7607.method1519(true, (byte) 107);
            }
        }
        if (class183.method1312(-5, arg1) || arg1 == 13) {
            class637.field9048.method128();
        }
        class515.field7636 = arg1;
    }
}
