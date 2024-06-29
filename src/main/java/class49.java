import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class49 extends class310 {

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    private int field785 = 0;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "I")
    private int field787 = 4096;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    public static int field778 = 0;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILpd;Lth;ZLth;)V", line = 7)
    public static final void method384(int arg0, class290 arg1, class57 arg2, boolean arg3, class57 arg4) {
        class4.field43 = arg3;
        field782++;
        class109.field1800 = arg4;
        class57.field956 = arg2;
        int var5 = arg0 + class57.field956.method489(17752);
        class281.field4614 = class57.field956.method482(27535, var5) + var5 * 256;
        class101.field1659 = new String[] { null, null, class121.field2058, null, null };
        class201.field3204 = arg1;
        class176.field2814 = new String[] { null, null, null, null, class75.field1273 };
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[I", line = 25)
    public final int[] method77(int arg0, int arg1) {
        int[] var3 = this.field4950.method930(arg0, 0);
        if (this.field4950.field2001) {
            int[] var4 = this.method2200(0, arg0, (byte) 74);
            for (int var5 = 0; var5 < class261.field4405; var5++) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field785 && var6 <= this.field787 ? 4096 : 0;
            }
        }
        if (arg1 != -13093) {
            this.field785 = 105;
        }
        field779++;
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(B)V", line = 60)
    public static final void method385(byte arg0) {
        if (arg0 < 52) {
            method386(false);
        }
        field788++;
        class292.field4724.method2326(-4);
        class291.field4704.method2326(-4);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V", line = 74)
    public static final void method386(boolean arg0) {
        class127.field2157 = "cyan:";
        class271.field4505 = "Moteur son préparé";
        class247.field4041 = " ";
        class160.field2547 = " de votre liste d'amis.";
        class350.field5562 = "Vérification des mises à jour - ";
        class113.field1855 = "K";
        class326.field5181 = "brillant2:";
        class313.field4972 = "Module texte chargé";
        class335.field5301 = "Veuillez commencer par supprimer ";
        class148.field2373 = "Chargement en cours. Veuillez patienter.";
        class173.field2760 = " est déjà dans votre liste noire.";
        class191.field3055 = "ondulation:";
        class236.field3916 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class253.field4272 = " s'est déconnecté.";
        class204.field3228 = "Mémoire attribuée";
        class163.field2577 = "Librairie 3D démarrée";
        class54.field901 = "Monde de jeu créé";
        class172.field2747 = "Attaquer";
        class40.field592 = "Caché";
        class322.field5131 = "Chargement de la liste des serveurs";
        class350.field5559 = "jaune:";
        class76.field1321 = "Textures chargées";
        class285.field4659 = "vert:";
        class245.field4017 = "Écran-titre chargé";
        class201.field3206 = "brillant3:";
        class169.field2693 = "Veuillez patienter - tentative de rétablissement.";
        class211.field3373 = "Chargement de l'écran-titre - ";
        class140.field2301 = "Fichiers config chargés";
        class324.field5159 = "Écran-titre ouvert";
        class201.field3203 = "brillant1:";
        class209.field3284 = "Choisir une option";
        class335.field5303 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class258.field4338 = "clignotant3:";
        class104.field1689 = "Annuler";
        class52.field861 = "blanc:";
        class7.field69 = "violet:";
        class117.field1953 = "Utiliser";
        class327.field5191 = "Jeter";
        class46.field748 = "M";
        class206.field3249 = "Sprites chargés";
        class2.field15 = "Liste des serveurs chargée";
        class71.field1238 = "Sélectionner";
        class117.field1981 = "Connexion au serveur de mise à jour en cours";
        class257.field4314 = "ondulation2:";
        class152.field2411 = "Chargement du module texte - ";
        class230.field3832 = "Veuillez commencer par supprimer ";
        class258.field4346 = "Connecté au serveur de mise à jour";
        class350.field5570 = "Chargement des sprites - ";
        class298.field4789 = " s'est connecté.";
        class261.field4406 = "OK";
        class11.field93 = "Chargement des polices - ";
        class298.field4781 = "Gestionnaire de saisie chargé";
        class347.field5524 = "Chargement en cours...";
        class352.field5583 = "K";
        class278.field4579 = "Mémoire en cours d'attribution";
        class131.field2234 = "Chargement des textures - ";
        class116.field1948 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class160.field2548 = "Chargement de RuneScape en cours - veuillez patienter...";
        class102.field1663 = "rouge:";
        class295.field4755 = "Impossible de trouver ";
        if (arg0) {
            return;
        }
        class318.field5067 = "Fermer";
        class327.field5198 = "Examiner";
        field786++;
        class121.field2058 = "Prendre";
        class251.field4243 = "Paramètres par défaut chargés";
        class222.field3676 = " autres options";
        class135.field2257 = "Chargement des paramètres par défaut - ";
        class329.field5223 = "M";
        class124.field2124 = "Liste des mises à jour chargée";
        class54.field898 = "glissement:";
        class254.field4282 = "clignotant2:";
        class74.field1260 = "Atteindre";
        class215.field3439 = "clignotant1:";
        class183.field2951 = " de votre liste noire.";
        class300.field4841 = "Chargement de Mechscape en cours - veuillez patienter...";
        class213.field3396 = "Interfaces chargées";
        class176.field2819 = "Regarder dans cette direction";
        class355.field5637 = "déroulement:";
        class325.field5162 = "Chargement des fichiers config - ";
        class272.field4519 = "Continuer";
        class245.field4029 = "classement ";
        class270.field4493 = "Votre liste noire est pleine (100 noms maximum).";
        class102.field1662 = "Connexion perdue.";
        class56.field940 = "compétence ";
        class79.field1368 = "niveau ";
        class129.field2186 = "Veuillez patienter...";
        class231.field3840 = " est déjà dans votre liste d'amis.";
        class182.field2928 = "Objet d'abonnés";
        class75.field1273 = "Poser";
        class65.field1161 = "Polices chargées";
        class347.field5521 = "tremblement:";
        class138.field2277 = "Démarrage de la librairie 3D";
        class7.field67 = "Chargement des interfaces - ";
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 350)
    public class49() {
        super(1, true);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lqm;II)V", line = 354)
    public final void method75(class227 arg0, int arg1, int arg2) {
        field781++;
        if (arg1 != -2470) {
            field784 = 38;
        }
        if (arg2 == 0) {
            this.field785 = arg0.method1765(true);
        } else if (arg2 == 1) {
            this.field787 = arg0.method1765(true);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILth;B)[Llb;", line = 397)
    public static final class341[] method387(int arg0, class57 arg1, byte arg2) {
        if (arg2 <= 117) {
            return (class341[]) null;
        } else {
            field783++;
            return class45.method333((byte) -111, arg1, arg0) ? class56.method448((byte) 112) : null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIIII)V", line = 411)
    public static final void method388(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class36 var6 = class129.field2184[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class232 var7 = var6.field529;
        if (var7 != null) {
            int var8 = var7.field3854;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class15 var10 = var6.field530;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field158;
        int var12 = var10.field164;
        int var13 = var10.field178;
        int var14 = var10.field165;
        int[] var15 = class264.field4427[var11];
        int[] var16 = class64.field1138[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V", line = 503)
    public static final void method389(int arg0) {
        if (arg0 != -16376) {
            field784 = -69;
        }
        class193.field3082.method2326(arg0 + 16372);
        field780++;
    }
}
