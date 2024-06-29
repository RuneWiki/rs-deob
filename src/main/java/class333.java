import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public abstract class class333 {

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "Z")
    public static boolean field5191;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "[[[B")
    public static byte[][][] field5199;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;II)I", line = 5)
    public static final int method2328(String arg0, int arg1, int arg2) {
        int var3 = 108 % ((arg2 - 23) / 47);
        field5197++;
        return class151.method1143((byte) -47, arg1, arg0, true);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)V", line = 24)
    public static final void method2329(int arg0, int arg1, int arg2) {
        if (arg1 >= -114) {
            return;
        }
        class154.field2330[arg0] = arg2;
        class300 var3 = (class300) class272.field4251.method1716(-1, (long) arg0);
        if (var3 == null) {
            class300 var4 = new class300(class105.method789((byte) 55) + 500L);
            class272.field4251.method1708((long) arg0, (byte) -79, var4);
        } else {
            var3.field4617 = class105.method789((byte) 55) + 500L;
        }
        field5193++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IBII)I", line = 45)
    public static final int method2330(int arg0, byte arg1, int arg2, int arg3) {
        field5200++;
        int var4 = class164.field2659[class113.method866(arg0, arg2)];
        if (arg3 > 0) {
            int var5 = class164.field2662.method665((byte) -53, arg3 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var7 = 256 - var5;
                    var4 = ((var4 & 0xFF00) * var7 + (var6 & 0xFF00) * var5 & 0xFF0000) + ((var4 & 0xFF00FF) * var7 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class164.field2662.method662((byte) -108, arg3 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 >> 16 & 0xFF) * var9;
                int var11 = (var4 >> 8 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var11 & 0xFF00) + (var12 >> 8) + (var10 << 8 & 0xFF00D0);
            }
        }
        if (arg1 != 69) {
            field5194 = 42;
        }
        return var4;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILwm;I)Ljava/lang/String;", line = 120)
    public static final String method2331(int arg0, class254 arg1, int arg2) {
        field5192++;
        try {
            int var3 = arg1.method1730(false);
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg1.field3866 += class318.field4918.method630(var4, (byte) -128, arg1.field3840, arg1.field3866, var3, 0);
            String var5 = class152.method1148(var4, var3, arg2 ^ 0xFFFFB11B, 0);
            return arg2 == -20165 ? var5 : (String) null;
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)V", line = 151)
    public static final void method2332(boolean arg0, int arg1) {
        if (arg0) {
            field5196++;
            class40.field586.method741(arg1, (byte) -29);
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V", line = 164)
    public static void method2333(int arg0) {
        if (arg0 != 65535) {
            field5199 = (byte[][][]) ((byte[][][]) null);
        }
        field5199 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V", line = 182)
    public static final void method2334(int arg0) {
        class21.field243 = "Chargement des interfaces - ";
        class102.field1473 = "Moteur son préparé";
        class133.field2032 = "Examiner";
        class32.field408 = "Liste des mises à jour chargée";
        class97.field1397 = "jaune:";
        class29.field354 = "Jeter";
        class240.field3668 = "Veuillez commencer par supprimer ";
        class169.field2737 = "Interfaces chargées";
        class51.field693 = "Prendre";
        class220.field3361 = "K";
        class76.field1112 = "Sélectionner";
        class201.field3092 = "Utiliser";
        class28.field337 = "OK";
        class268.field4161 = "clignotant3:";
        class228.field3471 = "Chargement du module texte - ";
        class229.field3492 = "voudrait faire un échange avec vous.";
        class41.field599 = "clignotant2:";
        class43.field613 = "Chargement de RuneScape en cours - veuillez patienter...";
        class233.field3543 = "Veuillez patienter...";
        class307.field4790 = "Polices chargées";
        class168.field2717 = " de votre liste d'amis.";
        class61.field808 = "Écran-titre chargé";
        class340.field5283 = " s'est déconnecté.";
        class34.field500 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class98.field1407 = "déroulement:";
        class121.field1864 = " est déjà dans votre liste noire.";
        class228.field3481 = "brillant3:";
        class214.field3296 = "compétence ";
        class243.field3692 = "Chargement de la liste des serveurs";
        class257.field3938 = "Veuillez patienter - tentative de rétablissement.";
        class331.field5105 = "Mémoire attribuée";
        class276.field4287 = "Chargement des polices - ";
        class178.field2832 = "Votre liste noire est pleine (100 noms maximum).";
        class172.field2774 = " de votre liste noire.";
        class62.field834 = "M";
        class260.field4002 = "classement ";
        class265.field4119 = " ";
        class118.field1842 = "Veuillez commencer par supprimer ";
        class62.field830 = "Chargement de l'écran-titre - ";
        class305.field4691 = "Connexion perdue.";
        class139.field2080 = " est déjà dans votre liste d'amis.";
        class144.field2207 = "Fichiers config chargés";
        class209.field3193 = "M";
        class332.field5153 = "ondulation2:";
        class237.field3603 = "tremblement:";
        class237.field3608 = " autres options";
        class62.field825 = "Mémoire en cours d'attribution";
        class21.field238 = "Chargement en cours...";
        class129.field1972 = "blanc:";
        class63.field835 = "niveau ";
        class284.field4426 = "cyan:";
        class211.field3236 = "K";
        class170.field2756 = "ondulation:";
        class293.field4521 = "Attaquer";
        class323.field4996 = "Chargement des sprites - ";
        class330.field5066 = " s'est connecté.";
        class166.field2692 = "Impossible de trouver ";
        class51.field690 = "Textures chargées";
        class60.field797 = "Connexion au serveur de mise à jour en cours";
        class130.field2002 = "Choisir une option";
        if (arg0 != 19177) {
            method2333(-120);
        }
        class323.field4999 = "violet:";
        class286.field4447 = "Chargement en cours. Veuillez patienter.";
        class328.field5060 = "Objet d'abonnés";
        class28.field317 = "Liste des serveurs chargée";
        class133.field2029 = "vert:";
        class273.field4256 = "Vérification des mises à jour - ";
        class206.field3165 = "Chargement des paramètres par défaut - ";
        class77.field1127 = "rouge:";
        class239.field3646 = "Annuler";
        class153.field2328 = "Librairie 3D démarrée";
        class108.field1569 = "Poser";
        class59.field780 = "Fermer";
        class3.field37 = "Atteindre";
        class335.field5219 = "brillant1:";
        class222.field3382 = "glissement:";
        class137.field2072 = "brillant2:";
        class205.field3151 = "Connecté au serveur de mise à jour";
        class16.field204 = "Chargement des textures - ";
        class83.field1216 = "Monde de jeu créé";
        class112.field1699 = "Regarder dans cette direction";
        class320.field4959 = "Écran-titre ouvert";
        class5.field75 = "Caché";
        class16.field206 = "Démarrage de la librairie 3D";
        class225.field3432 = "clignotant1:";
        class191.field2987 = "Module texte chargé";
        class278.field4319 = "Sprites chargés";
        class63.field853 = "Chargement des fichiers config - ";
        class153.field2326 = "Paramètres par défaut chargés";
        class240.field3672 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class201.field3073 = "Continuer";
        class339.field5269 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class300.field4624 = "Gestionnaire de saisie chargé";
        field5198++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
    public abstract void method191(int arg0);

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIB)I")
    public abstract int method190(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)J")
    public abstract long method193(byte arg0);
}
