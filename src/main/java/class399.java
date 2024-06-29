import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class399 implements class350 {

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Lw;")
    private class197 field5798;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lxa;")
    private class348 field5799;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Lxa;")
    private class348 field5805;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Lxa;")
    private class348 field5804;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Lxa;")
    private class348 field5800;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Lxa;")
    private class348 field5806;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lxa;")
    private class348 field5802;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Lxa;")
    private class348 field5795;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Lxa;")
    private class348 field5803;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Lxa;")
    private class348 field5796;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Lxa;")
    private class348 field5801;

    @OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Ljava/lang/Runnable;")
    public Runnable field5797;

    @OriginalMember(owner = "client!k", name = "LA", descriptor = "(Le;Lc;[III)V")
    public final native void method2456(class373 arg0, class124 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "()V")
    private final native void method2457();

    @OriginalMember(owner = "client!k", name = "GA", descriptor = "()V")
    private final native void method2458();

    @OriginalMember(owner = "client!k", name = "p", descriptor = "()V")
    public final native void method426();

    @OriginalMember(owner = "client!k", name = "W", descriptor = "(Lya;II)V")
    public final native void method2459(class38 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lxa;BIZ)Le;")
    public final class373 method2460(class348 arg0, byte arg1, int arg2, boolean arg3) {
        class348 var5;
        class348 var6;
        if (arg1 == 1) {
            var5 = this.field5802;
            var6 = this.field5799;
        } else if (arg1 == 2) {
            var5 = this.field5795;
            var6 = this.field5805;
        } else if (arg1 == 3) {
            var5 = this.field5803;
            var6 = this.field5804;
        } else if (arg1 == 4) {
            var5 = this.field5796;
            var6 = this.field5800;
        } else if (arg1 == 5) {
            var5 = this.field5801;
            var6 = this.field5806;
        } else {
            var6 = var5 = new class348(this.field5798);
        }
        arg0.method2031(var6, var5, arg2, arg1 != 0, arg3);
        var6.field4637 = arg0.field4637;
        var6.field4636 = arg0.field4636;
        return var6;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "()V")
    public final void method2461() {
        this.field5797 = null;
        this.method2458();
    }

    @OriginalMember(owner = "client!k", name = "ya", descriptor = "(Lza;II)V")
    private final native void method2462(class287 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!k", name = "ia", descriptor = "(Le;IILc;Z)Z")
    public final native boolean method2463(class373 arg0, int arg1, int arg2, class124 arg3, boolean arg4);

    @OriginalMember(owner = "client!k", name = "aa", descriptor = "(Lya;IIIIIII[[Z)V")
    public final native void method2464(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!k", name = "s", descriptor = "(Le;Le;IIIZ)V")
    public final native void method2465(class373 arg0, class373 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class269.method1636(this, true);
        }
    }

    @OriginalMember(owner = "client!k", name = "FA", descriptor = "(Lza;Le;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method2466(class287 arg0, class373 arg1, class124 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!k", name = "va", descriptor = "(Lza;[Le;Lc;[III)V")
    public final native void method2467(class287 arg0, class373[] arg1, class124 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "q", descriptor = "(Lza;IIIIIII)V")
    public final native void method2468(class287 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!k", name = "b", descriptor = "()V")
    public final void method2469() {
        this.field5797 = Thread.currentThread();
        this.method2457();
    }

    @OriginalMember(owner = "client!k", name = "MA", descriptor = "(Le;Lc;[II)V")
    public final native void method2470(class373 arg0, class124 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!k", name = "J", descriptor = "(Lza;[I[I[I[SI)V")
    public final native void method2471(class287 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lw;II)V")
    public class399(class197 arg0, int arg1, int arg2) {
        this.field5798 = arg0;
        this.field5799 = new class348(this.field5798);
        this.field5805 = new class348(this.field5798);
        this.field5804 = new class348(this.field5798);
        this.field5800 = new class348(this.field5798);
        this.field5806 = new class348(this.field5798);
        this.field5802 = new class348(this.field5798);
        this.field5795 = new class348(this.field5798);
        this.field5803 = new class348(this.field5798);
        this.field5796 = new class348(this.field5798);
        this.field5801 = new class348(this.field5798);
        this.method2462(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!k", name = "D", descriptor = "(Lza;[Le;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method2472(class287 arg0, class373[] arg1, class124 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);
}
