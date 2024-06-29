import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class197 extends class260 {

    @OriginalMember(owner = "client!vi", name = "Lb", descriptor = "I")
    public static int field3435 = 1;

    @OriginalMember(owner = "client!vi", name = "Nb", descriptor = "[Lmb;")
    public static class96[] field3437 = new class96[100];

    @OriginalMember(owner = "client!vi", name = "Ub", descriptor = "Lmb;")
    private static class96 field3444 = class243.method1708("Starting 3d Library", (byte) 104);

    @OriginalMember(owner = "client!vi", name = "Ob", descriptor = "Lmb;")
    public static class96 field3438 = field3444;

    @OriginalMember(owner = "client!vi", name = "Kb", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!vi", name = "Pb", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!vi", name = "Qb", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!vi", name = "Rb", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!vi", name = "Sb", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!vi", name = "Tb", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!vi", name = "Mb", descriptor = "Lwa;")
    public class229 field3436;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 & 3;
        ++field3443;
        if (~(arg1 & 1) == -2) {
            int var8 = arg0;
            arg0 = arg6;
            arg6 = var8;
        }
        if (var7 == 0) {
            return arg3;
        } else if (~var7 == -2) {
            return 7 - (arg0 + -1) + -arg2;
        } else {
            if (arg4 != 7) {
                field3444 = null;
            }
            return ~var7 == -3 ? 7 - arg6 - -1 + -arg3 : arg2;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field3434;
        if (this.field3436 != null) {
            class67 var11 = ~super.field4526 != 0 && ~super.field4529 == -1 ? class189.method1332(super.field4526, 2) : null;
            class67 var12 = super.field4573 == -1 || ~super.field4573 == ~super.field4515 && var11 != null ? null : class189.method1332(super.field4573, 2);
            class35 var13 = this.field3436.method1567(var11, super.field4536, super.field4576, -122, var12);
            if (var13 != null) {
                super.field4544 = var13.method50();
                class229 var14 = this.field3436;
                if (var14.field3926 != null) {
                    var14 = var14.method1560((byte) -74);
                }
                if (class219.field3743 && var14.field3916) {
                    class35 var15 = class203.method1416(super.field4503, this.field3436.field3940, this.field3436.field3910, var12 == null ? super.field4576 : super.field4536, super.field4511, this.field3436.field3914, this.field3436.field3945, false, var13, var12 == null ? var11 : var12, arg0, super.field4533, this.field3436.field3900, super.field4571);
                    var15.method52(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (this.field3436.field3886 != 0 || this.field3436.field3879 != 0) {
                    int var19 = class240.field4176[arg0];
                    int var20 = class240.field4162[arg0];
                    short var21 = this.field3436.field3886;
                    short var22 = this.field3436.field3879;
                    int var23 = -var22 / 2;
                    int var24 = -var22 / 2;
                    int var25 = -var21 / 2;
                    int var26 = var21 / 2;
                    int var27 = var19 * var23 + -(var20 * var25) >> 16;
                    int var28 = var19 * var24 + -(var20 * var26) >> 16;
                    int var29 = var19 * var26 + var20 * var24 >> 16;
                    int var30 = var19 * var25 + var20 * var23 >> 16;
                    int var31 = -var21 / 2;
                    int var32 = class137.method1025(class216.field3712, super.field4533 + var27, super.field4511 - -var30, (byte) -94);
                    int var33 = var22 / 2;
                    int var34 = class137.method1025(class216.field3712, super.field4533 + var28, super.field4511 + var29, (byte) -94);
                    int var35 = var19 * var31 + var20 * var33 >> 16;
                    int var36 = var21 / 2;
                    int var37 = var22 / 2;
                    int var38 = var19 * var33 - var20 * var31 >> 16;
                    int var39 = var19 * var36 + var20 * var37 >> 16;
                    int var40 = class137.method1025(class216.field3712, super.field4533 + var38, super.field4511 + var35, (byte) -94);
                    int var41 = var19 * var37 + -(var20 * var36) >> 16;
                    int var42 = class137.method1025(class216.field3712, super.field4533 + var41, super.field4511 + var39, (byte) -94);
                    int var43 = ~var32 <= ~var34 ? var34 : var32;
                    int var44 = var32 + var42;
                    if (var44 > var34 + var40) {
                        var44 = var34 - -var40;
                    }
                    int var45 = var40 < var42 ? var40 : var42;
                    int var46 = var34 < var42 ? var34 : var42;
                    int var47 = ~var40 >= ~var32 ? var40 : var32;
                    if (var22 != 0) {
                        var16 = 2047 & (int) (Math.atan2((double) (var43 - var45), (double) var22) * 325.95D);
                        if (~var16 != -1) {
                            var13.method272(var16);
                        }
                    }
                    if (var21 != 0) {
                        var17 = (int) (Math.atan2((double) (-var46 + var47), (double) var21) * 325.95D) & 2047;
                        if (~var17 != -1) {
                            var13.method269(var17);
                        }
                    }
                    var18 = (var44 >> 1) + -super.field4503;
                    if (var18 != 0) {
                        var13.method270(0, var18, 0);
                    }
                }
                class35 var48 = null;
                if (super.field4543 != -1 && super.field4548 != -1) {
                    class183 var49 = class146.method1082(super.field4543, (byte) -104);
                    var48 = var49.method1290(super.field4548, 80);
                    if (var48 != null) {
                        var48.method270(0, -super.field4579, 0);
                        if (var49.field3165) {
                            if (var16 != 0) {
                                var48.method272(var16);
                            }
                            if (var17 != 0) {
                                var48.method269(var17);
                            }
                            if (var18 != 0) {
                                var48.method270(0, var18, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class255) var13).method1778(var48);
                }
                if (~this.field3436.field3914 == -2) {
                    var13.field607 = true;
                }
                var13.method52(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)Z")
    public final boolean method362(boolean arg0) {
        ++field3439;
        if (this.field3436 == null) {
            return false;
        } else {
            if (arg0) {
                field3444 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBI)I")
    public static final int method1380(int arg0, byte arg1, int arg2) {
        class60 var3 = (class60) class132.field2373.method1081(0, (long) arg0);
        ++field3441;
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            if (arg1 >= -105) {
                method1381(45);
            }
            int var4 = 0;
            for (int var5 = 0; ~var5 > ~var3.field1040.length; ++var5) {
                if (var3.field1035[var5] == arg2) {
                    var4 += var3.field1040[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V")
    public static void method1381(int arg0) {
        field3438 = null;
        field3437 = null;
        if (arg0 != -26004) {
            field3438 = null;
        }
        field3444 = null;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "()I")
    public final int method50() {
        ++field3442;
        return super.field4544;
    }
}
