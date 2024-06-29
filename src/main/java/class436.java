import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class436 extends class422 {

    @OriginalMember(owner = "client!t", name = "L", descriptor = "I")
    private int field6061;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "Lqg;")
    private static class296 field6062;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
    public final void method1874() {
        field6062.method1835(-29448, this.field6061);
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "()V")
    public static void method2569() {
        field6062 = null;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "()I")
    public final int method1877() {
        return field6062.method1833(this.field6061, 14511);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lmj;I)V")
    public class436(class430 arg0, int arg1) {
        field6062 = arg0.method2545(19950);
        this.field6061 = arg1;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public final void method1873(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field6062.method1832((byte) -104, this.field6061, arg0);
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()V")
    public final void method1875() {
        field6062.method1834(this.field6061, -4800);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()V")
    public final void method1876() {
        field6062.method1837(this.field6061, super.field5884);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1878(Component arg0) throws Exception {
        field6062.method1836((byte) -76, class410.field5752, arg0, class31.field409);
    }
}
