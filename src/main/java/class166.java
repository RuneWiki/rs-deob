import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class166 implements class2 {

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Loa;")
    private class406 field2272;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class246 field2273;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class246 field2275;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Li;")
    private class246 field2276;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class246 field2268;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class246 field2270;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class246 field2269;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Li;")
    private class246 field2274;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class246 field2267;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class246 field2277;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Li;")
    private class246 field2271;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Ljava/lang/Runnable;")
    public Runnable field2266;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V", line = 4)
    public final void method1026(class545 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method1040(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V", line = 10)
    public final void method1029(class339 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method1028(this.nativeid, ((class508) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V", line = 14)
    public final void method1031() {
        this.field2266 = Thread.currentThread();
        this.method1045();
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 19)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class301.method1765(this, 0);
        }
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V", line = 31)
    public final void method3(boolean arg0) {
        this.method1052(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILuha;Z)Z", line = 36)
    public final boolean method1036(class283 arg0, int arg1, int arg2, class723 arg3, boolean arg4) {
        return this.method1032(this.nativeid, ((class246) arg0).nativeid, arg1, arg2, ((class135) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILuha;ZI)Z", line = 44)
    public final boolean method1041(class283 arg0, int arg1, int arg2, class723 arg3, boolean arg4, int arg5) {
        return this.method1034(this.nativeid, ((class246) arg0).nativeid, arg1, arg2, ((class135) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;", line = 51)
    public final class283 method1042(class246 arg0, byte arg1, int arg2, boolean arg3) {
        class246 var5;
        class246 var6;
        if (arg1 == 1) {
            var5 = this.field2269;
            var6 = this.field2273;
        } else if (arg1 == 2) {
            var5 = this.field2274;
            var6 = this.field2275;
        } else if (arg1 == 3) {
            var5 = this.field2267;
            var6 = this.field2276;
        } else if (arg1 == 4) {
            var5 = this.field2277;
            var6 = this.field2268;
        } else if (arg1 == 5) {
            var5 = this.field2271;
            var6 = this.field2270;
        } else {
            var6 = var5 = new class246(this.field2272);
        }
        arg0.method1568(var6, var5, arg2, arg1 != 0, arg3);
        var6.field3426 = arg0.field3426;
        var6.field3427 = arg0.field3427;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V", line = 95)
    public final void method1043(class283 arg0, class283 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method1033(this.nativeid, ((class246) arg0).nativeid, ((class246) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V", line = 101)
    private final void method1045() {
        this.method1037(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Luha;[II)V", line = 104)
    public final void method1046(class283 arg0, class723 arg1, int[] arg2, int arg3) {
        this.method1038(this.nativeid, ((class246) arg0).nativeid, ((class135) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V", line = 107)
    public final void method1047() {
        this.field2266 = null;
        this.method1054();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Luha;[III)V", line = 111)
    public final void method1048(class283 arg0, class723 arg1, int[] arg2, int arg3, int arg4) {
        this.method1030(this.nativeid, ((class246) arg0).nativeid, ((class135) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V", line = 114)
    public final void method1049(class339 arg0, int arg1, int arg2, int arg3) {
        this.method1035(this.nativeid, ((class508) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILuha;)V", line = 118)
    public final void method1051(class283 arg0, int[] arg1, class723 arg2) {
        this.method1050(this.nativeid, ((class246) arg0).nativeid, arg1, ((class135) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V", line = 123)
    public final void method1053(class339 arg0, int arg1, int arg2) {
        this.method1039(this.nativeid, ((class508) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V", line = 127)
    private final void method1054() {
        this.method1044(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V", line = 129)
    public class166(class406 arg0, int arg1, int arg2) {
        this.field2272 = arg0;
        this.field2273 = new class246(this.field2272);
        this.field2275 = new class246(this.field2272);
        this.field2276 = new class246(this.field2272);
        this.field2268 = new class246(this.field2272);
        this.field2270 = new class246(this.field2272);
        this.field2269 = new class246(this.field2272);
        this.field2274 = new class246(this.field2272);
        this.field2267 = new class246(this.field2272);
        this.field2277 = new class246(this.field2272);
        this.field2271 = new class246(this.field2272);
        this.method1027(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V", line = 144)
    public final void method1055(class545 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1056(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method1027(long arg0, class545 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method1028(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method1030(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method1032(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method1033(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method1034(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method1035(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method1037(long arg0);

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method1038(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method1039(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method1040(long arg0, class545 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method1044(long arg0);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method1050(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method1052(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method1056(long arg0, class545 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);
}
