import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class416 extends class24 implements class130 {

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILta;II)V", line = 7)
    public final void method148(int arg0, int arg1, class145 arg2, int arg3, int arg4) {
        this.method2465(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V", line = 11)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class512.method3054(-112, this);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(FFFFFFLta;II)V", line = 18)
    public final void method154(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class145 arg6, int arg7, int arg8) {
        this.method2463(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lw;Lg;[IIIII)V", line = 35)
    public class416(class199 arg0, class109 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2462(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lw;Lg;IIII)V", line = 38)
    public class416(class199 arg0, class109 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2464(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!v", name = "la", descriptor = "(IIIIIII)V")
    public final native void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "YA", descriptor = "()I")
    public final native int method146();

    @OriginalMember(owner = "client!v", name = "ZA", descriptor = "()I")
    public final native int method155();

    @OriginalMember(owner = "client!v", name = "ta", descriptor = "(Lw;Lg;[IIIII)V")
    private final native void method2462(class199 arg0, class109 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "ha", descriptor = "(IIII)V")
    public final native void method152(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "HA", descriptor = "(FFFFFFLta;II)V")
    private final native void method2463(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class145 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!v", name = "ya", descriptor = "(IIIIIII)V")
    public final native void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "XA", descriptor = "(IIIIII)V")
    public final native void method147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "H", descriptor = "(FFFFFFIII)V")
    public final native void method158(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
    public final native int method145();

    @OriginalMember(owner = "client!v", name = "p", descriptor = "()V")
    public final native void method540();

    @OriginalMember(owner = "client!v", name = "OA", descriptor = "(Lw;Lg;IIII)V")
    private final native void method2464(class199 arg0, class109 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
    public final native void method160(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "W", descriptor = "(IIIII)V")
    public final native void method144(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "()I")
    public final native int method157();

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(IILta;II)V")
    private final native void method2465(int arg0, int arg1, class145 arg2, int arg3, int arg4);
}
