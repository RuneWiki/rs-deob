import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class class266 extends class242 {

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "Z")
    public volatile boolean field4569 = true;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public int field4568;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "Lka;")
    public class190 field4570;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "Lvg;")
    public class266 field4567;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "([III)V", line = 7)
    public final void method1877(int[] arg0, int arg1, int arg2) {
        if (this.field4569) {
            this.method622(arg0, arg1, arg2);
        } else {
            this.method618(arg2);
        }
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "()I", line = 16)
    public int method1219() {
        return 255;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([III)V")
    public abstract void method622(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
    public abstract void method618(int arg0);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "()I")
    public abstract int method612();

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "()Lvg;")
    public abstract class266 method611();

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "()Lvg;")
    public abstract class266 method620();
}
