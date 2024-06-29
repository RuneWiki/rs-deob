import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class210 extends class215 {

    @OriginalMember(owner = "client!hi", name = "Vb", descriptor = "Lpj;")
    public static class237 field3581 = class33.method353("sch-Utteln:", 52);

    @OriginalMember(owner = "client!hi", name = "Yb", descriptor = "[I")
    public static int[] field3584 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!hi", name = "Zb", descriptor = "Lk;")
    public static class175 field3585 = new class175();

    @OriginalMember(owner = "client!hi", name = "dc", descriptor = "Lpj;")
    public static class237 field3589 = class33.method353("(U1", 118);

    @OriginalMember(owner = "client!hi", name = "cc", descriptor = "Lpj;")
    private static class237 field3588 = class33.method353("You can(Wt add yourself to your own ignore list)3", 67);

    @OriginalMember(owner = "client!hi", name = "fc", descriptor = "Lpj;")
    public static class237 field3591 = class33.method353("0", 32);

    @OriginalMember(owner = "client!hi", name = "ec", descriptor = "Lpj;")
    public static class237 field3590 = field3588;

    @OriginalMember(owner = "client!hi", name = "bc", descriptor = "Lub;")
    public static class88 field3587 = new class88();

    @OriginalMember(owner = "client!hi", name = "Nb", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!hi", name = "Ob", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!hi", name = "Qb", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!hi", name = "Rb", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!hi", name = "Sb", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!hi", name = "Tb", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!hi", name = "Ub", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!hi", name = "Xb", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!hi", name = "Wb", descriptor = "Lw;")
    public static class141 field3582;

    @OriginalMember(owner = "client!hi", name = "ac", descriptor = "Leb;")
    public class231 field3586;

    @OriginalMember(owner = "client!hi", name = "Pb", descriptor = "Lfa;")
    public static class239 field3575;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(B)Z")
    public final boolean method1403(byte arg0) {
        ++field3573;
        if (arg0 <= 57) {
            field3587 = null;
        }
        return this.field3586 != null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lfa;IB)Ls;")
    public static final class229 method1404(class239 arg0, int arg1, byte arg2) {
        int var3 = 4 % ((22 - arg2) / 62);
        ++field3583;
        byte[] var4 = arg0.method1656(0, arg1);
        return var4 == null ? null : new class229(var4);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILja;Z)V")
    public static final void method1405(int arg0, class58 arg1, boolean arg2) {
        ++field3577;
        int var3 = arg1.field1191;
        int var4 = (int) arg1.field1530;
        arg1.method629(0);
        if (arg2) {
            class269.method1788((byte) 54, var3);
        }
        class193.method1319(var3, -128);
        class141 var5 = class70.method572(20043, var4);
        if (var5 != null) {
            class128.method911(var5, arg0 ^ -2422);
        }
        int var6 = class271.field4664;
        if (arg0 != 19337) {
            field3589 = null;
        }
        for (int var7 = 0; ~var6 < ~var7; ++var7) {
            if (class197.method1354(class235.field4090[var7], (byte) -124)) {
                class174.method1205((byte) 25, var7);
            }
        }
        if (class271.field4664 != 1) {
            class232.method1542(class23.field423, -26900, class166.field2940, class269.field4599, class176.field3088);
            int var8 = class80.field1507.method1342(class239.field4181);
            for (int var9 = 0; ~var9 > ~class271.field4664; ++var9) {
                int var10 = class80.field1507.method1342(class15.method135((byte) 123, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class23.field423 = var8 - -8;
            class166.field2940 = class271.field4664 * 15 + 22;
        } else {
            class247.field4306 = false;
            class232.method1542(class23.field423, arg0 + -46237, class166.field2940, class269.field4599, class176.field3088);
        }
        if (~class84.field1573 != 0) {
            class16.method146((byte) -91, class84.field1573, 1);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field3576;
        if (this.field3586 != null) {
            class256 var11 = super.field3722 != -1 && ~super.field3688 == -1 ? class256.method1732(super.field3722, true) : null;
            class256 var12 = super.field3696 == -1 || ~super.field3723 == ~super.field3696 && var11 != null ? null : class256.method1732(super.field3696, true);
            class201 var13 = this.field3586.method1533(var11, (byte) 91, super.field3698, super.field3673, var12);
            if (var13 != null) {
                super.field3693 = var13.method176();
                class231 var14 = this.field3586;
                if (var14.field3991 != null) {
                    var14 = var14.method1530(-1);
                }
                if (class63.field1256 && var14.field3954) {
                    class201 var15 = class177.method1223(super.field3710, this.field3586.field3961, super.field3695, this.field3586.field3951, this.field3586.field3989, var13, var12 != null ? super.field3698 : super.field3673, super.field3675, arg0, this.field3586.field3950, var12 == null ? var11 : var12, (byte) 1, this.field3586.field4005, super.field3700);
                    var15.method183(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (this.field3586.field3987 != 0 || ~this.field3586.field4006 != -1) {
                    int var19 = class150.field2676[arg0];
                    int var20 = class150.field2670[arg0];
                    short var21 = this.field3586.field4006;
                    short var22 = this.field3586.field3987;
                    int var23 = -var22 / 2;
                    int var24 = -var21 / 2;
                    int var25 = var19 * var23 + var20 * var24 >> 16;
                    int var26 = var19 * var24 + -(var20 * var23) >> 16;
                    int var27 = var22 / 2;
                    int var28 = class23.method216(-117, super.field3700 - -var26, super.field3710 - -var25, class274.field4798);
                    int var29 = var21 / 2;
                    int var30 = -var22 / 2;
                    int var31 = -var21 / 2;
                    int var32 = var20 * var31 - -(var19 * var27) >> 16;
                    int var33 = var20 * var29 - -(var19 * var30) >> 16;
                    int var34 = var19 * var29 + -(var20 * var30) >> 16;
                    int var35 = var19 * var31 - var20 * var27 >> 16;
                    int var36 = class23.method216(-107, super.field3700 + var35, super.field3710 + var32, class274.field4798);
                    int var37 = var21 / 2;
                    int var38 = var22 / 2;
                    int var39 = var19 * var38 + var20 * var37 >> 16;
                    int var40 = class23.method216(-22, super.field3700 + var34, super.field3710 - -var33, class274.field4798);
                    int var41 = var19 * var37 + -(var20 * var38) >> 16;
                    int var42 = class23.method216(-76, super.field3700 + var41, super.field3710 + var39, class274.field4798);
                    int var43 = var28 + var42;
                    int var44 = ~var36 >= ~var28 ? var36 : var28;
                    if (var36 - -var40 < var43) {
                        var43 = var36 + var40;
                    }
                    int var45 = ~var40 <= ~var42 ? var42 : var40;
                    if (~var21 != -1) {
                        var17 = (int) (Math.atan2((double) (-var45 + var44), (double) var21) * 325.95D) & 2047;
                        if (~var17 != -1) {
                            var13.method184(var17);
                        }
                    }
                    int var46 = ~var36 <= ~var42 ? var42 : var36;
                    int var47 = var28 < var40 ? var28 : var40;
                    if (var22 != 0) {
                        var16 = (int) (325.95D * Math.atan2((double) (-var46 + var47), (double) var22)) & 2047;
                        if (~var16 != -1) {
                            var13.method186(var16);
                        }
                    }
                    var18 = (var43 >> 1) + -super.field3695;
                    if (~var18 != -1) {
                        var13.method190(0, var18, 0);
                    }
                }
                class201 var48 = null;
                if (super.field3734 != -1 && ~super.field3680 != 0) {
                    class49 var49 = class190.method1288(super.field3734, (byte) 105);
                    var48 = var49.method453((byte) 66, super.field3680);
                    if (var48 != null) {
                        var48.method190(0, -super.field3721, 0);
                        if (var49.field1056) {
                            if (~var17 != -1) {
                                var48.method184(var17);
                            }
                            if (~var16 != -1) {
                                var48.method186(var16);
                            }
                            if (~var18 != -1) {
                                var48.method190(0, var18, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class18) var13).method192(var48);
                }
                if (~this.field3586.field3989 == -2) {
                    var13.field3461 = true;
                }
                var13.method183(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIBIIIZI)Z")
    public static final boolean method1406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        ++field3580;
        if (arg6 != -56) {
            return true;
        } else if (~class229.field3911.method1441((byte) 84) == -3) {
            return class214.method1433(arg1, arg8, arg9, arg7, arg3, arg4, arg0, arg11, arg10, arg2, arg5, 19782);
        } else {
            return ~class229.field3911.method1441((byte) 92) < -3 ? class208.method1396(arg10, arg3, arg2, arg9, arg4, (byte) 117, arg1, arg11, arg0, class229.field3911.method1441((byte) 90), arg5, arg8, arg7) : class49.method449(arg8, arg3, arg0, (byte) -77, arg4, arg9, arg2, arg10, arg1, arg5, arg11, arg7);
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "()I")
    public final int method176() {
        ++field3578;
        return super.field3693;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(III)Lta;")
    public static final class244 method1407(int arg0, int arg1, int arg2) {
        class35 var3 = class274.field4775[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class244 var4 = var3.field762;
            var3.field762 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(B)V")
    public static void method1408(byte arg0) {
        field3590 = null;
        field3575 = null;
        field3591 = null;
        field3587 = null;
        field3588 = null;
        field3589 = null;
        if (arg0 != -115) {
            method1407(-37, 27, -2);
        }
        field3585 = null;
        field3582 = null;
        field3584 = null;
        field3581 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Laf;Lie;ZI)V")
    public static final void method1409(class67 arg0, class32 arg1, boolean arg2, int arg3) {
        if (arg2) {
            class227 var4 = new class227();
            ++field3574;
            var4.field3888 = arg1.method316((byte) 108);
            var4.field3882 = arg1.method319((byte) -18);
            var4.field3877 = new int[var4.field3888];
            var4.field3892 = new int[var4.field3888];
            var4.field3878 = new class103[var4.field3888];
            var4.field3880 = new byte[var4.field3888][][];
            var4.field3893 = new int[var4.field3888];
            var4.field3879 = new class103[var4.field3888];
            for (int var5 = 0; var4.field3888 > var5; ++var5) {
                try {
                    int var6 = arg1.method316((byte) -27);
                    if (~var6 != -1 && ~var6 != -2 && ~var6 != -3) {
                        if (var6 == 3 || ~var6 == -5) {
                            String var10 = new String(arg1.method324(1).method1578(-31321));
                            String var11 = new String(arg1.method324(1).method1578(-31321));
                            int var12 = arg1.method316((byte) 116);
                            String[] var13 = new String[var12];
                            for (int var14 = 0; var12 > var14; ++var14) {
                                var13[var14] = new String(arg1.method324(1).method1578(-31321));
                            }
                            byte[][] var15 = new byte[var12][];
                            if (~var6 == -4) {
                                for (int var16 = 0; ~var12 < ~var16; ++var16) {
                                    int var17 = arg1.method319((byte) -18);
                                    var15[var16] = new byte[var17];
                                    arg1.method308(var15[var16], 0, var17, 0);
                                }
                            }
                            Class[] var18 = new Class[var12];
                            var4.field3877[var5] = var6;
                            for (int var19 = 0; ~var12 < ~var19; ++var19) {
                                var18[var19] = class224.method1489(0, var13[var19]);
                            }
                            var4.field3878[var5] = arg0.method549(var11, class224.method1489(0, var10), false, var18);
                            var4.field3880[var5] = var15;
                        }
                    } else {
                        int var7 = 0;
                        String var8 = new String(arg1.method324(1).method1578(-31321));
                        String var9 = new String(arg1.method324(1).method1578(-31321));
                        if (~var6 == -2) {
                            var7 = arg1.method319((byte) -18);
                        }
                        var4.field3877[var5] = var6;
                        var4.field3893[var5] = var7;
                        var4.field3879[var5] = arg0.method547(class224.method1489(0, var8), 4765, var9);
                    }
                } catch (ClassNotFoundException var20) {
                    var4.field3892[var5] = -1;
                } catch (SecurityException var21) {
                    var4.field3892[var5] = -2;
                } catch (NullPointerException var22) {
                    var4.field3892[var5] = -3;
                } catch (Exception var23) {
                    var4.field3892[var5] = -4;
                } catch (Throwable var24) {
                    var4.field3892[var5] = -5;
                }
            }
            class16.field278.method675(var4, (byte) -61);
        }
    }
}
