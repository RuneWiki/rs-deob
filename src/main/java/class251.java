import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class251 extends class458 implements class142 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "(FFFFFFLfa;II)V")
    private final native void method1442(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class213 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "(IIIII)V")
    public final native void method416(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ja", name = "KA", descriptor = "(IIIIIII)V")
    public final native void method413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "sa", descriptor = "(FFFFFFIII)V")
    public final native void method419(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "(Z)V")
    public final native void method59(boolean arg0);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public final void method421(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class213 arg6, int arg7, int arg8) {
        this.method1442(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(Lda;La;[IIIII)V")
    private final native void method1443(class56 arg0, class564 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "QA", descriptor = "()I")
    public final native int method415();

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()I")
    public final native int method408();

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()I")
    public final native int method417();

    @OriginalMember(owner = "client!ja", name = "WA", descriptor = "(Lda;La;IIII)V")
    private final native void method1444(class56 arg0, class564 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ja", name = "ba", descriptor = "(IIIIIII)V")
    public final native void method420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "EA", descriptor = "(IIII)V")
    public final native void method409(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "GA", descriptor = "(IIIIII)V")
    public final native void method411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(III)V")
    public final void method414(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lda;La;[IIIII)V")
    public class251(class56 arg0, class564 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1443(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "()I")
    public final native int method418();

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILfa;II)V")
    public final void method410(int arg0, int arg1, class213 arg2, int arg3, int arg4) {
        this.method1445(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "(IILfa;II)V")
    private final native void method1445(int arg0, int arg1, class213 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lda;La;IIII)V")
    public class251(class56 arg0, class564 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1444(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class409.method2220(this, (byte) 83);
        }
    }
}
