import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class395 extends class528 implements class276 {

    @OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        class284.method1787(-24204, this);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(FFFFFFLea;II)V", line = 8)
    public final void method144(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8) {
        this.method2465(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILea;II)V", line = 26)
    public final void method138(int arg0, int arg1, class381 arg2, int arg3, int arg4) {
        this.method2464(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lh;Lba;[IIIII)V", line = 33)
    public class395(class468 arg0, class262 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2466(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lh;Lba;IIII)V", line = 36)
    public class395(class468 arg0, class262 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2467(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!k", name = "W", descriptor = "(IIIIII)V")
    public final native void method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "M", descriptor = "(IIIIIII)V")
    public final native void method136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "r", descriptor = "(IILea;II)V")
    private final native void method2464(int arg0, int arg1, class381 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "JA", descriptor = "()I")
    public final native int method131();

    @OriginalMember(owner = "client!k", name = "n", descriptor = "(FFFFFFLea;II)V")
    private final native void method2465(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!k", name = "YA", descriptor = "(IIIII)V")
    public final native void method133(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "s", descriptor = "(Lh;Lba;[IIIII)V")
    private final native void method2466(class468 arg0, class262 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "V", descriptor = "(III)V")
    public final native void method140(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!k", name = "qa", descriptor = "()I")
    public final native int method139();

    @OriginalMember(owner = "client!k", name = "ja", descriptor = "()I")
    public final native int method134();

    @OriginalMember(owner = "client!k", name = "O", descriptor = "(Lh;Lba;IIII)V")
    private final native void method2467(class468 arg0, class262 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "aa", descriptor = "(FFFFFFIII)V")
    public final native void method132(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!k", name = "ka", descriptor = "(IIII)V")
    public final native void method141(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!k", name = "ya", descriptor = "()V")
    public final native void method75();

    @OriginalMember(owner = "client!k", name = "D", descriptor = "(IIIIIII)V")
    public final native void method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "UA", descriptor = "()I")
    public final native int method137();
}
