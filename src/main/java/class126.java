import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public abstract class class126 extends class60 {

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "Z")
    public volatile boolean field2253 = true;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public int field2252;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "Lib;")
    public class126 field2250;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "Lsa;")
    public class157 field2251;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()I")
    public abstract int method486();

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "()Lib;")
    public abstract class126 method475();

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([III)V")
    public final void method778(int[] arg0, int arg1, int arg2) {
        if (this.field2253) {
            this.method485(arg0, arg1, arg2);
        } else {
            this.method478(arg2);
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "([III)V")
    public abstract void method485(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public abstract void method478(int arg0);

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "()I")
    public int method779() {
        return 255;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "()Lib;")
    public abstract class126 method477();
}
