import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class227 extends class359 implements class194 {

    @OriginalMember(owner = "client!ca", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "(FFFFFFIII)V")
    public final native void method209(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ca", name = "RA", descriptor = "()I")
    public final native int method204();

    @OriginalMember(owner = "client!ca", name = "la", descriptor = "(IIIIIII)V")
    public final native void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "XA", descriptor = "(IIIIII)V")
    public final native void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ca", name = "ma", descriptor = "(Lw;Lg;IIII)V")
    private final native void method1401(class69 arg0, class424 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "()I")
    public final native int method207();

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "()V")
    public final native void method442();

    @OriginalMember(owner = "client!ca", name = "pa", descriptor = "(IILta;II)V")
    private final native void method1402(int arg0, int arg1, class336 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ca", name = "oa", descriptor = "(III)V")
    public final void method201(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ca", name = "W", descriptor = "(IIIII)V")
    public final native void method215(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ca", name = "ZA", descriptor = "()I")
    public final native int method200();

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(Lw;Lg;[IIIII)V")
    private final native void method1403(class69 arg0, class424 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "ha", descriptor = "(IIII)V")
    public final native void method210(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ca", name = "YA", descriptor = "()I")
    public final native int method205();

    @OriginalMember(owner = "client!ca", name = "LA", descriptor = "(FFFFFFLta;II)V")
    private final native void method1404(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class336 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ca", name = "ya", descriptor = "(IIIIIII)V")
    public final native void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(FFFFFFLta;II)V")
    public final void method216(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class336 arg6, int arg7, int arg8) {
        this.method1404(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lw;Lg;[IIIII)V")
    public class227(class69 arg0, class424 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1403(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class260.method1547(-1, this);
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lw;Lg;IIII)V")
    public class227(class69 arg0, class424 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1401(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILta;II)V")
    public final void method203(int arg0, int arg1, class336 arg2, int arg3, int arg4) {
        this.method1402(arg0, arg1, arg2, arg3, arg4);
    }
}
