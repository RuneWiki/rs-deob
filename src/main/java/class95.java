import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class95 extends class270 {

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field1337 = 0;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lrc;")
    public static class108 field1332 = new class108(60, 5);

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "F")
    public static float field1340 = 0.0F;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "F")
    public static float field1338;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "Lnl;")
    public static class435 field1333;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "Lnl;")
    public static class435 field1342;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "Loo;")
    public static class9 field1341;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uh", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field1343;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "[I")
    public static int[] field1339;

    // $FF: synthetic method
    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method795(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIII)I", line = 3)
    public static final int method792(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg6 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg2;
            arg2 = var7;
        }
        field1334++;
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg0;
        }
        int var9 = 117 % ((arg3 + 62) / 57);
        if (var8 == 1) {
            return 1 + 7 - arg5 - arg1;
        } else if (var8 == 2) {
            return 7 - (arg0 + arg2 - 1);
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIBIII)V", line = 32)
    public static final void method793(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 != -49) {
            return;
        }
        field1335++;
        if (arg1 < 0 || arg2 < 0 || (class36.field388 - 1) <= arg1 || arg2 >= (class68.field998 - 1)) {
            return;
        }
        if (class385.field5285 == null) {
            return;
        }
        if (arg6 != 0) {
            if (arg6 == 1) {
                class210 var8 = (class210) class418.method2504(arg3, arg1, arg2);
                if (var8 != null) {
                    if (var8 instanceof class97) {
                        ((class97) var8).field1369.method2280(arg7, (byte) -123);
                        return;
                    }
                    int var9 = var8.method80(10143);
                    if (arg5 != 4 && arg5 != 5) {
                        if (arg5 == 6) {
                            class7.method40(false, arg6, var9, arg3, arg0 + 4, arg7, arg1, arg2, 4);
                            return;
                        }
                        if (arg5 == 7) {
                            class7.method40(false, arg6, var9, arg3, (arg0 + 2 & 0x3) + 4, arg7, arg1, arg2, 4);
                        } else if (arg5 == 8) {
                            class7.method40(false, arg6, var9, arg3, arg0 + 4, arg7, arg1, arg2, 4);
                            class7.method40(false, arg6, var9, arg3, (arg0 + 2 & 0x3) + 4, arg7, arg1, arg2, 4);
                            return;
                        }
                        return;
                    }
                    class7.method40(false, arg6, var9, arg3, arg0, arg7, arg1, arg2, 4);
                    return;
                }
            } else if (arg6 == 2) {
                class210 var10 = (class210) class106.method847(arg3, arg1, arg2, field1343 == null ? (field1343 = method795("dc")) : field1343);
                if (var10 != null) {
                    if (arg5 == 11) {
                        arg5 = 10;
                    }
                    if (!(var10 instanceof class111)) {
                        class7.method40(false, arg6, var10.method80(arg4 + 10192), arg3, arg0, arg7, arg1, arg2, arg5);
                        return;
                    }
                    ((class111) var10).field1553.method2280(arg7, (byte) -127);
                    return;
                }
            } else if (arg6 == 3) {
                class210 var11 = (class210) class86.method730(arg3, arg1, arg2);
                if (var11 == null) {
                    return;
                }
                if (var11 instanceof class466) {
                    ((class466) var11).field6567.method2280(arg7, (byte) -102);
                    return;
                }
                class7.method40(false, arg6, var11.method80(10143), arg3, arg0, arg7, arg1, arg2, arg5);
            } else {
                return;
            }
            return;
        }
        class210 var12 = (class210) class133.method991(arg3, arg1, arg2);
        class210 var13 = (class210) class389.method2359(arg3, arg1, arg2);
        if (var12 != null && arg5 != 2) {
            if (var12 instanceof class345) {
                ((class345) var12).field4773.method2280(arg7, (byte) -108);
            } else {
                class7.method40(false, arg6, var12.method80(10143), arg3, arg0, arg7, arg1, arg2, arg5);
            }
        }
        if (var13 == null) {
            return;
        }
        if (!(var13 instanceof class345)) {
            class7.method40(false, arg6, var13.method80(10143), arg3, arg0, arg7, arg1, arg2, arg5);
            return;
        }
        ((class345) var13).field4773.method2280(arg7, (byte) -109);
        return;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V", line = 165)
    public static void method794(byte arg0) {
        field1342 = null;
        if (arg0 > 0) {
            field1340 = -0.63548416F;
        }
        field1339 = null;
        field1333 = null;
        field1341 = null;
        field1332 = null;
    }
}
