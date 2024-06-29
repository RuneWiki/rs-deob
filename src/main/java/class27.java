import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class27 {

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field320 = 0;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Lpw;")
    public static class661 field317 = new class661("", 16);

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "J")
    public static long field321 = 0L;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)Z")
    public static final boolean method164(boolean arg0, int arg1) {
        field319++;
        if (arg1 != 0) {
            method166(-115, -11, 59, -66, null, -52, 122, -80, (byte) 64, 37, 46, -6);
        }
        boolean var2 = class309.field3898.method393();
        if (var2 == arg0) {
            return true;
        }
        if (!arg0) {
            class309.field3898.method327();
        } else if (!class309.field3898.method361()) {
            arg0 = false;
        }
        if (arg0 == var2) {
            return false;
        } else {
            class611.field8310.field8703 = arg0;
            class611.field8310.method2749(class386.field4955, -79);
            return true;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)Z")
    public static final boolean method165(int arg0) {
        field318++;
        if (class180.field2123) {
            try {
                if ((Boolean) class104.method744(class95.field1241, "showingVideoAd", 109)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return arg0 == 1;
    }

    @OriginalMember(owner = "client!uc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field316++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(II)V")
    public class27(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIILld;IIIBIII)Z")
    public static final boolean method166(int arg0, int arg1, int arg2, int arg3, class158 arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11) {
        field315++;
        int var12 = arg2;
        int var13 = arg11;
        byte var14 = 64;
        byte var15 = 64;
        if (arg8 <= 80) {
            return true;
        }
        int var16 = arg2 - var14;
        int var17 = arg11 - var15;
        class497.field6221[var14][var15] = 99;
        class227.field2937[var14][var15] = 0;
        byte var18 = 0;
        class705.field9867[var18] = arg2;
        int var19 = 0;
        int var35 = var18 + 1;
        class144.field1739[var18] = arg11;
        int[][] var20 = arg4.field1875;
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
                                    class189.field2245 = var12;
                                    class20.field206 = var13;
                                    return false;
                                }
                                var13 = class144.field1739[var19];
                                var12 = class705.field9867[var19];
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg4.field1872;
                                var24 = var13 - arg4.field1864;
                                if (arg7 == -4) {
                                    if (arg9 == var12 && arg5 == var13) {
                                        class20.field206 = var13;
                                        class189.field2245 = var12;
                                        return true;
                                    }
                                } else if (arg7 == -3) {
                                    if (class500.method2723(arg10, arg9, arg1, var13, arg0, -122, arg0, var12, arg5)) {
                                        class189.field2245 = var12;
                                        class20.field206 = var13;
                                        return true;
                                    }
                                } else if (arg7 == -2) {
                                    if (arg4.method975(arg0, arg3, arg0, arg5, 12150, arg10, arg9, var12, arg1, var13)) {
                                        class189.field2245 = var12;
                                        class20.field206 = var13;
                                        return true;
                                    }
                                } else if (arg7 == -1) {
                                    if (arg4.method969(var12, arg3, arg10, -98, arg5, arg9, arg1, arg0, var13)) {
                                        class20.field206 = var13;
                                        class189.field2245 = var12;
                                        return true;
                                    }
                                } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                                    if (arg4.method970(var13, arg5, arg0, (byte) 96, arg6, var12, arg9, arg7)) {
                                        class20.field206 = var13;
                                        class189.field2245 = var12;
                                        return true;
                                    }
                                } else if (arg4.method971(var13, arg6, arg0, arg7, arg9, arg5, (byte) -123, var12)) {
                                    class20.field206 = var13;
                                    class189.field2245 = var12;
                                    return true;
                                }
                                var26 = class227.field2937[var22][var21] + 1;
                                if (var22 > 0 && class497.field6221[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg0 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg0 - 1) <= var27) {
                                            class705.field9867[var35] = var12 - 1;
                                            class144.field1739[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class497.field6221[var22 - 1][var21] = 2;
                                            class227.field2937[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var22 < 128 - arg0 && class497.field6221[var22 + 1][var21] == 0 && (var20[arg0 + var23][var24] & 0x60E40000) == 0 && (var20[arg0 + var23][arg0 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg0 - 1 <= var28) {
                                            class705.field9867[var35] = var12 + 1;
                                            class144.field1739[var35] = var13;
                                            class497.field6221[var22 + 1][var21] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class227.field2937[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg0 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class497.field6221[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg0 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= (arg0 - 1)) {
                                            class705.field9867[var35] = var12;
                                            class144.field1739[var35] = var13 - 1;
                                            class497.field6221[var22][var21 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class227.field2937[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var21 < (128 - arg0) && class497.field6221[var22][var21 + 1] == 0 && (var20[var23][arg0 + var24] & 0x4E240000) == 0 && (var20[var23 + arg0 - 1][arg0 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg0 - 1)) {
                                            class705.field9867[var35] = var12;
                                            class144.field1739[var35] = var13 + 1;
                                            class497.field6221[var22][var21 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class227.field2937[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg0 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class497.field6221[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg0) {
                                            class705.field9867[var35] = var12 - 1;
                                            class144.field1739[var35] = var13 - 1;
                                            class497.field6221[var22 - 1][var21 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class227.field2937[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var31 + var23 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (128 - arg0 > var22 && var21 > 0 && class497.field6221[var22 + 1][var21 - 1] == 0 && (var20[arg0 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg0 <= var32) {
                                            class705.field9867[var35] = var12 + 1;
                                            class144.field1739[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class497.field6221[var22 + 1][var21 - 1] = 9;
                                            class227.field2937[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg0 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < (128 - arg0) && class497.field6221[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][var24 + arg0] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg0; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var33 + var23 - 1][arg0 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class705.field9867[var35] = var12 - 1;
                                    class144.field1739[var35] = var13 + 1;
                                    class497.field6221[var22 - 1][var21 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class227.field2937[var22 - 1][var21 + 1] = var26;
                                }
                            } while (128 - arg0 <= var22);
                        } while ((128 - arg0) <= var21);
                    } while (class497.field6221[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg0 + var23][var24 + arg0] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg0; var34++) {
                    if ((var20[var23 + var34][arg0 + var24] & 0x7E240000) != 0 || (var20[arg0 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class705.field9867[var35] = var12 + 1;
                class144.field1739[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class497.field6221[var22 + 1][var21 + 1] = 12;
                class227.field2937[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static void method167(byte arg0) {
        if (arg0 == 69) {
            field317 = null;
        }
    }
}
