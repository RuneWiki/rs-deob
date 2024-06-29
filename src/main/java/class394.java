import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class394 extends class511 implements class128 {

    @OriginalMember(owner = "client!la", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lda;La;[I[BIIII)V", line = 9)
    public class394(class396 arg0, class613 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2244(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILfa;II)V", line = 15)
    public final void method594(int arg0, int arg1, class619 arg2, int arg3, int arg4) {
        this.method2245(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!la", name = "GA", descriptor = "(IIIIII)V", line = 20)
    public final void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!la", name = "t", descriptor = "(III)V", line = 23)
    public final void method597(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!la", name = "finalize", descriptor = "()V", line = 26)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class29.method241(-118, this);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(FFFFFFLfa;II)V", line = 31)
    public final void method609(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class619 arg6, int arg7, int arg8) {
        this.method2246(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!la", name = "QA", descriptor = "()I")
    public final native int method608();

    @OriginalMember(owner = "client!la", name = "EA", descriptor = "(IIII)V")
    public final native void method610(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!la", name = "sa", descriptor = "(FFFFFFIII)V")
    public final native void method598(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!la", name = "W", descriptor = "(Lda;La;[I[BIIII)V")
    private final native void method2244(class396 arg0, class613 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "ya", descriptor = "(IILfa;II)V")
    private final native void method2245(int arg0, int arg1, class619 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!la", name = "I", descriptor = "(IIIII)V")
    public final native void method606(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!la", name = "H", descriptor = "(Z)V")
    public final native void method599(boolean arg0);

    @OriginalMember(owner = "client!la", name = "b", descriptor = "()I")
    public final native int method607();

    @OriginalMember(owner = "client!la", name = "KA", descriptor = "(IIIIIII)V")
    public final native void method604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!la", name = "U", descriptor = "(FFFFFFLfa;II)V")
    private final native void method2246(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class619 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!la", name = "ba", descriptor = "(IIIIIII)V")
    public final native void method596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()I")
    public final native int method595();

    @OriginalMember(owner = "client!la", name = "AA", descriptor = "()I")
    public final native int method602();
}
