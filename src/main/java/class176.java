import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class176 extends class202 {

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "I")
    private int field3087;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "Lrl;")
    private static class162 field3086;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public final void method1176(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3086.method1097(8267, arg0, this.field3087);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()V")
    public final void method1177() {
        field3086.method1094(this.field3087, (byte) 106);
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "()V")
    public static void method1178() {
        field3086 = null;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "()V")
    public final void method1179() {
        field3086.method1098(this.field3087, super.field3518);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "()I")
    public final int method1180() {
        return field3086.method1099(this.field3087, -14241);
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "()V")
    public final void method1181() {
        field3086.method1096(74, this.field3087);
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Ljd;I)V")
    public class176(class87 arg0, int arg1) {
        field3086 = arg0.method588(true);
        this.field3087 = arg1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1182(Component arg0) throws Exception {
        field3086.method1095(arg0, class85.field1468, class225.field3905, (byte) 81);
    }
}
