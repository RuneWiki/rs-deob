import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class101 extends class64 {

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
    private int field2159 = 0;

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
    private int field2165 = 4096;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
    public static int field2156 = 0;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "Lcd;")
    public static class23 field2157 = class54.method414(" )2> <col=00ffff>", -1);

    @OriginalMember(owner = "client!lc", name = "Y", descriptor = "Lcd;")
    private static class23 field2163 = class54.method414("Drop", -1);

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "Lcd;")
    public static class23 field2162 = field2163;

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "[I")
    public static int[] field2167 = new int[99];

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public static int field2154 = 0;

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "Lcd;")
    public static class23 field2166 = class54.method414("mapfunction", -1);

    @OriginalMember(owner = "client!lc", name = "db", descriptor = "[[[I")
    public static int[][][] field2168;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
    public static void method671(int arg0) {
        field2163 = null;
        int var1 = -122 / ((-25 - arg0) / 59);
        field2167 = null;
        field2166 = null;
        field2157 = null;
        field2168 = null;
        field2162 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field2161;
        int[] var3 = super.field1513.method1033(arg1 + 9294, arg0);
        if (arg1 != -9421) {
            field2156 = -88;
        }
        if (super.field1513.field3368) {
            int[] var4 = this.method479(-1, arg0, 0);
            for (int var5 = 0; ~class168.field3367 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field2159 >= ~var6 && ~var6 >= ~this.field2165 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        ++field2158;
        int var4 = -31 % ((arg0 - 7) / 43);
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field2165 = arg2.method1197(-1);
            }
        } else {
            this.field2159 = arg2.method1197(-1);
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    public class101() {
        super(1, true);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lcd;Lkh;ILcd;)Lea;")
    public static final class38 method672(class23 arg0, class97 arg1, int arg2, class23 arg3) {
        if (arg2 > -26) {
            field2157 = null;
        }
        ++field2164;
        int var4 = arg1.method647((byte) -22, arg3);
        int var5 = arg1.method642(var4, (byte) -106, arg0);
        return class70.method508(true, var4, var5, arg1);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IBI)I")
    public static final int method673(int arg0, byte arg1, int arg2) {
        int var3 = -128 + (class113.method726(arg0 - -45365, arg2 + 91923, -1, 4) - -(-128 + class113.method726(arg0 + 10294, arg2 - -37821, -1, 2) >> 1)) - -(-128 + class113.method726(arg0, arg2, -1, 1) >> 2);
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        ++field2155;
        if (arg1 != -20) {
            field2156 = 7;
        }
        return var4;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -100; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2167[var1] = var0 / 4;
        }
        field2168 = new int[4][13][13];
    }
}
