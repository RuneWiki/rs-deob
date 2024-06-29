import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class387 extends class191 implements class47 {

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!xa", name = "W", descriptor = "(IIIIII)V")
    public final void method31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!xa", name = "YA", descriptor = "(IIIII)V")
    public final native void method32(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!xa", name = "DA", descriptor = "(Lh;Lba;[I[BIIII)V")
    private final native void method2388(class161 arg0, class79 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!xa", name = "ka", descriptor = "(IIII)V")
    public final native void method221(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class342.method2198(this, (byte) -50);
    }

    @OriginalMember(owner = "client!xa", name = "ya", descriptor = "()V")
    public final native void method218();

    @OriginalMember(owner = "client!xa", name = "M", descriptor = "(IIIIIII)V")
    public final native void method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "aa", descriptor = "(FFFFFFIII)V")
    public final native void method217(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!xa", name = "WA", descriptor = "(FFFFFFLea;II)V")
    private final native void method2389(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class15 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!xa", name = "qa", descriptor = "()I")
    public final native int method214();

    @OriginalMember(owner = "client!xa", name = "JA", descriptor = "()I")
    public final native int method219();

    @OriginalMember(owner = "client!xa", name = "UA", descriptor = "()I")
    public final native int method220();

    @OriginalMember(owner = "client!xa", name = "V", descriptor = "(III)V")
    public final void method28(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!xa", name = "D", descriptor = "(IIIIIII)V")
    public final native void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "FA", descriptor = "(IILea;II)V")
    private final native void method2390(int arg0, int arg1, class15 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILea;II)V")
    public final void method30(int arg0, int arg1, class15 arg2, int arg3, int arg4) {
        this.method2390(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!xa", name = "ja", descriptor = "()I")
    public final native int method209();

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lh;Lba;[I[BIIII)V")
    public class387(class161 arg0, class79 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2388(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFFFLea;II)V")
    public final void method213(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class15 arg6, int arg7, int arg8) {
        this.method2389(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }
}
