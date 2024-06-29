import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public abstract class class208 extends class61 {

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "Z")
    public volatile boolean field3646 = true;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public int field3644;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "Lck;")
    public class208 field3645;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "Lwc;")
    public class220 field3647;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "()I")
    public int method553() {
        return 255;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "()I")
    public abstract int method457();

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "()Lck;")
    public abstract class208 method437();

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([III)V")
    public final void method1452(int[] arg0, int arg1, int arg2) {
        if (this.field3646) {
            this.method441(arg0, arg1, arg2);
        } else {
            this.method464(arg2);
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
    public abstract void method464(int arg0);

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "()Lck;")
    public abstract class208 method454();

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "([III)V")
    public abstract void method441(int[] arg0, int arg1, int arg2);
}
