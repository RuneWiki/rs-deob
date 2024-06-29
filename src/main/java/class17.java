import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class17 {

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "Lvq;")
    public static class24 field261 = new class24(30, 8);

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "Lbn;")
    public static class160 field269 = new class160(35, -1);

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "B")
    public byte field266;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "B")
    public byte field270;

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "B")
    public byte field274;

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "B")
    public byte field275;

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "B")
    public byte field276;

    @OriginalMember(owner = "client!qr", name = "t", descriptor = "B")
    public byte field277;

    @OriginalMember(owner = "client!qr", name = "v", descriptor = "B")
    public byte field279;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "S")
    public short field259;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "Z")
    public boolean field260;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "Z")
    public boolean field262;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "Z")
    public boolean field263;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "Z")
    public boolean field267;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "Z")
    public boolean field268;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "Z")
    public boolean field271;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "Z")
    public boolean field272;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "Z")
    public boolean field273;

    @OriginalMember(owner = "client!qr", name = "u", descriptor = "Z")
    public boolean field278;

    static {
        new class409("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        new class409("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V", line = 6)
    public static final void method222(int arg0) {
        field258++;
        if (arg0 == -9916) {
            class401.field5795.method2307(arg0 + 9949);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 32)
    public static final String method223(int arg0, String arg1) {
        field264++;
        if (arg1 == null) {
            return null;
        }
        int var2 = arg0;
        int var3 = arg1.length();
        while (var2 < var3 && class417.method2585((byte) -110, arg1.charAt(var2))) {
            var2++;
        }
        while (var2 < var3 && class417.method2585((byte) -110, arg1.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class337.method2184(-68, var7)) {
                char var8 = class154.method1052(var7, -7931);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V", line = 86)
    public static void method224(byte arg0) {
        field269 = null;
        int var1 = 60 % ((36 - arg0) / 45);
        field261 = null;
    }
}
