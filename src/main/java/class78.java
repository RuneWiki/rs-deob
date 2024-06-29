import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class78 {

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "[[I")
    public static int[][] field1180;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)J")
    public static final long method531(int arg0, int arg1, int arg2) {
        class113 var3 = class184.field2892[arg0][arg1][arg2];
        return var3 == null || var3.field1640 == null ? 0L : var3.field1640.field4270;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)Z")
    public static final boolean method532(byte arg0) {
        if (arg0 != 91) {
            field1180 = null;
        }
        field1183++;
        try {
            return class146.method996((byte) -119);
        } catch (IOException var4) {
            class9.method50(-105);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class105.field1530 + "," + class158.field2372 + "," + class303.field4812 + " - " + class262.field4252 + "," + (class214.field3347.field3970[0] + class113.field1653) + "," + (class214.field3347.field3972[0] + class5.field77) + " - ";
            for (int var3 = 0; class262.field4252 > var3 && var3 < 50; var3++) {
                var2 = var2 + class175.field2763.field2650[var3] + ",";
            }
            class285.method1952(var5, (byte) 122, var2);
            class222.method1573((byte) -81);
            return true;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
    public static void method533(boolean arg0) {
        if (arg0) {
            field1181 = 125;
        }
        field1180 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZZ)I")
    public static final int method534(boolean arg0, boolean arg1) {
        field1182++;
        if (arg0) {
            method534(true, true);
        }
        long var2 = class98.method665(true);
        for (class290 var4 = arg1 ? (class290) class7.field98.method1065((byte) -59) : (class290) class7.field98.method1066(-126); var4 != null; var4 = (class290) class7.field98.method1066(-125)) {
            if ((var4.field4675 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field4675 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field4018;
                    class299.field4770[var5] = class110.field1596[var5];
                    var4.method1764(64);
                    return var5;
                }
                var4.method1764(64);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static final void method535(int arg0) {
        class303.field4821 = "ondulation:";
        class112.field1622 = "Librairie 3D démarrée";
        class108.field1578 = "rouge:";
        class81.field1246 = "Prendre";
        class126.field1811 = "vert:";
        class56.field821 = "Veuillez patienter - tentative de rétablissement.";
        class158.field2364 = "classement ";
        class19.field265 = " de votre liste d'amis.";
        class309.field4978 = "Chargement des fichiers config - ";
        class125.field1796 = "Fermer";
        class229.field3546 = "OK";
        class186.field2928 = "Votre liste noire est pleine (100 noms maximum).";
        class36.field437 = "Continuer";
        class257.field4192 = "Liste des mises à jour chargée";
        class313.field5021 = "brillant2:";
        class63.field913 = "Chargement des textures - ";
        class126.field1810 = "Sélectionner";
        class119.field1722 = "Textures chargées";
        class86.field1303 = "Sprites chargés";
        class251.field4109 = "Veuillez commencer par supprimer ";
        class313.field5019 = " s'est connecté.";
        class304.field4830 = "M";
        class177.field2783 = "Choisir une option";
        class232.field3752 = "Fichiers config chargés";
        class94.field1405 = "Impossible de trouver ";
        field1179++;
        class294.field4715 = "Démarrage de la librairie 3D";
        class179.field2800 = "Utiliser";
        class196.field3097 = "Connecté au serveur de mise à jour";
        class130.field1867 = "Chargement en cours...";
        if (arg0 != -26) {
            field1180 = null;
        }
        class112.field1619 = "Chargement de Mechscape en cours - veuillez patienter...";
        class186.field2923 = " autres options";
        class252.field4128 = "Poser";
        class161.field2417 = "Chargement des sprites - ";
        class191.field2968 = "Mémoire en cours d'attribution";
        class7.field102 = "Chargement de RuneScape en cours - veuillez patienter...";
        class265.field4307 = "glissement:";
        class79.field1195 = "voudrait faire un échange avec vous.";
        class80.field1216 = "Chargement des paramètres par défaut - ";
        class209.field3267 = "Chargement du module texte - ";
        class169.field2609 = "Interfaces chargées";
        class181.field2844 = "Écran-titre ouvert";
        class228.field3536 = "Chargement des interfaces - ";
        class84.field1295 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class193.field3065 = "Module texte chargé";
        class260.field4238 = "Chargement de l'écran-titre - ";
        class288.field4655 = "Liste des serveurs chargée";
        class245.field3999 = "Mémoire attribuée";
        class254.field4152 = "Écran-titre chargé";
        class146.field2180 = "blanc:";
        class59.field864 = "Chargement des polices - ";
        class66.field973 = "Paramètres par défaut chargés";
        class161.field2414 = "Moteur son préparé";
        class146.field2175 = "ondulation2:";
        class305.field4853 = "compétence ";
        class254.field4151 = "K";
        class33.field397 = "Chargement en cours. Veuillez patienter.";
        class127.field1824 = " est déjà dans votre liste d'amis.";
        class61.field889 = "Attaquer";
        class234.field3789 = "K";
        class272.field4431 = " est déjà dans votre liste noire.";
        class299.field4775 = "Connexion au serveur de mise à jour en cours";
        class21.field277 = "niveau ";
        class161.field2413 = "Regarder dans cette direction";
        class140.field2009 = "clignotant1:";
        class278.field4548 = "cyan:";
        class245.field4001 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class107.field1564 = "Gestionnaire de saisie chargé";
        class238.field3823 = "Vérification des mises à jour - ";
        class298.field4761 = "Examiner";
        class201.field3169 = "Veuillez commencer par supprimer ";
        class10.field150 = "Veuillez patienter...";
        class28.field352 = "Objet d'abonnés";
        class302.field4807 = "M";
        class76.field1164 = "clignotant2:";
        class206.field3231 = " ";
        class50.field638 = "Caché";
        class17.field232 = " de votre liste noire.";
        class162.field2484 = "jaune:";
        class178.field2791 = "Atteindre";
        class58.field855 = "Annuler";
        class288.field4656 = "déroulement:";
        class297.field4747 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class150.field2212 = "brillant1:";
        class310.field4982 = "Connexion perdue.";
        class19.field256 = "clignotant3:";
        class67.field987 = "brillant3:";
        class86.field1309 = "violet:";
        class123.field1766 = "Chargement de la liste des serveurs";
        class6.field85 = "Polices chargées";
        class277.field4494 = "Monde de jeu créé";
        class230.field3559 = "tremblement:";
        class68.field1019 = "Jeter";
        class178.field2792 = " s'est déconnecté.";
    }
}
