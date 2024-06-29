import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class123 extends class460 {

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
    private int field1848;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "Lik;")
    private static class538 field1849;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method911(Component arg0) throws Exception {
        field1849.method3165((byte) -64, class193.field2961, arg0, class162.field2453);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "()V")
    public final void method912() {
        field1849.method3163((byte) 48, this.field1848);
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "()I")
    public final int method913() {
        return field1849.method3164(103, this.field1848);
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "()V")
    public static void method914() {
        field1849 = null;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lgt;I)V")
    public class123(class66 arg0, int arg1) {
        field1849 = arg0.method451(false);
        this.field1848 = arg1;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "()V")
    public final void method915() {
        field1849.method3168(this.field1848, super.field6823);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public final void method916(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1849.method3167(115, arg0, this.field1848);
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "()V")
    public final void method917() {
        field1849.method3166(this.field1848, (byte) 48);
    }
}
