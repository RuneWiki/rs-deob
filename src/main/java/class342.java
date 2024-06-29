import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class342 {

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Lqt;")
    public static class459 field5051 = new class459(71, 3);

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "[I")
    public static int[] field5060;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "[I")
    public static int[] field5061;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "[I")
    public static int[] field5057;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "[I")
    public static int[] field5056;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "[I")
    public static int[] field5055;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "[I")
    public static int[] field5059;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field5054;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static final void method2162(int arg0) {
        if (arg0 != 255) {
            return;
        }
        field5047++;
        class536 var1 = null;
        try {
            class81 var2 = class280.field4173.method2463(false, "2", true);
            while (var2.field1314 == 0) {
                class477.method2826(1L, 0);
            }
            if (var2.field1314 == 1) {
                var1 = (class536) var2.field1311;
                byte[] var3 = new byte[(int) var1.method3160((byte) 74)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method3161(var3, var3.length - var4, arg0 + -134, var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class21.method120(2, new class519(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method3165(arg0 ^ 0xFFFFE266);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILci;)V")
    public static final void method2163(int arg0, class320 arg1) {
        if (arg0 > 5) {
            class179.field2653 = arg1;
            field5050++;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
    public static final void method2164(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            method2165(92, null);
        }
        if (class382.field5457 < class382.field5460) {
            class382.field5457 = (float) ((double) class382.field5457 / 30.0D + (double) class382.field5457);
            if (class382.field5457 > class382.field5460) {
                class382.field5457 = class382.field5460;
            }
            class521.method3091((byte) 70);
            class382.field5458 = (int) class382.field5457 >> 1;
            class382.field5463 = class157.method1100(11762, class382.field5458);
        } else if (class382.field5460 < class382.field5457) {
            class382.field5457 = (float) ((double) class382.field5457 - (double) class382.field5457 / 30.0D);
            if (class382.field5457 < class382.field5460) {
                class382.field5457 = class382.field5460;
            }
            class521.method3091((byte) 70);
            class382.field5458 = (int) class382.field5457 >> 1;
            class382.field5463 = class157.method1100(11762, class382.field5458);
        }
        field5052++;
        if (class473.field6895 != -1 && class94.field1501 != -1) {
            int var3 = class473.field6895 - class70.field1149;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class94.field1501 - class388.field5514;
            class70.field1149 -= -var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class388.field5514 += var4;
            if (var3 == 0 && var4 == 0) {
                class473.field6895 = -1;
                class94.field1501 = -1;
            }
            class521.method3091((byte) 70);
        }
        if (class288.field4266 <= 0) {
            class238.field3599 = -1;
            class356.field5183 = -1;
        } else {
            class446.field6368--;
            if (class446.field6368 == 0) {
                class446.field6368 = 100;
                class288.field4266--;
            }
        }
        if (!class101.field1567 || class241.field3617 == null) {
            return;
        }
        for (class185 var5 = (class185) class241.field3617.method863(-1); var5 != null; var5 = (class185) class241.field3617.method865(-1)) {
            class463 var6 = class382.field5447.method1429(var5.field2736.field7723, -3708);
            if (var5.method1279(arg2, false, arg0)) {
                if (var6.field6725 != null) {
                    if (var6.field6725[4] != null) {
                        class20.method114(1009, (long) var5.field2736.field7723, true, var6.field6712, false, true, -1, var6.field6701, var6.field6725[4], -1, 0);
                    }
                    if (var6.field6725[3] != null) {
                        class20.method114(1006, (long) var5.field2736.field7723, true, var6.field6712, false, true, -1, var6.field6701, var6.field6725[3], -1, 0);
                    }
                    if (var6.field6725[2] != null) {
                        class20.method114(1011, (long) var5.field2736.field7723, true, var6.field6712, false, true, -1, var6.field6701, var6.field6725[2], -1, 0);
                    }
                    if (var6.field6725[1] != null) {
                        class20.method114(1004, (long) var5.field2736.field7723, true, var6.field6712, false, true, -1, var6.field6701, var6.field6725[1], -1, 0);
                    }
                    if (var6.field6725[0] != null) {
                        class20.method114(1003, (long) var5.field2736.field7723, true, var6.field6712, false, true, -1, var6.field6701, var6.field6725[0], -1, 0);
                    }
                }
                if (!var5.field2736.field7724) {
                    var5.field2736.field7724 = true;
                    class281.method1809(class524.field7656, var5.field2736.field7723, var6.field6712);
                }
                if (var5.field2736.field7724) {
                    class281.method1809(class394.field5609, var5.field2736.field7723, var6.field6712);
                }
            } else if (var5.field2736.field7724) {
                var5.field2736.field7724 = false;
                class281.method1809(class275.field4107, var5.field2736.field7723, var6.field6712);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[B)Lhu;")
    public static final class88 method2165(int arg0, byte[] arg1) {
        field5049++;
        class88 var2 = new class88();
        class519 var3 = new class519(arg1);
        var3.field7558 = var3.field7545.length - 2;
        int var4 = var3.method3018(566990904);
        int var5 = var3.field7545.length - var4 - 2 - 12;
        if (arg0 >= -94) {
            return null;
        }
        var3.field7558 = var5;
        int var6 = var3.method3053(-129);
        var2.field1415 = var3.method3018(566990904);
        var2.field1425 = var3.method3018(566990904);
        var2.field1420 = var3.method3018(566990904);
        var2.field1423 = var3.method3018(566990904);
        int var7 = var3.method3072((byte) -126);
        if (var7 > 0) {
            var2.field1426 = new class375[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method3018(566990904);
                class375 var10 = new class375(class487.method2869(1366891568, var9));
                var2.field1426[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method3053(-129);
                    int var12 = var3.method3053(-129);
                    var10.method2292((long) var11, new class175(var12), (byte) -127);
                }
            }
        }
        var3.field7558 = 0;
        var2.field1424 = var3.method3017(-429279336);
        var2.field1427 = new int[var6];
        var2.field1416 = new int[var6];
        var2.field1417 = new String[var6];
        int var13 = 0;
        while (var3.field7558 < var5) {
            int var14 = var3.method3018(566990904);
            if (var14 == 3) {
                var2.field1417[var13] = var3.method3082((byte) 113).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field1416[var13] = var3.method3072((byte) -128);
            } else {
                var2.field1416[var13] = var3.method3053(-129);
            }
            var2.field1427[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ltf;I)Ljava/lang/String;")
    public static final String method2166(class198 arg0, int arg1) {
        field5048++;
        if (client.method1395(arg0).method1887(arg1 - 100) == arg1) {
            return null;
        } else if (arg0.field2963 == null || arg0.field2963.trim().length() == 0) {
            return class65.field1107 ? "Hidden-use" : null;
        } else {
            return arg0.field2963;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public static void method2167(byte arg0) {
        field5059 = null;
        field5060 = null;
        field5055 = null;
        int var1 = -1 % ((arg0 - 50) / 62);
        field5054 = null;
        field5051 = null;
        field5061 = null;
        field5057 = null;
        field5056 = null;
    }

    static {
        new class44("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field5053 = 0;
        field5058 = 50;
        field5060 = new int[field5058];
        field5061 = new int[field5058];
        field5057 = new int[field5058];
        field5056 = new int[field5058];
        field5055 = new int[field5058];
        field5059 = new int[field5058];
        field5054 = new String[field5058];
        new class44("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
    }
}
