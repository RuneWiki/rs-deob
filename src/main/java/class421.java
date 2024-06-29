import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class421 extends class52 implements class28 {

    @OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(FFFFFFLpa;II)V", line = 4)
    public final void method298(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class309 arg6, int arg7, int arg8) {
        this.method2388(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILpa;II)V", line = 12)
    public final void method7(int arg0, int arg1, class309 arg2, int arg3, int arg4) {
        this.method2389(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V", line = 26)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class49.method261(0, this);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(La;Lc;[IIIII)V", line = 34)
    public class421(class526 arg0, class158 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2387(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(La;Lc;IIII)V", line = 38)
    public class421(class526 arg0, class158 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2390(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!va", name = "BA", descriptor = "(III)V")
    public final native void method5(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(La;Lc;[IIIII)V")
    private final native void method2387(class526 arg0, class158 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "la", descriptor = "()I")
    public final native int method290();

    @OriginalMember(owner = "client!va", name = "c", descriptor = "()I")
    public final native int method291();

    @OriginalMember(owner = "client!va", name = "ma", descriptor = "()I")
    public final native int method286();

    @OriginalMember(owner = "client!va", name = "NA", descriptor = "(Z)V")
    public final native void method61(boolean arg0);

    @OriginalMember(owner = "client!va", name = "KA", descriptor = "(IIII)V")
    public final native void method297(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "v", descriptor = "(FFFFFFLpa;II)V")
    private final native void method2388(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class309 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!va", name = "CA", descriptor = "(FFFFFFIII)V")
    public final native void method285(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!va", name = "i", descriptor = "(IIIIIII)V")
    public final native void method296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "P", descriptor = "(IIIIII)V")
    public final native void method4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "ra", descriptor = "(IIIIIII)V")
    public final native void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "ea", descriptor = "(IILpa;II)V")
    private final native void method2389(int arg0, int arg1, class309 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "DA", descriptor = "(IIIII)V")
    public final native void method3(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(La;Lc;IIII)V")
    private final native void method2390(class526 arg0, class158 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "EA", descriptor = "()I")
    public final native int method292();
}
