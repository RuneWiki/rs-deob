import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class178 extends class157 {

    @OriginalMember(owner = "client!mj", name = "Tb", descriptor = "I")
    public static int field3120 = 0;

    @OriginalMember(owner = "client!mj", name = "Wb", descriptor = "Lsc;")
    public static class181 field3123 = class149.method967(255, ":chalreq:");

    @OriginalMember(owner = "client!mj", name = "Rb", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!mj", name = "Sb", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!mj", name = "Ub", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!mj", name = "Vb", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!mj", name = "Xb", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!mj", name = "Yb", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!mj", name = "Zb", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!mj", name = "Qb", descriptor = "Ldi;")
    public class64 field3117;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjb;)I")
    public static final int method1186(int arg0, class11 arg1) {
        ++field3126;
        if (arg0 != 28094) {
            field3122 = -6;
        }
        int var2 = 0;
        if (arg1.method94(class170.field2861, (byte) 75)) {
            ++var2;
        }
        if (arg1.method94(class235.field4087, (byte) 99)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field3119;
        if (this.field3117 != null) {
            class254 var11 = super.field2685 != -1 && super.field2618 == 0 ? class128.method827(super.field2685, 126) : null;
            class254 var12 = ~super.field2629 == 0 || super.field2655 == super.field2629 && var11 != null ? null : class128.method827(super.field2629, 95);
            class249 var13 = this.field3117.method462(115, var12, var11, super.field2656, super.field2661);
            if (var13 != null) {
                super.field2617 = var13.method190();
                class64 var14 = this.field3117;
                if (var14.field1050 != null) {
                    var14 = var14.method458((byte) -54);
                }
                if (class239.field4154 && var14.field1013) {
                    class249 var15 = class188.method1305(this.field3117.field1041, var13, arg0, 37, this.field3117.field995, super.field2632, super.field2654, var12 != null ? var12 : var11, this.field3117.field1006, super.field2622, super.field2681, this.field3117.field992, this.field3117.field1036, var12 != null ? super.field2661 : super.field2656);
                    var15.method194(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (this.field3117.field1032 != 0 || ~this.field3117.field1011 != -1) {
                    int var19 = class72.field1150[arg0];
                    int var20 = class72.field1145[arg0];
                    short var21 = this.field3117.field1032;
                    short var22 = this.field3117.field1011;
                    int var23 = -var21 / 2;
                    int var24 = -var22 / 2;
                    int var25 = var19 * var24 + var20 * var23 >> 16;
                    int var26 = var20 * var24 + -(var19 * var23) >> 16;
                    int var27 = class232.method1606(class38.field581, (byte) -101, super.field2681 + var26, super.field2654 + var25);
                    int var28 = var21 / 2;
                    int var29 = -var22 / 2;
                    int var30 = var19 * var29 + var20 * var28 >> 16;
                    int var31 = var20 * var29 + -(var19 * var28) >> 16;
                    int var32 = class232.method1606(class38.field581, (byte) -87, super.field2681 + var31, super.field2654 - -var30);
                    int var33 = -var21 / 2;
                    int var34 = var22 / 2;
                    int var35 = var19 * var34 + var20 * var33 >> 16;
                    int var36 = var20 * var34 + -(var19 * var33) >> 16;
                    int var37 = var21 / 2;
                    int var38 = class232.method1606(class38.field581, (byte) -101, super.field2681 + var36, super.field2654 + var35);
                    int var39 = var22 / 2;
                    int var40 = var19 * var39 + var20 * var37 >> 16;
                    int var41 = var20 * var39 - var19 * var37 >> 16;
                    int var42 = class232.method1606(class38.field581, (byte) -112, super.field2681 + var41, super.field2654 - -var40);
                    int var43 = var27 - -var42;
                    if (var43 > var32 - -var38) {
                        var43 = var32 + var38;
                    }
                    int var44 = ~var32 >= ~var27 ? var32 : var27;
                    int var45 = var32 >= var42 ? var42 : var32;
                    int var46 = ~var42 >= ~var38 ? var42 : var38;
                    if (var22 != 0) {
                        var16 = 2047 & (int) (Math.atan2((double) (var44 - var46), (double) var22) * 325.95D);
                        if (~var16 != -1) {
                            var13.method1599(var16);
                        }
                    }
                    int var47 = var27 < var38 ? var27 : var38;
                    if (~var21 != -1) {
                        var17 = 2047 & (int) (Math.atan2((double) (-var45 + var47), (double) var21) * 325.95D);
                        if (~var17 != -1) {
                            var13.method1573(var17);
                        }
                    }
                    var18 = (var43 >> 1) + -super.field2622;
                    if (~var18 != -1) {
                        var13.method1596(0, var18, 0);
                    }
                }
                class249 var48 = null;
                if (~super.field2682 != 0 && ~super.field2673 != 0) {
                    class97 var49 = class259.method1760(super.field2682, -18270);
                    var48 = var49.method642(128, super.field2673);
                    if (var48 != null) {
                        var48.method1596(0, -super.field2679, 0);
                        if (var49.field1558) {
                            if (var16 != 0) {
                                var48.method1599(var16);
                            }
                            if (~var17 != -1) {
                                var48.method1573(var17);
                            }
                            if (~var18 != -1) {
                                var48.method1596(0, var18, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class231) var13).method1594(var48);
                }
                if (this.field3117.field995 == 1) {
                    var13.field4336 = true;
                }
                var13.method194(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "()I")
    public final int method190() {
        ++field3121;
        return super.field2617;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
    public static void method1187(byte arg0) {
        if (arg0 <= -25) {
            field3123 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)Z")
    public final boolean method768(byte arg0) {
        ++field3124;
        int var2 = -41 / ((-7 - arg0) / 53);
        return this.field3117 != null;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(Z)V")
    public static final void method1188(boolean arg0) {
        ++field3118;
        class137.field2236 = 0;
        class131.field2176 = 0;
        class198.method1341((byte) -77);
        class162.method1088(8);
        class185.method1290(-90);
        class236.method1617((byte) -88);
        for (int var1 = 0; ~var1 > ~class131.field2176; ++var1) {
            int var3 = class148.field2480[var1];
            if (~class237.field4125 != ~class39.field602[var3].field2639) {
                if (class39.field602[var3].field1925 > 0) {
                    class97.method640(class39.field602[var3], (byte) 101);
                }
                class39.field602[var3] = null;
            }
        }
        if (!arg0) {
            field3120 = -6;
        }
        if (class108.field1772 != class76.field1223.field3933) {
            throw new RuntimeException("gpp1 pos:" + class76.field1223.field3933 + " psize:" + class108.field1772);
        } else {
            for (int var2 = 0; class152.field2538 > var2; ++var2) {
                if (class39.field602[class218.field3750[var2]] == null) {
                    throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class152.field2538);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
    public static final void method1189(int arg0) {
        ++field3125;
        int var1 = class255.field4459 * 128 + 64;
        int var2 = class47.field736 * 128 + 64;
        int var3 = class232.method1606(class38.field581, (byte) -40, var1, var2) - class148.field2469;
        if (~class232.field4054 <= -101) {
            class127.field2100 = class47.field736 * 128 + 64;
            class86.field1370 = class255.field4459 * 128 + 64;
            class228.field3916 = class232.method1606(class38.field581, (byte) -16, class86.field1370, class127.field2100) + -class148.field2469;
        } else {
            if (~var3 < ~class228.field3916) {
                class228.field3916 += class238.field4139 - -((var3 - class228.field3916) * class232.field4054 / 1000);
                if (~var3 > ~class228.field3916) {
                    class228.field3916 = var3;
                }
            }
            if (~var2 < ~class127.field2100) {
                class127.field2100 += (-class127.field2100 + var2) * class232.field4054 / 1000 + class238.field4139;
                if (class127.field2100 > var2) {
                    class127.field2100 = var2;
                }
            }
            if (~var1 < ~class86.field1370) {
                class86.field1370 += class238.field4139 - -((-class86.field1370 + var1) * class232.field4054 / 1000);
                if (var1 < class86.field1370) {
                    class86.field1370 = var1;
                }
            }
            if (~class228.field3916 < ~var3) {
                class228.field3916 -= (-var3 + class228.field3916) * class232.field4054 / 1000 + class238.field4139;
                if (var3 > class228.field3916) {
                    class228.field3916 = var3;
                }
            }
            if (~var1 > ~class86.field1370) {
                class86.field1370 -= (-var1 + class86.field1370) * class232.field4054 / 1000 + class238.field4139;
                if (class86.field1370 < var1) {
                    class86.field1370 = var1;
                }
            }
            if (~var2 > ~class127.field2100) {
                class127.field2100 -= (-var2 + class127.field2100) * class232.field4054 / 1000 + class238.field4139;
                if (class127.field2100 < var2) {
                    class127.field2100 = var2;
                }
            }
        }
        int var4 = class51.field799 * 128 - -64;
        int var5 = class82.field1322 * 128 + 64;
        int var6 = class232.method1606(class38.field581, (byte) -25, var5, var4) - class33.field533;
        int var7 = -class86.field1370 + var5;
        int var8 = -class228.field3916 + var6;
        int var9 = -class127.field2100 + var4;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = 2047 & (int) (325.949D * Math.atan2((double) var8, (double) var10));
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = 2047 & (int) (Math.atan2((double) var9, (double) var7) * -325.949D);
        int var13 = -class47.field734 + var12;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (~var13 > 1023) {
            var13 += 2048;
        }
        if (~var13 < -1) {
            class47.field734 += class76.field1232 * var13 / 1000 + class75.field1209;
            class47.field734 &= 2047;
        }
        if (~class208.field3559 > ~var11) {
            class208.field3559 += (-class208.field3559 + var11) * class76.field1232 / 1000 + class75.field1209;
            if (var11 < class208.field3559) {
                class208.field3559 = var11;
            }
        }
        if (var11 < class208.field3559) {
            class208.field3559 -= (class208.field3559 - var11) * class76.field1232 / 1000 + class75.field1209;
            if (~var11 < ~class208.field3559) {
                class208.field3559 = var11;
            }
        }
        if (arg0 > -48) {
            method1189(-42);
        }
        if (var13 < 0) {
            class47.field734 -= -var13 * class76.field1232 / 1000 + class75.field1209;
            class47.field734 &= 2047;
        }
        int var14 = var12 - class47.field734;
        if (~var14 < -1025) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || ~var14 < -1 && ~var13 > -1) {
            class47.field734 = var12;
        }
    }
}
