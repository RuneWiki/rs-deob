import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class74 extends class20 {

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "Lpf;")
    private static class164 field1462;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "()V")
    public final void method197() {
        field1462.method1028(false, this.field1461);
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Ld;I)V")
    public class74(class33 arg0, int arg1) {
        field1462 = arg0.method280(1);
        this.field1461 = arg1;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "()V")
    public final void method189() {
        field1462.method1032(this.field1461, super.field474);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "()V")
    public final void method196() {
        field1462.method1031(this.field1461, 99);
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "()V")
    public static void method503() {
        field1462 = null;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
    public final void method194(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1462.method1029(this.field1461, 4745, arg0);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method193(Component arg0) throws Exception {
        field1462.method1033(arg0, class106.field1956, class168.field3201, 10909);
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "()I")
    public final int method199() {
        return field1462.method1030(-24067, this.field1461);
    }
}
