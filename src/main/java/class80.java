import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class80 extends class72 {

    @OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
    public static int field1493 = 0;

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!haa", name = "k", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!haa", name = "l", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!haa", name = "m", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!haa", name = "n", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!haa", name = "o", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!haa", name = "p", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)V")
    public static final void method786(byte arg0) {
        ++field1495;
        if (arg0 != 45) {
            method786((byte) 90);
        }
        for (int var1 = 0; class522.field7393 > var1; ++var1) {
            class467.field6737[var1] = null;
        }
        class522.field7393 = 0;
        for (int var2 = 0; class749.field10470 > var2; ++var2) {
            for (int var42 = 0; class613.field8871 > var42; ++var42) {
                for (int var43 = 0; var43 < class453.field6328; ++var43) {
                    class416 var44 = class390.field5454[var2][var43][var42];
                    if (var44 != null) {
                        if (~var44.field5833 < -1) {
                            var44.field5833 = (short) (var44.field5833 * -1);
                        }
                        if (~var44.field5836 < -1) {
                            var44.field5836 = (short) (var44.field5836 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; class749.field10470 > var3; ++var3) {
            for (int var4 = 0; var4 < class613.field8871; ++var4) {
                for (int var5 = 0; var5 < class453.field6328; ++var5) {
                    class416 var6 = class390.field5454[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class390.field5454[0][var5][var4] != null && class390.field5454[0][var5][var4].field5834 != null;
                        if (~var6.field5833 > -1) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class416 var12 = class390.field5454[var3][var5][var4 + -1];
                            int var13 = class173.field2511[var3].method1825(var4, -128, var5);
                            while (var8 > 0 && var12 != null && ~var12.field5833 > -1 && ~var6.field5833 == ~var12.field5833 && var6.field5839 == var12.field5839 && ~class173.field2511[var3].method1825(var8 - 1, -128, var5) == ~var13 && (var8 + -1 <= 0 || var13 == class173.field2511[var3].method1825(var8 + -2, -128, var5))) {
                                --var8;
                                var12 = class390.field5454[var3][var5][var8 + -1];
                            }
                            for (class416 var14 = class390.field5454[var3][var5][var4 + 1]; ~var9 > ~class453.field6328 && var14 != null && ~var14.field5833 > -1 && var6.field5833 == var14.field5833 && var6.field5839 == var14.field5839 && ~var13 == ~class173.field2511[var3].method1825(var9 - -1, -128, var5) && (class453.field6328 <= var9 + 1 || ~class173.field2511[var3].method1825(var9 + 2, -128, var5) == ~var13); var14 = class390.field5454[var3][var5][var9 + 1]) {
                                ++var9;
                            }
                            int var15 = -var3 + 1 + var3;
                            int var16 = class173.field2511[!var7 ? var3 : var3 + 1].method1825(var8, -128, var5);
                            int var17 = var16 - -(var6.field5833 * var15);
                            int var18 = class173.field2511[!var7 ? var3 : var3 - -1].method1825(var9 + 1, arg0 ^ -83, var5);
                            int var19 = var6.field5833 * var15 + var18;
                            int var20 = var5 << class440.field6142;
                            int var21 = var8 << class440.field6142;
                            int var22 = (var9 << class440.field6142) - -class546.field7701;
                            class467.field6737[class522.field7393++] = new class433(1, var3, var6.field5839 + var20, var6.field5839 + var20, var20 - -var6.field5839, var6.field5839 + var20, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; ~var23 >= ~var11; ++var23) {
                                for (int var24 = var8; ~var9 <= ~var24; ++var24) {
                                    class390.field5454[var23][var5][var24].field5833 = (short) (class390.field5454[var23][var5][var24].field5833 * -1);
                                }
                            }
                        }
                        if (var6.field5836 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class416 var29 = class390.field5454[var3][var5 + -1][var4];
                            int var30 = class173.field2511[var3].method1825(var4, -128, var5);
                            while (~var25 < -1 && var29 != null && ~var29.field5836 > -1 && var6.field5836 == var29.field5836 && ~var6.field5837 == ~var29.field5837 && ~var30 == ~class173.field2511[var3].method1825(var4, -128, var25 + -1) && (var25 + -1 <= 0 || ~var30 == ~class173.field2511[var3].method1825(var4, arg0 + -173, var25 + -2))) {
                                --var25;
                                var29 = class390.field5454[var3][var25 + -1][var4];
                            }
                            for (class416 var31 = class390.field5454[var3][var5 + 1][var4]; class613.field8871 > var26 && var31 != null && ~var31.field5836 > -1 && var6.field5836 == var31.field5836 && var6.field5837 == var31.field5837 && class173.field2511[var3].method1825(var4, -128, var26 + 1) == var30 && (var26 - -1 >= class613.field8871 || class173.field2511[var3].method1825(var4, arg0 + -173, var26 + 2) == var30); var31 = class390.field5454[var3][var26 - -1][var4]) {
                                ++var26;
                            }
                            int var32 = -var3 - -1 + var3;
                            int var33 = class173.field2511[!var7 ? var3 : var3 + 1].method1825(var4, arg0 + -173, var25);
                            int var34 = var6.field5836 * var32 + var33;
                            int var35 = class173.field2511[var7 ? var3 + 1 : var3].method1825(var4, -128, var26 + 1);
                            int var36 = var6.field5836 * var32 + var35;
                            int var37 = var25 << class440.field6142;
                            int var38 = (var26 << class440.field6142) + class546.field7701;
                            int var39 = var4 << class440.field6142;
                            class467.field6737[class522.field7393++] = new class433(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var6.field5837 + var39, var39 - -var6.field5837, var6.field5837 + var39, var6.field5837 + var39);
                            for (int var40 = var3; ~var40 >= ~var28; ++var40) {
                                for (int var41 = var25; var26 >= var41; ++var41) {
                                    class390.field5454[var40][var41][var4].field5836 = (short) (class390.field5454[var40][var41][var4].field5836 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class257.field3726 = true;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(II)V")
    public final void method59(int arg0, int arg1) {
        ++field1498;
        if (arg1 == 3) {
            super.field1282 = arg0;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
    public final void method55(int arg0) {
        ++field1497;
        super.field1282 = this.method60(-3271);
        if (arg0 < 30) {
            field1493 = 13;
        }
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(ILcq;)V")
    public class80(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IZ)V")
    public static final void method787(int arg0, boolean arg1) {
        if (arg0 != 1) {
            field1496 = 69;
        }
        ++class375.field5255;
        ++field1494;
        class135 var2 = class273.method1801(class459.field6629, class14.field187, 2);
        class539.method3178(var2, arg0 ^ -18926);
        for (class548 var3 = (class548) class310.field4383.method4209(false); var3 != null; var3 = (class548) class310.field4383.method4207(9356)) {
            if (!var3.method3618(-108)) {
                var3 = (class548) class310.field4383.method4209(false);
                if (var3 == null) {
                    break;
                }
            }
            if (~var3.field7725 == -1) {
                class740.method4119(var3, true, arg1, 82);
            }
        }
        if (class508.field7243 != null) {
            class262.method1776(arg0 ^ 1, class508.field7243);
            class508.field7243 = null;
        }
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)I")
    public final int method60(int arg0) {
        if (arg0 != -3271) {
            this.method55(-126);
        }
        ++field1499;
        return !super.field1286.method2818(true) ? 0 : 1;
    }

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "(I)I")
    public final int method788(int arg0) {
        ++field1491;
        return arg0 != 27669 ? 74 : super.field1282;
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lcq;)V")
    public class80(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(II)I")
    public final int method58(int arg0, int arg1) {
        if (arg1 != 11260) {
            return 115;
        } else {
            ++field1492;
            return 3;
        }
    }
}
