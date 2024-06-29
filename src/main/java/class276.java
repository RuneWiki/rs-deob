import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class276 extends class65 {

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "Lan;")
    public class337 field4297 = new class337();

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "Lgk;")
    public class8 field4305 = new class8();

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "Lfg;")
    private class228 field4293;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    public static int field4299 = 0;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "[I")
    public static int[] field4300 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "Lwh;")
    public static class11 field4292;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "[I")
    public static int[] field4298;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V", line = 6)
    public final void method35(int arg0) {
        this.field4305.method35(arg0);
        field4310++;
        for (class137 var2 = (class137) this.field4297.method2331((byte) 100); var2 != null; var2 = (class137) this.field4297.method2332(-124)) {
            if (!this.field4293.method1601(var2, true)) {
                int var3 = arg0;
                do {
                    if (var2.field1920 >= var3) {
                        this.method1986(var2, var3, (byte) -104);
                        var2.field1920 -= var3;
                        break;
                    }
                    this.method1986(var2, var2.field1920, (byte) -104);
                    var3 -= var2.field1920;
                } while (!this.field4293.method1572(var3, -12, (int[]) null, 0, var2));
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V", line = 41)
    public static void method1982(byte arg0) {
        field4298 = null;
        field4300 = null;
        field4292 = null;
        int var1 = 124 % ((arg0 + 45) / 52);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([S[Ljava/lang/String;I)V", line = 53)
    public static final void method1983(short[] arg0, String[] arg1, int arg2) {
        field4309++;
        if (arg2 > -106) {
            method1985((class175) null, 1);
        }
        class49.method287(arg1, 0, -127, arg0, arg1.length - 1);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III[ILad;I)V", line = 66)
    private final void method1984(int arg0, int arg1, int arg2, int[] arg3, class137 arg4, int arg5) {
        if (arg0 != 100) {
            return;
        }
        if ((this.field4293.field3270[arg4.field1926] & 0x4) != 0 && arg4.field1891 < 0) {
            int var7 = this.field4293.field3307[arg4.field1926] / field4312;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field1893) / var7;
                if (arg5 < var8) {
                    arg4.field1893 += arg5 * var7;
                    break;
                }
                arg5 -= var8;
                arg4.field1903.method34(arg3, arg1, var8);
                int var9 = field4312 / 100;
                arg1 += var8;
                arg4.field1893 += var7 * var8 - 1048576;
                class174 var10 = arg4.field1903;
                int var11 = 262144 / var7;
                if (var9 > var11) {
                    var9 = var11;
                }
                if (this.field4293.field3281[arg4.field1926] == 0) {
                    arg4.field1903 = class174.method1170(arg4.field1895, var10.method1139(), var10.method1152(), var10.method1145());
                } else {
                    arg4.field1903 = class174.method1170(arg4.field1895, var10.method1139(), 0, var10.method1145());
                    this.field4293.method1603(arg4.field1911.field196[arg4.field1913] < 0, 91, arg4);
                    arg4.field1903.method1137(var9, var10.method1152());
                }
                if (arg4.field1911.field196[arg4.field1913] < 0) {
                    arg4.field1903.method1140(-1);
                }
                var10.method1138(var9);
                var10.method34(arg3, arg1, arg2 - arg1);
                if (var10.method1157()) {
                    this.field4305.method31(var10);
                }
            }
        }
        arg4.field1903.method34(arg3, arg1, arg5);
        field4294++;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "([III)V", line = 129)
    public final void method34(int[] arg0, int arg1, int arg2) {
        this.field4305.method34(arg0, arg1, arg2);
        field4302++;
        for (class137 var4 = (class137) this.field4297.method2331((byte) 8); var4 != null; var4 = (class137) this.field4297.method2332(-67)) {
            if (!this.field4293.method1601(var4, true)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field1920 >= var6) {
                        this.method1984(100, var5, var5 + var6, arg0, var4, var6);
                        var4.field1920 -= var6;
                        break;
                    }
                    this.method1984(100, var5, var5 + var6, arg0, var4, var4.field1920);
                    var5 += var4.field1920;
                    var6 -= var4.field1920;
                } while (!this.field4293.method1572(var6, -50, arg0, var5, var4));
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "()I", line = 164)
    public final int method37() {
        field4304++;
        return 0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Llc;I)V", line = 175)
    public static final void method1985(class175 arg0, int arg1) {
        class72.field914 = arg0;
        field4303++;
        if (arg1 != -1033) {
            method1982((byte) 123);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lad;IB)V", line = 187)
    private final void method1986(class137 arg0, int arg1, byte arg2) {
        field4308++;
        if ((this.field4293.field3270[arg0.field1926] & 0x4) != 0 && arg0.field1891 < 0) {
            int var4 = this.field4293.field3307[arg0.field1926] / field4312;
            int var5 = (var4 + 1048575 - arg0.field1893) / var4;
            arg0.field1893 = arg0.field1893 + (arg1 * var4) & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field4293.field3281[arg0.field1926] == 0) {
                    arg0.field1903 = class174.method1170(arg0.field1895, arg0.field1903.method1139(), arg0.field1903.method1152(), arg0.field1903.method1145());
                } else {
                    arg0.field1903 = class174.method1170(arg0.field1895, arg0.field1903.method1139(), 0, arg0.field1903.method1145());
                    this.field4293.method1603(arg0.field1911.field196[arg0.field1913] < 0, arg2 + 195, arg0);
                }
                if (arg0.field1911.field196[arg0.field1913] < 0) {
                    arg0.field1903.method1140(-1);
                }
                arg1 = arg0.field1893 / var4;
            }
        }
        if (arg2 != -104) {
            field4301 = -47;
        }
        arg0.field1903.method35(arg1);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V", line = 227)
    public static final void method1987(byte arg0) {
        int var1 = -20 % ((53 - arg0) / 46);
        if (class17.field236 == 10 && class250.field3787) {
            class97.method587(-15525, 28);
        }
        field4313++;
        if (class17.field236 == 30) {
            class97.method587(-15525, 25);
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lfg;)V", line = 954)
    public class276(class228 arg0) {
        this.field4293 = arg0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()Lfb;", line = 259)
    public final class65 method33() {
        field4307++;
        class137 var1;
        do {
            var1 = (class137) this.field4297.method2332(-59);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1903 == null);
        return var1.field1903;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BII)V", line = 284)
    public static final void method1988(byte arg0, int arg1, int arg2) {
        if (arg0 != 82) {
            return;
        }
        field4296++;
        for (int var3 = 0; var3 < class79.field997; var3++) {
            class300 var4 = class272.method1971(var3, (byte) 96);
            if (var4 != null) {
                int var5 = var4.field4673;
                if (var5 >= 0 && !class215.field3020.method392((byte) 17, var5)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field4670 >= 0) {
                    int var6 = var4.field4670;
                    int var7 = (var6 & 0x7F) + arg2;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (var6 + arg1 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class215.field3023[class305.method2138(arg0 ^ 0x7775, var8, 96)];
                } else if (var5 >= 0) {
                    var9 = class215.field3023[class305.method2138(30503, class215.field3020.method375(var5, arg0 + 4882), 96)];
                } else if (var4.field4676 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field4676;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 & 0x380) + (arg1 + var10 & 0xFC00) + var11;
                    var9 = class215.field3023[class305.method2138(30503, var12, 96)];
                }
                class196.field2816[var3 + 1] = var9;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V", line = 359)
    public static final void method1989(byte arg0) {
        class62.field789 = "Fermer";
        class254.field3870 = "Chargement des fichiers config - ";
        class107.field1361 = " autres options";
        class226.field3226 = " de votre liste noire.";
        class279.field4338 = "niveau ";
        class316.field4870 = "brillant2:";
        class206.field2890 = "jaune:";
        class235.field3424 = "Sélectionner";
        class283.field4442 = "glissement:";
        class233.field3403 = "clignotant3:";
        class145.field2019 = "M";
        class258.field3919 = "tremblement:";
        class98.field1286 = "Objet d'abonnés";
        class218.field3061 = "Veuillez patienter...";
        class40.field470 = "clignotant2:";
        class256.field3898 = "Caché";
        class264.field4164 = "Chargement des sprites - ";
        class163.field2251 = "Chargement en cours. Veuillez patienter.";
        class311.field4810 = "Interfaces chargées";
        class295.field4609 = "ondulation:";
        class301.field4699 = "clignotant1:";
        class311.field4813 = "Attaquer";
        class115.field1638 = "violet:";
        class255.field3881 = " ";
        class303.field4707 = "brillant3:";
        class170.field2431 = "Monde de jeu créé";
        class239.field3591 = "Chargement des textures - ";
        class204.field2869 = "Écran-titre chargé";
        class159.field2201 = "Librairie 3D démarrée";
        class146.field2035 = "Module texte chargé";
        class148.field2058 = "Continuer";
        class58.field701 = "Impossible de trouver ";
        class252.field3830 = "rouge:";
        class315.field4858 = "Chargement de RuneScape en cours - veuillez patienter...";
        if (arg0 != -103) {
            method1983((short[]) null, (String[]) null, 111);
        }
        class285.field4477 = "Mémoire en cours d'attribution";
        class253.field3845 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class121.field1696 = "Poser";
        class19.field252 = "classement ";
        class275.field4290 = "M";
        class298.field4657 = "Jeter";
        class152.field2094 = " est déjà dans votre liste d'amis.";
        class27.field354 = "Chargement de la liste des serveurs";
        class27.field353 = "Textures chargées";
        class186.field2693 = "Écran-titre ouvert";
        class61.field749 = "Moteur son préparé";
        class247.field3738 = "K";
        class171.field2457 = "Connexion au serveur de mise à jour en cours";
        class204.field2860 = " est déjà dans votre liste noire.";
        class40.field482 = "Veuillez commencer par supprimer ";
        class158.field2176 = "Veuillez patienter - tentative de rétablissement.";
        class50.field629 = "Utiliser";
        class236.field3436 = "Vérification des mises à jour - ";
        class137.field1916 = "Chargement en cours...";
        class279.field4339 = "Annuler";
        class196.field2812 = "Connexion perdue.";
        class38.field461 = "Paramètres par défaut chargés";
        class321.field4923 = "K";
        class56.field685 = "Démarrage de la librairie 3D";
        class149.field2063 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class164.field2262 = "Choisir une option";
        class134.field1859 = "Gestionnaire de saisie chargé";
        field4306++;
        class279.field4327 = "Veuillez commencer par supprimer ";
        class163.field2255 = "Sprites chargés";
        class307.field4754 = "brillant1:";
        class284.field4453 = " de votre liste d'amis.";
        class73.field942 = "Prendre";
        class218.field3062 = " s'est déconnecté.";
        class339.field5263 = "Chargement des paramètres par défaut - ";
        class343.field5323 = "Examiner";
        class97.field1274 = "blanc:";
        class289.field4527 = "Chargement des interfaces - ";
        class129.field1775 = "Connecté au serveur de mise à jour";
        class15.field213 = "Atteindre";
        class240.field3612 = "compétence ";
        class305.field4727 = "déroulement:";
        class42.field500 = "cyan:";
        class237.field3479 = "vert:";
        class229.field3342 = " s'est connecté.";
        class103.field1336 = "OK";
        class342.field5312 = "Liste des serveurs chargée";
        class15.field199 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class309.field4779 = "voudrait faire un échange avec vous.";
        class218.field3068 = "ondulation2:";
        class116.field1641 = "Fichiers config chargés";
        class279.field4328 = "Regarder dans cette direction";
        class286.field4504 = "Votre liste noire est pleine (100 noms maximum).";
        class146.field2025 = "Chargement du module texte - ";
        class195.field2799 = "Polices chargées";
        class154.field2128 = "Chargement de l'écran-titre - ";
        class328.field5017 = "Liste des mises à jour chargée";
        class316.field4875 = "Chargement des polices - ";
        class227.field3239 = "Mémoire attribuée";
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "()Lfb;", line = 702)
    public final class65 method30() {
        class137 var1 = (class137) this.field4297.method2331((byte) 86);
        field4295++;
        if (var1 == null) {
            return null;
        } else if (var1.field1903 == null) {
            return this.method33();
        } else {
            return var1.field1903;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILp;)V", line = 728)
    public static final void method1990(int arg0, class107 arg1) {
        field4311++;
        int var2 = class252.field3835 >> 1;
        int var3 = class89.field1113 >> 2 << 10;
        byte[][] var4 = new byte[class291.field4574][class308.field4766];
        while (arg1.field1400 < arg1.field1388.length) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg1.method661(-1) == 1) {
                var5 = true;
                var6 = arg1.method661(-1);
                var7 = arg1.method661(-1);
            }
            int var8 = arg1.method661(-1);
            int var9 = arg1.method661(-1);
            int var10 = var8 * 64 - class239.field3595;
            int var11 = class249.field3771 + class308.field4766 - (var9 * 64) - 1;
            if (var10 >= 0 && var11 - 63 >= 0 && class291.field4574 > (var10 + 63) && class308.field4766 > var11) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var6 * 8 <= var12 && var12 < var6 * 8 + 8 && var7 * 8 <= var14 && var7 * 8 + 8 > var14) {
                            var13[var11 - var14] = arg1.method679(-3);
                        }
                    }
                }
            } else if (var5) {
                arg1.field1400 += 64;
            } else {
                arg1.field1400 += 4096;
            }
        }
        int var15 = class291.field4574;
        int var16 = class308.field4766;
        if (arg0 <= 37) {
            method1989((byte) -126);
        }
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var15) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class226 var26 = class270.method1962(-107, var25 - 1);
                        var17[var23] += var26.field3228;
                        var21[var23] += var26.field3224;
                        var18[var23] += var26.field3220;
                        var19[var23] += var26.field3231;
                        var10002 = var20[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class226 var29 = class270.method1962(-110, var28 - 1);
                        var17[var23] -= var29.field3228;
                        var21[var23] -= var29.field3224;
                        var18[var23] -= var29.field3220;
                        var19[var23] -= var29.field3231;
                        var10002 = var20[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class247.field3754[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 + 5;
                    if (var16 > var37) {
                        var31 += var17[var37];
                        var32 += var21[var37];
                        var34 += var20[var37];
                        var33 += var18[var37];
                        var35 += var19[var37];
                    }
                    int var38 = var36 - 5;
                    if (var38 >= 0) {
                        var31 -= var17[var38];
                        var33 -= var18[var38];
                        var34 -= var20[var38];
                        var32 -= var21[var38];
                        var35 -= var19[var38];
                    }
                    if (var36 >= 0 && var34 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var35 == 0 ? 0 : class214.method1464(121, var32 / var34, var31 * 256 / var35, var33 / var34);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var2;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var3 + var40 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[(class229.method1613(63, var36) << 6) + class229.method1613(63, var22)] = class215.field3023[class10.method56(96, var42, false)];
                        } else if (var39 != null) {
                            var39[class229.method1613(63, var22) + class229.method1613(4032, var36 << 6)] = 0;
                        }
                    }
                }
            }
        }
    }
}
