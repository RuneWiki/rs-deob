import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class197 extends class241 {

    @OriginalMember(owner = "client!qe", name = "Ob", descriptor = "I")
    public static int field3326 = -1;

    @OriginalMember(owner = "client!qe", name = "Ib", descriptor = "I")
    public static int field3320 = 0;

    @OriginalMember(owner = "client!qe", name = "Hb", descriptor = "Lia;")
    private static class257 field3319 = class28.method234(92, "Continue");

    @OriginalMember(owner = "client!qe", name = "Ub", descriptor = "I")
    public static int field3332 = -1;

    @OriginalMember(owner = "client!qe", name = "Rb", descriptor = "I")
    public static int field3329 = 0;

    @OriginalMember(owner = "client!qe", name = "Jb", descriptor = "Lia;")
    public static class257 field3321 = field3319;

    @OriginalMember(owner = "client!qe", name = "Pb", descriptor = "[I")
    public static int[] field3327 = new int[100];

    @OriginalMember(owner = "client!qe", name = "Xb", descriptor = "I")
    public static int field3335 = 0;

    @OriginalMember(owner = "client!qe", name = "Lb", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!qe", name = "Mb", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!qe", name = "Nb", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!qe", name = "Sb", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!qe", name = "Tb", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!qe", name = "Wb", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!qe", name = "Kb", descriptor = "Ld;")
    public class198 field3322;

    @OriginalMember(owner = "client!qe", name = "Vb", descriptor = "Lld;")
    public static class51 field3333;

    @OriginalMember(owner = "client!qe", name = "Qb", descriptor = "[I")
    public static int[] field3328;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILia;Lia;)V")
    public static final void method1317(int arg0, int arg1, class257 arg2, class257 arg3) {
        if (arg0 > -21) {
            method1317(-112, -113, (class257) null, (class257) null);
        }
        class115.method823(-1, arg3, arg1, arg2, -113, (class257) null);
        ++field3330;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lic;")
    public static final class38 method1318(int arg0, int arg1) {
        class38 var2 = (class38) class71.field1391.method836(77, (long) arg0);
        ++field3324;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class13.field247.method1197(arg0, 3, -2);
            if (arg1 != 20440) {
                return null;
            } else {
                class38 var4 = new class38();
                if (var3 != null) {
                    var4.method308(new class152(var3), (byte) -101);
                }
                class71.field1391.method832(var4, (long) arg0, arg1 + -20440);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field3334;
        if (this.field3322 != null) {
            class31 var11 = ~super.field4129 != 0 && super.field4144 == 0 ? class186.method1263(0, super.field4129) : null;
            class31 var12 = super.field4170 == -1 || ~super.field4170 == ~super.field4165 && var11 != null ? null : class186.method1263(0, super.field4170);
            class168 var13 = this.field3322.method1329(super.field4187, true, super.field4120, var11, var12);
            if (var13 != null) {
                super.field4151 = var13.method2();
                class198 var14 = this.field3322;
                if (var14.field3393 != null) {
                    var14 = var14.method1324((byte) 125);
                }
                if (class19.field399 && var14.field3363) {
                    class168 var15 = class126.method880(this.field3322.field3382, this.field3322.field3365, this.field3322.field3395, var12 == null ? var11 : var12, super.field4121, super.field4177, super.field4142, var13, -1, this.field3322.field3397, this.field3322.field3390, arg0, var12 == null ? super.field4120 : super.field4187, super.field4143);
                    var15.method3(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (this.field3322.field3396 != 0 && ~this.field3322.field3392 != -1) {
                    int var19 = class101.field1871[arg0];
                    short var20 = this.field3322.field3396;
                    int var21 = class101.field1872[arg0];
                    short var22 = this.field3322.field3392;
                    int var23 = -var22 / 2;
                    int var24 = -var20 / 2;
                    int var25 = var21 * var23 - -(var19 * var24) >> 16;
                    int var26 = var19 * var23 + -(var21 * var24) >> 16;
                    int var27 = class109.method803(class189.field3261, super.field4143 + var26, (byte) 122, super.field4177 + var25);
                    int var28 = var20 / 2;
                    int var29 = -var22 / 2;
                    int var30 = var19 * var28 + var21 * var29 >> 16;
                    int var31 = var19 * var29 + -(var21 * var28) >> 16;
                    int var32 = class109.method803(class189.field3261, super.field4143 + var31, (byte) 117, super.field4177 + var30);
                    int var33 = var22 / 2;
                    int var34 = -var20 / 2;
                    int var35 = var19 * var34 + var21 * var33 >> 16;
                    int var36 = var20 / 2;
                    int var37 = var22 / 2;
                    int var38 = var19 * var33 + -(var21 * var34) >> 16;
                    int var39 = var19 * var36 + var21 * var37 >> 16;
                    int var40 = class109.method803(class189.field3261, super.field4143 + var38, (byte) 110, super.field4177 + var35);
                    int var41 = var19 * var37 + -(var21 * var36) >> 16;
                    int var42 = class109.method803(class189.field3261, super.field4143 - -var41, (byte) -104, super.field4177 - -var39);
                    int var43 = var27 - -var42;
                    int var44 = var27 >= var32 ? var32 : var27;
                    int var45 = ~var40 <= ~var42 ? var42 : var40;
                    if (~var43 < ~(var32 + var40)) {
                        var43 = var32 + var40;
                    }
                    var17 = 2047 & (int) (Math.atan2((double) (-var45 + var44), (double) var22) * 325.95D);
                    if (~var17 != -1) {
                        var13.method1143(var17);
                    }
                    int var46 = ~var42 < ~var32 ? var32 : var42;
                    int var47 = ~var40 >= ~var27 ? var40 : var27;
                    var16 = 2047 & (int) (325.95D * Math.atan2((double) (-var46 + var47), (double) var20));
                    if (~var16 != -1) {
                        var13.method1151(var16);
                    }
                    var18 = (var43 >> 1) + -super.field4121;
                    if (var18 != 0) {
                        var13.method1149(0, var18, 0);
                    }
                }
                class168 var48 = null;
                if (super.field4172 != -1 && ~super.field4150 != 0) {
                    class219 var49 = class152.method1059(super.field4172, true);
                    var48 = var49.method1447(118, super.field4150);
                    if (var48 != null) {
                        var48.method1149(0, -super.field4156, 0);
                        if (var49.field3704) {
                            if (~var17 != -1) {
                                var48.method1143(var17);
                            }
                            if (~var16 != -1) {
                                var48.method1151(var16);
                            }
                            if (var18 != 0) {
                                var48.method1149(0, var18, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class232) var13).method1510(var48);
                }
                if (~this.field3322.field3390 == -2) {
                    var13.field2907 = true;
                }
                var13.method3(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
    public static void method1319(int arg0) {
        field3333 = null;
        field3328 = null;
        if (arg0 != 2) {
            field3329 = -102;
        }
        field3327 = null;
        field3321 = null;
        field3319 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()I")
    public final int method2() {
        ++field3323;
        return super.field4151;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)Lak;")
    public static final class190 method1320(byte arg0) {
        if (arg0 != 45) {
            return null;
        } else {
            ++field3331;
            int var1 = class72.field1411[0] * class193.field3287[0];
            byte[] var2 = class137.field2454[0];
            class190 var5;
            if (!class69.field1375[0]) {
                int[] var3 = new int[var1];
                for (int var4 = 0; var1 > var4; ++var4) {
                    var3[var4] = class3.field92[class30.method252(var2[var4], 255)];
                }
                var5 = new class190(class20.field427, class9.field184, class57.field1212[0], class154.field2701[0], class72.field1411[0], class193.field3287[0], var3);
            } else {
                byte[] var6 = class55.field1184[0];
                int[] var7 = new int[var1];
                for (int var8 = 0; var8 < var1; ++var8) {
                    var7[var8] = class198.method1332(class30.method252(var6[var8], 255) << 24, class3.field92[class30.method252(255, var2[var8])]);
                }
                var5 = new class66(class20.field427, class9.field184, class57.field1212[0], class154.field2701[0], class72.field1411[0], class193.field3287[0], var7);
            }
            class126.method875(false);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)Z")
    public final boolean method1236(int arg0) {
        ++field3325;
        if (this.field3322 == null) {
            return false;
        } else {
            if (arg0 != 0) {
                this.method3(71, -107, 69, -88, 107, 95, -33, -14, -20L);
            }
            return true;
        }
    }
}
