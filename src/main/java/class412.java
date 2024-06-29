import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class412 extends class202 {

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
    private int field6076;

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "Lci;")
    private static class387 field6075;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()I", line = 3)
    public final int method838() {
        return field6075.method2486((byte) 72, this.field6076);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 6)
    public final void method837(Component arg0) throws Exception {
        field6075.method2489(arg0, class9.field153, class407.field6043, 11935);
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "()V", line = 9)
    public static void method2636() {
        field6075 = null;
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V", line = 12)
    public final void method836(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field6075.method2488(-32134, arg0, this.field6076);
        }
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "()V", line = 18)
    public final void method839() {
        field6075.method2491(91, this.field6076);
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "()V", line = 22)
    public final void method835() {
        field6075.method2487(this.field6076, 6833);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "()V", line = 26)
    public final void method840() {
        field6075.method2490(this.field6076, super.field2718);
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lwd;I)V", line = 28)
    public class412(class36 arg0, int arg1) {
        field6075 = arg0.method250((byte) -117);
        this.field6076 = arg1;
    }
}
