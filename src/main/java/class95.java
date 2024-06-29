import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class95 extends class534 implements class251 {

    @OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(IIIIII)V", line = 8)
    public final void method485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(FFFFFFILua;II)V", line = 14)
    public final void method302(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class598 arg7, int arg8, int arg9) {
        this.method487(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!w", name = "xa", descriptor = "(III)V", line = 19)
    public final void method488(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Ll;Lm;[I[BIIII)V", line = 22)
    public class95(class172 arg0, class109 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method486(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V", line = 26)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class402.method2265(-115, this);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILua;II)V", line = 37)
    public final void method301(int arg0, int arg1, class598 arg2, int arg3, int arg4) {
        this.method489(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "UA", descriptor = "(Z)V")
    public final native void method484(boolean arg0);

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "(IIII)V")
    public final native void method313(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "E", descriptor = "()I")
    public final native int method315();

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(Ll;Lm;[I[BIIII)V")
    private final native void method486(class172 arg0, class109 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "aa", descriptor = "(FFFFFFLua;II)V")
    private final native void method487(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class598 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!w", name = "ca", descriptor = "()I")
    public final native int method304();

    @OriginalMember(owner = "client!w", name = "u", descriptor = "()I")
    public final native int method306();

    @OriginalMember(owner = "client!w", name = "V", descriptor = "(IIIII)V")
    public final native void method314(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method310(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!w", name = "U", descriptor = "(IILua;II)V")
    private final native void method489(int arg0, int arg1, class598 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "A", descriptor = "()I")
    public final native int method312();
}
