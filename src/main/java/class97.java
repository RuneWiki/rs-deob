import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class97 extends class37 {

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "Led;")
    private static class33 field2215;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "()V")
    public final void method264() {
        field2215.method239(true);
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "()V")
    public static void method738() {
        field2215 = null;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "()I")
    public final int method262() {
        return field2215.method240((byte) 115);
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "()V")
    public final void method268() {
        field2215.method241(class37.field779);
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lg;)V")
    public class97(class43 arg0) {
        field2215 = arg0.method310((byte) 114);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public final void method260(int arg0) throws Exception {
        field2215.method242(8275, arg0);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
    public final void method266(Component arg0, int arg1, boolean arg2) throws Exception {
        field2215.method238(arg0, arg2, (byte) 116, arg1);
    }
}
