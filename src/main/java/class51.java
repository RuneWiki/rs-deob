import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class51 {

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field826 = 0;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Lha;")
    public static class182 field824 = class270.method1819(-12513);

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Ljava/lang/String;")
    public static String field827 = "glow1:";

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Ljava/lang/String;")
    public static String field829 = "purple:";

    @OriginalMember(owner = "client!we", name = "k", descriptor = "[J")
    public static long[] field831 = new long[100];

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field836 = -1;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field832 = 0;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "Ljava/lang/String;")
    public static String field838 = null;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Lpk;")
    public static class237 field837;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "[I")
    public static int[] field841;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "[Lbk;")
    public static class46[] field830;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "[[[B")
    public static byte[][][] field834;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIZII)V")
    public static final void method383(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field822++;
        class222.method1519((byte) -122, arg4 - arg5, class241.field3751[arg0], arg4 + arg5, arg1);
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg5 * arg5;
        int var9 = arg2 * arg2;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        if (!arg3) {
            method386(102, -51);
        }
        int var12 = arg2 << 1;
        int var13 = var9 - ((var12 - 1) * var10);
        int var14 = (1 - var12) * var8 + var11;
        int var15 = var9 << 2;
        int var16 = ((var6 << 1) + 3) * var11;
        int var17 = var8 << 2;
        int var18 = ((arg2 << 1) - 3) * var10;
        int var19 = (var6 + 1) * var15;
        int var20 = (arg2 - 1) * var17;
        while (var7 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var14 += var16;
                    var16 += var15;
                    var13 += var19;
                    var6++;
                    var19 += var15;
                }
            }
            if (var13 < 0) {
                var13 += var19;
                var19 += var15;
                var14 += var16;
                var6++;
                var16 += var15;
            }
            int var21 = arg4 - var6;
            var13 += -var18;
            var14 += -var20;
            var20 -= var17;
            var18 -= var17;
            var7--;
            int var22 = arg4 + var6;
            int var23 = arg0 + var7;
            int var24 = arg0 - var7;
            class222.method1519((byte) -109, var21, class241.field3751[var24], var22, arg1);
            class222.method1519((byte) -111, var21, class241.field3751[var23], var22, arg1);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lpk;ZLpk;Lpk;)V")
    public static final void method384(class237 arg0, boolean arg1, class237 arg2, class237 arg3) {
        field821++;
        class198.field2982 = arg3;
        if (!arg1) {
            field841 = null;
        }
        class69.field1149 = arg0;
        class197.field2981 = arg2;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ldg;I)I")
    public static final int method385(class87 arg0, int arg1) {
        int var2 = 91 / ((arg1 + 19) / 63);
        field823++;
        class189 var3 = arg0.field1323;
        if (var3.field2829 != null) {
            var3 = var3.method1257(-32207);
            if (var3 == null) {
                return -1;
            }
        }
        int var4 = var3.field2832;
        class110 var5 = arg0.method165((byte) 83);
        if (arg0.field399 == var5.field1651) {
            var4 = var3.field2856;
        } else if (arg0.field399 == var5.field1636 || arg0.field399 == var5.field1634 || arg0.field399 == var5.field1642 || arg0.field399 == var5.field1646) {
            var4 = var3.field2845;
        } else if (arg0.field399 == var5.field1650 || arg0.field399 == var5.field1658 || arg0.field399 == var5.field1670 || arg0.field399 == var5.field1652) {
            var4 = var3.field2838;
        }
        return var4;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)I")
    public static final int method386(int arg0, int arg1) {
        field828++;
        if (arg1 != -3) {
            field830 = null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)I")
    public static final int method387(int arg0, int arg1) {
        field825++;
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xEA) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return arg0 == -16755 ? 0 : 64;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method388(int arg0) {
        if (arg0 > -11) {
            return;
        }
        field830 = null;
        field827 = null;
        field834 = null;
        field838 = null;
        field831 = null;
        field841 = null;
        field824 = null;
        field829 = null;
        field837 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lpk;I)V")
    public static final void method389(class237 arg0, int arg1) {
        field835++;
        class9.field104 = arg0.method1621("p11_full", 1);
        class114.field1744 = arg0.method1621("p12_full", arg1 - 560447808);
        class76.field1209 = arg0.method1621("b12_full", 1);
        class45.field780 = arg0.method1621("mapfunction", 1);
        class122.field1812 = arg0.method1621("hitmarks", 1);
        class155.field2261 = arg0.method1621("hitbar_default", 1);
        class42.field739 = arg0.method1621("headicons_pk", 1);
        class215.field3305 = arg0.method1621("headicons_prayer", 1);
        field833 = arg0.method1621("hint_headicons", arg1 ^ 0x2167C140);
        if (arg1 != 560447809) {
            method387(-46, -58);
        }
        class3.field46 = arg0.method1621("hint_mapmarkers", arg1 ^ 0x2167C140);
        class245.field3798 = arg0.method1621("mapflag", 1);
        class105.field1549 = arg0.method1621("cross", 1);
        class206.field3092 = arg0.method1621("mapdots", arg1 - 560447808);
        class55.field929 = arg0.method1621("scrollbar", 1);
        class224.field3511 = arg0.method1621("name_icons", 1);
        class12.field177 = arg0.method1621("floorshadows", 1);
        class260.field3984 = arg0.method1621("compass", 1);
        class134.field1964 = arg0.method1621("hint_mapedge", 1);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    public static final void method390(int arg0) {
        field840++;
        int[] var1 = new int[class152.field2218];
        if (arg0 < 10) {
            method384((class237) null, true, (class237) null, (class237) null);
        }
        int var2 = 0;
        for (int var3 = 0; var3 < class152.field2218; var3++) {
            class15 var5 = class140.method951((byte) -94, var3);
            if (var5.field264 >= 0 || var5.field289 >= 0) {
                var1[var2++] = var3;
            }
        }
        class248.field3851 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class248.field3851[var4] = var1[var4];
        }
    }
}
