import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class112 {

    @OriginalMember(owner = "client!np", name = "f", descriptor = "[[I")
    private int[][] field1430;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    private int field1428;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    private int field1429;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "Ldn;")
    public static class276 field1431 = new class276();

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)I", line = 4)
    public final int method661(byte arg0, int arg1) {
        if (arg0 > -87) {
            return -124;
        }
        if (this.field1430 != null) {
            arg1 = (int) ((long) this.field1428 * (long) arg1 / (long) this.field1429) + 6;
        }
        field1425++;
        return arg1;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V", line = 25)
    public static void method662(byte arg0) {
        int var1 = -127 / ((28 - arg0) / 52);
        field1431 = null;
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(II)V", line = 34)
    public class112(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class210.method1331(arg0, 112, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field1430 = new int[var4][14];
            this.field1428 = var5;
            this.field1429 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field1430[var6];
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

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(BI)I", line = 99)
    public final int method663(byte arg0, int arg1) {
        if (this.field1430 != null) {
            arg1 = (int) ((long) this.field1428 * (long) arg1 / (long) this.field1429);
        }
        if (arg0 == 58) {
            field1427++;
            return arg1;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "([BB)[B", line = 114)
    public final byte[] method664(byte[] arg0, byte arg1) {
        if (this.field1430 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field1428 / (long) this.field1429) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field1430[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1428 + var6;
                int var14 = var13 / this.field1429;
                var5 += var14;
                var6 = var13 - this.field1429 * var14;
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
        if (arg1 < 103) {
            method662((byte) -23);
        }
        field1432++;
        return arg0;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)Lsfa;", line = 181)
    public static final class289 method665(int arg0) {
        if (arg0 >= -94) {
            return null;
        } else {
            field1426++;
            return class672.field9548;
        }
    }
}
