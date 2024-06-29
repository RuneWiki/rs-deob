import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class368 extends class359 implements class194 {

    @OriginalMember(owner = "client!q", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(IIIIII)V", line = 7)
    public final void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V", line = 11)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class260.method1547(-1, this);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(FFFFFFLta;II)V", line = 24)
    public final void method216(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class336 arg6, int arg7, int arg8) {
        this.method2202(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILta;II)V", line = 28)
    public final void method203(int arg0, int arg1, class336 arg2, int arg3, int arg4) {
        this.method2201(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lw;Lg;[I[BIIII)V", line = 31)
    public class368(class69 arg0, class424 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2200(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(III)V", line = 35)
    public final void method201(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!q", name = "p", descriptor = "()V")
    public final native void method442();

    @OriginalMember(owner = "client!q", name = "YA", descriptor = "()I")
    public final native int method205();

    @OriginalMember(owner = "client!q", name = "W", descriptor = "(IIIII)V")
    public final native void method215(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!q", name = "ha", descriptor = "(IIII)V")
    public final native void method210(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!q", name = "DA", descriptor = "(Lw;Lg;[I[BIIII)V")
    private final native void method2200(class69 arg0, class424 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!q", name = "RA", descriptor = "()I")
    public final native int method204();

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(IILta;II)V")
    private final native void method2201(int arg0, int arg1, class336 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "()I")
    public final native int method207();

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "(FFFFFFLta;II)V")
    private final native void method2202(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class336 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!q", name = "H", descriptor = "(FFFFFFIII)V")
    public final native void method209(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!q", name = "la", descriptor = "(IIIIIII)V")
    public final native void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!q", name = "ZA", descriptor = "()I")
    public final native int method200();

    @OriginalMember(owner = "client!q", name = "ya", descriptor = "(IIIIIII)V")
    public final native void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
