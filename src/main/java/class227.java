import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class227 extends class182 {

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "I")
    public static int field3842 = 0;

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "I")
    public static int field3845 = 0;

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3847 = " from your friend list first.";

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "I")
    public static int field3846 = 0;

    @OriginalMember(owner = "client!jf", name = "U", descriptor = "Ljava/lang/String;")
    public static String field3848 = "glow3:";

    @OriginalMember(owner = "client!jf", name = "P", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class227() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "(I)V")
    public static void method1607(int arg0) {
        field3848 = null;
        field3847 = null;
        if (arg0 <= 72) {
            method1607(-107);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        if (arg0) {
            field3847 = null;
        }
        ++field3849;
        int[] var3 = super.field2911.method77(arg1, -54);
        if (super.field2911.field287) {
            class75.method535(var3, 0, class4.field116, class66.field1112[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILab;B)Lf;")
    public static final class205 method1608(int arg0, class249 arg1, byte arg2) {
        ++field3843;
        class205 var3 = new class205(arg0, arg1.method1769(arg2 + -106), arg1.method1769(arg2 ^ 106), arg1.method1800(-75), arg1.method1800(110), ~arg1.method1802((byte) -86) == -2, arg1.method1802((byte) -127));
        if (arg2 != 107) {
            field3846 = -109;
        }
        int var4 = arg1.method1802((byte) -85);
        for (int var5 = 0; var4 > var5; ++var5) {
            var3.field3287.method311(arg2 ^ 36, new class108(arg1.method1802((byte) -112), arg1.method1802((byte) 34), arg1.method1821((byte) 51), arg1.method1821((byte) 51), arg1.method1821((byte) 51), arg1.method1821((byte) 51), arg1.method1821((byte) 51), arg1.method1821((byte) 51), arg1.method1821((byte) 51), arg1.method1821((byte) 51)));
        }
        var3.method1427(0);
        return var3;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method1609(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3844;
        int var8 = arg6;
        int var9 = 0;
        int var10 = 0;
        int var11 = -arg4 + arg7;
        int var12 = arg7 * arg7;
        int var13 = arg6 * arg6;
        int var14 = -arg4 + arg6;
        int var15 = var11 * var11;
        int var16 = var13 << 1;
        int var17 = var14 * var14;
        int var18 = var12 << 1;
        int var19 = var17 << 1;
        int var20 = var15 << 1;
        int var21 = arg6 << 1;
        int var22 = var14 << 1;
        int var23 = (-var21 + 1) * var12 + var16;
        int var24 = var13 - (var21 + -1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var12 << 2;
        int var27 = -((var22 + -1) * var20) + var17;
        int var28 = var15 << 2;
        int var29 = var17 << 2;
        int var30 = var16 * 3;
        int var31 = var13 << 2;
        int var32 = var19 * 3;
        int var33 = (var21 + -3) * var18;
        int var34 = 65 % ((-19 - arg2) / 47);
        int var35 = (var22 - 3) * var20;
        int var36 = (arg6 + -1) * var26;
        int var37 = var31;
        int var38 = (var14 - 1) * var28;
        int var39 = var29;
        if (~class55.field972 >= ~arg3 && ~class240.field4053 <= ~arg3) {
            int[] var40 = class41.field630[arg3];
            int var41 = class243.method1742(class23.field423, 0, class272.field4552, -arg7 + arg1);
            int var42 = class243.method1742(class23.field423, 0, class272.field4552, arg1 - -arg7);
            int var43 = class243.method1742(class23.field423, 0, class272.field4552, -var11 + arg1);
            int var44 = class243.method1742(class23.field423, 0, class272.field4552, arg1 + var11);
            class134.method996(0, var43, var41, arg0, var40);
            class134.method996(0, var44, var43, arg5, var40);
            class134.method996(0, var42, var44, arg0, var40);
        }
        while (var8 > 0) {
            boolean var45 = ~var8 >= ~var14;
            if (var45) {
                if (var25 < 0) {
                    while (~var25 > -1) {
                        ++var10;
                        var25 += var32;
                        var27 += var39;
                        var32 += var29;
                        var39 += var29;
                    }
                }
                if (var27 < 0) {
                    var25 += var32;
                    var32 += var29;
                    var27 += var39;
                    var39 += var29;
                    ++var10;
                }
                var25 += -var38;
                var27 += -var35;
                var38 -= var28;
                var35 -= var28;
            }
            --var8;
            int var46 = arg3 + var8;
            if (var23 < 0) {
                while (~var23 > -1) {
                    ++var9;
                    var23 += var30;
                    var30 += var31;
                    var24 += var37;
                    var37 += var31;
                }
            }
            int var47 = -var8 + arg3;
            if (~var24 > -1) {
                var23 += var30;
                var24 += var37;
                var30 += var31;
                var37 += var31;
                ++var9;
            }
            var23 += -var36;
            var24 += -var33;
            var36 -= var26;
            var33 -= var26;
            if (~class55.field972 >= ~var46 && var47 <= class240.field4053) {
                int var48 = class243.method1742(class23.field423, 0, class272.field4552, arg1 + var9);
                int var49 = class243.method1742(class23.field423, 0, class272.field4552, -var9 + arg1);
                if (var45) {
                    int var50 = class243.method1742(class23.field423, 0, class272.field4552, arg1 + var10);
                    int var51 = class243.method1742(class23.field423, 0, class272.field4552, -var10 + arg1);
                    if (~class55.field972 >= ~var47) {
                        int[] var52 = class41.field630[var47];
                        class134.method996(0, var51, var49, arg0, var52);
                        class134.method996(0, var50, var51, arg5, var52);
                        class134.method996(0, var48, var50, arg0, var52);
                    }
                    if (var46 <= class240.field4053) {
                        int[] var53 = class41.field630[var46];
                        class134.method996(0, var51, var49, arg0, var53);
                        class134.method996(0, var50, var51, arg5, var53);
                        class134.method996(0, var48, var50, arg0, var53);
                    }
                } else {
                    if (~class55.field972 >= ~var47) {
                        class134.method996(0, var48, var49, arg0, class41.field630[var47]);
                    }
                    if (var46 <= class240.field4053) {
                        class134.method996(0, var48, var49, arg0, class41.field630[var46]);
                    }
                }
            }
        }
    }
}
