import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class class224 extends class12 {

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "Z")
    public volatile boolean field3993 = true;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public int field3991;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "Ldi;")
    public class128 field3990;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "Lvg;")
    public class224 field3992;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "()I")
    public int method1200() {
        return 255;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "()I")
    public abstract int method174();

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([III)V")
    public final void method1520(int[] arg0, int arg1, int arg2) {
        if (this.field3993) {
            this.method192(arg0, arg1, arg2);
        } else {
            this.method208(arg2);
        }
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)V")
    public abstract void method208(int arg0);

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "()Lvg;")
    public abstract class224 method182();

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "()Lvg;")
    public abstract class224 method211();

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "([III)V")
    public abstract void method192(int[] arg0, int arg1, int arg2);
}
