import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class93 extends class532 implements class247 {

    @OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "(IILua;II)V")
    private final native void method521(int arg0, int arg1, class596 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(Ll;Lm;[I[BIIII)V")
    private final native void method522(class168 arg0, class106 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "A", descriptor = "()I")
    public final native int method523();

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method524(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class596 arg7, int arg8, int arg9) {
        this.method526(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!w", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method525(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!w", name = "aa", descriptor = "(FFFFFFLua;II)V")
    private final native void method526(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class596 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "(IIII)V")
    public final native void method527(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "UA", descriptor = "(Z)V")
    public final native void method528(boolean arg0);

    @OriginalMember(owner = "client!w", name = "xa", descriptor = "(III)V")
    public final void method218(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class69.method386(-1995, this);
        }
    }

    @OriginalMember(owner = "client!w", name = "u", descriptor = "()I")
    public final native int method529();

    @OriginalMember(owner = "client!w", name = "E", descriptor = "()I")
    public final native int method530();

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(IIIIII)V")
    public final void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILua;II)V")
    public final void method219(int arg0, int arg1, class596 arg2, int arg3, int arg4) {
        this.method521(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Ll;Lm;[I[BIIII)V")
    public class93(class168 arg0, class106 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method522(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!w", name = "V", descriptor = "(IIIII)V")
    public final native void method217(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!w", name = "ca", descriptor = "()I")
    public final native int method532();
}
