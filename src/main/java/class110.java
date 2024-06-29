import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class110 extends class289 {

    @OriginalMember(owner = "client!p", name = "L", descriptor = "I")
    private int field1743;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "Lei;")
    private static class164 field1742;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
    public final void method772() {
        field1742.method1181(this.field1743, super.field4637);
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "()V")
    public static void method773() {
        field1742 = null;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
    public final void method774(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1742.method1180(this.field1743, 77, arg0);
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "()V")
    public final void method775() {
        field1742.method1177(113, this.field1743);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()V")
    public final void method776() {
        field1742.method1179(this.field1743, 31937);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method777(Component arg0) throws Exception {
        field1742.method1178(arg0, class133.field2103, class262.field4214, (byte) 16);
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "()I")
    public final int method778() {
        return field1742.method1176(this.field1743, (byte) -125);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lrm;I)V")
    public class110(class45 arg0, int arg1) {
        field1742 = arg0.method324(0);
        this.field1743 = arg1;
    }
}
