import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class229 extends class648 {

    @OriginalMember(owner = "client!aia", name = "u", descriptor = "Z")
    private boolean field3373 = false;

    @OriginalMember(owner = "client!aia", name = "o", descriptor = "Z")
    public static boolean field3367 = false;

    @OriginalMember(owner = "client!aia", name = "l", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!aia", name = "n", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!aia", name = "p", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!aia", name = "q", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!aia", name = "s", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!aia", name = "t", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!aia", name = "v", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!aia", name = "r", descriptor = "Llk;")
    public static class589 field3370;

    @OriginalMember(owner = "client!aia", name = "m", descriptor = "[I")
    public static int[] field3365;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(BII)V", line = 7)
    public final void method1453(byte arg0, int arg1, int arg2) {
        ++field3371;
        if (arg0 < 33) {
            this.method1448(true, -105);
        }
    }

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "(I)Z", line = 17)
    public final boolean method1449(int arg0) {
        if (arg0 != 13003) {
            this.field3373 = true;
        }
        ++field3374;
        return true;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZI)V", line = 30)
    public final void method1448(boolean arg0, int arg1) {
        super.field9139.method2300(class499.field7099, class336.field4874, arg1);
        ++field3366;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lbca;II)V", line = 38)
    public final void method1455(class663 arg0, int arg1, int arg2) {
        super.field9139.method2294(arg0, -2);
        if (arg1 != 12885) {
            this.method1449(66);
        }
        ++field3364;
        super.field9139.method2353((byte) -95, arg2);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(III)V", line = 50)
    public static final void method1541(int arg0, int arg1, int arg2) {
        ++field3372;
        int var3 = 72 % (arg1 / 42);
        class150 var4 = class676.method3885(1000, 16, arg0);
        var4.method1116(47);
        var4.field2346 = arg2;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZZ)V", line = 65)
    public final void method1451(boolean arg0, boolean arg1) {
        ++field3369;
        class584 var3 = super.field9139.method2303((byte) 118);
        if (var3 != null && arg1) {
            super.field9139.method2375((byte) 12, 1);
            super.field9139.method2294(var3, -2);
            super.field9139.method2348((byte) 101, client.field4275);
            super.field9139.method2375((byte) 74, 1);
            super.field9139.method2300(class499.field7099, class49.field706, 0);
            super.field9139.method2340(class328.field4670, true, 2, false, true);
            super.field9139.method2407(0, class10.field152, 60);
            class441 var4 = super.field9139.method2299(-25498);
            var4.method2731(super.field9139.method2321(0), false);
            super.field9139.method2291(class60.field854, -106);
            super.field9139.method2375((byte) -124, 0);
            this.field3373 = true;
        } else {
            super.field9139.method2407(0, class10.field152, 99);
        }
        if (arg0) {
            method1541(-11, 126, -23);
        }
    }

    @OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(Lwu;)V", line = 103)
    public class229(class373 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!aia", name = "d", descriptor = "(I)V", line = 107)
    public final void method1450(int arg0) {
        if (this.field3373) {
            super.field9139.method2375((byte) -68, 1);
            super.field9139.method2348((byte) -124, class112.field1557);
            super.field9139.method2300(class336.field4874, class336.field4874, 0);
            super.field9139.method2329(2, (byte) -124, class469.field6850);
            super.field9139.method2407(0, class331.field4759, 113);
            super.field9139.method2410(-1);
            super.field9139.method2294((class663) null, -2);
            super.field9139.method2375((byte) 53, 0);
            this.field3373 = false;
        } else {
            super.field9139.method2407(0, class331.field4759, 122);
        }
        ++field3368;
        if (arg0 <= -67) {
            super.field9139.method2300(class336.field4874, class336.field4874, 0);
        }
    }

    @OriginalMember(owner = "client!aia", name = "e", descriptor = "(I)V", line = 133)
    public static void method1542(int arg0) {
        field3365 = null;
        if (arg0 == 16) {
            field3370 = null;
        }
    }
}
