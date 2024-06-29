import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class538 {

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    private int field7831;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "[[I")
    private int[][] field7829;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    private int field7833;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Lgfa;")
    public static class696 field7828 = new class696(14, 0, 4, 1);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field7827;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Ljn;")
    public static class668 field7834;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([BZ)[B")
    public final byte[] method3158(byte[] arg0, boolean arg1) {
        if (arg1) {
            this.method3160(31, (byte) 92);
        }
        if (this.field7829 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field7831 / (long) this.field7833) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field7829[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field7831 + var6;
                int var14 = var13 / this.field7833;
                var6 = var13 - this.field7833 * var14;
                var5 += var14;
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
        field7832++;
        return arg0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)I")
    public final int method3159(int arg0, int arg1) {
        if (arg1 != -12655) {
            field7828 = null;
        }
        if (this.field7829 != null) {
            arg0 = (int) ((long) this.field7831 * (long) arg0 / (long) this.field7833) + 6;
        }
        field7830++;
        return arg0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)I")
    public final int method3160(int arg0, byte arg1) {
        if (this.field7829 != null) {
            arg0 = (int) ((long) this.field7831 * (long) arg0 / (long) this.field7833);
        }
        int var3 = 57 % ((arg1 + 15) / 58);
        field7827++;
        return arg0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method3161(int arg0) {
        if (arg0 == 21744) {
            field7834 = null;
            field7828 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(II)V")
    public class538(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class253.method1548(arg1, arg0, (byte) -20);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field7831 = var4;
            this.field7829 = new int[var5][14];
            this.field7833 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field7829[var6];
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
