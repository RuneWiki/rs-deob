import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class396 extends class529 implements class276 {

    @OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "(IIIIII)V")
    public final native void method116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "aa", descriptor = "(FFFFFFIII)V")
    public final native void method123(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(FFFFFFLea;II)V")
    public final void method132(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class382 arg6, int arg7, int arg8) {
        this.method2268(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!k", name = "V", descriptor = "(III)V")
    public final native void method128(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!k", name = "ja", descriptor = "()I")
    public final native int method126();

    @OriginalMember(owner = "client!k", name = "JA", descriptor = "()I")
    public final native int method121();

    @OriginalMember(owner = "client!k", name = "s", descriptor = "(Lh;Lba;[IIIII)V")
    private final native void method2266(class470 arg0, class262 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "M", descriptor = "(IIIIIII)V")
    public final native void method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class390.method2237(true, this);
    }

    @OriginalMember(owner = "client!k", name = "ya", descriptor = "()V")
    public final native void method79();

    @OriginalMember(owner = "client!k", name = "O", descriptor = "(Lh;Lba;IIII)V")
    private final native void method2267(class470 arg0, class262 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "n", descriptor = "(FFFFFFLea;II)V")
    private final native void method2268(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class382 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!k", name = "D", descriptor = "(IIIIIII)V")
    public final native void method124(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "qa", descriptor = "()I")
    public final native int method129();

    @OriginalMember(owner = "client!k", name = "r", descriptor = "(IILea;II)V")
    private final native void method2269(int arg0, int arg1, class382 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "UA", descriptor = "()I")
    public final native int method125();

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILea;II)V")
    public final void method122(int arg0, int arg1, class382 arg2, int arg3, int arg4) {
        this.method2269(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lh;Lba;[IIIII)V")
    public class396(class470 arg0, class262 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2266(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!k", name = "YA", descriptor = "(IIIII)V")
    public final native void method130(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "ka", descriptor = "(IIII)V")
    public final native void method118(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lh;Lba;IIII)V")
    public class396(class470 arg0, class262 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2267(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
