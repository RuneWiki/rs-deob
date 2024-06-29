import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class379 extends class400 {

    @OriginalMember(owner = "client!md", name = "K", descriptor = "I")
    private int field5769;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "Laf;")
    private static class298 field5768;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "()V")
    public final void method2318() {
        field5768.method1892(-31125, this.field5769);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "()V")
    public final void method2319() {
        field5768.method1889(this.field5769, super.field5992);
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
    public final void method2320(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field5768.method1890(arg0, 103, this.field5769);
        }
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "()V")
    public static void method2321() {
        field5768 = null;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "()I")
    public final int method2322() {
        return field5768.method1891(6777, this.field5769);
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "()V")
    public final void method2323() {
        field5768.method1888((byte) 106, this.field5769);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method2324(Component arg0) throws Exception {
        field5768.method1887(class323.field4619, -29557, class366.field5600, arg0);
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lji;I)V")
    public class379(class432 arg0, int arg1) {
        field5768 = arg0.method2582(6);
        this.field5769 = arg1;
    }
}
