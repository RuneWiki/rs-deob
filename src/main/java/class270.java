import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class270 {

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "I")
    public static int field4155 = 0;

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "Lcb;")
    public static class631 field4152 = new class631(76, -1);

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "I")
    public int field4151;

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "I")
    public int field4153;

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "I")
    public int field4154;

    @OriginalMember(owner = "client!ida", name = "g", descriptor = "I")
    public int field4156;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V", line = 9)
    public static void method1781(int arg0) {
        if (arg0 >= 101) {
            field4152 = null;
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(III)V", line = 19)
    public static final void method1782(int arg0, int arg1, int arg2) {
        if (arg1 == 76) {
            field4150++;
            class118 var3 = class86.method755(true, 6, arg0);
            var3.method933((byte) 69);
            var3.field1811 = arg2;
        }
    }
}
