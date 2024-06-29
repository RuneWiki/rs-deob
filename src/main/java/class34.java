import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class34 extends class76 implements class140 {

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "I")
    private int field452;

    @OriginalMember(owner = "client!rca", name = "m", descriptor = "Lpp;")
    public static class464 field460 = new class464(66, 8);

    @OriginalMember(owner = "client!rca", name = "n", descriptor = "I")
    public static int field461 = 0;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!rca", name = "h", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!rca", name = "i", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!rca", name = "j", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!rca", name = "k", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!rca", name = "l", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Z)I")
    public final int method302(boolean arg0) {
        ++field456;
        return arg0 ? -23 : 0;
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Ljj;I[BI)V")
    public class34(class66 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field452 = arg1;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(II)V")
    public static final void method303(int arg0, int arg1) {
        if (arg1 == 17011) {
            ++field457;
            class21 var2 = class601.method3413(arg0, 11, (byte) 95);
            var2.method227(true);
        }
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)V")
    public static void method304(int arg0) {
        field460 = null;
        if (arg0 > -110) {
            field461 = 120;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)J")
    public final long method305(int arg0) {
        ++field455;
        return arg0 != -21337 ? 105L : super.field1392.getAddress();
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIIB)I")
    public static final int method306(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 79) {
            field460 = null;
        }
        ++field458;
        if (arg0 <= arg1) {
            return arg2 >= arg1 ? arg1 : arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIZI)I")
    public static final int method307(int arg0, int arg1, boolean arg2, int arg3) {
        ++field451;
        if (~arg1 == ~arg3) {
            return arg1;
        } else {
            int var4 = -arg0 + 128;
            if (arg2) {
                return 5;
            } else {
                int var5 = (127 & arg1) * var4 + (arg3 & 127) * arg0 >> 7;
                int var6 = (896 & arg1) * var4 - -((896 & arg3) * arg0) >> 7;
                int var7 = (64512 & arg1) * var4 + (arg3 & 64512) * arg0 >> 7;
                return 896 & var6 | 64512 & var7 | var5 & 127;
            }
        }
    }

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "(I)V")
    public static final void method308(int arg0) {
        ++field454;
        if (class40.field560.toLowerCase().indexOf("microsoft") == -1) {
            class524.field7286[46] = 72;
            class524.field7286[47] = 73;
            class524.field7286[44] = 71;
            class524.field7286[91] = 42;
            class524.field7286[61] = 27;
            class524.field7286[59] = 57;
            class524.field7286[92] = 74;
            class524.field7286[93] = 43;
            if (class40.field565 != null) {
                class524.field7286[222] = 58;
                class524.field7286[192] = 28;
                class524.field7286[520] = 59;
            } else {
                class524.field7286[222] = 59;
                class524.field7286[192] = 58;
            }
            class524.field7286[45] = 26;
        } else {
            class524.field7286[221] = 43;
            class524.field7286[191] = 73;
            class524.field7286[190] = 72;
            class524.field7286[187] = 27;
            class524.field7286[192] = 58;
            class524.field7286[186] = 57;
            class524.field7286[188] = 71;
            class524.field7286[222] = 59;
            class524.field7286[219] = 42;
            class524.field7286[220] = 74;
            class524.field7286[189] = 26;
            class524.field7286[223] = 28;
        }
        if (arg0 > -69) {
            method304(-43);
        }
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(Z)I")
    public final int method309(boolean arg0) {
        if (!arg0) {
            method306(27, 110, 100, (byte) -120);
        }
        ++field450;
        return this.field452;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(BII[B)V")
    public final void method310(byte arg0, int arg1, int arg2, byte[] arg3) {
        ++field453;
        this.method723(arg3, arg2);
        this.field452 = arg1;
        if (arg0 != 53) {
            field460 = null;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lgp;I)I")
    public static final int method311(class561 arg0, int arg1) {
        ++field459;
        if (arg1 != -1394) {
            return 37;
        } else {
            int var2 = 0;
            if (arg0.method3186((byte) 57, class400.field5989)) {
                ++var2;
            }
            if (arg0.method3186((byte) 57, class605.field8617)) {
                ++var2;
            }
            return var2;
        }
    }
}
