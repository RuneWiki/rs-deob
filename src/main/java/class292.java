import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class292 {

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
    private int field4276;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "[[I")
    private int[][] field4275;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
    private int field4278;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z[B)[B", line = 3)
    public final byte[] method1849(boolean arg0, byte[] arg1) {
        field4277++;
        if (arg0) {
            return null;
        }
        if (this.field4275 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field4278 / (long) this.field4276) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field4275[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field4278 + var6;
                int var14 = var13 / this.field4276;
                var6 = var13 - this.field4276 * var14;
                var5 += var14;
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
        return arg1;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(III)Z", line = 70)
    public static final boolean method1850(int arg0, int arg1, int arg2) {
        field4273++;
        if (arg0 < 82) {
            return true;
        } else {
            return class419.method2477(arg2, arg1, (byte) -72) || class161.method1229(arg2, arg1, -1);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BI)I", line = 83)
    public final int method1851(byte arg0, int arg1) {
        if (arg0 < 18) {
            this.field4276 = 122;
        }
        if (this.field4275 != null) {
            arg1 = (int) ((long) this.field4278 * (long) arg1 / (long) this.field4276);
        }
        field4271++;
        return arg1;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I[S)[S", line = 100)
    public final short[] method1852(int arg0, short[] arg1) {
        field4272++;
        if (this.field4275 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field4278 / (long) this.field4276) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                short var10 = arg1[var7];
                int[] var11 = this.field4275[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10 >> 2;
                }
                int var13 = this.field4278 + var6;
                int var14 = var13 / this.field4276;
                var6 = var13 - this.field4276 * var14;
                var5 += var14;
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
        int var15 = 51 % ((76 - arg0) / 39);
        return arg1;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)I", line = 168)
    public final int method1853(int arg0, int arg1) {
        field4274++;
        if (arg0 == 6) {
            if (this.field4275 != null) {
                arg1 = ((int) ((long) this.field4278 * (long) arg1 / (long) this.field4276)) + 6;
            }
            return arg1;
        } else {
            return -47;
        }
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(II)V", line = 185)
    public class292(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class527.method3083(-1, arg1, arg0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field4276 = var5;
            this.field4275 = new int[var5][14];
            this.field4278 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field4275[var6];
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
