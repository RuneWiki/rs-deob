import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class161 {

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "[[I")
    private int[][] field2246;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    private int field2242;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    private int field2247;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field2251 = 0;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2243 = new String[100];

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "[I")
    public static int[] field2253 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field2250 = -1;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "[[B")
    public static byte[][] field2254;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([BB)[B")
    public final byte[] method998(byte[] arg0, byte arg1) {
        field2248++;
        int var3 = 90 % ((-arg1 - 26) / 63);
        if (this.field2246 != null) {
            int var4 = (int) ((long) arg0.length * (long) this.field2247 / (long) this.field2242) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.length; var8++) {
                byte var11 = arg0[var8];
                int[] var12 = this.field2246[var6];
                for (int var13 = 0; var13 < 14; var13++) {
                    var5[var7 + var13] += var12[var13] * var11;
                }
                int var14 = this.field2247 + var6;
                int var15 = var14 / this.field2242;
                var6 = var14 - this.field2242 * var15;
                var7 += var15;
            }
            arg0 = new byte[var4];
            for (int var9 = 0; var9 < var4; var9++) {
                int var10 = var5[var9] + 32768 >> 16;
                if (var10 < -128) {
                    arg0[var9] = -128;
                } else if (var10 > 127) {
                    arg0[var9] = 127;
                } else {
                    arg0[var9] = (byte) var10;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method999(int arg0) {
        field2254 = null;
        field2243 = null;
        if (arg0 < -28) {
            field2253 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
    public final int method1000(int arg0, int arg1) {
        field2245++;
        if (this.field2246 != null) {
            arg0 = (int) ((long) this.field2247 * (long) arg0 / (long) this.field2242);
        }
        if (arg1 != -11694) {
            this.field2246 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)I")
    public final int method1001(int arg0, byte arg1) {
        if (arg1 > -5) {
            return -62;
        }
        if (this.field2246 != null) {
            arg0 = (int) ((long) this.field2247 * (long) arg0 / (long) this.field2242) + 6;
        }
        field2252++;
        return arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILnh;)V")
    public static final void method1002(int arg0, class305 arg1) {
        class195.field2993 = arg1.method2081(-127, "runes");
        int var2 = -40 / ((86 - arg0) / 33);
        field2249++;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(II)V")
    public class161(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class279.method1812(0, arg0, arg1);
            int var4 = arg0 / var3;
            this.field2246 = new int[var4][14];
            this.field2242 = var4;
            int var5 = arg1 / var3;
            this.field2247 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field2246[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                double var10 = (double) var5 / (double) var4;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var12) {
                    double var14 = ((double) var12 - var8) * 3.141592653589793D;
                    double var16 = var10;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)I")
    public static int method1003(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
