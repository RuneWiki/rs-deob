import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class371 {

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "[[I")
    private int[][] field5209;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    private int field5208;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
    private int field5213;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "[I")
    public static int[] field5210 = new int[5];

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public static int field5212 = 0;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)Lcl;", line = 7)
    public static final class173 method2146(int arg0, int arg1) {
        if (arg1 != -15) {
            method2146(15, -111);
        }
        field5211++;
        class173 var2 = (class173) class411.field6022.method1321((long) arg0, 76);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class348.field4773.method1411(true, 0, arg0);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class173 var4 = class201.method1235(arg1 ^ 0xFFFFFFEC, var3);
            class411.field6022.method1324((long) arg0, arg1 ^ 0x38, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 36)
    public static void method2147(int arg0) {
        if (arg0 > -97) {
            field5212 = 103;
        }
        field5210 = null;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(II)I", line = 46)
    public final int method2148(int arg0, int arg1) {
        if (this.field5209 != null) {
            arg0 = (int) ((long) this.field5208 * (long) arg0 / (long) this.field5213) + 6;
        }
        if (arg1 >= -21) {
            this.method2148(-63, -101);
        }
        field5214++;
        return arg0;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I[B)[B", line = 60)
    public final byte[] method2149(int arg0, byte[] arg1) {
        field5206++;
        if (this.field5209 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field5208 / (long) this.field5213) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field5209[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field5208 + var6;
                int var14 = var13 / this.field5213;
                var5 += var14;
                var6 = var13 - this.field5213 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        return arg0 == -128 ? arg1 : null;
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(II)I", line = 131)
    public final int method2150(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method2150(85, 109);
        }
        if (this.field5209 != null) {
            arg1 = (int) ((long) this.field5208 * (long) arg1 / (long) this.field5213);
        }
        field5207++;
        return arg1;
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(II)V", line = 147)
    public class371(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class340.method1892(arg0, (byte) 110, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field5209 = new int[var4][14];
            this.field5208 = var5;
            this.field5213 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field5209[var6];
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
