import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class606 implements class128 {

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Lda;")
    private class396 field8199;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Lj;")
    private class300 field8204;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Lj;")
    private class300 field8200;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lj;")
    private class300 field8202;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lj;")
    private class300 field8201;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Lj;")
    private class300 field8197;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Lj;")
    private class300 field8198;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Lj;")
    private class300 field8194;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Lj;")
    private class300 field8195;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Lj;")
    private class300 field8203;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lj;")
    private class300 field8193;

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Ljava/lang/Runnable;")
    public Runnable field8196;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "(Loa;[Lba;Lq;[III)V")
    public final native void method3282(class43 arg0, class107[] arg1, class151 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "ja", descriptor = "()V")
    private final native void method3283();

    @OriginalMember(owner = "client!t", name = "N", descriptor = "(Lba;Lq;[III)V")
    public final native void method3284(class107 arg0, class151 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
    public final void method3285() {
        this.field8196 = null;
        this.method3283();
    }

    @OriginalMember(owner = "client!t", name = "ma", descriptor = "(Ld;II)V")
    public final native void method3286(class88 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "QA", descriptor = "(Loa;II)V")
    private final native void method3287(class43 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class29.method241(56, this);
        }
    }

    @OriginalMember(owner = "client!t", name = "J", descriptor = "(Ld;IIIIIII[[Z)V")
    public final native void method3288(class88 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!t", name = "m", descriptor = "(Loa;Lba;Lq;[II[I[I[I[S[BI[I)V")
    public final native void method3289(class43 arg0, class107 arg1, class151 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lj;BIZ)Lba;")
    public final class107 method3290(class300 arg0, byte arg1, int arg2, boolean arg3) {
        class300 var5;
        class300 var6;
        if (arg1 == 1) {
            var5 = this.field8198;
            var6 = this.field8204;
        } else if (arg1 == 2) {
            var5 = this.field8194;
            var6 = this.field8200;
        } else if (arg1 == 3) {
            var5 = this.field8195;
            var6 = this.field8202;
        } else if (arg1 == 4) {
            var5 = this.field8203;
            var6 = this.field8201;
        } else if (arg1 == 5) {
            var5 = this.field8193;
            var6 = this.field8197;
        } else {
            var6 = var5 = new class300(this.field8199);
        }
        arg0.method1769(var6, var5, arg2, arg1 != 0, arg3);
        var6.field3915 = arg0.field3915;
        var6.field3917 = arg0.field3917;
        return var6;
    }

    @OriginalMember(owner = "client!t", name = "JA", descriptor = "(Lba;[ILq;)V")
    public final native void method3291(class107 arg0, int[] arg1, class151 arg2);

    @OriginalMember(owner = "client!t", name = "w", descriptor = "(Lba;Lq;[II)V")
    public final native void method3292(class107 arg0, class151 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "()V")
    private final native void method3293();

    @OriginalMember(owner = "client!t", name = "v", descriptor = "(Loa;[Lba;Lq;[II[I[I[I[S[BI[I)V")
    public final native void method3294(class43 arg0, class107[] arg1, class151 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!t", name = "WA", descriptor = "(Loa;[I[I[I[SI)V")
    public final native void method3295(class43 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "H", descriptor = "(Z)V")
    public final native void method599(boolean arg0);

    @OriginalMember(owner = "client!t", name = "IA", descriptor = "(Loa;IIIIIII)V")
    public final native void method3296(class43 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!t", name = "o", descriptor = "(Lba;Lba;IIIZ)V")
    public final native void method3297(class107 arg0, class107 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lba;IILq;Z)Z")
    public final native boolean method3298(class107 arg0, int arg1, int arg2, class151 arg3, boolean arg4);

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()V")
    public final void method3299() {
        this.field8196 = Thread.currentThread();
        this.method3293();
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lda;II)V")
    public class606(class396 arg0, int arg1, int arg2) {
        this.field8199 = arg0;
        this.field8204 = new class300(this.field8199);
        this.field8200 = new class300(this.field8199);
        this.field8202 = new class300(this.field8199);
        this.field8201 = new class300(this.field8199);
        this.field8197 = new class300(this.field8199);
        this.field8198 = new class300(this.field8199);
        this.field8194 = new class300(this.field8199);
        this.field8195 = new class300(this.field8199);
        this.field8203 = new class300(this.field8199);
        this.field8193 = new class300(this.field8199);
        this.method3287(arg0, arg1, arg2);
    }
}
