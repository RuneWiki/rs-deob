import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class271 extends class702 implements class200 {

    @OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!w", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "V", descriptor = "(IIIII)V")
    public final native void method935(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "u", descriptor = "()I")
    public final native int method1653();

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(Ll;Lm;[I[BIIII)V")
    private final native void method1654(class18 arg0, class175 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "U", descriptor = "(IILua;II)V")
    private final native void method1655(int arg0, int arg1, class618 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class429.method2464(-117, this);
        }
    }

    @OriginalMember(owner = "client!w", name = "xa", descriptor = "(III)V")
    public final void method939(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method1656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!w", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method1657(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(IIIIII)V")
    public final void method936(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "E", descriptor = "()I")
    public final native int method1658();

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILua;II)V")
    public final void method932(int arg0, int arg1, class618 arg2, int arg3, int arg4) {
        this.method1655(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "UA", descriptor = "(Z)V")
    public final native void method188(boolean arg0);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method1659(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class618 arg7, int arg8, int arg9) {
        this.method1662(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!w", name = "A", descriptor = "()I")
    public final native int method1660();

    @OriginalMember(owner = "client!w", name = "ca", descriptor = "()I")
    public final native int method1661();

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Ll;Lm;[I[BIIII)V")
    public class271(class18 arg0, class175 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1654(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!w", name = "aa", descriptor = "(FFFFFFLua;II)V")
    private final native void method1662(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class618 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "(IIII)V")
    public final native void method1663(int arg0, int arg1, int arg2, int arg3);
}
