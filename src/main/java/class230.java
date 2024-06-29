import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class230 extends class363 implements class28 {

    @OriginalMember(owner = "client!ca", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "()V")
    public final native void method164();

    @OriginalMember(owner = "client!ca", name = "la", descriptor = "(IIIIIII)V")
    public final native void method389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "ZA", descriptor = "()I")
    public final native int method399();

    @OriginalMember(owner = "client!ca", name = "ha", descriptor = "(IIII)V")
    public final native void method400(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ca", name = "oa", descriptor = "(III)V")
    public final void method1214(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ca", name = "pa", descriptor = "(IILta;II)V")
    private final native void method1558(int arg0, int arg1, class340 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(Lw;Lg;[IIIII)V")
    private final native void method1559(class69 arg0, class427 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "W", descriptor = "(IIIII)V")
    public final native void method392(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ca", name = "XA", descriptor = "(IIIIII)V")
    public final native void method1213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(FFFFFFLta;II)V")
    public final void method401(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class340 arg6, int arg7, int arg8) {
        this.method1560(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ca", name = "YA", descriptor = "()I")
    public final native int method398();

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class45.method300(this, 0);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILta;II)V")
    public final void method397(int arg0, int arg1, class340 arg2, int arg3, int arg4) {
        this.method1558(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "(FFFFFFIII)V")
    public final native void method402(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ca", name = "ya", descriptor = "(IIIIIII)V")
    public final native void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "()I")
    public final native int method396();

    @OriginalMember(owner = "client!ca", name = "RA", descriptor = "()I")
    public final native int method394();

    @OriginalMember(owner = "client!ca", name = "LA", descriptor = "(FFFFFFLta;II)V")
    private final native void method1560(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class340 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ca", name = "ma", descriptor = "(Lw;Lg;IIII)V")
    private final native void method1561(class69 arg0, class427 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lw;Lg;[IIIII)V")
    public class230(class69 arg0, class427 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1559(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lw;Lg;IIII)V")
    public class230(class69 arg0, class427 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1561(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
