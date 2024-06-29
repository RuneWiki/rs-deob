import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class225 {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "[[Z")
    public static boolean[][] field3419 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Z")
    public static boolean field3424 = false;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field3423 = 1;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "[I")
    public static int[] field3429 = new int[100];

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Lad;")
    public static class179 field3426;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Z")
    public static boolean field3425;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 9)
    public static final void method1568(int arg0) {
        class316.field4772.method2182(false);
        field3427++;
        if (arg0 != 128) {
            field3425 = true;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IILlm;Llm;I)Lqb;", line = 20)
    public static final class89 method1569(int arg0, int arg1, class210 arg2, class210 arg3, int arg4) {
        if (arg1 != -1) {
            field3425 = false;
        }
        field3421++;
        return class249.method1680(arg0, arg2, arg4, (byte) -100) ? class285.method1984(arg3.method1441(arg4, (byte) -44, arg0), 117) : null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZZBII)V", line = 34)
    public static final void method1570(boolean arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field3422++;
        class184.method1269(class250.field3729.length - 1, arg1, 0, -21266, arg0, arg3, arg4);
        if (arg2 >= -7) {
            method1572((byte) -122);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)[Lea;", line = 55)
    public static final class235[] method1571(int arg0) {
        int var1 = -123 % ((63 - arg0) / 40);
        field3430++;
        class235[] var2 = new class235[class96.field1444];
        for (int var3 = 0; var3 < class96.field1444; var3++) {
            byte[] var4 = class205.field3083[var3];
            int var5 = class203.field3051[var3] * class160.field2403[var3];
            int[] var6 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                var6[var7] = class66.field865[class124.method893(255, var4[var7])];
            }
            if (class117.field1817) {
                var2[var3] = new class303(class12.field136, class132.field2034, class203.field3039[var3], class184.field2754[var3], class203.field3051[var3], class160.field2403[var3], var6);
            } else {
                var2[var3] = new class127(class12.field136, class132.field2034, class203.field3039[var3], class184.field2754[var3], class203.field3051[var3], class160.field2403[var3], var6);
            }
        }
        class10.method49((byte) 83);
        return var2;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 94)
    public static void method1572(byte arg0) {
        field3419 = (boolean[][]) null;
        field3429 = null;
        field3426 = null;
        if (arg0 != 97) {
            method1569(76, -66, (class210) null, (class210) null, 96);
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V", line = 109)
    public static final void method1573(int arg0) {
        class298.field4559 = "Chargement de l'écran-titre - ";
        class270.field4138 = "Jeter";
        class38.field455 = "Liste des serveurs chargée";
        class16.field182 = "Liste des mises à jour chargée";
        class166.field2503 = "Chargement du module texte - ";
        class36.field441 = "Chargement de la liste des serveurs";
        class202.field3026 = "Chargement des textures - ";
        class221.field3371 = "OK";
        class124.field1935 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class194.field2907 = "Module texte chargé";
        class15.field169 = "niveau ";
        class64.field841 = " de votre liste d'amis.";
        class230.field3479 = "Mémoire en cours d'attribution";
        class114.field1751 = "violet:";
        class201.field3015 = "Interfaces chargées";
        class326.field4914 = "Atteindre";
        class327.field4920 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class237.field3551 = "Objet d'abonnés";
        class234.field3520 = "tremblement:";
        class299.field4562 = "K";
        class162.field2436 = "Poser";
        class96.field1438 = " de votre liste noire.";
        class160.field2399 = "jaune:";
        class170.field2563 = "voudrait faire un échange avec vous.";
        class316.field4777 = "ondulation2:";
        class104.field1647 = "rouge:";
        class318.field4806 = "Veuillez commencer par supprimer ";
        class154.field2312 = "Choisir une option";
        class263.field4010 = " est déjà dans votre liste noire.";
        class292.field4442 = "Utiliser";
        class51.field635 = "Polices chargées";
        class152.field2299 = "Fichiers config chargés";
        class299.field4570 = " ";
        class258.field3915 = "Mémoire attribuée";
        class211.field3209 = " est déjà dans votre liste d'amis.";
        class181.field2704 = "blanc:";
        class286.field4322 = "Librairie 3D démarrée";
        class228.field3463 = "Connexion au serveur de mise à jour en cours";
        class288.field4348 = "Chargement des polices - ";
        class200.field2996 = "classement ";
        class67.field879 = "Connexion perdue.";
        class51.field642 = "Attaquer";
        class22.field329 = "ondulation:";
        class226.field3436 = "Connecté au serveur de mise à jour";
        class167.field2506 = "glissement:";
        class170.field2556 = "brillant1:";
        class26.field370 = "Votre liste noire est pleine (100 noms maximum).";
        class177.field2619 = "Écran-titre chargé";
        field3428++;
        class257.field3892 = " s'est déconnecté.";
        class57.field721 = "Continuer";
        class73.field949 = "brillant2:";
        class79.field1102 = "Textures chargées";
        class315.field4760 = "cyan:";
        class35.field434 = "Chargement en cours. Veuillez patienter.";
        class42.field515 = "Veuillez patienter - tentative de rétablissement.";
        class134.field2052 = "Chargement des interfaces - ";
        class48.field603 = "Veuillez patienter...";
        class190.field2822 = "Caché";
        class270.field4149 = "vert:";
        class311.field4738 = "Chargement des fichiers config - ";
        class9.field80 = "Démarrage de la librairie 3D";
        class222.field3390 = "Monde de jeu créé";
        class38.field465 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class211.field3216 = "Regarder dans cette direction";
        class159.field2386 = "Écran-titre ouvert";
        class186.field2777 = "Sprites chargés";
        class274.field4205 = "Examiner";
        class124.field1941 = "M";
        class121.field1893 = "Fermer";
        class79.field1087 = "Vérification des mises à jour - ";
        class187.field2791 = "clignotant3:";
        class73.field956 = "Veuillez commencer par supprimer ";
        class29.field397 = " autres options";
        class45.field572 = "Sélectionner";
        class176.field2602 = "déroulement:";
        class179.field2657 = "M";
        class247.field3685 = " s'est connecté.";
        class295.field4527 = "Prendre";
        class292.field4459 = "Impossible de trouver ";
        class121.field1898 = "Annuler";
        class16.field179 = "Gestionnaire de saisie chargé";
        class67.field892 = "Chargement des sprites - ";
        class151.field2265 = "compétence ";
        class285.field4309 = "Moteur son préparé";
        class192.field2884 = "clignotant1:";
        if (arg0 != 1358) {
            method1572((byte) 16);
        }
        class98.field1506 = "K";
        class131.field2022 = "clignotant2:";
        class35.field431 = "Chargement en cours...";
        class57.field716 = "Chargement de RuneScape en cours - veuillez patienter...";
        class245.field3651 = "brillant3:";
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lvg;[[ILpe;I[[FI[[F[IIZ[[F)V", line = 447)
    public static final void method1574(class24 arg0, int[][] arg1, class266 arg2, int arg3, float[][] arg4, int arg5, float[][] arg6, int[] arg7, int arg8, boolean arg9, float[][] arg10) {
        field3420++;
        int[] var11 = new int[arg7.length / 2];
        int var12 = 0;
        if (!arg9) {
            field3425 = false;
        }
        while (var11.length > var12) {
            int var13 = arg7[var12 + var12];
            int var14 = arg7[var12 + var12 + 1];
            if (arg5 == 1) {
                int var16 = var13;
                var13 = var14;
                var14 = 128 - var16;
            } else if (arg5 == 2) {
                var13 = 128 - var13;
                var14 = 128 - var14;
            } else if (arg5 == 3) {
                int var15 = var13;
                var13 = 128 - var14;
                var14 = var15;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg10[arg8][arg3];
                var18 = arg6[arg8][arg3];
                var19 = arg4[arg8][arg3];
            } else if (var13 == 128 && var14 == 0) {
                var19 = arg4[arg8 + 1][arg3];
                var17 = arg10[arg8 + 1][arg3];
                var18 = arg6[arg8 + 1][arg3];
            } else if (var13 == 128 && var14 == 128) {
                var17 = arg10[arg8 + 1][arg3 + 1];
                var19 = arg4[arg8 + 1][arg3 + 1];
                var18 = arg6[arg8 + 1][arg3 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var17 = arg10[arg8][arg3 + 1];
                var19 = arg4[arg8][arg3 + 1];
                var18 = arg6[arg8][arg3 + 1];
            } else {
                float var20 = arg10[arg8][arg3];
                float var21 = arg4[arg8][arg3];
                float var22 = arg6[arg8][arg3];
                float var23 = (float) var13 / 128.0F;
                float var24 = (arg6[arg8 + 1][arg3] - var22) * var23 + var22;
                float var25 = arg6[arg8][arg3 + 1];
                float var26 = (arg4[arg8 + 1][arg3] - var21) * var23 + var21;
                float var27 = (arg10[arg8 + 1][arg3] - var20) * var23 + var20;
                float var28 = (float) var14 / 128.0F;
                float var29 = arg4[arg8][arg3 + 1];
                float var30 = arg10[arg8][arg3 + 1];
                float var31 = (arg4[arg8 + 1][arg3 + 1] - var29) * var23 + var29;
                float var32 = (arg6[arg8 + 1][arg3 + 1] - var25) * var23 + var25;
                float var33 = (arg10[arg8 + 1][arg3 + 1] - var30) * var23 + var30;
                var18 = (var32 - var24) * var28 + var24;
                var17 = (var33 - var27) * var28 + var27;
                var19 = (var31 - var26) * var28 + var26;
            }
            int var34 = (arg8 << 7) + var13;
            int var35 = (arg3 << 7) + var14;
            int var36 = class186.method1277(arg1, arg3, arg8, (byte) 104, var14, var13);
            var11[var12] = arg0.method161(arg2, var34, var36, var35, var18, var17, var19);
            var12++;
        }
        arg0.method162(var11);
    }
}
