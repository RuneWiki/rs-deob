import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class76 {

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field1540 = 0;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Lbj;")
    public static class162 field1542 = new class162(79, -1);

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "Z")
    public static boolean field1543 = false;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    public static int field1544 = 0;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "Ls;")
    public static class186 field1545 = new class186(84, 16);

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "Lbj;")
    public static class162 field1546 = new class162(16, 6);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 6)
    public static final void method682(int arg0) {
        field1539++;
        if (class97.field1892 != null) {
            return;
        }
        class97.field1892 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        int var3 = 0;
        if (arg0 < 122) {
            field1545 = null;
        }
        while (var3 < 65536) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 * 6.0D < 1.0D) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var33 << 8) + (var32 << 16) + var34;
            class97.field1892[var3] = var35;
            var3++;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)Leo;", line = 121)
    public static final class196 method683(int arg0) {
        if (arg0 != 6) {
            return null;
        }
        field1538++;
        try {
            return (class196) Class.forName("cu").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)V", line = 138)
    public static void method684(int arg0) {
        if (arg0 != 0) {
            method685(50, 43, -37, 5);
        }
        field1542 = null;
        field1546 = null;
        field1545 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIII)I", line = 150)
    public static final int method685(int arg0, int arg1, int arg2, int arg3) {
        field1541++;
        int var4 = arg3 / arg0;
        int var5 = arg3 & arg0 - 1;
        int var6 = arg2 / arg0;
        int var7 = arg2 & arg0 - 1;
        int var8 = class358.method2209(var4, var6, -94);
        int var9 = class358.method2209(var4 + 1, var6, arg1 ^ 0x3C);
        int var10 = class358.method2209(var4, var6 + 1, arg1 ^ 0x71);
        int var11 = class358.method2209(var4 - arg1, var6 - -1, -116);
        int var12 = class119.method959(var5, var9, var8, arg0, 30699);
        int var13 = class119.method959(var5, var11, var10, arg0, 30699);
        return class119.method959(var7, var13, var12, arg0, 30699);
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)V", line = 183)
    public static final void method686(int arg0) {
        class332.field5041 = arg0;
        field1537++;
        class373.field5469.method1891(-3);
        class373.field5469.method1885(false, class27.field446);
        class332.field5041++;
    }
}
