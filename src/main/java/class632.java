import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class632 {

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "[[I")
    private int[][] field8014;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    private int field8016;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    private int field8020;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Luw;")
    public static class208 field8018 = new class208(114, 6);

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field8015;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field8017;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field8019;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field8021;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field8022;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 12)
    public static final void method3371(int arg0) {
        field8019++;
        for (class403 var1 = (class403) class253.field3440.method3855(0); var1 != null; var1 = (class403) class253.field3440.method3861(true)) {
            if (var1.field5360 > 1) {
                var1.field5360 = 0;
                class655.field8449.method2918(((class765) var1.field5365.field9453.field2279).field10409, var1, 112);
                var1.field5365.method3860((byte) -120);
            }
        }
        class486.field6268 = 0;
        class628.field7982 = arg0;
        class595.field7563.method3594(arg0 ^ 0xFFFFFF97);
        class517.field6586.method2617(arg0 + 28812);
        class253.field3440.method3860((byte) 4);
        class264.method1673(8212, class579.field7335);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V", line = 40)
    public static void method3372(byte arg0) {
        field8018 = null;
        if (arg0 >= -117) {
            method3372((byte) 49);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[S)[S", line = 53)
    public final short[] method3373(int arg0, short[] arg1) {
        if (arg0 != -7574) {
            field8018 = null;
        }
        if (this.field8014 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field8016 / (long) this.field8020) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                short var10 = arg1[var7];
                int[] var11 = this.field8014[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10 >> 2;
                }
                int var13 = this.field8016 + var6;
                int var14 = var13 / this.field8020;
                var5 += var14;
                var6 = var13 - this.field8020 * var14;
            }
            arg1 = new short[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 8192 >> 14;
                if (var9 < -32768) {
                    arg1[var8] = -32768;
                } else if (var9 > 32767) {
                    arg1[var8] = 32767;
                } else {
                    arg1[var8] = (short) var9;
                }
            }
        }
        field8021++;
        return arg1;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I", line = 120)
    public final int method3374(int arg0, int arg1) {
        int var3 = 121 / ((-arg0 - 66) / 39);
        field8022++;
        if (this.field8014 != null) {
            arg1 = (int) ((long) this.field8016 * (long) arg1 / (long) this.field8020) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(II)V", line = 133)
    public class632(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class752.method4078(arg1, 4, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field8014 = new int[var4][14];
            this.field8016 = var5;
            this.field8020 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field8014[var6];
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

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)I", line = 194)
    public final int method3375(byte arg0, int arg1) {
        int var3 = 18 % ((arg0 - 61) / 54);
        field8017++;
        if (this.field8014 != null) {
            arg1 = (int) ((long) this.field8016 * (long) arg1 / (long) this.field8020);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([BB)[B", line = 207)
    public final byte[] method3376(byte[] arg0, byte arg1) {
        if (this.field8014 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field8016 / (long) this.field8020) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field8014[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field8016 + var6;
                int var14 = var13 / this.field8020;
                var5 += var14;
                var6 = var13 - this.field8020 * var14;
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
        field8015++;
        int var15 = 75 / ((-arg1 - 38) / 32);
        return arg0;
    }
}
