import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class123 {

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Lv;")
    public static class146 field2855 = class159.method1226((byte) -37, "Untersuchen");

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Z")
    public static boolean field2859 = false;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lv;")
    public static class146 field2852 = class159.method1226((byte) -37, "headicons_hint");

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Lv;")
    public static class146 field2853 = class159.method1226((byte) -37, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Lv;")
    public static class146 field2861 = class159.method1226((byte) -37, "Versteckt");

    @OriginalMember(owner = "client!re", name = "m", descriptor = "[[I")
    public static int[][] field2864 = new int[5][5000];

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Lv;")
    public static class146 field2856 = class159.method1226((byte) -37, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!re", name = "p", descriptor = "[I")
    public static int[] field2867 = new int[5];

    @OriginalMember(owner = "client!re", name = "n", descriptor = "[Z")
    public static boolean[] field2865 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Lla;")
    public static class77 field2858;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "Lla;")
    public static class77 field2866;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
    public static void method924(boolean arg0) {
        field2861 = null;
        field2867 = null;
        field2853 = null;
        field2855 = null;
        field2856 = null;
        field2852 = null;
        field2866 = null;
        if (arg0) {
            method925((byte) -36);
        }
        field2864 = null;
        field2865 = null;
        field2858 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static final void method925(byte arg0) {
        int var1 = 43 / ((-arg0 - 27) / 56);
        class98 var2 = class6.field150;
        synchronized (class6.field150) {
            class121.field2811 = class155.field3532;
            if (class134.field3052 >= 0) {
                while (class97.field2347 != class134.field3052) {
                    int var4 = class15.field240[class97.field2347];
                    class97.field2347 = class97.field2347 + 1 & 0x7F;
                    if (var4 < 0) {
                        class51.field1150[~var4] = false;
                    } else {
                        class51.field1150[var4] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class51.field1150[var3] = false;
                }
                class134.field3052 = class97.field2347;
            }
            class155.field3532 = client.field351;
        }
        field2860++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIBII)V")
    public static final void method926(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2862++;
        int var6 = class66.field1496.method1168(arg1, arg0, arg4);
        if (var6 != 0) {
            int var7 = class66.field1496.method1196(arg1, arg0, arg4, var6);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg5;
            if (var6 > 0) {
                var10 = arg2;
            }
            int[] var11 = class124.field2879.field1411;
            int var12 = (103 - arg4) * 2048 + arg0 * 4 + 24624;
            int var13 = var6 >> 14 & 0x7FFF;
            class69 var14 = class124.method928(-1, var13);
            if (var14.field1565 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 515] = var10;
                        var11[var12 + 1027] = var10;
                        var11[var12 + 1539] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1537] = var10;
                        var11[var12 + 1536 + 2] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 512 + 3] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 1539] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1537] = var10;
                        var11[var12 + 2 + 1536] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
            } else {
                class144 var15 = class35.field746[var14.field1565];
                if (var15 != null) {
                    int var16 = (var14.field1584 * 4 - var15.field3280) / 2;
                    int var17 = (var14.field1597 * 4 - var15.field3287) / 2;
                    var15.method1065(arg0 * 4 + var16 + 48, (-var14.field1597 + -arg4 + 104) * 4 + var17 + 48);
                }
            }
        }
        if (arg3 > -83) {
            return;
        }
        int var18 = class66.field1496.method1204(arg1, arg0, arg4);
        if (var18 != 0) {
            int var19 = class66.field1496.method1196(arg1, arg0, arg4, var18);
            int var20 = var19 >> 6 & 0x3;
            int var21 = var19 & 0x1F;
            int var22 = var18 >> 14 & 0x7FFF;
            class69 var23 = class124.method928(-1, var22);
            if (var23.field1565 != -1) {
                class144 var24 = class35.field746[var23.field1565];
                if (var24 != null) {
                    int var25 = (var23.field1584 * 4 - var24.field3280) / 2;
                    int var26 = (var23.field1597 * 4 - var24.field3287) / 2;
                    var24.method1065(arg0 * 4 + var25 + 48, (104 - (var23.field1597 + arg4)) * 4 + var26 + 48);
                }
            } else if (var21 == 9) {
                int var27 = 15658734;
                if (var18 > 0) {
                    var27 = 15597568;
                }
                int[] var28 = class124.field2879.field1411;
                int var29 = arg0 * 4 + (52736 - arg4 * 512) * 4 + 24624;
                if (var20 == 0 || var20 == 2) {
                    var28[var29 + 1536] = var27;
                    var28[var29 + 1024 + 1] = var27;
                    var28[var29 + 514] = var27;
                    var28[var29 + 3] = var27;
                } else {
                    var28[var29] = var27;
                    var28[var29 + 512 + 1] = var27;
                    var28[var29 + 2 + 1024] = var27;
                    var28[var29 + 1539] = var27;
                }
            }
        }
        int var30 = class66.field1496.method1180(arg1, arg0, arg4);
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class69 var32 = class124.method928(-1, var31);
        if (var32.field1565 == -1) {
            return;
        }
        class144 var33 = class35.field746[var32.field1565];
        if (var33 != null) {
            int var34 = (var32.field1584 * 4 - var33.field3280) / 2;
            int var35 = (var32.field1597 * 4 - var33.field3287) / 2;
            var33.method1065(arg0 * 4 + var34 + 48, (-arg4 + 104 + -var32.field1597) * 4 + 48 - -var35);
            return;
        }
    }
}
