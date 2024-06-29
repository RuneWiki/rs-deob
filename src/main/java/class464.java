import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class464 extends class702 implements class201 {

    @OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!va", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method1740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!va", name = "xa", descriptor = "(III)V")
    public final void method1746(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class541.method3123(14336, this);
        }
    }

    @OriginalMember(owner = "client!va", name = "W", descriptor = "(Ll;Lm;IIII)V")
    private final native void method2772(class18 arg0, class176 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "V", descriptor = "(IIIII)V")
    public final native void method1743(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method1790(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "(IIII)V")
    public final native void method1787(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method1794(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class619 arg7, int arg8, int arg9) {
        this.method2773(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILua;II)V")
    public final void method1744(int arg0, int arg1, class619 arg2, int arg3, int arg4) {
        this.method2775(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!va", name = "wa", descriptor = "(FFFFFFLua;II)V")
    private final native void method2773(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class619 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!va", name = "FA", descriptor = "(Ll;Lm;[IIIII)V")
    private final native void method2774(class18 arg0, class176 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "E", descriptor = "()I")
    public final native int method1792();

    @OriginalMember(owner = "client!va", name = "ca", descriptor = "()I")
    public final native int method1789();

    @OriginalMember(owner = "client!va", name = "A", descriptor = "()I")
    public final native int method1784();

    @OriginalMember(owner = "client!va", name = "M", descriptor = "(IILua;II)V")
    private final native void method2775(int arg0, int arg1, class619 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method1788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "UA", descriptor = "(Z)V")
    public final native void method420(boolean arg0);

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "(Ll;Lm;II)V")
    private final native void method2776(class18 arg0, class176 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "u", descriptor = "()I")
    public final native int method1785();

    @OriginalMember(owner = "client!va", name = "da", descriptor = "(IIIIII)V")
    public final native void method1742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;II)V")
    public class464(class18 arg0, class176 arg1, int arg2, int arg3) {
        this.method2776(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;[IIIII)V")
    public class464(class18 arg0, class176 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2774(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;IIII)V")
    public class464(class18 arg0, class176 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2772(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
