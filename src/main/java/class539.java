import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class539 extends class392 {

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "Lmp;")
    public static class565 field7488 = new class565();

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
    public static int field7490;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mo", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field7491;

    // $FF: synthetic method
    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3129(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(ILw;)V", line = 6)
    public class539(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(Z)V", line = 9)
    public final void method291(boolean arg0) {
        if (arg0) {
            this.method290(-103, -55);
        }
        ++field7483;
        if (super.field5452 < 0 && ~super.field5452 < -5) {
            super.field5452 = this.method292(true);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIIIIILha;I)V", line = 24)
    public static final void method3125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class475 arg7, int arg8) {
        ++field7484;
        class226 var9 = (class226) class133.method1109(arg5, arg2, arg1);
        if (var9 != null) {
            class416 var10 = class312.field4418.method369((byte) 122, var9.method1165((byte) 116));
            int var11 = var9.method1174((byte) -123) & 3;
            int var12 = var9.method1166(-54);
            if (var10.field5775 != -1) {
                class451.method2653(arg7, -96, arg8, var11, var10, arg4);
            } else {
                int var13 = arg3;
                if (~var10.field5754 < -1) {
                    var13 = arg0;
                }
                if (~var12 == -1 || ~var12 == -3) {
                    if (var11 == 0) {
                        arg7.method2774(4, true, arg4, var13, arg8);
                    } else if (var11 != 1) {
                        if (~var11 != -3) {
                            if (var11 == 3) {
                                arg7.method2770(arg8 + 3, 4, arg4, 1, var13);
                            }
                        } else {
                            arg7.method2774(4, true, arg4 + 3, var13, arg8);
                        }
                    } else {
                        arg7.method2770(arg8, 4, arg4, 1, var13);
                    }
                }
                if (~var12 == -4) {
                    if (var11 == 0) {
                        arg7.method2765(arg8, 1, 117, var13, arg4, 1);
                    } else if (var11 == 1) {
                        arg7.method2765(arg8, 1, 127, var13, arg4 + 3, 1);
                    } else if (var11 == 2) {
                        arg7.method2765(arg8 + 3, 1, 100, var13, arg4 - -3, 1);
                    } else if (~var11 == -4) {
                        arg7.method2765(arg8 + 3, 1, arg6 ^ 28269, var13, arg4, 1);
                    }
                }
                if (var12 == 2) {
                    if (~var11 == -1) {
                        arg7.method2770(arg8, 4, arg4, 1, var13);
                    } else if (var11 != 1) {
                        if (var11 != 2) {
                            if (~var11 == -4) {
                                arg7.method2774(4, true, arg4, var13, arg8);
                            }
                        } else {
                            arg7.method2770(arg8 + 3, 4, arg4, arg6 ^ 28215, var13);
                        }
                    } else {
                        arg7.method2774(4, true, arg4 + 3, var13, arg8);
                    }
                }
            }
        }
        class226 var14 = (class226) class608.method3523(arg5, arg2, arg1, field7491 != null ? field7491 : (field7491 = method3129("vu")));
        if (var14 != null) {
            class416 var15 = class312.field4418.method369((byte) 124, var14.method1165((byte) 108));
            int var16 = var14.method1174((byte) -113) & 3;
            int var17 = var14.method1166(arg6 ^ -28256);
            if (~var15.field5775 == 0) {
                if (var17 == 9) {
                    int var18 = -1118482;
                    if (~var15.field5754 < -1) {
                        var18 = -1179648;
                    }
                    if (var16 != 0 && var16 != 2) {
                        arg7.method2769(arg4, var18, arg4 + 3, arg8 + 3, arg8, 7166);
                    } else {
                        arg7.method2769(arg4, var18, arg4 - -3, arg8, arg8 + 3, 7166);
                    }
                }
            } else {
                class451.method2653(arg7, -41, arg8, var16, var15, arg4);
            }
        }
        class226 var19 = (class226) class180.method1311(arg5, arg2, arg1);
        if (arg6 == 28214) {
            if (var19 != null) {
                class416 var20 = class312.field4418.method369((byte) 123, var19.method1165((byte) 101));
                int var21 = 3 & var19.method1174((byte) -128);
                if (var20.field5775 != -1) {
                    class451.method2653(arg7, -88, arg8, var21, var20, arg4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lw;)V", line = 161)
    public class539(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)I", line = 170)
    public final int method3126(int arg0) {
        if (arg0 != 17539) {
            return -2;
        } else {
            ++field7489;
            return super.field5452;
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(IIIIIII)V", line = 181)
    public static final void method3127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7486;
        if (arg6 != 1) {
            method3128(-59);
        }
        int var7 = class645.method3656(class698.field9801, class515.field7102, arg3, arg6 + 26288);
        int var8 = class645.method3656(class698.field9801, class515.field7102, arg0, 26289);
        int var9 = class645.method3656(class435.field6058, class742.field10301, arg5, arg6 ^ 26288);
        int var10 = class645.method3656(class435.field6058, class742.field10301, arg2, arg6 + 26288);
        int var11 = class645.method3656(class698.field9801, class515.field7102, arg1 + arg3, 26289);
        int var12 = class645.method3656(class698.field9801, class515.field7102, -arg1 + arg0, arg6 ^ 26288);
        for (int var13 = var7; var11 > var13; ++var13) {
            class379.method2284(var9, var10, class74.field1144[var13], arg4, 2);
        }
        for (int var14 = var8; var14 > var12; --var14) {
            class379.method2284(var9, var10, class74.field1144[var14], arg4, 2);
        }
        int var15 = class645.method3656(class435.field6058, class742.field10301, arg1 + arg5, 26289);
        int var16 = class645.method3656(class435.field6058, class742.field10301, -arg1 + arg2, 26289);
        for (int var17 = var11; var17 <= var12; ++var17) {
            int[] var18 = class74.field1144[var17];
            class379.method2284(var9, var15, var18, arg4, 2);
            class379.method2284(var16, var10, var18, arg4, 2);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)V", line = 234)
    public final void method286(byte arg0, int arg1) {
        ++field7485;
        int var3 = -96 % ((arg0 - -80) / 38);
        super.field5452 = arg1;
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)V", line = 246)
    public static void method3128(int arg0) {
        field7488 = null;
        if (arg0 != 1) {
            method3125(-40, 62, 49, -52, 34, -37, 73, (class475) null, 97);
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)I", line = 257)
    public final int method290(int arg0, int arg1) {
        if (arg1 > -124) {
            this.method291(true);
        }
        ++field7490;
        return 1;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)I", line = 271)
    public final int method292(boolean arg0) {
        ++field7487;
        if (super.field5454.method3784(21).method4159(-13610) > 1) {
            return 4;
        } else {
            if (!arg0) {
                field7488 = null;
            }
            return 2;
        }
    }
}
