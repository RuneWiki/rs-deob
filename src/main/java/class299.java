import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class299 extends class341 implements class415 {

    @OriginalMember(owner = "client!q", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILi;II)V")
    public final void method303(int arg0, int arg1, class30 arg2, int arg3, int arg4) {
        this.method1904(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!q", name = "J", descriptor = "(III)V")
    public final void method307(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!q", name = "V", descriptor = "()I")
    public final native int method305();

    @OriginalMember(owner = "client!q", name = "d", descriptor = "()I")
    public final native int method302();

    @OriginalMember(owner = "client!q", name = "da", descriptor = "(Lc;Lk;[IIIII)V")
    private final native void method1901(class124 arg0, class403 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!q", name = "MA", descriptor = "(FFFFFFLi;II)V")
    private final native void method1902(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class30 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(IIIIIII)V")
    public final native void method291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!q", name = "ga", descriptor = "()I")
    public final native int method306();

    @OriginalMember(owner = "client!q", name = "ta", descriptor = "(FFFFFFIII)V")
    public final native void method292(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!q", name = "D", descriptor = "(IIIIII)V")
    public final native void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(Lc;Lk;IIII)V")
    private final native void method1903(class124 arg0, class403 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "l", descriptor = "(IIII)V")
    public final native void method294(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!q", name = "TA", descriptor = "()I")
    public final native int method296();

    @OriginalMember(owner = "client!q", name = "pa", descriptor = "()V")
    public final native void method304();

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(FFFFFFLi;II)V")
    public final void method300(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class30 arg6, int arg7, int arg8) {
        this.method1902(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class93.method626(this, 0);
        }
    }

    @OriginalMember(owner = "client!q", name = "W", descriptor = "(IILi;II)V")
    private final native void method1904(int arg0, int arg1, class30 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!q", name = "PA", descriptor = "(IIIIIII)V")
    public final native void method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lc;Lk;[IIIII)V")
    public class299(class124 arg0, class403 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1901(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lc;Lk;IIII)V")
    public class299(class124 arg0, class403 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1903(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!q", name = "E", descriptor = "(IIIII)V")
    public final native void method297(int arg0, int arg1, int arg2, int arg3, int arg4);
}
