import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class262 extends class239 {

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    private int field4386;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "Lgi;")
    private static class39 field4385;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public final void method1164(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4385.method238(arg0, -10203, this.field4386);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "()V")
    public final void method1169() {
        field4385.method241(this.field4386, super.field4037);
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "()V")
    public final void method1166() {
        field4385.method239(120, this.field4386);
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "()V")
    public final void method1167() {
        field4385.method237(true, this.field4386);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()I")
    public final int method1165() {
        return field4385.method236(this.field4386, -10637);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1168(Component arg0) throws Exception {
        field4385.method240(class54.field970, arg0, class142.field2343, 6816);
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "()V")
    public static void method1861() {
        field4385 = null;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lci;I)V")
    public class262(class83 arg0, int arg1) {
        field4385 = arg0.method578(-8492);
        this.field4386 = arg1;
    }
}
