import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class15 extends class144 {

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    public static int field187 = 0;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        ++field185;
        if (arg1 != 255) {
            return null;
        } else {
            int[] var3 = super.field2069.method425(true, arg0);
            if (super.field2069.field820) {
                int var4 = class143.field2045[arg0];
                for (int var5 = 0; ~class104.field1411 < ~var5; ++var5) {
                    var3[var5] = this.method93((byte) 105, class87.field1178[var5], var4) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lbc;Lbc;I)V")
    public static final void method90(class282 arg0, class282 arg1, int arg2) {
        class116.field1619 = arg0;
        class30.field360 = arg1;
        class122.field1760 = class30.field360.method1874((byte) 18, arg2);
        ++field189;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class15() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)V")
    public static final void method91(int arg0) {
        if (arg0 <= 85) {
            field190 = -30;
        }
        for (class166 var1 = (class166) class189.field2705.method1890((byte) 83); var1 != null; var1 = (class166) class189.field2705.method1889(false)) {
            int var2 = var1.field2395;
            if (class238.method1549((byte) -91, var2)) {
                class82[] var3 = class123.field1767[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; ++var5) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field1126;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field4489;
                    class82 var7 = class182.method1187((byte) -41, var6);
                    if (var7 != null) {
                        class255.method1632(16711680, var7);
                    }
                }
            }
        }
        ++field188;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)V")
    public static final void method92(byte arg0, int arg1) {
        ++field182;
        if (class197.field2806 == null) {
            class197.field2806 = new byte[4][104][104];
        }
        int var2 = -93 / ((24 - arg1) / 60);
        for (int var3 = 0; var3 < 4; ++var3) {
            for (int var4 = 0; var4 < 104; ++var4) {
                for (int var5 = 0; var5 < 104; ++var5) {
                    class197.field2806[var3][var4][var5] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BII)I")
    private final int method93(byte arg0, int arg1, int arg2) {
        ++field184;
        if (arg0 <= 25) {
            field187 = -82;
        }
        int var4 = arg1 - -(arg2 * 57);
        int var5 = var4 ^ var4 << 1;
        return -(((var5 * var5 * 15731 - -789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public static final void method94(boolean arg0) {
        if (~class123.field1776 != 0) {
            class101.method619(264, class123.field1776);
        }
        if (arg0) {
            field187 = 73;
        }
        for (int var1 = 0; class216.field3044 > var1; ++var1) {
            if (class129.field1862[var1]) {
                class163.field2341[var1] = true;
            }
            class59.field705[var1] = class129.field1862[var1];
            class129.field1862[var1] = false;
        }
        class149.field2172 = null;
        ++field183;
        class161.field2319 = -1;
        class156.field2256 = class198.field2819;
        class211.field2962 = -1;
        if (~class123.field1776 != 0) {
            class216.field3044 = 0;
            class197.method1270(0);
        }
        class155.method1034();
        class123.field1771 = 0;
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(B)V")
    public static final void method95(byte arg0) {
        int var1 = class263.field3814;
        ++field186;
        int var2 = class221.field3134;
        int var3 = class267.field3901;
        byte var4 = 20;
        int var5 = class76.field911 + -3;
        if (class165.field2376 == null || class197.field2804 == null) {
            if (class120.field1705.method1842(class274.field4104, -5012) && class120.field1705.method1842(class35.field413, -5012)) {
                class165.field2376 = class172.method1123(class274.field4104, class120.field1705, 123, 0);
                class197.field2804 = class172.method1123(class35.field413, class120.field1705, 120, 0);
            } else {
                class155.method1030(var1, var2, var3, var4, class289.field4502, -class181.field2583 + 256);
            }
        }
        if (class165.field2376 != null && class197.field2804 != null) {
            int var6 = (var3 - class197.field2804.field1882 * 2) / class165.field2376.field1882;
            for (int var7 = 0; var6 > var7; ++var7) {
                class165.field2376.method848(class165.field2376.field1882 * var7 + class197.field2804.field1882 + var1, var2);
            }
            class197.field2804.method848(var1, var2);
            class197.field2804.method858(var1 - class197.field2804.field1882 + var3, var2);
        }
        class248.field3614.method537(class164.field2349, var1 + 3, var2 + 14, class55.field649, -1);
        class155.method1030(var1, var2 - -var4, var3, -var4 + var5, class289.field4502, -class181.field2583 + 256);
        int var8 = class104.field1417;
        int var9 = class37.field431;
        int var10 = 0;
        if (arg0 >= -33) {
            field190 = -101;
        }
        while (~var10 > ~class112.field1496) {
            int var18 = (-var10 + class112.field1496 + -1) * 15 + (var2 - (-var4 - 13));
            if (~var8 < ~var1 && ~(var1 + var3) < ~var8 && ~var9 < ~(var18 + -13) && var9 < var18 - -3) {
                class155.method1030(var1, var18 + -12, var3, 15, class164.field2350, -class110.field1479 + 256);
            }
            ++var10;
        }
        if ((class288.field4490 == null || class292.field4625 == null || class94.field1266 == null) && class120.field1705.method1842(class178.field2532, -5012) && class120.field1705.method1842(class61.field726, -5012) && class120.field1705.method1842(class34.field399, -5012)) {
            class288.field4490 = class172.method1123(class178.field2532, class120.field1705, -24, 0);
            class292.field4625 = class172.method1123(class61.field726, class120.field1705, -93, 0);
            class94.field1266 = class172.method1123(class34.field399, class120.field1705, 121, 0);
        }
        if (class288.field4490 != null && class292.field4625 != null && class94.field1266 != null) {
            int var11 = (-(class94.field1266.field1882 * 2) + var3) / class288.field4490.field1882;
            for (int var12 = 0; var11 > var12; ++var12) {
                class288.field4490.method848(class288.field4490.field1882 * var12 + class94.field1266.field1882 + var1, -class288.field4490.field1879 + var5 + var2);
            }
            int var13 = (var5 - var4 + -class94.field1266.field1879) / class292.field4625.field1879;
            for (int var14 = 0; var14 < var13; ++var14) {
                class292.field4625.method848(var1, var2 + var4 - -(class292.field4625.field1879 * var14));
                class292.field4625.method858(var1 + var3 + -class292.field4625.field1882, class292.field4625.field1879 * var14 + var2 + var4);
            }
            class94.field1266.method848(var1, var2 - -var5 + -class94.field1266.field1879);
            class94.field1266.method858(var1 + var3 - class94.field1266.field1882, var2 + var5 + -class94.field1266.field1879);
        }
        for (int var15 = 0; ~class112.field1496 < ~var15; ++var15) {
            int var16 = var2 + 13 - (-((class112.field1496 - 1 + -var15) * 15) + -var4);
            int var17 = class55.field649;
            if (var8 > var1 && ~var8 > ~(var1 + var3) && ~(var16 + -13) > ~var9 && ~var9 > ~(var16 - -3)) {
                var17 = class257.field3734;
            }
            class248.field3614.method537(class59.method368(var15, (byte) -127), var1 - -3, var16, var17, 0);
        }
        class220.method1433(0, class76.field911, class267.field3901, class263.field3814, class221.field3134);
    }
}
