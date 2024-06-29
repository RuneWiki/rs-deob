import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class454 extends class468 implements class145 {

    @OriginalMember(owner = "client!aa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public final void method1547(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class219 arg6, int arg7, int arg8) {
        this.method2494(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!aa", name = "sa", descriptor = "(FFFFFFIII)V")
    public final native void method1554(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aa", name = "AA", descriptor = "()I")
    public final native int method1552();

    @OriginalMember(owner = "client!aa", name = "QA", descriptor = "()I")
    public final native int method1556();

    @OriginalMember(owner = "client!aa", name = "ba", descriptor = "(IIIIIII)V")
    public final native void method1551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "JA", descriptor = "(FFFFFFLfa;II)V")
    private final native void method2494(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class219 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "(IIIII)V")
    public final native void method1543(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "va", descriptor = "(IILfa;II)V")
    private final native void method2495(int arg0, int arg1, class219 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "(III)V")
    public final native void method1550(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!aa", name = "GA", descriptor = "(IIIIII)V")
    public final native void method1546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()I")
    public final native int method1544();

    @OriginalMember(owner = "client!aa", name = "WA", descriptor = "(Lda;La;[IIIII)V")
    private final native void method2496(class57 arg0, class579 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "(Lda;La;II)V")
    private final native void method2497(class57 arg0, class579 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lda;La;II)V")
    public class454(class57 arg0, class579 arg1, int arg2, int arg3) {
        this.method2497(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!aa", name = "KA", descriptor = "(IIIIIII)V")
    public final native void method1553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lda;La;[IIIII)V")
    public class454(class57 arg0, class579 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2496(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "(Z)V")
    public final native void method57(boolean arg0);

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "(Lda;La;IIII)V")
    private final native void method2498(class57 arg0, class579 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!aa", name = "EA", descriptor = "(IIII)V")
    public final native void method1559(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILfa;II)V")
    public final void method1557(int arg0, int arg1, class219 arg2, int arg3, int arg4) {
        this.method2495(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()I")
    public final native int method1549();

    @OriginalMember(owner = "client!aa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class368.method2146((byte) -99, this);
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lda;La;IIII)V")
    public class454(class57 arg0, class579 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2498(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
