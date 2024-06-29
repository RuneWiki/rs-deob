import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class255 {

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Lkn;")
    public static class442 field3587;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "[I")
    public static int[] field3589;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "Lsg;")
    public static class226 field3588;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Lqe;")
    public static class275 field3585;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1696(int arg0, int arg1, int arg2, int arg3) {
        if (!class280.method1830(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class375.field5354[arg0].method737(arg1, arg2) - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class17.field313) {
                    if (!class181.method1184(var4, var6, var5)) {
                        return false;
                    }
                    if (!class181.method1184(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class181.method1184(var4, var7, var5)) {
                        return false;
                    }
                    if (!class181.method1184(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class181.method1184(var4, var8, var5)) {
                    return false;
                }
                if (!class181.method1184(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class247.field3494) {
                    if (!class181.method1184(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class181.method1184(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class181.method1184(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class181.method1184(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class181.method1184(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class181.method1184(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class17.field313) {
                    if (!class181.method1184(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class181.method1184(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class181.method1184(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class181.method1184(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class181.method1184(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class181.method1184(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class247.field3494) {
                    if (!class181.method1184(var4, var6, var5)) {
                        return false;
                    }
                    if (!class181.method1184(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class181.method1184(var4, var7, var5)) {
                        return false;
                    }
                    if (!class181.method1184(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class181.method1184(var4, var8, var5)) {
                    return false;
                }
                if (!class181.method1184(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class181.method1184(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class181.method1184(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class181.method1184(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class181.method1184(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class181.method1184(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public static void method1697(int arg0) {
        if (arg0 >= 16) {
            field3587 = null;
            field3588 = null;
            field3585 = null;
            field3589 = null;
        }
    }

    static {
        new class442("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field3587 = new class442(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");
        new class442("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        new class442("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field3589 = new int[] { 16, 32, 64, 128 };
    }
}
