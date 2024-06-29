import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class461 extends class702 implements class201 {

    @OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "(IILua;II)V")
    private final native void method2886(int arg0, int arg1, class617 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "W", descriptor = "(Ll;Lm;IIII)V")
    private final native void method2887(class18 arg0, class176 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "wa", descriptor = "(FFFFFFLua;II)V")
    private final native void method2888(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class617 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!va", name = "UA", descriptor = "(Z)V")
    public final native void method312(boolean arg0);

    @OriginalMember(owner = "client!va", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method1074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILua;II)V")
    public final void method1080(int arg0, int arg1, class617 arg2, int arg3, int arg4) {
        this.method2886(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "(Ll;Lm;II)V")
    private final native void method2889(class18 arg0, class176 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "FA", descriptor = "(Ll;Lm;[IIIII)V")
    private final native void method2890(class18 arg0, class176 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method1087(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "(IIII)V")
    public final native void method1085(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "E", descriptor = "()I")
    public final native int method1083();

    @OriginalMember(owner = "client!va", name = "da", descriptor = "(IIIIII)V")
    public final native void method1081(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "A", descriptor = "()I")
    public final native int method1076();

    @OriginalMember(owner = "client!va", name = "ca", descriptor = "()I")
    public final native int method1079();

    @OriginalMember(owner = "client!va", name = "u", descriptor = "()I")
    public final native int method1075();

    @OriginalMember(owner = "client!va", name = "V", descriptor = "(IIIII)V")
    public final native void method1086(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method1084(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method1088(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class617 arg7, int arg8, int arg9) {
        this.method2888(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class222.method1638(-1, this);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;II)V")
    public class461(class18 arg0, class176 arg1, int arg2, int arg3) {
        this.method2889(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;[IIIII)V")
    public class461(class18 arg0, class176 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2890(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;IIII)V")
    public class461(class18 arg0, class176 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2887(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!va", name = "xa", descriptor = "(III)V")
    public final void method1077(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }
}
