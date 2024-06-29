import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class695 implements class65 {

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Loa;")
    private class473 field9730;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Li;")
    private class163 field9738;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class163 field9737;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Li;")
    private class163 field9731;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class163 field9734;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Li;")
    private class163 field9740;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class163 field9736;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class163 field9729;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class163 field9739;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Li;")
    private class163 field9735;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class163 field9732;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Ljava/lang/Runnable;")
    public Runnable field9733;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V")
    public final void method4984(class761 arg0, class761 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method4996(this.nativeid, ((class163) arg0).nativeid, ((class163) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method4985(long arg0);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method4986(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V")
    public final void method4987(class18 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method5006(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method4988(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V")
    public final void method4989(class751 arg0, int arg1, int arg2, int arg3) {
        this.method4991(this.nativeid, ((class310) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILqa;Z)Z")
    public final boolean method4990(class761 arg0, int arg1, int arg2, class104 arg3, boolean arg4) {
        return this.method5001(this.nativeid, ((class163) arg0).nativeid, arg1, arg2, ((class729) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method4991(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lqa;[III)V")
    public final void method4992(class761 arg0, class104 arg1, int[] arg2, int arg3, int arg4) {
        this.method4988(this.nativeid, ((class163) arg0).nativeid, ((class729) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
    private final void method4993() {
        this.method4985(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method4994(long arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;")
    public final class761 method4995(class163 arg0, byte arg1, int arg2, boolean arg3) {
        class163 var5;
        class163 var6;
        if (arg1 == 1) {
            var5 = this.field9736;
            var6 = this.field9738;
        } else if (arg1 == 2) {
            var5 = this.field9729;
            var6 = this.field9737;
        } else if (arg1 == 3) {
            var5 = this.field9739;
            var6 = this.field9731;
        } else if (arg1 == 4) {
            var5 = this.field9735;
            var6 = this.field9734;
        } else if (arg1 == 5) {
            var5 = this.field9732;
            var6 = this.field9740;
        } else {
            var6 = var5 = new class163(this.field9730);
        }
        arg0.method1391(var6, var5, arg2, arg1 != 0, arg3);
        var6.field2112 = arg0.field2112;
        var6.field2114 = arg0.field2114;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method4996(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V")
    public final void method4997() {
        this.field9733 = Thread.currentThread();
        this.method5005();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V")
    public final void method4998(class751 arg0, int arg1, int arg2) {
        this.method4986(this.nativeid, ((class310) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILqa;ZI)Z")
    public final boolean method4999(class761 arg0, int arg1, int arg2, class104 arg3, boolean arg4, int arg5) {
        return this.method5013(this.nativeid, ((class163) arg0).nativeid, arg1, arg2, ((class729) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILqa;)V")
    public final void method5000(class761 arg0, int[] arg1, class104 arg2) {
        this.method5004(this.nativeid, ((class163) arg0).nativeid, arg1, ((class729) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method5001(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lqa;[II)V")
    public final void method5002(class761 arg0, class104 arg1, int[] arg2, int arg3) {
        this.method5010(this.nativeid, ((class163) arg0).nativeid, ((class729) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V")
    public final void method5003() {
        this.field9733 = null;
        this.method4993();
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method5004(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
    private final void method5005() {
        this.method4994(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method5006(long arg0, class18 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V")
    public final void method5007(class18 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method5014(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method5008(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class579.method4297(this, -60);
        }
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V")
    public final void method690(boolean arg0) {
        this.method5009(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method5009(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method5010(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method5011(long arg0, class18 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V")
    public class695(class473 arg0, int arg1, int arg2) {
        this.field9730 = arg0;
        this.field9738 = new class163(this.field9730);
        this.field9737 = new class163(this.field9730);
        this.field9731 = new class163(this.field9730);
        this.field9734 = new class163(this.field9730);
        this.field9740 = new class163(this.field9730);
        this.field9736 = new class163(this.field9730);
        this.field9729 = new class163(this.field9730);
        this.field9739 = new class163(this.field9730);
        this.field9735 = new class163(this.field9730);
        this.field9732 = new class163(this.field9730);
        this.method5011(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V")
    public final void method5012(class751 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method5008(this.nativeid, ((class310) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method5013(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method5014(long arg0, class18 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);
}
