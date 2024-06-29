import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class443 implements class416 {

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lc;")
    private class125 field6317;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Lfa;")
    private class160 field6313;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Lfa;")
    private class160 field6318;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Lfa;")
    private class160 field6312;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lfa;")
    private class160 field6309;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lfa;")
    private class160 field6311;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Lfa;")
    private class160 field6319;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Lfa;")
    private class160 field6316;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "Lfa;")
    private class160 field6320;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Lfa;")
    private class160 field6315;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Lfa;")
    private class160 field6314;

    @OriginalMember(owner = "client!wa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Ljava/lang/Runnable;")
    public Runnable field6310;

    @OriginalMember(owner = "client!wa", name = "FA", descriptor = "(Lqa;Lka;Ln;[II[I[I[I[S[BI[I)V")
    public final native void method2606(class167 arg0, class336 arg1, class15 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()V")
    public final void method2607() {
        this.field6310 = Thread.currentThread();
        this.method2616();
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lfa;BIZ)Lka;")
    public final class336 method2608(class160 arg0, byte arg1, int arg2, boolean arg3) {
        class160 var5;
        class160 var6;
        if (arg1 == 1) {
            var5 = this.field6319;
            var6 = this.field6313;
        } else if (arg1 == 2) {
            var5 = this.field6316;
            var6 = this.field6318;
        } else if (arg1 == 3) {
            var5 = this.field6320;
            var6 = this.field6312;
        } else if (arg1 == 4) {
            var5 = this.field6315;
            var6 = this.field6309;
        } else if (arg1 == 5) {
            var5 = this.field6314;
            var6 = this.field6311;
        } else {
            var6 = var5 = new class160(this.field6317);
        }
        arg0.method1161(var6, var5, arg2, arg1 != 0, arg3);
        var6.field2452 = arg0.field2452;
        var6.field2450 = arg0.field2450;
        return var6;
    }

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "()V")
    private final native void method2609();

    @OriginalMember(owner = "client!wa", name = "ha", descriptor = "(Lqa;[I[I[I[SI)V")
    public final native void method2610(class167 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "(Lka;Lka;IIIZ)V")
    public final native void method2611(class336 arg0, class336 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "(Lqa;II)V")
    private final native void method2612(class167 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "(Lqa;[Lka;Ln;[III)V")
    public final native void method2613(class167 arg0, class336[] arg1, class15 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "(Lo;IIIIIII[[Z)V")
    public final native void method2614(class24 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "(Lqa;IIIIIII)V")
    public final native void method2615(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!wa", name = "pa", descriptor = "()V")
    public final native void method382();

    @OriginalMember(owner = "client!wa", name = "na", descriptor = "()V")
    private final native void method2616();

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "(Lka;IILn;Z)Z")
    public final native boolean method2617(class336 arg0, int arg1, int arg2, class15 arg3, boolean arg4);

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "(Lka;Ln;[III)V")
    public final native void method2618(class336 arg0, class15 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lqa;[Lka;Ln;[II[I[I[I[S[BI[I)V")
    public final native void method2619(class167 arg0, class336[] arg1, class15 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!wa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2895(this, false);
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "()V")
    public final void method2620() {
        this.field6310 = null;
        this.method2609();
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lc;II)V")
    public class443(class125 arg0, int arg1, int arg2) {
        this.field6317 = arg0;
        this.field6313 = new class160(this.field6317);
        this.field6318 = new class160(this.field6317);
        this.field6312 = new class160(this.field6317);
        this.field6309 = new class160(this.field6317);
        this.field6311 = new class160(this.field6317);
        this.field6319 = new class160(this.field6317);
        this.field6316 = new class160(this.field6317);
        this.field6320 = new class160(this.field6317);
        this.field6315 = new class160(this.field6317);
        this.field6314 = new class160(this.field6317);
        this.method2612(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wa", name = "ka", descriptor = "(Lo;II)V")
    public final native void method2621(class24 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "VA", descriptor = "(Lka;Ln;[II)V")
    public final native void method2622(class336 arg0, class15 arg1, int[] arg2, int arg3);
}
