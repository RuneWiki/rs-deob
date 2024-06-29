import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class74 extends class511 implements class128 {

    @OriginalMember(owner = "client!aa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "(Lda;La;II)V")
    private final native void method593(class396 arg0, class613 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILfa;II)V")
    public final void method594(int arg0, int arg1, class619 arg2, int arg3, int arg4) {
        this.method605(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()I")
    public final native int method595();

    @OriginalMember(owner = "client!aa", name = "ba", descriptor = "(IIIIIII)V")
    public final native void method596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "(III)V")
    public final native void method597(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!aa", name = "sa", descriptor = "(FFFFFFIII)V")
    public final native void method598(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lda;La;II)V")
    public class74(class396 arg0, class613 arg1, int arg2, int arg3) {
        this.method593(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "(Z)V")
    public final native void method599(boolean arg0);

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "(Lda;La;IIII)V")
    private final native void method600(class396 arg0, class613 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!aa", name = "WA", descriptor = "(Lda;La;[IIIII)V")
    private final native void method601(class396 arg0, class613 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "AA", descriptor = "()I")
    public final native int method602();

    @OriginalMember(owner = "client!aa", name = "GA", descriptor = "(IIIIII)V")
    public final native void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!aa", name = "KA", descriptor = "(IIIIIII)V")
    public final native void method604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "va", descriptor = "(IILfa;II)V")
    private final native void method605(int arg0, int arg1, class619 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "(IIIII)V")
    public final native void method606(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()I")
    public final native int method607();

    @OriginalMember(owner = "client!aa", name = "QA", descriptor = "()I")
    public final native int method608();

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lda;La;[IIIII)V")
    public class74(class396 arg0, class613 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method601(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public final void method609(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class619 arg6, int arg7, int arg8) {
        this.method611(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!aa", name = "EA", descriptor = "(IIII)V")
    public final native void method610(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!aa", name = "JA", descriptor = "(FFFFFFLfa;II)V")
    private final native void method611(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class619 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class29.method241(95, this);
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lda;La;IIII)V")
    public class74(class396 arg0, class613 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method600(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
