import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class83 extends class120 {

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public int field1296 = -1;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public int field1308 = 0;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "Z")
    public static volatile boolean field1311 = true;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public int field1298;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public int field1300;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public int field1302;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public int field1303;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public int field1304;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public int field1305;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public int field1306;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public int field1309;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public int field1310;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)Lja;")
    public static final class59 method577(int arg0, int arg1, int arg2) {
        class49 var3 = class90.field1382[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class59 var4 = var3.field630;
            var3.field630 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([Lfg;ILdl;)V")
    public static final void method578(class12[] arg0, int arg1, class123 arg2) {
        field1301++;
        class93.field1442 = arg0;
        class84.field1312 = arg2;
        class224.field3628 = new boolean[class93.field1442.length];
        class4.field63.method346(true);
        int var3 = class84.field1312.method813("details", -1);
        int[] var4 = class84.field1312.method817((byte) 86, var3);
        for (int var5 = 0; var5 < var4.length; var5++) {
            class4.field63.method349(class167.method1146(new class25(class84.field1312.method807((byte) 113, var4[var5], var3)), -1), true);
        }
        if (arg1 < 49) {
            method578((class12[]) null, 108, (class123) null);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(Z)V")
    public static final void method579(boolean arg0) {
        class139.field2045 = "clignotant2:";
        class16.field194 = "Interfaces chargées";
        class90.field1377 = "Jeter";
        class270.field4295 = "M";
        class203.field3180 = "clignotant1:";
        class199.field3122 = "Monde de jeu créé";
        class86.field1366 = "Choisir une option";
        class227.field3673 = "Liste des serveurs chargée";
        class16.field189 = "compétence ";
        class261.field4214 = " de votre liste d'amis.";
        class174.field2725 = "Fichiers config chargés";
        class271.field4305 = "Veuillez commencer par supprimer ";
        class278.field4422 = "Continuer";
        class274.field4374 = "Fermer";
        class140.field2063 = "Chargement en cours...";
        class102.field1588 = "Chargement des polices - ";
        class130.field1911 = "Poser";
        class10.field135 = "ondulation2:";
        class225.field3643 = "Chargement des interfaces - ";
        if (arg0) {
            field1311 = false;
        }
        class253.field4088 = "blanc:";
        class172.field2702 = "Examiner";
        class154.field2300 = " est déjà dans votre liste d'amis.";
        class131.field1928 = "glissement:";
        class173.field2714 = " est déjà dans votre liste noire.";
        class157.field2420 = "jaune:";
        class241.field3861 = "niveau ";
        class148.field2195 = "voudrait faire un échange avec vous.";
        class56.field796 = "OK";
        class216.field3534 = "Impossible de trouver ";
        class45.field575 = "Chargement de l'écran-titre - ";
        class218.field3547 = "Utiliser";
        class130.field1910 = "Veuillez patienter - tentative de rétablissement.";
        class50.field678 = "K";
        class106.field1632 = "déroulement:";
        class224.field3622 = "Librairie 3D démarrée";
        class54.field738 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class286.field4540 = "Textures chargées";
        class58.field813 = "Veuillez patienter...";
        class262.field4238 = "Attaquer";
        class13.field169 = "brillant2:";
        class84.field1313 = "Regarder dans cette direction";
        class227.field3671 = "Vérification des mises à jour - ";
        class228.field3689 = "tremblement:";
        class60.field838 = "Polices chargées";
        class26.field367 = "Veuillez commencer par supprimer ";
        class152.field2260 = "M";
        class198.field3110 = " autres options";
        class232.field3731 = "Module texte chargé";
        class257.field4157 = "Écran-titre ouvert";
        class218.field3551 = "Votre liste noire est pleine (100 noms maximum).";
        class178.field2780 = "Sélectionner";
        class29.field394 = " de votre liste noire.";
        class186.field2908 = "Moteur son préparé";
        class102.field1586 = " s'est connecté.";
        class80.field1147 = "clignotant3:";
        class115.field1704 = "Gestionnaire de saisie chargé";
        class161.field2506 = "Objet d'abonnés";
        class35.field450 = "classement ";
        class72.field1017 = "Prendre";
        class155.field2305 = "Chargement des sprites - ";
        class62.field855 = "Chargement de RuneScape en cours - veuillez patienter...";
        class33.field425 = "K";
        class227.field3659 = "Connexion au serveur de mise à jour en cours";
        class165.field2559 = "Chargement en cours. Veuillez patienter.";
        class51.field707 = " s'est déconnecté.";
        field1297++;
        class92.field1403 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class13.field176 = "Caché";
        class134.field1951 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class223.field3604 = " ";
        class178.field2782 = "rouge:";
        class258.field4164 = "Sprites chargés";
        class198.field3111 = "cyan:";
        class47.field600 = "vert:";
        class10.field146 = "brillant3:";
        class239.field3819 = "Chargement des fichiers config - ";
        class110.field1666 = "Démarrage de la librairie 3D";
        class248.field3971 = "Chargement des textures - ";
        class16.field187 = "Chargement de la liste des serveurs";
        class159.field2441 = "Atteindre";
        class202.field3161 = "Liste des mises à jour chargée";
        class272.field4319 = "violet:";
        class47.field602 = "Connexion perdue.";
        class290.field4581 = "Annuler";
        class276.field4395 = "Connecté au serveur de mise à jour";
        class274.field4372 = "brillant1:";
        class162.field2518 = "Écran-titre chargé";
        class211.field3307 = "Chargement du module texte - ";
        class189.field2979 = "ondulation:";
        class128.field1882 = "Mémoire attribuée";
        class211.field3290 = "Mémoire en cours d'attribution";
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILdl;Ldl;)V")
    public static final void method580(int arg0, class123 arg1, class123 arg2) {
        if (arg0 != -13168) {
            method580(-102, (class123) null, (class123) null);
        }
        field1307++;
        class144.field2118 = class264.method1810(arg1, true, class102.field1589, 0, arg2);
        class49.field628 = (class166) class144.field2118;
        class279.field4433 = class264.method1810(arg1, true, class146.field2156, 0, arg2);
        class232.field3734 = class264.method1810(arg1, true, class232.field3727, 0, arg2);
    }
}
