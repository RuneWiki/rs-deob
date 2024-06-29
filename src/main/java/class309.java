import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class309 {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lpt;")
    public static class451 field3937 = new class451(8);

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "[Lqt;")
    public static class542[] field3939 = new class542[4];

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Lpt;")
    public static class451 field3938 = new class451(64);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Llc;")
    public static class552 field3940;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1714(int arg0) {
        field3936++;
        class193.field2337 = null;
        class265.method1480(-1, class599.field8668, 0, (byte) -119, 0, 0, class426.field5495, class185.field2239, 0);
        if (class193.field2337 != null) {
            class562.method3282(0, class343.field4426, 0, class40.field312.field7161, class193.field2337, -1412584499, -67, class385.field5079, class185.field2239, class426.field5495);
            class193.field2337 = null;
        }
        if (arg0 != 906) {
            method1714(-13);
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V", line = 26)
    public static void method1715(int arg0) {
        field3940 = null;
        field3938 = null;
        field3937 = null;
        if (arg0 <= 14) {
            field3939 = null;
        }
        field3939 = null;
    }
}
