import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class195 extends class62 {

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
    private int field3529;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "Lih;")
    private static class261 field3528;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()V")
    public final void method424() {
        field3528.method1769(true, this.field3529);
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "()V")
    public final void method439() {
        field3528.method1768(this.field3529, 88);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method436(Component arg0) throws Exception {
        field3528.method1767(arg0, 86, class12.field187, class255.field4454);
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "()I")
    public final int method442() {
        return field3528.method1766(this.field3529, true);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public final void method425(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3528.method1764(this.field3529, arg0, -25321);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
    public final void method422() {
        field3528.method1765(this.field3529, super.field1046);
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "()V")
    public static void method1414() {
        field3528 = null;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lpc;I)V")
    public class195(class166 arg0, int arg1) {
        field3528 = arg0.method1246(-43);
        this.field3529 = arg1;
    }
}
