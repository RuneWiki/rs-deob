import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class520 extends class534 implements class251 {

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(FFFFFFILua;II)V", line = 14)
    public final void method302(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class598 arg7, int arg8, int arg9) {
        this.method2953(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V", line = 20)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class402.method2265(-106, this);
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;II)V", line = 24)
    public class520(class172 arg0, class109 arg1, int arg2, int arg3) {
        this.method2951(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILua;II)V", line = 28)
    public final void method301(int arg0, int arg1, class598 arg2, int arg3, int arg4) {
        this.method2954(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;[IIIII)V", line = 32)
    public class520(class172 arg0, class109 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2955(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;IIII)V", line = 39)
    public class520(class172 arg0, class109 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2952(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!t", name = "xa", descriptor = "(III)V")
    public final native void method488(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "HA", descriptor = "(Ll;Lm;II)V")
    private final native void method2951(class172 arg0, class109 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "UA", descriptor = "(Z)V")
    public final native void method484(boolean arg0);

    @OriginalMember(owner = "client!t", name = "ca", descriptor = "()I")
    public final native int method304();

    @OriginalMember(owner = "client!t", name = "E", descriptor = "()I")
    public final native int method315();

    @OriginalMember(owner = "client!t", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "(IIII)V")
    public final native void method313(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "l", descriptor = "(Ll;Lm;IIII)V")
    private final native void method2952(class172 arg0, class109 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "u", descriptor = "()I")
    public final native int method306();

    @OriginalMember(owner = "client!t", name = "da", descriptor = "(IIIIII)V")
    public final native void method485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "W", descriptor = "(FFFFFFLua;II)V")
    private final native void method2953(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class598 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!t", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method310(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!t", name = "V", descriptor = "(IIIII)V")
    public final native void method314(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "JA", descriptor = "(IILua;II)V")
    private final native void method2954(int arg0, int arg1, class598 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(Ll;Lm;[IIIII)V")
    private final native void method2955(class172 arg0, class109 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "A", descriptor = "()I")
    public final native int method312();
}
