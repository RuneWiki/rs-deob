import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class37 extends class100 implements class218 {

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "Lco;")
    public class201 field491;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "Z")
    private boolean field475;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "[I")
    public static int[] field479 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "[I")
    public static int[] field476 = new int[50];

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
    public static int field492 = -1;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BZLtq;Lhm;III)V", line = 6)
    public final void method245(byte arg0, boolean arg1, class63 arg2, class352 arg3, int arg4, int arg5, int arg6) {
        if (arg0 > -41) {
            field492 = 70;
        }
        ++field477;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(Ltq;I)Lcj;", line = 17)
    public final class123 method252(class63 arg0, int arg1) {
        ++field474;
        class57 var3 = this.field491.method1369(true, super.field1422, arg0, -12, false, super.field1417, 1024);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != 2) {
                this.field475 = true;
            }
            class315 var4 = arg0.method565();
            var4.method482(super.field1417, super.field1418, super.field1422);
            class123 var5 = null;
            if (this.field475) {
                var5 = class225.method1462(1, -55);
            }
            if (this.field491.field3055 != null) {
                class268 var6 = this.field491.field3055.method459();
                arg0.method552(var3, var6, var4, var5 == null ? null : var5.field1695[0], 0);
            } else {
                var3.method404(var4, var5 == null ? null : var5.field1695[0], 0);
            }
            this.field491.method1364(arg0, var3, super.field1422 >> 7, super.field1417 >> 7, super.field1422 >> 7, super.field1417 >> 7, true, -16777216);
            return var5;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)V", line = 54)
    public final void method247(boolean arg0) {
        if (arg0) {
            field492 = -127;
        }
        ++field481;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(Z)I", line = 64)
    public final int method257(boolean arg0) {
        ++field487;
        if (arg0) {
            field479 = null;
        }
        return this.field491.field3063;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V", line = 81)
    public final void method249(int arg0) {
        if (arg0 <= 56) {
            method291((byte) -26);
        }
        ++field480;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BILtq;)Lns;", line = 92)
    public final class57 method255(byte arg0, int arg1, class63 arg2) {
        ++field482;
        if (arg0 < 108) {
            this.method247(false);
        }
        return this.field491.method1369(false, 0, arg2, -12, false, 0, arg1);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ltq;III)Z", line = 103)
    public final boolean method259(class63 arg0, int arg1, int arg2, int arg3) {
        ++field485;
        class57 var5 = this.field491.method1369(false, super.field1422, arg0, -12, false, super.field1417, 65536);
        if (var5 == null) {
            return false;
        } else {
            int var6 = 101 / ((-59 - arg2) / 58);
            class315 var7 = arg0.method565();
            var7.method482(super.field1417, super.field1418, super.field1422);
            return var5.method423(arg1, arg3, var7, false);
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)I", line = 122)
    public final int method244(byte arg0) {
        if (arg0 > -8) {
            this.method258((class63) null, -94);
        }
        ++field483;
        return this.field491.field3065;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)I", line = 133)
    public final int method250(byte arg0) {
        ++field486;
        int var2 = 73 / ((-49 - arg0) / 60);
        return this.field491.field3064;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)Z", line = 144)
    public final boolean method254(boolean arg0) {
        if (!arg0) {
            this.method257(false);
        }
        ++field484;
        return this.field491.method1370(-38);
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(B)V", line = 155)
    public static void method291(byte arg0) {
        field479 = null;
        if (arg0 != -122) {
            method291((byte) 86);
        }
        field476 = null;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ltq;Lvc;IIIIIZIII)V", line = 171)
    public class37(class63 arg0, class271 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class57.method401((byte) -59, arg9, arg8));
        this.field491 = new class201(arg0, arg1, arg8, arg9, arg2, arg3, super.field1417, super.field1422, arg7, arg10);
        this.field475 = ~arg1.field4053 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ltq;I)V", line = 183)
    public final void method258(class63 arg0, int arg1) {
        this.field491.method1363(arg1 + 22359, arg0);
        ++field478;
        if (arg1 != -22360) {
            field492 = 49;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLtq;)V", line = 199)
    public final void method256(byte arg0, class63 arg1) {
        if (arg0 != 82) {
            field476 = null;
        }
        ++field490;
        this.field491.method1368((byte) 69, arg1);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILtq;)V", line = 210)
    public final void method260(int arg0, class63 arg1) {
        ++field488;
        class57 var3 = this.field491.method1369(true, super.field1422, arg1, -12, true, super.field1417, 131072);
        if (arg0 != 0) {
            this.method257(true);
        }
        if (var3 != null) {
            this.field491.method1364(arg1, var3, super.field1422 >> 7, super.field1417 >> 7, super.field1422 >> 7, super.field1417 >> 7, false, arg0 + -16777216);
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)Z", line = 229)
    public final boolean method253(int arg0) {
        if (arg0 > -9) {
            this.method245((byte) -6, false, (class63) null, (class352) null, -31, 74, -57);
        }
        ++field489;
        return false;
    }
}
