import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class444 extends class458 implements class142 {

    @OriginalMember(owner = "client!aa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public final void method421(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class213 arg6, int arg7, int arg8) {
        this.method2456(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "(Lda;La;IIII)V")
    private final native void method2455(class56 arg0, class564 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "(III)V")
    public final native void method414(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILfa;II)V")
    public final void method410(int arg0, int arg1, class213 arg2, int arg3, int arg4) {
        this.method2458(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "(IIIII)V")
    public final native void method416(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "QA", descriptor = "()I")
    public final native int method415();

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()I")
    public final native int method408();

    @OriginalMember(owner = "client!aa", name = "JA", descriptor = "(FFFFFFLfa;II)V")
    private final native void method2456(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class213 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aa", name = "KA", descriptor = "(IIIIIII)V")
    public final native void method413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "EA", descriptor = "(IIII)V")
    public final native void method409(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!aa", name = "sa", descriptor = "(FFFFFFIII)V")
    public final native void method419(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aa", name = "ba", descriptor = "(IIIIIII)V")
    public final native void method420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class409.method2220(this, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!aa", name = "WA", descriptor = "(Lda;La;[IIIII)V")
    private final native void method2457(class56 arg0, class564 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lda;La;[IIIII)V")
    public class444(class56 arg0, class564 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2457(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!aa", name = "va", descriptor = "(IILfa;II)V")
    private final native void method2458(int arg0, int arg1, class213 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "AA", descriptor = "()I")
    public final native int method418();

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "(Z)V")
    public final native void method59(boolean arg0);

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lda;La;IIII)V")
    public class444(class56 arg0, class564 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2455(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!aa", name = "GA", descriptor = "(IIIIII)V")
    public final native void method411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()I")
    public final native int method417();
}
