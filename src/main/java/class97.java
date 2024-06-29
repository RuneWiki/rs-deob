import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class97 extends class51 {

    @OriginalMember(owner = "client!kf", name = "ib", descriptor = "Z")
    private boolean field1887 = true;

    @OriginalMember(owner = "client!kf", name = "eb", descriptor = "Z")
    private boolean field1883 = true;

    @OriginalMember(owner = "client!kf", name = "hb", descriptor = "Led;")
    private static class43 field1886 = class191.method1219("flash1:", false);

    @OriginalMember(owner = "client!kf", name = "lb", descriptor = "Led;")
    public static class43 field1890 = field1886;

    @OriginalMember(owner = "client!kf", name = "db", descriptor = "Led;")
    public static class43 field1882 = class191.method1219("M", false);

    @OriginalMember(owner = "client!kf", name = "fb", descriptor = "I")
    public static int field1884 = 0;

    @OriginalMember(owner = "client!kf", name = "nb", descriptor = "Led;")
    public static class43 field1892 = field1886;

    @OriginalMember(owner = "client!kf", name = "ab", descriptor = "Led;")
    private static class43 field1879 = class191.method1219(" ", false);

    @OriginalMember(owner = "client!kf", name = "cb", descriptor = "Led;")
    public static class43 field1881 = field1879;

    @OriginalMember(owner = "client!kf", name = "Z", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!kf", name = "bb", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!kf", name = "gb", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!kf", name = "jb", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!kf", name = "kb", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!kf", name = "mb", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)I")
    public static final int method609(int arg0, int arg1) {
        if (arg0 >= -111) {
            field1881 = null;
        }
        ++field1878;
        return (arg1 & 993917) >> 17;
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)[Ltg;")
    public static final class179[] method610(int arg0) {
        ++field1888;
        class179[] var1 = new class179[class122.field2452];
        for (int var2 = arg0; ~class122.field2452 < ~var2; ++var2) {
            class179 var3 = new class179();
            var3.field3572 = class79.field1567;
            var3.field3578 = class69.field1382;
            var3.field3573 = class114.field2220[var2];
            var3.field3575 = class66.field1328[var2];
            var3.field3574 = class30.field573[var2];
            var3.field3576 = class52.field1055[var2];
            var3.field3571 = class17.field274;
            var3.field3577 = class1.field1[var2];
            var1[var2] = var3;
        }
        class60.method382((byte) -102);
        return var1;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)V")
    public static void method611(byte arg0) {
        field1892 = null;
        field1890 = null;
        field1882 = null;
        field1886 = null;
        field1881 = null;
        if (arg0 <= -31) {
            field1879 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field1891;
        if (arg0 != 16) {
            return null;
        } else {
            int[] var3 = super.field1025.method39(arg1, (byte) 39);
            if (super.field1025.field154) {
                int[] var4 = this.method314(0, (byte) -72, !this.field1887 ? arg1 : class71.field1407 - arg1);
                if (this.field1883) {
                    for (int var5 = 0; ~class122.field2442 < ~var5; ++var5) {
                        var3[var5] = var4[class108.field2080 - var5];
                    }
                } else {
                    class42.method235(var4, 0, var3, 0, class122.field2442);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        ++field1889;
        if (arg1 != 0) {
            field1881 = null;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field1029 = arg0.method538((byte) -112) == 1;
                }
            } else {
                this.field1887 = ~arg0.method538((byte) -84) == -2;
            }
        } else {
            this.field1883 = ~arg0.method538((byte) 99) == -2;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    public class97() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(II)Z")
    public static final boolean method612(int arg0, int arg1) {
        ++field1885;
        if (arg1 < 0) {
            return false;
        } else {
            int var2 = class40.field756[arg1];
            if (~var2 <= -2001) {
                var2 -= 2000;
            }
            if (arg0 != -25553) {
                return false;
            } else {
                return ~var2 == -1005;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method99(int arg0, byte arg1) {
        if (arg1 != -94) {
            this.method27(31, -32);
        }
        int[][] var3 = super.field1027.method1087(arg0, -2);
        if (super.field1027.field3428) {
            int[][] var4 = this.method306(0, this.field1887 ? -arg0 + class71.field1407 : arg0, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field1883) {
                for (int var11 = 0; class122.field2442 > var11; ++var11) {
                    var8[var11] = var6[-var11 + class108.field2080];
                    var9[var11] = var5[class108.field2080 - var11];
                    var10[var11] = var7[-var11 + class108.field2080];
                }
            } else {
                for (int var12 = 0; var12 < class122.field2442; ++var12) {
                    var8[var12] = var6[var12];
                    var9[var12] = var5[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        ++field1880;
        return var3;
    }
}
