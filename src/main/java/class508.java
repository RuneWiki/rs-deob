import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class508 extends class167 {

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
    public int field7177;

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "I")
    public int field7172;

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "Liba;")
    public static class211 field7169 = new class211(11, -1);

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "Lmi;")
    public static class23 field7174 = class489.method2798((byte) 35);

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
    public static int field7176 = 4;

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "F")
    public static float field7178;

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
    public static int field7179;

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field7175;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V")
    public static final void method2886(int arg0) {
        field7173++;
        if (arg0 != -1) {
            method2888(-113, 31, 108, -38, -113, -75, -74, -43);
        }
        class692 var1 = class423.field6210;
        synchronized (class423.field6210) {
            class423.field6210.method3891(13747);
        }
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(I)V")
    public static void method2887(int arg0) {
        field7169 = null;
        if (arg0 < 14) {
            field7178 = 0.45513156F;
        }
        field7174 = null;
        field7175 = null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2888(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7171++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg7 - arg3;
        int var12 = arg4 - arg3;
        int var13 = arg7 * arg7;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg4 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg4 + arg5) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class565.field8253[arg2];
        class41.method235(arg6 - arg7, var39, 0, arg6 - var11, arg1);
        class41.method235(arg6 - var11, var39, 0, arg6 + var11, arg0);
        class41.method235(arg6 + var11, var39, 0, arg6 + arg7, arg1);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var33 += var30;
                        var10++;
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
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var9--;
            var36 -= var27;
            var32 -= var27;
            int var41 = arg2 - var9;
            int var42 = arg2 + var9;
            int var43 = arg6 + var8;
            int var44 = arg6 - var8;
            if (var40) {
                int var45 = arg6 + var10;
                int var46 = arg6 - var10;
                class41.method235(var44, class565.field8253[var41], 0, var46, arg1);
                class41.method235(var46, class565.field8253[var41], 0, var45, arg0);
                class41.method235(var45, class565.field8253[var41], 0, var43, arg1);
                class41.method235(var44, class565.field8253[var42], 0, var46, arg1);
                class41.method235(var46, class565.field8253[var42], 0, var45, arg0);
                class41.method235(var45, class565.field8253[var42], arg5 + 1, var43, arg1);
            } else {
                class41.method235(var44, class565.field8253[var41], 0, var43, arg1);
                class41.method235(var44, class565.field8253[var42], 0, var43, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)Lmh;")
    public final class139 method599(int arg0) {
        int var2 = -75 % ((-arg0 - 89) / 34);
        field7179++;
        return class338.field4916;
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Ltca;Lvea;IIIIIIIIII)V")
    public class508(class545 arg0, class305 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field7177 = arg10;
        this.field7172 = arg11;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
    public static final void method2889(byte arg0) {
        field7170++;
        if (arg0 != 0) {
            method2887(88);
        }
        int var1 = class335.field4872.method3427(class62.field996, arg0 + 110);
        if (var1 == 0) {
            class603.field8703 = null;
            class178.method1209(false, 0);
        } else if (var1 == 1) {
            class81.method468((byte) 0, 112);
            class178.method1209(false, 512);
            if (class317.field4622 != null) {
                class355.method2198((byte) -27);
            }
        } else {
            class81.method468((byte) (class229.field3041 - 4 & 0xFF), 2);
            class178.method1209(false, 2);
        }
        class595.field8621 = class49.field779;
    }
}
