import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class174 extends class51 {

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
    private int field2926;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "Lqi;")
    private static class208 field2925;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()V")
    public final void method343() {
        field2925.method1432(2, this.field2926);
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "()V")
    public final void method344() {
        field2925.method1434(this.field2926, super.field937);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method339(Component arg0) throws Exception {
        field2925.method1431((byte) -64, class75.field1284, arg0, class85.field1399);
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "()V")
    public static void method1168() {
        field2925 = null;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "()V")
    public final void method345() {
        field2925.method1433(-126, this.field2926);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()I")
    public final int method338() {
        return field2925.method1430(-12525, this.field2926);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public final void method342(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2925.method1435(this.field2926, -28259, arg0);
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lt;I)V")
    public class174(class247 arg0, int arg1) {
        field2925 = arg0.method1722(1185130032);
        this.field2926 = arg1;
    }
}
