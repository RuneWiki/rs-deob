import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class445 {

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    private int field6122;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "[[I")
    private int[][] field6124;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    private int field6120;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "Lvi;")
    public static class560 field6125 = new class560(260);

    @OriginalMember(owner = "client!au", name = "a", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)I", line = 10)
    public final int method2554(int arg0, int arg1) {
        if (this.field6124 != null) {
            arg1 = (int) ((long) this.field6120 * (long) arg1 / (long) this.field6122);
        }
        field6123++;
        if (arg0 < 100) {
            this.field6124 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(II)V", line = 24)
    public class445(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class9.method58(arg0, (byte) -108, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field6122 = var4;
            this.field6124 = new int[var4][14];
            this.field6120 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field6124[var6];
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

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(BFFF)I", line = 85)
    public static final int method2555(byte arg0, float arg1, float arg2, float arg3) {
        field6121++;
        if (arg0 != -32) {
            return 34;
        }
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        float var6 = (arg3 < 0.0F) ? -arg3 : arg3;
        if (var4 < var5 && var5 > var6) {
            return arg2 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var6 > var5) {
            return (arg3 > 0.0F) ? 2 : 3;
        } else if (arg1 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 129)
    public static final void method2556(int arg0, int arg1, int arg2, Class arg3) {
        class651 var4 = class145.field1841[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class82 var5 = var4.field9228; var5 != null; var5 = var5.field1024) {
            class293 var6 = var5.field1027;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field3921 == arg1 && var6.field3920 == arg2) {
                class559.method3126(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V", line = 157)
    public static void method2557(int arg0) {
        field6125 = null;
        if (arg0 <= 89) {
            method2557(-97);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I[B)[B", line = 170)
    public final byte[] method2558(int arg0, byte[] arg1) {
        field6126++;
        if (this.field6124 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field6120 / (long) this.field6122) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field6124[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field6120 + var6;
                int var14 = var13 / this.field6122;
                var6 = var13 - this.field6122 * var14;
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
        int var15 = 16 / ((arg0 - 45) / 48);
        return arg1;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(II)I", line = 236)
    public final int method2559(int arg0, int arg1) {
        if (this.field6124 != null) {
            arg0 = (int) ((long) this.field6120 * (long) arg0 / (long) this.field6122) + 6;
        }
        field6119++;
        if (arg1 != -23441) {
            this.field6122 = -98;
        }
        return arg0;
    }
}
