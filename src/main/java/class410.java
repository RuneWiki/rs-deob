import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class410 {

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field5953 = 0;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Lar;")
    public static class425 field5954 = new class425();

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBI)V")
    public static final void method2591(int arg0, byte arg1, int arg2) {
        if (arg1 <= 87) {
            method2594((byte) 8);
        }
        field5958++;
        class440 var3 = class186.method1241(arg0, 5, (byte) 56);
        var3.method2756(-1369656528);
        var3.field6375 = arg2;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZIZI)V")
    public static final void method2592(boolean arg0, int arg1, boolean arg2, int arg3) {
        field5955++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class25.field449 = arg2;
        class388.field5673 = arg3;
        class429.field6234 = arg1;
        if (arg0) {
            field5954 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static final void method2593(int arg0) {
        class8.field106 = "Veuillez patienter...";
        class271.field3993 = "Chargement de RuneScape en cours - veuillez patienter...";
        class68.field991 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class421.field6114 = "Connexion perdue.";
        class74.field1041 = " ";
        class337.field4982 = "Examiner";
        class143.field1810 = "rouge:";
        class316.field4623 = "Prendre";
        class115.field1500 = "Chargement des textures - ";
        class190.field2649 = "tremblement:";
        class399.field5848 = "clignotant1:";
        class234.field3258 = "brillant3:";
        class431.field6271 = "glissement:";
        class385.field5634 = "OK";
        class8.field110 = "déroulement:";
        class252.field3694 = "Interfaces chargées";
        class297.field4489 = "Textures chargées";
        class399.field5845 = "Mémoire en cours d'attribution";
        class188.field2567 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class331.field4879 = " est déjà dans votre liste noire.";
        class447.field6427 = "Jeter";
        class258.field3802 = "M";
        class95.field1298 = "Veuillez commencer par supprimer ";
        class255.field3715 = "vert:";
        class355.field5258 = "Chargement des paramètres par défaut - ";
        class45.field689 = "Variables du client chargées";
        class144.field1848 = "Chargement des fichiers config - ";
        class305.field4558 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class398.field5822 = "brillant1:";
        class274.field4027 = "Chargement de l'écran-titre - ";
        class325.field4820 = "Chargement en cours...";
        class328.field4846 = "Paramètres par défaut chargés";
        class175.field2370 = "Impossible de trouver ";
        class109.field1423 = "Regarder dans cette direction";
        class110.field1433 = "blanc:";
        class423.field6161 = "ondulation2:";
        if (arg0 > -109) {
            return;
        }
        class48.field727 = "Fermer";
        class398.field5835 = "Chargement de Mechscape en cours - veuillez patienter...";
        class296.field4472 = "Liste des serveurs chargée";
        class129.field1687 = "Gestionnaire de saisie chargé";
        class257.field3765 = "Chargement de la liste des serveurs";
        class393.field5728 = "Démarrage de la librairie 3D";
        class69.field997 = "Liste des mises à jour chargée";
        class113.field1460 = " s'est connecté.";
        class429.field6239 = "Utiliser";
        class7.field97 = "classement ";
        class122.field1583 = "cyan:";
        class25.field453 = "Librairie 3D démarrée";
        class108.field1419 = " est déjà dans votre liste d'amis.";
        class106.field1396 = "Veuillez commencer par supprimer ";
        class244.field3437 = "Atteindre";
        class195.field2706 = "Chargement du module texte - ";
        class230.field3162 = "Connecté au serveur de mise à jour";
        class447.field6435 = "Écran-titre chargé";
        class263.field3859 = "Monde de jeu créé";
        class104.field1358 = "niveau ";
        class21.field377 = "brillant2:";
        class353.field5233 = "K";
        class133.field1745 = " s'est déconnecté.";
        class128.field1667 = "violet:";
        class165.field2240 = "Chargement en cours. Veuillez patienter.";
        class27.field463 = "Continuer";
        class63.field945 = "Sprites chargés";
        class447.field6444 = "Attaquer";
        class126.field1648 = "Poser";
        class118.field1531 = "M";
        class366.field5401 = " de votre liste noire.";
        class397.field5798 = "Vérification des mises à jour - ";
        class192.field2679 = "Votre liste noire est pleine (100 noms maximum).";
        field5956++;
        class101.field1327 = "clignotant2:";
        class361.field5342 = "Caché";
        class249.field3683 = "clignotant3:";
        class450.field6452 = "Chargement des polices - ";
        class7.field102 = "Annuler";
        class320.field4761 = "jaune:";
        class72.field1025 = "Connexion au serveur de mise à jour en cours";
        class278.field4084 = " autres options";
        class25.field445 = "Veuillez patienter - tentative de rétablissement.";
        class353.field5236 = "Fichiers config chargés";
        class355.field5257 = "Mémoire attribuée";
        class248.field3641 = "ondulation:";
        class20.field359 = "compétence ";
        class352.field5223 = "Chargement des sprites - ";
        class6.field82 = "Module texte chargé";
        class338.field4986 = "Moteur son préparé";
        class295.field4451 = "Écran-titre ouvert";
        class271.field3995 = " de votre liste d'amis.";
        class249.field3685 = "Chargement des interfaces - ";
        class337.field4983 = "Choisir une option";
        class15.field239 = "Polices chargées";
        class69.field995 = "Sélectionner";
        class338.field4999 = "K";
        class95.field1282 = "Objet d'abonnés";
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public static void method2594(byte arg0) {
        if (arg0 <= -35) {
            field5954 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lca;")
    public static final class154 method2595(int arg0, int arg1) {
        if (arg0 != -22867) {
            method2591(102, (byte) -34, -85);
        }
        field5957++;
        class154 var2 = (class154) class145.field1853.method2348(112, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class267.field3958.method1235(11, false, arg1);
        class154 var4 = new class154();
        if (var3 != null) {
            var4.method1037(new class341(var3), (byte) -113);
        }
        class145.field1853.method2350(var4, (long) arg1, -123);
        return var4;
    }
}
