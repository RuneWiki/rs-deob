import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class247 {

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3465 = new String[100];

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Z")
    public static boolean field3472 = false;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "[[[I")
    public static int[][][] field3464;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BII)Z", line = 5)
    public static final boolean method1648(byte arg0, int arg1, int arg2) {
        field3467++;
        if (arg0 == -23) {
            return (arg2 & 0x10000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIBI)V", line = 19)
    public static final void method1649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field3468++;
        int var8 = 0;
        int var9 = arg1;
        if (arg6 < 114) {
            method1652(-118, -32, true, 103, -86, 63);
        }
        int var10 = 0;
        int var11 = arg7 - arg5;
        int var12 = arg1 - arg5;
        int var13 = arg7 * arg7;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg1 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
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
        int var36 = (arg1 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (class558.field7940 <= arg0 && class748.field10458 >= arg0) {
            int[] var39 = class329.field4651[arg0];
            int var40 = class498.method3000(false, class612.field8854, arg2 - arg7, class156.field2337);
            int var41 = class498.method3000(false, class612.field8854, arg2 + arg7, class156.field2337);
            int var42 = class498.method3000(false, class612.field8854, arg2 - var11, class156.field2337);
            int var43 = class498.method3000(false, class612.field8854, arg2 + var11, class156.field2337);
            class399.method2472(27113, var40, var42, arg3, var39);
            class399.method2472(27113, var42, var43, arg4, var39);
            class399.method2472(27113, var43, var41, arg3, var39);
        }
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var10++;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    var35 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var8++;
                var35 += var28;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var32 -= var27;
            var36 -= var27;
            var9--;
            int var45 = arg0 - var9;
            int var46 = arg0 + var9;
            if (var46 >= class558.field7940 && class748.field10458 >= var45) {
                int var47 = class498.method3000(false, class612.field8854, arg2 + var8, class156.field2337);
                int var48 = class498.method3000(false, class612.field8854, arg2 - var8, class156.field2337);
                if (var44) {
                    int var49 = class498.method3000(false, class612.field8854, arg2 + var10, class156.field2337);
                    int var50 = class498.method3000(false, class612.field8854, arg2 - var10, class156.field2337);
                    if (var45 >= class558.field7940) {
                        int[] var51 = class329.field4651[var45];
                        class399.method2472(27113, var48, var50, arg3, var51);
                        class399.method2472(27113, var50, var49, arg4, var51);
                        class399.method2472(27113, var49, var47, arg3, var51);
                    }
                    if (var46 <= class748.field10458) {
                        int[] var52 = class329.field4651[var46];
                        class399.method2472(27113, var48, var50, arg3, var52);
                        class399.method2472(27113, var50, var49, arg4, var52);
                        class399.method2472(27113, var49, var47, arg3, var52);
                    }
                } else {
                    if (class558.field7940 <= var45) {
                        class399.method2472(27113, var48, var47, arg3, class329.field4651[var45]);
                    }
                    if (class748.field10458 >= var46) {
                        class399.method2472(27113, var48, var47, arg3, class329.field4651[var46]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 222)
    public static final void method1650(int arg0) {
        if (arg0 != 26911) {
            method1648((byte) -27, -123, -52);
        }
        class118.field1855.method3050(false);
        field3470++;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V", line = 239)
    public static void method1651(int arg0) {
        field3464 = null;
        if (arg0 != 13196) {
            field3464 = null;
        }
        field3465 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIZIII)V", line = 256)
    public static final void method1652(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (!arg2) {
            field3464 = null;
        }
        field3469++;
        if (class471.field6781.field6690.method3134(27669) != 0 && arg1 != 0 && class570.field8115 < 50 && arg4 != -1) {
            class719.field10073[class570.field8115++] = new class710((byte) 1, arg4, arg1, arg5, arg3, 0, arg0, null);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)Z", line = 274)
    public static final boolean method1653(int arg0, int arg1, int arg2) {
        if (arg0 != -1717070207) {
            field3472 = true;
        }
        field3471++;
        return (arg2 & 0x60000) != 0 | class348.method2186(arg2, (byte) -124, arg1) || class554.method3244(-1, arg1, arg2) || class199.method1392((byte) -126, arg2, arg1);
    }
}
