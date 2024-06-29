import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class30 extends class114 {

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field391 = new String[] { method334(method333("2\u0017V2|")), method334(method333("8^VX)")), method334(method333("'L\u0014p")), method334(method333("8^VY)")), method334(method333("8^V])")), method334(method333("8^V^)")), method334(method333("8^V_)")), method334(method333("8^VZ)")) };

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "[I")
    public static int[] field379 = new int[6];

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field388 = 0;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "Lui;")
    public static class251 field378 = new class251(8);

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "[I")
    public static int[] field390 = new int[6];

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Lkj;")
    public static class26 field382;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Ljava/lang/String;")
    private String field387;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "[[Z")
    public static boolean[][] field385;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)I")
    public static final int method328(int arg0) {
        try {
            field389++;
            if (class101.field1360 == 1) {
                return class615.field8779;
            } else if (arg0 == -17233) {
                return 0;
            } else {
                return 109;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field391[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIILvea;)V")
    public static final void method329(int arg0, int arg1, int arg2, class122 arg3) {
        class621 var4 = class598.method4412(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field8850 = arg3;
        int var5 = class677.field9474 == class107.field1413 ? 1 : 0;
        if (arg3.method582(false)) {
            if (arg3.method579(false)) {
                arg3.field2977 = class210.field3050[var5];
                class210.field3050[var5] = arg3;
                return;
            }
            arg3.field2977 = class563.field8239[var5];
            class563.field8239[var5] = arg3;
            class710.field9925 = true;
            return;
        }
        arg3.field2977 = class391.field5707[var5];
        class391.field5707[var5] = arg3;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljc;I)V")
    public final void method116(class711 arg0, int arg1) {
        try {
            this.field386 = arg0.method5113(arg1 ^ 0xFFFFDB63);
            field381++;
            if (arg1 == -27800) {
                this.field387 = arg0.method5144(-16414);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field391[4] + (arg0 == null ? field391[2] : field391[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static void method330(byte arg0) {
        try {
            field378 = null;
            field385 = null;
            field390 = null;
            if (arg0 == -5) {
                field382 = null;
                field379 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field391[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILha;)V")
    public static final void method331(int arg0, class18 arg1) {
        try {
            field377++;
            class467.field6810 = new class488[class15.field198.length];
            if (arg0 == 8500) {
                for (int var2 = 0; var2 < class15.field198.length; var2++) {
                    int var3 = class15.field198[var2];
                    class161 var4 = class692.method4940(var3, class234.field3383, 3);
                    class216 var5 = arg1.method145(var4, class66.method702(class796.field11569, var3), true);
                    class467.field6810[var2] = new class488(var5, var4);
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field391[3] + arg0 + ',' + (arg1 == null ? field391[2] : field391[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILwfa;)V")
    public final void method115(int arg0, class286 arg1) {
        try {
            field380++;
            if (arg0 != 95) {
                method331(-97, null);
            }
            arg1.method2326(this.field386, this.field387, (byte) 46);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field391[1] + arg0 + ',' + (arg1 == null ? field391[2] : field391[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZC)C")
    public static final char method332(boolean arg0, char arg1) {
        try {
            field384++;
            if (arg0) {
                method330((byte) 116);
            }
            if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
                return '_';
            } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
                return arg1;
            } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
                return 'a';
            } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
                return 'e';
            } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
                return 'i';
            } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
                return 'o';
            } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
                return 'u';
            } else if (arg1 == 'ç' || arg1 == 'Ç') {
                return 'c';
            } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
                return 'y';
            } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
                return 'n';
            } else if (arg1 == 'ß') {
                return 'b';
            } else {
                return Character.toLowerCase(arg1);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field391[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method333(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method334(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 73;
                    break;
                case 1:
                    var10005 = 57;
                    break;
                case 2:
                    var10005 = 120;
                    break;
                case 3:
                    var10005 = 28;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
