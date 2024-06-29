import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class145 {

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Lab;")
    public static class148 field2020 = new class148();

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2024 = " from your friend list first.";

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "[Z")
    public static boolean[] field2025 = new boolean[200];

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIII)V")
    public static final void method973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2017++;
        class154.method1028(-353, class216.field3264[arg0], arg2, arg3 - arg5, arg3 + arg5);
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg1 * arg1;
        int var9 = arg5 * arg5;
        if (arg4 != -2001417599) {
            method977(-107, -116);
        }
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var9 + var11;
        int var14 = var9 << 2;
        int var15 = var8 - ((var12 - 1) * var10);
        int var16 = var8 << 2;
        int var17 = ((var6 << 1) + 3) * var11;
        int var18 = ((arg1 << 1) - 3) * var10;
        int var19 = (arg1 - 1) * var14;
        int var20 = (var6 + 1) * var16;
        while (var7 > 0) {
            var7--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var6++;
                    var15 += var20;
                    var17 += var16;
                    var20 += var16;
                }
            }
            int var21 = arg0 - var7;
            if (var15 < 0) {
                var6++;
                var13 += var17;
                var17 += var16;
                var15 += var20;
                var20 += var16;
            }
            var15 += -var18;
            int var22 = arg0 + var7;
            var13 += -var19;
            int var23 = arg3 - var6;
            var19 -= var14;
            int var24 = arg3 + var6;
            var18 -= var14;
            class154.method1028(-353, class216.field3264[var21], arg2, var23, var24);
            class154.method1028(-353, class216.field3264[var22], arg2, var23, var24);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method974(byte arg0) {
        field2024 = null;
        if (arg0 != -122) {
            field2026 = 85;
        }
        field2020 = null;
        field2025 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BII)V")
    public static final void method975(byte arg0, int arg1, int arg2) {
        field2019++;
        if (class158.field2203 > 0) {
            class165.method1089(128, class158.field2203);
            class158.field2203 = 0;
        }
        int var3 = 0;
        int var4 = class64.field879 * arg2;
        int var5 = 0;
        short var6 = 256;
        for (int var7 = 1; var7 < var6 - 1; var7++) {
            int var9 = (var6 - var7) * class47.field687[var7] / var6;
            if (var9 < 0) {
                var9 = 0;
            }
            var3 += var9;
            for (int var10 = var9; var10 < 128; var10++) {
                int var12 = class208.field2965[var3++];
                int var13 = class64.field881[var4++ + arg1];
                if (var12 == 0) {
                    class173.field2430.field1820[var5++] = var13;
                } else {
                    int var14 = var12 + 18;
                    int var15 = 256 - (var12 + 18);
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    int var16 = class94.field1324[var12];
                    if (var15 > 255) {
                        var15 = 255;
                    }
                    class173.field2430.field1820[var5++] = class235.method1572(16711680, class235.method1572(var16, 65280) * var14 + class235.method1572(65280, var13) * var15) + class235.method1572(class235.method1572(var13, 16711935) * var15 + var14 * class235.method1572(var16, 16711935), -16711936) >> 8;
                }
            }
            for (int var11 = 0; var11 < var9; var11++) {
                class173.field2430.field1820[var5++] = class64.field881[var4++ + arg1];
            }
            var4 += class64.field879 - 128;
        }
        int var8 = 55 / ((arg0 - 31) / 54);
        class173.field2430.method706(arg1, arg2);
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
    public static final void method976(byte arg0) {
        class172.field2398.method544(false);
        class71.field991.method544(false);
        field2018++;
        if (arg0 != 110) {
            method975((byte) -126, -123, 51);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
    public static final void method977(int arg0, int arg1) {
        field2022++;
        if (class79.field1097 == arg1) {
            return;
        }
        int var2 = -126 / ((arg0 - 33) / 55);
        if (class79.field1097 == 0) {
            class20.method148((byte) 127);
        }
        boolean var3 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 == 40) {
            class132.method899(6266);
        }
        if (arg1 != 40 && class197.field2738 != null) {
            class197.field2738.method1958(5000);
            class197.field2738 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class193.field2658 = 1;
            class92.field1279 = 0;
            class68.field934 = 0;
            class194.field2687 = 1;
            class231.field3496 = 0;
            class32.method204(-1, true);
        }
        if (arg1 == 25 || arg1 == 10) {
            class290.method1950(120);
        }
        if (arg1 == 5) {
            class149.method1005((byte) 1, class21.field299);
        } else {
            class180.method1177((byte) 94);
        }
        boolean var4 = class79.field1097 == 5 || class79.field1097 == 10 || class79.field1097 == 28;
        if (var3 != var4) {
            if (var3) {
                class28.field373 = class105.field1461;
                if (class168.field2312 == 0) {
                    class140.method947(2, -107);
                } else {
                    class212.method1385(false, -28, 2, class23.field324, class105.field1461, 255, 0);
                }
                class214.field3229.method626(false, true);
            } else {
                class140.method947(2, -87);
                class214.field3229.method626(true, true);
            }
        }
        class79.field1097 = arg1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BC)Z")
    public static final boolean method978(byte arg0, char arg1) {
        if (arg0 < 86) {
            return false;
        } else {
            field2021++;
            return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        }
    }
}
