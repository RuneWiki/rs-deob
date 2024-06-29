import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class619 implements class533 {

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Loa;")
    private class695 field8254;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class39 field8259;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Li;")
    private class39 field8263;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class39 field8257;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class39 field8255;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Li;")
    private class39 field8253;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class39 field8264;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Li;")
    private class39 field8258;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class39 field8260;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Li;")
    private class39 field8261;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class39 field8256;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Ljava/lang/Runnable;")
    public Runnable field8262;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method3383(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class521.method2896(this, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
    public final void method3384() {
        this.field8262 = null;
        this.method3405();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILofa;)V")
    public final void method3385(class475 arg0, int[] arg1, class333 arg2) {
        this.method3393(this.nativeid, ((class39) arg0).nativeid, arg1, ((class280) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lofa;[II)V")
    public final void method3386(class475 arg0, class333 arg1, int[] arg2, int arg3) {
        this.method3389(this.nativeid, ((class39) arg0).nativeid, ((class280) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V")
    public final void method3387(class282 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method3394(this.nativeid, ((class669) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;")
    public final class475 method3388(class39 arg0, byte arg1, int arg2, boolean arg3) {
        class39 var5;
        class39 var6;
        if (arg1 == 1) {
            var5 = this.field8264;
            var6 = this.field8259;
        } else if (arg1 == 2) {
            var5 = this.field8258;
            var6 = this.field8263;
        } else if (arg1 == 3) {
            var5 = this.field8260;
            var6 = this.field8257;
        } else if (arg1 == 4) {
            var5 = this.field8261;
            var6 = this.field8255;
        } else if (arg1 == 5) {
            var5 = this.field8256;
            var6 = this.field8253;
        } else {
            var6 = var5 = new class39(this.field8254);
        }
        arg0.method304(var6, var5, arg2, arg1 != 0, arg3);
        var6.field545 = arg0.field545;
        var6.field544 = arg0.field544;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method3389(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method3390(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method3391(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
    private final void method3392() {
        this.method3409(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method3393(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method3394(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V")
    public final void method3395(class59 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method3401(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V")
    public final void method3396(class59 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3397(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method3397(long arg0, class59 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V")
    public final void method3398() {
        this.field8262 = Thread.currentThread();
        this.method3392();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V")
    public final void method3399(class475 arg0, class475 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3383(this.nativeid, ((class39) arg0).nativeid, ((class39) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method3400(long arg0, class59 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method3401(long arg0, class59 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V")
    public final void method3402(class282 arg0, int arg1, int arg2) {
        this.method3390(this.nativeid, ((class669) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILofa;ZI)Z")
    public final boolean method3403(class475 arg0, int arg1, int arg2, class333 arg3, boolean arg4, int arg5) {
        return this.method3404(this.nativeid, ((class39) arg0).nativeid, arg1, arg2, ((class280) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method3404(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V")
    private final void method3405() {
        this.method3407(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method3406(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method3407(long arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V")
    public final void method3408(class282 arg0, int arg1, int arg2, int arg3) {
        this.method3411(this.nativeid, ((class669) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method3409(long arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lofa;[III)V")
    public final void method3410(class475 arg0, class333 arg1, int[] arg2, int arg3, int arg4) {
        this.method3406(this.nativeid, ((class39) arg0).nativeid, ((class280) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method3411(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V")
    public final void method116(boolean arg0) {
        this.method3391(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method3412(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILofa;Z)Z")
    public final boolean method3413(class475 arg0, int arg1, int arg2, class333 arg3, boolean arg4) {
        return this.method3412(this.nativeid, ((class39) arg0).nativeid, arg1, arg2, ((class280) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V")
    public class619(class695 arg0, int arg1, int arg2) {
        this.field8254 = arg0;
        this.field8259 = new class39(this.field8254);
        this.field8263 = new class39(this.field8254);
        this.field8257 = new class39(this.field8254);
        this.field8255 = new class39(this.field8254);
        this.field8253 = new class39(this.field8254);
        this.field8264 = new class39(this.field8254);
        this.field8258 = new class39(this.field8254);
        this.field8260 = new class39(this.field8254);
        this.field8261 = new class39(this.field8254);
        this.field8256 = new class39(this.field8254);
        this.method3400(this.nativeid, arg0, arg1, arg2);
    }
}
