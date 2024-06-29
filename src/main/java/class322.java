import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class322 extends class72 {

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Lqaa;")
    public static class27 field4578 = new class27(39, 2);

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4580 = null;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Ljh;")
    public static class158 field4579 = new class158();

    @OriginalMember(owner = "client!db", name = "q", descriptor = "Lee;")
    public static class673 field4582 = new class673("WTRC", 1);

    @OriginalMember(owner = "client!db", name = "r", descriptor = "Lnga;")
    public static class510 field4583 = new class510(64);

    @OriginalMember(owner = "client!db", name = "s", descriptor = "[I")
    public static int[] field4584 = new int[8];

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field4585 = 500;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lcq;)V")
    public class322(class464 arg0) {
        super(arg0);
        class483.method2912(super.field1282, 0);
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)I")
    public final int method2065(int arg0) {
        if (arg0 != 27669) {
            field4583 = null;
        }
        ++field4574;
        return super.field1282;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(ILcq;)V")
    public class322(int arg0, class464 arg1) {
        super(arg0, arg1);
        class483.method2912(super.field1282, 0);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public final void method55(int arg0) {
        ++field4576;
        if (super.field1286.method2820(false).method3615((byte) 33) < 96) {
            super.field1282 = 0;
        }
        if (~super.field1282 > -1 || super.field1282 > 2) {
            super.field1282 = this.method60(-3271);
        }
        if (arg0 < 30) {
            this.method2066(88);
        }
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)Z")
    public final boolean method2066(int arg0) {
        if (arg0 < 97) {
            field4578 = null;
        }
        ++field4577;
        return ~super.field1286.method2820(false).method3615((byte) 23) <= -97;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)I")
    public final int method60(int arg0) {
        if (arg0 != -3271) {
            return -47;
        } else {
            ++field4573;
            return ~super.field1286.method2820(false).method3615((byte) 118) > -97 ? 0 : 2;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
    public final void method59(int arg0, int arg1) {
        super.field1282 = arg0;
        ++field4575;
        class483.method2912(super.field1282, arg1 + -3);
        if (arg1 != 3) {
            field4578 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
    public static void method2067(int arg0) {
        field4579 = null;
        field4580 = null;
        field4583 = null;
        field4584 = null;
        int var1 = -33 / ((67 - arg0) / 49);
        field4578 = null;
        field4582 = null;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)I")
    public final int method58(int arg0, int arg1) {
        if (arg1 != 11260) {
            field4585 = -33;
        }
        ++field4581;
        return ~super.field1286.method2820(false).method3615((byte) 72) > -97 ? 3 : 1;
    }
}
