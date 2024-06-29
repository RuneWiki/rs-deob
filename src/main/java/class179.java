import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class179 extends class235 {

    @OriginalMember(owner = "client!fq", name = "F", descriptor = "[[[I")
    public static int[][][] field2351 = new int[2][][];

    @OriginalMember(owner = "client!fq", name = "J", descriptor = "I")
    public static int field2355 = 0;

    @OriginalMember(owner = "client!fq", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field2357 = new String[100];

    @OriginalMember(owner = "client!fq", name = "R", descriptor = "I")
    public static volatile int field2363 = 0;

    @OriginalMember(owner = "client!fq", name = "B", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!fq", name = "C", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!fq", name = "E", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!fq", name = "G", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!fq", name = "H", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!fq", name = "I", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!fq", name = "M", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!fq", name = "N", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!fq", name = "Q", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!fq", name = "S", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!fq", name = "T", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!fq", name = "U", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!fq", name = "V", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!fq", name = "W", descriptor = "I")
    public static int field2368;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fq", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field2369;

    @OriginalMember(owner = "client!fq", name = "D", descriptor = "Ljava/lang/String;")
    public String field2349;

    @OriginalMember(owner = "client!fq", name = "A", descriptor = "[C")
    public char[] field2346;

    @OriginalMember(owner = "client!fq", name = "K", descriptor = "[C")
    public char[] field2356;

    @OriginalMember(owner = "client!fq", name = "O", descriptor = "[I")
    public int[] field2360;

    @OriginalMember(owner = "client!fq", name = "P", descriptor = "[I")
    public int[] field2361;

    // $FF: synthetic method
    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1109(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZJ[II)Ljava/lang/String;", line = 7)
    public static final String method1096(boolean arg0, long arg1, int[] arg2, int arg3) {
        field2348++;
        if (!arg0) {
            method1107((byte) -103);
        }
        if (class295.field4254 != null) {
            String var5 = class295.field4254.method314(arg2, arg3, -74, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "(I)V", line = 35)
    public static final void method1097(int arg0) {
        class224.field3177 = "Veuillez commencer par supprimer ";
        class51.field757 = "Chargement de la liste des serveurs";
        class86.field1200 = "Chargement du module texte - ";
        class278.field4086 = "Paramètres par défaut chargés";
        class187.field2543 = "rouge:";
        class151.field1979 = "Chargement des polices - ";
        class319.field4566 = " autres options";
        class26.field451 = "Prendre";
        class280.field4121 = "Textures chargées";
        class370.field5496 = "Chargement en cours...";
        class167.field2191 = "Sprites chargés";
        class29.field506 = "Chargement de l'écran-titre - ";
        class434.field6393 = "Chargement des fichiers config - ";
        class256.field3755 = "Polices chargées";
        class311.field4447 = "Chargement de RuneScape en cours - veuillez patienter...";
        class45.field672 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class398.field5952 = " de votre liste d'amis.";
        class309.field4435 = "Poser";
        class281.field4129 = "Module texte chargé";
        class80.field1103 = "clignotant3:";
        class16.field186 = "Librairie 3D démarrée";
        class387.field5787 = "jaune:";
        class154.field2020 = "Interfaces chargées";
        class34.field560 = "Regarder dans cette direction";
        class126.field1685 = "Fermer";
        field2359++;
        class423.field6293 = "Caché";
        class170.field2243 = "Votre liste noire est pleine (100 noms maximum).";
        class403.field5983 = "Veuillez commencer par supprimer ";
        class444.field6467 = "cyan:";
        class177.field2313 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class413.field6172 = "Veuillez patienter...";
        class284.field4146 = "brillant3:";
        class166.field2173 = "Examiner";
        class40.field636 = "K";
        class6.field59 = "Gestionnaire de saisie chargé";
        class376.field5682 = "Fichiers config chargés";
        class191.field2666 = "Connecté au serveur de mise à jour";
        class185.field2521 = "Chargement des interfaces - ";
        class138.field1831 = "Liste des mises à jour chargée";
        class219.field3104 = " s'est connecté.";
        class238.field3341 = "Utiliser";
        if (arg0 != -1) {
            field2350 = 31;
        }
        class134.field1790 = "Variables du client chargées";
        class311.field4446 = "Écran-titre ouvert";
        class73.field994 = "Annuler";
        class284.field4157 = "Chargement en cours. Veuillez patienter.";
        class97.field1330 = "classement ";
        class264.field3838 = "ondulation:";
        class306.field4377 = " ";
        class373.field5621 = "blanc:";
        class273.field4004 = "Écran-titre chargé";
        class271.field3970 = "Sélectionner";
        class151.field1976 = " est déjà dans votre liste d'amis.";
        class197.field2821 = "Jeter";
        class291.field4204 = "Objet d'abonnés";
        class197.field2811 = "Chargement des textures - ";
        class220.field3141 = " s'est déconnecté.";
        class93.field1279 = "Chargement des sprites - ";
        class74.field1001 = "M";
        class282.field4139 = "Démarrage de la librairie 3D";
        class300.field4295 = "K";
        class213.field3035 = "clignotant1:";
        class137.field1811 = "Chargement des paramètres par défaut - ";
        class74.field1004 = "M";
        class391.field5860 = "Veuillez patienter - tentative de rétablissement.";
        class192.field2672 = "brillant1:";
        class307.field4388 = "Continuer";
        class119.field1595 = "Impossible de trouver ";
        class119.field1586 = "Moteur son préparé";
        class328.field4710 = "tremblement:";
        class138.field1847 = "Chargement de Mechscape en cours - veuillez patienter...";
        class327.field4697 = "OK";
        class295.field4258 = "Connexion au serveur de mise à jour en cours";
        class420.field6248 = " de votre liste noire.";
        class75.field1015 = "Choisir une option";
        class433.field6391 = "niveau ";
        class143.field1893 = "Attaquer";
        class451.field6573 = "Mémoire attribuée";
        class239.field3370 = "vert:";
        class52.field760 = "Connexion perdue.";
        class281.field4132 = "clignotant2:";
        class436.field6401 = "Monde de jeu créé";
        class329.field4728 = "Liste des serveurs chargée";
        class8.field78 = "ondulation2:";
        class132.field1776 = "brillant2:";
        class274.field4032 = "violet:";
        class324.field4661 = "Atteindre";
        class411.field6153 = "Mémoire en cours d'attribution";
        class6.field61 = " est déjà dans votre liste noire.";
        class126.field1682 = "Vérification des mises à jour - ";
        class390.field5852 = "glissement:";
        class314.field4506 = "compétence ";
        class6.field60 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class452.field6584 = "déroulement:";
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "([Lro;ZI)V", line = 317)
    public static final void method1098(class249[] arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field2363 = 61;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class249 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field3637 == 0) {
                    if (var4.field3493 != null) {
                        method1098(var4.field3493, true, arg2);
                    }
                    class158 var5 = (class158) class269.field3933.method954(118, (long) var4.field3622);
                    if (var5 != null) {
                        class116.method813(var5.field2075, 4095, arg2);
                    }
                }
                if (arg2 == 0 && var4.field3642 != null) {
                    class228 var6 = new class228();
                    var6.field3210 = var4;
                    var6.field3215 = var4.field3642;
                    class365.method2395(var6);
                }
                if (arg2 == 1 && var4.field3519 != null) {
                    if (var4.field3517 >= 0) {
                        class249 var7 = class107.method746(var4.field3622, -15);
                        if (var7 == null || var7.field3493 == null || var7.field3493.length <= var4.field3517 || var7.field3493[var4.field3517] != var4) {
                            continue;
                        }
                    }
                    class228 var8 = new class228();
                    var8.field3210 = var4;
                    var8.field3215 = var4.field3519;
                    class365.method2395(var8);
                }
            }
        }
        field2354++;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lil;I)V", line = 387)
    public final void method1099(class265 arg0, int arg1) {
        field2347++;
        while (true) {
            int var3 = arg0.method1697(-26);
            if (var3 == 0) {
                if (arg1 > -15) {
                    method1102(-72, (class437) null, 75, (class138[]) null, -63, false, 70, 113, 7, (byte[]) null, 93, true);
                    return;
                } else {
                    return;
                }
            }
            this.method1100((byte) 62, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BILil;)V", line = 409)
    private final void method1100(byte arg0, int arg1, class265 arg2) {
        if (arg0 <= 46) {
            field2351 = null;
        }
        if (arg1 == 1) {
            this.field2349 = arg2.method1712(false);
        } else if (arg1 == 2) {
            int var4 = arg2.method1697(-120);
            this.field2356 = new char[var4];
            this.field2360 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2360[var5] = arg2.method1685(8104);
                byte var6 = arg2.method1708((byte) 127);
                this.field2356[var5] = var6 == 0 ? 0 : class24.method211(49, var6);
            }
        } else if (arg1 == 3) {
            int var7 = arg2.method1697(-116);
            this.field2361 = new int[var7];
            this.field2346 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2361[var8] = arg2.method1685(8104);
                byte var9 = arg2.method1708((byte) 127);
                this.field2346[var8] = var9 == 0 ? 0 : class24.method211(66, var9);
            }
        }
        field2368++;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lnr;I)V", line = 476)
    public static final void method1101(class437 arg0, int arg1) {
        arg0.method2155(0, 0, class345.field5120, 350);
        field2367++;
        if (arg1 != -19812) {
            return;
        }
        arg0.method2188(0, 0, class345.field5120, 350, class90.field1245 << 24 | 0x332277, 1);
        for (int var2 = 0; var2 < 100; var2++) {
            int var13 = class410.field6134[var2];
            int var14 = class309.field4407[var2];
            arg0.method2188(var13, var14, 2, 2, class122.field1641[var2] << 24 | 0xFFFFFF, 1);
        }
        int var3 = 350 / class358.field5249;
        if (class452.field6588 > 0) {
            int var4 = 346 - class358.field5249 - 4;
            int var5 = var3 * var4 / (var3 + class452.field6588 - 1);
            int var6 = 4;
            if (class452.field6588 > 1) {
                var6 += (class452.field6588 - class208.field2988 - 1) * (var4 - var5) / (class452.field6588 - 1);
            }
            arg0.method2188(class345.field5120 - 16, var6, 12, var5, class90.field1245 << 24 | 0x332277, 2);
            for (int var7 = class208.field2988; class208.field2988 + var3 > var7 && class452.field6588 > var7; var7++) {
                String[] var8 = class369.method2436((byte) 120, class248.field3458[var7], '\b');
                int var9 = (class345.field5120 - 8 - 16) / var8.length;
                for (int var10 = 0; var10 < var8.length; var10++) {
                    int var11 = var9 * var10 + 8;
                    arg0.method2155(var11, 0, var11 + var9 - 8, 350);
                    class311.field4456.method1319(-8219, var8[var10], -1, 350 - class231.field3264 - class231.field3262.field2146 - ((-class208.field2988 + var7) * class358.field5249) - 2, var11, -16777216);
                }
            }
        }
        arg0.method2155(0, 0, class345.field5120, 350);
        arg0.method2769(0, -1, (byte) -100, class345.field5120, 350 - class231.field3264);
        class232.field3275.method1319(arg1 ^ 0x6D79, "--> " + class155.field2030, -1, 350 - class272.field3986.field2146 - 1, 10, -16777216);
        int var12 = -1;
        if ((class50.field698 % 30) > 15) {
            var12 = 16777215;
        }
        arg0.method2771(true, 350 - class272.field3986.field2146 - 11, var12, class272.field3986.method1029((byte) 116, "--> " + class155.field2030.substring(0, class159.field2080)) + 10, 12);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILnr;I[Lbi;IZIII[BIZ)V", line = 554)
    public static final void method1102(int arg0, class437 arg1, int arg2, class138[] arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10, boolean arg11) {
        field2353++;
        class265 var12 = new class265(arg9);
        int var13 = -1;
        while (true) {
            int var14 = var12.method1700(32767);
            if (var14 == 0) {
                if (arg11) {
                    field2355 = 12;
                    return;
                }
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1680(-1647926640);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = (var15 & 0xFE5) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method1697(-14);
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg7 == var19 && var18 >= arg8 && var18 < (arg8 + 8) && arg0 <= var17 && arg0 + 8 > var17) {
                    class404 var23 = class165.method1020(var13, -31);
                    int var24 = class212.method1314(var17 & 0x7, var23.field6014, var23.field6048, 65536, var22, var18 & 0x7, arg6) + arg2;
                    int var25 = class166.method1034(-6459, var17 & 0x7, var23.field6014, var23.field6048, var18 & 0x7, var22, arg6) + arg4;
                    if (var24 > 0 && var25 > 0 && var24 < class324.field4652 - 1 && class336.field4964 - 1 > var25) {
                        class138 var26 = null;
                        if (!arg5) {
                            int var27 = arg10;
                            if ((class37.field606[1][var24][var25] & 0x2) == 2) {
                                var27 = arg10 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg3[var27];
                            }
                        }
                        class391.method2560(true, var13, arg1, (byte) -91, arg10, var26, var21, arg10, var24, var22 + arg6 & 0x3, var25, -1, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIBLnr;ILbi;I)V", line = 637)
    public static final void method1103(int arg0, int arg1, int arg2, byte arg3, class437 arg4, int arg5, class138 arg6, int arg7) {
        field2366++;
        class351 var8 = null;
        if (arg0 == 0) {
            var8 = (class351) class87.method539(arg2, arg1, arg7);
        }
        if (arg0 == 1) {
            var8 = (class351) class117.method822(arg2, arg1, arg7);
        }
        if (arg0 == 2) {
            var8 = (class351) class312.method1947(arg2, arg1, arg7, field2369 == null ? (field2369 = method1109("im")) : field2369);
        }
        if (arg0 == 3) {
            var8 = (class351) class135.method910(arg2, arg1, arg7);
        }
        if (var8 != null) {
            int var9 = var8.method160(-22056);
            int var10 = var8.method148((byte) -68);
            class404 var11 = class165.method1020(var8.method150((byte) -115), 121);
            if (var11.method2635(0)) {
                class34.method283((byte) 123, var11, arg1, arg7, arg2);
            }
            if (var8.method146((byte) 122)) {
                var8.method156(arg4, false);
            }
            if (arg0 == 0) {
                class208.method1307(arg2, arg1, arg7);
                if (var11.field6039 != 0) {
                    arg6.method916(var10, var9, arg7, arg1, 42, !var11.field6070, var11.field6037);
                }
            } else if (arg0 == 1) {
                class302.method1910(arg2, arg1, arg7);
            } else if (arg0 == 2) {
                class52.method357(arg2, arg1, arg7, field2369 == null ? (field2369 = method1109("im")) : field2369);
                if (var11.field6039 != 0 && class324.field4652 > (var11.field6048 + arg1) && class336.field4964 > (var11.field6048 + arg7) && var11.field6014 + arg1 < class324.field4652 && var11.field6014 + arg7 < class336.field4964) {
                    arg6.method922(var11.field6014, var11.field6037, !var11.field6070, arg1, -14463, var11.field6048, arg7, var10);
                }
            } else if (arg0 == 3) {
                class312.method1949(arg2, arg1, arg7);
                if (var11.field6039 == 1) {
                    arg6.method920(-51, arg7, arg1);
                }
            }
        }
        if (arg3 > -75) {
            method1107((byte) 84);
        }
    }

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "(B)V", line = 714)
    public final void method1104(byte arg0) {
        if (this.field2361 != null) {
            for (int var2 = 0; var2 < this.field2361.length; var2++) {
                this.field2361[var2] = class128.method871(this.field2361[var2], 32768);
            }
        }
        field2365++;
        if (this.field2360 != null) {
            for (int var3 = 0; var3 < this.field2360.length; var3++) {
                this.field2360[var3] = class128.method871(this.field2360[var3], 32768);
            }
        }
        if (arg0 < 16) {
            method1096(false, 68L, (int[]) null, 110);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(CI)I", line = 746)
    public final int method1105(char arg0, int arg1) {
        field2362++;
        if (this.field2361 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2361.length; var3++) {
            if (this.field2346[var3] == arg0) {
                return this.field2361[var3];
            }
        }
        if (arg1 <= 80) {
            field2357 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "(I)V", line = 770)
    public static void method1106(int arg0) {
        field2351 = null;
        field2357 = null;
        if (arg0 != 32335) {
            field2363 = 62;
        }
    }

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "(B)V", line = 787)
    public static final void method1107(byte arg0) {
        if (class35.field574.method2172()) {
            class81.method514(true);
            class35.field574.method2045(class319.field4561);
            class176.method1075((byte) -125);
        } else {
            class22.method189(class265.field3854, 100);
        }
        field2358++;
        if (arg0 > -57) {
            field2364 = 108;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(CB)I", line = 806)
    public final int method1108(char arg0, byte arg1) {
        field2352++;
        if (this.field2360 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2360.length; var3++) {
            if (this.field2356[var3] == arg0) {
                return this.field2360[var3];
            }
        }
        if (arg1 >= -119) {
            field2355 = 110;
        }
        return -1;
    }
}
