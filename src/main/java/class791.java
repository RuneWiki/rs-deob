import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bka")
public abstract class class791 {

    @OriginalMember(owner = "client!bka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11512 = new String[] { method5708(method5707("V>\"^&\u001c")), method5708(method5707("V>\"^$\u001c")), method5708(method5707("V>\"^ \u001c")), method5708(method5707("Z /\u001c")), method5708(method5707("O{m^\b")), method5708(method5707("V>\"^'\u001c")), method5708(method5707("V>\"^!\u001c")) };

    @OriginalMember(owner = "client!bka", name = "g", descriptor = "I")
    public static int field11507 = 503;

    @OriginalMember(owner = "client!bka", name = "i", descriptor = "Lsb;")
    public static class261 field11508 = new class261(68, 6);

    @OriginalMember(owner = "client!bka", name = "d", descriptor = "[I")
    public static int[] field11510 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!bka", name = "f", descriptor = "J")
    public static long field11509 = 0L;

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "[[B")
    public static byte[][] field11511 = new byte[50][];

    @OriginalMember(owner = "client!bka", name = "h", descriptor = "I")
    public static int field11503;

    @OriginalMember(owner = "client!bka", name = "e", descriptor = "I")
    public static int field11504;

    @OriginalMember(owner = "client!bka", name = "c", descriptor = "I")
    public static int field11505;

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "I")
    public static int field11506;

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(IIIBI)V", line = 6)
    public static final void method5702(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        try {
            field11503++;
            int var5 = 0;
            int var6 = arg4;
            int var7 = -arg4;
            if (arg3 == -23) {
                int var8 = -1;
                int var9 = class679.method4875(class507.field7453, class335.field4844, arg0 + arg4, -1);
                int var10 = class679.method4875(class507.field7453, class335.field4844, arg0 - arg4, -1);
                class576.method4282(-7, var10, arg1, class529.field7682[arg2], var9);
                while (var5 < var6) {
                    var8 += 2;
                    var7 += var8;
                    if (var7 > 0) {
                        var6--;
                        var7 -= var6 << 1;
                        int var11 = arg2 - var6;
                        int var12 = arg2 + var6;
                        if (class557.field8113 <= var12 && var11 <= class50.field717) {
                            int var13 = class679.method4875(class507.field7453, class335.field4844, arg0 + var5, -1);
                            int var14 = class679.method4875(class507.field7453, class335.field4844, arg0 - var5, arg3 ^ 0x16);
                            if (class50.field717 >= var12) {
                                class576.method4282(-7, var14, arg1, class529.field7682[var12], var13);
                            }
                            if (var11 >= class557.field8113) {
                                class576.method4282(-7, var14, arg1, class529.field7682[var11], var13);
                            }
                        }
                    }
                    var5++;
                    int var15 = arg2 - var5;
                    int var16 = arg2 + var5;
                    if (var16 >= class557.field8113 && var15 <= class50.field717) {
                        int var17 = class679.method4875(class507.field7453, class335.field4844, arg0 + var6, -1);
                        int var18 = class679.method4875(class507.field7453, class335.field4844, arg0 - var6, -1);
                        if (var16 <= class50.field717) {
                            class576.method4282(-7, var18, arg1, class529.field7682[var16], var17);
                        }
                        if (var15 >= class557.field8113) {
                            class576.method4282(-7, var18, arg1, class529.field7682[var15], var17);
                        }
                    }
                }
            }
        } catch (RuntimeException var20) {
            throw class665.method4799(var20, field11512[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(CBI)C", line = 83)
    public static final char method5703(char arg0, byte arg1, int arg2) {
        try {
            field11504++;
            if (arg0 >= 'À' && arg0 <= 'ÿ') {
                if (arg0 >= 'À' && arg0 <= 'Æ') {
                    return 'A';
                }
                if (arg0 == 'Ç') {
                    return 'C';
                }
                if (arg0 >= 'È' && arg0 <= 'Ë') {
                    return 'E';
                }
                if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                    return 'I';
                }
                if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                    return 'O';
                }
                if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                    return 'U';
                }
                if (arg0 == 'Ý') {
                    return 'Y';
                }
                if (arg0 == 'ß') {
                    return 's';
                }
                if (arg0 >= 'à' && arg0 <= 'æ') {
                    return 'a';
                }
                if (arg0 == 'ç') {
                    return 'c';
                }
                if (arg0 >= 'è' && arg0 <= 'ë') {
                    return 'e';
                }
                if (arg0 >= 'ì' && arg0 <= 'ï') {
                    return 'i';
                }
                if (arg0 >= 'ò' && arg0 <= 'ö') {
                    return 'o';
                }
                if (arg0 >= 'ù' && arg0 <= 'ü') {
                    return 'u';
                }
                if (arg0 == 'ý' || arg0 == 'ÿ') {
                    return 'y';
                }
            }
            if (arg0 == 'Œ') {
                return 'O';
            }
            if (arg1 != 71) {
                method5705(-34);
            }
            if (arg0 == 'œ') {
                return 'o';
            } else if (arg0 == 'Ÿ') {
                return 'Y';
            } else {
                return arg0;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11512[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(Lvo;B)V", line = 163)
    public static final void method5704(class782 arg0, byte arg1) {
        try {
            if (arg1 < 0) {
                field11505++;
                if (arg0.field11291 == 5 && arg0.field11276 != -1) {
                    class587.method4342(arg0, (byte) -50, class236.field3418);
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11512[5] + (arg0 == null ? field11512[3] : field11512[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bka", name = "e", descriptor = "(I)V", line = 181)
    public static void method5705(int arg0) {
        try {
            int var1 = -27 % ((20 - arg0) / 36);
            field11508 = null;
            field11511 = null;
            field11510 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11512[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bka", name = "c", descriptor = "(I)Z", line = 197)
    public final boolean method5706(int arg0) {
        try {
            field11506++;
            if (arg0 == 339) {
                return this.method2882(false) || this.method2874(-756041375) || this.method2886(108);
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11512[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bka", name = "d", descriptor = "(I)Z")
    public abstract boolean method2874(int arg0);

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(I)Lvha;")
    public abstract class682 method2887(int arg0);

    @OriginalMember(owner = "client!bka", name = "c", descriptor = "(B)V")
    public abstract void method2877(byte arg0);

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "(I)I")
    public abstract int method2879(int arg0);

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(Z)Z")
    public abstract boolean method2882(boolean arg0);

    @OriginalMember(owner = "client!bka", name = "f", descriptor = "(I)Z")
    public abstract boolean method2886(int arg0);

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(B)I")
    public abstract int method2881(byte arg0);

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "(B)V")
    public abstract void method2888(byte arg0);

    @OriginalMember(owner = "client!bka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5707(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x75);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5708(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 52;
                    break;
                case 1:
                    var10005 = 85;
                    break;
                case 2:
                    var10005 = 67;
                    break;
                case 3:
                    var10005 = 112;
                    break;
                default:
                    var10005 = 117;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
