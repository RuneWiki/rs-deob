import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class307 extends class270 {

    @OriginalMember(owner = "client!mn", name = "A", descriptor = "Lui;")
    public class193 field3909 = new class193();

    @OriginalMember(owner = "client!mn", name = "E", descriptor = "Lgw;")
    public class146 field3913 = new class146();

    @OriginalMember(owner = "client!mn", name = "C", descriptor = "Lwb;")
    private class274 field3911;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "Lsw;")
    public static class641 field3899 = new class641(50);

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "Lui;")
    public static class193 field3915 = new class193();

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "[I")
    public static int[] field3917 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!mn", name = "B", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!mn", name = "H", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "Lmv;")
    public static class313 field3912;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
    public static final void method1695(int arg0) {
        if (arg0 != 3) {
            return;
        }
        for (class319 var1 = (class319) class364.field4781.method1988((byte) -46); var1 != null; var1 = (class319) class364.field4781.method1988((byte) -46)) {
            class294.method1642(var1, arg0 ^ 0x17);
        }
        field3906++;
        int var2;
        int var3;
        if (class565.field8299.method3590(class529.field7429, -2)) {
            var2 = 0;
            var3 = 3;
        } else {
            var3 = class13.field104;
            var2 = class13.field104;
        }
        client.method1414();
        for (int var4 = var2; var4 <= var3; var4++) {
            client.method1402();
            client.method1410(var4);
            client.method1403(var4);
        }
        client.method1419();
        client.method1406();
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBLnl;)V")
    private final void method1696(int arg0, byte arg1, class470 arg2) {
        field3901++;
        if (arg1 > -125) {
            return;
        }
        if ((this.field3911.field3604[arg2.field6574] & 0x4) != 0 && arg2.field6564 < 0) {
            int var4 = this.field3911.field3554[arg2.field6574] / class90.field1101;
            int var5 = (var4 + 1048575 - arg2.field6567) / var4;
            arg2.field6567 = arg0 * var4 + arg2.field6567 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field3911.field3551[arg2.field6574] == 0) {
                    arg2.field6573 = class375.method2170(arg2.field6588, arg2.field6573.method2179(), arg2.field6573.method2187(), arg2.field6573.method2155());
                } else {
                    arg2.field6573 = class375.method2170(arg2.field6588, arg2.field6573.method2179(), 0, arg2.field6573.method2155());
                    this.field3911.method1551(arg2, false, arg2.field6575.field3801[arg2.field6582] < 0);
                }
                if (arg2.field6575.field3801[arg2.field6582] < 0) {
                    arg2.field6573.method2175(-1);
                }
                arg0 = arg2.field6567 / var4;
            }
        }
        arg2.field6573.method804(arg0);
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
    public static void method1697(int arg0) {
        field3915 = null;
        field3917 = null;
        field3912 = null;
        field3899 = null;
        if (arg0 != -1) {
            method1701(-108, true, -29);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BII)Z")
    public static final boolean method1698(byte arg0, int arg1, int arg2) {
        if (arg0 != -128) {
            field3912 = null;
        }
        field3908++;
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "()Lvv;")
    public final class270 method806() {
        field3902++;
        class470 var1 = (class470) this.field3909.method1050((byte) 73);
        if (var1 == null) {
            return null;
        } else if (var1.field6573 == null) {
            return this.method801();
        } else {
            return var1.field6573;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
    public final void method804(int arg0) {
        field3904++;
        this.field3913.method804(arg0);
        for (class470 var2 = (class470) this.field3909.method1050((byte) 73); var2 != null; var2 = (class470) this.field3909.method1047(-7962)) {
            if (!this.field3911.method1561(var2, 2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field6584) {
                        this.method1696(var3, (byte) -127, var2);
                        var2.field6584 -= var3;
                        break;
                    }
                    this.method1696(var2.field6584, (byte) -126, var2);
                    var3 -= var2.field6584;
                } while (!this.field3911.method1530(1777, 0, null, var3, var2));
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lnl;[IIBII)V")
    private final void method1699(class470 arg0, int[] arg1, int arg2, byte arg3, int arg4, int arg5) {
        field3914++;
        int var7 = -69 % ((-arg3 - 45) / 53);
        if ((this.field3911.field3604[arg0.field6574] & 0x4) != 0 && arg0.field6564 < 0) {
            int var8 = this.field3911.field3554[arg0.field6574] / class90.field1101;
            while (true) {
                int var9 = (var8 + 1048575 - arg0.field6567) / var8;
                if (var9 > arg4) {
                    arg0.field6567 += arg4 * var8;
                    break;
                }
                arg0.field6573.method799(arg1, arg2, var9);
                arg4 -= var9;
                arg0.field6567 += var8 * var9 - 1048576;
                arg2 += var9;
                int var10 = class90.field1101 / 100;
                int var11 = 262144 / var8;
                if (var10 > var11) {
                    var10 = var11;
                }
                class375 var12 = arg0.field6573;
                if (this.field3911.field3551[arg0.field6574] == 0) {
                    arg0.field6573 = class375.method2170(arg0.field6588, var12.method2179(), var12.method2187(), var12.method2155());
                } else {
                    arg0.field6573 = class375.method2170(arg0.field6588, var12.method2179(), 0, var12.method2155());
                    this.field3911.method1551(arg0, false, arg0.field6575.field3801[arg0.field6582] < 0);
                    arg0.field6573.method2159(var10, var12.method2187());
                }
                if (arg0.field6575.field3801[arg0.field6582] < 0) {
                    arg0.field6573.method2175(-1);
                }
                var12.method2165(var10);
                var12.method799(arg1, arg2, arg5 - arg2);
                if (var12.method2169()) {
                    this.field3913.method810(var12);
                }
            }
        }
        arg0.field6573.method799(arg1, arg2, arg4);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3900++;
        if (!class640.method3678(false, arg6)) {
            return;
        }
        if (class543.field7960[arg6] == null) {
            client.method1415(class459.field6326[arg6], -1, arg8, arg1, arg7, arg0, arg2, arg9, arg4, arg3);
        } else {
            client.method1415(class543.field7960[arg6], -1, arg8, arg1, arg7, arg0, arg2, arg9, arg4, arg3);
        }
        if (arg5 != -1) {
            field3899 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "()Lvv;")
    public final class270 method801() {
        field3907++;
        class470 var1;
        do {
            var1 = (class470) this.field3909.method1047(-7962);
            if (var1 == null) {
                return null;
            }
        } while (var1.field6573 == null);
        return var1.field6573;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "([III)V")
    public final void method799(int[] arg0, int arg1, int arg2) {
        field3910++;
        this.field3913.method799(arg0, arg1, arg2);
        for (class470 var4 = (class470) this.field3909.method1050((byte) 73); var4 != null; var4 = (class470) this.field3909.method1047(-7962)) {
            if (!this.field3911.method1561(var4, 2)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field6584) {
                        this.method1699(var4, arg0, var5, (byte) 109, var6, var5 + var6);
                        var4.field6584 -= var6;
                        break;
                    }
                    this.method1699(var4, arg0, var5, (byte) 115, var4.field6584, var5 + var6);
                    var6 -= var4.field6584;
                    var5 += var4.field6584;
                } while (!this.field3911.method1530(1777, var5, arg0, var6, var4));
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "()I")
    public final int method800() {
        field3916++;
        return 0;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZI)Z")
    public static final boolean method1701(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field3899 = null;
        }
        field3905++;
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lwb;)V")
    public class307(class274 arg0) {
        this.field3911 = arg0;
    }
}
