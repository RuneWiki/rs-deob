import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class67 implements class194 {

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Lw;")
    private class69 field959;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Lxa;")
    private class469 field964;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lxa;")
    private class469 field960;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Lxa;")
    private class469 field968;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lxa;")
    private class469 field965;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Lxa;")
    private class469 field966;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Lxa;")
    private class469 field969;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Lxa;")
    private class469 field967;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Lxa;")
    private class469 field963;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lxa;")
    private class469 field962;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Lxa;")
    private class469 field958;

    @OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Ljava/lang/Runnable;")
    public Runnable field961;

    @OriginalMember(owner = "client!k", name = "LA", descriptor = "(Le;Lc;[III)V")
    public final native void method433(class285 arg0, class512 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "aa", descriptor = "(Lya;IIIIIII[[Z)V")
    public final native void method434(class11 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!k", name = "ya", descriptor = "(Lza;II)V")
    private final native void method435(class295 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class260.method1547(-1, this);
        }
    }

    @OriginalMember(owner = "client!k", name = "W", descriptor = "(Lya;II)V")
    public final native void method436(class11 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!k", name = "J", descriptor = "(Lza;[I[I[I[SI)V")
    public final native void method437(class295 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "MA", descriptor = "(Le;Lc;[II)V")
    public final native void method438(class285 arg0, class512 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lxa;BIZ)Le;")
    public final class285 method439(class469 arg0, byte arg1, int arg2, boolean arg3) {
        class469 var5;
        class469 var6;
        if (arg1 == 1) {
            var5 = this.field969;
            var6 = this.field964;
        } else if (arg1 == 2) {
            var5 = this.field967;
            var6 = this.field960;
        } else if (arg1 == 3) {
            var5 = this.field963;
            var6 = this.field968;
        } else if (arg1 == 4) {
            var5 = this.field962;
            var6 = this.field965;
        } else if (arg1 == 5) {
            var5 = this.field958;
            var6 = this.field966;
        } else {
            var6 = var5 = new class469(this.field959);
        }
        arg0.method2725(var6, var5, arg2, arg1 != 0, arg3);
        var6.field6771 = arg0.field6771;
        var6.field6774 = arg0.field6774;
        return var6;
    }

    @OriginalMember(owner = "client!k", name = "va", descriptor = "(Lza;[Le;Lc;[III)V")
    public final native void method440(class295 arg0, class285[] arg1, class512 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "ia", descriptor = "(Le;IILc;Z)Z")
    public final native boolean method441(class285 arg0, int arg1, int arg2, class512 arg3, boolean arg4);

    @OriginalMember(owner = "client!k", name = "p", descriptor = "()V")
    public final native void method442();

    @OriginalMember(owner = "client!k", name = "GA", descriptor = "()V")
    private final native void method443();

    @OriginalMember(owner = "client!k", name = "q", descriptor = "(Lza;IIIIIII)V")
    public final native void method444(class295 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "()V")
    private final native void method445();

    @OriginalMember(owner = "client!k", name = "a", descriptor = "()V")
    public final void method446() {
        this.field961 = null;
        this.method443();
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "()V")
    public final void method447() {
        this.field961 = Thread.currentThread();
        this.method445();
    }

    @OriginalMember(owner = "client!k", name = "D", descriptor = "(Lza;[Le;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method448(class295 arg0, class285[] arg1, class512 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!k", name = "FA", descriptor = "(Lza;Le;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method449(class295 arg0, class285 arg1, class512 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!k", name = "s", descriptor = "(Le;Le;IIIZ)V")
    public final native void method450(class285 arg0, class285 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lw;II)V")
    public class67(class69 arg0, int arg1, int arg2) {
        this.field959 = arg0;
        this.field964 = new class469(this.field959);
        this.field960 = new class469(this.field959);
        this.field968 = new class469(this.field959);
        this.field965 = new class469(this.field959);
        this.field966 = new class469(this.field959);
        this.field969 = new class469(this.field959);
        this.field967 = new class469(this.field959);
        this.field963 = new class469(this.field959);
        this.field962 = new class469(this.field959);
        this.field958 = new class469(this.field959);
        this.method435(arg0, arg1, arg2);
    }
}
