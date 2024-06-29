import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class138 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field2063 = 0;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2068 = "Use";

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field2069 = -1;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Ltl;")
    public static class222 field2067 = new class222(32);

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 5)
    public static void method931(byte arg0) {
        field2067 = null;
        if (arg0 != -97) {
            method933((byte) -35, -89);
        }
        field2068 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lkb;I)V", line = 23)
    public static final void method932(class39 arg0, int arg1) {
        class89.field1361 = arg0;
        int var2 = 70 % ((-arg1 - 59) / 39);
        field2065++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)Lfm;", line = 34)
    public static final class52 method933(byte arg0, int arg1) {
        field2066++;
        class52 var2 = (class52) class185.field2976.method1619((long) arg1, 114);
        if (var2 != null) {
            return var2;
        }
        if (arg0 < 72) {
            method933((byte) -59, 92);
        }
        byte[] var3 = class340.field5277.method250(true, 33, arg1);
        class52 var4 = new class52();
        if (var3 != null) {
            var4.method358(-19324, arg1, new class192(var3));
        }
        class185.field2976.method1621((long) arg1, -105, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIIB)V", line = 68)
    public static final void method934(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        int var8 = 0;
        field2064++;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg2 - arg1;
        int var12 = arg0 - arg1;
        int var13 = arg2 * arg2;
        int var14 = var12 * var12;
        int var15 = var11 * var11;
        int var16 = var13 << 1;
        int var17 = arg0 * arg0;
        int var18 = var14 << 1;
        int var19 = var15 << 1;
        int var20 = var17 << 1;
        int var21 = var12 << 1;
        int var22 = arg0 << 1;
        int var23 = (1 - var22) * var13 + var20;
        int var24 = var17 - ((var22 - 1) * var16);
        int var25 = (1 - var21) * var15 + var18;
        int var26 = var14 - ((var21 - 1) * var19);
        if (arg7 != 38) {
            return;
        }
        int var27 = var13 << 2;
        int var28 = var15 << 2;
        int var29 = var14 << 2;
        int var30 = var17 << 2;
        int var31 = var20 * 3;
        int var32 = (var22 - 3) * var16;
        int var33 = var18 * 3;
        int var34 = (var21 - 3) * var19;
        int var35 = var29;
        int var36 = var30;
        int[] var37 = class310.field4841[arg4];
        int var38 = (var12 - 1) * var28;
        class245.method1738(48, var37, arg3 - var11, -arg2 + arg3, arg5);
        class245.method1738(48, var37, arg3 + var11, -var11 + arg3, arg6);
        class245.method1738(48, var37, arg2 + arg3, arg3 + var11, arg5);
        int var39 = (arg0 - 1) * var27;
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var24 += var36;
                    var36 += var30;
                    var23 += var31;
                    var31 += var30;
                }
            }
            if (var24 < 0) {
                var24 += var36;
                var36 += var30;
                var8++;
                var23 += var31;
                var31 += var30;
            }
            var24 += -var32;
            boolean var40 = var12 >= var9;
            var9--;
            var23 += -var39;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var35;
                        var10++;
                        var35 += var29;
                        var25 += var33;
                        var33 += var29;
                    }
                }
                if (var26 < 0) {
                    var10++;
                    var26 += var35;
                    var35 += var29;
                    var25 += var33;
                    var33 += var29;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var28;
                var38 -= var28;
            }
            var32 -= var27;
            var39 -= var27;
            int var41 = arg4 - var9;
            int var42 = arg4 + var9;
            int var43 = arg3 + var8;
            int var44 = arg3 - var8;
            if (var40) {
                int var45 = arg3 - var10;
                class245.method1738(48, class310.field4841[var41], var45, var44, arg5);
                int var46 = arg3 + var10;
                class245.method1738(48, class310.field4841[var41], var46, var45, arg6);
                class245.method1738(48, class310.field4841[var41], var43, var46, arg5);
                class245.method1738(48, class310.field4841[var42], var45, var44, arg5);
                class245.method1738(arg7 ^ 0x16, class310.field4841[var42], var46, var45, arg6);
                class245.method1738(48, class310.field4841[var42], var43, var46, arg5);
            } else {
                class245.method1738(48, class310.field4841[var41], var43, var44, arg5);
                class245.method1738(arg7 + 10, class310.field4841[var42], var43, var44, arg5);
            }
        }
    }
}
