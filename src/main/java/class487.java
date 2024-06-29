import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class487 extends class545 {

    @OriginalMember(owner = "client!cia", name = "u", descriptor = "Z")
    private boolean field7016 = false;

    @OriginalMember(owner = "client!cia", name = "w", descriptor = "Lfba;")
    public static class348 field7018 = new class348(4);

    @OriginalMember(owner = "client!cia", name = "C", descriptor = "Z")
    public static boolean field7024 = false;

    @OriginalMember(owner = "client!cia", name = "q", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!cia", name = "r", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!cia", name = "s", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!cia", name = "t", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!cia", name = "v", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!cia", name = "x", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!cia", name = "y", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!cia", name = "z", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!cia", name = "A", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!cia", name = "D", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!cia", name = "B", descriptor = "Lsk;")
    public static class121 field7023;

    @OriginalMember(owner = "client!cia", name = "E", descriptor = "Lla;")
    public static class423 field7026;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(III)V")
    public final void method451(int arg0, int arg1, int arg2) {
        ++field7013;
        if (arg0 != 0) {
            this.method457((byte) 26, true);
        }
    }

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "(I)Z")
    public final boolean method459(int arg0) {
        if (arg0 <= 63) {
            method2968(79, 73, -67);
        }
        ++field7017;
        return true;
    }

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "(III)Z")
    public static final boolean method2968(int arg0, int arg1, int arg2) {
        ++field7015;
        if (arg2 != 1) {
            method2968(-83, -47, 10);
        }
        return class125.method879(arg0, arg1, arg2 + 6) & class530.method3214(arg0, arg1, (byte) 120);
    }

    @OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(Lch;)V")
    public class487(class38 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(BZ)V")
    public final void method457(byte arg0, boolean arg1) {
        if (arg0 <= 101) {
            this.method459(4);
        }
        ++field7019;
        class245 var3 = super.field7920.method385(3);
        if (var3 != null && arg1) {
            super.field7920.method208(8, 1);
            super.field7920.method264(var3, -2);
            super.field7920.method284((byte) 72, class280.field3929);
            super.field7920.method208(8, 1);
            super.field7920.method386((byte) -113, class567.field8198, class596.field8472);
            super.field7920.method282(false, true, (byte) -60, 2, class401.field5746);
            super.field7920.method242((byte) -122, class272.field3857, 0);
            class417 var4 = super.field7920.method381((byte) 42);
            var4.method2536(super.field7920.method201(70), 12829);
            super.field7920.method238(114, class476.field6775);
            super.field7920.method208(8, 0);
            this.field7016 = true;
        } else {
            super.field7920.method242((byte) -116, class272.field3857, 0);
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(ZZ)V")
    public final void method454(boolean arg0, boolean arg1) {
        if (arg1) {
            this.method452(49);
        }
        super.field7920.method386((byte) -122, class567.field8198, class281.field3934);
        ++field7020;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(IILec;)V")
    public final void method455(int arg0, int arg1, class101 arg2) {
        ++field7012;
        if (arg0 == 2) {
            super.field7920.method264(arg2, arg0 ^ -4);
            super.field7920.method411(17024, arg1);
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(B)V")
    public static void method2969(byte arg0) {
        field7018 = null;
        field7023 = null;
        if (arg0 < 35) {
            method2969((byte) -62);
        }
        field7026 = null;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(I)V")
    public final void method452(int arg0) {
        if (arg0 == 2) {
            if (!this.field7016) {
                super.field7920.method242((byte) -127, class234.field3509, 0);
            } else {
                super.field7920.method208(8, 1);
                super.field7920.method284((byte) 85, class76.field1104);
                super.field7920.method386((byte) -116, class281.field3934, class281.field3934);
                super.field7920.method230(class231.field3462, 2, 112);
                super.field7920.method242((byte) -113, class234.field3509, 0);
                super.field7920.method389((byte) -2);
                super.field7920.method264((class101) null, arg0 + -4);
                super.field7920.method208(8, 0);
                this.field7016 = false;
            }
            ++field7014;
            super.field7920.method386((byte) 90, class281.field3934, class281.field3934);
        }
    }
}
