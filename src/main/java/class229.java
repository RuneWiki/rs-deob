import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class229 extends class31 {

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "Lmg;")
    public class530 field3213 = new class530();

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "Lmn;")
    public class43 field3216 = new class43();

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "Lbr;")
    private class146 field3211;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "[I")
    public static int[] field3207 = new int[32];

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "Lkc;")
    public static class157 field3217;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
    public static void method1407(boolean arg0) {
        if (!arg0) {
            method1407(false);
        }
        field3217 = null;
        field3207 = null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()Loo;")
    public final class31 method226() {
        field3214++;
        class4 var1 = (class4) this.field3213.method3137(0);
        if (var1 == null) {
            return null;
        } else if (var1.field69 == null) {
            return this.method228();
        } else {
            return var1.field69;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public final void method230(int arg0) {
        this.field3216.method230(arg0);
        field3212++;
        for (class4 var2 = (class4) this.field3213.method3137(0); var2 != null; var2 = (class4) this.field3213.method3132(0)) {
            if (!this.field3211.method1021((byte) -25, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field71 >= var3) {
                        this.method1409((byte) 80, var2, var3);
                        var2.field71 -= var3;
                        break;
                    }
                    this.method1409((byte) 80, var2, var2.field71);
                    var3 -= var2.field71;
                } while (!this.field3211.method1041(var2, null, -109, var3, 0));
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjava/lang/String;Lla;Z)V")
    public static final void method1408(int arg0, String arg1, class306 arg2, boolean arg3) {
        field3210++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class44.field638.method408(arg0, null, 250, arg1);
        int var8 = class44.field638.method407(null, 250, (byte) 29, arg1) * 13;
        class275.field3737.method508(var5 - var4, -var4 + var6, var4 + var7 + var4, var8 - -var4 + var4, -16777216, 0);
        class275.field3737.method527(var5 - var4, -var4 + var6, var4 + var4 + var7, var4 + var8 - -var4, -1, 0);
        arg2.method1774(null, var7, 1, var5, var6, -22809, 0, 1, arg0, null, null, -1, 0, arg1, var8, -1);
        class94.method767(var5 - var4, var4 + var7 + var4, var4 + var8 + var4, -var4 + var6, (byte) 39);
        if (arg3) {
            class275.field3737.method536();
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()I")
    public final int method225() {
        field3215++;
        return 0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLer;I)V")
    private final void method1409(byte arg0, class4 arg1, int arg2) {
        field3205++;
        if ((this.field3211.field2192[arg1.field57] & 0x4) != 0 && arg1.field56 < 0) {
            int var4 = this.field3211.field2198[arg1.field57] / class506.field7397;
            int var5 = (var4 + 1048575 - arg1.field59) / var4;
            arg1.field59 = arg2 * var4 + arg1.field59 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field3211.field2207[arg1.field57] == 0) {
                    arg1.field69 = class477.method2808(arg1.field65, arg1.field69.method2805(), arg1.field69.method2817(), arg1.field69.method2806());
                } else {
                    arg1.field69 = class477.method2808(arg1.field65, arg1.field69.method2805(), 0, arg1.field69.method2806());
                    this.field3211.method1027(arg1.field49.field5462[arg1.field63] < 0, arg1, arg0 ^ 0x10D9);
                }
                if (arg1.field49.field5462[arg1.field63] < 0) {
                    arg1.field69.method2825(-1);
                }
                arg2 = arg1.field59 / var4;
            }
        }
        if (arg0 == 80) {
            arg1.field69.method230(arg2);
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "([III)V")
    public final void method231(int[] arg0, int arg1, int arg2) {
        field3209++;
        this.field3216.method231(arg0, arg1, arg2);
        for (class4 var4 = (class4) this.field3213.method3137(0); var4 != null; var4 = (class4) this.field3213.method3132(0)) {
            if (!this.field3211.method1021((byte) -25, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field71) {
                        this.method1410(arg0, 34, var4, var5, var6 + var5, var6);
                        var4.field71 -= var5;
                        break;
                    }
                    this.method1410(arg0, 72, var4, var4.field71, var5 + var6, var6);
                    var5 -= var4.field71;
                    var6 += var4.field71;
                } while (!this.field3211.method1041(var4, arg0, -122, var5, var6));
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "()Loo;")
    public final class31 method228() {
        field3208++;
        class4 var1;
        do {
            var1 = (class4) this.field3213.method3132(0);
            if (var1 == null) {
                return null;
            }
        } while (var1.field69 == null);
        return var1.field69;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([IILer;III)V")
    private final void method1410(int[] arg0, int arg1, class4 arg2, int arg3, int arg4, int arg5) {
        field3206++;
        int var7 = -20 % ((arg1 + 8) / 39);
        if ((this.field3211.field2192[arg2.field57] & 0x4) != 0 && arg2.field56 < 0) {
            int var8 = this.field3211.field2198[arg2.field57] / class506.field7397;
            while (true) {
                int var9 = (var8 + 1048575 - arg2.field59) / var8;
                if (var9 > arg3) {
                    arg2.field59 += arg3 * var8;
                    break;
                }
                arg2.field69.method231(arg0, arg5, var9);
                arg3 -= var9;
                arg5 += var9;
                arg2.field59 += var8 * var9 - 1048576;
                int var10 = class506.field7397 / 100;
                int var11 = 262144 / var8;
                if (var10 > var11) {
                    var10 = var11;
                }
                class477 var12 = arg2.field69;
                if (this.field3211.field2207[arg2.field57] == 0) {
                    arg2.field69 = class477.method2808(arg2.field65, var12.method2805(), var12.method2817(), var12.method2806());
                } else {
                    arg2.field69 = class477.method2808(arg2.field65, var12.method2805(), 0, var12.method2806());
                    this.field3211.method1027(arg2.field49.field5462[arg2.field63] < 0, arg2, 4233);
                    arg2.field69.method2810(var10, var12.method2817());
                }
                if (arg2.field49.field5462[arg2.field63] < 0) {
                    arg2.field69.method2825(-1);
                }
                var12.method2793(var10);
                var12.method231(arg0, arg5, arg4 - arg5);
                if (var12.method2794()) {
                    this.field3216.method293(var12);
                }
            }
        }
        arg2.field69.method231(arg0, arg5, arg3);
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lbr;)V")
    public class229(class146 arg0) {
        this.field3211 = arg0;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3207[var1] = var0 - 1;
            var0 += var0;
        }
        new class157("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field3217 = new class157("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");
    }
}
