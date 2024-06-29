import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class383 extends class206 {

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "Lnw;")
    public class612 field5799;

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5803 = new String[] { method3071(method3070("Fs\nkg")), method3071(method3070("Fs\nmg")), method3071(method3070("Fs\nlg")), method3071(method3070("Q1\n\u00012")), method3071(method3070("Fs\n\u0013&DvP\u0011g")), method3071(method3070("DjHC")), method3071(method3070("Fs\nng")) };

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "Lef;")
    public static class513 field5800 = new class513();

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "Lla;")
    public static class476 field5798;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIBI)I", line = 8)
    public static final int method3066(int arg0, int arg1, byte arg2, int arg3) {
        try {
            if (arg2 != -124) {
                method3069(115, -6, -9);
            }
            field5802++;
            int var6 = arg0 & 0x3;
            if (var6 == 0) {
                return arg3;
            } else if (var6 == 1) {
                return 7 - arg1;
            } else if (var6 == 2) {
                return 7 - arg3;
            } else {
                return arg1;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5803[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIBII)V", line = 36)
    public static final void method3067(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        try {
            field5801++;
            if (arg5 != 111) {
                method3068((byte) -19);
            }
            class326 var8 = null;
            for (class326 var9 = (class326) class115.field1368.method3863((byte) 64); var9 != null; var9 = (class326) class115.field1368.method3862(-353)) {
                if (var9.field5140 == arg4 && var9.field5136 == arg1 && var9.field5148 == arg6 && var9.field5139 == arg3) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == null) {
                var8 = new class326();
                var8.field5140 = arg4;
                var8.field5136 = arg1;
                var8.field5139 = arg3;
                var8.field5148 = arg6;
                if (arg1 >= 0 && arg6 >= 0 && arg1 < class648.field9378 && arg6 < class659.field9506) {
                    class64.method454(arg5 - 14607, var8);
                }
                class115.field1368.method3868(122, var8);
            }
            var8.field5142 = arg7;
            var8.field5133 = arg0;
            var8.field5134 = true;
            var8.field5137 = arg2;
            var8.field5149 = false;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field5803[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lnw;)V", line = 79)
    public class383(class612 arg0) {
        try {
            this.field5799 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5803[4] + (arg0 == null ? field5803[5] : field5803[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 89)
    public static void method3068(byte arg0) {
        try {
            field5798 = null;
            field5800 = null;
            if (arg0 < 101) {
                method3068((byte) -46);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5803[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)V", line = 100)
    public static final void method3069(int arg0, int arg1, int arg2) {
        try {
            field5796++;
            if (class343.field5332 != arg2) {
                class88.field997 = new int[arg2];
                for (int var3 = 0; var3 < arg2; var3++) {
                    class88.field997[var3] = (var3 << 12) / arg2;
                }
                class3.field28 = arg2 - 1;
                class264.field4044 = arg2 * 32;
                class343.field5332 = arg2;
            }
            if (arg1 < 24) {
                method3067(50, 80, -6, -80, 12, (byte) 16, 78, -39);
            }
            if (class463.field6744 != arg0) {
                if (class343.field5332 == arg0) {
                    class302.field4735 = class88.field997;
                } else {
                    class302.field4735 = new int[arg0];
                    for (int var4 = 0; var4 < arg0; var4++) {
                        class302.field4735[var4] = (var4 << 12) / arg0;
                    }
                }
                class463.field6744 = arg0;
                class484.field6992 = arg0 - 1;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5803[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3070(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3071(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 42;
                    break;
                case 1:
                    var10005 = 31;
                    break;
                case 2:
                    var10005 = 36;
                    break;
                case 3:
                    var10005 = 47;
                    break;
                default:
                    var10005 = 79;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
