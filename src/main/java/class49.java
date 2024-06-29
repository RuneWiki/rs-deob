import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class49 extends class144 {

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
    private int field758;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "Lgl;")
    private static class258 field759;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "()V", line = 3)
    public static void method309() {
        field759 = null;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "()V", line = 6)
    public final void method310() {
        field759.method1751(this.field758, 62);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 9)
    public final void method311(Component arg0) throws Exception {
        field759.method1749(class102.field1633, arg0, -126, class142.field2572);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "()V", line = 12)
    public final void method312() {
        field759.method1748(this.field758, this.field2629);
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "()V", line = 15)
    public final void method313() {
        field759.method1747(this.field758, (byte) -99);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "()I", line = 20)
    public final int method314() {
        return field759.method1750(this.field758, (byte) -117);
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lvh;I)V", line = 22)
    public class49(class147 arg0, int arg1) {
        field759 = arg0.method1097(0);
        this.field758 = arg1;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V", line = 27)
    public final void method315(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field759.method1746(arg0, this.field758, (byte) -43);
    }
}
