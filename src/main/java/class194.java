import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class194 extends class190 {

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Lio;")
    public static class151 field2785 = new class151(6, 0, 4, 2);

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "[I")
    public static int[] field2794 = new int[13];

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "F")
    public static float field2793;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Ljj;)V")
    public class194(class66 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZB)V")
    public final void method919(boolean arg0, byte arg1) {
        int var3 = 5 / ((arg1 - -55) / 47);
        super.field2722.method513(1, true);
        ++field2791;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILaba;I)V")
    public final void method927(int arg0, class222 arg1, int arg2) {
        ++field2790;
        super.field2722.method648(arg2 ^ 20648, arg1);
        super.field2722.method634(arg2 ^ -20622, arg0);
        if (arg2 != 20731) {
            field2794 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)V")
    public static void method1280(byte arg0) {
        field2785 = null;
        field2794 = null;
        if (arg0 != -126) {
            field2785 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)Z")
    public final boolean method928(int arg0) {
        ++field2789;
        int var2 = 20 % ((-7 - arg0) / 57);
        return true;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZI)V")
    public final void method921(boolean arg0, int arg1) {
        ++field2786;
        if (arg1 != 25747) {
            this.method928(-126);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Loh;IZII)V")
    public static final void method1281(class549 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field2792;
        int var5 = arg0.field7678;
        if (arg0.field7764 == 0) {
            arg0.field7678 = arg0.field7683;
        } else if (arg0.field7764 != 1) {
            if (arg0.field7764 == 2) {
                arg0.field7678 = arg0.field7683 * arg3 >> 14;
            }
        } else {
            arg0.field7678 = -arg0.field7683 + arg3;
        }
        int var6 = arg0.field7776;
        if (~arg0.field7715 == -1) {
            arg0.field7776 = arg0.field7690;
        } else if (~arg0.field7715 != -2) {
            if (~arg0.field7715 == -3) {
                arg0.field7776 = arg0.field7690 * arg4 >> 14;
            }
        } else {
            arg0.field7776 = -arg0.field7690 + arg4;
        }
        if (arg0.field7764 == 4) {
            arg0.field7678 = arg0.field7776 * arg0.field7708 / arg0.field7759;
        }
        if (~arg0.field7715 == -5) {
            arg0.field7776 = arg0.field7759 * arg0.field7678 / arg0.field7708;
        }
        if (arg1 != 9625) {
            field2785 = null;
        }
        if (class640.field9285 && (~client.method3530(arg0).field7595 != -1 || ~arg0.field7749 == -1)) {
            if (~arg0.field7776 > -6 && ~arg0.field7678 > -6) {
                arg0.field7776 = 5;
                arg0.field7678 = 5;
            } else {
                if (~arg0.field7776 >= -1) {
                    arg0.field7776 = 5;
                }
                if (arg0.field7678 <= 0) {
                    arg0.field7678 = 5;
                }
            }
        }
        if (class57.field821 == arg0.field7662) {
            class477.field6818 = arg0;
        }
        if (arg2 && arg0.field7623 != null) {
            if (~arg0.field7678 != ~var5 || arg0.field7776 != var6) {
                class526 var7 = new class526();
                var7.field7314 = arg0.field7623;
                var7.field7315 = arg0;
                class307.field4417.method414(var7, (byte) 16);
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public final void method926(byte arg0) {
        super.field2722.method513(1, false);
        ++field2788;
        if (arg0 > -102) {
            method1281((class549) null, -97, false, 88, 39);
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
    public static final void method1282(int arg0) {
        ++field2795;
        int var1 = 0;
        if (arg0 == 31808) {
            for (int var2 = 0; ~var2 > ~class146.field2247; ++var2) {
                for (int var3 = 0; ~class66.field990 < ~var3; ++var3) {
                    if (class602.method3428(true, var2, false, var3, class277.field4051, var1)) {
                        ++var1;
                    }
                    if (~var1 <= -513) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)V")
    public final void method925(int arg0, int arg1, int arg2) {
        ++field2787;
        if (arg1 != 0) {
            this.method925(70, -28, 107);
        }
    }
}
