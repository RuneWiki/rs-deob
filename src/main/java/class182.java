import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class182 {

    @OriginalMember(owner = "client!an", name = "e", descriptor = "Z")
    public static boolean field2387 = true;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field2386 = -1;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "Lkh;")
    public static class354 field2389 = new class354();

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "Lll;")
    public static class522 field2384;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)[Lfq;")
    public static final class141[] method1166(int arg0) {
        field2385++;
        if (arg0 != 22050) {
            method1166(10);
        }
        return new class141[] { class210.field2690, class494.field6993, class460.field6581, class658.field9037, class97.field1210, class689.field9797, class8.field87, class557.field7808, class170.field2237, class632.field8769, class440.field6179, class43.field655, class415.field5910, class682.field9343 };
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V")
    public static final void method1167(int arg0) {
        field2388++;
        class700.method3878(13797);
        class440.method2595(2, 22050, class223.field2944.field613.method1611((byte) -126) == 1, true);
        class761.field10601 = class619.method3398(class68.field939, 0, 102, 22050, class681.field9312);
        class547.method3113(arg0 ^ 0x806, class497.method2887(9, null), true);
        class152.field1853 = class619.method3398(class68.field939, 1, 84, arg0, class681.field9312);
        class152.field1853.method1281(28305, class668.field9148);
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V")
    public static void method1168(int arg0) {
        field2384 = null;
        field2389 = null;
        if (arg0 > -97) {
            field2387 = false;
        }
    }

    @OriginalMember(owner = "client!an", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2383++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(II)V")
    public class182(int arg0, int arg1) {
    }
}
