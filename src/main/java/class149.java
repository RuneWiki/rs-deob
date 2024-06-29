import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class149 {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    private int field2590;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    private int field2591;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "[[I")
    private int[][] field2600;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "[I")
    public static int[] field2595 = new int[2048];

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "S")
    public static short field2596 = 32767;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Lbj;")
    public static class80 field2597 = new class80(5000);

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "[I")
    public static int[] field2604 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field2601 = 0;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field2603 = 0;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "[Z")
    public static boolean[] field2605 = new boolean[112];

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "[Lwb;")
    public static class179[] field2602;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "[[Z")
    public static boolean[][] field2594;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class1.field4[arg0][var8][var14] == -class162.field2832) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class92.field1575[arg0][arg1][arg3] + arg5;
            if (!class34.method205(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class34.method205(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class34.method205(var9, var11, var13)) {
                return false;
            } else if (class34.method205(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class231.method1498(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class34.method205(var6 + 1, class92.field1575[arg0][arg1][arg3] + arg5, var7 + 1) && class34.method205(var6 + 128 - 1, class92.field1575[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class34.method205(var6 + 128 - 1, class92.field1575[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class34.method205(var6 + 1, class92.field1575[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method1057(int arg0) {
        field2604 = null;
        field2594 = null;
        field2602 = null;
        field2597 = null;
        field2605 = null;
        field2595 = null;
        if (arg0 != 0) {
            method1056(-89, 76, -100, -121, -103, -33);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)I")
    public final int method1058(byte arg0, int arg1) {
        field2599++;
        if (arg0 >= -117) {
            this.field2590 = -101;
        }
        if (this.field2600 != null) {
            arg1 = (int) ((long) this.field2590 * (long) arg1 / (long) this.field2591);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)I")
    public final int method1059(boolean arg0, int arg1) {
        if (this.field2600 != null) {
            arg1 = (int) ((long) this.field2590 * (long) arg1 / (long) this.field2591) + 6;
        }
        if (arg0) {
            return 104;
        } else {
            field2593++;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([BI)[B")
    public final byte[] method1060(byte[] arg0, int arg1) {
        if (this.field2600 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field2590 / (long) this.field2591) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field2600[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2590 + var6;
                int var14 = var13 / this.field2591;
                var6 = var13 - this.field2591 * var14;
                var5 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        if (arg1 != 1) {
            this.field2591 = -68;
        }
        field2598++;
        return arg0;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(II)V")
    public class149(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class104.method743((byte) 88, arg1, arg0);
            int var4 = arg1 / var3;
            this.field2590 = var4;
            int var5 = arg0 / var3;
            this.field2591 = var5;
            this.field2600 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field2600[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
