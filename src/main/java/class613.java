import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class613 implements class141 {

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Lda;")
    private class55 field8498;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lj;")
    private class497 field8502;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lj;")
    private class497 field8494;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Lj;")
    private class497 field8501;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lj;")
    private class497 field8503;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Lj;")
    private class497 field8499;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Lj;")
    private class497 field8496;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Lj;")
    private class497 field8504;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Lj;")
    private class497 field8505;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Lj;")
    private class497 field8495;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Lj;")
    private class497 field8500;

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Ljava/lang/Runnable;")
    public Runnable field8497;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
    public final void method3379() {
        this.field8497 = Thread.currentThread();
        this.method3391();
    }

    @OriginalMember(owner = "client!t", name = "WA", descriptor = "(Loa;[I[I[I[SI)V")
    public final native void method3380(class638 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "IA", descriptor = "(Loa;IIIIIII)V")
    public final native void method3381(class638 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!t", name = "ma", descriptor = "(Ld;II)V")
    public final native void method3382(class136 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()V")
    public final void method3383() {
        this.field8497 = null;
        this.method3387();
    }

    @OriginalMember(owner = "client!t", name = "w", descriptor = "(Lba;Lq;[II)V")
    public final native void method3384(class352 arg0, class391 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "H", descriptor = "(Z)V")
    public final native void method58(boolean arg0);

    @OriginalMember(owner = "client!t", name = "n", descriptor = "(Loa;[Lba;Lq;[III)V")
    public final native void method3385(class638 arg0, class352[] arg1, class391 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "m", descriptor = "(Loa;Lba;Lq;[II[I[I[I[S[BI[I)V")
    public final native void method3386(class638 arg0, class352 arg1, class391 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!t", name = "ja", descriptor = "()V")
    private final native void method3387();

    @OriginalMember(owner = "client!t", name = "v", descriptor = "(Loa;[Lba;Lq;[II[I[I[I[S[BI[I)V")
    public final native void method3388(class638 arg0, class352[] arg1, class391 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!t", name = "JA", descriptor = "(Lba;[ILq;)V")
    public final native void method3389(class352 arg0, int[] arg1, class391 arg2);

    @OriginalMember(owner = "client!t", name = "o", descriptor = "(Lba;Lba;IIIZ)V")
    public final native void method3390(class352 arg0, class352 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class373.method2177(this, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "()V")
    private final native void method3391();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lj;BIZ)Lba;")
    public final class352 method3392(class497 arg0, byte arg1, int arg2, boolean arg3) {
        class497 var5;
        class497 var6;
        if (arg1 == 1) {
            var5 = this.field8496;
            var6 = this.field8502;
        } else if (arg1 == 2) {
            var5 = this.field8504;
            var6 = this.field8494;
        } else if (arg1 == 3) {
            var5 = this.field8505;
            var6 = this.field8501;
        } else if (arg1 == 4) {
            var5 = this.field8495;
            var6 = this.field8503;
        } else if (arg1 == 5) {
            var5 = this.field8500;
            var6 = this.field8499;
        } else {
            var6 = var5 = new class497(this.field8498);
        }
        arg0.method2778(var6, var5, arg2, arg1 != 0, arg3);
        var6.field6842 = arg0.field6842;
        var6.field6839 = arg0.field6839;
        return var6;
    }

    @OriginalMember(owner = "client!t", name = "J", descriptor = "(Ld;IIIIIII[[Z)V")
    public final native void method3393(class136 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!t", name = "QA", descriptor = "(Loa;II)V")
    private final native void method3394(class638 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lba;IILq;Z)Z")
    public final native boolean method3395(class352 arg0, int arg1, int arg2, class391 arg3, boolean arg4);

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lda;II)V")
    public class613(class55 arg0, int arg1, int arg2) {
        this.field8498 = arg0;
        this.field8502 = new class497(this.field8498);
        this.field8494 = new class497(this.field8498);
        this.field8501 = new class497(this.field8498);
        this.field8503 = new class497(this.field8498);
        this.field8499 = new class497(this.field8498);
        this.field8496 = new class497(this.field8498);
        this.field8504 = new class497(this.field8498);
        this.field8505 = new class497(this.field8498);
        this.field8495 = new class497(this.field8498);
        this.field8500 = new class497(this.field8498);
        this.method3394(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!t", name = "N", descriptor = "(Lba;Lq;[III)V")
    public final native void method3396(class352 arg0, class391 arg1, int[] arg2, int arg3, int arg4);
}
