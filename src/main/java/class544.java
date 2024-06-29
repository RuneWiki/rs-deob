import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class544 extends class356 {

    @OriginalMember(owner = "client!eba", name = "t", descriptor = "I")
    public static int field7651 = 503;

    @OriginalMember(owner = "client!eba", name = "F", descriptor = "Z")
    public static boolean field7663 = false;

    @OriginalMember(owner = "client!eba", name = "r", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!eba", name = "s", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!eba", name = "u", descriptor = "I")
    public int field7652;

    @OriginalMember(owner = "client!eba", name = "v", descriptor = "I")
    public int field7653;

    @OriginalMember(owner = "client!eba", name = "w", descriptor = "I")
    public int field7654;

    @OriginalMember(owner = "client!eba", name = "x", descriptor = "I")
    public static int field7655;

    @OriginalMember(owner = "client!eba", name = "z", descriptor = "I")
    public int field7657;

    @OriginalMember(owner = "client!eba", name = "A", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!eba", name = "B", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!eba", name = "D", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!eba", name = "E", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!eba", name = "G", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!eba", name = "q", descriptor = "J")
    public long field7648;

    @OriginalMember(owner = "client!eba", name = "y", descriptor = "Lpu;")
    public static class522 field7656;

    // $FF: synthetic field
    @OriginalMember(owner = "client!eba", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field7665;

    @OriginalMember(owner = "client!eba", name = "C", descriptor = "[[B")
    public static byte[][] field7660;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)V")
    public static void method3082(int arg0) {
        if (arg0 != 22260) {
            method3083(null, 30, -89, 26, -56, -43, 22, -51, 50);
        }
        field7656 = null;
        field7660 = null;
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(B)I")
    public final int method1029(byte arg0) {
        field7650++;
        return arg0 < 16 ? 0 : this.field7657;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lr;IIIIIIII)V")
    public static final void method3083(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field7655++;
        class614 var9 = (class614) class149.method1061(arg2, arg4, arg3);
        if (var9 != null) {
            class550 var10 = class101.field1572.method2617((byte) -95, var9.method1179(true));
            int var11 = var9.method1175(arg7 + 24560) & 0x3;
            int var12 = var9.method1186(-9960);
            if (var10.field7792 == -1) {
                int var13 = arg6;
                if (var10.field7746 > 0) {
                    var13 = arg8;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg0.method1155(4, 8, arg1, arg5, var13);
                    } else if (var11 == 1) {
                        arg0.method1147(-28854, arg5, var13, arg1, 4);
                    } else if (var11 == 2) {
                        arg0.method1155(4, 8, arg1 + 3, arg5, var13);
                    } else if (var11 == 3) {
                        arg0.method1147(-28854, arg5 + 3, var13, arg1, 4);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg0.method1150(1, arg5, arg1, -1, var13, 1);
                    } else if (var11 == 1) {
                        arg0.method1150(1, arg5, arg1 + 3, -1, var13, 1);
                    } else if (var11 == 2) {
                        arg0.method1150(1, arg5 + 3, arg1 + 3, arg7 ^ 0xFFFFFFFC, var13, 1);
                    } else if (var11 == 3) {
                        arg0.method1150(1, arg5 + 3, arg1, -1, var13, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg0.method1147(arg7 - 28857, arg5, var13, arg1, 4);
                    } else if (var11 == 1) {
                        arg0.method1155(4, arg7 ^ 0xB, arg1 + 3, arg5, var13);
                    } else if (var11 == 2) {
                        arg0.method1147(-28854, arg5 + 3, var13, arg1, 4);
                    } else if (var11 == 3) {
                        arg0.method1155(4, 8, arg1, arg5, var13);
                    }
                }
            } else {
                class75.method707(arg0, (byte) 85, arg1, arg5, var10, var11);
            }
        }
        class614 var14 = (class614) class349.method2155(arg2, arg4, arg3, field7665 == null ? (field7665 = method3085("rda")) : field7665);
        if (var14 != null) {
            class550 var15 = class101.field1572.method2617((byte) -120, var14.method1179(true));
            int var16 = var14.method1175(24563) & 0x3;
            int var17 = var14.method1186(-9960);
            if (var15.field7792 != -1) {
                class75.method707(arg0, (byte) 85, arg1, arg5, var15, var16);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field7746 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg0.method1151(arg1, arg5, var18, arg5 + 3, (byte) -125, arg1 + 3);
                } else {
                    arg0.method1151(arg1, arg5 + 3, var18, arg5, (byte) -108, arg1 + 3);
                }
            }
        }
        class614 var19 = (class614) class124.method946(arg2, arg4, arg3);
        if (var19 != null) {
            class550 var20 = class101.field1572.method2617((byte) -113, var19.method1179(true));
            int var21 = var19.method1175(arg7 ^ 0x5FF0) & 0x3;
            if (var20.field7792 != -1) {
                class75.method707(arg0, (byte) 85, arg1, arg5, var20, var21);
            }
        }
        if (arg7 != 3) {
            field7651 = 67;
        }
    }

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "(B)I")
    public final int method1032(byte arg0) {
        field7649++;
        return arg0 == 15 ? this.field7654 : 43;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)I")
    public final int method1030(int arg0) {
        field7659++;
        if (arg0 < 91) {
            this.method1030(-12);
        }
        return this.field7652;
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(Z)J")
    public final long method1028(boolean arg0) {
        field7658++;
        return arg0 ? 22L : this.field7648;
    }

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "(B)I")
    public final int method1031(byte arg0) {
        int var2 = -17 % ((17 - arg0) / 46);
        field7661++;
        return this.field7653;
    }

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "(B)I")
    public static final int method3084(byte arg0) {
        field7664++;
        if (arg0 != 69) {
            field7660 = null;
        }
        return class262.field3976;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3085(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
