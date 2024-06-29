import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class82 {

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "Lmb;")
    public static class96 field1380 = class243.method1708(")2", (byte) 126);

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "Lmb;")
    public static class96 field1379 = class243.method1708("<col=ff7000>", (byte) 111);

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Lmb;")
    public static class96 field1385 = class243.method1708("blinken3:", (byte) 119);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "[S")
    public static short[] field1378 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "[[B")
    public static byte[][] field1382 = new byte[250][];

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Lmb;")
    private static class96 field1381 = class243.method1708("Please wait)3)3)3", (byte) 126);

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "Z")
    public static boolean field1388 = false;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Lmb;")
    public static class96 field1393 = class243.method1708("p11_full", (byte) 100);

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "Lmb;")
    public static class96 field1390 = class243.method1708("mem=", (byte) 111);

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "[I")
    public static int[] field1391 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Lmb;")
    public static class96 field1383 = field1381;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "Z")
    public static boolean field1392 = true;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public int field1387;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static final void method577(int arg0) {
        class213.field3667.method83(0);
        if (arg0 > 31) {
            field1384++;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)I")
    public static final int method578(int arg0, int arg1) {
        field1389++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg0 != 0) {
            field1383 = null;
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)I")
    public static final int method579(int arg0, byte arg1) {
        field1386++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = 0.0D;
        double var12 = 0.0D;
        double var14 = var2;
        if (var2 < var4) {
            var14 = var4;
        }
        if (var14 < var6) {
            var14 = var6;
        }
        double var16 = (var8 + var14) / 2.0D;
        if (arg1 != 93) {
            method580((byte) -31);
        }
        if (var8 != var14) {
            if (var2 == var14) {
                var10 = (var4 - var6) / (var14 - var8);
            } else if (var4 == var14) {
                var10 = (var6 - var2) / (var14 - var8) + 2.0D;
            } else if (var6 == var14) {
                var10 = (var2 - var4) / (var14 - var8) + 4.0D;
            }
            if (var16 < 0.5D) {
                var12 = (var14 - var8) / (var8 + var14);
            }
            if (var16 >= 0.5D) {
                var12 = (var14 - var8) / (2.0D - var14 - var8);
            }
        }
        double var18 = var10 / 6.0D;
        int var20 = (int) (var12 * 256.0D);
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        int var21 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var21 > 243) {
            var20 >>= 0x4;
        } else if (var21 > 217) {
            var20 >>= 0x3;
        } else if (var21 > 192) {
            var20 >>= 0x2;
        } else if (var21 > 179) {
            var20 >>= 0x1;
        }
        int var22 = (int) (var18 * 256.0D);
        return (var20 >> 5 << 7) + (var22 >> 2 << 10) + (var21 >> 1);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    public static void method580(byte arg0) {
        field1391 = null;
        field1381 = null;
        field1393 = null;
        field1379 = null;
        if (arg0 != 26) {
            method578(127, 69);
        }
        field1385 = null;
        field1380 = null;
        field1378 = null;
        field1390 = null;
        field1382 = null;
        field1383 = null;
    }
}
