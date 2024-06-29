import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class135 implements class89 {

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lda;")
    private class682 field1704;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Lj;")
    private class206 field1696;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Lj;")
    private class206 field1702;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Lj;")
    private class206 field1701;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Lj;")
    private class206 field1705;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Lj;")
    private class206 field1700;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lj;")
    private class206 field1695;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lj;")
    private class206 field1703;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lj;")
    private class206 field1698;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Lj;")
    private class206 field1697;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Lj;")
    private class206 field1699;

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Ljava/lang/Runnable;")
    public Runnable field1706;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "(Lba;Lq;[III)V")
    public final native void method875(class629 arg0, class111 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lba;IILq;Z)Z")
    public final native boolean method876(class629 arg0, int arg1, int arg2, class111 arg3, boolean arg4);

    @OriginalMember(owner = "client!t", name = "IA", descriptor = "(Loa;IIIIIII)V")
    public final native void method877(class689 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class146.method989((byte) 89, this);
        }
    }

    @OriginalMember(owner = "client!t", name = "ma", descriptor = "(Ld;II)V")
    public final native void method878(class176 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "o", descriptor = "(Lba;Lba;IIIZ)V")
    public final native void method879(class629 arg0, class629 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "ja", descriptor = "()V")
    private final native void method880();

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "()V")
    private final native void method881();

    @OriginalMember(owner = "client!t", name = "w", descriptor = "(Lba;Lq;[II)V")
    public final native void method882(class629 arg0, class111 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "v", descriptor = "(Loa;[Lba;Lq;[II[I[I[I[S[BI[I)V")
    public final native void method883(class689 arg0, class629[] arg1, class111 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!t", name = "n", descriptor = "(Loa;[Lba;Lq;[III)V")
    public final native void method884(class689 arg0, class629[] arg1, class111 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
    public final void method885() {
        this.field1706 = Thread.currentThread();
        this.method881();
    }

    @OriginalMember(owner = "client!t", name = "WA", descriptor = "(Loa;[I[I[I[SI)V")
    public final native void method886(class689 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "J", descriptor = "(Ld;IIIIIII[[Z)V")
    public final native void method887(class176 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!t", name = "H", descriptor = "(Z)V")
    public final native void method80(boolean arg0);

    @OriginalMember(owner = "client!t", name = "m", descriptor = "(Loa;Lba;Lq;[II[I[I[I[S[BI[I)V")
    public final native void method888(class689 arg0, class629 arg1, class111 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()V")
    public final void method889() {
        this.field1706 = null;
        this.method880();
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lj;BIZ)Lba;")
    public final class629 method890(class206 arg0, byte arg1, int arg2, boolean arg3) {
        class206 var5;
        class206 var6;
        if (arg1 == 1) {
            var5 = this.field1695;
            var6 = this.field1696;
        } else if (arg1 == 2) {
            var5 = this.field1703;
            var6 = this.field1702;
        } else if (arg1 == 3) {
            var5 = this.field1698;
            var6 = this.field1701;
        } else if (arg1 == 4) {
            var5 = this.field1697;
            var6 = this.field1705;
        } else if (arg1 == 5) {
            var5 = this.field1699;
            var6 = this.field1700;
        } else {
            var6 = var5 = new class206(this.field1704);
        }
        arg0.method1288(var6, var5, arg2, arg1 != 0, arg3);
        var6.field2691 = arg0.field2691;
        var6.field2689 = arg0.field2689;
        return var6;
    }

    @OriginalMember(owner = "client!t", name = "JA", descriptor = "(Lba;[ILq;)V")
    public final native void method891(class629 arg0, int[] arg1, class111 arg2);

    @OriginalMember(owner = "client!t", name = "QA", descriptor = "(Loa;II)V")
    private final native void method892(class689 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lda;II)V")
    public class135(class682 arg0, int arg1, int arg2) {
        this.field1704 = arg0;
        this.field1696 = new class206(this.field1704);
        this.field1702 = new class206(this.field1704);
        this.field1701 = new class206(this.field1704);
        this.field1705 = new class206(this.field1704);
        this.field1700 = new class206(this.field1704);
        this.field1695 = new class206(this.field1704);
        this.field1703 = new class206(this.field1704);
        this.field1698 = new class206(this.field1704);
        this.field1697 = new class206(this.field1704);
        this.field1699 = new class206(this.field1704);
        this.method892(arg0, arg1, arg2);
    }
}
