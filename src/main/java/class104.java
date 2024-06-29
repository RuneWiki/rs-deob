import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class104 {

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    private int field1317;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "[[I")
    private int[][] field1313;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    private int field1312;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "[I")
    public static int[] field1310 = new int[14];

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([BZ)[B")
    public final byte[] method600(byte[] arg0, boolean arg1) {
        if (!arg1) {
            this.method600(null, false);
        }
        if (this.field1313 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field1312 / (long) this.field1317) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field1313[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1312 + var6;
                int var14 = var13 / this.field1317;
                var5 += var14;
                var6 = var13 - this.field1317 * var14;
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
        field1314++;
        return arg0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZ)I")
    public final int method601(int arg0, boolean arg1) {
        if (!arg1) {
            this.method600(null, true);
        }
        field1316++;
        if (this.field1313 != null) {
            arg0 = (int) ((long) this.field1312 * (long) arg0 / (long) this.field1317);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)I")
    public final int method602(int arg0, byte arg1) {
        if (this.field1313 != null) {
            arg0 = ((int) ((long) this.field1312 * (long) arg0 / (long) this.field1317)) + 6;
        }
        if (arg1 <= 16) {
            this.field1312 = 28;
        }
        field1315++;
        return arg0;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(II)V")
    public class104(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class647.method3733(-120, arg0, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field1317 = var4;
            this.field1313 = new int[var4][14];
            this.field1312 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field1313[var6];
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

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    public static void method603(int arg0) {
        field1310 = null;
        if (arg0 < 95) {
            method603(-30);
        }
    }
}
