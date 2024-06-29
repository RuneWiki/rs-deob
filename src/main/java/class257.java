import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class257 extends class468 implements class144 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class550.method3055((byte) -20, this);
        }
    }

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(III)V", line = 12)
    public final void method272(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lda;La;II)V", line = 27)
    public class257(class57 arg0, class579 arg1, int arg2, int arg3) {
        this.method1575(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILfa;II)V", line = 33)
    public final void method276(int arg0, int arg1, class217 arg2, int arg3, int arg4) {
        this.method1577(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lda;La;[IIIII)V", line = 35)
    public class257(class57 arg0, class579 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1578(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(FFFFFFLfa;II)V", line = 39)
    public final void method1026(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class217 arg6, int arg7, int arg8) {
        this.method1576(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lda;La;IIII)V", line = 43)
    public class257(class57 arg0, class579 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1579(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "QA", descriptor = "()I")
    public final native int method1035();

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "(Lda;La;II)V")
    private final native void method1575(class57 arg0, class579 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "sa", descriptor = "(FFFFFFIII)V")
    public final native void method1036(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "(Z)V")
    public final native void method132(boolean arg0);

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "()I")
    public final native int method1025();

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "(IIIII)V")
    public final native void method271(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ja", name = "KA", descriptor = "(IIIIIII)V")
    public final native void method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()I")
    public final native int method1028();

    @OriginalMember(owner = "client!ja", name = "EA", descriptor = "(IIII)V")
    public final native void method1029(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "(FFFFFFLfa;II)V")
    private final native void method1576(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class217 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "(IILfa;II)V")
    private final native void method1577(int arg0, int arg1, class217 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(Lda;La;[IIIII)V")
    private final native void method1578(class57 arg0, class579 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()I")
    public final native int method1030();

    @OriginalMember(owner = "client!ja", name = "ba", descriptor = "(IIIIIII)V")
    public final native void method1027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "WA", descriptor = "(Lda;La;IIII)V")
    private final native void method1579(class57 arg0, class579 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ja", name = "GA", descriptor = "(IIIIII)V")
    public final native void method273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
