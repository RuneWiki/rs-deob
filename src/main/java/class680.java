import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class680 {

    @OriginalMember(owner = "client!pea", name = "k", descriptor = "[[I")
    private int[][] field9259;

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "I")
    private int field9252;

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "I")
    private int field9250;

    @OriginalMember(owner = "client!pea", name = "f", descriptor = "I")
    public static int field9254 = -1;

    @OriginalMember(owner = "client!pea", name = "i", descriptor = "[C")
    public static char[] field9257 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "I")
    public static int field9249;

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "I")
    public static int field9253;

    @OriginalMember(owner = "client!pea", name = "g", descriptor = "I")
    public static int field9255;

    @OriginalMember(owner = "client!pea", name = "h", descriptor = "I")
    public static int field9256;

    @OriginalMember(owner = "client!pea", name = "j", descriptor = "Lbaa;")
    public static class488 field9258;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(BI)I", line = 5)
    public final int method3753(byte arg0, int arg1) {
        field9249++;
        if (this.field9259 != null) {
            arg1 = (int) ((long) this.field9252 * (long) arg1 / (long) this.field9250);
        }
        if (arg0 != -79) {
            method3758(true, 73, 59);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(B[B)[B", line = 22)
    public final byte[] method3754(byte arg0, byte[] arg1) {
        int var3 = -76 % ((arg0 - 46) / 53);
        if (this.field9259 != null) {
            int var4 = (int) ((long) arg1.length * (long) this.field9252 / (long) this.field9250) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.length; var8++) {
                byte var11 = arg1[var8];
                int[] var12 = this.field9259[var7];
                for (int var13 = 0; var13 < 14; var13++) {
                    var5[var6 + var13] += var12[var13] * var11;
                }
                int var14 = this.field9252 + var7;
                int var15 = var14 / this.field9250;
                var6 += var15;
                var7 = var14 - this.field9250 * var15;
            }
            arg1 = new byte[var4];
            for (int var9 = 0; var9 < var4; var9++) {
                int var10 = var5[var9] + 32768 >> 16;
                if (var10 < -128) {
                    arg1[var9] = -128;
                } else if (var10 <= 127) {
                    arg1[var9] = (byte) var10;
                } else {
                    arg1[var9] = 127;
                }
            }
        }
        field9253++;
        return arg1;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V", line = 88)
    public static void method3755(byte arg0) {
        field9258 = null;
        if (arg0 != 116) {
            field9254 = 43;
        }
        field9257 = null;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(II)I", line = 103)
    public final int method3756(int arg0, int arg1) {
        if (arg1 != 6) {
            this.method3754((byte) -121, null);
        }
        if (this.field9259 != null) {
            arg0 = (int) ((long) this.field9252 * (long) arg0 / (long) this.field9250) + 6;
        }
        field9251++;
        return arg0;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(BLjava/lang/String;)I", line = 118)
    public static final int method3757(byte arg0, String arg1) {
        field9256++;
        if (arg0 != 60) {
            method3757((byte) -29, null);
        }
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZII)Lrr;", line = 138)
    public static final class337 method3758(boolean arg0, int arg1, int arg2) {
        field9255++;
        if (!arg0) {
            return null;
        }
        class337 var3 = class442.method2421(arg1, 73);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field4179 == null || var3.field4179.length <= arg2) {
            return null;
        } else {
            return var3.field4179[arg2];
        }
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(II)V", line = 156)
    public class680(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class231.method1398(0, arg0, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field9259 = new int[var5][14];
            this.field9252 = var4;
            this.field9250 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field9259[var6];
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
