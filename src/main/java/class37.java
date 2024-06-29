import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class37 extends class107 {

    @OriginalMember(owner = "client!eh", name = "Lb", descriptor = "S")
    public static short field544 = 256;

    @OriginalMember(owner = "client!eh", name = "Mb", descriptor = "J")
    public static long field545 = 0L;

    @OriginalMember(owner = "client!eh", name = "Kb", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!eh", name = "Nb", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!eh", name = "Ob", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!eh", name = "Qb", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!eh", name = "Rb", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!eh", name = "Sb", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!eh", name = "Pb", descriptor = "Lnd;")
    public class206 field548;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field546;
        if (this.field548 != null) {
            class224 var11 = super.field2084 != -1 && ~super.field2061 == -1 ? class47.method335((byte) -36, super.field2084) : null;
            class224 var12 = super.field2040 == -1 || ~super.field2046 == ~super.field2040 && var11 != null ? null : class47.method335((byte) -36, super.field2040);
            class262 var13 = this.field548.method1343(super.field2071, var12, (byte) 17, var11, super.field2038);
            if (var13 != null) {
                super.field2082 = var13.method28();
                class206 var14 = this.field548;
                if (var14.field3541 != null) {
                    var14 = var14.method1339(-94);
                }
                if (class212.field3647 && var14.field3558) {
                    class262 var15 = class244.method1604(super.field2053, arg0, super.field2098, var13, var12 == null ? super.field2038 : super.field2071, var12 != null ? var12 : var11, this.field548.field3563, this.field548.field3546, super.field2077, this.field548.field3561, this.field548.field3580, this.field548.field3574, 126, super.field2099);
                    var15.method25(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (~this.field548.field3529 != -1 || this.field548.field3533 != 0) {
                    int var19 = class123.field2326[arg0];
                    int var20 = class123.field2314[arg0];
                    short var21 = this.field548.field3533;
                    int var22 = -var21 / 2;
                    short var23 = this.field548.field3529;
                    int var24 = -var23 / 2;
                    int var25 = var19 * var22 + -(var20 * var24) >> 16;
                    int var26 = var19 * var24 + var20 * var22 >> 16;
                    int var27 = class45.method327(super.field2077 + var26, class196.field3401, super.field2053 + var25, false);
                    int var28 = var23 / 2;
                    int var29 = -var21 / 2;
                    int var30 = var20 * var29 - -(var19 * var28) >> 16;
                    int var31 = var19 * var29 + -(var20 * var28) >> 16;
                    int var32 = class45.method327(super.field2077 + var30, class196.field3401, super.field2053 + var31, false);
                    int var33 = -var23 / 2;
                    int var34 = var21 / 2;
                    int var35 = var19 * var34 + -(var20 * var33) >> 16;
                    int var36 = var21 / 2;
                    int var37 = var19 * var33 + var20 * var34 >> 16;
                    int var38 = var23 / 2;
                    int var39 = var20 * var36 - -(var19 * var38) >> 16;
                    int var40 = var19 * var36 + -(var20 * var38) >> 16;
                    int var41 = class45.method327(super.field2077 + var37, class196.field3401, super.field2053 + var35, false);
                    int var42 = class45.method327(super.field2077 - -var39, class196.field3401, super.field2053 + var40, false);
                    int var43 = var27 + var42;
                    if (~(var32 + var41) > ~var43) {
                        var43 = var32 + var41;
                    }
                    int var44 = var41 < var42 ? var41 : var42;
                    int var45 = var32 > var27 ? var27 : var32;
                    int var46 = ~var42 >= ~var32 ? var42 : var32;
                    int var47 = ~var41 < ~var27 ? var27 : var41;
                    if (~var21 != -1) {
                        var16 = 2047 & (int) (Math.atan2((double) (-var44 + var45), (double) var21) * 325.95D);
                        if (~var16 != -1) {
                            var13.method1490(var16);
                        }
                    }
                    if (~var23 != -1) {
                        var17 = (int) (325.95D * Math.atan2((double) (-var46 + var47), (double) var23)) & 2047;
                        if (var17 != 0) {
                            var13.method1484(var17);
                        }
                    }
                    var18 = (var43 >> 1) + -super.field2098;
                    if (~var18 != -1) {
                        var13.method1471(0, var18, 0);
                    }
                }
                class262 var48 = null;
                if (~super.field2068 != 0 && super.field2094 != -1) {
                    class73 var49 = class156.method1060(super.field2068, 1);
                    var48 = var49.method523(super.field2094, -10);
                    if (var48 != null) {
                        var48.method1471(0, -super.field2076, 0);
                        if (var49.field1445) {
                            if (var16 != 0) {
                                var48.method1490(var16);
                            }
                            if (~var17 != -1) {
                                var48.method1484(var17);
                            }
                            if (~var18 != -1) {
                                var48.method1471(0, var18, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class229) var13).method1492(var48);
                }
                if (this.field548.field3561 == 1) {
                    var13.field4608 = true;
                }
                var13.method25(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)Z")
    public final boolean method204(int arg0) {
        ++field543;
        if (this.field548 == null) {
            return false;
        } else {
            if (arg0 < 14) {
                method206((class66) null, false, -3);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLta;)V")
    public static final void method205(byte arg0, class107 arg1) {
        if (arg0 <= 116) {
            method207(106, 48, 104, -51);
        }
        if (arg1.field2104 == 0) {
            arg1.field2049 = 1024;
        }
        arg1.field2036 = 0;
        ++field551;
        if (arg1.field2104 == 1) {
            arg1.field2049 = 1536;
        }
        int var2 = arg1.field2075 * 128 - -(arg1.field2060 * 64);
        if (arg1.field2104 == 2) {
            arg1.field2049 = 0;
        }
        int var3 = -class75.field1501 + arg1.field2066;
        int var4 = arg1.field2034 * 128 - -(arg1.field2060 * 64);
        arg1.field2077 += (-arg1.field2077 + var2) / var3;
        if (~arg1.field2104 == -4) {
            arg1.field2049 = 512;
        }
        arg1.field2053 += (var4 - arg1.field2053) / var3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "()I")
    public final int method28() {
        ++field547;
        return super.field2082;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lr;ZI)V")
    public static final void method206(class66 arg0, boolean arg1, int arg2) {
        ++field549;
        if (arg2 >= -112) {
            field545 = -56L;
        }
        if (!arg1) {
            try {
                class44.field778.getAppletContext().showDocument(arg0.method452(class44.field778.getCodeBase(), 4), "_top");
            } catch (Exception var3) {
            }
        } else {
            try {
                class44.field778.getAppletContext().showDocument(arg0.method452(class44.field778.getCodeBase(), 4), "_blank");
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)I")
    public static final int method207(int arg0, int arg1, int arg2, int arg3) {
        ++field550;
        int var4 = arg1 / arg0;
        int var5 = arg1 & arg0 + arg3;
        int var6 = arg2 / arg0;
        int var7 = class56.method375(var4, var6, arg3 + 17);
        int var8 = arg2 & arg0 + -1;
        int var9 = class56.method375(var4 + 1, var6, 16);
        int var10 = class56.method375(var4, var6 - -1, 16);
        int var11 = class56.method375(var4 + 1, var6 + 1, 16);
        int var12 = class146.method1009(var5, var7, var9, (byte) 25, arg0);
        int var13 = class146.method1009(var5, var10, var11, (byte) 25, arg0);
        return class146.method1009(var8, var12, var13, (byte) 25, arg0);
    }
}
