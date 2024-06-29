import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class365 extends class212 {

    @OriginalMember(owner = "client!qt", name = "Q", descriptor = "[I")
    public static int[] field5174 = new int[3];

    @OriginalMember(owner = "client!qt", name = "S", descriptor = "I")
    public static int field5176 = 2;

    @OriginalMember(owner = "client!qt", name = "P", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!qt", name = "R", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!qt", name = "T", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "(I)V")
    public static void method2204(int arg0) {
        field5174 = null;
        if (arg0 != 27871) {
            method2205('\u001b', -64);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(CI)B")
    public static final byte method2205(char arg0, int arg1) {
        if (arg1 < 67) {
            return -91;
        }
        field5173++;
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIII)V")
    public static final void method2206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 352) {
            method2205('.', 99);
        }
        class106.field1777 = arg3;
        class270.field3979 = arg5;
        class127.field2089 = arg4;
        class378.field5560 = arg2;
        class424.field6204 = arg1;
        field5177++;
        if (class106.field1777 >= 100) {
            int var6 = class127.field2089 * 128 + 64;
            int var7 = class424.field6204 * 128 + 64;
            int var8 = class355.method2160(var6, var7, class545.field7583, (byte) 103) - class270.field3979;
            int var9 = var6 - class545.field7584;
            int var10 = var8 - class448.field6535;
            int var11 = var7 - class216.field3274;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class217.field3284 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class265.field3862 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            class394.field5910 = 0;
            if (class217.field3284 < 1024) {
                class217.field3284 = 1024;
            }
            if (class217.field3284 > 3072) {
                class217.field3284 = 3072;
            }
        }
        class377.field5547 = 2;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V")
    public static final void method2207(byte arg0) {
        if (arg0 == -114) {
            field5175++;
            if (class599.field8510 == 6) {
                class599.field8510 = 7;
            }
        }
    }

    static {
        new class567("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
    }
}
