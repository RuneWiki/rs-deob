import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class227 implements class201 {

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Ll;")
    private class18 field3644;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Lv;")
    private class537 field3645;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lv;")
    private class537 field3650;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lv;")
    private class537 field3654;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lv;")
    private class537 field3647;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Lv;")
    private class537 field3652;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lv;")
    private class537 field3649;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Lv;")
    private class537 field3646;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Lv;")
    private class537 field3655;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lv;")
    private class537 field3653;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Lv;")
    private class537 field3651;

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Ljava/lang/Runnable;")
    public Runnable field3648;

    @OriginalMember(owner = "client!qa", name = "UA", descriptor = "(Z)V")
    public final native void method312(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "(Li;IIIIIII[[Z)V")
    public final native void method1662(class37 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!qa", name = "LA", descriptor = "(Lda;Lq;[II)V")
    public final native void method1663(class55 arg0, class393 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "()V")
    private final native void method1664();

    @OriginalMember(owner = "client!qa", name = "DA", descriptor = "(Lr;II)V")
    private final native void method1665(class167 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "(Lda;Lda;IIIZ)V")
    public final native void method1666(class55 arg0, class55 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!qa", name = "XA", descriptor = "(Lda;IILq;Z)Z")
    public final native boolean method1667(class55 arg0, int arg1, int arg2, class393 arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
    public final void method1668() {
        this.field3648 = null;
        this.method1664();
    }

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "(Lr;IIIIIII)V")
    public final native void method1669(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!qa", name = "HA", descriptor = "(Lr;[I[I[I[SI)V")
    public final native void method1670(class167 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "()V")
    private final native void method1671();

    @OriginalMember(owner = "client!qa", name = "ZA", descriptor = "(Li;II)V")
    public final native void method1672(class37 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
    public final void method1673() {
        this.field3648 = Thread.currentThread();
        this.method1671();
    }

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "(Lda;[ILq;)V")
    public final native void method1674(class55 arg0, int[] arg1, class393 arg2);

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "(Lda;Lq;[III)V")
    public final native void method1675(class55 arg0, class393 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class222.method1638(-1, this);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lv;BIZ)Lda;")
    public final class55 method1676(class537 arg0, byte arg1, int arg2, boolean arg3) {
        class537 var5;
        class537 var6;
        if (arg1 == 1) {
            var5 = this.field3649;
            var6 = this.field3645;
        } else if (arg1 == 2) {
            var5 = this.field3646;
            var6 = this.field3650;
        } else if (arg1 == 3) {
            var5 = this.field3655;
            var6 = this.field3654;
        } else if (arg1 == 4) {
            var5 = this.field3653;
            var6 = this.field3647;
        } else if (arg1 == 5) {
            var5 = this.field3651;
            var6 = this.field3652;
        } else {
            var6 = var5 = new class537(this.field3644);
        }
        arg0.method3266(var6, var5, arg2, arg1 != 0, arg3);
        var6.field7856 = arg0.field7856;
        var6.field7853 = arg0.field7853;
        return var6;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ll;II)V")
    public class227(class18 arg0, int arg1, int arg2) {
        this.field3644 = arg0;
        this.field3645 = new class537(this.field3644);
        this.field3650 = new class537(this.field3644);
        this.field3654 = new class537(this.field3644);
        this.field3647 = new class537(this.field3644);
        this.field3652 = new class537(this.field3644);
        this.field3649 = new class537(this.field3644);
        this.field3646 = new class537(this.field3644);
        this.field3655 = new class537(this.field3644);
        this.field3653 = new class537(this.field3644);
        this.field3651 = new class537(this.field3644);
        this.method1665(arg0, arg1, arg2);
    }
}
