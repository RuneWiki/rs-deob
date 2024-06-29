import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class344 extends class529 implements class276 {

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!xa", name = "JA", descriptor = "()I")
    public final native int method104();

    @OriginalMember(owner = "client!xa", name = "aa", descriptor = "(FFFFFFIII)V")
    public final native void method106(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class379.method2355(4650, this);
    }

    @OriginalMember(owner = "client!xa", name = "D", descriptor = "(IIIIIII)V")
    public final native void method110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "ya", descriptor = "()V")
    public final native void method59();

    @OriginalMember(owner = "client!xa", name = "DA", descriptor = "(Lh;Lba;[I[BIIII)V")
    private final native void method2189(class469 arg0, class262 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!xa", name = "FA", descriptor = "(IILea;II)V")
    private final native void method2190(int arg0, int arg1, class381 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!xa", name = "ja", descriptor = "()I")
    public final native int method100();

    @OriginalMember(owner = "client!xa", name = "UA", descriptor = "()I")
    public final native int method96();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFFFLea;II)V")
    public final void method107(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8) {
        this.method2191(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!xa", name = "M", descriptor = "(IIIIIII)V")
    public final native void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILea;II)V")
    public final void method103(int arg0, int arg1, class381 arg2, int arg3, int arg4) {
        this.method2190(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!xa", name = "qa", descriptor = "()I")
    public final native int method109();

    @OriginalMember(owner = "client!xa", name = "W", descriptor = "(IIIIII)V")
    public final void method97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!xa", name = "WA", descriptor = "(FFFFFFLea;II)V")
    private final native void method2191(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!xa", name = "YA", descriptor = "(IIIII)V")
    public final native void method102(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lh;Lba;[I[BIIII)V")
    public class344(class469 arg0, class262 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2189(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!xa", name = "ka", descriptor = "(IIII)V")
    public final native void method99(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!xa", name = "V", descriptor = "(III)V")
    public final void method94(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }
}
