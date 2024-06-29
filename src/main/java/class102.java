import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class102 {

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    private int field1922;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "[[I")
    private int[][] field1916;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    private int field1905;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Lmb;")
    public static class132 field1906 = class166.method1092("oder benutzen Sie eine andere Welt)3", 112);

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1910 = 0;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Lmb;")
    private static class132 field1909 = class166.method1092("The server is being updated)3", 118);

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Lmb;")
    public static class132 field1913 = field1909;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field1920 = 0;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Lmb;")
    public static class132 field1921 = class166.method1092("Bitte versuchen Sie)1", 121);

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1918 = 0;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Lpb;")
    public static class165 field1917;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "[I")
    public static int[] field1923;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([BI)[B")
    public final byte[] method626(byte[] arg0, int arg1) {
        field1919++;
        if (arg1 != 32768) {
            return null;
        }
        if (this.field1916 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field1905 / (long) this.field1922) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                int[] var10 = this.field1916[var4];
                byte var11 = arg0[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var5[var6 + var12] += var10[var12] * var11;
                }
                int var13 = this.field1905 + var4;
                int var14 = var13 / this.field1922;
                var6 += var14;
                var4 = var13 - this.field1922 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var5[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I")
    public final int method627(int arg0, int arg1) {
        if (arg0 > -85) {
            field1910 = -98;
        }
        field1915++;
        if (this.field1916 != null) {
            arg1 = (int) ((long) this.field1905 * (long) arg1 / (long) this.field1922);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)[Lrd;")
    public static final class188[] method628(int arg0) {
        if (arg0 != 128) {
            method628(-121);
        }
        field1911++;
        class188[] var1 = new class188[class235.field4248];
        for (int var2 = 0; var2 < class235.field4248; var2++) {
            var1[var2] = new class188(class153.field2792, class140.field2619, class23.field321[var2], class30.field462[var2], class94.field1657[var2], class153.field2793[var2], class10.field109[var2], class118.field2244);
        }
        class187.method1193(1);
        return var1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
    public static final void method629(boolean arg0) {
        field1904++;
        Object var1 = class131.field2416;
        synchronized (class131.field2416) {
            if (class241.field4327 != 0) {
                class241.field4327 = 1;
                try {
                    class131.field2416.wait();
                } catch (InterruptedException var2) {
                }
            }
            if (arg0) {
                method634(-128, -51);
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)V")
    public static void method630(boolean arg0) {
        field1917 = null;
        field1923 = null;
        field1909 = null;
        if (!arg0) {
            field1921 = null;
            field1906 = null;
            field1913 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BII)Lii;")
    public static final class96 method631(byte arg0, int arg1, int arg2) {
        if (arg0 != 72) {
            method629(false);
        }
        field1908++;
        class96 var3 = class158.method1029((byte) -119, arg2);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field1770 == null || var3.field1770.length <= arg1) {
            return null;
        } else {
            return var3.field1770[arg1];
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lmf;III)V")
    public static final void method632(class136 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class225.field4079) {
            class169 var4 = class101.field1900[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3100 != null && var4.field3100.field227.method467()) {
                arg0.method463(var4.field3100.field227, 128, 0, 0, true);
            }
        }
        if (arg3 < class225.field4079) {
            class169 var5 = class101.field1900[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3100 != null && var5.field3100.field227.method467()) {
                arg0.method463(var5.field3100.field227, 0, 0, 128, true);
            }
        }
        if (arg2 < class225.field4079 && arg3 < class14.field193) {
            class169 var6 = class101.field1900[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3100 != null && var6.field3100.field227.method467()) {
                arg0.method463(var6.field3100.field227, 128, 0, 128, true);
            }
        }
        if (arg2 < class225.field4079 && arg3 > 0) {
            class169 var7 = class101.field1900[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3100 != null && var7.field3100.field227.method467()) {
                arg0.method463(var7.field3100.field227, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)I")
    public final int method633(int arg0, byte arg1) {
        int var3 = 22 % ((16 - arg1) / 55);
        if (this.field1916 != null) {
            arg0 = (int) ((long) this.field1905 * (long) arg0 / (long) this.field1922) + 6;
        }
        field1912++;
        return arg0;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)V")
    public static final void method634(int arg0, int arg1) {
        field1907++;
        class219 var2 = (class219) class231.field4166.method806(-1, (long) arg0);
        if (arg1 < 112) {
            field1917 = null;
        }
        if (var2 != null) {
            var2.method995((byte) -115);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILii;II)V")
    public static final void method635(int arg0, class96 arg1, int arg2, int arg3) {
        field1914++;
        if (class8.field72 != 0 && class8.field72 != 3) {
            return;
        }
        int var4 = arg3 - arg1.field1740 / 2;
        int var5 = arg0 - arg1.field1830 / 2;
        int var6 = class230.field4153 + class166.field3029 & 0x7FF;
        int var7 = class50.field853[var6];
        int var8 = class50.field851[var6];
        int var9 = (class233.field4196 + 256) * var8 >> 8;
        int var10 = (class233.field4196 + 256) * var7 >> 8;
        if (arg2 != -31562) {
            field1920 = 54;
        }
        int var11 = var4 * var10 + var5 * var9 >> 11;
        int var12 = class210.field3854.field673 + var11 >> 7;
        int var13 = var4 * var9 - var5 * var10 >> 11;
        int var14 = class210.field3854.field723 - var13 >> 7;
        boolean var15 = class37.method265(0, 0, class210.field3854.field703[0], true, arg2 ^ 0x7B38, 0, 0, var12, 1, var14, 0, class210.field3854.field676[0]);
        if (!var15) {
            return;
        }
        class64.field1054.method747(var5, (byte) -32);
        class64.field1054.method747(var4, (byte) -127);
        class64.field1054.method715(107, class230.field4153);
        class64.field1054.method747(57, (byte) -119);
        class64.field1054.method747(class166.field3029, (byte) -103);
        class64.field1054.method747(class233.field4196, (byte) -71);
        class64.field1054.method747(89, (byte) -89);
        class64.field1054.method715(48, class210.field3854.field673);
        class64.field1054.method715(44, class210.field3854.field723);
        class64.field1054.method747(class185.field3435, (byte) -72);
        class64.field1054.method747(63, (byte) -51);
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(II)V")
    public class102(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class140.method945(111, arg1, arg0);
            int var4 = arg0 / var3;
            this.field1922 = var4;
            this.field1916 = new int[var4][14];
            int var5 = arg1 / var3;
            this.field1905 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field1916[var6];
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
