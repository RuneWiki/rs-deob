import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class111 extends class36 {

    @OriginalMember(owner = "client!s", name = "G", descriptor = "Lt;")
    private static class117 field2687;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "()V", line = 3)
    public final void method227() {
        field2687.method900(118);
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lra;Ljava/awt/Component;)V", line = 6)
    public class111(class102 arg0, Component arg1) throws Exception {
        super(22050);
        field2687 = arg0.method723(0);
        field2687.method902(arg1, -118);
        this.method228(arg0, 16384);
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "()V", line = 13)
    public static void method859() {
        field2687 = null;
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "()I", line = 16)
    public final int method230() {
        return field2687.method899((byte) 65);
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V", line = 19)
    public final void method224(int arg0) throws Exception {
        field2687.method901(arg0, 22337);
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "()V", line = 22)
    public final void method226() {
        field2687.method898(class36.field908);
    }
}
