import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class106 {

    @OriginalMember(owner = "client!g", name = "i", descriptor = "[C")
    public static char[] field1560 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public int field1553;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public int field1555;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    private int field1559;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lul;")
    public class402 field1552;

    static {
        new class304("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lmd;II)V", line = 4)
    private final void method740(class379 arg0, int arg1, int arg2) {
        field1557++;
        if (arg2 != -3) {
            this.method745(-57);
        }
        if (arg1 == 1) {
            this.field1559 = arg0.method2212((byte) 83);
        } else if (arg1 == 2) {
            this.field1555 = arg0.method2238(arg2 ^ 0xFFFFFF02);
            this.field1553 = arg0.method2238(255);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V", line = 29)
    public static void method741(boolean arg0) {
        if (!arg0) {
            method744((byte) -126, null);
        }
        field1560 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLmd;)V", line = 41)
    public final void method742(byte arg0, class379 arg1) {
        while (true) {
            int var3 = arg1.method2238(255);
            if (var3 == 0) {
                field1554++;
                if (arg0 != 12) {
                    field1560 = null;
                    return;
                }
                return;
            }
            this.method740(arg1, var3, arg0 - 15);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)I", line = 61)
    public static int method743(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLjava/lang/String;)I", line = 68)
    public static final int method744(byte arg0, String arg1) {
        field1556++;
        if (arg0 < 35) {
            field1560 = null;
        }
        for (int var2 = 0; var2 < class327.field4326.length; var2++) {
            if (class327.field4326[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Lfq;", line = 92)
    public final synchronized class134 method745(int arg0) {
        field1558++;
        class134 var2 = (class134) this.field1552.field5396.method1456((long) this.field1559, arg0 ^ 0x7D);
        if (var2 != null) {
            return var2;
        }
        class134 var3 = class134.method939(this.field1552.field5391, this.field1559, 0);
        if (var3 != null) {
            this.field1552.field5396.method1462(var3, (long) this.field1559, -15);
        }
        if (arg0 != 0) {
            this.field1559 = 7;
        }
        return var3;
    }
}
