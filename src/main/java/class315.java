import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class315 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Ldg;")
    public static class376 field4667 = new class376(38, 4);

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Z")
    public static boolean field4670 = false;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Lkj;")
    public static class525 field4669 = new class525();

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Z")
    public static boolean field4671 = false;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "F")
    public static float field4668;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V", line = 14)
    public static void method1986(byte arg0) {
        field4667 = null;
        field4669 = null;
        if (arg0 != 127) {
            method1986((byte) -14);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V", line = 26)
    public static final void method1987(byte arg0) {
        field4666++;
        int var1 = class287.field4270.method2746(0, class328.field4859);
        if (var1 == 0) {
            class262.field3977 = null;
            class632.method3517(0, 0);
        } else if (var1 == 1) {
            class540.method3069(4, (byte) 0);
            class632.method3517(512, 0);
            if (class672.field9500 != null) {
                class549.method3103(16029);
            }
        } else {
            class540.method3069(4, (byte) (class534.field7501 - 4 & 0xFF));
            class632.method3517(2, 0);
        }
        class566.field7976 = class58.field1112;
        int var2 = 66 / ((51 - arg0) / 52);
    }
}
