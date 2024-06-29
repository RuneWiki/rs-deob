import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class203 extends class24 implements class130 {

    @OriginalMember(owner = "client!ca", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ca", name = "oa", descriptor = "(III)V", line = 4)
    public final void method160(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(FFFFFFLta;II)V", line = 11)
    public final void method154(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class145 arg6, int arg7, int arg8) {
        this.method1301(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILta;II)V", line = 16)
    public final void method148(int arg0, int arg1, class145 arg2, int arg3, int arg4) {
        this.method1303(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V", line = 24)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class512.method3054(-112, this);
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lw;Lg;[IIIII)V", line = 39)
    public class203(class199 arg0, class109 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1304(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lw;Lg;IIII)V", line = 42)
    public class203(class199 arg0, class109 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1302(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ca", name = "YA", descriptor = "()I")
    public final native int method146();

    @OriginalMember(owner = "client!ca", name = "LA", descriptor = "(FFFFFFLta;II)V")
    private final native void method1301(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class145 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ca", name = "W", descriptor = "(IIIII)V")
    public final native void method144(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "()V")
    public final native void method540();

    @OriginalMember(owner = "client!ca", name = "ma", descriptor = "(Lw;Lg;IIII)V")
    private final native void method1302(class199 arg0, class109 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ca", name = "XA", descriptor = "(IIIIII)V")
    public final native void method147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ca", name = "la", descriptor = "(IIIIIII)V")
    public final native void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "ZA", descriptor = "()I")
    public final native int method155();

    @OriginalMember(owner = "client!ca", name = "RA", descriptor = "()I")
    public final native int method145();

    @OriginalMember(owner = "client!ca", name = "ha", descriptor = "(IIII)V")
    public final native void method152(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ca", name = "pa", descriptor = "(IILta;II)V")
    private final native void method1303(int arg0, int arg1, class145 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "()I")
    public final native int method157();

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "(FFFFFFIII)V")
    public final native void method158(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(Lw;Lg;[IIIII)V")
    private final native void method1304(class199 arg0, class109 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "ya", descriptor = "(IIIIIII)V")
    public final native void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
