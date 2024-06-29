import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class233 extends class115 {

    @OriginalMember(owner = "client!mg", name = "Z", descriptor = "Lqe;")
    public static class168 field3961 = class66.method448("T", 100);

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    public static int field3952 = 0;

    @OriginalMember(owner = "client!mg", name = "ab", descriptor = "Lqe;")
    public static class168 field3962 = class66.method448(":duelfriend:", 39);

    @OriginalMember(owner = "client!mg", name = "ib", descriptor = "Lqe;")
    public static class168 field3970 = class66.method448("<col=c0ff00>", 18);

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
    private int field3956;

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
    private int field3957;

    @OriginalMember(owner = "client!mg", name = "X", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!mg", name = "Y", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!mg", name = "eb", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!mg", name = "fb", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!mg", name = "gb", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!mg", name = "hb", descriptor = "I")
    private int field3969;

    @OriginalMember(owner = "client!mg", name = "db", descriptor = "Lpc;")
    public static class202 field3965;

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "Lrd;")
    public static class207 field3958;

    @OriginalMember(owner = "client!mg", name = "bb", descriptor = "[I")
    public static int[] field3963;

    @OriginalMember(owner = "client!mg", name = "cb", descriptor = "[[[B")
    public static byte[][][] field3964;

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    public class233() {
        this(0);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)V")
    public static final void method1504(boolean arg0, int arg1) {
        int var2 = 101 / ((-4 - arg1) / 32);
        for (int var3 = 0; ~var3 > ~class82.field1244; ++var3) {
            class222 var4 = class229.field3898[class51.field690[var3]];
            long var5 = (long) class51.field690[var3] << 32 | 536870912L;
            if (var4 != null && var4.method87(-1570135920) && !arg0 != var4.field3814.field3166 && var4.field3814.method1197(true)) {
                int var7 = var4.field190 >> 7;
                int var8 = var4.field166 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (~var4.field171 == -2 && ~(127 & var4.field190) == -65 && ~(var4.field166 & 127) == -65) {
                        if (~class125.field2058[var7][var8] == ~class237.field4073) {
                            continue;
                        }
                        class125.field2058[var7][var8] = class237.field4073;
                    }
                    if (!var4.field3814.field3173) {
                        var5 |= Long.MIN_VALUE;
                    }
                    var4.field202 = class236.method1535(var4.field190 - (-(var4.field171 * 64) + 64), class196.field3401, var4.field166 - -((var4.field171 - 1) * 64), 0);
                    class241.method1574(class196.field3401, var4.field190, var4.field166, var4.field202, (var4.field171 + -1) * 64 - -60, var4, var4.field194, var5, var4.field213);
                }
            }
        }
        ++field3953;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (arg2 == 0) {
            this.method1508((byte) 74, arg1.method727(-27619));
        }
        if (arg0 != 107) {
            field3962 = null;
        }
        ++field3955;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        if (arg1 <= 11) {
            this.field3969 = 111;
        }
        ++field3954;
        int[][] var3 = super.field1882.method1242(arg0, -107);
        if (super.field1882.field3344) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class130.field2297 > var7; ++var7) {
                var4[var7] = this.field3969;
                var5[var7] = this.field3957;
                var6[var7] = this.field3956;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B[Lqe;)[Lqe;")
    public static final class168[] method1505(byte arg0, class168[] arg1) {
        ++field3966;
        class168[] var2 = new class168[5];
        for (int var3 = 0; ~var3 > -6; ++var3) {
            var2[var3] = class50.method347(2, new class168[] { class128.method867((byte) 98, var3), class147.field2565 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class50.method347(2, new class168[] { var2[var3], arg1[var3] });
            }
        }
        if (arg0 >= -56) {
            method1506(-74);
        }
        return var2;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I)V")
    private class233(int arg0) {
        super(0, false);
        this.method1508((byte) 74, arg0);
    }

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "(I)Lnh;")
    public static final class112 method1506(int arg0) {
        class112 var1 = new class112(24);
        var1.method768(2, 7295);
        ++field3959;
        var1.method768(class132.field2323, 7295);
        var1.method768(!class62.field844 ? 0 : 1, 7295);
        var1.method768(class249.field4315 ? 1 : 0, 7295);
        var1.method768(!class227.field3866 ? 0 : 1, 7295);
        var1.method768(class3.field34 ? 1 : 0, 7295);
        var1.method768(class17.field149 ? 1 : 0, 7295);
        var1.method768(!class153.field2651 ? 0 : 1, 7295);
        var1.method768(!class207.field3593 ? 0 : 1, 7295);
        var1.method768(!class253.field4382 ? 0 : 1, 7295);
        var1.method768(class112.field1781, 7295);
        var1.method768(!class101.field1601 ? 0 : 1, 7295);
        var1.method768(class177.field3117 ? 1 : 0, 7295);
        var1.method768(!class98.field1551 ? 0 : 1, 7295);
        var1.method768(class191.field3333, 7295);
        var1.method768(!class247.field4284 ? 0 : 1, 7295);
        var1.method768(class62.field847, 7295);
        var1.method768(class93.field1464, 7295);
        var1.method768(class166.field2828, 7295);
        var1.method753(class137.field2416, -242005080);
        var1.method753(class227.field3870, -242005080);
        if (arg0 < 115) {
            method1504(false, -93);
        }
        return var1;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)V")
    public static void method1507(byte arg0) {
        field3965 = null;
        field3970 = null;
        if (arg0 == -12) {
            field3963 = null;
            field3964 = null;
            field3962 = null;
            field3958 = null;
            field3961 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)V")
    private final void method1508(byte arg0, int arg1) {
        this.field3956 = (255 & arg1) << 4;
        this.field3957 = (arg1 & 65280) >> 4;
        if (arg0 != 74) {
            method1506(8);
        }
        this.field3969 = 4080 & arg1 >> 12;
        ++field3960;
    }
}
