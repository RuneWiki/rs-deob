import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class90 extends class139 implements class400 {

    @OriginalMember(owner = "client!ca", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "()V")
    public final native void method175();

    @OriginalMember(owner = "client!ca", name = "oa", descriptor = "(III)V")
    public final void method616(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(Lw;Lg;[IIIII)V")
    private final native void method617(class459 arg0, class97 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "()I")
    public final native int method618();

    @OriginalMember(owner = "client!ca", name = "la", descriptor = "(IIIIIII)V")
    public final native void method619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "W", descriptor = "(IIIII)V")
    public final native void method620(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "(FFFFFFIII)V")
    public final native void method621(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class431.method2721(this, false);
        }
    }

    @OriginalMember(owner = "client!ca", name = "ZA", descriptor = "()I")
    public final native int method622();

    @OriginalMember(owner = "client!ca", name = "RA", descriptor = "()I")
    public final native int method623();

    @OriginalMember(owner = "client!ca", name = "ma", descriptor = "(Lw;Lg;IIII)V")
    private final native void method624(class459 arg0, class97 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ca", name = "pa", descriptor = "(IILta;II)V")
    private final native void method625(int arg0, int arg1, class453 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ca", name = "YA", descriptor = "()I")
    public final native int method626();

    @OriginalMember(owner = "client!ca", name = "ha", descriptor = "(IIII)V")
    public final native void method627(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ca", name = "LA", descriptor = "(FFFFFFLta;II)V")
    private final native void method628(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class453 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(FFFFFFLta;II)V")
    public final void method629(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class453 arg6, int arg7, int arg8) {
        this.method628(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ca", name = "ya", descriptor = "(IIIIIII)V")
    public final native void method630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "XA", descriptor = "(IIIIII)V")
    public final native void method631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILta;II)V")
    public final void method632(int arg0, int arg1, class453 arg2, int arg3, int arg4) {
        this.method625(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lw;Lg;[IIIII)V")
    public class90(class459 arg0, class97 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method617(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lw;Lg;IIII)V")
    public class90(class459 arg0, class97 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method624(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
