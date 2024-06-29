import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class641 extends class534 implements class251 {

    @OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "()I")
    public final native int method306();

    @OriginalMember(owner = "client!va", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method310(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method302(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class598 arg7, int arg8, int arg9) {
        this.method3603(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "(IIII)V")
    public final native void method313(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "da", descriptor = "(IIIIII)V")
    public final native void method485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "xa", descriptor = "(III)V")
    public final void method488(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!va", name = "wa", descriptor = "(FFFFFFLua;II)V")
    private final native void method3603(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class598 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!va", name = "E", descriptor = "()I")
    public final native int method315();

    @OriginalMember(owner = "client!va", name = "ca", descriptor = "()I")
    public final native int method304();

    @OriginalMember(owner = "client!va", name = "W", descriptor = "(Ll;Lm;IIII)V")
    private final native void method3604(class172 arg0, class109 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "V", descriptor = "(IIIII)V")
    public final native void method314(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "A", descriptor = "()I")
    public final native int method312();

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILua;II)V")
    public final void method301(int arg0, int arg1, class598 arg2, int arg3, int arg4) {
        this.method3605(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!va", name = "M", descriptor = "(IILua;II)V")
    private final native void method3605(int arg0, int arg1, class598 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class402.method2265(-97, this);
        }
    }

    @OriginalMember(owner = "client!va", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "(Ll;Lm;II)V")
    private final native void method3606(class172 arg0, class109 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;II)V")
    public class641(class172 arg0, class109 arg1, int arg2, int arg3) {
        this.method3606(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!va", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;[IIIII)V")
    public class641(class172 arg0, class109 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3607(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!va", name = "UA", descriptor = "(Z)V")
    public final native void method484(boolean arg0);

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;IIII)V")
    public class641(class172 arg0, class109 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3604(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!va", name = "FA", descriptor = "(Ll;Lm;[IIIII)V")
    private final native void method3607(class172 arg0, class109 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);
}
