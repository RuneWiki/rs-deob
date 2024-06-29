import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class285 {

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lrga;Z[[[BIB)Z", line = 4)
    public static final boolean method1836(class215 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class539.field7551) {
            return false;
        }
        int var5 = arg0.field3024 >> class310.field4593;
        int var6 = arg0.field3029 >> class310.field4593;
        if (var5 < class39.field645 || var5 >= class316.field4673 || var6 < class112.field1694 || var6 >= class431.field6318) {
            return true;
        } else if ((arg2 == null || arg0.field3019 < arg3 || arg2[arg0.field3019][var5][var6] != arg4) && arg0.method948(true) && !arg0.method952(-16)) {
            return false;
        } else {
            if (!arg1 && var5 >= class435.field6354 - 16 && var5 <= class435.field6354 + 16 && var6 >= class612.field8575 - 16 && var6 <= class612.field8575 + 16) {
                if (class520.field7337) {
                    class295.field4329[class388.field5762++].method3212(-1, arg0);
                    class388.field5762 %= class519.field7319;
                } else {
                    arg0.method1177(0, class682.field9618);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "([[BLbd;Z)V", line = 38)
    public static final void method1837(byte[][] arg0, class56 arg1, boolean arg2) {
        field4265++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        if (arg2) {
            method1836(null, true, null, 91, (byte) 51);
        }
        for (int var4 = 0; var4 < arg1.field4779; var4++) {
            class263.method1730(-1);
            for (int var5 = 0; var5 < class199.field2812 >> 3; var5++) {
                for (int var6 = 0; var6 < class232.field3611 >> 3; var6++) {
                    int var7 = class188.field2713[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3C14B55) >> 24;
                        if (!arg1.field4760 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFCC51) >> 14;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class273.field4105.length; var13++) {
                                if (class273.field4105[var13] == var12 && arg0[var13] != null) {
                                    class695 var14 = new class695(arg0[var13]);
                                    arg1.method2023(var14, var4, var6 * 8, var8, var9, var5 * 8, class423.field6155, false, var11, var10);
                                    arg1.method605(var11, var4, var3[0] == -1 ? var3 : null, var10, var8, var14, class282.field4228, (byte) 41, var9, var6 * 8, var5 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class380.field5380 = class226.field3182.method3129(var3[1], class177.field2526, 0, var3[0], var3[3], var3[2]);
            class134.field1975 = var3[4];
        }
    }
}
