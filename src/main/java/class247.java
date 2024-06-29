import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class247 implements class371 {

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "[[Z")
    public static boolean[][] field3266;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Lcq;")
    public static class72 field3263;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BII)V")
    public static final void method1613(byte arg0, int arg1, int arg2) {
        field3259++;
        class56.field649[arg2] = arg1;
        if (arg0 != 30) {
            method1617((byte) 92, (String) null);
        }
        class113 var3 = (class113) class23.field241.method2218(1, (long) arg2);
        if (var3 == null) {
            class113 var4 = new class113(class164.method1038(8635) + 500L);
            class23.field241.method2227(var4, -8218, (long) arg2);
        } else {
            var3.field1320 = class164.method1038(8635) + 500L;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[IBJ)Ljava/lang/String;")
    public final String method1614(int arg0, int[] arg1, byte arg2, long arg3) {
        field3265++;
        if (arg0 == 0) {
            class130 var6 = class106.method635(true, arg1[0]);
            return var6.method835(-3848, (int) arg3);
        } else if (arg0 == 1 || arg0 == 10) {
            class59 var7 = class131.method843((byte) 5, (int) arg3);
            return var7.field736;
        } else {
            if (arg2 != -125) {
                field3263 = null;
            }
            return arg0 == 6 || arg0 == 7 || arg0 == 11 ? class106.method635(true, arg1[0]).method835(arg2 - 3723, (int) arg3) : null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIBI)I")
    public static final int method1615(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3261++;
        if (arg4 != -91) {
            return 53;
        } else if (class304.field4096 == null) {
            return 0;
        } else {
            if (arg3 < 3) {
                int var6 = arg5 >> 7;
                int var7 = arg2 >> 7;
                if (arg0 < 0 || arg1 < 0 || (class22.field232 - 1) < arg0 || arg1 > class196.field2329 - 1) {
                    return 0;
                }
                if (var6 < 1 || var7 < 1 || var6 > (class22.field232 - 1) || var7 > (class196.field2329 - 1)) {
                    return 0;
                }
                boolean var8 = (class222.field2770[1][arg5 >> 7][arg2 >> 7] & 0x2) != 0;
                if ((arg5 & 0x7F) == 0) {
                    boolean var9 = (class222.field2770[1][var6 - 1][arg2 >> 7] & 0x2) != 0;
                    boolean var10 = (class222.field2770[1][var6][arg2 >> 7] & 0x2) != 0;
                    if (var9 != var10) {
                        var8 = (class222.field2770[1][arg0][arg1] & 0x2) != 0;
                    }
                }
                if ((arg2 & 0x7F) == 0) {
                    boolean var11 = (class222.field2770[1][arg5 >> 7][var7 - 1] & 0x2) != 0;
                    boolean var12 = (class222.field2770[1][arg5 >> 7][var7] & 0x2) != 0;
                    if (var11 != var12) {
                        var8 = (class222.field2770[1][arg0][arg1] & 0x2) != 0;
                    }
                }
                if (var8) {
                    arg3++;
                }
            }
            return class304.field4096[arg3].method1054(arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method1616(int arg0) {
        if (arg0 != -27414) {
            field3266 = null;
        }
        field3263 = null;
        field3266 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1617(byte arg0, String arg1) {
        field3264++;
        int var2 = 105 / ((arg0 + 30) / 42);
        if (!arg1.equals("")) {
            class196.field2324++;
            class427.field5837.method2162(false, 56);
            class427.field5837.method1593(class350.method2229(2, arg1), -126);
            class427.field5837.method1562(-81, arg1);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILki;)V")
    public static final void method1618(int arg0, class204 arg1) {
        field3260++;
        int var2 = arg1.field2454 - class106.field1273;
        int var3 = arg1.field2395 * 128 + (arg1.method841(true) * 64);
        int var4 = arg1.field2440 * 128 + arg1.method841(true) * 64;
        arg1.field2474 = 0;
        arg1.field1516 += (var3 - arg1.field1516) / var2;
        arg1.field1514 += (var4 - arg1.field1514) / var2;
        if (arg1.field2396 == 0) {
            arg1.method1251((byte) 101, 8192);
        }
        if (arg1.field2396 == 1) {
            arg1.method1251((byte) -74, 12288);
        }
        if (arg0 >= -11) {
            return;
        }
        if (arg1.field2396 == 2) {
            arg1.method1251((byte) 119, 0);
        }
        if (arg1.field2396 == 3) {
            arg1.method1251((byte) 96, 4096);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIII)V")
    public static final void method1619(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 3) {
            field3263 = null;
        }
        if (arg3 >= class53.field624 && class118.field1356 >= arg3) {
            int var5 = class65.method376(class295.field3937, class427.field5844, arg1, (byte) -98);
            int var6 = class65.method376(class295.field3937, class427.field5844, arg0, (byte) -43);
            class286.method1827(false, arg2, var6, var5, arg3);
        }
        field3262++;
    }

    static {
        new class72("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field3266 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };
        field3263 = new class72("Loading fonts - ", "Lade Schriftsätze - ", "Chargement des polices - ", "Carregando fontes - ");
        new class72("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
    }
}
