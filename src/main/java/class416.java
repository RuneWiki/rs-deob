import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class416 extends class461 implements class141 {

    @OriginalMember(owner = "client!la", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "(IIIII)V")
    public final native void method30(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!la", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class373.method2177(this, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()I")
    public final native int method29();

    @OriginalMember(owner = "client!la", name = "GA", descriptor = "(IIIIII)V")
    public final void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!la", name = "EA", descriptor = "(IIII)V")
    public final native void method34(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!la", name = "QA", descriptor = "()I")
    public final native int method31();

    @OriginalMember(owner = "client!la", name = "ba", descriptor = "(IIIIIII)V")
    public final native void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!la", name = "t", descriptor = "(III)V")
    public final void method182(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "()I")
    public final native int method26();

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILfa;II)V")
    public final void method23(int arg0, int arg1, class212 arg2, int arg3, int arg4) {
        this.method2379(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!la", name = "H", descriptor = "(Z)V")
    public final native void method58(boolean arg0);

    @OriginalMember(owner = "client!la", name = "KA", descriptor = "(IIIIIII)V")
    public final native void method35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!la", name = "U", descriptor = "(FFFFFFLfa;II)V")
    private final native void method2378(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class212 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!la", name = "ya", descriptor = "(IILfa;II)V")
    private final native void method2379(int arg0, int arg1, class212 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!la", name = "AA", descriptor = "()I")
    public final native int method33();

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public final void method22(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class212 arg6, int arg7, int arg8) {
        this.method2378(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!la", name = "W", descriptor = "(Lda;La;[I[BIIII)V")
    private final native void method2380(class55 arg0, class566 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lda;La;[I[BIIII)V")
    public class416(class55 arg0, class566 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2380(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!la", name = "sa", descriptor = "(FFFFFFIII)V")
    public final native void method24(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);
}
