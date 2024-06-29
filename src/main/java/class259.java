import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class259 extends class468 implements class145 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "(FFFFFFLfa;II)V")
    private final native void method1542(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class219 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "(IIIII)V")
    public final native void method1543(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()I")
    public final native int method1544();

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(Lda;La;[IIIII)V")
    private final native void method1545(class57 arg0, class579 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "GA", descriptor = "(IIIIII)V")
    public final native void method1546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public final void method1547(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class219 arg6, int arg7, int arg8) {
        this.method1542(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ja", name = "WA", descriptor = "(Lda;La;IIII)V")
    private final native void method1548(class57 arg0, class579 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "(Z)V")
    public final native void method57(boolean arg0);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()I")
    public final native int method1549();

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(III)V")
    public final void method1550(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ja", name = "ba", descriptor = "(IIIIIII)V")
    public final native void method1551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class368.method2146((byte) -99, this);
        }
    }

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "()I")
    public final native int method1552();

    @OriginalMember(owner = "client!ja", name = "KA", descriptor = "(IIIIIII)V")
    public final native void method1553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "sa", descriptor = "(FFFFFFIII)V")
    public final native void method1554(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "(IILfa;II)V")
    private final native void method1555(int arg0, int arg1, class219 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ja", name = "QA", descriptor = "()I")
    public final native int method1556();

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILfa;II)V")
    public final void method1557(int arg0, int arg1, class219 arg2, int arg3, int arg4) {
        this.method1555(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "(Lda;La;II)V")
    private final native void method1558(class57 arg0, class579 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "EA", descriptor = "(IIII)V")
    public final native void method1559(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lda;La;II)V")
    public class259(class57 arg0, class579 arg1, int arg2, int arg3) {
        this.method1558(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lda;La;[IIIII)V")
    public class259(class57 arg0, class579 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1545(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lda;La;IIII)V")
    public class259(class57 arg0, class579 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1548(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
