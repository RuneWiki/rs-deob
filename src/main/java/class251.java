import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class251 implements class25 {

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field3626 = 0;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    public static int field3633 = -1;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "Lwe;")
    public static class82 field3638 = null;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "F")
    public static float field3625;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "Lbc;")
    public static class282 field3624;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIII)V")
    public static final void method1608(int arg0, int arg1, int arg2, int arg3) {
        class66 var4 = class6.method34(9, true, arg3);
        var4.method408(0);
        var4.field786 = arg1;
        var4.field784 = arg0;
        field3628++;
        if (arg2 != -26881) {
            field3626 = 121;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
    public static void method1609(int arg0) {
        field3624 = null;
        if (arg0 >= 110) {
            field3638 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)Lhf;")
    public static final class263 method1610(int arg0, int arg1) {
        field3635++;
        class263 var2 = (class263) class234.field3376.method65((byte) -128, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class257.field3709.method1861(class120.method787((byte) -112, arg1), class226.method1461((byte) -31, arg1), arg0);
        class263 var4 = new class263();
        if (var3 != null) {
            var4.method1683(new class216(var3), -1);
        }
        class234.field3376.method64((long) arg1, -1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IB)Lfd;")
    public static final class58 method1611(int arg0, byte arg1) {
        class58 var2 = (class58) class277.field4211.method65((byte) -90, (long) arg0);
        field3632++;
        if (var2 != null) {
            return var2;
        }
        class58 var3 = class225.method1456(class29.field345, false, class273.field4064, arg0, (byte) -122);
        int var4 = -106 / ((14 - arg1) / 50);
        if (var3 != null) {
            class277.field4211.method64((long) arg0, -1, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)Ljava/lang/String;")
    public static final String method1612(int arg0) {
        int var1 = -43 / ((12 - arg0) / 63);
        String var2 = "www";
        field3636++;
        if (class200.field2851 != 0) {
            var2 = "www-wtqa";
        }
        String var3 = "";
        if (client.field4449 != null) {
            var3 = "/p=" + client.field4449;
        }
        return "http://" + var2 + ".runescape.com/l=" + class146.field2156 + "/a=" + class133.field1939 + var3 + "/";
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
    public static final void method1613(byte arg0) {
        if (arg0 < 104) {
            field3633 = -54;
        }
        field3631++;
        class123.field1767 = new class82[class5.field63.method1856(-117)][];
        class60.field719 = new boolean[class5.field63.method1856(-113)];
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILbc;I)Lpg;")
    public static final class187 method1614(int arg0, class282 arg1, int arg2) {
        if (arg0 == -20047) {
            field3627++;
            return class185.method1211(0, arg1, arg2) ? class116.method749(0) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lca;IIIII)V")
    public static final void method1615(class131 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class202.field2868 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class268.field3922) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class97.field1292 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class133 var14 = class6.field94[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class290.field4536[var11][var12 + 1][var13] + class290.field4536[var11][var12][var13] + class290.field4536[var11][var12][var13 + 1] + class290.field4536[var11][var12 + 1][var13 + 1]) / 4 - (class290.field4536[arg1][arg2 + 1][arg3] + class290.field4536[arg1][arg2][arg3] + class290.field4536[arg1][arg2][arg3 + 1] + class290.field4536[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class118 var16 = var14.field1927;
                                    if (var16 != null) {
                                        if (var16.field1672.method711()) {
                                            arg0.method708(var16.field1672, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field1659 != null && var16.field1659.method711()) {
                                            arg0.method708(var16.field1659, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field1934; var17++) {
                                        class243 var18 = var14.field1930[var17];
                                        if (var18 != null && var18.field3526.method711() && (var18.field3540 == var12 || var7 == var12) && (var18.field3527 == var13 || var9 == var13)) {
                                            int var19 = var18.field3533 + 1 - var18.field3540;
                                            int var20 = var18.field3532 + 1 - var18.field3527;
                                            arg0.method708(var18.field3526, (var18.field3540 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field3527 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "([IIIJ)Ljava/lang/String;")
    public final String method151(int[] arg0, int arg1, int arg2, long arg3) {
        field3637++;
        if (arg2 == 0) {
            class203 var6 = class253.method1622(-108, arg0[0]);
            return var6.method1303(arg1 ^ 0x4E51, (int) arg3);
        } else if (arg1 != -20054) {
            return null;
        } else if (arg2 == 1 || arg2 == 10) {
            class229 var7 = class36.method224((int) arg3, 90);
            return var7.field3235;
        } else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
            return class253.method1622(-117, arg0[0]).method1303(-5, (int) arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)I")
    public static final int method1616(int arg0, int arg1, int arg2) {
        field3629++;
        if (arg2 != 128) {
            return 30;
        }
        class94 var3 = (class94) class224.field3161.method1895((long) arg0, -128);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var3.field1255.length) {
            return var3.field1255[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)V")
    public static final void method1617(byte arg0) {
        class168.field2418 = "Chargement en cours. Veuillez patienter.";
        class259.field3762 = "blanc:";
        class154.field2235 = "ondulation:";
        class209.field2949 = "cyan:";
        class120.field1718 = "classement ";
        class189.field2720 = "Sprites chargés";
        class180.field2554 = "Attaquer";
        class150.field2190 = "Atteindre";
        class123.field1766 = " de votre liste d'amis.";
        class94.field1264 = "Poser";
        class1.field3 = "Chargement de RuneScape en cours - veuillez patienter...";
        class228.field3222 = "Prendre";
        class5.field66 = "Mémoire en cours d'attribution";
        class216.field3070 = "Chargement de l'écran-titre - ";
        class260.field3788 = "brillant3:";
        class202.field2867 = "K";
        class131.field1895 = " s'est connecté.";
        class115.field1595 = "Connexion au serveur de mise à jour en cours";
        class84.field1163 = "Veuillez patienter - tentative de rétablissement.";
        class247.field3587 = " est déjà dans votre liste noire.";
        class227.field3202 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class79.field941 = "Polices chargées";
        class150.field2184 = "Chargement des interfaces - ";
        class247.field3597 = "Annuler";
        class124.field1789 = "brillant1:";
        class198.field2823 = "Objet d'abonnés";
        class156.field2257 = "Chargement des textures - ";
        class259.field3761 = "Chargement de la liste des serveurs";
        class91.field1234 = "Démarrage de la librairie 3D";
        class245.field3566 = "Monde de jeu créé";
        class231.field3332 = "Sélectionner";
        class270.field3949 = "Vérification des mises à jour - ";
        class229.field3232 = "Module texte chargé";
        class241.field3510 = " autres options";
        class279.field4243 = "brillant2:";
        class269.field3927 = "clignotant1:";
        class277.field4212 = "clignotant2:";
        class258.field3758 = "Mémoire attribuée";
        class1.field20 = "Fichiers config chargés";
        class12.field157 = "jaune:";
        class246.field3582 = "M";
        class241.field3504 = "Regarder dans cette direction";
        class127.field1830 = "Connecté au serveur de mise à jour";
        class159.field2308 = "Continuer";
        class26.field304 = "Écran-titre chargé";
        class212.field2975 = "Paramètres par défaut chargés";
        class167.field2410 = "compétence ";
        class41.field502 = " ";
        class152.field2204 = "Votre liste noire est pleine (100 noms maximum).";
        class21.field251 = "Examiner";
        class235.field3390 = "OK";
        if (arg0 != -117) {
            return;
        }
        class243.field3549 = "Écran-titre ouvert";
        class131.field1890 = "Veuillez commencer par supprimer ";
        class212.field2971 = "Chargement des paramètres par défaut - ";
        class164.field2349 = "Choisir une option";
        class146.field2155 = "Moteur son préparé";
        client.field4452 = "Fermer";
        class93.field1253 = "Interfaces chargées";
        class153.field2214 = "ondulation2:";
        class137.field2002 = "Chargement des fichiers config - ";
        class98.field1313 = "Veuillez commencer par supprimer ";
        class35.field407 = "clignotant3:";
        field3623++;
        class122.field1733 = "Chargement des sprites - ";
        class105.field1434 = "violet:";
        class260.field3780 = "vert:";
        class11.field152 = "Jeter";
        class23.field280 = "Librairie 3D démarrée";
        class211.field2967 = "M";
        class146.field2151 = "tremblement:";
        class259.field3775 = "glissement:";
        class280.field4258 = "Gestionnaire de saisie chargé";
        class105.field1430 = " est déjà dans votre liste d'amis.";
        class257.field3729 = "rouge:";
        class286.field4432 = "Impossible de trouver ";
        class55.field640 = " s'est déconnecté.";
        class12.field156 = "déroulement:";
        class140.field2028 = "Textures chargées";
        class167.field2407 = "K";
        class193.field2769 = "voudrait faire un échange avec vous.";
        class61.field724 = "niveau ";
        class74.field892 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class188.field2700 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class119.field1697 = " de votre liste noire.";
        class70.field822 = "Chargement en cours...";
        class123.field1769 = "Liste des mises à jour chargée";
        class209.field2946 = "Chargement des polices - ";
        class146.field2153 = "Connexion perdue.";
        class153.field2216 = "Liste des serveurs chargée";
        class157.field2272 = "Chargement du module texte - ";
        class26.field314 = "Utiliser";
        class19.field237 = "Caché";
        class206.field2929 = "Veuillez patienter...";
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V")
    public static final void method1618(int arg0) {
        class197.field2804 = null;
        class292.field4625 = null;
        if (arg0 == 64) {
            class165.field2376 = null;
            class288.field4490 = null;
            field3630++;
            class94.field1266 = null;
        }
    }
}
