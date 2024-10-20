package deob;

@ObfuscatedName("dc")
public class class117 {

    @ObfuscatedName("dc.v")
    public int field1698;

    @ObfuscatedName("dc.b")
    public int field1701;

    @ObfuscatedName("dc.y")
    public int[][] field1702;

    public class117(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class178.method3921(arg0, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field1698 = var4;
            this.field1701 = var5;
            this.field1702 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field1702[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 - 7.0D + 1.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (0.54D + 0.46D * Math.cos(((double) var10 - var8) * 0.2243994752564138D));
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @ObfuscatedName("dc.i([BI)[B")
    public byte[] method1924(byte[] arg0) {
        if (this.field1702 != null) {
            int var2 = (int) ((long) this.field1701 * (long) arg0.length / (long) this.field1698) + 14;
            int[] var3 = new int[var2];
            int var4 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.length; var6++) {
                byte var7 = arg0[var6];
                int[] var8 = this.field1702[var5];
                for (int var9 = 0; var9 < 14; var9++) {
                    var3[var4 + var9] += var8[var9] * var7;
                }
                int var10 = this.field1701 + var5;
                int var11 = var10 / this.field1698;
                var4 += var11;
                var5 = var10 - this.field1698 * var11;
            }
            arg0 = new byte[var2];
            for (int var12 = 0; var12 < var2; var12++) {
                int var13 = var3[var12] + 32768 >> 16;
                if (var13 < -128) {
                    arg0[var12] = -128;
                } else if (var13 > 127) {
                    arg0[var12] = 127;
                } else {
                    arg0[var12] = (byte) var13;
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("dc.c(II)I")
    public int method1923(int arg0) {
        if (this.field1702 != null) {
            arg0 = (int) ((long) this.field1701 * (long) arg0 / (long) this.field1698);
        }
        return arg0;
    }

    @ObfuscatedName("dc.e(IS)I")
    public int method1926(int arg0) {
        if (this.field1702 != null) {
            arg0 = (int) ((long) this.field1701 * (long) arg0 / (long) this.field1698) + 6;
        }
        return arg0;
    }
}
