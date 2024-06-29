import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class class223 {

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field3947 = 0;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Lhe;")
    public static class94 field3945 = new class94(64);

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field3952 = 7759444;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Lhe;")
    public static class94 field3949 = new class94(64);

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Lik;")
    public static class262 field3950;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Lvl;")
    public static class80 field3953;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "[Lvd;")
    public static class135[] field3948;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1519(int arg0) {
        field3946++;
        class256.field4471.method1427(73, arg0 + 25378);
        class25.field387++;
        class256.field4471.method1724(false, class196.field3542);
        if (arg0 != -25378) {
            method1519(78);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V", line = 23)
    public static void method1520(int arg0) {
        field3950 = null;
        field3945 = null;
        field3948 = null;
        field3949 = null;
        field3953 = null;
        if (arg0 != 7759444) {
            field3947 = 24;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)I")
    public abstract int method33(byte arg0);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method32(Component arg0, int arg1);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method31(int arg0, Component arg1);
}
