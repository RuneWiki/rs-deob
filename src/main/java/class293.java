import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class293 extends class13 {

    @OriginalMember(owner = "client!h", name = "N", descriptor = "I")
    private int field4794;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "Lsb;")
    private static class245 field4793;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()V")
    public final void method107() {
        field4793.method1665(-18216, this.field4794);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()V")
    public final void method106() {
        field4793.method1667((byte) 123, this.field4794);
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "()V")
    public final void method116() {
        field4793.method1663(this.field4794, super.field257);
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "()V")
    public static void method2018() {
        field4793 = null;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
    public final void method119(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4793.method1666(this.field4794, arg0, (byte) -83);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method110(Component arg0) throws Exception {
        field4793.method1662(class296.field4841, arg0, class253.field4144, (byte) -56);
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Ltl;I)V")
    public class293(class69 arg0, int arg1) {
        field4793 = arg0.method480(-79);
        this.field4794 = arg1;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "()I")
    public final int method123() {
        return field4793.method1664(this.field4794, -9);
    }
}
