import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class222 implements class198 {

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Ll;")
    private class18 field3128;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lv;")
    private class536 field3133;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lv;")
    private class536 field3137;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Lv;")
    private class536 field3134;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Lv;")
    private class536 field3135;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lv;")
    private class536 field3132;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lv;")
    private class536 field3130;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lv;")
    private class536 field3127;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lv;")
    private class536 field3136;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Lv;")
    private class536 field3129;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Lv;")
    private class536 field3138;

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Ljava/lang/Runnable;")
    public Runnable field3131;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V", line = 7)
    public final void method1458() {
        this.field3131 = Thread.currentThread();
        this.method1461();
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V", line = 11)
    public final void method1459() {
        this.field3131 = null;
        this.method1468();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lv;BIZ)Lda;", line = 20)
    public final class55 method1460(class536 arg0, byte arg1, int arg2, boolean arg3) {
        class536 var5;
        class536 var6;
        if (arg1 == 1) {
            var5 = this.field3130;
            var6 = this.field3133;
        } else if (arg1 == 2) {
            var5 = this.field3127;
            var6 = this.field3137;
        } else if (arg1 == 3) {
            var5 = this.field3136;
            var6 = this.field3134;
        } else if (arg1 == 4) {
            var5 = this.field3129;
            var6 = this.field3135;
        } else if (arg1 == 5) {
            var5 = this.field3138;
            var6 = this.field3132;
        } else {
            var6 = var5 = new class536(this.field3128);
        }
        arg0.method3049(var6, var5, arg2, arg1 != 0, arg3);
        var6.field7513 = arg0.field7513;
        var6.field7514 = arg0.field7514;
        return var6;
    }

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V", line = 86)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class509.method2924((byte) -106, this);
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ll;II)V", line = 91)
    public class222(class18 arg0, int arg1, int arg2) {
        this.field3128 = arg0;
        this.field3133 = new class536(this.field3128);
        this.field3137 = new class536(this.field3128);
        this.field3134 = new class536(this.field3128);
        this.field3135 = new class536(this.field3128);
        this.field3132 = new class536(this.field3128);
        this.field3130 = new class536(this.field3128);
        this.field3127 = new class536(this.field3128);
        this.field3136 = new class536(this.field3128);
        this.field3129 = new class536(this.field3128);
        this.field3138 = new class536(this.field3128);
        this.method1470(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qa", name = "ZA", descriptor = "(Li;II)V")
    public final native void method1456(class37 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "(Lda;[ILq;)V")
    public final native void method1457(class55 arg0, int[] arg1, class391 arg2);

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "()V")
    private final native void method1461();

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "(Lr;IIIIIII)V")
    public final native void method1462(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!qa", name = "HA", descriptor = "(Lr;[I[I[I[SI)V")
    public final native void method1463(class166 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "LA", descriptor = "(Lda;Lq;[II)V")
    public final native void method1464(class55 arg0, class391 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "XA", descriptor = "(Lda;IILq;Z)Z")
    public final native boolean method1465(class55 arg0, int arg1, int arg2, class391 arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "(Li;IIIIIII[[Z)V")
    public final native void method1466(class37 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "(Lda;Lq;[III)V")
    public final native void method1467(class55 arg0, class391 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "UA", descriptor = "(Z)V")
    public final native void method131(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "()V")
    private final native void method1468();

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "(Lda;Lda;IIIZ)V")
    public final native void method1469(class55 arg0, class55 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!qa", name = "DA", descriptor = "(Lr;II)V")
    private final native void method1470(class166 arg0, int arg1, int arg2);
}
