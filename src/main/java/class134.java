import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class134 extends class203 {

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "Lmh;")
    public static class62 field2175 = class201.method1405(true, "blaugr-Un:");

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "I")
    public static int field2184 = 0;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "Lmh;")
    private static class62 field2185 = class201.method1405(true, "World");

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "Lmh;")
    public static class62 field2181 = field2185;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "[[I")
    public static int[][] field2179 = new int[104][104];

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "Z")
    public static boolean field2187 = false;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "[J")
    public static long[] field2186 = new long[32];

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "I")
    public static int field2188 = -1;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "Lmh;")
    public static class62 field2176 = class201.method1405(true, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!nb", name = "W", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!nb", name = "V", descriptor = "Led;")
    private class49 field2190;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)I", line = 4)
    public final int method1010(int arg0, int arg1, int arg2) {
        field2183++;
        if (this.field2190 == null) {
            return arg2;
        }
        if (arg0 != -2) {
            method1015((byte) -63);
        }
        class173 var4 = (class173) this.field2190.method311((byte) 114, (long) arg1);
        return var4 == null ? arg2 : var4.field2796;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIILjm;IZJ)Z", line = 28)
    public static final boolean method1011(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class123 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class41.field632 == class37.field569;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class114.field1900 || var16 >= class252.field4273) {
                    return false;
                }
                class166 var17 = class256.field4320[arg0][var15][var16];
                if (var17 != null && var17.field2724 >= 5) {
                    return false;
                }
            }
        }
        class164 var18 = new class164();
        var18.field2668 = arg11;
        var18.field2660 = arg0;
        var18.field2659 = arg5;
        var18.field2663 = arg6;
        var18.field2667 = arg7;
        var18.field2672 = arg8;
        var18.field2665 = arg9;
        var18.field2651 = arg1;
        var18.field2670 = arg2;
        var18.field2661 = arg1 + arg3 - 1;
        var18.field2657 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class256.field4320[var22][var19][var20] == null) {
                        class256.field4320[var22][var19][var20] = new class166(var22, var19, var20);
                    }
                }
                class166 var23 = class256.field4320[arg0][var19][var20];
                var23.field2713[var23.field2724] = var18;
                var23.field2726[var23.field2724] = var21;
                var23.field2715 |= var21;
                var23.field2724++;
                if (var13 && class96.field1563[var19][var20] != 0) {
                    var14 = class96.field1563[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class96.field1563[var24][var25] == 0) {
                        class96.field1563[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class208.field3531[class143.field2276++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BILmh;)Lmh;", line = 162)
    public final class62 method1012(byte arg0, int arg1, class62 arg2) {
        field2177++;
        if (arg0 != -94) {
            field2185 = (class62) null;
        }
        if (this.field2190 == null) {
            return arg2;
        } else {
            class113 var4 = (class113) this.field2190.method311((byte) 114, (long) arg1);
            return var4 == null ? arg2 : var4.field1867;
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V", line = 199)
    public static final void method1013(int arg0) {
        class304.field5228.method1395((byte) -43);
        if (arg0 == -24910) {
            class54.field785.method1395((byte) -43);
            field2178++;
            class301.field5182.method1395((byte) -43);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLmi;)V", line = 219)
    public final void method1014(byte arg0, class92 arg1) {
        while (true) {
            int var3 = arg1.method702(-1);
            if (var3 == 0) {
                if (arg0 < 41) {
                    field2181 = (class62) null;
                }
                field2182++;
                return;
            }
            this.method1017(-2539, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(B)V", line = 250)
    public static final void method1015(byte arg0) {
        class294.field5010 = 0;
        field2191++;
        class258.field4354 = 0;
        class272.method1864(21);
        class99.method790(91);
        class7.method31(-10004);
        class38.method262(-32244);
        for (int var1 = 0; var1 < class258.field4354; var1++) {
            int var2 = class97.field1597[var1];
            if (class199.field3367 != class5.field50[var2].field3854) {
                if (class5.field50[var2].field2417 > 0) {
                    class107.method828((byte) 102, class5.field50[var2]);
                }
                class5.field50[var2] = null;
            }
        }
        if (class60.field874 != class75.field1223.field1476) {
            throw new RuntimeException("gpp1 pos:" + class75.field1223.field1476 + " psize:" + class60.field874);
        }
        int var3 = 0;
        if (arg0 >= -39) {
            method1016(-81);
        }
        while (class118.field1975 > var3) {
            if (class5.field50[class98.field1617[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class118.field1975);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)V", line = 303)
    public static void method1016(int arg0) {
        field2185 = null;
        field2181 = null;
        field2176 = null;
        field2175 = null;
        if (arg0 >= -98) {
            method1011(58, 102, 122, 93, -50, 4, 4, 88, (class123) null, -33, false, -46L);
        }
        field2186 = null;
        field2179 = (int[][]) null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILmi;I)V", line = 318)
    private final void method1017(int arg0, class92 arg1, int arg2) {
        field2180++;
        if (arg2 == 249) {
            int var4 = arg1.method702(arg0 ^ 0x9EA);
            if (this.field2190 == null) {
                int var5 = class229.method1622(true, var4);
                this.field2190 = new class49(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method702(-1) == 1;
                int var8 = arg1.method737(arg0 + 2538);
                class206 var9;
                if (var7) {
                    var9 = new class113(arg1.method696((byte) -87));
                } else {
                    var9 = new class173(arg1.method704(1509947792));
                }
                this.field2190.method309(var9, (long) var8, 1);
            }
        }
        if (arg0 != -2539) {
            field2185 = (class62) null;
        }
    }
}
