import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public class class54 extends class207 {

    @OriginalMember(owner = "client!gja", name = "m", descriptor = "I")
    public static int field642 = 0;

    @OriginalMember(owner = "client!gja", name = "p", descriptor = "[C")
    private static char[] field645 = new char[64];

    @OriginalMember(owner = "client!gja", name = "g", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!gja", name = "h", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!gja", name = "i", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!gja", name = "j", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!gja", name = "k", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!gja", name = "l", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!gja", name = "o", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!gja", name = "q", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!gja", name = "n", descriptor = "Luq;")
    public static class172 field643;

    static {
        for (int var0 = 0; ~var0 > -27; ++var0) {
            field645[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; ~var1 > -53; ++var1) {
            field645[var1] = (char) (var1 + 97 + -26);
        }
        for (int var2 = 52; var2 < 62; ++var2) {
            field645[var2] = (char) (var2 + -4);
        }
        field645[63] = '/';
        field645[62] = '+';
    }

    @OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(Lrd;)V", line = 3)
    public class54(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(IIIII)V", line = 8)
    public static final void method332(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= 39) {
            if (arg2 >= class297.field4199 && class45.field472 >= arg2) {
                int var5 = class269.method1790(arg0, class233.field3099, class291.field4156, 13094);
                int var6 = class269.method1790(arg3, class233.field3099, class291.field4156, 13094);
                class584.method3284(arg4, var5, (byte) -27, var6, arg2);
            }
            ++field639;
        }
    }

    @OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(ILrd;)V", line = 26)
    public class54(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(IB)V", line = 30)
    public final void method41(int arg0, byte arg1) {
        super.field2669 = arg0;
        if (arg1 >= -7) {
            method334(-124);
        }
        ++field637;
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(B)Z", line = 44)
    public final boolean method333(byte arg0) {
        if (arg0 != 8) {
            return true;
        } else {
            ++field644;
            return class294.method1892(super.field2668.field5141.method2541(43), -127);
        }
    }

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "(IB)I", line = 63)
    public final int method39(int arg0, byte arg1) {
        ++field636;
        if (arg1 != 69) {
            field643 = null;
        }
        return !class294.method1892(super.field2668.field5141.method2541(43), -108) ? 3 : 1;
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)V", line = 80)
    public final void method37(int arg0) {
        ++field641;
        int var2 = -103 % ((arg0 - -58) / 48);
        if (super.field2668.field5141.method2544(0) && !class294.method1892(super.field2668.field5141.method2541(43), -97)) {
            super.field2669 = 0;
        }
        if (~super.field2669 > -1 || super.field2669 > 2) {
            super.field2669 = this.method36(-46);
        }
    }

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "(I)I", line = 96)
    public final int method36(int arg0) {
        if (arg0 >= -14) {
            return 117;
        } else {
            ++field646;
            return 0;
        }
    }

    @OriginalMember(owner = "client!gja", name = "c", descriptor = "(I)V", line = 107)
    public static void method334(int arg0) {
        if (arg0 == 29784) {
            field645 = null;
            field643 = null;
        }
    }

    @OriginalMember(owner = "client!gja", name = "d", descriptor = "(I)I", line = 118)
    public final int method335(int arg0) {
        ++field638;
        if (arg0 != 43) {
            field642 = 127;
        }
        return super.field2669;
    }
}
