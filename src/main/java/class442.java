import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class442 implements class415 {

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Lc;")
    private class124 field6669;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Lfa;")
    private class158 field6663;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lfa;")
    private class158 field6668;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Lfa;")
    private class158 field6667;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Lfa;")
    private class158 field6670;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lfa;")
    private class158 field6662;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Lfa;")
    private class158 field6666;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Lfa;")
    private class158 field6665;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Lfa;")
    private class158 field6664;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "Lfa;")
    private class158 field6671;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lfa;")
    private class158 field6660;

    @OriginalMember(owner = "client!wa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Ljava/lang/Runnable;")
    public Runnable field6661;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()V")
    public final void method2674() {
        this.field6661 = Thread.currentThread();
        this.method2677();
    }

    @OriginalMember(owner = "client!wa", name = "pa", descriptor = "()V")
    public final native void method304();

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "(Lqa;II)V")
    private final native void method2675(class165 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "()V")
    private final native void method2676();

    @OriginalMember(owner = "client!wa", name = "na", descriptor = "()V")
    private final native void method2677();

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "()V")
    public final void method2678() {
        this.field6661 = null;
        this.method2676();
    }

    @OriginalMember(owner = "client!wa", name = "ha", descriptor = "(Lqa;[I[I[I[SI)V")
    public final native void method2679(class165 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "(Lka;Lka;IIIZ)V")
    public final native void method2680(class334 arg0, class334 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!wa", name = "ka", descriptor = "(Lo;II)V")
    public final native void method2681(class23 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "(Lka;IILn;Z)Z")
    public final native boolean method2682(class334 arg0, int arg1, int arg2, class14 arg3, boolean arg4);

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "(Lqa;[Lka;Ln;[III)V")
    public final native void method2683(class165 arg0, class334[] arg1, class14 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "(Lo;IIIIIII[[Z)V")
    public final native void method2684(class23 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lqa;[Lka;Ln;[II[I[I[I[S[BI[I)V")
    public final native void method2685(class165 arg0, class334[] arg1, class14 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lfa;BIZ)Lka;")
    public final class334 method2686(class158 arg0, byte arg1, int arg2, boolean arg3) {
        class158 var5;
        class158 var6;
        if (arg1 == 1) {
            var5 = this.field6666;
            var6 = this.field6663;
        } else if (arg1 == 2) {
            var5 = this.field6665;
            var6 = this.field6668;
        } else if (arg1 == 3) {
            var5 = this.field6664;
            var6 = this.field6667;
        } else if (arg1 == 4) {
            var5 = this.field6671;
            var6 = this.field6670;
        } else if (arg1 == 5) {
            var5 = this.field6660;
            var6 = this.field6662;
        } else {
            var6 = var5 = new class158(this.field6669);
        }
        arg0.method1028(var6, var5, arg2, arg1 != 0, arg3);
        var6.field2046 = arg0.field2046;
        var6.field2048 = arg0.field2048;
        return var6;
    }

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "(Lqa;IIIIIII)V")
    public final native void method2687(class165 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!wa", name = "FA", descriptor = "(Lqa;Lka;Ln;[II[I[I[I[S[BI[I)V")
    public final native void method2688(class165 arg0, class334 arg1, class14 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!wa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class93.method626(this, 0);
        }
    }

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "(Lka;Ln;[III)V")
    public final native void method2689(class334 arg0, class14 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lc;II)V")
    public class442(class124 arg0, int arg1, int arg2) {
        this.field6669 = arg0;
        this.field6663 = new class158(this.field6669);
        this.field6668 = new class158(this.field6669);
        this.field6667 = new class158(this.field6669);
        this.field6670 = new class158(this.field6669);
        this.field6662 = new class158(this.field6669);
        this.field6666 = new class158(this.field6669);
        this.field6665 = new class158(this.field6669);
        this.field6664 = new class158(this.field6669);
        this.field6671 = new class158(this.field6669);
        this.field6660 = new class158(this.field6669);
        this.method2675(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wa", name = "VA", descriptor = "(Lka;Ln;[II)V")
    public final native void method2690(class334 arg0, class14 arg1, int[] arg2, int arg3);
}
