import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class521 extends class256 implements class52 {

    @OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!va", name = "xa", descriptor = "(III)V", line = 10)
    public final void method55(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V", line = 18)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2818(false, this);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILua;II)V", line = 23)
    public final void method51(int arg0, int arg1, class591 arg2, int arg3, int arg4) {
        this.method2943(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;II)V", line = 28)
    public class521(class260 arg0, class494 arg1, int arg2, int arg3) {
        this.method2945(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;[IIIII)V", line = 32)
    public class521(class260 arg0, class494 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2944(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;IIII)V", line = 36)
    public class521(class260 arg0, class494 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2942(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(FFFFFFILua;II)V", line = 41)
    public final void method60(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class591 arg7, int arg8, int arg9) {
        this.method2946(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!va", name = "W", descriptor = "(Ll;Lm;IIII)V")
    private final native void method2942(class260 arg0, class494 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "V", descriptor = "(IIIII)V")
    public final native void method49(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "u", descriptor = "()I")
    public final native int method56();

    @OriginalMember(owner = "client!va", name = "ca", descriptor = "()I")
    public final native int method43();

    @OriginalMember(owner = "client!va", name = "E", descriptor = "()I")
    public final native int method48();

    @OriginalMember(owner = "client!va", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!va", name = "A", descriptor = "()I")
    public final native int method50();

    @OriginalMember(owner = "client!va", name = "M", descriptor = "(IILua;II)V")
    private final native void method2943(int arg0, int arg1, class591 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method57(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!va", name = "UA", descriptor = "(Z)V")
    public final native void method306(boolean arg0);

    @OriginalMember(owner = "client!va", name = "da", descriptor = "(IIIIII)V")
    public final native void method44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "FA", descriptor = "(Ll;Lm;[IIIII)V")
    private final native void method2944(class260 arg0, class494 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "(Ll;Lm;II)V")
    private final native void method2945(class260 arg0, class494 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "(IIII)V")
    public final native void method58(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "wa", descriptor = "(FFFFFFLua;II)V")
    private final native void method2946(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class591 arg6, int arg7, int arg8);
}
