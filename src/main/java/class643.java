import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class643 extends class536 implements class249 {

    @OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "()I")
    public final native int method167();

    @OriginalMember(owner = "client!va", name = "da", descriptor = "(IIIIII)V")
    public final native void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class499.method2689(this, (byte) 97);
        }
    }

    @OriginalMember(owner = "client!va", name = "wa", descriptor = "(FFFFFFLua;II)V")
    private final native void method3591(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class600 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!va", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!va", name = "V", descriptor = "(IIIII)V")
    public final native void method155(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "W", descriptor = "(Ll;Lm;IIII)V")
    private final native void method3592(class171 arg0, class108 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILua;II)V")
    public final void method153(int arg0, int arg1, class600 arg2, int arg3, int arg4) {
        this.method3593(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!va", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "ca", descriptor = "()I")
    public final native int method166();

    @OriginalMember(owner = "client!va", name = "M", descriptor = "(IILua;II)V")
    private final native void method3593(int arg0, int arg1, class600 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "A", descriptor = "()I")
    public final native int method160();

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "(IIII)V")
    public final native void method161(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "FA", descriptor = "(Ll;Lm;[IIIII)V")
    private final native void method3594(class171 arg0, class108 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "(Ll;Lm;II)V")
    private final native void method3595(class171 arg0, class108 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method159(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method163(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class600 arg7, int arg8, int arg9) {
        this.method3591(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!va", name = "UA", descriptor = "(Z)V")
    public final native void method548(boolean arg0);

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;II)V")
    public class643(class171 arg0, class108 arg1, int arg2, int arg3) {
        this.method3595(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!va", name = "xa", descriptor = "(III)V")
    public final void method158(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;[IIIII)V")
    public class643(class171 arg0, class108 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3594(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;IIII)V")
    public class643(class171 arg0, class108 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3592(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!va", name = "u", descriptor = "()I")
    public final native int method162();
}
