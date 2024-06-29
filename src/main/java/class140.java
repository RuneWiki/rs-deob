import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class140 extends class10 implements class105 {

    @OriginalMember(owner = "client!sa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lqa;Lna;II[I[I)V", line = 3)
    public class140(class166 arg0, class35 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method1011(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!sa", name = "finalize", descriptor = "()V", line = 8)
    protected final void finalize() {
        class438.method2701(-23, this);
    }

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "(Lqa;Lna;II[I[I)V")
    private final native void method1011(class166 arg0, class35 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!sa", name = "EA", descriptor = "()V")
    public final native void method119();
}
