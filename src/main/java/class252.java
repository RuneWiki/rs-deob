import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class252 {

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
    public int field3495 = -1;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public int field3492 = 128;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
    public int field3491 = -1;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "Z")
    public boolean field3493 = false;

    @OriginalMember(owner = "client!mv", name = "n", descriptor = "I")
    public int field3503 = 0;

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "Z")
    public boolean field3498 = true;

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
    public int field3500 = 16;

    @OriginalMember(owner = "client!mv", name = "m", descriptor = "I")
    public int field3502 = 127;

    @OriginalMember(owner = "client!mv", name = "p", descriptor = "I")
    public int field3505 = 8;

    @OriginalMember(owner = "client!mv", name = "o", descriptor = "I")
    public int field3504 = -1;

    @OriginalMember(owner = "client!mv", name = "s", descriptor = "I")
    public int field3508 = 1190717;

    @OriginalMember(owner = "client!mv", name = "u", descriptor = "Z")
    public boolean field3510 = true;

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "Lfg;")
    public static class83 field3499;

    @OriginalMember(owner = "client!mv", name = "t", descriptor = "Luf;")
    public static class310 field3509;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
    public int field3497;

    @OriginalMember(owner = "client!mv", name = "r", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!mv", name = "l", descriptor = "Ldb;")
    public class210 field3501;

    @OriginalMember(owner = "client!mv", name = "v", descriptor = "Lvh;")
    public static class240 field3511;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "[Lnq;")
    public static class319[] field3490;

    @OriginalMember(owner = "client!mv", name = "q", descriptor = "[Lf;")
    public static class529[] field3506;

    static {
        new class83("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field3499 = new class83("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");
        field3509 = new class310(108, -1);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)V", line = 7)
    public static void method1480(byte arg0) {
        field3499 = null;
        field3506 = null;
        field3490 = null;
        if (arg0 <= 83) {
            field3490 = null;
        }
        field3509 = null;
        field3511 = null;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Llh;Z)V", line = 39)
    public final void method1481(class365 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method2099(255);
            if (var3 == 0) {
                if (!arg1) {
                    this.field3495 = 36;
                }
                field3496++;
                return;
            }
            this.method1483(var3, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V", line = 68)
    public final void method1482(int arg0) {
        if (this.field3495 == -1) {
            this.field3495 = this.field3504;
        }
        this.field3505 = this.field3505 << 8 | this.field3497;
        if (arg0 != 7818) {
            this.method1483(17, false, null);
        }
        field3507++;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZLlh;)V", line = 117)
    private final void method1483(int arg0, boolean arg1, class365 arg2) {
        if (arg0 == 1) {
            this.field3503 = class113.method724((byte) 95, arg2.method2111(-2));
        } else if (arg0 == 2) {
            this.field3504 = arg2.method2099(255);
        } else if (arg0 == 3) {
            this.field3504 = arg2.method2062((byte) 14);
            if (this.field3504 == 65535) {
                this.field3504 = -1;
            }
        } else if (arg0 == 5) {
            this.field3510 = false;
        } else if (arg0 == 7) {
            this.field3491 = class113.method724((byte) 111, arg2.method2111(-2));
        } else if (arg0 == 8) {
            this.field3501.field2981 = this.field3497;
        } else if (arg0 == 9) {
            this.field3492 = arg2.method2062((byte) 14) << 0;
        } else if (arg0 == 10) {
            this.field3498 = false;
        } else if (arg0 == 11) {
            this.field3505 = arg2.method2099(255);
        } else if (arg0 == 12) {
            this.field3493 = true;
        } else if (arg0 == 13) {
            this.field3508 = arg2.method2111(-2);
        } else if (arg0 == 14) {
            this.field3500 = arg2.method2099(255);
        } else if (arg0 == 15) {
            this.field3495 = arg2.method2062((byte) 14);
            if (this.field3495 == 65535) {
                this.field3495 = -1;
            }
        } else if (arg0 == 16) {
            this.field3502 = arg2.method2099(255);
        }
        field3494++;
        if (!arg1) {
            this.method1483(-108, false, null);
        }
    }
}
