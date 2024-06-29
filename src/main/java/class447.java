import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class447 extends class249 implements class240 {

    @OriginalMember(owner = "client!sa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lqa;Lna;II[I[I)V", line = 4)
    public class447(class131 arg0, class253 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method2620(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!sa", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() {
        class371.method2212((byte) -72, this);
    }

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "(Lqa;Lna;II[I[I)V")
    private final native void method2620(class131 arg0, class253 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!sa", name = "EA", descriptor = "()V")
    public final native void method471();
}
