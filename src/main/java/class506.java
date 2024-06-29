import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class506 extends class191 implements class47 {

    @OriginalMember(owner = "client!n", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILea;II)V", line = 13)
    public final void method30(int arg0, int arg1, class15 arg2, int arg3, int arg4) {
        this.method3020(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!n", name = "V", descriptor = "(III)V", line = 24)
    public final void method28(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lh;Lba;[IIIII)V", line = 30)
    public class506(class161 arg0, class79 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3023(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V", line = 34)
    protected final void finalize() {
        class342.method2198(this, (byte) -50);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lh;Lba;IIII)V", line = 36)
    public class506(class161 arg0, class79 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3021(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(FFFFFFLea;II)V", line = 41)
    public final void method213(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class15 arg6, int arg7, int arg8) {
        this.method3022(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!n", name = "M", descriptor = "(IIIIIII)V")
    public final native void method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!n", name = "ka", descriptor = "(IIII)V")
    public final native void method221(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!n", name = "na", descriptor = "(IILea;II)V")
    private final native void method3020(int arg0, int arg1, class15 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!n", name = "qa", descriptor = "()I")
    public final native int method214();

    @OriginalMember(owner = "client!n", name = "W", descriptor = "(IIIIII)V")
    public final native void method31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "UA", descriptor = "()I")
    public final native int method220();

    @OriginalMember(owner = "client!n", name = "ia", descriptor = "(Lh;Lba;IIII)V")
    private final native void method3021(class161 arg0, class79 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "aa", descriptor = "(FFFFFFIII)V")
    public final native void method217(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!n", name = "ja", descriptor = "()I")
    public final native int method209();

    @OriginalMember(owner = "client!n", name = "EA", descriptor = "(FFFFFFLea;II)V")
    private final native void method3022(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class15 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!n", name = "ya", descriptor = "()V")
    public final native void method218();

    @OriginalMember(owner = "client!n", name = "YA", descriptor = "(IIIII)V")
    public final native void method32(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!n", name = "JA", descriptor = "()I")
    public final native int method219();

    @OriginalMember(owner = "client!n", name = "w", descriptor = "(Lh;Lba;[IIIII)V")
    private final native void method3023(class161 arg0, class79 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!n", name = "D", descriptor = "(IIIIIII)V")
    public final native void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
