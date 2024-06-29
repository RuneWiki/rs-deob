import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class228 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Z")
    public static boolean field3281 = true;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static final void method1552(int arg0) {
        field3282++;
        int var1 = class352.field4836 * 128 + 64;
        int var2 = class103.field1456 * 128 + 64;
        int var3 = class407.method2440(var1, -16490, var2, class387.field5306) - class178.field2697;
        if (class125.field1695 < 100) {
            if (var1 > class135.field1884) {
                class135.field1884 += (var1 - class135.field1884) * class125.field1695 / 1000 + class114.field1605;
                if (class135.field1884 > var1) {
                    class135.field1884 = var1;
                }
            }
            if (class135.field1884 > var1) {
                class135.field1884 -= (class135.field1884 - var1) * class125.field1695 / 1000 + class114.field1605;
                if (var1 > class135.field1884) {
                    class135.field1884 = var1;
                }
            }
            if (class303.field4302 < var3) {
                class303.field4302 += class114.field1605 + ((var3 - class303.field4302) * class125.field1695 / 1000);
                if (var3 < class303.field4302) {
                    class303.field4302 = var3;
                }
            }
            if (class303.field4302 > var3) {
                class303.field4302 -= class114.field1605 + ((class303.field4302 - var3) * class125.field1695 / 1000);
                if (var3 > class303.field4302) {
                    class303.field4302 = var3;
                }
            }
            if (var2 > class184.field2784) {
                class184.field2784 += (var2 - class184.field2784) * class125.field1695 / 1000 + class114.field1605;
                if (class184.field2784 > var2) {
                    class184.field2784 = var2;
                }
            }
            if (var2 < class184.field2784) {
                class184.field2784 -= (class184.field2784 - var2) * class125.field1695 / 1000 + class114.field1605;
                if (class184.field2784 < var2) {
                    class184.field2784 = var2;
                }
            }
        } else {
            class135.field1884 = class352.field4836 * 128 + 64;
            class184.field2784 = class103.field1456 * 128 + 64;
            class303.field4302 = class407.method2440(class135.field1884, -16490, class184.field2784, class387.field5306) - class178.field2697;
        }
        int var4 = class27.field282 * 128 + 64;
        int var5 = class481.field6810 * 128 + 64;
        int var6 = class407.method2440(var4, -16490, var5, class387.field5306) - class194.field2894;
        int var7 = var4 - class135.field1884;
        if (arg0 >= -77) {
            return;
        }
        int var8 = var6 - class303.field4302;
        int var9 = var5 - class184.field2784;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class366.field5028) {
            class366.field5028 += (var11 - class366.field5028 >> 3) * class227.field3279 / 1000 + class374.field5179 << 3;
            if (var11 < class366.field5028) {
                class366.field5028 = var11;
            }
        }
        if (class366.field5028 > var11) {
            class366.field5028 -= (class366.field5028 - var11 >> 3) * class227.field3279 / 1000 + class374.field5179 << 3;
            if (class366.field5028 < var11) {
                class366.field5028 = var11;
            }
        }
        int var13 = var12 - class103.field1455;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class103.field1455 += class227.field3279 * var14 / 1000 + class374.field5179 << 3;
            class103.field1455 &= 0x3FFF;
        }
        if (var14 < 0) {
            class103.field1455 -= -var14 * class227.field3279 / 1000 + class374.field5179 << 3;
            class103.field1455 &= 0x3FFF;
        }
        int var15 = var12 - class103.field1455;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class158.field2258 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class103.field1455 = var12;
        }
    }
}
