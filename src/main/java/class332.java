import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class332 extends class386 {

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
    private int field4873;

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "Ltb;")
    private static class365 field4872;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "()V", line = 3)
    public static void method2005() {
        field4872 = null;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "()V", line = 7)
    public final void method2006() {
        field4872.method2139(this.field4873, super.field5414);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "()I", line = 10)
    public final int method2007() {
        return field4872.method2136(65535, this.field4873);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 13)
    public final void method2008(Component arg0) throws Exception {
        field4872.method2134(class29.field359, 2, arg0, class581.field8101);
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "()V", line = 16)
    public final void method2009() {
        field4872.method2138(this.field4873, false);
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "()V", line = 19)
    public final void method2010() {
        field4872.method2137(0, this.field4873);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 23)
    public final void method2011(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4872.method2135((byte) 126, this.field4873, arg0);
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Ltt;I)V", line = 28)
    public class332(class79 arg0, int arg1) {
        field4872 = (class365) arg0.method626((byte) -7);
        this.field4873 = arg1;
    }
}
