import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class162 {

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Lva;")
    public class34 field2931 = new class34();

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field2939 = 0;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Lla;")
    public static class95 field2933 = new class95(64);

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "[I")
    public static int[] field2942 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "Lva;")
    private class34 field2943;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "Ljava/awt/Image;")
    public static Image field2941;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "[[[I")
    public static int[][][] field2940;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)Lva;")
    public final class34 method1115(byte arg0) {
        if (arg0 >= -35) {
            field2933 = null;
        }
        field2938++;
        class34 var2 = this.field2931.field598;
        if (this.field2931 == var2) {
            this.field2943 = null;
            return null;
        } else {
            this.field2943 = var2.field598;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
    public static void method1116(byte arg0) {
        field2941 = null;
        field2940 = null;
        field2942 = null;
        field2933 = null;
        if (arg0 != -8) {
            field2939 = 48;
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)V")
    public final void method1117(byte arg0) {
        if (arg0 <= 28) {
            return;
        }
        while (true) {
            class34 var2 = this.field2931.field595;
            if (this.field2931 == var2) {
                this.field2943 = null;
                field2936++;
                return;
            }
            var2.method269(-214950896);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IBI)I")
    public static final int method1118(int arg0, byte arg1, int arg2) {
        if (arg1 >= -126) {
            method1118(43, (byte) -55, -87);
        }
        field2932++;
        int var3 = (class5.method45(arg0 + 45365, -116, arg2 + 91923, 4) - (-(class5.method45(arg0 + 10294, 119, arg2 + 37821, 2) - 128 >> 1) - (class5.method45(arg0, -104, arg2, 1) - 128 >> 2))) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)Lva;")
    public final class34 method1119(int arg0) {
        class34 var2 = this.field2931.field595;
        field2944++;
        if (this.field2931 == var2) {
            this.field2943 = null;
            return null;
        }
        this.field2943 = var2.field595;
        if (arg0 != 20896) {
            this.method1122(true);
        }
        return var2;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)Lva;")
    public final class34 method1120(int arg0) {
        if (arg0 < 30) {
            field2940 = null;
        }
        field2928++;
        class34 var2 = this.field2943;
        if (this.field2931 == var2) {
            this.field2943 = null;
            return null;
        } else {
            this.field2943 = var2.field595;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lij;I)V")
    public static final void method1121(class194 arg0, int arg1) {
        if (arg1 <= 113) {
            return;
        }
        for (int var2 = 0; var2 < class276.field4873.length; var2++) {
            class276.field4873[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var3 * 128.0D * Math.random());
            class276.field4873[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < (var3 - 1); var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class179.field3252[var15] = (class276.field4873[var15 - 1] + class276.field4873[var15 + 1] + class276.field4873[var15 - 128] + class276.field4873[var15 + 128]) / 4;
                }
            }
            int[] var13 = class276.field4873;
            class276.field4873 = class179.field3252;
            class179.field3252 = var13;
        }
        if (arg0 != null) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.field4076; var7++) {
                for (int var8 = 0; var8 < arg0.field4078; var8++) {
                    if (arg0.field3496[var6++] != 0) {
                        int var9 = var7 + arg0.field4085 + 16;
                        int var10 = arg0.field4083 + var8 + 16;
                        int var11 = (var9 << 7) + var10;
                        class276.field4873[var11] = 0;
                    }
                }
            }
        }
        field2937++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)Lva;")
    public final class34 method1122(boolean arg0) {
        class34 var2 = this.field2943;
        field2930++;
        if (this.field2931 == var2) {
            this.field2943 = null;
            return null;
        }
        if (!arg0) {
            field2940 = null;
        }
        this.field2943 = var2.field598;
        return var2;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lva;B)V")
    public final void method1123(class34 arg0, byte arg1) {
        field2929++;
        if (arg0.field598 != null) {
            arg0.method269(-214950896);
        }
        if (arg1 > -126) {
            this.field2943 = null;
        }
        arg0.field598 = this.field2931.field598;
        arg0.field595 = this.field2931;
        arg0.field598.field595 = arg0;
        arg0.field595.field598 = arg0;
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(B)Lva;")
    public final class34 method1124(byte arg0) {
        field2934++;
        if (arg0 <= 81) {
            field2940 = null;
        }
        class34 var2 = this.field2931.field595;
        if (this.field2931 == var2) {
            return null;
        } else {
            var2.method269(-214950896);
            return var2;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILva;)V")
    public final void method1125(int arg0, class34 arg1) {
        field2935++;
        if (arg1.field598 != null) {
            arg1.method269(-214950896);
        }
        arg1.field598 = this.field2931;
        arg1.field595 = this.field2931.field595;
        arg1.field598.field595 = arg1;
        if (arg0 != -17837) {
            field2940 = null;
        }
        arg1.field595.field598 = arg1;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
    public class162() {
        this.field2931.field598 = this.field2931;
        this.field2931.field595 = this.field2931;
    }
}
