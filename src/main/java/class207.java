import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public abstract class class207 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "[B")
    public static byte[] field3031 = new byte[520];

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field3036 = 0;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "[[Z")
    public static boolean[][] field3035;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public static final void method1566(byte arg0) {
        field3034++;
        if (arg0 != 112 || class265.field3987 == null) {
            return;
        }
        while (true) {
            while (class111.field1802 < class221.field3299.length) {
                class218 var1 = class221.field3299[class111.field1802];
                if (var1 != null && var1.field3230 == -1) {
                    if (class225.field3322 == null) {
                        class225.field3322 = class265.field3987.method1889(var1.field3227, arg0 ^ 0x6C);
                    }
                    int var2 = class225.field3322.field345;
                    if (var2 == -1) {
                        return;
                    }
                    class225.field3322 = null;
                    var1.field3230 = var2;
                    class111.field1802++;
                } else {
                    class111.field1802++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)I")
    public static final int method1567(int arg0, byte arg1) {
        field3037++;
        double var2 = (double) ((arg0 & 0xFFDE93) >> 16) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (arg1 >= -73) {
            method1567(80, (byte) 102);
        }
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
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 1) + ((var20 & 0xFF) >> 2 << 10) + (var21 >> 5 << 7);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILdp;)V")
    public static final void method1568(int arg0, class174 arg1) {
        class243.field3544 = arg1;
        if (arg0 <= 66) {
            field3035 = null;
        }
        field3032++;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
    public static void method1569(byte arg0) {
        field3035 = null;
        field3031 = null;
        int var1 = -26 / ((arg0 + 66) / 45);
    }
}
