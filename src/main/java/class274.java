import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class274 extends class702 implements class201 {

    @OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "()I")
    public final native int method1784();

    @OriginalMember(owner = "client!w", name = "xa", descriptor = "(III)V")
    public final void method1746(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILua;II)V")
    public final void method1744(int arg0, int arg1, class619 arg2, int arg3, int arg4) {
        this.method1786(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "u", descriptor = "()I")
    public final native int method1785();

    @OriginalMember(owner = "client!w", name = "UA", descriptor = "(Z)V")
    public final native void method420(boolean arg0);

    @OriginalMember(owner = "client!w", name = "U", descriptor = "(IILua;II)V")
    private final native void method1786(int arg0, int arg1, class619 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method1740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "(IIII)V")
    public final native void method1787(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method1788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!w", name = "ca", descriptor = "()I")
    public final native int method1789();

    @OriginalMember(owner = "client!w", name = "V", descriptor = "(IIIII)V")
    public final native void method1743(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(IIIIII)V")
    public final void method1742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method1790(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!w", name = "aa", descriptor = "(FFFFFFLua;II)V")
    private final native void method1791(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class619 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "E", descriptor = "()I")
    public final native int method1792();

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Ll;Lm;[I[BIIII)V")
    public class274(class18 arg0, class176 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1793(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class541.method3123(14336, this);
        }
    }

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(Ll;Lm;[I[BIIII)V")
    private final native void method1793(class18 arg0, class176 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method1794(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class619 arg7, int arg8, int arg9) {
        this.method1791(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }
}
