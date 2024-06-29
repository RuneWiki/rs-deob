import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class367 implements class254 {

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field5397 = 0;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "[I")
    public static int[] field5400 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "Lhn;")
    public static class509 field5398 = new class509(79, 9);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
    public static void method2292(int arg0) {
        if (arg0 < 77) {
            method2294(null, (byte) 24);
        }
        field5398 = null;
        field5400 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "([IBLqu;J)Ljava/lang/String;")
    public final String method1697(int[] arg0, byte arg1, class65 arg2, long arg3) {
        field5401++;
        if (class509.field7452 == arg2) {
            class98 var6 = class267.field4087.method2013(24, arg0[0]);
            return var6.method800(34, (int) arg3);
        } else if (class56.field690 == arg2 || class514.field7470 == arg2) {
            class532 var7 = class390.field5847.method467((byte) -101, (int) arg3);
            return var7.field7806;
        } else if (class263.field4042 == arg2 || class45.field586 == arg2 || class432.field6403 == arg2) {
            return class267.field4087.method2013(arg1 ^ 0xFFFFFF8E, arg0[0]).method800(arg1 ^ 0xFFFFFFBF, (int) arg3);
        } else {
            if (arg1 != -106) {
                field5398 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILhp;)Ljava/lang/String;")
    public static final String method2293(int arg0, int arg1, class217 arg2) {
        field5402++;
        try {
            int var3 = arg2.method1510(-129);
            if (var3 > arg1) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field3556 += class60.field720.method1667(arg2.field3572, -60402365, arg2.field3556, var3, 0, var4);
            int var5 = -7 % ((arg0 + 48) / 33);
            return class153.method1052(0, var3, var4, (byte) -39);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lya;B)V")
    public static final void method2294(class38 arg0, byte arg1) {
        arg0.method313(0, 0, class80.field1163, 350);
        field5396++;
        arg0.method284(0, 0, class80.field1163, 350, class93.field1316 << 24 | 0x332277, 1);
        int var2 = 350 / class232.field3752;
        if (class291.field4388 > 0) {
            int var3 = 346 - class232.field3752 - 4;
            int var4 = var2 * var3 / (var2 + class291.field4388 - 1);
            int var5 = 4;
            if (class291.field4388 > 1) {
                var5 += (class291.field4388 - class208.field3400 - 1) * (var3 - var4) / (class291.field4388 - 1);
            }
            arg0.method284(class80.field1163 - 16, var5, 12, var4, class93.field1316 << 24 | 0x332277, 2);
            for (int var6 = class208.field3400; var6 < (class208.field3400 + var2) && var6 < class291.field4388; var6++) {
                String[] var7 = class23.method170(16943, '\b', class238.field3820[var6]);
                int var8 = (class80.field1163 - 8 - 16) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg0.method313(var10, 0, var10 + var8 - 8, 350);
                    class313.field4722.method2038(var10, false, -16777216, -1, 348 - ((var6 - class208.field3400) * class232.field3752) - class219.field3587 - class401.field5963.field5137, var7[var9]);
                }
            }
        }
        arg0.method313(0, 0, class80.field1163, 350);
        arg0.method278(0, class80.field1163, -1, 350 - class219.field3587, true);
        class185.field2805.method2038(10, false, -16777216, -1, 350 - class380.field5735.field5137 - 1, "--> " + class120.field1806);
        int var11 = 25 % ((-arg1 - 69) / 40);
        int var12 = -1;
        if (class475.field6854 % 30 > 15) {
            var12 = 16777215;
        }
        arg0.method277(339 - class380.field5735.field5137, 12, 39, class380.field5735.method2174(-33, "--> " + class120.field1806.substring(0, class484.field6963)) + 10, var12);
    }
}
