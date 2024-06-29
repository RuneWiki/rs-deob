import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class424 extends class149 {

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "[I")
    public static int[] field6321 = new int[100];

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
    private int field6315;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    private int field6317;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    private int field6318;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)[[I", line = 3)
    public final int[][] method139(byte arg0, int arg1) {
        ++field6320;
        int[][] var3 = super.field2147.method2726(arg1, 0);
        if (arg0 >= -45) {
            return null;
        } else {
            if (super.field2147.field6664) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~var7 > ~class316.field4838; ++var7) {
                    var4[var7] = this.field6315;
                    var5[var7] = this.field6317;
                    var6[var7] = this.field6318;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([BIIZ)Ljava/lang/String;", line = 41)
    public static final String method2552(byte[] arg0, int arg1, int arg2, boolean arg3) {
        ++field6314;
        if (!arg3) {
            method2556((byte) 35);
        }
        char[] var4 = new char[arg2];
        int var5 = 0;
        for (int var6 = 0; var6 < arg2; ++var6) {
            int var7 = arg0[arg1 + var6] & 255;
            if (var7 != 0) {
                if (~var7 <= -129 && ~var7 > -161) {
                    char var8 = class102.field1460[var7 - 128];
                    if (var8 == 0) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V", line = 81)
    private final void method2553(int arg0, int arg1) {
        this.field6315 = arg0 >> 12 & 4080;
        this.field6317 = 4080 & arg0 >> 4;
        if (arg1 >= 85) {
            this.field6318 = (255 & arg0) << 4;
            ++field6313;
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V", line = 95)
    public class424() {
        this(0);
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V", line = 99)
    private class424(int arg0) {
        super(0, false);
        this.method2553(arg0, 109);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILwq;IIIBIIIII)Z", line = 113)
    public static final boolean method2554(int arg0, class370 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg5 > -110) {
            method2556((byte) 2);
        }
        ++field6319;
        int var11 = arg3;
        int var12 = arg9;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = -var13 + arg3;
        int var16 = arg9 - var14;
        class91.field1335[var13][var14] = 99;
        class77.field1063[var13][var14] = 0;
        byte var17 = 0;
        class498.field7264[var17] = arg3;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class510.field7589[var10001] = arg9;
        int[][] var19 = arg1.field5678;
        while (var26 != var18) {
            var12 = class510.field7589[var18];
            var11 = class498.field7264[var18];
            int var20 = -var16 + var12;
            var18 = var18 + 1 & 4095;
            int var21 = var11 - var15;
            int var22 = -arg1.field5692 + var11;
            int var23 = -arg1.field5669 + var12;
            if (~arg7 != 3) {
                if (arg7 != -3) {
                    if (~arg7 != 1) {
                        if (~arg7 != 0) {
                            if (~arg7 != -1 && arg7 != 1 && arg7 != 2 && arg7 != 3 && ~arg7 != -10) {
                                if (arg1.method2307(arg4, -75, arg7, var11, 2, var12, arg10, arg0)) {
                                    class411.field6181 = var12;
                                    class96.field1400 = var11;
                                    return true;
                                }
                            } else if (arg1.method2308(arg7, arg0, var11, (byte) -78, arg10, var12, 2, arg4)) {
                                class96.field1400 = var11;
                                class411.field6181 = var12;
                                return true;
                            }
                        } else if (arg1.method2317(arg2, -123, 2, arg4, var11, arg0, arg8, var12, arg6)) {
                            class411.field6181 = var12;
                            class96.field1400 = var11;
                            return true;
                        }
                    } else if (arg1.method2313(var11, 2, arg2, true, arg6, var12, 2, arg0, arg8, arg4)) {
                        class411.field6181 = var12;
                        class96.field1400 = var11;
                        return true;
                    }
                } else if (class231.method1574(var12, arg8, 2, arg2, arg0, 2, arg4, 2, var11)) {
                    class96.field1400 = var11;
                    class411.field6181 = var12;
                    return true;
                }
            } else if (~arg4 == ~var11 && arg0 == var12) {
                class96.field1400 = var11;
                class411.field6181 = var12;
                return true;
            }
            int var25 = class77.field1063[var21][var20] + 1;
            if (var21 > 0 && class91.field1335[var21 + -1][var20] == 0 && (1134821376 & var19[var22 + -1][var23]) == 0 && ~(var19[var22 + -1][var23 + 1] & 1310982144) == -1) {
                class498.field7264[var26] = var11 + -1;
                class510.field7589[var26] = var12;
                var26 = 4095 & var26 + 1;
                class91.field1335[var21 + -1][var20] = 2;
                class77.field1063[var21 + -1][var20] = var25;
            }
            if (var21 < 126 && class91.field1335[var21 + 1][var20] == 0 && ~(1625554944 & var19[var22 + 2][var23]) == -1 && ~(2015625216 & var19[var22 + 2][var23 - -1]) == -1) {
                class498.field7264[var26] = var11 + 1;
                class510.field7589[var26] = var12;
                var26 = var26 + 1 & 4095;
                class91.field1335[var21 + 1][var20] = 8;
                class77.field1063[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class91.field1335[var21][var20 + -1] == 0 && ~(1134821376 & var19[var22][var23 + -1]) == -1 && (1625554944 & var19[var22 + 1][var23 + -1]) == 0) {
                class498.field7264[var26] = var11;
                class510.field7589[var26] = var12 - 1;
                class91.field1335[var21][var20 - 1] = 1;
                var26 = var26 + 1 & 4095;
                class77.field1063[var21][var20 + -1] = var25;
            }
            if (~var20 > -127 && ~class91.field1335[var21][var20 + 1] == -1 && ~(1310982144 & var19[var22][var23 + 2]) == -1 && ~(2015625216 & var19[var22 - -1][var23 - -2]) == -1) {
                class498.field7264[var26] = var11;
                class510.field7589[var26] = var12 + 1;
                class91.field1335[var21][var20 + 1] = 4;
                var26 = var26 + 1 & 4095;
                class77.field1063[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && ~var20 < -1 && class91.field1335[var21 + -1][var20 + -1] == 0 && (var19[var22 + -1][var23] & 1336147968) == 0 && ~(var19[var22 - 1][var23 + -1] & 1134821376) == -1 && (1675886592 & var19[var22][var23 - 1]) == 0) {
                class498.field7264[var26] = var11 - 1;
                class510.field7589[var26] = var12 + -1;
                class91.field1335[var21 + -1][var20 + -1] = 3;
                var26 = 4095 & var26 - -1;
                class77.field1063[var21 + -1][var20 + -1] = var25;
            }
            if (var21 < 126 && ~var20 < -1 && class91.field1335[var21 + 1][var20 + -1] == 0 && ~(1675886592 & var19[var22 + 1][var23 + -1]) == -1 && (1625554944 & var19[var22 + 2][var23 + -1]) == 0 && (var19[var22 + 2][var23] & 2028208128) == 0) {
                class498.field7264[var26] = var11 + 1;
                class510.field7589[var26] = var12 + -1;
                var26 = 4095 & var26 + 1;
                class91.field1335[var21 - -1][var20 + -1] = 9;
                class77.field1063[var21 + 1][var20 + -1] = var25;
            }
            if (~var21 < -1 && var20 < 126 && ~class91.field1335[var21 + -1][var20 - -1] == -1 && ~(var19[var22 + -1][var23 + 1] & 1336147968) == -1 && ~(var19[var22 + -1][var23 + 2] & 1310982144) == -1 && (2116288512 & var19[var22][var23 + 2]) == 0) {
                class498.field7264[var26] = var11 + -1;
                class510.field7589[var26] = var12 + 1;
                var26 = 4095 & var26 - -1;
                class91.field1335[var21 + -1][var20 + 1] = 6;
                class77.field1063[var21 + -1][var20 + 1] = var25;
            }
            if (var21 < 126 && ~var20 > -127 && class91.field1335[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 2116288512) == 0 && (2015625216 & var19[var22 + 2][var23 + 2]) == 0 && ~(var19[var22 - -2][var23 + 1] & 2028208128) == -1) {
                class498.field7264[var26] = var11 - -1;
                class510.field7589[var26] = var12 - -1;
                class91.field1335[var21 - -1][var20 + 1] = 12;
                var26 = var26 + 1 & 4095;
                class77.field1063[var21 + 1][var20 + 1] = var25;
            }
        }
        class96.field1400 = var11;
        class411.field6181 = var12;
        return false;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBLtl;)V", line = 463)
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (arg0 == 0) {
            this.method2553(arg2.method641(32455), arg1 + 85);
        }
        ++field6312;
        if (arg1 != 35) {
            this.field6317 = 1;
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)V", line = 495)
    public static final void method2555(int arg0, int arg1) {
        class66.field915 = new int[arg0];
        class205.field2898 = new int[arg0];
        class415.field6220 = new int[arg0];
        class344.field5392 = new int[arg0];
        if (arg1 > -28) {
            method2552((byte[]) null, 67, -118, true);
        }
        class34.field538 = new int[arg0];
        ++field6316;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)V", line = 510)
    public static void method2556(byte arg0) {
        int var1 = 68 / ((33 - arg0) / 40);
        field6321 = null;
    }
}
