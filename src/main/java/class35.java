import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class35 {

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public int field547 = 0;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field546 = "Connected to update server";

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "[Lbl;")
    public static class33[] field548 = new class33[2048];

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILog;)V")
    public final void method290(int arg0, class221 arg1) {
        while (true) {
            int var3 = arg1.method1517((byte) -96);
            if (var3 == 0) {
                if (arg0 != 19552) {
                    method293(-100);
                }
                field549++;
                return;
            }
            this.method292(5, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static void method291(int arg0) {
        if (arg0 != 5) {
            method293(-8);
        }
        field548 = null;
        field546 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILog;I)V")
    private final void method292(int arg0, class221 arg1, int arg2) {
        if (arg0 == arg2) {
            this.field547 = arg1.method1521((byte) 113);
        }
        field544++;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
    public static final void method293(int arg0) {
        class248.field3963 = "Connexion perdue.";
        class100.field1641 = "Mémoire attribuée";
        class154.field2494 = " est déjà dans votre liste d'amis.";
        class53.field915 = "voudrait faire un échange avec vous.";
        class284.field4484 = "Chargement en cours...";
        class122.field1977 = "Liste des serveurs chargée";
        class118.field1942 = "Écran-titre chargé";
        class48.field861 = "niveau ";
        class197.field3151 = "blanc:";
        class68.field1130 = "clignotant1:";
        class164.field2600 = "brillant2:";
        class78.field1245 = " autres options";
        class27.field430 = "Chargement des polices - ";
        class183.field2870 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class158.field2549 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class61.field997 = "cyan:";
        class19.field334 = "déroulement:";
        class119.field1954 = "compétence ";
        class113.field1886 = "rouge:";
        class108.field1784 = "Veuillez commencer par supprimer ";
        class284.field4479 = " s'est déconnecté.";
        class175.field2735 = "violet:";
        class91.field1496 = "jaune:";
        class135.field2194 = "brillant1:";
        class288.field4561 = "Examiner";
        class13.field239 = "classement ";
        class47.field849 = "Choisir une option";
        class193.field3099 = "Vérification des mises à jour - ";
        class49.field869 = "Librairie 3D démarrée";
        class247.field3933 = "Mémoire en cours d'attribution";
        class78.field1247 = "Attaquer";
        class113.field1890 = "brillant3:";
        class282.field4474 = "Connexion au serveur de mise à jour en cours";
        class72.field1169 = "clignotant2:";
        class213.field3482 = "OK";
        class41.field756 = "K";
        class1.field30 = "Chargement en cours. Veuillez patienter.";
        class13.field236 = "Liste des mises à jour chargée";
        class200.field3193 = "Utiliser";
        class282.field4467 = "Textures chargées";
        class141.field2284 = "Veuillez patienter...";
        field550++;
        class85.field1347 = "Chargement des interfaces - ";
        class248.field3956 = "Polices chargées";
        class24.field400 = "Jeter";
        class284.field4483 = "Continuer";
        class141.field2281 = "Chargement des fichiers config - ";
        class212.field3472 = "Démarrage de la librairie 3D";
        class154.field2487 = " ";
        class106.field1705 = "Votre liste noire est pleine (100 noms maximum).";
        class115.field1922 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class6.field78 = "tremblement:";
        class100.field1644 = "ondulation:";
        class33.field535 = "Fichiers config chargés";
        class34.field536 = "M";
        class136.field2240 = " est déjà dans votre liste noire.";
        class184.field2888 = "Veuillez commencer par supprimer ";
        class220.field3595 = "Écran-titre ouvert";
        class264.field4212 = "Veuillez patienter - tentative de rétablissement.";
        class73.field1198 = "Chargement de la liste des serveurs";
        class126.field2045 = "Prendre";
        class105.field1685 = "Chargement du module texte - ";
        if (arg0 != 0) {
            method293(24);
        }
        class99.field1639 = "Module texte chargé";
        class34.field538 = " de votre liste noire.";
        class63.field1033 = "Gestionnaire de saisie chargé";
        class42.field782 = "Fermer";
        class14.field247 = "Interfaces chargées";
        class45.field826 = "Atteindre";
        class281.field4448 = "Chargement de RuneScape en cours - veuillez patienter...";
        class285.field4508 = "Regarder dans cette direction";
        class53.field920 = "Poser";
        class50.field885 = "Chargement des sprites - ";
        class83.field1304 = "Chargement de l'écran-titre - ";
        class236.field3845 = "Sélectionner";
        class288.field4562 = "Impossible de trouver ";
        class98.field1608 = " de votre liste d'amis.";
        field546 = "Connecté au serveur de mise à jour";
        class248.field3969 = "clignotant3:";
        class206.field3297 = "Moteur son préparé";
        class73.field1190 = "Sprites chargés";
        class173.field2722 = "vert:";
        class153.field2467 = "ondulation2:";
        class219.field3580 = "Annuler";
        class148.field2362 = "glissement:";
        class273.field4301 = "K";
        class179.field2824 = "Monde de jeu créé";
        class270.field4256 = "M";
        class78.field1256 = "Chargement des textures - ";
        class225.field3729 = " s'est connecté.";
        class185.field2935 = "Objet d'abonnés";
        class244.field3914 = "Caché";
    }
}
