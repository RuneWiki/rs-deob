import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class85 {

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    private int field2035;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    private int field2034;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "[[I")
    private int[][] field2044;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Lja;")
    public static class62 field2046 = class30.method243(43, "Cabbage");

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field2048 = 0;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field2039 = 0;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field2047 = 0;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field2037 = 0;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "[I")
    public static int[] field2049 = new int[1000];

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field2052 = 0;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "J")
    public static long field2050;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Lpd;")
    public static class108 field2042;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lib;")
    public static class57 field2036;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "[I")
    public static int[] field2043;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)I")
    public final int method656(int arg0, int arg1) {
        if (this.field2044 != null) {
            arg0 = (int) ((long) this.field2035 * (long) arg0 / (long) this.field2034);
        }
        if (arg1 != 0) {
            this.field2034 = -8;
        }
        field2051++;
        return arg0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([BI)[B")
    public final byte[] method657(byte[] arg0, int arg1) {
        if (arg1 != -15) {
            return null;
        }
        field2041++;
        if (this.field2044 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field2035 / (long) this.field2034) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field2044[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2035 + var6;
                int var14 = var13 / this.field2034;
                var5 += var14;
                var6 = var13 - this.field2034 * var14;
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
        return arg0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method658(int arg0) {
        field2049 = null;
        field2042 = null;
        field2036 = null;
        if (arg0 >= 2) {
            field2043 = null;
            field2046 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)I")
    public static final int method659(int arg0, int arg1, int arg2) {
        class93 var3 = (class93) class59.field1438.method537(-1, (long) arg2);
        field2033++;
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var3.field2173.length) {
            if (arg0 <= 87) {
                field2042 = null;
            }
            return var3.field2173[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)I")
    public static int method660(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(II)V")
    public class85(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class34.method265(-1, arg0, arg1);
            int var4 = arg1 / var3;
            this.field2035 = var4;
            int var5 = arg0 / var3;
            this.field2034 = var5;
            this.field2044 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field2044[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIILea;ZBI)V")
    public static final void method661(int arg0, int arg1, int arg2, class29 arg3, boolean arg4, byte arg5, int arg6) {
        long var7 = (long) ((arg1 << 16) + arg2);
        class50 var9 = (class50) class17.field388.method537(-1, var7);
        field2045++;
        if (var9 != null) {
            return;
        }
        class50 var10 = (class50) class124.field2820.method537(-1, var7);
        if (var10 != null) {
            return;
        }
        class50 var11 = (class50) class138.field3192.method537(-1, var7);
        if (var11 == null) {
            if (!arg4) {
                class50 var12 = (class50) class96.field2246.method537(-1, var7);
                if (var12 != null) {
                    return;
                }
            }
            class50 var13 = new class50();
            var13.field1149 = arg3;
            var13.field1166 = arg5;
            if (arg6 != -15) {
                method658(56);
            }
            var13.field1167 = arg0;
            if (arg4) {
                class17.field388.method538(var13, (byte) -27, var7);
                class1.field8++;
            } else {
                class96.field2249.method70(-4652, var13);
                class138.field3192.method538(var13, (byte) -27, var7);
                class5.field66++;
            }
        } else if (arg4) {
            var11.method228((byte) 104);
            class17.field388.method538(var11, (byte) -27, var7);
            class5.field66--;
            class1.field8++;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIILpd;)Lq;")
    public static final class114 method662(int arg0, int arg1, int arg2, class108 arg3) {
        if (arg2 == 127) {
            field2040++;
            return class63.method478(arg1, arg0, arg3, (byte) 127) ? class28.method222(0) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)I")
    public final int method663(int arg0, int arg1) {
        if (this.field2044 != null) {
            arg0 = (int) ((long) this.field2035 * (long) arg0 / (long) this.field2034) + 6;
        }
        if (arg1 >= -37) {
            field2049 = null;
        }
        field2038++;
        return arg0;
    }
}
