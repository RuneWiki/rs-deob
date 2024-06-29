import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class112 extends class11 {

    @OriginalMember(owner = "client!uq", name = "O", descriptor = "I")
    private int field1504;

    @OriginalMember(owner = "client!uq", name = "N", descriptor = "Leu;")
    private static class336 field1503;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "()V")
    public final void method81() {
        field1503.method1943(this.field1504, (byte) 105);
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "()I")
    public final int method84() {
        return field1503.method1942(false, this.field1504);
    }

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "()V")
    public static void method817() {
        field1503 = null;
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lpc;I)V")
    public class112(class476 arg0, int arg1) {
        field1503 = arg0.method2872((byte) -79);
        this.field1504 = arg1;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method90(Component arg0) throws Exception {
        field1503.method1941(class94.field1140, class8.field72, arg0, true);
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
    public final void method79(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1503.method1940(104, this.field1504, arg0);
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "()V")
    public final void method82() {
        field1503.method1944(this.field1504, -15801);
    }

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "()V")
    public final void method86() {
        field1503.method1939(this.field1504, super.field168);
    }
}
