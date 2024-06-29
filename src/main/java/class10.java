import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class10 implements class276 {

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lh;")
    private class468 field169;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Lp;")
    private class144 field165;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Lp;")
    private class144 field167;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lp;")
    private class144 field163;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lp;")
    private class144 field172;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Lp;")
    private class144 field174;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Lp;")
    private class144 field173;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Lp;")
    private class144 field168;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lp;")
    private class144 field164;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Lp;")
    private class144 field171;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lp;")
    private class144 field170;

    @OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Ljava/lang/Runnable;")
    public Runnable field166;

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        class284.method1787(-24204, this);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V", line = 22)
    public final void method79() {
        this.field166 = null;
        this.method74();
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()V", line = 28)
    public final void method80() {
        this.field166 = Thread.currentThread();
        this.method70();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lp;BIZ)Lc;", line = 35)
    public final class121 method81(class144 arg0, byte arg1, int arg2, boolean arg3) {
        class144 var5;
        class144 var6;
        if (arg1 == 1) {
            var5 = this.field173;
            var6 = this.field165;
        } else if (arg1 == 2) {
            var5 = this.field168;
            var6 = this.field167;
        } else if (arg1 == 3) {
            var5 = this.field164;
            var6 = this.field163;
        } else if (arg1 == 4) {
            var5 = this.field171;
            var6 = this.field172;
        } else if (arg1 == 5) {
            var5 = this.field170;
            var6 = this.field174;
        } else {
            var6 = var5 = new class144(this.field169);
        }
        arg0.method1038(var6, var5, arg2, arg1 != 0, arg3);
        var6.field2124 = arg0.field2124;
        var6.field2123 = arg0.field2123;
        return var6;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lh;II)V", line = 89)
    public class10(class468 arg0, int arg1, int arg2) {
        this.field169 = arg0;
        this.field165 = new class144(this.field169);
        this.field167 = new class144(this.field169);
        this.field163 = new class144(this.field169);
        this.field172 = new class144(this.field169);
        this.field174 = new class144(this.field169);
        this.field173 = new class144(this.field169);
        this.field168 = new class144(this.field169);
        this.field164 = new class144(this.field169);
        this.field171 = new class144(this.field169);
        this.field170 = new class144(this.field169);
        this.method84(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "(Lna;IIIIIII[[Z)V")
    public final native void method68(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!ma", name = "za", descriptor = "(Lqa;[Lc;Lia;[III)V")
    public final native void method69(class162 arg0, class121[] arg1, class413 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "()V")
    private final native void method70();

    @OriginalMember(owner = "client!ma", name = "sa", descriptor = "(Lqa;IIIIIII)V")
    public final native void method71(class162 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ma", name = "ka", descriptor = "(Lna;II)V")
    public final native void method72(class35 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "(Lc;Lc;IIIZ)V")
    public final native void method73(class121 arg0, class121 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "()V")
    private final native void method74();

    @OriginalMember(owner = "client!ma", name = "ya", descriptor = "()V")
    public final native void method75();

    @OriginalMember(owner = "client!ma", name = "pa", descriptor = "(Lqa;[Lc;Lia;[II[I[I[I[S[BI[I)V")
    public final native void method76(class162 arg0, class121[] arg1, class413 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(Lqa;Lc;Lia;[II[I[I[I[S[BI[I)V")
    public final native void method77(class162 arg0, class121 arg1, class413 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "(Lqa;[I[I[I[SI)V")
    public final native void method78(class162 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(Lc;Lia;[III)V")
    public final native void method82(class121 arg0, class413 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ma", name = "fa", descriptor = "(Lc;Lia;[II)V")
    public final native void method83(class121 arg0, class413 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "(Lqa;II)V")
    private final native void method84(class162 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "ua", descriptor = "(Lc;IILia;Z)Z")
    public final native boolean method85(class121 arg0, int arg1, int arg2, class413 arg3, boolean arg4);
}
