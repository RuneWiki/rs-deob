import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class375 extends class359 {

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    private int field5280;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "Lpu;")
    private static class394 field5281;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 3)
    public final void method1984(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field5281.method2259(this.field5280, arg0, true);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 9)
    public final void method1993(Component arg0) throws Exception {
        field5281.method2254(class12.field141, arg0, class149.field2109, -6262);
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "()V", line = 12)
    public final void method1990() {
        field5281.method2258(-8703, this.field5280);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "()V", line = 15)
    public final void method1988() {
        field5281.method2255(this.field5280, 117);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "()V", line = 19)
    public final void method1983() {
        field5281.method2256(this.field5280, super.field4913);
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lkj;I)V", line = 21)
    public class375(class397 arg0, int arg1) {
        field5281 = arg0.method2288((byte) -42);
        this.field5280 = arg1;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "()I", line = 27)
    public final int method1992() {
        return field5281.method2257((byte) 122, this.field5280);
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "()V", line = 30)
    public static void method2162() {
        field5281 = null;
    }
}
