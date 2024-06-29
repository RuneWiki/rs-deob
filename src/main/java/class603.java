import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class603 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lwe;")
    public class408 field8521 = new class408();

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field8526 = 500;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "[I")
    public static int[] field8530 = new int[5];

    @OriginalMember(owner = "client!re", name = "m", descriptor = "Lqe;")
    public static class469 field8533 = new class469(82, -1);

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field8524;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field8525;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field8527;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field8528;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field8531;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field8532;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field8535;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Lada;")
    public static class164 field8529;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Lqaa;")
    public static class27 field8536;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "Lvd;")
    public static class39 field8537;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "Lwe;")
    private class408 field8534;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3502(int arg0) {
        field8532++;
        int var1 = class63.field916.field10203.method3093(17503);
        if (arg0 <= 39) {
            return;
        }
        if (var1 == 0) {
            class238.field3469 = null;
            class309.method1954(0, 0);
        } else if (var1 == 1) {
            class408.method2596((byte) 0, (byte) -100);
            class309.method1954(0, 512);
            if (class60.field847 != null) {
                class33.method164(false);
            }
        } else {
            class408.method2596((byte) (class412.field6195 - 4 & 0xFF), (byte) -55);
            class309.method1954(0, 2);
        }
        class117.field1602 = class341.field4946;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V", line = 42)
    public final void method3503(int arg0) {
        while (true) {
            class408 var2 = this.field8521.field6156;
            if (this.field8521 == var2) {
                field8522++;
                this.field8534 = null;
                if (arg0 != -16) {
                    this.field8521 = null;
                    return;
                }
                return;
            }
            var2.method2597(arg0 + 97);
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V", line = 67)
    public static final void method3504(int arg0) {
        while (true) {
            if (class469.field6851.method1925(class228.field3361, -98) >= 15) {
                int var1 = class469.field6851.method1914(11356, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    class432 var3 = (class432) class497.field7067.method2287((long) var1, (byte) -117);
                    if (var3 == null) {
                        class282 var4 = new class282();
                        var4.field6118 = var1;
                        var3 = new class432(var4);
                        class497.field7067.method2278((byte) -75, (long) var1, var3);
                        class488.field6985[class567.field8058++] = var3;
                        var2 = true;
                    }
                    class282 var5 = var3.field6439;
                    class338.field4921[class441.field6552++] = var1;
                    var5.field6121 = class611.field8635;
                    if (var5.field4008 != null && var5.field4008.method2205(-119)) {
                        class734.method4131(var5, false);
                    }
                    int var6 = class469.field6851.method1914(11356, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class469.field6851.method1914(11356, 3) + 4 << 11 & 0x3F7F;
                    int var8 = class469.field6851.method1914(11356, 1);
                    if (var8 == 1) {
                        class451.field6668[class228.field3346++] = var1;
                    }
                    int var9 = class469.field6851.method1914(11356, 1);
                    int var10 = class469.field6851.method1914(11356, 5);
                    if (var10 > 15) {
                        var10 -= 32;
                    }
                    int var11 = class469.field6851.method1914(11356, 2);
                    var5.method1806(-9430, class74.field1032.method3327(class469.field6851.method1914(11356, 14), false));
                    var5.method2575(-127, var5.field4008.field5053);
                    var5.field6088 = var5.field4008.field5070 << 3;
                    if (var2) {
                        var5.method2585(true, var7, (byte) 17);
                    }
                    var5.method1802(-49, var11, var9 == 1, class130.field1749.field6139[0] + var6, class130.field1749.field6133[0] - -var10, var5.method2579(false));
                    if (var5.field4008.method2205(79)) {
                        class447.method2762(null, var5.field6133[0], var5.field6139[0], 0, var5, var5.field8429, null, 1);
                    }
                    continue;
                }
            }
            int var12 = -64 / ((51 - arg0) / 43);
            field8527++;
            class469.field6851.method1926((byte) 44);
            return;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lwe;I)V", line = 144)
    public final void method3505(class408 arg0, int arg1) {
        if (arg0.field6157 != null) {
            arg0.method2597(-120);
        }
        field8531++;
        arg0.field6157 = this.field8521.field6157;
        if (arg1 != 4) {
            field8530 = null;
        }
        arg0.field6156 = this.field8521;
        arg0.field6157.field6156 = arg0;
        arg0.field6156.field6157 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)I", line = 163)
    public final int method3506(byte arg0) {
        field8524++;
        if (arg0 >= -77) {
            field8526 = 30;
        }
        int var2 = 0;
        class408 var3 = this.field8521.field6156;
        while (this.field8521 != var3) {
            var3 = var3.field6156;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)Lwe;", line = 185)
    public final class408 method3507(int arg0) {
        field8535++;
        class408 var2 = this.field8534;
        if (this.field8521 == var2) {
            this.field8534 = null;
            return null;
        }
        if (arg0 >= -9) {
            field8537 = null;
        }
        this.field8534 = var2.field6156;
        return var2;
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)Lwe;", line = 227)
    public final class408 method3508(int arg0) {
        field8523++;
        if (arg0 != -2) {
            field8533 = null;
        }
        class408 var2 = this.field8521.field6156;
        if (this.field8521 == var2) {
            this.field8534 = null;
            return null;
        } else {
            this.field8534 = var2.field6156;
            return var2;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 273)
    public class603() {
        this.field8521.field6157 = this.field8521;
        this.field8521.field6156 = this.field8521;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V", line = 260)
    public static void method3509(byte arg0) {
        field8537 = null;
        field8530 = null;
        field8533 = null;
        field8536 = null;
        field8529 = null;
        if (arg0 != 79) {
            method3504(62);
        }
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)Lwe;", line = 284)
    public final class408 method3510(int arg0) {
        field8528++;
        class408 var2 = this.field8521.field6156;
        if (this.field8521 == var2) {
            return null;
        }
        if (arg0 >= -28) {
            field8526 = 95;
        }
        var2.method2597(-105);
        return var2;
    }
}
