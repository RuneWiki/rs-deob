import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class164 implements class2 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Loa;")
    private class406 field2328;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class244 field2329;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class244 field2334;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class244 field2337;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class244 field2330;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class244 field2331;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class244 field2335;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Li;")
    private class244 field2336;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class244 field2332;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Li;")
    private class244 field2338;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class244 field2339;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Ljava/lang/Runnable;")
    public Runnable field2333;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V", line = 3)
    public final void method1150(class282 arg0, class282 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method1166(this.nativeid, ((class244) arg0).nativeid, ((class244) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;", line = 9)
    public final class282 method1151(class244 arg0, byte arg1, int arg2, boolean arg3) {
        class244 var5;
        class244 var6;
        if (arg1 == 1) {
            var5 = this.field2335;
            var6 = this.field2329;
        } else if (arg1 == 2) {
            var5 = this.field2336;
            var6 = this.field2334;
        } else if (arg1 == 3) {
            var5 = this.field2332;
            var6 = this.field2337;
        } else if (arg1 == 4) {
            var5 = this.field2338;
            var6 = this.field2330;
        } else if (arg1 == 5) {
            var5 = this.field2339;
            var6 = this.field2331;
        } else {
            var6 = var5 = new class244(this.field2328);
        }
        arg0.method1668(var6, var5, arg2, arg1 != 0, arg3);
        var6.field3586 = arg0.field3586;
        var6.field3585 = arg0.field3585;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 53)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class260.method1726(this, false);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V", line = 58)
    private final void method1152() {
        this.method1168(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V", line = 62)
    public final void method1154(class339 arg0, int arg1, int arg2) {
        this.method1175(this.nativeid, ((class508) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILsk;ZI)Z", line = 67)
    public final boolean method1155(class282 arg0, int arg1, int arg2, class121 arg3, boolean arg4, int arg5) {
        return this.method1153(this.nativeid, ((class244) arg0).nativeid, arg1, arg2, ((class134) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V", line = 72)
    private final void method1157() {
        this.method1171(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V", line = 78)
    public final void method1161() {
        this.field2333 = Thread.currentThread();
        this.method1152();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V", line = 82)
    public final void method1162(class339 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method1167(this.nativeid, ((class508) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILsk;Z)Z", line = 85)
    public final boolean method1163(class282 arg0, int arg1, int arg2, class121 arg3, boolean arg4) {
        return this.method1177(this.nativeid, ((class244) arg0).nativeid, arg1, arg2, ((class134) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V", line = 90)
    public final void method1165(class339 arg0, int arg1, int arg2, int arg3) {
        this.method1176(this.nativeid, ((class508) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V", line = 96)
    public final void method9(boolean arg0) {
        this.method1159(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V", line = 101)
    public final void method1169() {
        this.field2333 = null;
        this.method1157();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILsk;)V", line = 111)
    public final void method1172(class282 arg0, int[] arg1, class121 arg2) {
        this.method1160(this.nativeid, ((class244) arg0).nativeid, arg1, ((class134) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V", line = 115)
    public final void method1174(class543 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1156(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V", line = 125)
    public final void method1178(class543 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method1158(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lsk;[II)V", line = 128)
    public final void method1179(class282 arg0, class121 arg1, int[] arg2, int arg3) {
        this.method1173(this.nativeid, ((class244) arg0).nativeid, ((class134) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lsk;[III)V", line = 131)
    public final void method1180(class282 arg0, class121 arg1, int[] arg2, int arg3, int arg4) {
        this.method1164(this.nativeid, ((class244) arg0).nativeid, ((class134) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V", line = 133)
    public class164(class406 arg0, int arg1, int arg2) {
        this.field2328 = arg0;
        this.field2329 = new class244(this.field2328);
        this.field2334 = new class244(this.field2328);
        this.field2337 = new class244(this.field2328);
        this.field2330 = new class244(this.field2328);
        this.field2331 = new class244(this.field2328);
        this.field2335 = new class244(this.field2328);
        this.field2336 = new class244(this.field2328);
        this.field2332 = new class244(this.field2328);
        this.field2338 = new class244(this.field2328);
        this.field2339 = new class244(this.field2328);
        this.method1170(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method1153(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method1156(long arg0, class543 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method1158(long arg0, class543 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method1159(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method1160(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method1164(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method1166(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method1167(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method1168(long arg0);

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method1170(long arg0, class543 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method1171(long arg0);

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method1173(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method1175(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method1176(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method1177(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);
}
