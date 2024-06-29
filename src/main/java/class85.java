import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class85 extends class127 {

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "I")
    private int field1172;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "Lna;")
    private static class147 field1173;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
    public final void method112(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1173.method976((byte) -92, arg0, this.field1172);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "()I")
    public final int method107() {
        return field1173.method972(126, this.field1172);
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lsi;I)V")
    public class85(class56 arg0, int arg1) {
        field1173 = arg0.method346((byte) -100);
        this.field1172 = arg1;
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "()V")
    public static void method508() {
        field1173 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method111(Component arg0) throws Exception {
        field1173.method977(class152.field2211, (byte) 106, arg0, class50.field571);
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "()V")
    public final void method108() {
        field1173.method974(-108, this.field1172);
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "()V")
    public final void method109() {
        field1173.method973(this.field1172, true);
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "()V")
    public final void method110() {
        field1173.method975(this.field1172, super.field1813);
    }
}
