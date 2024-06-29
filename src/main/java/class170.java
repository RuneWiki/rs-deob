import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class170 extends class522 implements class351 {

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "Ldg;")
    public class283 field2516;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "Z")
    private boolean field2519;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "Lki;")
    public static class498 field2518 = new class498(76, 8);

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "I")
    public static int field2529 = -1;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lqa;Lkn;IIIIIZIIIIII)V", line = 4)
    public class170(class162 arg0, class519 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class250.method1676(arg12, arg11, -28708));
        this.field2516 = new class283(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field2519 = arg1.field7573 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)Z", line = 13)
    public final boolean method7(byte arg0) {
        ++field2517;
        if (arg0 <= 1) {
            this.field2519 = true;
        }
        return this.field2516.method1832((byte) -110);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)I", line = 25)
    public final int method17(int arg0) {
        ++field2524;
        int var2 = 50 % ((arg0 - -41) / 61);
        return this.field2516.field4053;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)V", line = 38)
    public static final void method1174(int arg0, int arg1, int arg2) {
        boolean var3 = class108.field1553[0][arg1][arg2] != null && class108.field1553[0][arg1][arg2].field7571 != null;
        for (int var4 = arg0; var4 >= 0; --var4) {
            if (class108.field1553[var4][arg1][arg2] == null) {
                class518 var5 = class108.field1553[var4][arg1][arg2] = new class518(var4, arg1, arg2);
                if (var3) {
                    ++var5.field7553;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLqa;)V", line = 60)
    public final void method10(byte arg0, class162 arg1) {
        if (arg0 == -32) {
            ++field2526;
            class121 var3 = this.field2516.method1834(false, arg1, 262144, super.field7734, true, (byte) -23, super.field7731);
            if (var3 != null) {
                int var4 = super.field7731 >> 7;
                int var5 = super.field7734 >> 7;
                this.field2516.method1836(var4, var5, var5, var4, var3, arg1, -4333, false);
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lic;BLic;Lic;Lic;)V", line = 83)
    public static final void method1175(class491 arg0, byte arg1, class491 arg2, class491 arg3, class491 arg4) {
        ++field2520;
        class354.field5428 = arg2;
        if (arg1 == 100) {
            class165.field2439 = arg3;
            class279.field4018 = arg0;
            class285.field4098 = arg4;
            class185.field2754 = new class38[class354.field5428.method2943((byte) -33)][];
            class45.field718 = new boolean[class354.field5428.method2943((byte) -33)];
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILqa;B)Z", line = 103)
    public final boolean method8(int arg0, int arg1, class162 arg2, byte arg3) {
        ++field2523;
        int var5 = -25 / ((-12 - arg3) / 36);
        class121 var6 = this.field2516.method1834(false, arg2, 131072, super.field7734, false, (byte) -23, super.field7731);
        if (var6 == null) {
            return false;
        } else {
            class414 var7 = arg2.method1115();
            var7.method913(super.field7731 + super.field7726, super.field7738, super.field7735 + super.field7734);
            return var6.method706(arg0, arg1, var7, false);
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(ILqa;)V", line = 122)
    public static final void method1176(int arg0, class162 arg1) {
        if (class402.field6034) {
            class462.method2783(arg1, (byte) 103);
        } else {
            class140.method930(true, arg1);
        }
        ++field2521;
        if (arg0 != 0) {
            field2529 = -42;
        }
    }

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "(B)I", line = 137)
    public final int method1177(byte arg0) {
        if (arg0 <= 10) {
            field2512 = 114;
        }
        ++field2525;
        return this.field2516.method1831(-82);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)I", line = 149)
    public final int method20(int arg0) {
        ++field2522;
        if (arg0 != -30685) {
            method1174(58, 11, -18);
        }
        return this.field2516.field4059;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILqa;I)Lc;", line = 162)
    public final class121 method9(int arg0, class162 arg1, int arg2) {
        ++field2515;
        return arg2 >= -22 ? null : this.field2516.method1834(false, arg1, arg0, 0, false, (byte) -23, 0);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)V", line = 173)
    public static void method1178(boolean arg0) {
        field2518 = null;
        if (!arg0) {
            method1178(false);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lqa;B)V", line = 183)
    public final void method14(class162 arg0, byte arg1) {
        if (arg1 != 72) {
            this.field2516 = null;
        }
        ++field2511;
        this.field2516.method1828(arg0, (byte) -88);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)I", line = 205)
    public final int method5(byte arg0) {
        ++field2528;
        if (arg0 != -65) {
            field2529 = 20;
        }
        return this.field2516.field4046;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V", line = 217)
    public final void method15(byte arg0) {
        if (arg0 < -10) {
            ++field2530;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILqa;)V", line = 227)
    public final void method11(int arg0, class162 arg1) {
        this.field2516.method1829(arg1, 4);
        if (arg0 <= -107) {
            ++field2514;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(ILqa;)Lnf;", line = 240)
    public final class405 method12(int arg0, class162 arg1) {
        ++field2513;
        class121 var3 = this.field2516.method1834(false, arg1, 2048, super.field7734, true, (byte) -23, super.field7731);
        if (arg0 <= 120) {
            field2518 = null;
        }
        if (var3 == null) {
            return null;
        } else {
            class414 var4 = arg1.method1115();
            var4.method913(super.field7731 + super.field7726, super.field7738, super.field7734 - -super.field7735);
            class405 var5 = null;
            if (this.field2519) {
                var5 = class75.method427(1, 0);
            }
            if (this.field2516.field4073 == null) {
                var3.method720(var4, var5 == null ? null : var5.field6108[0], 0);
            } else {
                class389 var6 = this.field2516.field4073.method1369();
                arg1.method1055(var3, var6, var4, var5 != null ? var5.field6108[0] : null, 0);
            }
            int var7 = super.field7731 >> 7;
            int var8 = super.field7734 >> 7;
            this.field2516.method1836(var7, var8, var8, var7, var3, arg1, -4333, true);
            return var5;
        }
    }
}
