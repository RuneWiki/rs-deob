import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public abstract class class154 extends class70 {

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "Z")
    public volatile boolean field2626 = true;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public int field2628;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "Lmh;")
    public class154 field2625;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "Lwn;")
    public class32 field2627;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([III)V", line = 8)
    public final void method1099(int[] arg0, int arg1, int arg2) {
        if (this.field2626) {
            this.method827(arg0, arg1, arg2);
        } else {
            this.method828(arg2);
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "()I", line = 21)
    public int method1100() {
        return 255;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "()Lmh;")
    public abstract class154 method829();

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V")
    public abstract void method828(int arg0);

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "()I")
    public abstract int method820();

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "([III)V")
    public abstract void method827(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "()Lmh;")
    public abstract class154 method825();
}
