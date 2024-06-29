import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class459 extends class702 implements class198 {

    @OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!va", name = "xa", descriptor = "(III)V", line = 4)
    public final void method934(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;II)V", line = 20)
    public class459(class18 arg0, class175 arg1, int arg2, int arg3) {
        this.method2696(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(FFFFFFILua;II)V", line = 29)
    public final void method930(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class617 arg7, int arg8, int arg9) {
        this.method2698(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;[IIIII)V", line = 31)
    public class459(class18 arg0, class175 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2699(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;IIII)V", line = 34)
    public class459(class18 arg0, class175 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2700(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILua;II)V", line = 39)
    public final void method933(int arg0, int arg1, class617 arg2, int arg3, int arg4) {
        this.method2697(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V", line = 43)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class509.method2924((byte) -106, this);
        }
    }

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "(Ll;Lm;II)V")
    private final native void method2696(class18 arg0, class175 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method926(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "V", descriptor = "(IIIII)V")
    public final native void method929(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!va", name = "ca", descriptor = "()I")
    public final native int method936();

    @OriginalMember(owner = "client!va", name = "UA", descriptor = "(Z)V")
    public final native void method131(boolean arg0);

    @OriginalMember(owner = "client!va", name = "M", descriptor = "(IILua;II)V")
    private final native void method2697(int arg0, int arg1, class617 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method940(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!va", name = "da", descriptor = "(IIIIII)V")
    public final native void method942(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "(IIII)V")
    public final native void method935(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "wa", descriptor = "(FFFFFFLua;II)V")
    private final native void method2698(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class617 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!va", name = "E", descriptor = "()I")
    public final native int method927();

    @OriginalMember(owner = "client!va", name = "u", descriptor = "()I")
    public final native int method939();

    @OriginalMember(owner = "client!va", name = "A", descriptor = "()I")
    public final native int method931();

    @OriginalMember(owner = "client!va", name = "FA", descriptor = "(Ll;Lm;[IIIII)V")
    private final native void method2699(class18 arg0, class175 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "W", descriptor = "(Ll;Lm;IIII)V")
    private final native void method2700(class18 arg0, class175 arg1, int arg2, int arg3, int arg4, int arg5);
}
