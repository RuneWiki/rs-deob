import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class418 extends class428 {

    @OriginalMember(owner = "client!kq", name = "I", descriptor = "I")
    private int field5748;

    @OriginalMember(owner = "client!kq", name = "H", descriptor = "Lcq;")
    private static class325 field5747;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V")
    public final void method2409(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field5747.method1877(arg0, this.field5748, (byte) -125);
        }
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "()I")
    public final int method2410() {
        return field5747.method1875(this.field5748, (byte) -102);
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "()V")
    public final void method2411() {
        field5747.method1873(this.field5748, (byte) 39);
    }

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "()V")
    public static void method2412() {
        field5747 = null;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "()V")
    public final void method2413() {
        field5747.method1876(-123, this.field5748);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "()V")
    public final void method2414() {
        field5747.method1878(this.field5748, super.field5858);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method2415(Component arg0) throws Exception {
        field5747.method1874(class296.field3877, class202.field2798, arg0, 113);
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Ljs;I)V")
    public class418(class216 arg0, int arg1) {
        field5747 = arg0.method1374(false);
        this.field5748 = arg1;
    }
}
