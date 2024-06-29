import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class161 {

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    private int field2060;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
    private int field2063;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "[[I")
    private int[][] field2056;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I[B)[B")
    public final byte[] method993(int arg0, byte[] arg1) {
        if (arg0 != -22763) {
            this.method993(-72, null);
        }
        if (this.field2056 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field2063 / (long) this.field2060) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field2056[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2063 + var6;
                int var14 = var13 / this.field2060;
                var6 = var13 - this.field2060 * var14;
                var5 += var14;
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
        field2059++;
        return arg1;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)Lwn;")
    public static final class548 method994(byte arg0) {
        field2057++;
        class548 var1 = (class548) class56.field803.method2565((byte) 95);
        if (var1 != null) {
            var1.method3426((byte) -75);
            var1.method3409(-121);
            return var1;
        }
        int var2 = 124 % ((-arg0 - 83) / 34);
        class548 var3;
        do {
            var3 = (class548) class508.field7176.method2565((byte) -37);
            if (var3 == null) {
                return null;
            }
            if (var3.method3126((byte) 14) > class97.method654((byte) 106)) {
                return null;
            }
            var3.method3426((byte) -23);
            var3.method3409(-17);
        } while ((var3.field8700 & Long.MIN_VALUE) == 0L);
        return var3;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZI)I")
    public final int method995(boolean arg0, int arg1) {
        if (this.field2056 != null) {
            arg1 = (int) ((long) this.field2063 * (long) arg1 / (long) this.field2060) + 6;
        }
        field2062++;
        if (arg0) {
            this.field2060 = 91;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "([SI)[S")
    public final short[] method996(short[] arg0, int arg1) {
        field2058++;
        if (arg1 != 22709) {
            return null;
        }
        if (this.field2056 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field2063 / (long) this.field2060) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                short var10 = arg0[var7];
                int[] var11 = this.field2056[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10 >> 2;
                }
                int var13 = this.field2063 + var6;
                int var14 = var13 / this.field2060;
                var6 = var13 - this.field2060 * var14;
                var5 += var14;
            }
            arg0 = new short[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 8192 >> 14;
                if (var9 < -32768) {
                    arg0[var8] = -32768;
                } else if (var9 <= 32767) {
                    arg0[var8] = (short) var9;
                } else {
                    arg0[var8] = 32767;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)I")
    public final int method997(int arg0, int arg1) {
        if (this.field2056 != null) {
            arg1 = (int) ((long) this.field2063 * (long) arg1 / (long) this.field2060);
        }
        field2061++;
        if (arg0 != 0) {
            this.method997(-90, -100);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(II)V")
    public class161(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class691.method3859(arg1, false, arg0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field2060 = var5;
            this.field2063 = var4;
            this.field2056 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field2056[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
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
