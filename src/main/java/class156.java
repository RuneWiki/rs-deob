import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class156 {

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    private int field2223;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "[[I")
    private int[][] field2219;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    private int field2221;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "[I")
    public static int[] field2222 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)I")
    public final int method1027(int arg0, int arg1) {
        field2220++;
        if (this.field2219 != null) {
            arg1 = (int) ((long) this.field2221 * (long) arg1 / (long) this.field2223) + 6;
        }
        int var3 = 104 / ((20 - arg0) / 56);
        return arg1;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)I")
    public final int method1028(int arg0, int arg1) {
        field2224++;
        if (this.field2219 != null) {
            arg1 = (int) ((long) this.field2221 * (long) arg1 / (long) this.field2223);
        }
        if (arg0 != -32768) {
            this.method1027(117, -122);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I[B)[B")
    public final byte[] method1029(int arg0, byte[] arg1) {
        if (arg0 != 590009680) {
            return null;
        }
        field2218++;
        if (this.field2219 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field2221 / (long) this.field2223) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field2219[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2221 + var6;
                int var14 = var13 / this.field2223;
                var5 += var14;
                var6 = var13 - this.field2223 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
    public static void method1030(byte arg0) {
        field2222 = null;
        int var1 = -70 / ((-arg0 - 56) / 58);
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(II)V")
    public class156(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class351.method2236(arg1, 4700, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field2223 = var4;
            this.field2219 = new int[var4][14];
            this.field2221 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field2219[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
