import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class28 implements class400 {

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Lw;")
    private class459 field304;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Lxa;")
    private class395 field301;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Lxa;")
    private class395 field303;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Lxa;")
    private class395 field299;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Lxa;")
    private class395 field307;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lxa;")
    private class395 field300;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lxa;")
    private class395 field302;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Lxa;")
    private class395 field298;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Lxa;")
    private class395 field306;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lxa;")
    private class395 field305;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Lxa;")
    private class395 field308;

    @OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Ljava/lang/Runnable;")
    public Runnable field309;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "(Lya;II)V")
    public final native void method171(class223 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!k", name = "MA", descriptor = "(Le;Lc;[II)V")
    public final native void method172(class536 arg0, class205 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!k", name = "GA", descriptor = "()V")
    private final native void method173();

    @OriginalMember(owner = "client!k", name = "FA", descriptor = "(Lza;Le;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method174(class497 arg0, class536 arg1, class205 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!k", name = "p", descriptor = "()V")
    public final native void method175();

    @OriginalMember(owner = "client!k", name = "ya", descriptor = "(Lza;II)V")
    private final native void method176(class497 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!k", name = "q", descriptor = "(Lza;IIIIIII)V")
    public final native void method177(class497 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "()V")
    private final native void method178();

    @OriginalMember(owner = "client!k", name = "a", descriptor = "()V")
    public final void method179() {
        this.field309 = null;
        this.method173();
    }

    @OriginalMember(owner = "client!k", name = "J", descriptor = "(Lza;[I[I[I[SI)V")
    public final native void method180(class497 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "va", descriptor = "(Lza;[Le;Lc;[III)V")
    public final native void method181(class497 arg0, class536[] arg1, class205 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "LA", descriptor = "(Le;Lc;[III)V")
    public final native void method182(class536 arg0, class205 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "aa", descriptor = "(Lya;IIIIIII[[Z)V")
    public final native void method183(class223 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!k", name = "s", descriptor = "(Le;Le;IIIZ)V")
    public final native void method184(class536 arg0, class536 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lxa;BIZ)Le;")
    public final class536 method185(class395 arg0, byte arg1, int arg2, boolean arg3) {
        class395 var5;
        class395 var6;
        if (arg1 == 1) {
            var5 = this.field302;
            var6 = this.field301;
        } else if (arg1 == 2) {
            var5 = this.field298;
            var6 = this.field303;
        } else if (arg1 == 3) {
            var5 = this.field306;
            var6 = this.field299;
        } else if (arg1 == 4) {
            var5 = this.field305;
            var6 = this.field307;
        } else if (arg1 == 5) {
            var5 = this.field308;
            var6 = this.field300;
        } else {
            var6 = var5 = new class395(this.field304);
        }
        arg0.method2553(var6, var5, arg2, arg1 != 0, arg3);
        var6.field5986 = arg0.field5986;
        var6.field5988 = arg0.field5988;
        return var6;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "()V")
    public final void method186() {
        this.field309 = Thread.currentThread();
        this.method178();
    }

    @OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class431.method2721(this, false);
        }
    }

    @OriginalMember(owner = "client!k", name = "ia", descriptor = "(Le;IILc;Z)Z")
    public final native boolean method187(class536 arg0, int arg1, int arg2, class205 arg3, boolean arg4);

    @OriginalMember(owner = "client!k", name = "D", descriptor = "(Lza;[Le;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method188(class497 arg0, class536[] arg1, class205 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lw;II)V")
    public class28(class459 arg0, int arg1, int arg2) {
        this.field304 = arg0;
        this.field301 = new class395(this.field304);
        this.field303 = new class395(this.field304);
        this.field299 = new class395(this.field304);
        this.field307 = new class395(this.field304);
        this.field300 = new class395(this.field304);
        this.field302 = new class395(this.field304);
        this.field298 = new class395(this.field304);
        this.field306 = new class395(this.field304);
        this.field305 = new class395(this.field304);
        this.field308 = new class395(this.field304);
        this.method176(arg0, arg1, arg2);
    }
}
