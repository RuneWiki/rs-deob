import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class283 extends class131 {

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
    private int field5000;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "Lae;")
    private static class91 field4999;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "()I")
    public final int method632() {
        return field4999.method596(true, this.field5000);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "()V")
    public final void method629() {
        field4999.method592(this.field5000, true);
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Llb;I)V")
    public class283(class207 arg0, int arg1) {
        field4999 = arg0.method1429(-16166);
        this.field5000 = arg1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method631(Component arg0) throws Exception {
        field4999.method591(class225.field3868, (byte) -62, class215.field3720, arg0);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
    public final void method627() {
        field4999.method593(this.field5000, super.field2194);
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
    public final void method628(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4999.method594(this.field5000, (byte) -127, arg0);
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "()V")
    public final void method630() {
        field4999.method595((byte) 119, this.field5000);
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "()V")
    public static void method1899() {
        field4999 = null;
    }
}
