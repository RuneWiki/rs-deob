import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class225 extends class262 {

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "Lab;")
    public class148 field3426 = new class148();

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "Lpd;")
    public class58 field3427 = new class58();

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "Lel;")
    private class208 field3422;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
    public static int field3409 = 0;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "Ljava/lang/String;")
    public static String field3411 = "wave:";

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    public static int field3424 = 0;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "Lse;")
    public static class211 field3414 = null;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "Lke;")
    public static class110 field3418;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "Lhc;")
    public static class235 field3413;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)V")
    public static void method1496(byte arg0) {
        field3414 = null;
        field3413 = null;
        field3418 = null;
        if (arg0 == 34) {
            field3411 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "()Lta;")
    public final class262 method355() {
        class52 var1 = (class52) this.field3426.method990(-112);
        field3415++;
        if (var1 == null) {
            return null;
        } else if (var1.field750 == null) {
            return this.method358();
        } else {
            return var1.field750;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg0;
        if (arg7 != -32181) {
            field3409 = 104;
        }
        field3410++;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg0 - arg1;
        int var12 = arg4 - arg1;
        int var13 = arg4 * arg4;
        int var14 = arg0 * arg0;
        int var15 = var12 * var12;
        int var16 = var11 * var11;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = var11 << 1;
        int var22 = (1 - var21) * var15 + var19;
        int var23 = arg0 << 1;
        int var24 = var16 - (var21 - 1) * var20;
        int var25 = var14 - ((var23 - 1) * var18);
        int var26 = var14 << 2;
        int var27 = (1 - var23) * var13 + var17;
        int var28 = var13 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var23 - 3) * var18;
        int var33 = (var21 - 3) * var20;
        int var34 = var19 * 3;
        int var35 = var26;
        int var36 = var30;
        int var37 = (arg0 - 1) * var28;
        int var38 = (var11 - 1) * var29;
        int[] var39 = class216.field3264[arg5];
        class154.method1028(-353, var39, arg3, arg2 - arg4, -var12 + arg2);
        class154.method1028(-353, var39, arg6, arg2 - var12, arg2 + var12);
        class154.method1028(-353, var39, arg3, arg2 + var12, arg2 + arg4);
        while (var8 > 0) {
            if (var27 < 0) {
                while (var27 < 0) {
                    var27 += var31;
                    var31 += var26;
                    var9++;
                    var25 += var35;
                    var35 += var26;
                }
            }
            if (var25 < 0) {
                var27 += var31;
                var31 += var26;
                var9++;
                var25 += var35;
                var35 += var26;
            }
            boolean var40 = var11 >= var8;
            var25 += -var32;
            if (var40) {
                if (var22 < 0) {
                    while (var22 < 0) {
                        var10++;
                        var22 += var34;
                        var34 += var30;
                        var24 += var36;
                        var36 += var30;
                    }
                }
                if (var24 < 0) {
                    var24 += var36;
                    var36 += var30;
                    var22 += var34;
                    var34 += var30;
                    var10++;
                }
                var24 += -var33;
                var33 -= var29;
                var22 += -var38;
                var38 -= var29;
            }
            var27 += -var37;
            var37 -= var28;
            var8--;
            int var41 = arg5 - var8;
            var32 -= var28;
            int var42 = arg2 + var9;
            int var43 = arg5 + var8;
            int var44 = arg2 - var9;
            if (var40) {
                int var45 = arg2 - var10;
                class154.method1028(-353, class216.field3264[var41], arg3, var44, var45);
                int var46 = arg2 + var10;
                class154.method1028(arg7 ^ 0x7CD4, class216.field3264[var41], arg6, var45, var46);
                class154.method1028(arg7 + 31828, class216.field3264[var41], arg3, var46, var42);
                class154.method1028(arg7 ^ 0x7CD4, class216.field3264[var43], arg3, var44, var45);
                class154.method1028(-353, class216.field3264[var43], arg6, var45, var46);
                class154.method1028(arg7 + 31828, class216.field3264[var43], arg3, var46, var42);
            } else {
                class154.method1028(arg7 + 31828, class216.field3264[var41], arg3, var44, var42);
                class154.method1028(arg7 + 31828, class216.field3264[var43], arg3, var44, var42);
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILne;)V")
    private final void method1498(int arg0, int arg1, class52 arg2) {
        if ((this.field3422.field2939[arg2.field748] & 0x4) != 0 && arg2.field744 < 0) {
            int var4 = this.field3422.field2934[arg2.field748] / class60.field845;
            int var5 = (var4 + 1048575 - arg2.field751) / var4;
            arg2.field751 = arg2.field751 + (arg0 * var4) & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field3422.field2937[arg2.field748] == 0) {
                    arg2.field750 = class112.method765(arg2.field761, arg2.field750.method737(), arg2.field750.method744(), arg2.field750.method733());
                } else {
                    arg2.field750 = class112.method765(arg2.field761, arg2.field750.method737(), 0, arg2.field750.method733());
                    this.field3422.method1321(arg2.field752.field2855[arg2.field759] < 0, 128, arg2);
                }
                if (arg2.field752.field2855[arg2.field759] < 0) {
                    arg2.field750.method767(-1);
                }
                arg0 = arg2.field751 / var4;
            }
        }
        int var6 = -46 % ((arg1 + 67) / 36);
        field3412++;
        arg2.field750.method356(arg0);
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)V")
    public final void method356(int arg0) {
        field3419++;
        this.field3427.method356(arg0);
        for (class52 var2 = (class52) this.field3426.method990(-71); var2 != null; var2 = (class52) this.field3426.method993(-100)) {
            if (!this.field3422.method1349(3969, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field746 >= var3) {
                        this.method1498(var3, 54, var2);
                        var2.field746 -= var3;
                        break;
                    }
                    this.method1498(var2.field746, 11, var2);
                    var3 -= var2.field746;
                } while (!this.field3422.method1350(var3, var2, -178226298, (int[]) null, 0));
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lne;[IIIII)V")
    private final void method1499(class52 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 100) {
            this.method1498(-76, 85, (class52) null);
        }
        field3416++;
        if ((this.field3422.field2939[arg0.field748] & 0x4) != 0 && arg0.field744 < 0) {
            int var7 = this.field3422.field2934[arg0.field748] / class60.field845;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field751) / var7;
                if (var8 > arg2) {
                    arg0.field751 += arg2 * var7;
                    break;
                }
                arg0.field750.method361(arg1, arg4, var8);
                arg4 += var8;
                int var9 = 262144 / var7;
                arg0.field751 += var7 * var8 - 1048576;
                int var10 = class60.field845 / 100;
                arg2 -= var8;
                if (var9 < var10) {
                    var10 = var9;
                }
                class112 var11 = arg0.field750;
                if (this.field3422.field2937[arg0.field748] == 0) {
                    arg0.field750 = class112.method765(arg0.field761, var11.method737(), var11.method744(), var11.method733());
                } else {
                    arg0.field750 = class112.method765(arg0.field761, var11.method737(), 0, var11.method733());
                    this.field3422.method1321(arg0.field752.field2855[arg0.field759] < 0, arg3 ^ 0xE4, arg0);
                    arg0.field750.method751(var10, var11.method744());
                }
                if (arg0.field752.field2855[arg0.field759] < 0) {
                    arg0.field750.method767(-1);
                }
                var11.method730(var10);
                var11.method361(arg1, arg4, arg5 - arg4);
                if (var11.method758()) {
                    this.field3427.method359(var11);
                }
            }
        }
        arg0.field750.method361(arg1, arg4, arg2);
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "()Lta;")
    public final class262 method358() {
        field3417++;
        class52 var1;
        do {
            var1 = (class52) this.field3426.method993(-90);
            if (var1 == null) {
                return null;
            }
        } while (var1.field750 == null);
        return var1.field750;
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "()I")
    public final int method362() {
        field3420++;
        return 0;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "([III)V")
    public final void method361(int[] arg0, int arg1, int arg2) {
        this.field3427.method361(arg0, arg1, arg2);
        for (class52 var4 = (class52) this.field3426.method990(-85); var4 != null; var4 = (class52) this.field3426.method993(-78)) {
            if (!this.field3422.method1349(3969, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field746 >= var5) {
                        this.method1499(var4, arg0, var5, 100, var6, var5 + var6);
                        var4.field746 -= var5;
                        break;
                    }
                    this.method1499(var4, arg0, var4.field746, 100, var6, var6 + var5);
                    var5 -= var4.field746;
                    var6 += var4.field746;
                } while (!this.field3422.method1350(var5, var4, -178226298, arg0, var6));
            }
        }
        field3423++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)V")
    public static final void method1500(int arg0, boolean arg1) {
        field3421++;
        if (arg1) {
            method1496((byte) 5);
        }
        class280 var2 = class181.method1180(arg0, 0, 9);
        var2.method1871((byte) 26);
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lel;)V")
    public class225(class208 arg0) {
        this.field3422 = arg0;
    }
}
