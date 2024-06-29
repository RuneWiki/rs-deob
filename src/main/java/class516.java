import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public abstract class class516 extends class167 {

    @OriginalMember(owner = "client!kp", name = "H", descriptor = "S")
    public short field7055;

    @OriginalMember(owner = "client!kp", name = "G", descriptor = "Lee;")
    public static class706 field7054 = new class706(8);

    @OriginalMember(owner = "client!kp", name = "M", descriptor = "[J")
    public static long[] field7060 = new long[32];

    @OriginalMember(owner = "client!kp", name = "F", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!kp", name = "I", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!kp", name = "J", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!kp", name = "K", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!kp", name = "L", descriptor = "Z")
    public static boolean field7059;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(ILha;)Z", line = 3)
    public final boolean method41(int arg0, class65 arg1) {
        ++field7057;
        if (arg0 != 101) {
            field7054 = null;
        }
        return class521.method3012(super.field2259 >> class26.field388, false, super.field2257 >> class26.field388, super.field2244, this);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZI[B)V", line = 15)
    public static final void method2997(boolean arg0, int arg1, byte[] arg2) {
        if (class416.field5976 == null) {
            class416.field5976 = new class376(20000);
        }
        if (arg1 != 26477) {
            method2997(true, -123, (byte[]) null);
        }
        ++field7058;
        class416.field5976.method2403(arg2, arg2.length, arg1 ^ 26605, 0);
        if (arg0) {
            class502.method2916(class416.field5976.field5518, arg1 ^ -26480);
            class791.field10877 = new class513[class450.field6278];
            int var3 = 0;
            for (int var4 = class620.field8351; ~var4 >= ~class767.field10587; ++var4) {
                class513 var5 = class773.method4286(var4, 46);
                if (var5 != null) {
                    class791.field10877[var3++] = var5;
                }
            }
            class750.field10331 = false;
            class3.field17 = class302.method1910(0);
            class416.field5976 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B[Luca;)I", line = 57)
    public final int method43(byte arg0, class540[] arg1) {
        ++field7053;
        if (arg0 > -20) {
            field7060 = null;
        }
        int var3 = super.field2257 >> class26.field388;
        int var4 = super.field2259 >> class26.field388;
        int var5 = 0;
        if (class331.field4776 == var3) {
            ++var5;
        } else if (~class331.field4776 > ~var3) {
            var5 += 2;
        }
        if (~class76.field1102 == ~var4) {
            var5 += 3;
        } else if (~var4 > ~class76.field1102) {
            var5 += 6;
        }
        int var6 = class489.field6783[var5];
        if ((var6 & this.field7055) != 0) {
            return this.method1200(var4, arg1, var3, (byte) 36);
        } else if (~this.field7055 == -2 && ~var3 < -1) {
            return this.method1200(var4, arg1, var3 + -1, (byte) 36);
        } else if (~this.field7055 == -5 && ~class405.field5875 <= ~var3) {
            return this.method1200(var4, arg1, var3 + 1, (byte) 36);
        } else if (this.field7055 == 8 && var4 > 0) {
            return this.method1200(var4 + -1, arg1, var3, (byte) 36);
        } else if (this.field7055 == 2 && var4 <= class710.field9947) {
            return this.method1200(var4 - -1, arg1, var3, (byte) 36);
        } else if (~this.field7055 == -17 && ~var3 < -1 && class710.field9947 >= var4) {
            return this.method1200(var4 + 1, arg1, var3 + -1, (byte) 36);
        } else if (~this.field7055 == -33 && ~var3 >= ~class405.field5875 && class710.field9947 >= var4) {
            return this.method1200(var4 + 1, arg1, var3 + 1, (byte) 36);
        } else if (~this.field7055 == -129 && var3 > 0 && ~var4 < -1) {
            return this.method1200(var4 + -1, arg1, var3 - 1, (byte) 36);
        } else if (~this.field7055 == -65 && var3 <= class405.field5875 && var4 > 0) {
            return this.method1200(var4 + -1, arg1, var3 + 1, (byte) 36);
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(IIIIII)V", line = 138)
    public class516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field2257 = arg0;
        this.field7055 = (short) arg5;
        super.field2250 = (byte) arg3;
        super.field2259 = arg2;
        super.field2244 = (byte) arg4;
        super.field2246 = arg1;
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(Z)V", line = 152)
    public static void method2998(boolean arg0) {
        field7060 = null;
        field7054 = null;
        if (!arg0) {
            field7054 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "(I)Z", line = 163)
    public final boolean method45(int arg0) {
        ++field7056;
        if (arg0 <= 103) {
            field7060 = null;
        }
        return class79.field1122[(super.field2257 >> class26.field388) - -class174.field2337 + -class331.field4776][(super.field2259 >> class26.field388) - (-class174.field2337 + class76.field1102)];
    }
}
