import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class77 {

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    private int field1917;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "[[I")
    private int[][] field1902;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    private int field1924;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field1903 = 0;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Loc;")
    public static class99 field1912 = class48.method402((byte) -104, "compass");

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field1906 = 0;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Loc;")
    private static class99 field1911 = class48.method402((byte) -104, "Select a world");

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Loc;")
    private static class99 field1914 = class48.method402((byte) -104, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Loc;")
    public static class99 field1904 = class48.method402((byte) -104, "headicons_pk");

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Loc;")
    public static class99 field1913 = class48.method402((byte) -104, "::gc");

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Loc;")
    public static class99 field1915 = field1914;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Loc;")
    private static class99 field1919 = class48.method402((byte) -104, "Prepared sound engine");

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field1907 = 0;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field1923 = -1;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "[I")
    public static int[] field1910 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field1921 = 0;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Loc;")
    public static class99 field1916 = field1911;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Loc;")
    public static class99 field1909 = field1919;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Loe;")
    public static class102 field1918;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "[Ljc;")
    public static class64[] field1905;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)I")
    public final int method678(int arg0, byte arg1) {
        if (arg1 != 61) {
            this.method678(-79, (byte) 124);
        }
        field1901++;
        if (this.field1902 != null) {
            arg0 = (int) ((long) this.field1917 * (long) arg0 / (long) this.field1924) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)I")
    public final int method679(int arg0, int arg1) {
        if (arg0 != -23935) {
            field1912 = null;
        }
        if (this.field1902 != null) {
            arg1 = (int) ((long) this.field1917 * (long) arg1 / (long) this.field1924);
        }
        field1920++;
        return arg1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)I")
    public static final int method680(int arg0, int arg1, int arg2, int arg3) {
        field1922++;
        if ((class81.field2028[arg0][arg1][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg0 <= 0 || (class81.field2028[1][arg1][arg3] & 0x2) == 0) {
            int var4 = 53 / ((arg2 + 50) / 45);
            return arg0;
        } else {
            return arg0 - 1;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static void method681(byte arg0) {
        field1916 = null;
        int var1 = -68 % ((arg0 - 53) / 42);
        field1918 = null;
        field1909 = null;
        field1919 = null;
        field1905 = null;
        field1915 = null;
        field1913 = null;
        field1910 = null;
        field1912 = null;
        field1904 = null;
        field1914 = null;
        field1911 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([BI)[B")
    public final byte[] method682(byte[] arg0, int arg1) {
        if (arg1 <= 103) {
            this.method679(12, -66);
        }
        if (this.field1902 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field1917 / (long) this.field1924) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field1902[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1917 + var6;
                int var14 = var13 / this.field1924;
                var5 += var14;
                var6 = var13 - this.field1924 * var14;
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
        field1908++;
        return arg0;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(II)V")
    public class77(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class134.method1086(arg1, -17, arg0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field1917 = var4;
            this.field1902 = new int[var5][14];
            this.field1924 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1902[var6];
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
