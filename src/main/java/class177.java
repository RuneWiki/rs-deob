import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class177 implements class251 {

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Ll;")
    private class172 field1977;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Lv;")
    private class606 field1976;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Lv;")
    private class606 field1986;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lv;")
    private class606 field1984;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lv;")
    private class606 field1975;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Lv;")
    private class606 field1982;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Lv;")
    private class606 field1983;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lv;")
    private class606 field1981;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lv;")
    private class606 field1978;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Lv;")
    private class606 field1979;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lv;")
    private class606 field1985;

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Ljava/lang/Runnable;")
    public Runnable field1980;

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "()V")
    private final native void method1070();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lv;BIZ)Lda;")
    public final class473 method1071(class606 arg0, byte arg1, int arg2, boolean arg3) {
        class606 var5;
        class606 var6;
        if (arg1 == 1) {
            var5 = this.field1983;
            var6 = this.field1976;
        } else if (arg1 == 2) {
            var5 = this.field1981;
            var6 = this.field1986;
        } else if (arg1 == 3) {
            var5 = this.field1978;
            var6 = this.field1984;
        } else if (arg1 == 4) {
            var5 = this.field1979;
            var6 = this.field1975;
        } else if (arg1 == 5) {
            var5 = this.field1985;
            var6 = this.field1982;
        } else {
            var6 = var5 = new class606(this.field1977);
        }
        arg0.method3385(var6, var5, arg2, arg1 != 0, arg3);
        var6.field8506 = arg0.field8506;
        var6.field8504 = arg0.field8504;
        return var6;
    }

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "(Lda;[ILq;)V")
    public final native void method1072(class473 arg0, int[] arg1, class490 arg2);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
    public final void method1073() {
        this.field1980 = Thread.currentThread();
        this.method1070();
    }

    @OriginalMember(owner = "client!qa", name = "HA", descriptor = "(Lr;[I[I[I[SI)V")
    public final native void method1074(class564 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "ZA", descriptor = "(Li;II)V")
    public final native void method1075(class274 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class402.method2265(-110, this);
        }
    }

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "(Lda;Lq;[III)V")
    public final native void method1076(class473 arg0, class490 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "UA", descriptor = "(Z)V")
    public final native void method484(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "LA", descriptor = "(Lda;Lq;[II)V")
    public final native void method1077(class473 arg0, class490 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "(Lda;Lda;IIIZ)V")
    public final native void method1078(class473 arg0, class473 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "()V")
    private final native void method1079();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
    public final void method1080() {
        this.field1980 = null;
        this.method1079();
    }

    @OriginalMember(owner = "client!qa", name = "XA", descriptor = "(Lda;IILq;Z)Z")
    public final native boolean method1081(class473 arg0, int arg1, int arg2, class490 arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "(Lr;IIIIIII)V")
    public final native void method1082(class564 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!qa", name = "DA", descriptor = "(Lr;II)V")
    private final native void method1083(class564 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "(Li;IIIIIII[[Z)V")
    public final native void method1084(class274 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ll;II)V")
    public class177(class172 arg0, int arg1, int arg2) {
        this.field1977 = arg0;
        this.field1976 = new class606(this.field1977);
        this.field1986 = new class606(this.field1977);
        this.field1984 = new class606(this.field1977);
        this.field1975 = new class606(this.field1977);
        this.field1982 = new class606(this.field1977);
        this.field1983 = new class606(this.field1977);
        this.field1981 = new class606(this.field1977);
        this.field1978 = new class606(this.field1977);
        this.field1979 = new class606(this.field1977);
        this.field1985 = new class606(this.field1977);
        this.method1083(arg0, arg1, arg2);
    }
}
