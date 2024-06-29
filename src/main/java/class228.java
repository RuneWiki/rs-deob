import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class228 {

    @OriginalMember(owner = "client!re", name = "e", descriptor = "J")
    public long field3564 = 0L;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "[I")
    public static int[] field3568 = new int[100];

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field3576 = -1;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "J")
    public static long field3575 = 0L;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public int field3561;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public int field3563;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public int field3571;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public int field3572;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public int field3574;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Luf;")
    public static class176 field3566;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Lbf;")
    public class205 field3565;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Lbf;")
    public class205 field3570;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "[I")
    public static int[] field3560;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)I")
    public static final int method1511(int arg0, int arg1) {
        if (arg1 != 698681927) {
            method1515(-22, -47, -104);
        }
        field3577++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1512(int arg0, long arg1) {
        field3567++;
        if (arg0 != 0) {
            method1511(-18, -51);
        }
        return class93.method733(arg1, 0);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)Z")
    public static final boolean method1513(int arg0, int arg1, int arg2) {
        int var3 = class5.field98[arg0][arg1][arg2];
        if (-class90.field1449 == var3) {
            return false;
        } else if (class90.field1449 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class80.method630(var4 + 1, class68.field1079[arg0][arg1][arg2], var5 + 1) && class80.method630(var4 + 128 - 1, class68.field1079[arg0][arg1 + 1][arg2], var5 + 1) && class80.method630(var4 + 128 - 1, class68.field1079[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class80.method630(var4 + 1, class68.field1079[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class5.field98[arg0][arg1][arg2] = class90.field1449;
                return true;
            } else {
                class5.field98[arg0][arg1][arg2] = -class90.field1449;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static final void method1514(int arg0) {
        class23.field348 = " autres options";
        class28.field448 = "Chargement des paramètres par défaut - ";
        class126.field1984 = "K";
        class34.field546 = "Vérification des mises à jour - ";
        class46.field734 = " est déjà dans votre liste d'amis.";
        class26.field403 = "Moteur son préparé";
        class180.field2691 = "Annuler";
        class29.field454 = "Impossible de trouver ";
        class16.field254 = "voudrait faire un échange avec vous.";
        class160.field2445 = "Veuillez patienter...";
        class203.field3165 = "Fichiers config chargés";
        class297.field4692 = "Chargement de RuneScape en cours - veuillez patienter...";
        class19.field294 = "Connecté au serveur de mise à jour";
        class171.field2542 = "niveau ";
        class175.field2605 = "Démarrage de la librairie 3D";
        class7.field124 = "classement ";
        class160.field2451 = "Veuillez patienter - tentative de rétablissement.";
        class148.field2294 = "M";
        class93.field1505 = "Atteindre";
        class149.field2307 = "Polices chargées";
        class1.field17 = "Poser";
        class28.field411 = "Chargement des textures - ";
        if (arg0 >= -1) {
            return;
        }
        class70.field1124 = "Liste des serveurs chargée";
        class254.field3902 = "OK";
        class187.field2815 = " de votre liste noire.";
        class220.field3452 = "Chargement en cours...";
        class280.field4385 = "Chargement de l'écran-titre - ";
        class151.field2340 = "Textures chargées";
        class218.field3418 = "Attaquer";
        field3569++;
        class121.field1867 = " de votre liste d'amis.";
        class69.field1099 = "brillant3:";
        class215.field3315 = "Choisir une option";
        class22.field328 = "clignotant2:";
        class25.field389 = "blanc:";
        class219.field3430 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class10.field205 = "Veuillez commencer par supprimer ";
        class160.field2447 = "ondulation:";
        class78.field1312 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class226.field3544 = "jaune:";
        class247.field3819 = "Mémoire attribuée";
        class63.field1012 = " s'est connecté.";
        class220.field3449 = "Votre liste noire est pleine (100 noms maximum).";
        class55.field848 = "Chargement en cours. Veuillez patienter.";
        class216.field3331 = "Mémoire en cours d'attribution";
        class169.field2535 = "Continuer";
        class214.field3308 = "ondulation2:";
        class267.field4255 = "Connexion perdue.";
        class143.field2207 = "violet:";
        class142.field2181 = "clignotant3:";
        class134.field2103 = "cyan:";
        class292.field4602 = "glissement:";
        class120.field1857 = "brillant2:";
        class209.field3251 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class9.field189 = "Sélectionner";
        class174.field2584 = "vert:";
        class55.field847 = "Écran-titre chargé";
        class31.field496 = "clignotant1:";
        class290.field4569 = "Caché";
        class98.field1572 = "Chargement des interfaces - ";
        class119.field1843 = "tremblement:";
        class235.field3644 = "Sprites chargés";
        class202.field3154 = "Paramètres par défaut chargés";
        class87.field1428 = "Connexion au serveur de mise à jour en cours";
        class124.field1964 = "K";
        class143.field2208 = "Fermer";
        class65.field1037 = "Chargement des sprites - ";
        class148.field2292 = "Gestionnaire de saisie chargé";
        class100.field1615 = "Librairie 3D démarrée";
        class212.field3287 = " s'est déconnecté.";
        class273.field4311 = "Interfaces chargées";
        class229.field3583 = "Chargement de la liste des serveurs";
        class191.field3037 = "Veuillez commencer par supprimer ";
        class163.field2481 = "Objet d'abonnés";
        class117.field1822 = "Examiner";
        class50.field802 = "Jeter";
        class218.field3417 = "Regarder dans cette direction";
        class35.field559 = "rouge:";
        class140.field2162 = "Chargement du module texte - ";
        class246.field3805 = "Chargement des polices - ";
        class259.field3984 = "brillant1:";
        class124.field1954 = "Monde de jeu créé";
        class64.field1026 = "déroulement:";
        class28.field435 = "Écran-titre ouvert";
        class161.field2465 = "compétence ";
        class8.field177 = "Chargement des fichiers config - ";
        class111.field1745 = " ";
        class55.field855 = "M";
        class10.field206 = " est déjà dans votre liste noire.";
        class247.field3827 = "Prendre";
        class102.field1629 = "Liste des mises à jour chargée";
        class256.field3920 = "Utiliser";
        class266.field4253 = "Module texte chargé";
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method1515(int arg0, int arg1, int arg2) {
        int var3 = arg1 - arg0;
        if (arg2 < 96) {
            field3566 = null;
        }
        field3573++;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
    public static void method1516(boolean arg0) {
        field3568 = null;
        field3566 = null;
        if (!arg0) {
            method1513(-118, 83, -71);
        }
        field3560 = null;
    }
}
