import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class419 extends class433 implements class137 {

    @OriginalMember(owner = "client!aa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!aa", name = "GA", descriptor = "(IIIIII)V")
    public final native void method1581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!aa", name = "sa", descriptor = "(FFFFFFIII)V")
    public final native void method1583(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aa", name = "QA", descriptor = "()I")
    public final native int method1570();

    @OriginalMember(owner = "client!aa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class284.method1838(this, -98);
        }
    }

    @OriginalMember(owner = "client!aa", name = "EA", descriptor = "(IIII)V")
    public final native void method1580(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!aa", name = "va", descriptor = "(IILfa;II)V")
    private final native void method2645(int arg0, int arg1, class199 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "(Z)V")
    public final native void method70(boolean arg0);

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "(III)V")
    public final native void method1569(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!aa", name = "JA", descriptor = "(FFFFFFLfa;II)V")
    private final native void method2646(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class199 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lda;La;[IIIII)V")
    public class419(class54 arg0, class537 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2647(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!aa", name = "ba", descriptor = "(IIIIIII)V")
    public final native void method1574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "WA", descriptor = "(Lda;La;[IIIII)V")
    private final native void method2647(class54 arg0, class537 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public final void method1578(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class199 arg6, int arg7, int arg8) {
        this.method2646(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "(IIIII)V")
    public final native void method1571(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "(Lda;La;IIII)V")
    private final native void method2648(class54 arg0, class537 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILfa;II)V")
    public final void method1572(int arg0, int arg1, class199 arg2, int arg3, int arg4) {
        this.method2645(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!aa", name = "AA", descriptor = "()I")
    public final native int method1577();

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()I")
    public final native int method1568();

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()I")
    public final native int method1576();

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lda;La;IIII)V")
    public class419(class54 arg0, class537 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2648(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!aa", name = "KA", descriptor = "(IIIIIII)V")
    public final native void method1582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
