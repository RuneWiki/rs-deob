import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class247 implements class241 {

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Lh;")
    private class373 field3163;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Lp;")
    private class184 field3157;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Lp;")
    private class184 field3158;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lp;")
    private class184 field3155;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lp;")
    private class184 field3161;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lp;")
    private class184 field3164;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lp;")
    private class184 field3156;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Lp;")
    private class184 field3165;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lp;")
    private class184 field3162;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Lp;")
    private class184 field3160;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Lp;")
    private class184 field3159;

    @OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Ljava/lang/Runnable;")
    public Runnable field3166;

    @OriginalMember(owner = "client!ma", name = "sa", descriptor = "(Lqa;IIIIIII)V")
    public final native void method1537(class129 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ma", name = "ya", descriptor = "()V")
    public final native void method373();

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
    public final void method1538() {
        this.field3166 = null;
        this.method1541();
    }

    @OriginalMember(owner = "client!ma", name = "pa", descriptor = "(Lqa;[Lc;Lia;[II[I[I[I[S[BI[I)V")
    public final native void method1539(class129 arg0, class507[] arg1, class142 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "(Lqa;II)V")
    private final native void method1540(class129 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "()V")
    private final native void method1541();

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(Lqa;Lc;Lia;[II[I[I[I[S[BI[I)V")
    public final native void method1542(class129 arg0, class507 arg1, class142 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "()V")
    private final native void method1543();

    @OriginalMember(owner = "client!ma", name = "ua", descriptor = "(Lc;IILia;Z)Z")
    public final native boolean method1544(class507 arg0, int arg1, int arg2, class142 arg3, boolean arg4);

    @OriginalMember(owner = "client!ma", name = "fa", descriptor = "(Lc;Lia;[II)V")
    public final native void method1545(class507 arg0, class142 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class313.method1863(this, 104);
    }

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "(Lqa;[I[I[I[SI)V")
    public final native void method1546(class129 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(Lc;Lia;[III)V")
    public final native void method1547(class507 arg0, class142 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ma", name = "ka", descriptor = "(Lna;II)V")
    public final native void method1548(class251 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "(Lc;Lc;IIIZ)V")
    public final native void method1549(class507 arg0, class507 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "(Lna;IIIIIII[[Z)V")
    public final native void method1550(class251 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()V")
    public final void method1551() {
        this.field3166 = Thread.currentThread();
        this.method1543();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lp;BIZ)Lc;")
    public final class507 method1552(class184 arg0, byte arg1, int arg2, boolean arg3) {
        class184 var5;
        class184 var6;
        if (arg1 == 1) {
            var5 = this.field3156;
            var6 = this.field3157;
        } else if (arg1 == 2) {
            var5 = this.field3165;
            var6 = this.field3158;
        } else if (arg1 == 3) {
            var5 = this.field3162;
            var6 = this.field3155;
        } else if (arg1 == 4) {
            var5 = this.field3160;
            var6 = this.field3161;
        } else if (arg1 == 5) {
            var5 = this.field3159;
            var6 = this.field3164;
        } else {
            var6 = var5 = new class184(this.field3163);
        }
        arg0.method1222(var6, var5, arg2, arg1 != 0, arg3);
        var6.field2413 = arg0.field2413;
        var6.field2415 = arg0.field2415;
        return var6;
    }

    @OriginalMember(owner = "client!ma", name = "za", descriptor = "(Lqa;[Lc;Lia;[III)V")
    public final native void method1553(class129 arg0, class507[] arg1, class142 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lh;II)V")
    public class247(class373 arg0, int arg1, int arg2) {
        this.field3163 = arg0;
        this.field3157 = new class184(this.field3163);
        this.field3158 = new class184(this.field3163);
        this.field3155 = new class184(this.field3163);
        this.field3161 = new class184(this.field3163);
        this.field3164 = new class184(this.field3163);
        this.field3156 = new class184(this.field3163);
        this.field3165 = new class184(this.field3163);
        this.field3162 = new class184(this.field3163);
        this.field3160 = new class184(this.field3163);
        this.field3159 = new class184(this.field3163);
        this.method1540(arg0, arg1, arg2);
    }
}
