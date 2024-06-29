import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class291 extends class127 {

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
    private int field4582;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "Ltc;")
    private static class183 field4581;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "()I")
    public final int method14() {
        return field4581.method1190(1513, this.field4582);
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "()V")
    public static void method1953() {
        field4581 = null;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V")
    public final void method12(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4581.method1187(arg0, this.field4582, (byte) 24);
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "()V")
    public final void method9() {
        field4581.method1186((byte) 110, this.field4582);
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Ld;I)V")
    public class291(class244 arg0, int arg1) {
        field4581 = arg0.method1646(-82);
        this.field4582 = arg1;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method13(Component arg0) throws Exception {
        field4581.method1191(class60.field845, 5653, arg0, class286.field4477);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "()V")
    public final void method11() {
        field4581.method1189(this.field4582, super.field1788);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "()V")
    public final void method10() {
        field4581.method1188((byte) -27, this.field4582);
    }
}
