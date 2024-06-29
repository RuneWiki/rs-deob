import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class225 implements class200 {

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Ll;")
    private class18 field3136;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lv;")
    private class537 field3134;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Lv;")
    private class537 field3127;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lv;")
    private class537 field3130;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lv;")
    private class537 field3131;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lv;")
    private class537 field3135;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Lv;")
    private class537 field3132;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lv;")
    private class537 field3128;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lv;")
    private class537 field3125;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Lv;")
    private class537 field3133;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Lv;")
    private class537 field3129;

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Ljava/lang/Runnable;")
    public Runnable field3126;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V", line = 14)
    public final void method1420() {
        this.field3126 = Thread.currentThread();
        this.method1421();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lv;BIZ)Lda;", line = 27)
    public final class55 method1422(class537 arg0, byte arg1, int arg2, boolean arg3) {
        class537 var5;
        class537 var6;
        if (arg1 == 1) {
            var5 = this.field3132;
            var6 = this.field3134;
        } else if (arg1 == 2) {
            var5 = this.field3128;
            var6 = this.field3127;
        } else if (arg1 == 3) {
            var5 = this.field3125;
            var6 = this.field3130;
        } else if (arg1 == 4) {
            var5 = this.field3133;
            var6 = this.field3131;
        } else if (arg1 == 5) {
            var5 = this.field3129;
            var6 = this.field3135;
        } else {
            var6 = var5 = new class537(this.field3136);
        }
        arg0.method3040(var6, var5, arg2, arg1 != 0, arg3);
        var6.field7255 = arg0.field7255;
        var6.field7254 = arg0.field7254;
        return var6;
    }

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V", line = 74)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class429.method2464(-56, this);
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V", line = 79)
    public final void method1426() {
        this.field3126 = null;
        this.method1416();
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ll;II)V", line = 91)
    public class225(class18 arg0, int arg1, int arg2) {
        this.field3136 = arg0;
        this.field3134 = new class537(this.field3136);
        this.field3127 = new class537(this.field3136);
        this.field3130 = new class537(this.field3136);
        this.field3131 = new class537(this.field3136);
        this.field3135 = new class537(this.field3136);
        this.field3132 = new class537(this.field3136);
        this.field3128 = new class537(this.field3136);
        this.field3125 = new class537(this.field3136);
        this.field3133 = new class537(this.field3136);
        this.field3129 = new class537(this.field3136);
        this.method1430(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "()V")
    private final native void method1416();

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "(Lda;[ILq;)V")
    public final native void method1417(class55 arg0, int[] arg1, class392 arg2);

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "(Lda;Lq;[III)V")
    public final native void method1418(class55 arg0, class392 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "XA", descriptor = "(Lda;IILq;Z)Z")
    public final native boolean method1419(class55 arg0, int arg1, int arg2, class392 arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "()V")
    private final native void method1421();

    @OriginalMember(owner = "client!qa", name = "UA", descriptor = "(Z)V")
    public final native void method188(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "(Lr;IIIIIII)V")
    public final native void method1423(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!qa", name = "ZA", descriptor = "(Li;II)V")
    public final native void method1424(class37 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "(Lda;Lda;IIIZ)V")
    public final native void method1425(class55 arg0, class55 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!qa", name = "LA", descriptor = "(Lda;Lq;[II)V")
    public final native void method1427(class55 arg0, class392 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "(Li;IIIIIII[[Z)V")
    public final native void method1428(class37 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!qa", name = "HA", descriptor = "(Lr;[I[I[I[SI)V")
    public final native void method1429(class166 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "DA", descriptor = "(Lr;II)V")
    private final native void method1430(class166 arg0, int arg1, int arg2);
}
