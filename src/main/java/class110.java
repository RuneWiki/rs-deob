import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class110 extends class139 implements class400 {

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "()V")
    public final native void method175();

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(IILta;II)V")
    private final native void method717(int arg0, int arg1, class453 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!v", name = "ha", descriptor = "(IIII)V")
    public final native void method627(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "HA", descriptor = "(FFFFFFLta;II)V")
    private final native void method718(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class453 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!v", name = "ZA", descriptor = "()I")
    public final native int method622();

    @OriginalMember(owner = "client!v", name = "OA", descriptor = "(Lw;Lg;IIII)V")
    private final native void method719(class459 arg0, class97 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "la", descriptor = "(IIIIIII)V")
    public final native void method619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "ta", descriptor = "(Lw;Lg;[IIIII)V")
    private final native void method720(class459 arg0, class97 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "H", descriptor = "(FFFFFFIII)V")
    public final native void method621(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!v", name = "W", descriptor = "(IIIII)V")
    public final native void method620(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!v", name = "ya", descriptor = "(IIIIIII)V")
    public final native void method630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "XA", descriptor = "(IIIIII)V")
    public final native void method631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class431.method2721(this, false);
        }
    }

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "()I")
    public final native int method618();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(FFFFFFLta;II)V")
    public final void method629(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class453 arg6, int arg7, int arg8) {
        this.method718(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lw;Lg;[IIIII)V")
    public class110(class459 arg0, class97 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method720(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
    public final native void method616(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILta;II)V")
    public final void method632(int arg0, int arg1, class453 arg2, int arg3, int arg4) {
        this.method717(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "YA", descriptor = "()I")
    public final native int method626();

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
    public final native int method623();

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lw;Lg;IIII)V")
    public class110(class459 arg0, class97 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method719(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
