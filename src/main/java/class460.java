import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class460 extends class702 implements class200 {

    @OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!va", name = "xa", descriptor = "(III)V", line = 8)
    public final void method939(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILua;II)V", line = 12)
    public final void method932(int arg0, int arg1, class618 arg2, int arg3, int arg4) {
        this.method2613(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V", line = 17)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class429.method2464(-9, this);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(FFFFFFILua;II)V", line = 22)
    public final void method1659(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class618 arg7, int arg8, int arg9) {
        this.method2615(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;II)V", line = 31)
    public class460(class18 arg0, class175 arg1, int arg2, int arg3) {
        this.method2616(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;[IIIII)V", line = 35)
    public class460(class18 arg0, class175 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2614(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ll;Lm;IIII)V", line = 44)
    public class460(class18 arg0, class175 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2612(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!va", name = "V", descriptor = "(IIIII)V")
    public final native void method935(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "W", descriptor = "(Ll;Lm;IIII)V")
    private final native void method2612(class18 arg0, class175 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "M", descriptor = "(IILua;II)V")
    private final native void method2613(int arg0, int arg1, class618 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "(IIII)V")
    public final native void method1663(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method1656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "FA", descriptor = "(Ll;Lm;[IIIII)V")
    private final native void method2614(class18 arg0, class175 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method1657(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!va", name = "A", descriptor = "()I")
    public final native int method1660();

    @OriginalMember(owner = "client!va", name = "wa", descriptor = "(FFFFFFLua;II)V")
    private final native void method2615(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class618 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!va", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "(Ll;Lm;II)V")
    private final native void method2616(class18 arg0, class175 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "ca", descriptor = "()I")
    public final native int method1661();

    @OriginalMember(owner = "client!va", name = "E", descriptor = "()I")
    public final native int method1658();

    @OriginalMember(owner = "client!va", name = "da", descriptor = "(IIIIII)V")
    public final native void method936(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "u", descriptor = "()I")
    public final native int method1653();

    @OriginalMember(owner = "client!va", name = "UA", descriptor = "(Z)V")
    public final native void method188(boolean arg0);
}
