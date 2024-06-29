import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class67 extends class127 implements class240 {

    @OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!k", name = "MA", descriptor = "(IIII)V")
    public final native void method464(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!k", name = "t", descriptor = "(IIIIII)V")
    public final void method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!k", name = "ma", descriptor = "()I")
    public final native int method465();

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "(IILma;II)V")
    private final native void method466(int arg0, int arg1, class249 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "s", descriptor = "(IIIIIII)V")
    public final native void method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "T", descriptor = "()I")
    public final native int method467();

    @OriginalMember(owner = "client!k", name = "j", descriptor = "()I")
    public final native int method468();

    @OriginalMember(owner = "client!k", name = "JA", descriptor = "(IIIIIII)V")
    public final native void method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class371.method2212((byte) -72, this);
    }

    @OriginalMember(owner = "client!k", name = "la", descriptor = "()I")
    public final native int method470();

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILma;II)V")
    public final void method294(int arg0, int arg1, class249 arg2, int arg3, int arg4) {
        this.method466(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!k", name = "r", descriptor = "(IIIII)V")
    public final native void method299(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "EA", descriptor = "()V")
    public final native void method471();

    @OriginalMember(owner = "client!k", name = "ra", descriptor = "(Lqa;Lna;[I[BIIII)V")
    private final native void method472(class131 arg0, class253 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!k", name = "BA", descriptor = "(III)V")
    public final void method295(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!k", name = "S", descriptor = "(FFFFFFLma;II)V")
    private final native void method473(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class249 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lqa;Lna;[I[BIIII)V")
    public class67(class131 arg0, class253 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method472(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(FFFFFFLma;II)V")
    public final void method474(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class249 arg6, int arg7, int arg8) {
        this.method473(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(FFFFFFIII)V")
    public final native void method475(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);
}
