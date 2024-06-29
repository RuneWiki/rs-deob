import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class236 extends class19 {

    @OriginalMember(owner = "client!fr", name = "M", descriptor = "I")
    private int field3360;

    @OriginalMember(owner = "client!fr", name = "N", descriptor = "Ljq;")
    private static class300 field3361;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "()V")
    public final void method268() {
        field3361.method1943((byte) 77, this.field3360);
    }

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "()V")
    public static void method1599() {
        field3361 = null;
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
    public final void method270(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3361.method1946(this.field3360, 107, arg0);
        }
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "()I")
    public final int method265() {
        return field3361.method1948((byte) -84, this.field3360);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "()V")
    public final void method256() {
        field3361.method1945(113, this.field3360);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method261(Component arg0) throws Exception {
        field3361.method1947(class247.field3492, -19022, arg0, class76.field1094);
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "()V")
    public final void method257() {
        field3361.method1944(this.field3360, super.field336);
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lko;I)V")
    public class236(class294 arg0, int arg1) {
        field3361 = arg0.method1920(13);
        this.field3360 = arg1;
    }
}
