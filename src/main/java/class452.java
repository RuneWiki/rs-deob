import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class452 extends class496 {

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public int field6592;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public int field6594;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public int field6595;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public int field6596;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public int field6597;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public int field6598;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public int field6599;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public int field6600;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public int field6601;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public int field6602;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public int field6603;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public int field6604;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public int field6605;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public int field6606;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public int field6608;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wc", name = "A", descriptor = "Ljava/lang/Class;")
    public static Class field6609;

    // $FF: synthetic method
    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2724(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class487("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLqa;I)Lr;", line = 6)
    public final class520 method2722(byte arg0, class167 arg1, int arg2) {
        if (arg0 > -93) {
            return null;
        }
        field6593++;
        int var4 = class604.field8894[this.field6596];
        class520 var5 = null;
        if (var4 == 0) {
            class578 var6 = class491.method2972(this.field6605, this.field6602, this.field6597);
            if (var6 instanceof class431) {
                class431 var7 = (class431) var6;
                if (var7.field6312 != null) {
                    var5 = ((class438) var7.field6312).method161((byte) -127, arg2, arg1);
                }
            }
        } else if (var4 == 1) {
            class73 var8 = class427.method2549(this.field6605, this.field6602, this.field6597);
            if (var8 instanceof class50) {
                class50 var9 = (class50) var8;
                if (var9.field585 != null) {
                    var5 = ((class438) var9.field585).method161((byte) -127, arg2, arg1);
                }
            }
        } else if (var4 == 2) {
            class237 var10 = class488.method2956(this.field6605, this.field6602, this.field6597, field6609 == null ? (field6609 = method2724("ej")) : field6609);
            if (var10 instanceof class34) {
                class34 var11 = (class34) var10;
                if (var11.field367 != null) {
                    var5 = ((class438) var11.field367).method161((byte) -127, arg2, arg1);
                }
            }
        } else if (var4 == 3) {
            class33 var12 = class287.method1784(this.field6605, this.field6602, this.field6597);
            if (var12 instanceof class46) {
                class46 var13 = (class46) var12;
                if (var13.field538 != null) {
                    var5 = ((class438) var13.field538).method161((byte) -127, arg2, arg1);
                }
            }
        }
        return var5 == null ? null : var5.method369((byte) 0, arg2, true);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 114)
    public static final void method2723(int arg0, int arg1, int arg2, Class arg3) {
        class415 var4 = class526.field7777[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class639 var5 = var4.field5981; var5 != null; var5 = var5.field9291) {
            class237 var6 = var5.field9288;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field3469 == arg1 && var6.field3472 == arg2) {
                class35.method177(var6);
                return;
            }
        }
    }
}
