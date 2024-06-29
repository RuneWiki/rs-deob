import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class114 extends class138 implements class242 {

    @OriginalMember(owner = "client!q", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(IIIIII)V", line = 5)
    public final void method626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(FFFFFFLta;II)V", line = 8)
    public final void method211(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class448 arg6, int arg7, int arg8) {
        this.method919(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(III)V", line = 14)
    public final void method628(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILta;II)V", line = 21)
    public final void method206(int arg0, int arg1, class448 arg2, int arg3, int arg4) {
        this.method917(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V", line = 24)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class248.method1686(false, this);
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lw;Lg;[I[BIIII)V", line = 34)
    public class114(class454 arg0, class96 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method918(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!q", name = "ha", descriptor = "(IIII)V")
    public final native void method209(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!q", name = "RA", descriptor = "()I")
    public final native int method200();

    @OriginalMember(owner = "client!q", name = "ya", descriptor = "(IIIIIII)V")
    public final native void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!q", name = "W", descriptor = "(IIIII)V")
    public final native void method199(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!q", name = "YA", descriptor = "()I")
    public final native int method204();

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(IILta;II)V")
    private final native void method917(int arg0, int arg1, class448 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!q", name = "DA", descriptor = "(Lw;Lg;[I[BIIII)V")
    private final native void method918(class454 arg0, class96 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!q", name = "H", descriptor = "(FFFFFFIII)V")
    public final native void method201(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!q", name = "ZA", descriptor = "()I")
    public final native int method210();

    @OriginalMember(owner = "client!q", name = "la", descriptor = "(IIIIIII)V")
    public final native void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "()I")
    public final native int method198();

    @OriginalMember(owner = "client!q", name = "p", descriptor = "()V")
    public final native void method224();

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "(FFFFFFLta;II)V")
    private final native void method919(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class448 arg6, int arg7, int arg8);
}
