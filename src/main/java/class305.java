import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class305 {

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    private int field5177;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    private int field5178;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "[[I")
    private int[][] field5170;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "[J")
    public static long[] field5166 = new long[100];

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Ltl;")
    public static class59 field5176 = class85.method639(" steht bereits auf Ihrer Freunde)2Liste(Q", 9588);

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lgb;")
    public static class212 field5179 = new class212(5);

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Lma;")
    public static class263 field5180;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIBIIII)V", line = 5)
    public static final void method2112(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 < 41) {
            field5179 = (class212) null;
        }
        class286 var10 = null;
        field5169++;
        for (class286 var11 = (class286) class173.field2839.method536(2); var11 != null; var11 = (class286) class173.field2839.method533(24)) {
            if (var11.field4913 == arg2 && var11.field4921 == arg4 && var11.field4910 == arg0 && var11.field4926 == arg6) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class286();
            var10.field4910 = arg0;
            var10.field4921 = arg4;
            var10.field4926 = arg6;
            var10.field4913 = arg2;
            class30.method205(var10, 0);
            class173.field2839.method532(70, var10);
        }
        var10.field4928 = arg7;
        var10.field4925 = arg3;
        var10.field4922 = arg1;
        var10.field4929 = arg9;
        var10.field4911 = arg8;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)I", line = 56)
    public final int method2113(int arg0, int arg1) {
        field5168++;
        if (this.field5170 != null) {
            arg1 = (int) ((long) this.field5177 * (long) arg1 / (long) this.field5178);
        }
        if (arg0 != -2079633968) {
            this.method2117((byte[]) null, true);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V", line = 71)
    public static final void method2114(byte arg0) {
        field5167++;
        int var1 = 0;
        int[] var2 = new int[class147.field2416];
        for (int var3 = 0; var3 < class147.field2416; var3++) {
            class44 var4 = class81.method616(var3, (byte) 25);
            if (var4.field713 >= 0 || var4.field711 >= 0) {
                var2[var1++] = var3;
            }
        }
        class293.field5002 = new int[var1];
        if (arg0 != 83) {
            method2120(-12, -6);
        }
        for (int var5 = 0; var5 < var1; var5++) {
            class293.field5002[var5] = var2[var5];
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)I", line = 114)
    public final int method2115(int arg0, boolean arg1) {
        if (this.field5170 != null) {
            arg0 = (int) ((long) this.field5177 * (long) arg0 / (long) this.field5178) + 6;
        }
        if (arg1) {
            method2112(-30, 120, -38, -45, 100, (byte) -19, 54, -21, 31, 97);
        }
        field5175++;
        return arg0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V", line = 128)
    public static final void method2116(boolean arg0) {
        class149.field2453.method1484(!arg0);
        field5173++;
        class9.field115.method1484(false);
        class138.field2280.method1484(false);
        if (!arg0) {
            field5176 = (class59) null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([BZ)[B", line = 142)
    public final byte[] method2117(byte[] arg0, boolean arg1) {
        if (this.field5170 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field5177 / (long) this.field5178) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                int[] var8 = this.field5170[var5];
                byte var9 = arg0[var7];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var6 + var10] += var8[var10] * var9;
                }
                int var11 = this.field5177 + var5;
                int var12 = var11 / this.field5178;
                var5 = var11 - this.field5178 * var12;
                var6 += var12;
            }
            arg0 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg0[var13] = -128;
                } else if (var14 <= 127) {
                    arg0[var13] = (byte) var14;
                } else {
                    arg0[var13] = 127;
                }
            }
        }
        if (arg1) {
            return (byte[]) null;
        } else {
            field5172++;
            return arg0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)I", line = 209)
    private static final int method2118(int arg0, int arg1, int arg2) {
        field5171++;
        if (arg2 != 32768) {
            return -80;
        }
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 242)
    public static void method2119(int arg0) {
        field5166 = null;
        field5176 = null;
        field5179 = null;
        if (arg0 != 5) {
            field5180 = (class263) null;
        }
        field5180 = null;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V", line = 255)
    public static final void method2120(int arg0, int arg1) {
        field5174++;
        int var2 = -87 % ((34 - arg0) / 46);
        class123.field2033 = arg1;
        class200.method1436(3, -125);
        class200.method1436(4, -127);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(II)V", line = 277)
    public class305(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = method2118(arg1, arg0, 32768);
            int var4 = arg1 / var3;
            this.field5177 = var4;
            int var5 = arg0 / var3;
            this.field5178 = var5;
            this.field5170 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field5170[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var11 = (double) var4 / (double) var5;
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var11;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
