import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class209 {

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "F")
    public static float field2765;

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "Liea;")
    public static class481 field2764;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)V", line = 4)
    public static void method1346(int arg0) {
        field2764 = null;
        if (arg0 != 0) {
            method1346(-106);
        }
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(I)I", line = 15)
    public static final int method1347(int arg0) {
        if (arg0 != 0) {
            field2765 = 0.061748974F;
        }
        field2766++;
        return class259.field3281 == 1 ? class89.field1237 : 0;
    }
}
