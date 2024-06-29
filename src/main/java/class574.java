import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class574 extends class52 implements class27 {

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "P", descriptor = "(IIIIII)V")
    public final native void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "i", descriptor = "(IIIIIII)V")
    public final native void method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(La;Lc;[IIIII)V")
    private final native void method3270(class530 arg0, class158 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "ra", descriptor = "(IIIIIII)V")
    public final native void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "ma", descriptor = "()I")
    public final native int method432();

    @OriginalMember(owner = "client!t", name = "NA", descriptor = "(Z)V")
    public final native void method134(boolean arg0);

    @OriginalMember(owner = "client!t", name = "DA", descriptor = "(IIIII)V")
    public final native void method421(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "CA", descriptor = "(FFFFFFIII)V")
    public final native void method424(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "la", descriptor = "()I")
    public final native int method422();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public final void method428(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class310 arg6, int arg7, int arg8) {
        this.method3273(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!t", name = "j", descriptor = "(IILpa;II)V")
    private final native void method3271(int arg0, int arg1, class310 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "va", descriptor = "(La;Lc;IIII)V")
    private final native void method3272(class530 arg0, class158 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()I")
    public final native int method429();

    @OriginalMember(owner = "client!t", name = "EA", descriptor = "()I")
    public final native int method419();

    @OriginalMember(owner = "client!t", name = "aa", descriptor = "(FFFFFFLpa;II)V")
    private final native void method3273(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class310 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "KA", descriptor = "(IIII)V")
    public final native void method420(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILpa;II)V")
    public final void method431(int arg0, int arg1, class310 arg2, int arg3, int arg4) {
        this.method3271(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class138.method926(this, -1);
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(La;Lc;[IIIII)V")
    public class574(class530 arg0, class158 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3270(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(La;Lc;IIII)V")
    public class574(class530 arg0, class158 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3272(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!t", name = "BA", descriptor = "(III)V")
    public final void method502(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }
}
