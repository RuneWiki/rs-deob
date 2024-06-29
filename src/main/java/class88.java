import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class88 {

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "[I")
    public static int[] field1406 = new int[14];

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "Lvq;")
    public static class22 field1408 = new class22();

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "Lce;")
    public static class345 field1410 = new class345(64);

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "Z")
    public static boolean field1411 = false;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "F")
    public static float field1409;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lec;B)V", line = 20)
    public static final void method659(class37 arg0, byte arg1) {
        field1405++;
        for (int var2 = 0; var2 < class33.field465; var2++) {
            int var4 = arg0.method316((byte) 121);
            int var5 = arg0.method320((byte) -87);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class377.field5333[var4] != null) {
                class377.field5333[var4].field3999 = var5;
            }
        }
        int var3 = 124 % ((arg1 - 21) / 41);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLjava/lang/String;)I", line = 52)
    public static final int method660(byte arg0, String arg1) {
        field1407++;
        int var2 = arg1.length();
        int var3 = -34 / ((-arg0 - 23) / 42);
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            var4 = (var4 << 5) + arg1.charAt(var5) - var4;
        }
        return var4;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V", line = 118)
    public static void method661(int arg0) {
        field1410 = null;
        if (arg0 != 0) {
            method660((byte) -93, (String) null);
        }
        field1408 = null;
        field1406 = null;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V", line = 148)
    public static final void method662(int arg0) {
        class322.field4648 = "Chargement de RuneScape en cours - veuillez patienter...";
        class358.field5111 = "Chargement des textures - ";
        class389.field5593 = "Monde de jeu créé";
        class376.field5329 = "brillant2:";
        class418.field6069 = "Chargement des interfaces - ";
        class23.field354 = "rouge:";
        class268.field4023 = "Démarrage de la librairie 3D";
        class263.field3961 = "Chargement du module texte - ";
        class320.field4622 = "Votre liste noire est pleine (100 noms maximum).";
        class441.field6408 = "Écran-titre ouvert";
        class252.field3634 = "jaune:";
        class161.field2446 = "niveau ";
        field1404++;
        class239.field3445 = "Prendre";
        class98.field1533 = "clignotant3:";
        class255.field3692 = "Moteur son préparé";
        class147.field2278 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class270.field4058 = " de votre liste d'amis.";
        class250.field3618 = "Caché";
        class420.field6136 = "Connexion perdue.";
        class40.field617 = "Chargement en cours...";
        class450.field6536 = "Connecté au serveur de mise à jour";
        class214.field3164 = "Connexion au serveur de mise à jour en cours";
        class398.field5860 = "cyan:";
        class267.field4000 = "Librairie 3D démarrée";
        class183.field2696 = "Examiner";
        class418.field6068 = "Attaquer";
        class397.field5815 = "Mémoire attribuée";
        class28.field423 = "Gestionnaire de saisie chargé";
        class72.field1210 = "Regarder dans cette direction";
        class437.field6361 = "M";
        class387.field5543 = "Annuler";
        class106.field1754 = "Vérification des mises à jour - ";
        class333.field4778 = "clignotant2:";
        class432.field6225 = "blanc:";
        class351.field5006 = "Veuillez patienter - tentative de rétablissement.";
        class172.field2553 = "OK";
        class39.field613 = "Sprites chargés";
        class171.field2545 = "Chargement de Mechscape en cours - veuillez patienter...";
        class105.field1745 = " ";
        class117.field1851 = "Chargement en cours. Veuillez patienter.";
        class22.field341 = "K";
        class157.field2395 = "Textures chargées";
        class77.field1306 = "Sélectionner";
        class447.field6521 = "compétence ";
        class113.field1820 = " s'est connecté.";
        class113.field1816 = "Mémoire en cours d'attribution";
        class148.field2283 = "brillant3:";
        client.field3652 = "Interfaces chargées";
        class109.field1777 = "violet:";
        class30.field445 = "brillant1:";
        class193.field2847 = "Veuillez commencer par supprimer ";
        class19.field267 = "Utiliser";
        class380.field5391 = "Chargement des fichiers config - ";
        class33.field486 = "Chargement de la liste des serveurs";
        class275.field4145 = "ondulation2:";
        class365.field5196 = "clignotant1:";
        class422.field6145 = "Variables du client chargées";
        class39.field610 = "déroulement:";
        class16.field234 = " est déjà dans votre liste d'amis.";
        class422.field6142 = "K";
        class220.field3272 = "Impossible de trouver ";
        class39.field611 = "Paramètres par défaut chargés";
        class281.field4212 = "Veuillez patienter...";
        class63.field1022 = "Poser";
        class447.field6518 = "Fermer";
        class362.field5163 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class361.field5152 = "M";
        class306.field4472 = "Liste des serveurs chargée";
        class100.field1564 = "glissement:";
        class37.field540 = " de votre liste noire.";
        class18.field258 = "classement ";
        class191.field2831 = "Veuillez commencer par supprimer ";
        class39.field612 = " est déjà dans votre liste noire.";
        class437.field6363 = " s'est déconnecté.";
        class164.field2467 = "Polices chargées";
        class234.field3393 = "Objet d'abonnés";
        class98.field1535 = " autres options";
        class247.field3584 = "Chargement de l'écran-titre - ";
        class391.field5712 = "Choisir une option";
        class211.field3144 = "Fichiers config chargés";
        class27.field398 = "Atteindre";
        class21.field314 = "Chargement des sprites - ";
        class364.field5182 = "Écran-titre chargé";
        class135.field2166 = "tremblement:";
        class5.field35 = "Chargement des paramètres par défaut - ";
        int var1 = -43 % ((-arg0 - 86) / 35);
        class360.field5136 = "Liste des mises à jour chargée";
        class379.field5382 = "vert:";
        class242.field3535 = "Module texte chargé";
        class429.field6210 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class143.field2238 = "Continuer";
        class451.field6560 = "ondulation:";
        class387.field5551 = "Jeter";
        class98.field1540 = "Chargement des polices - ";
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIZZ)V", line = 441)
    public static final void method663(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        class139.field2209 = arg1;
        class436.field6353 = arg2;
        class46.field755 = arg3;
        class317.field4594 = new class168[arg0][class139.field2209][class436.field6353];
        class311.field4527 = new class126[4];
        if (arg4) {
            class265.field3980 = new class168[1][class139.field2209][class436.field6353];
            class28.field412 = new int[class139.field2209][class436.field6353];
            class18.field262 = new class126[1];
        } else {
            class265.field3980 = null;
            class28.field412 = null;
            class18.field262 = null;
        }
        if (arg5) {
            class450.field6537 = new int[arg0][arg1][arg2];
            class115.field1834 = new class420[255];
            class354.field5034 = new boolean[255];
            class336.field4811 = 0;
        } else {
            class450.field6537 = null;
            class115.field1834 = null;
            class354.field5034 = null;
            class336.field4811 = 0;
        }
        class379.method2403(false);
        class26.field382 = new class137[500];
        class243.field3540 = 0;
        class77.field1313 = new class137[500];
        class204.field2997 = 0;
        class315.field4586 = new int[arg0][class139.field2209 + 1][class436.field6353 + 1];
        class219.field3261 = new class447[5000];
        class30.field433 = 0;
        class207.field3035 = new boolean[class46.field755 + class46.field755 + 1][class46.field755 + class46.field755 + 1];
        class15.field229 = new boolean[class46.field755 + class46.field755 + 2][class46.field755 + class46.field755 + 2];
        class432.field6229 = null;
    }
}
