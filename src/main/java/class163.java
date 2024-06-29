import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class163 implements class2 {

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Loa;")
    private class406 field2528;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Li;")
    private class244 field2524;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class244 field2522;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class244 field2530;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class244 field2523;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Li;")
    private class244 field2529;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Li;")
    private class244 field2519;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Li;")
    private class244 field2527;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class244 field2521;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class244 field2520;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class244 field2525;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Ljava/lang/Runnable;")
    public Runnable field2526;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;", line = 6)
    public final class282 method1200(class244 arg0, byte arg1, int arg2, boolean arg3) {
        class244 var5;
        class244 var6;
        if (arg1 == 1) {
            var5 = this.field2519;
            var6 = this.field2524;
        } else if (arg1 == 2) {
            var5 = this.field2527;
            var6 = this.field2522;
        } else if (arg1 == 3) {
            var5 = this.field2521;
            var6 = this.field2530;
        } else if (arg1 == 4) {
            var5 = this.field2520;
            var6 = this.field2523;
        } else if (arg1 == 5) {
            var5 = this.field2525;
            var6 = this.field2529;
        } else {
            var6 = var5 = new class244(this.field2528);
        }
        arg0.method1693(var6, var5, arg2, arg1 != 0, arg3);
        var6.field3933 = arg0.field3933;
        var6.field3932 = arg0.field3932;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V", line = 50)
    public final void method5(boolean arg0) {
        this.method1203(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V", line = 53)
    public final void method1201(class339 arg0, int arg1, int arg2) {
        this.method1223(this.nativeid, ((class507) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILtc;Z)Z", line = 63)
    public final boolean method1206(class282 arg0, int arg1, int arg2, class73 arg3, boolean arg4) {
        return this.method1217(this.nativeid, ((class244) arg0).nativeid, arg1, arg2, ((class132) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V", line = 67)
    public final void method1208(class282 arg0, class282 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method1202(this.nativeid, ((class244) arg0).nativeid, ((class244) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Ltc;[III)V", line = 70)
    public final void method1209(class282 arg0, class73 arg1, int[] arg2, int arg3, int arg4) {
        this.method1204(this.nativeid, ((class244) arg0).nativeid, ((class132) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 74)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class389.method2431(this, 3);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILtc;ZI)Z", line = 79)
    public final boolean method1210(class282 arg0, int arg1, int arg2, class73 arg3, boolean arg4, int arg5) {
        return this.method1205(this.nativeid, ((class244) arg0).nativeid, arg1, arg2, ((class132) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILtc;)V", line = 82)
    public final void method1211(class282 arg0, int[] arg1, class73 arg2) {
        this.method1227(this.nativeid, ((class244) arg0).nativeid, arg1, ((class132) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V", line = 88)
    public final void method1214() {
        this.field2526 = null;
        this.method1228();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V", line = 95)
    public final void method1216(class339 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method1220(this.nativeid, ((class507) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V", line = 99)
    private final void method1218() {
        this.method1213(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V", line = 104)
    public final void method1221(class544 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1212(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V", line = 109)
    public final void method1222() {
        this.field2526 = Thread.currentThread();
        this.method1218();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Ltc;[II)V", line = 116)
    public final void method1225(class282 arg0, class73 arg1, int[] arg2, int arg3) {
        this.method1215(this.nativeid, ((class244) arg0).nativeid, ((class132) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V", line = 119)
    public final void method1226(class544 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method1224(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V", line = 124)
    private final void method1228() {
        this.method1207(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V", line = 130)
    public final void method1230(class339 arg0, int arg1, int arg2, int arg3) {
        this.method1229(this.nativeid, ((class507) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V", line = 133)
    public class163(class406 arg0, int arg1, int arg2) {
        this.field2528 = arg0;
        this.field2524 = new class244(this.field2528);
        this.field2522 = new class244(this.field2528);
        this.field2530 = new class244(this.field2528);
        this.field2523 = new class244(this.field2528);
        this.field2529 = new class244(this.field2528);
        this.field2519 = new class244(this.field2528);
        this.field2527 = new class244(this.field2528);
        this.field2521 = new class244(this.field2528);
        this.field2520 = new class244(this.field2528);
        this.field2525 = new class244(this.field2528);
        this.method1219(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method1202(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method1203(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method1204(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method1205(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method1207(long arg0);

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method1212(long arg0, class544 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method1213(long arg0);

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method1215(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method1217(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method1219(long arg0, class544 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method1220(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method1223(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method1224(long arg0, class544 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method1227(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method1229(long arg0, long arg1, int arg2, int arg3, int arg4);
}
