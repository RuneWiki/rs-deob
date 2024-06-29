import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class496 {

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "Lwf;")
    public static class117 field7054 = new class117(50);

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "F")
    public static float field7051;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "[I")
    public static int[] field7055;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lqa;Z)V")
    public static final void method2957(class208 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        arg0.method510(0, 0, class165.field2605, 350);
        field7052++;
        arg0.method498(0, 0, class165.field2605, 350, class538.field8011 << 24 | 0x332277, 1);
        int var2 = 350 / class69.field869;
        if (class33.field399 > 0) {
            int var3 = 346 - class69.field869 - 4;
            int var4 = var2 * var3 / (var2 + class33.field399 - 1);
            int var5 = 4;
            if (class33.field399 > 1) {
                var5 += (class33.field399 - class182.field2744 - 1) * (var3 - var4) / (class33.field399 - 1);
            }
            arg0.method498(class165.field2605 - 16, var5, 12, var4, class538.field8011 << 24 | 0x332277, 2);
            for (int var6 = class182.field2744; var6 < class182.field2744 + var2 && class33.field399 > var6; var6++) {
                String[] var7 = class587.method3490('\b', 109, class540.field8106[var6]);
                int var8 = (class165.field2605 - 16 - 8) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = (var8 * var9) + 8;
                    arg0.method510(var10, 0, var8 + var10 - 8, 350);
                    class465.field6539.method726(var10, var7[var9], true, -16777216, -1, 348 - (var6 - class182.field2744) * class69.field869 - class184.field2770 - class643.field9365.field4792);
                }
            }
        }
        arg0.method510(0, 0, class165.field2605, 350);
        arg0.method1371(0, class165.field2605, 1, -1, 350 - class184.field2770);
        class114.field1608.method726(10, "--> " + class527.field7657, !arg1, -16777216, -1, 350 - class470.field6636.field4792 - 1);
        if (!class105.field1516) {
            return;
        }
        int var11 = -1;
        if ((class617.field9123 % 30) > 15) {
            var11 = 16777215;
        }
        arg0.method1376(var11, class470.field6636.method2126((byte) 118, "--> " + class527.field7657.substring(0, class145.field2044)) + 10, 12, (byte) -101, 350 - class470.field6636.field4792 - 11);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V")
    public static void method2958(byte arg0) {
        field7055 = null;
        int var1 = -88 % ((-arg0 - 89) / 36);
        field7054 = null;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)I")
    public static final int method2959(int arg0, int arg1) {
        field7053++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        if (arg1 > -68) {
            return 107;
        } else {
            int var6 = var5 | var5 >>> 8;
            int var7 = var6 | var6 >>> 16;
            return ~var7 & arg0;
        }
    }
}
