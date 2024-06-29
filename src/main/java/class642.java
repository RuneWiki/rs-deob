import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class642 {

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "[[I")
    private int[][] field9039;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    private int field9040;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    private int field9046;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field9041 = 0;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field9043 = -1;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "[Lwa;")
    public static class662[] field9042 = new class662[14];

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field9044 = 0;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field9036;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field9045;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field9047;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field9048;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Lpl;")
    public static class612 field9038;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "[Lhv;")
    public static class199[] field9049;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
    public static final void method3586(String arg0, String arg1, int arg2, int arg3) {
        int var4 = 36 / ((7 - arg2) / 57);
        field9047++;
        class126.field1583 = 2;
        class304.field3746 = arg3;
        class174.method1097(false, arg0, -119, arg1);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
    public final int method3587(int arg0, int arg1) {
        if (this.field9039 != null) {
            arg0 = (int) ((long) this.field9046 * (long) arg0 / (long) this.field9040);
        }
        field9048++;
        if (arg1 > -34) {
            this.method3590(false, null);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method3588(int arg0) {
        if (arg0 <= 96) {
            field9049 = null;
        }
        field9042 = null;
        field9049 = null;
        field9038 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)I")
    public final int method3589(byte arg0, int arg1) {
        if (arg0 >= -94) {
            field9036 = -2;
        }
        field9037++;
        if (this.field9039 != null) {
            arg1 = (int) ((long) this.field9046 * (long) arg1 / (long) this.field9040) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(II)V")
    public class642(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class498.method2687(arg0, arg1, 126);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field9039 = new int[var4][14];
            this.field9040 = var4;
            this.field9046 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field9039[var6];
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

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z[B)[B")
    public final byte[] method3590(boolean arg0, byte[] arg1) {
        if (arg0) {
            return null;
        }
        field9045++;
        if (this.field9039 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field9046 / (long) this.field9040) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field9039[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field9046 + var6;
                int var14 = var13 / this.field9040;
                var6 = var13 - this.field9040 * var14;
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
        return arg1;
    }
}
