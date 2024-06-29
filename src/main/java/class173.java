import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class173 {

    @OriginalMember(owner = "client!op", name = "d", descriptor = "Z")
    public static boolean field2517 = false;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "[I")
    public static int[] field2516 = new int[2];

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "Lwfa;")
    public static class182 field2514;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1223(int arg0) {
        class318.method1920(29370);
        field2515++;
        class597.method3370((byte) -67, class366.field4875.field9354, 22050, 2);
        class11.field99 = class498.method2795(22050, class543.field7374, 0, (byte) 32, class611.field8473);
        class84.method636(true, -101, class400.method2335(null, -9));
        class681.field9723 = class498.method2795(2048, class543.field7374, arg0, (byte) 32, class611.field8473);
        class681.field9723.method3554(class61.field680, 4);
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V", line = 19)
    public static void method1224(int arg0) {
        field2514 = null;
        field2516 = null;
        if (arg0 >= -73) {
            field2517 = false;
        }
    }
}
