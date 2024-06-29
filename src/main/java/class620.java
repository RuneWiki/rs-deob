import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class620 extends class702 implements class198 {

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V", line = 19)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class509.method2924((byte) -106, this);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILua;II)V", line = 27)
    public final void method933(int arg0, int arg1, class617 arg2, int arg3, int arg4) {
        this.method3447(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(FFFFFFILua;II)V", line = 31)
    public final void method930(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class617 arg7, int arg8, int arg9) {
        this.method3450(arg0, arg1, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;II)V", line = 34)
    public class620(class18 arg0, class175 arg1, int arg2, int arg3) {
        this.method3451(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;[IIIII)V", line = 37)
    public class620(class18 arg0, class175 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3448(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ll;Lm;IIII)V", line = 40)
    public class620(class18 arg0, class175 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3449(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!t", name = "V", descriptor = "(IIIII)V")
    public final native void method929(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "da", descriptor = "(IIIIII)V")
    public final native void method942(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final native void method940(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!t", name = "YA", descriptor = "(IIIIIIII)V")
    public final native void method937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!t", name = "UA", descriptor = "(Z)V")
    public final native void method131(boolean arg0);

    @OriginalMember(owner = "client!t", name = "DA", descriptor = "(IIIIIII)V")
    public final native void method926(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "JA", descriptor = "(IILua;II)V")
    private final native void method3447(int arg0, int arg1, class617 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(Ll;Lm;[IIIII)V")
    private final native void method3448(class18 arg0, class175 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "(IIII)V")
    public final native void method935(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "xa", descriptor = "(III)V")
    public final native void method934(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "E", descriptor = "()I")
    public final native int method927();

    @OriginalMember(owner = "client!t", name = "l", descriptor = "(Ll;Lm;IIII)V")
    private final native void method3449(class18 arg0, class175 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "W", descriptor = "(FFFFFFLua;II)V")
    private final native void method3450(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class617 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "HA", descriptor = "(Ll;Lm;II)V")
    private final native void method3451(class18 arg0, class175 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "ca", descriptor = "()I")
    public final native int method936();

    @OriginalMember(owner = "client!t", name = "A", descriptor = "()I")
    public final native int method931();

    @OriginalMember(owner = "client!t", name = "u", descriptor = "()I")
    public final native int method939();
}
