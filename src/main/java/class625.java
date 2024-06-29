import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class625 implements class145 {

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lda;")
    private class57 field8489;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Lj;")
    private class507 field8485;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Lj;")
    private class507 field8490;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Lj;")
    private class507 field8481;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Lj;")
    private class507 field8484;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lj;")
    private class507 field8483;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lj;")
    private class507 field8488;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lj;")
    private class507 field8480;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Lj;")
    private class507 field8482;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Lj;")
    private class507 field8487;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Lj;")
    private class507 field8491;

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Ljava/lang/Runnable;")
    public Runnable field8486;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "(Lba;Lq;[III)V")
    public final native void method3478(class359 arg0, class396 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "n", descriptor = "(Loa;[Lba;Lq;[III)V")
    public final native void method3479(class650 arg0, class359[] arg1, class396 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
    public final void method3480() {
        this.field8486 = null;
        this.method3481();
    }

    @OriginalMember(owner = "client!t", name = "ja", descriptor = "()V")
    private final native void method3481();

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "()V")
    private final native void method3482();

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class368.method2146((byte) -99, this);
        }
    }

    @OriginalMember(owner = "client!t", name = "JA", descriptor = "(Lba;[ILq;)V")
    public final native void method3483(class359 arg0, int[] arg1, class396 arg2);

    @OriginalMember(owner = "client!t", name = "w", descriptor = "(Lba;Lq;[II)V")
    public final native void method3484(class359 arg0, class396 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "IA", descriptor = "(Loa;IIIIIII)V")
    public final native void method3485(class650 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!t", name = "H", descriptor = "(Z)V")
    public final native void method57(boolean arg0);

    @OriginalMember(owner = "client!t", name = "o", descriptor = "(Lba;Lba;IIIZ)V")
    public final native void method3486(class359 arg0, class359 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()V")
    public final void method3487() {
        this.field8486 = Thread.currentThread();
        this.method3482();
    }

    @OriginalMember(owner = "client!t", name = "m", descriptor = "(Loa;Lba;Lq;[II[I[I[I[S[BI[I)V")
    public final native void method3488(class650 arg0, class359 arg1, class396 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!t", name = "ma", descriptor = "(Ld;II)V")
    public final native void method3489(class140 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "WA", descriptor = "(Loa;[I[I[I[SI)V")
    public final native void method3490(class650 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lj;BIZ)Lba;")
    public final class359 method3491(class507 arg0, byte arg1, int arg2, boolean arg3) {
        class507 var5;
        class507 var6;
        if (arg1 == 1) {
            var5 = this.field8488;
            var6 = this.field8485;
        } else if (arg1 == 2) {
            var5 = this.field8480;
            var6 = this.field8490;
        } else if (arg1 == 3) {
            var5 = this.field8482;
            var6 = this.field8481;
        } else if (arg1 == 4) {
            var5 = this.field8487;
            var6 = this.field8484;
        } else if (arg1 == 5) {
            var5 = this.field8491;
            var6 = this.field8483;
        } else {
            var6 = var5 = new class507(this.field8489);
        }
        arg0.method2768(var6, var5, arg2, arg1 != 0, arg3);
        var6.field6342 = arg0.field6342;
        var6.field6341 = arg0.field6341;
        return var6;
    }

    @OriginalMember(owner = "client!t", name = "QA", descriptor = "(Loa;II)V")
    private final native void method3492(class650 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "v", descriptor = "(Loa;[Lba;Lq;[II[I[I[I[S[BI[I)V")
    public final native void method3493(class650 arg0, class359[] arg1, class396 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lba;IILq;Z)Z")
    public final native boolean method3494(class359 arg0, int arg1, int arg2, class396 arg3, boolean arg4);

    @OriginalMember(owner = "client!t", name = "J", descriptor = "(Ld;IIIIIII[[Z)V")
    public final native void method3495(class140 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lda;II)V")
    public class625(class57 arg0, int arg1, int arg2) {
        this.field8489 = arg0;
        this.field8485 = new class507(this.field8489);
        this.field8490 = new class507(this.field8489);
        this.field8481 = new class507(this.field8489);
        this.field8484 = new class507(this.field8489);
        this.field8483 = new class507(this.field8489);
        this.field8488 = new class507(this.field8489);
        this.field8480 = new class507(this.field8489);
        this.field8482 = new class507(this.field8489);
        this.field8487 = new class507(this.field8489);
        this.field8491 = new class507(this.field8489);
        this.method3492(arg0, arg1, arg2);
    }
}
