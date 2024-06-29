import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class176 implements class249 {

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Ll;")
    private class171 field2276;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Lv;")
    private class609 field2274;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Lv;")
    private class609 field2273;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Lv;")
    private class609 field2280;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lv;")
    private class609 field2272;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lv;")
    private class609 field2275;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lv;")
    private class609 field2277;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lv;")
    private class609 field2282;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Lv;")
    private class609 field2283;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lv;")
    private class609 field2278;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lv;")
    private class609 field2281;

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Ljava/lang/Runnable;")
    public Runnable field2279;

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "(Lr;IIIIIII)V")
    public final native void method1103(class566 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "(Lda;[ILq;)V")
    public final native void method1104(class474 arg0, int[] arg1, class491 arg2);

    @OriginalMember(owner = "client!qa", name = "DA", descriptor = "(Lr;II)V")
    private final native void method1105(class566 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "XA", descriptor = "(Lda;IILq;Z)Z")
    public final native boolean method1106(class474 arg0, int arg1, int arg2, class491 arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "()V")
    private final native void method1107();

    @OriginalMember(owner = "client!qa", name = "LA", descriptor = "(Lda;Lq;[II)V")
    public final native void method1108(class474 arg0, class491 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
    public final void method1109() {
        this.field2279 = Thread.currentThread();
        this.method1110();
    }

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "()V")
    private final native void method1110();

    @OriginalMember(owner = "client!qa", name = "HA", descriptor = "(Lr;[I[I[I[SI)V")
    public final native void method1111(class566 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "UA", descriptor = "(Z)V")
    public final native void method548(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "ZA", descriptor = "(Li;II)V")
    public final native void method1112(class272 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "(Li;IIIIIII[[Z)V")
    public final native void method1113(class272 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "(Lda;Lq;[III)V")
    public final native void method1114(class474 arg0, class491 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lv;BIZ)Lda;")
    public final class474 method1115(class609 arg0, byte arg1, int arg2, boolean arg3) {
        class609 var5;
        class609 var6;
        if (arg1 == 1) {
            var5 = this.field2277;
            var6 = this.field2274;
        } else if (arg1 == 2) {
            var5 = this.field2282;
            var6 = this.field2273;
        } else if (arg1 == 3) {
            var5 = this.field2283;
            var6 = this.field2280;
        } else if (arg1 == 4) {
            var5 = this.field2278;
            var6 = this.field2272;
        } else if (arg1 == 5) {
            var5 = this.field2281;
            var6 = this.field2275;
        } else {
            var6 = var5 = new class609(this.field2276);
        }
        arg0.method3331(var6, var5, arg2, arg1 != 0, arg3);
        var6.field8551 = arg0.field8551;
        var6.field8549 = arg0.field8549;
        return var6;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
    public final void method1116() {
        this.field2279 = null;
        this.method1107();
    }

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "(Lda;Lda;IIIZ)V")
    public final native void method1117(class474 arg0, class474 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ll;II)V")
    public class176(class171 arg0, int arg1, int arg2) {
        this.field2276 = arg0;
        this.field2274 = new class609(this.field2276);
        this.field2273 = new class609(this.field2276);
        this.field2280 = new class609(this.field2276);
        this.field2272 = new class609(this.field2276);
        this.field2275 = new class609(this.field2276);
        this.field2277 = new class609(this.field2276);
        this.field2282 = new class609(this.field2276);
        this.field2283 = new class609(this.field2276);
        this.field2278 = new class609(this.field2276);
        this.field2281 = new class609(this.field2276);
        this.method1105(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class499.method2689(this, (byte) 107);
        }
    }
}
