import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class144 extends class127 implements class240 {

    @OriginalMember(owner = "client!ia", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ia", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() {
        class371.method2212((byte) -72, this);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(FFFFFFLma;II)V", line = 17)
    public final void method474(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class249 arg6, int arg7, int arg8) {
        this.method1042(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ia", name = "BA", descriptor = "(III)V", line = 26)
    public final void method295(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lqa;Lna;[IIIII)V", line = 33)
    public class144(class131 arg0, class253 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1044(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILma;II)V", line = 38)
    public final void method294(int arg0, int arg1, class249 arg2, int arg3, int arg4) {
        this.method1041(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lqa;Lna;IIII)V", line = 40)
    public class144(class131 arg0, class253 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1043(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ia", name = "EA", descriptor = "()V")
    public final native void method471();

    @OriginalMember(owner = "client!ia", name = "WA", descriptor = "(IILma;II)V")
    private final native void method1041(int arg0, int arg1, class249 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "()I")
    public final native int method468();

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(FFFFFFIII)V")
    public final native void method475(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ia", name = "MA", descriptor = "(IIII)V")
    public final native void method464(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ia", name = "ma", descriptor = "()I")
    public final native int method465();

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "(IIIIII)V")
    public final native void method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "(FFFFFFLma;II)V")
    private final native void method1042(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class249 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "(IIIII)V")
    public final native void method299(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "(Lqa;Lna;IIII)V")
    private final native void method1043(class131 arg0, class253 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ia", name = "la", descriptor = "()I")
    public final native int method470();

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "()I")
    public final native int method467();

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "(IIIIIII)V")
    public final native void method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ia", name = "JA", descriptor = "(IIIIIII)V")
    public final native void method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "(Lqa;Lna;[IIIII)V")
    private final native void method1044(class131 arg0, class253 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);
}
