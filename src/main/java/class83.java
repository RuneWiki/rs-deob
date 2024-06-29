import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class83 {

    @OriginalMember(owner = "client!d", name = "b", descriptor = "[I")
    public static int[] field932 = new int[50];

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Lfi;")
    public static class331 field936 = new class331(32);

    @OriginalMember(owner = "client!d", name = "g", descriptor = "[S")
    public static short[] field937 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public int field931;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public int field938;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field939;

    // $FF: synthetic method
    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method457(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BIIIIIII)V", line = 7)
    public static final void method454(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field935++;
        if (arg4 >= 0 && arg1 >= 0 && (class279.field3935 - 1) > arg4 && arg1 < class164.field2287 - 1) {
            if (class19.field202 == null) {
                return;
            }
            if (arg3 == 0) {
                class265 var12 = (class265) class204.method1300(arg6, arg4, arg1);
                class265 var13 = (class265) class122.method692(arg6, arg4, arg1);
                if (var12 != null && arg5 != 2) {
                    if ((var12 instanceof class438)) {
                        ((class438) var12).field6429.method2252(arg0 ^ 0xFFFFFFE9, arg7);
                    } else {
                        class78.method440(arg6, (byte) -28, arg7, arg3, arg4, arg2, arg1, arg5, var12.method225(95));
                    }
                }
                if (var13 != null) {
                    if (var13 instanceof class438) {
                        ((class438) var13).field6429.method2252(arg0 - 114, arg7);
                    } else {
                        class78.method440(arg6, (byte) -28, arg7, arg3, arg4, arg2, arg1, arg5, var13.method225(98));
                    }
                }
            } else if (arg3 == 1) {
                class265 var10 = (class265) class338.method2176(arg6, arg4, arg1);
                if (var10 != null) {
                    if (var10 instanceof class75) {
                        ((class75) var10).field829.method2252(-117, arg7);
                    } else {
                        int var11 = var10.method225(67);
                        if (arg5 == 4 || arg5 == 5) {
                            class78.method440(arg6, (byte) -28, arg7, arg3, arg4, arg2, arg1, 4, var11);
                        } else if (arg5 == 6) {
                            class78.method440(arg6, (byte) -28, arg7, arg3, arg4, arg2 + 4, arg1, 4, var11);
                        } else if (arg5 == 7) {
                            class78.method440(arg6, (byte) -28, arg7, arg3, arg4, (arg2 + 2 & 0x3) + 4, arg1, 4, var11);
                        } else if (arg5 == 8) {
                            class78.method440(arg6, (byte) -28, arg7, arg3, arg4, arg2 + 4, arg1, 4, var11);
                            class78.method440(arg6, (byte) -28, arg7, arg3, arg4, (arg2 + 2 & 0x3) + 4, arg1, 4, var11);
                        }
                    }
                }
            } else if (arg3 == 2) {
                class265 var9 = (class265) class310.method1944(arg6, arg4, arg1, field939 == null ? (field939 = method457("sl")) : field939);
                if (var9 != null) {
                    if (arg5 == 11) {
                        arg5 = 10;
                    }
                    if (var9 instanceof class37) {
                        ((class37) var9).field368.method2252(-118, arg7);
                    } else {
                        class78.method440(arg6, (byte) -28, arg7, arg3, arg4, arg2, arg1, arg5, var9.method225(102));
                    }
                }
            } else if (arg3 == 3) {
                class265 var8 = (class265) class122.method689(arg6, arg4, arg1);
                if (var8 != null) {
                    if ((var8 instanceof class323)) {
                        ((class323) var8).field4560.method2252(arg0 - 158, arg7);
                    } else {
                        class78.method440(arg6, (byte) -28, arg7, arg3, arg4, arg2, arg1, arg5, var8.method225(123));
                    }
                }
            }
        }
        if (arg0 != 60) {
            method454((byte) -107, 113, 36, -12, -105, 24, -100, 102);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V", line = 131)
    public static void method455(int arg0) {
        field932 = null;
        field937 = null;
        if (arg0 != -21776) {
            method454((byte) -5, 100, 42, -102, 84, 107, 99, -67);
        }
        field936 = null;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V", line = 151)
    public static final void method456(int arg0) {
        class329.field4710 = arg0;
        for (int var1 = 0; var1 < class158.field2245; var1++) {
            for (int var2 = 0; var2 < class52.field598; var2++) {
                if (class19.field202[arg0][var1][var2] == null) {
                    class19.field202[arg0][var1][var2] = new class302(arg0, var1, var2);
                }
            }
        }
    }
}
