import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class190 extends class70 {

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "J")
    public long field3220;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field3224 = 0;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public static int field3226 = 0;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    public static volatile int field3228 = 0;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "Lak;")
    public static class345 field3225;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "[I")
    public static int[] field3227;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V", line = 11)
    public static void method1315(int arg0) {
        field3225 = null;
        field3227 = null;
        if (arg0 != 4593) {
            field3227 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V", line = 21)
    public class190() {
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(J)V", line = 23)
    public class190(long arg0) {
        this.field3220 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(CI)C", line = 34)
    public static final char method1316(char arg0, int arg1) {
        field3222++;
        if (arg1 != 18864) {
            return 'r';
        } else if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V", line = 64)
    public static final void method1317(int arg0) {
        class16.field463 = "Prendre";
        class23.field577 = "Mémoire en cours d'attribution";
        class353.field5648 = "Attaquer";
        class87.field1526 = "Chargement des sprites - ";
        class103.field1888 = "rouge:";
        class19.field508 = "Votre liste noire est pleine (100 noms maximum).";
        class232.field3800 = "K";
        class278.field4541 = "niveau ";
        class36.field793 = "M";
        class332.field5296 = "Jeter";
        class229.field3759 = "Chargement du module texte - ";
        class257.field4205 = "cyan:";
        class73.field1333 = "brillant1:";
        class104.field1906 = "Chargement des paramètres par défaut - ";
        class73.field1332 = "Paramètres par défaut chargés";
        class18.field493 = "Démarrage de la librairie 3D";
        class44.field914 = "Vérification des mises à jour - ";
        class266.field4350 = "Atteindre";
        class145.field2430 = " ";
        class331.field5287 = "Poser";
        class167.field2791 = "clignotant2:";
        class73.field1341 = "Objet d'abonnés";
        class21.field547 = "Examiner";
        class312.field5099 = "jaune:";
        class1.field24 = "glissement:";
        class103.field1887 = " s'est connecté.";
        class137.field2342 = "Annuler";
        class61.field1194 = "Chargement des fichiers config - ";
        class105.field1919 = "Chargement de la liste des serveurs";
        class59.field1153 = "blanc:";
        class194.field3265 = "Polices chargées";
        class176.field2923 = "Monde de jeu créé";
        class339.field5378 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class275.field4484 = "Interfaces chargées";
        class174.field2893 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class298.field4850 = "vert:";
        class19.field514 = "Veuillez commencer par supprimer ";
        class25.field655 = "ondulation2:";
        class272.field4435 = "Liste des serveurs chargée";
        class13.field398 = "Moteur son préparé";
        class255.field4174 = "clignotant1:";
        class112.field2050 = "Veuillez patienter - tentative de rétablissement.";
        class147.field2510 = "tremblement:";
        class346.field5528 = "classement ";
        class18.field491 = "Gestionnaire de saisie chargé";
        class56.field1108 = "Sélectionner";
        class53.field1059 = "M";
        class284.field4645 = "Chargement en cours. Veuillez patienter.";
        class363.field5744 = "Utiliser";
        class159.field2691 = "Connexion au serveur de mise à jour en cours";
        class119.field2114 = "Fichiers config chargés";
        class170.field2815 = "Librairie 3D démarrée";
        class36.field789 = "compétence ";
        class137.field2336 = "Fermer";
        class166.field2782 = "Écran-titre chargé";
        class111.field2034 = " de votre liste d'amis.";
        class160.field2710 = " de votre liste noire.";
        class173.field2875 = "Continuer";
        class152.field2598 = "Chargement des polices - ";
        class316.field5148 = " s'est déconnecté.";
        class52.field1053 = "Veuillez patienter...";
        class6.field128 = "ondulation:";
        class114.field2055 = "Chargement des interfaces - ";
        class231.field3787 = "Impossible de trouver ";
        class362.field5732 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class220.field3650 = "violet:";
        class47.field951 = "Veuillez commencer par supprimer ";
        class158.field2680 = "Module texte chargé";
        if (arg0 != 69) {
            return;
        }
        class28.field687 = "K";
        client.field4592 = "Chargement de l'écran-titre - ";
        class87.field1525 = "Chargement des textures - ";
        class73.field1331 = "Chargement en cours...";
        class344.field5438 = "brillant3:";
        class20.field518 = "Choisir une option";
        class358.field5688 = "Mémoire attribuée";
        class6.field194 = "Connexion perdue.";
        field3221++;
        class180.field2959 = " est déjà dans votre liste noire.";
        class55.field1089 = "Liste des mises à jour chargée";
        class260.field4249 = "OK";
        class338.field5354 = "Regarder dans cette direction";
        class132.field2269 = "Chargement de RuneScape en cours - veuillez patienter...";
        class338.field5361 = "Connecté au serveur de mise à jour";
        class348.field5564 = "clignotant3:";
        class267.field4374 = "Sprites chargés";
        class71.field1315 = "brillant2:";
        class306.field4977 = "Textures chargées";
        client.field4581 = "déroulement:";
        class78.field1385 = " autres options";
        class47.field954 = "Caché";
        class334.field5328 = "Écran-titre ouvert";
        class144.field2419 = " est déjà dans votre liste d'amis.";
        class235.field3848 = "Chargement de Mechscape en cours - veuillez patienter...";
    }
}
