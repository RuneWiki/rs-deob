import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class71 extends class79 {

    @OriginalMember(owner = "client!le", name = "K", descriptor = "Lcd;")
    private static class17 field1847;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "()I", line = 4)
    public final int method579() {
        return field1847.method163(29176);
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Ljc;Ljava/awt/Component;)V", line = 7)
    public class71(class57 arg0, Component arg1) throws Exception {
        super(22050);
        field1847 = arg0.method445((byte) -4);
        field1847.method167(false, arg1);
        this.method660(arg0, 16384);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "()V", line = 13)
    public final void method580() {
        field1847.method166(class79.field2069);
    }

    @OriginalMember(owner = "client!le", name = "f", descriptor = "()V", line = 16)
    public static void method581() {
        field1847 = null;
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "()V", line = 19)
    public final void method582() {
        field1847.method165(-78);
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V", line = 22)
    public final void method583(int arg0) throws Exception {
        field1847.method164((byte) -14, arg0);
    }
}
