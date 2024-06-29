import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class398 {

    @OriginalMember(owner = "client!at", name = "u", descriptor = "Lac;")
    public class568 field6307 = new class568();

    @OriginalMember(owner = "client!at", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6320 = new String[] { method3232(method3231("\u0014\u0005\u0013c5")), method3232(method3231("\u0014\u0005\u0013l5")), method3232(method3231("\u0014\u0005\u0013n5")), method3232(method3231("\u0014\u0005\u0013j5")), method3232(method3231("\u0014\u0005\u0013b5")), method3232(method3231("\u0014\u0005\u0013o5")), method3232(method3231("\u0014\u0005\u0013a5")), method3232(method3231("\u0014\u0005\u0013i5")), method3232(method3231("\u001b\u0004QG")), method3232(method3231("\u000e_\u0013\u0005`")), method3232(method3231("\u0014\u0005\u0013h5")), method3232(method3231("\u0014\u0005\u0013f5")), method3232(method3231("\u0014\u0005\u0013\u0017t\u001b\u0018I\u00155")), method3232(method3231("\u0014\u0005\u0013`5")), method3232(method3231("\u0014\u0005\u0013e5")), method3232(method3231("\u0011\u0001")), method3232(method3231("\u0014\u0005\u0013g5")), method3232(method3231("\u0014\u0005\u0013m5")) };

    @OriginalMember(owner = "client!at", name = "a", descriptor = "Lvn;")
    public static class330 field6311 = new class330(79, 0);

    @OriginalMember(owner = "client!at", name = "c", descriptor = "Z")
    public static boolean field6313 = false;

    @OriginalMember(owner = "client!at", name = "g", descriptor = "F")
    public static float field6299;

    @OriginalMember(owner = "client!at", name = "t", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!at", name = "i", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!at", name = "s", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!at", name = "r", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!at", name = "o", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!at", name = "f", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!at", name = "q", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!at", name = "j", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!at", name = "p", descriptor = "Lne;")
    public static class336 field6315;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "Lac;")
    private class568 field6318;

    // $FF: synthetic field
    @OriginalMember(owner = "client!at", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field6319;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)Lac;")
    public final class568 method3216(boolean arg0) {
        try {
            if (!arg0) {
                method3225(-80);
            }
            field6317++;
            class568 var2 = this.field6318;
            if (this.field6307 == var2) {
                this.field6318 = null;
                return null;
            } else {
                this.field6318 = var2.field8249;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6320[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)Z")
    public final boolean method3217(byte arg0) {
        try {
            field6312++;
            int var2 = -94 % (arg0 / 47);
            return this.field6307.field8249 == this.field6307;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6320[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lat;I)V")
    public final void method3218(class398 arg0, int arg1) {
        try {
            if (arg1 > -73) {
                this.method3224(true);
            }
            this.method3226(arg0, (byte) -94, this.field6307.field8249);
            field6300++;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6320[10] + (arg0 == null ? field6320[8] : field6320[9]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)Lac;")
    public final class568 method3219(int arg0) {
        try {
            field6310++;
            class568 var2 = this.field6307.field8249;
            if (this.field6307 == var2) {
                return null;
            }
            if (arg0 > -8) {
                method3225(-82);
            }
            var2.method4173(-1);
            return var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6320[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lac;I)V")
    public final void method3220(class568 arg0, int arg1) {
        try {
            if (arg0.field8246 != null) {
                arg0.method4173(-1);
            }
            if (arg1 != 0) {
                this.field6307 = null;
            }
            field6301++;
            arg0.field8246 = this.field6307.field8246;
            arg0.field8249 = this.field6307;
            arg0.field8246.field8249 = arg0;
            arg0.field8249.field8246 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6320[17] + (arg0 == null ? field6320[8] : field6320[9]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lac;B)V")
    public final void method3221(class568 arg0, byte arg1) {
        try {
            if (arg1 > 0) {
                if (arg0.field8246 != null) {
                    arg0.method4173(-1);
                }
                field6304++;
                arg0.field8246 = this.field6307;
                arg0.field8249 = this.field6307.field8249;
                arg0.field8246.field8249 = arg0;
                arg0.field8249.field8246 = arg0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6320[14] + (arg0 == null ? field6320[8] : field6320[9]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(Z)I")
    public final int method3222(boolean arg0) {
        try {
            field6314++;
            if (arg0) {
                field6311 = null;
            }
            int var2 = 0;
            for (class568 var3 = this.field6307.field8249; var3 != this.field6307; var3 = var3.field8249) {
                var2++;
            }
            return var2;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6320[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            if (arg3 != 10909) {
                method3225(4);
            }
            field6306++;
            if (arg5 >= 0 && arg6 >= 0 && arg5 < class126.field1823 - 1 && class169.field2725 - 1 > arg6) {
                if (class85.field1280 == null) {
                    return;
                }
                if (arg4 == 0) {
                    class3 var8 = (class3) class244.method2102(arg7, arg5, arg6);
                    class3 var9 = (class3) class594.method4353(arg7, arg5, arg6);
                    if (var8 != null && arg0 != 2) {
                        if (var8 instanceof class340) {
                            ((class340) var8).field5545.method312(arg1, (byte) 119);
                        } else {
                            class370.method3046(arg5, arg7, arg0, arg4, arg6, var8.method32((byte) -95), arg1, arg2, 60);
                        }
                    }
                    if (var9 != null) {
                        if (!(var9 instanceof class340)) {
                            class370.method3046(arg5, arg7, arg0, arg4, arg6, var9.method32((byte) -95), arg1, arg2, 119);
                            return;
                        }
                        ((class340) var9).field5545.method312(arg1, (byte) -60);
                        return;
                    }
                    return;
                }
                if (arg4 == 1) {
                    class3 var10 = (class3) class479.method3658(arg7, arg5, arg6);
                    if (var10 != null) {
                        if (var10 instanceof class271) {
                            ((class271) var10).field4369.method312(arg1, (byte) -120);
                            return;
                        }
                        int var11 = var10.method32((byte) -95);
                        if (arg0 != 4 && arg0 != 5) {
                            if (arg0 != 6) {
                                if (arg0 == 7) {
                                    class370.method3046(arg5, arg7, 4, arg4, arg6, var11, arg1, (arg2 + 2 & 0x3) + 4, 118);
                                } else if (arg0 == 8) {
                                    class370.method3046(arg5, arg7, 4, arg4, arg6, var11, arg1, arg2 + 4, arg3 ^ 0x2ADF);
                                    class370.method3046(arg5, arg7, 4, arg4, arg6, var11, arg1, (arg2 + 2 & 0x3) + 4, 126);
                                    return;
                                }
                                return;
                            }
                            class370.method3046(arg5, arg7, 4, arg4, arg6, var11, arg1, arg2 + 4, arg3 + -10849);
                            return;
                        }
                        class370.method3046(arg5, arg7, 4, arg4, arg6, var11, arg1, arg2, arg3 ^ 0x2AEE);
                        return;
                    }
                    return;
                }
                if (arg4 == 2) {
                    class3 var12 = (class3) class59.method614(arg7, arg5, arg6, field6319 == null ? (field6319 = method3230(field6320[15])) : field6319);
                    if (var12 != null) {
                        if (arg0 == 11) {
                            arg0 = 10;
                        }
                        if (!(var12 instanceof class62)) {
                            class370.method3046(arg5, arg7, arg0, arg4, arg6, var12.method32((byte) -95), arg1, arg2, 65);
                            return;
                        }
                        ((class62) var12).field840.method312(arg1, (byte) -24);
                        return;
                    }
                    return;
                }
                if (arg4 == 3) {
                    class3 var13 = (class3) class605.method4422(arg7, arg5, arg6);
                    if (var13 != null) {
                        if (var13 instanceof class786) {
                            ((class786) var13).field11488.method312(arg1, (byte) 120);
                            return;
                        }
                        class370.method3046(arg5, arg7, arg0, arg4, arg6, var13.method32((byte) -95), arg1, arg2, 69);
                        return;
                    }
                }
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field6320[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(Z)V")
    public final void method3224(boolean arg0) {
        try {
            while (true) {
                class568 var2 = this.field6307.field8249;
                if (this.field6307 == var2) {
                    if (arg0) {
                        return;
                    }
                    field6316++;
                    this.field6318 = null;
                    return;
                }
                var2.method4173(-1);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6320[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "e", descriptor = "(I)V")
    public static void method3225(int arg0) {
        try {
            if (arg0 != 2) {
                field6313 = true;
            }
            field6311 = null;
            field6315 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6320[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lat;BLac;)V")
    private final void method3226(class398 arg0, byte arg1, class568 arg2) {
        try {
            field6308++;
            int var4 = -114 % ((arg1 + 22) / 56);
            class568 var5 = this.field6307.field8246;
            this.field6307.field8246 = arg2.field8246;
            arg2.field8246.field8249 = this.field6307;
            if (this.field6307 != arg2) {
                arg2.field8246 = arg0.field6307.field8246;
                arg2.field8246.field8249 = arg2;
                var5.field8249 = arg0.field6307;
                arg0.field6307.field8246 = var5;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6320[13] + (arg0 == null ? field6320[8] : field6320[9]) + ',' + arg1 + ',' + (arg2 == null ? field6320[8] : field6320[9]) + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)Lac;")
    public final class568 method3227(int arg0) {
        try {
            field6305++;
            class568 var2 = this.field6318;
            if (this.field6307 == var2) {
                this.field6318 = null;
                return null;
            }
            if (arg0 != -19461) {
                this.method3217((byte) 84);
            }
            this.field6318 = var2.field8246;
            return var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6320[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(I)Lac;")
    public final class568 method3228(int arg0) {
        try {
            if (arg0 != 11) {
                field6313 = true;
            }
            field6309++;
            class568 var2 = this.field6307.field8249;
            if (this.field6307 == var2) {
                this.field6318 = null;
                return null;
            } else {
                this.field6318 = var2.field8249;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6320[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "d", descriptor = "(I)Lac;")
    public final class568 method3229(int arg0) {
        try {
            field6303++;
            class568 var2 = this.field6307.field8246;
            if (this.field6307 == var2) {
                this.field6318 = null;
                return null;
            } else {
                this.field6318 = var2.field8246;
                return arg0 == 0 ? var2 : null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6320[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V")
    public class398() {
        try {
            this.field6307.field8249 = this.field6307;
            this.field6307.field8246 = this.field6307;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6320[12] + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3230(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!at", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3231(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!at", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3232(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 117;
                    break;
                case 1:
                    var10005 = 113;
                    break;
                case 2:
                    var10005 = 61;
                    break;
                case 3:
                    var10005 = 43;
                    break;
                default:
                    var10005 = 29;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
