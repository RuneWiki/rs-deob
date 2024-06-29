import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class83 extends class123 {

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    private int field1679;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "Lr;")
    private static class161 field1680;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "()V")
    public final void method555() {
        field1680.method1031((byte) -112, this.field1679);
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "()V")
    public static void method556() {
        field1680 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method557(Component arg0) throws Exception {
        field1680.method1030(arg0, class76.field1583, (byte) 126, class175.field3378);
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "()I")
    public final int method558() {
        return field1680.method1033(this.field1679, -117);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public final void method559(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1680.method1029((byte) -127, arg0, this.field1679);
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "()V")
    public final void method560() {
        field1680.method1034(this.field1679, super.field2478);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()V")
    public final void method561() {
        field1680.method1032(this.field1679, 55);
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lrh;I)V")
    public class83(class169 arg0, int arg1) {
        field1680 = arg0.method1128((byte) 8);
        this.field1679 = arg1;
    }
}
