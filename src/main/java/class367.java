import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class367 {

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    private int field5237;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    private int field5239;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "[[I")
    private int[][] field5244;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Z")
    public static boolean field5240 = false;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Llt;")
    public static class486 field5242 = new class486(0, 0);

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "[Ltp;")
    public static class378[] field5245 = new class378[1024];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "[I")
    public static int[] field5235;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)Z")
    public static final boolean method2163(byte arg0, int arg1) {
        int var2 = -123 / ((30 - arg0) / 43);
        field5234++;
        return arg1 >= 12 && arg1 <= 17;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)I")
    public final int method2164(int arg0, int arg1) {
        if (this.field5244 != null) {
            arg0 = ((int) ((long) this.field5237 * (long) arg0 / (long) this.field5239)) + 6;
        }
        field5236++;
        if (arg1 != -22069) {
            field5235 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([BI)[B")
    public final byte[] method2165(byte[] arg0, int arg1) {
        if (this.field5244 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field5237 / (long) this.field5239) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field5244[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field5237 + var6;
                int var14 = var13 / this.field5239;
                var6 = var13 - this.field5239 * var14;
                var5 += var14;
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
        if (arg1 != -128) {
            this.method2164(-111, -115);
        }
        field5243++;
        return arg0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method2166(int arg0) {
        if (arg0 != 65536) {
            field5240 = true;
        }
        field5235 = null;
        field5245 = null;
        field5242 = null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)I")
    public final int method2167(int arg0, int arg1) {
        if (this.field5244 != null) {
            arg1 = (int) ((long) this.field5237 * (long) arg1 / (long) this.field5239);
        }
        field5238++;
        return arg0 == -128 ? arg1 : 98;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(II)V")
    public class367(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class528.method3113((byte) 116, arg1, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field5237 = var5;
            this.field5239 = var4;
            this.field5244 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field5244[var6];
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
}
