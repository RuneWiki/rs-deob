import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class345 extends class528 implements class276 {

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!xa", name = "DA", descriptor = "(Lh;Lba;[I[BIIII)V")
    private final native void method2241(class468 arg0, class262 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!xa", name = "ya", descriptor = "()V")
    public final native void method75();

    @OriginalMember(owner = "client!xa", name = "WA", descriptor = "(FFFFFFLea;II)V")
    private final native void method2242(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!xa", name = "YA", descriptor = "(IIIII)V")
    public final native void method133(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!xa", name = "M", descriptor = "(IIIIIII)V")
    public final native void method136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "aa", descriptor = "(FFFFFFIII)V")
    public final native void method132(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFFFLea;II)V")
    public final void method144(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8) {
        this.method2242(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!xa", name = "FA", descriptor = "(IILea;II)V")
    private final native void method2243(int arg0, int arg1, class381 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!xa", name = "JA", descriptor = "()I")
    public final native int method131();

    @OriginalMember(owner = "client!xa", name = "ja", descriptor = "()I")
    public final native int method134();

    @OriginalMember(owner = "client!xa", name = "V", descriptor = "(III)V")
    public final void method140(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!xa", name = "ka", descriptor = "(IIII)V")
    public final native void method141(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILea;II)V")
    public final void method138(int arg0, int arg1, class381 arg2, int arg3, int arg4) {
        this.method2243(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!xa", name = "qa", descriptor = "()I")
    public final native int method139();

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lh;Lba;[I[BIIII)V")
    public class345(class468 arg0, class262 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2241(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class284.method1787(-24204, this);
    }

    @OriginalMember(owner = "client!xa", name = "W", descriptor = "(IIIIII)V")
    public final void method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!xa", name = "UA", descriptor = "()I")
    public final native int method137();

    @OriginalMember(owner = "client!xa", name = "D", descriptor = "(IIIIIII)V")
    public final native void method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
