import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class306 extends class330 {

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    private int field4779;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "Lpb;")
    private static class301 field4778;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 3)
    public final void method1999(Component arg0) throws Exception {
        field4778.method2072(27497, class260.field4009, arg0, class325.field5020);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()V", line = 6)
    public final void method2000() {
        field4778.method2073(this.field4779, this.field5077);
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "()V", line = 9)
    public static void method2101() {
        field4778 = null;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "()I", line = 12)
    public final int method1997() {
        return field4778.method2074(this.field4779, false);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 15)
    public final void method2001(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field4778.method2071(arg0, this.field4779, (byte) -94);
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "()V", line = 22)
    public final void method1998() {
        field4778.method2069(this.field4779, -10519);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()V", line = 25)
    public final void method1996() {
        field4778.method2070(1844, this.field4779);
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lvl;I)V", line = 28)
    public class306(class6 arg0, int arg1) {
        field4778 = arg0.method59((byte) -33);
        this.field4779 = arg1;
    }
}
