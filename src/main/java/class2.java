import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class2 extends class202 {

    @OriginalMember(owner = "client!nk", name = "Nb", descriptor = "[I")
    public static int[] field40 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!nk", name = "Kb", descriptor = "Lhh;")
    public static class163 field37 = class137.method1065(" )2>", 17);

    @OriginalMember(owner = "client!nk", name = "Tb", descriptor = "I")
    public static int field46 = 127;

    @OriginalMember(owner = "client!nk", name = "Db", descriptor = "Lhh;")
    public static class163 field30 = class137.method1065(" zuerst von Ihrer Ignorieren)2Liste(Q", 17);

    @OriginalMember(owner = "client!nk", name = "Vb", descriptor = "Z")
    public static boolean field48 = true;

    @OriginalMember(owner = "client!nk", name = "Ib", descriptor = "B")
    public static byte field35;

    @OriginalMember(owner = "client!nk", name = "Eb", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!nk", name = "Gb", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!nk", name = "Hb", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!nk", name = "Jb", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!nk", name = "Mb", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!nk", name = "Pb", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!nk", name = "Qb", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!nk", name = "Rb", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!nk", name = "Sb", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!nk", name = "Ub", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!nk", name = "Ob", descriptor = "Lse;")
    public class181 field41;

    @OriginalMember(owner = "client!nk", name = "Lb", descriptor = "Lqh;")
    public static class69 field38;

    @OriginalMember(owner = "client!nk", name = "Fb", descriptor = "[Lvf;")
    public static class71[] field32;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILpa;)Lvf;")
    public static final class71 method19(int arg0, int arg1, class123 arg2) {
        ++field39;
        if (arg1 != -20265) {
            method22(-90);
        }
        return !class131.method1038(5825, arg0, arg2) ? null : class231.method1613(arg1 ^ -20265);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field44;
        if (this.field41 != null) {
            class18 var11 = super.field3673 != -1 && super.field3622 == 0 ? class212.method1511(super.field3673, -1) : null;
            class18 var12 = super.field3664 == -1 || super.field3670 == super.field3664 && var11 != null ? null : class212.method1511(super.field3664, -1);
            class70 var13 = this.field41.method1325(super.field3658, var12, true, super.field3650, var11);
            if (var13 != null) {
                super.field3666 = var13.method21();
                class181 var14 = this.field41;
                if (var14.field3329 != null) {
                    var14 = var14.method1330(-1);
                }
                if (client.field2006 && var14.field3305) {
                    class70 var15 = class203.method1448(var12 != null ? super.field3650 : super.field3658, super.field3633, super.field3619, super.field3615, var13, var12 == null ? var11 : var12, this.field41.field3319, this.field41.field3271, -24403, arg0, super.field3659, this.field41.field3310, this.field41.field3309, this.field41.field3274);
                    var15.method20(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (this.field41.field3285 != 0 && ~this.field41.field3331 != -1) {
                    int var19 = class98.field1839[arg0];
                    int var20 = class98.field1843[arg0];
                    short var21 = this.field41.field3331;
                    short var22 = this.field41.field3285;
                    int var23 = -var22 / 2;
                    int var24 = -var21 / 2;
                    int var25 = var19 * var24 + var20 * var23 >> 16;
                    int var26 = var20 * var24 - var19 * var23 >> 16;
                    int var27 = class127.method1011(super.field3615 + var26, super.field3633 + var25, class20.field323, 29908);
                    int var28 = var22 / 2;
                    int var29 = -var21 / 2;
                    int var30 = var20 * var29 + -(var19 * var28) >> 16;
                    int var31 = var19 * var29 + var20 * var28 >> 16;
                    int var32 = class127.method1011(super.field3615 + var30, super.field3633 + var31, class20.field323, 29908);
                    int var33 = -var22 / 2;
                    int var34 = var21 / 2;
                    int var35 = var20 * var34 + -(var19 * var33) >> 16;
                    int var36 = var19 * var34 + var20 * var33 >> 16;
                    int var37 = var22 / 2;
                    int var38 = var21 / 2;
                    int var39 = class127.method1011(super.field3615 + var35, super.field3633 + var36, class20.field323, 29908);
                    int var40 = var19 * var38 + var20 * var37 >> 16;
                    int var41 = var20 * var38 + -(var19 * var37) >> 16;
                    int var42 = var32 > var27 ? var27 : var32;
                    int var43 = class127.method1011(super.field3615 - -var41, super.field3633 + var40, class20.field323, 29908);
                    int var44 = var43 <= var39 ? var43 : var39;
                    int var45 = ~var43 < ~var32 ? var32 : var43;
                    var16 = (int) (Math.atan2((double) (-var44 + var42), (double) var21) * 325.95D) & 2047;
                    int var46 = var27 + var43;
                    if (~(var32 + var39) > ~var46) {
                        var46 = var32 - -var39;
                    }
                    if (~var16 != -1) {
                        var13.method502(var16);
                    }
                    int var47 = ~var27 <= ~var39 ? var39 : var27;
                    var18 = 2047 & (int) (325.95D * Math.atan2((double) (var47 - var45), (double) var22));
                    if (~var18 != -1) {
                        var13.method499(var18);
                    }
                    var17 = (var46 >> 1) + -super.field3619;
                    if (var17 != 0) {
                        var13.method504(0, var17, 0);
                    }
                }
                class70 var48 = null;
                if (super.field3671 != -1 && ~super.field3630 != 0) {
                    class111 var49 = class67.method465(super.field3671, 126);
                    var48 = var49.method888(-26757, super.field3630);
                    if (var48 != null) {
                        var48.method504(0, -super.field3649, 0);
                        if (var49.field2099) {
                            if (~var16 != -1) {
                                var48.method502(var16);
                            }
                            if (var18 != 0) {
                                var48.method499(var18);
                            }
                            if (~var17 != -1) {
                                var48.method504(0, var17, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class207) var13).method1491(var48);
                }
                if (this.field41.field3274 == 1) {
                    var13.field1333 = true;
                }
                var13.method20(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "()I")
    public final int method21() {
        ++field45;
        return super.field3666;
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V")
    public static void method22(int arg0) {
        field38 = null;
        field30 = null;
        if (arg0 != 12210) {
            field37 = null;
        }
        field37 = null;
        field32 = null;
        field40 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lpg;B)Lhh;")
    public static final class163 method23(class81 arg0, byte arg1) {
        ++field34;
        return arg1 < 83 ? null : class124.method993(32767, (byte) 112, arg0);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)Z")
    public final boolean method24(byte arg0) {
        ++field43;
        if (this.field41 == null) {
            return false;
        } else {
            return arg0 < 31 ? true : true;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(JI)V")
    public static final void method25(long arg0, int arg1) {
        ++field33;
        if (arg0 != 0L) {
            for (int var3 = 0; ~class155.field2889 < ~var3; ++var3) {
                if (class48.field798[var3] == arg0) {
                    --class155.field2889;
                    ++class97.field1832;
                    for (int var4 = var3; class155.field2889 > var4; ++var4) {
                        class46.field769[var4] = class46.field769[var4 - -1];
                        class196.field3543[var4] = class196.field3543[var4 + 1];
                        class127.field2479[var4] = class127.field2479[var4 + 1];
                        class48.field798[var4] = class48.field798[var4 + 1];
                        class146.field2780[var4] = class146.field2780[var4 + 1];
                        class102.field1964[var4] = class102.field1964[var4 - -1];
                    }
                    class208.field3780 = class24.field384;
                    class191.field3499.method75(214, arg1 ^ -29143);
                    class191.field3499.method651(arg1 + -645736361, arg0);
                    break;
                }
            }
            if (arg1 != -29159) {
                method25(56L, 43);
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(I)V")
    public static final void method26(int arg0) {
        if (arg0 == -7921) {
            ++field31;
            int var1 = class33.field502.method74((byte) -113, 8);
            if (class95.field1791 > var1) {
                for (int var2 = var1; ~var2 > ~class95.field1791; ++var2) {
                    class257.field4494[class95.field1789++] = class246.field4340[var2];
                }
            }
            if (class95.field1791 < var1) {
                throw new RuntimeException("gppov1");
            } else {
                class95.field1791 = 0;
                for (int var3 = 0; var3 < var1; ++var3) {
                    int var4 = class246.field4340[var3];
                    class126 var5 = class106.field2029[var4];
                    int var6 = class33.field502.method74((byte) -107, 1);
                    if (var6 == 0) {
                        class246.field4340[class95.field1791++] = var4;
                        var5.field3628 = class227.field4092;
                    } else {
                        int var7 = class33.field502.method74((byte) -86, 2);
                        if (~var7 == -1) {
                            class246.field4340[class95.field1791++] = var4;
                            var5.field3628 = class227.field4092;
                            class124.field2392[class222.field4040++] = var4;
                        } else if (~var7 == -2) {
                            class246.field4340[class95.field1791++] = var4;
                            var5.field3628 = class227.field4092;
                            int var8 = class33.field502.method74((byte) -124, 3);
                            var5.method1446(false, false, var8);
                            int var9 = class33.field502.method74((byte) 109, 1);
                            if (~var9 == -2) {
                                class124.field2392[class222.field4040++] = var4;
                            }
                        } else if (var7 == 2) {
                            class246.field4340[class95.field1791++] = var4;
                            var5.field3628 = class227.field4092;
                            int var10 = class33.field502.method74((byte) -76, 3);
                            var5.method1446(false, true, var10);
                            int var11 = class33.field502.method74((byte) 77, 3);
                            var5.method1446(false, true, var11);
                            int var12 = class33.field502.method74((byte) 83, 1);
                            if (var12 == 1) {
                                class124.field2392[class222.field4040++] = var4;
                            }
                        } else if (var7 == 3) {
                            class257.field4494[class95.field1789++] = var4;
                        }
                    }
                }
            }
        }
    }
}
