import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class411 extends class24 implements class350 {

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V", line = 12)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class269.method1636(this, true);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILta;II)V", line = 22)
    public final void method7(int arg0, int arg1, class144 arg2, int arg3, int arg4) {
        this.method2509(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lw;Lg;[IIIII)V", line = 30)
    public class411(class197 arg0, class108 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2510(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(FFFFFFLta;II)V", line = 35)
    public final void method151(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class144 arg6, int arg7, int arg8) {
        this.method2508(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lw;Lg;IIII)V", line = 37)
    public class411(class197 arg0, class108 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2511(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!v", name = "HA", descriptor = "(FFFFFFLta;II)V")
    private final native void method2508(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class144 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
    public final native void method9(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "()I")
    public final native int method153();

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(IILta;II)V")
    private final native void method2509(int arg0, int arg1, class144 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!v", name = "ya", descriptor = "(IIIIIII)V")
    public final native void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "ta", descriptor = "(Lw;Lg;[IIIII)V")
    private final native void method2510(class197 arg0, class108 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "XA", descriptor = "(IIIIII)V")
    public final native void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "p", descriptor = "()V")
    public final native void method426();

    @OriginalMember(owner = "client!v", name = "ZA", descriptor = "()I")
    public final native int method146();

    @OriginalMember(owner = "client!v", name = "H", descriptor = "(FFFFFFIII)V")
    public final native void method143(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
    public final native int method155();

    @OriginalMember(owner = "client!v", name = "la", descriptor = "(IIIIIII)V")
    public final native void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "W", descriptor = "(IIIII)V")
    public final native void method12(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!v", name = "ha", descriptor = "(IIII)V")
    public final native void method147(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "OA", descriptor = "(Lw;Lg;IIII)V")
    private final native void method2511(class197 arg0, class108 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "YA", descriptor = "()I")
    public final native int method150();
}
