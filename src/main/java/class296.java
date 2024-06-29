import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class296 extends class24 implements class350 {

    @OriginalMember(owner = "client!q", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(FFFFFFLta;II)V", line = 12)
    public final void method151(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class144 arg6, int arg7, int arg8) {
        this.method1774(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILta;II)V", line = 15)
    public final void method7(int arg0, int arg1, class144 arg2, int arg3, int arg4) {
        this.method1776(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(IIIIII)V", line = 20)
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V", line = 26)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class269.method1636(this, true);
        }
    }

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(III)V", line = 31)
    public final void method9(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lw;Lg;[I[BIIII)V", line = 34)
    public class296(class197 arg0, class108 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1775(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "(FFFFFFLta;II)V")
    private final native void method1774(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class144 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!q", name = "DA", descriptor = "(Lw;Lg;[I[BIIII)V")
    private final native void method1775(class197 arg0, class108 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!q", name = "RA", descriptor = "()I")
    public final native int method155();

    @OriginalMember(owner = "client!q", name = "YA", descriptor = "()I")
    public final native int method150();

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "()I")
    public final native int method153();

    @OriginalMember(owner = "client!q", name = "ha", descriptor = "(IIII)V")
    public final native void method147(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!q", name = "ZA", descriptor = "()I")
    public final native int method146();

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(IILta;II)V")
    private final native void method1776(int arg0, int arg1, class144 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!q", name = "la", descriptor = "(IIIIIII)V")
    public final native void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!q", name = "H", descriptor = "(FFFFFFIII)V")
    public final native void method143(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!q", name = "p", descriptor = "()V")
    public final native void method426();

    @OriginalMember(owner = "client!q", name = "W", descriptor = "(IIIII)V")
    public final native void method12(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!q", name = "ya", descriptor = "(IIIIIII)V")
    public final native void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
