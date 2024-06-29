import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class81 extends class161 {

    @OriginalMember(owner = "client!b", name = "V", descriptor = "Lhj;")
    private static class69 field1545 = class181.method1318("fr", (byte) -124);

    @OriginalMember(owner = "client!b", name = "S", descriptor = "Lhj;")
    private static class69 field1542 = class181.method1318("de", (byte) -110);

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "[Lhj;")
    public static class69[] field1551 = new class69[100];

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "Lhj;")
    private static class69 field1548 = class181.method1318(")3fr", (byte) -116);

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "Lhj;")
    private static class69 field1549 = class181.method1318("en", (byte) -124);

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "I")
    public static int field1554 = 255;

    @OriginalMember(owner = "client!b", name = "fb", descriptor = "Lhj;")
    private static class69 field1555 = class181.method1318(")3de", (byte) -126);

    @OriginalMember(owner = "client!b", name = "W", descriptor = "[I")
    public static int[] field1546 = new int[32];

    @OriginalMember(owner = "client!b", name = "ib", descriptor = "Lhj;")
    private static class69 field1558 = class181.method1318(")3en", (byte) -117);

    @OriginalMember(owner = "client!b", name = "mb", descriptor = "Lhj;")
    public static class69 field1562 = class181.method1318("(U1", (byte) -125);

    @OriginalMember(owner = "client!b", name = "ob", descriptor = "I")
    public static int field1564 = 1;

    @OriginalMember(owner = "client!b", name = "T", descriptor = "[Lhj;")
    public static class69[] field1543 = new class69[] { field1549, field1542, field1545 };

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "[Lhj;")
    private static class69[] field1550 = new class69[] { field1558, field1555, field1548 };

    @OriginalMember(owner = "client!b", name = "nb", descriptor = "Z")
    public static volatile boolean field1563 = true;

    @OriginalMember(owner = "client!b", name = "U", descriptor = "B")
    public byte field1544;

    @OriginalMember(owner = "client!b", name = "X", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!b", name = "cb", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!b", name = "db", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!b", name = "jb", descriptor = "I")
    public int field1559;

    @OriginalMember(owner = "client!b", name = "kb", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!b", name = "lb", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!b", name = "hb", descriptor = "Lfh;")
    public class128 field1557;

    @OriginalMember(owner = "client!b", name = "gb", descriptor = "Lkg;")
    public static class132 field1556;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)Lre;")
    public static final class212 method574(int arg0, int arg1, int arg2) {
        class217 var3 = class158.field2935[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3946;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)V")
    public static final void method575(int arg0, int arg1) {
        if (arg1 == 99999999) {
            ++field1553;
            class104.field1952.method1708(-1009973721, arg0);
            class98.field1826.method1708(arg1 ^ -969349416, arg0);
            class193.field3497.method1708(-1009973721, arg0);
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(Z)I")
    public final int method576(boolean arg0) {
        if (!arg0) {
            return 100;
        } else {
            ++field1560;
            return this.field1557 == null ? 0 : this.field1557.field2379 * 100 / (this.field1557.field2385.length + -this.field1544);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIZIIIIIIII)Z")
    public static final boolean method577(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; ~var12 > -105; ++var12) {
            for (int var31 = 0; ~var31 > -105; ++var31) {
                class41.field580[var12][var31] = 0;
                class98.field1862[var12][var31] = 99999999;
            }
        }
        class41.field580[arg6][arg5] = 99;
        int var13 = arg6;
        class98.field1862[arg6][arg5] = 0;
        int var14 = arg5;
        ++field1552;
        byte var15 = 0;
        int var16 = 0;
        class157.field2923[var15] = arg6;
        int var32 = var15 + 1;
        class230.field4216[var15] = arg5;
        boolean var17 = false;
        int[][] var18 = class79.field1518[class52.field927].field4672;
        while (~var32 != ~var16) {
            var13 = class157.field2923[var16];
            var14 = class230.field4216[var16];
            var16 = 4095 & var16 - -1;
            if (arg9 == var13 && ~arg10 == ~var14) {
                var17 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && class79.field1518[class52.field927].method1810(arg9, -4724, 1, arg11 + -1, var14, var13, arg10, arg2)) {
                    var17 = true;
                    break;
                }
                if (~arg11 > -11 && class79.field1518[class52.field927].method1812(arg10, var14, arg11 - 1, arg9, 1, 1, var13, arg2)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg0 != 0 && class79.field1518[class52.field927].method1811(1, arg4, arg0, arg9, -15578, var13, arg10, arg7, var14)) {
                var17 = true;
                break;
            }
            int var30 = class98.field1862[var13][var14] + 1;
            if (~var13 < -1 && class41.field580[var13 + -1][var14] == 0 && ~(var18[var13 - 1][var14] & 19661064) == -1) {
                class157.field2923[var32] = var13 + -1;
                class230.field4216[var32] = var14;
                class41.field580[var13 + -1][var14] = 2;
                class98.field1862[var13 + -1][var14] = var30;
                var32 = 4095 & var32 + 1;
            }
            if (~var13 > -104 && class41.field580[var13 + 1][var14] == 0 && ~(var18[var13 - -1][var14] & 19661184) == -1) {
                class157.field2923[var32] = var13 - -1;
                class230.field4216[var32] = var14;
                class41.field580[var13 + 1][var14] = 8;
                var32 = var32 + 1 & 4095;
                class98.field1862[var13 + 1][var14] = var30;
            }
            if (~var14 < -1 && class41.field580[var13][var14 - 1] == 0 && ~(19661058 & var18[var13][var14 + -1]) == -1) {
                class157.field2923[var32] = var13;
                class230.field4216[var32] = var14 + -1;
                class41.field580[var13][var14 + -1] = 1;
                var32 = var32 - -1 & 4095;
                class98.field1862[var13][var14 + -1] = var30;
            }
            if (var14 < 103 && class41.field580[var13][var14 + 1] == 0 && (19661088 & var18[var13][var14 + 1]) == 0) {
                class157.field2923[var32] = var13;
                class230.field4216[var32] = var14 + 1;
                var32 = 4095 & var32 + 1;
                class41.field580[var13][var14 + 1] = 4;
                class98.field1862[var13][var14 - -1] = var30;
            }
            if (var13 > 0 && var14 > 0 && ~class41.field580[var13 + -1][var14 + -1] == -1 && (var18[var13 + -1][var14 + -1] & 19661070) == 0 && ~(var18[var13 + -1][var14] & 19661064) == -1 && (var18[var13][var14 + -1] & 19661058) == 0) {
                class157.field2923[var32] = var13 + -1;
                class230.field4216[var32] = var14 + -1;
                class41.field580[var13 + -1][var14 + -1] = 3;
                class98.field1862[var13 + -1][var14 - 1] = var30;
                var32 = var32 + 1 & 4095;
            }
            if (var13 < 103 && ~var14 < -1 && ~class41.field580[var13 + 1][var14 + -1] == -1 && (var18[var13 + 1][var14 + -1] & 19661187) == 0 && (var18[var13 - -1][var14] & 19661184) == 0 && (19661058 & var18[var13][var14 + -1]) == 0) {
                class157.field2923[var32] = var13 + 1;
                class230.field4216[var32] = var14 + -1;
                var32 = var32 - -1 & 4095;
                class41.field580[var13 + 1][var14 - 1] = 9;
                class98.field1862[var13 - -1][var14 + -1] = var30;
            }
            if (var13 > 0 && ~var14 > -104 && class41.field580[var13 - 1][var14 + 1] == 0 && ~(var18[var13 + -1][var14 + 1] & 19661112) == -1 && ~(19661064 & var18[var13 - 1][var14]) == -1 && (var18[var13][var14 + 1] & 19661088) == 0) {
                class157.field2923[var32] = var13 - 1;
                class230.field4216[var32] = var14 + 1;
                class41.field580[var13 + -1][var14 + 1] = 6;
                var32 = 4095 & var32 + 1;
                class98.field1862[var13 - 1][var14 + 1] = var30;
            }
            if (~var13 > -104 && var14 < 103 && ~class41.field580[var13 + 1][var14 + 1] == -1 && ~(19661280 & var18[var13 + 1][var14 + 1]) == -1 && (19661184 & var18[var13 + 1][var14]) == 0 && ~(19661088 & var18[var13][var14 + 1]) == -1) {
                class157.field2923[var32] = var13 + 1;
                class230.field4216[var32] = var14 - -1;
                class41.field580[var13 + 1][var14 + 1] = 12;
                var32 = 4095 & var32 + 1;
                class98.field1862[var13 + 1][var14 - -1] = var30;
            }
        }
        class230.field4209 = 0;
        if (!var17) {
            if (!arg3) {
                return false;
            }
            int var19 = 100;
            int var20 = 1000;
            byte var21 = 10;
            for (int var22 = arg9 - var21; var22 <= arg9 + var21; ++var22) {
                for (int var23 = -var21 + arg10; arg10 + var21 >= var23; ++var23) {
                    if (~var22 <= -1 && var23 >= 0 && var22 < 104 && var23 < 104 && class98.field1862[var22][var23] < 100) {
                        int var24 = 0;
                        if (var22 >= arg9) {
                            if (arg7 + arg9 + -1 < var22) {
                                var24 = -arg7 + -arg9 + var22 + 1;
                            }
                        } else {
                            var24 = -var22 + arg9;
                        }
                        int var25 = 0;
                        if (var23 >= arg10) {
                            if (arg0 + arg10 - 1 < var23) {
                                var25 = -arg0 + 1 + -arg10 + var23;
                            }
                        } else {
                            var25 = arg10 - var23;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (~var26 > ~var20 || var20 == var26 && ~var19 < ~class98.field1862[var22][var23]) {
                            var14 = var23;
                            var13 = var22;
                            var20 = var26;
                            var19 = class98.field1862[var22][var23];
                        }
                    }
                }
            }
            if (~var20 == -1001) {
                return false;
            }
            if (arg6 == var13 && arg5 == var14) {
                return false;
            }
            class230.field4209 = 1;
        }
        byte var27 = 0;
        if (arg8 != -13564) {
            return false;
        } else {
            class157.field2923[var27] = var13;
            int var33 = var27 + 1;
            class230.field4216[var27] = var14;
            int var28;
            int var29 = var28 = class41.field580[var13][var14];
            while (~arg6 != ~var13 || ~arg5 != ~var14) {
                if (~var28 != ~var29) {
                    var28 = var29;
                    class157.field2923[var33] = var13;
                    class230.field4216[var33++] = var14;
                }
                if ((var29 & 1) == 0) {
                    if ((4 & var29) != 0) {
                        --var14;
                    }
                } else {
                    ++var14;
                }
                if (~(var29 & 2) != -1) {
                    ++var13;
                } else if ((var29 & 8) != 0) {
                    --var13;
                }
                var29 = class41.field580[var13][var14];
            }
            if (~var33 < -1) {
                class122.method878(arg1, var33, (byte) 74);
                return true;
            } else if (arg1 == 1) {
                return false;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(Z)V")
    public static void method578(boolean arg0) {
        field1546 = null;
        field1550 = null;
        field1562 = null;
        field1558 = null;
        field1548 = null;
        field1551 = null;
        if (arg0) {
            field1556 = null;
            field1549 = null;
            field1543 = null;
            field1545 = null;
            field1555 = null;
            field1542 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)[B")
    public final byte[] method579(int arg0) {
        if (arg0 != -874) {
            return null;
        } else {
            ++field1547;
            if (!super.field2983 && this.field1557.field2379 >= this.field1557.field2385.length - this.field1544) {
                return this.field1557.field2385;
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method580(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1561;
        int var7 = class240.method1700(class166.field3075, arg4, 127, class19.field252);
        int var8 = class240.method1700(class166.field3075, arg5, 126, class19.field252);
        int var9 = class240.method1700(class35.field485, arg2, 127, class201.field3629);
        int var10 = class240.method1700(class35.field485, arg3, 127, class201.field3629);
        int var11 = class240.method1700(class166.field3075, arg4 - -arg6, 125, class19.field252);
        int var12 = class240.method1700(class166.field3075, -arg6 + arg5, 126, class19.field252);
        for (int var13 = var7; ~var13 > ~var11; ++var13) {
            class99.method740(arg1, class186.field3402[var13], -1162793114, var10, var9);
        }
        if (arg0) {
            method574(-11, 117, 73);
        }
        for (int var14 = var8; ~var14 < ~var12; --var14) {
            class99.method740(arg1, class186.field3402[var14], -1162793114, var10, var9);
        }
        int var15 = class240.method1700(class35.field485, arg2 + arg6, -73, class201.field3629);
        int var16 = class240.method1700(class35.field485, arg3 - arg6, 125, class201.field3629);
        for (int var17 = var11; var12 >= var17; ++var17) {
            int[] var18 = class186.field3402[var17];
            class99.method740(arg1, var18, -1162793114, var15, var9);
            class99.method740(arg1, var18, -1162793114, var10, var16);
        }
    }
}
