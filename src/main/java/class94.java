import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class94 extends class536 implements class249 {

    @OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILua;II)V", line = 6)
    public final void method153(int arg0, int arg1, class600 arg2, int arg3, int arg4) {
        this.method550(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(FFFFFFILua;II)V", line = 10)
    public final void method163(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class600 arg7, int arg8, int arg9) {
        this.method549(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!w", name = "xa", descriptor = "(III)V", line = 20)
    public final void method158(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V", line = 23)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class499.method2689(this, (byte) 97);
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Ll;Lm;[I[BIIII)V", line = 28)
    public class94(class171 arg0, class108 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method551(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(IIIIII)V", line = 36)
    public final void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "UA", descriptor = "(Z)V")
    public final native void method548(boolean arg0);

    @OriginalMember(owner = "client!w", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method159(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!w", name = "aa", descriptor = "(FFFFFFLua;II)V")
    private final native void method549(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class600 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "U", descriptor = "(IILua;II)V")
    private final native void method550(int arg0, int arg1, class600 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "ca", descriptor = "()I")
    public final native int method166();

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "(IIII)V")
    public final native void method161(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!w", name = "E", descriptor = "()I")
    public final native int method167();

    @OriginalMember(owner = "client!w", name = "V", descriptor = "(IIIII)V")
    public final native void method155(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "A", descriptor = "()I")
    public final native int method160();

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(Ll;Lm;[I[BIIII)V")
    private final native void method551(class171 arg0, class108 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "u", descriptor = "()I")
    public final native int method162();
}
