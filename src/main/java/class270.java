import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class270 extends class192 {

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "I")
    private int field4624;

    @OriginalMember(owner = "client!uh", name = "Z", descriptor = "Ldh;")
    private static class163 field4625;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 3)
    public final void method858(Component arg0) throws Exception {
        field4625.method1268(21076, arg0, class159.field2694, class218.field3594);
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "()I", line = 6)
    public final int method859() {
        return field4625.method1272(this.field4624, (byte) 14);
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "()V", line = 9)
    public final void method860() {
        field4625.method1273(this.field4624, -15558);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "()V", line = 14)
    public final void method862() {
        field4625.method1271(this.field4624, this.field3201);
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "()V", line = 17)
    public final void method857() {
        field4625.method1269(this.field4624, (byte) -112);
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V", line = 20)
    public final void method861(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field4625.method1270(arg0, 101, this.field4624);
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lml;I)V", line = 25)
    public class270(class129 arg0, int arg1) {
        field4625 = arg0.method918(9644);
        this.field4624 = arg1;
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "()V", line = 30)
    public static void method1951() {
        field4625 = null;
    }
}
