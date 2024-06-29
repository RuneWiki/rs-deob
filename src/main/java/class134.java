import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class134 extends RuntimeException {

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2090;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Ljava/lang/String;")
    public String field2093;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lqv;")
    public static class316 field2088 = new class316(84, 6);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V", line = 3)
    public static final void method977(String arg0, int arg1, String arg2) {
        class339.field5024 = arg2;
        field2091++;
        class18.field206 = arg0;
        if (class497.field7189 != 3 && class339.field5024.equals("") || class18.field206.equals("")) {
            class102.method748((byte) 49, 3);
            return;
        }
        if (class497.field7189 != 1) {
            class25.field355 = -1;
            class482.field6999 = 0;
        }
        class161.field2455 = false;
        class102.method748((byte) 49, -3);
        class502.field7246 = 0;
        class193.field2807 = arg1;
        class212.field3201 = 0;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Lsu;", line = 30)
    public static final class144 method978(int arg0) {
        field2092++;
        try {
            return arg0 == 657 ? new class323() : null;
        } catch (Throwable var2) {
            try {
                return (class144) Class.forName("jp").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class68();
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIILue;IIIII)Z", line = 54)
    public static final boolean method979(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class159 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2087++;
        int var12 = arg0;
        int var13 = arg4;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = 80 / ((-arg1 - 49) / 38);
        int var17 = arg0 - var14;
        int var18 = arg4 - var15;
        class251.field3739[var14][var15] = 99;
        class287.field4247[var14][var15] = 0;
        byte var19 = 0;
        int var20 = 0;
        class62.field1087[var19] = arg0;
        int var36 = var19 + 1;
        class476.field6935[var19] = arg4;
        int[][] var21 = arg6.field2427;
        while (true) {
            label282: while (true) {
                int var22;
                int var23;
                int var24;
                int var25;
                int var27;
                do {
                    do {
                        do {
                            label259: do {
                                if (var36 == var20) {
                                    class90.field1445 = var12;
                                    class347.field5113 = var13;
                                    return false;
                                }
                                var13 = class476.field6935[var20];
                                var12 = class62.field1087[var20];
                                var22 = var12 - var17;
                                var23 = var13 - var18;
                                var20 = var20 + 1 & 0xFFF;
                                var24 = var12 - arg6.field2440;
                                var25 = var13 - arg6.field2437;
                                if (arg2 == -4) {
                                    if (arg5 == var12 && arg11 == var13) {
                                        class347.field5113 = var13;
                                        class90.field1445 = var12;
                                        return true;
                                    }
                                } else if (arg2 == -3) {
                                    if (class167.method1192(arg7, arg8, arg5, var13, var12, arg9, arg11, arg9, 1)) {
                                        class347.field5113 = var13;
                                        class90.field1445 = var12;
                                        return true;
                                    }
                                } else if (arg2 == -2) {
                                    if (arg6.method1111((byte) -60, arg5, arg9, arg11, var12, arg8, arg9, arg7, var13, arg3)) {
                                        class90.field1445 = var12;
                                        class347.field5113 = var13;
                                        return true;
                                    }
                                } else if (arg2 == -1) {
                                    if (arg6.method1118(arg11, arg3, arg9, arg8, arg5, (byte) 102, var12, arg7, var13)) {
                                        class347.field5113 = var13;
                                        class90.field1445 = var12;
                                        return true;
                                    }
                                } else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
                                    if (arg6.method1122(arg2, arg5, arg11, var12, var13, (byte) 28, arg9, arg10)) {
                                        class90.field1445 = var12;
                                        class347.field5113 = var13;
                                        return true;
                                    }
                                } else if (arg6.method1119(arg5, arg11, arg10, var13, 3, arg9, var12, arg2)) {
                                    class90.field1445 = var12;
                                    class347.field5113 = var13;
                                    return true;
                                }
                                var27 = class287.field4247[var22][var23] + 1;
                                if (var22 > 0 && class251.field3739[var22 - 1][var23] == 0 && (var21[var24 - 1][var25] & 0x43A40000) == 0 && (var21[var24 - 1][var25 + arg9 - 1] & 0x4E240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if ((arg9 - 1) <= var28) {
                                            class62.field1087[var36] = var12 - 1;
                                            class476.field6935[var36] = var13;
                                            var36 = var36 + 1 & 0xFFF;
                                            class251.field3739[var22 - 1][var23] = 2;
                                            class287.field4247[var22 - 1][var23] = var27;
                                            break;
                                        }
                                        if ((var21[var24 - 1][var25 + var28] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 < 128 - arg9 && class251.field3739[var22 + 1][var23] == 0 && (var21[arg9 + var24][var25] & 0x60E40000) == 0 && (var21[arg9 + var24][var25 + arg9 - 1] & 0x78240000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg9 - 1) {
                                            class62.field1087[var36] = var12 + 1;
                                            class476.field6935[var36] = var13;
                                            var36 = var36 + 1 & 0xFFF;
                                            class251.field3739[var22 + 1][var23] = 8;
                                            class287.field4247[var22 + 1][var23] = var27;
                                            break;
                                        }
                                        if ((var21[var24 + arg9][var25 + var29] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var23 > 0 && class251.field3739[var22][var23 - 1] == 0 && (var21[var24][var25 - 1] & 0x43A40000) == 0 && (var21[arg9 + var24 - 1][var25 - 1] & 0x60E40000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if ((arg9 - 1) <= var30) {
                                            class62.field1087[var36] = var12;
                                            class476.field6935[var36] = var13 - 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class251.field3739[var22][var23 - 1] = 1;
                                            class287.field4247[var22][var23 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 + var30][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if ((128 - arg9) > var23 && class251.field3739[var22][var23 + 1] == 0 && (var21[var24][arg9 + var25] & 0x4E240000) == 0 && (var21[arg9 + var24 - 1][arg9 + var25] & 0x78240000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if ((arg9 - 1) <= var31) {
                                            class62.field1087[var36] = var12;
                                            class476.field6935[var36] = var13 + 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class251.field3739[var22][var23 + 1] = 4;
                                            class287.field4247[var22][var23 + 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 + var31][arg9 + var25] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 > 0 && var23 > 0 && class251.field3739[var22 - 1][var23 - 1] == 0 && (var21[var24 - 1][var25 - 1] & 0x43A40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg9) {
                                            class62.field1087[var36] = var12 - 1;
                                            class476.field6935[var36] = var13 - 1;
                                            class251.field3739[var22 - 1][var23 - 1] = 3;
                                            var36 = var36 + 1 & 0xFFF;
                                            class287.field4247[var22 - 1][var23 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 - 1][var25 + var32 - 1] & 0x4FA40000) != 0 || (var21[var24 + var32 - 1][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (128 - arg9 > var22 && var23 > 0 && class251.field3739[var22 + 1][var23 - 1] == 0 && (var21[arg9 + var24][var25 - 1] & 0x60E40000) == 0) {
                                    int var33 = 1;
                                    while (true) {
                                        if (var33 >= arg9) {
                                            class62.field1087[var36] = var12 + 1;
                                            class476.field6935[var36] = var13 - 1;
                                            class251.field3739[var22 + 1][var23 - 1] = 9;
                                            var36 = var36 + 1 & 0xFFF;
                                            class287.field4247[var22 + 1][var23 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[arg9 + var24][var33 + var25 - 1] & 0x78E40000) != 0 || (var21[var24 + var33][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var33++;
                                    }
                                }
                                if (var22 > 0 && 128 - arg9 > var23 && class251.field3739[var22 - 1][var23 + 1] == 0 && (var21[var24 - 1][arg9 + var25] & 0x4E240000) == 0) {
                                    for (int var34 = 1; var34 < arg9; var34++) {
                                        if ((var21[var24 - 1][var25 + var34] & 0x4FA40000) != 0 || (var21[var24 + var34 - 1][arg9 + var25] & 0x7E240000) != 0) {
                                            continue label259;
                                        }
                                    }
                                    class62.field1087[var36] = var12 - 1;
                                    class476.field6935[var36] = var13 + 1;
                                    var36 = var36 + 1 & 0xFFF;
                                    class251.field3739[var22 - 1][var23 + 1] = 6;
                                    class287.field4247[var22 - 1][var23 + 1] = var27;
                                }
                            } while (var22 >= (128 - arg9));
                        } while (var23 >= (128 - arg9));
                    } while (class251.field3739[var22 + 1][var23 + 1] != 0);
                } while ((var21[var24 + arg9][var25 + arg9] & 0x78240000) != 0);
                for (int var35 = 1; var35 < arg9; var35++) {
                    if ((var21[var24 + var35][arg9 + var25] & 0x7E240000) != 0 || (var21[arg9 + var24][var25 + var35] & 0x78E40000) != 0) {
                        continue label282;
                    }
                }
                class62.field1087[var36] = var12 + 1;
                class476.field6935[var36] = var13 + 1;
                var36 = var36 + 1 & 0xFFF;
                class251.field3739[var22 + 1][var23 + 1] = 12;
                class287.field4247[var22 + 1][var23 + 1] = var27;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 498)
    public static void method980(byte arg0) {
        int var1 = 64 % ((arg0 + 74) / 40);
        field2088 = null;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 508)
    public class134(Throwable arg0, String arg1) {
        this.field2090 = arg0;
        this.field2093 = arg1;
    }
}
