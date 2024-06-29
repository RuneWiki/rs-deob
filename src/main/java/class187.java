import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class187 {

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "Z")
    public boolean field2568;

    @OriginalMember(owner = "client!aba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2574 = new String[] { method1629(method1628("\u000b=\u0005;OB")), method1629(method1628("\u000b=\u0005;0\u00031\ra2B")), method1629(method1628("\u000b=\u0005;MB")), method1629(method1628("\u000b=\u0005;HB")), method1629(method1628("\u000b=\u0005;NB")) };

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "Lel;")
    public static class573 field2565 = new class573(21, -1);

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "Lsfa;")
    public class723 field2569;

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "Lsfa;")
    public class723 field2573;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "Z")
    public boolean field2567;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Z)Z")
    public final boolean method1624(boolean arg0) {
        try {
            if (arg0) {
                return false;
            } else {
                field2572++;
                return this.field2567 && !this.field2568;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2574[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V")
    public static void method1625(int arg0) {
        try {
            if (arg0 != 115) {
                method1626((byte) 75, 't', -120);
            }
            field2565 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2574[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(BCI)C")
    public static final char method1626(byte arg0, char arg1, int arg2) {
        try {
            field2566++;
            if (arg1 >= 'À' && arg1 <= 'ÿ') {
                if (arg1 >= 'À' && arg1 <= 'Æ') {
                    return 'A';
                }
                if (arg1 == 'Ç') {
                    return 'C';
                }
                if (arg1 >= 'È' && arg1 <= 'Ë') {
                    return 'E';
                }
                if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                    return 'I';
                }
                if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                    return 'O';
                }
                if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                    return 'U';
                }
                if (arg1 == 'Ý') {
                    return 'Y';
                }
                if (arg1 == 'ß') {
                    return 's';
                }
                if (arg1 >= 'à' && arg1 <= 'æ') {
                    return 'a';
                }
                if (arg1 == 'ç') {
                    return 'c';
                }
                if (arg1 >= 'è' && arg1 <= 'ë') {
                    return 'e';
                }
                if (arg1 >= 'ì' && arg1 <= 'ï') {
                    return 'i';
                }
                if (arg1 >= 'ò' && arg1 <= 'ö') {
                    return 'o';
                }
                if (arg1 >= 'ù' && arg1 <= 'ü') {
                    return 'u';
                }
                if (arg1 == 'ý' || arg1 == 'ÿ') {
                    return 'y';
                }
            }
            if (arg0 <= 109) {
                method1626((byte) -83, 'D', 32);
            }
            if (arg1 == 'Œ') {
                return 'O';
            } else if (arg1 == 'œ') {
                return 'o';
            } else if (arg1 == 'Ÿ') {
                return 'Y';
            } else {
                return arg1;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2574[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)V")
    public final void method1627(int arg0) {
        try {
            if (arg0 == -31188) {
                if (this.field2573 != null) {
                    this.field2573.method20(true);
                }
                field2570++;
                this.field2567 = false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2574[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Z)V")
    public class187(boolean arg0) {
        try {
            this.field2568 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2574[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1628(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xC);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1629(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 106;
                    break;
                case 1:
                    var10005 = 95;
                    break;
                case 2:
                    var10005 = 100;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 12;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
