import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class678 {

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "[[I")
    private int[][] field9531;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    private int field9536;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    private int field9532;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field9530;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field9533;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field9534;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field9537;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "[Lob;")
    public static class686[] field9535;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z[B)[B", line = 3)
    public final byte[] method3870(boolean arg0, byte[] arg1) {
        if (this.field9531 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field9536 / (long) this.field9532) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field9531[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field9536 + var6;
                int var14 = var13 / this.field9532;
                var5 += var14;
                var6 = var13 - this.field9532 * var14;
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
        if (arg0) {
            return null;
        } else {
            field9530++;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BI)I", line = 72)
    public final int method3871(byte arg0, int arg1) {
        if (arg0 >= -29) {
            this.field9531 = null;
        }
        if (this.field9531 != null) {
            arg1 = ((int) ((long) this.field9536 * (long) arg1 / (long) this.field9532)) + 6;
        }
        field9534++;
        return arg1;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 88)
    public static void method3872(int arg0) {
        field9535 = null;
        int var1 = -33 / ((arg0 + 9) / 47);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)I", line = 99)
    public final int method3873(int arg0, int arg1) {
        field9537++;
        if (this.field9531 != null) {
            arg0 = (int) ((long) this.field9536 * (long) arg0 / (long) this.field9532);
        }
        if (arg1 != 14) {
            field9535 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)Z", line = 115)
    public static final boolean method3874(int arg0, int arg1, int arg2) {
        field9533++;
        if (arg0 != 1) {
            field9535 = null;
        }
        return class638.method3709(arg1, arg2, 115) & class496.method3019((byte) 21, arg2, arg1);
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(II)V", line = 129)
    public class678(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class210.method1598(arg1, arg0, 31347);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field9531 = new int[var4][14];
            this.field9536 = var5;
            this.field9532 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field9531[var6];
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
}
