import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class36 {

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public int field569 = 0;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public int field572 = 0;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Lde;")
    private class534 field571 = new class534(64);

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Lop;")
    private class192 field575 = null;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Lnd;")
    private class547 field567;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Lnd;")
    private class547 field574;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lkg;")
    public static class275 field566 = new class275(67, 1);

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method225(int arg0) {
        field566 = null;
        int var1 = -30 % (arg0 / 61);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLfia;[IJ)Ljava/lang/String;")
    public final String method226(boolean arg0, class577 arg1, int[] arg2, long arg3) {
        field568++;
        if (arg0) {
            this.field567 = null;
        }
        if (this.field575 != null) {
            String var6 = this.field575.method1285(arg3, arg1, 90, arg2);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Lqga;")
    public final class187 method227(int arg0, int arg1) {
        field573++;
        class187 var3 = (class187) this.field571.method3079((long) arg1, 0);
        if (var3 != null) {
            return var3;
        }
        if (arg0 != 11041) {
            this.field572 = -61;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field574.method3153(arg1 & 0x7FFF, 0, 1);
        } else {
            var4 = this.field567.method3153(arg1, 0, 1);
        }
        class187 var5 = new class187();
        var5.field2564 = this;
        if (var4 != null) {
            var5.method1254(new class461(var4), arg0 - 11042);
        }
        if (arg1 >= 32768) {
            var5.method1257(114);
        }
        this.field571.method3077((byte) 112, (long) arg1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)Z")
    public static final boolean method228(int arg0, int arg1) {
        field570++;
        if (arg0 == 46 || arg0 == 59 || arg0 == 9 || arg0 == 47 || arg0 == 8) {
            return true;
        } else if (arg1 == 610) {
            return arg0 == 15 || arg0 == 1009;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(ILnd;Lnd;Lop;)V")
    public class36(int arg0, class547 arg1, class547 arg2, class192 arg3) {
        this.field575 = arg3;
        this.field567 = arg1;
        this.field574 = arg2;
        if (this.field567 != null) {
            this.field569 = this.field567.method3178((byte) 52, 1);
        }
        if (this.field574 != null) {
            this.field572 = this.field574.method3178((byte) 93, 1);
        }
    }
}
