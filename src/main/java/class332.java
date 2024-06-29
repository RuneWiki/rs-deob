import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class332 extends class386 {

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
    private int field4873;

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "Ltb;")
    private static class365 field4872;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "()V")
    public static void method2005() {
        field4872 = null;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "()V")
    public final void method2006() {
        field4872.method2139(this.field4873, super.field5414);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "()I")
    public final int method2007() {
        return field4872.method2136(65535, this.field4873);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method2008(Component arg0) throws Exception {
        field4872.method2134(class29.field359, 2, arg0, class581.field8101);
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "()V")
    public final void method2009() {
        field4872.method2138(this.field4873, false);
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "()V")
    public final void method2010() {
        field4872.method2137(0, this.field4873);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public final void method2011(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4872.method2135((byte) 126, this.field4873, arg0);
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Ltt;I)V")
    public class332(class79 arg0, int arg1) {
        field4872 = (class365) arg0.method626((byte) -7);
        this.field4873 = arg1;
    }
}
