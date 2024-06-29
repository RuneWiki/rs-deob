import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class51 extends class20 {

    @OriginalMember(owner = "client!de", name = "N", descriptor = "I")
    private int field829;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "Lqd;")
    private static class35 field828;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "()V")
    public final void method147() {
        field828.method216(this.field829, super.field312);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "()I")
    public final int method139() {
        return field828.method220(24631, this.field829);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public final void method134(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field828.method219(this.field829, -125, arg0);
        }
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "()V")
    public static void method316() {
        field828 = null;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "()V")
    public final void method145() {
        field828.method218(this.field829, 49);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method142(Component arg0) throws Exception {
        field828.method217(class131.field2349, arg0, 91, class271.field4813);
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Luc;I)V")
    public class51(class160 arg0, int arg1) {
        field828 = arg0.method1158(false);
        this.field829 = arg1;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()V")
    public final void method137() {
        field828.method221((byte) -114, this.field829);
    }
}
