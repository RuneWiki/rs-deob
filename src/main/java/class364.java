import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public abstract class class364 extends class766 {

    @OriginalMember(owner = "client!hp", name = "t", descriptor = "Llea;")
    public class573 field5174;

    @OriginalMember(owner = "client!hp", name = "w", descriptor = "F")
    public static float field5177;

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!hp", name = "p", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!hp", name = "q", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!hp", name = "r", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!hp", name = "s", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!hp", name = "u", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!hp", name = "v", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!hp", name = "y", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "Z")
    public boolean field5168;

    @OriginalMember(owner = "client!hp", name = "x", descriptor = "[[[I")
    public static int[][][] field5178;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)Z", line = 7)
    public final boolean method2187(byte arg0) {
        field5169++;
        if (arg0 >= -23) {
            field5178 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)I", line = 20)
    public int method1185(int arg0) {
        field5170++;
        int var2 = 27 % ((arg0 + 33) / 33);
        return 0;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lol;B)Ljava/lang/String;", line = 30)
    public static final String method2188(class431 arg0, byte arg1) {
        if (arg1 >= -63) {
            method2190(16);
        }
        field5179++;
        return class217.method1493(32767, (byte) -124, arg0);
    }

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "(I)I", line = 45)
    public final int method2189(int arg0) {
        if (arg0 != 1) {
            field5177 = -1.5698051F;
        }
        field5173++;
        return 1;
    }

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "(I)V", line = 58)
    public static final void method2190(int arg0) {
        class27.field281 = null;
        if (arg0 != -28517) {
            return;
        }
        class312.field4420 = null;
        class391.field5447 = null;
        field5176++;
        class26.field279 = null;
        class215.field3139 = null;
        class431.field6017 = null;
        class303.field4359 = null;
        class278.field4013 = null;
        class122.field2073 = null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIIIIIIILkn;I)Z", line = 83)
    public static final boolean method2191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class340 arg10, int arg11) {
        field5175++;
        int var12 = arg3;
        int var13 = arg0;
        byte var14 = 64;
        if (arg1 != 25856) {
            method2194(true, -78, -46L);
        }
        byte var15 = 64;
        int var16 = arg3 - var14;
        int var17 = arg0 - var15;
        class663.field9341[var14][var15] = 99;
        class336.field4774[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class249.field3576[var18] = arg3;
        int var35 = var18 + 1;
        class368.field5196[var18] = arg0;
        int[][] var20 = arg10.field4822;
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
                                    class510.field7006 = var12;
                                    class6.field85 = var13;
                                    return false;
                                }
                                var12 = class249.field3576[var19];
                                var13 = class368.field5196[var19];
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg10.field4824;
                                var24 = var13 - arg10.field4837;
                                if (arg4 == -4) {
                                    if (arg11 == var12 && arg6 == var13) {
                                        class510.field7006 = var12;
                                        class6.field85 = var13;
                                        return true;
                                    }
                                } else if (arg4 == -3) {
                                    if (class68.method660(arg11, true, arg6, var13, arg8, arg5, arg9, var12, arg9)) {
                                        class6.field85 = var13;
                                        class510.field7006 = var12;
                                        return true;
                                    }
                                } else if (arg4 == -2) {
                                    if (arg10.method2078(arg9, arg1 - 25778, arg9, var13, var12, arg5, arg8, arg6, arg7, arg11)) {
                                        class510.field7006 = var12;
                                        class6.field85 = var13;
                                        return true;
                                    }
                                } else if (arg4 == -1) {
                                    if (arg10.method2090(arg9, var12, arg8, arg5, true, arg6, arg7, arg11, var13)) {
                                        class510.field7006 = var12;
                                        class6.field85 = var13;
                                        return true;
                                    }
                                } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                                    if (arg10.method2094(arg9, arg1 - 25949, arg4, arg6, arg2, arg11, var12, var13)) {
                                        class510.field7006 = var12;
                                        class6.field85 = var13;
                                        return true;
                                    }
                                } else if (arg10.method2077(var13, arg4, arg2, arg9, arg11, arg6, -104, var12)) {
                                    class6.field85 = var13;
                                    class510.field7006 = var12;
                                    return true;
                                }
                                var26 = class336.field4774[var22][var21] + 1;
                                if (var22 > 0 && class663.field9341[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg9 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (arg9 - 1 <= var27) {
                                            class249.field3576[var35] = var12 - 1;
                                            class368.field5196[var35] = var13;
                                            class663.field9341[var22 - 1][var21] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class336.field4774[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (128 - arg9 > var22 && class663.field9341[var22 + 1][var21] == 0 && (var20[var23 + arg9][var24] & 0x60E40000) == 0 && (var20[arg9 + var23][arg9 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg9 - 1 <= var28) {
                                            class249.field3576[var35] = var12 + 1;
                                            class368.field5196[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class663.field9341[var22 + 1][var21] = 8;
                                            class336.field4774[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg9 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class663.field9341[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg9 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= (arg9 - 1)) {
                                            class249.field3576[var35] = var12;
                                            class368.field5196[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class663.field9341[var22][var21 - 1] = 1;
                                            class336.field4774[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var21 < 128 - arg9 && class663.field9341[var22][var21 + 1] == 0 && (var20[var23][arg9 + var24] & 0x4E240000) == 0 && (var20[var23 + arg9 - 1][arg9 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if ((arg9 - 1) <= var30) {
                                            class249.field3576[var35] = var12;
                                            class368.field5196[var35] = var13 + 1;
                                            class663.field9341[var22][var21 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class336.field4774[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg9 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class663.field9341[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg9 <= var31) {
                                            class249.field3576[var35] = var12 - 1;
                                            class368.field5196[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class663.field9341[var22 - 1][var21 - 1] = 3;
                                            class336.field4774[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 - (1 - var31)] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 < (128 - arg9) && var21 > 0 && class663.field9341[var22 + 1][var21 - 1] == 0 && (var20[arg9 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg9) {
                                            class249.field3576[var35] = var12 + 1;
                                            class368.field5196[var35] = var13 - 1;
                                            class663.field9341[var22 + 1][var21 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class336.field4774[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg9 + var23][var32 + var24 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < (128 - arg9) && class663.field9341[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg9 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg9; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg9 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class249.field3576[var35] = var12 - 1;
                                    class368.field5196[var35] = var13 + 1;
                                    class663.field9341[var22 - 1][var21 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class336.field4774[var22 - 1][var21 + 1] = var26;
                                }
                            } while (var22 >= 128 - arg9);
                        } while (var21 >= 128 - arg9);
                    } while (class663.field9341[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg9 + var23][arg9 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg9; var34++) {
                    if ((var20[var23 + var34][arg9 + var24] & 0x7E240000) != 0 || (var20[var23 + arg9][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class249.field3576[var35] = var12 + 1;
                class368.field5196[var35] = var13 + 1;
                class663.field9341[var22 + 1][var21 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class336.field4774[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "(I)Z", line = 511)
    public final boolean method2192(int arg0) {
        field5171++;
        if (arg0 != -23116) {
            field5177 = -0.9077091F;
        }
        return this.field5168;
    }

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "(I)V", line = 522)
    public static void method2193(int arg0) {
        field5178 = null;
        if (arg0 != 0) {
            field5177 = -1.0836838F;
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Llea;)V", line = 532)
    public class364(class573 arg0) {
        this.field5174 = arg0;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZIJ)Ljava/lang/String;", line = 541)
    public static final String method2194(boolean arg0, int arg1, long arg2) {
        class724.method4017((byte) 126, arg2);
        field5172++;
        int var4 = class99.field1449.get(5);
        if (!arg0) {
            method2188(null, (byte) 101);
        }
        int var5 = class99.field1449.get(2);
        int var6 = class99.field1449.get(1);
        return arg1 == 3 ? class50.method394(arg2, arg1, 100) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class25.field276[arg1][var5] + "-" + var6;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)Z")
    public abstract boolean method1191(int arg0);

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZI)V")
    public abstract void method1189(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lwi;ILwi;I)V")
    public abstract void method1192(class504 arg0, int arg1, class504 arg2, int arg3);

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)Z")
    public abstract boolean method1187(byte arg0);

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)V")
    public abstract void method1186(int arg0, int arg1);

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V")
    public abstract void method1183(boolean arg0);
}
