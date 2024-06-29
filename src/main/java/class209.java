import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class209 extends class334 {

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "Lfp;")
    public class414 field3227;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public static int field3225 = 0;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "Z")
    public static boolean field3226 = false;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "Z")
    public static boolean field3229 = true;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "Lem;")
    public static class434 field3224 = new class434();

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "Ljd;")
    public static class426 field3228;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public static void method1482(int arg0) {
        if (arg0 != 0) {
            field3225 = -96;
        }
        field3228 = null;
        field3224 = null;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lfp;)V")
    public class209(class414 arg0) {
        this.field3227 = arg0;
    }
}
