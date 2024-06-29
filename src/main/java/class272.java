import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class272 extends OutputStream {

    @OriginalMember(owner = "client!al", name = "d", descriptor = "[I")
    public static int[] field4768 = new int[5];

    @OriginalMember(owner = "client!al", name = "g", descriptor = "[[[B")
    public static byte[][][] field4771 = new byte[4][104][104];

    @OriginalMember(owner = "client!al", name = "a", descriptor = "[I")
    public static int[] field4765 = new int[50];

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "[Lbj;")
    public static class44[] field4766;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lni;III)V")
    public static final void method1857(class20 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class209.field3759) {
            class195 var4 = class71.field1613[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3541 != null && var4.field3541.field2089.method192()) {
                arg0.method196(var4.field3541.field2089, 128, 0, 0, true);
            }
        }
        if (arg3 < class209.field3759) {
            class195 var5 = class71.field1613[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3541 != null && var5.field3541.field2089.method192()) {
                arg0.method196(var5.field3541.field2089, 0, 0, 128, true);
            }
        }
        if (arg2 < class209.field3759 && arg3 < class44.field1050) {
            class195 var6 = class71.field1613[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3541 != null && var6.field3541.field2089.method192()) {
                arg0.method196(var6.field3541.field2089, 128, 0, 128, true);
            }
        }
        if (arg2 < class209.field3759 && arg3 > 0) {
            class195 var7 = class71.field1613[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3541 != null && var7.field3541.field2089.method192()) {
                arg0.method196(var7.field3541.field2089, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)Ldl;")
    public static final class31 method1858(int arg0, int arg1) {
        int var2 = arg0 >> 16;
        int var3 = arg0 & arg1;
        field4770++;
        if (class259.field4572[var2] == null || class259.field4572[var2][var3] == null) {
            boolean var4 = class1.method9(var2, (byte) -13);
            if (!var4) {
                return null;
            }
        }
        return class259.field4572[var2][var3];
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(II)I")
    public static final int method1859(int arg0, int arg1) {
        if (arg1 != 2047) {
            method1860(-52);
        }
        field4772++;
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public static void method1860(int arg0) {
        field4766 = null;
        field4768 = null;
        if (arg0 <= -15) {
            field4765 = null;
            field4771 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
    public static final void method1861(int arg0) {
        int var1 = class71.field1599 * 128 + 64;
        int var2 = class77.field1685 * 128 + 64;
        field4773++;
        int var3 = class31.method303(var1, var2, class159.field2998, arg0 ^ 0xFFFFB090) - class183.field3354;
        if (class98.field1981 < 100) {
            if (class207.field3725 < var1) {
                class207.field3725 += (var1 - class207.field3725) * class98.field1981 / 1000 + class143.field2768;
                if (class207.field3725 > var1) {
                    class207.field3725 = var1;
                }
            }
            if (class64.field1419 < var3) {
                class64.field1419 += (var3 - class64.field1419) * class98.field1981 / 1000 + class143.field2768;
                if (class64.field1419 > var3) {
                    class64.field1419 = var3;
                }
            }
            if (class207.field3725 > var1) {
                class207.field3725 -= (class207.field3725 - var1) * class98.field1981 / 1000 + class143.field2768;
                if (var1 > class207.field3725) {
                    class207.field3725 = var1;
                }
            }
            if (class64.field1419 > var3) {
                class64.field1419 -= (class64.field1419 - var3) * class98.field1981 / 1000 + class143.field2768;
                if (class64.field1419 < var3) {
                    class64.field1419 = var3;
                }
            }
            if (class150.field2849 < var2) {
                class150.field2849 += (var2 - class150.field2849) * class98.field1981 / 1000 + class143.field2768;
                if (var2 < class150.field2849) {
                    class150.field2849 = var2;
                }
            }
            if (var2 < class150.field2849) {
                class150.field2849 -= class143.field2768 + ((class150.field2849 - var2) * class98.field1981 / 1000);
                if (var2 > class150.field2849) {
                    class150.field2849 = var2;
                }
            }
        } else {
            class207.field3725 = class71.field1599 * 128 + 64;
            class150.field2849 = class77.field1685 * 128 + 64;
            class64.field1419 = class31.method303(class207.field3725, class150.field2849, class159.field2998, -4) - class183.field3354;
        }
        int var4 = class142.field2750 * 128 + 64;
        int var5 = class223.field4002 * 128 + 64;
        int var6 = class31.method303(var5, var4, class159.field2998, -4) - class52.field1162;
        int var7 = var5 - class207.field3725;
        int var8 = var4 - class150.field2849;
        int var9 = var6 - class64.field1419;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var8)) & 0x7FF;
        int var13 = var12 - class123.field2422;
        if (var11 > class276.field4820) {
            class276.field4820 += (var11 - class276.field4820) * class53.field1185 / 1000 + class132.field2605;
            if (var11 < class276.field4820) {
                class276.field4820 = var11;
            }
        }
        if (var11 < class276.field4820) {
            class276.field4820 -= (class276.field4820 - var11) * class53.field1185 / 1000 + class132.field2605;
            if (class276.field4820 < var11) {
                class276.field4820 = var11;
            }
        }
        if (arg0 != 20332) {
            method1861(38);
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class123.field2422 += class53.field1185 * var13 / 1000 + class132.field2605;
            class123.field2422 &= 0x7FF;
        }
        if (var13 < 0) {
            class123.field2422 -= -var13 * class53.field1185 / 1000 + class132.field2605;
            class123.field2422 &= 0x7FF;
        }
        int var14 = var12 - class123.field2422;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class123.field2422 = var12;
        }
    }

    @OriginalMember(owner = "client!al", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field4767++;
        throw new IOException();
    }
}
