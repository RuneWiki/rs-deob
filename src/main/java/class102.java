import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class102 extends class114 {

    @OriginalMember(owner = "client!oi", name = "Z", descriptor = "I")
    private int field1470 = 6;

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "I")
    public static int field1457 = -1;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "S")
    public static short field1458 = 1;

    @OriginalMember(owner = "client!oi", name = "V", descriptor = "I")
    public static int field1466 = 0;

    @OriginalMember(owner = "client!oi", name = "T", descriptor = "Ljava/lang/String;")
    public static String field1464 = "green:";

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!oi", name = "S", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!oi", name = "W", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!oi", name = "X", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!oi", name = "Y", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!oi", name = "ab", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZI[Lej;I[B)V")
    public static final void method650(int arg0, boolean arg1, int arg2, class213[] arg3, int arg4, byte[] arg5) {
        ++field1462;
        if (arg4 != 4096) {
            method651((byte) -127);
        }
        class215 var6 = new class215(arg5);
        int var7 = -1;
        while (true) {
            int var8 = var6.method1360((byte) 116);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method1347(true);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 + -1;
                int var11 = var9 >> 6 & 63;
                int var12 = 63 & var9;
                int var13 = var9 >> 12;
                int var14 = arg2 + var12;
                int var15 = var11 - -arg0;
                int var16 = var6.method1374((byte) -60);
                int var17 = var16 >> 2;
                int var18 = 3 & var16;
                if (~var15 < -1 && ~var14 < -1 && ~var15 > -104 && ~var14 > -104) {
                    class213 var19 = null;
                    if (!arg1) {
                        int var20 = var13;
                        if ((2 & class164.field2333[1][var15][var14]) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg3[var20];
                        }
                    }
                    class83.method534(var19, var15, var13, var13, !arg1, (byte) -124, var14, var17, arg1, var18, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)V")
    public static final void method651(byte arg0) {
        class288.field4601 = "Regarder dans cette direction";
        class38.field578 = "Connexion perdue.";
        class229.field3595 = "Annuler";
        class280.field4452 = "Veuillez commencer par supprimer ";
        class188.field2847 = "Fichiers config chargés";
        class59.field816 = "M";
        class227.field3555 = "Chargement des textures - ";
        class95.field1367 = "Utiliser";
        class65.field862 = "blanc:";
        class60.field829 = " autres options";
        class308.field4955 = "Démarrage de la librairie 3D";
        class101.field1453 = "Continuer";
        class292.field4652 = "ondulation2:";
        if (arg0 != 111) {
            method652((byte) -73);
        }
        class205.field3060 = "Prendre";
        class83.field1158 = "Impossible de trouver ";
        class163.field2313 = "Mémoire attribuée";
        class5.field46 = "K";
        class233.field3649 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class12.field200 = "Connecté au serveur de mise à jour";
        class194.field2964 = "Module texte chargé";
        class58.field799 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class5.field42 = "Veuillez commencer par supprimer ";
        class54.field775 = "OK";
        class222.field3463 = " est déjà dans votre liste d'amis.";
        class263.field4224 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class205.field3075 = "Vérification des mises à jour - ";
        class150.field2088 = "Monde de jeu créé";
        class57.field797 = "brillant1:";
        class202.field3051 = "Atteindre";
        class128.field1784 = "Votre liste noire est pleine (100 noms maximum).";
        class263.field4226 = "Chargement en cours...";
        class24.field386 = "Choisir une option";
        class38.field581 = "Chargement des polices - ";
        class234.field3660 = "ondulation:";
        class106.field1523 = "Chargement des paramètres par défaut - ";
        class271.field4325 = "niveau ";
        class24.field388 = "Mémoire en cours d'attribution";
        class163.field2309 = "Chargement de l'écran-titre - ";
        class276.field4391 = "Gestionnaire de saisie chargé";
        class195.field2990 = "Poser";
        class154.field2135 = "Chargement de Mechscape en cours - veuillez patienter...";
        class186.field2823 = "Jeter";
        class101.field1451 = " de votre liste d'amis.";
        ++field1463;
        class60.field832 = " de votre liste noire.";
        class24.field381 = "clignotant1:";
        class45.field668 = "Examiner";
        class159.field2220 = "Connexion au serveur de mise à jour en cours";
        class12.field202 = "Chargement des fichiers config - ";
        class244.field3827 = "Veuillez patienter - tentative de rétablissement.";
        class126.field1779 = "Chargement de RuneScape en cours - veuillez patienter...";
        class75.field1060 = "Fermer";
        class69.field969 = "Interfaces chargées";
        class294.field4694 = "Chargement en cours. Veuillez patienter.";
        class238.field3694 = " est déjà dans votre liste noire.";
        class221.field3435 = "Écran-titre chargé";
        class92.field1352 = "Chargement des interfaces - ";
        class294.field4693 = "Chargement du module texte - ";
        class159.field2213 = "Objet d'abonnés";
        class92.field1348 = "Chargement de la liste des serveurs";
        class166.field2369 = "Moteur son préparé";
        class164.field2320 = "Librairie 3D démarrée";
        class93.field1365 = "Liste des serveurs chargée";
        class39.field597 = "jaune:";
        class105.field1514 = "classement ";
        class298.field4754 = "Sprites chargés";
        class238.field3685 = "Textures chargées";
        class218.field3360 = "brillant2:";
        class117.field1683 = "M";
        class215.field3254 = " s'est déconnecté.";
        class69.field973 = "Attaquer";
        class7.field75 = " s'est connecté.";
        class142.field1954 = "tremblement:";
        class260.field4195 = "clignotant3:";
        class82.field1131 = "déroulement:";
        class156.field2154 = "K";
        class35.field530 = "brillant3:";
        class250.field3913 = "glissement:";
        class15.field261 = "violet:";
        class48.field690 = " ";
        class107.field1527 = "rouge:";
        class6.field62 = "Paramètres par défaut chargés";
        class166.field2359 = "cyan:";
        class229.field3577 = "Liste des mises à jour chargée";
        class180.field2727 = "Écran-titre ouvert";
        class169.field2413 = "clignotant2:";
        class248.field3880 = "Chargement des sprites - ";
        class208.field3096 = "Polices chargées";
        class107.field1529 = "Caché";
        class96.field1392 = "vert:";
        class32.field479 = "compétence ";
        class93.field1361 = "Veuillez patienter...";
        class236.field3672 = "Sélectionner";
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(B)V")
    public static final void method652(byte arg0) {
        ++field1471;
        class89.method574();
        int var1 = 0;
        if (arg0 != 18) {
            method654(true);
        }
        while (~var1 > -5) {
            class156.field2153[var1].method1326((byte) -121);
            ++var1;
        }
        System.gc();
    }

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "(I)Ljc;")
    private static final class284 method653(int arg0) {
        ++field1468;
        class74 var1 = new class74(class242.field3805, class70.field1021, class275.field4376[0], class96.field1381[0], class137.field1869[0], class112.field1613[0], class134.field1847[0], class298.field4748);
        if (arg0 != -10438) {
            field1457 = 127;
        }
        class282.method1840(true);
        return var1;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class102() {
        super(2, false);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        if (arg1) {
            field1464 = null;
        }
        ++field1469;
        int[] var3 = super.field1630.method302(arg0, -122);
        if (super.field1630.field710) {
            int[] var4 = this.method729(arg0, 0, 0);
            int[] var5 = this.method729(arg0, 0, 1);
            int var6 = this.field1470;
            if (~var6 != -2) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class145.field2009; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class145.field2009; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var12 >= ~var11 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class145.field2009; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var15 < ~var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class145.field2009 > var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var17 <= ~var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class145.field2009 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 != 0 ? -((4096 - var5[var19] << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class145.field2009 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class145.field2009; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? 4096 - ((4096 - var4[var23]) * (-var24 + 4096) >> 11) : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; class145.field2009 > var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class145.field2009 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class145.field2009; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class145.field2009 > var29; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class145.field2009 < ~var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(Z)Lbf;")
    public static final class108 method654(boolean arg0) {
        ++field1459;
        int var1 = class137.field1869[0] * class112.field1613[0];
        byte[] var2 = class134.field1847[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; ~var4 > ~var1; ++var4) {
            var3[var4] = class298.field4748[class32.method199(var2[var4], 255)];
        }
        if (arg0) {
            field1464 = null;
        }
        class203 var5 = new class203(class242.field3805, class70.field1021, class275.field4376[0], class96.field1381[0], class137.field1869[0], class112.field1613[0], var3);
        class282.method1840(true);
        return var5;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)[[I")
    public final int[][] method73(byte arg0, int arg1) {
        ++field1465;
        int[][] var3 = super.field1627.method104(arg1, (byte) 121);
        if (super.field1627.field280) {
            int[][] var4 = this.method727(0, arg1, 842);
            int[][] var5 = this.method727(1, arg1, arg0 + 954);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            int[] var12 = var5[0];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            int var15 = this.field1470;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~var16 > ~class145.field2009; ++var16) {
                                                                int var17 = var10[var16];
                                                                int var18 = var11[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var12[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var9[var16];
                                                                var7[var16] = var22 - (var20 * var22 >> 11) + var20;
                                                                var6[var16] = var18 + var21 - (var18 * var21 >> 11);
                                                                var8[var16] = -(var17 * var19 >> 11) + var17 - -var19;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class145.field2009 > var23; ++var23) {
                                                            int var24 = var13[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var9[var23];
                                                            int var29 = var12[var23];
                                                            var7[var23] = var29 >= var28 ? var29 - var28 : var28 - var29;
                                                            var6[var23] = var26 > var27 ? -var27 + var26 : -var26 + var27;
                                                            var8[var23] = var25 > var24 ? -var24 + var25 : -var25 + var24;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class145.field2009 > var30; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var12[var30];
                                                        int var33 = var13[var30];
                                                        int var34 = var11[var30];
                                                        int var35 = var10[var30];
                                                        int var36 = var14[var30];
                                                        var7[var30] = var32 < var31 ? var31 : var32;
                                                        var6[var30] = ~var36 > ~var34 ? var34 : var36;
                                                        var8[var30] = var35 <= var33 ? var33 : var35;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class145.field2009; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var14[var37];
                                                    int var40 = var9[var37];
                                                    int var41 = var11[var37];
                                                    int var42 = var13[var37];
                                                    int var43 = var12[var37];
                                                    var7[var37] = ~var43 >= ~var40 ? var43 : var40;
                                                    var6[var37] = ~var39 >= ~var41 ? var39 : var41;
                                                    var8[var37] = ~var38 > ~var42 ? var38 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class145.field2009 > var44; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var11[var44];
                                                int var47 = var10[var44];
                                                var7[var44] = var45 == 0 ? 0 : 4096 - (-var12[var44] + 4096 << 12) / var45;
                                                var6[var44] = var46 != 0 ? -((-var14[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                var8[var44] = var47 != 0 ? -((-var13[var44] + 4096 << 12) / var47) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class145.field2009 > var48; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var10[var48];
                                            int var51 = var9[var48];
                                            var7[var48] = var51 != 4096 ? (var12[var48] << 12) / (-var51 + 4096) : 4096;
                                            var6[var48] = ~var49 == -4097 ? 4096 : (var14[var48] << 12) / (-var49 + 4096);
                                            var8[var48] = var50 == 4096 ? 4096 : (var13[var48] << 12) / (4096 - var50);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class145.field2009 < ~var52; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var12[var52];
                                        int var55 = var14[var52];
                                        var7[var52] = var54 < 2048 ? var9[var52] * var54 >> 11 : 4096 - ((-var9[var52] + 4096) * (-var54 + 4096) >> 11);
                                        var6[var52] = ~var55 > -2049 ? var11[var52] * var55 >> 11 : 4096 - ((-var11[var52] + 4096) * (-var55 + 4096) >> 11);
                                        var8[var52] = ~var53 <= -2049 ? -((4096 - var10[var52]) * (-var53 + 4096) >> 11) + 4096 : var10[var52] * var53 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class145.field2009; ++var56) {
                                    var7[var56] = 4096 - ((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12);
                                    var6[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var10[var56]) * (-var13[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class145.field2009; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var12[var57];
                                int var60 = var13[var57];
                                var7[var57] = ~var59 != -1 ? (var9[var57] << 12) / var59 : 4096;
                                var6[var57] = var58 == 0 ? 4096 : (var11[var57] << 12) / var58;
                                var8[var57] = ~var60 != -1 ? (var10[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; class145.field2009 > var61; ++var61) {
                            var7[var61] = var9[var61] * var12[var61] >> 12;
                            var6[var61] = var11[var61] * var14[var61] >> 12;
                            var8[var61] = var10[var61] * var13[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; class145.field2009 > var62; ++var62) {
                        var7[var62] = var9[var62] + -var12[var62];
                        var6[var62] = var11[var62] + -var14[var62];
                        var8[var62] = var10[var62] + -var13[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class145.field2009; ++var63) {
                    var7[var63] = var9[var63] + var12[var63];
                    var6[var63] = var11[var63] + var14[var63];
                    var8[var63] = var10[var63] + var13[var63];
                }
            }
        }
        if (arg0 != -112) {
            field1464 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field1648 = arg0.method1374((byte) -60) == 1;
            }
        } else {
            this.field1470 = arg0.method1374((byte) -60);
        }
        ++field1461;
        if (arg2 != 12953) {
            method652((byte) 123);
        }
    }

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "(I)V")
    public static void method655(int arg0) {
        if (arg0 == 0) {
            field1464 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lnh;BI)Ljc;")
    public static final class284 method656(class305 arg0, byte arg1, int arg2) {
        ++field1460;
        if (!class109.method696(0, arg2, arg0)) {
            return null;
        } else {
            return arg1 >= -83 ? null : method653(-10438);
        }
    }
}
