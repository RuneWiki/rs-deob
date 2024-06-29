import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class218 extends class596 {

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "Lw;")
    public class471 field2968;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "Lwu;")
    public static class582 field2966 = new class582("", 19);

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "F")
    public static float field2969;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "[I")
    public static int[] field2967;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
    public static void method1431(byte arg0) {
        if (arg0 != -103) {
            method1431((byte) 58);
        }
        field2966 = null;
        field2967 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILte;IIII)V")
    public static final void method1432(int arg0, class53 arg1, int arg2, int arg3, int arg4, int arg5) {
        field2970++;
        if (arg1.field698 == -1 && arg1.field685 == null) {
            return;
        }
        int var6 = 0;
        int var7 = arg1.field675 * class485.field6252.field6956.method1340(false) >> 8;
        if (arg1.field680 < arg3) {
            var6 += arg3 - arg1.field680;
        } else if (arg1.field673 > arg3) {
            var6 += arg1.field673 - arg3;
        }
        if (arg4 > arg1.field691) {
            var6 += arg4 - arg1.field691;
        } else if (arg4 < arg1.field683) {
            var6 += arg1.field683 - arg4;
        }
        if (arg1.field690 == 0 || (var6 - 256) > arg1.field690 || class485.field6252.field6956.method1340(false) == 0 || arg1.field679 != arg5) {
            if (arg1.field686 != null) {
                class1.field10.method30(arg1.field686);
                arg1.field686 = null;
                arg1.field684 = null;
                arg1.field674 = null;
            }
            if (arg1.field689 != null) {
                class1.field10.method30(arg1.field689);
                arg1.field672 = null;
                arg1.field697 = null;
                arg1.field689 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = arg1.field690 - arg1.field687;
        if (var8 < 0) {
            var8 = arg1.field690;
        }
        if (arg0 != -12955) {
            method1431((byte) 91);
        }
        int var9 = var7;
        int var10 = var6 - arg1.field687;
        if (var10 > 0 && var8 > 0) {
            var9 = (var8 - var10) * var7 / var8;
        }
        class422.field5564.method190((byte) -112);
        int var11 = 8192;
        int var12 = (arg1.field680 + arg1.field673) / 2 - arg3;
        int var13 = (arg1.field691 + arg1.field683) / 2 - arg4;
        if (var12 != 0 || var13 != 0) {
            int var14 = -class232.field3122 - (int) (Math.atan2((double) var12, (double) var13) * 2607.5945876176133D) - 4096 & 0x3FFF;
            if (var14 > 8192) {
                var14 = 16384 - var14;
            }
            int var15;
            if (var6 <= 0) {
                var15 = 8192;
            } else if (var6 >= 4096) {
                var15 = 16384;
            } else {
                var15 = (var6 * 8192 / 4096) + 8192;
            }
            var11 = var14 * var15 / 8192 + (16384 - var15 >> 1);
        }
        if (arg1.field686 != null) {
            arg1.field686.method3412(var9);
            arg1.field686.method3418(var11);
        } else if (arg1.field698 >= 0) {
            int var16 = arg1.field694 == 256 && arg1.field688 == 256 ? 256 : class783.method4296((byte) 57, arg1.field688, arg1.field694);
            if (arg1.field678) {
                if (arg1.field684 == null) {
                    arg1.field684 = class74.method435(class681.field8795, arg1.field698);
                }
                if (arg1.field684 != null) {
                    if (arg1.field674 == null) {
                        arg1.field674 = arg1.field684.method444(new int[] { 22050 });
                    }
                    if (arg1.field674 != null) {
                        class635 var20 = class635.method3411(arg1.field674, var16, var9 << 6, var11);
                        var20.method3428(-1);
                        class1.field10.method41(var20);
                        arg1.field686 = var20;
                    }
                }
            } else {
                class543 var17 = class543.method2949(class664.field8660, arg1.field698, 0);
                if (var17 != null) {
                    class701 var18 = var17.method2952().method3801(class738.field9993);
                    class635 var19 = class635.method3411(var18, var16, var9 << 6, var11);
                    var19.method3428(-1);
                    class1.field10.method41(var19);
                    arg1.field686 = var19;
                }
            }
        }
        if (arg1.field689 != null) {
            arg1.field689.method3412(var9);
            arg1.field689.method3418(var11);
            if (!arg1.field689.method1942(arg0 + 40430)) {
                arg1.field689 = null;
                arg1.field672 = null;
                arg1.field697 = null;
            }
        } else if (arg1.field685 != null && (arg1.field699 -= arg2) <= 0) {
            int var21 = arg1.field694 == 256 && arg1.field688 == 256 ? 256 : arg1.field688 + (int) (Math.random() * (double) (arg1.field694 - arg1.field688));
            if (!arg1.field692) {
                int var22 = (int) (Math.random() * (double) arg1.field685.length);
                class543 var23 = class543.method2949(class664.field8660, arg1.field685[var22], 0);
                if (var23 != null) {
                    class701 var24 = var23.method2952().method3801(class738.field9993);
                    class635 var25 = class635.method3411(var24, var21, var9 << 6, var11);
                    var25.method3428(0);
                    class1.field10.method41(var25);
                    arg1.field689 = var25;
                    arg1.field699 = arg1.field671 + (int) (Math.random() * (double) (arg1.field669 - arg1.field671));
                    return;
                }
                return;
            }
            if (arg1.field697 == null) {
                int var26 = (int) ((double) arg1.field685.length * Math.random());
                arg1.field697 = class74.method435(class681.field8795, arg1.field685[var26]);
            }
            if (arg1.field697 != null) {
                if (arg1.field672 == null) {
                    arg1.field672 = arg1.field697.method444(new int[] { 22050 });
                }
                if (arg1.field672 != null) {
                    class635 var27 = class635.method3411(arg1.field672, var21, var9 << 6, var11);
                    var27.method3428(0);
                    class1.field10.method41(var27);
                    arg1.field689 = var27;
                    arg1.field699 = (int) ((double) (arg1.field669 - arg1.field671) * Math.random()) + arg1.field671;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lgd;II[B)V")
    public class218(class696 arg0, int arg1, int arg2, byte[] arg3) {
        this.field2968 = arg0.method3753(106, arg2, arg3, arg1, class483.field6239, false);
        this.field2968.method1131(false, false, 111);
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lgd;II[I)V")
    public class218(class696 arg0, int arg1, int arg2, int[] arg3) {
        this.field2968 = arg0.method3719(arg1, arg3, (byte) -117, arg2, false);
        this.field2968.method1131(false, false, 89);
    }
}
