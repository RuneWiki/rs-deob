import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class710 {

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Lmw;")
    public static class517 field9706 = new class517(35, 7);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field9703;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field9704;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Lqia;")
    public static class23 field9707;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field9708;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method3938(int arg0) {
        field9706 = null;
        if (arg0 < -120) {
            field9707 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9704++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIIIILeq;II)Z")
    public static final boolean method3939(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class224 arg9, int arg10, int arg11) {
        field9705++;
        int var12 = arg10;
        int var13 = arg0;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg10 - var14;
        class437.field6319[var14][var15] = 99;
        int var17 = arg0 - var15;
        class85.field1207[var14][var15] = 0;
        byte var18 = 0;
        class58.field761[var18] = arg10;
        int var19 = arg2;
        int var35 = var18 + 1;
        class560.field7681[var18] = arg0;
        int[][] var20 = arg9.field2908;
        while (true) {
            label282: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label259: do {
                                if (var35 == var19) {
                                    class399.field5715 = var13;
                                    class6.field44 = var12;
                                    return false;
                                }
                                var12 = class58.field761[var19];
                                var13 = class560.field7681[var19];
                                var21 = var12 - var16;
                                var22 = var13 - var17;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg9.field2896;
                                var24 = var13 - arg9.field2912;
                                if (arg7 == -4) {
                                    if (arg1 == var12 && arg6 == var13) {
                                        class6.field44 = var12;
                                        class399.field5715 = var13;
                                        return true;
                                    }
                                } else if (arg7 == -3) {
                                    if (class452.method2688(arg1, var12, arg8, -65535, arg6, arg5, arg8, arg3, var13)) {
                                        class399.field5715 = var13;
                                        class6.field44 = var12;
                                        return true;
                                    }
                                } else if (arg7 == -2) {
                                    if (arg9.method1435(32, arg5, arg3, arg8, arg4, arg8, arg6, arg1, var13, var12)) {
                                        class6.field44 = var12;
                                        class399.field5715 = var13;
                                        return true;
                                    }
                                } else if (arg7 == -1) {
                                    if (arg9.method1434(arg5, arg8, arg1, arg3, arg4, arg6, var13, 256, var12)) {
                                        class399.field5715 = var13;
                                        class6.field44 = var12;
                                        return true;
                                    }
                                } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                                    if (arg9.method1430(arg7, arg1, arg8, arg6, true, arg11, var12, var13)) {
                                        class6.field44 = var12;
                                        class399.field5715 = var13;
                                        return true;
                                    }
                                } else if (arg9.method1423(var13, var12, (byte) 59, arg8, arg1, arg6, arg7, arg11)) {
                                    class399.field5715 = var13;
                                    class6.field44 = var12;
                                    return true;
                                }
                                var26 = class85.field1207[var21][var22] + 1;
                                if (var21 > 0 && class437.field6319[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 - (1 - arg8)] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (arg8 - 1 <= var27) {
                                            class58.field761[var35] = var12 - 1;
                                            class560.field7681[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class437.field6319[var21 - 1][var22] = 2;
                                            class85.field1207[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var21 < (128 - arg8) && class437.field6319[var21 + 1][var22] == 0 && (var20[arg8 + var23][var24] & 0x60E40000) == 0 && (var20[arg8 + var23][arg8 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= arg8 - 1) {
                                            class58.field761[var35] = var12 + 1;
                                            class560.field7681[var35] = var13;
                                            class437.field6319[var21 + 1][var22] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class85.field1207[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg8 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class437.field6319[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg8 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (arg8 - 1 <= var29) {
                                            class58.field761[var35] = var12;
                                            class560.field7681[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class437.field6319[var21][var22 - 1] = 1;
                                            class85.field1207[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (128 - arg8 > var22 && class437.field6319[var21][var22 + 1] == 0 && (var20[var23][arg8 + var24] & 0x4E240000) == 0 && (var20[arg8 + var23 - 1][arg8 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= arg8 - 1) {
                                            class58.field761[var35] = var12;
                                            class560.field7681[var35] = var13 + 1;
                                            class437.field6319[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class85.field1207[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg8 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class437.field6319[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg8 <= var31) {
                                            class58.field761[var35] = var12 - 1;
                                            class560.field7681[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class437.field6319[var21 - 1][var22 - 1] = 3;
                                            class85.field1207[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var31 + var24 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if ((128 - arg8) > var21 && var22 > 0 && class437.field6319[var21 + 1][var22 - 1] == 0 && (var20[var23 + arg8][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg8) {
                                            class58.field761[var35] = var12 + 1;
                                            class560.field7681[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class437.field6319[var21 + 1][var22 - 1] = 9;
                                            class85.field1207[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg8 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && var22 < 128 - arg8 && class437.field6319[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][var24 + arg8] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg8; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg8 + var24] & 0x7E240000) != 0) {
                                            continue label259;
                                        }
                                    }
                                    class58.field761[var35] = var12 - 1;
                                    class560.field7681[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class437.field6319[var21 - 1][var22 + 1] = 6;
                                    class85.field1207[var21 - 1][var22 + 1] = var26;
                                }
                            } while (var21 >= 128 - arg8);
                        } while ((128 - arg8) <= var22);
                    } while (class437.field6319[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg8 + var23][var24 + arg8] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg8; var34++) {
                    if ((var20[var23 + var34][arg8 + var24] & 0x7E240000) != 0 || (var20[arg8 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label282;
                    }
                }
                class58.field761[var35] = var12 + 1;
                class560.field7681[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class437.field6319[var21 + 1][var22 + 1] = 12;
                class85.field1207[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lha;IIIIIIII)V")
    public static final void method3940(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field9703++;
        class602 var9 = (class602) class634.method3501(arg5, arg3, arg2);
        if (var9 != null) {
            class412 var10 = class210.field2705.method1362(arg1, var9.method1748(arg1 + 5875));
            int var11 = var9.method1744(21215) & 0x3;
            int var12 = var9.method1750(29244);
            if (var10.field5865 == -1) {
                int var13 = arg7;
                if (var10.field5905 > 0) {
                    var13 = arg4;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg0.method457(arg8, var13, 0, arg6, 4);
                    } else if (var11 == 1) {
                        arg0.method544(arg8, 4, arg6, var13, (byte) 127);
                    } else if (var11 == 2) {
                        arg0.method457(arg8 + 3, var13, 0, arg6, 4);
                    } else if (var11 == 3) {
                        arg0.method544(arg8, 4, arg6 + 3, var13, (byte) 127);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg0.method529(1, arg6, 1, arg8, var13, 1);
                    } else if (var11 == 1) {
                        arg0.method529(1, arg6, 1, arg8 + 3, var13, 1);
                    } else if (var11 == 2) {
                        arg0.method529(1, arg6 + 3, 1, arg8 + 3, var13, 1);
                    } else if (var11 == 3) {
                        arg0.method529(1, arg6 + 3, 1, arg8, var13, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg0.method544(arg8, 4, arg6, var13, (byte) 127);
                    } else if (var11 == 1) {
                        arg0.method457(arg8 + 3, var13, 0, arg6, 4);
                    } else if (var11 == 2) {
                        arg0.method544(arg8, 4, arg6 + 3, var13, (byte) 125);
                    } else if (var11 == 3) {
                        arg0.method457(arg8, var13, 0, arg6, 4);
                    }
                }
            } else {
                class219.method1402(var11, arg6, arg8, var10, arg1 - 15861, arg0);
            }
        }
        class602 var14 = (class602) class4.method28(arg5, arg3, arg2, field9708 == null ? (field9708 = method3941("nf")) : field9708);
        if (var14 != null) {
            class412 var15 = class210.field2705.method1362(arg1, var14.method1748(5875));
            int var16 = var14.method1744(21215) & 0x3;
            int var17 = var14.method1750(29244);
            if (var15.field5865 != -1) {
                class219.method1402(var16, arg6, arg8, var15, -15861, arg0);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field5905 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg0.method438(arg6 + 3, var18, arg8 + 3, arg8, (byte) 120, arg6);
                } else {
                    arg0.method438(arg6, var18, arg8 + 3, arg8, (byte) 89, arg6 + 3);
                }
            }
        }
        class602 var19 = (class602) class257.method1754(arg5, arg3, arg2);
        if (var19 != null) {
            class412 var20 = class210.field2705.method1362(arg1, var19.method1748(arg1 ^ 0x16F3));
            int var21 = var19.method1744(21215) & 0x3;
            if (var20.field5865 != -1) {
                class219.method1402(var21, arg6, arg8, var20, -15861, arg0);
            }
        }
        if (arg1 != 0) {
            method3940(null, 48, -23, -19, 69, -28, -70, -57, -124);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3941(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
