import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class463 extends class530 {

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public static int field6340 = 0;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "Lqk;")
    public static class148 field6338 = new class148(115, 8);

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)I", line = 5)
    public final int method74(int arg0) {
        ++field6342;
        if (arg0 != 0) {
            field6340 = -104;
        }
        return 3;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V", line = 16)
    public static void method2766(int arg0) {
        field6338 = null;
        if (arg0 <= 79) {
            field6345 = 117;
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(ILah;)V", line = 26)
    public class463(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)V", line = 30)
    public final void method70(int arg0, int arg1) {
        super.field7419 = arg0;
        if (arg1 >= -38) {
            this.method2769(17);
        }
        ++field6339;
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)V", line = 43)
    public static final void method2767(int arg0) {
        ++field6341;
        if (arg0 <= 45) {
            method2767(-113);
        }
        class118 var1 = class126.method814(true, 0, 15);
        var1.method778(27970);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)V", line = 59)
    public final void method73(boolean arg0) {
        if (super.field7419 < 0 || super.field7419 > 4) {
            super.field7419 = this.method74(0);
        }
        if (!arg0) {
            this.method2769(-94);
        }
        ++field6344;
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lah;)V", line = 73)
    public class463(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(Z)V", line = 79)
    public static final void method2768(boolean arg0) {
        for (int var1 = 0; class163.field2248 > var1; ++var1) {
            class565.field8029[var1] = null;
        }
        ++field6343;
        class163.field2248 = 0;
        for (int var2 = 0; class214.field3021 > var2; ++var2) {
            for (int var42 = 0; class485.field6556 > var42; ++var42) {
                for (int var43 = 0; ~class314.field4059 < ~var43; ++var43) {
                    class38 var44 = class352.field4549[var2][var43][var42];
                    if (var44 != null) {
                        if (~var44.field536 < -1) {
                            var44.field536 = (short) (var44.field536 * -1);
                        }
                        if (var44.field544 > 0) {
                            var44.field544 = (short) (var44.field544 * -1);
                        }
                    }
                }
            }
        }
        if (arg0) {
            field6340 = -86;
        }
        for (int var3 = 0; var3 < class214.field3021; ++var3) {
            for (int var4 = 0; ~var4 > ~class485.field6556; ++var4) {
                for (int var5 = 0; ~class314.field4059 < ~var5; ++var5) {
                    class38 var6 = class352.field4549[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class352.field4549[0][var5][var4] != null && class352.field4549[0][var5][var4].field531 != null;
                        if (var6.field544 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class38 var12 = class352.field4549[var3][var5][var4 + -1];
                            int var13 = class155.field2126[var3].method1959(124, var4, var5);
                            while (var8 > 0 && var12 != null && ~var12.field544 > -1 && ~var6.field544 == ~var12.field544 && var6.field534 == var12.field534 && class155.field2126[var3].method1959(125, var8 + -1, var5) == var13 && (~(var8 - 1) >= -1 || class155.field2126[var3].method1959(127, var8 + -2, var5) == var13)) {
                                --var8;
                                var12 = class352.field4549[var3][var5][var8 + -1];
                            }
                            for (class38 var14 = class352.field4549[var3][var5][var4 + 1]; ~class314.field4059 < ~var9 && var14 != null && var14.field544 < 0 && var6.field544 == var14.field544 && var6.field534 == var14.field534 && ~class155.field2126[var3].method1959(125, var9 + 1, var5) == ~var13 && (~class314.field4059 >= ~(var9 - -1) || ~class155.field2126[var3].method1959(123, var9 + 2, var5) == ~var13); var14 = class352.field4549[var3][var5][var9 + 1]) {
                                ++var9;
                            }
                            int var15 = -var3 + var3 + 1;
                            int var16 = class155.field2126[!var7 ? var3 : var3 - -1].method1959(125, var8, var5);
                            int var17 = var16 - -(var6.field544 * var15);
                            int var18 = class155.field2126[var7 ? var3 + 1 : var3].method1959(124, var9 + 1, var5);
                            int var19 = var6.field544 * var15 + var18;
                            int var20 = var5 << class509.field7106;
                            int var21 = var8 << class509.field7106;
                            int var22 = (var9 << class509.field7106) + class96.field1402;
                            class565.field8029[class163.field2248++] = new class27(1, var3, var20 - -var6.field534, var20 - -var6.field534, var6.field534 + var20, var20 - -var6.field534, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; ~var11 <= ~var23; ++var23) {
                                for (int var24 = var8; var9 >= var24; ++var24) {
                                    class352.field4549[var23][var5][var24].field544 = (short) (class352.field4549[var23][var5][var24].field544 * -1);
                                }
                            }
                        }
                        if (var6.field536 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class38 var29 = class352.field4549[var3][var5 + -1][var4];
                            int var30 = class155.field2126[var3].method1959(123, var4, var5);
                            while (~var25 < -1 && var29 != null && ~var29.field536 > -1 && ~var6.field536 == ~var29.field536 && ~var6.field541 == ~var29.field541 && class155.field2126[var3].method1959(127, var4, var25 + -1) == var30 && (var25 + -1 <= 0 || ~class155.field2126[var3].method1959(126, var4, var25 + -2) == ~var30)) {
                                --var25;
                                var29 = class352.field4549[var3][var25 - 1][var4];
                            }
                            for (class38 var31 = class352.field4549[var3][var5 + 1][var4]; var26 < class485.field6556 && var31 != null && var31.field536 < 0 && ~var6.field536 == ~var31.field536 && ~var6.field541 == ~var31.field541 && class155.field2126[var3].method1959(124, var4, var26 + 1) == var30 && (~(var26 - -1) <= ~class485.field6556 || class155.field2126[var3].method1959(124, var4, var26 - -2) == var30); var31 = class352.field4549[var3][var26 + 1][var4]) {
                                ++var26;
                            }
                            int var32 = -var3 + var3 - -1;
                            int var33 = class155.field2126[!var7 ? var3 : var3 + 1].method1959(125, var4, var25);
                            int var34 = var6.field536 * var32 + var33;
                            int var35 = class155.field2126[!var7 ? var3 : var3 - -1].method1959(125, var4, var26 + 1);
                            int var36 = var6.field536 * var32 + var35;
                            int var37 = var25 << class509.field7106;
                            int var38 = (var26 << class509.field7106) + class96.field1402;
                            int var39 = var4 << class509.field7106;
                            class565.field8029[class163.field2248++] = new class27(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var6.field541 + var39, var6.field541 + var39, var6.field541 + var39, var6.field541 + var39);
                            for (int var40 = var3; ~var28 <= ~var40; ++var40) {
                                for (int var41 = var25; var41 <= var26; ++var41) {
                                    class352.field4549[var40][var41][var4].field536 = (short) (class352.field4549[var40][var41][var4].field536 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class335.field4302 = true;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)I", line = 306)
    public final int method75(int arg0, int arg1) {
        int var3 = 23 / ((63 - arg1) / 60);
        ++field6346;
        return 1;
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)I", line = 316)
    public final int method2769(int arg0) {
        if (arg0 != 0) {
            field6345 = 51;
        }
        ++field6337;
        return super.field7419;
    }
}
