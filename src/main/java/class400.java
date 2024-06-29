import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class400 implements class294 {

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lw;")
    private class197 field6063;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lxa;")
    private class349 field6066;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Lxa;")
    private class349 field6070;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Lxa;")
    private class349 field6067;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Lxa;")
    private class349 field6069;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Lxa;")
    private class349 field6068;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Lxa;")
    private class349 field6062;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Lxa;")
    private class349 field6065;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lxa;")
    private class349 field6061;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Lxa;")
    private class349 field6064;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Lxa;")
    private class349 field6060;

    @OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Ljava/lang/Runnable;")
    public Runnable field6059;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "()V", line = 19)
    public final void method2489() {
        this.field6059 = null;
        this.method2490();
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "()V", line = 31)
    public final void method2493() {
        this.field6059 = Thread.currentThread();
        this.method2496();
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lxa;BIZ)Le;", line = 38)
    public final class374 method2495(class349 arg0, byte arg1, int arg2, boolean arg3) {
        class349 var5;
        class349 var6;
        if (arg1 == 1) {
            var5 = this.field6062;
            var6 = this.field6066;
        } else if (arg1 == 2) {
            var5 = this.field6065;
            var6 = this.field6070;
        } else if (arg1 == 3) {
            var5 = this.field6061;
            var6 = this.field6067;
        } else if (arg1 == 4) {
            var5 = this.field6064;
            var6 = this.field6069;
        } else if (arg1 == 5) {
            var5 = this.field6060;
            var6 = this.field6068;
        } else {
            var6 = var5 = new class349(this.field6063);
        }
        arg0.method2176(var6, var5, arg2, arg1 != 0, arg3);
        var6.field5184 = arg0.field5184;
        var6.field5181 = arg0.field5181;
        return var6;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lw;II)V", line = 85)
    public class400(class197 arg0, int arg1, int arg2) {
        this.field6063 = arg0;
        this.field6066 = new class349(this.field6063);
        this.field6070 = new class349(this.field6063);
        this.field6067 = new class349(this.field6063);
        this.field6069 = new class349(this.field6063);
        this.field6068 = new class349(this.field6063);
        this.field6062 = new class349(this.field6063);
        this.field6065 = new class349(this.field6063);
        this.field6061 = new class349(this.field6063);
        this.field6064 = new class349(this.field6063);
        this.field6060 = new class349(this.field6063);
        this.method2498(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V", line = 100)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class157.method1134((byte) 55, this);
        }
    }

    @OriginalMember(owner = "client!k", name = "W", descriptor = "(Lya;II)V")
    public final native void method2482(class38 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!k", name = "q", descriptor = "(Lza;IIIIIII)V")
    public final native void method2483(class288 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!k", name = "FA", descriptor = "(Lza;Le;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method2484(class288 arg0, class374 arg1, class124 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!k", name = "LA", descriptor = "(Le;Lc;[III)V")
    public final native void method2485(class374 arg0, class124 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "J", descriptor = "(Lza;[I[I[I[SI)V")
    public final native void method2486(class288 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "aa", descriptor = "(Lya;IIIIIII[[Z)V")
    public final native void method2487(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!k", name = "s", descriptor = "(Le;Le;IIIZ)V")
    public final native void method2488(class374 arg0, class374 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!k", name = "GA", descriptor = "()V")
    private final native void method2490();

    @OriginalMember(owner = "client!k", name = "ia", descriptor = "(Le;IILc;Z)Z")
    public final native boolean method2491(class374 arg0, int arg1, int arg2, class124 arg3, boolean arg4);

    @OriginalMember(owner = "client!k", name = "p", descriptor = "()V")
    public final native void method615();

    @OriginalMember(owner = "client!k", name = "D", descriptor = "(Lza;[Le;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method2492(class288 arg0, class374[] arg1, class124 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!k", name = "MA", descriptor = "(Le;Lc;[II)V")
    public final native void method2494(class374 arg0, class124 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "()V")
    private final native void method2496();

    @OriginalMember(owner = "client!k", name = "va", descriptor = "(Lza;[Le;Lc;[III)V")
    public final native void method2497(class288 arg0, class374[] arg1, class124 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "ya", descriptor = "(Lza;II)V")
    private final native void method2498(class288 arg0, int arg1, int arg2);
}
