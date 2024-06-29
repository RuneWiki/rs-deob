import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class105 extends class206 {

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    private int field1960;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "Lma;")
    private static class110 field1961;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "()V")
    public final void method541() {
        field1961.method704(this.field1960, super.field4007);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
    public final void method540() {
        field1961.method706(-74, this.field1960);
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "()V")
    public static void method682() {
        field1961 = null;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "()V")
    public final void method538() {
        field1961.method708(this.field1960, 31809);
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "()I")
    public final int method542() {
        return field1961.method707(this.field1960, -25204);
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lih;I)V")
    public class105(class81 arg0, int arg1) {
        field1961 = arg0.method498(32);
        this.field1960 = arg1;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
    public final void method539(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1961.method703(false, this.field1960, arg0);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method543(Component arg0) throws Exception {
        field1961.method705(arg0, -13077, class29.field437, class57.field1003);
    }
}
