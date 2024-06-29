import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class187 extends class47 {

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    private int field3674;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "Lda;")
    private static class31 field3673;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "()V")
    public final void method125() {
        field3673.method184(this.field3674, super.field748);
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "()V")
    public final void method122() {
        field3673.method181(false, this.field3674);
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "()V")
    public final void method120() {
        field3673.method183((byte) -85, this.field3674);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "()I")
    public final int method123() {
        return field3673.method182(this.field3674, 102);
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "()V")
    public static void method1219() {
        field3673 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method124(Component arg0) throws Exception {
        field3673.method180((byte) -90, arg0, class170.field3385, class3.field46);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public final void method121(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3673.method179(arg0, (byte) -62, this.field3674);
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lqd;I)V")
    public class187(class149 arg0, int arg1) {
        field3673 = arg0.method908(-1558882160);
        this.field3674 = arg1;
    }
}
