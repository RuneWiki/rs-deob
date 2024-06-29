import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class270 extends class86 {

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public static int field4068 = 0;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "S")
    public static short field4066 = 32767;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "[Z")
    public static boolean[] field4077 = new boolean[200];

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "Z")
    public static boolean field4081 = true;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "Lvj;")
    public static class106 field4064 = new class106(64);

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field4082 = null;

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "I")
    public static int field4083 = 0;

    @OriginalMember(owner = "client!mi", name = "O", descriptor = "Ljava/lang/String;")
    public static String field4084 = "level: ";

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "Ljava/lang/String;")
    public String field4079;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "[C")
    public char[] field4067;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "[C")
    public char[] field4072;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "[I")
    public int[] field4074;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "[I")
    public int[] field4080;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(B)V", line = 5)
    public final void method1875(byte arg0) {
        if (arg0 != -120) {
            this.method1875((byte) 117);
        }
        if (this.field4074 != null) {
            for (int var2 = 0; var2 < this.field4074.length; var2++) {
                this.field4074[var2] = class147.method1098(this.field4074[var2], 32768);
            }
        }
        if (this.field4080 != null) {
            for (int var3 = 0; var3 < this.field4080.length; var3++) {
                this.field4080[var3] = class147.method1098(this.field4080[var3], 32768);
            }
        }
        field4065++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BC)I", line = 51)
    public final int method1876(byte arg0, char arg1) {
        field4073++;
        if (arg0 > -87) {
            field4068 = 106;
        }
        if (this.field4074 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4074.length; var3++) {
            if (this.field4072[var3] == arg1) {
                return this.field4074[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V", line = 75)
    public static void method1877(int arg0) {
        field4082 = null;
        field4084 = null;
        if (arg0 <= 25) {
            method1880(18);
        }
        field4077 = null;
        field4064 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILek;)Lek;", line = 91)
    public static final class184 method1878(int arg0, class184 arg1) {
        field4078++;
        if (arg1.field2974 != -1) {
            return class100.method781((byte) 48, arg1.field2974);
        }
        int var2 = arg1.field2806 >>> 16;
        class14 var3 = new class14(client.field3794);
        for (class111 var4 = (class111) var3.method110(112); var4 != null; var4 = (class111) var3.method106((byte) 66)) {
            if (var4.field1750 == var2) {
                return class100.method781((byte) 48, (int) var4.field3418);
            }
        }
        if (arg0 == -14103) {
            return null;
        } else {
            return (class184) null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(CI)I", line = 126)
    public final int method1879(char arg0, int arg1) {
        field4076++;
        if (this.field4080 == null) {
            return -1;
        } else if (arg1 > -92) {
            return 67;
        } else {
            for (int var3 = 0; var3 < this.field4080.length; var3++) {
                if (this.field4067[var3] == arg0) {
                    return this.field4080[var3];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V", line = 157)
    public static final void method1880(int arg0) {
        class242.field3648 = " autres options";
        class241.field3632 = "Continuer";
        class309.field4811 = "M";
        class312.field4853 = "brillant1:";
        class181.field2714 = "cyan:";
        class43.field678 = "Veuillez patienter - tentative de rétablissement.";
        class156.field2347 = "Fichiers config chargés";
        class236.field3613 = "Liste des serveurs chargée";
        class245.field3690 = "clignotant1:";
        class59.field884 = "Connexion perdue.";
        class315.field4902 = "Monde de jeu créé";
        class171.field2551 = "Sélectionner";
        class22.field234 = "Chargement des interfaces - ";
        class30.field387 = "clignotant3:";
        class261.field3865 = " s'est déconnecté.";
        class132.field2070 = "Écran-titre ouvert";
        class154.field2320 = "déroulement:";
        class199.field3150 = "jaune:";
        class142.field2203 = "Chargement de RuneScape en cours - veuillez patienter...";
        class33.field416 = "Gestionnaire de saisie chargé";
        class253.field3775 = "Chargement des sprites - ";
        class279.field4296 = "Jeter";
        class291.field4573 = "Votre liste noire est pleine (100 noms maximum).";
        class228.field3535 = "compétence ";
        class133.field2095 = "Démarrage de la librairie 3D";
        class272.field4119 = "Choisir une option";
        field4075++;
        class146.field2237 = "tremblement:";
        class158.field2369 = "Chargement des textures - ";
        class41.field615 = "rouge:";
        class204.field3243 = "Poser";
        class154.field2328 = "Sprites chargés";
        class83.field1160 = " est déjà dans votre liste d'amis.";
        class10.field93 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class12.field134 = "Chargement des polices - ";
        class190.field3034 = "Fermer";
        class77.field1083 = " s'est connecté.";
        class299.field4693 = " de votre liste d'amis.";
        class67.field1001 = "Objet d'abonnés";
        class107.field1646 = "Chargement en cours. Veuillez patienter.";
        class11.field126 = "Textures chargées";
        class327.field5073 = " est déjà dans votre liste noire.";
        class146.field2234 = "Connecté au serveur de mise à jour";
        class310.field4829 = "Moteur son préparé";
        class242.field3646 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class309.field4809 = "Liste des mises à jour chargée";
        class315.field4898 = "ondulation:";
        field4084 = "niveau ";
        class95.field1384 = "classement ";
        class277.field4249 = "voudrait faire un échange avec vous.";
        class287.field4414 = "Impossible de trouver ";
        class90.field1308 = "vert:";
        class65.field967 = "Chargement de la liste des serveurs";
        class204.field3245 = "violet:";
        class16.field189 = "brillant3:";
        class201.field3183 = "Examiner";
        class260.field3855 = " de votre liste noire.";
        class55.field821 = "Écran-titre chargé";
        class167.field2505 = "Annuler";
        class246.field3705 = "brillant2:";
        class309.field4822 = "Regarder dans cette direction";
        class281.field4343 = "Prendre";
        class41.field602 = "OK";
        class29.field331 = "Mémoire attribuée";
        class142.field2188 = "Chargement en cours...";
        class329.field5099 = "Chargement des fichiers config - ";
        class302.field4741 = "Chargement de l'écran-titre - ";
        class265.field3958 = "ondulation2:";
        class143.field2210 = "Polices chargées";
        class277.field4261 = "blanc:";
        class153.field2314 = "Attaquer";
        class80.field1119 = "Librairie 3D démarrée";
        class307.field4792 = "Utiliser";
        class37.field562 = " ";
        class276.field4245 = "clignotant2:";
        class90.field1315 = "K";
        class281.field4335 = "Chargement du module texte - ";
        class178.field2670 = "glissement:";
        class224.field3491 = "Module texte chargé";
        class67.field1000 = "Veuillez patienter...";
        class6.field58 = "K";
        class218.field3435 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class256.field3821 = "M";
        client.field3800 = "Connexion au serveur de mise à jour en cours";
        class153.field2302 = "Mémoire en cours d'attribution";
        class155.field2339 = "Atteindre";
        class58.field867 = "Vérification des mises à jour - ";
        class54.field813 = "Veuillez commencer par supprimer ";
        if (arg0 >= -108) {
            method1880(78);
        }
        class28.field318 = "Caché";
        class132.field2045 = "Veuillez commencer par supprimer ";
        class10.field107 = "Interfaces chargées";
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILhb;)V", line = 488)
    public final void method1881(int arg0, class35 arg1) {
        if (arg0 > -62) {
            this.method1881(5, (class35) null);
        }
        while (true) {
            int var3 = arg1.method273(65280);
            if (var3 == 0) {
                field4071++;
                return;
            }
            this.method1882(arg1, 122, var3);
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Lhb;II)V", line = 510)
    private final void method1882(class35 arg0, int arg1, int arg2) {
        int var4 = -23 / ((3 - arg1) / 44);
        if (arg2 == 1) {
            this.field4079 = arg0.method279(60);
        } else if (arg2 == 2) {
            int var8 = arg0.method273(65280);
            this.field4067 = new char[var8];
            this.field4080 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4080[var9] = arg0.method300(-1394191632);
                byte var10 = arg0.method242((byte) -93);
                this.field4067[var9] = var10 == 0 ? 0 : class253.method1759(-1, var10);
            }
        } else if (arg2 == 3) {
            int var5 = arg0.method273(65280);
            this.field4072 = new char[var5];
            this.field4074 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field4074[var6] = arg0.method300(-1394191632);
                byte var7 = arg0.method242((byte) -93);
                this.field4072[var6] = var7 == 0 ? 0 : class253.method1759(-1, var7);
            }
        } else if (arg2 == 4) {
        }
        field4070++;
    }
}
