import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class464 extends class363 implements class28 {

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILta;II)V", line = 6)
    public final void method397(int arg0, int arg1, class340 arg2, int arg3, int arg4) {
        this.method2839(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V", line = 12)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class45.method300(this, 0);
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lw;Lg;[IIIII)V", line = 31)
    public class464(class69 arg0, class427 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2841(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(FFFFFFLta;II)V", line = 35)
    public final void method401(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class340 arg6, int arg7, int arg8) {
        this.method2840(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lw;Lg;IIII)V", line = 37)
    public class464(class69 arg0, class427 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2838(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!v", name = "ZA", descriptor = "()I")
    public final native int method399();

    @OriginalMember(owner = "client!v", name = "W", descriptor = "(IIIII)V")
    public final native void method392(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!v", name = "ha", descriptor = "(IIII)V")
    public final native void method400(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "XA", descriptor = "(IIIIII)V")
    public final native void method1213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
    public final native int method394();

    @OriginalMember(owner = "client!v", name = "p", descriptor = "()V")
    public final native void method164();

    @OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
    public final native void method1214(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "OA", descriptor = "(Lw;Lg;IIII)V")
    private final native void method2838(class69 arg0, class427 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(IILta;II)V")
    private final native void method2839(int arg0, int arg1, class340 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "()I")
    public final native int method396();

    @OriginalMember(owner = "client!v", name = "YA", descriptor = "()I")
    public final native int method398();

    @OriginalMember(owner = "client!v", name = "H", descriptor = "(FFFFFFIII)V")
    public final native void method402(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!v", name = "ya", descriptor = "(IIIIIII)V")
    public final native void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "HA", descriptor = "(FFFFFFLta;II)V")
    private final native void method2840(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class340 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!v", name = "ta", descriptor = "(Lw;Lg;[IIIII)V")
    private final native void method2841(class69 arg0, class427 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "la", descriptor = "(IIIIIII)V")
    public final native void method389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
