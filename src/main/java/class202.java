import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class202 {

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "Lci;")
    private class171 field3445 = new class171();

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    private int field3431;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    private int field3434;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Lpa;")
    private class140 field3437;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Ljj;")
    public static class40 field3433 = new class40();

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "Leg;")
    public static class37 field3448 = class174.method1167("null", -49);

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "Leg;")
    public static class37 field3451 = class174.method1167("; Max)2Age=", -82);

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field3452 = 0;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "[I")
    public static int[] field3443 = new int[50];

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "[Lwd;")
    public static class103[] field3446 = new class103[50];

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "Leg;")
    public static class37 field3453 = class174.method1167(")1a2)1m", 65);

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field3456 = 10;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "Z")
    public static boolean field3458;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static final void method1398(int arg0) {
        field3457++;
        int var1 = class288.field5089.length;
        int var2 = -48 / ((arg0 + 46) / 44);
        for (int var3 = 0; var3 < var1; var3++) {
            if (class288.field5089[var3] != null) {
                int var4 = -1;
                for (int var5 = 0; var5 < class238.field4239; var5++) {
                    if (class44.field693[var5] == class210.field3615[var3]) {
                        var4 = var5;
                        break;
                    }
                }
                if (var4 == -1) {
                    class44.field693[class238.field4239] = class210.field3615[var3];
                    var4 = class238.field4239++;
                }
                class187 var6 = new class187(class288.field5089[var3]);
                int var7 = 0;
                while (var6.field3169 < class288.field5089[var3].length && var7 < 511) {
                    int var8 = var4 | var7++ << 6;
                    int var9 = var6.method1244(false);
                    int var10 = var9 >> 14;
                    int var11 = (var9 & 0x1FD1) >> 7;
                    int var12 = var9 & 0x3F;
                    int var13 = (class210.field3615[var3] >> 8) * 64 + var11 - class40.field642;
                    int var14 = (class210.field3615[var3] & 0xFF) * 64 + var12 - class144.field2456;
                    class275 var15 = class148.method1022(var6.method1244(false), (byte) -116);
                    if (class55.field833[var8] == null && (var15.field4863 & 0x1) > 0 && class73.field1149 == var10 && var13 >= 0 && (var15.field4839 + var13) < 104 && var14 >= 0 && var15.field4839 + var14 < 104) {
                        class55.field833[var8] = new class163();
                        class163 var16 = class55.field833[var8];
                        class98.field1525[class46.field729++] = var8;
                        var16.field1759 = class72.field1146;
                        var16.method1094(-96, var15);
                        var16.method768(var16.field2691.field4839, 24025);
                        var16.field1816 = var16.field1798 = class60.field983[var16.field2691.field4838];
                        var16.field1767 = var16.field2691.field4885;
                        var16.field1790 = var16.field2691.field4877;
                        var16.field1803 = var16.field2691.field4840;
                        var16.field1770 = var16.field2691.field4834;
                        var16.field1827 = var16.field2691.field4868;
                        var16.field1782 = var16.field2691.field4869;
                        var16.field1787 = var16.field2691.field4878;
                        var16.field1819 = var16.field2691.field4850;
                        if (var16.field1819 == 0) {
                            var16.field1798 = 0;
                        }
                        var16.method766(-1, var13, true, var16.method763(-1), var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)I")
    public final int method1399(int arg0) {
        field3449++;
        int var2 = 0;
        for (class22 var3 = (class22) this.field3445.method1148(19271); var3 != null; var3 = (class22) this.field3445.method1142(2682)) {
            if (!var3.method129((byte) -124)) {
                var2++;
            }
        }
        if (arg0 != 14077) {
            this.method1399(105);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lva;I)Lug;")
    public static final class217 method1400(class187 arg0, int arg1) {
        if (arg1 == -28388) {
            field3435++;
            return new class217(arg0.method1276((byte) 93), arg0.method1276((byte) -102), arg0.method1276((byte) -121), arg0.method1276((byte) 54), arg0.method1248((byte) 80), arg0.method1248((byte) -96), arg0.method1268(255));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
    public static final void method1401(int arg0, int arg1) {
        class89.field1405.method1402((byte) -55, arg0);
        class98.field1523.method1402((byte) -112, arg0);
        field3442++;
        int var2 = 100 / ((7 - arg1) / 52);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)V")
    public final void method1402(byte arg0, int arg1) {
        if (arg0 > -9) {
            return;
        }
        field3440++;
        if (class28.field409 == null) {
            return;
        }
        for (class22 var3 = (class22) this.field3445.method1148(19271); var3 != null; var3 = (class22) this.field3445.method1142(2682)) {
            if (var3.method129((byte) -124)) {
                if (var3.method133(-26125) == null) {
                    var3.method441(16773377);
                    var3.method1953(91923);
                    this.field3434++;
                }
            } else if ((++var3.field5125) > ((long) arg1)) {
                class22 var4 = class28.field409.method1324(var3, 0);
                this.field3437.method986(var4, var3.field1027, -1);
                class233.method1604(false, var3, var4);
                var3.method441(16773377);
                var3.method1953(91923);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
    public final void method1403(int arg0) {
        this.field3445.method1145(115);
        field3441++;
        if (arg0 != 45) {
            this.method1410(87, -76L);
        }
        this.field3437.method985(0);
        this.field3434 = this.field3431;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(JZLjava/lang/Object;)V")
    public final void method1404(long arg0, boolean arg1, Object arg2) {
        field3450++;
        if (arg1) {
            this.method1403(-55);
        }
        this.method1410(-5449, arg0);
        if (this.field3434 == 0) {
            class22 var5 = (class22) this.field3445.method1150(-19113);
            var5.method441(16773377);
            var5.method1953(91923);
        } else {
            this.field3434--;
        }
        class21 var6 = new class21(arg2);
        this.field3437.method986(var6, arg0, -1);
        this.field3445.method1152(30, var6);
        var6.field5125 = 0L;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)V")
    public static final void method1405(int arg0, int arg1) {
        field3454++;
        if (arg1 == -1 || !class262.method1772(0, arg1)) {
            return;
        }
        if (arg0 != 13046) {
            method1398(74);
        }
        class237[] var2 = class232.field4000[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class237 var4 = var2[var3];
            if (var4.field4148 != null) {
                class85 var5 = new class85();
                var5.field1346 = var4;
                var5.field1339 = var4.field4148;
                class72.method487(true, 2000000, var5);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)Lic;")
    public static final class274 method1406(int arg0) {
        field3447++;
        class274 var1 = (class274) class224.field3846.method1148(19271);
        if (var1 != null) {
            var1.method441(16773377);
            var1.method1953(91923);
            return var1;
        }
        if (arg0 != -25346) {
            field3448 = null;
        }
        class274 var2;
        do {
            var2 = (class274) class120.field2028.method1148(arg0 ^ 0xFFFFD7B9);
            if (var2 == null) {
                return null;
            }
            if (var2.method1836(-1) > class149.method1024(-14898)) {
                return null;
            }
            var2.method441(16773377);
            var2.method1953(91923);
        } while ((var2.field5125 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method1407(byte arg0) {
        field3433 = null;
        field3451 = null;
        field3448 = null;
        int var1 = -113 / ((arg0 + 12) / 38);
        field3453 = null;
        field3446 = null;
        field3443 = null;
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)[Lja;")
    public static final class105[] method1408(int arg0) {
        if (arg0 != -5) {
            return null;
        }
        field3432++;
        class105[] var1 = new class105[class5.field91];
        for (int var2 = 0; var2 < class5.field91; var2++) {
            int var3 = class224.field3852[var2] * class125.field2101[var2];
            byte[] var4 = class170.field2848[var2];
            if (class242.field4362[var2]) {
                byte[] var7 = class99.field1536[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class94.method617(class96.method626(-16777216, var7[var9] << 24), class262.field4617[class96.method626(255, var4[var9])]);
                }
                var1[var2] = new class157(class257.field4567, class126.field2118, class249.field4476[var2], class158.field2636[var2], class224.field3852[var2], class125.field2101[var2], var8);
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class262.field4617[class96.method626(var4[var6], 255)];
                }
                var1[var2] = new class195(class257.field4567, class126.field2118, class249.field4476[var2], class158.field2636[var2], class224.field3852[var2], class125.field2101[var2], var5);
            }
        }
        class5.method33(24094);
        return var1;
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V")
    public final void method1409(int arg0) {
        for (class22 var2 = (class22) this.field3445.method1148(19271); var2 != null; var2 = (class22) this.field3445.method1142(2682)) {
            if (var2.method129((byte) -124)) {
                var2.method441(16773377);
                var2.method1953(91923);
                this.field3434++;
            }
        }
        field3444++;
        if (arg0 < 74) {
            field3446 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IJ)V")
    public final void method1410(int arg0, long arg1) {
        field3439++;
        if (arg0 != -5449) {
            return;
        }
        class22 var4 = (class22) this.field3437.method992((byte) 125, arg1);
        if (var4 != null) {
            var4.method441(16773377);
            var4.method1953(91923);
            this.field3434++;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method1411(int arg0, long arg1) {
        if (arg0 > -2) {
            method1405(61, 58);
        }
        class22 var4 = (class22) this.field3437.method992((byte) 125, arg1);
        field3438++;
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method133(-26125);
        if (var5 == null) {
            var4.method441(16773377);
            var4.method1953(91923);
            this.field3434++;
            return null;
        }
        if (var4.method129((byte) -124)) {
            class21 var6 = new class21(var5);
            this.field3437.method986(var6, var4.field1027, -1);
            this.field3445.method1152(23, var6);
            var6.field5125 = 0L;
            var4.method441(16773377);
            var4.method1953(91923);
        } else {
            this.field3445.method1152(30, var4);
            var4.field5125 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lpe;IZI)V")
    public static final void method1412(class237 arg0, int arg1, boolean arg2, int arg3) {
        if (arg0.field4069 == 1) {
            class87.method583(arg0.field4211, 0, class179.field2989, 29782, (short) 40, 0L, arg0.field4126);
            class262.field4623++;
        }
        if (arg2) {
            field3443 = null;
        }
        field3436++;
        if (arg0.field4069 == 2 && !class174.field2924) {
            class37 var4 = class263.method1775(0, arg0);
            if (var4 != null) {
                class87.method583(arg0.field4211, -1, class156.method1061((byte) -55, new class37[] { class69.field1089, arg0.field4147 }), 29782, (short) 5, 0L, var4);
                class233.field4020++;
            }
        }
        if (arg0.field4069 == 3) {
            class99.field1531++;
            class87.method583(arg0.field4211, 0, class179.field2989, 29782, (short) 41, 0L, class265.field4653);
        }
        if (arg0.field4069 == 4) {
            class139.field2366++;
            class87.method583(arg0.field4211, 0, class179.field2989, 29782, (short) 48, 0L, arg0.field4126);
        }
        if (arg0.field4069 == 5) {
            class87.method583(arg0.field4211, 0, class179.field2989, 29782, (short) 19, 0L, arg0.field4126);
            class214.field3701++;
        }
        if (arg0.field4069 == 6 && class224.field3840 == null) {
            class102.field1599++;
            class87.method583(arg0.field4211, -1, class179.field2989, 29782, (short) 35, 0L, arg0.field4126);
        }
        if (arg0.field4228 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field4172; var6++) {
                for (int var7 = 0; var7 < arg0.field4141; var7++) {
                    int var8 = (arg0.field4066 + 32) * var6;
                    int var9 = (arg0.field4071 + 32) * var7;
                    if (var5 < 20) {
                        var8 += arg0.field4201[var5];
                        var9 += arg0.field4213[var5];
                    }
                    if (var9 <= arg3 && arg1 >= var8 && arg3 < (var9 + 32) && arg1 < (var8 + 32)) {
                        class181.field3030 = arg0;
                        class143.field2437 = var5;
                        if (arg0.field4094[var5] > 0) {
                            class241 var10 = class9.method52(true, arg0.field4094[var5] - 1);
                            if (class23.field292 == 1 && class80.method544(client.method787(arg0), -25598)) {
                                if (class214.field3706 != arg0.field4211 || class194.field3330 != var5) {
                                    class171.field2872++;
                                    class87.method583(arg0.field4211, var5, class156.method1061((byte) -115, new class37[] { class150.field2523, class107.field1672, var10.field4325 }), 29782, (short) 43, (long) var10.field4301, class86.field1365);
                                }
                            } else if (!class174.field2924 || !class80.method544(client.method787(arg0), -25598)) {
                                class153.field2567++;
                                class37[] var11 = var10.field4297;
                                if (class146.field2489) {
                                    var11 = class129.method919(var11, 2047);
                                }
                                if (class80.method544(client.method787(arg0), -25598)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class284.field5014++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 32;
                                            } else {
                                                var13 = 57;
                                            }
                                            class87.method583(arg0.field4211, var5, class156.method1061((byte) 36, new class37[] { class203.field3461, var10.field4325 }), 29782, var13, (long) var10.field4301, var11[var12]);
                                        } else if (var12 == 4) {
                                            class52.field807++;
                                            class87.method583(arg0.field4211, var5, class156.method1061((byte) 81, new class37[] { class203.field3461, var10.field4325 }), 29782, (short) 57, (long) var10.field4301, class244.field4402);
                                        }
                                    }
                                }
                                if (class231.method1588(client.method787(arg0), (byte) -2)) {
                                    class87.method583(arg0.field4211, var5, class156.method1061((byte) -55, new class37[] { class203.field3461, var10.field4325 }), 29782, (short) 45, (long) var10.field4301, class86.field1365);
                                    class20.field262++;
                                }
                                if (class80.method544(client.method787(arg0), -25598) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 31;
                                            }
                                            if (var14 == 1) {
                                                var15 = 6;
                                            }
                                            if (var14 == 2) {
                                                var15 = 51;
                                            }
                                            class267.field4677++;
                                            class87.method583(arg0.field4211, var5, class156.method1061((byte) 64, new class37[] { class203.field3461, var10.field4325 }), 29782, var15, (long) var10.field4301, var11[var14]);
                                        }
                                    }
                                }
                                class37[] var16 = arg0.field4096;
                                if (class146.field2489) {
                                    var16 = class129.method919(var16, 2047);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class291.field5118++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 10;
                                            }
                                            if (var17 == 1) {
                                                var18 = 15;
                                            }
                                            if (var17 == 2) {
                                                var18 = 9;
                                            }
                                            if (var17 == 3) {
                                                var18 = 59;
                                            }
                                            if (var17 == 4) {
                                                var18 = 37;
                                            }
                                            class87.method583(arg0.field4211, var5, class156.method1061((byte) 83, new class37[] { class203.field3461, var10.field4325 }), 29782, var18, (long) var10.field4301, var16[var17]);
                                        }
                                    }
                                }
                                class87.method583(arg0.field4211, var5, class156.method1061((byte) 116, new class37[] { class203.field3461, var10.field4325 }), 29782, (short) 1004, (long) var10.field4301, class47.field753);
                            } else if ((class274.field4807 & 0x10) == 16) {
                                class86.field1358++;
                                class87.method583(arg0.field4211, var5, class156.method1061((byte) 45, new class37[] { class93.field1464, class107.field1672, var10.field4325 }), 29782, (short) 20, (long) var10.field4301, class147.field2497);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field4129) {
            return;
        }
        if (!class174.field2924) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class37 var23 = class29.method167(-410, var19, arg0);
                if (var23 != null) {
                    class87.method583(arg0.field4211, arg0.field4120, arg0.field4188, 29782, (short) 1002, (long) (var19 + 1), var23);
                    class179.field2986++;
                }
            }
            class37 var20 = class263.method1775(0, arg0);
            if (var20 != null) {
                class233.field4020++;
                class87.method583(arg0.field4211, arg0.field4120, arg0.field4188, 29782, (short) 5, 0L, var20);
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class37 var22 = class29.method167(-410, var21, arg0);
                if (var22 != null) {
                    class87.method583(arg0.field4211, arg0.field4120, arg0.field4188, 29782, (short) 12, (long) (var21 + 1), var22);
                    class179.field2986++;
                }
            }
            if (!class146.method1013((byte) 115, client.method787(arg0))) {
                return;
            }
            class102.field1599++;
            class87.method583(arg0.field4211, arg0.field4120, class179.field2989, 29782, (short) 35, 0L, class133.field2249);
        } else if (class46.method298(client.method787(arg0), 101) && (class274.field4807 & 0x20) == 32) {
            class87.method583(arg0.field4211, arg0.field4120, class156.method1061((byte) 40, new class37[] { class93.field1464, class201.field3413, arg0.field4188 }), 29782, (short) 3, 0L, class147.field2497);
            class92.field1452++;
            return;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(I)V")
    public class202(int arg0) {
        this.field3431 = arg0;
        this.field3434 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3437 = new class140(var2);
    }
}
