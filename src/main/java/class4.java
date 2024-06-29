import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class4 extends class354 {

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
    private int field50;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "Lle;")
    private static class278 field51;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V", line = 3)
    public final void method27(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field51.method1882(arg0, (byte) 64, this.field50);
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "()V", line = 9)
    public final void method28() {
        field51.method1878(125, this.field50);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 12)
    public final void method29(Component arg0) throws Exception {
        field51.method1880(class82.field1059, arg0, -21936, class85.field1091);
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "()V", line = 16)
    public static void method30() {
        field51 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "()I", line = 19)
    public final int method31() {
        return field51.method1879(this.field50, -857);
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lpm;I)V", line = 21)
    public class4(class69 arg0, int arg1) {
        field51 = arg0.method511((byte) 111);
        this.field50 = arg1;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "()V", line = 26)
    public final void method32() {
        field51.method1877(this.field50, -166);
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "()V", line = 30)
    public final void method33() {
        field51.method1881(this.field50, this.field5530);
    }
}
