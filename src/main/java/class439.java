import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public abstract class class439 {

    @OriginalMember(owner = "client!io", name = "c", descriptor = "Z")
    public static boolean field6256 = false;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field6257 = 0;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "Lmu;")
    public static class303 field6254 = new class303(66, 6);

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V", line = 9)
    public static void method2648(int arg0) {
        if (arg0 == 2) {
            field6254 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V", line = 24)
    public static final void method2649(byte arg0) {
        class693.field9368.method2065((byte) 74, class693.field9368.field4452, 1);
        field6255++;
        class693.field9368.method2065((byte) 74, class693.field9368.field4458, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4447, 2);
        class693.field9368.method2065((byte) 74, class693.field9368.field4461, 2);
        class693.field9368.method2065((byte) 74, class693.field9368.field4417, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4453, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4433, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4443, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4467, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4432, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4435, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4427, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4456, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4444, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4413, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4445, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4421, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4423, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4440, 0);
        class254.method1731(-126);
        class693.field9368.method2065((byte) 74, class693.field9368.field4428, 1);
        if (arg0 == -59) {
            class693.field9368.method2065((byte) 74, class693.field9368.field4426, 3);
            class297.method1947(arg0 ^ 0x3A);
            class440.method2652(true);
            class274.field3858 = true;
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)J")
    public abstract long method2053(int arg0);
}
