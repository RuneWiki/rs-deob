import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class639 extends class532 implements class247 {

    @OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V", line = 8)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class69.method386(-1995, this);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;II)V", line = 14)
    public class639(class168 arg0, class106 arg1, int arg2, int arg3) {
        this.method3541(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILua;II)V", line = 19)
    public final void method219(int arg0, int arg1, class596 arg2, int arg3, int arg4) {
        this.method3537(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(FFFFFFILua;II)V", line = 22)
    public final void method524(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class596 arg7, int arg8, int arg9) {
        this.method3540(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!va", name = "xa", descriptor = "(III)V", line = 32)
    public final void method218(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;[IIIII)V", line = 39)
    public class639(class168 arg0, class106 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3538(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;IIII)V", line = 43)
    public class639(class168 arg0, class106 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3539(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!va", name = "A", descriptor = "()I")
    public final native int method523();

    @OriginalMember(owner = "client!va", name = "M", descriptor = "(IILua;II)V")
    private final native void method3537(int arg0, int arg1, class596 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "FA", descriptor = "(Ll;Lm;[IIIII)V")
    private final native void method3538(class168 arg0, class106 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "UA", descriptor = "(Z)V")
    public final native void method528(boolean arg0);

    @OriginalMember(owner = "client!va", name = "ca", descriptor = "()I")
    public final native int method532();

    @OriginalMember(owner = "client!va", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!va", name = "W", descriptor = "(Ll;Lm;IIII)V")
    private final native void method3539(class168 arg0, class106 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "E", descriptor = "()I")
    public final native int method530();

    @OriginalMember(owner = "client!va", name = "da", descriptor = "(IIIIII)V")
    public final native void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method525(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!va", name = "wa", descriptor = "(FFFFFFLua;II)V")
    private final native void method3540(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class596 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "(Ll;Lm;II)V")
    private final native void method3541(class168 arg0, class106 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "V", descriptor = "(IIIII)V")
    public final native void method217(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "(IIII)V")
    public final native void method527(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "u", descriptor = "()I")
    public final native int method529();
}
