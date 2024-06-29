import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class531 {

    @OriginalMember(owner = "client!im", name = "h", descriptor = "Lhga;")
    public static class158 field7740 = new class158(10, -1);

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field7733;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field7734;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field7737;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field7738;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public static int field7741;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "Liaa;")
    public class459 field7739;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "Lim;")
    public class531 field7736;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3210(int arg0, byte arg1, int arg2) {
        if (arg1 > -41) {
            return true;
        } else {
            field7738++;
            return class544.method3289(arg2, -30085, arg0) | (arg2 & 0x70000) != 0 || class403.method2586(arg0, arg2, 115);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IC)Z")
    public static final boolean method3211(int arg0, char arg1) {
        if (arg0 > -96) {
            method3213((byte) -128);
        }
        field7733++;
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "([Ljava/lang/String;I)V")
    public static final void method3212(String[] arg0, int arg1) {
        field7735++;
        if (arg0.length > 1) {
            for (int var2 = 0; var2 < arg0.length; var2++) {
                if (arg0[var2].startsWith("pause")) {
                    int var3 = 5;
                    try {
                        var3 = Integer.parseInt(arg0[var2].substring(6));
                    } catch (Exception var4) {
                    }
                    class529.method3200("Pausing for " + var3 + " seconds...", -115);
                    class570.field8160 = var2 + 1;
                    class455.field6839 = arg0;
                    class514.field7477 = (long) (var3 * 1000) + class112.method1033(-11752);
                    return;
                }
                class66.field855 = arg0[var2];
                class259.method1832(false, false);
            }
        } else {
            class66.field855 = class66.field855 + arg0[0];
        }
        if (arg1 != 1) {
            method3215();
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)[Lhw;")
    public static final class116[] method3213(byte arg0) {
        field7734++;
        int var1 = 113 % ((arg0 + 59) / 52);
        return new class116[] { class510.field7452, class147.field2461, class138.field2335 };
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V")
    public final void method3214(boolean arg0) {
        field7737++;
        if (class282.field4516 >= 500) {
            return;
        }
        this.field7736 = class165.field2781;
        this.field7739 = null;
        class282.field4516++;
        class165.field2781 = this;
        if (arg0) {
            method3211(26, (char) 65437);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "()V")
    public static final void method3215() {
        class127.method1110(1, class524.field7649);
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(Z)V")
    public static void method3216(boolean arg0) {
        if (arg0) {
            field7740 = null;
        }
        field7740 = null;
    }
}
