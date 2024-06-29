import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class460 extends class359 implements class194 {

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "ta", descriptor = "(Lw;Lg;[IIIII)V")
    private final native void method2678(class69 arg0, class424 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class260.method1547(-1, this);
        }
    }

    @OriginalMember(owner = "client!v", name = "la", descriptor = "(IIIIIII)V")
    public final native void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "p", descriptor = "()V")
    public final native void method442();

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(IILta;II)V")
    private final native void method2679(int arg0, int arg1, class336 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "()I")
    public final native int method207();

    @OriginalMember(owner = "client!v", name = "HA", descriptor = "(FFFFFFLta;II)V")
    private final native void method2680(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class336 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!v", name = "YA", descriptor = "()I")
    public final native int method205();

    @OriginalMember(owner = "client!v", name = "XA", descriptor = "(IIIIII)V")
    public final native void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "W", descriptor = "(IIIII)V")
    public final native void method215(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!v", name = "ZA", descriptor = "()I")
    public final native int method200();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(FFFFFFLta;II)V")
    public final void method216(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class336 arg6, int arg7, int arg8) {
        this.method2680(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!v", name = "OA", descriptor = "(Lw;Lg;IIII)V")
    private final native void method2681(class69 arg0, class424 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "ya", descriptor = "(IIIIIII)V")
    public final native void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "ha", descriptor = "(IIII)V")
    public final native void method210(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
    public final native void method201(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILta;II)V")
    public final void method203(int arg0, int arg1, class336 arg2, int arg3, int arg4) {
        this.method2679(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "H", descriptor = "(FFFFFFIII)V")
    public final native void method209(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lw;Lg;[IIIII)V")
    public class460(class69 arg0, class424 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2678(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lw;Lg;IIII)V")
    public class460(class69 arg0, class424 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2681(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
    public final native int method204();
}
