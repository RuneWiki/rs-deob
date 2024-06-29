import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class272 extends class701 implements class199 {

    @OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class542.method3175(this, 0);
        }
    }

    @OriginalMember(owner = "client!w", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "u", descriptor = "()I")
    public final native int method900();

    @OriginalMember(owner = "client!w", name = "aa", descriptor = "(FFFFFFLua;II)V")
    private final native void method1631(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class616 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "xa", descriptor = "(III)V")
    public final void method4(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "U", descriptor = "(IILua;II)V")
    private final native void method1632(int arg0, int arg1, class616 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILua;II)V")
    public final void method6(int arg0, int arg1, class616 arg2, int arg3, int arg4) {
        this.method1632(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Ll;Lm;[I[BIIII)V")
    public class272(class18 arg0, class174 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1633(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method899(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class616 arg7, int arg8, int arg9) {
        this.method1631(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!w", name = "UA", descriptor = "(Z)V")
    public final native void method221(boolean arg0);

    @OriginalMember(owner = "client!w", name = "ca", descriptor = "()I")
    public final native int method901();

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(Ll;Lm;[I[BIIII)V")
    private final native void method1633(class18 arg0, class174 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "E", descriptor = "()I")
    public final native int method902();

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "(IIII)V")
    public final native void method894(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "A", descriptor = "()I")
    public final native int method896();

    @OriginalMember(owner = "client!w", name = "V", descriptor = "(IIIII)V")
    public final native void method3(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method898(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(IIIIII)V")
    public final void method5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method895(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);
}
