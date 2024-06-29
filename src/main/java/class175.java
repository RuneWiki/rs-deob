import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class175 implements class2 {

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Loa;")
    private class426 field2292;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class260 field2294;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class260 field2290;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Li;")
    private class260 field2297;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class260 field2289;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class260 field2288;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class260 field2291;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class260 field2293;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Li;")
    private class260 field2287;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Li;")
    private class260 field2295;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class260 field2296;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Ljava/lang/Runnable;")
    public Runnable field2298;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V", line = 5)
    public final void method1093(class358 arg0, int arg1, int arg2) {
        this.method1095(this.nativeid, ((class531) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class18.method80(-1, this);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V", line = 20)
    private final void method1097() {
        this.method1110(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Loha;[III)V", line = 25)
    public final void method1100(class299 arg0, class465 arg1, int[] arg2, int arg3, int arg4) {
        this.method1099(this.nativeid, ((class260) arg0).nativeid, ((class142) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V", line = 28)
    public final void method1101(class570 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1092(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILoha;ZI)Z", line = 31)
    public final boolean method1102(class299 arg0, int arg1, int arg2, class465 arg3, boolean arg4, int arg5) {
        return this.method1098(this.nativeid, ((class260) arg0).nativeid, arg1, arg2, ((class142) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V", line = 35)
    public final void method1104(class358 arg0, int arg1, int arg2, int arg3) {
        this.method1103(this.nativeid, ((class531) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Loha;[II)V", line = 38)
    public final void method1105(class299 arg0, class465 arg1, int[] arg2, int arg3) {
        this.method1119(this.nativeid, ((class260) arg0).nativeid, ((class142) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILoha;)V", line = 42)
    public final void method1106(class299 arg0, int[] arg1, class465 arg2) {
        this.method1091(this.nativeid, ((class260) arg0).nativeid, arg1, ((class142) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V", line = 45)
    public final void method1107(class299 arg0, class299 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method1116(this.nativeid, ((class260) arg0).nativeid, ((class260) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;", line = 50)
    public final class299 method1108(class260 arg0, byte arg1, int arg2, boolean arg3) {
        class260 var5;
        class260 var6;
        if (arg1 == 1) {
            var5 = this.field2291;
            var6 = this.field2294;
        } else if (arg1 == 2) {
            var5 = this.field2293;
            var6 = this.field2290;
        } else if (arg1 == 3) {
            var5 = this.field2287;
            var6 = this.field2297;
        } else if (arg1 == 4) {
            var5 = this.field2295;
            var6 = this.field2289;
        } else if (arg1 == 5) {
            var5 = this.field2296;
            var6 = this.field2288;
        } else {
            var6 = var5 = new class260(this.field2292);
        }
        arg0.method1658(var6, var5, arg2, arg1 != 0, arg3);
        var6.field3492 = arg0.field3492;
        var6.field3494 = arg0.field3494;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V", line = 94)
    public final void method1109(class570 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method1114(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V", line = 100)
    public final void method1111() {
        this.field2298 = null;
        this.method1097();
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V", line = 105)
    public final void method5(boolean arg0) {
        this.method1113(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V", line = 114)
    private final void method1115() {
        this.method1112(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V", line = 120)
    public final void method1117() {
        this.field2298 = Thread.currentThread();
        this.method1115();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILoha;Z)Z", line = 124)
    public final boolean method1118(class299 arg0, int arg1, int arg2, class465 arg3, boolean arg4) {
        return this.method1094(this.nativeid, ((class260) arg0).nativeid, arg1, arg2, ((class142) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V", line = 130)
    public class175(class426 arg0, int arg1, int arg2) {
        this.field2292 = arg0;
        this.field2294 = new class260(this.field2292);
        this.field2290 = new class260(this.field2292);
        this.field2297 = new class260(this.field2292);
        this.field2289 = new class260(this.field2292);
        this.field2288 = new class260(this.field2292);
        this.field2291 = new class260(this.field2292);
        this.field2293 = new class260(this.field2292);
        this.field2287 = new class260(this.field2292);
        this.field2295 = new class260(this.field2292);
        this.field2296 = new class260(this.field2292);
        this.method1120(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V", line = 145)
    public final void method1121(class358 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method1096(this.nativeid, ((class531) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method1091(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method1092(long arg0, class570 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method1094(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method1095(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method1096(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method1098(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method1099(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method1103(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method1110(long arg0);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method1112(long arg0);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method1113(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method1114(long arg0, class570 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method1116(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method1119(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method1120(long arg0, class570 arg1, int arg2, int arg3);
}
