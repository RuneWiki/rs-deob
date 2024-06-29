import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class510 {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Z")
    public boolean field7092 = false;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "Z")
    public boolean field7101 = false;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public int field7103 = 1;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public int field7096 = 64;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public int field7100 = 64;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public int field7095 = -1;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public int field7104 = 2;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field7093 = 0;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "Lmu;")
    public static class303 field7097 = new class303(98, -2);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "Lvda;")
    public static class183 field7099;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILcea;B)V", line = 17)
    private final void method2987(int arg0, int arg1, class215 arg2, byte arg3) {
        if (arg3 != 94) {
            this.field7096 = -81;
        }
        field7102++;
        if (arg0 == 1) {
            this.field7095 = arg2.method1478(842397944);
            if (this.field7095 == 65535) {
                this.field7095 = -1;
                return;
            }
        } else if (arg0 == 2) {
            this.field7096 = arg2.method1478(842397944) + 1;
            this.field7100 = arg2.method1478(842397944) + 1;
        } else if (arg0 == 3) {
            arg2.method1536(-106);
            return;
        } else if (arg0 == 4) {
            this.field7104 = arg2.method1535(255);
            return;
        } else {
            if (arg0 == 5) {
                this.field7103 = arg2.method1535(255);
            } else if (arg0 == 6) {
                this.field7092 = true;
                return;
            } else if (arg0 == 7) {
                this.field7101 = true;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILcea;B)V", line = 67)
    public final void method2988(int arg0, class215 arg1, byte arg2) {
        field7098++;
        int var4 = 93 / ((arg2 + 24) / 55);
        while (true) {
            int var5 = arg1.method1535(255);
            if (var5 == 0) {
                return;
            }
            this.method2987(var5, arg0, arg1, (byte) 94);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIIIILfe;II)Z", line = 87)
    public static final boolean method2989(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class570 arg9, int arg10, int arg11) {
        field7091++;
        int var12 = arg6;
        int var13 = arg3;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg6 - var14;
        if (arg2 >= -65) {
            method2989(115, 22, 74, 19, 100, -62, 111, 76, 26, null, -41, -28);
        }
        class184.field2786[var14][var15] = 99;
        int var17 = arg3 - var15;
        class426.field6133[var14][var15] = 0;
        byte var18 = 0;
        class641.field8811[var18] = arg6;
        int var19 = 0;
        int var35 = var18 + 1;
        class201.field2919[var18] = arg3;
        int[][] var20 = arg9.field7832;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class375.field5309 = var13;
                                    class443.field6294 = var12;
                                    return false;
                                }
                                var13 = class201.field2919[var19];
                                var12 = class641.field8811[var19];
                                var21 = var12 - var16;
                                var22 = var13 - var17;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg9.field7847;
                                var24 = var13 - arg9.field7835;
                                if (arg10 == -4) {
                                    if (arg5 == var12 && arg11 == var13) {
                                        class443.field6294 = var12;
                                        class375.field5309 = var13;
                                        return true;
                                    }
                                } else if (arg10 == -3) {
                                    if (class555.method3192(arg0, arg11, -1, arg8, var12, var13, arg5, arg8, arg4)) {
                                        class375.field5309 = var13;
                                        class443.field6294 = var12;
                                        return true;
                                    }
                                } else if (arg10 == -2) {
                                    if (arg9.method3295(-28388, arg5, arg7, arg8, arg4, var12, arg8, var13, arg11, arg0)) {
                                        class443.field6294 = var12;
                                        class375.field5309 = var13;
                                        return true;
                                    }
                                } else if (arg10 == -1) {
                                    if (arg9.method3301(var12, (byte) -98, arg11, arg8, arg4, arg0, arg7, var13, arg5)) {
                                        class443.field6294 = var12;
                                        class375.field5309 = var13;
                                        return true;
                                    }
                                } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                                    if (arg9.method3293(arg5, var13, arg8, arg1, var12, arg11, arg10, -71)) {
                                        class443.field6294 = var12;
                                        class375.field5309 = var13;
                                        return true;
                                    }
                                } else if (arg9.method3302(arg11, var13, arg5, var12, arg10, 1, arg1, arg8)) {
                                    class375.field5309 = var13;
                                    class443.field6294 = var12;
                                    return true;
                                }
                                var26 = class426.field6133[var21][var22] + 1;
                                if (var21 > 0 && class184.field2786[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg8 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (arg8 - 1 <= var27) {
                                            class641.field8811[var35] = var12 - 1;
                                            class201.field2919[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class184.field2786[var21 - 1][var22] = 2;
                                            class426.field6133[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var21 < 128 - arg8 && class184.field2786[var21 + 1][var22] == 0 && (var20[arg8 + var23][var24] & 0x60E40000) == 0 && (var20[arg8 + var23][var24 + arg8 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg8 - 1 <= var28) {
                                            class641.field8811[var35] = var12 + 1;
                                            class201.field2919[var35] = var13;
                                            class184.field2786[var21 + 1][var22] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class426.field6133[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg8 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class184.field2786[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg8 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= (arg8 - 1)) {
                                            class641.field8811[var35] = var12;
                                            class201.field2919[var35] = var13 - 1;
                                            class184.field2786[var21][var22 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class426.field6133[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 < 128 - arg8 && class184.field2786[var21][var22 + 1] == 0 && (var20[var23][var24 + arg8] & 0x4E240000) == 0 && (var20[arg8 + var23 - 1][arg8 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (arg8 - 1 <= var30) {
                                            class641.field8811[var35] = var12;
                                            class201.field2919[var35] = var13 + 1;
                                            class184.field2786[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class426.field6133[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg8 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class184.field2786[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg8 <= var31) {
                                            class641.field8811[var35] = var12 - 1;
                                            class201.field2919[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class184.field2786[var21 - 1][var22 - 1] = 3;
                                            class426.field6133[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var31 + var24 - 1] & 0x4FA40000) != 0 || (var20[var23 - (1 - var31)][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var21 < (128 - arg8) && var22 > 0 && class184.field2786[var21 + 1][var22 - 1] == 0 && (var20[arg8 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg8 <= var32) {
                                            class641.field8811[var35] = var12 + 1;
                                            class201.field2919[var35] = var13 - 1;
                                            class184.field2786[var21 + 1][var22 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class426.field6133[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg8][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && var22 < 128 - arg8 && class184.field2786[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg8 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg8; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][var24 + arg8] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class641.field8811[var35] = var12 - 1;
                                    class201.field2919[var35] = var13 + 1;
                                    class184.field2786[var21 - 1][var22 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class426.field6133[var21 - 1][var22 + 1] = var26;
                                }
                            } while ((128 - arg8) <= var21);
                        } while (var22 >= 128 - arg8);
                    } while (class184.field2786[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg8 + var23][arg8 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg8; var34++) {
                    if ((var20[var23 + var34][var24 + arg8] & 0x7E240000) != 0 || (var20[arg8 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class641.field8811[var35] = var12 + 1;
                class201.field2919[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class184.field2786[var21 + 1][var22 + 1] = 12;
                class426.field6133[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 523)
    public static void method2990(byte arg0) {
        field7099 = null;
        if (arg0 != -85) {
            method2990((byte) 39);
        }
        field7097 = null;
    }
}
