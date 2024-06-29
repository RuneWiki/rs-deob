import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class251 extends class461 implements class141 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "KA", descriptor = "(IIIIIII)V")
    public final native void method35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "(Z)V")
    public final native void method58(boolean arg0);

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "(IILfa;II)V")
    private final native void method1550(int arg0, int arg1, class212 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "()I")
    public final native int method33();

    @OriginalMember(owner = "client!ja", name = "sa", descriptor = "(FFFFFFIII)V")
    public final native void method24(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(III)V")
    public final void method182(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()I")
    public final native int method29();

    @OriginalMember(owner = "client!ja", name = "EA", descriptor = "(IIII)V")
    public final native void method34(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "GA", descriptor = "(IIIIII)V")
    public final native void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ja", name = "ba", descriptor = "(IIIIIII)V")
    public final native void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lda;La;[IIIII)V")
    public class251(class55 arg0, class566 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1551(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()I")
    public final native int method26();

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "(IIIII)V")
    public final native void method30(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public final void method22(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class212 arg6, int arg7, int arg8) {
        this.method1553(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class373.method2177(this, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!ja", name = "QA", descriptor = "()I")
    public final native int method31();

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILfa;II)V")
    public final void method23(int arg0, int arg1, class212 arg2, int arg3, int arg4) {
        this.method1550(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(Lda;La;[IIIII)V")
    private final native void method1551(class55 arg0, class566 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lda;La;IIII)V")
    public class251(class55 arg0, class566 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1552(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "WA", descriptor = "(Lda;La;IIII)V")
    private final native void method1552(class55 arg0, class566 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "(FFFFFFLfa;II)V")
    private final native void method1553(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class212 arg6, int arg7, int arg8);
}
