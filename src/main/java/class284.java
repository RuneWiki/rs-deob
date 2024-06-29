import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class284 extends class248 {

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
    private int field4999;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "Lkb;")
    private static class28 field4998;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "()V")
    public static void method1869() {
        field4998 = null;
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "()V")
    public final void method1650() {
        field4998.method192(this.field4999, super.field4464);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()I")
    public final int method1644() {
        return field4998.method193(this.field4999, -128);
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    public final void method1651(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4998.method189(9185, arg0, this.field4999);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "()V")
    public final void method1645() {
        field4998.method191((byte) 5, this.field4999);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1641(Component arg0) throws Exception {
        field4998.method188(class190.field3494, 7286, class83.field1509, arg0);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lq;I)V")
    public class284(class81 arg0, int arg1) {
        field4998 = arg0.method466((byte) -97);
        this.field4999 = arg1;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "()V")
    public final void method1648() {
        field4998.method190(-123, this.field4999);
    }
}
