import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class345 extends class529 implements class276 {

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFFFLea;II)V", line = 7)
    public final void method162(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8) {
        this.method2006(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!xa", name = "V", descriptor = "(III)V", line = 19)
    public final void method164(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V", line = 22)
    protected final void finalize() {
        class475.method2732(false, this);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILea;II)V", line = 25)
    public final void method157(int arg0, int arg1, class381 arg2, int arg3, int arg4) {
        this.method2005(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lh;Lba;[I[BIIII)V", line = 30)
    public class345(class469 arg0, class262 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2007(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!xa", name = "W", descriptor = "(IIIIII)V", line = 35)
    public final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!xa", name = "YA", descriptor = "(IIIII)V")
    public final native void method158(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!xa", name = "FA", descriptor = "(IILea;II)V")
    private final native void method2005(int arg0, int arg1, class381 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!xa", name = "ya", descriptor = "()V")
    public final native void method109();

    @OriginalMember(owner = "client!xa", name = "UA", descriptor = "()I")
    public final native int method154();

    @OriginalMember(owner = "client!xa", name = "WA", descriptor = "(FFFFFFLea;II)V")
    private final native void method2006(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!xa", name = "JA", descriptor = "()I")
    public final native int method149();

    @OriginalMember(owner = "client!xa", name = "aa", descriptor = "(FFFFFFIII)V")
    public final native void method160(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!xa", name = "M", descriptor = "(IIIIIII)V")
    public final native void method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "D", descriptor = "(IIIIIII)V")
    public final native void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "DA", descriptor = "(Lh;Lba;[I[BIIII)V")
    private final native void method2007(class469 arg0, class262 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!xa", name = "ja", descriptor = "()I")
    public final native int method151();

    @OriginalMember(owner = "client!xa", name = "qa", descriptor = "()I")
    public final native int method161();

    @OriginalMember(owner = "client!xa", name = "ka", descriptor = "(IIII)V")
    public final native void method152(int arg0, int arg1, int arg2, int arg3);
}
