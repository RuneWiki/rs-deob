import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class359 implements class34 {

    @OriginalMember(owner = "client!re", name = "g", descriptor = "[I")
    public static int[] field4867 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field4868 = 0;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public int field4862;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public int field4863;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public int field4864;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public int field4869;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public int field4871;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public int field4874;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Z")
    public boolean field4861;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)I")
    public static final int method2251(int arg0, int arg1, int arg2, int arg3) {
        field4873++;
        int var4 = 2 % ((arg2 + 6) / 48);
        if (arg3 > arg1) {
            return arg3;
        } else if (arg1 > arg0) {
            return arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lpe;Lhh;IIIII)V")
    public static final void method2252(class391 arg0, class184 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class388.field5464 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class368.field5054) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class16.field190 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class224 var15 = class118.field1653[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class91.field1351[var12].method1509(var13, var14) + class91.field1351[var12].method1509(var13 + 1, var14) + class91.field1351[var12].method1509(var13, var14 + 1) + class91.field1351[var12].method1509(var13 + 1, var14 + 1)) / 4 - (class91.field1351[arg2].method1509(arg3, arg4) + class91.field1351[arg2].method1509(arg3 + 1, arg4) + class91.field1351[arg2].method1509(arg3, arg4 + 1) + class91.field1351[arg2].method1509(arg3 + 1, arg4 + 1)) / 4;
                                    class339 var17 = var15.field3108;
                                    class339 var18 = var15.field3125;
                                    if (var17 != null && var17.method537(-82)) {
                                        arg1.method532(var7, 7, var17, arg0, var16, (var13 - arg3) * 128 + (1 - arg5) * 64, (var14 - arg4) * 128 + (1 - arg6) * 64);
                                    }
                                    if (var18 != null && var18.method537(-83)) {
                                        arg1.method532(var7, 5, var18, arg0, var16, (var13 - arg3) * 128 + (1 - arg5) * 64, (var14 - arg4) * 128 + (1 - arg6) * 64);
                                    }
                                    for (class26 var19 = var15.field3129; var19 != null; var19 = var19.field463) {
                                        class228 var20 = var19.field460;
                                        if (var20 != null && var20.method537(-91) && (var20.field3172 == var13 || var8 == var13) && (var20.field3161 == var14 || var10 == var14)) {
                                            int var21 = var20.field3162 + 1 - var20.field3172;
                                            int var22 = var20.field3178 + 1 - var20.field3161;
                                            arg1.method532(var7, 121, var20, arg0, var16, (var20.field3172 - arg3) * 128 + (var21 - arg5) * 64, (var20.field3161 - arg4) * 128 + (var22 - arg6) * 64);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIILbd;II)Ljava/awt/Frame;")
    public static final Frame method2253(int arg0, int arg1, int arg2, class304 arg3, int arg4, int arg5) {
        field4872++;
        if (!arg3.method1948((byte) -53)) {
            return null;
        }
        if (arg0 == 0) {
            class385[] var6 = class296.method1904(arg3, true);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field5424 == arg4 && var6[var8].field5426 == arg2 && (arg1 == 0 || var6[var8].field5427 == arg1) && (!var7 || arg0 < var6[var8].field5430)) {
                    arg0 = var6[var8].field5430;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class242 var9 = arg3.method1952((byte) 111, arg2, arg1, arg0, arg4);
        while (var9.field3345 == 0) {
            class229.method1541(arg5 ^ 0x64DE, 10L);
        }
        Frame var10 = (Frame) var9.field3341;
        if (var10 == null) {
            return null;
        } else if (var9.field3345 == 2) {
            class35.method358(arg3, var10, 0);
            return null;
        } else {
            if (arg5 != 25788) {
                method2255((byte) 62);
            }
            return var10;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static void method2254(byte arg0) {
        if (arg0 == -106) {
            field4867 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)J")
    public final long method354(int arg0) {
        field4865++;
        int var2 = -20 % ((arg0 + 59) / 60);
        long[] var3 = class57.field914;
        long var4 = -1L;
        long var6 = var3[(int) ((var4 ^ (long) this.field4871) & 0xFFL)] ^ var4 >>> 8;
        long var8 = var6 >>> 8 ^ var3[(int) (((long) (this.field4874 >> 8) ^ var6) & 0xFFL)];
        long var10 = var3[(int) (((long) this.field4874 ^ var8) & 0xFFL)] ^ var8 >>> 8;
        long var12 = var3[(int) (((long) (this.field4863 >> 24) ^ var10) & 0xFFL)] ^ var10 >>> 8;
        long var14 = var12 >>> 8 ^ var3[(int) ((var12 ^ (long) (this.field4863 >> 16)) & 0xFFL)];
        long var16 = var3[(int) ((var14 ^ (long) (this.field4863 >> 8)) & 0xFFL)] ^ var14 >>> 8;
        long var18 = var3[(int) ((var16 ^ (long) this.field4863) & 0xFFL)] ^ var16 >>> 8;
        long var20 = var3[(int) (((long) this.field4862 ^ var18) & 0xFFL)] ^ var18 >>> 8;
        long var22 = var20 >>> 8 ^ var3[(int) (((long) (this.field4869 >> 24) ^ var20) & 0xFFL)];
        long var24 = var3[(int) (((long) (this.field4869 >> 16) ^ var22) & 0xFFL)] ^ var22 >>> 8;
        long var26 = var3[(int) (((long) (this.field4869 >> 8) ^ var24) & 0xFFL)] ^ var24 >>> 8;
        long var28 = var26 >>> 8 ^ var3[(int) ((var26 ^ (long) this.field4869) & 0xFFL)];
        long var30 = var28 >>> 8 ^ var3[(int) (((long) this.field4864 ^ var28) & 0xFFL)];
        return var30 >>> 8 ^ var3[(int) ((var30 ^ (long) (this.field4861 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
    public static final void method2255(byte arg0) {
        class275.field3696 = "glissement:";
        class244.field3369 = "Chargement en cours...";
        class243.field3354 = "Liste des mises à jour chargée";
        class435.field6201 = "Prendre";
        class128.field1825 = "Textures chargées";
        class356.field4839 = "Chargement de Mechscape en cours - veuillez patienter...";
        class263.field3538 = "Mémoire en cours d'attribution";
        class423.field5921 = "Écran-titre ouvert";
        class105.field1551 = "brillant2:";
        class415.field5811 = "vert:";
        class296.field3987 = "Veuillez commencer par supprimer ";
        class293.field3963 = "Moteur son préparé";
        class375.field5279 = "Sélectionner";
        class165.field2444 = "Connecté au serveur de mise à jour";
        class126.field1772 = "déroulement:";
        class443.field6392 = " s'est déconnecté.";
        class387.field5447 = "Sprites chargés";
        class410.field5731 = "Chargement des sprites - ";
        class295.field3986 = "Chargement des fichiers config - ";
        class243.field3361 = "rouge:";
        class184.field2679 = "Chargement des textures - ";
        class448.field6493 = "blanc:";
        class266.field3578 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class283.field3786 = "Veuillez patienter - tentative de rétablissement.";
        class3.field20 = "Connexion perdue.";
        class198.field2815 = "jaune:";
        class441.field6339 = "Chargement des paramètres par défaut - ";
        class73.field1098 = "niveau ";
        class233.field3204 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class148.field2266 = "Choisir une option";
        class398.field5577 = "clignotant2:";
        class365.field5035 = "Atteindre";
        class328.field4458 = "Utiliser";
        class14.field105 = "brillant1:";
        class361.field4909 = "Variables du client chargées";
        class186.field2698 = "Écran-titre chargé";
        class381.field5342 = "Module texte chargé";
        class391.field5481 = "Fermer";
        class126.field1763 = "Chargement des polices - ";
        class223.field3097 = "Chargement de RuneScape en cours - veuillez patienter...";
        class288.field3863 = "ondulation:";
        class94.field1366 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class185.field2692 = "clignotant1:";
        class63.field965 = "M";
        class423.field5919 = " s'est connecté.";
        class301.field4048 = "Mémoire attribuée";
        class134.field1909 = "Votre liste noire est pleine (100 noms maximum).";
        class66.field996 = "Caché";
        class199.field2839 = "Annuler";
        class97.field1404 = "Monde de jeu créé";
        class284.field3806 = "Connexion au serveur de mise à jour en cours";
        class233.field3206 = "Impossible de trouver ";
        class273.field3665 = " ";
        class155.field2347 = "violet:";
        class241.field3333 = "Examiner";
        class63.field967 = " est déjà dans votre liste noire.";
        class382.field5356 = "Veuillez patienter...";
        if (arg0 != -59) {
            method2253(-125, 122, -117, (class304) null, 36, -90);
        }
        class278.field3745 = "M";
        class149.field2287 = "tremblement:";
        class68.field1025 = "Chargement des interfaces - ";
        class224.field3100 = " autres options";
        class84.field1226 = "Continuer";
        class127.field1796 = "OK";
        class422.field5908 = " est déjà dans votre liste d'amis.";
        class336.field4556 = "Veuillez commencer par supprimer ";
        field4870++;
        class421.field5900 = "Gestionnaire de saisie chargé";
        class134.field1907 = "Fichiers config chargés";
        class235.field3254 = " de votre liste noire.";
        class127.field1797 = "Objet d'abonnés";
        class290.field3943 = "Chargement de la liste des serveurs";
        class435.field6204 = "Jeter";
        class288.field3857 = "clignotant3:";
        class338.field4607 = "Chargement en cours. Veuillez patienter.";
        class386.field5441 = "Chargement du module texte - ";
        class412.field5762 = "ondulation2:";
        class340.field4651 = "K";
        class424.field5945 = "Poser";
        class412.field5761 = "Chargement de l'écran-titre - ";
        class345.field4681 = "cyan:";
        class97.field1399 = "Paramètres par défaut chargés";
        class155.field2355 = "Librairie 3D démarrée";
        class5.field38 = "classement ";
        class128.field1817 = "Liste des serveurs chargée";
        class417.field5858 = " de votre liste d'amis.";
        class255.field3459 = "compétence ";
        class71.field1073 = "Interfaces chargées";
        class391.field5483 = "Regarder dans cette direction";
        class293.field3964 = "Polices chargées";
        class213.field2949 = "Vérification des mises à jour - ";
        class335.field4538 = "brillant3:";
        class362.field4921 = "K";
        class24.field426 = "Démarrage de la librairie 3D";
        class149.field2290 = "Attaquer";
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lpc;B)Z")
    public final boolean method355(class34 arg0, byte arg1) {
        field4866++;
        int var3 = -60 % ((arg1 - 50) / 40);
        if (!(arg0 instanceof class359)) {
            return false;
        }
        class359 var4 = (class359) arg0;
        if (this.field4871 != var4.field4871) {
            return false;
        } else if (this.field4874 != var4.field4874) {
            return false;
        } else if (this.field4863 != var4.field4863) {
            return false;
        } else if (this.field4862 != var4.field4862) {
            return false;
        } else if (this.field4869 != var4.field4869) {
            return false;
        } else if (this.field4864 == var4.field4864) {
            return this.field4861 == var4.field4861;
        } else {
            return false;
        }
    }
}
