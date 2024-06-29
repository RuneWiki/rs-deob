import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class34 extends class179 {

    @OriginalMember(owner = "client!u", name = "I", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "Lwl;")
    private static class173 field429;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 3)
    public final void method239(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field429.method1202(arg0, (byte) -124, this.field430);
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "()V", line = 10)
    public static void method240() {
        field429 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V", line = 13)
    public final void method241() {
        field429.method1205((byte) -128, this.field430);
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "()I", line = 16)
    public final int method242() {
        return field429.method1204(false, this.field430);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "()V", line = 19)
    public final void method243() {
        field429.method1203(-6143, this.field430);
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "()V", line = 23)
    public final void method244() {
        field429.method1206(this.field430, this.field2659);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 26)
    public final void method245(Component arg0) throws Exception {
        field429.method1207(false, class242.field3627, class248.field3696, arg0);
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lgl;I)V", line = 28)
    public class34(class262 arg0, int arg1) {
        field429 = arg0.method1780((byte) -92);
        this.field430 = arg1;
    }
}
