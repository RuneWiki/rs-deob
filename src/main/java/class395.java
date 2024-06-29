import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class395 extends class529 implements class276 {

    @OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(FFFFFFLea;II)V", line = 22)
    public final void method162(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8) {
        this.method2314(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V", line = 25)
    protected final void finalize() {
        class475.method2732(false, this);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lh;Lba;[IIIII)V", line = 27)
    public class395(class469 arg0, class262 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2316(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lh;Lba;IIII)V", line = 31)
    public class395(class469 arg0, class262 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2315(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILea;II)V", line = 35)
    public final void method157(int arg0, int arg1, class381 arg2, int arg3, int arg4) {
        this.method2317(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!k", name = "D", descriptor = "(IIIIIII)V")
    public final native void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "qa", descriptor = "()I")
    public final native int method161();

    @OriginalMember(owner = "client!k", name = "n", descriptor = "(FFFFFFLea;II)V")
    private final native void method2314(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!k", name = "O", descriptor = "(Lh;Lba;IIII)V")
    private final native void method2315(class469 arg0, class262 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "M", descriptor = "(IIIIIII)V")
    public final native void method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "W", descriptor = "(IIIIII)V")
    public final native void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "ya", descriptor = "()V")
    public final native void method109();

    @OriginalMember(owner = "client!k", name = "ka", descriptor = "(IIII)V")
    public final native void method152(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!k", name = "s", descriptor = "(Lh;Lba;[IIIII)V")
    private final native void method2316(class469 arg0, class262 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "JA", descriptor = "()I")
    public final native int method149();

    @OriginalMember(owner = "client!k", name = "aa", descriptor = "(FFFFFFIII)V")
    public final native void method160(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!k", name = "r", descriptor = "(IILea;II)V")
    private final native void method2317(int arg0, int arg1, class381 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "YA", descriptor = "(IIIII)V")
    public final native void method158(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "V", descriptor = "(III)V")
    public final native void method164(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!k", name = "UA", descriptor = "()I")
    public final native int method154();

    @OriginalMember(owner = "client!k", name = "ja", descriptor = "()I")
    public final native int method151();
}
