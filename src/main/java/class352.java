import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public abstract class class352 extends class251 {

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "Lah;")
    public class250 field5180;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public int field5176;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    public static int field5175 = 0;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1783(byte arg0);

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(B)Z")
    public abstract boolean method1782(byte arg0);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIILin;Z)V")
    public static final void method2147(int arg0, int arg1, int arg2, class56 arg3, boolean arg4) {
        field5178++;
        class286 var5 = (class286) class14.field204.method8((byte) -98);
        if (arg4) {
            return;
        }
        while (var5 != null) {
            if (var5.field4326 == arg0 && (arg2 << 7) == var5.field4333 && (arg1 << 7) == var5.field4332 && var5.field4328.field958 == arg3.field958) {
                if (var5.field4325 != null) {
                    class178.field2786.method2099(var5.field4325);
                    var5.field4325 = null;
                }
                if (var5.field4337 != null) {
                    class178.field2786.method2099(var5.field4337);
                    var5.field4337 = null;
                }
                var5.method1121(false);
                return;
            }
            var5 = (class286) class14.field204.method17((byte) -110);
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lah;I)V")
    public class352(class250 arg0, int arg1) {
        this.field5180 = arg0;
        this.field5176 = arg1;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIII)V")
    public static final void method2148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 14134) {
            return;
        }
        field5179++;
        if (arg1 == arg5) {
            class41.method287(arg0, arg1, arg3 - 14134, arg4, arg2);
        } else if (arg4 - arg1 >= class355.field5296 && (arg1 + arg4) <= class320.field4818 && (arg2 - arg5) >= class248.field3808 && class478.field7310 >= arg2 + arg5) {
            class437.method2556(arg1, arg4, arg0, arg5, arg2, true);
        } else {
            class90.method672(arg1, arg4, arg2, arg0, 34336, arg5);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5177++;
        int var8 = arg0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg7 - arg6;
        int var12 = arg1 - arg6;
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
        int var24 = var14 - ((var21 - 1) * var18);
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
        int var36 = (arg1 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (class248.field3808 <= arg5 && class478.field7310 >= arg5) {
            int[] var39 = class69.field1212[arg5];
            int var40 = class167.method1056(class320.field4818, (byte) -122, class355.field5296, arg2 - arg7);
            int var41 = class167.method1056(class320.field4818, (byte) -126, class355.field5296, arg2 + arg7);
            int var42 = class167.method1056(class320.field4818, (byte) -124, class355.field5296, arg2 - var11);
            int var43 = class167.method1056(class320.field4818, (byte) -122, class355.field5296, arg2 + var11);
            class78.method566(var39, var42, arg3, arg0 - 7, var40);
            class78.method566(var39, var43, arg4, arg0 ^ 0xFFFFFFF9, var42);
            class78.method566(var39, var41, arg3, arg0 - 7, var43);
        }
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var37 += var30;
                        var10++;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var10++;
                    var33 += var30;
                    var37 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var31 += var28;
                var8++;
            }
            var24 += -var32;
            var23 += -var36;
            var9--;
            var36 -= var27;
            var32 -= var27;
            int var45 = arg5 - var9;
            int var46 = arg5 + var9;
            if (var46 >= class248.field3808 && class478.field7310 >= var45) {
                int var47 = class167.method1056(class320.field4818, (byte) -125, class355.field5296, arg2 + var8);
                int var48 = class167.method1056(class320.field4818, (byte) -125, class355.field5296, arg2 - var8);
                if (var44) {
                    int var49 = class167.method1056(class320.field4818, (byte) -124, class355.field5296, arg2 + var10);
                    int var50 = class167.method1056(class320.field4818, (byte) -128, class355.field5296, arg2 - var10);
                    if (var45 >= class248.field3808) {
                        int[] var51 = class69.field1212[var45];
                        class78.method566(var51, var50, arg3, -7, var48);
                        class78.method566(var51, var49, arg4, arg0 - 7, var50);
                        class78.method566(var51, var47, arg3, -7, var49);
                    }
                    if (class478.field7310 >= var46) {
                        int[] var52 = class69.field1212[var46];
                        class78.method566(var52, var50, arg3, -7, var48);
                        class78.method566(var52, var49, arg4, -7, var50);
                        class78.method566(var52, var47, arg3, -7, var49);
                    }
                } else {
                    if (var45 >= class248.field3808) {
                        class78.method566(class69.field1212[var45], var47, arg3, -7, var48);
                    }
                    if (var46 <= class478.field7310) {
                        class78.method566(class69.field1212[var46], var47, arg3, arg0 - 7, var48);
                    }
                }
            }
        }
    }
}
