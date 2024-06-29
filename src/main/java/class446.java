import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class446 implements class47 {

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Lh;")
    private class161 field6623;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Lp;")
    private class39 field6626;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lp;")
    private class39 field6627;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Lp;")
    private class39 field6629;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Lp;")
    private class39 field6628;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lp;")
    private class39 field6618;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Lp;")
    private class39 field6622;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lp;")
    private class39 field6619;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Lp;")
    private class39 field6620;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lp;")
    private class39 field6624;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lp;")
    private class39 field6625;

    @OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Ljava/lang/Runnable;")
    public Runnable field6621;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V", line = 5)
    public final void method2684() {
        this.field6621 = null;
        this.method2696();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lp;BIZ)Lc;", line = 19)
    public final class201 method2690(class39 arg0, byte arg1, int arg2, boolean arg3) {
        class39 var5;
        class39 var6;
        if (arg1 == 1) {
            var5 = this.field6622;
            var6 = this.field6626;
        } else if (arg1 == 2) {
            var5 = this.field6619;
            var6 = this.field6627;
        } else if (arg1 == 3) {
            var5 = this.field6620;
            var6 = this.field6629;
        } else if (arg1 == 4) {
            var5 = this.field6624;
            var6 = this.field6628;
        } else if (arg1 == 5) {
            var5 = this.field6625;
            var6 = this.field6618;
        } else {
            var6 = var5 = new class39(this.field6623);
        }
        arg0.method317(var6, var5, arg2, arg1 != 0, arg3);
        var6.field614 = arg0.field614;
        var6.field615 = arg0.field615;
        return var6;
    }

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V", line = 77)
    protected final void finalize() {
        class342.method2198(this, (byte) -50);
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lh;II)V", line = 85)
    public class446(class161 arg0, int arg1, int arg2) {
        this.field6623 = arg0;
        this.field6626 = new class39(this.field6623);
        this.field6627 = new class39(this.field6623);
        this.field6629 = new class39(this.field6623);
        this.field6628 = new class39(this.field6623);
        this.field6618 = new class39(this.field6623);
        this.field6622 = new class39(this.field6623);
        this.field6619 = new class39(this.field6623);
        this.field6620 = new class39(this.field6623);
        this.field6624 = new class39(this.field6623);
        this.field6625 = new class39(this.field6623);
        this.method2685(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()V", line = 100)
    public final void method2700() {
        this.field6621 = Thread.currentThread();
        this.method2697();
    }

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "(Lqa;II)V")
    private final native void method2685(class496 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "ka", descriptor = "(Lna;II)V")
    public final native void method2686(class206 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(Lqa;Lc;Lia;[II[I[I[I[S[BI[I)V")
    public final native void method2687(class496 arg0, class201 arg1, class23 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "(Lc;Lc;IIIZ)V")
    public final native void method2688(class201 arg0, class201 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ma", name = "sa", descriptor = "(Lqa;IIIIIII)V")
    public final native void method2689(class496 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ma", name = "pa", descriptor = "(Lqa;[Lc;Lia;[II[I[I[I[S[BI[I)V")
    public final native void method2691(class496 arg0, class201[] arg1, class23 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "(Lna;IIIIIII[[Z)V")
    public final native void method2692(class206 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!ma", name = "za", descriptor = "(Lqa;[Lc;Lia;[III)V")
    public final native void method2693(class496 arg0, class201[] arg1, class23 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ma", name = "ya", descriptor = "()V")
    public final native void method218();

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "(Lqa;[I[I[I[SI)V")
    public final native void method2694(class496 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(Lc;Lia;[III)V")
    public final native void method2695(class201 arg0, class23 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "()V")
    private final native void method2696();

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "()V")
    private final native void method2697();

    @OriginalMember(owner = "client!ma", name = "fa", descriptor = "(Lc;Lia;[II)V")
    public final native void method2698(class201 arg0, class23 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!ma", name = "ua", descriptor = "(Lc;IILia;Z)Z")
    public final native boolean method2699(class201 arg0, int arg1, int arg2, class23 arg3, boolean arg4);
}
