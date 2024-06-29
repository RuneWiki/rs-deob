import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class421 extends class468 implements class145 {

    @OriginalMember(owner = "client!la", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()I")
    public final native int method1549();

    @OriginalMember(owner = "client!la", name = "GA", descriptor = "(IIIIII)V")
    public final void method1546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!la", name = "W", descriptor = "(Lda;La;[I[BIIII)V")
    private final native void method2332(class57 arg0, class579 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "KA", descriptor = "(IIIIIII)V")
    public final native void method1553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!la", name = "EA", descriptor = "(IIII)V")
    public final native void method1559(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!la", name = "I", descriptor = "(IIIII)V")
    public final native void method1543(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lda;La;[I[BIIII)V")
    public class421(class57 arg0, class579 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2332(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public final void method1547(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class219 arg6, int arg7, int arg8) {
        this.method2333(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!la", name = "QA", descriptor = "()I")
    public final native int method1556();

    @OriginalMember(owner = "client!la", name = "sa", descriptor = "(FFFFFFIII)V")
    public final native void method1554(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!la", name = "b", descriptor = "()I")
    public final native int method1544();

    @OriginalMember(owner = "client!la", name = "AA", descriptor = "()I")
    public final native int method1552();

    @OriginalMember(owner = "client!la", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class368.method2146((byte) -99, this);
        }
    }

    @OriginalMember(owner = "client!la", name = "U", descriptor = "(FFFFFFLfa;II)V")
    private final native void method2333(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class219 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!la", name = "t", descriptor = "(III)V")
    public final void method1550(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!la", name = "ba", descriptor = "(IIIIIII)V")
    public final native void method1551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!la", name = "H", descriptor = "(Z)V")
    public final native void method57(boolean arg0);

    @OriginalMember(owner = "client!la", name = "ya", descriptor = "(IILfa;II)V")
    private final native void method2334(int arg0, int arg1, class219 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILfa;II)V")
    public final void method1557(int arg0, int arg1, class219 arg2, int arg3, int arg4) {
        this.method2334(arg0, arg1, arg2, arg3, arg4);
    }
}
