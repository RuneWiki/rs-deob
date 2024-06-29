import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class450 extends class192 {

    @OriginalMember(owner = "client!qp", name = "A", descriptor = "I")
    public int field6564 = -1;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
    public static int field6553 = -1;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "Z")
    public static boolean field6555 = false;

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "I")
    public static int field6559 = -1;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    public static int field6556 = 0;

    @OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
    public static int field6562 = -1;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
    public int field6560;

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!qp", name = "B", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "Ljava/lang/String;")
    public String field6558;

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "Ljava/lang/String;")
    public String field6561;

    @OriginalMember(owner = "client!qp", name = "C", descriptor = "[I")
    public static int[] field6566;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "(I)V")
    public static final void method2621(int arg0) {
        ++field6557;
        int var1 = class293.field4173 * 128 + 64;
        int var2 = class142.field1851 * 128 + 64;
        int var3 = class103.method620(class355.field5121, var2, (byte) 20, var1) + -class423.field6256;
        if (~class232.field3236 > -101) {
            if (var1 > class205.field2843) {
                class205.field2843 += class85.field1166 - -((var1 - class205.field2843) * class232.field3236 / 1000);
                if (var1 < class205.field2843) {
                    class205.field2843 = var1;
                }
            }
            if (class205.field2843 > var1) {
                class205.field2843 -= class85.field1166 - -((-var1 + class205.field2843) * class232.field3236 / 1000);
                if (var1 > class205.field2843) {
                    class205.field2843 = var1;
                }
            }
            if (~var3 < ~class432.field6338) {
                class432.field6338 += class85.field1166 - -((-class432.field6338 + var3) * class232.field3236 / 1000);
                if (~class432.field6338 < ~var3) {
                    class432.field6338 = var3;
                }
            }
            if (class282.field4026 < var2) {
                class282.field4026 += (var2 - class282.field4026) * class232.field3236 / 1000 + class85.field1166;
                if (var2 < class282.field4026) {
                    class282.field4026 = var2;
                }
            }
            if (~var3 > ~class432.field6338) {
                class432.field6338 -= (-var3 + class432.field6338) * class232.field3236 / 1000 + class85.field1166;
                if (~var3 < ~class432.field6338) {
                    class432.field6338 = var3;
                }
            }
            if (class282.field4026 > var2) {
                class282.field4026 -= (-var2 + class282.field4026) * class232.field3236 / 1000 + class85.field1166;
                if (~class282.field4026 > ~var2) {
                    class282.field4026 = var2;
                }
            }
        } else {
            class282.field4026 = class142.field1851 * 128 + 64;
            class205.field2843 = class293.field4173 * 128 + 64;
            class432.field6338 = class103.method620(class355.field5121, class282.field4026, (byte) 20, class205.field2843) + -class423.field6256;
        }
        int var4 = class167.field2190 * 128 + 64;
        int var5 = class350.field5085 * 128 + 64;
        int var6 = class103.method620(class355.field5121, var5, (byte) 20, var4) + -class348.field5043;
        int var7 = var4 - class205.field2843;
        int var8 = -class432.field6338 + var6;
        if (arg0 == 12891) {
            int var9 = -class282.field4026 + var5;
            int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
            int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 16383;
            if (~var11 > -1025) {
                var11 = 1024;
            }
            int var12 = 16383 & (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9));
            if (~var11 < -3073) {
                var11 = 3072;
            }
            if (class317.field4653 < var11) {
                class317.field4653 += (-class317.field4653 + var11 >> 3) * class278.field3964 / 1000 + class391.field5800 << 3;
                if (~class317.field4653 < ~var11) {
                    class317.field4653 = var11;
                }
            }
            if (var11 < class317.field4653) {
                class317.field4653 -= (-var11 + class317.field4653 >> 3) * class278.field3964 / 1000 + class391.field5800 << 3;
                if (~class317.field4653 > ~var11) {
                    class317.field4653 = var11;
                }
            }
            int var13 = var12 - class21.field284;
            if (~var13 < -8193) {
                var13 -= 16384;
            }
            if (~var13 > 8191) {
                var13 += 16384;
            }
            int var14 = var13 >> 3;
            if (~var14 < -1) {
                class21.field284 += class278.field3964 * var14 / 1000 + class391.field5800 << 3;
                class21.field284 &= 16383;
            }
            if (var14 < 0) {
                class21.field284 -= -var14 * class278.field3964 / 1000 + class391.field5800 << 3;
                class21.field284 &= 16383;
            }
            int var15 = -class21.field284 + var12;
            if (var15 > 8192) {
                var15 -= 16384;
            }
            if (~var15 > 8191) {
                var15 += 16384;
            }
            if (~var15 > -1 && ~var14 < -1 || var15 > 0 && var14 < 0) {
                class21.field284 = var12;
            }
            class236.field3317 = 0;
        }
    }

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "(I)Lh;")
    public final class452 method2622(int arg0) {
        ++field6563;
        if (arg0 != -2040516573) {
            field6559 = -123;
        }
        return class223.field3151[super.field2729];
    }

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "(I)V")
    public static void method2623(int arg0) {
        if (arg0 == 3174179) {
            field6566 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "(I)V")
    public static final void method2624(int arg0) {
        if (arg0 != 7479) {
            method2623(104);
        }
        ++field6565;
        class353 var1 = null;
        try {
            class439 var2 = class86.field1182.method343(14, "2");
            while (~var2.field6417 == -1) {
                class322.method1935(true, 1L);
            }
            if (var2.field6417 == 1) {
                var1 = (class353) var2.field6416;
                class156 var3 = new class156(class438.field6411 * 6 + 3);
                var3.method947(arg0 ^ -7430, 1);
                var3.method961(class438.field6411, 1608339368);
                for (int var4 = 0; class115.field1486.length > var4; ++var4) {
                    if (class420.field6208[var4]) {
                        var3.method961(var4, 1608339368);
                        var3.method969(19869, class115.field1486[var4]);
                    }
                }
                var1.method2140(var3.field2018, arg0 ^ 7478, 0, var3.field2041);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method2141(-101);
            }
        } catch (Exception var5) {
        }
        class193.field2734 = class109.method653(false);
        class438.field6406 = false;
    }
}
