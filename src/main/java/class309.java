import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class309 extends class392 {

    @OriginalMember(owner = "client!bv", name = "x", descriptor = "Lor;")
    public class640 field4194;

    @OriginalMember(owner = "client!bv", name = "w", descriptor = "[Lit;")
    public static class646[] field4193 = new class646[100];

    @OriginalMember(owner = "client!bv", name = "v", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)V")
    public static void method1864(boolean arg0) {
        field4193 = null;
        if (arg0) {
            method1864(true);
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lor;)V")
    public class309(class640 arg0) {
        this.field4194 = arg0;
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)V")
    public static final void method1865(int arg0) {
        field4192++;
        int var1 = class328.field4443 * 512 + 256;
        int var2 = class422.field5907 * 512 + 256;
        int var3 = class86.method624(class61.field677, var2, var1, 24111) - class659.field9193;
        if (class105.field1409 >= 100) {
            class684.field9518 = class422.field5907 * 512 + 256;
            class294.field3956 = class328.field4443 * 512 + 256;
            class262.field3429 = class86.method624(class61.field677, class684.field9518, class294.field3956, 24111) - class659.field9193;
        } else {
            if (class294.field3956 < var1) {
                class294.field3956 += class86.field1185 + ((var1 - class294.field3956) * class105.field1409 / 1000);
                if (class294.field3956 > var1) {
                    class294.field3956 = var1;
                }
            }
            if (var1 < class294.field3956) {
                class294.field3956 -= (class294.field3956 - var1) * class105.field1409 / 1000 + class86.field1185;
                if (class294.field3956 < var1) {
                    class294.field3956 = var1;
                }
            }
            if (class262.field3429 < var3) {
                class262.field3429 += (var3 - class262.field3429) * class105.field1409 / 1000 + class86.field1185;
                if (class262.field3429 > var3) {
                    class262.field3429 = var3;
                }
            }
            if (var2 > class684.field9518) {
                class684.field9518 += (var2 - class684.field9518) * class105.field1409 / 1000 + class86.field1185;
                if (class684.field9518 > var2) {
                    class684.field9518 = var2;
                }
            }
            if (class262.field3429 > var3) {
                class262.field3429 -= class86.field1185 + ((class262.field3429 - var3) * class105.field1409 / 1000);
                if (var3 > class262.field3429) {
                    class262.field3429 = var3;
                }
            }
            if (var2 < class684.field9518) {
                class684.field9518 -= (class684.field9518 - var2) * class105.field1409 / 1000 + class86.field1185;
                if (var2 > class684.field9518) {
                    class684.field9518 = var2;
                }
            }
        }
        int var4 = class273.field3591 * 512 + 256;
        int var5 = class353.field4712 * 512 + 256;
        int var6 = class86.method624(class61.field677, var4, var5, 24111) - class461.field6379;
        int var7 = var5 - class294.field3956;
        int var8 = var6 - class262.field3429;
        int var9 = var4 - class684.field9518;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class74.field801 < var11) {
            class74.field801 += (var11 - class74.field801 >> 3) * class372.field5192 / 1000 + class106.field1414 << 3;
            if (class74.field801 > var11) {
                class74.field801 = var11;
            }
        }
        if (var11 < class74.field801) {
            class74.field801 -= (class74.field801 - var11 >> 3) * class372.field5192 / 1000 + class106.field1414 << 3;
            if (var11 > class74.field801) {
                class74.field801 = var11;
            }
        }
        int var13 = var12 - class710.field9907;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class710.field9907 += class372.field5192 * var14 / 1000 + class106.field1414 << 3;
            class710.field9907 &= 0x3FFF;
        }
        if (var14 < 0) {
            class710.field9907 -= -var14 * class372.field5192 / 1000 + class106.field1414 << 3;
            class710.field9907 &= 0x3FFF;
        }
        int var15 = var12 - class710.field9907;
        if (arg0 <= 69) {
            return;
        }
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class659.field9198 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class710.field9907 = var12;
        }
    }
}
