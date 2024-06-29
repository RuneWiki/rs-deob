import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class730 {

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "[I")
    public static int[] field9894 = new int[2];

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "I")
    public static int field9896 = 1403;

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "I")
    public static int field9895;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Luq;I)V")
    public static final void method4033(class172 arg0, int arg1) {
        field9895++;
        class548.field7570 = 0;
        class109.field1522 = 0;
        class69.field954 = new class345();
        int var2 = -128 / ((arg1 - 57) / 51);
        class341.field4772 = new class713[1024];
        class211.field2713 = new class150[class308.field4373[class758.field10380] + 1];
        class273.field3974 = 0;
        class600.field8183 = 0;
        client.method2033(arg0, -1);
        class773.method4250(-113, arg0);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V")
    public static void method4034(int arg0) {
        field9894 = null;
        if (arg0 != 1) {
            method4034(46);
        }
    }
}
