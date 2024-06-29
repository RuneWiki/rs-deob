import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class241 extends class17 {

    @OriginalMember(owner = "client!nga", name = "n", descriptor = "I")
    private int field3546;

    @OriginalMember(owner = "client!nga", name = "k", descriptor = "I")
    private int field3543;

    @OriginalMember(owner = "client!nga", name = "m", descriptor = "I")
    private int field3545;

    @OriginalMember(owner = "client!nga", name = "i", descriptor = "I")
    private int field3541;

    @OriginalMember(owner = "client!nga", name = "f", descriptor = "Ljn;")
    public static class117 field3538 = new class117(4);

    @OriginalMember(owner = "client!nga", name = "g", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!nga", name = "h", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!nga", name = "j", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!nga", name = "l", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)Z", line = 3)
    public static final boolean method1561(int arg0) {
        ++field3539;
        try {
            if (class568.field8311 == 2) {
                if (class129.field2099 == null) {
                    class129.field2099 = class350.method2126(class586.field8566, class160.field2599, class345.field4882);
                    if (class129.field2099 == null) {
                        return false;
                    }
                }
                if (class244.field3570 == null) {
                    class244.field3570 = new class450(class24.field324, class132.field2145);
                }
                class295 var1 = class43.field585;
                if (class484.field6903 != null) {
                    var1 = class484.field6903;
                }
                if (var1.method1804(class129.field2099, class399.field5766, class244.field3570, true, 22050)) {
                    class43.field585 = var1;
                    class43.field585.method1800((byte) 94);
                    if (class183.field2891 > 0) {
                        class568.field8311 = 3;
                        class43.field585.method1802(~class309.field4295 > ~class183.field2891 ? class309.field4295 : class183.field2891, (byte) 87);
                        for (int var2 = 0; class183.field2881.length > var2; ++var2) {
                            class43.field585.method1801((byte) -22, class183.field2881[var2], var2);
                            class183.field2881[var2] = 255;
                        }
                    } else {
                        class568.field8311 = 0;
                        class43.field585.method1802(class309.field4295, (byte) -123);
                        for (int var3 = 0; ~class183.field2881.length < ~var3; ++var3) {
                            class43.field585.method1801((byte) -22, class183.field2881[var3], var3);
                            class183.field2881[var3] = 255;
                        }
                    }
                    if (class484.field6903 == null) {
                        if (class224.field3358 <= 0L) {
                            class43.field585.method1805(-16257, class277.field3927, class129.field2099);
                        } else {
                            class43.field585.method1819(class129.field2099, 1, true, class224.field3358, class277.field3927);
                        }
                    }
                    if (class286.field4021 != null) {
                        class286.field4021.method1052(25185, class43.field585);
                    }
                    class586.field8566 = null;
                    class129.field2099 = null;
                    class224.field3358 = 0L;
                    class244.field3570 = null;
                    class484.field6903 = null;
                    return true;
                }
            }
            if (arg0 > -56) {
                method1562(78);
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class43.field585.method1812(-1);
            class244.field3570 = null;
            class568.field8311 = 0;
            class484.field6903 = null;
            class586.field8566 = null;
            class129.field2099 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(III)V", line = 107)
    public final void method65(int arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            ++field3544;
        }
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(III)V", line = 120)
    public final void method66(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            this.field3543 = -33;
        }
        ++field3540;
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(IIIIII)V", line = 131)
    public class241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3546 = arg3;
        this.field3543 = arg2;
        this.field3545 = arg1;
        this.field3541 = arg0;
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(I)V", line = 148)
    public static void method1562(int arg0) {
        field3538 = null;
        if (arg0 != -652209076) {
            field3538 = null;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIZ)V", line = 158)
    public final void method64(int arg0, int arg1, boolean arg2) {
        ++field3542;
        if (!arg2) {
            this.field3546 = -113;
        }
        int var4 = this.field3541 * arg0 >> 12;
        int var5 = this.field3543 * arg0 >> 12;
        int var6 = this.field3545 * arg1 >> 12;
        int var7 = this.field3546 * arg1 >> 12;
        class409.method2445(false, var5, var7, super.field259, var6, var4);
    }
}
