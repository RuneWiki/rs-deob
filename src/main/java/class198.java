import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class198 extends class381 implements class276 {

    @OriginalMember(owner = "client!ca", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lh;Lba;II[I[I)V")
    public class198(class468 arg0, class262 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method1361(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ca", name = "ya", descriptor = "()V")
    public final native void method75();

    @OriginalMember(owner = "client!ca", name = "FA", descriptor = "(Lh;Lba;II[I[I)V")
    private final native void method1361(class468 arg0, class262 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class284.method1787(-24204, this);
    }
}
