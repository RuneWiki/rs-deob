import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class215 {

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field4014 = 0;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "B")
    public static byte field4010 = 0;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "Ldc;")
    public static class37 field4017 = class185.method1233((byte) 86, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field4009 = 0;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "Ldc;")
    public static class37 field4018 = class185.method1233((byte) 86, "<col=ffff00>*V");

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Lwa;")
    public static class238 field4012;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "Lwa;")
    public static class238 field4015;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        field4011++;
        int var9 = arg1;
        int var10 = arg3 - arg7;
        if (arg5 != -13805) {
            field4008 = 62;
        }
        int var11 = arg1 - arg7;
        int var12 = arg3 * arg3;
        int var13 = 0;
        int var14 = var10 * var10;
        int var15 = arg1 * arg1;
        int var16 = var11 * var11;
        int var17 = var15 << 1;
        int var18 = var12 << 1;
        int var19 = var16 << 1;
        int var20 = arg1 << 1;
        int var21 = var14 << 1;
        int var22 = var15 - (var20 - 1) * var18;
        int var23 = var11 << 1;
        int var24 = (1 - var20) * var12 + var17;
        int var25 = (1 - var23) * var14 + var19;
        int var26 = var16 - (var23 - 1) * var21;
        int var27 = var12 << 2;
        int var28 = var15 << 2;
        int var29 = var14 << 2;
        int var30 = var17 * 3;
        int var31 = var16 << 2;
        int var32 = (var20 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = var28;
        int var35 = (var23 - 3) * var21;
        int var36 = (arg1 - 1) * var27;
        int var37 = (var11 - 1) * var29;
        int var38 = var31;
        if (arg0 >= class198.field3697 && class199.field3712 >= arg0) {
            int[] var39 = class11.field156[arg0];
            int var40 = class196.method1308(94, class29.field536, arg6 - arg3, class82.field1458);
            int var41 = class196.method1308(arg5 + 13856, class29.field536, arg3 + arg6, class82.field1458);
            int var42 = class196.method1308(69, class29.field536, arg6 - var10, class82.field1458);
            int var43 = class196.method1308(117, class29.field536, arg6 + var10, class82.field1458);
            class29.method242(var42, (byte) -30, arg4, var39, var40);
            class29.method242(var43, (byte) -30, arg2, var39, var42);
            class29.method242(var41, (byte) -30, arg4, var39, var43);
        }
        while (var9 > 0) {
            if (var24 < 0) {
                while (var24 < 0) {
                    var24 += var30;
                    var22 += var34;
                    var34 += var28;
                    var8++;
                    var30 += var28;
                }
            }
            if (var22 < 0) {
                var22 += var34;
                var34 += var28;
                var24 += var30;
                var8++;
                var30 += var28;
            }
            var22 += -var32;
            var24 += -var36;
            boolean var44 = var11 >= var9;
            var9--;
            var36 -= var27;
            int var45 = arg0 - var9;
            var32 -= var27;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var13++;
                        var25 += var33;
                        var26 += var38;
                        var33 += var31;
                        var38 += var31;
                    }
                }
                if (var26 < 0) {
                    var13++;
                    var26 += var38;
                    var38 += var31;
                    var25 += var33;
                    var33 += var31;
                }
                var25 += -var37;
                var26 += -var35;
                var37 -= var29;
                var35 -= var29;
            }
            int var46 = arg0 + var9;
            if (class198.field3697 <= var46 && class199.field3712 >= var45) {
                int var47 = class196.method1308(arg5 ^ 0xFFFFCA2E, class29.field536, arg6 + var8, class82.field1458);
                int var48 = class196.method1308(arg5 + 13856, class29.field536, arg6 - var8, class82.field1458);
                if (var44) {
                    int var49 = class196.method1308(arg5 + 13921, class29.field536, arg6 + var13, class82.field1458);
                    int var50 = class196.method1308(75, class29.field536, arg6 - var13, class82.field1458);
                    if (class198.field3697 <= var45) {
                        int[] var51 = class11.field156[var45];
                        class29.method242(var50, (byte) -30, arg4, var51, var48);
                        class29.method242(var49, (byte) -30, arg2, var51, var50);
                        class29.method242(var47, (byte) -30, arg4, var51, var49);
                    }
                    if (var46 <= class199.field3712) {
                        int[] var52 = class11.field156[var46];
                        class29.method242(var50, (byte) -30, arg4, var52, var48);
                        class29.method242(var49, (byte) -30, arg2, var52, var50);
                        class29.method242(var47, (byte) -30, arg4, var52, var49);
                    }
                } else {
                    if (class198.field3697 <= var45) {
                        class29.method242(var47, (byte) -30, arg4, class11.field156[var45], var48);
                    }
                    if (class199.field3712 >= var46) {
                        class29.method242(var47, (byte) -30, arg4, class11.field156[var46], var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILdc;Ldc;)V")
    public static final void method1418(int arg0, int arg1, class37 arg2, class37 arg3) {
        field4013++;
        class203.method1334(arg0, arg1, arg2, null, arg3, (byte) -100);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method1419(int arg0) {
        field4018 = null;
        field4012 = null;
        if (arg0 == 586448449) {
            field4017 = null;
            field4015 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)I")
    public static final int method1420(byte arg0, int arg1) {
        int var2 = 2 / ((27 - arg0) / 54);
        field4016++;
        return arg1 >> 17 & 0x7;
    }
}
