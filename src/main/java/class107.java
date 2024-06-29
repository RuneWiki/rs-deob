import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class107 {

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "Lwl;")
    public static class452 field1424 = new class452(76, -1);

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "Lwl;")
    public static class452 field1425 = new class452(21, 3);

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "S")
    public static short field1428;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1427;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "[I")
    public static int[] field1429;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "[Lkr;")
    public static class234[] field1426;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
    public static void method664(byte arg0) {
        field1425 = null;
        field1424 = null;
        field1426 = null;
        int var1 = -113 % ((arg0 - 23) / 56);
        field1427 = null;
        field1429 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)I")
    public static final int method665(int arg0, int arg1, int arg2) {
        field1422++;
        int var3 = arg0;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg2 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIBIII)V")
    public static final void method666(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        class8[] var7 = class55.field744;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class8 var9 = var7[var8];
            if (var9 != null && var9.field85 == 2) {
                class341.method2085(var9.field88 * 2, (var9.field78 - class17.field250 << 7) + var9.field87, arg2, arg5 >> 1, 72, (var9.field89 - class112.field1487 << 7) + var9.field76, arg4 >> 1, arg6, var9.field93);
                if (class212.field3189[0] > -1 && class26.field332 % 20 < 10) {
                    class262.field4013[var9.field84].method1408(class212.field3189[0] + arg1 - 12, arg0 - 28 + class212.field3189[1]);
                }
            }
        }
        if (arg3 != 61) {
            method665(12, 95, -48);
        }
        field1423++;
    }

    static {
        new class151("Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.");
        field1428 = 1;
        field1427 = null;
        field1429 = new int[4096];
    }
}
