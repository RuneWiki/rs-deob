import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class28 extends class191 implements class47 {

    @OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        class342.method2198(this, (byte) -50);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILea;II)V", line = 11)
    public final void method30(int arg0, int arg1, class15 arg2, int arg3, int arg4) {
        this.method216(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(FFFFFFLea;II)V", line = 17)
    public final void method213(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class15 arg6, int arg7, int arg8) {
        this.method211(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lh;Lba;[IIIII)V", line = 32)
    public class28(class161 arg0, class79 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method210(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lh;Lba;IIII)V", line = 35)
    public class28(class161 arg0, class79 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method215(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!k", name = "ja", descriptor = "()I")
    public final native int method209();

    @OriginalMember(owner = "client!k", name = "s", descriptor = "(Lh;Lba;[IIIII)V")
    private final native void method210(class161 arg0, class79 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "n", descriptor = "(FFFFFFLea;II)V")
    private final native void method211(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class15 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!k", name = "V", descriptor = "(III)V")
    public final native void method28(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!k", name = "D", descriptor = "(IIIIIII)V")
    public final native void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "W", descriptor = "(IIIIII)V")
    public final native void method31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "M", descriptor = "(IIIIIII)V")
    public final native void method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "qa", descriptor = "()I")
    public final native int method214();

    @OriginalMember(owner = "client!k", name = "O", descriptor = "(Lh;Lba;IIII)V")
    private final native void method215(class161 arg0, class79 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "r", descriptor = "(IILea;II)V")
    private final native void method216(int arg0, int arg1, class15 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "aa", descriptor = "(FFFFFFIII)V")
    public final native void method217(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!k", name = "ya", descriptor = "()V")
    public final native void method218();

    @OriginalMember(owner = "client!k", name = "JA", descriptor = "()I")
    public final native int method219();

    @OriginalMember(owner = "client!k", name = "UA", descriptor = "()I")
    public final native int method220();

    @OriginalMember(owner = "client!k", name = "YA", descriptor = "(IIIII)V")
    public final native void method32(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "ka", descriptor = "(IIII)V")
    public final native void method221(int arg0, int arg1, int arg2, int arg3);
}
