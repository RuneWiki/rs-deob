import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class488 extends class1 {

    @OriginalMember(owner = "client!nba", name = "k", descriptor = "I")
    public int field6578;

    @OriginalMember(owner = "client!nba", name = "l", descriptor = "[B")
    public static byte[] field6579 = new byte[32896];

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!nba", name = "m", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!nba", name = "o", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!nba", name = "j", descriptor = "Lwu;")
    public static class557 field6577;

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "[Lcw;")
    public static class21[] field6573;

    @OriginalMember(owner = "client!nba", name = "n", descriptor = "[Lpaa;")
    public static class712[] field6581;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field6579[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(BLgfa;Ljk;Lha;)V", line = 7)
    public static final void method2856(byte arg0, class753 arg1, class185 arg2, class545 arg3) {
        field6576++;
        class21 var4 = arg2.method1238(arg3, -116);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method115();
        if (var4.method117() > var5) {
            var5 = var4.method117();
        }
        byte var6 = 10;
        int var7 = arg1.field10455;
        if (arg0 < 24) {
            method2858(81, null, -126, -99, 110, -61, -50, -16, -36, 57, -10, -112, null);
        }
        int var8 = arg1.field10458;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg2.field2710 != null) {
            var9 = class608.field8657.method4141(arg2.field2710, -123, class261.field3563, null, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class261.field3563[var12];
                if (var12 < var9 - 1) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class501.field7005.method2648(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class501.field7005.method2651() * var9 + class501.field7005.method2645() / 2;
        }
        int var15 = arg1.field10455 + (var5 / 2);
        if (var7 < class531.field7448 + var5) {
            var15 = class531.field7448 + 5 - (-(var5 / 2) - var6 - var10 / 2);
            var7 = class531.field7448;
        } else if (var7 > (class531.field7453 - var5)) {
            var15 = class531.field7453 - (var5 / 2) - (var10 / 2) - var6 - 5;
            var7 = class531.field7453 - var5;
        }
        int var16 = arg1.field10458;
        if (var8 < (class531.field7446 + var5)) {
            var16 = var5 / 2 + class531.field7446 + var6;
            var8 = class531.field7446;
        } else if ((class531.field7461 - var5) < var8) {
            var16 = class531.field7461 - (var5 / 2) - var11 - var6;
            var8 = class531.field7461 - var5;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg1.field10455), (double) (var8 - arg1.field10458)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method112((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg2.field2710 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var20 = var18 + var10 + 10;
            var21 = var16 + class501.field7005.method2651() * var9 + 3;
            if (arg2.field2718 != 0) {
                arg3.method3255(var21 - var16, -var18 + var20, var18, arg2.field2718, (byte) 119, var16);
            }
            if (arg2.field2716 != 0) {
                arg3.method3263(var18, arg2.field2716, (byte) -83, var21 - var16, var16, var20 - var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class261.field3563[var22];
                if (var22 < (var9 - 1)) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class501.field7005.method2646(arg3, var23, var15, var16, arg2.field2691, true);
                var16 += class501.field7005.method2651();
            }
        }
        if (arg2.field2696 == -1 && arg2.field2710 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class620 var25 = new class620(arg1);
        var25.field8826 = var19;
        var25.field8835 = var18;
        var25.field8833 = var8 - var24;
        var25.field8832 = var20;
        var25.field8825 = var7 - var24;
        var25.field8834 = var7 + var24;
        var25.field8830 = var21;
        var25.field8827 = var8 + var24;
        class19.field235.method3116(29066, var25);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V", line = 157)
    public static void method2857(int arg0) {
        if (arg0 != 0) {
            field6581 = null;
        }
        field6577 = null;
        field6579 = null;
        field6573 = null;
        field6581 = null;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I[[[BIIIIIIIIIILha;)V", line = 170)
    public static final void method2858(int arg0, byte[][][] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class545 arg12) {
        field6575++;
        if (arg6 == 0 || arg7 == 0) {
            return;
        }
        int var13 = 66 % ((arg10 + 43) / 61);
        if (arg6 == 9) {
            arg3 = arg3 + 1 & 0x3;
            arg6 = 1;
        }
        if (arg6 == 10) {
            arg6 = 1;
            arg3 = arg3 + 3 & 0x3;
        }
        if (arg6 == 11) {
            arg3 = arg3 + 3 & 0x3;
            arg6 = 8;
        }
        arg12.method2115(arg0, arg9, arg2, arg11, arg4, arg5, arg1[arg6 - 1][arg3], arg7, arg8);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)V", line = 203)
    public static final void method2859(int arg0, int arg1) {
        class230.field3205 = arg1;
        field6580++;
        if (arg0 != 0) {
            method2857(115);
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)[Lrq;", line = 238)
    public static final class482[] method2860(byte arg0) {
        field6574++;
        if (arg0 != 107) {
            method2856((byte) 120, null, null, null);
        }
        return new class482[] { class71.field998, class680.field9576, class122.field1672 };
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(I)V", line = 250)
    public class488(int arg0) {
        this.field6578 = arg0;
    }
}
