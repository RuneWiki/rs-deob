import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class103 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Lqd;")
    public static class40 field1805 = class147.method1106("_", (byte) -118);

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Lqd;")
    public static class40 field1813 = class147.method1106(":tradereq:", (byte) -75);

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Lqd;")
    public static class40 field1811 = class147.method1106("p12_full", (byte) -55);

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lce;")
    public static class239 field1812;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "[[I")
    public static int[][] field1807;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIIIIII)V", line = 5)
    public static final void method773(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1809++;
        int var11 = arg1 - arg3;
        boolean var12;
        if (class33.field668 > 0 && class33.field668 % 10 < 5) {
            var12 = true;
        } else {
            var12 = false;
        }
        int var13 = 983040 / arg4;
        int var14 = arg7 - arg5;
        int var15 = 983040 / arg9;
        for (int var16 = -var13; var16 < var11 + var13; var16++) {
            int var17 = arg4 * var16 + arg10 >> 16;
            int var18 = (var16 + 1) * arg4 + arg10 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                int var20 = arg8 + var17;
                int var10000 = arg8 + var18;
                int var22 = arg3 + var16 >> 6;
                if (var22 >= 0 && (class87.field1579.length - 1) >= var22) {
                    int[][] var23 = class87.field1579[var22];
                    for (int var24 = -var15; var24 < (var14 + var15); var24++) {
                        int var25 = arg9 * var24 + arg2 >> 16;
                        int var26 = arg2 + ((var24 + 1) * arg9) >> 16;
                        int var27 = var26 - var25;
                        if (var27 > 0) {
                            int var28 = var24 + arg5 >> 6;
                            var10000 = arg6 + var26;
                            int var30 = arg6 + var25;
                            if (var28 >= 0 && var28 <= var23.length - 1 && var23[var28] != null) {
                                int var31 = (arg5 + var24 & 0x3F << 6) + (arg3 + var16 & 0x3F);
                                int var32 = var23[var28][var31];
                                if (var32 != 0) {
                                    class27 var33 = class72.method540(0, var32 - 1);
                                    if (var12 && class248.field4108 == var33.field558) {
                                        class165 var34 = new class165();
                                        var34.field2734 = var20;
                                        var34.field2726 = var30;
                                        var34.field2732 = var33.field558;
                                        class118.field2000.method1972(var34, 103);
                                    }
                                    class292.field4884[var33.field558].method744(var20 - 7, var30 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class165 var35 = (class165) class118.field2000.method1971(100); var35 != null; var35 = (class165) class118.field2000.method1967(100)) {
            class292.field4884[var35.field2732].method744(var35.field2734 - 7, var35.field2726 + -7);
            class115.method879(var35.field2734, var35.field2726, 15, 16776960, 128);
            class115.method879(var35.field2734, var35.field2726, 7, 16777215, 256);
        }
        int var36 = 23 % ((-arg0 - 56) / 46);
        class118.field2000.method1966((byte) 125);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)Leg;", line = 119)
    public static final class291 method774(int arg0) {
        if (arg0 != 16969) {
            method773(-14, -60, 43, -83, 42, 16, -44, -21, -45, 0, 91);
        }
        field1808++;
        class272.field4521 = 0;
        return class89.method687((byte) 69);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V", line = 133)
    public static void method775(byte arg0) {
        field1812 = null;
        field1813 = null;
        field1807 = (int[][]) null;
        field1811 = null;
        field1805 = null;
        int var1 = -23 / ((arg0 - 55) / 41);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLsd;)Ltd;", line = 157)
    public static final class232 method776(boolean arg0, class26 arg1) {
        if (!arg0) {
            method773(-113, 99, 86, -60, -86, -100, -103, -110, 69, 96, 45);
        }
        field1815++;
        return new class232(arg1.method201(true), arg1.method201(true), arg1.method201(true), arg1.method201(true), arg1.method244(-26711), arg1.method226(255));
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)I", line = 169)
    public static final int method777(int arg0) {
        if (arg0 > -39) {
            method776(false, (class26) null);
        }
        field1810++;
        return 6;
    }
}
