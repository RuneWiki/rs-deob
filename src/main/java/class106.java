import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class106 {

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "Lgg;")
    private class114 field1298 = new class114(128);

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Lkha;")
    private class687 field1292;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "Lus;")
    public static class328 field1293 = new class328(58, -1);

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "Lnl;")
    public static class681 field1297;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 5)
    public static final void method725(int arg0) {
        field1295++;
        class120.field1451 = null;
        if (class107.field1323 && class126.method814((byte) 23) != 1) {
            class309.method1806(0, (byte) -128, class692.method3864(96), class668.field9150 == 3 || class668.field9150 == 7, class46.method377(105), 0);
        }
        int var1 = 0;
        if (arg0 != -8) {
            return;
        }
        int var2 = 0;
        if (class107.field1323) {
            var1 = class173.method1075(-102);
            var2 = class203.method1259((byte) 125);
        }
        class517.method2970(var2, -22704, class638.field8834, class84.field1083 + var2, var2, class599.field8320 + var1, var1, -1, var1);
        if (class120.field1451 != null) {
            class90.method628(var1 + class599.field8320, class363.field5153, class84.field1083 + var2, var2, var1, class539.field7596, class120.field1451, true, -1412584499, class333.field4299.field6557, (byte) -13);
            class120.field1451 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)Lrm;", line = 43)
    public final class258 method726(int arg0, int arg1) {
        field1294++;
        class114 var3 = this.field1298;
        class258 var4;
        synchronized (this.field1298) {
            var4 = (class258) this.field1298.method778((long) arg0, -16);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1292.method3810(class746.method4168(-127, arg0), -23360, class280.method1677(arg0, 1));
        class258 var6 = new class258();
        if (arg1 != -4) {
            return null;
        }
        if (var5 != null) {
            var6.method1576(new class179(var5), -96);
        }
        class114 var7 = this.field1298;
        synchronized (this.field1298) {
            this.field1298.method774((long) arg0, 93, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)V", line = 77)
    public static final void method727(boolean arg0) {
        field1296++;
        short var1 = 1024;
        short var2 = 3072;
        if (class306.field3936) {
            var2 = 4096;
            if (class44.field665) {
                var1 = 2048;
            }
        }
        if (class602.field8360 < (float) var1) {
            class602.field8360 = var1;
        }
        if (class602.field8360 > (float) var2) {
            class602.field8360 = var2;
        }
        while (class748.field10471 >= 16384.0F) {
            class748.field10471 -= 16384.0F;
        }
        while (class748.field10471 < 0.0F) {
            class748.field10471 += 16384.0F;
        }
        int var3 = class742.field10372 >> 9;
        int var4 = class175.field2278 >> 9;
        int var5 = class592.method3287(arg0, class175.field2278, class223.field2946, class742.field10372);
        int var6 = 0;
        if (var3 > 3 && var4 > 3 && (class613.field8591 - 4) > var3 && (class1.field3 - 4) > var4) {
            for (int var7 = var3 - 4; var7 <= (var3 + 4); var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class223.field2946;
                    if (var9 < 3 && class739.method4140((byte) 123, var8, var7)) {
                        var9++;
                    }
                    int var10 = 0;
                    if (class143.field1692.field1747 != null && class143.field1692.field1747[var9] != null) {
                        var10 = (class143.field1692.field1747[var9][var7][var8] & 0xFF) * 8 << 2;
                    }
                    if (class517.field7282 != null && class517.field7282[var9] != null) {
                        int var11 = var10 + var5 - class517.field7282[var9].method2381(-93, var7, var8);
                        if (var11 > var6) {
                            var6 = var11;
                        }
                    }
                }
            }
        }
        int var12 = (var6 >> 2) * 1536;
        if (var12 > 786432) {
            var12 = 786432;
        }
        if (var12 < 262144) {
            var12 = 262144;
        }
        if (class631.field8765 < var12) {
            class631.field8765 += (var12 - class631.field8765) / 24;
        } else if (class631.field8765 > var12) {
            class631.field8765 += (var12 - class631.field8765) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ldh;ILkha;)V", line = 183)
    public class106(class286 arg0, int arg1, class687 arg2) {
        this.field1292 = arg2;
        if (this.field1292 != null) {
            int var4 = this.field1292.method3816(-126) - 1;
            this.field1292.method3812(0, var4);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 207)
    public static void method728(byte arg0) {
        field1293 = null;
        field1297 = null;
        if (arg0 != -22) {
            method727(false);
        }
    }
}
