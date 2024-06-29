import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class149 extends class229 {

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    private int field2757;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "Lea;")
    private static class193 field2758;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "()V")
    public final void method1099() {
        field2758.method1331((byte) -112, this.field2757);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "()V")
    public final void method1100() {
        field2758.method1336(-24645, this.field2757);
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "()V")
    public static void method1101() {
        field2758 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1102(Component arg0) throws Exception {
        field2758.method1332(arg0, true, class253.field4432, class61.field1028);
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "()I")
    public final int method1103() {
        return field2758.method1334(this.field2757, 79);
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lkh;I)V")
    public class149(class5 arg0, int arg1) {
        field2758 = arg0.method25((byte) -71);
        this.field2757 = arg1;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public final void method1104(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2758.method1333(arg0, this.field2757, (byte) -16);
        }
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "()V")
    public final void method1105() {
        field2758.method1335(this.field2757, super.field3940);
    }
}
