import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 extends class18 {

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "Lic;")
    private static class59 field343;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()I")
    public final int method127() {
        return field343.method412(this.field342, (byte) 43);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public final void method128(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field343.method414(this.field342, (byte) 3, arg0);
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "()V")
    public final void method129() {
        field343.method410(-18613, this.field342);
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "()V")
    public final void method130() {
        field343.method411(this.field342, super.field370);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()V")
    public final void method131() {
        field343.method415(this.field342, -22194);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lve;I)V")
    public class16(class151 arg0, int arg1) {
        field343 = arg0.method1176(33);
        this.field342 = arg1;
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "()V")
    public static void method132() {
        field343 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method133(Component arg0) throws Exception {
        field343.method413(-30285, class7.field105, arg0, class140.field3224);
    }
}
