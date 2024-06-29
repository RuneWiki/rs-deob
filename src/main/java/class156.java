import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class156 {

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "Luh;")
    public class279 field2660 = new class279();

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Ljf;")
    private static class229 field2654 = class212.method1457((byte) 127, "Loaded interfaces");

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Ljf;")
    public static class229 field2655 = field2654;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field2662 = 0;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "Ljf;")
    public static class229 field2663 = class212.method1457((byte) 107, "Votre liste noire est pleine (X100 noms maximum(Y)3");

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "Ljf;")
    public static class229 field2661 = class212.method1457((byte) 105, "overlay2");

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "Ljf;")
    private static class229 field2668 = class212.method1457((byte) 107, "Use");

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "Z")
    public static boolean field2666 = false;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field2653 = 0;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field2667 = 0;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "Ljf;")
    public static class229 field2670 = field2668;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "Lpm;")
    public static class103 field2672;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "Luh;")
    private class279 field2674;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V", line = 9)
    public static final void method1041(int arg0, int arg1, int arg2) {
        if (class232.field4017 > 0) {
            class95.method655(class232.field4017, 1);
            class232.field4017 = 0;
        }
        field2658++;
        short var3 = 256;
        int var4 = 0;
        int var5 = class114.field2055 * arg1;
        int var6 = arg0;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class185.field3198[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class252.field4408[var4++];
                int var11 = class114.field2050[arg2 + (var5++)];
                if (var10 == 0) {
                    class292.field4978.field2708[var6++] = var11;
                } else {
                    int var12 = var10 + 18;
                    int var13 = 256 - var10 - 18;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var14 = class97.field1735[var10];
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    class292.field4978.field2708[var6++] = class305.method2086(-16711936, var13 * class305.method2086(16711935, var11) + class305.method2086(16711935, var14) * var12) + class305.method2086(16711680, class305.method2086(65280, var14) * var12 + (var13 * class305.method2086(65280, var11))) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class292.field4978.field2708[var6++] = class114.field2050[arg2 + var5++];
            }
            var5 += class114.field2055 - 128;
        }
        class292.field4978.method316(arg2, arg1);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIBII)I", line = 95)
    public static final int method1042(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (class244.field4354) {
            class244.field4354 = false;
            arg1 = 1000000;
        }
        field2659++;
        class96 var5 = class149.field2576[arg4][arg0];
        int var6 = var5.field1709;
        float var7 = ((float) arg3 * 0.1F + 0.7F) * var5.field1714;
        float var8 = var5.field1700;
        float var9 = var5.field1701;
        int var10 = var5.field1696;
        int var11 = var5.field1705;
        if (!class201.field3527) {
            var11 = 0;
        }
        if (class50.field889 != var6 || class244.field4328 != var7 || class294.field5035 != var9 || class193.field3344 != var8 || class141.field2450 != var10 || class115.field2062 != var11) {
            class50.field889 = var6;
            class131.field2314 = class24.field447;
            class84.field1611 = class126.field2237;
            class252.field4411 = 0;
            class232.field4031 = class5.field55;
            class294.field5035 = var9;
            class141.field2450 = var10;
            class115.field2062 = var11;
            class193.field3344 = var8;
            class131.field2315 = class282.field4830;
            class24.field435 = class97.field1727;
            class141.field2448 = class305.field5168;
            class244.field4328 = var7;
        }
        if (class252.field4411 < 65536) {
            class252.field4411 += arg1 * 250;
            if (class252.field4411 >= 65536) {
                class252.field4411 = 65536;
            }
            int var12 = 65536 - class252.field4411 >> 8;
            float var13 = (float) (65536 - class252.field4411) / 65536.0F;
            int var14 = class252.field4411 >> 8;
            float var15 = (float) class252.field4411 / 65536.0F;
            class97.field1727 = class244.field4328 * var15 + class24.field435 * var13;
            class126.field2237 = ((class84.field1611 & 0xFF00FF) * var12 + ((class141.field2450 & 0xFF00FF) * var14) & 0xFF00FF00) + ((class84.field1611 & 0xFF00) * var12 + ((class141.field2450 & 0xFF00) * var14) & 0xFF0000) >> 8;
            class24.field447 = class131.field2314 * var12 + (class115.field2062 * var14) >> 8;
            class282.field4830 = ((class50.field889 & 0xFF00) * var14 + (class131.field2315 & 0xFF00) * var12 & 0xFF0000) + ((class50.field889 & 0xFF00FF) * var14 + (class131.field2315 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
            class5.field55 = class232.field4031 * var13 + class193.field3344 * var15;
            class305.field5168 = class294.field5035 * var15 + class141.field2448 * var13;
        }
        class276.method1947(class282.field4830, class97.field1727, class305.field5168, class5.field55);
        class276.method1940(class126.field2237, class24.field447);
        class276.method1937((float) class6.field61, (float) class30.field518, (float) class31.field532);
        class276.method1943();
        return arg2 >= -80 ? 115 : class126.field2237;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 181)
    public final void method1043(byte arg0) {
        while (true) {
            class279 var2 = this.field2660.field4776;
            if (this.field2660 == var2) {
                if (arg0 != -31) {
                    return;
                }
                field2652++;
                this.field2674 = null;
                return;
            }
            var2.method1959(-52);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIZBI)V", line = 203)
    public static final void method1044(int arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        field2664++;
        class179.field3109 = 0L;
        boolean var5 = false;
        int var6 = class165.method1132((byte) 97);
        if (var6 > 0 != arg0 > 0) {
            var5 = true;
        }
        if (arg0 == 3 || var6 == 3) {
            arg2 = true;
        }
        if (arg3 <= 102) {
            method1050(true);
        }
        if (class198.field3453.startsWith("mac") && arg0 > 0) {
            arg2 = true;
        }
        if (arg2 && arg0 > 0) {
            var5 = true;
        }
        class232.method1667(var5, arg2, arg1, arg0, 3, arg4, var6);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Luh;", line = 240)
    public final class279 method1045(int arg0) {
        field2651++;
        if (arg0 != 6507) {
            field2672 = (class103) null;
        }
        class279 var2 = this.field2674;
        if (this.field2660 == var2) {
            this.field2674 = null;
            return null;
        } else {
            this.field2674 = var2.field4776;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([BI)[B", line = 262)
    public static final byte[] method1046(byte[] arg0, int arg1) {
        field2656++;
        if (arg1 >= -112) {
            return (byte[]) null;
        } else {
            int var2 = arg0.length;
            byte[] var3 = new byte[var2];
            class36.method321(arg0, 0, var3, 0, var2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLuh;)V", line = 279)
    public final void method1047(byte arg0, class279 arg1) {
        if (arg0 >= -9) {
            this.method1045(-11);
        }
        if (arg1.field4784 != null) {
            arg1.method1959(-65);
        }
        field2671++;
        arg1.field4776 = this.field2660;
        arg1.field4784 = this.field2660.field4784;
        arg1.field4784.field4776 = arg1;
        arg1.field4776.field4784 = arg1;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)Luh;", line = 299)
    public final class279 method1048(int arg0) {
        field2657++;
        class279 var2 = this.field2660.field4776;
        if (arg0 != 31832) {
            field2653 = 119;
        }
        if (this.field2660 == var2) {
            this.field2674 = null;
            return null;
        } else {
            this.field2674 = var2.field4776;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)Lad;", line = 334)
    public static final class129 method1049(byte arg0) {
        field2665++;
        if (arg0 <= 62) {
            field2654 = (class229) null;
        }
        class129 var1;
        if (class108.field1900) {
            var1 = new class75(class97.field1722, class307.field5192, class272.field4659[0], class256.field4473[0], class232.field4025[0], class6.field71[0], class21.field357[0], class64.field1115);
        } else {
            var1 = new class248(class97.field1722, class307.field5192, class272.field4659[0], class256.field4473[0], class232.field4025[0], class6.field71[0], class21.field357[0], class64.field1115);
        }
        class62.method466((byte) 64);
        return var1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V", line = 352)
    public static void method1050(boolean arg0) {
        field2668 = null;
        field2654 = null;
        field2663 = null;
        field2661 = null;
        field2672 = null;
        if (arg0) {
            method1044(-22, -88, true, (byte) 23, -126);
        }
        field2655 = null;
        field2670 = null;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V", line = 395)
    public class156() {
        this.field2660.field4776 = this.field2660;
        this.field2660.field4784 = this.field2660;
    }
}
