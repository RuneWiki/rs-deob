import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class663 implements class52 {

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Ll;")
    private class260 field9425;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lv;")
    private class146 field9430;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Lv;")
    private class146 field9428;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lv;")
    private class146 field9434;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lv;")
    private class146 field9424;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Lv;")
    private class146 field9432;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Lv;")
    private class146 field9431;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lv;")
    private class146 field9427;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lv;")
    private class146 field9429;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lv;")
    private class146 field9433;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Lv;")
    private class146 field9426;

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Ljava/lang/Runnable;")
    public Runnable field9435;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V", line = 6)
    public final void method3722() {
        this.field9435 = Thread.currentThread();
        this.method3725();
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V", line = 21)
    public final void method3727() {
        this.field9435 = null;
        this.method3721();
    }

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V", line = 27)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2818(false, this);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lv;BIZ)Lda;", line = 38)
    public final class395 method3731(class146 arg0, byte arg1, int arg2, boolean arg3) {
        class146 var5;
        class146 var6;
        if (arg1 == 1) {
            var5 = this.field9431;
            var6 = this.field9430;
        } else if (arg1 == 2) {
            var5 = this.field9427;
            var6 = this.field9428;
        } else if (arg1 == 3) {
            var5 = this.field9429;
            var6 = this.field9434;
        } else if (arg1 == 4) {
            var5 = this.field9433;
            var6 = this.field9424;
        } else if (arg1 == 5) {
            var5 = this.field9426;
            var6 = this.field9432;
        } else {
            var6 = var5 = new class146(this.field9425);
        }
        arg0.method1013(var6, var5, arg2, arg1 != 0, arg3);
        var6.field2088 = arg0.field2088;
        var6.field2090 = arg0.field2090;
        return var6;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ll;II)V", line = 91)
    public class663(class260 arg0, int arg1, int arg2) {
        this.field9425 = arg0;
        this.field9430 = new class146(this.field9425);
        this.field9428 = new class146(this.field9425);
        this.field9434 = new class146(this.field9425);
        this.field9424 = new class146(this.field9425);
        this.field9432 = new class146(this.field9425);
        this.field9431 = new class146(this.field9425);
        this.field9427 = new class146(this.field9425);
        this.field9429 = new class146(this.field9425);
        this.field9433 = new class146(this.field9425);
        this.field9426 = new class146(this.field9425);
        this.method3735(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "()V")
    private final native void method3721();

    @OriginalMember(owner = "client!qa", name = "UA", descriptor = "(Z)V")
    public final native void method306(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "LA", descriptor = "(Lda;Lq;[II)V")
    public final native void method3723(class395 arg0, class151 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "XA", descriptor = "(Lda;IILq;Z)Z")
    public final native boolean method3724(class395 arg0, int arg1, int arg2, class151 arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "()V")
    private final native void method3725();

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "(Li;IIIIIII[[Z)V")
    public final native void method3726(class682 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "(Lr;IIIIIII)V")
    public final native void method3728(class98 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "(Lda;Lda;IIIZ)V")
    public final native void method3729(class395 arg0, class395 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!qa", name = "HA", descriptor = "(Lr;[I[I[I[SI)V")
    public final native void method3730(class98 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "(Lda;[ILq;)V")
    public final native void method3732(class395 arg0, int[] arg1, class151 arg2);

    @OriginalMember(owner = "client!qa", name = "ZA", descriptor = "(Li;II)V")
    public final native void method3733(class682 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "(Lda;Lq;[III)V")
    public final native void method3734(class395 arg0, class151 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "DA", descriptor = "(Lr;II)V")
    private final native void method3735(class98 arg0, int arg1, int arg2);
}
