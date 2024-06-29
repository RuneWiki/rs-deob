import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class class209 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Lap;")
    public static class335 field2698 = new class335("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Lud;")
    public static class27 field2706 = new class27(2, 4, 4, 0);

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Z")
    public static boolean field2707 = false;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Z")
    public static boolean field2709 = false;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public int field2700;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public int field2701;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public int field2702;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "Lli;")
    public static class297 field2708;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1294(int arg0, String arg1) throws ClassNotFoundException {
        field2704++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else {
            int var2 = -3 / ((arg0 + 48) / 38);
            if (arg1.equals("S")) {
                return Short.TYPE;
            } else if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)Z")
    public final boolean method1295(byte arg0) {
        if (arg0 != -115) {
            this.field2702 = -32;
        }
        field2697++;
        return (this.field2702 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Z")
    public final boolean method1296(int arg0) {
        field2699++;
        if (arg0 >= -7) {
            method1298(-58, null, -115, -108, -9);
        }
        return (this.field2702 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)Z")
    public final boolean method1297(int arg0) {
        if (arg0 <= 15) {
            field2708 = null;
        }
        field2696++;
        return (this.field2702 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILbf;III)V")
    public static final void method1298(int arg0, class375 arg1, int arg2, int arg3, int arg4) {
        field2705++;
        class511 var5 = arg1.method2128(-103);
        int var6 = arg1.field4876 - arg1.field4896.field53 & 0x3FFF;
        if (arg0 != -6145) {
            return;
        }
        if (arg4 == -1) {
            if (var6 != 0 || arg1.field4918 > 25) {
                arg1.field4872 = false;
                if (arg2 < 0 && var5.field7415 != -1) {
                    arg1.field4888 = var5.field7415;
                } else if (arg2 <= 0 || var5.field7390 == -1) {
                    arg1.field4888 = var5.field7379;
                } else {
                    arg1.field4888 = var5.field7390;
                }
            } else if (!arg1.field4872 || !var5.method3057(arg0 + 6238, arg1.field4888)) {
                arg1.field4888 = var5.method3056(true);
                arg1.field4872 = arg1.field4888 != -1;
            }
        } else if (arg1.field4895 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class453.field6542[arg3] - arg1.field4896.field53 & 0x3FFF;
            if (arg4 == 2 && var5.field7375 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field7397 != -1) {
                    arg1.field4888 = var5.field7397;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field7380 != -1) {
                    arg1.field4888 = var5.field7380;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field7395 == -1) {
                    arg1.field4888 = var5.field7375;
                } else {
                    arg1.field4888 = var5.field7395;
                }
            } else if (arg4 == 0 && var5.field7374 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field7393 != -1) {
                    arg1.field4888 = var5.field7393;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field7418 != -1) {
                    arg1.field4888 = var5.field7418;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field7405 == -1) {
                    arg1.field4888 = var5.field7374;
                } else {
                    arg1.field4888 = var5.field7405;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field7406 != -1) {
                arg1.field4888 = var5.field7406;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field7401 != -1) {
                arg1.field4888 = var5.field7401;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field7412 == -1) {
                arg1.field4888 = var5.field7379;
            } else {
                arg1.field4888 = var5.field7412;
            }
            arg1.field4872 = false;
        } else if (var6 == 0 && arg1.field4918 <= 25) {
            arg1.field4872 = false;
            if (arg4 == 2 && var5.field7375 != -1) {
                arg1.field4888 = var5.field7375;
            } else if (arg4 == 0 && var5.field7374 != -1) {
                arg1.field4888 = var5.field7374;
            } else {
                arg1.field4888 = var5.field7379;
            }
        } else {
            if (arg4 == 2 && var5.field7375 != -1) {
                if (arg2 < 0 && var5.field7383 != -1) {
                    arg1.field4888 = var5.field7383;
                } else if (arg2 <= 0 || var5.field7376 == -1) {
                    arg1.field4888 = var5.field7375;
                } else {
                    arg1.field4888 = var5.field7376;
                }
            } else if (arg4 == 0 && var5.field7374 != -1) {
                if (arg2 < 0 && var5.field7396 != -1) {
                    arg1.field4888 = var5.field7396;
                } else if (arg2 <= 0 || var5.field7411 == -1) {
                    arg1.field4888 = var5.field7374;
                } else {
                    arg1.field4888 = var5.field7411;
                }
            } else if (arg2 < 0 && var5.field7370 != -1) {
                arg1.field4888 = var5.field7370;
            } else if (arg2 <= 0 || var5.field7410 == -1) {
                arg1.field4888 = var5.field7379;
            } else {
                arg1.field4888 = var5.field7410;
            }
            arg1.field4872 = false;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
    public static void method1299(boolean arg0) {
        field2708 = null;
        field2698 = null;
        if (!arg0) {
            method1298(108, null, -103, -100, 16);
        }
        field2706 = null;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)Z")
    public final boolean method1300(int arg0) {
        field2703++;
        if (arg0 == -1) {
            return (this.field2702 & 0x2) != 0;
        } else {
            return false;
        }
    }
}
