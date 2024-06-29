import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class225 implements class199 {

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Ll;")
    private class18 field2921;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lv;")
    private class535 field2920;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Lv;")
    private class535 field2917;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Lv;")
    private class535 field2923;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lv;")
    private class535 field2924;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lv;")
    private class535 field2925;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Lv;")
    private class535 field2922;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Lv;")
    private class535 field2926;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lv;")
    private class535 field2915;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Lv;")
    private class535 field2919;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Lv;")
    private class535 field2916;

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Ljava/lang/Runnable;")
    public Runnable field2918;

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class542.method3175(this, 0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lv;BIZ)Lda;", line = 17)
    public final class55 method1365(class535 arg0, byte arg1, int arg2, boolean arg3) {
        class535 var5;
        class535 var6;
        if (arg1 == 1) {
            var5 = this.field2922;
            var6 = this.field2920;
        } else if (arg1 == 2) {
            var5 = this.field2926;
            var6 = this.field2917;
        } else if (arg1 == 3) {
            var5 = this.field2915;
            var6 = this.field2923;
        } else if (arg1 == 4) {
            var5 = this.field2919;
            var6 = this.field2924;
        } else if (arg1 == 5) {
            var5 = this.field2916;
            var6 = this.field2925;
        } else {
            var6 = var5 = new class535(this.field2921);
        }
        arg0.method3147(var6, var5, arg2, arg1 != 0, arg3);
        var6.field7801 = arg0.field7801;
        var6.field7802 = arg0.field7802;
        return var6;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V", line = 61)
    public final void method1366() {
        this.field2918 = Thread.currentThread();
        this.method1361();
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V", line = 77)
    public final void method1372() {
        this.field2918 = null;
        this.method1374();
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ll;II)V", line = 91)
    public class225(class18 arg0, int arg1, int arg2) {
        this.field2921 = arg0;
        this.field2920 = new class535(this.field2921);
        this.field2917 = new class535(this.field2921);
        this.field2923 = new class535(this.field2921);
        this.field2924 = new class535(this.field2921);
        this.field2925 = new class535(this.field2921);
        this.field2922 = new class535(this.field2921);
        this.field2926 = new class535(this.field2921);
        this.field2915 = new class535(this.field2921);
        this.field2919 = new class535(this.field2921);
        this.field2916 = new class535(this.field2921);
        this.method1375(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "()V")
    private final native void method1361();

    @OriginalMember(owner = "client!qa", name = "ZA", descriptor = "(Li;II)V")
    public final native void method1362(class37 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "XA", descriptor = "(Lda;IILq;Z)Z")
    public final native boolean method1363(class55 arg0, int arg1, int arg2, class394 arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "(Li;IIIIIII[[Z)V")
    public final native void method1364(class37 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!qa", name = "LA", descriptor = "(Lda;Lq;[II)V")
    public final native void method1367(class55 arg0, class394 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "(Lda;Lq;[III)V")
    public final native void method1368(class55 arg0, class394 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "HA", descriptor = "(Lr;[I[I[I[SI)V")
    public final native void method1369(class165 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "(Lr;IIIIIII)V")
    public final native void method1370(class165 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "(Lda;[ILq;)V")
    public final native void method1371(class55 arg0, int[] arg1, class394 arg2);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "(Lda;Lda;IIIZ)V")
    public final native void method1373(class55 arg0, class55 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "()V")
    private final native void method1374();

    @OriginalMember(owner = "client!qa", name = "DA", descriptor = "(Lr;II)V")
    private final native void method1375(class165 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "UA", descriptor = "(Z)V")
    public final native void method221(boolean arg0);
}
