import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class28 implements class242 {

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Lw;")
    private class454 field451;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Lxa;")
    private class390 field457;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lxa;")
    private class390 field452;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Lxa;")
    private class390 field456;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Lxa;")
    private class390 field449;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Lxa;")
    private class390 field448;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Lxa;")
    private class390 field453;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Lxa;")
    private class390 field458;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lxa;")
    private class390 field450;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Lxa;")
    private class390 field454;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lxa;")
    private class390 field455;

    @OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Ljava/lang/Runnable;")
    public Runnable field459;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "()V", line = 3)
    public final void method212() {
        this.field459 = null;
        this.method221();
    }

    @OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V", line = 11)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class248.method1686(false, this);
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "()V", line = 16)
    public final void method215() {
        this.field459 = Thread.currentThread();
        this.method227();
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lw;II)V", line = 39)
    public class28(class454 arg0, int arg1, int arg2) {
        this.field451 = arg0;
        this.field457 = new class390(this.field451);
        this.field452 = new class390(this.field451);
        this.field456 = new class390(this.field451);
        this.field449 = new class390(this.field451);
        this.field448 = new class390(this.field451);
        this.field453 = new class390(this.field451);
        this.field458 = new class390(this.field451);
        this.field450 = new class390(this.field451);
        this.field454 = new class390(this.field451);
        this.field455 = new class390(this.field451);
        this.method217(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lxa;BIZ)Le;", line = 59)
    public final class530 method226(class390 arg0, byte arg1, int arg2, boolean arg3) {
        class390 var5;
        class390 var6;
        if (arg1 == 1) {
            var5 = this.field453;
            var6 = this.field457;
        } else if (arg1 == 2) {
            var5 = this.field458;
            var6 = this.field452;
        } else if (arg1 == 3) {
            var5 = this.field450;
            var6 = this.field456;
        } else if (arg1 == 4) {
            var5 = this.field454;
            var6 = this.field449;
        } else if (arg1 == 5) {
            var5 = this.field455;
            var6 = this.field448;
        } else {
            var6 = var5 = new class390(this.field451);
        }
        arg0.method2438(var6, var5, arg2, arg1 != 0, arg3);
        var6.field5978 = arg0.field5978;
        var6.field5977 = arg0.field5977;
        return var6;
    }

    @OriginalMember(owner = "client!k", name = "ia", descriptor = "(Le;IILc;Z)Z")
    public final native boolean method213(class530 arg0, int arg1, int arg2, class202 arg3, boolean arg4);

    @OriginalMember(owner = "client!k", name = "D", descriptor = "(Lza;[Le;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method214(class491 arg0, class530[] arg1, class202 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!k", name = "va", descriptor = "(Lza;[Le;Lc;[III)V")
    public final native void method216(class491 arg0, class530[] arg1, class202 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "ya", descriptor = "(Lza;II)V")
    private final native void method217(class491 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!k", name = "W", descriptor = "(Lya;II)V")
    public final native void method218(class220 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!k", name = "MA", descriptor = "(Le;Lc;[II)V")
    public final native void method219(class530 arg0, class202 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!k", name = "LA", descriptor = "(Le;Lc;[III)V")
    public final native void method220(class530 arg0, class202 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "GA", descriptor = "()V")
    private final native void method221();

    @OriginalMember(owner = "client!k", name = "s", descriptor = "(Le;Le;IIIZ)V")
    public final native void method222(class530 arg0, class530 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!k", name = "q", descriptor = "(Lza;IIIIIII)V")
    public final native void method223(class491 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!k", name = "p", descriptor = "()V")
    public final native void method224();

    @OriginalMember(owner = "client!k", name = "aa", descriptor = "(Lya;IIIIIII[[Z)V")
    public final native void method225(class220 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "()V")
    private final native void method227();

    @OriginalMember(owner = "client!k", name = "J", descriptor = "(Lza;[I[I[I[SI)V")
    public final native void method228(class491 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "FA", descriptor = "(Lza;Le;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method229(class491 arg0, class530 arg1, class202 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);
}
