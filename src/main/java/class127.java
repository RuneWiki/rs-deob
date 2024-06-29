import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class127 {

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "[I")
    public static int[] field1629 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "[I")
    public static int[] field1625 = new int[13];

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Lmi;")
    public static class326 field1627;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)I")
    public static final int method708(int arg0, int arg1) {
        field1626++;
        double var2 = (double) ((arg0 & 0xFFF5A8) >> 16) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        int var18 = 17 % ((arg1 - 68) / 33);
        double var19 = var12 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var14 * 256.0D);
        int var23 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var23 > 243) {
            var22 >>= 0x4;
        } else if (var23 > 217) {
            var22 >>= 0x3;
        } else if (var23 > 192) {
            var22 >>= 0x2;
        } else if (var23 > 179) {
            var22 >>= 0x1;
        }
        return ((var21 >> 2 & 0x3F) << 10) - (-(var22 >> 5 << 7) - (var23 >> 1));
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IF[BFFIFIIIILdd;F)V")
    public static final void method709(int arg0, float arg1, byte[] arg2, float arg3, float arg4, int arg5, float arg6, int arg7, int arg8, int arg9, int arg10, class477 arg11, float arg12) {
        field1628++;
        for (int var13 = arg10; var13 < arg8; var13++) {
            class131.method725(arg11, arg12, arg0, var13, arg6, arg9, arg1, arg10 ^ 0xFFFFC2C6, arg8, arg7, arg5, arg2, arg3, arg4);
            arg9 += arg0 * arg7;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lru;III)V")
    public static final void method710(class121 arg0, int arg1, int arg2, int arg3) {
        field1630++;
        int var4 = -49 % ((arg1 + 43) / 60);
        class99.field1353[arg2][arg3] = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method711(byte arg0) {
        field1625 = null;
        field1629 = null;
        if (arg0 != 118) {
            field1627 = null;
        }
        field1627 = null;
    }
}
