import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class97 {

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "S")
    public static short field1484 = 256;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "Lmv;")
    public static class295 field1483;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "[Lf;")
    public static class256[] field1481;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V", line = 4)
    public static void method602(boolean arg0) {
        if (!arg0) {
            field1484 = -66;
        }
        field1483 = null;
        field1481 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLmq;)V", line = 15)
    public static final void method603(byte arg0, class71 arg1) {
        field1488++;
        if (arg0 < 100) {
            return;
        }
        class65 var2 = (class65) class587.field8519.method2002((byte) -110, (long) arg1.field7405);
        if (var2 == null) {
            return;
        }
        if (var2.field1034 != null) {
            class556.field8166.method2205(var2.field1034);
            var2.field1034 = null;
        }
        var2.method2360((byte) 66);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)I", line = 43)
    public static final int method604(int arg0) {
        int var1 = 101 % ((-arg0 - 25) / 59);
        field1486++;
        return class85.field1333;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lgk;B)V", line = 59)
    public static final void method605(class540 arg0, byte arg1) {
        field1487++;
        if (arg0.field7952.length - arg0.field7956 < 1) {
            return;
        }
        int var2 = arg0.method3115(29871);
        if (var2 < 0 || var2 > 1 || arg0.field7952.length - arg0.field7956 < 2) {
            return;
        }
        int var3 = arg0.method3169(26488);
        if (var3 * 6 > arg0.field7952.length - arg0.field7956) {
            return;
        }
        int var4 = 16 / ((15 - arg1) / 45);
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg0.method3169(26488);
            int var7 = arg0.method3160(false);
            if (class653.field9351.length > var6 && class338.field4914[var6] && (class92.field1400.method1297(var6, (byte) 77).field1928 != '1' || var7 >= -1 && var7 <= 1)) {
                class653.field9351[var6] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)Z", line = 111)
    public static final boolean method606(int arg0, int arg1, int arg2) {
        int var3 = 43 / ((-arg1 - 76) / 36);
        field1482++;
        return (arg0 & 0x100) != 0;
    }
}
