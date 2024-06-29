import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class187 extends class228 {

    @OriginalMember(owner = "client!i", name = "Ub", descriptor = "I")
    public static int field3388 = 0;

    @OriginalMember(owner = "client!i", name = "Vb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3389 = Calendar.getInstance();

    @OriginalMember(owner = "client!i", name = "Pb", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!i", name = "Rb", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!i", name = "Sb", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!i", name = "Wb", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!i", name = "Xb", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!i", name = "Yb", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!i", name = "Zb", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!i", name = "Qb", descriptor = "Lqb;")
    public class85 field3384;

    @OriginalMember(owner = "client!i", name = "Tb", descriptor = "[Lbc;")
    public static class100[] field3387;

    @OriginalMember(owner = "client!i", name = "ac", descriptor = "[Lbc;")
    public static class100[] field3394;

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (super.field4110 != null) {
            super.field4110.method753();
        }
        ++field3393;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIIIJILnc;)V")
    public final void method174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class125 arg10) {
        ++field3392;
        if (this.field3384 != null) {
            class104 var13 = super.field4131 != -1 && ~super.field4156 == -1 ? class164.method1081(super.field4131, -21331) : null;
            class104 var14 = super.field4133 == -1 || super.field4137 == super.field4133 && var13 != null ? null : class164.method1081(super.field4133, -21331);
            class150 var15 = this.field3384.method485(var13, var14, super.field4184, super.field4153, true);
            if (var15 != null) {
                super.field4150 = var15.method166();
                class85 var16 = this.field3384;
                if (var16.field1538 != null) {
                    var16 = var16.method489(-23677);
                }
                if (class212.field3944 && var16.field1539) {
                    class150 var17 = class126.method766(super.field4108, this.field3384.field1548, this.field3384.field1531, this.field3384.field1557, var14 == null ? var13 : var14, var15, var14 == null ? super.field4153 : super.field4184, this.field3384.field1527, super.field4178, this.field3384.field1540, super.field4123, (byte) 69, arg0, super.field4127);
                    var17.method174(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field4110);
                }
                int var18 = 0;
                int var19 = 0;
                int var20 = 0;
                if (this.field3384.field1530 != 0 || this.field3384.field1576 != 0) {
                    int var21 = class196.field3635[arg0];
                    short var22 = this.field3384.field1530;
                    int var23 = class196.field3630[arg0];
                    int var24 = -var22 / 2;
                    short var25 = this.field3384.field1576;
                    int var26 = -var25 / 2;
                    int var27 = var21 * var26 + var23 * var24 >> 16;
                    int var28 = var23 * var26 - var21 * var24 >> 16;
                    int var29 = var22 / 2;
                    int var30 = class20.method140(super.field4178 + var27, 127, super.field4108 - -var28, class170.field3044);
                    int var31 = -var25 / 2;
                    int var32 = var21 * var31 - -(var23 * var29) >> 16;
                    int var33 = var23 * var31 + -(var21 * var29) >> 16;
                    int var34 = class20.method140(super.field4178 + var32, 93, super.field4108 - -var33, class170.field3044);
                    int var35 = -var22 / 2;
                    int var36 = var25 / 2;
                    int var37 = var21 * var36 + var23 * var35 >> 16;
                    int var38 = var23 * var36 + -(var21 * var35) >> 16;
                    int var39 = class20.method140(super.field4178 - -var37, 95, super.field4108 + var38, class170.field3044);
                    int var40 = var22 / 2;
                    int var41 = var25 / 2;
                    int var42 = var21 * var41 + var23 * var40 >> 16;
                    int var43 = var23 * var41 + -(var21 * var40) >> 16;
                    int var44 = class20.method140(super.field4178 - -var42, 122, super.field4108 + var43, class170.field3044);
                    int var45 = var30 + var44;
                    int var46 = ~var34 >= ~var30 ? var34 : var30;
                    if (var45 > var34 + var39) {
                        var45 = var34 - -var39;
                    }
                    int var47 = var34 >= var44 ? var44 : var34;
                    int var48 = var44 > var39 ? var39 : var44;
                    int var49 = ~var30 <= ~var39 ? var39 : var30;
                    if (~var25 != -1) {
                        var19 = (int) (325.95D * Math.atan2((double) (-var48 + var46), (double) var25)) & 2047;
                        if (~var19 != -1) {
                            var15.method988(var19);
                        }
                    }
                    if (~var22 != -1) {
                        var18 = 2047 & (int) (325.95D * Math.atan2((double) (var49 - var47), (double) var22));
                        if (var18 != 0) {
                            var15.method982(var18);
                        }
                    }
                    var20 = (var45 >> 1) - super.field4127;
                    if (~var20 != -1) {
                        var15.method978(0, var20, 0);
                    }
                }
                class150 var50 = null;
                if (super.field4119 != -1 && super.field4107 != -1) {
                    class173 var51 = class122.method742(-125, super.field4119);
                    var50 = var51.method1137(29263, super.field4107);
                    if (var50 != null) {
                        var50.method978(0, -super.field4152, 0);
                        if (var51.field3115) {
                            if (~var19 != -1) {
                                var50.method988(var19);
                            }
                            if (~var18 != -1) {
                                var50.method982(var18);
                            }
                            if (~var20 != -1) {
                                var50.method978(0, var20, 0);
                            }
                        }
                    }
                }
                if (var50 != null) {
                    var15 = ((class183) var15).method1186(var50);
                }
                this.method1559(var15, -1);
                if (this.field3384.field1531 == 1) {
                    var15.field2751 = true;
                }
                var15.method174(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field4110);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIII)V")
    public final void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3383;
        if (this.field3384 != null) {
            if (!super.field4149) {
                class104 var6 = super.field4131 != -1 && super.field4156 == 0 ? class164.method1081(super.field4131, -21331) : null;
                class104 var7 = ~super.field4133 == 0 || ~super.field4137 == ~super.field4133 && var6 != null ? null : class164.method1081(super.field4133, -21331);
                class150 var8 = this.field3384.method485(var6, var7, super.field4184, super.field4153, true);
                if (var8 == null) {
                    return;
                }
                this.method1559(var8, -1);
            }
            if (super.field4110 != null) {
                super.field4110.method758(arg0, arg1, arg3, arg2, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(III)V")
    public static final void method1217(int arg0, int arg1, int arg2) {
        ++field3386;
        ++class266.field4784;
        class285.field5010.method799(103, 113);
        class285.field5010.method1278(arg0, (byte) 113);
        if (arg2 < 121) {
            method1218(-48);
        }
        class285.field5010.method1241((byte) 25, arg1);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)Z")
    public final boolean method217(boolean arg0) {
        ++field3390;
        if (arg0) {
            this.field3384 = null;
        }
        return this.field3384 != null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()I")
    public final int method166() {
        ++field3385;
        return super.field4150;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V")
    public static void method1218(int arg0) {
        field3394 = null;
        field3389 = null;
        field3387 = null;
        if (arg0 != 406674800) {
            method1218(118);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLqb;)V")
    public final void method1219(byte arg0, class85 arg1) {
        int var3 = 47 % ((arg0 - 11) / 57);
        this.field3384 = arg1;
        if (super.field4110 != null) {
            super.field4110.method764();
        }
        ++field3391;
    }
}
