import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class151 extends class82 {

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "B")
    public byte field2118 = 5;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "Lbj;")
    public static class159 field2126 = new class159(32);

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public static int field2129 = 0;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "Luf;")
    public static class310 field2130 = new class310(98, 5);

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "Ljm;")
    public static class485 field2131 = new class485(44, 7);

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public int field2117;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public int field2120;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public int field2121;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public int field2122;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
    public int field2125;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public int field2128;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "Z")
    public boolean field2123;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)Lls;")
    public static final class92 method954(int arg0) {
        field2127++;
        if (class481.field7037 == null || class365.field5130 == null) {
            return null;
        }
        class365.field5130.method2204(-75, class481.field7037);
        int var1 = -58 / ((-arg0 - 38) / 50);
        class92 var2 = (class92) class365.field5130.method2203(false);
        if (var2 == null) {
            return null;
        } else {
            class191 var3 = class481.field7031.method850((byte) 78, var2.field1236);
            return var3 != null && var3.field2687 && var3.method1149(0, class481.field7030) ? var2 : class60.method380(-21213);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIIBII)V")
    public static final void method955(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field2124++;
        if (arg1 >= 1 && arg4 >= 1 && class442.field6435 - 2 >= arg1 && class232.field3217 - 2 >= arg4) {
            int var9 = arg0;
            if (arg0 < 3 && class426.method2553(arg4, arg1, 1)) {
                var9 = arg0 + 1;
            }
            if (!class437.field6374.method560((byte) 115, class278.field3761) && !class361.method2003((byte) -39, arg1, arg4, class304.field4173, var9)) {
                return;
            }
            if (class385.field5410 == null) {
                return;
            }
            class225.field3173.method1900(arg0, arg8, class418.field6109, arg4, (byte) 82, class6.field64[arg0], arg1);
            if (arg3 >= 0) {
                boolean var10 = class437.field6374.field4279;
                class437.field6374.field4279 = true;
                class225.field3173.method1901(arg3, class418.field6109, 94, arg1, arg5, arg2, arg4, arg0, class6.field64[arg0], var9, arg7);
                class437.field6374.field4279 = var10;
            }
        }
        if (arg6 != -6) {
            field2131 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(B)J")
    public static final long method956(byte arg0) {
        if (arg0 < 104) {
            method956((byte) -74);
        }
        field2119++;
        return class52.field700.method716((byte) 122);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIZ)V")
    public static final void method957(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2132++;
        if (class278.field3761 == 0) {
            class101.method671(false, arg2 ^ 0x22);
        } else {
            class324.field4456 = class278.field3761;
            class196.method1211(false, 0);
        }
        class346.field4746 = arg4;
        if (arg2 == 98) {
            class380.field5371 = arg1;
            class403.field5595 = arg3;
            class481.method2844(arg0);
        }
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(B)V")
    public static void method958(byte arg0) {
        field2131 = null;
        field2126 = null;
        if (arg0 != 5) {
            method955(88, -36, 56, 49, 106, -23, (byte) 90, -77, -55);
        }
        field2130 = null;
    }
}
