import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class88 extends class74 {

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "Llh;")
    private static class191 field1465;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()I")
    public final int method428() {
        return field1465.method1341((byte) -126, this.field1466);
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public final void method432(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1465.method1340(this.field1466, arg0, false);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method433(Component arg0) throws Exception {
        field1465.method1337(88, arg0, class22.field380, class139.field2490);
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()V")
    public final void method431() {
        field1465.method1336(30309, this.field1466);
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
    public static void method628() {
        field1465 = null;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
    public final void method430() {
        field1465.method1339(this.field1466, super.field1281);
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lgd;I)V")
    public class88(class123 arg0, int arg1) {
        field1465 = arg0.method941((byte) 76);
        this.field1466 = arg1;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()V")
    public final void method429() {
        field1465.method1338(this.field1466, 100);
    }
}
