import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class302 extends class233 implements class18 {

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "La;")
    public class233 field4555;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field4548 = 0;

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "Z")
    public static boolean field4565 = true;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "Lnn;")
    public static class151 field4562 = new class151("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "[I")
    public static int[] field4567 = new int[2048];

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "J")
    public static long field4568 = -1L;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "Lpf;")
    public static class425 field4569 = new class425(8, 3);

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "[[B")
    public static byte[][] field4571 = new byte[1000][];

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "Ljg;")
    public static class241 field4570 = new class241(16);

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
    public static int field4573 = -1;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "Liq;")
    public static class134 field4572;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)I")
    public final int method9(int arg0) {
        field4560++;
        return arg0 <= 26 ? -30 : 0;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V")
    public final void method11(int arg0) {
        field4553++;
        if (arg0 != -21910) {
            this.method1(107);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)Z")
    public final boolean method1(int arg0) {
        field4564++;
        int var2 = -3 % ((arg0 + 1) / 46);
        return false;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)I")
    public final int method3(byte arg0) {
        field4557++;
        if (arg0 >= -3) {
            field4568 = 30L;
        }
        return 0;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
    public final void method116(byte arg0) {
        field4566++;
        if (arg0 > -45) {
            method1861(120);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILdr;I)Z")
    public final boolean method4(int arg0, int arg1, class261 arg2, int arg3) {
        field4551++;
        if (arg3 != 2) {
            field4573 = 78;
        }
        return false;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)I")
    public final int method7(boolean arg0) {
        if (!arg0) {
            field4548 = 87;
        }
        field4561++;
        return 0;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(Ldr;I)V")
    public final void method15(class261 arg0, int arg1) {
        field4550++;
        if (arg1 <= 114) {
            this.method12((class261) null, 91, (byte) -112);
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIILa;)V")
    public class302(int arg0, int arg1, int arg2, int arg3, int arg4, class233 arg5) {
        super(arg2, arg3, arg4, class465.method2864(arg0, arg1, 2767));
        this.field4555 = arg5;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ldr;IB)Lwp;")
    public final class292 method12(class261 arg0, int arg1, byte arg2) {
        field4556++;
        int var4 = -63 / ((arg2 - 46) / 47);
        return null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([[IIILdr;Z)V")
    public static final void method1859(int[][] arg0, int arg1, int arg2, class261 arg3, boolean arg4) {
        if (arg1 != -15355) {
            method1860(-11, false);
        }
        for (int var5 = 0; var5 < arg2; var5++) {
            int[][] var6;
            if (arg0 == null) {
                var6 = null;
            } else {
                var6 = new int[class115.field1522 + 1][class198.field3004 + 1];
                for (int var7 = 0; var7 <= class198.field3004; var7++) {
                    for (int var11 = 0; var11 <= class115.field1522; var11++) {
                        var6[var11][var7] = class355.field5243[var5][var11][var7] - arg0[var11][var7];
                    }
                }
            }
            int var8 = 0;
            int var9 = 0;
            if (!arg4) {
                if (class451.field6650) {
                    var8 |= 0x2;
                }
                if (class244.field3651) {
                    var9 |= 0x8;
                }
                if (class97.field1334 != 0) {
                    if (var5 == 0 || class229.field3504 >= 96) {
                        var9 |= 0x10;
                    }
                    var8 |= 0x1;
                }
            }
            if (class451.field6650) {
                var9 |= 0x7;
            }
            class143 var10 = arg3.method438(class115.field1522, class198.field3004, class355.field5243[var5], var6, 128, var8, var9);
            class314.method1920(var5, var10);
        }
        field4559++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)V")
    public static final void method1860(int arg0, boolean arg1) {
        if (arg1 && class223.field3379 != null) {
            class11.field124 = class223.field3379.field5103;
        } else {
            class11.field124 = -1;
        }
        field4563++;
        class298.field4502 = null;
        class425.field6248 = 0;
        class223.field3379 = null;
        class288.field4381 = null;
        class223.method1364();
        class223.field3386.method2512((byte) 4);
        class177.field2684 = null;
        class416.field6179 = null;
        class82.field1105 = null;
        int var2 = -85 % ((arg0 + 46) / 41);
        class223.field3382 = null;
        class429.field6309 = null;
        class191.field2843 = -1;
        class103.field1402 = null;
        class318.field4811 = -1;
        class347.field5189 = null;
        class167.field2393 = null;
        class227.field3432 = null;
        class146.field2028 = null;
        class437.method2684((byte) -93);
        class238.method1432(64, -1, 128);
        class37.method213(64, 64, -126);
        class304.method1869(false, 64);
        class410.method2574(64, 73);
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)V")
    public static void method1861(int arg0) {
        field4570 = null;
        field4569 = null;
        field4571 = null;
        if (arg0 == 1) {
            field4562 = null;
            field4567 = null;
            field4572 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ldr;I)V")
    public final void method6(class261 arg0, int arg1) {
        if (arg1 <= -68) {
            field4552++;
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(Z)Z")
    public final boolean method112(boolean arg0) {
        if (arg0) {
            field4558++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZILla;IIILdr;)V")
    public final void method117(boolean arg0, int arg1, class269 arg2, int arg3, int arg4, int arg5, class261 arg6) {
        field4547++;
        if (arg1 != 0) {
            this.method4(-49, 74, (class261) null, 93);
        }
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(Ldr;I)Lkq;")
    public final class70 method10(class261 arg0, int arg1) {
        if (arg1 != 7) {
            this.method4(113, -121, (class261) null, -62);
        }
        field4554++;
        return null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLdr;)V")
    public final void method2(byte arg0, class261 arg1) {
        if (arg0 == 76) {
            field4549++;
        }
    }
}
