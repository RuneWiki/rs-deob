import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class125 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    private int field1876;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "[[I")
    private int[][] field1879;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    private int field1885;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lub;")
    public static class92 field1878;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "[I")
    public static int[] field1877;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([BI)[B")
    public final byte[] method936(byte[] arg0, int arg1) {
        field1880++;
        if (this.field1879 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field1876 / (long) this.field1885) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field1879[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1876 + var6;
                int var14 = var13 / this.field1885;
                var5 += var14;
                var6 = var13 - this.field1885 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        return arg1 == 0 ? arg0 : null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIBIIIIIII)V")
    public static final void method937(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1886++;
        class221 var10 = null;
        for (class221 var11 = (class221) class262.field4152.method6(arg2 ^ 0xC); var11 != null; var11 = (class221) class262.field4152.method11((byte) 55)) {
            if (var11.field3374 == arg4 && var11.field3376 == arg0 && var11.field3372 == arg3 && var11.field3375 == arg9) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class221();
            var10.field3375 = arg9;
            var10.field3372 = arg3;
            var10.field3374 = arg4;
            var10.field3376 = arg0;
            class281.method1901(var10, false);
            class262.field4152.method12(var10, 12);
        }
        var10.field3380 = arg5;
        if (arg2 == -128) {
            var10.field3378 = arg8;
            var10.field3385 = arg7;
            var10.field3371 = arg6;
            var10.field3370 = arg1;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)I")
    public final int method938(boolean arg0, int arg1) {
        field1882++;
        if (this.field1879 != null) {
            arg1 = (int) ((long) this.field1876 * (long) arg1 / (long) this.field1885);
        }
        return arg0 ? 58 : arg1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static void method939(int arg0) {
        field1877 = null;
        field1878 = null;
        if (arg0 < 4) {
            method937(62, -61, (byte) 84, -61, 61, 105, 15, 39, -15, 11);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)I")
    public final int method940(int arg0, byte arg1) {
        field1884++;
        if (this.field1879 != null) {
            arg0 = (int) ((long) this.field1876 * (long) arg0 / (long) this.field1885) + 6;
        }
        if (arg1 <= 15) {
            method937(-53, 91, (byte) -16, 69, 83, 127, 111, -51, -58, -101);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lub;IB)Lig;")
    public static final class9 method941(class92 arg0, int arg1, byte arg2) {
        int var3 = 64 % ((arg2 - 28) / 36);
        field1883++;
        return client.method1155(arg1, 9, arg0) ? class181.method1292(1) : null;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(II)V")
    public class125(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class130.method968((byte) 72, arg1, arg0);
            int var4 = arg1 / var3;
            this.field1876 = var4;
            int var5 = arg0 / var3;
            this.field1879 = new int[var5][14];
            this.field1885 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1879[var6];
                double var8 = (double) var4 / (double) var5;
                double var10 = (double) var6 / (double) var5 + 6.0D;
                int var12 = (int) Math.floor(var10 + 1.0D - 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                int var13 = (int) Math.ceil(var10 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var12) {
                    double var14 = ((double) var12 - var10) * 3.141592653589793D;
                    double var16 = var8;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var8 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var10) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }
}
