import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class602 extends class256 implements class52 {

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILua;II)V", line = 6)
    public final void method51(int arg0, int arg1, class591 arg2, int arg3, int arg4) {
        this.method3421(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(FFFFFFILua;II)V", line = 10)
    public final void method60(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class591 arg7, int arg8, int arg9) {
        this.method3420(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V", line = 18)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2818(false, this);
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;II)V", line = 33)
    public class602(class260 arg0, class494 arg1, int arg2, int arg3) {
        this.method3424(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;[IIIII)V", line = 36)
    public class602(class260 arg0, class494 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3423(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;IIII)V", line = 39)
    public class602(class260 arg0, class494 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3422(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!t", name = "V", descriptor = "(IIIII)V")
    public final native void method49(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "W", descriptor = "(FFFFFFLua;II)V")
    private final native void method3420(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class591 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "ca", descriptor = "()I")
    public final native int method43();

    @OriginalMember(owner = "client!t", name = "JA", descriptor = "(IILua;II)V")
    private final native void method3421(int arg0, int arg1, class591 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "xa", descriptor = "(III)V")
    public final native void method55(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "A", descriptor = "()I")
    public final native int method50();

    @OriginalMember(owner = "client!t", name = "u", descriptor = "()I")
    public final native int method56();

    @OriginalMember(owner = "client!t", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method57(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!t", name = "l", descriptor = "(Ll;Lm;IIII)V")
    private final native void method3422(class260 arg0, class494 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "(IIII)V")
    public final native void method58(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "E", descriptor = "()I")
    public final native int method48();

    @OriginalMember(owner = "client!t", name = "da", descriptor = "(IIIIII)V")
    public final native void method44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(Ll;Lm;[IIIII)V")
    private final native void method3423(class260 arg0, class494 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "HA", descriptor = "(Ll;Lm;II)V")
    private final native void method3424(class260 arg0, class494 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "UA", descriptor = "(Z)V")
    public final native void method306(boolean arg0);
}
