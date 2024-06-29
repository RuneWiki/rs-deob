import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class173 implements class247 {

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Ll;")
    private class168 field2457;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Lv;")
    private class605 field2448;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Lv;")
    private class605 field2454;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Lv;")
    private class605 field2455;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lv;")
    private class605 field2456;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Lv;")
    private class605 field2449;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lv;")
    private class605 field2453;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lv;")
    private class605 field2450;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lv;")
    private class605 field2452;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Lv;")
    private class605 field2458;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Lv;")
    private class605 field2451;

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Ljava/lang/Runnable;")
    public Runnable field2447;

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V", line = 10)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class69.method386(-1995, this);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lv;BIZ)Lda;", line = 19)
    public final class470 method1174(class605 arg0, byte arg1, int arg2, boolean arg3) {
        class605 var5;
        class605 var6;
        if (arg1 == 1) {
            var5 = this.field2453;
            var6 = this.field2448;
        } else if (arg1 == 2) {
            var5 = this.field2450;
            var6 = this.field2454;
        } else if (arg1 == 3) {
            var5 = this.field2452;
            var6 = this.field2455;
        } else if (arg1 == 4) {
            var5 = this.field2458;
            var6 = this.field2456;
        } else if (arg1 == 5) {
            var5 = this.field2451;
            var6 = this.field2449;
        } else {
            var6 = var5 = new class605(this.field2457);
        }
        arg0.method3367(var6, var5, arg2, arg1 != 0, arg3);
        var6.field8444 = arg0.field8444;
        var6.field8445 = arg0.field8445;
        return var6;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V", line = 66)
    public final void method1176() {
        this.field2447 = Thread.currentThread();
        this.method1173();
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V", line = 80)
    public final void method1182() {
        this.field2447 = null;
        this.method1179();
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ll;II)V", line = 91)
    public class173(class168 arg0, int arg1, int arg2) {
        this.field2457 = arg0;
        this.field2448 = new class605(this.field2457);
        this.field2454 = new class605(this.field2457);
        this.field2455 = new class605(this.field2457);
        this.field2456 = new class605(this.field2457);
        this.field2449 = new class605(this.field2457);
        this.field2453 = new class605(this.field2457);
        this.field2450 = new class605(this.field2457);
        this.field2452 = new class605(this.field2457);
        this.field2458 = new class605(this.field2457);
        this.field2451 = new class605(this.field2457);
        this.method1172(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "(Lda;[ILq;)V")
    public final native void method1171(class470 arg0, int[] arg1, class487 arg2);

    @OriginalMember(owner = "client!qa", name = "DA", descriptor = "(Lr;II)V")
    private final native void method1172(class562 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "()V")
    private final native void method1173();

    @OriginalMember(owner = "client!qa", name = "UA", descriptor = "(Z)V")
    public final native void method528(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "(Lda;Lda;IIIZ)V")
    public final native void method1175(class470 arg0, class470 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!qa", name = "XA", descriptor = "(Lda;IILq;Z)Z")
    public final native boolean method1177(class470 arg0, int arg1, int arg2, class487 arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "LA", descriptor = "(Lda;Lq;[II)V")
    public final native void method1178(class470 arg0, class487 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "()V")
    private final native void method1179();

    @OriginalMember(owner = "client!qa", name = "ZA", descriptor = "(Li;II)V")
    public final native void method1180(class270 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "(Lda;Lq;[III)V")
    public final native void method1181(class470 arg0, class487 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "HA", descriptor = "(Lr;[I[I[I[SI)V")
    public final native void method1183(class562 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "(Li;IIIIIII[[Z)V")
    public final native void method1184(class270 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "(Lr;IIIIIII)V")
    public final native void method1185(class562 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);
}
