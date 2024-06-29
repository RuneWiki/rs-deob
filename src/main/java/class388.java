import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class388 {

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    private int field5643;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "[[I")
    private int[][] field5644;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    private int field5638;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "Ljj;")
    public static class129 field5640 = new class129();

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "Ljava/awt/Frame;")
    public static Frame field5642;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "([SI)[S", line = 8)
    public final short[] method2455(short[] arg0, int arg1) {
        if (arg1 != 992) {
            this.field5644 = null;
        }
        if (this.field5644 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field5638 / (long) this.field5643) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                short var10 = arg0[var7];
                int[] var11 = this.field5644[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10 >> 2;
                }
                int var13 = this.field5638 + var6;
                int var14 = var13 / this.field5643;
                var5 += var14;
                var6 = var13 - this.field5643 * var14;
            }
            arg0 = new short[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 8192 >> 14;
                if (var9 < -32768) {
                    arg0[var8] = -32768;
                } else if (var9 > 32767) {
                    arg0[var8] = 32767;
                } else {
                    arg0[var8] = (short) var9;
                }
            }
        }
        field5646++;
        return arg0;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIZIII)V", line = 76)
    public static final void method2456(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field5639++;
        long var6 = (long) ((arg2 ? Integer.MIN_VALUE : 0) | arg3);
        int var8 = 125 / ((-arg1 - 56) / 44);
        class166 var9 = (class166) class533.field7257.method3953(var6, 14);
        if (var9 == null) {
            var9 = new class166();
            class533.field7257.method3962(var6, var9, -108);
        }
        if (arg0 >= var9.field2240.length) {
            int[] var10 = new int[arg0 + 1];
            int[] var11 = new int[arg0 + 1];
            for (int var12 = 0; var12 < var9.field2240.length; var12++) {
                var10[var12] = var9.field2240[var12];
                var11[var12] = var9.field2237[var12];
            }
            for (int var13 = var9.field2240.length; var13 < arg0; var13++) {
                var10[var13] = -1;
                var11[var13] = 0;
            }
            var9.field2237 = var11;
            var9.field2240 = var10;
        }
        var9.field2240[arg0] = arg4;
        var9.field2237[arg0] = arg5;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IB)I", line = 129)
    public final int method2457(int arg0, byte arg1) {
        if (arg1 <= 46) {
            this.method2458(null, -90);
        }
        field5641++;
        if (this.field5644 != null) {
            arg0 = (int) ((long) this.field5638 * (long) arg0 / (long) this.field5643);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "([BI)[B", line = 144)
    public final byte[] method2458(byte[] arg0, int arg1) {
        if (arg1 >= -75) {
            return null;
        }
        if (this.field5644 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field5638 / (long) this.field5643) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field5644[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field5638 + var6;
                int var14 = var13 / this.field5643;
                var6 = var13 - this.field5643 * var14;
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
        field5637++;
        return arg0;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BI)I", line = 215)
    public final int method2459(byte arg0, int arg1) {
        if (this.field5644 != null) {
            arg1 = (int) ((long) this.field5638 * (long) arg1 / (long) this.field5643) + 6;
        }
        if (arg0 > -67) {
            this.method2455(null, -8);
        }
        field5645++;
        return arg1;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V", line = 229)
    public static void method2460(boolean arg0) {
        field5642 = null;
        if (!arg0) {
            field5640 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(II)V", line = 244)
    public class388(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class32.method234(arg1, (byte) 41, arg0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field5643 = var5;
            this.field5644 = new int[var5][14];
            this.field5638 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field5644[var6];
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
