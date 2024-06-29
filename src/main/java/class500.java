import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class500 extends class143 {

    @OriginalMember(owner = "client!oaa", name = "K", descriptor = "Leda;")
    public static class116 field7432 = new class116(98, 12);

    @OriginalMember(owner = "client!oaa", name = "A", descriptor = "I")
    public static int field7424;

    @OriginalMember(owner = "client!oaa", name = "B", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!oaa", name = "C", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!oaa", name = "D", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!oaa", name = "F", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!oaa", name = "G", descriptor = "I")
    public static int field7429;

    @OriginalMember(owner = "client!oaa", name = "H", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!oaa", name = "J", descriptor = "Lmo;")
    private class482 field7431;

    @OriginalMember(owner = "client!oaa", name = "L", descriptor = "[[I")
    public static int[][] field7433;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IILek;)V")
    private final void method2987(int arg0, int arg1, class465 arg2) {
        field7426++;
        if (arg1 == 249) {
            int var4 = arg2.method2705(-94);
            if (this.field7431 == null) {
                int var5 = class99.method830(var4, false);
                this.field7431 = new class482(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method2705(-31) == 1;
                int var8 = arg2.method2714(true);
                class435 var9;
                if (var7) {
                    var9 = new class527(arg2.method2717(true));
                } else {
                    var9 = new class83(arg2.method2691((byte) -67));
                }
                this.field7431.method2816(var9, (long) var8, false);
            }
        }
        if (arg0 != -2) {
            this.field7431 = null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIZIIIIII)V")
    public static final void method2988(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (!arg3) {
            field7433 = null;
        }
        if (arg1 == arg8 && arg0 == arg9 && arg4 == arg5 && arg2 == arg7) {
            class580.method3362(arg6, arg2, -13865, arg9, arg4, arg1);
        } else {
            int var10 = arg1;
            int var11 = arg9;
            int var12 = arg1 * 3;
            int var13 = arg9 * 3;
            int var14 = arg8 * 3;
            int var15 = arg0 * 3;
            int var16 = arg5 * 3;
            int var17 = arg7 * 3;
            int var18 = arg4 + var14 - var16 - arg1;
            int var19 = arg2 + var15 - var17 - arg9;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 - var15 - (var15 - var13);
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg1;
                int var34 = arg9 + (var28 + var32 + var30 >> 12);
                class580.method3362(arg6, var34, -13865, var11, var33, var10);
                var11 = var34;
                var10 = var33;
            }
        }
        field7427++;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IBI)I")
    public final int method2989(int arg0, byte arg1, int arg2) {
        field7429++;
        if (this.field7431 == null) {
            return arg0;
        }
        if (arg1 != 1) {
            method2992(-59, 8);
        }
        class83 var4 = (class83) this.field7431.method2818(-22803, (long) arg2);
        return var4 == null ? arg0 : var4.field1264;
    }

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "(B)V")
    public static void method2990(byte arg0) {
        field7432 = null;
        if (arg0 >= -14) {
            method2992(-16, 107);
        }
        field7433 = null;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BLek;)V")
    public final void method2991(byte arg0, class465 arg1) {
        while (true) {
            int var3 = arg1.method2705(arg0 - 175);
            if (var3 == 0) {
                if (arg0 != 54) {
                    return;
                }
                field7424++;
                return;
            }
            this.method2987(-2, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)I")
    public static final int method2992(int arg0, int arg1) {
        field7428++;
        return arg0 == -30141 ? (arg1 & 0x3FDA2) >> 11 : -15;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
    public final String method2993(String arg0, int arg1, int arg2) {
        field7425++;
        if (this.field7431 == null) {
            return arg0;
        }
        class527 var4 = (class527) this.field7431.method2818(arg2 ^ 0xFFFF9B3C, (long) arg1);
        if (arg2 == 15825) {
            return var4 == null ? arg0 : var4.field7719;
        } else {
            return null;
        }
    }
}
