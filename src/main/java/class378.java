import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class378 extends class507 {

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    private int field5424;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "Lmt;")
    private static class278 field5423;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "()V", line = 3)
    public final void method1568() {
        field5423.method1784(this.field5424, (byte) -72);
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()V", line = 6)
    public final void method1571() {
        field5423.method1787((byte) 43, this.field5424);
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "()V", line = 10)
    public final void method1570() {
        field5423.method1788(this.field5424, super.field7328);
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()I", line = 13)
    public final int method1569() {
        return field5423.method1786(2329, this.field5424);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 16)
    public final void method1572(Component arg0) throws Exception {
        field5423.method1785(arg0, class120.field1877, class385.field5498, (byte) 85);
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V", line = 19)
    public final void method1567(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field5423.method1789(-103, this.field5424, arg0);
        }
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "()V", line = 25)
    public static void method2303() {
        field5423 = null;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lul;I)V", line = 28)
    public class378(class411 arg0, int arg1) {
        field5423 = arg0.method2435(0);
        this.field5424 = arg1;
    }
}
