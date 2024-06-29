import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class592 {

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "[B")
    public static byte[] field7702 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "Ldu;")
    public static class360 field7700 = new class360(16);

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "Ldr;")
    public static class721 field7703 = new class721();

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    public static int field7698;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
    public static int field7699;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method3220(byte arg0, int arg1) {
        if (arg0 != 0) {
            method3220((byte) -87, 87);
        }
        field7698++;
        if (class480.field6584 == null || arg1 > class480.field6584.length) {
            class480.field6584 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILrda;)V", line = 35)
    public static final void method3221(int arg0, class663 arg1) {
        if (class583.field7638 == null) {
            class402 var2 = new class402();
            byte[] var3 = var2.method2366(128, (byte) 114, 16, 128);
            class583.field7638 = class166.method1195(false, var3, (byte) 127);
        }
        field7699++;
        if (class176.field2658 == null) {
            class117 var4 = new class117();
            byte[] var5 = var4.method959(128, 16, 128, 4096);
            class176.field2658 = class166.method1195(false, var5, (byte) 62);
        }
        class34 var6 = arg1.field8950;
        if (var6.method284(35632) && class148.field2335 == null) {
            byte[] var7 = class408.method2387(4.0F, 0.6F, 4.0F, (byte) 113, new class658(419684), 128, 16.0F, 16, 8, 128, 0.5F);
            class148.field2335 = class166.method1195(false, var7, (byte) 115);
        }
        if (arg0 > -100) {
            method3220((byte) 41, 110);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V", line = 75)
    public static void method3222(byte arg0) {
        field7700 = null;
        field7702 = null;
        if (arg0 != 43) {
            field7703 = null;
        }
        field7703 = null;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IB)I", line = 87)
    public static final int method3223(int arg0, byte arg1) {
        field7701++;
        double var2 = (double) ((arg0 & 0xFFF27A) >> 16) / 256.0D;
        double var4 = (double) ((arg0 & 0xFFE1) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
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
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
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
        if (arg1 < 102) {
            field7703 = null;
        }
        return (var22 >> 1) + ((var20 & 0xFF) >> 2 << 10) + (var21 >> 5 << 7);
    }
}
