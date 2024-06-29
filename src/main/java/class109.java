import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class109 extends class31 implements class416 {

    @OriginalMember(owner = "client!g", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lc;Lk;II[I[I)V", line = 4)
    public class109(class125 arg0, class404 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method789(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!g", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2895(this, false);
        }
    }

    @OriginalMember(owner = "client!g", name = "na", descriptor = "(Lc;Lk;II[I[I)V")
    private final native void method789(class125 arg0, class404 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!g", name = "pa", descriptor = "()V")
    public final native void method382();
}
