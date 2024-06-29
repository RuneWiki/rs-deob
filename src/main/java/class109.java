import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class109 extends class138 implements class242 {

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILta;II)V", line = 3)
    public final void method206(int arg0, int arg1, class448 arg2, int arg3, int arg4) {
        this.method784(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class248.method1686(false, this);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(FFFFFFLta;II)V", line = 18)
    public final void method211(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class448 arg6, int arg7, int arg8) {
        this.method782(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lw;Lg;[IIIII)V", line = 34)
    public class109(class454 arg0, class96 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method785(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lw;Lg;IIII)V", line = 38)
    public class109(class454 arg0, class96 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method783(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
    public final native int method200();

    @OriginalMember(owner = "client!v", name = "ha", descriptor = "(IIII)V")
    public final native void method209(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "XA", descriptor = "(IIIIII)V")
    public final native void method626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "HA", descriptor = "(FFFFFFLta;II)V")
    private final native void method782(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class448 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!v", name = "ZA", descriptor = "()I")
    public final native int method210();

    @OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
    public final native void method628(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "OA", descriptor = "(Lw;Lg;IIII)V")
    private final native void method783(class454 arg0, class96 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(IILta;II)V")
    private final native void method784(int arg0, int arg1, class448 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!v", name = "ya", descriptor = "(IIIIIII)V")
    public final native void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "p", descriptor = "()V")
    public final native void method224();

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "()I")
    public final native int method198();

    @OriginalMember(owner = "client!v", name = "la", descriptor = "(IIIIIII)V")
    public final native void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "W", descriptor = "(IIIII)V")
    public final native void method199(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!v", name = "ta", descriptor = "(Lw;Lg;[IIIII)V")
    private final native void method785(class454 arg0, class96 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "YA", descriptor = "()I")
    public final native int method204();

    @OriginalMember(owner = "client!v", name = "H", descriptor = "(FFFFFFIII)V")
    public final native void method201(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);
}
