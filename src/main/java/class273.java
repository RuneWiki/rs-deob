import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class273 extends class218 {

    @OriginalMember(owner = "client!hp", name = "K", descriptor = "I")
    private int field3543;

    @OriginalMember(owner = "client!hp", name = "J", descriptor = "Lch;")
    private static class392 field3542;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)V", line = 3)
    public final void method773(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3542.method2257(arg0, (byte) -112, this.field3543);
        }
    }

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "()V", line = 9)
    public static void method1526() {
        field3542 = null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 12)
    public final void method777(Component arg0) throws Exception {
        field3542.method2255(class197.field2383, class90.field1101, arg0, true);
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "()I", line = 15)
    public final int method772() {
        return field3542.method2260(-62, this.field3543);
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "()V", line = 18)
    public final void method774() {
        field3542.method2259(this.field3543, super.field2669);
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "()V", line = 21)
    public final void method776() {
        field3542.method2256((byte) -117, this.field3543);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "()V", line = 26)
    public final void method775() {
        field3542.method2258(this.field3543, 40);
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lpq;I)V", line = 28)
    public class273(class165 arg0, int arg1) {
        field3542 = arg0.method922(-97);
        this.field3543 = arg1;
    }
}
