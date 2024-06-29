import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class400 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "B")
    private byte field5655;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public int field5667;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public int field5664;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public int field5657;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public int field5662;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public int field5663;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Lpca;")
    public static class714 field5659 = new class714(64);

    @OriginalMember(owner = "client!df", name = "l", descriptor = "Lkk;")
    public static class188 field5666 = new class188(4);

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "[Lge;")
    public static class708[] field5668;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I", line = 3)
    public final int method2497(int arg0) {
        int var2 = 28 / ((77 - arg0) / 47);
        field5656++;
        return (this.field5655 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V", line = 15)
    public static void method2498(int arg0) {
        if (arg0 != -1) {
            field5668 = null;
        }
        field5666 = null;
        field5668 = null;
        field5659 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIBZZ)V", line = 27)
    public static final void method2499(int arg0, int arg1, byte arg2, boolean arg3, boolean arg4) {
        class20.method123(arg0, arg1, 28048, arg3, class315.field4364.length - 1, arg4, 0);
        field5658++;
        class408.field5786 = 0;
        if (arg2 <= 52) {
            method2498(39);
        }
        class740.field10286 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([BILfha;I)Lpl;", line = 43)
    public static final class649 method2500(byte[] arg0, int arg1, class378 arg2, int arg3) {
        field5665++;
        if (arg3 != 1625554944) {
            field5659 = null;
        }
        if (arg0 == null || arg0.length == 0) {
            return null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceRawARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class464.field6561, 0);
        if (class464.field6561[0] == 0) {
            if (class464.field6561[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class464.field6561, 1);
            if (class464.field6561[1] > 1) {
                byte[] var6 = new byte[class464.field6561[1]];
                OpenGL.glGetInfoLogARB(var4, class464.field6561[1], class464.field6561, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class464.field6561[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class649(arg2, var4, arg1);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Luu;IIIIIIIIIII)Z", line = 87)
    public static final boolean method2501(class285 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field5660++;
        int var12 = arg7;
        int var13 = arg5;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg7 - var14;
        int var17 = arg5 - var15;
        class584.field8220[var14][var15] = 99;
        class207.field2722[var14][var15] = 0;
        byte var18 = 0;
        int var19 = arg9;
        class584.field8223[var18] = arg7;
        int var35 = var18 + 1;
        class538.field7549[var18] = arg5;
        int[][] var20 = arg0.field4035;
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
                                    class102.field1217 = var13;
                                    class721.field10007 = var12;
                                    return false;
                                }
                                var13 = class538.field7549[var19];
                                var12 = class584.field8223[var19];
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg0.field4046;
                                var24 = var13 - arg0.field4041;
                                if (arg4 == -4) {
                                    if (arg8 == var12 && arg10 == var13) {
                                        class102.field1217 = var13;
                                        class721.field10007 = var12;
                                        return true;
                                    }
                                } else if (arg4 == -3) {
                                    if (class427.method2601(arg2, arg8, arg3, var13, arg1, true, arg3, var12, arg10)) {
                                        class102.field1217 = var13;
                                        class721.field10007 = var12;
                                        return true;
                                    }
                                } else if (arg4 == -2) {
                                    if (arg0.method1866(arg1, arg2, arg3, var13, arg8, -1, arg3, arg10, arg6, var12)) {
                                        class102.field1217 = var13;
                                        class721.field10007 = var12;
                                        return true;
                                    }
                                } else if (arg4 == -1) {
                                    if (arg0.method1865(var12, arg1, arg2, var13, arg10, arg3, arg8, arg6, false)) {
                                        class721.field10007 = var12;
                                        class102.field1217 = var13;
                                        return true;
                                    }
                                } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                                    if (arg0.method1872(var12, var13, arg8, arg3, arg4, arg10, arg11, arg9 - 1)) {
                                        class721.field10007 = var12;
                                        class102.field1217 = var13;
                                        return true;
                                    }
                                } else if (arg0.method1869(arg10, arg8, arg11, var12, var13, (byte) 100, arg4, arg3)) {
                                    class102.field1217 = var13;
                                    class721.field10007 = var12;
                                    return true;
                                }
                                var26 = class207.field2722[var22][var21] + 1;
                                if (var22 > 0 && class584.field8220[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg3 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (arg3 - 1 <= var27) {
                                            class584.field8223[var35] = var12 - 1;
                                            class538.field7549[var35] = var13;
                                            class584.field8220[var22 - 1][var21] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class207.field2722[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var22 < 128 - arg3 && class584.field8220[var22 + 1][var21] == 0 && (var20[arg3 + var23][var24] & 0x60E40000) == 0 && (var20[arg3 + var23][arg3 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= (arg3 - 1)) {
                                            class584.field8223[var35] = var12 + 1;
                                            class538.field7549[var35] = var13;
                                            class584.field8220[var22 + 1][var21] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class207.field2722[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg3][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class584.field8220[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg3 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg3 - 1) {
                                            class584.field8223[var35] = var12;
                                            class538.field7549[var35] = var13 - 1;
                                            class584.field8220[var22][var21 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class207.field2722[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if ((128 - arg3) > var21 && class584.field8220[var22][var21 + 1] == 0 && (var20[var23][arg3 + var24] & 0x4E240000) == 0 && (var20[var23 + arg3 - 1][var24 + arg3] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg3 - 1)) {
                                            class584.field8223[var35] = var12;
                                            class538.field7549[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class584.field8220[var22][var21 + 1] = 4;
                                            class207.field2722[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg3 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class584.field8220[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg3) {
                                            class584.field8223[var35] = var12 - 1;
                                            class538.field7549[var35] = var13 - 1;
                                            class584.field8220[var22 - 1][var21 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class207.field2722[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 - (1 - var31)] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 < (128 - arg3) && var21 > 0 && class584.field8220[var22 + 1][var21 - 1] == 0 && (var20[arg3 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg3) {
                                            class584.field8223[var35] = var12 + 1;
                                            class538.field7549[var35] = var13 - 1;
                                            class584.field8220[var22 + 1][var21 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class207.field2722[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg3][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < 128 - arg3 && class584.field8220[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg3 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg3; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var33 + var23 - 1][arg3 + var24] & 0x7E240000) != 0) {
                                            continue label259;
                                        }
                                    }
                                    class584.field8223[var35] = var12 - 1;
                                    class538.field7549[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class584.field8220[var22 - 1][var21 + 1] = 6;
                                    class207.field2722[var22 - 1][var21 + 1] = var26;
                                }
                            } while ((128 - arg3) <= var22);
                        } while (var21 >= 128 - arg3);
                    } while (class584.field8220[var22 + 1][var21 + 1] != 0);
                } while ((var20[var23 + arg3][arg3 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg3; var34++) {
                    if ((var20[var23 + var34][var24 + arg3] & 0x7E240000) != 0 || (var20[arg3 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label282;
                    }
                }
                class584.field8223[var35] = var12 + 1;
                class538.field7549[var35] = var13 + 1;
                class584.field8220[var22 + 1][var21 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class207.field2722[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)I", line = 522)
    public final int method2502(int arg0) {
        if (arg0 == 4095) {
            field5661++;
            return this.field5655 & 0x7;
        } else {
            return -9;
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 541)
    public class400() {
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lee;)V", line = 544)
    public class400(class675 arg0) {
        this.field5655 = arg0.method3719(1854307120);
        this.field5667 = arg0.method3757((byte) -65);
        this.field5664 = arg0.method3703(114);
        this.field5657 = arg0.method3703(113);
        this.field5662 = arg0.method3703(120);
        this.field5663 = arg0.method3703(120);
    }
}
