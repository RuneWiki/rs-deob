import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class64 {

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "Lde;")
    private class534 field897 = new class534(64);

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "Lde;")
    public class534 field898 = new class534(64);

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "Lnd;")
    public class547 field889;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Lnd;")
    private class547 field887;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "Z")
    public static boolean field895 = true;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "Lkg;")
    public static class275 field894 = new class275(113, -1);

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "Ljava/applet/Applet;")
    public static Applet field900;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)V", line = 8)
    public final void method582(int arg0, byte arg1) {
        field892++;
        class534 var3 = this.field897;
        synchronized (this.field897) {
            this.field897.method3070(arg0, 126);
        }
        class534 var4 = this.field898;
        synchronized (this.field898) {
            if (arg1 >= -114) {
                this.method583(16);
            }
            this.field898.method3070(arg0, 120);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 28)
    public final void method583(int arg0) {
        field899++;
        class534 var2 = this.field897;
        synchronized (this.field897) {
            this.field897.method3064(false);
        }
        class534 var3 = this.field898;
        synchronized (this.field898) {
            this.field898.method3064(false);
        }
        if (arg0 != 64) {
            this.field887 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V", line = 44)
    public static void method584(int arg0) {
        field894 = null;
        field900 = null;
        if (arg0 <= 49) {
            field900 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIB)V", line = 56)
    public final void method585(int arg0, int arg1, byte arg2) {
        field890++;
        this.field897 = new class534(arg1);
        this.field898 = new class534(arg0);
        if (arg2 != 107) {
            this.field887 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)I", line = 68)
    public static final int method586(int arg0, int arg1) {
        if (arg1 != 1699767752) {
            method586(6, 2);
        }
        field896++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)V", line = 80)
    public final void method587(int arg0) {
        class534 var2 = this.field897;
        synchronized (this.field897) {
            this.field897.method3065(true);
        }
        field893++;
        class534 var3 = this.field898;
        synchronized (this.field898) {
            if (arg0 != 26002) {
                this.field889 = null;
            }
            this.field898.method3065(true);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 96)
    public static final void method588(int arg0, String arg1, int arg2, String arg3, String arg4, int arg5, String arg6) {
        class694.method3888(false, arg6, arg5, -1, arg4, arg3, arg1, null, arg2);
        if (arg0 == 1699767752) {
            field888++;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)Lma;", line = 116)
    public final class12 method589(int arg0, int arg1) {
        field891++;
        class534 var3 = this.field897;
        class12 var4;
        synchronized (this.field897) {
            var4 = (class12) this.field897.method3079((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class547 var5 = this.field887;
        byte[] var6;
        synchronized (this.field887) {
            var6 = this.field887.method3153(arg1, 0, 34);
        }
        if (arg0 != -32672) {
            field900 = null;
        }
        class12 var7 = new class12();
        var7.field148 = this;
        if (var6 != null) {
            var7.method77(new class461(var6), -1);
        }
        class534 var8 = this.field897;
        synchronized (this.field897) {
            this.field897.method3077((byte) 100, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lal;ILnd;Lnd;)V", line = 161)
    public class64(class102 arg0, int arg1, class547 arg2, class547 arg3) {
        this.field889 = arg3;
        this.field887 = arg2;
        this.field887.method3178((byte) 50, 34);
    }
}
