import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class54 {

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "Ldl;")
    private class31 field925 = new class31(256);

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "Ldl;")
    private class31 field933 = new class31(256);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Lhi;")
    private class250 field918;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Lhi;")
    private class250 field929;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "Lli;")
    private static class185 field919 = class245.method1649("skill: ", -60);

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "Lli;")
    public static class185 field932 = class245.method1649("<col=ffff00>", 127);

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "Lli;")
    public static class185 field924 = class245.method1649("Memory after cleanup=", -42);

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "Lli;")
    public static class185 field930 = class245.method1649("www", 127);

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "Lli;")
    public static class185 field928 = field919;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "Lli;")
    public static class185 field934 = class245.method1649("M", 123);

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjd;)Ltj;")
    public static final class152 method368(int arg0, class118 arg1) {
        class152 var2 = new class152();
        if (arg0 < 30) {
            method370(105);
        }
        var2.field2875 = arg1.method827(255);
        field921++;
        var2.field2876 = class90.method593((byte) -120, var2.field2875);
        return var2;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III[I)Lsa;")
    private final class91 method369(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = arg2 ^ (arg1 << 4 & 0xFFF3 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        field923++;
        class91 var9 = (class91) this.field933.method195(43, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class11 var10 = class11.method101(this.field918, arg1, arg2);
            if (var10 == null) {
                return null;
            }
            class91 var11 = var10.method99();
            this.field933.method190(var11, (byte) -99, var7);
            if (arg0 != 16566) {
                method368(69, (class118) null);
            }
            if (arg3 != null) {
                arg3[0] -= var11.field1761.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public static void method370(int arg0) {
        if (arg0 != 2) {
            field930 = null;
        }
        field934 = null;
        field919 = null;
        field932 = null;
        field928 = null;
        field930 = null;
        field924 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B[II)Lsa;")
    public final class91 method371(byte arg0, int[] arg1, int arg2) {
        field922++;
        if (this.field918.method1699((byte) 16) == 1) {
            return this.method369(16566, 0, arg2, arg1);
        } else if (this.field918.method1693(arg2, 0) == 1) {
            return this.method369(16566, arg2, 0, arg1);
        } else {
            int var4 = -77 % ((arg0 + 33) / 63);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II[II)Lsa;")
    private final class91 method372(int arg0, int arg1, int[] arg2, int arg3) {
        field926++;
        int var5 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFF8);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class91 var9 = (class91) this.field933.method195(108, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            if (arg3 != 1411) {
                field919 = null;
            }
            class277 var10 = (class277) this.field925.method195(49, var7);
            if (var10 == null) {
                var10 = class277.method1904(this.field929, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field925.method190(var10, (byte) -125, var7);
            }
            class91 var11 = var10.method1898(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method476(80);
                this.field933.method190(var11, (byte) -116, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB[I)Lsa;")
    public final class91 method373(int arg0, byte arg1, int[] arg2) {
        field927++;
        int var4 = 54 % ((arg1 - 60) / 60);
        if (this.field929.method1699((byte) 16) == 1) {
            return this.method372(arg0, 0, arg2, 1411);
        } else if (this.field929.method1693(arg0, 0) == 1) {
            return this.method372(0, arg0, arg2, 1411);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILoc;)V")
    public static final void method374(int arg0, int arg1, class121 arg2) {
        field920++;
        Object[] var3 = arg2.field2198;
        int var4 = (Integer) var3[0];
        class207 var5 = class232.method1588(-97, var4);
        if (var5 == null) {
            return;
        }
        class207.field3808 = 0;
        int var6 = arg0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field3795;
        int[] var10 = var5.field3813;
        byte var11 = -1;
        try {
            class12.field214 = new class185[var5.field3792];
            int var12 = 0;
            class187.field3473 = new int[var5.field3790];
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg2.field2204;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg2.field2197;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg2.field2196 == null ? -1 : arg2.field2196.field1579;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg2.field2201;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg2.field2196 == null ? -1 : arg2.field2196.field1637;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg2.field2207 == null ? -1 : arg2.field2207.field1579;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg2.field2207 == null ? -1 : arg2.field2207.field1637;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg2.field2200;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg2.field2199;
                    }
                    class187.field3473[var12++] = var15;
                } else if (var3[var14] instanceof class185) {
                    class185 var16 = (class185) var3[var14];
                    if (var16.method1329(class82.field1583, (byte) 22)) {
                        var16 = arg2.field2206;
                    }
                    class12.field214[var13++] = var16;
                }
            }
            int var17 = 0;
            label3865: while (true) {
                var17++;
                if (var17 > arg1) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var503 = var10[var8];
                if (var503 < 100) {
                    if (var503 == 0) {
                        class23.field383[var6++] = var9[var8];
                        continue;
                    }
                    if (var503 == 1) {
                        int var18 = var9[var8];
                        class23.field383[var6++] = class59.field1059[var18];
                        continue;
                    }
                    if (var503 == 2) {
                        int var19 = var9[var8];
                        var6--;
                        class171.method1218(class23.field383[var6], arg0 + 59, var19);
                        continue;
                    }
                    if (var503 == 3) {
                        class142.field2678[var7++] = var5.field3804[var8];
                        continue;
                    }
                    if (var503 == 6) {
                        var8 += var9[var8];
                        continue;
                    }
                    if (var503 == 7) {
                        var6 -= 2;
                        if (class23.field383[var6 + 1] != class23.field383[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var503 == 8) {
                        var6 -= 2;
                        if (class23.field383[var6 + 1] == class23.field383[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var503 == 9) {
                        var6 -= 2;
                        if (class23.field383[var6 + 1] > class23.field383[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var503 == 10) {
                        var6 -= 2;
                        if (class23.field383[var6 + 1] < class23.field383[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var503 == 21) {
                        if (class207.field3808 == 0) {
                            return;
                        }
                        class203 var20 = class243.field4339[--class207.field3808];
                        var8 = var20.field3708;
                        var5 = var20.field3714;
                        class187.field3473 = var20.field3718;
                        var10 = var5.field3813;
                        var9 = var5.field3795;
                        class12.field214 = var20.field3709;
                        continue;
                    }
                    if (var503 == 25) {
                        int var21 = var9[var8];
                        class23.field383[var6++] = class132.method939(0, var21);
                        continue;
                    }
                    if (var503 == 27) {
                        int var22 = var9[var8];
                        var6--;
                        class140.method1007(class23.field383[var6], 9179409, var22);
                        continue;
                    }
                    if (var503 == 31) {
                        var6 -= 2;
                        if (class23.field383[var6 + 1] >= class23.field383[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var503 == 32) {
                        var6 -= 2;
                        if (class23.field383[var6] >= class23.field383[var6 + 1]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var503 == 33) {
                        class23.field383[var6++] = class187.field3473[var9[var8]];
                        continue;
                    }
                    int var10001;
                    if (var503 == 34) {
                        var10001 = var9[var8];
                        var6--;
                        class187.field3473[var10001] = class23.field383[var6];
                        continue;
                    }
                    if (var503 == 35) {
                        class142.field2678[var7++] = class12.field214[var9[var8]];
                        continue;
                    }
                    if (var503 == 36) {
                        var10001 = var9[var8];
                        var7--;
                        class12.field214[var10001] = class142.field2678[var7];
                        continue;
                    }
                    if (var503 == 37) {
                        int var23 = var9[var8];
                        var7 -= var23;
                        class185 var24 = client.method1506(class142.field2678, var7, var23, arg0 - 119);
                        class142.field2678[var7++] = var24;
                        continue;
                    }
                    if (var503 == 38) {
                        var6--;
                        continue;
                    }
                    if (var503 == 39) {
                        var7--;
                        continue;
                    }
                    if (var503 == 40) {
                        int var25 = var9[var8];
                        class207 var26 = class232.method1588(-97, var25);
                        int[] var27 = new int[var26.field3790];
                        class185[] var28 = new class185[var26.field3792];
                        for (int var29 = 0; var29 < var26.field3791; var29++) {
                            var27[var29] = class23.field383[var6 + var29 - var26.field3791];
                        }
                        for (int var30 = 0; var30 < var26.field3806; var30++) {
                            var28[var30] = class142.field2678[var7 + var30 - var26.field3806];
                        }
                        var7 -= var26.field3806;
                        var6 -= var26.field3791;
                        class203 var31 = new class203();
                        var31.field3708 = var8;
                        var31.field3714 = var5;
                        var31.field3709 = class12.field214;
                        var31.field3718 = class187.field3473;
                        if (class243.field4339.length <= class207.field3808) {
                            throw new RuntimeException();
                        }
                        var5 = var26;
                        var8 = -1;
                        class243.field4339[class207.field3808++] = var31;
                        var9 = var26.field3795;
                        var10 = var26.field3813;
                        class12.field214 = var28;
                        class187.field3473 = var27;
                        continue;
                    }
                    if (var503 == 42) {
                        class23.field383[var6++] = class70.field1230[var9[var8]];
                        continue;
                    }
                    if (var503 == 43) {
                        int var32 = var9[var8];
                        var6--;
                        class70.field1230[var32] = class23.field383[var6];
                        class75.method488((byte) -37, var32);
                        continue;
                    }
                    if (var503 == 44) {
                        int var33 = var9[var8] & 0xFFFF;
                        int var34 = var9[var8] >> 16;
                        var6--;
                        int var35 = class23.field383[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            class243.field4350[var34] = var35;
                            byte var36 = -1;
                            if (var33 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var35) {
                                    continue label3865;
                                }
                                class158.field2990[var34][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var503 == 45) {
                        int var38 = var9[var8];
                        var6--;
                        int var39 = class23.field383[var6];
                        if (var39 >= 0 && var39 < class243.field4350[var38]) {
                            class23.field383[var6++] = class158.field2990[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var503 == 46) {
                        var6 -= 2;
                        int var40 = var9[var8];
                        int var41 = class23.field383[var6];
                        if (var41 >= 0 && class243.field4350[var40] > var41) {
                            class158.field2990[var40][var41] = class23.field383[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var503 == 47) {
                        class185 var42 = class256.field4530[var9[var8]];
                        if (var42 == null) {
                            var42 = class204.field3732;
                        }
                        class142.field2678[var7++] = var42;
                        continue;
                    }
                    if (var503 == 48) {
                        int var43 = var9[var8];
                        var7--;
                        class256.field4530[var43] = class142.field2678[var7];
                        class37.method238(var43, 2);
                        continue;
                    }
                    if (var503 == 51) {
                        class31 var44 = var5.field3811[var9[var8]];
                        var6--;
                        class13 var45 = (class13) var44.method195(99, (long) class23.field383[var6]);
                        if (var45 != null) {
                            var8 += var45.field226;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var9[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var503 < 300) {
                    if (var503 == 100) {
                        var6 -= 3;
                        int var47 = class23.field383[var6];
                        int var48 = class23.field383[var6 + 1];
                        int var49 = class23.field383[var6 + 2];
                        if (var48 == 0) {
                            throw new RuntimeException();
                        }
                        class82 var50 = class116.method805(1, var47);
                        if (var50.field1536 == null) {
                            var50.field1536 = new class82[var49 + 1];
                        }
                        if (var49 >= var50.field1536.length) {
                            class82[] var51 = new class82[var49 + 1];
                            for (int var52 = 0; var52 < var50.field1536.length; var52++) {
                                var51[var52] = var50.field1536[var52];
                            }
                            var50.field1536 = var51;
                        }
                        if (var49 > 0 && var50.field1536[var49 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var49 - 1));
                        }
                        class82 var53 = new class82();
                        var53.field1637 = var49;
                        var53.field1572 = true;
                        var53.field1580 = var53.field1579 = var50.field1579;
                        var53.field1612 = var48;
                        var50.field1536[var49] = var53;
                        if (var46) {
                            class23.field379 = var53;
                        } else {
                            class102.field1859 = var53;
                        }
                        class229.method1581(var50, false);
                        continue;
                    }
                    if (var503 == 101) {
                        class82 var54 = var46 ? class23.field379 : class102.field1859;
                        if (var54.field1637 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class82 var55 = class116.method805(1, var54.field1579);
                        var55.field1536[var54.field1637] = null;
                        class229.method1581(var55, false);
                        continue;
                    }
                    if (var503 == 102) {
                        var6--;
                        class82 var56 = class116.method805(1, class23.field383[var6]);
                        var56.field1536 = null;
                        class229.method1581(var56, false);
                        continue;
                    }
                    if (var503 == 200) {
                        var6 -= 2;
                        int var57 = class23.field383[var6];
                        int var58 = class23.field383[var6 + 1];
                        class82 var59 = class157.method1115(6684, var57, var58);
                        if (var59 != null && var58 != -1) {
                            class23.field383[var6++] = 1;
                            if (var46) {
                                class23.field379 = var59;
                            } else {
                                class102.field1859 = var59;
                            }
                            continue;
                        }
                        class23.field383[var6++] = 0;
                        continue;
                    }
                    if (var503 == 201) {
                        var6--;
                        int var60 = class23.field383[var6];
                        class82 var61 = class116.method805(1, var60);
                        if (var61 == null) {
                            class23.field383[var6++] = 0;
                        } else {
                            class23.field383[var6++] = 1;
                            if (var46) {
                                class23.field379 = var61;
                            } else {
                                class102.field1859 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var503 < 500) {
                    if (var503 == 403) {
                        var6 -= 2;
                        int var62 = class23.field383[var6];
                        if (var62 >= 7) {
                            var62 -= 7;
                        }
                        int var63 = class23.field383[var6 + 1];
                        class241.field4310.field3478.method1740(var62, Integer.MIN_VALUE, var63);
                        continue;
                    }
                    if (var503 == 404) {
                        var6 -= 2;
                        int var64 = class23.field383[var6 + 1];
                        int var65 = class23.field383[var6];
                        class241.field4310.field3478.method1737(-1, var64, var65);
                        continue;
                    }
                    if (var503 == 410) {
                        var6--;
                        boolean var66 = class23.field383[var6] != 0;
                        class241.field4310.field3478.method1736(false, var66);
                        continue;
                    }
                } else {
                    int var10000;
                    if (!(var503 < 1000 || var503 >= 1100) || !(var503 < 2000 || var503 >= 2100)) {
                        class82 var491;
                        if (var503 < 2000) {
                            var491 = var46 ? class23.field379 : class102.field1859;
                        } else {
                            var503 -= 1000;
                            var10000 = arg0 + 1;
                            var6--;
                            var491 = class116.method805(var10000, class23.field383[var6]);
                        }
                        if (var503 == 1000) {
                            var6 -= 4;
                            var491.field1635 = class23.field383[var6];
                            var491.field1625 = class23.field383[var6 + 1];
                            int var492 = class23.field383[var6 + 2];
                            int var493 = class23.field383[var6 + 3];
                            if (var492 < 0) {
                                var492 = 0;
                            } else if (var492 > 5) {
                                var492 = 5;
                            }
                            if (var493 < 0) {
                                var493 = 0;
                            } else if (var493 > 5) {
                                var493 = 5;
                            }
                            var491.field1543 = (byte) var492;
                            var491.field1597 = (byte) var493;
                            class229.method1581(var491, false);
                            class272.method1864(-6938, var491);
                            if (var491.field1637 == -1) {
                                class242.method1640(var491.field1579, 80);
                            }
                            continue;
                        }
                        if (var503 == 1001) {
                            var6 -= 4;
                            var491.field1566 = class23.field383[var6];
                            var491.field1481 = class23.field383[var6 + 1];
                            var491.field1643 = 0;
                            var491.field1632 = 0;
                            int var494 = class23.field383[var6 + 3];
                            int var495 = class23.field383[var6 + 2];
                            if (var495 < 0) {
                                var495 = 0;
                            } else if (var495 > 4) {
                                var495 = 4;
                            }
                            var491.field1525 = (byte) var495;
                            if (var494 < 0) {
                                var494 = 0;
                            } else if (var494 > 4) {
                                var494 = 4;
                            }
                            var491.field1571 = (byte) var494;
                            class229.method1581(var491, false);
                            class272.method1864(arg0 - 6938, var491);
                            if (var491.field1612 == 0) {
                                class116.method809(arg0 ^ 0x6C3B3150, var491, false);
                            }
                            continue;
                        }
                        if (var503 == 1003) {
                            var6--;
                            boolean var496 = class23.field383[var6] == 1;
                            if (var491.field1495 != var496) {
                                var491.field1495 = var496;
                                class229.method1581(var491, false);
                            }
                            if (var491.field1637 == -1) {
                                class59.method408(-49, var491.field1579);
                            }
                            continue;
                        }
                        if (var503 == 1004) {
                            var6 -= 2;
                            var491.field1541 = class23.field383[var6];
                            var491.field1527 = class23.field383[var6 + 1];
                            class229.method1581(var491, false);
                            class272.method1864(-6938, var491);
                            if (var491.field1612 == 0) {
                                class116.method809(1815818576, var491, false);
                            }
                            continue;
                        }
                        if (var503 == 1005) {
                            var6--;
                            var491.field1487 = class23.field383[var6] == 1;
                            continue;
                        }
                    } else if (!(var503 < 1100 || var503 >= 1200) || !(var503 < 2100 || var503 >= 2200)) {
                        class82 var488;
                        if (var503 >= 2000) {
                            var6--;
                            var488 = class116.method805(1, class23.field383[var6]);
                            var503 -= 1000;
                        } else {
                            var488 = var46 ? class23.field379 : class102.field1859;
                        }
                        if (var503 == 1100) {
                            var6 -= 2;
                            var488.field1565 = class23.field383[var6];
                            if (var488.field1565 > var488.field1628 - var488.field1505) {
                                var488.field1565 = var488.field1628 - var488.field1505;
                            }
                            if (var488.field1565 < 0) {
                                var488.field1565 = 0;
                            }
                            var488.field1590 = class23.field383[var6 + 1];
                            if (var488.field1590 > var488.field1552 - var488.field1498) {
                                var488.field1590 = var488.field1552 - var488.field1498;
                            }
                            if (var488.field1590 < 0) {
                                var488.field1590 = 0;
                            }
                            class229.method1581(var488, false);
                            if (var488.field1637 == -1) {
                                class82.method539(-1, var488.field1579);
                            }
                            continue;
                        }
                        if (var503 == 1101) {
                            var6--;
                            var488.field1594 = class23.field383[var6];
                            class229.method1581(var488, false);
                            if (var488.field1637 == -1) {
                                class36.method222(-122, var488.field1579);
                            }
                            continue;
                        }
                        if (var503 == 1102) {
                            var6--;
                            var488.field1578 = class23.field383[var6] == 1;
                            class229.method1581(var488, false);
                            continue;
                        }
                        if (var503 == 1103) {
                            var6--;
                            var488.field1512 = class23.field383[var6];
                            class229.method1581(var488, false);
                            continue;
                        }
                        if (var503 == 1104) {
                            var6--;
                            var488.field1598 = class23.field383[var6];
                            class229.method1581(var488, false);
                            continue;
                        }
                        if (var503 == 1105) {
                            var6--;
                            var488.field1483 = class23.field383[var6];
                            class229.method1581(var488, false);
                            continue;
                        }
                        if (var503 == 1106) {
                            var6--;
                            var488.field1640 = class23.field383[var6];
                            class229.method1581(var488, false);
                            continue;
                        }
                        if (var503 == 1107) {
                            var6--;
                            var488.field1564 = class23.field383[var6] == 1;
                            class229.method1581(var488, false);
                            continue;
                        }
                        if (var503 == 1108) {
                            var488.field1626 = 1;
                            var6--;
                            var488.field1521 = class23.field383[var6];
                            class229.method1581(var488, false);
                            if (var488.field1637 == -1) {
                                class46.method285(~arg0, var488.field1579);
                            }
                            continue;
                        }
                        if (var503 == 1109) {
                            var6 -= 6;
                            var488.field1529 = class23.field383[var6];
                            var488.field1645 = class23.field383[var6 + 1];
                            var488.field1563 = class23.field383[var6 + 2];
                            var488.field1556 = class23.field383[var6 + 3];
                            var488.field1520 = class23.field383[var6 + 4];
                            var488.field1605 = class23.field383[var6 + 5];
                            class229.method1581(var488, false);
                            if (var488.field1637 == -1) {
                                class6.method76(var488.field1579, -22746);
                                class182.method1284((byte) -105, var488.field1579);
                            }
                            continue;
                        }
                        if (var503 == 1110) {
                            var6--;
                            int var489 = class23.field383[var6];
                            if (var488.field1524 != var489) {
                                var488.field1524 = var489;
                                var488.field1607 = 0;
                                var488.field1503 = 0;
                                class229.method1581(var488, false);
                            }
                            if (var488.field1637 == -1) {
                                class207.method1470(var488.field1579, (byte) 78);
                            }
                            continue;
                        }
                        if (var503 == 1111) {
                            var6--;
                            var488.field1519 = class23.field383[var6] == 1;
                            class229.method1581(var488, false);
                            continue;
                        }
                        if (var503 == 1112) {
                            var7--;
                            class185 var490 = class142.field2678[var7];
                            if (!var490.method1329(var488.field1555, (byte) 22)) {
                                var488.field1555 = var490;
                                class229.method1581(var488, false);
                            }
                            if (var488.field1637 == -1) {
                                class46.method286(var488.field1579, 0);
                            }
                            continue;
                        }
                        if (var503 == 1113) {
                            var6--;
                            var488.field1528 = class23.field383[var6];
                            class229.method1581(var488, false);
                            continue;
                        }
                        if (var503 == 1114) {
                            var6 -= 3;
                            var488.field1623 = class23.field383[var6];
                            var488.field1577 = class23.field383[var6 + 1];
                            var488.field1601 = class23.field383[var6 + 2];
                            class229.method1581(var488, false);
                            continue;
                        }
                        if (var503 == 1115) {
                            var6--;
                            var488.field1544 = class23.field383[var6] == 1;
                            class229.method1581(var488, false);
                            continue;
                        }
                        if (var503 == 1116) {
                            var6--;
                            var488.field1490 = class23.field383[var6];
                            class229.method1581(var488, false);
                            continue;
                        }
                        if (var503 == 1117) {
                            var6--;
                            var488.field1494 = class23.field383[var6];
                            class229.method1581(var488, false);
                            continue;
                        }
                        if (var503 == 1118) {
                            var6--;
                            var488.field1567 = class23.field383[var6] == 1;
                            class229.method1581(var488, false);
                            continue;
                        }
                        if (var503 == 1119) {
                            var6--;
                            var488.field1642 = class23.field383[var6] == 1;
                            class229.method1581(var488, false);
                            continue;
                        }
                        if (var503 == 1120) {
                            var6 -= 2;
                            var488.field1628 = class23.field383[var6];
                            var488.field1552 = class23.field383[var6 + 1];
                            class229.method1581(var488, false);
                            if (var488.field1612 == 0) {
                                class116.method809(1815818576, var488, false);
                            }
                            continue;
                        }
                        if (var503 == 1121) {
                            var6 -= 2;
                            class229.method1581(var488, false);
                            continue;
                        }
                        if (var503 == 1122) {
                            var6--;
                            var488.field1500 = class23.field383[var6] == 1;
                            class229.method1581(var488, false);
                            continue;
                        }
                        if (var503 == 1123) {
                            var6--;
                            var488.field1605 = class23.field383[var6];
                            class229.method1581(var488, false);
                            if (var488.field1637 == -1) {
                                class6.method76(var488.field1579, -22746);
                            }
                            continue;
                        }
                    } else if (!(var503 < 1200 || var503 >= 1300) || !(var503 < 2200 || var503 >= 2300)) {
                        class82 var484;
                        if (var503 >= 2000) {
                            var503 -= 1000;
                            var10000 = arg0 ^ 0x1;
                            var6--;
                            var484 = class116.method805(var10000, class23.field383[var6]);
                        } else {
                            var484 = var46 ? class23.field379 : class102.field1859;
                        }
                        class229.method1581(var484, false);
                        if (var503 == 1200 || var503 == 1205) {
                            var6 -= 2;
                            int var485 = class23.field383[var6];
                            int var486 = class23.field383[var6 + 1];
                            if (var484.field1637 == -1) {
                                class200.method1431(var484.field1579, (byte) -93);
                                class6.method76(var484.field1579, -22746);
                                class182.method1284((byte) -109, var484.field1579);
                            }
                            if (var485 == -1) {
                                var484.field1521 = -1;
                                var484.field1626 = 1;
                                var484.field1497 = -1;
                            } else {
                                var484.field1497 = var485;
                                var484.field1507 = var486;
                                class134 var487 = class165.method1179(102, var485);
                                var484.field1645 = var487.field2454;
                                var484.field1605 = var487.field2415;
                                var484.field1556 = var487.field2455;
                                if (var503 == 1205) {
                                    var484.field1504 = false;
                                } else {
                                    var484.field1504 = true;
                                }
                                var484.field1529 = var487.field2453;
                                var484.field1563 = var487.field2448;
                                var484.field1520 = var487.field2437;
                                if (var484.field1643 > 0) {
                                    var484.field1605 = var484.field1605 * 32 / var484.field1643;
                                } else if (var484.field1566 > 0) {
                                    var484.field1605 = var484.field1605 * 32 / var484.field1566;
                                }
                            }
                            continue;
                        }
                        if (var503 == 1201) {
                            var484.field1626 = 2;
                            var6--;
                            var484.field1521 = class23.field383[var6];
                            if (var484.field1637 == -1) {
                                class46.method285(arg0 - 1, var484.field1579);
                            }
                            continue;
                        }
                        if (var503 == 1202) {
                            var484.field1626 = 3;
                            var484.field1521 = class241.field4310.field3478.method1733(-120);
                            if (var484.field1637 == -1) {
                                class46.method285(-1, var484.field1579);
                            }
                            continue;
                        }
                        if (var503 == 1203) {
                            var484.field1626 = 6;
                            var6--;
                            var484.field1521 = class23.field383[var6];
                            if (var484.field1637 == -1) {
                                class46.method285(-1, var484.field1579);
                            }
                            continue;
                        }
                        if (var503 == 1204) {
                            var484.field1626 = 5;
                            var6--;
                            var484.field1521 = class23.field383[var6];
                            if (var484.field1637 == -1) {
                                class46.method285(~arg0, var484.field1579);
                            }
                            continue;
                        }
                    } else if (var503 >= 1300 && var503 < 1400 || var503 >= 2300 && var503 < 2400) {
                        class82 var67;
                        if (var503 < 2000) {
                            var67 = var46 ? class23.field379 : class102.field1859;
                        } else {
                            var6--;
                            var67 = class116.method805(1, class23.field383[var6]);
                            var503 -= 1000;
                        }
                        if (var503 == 1300) {
                            var6--;
                            int var68 = class23.field383[var6] - 1;
                            if (var68 >= 0 && var68 <= 9) {
                                var7--;
                                var67.method541(-127, var68, class142.field2678[var7]);
                                continue;
                            }
                            var7--;
                            continue;
                        }
                        if (var503 == 1301) {
                            var6 -= 2;
                            int var69 = class23.field383[var6 + 1];
                            int var70 = class23.field383[var6];
                            var67.field1616 = class157.method1115(6684, var70, var69);
                            continue;
                        }
                        if (var503 == 1302) {
                            var6--;
                            var67.field1591 = class23.field383[var6] == 1;
                            continue;
                        }
                        if (var503 == 1303) {
                            var6--;
                            var67.field1517 = class23.field383[var6];
                            continue;
                        }
                        if (var503 == 1304) {
                            var6--;
                            var67.field1620 = class23.field383[var6];
                            continue;
                        }
                        if (var503 == 1305) {
                            var7--;
                            var67.field1502 = class142.field2678[var7];
                            continue;
                        }
                        if (var503 == 1306) {
                            var7--;
                            var67.field1551 = class142.field2678[var7];
                            continue;
                        }
                        if (var503 == 1307) {
                            var67.field1604 = null;
                            continue;
                        }
                        if (var503 == 1309) {
                            var6--;
                            int var71 = class23.field383[var6];
                            var6--;
                            int var72 = class23.field383[var6];
                            if (var72 >= 1 && var72 <= 10) {
                                var67.method544(false, var72 - 1, var71);
                            }
                            continue;
                        }
                    } else {
                        if (var503 >= 1400 && var503 < 1500 || var503 >= 2400 && var503 < 2500) {
                            class82 var477;
                            if (var503 >= 2000) {
                                var6--;
                                var477 = class116.method805(1, class23.field383[var6]);
                                var503 -= 1000;
                            } else {
                                var477 = var46 ? class23.field379 : class102.field1859;
                            }
                            var7--;
                            class185 var478 = class142.field2678[var7];
                            int[] var479 = null;
                            if (var478.method1311((byte) 49) > 0 && var478.method1328((byte) 96, var478.method1311((byte) 49) - 1) == 89) {
                                var6--;
                                int var480 = class23.field383[var6];
                                if (var480 > 0) {
                                    var479 = new int[var480];
                                    while (var480-- > 0) {
                                        var6--;
                                        var479[var480] = class23.field383[var6];
                                    }
                                }
                                var478 = var478.method1301((byte) -112, var478.method1311((byte) 49) - 1, 0);
                            }
                            Object[] var481 = new Object[var478.method1311((byte) 49) + 1];
                            for (int var482 = var481.length - 1; var482 >= 1; var482--) {
                                if (var478.method1328((byte) 96, var482 - 1) == 115) {
                                    var7--;
                                    var481[var482] = class142.field2678[var7];
                                } else {
                                    var6--;
                                    var481[var482] = Integer.valueOf(class23.field383[var6]);
                                }
                            }
                            var6--;
                            int var483 = class23.field383[var6];
                            if (var483 == -1) {
                                var481 = null;
                            } else {
                                var481[0] = Integer.valueOf(var483);
                            }
                            if (var503 == 1400) {
                                var477.field1636 = var481;
                            } else if (var503 == 1401) {
                                var477.field1557 = var481;
                            } else if (var503 == 1402) {
                                var477.field1522 = var481;
                            } else if (var503 == 1403) {
                                var477.field1553 = var481;
                            } else if (var503 == 1404) {
                                var477.field1629 = var481;
                            } else if (var503 == 1405) {
                                var477.field1606 = var481;
                            } else if (var503 == 1406) {
                                var477.field1603 = var481;
                            } else if (var503 == 1407) {
                                var477.field1530 = var479;
                                var477.field1511 = var481;
                            } else if (var503 == 1408) {
                                var477.field1539 = var481;
                            } else if (var503 == 1409) {
                                var477.field1496 = var481;
                            } else if (var503 == 1410) {
                                var477.field1648 = var481;
                            } else if (var503 == 1411) {
                                var477.field1550 = var481;
                            } else if (var503 == 1412) {
                                var477.field1611 = var481;
                            } else if (var503 == 1414) {
                                var477.field1509 = var481;
                                var477.field1515 = var479;
                            } else if (var503 == 1415) {
                                var477.field1486 = var479;
                                var477.field1493 = var481;
                            } else if (var503 == 1416) {
                                var477.field1592 = var481;
                            } else if (var503 == 1417) {
                                var477.field1559 = var481;
                            } else if (var503 == 1418) {
                                var477.field1618 = var481;
                            } else if (var503 == 1419) {
                                var477.field1558 = var481;
                            } else if (var503 == 1420) {
                                var477.field1538 = var481;
                            } else if (var503 == 1421) {
                                var477.field1518 = var481;
                            } else if (var503 == 1422) {
                                var477.field1489 = var481;
                            } else if (var503 == 1423) {
                                var477.field1596 = var481;
                            } else if (var503 == 1424) {
                                var477.field1575 = var481;
                            } else if (var503 == 1425) {
                                var477.field1508 = var481;
                            } else if (var503 == 1426) {
                                var477.field1617 = var481;
                            } else if (var503 == 1427) {
                                var477.field1631 = var481;
                            } else if (var503 == 1428) {
                                var477.field1573 = var481;
                                var477.field1510 = var479;
                            } else if (var503 == 1429) {
                                var477.field1540 = var479;
                                var477.field1516 = var481;
                            }
                            var477.field1593 = true;
                            continue;
                        }
                        if (var503 < 1600) {
                            class82 var73 = var46 ? class23.field379 : class102.field1859;
                            if (var503 == 1500) {
                                class23.field383[var6++] = var73.field1584;
                                continue;
                            }
                            if (var503 == 1501) {
                                class23.field383[var6++] = var73.field1491;
                                continue;
                            }
                            if (var503 == 1502) {
                                class23.field383[var6++] = var73.field1505;
                                continue;
                            }
                            if (var503 == 1503) {
                                class23.field383[var6++] = var73.field1498;
                                continue;
                            }
                            if (var503 == 1504) {
                                class23.field383[var6++] = var73.field1495 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 1505) {
                                class23.field383[var6++] = var73.field1580;
                                continue;
                            }
                        } else if (var503 < 1700) {
                            class82 var476 = var46 ? class23.field379 : class102.field1859;
                            if (var503 == 1600) {
                                class23.field383[var6++] = var476.field1565;
                                continue;
                            }
                            if (var503 == 1601) {
                                class23.field383[var6++] = var476.field1590;
                                continue;
                            }
                            if (var503 == 1602) {
                                class142.field2678[var7++] = var476.field1555;
                                continue;
                            }
                            if (var503 == 1603) {
                                class23.field383[var6++] = var476.field1628;
                                continue;
                            }
                            if (var503 == 1604) {
                                class23.field383[var6++] = var476.field1552;
                                continue;
                            }
                            if (var503 == 1605) {
                                class23.field383[var6++] = var476.field1605;
                                continue;
                            }
                            if (var503 == 1606) {
                                class23.field383[var6++] = var476.field1563;
                                continue;
                            }
                            if (var503 == 1607) {
                                class23.field383[var6++] = var476.field1520;
                                continue;
                            }
                            if (var503 == 1608) {
                                class23.field383[var6++] = var476.field1556;
                                continue;
                            }
                            if (var503 == 1609) {
                                class23.field383[var6++] = var476.field1512;
                                continue;
                            }
                            if (var503 == 1610) {
                                class23.field383[var6++] = var476.field1529;
                                continue;
                            }
                            if (var503 == 1611) {
                                class23.field383[var6++] = var476.field1645;
                                continue;
                            }
                            if (var503 == 1612) {
                                class23.field383[var6++] = var476.field1483;
                                continue;
                            }
                        } else if (var503 < 1800) {
                            class82 var475 = var46 ? class23.field379 : class102.field1859;
                            if (var503 == 1700) {
                                class23.field383[var6++] = var475.field1497;
                                continue;
                            }
                            if (var503 == 1701) {
                                if (var475.field1497 == -1) {
                                    class23.field383[var6++] = 0;
                                } else {
                                    class23.field383[var6++] = var475.field1507;
                                }
                                continue;
                            }
                            if (var503 == 1702) {
                                class23.field383[var6++] = var475.field1637;
                                continue;
                            }
                        } else if (var503 < 1900) {
                            class82 var473 = var46 ? class23.field379 : class102.field1859;
                            if (var503 == 1800) {
                                class23.field383[var6++] = class40.method248(client.method1502(var473), (byte) 83);
                                continue;
                            }
                            if (var503 == 1801) {
                                var6--;
                                int var474 = class23.field383[var6];
                                int var505 = var474 - 1;
                                if (var473.field1604 != null && var473.field1604.length > var505 && var473.field1604[var505] != null) {
                                    class142.field2678[var7++] = var473.field1604[var505];
                                    continue;
                                }
                                class142.field2678[var7++] = class171.field3156;
                                continue;
                            }
                            if (var503 == 1802) {
                                if (var473.field1502 == null) {
                                    class142.field2678[var7++] = class171.field3156;
                                } else {
                                    class142.field2678[var7++] = var473.field1502;
                                }
                                continue;
                            }
                        } else if (var503 < 2600) {
                            var10000 = arg0 ^ 0x1;
                            var6--;
                            class82 var472 = class116.method805(var10000, class23.field383[var6]);
                            if (var503 == 2500) {
                                class23.field383[var6++] = var472.field1584;
                                continue;
                            }
                            if (var503 == 2501) {
                                class23.field383[var6++] = var472.field1491;
                                continue;
                            }
                            if (var503 == 2502) {
                                class23.field383[var6++] = var472.field1505;
                                continue;
                            }
                            if (var503 == 2503) {
                                class23.field383[var6++] = var472.field1498;
                                continue;
                            }
                            if (var503 == 2504) {
                                class23.field383[var6++] = var472.field1495 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 2505) {
                                class23.field383[var6++] = var472.field1580;
                                continue;
                            }
                        } else if (var503 < 2700) {
                            var6--;
                            class82 var74 = class116.method805(1, class23.field383[var6]);
                            if (var503 == 2600) {
                                class23.field383[var6++] = var74.field1565;
                                continue;
                            }
                            if (var503 == 2601) {
                                class23.field383[var6++] = var74.field1590;
                                continue;
                            }
                            if (var503 == 2602) {
                                class142.field2678[var7++] = var74.field1555;
                                continue;
                            }
                            if (var503 == 2603) {
                                class23.field383[var6++] = var74.field1628;
                                continue;
                            }
                            if (var503 == 2604) {
                                class23.field383[var6++] = var74.field1552;
                                continue;
                            }
                            if (var503 == 2605) {
                                class23.field383[var6++] = var74.field1605;
                                continue;
                            }
                            if (var503 == 2606) {
                                class23.field383[var6++] = var74.field1563;
                                continue;
                            }
                            if (var503 == 2607) {
                                class23.field383[var6++] = var74.field1520;
                                continue;
                            }
                            if (var503 == 2608) {
                                class23.field383[var6++] = var74.field1556;
                                continue;
                            }
                            if (var503 == 2609) {
                                class23.field383[var6++] = var74.field1512;
                                continue;
                            }
                            if (var503 == 2610) {
                                class23.field383[var6++] = var74.field1529;
                                continue;
                            }
                            if (var503 == 2611) {
                                class23.field383[var6++] = var74.field1645;
                                continue;
                            }
                            if (var503 == 2612) {
                                class23.field383[var6++] = var74.field1483;
                                continue;
                            }
                        } else if (var503 < 2800) {
                            if (var503 == 2700) {
                                var6--;
                                class82 var462 = class116.method805(1, class23.field383[var6]);
                                class23.field383[var6++] = var462.field1497;
                                continue;
                            }
                            if (var503 == 2701) {
                                var6--;
                                class82 var463 = class116.method805(1, class23.field383[var6]);
                                if (var463.field1497 == -1) {
                                    class23.field383[var6++] = 0;
                                } else {
                                    class23.field383[var6++] = var463.field1507;
                                }
                                continue;
                            }
                            if (var503 == 2702) {
                                var6--;
                                int var464 = class23.field383[var6];
                                class271 var465 = (class271) class87.field1715.method195(121, (long) var464);
                                if (var465 == null) {
                                    class23.field383[var6++] = 0;
                                } else {
                                    class23.field383[var6++] = 1;
                                }
                                continue;
                            }
                            if (var503 == 2703) {
                                var10000 = arg0 ^ 0x1;
                                var6--;
                                class82 var466 = class116.method805(var10000, class23.field383[var6]);
                                if (var466.field1536 == null) {
                                    class23.field383[var6++] = 0;
                                    continue;
                                }
                                int var467 = var466.field1536.length;
                                for (int var468 = 0; var468 < var466.field1536.length; var468++) {
                                    if (var466.field1536[var468] == null) {
                                        var467 = var468;
                                        break;
                                    }
                                }
                                class23.field383[var6++] = var467;
                                continue;
                            }
                            if (var503 == 2704 || var503 == 2705) {
                                var6 -= 2;
                                int var469 = class23.field383[var6 + 1];
                                int var470 = class23.field383[var6];
                                class271 var471 = (class271) class87.field1715.method195(arg0 ^ 0x5F, (long) var470);
                                if (var471 != null && var471.field4811 == var469) {
                                    class23.field383[var6++] = 1;
                                    continue;
                                }
                                class23.field383[var6++] = 0;
                                continue;
                            }
                        } else if (var503 < 2900) {
                            var6--;
                            class82 var75 = class116.method805(1, class23.field383[var6]);
                            if (var503 == 2800) {
                                class23.field383[var6++] = class40.method248(client.method1502(var75), (byte) 107);
                                continue;
                            }
                            if (var503 == 2801) {
                                var6--;
                                int var76 = class23.field383[var6];
                                int var504 = var76 - 1;
                                if (var75.field1604 != null && var504 < var75.field1604.length && var75.field1604[var504] != null) {
                                    class142.field2678[var7++] = var75.field1604[var504];
                                    continue;
                                }
                                class142.field2678[var7++] = class171.field3156;
                                continue;
                            }
                            if (var503 == 2802) {
                                if (var75.field1502 == null) {
                                    class142.field2678[var7++] = class171.field3156;
                                } else {
                                    class142.field2678[var7++] = var75.field1502;
                                }
                                continue;
                            }
                        } else if (var503 < 3200) {
                            if (var503 == 3100) {
                                var7--;
                                class185 var447 = class142.field2678[var7];
                                class1.method5(class171.field3156, 0, true, var447);
                                continue;
                            }
                            if (var503 == 3101) {
                                var6 -= 2;
                                class238.method1617(class241.field4310, class23.field383[var6], 4125, class23.field383[var6 + 1]);
                                continue;
                            }
                            if (var503 == 3103) {
                                class17.method124(0);
                                continue;
                            }
                            if (var503 == 3104) {
                                class198.field3626++;
                                int var448 = 0;
                                var7--;
                                class185 var449 = class142.field2678[var7];
                                if (var449.method1324(arg0 + 10)) {
                                    var448 = var449.method1332(10634);
                                }
                                class182.field3349.method577(119, arg0);
                                class182.field3349.method842(var448, arg0 ^ 0xFFFFE63C);
                                continue;
                            }
                            if (var503 == 3105) {
                                class262.field4640++;
                                var7--;
                                class185 var450 = class142.field2678[var7];
                                class182.field3349.method577(29, arg0);
                                class182.field3349.method870(var450.method1327((byte) 101), (byte) 122);
                                continue;
                            }
                            if (var503 == 3106) {
                                var7--;
                                class185 var451 = class142.field2678[var7];
                                class109.field1967++;
                                class182.field3349.method577(108, 0);
                                class182.field3349.method877((byte) 110, var451.method1311((byte) 49) + 1);
                                class182.field3349.method855((byte) -69, var451);
                                continue;
                            }
                            if (var503 == 3107) {
                                var7--;
                                class185 var452 = class142.field2678[var7];
                                var6--;
                                int var453 = class23.field383[var6];
                                class126.method908(var453, var452, (byte) 107);
                                continue;
                            }
                            if (var503 == 3108) {
                                var6 -= 3;
                                int var454 = class23.field383[var6];
                                int var455 = class23.field383[var6 + 2];
                                int var456 = class23.field383[var6 + 1];
                                class82 var457 = class116.method805(arg0 + 1, var455);
                                class251.method1706(var456, var454, var457, -96);
                                continue;
                            }
                            if (var503 == 3109) {
                                var6 -= 2;
                                int var458 = class23.field383[var6];
                                int var459 = class23.field383[var6 + 1];
                                class82 var460 = var46 ? class23.field379 : class102.field1859;
                                class251.method1706(var459, var458, var460, arg0 - 40);
                                continue;
                            }
                            if (var503 == 3110) {
                                class166.field3103++;
                                var6--;
                                int var461 = class23.field383[var6];
                                class182.field3349.method577(183, 0);
                                class182.field3349.method856(31133, var461);
                                continue;
                            }
                        } else if (var503 < 3300) {
                            if (var503 == 3200) {
                                var6 -= 3;
                                class37.method234((byte) -62, class23.field383[var6 + 1], class23.field383[var6], class23.field383[var6 + 2]);
                                continue;
                            }
                            if (var503 == 3201) {
                                var6--;
                                class227.method1567(true, class23.field383[var6]);
                                continue;
                            }
                            if (var503 == 3202) {
                                var6 -= 2;
                                class253.method1715(17, class23.field383[var6 + 1], class23.field383[var6]);
                                continue;
                            }
                        } else if (var503 < 3400) {
                            if (var503 == 3300) {
                                class23.field383[var6++] = class211.field3851;
                                continue;
                            }
                            if (var503 == 3301) {
                                var6 -= 2;
                                int var413 = class23.field383[var6];
                                int var414 = class23.field383[var6 + 1];
                                class23.field383[var6++] = class58.method401(-24378, var414, var413);
                                continue;
                            }
                            if (var503 == 3302) {
                                var6 -= 2;
                                int var415 = class23.field383[var6 + 1];
                                int var416 = class23.field383[var6];
                                class23.field383[var6++] = class194.method1397(var416, var415, 90);
                                continue;
                            }
                            if (var503 == 3303) {
                                var6 -= 2;
                                int var417 = class23.field383[var6 + 1];
                                int var418 = class23.field383[var6];
                                class23.field383[var6++] = class73.method472(var418, var417, (byte) -75);
                                continue;
                            }
                            if (var503 == 3304) {
                                var6--;
                                int var419 = class23.field383[var6];
                                class23.field383[var6++] = class262.method1793(var419, arg0 + 4566).field2767;
                                continue;
                            }
                            if (var503 == 3305) {
                                var6--;
                                int var420 = class23.field383[var6];
                                class23.field383[var6++] = class132.field2374[var420];
                                continue;
                            }
                            if (var503 == 3306) {
                                var6--;
                                int var421 = class23.field383[var6];
                                class23.field383[var6++] = class228.field4149[var421];
                                continue;
                            }
                            if (var503 == 3307) {
                                var6--;
                                int var422 = class23.field383[var6];
                                class23.field383[var6++] = class117.field2079[var422];
                                continue;
                            }
                            if (var503 == 3308) {
                                int var423 = (class241.field4310.field2694 >> 7) + class77.field1339;
                                int var424 = class265.field4703;
                                int var425 = (class241.field4310.field2687 >> 7) + class107.field1933;
                                class23.field383[var6++] = (var424 << 28) + (var423 << 14) + var425;
                                continue;
                            }
                            if (var503 == 3309) {
                                var6--;
                                int var426 = class23.field383[var6];
                                class23.field383[var6++] = class220.method1526(var426 >> 14, 16383);
                                continue;
                            }
                            if (var503 == 3310) {
                                var6--;
                                int var427 = class23.field383[var6];
                                class23.field383[var6++] = var427 >> 28;
                                continue;
                            }
                            if (var503 == 3311) {
                                var6--;
                                int var428 = class23.field383[var6];
                                class23.field383[var6++] = class220.method1526(16383, var428);
                                continue;
                            }
                            if (var503 == 3312) {
                                class23.field383[var6++] = class137.field2565 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 3313) {
                                var6 -= 2;
                                int var429 = class23.field383[var6] + 32768;
                                int var430 = class23.field383[var6 + 1];
                                class23.field383[var6++] = class58.method401(-24378, var430, var429);
                                continue;
                            }
                            if (var503 == 3314) {
                                var6 -= 2;
                                int var431 = class23.field383[var6] + 32768;
                                int var432 = class23.field383[var6 + 1];
                                class23.field383[var6++] = class194.method1397(var431, var432, 65);
                                continue;
                            }
                            if (var503 == 3315) {
                                var6 -= 2;
                                int var433 = class23.field383[var6] + 32768;
                                int var434 = class23.field383[var6 + 1];
                                class23.field383[var6++] = class73.method472(var433, var434, (byte) 58);
                                continue;
                            }
                            if (var503 == 3316) {
                                if (class205.field3769 < 2) {
                                    class23.field383[var6++] = 0;
                                } else {
                                    class23.field383[var6++] = class205.field3769;
                                }
                                continue;
                            }
                            if (var503 == 3317) {
                                class23.field383[var6++] = class191.field3542;
                                continue;
                            }
                            if (var503 == 3318) {
                                class23.field383[var6++] = class138.field2588;
                                continue;
                            }
                            if (var503 == 3321) {
                                class23.field383[var6++] = class123.field2221;
                                continue;
                            }
                            if (var503 == 3322) {
                                class23.field383[var6++] = class42.field646;
                                continue;
                            }
                            if (var503 == 3323) {
                                if (class79.field1376 >= 5 && class79.field1376 <= 9) {
                                    class23.field383[var6++] = 1;
                                    continue;
                                }
                                class23.field383[var6++] = 0;
                                continue;
                            }
                            if (var503 == 3324) {
                                if (class79.field1376 >= 5 && class79.field1376 <= 9) {
                                    class23.field383[var6++] = class79.field1376;
                                    continue;
                                }
                                class23.field383[var6++] = 0;
                                continue;
                            }
                            if (var503 == 3325) {
                                class23.field383[var6++] = class146.field2776 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 3326) {
                                class23.field383[var6++] = class241.field4310.field3497;
                                continue;
                            }
                            if (var503 == 3327) {
                                class23.field383[var6++] = class241.field4310.field3478.field4545 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 3328) {
                                class23.field383[var6++] = class212.field3864 && !class118.field2142 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 3329) {
                                class23.field383[var6++] = class275.field4880 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 3330) {
                                var6--;
                                int var435 = class23.field383[var6];
                                class23.field383[var6++] = class56.method391(var435, 29688);
                                continue;
                            }
                            if (var503 == 3331) {
                                var6 -= 2;
                                int var436 = class23.field383[var6 + 1];
                                int var437 = class23.field383[var6];
                                class23.field383[var6++] = class55.method376(var436, 0, false, var437);
                                continue;
                            }
                            if (var503 == 3332) {
                                var6 -= 2;
                                int var438 = class23.field383[var6];
                                int var439 = class23.field383[var6 + 1];
                                class23.field383[var6++] = class55.method376(var439, 0, true, var438);
                                continue;
                            }
                            if (var503 == 3333) {
                                class23.field383[var6++] = class191.field3533;
                                continue;
                            }
                            if (var503 == 3335) {
                                class23.field383[var6++] = class198.field3620;
                                continue;
                            }
                            if (var503 == 3336) {
                                var6 -= 4;
                                int var440 = class23.field383[var6];
                                int var441 = class23.field383[var6 + 1];
                                int var442 = (var441 << 14) + var440;
                                int var443 = class23.field383[var6 + 3];
                                int var444 = class23.field383[var6 + 2];
                                int var445 = (var444 << 28) + var442;
                                int var446 = var443 + var445;
                                class23.field383[var6++] = var446;
                                continue;
                            }
                            if (var503 == 3337) {
                                class23.field383[var6++] = class119.field2175;
                                continue;
                            }
                        } else if (var503 < 3500) {
                            if (var503 == 3400) {
                                var6 -= 2;
                                int var77 = class23.field383[var6 + 1];
                                int var78 = class23.field383[var6];
                                class260 var79 = class257.method1746(var78, false);
                                class142.field2678[var7++] = var79.method1765(var77, (byte) -60);
                                continue;
                            }
                            if (var503 == 3408) {
                                var6 -= 4;
                                int var80 = class23.field383[var6];
                                int var81 = class23.field383[var6 + 1];
                                int var82 = class23.field383[var6 + 2];
                                int var83 = class23.field383[var6 + 3];
                                class260 var84 = class257.method1746(var82, false);
                                if (var84.field4610 == var80 && var84.field4626 == var81) {
                                    if (var81 == 115) {
                                        class142.field2678[var7++] = var84.method1765(var83, (byte) -60);
                                    } else {
                                        class23.field383[var6++] = var84.method1770(var83, false);
                                    }
                                    continue;
                                }
                                throw new RuntimeException("C3408-1");
                            }
                            if (var503 == 3409) {
                                var6 -= 3;
                                int var85 = class23.field383[var6];
                                int var86 = class23.field383[var6 + 1];
                                int var87 = class23.field383[var6 + 2];
                                if (var86 == -1) {
                                    throw new RuntimeException("C3409-2");
                                }
                                class260 var88 = class257.method1746(var86, false);
                                if (var88.field4626 != var85) {
                                    throw new RuntimeException("C3409-1");
                                }
                                class23.field383[var6++] = var88.method1769(var87, arg0 + 18267) ? 1 : 0;
                                continue;
                            }
                            if (var503 == 3410) {
                                var6--;
                                int var89 = class23.field383[var6];
                                var7--;
                                class185 var90 = class142.field2678[var7];
                                if (var89 == -1) {
                                    throw new RuntimeException("C3410-2");
                                }
                                class260 var91 = class257.method1746(var89, false);
                                if (var91.field4626 != 115) {
                                    throw new RuntimeException("C3410-1");
                                }
                                class23.field383[var6++] = var91.method1772(104, var90) ? 1 : 0;
                                continue;
                            }
                            if (var503 == 3411) {
                                var6--;
                                int var92 = class23.field383[var6];
                                class260 var93 = class257.method1746(var92, false);
                                class23.field383[var6++] = var93.field4614.method191(class260.method1766(arg0, 0));
                                continue;
                            }
                        } else if (var503 < 3700) {
                            if (var503 == 3600) {
                                if (class42.field640 == 0) {
                                    class23.field383[var6++] = -2;
                                } else if (class42.field640 == 1) {
                                    class23.field383[var6++] = -1;
                                } else {
                                    class23.field383[var6++] = class126.field2253;
                                }
                                continue;
                            }
                            if (var503 == 3601) {
                                var6--;
                                int var94 = class23.field383[var6];
                                if (class42.field640 == 2 && class126.field2253 > var94) {
                                    class142.field2678[var7++] = class128.field2290[var94];
                                    continue;
                                }
                                class142.field2678[var7++] = class171.field3156;
                                continue;
                            }
                            if (var503 == 3602) {
                                var6--;
                                int var95 = class23.field383[var6];
                                if (class42.field640 == 2 && var95 < class126.field2253) {
                                    class23.field383[var6++] = class138.field2590[var95];
                                    continue;
                                }
                                class23.field383[var6++] = 0;
                                continue;
                            }
                            if (var503 == 3603) {
                                var6--;
                                int var96 = class23.field383[var6];
                                if (class42.field640 == 2 && var96 < class126.field2253) {
                                    class23.field383[var6++] = class194.field3580[var96];
                                    continue;
                                }
                                class23.field383[var6++] = 0;
                                continue;
                            }
                            if (var503 == 3604) {
                                var7--;
                                class185 var97 = class142.field2678[var7];
                                var6--;
                                int var98 = class23.field383[var6];
                                class203.method1445(var98, -44, var97);
                                continue;
                            }
                            if (var503 == 3605) {
                                var7--;
                                class185 var99 = class142.field2678[var7];
                                class84.method551(arg0 ^ 0xFFFFFF8D, var99.method1327((byte) 101));
                                continue;
                            }
                            if (var503 == 3606) {
                                var7--;
                                class185 var100 = class142.field2678[var7];
                                class202.method1442(var100.method1327((byte) 101), arg0 ^ 0x7F);
                                continue;
                            }
                            if (var503 == 3607) {
                                var7--;
                                class185 var101 = class142.field2678[var7];
                                class44.method271(var101.method1327((byte) 101), (byte) -62);
                                continue;
                            }
                            if (var503 == 3608) {
                                var7--;
                                class185 var102 = class142.field2678[var7];
                                class207.method1465(var102.method1327((byte) 101), (byte) -93);
                                continue;
                            }
                            if (var503 == 3609) {
                                var7--;
                                class185 var103 = class142.field2678[var7];
                                if (var103.method1306(class239.field4271, (byte) 106) || var103.method1306(class24.field408, (byte) 123)) {
                                    var103 = var103.method1310(39, 7);
                                }
                                class23.field383[var6++] = class251.method1705(var103, false) ? 1 : 0;
                                continue;
                            }
                            if (var503 == 3610) {
                                var6--;
                                int var104 = class23.field383[var6];
                                if (class42.field640 == 2 && class126.field2253 > var104) {
                                    class142.field2678[var7++] = class82.field1535[var104];
                                    continue;
                                }
                                class142.field2678[var7++] = class171.field3156;
                                continue;
                            }
                            if (var503 == 3611) {
                                if (class165.field3089 == null) {
                                    class142.field2678[var7++] = class171.field3156;
                                } else {
                                    class142.field2678[var7++] = class165.field3089.method1334(38);
                                }
                                continue;
                            }
                            if (var503 == 3612) {
                                if (class165.field3089 == null) {
                                    class23.field383[var6++] = 0;
                                } else {
                                    class23.field383[var6++] = class48.field786;
                                }
                                continue;
                            }
                            if (var503 == 3613) {
                                var6--;
                                int var105 = class23.field383[var6];
                                if (class165.field3089 != null && var105 < class48.field786) {
                                    class142.field2678[var7++] = class81.field1455[var105].field3197.method1334(class260.method1766(arg0, 38));
                                    continue;
                                }
                                class142.field2678[var7++] = class171.field3156;
                                continue;
                            }
                            if (var503 == 3614) {
                                var6--;
                                int var106 = class23.field383[var6];
                                if (class165.field3089 != null && class48.field786 > var106) {
                                    class23.field383[var6++] = class81.field1455[var106].field3205;
                                    continue;
                                }
                                class23.field383[var6++] = 0;
                                continue;
                            }
                            if (var503 == 3615) {
                                var6--;
                                int var107 = class23.field383[var6];
                                if (class165.field3089 != null && var107 < class48.field786) {
                                    class23.field383[var6++] = class81.field1455[var107].field3206;
                                    continue;
                                }
                                class23.field383[var6++] = 0;
                                continue;
                            }
                            if (var503 == 3616) {
                                class23.field383[var6++] = class133.field2388;
                                continue;
                            }
                            if (var503 == 3617) {
                                var7--;
                                class185 var108 = class142.field2678[var7];
                                class70.method462(var108, -101);
                                continue;
                            }
                            if (var503 == 3618) {
                                class23.field383[var6++] = class10.field203;
                                continue;
                            }
                            if (var503 == 3619) {
                                var7--;
                                class185 var109 = class142.field2678[var7];
                                class178.method1265(var109.method1327((byte) 101), -101);
                                continue;
                            }
                            if (var503 == 3620) {
                                class257.method1748(17353);
                                continue;
                            }
                            if (var503 == 3621) {
                                if (class42.field640 == 0) {
                                    class23.field383[var6++] = -1;
                                } else {
                                    class23.field383[var6++] = class127.field2276;
                                }
                                continue;
                            }
                            if (var503 == 3622) {
                                var6--;
                                int var110 = class23.field383[var6];
                                if (class42.field640 != 0 && var110 < class127.field2276) {
                                    class142.field2678[var7++] = class271.method1859((byte) -108, class165.field3088[var110]).method1334(class260.method1766(arg0, 38));
                                    continue;
                                }
                                class142.field2678[var7++] = class171.field3156;
                                continue;
                            }
                            if (var503 == 3623) {
                                var7--;
                                class185 var111 = class142.field2678[var7];
                                if (var111.method1306(class239.field4271, (byte) 106) || var111.method1306(class24.field408, (byte) 118)) {
                                    var111 = var111.method1310(39, 7);
                                }
                                class23.field383[var6++] = client.method1508(9, var111) ? 1 : 0;
                                continue;
                            }
                            if (var503 == 3624) {
                                var6--;
                                int var112 = class23.field383[var6];
                                if (class81.field1455 != null && var112 < class48.field786 && class81.field1455[var112].field3197.method1312(class241.field4310.field3514, arg0 - 30055)) {
                                    class23.field383[var6++] = 1;
                                    continue;
                                }
                                class23.field383[var6++] = 0;
                                continue;
                            }
                            if (var503 == 3625) {
                                if (class32.field525 == null) {
                                    class142.field2678[var7++] = class171.field3156;
                                } else {
                                    class142.field2678[var7++] = class32.field525.method1334(38);
                                }
                                continue;
                            }
                            if (var503 == 3626) {
                                var6--;
                                int var113 = class23.field383[var6];
                                if (class165.field3089 != null && var113 < class48.field786) {
                                    class142.field2678[var7++] = class81.field1455[var113].field3201;
                                    continue;
                                }
                                class142.field2678[var7++] = class171.field3156;
                                continue;
                            }
                            if (var503 == 3627) {
                                var6--;
                                int var114 = class23.field383[var6];
                                if (class42.field640 == 2 && var114 >= 0 && class126.field2253 > var114) {
                                    class23.field383[var6++] = class127.field2267[var114] ? 1 : 0;
                                    continue;
                                }
                                class23.field383[var6++] = 0;
                                continue;
                            }
                            if (var503 == 3628) {
                                var7--;
                                class185 var115 = class142.field2678[var7];
                                if (var115.method1306(class239.field4271, (byte) 126) || var115.method1306(class24.field408, (byte) 124)) {
                                    var115 = var115.method1310(39, 7);
                                }
                                class23.field383[var6++] = class44.method272(true, var115);
                                continue;
                            }
                            if (var503 == 3629) {
                                class23.field383[var6++] = class79.field1373;
                                continue;
                            }
                        } else if (var503 < 4000) {
                            if (var503 == 3903) {
                                var6--;
                                int var116 = class23.field383[var6];
                                class23.field383[var6++] = class60.field1084[var116].method922((byte) -115);
                                continue;
                            }
                            if (var503 == 3904) {
                                var6--;
                                int var117 = class23.field383[var6];
                                class23.field383[var6++] = class60.field1084[var117].field2311;
                                continue;
                            }
                            if (var503 == 3905) {
                                var6--;
                                int var118 = class23.field383[var6];
                                class23.field383[var6++] = class60.field1084[var118].field2308;
                                continue;
                            }
                            if (var503 == 3906) {
                                var6--;
                                int var119 = class23.field383[var6];
                                class23.field383[var6++] = class60.field1084[var119].field2307;
                                continue;
                            }
                            if (var503 == 3907) {
                                var6--;
                                int var120 = class23.field383[var6];
                                class23.field383[var6++] = class60.field1084[var120].field2314;
                                continue;
                            }
                            if (var503 == 3908) {
                                var6--;
                                int var121 = class23.field383[var6];
                                class23.field383[var6++] = class60.field1084[var121].field2305;
                                continue;
                            }
                            if (var503 == 3910) {
                                var6--;
                                int var122 = class23.field383[var6];
                                int var123 = class60.field1084[var122].method918(true);
                                class23.field383[var6++] = var123 == 0 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 3911) {
                                var6--;
                                int var124 = class23.field383[var6];
                                int var125 = class60.field1084[var124].method918(true);
                                class23.field383[var6++] = var125 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 3912) {
                                var6--;
                                int var126 = class23.field383[var6];
                                int var127 = class60.field1084[var126].method918(true);
                                class23.field383[var6++] = var127 == 5 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 3913) {
                                var6--;
                                int var128 = class23.field383[var6];
                                int var129 = class60.field1084[var128].method918(true);
                                class23.field383[var6++] = var129 == 1 ? 1 : 0;
                                continue;
                            }
                        } else if (var503 < 4100) {
                            if (var503 == 4000) {
                                var6 -= 2;
                                int var130 = class23.field383[var6 + 1];
                                int var131 = class23.field383[var6];
                                class23.field383[var6++] = var130 + var131;
                                continue;
                            }
                            if (var503 == 4001) {
                                var6 -= 2;
                                int var132 = class23.field383[var6];
                                int var133 = class23.field383[var6 + 1];
                                class23.field383[var6++] = var132 - var133;
                                continue;
                            }
                            if (var503 == 4002) {
                                var6 -= 2;
                                int var134 = class23.field383[var6 + 1];
                                int var135 = class23.field383[var6];
                                class23.field383[var6++] = var134 * var135;
                                continue;
                            }
                            if (var503 == 4003) {
                                var6 -= 2;
                                int var136 = class23.field383[var6];
                                int var137 = class23.field383[var6 + 1];
                                class23.field383[var6++] = var136 / var137;
                                continue;
                            }
                            if (var503 == 4004) {
                                var6--;
                                int var138 = class23.field383[var6];
                                class23.field383[var6++] = (int) (Math.random() * (double) var138);
                                continue;
                            }
                            if (var503 == 4005) {
                                var6--;
                                int var139 = class23.field383[var6];
                                class23.field383[var6++] = (int) ((double) (var139 + 1) * Math.random());
                                continue;
                            }
                            if (var503 == 4006) {
                                var6 -= 5;
                                int var140 = class23.field383[var6];
                                int var141 = class23.field383[var6 + 1];
                                int var142 = class23.field383[var6 + 3];
                                int var143 = class23.field383[var6 + 2];
                                int var144 = class23.field383[var6 + 4];
                                class23.field383[var6++] = (var144 - var143) * (var141 - var140) / (var142 - var143) + var140;
                                continue;
                            }
                            if (var503 == 4007) {
                                var6 -= 2;
                                long var145 = (long) class23.field383[var6];
                                long var147 = (long) class23.field383[var6 + 1];
                                class23.field383[var6++] = (int) (var145 * var147 / 100L + var145);
                                continue;
                            }
                            if (var503 == 4008) {
                                var6 -= 2;
                                int var149 = class23.field383[var6 + 1];
                                int var150 = class23.field383[var6];
                                class23.field383[var6++] = class21.method150(var150, 0x1 << var149);
                                continue;
                            }
                            if (var503 == 4009) {
                                var6 -= 2;
                                int var151 = class23.field383[var6];
                                int var152 = class23.field383[var6 + 1];
                                class23.field383[var6++] = class220.method1526(-(0x1 << var152) - 1, var151);
                                continue;
                            }
                            if (var503 == 4010) {
                                var6 -= 2;
                                int var153 = class23.field383[var6];
                                int var154 = class23.field383[var6 + 1];
                                class23.field383[var6++] = class220.method1526(var153, 0x1 << var154) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var503 == 4011) {
                                var6 -= 2;
                                int var155 = class23.field383[var6 + 1];
                                int var156 = class23.field383[var6];
                                class23.field383[var6++] = var156 % var155;
                                continue;
                            }
                            if (var503 == 4012) {
                                var6 -= 2;
                                int var157 = class23.field383[var6 + 1];
                                int var158 = class23.field383[var6];
                                if (var158 == 0) {
                                    class23.field383[var6++] = 0;
                                } else {
                                    class23.field383[var6++] = (int) Math.pow((double) var158, (double) var157);
                                }
                                continue;
                            }
                            if (var503 == 4013) {
                                var6 -= 2;
                                int var159 = class23.field383[var6];
                                int var160 = class23.field383[var6 + 1];
                                if (var159 == 0) {
                                    class23.field383[var6++] = 0;
                                } else if (var160 == 0) {
                                    class23.field383[var6++] = Integer.MAX_VALUE;
                                } else {
                                    class23.field383[var6++] = (int) Math.pow((double) var159, 1.0D / (double) var160);
                                }
                                continue;
                            }
                            if (var503 == 4014) {
                                var6 -= 2;
                                int var161 = class23.field383[var6 + 1];
                                int var162 = class23.field383[var6];
                                class23.field383[var6++] = class220.method1526(var161, var162);
                                continue;
                            }
                            if (var503 == 4015) {
                                var6 -= 2;
                                int var163 = class23.field383[var6];
                                int var164 = class23.field383[var6 + 1];
                                class23.field383[var6++] = class21.method150(var164, var163);
                                continue;
                            }
                            if (var503 == 4016) {
                                var6 -= 2;
                                int var165 = class23.field383[var6 + 1];
                                int var166 = class23.field383[var6];
                                class23.field383[var6++] = var166 < var165 ? var166 : var165;
                                continue;
                            }
                            if (var503 == 4017) {
                                var6 -= 2;
                                int var167 = class23.field383[var6];
                                int var168 = class23.field383[var6 + 1];
                                class23.field383[var6++] = var167 > var168 ? var167 : var168;
                                continue;
                            }
                            if (var503 == 4018) {
                                var6 -= 3;
                                long var169 = (long) class23.field383[var6];
                                long var171 = (long) class23.field383[var6 + 2];
                                long var173 = (long) class23.field383[var6 + 1];
                                class23.field383[var6++] = (int) (var169 * var171 / var173);
                                continue;
                            }
                        } else if (var503 < 4200) {
                            if (var503 == 4100) {
                                var7--;
                                class185 var363 = class142.field2678[var7];
                                var6--;
                                int var364 = class23.field383[var6];
                                class142.field2678[var7++] = class87.method567(-11039, new class185[] { var363, class90.method591(var364, 0) });
                                continue;
                            }
                            if (var503 == 4101) {
                                var7 -= 2;
                                class185 var365 = class142.field2678[var7];
                                class185 var366 = class142.field2678[var7 + 1];
                                class142.field2678[var7++] = class87.method567(class260.method1766(arg0, -11039), new class185[] { var365, var366 });
                                continue;
                            }
                            if (var503 == 4102) {
                                var7--;
                                class185 var367 = class142.field2678[var7];
                                var6--;
                                int var368 = class23.field383[var6];
                                class142.field2678[var7++] = class87.method567(-11039, new class185[] { var367, class99.method651(true, (byte) -96, var368) });
                                continue;
                            }
                            if (var503 == 4103) {
                                var7--;
                                class185 var369 = class142.field2678[var7];
                                class142.field2678[var7++] = var369.method1325(40);
                                continue;
                            }
                            if (var503 == 4104) {
                                var6--;
                                int var370 = class23.field383[var6];
                                long var371 = (long) var370 * 86400000L + 1014768000000L;
                                class33.field539.setTime(new Date(var371));
                                int var373 = class33.field539.get(5);
                                int var374 = class33.field539.get(2);
                                int var375 = class33.field539.get(1);
                                class142.field2678[var7++] = class87.method567(-11039, new class185[] { class90.method591(var373, 0), class169.field3128, class9.field189[var374], class169.field3128, class90.method591(var375, 0) });
                                continue;
                            }
                            if (var503 == 4105) {
                                var7 -= 2;
                                class185 var376 = class142.field2678[var7];
                                class185 var377 = class142.field2678[var7 + 1];
                                if (class241.field4310.field3478 != null && class241.field4310.field3478.field4545) {
                                    class142.field2678[var7++] = var377;
                                    continue;
                                }
                                class142.field2678[var7++] = var376;
                                continue;
                            }
                            if (var503 == 4106) {
                                var6--;
                                int var378 = class23.field383[var6];
                                class142.field2678[var7++] = class90.method591(var378, arg0);
                                continue;
                            }
                            if (var503 == 4107) {
                                var7 -= 2;
                                class23.field383[var6++] = class142.field2678[var7].method1341(class142.field2678[var7 + 1], false);
                                continue;
                            }
                            if (var503 == 4108) {
                                var7--;
                                class185 var379 = class142.field2678[var7];
                                var6 -= 2;
                                int var380 = class23.field383[var6];
                                int var381 = class23.field383[var6 + 1];
                                class23.field383[var6++] = class258.method1752(class260.method1766(arg0, 0), var381).method1829(var379, var380);
                                continue;
                            }
                            if (var503 == 4109) {
                                var6 -= 2;
                                var7--;
                                class185 var382 = class142.field2678[var7];
                                int var383 = class23.field383[var6];
                                int var384 = class23.field383[var6 + 1];
                                class23.field383[var6++] = class258.method1752(0, var384).method1853(var382, var383);
                                continue;
                            }
                            if (var503 == 4110) {
                                var7 -= 2;
                                class185 var385 = class142.field2678[var7];
                                class185 var386 = class142.field2678[var7 + 1];
                                var6--;
                                if (class23.field383[var6] == 1) {
                                    class142.field2678[var7++] = var385;
                                } else {
                                    class142.field2678[var7++] = var386;
                                }
                                continue;
                            }
                            if (var503 == 4111) {
                                var7--;
                                class185 var387 = class142.field2678[var7];
                                class142.field2678[var7++] = class270.method1844(var387);
                                continue;
                            }
                            if (var503 == 4112) {
                                var6--;
                                int var388 = class23.field383[var6];
                                var7--;
                                class185 var389 = class142.field2678[var7];
                                if (var388 == -1) {
                                    throw new RuntimeException("null char");
                                }
                                class142.field2678[var7++] = var389.method1335(var388, arg0 + 1);
                                continue;
                            }
                            if (var503 == 4113) {
                                var6--;
                                int var390 = class23.field383[var6];
                                class23.field383[var6++] = class178.method1258(var390, -33) ? 1 : 0;
                                continue;
                            }
                            if (var503 == 4114) {
                                var6--;
                                int var391 = class23.field383[var6];
                                class23.field383[var6++] = class88.method575((byte) -44, var391) ? 1 : 0;
                                continue;
                            }
                            if (var503 == 4115) {
                                var6--;
                                int var392 = class23.field383[var6];
                                class23.field383[var6++] = class9.method89((byte) 112, var392) ? 1 : 0;
                                continue;
                            }
                            if (var503 == 4116) {
                                var6--;
                                int var393 = class23.field383[var6];
                                class23.field383[var6++] = class116.method812(var393, class260.method1766(arg0, 2)) ? 1 : 0;
                                continue;
                            }
                            if (var503 == 4117) {
                                var7--;
                                class185 var394 = class142.field2678[var7];
                                if (var394 == null) {
                                    class23.field383[var6++] = 0;
                                } else {
                                    class23.field383[var6++] = var394.method1311((byte) 49);
                                }
                                continue;
                            }
                            if (var503 == 4118) {
                                var6 -= 2;
                                var7--;
                                class185 var395 = class142.field2678[var7];
                                int var396 = class23.field383[var6];
                                int var397 = class23.field383[var6 + 1];
                                class142.field2678[var7++] = var395.method1301((byte) -69, var397, var396);
                                continue;
                            }
                            if (var503 == 4119) {
                                var7--;
                                class185 var398 = class142.field2678[var7];
                                class185 var399 = class37.method232(var398.method1311((byte) 49), 0);
                                boolean var400 = false;
                                for (int var401 = 0; var398.method1311((byte) 49) > var401; var401++) {
                                    int var402 = var398.method1328((byte) 96, var401);
                                    if (var402 == 60) {
                                        var400 = true;
                                    } else if (var402 == 62) {
                                        var400 = false;
                                    } else if (!var400) {
                                        var399.method1340(var402, (byte) -112);
                                    }
                                }
                                var399.method1323((byte) -53);
                                class142.field2678[var7++] = var399;
                                continue;
                            }
                            if (var503 == 4120) {
                                var6 -= 2;
                                int var403 = class23.field383[var6 + 1];
                                var7--;
                                class185 var404 = class142.field2678[var7];
                                int var405 = class23.field383[var6];
                                class23.field383[var6++] = var404.method1331(var405, var403, 117);
                                continue;
                            }
                            if (var503 == 4121) {
                                var7 -= 2;
                                class185 var406 = class142.field2678[var7];
                                var6--;
                                int var407 = class23.field383[var6];
                                class185 var408 = class142.field2678[var7 + 1];
                                class23.field383[var6++] = var406.method1317(-25988, var408, var407);
                                continue;
                            }
                            if (var503 == 4122) {
                                var6--;
                                int var409 = class23.field383[var6];
                                class23.field383[var6++] = class30.method184(var409, (byte) -127);
                                continue;
                            }
                            if (var503 == 4123) {
                                var6--;
                                int var410 = class23.field383[var6];
                                class23.field383[var6++] = class240.method1625(var410, (byte) 9);
                                continue;
                            }
                            if (var503 == 4124) {
                                var6--;
                                boolean var411 = class23.field383[var6] != 0;
                                var6--;
                                int var412 = class23.field383[var6];
                                class142.field2678[var7++] = class48.method304((long) var412, var411, 0, class198.field3620, (byte) 107);
                                continue;
                            }
                        } else if (var503 < 4300) {
                            if (var503 == 4200) {
                                var6--;
                                int var175 = class23.field383[var6];
                                class142.field2678[var7++] = class165.method1179(102, var175).field2436;
                                continue;
                            }
                            if (var503 == 4201) {
                                var6 -= 2;
                                int var176 = class23.field383[var6 + 1];
                                int var177 = class23.field383[var6];
                                class134 var178 = class165.method1179(102, var177);
                                if (var176 >= 1 && var176 <= 5 && var178.field2393[var176 - 1] != null) {
                                    class142.field2678[var7++] = var178.field2393[var176 - 1];
                                    continue;
                                }
                                class142.field2678[var7++] = class171.field3156;
                                continue;
                            }
                            if (var503 == 4202) {
                                var6 -= 2;
                                int var179 = class23.field383[var6];
                                int var180 = class23.field383[var6 + 1];
                                class134 var181 = class165.method1179(arg0 ^ 0x66, var179);
                                if (var180 >= 1 && var180 <= 5 && var181.field2390[var180 - 1] != null) {
                                    class142.field2678[var7++] = var181.field2390[var180 - 1];
                                    continue;
                                }
                                class142.field2678[var7++] = class171.field3156;
                                continue;
                            }
                            if (var503 == 4203) {
                                var6--;
                                int var182 = class23.field383[var6];
                                class23.field383[var6++] = class165.method1179(102, var182).field2460;
                                continue;
                            }
                            if (var503 == 4204) {
                                var6--;
                                int var183 = class23.field383[var6];
                                class23.field383[var6++] = class165.method1179(102, var183).field2469 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 4205) {
                                var6--;
                                int var184 = class23.field383[var6];
                                class134 var185 = class165.method1179(102, var184);
                                if (var185.field2442 == -1 && var185.field2425 >= 0) {
                                    class23.field383[var6++] = var185.field2425;
                                    continue;
                                }
                                class23.field383[var6++] = var184;
                                continue;
                            }
                            if (var503 == 4206) {
                                var6--;
                                int var186 = class23.field383[var6];
                                class134 var187 = class165.method1179(102, var186);
                                if (var187.field2442 >= 0 && var187.field2425 >= 0) {
                                    class23.field383[var6++] = var187.field2425;
                                    continue;
                                }
                                class23.field383[var6++] = var186;
                                continue;
                            }
                            if (var503 == 4207) {
                                var6--;
                                int var188 = class23.field383[var6];
                                class23.field383[var6++] = class165.method1179(102, var188).field2398 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 4208) {
                                var6 -= 2;
                                int var189 = class23.field383[var6 + 1];
                                int var190 = class23.field383[var6];
                                class90 var191 = class152.method1081(var189, (byte) -86);
                                if (var191.method595((byte) -124)) {
                                    class142.field2678[var7++] = class165.method1179(arg0 + 102, var190).method957(class260.method1766(arg0, 23709), var191.field1739, var189);
                                } else {
                                    class23.field383[var6++] = class165.method1179(102, var190).method944(var189, var191.field1758, (byte) -99);
                                }
                                continue;
                            }
                            if (var503 == 4210) {
                                var6--;
                                int var192 = class23.field383[var6];
                                var7--;
                                class185 var193 = class142.field2678[var7];
                                class156.method1108(var192 == 1, (byte) 107, var193);
                                class23.field383[var6++] = class182.field3347;
                                continue;
                            }
                            if (var503 == 4211) {
                                if (class60.field1077 != null && class203.field3716 < class182.field3347) {
                                    class23.field383[var6++] = class220.method1526(65535, class60.field1077[class203.field3716++]);
                                    continue;
                                }
                                class23.field383[var6++] = -1;
                                continue;
                            }
                            if (var503 == 4212) {
                                class203.field3716 = 0;
                                continue;
                            }
                        } else if (var503 < 4400) {
                            if (var503 == 4300) {
                                var6 -= 2;
                                int var353 = class23.field383[var6 + 1];
                                int var354 = class23.field383[var6];
                                class90 var355 = class152.method1081(var353, (byte) -86);
                                if (var355.method595((byte) -124)) {
                                    class142.field2678[var7++] = class269.method1828(2, var354).method532(var353, 32, var355.field1739);
                                } else {
                                    class23.field383[var6++] = class269.method1828(class260.method1766(arg0, 2), var354).method520(var355.field1758, var353, -1);
                                }
                                continue;
                            }
                            if (var503 == 4301) {
                                var6--;
                                int var356 = class23.field383[var6];
                                class23.field383[var6++] = class269.method1828(2, var356).field1468;
                                continue;
                            }
                            if (var503 == 4302) {
                                var6--;
                                int var357 = class23.field383[var6];
                                class23.field383[var6++] = class269.method1828(2, var357).field1467;
                                continue;
                            }
                            if (var503 == 4303) {
                                var6--;
                                int var358 = class23.field383[var6];
                                class23.field383[var6++] = class269.method1828(2, var358).field1437;
                                continue;
                            }
                            if (var503 == 4304) {
                                var6--;
                                int var359 = class23.field383[var6];
                                class23.field383[var6++] = class269.method1828(2, var359).field1424;
                                continue;
                            }
                            if (var503 == 4305) {
                                var6--;
                                int var360 = class23.field383[var6];
                                class23.field383[var6++] = class269.method1828(class260.method1766(arg0, 2), var360).field1440;
                                continue;
                            }
                            if (var503 == 4306) {
                                var6--;
                                int var361 = class23.field383[var6];
                                class23.field383[var6++] = class269.method1828(arg0 + 2, var361).field1406;
                                continue;
                            }
                            if (var503 == 4307) {
                                var6--;
                                int var362 = class23.field383[var6];
                                class23.field383[var6++] = class269.method1828(2, var362).field1473;
                                continue;
                            }
                        } else if (var503 >= 4500) {
                            if (var503 >= 4600) {
                                if (var503 < 5100) {
                                    if (var503 == 5000) {
                                        class23.field383[var6++] = class146.field2775;
                                        continue;
                                    }
                                    if (var503 == 5001) {
                                        var6 -= 3;
                                        class146.field2775 = class23.field383[var6];
                                        class206.field3771++;
                                        class92.field1773 = class23.field383[var6 + 1];
                                        class203.field3724 = class23.field383[var6 + 2];
                                        class182.field3349.method577(245, arg0);
                                        class182.field3349.method877((byte) 105, class146.field2775);
                                        class182.field3349.method877((byte) 127, class92.field1773);
                                        class182.field3349.method877((byte) 112, class203.field3724);
                                        continue;
                                    }
                                    if (var503 == 5002) {
                                        class21.field355++;
                                        var6 -= 2;
                                        int var194 = class23.field383[var6];
                                        var7--;
                                        class185 var195 = class142.field2678[var7];
                                        int var196 = class23.field383[var6 + 1];
                                        class182.field3349.method577(238, 0);
                                        class182.field3349.method870(var195.method1327((byte) 101), (byte) 122);
                                        class182.field3349.method877((byte) 112, var194 - 1);
                                        class182.field3349.method877((byte) 125, var196);
                                        continue;
                                    }
                                    if (var503 == 5003) {
                                        var6--;
                                        int var197 = class23.field383[var6];
                                        class185 var198 = null;
                                        if (var197 < 100) {
                                            var198 = class249.field4419[var197];
                                        }
                                        if (var198 == null) {
                                            var198 = class171.field3156;
                                        }
                                        class142.field2678[var7++] = var198;
                                        continue;
                                    }
                                    if (var503 == 5004) {
                                        int var199 = -1;
                                        var6--;
                                        int var200 = class23.field383[var6];
                                        if (var200 < 100 && class249.field4419[var200] != null) {
                                            var199 = class240.field4291[var200];
                                        }
                                        class23.field383[var6++] = var199;
                                        continue;
                                    }
                                    if (var503 == 5005) {
                                        class23.field383[var6++] = class92.field1773;
                                        continue;
                                    }
                                    if (var503 == 5008) {
                                        var7--;
                                        class185 var201 = class142.field2678[var7];
                                        if (var201.method1306(class154.field2921, (byte) 119)) {
                                            class135.method967(var201, 5951);
                                            continue;
                                        }
                                        if (class205.field3769 == 0 && (class212.field3864 && !class118.field2142 || class275.field4880)) {
                                            continue;
                                        }
                                        class185 var202 = var201.method1325(arg0 ^ 0x28);
                                        class155.field2931++;
                                        byte var203 = 0;
                                        if (var202.method1306(class142.field2731, (byte) 125)) {
                                            var201 = var201.method1310(39, class142.field2731.method1311((byte) 49));
                                            var203 = 0;
                                        } else if (var202.method1306(class87.field1701, (byte) 117)) {
                                            var201 = var201.method1310(arg0 ^ 0x27, class87.field1701.method1311((byte) 49));
                                            var203 = 1;
                                        } else if (var202.method1306(class7.field155, (byte) 117)) {
                                            var203 = 2;
                                            var201 = var201.method1310(arg0 + 39, class7.field155.method1311((byte) 49));
                                        } else if (var202.method1306(class120.field2191, (byte) 109)) {
                                            var203 = 3;
                                            var201 = var201.method1310(39, class120.field2191.method1311((byte) 49));
                                        } else if (var202.method1306(class78.field1361, (byte) 109)) {
                                            var201 = var201.method1310(39, class78.field1361.method1311((byte) 49));
                                            var203 = 4;
                                        } else if (var202.method1306(class69.field1216, (byte) 105)) {
                                            var203 = 5;
                                            var201 = var201.method1310(arg0 ^ 0x27, class69.field1216.method1311((byte) 49));
                                        } else if (var202.method1306(class69.field1219, (byte) 106)) {
                                            var203 = 6;
                                            var201 = var201.method1310(arg0 + 39, class69.field1219.method1311((byte) 49));
                                        } else if (var202.method1306(class52.field913, (byte) 124)) {
                                            var201 = var201.method1310(39, class52.field913.method1311((byte) 49));
                                            var203 = 7;
                                        } else if (var202.method1306(class12.field224, (byte) 117)) {
                                            var203 = 8;
                                            var201 = var201.method1310(39, class12.field224.method1311((byte) 49));
                                        } else if (var202.method1306(class216.field3966, (byte) 126)) {
                                            var201 = var201.method1310(39, class216.field3966.method1311((byte) 49));
                                            var203 = 9;
                                        } else if (var202.method1306(class116.field2067, (byte) 104)) {
                                            var203 = 10;
                                            var201 = var201.method1310(39, class116.field2067.method1311((byte) 49));
                                        } else if (var202.method1306(class20.field325, (byte) 124)) {
                                            var203 = 11;
                                            var201 = var201.method1310(39, class20.field325.method1311((byte) 49));
                                        } else if (class198.field3620 != 0) {
                                            if (var202.method1306(class142.field2728, (byte) 116)) {
                                                var203 = 0;
                                                var201 = var201.method1310(39, class142.field2728.method1311((byte) 49));
                                            } else if (var202.method1306(class87.field1706, (byte) 126)) {
                                                var201 = var201.method1310(39, class87.field1706.method1311((byte) 49));
                                                var203 = 1;
                                            } else if (var202.method1306(class7.field148, (byte) 127)) {
                                                var201 = var201.method1310(arg0 + 39, class7.field148.method1311((byte) 49));
                                                var203 = 2;
                                            } else if (var202.method1306(class120.field2184, (byte) 115)) {
                                                var203 = 3;
                                                var201 = var201.method1310(39, class120.field2184.method1311((byte) 49));
                                            } else if (var202.method1306(class78.field1354, (byte) 110)) {
                                                var203 = 4;
                                                var201 = var201.method1310(39, class78.field1354.method1311((byte) 49));
                                            } else if (var202.method1306(class69.field1217, (byte) 122)) {
                                                var203 = 5;
                                                var201 = var201.method1310(39, class69.field1217.method1311((byte) 49));
                                            } else if (var202.method1306(class69.field1213, (byte) 120)) {
                                                var201 = var201.method1310(39, class69.field1213.method1311((byte) 49));
                                                var203 = 6;
                                            } else if (var202.method1306(class52.field902, (byte) 116)) {
                                                var201 = var201.method1310(39, class52.field902.method1311((byte) 49));
                                                var203 = 7;
                                            } else if (var202.method1306(class12.field217, (byte) 114)) {
                                                var203 = 8;
                                                var201 = var201.method1310(39, class12.field217.method1311((byte) 49));
                                            } else if (var202.method1306(class216.field3965, (byte) 124)) {
                                                var203 = 9;
                                                var201 = var201.method1310(arg0 + 39, class216.field3965.method1311((byte) 49));
                                            } else if (var202.method1306(class116.field2066, (byte) 120)) {
                                                var201 = var201.method1310(39, class116.field2066.method1311((byte) 49));
                                                var203 = 10;
                                            } else if (var202.method1306(class20.field326, (byte) 106)) {
                                                var201 = var201.method1310(arg0 + 39, class20.field326.method1311((byte) 49));
                                                var203 = 11;
                                            }
                                        }
                                        byte var204 = 0;
                                        class185 var205 = var201.method1325(arg0 + 40);
                                        if (var205.method1306(class200.field3673, (byte) 123)) {
                                            var201 = var201.method1310(39, class200.field3673.method1311((byte) 49));
                                            var204 = 1;
                                        } else if (var205.method1306(class38.field606, (byte) 119)) {
                                            var201 = var201.method1310(arg0 ^ 0x27, class38.field606.method1311((byte) 49));
                                            var204 = 2;
                                        } else if (var205.method1306(class33.field544, (byte) 110)) {
                                            var201 = var201.method1310(arg0 ^ 0x27, class33.field544.method1311((byte) 49));
                                            var204 = 3;
                                        } else if (var205.method1306(class3.field66, (byte) 120)) {
                                            var204 = 4;
                                            var201 = var201.method1310(39, class3.field66.method1311((byte) 49));
                                        } else if (var205.method1306(class3.field67, (byte) 115)) {
                                            var204 = 5;
                                            var201 = var201.method1310(arg0 + 39, class3.field67.method1311((byte) 49));
                                        } else if (class198.field3620 != 0) {
                                            if (var205.method1306(class200.field3667, (byte) 122)) {
                                                var201 = var201.method1310(39, class200.field3667.method1311((byte) 49));
                                                var204 = 1;
                                            } else if (var205.method1306(class38.field605, (byte) 108)) {
                                                var201 = var201.method1310(39, class38.field605.method1311((byte) 49));
                                                var204 = 2;
                                            } else if (var205.method1306(class33.field549, (byte) 122)) {
                                                var201 = var201.method1310(arg0 + 39, class33.field549.method1311((byte) 49));
                                                var204 = 3;
                                            } else if (var205.method1306(class3.field61, (byte) 122)) {
                                                var201 = var201.method1310(39, class3.field61.method1311((byte) 49));
                                                var204 = 4;
                                            } else if (var205.method1306(class3.field63, (byte) 111)) {
                                                var204 = 5;
                                                var201 = var201.method1310(39, class3.field63.method1311((byte) 49));
                                            }
                                        }
                                        class182.field3349.method577(176, 0);
                                        class182.field3349.method877((byte) 101, 0);
                                        int var206 = class182.field3349.field2155;
                                        class182.field3349.method877((byte) 127, var203);
                                        class182.field3349.method877((byte) 95, var204);
                                        class9.method92(var201, -66, class182.field3349);
                                        class182.field3349.method837(arg0 + 65, -var206 + class182.field3349.field2155);
                                        continue;
                                    }
                                    if (var503 == 5009) {
                                        var7 -= 2;
                                        class185 var207 = class142.field2678[var7];
                                        class185 var208 = class142.field2678[var7 + 1];
                                        if (class205.field3769 != 0 || (!class212.field3864 || class118.field2142) && !class275.field4880) {
                                            class182.field3349.method577(159, 0);
                                            class182.field3349.method877((byte) 115, 0);
                                            class65.field1133++;
                                            int var209 = class182.field3349.field2155;
                                            class182.field3349.method870(var207.method1327((byte) 101), (byte) 122);
                                            class9.method92(var208, -82, class182.field3349);
                                            class182.field3349.method837(-127, class182.field3349.field2155 - var209);
                                        }
                                        continue;
                                    }
                                    if (var503 == 5010) {
                                        var6--;
                                        int var210 = class23.field383[var6];
                                        class185 var211 = null;
                                        if (var210 < 100) {
                                            var211 = class229.field4165[var210];
                                        }
                                        if (var211 == null) {
                                            var211 = class171.field3156;
                                        }
                                        class142.field2678[var7++] = var211;
                                        continue;
                                    }
                                    if (var503 == 5011) {
                                        var6--;
                                        int var212 = class23.field383[var6];
                                        class185 var213 = null;
                                        if (var212 < 100) {
                                            var213 = class254.field4509[var212];
                                        }
                                        if (var213 == null) {
                                            var213 = class171.field3156;
                                        }
                                        class142.field2678[var7++] = var213;
                                        continue;
                                    }
                                    if (var503 == 5012) {
                                        var6--;
                                        int var214 = class23.field383[var6];
                                        int var215 = -1;
                                        if (var214 < 100) {
                                            var215 = class93.field1781[var214];
                                        }
                                        class23.field383[var6++] = var215;
                                        continue;
                                    }
                                    if (var503 == 5015) {
                                        class185 var216;
                                        if (class241.field4310 == null || class241.field4310.field3514 == null) {
                                            var216 = class20.field332;
                                        } else {
                                            var216 = class241.field4310.method1355(arg0 + 8);
                                        }
                                        class142.field2678[var7++] = var216;
                                        continue;
                                    }
                                    if (var503 == 5016) {
                                        class23.field383[var6++] = class203.field3724;
                                        continue;
                                    }
                                    if (var503 == 5017) {
                                        class23.field383[var6++] = class128.field2297;
                                        continue;
                                    }
                                    if (var503 == 5050) {
                                        var6--;
                                        int var217 = class23.field383[var6];
                                        class142.field2678[var7++] = class71.method464((byte) 119, var217).field2797;
                                        continue;
                                    }
                                    if (var503 == 5051) {
                                        var6--;
                                        int var218 = class23.field383[var6];
                                        class148 var219 = class71.method464((byte) 119, var218);
                                        if (var219.field2794 == null) {
                                            class23.field383[var6++] = 0;
                                        } else {
                                            class23.field383[var6++] = var219.field2794.length;
                                        }
                                        continue;
                                    }
                                    if (var503 == 5052) {
                                        var6 -= 2;
                                        int var220 = class23.field383[var6 + 1];
                                        int var221 = class23.field383[var6];
                                        class148 var222 = class71.method464((byte) 119, var221);
                                        int var223 = var222.field2794[var220];
                                        class23.field383[var6++] = var223;
                                        continue;
                                    }
                                    if (var503 == 5053) {
                                        var6--;
                                        int var224 = class23.field383[var6];
                                        class148 var225 = class71.method464((byte) 119, var224);
                                        if (var225.field2799 == null) {
                                            class23.field383[var6++] = 0;
                                        } else {
                                            class23.field383[var6++] = var225.field2799.length;
                                        }
                                        continue;
                                    }
                                    if (var503 == 5054) {
                                        var6 -= 2;
                                        int var226 = class23.field383[var6];
                                        int var227 = class23.field383[var6 + 1];
                                        class23.field383[var6++] = class71.method464((byte) 119, var226).field2799[var227];
                                        continue;
                                    }
                                    if (var503 == 5055) {
                                        var6--;
                                        int var228 = class23.field383[var6];
                                        class142.field2678[var7++] = class90.method593((byte) -93, var228).method744(true);
                                        continue;
                                    }
                                    if (var503 == 5056) {
                                        var6--;
                                        int var229 = class23.field383[var6];
                                        class106 var230 = class90.method593((byte) -112, var229);
                                        if (var230.field1906 == null) {
                                            class23.field383[var6++] = 0;
                                        } else {
                                            class23.field383[var6++] = var230.field1906.length;
                                        }
                                        continue;
                                    }
                                    if (var503 == 5057) {
                                        var6 -= 2;
                                        int var231 = class23.field383[var6 + 1];
                                        int var232 = class23.field383[var6];
                                        class23.field383[var6++] = class90.method593((byte) 87, var232).field1906[var231];
                                        continue;
                                    }
                                    if (var503 == 5058) {
                                        class46.field742 = new class152();
                                        var6--;
                                        class46.field742.field2875 = class23.field383[var6];
                                        class46.field742.field2876 = class90.method593((byte) -56, class46.field742.field2875);
                                        class46.field742.field2878 = new int[class46.field742.field2876.method746(14730)];
                                        continue;
                                    }
                                    if (var503 == 5059) {
                                        class15.field246++;
                                        class182.field3349.method577(70, arg0);
                                        class182.field3349.method877((byte) 125, 0);
                                        int var233 = class182.field3349.field2155;
                                        class182.field3349.method877((byte) 107, 0);
                                        class182.field3349.method856(31133, class46.field742.field2875);
                                        class46.field742.field2876.method752(class46.field742.field2878, class182.field3349, -45);
                                        class182.field3349.method837(93, class182.field3349.field2155 - var233);
                                        continue;
                                    }
                                    if (var503 == 5060) {
                                        class113.field2043++;
                                        var7--;
                                        class185 var234 = class142.field2678[var7];
                                        class182.field3349.method577(193, 0);
                                        class182.field3349.method877((byte) 117, 0);
                                        int var235 = class182.field3349.field2155;
                                        class182.field3349.method870(var234.method1327((byte) 101), (byte) 122);
                                        class182.field3349.method856(31133, class46.field742.field2875);
                                        class46.field742.field2876.method752(class46.field742.field2878, class182.field3349, -90);
                                        class182.field3349.method837(arg0 ^ 0xFFFFFFBE, class182.field3349.field2155 - var235);
                                        continue;
                                    }
                                    if (var503 == 5061) {
                                        class182.field3349.method577(70, 0);
                                        class182.field3349.method877((byte) 122, 0);
                                        class15.field246++;
                                        int var236 = class182.field3349.field2155;
                                        class182.field3349.method877((byte) 121, 1);
                                        class182.field3349.method856(31133, class46.field742.field2875);
                                        class46.field742.field2876.method752(class46.field742.field2878, class182.field3349, -78);
                                        class182.field3349.method837(-115, class182.field3349.field2155 - var236);
                                        continue;
                                    }
                                    if (var503 == 5062) {
                                        var6 -= 2;
                                        int var237 = class23.field383[var6];
                                        int var238 = class23.field383[var6 + 1];
                                        class23.field383[var6++] = class71.method464((byte) 119, var237).field2790[var238];
                                        continue;
                                    }
                                    if (var503 == 5063) {
                                        var6 -= 2;
                                        int var239 = class23.field383[var6 + 1];
                                        int var240 = class23.field383[var6];
                                        class23.field383[var6++] = class71.method464((byte) 119, var240).field2802[var239];
                                        continue;
                                    }
                                    if (var503 == 5064) {
                                        var6 -= 2;
                                        int var241 = class23.field383[var6 + 1];
                                        int var242 = class23.field383[var6];
                                        if (var241 == -1) {
                                            class23.field383[var6++] = -1;
                                        } else {
                                            class23.field383[var6++] = class71.method464((byte) 119, var242).method1051(arg0 - 1, var241);
                                        }
                                        continue;
                                    }
                                    if (var503 == 5065) {
                                        var6 -= 2;
                                        int var243 = class23.field383[var6];
                                        int var244 = class23.field383[var6 + 1];
                                        if (var244 == -1) {
                                            class23.field383[var6++] = -1;
                                        } else {
                                            class23.field383[var6++] = class71.method464((byte) 119, var243).method1053((byte) 96, var244);
                                        }
                                        continue;
                                    }
                                    if (var503 == 5066) {
                                        var6--;
                                        int var245 = class23.field383[var6];
                                        class23.field383[var6++] = class90.method593((byte) 110, var245).method746(14730);
                                        continue;
                                    }
                                    if (var503 == 5067) {
                                        var6 -= 2;
                                        int var246 = class23.field383[var6 + 1];
                                        int var247 = class23.field383[var6];
                                        int var248 = class90.method593((byte) 88, var247).method749(var246, 9073);
                                        class23.field383[var6++] = var248;
                                        continue;
                                    }
                                    if (var503 == 5068) {
                                        var6 -= 2;
                                        int var249 = class23.field383[var6];
                                        int var250 = class23.field383[var6 + 1];
                                        class46.field742.field2878[var249] = var250;
                                        continue;
                                    }
                                    if (var503 == 5069) {
                                        var6 -= 2;
                                        int var251 = class23.field383[var6];
                                        int var252 = class23.field383[var6 + 1];
                                        class46.field742.field2878[var251] = var252;
                                        continue;
                                    }
                                    if (var503 == 5070) {
                                        var6 -= 3;
                                        int var253 = class23.field383[var6 + 1];
                                        int var254 = class23.field383[var6];
                                        int var255 = class23.field383[var6 + 2];
                                        class106 var256 = class90.method593((byte) -72, var254);
                                        if (var256.method749(var253, 9073) != 0) {
                                            throw new RuntimeException("bad command");
                                        }
                                        class23.field383[var6++] = var256.method742(var253, var255, (byte) -110);
                                        continue;
                                    }
                                    if (var503 == 5071) {
                                        var6--;
                                        boolean var257 = class23.field383[var6] == 1;
                                        var7--;
                                        class185 var258 = class142.field2678[var7];
                                        class32.method203(var258, (byte) 81, var257);
                                        class23.field383[var6++] = class182.field3347;
                                        continue;
                                    }
                                    if (var503 == 5072) {
                                        if (class60.field1077 != null && class203.field3716 < class182.field3347) {
                                            class23.field383[var6++] = class220.method1526(class60.field1077[class203.field3716++], 65535);
                                            continue;
                                        }
                                        class23.field383[var6++] = -1;
                                        continue;
                                    }
                                    if (var503 == 5073) {
                                        class203.field3716 = 0;
                                        continue;
                                    }
                                } else if (var503 < 5200) {
                                    if (var503 == 5100) {
                                        if (class139.field2615[86]) {
                                            class23.field383[var6++] = 1;
                                        } else {
                                            class23.field383[var6++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var503 == 5101) {
                                        if (class139.field2615[82]) {
                                            class23.field383[var6++] = 1;
                                        } else {
                                            class23.field383[var6++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var503 == 5102) {
                                        if (class139.field2615[81]) {
                                            class23.field383[var6++] = 1;
                                        } else {
                                            class23.field383[var6++] = 0;
                                        }
                                        continue;
                                    }
                                } else if (var503 < 5300) {
                                    if (var503 == 5200) {
                                        var6--;
                                        class260.method1767(126, class23.field383[var6]);
                                        continue;
                                    }
                                    if (var503 == 5201) {
                                        class23.field383[var6++] = class43.method263((byte) 124);
                                        continue;
                                    }
                                    if (var503 == 5202) {
                                        var6--;
                                        class120.method890(class23.field383[var6], 25706);
                                        continue;
                                    }
                                    if (var503 == 5203) {
                                        var7--;
                                        class154.method1096((byte) -62, class142.field2678[var7]);
                                        continue;
                                    }
                                    if (var503 == 5204) {
                                        class142.field2678[var7 - 1] = class113.method786(class260.method1766(arg0, 0), class142.field2678[var7 - 1]);
                                        continue;
                                    }
                                    if (var503 == 5205) {
                                        var7--;
                                        class259.method1756(class142.field2678[var7], true);
                                        continue;
                                    }
                                    if (var503 == 5206) {
                                        var6--;
                                        int var325 = class23.field383[var6];
                                        class85 var326 = class88.method574(true, var325 & 0x3FFF, var325 >> 14 & 0x3FFF);
                                        if (var326 == null) {
                                            class142.field2678[var7++] = class171.field3156;
                                        } else {
                                            class142.field2678[var7++] = var326.field1680;
                                        }
                                        continue;
                                    }
                                    if (var503 == 5207) {
                                        var7--;
                                        class85 var327 = class92.method602(8130, class142.field2678[var7]);
                                        if (var327 != null && var327.field1674 != null) {
                                            class142.field2678[var7++] = var327.field1674;
                                            continue;
                                        }
                                        class142.field2678[var7++] = class171.field3156;
                                        continue;
                                    }
                                    if (var503 == 5208) {
                                        class23.field383[var6++] = class267.field4730;
                                        class23.field383[var6++] = class169.field3138;
                                        continue;
                                    }
                                    if (var503 == 5209) {
                                        class23.field383[var6++] = class66.field1146 + class252.field4481;
                                        class23.field383[var6++] = class125.field2246 + class264.field4679 - class212.field3884 - 1;
                                        continue;
                                    }
                                    if (var503 == 5210) {
                                        class85 var328 = class236.method1604(-114);
                                        if (var328 == null) {
                                            class23.field383[var6++] = 0;
                                            class23.field383[var6++] = 0;
                                        } else {
                                            class23.field383[var6++] = var328.field1667 * 64;
                                            class23.field383[var6++] = var328.field1669 * 64;
                                        }
                                        continue;
                                    }
                                    if (var503 == 5211) {
                                        class85 var329 = class236.method1604(-80);
                                        if (var329 == null) {
                                            class23.field383[var6++] = 0;
                                            class23.field383[var6++] = 0;
                                        } else {
                                            class23.field383[var6++] = var329.field1678 - var329.field1670;
                                            class23.field383[var6++] = var329.field1679 - var329.field1672;
                                        }
                                        continue;
                                    }
                                    if (var503 == 5212) {
                                        int var330 = class135.method970((byte) -16);
                                        int var331 = 0;
                                        class185 var332;
                                        if (var330 == -1) {
                                            var332 = class171.field3156;
                                        } else {
                                            var332 = class215.field3955.field3136[var330];
                                            var331 = class215.field3955.method1212(var330, (byte) 17);
                                        }
                                        class185 var333 = var332.method1336((byte) -102, class133.field2378, class132.field2369);
                                        class142.field2678[var7++] = var333;
                                        class23.field383[var6++] = var331;
                                        continue;
                                    }
                                    if (var503 == 5213) {
                                        int var334 = class203.method1448(93);
                                        int var335 = 0;
                                        class185 var336;
                                        if (var334 == -1) {
                                            var336 = class171.field3156;
                                        } else {
                                            var336 = class215.field3955.field3136[var334];
                                            var335 = class215.field3955.method1212(var334, (byte) 17);
                                        }
                                        class185 var337 = var336.method1336((byte) -102, class133.field2378, class132.field2369);
                                        class142.field2678[var7++] = var337;
                                        class23.field383[var6++] = var335;
                                        continue;
                                    }
                                    if (var503 == 5214) {
                                        var6--;
                                        int var338 = class23.field383[var6];
                                        class40.method253(arg0 - 13103, (var338 & 0xFFFF3F5) >> 14, var338 & 0x3FFF);
                                        continue;
                                    }
                                    if (var503 == 5215) {
                                        var6--;
                                        int var339 = class23.field383[var6];
                                        var7--;
                                        class185 var340 = class142.field2678[var7];
                                        boolean var341 = false;
                                        class65 var342 = class248.method1668(var339 & 0x3FFF, 7, var339 >> 14 & 0x3FFF);
                                        for (class85 var343 = (class85) var342.method437(10); var343 != null; var343 = (class85) var342.method439(arg0 ^ 0x153F)) {
                                            if (var343.field1680.method1312(var340, -30055)) {
                                                var341 = true;
                                                break;
                                            }
                                        }
                                        if (var341) {
                                            class23.field383[var6++] = 1;
                                        } else {
                                            class23.field383[var6++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var503 == 5216) {
                                        var6--;
                                        int var344 = class23.field383[var6];
                                        class242.method1636((byte) -24, var344);
                                        continue;
                                    }
                                    if (var503 == 5217) {
                                        var6--;
                                        int var345 = class23.field383[var6];
                                        if (class149.method1063((byte) 2, var345)) {
                                            class23.field383[var6++] = 1;
                                        } else {
                                            class23.field383[var6++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var503 == 5218) {
                                        class85 var346 = class236.method1604(arg0 - 78);
                                        if (var346 == null) {
                                            class23.field383[var6++] = -1;
                                        } else {
                                            class23.field383[var6++] = var346.field1684;
                                        }
                                        continue;
                                    }
                                    if (var503 == 5219) {
                                        var7--;
                                        class220.method1524(class142.field2678[var7], false);
                                        continue;
                                    }
                                } else if (var503 < 5400) {
                                    if (var503 == 5300) {
                                        var6 -= 2;
                                        class23.field383[var6++] = 0;
                                        continue;
                                    }
                                    if (var503 == 5301) {
                                        continue;
                                    }
                                    if (var503 == 5302) {
                                        class23.field383[var6++] = 0;
                                        continue;
                                    }
                                    if (var503 == 5303) {
                                        var6--;
                                        class23.field383[var6++] = 0;
                                        class23.field383[var6++] = 0;
                                        continue;
                                    }
                                    if (var503 == 5305) {
                                        byte var259 = -1;
                                        class23.field383[var6++] = var259;
                                        continue;
                                    }
                                    if (var503 == 5306) {
                                        class23.field383[var6++] = class123.method898(true);
                                        continue;
                                    }
                                    if (var503 == 5307) {
                                        var6--;
                                        int var260 = class23.field383[var6];
                                        if (var260 < 0 || var260 > 2) {
                                            var260 = 0;
                                        }
                                        class163.method1173(-1, -1, false, var260, 105);
                                        continue;
                                    }
                                    if (var503 == 5308) {
                                        class23.field383[var6++] = class56.field965;
                                        continue;
                                    }
                                    if (var503 == 5309) {
                                        var6--;
                                        int var261 = class23.field383[var6];
                                        if (var261 < 0 || var261 > 2) {
                                            var261 = 0;
                                        }
                                        class56.field965 = var261;
                                        class264.method1806(class124.field2238, (byte) -88);
                                        continue;
                                    }
                                } else if (var503 < 5500) {
                                    if (var503 == 5400) {
                                        var7 -= 2;
                                        class141.field2638++;
                                        class185 var262 = class142.field2678[var7];
                                        var6--;
                                        int var263 = class23.field383[var6];
                                        class185 var264 = class142.field2678[var7 + 1];
                                        class182.field3349.method577(37, 0);
                                        class182.field3349.method877((byte) 108, (class78.method507(255, var262) + class78.method507(255, var264)) + 1);
                                        class182.field3349.method855((byte) 68, var262);
                                        class182.field3349.method855((byte) -77, var264);
                                        class182.field3349.method877((byte) 113, var263);
                                        continue;
                                    }
                                    if (var503 == 5401) {
                                        var6 -= 2;
                                        class220.field4014[class23.field383[var6]] = (short) class191.method1380(class260.method1766(arg0, -94), class23.field383[var6 + 1]);
                                        class263.method1794(30087);
                                        class48.method306((byte) 124);
                                        class181.method1279(-31909);
                                        class1.method3(128);
                                        class77.method503((byte) 89);
                                        continue;
                                    }
                                    if (var503 == 5405) {
                                        var6 -= 2;
                                        int var265 = class23.field383[var6];
                                        int var266 = class23.field383[var6 + 1];
                                        if (var265 >= 0 && var265 < 2) {
                                            class195.field3582[var265] = new int[var266 << 1][4];
                                        }
                                        continue;
                                    }
                                    if (var503 == 5406) {
                                        var6 -= 7;
                                        int var267 = class23.field383[var6];
                                        int var268 = class23.field383[var6 + 1] << 1;
                                        int var269 = class23.field383[var6 + 3];
                                        int var270 = class23.field383[var6 + 2];
                                        int var271 = class23.field383[var6 + 5];
                                        int var272 = class23.field383[var6 + 6];
                                        int var273 = class23.field383[var6 + 4];
                                        if (var267 >= 0 && var267 < 2 && class195.field3582[var267] != null && var268 >= 0 && var268 < class195.field3582[var267].length) {
                                            class195.field3582[var267][var268] = new int[] { (class220.method1526(var270, 268432709) >> 14) * 128, var269, class220.method1526(16383, var270) * 128, var272 };
                                            class195.field3582[var267][var268 + 1] = new int[] { class220.method1526(var273 >> 14, 16383) * 128, var271, class220.method1526(16383, var273) * 128 };
                                        }
                                        continue;
                                    }
                                    if (var503 == 5407) {
                                        var6--;
                                        int var274 = class195.field3582[class23.field383[var6]].length >> 1;
                                        class23.field383[var6++] = var274;
                                        continue;
                                    }
                                    if (var503 == 5411) {
                                        if (class131.field2357 == null) {
                                            class257.method1749(class33.method206((byte) 100), arg0 + 1621, false);
                                        } else {
                                            System.exit(0);
                                        }
                                        continue;
                                    }
                                    if (var503 == 5419) {
                                        class185 var275 = class171.field3156;
                                        if (class256.field4555 != null) {
                                            var275 = class237.method1607(class256.field4555.field489, (byte) 97);
                                            try {
                                                if (class256.field4555.field486 != null) {
                                                    byte[] var276 = ((String) class256.field4555.field486).getBytes("ISO-8859-1");
                                                    var275 = class204.method1451(var276, (byte) -115, var276.length, 0);
                                                }
                                            } catch (UnsupportedEncodingException var501) {
                                            }
                                        }
                                        class142.field2678[var7++] = var275;
                                        continue;
                                    }
                                    if (var503 == 5420) {
                                        class23.field383[var6++] = class160.field3018 == 3 ? 1 : 0;
                                        continue;
                                    }
                                    if (var503 == 5421) {
                                        var6--;
                                        boolean var277 = class23.field383[var6] == 1;
                                        var7--;
                                        class185 var278 = class142.field2678[var7];
                                        class185 var279 = class87.method567(-11039, new class185[] { class33.method206((byte) 103), var278 });
                                        if (class131.field2357 != null || var277 && class160.field3018 != 3 && class160.field3026.startsWith("win") && !class200.field3675) {
                                            class85.field1677 = var277;
                                            class178.field3257 = var279;
                                            class13.field227 = class124.field2238.method1159((byte) -81, new String(var279.method1339((byte) 105), "ISO-8859-1"));
                                            continue;
                                        }
                                        class257.method1749(var279, 1621, var277);
                                        continue;
                                    }
                                    if (var503 == 5422) {
                                        var7 -= 2;
                                        class185 var280 = class142.field2678[var7];
                                        class185 var281 = class142.field2678[var7 + 1];
                                        var6--;
                                        int var282 = class23.field383[var6];
                                        if (var280.method1311((byte) 49) > 0) {
                                            if (class32.field524 == null) {
                                                class32.field524 = new class185[class132.field2362[class235.field4218]];
                                            }
                                            class32.field524[var282] = var280;
                                        }
                                        if (var281.method1311((byte) 49) > 0) {
                                            if (class20.field324 == null) {
                                                class20.field324 = new class185[class132.field2362[class235.field4218]];
                                            }
                                            class20.field324[var282] = var281;
                                        }
                                        continue;
                                    }
                                    if (var503 == 5423) {
                                        var7--;
                                        class142.field2678[var7].method1326(false);
                                        continue;
                                    }
                                    if (var503 == 5424) {
                                        var6 -= 11;
                                        class215.field3948 = class23.field383[var6];
                                        class130.field2325 = class23.field383[var6 + 1];
                                        class137.field2567 = class23.field383[var6 + 2];
                                        class137.field2569 = class23.field383[var6 + 3];
                                        class19.field311 = class23.field383[var6 + 4];
                                        class64.field1108 = class23.field383[var6 + 5];
                                        class94.field1787 = class23.field383[var6 + 6];
                                        class206.field3777 = class23.field383[var6 + 7];
                                        class249.field4412 = class23.field383[var6 + 8];
                                        class187.field3464 = class23.field383[var6 + 9];
                                        class195.field3589 = class23.field383[var6 + 10];
                                        class21.field365.method1701(class19.field311, -2);
                                        class21.field365.method1701(class64.field1108, arg0 ^ 0xFFFFFFFE);
                                        class21.field365.method1701(class94.field1787, -2);
                                        class21.field365.method1701(class206.field3777, -2);
                                        class21.field365.method1701(class249.field4412, -2);
                                        class176.field3218 = true;
                                        continue;
                                    }
                                    if (var503 == 5425) {
                                        class232.method1589(-12);
                                        class176.field3218 = false;
                                        continue;
                                    }
                                    if (var503 == 5426) {
                                        var6--;
                                        class191.field3537 = class23.field383[var6];
                                        continue;
                                    }
                                    if (var503 == 5427) {
                                        var6 -= 2;
                                        class181.field3335 = class23.field383[var6];
                                        class248.field4405 = class23.field383[var6 + 1];
                                        continue;
                                    }
                                } else if (var503 < 5600) {
                                    if (var503 == 5500) {
                                        var6 -= 4;
                                        int var283 = class23.field383[var6];
                                        int var284 = class23.field383[var6 + 2];
                                        int var285 = class23.field383[var6 + 1];
                                        int var286 = class23.field383[var6 + 3];
                                        class183.method1289(var286, (var283 >> 14 & 0x3FFF) - class77.field1339, true, false, var285, var284, (var283 & 0x3FFF) - class107.field1933);
                                        continue;
                                    }
                                    if (var503 == 5501) {
                                        var6 -= 4;
                                        int var287 = class23.field383[var6];
                                        int var288 = class23.field383[var6 + 1];
                                        int var289 = class23.field383[var6 + 3];
                                        int var290 = class23.field383[var6 + 2];
                                        class116.method806(var289, var290, arg0 ^ 0x7FF, (var287 >> 14 & 0x3FFF) - class77.field1339, var288, (var287 & 0x3FFF) - class107.field1933);
                                        continue;
                                    }
                                    if (var503 == 5502) {
                                        var6 -= 6;
                                        int var291 = class23.field383[var6];
                                        if (var291 >= 2) {
                                            throw new RuntimeException();
                                        }
                                        class188.field3475 = var291;
                                        int var292 = class23.field383[var6 + 1];
                                        if (var292 + 1 >= class195.field3582[class188.field3475].length >> 1) {
                                            throw new RuntimeException();
                                        }
                                        class259.field4606 = var292;
                                        class26.field439 = 0;
                                        class36.field561 = class23.field383[var6 + 2];
                                        class47.field779 = class23.field383[var6 + 3];
                                        int var293 = class23.field383[var6 + 4];
                                        if (var293 >= 2) {
                                            throw new RuntimeException();
                                        }
                                        class109.field1971 = var293;
                                        int var294 = class23.field383[var6 + 5];
                                        if (var294 + 1 >= class195.field3582[class109.field1971].length >> 1) {
                                            throw new RuntimeException();
                                        }
                                        class142.field2729 = var294;
                                        class211.field3848 = 3;
                                        continue;
                                    }
                                    if (var503 == 5503) {
                                        class161.method1166(arg0 ^ 0xFFFFA910);
                                        continue;
                                    }
                                    if (var503 == 5504) {
                                        var6 -= 2;
                                        class43.field681 = class23.field383[var6];
                                        class92.field1765 = class23.field383[var6 + 1];
                                        if (class211.field3848 == 2) {
                                            class3.field69 = class92.field1765;
                                            class136.field2550 = class43.field681;
                                        }
                                        class64.method433((byte) 126);
                                        continue;
                                    }
                                    if (var503 == 5505) {
                                        class23.field383[var6++] = class43.field681;
                                        continue;
                                    }
                                    if (var503 == 5506) {
                                        class23.field383[var6++] = class92.field1765;
                                        continue;
                                    }
                                } else if (var503 < 5700) {
                                    if (var503 == 5600) {
                                        var7 -= 2;
                                        class185 var321 = class142.field2678[var7];
                                        class185 var322 = class142.field2678[var7 + 1];
                                        var6--;
                                        int var323 = class23.field383[var6];
                                        if (class80.field1399 == 10 && class253.field4491 == 0 && class106.field1912 == 0 && class111.field1990 == 0 && class225.field4119 == 0) {
                                            class206.method1462(var321, var322, var323, (byte) -79);
                                        }
                                        continue;
                                    }
                                    if (var503 == 5601) {
                                        class42.method261((byte) -100);
                                        continue;
                                    }
                                    if (var503 == 5602) {
                                        if (class106.field1912 == 0) {
                                            class195.field3588 = -2;
                                        }
                                        continue;
                                    }
                                    if (var503 == 5603) {
                                        var6 -= 4;
                                        if (class80.field1399 == 10 && class253.field4491 == 0 && class106.field1912 == 0 && class111.field1990 == 0 && class225.field4119 == 0) {
                                            class68.method454(class23.field383[var6 + 2], class23.field383[var6], class23.field383[var6 + 1], 64, class23.field383[var6 + 3]);
                                        }
                                        continue;
                                    }
                                    if (var503 == 5604) {
                                        var7--;
                                        if (class80.field1399 == 10 && class253.field4491 == 0 && class106.field1912 == 0 && class111.field1990 == 0 && class225.field4119 == 0) {
                                            class52.method325(class142.field2678[var7].method1327((byte) 101), (byte) 112);
                                        }
                                        continue;
                                    }
                                    if (var503 == 5605) {
                                        var6 -= 4;
                                        var7 -= 2;
                                        if (class80.field1399 == 10 && class253.field4491 == 0 && class106.field1912 == 0 && class111.field1990 == 0 && class225.field4119 == 0) {
                                            class207.method1468(class23.field383[var6 + 2], class23.field383[var6], class23.field383[var6 + 3], class23.field383[var6 + 1], class142.field2678[var7 + 1], class142.field2678[var7].method1327((byte) 101), -120);
                                        }
                                        continue;
                                    }
                                    if (var503 == 5606) {
                                        if (class111.field1990 == 0) {
                                            class2.field42 = -2;
                                        }
                                        continue;
                                    }
                                    if (var503 == 5607) {
                                        class23.field383[var6++] = class195.field3588;
                                        continue;
                                    }
                                    if (var503 == 5608) {
                                        class23.field383[var6++] = class179.field3296;
                                        continue;
                                    }
                                    if (var503 == 5609) {
                                        class23.field383[var6++] = class2.field42;
                                        continue;
                                    }
                                    if (var503 == 5610) {
                                        for (int var324 = 0; var324 < 5; var324++) {
                                            class142.field2678[var7++] = class210.field3826.length <= var324 ? class171.field3156 : class210.field3826[var324].method1334(arg0 + 38);
                                        }
                                        class210.field3826 = null;
                                        continue;
                                    }
                                    if (var503 == 5611) {
                                        class23.field383[var6++] = class154.field2927;
                                        continue;
                                    }
                                } else if (var503 < 6100) {
                                    if (var503 == 6001) {
                                        var6--;
                                        int var295 = class23.field383[var6];
                                        if (var295 < 1) {
                                            var295 = 1;
                                        }
                                        if (var295 > 4) {
                                            var295 = 4;
                                        }
                                        class215.field3951 = var295;
                                        if (class215.field3951 == 1) {
                                            class167.method1201(0.9F);
                                        }
                                        if (class215.field3951 == 2) {
                                            class167.method1201(0.8F);
                                        }
                                        if (class215.field3951 == 3) {
                                            class167.method1201(0.7F);
                                        }
                                        if (class215.field3951 == 4) {
                                            class167.method1201(0.6F);
                                        }
                                        class48.method306((byte) -105);
                                        class264.method1806(class124.field2238, (byte) -105);
                                        class201.field3686 = false;
                                        continue;
                                    }
                                    if (var503 == 6002) {
                                        var6--;
                                        class49.method308(true, class23.field383[var6] == 1);
                                        class46.method287(false);
                                        class64.method431((byte) 81);
                                        class81.method522(-1);
                                        class264.method1806(class124.field2238, (byte) -95);
                                        class201.field3686 = false;
                                        continue;
                                    }
                                    if (var503 == 6003) {
                                        var6--;
                                        class163.field3055 = class23.field383[var6] == 1;
                                        class81.method522(-1);
                                        class264.method1806(class124.field2238, (byte) -118);
                                        class201.field3686 = false;
                                        continue;
                                    }
                                    if (var503 == 6005) {
                                        var6--;
                                        class32.field533 = class23.field383[var6] == 1;
                                        class64.method431((byte) 80);
                                        class264.method1806(class124.field2238, (byte) -105);
                                        class201.field3686 = false;
                                        continue;
                                    }
                                    if (var503 == 6006) {
                                        var6--;
                                        class225.field4116 = class23.field383[var6] == 1;
                                        ((class56) class167.field3116).method387(false, !class225.field4116);
                                        class264.method1806(class124.field2238, (byte) -84);
                                        class201.field3686 = false;
                                        continue;
                                    }
                                    if (var503 == 6007) {
                                        var6--;
                                        class1.field30 = class23.field383[var6] == 1;
                                        class264.method1806(class124.field2238, (byte) -117);
                                        class201.field3686 = false;
                                        continue;
                                    }
                                    if (var503 == 6008) {
                                        var6--;
                                        class7.field160 = class23.field383[var6] == 1;
                                        class264.method1806(class124.field2238, (byte) -122);
                                        class201.field3686 = false;
                                        continue;
                                    }
                                    if (var503 == 6009) {
                                        var6--;
                                        class152.field2884 = class23.field383[var6] == 1;
                                        class264.method1806(class124.field2238, (byte) -87);
                                        class201.field3686 = false;
                                        continue;
                                    }
                                    if (var503 == 6010) {
                                        var6--;
                                        class194.field3578 = class23.field383[var6] == 1;
                                        class264.method1806(class124.field2238, (byte) -117);
                                        class201.field3686 = false;
                                        continue;
                                    }
                                    if (var503 == 6011) {
                                        var6--;
                                        int var296 = class23.field383[var6];
                                        if (var296 < 0 || var296 > 2) {
                                            var296 = 0;
                                        }
                                        class84.field1666 = var296;
                                        class264.method1806(class124.field2238, (byte) -77);
                                        class201.field3686 = false;
                                        continue;
                                    }
                                    if (var503 == 6012) {
                                        var6--;
                                        class217.field3979 = class23.field383[var6] == 1;
                                        if (class215.field3951 == 1) {
                                            class167.method1201(0.9F);
                                        }
                                        if (class215.field3951 == 2) {
                                            class167.method1201(0.8F);
                                        }
                                        if (class215.field3951 == 3) {
                                            class167.method1201(0.7F);
                                        }
                                        if (class215.field3951 == 4) {
                                            class167.method1201(0.6F);
                                        }
                                        class64.method431((byte) 25);
                                        class264.method1806(class124.field2238, (byte) -96);
                                        class201.field3686 = false;
                                        continue;
                                    }
                                    if (var503 == 6014) {
                                        var6--;
                                        class14.field237 = class23.field383[var6] == 1;
                                        class264.method1806(class124.field2238, (byte) -107);
                                        class201.field3686 = false;
                                        continue;
                                    }
                                    if (var503 == 6015) {
                                        var6--;
                                        class178.field3262 = class23.field383[var6] == 1;
                                        class264.method1806(class124.field2238, (byte) -99);
                                        class201.field3686 = false;
                                        continue;
                                    }
                                    if (var503 == 6016) {
                                        var6--;
                                        int var297 = class23.field383[var6];
                                        if (var297 < 0 || var297 > 2) {
                                            var297 = 0;
                                        }
                                        class155.field2937 = var297;
                                        continue;
                                    }
                                    if (var503 == 6017) {
                                        var6--;
                                        class140.field2634 = class23.field383[var6] == 1;
                                        class268.method1822(false);
                                        class264.method1806(class124.field2238, (byte) -108);
                                        class201.field3686 = false;
                                        continue;
                                    }
                                    if (var503 == 6018) {
                                        var6--;
                                        int var298 = class23.field383[var6];
                                        if (var298 < 0) {
                                            var298 = 0;
                                        }
                                        if (var298 > 127) {
                                            var298 = 127;
                                        }
                                        class250.field4461 = var298;
                                        class264.method1806(class124.field2238, (byte) -111);
                                        class201.field3686 = false;
                                        continue;
                                    }
                                    if (var503 == 6019) {
                                        var6--;
                                        int var299 = class23.field383[var6];
                                        if (var299 < 0) {
                                            var299 = 0;
                                        }
                                        if (var299 > 255) {
                                            var299 = 255;
                                        }
                                        if (class193.field3568 != var299) {
                                            if (class193.field3568 == 0 && class38.field607 != -1) {
                                                class38.method241(class181.field3325, var299, arg0 ^ 0xFFFFFFA0, 0, false, class38.field607);
                                                class134.field2405 = false;
                                            } else if (var299 == 0) {
                                                class156.method1106(-45);
                                                class134.field2405 = false;
                                            } else {
                                                class264.method1800(arg0 ^ 0x6E, var299);
                                            }
                                            class193.field3568 = var299;
                                        }
                                        class264.method1806(class124.field2238, (byte) -72);
                                        class201.field3686 = false;
                                        continue;
                                    }
                                    if (var503 == 6020) {
                                        var6--;
                                        int var300 = class23.field383[var6];
                                        if (var300 < 0) {
                                            var300 = 0;
                                        }
                                        if (var300 > 127) {
                                            var300 = 127;
                                        }
                                        class280.field4965 = var300;
                                        class264.method1806(class124.field2238, (byte) -120);
                                        class201.field3686 = false;
                                        continue;
                                    }
                                    if (var503 == 6021) {
                                        var6--;
                                        class256.field4533 = class23.field383[var6] == 1;
                                        class81.method522(~arg0);
                                        continue;
                                    }
                                    if (var503 == 6023) {
                                        boolean var301 = false;
                                        var6--;
                                        int var302 = class23.field383[var6];
                                        if (var302 < 0) {
                                            var302 = 0;
                                        }
                                        if (var302 > 2) {
                                            var302 = 2;
                                        }
                                        if (class94.field1794 < 96) {
                                            var301 = true;
                                            var302 = 0;
                                        }
                                        class16.method119(var302);
                                        class264.method1806(class124.field2238, (byte) -72);
                                        class201.field3686 = false;
                                        class23.field383[var6++] = var301 ? 0 : 1;
                                        continue;
                                    }
                                    if (var503 == 6024) {
                                        var6--;
                                        int var303 = class23.field383[var6];
                                        if (var303 < 0 || var303 > 2) {
                                            var303 = 0;
                                        }
                                        class207.field3809 = var303;
                                        class264.method1806(class124.field2238, (byte) -120);
                                        continue;
                                    }
                                    if (var503 == 6028) {
                                        var6--;
                                        class73.field1277 = class23.field383[var6] != 0;
                                        class264.method1806(class124.field2238, (byte) -125);
                                        continue;
                                    }
                                } else if (var503 < 6200) {
                                    if (var503 == 6101) {
                                        class23.field383[var6++] = class215.field3951;
                                        continue;
                                    }
                                    if (var503 == 6102) {
                                        class23.field383[var6++] = class17.method125(41) ? 1 : 0;
                                        continue;
                                    }
                                    if (var503 == 6103) {
                                        class23.field383[var6++] = class163.field3055 ? 1 : 0;
                                        continue;
                                    }
                                    if (var503 == 6105) {
                                        class23.field383[var6++] = class32.field533 ? 1 : 0;
                                        continue;
                                    }
                                    if (var503 == 6106) {
                                        class23.field383[var6++] = class225.field4116 ? 1 : 0;
                                        continue;
                                    }
                                    if (var503 == 6107) {
                                        class23.field383[var6++] = class1.field30 ? 1 : 0;
                                        continue;
                                    }
                                    if (var503 == 6108) {
                                        class23.field383[var6++] = class7.field160 ? 1 : 0;
                                        continue;
                                    }
                                    if (var503 == 6109) {
                                        class23.field383[var6++] = class152.field2884 ? 1 : 0;
                                        continue;
                                    }
                                    if (var503 == 6110) {
                                        class23.field383[var6++] = class194.field3578 ? 1 : 0;
                                        continue;
                                    }
                                    if (var503 == 6111) {
                                        class23.field383[var6++] = class84.field1666;
                                        continue;
                                    }
                                    if (var503 == 6112) {
                                        class23.field383[var6++] = class217.field3979 ? 1 : 0;
                                        continue;
                                    }
                                    if (var503 == 6114) {
                                        class23.field383[var6++] = class14.field237 ? 1 : 0;
                                        continue;
                                    }
                                    if (var503 == 6115) {
                                        class23.field383[var6++] = class178.field3262 ? 1 : 0;
                                        continue;
                                    }
                                    if (var503 == 6116) {
                                        class23.field383[var6++] = class155.field2937;
                                        continue;
                                    }
                                    if (var503 == 6117) {
                                        class23.field383[var6++] = class140.field2634 ? 1 : 0;
                                        continue;
                                    }
                                    if (var503 == 6118) {
                                        class23.field383[var6++] = class250.field4461;
                                        continue;
                                    }
                                    if (var503 == 6119) {
                                        class23.field383[var6++] = class193.field3568;
                                        continue;
                                    }
                                    if (var503 == 6120) {
                                        class23.field383[var6++] = class280.field4965;
                                        continue;
                                    }
                                    if (var503 == 6121) {
                                        class23.field383[var6++] = 0;
                                        continue;
                                    }
                                    if (var503 == 6123) {
                                        class23.field383[var6++] = class16.method121();
                                        continue;
                                    }
                                    if (var503 == 6124) {
                                        class23.field383[var6++] = class207.field3809;
                                        continue;
                                    }
                                    if (var503 == 6128) {
                                        class23.field383[var6++] = class73.field1277 ? 1 : 0;
                                        continue;
                                    }
                                } else if (var503 < 6300) {
                                    if (var503 == 6200) {
                                        var6 -= 2;
                                        class274.field4856 = (short) class23.field383[var6];
                                        if (class274.field4856 <= 0) {
                                            class274.field4856 = 256;
                                        }
                                        class139.field2607 = (short) class23.field383[var6 + 1];
                                        if (class139.field2607 <= 0) {
                                            class139.field2607 = 205;
                                        }
                                        continue;
                                    }
                                    if (var503 == 6201) {
                                        var6 -= 2;
                                        class18.field300 = (short) class23.field383[var6];
                                        if (class18.field300 <= 0) {
                                            class18.field300 = 256;
                                        }
                                        class21.field356 = (short) class23.field383[var6 + 1];
                                        if (class21.field356 <= 0) {
                                            class21.field356 = 320;
                                        }
                                        continue;
                                    }
                                    if (var503 == 6202) {
                                        var6 -= 4;
                                        class86.field1690 = (short) class23.field383[var6];
                                        if (class86.field1690 <= 0) {
                                            class86.field1690 = 1;
                                        }
                                        class236.field4230 = (short) class23.field383[var6 + 1];
                                        if (class236.field4230 <= 0) {
                                            class236.field4230 = 32767;
                                        } else if (class86.field1690 > class236.field4230) {
                                            class236.field4230 = class86.field1690;
                                        }
                                        class269.field4754 = (short) class23.field383[var6 + 2];
                                        if (class269.field4754 <= 0) {
                                            class269.field4754 = 1;
                                        }
                                        class79.field1381 = (short) class23.field383[var6 + 3];
                                        if (class79.field1381 <= 0) {
                                            class79.field1381 = 32767;
                                        } else if (class79.field1381 < class269.field4754) {
                                            class79.field1381 = class269.field4754;
                                        }
                                        continue;
                                    }
                                    if (var503 == 6203) {
                                        class189.method1364(0, class245.field4361.field1505, false, class245.field4361.field1498, 0, 0);
                                        class23.field383[var6++] = class66.field1162;
                                        class23.field383[var6++] = class94.field1784;
                                        continue;
                                    }
                                    if (var503 == 6204) {
                                        class23.field383[var6++] = class18.field300;
                                        class23.field383[var6++] = class21.field356;
                                        continue;
                                    }
                                    if (var503 == 6205) {
                                        class23.field383[var6++] = class274.field4856;
                                        class23.field383[var6++] = class139.field2607;
                                        continue;
                                    }
                                } else if (var503 < 6400) {
                                    if (var503 == 6300) {
                                        class23.field383[var6++] = (int) (class244.method1644((byte) -92) / 60000L);
                                        continue;
                                    }
                                    if (var503 == 6301) {
                                        class23.field383[var6++] = (int) (class244.method1644((byte) -58) / 86400000L) - 11745;
                                        continue;
                                    }
                                    if (var503 == 6302) {
                                        var6 -= 3;
                                        int var316 = class23.field383[var6 + 1];
                                        int var317 = class23.field383[var6 + 2];
                                        int var318 = class23.field383[var6];
                                        class33.field539.clear();
                                        class33.field539.set(11, 12);
                                        class33.field539.set(var317, var316, var318);
                                        class23.field383[var6++] = (int) (class33.field539.getTime().getTime() / 86400000L) - 11745;
                                        continue;
                                    }
                                    if (var503 == 6303) {
                                        class33.field539.clear();
                                        class33.field539.setTime(new Date(class244.method1644((byte) -104)));
                                        class23.field383[var6++] = class33.field539.get(1);
                                        continue;
                                    }
                                    if (var503 == 6304) {
                                        var6--;
                                        int var319 = class23.field383[var6];
                                        boolean var320 = true;
                                        if (var319 < 0) {
                                            var320 = ((var319 + 1) % 4) == 0;
                                        } else if (var319 < 1582) {
                                            var320 = var319 % 4 == 0;
                                        } else if (var319 % 4 != 0) {
                                            var320 = false;
                                        } else if (var319 % 100 != 0) {
                                            var320 = true;
                                        } else if ((var319 % 400) != 0) {
                                            var320 = false;
                                        }
                                        class23.field383[var6++] = var320 ? 1 : 0;
                                        continue;
                                    }
                                } else if (var503 < 6500) {
                                    if (var503 == 6405) {
                                        class23.field383[var6++] = class76.method495(477) ? 1 : 0;
                                        continue;
                                    }
                                    if (var503 == 6406) {
                                        class23.field383[var6++] = class175.method1241(true) ? 1 : 0;
                                        continue;
                                    }
                                } else if (var503 < 6600) {
                                    if (var503 == 6500) {
                                        if (class80.field1399 == 10 && class253.field4491 == 0 && class106.field1912 == 0 && class111.field1990 == 0) {
                                            class23.field383[var6++] = class255.method1730(-3) == -1 ? 0 : 1;
                                            continue;
                                        }
                                        class23.field383[var6++] = 1;
                                        continue;
                                    }
                                    if (var503 == 6501) {
                                        class199 var304 = class240.method1629(0);
                                        if (var304 == null) {
                                            class23.field383[var6++] = -1;
                                            class23.field383[var6++] = 0;
                                            class142.field2678[var7++] = class171.field3156;
                                            class23.field383[var6++] = 0;
                                            class142.field2678[var7++] = class171.field3156;
                                            class23.field383[var6++] = 0;
                                        } else {
                                            class23.field383[var6++] = var304.field3654;
                                            class23.field383[var6++] = var304.field2895;
                                            class142.field2678[var7++] = var304.field3659;
                                            class237 var305 = var304.method1429(true);
                                            class23.field383[var6++] = var305.field4236;
                                            class142.field2678[var7++] = var305.field4237;
                                            class23.field383[var6++] = var304.field2900;
                                        }
                                        continue;
                                    }
                                    if (var503 == 6502) {
                                        class199 var306 = class18.method128(16);
                                        if (var306 == null) {
                                            class23.field383[var6++] = -1;
                                            class23.field383[var6++] = 0;
                                            class142.field2678[var7++] = class171.field3156;
                                            class23.field383[var6++] = 0;
                                            class142.field2678[var7++] = class171.field3156;
                                            class23.field383[var6++] = 0;
                                        } else {
                                            class23.field383[var6++] = var306.field3654;
                                            class23.field383[var6++] = var306.field2895;
                                            class142.field2678[var7++] = var306.field3659;
                                            class237 var307 = var306.method1429(true);
                                            class23.field383[var6++] = var307.field4236;
                                            class142.field2678[var7++] = var307.field4237;
                                            class23.field383[var6++] = var306.field2900;
                                        }
                                        continue;
                                    }
                                    if (var503 == 6503) {
                                        var6--;
                                        int var308 = class23.field383[var6];
                                        if (class80.field1399 == 10 && class253.field4491 == 0 && class106.field1912 == 0 && class111.field1990 == 0) {
                                            class23.field383[var6++] = class86.method562(var308, (byte) -111) ? 1 : 0;
                                            continue;
                                        }
                                        class23.field383[var6++] = 0;
                                        continue;
                                    }
                                    if (var503 == 6504) {
                                        var6--;
                                        class216.field3962 = class23.field383[var6];
                                        class264.method1806(class124.field2238, (byte) -77);
                                        continue;
                                    }
                                    if (var503 == 6505) {
                                        class23.field383[var6++] = class216.field3962;
                                        continue;
                                    }
                                    if (var503 == 6506) {
                                        var6--;
                                        int var309 = class23.field383[var6];
                                        class199 var310 = class14.method109(87, var309);
                                        if (var310 == null) {
                                            class23.field383[var6++] = -1;
                                            class142.field2678[var7++] = class171.field3156;
                                            class23.field383[var6++] = 0;
                                            class142.field2678[var7++] = class171.field3156;
                                            class23.field383[var6++] = 0;
                                        } else {
                                            class23.field383[var6++] = var310.field2895;
                                            class142.field2678[var7++] = var310.field3659;
                                            class237 var311 = var310.method1429(true);
                                            class23.field383[var6++] = var311.field4236;
                                            class142.field2678[var7++] = var311.field4237;
                                            class23.field383[var6++] = var310.field2900;
                                        }
                                        continue;
                                    }
                                    if (var503 == 6507) {
                                        var6 -= 4;
                                        int var312 = class23.field383[var6];
                                        boolean var313 = class23.field383[var6 + 1] == 1;
                                        int var314 = class23.field383[var6 + 2];
                                        boolean var315 = class23.field383[var6 + 3] == 1;
                                        class32.method198(var315, var314, var313, arg0 ^ 0x1, var312);
                                        continue;
                                    }
                                } else if (var503 < 6700) {
                                    if (var503 == 6600) {
                                        var6--;
                                        class240.field4296 = class23.field383[var6] == 1;
                                        class264.method1806(class124.field2238, (byte) -103);
                                        continue;
                                    }
                                    if (var503 == 6601) {
                                        class23.field383[var6++] = class240.field4296 ? 1 : 0;
                                        continue;
                                    }
                                }
                            } else if (var503 == 4500) {
                                var6 -= 2;
                                int var347 = class23.field383[var6];
                                int var348 = class23.field383[var6 + 1];
                                class90 var349 = class152.method1081(var348, (byte) -86);
                                if (var349.method595((byte) -124)) {
                                    class142.field2678[var7++] = class109.method768(var347, -92).method1009(var349.field1739, var348, (byte) 123);
                                } else {
                                    class23.field383[var6++] = class109.method768(var347, 62).method1010(var349.field1758, var348, -3691);
                                }
                                continue;
                            }
                        } else if (var503 == 4400) {
                            var6 -= 2;
                            int var350 = class23.field383[var6 + 1];
                            int var351 = class23.field383[var6];
                            class90 var352 = class152.method1081(var350, (byte) -86);
                            if (var352.method595((byte) -124)) {
                                class142.field2678[var7++] = class184.method1294(var351, -28916).method961(var350, class260.method1766(arg0, 3246), var352.field1739);
                            } else {
                                class23.field383[var6++] = class184.method1294(var351, -28916).method974(var350, var352.field1758, (byte) -128);
                            }
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var502) {
            if (var5.field3798 == null) {
                if (class259.field4601 != 0) {
                    class1.method5(class171.field3156, 0, true, class256.field4556);
                }
                class3.method33("CS2 - scr:" + var5.field1278 + " op:" + var11, var502, (byte) 119);
            } else {
                class185 var498 = class37.method232(30, 0);
                var498.method1337(class207.field3793, -27866).method1337(var5.field3798, -27866);
                for (int var499 = class207.field3808 - 1; var499 >= 0; var499--) {
                    var498.method1337(class238.field4249, arg0 - 27866).method1337(class243.field4339[var499].field3714.field3798, -27866);
                }
                if (var11 == 40) {
                    int var500 = var9[var8];
                    var498.method1337(class109.field1970, -27866).method1337(class90.method591(var500, 0), -27866);
                }
                if (class259.field4601 != 0) {
                    class1.method5(class171.field3156, 0, true, class87.method567(-11039, new class185[] { class106.field1917, var5.field3798 }));
                }
                class3.method33("CS2 - scr:" + var5.field1278 + " op:" + var11 + new String(var498.method1339((byte) 98)), var502, (byte) 124);
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lhi;Lhi;)V")
    public class54(class250 arg0, class250 arg1) {
        this.field918 = arg0;
        this.field929 = arg1;
    }
}
