import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class112 extends class64 {

    @OriginalMember(owner = "client!md", name = "fb", descriptor = "I")
    private int field2041 = 4096;

    @OriginalMember(owner = "client!md", name = "bb", descriptor = "[I")
    public static int[] field2037 = new int[99];

    @OriginalMember(owner = "client!md", name = "gb", descriptor = "Lsg;")
    public static class169 field2042 = null;

    @OriginalMember(owner = "client!md", name = "jb", descriptor = "Lsg;")
    private static class169 field2045;

    @OriginalMember(owner = "client!md", name = "nb", descriptor = "Lsg;")
    public static class169 field2049;

    @OriginalMember(owner = "client!md", name = "lb", descriptor = "Lsg;")
    public static class169 field2047;

    @OriginalMember(owner = "client!md", name = "kb", descriptor = "Lsg;")
    private static class169 field2046;

    @OriginalMember(owner = "client!md", name = "mb", descriptor = "Lsg;")
    private static class169 field2048;

    @OriginalMember(owner = "client!md", name = "sb", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!md", name = "ub", descriptor = "Lsg;")
    public static class169 field2056;

    @OriginalMember(owner = "client!md", name = "ib", descriptor = "Lsg;")
    public static class169 field2044;

    @OriginalMember(owner = "client!md", name = "qb", descriptor = "Lsg;")
    public static class169 field2052;

    @OriginalMember(owner = "client!md", name = "pb", descriptor = "Lsg;")
    public static class169 field2051;

    @OriginalMember(owner = "client!md", name = "tb", descriptor = "[I")
    public static int[] field2055;

    @OriginalMember(owner = "client!md", name = "vb", descriptor = "Lsg;")
    public static class169 field2057;

    @OriginalMember(owner = "client!md", name = "cb", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!md", name = "db", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!md", name = "eb", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!md", name = "hb", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!md", name = "ob", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!md", name = "xb", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!md", name = "rb", descriptor = "[Lbg;")
    public static class18[] field2053;

    @OriginalMember(owner = "client!md", name = "wb", descriptor = "[[I")
    public static int[][] field2058;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lsg;ILsg;Lsg;I)V")
    public static final void method690(class169 arg0, int arg1, class169 arg2, class169 arg3, int arg4) {
        for (int var5 = 99; ~var5 < -1; --var5) {
            class48.field866[var5] = class48.field866[var5 - 1];
            class123.field2266[var5] = class123.field2266[var5 + -1];
            class9.field244[var5] = class9.field244[var5 + -1];
            class189.field3691[var5] = class189.field3691[var5 + -1];
        }
        class123.field2266[0] = arg0;
        class9.field244[0] = arg3;
        class8.field222 = class58.field1078;
        class48.field866[arg4] = arg1;
        class189.field3691[0] = arg2;
        ++class155.field2981;
        ++field2039;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        ++field2038;
        int[] var3 = super.field1192.method19((byte) 124, arg0);
        if (arg1 != 19) {
            method690((class169) null, -68, (class169) null, (class169) null, 113);
        }
        if (super.field1192.field75) {
            int[] var4 = this.method394(20331, 0, class89.field1616 & arg0 + -1);
            int[] var5 = this.method394(arg1 + 20312, 0, arg0);
            int[] var6 = this.method394(20331, 0, arg0 + 1 & class89.field1616);
            for (int var7 = 0; ~var7 > ~class147.field2715; ++var7) {
                int var8 = (var5[var7 + 1 & class8.field217] + -var5[var7 + -1 & class8.field217]) * this.field2041;
                int var9 = (var6[var7] + -var4[var7]) * this.field2041;
                int var10 = var8 >> 12;
                int var11 = var9 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((var12 + var13 + 4096) / 4096)));
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    public class112() {
        super(1, true);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIILke;IIZ)V")
    public static final void method691(int arg0, int arg1, int arg2, class95 arg3, int arg4, int arg5, boolean arg6) {
        int var7 = -63 % ((-64 - arg1) / 54);
        class46.field860 = arg5;
        class3.field71 = arg3;
        class65.field1222 = arg0;
        class137.field2559 = arg6;
        class115.field2133 = arg4;
        class81.field1494 = arg2;
        ++field2059;
        class201.field3927 = 1;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        int var4 = 16 % ((arg0 - -60) / 36);
        ++field2040;
        if (~arg2 == -1) {
            this.field2041 = arg1.method785(true);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZZII)Lsg;")
    public static final class169 method692(boolean arg0, boolean arg1, int arg2, int arg3) {
        ++field2043;
        if (arg3 >= 2 && arg3 <= 36) {
            int var4 = arg2 / arg3;
            int var5 = 1;
            if (!arg0) {
                return null;
            } else {
                while (var4 != 0) {
                    ++var5;
                    var4 /= arg3;
                }
                int var6 = var5;
                if (arg2 < 0 || arg1) {
                    var6 = var5 + 1;
                }
                byte[] var7 = new byte[var6];
                if (arg2 >= 0) {
                    if (arg1) {
                        var7[0] = 43;
                    }
                } else {
                    var7[0] = 45;
                }
                for (int var8 = 0; var8 < var5; ++var8) {
                    int var10 = arg2 % arg3;
                    arg2 /= arg3;
                    if (~var10 > -1) {
                        var10 = -var10;
                    }
                    if (~var10 < -10) {
                        var10 += 39;
                    }
                    var7[var6 + -1 + -var8] = (byte) (var10 + 48);
                }
                class169 var9 = new class169();
                var9.field3253 = var6;
                var9.field3248 = var7;
                return var9;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!md", name = "h", descriptor = "(I)V")
    public static void method693(int arg0) {
        field2037 = null;
        field2051 = null;
        field2056 = null;
        field2049 = null;
        field2048 = null;
        field2055 = null;
        field2047 = null;
        field2045 = null;
        field2046 = null;
        field2042 = null;
        if (arg0 != -119) {
            method690((class169) null, 119, (class169) null, (class169) null, 42);
        }
        field2057 = null;
        field2053 = null;
        field2044 = null;
        field2058 = null;
        field2052 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -100; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field2037[var1] = var0 / 4;
        }
        field2045 = class165.method1060(" is already on your ignore list)3", 1536);
        field2049 = class165.method1060("m", 1536);
        field2047 = class165.method1060("<col=ff9040>", 1536);
        field2046 = class165.method1060("level)2", 1536);
        field2048 = class165.method1060("Attack", 1536);
        field2054 = 0;
        field2056 = field2046;
        field2044 = field2048;
        field2052 = class165.method1060("ams", 1536);
        field2051 = class165.method1060(" (X", 1536);
        field2055 = new int[100];
        field2057 = field2045;
    }
}
