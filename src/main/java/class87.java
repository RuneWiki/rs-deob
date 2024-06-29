import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class87 {

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[I")
    public static int[] field1395 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "[I")
    public static int[] field1399 = new int[32];

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Lmh;")
    private static class62 field1400 = class201.method1405(true, "Connection lost)3");

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Lmh;")
    public static class62 field1398 = field1400;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Lhi;")
    public static class26 field1394;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Lhi;")
    public static class26 field1397;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V", line = 6)
    public static void method651(byte arg0) {
        field1399 = null;
        field1394 = null;
        field1395 = null;
        if (arg0 > 1) {
            field1400 = null;
            field1398 = null;
            field1397 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)Lvd;", line = 33)
    public static final class158 method652(byte arg0, int arg1) {
        class158 var2 = (class158) class110.field1774.method1396(0, (long) arg1);
        field1393++;
        int var3 = 110 % ((1 - arg0) / 51);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class258.field4344.method157(arg1, 3, (byte) 19);
        class158 var5 = new class158();
        if (var4 != null) {
            var5.method1162(false, new class92(var4));
        }
        class110.field1774.method1397((long) arg1, var5, true);
        return var5;
    }
}
