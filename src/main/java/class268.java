import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class268 extends class261 {

    @OriginalMember(owner = "client!fu", name = "m", descriptor = "Ljava/lang/String;")
    public String field4061;

    @OriginalMember(owner = "client!fu", name = "l", descriptor = "Ls;")
    public static class186 field4060 = new class186(6, 5);

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!fu", name = "n", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!fu", name = "o", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(III)V")
    public static final void method1703(int arg0, int arg1, int arg2) {
        class234 var3 = class518.field7511[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field3605 != null) {
            var3.field3605 = null;
        }
        if (var3.field3602 != null) {
            var3.field3602 = null;
        }
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(B)V")
    public static void method1704(byte arg0) {
        int var1 = -87 % ((-arg0 - 34) / 47);
        field4060 = null;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(BLsf;)I")
    public static final int method1705(byte arg0, class366 arg1) {
        field4059++;
        int var2 = arg1.field5346;
        class166 var3 = arg1.method3169((byte) 23);
        if (arg1.field7781) {
            var2 = arg1.field5338;
        } else if (arg1.field7800 == var3.field2684 || arg1.field7800 == var3.field2671 || arg1.field7800 == var3.field2644 || arg1.field7800 == var3.field2677) {
            var2 = arg1.field5355;
        } else if (arg1.field7800 == var3.field2681 || arg1.field7800 == var3.field2659 || arg1.field7800 == var3.field2663 || arg1.field7800 == var3.field2640) {
            var2 = arg1.field5339;
        }
        if (arg0 != -82) {
            method1705((byte) -35, null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
    public class268() {
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= -11) {
            method1705((byte) -115, null);
        }
        field4062++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg5 - arg6;
        int var12 = arg2 - arg6;
        int var13 = arg5 * arg5;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class316.field4797[arg3];
        class503.method3027(arg7 - arg5, (byte) 127, arg7 - var11, arg4, var39);
        class503.method3027(arg7 - var11, (byte) 127, arg7 + var11, arg1, var39);
        class503.method3027(arg7 + var11, (byte) 127, arg5 + arg7, arg4, var39);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var35 += var28;
                    var8++;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var10++;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var33 += var30;
                    var37 += var30;
                    var10++;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var35 += var28;
                var8++;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var41 = arg3 - var9;
            int var42 = arg3 + var9;
            int var43 = arg7 + var8;
            int var44 = arg7 - var8;
            if (var40) {
                int var45 = arg7 + var10;
                int var46 = arg7 - var10;
                class503.method3027(var44, (byte) 127, var46, arg4, class316.field4797[var41]);
                class503.method3027(var46, (byte) 127, var45, arg1, class316.field4797[var41]);
                class503.method3027(var45, (byte) 127, var43, arg4, class316.field4797[var41]);
                class503.method3027(var44, (byte) 127, var46, arg4, class316.field4797[var42]);
                class503.method3027(var46, (byte) 127, var45, arg1, class316.field4797[var42]);
                class503.method3027(var45, (byte) 127, var43, arg4, class316.field4797[var42]);
            } else {
                class503.method3027(var44, (byte) 127, var43, arg4, class316.field4797[var41]);
                class503.method3027(var44, (byte) 127, var43, arg4, class316.field4797[var42]);
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class268(String arg0) {
        this.field4061 = arg0;
    }
}
