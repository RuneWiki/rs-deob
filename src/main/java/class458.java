import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class458 extends class113 implements class231 {

    @OriginalMember(owner = "client!ts", name = "A", descriptor = "Lhu;")
    public class113 field6479;

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!ts", name = "q", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!ts", name = "r", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!ts", name = "s", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!ts", name = "t", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!ts", name = "u", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!ts", name = "v", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!ts", name = "x", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!ts", name = "y", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!ts", name = "B", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!ts", name = "C", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!ts", name = "D", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!ts", name = "E", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!ts", name = "F", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lqa;I)Lpl;")
    public final class558 method189(class208 arg0, int arg1) {
        field6484++;
        if (arg1 != 31733) {
            this.field6479 = null;
        }
        return this.field6479.method189(arg0, 31733);
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(IIIIILhu;)V")
    public class458(int arg0, int arg1, int arg2, int arg3, int arg4, class113 arg5) {
        super(arg2, arg3, arg4, class185.method1286(arg1, (byte) 119, arg0));
        this.field6479 = arg5;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILqa;)V")
    public final void method194(int arg0, class208 arg1) {
        field6483++;
        if (arg0 != 0) {
            this.field6479 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BILqa;)Lr;")
    public final class159 method190(byte arg0, int arg1, class208 arg2) {
        field6469++;
        if (arg0 < 40) {
            this.method178((byte) -50, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIILvba;IIIIII)Z")
    public static final boolean method2776(int arg0, int arg1, int arg2, int arg3, class37 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field6481++;
        int var11 = arg0;
        if (arg2 != 31516) {
            return true;
        }
        int var12 = arg10;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg0 - var13;
        class507.field7198[var13][var14] = 99;
        int var16 = arg10 - var14;
        class476.field6739[var13][var14] = 0;
        byte var17 = 0;
        class513.field7320[var17] = arg0;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class59.field745[var10001] = arg10;
        int[][] var19 = arg4.field439;
        while (var26 != var18) {
            var12 = class59.field745[var18];
            var11 = class513.field7320[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            int var22 = var11 - arg4.field435;
            int var23 = var12 - arg4.field458;
            if (arg5 == -4) {
                if (arg7 == var11 && arg8 == var12) {
                    class330.field4554 = var11;
                    class37.field455 = var12;
                    return true;
                }
            } else if (arg5 == -3) {
                if (class11.method52(2, arg7, var11, var12, arg3, arg8, true, arg9, 2)) {
                    class37.field455 = var12;
                    class330.field4554 = var11;
                    return true;
                }
            } else if (arg5 == -2) {
                if (arg4.method243(var11, arg3, 2, arg1, 2, var12, arg7, 14004, arg9, arg8)) {
                    class37.field455 = var12;
                    class330.field4554 = var11;
                    return true;
                }
            } else if (arg5 == -1) {
                if (arg4.method228(arg8, 2, arg7, var11, arg3, var12, 101, arg1, arg9)) {
                    class330.field4554 = var11;
                    class37.field455 = var12;
                    return true;
                }
            } else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
                if (arg4.method241(arg8, var12, 2, arg6, arg7, arg5, var11, 128)) {
                    class37.field455 = var12;
                    class330.field4554 = var11;
                    return true;
                }
            } else if (arg4.method237(2, var12, arg8, arg7, arg2 ^ 0xFFFFDAF4, arg5, arg6, var11)) {
                class37.field455 = var12;
                class330.field4554 = var11;
                return true;
            }
            int var25 = class476.field6739[var20][var21] + 1;
            if (var20 > 0 && class507.field7198[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class513.field7320[var26] = var11 - 1;
                class59.field745[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class507.field7198[var20 - 1][var21] = 2;
                class476.field6739[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class507.field7198[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class513.field7320[var26] = var11 + 1;
                class59.field745[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class507.field7198[var20 + 1][var21] = 8;
                class476.field6739[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class507.field7198[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class513.field7320[var26] = var11;
                class59.field745[var26] = var12 - 1;
                class507.field7198[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class476.field6739[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class507.field7198[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class513.field7320[var26] = var11;
                class59.field745[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class507.field7198[var20][var21 + 1] = 4;
                class476.field6739[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class507.field7198[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class513.field7320[var26] = var11 - 1;
                class59.field745[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class507.field7198[var20 - 1][var21 - 1] = 3;
                class476.field6739[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class507.field7198[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class513.field7320[var26] = var11 + 1;
                class59.field745[var26] = var12 - 1;
                class507.field7198[var20 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class476.field6739[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class507.field7198[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class513.field7320[var26] = var11 - 1;
                class59.field745[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class507.field7198[var20 - 1][var21 + 1] = 6;
                class476.field6739[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class507.field7198[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class513.field7320[var26] = var11 + 1;
                class59.field745[var26] = var12 + 1;
                class507.field7198[var20 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class476.field6739[var20 + 1][var21 + 1] = var25;
            }
        }
        class37.field455 = var12;
        class330.field4554 = var11;
        return false;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILqa;IB)Z")
    public final boolean method171(int arg0, class208 arg1, int arg2, byte arg3) {
        field6476++;
        if (arg3 < 44) {
            this.method183(-117);
        }
        return false;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(ILqa;)Lin;")
    public final class77 method181(int arg0, class208 arg1) {
        if (arg0 < 0) {
            this.method189(null, -37);
        }
        field6478++;
        return null;
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)V")
    public final void method172(int arg0) {
        if (arg0 >= 95) {
            field6471++;
        }
    }

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "(I)V")
    public final void method179(int arg0) {
        if (arg0 == 1) {
            field6473++;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)Z")
    public final boolean method192(byte arg0) {
        if (arg0 == -41) {
            field6472++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)I")
    public final int method183(int arg0) {
        if (arg0 != -19248) {
            this.method181(-31, null);
        }
        field6477++;
        return 0;
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(B)Z")
    public final boolean method180(byte arg0) {
        field6482++;
        if (arg0 != 58) {
            this.field6479 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)I")
    public final int method173(byte arg0) {
        field6470++;
        int var2 = -112 / ((-arg0 - 43) / 49);
        return 0;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lqa;IZIILco;I)V")
    public final void method182(class208 arg0, int arg1, boolean arg2, int arg3, int arg4, class102 arg5, int arg6) {
        if (arg6 != 21130) {
            this.field6479 = null;
        }
        field6480++;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(BLqa;)V")
    public final void method178(byte arg0, class208 arg1) {
        field6468++;
        if (arg0 != 115) {
            this.method172(-49);
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)I")
    public final int method170(int arg0) {
        field6474++;
        if (arg0 > -120) {
            this.method178((byte) 20, null);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BLqa;)V")
    public final void method174(byte arg0, class208 arg1) {
        if (arg0 > -36) {
            this.field6479 = null;
        }
        field6475++;
    }
}
