import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class247 {

    @OriginalMember(owner = "client!li", name = "b", descriptor = "Lnn;")
    public static class239 field3353 = class360.method2301((byte) -71);

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field3357 = 0;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Lbn;")
    public static class257 field3356 = new class257();

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field3358 = 0;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field3359 = 0;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "Lra;")
    public static class57 field3361;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "[I")
    public static int[] field3360;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Z", line = 9)
    public static final boolean method1555(int arg0) {
        if (arg0 != 0) {
            return false;
        }
        field3355++;
        class159 var1 = (class159) class32.field301.field2358.field5247;
        if (var1 == null || class32.field301.field2358 == var1) {
            return false;
        } else {
            if (var1.field2257 >= 2000) {
                var1.field2257 -= 2000;
            }
            return var1.field2257 == 1004;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V", line = 37)
    public static void method1556(int arg0) {
        field3361 = null;
        field3356 = null;
        if (arg0 != 128) {
            method1558(-17);
        }
        field3353 = null;
        field3360 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V", line = 50)
    public static final void method1557(boolean arg0) {
        field3354++;
        int var1 = class228.field3114 * 128 + 64;
        int var2 = class402.field5872 * 128 + 64;
        int var3 = class372.method2335(var2, class410.field5931, (byte) 21, var1) - class249.field3392;
        if (class166.field2330 >= 100) {
            class272.field3853 = class228.field3114 * 128 + 64;
            class272.field3852 = class402.field5872 * 128 + 64;
            class164.field2289 = class372.method2335(class272.field3852, class410.field5931, (byte) 118, class272.field3853) - class249.field3392;
        } else {
            if (var1 > class272.field3853) {
                class272.field3853 += class164.field2294 + ((var1 - class272.field3853) * class166.field2330 / 1000);
                if (class272.field3853 > var1) {
                    class272.field3853 = var1;
                }
            }
            if (var3 > class164.field2289) {
                class164.field2289 += (var3 - class164.field2289) * class166.field2330 / 1000 + class164.field2294;
                if (class164.field2289 > var3) {
                    class164.field2289 = var3;
                }
            }
            if (class272.field3853 > var1) {
                class272.field3853 -= class164.field2294 + ((class272.field3853 - var1) * class166.field2330 / 1000);
                if (var1 > class272.field3853) {
                    class272.field3853 = var1;
                }
            }
            if (class164.field2289 > var3) {
                class164.field2289 -= (class164.field2289 - var3) * class166.field2330 / 1000 + class164.field2294;
                if (var3 > class164.field2289) {
                    class164.field2289 = var3;
                }
            }
            if (var2 > class272.field3852) {
                class272.field3852 += (var2 - class272.field3852) * class166.field2330 / 1000 + class164.field2294;
                if (class272.field3852 > var2) {
                    class272.field3852 = var2;
                }
            }
            if (var2 < class272.field3852) {
                class272.field3852 -= (class272.field3852 - var2) * class166.field2330 / 1000 + class164.field2294;
                if (class272.field3852 < var2) {
                    class272.field3852 = var2;
                }
            }
        }
        int var4 = class269.field3784 * 128 + 64;
        int var5 = class188.field2548 * 128 + 64;
        int var6 = class372.method2335(var4, class410.field5931, (byte) 95, var5) - class41.field465;
        int var7 = var5 - class272.field3853;
        int var8 = var6 - class164.field2289;
        int var9 = var4 - class272.field3852;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class314.field4472 < var11) {
            class314.field4472 += class26.field256 + ((var11 - class314.field4472 >> 3) * class180.field2474 / 1000) << 3;
            if (var11 < class314.field4472) {
                class314.field4472 = var11;
            }
        }
        if (!arg0) {
            method1557(true);
        }
        if (var11 < class314.field4472) {
            class314.field4472 -= (class314.field4472 - var11 >> 3) * class180.field2474 / 1000 + class26.field256 << 3;
            if (var11 > class314.field4472) {
                class314.field4472 = var11;
            }
        }
        int var13 = var12 - class77.field869;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class77.field869 += class26.field256 + (class180.field2474 * var14 / 1000) << 3;
            class77.field869 &= 0x3FFF;
        }
        if (var14 < 0) {
            class77.field869 -= -var14 * class180.field2474 / 1000 + class26.field256 << 3;
            class77.field869 &= 0x3FFF;
        }
        int var15 = var12 - class77.field869;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class77.field869 = var12;
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V", line = 208)
    public static final void method1558(int arg0) {
        field3352++;
        class331 var1 = class123.field1633;
        synchronized (class123.field1633) {
            if (arg0 != -8193) {
                return;
            }
            class123.field1633.method2043(-53);
        }
        class331 var2 = class171.field2392;
        synchronized (class171.field2392) {
            class171.field2392.method2043(-127);
        }
    }
}
