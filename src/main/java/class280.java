import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class280 {

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4328 = " from your friend list first.";

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Z")
    public static boolean field4332 = false;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Lai;")
    public static class126 field4330;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Loh;")
    public static class16 field4327;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIB)V", line = 4)
    public static final void method1997(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field4333++;
        int var6 = class308.method2129(arg0, class195.field3108, class188.field2995, 1252946087);
        int var7 = class308.method2129(arg3, class195.field3108, class188.field2995, 1252946087);
        int var8 = class308.method2129(arg4, class116.field1888, class319.field4965, 1252946087);
        int var9 = class308.method2129(arg1, class116.field1888, class319.field4965, 1252946087);
        int var10 = 31 / ((-arg5 - 4) / 62);
        for (int var11 = var6; var11 <= var7; var11++) {
            class86.method614(arg2, -24891, var9, var8, class102.field1729[var11]);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Ljava/lang/String;", line = 32)
    public static final String method1998(int arg0, int arg1) {
        field4331++;
        if (arg0 <= 114) {
            return (String) null;
        } else if (arg1 >= 999999999) {
            return "*";
        } else {
            return Integer.toString(arg1);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 47)
    public static final void method1999(byte arg0) {
        class101.field1655 = "Textures chargées";
        class124.field1985 = "Prendre";
        class236.field3705 = "Chargement du module texte - ";
        class298.field4716 = "tremblement:";
        class244.field3771 = "brillant2:";
        class57.field913 = "Polices chargées";
        class254.field3943 = "Connecté au serveur de mise à jour";
        class126.field2005 = "rouge:";
        class281.field4336 = "jaune:";
        class118.field1897 = "blanc:";
        class226.field3622 = "ondulation2:";
        class143.field2258 = "Objet d'abonnés";
        class162.field2547 = "Caché";
        field4328 = " de votre liste d'amis.";
        class191.field3059 = "Liste des mises à jour chargée";
        class305.field4779 = "Votre liste noire est pleine (100 noms maximum).";
        class64.field1015 = "Chargement en cours. Veuillez patienter.";
        class281.field4334 = "Sélectionner";
        class43.field762 = "Démarrage de la librairie 3D";
        class273.field4241 = "Gestionnaire de saisie chargé";
        class110.field1826 = "Mémoire attribuée";
        class179.field2831 = "glissement:";
        class77.field1180 = "Veuillez commencer par supprimer ";
        class4.field24 = "Chargement des sprites - ";
        class272.field4209 = "compétence ";
        class57.field917 = "Utiliser";
        class4.field22 = "Liste des serveurs chargée";
        class36.field653 = "Jeter";
        class208.field3334 = "clignotant2:";
        class310.field4879 = "Regarder dans cette direction";
        class60.field942 = "voudrait faire un échange avec vous.";
        class65.field1056 = "classement ";
        if (arg0 >= -56) {
            return;
        }
        class254.field3945 = "clignotant1:";
        class11.field176 = "Continuer";
        class240.field3737 = "Module texte chargé";
        class329.field5084 = "Chargement de l'écran-titre - ";
        class156.field2489 = "Monde de jeu créé";
        class26.field436 = "Poser";
        class73.field1129 = "Écran-titre chargé";
        class115.field1877 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class102.field1724 = " est déjà dans votre liste noire.";
        class115.field1879 = "Annuler";
        class77.field1175 = "Choisir une option";
        class136.field2165 = "brillant1:";
        class54.field861 = "Mémoire en cours d'attribution";
        class317.field4938 = "Fichiers config chargés";
        class120.field1933 = "Interfaces chargées";
        class239.field3725 = "Veuillez commencer par supprimer ";
        class168.field2613 = "brillant3:";
        class19.field357 = "cyan:";
        class294.field4620 = "Librairie 3D démarrée";
        class18.field354 = "Attaquer";
        class26.field433 = " ";
        class20.field384 = "Chargement des fichiers config - ";
        client.field3915 = "OK";
        class107.field1783 = "niveau ";
        class102.field1726 = " autres options";
        class41.field731 = " s'est connecté.";
        class89.field1421 = "Veuillez patienter...";
        class43.field758 = "Atteindre";
        class26.field424 = "Vérification des mises à jour - ";
        class252.field3888 = "clignotant3:";
        class9.field135 = "M";
        class163.field2552 = "Chargement de RuneScape en cours - veuillez patienter...";
        class45.field780 = " s'est déconnecté.";
        class245.field3787 = "violet:";
        class170.field2645 = " est déjà dans votre liste d'amis.";
        class189.field3003 = " de votre liste noire.";
        class107.field1792 = "Connexion perdue.";
        class156.field2476 = "Chargement de la liste des serveurs";
        class284.field4368 = "Connexion au serveur de mise à jour en cours";
        class204.field3236 = "Chargement des textures - ";
        class111.field1836 = "déroulement:";
        class151.field2422 = "Chargement en cours...";
        class176.field2765 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class204.field3238 = "Chargement des polices - ";
        class141.field2244 = "Chargement des interfaces - ";
        class285.field4377 = "Examiner";
        class329.field5086 = "K";
        class85.field1287 = "vert:";
        class48.field804 = "Veuillez patienter - tentative de rétablissement.";
        class291.field4429 = "Impossible de trouver ";
        class41.field733 = "Fermer";
        field4329++;
        class50.field811 = "M";
        class210.field3351 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class220.field3517 = "Sprites chargés";
        class236.field3715 = "Moteur son préparé";
        class176.field2774 = "K";
        class279.field4320 = "ondulation:";
        class204.field3239 = "Écran-titre ouvert";
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V", line = 388)
    public static void method2000(boolean arg0) {
        field4330 = null;
        field4328 = null;
        if (!arg0) {
            field4327 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)I", line = 407)
    public static int method2001(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)V", line = 419)
    public static final void method2002(int arg0, int arg1, int arg2, int arg3) {
        class272 var4 = class60.field946[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class114 var5 = var4.field4219;
        if (var5 != null) {
            var5.field1872 = var5.field1872 * arg3 / 16;
            var5.field1864 = var5.field1864 * arg3 / 16;
        }
    }
}
