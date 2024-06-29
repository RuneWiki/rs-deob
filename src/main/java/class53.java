import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class53 extends class237 {

    @OriginalMember(owner = "client!tf", name = "Tb", descriptor = "[I")
    public static int[] field965 = new int[50];

    @OriginalMember(owner = "client!tf", name = "Qb", descriptor = "I")
    public static int field962 = -1;

    @OriginalMember(owner = "client!tf", name = "Kb", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!tf", name = "Mb", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!tf", name = "Ob", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!tf", name = "Pb", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!tf", name = "Rb", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!tf", name = "Sb", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!tf", name = "Lb", descriptor = "Lce;")
    public static class10 field957;

    @OriginalMember(owner = "client!tf", name = "Nb", descriptor = "Lha;")
    public class62 field959;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)V")
    public static void method425(byte arg0) {
        field957 = null;
        int var1 = 73 / ((76 - arg0) / 41);
        field965 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)Lsg;")
    public static final class243 method426(byte arg0, int arg1) {
        if (arg0 != -90) {
            return null;
        } else {
            class243 var2 = (class243) class221.field3722.method764((byte) 70, (long) arg1);
            ++field956;
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class59.field1058.method190((byte) -88, class51.method420(arg1, -20476), class201.method1340(arg1, -1379743800));
                class243 var4 = new class243();
                var4.field4200 = arg1;
                if (var3 != null) {
                    var4.method1648(arg0 + 217, new class217(var3));
                }
                var4.method1659((byte) -53);
                if (!class194.field3214 && var4.field4215) {
                    var4.field4211 = null;
                }
                if (var4.field4204) {
                    var4.field4174 = 0;
                    var4.field4232 = false;
                }
                class221.field3722.method765((byte) -123, var4, (long) arg1);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(B)V")
    public static final void method427(byte arg0) {
        ++field960;
        class155.field2697.method762((byte) 117);
        if (arg0 != 7) {
            field965 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)Z")
    public final boolean method428(byte arg0) {
        ++field964;
        if (arg0 != 20) {
            field957 = null;
        }
        return this.field959 != null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()I")
    public final int method126() {
        ++field961;
        return super.field3972;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field963;
        if (this.field959 != null) {
            class186 var11 = ~super.field4002 != 0 && super.field3989 == 0 ? class123.method891(-5664, super.field4002) : null;
            class186 var12 = super.field3996 == -1 || super.field3996 == super.field3965 && var11 != null ? null : class123.method891(-5664, super.field3996);
            class98 var13 = this.field959.method478(super.field3982, var11, var12, super.field4034, 32);
            if (var13 != null) {
                super.field3972 = var13.method126();
                class62 var14 = this.field959;
                if (var14.field1160 != null) {
                    var14 = var14.method486((byte) -126);
                }
                if (class76.field1440 && var14.field1173) {
                    class98 var15 = class64.method496(super.field4027, var13, arg0, this.field959.field1138, -98, this.field959.field1141, this.field959.field1177, this.field959.field1186, super.field3990, super.field4028, var12 == null ? var11 : var12, super.field4018, this.field959.field1176, var12 != null ? super.field3982 : super.field4034);
                    var15.method129(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (this.field959.field1148 != 0 && ~this.field959.field1188 != -1) {
                    int var19 = class13.field313[arg0];
                    int var20 = class13.field311[arg0];
                    short var21 = this.field959.field1148;
                    short var22 = this.field959.field1188;
                    int var23 = -var21 / 2;
                    int var24 = -var22 / 2;
                    int var25 = var20 * var24 + -(var19 * var23) >> 16;
                    int var26 = var19 * var24 - -(var20 * var23) >> 16;
                    int var27 = var21 / 2;
                    int var28 = class187.method1260((byte) 96, super.field3990 - -var26, super.field4027 + var25, class201.field3312);
                    int var29 = -var22 / 2;
                    int var30 = var19 * var29 + var20 * var27 >> 16;
                    int var31 = var20 * var29 + -(var19 * var27) >> 16;
                    int var32 = class187.method1260((byte) 119, super.field3990 - -var30, super.field4027 + var31, class201.field3312);
                    int var33 = -var21 / 2;
                    int var34 = var22 / 2;
                    int var35 = var22 / 2;
                    int var36 = var19 * var34 + var20 * var33 >> 16;
                    int var37 = var21 / 2;
                    int var38 = var20 * var34 + -(var19 * var33) >> 16;
                    int var39 = class187.method1260((byte) 91, super.field3990 + var36, super.field4027 + var38, class201.field3312);
                    int var40 = var19 * var35 + var20 * var37 >> 16;
                    int var41 = var20 * var35 - var19 * var37 >> 16;
                    int var42 = class187.method1260((byte) 55, super.field3990 + var40, super.field4027 - -var41, class201.field3312);
                    int var43 = var28 + var42;
                    int var44 = var32 > var28 ? var28 : var32;
                    int var45 = var42 > var39 ? var39 : var42;
                    if (var32 + var39 < var43) {
                        var43 = var32 + var39;
                    }
                    var16 = (int) (Math.atan2((double) (-var45 + var44), (double) var22) * 325.95D) & 2047;
                    if (var16 != 0) {
                        var13.method755(var16);
                    }
                    int var46 = ~var42 >= ~var32 ? var42 : var32;
                    int var47 = var28 >= var39 ? var39 : var28;
                    var17 = (int) (325.95D * Math.atan2((double) (var47 - var46), (double) var21)) & 2047;
                    if (~var17 != -1) {
                        var13.method747(var17);
                    }
                    var18 = (var43 >> 1) - super.field4018;
                    if (var18 != 0) {
                        var13.method753(0, var18, 0);
                    }
                }
                class98 var48 = null;
                if (super.field3966 != -1 && super.field3973 != -1) {
                    class109 var49 = class210.method1405(1, super.field3966);
                    var48 = var49.method809(super.field3973, -1);
                    if (var48 != null) {
                        var48.method753(0, -super.field4025, 0);
                        if (var49.field1943) {
                            if (~var16 != -1) {
                                var48.method755(var16);
                            }
                            if (var17 != 0) {
                                var48.method747(var17);
                            }
                            if (var18 != 0) {
                                var48.method753(0, var18, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class149) var13).method1036(var48);
                }
                if (this.field959.field1138 == 1) {
                    var13.field1817 = true;
                }
                var13.method129(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }
}
