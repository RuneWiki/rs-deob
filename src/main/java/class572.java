import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class572 extends class52 implements class28 {

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILpa;II)V", line = 6)
    public final void method7(int arg0, int arg1, class309 arg2, int arg3, int arg4) {
        this.method3331(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V", line = 12)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class49.method261(0, this);
        }
    }

    @OriginalMember(owner = "client!t", name = "BA", descriptor = "(III)V", line = 19)
    public final void method5(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(FFFFFFLpa;II)V", line = 29)
    public final void method298(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class309 arg6, int arg7, int arg8) {
        this.method3328(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(La;Lc;[IIIII)V", line = 37)
    public class572(class526 arg0, class158 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3329(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(La;Lc;IIII)V", line = 40)
    public class572(class526 arg0, class158 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3330(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!t", name = "aa", descriptor = "(FFFFFFLpa;II)V")
    private final native void method3328(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class309 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()I")
    public final native int method291();

    @OriginalMember(owner = "client!t", name = "NA", descriptor = "(Z)V")
    public final native void method61(boolean arg0);

    @OriginalMember(owner = "client!t", name = "ma", descriptor = "()I")
    public final native int method286();

    @OriginalMember(owner = "client!t", name = "la", descriptor = "()I")
    public final native int method290();

    @OriginalMember(owner = "client!t", name = "CA", descriptor = "(FFFFFFIII)V")
    public final native void method285(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "ra", descriptor = "(IIIIIII)V")
    public final native void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "EA", descriptor = "()I")
    public final native int method292();

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(La;Lc;[IIIII)V")
    private final native void method3329(class526 arg0, class158 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "KA", descriptor = "(IIII)V")
    public final native void method297(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "i", descriptor = "(IIIIIII)V")
    public final native void method296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "va", descriptor = "(La;Lc;IIII)V")
    private final native void method3330(class526 arg0, class158 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "DA", descriptor = "(IIIII)V")
    public final native void method3(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "j", descriptor = "(IILpa;II)V")
    private final native void method3331(int arg0, int arg1, class309 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "P", descriptor = "(IIIIII)V")
    public final native void method4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
