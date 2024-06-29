import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class646 implements class559 {

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Loa;")
    private class724 field8800;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class44 field8795;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class44 field8799;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class44 field8798;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class44 field8803;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class44 field8794;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class44 field8801;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Li;")
    private class44 field8802;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Li;")
    private class44 field8792;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class44 field8796;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class44 field8793;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Ljava/lang/Runnable;")
    public Runnable field8797;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lnh;[III)V")
    public final void method3608(class498 arg0, class778 arg1, int[] arg2, int arg3, int arg4) {
        this.method3621(this.nativeid, ((class44) arg0).nativeid, ((class294) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class405.method2430((byte) -104, this);
        }
    }

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method3609(long arg0, class66 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method3610(long arg0, class66 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
    private final void method3611() {
        this.method3616(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method3612(long arg0);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method3613(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V")
    public final void method3614(class66 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method3628(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method3615(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method3616(long arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;")
    public final class498 method3617(class44 arg0, byte arg1, int arg2, boolean arg3) {
        class44 var5;
        class44 var6;
        if (arg1 == 1) {
            var5 = this.field8801;
            var6 = this.field8795;
        } else if (arg1 == 2) {
            var5 = this.field8802;
            var6 = this.field8799;
        } else if (arg1 == 3) {
            var5 = this.field8792;
            var6 = this.field8798;
        } else if (arg1 == 4) {
            var5 = this.field8796;
            var6 = this.field8803;
        } else if (arg1 == 5) {
            var5 = this.field8793;
            var6 = this.field8794;
        } else {
            var6 = var5 = new class44(this.field8800);
        }
        arg0.method387(var6, var5, arg2, arg1 != 0, arg3);
        var6.field598 = arg0.field598;
        var6.field596 = arg0.field596;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method3618(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method3619(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V")
    public final void method3620(class498 arg0, class498 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3632(this.nativeid, ((class44) arg0).nativeid, ((class44) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method3621(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
    public final void method3622() {
        this.field8797 = null;
        this.method3611();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V")
    public final void method3623(class296 arg0, int arg1, int arg2, int arg3) {
        this.method3619(this.nativeid, ((class698) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lnh;[II)V")
    public final void method3624(class498 arg0, class778 arg1, int[] arg2, int arg3) {
        this.method3629(this.nativeid, ((class44) arg0).nativeid, ((class294) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILnh;Z)Z")
    public final boolean method3625(class498 arg0, int arg1, int arg2, class778 arg3, boolean arg4) {
        return this.method3638(this.nativeid, ((class44) arg0).nativeid, arg1, arg2, ((class294) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method3626(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V")
    public final void method3627() {
        this.field8797 = Thread.currentThread();
        this.method3630();
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V")
    public final void method229(boolean arg0) {
        this.method3618(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method3628(long arg0, class66 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method3629(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V")
    private final void method3630() {
        this.method3612(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V")
    public final void method3631(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3609(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method3632(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method3633(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V")
    public final void method3634(class296 arg0, int arg1, int arg2) {
        this.method3633(this.nativeid, ((class698) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V")
    public final void method3635(class296 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method3626(this.nativeid, ((class698) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILnh;)V")
    public final void method3636(class498 arg0, int[] arg1, class778 arg2) {
        this.method3615(this.nativeid, ((class44) arg0).nativeid, arg1, ((class294) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILnh;ZI)Z")
    public final boolean method3637(class498 arg0, int arg1, int arg2, class778 arg3, boolean arg4, int arg5) {
        return this.method3613(this.nativeid, ((class44) arg0).nativeid, arg1, arg2, ((class294) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method3638(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V")
    public class646(class724 arg0, int arg1, int arg2) {
        this.field8800 = arg0;
        this.field8795 = new class44(this.field8800);
        this.field8799 = new class44(this.field8800);
        this.field8798 = new class44(this.field8800);
        this.field8803 = new class44(this.field8800);
        this.field8794 = new class44(this.field8800);
        this.field8801 = new class44(this.field8800);
        this.field8802 = new class44(this.field8800);
        this.field8792 = new class44(this.field8800);
        this.field8796 = new class44(this.field8800);
        this.field8793 = new class44(this.field8800);
        this.method3610(this.nativeid, arg0, arg1, arg2);
    }
}
