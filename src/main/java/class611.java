import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class611 implements class142 {

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Lda;")
    private class56 field8641;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Lj;")
    private class494 field8648;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Lj;")
    private class494 field8643;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lj;")
    private class494 field8640;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lj;")
    private class494 field8645;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Lj;")
    private class494 field8642;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Lj;")
    private class494 field8644;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lj;")
    private class494 field8637;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Lj;")
    private class494 field8638;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lj;")
    private class494 field8646;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Lj;")
    private class494 field8639;

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Ljava/lang/Runnable;")
    public Runnable field8647;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lba;IILq;Z)Z")
    public final native boolean method3403(class350 arg0, int arg1, int arg2, class389 arg3, boolean arg4);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lj;BIZ)Lba;")
    public final class350 method3404(class494 arg0, byte arg1, int arg2, boolean arg3) {
        class494 var5;
        class494 var6;
        if (arg1 == 1) {
            var5 = this.field8644;
            var6 = this.field8648;
        } else if (arg1 == 2) {
            var5 = this.field8637;
            var6 = this.field8643;
        } else if (arg1 == 3) {
            var5 = this.field8638;
            var6 = this.field8640;
        } else if (arg1 == 4) {
            var5 = this.field8646;
            var6 = this.field8645;
        } else if (arg1 == 5) {
            var5 = this.field8639;
            var6 = this.field8642;
        } else {
            var6 = var5 = new class494(this.field8641);
        }
        arg0.method2845(var6, var5, arg2, arg1 != 0, arg3);
        var6.field7157 = arg0.field7157;
        var6.field7155 = arg0.field7155;
        return var6;
    }

    @OriginalMember(owner = "client!t", name = "N", descriptor = "(Lba;Lq;[III)V")
    public final native void method3405(class350 arg0, class389 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "ma", descriptor = "(Ld;II)V")
    public final native void method3406(class137 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "J", descriptor = "(Ld;IIIIIII[[Z)V")
    public final native void method3407(class137 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
    public final void method3408() {
        this.field8647 = null;
        this.method3412();
    }

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "()V")
    private final native void method3409();

    @OriginalMember(owner = "client!t", name = "v", descriptor = "(Loa;[Lba;Lq;[II[I[I[I[S[BI[I)V")
    public final native void method3410(class635 arg0, class350[] arg1, class389 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!t", name = "m", descriptor = "(Loa;Lba;Lq;[II[I[I[I[S[BI[I)V")
    public final native void method3411(class635 arg0, class350 arg1, class389 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!t", name = "ja", descriptor = "()V")
    private final native void method3412();

    @OriginalMember(owner = "client!t", name = "w", descriptor = "(Lba;Lq;[II)V")
    public final native void method3413(class350 arg0, class389 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "o", descriptor = "(Lba;Lba;IIIZ)V")
    public final native void method3414(class350 arg0, class350 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "IA", descriptor = "(Loa;IIIIIII)V")
    public final native void method3415(class635 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!t", name = "QA", descriptor = "(Loa;II)V")
    private final native void method3416(class635 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()V")
    public final void method3417() {
        this.field8647 = Thread.currentThread();
        this.method3409();
    }

    @OriginalMember(owner = "client!t", name = "WA", descriptor = "(Loa;[I[I[I[SI)V")
    public final native void method3418(class635 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "n", descriptor = "(Loa;[Lba;Lq;[III)V")
    public final native void method3419(class635 arg0, class350[] arg1, class389 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "H", descriptor = "(Z)V")
    public final native void method59(boolean arg0);

    @OriginalMember(owner = "client!t", name = "JA", descriptor = "(Lba;[ILq;)V")
    public final native void method3420(class350 arg0, int[] arg1, class389 arg2);

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lda;II)V")
    public class611(class56 arg0, int arg1, int arg2) {
        this.field8641 = arg0;
        this.field8648 = new class494(this.field8641);
        this.field8643 = new class494(this.field8641);
        this.field8640 = new class494(this.field8641);
        this.field8645 = new class494(this.field8641);
        this.field8642 = new class494(this.field8641);
        this.field8644 = new class494(this.field8641);
        this.field8637 = new class494(this.field8641);
        this.field8638 = new class494(this.field8641);
        this.field8646 = new class494(this.field8641);
        this.field8639 = new class494(this.field8641);
        this.method3416(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class409.method2220(this, (byte) 83);
        }
    }
}
