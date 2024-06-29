import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class555 implements class234 {

    @OriginalMember(owner = "client!sba", name = "g", descriptor = "Ljava/lang/String;")
    private String field7913;

    @OriginalMember(owner = "client!sba", name = "i", descriptor = "[I")
    public static int[] field7915 = new int[2];

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "I")
    public static int field7907;

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "I")
    public static int field7908;

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "I")
    public static int field7911;

    @OriginalMember(owner = "client!sba", name = "f", descriptor = "I")
    public static int field7912;

    @OriginalMember(owner = "client!sba", name = "h", descriptor = "I")
    public static int field7914;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sba", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field7916;

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "Ljava/lang/String;")
    public static String field7910;

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "Z")
    private boolean field7909;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)I")
    public final int method1161(byte arg0) {
        if (arg0 != 123) {
            return 33;
        }
        field7908++;
        int var2 = class328.method2120(arg0 + 1, this.field7913);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field7909 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Z)Loi;")
    public final class696 method1156(boolean arg0) {
        field7914++;
        return arg0 ? class696.field9869 : null;
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class555(String arg0) {
        this.field7913 = arg0;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lht;I)I")
    public static final int method3234(class393 arg0, int arg1) {
        field7907++;
        if (class750.field10454 == arg0) {
            return 7681;
        } else if (class333.field4884 == arg0) {
            return 8448;
        } else if (class107.field1555 == arg0) {
            return 34165;
        } else if (class200.field3408 == arg0) {
            return 260;
        } else if (class570.field8091 == arg0) {
            return 34023;
        } else {
            if (arg1 != 0) {
                method3234(null, -115);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lha;IIIIIIII)V")
    public static final void method3235(class544 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field7912++;
        if (arg8 != 28937) {
            return;
        }
        class523 var9 = (class523) class486.method2948(arg7, arg6, arg2);
        if (var9 != null) {
            class595 var10 = class576.field8167.method3074(0, var9.method87(2836));
            int var11 = var9.method98(arg8 - 41131) & 0x3;
            int var12 = var9.method85((byte) -72);
            if (var10.field8444 == -1) {
                int var13 = arg4;
                if (var10.field8426 > 0) {
                    var13 = arg5;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg0.method3194(-21151, arg3, arg1, var13, 4);
                    } else if (var11 == 1) {
                        arg0.method3188(4, var13, arg3, (byte) 117, arg1);
                    } else if (var11 == 2) {
                        arg0.method3194(-21151, arg3, arg1 + 3, var13, 4);
                    } else if (var11 == 3) {
                        arg0.method3188(4, var13, arg3 + 3, (byte) 39, arg1);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg0.method3183(1, 1, var13, arg3, -120, arg1);
                    } else if (var11 == 1) {
                        arg0.method3183(1, 1, var13, arg3, arg8 ^ 0xFFFF8E84, arg1 + 3);
                    } else if (var11 == 2) {
                        arg0.method3183(1, 1, var13, arg3 + 3, arg8 ^ 0x7176, arg1 + 3);
                    } else if (var11 == 3) {
                        arg0.method3183(1, 1, var13, arg3 + 3, -106, arg1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg0.method3188(4, var13, arg3, (byte) 42, arg1);
                    } else if (var11 == 1) {
                        arg0.method3194(-21151, arg3, arg1 + 3, var13, 4);
                    } else if (var11 == 2) {
                        arg0.method3188(4, var13, arg3 + 3, (byte) -118, arg1);
                    } else if (var11 == 3) {
                        arg0.method3194(arg8 ^ 0xFFFFDC68, arg3, arg1, var13, 4);
                    }
                }
            } else {
                class157.method1175(var11, arg0, arg3, arg1, var10, 1);
            }
        }
        class523 var14 = (class523) class140.method1093(arg7, arg6, arg2, field7916 == null ? (field7916 = method3238("tw")) : field7916);
        if (var14 != null) {
            class595 var15 = class576.field8167.method3074(arg8 - 28937, var14.method87(2836));
            int var16 = var14.method98(-12194) & 0x3;
            int var17 = var14.method85((byte) -72);
            if (var15.field8444 != -1) {
                class157.method1175(var16, arg0, arg3, arg1, var15, arg8 ^ 0x7108);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field8426 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg0.method3187(arg3 + 3, arg1 + 3, arg1, var18, 103, arg3);
                } else {
                    arg0.method3187(arg3, arg1 + 3, arg1, var18, arg8 ^ 0x7178, arg3 + 3);
                }
            }
        }
        class523 var19 = (class523) class558.method3243(arg7, arg6, arg2);
        if (var19 == null) {
            return;
        }
        class595 var20 = class576.field8167.method3074(arg8 ^ 0x7109, var19.method87(2836));
        int var21 = var19.method98(-12194) & 0x3;
        if (var20.field8444 != -1) {
            class157.method1175(var21, arg0, arg3, arg1, var20, arg8 - 28936);
            return;
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)Z")
    public final boolean method3236(int arg0) {
        int var2 = -49 / ((22 - arg0) / 53);
        field7911++;
        return this.field7909;
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)V")
    public static void method3237(int arg0) {
        if (arg0 < 11) {
            method3235(null, -39, 122, 105, 51, 40, 69, 122, 80);
        }
        field7915 = null;
        field7910 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3238(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
