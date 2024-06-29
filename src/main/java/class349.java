import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class349 extends class341 implements class415 {

    @OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "(IIIIII)V")
    public final void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!va", name = "l", descriptor = "(IIII)V")
    public final native void method294(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "PA", descriptor = "(IIIIIII)V")
    public final native void method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "V", descriptor = "()I")
    public final native int method305();

    @OriginalMember(owner = "client!va", name = "TA", descriptor = "()I")
    public final native int method296();

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class93.method626(this, 0);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(FFFFFFLi;II)V")
    public final void method300(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class30 arg6, int arg7, int arg8) {
        this.method2253(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!va", name = "ta", descriptor = "(FFFFFFIII)V")
    public final native void method292(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!va", name = "LA", descriptor = "(IILi;II)V")
    private final native void method2251(int arg0, int arg1, class30 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "pa", descriptor = "()V")
    public final native void method304();

    @OriginalMember(owner = "client!va", name = "sa", descriptor = "(Lc;Lk;[I[BIIII)V")
    private final native void method2252(class124 arg0, class403 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!va", name = "G", descriptor = "(FFFFFFLi;II)V")
    private final native void method2253(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class30 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!va", name = "J", descriptor = "(III)V")
    public final void method307(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!va", name = "XA", descriptor = "(IIIIIII)V")
    public final native void method291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lc;Lk;[I[BIIII)V")
    public class349(class124 arg0, class403 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2252(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "()I")
    public final native int method302();

    @OriginalMember(owner = "client!va", name = "E", descriptor = "(IIIII)V")
    public final native void method297(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "ga", descriptor = "()I")
    public final native int method306();

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILi;II)V")
    public final void method303(int arg0, int arg1, class30 arg2, int arg3, int arg4) {
        this.method2251(arg0, arg1, arg2, arg3, arg4);
    }
}
