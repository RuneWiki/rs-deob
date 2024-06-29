import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class470 {

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    private int field6552;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "Lmfa;")
    public static class562 field6554 = new class562();

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "[I")
    public static int[] field6560 = new int[4096];

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "Z")
    public static boolean field6563 = false;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field6562 = -1;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "B")
    public static byte field6564;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "Ljs;")
    public static class299 field6566;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "Ljava/lang/String;")
    public static String field6565;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 4)
    public static final String method2663(boolean arg0, String arg1) {
        field6556++;
        int var2 = arg1.length();
        int var3 = 0;
        int var4 = 0;
        if (!arg0) {
            return null;
        }
        while (var4 < var2) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
            var4++;
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)Lnk;", line = 57)
    public static final class654 method2664(int arg0, int arg1) {
        field6559++;
        class654 var2 = (class654) class599.field8517.method2134(arg1 ^ 0xFFFFFD31, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class178.field2179.method1719(arg1, arg0, 4);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class654 var4 = class285.method1618(100, var3);
            class599.field8517.method2129((byte) 106, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V", line = 79)
    public static void method2665(byte arg0) {
        if (arg0 != -82) {
            field6566 = null;
        }
        field6566 = null;
        field6560 = null;
        field6554 = null;
        field6565 = null;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(CB)V", line = 95)
    public final void method2666(char arg0, byte arg1) {
        OpenGL.glCallList(this.field6552 + arg0);
        if (arg1 != 110) {
            field6562 = 46;
        }
        field6555++;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)V", line = 107)
    public final void method2667(int arg0, int arg1) {
        if (arg1 != -30923) {
            method2671((byte) -19, 50);
        }
        field6557++;
        OpenGL.glNewList(this.field6552 + arg0, 4864);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V", line = 119)
    public final void method2668(int arg0) {
        OpenGL.glEndList();
        if (arg0 != 1) {
            method2670(-5, 20, -76);
        }
        field6558++;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIILle;IIIIIIII)Z", line = 134)
    public static final boolean method2669(int arg0, int arg1, int arg2, class277 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field6550++;
        int var12 = arg7;
        int var13 = arg4;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg7 - var14;
        int var17 = arg4 - var15;
        class386.field5168[var14][var15] = 99;
        class388.field5190[var14][var15] = 0;
        byte var18 = 0;
        if (arg8 > -43) {
            field6565 = null;
        }
        int var19 = 0;
        class392.field5229[var18] = arg7;
        int var35 = var18 + 1;
        class223.field2815[var18] = arg4;
        int[][] var20 = arg3.field3493;
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
                                    class633.field8971 = var13;
                                    class249.field3200 = var12;
                                    return false;
                                }
                                var12 = class392.field5229[var19];
                                var13 = class223.field2815[var19];
                                var21 = var12 - var16;
                                var22 = var13 - var17;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg3.field3507;
                                var24 = var13 - arg3.field3489;
                                if (arg9 == -4) {
                                    if (arg10 == var12 && arg5 == var13) {
                                        class633.field8971 = var13;
                                        class249.field3200 = var12;
                                        return true;
                                    }
                                } else if (arg9 == -3) {
                                    if (class513.method2935(arg2, arg5, arg1, 2, var12, arg10, arg2, var13, arg11)) {
                                        class249.field3200 = var12;
                                        class633.field8971 = var13;
                                        return true;
                                    }
                                } else if (arg9 == -2) {
                                    if (arg3.method1567(arg2, arg6, arg10, arg11, var12, 52, arg1, arg5, var13, arg2)) {
                                        class249.field3200 = var12;
                                        class633.field8971 = var13;
                                        return true;
                                    }
                                } else if (arg9 == -1) {
                                    if (arg3.method1576(arg6, arg5, var13, arg2, 6300, arg11, var12, arg1, arg10)) {
                                        class633.field8971 = var13;
                                        class249.field3200 = var12;
                                        return true;
                                    }
                                } else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
                                    if (arg3.method1575(arg10, arg5, var12, arg2, arg9, -1, var13, arg0)) {
                                        class633.field8971 = var13;
                                        class249.field3200 = var12;
                                        return true;
                                    }
                                } else if (arg3.method1568(arg5, arg2, 2, arg9, var12, arg0, var13, arg10)) {
                                    class249.field3200 = var12;
                                    class633.field8971 = var13;
                                    return true;
                                }
                                var26 = class388.field5190[var21][var22] + 1;
                                if (var21 > 0 && class386.field5168[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg2 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (arg2 - 1 <= var27) {
                                            class392.field5229[var35] = var12 - 1;
                                            class223.field2815[var35] = var13;
                                            class386.field5168[var21 - 1][var22] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class388.field5190[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var21 < 128 - arg2 && class386.field5168[var21 + 1][var22] == 0 && (var20[var23 + arg2][var24] & 0x60E40000) == 0 && (var20[var23 + arg2][arg2 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg2 - 1 <= var28) {
                                            class392.field5229[var35] = var12 + 1;
                                            class223.field2815[var35] = var13;
                                            class386.field5168[var21 + 1][var22] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class388.field5190[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg2 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class386.field5168[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg2 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (arg2 - 1 <= var29) {
                                            class392.field5229[var35] = var12;
                                            class223.field2815[var35] = var13 - 1;
                                            class386.field5168[var21][var22 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class388.field5190[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 < 128 - arg2 && class386.field5168[var21][var22 + 1] == 0 && (var20[var23][arg2 + var24] & 0x4E240000) == 0 && (var20[arg2 + var23 - 1][arg2 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= arg2 - 1) {
                                            class392.field5229[var35] = var12;
                                            class223.field2815[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class386.field5168[var21][var22 + 1] = 4;
                                            class388.field5190[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][var24 + arg2] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class386.field5168[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg2 <= var31) {
                                            class392.field5229[var35] = var12 - 1;
                                            class223.field2815[var35] = var13 - 1;
                                            class386.field5168[var21 - 1][var22 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class388.field5190[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var21 < (128 - arg2) && var22 > 0 && class386.field5168[var21 + 1][var22 - 1] == 0 && (var20[arg2 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg2 <= var32) {
                                            class392.field5229[var35] = var12 + 1;
                                            class223.field2815[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class386.field5168[var21 + 1][var22 - 1] = 9;
                                            class388.field5190[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg2 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && var22 < (128 - arg2) && class386.field5168[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg2 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg2; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var33 + var23 - 1][arg2 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class392.field5229[var35] = var12 - 1;
                                    class223.field2815[var35] = var13 + 1;
                                    class386.field5168[var21 - 1][var22 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class388.field5190[var21 - 1][var22 + 1] = var26;
                                }
                            } while (var21 >= 128 - arg2);
                        } while ((128 - arg2) <= var22);
                    } while (class386.field5168[var21 + 1][var22 + 1] != 0);
                } while ((var20[var23 + arg2][arg2 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg2; var34++) {
                    if ((var20[var23 + var34][arg2 + var24] & 0x7E240000) != 0 || (var20[arg2 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class392.field5229[var35] = var12 + 1;
                class223.field2815[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class386.field5168[var21 + 1][var22 + 1] = 12;
                class388.field5190[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)V", line = 566)
    public static final void method2670(int arg0, int arg1, int arg2) {
        if (arg0 <= 66) {
            method2664(123, 43);
        }
        field6553++;
        class472.field6590 = arg2 - class637.field9039;
        class580.field8249 = arg1 - class637.field9043;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BI)I", line = 578)
    public static final int method2671(byte arg0, int arg1) {
        int var2 = 17 / ((15 - arg0) / 57);
        field6551++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lap;I)V", line = 593)
    public class470(class435 arg0, int arg1) {
        this.field6552 = OpenGL.glGenLists(arg1);
    }
}
