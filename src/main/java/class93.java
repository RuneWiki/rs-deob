import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class93 extends class45 {

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
    private int field2221;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "Luf;")
    private static class145 field2222;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public final void method171(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2222.method1071(this.field2221, 40, arg0);
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "()V")
    public final void method170() {
        field2222.method1074(this.field2221, -122);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method172(Component arg0) throws Exception {
        field2222.method1075(class41.field972, -28557, arg0, class85.field2084);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "()V")
    public final void method173() {
        field2222.method1073(-115, this.field2221);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
    public final void method174() {
        field2222.method1070(this.field2221, super.field1060);
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lvf;I)V")
    public class93(class152 arg0, int arg1) {
        field2222 = arg0.method1131(107);
        this.field2221 = arg1;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "()I")
    public final int method175() {
        return field2222.method1072(31042, this.field2221);
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "()V")
    public static void method742() {
        field2222 = null;
    }
}
