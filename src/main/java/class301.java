import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class301 extends class105 {

    @OriginalMember(owner = "client!cn", name = "H", descriptor = "I")
    private int field4291;

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
    private int field4281;

    @OriginalMember(owner = "client!cn", name = "N", descriptor = "I")
    private int field4297;

    @OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
    private int field4288;

    @OriginalMember(owner = "client!cn", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field4298 = new String[100];

    @OriginalMember(owner = "client!cn", name = "P", descriptor = "I")
    public static int field4299 = 20;

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4285 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
    private int field4280;

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!cn", name = "x", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!cn", name = "y", descriptor = "I")
    private int field4284;

    @OriginalMember(owner = "client!cn", name = "A", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!cn", name = "G", descriptor = "I")
    private int field4290;

    @OriginalMember(owner = "client!cn", name = "I", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!cn", name = "J", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!cn", name = "K", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!cn", name = "L", descriptor = "I")
    private int field4295;

    @OriginalMember(owner = "client!cn", name = "M", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!cn", name = "F", descriptor = "[B")
    private byte[] field4289;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(I)V", line = 3)
    public static void method1899(int arg0) {
        field4285 = null;
        field4298 = null;
        if (arg0 < 72) {
            method1900(-115, -9, -93, -67, -29, -67, 15);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIII)V", line = 17)
    public static final void method1900(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4286++;
        int var7 = class115.method640((byte) -83, class407.field5914, arg4, class20.field209);
        int var8 = class115.method640((byte) -79, class407.field5914, arg3, class20.field209);
        int var9 = class115.method640((byte) -83, class128.field1785, arg5, class143.field2029);
        int var10 = -71 / ((-arg2 - 82) / 33);
        int var11 = class115.method640((byte) -95, class128.field1785, arg1, class143.field2029);
        int var12 = class115.method640((byte) -65, class407.field5914, arg4 + arg6, class20.field209);
        int var13 = class115.method640((byte) -66, class407.field5914, arg3 - arg6, class20.field209);
        for (int var14 = var7; var14 < var12; var14++) {
            class105.method564(arg0, var9, 0, class318.field4522[var14], var11);
        }
        for (int var15 = var8; var15 > var13; var15--) {
            class105.method564(arg0, var9, 0, class318.field4522[var15], var11);
        }
        int var16 = class115.method640((byte) -79, class128.field1785, arg5 + arg6, class143.field2029);
        int var17 = class115.method640((byte) -74, class128.field1785, arg1 - arg6, class143.field2029);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class318.field4522[var18];
            class105.method564(arg0, var9, 0, var19, var16);
            class105.method564(arg0, var17, 0, var19, var11);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 69)
    public final void method568(int arg0) {
        field4282++;
        this.field4290 = 0;
        this.field4295 = 0;
        if (arg0 != 82) {
            field4298 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(IIIIIFFF)V", line = 84)
    public class301(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4291 = (int) (arg7 * 4096.0F);
        this.field4281 = (int) (arg6 * 4096.0F);
        this.field4288 = this.field4297 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILbo;)I", line = 94)
    public static final int method1901(int arg0, class433 arg1) {
        field4283++;
        if (arg1.field6307 == 0) {
            return 0;
        }
        if (arg0 != 6) {
            method1903(-21);
        }
        if (arg1.field6334 != -1 && arg1.field6334 < 32768) {
            class358 var2 = class81.field917[arg1.field6334];
            if (var2 != null) {
                int var3 = arg1.field1304 - var2.field1304;
                int var4 = arg1.field1311 - var2.field1311;
                if (var3 != 0 || var4 != 0) {
                    arg1.method2691(false, (int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if (arg1.field6334 >= 32768) {
            int var5 = arg1.field6334 - 32768;
            if (class188.field2547 == var5) {
                var5 = 2047;
            }
            class133 var6 = class375.field5473[var5];
            if (var6 != null) {
                int var7 = arg1.field1304 - var6.field1304;
                int var8 = arg1.field1311 - var6.field1311;
                if (var7 != 0 || var8 != 0) {
                    arg1.method2691(false, (int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if ((arg1.field6292 != 0 || arg1.field6309 != 0) && (arg1.field6345 == 0 || arg1.field6339 > 0)) {
            int var9 = arg1.field1304 - ((arg1.field6292 - class40.field427 - class40.field427) * 64);
            int var10 = arg1.field1311 - (arg1.field6309 - class217.field2975 - class217.field2975) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.method2691(false, (int) (Math.atan2((double) var9, (double) var10) * 2607.5945876176133D) & 0x3FFF);
            }
            arg1.field6309 = 0;
            arg1.field6292 = 0;
        }
        return arg1.method2689(arg0 - 4);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIB)V", line = 172)
    public final void method570(int arg0, int arg1, byte arg2) {
        if (arg2 >= -66) {
            return;
        }
        field4287++;
        if (arg0 == 0) {
            this.field4280 = this.field4281 - (arg1 < 0 ? -arg1 : arg1);
            this.field4284 = 4096;
            this.field4280 = this.field4280 * this.field4280 >> 12;
            this.field4290 = this.field4280;
            return;
        }
        this.field4284 = this.field4291 * this.field4280 >> 12;
        if (this.field4284 < 0) {
            this.field4284 = 0;
        } else if (this.field4284 > 4096) {
            this.field4284 = 4096;
        }
        this.field4280 = this.field4281 - (arg1 < 0 ? -arg1 : arg1);
        this.field4280 = this.field4280 * this.field4280 >> 12;
        this.field4280 = this.field4284 * this.field4280 >> 12;
        this.field4290 += this.field4288 * this.field4280 >> 12;
        this.field4288 = this.field4297 * this.field4288 >> 12;
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V", line = 208)
    public final void method572(int arg0) {
        field4293++;
        this.field4290 >>= 0x4;
        this.field4288 = this.field4297;
        if (this.field4290 < 0) {
            this.field4290 = 0;
        } else if (this.field4290 > 255) {
            this.field4290 = 255;
        }
        this.method97(this.field4295++, (byte) this.field4290);
        this.field4290 = 0;
        if (arg0 < 42) {
            this.method570(-111, -11, (byte) 62);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)V", line = 232)
    public void method97(int arg0, byte arg1) {
        field4294++;
        this.field4289[arg0] = arg1;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)Ljava/lang/String;", line = 247)
    public static final String method1902(int arg0, int arg1, int arg2) {
        field4292++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else {
            int var4 = 50 / ((57 - arg1) / 45);
            if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "(I)V", line = 292)
    public static final void method1903(int arg0) {
        class12.field132 = " autres options";
        class291.field4201 = "brillant1:";
        class233.field3144 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class311.field4444 = "Textures chargées";
        class244.field3294 = "Chargement de la liste des serveurs";
        class420.field6043 = "Gestionnaire de saisie chargé";
        class20.field208 = "Variables du client chargées";
        class213.field2916 = "Fermer";
        class195.field2649 = "déroulement:";
        class436.field6387 = " est déjà dans votre liste noire.";
        class189.field2569 = "Votre liste noire est pleine (100 noms maximum).";
        class122.field1623 = "Impossible de trouver ";
        class88.field984 = "Librairie 3D démarrée";
        class335.field4956 = " de votre liste d'amis.";
        class448.field6541 = "Veuillez commencer par supprimer ";
        class291.field4175 = "Examiner";
        class73.field821 = " est déjà dans votre liste d'amis.";
        class364.field5298 = "tremblement:";
        class437.field6409 = "Connecté au serveur de mise à jour";
        class452.field6583 = "Annuler";
        class160.field2270 = "ondulation:";
        class417.field5995 = "Poser";
        class306.field4389 = "K";
        class348.field5084 = "Écran-titre chargé";
        class52.field596 = "Attaquer";
        class72.field810 = "Module texte chargé";
        class10.field121 = "Chargement de l'écran-titre - ";
        class188.field2552 = "OK";
        class50.field583 = "Mémoire en cours d'attribution";
        class171.field2394 = "Chargement de RuneScape en cours - veuillez patienter...";
        class144.field2033 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class376.field5498 = "Chargement des interfaces - ";
        class349.field5099 = "Jeter";
        class224.field3060 = "Mémoire attribuée";
        class388.field5684 = "rouge:";
        class63.field725 = "cyan:";
        class50.field571 = "M";
        class115.field1333 = "Connexion au serveur de mise à jour en cours";
        class191.field2598 = "K";
        class39.field411 = "Chargement des paramètres par défaut - ";
        class402.field5868 = "Connexion perdue.";
        class427.field6213 = "blanc:";
        class216.field2955 = "Paramètres par défaut chargés";
        class418.field6014 = " s'est déconnecté.";
        class271.field3841 = "clignotant2:";
        class8.field103 = " s'est connecté.";
        class35.field340 = "Veuillez patienter...";
        field4296++;
        class200.field2743 = "Moteur son préparé";
        class102.field1162 = "glissement:";
        class221.field3032 = "Polices chargées";
        class10.field114 = "Veuillez commencer par supprimer ";
        class359.field5245 = "Écran-titre ouvert";
        class251.field3397 = "Atteindre";
        class77.field863 = "Chargement des polices - ";
        class101.field1135 = "Vérification des mises à jour - ";
        class54.field614 = "Liste des mises à jour chargée";
        class189.field2576 = "Chargement en cours...";
        class326.field4582 = "Choisir une option";
        class206.field2807 = "classement ";
        class222.field3040 = "Chargement du module texte - ";
        class289.field4090 = "jaune:";
        int var1 = -111 / ((arg0 - 53) / 57);
        class281.field3948 = "Sélectionner";
        class34.field331 = "Monde de jeu créé";
        class427.field6209 = "brillant3:";
        class433.field6328 = "niveau ";
        class221.field3026 = "Chargement des sprites - ";
        class85.field964 = "brillant2:";
        class113.field1302 = "Interfaces chargées";
        class12.field133 = "ondulation2:";
        class21.field225 = " ";
        class193.field2641 = "Chargement des textures - ";
        class179.field2467 = "Utiliser";
        class155.field2217 = "Chargement des fichiers config - ";
        class150.field2098 = "clignotant1:";
        class98.field1101 = "M";
        class7.field95 = "Caché";
        class426.field6177 = "Veuillez patienter - tentative de rétablissement.";
        class166.field2343 = "compétence ";
        class171.field2399 = "Objet d'abonnés";
        class437.field6408 = "Regarder dans cette direction";
        class442.field6459 = "Démarrage de la librairie 3D";
        class407.field5907 = "Chargement en cours. Veuillez patienter.";
        class350.field5108 = "Prendre";
        class435.field6379 = "clignotant3:";
        class375.field5470 = "violet:";
        class323.field4556 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class358.field5232 = "Liste des serveurs chargée";
        class369.field5416 = "Fichiers config chargés";
        class179.field2470 = "Sprites chargés";
        class180.field2473 = "Chargement de Mechscape en cours - veuillez patienter...";
        class16.field166 = "Continuer";
        class422.field6059 = " de votre liste noire.";
        class245.field3321 = "vert:";
    }
}
