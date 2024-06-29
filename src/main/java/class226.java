import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class226 extends class113 implements class241 {

    @OriginalMember(owner = "client!ca", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ca", name = "FA", descriptor = "(Lh;Lba;II[I[I)V")
    private final native void method1434(class373 arg0, class498 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!ca", name = "ya", descriptor = "()V")
    public final native void method373();

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class313.method1863(this, -68);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lh;Lba;II[I[I)V")
    public class226(class373 arg0, class498 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method1434(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
