import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public abstract class class294 extends class45 {

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "Ltt;")
    public static class338 field3903 = new class338(39, 15);

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "F")
    public static float field3904;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 5)
    public static void method1742(byte arg0) {
        field3903 = null;
        if (arg0 < 88) {
            field3903 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)I")
    public abstract int method452(boolean arg0);

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(Z)I")
    public abstract int method450(boolean arg0);

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)I")
    public abstract int method454(int arg0);

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)I")
    public abstract int method451(byte arg0);

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(B)J")
    public abstract long method453(byte arg0);
}
