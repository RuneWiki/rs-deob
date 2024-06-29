import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class298 {

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    private int field4242;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    private int field4238;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "[[I")
    private int[][] field4243;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field4234 = 0;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "[J")
    public static long[] field4239 = new long[32];

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Ljn;")
    public static class720 field4236;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Ljava/lang/Object;")
    public static Object field4244;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([SI)[S")
    public final short[] method1833(short[] arg0, int arg1) {
        if (this.field4243 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field4238 / (long) this.field4242) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                short var10 = arg0[var7];
                int[] var11 = this.field4243[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10 >> 2;
                }
                int var13 = this.field4238 + var6;
                int var14 = var13 / this.field4242;
                var5 += var14;
                var6 = var13 - this.field4242 * var14;
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
        field4240++;
        int var15 = 47 % ((arg1 + 44) / 61);
        return arg0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)I")
    public final int method1834(byte arg0, int arg1) {
        field4241++;
        if (arg0 != 91) {
            this.method1836(null, 69);
        }
        if (this.field4243 != null) {
            arg1 = (int) ((long) this.field4238 * (long) arg1 / (long) this.field4242);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)I")
    public final int method1835(int arg0, int arg1) {
        field4235++;
        if (arg1 != 6909) {
            this.field4243 = null;
        }
        if (this.field4243 != null) {
            arg0 = (int) ((long) this.field4238 * (long) arg0 / (long) this.field4242) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([BI)[B")
    public final byte[] method1836(byte[] arg0, int arg1) {
        int var3 = 6 % ((63 - arg1) / 60);
        if (this.field4243 != null) {
            int var4 = (int) ((long) arg0.length * (long) this.field4238 / (long) this.field4242) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.length; var8++) {
                byte var11 = arg0[var8];
                int[] var12 = this.field4243[var7];
                for (int var13 = 0; var13 < 14; var13++) {
                    var5[var6 + var13] += var12[var13] * var11;
                }
                int var14 = this.field4238 + var7;
                int var15 = var14 / this.field4242;
                var6 += var15;
                var7 = var14 - this.field4242 * var15;
            }
            arg0 = new byte[var4];
            for (int var9 = 0; var9 < var4; var9++) {
                int var10 = var5[var9] + 32768 >> 16;
                if (var10 < -128) {
                    arg0[var9] = -128;
                } else if (var10 <= 127) {
                    arg0[var9] = (byte) var10;
                } else {
                    arg0[var9] = 127;
                }
            }
        }
        field4237++;
        return arg0;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(II)V")
    public class298(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class635.method3485(27908, arg0, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field4242 = var4;
            this.field4238 = var5;
            this.field4243 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field4243[var6];
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
                while (var10 < var11) {
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

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static void method1837(byte arg0) {
        if (arg0 > -84) {
            field4244 = null;
        }
        field4236 = null;
        field4239 = null;
        field4244 = null;
    }
}
