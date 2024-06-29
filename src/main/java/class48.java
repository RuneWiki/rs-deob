import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class48 {

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Z")
    public static boolean field732 = true;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "[I")
    public static int[] field731 = new int[32];

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field743 = 0;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "[I")
    public static int[] field744;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "Lpr;")
    public static class258 field736;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Lqj;")
    public static class296 field733;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rf", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field745;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "[I")
    public static int[] field735;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)I")
    public static final int method334(int arg0, int arg1, int arg2) {
        field742++;
        if (arg0 > arg2) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        if (arg1 > -5) {
            return -101;
        }
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != -17044) {
            method341(-71);
        }
        field737++;
        if (arg1 < 0 || arg3 < 0 || class432.field6220 - 1 <= arg1 || arg3 >= class267.field3646 - 1) {
            return;
        }
        if (class5.field79 == null) {
            return;
        }
        if (arg5 == 0) {
            class161 var8 = (class161) class57.method381(arg4, arg1, arg3);
            class161 var9 = (class161) class312.method1973(arg4, arg1, arg3);
            if (var8 != null && arg2 != 2) {
                if ((var8 instanceof class20)) {
                    ((class20) var8).field261.method2741(arg0, (byte) 98);
                } else {
                    class190.method1256(arg1, var8.method126(-13482), arg0, arg3, 2, arg7, arg5, arg2, arg4);
                }
            }
            if (var9 != null) {
                if (!(var9 instanceof class20)) {
                    class190.method1256(arg1, var9.method126(-13482), arg0, arg3, 2, arg7, arg5, arg2, arg4);
                    return;
                }
                ((class20) var9).field261.method2741(arg0, (byte) 103);
                return;
            }
            return;
        }
        if (arg5 != 1) {
            if (arg5 == 2) {
                class161 var11 = (class161) class32.method245(arg4, arg1, arg3, field745 == null ? (field745 = method342("tr")) : field745);
                if (var11 == null) {
                    return;
                }
                if (arg2 == 11) {
                    arg2 = 10;
                }
                if (!(var11 instanceof class278)) {
                    class190.method1256(arg1, var11.method126(-13482), arg0, arg3, 2, arg7, arg5, arg2, arg4);
                    return;
                }
                ((class278) var11).field3760.method2741(arg0, (byte) 95);
            } else if (arg5 == 3) {
                class161 var10 = (class161) class207.method1350(arg4, arg1, arg3);
                if (var10 != null) {
                    if (var10 instanceof class429) {
                        ((class429) var10).field6175.method2741(arg0, (byte) 103);
                        return;
                    }
                    class190.method1256(arg1, var10.method126(arg6 + 3562), arg0, arg3, 2, arg7, arg5, arg2, arg4);
                    return;
                }
            }
            return;
        }
        class161 var12 = (class161) class3.method13(arg4, arg1, arg3);
        if (var12 == null) {
            return;
        }
        if (!(var12 instanceof class155)) {
            int var13 = var12.method126(-13482);
            if (arg2 != 4 && arg2 != 5) {
                if (arg2 != 6) {
                    if (arg2 == 7) {
                        class190.method1256(arg1, var13, arg0, arg3, arg6 ^ 0xFFFFBD6E, (arg7 + 2 & 0x3) + 4, arg5, 4, arg4);
                    } else if (arg2 == 8) {
                        class190.method1256(arg1, var13, arg0, arg3, 2, arg7 + 4, arg5, 4, arg4);
                        class190.method1256(arg1, var13, arg0, arg3, arg6 ^ 0xFFFFBD6E, (arg7 + 2 & 0x3) + 4, arg5, 4, arg4);
                        return;
                    }
                    return;
                }
                class190.method1256(arg1, var13, arg0, arg3, arg6 + 17046, arg7 + 4, arg5, 4, arg4);
                return;
            }
            class190.method1256(arg1, var13, arg0, arg3, 2, arg7, arg5, 4, arg4);
            return;
        }
        ((class155) var12).field2184.method2741(arg0, (byte) 125);
        return;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static final void method336(byte arg0) {
        if (arg0 <= 40) {
            method340();
        }
        field741++;
        for (int var1 = -1; var1 < class169.field2407; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class67.field1055[var1];
            }
            class354 var3 = class12.field153[var2];
            if (var3 != null) {
                class262.method1614(var3, true, var3.method410((byte) 59));
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([III)[I")
    public static final int[] method337(int[] arg0, int arg1, int arg2) {
        field730++;
        int[] var3 = new int[1152];
        int var4 = 88 / ((-arg2 - 32) / 63);
        int var5 = 0;
        for (int var6 = 0; var6 < 32; var6++) {
            for (int var7 = 0; var7 < 36; var7++) {
                int var8 = arg0[var5];
                if (var8 == 0) {
                    if (var7 > 0 && arg0[var5 - 1] != 0) {
                        var8 = arg1;
                    } else if (var6 > 0 && arg0[var5 - 36] != 0) {
                        var8 = arg1;
                    } else if (var7 < 35 && arg0[var5 + 1] != 0) {
                        var8 = arg1;
                    } else if (var6 < 31 && arg0[var5 + 36] != 0) {
                        var8 = arg1;
                    }
                }
                var3[var5++] = var8;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V")
    public static final void method338(byte arg0) {
        class357[] var1 = class327.field4463;
        synchronized (class327.field4463) {
            for (int var2 = 0; var2 < class327.field4463.length; var2++) {
                class327.field4463[var2] = new class357();
                class180.field2519[var2] = 0;
            }
            if (arg0 != 83) {
                method338((byte) -33);
            }
        }
        field740++;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)Z")
    public static final boolean method339(boolean arg0) {
        field739++;
        if (!arg0) {
            method336((byte) -83);
        }
        return class399.field5832 == 0 ? class225.field3024.method212((byte) -89) : true;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()V")
    public static final void method340() {
        for (int var0 = 0; var0 < class170.field2426; var0++) {
            class430 var1 = class327.field4469[var0];
            class442.method2765(var1);
            class327.field4469[var0] = null;
        }
        class170.field2426 = 0;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static void method341(int arg0) {
        if (arg0 >= -119) {
            method337((int[]) null, 115, 89);
        }
        field733 = null;
        field744 = null;
        field735 = null;
        field731 = null;
        field736 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method342(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field731[var1] = var0 - 1;
            var0 += var0;
        }
        field744 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };
    }
}
