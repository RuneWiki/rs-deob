import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class497 implements class28 {

    @OriginalMember(owner = "client!v", name = "e", descriptor = "La;")
    private class530 field7060;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Lma;")
    private class12 field7059;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Lma;")
    private class12 field7063;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Lma;")
    private class12 field7058;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Lma;")
    private class12 field7061;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Lma;")
    private class12 field7057;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Lma;")
    private class12 field7062;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Lma;")
    private class12 field7065;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Lma;")
    private class12 field7066;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Lma;")
    private class12 field7067;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Lma;")
    private class12 field7064;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Ljava/lang/Runnable;")
    public Runnable field7056;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "(Lqa;[Lr;Lm;[II[I[I[I[S[BI[I)V")
    public final native void method2960(class208 arg0, class159[] arg1, class165 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!v", name = "k", descriptor = "(Lsa;II)V")
    public final native void method2961(class176 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "(Lsa;IIIIIII[[Z)V")
    public final native void method2962(class176 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!v", name = "m", descriptor = "(Lr;Lm;[III)V")
    public final native void method2963(class159 arg0, class165 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class292.method1797(78, this);
        }
    }

    @OriginalMember(owner = "client!v", name = "wa", descriptor = "(Lqa;[Lr;Lm;[III)V")
    public final native void method2964(class208 arg0, class159[] arg1, class165 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "O", descriptor = "(Lqa;[I[I[I[SI)V")
    public final native void method2965(class208 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "G", descriptor = "(Lqa;Lr;Lm;[II[I[I[I[S[BI[I)V")
    public final native void method2966(class208 arg0, class159 arg1, class165 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!v", name = "ka", descriptor = "(Lr;Lm;[II)V")
    public final native void method2967(class159 arg0, class165 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "FA", descriptor = "(Lqa;II)V")
    private final native void method2968(class208 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "NA", descriptor = "(Z)V")
    public final native void method63(boolean arg0);

    @OriginalMember(owner = "client!v", name = "na", descriptor = "()V")
    private final native void method2969();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lma;BIZ)Lr;")
    public final class159 method2970(class12 arg0, byte arg1, int arg2, boolean arg3) {
        class12 var5;
        class12 var6;
        if (arg1 == 1) {
            var5 = this.field7062;
            var6 = this.field7059;
        } else if (arg1 == 2) {
            var5 = this.field7065;
            var6 = this.field7063;
        } else if (arg1 == 3) {
            var5 = this.field7066;
            var6 = this.field7058;
        } else if (arg1 == 4) {
            var5 = this.field7067;
            var6 = this.field7061;
        } else if (arg1 == 5) {
            var5 = this.field7064;
            var6 = this.field7057;
        } else {
            var6 = var5 = new class12(this.field7060);
        }
        arg0.method65(var6, var5, arg2, arg1 != 0, arg3);
        var6.field113 = arg0.field113;
        var6.field114 = arg0.field114;
        return var6;
    }

    @OriginalMember(owner = "client!v", name = "da", descriptor = "(Lqa;IIIIIII)V")
    public final native void method2971(class208 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
    public final void method2972() {
        this.field7056 = Thread.currentThread();
        this.method2976();
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
    public final void method2973() {
        this.field7056 = null;
        this.method2969();
    }

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "(Lr;IILm;Z)Z")
    public final native boolean method2974(class159 arg0, int arg1, int arg2, class165 arg3, boolean arg4);

    @OriginalMember(owner = "client!v", name = "PA", descriptor = "(Lr;Lr;IIIZ)V")
    public final native void method2975(class159 arg0, class159 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!v", name = "u", descriptor = "()V")
    private final native void method2976();

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(La;II)V")
    public class497(class530 arg0, int arg1, int arg2) {
        this.field7060 = arg0;
        this.field7059 = new class12(this.field7060);
        this.field7063 = new class12(this.field7060);
        this.field7058 = new class12(this.field7060);
        this.field7061 = new class12(this.field7060);
        this.field7057 = new class12(this.field7060);
        this.field7062 = new class12(this.field7060);
        this.field7065 = new class12(this.field7060);
        this.field7066 = new class12(this.field7060);
        this.field7067 = new class12(this.field7060);
        this.field7064 = new class12(this.field7060);
        this.method2968(arg0, arg1, arg2);
    }
}
