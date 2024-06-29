import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class1 {

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "Lvo;")
    private class345 field2;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public int field1;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "[I")
    public static int[] field4 = new int[14];

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public static void method1(int arg0) {
        field4 = null;
        if (arg0 != -1) {
            method1(64);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III[IIIBI)Z")
    public static final boolean method2(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg7 > class346.field4893) {
            arg7 = class346.field4893;
        }
        field3++;
        if (arg7 <= arg1) {
            return true;
        }
        int var8 = arg1 * arg4 + arg2;
        int var9 = arg1 + arg5 - 1;
        int var10 = -106 % ((55 - arg6) / 43);
        int var11 = arg7 - arg1 >> 2;
        int var10000;
        if (class540.field7931 == 1) {
            class495.field7220 += var11;
            while (true) {
                var11--;
                if (var11 < 0) {
                    int var12 = arg7 - arg1 & 0x3;
                    while (true) {
                        var12--;
                        if (var12 < 0) {
                            return true;
                        }
                        var10000 = ~var8;
                        var9++;
                        if (var10000 > ~arg3[var9]) {
                            arg3[var9] = var8;
                        }
                        var8 += arg4;
                    }
                }
                var9++;
                if (arg3[var9] > var8) {
                    arg3[var9] = var8;
                }
                int var13 = arg4 + var8;
                var9++;
                if (var13 < arg3[var9]) {
                    arg3[var9] = var13;
                }
                int var14 = arg4 + var13;
                var9++;
                if (arg3[var9] > var14) {
                    arg3[var9] = var14;
                }
                int var15 = arg4 + var14;
                var9++;
                if (arg3[var9] > var15) {
                    arg3[var9] = var15;
                }
                var8 = arg4 + var15;
            }
        } else {
            int var16 = var8 - 38400;
            while (true) {
                var11--;
                if (var11 < 0) {
                    int var17 = arg7 - arg1 & 0x3;
                    while (true) {
                        var17--;
                        if (var17 < 0) {
                            return true;
                        }
                        var9++;
                        if (arg3[var9] > var16) {
                            return false;
                        }
                        var16 += arg4;
                    }
                }
                var10000 = ~var16;
                var9++;
                if (var10000 > ~arg3[var9]) {
                    return false;
                }
                int var18 = arg4 + var16;
                var10000 = ~var18;
                var9++;
                if (var10000 > ~arg3[var9]) {
                    return false;
                }
                int var19 = arg4 + var18;
                var9++;
                if (arg3[var9] > var19) {
                    return false;
                }
                int var20 = arg4 + var19;
                var10000 = ~var20;
                var9++;
                if (var10000 > ~arg3[var9]) {
                    return false;
                }
                var16 = arg4 + var20;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lgn;ILvo;)V")
    public class1(class529 arg0, int arg1, class345 arg2) {
        new class117(64);
        this.field2 = arg2;
        this.field1 = this.field2.method2098(0, 15);
    }
}
