import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class404 implements class130 {

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lw;")
    private class199 field5726;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lxa;")
    private class352 field5721;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Lxa;")
    private class352 field5724;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Lxa;")
    private class352 field5720;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Lxa;")
    private class352 field5725;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Lxa;")
    private class352 field5722;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lxa;")
    private class352 field5723;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Lxa;")
    private class352 field5719;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Lxa;")
    private class352 field5728;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Lxa;")
    private class352 field5730;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Lxa;")
    private class352 field5727;

    @OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Ljava/lang/Runnable;")
    public Runnable field5729;

    @OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class512.method3054(75, this);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "()V", line = 9)
    public final void method2382() {
        this.field5729 = null;
        this.method2383();
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "()V", line = 14)
    public final void method2384() {
        this.field5729 = Thread.currentThread();
        this.method2386();
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lxa;BIZ)Le;", line = 33)
    public final class377 method2391(class352 arg0, byte arg1, int arg2, boolean arg3) {
        class352 var5;
        class352 var6;
        if (arg1 == 1) {
            var5 = this.field5723;
            var6 = this.field5721;
        } else if (arg1 == 2) {
            var5 = this.field5719;
            var6 = this.field5724;
        } else if (arg1 == 3) {
            var5 = this.field5728;
            var6 = this.field5720;
        } else if (arg1 == 4) {
            var5 = this.field5730;
            var6 = this.field5725;
        } else if (arg1 == 5) {
            var5 = this.field5727;
            var6 = this.field5722;
        } else {
            var6 = var5 = new class352(this.field5726);
        }
        arg0.method2087(var6, var5, arg2, arg1 != 0, arg3);
        var6.field5056 = arg0.field5056;
        var6.field5058 = arg0.field5058;
        return var6;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lw;II)V", line = 87)
    public class404(class199 arg0, int arg1, int arg2) {
        this.field5726 = arg0;
        this.field5721 = new class352(this.field5726);
        this.field5724 = new class352(this.field5726);
        this.field5720 = new class352(this.field5726);
        this.field5725 = new class352(this.field5726);
        this.field5722 = new class352(this.field5726);
        this.field5723 = new class352(this.field5726);
        this.field5719 = new class352(this.field5726);
        this.field5728 = new class352(this.field5726);
        this.field5730 = new class352(this.field5726);
        this.field5727 = new class352(this.field5726);
        this.method2393(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!k", name = "GA", descriptor = "()V")
    private final native void method2383();

    @OriginalMember(owner = "client!k", name = "W", descriptor = "(Lya;II)V")
    public final native void method2385(class38 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "()V")
    private final native void method2386();

    @OriginalMember(owner = "client!k", name = "FA", descriptor = "(Lza;Le;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method2387(class290 arg0, class377 arg1, class125 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!k", name = "D", descriptor = "(Lza;[Le;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method2388(class290 arg0, class377[] arg1, class125 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!k", name = "LA", descriptor = "(Le;Lc;[III)V")
    public final native void method2389(class377 arg0, class125 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "MA", descriptor = "(Le;Lc;[II)V")
    public final native void method2390(class377 arg0, class125 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!k", name = "aa", descriptor = "(Lya;IIIIIII[[Z)V")
    public final native void method2392(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!k", name = "ya", descriptor = "(Lza;II)V")
    private final native void method2393(class290 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!k", name = "J", descriptor = "(Lza;[I[I[I[SI)V")
    public final native void method2394(class290 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "q", descriptor = "(Lza;IIIIIII)V")
    public final native void method2395(class290 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!k", name = "va", descriptor = "(Lza;[Le;Lc;[III)V")
    public final native void method2396(class290 arg0, class377[] arg1, class125 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "ia", descriptor = "(Le;IILc;Z)Z")
    public final native boolean method2397(class377 arg0, int arg1, int arg2, class125 arg3, boolean arg4);

    @OriginalMember(owner = "client!k", name = "s", descriptor = "(Le;Le;IIIZ)V")
    public final native void method2398(class377 arg0, class377 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!k", name = "p", descriptor = "()V")
    public final native void method540();
}
