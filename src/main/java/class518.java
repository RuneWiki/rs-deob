import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class518 extends class532 implements class247 {

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V", line = 8)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class69.method386(-1995, this);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(FFFFFFILua;II)V", line = 20)
    public final void method524(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class596 arg7, int arg8, int arg9) {
        this.method2939(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;II)V", line = 24)
    public class518(class168 arg0, class106 arg1, int arg2, int arg3) {
        this.method2937(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;[IIIII)V", line = 31)
    public class518(class168 arg0, class106 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2938(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;IIII)V", line = 36)
    public class518(class168 arg0, class106 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2935(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILua;II)V", line = 41)
    public final void method219(int arg0, int arg1, class596 arg2, int arg3, int arg4) {
        this.method2936(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!t", name = "ca", descriptor = "()I")
    public final native int method532();

    @OriginalMember(owner = "client!t", name = "xa", descriptor = "(III)V")
    public final native void method218(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "A", descriptor = "()I")
    public final native int method523();

    @OriginalMember(owner = "client!t", name = "da", descriptor = "(IIIIII)V")
    public final native void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "UA", descriptor = "(Z)V")
    public final native void method528(boolean arg0);

    @OriginalMember(owner = "client!t", name = "E", descriptor = "()I")
    public final native int method530();

    @OriginalMember(owner = "client!t", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method525(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!t", name = "l", descriptor = "(Ll;Lm;IIII)V")
    private final native void method2935(class168 arg0, class106 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "JA", descriptor = "(IILua;II)V")
    private final native void method2936(int arg0, int arg1, class596 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "HA", descriptor = "(Ll;Lm;II)V")
    private final native void method2937(class168 arg0, class106 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(Ll;Lm;[IIIII)V")
    private final native void method2938(class168 arg0, class106 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "(IIII)V")
    public final native void method527(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "V", descriptor = "(IIIII)V")
    public final native void method217(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "W", descriptor = "(FFFFFFLua;II)V")
    private final native void method2939(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class596 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "u", descriptor = "()I")
    public final native int method529();
}
