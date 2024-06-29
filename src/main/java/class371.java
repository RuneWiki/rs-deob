import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class371 extends class363 implements class28 {

    @OriginalMember(owner = "client!q", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(IIIIII)V", line = 7)
    public final void method1213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(FFFFFFLta;II)V", line = 10)
    public final void method401(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class340 arg6, int arg7, int arg8) {
        this.method2390(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lw;Lg;[I[BIIII)V", line = 14)
    public class371(class69 arg0, class427 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2391(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(III)V", line = 18)
    public final void method1214(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V", line = 26)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class45.method300(this, 0);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILta;II)V", line = 32)
    public final void method397(int arg0, int arg1, class340 arg2, int arg3, int arg4) {
        this.method2389(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(IILta;II)V")
    private final native void method2389(int arg0, int arg1, class340 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "(FFFFFFLta;II)V")
    private final native void method2390(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class340 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!q", name = "ha", descriptor = "(IIII)V")
    public final native void method400(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!q", name = "H", descriptor = "(FFFFFFIII)V")
    public final native void method402(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!q", name = "DA", descriptor = "(Lw;Lg;[I[BIIII)V")
    private final native void method2391(class69 arg0, class427 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!q", name = "RA", descriptor = "()I")
    public final native int method394();

    @OriginalMember(owner = "client!q", name = "YA", descriptor = "()I")
    public final native int method398();

    @OriginalMember(owner = "client!q", name = "W", descriptor = "(IIIII)V")
    public final native void method392(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "()I")
    public final native int method396();

    @OriginalMember(owner = "client!q", name = "ZA", descriptor = "()I")
    public final native int method399();

    @OriginalMember(owner = "client!q", name = "p", descriptor = "()V")
    public final native void method164();

    @OriginalMember(owner = "client!q", name = "la", descriptor = "(IIIIIII)V")
    public final native void method389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!q", name = "ya", descriptor = "(IIIIIII)V")
    public final native void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
