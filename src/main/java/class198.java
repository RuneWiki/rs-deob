import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class198 extends class194 {

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
    private int field3876;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "Luh;")
    private static class187 field3875;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1135(Component arg0) throws Exception {
        field3875.method1148(arg0, class48.field1163, class143.field2934, 31802);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()I")
    public final int method1136() {
        return field3875.method1149(this.field3876, (byte) -4);
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "()V")
    public static void method1285() {
        field3875 = null;
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "()V")
    public final void method1139() {
        field3875.method1150(this.field3876, 32058);
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "()V")
    public final void method1140() {
        field3875.method1151(7657, this.field3876);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "()V")
    public final void method1137() {
        field3875.method1153(this.field3876, super.field3843);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public final void method1138(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3875.method1152(this.field3876, arg0, -83);
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lpc;I)V")
    public class198(class137 arg0, int arg1) {
        field3875 = arg0.method871(91);
        this.field3876 = arg1;
    }
}
