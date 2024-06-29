import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class401 {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field5966 = 0;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field5968 = 0;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field5967 = -1;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)I", line = 7)
    public static int method2606(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 37)
    public static final void method2607(int arg0) {
        field5969++;
        if (class31.field525) {
            return;
        }
        class31.field525 = true;
        if (class329.field4714) {
            class155.field2027 = (float) ((int) class155.field2027 - 17 & 0xFFFFFFF0);
        } else {
            class128.field1700 += (-12.0F - class128.field1700) / 2.0F;
        }
        if (arg0 >= -59) {
            method2607(-103);
        }
        class91.field1263 = true;
    }
}
