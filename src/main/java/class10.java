import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class10 extends class250 {

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
    private int field190;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "Lui;")
    private static class105 field191;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "()I")
    public final int method80() {
        return field191.method706(-18604, this.field190);
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lej;I)V")
    public class10(class142 arg0, int arg1) {
        field191 = arg0.method906(3);
        this.field190 = arg1;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public final void method81(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field191.method707(arg0, this.field190, -94);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "()V")
    public final void method82() {
        field191.method708(this.field190, 14769);
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "()V")
    public final void method83() {
        field191.method705(this.field190, -28869);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method84(Component arg0) throws Exception {
        field191.method703(class145.field2372, -121, arg0, class207.field3554);
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "()V")
    public static void method85() {
        field191 = null;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "()V")
    public final void method86() {
        field191.method704(this.field190, super.field4349);
    }
}
