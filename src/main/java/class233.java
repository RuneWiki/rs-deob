import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class233 {

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Z")
    private boolean field3149 = false;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    private int field3170 = 32;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "J")
    private long field3146 = class224.method1425(-26805);

    @OriginalMember(owner = "client!we", name = "D", descriptor = "I")
    private int field3174 = 0;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "Z")
    private boolean field3173 = true;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "[Lpn;")
    private class444[] field3172 = new class444[8];

    @OriginalMember(owner = "client!we", name = "E", descriptor = "[Lpn;")
    private class444[] field3175 = new class444[8];

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    private int field3180 = 0;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "I")
    private int field3177 = 0;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "J")
    private long field3178 = 0L;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "J")
    private long field3181 = 0L;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    private int field3182 = 0;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Z")
    public static boolean field3156 = false;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Lng;")
    public static class190 field3157 = new class190(64);

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "I")
    public int field3171;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "I")
    private int field3176;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    public int field3179;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Lqj;")
    public static class296 field3147;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Lpn;")
    private class444 field3150;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "[I")
    public int[] field3165;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    public static final void method1465(byte arg0) {
        field3164++;
        class27.field432.method1249(1);
        int var1 = -93 % ((arg0 + 60) / 63);
        class299.field4141.method1249(1);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
    public static final void method1466(byte arg0) {
        field3159++;
        if (arg0 > -53) {
            field3157 = null;
        }
        class41.field615.method1249(1);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lpn;II)V")
    private final void method1467(class444 arg0, int arg1, int arg2) {
        field3158++;
        if (arg2 <= 40) {
            this.field3172 = null;
        }
        int var4 = arg1 >> 5;
        class444 var5 = this.field3172[var4];
        if (var5 == null) {
            this.field3175[var4] = arg0;
        } else {
            var5.field6415 = arg0;
        }
        this.field3172[var4] = arg0;
        arg0.field6416 = arg1;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public void method1217(int arg0) throws Exception {
        field3155++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BIIII)V")
    public static final void method1468(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3151++;
        if (arg0 != 80) {
            method1477(-68);
        }
        class158.field2239++;
        class442.field6400.method158((byte) 7, 75);
        class442.field6400.method2386(arg3, 19324);
        class442.field6400.method2438(61, arg2);
        class442.field6400.method2428(arg4, -70);
        class442.field6400.method2377(arg1, arg0 - 1530088376);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 >= class379.field5397 && arg6 <= class43.field659 && class379.field5397 <= arg3 && arg3 <= class43.field659 && arg8 >= class379.field5397 && class43.field659 >= arg8 && class379.field5397 <= arg7 && arg7 <= class43.field659 && arg9 >= class300.field4164 && class398.field5827 >= arg9 && arg2 >= class300.field4164 && class398.field5827 >= arg2 && class300.field4164 <= arg4 && arg4 <= class398.field5827 && arg5 >= class300.field4164 && class398.field5827 >= arg5) {
            class196.method1310(12138, arg2, arg6, arg8, arg0, arg4, arg9, arg7, arg5, arg3);
        } else {
            class280.method1717(arg9, arg6, arg5, (byte) -114, arg0, arg4, arg3, arg8, arg2, arg7);
        }
        field3166++;
        if (arg1 > -77) {
            method1465((byte) -84);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method1215(Component arg0) throws Exception {
        field3153++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([II)V")
    private final void method1470(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class31.field488) {
            var3 = arg1 << 1;
        }
        class150.method1020(arg0, 0, var3);
        this.field3174 -= arg1;
        if (this.field3150 != null && this.field3174 <= 0) {
            this.field3174 += class327.field4473 >> 4;
            class162.method1076((byte) -76, this.field3150);
            this.method1467(this.field3150, this.field3150.method674(), 115);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class444 var10 = null;
                        class444 var11 = this.field3175[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class203 var12 = var11.field6417;
                                if (var12 == null || var12.field2763 <= var8) {
                                    var11.field6414 = true;
                                    int var13 = var11.method208();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2763 += var13;
                                    }
                                    if (var4 >= this.field3170) {
                                        break label107;
                                    }
                                    class444 var14 = var11.method180();
                                    if (var14 != null) {
                                        int var15 = var11.field6416;
                                        while (var14 != null) {
                                            this.method1467(var14, var15 * var14.method674() >> 8, 81);
                                            var14 = var11.method179();
                                        }
                                    }
                                    class444 var16 = var11.field6415;
                                    var11.field6415 = null;
                                    if (var10 == null) {
                                        this.field3175[var7] = var16;
                                    } else {
                                        var10.field6415 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3172[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field6415;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class444 var18 = this.field3175[var17];
                this.field3175[var17] = this.field3172[var17] = null;
                while (var18 != null) {
                    class444 var19 = var18.field6415;
                    var18.field6415 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3174 < 0) {
            this.field3174 = 0;
        }
        if (this.field3150 != null) {
            this.field3150.method196(arg0, 0, arg1);
        }
        this.field3146 = class224.method1425(-26805);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    public static final void method1471(int arg0) {
        client.field2344 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class60.field850 = "clignotant3:";
        class23.field306 = " s'est déconnecté.";
        class220.field2898 = "Attaquer";
        class202.field2762 = "Variables du client chargées";
        class305.field4190 = "Caché";
        class146.field2119 = "Paramètres par défaut chargés";
        class423.field6091 = "Chargement de l'écran-titre - ";
        class191.field2659 = "Chargement des textures - ";
        class411.field5968 = "Chargement de la liste des serveurs";
        class129.field1814 = "Mémoire en cours d'attribution";
        class252.field3472 = "jaune:";
        class282.field3868 = "M";
        class312.field4311 = "Poser";
        class438.field6315 = "Atteindre";
        class65.field1030 = "niveau ";
        class406.field5903 = "ondulation2:";
        class436.field6255 = "Impossible de trouver ";
        class149.field2148 = "Regarder dans cette direction";
        class141.field2012 = "Monde de jeu créé";
        class448.field6466 = " de votre liste noire.";
        class435.field6249 = "brillant1:";
        class75.field1163 = "Chargement en cours. Veuillez patienter.";
        class13.field160 = "K";
        class199.field2744 = "Connexion perdue.";
        class356.field5010 = "Chargement de Mechscape en cours - veuillez patienter...";
        class341.field4770 = "Sélectionner";
        class54.field800 = "blanc:";
        class276.field3742 = "brillant3:";
        class107.field1585 = "clignotant1:";
        int var1 = -18 % ((arg0 - 57) / 35);
        class290.field4005 = "Gestionnaire de saisie chargé";
        class154.field2182 = " ";
        class309.field4239 = "Chargement des sprites - ";
        class83.field1274 = "Fermer";
        class366.field5133 = "classement ";
        class258.field3532 = "violet:";
        class24.field334 = "Module texte chargé";
        class401.field5852 = "clignotant2:";
        class367.field5151 = "Prendre";
        class390.field5739 = "cyan:";
        class259.field3550 = "Chargement de RuneScape en cours - veuillez patienter...";
        class398.field5826 = "glissement:";
        class155.field2193 = "Sprites chargés";
        field3169++;
        class409.field5942 = "Interfaces chargées";
        class234.field3184 = "Connecté au serveur de mise à jour";
        class189.field2620 = "Librairie 3D démarrée";
        class61.field929 = " est déjà dans votre liste noire.";
        class24.field328 = "Objet d'abonnés";
        class173.field2461 = "Jeter";
        class418.field6054 = " s'est connecté.";
        class323.field4429 = "Veuillez commencer par supprimer ";
        class97.field1478 = "Chargement des interfaces - ";
        class55.field807 = "Connexion au serveur de mise à jour en cours";
        class44.field678 = "Liste des mises à jour chargée";
        class45.field680 = "ondulation:";
        class144.field2093 = "Textures chargées";
        class84.field1294 = "brillant2:";
        class279.field3795 = "compétence ";
        class190.field2646 = "Examiner";
        class127.field1784 = "M";
        class189.field2622 = "Vérification des mises à jour - ";
        class118.field1694 = "Polices chargées";
        class448.field6451 = "Écran-titre chargé";
        class290.field4012 = "Écran-titre ouvert";
        class217.field2873 = "Continuer";
        class154.field2181 = "Chargement en cours...";
        class64.field998 = "rouge:";
        class300.field4161 = "Démarrage de la librairie 3D";
        class34.field537 = "Moteur son préparé";
        class75.field1166 = "OK";
        class109.field1606 = "Chargement du module texte - ";
        class379.field5396 = "Chargement des polices - ";
        class164.field2318 = "Veuillez patienter - tentative de rétablissement.";
        class448.field6482 = "Veuillez patienter...";
        class401.field5856 = "Votre liste noire est pleine (100 noms maximum).";
        class20.field273 = "tremblement:";
        class371.field5287 = "Mémoire attribuée";
        class99.field1514 = "Annuler";
        class373.field5323 = "Veuillez commencer par supprimer ";
        class129.field1798 = " autres options";
        class357.field5036 = "déroulement:";
        class366.field5125 = "vert:";
        class344.field4815 = "Choisir une option";
        class218.field2880 = "Chargement des fichiers config - ";
        class81.field1252 = "Chargement des paramètres par défaut - ";
        class259.field3547 = "Utiliser";
        class72.field1108 = "Liste des serveurs chargée";
        class266.field3634 = "Fichiers config chargés";
        class403.field5870 = "K";
        class294.field4065 = " est déjà dans votre liste d'amis.";
        class296.field4103 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class107.field1589 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class209.field2816 = " de votre liste d'amis.";
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    public final synchronized void method1472(int arg0) {
        field3152++;
        if (class209.field2821 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class209.field2821.field2534[var3] == this) {
                    class209.field2821.field2534[var3] = null;
                }
                if (class209.field2821.field2534[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class209.field2821.field2527 = true;
                while (class209.field2821.field2535) {
                    class4.method28(50L, arg0 - 101);
                }
                class209.field2821 = null;
            }
        }
        this.method1218();
        this.field3165 = null;
        if (arg0 != 0) {
            field3147 = null;
        }
        this.field3149 = true;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()V")
    public void method1218() {
        field3154++;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "()V")
    public void method1216() throws Exception {
        field3161++;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V")
    public final synchronized void method1473(byte arg0) {
        this.field3173 = true;
        if (arg0 != 117) {
            method1466((byte) 122);
        }
        field3148++;
        try {
            this.method1216();
        } catch (Exception var2) {
            this.method1218();
            this.field3181 = class224.method1425(-26805) + 2000L;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)V")
    private final void method1474(int arg0, byte arg1) {
        field3163++;
        this.field3174 -= arg0;
        if (this.field3174 < 0) {
            this.field3174 = 0;
        }
        if (this.field3150 != null) {
            this.field3150.method198(arg0);
        }
        if (arg1 != -70) {
            this.method1474(-119, (byte) 5);
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
    public final void method1475(int arg0) {
        this.field3173 = true;
        field3160++;
        if (arg0 != 923) {
            this.field3177 = 102;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLpn;)V")
    public final synchronized void method1476(byte arg0, class444 arg1) {
        this.field3150 = arg1;
        if (arg0 != 23) {
            this.method1476((byte) 6, (class444) null);
        }
        field3162++;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "()I")
    public int method1219() throws Exception {
        field3145++;
        return this.field3171;
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(I)V")
    public static void method1477(int arg0) {
        field3157 = null;
        field3147 = null;
        if (arg0 != 0) {
            field3157 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "()V")
    public void method1220() throws Exception {
        field3168++;
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "(I)V")
    public final synchronized void method1478(int arg0) {
        if (arg0 != 8) {
            method1466((byte) -115);
        }
        field3167++;
        if (this.field3149) {
            return;
        }
        long var2 = class224.method1425(-26805);
        try {
            if (this.field3146 + 500000L < var2) {
                this.field3146 = var2 - 500000L;
            }
            while (this.field3146 + 5000L < var2) {
                this.method1474(256, (byte) -70);
                this.field3146 += (long) (256000 / class327.field4473);
            }
        } catch (Exception var7) {
            this.field3146 = var2;
        }
        if (this.field3165 == null) {
            return;
        }
        try {
            if (this.field3181 != 0L) {
                if (var2 < this.field3181) {
                    return;
                }
                this.method1217(this.field3171);
                this.field3181 = 0L;
                this.field3173 = true;
            }
            int var4 = this.method1219();
            if ((this.field3180 - var4) > this.field3182) {
                this.field3182 = this.field3180 - var4;
            }
            int var5 = this.field3179 + this.field3176;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field3171) {
                this.field3171 += 1024;
                if (this.field3171 > 16384) {
                    this.field3171 = 16384;
                }
                this.method1218();
                var4 = 0;
                this.method1217(this.field3171);
                this.field3173 = true;
                if (var5 + 256 > this.field3171) {
                    var5 = this.field3171 - 256;
                    this.field3176 = var5 - this.field3179;
                }
            }
            while (var4 < var5) {
                this.method1470(this.field3165, 256);
                var4 += 256;
                this.method1220();
            }
            if (this.field3178 < var2) {
                if (this.field3173) {
                    this.field3173 = false;
                } else if (this.field3182 == 0 && this.field3177 == 0) {
                    this.method1218();
                    this.field3181 = var2 + 2000L;
                    return;
                } else {
                    this.field3176 = Math.min(this.field3177, this.field3182);
                    this.field3177 = this.field3182;
                }
                this.field3178 = var2 + 2000L;
                this.field3182 = 0;
            }
            this.field3180 = var4;
        } catch (Exception var6) {
            this.method1218();
            this.field3181 = var2 + 2000L;
        }
    }
}
