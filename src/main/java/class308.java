import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class308 {

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Lqg;")
    public static class325 field4676;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lph;Lph;I)I")
    public static final int method1968(class459 arg0, class459 arg1, int arg2) {
        field4675++;
        int var3 = arg2;
        if (arg0.method2739(class335.field5064, -59)) {
            var3 = arg2 + 1;
        }
        if (arg0.method2739(class387.field5664, -26)) {
            var3++;
        }
        if (arg0.method2739(class395.field6021, -105)) {
            var3++;
        }
        if (arg1.method2739(class335.field5064, -52)) {
            var3++;
        }
        if (arg1.method2739(class387.field5664, 58)) {
            var3++;
        }
        if (arg1.method2739(class395.field6021, -128)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Llt;Ljava/awt/Frame;I)V")
    public static final void method1969(class480 arg0, Frame arg1, int arg2) {
        field4674++;
        while (true) {
            class121 var3 = arg0.method2881(arg1, 7);
            while (var3.field2119 == 0) {
                class50.method470(10L, -5);
            }
            if (var3.field2119 == 1) {
                if (arg2 != 1603251406) {
                    return;
                }
                arg1.setVisible(false);
                arg1.dispose();
                return;
            }
            class50.method470(100L, -5);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static void method1970(int arg0) {
        if (arg0 != 0) {
            field4680 = -88;
        }
        field4676 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILgh;II)V")
    public static final void method1971(int arg0, class388 arg1, int arg2, int arg3) {
        if (arg1.field5710 == 0) {
            arg1.field5778 = arg1.field5726;
        } else if (arg1.field5710 == 1) {
            arg1.field5778 = (arg2 - arg1.field5712) / 2 + arg1.field5726;
        } else if (arg1.field5710 == 2) {
            arg1.field5778 = arg2 - arg1.field5726 - arg1.field5712;
        } else if (arg1.field5710 == 3) {
            arg1.field5778 = arg1.field5726 * arg2 >> 14;
        } else if (arg1.field5710 == 4) {
            arg1.field5778 = (arg1.field5726 * arg2 >> 14) + (arg2 - arg1.field5712) / 2;
        } else {
            arg1.field5778 = arg2 - (arg1.field5726 * arg2 >> 14) - arg1.field5712;
        }
        if (arg1.field5789 == 0) {
            arg1.field5701 = arg1.field5757;
        } else if (arg1.field5789 == 1) {
            arg1.field5701 = (arg0 - arg1.field5745) / 2 + arg1.field5757;
        } else if (arg1.field5789 == 2) {
            arg1.field5701 = arg0 - arg1.field5757 - arg1.field5745;
        } else if (arg1.field5789 == 3) {
            arg1.field5701 = arg1.field5757 * arg0 >> 14;
        } else if (arg1.field5789 == 4) {
            arg1.field5701 = (arg1.field5757 * arg0 >> 14) + (arg0 - arg1.field5745) / 2;
        } else {
            arg1.field5701 = arg0 - arg1.field5745 - (arg1.field5757 * arg0 >> 14);
        }
        field4679++;
        if (arg3 != -3804) {
            field4676 = null;
        }
        if (!class321.field4902) {
            return;
        }
        if (client.method1371(arg1).field1911 == 0 && arg1.field5784 != 0) {
            return;
        }
        if (arg1.field5778 < 0) {
            arg1.field5778 = 0;
        } else if (arg2 < (arg1.field5778 + arg1.field5712)) {
            arg1.field5778 = arg2 - arg1.field5712;
        }
        if (arg1.field5701 < 0) {
            arg1.field5701 = 0;
            return;
        }
        if ((arg1.field5745 + arg1.field5701) > arg0) {
            arg1.field5701 = arg0 - arg1.field5745;
            return;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lge;Z)V")
    public static final void method1972(class504 arg0, boolean arg1) {
        arg0.field7365 = null;
        field4673++;
        if (class262.field4001 < 20) {
            class272.field4123.method531((byte) 123, arg0);
            class262.field4001++;
        }
        if (!arg1) {
            method1970(-58);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V")
    public static final void method1973(boolean arg0) {
        field4678++;
        if (!arg0) {
            field4672 = 58;
        }
        for (class169 var1 = (class169) class378.field5541.method1892(101); var1 != null; var1 = (class169) class378.field5541.method1893((byte) -2)) {
            if (var1.field2742 > 0) {
                var1.field2742--;
            }
            if (var1.field2742 != 0) {
                if (var1.field2744 > 0) {
                    var1.field2744--;
                }
                if (var1.field2744 == 0 && var1.field2747 >= 1 && var1.field2756 >= 1 && var1.field2747 <= class339.field5099 - 2 && var1.field2756 <= class484.field7129 - 2 && (var1.field2752 < 0 || class122.method976(var1.field2753, (byte) 19, var1.field2752))) {
                    class432.method2595(var1.field2753, var1.field2745, var1.field2747, var1.field2758, var1.field2756, -1, -6, var1.field2752, var1.field2750);
                    var1.field2744 = -1;
                    if (var1.field2752 == var1.field2748 && var1.field2748 == -1) {
                        var1.method1676(true);
                    } else if (var1.field2752 == var1.field2748 && var1.field2751 == var1.field2750 && var1.field2753 == var1.field2746) {
                        var1.method1676(arg0);
                    }
                }
            } else if (var1.field2748 < 0 || class122.method976(var1.field2746, (byte) 19, var1.field2748)) {
                class432.method2595(var1.field2746, var1.field2745, var1.field2747, var1.field2758, var1.field2756, -1, -56, var1.field2748, var1.field2751);
                var1.method1676(true);
            }
        }
    }
}
