import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class58 extends class24 {

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "Lqf;")
    private static class117 field1400;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    public final void method162(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1400.method936(this.field1401, -32169, arg0);
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "()V")
    public final void method150() {
        field1400.method935(20524, this.field1401);
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "()V")
    public static void method419() {
        field1400 = null;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "()V")
    public final void method163() {
        field1400.method933(this.field1401, super.field580);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()V")
    public final void method148() {
        field1400.method931(-128, this.field1401);
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "()I")
    public final int method159() {
        return field1400.method934(this.field1401, (byte) 98);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method164(Component arg0) throws Exception {
        field1400.method932(arg0, class25.field632, class25.field626, -26551);
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lje;I)V")
    public class58(class67 arg0, int arg1) {
        field1400 = arg0.method542(9);
        this.field1401 = arg1;
    }
}
