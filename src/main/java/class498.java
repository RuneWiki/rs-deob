import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class498 {

    @OriginalMember(owner = "client!bia", name = "k", descriptor = "I")
    private int field7158;

    @OriginalMember(owner = "client!bia", name = "m", descriptor = "I")
    private int field7160;

    @OriginalMember(owner = "client!bia", name = "g", descriptor = "[[I")
    private int[][] field7154;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "Lqfa;")
    public static class98 field7148 = new class98(65, 7);

    @OriginalMember(owner = "client!bia", name = "i", descriptor = "[[I")
    public static int[][] field7156 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!bia", name = "l", descriptor = "Lpw;")
    public static class705 field7159 = new class705();

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!bia", name = "c", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!bia", name = "d", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!bia", name = "e", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!bia", name = "f", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!bia", name = "h", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!bia", name = "j", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)V", line = 5)
    public static void method2965(int arg0) {
        field7159 = null;
        if (arg0 == 4) {
            field7156 = null;
            field7148 = null;
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(Z[B)[B", line = 20)
    public final byte[] method2966(boolean arg0, byte[] arg1) {
        field7152++;
        if (this.field7154 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field7160 / (long) this.field7158) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field7154[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field7160 + var6;
                int var14 = var13 / this.field7158;
                var6 = var13 - this.field7158 * var14;
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
        if (!arg0) {
            method2965(111);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(BI)Lvl;", line = 88)
    public static final class13 method2967(byte arg0, int arg1) {
        field7149++;
        class13[] var2 = class172.method1110((byte) 119);
        int var3 = -126 / ((73 - arg0) / 34);
        for (int var4 = 0; var4 < var2.length; var4++) {
            class13 var5 = var2[var4];
            if (var5.field247 == arg1) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(II)I", line = 114)
    public final int method2968(int arg0, int arg1) {
        if (arg1 != 14) {
            return 17;
        }
        if (this.field7154 != null) {
            arg0 = (int) ((long) this.field7160 * (long) arg0 / (long) this.field7158);
        }
        field7151++;
        return arg0;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(I[S)[S", line = 130)
    public final short[] method2969(int arg0, short[] arg1) {
        if (this.field7154 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field7160 / (long) this.field7158) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                short var10 = arg1[var7];
                int[] var11 = this.field7154[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10 >> 2;
                }
                int var13 = this.field7160 + var6;
                int var14 = var13 / this.field7158;
                var6 = var13 - this.field7158 * var14;
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
        field7157++;
        if (arg0 != -1554766238) {
            this.method2968(-114, -125);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "(II)I", line = 205)
    public final int method2970(int arg0, int arg1) {
        if (this.field7154 != null) {
            arg1 = (int) ((long) this.field7160 * (long) arg1 / (long) this.field7158) + 6;
        }
        field7155++;
        if (arg0 != 10) {
            this.field7154 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(II)V", line = 226)
    public class498(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class314.method2026(arg0, -1, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field7158 = var4;
            this.field7160 = var5;
            this.field7154 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field7154[var6];
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
