import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class75 extends class207 {

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "Ljb;")
    public static class519 field1016 = new class519(72, 6);

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "[I")
    public static int[] field1020;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)Z")
    public final boolean method604(byte arg0) {
        ++field1021;
        if (!class294.method1892(super.field2668.field5141.method2541(43), arg0 ^ -99)) {
            return false;
        } else {
            return arg0 != 8 ? true : true;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BII)Z")
    public static final boolean method605(byte arg0, int arg1, int arg2) {
        if (arg0 != -110) {
            field1020 = null;
        }
        ++field1015;
        return (2048 & arg2) != 0 && (arg1 & 55) != 0;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
    public static void method606(byte arg0) {
        field1020 = null;
        field1016 = null;
        if (arg0 > -51) {
            field1020 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public final void method37(int arg0) {
        int var2 = 99 / ((arg0 - -58) / 48);
        if (super.field2668.field5141.method2544(0) && !class294.method1892(super.field2668.field5141.method2541(43), -121)) {
            super.field2669 = 0;
        }
        ++field1022;
        if (~super.field2669 > -1 || super.field2669 > 1) {
            super.field2669 = this.method36(-89);
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lrd;)V")
    public class75(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)V")
    public final void method41(int arg0, byte arg1) {
        super.field2669 = arg0;
        if (arg1 <= -7) {
            ++field1014;
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)I")
    public final int method607(int arg0) {
        ++field1017;
        if (arg0 != 43) {
            method606((byte) -80);
        }
        return super.field2669;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(IB)I")
    public final int method39(int arg0, byte arg1) {
        ++field1023;
        if (!class294.method1892(super.field2668.field5141.method2541(43), -122)) {
            return 3;
        } else {
            if (arg1 != 69) {
                this.method39(85, (byte) 43);
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)I")
    public final int method36(int arg0) {
        if (arg0 > -14) {
            return -91;
        } else {
            ++field1018;
            return 0;
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(ILrd;)V")
    public class75(int arg0, class355 arg1) {
        super(arg0, arg1);
    }
}
