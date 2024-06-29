import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class415 extends class593 implements class438 {

    @OriginalMember(owner = "client!ta", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(La;Lc;II[I[I)V", line = 4)
    public class415(class326 arg0, class618 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method2507(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class124.method989(-122, this);
        }
    }

    @OriginalMember(owner = "client!ta", name = "NA", descriptor = "(Z)V")
    public final native void method810(boolean arg0);

    @OriginalMember(owner = "client!ta", name = "DA", descriptor = "(La;Lc;II[I[I)V")
    private final native void method2507(class326 arg0, class618 arg1, int arg2, int arg3, int[] arg4, int[] arg5);
}
