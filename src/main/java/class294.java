import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class294 extends class392 {

    @OriginalMember(owner = "client!gga", name = "z", descriptor = "I")
    public int field3936 = -1;

    @OriginalMember(owner = "client!gga", name = "A", descriptor = "I")
    public int field3937 = 12800;

    @OriginalMember(owner = "client!gga", name = "B", descriptor = "I")
    public int field3938 = 12800;

    @OriginalMember(owner = "client!gga", name = "M", descriptor = "I")
    public int field3948 = 0;

    @OriginalMember(owner = "client!gga", name = "V", descriptor = "Z")
    public boolean field3957 = true;

    @OriginalMember(owner = "client!gga", name = "Y", descriptor = "I")
    public int field3960 = 0;

    @OriginalMember(owner = "client!gga", name = "J", descriptor = "I")
    public int field3945 = -1;

    @OriginalMember(owner = "client!gga", name = "K", descriptor = "I")
    public int field3946;

    @OriginalMember(owner = "client!gga", name = "w", descriptor = "Ljava/lang/String;")
    public String field3933;

    @OriginalMember(owner = "client!gga", name = "x", descriptor = "I")
    public int field3934;

    @OriginalMember(owner = "client!gga", name = "P", descriptor = "Ljava/lang/String;")
    public String field3951;

    @OriginalMember(owner = "client!gga", name = "C", descriptor = "Lkba;")
    public class108 field3939;

    @OriginalMember(owner = "client!gga", name = "G", descriptor = "[[I")
    public static int[][] field3942 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!gga", name = "R", descriptor = "Lkba;")
    public static class108 field3953 = new class108();

    @OriginalMember(owner = "client!gga", name = "X", descriptor = "I")
    public static int field3959 = 0;

    @OriginalMember(owner = "client!gga", name = "v", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!gga", name = "y", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!gga", name = "D", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!gga", name = "H", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!gga", name = "I", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!gga", name = "N", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!gga", name = "O", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!gga", name = "Q", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!gga", name = "T", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!gga", name = "U", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!gga", name = "W", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!gga", name = "S", descriptor = "Lmv;")
    public static class377 field3954;

    @OriginalMember(owner = "client!gga", name = "F", descriptor = "Lvia;")
    public static class564 field3941;

    @OriginalMember(owner = "client!gga", name = "L", descriptor = "[I")
    public static int[] field3947;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(II[II)Z", line = 6)
    public final boolean method1752(int arg0, int arg1, int[] arg2, int arg3) {
        field3940++;
        if (arg0 != 31960) {
            method1754(70, -83, false, 79, 63, 26, -76, -81, 21);
        }
        for (class317 var5 = (class317) this.field3939.method724(32); var5 != null; var5 = (class317) this.field3939.method723(113)) {
            if (var5.method1894(arg1, (byte) 41, arg3)) {
                var5.method1896(arg3, 0, arg1, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(III)Z", line = 33)
    public final boolean method1753(int arg0, int arg1, int arg2) {
        if (arg0 != 6) {
            method1756((byte) -19);
        }
        field3955++;
        for (class317 var4 = (class317) this.field3939.method724(32); var4 != null; var4 = (class317) this.field3939.method723(107)) {
            if (var4.method1897(arg0 - 116, arg1, arg2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIZIIIIII)V", line = 56)
    public static final void method1754(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3935++;
        class743.field10333[class282.field3738++] = new class620(arg3, arg4, arg0, arg5, arg5, arg0, arg6, arg8, arg8, arg6, arg7, arg7, arg1, arg1);
        if (arg2) {
            field3954 = null;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "([JIBI[Ljava/lang/Object;)V", line = 69)
    public static final void method1755(long[] arg0, int arg1, byte arg2, int arg3, Object[] arg4) {
        field3958++;
        int var5 = 36 / (-arg2 / 49);
        if (arg1 >= arg3) {
            return;
        }
        int var6 = (arg1 + arg3) / 2;
        int var7 = arg1;
        long var8 = arg0[var6];
        arg0[var6] = arg0[arg3];
        arg0[arg3] = var8;
        Object var10 = arg4[var6];
        arg4[var6] = arg4[arg3];
        arg4[arg3] = var10;
        int var11 = ~var8 == Long.MIN_VALUE ? 0 : 1;
        for (int var12 = arg1; var12 < arg3; var12++) {
            if (arg0[var12] < var8 + ((long) (var12 & var11))) {
                long var13 = arg0[var12];
                arg0[var12] = arg0[var7];
                arg0[var7] = var13;
                Object var15 = arg4[var12];
                arg4[var12] = arg4[var7];
                arg4[var7++] = var15;
            }
        }
        arg0[arg3] = arg0[var7];
        arg0[var7] = var8;
        arg4[arg3] = arg4[var7];
        arg4[var7] = var10;
        method1755(arg0, arg1, (byte) 64, var7 - 1, arg4);
        method1755(arg0, var7 + 1, (byte) -109, arg3, arg4);
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)V", line = 127)
    public static void method1756(byte arg0) {
        if (arg0 < 41) {
            return;
        }
        field3947 = null;
        field3954 = null;
        field3953 = null;
        field3942 = null;
        field3941 = null;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIIIIBIIIIILpfa;)Z", line = 142)
    public static final boolean method1757(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class298 arg11) {
        field3932++;
        if (arg5 != 20) {
            return false;
        }
        int var12 = arg2;
        int var13 = arg4;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg2 - var14;
        int var17 = arg4 - var15;
        class244.field3173[var14][var15] = 99;
        class525.field7061[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class43.field472[var18] = arg2;
        int var35 = var18 + 1;
        class386.field5451[var18] = arg4;
        int[][] var20 = arg11.field3994;
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
                                    class301.field4076 = var12;
                                    class378.field5253 = var13;
                                    return false;
                                }
                                var12 = class43.field472[var19];
                                var13 = class386.field5451[var19];
                                var21 = var12 - var16;
                                var22 = var13 - var17;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg11.field3999;
                                var24 = var13 - arg11.field4003;
                                if (arg6 == -4) {
                                    if (arg9 == var12 && arg10 == var13) {
                                        class378.field5253 = var13;
                                        class301.field4076 = var12;
                                        return true;
                                    }
                                } else if (arg6 == -3) {
                                    if (class551.method3134(arg9, arg8, -113, var13, arg1, var12, arg10, arg0, arg0)) {
                                        class301.field4076 = var12;
                                        class378.field5253 = var13;
                                        return true;
                                    }
                                } else if (arg6 == -2) {
                                    if (arg11.method1774(arg9, arg1, arg10, -1, var13, arg8, arg0, var12, arg0, arg7)) {
                                        class378.field5253 = var13;
                                        class301.field4076 = var12;
                                        return true;
                                    }
                                } else if (arg6 == -1) {
                                    if (arg11.method1777(arg8, arg9, var13, 14672, arg0, arg10, arg7, var12, arg1)) {
                                        class378.field5253 = var13;
                                        class301.field4076 = var12;
                                        return true;
                                    }
                                } else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
                                    if (arg11.method1790(arg10, var12, (byte) -123, arg0, var13, arg3, arg9, arg6)) {
                                        class378.field5253 = var13;
                                        class301.field4076 = var12;
                                        return true;
                                    }
                                } else if (arg11.method1776(arg9, arg3, var13, arg10, arg6, 17761, arg0, var12)) {
                                    class378.field5253 = var13;
                                    class301.field4076 = var12;
                                    return true;
                                }
                                var26 = class525.field7061[var21][var22] + 1;
                                if (var21 > 0 && class244.field3173[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg0 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= (arg0 - 1)) {
                                            class43.field472[var35] = var12 - 1;
                                            class386.field5451[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class244.field3173[var21 - 1][var22] = 2;
                                            class525.field7061[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var21 < 128 - arg0 && class244.field3173[var21 + 1][var22] == 0 && (var20[var23 + arg0][var24] & 0x60E40000) == 0 && (var20[var23 + arg0][arg0 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg0 - 1 <= var28) {
                                            class43.field472[var35] = var12 + 1;
                                            class386.field5451[var35] = var13;
                                            class244.field3173[var21 + 1][var22] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class525.field7061[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg0 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class244.field3173[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg0 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg0 - 1) {
                                            class43.field472[var35] = var12;
                                            class386.field5451[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class244.field3173[var21][var22 - 1] = 1;
                                            class525.field7061[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 < 128 - arg0 && class244.field3173[var21][var22 + 1] == 0 && (var20[var23][var24 + arg0] & 0x4E240000) == 0 && (var20[var23 - (1 - arg0)][var24 + arg0] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg0 - 1)) {
                                            class43.field472[var35] = var12;
                                            class386.field5451[var35] = var13 + 1;
                                            class244.field3173[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class525.field7061[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg0 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class244.field3173[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg0) {
                                            class43.field472[var35] = var12 - 1;
                                            class386.field5451[var35] = var13 - 1;
                                            class244.field3173[var21 - 1][var22 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class525.field7061[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var21 < (128 - arg0) && var22 > 0 && class244.field3173[var21 + 1][var22 - 1] == 0 && (var20[arg0 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg0) {
                                            class43.field472[var35] = var12 + 1;
                                            class386.field5451[var35] = var13 - 1;
                                            class244.field3173[var21 + 1][var22 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class525.field7061[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg0][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && (128 - arg0) > var22 && class244.field3173[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg0 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg0; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var33 + var23 - 1][arg0 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class43.field472[var35] = var12 - 1;
                                    class386.field5451[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class244.field3173[var21 - 1][var22 + 1] = 6;
                                    class525.field7061[var21 - 1][var22 + 1] = var26;
                                }
                            } while ((128 - arg0) <= var21);
                        } while (var22 >= (128 - arg0));
                    } while (class244.field3173[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg0 + var23][arg0 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg0; var34++) {
                    if ((var20[var23 + var34][arg0 + var24] & 0x7E240000) != 0 || (var20[arg0 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class43.field472[var35] = var12 + 1;
                class386.field5451[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class244.field3173[var21 + 1][var22 + 1] = 12;
                class525.field7061[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 787)
    public class294(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field3936 = arg6;
        this.field3946 = arg0;
        this.field3933 = arg2;
        this.field3934 = arg3;
        this.field3951 = arg1;
        this.field3957 = arg5;
        this.field3945 = arg4;
        if (this.field3936 == 255) {
            this.field3936 = 0;
        }
        this.field3939 = new class108();
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)V", line = 581)
    public final void method1758(int arg0) {
        this.field3938 = 12800;
        this.field3960 = 0;
        this.field3937 = 12800;
        field3952++;
        this.field3948 = 0;
        if (arg0 != -1) {
            this.method1753(71, -12, 111);
        }
        for (class317 var2 = (class317) this.field3939.method724(32); var2 != null; var2 = (class317) this.field3939.method723(117)) {
            if (this.field3948 < var2.field4261) {
                this.field3948 = var2.field4261;
            }
            if (this.field3937 > var2.field4262) {
                this.field3937 = var2.field4262;
            }
            if (this.field3938 > var2.field4270) {
                this.field3938 = var2.field4270;
            }
            if (var2.field4273 > this.field3960) {
                this.field3960 = var2.field4273;
            }
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(BI[II)Z", line = 617)
    public final boolean method1759(byte arg0, int arg1, int[] arg2, int arg3) {
        field3949++;
        int var5 = 91 / ((32 - arg0) / 60);
        for (class317 var6 = (class317) this.field3939.method724(32); var6 != null; var6 = (class317) this.field3939.method723(109)) {
            if (var6.method1897(-96, arg3, arg1)) {
                var6.method1899(arg1, arg3, 88, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "([BB)[B", line = 641)
    public static final byte[] method1760(byte[] arg0, byte arg1) {
        if (arg1 != -84) {
            method1756((byte) 87);
        }
        field3950++;
        class611 var2 = new class611(arg0);
        int var3 = var2.method3428((byte) -103);
        int var4 = var2.method3418(-2);
        if (var4 < 0 || class168.field2106 != 0 && var4 > class168.field2106) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method3389(var5, true, var4, 0);
            return var5;
        } else {
            int var6 = var2.method3418(-2);
            if (var6 < 0 || class168.field2106 != 0 && var6 > class168.field2106) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class453.method2532(var7, var6, arg0, var4, 9);
            } else {
                class105 var8 = class705.field9887;
                synchronized (class705.field9887) {
                    class705.field9887.method715(var7, var2, 18762);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(III)V", line = 704)
    public static final void method1761(int arg0, int arg1, int arg2) {
        if (arg1 == 30585) {
            field3943++;
            class252 var3 = class150.method916(arg0, -40, 16);
            var3.method1502((byte) -103);
            var3.field3251 = arg2;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I[IIII)Z", line = 754)
    public final boolean method1762(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= -80) {
            method1754(31, -45, true, -110, 4, -16, -41, 5, -2);
        }
        field3944++;
        for (class317 var6 = (class317) this.field3939.method724(32); var6 != null; var6 = (class317) this.field3939.method723(103)) {
            if (var6.method1893(arg3, 113, arg4, arg0)) {
                var6.method1899(arg3, arg4, 94, arg1);
                return true;
            }
        }
        return false;
    }
}
