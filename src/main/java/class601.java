import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class601 extends class256 implements class52 {

    @OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(IIIIII)V", line = 4)
    public final void method44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILua;II)V", line = 8)
    public final void method51(int arg0, int arg1, class591 arg2, int arg3, int arg4) {
        this.method3419(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Ll;Lm;[I[BIIII)V", line = 10)
    public class601(class260 arg0, class494 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3418(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V", line = 22)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2818(false, this);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(FFFFFFILua;II)V", line = 29)
    public final void method60(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class591 arg7, int arg8, int arg9) {
        this.method3417(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!w", name = "xa", descriptor = "(III)V", line = 32)
    public final void method55(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "aa", descriptor = "(FFFFFFLua;II)V")
    private final native void method3417(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class591 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(Ll;Lm;[I[BIIII)V")
    private final native void method3418(class260 arg0, class494 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "UA", descriptor = "(Z)V")
    public final native void method306(boolean arg0);

    @OriginalMember(owner = "client!w", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method57(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!w", name = "V", descriptor = "(IIIII)V")
    public final native void method49(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!w", name = "E", descriptor = "()I")
    public final native int method48();

    @OriginalMember(owner = "client!w", name = "u", descriptor = "()I")
    public final native int method56();

    @OriginalMember(owner = "client!w", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "U", descriptor = "(IILua;II)V")
    private final native void method3419(int arg0, int arg1, class591 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "A", descriptor = "()I")
    public final native int method50();

    @OriginalMember(owner = "client!w", name = "ca", descriptor = "()I")
    public final native int method43();

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "(IIII)V")
    public final native void method58(int arg0, int arg1, int arg2, int arg3);
}
