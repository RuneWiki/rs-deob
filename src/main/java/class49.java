import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class49 extends class171 {

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Z")
    public static boolean field709 = false;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "[I")
    public static int[] field715 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!a", name = "A", descriptor = "I")
    public static int field714 = 0;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "I")
    public int field708;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    public int field718;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "[I")
    public int[] field705;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "[I")
    public int[] field707;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "[I")
    public int[] field717;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "[Lvj;")
    public class117[] field706;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "[Lvj;")
    public class117[] field711;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "[[[B")
    public byte[][][] field712;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
    public static void method317(int arg0) {
        if (arg0 != 2) {
            field709 = true;
        }
        field715 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V")
    public static final void method318(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field704++;
        for (class71 var5 = (class71) class34.field524.method990(-95); var5 != null; var5 = (class71) class34.field524.method993(-65)) {
            class116.method785(-32316, arg3, arg0, arg1, var5, arg4);
        }
        for (class71 var6 = (class71) class235.field3541.method990(-73); var6 != null; var6 = (class71) class235.field3541.method993(-72)) {
            byte var11 = 1;
            class151 var12 = var6.field971.method1741((byte) 88);
            if (var6.field971.field4050 == var12.field2106) {
                var11 = 0;
            } else if (var6.field971.field4050 == var12.field2087 || var6.field971.field4050 == var12.field2090 || var6.field971.field4050 == var12.field2086 || var6.field971.field4050 == var12.field2103) {
                var11 = 2;
            } else if (var6.field971.field4050 == var12.field2121 || var6.field971.field4050 == var12.field2119 || var6.field971.field4050 == var12.field2113 || var6.field971.field4050 == var12.field2101) {
                var11 = 3;
            }
            if (var6.field977 != var11) {
                int var13 = class13.method78(var6.field971, (byte) -41);
                if (var6.field973 != var13) {
                    if (var6.field989 != null) {
                        class21.field298.method360(var6.field989);
                        var6.field989 = null;
                    }
                    var6.field973 = var13;
                }
                var6.field977 = var11;
            }
            var6.field980 = var6.field971.field4019;
            var6.field972 = var6.field971.field4019 + var6.field971.method561(-1) * 64;
            var6.field970 = var6.field971.field4085;
            var6.field983 = var6.field971.field4085 + (var6.field971.method561(-1) * 64);
            class116.method785(-32316, arg3, arg0, arg1, var6, arg4);
        }
        for (class71 var7 = (class71) class95.field1343.method21((byte) 67); var7 != null; var7 = (class71) class95.field1343.method22(true)) {
            class151 var8 = var7.field975.method1741((byte) 100);
            byte var9 = 1;
            if (var7.field975.field4050 == var8.field2106) {
                var9 = 0;
            } else if (var7.field975.field4050 == var8.field2087 || var7.field975.field4050 == var8.field2090 || var7.field975.field4050 == var8.field2086 || var7.field975.field4050 == var8.field2103) {
                var9 = 2;
            } else if (var7.field975.field4050 == var8.field2121 || var7.field975.field4050 == var8.field2119 || var7.field975.field4050 == var8.field2113 || var7.field975.field4050 == var8.field2101) {
                var9 = 3;
            }
            if (var7.field977 != var9) {
                int var10 = class204.method1299(var7.field975, 97);
                if (var7.field973 != var10) {
                    if (var7.field989 != null) {
                        class21.field298.method360(var7.field989);
                        var7.field989 = null;
                    }
                    var7.field973 = var10;
                }
                var7.field977 = var9;
            }
            var7.field980 = var7.field975.field4019;
            var7.field972 = var7.field975.field4019 + var7.field975.method561(-1) * 64;
            var7.field970 = var7.field975.field4085;
            var7.field983 = var7.field975.field4085 + var7.field975.method561(-1) * 64;
            class116.method785(-32316, arg3, arg0, arg1, var7, arg4);
        }
        if (arg2 <= 33) {
            method318(3, 127, -104, 98, 27);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIBLhc;)[Lke;")
    public static final class110[] method319(int arg0, int arg1, byte arg2, class235 arg3) {
        int var4 = -22 / ((16 - arg2) / 59);
        field713++;
        return class57.method351(arg3, arg0, arg1, (byte) 107) ? class7.method43(true) : null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)V")
    public static final void method320(int arg0, byte arg1) {
        class67.field906 = -1;
        field710++;
        int var2 = 90 / ((-arg1 - 35) / 61);
        class67.field906 = -1;
        class234.field3529 = arg0;
        class143.method956(-1);
    }
}
