import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class583 implements class137 {

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Lda;")
    private class54 field8397;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lj;")
    private class470 field8398;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Lj;")
    private class470 field8394;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Lj;")
    private class470 field8395;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lj;")
    private class470 field8399;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Lj;")
    private class470 field8396;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Lj;")
    private class470 field8392;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lj;")
    private class470 field8393;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Lj;")
    private class470 field8401;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Lj;")
    private class470 field8391;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Lj;")
    private class470 field8400;

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Ljava/lang/Runnable;")
    public Runnable field8390;

    @OriginalMember(owner = "client!t", name = "IA", descriptor = "(Loa;IIIIIII)V")
    public final native void method3381(class605 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!t", name = "N", descriptor = "(Lba;Lq;[III)V")
    public final native void method3382(class327 arg0, class364 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class284.method1838(this, -73);
        }
    }

    @OriginalMember(owner = "client!t", name = "ja", descriptor = "()V")
    private final native void method3383();

    @OriginalMember(owner = "client!t", name = "J", descriptor = "(Ld;IIIIIII[[Z)V")
    public final native void method3384(class132 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!t", name = "w", descriptor = "(Lba;Lq;[II)V")
    public final native void method3385(class327 arg0, class364 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "WA", descriptor = "(Loa;[I[I[I[SI)V")
    public final native void method3386(class605 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
    public final void method3387() {
        this.field8390 = Thread.currentThread();
        this.method3396();
    }

    @OriginalMember(owner = "client!t", name = "QA", descriptor = "(Loa;II)V")
    private final native void method3388(class605 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "JA", descriptor = "(Lba;[ILq;)V")
    public final native void method3389(class327 arg0, int[] arg1, class364 arg2);

    @OriginalMember(owner = "client!t", name = "v", descriptor = "(Loa;[Lba;Lq;[II[I[I[I[S[BI[I)V")
    public final native void method3390(class605 arg0, class327[] arg1, class364 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!t", name = "H", descriptor = "(Z)V")
    public final native void method70(boolean arg0);

    @OriginalMember(owner = "client!t", name = "ma", descriptor = "(Ld;II)V")
    public final native void method3391(class132 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()V")
    public final void method3392() {
        this.field8390 = null;
        this.method3383();
    }

    @OriginalMember(owner = "client!t", name = "n", descriptor = "(Loa;[Lba;Lq;[III)V")
    public final native void method3393(class605 arg0, class327[] arg1, class364 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "m", descriptor = "(Loa;Lba;Lq;[II[I[I[I[S[BI[I)V")
    public final native void method3394(class605 arg0, class327 arg1, class364 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lj;BIZ)Lba;")
    public final class327 method3395(class470 arg0, byte arg1, int arg2, boolean arg3) {
        class470 var5;
        class470 var6;
        if (arg1 == 1) {
            var5 = this.field8392;
            var6 = this.field8398;
        } else if (arg1 == 2) {
            var5 = this.field8393;
            var6 = this.field8394;
        } else if (arg1 == 3) {
            var5 = this.field8401;
            var6 = this.field8395;
        } else if (arg1 == 4) {
            var5 = this.field8391;
            var6 = this.field8399;
        } else if (arg1 == 5) {
            var5 = this.field8400;
            var6 = this.field8396;
        } else {
            var6 = var5 = new class470(this.field8397);
        }
        arg0.method2877(var6, var5, arg2, arg1 != 0, arg3);
        var6.field6965 = arg0.field6965;
        var6.field6966 = arg0.field6966;
        return var6;
    }

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "()V")
    private final native void method3396();

    @OriginalMember(owner = "client!t", name = "o", descriptor = "(Lba;Lba;IIIZ)V")
    public final native void method3397(class327 arg0, class327 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lba;IILq;Z)Z")
    public final native boolean method3398(class327 arg0, int arg1, int arg2, class364 arg3, boolean arg4);

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lda;II)V")
    public class583(class54 arg0, int arg1, int arg2) {
        this.field8397 = arg0;
        this.field8398 = new class470(this.field8397);
        this.field8394 = new class470(this.field8397);
        this.field8395 = new class470(this.field8397);
        this.field8399 = new class470(this.field8397);
        this.field8396 = new class470(this.field8397);
        this.field8392 = new class470(this.field8397);
        this.field8393 = new class470(this.field8397);
        this.field8401 = new class470(this.field8397);
        this.field8391 = new class470(this.field8397);
        this.field8400 = new class470(this.field8397);
        this.method3388(arg0, arg1, arg2);
    }
}
