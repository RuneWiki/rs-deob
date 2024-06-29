import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class497 implements class27 {

    @OriginalMember(owner = "client!v", name = "j", descriptor = "La;")
    private class530 field6948;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Lma;")
    private class12 field6942;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Lma;")
    private class12 field6941;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Lma;")
    private class12 field6947;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lma;")
    private class12 field6943;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Lma;")
    private class12 field6949;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Lma;")
    private class12 field6944;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Lma;")
    private class12 field6939;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Lma;")
    private class12 field6945;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Lma;")
    private class12 field6950;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Lma;")
    private class12 field6946;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Ljava/lang/Runnable;")
    public Runnable field6940;

    @OriginalMember(owner = "client!v", name = "FA", descriptor = "(Lqa;II)V")
    private final native void method2874(class207 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
    public final void method2875() {
        this.field6940 = null;
        this.method2882();
    }

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "(Lsa;IIIIIII[[Z)V")
    public final native void method2876(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
    public final void method2877() {
        this.field6940 = Thread.currentThread();
        this.method2879();
    }

    @OriginalMember(owner = "client!v", name = "m", descriptor = "(Lr;Lm;[III)V")
    public final native void method2878(class157 arg0, class163 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!v", name = "u", descriptor = "()V")
    private final native void method2879();

    @OriginalMember(owner = "client!v", name = "PA", descriptor = "(Lr;Lr;IIIZ)V")
    public final native void method2880(class157 arg0, class157 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!v", name = "O", descriptor = "(Lqa;[I[I[I[SI)V")
    public final native void method2881(class207 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "na", descriptor = "()V")
    private final native void method2882();

    @OriginalMember(owner = "client!v", name = "N", descriptor = "(Lqa;[Lr;Lm;[II[I[I[I[S[BI[I)V")
    public final native void method2883(class207 arg0, class157[] arg1, class163 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!v", name = "NA", descriptor = "(Z)V")
    public final native void method134(boolean arg0);

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "(Lr;IILm;Z)Z")
    public final native boolean method2884(class157 arg0, int arg1, int arg2, class163 arg3, boolean arg4);

    @OriginalMember(owner = "client!v", name = "G", descriptor = "(Lqa;Lr;Lm;[II[I[I[I[S[BI[I)V")
    public final native void method2885(class207 arg0, class157 arg1, class163 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class138.method926(this, -1);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lma;BIZ)Lr;")
    public final class157 method2886(class12 arg0, byte arg1, int arg2, boolean arg3) {
        class12 var5;
        class12 var6;
        if (arg1 == 1) {
            var5 = this.field6944;
            var6 = this.field6942;
        } else if (arg1 == 2) {
            var5 = this.field6939;
            var6 = this.field6941;
        } else if (arg1 == 3) {
            var5 = this.field6945;
            var6 = this.field6947;
        } else if (arg1 == 4) {
            var5 = this.field6950;
            var6 = this.field6943;
        } else if (arg1 == 5) {
            var5 = this.field6946;
            var6 = this.field6949;
        } else {
            var6 = var5 = new class12(this.field6948);
        }
        arg0.method144(var6, var5, arg2, arg1 != 0, arg3);
        var6.field182 = arg0.field182;
        var6.field185 = arg0.field185;
        return var6;
    }

    @OriginalMember(owner = "client!v", name = "da", descriptor = "(Lqa;IIIIIII)V")
    public final native void method2887(class207 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!v", name = "ka", descriptor = "(Lr;Lm;[II)V")
    public final native void method2888(class157 arg0, class163 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "k", descriptor = "(Lsa;II)V")
    public final native void method2889(class174 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "wa", descriptor = "(Lqa;[Lr;Lm;[III)V")
    public final native void method2890(class207 arg0, class157[] arg1, class163 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(La;II)V")
    public class497(class530 arg0, int arg1, int arg2) {
        this.field6948 = arg0;
        this.field6942 = new class12(this.field6948);
        this.field6941 = new class12(this.field6948);
        this.field6947 = new class12(this.field6948);
        this.field6943 = new class12(this.field6948);
        this.field6949 = new class12(this.field6948);
        this.field6944 = new class12(this.field6948);
        this.field6939 = new class12(this.field6948);
        this.field6945 = new class12(this.field6948);
        this.field6950 = new class12(this.field6948);
        this.field6946 = new class12(this.field6948);
        this.method2874(arg0, arg1, arg2);
    }
}
