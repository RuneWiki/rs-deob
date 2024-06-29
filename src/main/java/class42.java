import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class42 extends class91 {

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    private int field544;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field543 = 100;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field541 = 0;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "Z")
    public static boolean field542 = false;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "Z")
    public static boolean field553 = true;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "Lka;")
    public static class408 field559 = new class408(64);

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "Lij;")
    public static class316 field550;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "Lij;")
    public static class316 field561;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "Lij;")
    public static class316 field564;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "Z")
    public static boolean field563;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "[Z")
    public static boolean[] field562;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(IB)Lwi;")
    public static final class215 method359(int arg0, byte arg1) {
        ++field545;
        class215 var2 = (class215) class72.field1047.method2529(0, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class277.field3782.method1926(0, arg0, 34);
            class215 var4 = new class215();
            if (var3 != null) {
                var4.method1434(arg0, new class366(var3), 0);
            }
            if (arg1 != -61) {
                return null;
            } else {
                class72.field1047.method2527(-105, (long) arg0, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILae;Lae;ZI)I")
    public static final int method360(int arg0, class277 arg1, class277 arg2, boolean arg3, int arg4) {
        ++field549;
        if (arg0 <= 120) {
            field550 = null;
        }
        if (arg4 == 1) {
            int var5 = arg1.field1973;
            int var6 = arg2.field1973;
            if (!arg3) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return -var6 + var5;
        } else if (~arg4 == -3) {
            return class177.method1256(arg1.method1748(107).field1063, class445.field6241, arg2.method1748(120).field1063, 120);
        } else if (arg4 == 3) {
            if (!arg1.field3781.equals("-")) {
                if (arg2.field3781.equals("-")) {
                    return arg3 ? 1 : -1;
                } else {
                    return class177.method1256(arg1.field3781, class445.field6241, arg2.field3781, 105);
                }
            } else if (arg2.field3781.equals("-")) {
                return 0;
            } else {
                return !arg3 ? 1 : -1;
            }
        } else if (arg4 == 4) {
            if (!arg1.method985(false)) {
                return arg2.method985(false) ? -1 : 0;
            } else {
                return !arg2.method985(false) ? 1 : 0;
            }
        } else if (arg4 == 5) {
            if (!arg1.method984((byte) -26)) {
                return arg2.method984((byte) -26) ? -1 : 0;
            } else {
                return !arg2.method984((byte) -26) ? 1 : 0;
            }
        } else if (~arg4 == -7) {
            if (!arg1.method980((byte) -64)) {
                return !arg2.method980((byte) 95) ? 0 : -1;
            } else {
                return !arg2.method980((byte) 80) ? 1 : 0;
            }
        } else if (~arg4 == -8) {
            if (!arg1.method983(1)) {
                return !arg2.method983(1) ? 0 : -1;
            } else {
                return arg2.method983(1) ? 0 : 1;
            }
        } else if (arg4 == 8) {
            int var7 = arg1.field3770;
            int var8 = arg2.field3770;
            if (arg3) {
                if (~var7 == -1001) {
                    var7 = -1;
                }
                if (~var8 == -1001) {
                    var8 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return -var8 + var7;
        } else {
            return -arg2.field3769 + arg1.field3769;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(ZII)V")
    public static final void method361(boolean arg0, int arg1, int arg2) {
        ++field560;
        int var3 = class280.field3810.method2419(class436.field6154.method2313((byte) -118, class445.field6241), (byte) -95);
        for (class429 var4 = (class429) class451.field6491.method1173(0); var4 != null; var4 = (class429) class451.field6491.method1165(true)) {
            int var8 = class277.method1750(var4, (byte) -119);
            if (~var8 < ~var3) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class149.field2171 * 16 + 21;
        int var6 = -(var3 / 2) + arg2;
        if (~class373.field5174 > ~(var6 - -var3)) {
            var6 = -var3 + class373.field5174;
        }
        if (~var6 > -1) {
            var6 = 0;
        }
        int var7 = arg1;
        if (~class396.field5493 > ~(var5 + arg1)) {
            var7 = -var5 + class396.field5493;
        }
        class75.field1073 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class317.field4324 = true;
        if (arg0) {
            field559 = null;
        }
        class124.field1873 = class149.field2171 * 16 + (!class53.field678 ? 22 : 26);
        class49.field631 = var7;
        class4.field32 = var3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZII)V")
    public final void method362(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method365((class366) null, -61);
        }
        ++field548;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
    public final void method363(int arg0, int arg1, int arg2) {
        ++field554;
        if (arg0 == 4) {
            int var4 = this.field556 * arg2 >> 12;
            int var5 = this.field551 * arg2 >> 12;
            int var6 = this.field552 * arg1 >> 12;
            int var7 = this.field544 * arg1 >> 12;
            class200.method1378(var6, (byte) -83, var5, var7, var4, super.field1270);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII)I")
    public static final int method364(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -10) {
            field541 = -27;
        }
        ++field557;
        int var4 = arg2 & 3;
        if (~var4 == -1) {
            return arg3;
        } else if (~var4 == -2) {
            return 7 - arg1;
        } else {
            return ~var4 == -3 ? -arg3 + 7 : arg1;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lrg;I)Lwb;")
    public static final class42 method365(class366 arg0, int arg1) {
        ++field555;
        if (arg1 <= 99) {
            field547 = 106;
        }
        return new class42(arg0.method2257((byte) 110), arg0.method2257((byte) 110), arg0.method2257((byte) 110), arg0.method2257((byte) 110), arg0.method2263((byte) 10), arg0.method2306((byte) 66));
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V")
    public static void method366(byte arg0) {
        field559 = null;
        field562 = null;
        field564 = null;
        field561 = null;
        field550 = null;
        int var1 = -97 / ((56 - arg0) / 46);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(III)V")
    public final void method367(int arg0, int arg1, int arg2) {
        ++field558;
        if (arg1 < 59) {
            method366((byte) 27);
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(IIIIII)V")
    private class42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field556 = arg0;
        this.field544 = arg3;
        this.field552 = arg1;
        this.field551 = arg2;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method368(int arg0, int arg1) {
        ++field546;
        String var2 = Integer.toString(arg0);
        for (int var3 = -3 + var2.length(); ~var3 < -1; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (~var2.length() < -10) {
            return " <col=00ff80>" + var2.substring(0, var2.length() + -8) + class367.field5095.method2313((byte) -127, class445.field6241) + " (" + var2 + ")</col>";
        } else {
            if (arg1 != -2) {
                field543 = 127;
            }
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, -4 + var2.length()) + class448.field6348.method2313((byte) -76, class445.field6241) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }
}
