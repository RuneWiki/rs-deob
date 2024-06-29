import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class34 extends class159 {

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public int field514 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public int field519 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public int field523 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public int field525 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public int field530 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public int field522 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public int field524 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    public int field531 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Lbb;")
    public class148 field520;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "[I")
    public static int[] field515 = new int[50];

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "Ljava/lang/String;")
    public static String field526 = "flash2:";

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field529 = null;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "Ljava/lang/String;")
    public static String field521 = "glow2:";

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIII)V", line = 9)
    public static final void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field532++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg2 - arg7;
        int var12 = arg1 - arg7;
        int var13 = 118 / ((-arg0 - 56) / 40);
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = arg2 * arg2;
        int var17 = var12 * var12;
        int var18 = var16 << 1;
        int var19 = var14 << 1;
        int var20 = var15 << 1;
        int var21 = var17 << 1;
        int var22 = arg1 << 1;
        int var23 = var12 << 1;
        int var24 = var14 - ((var22 - 1) * var18);
        int var25 = (1 - var22) * var16 + var19;
        int var26 = var17 - ((var23 - 1) * var20);
        int var27 = var16 << 2;
        int var28 = (1 - var23) * var15 + var21;
        int var29 = var15 << 2;
        int var30 = var19 * 3;
        int var31 = var14 << 2;
        int var32 = (var22 - 3) * var18;
        int var33 = var17 << 2;
        int var34 = var21 * 3;
        int var35 = (arg1 - 1) * var27;
        int var36 = var33;
        int var37 = var31;
        int var38 = (var12 - 1) * var29;
        int var39 = (var23 - 3) * var20;
        int[] var40 = class306.field4998[arg4];
        class270.method1906(arg6, arg5 - var11, -arg2 + arg5, var40, 125);
        class270.method1906(arg3, arg5 + var11, arg5 - var11, var40, 120);
        class270.method1906(arg6, arg2 + arg5, arg5 + var11, var40, 120);
        while (var9 > 0) {
            if (var25 < 0) {
                while (var25 < 0) {
                    var25 += var30;
                    var8++;
                    var30 += var31;
                    var24 += var37;
                    var37 += var31;
                }
            }
            if (var24 < 0) {
                var24 += var37;
                var8++;
                var37 += var31;
                var25 += var30;
                var30 += var31;
            }
            var24 += -var32;
            boolean var41 = var12 >= var9;
            var9--;
            var25 += -var35;
            if (var41) {
                if (var28 < 0) {
                    while (var28 < 0) {
                        var26 += var36;
                        var10++;
                        var28 += var34;
                        var34 += var33;
                        var36 += var33;
                    }
                }
                if (var26 < 0) {
                    var28 += var34;
                    var10++;
                    var34 += var33;
                    var26 += var36;
                    var36 += var33;
                }
                var28 += -var38;
                var38 -= var29;
                var26 += -var39;
                var39 -= var29;
            }
            var32 -= var27;
            int var42 = arg4 - var9;
            var35 -= var27;
            int var43 = arg4 + var9;
            int var44 = arg5 + var8;
            int var45 = arg5 - var8;
            if (var41) {
                int var46 = arg5 + var10;
                int var47 = arg5 - var10;
                class270.method1906(arg6, var47, var45, class306.field4998[var42], 124);
                class270.method1906(arg3, var46, var47, class306.field4998[var42], 126);
                class270.method1906(arg6, var44, var46, class306.field4998[var42], 125);
                class270.method1906(arg6, var47, var45, class306.field4998[var43], 116);
                class270.method1906(arg3, var46, var47, class306.field4998[var43], 118);
                class270.method1906(arg6, var44, var46, class306.field4998[var43], 123);
            } else {
                class270.method1906(arg6, var44, var45, class306.field4998[var42], 121);
                class270.method1906(arg6, var44, var45, class306.field4998[var43], 123);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lbb;)V", line = 325)
    public class34(class148 arg0) {
        this.field520 = arg0;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V", line = 191)
    public static void method287(int arg0) {
        field529 = null;
        field515 = null;
        field526 = null;
        field521 = null;
        if (arg0 <= 122) {
            field529 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)I", line = 212)
    public static final int method288(int arg0, int arg1, int arg2, int arg3) {
        field516++;
        if (arg0 != 3) {
            method288(10, -28, 41, -12);
        }
        return arg2 <= arg1 ? (arg3 >= arg1 ? arg1 : arg3) : arg2;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(III)Z", line = 228)
    public final boolean method289(int arg0, int arg1, int arg2) {
        field517++;
        if (arg0 >= this.field524 && this.field531 >= arg0 && arg1 >= this.field530 && this.field525 >= arg1) {
            return true;
        } else {
            if (arg2 != -646) {
                field515 = (int[]) null;
            }
            return arg0 >= this.field523 && arg0 <= this.field522 && arg1 >= this.field514 && this.field519 >= arg1;
        }
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V", line = 258)
    public static final void method290(int arg0) {
        field527++;
        int var1 = class53.field800;
        int var2 = class2.field7;
        int var3 = class235.field3732;
        int var4 = class265.field4362;
        int var5 = 6116423;
        if (class245.field3886) {
            class335.method2380(var1, var2, var3, var4, var5);
            class335.method2380(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class335.method2376(var1 + 1, var2 + 18, var3 - 2, var4 + -19, 0);
        } else {
            class317.method2282(var1, var2, var3, var4, var5);
            class317.method2282(var1 + 1, var2 - -1, var3 - 2, 16, 0);
            class317.method2266(var1 + 1, var2 + 18, var3 - 2, var4 + -19, 0);
        }
        class31.field471.method1232(class242.field3821, var1 + 3, var2 + 14, var5, -1);
        if (arg0 != 18) {
            method286(102, 105, -74, 87, 110, -30, 16, 66);
        }
        int var6 = class130.field1982;
        int var7 = class305.field4988;
        for (int var8 = 0; var8 < class117.field1701; var8++) {
            int var9 = 16777215;
            int var10 = var2 + ((class117.field1701 - (1 - -var8)) * 15) + 31;
            if (var1 < var7 && var1 + var3 > var7 && var6 > (var10 - 13) && (var10 + 3) > var6) {
                var9 = 16776960;
            }
            class31.field471.method1232(client.method895(var8, arg0 + 26985), var1 + 3, var10, var9, 0);
        }
        class213.method1452(class235.field3732, class265.field4362, class2.field7, (byte) 114, class53.field800);
    }
}
