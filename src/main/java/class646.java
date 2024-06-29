import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class646 implements class560 {

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Loa;")
    private class725 field9273;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class41 field9271;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class41 field9270;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class41 field9267;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class41 field9264;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class41 field9263;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Li;")
    private class41 field9272;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class41 field9262;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Li;")
    private class41 field9266;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Li;")
    private class41 field9268;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Li;")
    private class41 field9269;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Ljava/lang/Runnable;")
    public Runnable field9265;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILsj;Z)Z")
    public final boolean method4676(class499 arg0, int arg1, int arg2, class486 arg3, boolean arg4) {
        return this.method4702(this.nativeid, ((class41) arg0).nativeid, arg1, arg2, ((class291) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;")
    public final class499 method4677(class41 arg0, byte arg1, int arg2, boolean arg3) {
        class41 var5;
        class41 var6;
        if (arg1 == 1) {
            var5 = this.field9272;
            var6 = this.field9271;
        } else if (arg1 == 2) {
            var5 = this.field9262;
            var6 = this.field9270;
        } else if (arg1 == 3) {
            var5 = this.field9266;
            var6 = this.field9267;
        } else if (arg1 == 4) {
            var5 = this.field9268;
            var6 = this.field9264;
        } else if (arg1 == 5) {
            var5 = this.field9269;
            var6 = this.field9263;
        } else {
            var6 = var5 = new class41(this.field9273);
        }
        arg0.method403(var6, var5, arg2, arg1 != 0, arg3);
        var6.field470 = arg0.field470;
        var6.field472 = arg0.field472;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method4678(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method4679(long arg0);

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class377.method3103(this, false);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V")
    public final void method4680(class63 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method4701(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V")
    public final void method4681(class293 arg0, int arg1, int arg2) {
        this.method4694(this.nativeid, ((class699) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V")
    public final void method4682(class499 arg0, class499 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method4706(this.nativeid, ((class41) arg0).nativeid, ((class41) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V")
    private final void method4683() {
        this.method4693(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method4684(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILsj;)V")
    public final void method4685(class499 arg0, int[] arg1, class486 arg2) {
        this.method4704(this.nativeid, ((class41) arg0).nativeid, arg1, ((class291) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method4686(long arg0, class63 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V")
    public final void method4687(class293 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method4684(this.nativeid, ((class699) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V")
    public final void method4688() {
        this.field9265 = null;
        this.method4698();
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
    public final void method4689() {
        this.field9265 = Thread.currentThread();
        this.method4683();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lsj;[II)V")
    public final void method4690(class499 arg0, class486 arg1, int[] arg2, int arg3) {
        this.method4697(this.nativeid, ((class41) arg0).nativeid, ((class291) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V")
    public final void method4691(class63 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method4700(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V")
    public final void method4692(class293 arg0, int arg1, int arg2, int arg3) {
        this.method4696(this.nativeid, ((class699) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method4693(long arg0);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method4694(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method4695(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method4696(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V")
    public final void method121(boolean arg0) {
        this.method4678(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method4697(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
    private final void method4698() {
        this.method4679(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method4699(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method4700(long arg0, class63 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method4701(long arg0, class63 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method4702(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILsj;ZI)Z")
    public final boolean method4703(class499 arg0, int arg1, int arg2, class486 arg3, boolean arg4, int arg5) {
        return this.method4695(this.nativeid, ((class41) arg0).nativeid, arg1, arg2, ((class291) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method4704(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lsj;[III)V")
    public final void method4705(class499 arg0, class486 arg1, int[] arg2, int arg3, int arg4) {
        this.method4699(this.nativeid, ((class41) arg0).nativeid, ((class291) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method4706(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V")
    public class646(class725 arg0, int arg1, int arg2) {
        this.field9273 = arg0;
        this.field9271 = new class41(this.field9273);
        this.field9270 = new class41(this.field9273);
        this.field9267 = new class41(this.field9273);
        this.field9264 = new class41(this.field9273);
        this.field9263 = new class41(this.field9273);
        this.field9272 = new class41(this.field9273);
        this.field9262 = new class41(this.field9273);
        this.field9266 = new class41(this.field9273);
        this.field9268 = new class41(this.field9273);
        this.field9269 = new class41(this.field9273);
        this.method4686(this.nativeid, arg0, arg1, arg2);
    }
}
