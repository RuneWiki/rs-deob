import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class201 extends class79 {

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    private int field3894;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "Ltc;")
    private static class192 field3893;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "()V")
    public static void method1339() {
        field3893 = null;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "()I")
    public final int method490() {
        return field3893.method1278((byte) 86, this.field3894);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method479(Component arg0) throws Exception {
        field3893.method1279(class52.field1072, arg0, -61, class125.field2344);
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "()V")
    public final void method496() {
        field3893.method1282(this.field3894, -20332);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "()V")
    public final void method488() {
        field3893.method1277(this.field3894, 102);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public final void method493(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3893.method1281(arg0, this.field3894, -14412);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()V")
    public final void method482() {
        field3893.method1280(this.field3894, super.field1542);
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lna;I)V")
    public class201(class130 arg0, int arg1) {
        field3893 = arg0.method829(-110);
        this.field3894 = arg1;
    }
}
