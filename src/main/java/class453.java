import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class453 {

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    private int field6543;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "[[I")
    private int[][] field6537;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    private int field6535;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "[I")
    public static int[] field6539 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!av", name = "d", descriptor = "S")
    public static short field6538 = 32767;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "[I")
    public static int[] field6542 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)I")
    public final int method2699(int arg0, int arg1) {
        field6540++;
        if (arg1 == 8) {
            if (this.field6537 != null) {
                arg0 = (int) ((long) this.field6543 * (long) arg0 / (long) this.field6535);
            }
            return arg0;
        } else {
            return -100;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
    public static void method2700(int arg0) {
        if (arg0 >= -4) {
            method2700(-1);
        }
        field6539 = null;
        field6542 = null;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IB)I")
    public final int method2701(int arg0, byte arg1) {
        if (arg1 > -4) {
            method2703(-51, (byte) -1, 40, -47);
        }
        field6544++;
        if (this.field6537 != null) {
            arg0 = (int) ((long) this.field6543 * (long) arg0 / (long) this.field6535) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B[B)[B")
    public final byte[] method2702(byte arg0, byte[] arg1) {
        if (arg0 != 127) {
            field6538 = -114;
        }
        field6536++;
        if (this.field6537 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field6543 / (long) this.field6535) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field6537[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field6543 + var6;
                int var14 = var13 / this.field6535;
                var5 += var14;
                var6 = var13 - this.field6535 * var14;
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

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IBII)I")
    public static final int method2703(int arg0, byte arg1, int arg2, int arg3) {
        field6541++;
        if ((class379.field4998[arg3][arg2][arg0] & 0x8) != 0) {
            return 0;
        } else if (arg1 == -4) {
            return arg3 <= 0 || (class379.field4998[1][arg2][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return -20;
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(II)V")
    public class453(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class482.method2937(arg0, false, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field6543 = var4;
            this.field6537 = new int[var5][14];
            this.field6535 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field6537[var6];
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
