import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class201 extends class233 {

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "I")
    private int field2756;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "Luh;")
    private static class92 field2755;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "()V", line = 3)
    public final void method1216() {
        field2755.method633(this.field2756, -95);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 6)
    public final void method1217(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2755.method630(arg0, this.field2756, (byte) 115);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 12)
    public final void method1215(Component arg0) throws Exception {
        field2755.method631(class31.field488, class327.field4473, false, arg0);
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "()I", line = 15)
    public final int method1219() {
        return field2755.method632(true, this.field2756);
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lkq;I)V", line = 19)
    public class201(class351 arg0, int arg1) {
        field2755 = arg0.method2237(-87);
        this.field2756 = arg1;
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "()V", line = 24)
    public final void method1220() {
        field2755.method629(this.field2756, super.field3165);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "()V", line = 27)
    public final void method1218() {
        field2755.method634((byte) 7, this.field2756);
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "()V", line = 30)
    public static void method1331() {
        field2755 = null;
    }
}
