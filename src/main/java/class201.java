import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class201 extends class24 implements class350 {

    @OriginalMember(owner = "client!ca", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ca", name = "ya", descriptor = "(IIIIIII)V")
    public final native void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "XA", descriptor = "(IIIIII)V")
    public final native void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "()V")
    public final native void method426();

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILta;II)V")
    public final void method7(int arg0, int arg1, class144 arg2, int arg3, int arg4) {
        this.method1294(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ca", name = "ha", descriptor = "(IIII)V")
    public final native void method147(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class269.method1636(this, true);
        }
    }

    @OriginalMember(owner = "client!ca", name = "ZA", descriptor = "()I")
    public final native int method146();

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(Lw;Lg;[IIIII)V")
    private final native void method1292(class197 arg0, class108 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "(FFFFFFIII)V")
    public final native void method143(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ca", name = "YA", descriptor = "()I")
    public final native int method150();

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lw;Lg;[IIIII)V")
    public class201(class197 arg0, class108 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1292(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ca", name = "ma", descriptor = "(Lw;Lg;IIII)V")
    private final native void method1293(class197 arg0, class108 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ca", name = "RA", descriptor = "()I")
    public final native int method155();

    @OriginalMember(owner = "client!ca", name = "W", descriptor = "(IIIII)V")
    public final native void method12(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "()I")
    public final native int method153();

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(FFFFFFLta;II)V")
    public final void method151(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class144 arg6, int arg7, int arg8) {
        this.method1295(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lw;Lg;IIII)V")
    public class201(class197 arg0, class108 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1293(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ca", name = "oa", descriptor = "(III)V")
    public final void method9(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ca", name = "pa", descriptor = "(IILta;II)V")
    private final native void method1294(int arg0, int arg1, class144 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ca", name = "la", descriptor = "(IIIIIII)V")
    public final native void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "LA", descriptor = "(FFFFFFLta;II)V")
    private final native void method1295(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class144 arg6, int arg7, int arg8);
}
