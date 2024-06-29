import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class721 {

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "Lde;")
    private class534 field10034 = new class534(128);

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "Lnd;")
    private class547 field10031;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "J")
    public static long field10032 = 0L;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "Lhm;")
    public static class223 field10033 = new class223(8, 1);

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "Z")
    public static boolean field10035 = false;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public static int field10038 = 0;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "Z")
    public static boolean field10037 = false;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "Ljava/lang/String;")
    public static String field10041 = "";

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field10030;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field10036;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "Ljava/lang/Thread;")
    public static Thread field10040;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "[Liea;")
    public static class481[] field10039;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)Lra;", line = 10)
    public final class111 method4027(int arg0, int arg1) {
        field10030++;
        class534 var3 = this.field10034;
        class111 var4;
        synchronized (this.field10034) {
            var4 = (class111) this.field10034.method3079((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 >= -19) {
            field10039 = null;
        }
        byte[] var5 = this.field10031.method3153(class708.method3964((byte) -123, arg1), 0, class64.method586(arg1, 1699767752));
        class111 var6 = new class111();
        if (var5 != null) {
            var6.method883(16992, new class461(var5));
        }
        class534 var7 = this.field10034;
        synchronized (this.field10034) {
            this.field10034.method3077((byte) -87, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V", line = 50)
    public static void method4028(boolean arg0) {
        field10039 = null;
        if (arg0) {
            field10040 = null;
            field10041 = null;
            field10033 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lal;ILnd;)V", line = 80)
    public class721(class102 arg0, int arg1, class547 arg2) {
        this.field10031 = arg2;
        if (this.field10031 != null) {
            int var4 = this.field10031.method3155((byte) -125) - 1;
            this.field10031.method3178((byte) 89, var4);
        }
    }
}
