import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class193 {

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
    private int field2297;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "[[I")
    private int[][] field2303;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
    private int field2302;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "Lbt;")
    public static class48 field2301;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZI)I")
    public final int method1259(boolean arg0, int arg1) {
        if (arg0) {
            this.method1262(null, (byte) -118);
        }
        field2298++;
        if (this.field2303 != null) {
            arg1 = (int) ((long) this.field2297 * (long) arg1 / (long) this.field2302) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
    public static void method1260(int arg0) {
        field2301 = null;
        if (arg0 != 12764) {
            method1260(20);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)I")
    public final int method1261(int arg0, int arg1) {
        if (arg0 != -15630) {
            this.field2302 = 50;
        }
        if (this.field2303 != null) {
            arg1 = (int) ((long) this.field2297 * (long) arg1 / (long) this.field2302);
        }
        field2300++;
        return arg1;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "([SB)[S")
    public final short[] method1262(short[] arg0, byte arg1) {
        int var3 = 94 % ((arg1 - 15) / 32);
        if (this.field2303 != null) {
            int var4 = (int) ((long) arg0.length * (long) this.field2297 / (long) this.field2302) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.length; var8++) {
                short var11 = arg0[var8];
                int[] var12 = this.field2303[var7];
                for (int var13 = 0; var13 < 14; var13++) {
                    var5[var6 + var13] += var12[var13] * var11 >> 2;
                }
                int var14 = this.field2297 + var7;
                int var15 = var14 / this.field2302;
                var6 += var15;
                var7 = var14 - this.field2302 * var15;
            }
            arg0 = new short[var4];
            for (int var9 = 0; var9 < var4; var9++) {
                int var10 = var5[var9] + 8192 >> 14;
                if (var10 < -32768) {
                    arg0[var9] = -32768;
                } else if (var10 > 32767) {
                    arg0[var9] = 32767;
                } else {
                    arg0[var9] = (short) var10;
                }
            }
        }
        field2304++;
        return arg0;
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(II)V")
    public class193(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class788.method4359(arg1, (byte) 70, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field2297 = var5;
            this.field2303 = new int[var4][14];
            this.field2302 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field2303[var6];
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

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I[B)[B")
    public final byte[] method1263(int arg0, byte[] arg1) {
        field2299++;
        if (this.field2303 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field2297 / (long) this.field2302) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field2303[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2297 + var6;
                int var14 = var13 / this.field2302;
                var6 = var13 - this.field2302 * var14;
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
        if (arg0 != 5871) {
            field2301 = null;
        }
        return arg1;
    }
}
