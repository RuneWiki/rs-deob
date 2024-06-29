import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class622 extends class702 implements class201 {

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "V", descriptor = "(IIIII)V")
    public final native void method1743(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method1740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!t", name = "W", descriptor = "(FFFFFFLua;II)V")
    private final native void method3546(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class619 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "HA", descriptor = "(Ll;Lm;II)V")
    private final native void method3547(class18 arg0, class176 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method1790(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!t", name = "E", descriptor = "()I")
    public final native int method1792();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILua;II)V")
    public final void method1744(int arg0, int arg1, class619 arg2, int arg3, int arg4) {
        this.method3548(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "(IIII)V")
    public final native void method1787(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "UA", descriptor = "(Z)V")
    public final native void method420(boolean arg0);

    @OriginalMember(owner = "client!t", name = "ca", descriptor = "()I")
    public final native int method1789();

    @OriginalMember(owner = "client!t", name = "A", descriptor = "()I")
    public final native int method1784();

    @OriginalMember(owner = "client!t", name = "JA", descriptor = "(IILua;II)V")
    private final native void method3548(int arg0, int arg1, class619 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "l", descriptor = "(Ll;Lm;IIII)V")
    private final native void method3549(class18 arg0, class176 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method1788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "u", descriptor = "()I")
    public final native int method1785();

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;II)V")
    public class622(class18 arg0, class176 arg1, int arg2, int arg3) {
        this.method3547(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;[IIIII)V")
    public class622(class18 arg0, class176 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3550(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class541.method3123(14336, this);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method1794(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class619 arg7, int arg8, int arg9) {
        this.method3546(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(Ll;Lm;[IIIII)V")
    private final native void method3550(class18 arg0, class176 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "xa", descriptor = "(III)V")
    public final native void method1746(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;IIII)V")
    public class622(class18 arg0, class176 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3549(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!t", name = "da", descriptor = "(IIIIII)V")
    public final native void method1742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
