import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class20 extends class160 {

    @OriginalMember(owner = "client!he", name = "cb", descriptor = "I")
    private int field303 = 4096;

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "J")
    public static long field299 = 0L;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "Ljava/lang/String;")
    public static String field296 = "Loading...";

    @OriginalMember(owner = "client!he", name = "W", descriptor = "Ljava/lang/String;")
    public static String field297 = " is already on your ignore list.";

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field301 = "Loading sprites - ";

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!he", name = "bb", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field303 = arg0.method645(11596);
        }
        ++field293;
        if (arg1 < 11) {
            field297 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class20() {
        super(1, true);
    }

    @OriginalMember(owner = "client!he", name = "i", descriptor = "(B)V")
    public static final void method186(byte arg0) {
        class281.field4450.method1888(-16);
        if (arg0 == 21) {
            ++field298;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        ++field295;
        int[] var3 = super.field2488.method15((byte) 124, arg0);
        if (super.field2488.field42) {
            int[] var4 = this.method1085(0, arg0 + -1 & class53.field811, (byte) 56);
            int[] var5 = this.method1085(0, arg0, (byte) 38);
            int[] var6 = this.method1085(0, arg0 - -1 & class53.field811, (byte) 101);
            for (int var7 = 0; var7 < class240.field3896; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field303;
                int var9 = (var5[var7 + 1 & class189.field2929] - var5[class189.field2929 & var7 + -1]) * this.field303;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + var13 - -4096) / 4096.0F)));
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        if (arg1 != 57) {
            this.method2((class88) null, -83, 108);
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "j", descriptor = "(B)V")
    public static void method187(byte arg0) {
        field296 = null;
        field297 = null;
        field301 = null;
        int var1 = 46 % ((arg0 - -14) / 35);
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(III)Lak;")
    public static final class140 method188(int arg0, int arg1, int arg2) {
        class6 var3 = class269.field4298[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class140 var4 = var3.field144;
            var3.field144 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!he", name = "k", descriptor = "(B)V")
    public static final void method189(byte arg0) {
        ++field300;
        int var1 = class272.field4366 * 128 + 64;
        int var2 = class86.field1434 * 128 - -64;
        int var3 = class34.method269(class240.field3892, var2, var1, 103) - class277.field4401;
        if (~class168.field2628 <= -101) {
            class293.field4624 = class86.field1434 * 128 + 64;
            class219.field3375 = class272.field4366 * 128 + 64;
            class170.field2653 = class34.method269(class240.field3892, class293.field4624, class219.field3375, 103) - class277.field4401;
        } else {
            if (~var1 < ~class219.field3375) {
                class219.field3375 += class170.field2650 - -((var1 - class219.field3375) * class168.field2628 / 1000);
                if (~class219.field3375 < ~var1) {
                    class219.field3375 = var1;
                }
            }
            if (~var1 > ~class219.field3375) {
                class219.field3375 -= (-var1 + class219.field3375) * class168.field2628 / 1000 + class170.field2650;
                if (class219.field3375 < var1) {
                    class219.field3375 = var1;
                }
            }
            if (class293.field4624 < var2) {
                class293.field4624 += class170.field2650 - -((-class293.field4624 + var2) * class168.field2628 / 1000);
                if (var2 < class293.field4624) {
                    class293.field4624 = var2;
                }
            }
            if (~var3 < ~class170.field2653) {
                class170.field2653 += class170.field2650 - -((-class170.field2653 + var3) * class168.field2628 / 1000);
                if (~var3 > ~class170.field2653) {
                    class170.field2653 = var3;
                }
            }
            if (class293.field4624 > var2) {
                class293.field4624 -= (class293.field4624 - var2) * class168.field2628 / 1000 + class170.field2650;
                if (~class293.field4624 > ~var2) {
                    class293.field4624 = var2;
                }
            }
            if (class170.field2653 > var3) {
                class170.field2653 -= (-var3 + class170.field2653) * class168.field2628 / 1000 + class170.field2650;
                if (var3 > class170.field2653) {
                    class170.field2653 = var3;
                }
            }
        }
        int var4 = class293.field4610 * 128 + 64;
        int var5 = class128.field2019 * 128 + 64;
        int var6 = class34.method269(class240.field3892, var5, var4, 103) - class53.field808;
        int var7 = -class170.field2653 + var6;
        int var8 = -class293.field4624 + var5;
        int var9 = var4 - class219.field3375;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = 2047 & (int) (325.949D * Math.atan2((double) var7, (double) var10));
        if (~var11 > -129) {
            var11 = 128;
        }
        int var12 = (int) (Math.atan2((double) var9, (double) var8) * -325.949D) & 2047;
        if (var11 > 383) {
            var11 = 383;
        }
        if (arg0 != 54) {
            field294 = -35;
        }
        int var13 = -class83.field1408 + var12;
        if (~var13 < -1025) {
            var13 -= 2048;
        }
        if (~var13 > 1023) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class83.field1408 += class110.field1804 - -(class65.field1100 * var13 / 1000);
            class83.field1408 &= 2047;
        }
        if (~var11 < ~class62.field1066) {
            class62.field1066 += (-class62.field1066 + var11) * class65.field1100 / 1000 + class110.field1804;
            if (~var11 > ~class62.field1066) {
                class62.field1066 = var11;
            }
        }
        if (~var11 > ~class62.field1066) {
            class62.field1066 -= (class62.field1066 - var11) * class65.field1100 / 1000 + class110.field1804;
            if (~var11 < ~class62.field1066) {
                class62.field1066 = var11;
            }
        }
        if (var13 < 0) {
            class83.field1408 -= class110.field1804 - -(-var13 * class65.field1100 / 1000);
            class83.field1408 &= 2047;
        }
        int var14 = -class83.field1408 + var12;
        if (~var14 < -1025) {
            var14 -= 2048;
        }
        if (~var14 > 1023) {
            var14 += 2048;
        }
        if (~var14 > -1 && ~var13 < -1 || ~var14 < -1 && var13 < 0) {
            class83.field1408 = var12;
        }
    }
}
