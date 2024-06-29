import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class435 extends class501 implements class161 {

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "Lem;")
    public class501 field6478;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "Lpn;")
    public static class49 field6472 = new class49(11, 2);

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "[I")
    public static int[] field6488 = new int[32];

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "Leg;")
    public static class34 field6487 = new class34("", 11);

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
    public static int field6486;

    static {
        new class179("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLza;)V", line = 4)
    public final void method100(byte arg0, class299 arg1) {
        field6473++;
        if (arg0 != 51) {
            this.field6478 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)I", line = 17)
    public final int method103(int arg0) {
        if (arg0 >= -10) {
            field6472 = null;
        }
        field6484++;
        return 0;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)Z", line = 28)
    public final boolean method107(byte arg0) {
        if (arg0 != -88) {
            method2700(-43, -107, 121, 92, 110, -20, -121, 96, 92, -32, -112, 71, -36, 0);
        }
        field6483++;
        return false;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lza;IZ)Le;", line = 39)
    public final class289 method111(class299 arg0, int arg1, boolean arg2) {
        field6474++;
        if (!arg2) {
            method2701((char) 65492, -78);
        }
        return null;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V", line = 52)
    public final void method106(int arg0) {
        if (arg0 == -19159) {
            field6486++;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lza;IIILps;IZ)V", line = 64)
    public final void method102(class299 arg0, int arg1, int arg2, int arg3, class352 arg4, int arg5, boolean arg6) {
        field6481++;
        if (arg3 != -750) {
            this.method109(null, 115, 13, 31);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)I", line = 74)
    public final int method97(int arg0) {
        field6470++;
        if (arg0 <= 82) {
            field6472 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIIIIIIIIII)V", line = 85)
    public static final void method2700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field6479++;
        if (class407.field6024 == null) {
            return;
        }
        class521 var14 = null;
        if (arg12 >= 0) {
            int var15 = arg12 - 1;
            class5 var16 = (class5) class366.field5398.method358((byte) 31, (long) var15);
            if (var16 != null) {
                var14 = var16.field65;
            }
        } else {
            int var17 = -arg12 - 1;
            if (class517.field7513 == var17) {
                var14 = class116.field1781;
            } else {
                var14 = class530.field7747[var17];
            }
        }
        if (var14 == null) {
            return;
        }
        class395 var18 = class247.field3693.method2281(arg0, -9380);
        int var19;
        int var20;
        if (arg7 == 1 || arg7 == 3) {
            var19 = var18.field5826;
            var20 = var18.field5830;
        } else {
            var19 = var18.field5830;
            var20 = var18.field5826;
        }
        int var21 = (var20 >> 1) + arg1;
        int var22 = arg1 + (var20 + 1 >> 1);
        int var23 = arg4 + (var19 >> 1);
        int var24 = arg4 + (var19 + 1 >> 1);
        class11 var25 = class407.field6024[arg13];
        if (arg3 != 31083) {
            field6487 = null;
        }
        int var26 = var25.method56(var21, var23) - (-var25.method56(var22, var23) - (var25.method56(var21, var24) + var25.method56(var22, var24))) >> 2;
        class167 var27 = new class167();
        var27.field2525 = arg4;
        var27.field2524 = class446.field6625 + arg8;
        var27.field2520 = arg0;
        var27.field2526 = var14.field1274;
        if (arg5 < arg11) {
            int var28 = arg11;
            arg11 = arg5;
            arg5 = var28;
        }
        var27.field2532 = arg6;
        var27.field2528 = arg7;
        var27.field2514 = class446.field6625 + arg9;
        var27.field2517 = arg1;
        var27.field2513 = arg1 + arg11;
        var27.field2519 = arg1 + arg5;
        if (arg2 > arg10) {
            int var29 = arg2;
            arg2 = arg10;
            arg10 = var29;
        }
        var27.field2523 = arg4 + arg10;
        var27.field2531 = var26;
        var27.field2529 = (var27.field2517 << 7) + (var20 << 6);
        var27.field2527 = arg4 + arg2;
        var27.field2516 = (var27.field2525 << 7) + (var19 << 6);
        class148.field2205.method292((byte) 121, var27);
        var14.field7650 = var27;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)I", line = 193)
    public final int method99(byte arg0) {
        if (arg0 == -107) {
            field6471++;
            return 0;
        } else {
            return -10;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)Z", line = 205)
    public final boolean method104(byte arg0) {
        field6469++;
        int var2 = 122 % ((-arg0 - 41) / 38);
        return false;
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V", line = 215)
    public final void method108(int arg0) {
        int var2 = -15 / ((arg0 - 48) / 37);
        field6476++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILza;)V", line = 227)
    public final void method98(int arg0, class299 arg1) {
        if (arg0 != 31203) {
            field6487 = null;
        }
        field6477++;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(IIIIILem;)V", line = 237)
    public class435(int arg0, int arg1, int arg2, int arg3, int arg4, class501 arg5) {
        super(arg2, arg3, arg4, class142.method1022(arg1, arg0, (byte) 75));
        this.field6478 = arg5;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(ILza;)Lhp;", line = 245)
    public final class293 method110(int arg0, class299 arg1) {
        field6482++;
        if (arg0 != 0) {
            field6488 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(CI)Z", line = 260)
    public static final boolean method2701(char arg0, int arg1) {
        field6475++;
        if (arg1 >= -127) {
            return false;
        } else {
            return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        }
    }

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)V", line = 271)
    public static void method2702(int arg0) {
        if (arg0 >= -112) {
            method2702(37);
        }
        field6487 = null;
        field6472 = null;
        field6488 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)Z", line = 286)
    public static final boolean method2703(int arg0, int arg1, int arg2) {
        field6468++;
        if (arg0 == -19208) {
            return class517.method3055((byte) 127, arg1, arg2) || class155.method1130(73, arg2, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lza;B)V", line = 298)
    public final void method96(class299 arg0, byte arg1) {
        if (arg1 < 78) {
            this.method103(-27);
        }
        field6480++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lza;III)Z", line = 308)
    public final boolean method109(class299 arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 23) {
            return true;
        } else {
            field6485++;
            return false;
        }
    }
}
