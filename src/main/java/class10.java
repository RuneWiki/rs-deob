import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class10 implements class276 {

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lh;")
    private class469 field227;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Lp;")
    private class144 field232;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lp;")
    private class144 field222;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Lp;")
    private class144 field225;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lp;")
    private class144 field228;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Lp;")
    private class144 field226;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Lp;")
    private class144 field224;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lp;")
    private class144 field221;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Lp;")
    private class144 field231;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lp;")
    private class144 field230;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Lp;")
    private class144 field223;

    @OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Ljava/lang/Runnable;")
    public Runnable field229;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V", line = 3)
    public final void method107() {
        this.field229 = null;
        this.method119();
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()V", line = 13)
    public final void method111() {
        this.field229 = Thread.currentThread();
        this.method124();
    }

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V", line = 22)
    protected final void finalize() {
        class475.method2732(false, this);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lp;BIZ)Lc;", line = 41)
    public final class121 method122(class144 arg0, byte arg1, int arg2, boolean arg3) {
        class144 var5;
        class144 var6;
        if (arg1 == 1) {
            var5 = this.field224;
            var6 = this.field232;
        } else if (arg1 == 2) {
            var5 = this.field221;
            var6 = this.field222;
        } else if (arg1 == 3) {
            var5 = this.field231;
            var6 = this.field225;
        } else if (arg1 == 4) {
            var5 = this.field230;
            var6 = this.field228;
        } else if (arg1 == 5) {
            var5 = this.field223;
            var6 = this.field226;
        } else {
            var6 = var5 = new class144(this.field227);
        }
        arg0.method1000(var6, var5, arg2, arg1 != 0, arg3);
        var6.field2056 = arg0.field2056;
        var6.field2059 = arg0.field2059;
        return var6;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lh;II)V", line = 89)
    public class10(class469 arg0, int arg1, int arg2) {
        this.field227 = arg0;
        this.field232 = new class144(this.field227);
        this.field222 = new class144(this.field227);
        this.field225 = new class144(this.field227);
        this.field228 = new class144(this.field227);
        this.field226 = new class144(this.field227);
        this.field224 = new class144(this.field227);
        this.field221 = new class144(this.field227);
        this.field231 = new class144(this.field227);
        this.field230 = new class144(this.field227);
        this.field223 = new class144(this.field227);
        this.method118(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ma", name = "ka", descriptor = "(Lna;II)V")
    public final native void method108(class35 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "ya", descriptor = "()V")
    public final native void method109();

    @OriginalMember(owner = "client!ma", name = "fa", descriptor = "(Lc;Lia;[II)V")
    public final native void method110(class121 arg0, class414 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(Lc;Lia;[III)V")
    public final native void method112(class121 arg0, class414 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(Lqa;Lc;Lia;[II[I[I[I[S[BI[I)V")
    public final native void method113(class162 arg0, class121 arg1, class414 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "(Lna;IIIIIII[[Z)V")
    public final native void method114(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!ma", name = "sa", descriptor = "(Lqa;IIIIIII)V")
    public final native void method115(class162 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "(Lqa;[I[I[I[SI)V")
    public final native void method116(class162 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "(Lc;Lc;IIIZ)V")
    public final native void method117(class121 arg0, class121 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "(Lqa;II)V")
    private final native void method118(class162 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "()V")
    private final native void method119();

    @OriginalMember(owner = "client!ma", name = "pa", descriptor = "(Lqa;[Lc;Lia;[II[I[I[I[S[BI[I)V")
    public final native void method120(class162 arg0, class121[] arg1, class414 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!ma", name = "ua", descriptor = "(Lc;IILia;Z)Z")
    public final native boolean method121(class121 arg0, int arg1, int arg2, class414 arg3, boolean arg4);

    @OriginalMember(owner = "client!ma", name = "za", descriptor = "(Lqa;[Lc;Lia;[III)V")
    public final native void method123(class162 arg0, class121[] arg1, class414 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "()V")
    private final native void method124();
}
