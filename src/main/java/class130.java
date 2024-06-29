import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class130 extends class326 {

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "[Z")
    public static boolean[] field1918 = new boolean[5];

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "Z")
    public static boolean field1919 = false;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "J")
    public static long field1916 = 0L;

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "I")
    public static int field1925 = 0;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "Lmc;")
    public static class55 field1915 = new class55();

    @OriginalMember(owner = "client!nb", name = "V", descriptor = "Z")
    public static boolean field1927 = false;

    @OriginalMember(owner = "client!nb", name = "X", descriptor = "Lcd;")
    public static class136 field1929 = null;

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "Ljava/lang/String;")
    public static String field1926 = "glow2:";

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!nb", name = "W", descriptor = "Lug;")
    public static class253 field1928;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(III)V", line = 6)
    public static final void method961(int arg0, int arg1, int arg2) {
        class34 var3 = class91.method656(arg0, -2, arg2);
        field1917++;
        var3.method307(arg2 ^ 0xFFFFB58F);
        var3.field500 = arg1;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V", line = 26)
    public class130() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)[I", line = 30)
    public final int[] method103(int arg0, int arg1) {
        field1920++;
        if (arg0 > -25) {
            method961(-94, 62, -52);
        }
        return class110.field1527;
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V", line = 56)
    public static final void method962(int arg0) {
        class60.field880 = "Veuillez patienter - tentative de rétablissement.";
        class107.field1448 = "brillant1:";
        class59.field853 = "classement ";
        class276.field4264 = "Poser";
        class336.field5238 = "Veuillez patienter...";
        class232.field3623 = "Choisir une option";
        class193.field3078 = "tremblement:";
        class303.field4714 = "Chargement de RuneScape en cours - veuillez patienter...";
        class281.field4348 = "Connexion au serveur de mise à jour en cours";
        class3.field30 = "Connexion perdue.";
        class214.field3384 = "Chargement des sprites - ";
        class326.field5119 = "Librairie 3D démarrée";
        class307.field4790 = "Monde de jeu créé";
        class317.field5022 = "Continuer";
        class246.field3856 = "Objet d'abonnés";
        class60.field892 = "Vérification des mises à jour - ";
        class229.field3589 = "Chargement de l'écran-titre - ";
        class293.field4542 = "Moteur son préparé";
        class127.field1837 = "clignotant1:";
        class77.field1042 = "Chargement du module texte - ";
        class317.field5021 = "Chargement des paramètres par défaut - ";
        class160.field2538 = "OK";
        class129.field1893 = "compétence ";
        class283.field4379 = "violet:";
        class251.field3963 = "Chargement des textures - ";
        class15.field262 = "vert:";
        class325.field5095 = "rouge:";
        class113.field1569 = " ";
        if (arg0 != 2235) {
            field1926 = (String) null;
        }
        class153.field2374 = " est déjà dans votre liste noire.";
        class270.field4198 = "K";
        class4.field39 = "Chargement des polices - ";
        class39.field559 = "ondulation2:";
        class101.field1350 = "Mémoire attribuée";
        class295.field4578 = "voudrait faire un échange avec vous.";
        class6.field125 = "Atteindre";
        class206.field3279 = "Chargement des interfaces - ";
        class339.field5292 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class134.field1965 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class86.field1166 = " de votre liste d'amis.";
        class302.field4646 = "Démarrage de la librairie 3D";
        class48.field628 = "Attaquer";
        class1.field1 = "niveau ";
        class78.field1044 = " autres options";
        class310.field4818 = "Liste des mises à jour chargée";
        class150.field2353 = "Écran-titre ouvert";
        class159.field2480 = " est déjà dans votre liste d'amis.";
        class171.field2814 = "Polices chargées";
        class70.field973 = "K";
        class328.field5145 = "Examiner";
        class310.field4831 = "M";
        field1923++;
        class10.field193 = "Impossible de trouver ";
        class57.field791 = "M";
        class291.field4485 = " s'est connecté.";
        class199.field3170 = "Mémoire en cours d'attribution";
        class216.field3406 = "Veuillez commencer par supprimer ";
        class202.field3219 = "Chargement en cours...";
        class179.field2913 = "Module texte chargé";
        class2.field25 = "blanc:";
        class113.field1583 = " de votre liste noire.";
        class185.field3002 = "Regarder dans cette direction";
        class271.field4208 = "Fermer";
        class126.field1819 = "Chargement en cours. Veuillez patienter.";
        class265.field4140 = "glissement:";
        field1926 = "brillant2:";
        class33.field486 = "Sprites chargés";
        class159.field2514 = " s'est déconnecté.";
        class255.field4038 = "Paramètres par défaut chargés";
        class282.field4357 = "Annuler";
        class71.field983 = "Gestionnaire de saisie chargé";
        class251.field3947 = "clignotant3:";
        class24.field366 = "Utiliser";
        class149.field2336 = "Chargement des fichiers config - ";
        class110.field1517 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class131.field1941 = "Chargement de la liste des serveurs";
        class32.field474 = "Caché";
        class234.field3663 = "Liste des serveurs chargée";
        class1.field5 = "Veuillez commencer par supprimer ";
        class179.field2919 = "Jeter";
        class179.field2905 = "ondulation:";
        class240.field3740 = "Écran-titre chargé";
        class225.field3580 = "clignotant2:";
        class174.field2852 = "déroulement:";
        class333.field5187 = "jaune:";
        class61.field896 = "cyan:";
        class224.field3545 = "Fichiers config chargés";
        class341.field5304 = "Prendre";
        class58.field840 = "Sélectionner";
        class98.field1294 = "brillant3:";
        class291.field4488 = "Votre liste noire est pleine (100 noms maximum).";
        class22.field333 = "Textures chargées";
        class251.field3944 = "Interfaces chargées";
        class141.field2243 = "Connecté au serveur de mise à jour";
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)V", line = 387)
    public static final void method963(int arg0) {
        if (arg0 == 0) {
            class2.field17.method1359(117);
            class138.field2203.method1359(arg0 + 99);
            field1921++;
        }
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(B)V", line = 402)
    public static void method964(byte arg0) {
        field1928 = null;
        if (arg0 > -38) {
            method961(126, 7, -55);
        }
        field1918 = null;
        field1929 = null;
        field1926 = null;
        field1915 = null;
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)Z", line = 417)
    public static final boolean method965(int arg0) {
        field1922++;
        if (class335.field5223) {
            try {
                return !(Boolean) class209.method1531("showingVideoAd", 90, class42.field581.field2181);
            } catch (Throwable var2) {
            }
        }
        return arg0 == 0 ? true : true;
    }
}
