import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class351 {

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Ldq;")
    public static class493 field4506 = new class493(90, 10);

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field4508 = -50;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Lqn;")
    public static class47 field4507;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Z")
    public static final boolean method2014(int arg0, int arg1) {
        if (arg0 == 10) {
            field4509++;
            return (arg1 & -arg1) == arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method2015(int arg0) {
        if (arg0 != -50) {
            field4506 = null;
        }
        field4507 = null;
        field4506 = null;
    }
}
