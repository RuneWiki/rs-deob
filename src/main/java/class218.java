import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class218 extends class105 {

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    private int field3092;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "Lkc;")
    private static class448 field3093;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "()V", line = 3)
    public static void method1495() {
        field3093 = null;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "()I", line = 7)
    public final int method742() {
        return field3093.method2757((byte) 76, this.field3092);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 10)
    public final void method747(Component arg0) throws Exception {
        field3093.method2753(class298.field4331, (byte) -64, arg0, class263.field3896);
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lgt;I)V", line = 13)
    public class218(class341 arg0, int arg1) {
        field3093 = arg0.method2197(120);
        this.field3092 = arg1;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "()V", line = 18)
    public final void method741() {
        field3093.method2756(this.field3092, (byte) -86);
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V", line = 21)
    public final void method753(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3093.method2755(this.field3092, (byte) 112, arg0);
        }
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "()V", line = 27)
    public final void method749() {
        field3093.method2754(this.field3092, super.field1410);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "()V", line = 30)
    public final void method740() {
        field3093.method2758((byte) -101, this.field3092);
    }
}
