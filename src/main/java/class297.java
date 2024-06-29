import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class297 extends class24 implements class294 {

    @OriginalMember(owner = "client!q", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(IILta;II)V")
    private final native void method1916(int arg0, int arg1, class144 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(III)V")
    public final void method153(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "()I")
    public final native int method165();

    @OriginalMember(owner = "client!q", name = "ya", descriptor = "(IIIIIII)V")
    public final native void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!q", name = "la", descriptor = "(IIIIIII)V")
    public final native void method152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!q", name = "RA", descriptor = "()I")
    public final native int method147();

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILta;II)V")
    public final void method166(int arg0, int arg1, class144 arg2, int arg3, int arg4) {
        this.method1916(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!q", name = "ZA", descriptor = "()I")
    public final native int method154();

    @OriginalMember(owner = "client!q", name = "DA", descriptor = "(Lw;Lg;[I[BIIII)V")
    private final native void method1917(class197 arg0, class109 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!q", name = "p", descriptor = "()V")
    public final native void method615();

    @OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class157.method1134((byte) 110, this);
        }
    }

    @OriginalMember(owner = "client!q", name = "H", descriptor = "(FFFFFFIII)V")
    public final native void method160(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!q", name = "W", descriptor = "(IIIII)V")
    public final native void method167(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "(FFFFFFLta;II)V")
    private final native void method1918(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class144 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(IIIIII)V")
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lw;Lg;[I[BIIII)V")
    public class297(class197 arg0, class109 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1917(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!q", name = "YA", descriptor = "()I")
    public final native int method157();

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(FFFFFFLta;II)V")
    public final void method158(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class144 arg6, int arg7, int arg8) {
        this.method1918(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!q", name = "ha", descriptor = "(IIII)V")
    public final native void method148(int arg0, int arg1, int arg2, int arg3);
}
