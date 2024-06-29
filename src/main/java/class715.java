import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class715 {

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "[I")
    public int[] field9751;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "[I")
    public int[] field9748;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "[I")
    public int[] field9755;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "[[F")
    public float[][] field9753;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
    public static int field9749;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public static int field9750;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public static int field9752;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public static int field9754;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
    public static int field9756;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    public static int field9757;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V", line = 6)
    public static final void method3959(byte arg0) {
        field9749++;
        int var1 = class342.field4791 * 512 + 256;
        int var2 = class278.field4013 * 512 + 256;
        int var3 = class778.method4273(var2, (byte) -92, var1, class184.field2420) - class351.field5123;
        if (class324.field4607 < 100) {
            if (var1 > class435.field6273) {
                class435.field6273 += (var1 - class435.field6273) * class324.field4607 / 1000 + class10.field110;
                if (class435.field6273 > var1) {
                    class435.field6273 = var1;
                }
            }
            if (var3 > class269.field3926) {
                class269.field3926 += (var3 - class269.field3926) * class324.field4607 / 1000 + class10.field110;
                if (class269.field3926 > var3) {
                    class269.field3926 = var3;
                }
            }
            if (var1 < class435.field6273) {
                class435.field6273 -= (class435.field6273 - var1) * class324.field4607 / 1000 + class10.field110;
                if (var1 > class435.field6273) {
                    class435.field6273 = var1;
                }
            }
            if (var2 > class223.field2892) {
                class223.field2892 += class10.field110 + ((var2 - class223.field2892) * class324.field4607 / 1000);
                if (class223.field2892 > var2) {
                    class223.field2892 = var2;
                }
            }
            if (var3 < class269.field3926) {
                class269.field3926 -= (class269.field3926 - var3) * class324.field4607 / 1000 + class10.field110;
                if (class269.field3926 < var3) {
                    class269.field3926 = var3;
                }
            }
            if (var2 < class223.field2892) {
                class223.field2892 -= (class223.field2892 - var2) * class324.field4607 / 1000 + class10.field110;
                if (class223.field2892 < var2) {
                    class223.field2892 = var2;
                }
            }
        } else {
            class223.field2892 = class278.field4013 * 512 + 256;
            class435.field6273 = class342.field4791 * 512 + 256;
            class269.field3926 = class778.method4273(class223.field2892, (byte) -124, class435.field6273, class184.field2420) - class351.field5123;
        }
        int var4 = class594.field8105 * 512 + 256;
        int var5 = class507.field7102 * 512 + 256;
        int var6 = class778.method4273(var5, (byte) -14, var4, class184.field2420) - class532.field7393;
        int var7 = var4 - class435.field6273;
        int var8 = var6 - class269.field3926;
        int var9 = var5 - class223.field2892;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        if (arg0 < 45) {
            field9756 = -1;
        }
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class74.field1000) {
            class74.field1000 += class430.field6225 + ((var11 - class74.field1000 >> 3) * class143.field1916 / 1000) << 3;
            if (var11 < class74.field1000) {
                class74.field1000 = var11;
            }
        }
        if (var11 < class74.field1000) {
            class74.field1000 -= (class74.field1000 - var11 >> 3) * class143.field1916 / 1000 + class430.field6225 << 3;
            if (var11 > class74.field1000) {
                class74.field1000 = var11;
            }
        }
        int var13 = var12 - class41.field442;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class41.field442 += class143.field1916 * var14 / 1000 + class430.field6225 << 3;
            class41.field442 &= 0x3FFF;
        }
        if (var14 < 0) {
            class41.field442 -= -var14 * class143.field1916 / 1000 + class430.field6225 << 3;
            class41.field442 &= 0x3FFF;
        }
        int var15 = var12 - class41.field442;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class41.field442 = var12;
        }
        class476.field6693 = 0;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIB)V", line = 166)
    public static final void method3960(int arg0, int arg1, byte arg2) {
        field9754++;
        class778 var3 = class389.method2406(arg2 ^ 0x79, (long) arg1, 14);
        var3.method4274(94);
        if (arg2 == -25) {
            var3.field10690 = arg0;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V", line = 180)
    public static final void method3961(int arg0) {
        class206.field2664 = -1;
        class312.field4419 = null;
        class228.field2953 = -1;
        class90.field1269 = -1;
        if (arg0 != 512) {
            return;
        }
        class183.field2406 = null;
        class325.field4611 = -1;
        class685.field9153 = null;
        field9752++;
        class685.field9171 = null;
        class562.field7701 = null;
        class204.field2635 = null;
        class593.field8101 = null;
        class422.field6071.method2843(-127);
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "([I[I[I[[F)V", line = 202)
    public class715(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field9751 = arg2;
        this.field9748 = arg0;
        this.field9755 = arg1;
        this.field9753 = arg3;
    }
}
