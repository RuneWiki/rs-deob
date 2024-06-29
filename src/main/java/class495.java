import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class495 implements class28 {

    @OriginalMember(owner = "client!v", name = "e", descriptor = "La;")
    private class526 field6886;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Lma;")
    private class12 field6890;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Lma;")
    private class12 field6892;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Lma;")
    private class12 field6891;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Lma;")
    private class12 field6885;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Lma;")
    private class12 field6883;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Lma;")
    private class12 field6888;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Lma;")
    private class12 field6887;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Lma;")
    private class12 field6884;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Lma;")
    private class12 field6882;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Lma;")
    private class12 field6893;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Ljava/lang/Runnable;")
    public Runnable field6889;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "(Lqa;[Lr;Lm;[II[I[I[I[S[BI[I)V")
    public final native void method2848(class206 arg0, class157[] arg1, class163 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!v", name = "na", descriptor = "()V")
    private final native void method2849();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lma;BIZ)Lr;")
    public final class157 method2850(class12 arg0, byte arg1, int arg2, boolean arg3) {
        class12 var5;
        class12 var6;
        if (arg1 == 1) {
            var5 = this.field6888;
            var6 = this.field6890;
        } else if (arg1 == 2) {
            var5 = this.field6887;
            var6 = this.field6892;
        } else if (arg1 == 3) {
            var5 = this.field6884;
            var6 = this.field6891;
        } else if (arg1 == 4) {
            var5 = this.field6882;
            var6 = this.field6885;
        } else if (arg1 == 5) {
            var5 = this.field6893;
            var6 = this.field6883;
        } else {
            var6 = var5 = new class12(this.field6886);
        }
        arg0.method80(var6, var5, arg2, arg1 != 0, arg3);
        var6.field90 = arg0.field90;
        var6.field91 = arg0.field91;
        return var6;
    }

    @OriginalMember(owner = "client!v", name = "u", descriptor = "()V")
    private final native void method2851();

    @OriginalMember(owner = "client!v", name = "FA", descriptor = "(Lqa;II)V")
    private final native void method2852(class206 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "k", descriptor = "(Lsa;II)V")
    public final native void method2853(class174 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "O", descriptor = "(Lqa;[I[I[I[SI)V")
    public final native void method2854(class206 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class49.method261(0, this);
        }
    }

    @OriginalMember(owner = "client!v", name = "NA", descriptor = "(Z)V")
    public final native void method61(boolean arg0);

    @OriginalMember(owner = "client!v", name = "m", descriptor = "(Lr;Lm;[III)V")
    public final native void method2855(class157 arg0, class163 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!v", name = "wa", descriptor = "(Lqa;[Lr;Lm;[III)V")
    public final native void method2856(class206 arg0, class157[] arg1, class163 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "(Lsa;IIIIIII[[Z)V")
    public final native void method2857(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!v", name = "ka", descriptor = "(Lr;Lm;[II)V")
    public final native void method2858(class157 arg0, class163 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
    public final void method2859() {
        this.field6889 = Thread.currentThread();
        this.method2851();
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
    public final void method2860() {
        this.field6889 = null;
        this.method2849();
    }

    @OriginalMember(owner = "client!v", name = "da", descriptor = "(Lqa;IIIIIII)V")
    public final native void method2861(class206 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!v", name = "PA", descriptor = "(Lr;Lr;IIIZ)V")
    public final native void method2862(class157 arg0, class157 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!v", name = "G", descriptor = "(Lqa;Lr;Lm;[II[I[I[I[S[BI[I)V")
    public final native void method2863(class206 arg0, class157 arg1, class163 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "(Lr;IILm;Z)Z")
    public final native boolean method2864(class157 arg0, int arg1, int arg2, class163 arg3, boolean arg4);

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(La;II)V")
    public class495(class526 arg0, int arg1, int arg2) {
        this.field6886 = arg0;
        this.field6890 = new class12(this.field6886);
        this.field6892 = new class12(this.field6886);
        this.field6891 = new class12(this.field6886);
        this.field6885 = new class12(this.field6886);
        this.field6883 = new class12(this.field6886);
        this.field6888 = new class12(this.field6886);
        this.field6887 = new class12(this.field6886);
        this.field6884 = new class12(this.field6886);
        this.field6882 = new class12(this.field6886);
        this.field6893 = new class12(this.field6886);
        this.method2852(arg0, arg1, arg2);
    }
}
