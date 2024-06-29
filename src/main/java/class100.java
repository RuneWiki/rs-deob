import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class100 extends class228 {

    @OriginalMember(owner = "client!oda", name = "D", descriptor = "I")
    private int field1454;

    @OriginalMember(owner = "client!oda", name = "B", descriptor = "I")
    public static int field1452 = 100;

    @OriginalMember(owner = "client!oda", name = "H", descriptor = "Lh;")
    public static class572 field1458 = new class572(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!oda", name = "I", descriptor = "Z")
    public static boolean field1459 = false;

    @OriginalMember(owner = "client!oda", name = "K", descriptor = "I")
    public static int field1461 = -1;

    @OriginalMember(owner = "client!oda", name = "C", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!oda", name = "E", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!oda", name = "F", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!oda", name = "G", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!oda", name = "J", descriptor = "Lha;")
    public static class53 field1460;

    static {
        new class572("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lvp;IZ)V", line = 3)
    public static final void method761(class162 arg0, int arg1, boolean arg2) {
        ++field1456;
        int var3 = ~arg0.field2561 != -1 ? arg0.field2561 : arg0.field2527;
        int var4 = ~arg0.field2505 == -1 ? arg0.field2459 : arg0.field2505;
        class49.method299(class302.field4135[arg0.field2456 >> 16], (byte) -68, arg2, var3, arg0.field2456, var4);
        if (arg1 >= -62) {
            method761((class162) null, 111, false);
        }
        if (arg0.field2462 != null) {
            class49.method299(arg0.field2462, (byte) -113, arg2, var3, arg0.field2456, var4);
        }
        class243 var5 = (class243) class385.field5297.method2799((long) arg0.field2456, true);
        if (var5 != null) {
            class495.method2956(var5.field3471, var3, -16905, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V", line = 26)
    public final void method642(int arg0) {
        ++field1455;
        if (arg0 > -80) {
            this.method763(false, true);
        }
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Lte;II[BI)V", line = 36)
    public class100(class527 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field1454 = arg2;
        super.field3325.method3152(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field3333, 0, super.field3319, this.field1454, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1460(true, -5286);
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILvba;IIIIBIIII)Z", line = 56)
    public static final boolean method762(int arg0, class37 arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field1457;
        int var11 = arg10;
        int var12 = arg3;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = -var13 + arg10;
        class507.field7198[var13][var14] = 99;
        int var16 = arg3 - var14;
        class476.field6739[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class513.field7320[var17] = arg10;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class59.field745[var10001] = arg3;
        int[][] var19 = arg1.field439;
        if (arg6 != -25) {
            field1461 = 50;
        }
        while (~var26 != ~var18) {
            var11 = class513.field7320[var18];
            var12 = class59.field745[var18];
            int var20 = -arg1.field435 + var11;
            int var21 = -var15 + var11;
            int var22 = var12 - var16;
            var18 = 4095 & var18 + 1;
            int var23 = var12 - arg1.field458;
            if (~arg5 != 3) {
                if (arg5 != -3) {
                    if (arg5 != -2) {
                        if (arg5 != -1) {
                            if (arg5 != 0 && ~arg5 != -2 && ~arg5 != -3 && ~arg5 != -4 && ~arg5 != -10) {
                                if (arg1.method237(1, var12, arg9, arg4, -24088, arg5, arg7, var11)) {
                                    class37.field455 = var12;
                                    class330.field4554 = var11;
                                    return true;
                                }
                            } else if (arg1.method241(arg9, var12, 1, arg7, arg4, arg5, var11, arg6 ^ -153)) {
                                class330.field4554 = var11;
                                class37.field455 = var12;
                                return true;
                            }
                        } else if (arg1.method228(arg9, 1, arg4, var11, arg8, var12, -67, arg0, arg2)) {
                            class330.field4554 = var11;
                            class37.field455 = var12;
                            return true;
                        }
                    } else if (arg1.method243(var11, arg8, 1, arg0, 1, var12, arg4, 14004, arg2, arg9)) {
                        class37.field455 = var12;
                        class330.field4554 = var11;
                        return true;
                    }
                } else if (class11.method52(1, arg4, var11, var12, arg8, arg9, true, arg2, 1)) {
                    class37.field455 = var12;
                    class330.field4554 = var11;
                    return true;
                }
            } else if (~arg4 == ~var11 && ~arg9 == ~var12) {
                class330.field4554 = var11;
                class37.field455 = var12;
                return true;
            }
            int var25 = class476.field6739[var21][var22] + 1;
            if (var21 > 0 && class507.field7198[var21 - 1][var22] == 0 && ~(var19[var20 + -1][var23] & 1109655552) == -1) {
                class513.field7320[var26] = var11 + -1;
                class59.field745[var26] = var12;
                var26 = 4095 & var26 - -1;
                class507.field7198[var21 + -1][var22] = 2;
                class476.field6739[var21 - 1][var22] = var25;
            }
            if (var21 < 127 && ~class507.field7198[var21 + 1][var22] == -1 && (1612972032 & var19[var20 - -1][var23]) == 0) {
                class513.field7320[var26] = var11 + 1;
                class59.field745[var26] = var12;
                class507.field7198[var21 + 1][var22] = 8;
                var26 = var26 + 1 & 4095;
                class476.field6739[var21 + 1][var22] = var25;
            }
            if (var22 > 0 && ~class507.field7198[var21][var22 + -1] == -1 && ~(1084489728 & var19[var20][var23 + -1]) == -1) {
                class513.field7320[var26] = var11;
                class59.field745[var26] = var12 + -1;
                var26 = 4095 & var26 + 1;
                class507.field7198[var21][var22 + -1] = 1;
                class476.field6739[var21][var22 - 1] = var25;
            }
            if (~var22 > -128 && ~class507.field7198[var21][var22 - -1] == -1 && ~(var19[var20][var23 + 1] & 1210318848) == -1) {
                class513.field7320[var26] = var11;
                class59.field745[var26] = var12 - -1;
                class507.field7198[var21][var22 - -1] = 4;
                var26 = var26 + 1 & 4095;
                class476.field6739[var21][var22 + 1] = var25;
            }
            if (var21 > 0 && ~var22 < -1 && ~class507.field7198[var21 + -1][var22 + -1] == -1 && (1134821376 & var19[var20 + -1][var23 - 1]) == 0 && ~(1109655552 & var19[var20 - 1][var23]) == -1 && ~(1084489728 & var19[var20][var23 - 1]) == -1) {
                class513.field7320[var26] = var11 + -1;
                class59.field745[var26] = var12 - 1;
                class507.field7198[var21 + -1][var22 + -1] = 3;
                var26 = 4095 & var26 + 1;
                class476.field6739[var21 - 1][var22 + -1] = var25;
            }
            if (~var21 > -128 && var22 > 0 && ~class507.field7198[var21 - -1][var22 + -1] == -1 && ~(var19[var20 + 1][var23 + -1] & 1625554944) == -1 && ~(1612972032 & var19[var20 + 1][var23]) == -1 && ~(var19[var20][var23 + -1] & 1084489728) == -1) {
                class513.field7320[var26] = var11 + 1;
                class59.field745[var26] = var12 + -1;
                class507.field7198[var21 - -1][var22 + -1] = 9;
                var26 = 4095 & var26 + 1;
                class476.field6739[var21 + 1][var22 + -1] = var25;
            }
            if (var21 > 0 && var22 < 127 && class507.field7198[var21 + -1][var22 + 1] == 0 && (1310982144 & var19[var20 + -1][var23 - -1]) == 0 && (1109655552 & var19[var20 + -1][var23]) == 0 && (1210318848 & var19[var20][var23 + 1]) == 0) {
                class513.field7320[var26] = var11 - 1;
                class59.field745[var26] = var12 + 1;
                var26 = var26 + 1 & 4095;
                class507.field7198[var21 + -1][var22 + 1] = 6;
                class476.field6739[var21 + -1][var22 + 1] = var25;
            }
            if (~var21 > -128 && ~var22 > -128 && ~class507.field7198[var21 + 1][var22 + 1] == -1 && (2015625216 & var19[var20 + 1][var23 + 1]) == 0 && ~(var19[var20 + 1][var23] & 1612972032) == -1 && ~(1210318848 & var19[var20][var23 + 1]) == -1) {
                class513.field7320[var26] = var11 + 1;
                class59.field745[var26] = var12 - -1;
                class507.field7198[var21 + 1][var22 + 1] = 12;
                var26 = var26 - -1 & 4095;
                class476.field6739[var21 + 1][var22 - -1] = var25;
            }
        }
        class37.field455 = var12;
        class330.field4554 = var11;
        return false;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZZ)V", line = 301)
    public final void method763(boolean arg0, boolean arg1) {
        if (!arg1) {
            super.field3325.method3152(-2, this);
            ++field1453;
            OpenGL.glTexParameteri(super.field3333, 10242, arg0 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Z)V", line = 313)
    public static void method764(boolean arg0) {
        if (!arg0) {
            method762(-14, (class37) null, -28, 27, -37, 23, (byte) -48, 98, -36, -31, 25);
        }
        field1458 = null;
        field1460 = null;
    }
}
