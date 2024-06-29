import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class395 extends class529 implements class276 {

    @OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "(Lh;Lba;IIII)V")
    private final native void method2395(class469 arg0, class262 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "UA", descriptor = "()I")
    public final native int method108();

    @OriginalMember(owner = "client!k", name = "M", descriptor = "(IIIIIII)V")
    public final native void method106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(FFFFFFLea;II)V")
    public final void method95(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8) {
        this.method2396(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!k", name = "JA", descriptor = "()I")
    public final native int method100();

    @OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class236.method1601(-87, this);
    }

    @OriginalMember(owner = "client!k", name = "n", descriptor = "(FFFFFFLea;II)V")
    private final native void method2396(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILea;II)V")
    public final void method98(int arg0, int arg1, class381 arg2, int arg3, int arg4) {
        this.method2398(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!k", name = "s", descriptor = "(Lh;Lba;[IIIII)V")
    private final native void method2397(class469 arg0, class262 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "YA", descriptor = "(IIIII)V")
    public final native void method110(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "aa", descriptor = "(FFFFFFIII)V")
    public final native void method111(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!k", name = "qa", descriptor = "()I")
    public final native int method103();

    @OriginalMember(owner = "client!k", name = "D", descriptor = "(IIIIIII)V")
    public final native void method109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "W", descriptor = "(IIIIII)V")
    public final native void method102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "ja", descriptor = "()I")
    public final native int method105();

    @OriginalMember(owner = "client!k", name = "r", descriptor = "(IILea;II)V")
    private final native void method2398(int arg0, int arg1, class381 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "ya", descriptor = "()V")
    public final native void method60();

    @OriginalMember(owner = "client!k", name = "ka", descriptor = "(IIII)V")
    public final native void method96(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!k", name = "V", descriptor = "(III)V")
    public final native void method99(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lh;Lba;[IIIII)V")
    public class395(class469 arg0, class262 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2397(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lh;Lba;IIII)V")
    public class395(class469 arg0, class262 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2395(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
