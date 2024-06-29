import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class399 extends class264 {

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public volatile int field5771 = -1;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "Ljava/lang/String;")
    public volatile String field5773;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "Lbn;")
    public static class160 field5774 = new class160(3, 7);

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "[I")
    public static int[] field5776 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Lbt;")
    public static class363 field5775 = new class363(4);

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)Lvg;")
    public static final class111 method2496(int arg0, byte arg1) {
        field5772++;
        class111 var2 = (class111) class401.field5795.method2310((byte) -125, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class46.field596.method715(arg0, (byte) 120, 31);
        int var4 = -70 % ((arg1 + 39) / 33);
        class111 var5 = new class111();
        if (var3 != null) {
            var5.method794(new class256(var3), arg0, -21971);
        }
        class401.field5795.method2299(true, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
    public static void method2497(int arg0) {
        field5775 = null;
        field5776 = null;
        if (arg0 <= 67) {
            method2496(-15, (byte) -82);
        }
        field5774 = null;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class399(String arg0) {
        this.field5773 = arg0;
    }
}
