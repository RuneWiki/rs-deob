import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class57 {

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
    public int field724 = 8;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
    public int field721 = 16777215;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "Leh;")
    public static class246 field722;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public int field713;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public int field718;

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
    public int field719;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
    public int field725;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "Z")
    public boolean field720;

    static {
        new class530("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        new class530("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field722 = new class246(42, 5);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V", line = 3)
    public static void method470(byte arg0) {
        field722 = null;
        if (arg0 != 109) {
            field722 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIIIILmk;IIIIII)Z", line = 19)
    public static final boolean method471(int arg0, int arg1, int arg2, int arg3, int arg4, class40 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field715++;
        int var12 = arg11;
        int var13 = arg9;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg11 - var14;
        int var17 = arg9 - var15;
        class316.field4592[var14][var15] = 99;
        class458.field6420[var14][var15] = 0;
        byte var18 = 0;
        if (arg0 != -8246) {
            return false;
        }
        class153.field2208[var18] = arg11;
        int var19 = 0;
        int var35 = var18 + 1;
        class160.field2373[var18] = arg9;
        int[][] var20 = arg5.field443;
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
                                    class144.field1905 = var12;
                                    class204.field2946 = var13;
                                    return false;
                                }
                                var13 = class160.field2373[var19];
                                var12 = class153.field2208[var19];
                                var19 = var19 + 1 & 0xFFF;
                                var21 = var12 - var16;
                                var22 = var13 - var17;
                                var23 = var12 - arg5.field436;
                                var24 = var13 - arg5.field447;
                                if (arg1 == -4) {
                                    if (arg6 == var12 && arg3 == var13) {
                                        class144.field1905 = var12;
                                        class204.field2946 = var13;
                                        return true;
                                    }
                                } else if (arg1 == -3) {
                                    if (class510.method3047(arg8, arg10, arg3, var12, arg6, arg4, arg10, 66, var13)) {
                                        class204.field2946 = var13;
                                        class144.field1905 = var12;
                                        return true;
                                    }
                                } else if (arg1 == -2) {
                                    if (arg5.method232(var12, arg10, arg6, -77, arg3, arg4, var13, arg10, arg8, arg2)) {
                                        class144.field1905 = var12;
                                        class204.field2946 = var13;
                                        return true;
                                    }
                                } else if (arg1 == -1) {
                                    if (arg5.method225(arg4, arg10, arg6, (byte) 67, arg3, var13, arg2, var12, arg8)) {
                                        class144.field1905 = var12;
                                        class204.field2946 = var13;
                                        return true;
                                    }
                                } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                                    if (arg5.method220(var13, arg10, arg1, arg7, arg3, 108, arg6, var12)) {
                                        class204.field2946 = var13;
                                        class144.field1905 = var12;
                                        return true;
                                    }
                                } else if (arg5.method222(arg7, arg0 ^ 0x2063, arg3, arg6, arg1, arg10, var12, var13)) {
                                    class204.field2946 = var13;
                                    class144.field1905 = var12;
                                    return true;
                                }
                                var26 = class458.field6420[var21][var22] + 1;
                                if (var21 > 0 && class316.field4592[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg10 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg10 - 1) {
                                            class153.field2208[var35] = var12 - 1;
                                            class160.field2373[var35] = var13;
                                            class316.field4592[var21 - 1][var22] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class458.field6420[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if ((128 - arg10) > var21 && class316.field4592[var21 + 1][var22] == 0 && (var20[arg10 + var23][var24] & 0x60E40000) == 0 && (var20[arg10 + var23][arg10 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg10 - 1 <= var28) {
                                            class153.field2208[var35] = var12 + 1;
                                            class160.field2373[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class316.field4592[var21 + 1][var22] = 8;
                                            class458.field6420[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg10][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class316.field4592[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg10 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= (arg10 - 1)) {
                                            class153.field2208[var35] = var12;
                                            class160.field2373[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class316.field4592[var21][var22 - 1] = 1;
                                            class458.field6420[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if ((128 - arg10) > var22 && class316.field4592[var21][var22 + 1] == 0 && (var20[var23][arg10 + var24] & 0x4E240000) == 0 && (var20[var23 + arg10 - 1][var24 + arg10] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if ((arg10 - 1) <= var30) {
                                            class153.field2208[var35] = var12;
                                            class160.field2373[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class316.field4592[var21][var22 + 1] = 4;
                                            class458.field6420[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg10 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class316.field4592[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg10 <= var31) {
                                            class153.field2208[var35] = var12 - 1;
                                            class160.field2373[var35] = var13 - 1;
                                            class316.field4592[var21 - 1][var22 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class458.field6420[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var21 < (128 - arg10) && var22 > 0 && class316.field4592[var21 + 1][var22 - 1] == 0 && (var20[arg10 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg10 <= var32) {
                                            class153.field2208[var35] = var12 + 1;
                                            class160.field2373[var35] = var13 - 1;
                                            class316.field4592[var21 + 1][var22 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class458.field6420[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg10 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && (128 - arg10) > var22 && class316.field4592[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][var24 + arg10] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg10; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg10 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class153.field2208[var35] = var12 - 1;
                                    class160.field2373[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class316.field4592[var21 - 1][var22 + 1] = 6;
                                    class458.field6420[var21 - 1][var22 + 1] = var26;
                                }
                            } while (var21 >= (128 - arg10));
                        } while (128 - arg10 <= var22);
                    } while (class316.field4592[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg10 + var23][arg10 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg10; var34++) {
                    if ((var20[var23 + var34][arg10 + var24] & 0x7E240000) != 0 || (var20[arg10 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class153.field2208[var35] = var12 + 1;
                class160.field2373[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class316.field4592[var21 + 1][var22 + 1] = 12;
                class458.field6420[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lwm;B)V", line = 469)
    public final void method472(class403 arg0, byte arg1) {
        if (arg1 > 0) {
            method474((byte) -87, 48, -97);
        }
        while (true) {
            int var3 = arg0.method2357((byte) 111);
            if (var3 == 0) {
                field714++;
                return;
            }
            this.method473(arg0, var3, 27);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lwm;II)V", line = 494)
    private final void method473(class403 arg0, int arg1, int arg2) {
        if (arg2 <= 4) {
            method471(-96, 99, 77, 75, 66, null, -46, 65, -39, 98, 9, 1);
        }
        if (arg1 == 1) {
            this.field724 = arg0.method2338(0);
        } else if (arg1 == 2) {
            this.field720 = true;
        } else if (arg1 == 3) {
            this.field718 = arg0.method2371(7162);
            this.field725 = arg0.method2371(7162);
            this.field713 = arg0.method2371(7162);
        } else if (arg1 == 4) {
            this.field719 = arg0.method2357((byte) 120);
        } else if (arg1 == 5) {
            this.field717 = arg0.method2338(0);
        } else if (arg1 == 6) {
            this.field721 = arg0.method2323((byte) 81);
        }
        field726++;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(BII)Z", line = 548)
    public static final boolean method474(byte arg0, int arg1, int arg2) {
        if (arg0 != 29) {
            field722 = null;
        }
        field723++;
        return (arg1 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(II[IIIIII)V", line = 559)
    public static final void method475(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field716++;
        if (arg6 != 1479619105) {
            method474((byte) -40, 114, -35);
        }
        if (arg4 > 0 && !class51.method407(arg4, arg6 - 1479618081)) {
            throw new IllegalArgumentException("");
        } else if (arg3 > 0 && !class51.method407(arg3, 1024)) {
            throw new IllegalArgumentException("");
        } else if (arg1 == 32993) {
            int var8 = 0;
            int var9 = arg4 >= arg3 ? arg3 : arg4;
            int var10 = arg4 >> 1;
            int var11 = arg3 >> 1;
            int[] var12 = arg2;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg0, var8, arg7, arg4, arg3, 0, arg1, arg5, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = var15 + arg4;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var15++];
                        int var23 = (var20 & 0xFF8E80) >> 16;
                        int var24 = var20 >> 8 & 0xFF;
                        int var25 = var12[var16++];
                        int var26 = var20 & 0xFF;
                        int var27 = var20 >> 24 & 0xFF;
                        int var28 = (var22 >> 24 & 0xFF) + var27;
                        int var29 = ((var22 & 0xFFF8) >> 8) + var24;
                        int var30 = ((var22 & 0xFF8D3A) >> 16) + var23;
                        int var31 = (var22 & 0xFF) + var26;
                        int var32 = ((var21 & 0xFF7548) >> 16) + var30;
                        int var33 = (var21 & 0xFF) + var31;
                        int var34 = (var21 >> 24 & 0xFF) + var28;
                        int var35 = (var21 >> 8 & 0xFF) + var29;
                        int var36 = (var25 >> 24 & 0xFF) + var34;
                        int var37 = ((var25 & 0xFF13C4) >> 16) + var32;
                        int var38 = (var25 >> 8 & 0xFF) + var35;
                        int var39 = (var25 & 0xFF) + var33;
                        var13[var14++] = class170.method1067(class170.method1067(class239.method1507(1020, var38) << 6, class170.method1067(class239.method1507(var37 << 14, 16711680), class239.method1507(-16777216, var36 << 22))), class239.method1507(var39, 1020) >> 2);
                    }
                    var15 += arg4;
                    var16 += arg4;
                }
                int[] var18 = var13;
                var13 = var12;
                var12 = var18;
                arg3 = var11;
                arg4 = var10;
                var8++;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
