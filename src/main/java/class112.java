import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class112 {

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field1781 = 1;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field1780 = 0;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "F")
    public static float field1782;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)J", line = 3)
    public static final synchronized long method1033(int arg0) {
        field1779++;
        long var1 = System.currentTimeMillis();
        if (var1 < class311.field4902) {
            class318.field4985 += class311.field4902 - var1;
        }
        class311.field4902 = var1;
        if (arg0 != -11752) {
            method1033(55);
        }
        return class318.field4985 + var1;
    }
}
