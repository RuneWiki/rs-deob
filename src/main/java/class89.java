import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class89 extends class138 implements class242 {

    @OriginalMember(owner = "client!ca", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILta;II)V")
    public final void method206(int arg0, int arg1, class448 arg2, int arg3, int arg4) {
        this.method627(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "(FFFFFFIII)V")
    public final native void method201(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(Lw;Lg;[IIIII)V")
    private final native void method624(class454 arg0, class96 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "ya", descriptor = "(IIIIIII)V")
    public final native void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(FFFFFFLta;II)V")
    public final void method211(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class448 arg6, int arg7, int arg8) {
        this.method625(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ca", name = "W", descriptor = "(IIIII)V")
    public final native void method199(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ca", name = "RA", descriptor = "()I")
    public final native int method200();

    @OriginalMember(owner = "client!ca", name = "YA", descriptor = "()I")
    public final native int method204();

    @OriginalMember(owner = "client!ca", name = "ZA", descriptor = "()I")
    public final native int method210();

    @OriginalMember(owner = "client!ca", name = "la", descriptor = "(IIIIIII)V")
    public final native void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "()V")
    public final native void method224();

    @OriginalMember(owner = "client!ca", name = "LA", descriptor = "(FFFFFFLta;II)V")
    private final native void method625(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class448 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "()I")
    public final native int method198();

    @OriginalMember(owner = "client!ca", name = "XA", descriptor = "(IIIIII)V")
    public final native void method626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ca", name = "pa", descriptor = "(IILta;II)V")
    private final native void method627(int arg0, int arg1, class448 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lw;Lg;[IIIII)V")
    public class89(class454 arg0, class96 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method624(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ca", name = "ha", descriptor = "(IIII)V")
    public final native void method209(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class248.method1686(false, this);
        }
    }

    @OriginalMember(owner = "client!ca", name = "oa", descriptor = "(III)V")
    public final void method628(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ca", name = "ma", descriptor = "(Lw;Lg;IIII)V")
    private final native void method629(class454 arg0, class96 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lw;Lg;IIII)V")
    public class89(class454 arg0, class96 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method629(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
