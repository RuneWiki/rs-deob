import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class235 extends class433 implements class137 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(III)V", line = 6)
    public final void method1569(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILfa;II)V", line = 12)
    public final void method1572(int arg0, int arg1, class199 arg2, int arg3, int arg4) {
        this.method1575(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V", line = 17)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class284.method1838(this, 115);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(FFFFFFLfa;II)V", line = 27)
    public final void method1578(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class199 arg6, int arg7, int arg8) {
        this.method1584(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lda;La;[IIIII)V", line = 39)
    public class235(class54 arg0, class537 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1573(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lda;La;IIII)V", line = 42)
    public class235(class54 arg0, class537 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1579(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()I")
    public final native int method1568();

    @OriginalMember(owner = "client!ja", name = "QA", descriptor = "()I")
    public final native int method1570();

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "(IIIII)V")
    public final native void method1571(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(Lda;La;[IIIII)V")
    private final native void method1573(class54 arg0, class537 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "ba", descriptor = "(IIIIIII)V")
    public final native void method1574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "(IILfa;II)V")
    private final native void method1575(int arg0, int arg1, class199 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()I")
    public final native int method1576();

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "()I")
    public final native int method1577();

    @OriginalMember(owner = "client!ja", name = "WA", descriptor = "(Lda;La;IIII)V")
    private final native void method1579(class54 arg0, class537 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "(Z)V")
    public final native void method70(boolean arg0);

    @OriginalMember(owner = "client!ja", name = "EA", descriptor = "(IIII)V")
    public final native void method1580(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "GA", descriptor = "(IIIIII)V")
    public final native void method1581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ja", name = "KA", descriptor = "(IIIIIII)V")
    public final native void method1582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "sa", descriptor = "(FFFFFFIII)V")
    public final native void method1583(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "(FFFFFFLfa;II)V")
    private final native void method1584(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class199 arg6, int arg7, int arg8);
}
