import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class137 extends class10 implements class103 {

    @OriginalMember(owner = "client!sa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!sa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class260.method1672((byte) 50, this);
    }

    @OriginalMember(owner = "client!sa", name = "EA", descriptor = "()V")
    public final native void method101();

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "(Lqa;Lna;II[I[I)V")
    private final native void method1037(class163 arg0, class35 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lqa;Lna;II[I[I)V")
    public class137(class163 arg0, class35 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method1037(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
