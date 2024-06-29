import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class663 implements class52 {

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Ll;")
    private class261 field9322;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lv;")
    private class147 field9319;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Lv;")
    private class147 field9324;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Lv;")
    private class147 field9314;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Lv;")
    private class147 field9320;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Lv;")
    private class147 field9317;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Lv;")
    private class147 field9321;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lv;")
    private class147 field9316;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lv;")
    private class147 field9323;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lv;")
    private class147 field9318;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lv;")
    private class147 field9313;

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Ljava/lang/Runnable;")
    public Runnable field9315;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "(Lda;[ILq;)V")
    public final native void method3723(class397 arg0, int[] arg1, class152 arg2);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lv;BIZ)Lda;")
    public final class397 method3724(class147 arg0, byte arg1, int arg2, boolean arg3) {
        class147 var5;
        class147 var6;
        if (arg1 == 1) {
            var5 = this.field9321;
            var6 = this.field9319;
        } else if (arg1 == 2) {
            var5 = this.field9316;
            var6 = this.field9324;
        } else if (arg1 == 3) {
            var5 = this.field9323;
            var6 = this.field9314;
        } else if (arg1 == 4) {
            var5 = this.field9318;
            var6 = this.field9320;
        } else if (arg1 == 5) {
            var5 = this.field9313;
            var6 = this.field9317;
        } else {
            var6 = var5 = new class147(this.field9322);
        }
        arg0.method1124(var6, var5, arg2, arg1 != 0, arg3);
        var6.field2496 = arg0.field2496;
        var6.field2499 = arg0.field2499;
        return var6;
    }

    @OriginalMember(owner = "client!qa", name = "XA", descriptor = "(Lda;IILq;Z)Z")
    public final native boolean method3725(class397 arg0, int arg1, int arg2, class152 arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "DA", descriptor = "(Lr;II)V")
    private final native void method3726(class98 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "UA", descriptor = "(Z)V")
    public final native void method411(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "()V")
    private final native void method3727();

    @OriginalMember(owner = "client!qa", name = "ZA", descriptor = "(Li;II)V")
    public final native void method3728(class682 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
    public final void method3729() {
        this.field9315 = Thread.currentThread();
        this.method3727();
    }

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "()V")
    private final native void method3730();

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "(Lda;Lda;IIIZ)V")
    public final native void method3731(class397 arg0, class397 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!qa", name = "LA", descriptor = "(Lda;Lq;[II)V")
    public final native void method3732(class397 arg0, class152 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
    public final void method3733() {
        this.field9315 = null;
        this.method3730();
    }

    @OriginalMember(owner = "client!qa", name = "HA", descriptor = "(Lr;[I[I[I[SI)V")
    public final native void method3734(class98 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "(Li;IIIIIII[[Z)V")
    public final native void method3735(class682 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "(Lr;IIIIIII)V")
    public final native void method3736(class98 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class388.method2372(this, 0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "(Lda;Lq;[III)V")
    public final native void method3737(class397 arg0, class152 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ll;II)V")
    public class663(class261 arg0, int arg1, int arg2) {
        this.field9322 = arg0;
        this.field9319 = new class147(this.field9322);
        this.field9324 = new class147(this.field9322);
        this.field9314 = new class147(this.field9322);
        this.field9320 = new class147(this.field9322);
        this.field9317 = new class147(this.field9322);
        this.field9321 = new class147(this.field9322);
        this.field9316 = new class147(this.field9322);
        this.field9323 = new class147(this.field9322);
        this.field9318 = new class147(this.field9322);
        this.field9313 = new class147(this.field9322);
        this.method3726(arg0, arg1, arg2);
    }
}
