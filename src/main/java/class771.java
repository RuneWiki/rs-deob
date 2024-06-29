import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class771 {

    @OriginalMember(owner = "client!au", name = "k", descriptor = "I")
    public int field11296;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "Ldn;")
    private class544 field11301;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    private int field11292;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public int field11294;

    @OriginalMember(owner = "client!au", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11310 = new String[] { method5569(method5568("G\u00146\u001ee")), method5569(method5568("G\u00146\u0018e")), method5569(method5568("G\u00146\u001de")), method5569(method5568("G\u00146(\"u\u0015j5#AI")), method5569(method5568("H\u0014t0")), method5569(method5568("G\u00146\u001fe")), method5569(method5568("]O6r0")), method5569(method5568("G\u00146`$H\blbe")) };

    @OriginalMember(owner = "client!au", name = "p", descriptor = "Lau;")
    public static class771 field11297 = new class771(0, 3, class544.field8008);

    @OriginalMember(owner = "client!au", name = "h", descriptor = "Lau;")
    public static class771 field11298 = new class771(1, 3, class544.field8008);

    @OriginalMember(owner = "client!au", name = "i", descriptor = "Lau;")
    public static class771 field11300 = new class771(2, 4, class544.field8004);

    @OriginalMember(owner = "client!au", name = "l", descriptor = "Lau;")
    public static class771 field11303 = new class771(3, 1, class544.field8008);

    @OriginalMember(owner = "client!au", name = "m", descriptor = "Lau;")
    public static class771 field11304 = new class771(4, 2, class544.field8008);

    @OriginalMember(owner = "client!au", name = "b", descriptor = "Lau;")
    public static class771 field11305 = new class771(5, 3, class544.field8008);

    @OriginalMember(owner = "client!au", name = "g", descriptor = "Lau;")
    public static class771 field11306 = new class771(6, 4, class544.field8008);

    @OriginalMember(owner = "client!au", name = "r", descriptor = "I")
    public static int field11307 = class349.method2911(76, 16);

    @OriginalMember(owner = "client!au", name = "o", descriptor = "[Lnea;")
    public static class746[] field11308 = new class746[50];

    @OriginalMember(owner = "client!au", name = "j", descriptor = "I")
    public static int field11293;

    @OriginalMember(owner = "client!au", name = "q", descriptor = "I")
    public static int field11295;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "I")
    public static int field11299;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "I")
    public static int field11302;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "I")
    public static int field11309;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)I", line = 7)
    public static final int method5564(int arg0) {
        try {
            int var1 = -2 % ((28 - arg0) / 51);
            field11302++;
            return class460.field7085;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11310[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V", line = 21)
    public static void method5565(int arg0) {
        try {
            field11308 = null;
            field11303 = null;
            field11305 = null;
            field11300 = null;
            field11306 = null;
            field11297 = null;
            field11304 = null;
            if (arg0 <= 11) {
                field11297 = null;
            }
            field11298 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11310[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Lau;", line = 38)
    public static final class771 method5566(int arg0, int arg1) {
        try {
            field11293++;
            int var2 = -102 / ((-arg0 - 6) / 61);
            if (arg1 == 0) {
                return field11297;
            } else if (arg1 == 1) {
                return field11298;
            } else if (arg1 == 2) {
                return field11300;
            } else if (arg1 == 3) {
                return field11303;
            } else if (arg1 == 4) {
                return field11304;
            } else if (arg1 == 5) {
                return field11305;
            } else if (arg1 == 6) {
                return field11306;
            } else {
                return null;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11310[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ZILdq;III)V", line = 120)
    public static final void method5567(boolean arg0, int arg1, class729 arg2, int arg3, int arg4, int arg5) {
        try {
            field11295++;
            if (arg5 >= 1 && arg1 >= 1 && arg5 <= class126.field1823 - 2 && arg1 <= class169.field2725 - 2) {
                if (class85.field1280 == null) {
                    return;
                }
                class3 var6 = class60.field778.method1399(arg3, (byte) 75, arg4, arg1, arg5);
                if (var6 != null) {
                    if ((var6 instanceof class62)) {
                        ((class62) var6).method650(arg2, -76);
                    } else if ((var6 instanceof class786)) {
                        ((class786) var6).method5653((byte) 116, arg2);
                    } else if (var6 instanceof class340) {
                        ((class340) var6).method2864(arg2, true);
                    } else if (var6 instanceof class271) {
                        ((class271) var6).method2338(1, arg2);
                    }
                }
            }
            if (!arg0) {
                method5566(53, -29);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field11310[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field11310[4] : field11310[6]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(IILdn;)V", line = 167)
    private class771(int arg0, int arg1, class544 arg2) {
        try {
            this.field11296 = arg0;
            this.field11301 = arg2;
            this.field11292 = arg1;
            this.field11294 = this.field11301.field7999 * this.field11292;
            if (this.field11296 >= 16) {
                throw new RuntimeException();
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11310[7] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field11310[4] : field11310[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!au", name = "toString", descriptor = "()Ljava/lang/String;", line = 182)
    public final String toString() {
        try {
            field11299++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11310[3] + ')');
        }
    }

    @OriginalMember(owner = "client!au", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5568(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!au", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5569(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 38;
                    break;
                case 1:
                    var10005 = 97;
                    break;
                case 2:
                    var10005 = 24;
                    break;
                case 3:
                    var10005 = 92;
                    break;
                default:
                    var10005 = 77;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
