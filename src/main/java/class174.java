import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class174 extends RuntimeException {

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2928;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "Ljava/lang/String;")
    public String field2937;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Z")
    public static boolean field2930 = false;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Z")
    public static boolean field2927 = false;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "Lkj;")
    public static class114 field2926;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Lkj;")
    public static class114 field2929;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "[[Z")
    public static boolean[][] field2924;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static void method1245(int arg0) {
        field2929 = null;
        field2926 = null;
        if (arg0 != 5844) {
            method1250((byte) -68);
        }
        field2924 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lsb;ILlj;Lsb;)V")
    public static final void method1246(class124 arg0, int arg1, class24 arg2, class124 arg3) {
        if (arg1 != 1) {
            return;
        }
        class43.field785 = arg0;
        class249.field3970 = arg3;
        field2936++;
        class43.field786 = arg2;
        if (class249.field3970 != null) {
            class105.field1600 = class249.field3970.method891(0, 1);
        }
        if (class43.field785 != null) {
            class290.field4622 = class43.field785.method891(0, 1);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V")
    public static final void method1247(boolean arg0) {
        field2934++;
        for (int var1 = 0; var1 < class205.field3292; var1++) {
            class8 var2 = class136.method997(var1, (byte) -93);
            if (var2 != null && var2.field94 == 0) {
                class238.field3750[var1] = 0;
                class192.field3138[var1] = 0;
            }
        }
        if (arg0) {
            method1245(-55);
        }
        class116.field1948 = new class144(16);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;B[BIII)I")
    public static final int method1248(String arg0, byte arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field2925++;
        int var6 = arg5 - arg4;
        if (arg1 != -118) {
            field2924 = null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg0.charAt(arg4 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg2[arg3 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg2[arg3 + var7] = -128;
            } else if (var8 == '‚') {
                arg2[arg3 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg2[arg3 + var7] = -125;
            } else if (var8 == '„') {
                arg2[arg3 + var7] = -124;
            } else if (var8 == '…') {
                arg2[arg3 + var7] = -123;
            } else if (var8 == '†') {
                arg2[arg3 + var7] = -122;
            } else if (var8 == '‡') {
                arg2[arg3 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg2[arg3 + var7] = -120;
            } else if (var8 == '‰') {
                arg2[arg3 + var7] = -119;
            } else if (var8 == 'Š') {
                arg2[arg3 + var7] = -118;
            } else if (var8 == '‹') {
                arg2[arg3 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg2[arg3 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg2[arg3 + var7] = -114;
            } else if (var8 == '‘') {
                arg2[arg3 + var7] = -111;
            } else if (var8 == '’') {
                arg2[arg3 + var7] = -110;
            } else if (var8 == '“') {
                arg2[arg3 + var7] = -109;
            } else if (var8 == '”') {
                arg2[arg3 + var7] = -108;
            } else if (var8 == '•') {
                arg2[arg3 + var7] = -107;
            } else if (var8 == '–') {
                arg2[arg3 + var7] = -106;
            } else if (var8 == '—') {
                arg2[arg3 + var7] = -105;
            } else if (var8 == '˜') {
                arg2[arg3 + var7] = -104;
            } else if (var8 == '™') {
                arg2[arg3 + var7] = -103;
            } else if (var8 == 'š') {
                arg2[arg3 + var7] = -102;
            } else if (var8 == '›') {
                arg2[arg3 + var7] = -101;
            } else if (var8 == 'œ') {
                arg2[arg3 + var7] = -100;
            } else if (var8 == 'ž') {
                arg2[arg3 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg2[arg3 + var7] = -97;
            } else {
                arg2[arg3 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)Z")
    public static final boolean method1249(byte arg0) {
        if (arg0 != 78) {
            field2927 = false;
        }
        field2932++;
        class191 var1 = class229.field3651;
        synchronized (class229.field3651) {
            if (class77.field1286 == class181.field3009) {
                return false;
            } else {
                class278.field4413 = class178.field2962[class77.field1286];
                class216.field3457 = class150.field2465[class77.field1286];
                class77.field1286 = class77.field1286 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V")
    public static final void method1250(byte arg0) {
        class242.field3834 = "vert:";
        class224.field3578 = "Chargement des textures - ";
        class160.field2618 = "K";
        class71.field1185 = "M";
        class187.field3060 = " de votre liste noire.";
        int var1 = -116 % ((arg0 - 10) / 60);
        class75.field1231 = "Fichiers config chargés";
        client.field4580 = "Moteur son préparé";
        class268.field4304 = "violet:";
        class27.field476 = "Connexion perdue.";
        field2933++;
        class18.field247 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class262.field4159 = "brillant3:";
        class244.field3858 = "Écran-titre ouvert";
        class213.field3433 = "Librairie 3D démarrée";
        class241.field3795 = "Connecté au serveur de mise à jour";
        class32.field531 = "Chargement en cours...";
        class89.field1427 = "Mémoire attribuée";
        class9.field107 = "Jeter";
        class206.field3316 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class3.field41 = "Paramètres par défaut chargés";
        class156.field2541 = "Chargement des fichiers config - ";
        class131.field2169 = "Utiliser";
        class239.field3760 = "Vérification des mises à jour - ";
        class91.field1440 = " autres options";
        class57.field1000 = "Continuer";
        class87.field1411 = "brillant2:";
        class230.field3664 = "Attaquer";
        class112.field1732 = "clignotant2:";
        class216.field3458 = "déroulement:";
        class240.field3788 = " s'est connecté.";
        class5.field67 = "cyan:";
        class237.field3739 = "Votre liste noire est pleine (100 noms maximum).";
        class178.field2964 = "ondulation2:";
        class111.field1720 = " est déjà dans votre liste noire.";
        class75.field1235 = "Veuillez commencer par supprimer ";
        class43.field781 = "tremblement:";
        class224.field3577 = "jaune:";
        class220.field3527 = "clignotant1:";
        class253.field4033 = "Annuler";
        class23.field363 = "Module texte chargé";
        class82.field1364 = "Démarrage de la librairie 3D";
        class185.field3041 = " ";
        class33.field556 = "Chargement des paramètres par défaut - ";
        class223.field3552 = "rouge:";
        class19.field282 = "classement ";
        class211.field3390 = "Sélectionner";
        class139.field2332 = "Choisir une option";
        class47.field839 = "Veuillez patienter...";
        class76.field1248 = "Sprites chargés";
        class296.field4684 = "blanc:";
        class127.field2101 = "Impossible de trouver ";
        class97.field1508 = "brillant1:";
        class265.field4230 = "ondulation:";
        class124.field2081 = "OK";
        class23.field369 = "Prendre";
        class256.field4077 = "clignotant3:";
        class247.field3883 = " est déjà dans votre liste d'amis.";
        class285.field4549 = "Chargement des polices - ";
        class5.field68 = " de votre liste d'amis.";
        class138.field2314 = "Fermer";
        class107.field1631 = "Chargement de l'écran-titre - ";
        class59.field1021 = "Veuillez patienter - tentative de rétablissement.";
        class207.field3332 = "voudrait faire un échange avec vous.";
        class256.field4074 = "Veuillez commencer par supprimer ";
        class29.field508 = "Chargement des interfaces - ";
        class8.field93 = "niveau ";
        class35.field591 = "Chargement en cours. Veuillez patienter.";
        class277.field4403 = "Textures chargées";
        class11.field152 = "Liste des serveurs chargée";
        class210.field3366 = "Chargement de la liste des serveurs";
        class230.field3663 = "Objet d'abonnés";
        class65.field1065 = "Caché";
        class36.field621 = " s'est déconnecté.";
        class201.field3275 = "Atteindre";
        class65.field1068 = "Monde de jeu créé";
        class279.field4429 = "Gestionnaire de saisie chargé";
        class228.field3635 = "Chargement de RuneScape en cours - veuillez patienter...";
        class4.field51 = "Poser";
        class152.field2488 = "Polices chargées";
        class295.field4678 = "Chargement des sprites - ";
        class91.field1443 = "Connexion au serveur de mise à jour en cours";
        class101.field1547 = "compétence ";
        class32.field529 = "Examiner";
        client.field4582 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class161.field2629 = "glissement:";
        class105.field1607 = "Chargement du module texte - ";
        class204.field3286 = "Regarder dans cette direction";
        class50.field926 = "M";
        class165.field2690 = "Écran-titre chargé";
        class184.field3036 = "Liste des mises à jour chargée";
        class250.field3983 = "K";
        class160.field2612 = "Interfaces chargées";
        class96.field1497 = "Mémoire en cours d'attribution";
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I")
    public static final int method1251(int arg0, int arg1) {
        field2931++;
        return arg0 == -2091788216 ? arg1 >>> 8 : 65;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class174(Throwable arg0, String arg1) {
        this.field2928 = arg0;
        this.field2937 = arg1;
    }
}
