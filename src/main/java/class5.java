import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class5 extends class45 {

    @OriginalMember(owner = "client!mca", name = "n", descriptor = "I")
    public int field48;

    @OriginalMember(owner = "client!mca", name = "r", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "client!mca", name = "u", descriptor = "Leba;")
    public static class550 field55 = new class550(4, 0);

    @OriginalMember(owner = "client!mca", name = "i", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!mca", name = "j", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!mca", name = "k", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!mca", name = "l", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!mca", name = "m", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!mca", name = "o", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!mca", name = "p", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!mca", name = "q", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!mca", name = "s", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!mca", name = "t", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!mca", name = "v", descriptor = "[I")
    public static int[] field56;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)Z", line = 7)
    public final boolean method29(int arg0, int arg1) {
        field53++;
        if (arg1 > -94) {
            this.method29(-109, 56);
        }
        return (this.field48 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)Z", line = 20)
    public final boolean method30(int arg0) {
        field49++;
        if (arg0 != 17197) {
            field56 = null;
        }
        return (this.field48 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILev;IIIBIIIII)Z", line = 31)
    public static final boolean method31(int arg0, class593 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field51++;
        int var11 = arg10;
        int var12 = arg0;
        if (arg5 != 7) {
            return false;
        }
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg10 - var13;
        class77.field913[var13][var14] = 99;
        int var16 = arg0 - var14;
        class595.field8210[var13][var14] = 0;
        byte var17 = 0;
        class310.field4191[var17] = arg10;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class585.field8082[var10001] = arg0;
        int[][] var19 = arg1.field8191;
        while (var26 != var18) {
            var11 = class310.field4191[var18];
            var12 = class585.field8082[var18];
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg1.field8177;
            int var23 = var12 - arg1.field8184;
            if (arg8 == -4) {
                if (arg2 == var11 && arg4 == var12) {
                    class436.field5814 = var11;
                    class6.field61 = var12;
                    return true;
                }
            } else if (arg8 == -3) {
                if (class537.method3007(arg2, 14969, var12, arg4, 2, var11, arg3, 2, arg9)) {
                    class436.field5814 = var11;
                    class6.field61 = var12;
                    return true;
                }
            } else if (arg8 == -2) {
                if (arg1.method3295(arg2, 2, var11, 2, arg9, arg6, arg3, (byte) -116, var12, arg4)) {
                    class436.field5814 = var11;
                    class6.field61 = var12;
                    return true;
                }
            } else if (arg8 == -1) {
                if (arg1.method3286(arg9, var12, var11, arg6, arg4, -127, 2, arg2, arg3)) {
                    class6.field61 = var12;
                    class436.field5814 = var11;
                    return true;
                }
            } else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
                if (arg1.method3294(arg7, arg4, 2, arg8, arg2, 91, var11, var12)) {
                    class436.field5814 = var11;
                    class6.field61 = var12;
                    return true;
                }
            } else if (arg1.method3287(arg2, 2, arg4, var12, arg7, 32, arg8, var11)) {
                class6.field61 = var12;
                class436.field5814 = var11;
                return true;
            }
            int var25 = class595.field8210[var21][var20] + 1;
            if (var21 > 0 && class77.field913[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class310.field4191[var26] = var11 - 1;
                class585.field8082[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class77.field913[var21 - 1][var20] = 2;
                class595.field8210[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class77.field913[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class310.field4191[var26] = var11 + 1;
                class585.field8082[var26] = var12;
                class77.field913[var21 + 1][var20] = 8;
                var26 = var26 + 1 & 0xFFF;
                class595.field8210[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class77.field913[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class310.field4191[var26] = var11;
                class585.field8082[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class77.field913[var21][var20 - 1] = 1;
                class595.field8210[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class77.field913[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class310.field4191[var26] = var11;
                class585.field8082[var26] = var12 + 1;
                class77.field913[var21][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class595.field8210[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class77.field913[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class310.field4191[var26] = var11 - 1;
                class585.field8082[var26] = var12 - 1;
                class77.field913[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class595.field8210[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class77.field913[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class310.field4191[var26] = var11 + 1;
                class585.field8082[var26] = var12 - 1;
                class77.field913[var21 + 1][var20 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class595.field8210[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class77.field913[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class310.field4191[var26] = var11 - 1;
                class585.field8082[var26] = var12 + 1;
                class77.field913[var21 - 1][var20 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class595.field8210[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class77.field913[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class310.field4191[var26] = var11 + 1;
                class585.field8082[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class77.field913[var21 + 1][var20 + 1] = 12;
                class595.field8210[var21 + 1][var20 + 1] = var25;
            }
        }
        class436.field5814 = var11;
        class6.field61 = var12;
        return false;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)I", line = 389)
    public final int method32(byte arg0) {
        field54++;
        return arg0 == -109 ? (this.field48 & 0x1F2AE5) >> 18 : 116;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(BI)V", line = 401)
    public static final void method33(byte arg0, int arg1) {
        field50++;
        if (class422.field5538 == arg1) {
            return;
        }
        class703.field9886 = class431.field5789 = class346.field4625[arg1];
        class628.method3483((byte) 82);
        class59.field744 = new int[class703.field9886][class431.field5789];
        class8.field68 = new int[class703.field9886][class431.field5789];
        class328.field4408 = new int[4][class703.field9886 >> 3][class431.field5789 >> 3];
        if (arg0 < 18) {
            method31(1, null, 112, -100, 24, (byte) 49, -24, 72, -109, 28, -120);
        }
        for (int var2 = 0; var2 < 4; var2++) {
            class322.field4302[var2] = class211.method1335(class703.field9886, true, class431.field5789);
        }
        class614.field8511 = new byte[4][class703.field9886][class431.field5789];
        class455.method2562(class703.field9886, class431.field5789, 4, (byte) 119);
        class174.method1188(94, class146.field1963, class703.field9886 >> 3, class431.field5789 >> 3);
        class422.field5538 = arg1;
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(B)Z", line = 432)
    public final boolean method34(byte arg0) {
        int var2 = -58 / ((-arg0 - 51) / 34);
        field47++;
        return (this.field48 & 0x37046D) >> 21 != 0;
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)Z", line = 445)
    public final boolean method35(int arg0) {
        if (arg0 != 15359) {
            this.field52 = -58;
        }
        field45++;
        return ((this.field48 & 0x6BD13E) >> 22) != 0;
    }

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "(B)V", line = 457)
    public static void method36(byte arg0) {
        field55 = null;
        if (arg0 != -51) {
            field56 = null;
        }
        field56 = null;
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(II)V", line = 469)
    public class5(int arg0, int arg1) {
        this.field48 = arg0;
        this.field52 = arg1;
    }

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "(B)I", line = 479)
    public final int method37(byte arg0) {
        field44++;
        return arg0 <= 77 ? 54 : class204.method1307(this.field48, (byte) 33);
    }

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "(B)Ljava/lang/String;", line = 493)
    public static final String method38(byte arg0) {
        if (arg0 != 117) {
            field55 = null;
        }
        field43++;
        return class674.field9590 || class572.field7773 == null ? "" : class572.field7773.field4724;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIZI)Ljava/lang/String;", line = 508)
    public static final String method39(int arg0, int arg1, boolean arg2, int arg3) {
        field46++;
        if (arg3 != -31877) {
            method33((byte) -97, -21);
        }
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg2 && arg1 >= 0) {
            int var4 = 2;
            int var5 = arg1 / arg0;
            while (var5 != 0) {
                var5 /= arg0;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg0;
                int var9 = var8 - (arg0 * arg1);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg0);
        }
    }
}
