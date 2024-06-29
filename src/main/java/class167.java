import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class167 implements class2 {

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Loa;")
    private class408 field2330;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class247 field2337;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class247 field2332;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Li;")
    private class247 field2326;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Li;")
    private class247 field2334;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Li;")
    private class247 field2336;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class247 field2329;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class247 field2335;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class247 field2333;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class247 field2327;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Li;")
    private class247 field2331;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Ljava/lang/Runnable;")
    public Runnable field2328;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V", line = 3)
    public final void method1045() {
        this.field2328 = Thread.currentThread();
        this.method1057();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lih;[III)V", line = 8)
    public final void method1047(class284 arg0, class744 arg1, int[] arg2, int arg3, int arg4) {
        this.method1064(this.nativeid, ((class247) arg0).nativeid, ((class136) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V", line = 11)
    public final void method1048(class341 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method1062(this.nativeid, ((class511) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILih;)V", line = 15)
    public final void method1049(class284 arg0, int[] arg1, class744 arg2) {
        this.method1046(this.nativeid, ((class247) arg0).nativeid, arg1, ((class136) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;", line = 21)
    public final class284 method1051(class247 arg0, byte arg1, int arg2, boolean arg3) {
        class247 var5;
        class247 var6;
        if (arg1 == 1) {
            var5 = this.field2329;
            var6 = this.field2337;
        } else if (arg1 == 2) {
            var5 = this.field2335;
            var6 = this.field2332;
        } else if (arg1 == 3) {
            var5 = this.field2333;
            var6 = this.field2326;
        } else if (arg1 == 4) {
            var5 = this.field2327;
            var6 = this.field2334;
        } else if (arg1 == 5) {
            var5 = this.field2331;
            var6 = this.field2336;
        } else {
            var6 = var5 = new class247(this.field2330);
        }
        arg0.method1676(var6, var5, arg2, arg1 != 0, arg3);
        var6.field3642 = arg0.field3642;
        var6.field3641 = arg0.field3641;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V", line = 66)
    public final void method1052(class284 arg0, class284 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method1061(this.nativeid, ((class247) arg0).nativeid, ((class247) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILih;Z)Z", line = 69)
    public final boolean method1053(class284 arg0, int arg1, int arg2, class744 arg3, boolean arg4) {
        return this.method1054(this.nativeid, ((class247) arg0).nativeid, arg1, arg2, ((class136) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V", line = 75)
    public final void method1055() {
        this.field2328 = null;
        this.method1072();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILih;ZI)Z", line = 79)
    public final boolean method1056(class284 arg0, int arg1, int arg2, class744 arg3, boolean arg4, int arg5) {
        return this.method1067(this.nativeid, ((class247) arg0).nativeid, arg1, arg2, ((class136) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V", line = 82)
    private final void method1057() {
        this.method1075(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V", line = 88)
    public final void method1059(class341 arg0, int arg1, int arg2, int arg3) {
        this.method1073(this.nativeid, ((class511) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V", line = 99)
    public final void method12(boolean arg0) {
        this.method1068(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 103)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class556.method3276((byte) -10, this);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V", line = 109)
    public final void method1063(class341 arg0, int arg1, int arg2) {
        this.method1066(this.nativeid, ((class511) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V", line = 113)
    public final void method1065(class548 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method1058(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lih;[II)V", line = 121)
    public final void method1071(class284 arg0, class744 arg1, int[] arg2, int arg3) {
        this.method1070(this.nativeid, ((class247) arg0).nativeid, ((class136) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V", line = 124)
    private final void method1072() {
        this.method1050(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V", line = 129)
    public final void method1074(class548 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1060(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V", line = 133)
    public class167(class408 arg0, int arg1, int arg2) {
        this.field2330 = arg0;
        this.field2337 = new class247(this.field2330);
        this.field2332 = new class247(this.field2330);
        this.field2326 = new class247(this.field2330);
        this.field2334 = new class247(this.field2330);
        this.field2336 = new class247(this.field2330);
        this.field2329 = new class247(this.field2330);
        this.field2335 = new class247(this.field2330);
        this.field2333 = new class247(this.field2330);
        this.field2327 = new class247(this.field2330);
        this.field2331 = new class247(this.field2330);
        this.method1069(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method1046(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method1050(long arg0);

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method1054(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method1058(long arg0, class548 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method1060(long arg0, class548 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method1061(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method1062(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method1064(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method1066(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method1067(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method1068(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method1069(long arg0, class548 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method1070(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method1073(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method1075(long arg0);
}
