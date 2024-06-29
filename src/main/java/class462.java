import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class462 extends class701 implements class199 {

    @OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!va", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method898(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "W", descriptor = "(Ll;Lm;IIII)V")
    private final native void method2719(class18 arg0, class174 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "u", descriptor = "()I")
    public final native int method900();

    @OriginalMember(owner = "client!va", name = "ca", descriptor = "()I")
    public final native int method901();

    @OriginalMember(owner = "client!va", name = "xa", descriptor = "(III)V")
    public final void method4(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!va", name = "UA", descriptor = "(Z)V")
    public final native void method221(boolean arg0);

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class542.method3175(this, 0);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;II)V")
    public class462(class18 arg0, class174 arg1, int arg2, int arg3) {
        this.method2720(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILua;II)V")
    public final void method6(int arg0, int arg1, class616 arg2, int arg3, int arg4) {
        this.method2723(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "(Ll;Lm;II)V")
    private final native void method2720(class18 arg0, class174 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "E", descriptor = "()I")
    public final native int method902();

    @OriginalMember(owner = "client!va", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method895(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method899(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class616 arg7, int arg8, int arg9) {
        this.method2722(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "(IIII)V")
    public final native void method894(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "FA", descriptor = "(Ll;Lm;[IIIII)V")
    private final native void method2721(class18 arg0, class174 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "da", descriptor = "(IIIIII)V")
    public final native void method5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;[IIIII)V")
    public class462(class18 arg0, class174 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2721(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!va", name = "V", descriptor = "(IIIII)V")
    public final native void method3(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;IIII)V")
    public class462(class18 arg0, class174 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2719(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!va", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!va", name = "wa", descriptor = "(FFFFFFLua;II)V")
    private final native void method2722(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class616 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!va", name = "A", descriptor = "()I")
    public final native int method896();

    @OriginalMember(owner = "client!va", name = "M", descriptor = "(IILua;II)V")
    private final native void method2723(int arg0, int arg1, class616 arg2, int arg3, int arg4);
}
