import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public abstract class class187 {

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3570 = 0;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Lsd;")
    public static class166 field3575 = class135.method935("Benutzeroberfl-=che geladen)3", 0);

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Lsd;")
    public static class166 field3574 = class135.method935("(U3", 0);

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Lsd;")
    public static class166 field3573 = class135.method935("hel", 0);

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field3577 = 0;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Lf;")
    public static class47 field3576;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "[I")
    public static int[] field3569;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "[[[B")
    public static byte[][][] field3572;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method81(Component arg0, int arg1);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method83(Component arg0, boolean arg1);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)I")
    public abstract int method82(boolean arg0);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method1255(int arg0) {
        field3575 = null;
        field3576 = null;
        field3574 = null;
        field3569 = null;
        field3572 = null;
        field3573 = null;
        if (arg0 != 0) {
            method1255(127);
        }
    }
}
