import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 {

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Ltg;")
    public class157 field133;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "B")
    public byte field134;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "B")
    public byte field137;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "S")
    public short field136;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V", line = 12)
    public static final void method56(byte arg0) {
        if (arg0 == -4) {
            class421.method2500(120);
            field135++;
            class322.method1949(arg0 + 18);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 24)
    public static final void method57(int arg0) {
        if (arg0 >= -12) {
            return;
        }
        if (class279.field4128 == 1 || class279.field4128 == 3 || class279.field4128 != class189.field2708 && (class279.field4128 == 0 || class189.field2708 == 0)) {
            class434.field6110 = 0;
            class481.field6704 = 0;
            class125.field1687.method2408(101);
        }
        field132++;
        class189.field2708 = class279.field4128;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Ltg;III)V", line = 42)
    public class9(class157 arg0, int arg1, int arg2, int arg3) {
        this.field133 = arg0;
        this.field134 = (byte) arg2;
        this.field137 = (byte) arg3;
        this.field136 = (short) arg1;
    }
}
