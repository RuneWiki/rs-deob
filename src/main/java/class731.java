import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class731 extends class69 {

    @OriginalMember(owner = "client!za", name = "j", descriptor = "I")
    public static int field10106;

    @OriginalMember(owner = "client!za", name = "k", descriptor = "I")
    public static int field10107;

    @OriginalMember(owner = "client!za", name = "l", descriptor = "I")
    public static int field10108;

    @OriginalMember(owner = "client!za", name = "m", descriptor = "Lrfa;")
    public static class550 field10109;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V")
    public static void method4067(boolean arg0) {
        field10109 = null;
        if (!arg0) {
            field10109 = null;
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V")
    public static final void method4068(int arg0) {
        field10107++;
        short var1 = 1024;
        short var2 = 3072;
        if (class529.field7284) {
            if (class66.field729) {
                var1 = 2048;
            }
            var2 = 4096;
        }
        if ((float) var1 > class514.field7053) {
            class514.field7053 = var1;
        }
        while (class702.field9790 >= 16384.0F) {
            class702.field9790 -= 16384.0F;
        }
        if ((float) var2 < class514.field7053) {
            class514.field7053 = var2;
        }
        while (class702.field9790 < 0.0F) {
            class702.field9790 += 16384.0F;
        }
        int var3 = class693.field9671 >> 9;
        int var4 = class548.field7650 >> 9;
        int var5 = class373.method2316(class693.field9671, class435.field6040, class548.field7650, 52);
        int var6 = 0;
        if (arg0 > ~var3 && var4 > 3 && var3 < (class741.field10208 - 4) && var4 < class525.field7224 - 4) {
            for (int var7 = var3 - 4; var7 <= (var3 + 4); var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class435.field6040;
                    if (var9 < 3 && class123.method865(var7, var8, -80)) {
                        var9++;
                    }
                    int var10 = 0;
                    if (class617.field8656.field10086 != null && class617.field8656.field10086[var9] != null) {
                        var10 = (class617.field8656.field10086[var9][var7][var8] & 0xFF) * 8 << 2;
                    }
                    if (class661.field9303 != null && class661.field9303[var9] != null) {
                        int var11 = var5 + var10 - class661.field9303[var9].method2525(var7, var8, (byte) 114);
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
        if (class480.field6649 < var12) {
            class480.field6649 += (var12 - class480.field6649) / 24;
        } else if (class480.field6649 > var12) {
            class480.field6649 += (var12 - class480.field6649) / 80;
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(II)V")
    public static final void method4069(int arg0, int arg1) {
        if (arg1 < 21) {
            method4068(-13);
        }
        field10106++;
        class17 var2 = class245.method1634(1, (long) arg0, 3);
        var2.method69(13);
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIB)I")
    public static final int method4070(int arg0, int arg1, byte arg2) {
        field10108++;
        byte var3;
        if (arg1 > 20000) {
            class464.method2786(arg2 ^ 0x39);
            var3 = 4;
        } else if (arg1 > 10000) {
            var3 = 3;
            class50.method418((byte) -28);
        } else if (arg1 <= 5000) {
            class81.method582(true, (byte) 95);
            var3 = 1;
        } else {
            var3 = 2;
            class637.method3660(115);
        }
        if (arg0 != class688.field9602.field8517.method2604((byte) -98)) {
            class688.field9602.method3503(class688.field9602.field8510, -124, arg0);
            class532.method3154(arg0, false, 1);
        }
        class266.method1738(arg2 + 192);
        return arg2 == -90 ? var3 : 19;
    }
}
