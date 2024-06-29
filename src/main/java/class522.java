import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class522 extends class536 implements class249 {

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "xa", descriptor = "(III)V")
    public final native void method158(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "u", descriptor = "()I")
    public final native int method162();

    @OriginalMember(owner = "client!t", name = "l", descriptor = "(Ll;Lm;IIII)V")
    private final native void method2847(class171 arg0, class108 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "ca", descriptor = "()I")
    public final native int method166();

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "(IIII)V")
    public final native void method161(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "HA", descriptor = "(Ll;Lm;II)V")
    private final native void method2848(class171 arg0, class108 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "A", descriptor = "()I")
    public final native int method160();

    @OriginalMember(owner = "client!t", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILua;II)V")
    public final void method153(int arg0, int arg1, class600 arg2, int arg3, int arg4) {
        this.method2850(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!t", name = "W", descriptor = "(FFFFFFLua;II)V")
    private final native void method2849(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class600 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class499.method2689(this, (byte) -66);
        }
    }

    @OriginalMember(owner = "client!t", name = "V", descriptor = "(IIIII)V")
    public final native void method155(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!t", name = "JA", descriptor = "(IILua;II)V")
    private final native void method2850(int arg0, int arg1, class600 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method163(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class600 arg7, int arg8, int arg9) {
        this.method2849(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!t", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method159(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!t", name = "da", descriptor = "(IIIIII)V")
    public final native void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;II)V")
    public class522(class171 arg0, class108 arg1, int arg2, int arg3) {
        this.method2848(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(Ll;Lm;[IIIII)V")
    private final native void method2851(class171 arg0, class108 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "E", descriptor = "()I")
    public final native int method167();

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;[IIIII)V")
    public class522(class171 arg0, class108 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2851(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!t", name = "UA", descriptor = "(Z)V")
    public final native void method548(boolean arg0);

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;IIII)V")
    public class522(class171 arg0, class108 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2847(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
