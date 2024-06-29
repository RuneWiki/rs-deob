import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class227 implements class201 {

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Ll;")
    private class18 field3378;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Lv;")
    private class538 field3381;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lv;")
    private class538 field3383;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Lv;")
    private class538 field3375;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lv;")
    private class538 field3384;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lv;")
    private class538 field3379;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lv;")
    private class538 field3374;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lv;")
    private class538 field3377;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Lv;")
    private class538 field3382;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Lv;")
    private class538 field3385;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lv;")
    private class538 field3380;

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Ljava/lang/Runnable;")
    public Runnable field3376;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "()V")
    private final native void method1540();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
    public final void method1541() {
        this.field3376 = null;
        this.method1540();
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
    public final void method1542() {
        this.field3376 = Thread.currentThread();
        this.method1553();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lv;BIZ)Lda;")
    public final class55 method1543(class538 arg0, byte arg1, int arg2, boolean arg3) {
        class538 var5;
        class538 var6;
        if (arg1 == 1) {
            var5 = this.field3374;
            var6 = this.field3381;
        } else if (arg1 == 2) {
            var5 = this.field3377;
            var6 = this.field3383;
        } else if (arg1 == 3) {
            var5 = this.field3382;
            var6 = this.field3375;
        } else if (arg1 == 4) {
            var5 = this.field3385;
            var6 = this.field3384;
        } else if (arg1 == 5) {
            var5 = this.field3380;
            var6 = this.field3379;
        } else {
            var6 = var5 = new class538(this.field3378);
        }
        arg0.method3108(var6, var5, arg2, arg1 != 0, arg3);
        var6.field7525 = arg0.field7525;
        var6.field7526 = arg0.field7526;
        return var6;
    }

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "(Lda;[ILq;)V")
    public final native void method1544(class55 arg0, int[] arg1, class396 arg2);

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class541.method3123(14336, this);
        }
    }

    @OriginalMember(owner = "client!qa", name = "HA", descriptor = "(Lr;[I[I[I[SI)V")
    public final native void method1545(class167 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "(Li;IIIIIII[[Z)V")
    public final native void method1546(class37 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "(Lda;Lda;IIIZ)V")
    public final native void method1547(class55 arg0, class55 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!qa", name = "LA", descriptor = "(Lda;Lq;[II)V")
    public final native void method1548(class55 arg0, class396 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "XA", descriptor = "(Lda;IILq;Z)Z")
    public final native boolean method1549(class55 arg0, int arg1, int arg2, class396 arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "(Lda;Lq;[III)V")
    public final native void method1550(class55 arg0, class396 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "ZA", descriptor = "(Li;II)V")
    public final native void method1551(class37 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "(Lr;IIIIIII)V")
    public final native void method1552(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "()V")
    private final native void method1553();

    @OriginalMember(owner = "client!qa", name = "UA", descriptor = "(Z)V")
    public final native void method420(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "DA", descriptor = "(Lr;II)V")
    private final native void method1554(class167 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ll;II)V")
    public class227(class18 arg0, int arg1, int arg2) {
        this.field3378 = arg0;
        this.field3381 = new class538(this.field3378);
        this.field3383 = new class538(this.field3378);
        this.field3375 = new class538(this.field3378);
        this.field3384 = new class538(this.field3378);
        this.field3379 = new class538(this.field3378);
        this.field3374 = new class538(this.field3378);
        this.field3377 = new class538(this.field3378);
        this.field3382 = new class538(this.field3378);
        this.field3385 = new class538(this.field3378);
        this.field3380 = new class538(this.field3378);
        this.method1554(arg0, arg1, arg2);
    }
}
