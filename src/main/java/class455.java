import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class455 extends class468 implements class144 {

    @OriginalMember(owner = "client!aa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILfa;II)V", line = 19)
    public final void method276(int arg0, int arg1, class217 arg2, int arg3, int arg4) {
        this.method2596(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFFFFFLfa;II)V", line = 23)
    public final void method1026(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class217 arg6, int arg7, int arg8) {
        this.method2598(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!aa", name = "finalize", descriptor = "()V", line = 26)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class550.method3055((byte) -20, this);
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lda;La;II)V", line = 34)
    public class455(class57 arg0, class579 arg1, int arg2, int arg3) {
        this.method2597(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lda;La;[IIIII)V", line = 37)
    public class455(class57 arg0, class579 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2599(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lda;La;IIII)V", line = 40)
    public class455(class57 arg0, class579 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2595(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!aa", name = "GA", descriptor = "(IIIIII)V")
    public final native void method273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "(Lda;La;IIII)V")
    private final native void method2595(class57 arg0, class579 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!aa", name = "va", descriptor = "(IILfa;II)V")
    private final native void method2596(int arg0, int arg1, class217 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "(IIIII)V")
    public final native void method271(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "(III)V")
    public final native void method272(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!aa", name = "ba", descriptor = "(IIIIIII)V")
    public final native void method1027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()I")
    public final native int method1028();

    @OriginalMember(owner = "client!aa", name = "KA", descriptor = "(IIIIIII)V")
    public final native void method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "AA", descriptor = "()I")
    public final native int method1025();

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "(Lda;La;II)V")
    private final native void method2597(class57 arg0, class579 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!aa", name = "JA", descriptor = "(FFFFFFLfa;II)V")
    private final native void method2598(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class217 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()I")
    public final native int method1030();

    @OriginalMember(owner = "client!aa", name = "QA", descriptor = "()I")
    public final native int method1035();

    @OriginalMember(owner = "client!aa", name = "sa", descriptor = "(FFFFFFIII)V")
    public final native void method1036(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aa", name = "EA", descriptor = "(IIII)V")
    public final native void method1029(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "(Z)V")
    public final native void method132(boolean arg0);

    @OriginalMember(owner = "client!aa", name = "WA", descriptor = "(Lda;La;[IIIII)V")
    private final native void method2599(class57 arg0, class579 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);
}
