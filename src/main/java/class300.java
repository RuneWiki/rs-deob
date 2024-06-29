import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class300 {

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
    private int field4394 = 0;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "Z")
    public boolean field4389 = false;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
    private int field4393 = 0;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
    private int field4390 = 0;

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "I")
    public int field4406 = -1;

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "I")
    private int field4400 = 128;

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "Z")
    public boolean field4407 = false;

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "I")
    private int field4410 = 128;

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
    public static int field4398 = 0;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public int field4387;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
    private int field4396;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!pr", name = "y", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!pr", name = "x", descriptor = "Llm;")
    public static class347 field4408;

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "Lcq;")
    public static class67 field4397;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "[S")
    private short[] field4385;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "[S")
    private short[] field4391;

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "[S")
    private short[] field4403;

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "[S")
    private short[] field4404;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lnj;B)V", line = 4)
    public final void method2051(class228 arg0, byte arg1) {
        if (arg1 > -81) {
            method2059(-128, -127, 23, 22, 106, 95, -27);
        }
        while (true) {
            int var3 = arg0.method1348(-115);
            if (var3 == 0) {
                field4401++;
                return;
            }
            this.method2056(arg0, -128, var3);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V", line = 33)
    public static final void method2052(byte arg0) {
        field4399++;
        if (arg0 <= 58) {
            return;
        }
        for (int var1 = 0; var1 < class225.field2964; var1++) {
            int var2 = class151.field2055[var1];
            class25 var3 = class206.field2777[var2];
            int var4 = class156.field2120.method1348(-116);
            if ((var4 & 0x2) != 0) {
                var4 += class156.field2120.method1348(-87) << 8;
            }
            class145.method926(var4, true, var3, var2);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V", line = 62)
    public static void method2053(int arg0) {
        field4408 = null;
        if (arg0 != -129) {
            method2059(49, -6, -96, -56, 88, -54, -3);
        }
        field4397 = null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)V", line = 87)
    public static final void method2054(int arg0, int arg1) {
        field4409++;
        class368 var2 = class30.field430;
        synchronized (class30.field430) {
            class39.field541 = arg0;
        }
        if (arg1 != -129) {
            method2053(107);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V", line = 103)
    public static final void method2055(boolean arg0) {
        class244.field3248.method1141(256);
        field4388++;
        class397.field5905.method1141(256);
        if (!arg0) {
            field4397 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lnj;II)V", line = 115)
    private final void method2056(class228 arg0, int arg1, int arg2) {
        int var4 = 118 / ((arg1 - 11) / 58);
        if (arg2 == 1) {
            this.field4396 = arg0.method1343(255);
        } else if (arg2 == 2) {
            this.field4406 = arg0.method1343(255);
        } else if (arg2 == 4) {
            this.field4410 = arg0.method1343(255);
        } else if (arg2 == 5) {
            this.field4400 = arg0.method1343(255);
        } else if (arg2 == 6) {
            this.field4393 = arg0.method1343(255);
        } else if (arg2 == 7) {
            this.field4390 = arg0.method1348(-122);
        } else if (arg2 == 8) {
            this.field4394 = arg0.method1348(-96);
        } else if (arg2 == 9) {
            this.field4407 = true;
        } else if (arg2 == 10) {
            this.field4389 = true;
        } else if (arg2 == 40) {
            int var5 = arg0.method1348(-93);
            this.field4404 = new short[var5];
            this.field4391 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field4404[var6] = (short) arg0.method1343(255);
                this.field4391[var6] = (short) arg0.method1343(255);
            }
        } else if (arg2 == 41) {
            int var7 = arg0.method1348(-119);
            this.field4403 = new short[var7];
            this.field4385 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4403[var8] = (short) arg0.method1343(255);
                this.field4385[var8] = (short) arg0.method1343(255);
            }
        }
        field4402++;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lps;IIB)V", line = 201)
    public static final void method2057(class394 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == -51) {
            field4395++;
            class106.field1528 = arg2;
            class130.field1799 = arg1;
            class449.field6580 = arg0;
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V", line = 221)
    public static final void method2058(byte arg0) {
        class405.field6016 = "Chargement des textures - ";
        class17.field259 = "Impossible de trouver ";
        class218.field2883 = " est déjà dans votre liste noire.";
        class259.field3783 = "Connecté au serveur de mise à jour";
        class356.field5145 = "Jeter";
        class72.field1045 = "violet:";
        class228.field3032 = "brillant3:";
        class7.field93 = "Connexion au serveur de mise à jour en cours";
        int var1 = -52 / ((arg0 + 77) / 46);
        class296.field4252 = "Écran-titre ouvert";
        class353.field5112 = "Chargement des sprites - ";
        class105.field1524 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class165.field2228 = " s'est connecté.";
        class353.field5116 = "Liste des serveurs chargée";
        class431.field6337 = "brillant1:";
        class384.field5553 = "Utiliser";
        class323.field4736 = "Gestionnaire de saisie chargé";
        class264.field3831 = "Écran-titre chargé";
        class369.field5333 = "M";
        class288.field4159 = "Chargement de Mechscape en cours - veuillez patienter...";
        class184.field2490 = "jaune:";
        class267.field3857 = "Interfaces chargées";
        class398.field5937 = "K";
        class211.field2829 = "Veuillez patienter - tentative de rétablissement.";
        class52.field714 = "Chargement des polices - ";
        class270.field3921 = "Chargement en cours...";
        class353.field5109 = "Mémoire en cours d'attribution";
        class218.field2882 = "Chargement de l'écran-titre - ";
        class223.field2942 = "ondulation2:";
        class218.field2884 = "Annuler";
        class199.field2654 = "Prendre";
        class435.field6401 = "Choisir une option";
        class298.field4321 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class363.field5244 = "déroulement:";
        class153.field2075 = "brillant2:";
        class407.field6045 = "Fermer";
        class442.field6475 = "Connexion perdue.";
        class153.field2072 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class234.field3127 = "rouge:";
        class315.field4600 = "Liste des mises à jour chargée";
        class234.field3125 = "Mémoire attribuée";
        class144.field1967 = " s'est déconnecté.";
        class379.field5507 = "Attaquer";
        class333.field4829 = "Module texte chargé";
        class174.field2325 = "clignotant1:";
        class400.field5968 = "tremblement:";
        class347.field5030 = "Objet d'abonnés";
        class393.field5623 = "Poser";
        class306.field4502 = "Sprites chargés";
        class167.field2262 = "Démarrage de la librairie 3D";
        class423.field6237 = "Moteur son préparé";
        class112.field1583 = "OK";
        class173.field2316 = "Veuillez patienter...";
        class230.field3075 = "K";
        class205.field2769 = "Monde de jeu créé";
        class277.field4014 = "Chargement des interfaces - ";
        class161.field2161 = "Chargement des fichiers config - ";
        class159.field2148 = " de votre liste d'amis.";
        class194.field2599 = "glissement:";
        class163.field2186 = "vert:";
        class291.field4172 = "Variables du client chargées";
        class169.field2270 = "Vérification des mises à jour - ";
        class313.field4587 = "Caché";
        class44.field628 = "Chargement des paramètres par défaut - ";
        class442.field6481 = "Votre liste noire est pleine (100 noms maximum).";
        class182.field2456 = "blanc:";
        class148.field2034 = "Polices chargées";
        class396.field5857 = "Continuer";
        class278.field4027 = "Chargement de RuneScape en cours - veuillez patienter...";
        class83.field1201 = "clignotant2:";
        class171.field2295 = "Sélectionner";
        class159.field2149 = " ";
        class319.field4660 = " de votre liste noire.";
        field4386++;
        class372.field5413 = "Chargement en cours. Veuillez patienter.";
        class117.field1650 = "M";
        class197.field2629 = "compétence ";
        class284.field4136 = "Chargement du module texte - ";
        class104.field1515 = "clignotant3:";
        class38.field532 = "Examiner";
        class396.field5866 = " est déjà dans votre liste d'amis.";
        class120.field1679 = " autres options";
        class202.field2706 = "Textures chargées";
        class92.field1295 = "cyan:";
        class451.field6585 = "Veuillez commencer par supprimer ";
        class166.field2244 = "Paramètres par défaut chargés";
        class225.field2960 = "Atteindre";
        class171.field2300 = "Fichiers config chargés";
        class346.field4972 = "niveau ";
        class331.field4814 = "Librairie 3D démarrée";
        class237.field3184 = "Veuillez commencer par supprimer ";
        class407.field6037 = "Regarder dans cette direction";
        class147.field2014 = "ondulation:";
        class432.field6342 = "Chargement de la liste des serveurs";
        class124.field1725 = "classement ";
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIIII)V", line = 496)
    public static final void method2059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 15171) {
            field4398 = 41;
        }
        class306.field4504 = arg5;
        class78.field1094 = arg2;
        class56.field749 = arg0;
        field4405++;
        class250.field3441 = arg3;
        class273.field3965 = arg1;
        class405.field6019 = arg4;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBLii;III)Ldc;", line = 515)
    public final class375 method2060(int arg0, byte arg1, class405 arg2, int arg3, int arg4, int arg5) {
        field4392++;
        int var7 = arg0;
        class12 var8 = this.field4406 == -1 || arg5 == -1 ? null : class33.method221((byte) 102, this.field4406);
        if (var8 != null) {
            var7 = arg0 | var8.method86((byte) 123, arg5, arg3, false);
        }
        if (this.field4400 != 128) {
            var7 |= 0x2;
        }
        if (arg1 > -20) {
            this.method2056((class228) null, 89, -39);
        }
        if (this.field4410 != 128 || this.field4393 != 0) {
            var7 |= 0x5;
        }
        class189 var9 = class22.field285;
        class375 var10;
        synchronized (class22.field285) {
            var10 = (class375) class22.field285.method1137((long) (this.field4387 |= arg2.field6028 << 29), 2108653711);
        }
        if (var10 == null || arg2.method1643(var10.method1608(), var7) != 0) {
            if (var10 != null) {
                var7 = arg2.method1620(var7, var10.method1608());
            }
            int var11 = var7;
            if (this.field4404 != null) {
                var11 = var7 | 0x2000;
            }
            if (this.field4403 != null) {
                var11 |= 0x4000;
            }
            class245 var12 = class235.method1410(-7137, this.field4396, class438.field6421, 0);
            if (var12 == null) {
                return null;
            }
            var10 = arg2.method1715(var12, var11, class430.field6313, this.field4390 + 64, this.field4394 + 850);
            if (this.field4404 != null) {
                for (int var13 = 0; var13 < this.field4404.length; var13++) {
                    var10.method1569(this.field4404[var13], this.field4391[var13]);
                }
            }
            if (this.field4403 != null) {
                for (int var14 = 0; var14 < this.field4403.length; var14++) {
                    var10.method1590(this.field4403[var14], this.field4385[var14]);
                }
            }
            var10.method1593(var7);
            class189 var15 = class22.field285;
            synchronized (class22.field285) {
                class22.field285.method1144((long) (this.field4387 |= arg2.field6028 << 29), var10, -3480);
            }
        }
        class375 var16 = var10.method1568((byte) 2, var7, true);
        if (var8 != null) {
            var16 = var8.method84((byte) 2, 0, arg5, arg3, 89, var16, arg4, var7);
        }
        if (this.field4410 != 128 || this.field4400 != 128) {
            var16.method1562(this.field4410, this.field4400, this.field4410);
        }
        if (this.field4393 != 0) {
            if (this.field4393 == 90) {
                var16.method1557(4096);
            }
            if (this.field4393 == 180) {
                var16.method1557(8192);
            }
            if (this.field4393 == 270) {
                var16.method1557(12288);
            }
        }
        var16.method1593(arg0);
        return var16;
    }
}
