import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class49 {

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public int field714;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public int field715;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public int field718;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public int field719;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public int field722;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field728;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gh", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field730;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "[B")
    public byte[] field716;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "[B")
    public byte[] field729;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "[I")
    public static int[] field724;

    // $FF: synthetic method
    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method338(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 3)
    public static final void method332(int arg0) {
        if (arg0 != 13381) {
            return;
        }
        if (class613.field8724.toLowerCase().indexOf("microsoft") == -1) {
            class62.field837[45] = 26;
            class62.field837[59] = 57;
            class62.field837[93] = 43;
            class62.field837[91] = 42;
            class62.field837[92] = 74;
            class62.field837[44] = 71;
            class62.field837[46] = 72;
            class62.field837[61] = 27;
            if (class613.field8726 == null) {
                class62.field837[222] = 59;
                class62.field837[192] = 58;
            } else {
                class62.field837[192] = 28;
                class62.field837[520] = 59;
                class62.field837[222] = 58;
            }
            class62.field837[47] = 73;
        } else {
            class62.field837[190] = 72;
            class62.field837[219] = 42;
            class62.field837[191] = 73;
            class62.field837[222] = 59;
            class62.field837[223] = 28;
            class62.field837[189] = 26;
            class62.field837[192] = 58;
            class62.field837[188] = 71;
            class62.field837[187] = 27;
            class62.field837[221] = 43;
            class62.field837[186] = 57;
            class62.field837[220] = 74;
        }
        field721++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Z", line = 57)
    public static final boolean method333(byte arg0, String arg1, Class arg2) {
        field726++;
        Class var3 = (Class) class46.field672.get(arg1);
        if (var3 != null) {
            return var3.getClassLoader() == arg2.getClassLoader();
        }
        int var4 = -40 % ((arg0 - 68) / 47);
        File var5 = null;
        if (var5 == null) {
            var5 = (File) class408.field5664.get(arg1);
        }
        if (var5 != null) {
            try {
                var5 = new File(var5.getCanonicalPath());
                Class var6 = Class.forName("java.lang.Runtime");
                Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
                Method var8 = var7.getDeclaredMethod("setAccessible", Boolean.TYPE);
                Method var9 = var6.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                var8.invoke(var9, Boolean.TRUE);
                var9.invoke(Runtime.getRuntime(), arg2, var5.getPath());
                var8.invoke(var9, Boolean.FALSE);
                class46.field672.put(arg1, arg2);
                return true;
            } catch (NoSuchMethodException var10) {
                System.load(var5.getPath());
                class46.field672.put(arg1, field730 == null ? (field730 = method338("cn")) : field730);
                return true;
            } catch (Throwable var11) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)V", line = 130)
    public static final void method334(byte arg0, int arg1) {
        field727++;
        class192 var2 = (class192) class63.field842.method1381(true, (long) arg1);
        if (arg0 <= -51 && var2 != null) {
            var2.field2791.method3849((byte) 22);
            class494.method2956(var2.field2792, (byte) -49, var2.field2789);
            var2.method3065(-17363);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB[I[IIIZLnt;IIIIIII)I", line = 150)
    public static final int method335(int arg0, byte arg1, int[] arg2, int[] arg3, int arg4, int arg5, boolean arg6, class141 arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var36 = 0; var36 < 128; var36++) {
                class757.field10514[var15][var36] = 0;
                class757.field10517[var15][var36] = 99999999;
            }
        }
        field720++;
        boolean var16;
        if (arg11 == 1) {
            var16 = class270.method1646((byte) -40, arg8, arg4, arg0, arg10, arg9, arg14, arg12, arg13, arg5, arg7);
        } else if (arg11 == 2) {
            var16 = class451.method2714(arg7, arg13, arg8, arg9, arg10, arg4, arg14, arg12, arg5, arg0, (byte) -128);
        } else {
            var16 = class45.method304(arg12, arg5, arg7, arg10, arg11, arg8, (byte) 99, arg13, arg9, arg14, arg4, arg0);
        }
        int var17 = arg9 - 64;
        int var18 = arg13 - 64;
        int var19 = class280.field3723;
        int var20 = class670.field9426;
        if (!var16) {
            if (!arg6) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg5 - var23; var24 <= (arg5 + var23); var24++) {
                for (int var25 = arg12 - var23; var25 <= (arg12 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class757.field10517[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg5) {
                            var28 = arg5 - var24;
                        } else if (var24 > arg5 + arg4 - 1) {
                            var28 = var24 - (arg5 - 1) - arg4;
                        }
                        int var29 = 0;
                        if (var25 < arg12) {
                            var29 = arg12 - var25;
                        } else if (var25 > (arg10 + arg12 - 1)) {
                            var29 = 1 - arg10 - (arg12 - var25);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && var22 > class757.field10517[var26][var27]) {
                            var20 = var25;
                            var21 = var30;
                            var19 = var24;
                            var22 = class757.field10517[var26][var27];
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg9 == var19 && arg13 == var20) {
            return 0;
        }
        byte var31 = 0;
        class52.field742[var31] = var19;
        int var38 = var31 + 1;
        class501.field7003[var31] = var20;
        int var32;
        int var33 = var32 = class757.field10514[var19 - var17][var20 - var18];
        while (arg9 != var19 || arg13 != var20) {
            if (var32 != var33) {
                class52.field742[var38] = var19;
                var32 = var33;
                class501.field7003[var38++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class757.field10514[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        int var35 = -69 / ((46 - arg1) / 38);
        while ((var38--) > 0) {
            arg3[var34] = class52.field742[var38];
            arg2[var34++] = class501.field7003[var38];
            if (arg3.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lei;ILei;ZIIZ)I", line = 330)
    public static final int method336(class183 arg0, int arg1, class183 arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        if (arg4 < 16) {
            method335(-123, (byte) 90, null, null, 65, -69, false, null, 30, -54, -59, -13, 73, -100, 108);
        }
        field725++;
        int var7 = class200.method1351(arg2, 82, arg1, arg3, arg0);
        if (var7 != 0) {
            return arg3 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = class200.method1351(arg2, 123, arg5, arg6, arg0);
            return arg6 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V", line = 367)
    public static void method337(byte arg0) {
        field724 = null;
        if (arg0 != -6) {
            field728 = 112;
        }
    }
}
