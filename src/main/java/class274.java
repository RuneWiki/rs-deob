import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class274 extends class702 implements class201 {

    @OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!w", name = "xa", descriptor = "(III)V", line = 6)
    public final void method1077(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class222.method1638(-1, this);
        }
    }

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(IIIIII)V", line = 18)
    public final void method1081(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(FFFFFFILua;II)V", line = 26)
    public final void method1088(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class617 arg7, int arg8, int arg9) {
        this.method1927(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILua;II)V", line = 32)
    public final void method1080(int arg0, int arg1, class617 arg2, int arg3, int arg4) {
        this.method1929(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Ll;Lm;[I[BIIII)V", line = 36)
    public class274(class18 arg0, class176 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1928(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!w", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method1084(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!w", name = "aa", descriptor = "(FFFFFFLua;II)V")
    private final native void method1927(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class617 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "u", descriptor = "()I")
    public final native int method1075();

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(Ll;Lm;[I[BIIII)V")
    private final native void method1928(class18 arg0, class176 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "E", descriptor = "()I")
    public final native int method1083();

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "(IIII)V")
    public final native void method1085(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "U", descriptor = "(IILua;II)V")
    private final native void method1929(int arg0, int arg1, class617 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "V", descriptor = "(IIIII)V")
    public final native void method1086(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method1074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method1087(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!w", name = "A", descriptor = "()I")
    public final native int method1076();

    @OriginalMember(owner = "client!w", name = "UA", descriptor = "(Z)V")
    public final native void method312(boolean arg0);

    @OriginalMember(owner = "client!w", name = "ca", descriptor = "()I")
    public final native int method1079();
}
