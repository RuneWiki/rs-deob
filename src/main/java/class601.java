import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class601 extends class257 implements class52 {

    @OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILua;II)V", line = 3)
    public final void method4(int arg0, int arg1, class591 arg2, int arg3, int arg4) {
        this.method3423(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(FFFFFFILua;II)V", line = 8)
    public final void method16(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class591 arg7, int arg8, int arg9) {
        this.method3425(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V", line = 13)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class388.method2372(this, 0);
        }
    }

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(IIIIII)V", line = 19)
    public final void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "xa", descriptor = "(III)V", line = 30)
    public final void method501(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Ll;Lm;[I[BIIII)V", line = 36)
    public class601(class261 arg0, class496 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3424(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!w", name = "U", descriptor = "(IILua;II)V")
    private final native void method3423(int arg0, int arg1, class591 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "A", descriptor = "()I")
    public final native int method11();

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(Ll;Lm;[I[BIIII)V")
    private final native void method3424(class261 arg0, class496 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "u", descriptor = "()I")
    public final native int method17();

    @OriginalMember(owner = "client!w", name = "V", descriptor = "(IIIII)V")
    public final native void method3(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method5(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!w", name = "aa", descriptor = "(FFFFFFLua;II)V")
    private final native void method3425(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class591 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "UA", descriptor = "(Z)V")
    public final native void method411(boolean arg0);

    @OriginalMember(owner = "client!w", name = "E", descriptor = "()I")
    public final native int method12();

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "(IIII)V")
    public final native void method7(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!w", name = "ca", descriptor = "()I")
    public final native int method9();
}
