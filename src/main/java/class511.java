import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class511 {

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "Ltq;")
    private class536 field6517 = new class536(64);

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "Lwm;")
    private class30 field6523;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "[I")
    public static int[] field6516 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "Luw;")
    public static class208 field6522 = new class208(125, -1);

    @OriginalMember(owner = "client!nba", name = "j", descriptor = "I")
    public static int field6525 = 0;

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "F")
    public static float field6520;

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lega;ILwm;)V", line = 50)
    public class511(class473 arg0, int arg1, class30 arg2) {
        this.field6523 = arg2;
        this.field6523.method138(0, 5);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)Ljv;", line = 21)
    public final class645 method2823(int arg0, int arg1) {
        field6524++;
        class536 var3 = this.field6517;
        class645 var4;
        synchronized (this.field6517) {
            var4 = (class645) this.field6517.method2931((long) arg0, (byte) -87);
        }
        if (var4 != null) {
            return var4;
        }
        class30 var5 = this.field6523;
        byte[] var6;
        synchronized (this.field6523) {
            var6 = this.field6523.method139(arg1, (byte) -94, arg0);
        }
        class645 var7 = new class645();
        if (var6 != null) {
            var7.method3489(new class234(var6), 679180298);
        }
        class536 var8 = this.field6517;
        synchronized (this.field6517) {
            this.field6517.method2918((long) arg0, var7, 97);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IB)I", line = 65)
    public static final int method2824(int arg0, byte arg1) {
        field6518++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (arg1 > -48) {
            return 20;
        } else {
            int var3 = arg0 * 6 - 61440;
            int var4 = (arg0 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Z)V", line = 89)
    public static void method2825(boolean arg0) {
        if (arg0) {
            field6516 = null;
        }
        field6516 = null;
        field6522 = null;
    }
}
