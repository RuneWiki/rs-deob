import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class91 extends class243 {

    @OriginalMember(owner = "client!tc", name = "fb", descriptor = "I")
    private int field1553 = 3072;

    @OriginalMember(owner = "client!tc", name = "eb", descriptor = "I")
    private int field1552 = 1024;

    @OriginalMember(owner = "client!tc", name = "sb", descriptor = "I")
    private int field1566 = 2048;

    @OriginalMember(owner = "client!tc", name = "db", descriptor = "Lub;")
    private static class227 field1551 = class257.method1749(" has logged out)3", 17263);

    @OriginalMember(owner = "client!tc", name = "ib", descriptor = "Lub;")
    public static class227 field1556 = class257.method1749(":duelfriend:", 17263);

    @OriginalMember(owner = "client!tc", name = "kb", descriptor = "Lub;")
    public static class227 field1558 = class257.method1749("", 17263);

    @OriginalMember(owner = "client!tc", name = "jb", descriptor = "Lub;")
    private static class227 field1557 = class257.method1749("Unable to find ", 17263);

    @OriginalMember(owner = "client!tc", name = "nb", descriptor = "I")
    public static int field1561 = 500;

    @OriginalMember(owner = "client!tc", name = "tb", descriptor = "Lub;")
    public static class227 field1567 = field1551;

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "Lub;")
    public static class227 field1546 = field1558;

    @OriginalMember(owner = "client!tc", name = "qb", descriptor = "Lub;")
    public static class227 field1564 = field1558;

    @OriginalMember(owner = "client!tc", name = "hb", descriptor = "Lub;")
    public static class227 field1555 = field1557;

    @OriginalMember(owner = "client!tc", name = "ob", descriptor = "I")
    public static int field1562 = 0;

    @OriginalMember(owner = "client!tc", name = "lb", descriptor = "I")
    public static int field1559 = 0;

    @OriginalMember(owner = "client!tc", name = "pb", descriptor = "Lub;")
    public static class227 field1563 = class257.method1749("labels)3dat", 17263);

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!tc", name = "bb", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!tc", name = "cb", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!tc", name = "gb", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!tc", name = "rb", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!tc", name = "mb", descriptor = "Ln;")
    public static class138 field1560;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        ++field1548;
        if (arg1) {
            this.field1552 = 37;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field4230 = arg0.method1471(255) == 1;
                }
            } else {
                this.field1553 = arg0.method1447(0);
            }
        } else {
            this.field1552 = arg0.method1447(0);
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class91() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V")
    public static void method536(int arg0) {
        field1564 = null;
        field1563 = null;
        field1551 = null;
        field1557 = null;
        field1567 = null;
        field1558 = null;
        field1556 = null;
        field1555 = null;
        field1560 = null;
        if (arg0 != 14447) {
            method536(-110);
        }
        field1546 = null;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        ++field1565;
        int[] var3 = super.field4215.method984(arg1, 0);
        int var4 = 70 / ((arg0 - -15) / 51);
        if (super.field4215.field2707) {
            int[] var5 = this.method1614(0, arg1, 93);
            for (int var6 = 0; var6 < class212.field3586; ++var6) {
                var3[var6] = this.field1552 - -(var5[var6] * this.field1566 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)V")
    public final void method170(boolean arg0) {
        ++field1554;
        this.field1566 = -this.field1552 + this.field1553;
        if (arg0) {
            field1562 = -105;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field1549;
        if (arg0 != 230) {
            return null;
        } else {
            int[][] var3 = super.field4213.method1406(arg1, arg0 + -230);
            if (super.field4213.field3771) {
                int[][] var4 = this.method1616(arg0 + -231, arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[2];
                int[] var10 = var3[1];
                for (int var11 = 0; ~var11 > ~class212.field3586; ++var11) {
                    var8[var11] = (var5[var11] * this.field1566 >> 12) + this.field1552;
                    var10[var11] = (var6[var11] * this.field1566 >> 12) + this.field1552;
                    var9[var11] = (var7[var11] * this.field1566 >> 12) + this.field1552;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIZIIIIIII)Z")
    public static final boolean method537(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; ++var12) {
            for (int var31 = 0; var31 < 104; ++var31) {
                class41.field674[var12][var31] = 0;
                class45.field777[var12][var31] = 99999999;
            }
        }
        class41.field674[arg9][arg0] = 99;
        int var13 = arg9;
        class45.field777[arg9][arg0] = 0;
        ++field1547;
        int var14 = arg0;
        byte var15 = 0;
        class40.field659[var15] = arg9;
        int var32 = var15 + 1;
        class120.field2188[var15] = arg0;
        int var16 = 0;
        boolean var17 = false;
        int[][] var18 = class78.field1370[class64.field1171].field2338;
        if (arg7 >= -101) {
            return false;
        } else {
            while (var32 != var16) {
                var13 = class40.field659[var16];
                var14 = class120.field2188[var16];
                var16 = var16 - -1 & 4095;
                if (arg2 == var13 && arg8 == var14) {
                    var17 = true;
                    break;
                }
                if (arg5 != 0) {
                    if ((~arg5 > -6 || arg5 == 10) && class78.field1370[class64.field1171].method831(arg10, 116, arg2, arg8, 1, var13, var14, arg5 + -1)) {
                        var17 = true;
                        break;
                    }
                    if (arg5 < 10 && class78.field1370[class64.field1171].method818(var13, arg2, arg10, 1, var14, arg5 + -1, arg8, (byte) -85)) {
                        var17 = true;
                        break;
                    }
                }
                if (arg6 != 0 && ~arg1 != -1 && class78.field1370[class64.field1171].method825(arg11, var13, var14, arg2, 0, arg8, arg6, 1, arg1)) {
                    var17 = true;
                    break;
                }
                int var30 = class45.field777[var13][var14] + 1;
                if (~var13 < -1 && class41.field674[var13 + -1][var14] == 0 && (19661064 & var18[var13 - 1][var14]) == 0) {
                    class40.field659[var32] = var13 - 1;
                    class120.field2188[var32] = var14;
                    var32 = var32 + 1 & 4095;
                    class41.field674[var13 + -1][var14] = 2;
                    class45.field777[var13 + -1][var14] = var30;
                }
                if (~var13 > -104 && ~class41.field674[var13 + 1][var14] == -1 && (var18[var13 + 1][var14] & 19661184) == 0) {
                    class40.field659[var32] = var13 + 1;
                    class120.field2188[var32] = var14;
                    var32 = var32 - -1 & 4095;
                    class41.field674[var13 + 1][var14] = 8;
                    class45.field777[var13 + 1][var14] = var30;
                }
                if (var14 > 0 && class41.field674[var13][var14 + -1] == 0 && (19661058 & var18[var13][var14 - 1]) == 0) {
                    class40.field659[var32] = var13;
                    class120.field2188[var32] = var14 - 1;
                    class41.field674[var13][var14 + -1] = 1;
                    class45.field777[var13][var14 + -1] = var30;
                    var32 = var32 + 1 & 4095;
                }
                if (var14 < 103 && class41.field674[var13][var14 + 1] == 0 && ~(19661088 & var18[var13][var14 - -1]) == -1) {
                    class40.field659[var32] = var13;
                    class120.field2188[var32] = var14 + 1;
                    var32 = 4095 & var32 + 1;
                    class41.field674[var13][var14 - -1] = 4;
                    class45.field777[var13][var14 + 1] = var30;
                }
                if (~var13 < -1 && ~var14 < -1 && class41.field674[var13 + -1][var14 + -1] == 0 && ~(var18[var13 + -1][var14 + -1] & 19661070) == -1 && ~(19661064 & var18[var13 - 1][var14]) == -1 && ~(19661058 & var18[var13][var14 + -1]) == -1) {
                    class40.field659[var32] = var13 - 1;
                    class120.field2188[var32] = var14 - 1;
                    class41.field674[var13 - 1][var14 + -1] = 3;
                    class45.field777[var13 + -1][var14 - 1] = var30;
                    var32 = 4095 & var32 - -1;
                }
                if (~var13 > -104 && var14 > 0 && ~class41.field674[var13 + 1][var14 - 1] == -1 && ~(var18[var13 - -1][var14 + -1] & 19661187) == -1 && (var18[var13 + 1][var14] & 19661184) == 0 && (19661058 & var18[var13][var14 + -1]) == 0) {
                    class40.field659[var32] = var13 + 1;
                    class120.field2188[var32] = var14 + -1;
                    var32 = 4095 & var32 - -1;
                    class41.field674[var13 - -1][var14 + -1] = 9;
                    class45.field777[var13 + 1][var14 - 1] = var30;
                }
                if (~var13 < -1 && var14 < 103 && ~class41.field674[var13 + -1][var14 + 1] == -1 && ~(19661112 & var18[var13 - 1][var14 + 1]) == -1 && (var18[var13 + -1][var14] & 19661064) == 0 && ~(19661088 & var18[var13][var14 + 1]) == -1) {
                    class40.field659[var32] = var13 - 1;
                    class120.field2188[var32] = var14 + 1;
                    class41.field674[var13 - 1][var14 + 1] = 6;
                    var32 = 4095 & var32 + 1;
                    class45.field777[var13 - 1][var14 - -1] = var30;
                }
                if (~var13 > -104 && var14 < 103 && ~class41.field674[var13 + 1][var14 + 1] == -1 && ~(19661280 & var18[var13 + 1][var14 + 1]) == -1 && ~(19661184 & var18[var13 - -1][var14]) == -1 && (var18[var13][var14 + 1] & 19661088) == 0) {
                    class40.field659[var32] = var13 + 1;
                    class120.field2188[var32] = var14 + 1;
                    var32 = 4095 & var32 - -1;
                    class41.field674[var13 + 1][var14 + 1] = 12;
                    class45.field777[var13 + 1][var14 + 1] = var30;
                }
            }
            class193.field3295 = 0;
            if (!var17) {
                if (!arg4) {
                    return false;
                }
                int var19 = 1000;
                int var20 = 100;
                byte var21 = 10;
                for (int var22 = arg2 - var21; arg2 + var21 >= var22; ++var22) {
                    for (int var23 = -var21 + arg8; ~var23 >= ~(arg8 + var21); ++var23) {
                        if (var22 >= 0 && ~var23 <= -1 && var22 < 104 && var23 < 104 && class45.field777[var22][var23] < 100) {
                            int var24 = 0;
                            int var25 = 0;
                            if (var23 >= arg8) {
                                if (arg8 + -1 - -arg1 < var23) {
                                    var25 = -arg8 - -1 + -arg1 + var23;
                                }
                            } else {
                                var25 = -var23 + arg8;
                            }
                            if (arg2 > var22) {
                                var24 = -var22 + arg2;
                            } else if (arg2 + -1 + arg6 < var22) {
                                var24 = var22 - (arg6 + -1) - arg2;
                            }
                            int var26 = var24 * var24 + var25 * var25;
                            if (var26 < var19 || var19 == var26 && ~var20 < ~class45.field777[var22][var23]) {
                                var19 = var26;
                                var20 = class45.field777[var22][var23];
                                var13 = var22;
                                var14 = var23;
                            }
                        }
                    }
                }
                if (~var19 == -1001) {
                    return false;
                }
                if (arg9 == var13 && ~arg0 == ~var14) {
                    return false;
                }
                class193.field3295 = 1;
            }
            byte var27 = 0;
            class40.field659[var27] = var13;
            int var33 = var27 + 1;
            class120.field2188[var27] = var14;
            int var28;
            int var29 = var28 = class41.field674[var13][var14];
            while (arg9 != var13 || ~arg0 != ~var14) {
                if (~var28 != ~var29) {
                    class40.field659[var33] = var13;
                    class120.field2188[var33++] = var14;
                    var28 = var29;
                }
                if ((var29 & 1) == 0) {
                    if (~(var29 & 4) != -1) {
                        --var14;
                    }
                } else {
                    ++var14;
                }
                if ((2 & var29) == 0) {
                    if (~(8 & var29) != -1) {
                        --var13;
                    }
                } else {
                    ++var13;
                }
                var29 = class41.field674[var13][var14];
            }
            if (var33 > 0) {
                class252.method1681(1, arg3, var33);
                return true;
            } else if (arg3 == 1) {
                return false;
            } else {
                return true;
            }
        }
    }
}
