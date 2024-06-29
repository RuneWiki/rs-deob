import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class301 extends class244 {

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "I")
    private int field5196;

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "Lsj;")
    private static class56 field5197;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V", line = 3)
    public final void method1675(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field5197.method375(arg0, (byte) 52, this.field5196);
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "()V", line = 9)
    public final void method1678() {
        field5197.method372(32039, this.field5196);
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "()V", line = 12)
    public final void method1685() {
        field5197.method371(this.field5196, this.field4053);
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "()I", line = 15)
    public final int method1672() {
        return field5197.method374((byte) -56, this.field5196);
    }

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "()V", line = 18)
    public static void method2109() {
        field5197 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 22)
    public final void method1679(Component arg0) throws Exception {
        field5197.method370(arg0, -22651, class252.field4337, class314.field5440);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "()V", line = 26)
    public final void method1670() {
        field5197.method373(-89, this.field5196);
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Ldi;I)V", line = 28)
    public class301(class151 arg0, int arg1) {
        field5197 = arg0.method954(-109);
        this.field5196 = arg1;
    }
}
