import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class644 implements class558 {

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Loa;")
    private class721 field9335;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Li;")
    private class44 field9340;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class44 field9336;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class44 field9341;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Li;")
    private class44 field9342;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class44 field9339;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class44 field9333;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Li;")
    private class44 field9338;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class44 field9344;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class44 field9337;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class44 field9334;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Ljava/lang/Runnable;")
    public Runnable field9343;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method4716(long arg0, class66 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method4717(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method4718(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V")
    public final void method4719(class294 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method4718(this.nativeid, ((class696) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILqq;)V")
    public final void method4720(class497 arg0, int[] arg1, class501 arg2) {
        this.method4734(this.nativeid, ((class44) arg0).nativeid, arg1, ((class292) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method4721(long arg0);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method4722(long arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lqq;[III)V")
    public final void method4723(class497 arg0, class501 arg1, int[] arg2, int arg3, int arg4) {
        this.method4717(this.nativeid, ((class44) arg0).nativeid, ((class292) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V")
    public final void method4724(class294 arg0, int arg1, int arg2) {
        this.method4728(this.nativeid, ((class696) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method4725(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V")
    public final void method4726() {
        this.field9343 = Thread.currentThread();
        this.method4738();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V")
    public final void method4727(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method4744(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method4728(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;")
    public final class497 method4729(class44 arg0, byte arg1, int arg2, boolean arg3) {
        class44 var5;
        class44 var6;
        if (arg1 == 1) {
            var5 = this.field9333;
            var6 = this.field9340;
        } else if (arg1 == 2) {
            var5 = this.field9338;
            var6 = this.field9336;
        } else if (arg1 == 3) {
            var5 = this.field9344;
            var6 = this.field9341;
        } else if (arg1 == 4) {
            var5 = this.field9337;
            var6 = this.field9342;
        } else if (arg1 == 5) {
            var5 = this.field9334;
            var6 = this.field9339;
        } else {
            var6 = var5 = new class44(this.field9335);
        }
        arg0.method299(var6, var5, arg2, arg1 != 0, arg3);
        var6.field515 = arg0.field515;
        var6.field514 = arg0.field514;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V")
    public final void method4730(class497 arg0, class497 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method4737(this.nativeid, ((class44) arg0).nativeid, ((class44) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V")
    private final void method4731() {
        this.method4721(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method4732(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lqq;[II)V")
    public final void method4733(class497 arg0, class501 arg1, int[] arg2, int arg3) {
        this.method4732(this.nativeid, ((class44) arg0).nativeid, ((class292) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class201.method1801((byte) -43, this);
        }
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method4734(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method4735(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method4736(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V")
    public final void method130(boolean arg0) {
        this.method4725(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method4737(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
    private final void method4738() {
        this.method4722(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V")
    public final void method4739(class294 arg0, int arg1, int arg2, int arg3) {
        this.method4735(this.nativeid, ((class696) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method4740(long arg0, class66 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
    public final void method4741() {
        this.field9343 = null;
        this.method4731();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V")
    public final void method4742(class66 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method4716(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILqq;ZI)Z")
    public final boolean method4743(class497 arg0, int arg1, int arg2, class501 arg3, boolean arg4, int arg5) {
        return this.method4746(this.nativeid, ((class44) arg0).nativeid, arg1, arg2, ((class292) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method4744(long arg0, class66 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILqq;Z)Z")
    public final boolean method4745(class497 arg0, int arg1, int arg2, class501 arg3, boolean arg4) {
        return this.method4736(this.nativeid, ((class44) arg0).nativeid, arg1, arg2, ((class292) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method4746(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V")
    public class644(class721 arg0, int arg1, int arg2) {
        this.field9335 = arg0;
        this.field9340 = new class44(this.field9335);
        this.field9336 = new class44(this.field9335);
        this.field9341 = new class44(this.field9335);
        this.field9342 = new class44(this.field9335);
        this.field9339 = new class44(this.field9335);
        this.field9333 = new class44(this.field9335);
        this.field9338 = new class44(this.field9335);
        this.field9344 = new class44(this.field9335);
        this.field9337 = new class44(this.field9335);
        this.field9334 = new class44(this.field9335);
        this.method4740(this.nativeid, arg0, arg1, arg2);
    }
}
