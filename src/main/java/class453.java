import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class453 {

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    private int field6314;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "[[I")
    private int[][] field6317;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    private int field6315;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "[J")
    public static long[] field6319 = new long[32];

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "([BZ)[B", line = 5)
    public final byte[] method2598(byte[] arg0, boolean arg1) {
        field6320++;
        if (this.field6317 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field6315 / (long) this.field6314) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field6317[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field6315 + var6;
                int var14 = var13 / this.field6314;
                var6 = var13 - this.field6314 * var14;
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
        if (!arg1) {
            field6319 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)V", line = 75)
    public static void method2599(byte arg0) {
        if (arg0 != -111) {
            field6319 = null;
        }
        field6319 = null;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)I", line = 86)
    public final int method2600(int arg0, int arg1) {
        field6318++;
        if (this.field6317 != null) {
            arg1 = (int) ((long) this.field6315 * (long) arg1 / (long) this.field6314) + 6;
        }
        if (arg0 <= 27) {
            this.field6314 = 46;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(II)V", line = 101)
    public class453(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class173.method1186(arg0, arg1, false);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field6314 = var4;
            this.field6317 = new int[var4][14];
            this.field6315 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field6317[var6];
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

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(II)I", line = 163)
    public final int method2601(int arg0, int arg1) {
        if (this.field6317 != null) {
            arg0 = (int) ((long) this.field6315 * (long) arg0 / (long) this.field6314);
        }
        if (arg1 == 7) {
            field6316++;
            return arg0;
        } else {
            return 9;
        }
    }
}
