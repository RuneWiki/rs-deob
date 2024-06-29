import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class557 implements class439 {

    @OriginalMember(owner = "client!v", name = "f", descriptor = "La;")
    private class328 field7787;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Lma;")
    private class314 field7790;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Lma;")
    private class314 field7789;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Lma;")
    private class314 field7788;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Lma;")
    private class314 field7791;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Lma;")
    private class314 field7792;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Lma;")
    private class314 field7785;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Lma;")
    private class314 field7793;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Lma;")
    private class314 field7783;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lma;")
    private class314 field7786;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Lma;")
    private class314 field7782;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Ljava/lang/Runnable;")
    public Runnable field7784;

    @OriginalMember(owner = "client!v", name = "ka", descriptor = "(Lr;Lm;[II)V")
    public final native void method3119(class521 arg0, class105 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class243.method1506(this, 0);
        }
    }

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "(Lr;IILm;Z)Z")
    public final native boolean method3120(class521 arg0, int arg1, int arg2, class105 arg3, boolean arg4);

    @OriginalMember(owner = "client!v", name = "k", descriptor = "(Lsa;II)V")
    public final native void method3121(class544 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "wa", descriptor = "(Lqa;[Lr;Lm;[III)V")
    public final native void method3122(class167 arg0, class521[] arg1, class105 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "G", descriptor = "(Lqa;Lr;Lm;[II[I[I[I[S[BI[I)V")
    public final native void method3123(class167 arg0, class521 arg1, class105 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!v", name = "NA", descriptor = "(Z)V")
    public final native void method503(boolean arg0);

    @OriginalMember(owner = "client!v", name = "FA", descriptor = "(Lqa;II)V")
    private final native void method3124(class167 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "O", descriptor = "(Lqa;[I[I[I[SI)V")
    public final native void method3125(class167 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "PA", descriptor = "(Lr;Lr;IIIZ)V")
    public final native void method3126(class521 arg0, class521 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
    public final void method3127() {
        this.field7784 = null;
        this.method3128();
    }

    @OriginalMember(owner = "client!v", name = "na", descriptor = "()V")
    private final native void method3128();

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "(Lsa;IIIIIII[[Z)V")
    public final native void method3129(class544 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!v", name = "N", descriptor = "(Lqa;[Lr;Lm;[II[I[I[I[S[BI[I)V")
    public final native void method3130(class167 arg0, class521[] arg1, class105 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
    public final void method3131() {
        this.field7784 = Thread.currentThread();
        this.method3132();
    }

    @OriginalMember(owner = "client!v", name = "u", descriptor = "()V")
    private final native void method3132();

    @OriginalMember(owner = "client!v", name = "da", descriptor = "(Lqa;IIIIIII)V")
    public final native void method3133(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lma;BIZ)Lr;")
    public final class521 method3134(class314 arg0, byte arg1, int arg2, boolean arg3) {
        class314 var5;
        class314 var6;
        if (arg1 == 1) {
            var5 = this.field7785;
            var6 = this.field7790;
        } else if (arg1 == 2) {
            var5 = this.field7793;
            var6 = this.field7789;
        } else if (arg1 == 3) {
            var5 = this.field7783;
            var6 = this.field7788;
        } else if (arg1 == 4) {
            var5 = this.field7786;
            var6 = this.field7791;
        } else if (arg1 == 5) {
            var5 = this.field7782;
            var6 = this.field7792;
        } else {
            var6 = var5 = new class314(this.field7787);
        }
        arg0.method1970(var6, var5, arg2, arg1 != 0, arg3);
        var6.field4352 = arg0.field4352;
        var6.field4351 = arg0.field4351;
        return var6;
    }

    @OriginalMember(owner = "client!v", name = "m", descriptor = "(Lr;Lm;[III)V")
    public final native void method3135(class521 arg0, class105 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(La;II)V")
    public class557(class328 arg0, int arg1, int arg2) {
        this.field7787 = arg0;
        this.field7790 = new class314(this.field7787);
        this.field7789 = new class314(this.field7787);
        this.field7788 = new class314(this.field7787);
        this.field7791 = new class314(this.field7787);
        this.field7792 = new class314(this.field7787);
        this.field7785 = new class314(this.field7787);
        this.field7793 = new class314(this.field7787);
        this.field7783 = new class314(this.field7787);
        this.field7786 = new class314(this.field7787);
        this.field7782 = new class314(this.field7787);
        this.method3124(arg0, arg1, arg2);
    }
}
