import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class519 extends class439 {

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public int field7620;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public int field7621;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public int field7624;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public int field7628;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public int field7629;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public int field7631;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "Ltn;")
    public class58 field7622;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "Ltn;")
    public class58 field7625;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "Ljava/lang/String;")
    public String field7633;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "Z")
    public boolean field7630;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "[I")
    public static int[] field7623;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "[Ljava/lang/Object;")
    public Object[] field7627;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V", line = 3)
    public static final void method3067(byte arg0) {
        field7632++;
        for (int var1 = 0; var1 < class526.field7726.length; var1++) {
            for (int var2 = 0; var2 < class526.field7726[var1].length; var2++) {
                class526.field7726[var1][var2] = class340.field5201;
            }
        }
        if (arg0 > -104) {
            method3067((byte) 57);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIZI)V", line = 32)
    public static final void method3068(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field7619++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg1 - arg3;
        int var12 = arg0 - arg3;
        int var13 = arg1 * arg1;
        int var14 = arg0 * arg0;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg0 << 1;
        int var22 = var12 << 1;
        if (arg6) {
            method3067((byte) 32);
        }
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
        int var36 = (arg0 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class436.field6332[arg4];
        class217.method1448(var39, arg7 - arg1, arg2, 4, arg7 - var11);
        class217.method1448(var39, arg7 - var11, arg5, 4, arg7 + var11);
        class217.method1448(var39, arg7 + var11, arg2, 4, arg1 + arg7);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var8++;
                    var31 += var28;
                }
            }
            if (var40) {
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
                    var33 += var30;
                    var10++;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
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
            var32 -= var27;
            var36 -= var27;
            var9--;
            int var41 = arg4 - var9;
            int var42 = arg4 + var9;
            int var43 = arg7 + var8;
            int var44 = arg7 - var8;
            if (var40) {
                int var45 = arg7 + var10;
                int var46 = arg7 - var10;
                class217.method1448(class436.field6332[var41], var44, arg2, 4, var46);
                class217.method1448(class436.field6332[var41], var46, arg5, 4, var45);
                class217.method1448(class436.field6332[var41], var45, arg2, 4, var43);
                class217.method1448(class436.field6332[var42], var44, arg2, 4, var46);
                class217.method1448(class436.field6332[var42], var46, arg5, 4, var45);
                class217.method1448(class436.field6332[var42], var45, arg2, 4, var43);
            } else {
                class217.method1448(class436.field6332[var41], var44, arg2, 4, var43);
                class217.method1448(class436.field6332[var42], var44, arg2, 4, var43);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V", line = 207)
    public static void method3069(int arg0) {
        field7623 = null;
        if (arg0 != 0) {
            method3070(89, 1, null);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILjava/lang/String;)V", line = 224)
    public static final void method3070(int arg0, int arg1, String arg2) {
        field7626++;
        class434 var3 = class483.method2888(arg0, -98, 2);
        var3.method2632((byte) 81);
        if (arg1 != -20142) {
            field7623 = null;
        }
        var3.field6318 = arg2;
    }
}
