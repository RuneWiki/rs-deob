import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class162 extends class73 {

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "I")
    private int field3265;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "Lsb;")
    private static class165 field3264;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "()V")
    public final void method454() {
        field3264.method1028(this.field3265, -119);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method452(Component arg0) throws Exception {
        field3264.method1027(arg0, 97, class88.field1708, class38.field726);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()V")
    public final void method447() {
        field3264.method1029(this.field3265, -8621);
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
    public final void method457(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3264.method1026(arg0, 122, this.field3265);
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "()V")
    public final void method453() {
        field3264.method1024(this.field3265, super.field1419);
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "()V")
    public static void method1017() {
        field3264 = null;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "()I")
    public final int method451() {
        return field3264.method1025(-122, this.field3265);
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lrf;I)V")
    public class162(class160 arg0, int arg1) {
        field3264 = arg0.method1013(0);
        this.field3265 = arg1;
    }
}
