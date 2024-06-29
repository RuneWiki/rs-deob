import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class108 extends class30 implements class415 {

    @OriginalMember(owner = "client!g", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!g", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class93.method626(this, 0);
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lc;Lk;II[I[I)V", line = 10)
    public class108(class124 arg0, class403 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method687(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!g", name = "pa", descriptor = "()V")
    public final native void method304();

    @OriginalMember(owner = "client!g", name = "na", descriptor = "(Lc;Lk;II[I[I)V")
    private final native void method687(class124 arg0, class403 arg1, int arg2, int arg3, int[] arg4, int[] arg5);
}
