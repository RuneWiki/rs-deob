import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class621 extends class702 implements class200 {

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILua;II)V", line = 5)
    public final void method932(int arg0, int arg1, class618 arg2, int arg3, int arg4) {
        this.method3452(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V", line = 20)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class429.method2464(-58, this);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(FFFFFFILua;II)V", line = 32)
    public final void method1659(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class618 arg7, int arg8, int arg9) {
        this.method3451(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;II)V", line = 34)
    public class621(class18 arg0, class175 arg1, int arg2, int arg3) {
        this.method3454(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;[IIIII)V", line = 37)
    public class621(class18 arg0, class175 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3453(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;IIII)V", line = 40)
    public class621(class18 arg0, class175 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3450(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!t", name = "E", descriptor = "()I")
    public final native int method1658();

    @OriginalMember(owner = "client!t", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method1656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "V", descriptor = "(IIIII)V")
    public final native void method935(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "l", descriptor = "(Ll;Lm;IIII)V")
    private final native void method3450(class18 arg0, class175 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method1657(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!t", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!t", name = "W", descriptor = "(FFFFFFLua;II)V")
    private final native void method3451(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class618 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "xa", descriptor = "(III)V")
    public final native void method939(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "da", descriptor = "(IIIIII)V")
    public final native void method936(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "JA", descriptor = "(IILua;II)V")
    private final native void method3452(int arg0, int arg1, class618 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "u", descriptor = "()I")
    public final native int method1653();

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "(IIII)V")
    public final native void method1663(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(Ll;Lm;[IIIII)V")
    private final native void method3453(class18 arg0, class175 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "UA", descriptor = "(Z)V")
    public final native void method188(boolean arg0);

    @OriginalMember(owner = "client!t", name = "ca", descriptor = "()I")
    public final native int method1661();

    @OriginalMember(owner = "client!t", name = "HA", descriptor = "(Ll;Lm;II)V")
    private final native void method3454(class18 arg0, class175 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "A", descriptor = "()I")
    public final native int method1660();
}
