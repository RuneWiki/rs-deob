import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class34 extends class341 implements class415 {

    @OriginalMember(owner = "client!na", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "(IIIIII)V")
    public final native void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!na", name = "XA", descriptor = "(IIIIIII)V")
    public final native void method291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!na", name = "ta", descriptor = "(FFFFFFIII)V")
    public final native void method292(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!na", name = "BA", descriptor = "(Lc;Lk;IIII)V")
    private final native void method293(class124 arg0, class403 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!na", name = "l", descriptor = "(IIII)V")
    public final native void method294(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!na", name = "JA", descriptor = "(Lc;Lk;[IIIII)V")
    private final native void method295(class124 arg0, class403 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!na", name = "TA", descriptor = "()I")
    public final native int method296();

    @OriginalMember(owner = "client!na", name = "E", descriptor = "(IIIII)V")
    public final native void method297(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!na", name = "PA", descriptor = "(IIIIIII)V")
    public final native void method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!na", name = "ya", descriptor = "(IILi;II)V")
    private final native void method299(int arg0, int arg1, class30 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(FFFFFFLi;II)V")
    public final void method300(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class30 arg6, int arg7, int arg8) {
        this.method301(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!na", name = "ja", descriptor = "(FFFFFFLi;II)V")
    private final native void method301(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class30 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!na", name = "d", descriptor = "()I")
    public final native int method302();

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILi;II)V")
    public final void method303(int arg0, int arg1, class30 arg2, int arg3, int arg4) {
        this.method299(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!na", name = "pa", descriptor = "()V")
    public final native void method304();

    @OriginalMember(owner = "client!na", name = "V", descriptor = "()I")
    public final native int method305();

    @OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class93.method626(this, 0);
        }
    }

    @OriginalMember(owner = "client!na", name = "ga", descriptor = "()I")
    public final native int method306();

    @OriginalMember(owner = "client!na", name = "J", descriptor = "(III)V")
    public final native void method307(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lc;Lk;[IIIII)V")
    public class34(class124 arg0, class403 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method295(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lc;Lk;IIII)V")
    public class34(class124 arg0, class403 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method293(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
