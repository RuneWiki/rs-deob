import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class602 extends class257 implements class52 {

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method5(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!t", name = "V", descriptor = "(IIIII)V")
    public final native void method3(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "E", descriptor = "()I")
    public final native int method12();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method16(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class591 arg7, int arg8, int arg9) {
        this.method3428(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!t", name = "da", descriptor = "(IIIIII)V")
    public final native void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILua;II)V")
    public final void method4(int arg0, int arg1, class591 arg2, int arg3, int arg4) {
        this.method3427(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!t", name = "ca", descriptor = "()I")
    public final native int method9();

    @OriginalMember(owner = "client!t", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class388.method2372(this, 0);
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(Ll;Lm;[IIIII)V")
    private final native void method3426(class261 arg0, class496 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "JA", descriptor = "(IILua;II)V")
    private final native void method3427(int arg0, int arg1, class591 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "xa", descriptor = "(III)V")
    public final native void method501(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "W", descriptor = "(FFFFFFLua;II)V")
    private final native void method3428(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class591 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "A", descriptor = "()I")
    public final native int method11();

    @OriginalMember(owner = "client!t", name = "l", descriptor = "(Ll;Lm;IIII)V")
    private final native void method3429(class261 arg0, class496 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "HA", descriptor = "(Ll;Lm;II)V")
    private final native void method3430(class261 arg0, class496 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "(IIII)V")
    public final native void method7(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "UA", descriptor = "(Z)V")
    public final native void method411(boolean arg0);

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;II)V")
    public class602(class261 arg0, class496 arg1, int arg2, int arg3) {
        this.method3430(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;[IIIII)V")
    public class602(class261 arg0, class496 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3426(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!t", name = "u", descriptor = "()I")
    public final native int method17();

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;IIII)V")
    public class602(class261 arg0, class496 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3429(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
