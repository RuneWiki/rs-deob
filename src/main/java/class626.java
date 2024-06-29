import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class626 implements class144 {

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lda;")
    private class57 field8455;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Lj;")
    private class507 field8449;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Lj;")
    private class507 field8454;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lj;")
    private class507 field8450;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lj;")
    private class507 field8456;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Lj;")
    private class507 field8451;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Lj;")
    private class507 field8458;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Lj;")
    private class507 field8457;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lj;")
    private class507 field8447;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Lj;")
    private class507 field8452;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Lj;")
    private class507 field8448;

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Ljava/lang/Runnable;")
    public Runnable field8453;

    @OriginalMember(owner = "client!t", name = "WA", descriptor = "(Loa;[I[I[I[SI)V")
    public final native void method3433(class651 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "o", descriptor = "(Lba;Lba;IIIZ)V")
    public final native void method3434(class358 arg0, class358 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "IA", descriptor = "(Loa;IIIIIII)V")
    public final native void method3435(class651 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
    public final void method3436() {
        this.field8453 = Thread.currentThread();
        this.method3449();
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()V")
    public final void method3437() {
        this.field8453 = null;
        this.method3438();
    }

    @OriginalMember(owner = "client!t", name = "ja", descriptor = "()V")
    private final native void method3438();

    @OriginalMember(owner = "client!t", name = "QA", descriptor = "(Loa;II)V")
    private final native void method3439(class651 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class550.method3055((byte) -20, this);
        }
    }

    @OriginalMember(owner = "client!t", name = "JA", descriptor = "(Lba;[ILq;)V")
    public final native void method3440(class358 arg0, int[] arg1, class397 arg2);

    @OriginalMember(owner = "client!t", name = "ma", descriptor = "(Ld;II)V")
    public final native void method3441(class139 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "n", descriptor = "(Loa;[Lba;Lq;[III)V")
    public final native void method3442(class651 arg0, class358[] arg1, class397 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "w", descriptor = "(Lba;Lq;[II)V")
    public final native void method3443(class358 arg0, class397 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lda;II)V")
    public class626(class57 arg0, int arg1, int arg2) {
        this.field8455 = arg0;
        this.field8449 = new class507(this.field8455);
        this.field8454 = new class507(this.field8455);
        this.field8450 = new class507(this.field8455);
        this.field8456 = new class507(this.field8455);
        this.field8451 = new class507(this.field8455);
        this.field8458 = new class507(this.field8455);
        this.field8457 = new class507(this.field8455);
        this.field8447 = new class507(this.field8455);
        this.field8452 = new class507(this.field8455);
        this.field8448 = new class507(this.field8455);
        this.method3439(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!t", name = "J", descriptor = "(Ld;IIIIIII[[Z)V")
    public final native void method3444(class139 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lj;BIZ)Lba;")
    public final class358 method3445(class507 arg0, byte arg1, int arg2, boolean arg3) {
        class507 var5;
        class507 var6;
        if (arg1 == 1) {
            var5 = this.field8458;
            var6 = this.field8449;
        } else if (arg1 == 2) {
            var5 = this.field8457;
            var6 = this.field8454;
        } else if (arg1 == 3) {
            var5 = this.field8447;
            var6 = this.field8450;
        } else if (arg1 == 4) {
            var5 = this.field8452;
            var6 = this.field8456;
        } else if (arg1 == 5) {
            var5 = this.field8448;
            var6 = this.field8451;
        } else {
            var6 = var5 = new class507(this.field8455);
        }
        arg0.method2816(var6, var5, arg2, arg1 != 0, arg3);
        var6.field6770 = arg0.field6770;
        var6.field6772 = arg0.field6772;
        return var6;
    }

    @OriginalMember(owner = "client!t", name = "H", descriptor = "(Z)V")
    public final native void method132(boolean arg0);

    @OriginalMember(owner = "client!t", name = "m", descriptor = "(Loa;Lba;Lq;[II[I[I[I[S[BI[I)V")
    public final native void method3446(class651 arg0, class358 arg1, class397 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!t", name = "N", descriptor = "(Lba;Lq;[III)V")
    public final native void method3447(class358 arg0, class397 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lba;IILq;Z)Z")
    public final native boolean method3448(class358 arg0, int arg1, int arg2, class397 arg3, boolean arg4);

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "()V")
    private final native void method3449();

    @OriginalMember(owner = "client!t", name = "v", descriptor = "(Loa;[Lba;Lq;[II[I[I[I[S[BI[I)V")
    public final native void method3450(class651 arg0, class358[] arg1, class397 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);
}
