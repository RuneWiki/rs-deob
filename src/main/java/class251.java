import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class251 extends class156 {

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "I")
    private int field4337;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "Lik;")
    private static class248 field4336;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "()V")
    public final void method1087() {
        field4336.method1695((byte) -1, this.field4337);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public final void method1072(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4336.method1698(arg0, 17581, this.field4337);
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()I")
    public final int method1081() {
        return field4336.method1700(this.field4337, (byte) 126);
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "()V")
    public static void method1706() {
        field4336 = null;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "()V")
    public final void method1084() {
        field4336.method1699(this.field4337, false);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1086(Component arg0) throws Exception {
        field4336.method1696(arg0, class268.field4571, (byte) 122, class255.field4372);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()V")
    public final void method1077() {
        field4336.method1697(this.field4337, super.field2772);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Laf;I)V")
    public class251(class67 arg0, int arg1) {
        field4336 = arg0.method545(27104);
        this.field4337 = arg1;
    }
}
