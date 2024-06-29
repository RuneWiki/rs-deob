import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class154 {

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Ljd;")
    public static class85 field2661 = class221.method1499("<col=ff0000>", (byte) -45);

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field2663 = -1;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Ljd;")
    public static class85 field2665 = class221.method1499("(U1", (byte) 95);

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Ljd;")
    public static class85 field2659 = class221.method1499("AUS", (byte) -85);

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Ljd;")
    public static class85 field2660 = class221.method1499("<col=ffff00>", (byte) -71);

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "Ljd;")
    public static class85 field2670 = class221.method1499("RuneScape wird geladen )2 bitte warten)3)3)3", (byte) -88);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "Lge;")
    public static class68 field2667;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "[I")
    public static int[] field2666;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method1010(byte arg0) {
        field2660 = null;
        field2666 = null;
        field2659 = null;
        field2665 = null;
        field2670 = null;
        if (arg0 != 13) {
            field2665 = null;
        }
        field2667 = null;
        field2661 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ldb;B)V")
    public static final void method1011(class17 arg0, byte arg1) {
        field2658++;
        for (class185 var2 = (class185) class187.field3218.method110(64); var2 != null; var2 = (class185) class187.field3218.method117((byte) 63)) {
            if (var2.field3183 == arg0) {
                if (var2.field3182 != null) {
                    class247.field4249.method954(var2.field3182);
                    var2.field3182 = null;
                }
                var2.method1753(137);
                return;
            }
        }
        if (arg1 < 89) {
            field2659 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Ljd;")
    public static final class85 method1012(int arg0, int arg1) {
        if (arg0 > -122) {
            field2659 = null;
        }
        field2668++;
        return class184.field3161[arg1].method586(true) > 0 ? class172.method1150(new class85[] { class124.field2198[arg1], class148.field2518, class184.field3161[arg1] }, 0) : class124.field2198[arg1];
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZII[B[Lkc;)V")
    public static final void method1013(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4, class264[] arg5) {
        if (arg0 != 0) {
            return;
        }
        class247 var6 = new class247(arg4);
        field2657++;
        int var7 = -1;
        while (true) {
            int var8 = var6.method1718(32767);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1710(2006);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var6.method1711((byte) -67);
                int var13 = var12 >> 2;
                int var14 = var12 & 0x3;
                int var15 = var9 >> 12;
                int var16 = var9 >> 6 & 0x3F;
                int var17 = arg3 + var16;
                int var18 = arg2 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class264 var19 = null;
                    if (!arg1) {
                        int var20 = var15;
                        if ((class228.field3952[1][var17][var18] & 0x2) == 2) {
                            var20 = var15 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg5[var20];
                        }
                    }
                    class104.method719(arg1, var15, var7, var15, var18, var14, var19, 14013, var17, var13, !arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static final void method1014(int arg0) {
        field2669++;
        class218 var1 = (class218) class256.field4571.method110(arg0 ^ 0x7F);
        if (arg0 != 63) {
            field2662 = -40;
        }
        while (var1 != null) {
            if (var1.field3824 > 0) {
                var1.field3824--;
            }
            if (var1.field3824 != 0) {
                if (var1.field3839 > 0) {
                    var1.field3839--;
                }
                if (var1.field3839 == 0 && var1.field3830 >= 1 && var1.field3826 >= 1 && var1.field3830 <= 102 && var1.field3826 <= 102 && (var1.field3831 < 0 || class171.method1142(var1.field3829, 85, var1.field3831))) {
                    class116.method816(var1.field3819, (byte) 71, var1.field3830, var1.field3829, var1.field3821, var1.field3825, var1.field3826, var1.field3831);
                    var1.field3839 = -1;
                    if (var1.field3841 == var1.field3831 && var1.field3841 == -1) {
                        var1.method1753(arg0 + 74);
                    } else if (var1.field3841 == var1.field3831 && var1.field3838 == var1.field3825 && var1.field3829 == var1.field3823) {
                        var1.method1753(137);
                    }
                }
            } else if (var1.field3841 < 0 || class171.method1142(var1.field3823, 113, var1.field3841)) {
                class116.method816(var1.field3819, (byte) 14, var1.field3830, var1.field3823, var1.field3821, var1.field3838, var1.field3826, var1.field3841);
                var1.method1753(137);
            }
            var1 = (class218) class256.field4571.method117((byte) 55);
        }
    }
}
