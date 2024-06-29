import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public abstract class class148 extends class137 {

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "Z")
    public volatile boolean field2798 = true;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public int field2800;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "Lge;")
    public class148 field2799;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "Lig;")
    public class53 field2797;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()I")
    public abstract int method208();

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "()I")
    public int method236() {
        return 255;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "()Lge;")
    public abstract class148 method229();

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([III)V")
    public abstract void method218(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
    public abstract void method202(int arg0);

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "()Lge;")
    public abstract class148 method212();

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "([III)V")
    public final void method1108(int[] arg0, int arg1, int arg2) {
        if (this.field2798) {
            this.method218(arg0, arg1, arg2);
        } else {
            this.method202(arg2);
        }
    }
}
